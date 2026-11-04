package com.blackhub.bronline.neizzir;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.StrongBoxUnavailableException;
import android.util.Log;
import android.widget.Toast;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.firestore.BuildConfig;
import io.ktor.sse.ServerSentEventKt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.NamedParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.p040io.encoding.Base64;

/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
public final class KolsonTlsBridge {
    private static final String DIAGNOSTIC_TAG = "KolsonAuth";
    private static final long EPHEMERAL_TTL_MS = 30000;
    private static final String EU_HOST = "162.19.254.18";
    private static final int OFFSET_AEAD_P256 = 2;
    private static final int OFFSET_AEAD_X25519 = 1;
    private static final int OFFSET_PUBLIC_SIZE = 65;
    private static final String RU_HOST = "85.193.87.60";
    private static volatile Boolean cachedEmulatorHint;
    private static volatile boolean diagnosticLoggingEnabled;
    private static final byte[] RU_SPKI_SHA256 = {127, -90, -64, -58, 44, -99, 94, 6, 110, -113, -36, -94, 117, -81, -76, -10, -71, -109, 19, -89, 78, -108, -10, Ascii.f1078US, 98, -122, 113, 5, Ascii.f1075SI, 59, 84, -62};
    private static final byte[] EU_SPKI_SHA256 = {-46, Ascii.f1070GS, 117, 97, Ascii.DLE, 87, 122, Ascii.f1078US, -116, 65, -5, -81, -112, -7, -47, -46, -53, 48, -52, -23, Ascii.f1074RS, -16, 92, 65, 63, -108, -72, 126, SignedBytes.MAX_POWER_OF_TWO, -64, -126, 112};
    private static final AtomicInteger NEXT_HANDLE = new AtomicInteger(1);
    private static final ConcurrentHashMap<Integer, Session> SESSIONS = new ConcurrentHashMap<>();
    private static final AtomicInteger NEXT_EPHEMERAL_HANDLE = new AtomicInteger(1);
    private static final ConcurrentHashMap<Integer, EphemeralAgreement> EPHEMERAL_KEYS = new ConcurrentHashMap<>();
    private static final byte[] X25519_SPKI_PREFIX = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};
    private static final byte[] P256_SPKI_PREFIX = {48, 89, 48, 19, 6, 7, 42, -122, 72, -50, Base64.padSymbol, 2, 1, 6, 8, 42, -122, 72, -50, Base64.padSymbol, 3, 1, 7, 3, 66, 0};

    private KolsonTlsBridge() {
    }

    public static void setDiagnosticLoggingEnabled(boolean enabled) {
        diagnosticLoggingEnabled = enabled;
        if (enabled) {
            Log.i(DIAGNOSTIC_TAG, "java diagnostic logging enabled");
        }
    }

    private static void diagnostic(String message) {
        if (diagnosticLoggingEnabled) {
            Log.e(DIAGNOSTIC_TAG, message);
        }
    }

    private static void diagnosticFailure(String stage, Throwable error) {
        if (diagnosticLoggingEnabled) {
            Log.e(DIAGNOSTIC_TAG, stage + " failed exception=" + (error == null ? "unknown" : error.getClass().getName()));
        }
    }

    public static boolean installServerPolicy() {
        byte[] policy = null;
        byte[] signature = null;
        File policyTemp = null;
        File signatureTemp = null;
        try {
            Context context = currentApplicationContext();
            if (context == null) {
                if (0 != 0) {
                    Arrays.fill((byte[]) null, (byte) 0);
                }
                if (0 != 0) {
                    Arrays.fill((byte[]) null, (byte) 0);
                }
                if (0 != 0 && policyTemp.exists()) {
                    policyTemp.delete();
                }
                if (0 != 0 && signatureTemp.exists()) {
                    signatureTemp.delete();
                }
                return false;
            }
            policy = readAsset(context, "kolson/servers.json", 262144);
            signature = readAsset(context, "kolson/servers.json.sig", 64);
            if (policy != null && policy.length != 0 && signature != null && signature.length == 64) {
                File directory = new File(context.getFilesDir(), "NEIZZIR/policy");
                if ((!directory.isDirectory() && !directory.mkdirs()) || !directory.isDirectory()) {
                    if (policy != null) {
                        Arrays.fill(policy, (byte) 0);
                    }
                    if (signature != null) {
                        Arrays.fill(signature, (byte) 0);
                    }
                    if (0 != 0 && policyTemp.exists()) {
                        policyTemp.delete();
                    }
                    if (0 != 0 && signatureTemp.exists()) {
                        signatureTemp.delete();
                    }
                    return false;
                }
                File policyTarget = new File(directory, "servers.json");
                File signatureTarget = new File(directory, "servers.json.sig");
                policyTemp = new File(directory, "servers.json.kolson.tmp");
                signatureTemp = new File(directory, "servers.json.sig.kolson.tmp");
                writeSyncedFile(signatureTemp, signature);
                writeSyncedFile(policyTemp, policy);
                if (!signatureTemp.renameTo(signatureTarget)) {
                    if (policy != null) {
                        Arrays.fill(policy, (byte) 0);
                    }
                    if (signature != null) {
                        Arrays.fill(signature, (byte) 0);
                    }
                    if (policyTemp.exists()) {
                        policyTemp.delete();
                    }
                    if (signatureTemp.exists()) {
                        signatureTemp.delete();
                    }
                    return false;
                }
                if (!policyTemp.renameTo(policyTarget)) {
                    if (policy != null) {
                        Arrays.fill(policy, (byte) 0);
                    }
                    if (signature != null) {
                        Arrays.fill(signature, (byte) 0);
                    }
                    if (policyTemp.exists()) {
                        policyTemp.delete();
                    }
                    if (signatureTemp.exists()) {
                        signatureTemp.delete();
                    }
                    return false;
                }
                if (policy != null) {
                    Arrays.fill(policy, (byte) 0);
                }
                if (signature != null) {
                    Arrays.fill(signature, (byte) 0);
                }
                if (policyTemp.exists()) {
                    policyTemp.delete();
                }
                if (!signatureTemp.exists()) {
                    return true;
                }
                signatureTemp.delete();
                return true;
            }
            if (policy != null) {
                Arrays.fill(policy, (byte) 0);
            }
            if (signature != null) {
                Arrays.fill(signature, (byte) 0);
            }
            if (0 != 0 && policyTemp.exists()) {
                policyTemp.delete();
            }
            if (0 != 0 && signatureTemp.exists()) {
                signatureTemp.delete();
            }
            return false;
        } catch (Throwable th) {
            if (policy != null) {
                Arrays.fill(policy, (byte) 0);
            }
            if (signature != null) {
                Arrays.fill(signature, (byte) 0);
            }
            if (policyTemp != null && policyTemp.exists()) {
                policyTemp.delete();
            }
            if (signatureTemp != null && signatureTemp.exists()) {
                signatureTemp.delete();
            }
            return false;
        }
    }

    public static int open(String host, int port, int timeoutMs) {
        long started = SystemClock.elapsedRealtime();
        diagnostic("tls open host=" + host + " port=" + port + " timeoutMs=" + timeoutMs);
        try {
            byte[] expectedPin = pinForHost(host);
            if (expectedPin == null) {
                return 0;
            }
            SSLContext context = SSLContext.getInstance("TLS");
            context.init(null, new TrustManager[]{new PinOnlyTrustManager(expectedPin)}, new SecureRandom());
            SSLSocket socket = (SSLSocket) context.getSocketFactory().createSocket();
            socket.setSoTimeout(timeoutMs);
            socket.connect(new InetSocketAddress(host, port), timeoutMs);
            socket.setEnabledProtocols(selectProtocols(socket));
            socket.startHandshake();
            Certificate[] certs = socket.getSession().getPeerCertificates();
            if (certs == null || certs.length == 0) {
                closeQuietly(socket);
                return 0;
            }
            byte[] spki = certs[0].getPublicKey().getEncoded();
            byte[] actualPin = MessageDigest.getInstance("SHA-256").digest(spki);
            if (!constantTimeEquals(actualPin, expectedPin)) {
                closeQuietly(socket);
                return 0;
            }
            int handle = NEXT_HANDLE.getAndIncrement();
            if (handle <= 0) {
                NEXT_HANDLE.set(1);
                handle = NEXT_HANDLE.getAndIncrement();
            }
            SESSIONS.put(Integer.valueOf(handle), new Session(socket, socket.getInputStream(), socket.getOutputStream()));
            diagnostic("tls ready host=" + host + " port=" + port + " elapsedMs=" + (SystemClock.elapsedRealtime() - started));
            return handle;
        } catch (Throwable ignored) {
            diagnosticFailure("tls open host=" + host + " port=" + port + " elapsedMs=" + (SystemClock.elapsedRealtime() - started), ignored);
            closeQuietly(null);
            return 0;
        }
    }

    public static boolean writeExact(int handle, byte[] data, int offset, int length) {
        Session session = SESSIONS.get(Integer.valueOf(handle));
        if (session == null || data == null || offset < 0 || length < 0 || offset + length > data.length) {
            return false;
        }
        try {
            session.out.write(data, offset, length);
            session.out.flush();
            return true;
        } catch (Throwable th) {
            close(handle);
            return false;
        }
    }

    public static boolean readExact(int handle, byte[] data, int length) {
        Session session = SESSIONS.get(Integer.valueOf(handle));
        if (session == null || data == null || length < 0 || length > data.length) {
            return false;
        }
        int read = 0;
        while (read < length) {
            try {
                int n = session.f786in.read(data, read, length - read);
                if (n <= 0) {
                    close(handle);
                    return false;
                }
                read += n;
            } catch (Throwable th) {
                close(handle);
                return false;
            }
        }
        return true;
    }

    public static void close(int handle) {
        Session session = SESSIONS.remove(Integer.valueOf(handle));
        if (session != null) {
            closeQuietly(session.socket);
        }
    }

    public static byte[] createAttestedKey(String alias, byte[] challenge) {
        if (alias == null || alias.length() < 8 || alias.length() > 96 || challenge == null) {
            return null;
        }
        if (challenge.length != 32) {
            return null;
        }
        try {
            KeyStore store = KeyStore.getInstance("AndroidKeyStore");
            store.load(null);
            boolean emulator = isProbablyEmulator();
            boolean generated = false;
            boolean reusedExisting = false;
            boolean aliasExisted = store.containsAlias(alias);
            diagnostic("attested key begin aliasExisted=" + aliasExisted + " emulator=" + emulator);
            int length = 0;
            if (aliasExisted) {
                PrivateKey existingKey = (PrivateKey) store.getKey(alias, null);
                Certificate existingCertificate = store.getCertificate(alias);
                boolean generated2 = existingKey != null && existingCertificate != null && "EC".equalsIgnoreCase(existingKey.getAlgorithm()) && "EC".equalsIgnoreCase(existingCertificate.getPublicKey().getAlgorithm());
                if (generated2 && emulator) {
                    Certificate[] existingChain = store.getCertificateChain(alias);
                    boolean generated3 = existingChain != null && existingChain.length == 1;
                    generated = generated3;
                } else {
                    generated = generated2;
                }
                reusedExisting = generated;
                if (!generated) {
                    store.deleteEntry(alias);
                }
            }
            if (!generated && emulator) {
                generateSoftwareSigningKey(alias);
                generated = true;
                diagnostic("attested key generated level=software");
            }
            if (!generated && !emulator && Build.VERSION.SDK_INT >= 28) {
                try {
                    generateAttestedKey(alias, challenge, true);
                    generated = true;
                    diagnostic("attested key generated level=strongbox");
                } catch (StrongBoxUnavailableException ignored) {
                    diagnosticFailure("attested key strongbox", ignored);
                } catch (Throwable ignored2) {
                    diagnosticFailure("attested key strongbox", ignored2);
                }
            }
            if (!generated && !emulator) {
                if (store.containsAlias(alias)) {
                    store.deleteEntry(alias);
                }
                try {
                    generateAttestedKey(alias, challenge, false);
                    diagnostic("attested key generated level=tee");
                } catch (Throwable ignored3) {
                    diagnosticFailure("attested key tee", ignored3);
                    if (store.containsAlias(alias)) {
                        store.deleteEntry(alias);
                    }
                    generateSoftwareSigningKey(alias);
                    diagnostic("attested key generated level=software-risk");
                }
            }
            Certificate[] chain = store.getCertificateChain(alias);
            if ((chain == null || chain.length < 1) && emulator) {
                if (store.containsAlias(alias)) {
                    store.deleteEntry(alias);
                }
                generateSoftwareSigningKey(alias);
                chain = store.getCertificateChain(alias);
            }
            if (chain != null && chain.length >= 1 && chain.length <= 12) {
                diagnostic("attested key ready aliasReused=" + reusedExisting + " chainCount=" + chain.length);
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                DataOutputStream out = new DataOutputStream(bytes);
                out.writeShort(chain.length);
                int total = 2;
                int length2 = chain.length;
                while (length < length2) {
                    Certificate certificate = chain[length];
                    byte[] der = certificate.getEncoded();
                    if (der.length != 0 && der.length <= 8192 && total + 2 + der.length <= 16384) {
                        out.writeShort(der.length);
                        out.write(der);
                        total += der.length + 2;
                        length++;
                    }
                    store.deleteEntry(alias);
                    return null;
                }
                out.flush();
                return bytes.toByteArray();
            }
            StringBuilder sbAppend = new StringBuilder().append("attested key rejected chainCount=");
            if (chain != null) {
                length = chain.length;
            }
            diagnostic(sbAppend.append(length).toString());
            store.deleteEntry(alias);
            return null;
        } catch (Throwable ignored4) {
            diagnosticFailure("attested key", ignored4);
            return null;
        }
    }

    public static byte[] createSoftwareAttestedKey(String alias, byte[] challenge) {
        if (alias == null || alias.length() < 8 || alias.length() > 96 || challenge == null || challenge.length != 32) {
            return null;
        }
        try {
            KeyStore store = KeyStore.getInstance("AndroidKeyStore");
            store.load(null);
            if (store.containsAlias(alias)) {
                store.deleteEntry(alias);
            }
            generateSoftwareSigningKey(alias);
            diagnostic("attested key forced level=software-compat");
            return createAttestedKey(alias, challenge);
        } catch (Throwable error) {
            diagnosticFailure("software compatibility key", error);
            return null;
        }
    }

    public static int getDevicePostureFlags() {
        int flags = isProbablyEmulator() ? 0 | 4 : 0;
        String tags = safeLower(Build.TAGS);
        if (tags.contains("test-keys") || tags.contains("dev-keys")) {
            flags |= 2;
        }
        String[] rootMarkers = {"/system/bin/su", "/system/xbin/su", "/sbin/su", "/su/bin/su", "/data/adb/magisk", "/data/adb/modules", "/system/app/Superuser.apk", "/system/app/Magisk.apk"};
        for (String marker : rootMarkers) {
            try {
                if (new File(marker).exists()) {
                    flags |= 1;
                    break;
                }
            } catch (Throwable th) {
            }
        }
        diagnostic("device posture mask=" + flags);
        return flags;
    }

    public static byte[] getAttestedKeyId(String alias) {
        if (alias == null || alias.length() < 8 || alias.length() > 96) {
            return null;
        }
        try {
            KeyStore store = KeyStore.getInstance("AndroidKeyStore");
            store.load(null);
            Certificate certificate = store.getCertificate(alias);
            PrivateKey key = (PrivateKey) store.getKey(alias, null);
            if (certificate != null && key != null && "EC".equalsIgnoreCase(certificate.getPublicKey().getAlgorithm()) && "EC".equalsIgnoreCase(key.getAlgorithm())) {
                byte[] keyId = MessageDigest.getInstance("SHA-256").digest(certificate.getPublicKey().getEncoded());
                diagnostic("attested key id available aliasExisted=true");
                return keyId;
            }
            return null;
        } catch (Throwable error) {
            diagnosticFailure("attested key id", error);
            return null;
        }
    }

    public static boolean deleteAttestedKey(String alias) {
        if (alias == null || alias.length() < 8 || alias.length() > 96) {
            return false;
        }
        try {
            KeyStore store = KeyStore.getInstance("AndroidKeyStore");
            store.load(null);
            if (store.containsAlias(alias)) {
                store.deleteEntry(alias);
            }
            diagnostic("attested key reset completed");
            return true;
        } catch (Throwable error) {
            diagnosticFailure("attested key reset", error);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x016d  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ce  */
    public static boolean isProbablyEmulator() {
        boolean x86Abi;
        boolean x86Abi2;
        String combined;
        boolean knownDesktopEmulator;
        boolean emulatorFile;
        Boolean cached = cachedEmulatorHint;
        if (cached != null) {
            return cached.booleanValue();
        }
        String fingerprint = safeLower(Build.FINGERPRINT);
        String model = safeLower(Build.MODEL);
        String manufacturer = safeLower(Build.MANUFACTURER);
        String brand = safeLower(Build.BRAND);
        String device = safeLower(Build.DEVICE);
        String product = safeLower(Build.PRODUCT);
        String hardware = safeLower(Build.HARDWARE);
        String board = safeLower(Build.BOARD);
        String host = safeLower(Build.HOST);
        String systemHints = safeSystemProperty("ro.kernel.qemu") + ServerSentEventKt.SPACE + safeSystemProperty("ro.hardware") + ServerSentEventKt.SPACE + safeSystemProperty("ro.nemu.version") + ServerSentEventKt.SPACE + safeSystemProperty("ro.mumu.version") + ServerSentEventKt.SPACE + safeSystemProperty("ro.build.flavor");
        boolean x86Abi3 = false;
        if (Build.SUPPORTED_ABIS == null) {
            x86Abi = false;
        } else {
            String[] strArr = Build.SUPPORTED_ABIS;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    String abi = strArr[i];
                    boolean x86Abi4 = x86Abi3;
                    String[] strArr2 = strArr;
                    if (!safeLower(abi).contains("x86")) {
                        i++;
                        x86Abi3 = x86Abi4;
                        strArr = strArr2;
                    } else {
                        x86Abi2 = true;
                        break;
                    }
                } else {
                    x86Abi = x86Abi3;
                }
            }
            combined = fingerprint + ServerSentEventKt.SPACE + model + ServerSentEventKt.SPACE + manufacturer + ServerSentEventKt.SPACE + brand + ServerSentEventKt.SPACE + device + ServerSentEventKt.SPACE + product + ServerSentEventKt.SPACE + hardware + ServerSentEventKt.SPACE + board + ServerSentEventKt.SPACE + host + ServerSentEventKt.SPACE + systemHints;
            if (!combined.contains("mumu") || combined.contains("nemu") || combined.contains("netease") || combined.contains("microvirt") || combined.contains("nox") || combined.contains("ldplayer") || combined.contains("leidian") || combined.contains("bluestacks") || combined.contains("vbox") || combined.contains("ttvm")) {
                knownDesktopEmulator = true;
            } else {
                knownDesktopEmulator = false;
            }
            if (!new File("/system/bin/nemuVM-prop").exists() || new File("/system/bin/microvirt-prop").exists() || new File("/system/bin/microvirtd").exists() || new File("/system/bin/mumud").exists() || new File("/dev/qemu_pipe").exists() || new File("/dev/socket/qemud").exists() || new File("/system/lib64/libhoudini.so").exists()) {
                emulatorFile = true;
            } else {
                emulatorFile = false;
            }
            boolean result = !knownDesktopEmulator || emulatorFile || "1".equals(safeSystemProperty("ro.kernel.qemu")) || fingerprint.startsWith("generic") || fingerprint.contains(BuildConfig.TARGET_BACKEND) || fingerprint.contains("vbox") || model.contains("google_sdk") || model.contains(BuildConfig.TARGET_BACKEND) || model.contains("android sdk built for") || model.contains("sdk_gphone") || manufacturer.contains("genymotion") || product.contains("sdk") || product.contains(BuildConfig.TARGET_BACKEND) || product.contains("simulator") || product.contains("vbox") || hardware.contains("goldfish") || hardware.contains("ranchu") || x86Abi2 || ((brand.startsWith("generic") || brand.startsWith("android")) && device.startsWith("generic"));
            cachedEmulatorHint = Boolean.valueOf(result);
            diagnostic("emulator hint result=" + result + " abiX86=" + x86Abi2 + " knownVendor=" + knownDesktopEmulator + " markerFile=" + emulatorFile);
            return result;
        }
        x86Abi2 = x86Abi;
        combined = fingerprint + ServerSentEventKt.SPACE + model + ServerSentEventKt.SPACE + manufacturer + ServerSentEventKt.SPACE + brand + ServerSentEventKt.SPACE + device + ServerSentEventKt.SPACE + product + ServerSentEventKt.SPACE + hardware + ServerSentEventKt.SPACE + board + ServerSentEventKt.SPACE + host + ServerSentEventKt.SPACE + systemHints;
        if (combined.contains("mumu")) {
            knownDesktopEmulator = true;
        } else {
            knownDesktopEmulator = true;
        }
        if (new File("/system/bin/nemuVM-prop").exists()) {
            emulatorFile = true;
        } else {
            emulatorFile = true;
        }
        boolean result2 = !knownDesktopEmulator || emulatorFile || "1".equals(safeSystemProperty("ro.kernel.qemu")) || fingerprint.startsWith("generic") || fingerprint.contains(BuildConfig.TARGET_BACKEND) || fingerprint.contains("vbox") || model.contains("google_sdk") || model.contains(BuildConfig.TARGET_BACKEND) || model.contains("android sdk built for") || model.contains("sdk_gphone") || manufacturer.contains("genymotion") || product.contains("sdk") || product.contains(BuildConfig.TARGET_BACKEND) || product.contains("simulator") || product.contains("vbox") || hardware.contains("goldfish") || hardware.contains("ranchu") || x86Abi2 || ((brand.startsWith("generic") || brand.startsWith("android")) && device.startsWith("generic"));
        cachedEmulatorHint = Boolean.valueOf(result2);
        diagnostic("emulator hint result=" + result2 + " abiX86=" + x86Abi2 + " knownVendor=" + knownDesktopEmulator + " markerFile=" + emulatorFile);
        return result2;
    }

    private static String safeLower(String value) {
        return value == null ? "" : value.toLowerCase(Locale.US);
    }

    private static String safeSystemProperty(String name) {
        try {
            Class<?> systemProperties = Class.forName("android.os.SystemProperties");
            Method get = systemProperties.getDeclaredMethod("get", String.class, String.class);
            Object value = get.invoke(null, name, "");
            return safeLower(value == null ? "" : String.valueOf(value));
        } catch (Throwable th) {
            return "";
        }
    }

    private static void generateSoftwareSigningKey(String alias) throws Exception {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        KeyGenParameterSpec spec = new KeyGenParameterSpec.Builder(alias, 12).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setDigests("SHA-256").setUserAuthenticationRequired(false).build();
        generator.initialize(spec);
        generator.generateKeyPair();
    }

    public static byte[] signWithAttestedKey(String alias, byte[] data) {
        if (alias == null || data == null || data.length == 0 || data.length > 24576) {
            return null;
        }
        try {
            KeyStore store = KeyStore.getInstance("AndroidKeyStore");
            store.load(null);
            PrivateKey key = (PrivateKey) store.getKey(alias, null);
            if (key == null) {
                return null;
            }
            Signature signer = Signature.getInstance("SHA256withECDSA");
            signer.initSign(key);
            signer.update(data);
            byte[] signature = signer.sign();
            if (signature.length <= 144) {
                return signature;
            }
            return null;
        } catch (Throwable th) {
            return null;
        }
    }

    public static byte[] createEphemeralAgreement() {
        try {
            long now = SystemClock.elapsedRealtime();
            for (Integer handle : EPHEMERAL_KEYS.keySet()) {
                EphemeralAgreement old = EPHEMERAL_KEYS.get(handle);
                if (old != null && now - old.createdAtMs > 30000) {
                    EPHEMERAL_KEYS.remove(handle, old);
                }
            }
            KeyPair pair = null;
            int algorithm = 0;
            int publicLength = 0;
            if (Build.VERSION.SDK_INT >= 33) {
                try {
                    KeyPairGenerator generator = KeyPairGenerator.getInstance("XDH");
                    generator.initialize(NamedParameterSpec.X25519);
                    pair = generator.generateKeyPair();
                    algorithm = 1;
                    publicLength = 32;
                } catch (Throwable th) {
                    pair = null;
                }
            }
            if (pair == null) {
                KeyPairGenerator generator2 = KeyPairGenerator.getInstance("EC");
                generator2.initialize(new ECGenParameterSpec("secp256r1"), new SecureRandom());
                pair = generator2.generateKeyPair();
                algorithm = 2;
                publicLength = 65;
            }
            byte[] encoded = pair.getPublic().getEncoded();
            if (encoded != null && encoded.length >= publicLength) {
                byte[] paddedPublic = new byte[65];
                System.arraycopy(encoded, encoded.length - publicLength, paddedPublic, 0, publicLength);
                if ((algorithm == 2 && paddedPublic[0] != 4) || (algorithm == 1 && isAllZero(paddedPublic, 0, 32))) {
                    Arrays.fill(paddedPublic, (byte) 0);
                    return null;
                }
                int handle2 = NEXT_EPHEMERAL_HANDLE.getAndIncrement();
                if (handle2 <= 0) {
                    NEXT_EPHEMERAL_HANDLE.set(1);
                    handle2 = NEXT_EPHEMERAL_HANDLE.getAndIncrement();
                }
                EPHEMERAL_KEYS.put(Integer.valueOf(handle2), new EphemeralAgreement(pair, algorithm, now));
                ByteArrayOutputStream bytes = new ByteArrayOutputStream(70);
                DataOutputStream out = new DataOutputStream(bytes);
                out.writeInt(handle2);
                out.writeByte(algorithm);
                out.write(paddedPublic);
                out.flush();
                Arrays.fill(paddedPublic, (byte) 0);
                return bytes.toByteArray();
            }
            return null;
        } catch (Throwable th2) {
            return null;
        }
    }

    public static byte[] decryptOffsetPack(int handle, byte[] envelope) {
        byte b;
        byte b2;
        byte b3;
        PublicKey serverPublic;
        KeyAgreement keyAgreement;
        byte b4;
        byte b5;
        EphemeralAgreement agreement = EPHEMERAL_KEYS.remove(Integer.valueOf(handle));
        if (agreement == null || envelope == null || envelope.length < 148 || envelope.length > 24576 || SystemClock.elapsedRealtime() - agreement.createdAtMs > 30000) {
            return null;
        }
        byte[] sharedSecret = null;
        byte[] key = null;
        byte[] salt = null;
        try {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(envelope));
            int algorithm = in.readUnsignedByte();
            byte[] serverPublicPadded = new byte[65];
            in.readFully(serverPublicPadded);
            salt = new byte[52];
            in.readFully(salt);
            byte[] nonce = new byte[12];
            in.readFully(nonce);
            int aadLength = in.readUnsignedShort();
            if (algorithm == agreement.algorithm && aadLength >= 32 && aadLength <= 4096 && in.available() >= aadLength + 16) {
                byte[] aad = new byte[aadLength];
                in.readFully(aad);
                byte[] ciphertext = new byte[in.available()];
                in.readFully(ciphertext);
                if (algorithm == 1) {
                    try {
                        if (!anyNonZero(serverPublicPadded, 32, 65) && !isAllZero(serverPublicPadded, 0, 32)) {
                            serverPublic = KeyFactory.getInstance("XDH").generatePublic(new X509EncodedKeySpec(concat(X25519_SPKI_PREFIX, Arrays.copyOf(serverPublicPadded, 32))));
                            keyAgreement = KeyAgreement.getInstance("XDH");
                        }
                        if (0 != 0) {
                            b3 = 0;
                            Arrays.fill((byte[]) null, (byte) 0);
                        } else {
                            b3 = 0;
                        }
                        if (0 != 0) {
                            Arrays.fill((byte[]) null, b3);
                        }
                        Arrays.fill(salt, b3);
                        return null;
                    } catch (Throwable th) {
                        if (sharedSecret != null) {
                            b = 0;
                            Arrays.fill(sharedSecret, (byte) 0);
                        } else {
                            b = 0;
                        }
                        if (key != null) {
                            Arrays.fill(key, b);
                        }
                        if (salt == null) {
                            return null;
                        }
                        Arrays.fill(salt, b);
                        return null;
                    }
                }
                if (algorithm != 2 || serverPublicPadded[0] != 4) {
                    if (0 != 0) {
                        b5 = 0;
                        Arrays.fill((byte[]) null, (byte) 0);
                    } else {
                        b5 = 0;
                    }
                    if (0 != 0) {
                        Arrays.fill((byte[]) null, b5);
                    }
                    Arrays.fill(salt, b5);
                    return null;
                }
                serverPublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(concat(P256_SPKI_PREFIX, serverPublicPadded)));
                keyAgreement = KeyAgreement.getInstance("ECDH");
                keyAgreement.init(agreement.pair.getPrivate());
                keyAgreement.doPhase(serverPublic, true);
                sharedSecret = keyAgreement.generateSecret();
                key = hkdfSha256(sharedSecret, salt, concat("kolson-offset-aead-v7".getBytes(StandardCharsets.US_ASCII), new byte[]{(byte) algorithm}));
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, new SecretKeySpec(key, "AES"), new GCMParameterSpec(128, nonce));
                cipher.updateAAD(aad);
                byte[] bArrDoFinal = cipher.doFinal(ciphertext);
                if (sharedSecret != null) {
                    b4 = 0;
                    Arrays.fill(sharedSecret, (byte) 0);
                } else {
                    b4 = 0;
                }
                if (key != null) {
                    Arrays.fill(key, b4);
                }
                Arrays.fill(salt, b4);
                return bArrDoFinal;
            }
            if (0 != 0) {
                b2 = 0;
                Arrays.fill((byte[]) null, (byte) 0);
            } else {
                b2 = 0;
            }
            if (0 != 0) {
                Arrays.fill((byte[]) null, b2);
            }
            Arrays.fill(salt, b2);
            return null;
        } catch (Throwable th2) {
        }
    }

    private static byte[] hkdfSha256(byte[] inputKey, byte[] salt, byte[] info) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(salt, "HmacSHA256"));
        byte[] prk = mac.doFinal(inputKey);
        try {
            mac.init(new SecretKeySpec(prk, "HmacSHA256"));
            mac.update(info);
            mac.update((byte) 1);
            return mac.doFinal();
        } finally {
            Arrays.fill(prk, (byte) 0);
        }
    }

    private static byte[] concat(byte[] a2, byte[] b) {
        byte[] out = Arrays.copyOf(a2, a2.length + b.length);
        System.arraycopy(b, 0, out, a2.length, b.length);
        return out;
    }

    private static boolean isAllZero(byte[] value, int start, int end) {
        int result = 0;
        for (int i = start; i < end; i++) {
            result |= value[i];
        }
        return result == 0;
    }

    private static boolean anyNonZero(byte[] value, int start, int end) {
        return !isAllZero(value, start, end);
    }

    public static String getPlayerNickname() {
        try {
            Context context = currentApplicationContext();
            if (context == null) {
                return "";
            }
            String nickname = LauncherNickname.read(context);
            Log.i("NEIZZIR.Login", "nickname bridge length=" + (nickname == null ? -1 : nickname.length()));
            return nickname == null ? "" : nickname;
        } catch (Throwable error) {
            Log.w("NEIZZIR.Login", "nickname bridge failed: " + error.getClass().getSimpleName());
            return "";
        }
    }

    public static void showConnectionError(final String message) {
        if (message == null || message.isEmpty()) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.blackhub.bronline.neizzir.KolsonTlsBridge$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                KolsonTlsBridge.lambda$showConnectionError$0(message);
            }
        });
    }

    static /* synthetic */ void lambda$showConnectionError$0(String message) {
        try {
            Context context = currentApplicationContext();
            if (context != null) {
                Toast.makeText(context, message, 1).show();
            }
        } catch (Exception e) {
        }
    }

    private static Context currentApplicationContext() throws Exception {
        Class<?> activityThread = Class.forName("android.app.ActivityThread");
        Method currentApplication = activityThread.getDeclaredMethod("currentApplication", new Class[0]);
        Object application = currentApplication.invoke(null, new Object[0]);
        if (!(application instanceof Context)) {
            return null;
        }
        Context context = ((Context) application).getApplicationContext();
        return context == null ? (Context) application : context;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static byte[] readAsset(Context context, String name, int maxSize) throws Exception {
        InputStream in = context.getAssets().open(name);
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            try {
                byte[] buffer = new byte[4096];
                int total = 0;
                while (true) {
                    int count = in.read(buffer);
                    if (count != -1) {
                        total += count;
                        if (total <= maxSize) {
                            out.write(buffer, 0, count);
                        } else {
                            out.close();
                            if (in != null) {
                                in.close();
                                return null;
                            }
                            return null;
                        }
                    } else {
                        byte[] byteArray = out.toByteArray();
                        out.close();
                        if (in != null) {
                            in.close();
                        }
                        return byteArray;
                    }
                    if (in != null) {
                        try {
                            in.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    out.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            if (in != null) {
                in.close();
            }
            throw th4;
        }
    }

    private static void writeSyncedFile(File target, byte[] data) throws Exception {
        FileOutputStream out = new FileOutputStream(target, false);
        try {
            out.write(data);
            out.flush();
            out.getFD().sync();
            out.close();
        } catch (Throwable th) {
            try {
                out.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void generateAttestedKey(String alias, byte[] challenge, boolean strongBox) throws Exception {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(alias, 12).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setDigests("SHA-256").setAttestationChallenge(challenge).setUserAuthenticationRequired(false);
        if (Build.VERSION.SDK_INT >= 28) {
            builder.setIsStrongBoxBacked(strongBox);
        }
        generator.initialize(builder.build());
        generator.generateKeyPair();
    }

    private static byte[] pinForHost(String host) {
        if (RU_HOST.equals(host)) {
            return RU_SPKI_SHA256;
        }
        if (EU_HOST.equals(host)) {
            return EU_SPKI_SHA256;
        }
        return null;
    }

    private static String[] selectProtocols(SSLSocket socket) {
        Set<String> supported = new HashSet<>(Arrays.asList(socket.getSupportedProtocols()));
        if (supported.contains("TLSv1.3")) {
            if (supported.contains("TLSv1.2")) {
                return new String[]{"TLSv1.3", "TLSv1.2"};
            }
            return new String[]{"TLSv1.3"};
        }
        return new String[]{"TLSv1.2"};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean constantTimeEquals(byte[] a2, byte[] b) {
        if (a2 == null || b == null || a2.length != b.length) {
            return false;
        }
        int diff = 0;
        for (int i = 0; i < a2.length; i++) {
            diff |= a2[i] ^ b[i];
        }
        return diff == 0;
    }

    private static void closeQuietly(SSLSocket socket) {
        if (socket == null) {
            return;
        }
        try {
            socket.close();
        } catch (Throwable th) {
        }
    }

    private static final class Session {

        /* JADX INFO: renamed from: in */
        final InputStream f786in;
        final OutputStream out;
        final SSLSocket socket;

        Session(SSLSocket socket, InputStream in, OutputStream out) {
            this.socket = socket;
            this.f786in = in;
            this.out = out;
        }
    }

    private static final class EphemeralAgreement {
        final int algorithm;
        final long createdAtMs;
        final KeyPair pair;

        EphemeralAgreement(KeyPair pair, int algorithm, long createdAtMs) {
            this.pair = pair;
            this.algorithm = algorithm;
            this.createdAtMs = createdAtMs;
        }
    }

    private static final class PinOnlyTrustManager implements X509TrustManager {
        private final byte[] expectedPin;

        PinOnlyTrustManager(byte[] expectedPin) {
            this.expectedPin = (byte[]) expectedPin.clone();
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] chain, String authType) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            if (chain == null || chain.length == 0) {
                throw new CertificateException("empty server certificate chain");
            }
            try {
                byte[] actual = MessageDigest.getInstance("SHA-256").digest(chain[0].getPublicKey().getEncoded());
                if (!KolsonTlsBridge.constantTimeEquals(actual, this.expectedPin)) {
                    throw new CertificateException("server pin mismatch");
                }
            } catch (CertificateException e) {
                throw e;
            } catch (Throwable e2) {
                throw new CertificateException("server pin check failed", e2);
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }
}
