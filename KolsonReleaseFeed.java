package com.blackhub.bronline.neizzir;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.Base64;
import com.google.common.base.Ascii;
import com.google.common.net.HttpHeaders;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.ktor.client.utils.CacheControl;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
public final class KolsonReleaseFeed {
    private static final int AUTH_PROTO = 7;
    private static final int MAX_FEED_BYTES = 8192;
    private static final long MAX_FEED_LIFETIME_SEC = 3888000;
    private static final byte[] POLICY_PUBLIC_KEY = {-4, 69, 74, -50, -61, -128, -95, 107, 109, -52, -68, -25, Ascii.DC4, 3, 106, -126, -17, 105, 9, -19, 10, 3, 98, -96, -103, -114, -72, 105, -76, 55, 74, 122};
    private static final String PREFS = "kolson_release_v7";
    private static final String PREF_FEED = "feed";
    private static final String PREF_HIGHEST_BUILD = "highest_build";
    private static final String PREF_SIGNATURE = "signature";
    private static volatile byte[] expectedApkSha256;

    private KolsonReleaseFeed() {
    }

    public static String verifyAndConvert(String feedJson, String feedUrl, String apkUrl) {
        byte[] message = null;
        byte[] signature = null;
        if (feedJson != null) {
            try {
                if (!feedJson.isEmpty() && feedJson.getBytes(StandardCharsets.UTF_8).length <= 8192 && isAllowedUrl(feedUrl, "/launcher-release-v7.json") && isAllowedUrl(apkUrl, "/update.apk")) {
                    message = feedJson.getBytes(StandardCharsets.UTF_8);
                    signature = downloadExact(feedUrl + ".sig", 64);
                    if (signature != null && verifyNative(message, signature)) {
                        String verifiedFeed = parseVerifiedFeed(feedJson, signature, true);
                        if (message != null) {
                            Arrays.fill(message, (byte) 0);
                        }
                        if (signature != null) {
                            Arrays.fill(signature, (byte) 0);
                        }
                        return verifiedFeed;
                    }
                    if (message != null) {
                        Arrays.fill(message, (byte) 0);
                    }
                    if (signature != null) {
                        Arrays.fill(signature, (byte) 0);
                    }
                    return null;
                }
            } catch (Throwable th) {
                if (message != null) {
                    Arrays.fill(message, (byte) 0);
                }
                if (signature != null) {
                    Arrays.fill(signature, (byte) 0);
                }
                return null;
            }
        }
        if (0 != 0) {
            Arrays.fill((byte[]) null, (byte) 0);
        }
        if (0 != 0) {
            Arrays.fill((byte[]) null, (byte) 0);
        }
        return null;
    }

