package com.blackhub.bronline.neizzir;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import android.widget.Toast;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
public class KolsonLibrary {
    private static final String TAG = "KolsonLibrary";
    private static final ExecutorService EXEC = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.blackhub.bronline.neizzir.KolsonLibrary$$ExternalSyntheticLambda3
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return KolsonLibrary.lambda$static$0(runnable);
        }
    });
    private static final Object LOCK = new Object();
    private static volatile boolean isKolsonLibraryLoaded = false;
    private static volatile boolean isLoading = false;
    private static volatile boolean isInitInProgress = false;
    private static volatile boolean isInitDone = false;
    private static volatile boolean missingToastShown = false;
    private static final NativeRenderDispatcher RENDERERS = new NativeRenderDispatcher(new NativeRenderDispatcher.Renderer() { // from class: com.blackhub.bronline.neizzir.KolsonLibrary.1
        @Override // com.blackhub.bronline.neizzir.NativeRenderDispatcher.Renderer
        public void updateScreen(int width, int height) {
            KolsonLibrary.updateScreen(width, height);
        }

        @Override // com.blackhub.bronline.neizzir.NativeRenderDispatcher.Renderer
        public void step() {
            KolsonLibrary.step();
        }
    }, new NativeRenderDispatcher.Renderer() { // from class: com.blackhub.bronline.neizzir.KolsonLibrary.2
        @Override // com.blackhub.bronline.neizzir.NativeRenderDispatcher.Renderer
        public void updateScreen(int width, int height) {
            KolsonLibrary.updateScreen1(width, height);
        }

        @Override // com.blackhub.bronline.neizzir.NativeRenderDispatcher.Renderer
        public void step() {
            KolsonLibrary.step1();
        }
    }, new NativeRenderDispatcher.FailureReporter() { // from class: com.blackhub.bronline.neizzir.KolsonLibrary$$ExternalSyntheticLambda4
        @Override // com.blackhub.bronline.neizzir.NativeRenderDispatcher.FailureReporter
        public final void report(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
            Log.w(KolsonLibrary.TAG, str + " rendering disabled: JNI unavailable; retry after a successful library load", unsatisfiedLinkError);
        }
    });

    public interface Callback {
        void onError(String str);

        void onSuccess();
    }

    public static native int getSecurityStatus();

    public static native void initSecurity(String str, String str2, String str3);

    public static native boolean isPremiumUser();

    private static native void prepareGameStartupNative();

    public static native boolean prepareOptionalLibrary(String str);

    public static native void step();

    public static native void step1();

    public static native void updateScreen(int i, int i2);

    public static native void updateScreen1(int i, int i2);

    public static native boolean verifyEd25519(byte[] bArr, byte[] bArr2, byte[] bArr3);

    static /* synthetic */ Thread lambda$static$0(Runnable r) {
        Thread t = new Thread(r, "KolsonWorker");
        t.setDaemon(true);
        return t;
    }

    public static void prepareGameStartup() {
        if (isKolsonLibraryLoaded) {
            try {
                prepareGameStartupNative();
            } catch (UnsatisfiedLinkError error) {
                Log.w(TAG, "CDN startup guard is unavailable in this library version", error);
            }
        }
    }

    @Deprecated
    public static String getKey() {
        return "";
    }

    @Deprecated
    public static void Changes(int pageID, int feature, int value) {
    }

    @Deprecated
    public static void SettingsChanges(int pageID, int feature, int value) {
    }

    @Deprecated
    public static String[] getFeatures() {
        return new String[0];
    }

    @Deprecated
    public static int getFeatureState(int pageId, int feature) {
        return 0;
    }

    @Deprecated
    public static int getSettingsState(int pageId, int feature) {
        return 0;
    }

    public static void renderFrame() {
        RENDERERS.renderFrame();
    }

    public static void updateRenderScreen(int width, int height) {
        RENDERERS.updateScreen(width, height);
    }

    public static void notifyModuleLoaded() {
        RENDERERS.onModuleLoaded();
    }

    private static void notifyKolsonLoaded() {
        RENDERERS.onKolsonLoaded();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void loadKolsonLibrary(Context context) {
        Object obj;
        Context applicationContext = context.getApplicationContext();
        synchronized (LOCK) {
            if (isKolsonLibraryLoaded) {
                return;
            }
            if (isLoading) {
                while (isLoading) {
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        Log.w(TAG, "loadKolsonLibrary: interrupted while waiting", e);
                        return;
                    }
                }
                return;
            }
            isLoading = true;
            boolean z = false;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z2 = 0;
            z2 = 0;
            try {
                try {
                    Log.i("KOLSON_BOOTSTRAP", "loadLibrary:begin mumu-trace-1 thread=" + Thread.currentThread().getName() + " sdk=" + Build.VERSION.SDK_INT + " is64Bit=" + Process.is64Bit());
                    System.loadLibrary("kolson");
                    Log.i("KOLSON_BOOTSTRAP", "loadLibrary:ok elapsedMs=" + (SystemClock.elapsedRealtime() - jElapsedRealtime));
                    z = true;
                    Log.i(TAG, "✅ kolson.so loaded successfully");
                    synchronized (LOCK) {
                        isLoading = false;
                        isKolsonLibraryLoaded = true;
                        if (1 != 0) {
                            notifyKolsonLoaded();
                        }
                        obj = LOCK;
                        obj.notifyAll();
                    }
                    z2 = obj;
                } catch (UnsatisfiedLinkError e2) {
                    Log.e("KOLSON_BOOTSTRAP", "loadLibrary:failed", e2);
                    Log.e(TAG, "❌ Failed to load kolson.so", e2);
                    useAlternativeFunctionality(applicationContext);
                    synchronized (LOCK) {
                        isLoading = false;
                        isKolsonLibraryLoaded = z;
                        if (z) {
                            notifyKolsonLoaded();
                        }
                        Object obj2 = LOCK;
                        obj2.notifyAll();
                        z2 = obj2;
                    }
                }
            } catch (Throwable th) {
                boolean z3 = z;
                synchronized (LOCK) {
                    isLoading = z2;
                    isKolsonLibraryLoaded = z3;
                    if (z3) {
                        notifyKolsonLoaded();
                    }
                    LOCK.notifyAll();
                    throw th;
                }
            }
        }
    }

    public static void loadKolsonLibraryAsync(final Context context, final Callback callback) {
        EXEC.execute(new Runnable() { // from class: com.blackhub.bronline.neizzir.KolsonLibrary$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                KolsonLibrary.lambda$loadKolsonLibraryAsync$2(context, callback);
            }
        });
    }

    static /* synthetic */ void lambda$loadKolsonLibraryAsync$2(Context context, Callback callback) {
        try {
            loadKolsonLibrary(context);
            if (callback != null) {
                Objects.requireNonNull(callback);
                runOnMain(new KolsonLibrary$$ExternalSyntheticLambda0(callback));
            }
        } catch (Throwable t) {
            Log.e(TAG, "loadKolsonLibraryAsync error: " + t.getMessage(), t);
            if (callback != null) {
                Objects.requireNonNull(callback);
                runOnMain(new KolsonLibrary$$ExternalSyntheticLambda0(callback));
            }
        }
    }

    public static void initSecurityAsync(Context context, final String key, final String androidId, final String deviceName, final Callback callback) {
        final Context appCtx = context.getApplicationContext();
        EXEC.execute(new Runnable() { // from class: com.blackhub.bronline.neizzir.KolsonLibrary$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                KolsonLibrary.lambda$initSecurityAsync$3(appCtx, callback, key, androidId, deviceName);
            }
        });
    }

    static /* synthetic */ void lambda$initSecurityAsync$3(Context appCtx, Callback callback, String key, String androidId, String deviceName) {
        boolean needInit;
        try {
            loadKolsonLibrary(appCtx);
            if (!isKolsonLibraryLoaded) {
                Log.w(TAG, "kolson.so не загружена, пропускаем JNI initSecurity");
                if (callback != null) {
                    Objects.requireNonNull(callback);
                    runOnMain(new KolsonLibrary$$ExternalSyntheticLambda0(callback));
                    return;
                }
                return;
            }
            synchronized (LOCK) {
                if (isInitDone) {
                    needInit = false;
                } else if (isInitInProgress) {
                    while (isInitInProgress && !isInitDone) {
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            Log.w(TAG, "initSecurityAsync: interrupted while waiting", e);
                            if (callback != null) {
                                Objects.requireNonNull(callback);
                                runOnMain(new KolsonLibrary$$ExternalSyntheticLambda0(callback));
                            }
                            return;
                        }
                    }
                    needInit = false;
                } else {
                    isInitInProgress = true;
                    needInit = true;
                }
            }
            if (needInit) {
                try {
                    Log.i("KOLSON_BOOTSTRAP", "initSecurity:call");
                    initSecurity(key, androidId, deviceName);
                    Log.i("KOLSON_BOOTSTRAP", "initSecurity:return");
                    Log.i(TAG, "✅ initSecurity completed");
                    synchronized (LOCK) {
                        try {
                            isInitDone = true;
                            isInitInProgress = false;
                            LOCK.notifyAll();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (UnsatisfiedLinkError e2) {
                    Log.e(TAG, "❌ JNI entry not found", e2);
                    synchronized (LOCK) {
                        isInitDone = false;
                        isInitInProgress = false;
                        LOCK.notifyAll();
                        if (callback != null) {
                            Objects.requireNonNull(callback);
                            runOnMain(new KolsonLibrary$$ExternalSyntheticLambda0(callback));
                            return;
                        }
                        return;
                    }
                } catch (Throwable t) {
                    Log.e(TAG, "❌ initSecurity failed", t);
                    synchronized (LOCK) {
                        isInitDone = false;
                        isInitInProgress = false;
                        LOCK.notifyAll();
                        if (callback != null) {
                            Objects.requireNonNull(callback);
                            runOnMain(new KolsonLibrary$$ExternalSyntheticLambda0(callback));
                            return;
                        }
                        return;
                    }
                }
            }
            if (callback != null) {
                Objects.requireNonNull(callback);
                runOnMain(new KolsonLibrary$$ExternalSyntheticLambda0(callback));
            }
        } catch (Throwable t2) {
            Log.e(TAG, "initSecurityAsync outer error: " + t2.getMessage(), t2);
            synchronized (LOCK) {
                isInitInProgress = false;
                LOCK.notifyAll();
                if (callback != null) {
                    Objects.requireNonNull(callback);
                    runOnMain(new KolsonLibrary$$ExternalSyntheticLambda0(callback));
                }
            }
        }
    }

    private static void useAlternativeFunctionality(final Context context) {
        if (missingToastShown) {
            return;
        }
        missingToastShown = true;
        runOnMain(new Runnable() { // from class: com.blackhub.bronline.neizzir.KolsonLibrary$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(context.getApplicationContext(), "Библиотека kolson не найдена", 1).show();
            }
        });
    }

    private static void runOnMain(Runnable r) {
        new Handler(Looper.getMainLooper()).post(r);
    }

    public static boolean isLibraryLoaded() {
        return isKolsonLibraryLoaded;
    }

    public static String getDiagnostics() {
        return "Library loaded: " + isKolsonLibraryLoaded + "\nInit done: " + isInitDone;
    }
}
