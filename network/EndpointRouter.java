package com.blackhub.bronline.neizzir.network;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.p007ts.PsExtractor;
import com.blackhub.bronline.game.gui.donate.utils.DonateConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.CloseableKt;
import kotlin.p040io.FilesKt;
import kotlin.p040io.FilesKt__FileReadWriteKt;
import kotlin.p040io.FilesKt__UtilsKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.p043io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: EndpointRouter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 u2\u00020\u0001:\u0005tuvwxBW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f¢\u0006\u0002\u0010\u0010J\u0018\u0010\"\u001a\u0004\u0018\u00010\u000f2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u000fJ\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010#\u001a\u00020\rH\u0002J\u0015\u0010&\u001a\u0004\u0018\u00010\b2\u0006\u0010'\u001a\u00020\u0014¢\u0006\u0002\u0010(J\u0010\u0010)\u001a\u0004\u0018\u00010\u001c2\u0006\u0010'\u001a\u00020\u0014J,\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00152\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0015H\u0002J\u0012\u00101\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\rH\u0002JR\u00102\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010#\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00142\u0006\u00104\u001a\u0002052$\b\u0002\u00106\u001a\u001e\b\u0001\u0012\u0004\u0012\u000208\u0012\n\u0012\b\u0012\u0004\u0012\u00020+09\u0012\u0006\u0012\u0004\u0018\u00010\u000107H\u0086@¢\u0006\u0002\u0010:JZ\u0010;\u001a\u00020+2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u00172\u0006\u00104\u001a\u0002052\"\u00106\u001a\u001e\b\u0001\u0012\u0004\u0012\u000208\u0012\n\u0012\b\u0012\u0004\u0012\u00020+09\u0012\u0006\u0012\u0004\u0018\u00010\u000107H\u0082@¢\u0006\u0002\u0010=J\u0018\u0010>\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u000fH\u0002J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010#\u001a\u00020\rH\u0002J@\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\u0006\u0010#\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00142\u0006\u0010A\u001a\u00020\b2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020D0CH\u0082@¢\u0006\u0002\u0010EJ@\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\u0006\u0010#\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00142\u0006\u0010A\u001a\u00020\b2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020D0CH\u0082@¢\u0006\u0002\u0010EJN\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\u0006\u0010#\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00142\b\b\u0002\u0010H\u001a\u00020I2\b\b\u0002\u0010A\u001a\u00020\b2\u0014\b\u0002\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020D0CH\u0086@¢\u0006\u0002\u0010JJ:\u0010K\u001a\u00020/2\u0006\u0010#\u001a\u00020\r2\"\u0010L\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020/09\u0012\u0006\u0012\u0004\u0018\u00010\u000107H\u0082@¢\u0006\u0002\u0010MJ\u0018\u0010N\u001a\u00020D2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u000fH\u0002J\u0018\u0010O\u001a\u00020+2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u000fH\u0002J\u0018\u0010P\u001a\u00020+2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u000fH\u0002J\u0018\u0010Q\u001a\u00020/2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0002J\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010#\u001a\u00020\rH\u0002JP\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010#\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00142\u0006\u00104\u001a\u0002052\"\u00106\u001a\u001e\b\u0001\u0012\u0004\u0012\u000208\u0012\n\u0012\b\u0012\u0004\u0012\u00020+09\u0012\u0006\u0012\u0004\u0018\u00010\u000107H\u0082@¢\u0006\u0002\u0010:J\u0080\u0001\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\u0006\u0010#\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00142\f\u0010U\u001a\b\u0012\u0004\u0012\u00020W0V2\u0014\b\u0002\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010Y\u001a\u00020D2\u000e\b\u0002\u0010Z\u001a\b\u0012\u0004\u0012\u00020-0[2\b\b\u0002\u0010A\u001a\u00020\b2\u0014\b\u0002\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020D0CH\u0086@¢\u0006\u0002\u0010\\J\u000e\u0010]\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\rJ&\u0010^\u001a\u00020/2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\r2\u0006\u00103\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010_J\u0018\u0010`\u001a\u00020+2\u0006\u0010<\u001a\u00020\u00172\u0006\u0010a\u001a\u00020\u0017H\u0002JL\u0010b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\u0006\u0010#\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00142\u0006\u0010c\u001a\u00020\u00142\b\b\u0002\u0010A\u001a\u00020\b2\u0014\b\u0002\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020D0CH\u0086@¢\u0006\u0002\u0010dJ\u0016\u0010e\u001a\u00020+2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u000fJ\u0016\u0010f\u001a\u00020+2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u000fJ\u001e\u0010g\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\r2\u0006\u00103\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010hJ$\u0010i\u001a\b\u0012\u0004\u0012\u00020D0\u00162\u0006\u0010#\u001a\u00020\r2\u0006\u00103\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010hJ \u0010j\u001a\u00020k2\u0006\u0010#\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00142\b\b\u0002\u0010$\u001a\u00020\u000fJ\u0018\u0010l\u001a\u00020+2\u0006\u0010m\u001a\u00020\u00172\u0006\u00104\u001a\u000205H\u0002J\u0012\u0010n\u001a\u00020o*\u00020pH\u0082@¢\u0006\u0002\u0010qJ\u0014\u0010r\u001a\u00020\u001c*\u00020o2\u0006\u0010A\u001a\u00020\bH\u0002J\f\u0010s\u001a\u00020\u0014*\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00160\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006y"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/EndpointRouter;", "", "context", "Landroid/content/Context;", "apiClient", "Lokhttp3/OkHttpClient;", "downloadClient", "hedgeDelayMs", "", "preferenceTtlMs", "failureCooldownMs", "endpointOverrides", "", "Lcom/blackhub/bronline/neizzir/network/EndpointGroup;", "", "Lcom/blackhub/bronline/neizzir/network/Endpoint;", "(Landroid/content/Context;Lokhttp3/OkHttpClient;Lokhttp3/OkHttpClient;JJJLjava/util/Map;)V", "appContext", "downloadFlights", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlinx/coroutines/Deferred;", "Lcom/blackhub/bronline/neizzir/network/NetworkResult;", "Ljava/io/File;", "failedUntil", "lastGoodCache", "Lcom/blackhub/bronline/neizzir/network/EndpointRouter$LastGoodCache;", "metadataFlights", "", "preferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "routes", "Lcom/blackhub/bronline/neizzir/network/EndpointRouter$RouteState;", "alternateEndpoint", "group", "endpoint", "availableEndpoints", "cachedAgeMs", "key", "(Ljava/lang/String;)Ljava/lang/Long;", "cachedBytes", "cancelOther", "", FirebaseAnalytics.Param.INDEX, "", "first", "Lcom/blackhub/bronline/neizzir/network/EndpointRouter$Attempt;", "second", "currentState", "download", "path", "spec", "Lcom/blackhub/bronline/neizzir/network/DownloadSpec;", "onProgress", "Lkotlin/Function2;", "Lcom/blackhub/bronline/neizzir/network/DownloadProgress;", "Lkotlin/coroutines/Continuation;", "(Lcom/blackhub/bronline/neizzir/network/EndpointGroup;Ljava/lang/String;Lcom/blackhub/bronline/neizzir/network/DownloadSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadFromEndpoint", "partFile", "(Lcom/blackhub/bronline/neizzir/network/Endpoint;Lcom/blackhub/bronline/neizzir/network/EndpointGroup;Ljava/lang/String;Ljava/io/File;Lcom/blackhub/bronline/neizzir/network/DownloadSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endpointFailureKey", "endpoints", "fetchNetworkBytes", "maxBytes", "validator", "Lkotlin/Function1;", "", "(Lcom/blackhub/bronline/neizzir/network/EndpointGroup;Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSingleFlight", "getBytes", "cachePolicy", "Lcom/blackhub/bronline/neizzir/network/CachePolicy;", "(Lcom/blackhub/bronline/neizzir/network/EndpointGroup;Ljava/lang/String;Lcom/blackhub/bronline/neizzir/network/CachePolicy;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hedgedAttempt", "block", "(Lcom/blackhub/bronline/neizzir/network/EndpointGroup;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCoolingDown", "markFailure", "markSuccess", "mergeAttempts", "orderedEndpoints", "performDownload", "postBytes", "bodyFactory", "Lkotlin/Function0;", "Lokhttp3/RequestBody;", "headers", "readOnly", "retryHttpStatuses", "", "(Lcom/blackhub/bronline/neizzir/network/EndpointGroup;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/util/Map;ZLjava/util/Set;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "preferredEndpoint", "probe", "(Lcom/blackhub/bronline/neizzir/network/Endpoint;Lcom/blackhub/bronline/neizzir/network/EndpointGroup;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "publishAtomically", FirebaseAnalytics.Param.DESTINATION, "refreshBytes", "cacheKey", "(Lcom/blackhub/bronline/neizzir/network/EndpointGroup;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportFailure", "reportSuccess", "resolveEndpointForDownload", "(Lcom/blackhub/bronline/neizzir/network/EndpointGroup;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resourceExists", "urlFor", "Lokhttp3/HttpUrl;", "validateDownloadedFile", "file", "awaitResponse", "Lokhttp3/Response;", "Lokhttp3/Call;", "(Lokhttp3/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readBoundedBytes", "sha1", "Attempt", "Companion", "IndexedAttempt", "LastGoodCache", "RouteState", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class EndpointRouter {
    private static final long DEFAULT_FAILURE_COOLDOWN_MS = 60000;
    private static final long DEFAULT_HEDGE_DELAY_MS = 250;
    private static final long DEFAULT_MAX_METADATA_BYTES = 2097152;
    private static final long DEFAULT_PREFERENCE_TTL_MS = 1800000;
    private static final String PREFS_NAME = "network_routes";
    private static final String TAG = "EndpointRouter";
    private final OkHttpClient apiClient;
    private final Context appContext;
    private final OkHttpClient downloadClient;
    private final ConcurrentHashMap<String, Deferred<NetworkResult<File>>> downloadFlights;
    private final Map<EndpointGroup, List<Endpoint>> endpointOverrides;
    private final ConcurrentHashMap<String, Long> failedUntil;
    private final long failureCooldownMs;
    private final long hedgeDelayMs;
    private final LastGoodCache lastGoodCache;
    private final ConcurrentHashMap<String, Deferred<NetworkResult<byte[]>>> metadataFlights;
    private final long preferenceTtlMs;
    private final SharedPreferences preferences;
    private final ConcurrentHashMap<EndpointGroup, RouteState> routes;

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.network.EndpointRouter$downloadFromEndpoint$1 */
    /* JADX INFO: compiled from: EndpointRouter.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter", m4426f = "EndpointRouter.kt", m4427i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m4428l = {445, 466}, m4429m = "downloadFromEndpoint", m4430n = {"partFile", "spec", "onProgress", "cancellationHandle", TypedValues.CycleType.S_WAVE_OFFSET, "onProgress", "cancellationHandle", "downloaded", "input", "output", "buffer", "total"}, m4431s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$3", "L$5", "L$7", "L$8", "J$0"})
    static final class C56551 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        C56551(Continuation<? super C56551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EndpointRouter.this.downloadFromEndpoint(null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.network.EndpointRouter$fetchNetworkBytes$1 */
    /* JADX INFO: compiled from: EndpointRouter.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter", m4426f = "EndpointRouter.kt", m4427i = {0, 0}, m4428l = {275}, m4429m = "fetchNetworkBytes", m4430n = {"this", "group"}, m4431s = {"L$0", "L$1"})
    static final class C56561 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C56561(Continuation<? super C56561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EndpointRouter.this.fetchNetworkBytes(null, null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.network.EndpointRouter$hedgedAttempt$1 */
    /* JADX INFO: compiled from: EndpointRouter.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter", m4426f = "EndpointRouter.kt", m4427i = {1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5}, m4428l = {340, 347, 352, 693, 372, 372}, m4429m = "hedgedAttempt", m4430n = {"this", "group", "block", "endpoints", "raceScope", "first", "this", "raceScope", "early", "this", "group", "raceScope", "first", "second", "this", "raceScope", "firstFinished", "this", "raceScope", "firstFinished"}, m4431s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class C56601 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C56601(Continuation<? super C56601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EndpointRouter.this.hedgedAttempt(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.network.EndpointRouter$probe$1 */
    /* JADX INFO: compiled from: EndpointRouter.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter", m4426f = "EndpointRouter.kt", m4427i = {0, 0}, m4428l = {406}, m4429m = "probe", m4430n = {"endpoint", "cancellationHandle"}, m4431s = {"L$0", "L$1"})
    static final class C56641 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C56641(Continuation<? super C56641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EndpointRouter.this.probe(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.network.EndpointRouter$resolveEndpointForDownload$1 */
    /* JADX INFO: compiled from: EndpointRouter.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter", m4426f = "EndpointRouter.kt", m4427i = {0, 0}, m4428l = {PsExtractor.PRIVATE_STREAM_1}, m4429m = "resolveEndpointForDownload", m4430n = {"this", "group"}, m4431s = {"L$0", "L$1"})
    static final class C56671 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C56671(Continuation<? super C56671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EndpointRouter.this.resolveEndpointForDownload(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.network.EndpointRouter$resourceExists$1 */
    /* JADX INFO: compiled from: EndpointRouter.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter", m4426f = "EndpointRouter.kt", m4427i = {0, 0}, m4428l = {196}, m4429m = "resourceExists", m4430n = {"this", "group"}, m4431s = {"L$0", "L$1"})
    static final class C56681 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C56681(Continuation<? super C56681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EndpointRouter.this.resourceExists(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EndpointRouter(Context context, OkHttpClient apiClient, OkHttpClient downloadClient, long hedgeDelayMs, long preferenceTtlMs, long failureCooldownMs, Map<EndpointGroup, ? extends List<Endpoint>> endpointOverrides) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiClient, "apiClient");
        Intrinsics.checkNotNullParameter(downloadClient, "downloadClient");
        Intrinsics.checkNotNullParameter(endpointOverrides, "endpointOverrides");
        this.apiClient = apiClient;
        this.downloadClient = downloadClient;
        this.hedgeDelayMs = hedgeDelayMs;
        this.preferenceTtlMs = preferenceTtlMs;
        this.failureCooldownMs = failureCooldownMs;
        this.endpointOverrides = endpointOverrides;
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext == null ? context : applicationContext;
        this.preferences = this.appContext.getSharedPreferences(PREFS_NAME, 0);
        this.lastGoodCache = new LastGoodCache(new File(this.appContext.getCacheDir(), "network_last_good"));
        this.routes = new ConcurrentHashMap<>();
        this.failedUntil = new ConcurrentHashMap<>();
        this.metadataFlights = new ConcurrentHashMap<>();
        this.downloadFlights = new ConcurrentHashMap<>();
    }

    public /* synthetic */ EndpointRouter(Context context, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, long j, long j2, long j3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, okHttpClient, okHttpClient2, (i & 8) != 0 ? 250L : j, (i & 16) != 0 ? 1800000L : j2, (i & 32) != 0 ? 60000L : j3, (i & 64) != 0 ? MapsKt__MapsKt.emptyMap() : map);
    }

    public final Endpoint preferredEndpoint(EndpointGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        return (Endpoint) CollectionsKt___CollectionsKt.first((List) orderedEndpoints(group));
    }

    public final Endpoint alternateEndpoint(EndpointGroup group, Endpoint endpoint) {
        Object element$iv;
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Iterable $this$firstOrNull$iv = endpoints(group);
        Iterator it = $this$firstOrNull$iv.iterator();
        while (it.hasNext()) {
            element$iv = it.next();
            Endpoint it2 = (Endpoint) element$iv;
            if (!Intrinsics.areEqual(it2.getId(), endpoint.getId())) {
                return (Endpoint) element$iv;
            }
        }
        element$iv = null;
        return (Endpoint) element$iv;
    }

    public static /* synthetic */ HttpUrl urlFor$default(EndpointRouter endpointRouter, EndpointGroup endpointGroup, String str, Endpoint endpoint, int i, Object obj) {
        if ((i & 4) != 0) {
            endpoint = endpointRouter.preferredEndpoint(endpointGroup);
        }
        return endpointRouter.urlFor(endpointGroup, str, endpoint);
    }

    public final HttpUrl urlFor(EndpointGroup group, String path, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        HttpUrl base = HttpUrl.INSTANCE.get(StringsKt.trimEnd(endpoint.getBaseUrl(), FileSystemKt.UnixPathSeparator));
        String relative = StringsKt__StringsKt.trimStart(path, FileSystemKt.UnixPathSeparator);
        String encodedPath = StringsKt__StringsKt.substringBefore$default(relative, '?', (String) null, 2, (Object) null);
        String encodedQuery = StringsKt__StringsKt.contains$default((CharSequence) relative, '?', false, 2, (Object) null) ? StringsKt__StringsKt.substringAfter(relative, '?', "") : null;
        HttpUrl.Builder $this$urlFor_u24lambda_u242 = base.newBuilder().addEncodedPathSegments(encodedPath);
        if (encodedQuery != null) {
            $this$urlFor_u24lambda_u242.encodedQuery(encodedQuery);
        }
        return $this$urlFor_u24lambda_u242.build();
    }

    public final byte[] cachedBytes(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        LastGoodCache.Entry entry = this.lastGoodCache.read(key);
        if (entry != null) {
            return entry.getBytes();
        }
        return null;
    }

    public final Long cachedAgeMs(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        LastGoodCache.Entry cached = this.lastGoodCache.read(key);
        if (cached == null) {
            return null;
        }
        return Long.valueOf(RangesKt___RangesKt.coerceAtLeast(System.currentTimeMillis() - cached.getSavedAtMs(), 0L));
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.network.EndpointRouter$getBytes$3 */
    /* JADX INFO: compiled from: EndpointRouter.kt */
    @Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/network/NetworkResult;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter$getBytes$3", m4426f = "EndpointRouter.kt", m4427i = {0}, m4428l = {97}, m4429m = "invokeSuspend", m4430n = {"cached"}, m4431s = {"L$0"})
    static final class C56593 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super NetworkResult<? extends byte[]>>, Object> {
        final /* synthetic */ CachePolicy $cachePolicy;
        final /* synthetic */ EndpointGroup $group;
        final /* synthetic */ long $maxBytes;
        final /* synthetic */ String $path;
        final /* synthetic */ Function1<byte[], Boolean> $validator;
        Object L$0;
        int label;
        final /* synthetic */ EndpointRouter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C56593(CachePolicy cachePolicy, EndpointRouter endpointRouter, EndpointGroup endpointGroup, String str, long j, Function1<? super byte[], Boolean> function1, Continuation<? super C56593> continuation) {
            super(2, continuation);
            this.$cachePolicy = cachePolicy;
            this.this$0 = endpointRouter;
            this.$group = endpointGroup;
            this.$path = str;
            this.$maxBytes = j;
            this.$validator = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C56593(this.$cachePolicy, this.this$0, this.$group, this.$path, this.$maxBytes, this.$validator, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkResult<? extends byte[]>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super NetworkResult<byte[]>>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super NetworkResult<byte[]>> continuation) {
            return ((C56593) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LastGoodCache.Entry cached;
            C56593 c56593;
            Object $result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    CachePolicy cachePolicy = this.$cachePolicy;
                    CachePolicy.LastKnownGood it = cachePolicy instanceof CachePolicy.LastKnownGood ? (CachePolicy.LastKnownGood) cachePolicy : null;
                    cached = it != null ? this.this$0.lastGoodCache.read(it.getKey()) : null;
                    if (cached == null || System.currentTimeMillis() - cached.getSavedAtMs() > ((CachePolicy.LastKnownGood) this.$cachePolicy).getFreshForMs()) {
                        this.L$0 = cached;
                        this.label = 1;
                        Object objFetchSingleFlight = this.this$0.fetchSingleFlight(this.$group, this.$path, this.$maxBytes, this.$validator, this);
                        if (objFetchSingleFlight == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c56593 = this;
                        $result = objFetchSingleFlight;
                    } else {
                        return new NetworkResult.Success(cached.getBytes(), null, NetworkSource.CACHE, false, 8, null);
                    }
                    break;
                case 1:
                    c56593 = this;
                    $result = obj;
                    LastGoodCache.Entry cached2 = (LastGoodCache.Entry) c56593.L$0;
                    ResultKt.throwOnFailure($result);
                    cached = cached2;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            NetworkResult result = (NetworkResult) $result;
            if (result instanceof NetworkResult.Success) {
                if (c56593.$cachePolicy instanceof CachePolicy.LastKnownGood) {
                    c56593.this$0.lastGoodCache.write(((CachePolicy.LastKnownGood) c56593.$cachePolicy).getKey(), (byte[]) ((NetworkResult.Success) result).getValue());
                    return result;
                }
                return result;
            }
            if (result instanceof NetworkResult.Failure) {
                if (cached == null || !c56593.$validator.invoke(cached.getBytes()).booleanValue()) {
                    return result;
                }
                return new NetworkResult.Success(cached.getBytes(), null, NetworkSource.CACHE, true);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final Object getBytes(EndpointGroup group, String path, CachePolicy cachePolicy, long maxBytes, Function1<? super byte[], Boolean> function1, Continuation<? super NetworkResult<byte[]>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C56593(cachePolicy, this, group, path, maxBytes, function1, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object refreshBytes$default(EndpointRouter endpointRouter, EndpointGroup endpointGroup, String str, String str2, long j, Function1 function1, Continuation continuation, int i, Object obj) {
        long j2;
        Function1 function2;
        if ((i & 8) == 0) {
            j2 = j;
        } else {
            j2 = 2097152;
        }
        if ((i & 16) == 0) {
            function2 = function1;
        } else {
            function2 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.network.EndpointRouter.refreshBytes.2
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(byte[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(!(it.length == 0));
                }
            };
        }
        return endpointRouter.refreshBytes(endpointGroup, str, str2, j2, function2, continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.network.EndpointRouter$refreshBytes$3 */
    /* JADX INFO: compiled from: EndpointRouter.kt */
    @Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/network/NetworkResult;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter$refreshBytes$3", m4426f = "EndpointRouter.kt", m4427i = {}, m4428l = {127}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56663 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super NetworkResult<? extends byte[]>>, Object> {
        final /* synthetic */ String $cacheKey;
        final /* synthetic */ EndpointGroup $group;
        final /* synthetic */ long $maxBytes;
        final /* synthetic */ String $path;
        final /* synthetic */ Function1<byte[], Boolean> $validator;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C56663(EndpointGroup endpointGroup, String str, long j, Function1<? super byte[], Boolean> function1, String str2, Continuation<? super C56663> continuation) {
            super(2, continuation);
            this.$group = endpointGroup;
            this.$path = str;
            this.$maxBytes = j;
            this.$validator = function1;
            this.$cacheKey = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EndpointRouter.this.new C56663(this.$group, this.$path, this.$maxBytes, this.$validator, this.$cacheKey, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkResult<? extends byte[]>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super NetworkResult<byte[]>>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super NetworkResult<byte[]>> continuation) {
            return ((C56663) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C56663 c56663;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c56663 = this;
                    c56663.label = 1;
                    Object objFetchSingleFlight = EndpointRouter.this.fetchSingleFlight(c56663.$group, c56663.$path, c56663.$maxBytes, c56663.$validator, c56663);
                    if (objFetchSingleFlight == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objFetchSingleFlight;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c56663 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            NetworkResult result = (NetworkResult) $result;
            if (result instanceof NetworkResult.Success) {
                EndpointRouter.this.lastGoodCache.write(c56663.$cacheKey, (byte[]) ((NetworkResult.Success) result).getValue());
            }
            return result;
        }
    }

    public final Object refreshBytes(EndpointGroup group, String path, String cacheKey, long maxBytes, Function1<? super byte[], Boolean> function1, Continuation<? super NetworkResult<byte[]>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C56663(group, path, maxBytes, function1, cacheKey, null), continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.network.EndpointRouter$postBytes$3 */
    /* JADX INFO: compiled from: EndpointRouter.kt */
    @Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/network/NetworkResult;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter$postBytes$3", m4426f = "EndpointRouter.kt", m4427i = {0, 0, 0}, m4428l = {156}, m4429m = "invokeSuspend", m4430n = {"errors", "lastCause", "endpoint"}, m4431s = {"L$0", "L$1", "L$3"})
    static final class C56633 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super NetworkResult<? extends byte[]>>, Object> {
        final /* synthetic */ Function0<RequestBody> $bodyFactory;
        final /* synthetic */ EndpointGroup $group;
        final /* synthetic */ Map<String, String> $headers;
        final /* synthetic */ long $maxBytes;
        final /* synthetic */ String $path;
        final /* synthetic */ boolean $readOnly;
        final /* synthetic */ Set<Integer> $retryHttpStatuses;
        final /* synthetic */ Function1<byte[], Boolean> $validator;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C56633(EndpointGroup endpointGroup, boolean z, String str, Function0<? extends RequestBody> function0, Map<String, String> map, Set<Integer> set, long j, Function1<? super byte[], Boolean> function1, Continuation<? super C56633> continuation) {
            super(2, continuation);
            this.$group = endpointGroup;
            this.$readOnly = z;
            this.$path = str;
            this.$bodyFactory = function0;
            this.$headers = map;
            this.$retryHttpStatuses = set;
            this.$maxBytes = j;
            this.$validator = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EndpointRouter.this.new C56633(this.$group, this.$readOnly, this.$path, this.$bodyFactory, this.$headers, this.$retryHttpStatuses, this.$maxBytes, this.$validator, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkResult<? extends byte[]>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super NetworkResult<byte[]>>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super NetworkResult<byte[]>> continuation) {
            return ((C56633) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x006a  */
        /* JADX WARN: Code duplicated, block: B:23:0x00a3 A[LOOP:0: B:21:0x009d->B:23:0x00a3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:27:0x00e9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:32:0x010c A[Catch: all -> 0x01d1, TryCatch #0 {all -> 0x01d1, blocks: (B:30:0x00fa, B:32:0x010c, B:34:0x0114, B:36:0x011c, B:41:0x012e, B:43:0x0135, B:47:0x0160, B:60:0x01ad, B:48:0x0164, B:52:0x0170, B:54:0x0180, B:56:0x019f, B:59:0x01a9, B:63:0x01ba), top: B:87:0x00fa }] */
        /* JADX WARN: Code duplicated, block: B:40:0x012d  */
        /* JADX WARN: Code duplicated, block: B:43:0x0135 A[Catch: all -> 0x01d1, TryCatch #0 {all -> 0x01d1, blocks: (B:30:0x00fa, B:32:0x010c, B:34:0x0114, B:36:0x011c, B:41:0x012e, B:43:0x0135, B:47:0x0160, B:60:0x01ad, B:48:0x0164, B:52:0x0170, B:54:0x0180, B:56:0x019f, B:59:0x01a9, B:63:0x01ba), top: B:87:0x00fa }] */
        /* JADX WARN: Code duplicated, block: B:45:0x015d A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:51:0x016e  */
        /* JADX WARN: Code duplicated, block: B:54:0x0180 A[Catch: all -> 0x01d1, TryCatch #0 {all -> 0x01d1, blocks: (B:30:0x00fa, B:32:0x010c, B:34:0x0114, B:36:0x011c, B:41:0x012e, B:43:0x0135, B:47:0x0160, B:60:0x01ad, B:48:0x0164, B:52:0x0170, B:54:0x0180, B:56:0x019f, B:59:0x01a9, B:63:0x01ba), top: B:87:0x00fa }] */
        /* JADX WARN: Code duplicated, block: B:56:0x019f A[Catch: all -> 0x01d1, TRY_LEAVE, TryCatch #0 {all -> 0x01d1, blocks: (B:30:0x00fa, B:32:0x010c, B:34:0x0114, B:36:0x011c, B:41:0x012e, B:43:0x0135, B:47:0x0160, B:60:0x01ad, B:48:0x0164, B:52:0x0170, B:54:0x0180, B:56:0x019f, B:59:0x01a9, B:63:0x01ba), top: B:87:0x00fa }] */
        /* JADX WARN: Code duplicated, block: B:59:0x01a9 A[Catch: all -> 0x01d1, TRY_ENTER, TryCatch #0 {all -> 0x01d1, blocks: (B:30:0x00fa, B:32:0x010c, B:34:0x0114, B:36:0x011c, B:41:0x012e, B:43:0x0135, B:47:0x0160, B:60:0x01ad, B:48:0x0164, B:52:0x0170, B:54:0x0180, B:56:0x019f, B:59:0x01a9, B:63:0x01ba), top: B:87:0x00fa }] */
        /* JADX WARN: Code duplicated, block: B:63:0x01ba A[Catch: all -> 0x01d1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01d1, blocks: (B:30:0x00fa, B:32:0x010c, B:34:0x0114, B:36:0x011c, B:41:0x012e, B:43:0x0135, B:47:0x0160, B:60:0x01ad, B:48:0x0164, B:52:0x0170, B:54:0x0180, B:56:0x019f, B:59:0x01a9, B:63:0x01ba), top: B:87:0x00fa }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ea -> B:92:0x00ec). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x021d -> B:18:0x0064). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 562
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.network.EndpointRouter.C56633.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Object postBytes(EndpointGroup group, String path, Function0<? extends RequestBody> function0, Map<String, String> map, boolean readOnly, Set<Integer> set, long maxBytes, Function1<? super byte[], Boolean> function1, Continuation<? super NetworkResult<byte[]>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C56633(group, readOnly, path, function0, map, set, maxBytes, function1, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object resolveEndpointForDownload(EndpointGroup group, String path, Continuation<? super Endpoint> continuation) throws Throwable {
        C56671 c56671;
        EndpointRouter endpointRouter;
        Object objHedgedAttempt;
        if (continuation instanceof C56671) {
            c56671 = (C56671) continuation;
            if ((c56671.label & Integer.MIN_VALUE) != 0) {
                c56671.label -= Integer.MIN_VALUE;
            } else {
                c56671 = new C56671(continuation);
            }
        } else {
            c56671 = new C56671(continuation);
        }
        C56671 c56672 = c56671;
        Object $result = c56672.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c56672.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                endpointRouter = this;
                EndpointRouter$resolveEndpointForDownload$probe$1 endpointRouter$resolveEndpointForDownload$probe$1 = new EndpointRouter$resolveEndpointForDownload$probe$1(endpointRouter, group, path, null);
                c56672.L$0 = endpointRouter;
                c56672.L$1 = group;
                c56672.label = 1;
                objHedgedAttempt = endpointRouter.hedgedAttempt(group, endpointRouter$resolveEndpointForDownload$probe$1, c56672);
                if (objHedgedAttempt == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                group = (EndpointGroup) c56672.L$1;
                EndpointRouter endpointRouter2 = (EndpointRouter) c56672.L$0;
                ResultKt.throwOnFailure($result);
                endpointRouter = endpointRouter2;
                objHedgedAttempt = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Attempt probe = (Attempt) objHedgedAttempt;
        if (probe instanceof Attempt.Success) {
            Endpoint it = probe.getEndpoint();
            endpointRouter.markSuccess(group, it);
            return it;
        }
        if (probe instanceof Attempt.Failure) {
            return endpointRouter.preferredEndpoint(group);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object resourceExists(EndpointGroup group, String path, Continuation<? super NetworkResult<Boolean>> continuation) throws Throwable {
        C56681 c56681;
        EndpointRouter endpointRouter;
        Object objHedgedAttempt;
        if (continuation instanceof C56681) {
            c56681 = (C56681) continuation;
            if ((c56681.label & Integer.MIN_VALUE) != 0) {
                c56681.label -= Integer.MIN_VALUE;
            } else {
                c56681 = new C56681(continuation);
            }
        } else {
            c56681 = new C56681(continuation);
        }
        C56681 c56682 = c56681;
        Object $result = c56682.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c56682.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                endpointRouter = this;
                EndpointRouter$resourceExists$result$1 endpointRouter$resourceExists$result$1 = new EndpointRouter$resourceExists$result$1(endpointRouter, group, path, null);
                c56682.L$0 = endpointRouter;
                c56682.L$1 = group;
                c56682.label = 1;
                objHedgedAttempt = endpointRouter.hedgedAttempt(group, endpointRouter$resourceExists$result$1, c56682);
                if (objHedgedAttempt == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                group = (EndpointGroup) c56682.L$1;
                EndpointRouter endpointRouter2 = (EndpointRouter) c56682.L$0;
                ResultKt.throwOnFailure($result);
                endpointRouter = endpointRouter2;
                objHedgedAttempt = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Attempt result = (Attempt) objHedgedAttempt;
        if (result instanceof Attempt.Success) {
            endpointRouter.markSuccess(group, result.getEndpoint());
            return new NetworkResult.Success(Boxing.boxBoolean(true), result.getEndpoint(), NetworkSource.NETWORK, false, 8, null);
        }
        if (result instanceof Attempt.Failure) {
            if (((Attempt.Failure) result).getRetryable()) {
                endpointRouter.markFailure(group, result.getEndpoint());
            }
            return new NetworkResult.Failure(((Attempt.Failure) result).getErrors(), ((Attempt.Failure) result).getCause());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object download$default(EndpointRouter endpointRouter, EndpointGroup endpointGroup, String str, DownloadSpec downloadSpec, Function2 function2, Continuation continuation, int i, Object obj) {
        Function2 c56532;
        if ((i & 8) == 0) {
            c56532 = function2;
        } else {
            c56532 = new C56532(null);
        }
        return endpointRouter.download(endpointGroup, str, downloadSpec, c56532, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.network.EndpointRouter$download$2 */
    /* JADX INFO: compiled from: EndpointRouter.kt */
    @Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "it", "Lcom/blackhub/bronline/neizzir/network/DownloadProgress;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter$download$2", m4426f = "EndpointRouter.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    public static final class C56532 extends SuspendLambda implements Function2<DownloadProgress, Continuation<? super Unit>, Object> {
        int label;

        C56532(Continuation<? super C56532> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C56532(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DownloadProgress downloadProgress, Continuation<? super Unit> continuation) {
            return ((C56532) create(downloadProgress, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.network.EndpointRouter$download$3 */
    /* JADX INFO: compiled from: EndpointRouter.kt */
    @Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/network/NetworkResult;", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter$download$3", m4426f = "EndpointRouter.kt", m4427i = {0, 0, 0}, m4428l = {220}, m4429m = "invokeSuspend", m4430n = {"key", "candidate", AppMeasurementSdk.ConditionalUserProperty.ACTIVE}, m4431s = {"L$0", "L$1", "L$2"})
    static final class C56543 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super NetworkResult<? extends File>>, Object> {
        final /* synthetic */ EndpointGroup $group;
        final /* synthetic */ Function2<DownloadProgress, Continuation<? super Unit>, Object> $onProgress;
        final /* synthetic */ String $path;
        final /* synthetic */ DownloadSpec $spec;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ EndpointRouter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C56543(EndpointGroup endpointGroup, String str, DownloadSpec downloadSpec, EndpointRouter endpointRouter, Function2<? super DownloadProgress, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C56543> continuation) {
            super(2, continuation);
            this.$group = endpointGroup;
            this.$path = str;
            this.$spec = downloadSpec;
            this.this$0 = endpointRouter;
            this.$onProgress = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C56543 c56543 = new C56543(this.$group, this.$path, this.$spec, this.this$0, this.$onProgress, continuation);
            c56543.L$0 = obj;
            return c56543;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkResult<? extends File>> continuation) {
            return ((C56543) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:23:0x0100  */
        /* JADX WARN: Code duplicated, block: B:31:0x0112  */
        /* JADX WARN: Code duplicated, block: B:33:0x011d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws Throwable {
            C56543 c56543;
            String key;
            Deferred candidate;
            Deferred active;
            String key2;
            Object $result2;
            Object $result3;
            Deferred candidate2;
            Deferred candidate3;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c56543 = this;
                    CoroutineScope $this$coroutineScope = (CoroutineScope) c56543.L$0;
                    key = c56543.$group.name() + AbstractJsonLexerKt.COLON + c56543.$path + AbstractJsonLexerKt.COLON + c56543.$spec.getDestination().getAbsolutePath() + AbstractJsonLexerKt.COLON + c56543.$spec.getExpectedSize() + AbstractJsonLexerKt.COLON + c56543.$spec.getExpectedSha1() + AbstractJsonLexerKt.COLON + c56543.$spec.getExpectedSha256();
                    candidate = BuildersKt__Builders_commonKt.async$default($this$coroutineScope, null, CoroutineStart.LAZY, new EndpointRouter$download$3$candidate$1(c56543.this$0, c56543.$group, c56543.$path, c56543.$spec, c56543.$onProgress, null), 1, null);
                    active = (Deferred) c56543.this$0.downloadFlights.putIfAbsent(key, candidate);
                    if (active == null) {
                        active = candidate;
                        active.start();
                    }
                    Intrinsics.checkNotNull(active);
                    try {
                        c56543.L$0 = key;
                        c56543.L$1 = candidate;
                        c56543.L$2 = active;
                        c56543.label = 1;
                        Object objAwait = active.await(c56543);
                        if (objAwait == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Deferred deferred = active;
                        $result2 = $result;
                        $result3 = objAwait;
                        candidate2 = candidate;
                        candidate3 = deferred;
                        try {
                            Object $result4 = (NetworkResult) $result3;
                            if (candidate3 == candidate2) {
                                c56543.this$0.downloadFlights.remove(key, candidate2);
                            }
                            if (candidate2 != candidate3) {
                                Job.DefaultImpls.cancel$default((Job) candidate2, (CancellationException) null, 1, (Object) null);
                            }
                            return $result4;
                        } catch (Throwable th) {
                            th = th;
                            active = candidate3;
                            candidate = candidate2;
                            key2 = key;
                            if (active == candidate) {
                                c56543.this$0.downloadFlights.remove(key2, candidate);
                            }
                            if (candidate != active) {
                                Job.DefaultImpls.cancel$default((Job) candidate, (CancellationException) null, 1, (Object) null);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        key2 = key;
                        if (active == candidate) {
                            c56543.this$0.downloadFlights.remove(key2, candidate);
                        }
                        if (candidate != active) {
                            Job.DefaultImpls.cancel$default((Job) candidate, (CancellationException) null, 1, (Object) null);
                        }
                        throw th;
                    }
                case 1:
                    c56543 = this;
                    $result3 = $result;
                    active = (Deferred) c56543.L$2;
                    candidate = (Deferred) c56543.L$1;
                    key2 = (String) c56543.L$0;
                    try {
                        ResultKt.throwOnFailure($result3);
                        key = key2;
                        candidate2 = candidate;
                        candidate3 = active;
                        $result2 = $result3;
                        Object $result5 = (NetworkResult) $result3;
                        if (candidate3 == candidate2) {
                            c56543.this$0.downloadFlights.remove(key, candidate2);
                        }
                        if (candidate2 != candidate3) {
                            Job.DefaultImpls.cancel$default((Job) candidate2, (CancellationException) null, 1, (Object) null);
                        }
                        return $result5;
                    } catch (Throwable th3) {
                        th = th3;
                        if (active == candidate) {
                            c56543.this$0.downloadFlights.remove(key2, candidate);
                        }
                        if (candidate != active) {
                            Job.DefaultImpls.cancel$default((Job) candidate, (CancellationException) null, 1, (Object) null);
                        }
                        throw th;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Object download(EndpointGroup group, String path, DownloadSpec spec, Function2<? super DownloadProgress, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super NetworkResult<? extends File>> continuation) {
        return CoroutineScopeKt.coroutineScope(new C56543(group, path, spec, this, function2, null), continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.network.EndpointRouter$performDownload$2 */
    /* JADX INFO: compiled from: EndpointRouter.kt */
    @Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/network/NetworkResult;", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter$performDownload$2", m4426f = "EndpointRouter.kt", m4427i = {1, 1, 1}, m4428l = {233, 242}, m4429m = "invokeSuspend", m4430n = {"partFile", "errors", "endpoint"}, m4431s = {"L$0", "L$1", "L$3"})
    static final class C56612 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super NetworkResult<? extends File>>, Object> {
        final /* synthetic */ EndpointGroup $group;
        final /* synthetic */ Function2<DownloadProgress, Continuation<? super Unit>, Object> $onProgress;
        final /* synthetic */ String $path;
        final /* synthetic */ DownloadSpec $spec;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C56612(EndpointGroup endpointGroup, String str, DownloadSpec downloadSpec, Function2<? super DownloadProgress, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C56612> continuation) {
            super(2, continuation);
            this.$group = endpointGroup;
            this.$path = str;
            this.$spec = downloadSpec;
            this.$onProgress = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EndpointRouter.this.new C56612(this.$group, this.$path, this.$spec, this.$onProgress, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkResult<? extends File>> continuation) {
            return ((C56612) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(4:42|88|43|44) */
        /* JADX WARN: Can't wrap try/catch for region: R(8:35|36|78|37|38|74|39|(1:41)(4:42|88|43|44)) */
        /* JADX WARN: Code duplicated, block: B:21:0x0088  */
        /* JADX WARN: Code duplicated, block: B:28:0x00fb A[Catch: CancellationException -> 0x01f5, TryCatch #9 {CancellationException -> 0x01f5, blocks: (B:25:0x00e2, B:26:0x00f5, B:28:0x00fb, B:30:0x010e, B:31:0x0112), top: B:82:0x00e2 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x012a A[Catch: CancellationException -> 0x01ee, TRY_LEAVE, TryCatch #5 {CancellationException -> 0x01ee, blocks: (B:33:0x0124, B:35:0x012a), top: B:80:0x0124 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x0155 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:42:0x0156  */
        /* JADX WARN: Code duplicated, block: B:56:0x01b8 A[Catch: CancellationException -> 0x01d6, TryCatch #10 {CancellationException -> 0x01d6, blocks: (B:54:0x019c, B:56:0x01b8, B:57:0x01c0), top: B:84:0x019c }] */
        /* JADX WARN: Code duplicated, block: B:67:0x01e5  */
        /* JADX WARN: Code duplicated, block: B:91:0x009e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x0082 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:96:0x010e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:98:0x00f5 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0188, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0189, code lost:
        
            r5 = r12;
            r6 = r13;
            r7 = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x018d, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x018e, code lost:
        
            r8 = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0190, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0191, code lost:
        
            r15 = r5;
            r5 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0195, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0196, code lost:
        
            r15 = r5;
            r5 = r8;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0156 -> B:88:0x015b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0191 -> B:53:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0196 -> B:53:0x019b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 516
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.network.EndpointRouter.C56612.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object performDownload(EndpointGroup group, String path, DownloadSpec spec, Function2<? super DownloadProgress, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super NetworkResult<? extends File>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C56612(group, path, spec, function2, null), continuation);
    }

    public final void reportSuccess(EndpointGroup group, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        markSuccess(group, endpoint);
    }

    public final void reportFailure(EndpointGroup group, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        markFailure(group, endpoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object fetchNetworkBytes(EndpointGroup group, String path, long maxBytes, Function1<? super byte[], Boolean> function1, Continuation<? super NetworkResult<byte[]>> continuation) throws Throwable {
        C56561 c56561;
        EndpointRouter endpointRouter;
        Object objHedgedAttempt;
        EndpointGroup group2;
        if (continuation instanceof C56561) {
            C56561 c56562 = (C56561) continuation;
            if ((c56562.label & Integer.MIN_VALUE) != 0) {
                c56562.label -= Integer.MIN_VALUE;
                c56561 = c56562;
            } else {
                c56561 = new C56561(continuation);
            }
        } else {
            c56561 = new C56561(continuation);
        }
        Object $result = c56561.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c56561.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                endpointRouter = this;
                EndpointRouter$fetchNetworkBytes$result$1 endpointRouter$fetchNetworkBytes$result$1 = new EndpointRouter$fetchNetworkBytes$result$1(endpointRouter, group, path, maxBytes, function1, null);
                c56561.L$0 = endpointRouter;
                c56561.L$1 = group;
                c56561.label = 1;
                objHedgedAttempt = endpointRouter.hedgedAttempt(group, endpointRouter$fetchNetworkBytes$result$1, c56561);
                if (objHedgedAttempt == coroutine_suspended) {
                    return coroutine_suspended;
                }
                group2 = group;
                break;
                break;
            case 1:
                group2 = (EndpointGroup) c56561.L$1;
                endpointRouter = (EndpointRouter) c56561.L$0;
                ResultKt.throwOnFailure($result);
                objHedgedAttempt = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Attempt result = (Attempt) objHedgedAttempt;
        if (result instanceof Attempt.Success) {
            endpointRouter.markSuccess(group2, result.getEndpoint());
            return new NetworkResult.Success(((Attempt.Success) result).getBytes(), result.getEndpoint(), NetworkSource.NETWORK, false, 8, null);
        }
        if (result instanceof Attempt.Failure) {
            if (((Attempt.Failure) result).getRetryable()) {
                endpointRouter.markFailure(group2, result.getEndpoint());
            }
            return new NetworkResult.Failure(((Attempt.Failure) result).getErrors(), ((Attempt.Failure) result).getCause());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.network.EndpointRouter$fetchSingleFlight$2 */
    /* JADX INFO: compiled from: EndpointRouter.kt */
    @Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/network/NetworkResult;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter$fetchSingleFlight$2", m4426f = "EndpointRouter.kt", m4427i = {0, 0, 0}, m4428l = {328}, m4429m = "invokeSuspend", m4430n = {"key", "candidate", AppMeasurementSdk.ConditionalUserProperty.ACTIVE}, m4431s = {"L$0", "L$1", "L$2"})
    static final class C56572 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super NetworkResult<? extends byte[]>>, Object> {
        final /* synthetic */ EndpointGroup $group;
        final /* synthetic */ long $maxBytes;
        final /* synthetic */ String $path;
        final /* synthetic */ Function1<byte[], Boolean> $validator;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ EndpointRouter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C56572(EndpointGroup endpointGroup, String str, long j, Function1<? super byte[], Boolean> function1, EndpointRouter endpointRouter, Continuation<? super C56572> continuation) {
            super(2, continuation);
            this.$group = endpointGroup;
            this.$path = str;
            this.$maxBytes = j;
            this.$validator = function1;
            this.this$0 = endpointRouter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C56572 c56572 = new C56572(this.$group, this.$path, this.$maxBytes, this.$validator, this.this$0, continuation);
            c56572.L$0 = obj;
            return c56572;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkResult<? extends byte[]>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super NetworkResult<byte[]>>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super NetworkResult<byte[]>> continuation) {
            return ((C56572) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:23:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:31:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:33:0x00fd  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws Throwable {
            C56572 c56572;
            String key;
            Deferred candidate;
            Deferred active;
            String key2;
            Object $result2;
            Object $result3;
            Deferred candidate2;
            Deferred candidate3;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c56572 = this;
                    CoroutineScope $this$coroutineScope = (CoroutineScope) c56572.L$0;
                    key = c56572.$group.name() + AbstractJsonLexerKt.COLON + c56572.$path + AbstractJsonLexerKt.COLON + c56572.$maxBytes + AbstractJsonLexerKt.COLON + c56572.$validator.getClass().getName();
                    candidate = BuildersKt__Builders_commonKt.async$default($this$coroutineScope, null, CoroutineStart.LAZY, new EndpointRouter$fetchSingleFlight$2$candidate$1(c56572.this$0, c56572.$group, c56572.$path, c56572.$maxBytes, c56572.$validator, null), 1, null);
                    active = (Deferred) c56572.this$0.metadataFlights.putIfAbsent(key, candidate);
                    if (active == null) {
                        active = candidate;
                        active.start();
                    }
                    Intrinsics.checkNotNull(active);
                    try {
                        c56572.L$0 = key;
                        c56572.L$1 = candidate;
                        c56572.L$2 = active;
                        c56572.label = 1;
                        Object objAwait = active.await(c56572);
                        if (objAwait == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Deferred deferred = active;
                        $result2 = $result;
                        $result3 = objAwait;
                        candidate2 = candidate;
                        candidate3 = deferred;
                        try {
                            Object $result4 = (NetworkResult) $result3;
                            if (candidate3 == candidate2) {
                                c56572.this$0.metadataFlights.remove(key, candidate2);
                            }
                            if (candidate2 != candidate3) {
                                Job.DefaultImpls.cancel$default((Job) candidate2, (CancellationException) null, 1, (Object) null);
                            }
                            return $result4;
                        } catch (Throwable th) {
                            th = th;
                            active = candidate3;
                            candidate = candidate2;
                            key2 = key;
                            if (active == candidate) {
                                c56572.this$0.metadataFlights.remove(key2, candidate);
                            }
                            if (candidate != active) {
                                Job.DefaultImpls.cancel$default((Job) candidate, (CancellationException) null, 1, (Object) null);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        key2 = key;
                        if (active == candidate) {
                            c56572.this$0.metadataFlights.remove(key2, candidate);
                        }
                        if (candidate != active) {
                            Job.DefaultImpls.cancel$default((Job) candidate, (CancellationException) null, 1, (Object) null);
                        }
                        throw th;
                    }
                case 1:
                    c56572 = this;
                    $result3 = $result;
                    active = (Deferred) c56572.L$2;
                    candidate = (Deferred) c56572.L$1;
                    key2 = (String) c56572.L$0;
                    try {
                        ResultKt.throwOnFailure($result3);
                        key = key2;
                        candidate2 = candidate;
                        candidate3 = active;
                        $result2 = $result3;
                        Object $result5 = (NetworkResult) $result3;
                        if (candidate3 == candidate2) {
                            c56572.this$0.metadataFlights.remove(key, candidate2);
                        }
                        if (candidate2 != candidate3) {
                            Job.DefaultImpls.cancel$default((Job) candidate2, (CancellationException) null, 1, (Object) null);
                        }
                        return $result5;
                    } catch (Throwable th3) {
                        th = th3;
                        if (active == candidate) {
                            c56572.this$0.metadataFlights.remove(key2, candidate);
                        }
                        if (candidate != active) {
                            Job.DefaultImpls.cancel$default((Job) candidate, (CancellationException) null, 1, (Object) null);
                        }
                        throw th;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchSingleFlight(EndpointGroup group, String path, long maxBytes, Function1<? super byte[], Boolean> function1, Continuation<? super NetworkResult<byte[]>> continuation) {
        return CoroutineScopeKt.coroutineScope(new C56572(group, path, maxBytes, function1, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x012d A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #2 {all -> 0x008e, blocks: (B:13:0x0042, B:16:0x0055, B:24:0x0088, B:59:0x0167, B:45:0x0129, B:47:0x012d, B:51:0x0135, B:55:0x0142, B:62:0x0172), top: B:96:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0131  */
    /* JADX WARN: Code duplicated, block: B:51:0x0135 A[Catch: all -> 0x008e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x008e, blocks: (B:13:0x0042, B:16:0x0055, B:24:0x0088, B:59:0x0167, B:45:0x0129, B:47:0x012d, B:51:0x0135, B:55:0x0142, B:62:0x0172), top: B:96:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0142 A[Catch: all -> 0x008e, TRY_ENTER, TryCatch #2 {all -> 0x008e, blocks: (B:13:0x0042, B:16:0x0055, B:24:0x0088, B:59:0x0167, B:45:0x0129, B:47:0x012d, B:51:0x0135, B:55:0x0142, B:62:0x0172), top: B:96:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0165 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0166  */
    /* JADX WARN: Code duplicated, block: B:62:0x0172 A[Catch: all -> 0x008e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x008e, blocks: (B:13:0x0042, B:16:0x0055, B:24:0x0088, B:59:0x0167, B:45:0x0129, B:47:0x012d, B:51:0x0135, B:55:0x0142, B:62:0x0172), top: B:96:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e3 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:88:0x0258, B:89:0x025a, B:83:0x023e, B:19:0x0072, B:67:0x01d9, B:69:0x01e3, B:72:0x01f4, B:74:0x0205, B:77:0x0216, B:79:0x0227, B:84:0x0241, B:41:0x00f2), top: B:96:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01f4 A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #1 {all -> 0x0078, blocks: (B:88:0x0258, B:89:0x025a, B:83:0x023e, B:19:0x0072, B:67:0x01d9, B:69:0x01e3, B:72:0x01f4, B:74:0x0205, B:77:0x0216, B:79:0x0227, B:84:0x0241, B:41:0x00f2), top: B:96:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0205 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:88:0x0258, B:89:0x025a, B:83:0x023e, B:19:0x0072, B:67:0x01d9, B:69:0x01e3, B:72:0x01f4, B:74:0x0205, B:77:0x0216, B:79:0x0227, B:84:0x0241, B:41:0x00f2), top: B:96:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0216 A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #1 {all -> 0x0078, blocks: (B:88:0x0258, B:89:0x025a, B:83:0x023e, B:19:0x0072, B:67:0x01d9, B:69:0x01e3, B:72:0x01f4, B:74:0x0205, B:77:0x0216, B:79:0x0227, B:84:0x0241, B:41:0x00f2), top: B:96:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0227 A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:88:0x0258, B:89:0x025a, B:83:0x023e, B:19:0x0072, B:67:0x01d9, B:69:0x01e3, B:72:0x01f4, B:74:0x0205, B:77:0x0216, B:79:0x0227, B:84:0x0241, B:41:0x00f2), top: B:96:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x023b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x023c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0241 A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:88:0x0258, B:89:0x025a, B:83:0x023e, B:19:0x0072, B:67:0x01d9, B:69:0x01e3, B:72:0x01f4, B:74:0x0205, B:77:0x0216, B:79:0x0227, B:84:0x0241, B:41:0x00f2), top: B:96:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0255 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x0256  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0079: MOVE (r4 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY] A[D('raceScope' kotlinx.coroutines.CoroutineScope)]), block:B:22:0x0079 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.coroutines.CoroutineScope] */
    public final Object hedgedAttempt(EndpointGroup group, Function2<? super Endpoint, ? super Continuation<? super Attempt>, ? extends Object> function2, Continuation<? super Attempt> continuation) throws Throwable {
        C56601 c56601;
        CoroutineScope raceScope;
        Function2<? super Endpoint, ? super Continuation<? super Attempt>, ? extends Object> function3;
        List<Endpoint> listAvailableEndpoints;
        Deferred<? extends Attempt> deferredAsync$default;
        Object objWithTimeoutOrNull;
        EndpointRouter endpointRouter;
        CoroutineScope raceScope2;
        EndpointGroup group2;
        Attempt early;
        Deferred<? extends Attempt> deferredAsync$default2;
        Object objDoSelect;
        EndpointRouter endpointRouter2;
        CoroutineScope raceScope3;
        Deferred<? extends Attempt> deferred;
        EndpointGroup group3;
        Object objInvoke;
        Attempt early2;
        IndexedAttempt firstFinished;
        Attempt attempt;
        Object objAwait;
        IndexedAttempt firstFinished2;
        EndpointRouter endpointRouter3;
        Object objAwait2;
        Attempt attempt2;
        if (continuation instanceof C56601) {
            c56601 = (C56601) continuation;
            if ((c56601.label & Integer.MIN_VALUE) != 0) {
                c56601.label -= Integer.MIN_VALUE;
            } else {
                c56601 = new C56601(continuation);
            }
        } else {
            c56601 = new C56601(continuation);
        }
        Object $result = c56601.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r4 = c56601.label;
        try {
            try {
                switch (r4) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        function3 = function2;
                        listAvailableEndpoints = availableEndpoints(group);
                        if (listAvailableEndpoints.size() == 1) {
                            Object objFirst = CollectionsKt___CollectionsKt.first((List<? extends Object>) listAvailableEndpoints);
                            c56601.label = 1;
                            Object objInvoke2 = function3.invoke(objFirst, c56601);
                            return objInvoke2 == coroutine_suspended ? coroutine_suspended : objInvoke2;
                        }
                        CoroutineScope raceScope4 = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
                        deferredAsync$default = BuildersKt__Builders_commonKt.async$default(raceScope4, null, null, new EndpointRouter$hedgedAttempt$first$1(function3, listAvailableEndpoints, null), 3, null);
                        long j = this.hedgeDelayMs;
                        EndpointRouter$hedgedAttempt$early$1 endpointRouter$hedgedAttempt$early$1 = new EndpointRouter$hedgedAttempt$early$1(deferredAsync$default, null);
                        c56601.L$0 = this;
                        c56601.L$1 = group;
                        c56601.L$2 = function3;
                        c56601.L$3 = listAvailableEndpoints;
                        c56601.L$4 = raceScope4;
                        c56601.L$5 = deferredAsync$default;
                        c56601.label = 2;
                        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j, endpointRouter$hedgedAttempt$early$1, c56601);
                        if (objWithTimeoutOrNull == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        endpointRouter = this;
                        raceScope2 = raceScope4;
                        group2 = group;
                        early = (Attempt) objWithTimeoutOrNull;
                        if (early != null) {
                            if (early instanceof Attempt.Success) {
                                CoroutineScopeKt.cancel$default(raceScope2, null, 1, null);
                                return early;
                            }
                            if (!((Attempt.Failure) early).getRetryable()) {
                                CoroutineScopeKt.cancel$default(raceScope2, null, 1, null);
                                return early;
                            }
                            endpointRouter.markFailure(group2, ((Attempt.Failure) early).getEndpoint());
                            Endpoint endpoint = listAvailableEndpoints.get(1);
                            c56601.L$0 = endpointRouter;
                            c56601.L$1 = raceScope2;
                            c56601.L$2 = early;
                            c56601.L$3 = null;
                            c56601.L$4 = null;
                            c56601.L$5 = null;
                            c56601.label = 3;
                            objInvoke = function3.invoke(endpoint, c56601);
                            if (objInvoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            early2 = early;
                            Attempt second = (Attempt) objInvoke;
                            Attempt attemptMergeAttempts = endpointRouter.mergeAttempts(early2, second);
                            CoroutineScopeKt.cancel$default(raceScope2, null, 1, null);
                            return attemptMergeAttempts;
                        }
                        deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(raceScope2, null, null, new EndpointRouter$hedgedAttempt$second$1(function3, listAvailableEndpoints, null), 3, null);
                        SelectImplementation $this$select_u24lambda_u241$iv = new SelectImplementation(c56601.getContext());
                        SelectImplementation $this$hedgedAttempt_u24lambda_u244 = $this$select_u24lambda_u241$iv;
                        $this$hedgedAttempt_u24lambda_u244.invoke(deferredAsync$default.getOnAwait(), new EndpointRouter$hedgedAttempt$firstFinished$1$1(null));
                        $this$hedgedAttempt_u24lambda_u244.invoke(deferredAsync$default2.getOnAwait(), new EndpointRouter$hedgedAttempt$firstFinished$1$2(null));
                        c56601.L$0 = endpointRouter;
                        c56601.L$1 = group2;
                        c56601.L$2 = raceScope2;
                        c56601.L$3 = deferredAsync$default;
                        c56601.L$4 = deferredAsync$default2;
                        c56601.L$5 = null;
                        c56601.label = 4;
                        objDoSelect = $this$select_u24lambda_u241$iv.doSelect(c56601);
                        if (objDoSelect == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        endpointRouter2 = endpointRouter;
                        EndpointGroup endpointGroup = group2;
                        raceScope3 = raceScope2;
                        deferred = deferredAsync$default;
                        group3 = endpointGroup;
                        firstFinished = (IndexedAttempt) objDoSelect;
                        if (firstFinished.getAttempt() instanceof Attempt.Success) {
                            endpointRouter2.cancelOther(firstFinished.getIndex(), deferred, deferredAsync$default2);
                            Attempt attempt3 = firstFinished.getAttempt();
                            CoroutineScopeKt.cancel$default(raceScope3, null, 1, null);
                            return attempt3;
                        }
                        attempt = firstFinished.getAttempt();
                        Intrinsics.checkNotNull(attempt, "null cannot be cast to non-null type com.blackhub.bronline.neizzir.network.EndpointRouter.Attempt.Failure");
                        if (!((Attempt.Failure) attempt).getRetryable()) {
                            endpointRouter2.cancelOther(firstFinished.getIndex(), deferred, deferredAsync$default2);
                            Attempt attempt4 = firstFinished.getAttempt();
                            CoroutineScopeKt.cancel$default(raceScope3, null, 1, null);
                            return attempt4;
                        }
                        endpointRouter2.markFailure(group3, firstFinished.getAttempt().getEndpoint());
                        if (firstFinished.getIndex() == 0) {
                            c56601.L$0 = endpointRouter2;
                            c56601.L$1 = raceScope3;
                            c56601.L$2 = firstFinished;
                            c56601.L$3 = null;
                            c56601.L$4 = null;
                            c56601.label = 5;
                            objAwait2 = deferredAsync$default2.await(c56601);
                            if (objAwait2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            firstFinished2 = firstFinished;
                            endpointRouter3 = endpointRouter2;
                            attempt2 = (Attempt) objAwait2;
                            Attempt remaining = attempt2;
                            Attempt attemptMergeAttempts2 = endpointRouter3.mergeAttempts(firstFinished2.getAttempt(), remaining);
                            CoroutineScopeKt.cancel$default(raceScope3, null, 1, null);
                            return attemptMergeAttempts2;
                        }
                        c56601.L$0 = endpointRouter2;
                        c56601.L$1 = raceScope3;
                        c56601.L$2 = firstFinished;
                        c56601.L$3 = null;
                        c56601.L$4 = null;
                        c56601.label = 6;
                        objAwait = deferred.await(c56601);
                        if (objAwait == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        firstFinished2 = firstFinished;
                        endpointRouter3 = endpointRouter2;
                        attempt2 = (Attempt) objAwait;
                        Attempt remaining2 = attempt2;
                        Attempt attemptMergeAttempts3 = endpointRouter3.mergeAttempts(firstFinished2.getAttempt(), remaining2);
                        CoroutineScopeKt.cancel$default(raceScope3, null, 1, null);
                        return attemptMergeAttempts3;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        return $result;
                    case 2:
                        Deferred<? extends Attempt> deferred2 = (Deferred) c56601.L$5;
                        CoroutineScope raceScope5 = (CoroutineScope) c56601.L$4;
                        listAvailableEndpoints = (List) c56601.L$3;
                        function3 = (Function2) c56601.L$2;
                        group2 = (EndpointGroup) c56601.L$1;
                        EndpointRouter endpointRouter4 = (EndpointRouter) c56601.L$0;
                        try {
                            ResultKt.throwOnFailure($result);
                            objWithTimeoutOrNull = $result;
                            deferredAsync$default = deferred2;
                            raceScope2 = raceScope5;
                            endpointRouter = endpointRouter4;
                            early = (Attempt) objWithTimeoutOrNull;
                            if (early != null) {
                                if (early instanceof Attempt.Success) {
                                    CoroutineScopeKt.cancel$default(raceScope2, null, 1, null);
                                    return early;
                                }
                                if (!((Attempt.Failure) early).getRetryable()) {
                                    CoroutineScopeKt.cancel$default(raceScope2, null, 1, null);
                                    return early;
                                }
                                endpointRouter.markFailure(group2, ((Attempt.Failure) early).getEndpoint());
                                Endpoint endpoint2 = listAvailableEndpoints.get(1);
                                c56601.L$0 = endpointRouter;
                                c56601.L$1 = raceScope2;
                                c56601.L$2 = early;
                                c56601.L$3 = null;
                                c56601.L$4 = null;
                                c56601.L$5 = null;
                                c56601.label = 3;
                                objInvoke = function3.invoke(endpoint2, c56601);
                                if (objInvoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                early2 = early;
                                Attempt second2 = (Attempt) objInvoke;
                                Attempt attemptMergeAttempts4 = endpointRouter.mergeAttempts(early2, second2);
                                CoroutineScopeKt.cancel$default(raceScope2, null, 1, null);
                                return attemptMergeAttempts4;
                            }
                            deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(raceScope2, null, null, new EndpointRouter$hedgedAttempt$second$1(function3, listAvailableEndpoints, null), 3, null);
                            SelectImplementation $this$select_u24lambda_u241$iv2 = new SelectImplementation(c56601.getContext());
                            SelectImplementation $this$hedgedAttempt_u24lambda_u245 = $this$select_u24lambda_u241$iv2;
                            $this$hedgedAttempt_u24lambda_u245.invoke(deferredAsync$default.getOnAwait(), new EndpointRouter$hedgedAttempt$firstFinished$1$1(null));
                            $this$hedgedAttempt_u24lambda_u245.invoke(deferredAsync$default2.getOnAwait(), new EndpointRouter$hedgedAttempt$firstFinished$1$2(null));
                            c56601.L$0 = endpointRouter;
                            c56601.L$1 = group2;
                            c56601.L$2 = raceScope2;
                            c56601.L$3 = deferredAsync$default;
                            c56601.L$4 = deferredAsync$default2;
                            c56601.L$5 = null;
                            c56601.label = 4;
                            objDoSelect = $this$select_u24lambda_u241$iv2.doSelect(c56601);
                            if (objDoSelect == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            endpointRouter2 = endpointRouter;
                            EndpointGroup endpointGroup2 = group2;
                            raceScope3 = raceScope2;
                            deferred = deferredAsync$default;
                            group3 = endpointGroup2;
                            firstFinished = (IndexedAttempt) objDoSelect;
                            if (firstFinished.getAttempt() instanceof Attempt.Success) {
                                endpointRouter2.cancelOther(firstFinished.getIndex(), deferred, deferredAsync$default2);
                                Attempt attempt5 = firstFinished.getAttempt();
                                CoroutineScopeKt.cancel$default(raceScope3, null, 1, null);
                                return attempt5;
                            }
                            attempt = firstFinished.getAttempt();
                            Intrinsics.checkNotNull(attempt, "null cannot be cast to non-null type com.blackhub.bronline.neizzir.network.EndpointRouter.Attempt.Failure");
                            if (!((Attempt.Failure) attempt).getRetryable()) {
                                endpointRouter2.cancelOther(firstFinished.getIndex(), deferred, deferredAsync$default2);
                                Attempt attempt6 = firstFinished.getAttempt();
                                CoroutineScopeKt.cancel$default(raceScope3, null, 1, null);
                                return attempt6;
                            }
                            endpointRouter2.markFailure(group3, firstFinished.getAttempt().getEndpoint());
                            if (firstFinished.getIndex() == 0) {
                                c56601.L$0 = endpointRouter2;
                                c56601.L$1 = raceScope3;
                                c56601.L$2 = firstFinished;
                                c56601.L$3 = null;
                                c56601.L$4 = null;
                                c56601.label = 5;
                                objAwait2 = deferredAsync$default2.await(c56601);
                                if (objAwait2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                firstFinished2 = firstFinished;
                                endpointRouter3 = endpointRouter2;
                                attempt2 = (Attempt) objAwait2;
                                Attempt remaining3 = attempt2;
                                Attempt attemptMergeAttempts5 = endpointRouter3.mergeAttempts(firstFinished2.getAttempt(), remaining3);
                                CoroutineScopeKt.cancel$default(raceScope3, null, 1, null);
                                return attemptMergeAttempts5;
                            }
                            c56601.L$0 = endpointRouter2;
                            c56601.L$1 = raceScope3;
                            c56601.L$2 = firstFinished;
                            c56601.L$3 = null;
                            c56601.L$4 = null;
                            c56601.label = 6;
                            objAwait = deferred.await(c56601);
                            if (objAwait == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            firstFinished2 = firstFinished;
                            endpointRouter3 = endpointRouter2;
                            attempt2 = (Attempt) objAwait;
                            Attempt remaining4 = attempt2;
                            Attempt attemptMergeAttempts6 = endpointRouter3.mergeAttempts(firstFinished2.getAttempt(), remaining4);
                            CoroutineScopeKt.cancel$default(raceScope3, null, 1, null);
                            return attemptMergeAttempts6;
                        } catch (Throwable th) {
                            th = th;
                            r4 = raceScope5;
                            CoroutineScopeKt.cancel$default(r4, null, 1, null);
                            throw th;
                        }
                    case 3:
                        early2 = (Attempt) c56601.L$2;
                        raceScope2 = (CoroutineScope) c56601.L$1;
                        endpointRouter = (EndpointRouter) c56601.L$0;
                        ResultKt.throwOnFailure($result);
                        objInvoke = $result;
                        Attempt second3 = (Attempt) objInvoke;
                        Attempt attemptMergeAttempts7 = endpointRouter.mergeAttempts(early2, second3);
                        CoroutineScopeKt.cancel$default(raceScope2, null, 1, null);
                        return attemptMergeAttempts7;
                    case 4:
                        deferredAsync$default2 = (Deferred) c56601.L$4;
                        deferred = (Deferred) c56601.L$3;
                        raceScope3 = (CoroutineScope) c56601.L$2;
                        group3 = (EndpointGroup) c56601.L$1;
                        endpointRouter2 = (EndpointRouter) c56601.L$0;
                        ResultKt.throwOnFailure($result);
                        objDoSelect = $result;
                        firstFinished = (IndexedAttempt) objDoSelect;
                        if (firstFinished.getAttempt() instanceof Attempt.Success) {
                            endpointRouter2.cancelOther(firstFinished.getIndex(), deferred, deferredAsync$default2);
                            Attempt attempt7 = firstFinished.getAttempt();
                            CoroutineScopeKt.cancel$default(raceScope3, null, 1, null);
                            return attempt7;
                        }
                        attempt = firstFinished.getAttempt();
                        Intrinsics.checkNotNull(attempt, "null cannot be cast to non-null type com.blackhub.bronline.neizzir.network.EndpointRouter.Attempt.Failure");
                        if (!((Attempt.Failure) attempt).getRetryable()) {
                            endpointRouter2.cancelOther(firstFinished.getIndex(), deferred, deferredAsync$default2);
                            Attempt attempt8 = firstFinished.getAttempt();
                            CoroutineScopeKt.cancel$default(raceScope3, null, 1, null);
                            return attempt8;
                        }
                        endpointRouter2.markFailure(group3, firstFinished.getAttempt().getEndpoint());
                        if (firstFinished.getIndex() == 0) {
                            c56601.L$0 = endpointRouter2;
                            c56601.L$1 = raceScope3;
                            c56601.L$2 = firstFinished;
                            c56601.L$3 = null;
                            c56601.L$4 = null;
                            c56601.label = 5;
                            objAwait2 = deferredAsync$default2.await(c56601);
                            if (objAwait2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            firstFinished2 = firstFinished;
                            endpointRouter3 = endpointRouter2;
                            attempt2 = (Attempt) objAwait2;
                            Attempt remaining5 = attempt2;
                            Attempt attemptMergeAttempts8 = endpointRouter3.mergeAttempts(firstFinished2.getAttempt(), remaining5);
                            CoroutineScopeKt.cancel$default(raceScope3, null, 1, null);
                            return attemptMergeAttempts8;
                        }
                        c56601.L$0 = endpointRouter2;
                        c56601.L$1 = raceScope3;
                        c56601.L$2 = firstFinished;
                        c56601.L$3 = null;
                        c56601.L$4 = null;
                        c56601.label = 6;
                        objAwait = deferred.await(c56601);
                        if (objAwait == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        firstFinished2 = firstFinished;
                        endpointRouter3 = endpointRouter2;
                        attempt2 = (Attempt) objAwait;
                        Attempt remaining6 = attempt2;
                        Attempt attemptMergeAttempts9 = endpointRouter3.mergeAttempts(firstFinished2.getAttempt(), remaining6);
                        CoroutineScopeKt.cancel$default(raceScope3, null, 1, null);
                        return attemptMergeAttempts9;
                    case 5:
                        firstFinished2 = (IndexedAttempt) c56601.L$2;
                        CoroutineScope raceScope6 = (CoroutineScope) c56601.L$1;
                        endpointRouter3 = (EndpointRouter) c56601.L$0;
                        ResultKt.throwOnFailure($result);
                        raceScope3 = raceScope6;
                        objAwait2 = $result;
                        attempt2 = (Attempt) objAwait2;
                        Attempt remaining7 = attempt2;
                        Attempt attemptMergeAttempts10 = endpointRouter3.mergeAttempts(firstFinished2.getAttempt(), remaining7);
                        CoroutineScopeKt.cancel$default(raceScope3, null, 1, null);
                        return attemptMergeAttempts10;
                    case 6:
                        firstFinished2 = (IndexedAttempt) c56601.L$2;
                        CoroutineScope raceScope7 = (CoroutineScope) c56601.L$1;
                        endpointRouter3 = (EndpointRouter) c56601.L$0;
                        ResultKt.throwOnFailure($result);
                        raceScope3 = raceScope7;
                        objAwait = $result;
                        attempt2 = (Attempt) objAwait;
                        Attempt remaining8 = attempt2;
                        Attempt attemptMergeAttempts11 = endpointRouter3.mergeAttempts(firstFinished2.getAttempt(), remaining8);
                        CoroutineScopeKt.cancel$default(raceScope3, null, 1, null);
                        return attemptMergeAttempts11;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            r4 = raceScope;
        }
    }

    private final void cancelOther(int index, Deferred<? extends Attempt> first, Deferred<? extends Attempt> second) {
        Job.DefaultImpls.cancel$default((Job) (index == 0 ? second : first), (CancellationException) null, 1, (Object) null);
    }

    private final Attempt mergeAttempts(Attempt first, Attempt second) {
        if (second instanceof Attempt.Success) {
            return second;
        }
        if (first instanceof Attempt.Success) {
            return first;
        }
        Intrinsics.checkNotNull(first, "null cannot be cast to non-null type com.blackhub.bronline.neizzir.network.EndpointRouter.Attempt.Failure");
        Intrinsics.checkNotNull(second, "null cannot be cast to non-null type com.blackhub.bronline.neizzir.network.EndpointRouter.Attempt.Failure");
        Endpoint endpoint = second.getEndpoint();
        String message = ((Attempt.Failure) second).getMessage();
        Throwable cause = ((Attempt.Failure) second).getCause();
        if (cause == null) {
            cause = ((Attempt.Failure) first).getCause();
        }
        return new Attempt.Failure(endpoint, message, cause, CollectionsKt___CollectionsKt.plus((Collection) ((Attempt.Failure) first).getErrors(), (Iterable) ((Attempt.Failure) second).getErrors()), false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x0129  */
    /* JADX WARN: Code duplicated, block: B:68:0x0169 A[Catch: all -> 0x018e, TryCatch #8 {all -> 0x018e, blocks: (B:66:0x0161, B:68:0x0169, B:69:0x0171, B:77:0x018d), top: B:91:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0184 A[PHI: r4 r17
  0x0184: PHI (r4v6 kotlinx.coroutines.DisposableHandle) = (r4v5 kotlinx.coroutines.DisposableHandle), (r4v7 kotlinx.coroutines.DisposableHandle) binds: [B:70:0x0182, B:50:0x014a] A[DONT_GENERATE, DONT_INLINE]
  0x0184: PHI (r17v3 java.lang.Object) = (r17v1 com.blackhub.bronline.neizzir.network.EndpointRouter$Attempt$Failure), (r17v4 java.lang.Object) binds: [B:70:0x0182, B:50:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int, kotlinx.coroutines.DisposableHandle] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.Closeable] */
    public final Object probe(Endpoint endpoint, EndpointGroup endpointGroup, String str, Continuation<? super Attempt> continuation) {
        C56641 c56641;
        Endpoint endpoint2;
        DisposableHandle disposableHandle;
        Throwable th;
        Object objAwaitResponse;
        Endpoint endpoint3;
        String message;
        Attempt.Failure failure;
        Closeable closeable;
        Throwable th2;
        ?? r6;
        Response response;
        boolean z;
        if (continuation instanceof C56641) {
            c56641 = (C56641) continuation;
            if ((c56641.label & Integer.MIN_VALUE) != 0) {
                c56641.label -= Integer.MIN_VALUE;
            } else {
                c56641 = new C56641(continuation);
            }
        } else {
            c56641 = new C56641(continuation);
        }
        Object obj = c56641.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r4 = c56641.label;
        ?? r7 = 1;
        try {
            switch (r4) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    final Call callNewCall = this.apiClient.newCall(new Request.Builder().url(urlFor(endpointGroup, str, endpoint)).header(HttpHeaders.RANGE, "bytes=0-0").get().build());
                    Job job = (Job) c56641.getContext().get(Job.INSTANCE);
                    DisposableHandle disposableHandleInvokeOnCompletion = job != null ? job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: com.blackhub.bronline.neizzir.network.EndpointRouter$probe$cancellationHandle$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th3) {
                            invoke2(th3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Throwable cause) {
                            if (cause instanceof CancellationException) {
                                callNewCall.cancel();
                            }
                        }
                    }) : null;
                    try {
                        c56641.L$0 = endpoint;
                        c56641.L$1 = disposableHandleInvokeOnCompletion;
                        c56641.label = 1;
                        objAwaitResponse = awaitResponse(callNewCall, c56641);
                        if (objAwaitResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        endpoint3 = endpoint;
                        disposableHandle = disposableHandleInvokeOnCompletion;
                        try {
                            closeable = (Closeable) objAwaitResponse;
                            try {
                                response = (Response) closeable;
                                try {
                                    if (!response.getIsSuccessful() || response.code() == 206) {
                                        failure = new Attempt.Success(endpoint3, new byte[0]);
                                        r7 = closeable;
                                    } else {
                                        String str2 = "HTTP " + response.code();
                                        if (CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(403), Boxing.boxInt(DonateConstants.ACTION_SEND_ERROR), Boxing.boxInt(408), Boxing.boxInt(429)}).contains(Boxing.boxInt(response.code()))) {
                                            z = true;
                                        } else {
                                            try {
                                                if (response.code() >= 500) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                            } catch (Throwable th3) {
                                                th2 = th3;
                                                r6 = closeable;
                                                try {
                                                    throw th2;
                                                } catch (Throwable th4) {
                                                    CloseableKt.closeFinally(r6, th2);
                                                    throw th4;
                                                }
                                            }
                                        }
                                        r7 = closeable;
                                        failure = new Attempt.Failure(endpoint3, str2, null, null, z, 12, null);
                                    }
                                    CloseableKt.closeFinally(r7, null);
                                    if (disposableHandle != null) {
                                        disposableHandle.dispose();
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    th2 = th;
                                    r6 = r7;
                                    throw th2;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                r7 = closeable;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            endpoint2 = endpoint3;
                            message = th.getMessage();
                            if (message == null) {
                                message = th.getClass().getSimpleName();
                            }
                            String str3 = message;
                            Intrinsics.checkNotNull(str3);
                            failure = new Attempt.Failure(endpoint2, str3, th, null, false, 24, null);
                            if (disposableHandle != null) {
                            }
                            return failure;
                        }
                        return failure;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th8) {
                        endpoint2 = endpoint;
                        disposableHandle = disposableHandleInvokeOnCompletion;
                        th = th8;
                        message = th.getMessage();
                        if (message == null) {
                            message = th.getClass().getSimpleName();
                        }
                        String str4 = message;
                        Intrinsics.checkNotNull(str4);
                        failure = new Attempt.Failure(endpoint2, str4, th, null, false, 24, null);
                        if (disposableHandle != null) {
                            disposableHandle.dispose();
                        }
                        return failure;
                    }
                case 1:
                    disposableHandle = (DisposableHandle) c56641.L$1;
                    Endpoint endpoint4 = (Endpoint) c56641.L$0;
                    try {
                        try {
                            ResultKt.throwOnFailure(obj);
                            objAwaitResponse = obj;
                            endpoint3 = endpoint4;
                            closeable = (Closeable) objAwaitResponse;
                            response = (Response) closeable;
                            if (response.getIsSuccessful()) {
                            }
                            failure = new Attempt.Success(endpoint3, new byte[0]);
                            r7 = closeable;
                            CloseableKt.closeFinally(r7, null);
                            if (disposableHandle != null) {
                                disposableHandle.dispose();
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            endpoint2 = endpoint4;
                            message = th.getMessage();
                            if (message == null) {
                                message = th.getClass().getSimpleName();
                            }
                            String str5 = message;
                            Intrinsics.checkNotNull(str5);
                            failure = new Attempt.Failure(endpoint2, str5, th, null, false, 24, null);
                            if (disposableHandle != null) {
                                disposableHandle.dispose();
                            }
                            return failure;
                        }
                        return failure;
                    } catch (CancellationException e2) {
                        throw e2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th10) {
            if (r4 != 0) {
                r4.dispose();
            }
            throw th10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:90:0x023c A[Catch: all -> 0x0307, TRY_LEAVE, TryCatch #3 {all -> 0x0307, blocks: (B:88:0x0226, B:90:0x023c, B:94:0x0263, B:101:0x02b1), top: B:160:0x0226 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0278 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:97:0x0279  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0279 -> B:98:0x0291). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object downloadFromEndpoint(com.blackhub.bronline.neizzir.network.Endpoint r25, com.blackhub.bronline.neizzir.network.EndpointGroup r26, java.lang.String r27, java.io.File r28, com.blackhub.bronline.neizzir.network.DownloadSpec r29, kotlin.jvm.functions.Function2<? super com.blackhub.bronline.neizzir.network.DownloadProgress, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r30, kotlin.coroutines.Continuation<? super kotlin.Unit> r31) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.network.EndpointRouter.downloadFromEndpoint(com.blackhub.bronline.neizzir.network.Endpoint, com.blackhub.bronline.neizzir.network.EndpointGroup, java.lang.String, java.io.File, com.blackhub.bronline.neizzir.network.DownloadSpec, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateDownloadedFile(File file, DownloadSpec spec) throws NoSuchAlgorithmException, IOException {
        if (!file.isFile() || file.length() == 0) {
            throw new IOException("Empty download");
        }
        Long expectedSize = spec.getExpectedSize();
        if (expectedSize != null) {
            long expected = expectedSize.longValue();
            if (file.length() != expected) {
                throw new IOException("Size mismatch: " + file.length() + " != " + expected);
            }
        }
        String expected2 = spec.getExpectedSha256();
        if (expected2 != null) {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileInputStream input = fileInputStream;
                byte[] buffer = new byte[65536];
                while (true) {
                    int count = input.read(buffer);
                    if (count < 0) {
                        break;
                    } else {
                        digest.update(buffer, 0, count);
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileInputStream, null);
                byte[] bArrDigest = digest.digest();
                Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                String actual = ArraysKt___ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.blackhub.bronline.neizzir.network.EndpointRouter$validateDownloadedFile$2$actual$1
                    public final CharSequence invoke(byte it) {
                        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(it)}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        return str;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                        return invoke(b.byteValue());
                    }
                }, 30, (Object) null);
                if (!StringsKt__StringsJVMKt.equals(actual, expected2, true)) {
                    file.delete();
                    throw new IOException("SHA-256 mismatch");
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileInputStream, th);
                    throw th2;
                }
            }
        }
        String it = spec.getExpectedSha1();
        if (it != null) {
            String expected3 = StringsKt__StringsKt.isBlank(it) ? null : it;
            if (expected3 != null) {
                String actual2 = sha1(file);
                if (!StringsKt__StringsJVMKt.equals(actual2, expected3, true)) {
                    file.delete();
                    throw new IOException("SHA-1 mismatch");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishAtomically(File partFile, File destination) throws IOException {
        File parentFile = destination.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        if (partFile.renameTo(destination)) {
            return;
        }
        File previous = new File(destination.getParentFile(), destination.getName() + ".previous");
        previous.delete();
        if (destination.exists() && !destination.renameTo(previous)) {
            throw new IOException("Cannot preserve " + destination.getName() + " before replacement");
        }
        if (partFile.renameTo(destination)) {
            previous.delete();
        } else {
            if (previous.exists()) {
                previous.renameTo(destination);
            }
            throw new IOException("Cannot publish " + destination.getName());
        }
    }

    private final List<Endpoint> availableEndpoints(EndpointGroup group) {
        List<Endpoint> listOrderedEndpoints = orderedEndpoints(group);
        List<Endpoint> $this$filterNot$iv = listOrderedEndpoints;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filterNot$iv) {
            Endpoint it = (Endpoint) element$iv$iv;
            if (!isCoolingDown(group, it)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        List available = (List) destination$iv$iv;
        return available.isEmpty() ? listOrderedEndpoints : available;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Endpoint> orderedEndpoints(EndpointGroup group) {
        RouteState state = currentState(group);
        Endpoint preferred = null;
        if (state != null) {
            RouteState routeState = ((System.currentTimeMillis() - state.getSavedAtMs()) > this.preferenceTtlMs ? 1 : ((System.currentTimeMillis() - state.getSavedAtMs()) == this.preferenceTtlMs ? 0 : -1)) <= 0 ? state : null;
            if (routeState != null) {
                preferred = routeState.getEndpoint();
            }
        }
        if (preferred == null) {
            return endpoints(group);
        }
        List listListOf = CollectionsKt__CollectionsJVMKt.listOf(preferred);
        Iterable $this$filterNot$iv = endpoints(group);
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filterNot$iv) {
            Endpoint it = (Endpoint) element$iv$iv;
            if (!Intrinsics.areEqual(it.getId(), preferred.getId())) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        return CollectionsKt___CollectionsKt.plus((Collection) listListOf, destination$iv$iv);
    }

    private final RouteState currentState(EndpointGroup group) {
        Object element$iv;
        RouteState it = this.routes.get(group);
        if (it != null) {
            return it;
        }
        String id = this.preferences.getString(group.name() + "_id", null);
        if (id == null) {
            return null;
        }
        long timestamp = this.preferences.getLong(group.name() + "_at", 0L);
        Iterable $this$firstOrNull$iv = endpoints(group);
        Iterator it2 = $this$firstOrNull$iv.iterator();
        do {
            if (!it2.hasNext()) {
                element$iv = null;
                break;
            }
            element$iv = it2.next();
        } while (!Intrinsics.areEqual(((Endpoint) element$iv).getId(), id));
        Endpoint endpoint = (Endpoint) element$iv;
        if (endpoint == null) {
            return null;
        }
        RouteState it3 = new RouteState(endpoint, timestamp);
        this.routes.putIfAbsent(group, it3);
        return it3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markSuccess(EndpointGroup group, Endpoint endpoint) {
        long now = System.currentTimeMillis();
        this.routes.put(group, new RouteState(endpoint, now));
        this.failedUntil.remove(endpointFailureKey(group, endpoint));
        this.preferences.edit().putString(group.name() + "_id", endpoint.getId()).putLong(group.name() + "_at", now).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markFailure(EndpointGroup group, Endpoint endpoint) {
        this.failedUntil.put(endpointFailureKey(group, endpoint), Long.valueOf(System.currentTimeMillis() + this.failureCooldownMs));
    }

    private final boolean isCoolingDown(EndpointGroup group, Endpoint endpoint) {
        long now = System.currentTimeMillis();
        String key = endpointFailureKey(group, endpoint);
        Long l = this.failedUntil.get(key);
        if (l == null) {
            return false;
        }
        long until = l.longValue();
        if (until <= now) {
            this.failedUntil.remove(key);
            return false;
        }
        return true;
    }

    private final String endpointFailureKey(EndpointGroup group, Endpoint endpoint) {
        return group.name() + AbstractJsonLexerKt.COLON + endpoint.getId();
    }

    private final List<Endpoint> endpoints(EndpointGroup group) {
        List<Endpoint> list = this.endpointOverrides.get(group);
        return list == null ? group.getEndpoints() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] readBoundedBytes(Response $this$readBoundedBytes, long maxBytes) throws IOException {
        ResponseBody body = $this$readBoundedBytes.body();
        if (body == null) {
            throw new IOException("Empty response body");
        }
        long contentLength = body.getContentLength();
        if (contentLength > maxBytes) {
            throw new IOException("Response is too large: " + contentLength);
        }
        byte[] bytes = body.bytes();
        if (bytes.length > maxBytes) {
            throw new IOException("Response is too large: " + bytes.length);
        }
        return bytes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitResponse(final Call $this$awaitResponse, Continuation<? super Response> continuation) {
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellable$iv.initCancellability();
        final CancellableContinuationImpl continuation2 = cancellable$iv;
        $this$awaitResponse.enqueue(new Callback() { // from class: com.blackhub.bronline.neizzir.network.EndpointRouter$awaitResponse$2$1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException error) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(error, "error");
                if (!continuation2.isCancelled()) {
                    CancellableContinuation<Response> cancellableContinuation = continuation2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m15551constructorimpl(ResultKt.createFailure(error)));
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (continuation2.isCancelled()) {
                    response.close();
                    return;
                }
                CancellableContinuation<Response> cancellableContinuation = continuation2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m15551constructorimpl(response));
            }
        });
        continuation2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.blackhub.bronline.neizzir.network.EndpointRouter$awaitResponse$2$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                $this$awaitResponse.cancel();
            }
        });
        Object result = cancellable$iv.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    private final String sha1(File $this$sha1) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-1");
        FileInputStream fileInputStream = new FileInputStream($this$sha1);
        try {
            FileInputStream input = fileInputStream;
            byte[] buffer = new byte[8192];
            while (true) {
                int read = input.read(buffer);
                if (read <= 0) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    byte[] bArrDigest = digest.digest();
                    Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                    return ArraysKt___ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.blackhub.bronline.neizzir.network.EndpointRouter.sha1.2
                        public final CharSequence invoke(byte it) {
                            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(it)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                            return str;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                            return invoke(b.byteValue());
                        }
                    }, 30, (Object) null);
                }
                digest.update(buffer, 0, read);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: EndpointRouter.kt */
    @Metadata(m4415d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/EndpointRouter$RouteState;", "", "endpoint", "Lcom/blackhub/bronline/neizzir/network/Endpoint;", "savedAtMs", "", "(Lcom/blackhub/bronline/neizzir/network/Endpoint;J)V", "getEndpoint", "()Lcom/blackhub/bronline/neizzir/network/Endpoint;", "getSavedAtMs", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final /* data */ class RouteState {
        private final Endpoint endpoint;
        private final long savedAtMs;

        public static /* synthetic */ RouteState copy$default(RouteState routeState, Endpoint endpoint, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                endpoint = routeState.endpoint;
            }
            if ((i & 2) != 0) {
                j = routeState.savedAtMs;
            }
            return routeState.copy(endpoint, j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Endpoint getEndpoint() {
            return this.endpoint;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getSavedAtMs() {
            return this.savedAtMs;
        }

        public final RouteState copy(Endpoint endpoint, long savedAtMs) {
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            return new RouteState(endpoint, savedAtMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RouteState)) {
                return false;
            }
            RouteState routeState = (RouteState) other;
            return Intrinsics.areEqual(this.endpoint, routeState.endpoint) && this.savedAtMs == routeState.savedAtMs;
        }

        public int hashCode() {
            return (this.endpoint.hashCode() * 31) + Long.hashCode(this.savedAtMs);
        }

        public String toString() {
            return "RouteState(endpoint=" + this.endpoint + ", savedAtMs=" + this.savedAtMs + ')';
        }

        public RouteState(Endpoint endpoint, long savedAtMs) {
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            this.endpoint = endpoint;
            this.savedAtMs = savedAtMs;
        }

        public final Endpoint getEndpoint() {
            return this.endpoint;
        }

        public final long getSavedAtMs() {
            return this.savedAtMs;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: EndpointRouter.kt */
    @Metadata(m4415d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/EndpointRouter$IndexedAttempt;", "", FirebaseAnalytics.Param.INDEX, "", "attempt", "Lcom/blackhub/bronline/neizzir/network/EndpointRouter$Attempt;", "(ILcom/blackhub/bronline/neizzir/network/EndpointRouter$Attempt;)V", "getAttempt", "()Lcom/blackhub/bronline/neizzir/network/EndpointRouter$Attempt;", "getIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    static final /* data */ class IndexedAttempt {
        private final Attempt attempt;
        private final int index;

        public static /* synthetic */ IndexedAttempt copy$default(IndexedAttempt indexedAttempt, int i, Attempt attempt, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = indexedAttempt.index;
            }
            if ((i2 & 2) != 0) {
                attempt = indexedAttempt.attempt;
            }
            return indexedAttempt.copy(i, attempt);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Attempt getAttempt() {
            return this.attempt;
        }

        public final IndexedAttempt copy(int index, Attempt attempt) {
            Intrinsics.checkNotNullParameter(attempt, "attempt");
            return new IndexedAttempt(index, attempt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IndexedAttempt)) {
                return false;
            }
            IndexedAttempt indexedAttempt = (IndexedAttempt) other;
            return this.index == indexedAttempt.index && Intrinsics.areEqual(this.attempt, indexedAttempt.attempt);
        }

        public int hashCode() {
            return (Integer.hashCode(this.index) * 31) + this.attempt.hashCode();
        }

        public String toString() {
            return "IndexedAttempt(index=" + this.index + ", attempt=" + this.attempt + ')';
        }

        public IndexedAttempt(int index, Attempt attempt) {
            Intrinsics.checkNotNullParameter(attempt, "attempt");
            this.index = index;
            this.attempt = attempt;
        }

        public final Attempt getAttempt() {
            return this.attempt;
        }

        public final int getIndex() {
            return this.index;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: EndpointRouter.kt */
    @Metadata(m4415d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/EndpointRouter$Attempt;", "", "endpoint", "Lcom/blackhub/bronline/neizzir/network/Endpoint;", "(Lcom/blackhub/bronline/neizzir/network/Endpoint;)V", "getEndpoint", "()Lcom/blackhub/bronline/neizzir/network/Endpoint;", "Failure", "Success", "Lcom/blackhub/bronline/neizzir/network/EndpointRouter$Attempt$Failure;", "Lcom/blackhub/bronline/neizzir/network/EndpointRouter$Attempt$Success;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    static abstract class Attempt {
        private final Endpoint endpoint;

        public /* synthetic */ Attempt(Endpoint endpoint, DefaultConstructorMarker defaultConstructorMarker) {
            this(endpoint);
        }

        /* JADX INFO: compiled from: EndpointRouter.kt */
        @Metadata(m4415d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/EndpointRouter$Attempt$Success;", "Lcom/blackhub/bronline/neizzir/network/EndpointRouter$Attempt;", "endpoint", "Lcom/blackhub/bronline/neizzir/network/Endpoint;", "bytes", "", "(Lcom/blackhub/bronline/neizzir/network/Endpoint;[B)V", "getBytes", "()[B", "getEndpoint", "()Lcom/blackhub/bronline/neizzir/network/Endpoint;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
        public static final /* data */ class Success extends Attempt {
            private final byte[] bytes;
            private final Endpoint endpoint;

            public static /* synthetic */ Success copy$default(Success success, Endpoint endpoint, byte[] bArr, int i, Object obj) {
                if ((i & 1) != 0) {
                    endpoint = success.endpoint;
                }
                if ((i & 2) != 0) {
                    bArr = success.bytes;
                }
                return success.copy(endpoint, bArr);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Endpoint getEndpoint() {
                return this.endpoint;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final byte[] getBytes() {
                return this.bytes;
            }

            public final Success copy(Endpoint endpoint, byte[] bytes) {
                Intrinsics.checkNotNullParameter(endpoint, "endpoint");
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                return new Success(endpoint, bytes);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.areEqual(this.endpoint, success.endpoint) && Intrinsics.areEqual(this.bytes, success.bytes);
            }

            public int hashCode() {
                return (this.endpoint.hashCode() * 31) + Arrays.hashCode(this.bytes);
            }

            public String toString() {
                return "Success(endpoint=" + this.endpoint + ", bytes=" + Arrays.toString(this.bytes) + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(Endpoint endpoint, byte[] bytes) {
                super(endpoint, null);
                Intrinsics.checkNotNullParameter(endpoint, "endpoint");
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                this.endpoint = endpoint;
                this.bytes = bytes;
            }

            public final byte[] getBytes() {
                return this.bytes;
            }

            @Override // com.blackhub.bronline.neizzir.network.EndpointRouter.Attempt
            public Endpoint getEndpoint() {
                return this.endpoint;
            }
        }

        private Attempt(Endpoint endpoint) {
            this.endpoint = endpoint;
        }

        public Endpoint getEndpoint() {
            return this.endpoint;
        }

        /* JADX INFO: compiled from: EndpointRouter.kt */
        @Metadata(m4415d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JC\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/EndpointRouter$Attempt$Failure;", "Lcom/blackhub/bronline/neizzir/network/EndpointRouter$Attempt;", "endpoint", "Lcom/blackhub/bronline/neizzir/network/Endpoint;", "message", "", "cause", "", "errors", "", "retryable", "", "(Lcom/blackhub/bronline/neizzir/network/Endpoint;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/List;Z)V", "getCause", "()Ljava/lang/Throwable;", "getEndpoint", "()Lcom/blackhub/bronline/neizzir/network/Endpoint;", "getErrors", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "getRetryable", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
        public static final /* data */ class Failure extends Attempt {
            private final Throwable cause;
            private final Endpoint endpoint;
            private final List<String> errors;
            private final String message;
            private final boolean retryable;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Failure copy$default(Failure failure, Endpoint endpoint, String str, Throwable th, List list, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    endpoint = failure.endpoint;
                }
                if ((i & 2) != 0) {
                    str = failure.message;
                }
                String str2 = str;
                if ((i & 4) != 0) {
                    th = failure.cause;
                }
                Throwable th2 = th;
                if ((i & 8) != 0) {
                    list = failure.errors;
                }
                List list2 = list;
                if ((i & 16) != 0) {
                    z = failure.retryable;
                }
                return failure.copy(endpoint, str2, th2, list2, z);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Endpoint getEndpoint() {
                return this.endpoint;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            public final List<String> component4() {
                return this.errors;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final boolean getRetryable() {
                return this.retryable;
            }

            public final Failure copy(Endpoint endpoint, String message, Throwable cause, List<String> errors, boolean retryable) {
                Intrinsics.checkNotNullParameter(endpoint, "endpoint");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(errors, "errors");
                return new Failure(endpoint, message, cause, errors, retryable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) other;
                return Intrinsics.areEqual(this.endpoint, failure.endpoint) && Intrinsics.areEqual(this.message, failure.message) && Intrinsics.areEqual(this.cause, failure.cause) && Intrinsics.areEqual(this.errors, failure.errors) && this.retryable == failure.retryable;
            }

            public int hashCode() {
                return (((((((this.endpoint.hashCode() * 31) + this.message.hashCode()) * 31) + (this.cause == null ? 0 : this.cause.hashCode())) * 31) + this.errors.hashCode()) * 31) + Boolean.hashCode(this.retryable);
            }

            public String toString() {
                return "Failure(endpoint=" + this.endpoint + ", message=" + this.message + ", cause=" + this.cause + ", errors=" + this.errors + ", retryable=" + this.retryable + ')';
            }

            public /* synthetic */ Failure(Endpoint endpoint, String str, Throwable th, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(endpoint, str, (i & 4) != 0 ? null : th, (i & 8) != 0 ? CollectionsKt__CollectionsJVMKt.listOf(endpoint.getId() + ": " + str) : list, (i & 16) != 0 ? true : z);
            }

            @Override // com.blackhub.bronline.neizzir.network.EndpointRouter.Attempt
            public Endpoint getEndpoint() {
                return this.endpoint;
            }

            public final String getMessage() {
                return this.message;
            }

            public final Throwable getCause() {
                return this.cause;
            }

            public final List<String> getErrors() {
                return this.errors;
            }

            public final boolean getRetryable() {
                return this.retryable;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(Endpoint endpoint, String message, Throwable cause, List<String> errors, boolean retryable) {
                super(endpoint, null);
                Intrinsics.checkNotNullParameter(endpoint, "endpoint");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(errors, "errors");
                this.endpoint = endpoint;
                this.message = message;
                this.cause = cause;
                this.errors = errors;
                this.retryable = retryable;
            }
        }
    }

    /* JADX INFO: compiled from: EndpointRouter.kt */
    @Metadata(m4415d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\f\u0010\r\u001a\u00020\b*\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/EndpointRouter$LastGoodCache;", "", "directory", "Ljava/io/File;", "(Ljava/io/File;)V", "read", "Lcom/blackhub/bronline/neizzir/network/EndpointRouter$LastGoodCache$Entry;", "key", "", "write", "", "bytes", "", "sha256", "Entry", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final class LastGoodCache {
        private final File directory;

        /* JADX INFO: compiled from: EndpointRouter.kt */
        @Metadata(m4415d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/EndpointRouter$LastGoodCache$Entry;", "", "bytes", "", "savedAtMs", "", "([BJ)V", "getBytes", "()[B", "getSavedAtMs", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
        public static final /* data */ class Entry {
            private final byte[] bytes;
            private final long savedAtMs;

            public static /* synthetic */ Entry copy$default(Entry entry, byte[] bArr, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    bArr = entry.bytes;
                }
                if ((i & 2) != 0) {
                    j = entry.savedAtMs;
                }
                return entry.copy(bArr, j);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final byte[] getBytes() {
                return this.bytes;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final long getSavedAtMs() {
                return this.savedAtMs;
            }

            public final Entry copy(byte[] bytes, long savedAtMs) {
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                return new Entry(bytes, savedAtMs);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) other;
                return Intrinsics.areEqual(this.bytes, entry.bytes) && this.savedAtMs == entry.savedAtMs;
            }

            public int hashCode() {
                return (Arrays.hashCode(this.bytes) * 31) + Long.hashCode(this.savedAtMs);
            }

            public String toString() {
                return "Entry(bytes=" + Arrays.toString(this.bytes) + ", savedAtMs=" + this.savedAtMs + ')';
            }

            public Entry(byte[] bytes, long savedAtMs) {
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                this.bytes = bytes;
                this.savedAtMs = savedAtMs;
            }

            public final byte[] getBytes() {
                return this.bytes;
            }

            public final long getSavedAtMs() {
                return this.savedAtMs;
            }
        }

        public LastGoodCache(File directory) {
            Intrinsics.checkNotNullParameter(directory, "directory");
            this.directory = directory;
        }

        public final synchronized Entry read(String key) {
            Object objM15551constructorimpl;
            Intrinsics.checkNotNullParameter(key, "key");
            String id = sha256(key);
            File data = new File(this.directory, id + ".data");
            File metadata = new File(this.directory, id + ".time");
            Object obj = null;
            if (!data.isFile() || !metadata.isFile()) {
                return null;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                LastGoodCache lastGoodCache = this;
                objM15551constructorimpl = Result.m15551constructorimpl(new Entry(FilesKt__FileReadWriteKt.readBytes(data), Long.parseLong(StringsKt__StringsKt.trim((CharSequence) FilesKt__FileReadWriteKt.readText$default(metadata, null, 1, null)).toString())));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
            }
            if (!Result.m15557isFailureimpl(objM15551constructorimpl)) {
                obj = objM15551constructorimpl;
            }
            return (Entry) obj;
        }

        public final synchronized void write(String key, byte[] bytes) {
            Object objM15551constructorimpl;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            if (this.directory.isDirectory() || this.directory.mkdirs()) {
                String id = sha256(key);
                File data = new File(this.directory, id + ".data");
                File temp = new File(this.directory, id + ".tmp");
                try {
                    Result.Companion companion = Result.INSTANCE;
                    LastGoodCache $this$write_u24lambda_u241 = this;
                    FilesKt.writeBytes(temp, bytes);
                    if (data.exists()) {
                        data.delete();
                    }
                    if (!temp.renameTo(data)) {
                        FilesKt__UtilsKt.copyTo$default(temp, data, true, 0, 4, null);
                        temp.delete();
                    }
                    FilesKt__FileReadWriteKt.writeText$default(new File($this$write_u24lambda_u241.directory, id + ".time"), String.valueOf(System.currentTimeMillis()), null, 2, null);
                    objM15551constructorimpl = Result.m15551constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m15554exceptionOrNullimpl(objM15551constructorimpl) != null) {
                    temp.delete();
                }
            }
        }

        private final String sha256(String $this$sha256) throws NoSuchAlgorithmException {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = $this$sha256.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
            return ArraysKt___ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.blackhub.bronline.neizzir.network.EndpointRouter$LastGoodCache$sha256$1
                public final CharSequence invoke(byte it) {
                    String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(it)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    return str;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                    return invoke(b.byteValue());
                }
            }, 30, (Object) null);
        }
    }
}
