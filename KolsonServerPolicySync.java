package com.blackhub.bronline.neizzir;

import android.content.Context;
import com.google.common.base.Ascii;
import com.google.common.net.HttpHeaders;
import io.ktor.client.utils.CacheControl;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
public final class KolsonServerPolicySync {
    private static final int MAX_POLICY_BYTES = 262144;
    private static final byte[] POLICY_PUBLIC_KEY = {-4, 69, 74, -50, -61, -128, -95, 107, 109, -52, -68, -25, Ascii.DC4, 3, 106, -126, -17, 105, 9, -19, 10, 3, 98, -96, -103, -114, -72, 105, -76, 55, 74, 122};
    private static final String[] POLICY_URLS = {"https://cdn.kolson.online/servers.json", "https://cdnru.kolson.online/servers.json"};

    private KolsonServerPolicySync() {
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c9  */
    public static boolean sync(Context context) {
        if (context == null) {
            return false;
        }
        for (String policyUrl : POLICY_URLS) {
            byte[] policy = null;
            byte[] signature = null;
            try {
                policy = download(policyUrl, 262144, false);
                signature = download(policyUrl + ".sig", 64, true);
                if (policy == null || signature == null || signature.length != 64 || !verifyNative(policy, signature)) {
                    if (policy != null) {
                        Arrays.fill(policy, (byte) 0);
                    }
                    if (signature != null) {
                        Arrays.fill(signature, (byte) 0);
                    }
                } else {
                    File directory = new File(context.getFilesDir(), "NEIZZIR/policy");
                    if ((directory.isDirectory() || directory.mkdirs()) && directory.isDirectory()) {
                        File policyFile = new File(directory, "servers.json");
                        File signatureFile = new File(directory, "servers.json.sig");
                        File policyTemp = new File(directory, "servers.json.tmp");
                        File signatureTemp = new File(directory, "servers.json.sig.tmp");
                        if (writeSynced(policyTemp, policy) && writeSynced(signatureTemp, signature)) {
                            if (replace(signatureTemp, signatureFile) && replace(policyTemp, policyFile)) {
                                if (policy != null) {
                                    Arrays.fill(policy, (byte) 0);
                                }
                                if (signature != null) {
                                    Arrays.fill(signature, (byte) 0);
                                }
                                return true;
                            }
                            deleteQuietly(policyTemp);
                            deleteQuietly(signatureTemp);
                            if (policy != null) {
                                Arrays.fill(policy, (byte) 0);
                            }
                            if (signature != null) {
                                Arrays.fill(signature, (byte) 0);
                            }
                        } else {
                            deleteQuietly(policyTemp);
                            deleteQuietly(signatureTemp);
                            if (policy != null) {
                                Arrays.fill(policy, (byte) 0);
                            }
                            if (signature != null) {
                                Arrays.fill(signature, (byte) 0);
                            }
                        }
                    } else {
                        if (policy != null) {
                            Arrays.fill(policy, (byte) 0);
                        }
                        if (signature != null) {
                            Arrays.fill(signature, (byte) 0);
                        }
                    }
                }
            } catch (Throwable th) {
                if (policy != null) {
                    Arrays.fill(policy, (byte) 0);
                }
                if (signature != null) {
                    Arrays.fill(signature, (byte) 0);
                }
            }
        }
        return hasExistingPair(context);
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

    /* JADX WARN: Code duplicated, block: B:79:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static byte[] download(String value, int limit, boolean exactLimit) {
        HttpURLConnection connection = null;
        try {
            if (!isAllowedUrl(value)) {
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
            long contentLength = connection.getContentLengthLong();
            if (connection.getResponseCode() == 200 && contentLength <= limit && (!exactLimit || contentLength < 0 || contentLength == limit)) {
                InputStream input = connection.getInputStream();
                try {
                    ByteArrayOutputStream output = new ByteArrayOutputStream(Math.min(limit, 4096));
                    try {
                        byte[] buffer = new byte[4096];
                        while (true) {
                            int read = input.read(buffer);
                            if (read == -1) {
                                byte[] result = output.toByteArray();
                                if (result.length == 0 || (exactLimit && result.length != limit)) {
                                    output.close();
                                    if (input != null) {
                                        input.close();
                                    }
                                    if (connection != null) {
                                        connection.disconnect();
                                    }
                                    return null;
                                }
                                output.close();
                                if (input != null) {
                                    input.close();
                                }
                                if (connection != null) {
                                    connection.disconnect();
                                }
                                return result;
                            }
                            if (output.size() + read > limit) {
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

    private static boolean writeSynced(File file, byte[] value) {
        try {
            FileOutputStream output = new FileOutputStream(file, false);
            try {
                output.write(value);
                output.flush();
                output.getFD().sync();
                output.close();
                return true;
            } catch (Throwable th) {
                try {
                    output.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            return false;
        }
    }

    private static boolean replace(File source, File target) {
        try {
            if (target.exists() && !target.delete()) {
                return false;
            }
            return source.renameTo(target);
        } catch (Throwable th) {
            return false;
        }
    }

    private static boolean hasExistingPair(Context context) {
        File directory = new File(context.getFilesDir(), "NEIZZIR/policy");
        File policy = new File(directory, "servers.json");
        File signature = new File(directory, "servers.json.sig");
        return policy.isFile() && policy.length() > 0 && signature.isFile() && signature.length() == 64;
    }

    private static void deleteQuietly(File file) {
        try {
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable th) {
        }
    }

    private static boolean isAllowedUrl(String value) {
        try {
            URL url = new URL(value);
            String host = url.getHost().toLowerCase(Locale.US);
            String path = url.getPath();
            if (!"https".equalsIgnoreCase(url.getProtocol()) || url.getPort() != -1) {
                return false;
            }
            if (!"cdn.kolson.online".equals(host) && !"cdnru.kolson.online".equals(host)) {
                return false;
            }
            if (!"/servers.json".equals(path) && !"/servers.json.sig".equals(path)) {
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
}
