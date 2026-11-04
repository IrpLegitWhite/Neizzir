package com.blackhub.bronline.neizzir.service.websocket;

import android.app.Service;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.IBinder;
import android.provider.Settings;
import android.util.Log;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.work.WorkRequest;
import com.blackhub.bronline.game.core.constants.BuildTypeConstants;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.helpshift.util.ApplicationUtil;
import java.net.URI;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.selects.SelectImplementation;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

/* JADX INFO: compiled from: WebSocketService.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010*\u0001\u000f\u0018\u0000 :2\u00020\u0001:\u00049:;<B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001eH\u0002J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\bH\u0002J\b\u0010#\u001a\u00020\u001aH\u0002J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020&H\u0003J\b\u0010(\u001a\u00020\bH\u0002J\b\u0010)\u001a\u00020\bH\u0002J\u0014\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\u001aH\u0016J\b\u0010/\u001a\u00020\u001aH\u0016J\u0018\u00100\u001a\u0004\u0018\u00010\u001f2\u0006\u00101\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u00102J\u0010\u00103\u001a\u0004\u0018\u00010\u001fH\u0082@¢\u0006\u0002\u00104J\b\u0010\"\u001a\u00020\u001aH\u0002J\u0010\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020&H\u0002J\b\u00107\u001a\u00020\u001aH\u0002J\b\u00108\u001a\u00020\u001aH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/service/websocket/WebSocketService;", "Landroid/app/Service;", "()V", "client", "Lorg/java_websocket/client/WebSocketClient;", "connectJob", "Lkotlinx/coroutines/Job;", "connecting", "", "connectivityManager", "Landroid/net/ConnectivityManager;", "heartbeatJob", "lifecycleObserver", "Lcom/blackhub/bronline/neizzir/service/websocket/WebSocketService$AppLifecycleObserver;", "networkCallback", "com/blackhub/bronline/neizzir/service/websocket/WebSocketService$networkCallback$1", "Lcom/blackhub/bronline/neizzir/service/websocket/WebSocketService$networkCallback$1;", "reconnectDelayMs", "", "reconnectJob", "servers", "", "Lcom/blackhub/bronline/neizzir/service/websocket/WebSocketService$Server;", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "cancelLoser", "", FirebaseAnalytics.Param.INDEX, "", "first", "Lkotlinx/coroutines/Deferred;", "Lcom/blackhub/bronline/neizzir/service/websocket/WebSocketService$Connected;", "second", "closeCurrent", "scheduleReconnect", "connectWebSocket", BuildTypeConstants.DEBUG_TYPE, "message", "", "getAndroidId", "isAppInForegroundNow", "isOnline", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "openCandidate", "server", "(Lcom/blackhub/bronline/neizzir/service/websocket/WebSocketService$Server;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "raceServers", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendPresenceStatus", "status", "startHeartbeat", "stopHeartbeat", "AppLifecycleObserver", "Companion", "Connected", HttpHeaders.SERVER, "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class WebSocketService extends Service {
    private static final long CONNECT_TIMEOUT_MS = 8000;
    private static final long HEDGE_DELAY_MS = 1500;
    private static final String PREFERRED_SERVER = "websocket_preferred";
    private static final String PREFS = "network_routes";
    private static final String TAG = "PresenceSocket";
    private WebSocketClient client;
    private Job connectJob;
    private boolean connecting;
    private ConnectivityManager connectivityManager;
    private Job heartbeatJob;
    private Job reconnectJob;
    private final CoroutineScope serviceScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
    private long reconnectDelayMs = 2000;
    private final AppLifecycleObserver lifecycleObserver = new AppLifecycleObserver();
    private final List<Server> servers = CollectionsKt__CollectionsKt.listOf((Object[]) new Server[]{new Server("presence-ru", "ws://85.193.87.60:5012/fast/ws/notifications"), new Server("presence-eu", "ws://162.19.254.18:5012/fast/ws/notifications")});
    private final WebSocketService$networkCallback$1 networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.blackhub.bronline.neizzir.service.websocket.WebSocketService$networkCallback$1
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            if (this.this$0.isAppInForegroundNow()) {
                this.this$0.connectWebSocket();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            if (!this.this$0.isOnline()) {
                this.this$0.closeCurrent(false);
            }
        }
    };

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.service.websocket.WebSocketService$openCandidate$1 */
    /* JADX INFO: compiled from: WebSocketService.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.service.websocket.WebSocketService", m4426f = "WebSocketService.kt", m4427i = {0, 0, 0}, m4428l = {160}, m4429m = "openCandidate", m4430n = {"this", "server", "socket"}, m4431s = {"L$0", "L$1", "L$2"})
    static final class C56741 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C56741(Continuation<? super C56741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketService.this.openCandidate(null, this);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Object systemService = getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
        try {
            Result.Companion companion = Result.INSTANCE;
            WebSocketService $this$onCreate_u24lambda_u240 = this;
            ConnectivityManager connectivityManager = $this$onCreate_u24lambda_u240.connectivityManager;
            if (connectivityManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectivityManager");
                connectivityManager = null;
            }
            connectivityManager.registerDefaultNetworkCallback($this$onCreate_u24lambda_u240.networkCallback);
            Result.m15551constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m15551constructorimpl(ResultKt.createFailure(th));
        }
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(this.lifecycleObserver);
        connectWebSocket();
    }

    @Override // android.app.Service
    public void onDestroy() {
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().removeObserver(this.lifecycleObserver);
        try {
            Result.Companion companion = Result.INSTANCE;
            WebSocketService $this$onDestroy_u24lambda_u241 = this;
            ConnectivityManager connectivityManager = $this$onDestroy_u24lambda_u241.connectivityManager;
            if (connectivityManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectivityManager");
                connectivityManager = null;
            }
            connectivityManager.unregisterNetworkCallback($this$onDestroy_u24lambda_u241.networkCallback);
            Result.m15551constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m15551constructorimpl(ResultKt.createFailure(th));
        }
        closeCurrent(false);
        CoroutineScopeKt.cancel$default(this.serviceScope, null, 1, null);
        super.onDestroy();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void connectWebSocket() {
        if (!this.connecting) {
            WebSocketClient webSocketClient = this.client;
            boolean z = false;
            if (webSocketClient != null && webSocketClient.isOpen()) {
                z = true;
            }
            if (!z && isOnline() && isAppInForegroundNow()) {
                this.connecting = true;
                Job job = this.reconnectJob;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                Job job2 = this.connectJob;
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                this.connectJob = BuildersKt__Builders_commonKt.launch$default(this.serviceScope, null, null, new C56731(null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.service.websocket.WebSocketService$connectWebSocket$1 */
    /* JADX INFO: compiled from: WebSocketService.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.service.websocket.WebSocketService$connectWebSocket$1", m4426f = "WebSocketService.kt", m4427i = {}, m4428l = {87, 99}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C56731(Continuation<? super C56731> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebSocketService.this.new C56731(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x003f  */
        /* JADX WARN: Code duplicated, block: B:16:0x0047  */
        /* JADX WARN: Code duplicated, block: B:18:0x00a8 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x00a9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C56731 c56731;
            Connected winner;
            C56731 c56732;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objRaceServers = WebSocketService.this.raceServers(this);
                    if (objRaceServers == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objRaceServers;
                    c56731 = this;
                    winner = (Connected) $result;
                    WebSocketService.this.connecting = false;
                    if (winner == null) {
                        WebSocketService.this.scheduleReconnect();
                        return Unit.INSTANCE;
                    }
                    WebSocketService.this.client = winner.getClient();
                    WebSocketService.this.getSharedPreferences(WebSocketService.PREFS, 0).edit().putString(WebSocketService.PREFERRED_SERVER, winner.getServer().getId()).apply();
                    WebSocketService.this.reconnectDelayMs = 2000L;
                    WebSocketService.this.debug("connected " + winner.getServer().getId());
                    WebSocketService.this.startHeartbeat();
                    c56731.label = 2;
                    if (DelayKt.delay(500L, c56731) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c56732 = c56731;
                    WebSocketService.this.sendPresenceStatus(CustomTabsCallback.ONLINE_EXTRAS_KEY);
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c56731 = this;
                    winner = (Connected) $result;
                    WebSocketService.this.connecting = false;
                    if (winner == null) {
                        WebSocketService.this.scheduleReconnect();
                        return Unit.INSTANCE;
                    }
                    WebSocketService.this.client = winner.getClient();
                    WebSocketService.this.getSharedPreferences(WebSocketService.PREFS, 0).edit().putString(WebSocketService.PREFERRED_SERVER, winner.getServer().getId()).apply();
                    WebSocketService.this.reconnectDelayMs = 2000L;
                    WebSocketService.this.debug("connected " + winner.getServer().getId());
                    WebSocketService.this.startHeartbeat();
                    c56731.label = 2;
                    if (DelayKt.delay(500L, c56731) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c56732 = c56731;
                    WebSocketService.this.sendPresenceStatus(CustomTabsCallback.ONLINE_EXTRAS_KEY);
                    return Unit.INSTANCE;
                case 2:
                    c56732 = this;
                    ResultKt.throwOnFailure($result);
                    WebSocketService.this.sendPresenceStatus(CustomTabsCallback.ONLINE_EXTRAS_KEY);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.service.websocket.WebSocketService$raceServers$2 */
    /* JADX INFO: compiled from: WebSocketService.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/service/websocket/WebSocketService$Connected;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.service.websocket.WebSocketService$raceServers$2", m4426f = "WebSocketService.kt", m4427i = {0, 0, 0, 1, 1}, m4428l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 263, ApplicationUtil.NOTIFICATION_ID, ApplicationUtil.NOTIFICATION_ID}, m4429m = "invokeSuspend", m4430n = {"$this$supervisorScope", "ordered", "first", "first", "second"}, m4431s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class C56752 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Connected>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C56752(Continuation<? super C56752> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C56752 c56752 = WebSocketService.this.new C56752(continuation);
            c56752.L$0 = obj;
            return c56752;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Connected> continuation) {
            return ((C56752) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x00aa A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:18:0x00fb A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:22:0x0109  */
        /* JADX WARN: Code duplicated, block: B:24:0x011d  */
        /* JADX WARN: Code duplicated, block: B:26:0x0129  */
        /* JADX WARN: Code duplicated, block: B:28:0x0139 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x013e  */
        /* JADX WARN: Code duplicated, block: B:33:0x014e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            CoroutineScope $this$supervisorScope;
            Deferred first;
            List ordered;
            C56752 c56752;
            Connected early;
            Deferred second;
            Object objDoSelect;
            Pair finished;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CoroutineScope $this$supervisorScope2 = (CoroutineScope) this.L$0;
                    final String preferredId = WebSocketService.this.getSharedPreferences(WebSocketService.PREFS, 0).getString(WebSocketService.PREFERRED_SERVER, null);
                    Iterable $this$sortedByDescending$iv = WebSocketService.this.servers;
                    List ordered2 = CollectionsKt___CollectionsKt.sortedWith($this$sortedByDescending$iv, new Comparator() { // from class: com.blackhub.bronline.neizzir.service.websocket.WebSocketService$raceServers$2$invokeSuspend$$inlined$sortedByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            WebSocketService.Server it = (WebSocketService.Server) t2;
                            WebSocketService.Server it2 = (WebSocketService.Server) t;
                            return ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(Intrinsics.areEqual(it.getId(), preferredId)), Boolean.valueOf(Intrinsics.areEqual(it2.getId(), preferredId)));
                        }
                    });
                    Deferred first2 = BuildersKt__Builders_commonKt.async$default($this$supervisorScope2, null, null, new WebSocketService$raceServers$2$first$1(WebSocketService.this, ordered2, null), 3, null);
                    this.L$0 = $this$supervisorScope2;
                    this.L$1 = ordered2;
                    this.L$2 = first2;
                    this.label = 1;
                    Object objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(1500L, new WebSocketService$raceServers$2$early$1(first2, null), this);
                    if (objWithTimeoutOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $this$supervisorScope = $this$supervisorScope2;
                    first = first2;
                    ordered = ordered2;
                    c56752 = this;
                    $result = objWithTimeoutOrNull;
                    early = (Connected) $result;
                    if (early != null) {
                        return early;
                    }
                    second = BuildersKt__Builders_commonKt.async$default($this$supervisorScope, null, null, new WebSocketService$raceServers$2$second$1(WebSocketService.this, ordered, null), 3, null);
                    SelectImplementation $this$select_u24lambda_u241$iv = new SelectImplementation(c56752.getContext());
                    SelectImplementation $this$invokeSuspend_u24lambda_u241 = $this$select_u24lambda_u241$iv;
                    $this$invokeSuspend_u24lambda_u241.invoke(first.getOnAwait(), new WebSocketService$raceServers$2$finished$1$1(null));
                    $this$invokeSuspend_u24lambda_u241.invoke(second.getOnAwait(), new WebSocketService$raceServers$2$finished$1$2(null));
                    c56752.L$0 = first;
                    c56752.L$1 = second;
                    c56752.L$2 = null;
                    c56752.label = 2;
                    objDoSelect = $this$select_u24lambda_u241$iv.doSelect(c56752);
                    if (objDoSelect == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objDoSelect;
                    finished = (Pair) $result;
                    if (finished.getSecond() != null) {
                        WebSocketService.this.cancelLoser(((Number) finished.getFirst()).intValue(), first, second);
                        return finished.getSecond();
                    }
                    if (((Number) finished.getFirst()).intValue() == 0) {
                        c56752.L$0 = null;
                        c56752.L$1 = null;
                        c56752.label = 3;
                        $result = second.await(c56752);
                        if ($result == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        c56752.L$0 = null;
                        c56752.L$1 = null;
                        c56752.label = 4;
                        $result = first.await(c56752);
                        if ($result == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return (Connected) $result;
                case 1:
                    Deferred first3 = (Deferred) this.L$2;
                    ordered = (List) this.L$1;
                    CoroutineScope $this$supervisorScope3 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure($result);
                    first = first3;
                    $this$supervisorScope = $this$supervisorScope3;
                    c56752 = this;
                    early = (Connected) $result;
                    if (early != null) {
                        return early;
                    }
                    second = BuildersKt__Builders_commonKt.async$default($this$supervisorScope, null, null, new WebSocketService$raceServers$2$second$1(WebSocketService.this, ordered, null), 3, null);
                    SelectImplementation $this$select_u24lambda_u241$iv2 = new SelectImplementation(c56752.getContext());
                    SelectImplementation $this$invokeSuspend_u24lambda_u242 = $this$select_u24lambda_u241$iv2;
                    $this$invokeSuspend_u24lambda_u242.invoke(first.getOnAwait(), new WebSocketService$raceServers$2$finished$1$1(null));
                    $this$invokeSuspend_u24lambda_u242.invoke(second.getOnAwait(), new WebSocketService$raceServers$2$finished$1$2(null));
                    c56752.L$0 = first;
                    c56752.L$1 = second;
                    c56752.L$2 = null;
                    c56752.label = 2;
                    objDoSelect = $this$select_u24lambda_u241$iv2.doSelect(c56752);
                    if (objDoSelect == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objDoSelect;
                    finished = (Pair) $result;
                    if (finished.getSecond() != null) {
                        WebSocketService.this.cancelLoser(((Number) finished.getFirst()).intValue(), first, second);
                        return finished.getSecond();
                    }
                    if (((Number) finished.getFirst()).intValue() == 0) {
                        c56752.L$0 = null;
                        c56752.L$1 = null;
                        c56752.label = 3;
                        $result = second.await(c56752);
                        if ($result == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        c56752.L$0 = null;
                        c56752.L$1 = null;
                        c56752.label = 4;
                        $result = first.await(c56752);
                        if ($result == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return (Connected) $result;
                case 2:
                    second = (Deferred) this.L$1;
                    Deferred first4 = (Deferred) this.L$0;
                    ResultKt.throwOnFailure($result);
                    first = first4;
                    c56752 = this;
                    finished = (Pair) $result;
                    if (finished.getSecond() != null) {
                        WebSocketService.this.cancelLoser(((Number) finished.getFirst()).intValue(), first, second);
                        return finished.getSecond();
                    }
                    if (((Number) finished.getFirst()).intValue() == 0) {
                        c56752.L$0 = null;
                        c56752.L$1 = null;
                        c56752.label = 3;
                        $result = second.await(c56752);
                        if ($result == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        c56752.L$0 = null;
                        c56752.L$1 = null;
                        c56752.label = 4;
                        $result = first.await(c56752);
                        if ($result == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return (Connected) $result;
                case 3:
                case 4:
                    ResultKt.throwOnFailure($result);
                    return (Connected) $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object raceServers(Continuation<? super Connected> continuation) {
        return SupervisorKt.supervisorScope(new C56752(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelLoser(int index, Deferred<Connected> first, Deferred<Connected> second) {
        final Deferred<Connected> deferred = index == 0 ? second : first;
        deferred.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: com.blackhub.bronline.neizzir.service.websocket.WebSocketService.cancelLoser.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.service.websocket.WebSocketService$cancelLoser$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: WebSocketService.kt */
            @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
            @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.service.websocket.WebSocketService$cancelLoser$1$1", m4426f = "WebSocketService.kt", m4427i = {}, m4428l = {128}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Deferred<Connected> $loser;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Deferred<Connected> deferred, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$loser = deferred;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$loser, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code duplicated, block: B:21:0x0045  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object $result) {
                    AnonymousClass1 anonymousClass1;
                    Throwable th;
                    AnonymousClass1 anonymousClass2;
                    Connected connected;
                    Unit unit;
                    WebSocketClient client;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (this.label) {
                        case 0:
                            ResultKt.throwOnFailure($result);
                            anonymousClass1 = this;
                            Deferred<Connected> deferred = anonymousClass1.$loser;
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                anonymousClass1.label = 1;
                                Object objAwait = deferred.await(anonymousClass1);
                                if (objAwait == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                $result = objAwait;
                                try {
                                    connected = (Connected) $result;
                                    if (connected != null || (client = connected.getClient()) == null) {
                                        unit = null;
                                    } else {
                                        client.close();
                                        unit = Unit.INSTANCE;
                                    }
                                    Result.m15551constructorimpl(unit);
                                    break;
                                } catch (Throwable th2) {
                                    AnonymousClass1 anonymousClass3 = anonymousClass1;
                                    th = th2;
                                    $result = $result;
                                    anonymousClass2 = anonymousClass3;
                                    Result.Companion companion2 = Result.INSTANCE;
                                    Result.m15551constructorimpl(ResultKt.createFailure(th));
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th3) {
                                th = th3;
                                anonymousClass2 = anonymousClass1;
                                Result.Companion companion3 = Result.INSTANCE;
                                Result.m15551constructorimpl(ResultKt.createFailure(th));
                                return Unit.INSTANCE;
                            }
                        case 1:
                            anonymousClass2 = this;
                            try {
                                ResultKt.throwOnFailure($result);
                                anonymousClass1 = anonymousClass2;
                                connected = (Connected) $result;
                                if (connected != null) {
                                    unit = null;
                                } else {
                                    unit = null;
                                }
                                Result.m15551constructorimpl(unit);
                                break;
                            } catch (Throwable th4) {
                                th = th4;
                                Result.Companion companion4 = Result.INSTANCE;
                                Result.m15551constructorimpl(ResultKt.createFailure(th));
                                return Unit.INSTANCE;
                            }
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                if (!deferred.isCancelled()) {
                    BuildersKt__Builders_commonKt.launch$default(this.serviceScope, null, null, new AnonymousClass1(deferred, null), 3, null);
                }
            }
        });
        Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.blackhub.bronline.neizzir.service.websocket.WebSocketService$Server, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.blackhub.bronline.neizzir.service.websocket.WebSocketService$openCandidate$socket$1] */
    /* JADX WARN: Type inference failed for: r11v15, types: [com.blackhub.bronline.neizzir.service.websocket.WebSocketService$openCandidate$socket$1] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.blackhub.bronline.neizzir.service.websocket.WebSocketService$openCandidate$socket$1] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [com.blackhub.bronline.neizzir.service.websocket.WebSocketService$openCandidate$socket$1] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.blackhub.bronline.neizzir.service.websocket.WebSocketService$Server] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final Object openCandidate(final Server server, Continuation<? super Connected> continuation) throws Throwable {
        C56741 c56741;
        final WebSocketService webSocketService;
        Object objWithTimeoutOrNull;
        ?? r1;
        ?? r11;
        if (continuation instanceof C56741) {
            c56741 = (C56741) continuation;
            if ((c56741.label & Integer.MIN_VALUE) != 0) {
                c56741.label -= Integer.MIN_VALUE;
            } else {
                c56741 = new C56741(continuation);
            }
        } else {
            c56741 = new C56741(continuation);
        }
        C56741 c56742 = c56741;
        Object obj = c56742.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Connected connected = null;
        try {
            switch (c56742.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    webSocketService = this;
                    final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    final URI uri = new URI(server.getUrl());
                    WebSocketClient webSocketClient = new WebSocketClient(uri) { // from class: com.blackhub.bronline.neizzir.service.websocket.WebSocketService$openCandidate$socket$1
                        @Override // org.java_websocket.client.WebSocketClient
                        public void onOpen(ServerHandshake handshakedata) {
                            completableDeferredCompletableDeferred$default.complete(true);
                        }

                        @Override // org.java_websocket.client.WebSocketClient
                        public void onMessage(String message) {
                        }

                        @Override // org.java_websocket.client.WebSocketClient
                        public void onClose(int code, String reason, boolean remote) {
                            completableDeferredCompletableDeferred$default.complete(false);
                            if (webSocketService.client == this) {
                                webSocketService.client = null;
                                webSocketService.stopHeartbeat();
                                if (webSocketService.isAppInForegroundNow()) {
                                    webSocketService.scheduleReconnect();
                                }
                            }
                        }

                        @Override // org.java_websocket.client.WebSocketClient
                        public void onError(Exception ex) {
                            Class<?> cls;
                            if (!isOpen()) {
                                completableDeferredCompletableDeferred$default.complete(false);
                            }
                            WebSocketService webSocketService2 = webSocketService;
                            StringBuilder sbAppend = new StringBuilder().append(server.getId()).append(" error ");
                            String simpleName = (ex == null || (cls = ex.getClass()) == null) ? null : cls.getSimpleName();
                            if (simpleName == null) {
                                simpleName = "";
                            }
                            webSocketService2.debug(sbAppend.append(simpleName).toString());
                        }
                    };
                    webSocketClient.setConnectionLostTimeout(60);
                    try {
                        webSocketClient.connect();
                        WebSocketService$openCandidate$ok$1 webSocketService$openCandidate$ok$1 = new WebSocketService$openCandidate$ok$1(completableDeferredCompletableDeferred$default, null);
                        c56742.L$0 = webSocketService;
                        c56742.L$1 = server;
                        c56742.L$2 = webSocketClient;
                        c56742.label = 1;
                        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(CONNECT_TIMEOUT_MS, webSocketService$openCandidate$ok$1, c56742);
                        if (objWithTimeoutOrNull == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r1 = server;
                        r11 = webSocketClient;
                        if (Intrinsics.areEqual(objWithTimeoutOrNull, Boxing.boxBoolean(true)) || !r11.isOpen()) {
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                r11.close();
                                Result.m15551constructorimpl(Unit.INSTANCE);
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                Result.m15551constructorimpl(ResultKt.createFailure(th));
                            }
                            break;
                        } else {
                            connected = new Connected(r1, (WebSocketClient) r11);
                        }
                        if (!r11.isOpen()) {
                            try {
                                Result.Companion companion3 = Result.INSTANCE;
                                r11.close();
                                Result.m15551constructorimpl(Unit.INSTANCE);
                            } catch (Throwable th2) {
                                Result.Companion companion4 = Result.INSTANCE;
                                Result.m15551constructorimpl(ResultKt.createFailure(th2));
                            }
                            break;
                        }
                        return connected;
                    } catch (CancellationException e) {
                        e = e;
                        server = webSocketClient;
                        try {
                            Result.Companion companion5 = Result.INSTANCE;
                            server.close();
                            Result.m15551constructorimpl(Unit.INSTANCE);
                            break;
                        } catch (Throwable th3) {
                            Result.Companion companion6 = Result.INSTANCE;
                            Result.m15551constructorimpl(ResultKt.createFailure(th3));
                        }
                        throw e;
                    } catch (Throwable th4) {
                        th = th4;
                        server = webSocketClient;
                        if (!server.isOpen()) {
                            try {
                                Result.Companion companion7 = Result.INSTANCE;
                                server.close();
                                Result.m15551constructorimpl(Unit.INSTANCE);
                            } catch (Throwable th5) {
                                Result.Companion companion8 = Result.INSTANCE;
                                Result.m15551constructorimpl(ResultKt.createFailure(th5));
                            }
                            break;
                        }
                        throw th;
                    }
                case 1:
                    server = (WebSocketService$openCandidate$socket$1) c56742.L$2;
                    Server server2 = (Server) c56742.L$1;
                    webSocketService = (WebSocketService) c56742.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        objWithTimeoutOrNull = obj;
                        r1 = server2;
                        r11 = server;
                        if (Intrinsics.areEqual(objWithTimeoutOrNull, Boxing.boxBoolean(true))) {
                            Result.Companion companion9 = Result.INSTANCE;
                            r11.close();
                            Result.m15551constructorimpl(Unit.INSTANCE);
                            break;
                        } else {
                            Result.Companion companion10 = Result.INSTANCE;
                            r11.close();
                            Result.m15551constructorimpl(Unit.INSTANCE);
                            break;
                        }
                        if (!r11.isOpen()) {
                            Result.Companion companion11 = Result.INSTANCE;
                            r11.close();
                            Result.m15551constructorimpl(Unit.INSTANCE);
                            break;
                        }
                        return connected;
                    } catch (CancellationException e2) {
                        e = e2;
                        Result.Companion companion12 = Result.INSTANCE;
                        server.close();
                        Result.m15551constructorimpl(Unit.INSTANCE);
                        throw e;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void scheduleReconnect() {
        Job job = this.reconnectJob;
        boolean z = false;
        if (job != null && job.isActive()) {
            z = true;
        }
        if (!z && isOnline() && isAppInForegroundNow()) {
            long base = this.reconnectDelayMs;
            this.reconnectDelayMs = RangesKt___RangesKt.coerceAtMost(this.reconnectDelayMs * 2, 60000L);
            this.reconnectJob = BuildersKt__Builders_commonKt.launch$default(this.serviceScope, null, null, new C56771(base, this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.service.websocket.WebSocketService$scheduleReconnect$1 */
    /* JADX INFO: compiled from: WebSocketService.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.service.websocket.WebSocketService$scheduleReconnect$1", m4426f = "WebSocketService.kt", m4427i = {}, m4428l = {177}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $base;
        int label;
        final /* synthetic */ WebSocketService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C56771(long j, WebSocketService webSocketService, Continuation<? super C56771> continuation) {
            super(2, continuation);
            this.$base = j;
            this.this$0 = webSocketService;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C56771(this.$base, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C56771 c56771;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (DelayKt.delay(this.$base + Random.INSTANCE.nextLong(0L, RangesKt___RangesKt.coerceAtLeast(this.$base / 3, 1L)), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c56771 = this;
                    break;
                    break;
                case 1:
                    c56771 = this;
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c56771.this$0.connectWebSocket();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.service.websocket.WebSocketService$startHeartbeat$1 */
    /* JADX INFO: compiled from: WebSocketService.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.service.websocket.WebSocketService$startHeartbeat$1", m4426f = "WebSocketService.kt", m4427i = {0}, m4428l = {187}, m4429m = "invokeSuspend", m4430n = {"$this$launch"}, m4431s = {"L$0"})
    static final class C56781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C56781(Continuation<? super C56781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C56781 c56781 = WebSocketService.this.new C56781(continuation);
            c56781.L$0 = obj;
            return c56781;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C56781 c56781;
            CoroutineScope $this$launch;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c56781 = this;
                    $this$launch = (CoroutineScope) c56781.L$0;
                    break;
                case 1:
                    c56781 = this;
                    $this$launch = (CoroutineScope) c56781.L$0;
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (CoroutineScopeKt.isActive($this$launch)) {
                WebSocketClient webSocketClient = WebSocketService.this.client;
                boolean z = false;
                if (webSocketClient != null && webSocketClient.isOpen()) {
                    z = true;
                }
                if (z) {
                    WebSocketService.this.sendPresenceStatus(CustomTabsCallback.ONLINE_EXTRAS_KEY);
                    c56781.L$0 = $this$launch;
                    c56781.label = 1;
                    if (DelayKt.delay(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, c56781) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startHeartbeat() {
        stopHeartbeat();
        this.heartbeatJob = BuildersKt__Builders_commonKt.launch$default(this.serviceScope, null, null, new C56781(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopHeartbeat() {
        Job job = this.heartbeatJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.heartbeatJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeCurrent(boolean scheduleReconnect) {
        Job job = this.connectJob;
        boolean z = true;
        Unit unit = null;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.connectJob = null;
        this.connecting = false;
        stopHeartbeat();
        WebSocketClient current = this.client;
        this.client = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            WebSocketService webSocketService = this;
            if (current == null || !current.isOpen()) {
                z = false;
            }
            if (z) {
                current.send("{\"type\":\"presence\",\"status\":\"offline\"}");
            }
            if (current != null) {
                current.close();
                unit = Unit.INSTANCE;
            }
            Result.m15551constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m15551constructorimpl(ResultKt.createFailure(th));
        }
        if (scheduleReconnect) {
            scheduleReconnect();
        }
    }

    /* JADX INFO: compiled from: WebSocketService.kt */
    @Metadata(m4415d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/service/websocket/WebSocketService$AppLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "(Lcom/blackhub/bronline/neizzir/service/websocket/WebSocketService;)V", "onStart", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private final class AppLifecycleObserver implements DefaultLifecycleObserver {
        public AppLifecycleObserver() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            WebSocketService.this.closeCurrent(false);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            WebSocketService.this.connectWebSocket();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendPresenceStatus(String status) {
        WebSocketClient current = this.client;
        if (current != null) {
            if (!current.isOpen()) {
                current = null;
            }
            if (current == null) {
                return;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                WebSocketService $this$sendPresenceStatus_u24lambda_u249 = this;
                current.send("{\"type\":\"presence\",\"status\":\"" + status + "\",\"id\":\"" + $this$sendPresenceStatus_u24lambda_u249.getAndroidId() + "\"}");
                Result.m15551constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m15551constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    private final String getAndroidId() {
        String string = Settings.Secure.getString(getApplicationContext().getContentResolver(), "android_id");
        return string == null ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAppInForegroundNow() {
        return ProcessLifecycleOwner.INSTANCE.get().getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isOnline() {
        ConnectivityManager connectivityManager = this.connectivityManager;
        ConnectivityManager connectivityManager2 = null;
        if (connectivityManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectivityManager");
            connectivityManager = null;
        }
        Network network = connectivityManager.getActiveNetwork();
        if (network == null) {
            return false;
        }
        ConnectivityManager connectivityManager3 = this.connectivityManager;
        if (connectivityManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectivityManager");
        } else {
            connectivityManager2 = connectivityManager3;
        }
        NetworkCapabilities capabilities = connectivityManager2.getNetworkCapabilities(network);
        return capabilities != null && capabilities.hasCapability(12) && capabilities.hasCapability(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void debug(String message) {
        if ((getApplicationInfo().flags & 2) != 0) {
            Log.d(TAG, message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: WebSocketService.kt */
    @Metadata(m4415d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/service/websocket/WebSocketService$Server;", "", "id", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    static final /* data */ class Server {
        private final String id;
        private final String url;

        public static /* synthetic */ Server copy$default(Server server, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = server.id;
            }
            if ((i & 2) != 0) {
                str2 = server.url;
            }
            return server.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Server copy(String id, String url) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(url, "url");
            return new Server(id, url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Server)) {
                return false;
            }
            Server server = (Server) other;
            return Intrinsics.areEqual(this.id, server.id) && Intrinsics.areEqual(this.url, server.url);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.url.hashCode();
        }

        public String toString() {
            return "Server(id=" + this.id + ", url=" + this.url + ')';
        }

        public Server(String id, String url) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(url, "url");
            this.id = id;
            this.url = url;
        }

        public final String getId() {
            return this.id;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: WebSocketService.kt */
    @Metadata(m4415d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/service/websocket/WebSocketService$Connected;", "", "server", "Lcom/blackhub/bronline/neizzir/service/websocket/WebSocketService$Server;", "client", "Lorg/java_websocket/client/WebSocketClient;", "(Lcom/blackhub/bronline/neizzir/service/websocket/WebSocketService$Server;Lorg/java_websocket/client/WebSocketClient;)V", "getClient", "()Lorg/java_websocket/client/WebSocketClient;", "getServer", "()Lcom/blackhub/bronline/neizzir/service/websocket/WebSocketService$Server;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    static final /* data */ class Connected {
        private final WebSocketClient client;
        private final Server server;

        public static /* synthetic */ Connected copy$default(Connected connected, Server server, WebSocketClient webSocketClient, int i, Object obj) {
            if ((i & 1) != 0) {
                server = connected.server;
            }
            if ((i & 2) != 0) {
                webSocketClient = connected.client;
            }
            return connected.copy(server, webSocketClient);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Server getServer() {
            return this.server;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final WebSocketClient getClient() {
            return this.client;
        }

        public final Connected copy(Server server, WebSocketClient client) {
            Intrinsics.checkNotNullParameter(server, "server");
            Intrinsics.checkNotNullParameter(client, "client");
            return new Connected(server, client);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Connected)) {
                return false;
            }
            Connected connected = (Connected) other;
            return Intrinsics.areEqual(this.server, connected.server) && Intrinsics.areEqual(this.client, connected.client);
        }

        public int hashCode() {
            return (this.server.hashCode() * 31) + this.client.hashCode();
        }

        public String toString() {
            return "Connected(server=" + this.server + ", client=" + this.client + ')';
        }

        public Connected(Server server, WebSocketClient client) {
            Intrinsics.checkNotNullParameter(server, "server");
            Intrinsics.checkNotNullParameter(client, "client");
            this.server = server;
            this.client = client;
        }

        public final WebSocketClient getClient() {
            return this.client;
        }

        public final Server getServer() {
            return this.server;
        }
    }
}
