package com.blackhub.bronline.neizzir.network;

import android.content.Context;
import android.util.Log;
import coil.ImageLoader;
import coil.disk.DiskCache;
import coil.memory.MemoryCache;
import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventKeys;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: compiled from: NetworkRuntime.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001$B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u001aH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/NetworkRuntime;", "", "()V", "apiClient", "Lokhttp3/OkHttpClient;", "getApiClient", "()Lokhttp3/OkHttpClient;", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "getApplicationScope", "()Lkotlinx/coroutines/CoroutineScope;", "downloadClient", "getDownloadClient", "gameDownloadSemaphore", "Lkotlinx/coroutines/sync/Semaphore;", "getGameDownloadSemaphore", "()Lkotlinx/coroutines/sync/Semaphore;", "imageLoader", "Lcoil/ImageLoader;", "getImageLoader", "()Lcoil/ImageLoader;", "router", "Lcom/blackhub/bronline/neizzir/network/EndpointRouter;", "getRouter", "()Lcom/blackhub/bronline/neizzir/network/EndpointRouter;", "state", "Lcom/blackhub/bronline/neizzir/network/NetworkRuntime$State;", "initialize", "", "context", "Landroid/content/Context;", "requireState", "timingInterceptor", "Lokhttp3/Interceptor;", "isDebug", "", "State", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class NetworkRuntime {
    public static final NetworkRuntime INSTANCE = new NetworkRuntime();
    private static final CoroutineScope applicationScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
    private static final Semaphore gameDownloadSemaphore = SemaphoreKt.Semaphore$default(2, 0, 2, null);
    private static volatile State state;

    /* JADX INFO: compiled from: NetworkRuntime.kt */
    @Metadata(m4415d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/NetworkRuntime$State;", "", "apiClient", "Lokhttp3/OkHttpClient;", "downloadClient", "router", "Lcom/blackhub/bronline/neizzir/network/EndpointRouter;", "imageLoader", "Lcoil/ImageLoader;", "(Lokhttp3/OkHttpClient;Lokhttp3/OkHttpClient;Lcom/blackhub/bronline/neizzir/network/EndpointRouter;Lcoil/ImageLoader;)V", "getApiClient", "()Lokhttp3/OkHttpClient;", "getDownloadClient", "getImageLoader", "()Lcoil/ImageLoader;", "getRouter", "()Lcom/blackhub/bronline/neizzir/network/EndpointRouter;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final /* data */ class State {
        private final OkHttpClient apiClient;
        private final OkHttpClient downloadClient;
        private final ImageLoader imageLoader;
        private final EndpointRouter router;

        public static /* synthetic */ State copy$default(State state, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, EndpointRouter endpointRouter, ImageLoader imageLoader, int i, Object obj) {
            if ((i & 1) != 0) {
                okHttpClient = state.apiClient;
            }
            if ((i & 2) != 0) {
                okHttpClient2 = state.downloadClient;
            }
            if ((i & 4) != 0) {
                endpointRouter = state.router;
            }
            if ((i & 8) != 0) {
                imageLoader = state.imageLoader;
            }
            return state.copy(okHttpClient, okHttpClient2, endpointRouter, imageLoader);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final OkHttpClient getApiClient() {
            return this.apiClient;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final OkHttpClient getDownloadClient() {
            return this.downloadClient;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final EndpointRouter getRouter() {
            return this.router;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final ImageLoader getImageLoader() {
            return this.imageLoader;
        }

        public final State copy(OkHttpClient apiClient, OkHttpClient downloadClient, EndpointRouter router, ImageLoader imageLoader) {
            Intrinsics.checkNotNullParameter(apiClient, "apiClient");
            Intrinsics.checkNotNullParameter(downloadClient, "downloadClient");
            Intrinsics.checkNotNullParameter(router, "router");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            return new State(apiClient, downloadClient, router, imageLoader);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.apiClient, state.apiClient) && Intrinsics.areEqual(this.downloadClient, state.downloadClient) && Intrinsics.areEqual(this.router, state.router) && Intrinsics.areEqual(this.imageLoader, state.imageLoader);
        }

        public int hashCode() {
            return (((((this.apiClient.hashCode() * 31) + this.downloadClient.hashCode()) * 31) + this.router.hashCode()) * 31) + this.imageLoader.hashCode();
        }

        public String toString() {
            return "State(apiClient=" + this.apiClient + ", downloadClient=" + this.downloadClient + ", router=" + this.router + ", imageLoader=" + this.imageLoader + ')';
        }

        public State(OkHttpClient apiClient, OkHttpClient downloadClient, EndpointRouter router, ImageLoader imageLoader) {
            Intrinsics.checkNotNullParameter(apiClient, "apiClient");
            Intrinsics.checkNotNullParameter(downloadClient, "downloadClient");
            Intrinsics.checkNotNullParameter(router, "router");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            this.apiClient = apiClient;
            this.downloadClient = downloadClient;
            this.router = router;
            this.imageLoader = imageLoader;
        }

        public final OkHttpClient getApiClient() {
            return this.apiClient;
        }

        public final OkHttpClient getDownloadClient() {
            return this.downloadClient;
        }

        public final EndpointRouter getRouter() {
            return this.router;
        }

        public final ImageLoader getImageLoader() {
            return this.imageLoader;
        }
    }

    private NetworkRuntime() {
    }

    public final CoroutineScope getApplicationScope() {
        return applicationScope;
    }

    public final Semaphore getGameDownloadSemaphore() {
        return gameDownloadSemaphore;
    }

    public final void initialize(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (state != null) {
            return;
        }
        synchronized (this) {
            if (state != null) {
                return;
            }
            final Context appContext = context.getApplicationContext();
            if (appContext == null) {
                appContext = context;
            } else {
                Intrinsics.checkNotNull(appContext);
            }
            boolean isDebug = (appContext.getApplicationInfo().flags & 2) != 0;
            Dispatcher $this$initialize_u24lambda_u241_u24lambda_u240 = new Dispatcher();
            $this$initialize_u24lambda_u241_u24lambda_u240.setMaxRequests(32);
            $this$initialize_u24lambda_u241_u24lambda_u240.setMaxRequestsPerHost(8);
            ConnectionPool pool = new ConnectionPool(8, 5L, TimeUnit.MINUTES);
            OkHttpClient base = new OkHttpClient.Builder().dispatcher($this$initialize_u24lambda_u241_u24lambda_u240).connectionPool(pool).retryOnConnectionFailure(false).addInterceptor(INSTANCE.timingInterceptor(isDebug)).build();
            OkHttpClient api = base.newBuilder().connectTimeout(2L, TimeUnit.SECONDS).readTimeout(6L, TimeUnit.SECONDS).writeTimeout(6L, TimeUnit.SECONDS).callTimeout(8L, TimeUnit.SECONDS).build();
            OkHttpClient download = base.newBuilder().connectTimeout(4L, TimeUnit.SECONDS).readTimeout(45L, TimeUnit.SECONDS).writeTimeout(45L, TimeUnit.SECONDS).callTimeout(0L, TimeUnit.MILLISECONDS).build();
            EndpointRouter router = new EndpointRouter(appContext, api, download, 0L, 0L, 0L, null, 120, null);
            ImageLoader imageLoader = new ImageLoader.Builder(appContext).okHttpClient(download).memoryCache(new Function0<MemoryCache>() { // from class: com.blackhub.bronline.neizzir.network.NetworkRuntime$initialize$1$imageLoader$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final MemoryCache invoke() {
                    return new MemoryCache.Builder(appContext).maxSizePercent(0.2d).build();
                }
            }).diskCache(new Function0<DiskCache>() { // from class: com.blackhub.bronline.neizzir.network.NetworkRuntime$initialize$1$imageLoader$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final DiskCache invoke() {
                    return new DiskCache.Builder().directory(new File(appContext.getCacheDir(), "network_images")).maxSizeBytes(104857600L).build();
                }
            }).build();
            state = new State(api, download, router, imageLoader);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final OkHttpClient getApiClient() {
        return requireState().getApiClient();
    }

    public final OkHttpClient getDownloadClient() {
        return requireState().getDownloadClient();
    }

    public final EndpointRouter getRouter() {
        return requireState().getRouter();
    }

    public final ImageLoader getImageLoader() {
        return requireState().getImageLoader();
    }

    private final State requireState() {
        State state2 = state;
        if (state2 != null) {
            return state2;
        }
        throw new IllegalStateException("NetworkRuntime.initialize(context) must be called first".toString());
    }

    private final Interceptor timingInterceptor(final boolean isDebug) {
        return new Interceptor() { // from class: com.blackhub.bronline.neizzir.network.NetworkRuntime$$ExternalSyntheticLambda0
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return NetworkRuntime.timingInterceptor$lambda$3(isDebug, chain);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response timingInterceptor$lambda$3(boolean $isDebug, Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        long started = System.nanoTime();
        try {
            Response response = chain.proceed(request);
            if ($isDebug) {
                long elapsedMs = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - started);
                Log.d("NET", request.method() + ' ' + request.url().host() + request.url().encodedPath() + " -> " + response.code() + ' ' + elapsedMs + UpgradeObjectEventKeys.EVENT_TOP_LIST_SERVER_ID_PLAYER_KEY);
            }
            return response;
        } catch (Throwable error) {
            if ($isDebug) {
                long elapsedMs2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - started);
                Log.w("NET", request.method() + ' ' + request.url().host() + request.url().encodedPath() + " failed " + elapsedMs2 + "ms: " + error.getClass().getSimpleName());
            }
            throw error;
        }
    }
}