    public static boolean verifyDownloadedApk(File apk) {
        byte[] expected;
        try {
            if ((expectedApkSha256 != null || loadCachedFeed()) && (expected = expectedApkSha256) != null && expected.length == 32 && apk != null && apk.isFile() && apk.length() > 0) {
                MessageDigest digest = MessageDigest.getInstance("SHA-256");
                byte[] buffer = new byte[65536];
                try {
                    InputStream input = new FileInputStream(apk);
                    while (true) {
                        try {
                            int read = input.read(buffer);
                            if (read != -1) {
                                digest.update(buffer, 0, read);
                            } else {
                                input.close();
                                Arrays.fill(buffer, (byte) 0);
                                byte[] actual = digest.digest();
                                boolean valid = MessageDigest.isEqual(expected, actual);
                                Arrays.fill(actual, (byte) 0);
                                return valid;
                            }
                        } catch (Throwable th) {
                            try {
                                input.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                        Arrays.fill(buffer, (byte) 0);
                        throw th;
                    }
                } catch (Throwable th3) {
                    Arrays.fill(buffer, (byte) 0);
                    throw th3;
                }
            }
            return false;
        } catch (Throwable th4) {
            return false;
        }
    }

    private static String parseVerifiedFeed(String feedJson, byte[] signature, boolean persist) {
        byte[] hash;
        try {
            JSONObject feed = new JSONObject(feedJson);
            long securityBuildId = requiredLong(feed, "securityBuildId");
            long minimumBuildId = requiredLong(feed, "minimumSecurityBuildId");
            long publishedAt = requiredLong(feed, "publishedAt");
            long expiresAt = requiredLong(feed, "expiresAt");
            long authProto = requiredLong(feed, "authProto");
            long versionCode = requiredLong(feed, "versionCode");
            String versionName = requiredString(feed, "versionName");
            String apkShaHex = requiredString(feed, "apkSha256").toLowerCase(Locale.US);
            String downloadUrl = requiredString(feed, "downloadUrl");
            long now = System.currentTimeMillis() / 1000;
            Context context = currentApplicationContext();
            if (context == null || authProto != 7) {
                return null;
            }
            if (securityBuildId > 0 && minimumBuildId > 0 && minimumBuildId <= securityBuildId && publishedAt > 0 && publishedAt <= now + 300 && expiresAt > now && expiresAt > publishedAt && expiresAt - publishedAt <= MAX_FEED_LIFETIME_SEC) {
                if (isHexSha256(apkShaHex) && isAllowedUrl(downloadUrl, "/update.apk")) {
                    if (!matchesInstalledAndroidVersion(context, versionCode, versionName)) {
                        return null;
                    }
                    long localBuildId = readLocalSecurityBuildId(context);
                    if (localBuildId <= 0) {
                        return null;
                    }
                    SharedPreferences prefs = context.getSharedPreferences(PREFS, 0);
                    long highestBuild = Math.max(localBuildId, prefs.getLong(PREF_HIGHEST_BUILD, 0L));
                    if (securityBuildId >= highestBuild && (hash = hexToBytes(apkShaHex)) != null && hash.length == 32) {
                        byte[] old = expectedApkSha256;
                        expectedApkSha256 = hash;
                        if (old != null) {
                            Arrays.fill(old, (byte) 0);
                        }
                        if (persist) {
                            try {
                                prefs.edit().putString(PREF_FEED, feedJson).putString(PREF_SIGNATURE, Base64.encodeToString(signature, 2)).putLong(PREF_HIGHEST_BUILD, Math.max(highestBuild, securityBuildId)).apply();
                            } catch (Throwable th) {
                                return null;
                            }
                        }
                        return Long.toString(securityBuildId) + "\n" + (minimumBuildId > localBuildId ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
                    }
                    return null;
                }
                return null;
            }
            return null;
        } catch (Throwable th2) {
            return null;
        }
    }

    private static boolean loadCachedFeed() {
        byte[] message = null;
        byte[] signature = null;
        try {
            Context context = currentApplicationContext();
            if (context == null) {
                if (0 != 0) {
                    Arrays.fill((byte[]) null, (byte) 0);
                }
                if (0 != 0) {
                    Arrays.fill((byte[]) null, (byte) 0);
                }
                return false;
            }
            SharedPreferences prefs = context.getSharedPreferences(PREFS, 0);
            String json = prefs.getString(PREF_FEED, "");
            String encodedSignature = prefs.getString(PREF_SIGNATURE, "");
            if (json != null && !json.isEmpty() && encodedSignature != null && !encodedSignature.isEmpty()) {
                message = json.getBytes(StandardCharsets.UTF_8);
                signature = Base64.decode(encodedSignature, 0);
                boolean z = message.length <= 8192 && signature.length == 64 && verifyNative(message, signature) && parseVerifiedFeed(json, signature, false) != null;
                if (message != null) {
                    Arrays.fill(message, (byte) 0);
                }
                if (signature != null) {
                    Arrays.fill(signature, (byte) 0);
                }
                return z;
            }
            if (0 != 0) {
                Arrays.fill((byte[]) null, (byte) 0);
            }
            if (0 != 0) {
                Arrays.fill((byte[]) null, (byte) 0);
            }
            return false;
        } catch (Throwable th) {
            if (message != null) {
                Arrays.fill(message, (byte) 0);
            }
            if (signature != null) {
                Arrays.fill(signature, (byte) 0);
            }
            return false;
        }
    }

    private static boolean verifyNative(byte[] message, byte[] signature) {
        try {
            return KolsonLibrary.verifyEd25519(POLICY_PUBLIC_KEY, signature, message);
        } catch (UnsatisfiedLinkError e) {
            try {
                System.loadLibrary("kolson");
                return KolsonLibrary.verifyEd25519(POLICY_PUBLIC_KEY, signature, message);
            } catch (Throwable th) {
                return false;
            }
        } catch (Throwable th2) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static byte[] downloadExact(String value, int expectedLength) {
        HttpURLConnection connection = null;
        try {
            if (!isAllowedUrl(value, "/launcher-release-v7.json.sig")) {
                if (0 != 0) {
                    connection.disconnect();
                }
                return null;
            }
            connection = (HttpURLConnection) new URL(value).openConnection();
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(false);
            connection.setRequestProperty(HttpHeaders.CACHE_CONTROL, CacheControl.NO_CACHE);
            if (connection.getResponseCode() == 200 && connection.getContentLengthLong() <= expectedLength) {
                InputStream input = connection.getInputStream();
                try {
                    ByteArrayOutputStream output = new ByteArrayOutputStream(expectedLength);
                    try {
                        byte[] buffer = new byte[128];
                        while (true) {
                            int read = input.read(buffer);
                            if (read == -1) {
                                byte[] result = output.toByteArray();
                                byte[] bArr = result.length == expectedLength ? result : null;
                                output.close();
                                if (input != null) {
                                    input.close();
                                }
                                if (connection != null) {
                                    connection.disconnect();
                                }
                                return bArr;
                            }
                            if (output.size() + read > expectedLength) {
                                output.close();
                                if (input != null) {
                                    input.close();
                                }
                                if (connection != null) {
                                    connection.disconnect();
                                }
                                return null;
                            }
                            output.write(buffer, 0, read);
                            if (input != null) {
                                try {
                                    input.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            output.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    if (input != null) {
                        input.close();
                    }
                    throw th4;
                }
            }
            if (connection != null) {
                connection.disconnect();
            }
            return null;
        } catch (Throwable th5) {
            if (connection != null) {
                connection.disconnect();
            }
            return null;
        }
    }

    private static boolean matchesInstalledAndroidVersion(Context context, long wantedVersionCode, String wantedVersionName) {
        try {
            PackageInfo info = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            long actualCode = Build.VERSION.SDK_INT >= 28 ? info.getLongVersionCode() : info.versionCode;
            return actualCode == wantedVersionCode && wantedVersionName.equals(info.versionName);
        } catch (Throwable th) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static long readLocalSecurityBuildId(Context context) {
        try {
            int resourceId = context.getResources().getIdentifier("version", "raw", context.getPackageName());
            if (resourceId == 0) {
                return 0L;
            }
            InputStream input = context.getResources().openRawResource(resourceId);
            try {
                ByteArrayOutputStream output = new ByteArrayOutputStream(32);
                try {
                    byte[] buffer = new byte[32];
                    while (true) {
                        int read = input.read(buffer);
                        if (read != -1) {
                            if (output.size() + read <= 64) {
                                output.write(buffer, 0, read);
                            } else {
                                output.close();
                                if (input != null) {
                                    input.close();
                                }
                                return 0L;
                            }
                        } else {
                            String raw = new String(output.toByteArray(), StandardCharsets.US_ASCII).trim();
                            if (!raw.isEmpty() && raw.length() <= 10) {
                                long j = Long.parseLong(raw);
                                output.close();
                                if (input != null) {
                                    input.close();
                                }
                                return j;
                            }
                            output.close();
                            if (input != null) {
                                input.close();
                            }
                            return 0L;
                        }
                        if (input != null) {
                            try {
                                input.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        output.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (input != null) {
                    input.close();
                }
                throw th4;
            }
        } catch (Throwable th5) {
            return 0L;
        }
    }

    private static Context currentApplicationContext() {
        try {
            Class<?> activityThread = Class.forName("android.app.ActivityThread");
            Object application = activityThread.getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            if (application instanceof Application) {
                return ((Application) application).getApplicationContext();
            }
        } catch (Throwable th) {
        }
        return null;
    }

    private static boolean isAllowedUrl(String value, String wantedPath) {
        try {
            URL url = new URL(value);
            String host = url.getHost().toLowerCase(Locale.US);
            if (!"https".equalsIgnoreCase(url.getProtocol()) || url.getPort() != -1) {
                return false;
            }
            if ((!"cdn.kolson.online".equals(host) && !"cdnru.kolson.online".equals(host)) || !wantedPath.equals(url.getPath())) {
                return false;
            }
            if (url.getQuery() == null || url.getQuery().isEmpty()) {
                return url.getRef() == null || url.getRef().isEmpty();
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    private static long requiredLong(JSONObject object, String name) throws Exception {
        Object value = object.get(name);
        if (!(value instanceof Number)) {
            throw new IllegalArgumentException(name);
        }
        return ((Number) value).longValue();
    }

    private static String requiredString(JSONObject object, String name) throws Exception {
        Object value = object.get(name);
        if (!(value instanceof String)) {
            throw new IllegalArgumentException(name);
        }
        return (String) value;
    }

    private static boolean isHexSha256(String value) {
        if (value == null || value.length() != 64) {
            return false;
        }
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if ((c < '0' || c > '9') && (c < 'a' || c > 'f')) {
                return false;
            }
        }
        return true;
    }

    private static byte[] hexToBytes(String value) {
        if (!isHexSha256(value)) {
            return null;
        }
        byte[] out = new byte[32];
        for (int i = 0; i < out.length; i++) {
            out[i] = (byte) ((Character.digit(value.charAt(i * 2), 16) << 4) | Character.digit(value.charAt((i * 2) + 1), 16));
        }
        return out;
    }
}
