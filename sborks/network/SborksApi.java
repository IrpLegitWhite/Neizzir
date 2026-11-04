package com.blackhub.bronline.neizzir.fragments.sborks.network;

import android.net.Uri;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.game.core.constants.Other;
import com.blackhub.bronline.game.gui.donate.utils.DonateConstants;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NativeKeys;
import com.blackhub.bronline.game.gui.rateapp.RateAppAnalyticsKeys;
import com.blackhub.bronline.neizzir.fragments.sborks.config.ApiConfig;
import com.blackhub.bronline.neizzir.fragments.sborks.config.MirrorState;
import com.blackhub.bronline.neizzir.network.DownloadSpec;
import com.blackhub.bronline.neizzir.network.Endpoint;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.EndpointRouter;
import com.blackhub.bronline.neizzir.network.NetworkResult;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import com.google.android.gms.actions.SearchIntents;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.p040io.CloseableKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.p043io.files.FileSystemKt;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.url._UrlKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: SborksApi.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002CDB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\fJA\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0011\"\u00020\n2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010\u0014J:\u0010\u0015\u001a \u0012\u0004\u0012\u00020\n\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00160\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001aH\u0086@¢\u0006\u0002\u0010\u001bJ&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010#JI\u0010$\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\b0*H\u0086@¢\u0006\u0002\u0010.J\u0016\u0010/\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010#J\u0016\u00100\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010#J\u0016\u00101\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010#J\u0016\u00102\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010#J\u001e\u00103\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\fJ\u0016\u00104\u001a\u0002052\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010#J\u000e\u00106\u001a\u000205H\u0086@¢\u0006\u0002\u00107J\u001e\u00108\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\fJe\u00109\u001a\u0002H:\"\u0004\b\u0000\u0010:2\b\b\u0002\u0010;\u001a\u00020\u00182!\u0010<\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020=0*2\"\u0010>\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020@\u0012\n\u0012\b\u0012\u0004\u0012\u0002H:0A\u0012\u0006\u0012\u0004\u0018\u00010\u00010?H\u0082@¢\u0006\u0002\u0010BR\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006E"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/network/SborksApi;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "addDownload", "", "folderName", "", "androidId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", NativeKeys.API_URL, "Lokhttp3/HttpUrl;", TtmlNode.RUBY_BASE, "seg", "", SearchIntents.EXTRA_QUERY, "", "(Ljava/lang/String;[Ljava/lang/String;Ljava/util/Map;)Lokhttp3/HttpUrl;", "batchStats", "Lkotlin/Triple;", "", "", "folders", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkSubscription", "Lorg/json/JSONObject;", "keyValue", "channelId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contentExists", "relativePath", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadFileTo", "outFile", "Ljava/io/File;", "expectedSize", "", "onChunk", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "bytes", "(Ljava/lang/String;Ljava/io/File;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDownloadCount", "getLikesCount", "hasVideo", "isNewFolder", RateAppAnalyticsKeys.RATE_APP_lIKE_VALUE, "listFilesInFolder", "Lorg/json/JSONArray;", "listFolders", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeLike", "withApiMirrors", ExifInterface.GPS_DIRECTION_TRUE, "mutating", "build", "Lokhttp3/Request;", "handle", "Lkotlin/Function2;", "Lokhttp3/Response;", "Lkotlin/coroutines/Continuation;", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ApiAttempt", "TerminalHttpException", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class SborksApi {
    public static final SborksApi INSTANCE = new SborksApi();

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$withApiMirrors$1 */
    /* JADX INFO: compiled from: SborksApi.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi", m4426f = "SborksApi.kt", m4427i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 3, 3, 3, 4, 5}, m4428l = {131, 146, 153, 390, 179, 179}, m4429m = "withApiMirrors", m4430n = {"build", "handle", "lastError", "mutating", "build", "handle", "indexes", "raceScope", "first", "mutating", "raceScope", "raceScope", "first", "second", "raceScope", "raceScope"}, m4431s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0", "L$0", "L$1", "L$2", "L$0", "L$0"})
    static final class C55771<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C55771(Continuation<? super C55771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SborksApi.this.withApiMirrors(false, null, null, this);
        }
    }

    private SborksApi() {
    }

    private final OkHttpClient getClient() {
        return NetworkClient.INSTANCE.getClient();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: SborksApi.kt */
    @Metadata(m4415d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/network/SborksApi$ApiAttempt;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "RetryableFailure", "Success", "TerminalFailure", "Lcom/blackhub/bronline/neizzir/fragments/sborks/network/SborksApi$ApiAttempt$RetryableFailure;", "Lcom/blackhub/bronline/neizzir/fragments/sborks/network/SborksApi$ApiAttempt$Success;", "Lcom/blackhub/bronline/neizzir/fragments/sborks/network/SborksApi$ApiAttempt$TerminalFailure;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    static abstract class ApiAttempt<T> {
        public /* synthetic */ ApiAttempt(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: compiled from: SborksApi.kt */
        @Metadata(m4415d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/network/SborksApi$ApiAttempt$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/blackhub/bronline/neizzir/fragments/sborks/network/SborksApi$ApiAttempt;", "value", FirebaseAnalytics.Param.INDEX, "", "(Ljava/lang/Object;I)V", "getIndex", "()I", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Object;I)Lcom/blackhub/bronline/neizzir/fragments/sborks/network/SborksApi$ApiAttempt$Success;", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
        public static final /* data */ class Success<T> extends ApiAttempt<T> {
            private final int index;
            private final T value;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Success copy$default(Success success, Object obj, int i, int i2, Object obj2) {
                if ((i2 & 1) != 0) {
                    obj = success.value;
                }
                if ((i2 & 2) != 0) {
                    i = success.index;
                }
                return success.copy(obj, i);
            }

            public final T component1() {
                return this.value;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getIndex() {
                return this.index;
            }

            public final Success<T> copy(T value, int index) {
                return new Success<>(value, index);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.areEqual(this.value, success.value) && this.index == success.index;
            }

            public int hashCode() {
                return ((this.value == null ? 0 : this.value.hashCode()) * 31) + Integer.hashCode(this.index);
            }

            public String toString() {
                return "Success(value=" + this.value + ", index=" + this.index + ')';
            }

            public Success(T t, int index) {
                super(null);
                this.value = t;
                this.index = index;
            }

            public final int getIndex() {
                return this.index;
            }

            public final T getValue() {
                return this.value;
            }
        }

        private ApiAttempt() {
        }

        /* JADX INFO: compiled from: SborksApi.kt */
        @Metadata(m4415d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\r\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/network/SborksApi$ApiAttempt$RetryableFailure;", "Lcom/blackhub/bronline/neizzir/fragments/sborks/network/SborksApi$ApiAttempt;", "", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", FirebaseAnalytics.Param.INDEX, "", "(Ljava/lang/Exception;I)V", "getError", "()Ljava/lang/Exception;", "getIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
        public static final /* data */ class RetryableFailure extends ApiAttempt {
            private final Exception error;
            private final int index;

            public static /* synthetic */ RetryableFailure copy$default(RetryableFailure retryableFailure, Exception exc, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    exc = retryableFailure.error;
                }
                if ((i2 & 2) != 0) {
                    i = retryableFailure.index;
                }
                return retryableFailure.copy(exc, i);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Exception getError() {
                return this.error;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getIndex() {
                return this.index;
            }

            public final RetryableFailure copy(Exception error, int index) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new RetryableFailure(error, index);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RetryableFailure)) {
                    return false;
                }
                RetryableFailure retryableFailure = (RetryableFailure) other;
                return Intrinsics.areEqual(this.error, retryableFailure.error) && this.index == retryableFailure.index;
            }

            public int hashCode() {
                return (this.error.hashCode() * 31) + Integer.hashCode(this.index);
            }

            public String toString() {
                return "RetryableFailure(error=" + this.error + ", index=" + this.index + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RetryableFailure(Exception error, int index) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
                this.index = index;
            }

            public final Exception getError() {
                return this.error;
            }

            public final int getIndex() {
                return this.index;
            }
        }

        /* JADX INFO: compiled from: SborksApi.kt */
        @Metadata(m4415d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\t\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/network/SborksApi$ApiAttempt$TerminalFailure;", "Lcom/blackhub/bronline/neizzir/fragments/sborks/network/SborksApi$ApiAttempt;", "", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getError", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
        public static final /* data */ class TerminalFailure extends ApiAttempt {
            private final Exception error;

            public static /* synthetic */ TerminalFailure copy$default(TerminalFailure terminalFailure, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = terminalFailure.error;
                }
                return terminalFailure.copy(exc);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Exception getError() {
                return this.error;
            }

            public final TerminalFailure copy(Exception error) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new TerminalFailure(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TerminalFailure) && Intrinsics.areEqual(this.error, ((TerminalFailure) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "TerminalFailure(error=" + this.error + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TerminalFailure(Exception error) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Exception getError() {
                return this.error;
            }
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$batchStats$2 */
    /* JADX INFO: compiled from: SborksApi.kt */
    @Metadata(m4415d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001*\u00020\u0006H\u008a@"}, m4416d2 = {"<anonymous>", "", "", "Lkotlin/Triple;", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$batchStats$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {44}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55652 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends Triple<? extends Integer, ? extends Integer, ? extends Boolean>>>, Object> {
        final /* synthetic */ List<String> $folders;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55652(List<String> list, Continuation<? super C55652> continuation) {
            super(2, continuation);
            this.$folders = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55652(this.$folders, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends Triple<? extends Integer, ? extends Integer, ? extends Boolean>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Map<String, Triple<Integer, Integer, Boolean>>>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<String, Triple<Integer, Integer, Boolean>>> continuation) {
            return ((C55652) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (this.$folders.isEmpty()) {
                        return MapsKt__MapsKt.emptyMap();
                    }
                    JSONArray arr = new JSONArray();
                    Iterable $this$forEach$iv = this.$folders;
                    for (Object element$iv : $this$forEach$iv) {
                        String it = (String) element$iv;
                        arr.put(it);
                    }
                    RequestBody.Companion companion = RequestBody.INSTANCE;
                    String string = new JSONObject().put("folders", arr).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    final RequestBody payload = companion.create(string, MediaType.INSTANCE.get(Other.APPLICATION_JSON));
                    this.label = 1;
                    Object objWithApiMirrors$default = SborksApi.withApiMirrors$default(SborksApi.INSTANCE, false, new Function1<String, Request>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi.batchStats.2.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Request invoke(String base) {
                            Intrinsics.checkNotNullParameter(base, "base");
                            HttpUrl url = SborksApi.apiUrl$default(SborksApi.INSTANCE, base, new String[]{"batch_stats"}, null, 4, null);
                            return new Request.Builder().url(url).post(payload).build();
                        }
                    }, new AnonymousClass2(null), this, 1, null);
                    return objWithApiMirrors$default == coroutine_suspended ? coroutine_suspended : objWithApiMirrors$default;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$batchStats$2$2, reason: invalid class name */
        /* JADX INFO: compiled from: SborksApi.kt */
        @Metadata(m4415d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001aB\u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001j \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u008a@"}, m4416d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "Lkotlin/Triple;", "", "", "Lkotlin/collections/HashMap;", "r", "Lokhttp3/Response;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$batchStats$2$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Response, Continuation<? super HashMap<String, Triple<? extends Integer, ? extends Integer, ? extends Boolean>>>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Response response, Continuation<? super HashMap<String, Triple<? extends Integer, ? extends Integer, ? extends Boolean>>> continuation) {
                return invoke2(response, (Continuation<? super HashMap<String, Triple<Integer, Integer, Boolean>>>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Response response, Continuation<? super HashMap<String, Triple<Integer, Integer, Boolean>>> continuation) {
                return ((AnonymousClass2) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        Response r = (Response) this.L$0;
                        String ct = Response.header$default(r, HttpHeaders.CONTENT_TYPE, null, 2, null);
                        if (ct == null) {
                            ct = "";
                        }
                        ResponseBody responseBodyBody = r.body();
                        String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                        String body = strString != null ? strString : "";
                        if (!StringsKt__StringsKt.contains((CharSequence) ct, (CharSequence) Other.APPLICATION_JSON, true)) {
                            throw new IOException("Bad CT: " + ct);
                        }
                        JSONObject root = new JSONObject(body);
                        JSONObject stats = root.optJSONObject("stats");
                        if (stats == null) {
                            stats = new JSONObject();
                        }
                        HashMap out = new HashMap(stats.length());
                        Iterator<String> itKeys = stats.keys();
                        while (itKeys.hasNext()) {
                            String name = itKeys.next();
                            JSONObject o = stats.optJSONObject(name);
                            if (o != null) {
                                int d = o.optInt("downloads", 0);
                                int l = o.optInt("likes", 0);
                                boolean hv = o.optBoolean("has_video", false);
                                HashMap map = out;
                                Intrinsics.checkNotNull(name);
                                map.put(name, new Triple(Boxing.boxInt(d), Boxing.boxInt(l), Boxing.boxBoolean(hv)));
                            }
                        }
                        return out;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final Object batchStats(List<String> list, Continuation<? super Map<String, Triple<Integer, Integer, Boolean>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C55652(list, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:156:0x0364  */
    /* JADX WARN: Code duplicated, block: B:158:0x0370  */
    /* JADX WARN: Code duplicated, block: B:159:0x0372  */
    /* JADX WARN: Code duplicated, block: B:162:0x0385 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:163:0x0386  */
    /* JADX WARN: Code duplicated, block: B:168:0x039e  */
    /* JADX WARN: Code duplicated, block: B:170:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:172:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:173:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:174:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.CoroutineScope] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x0386 -> B:164:0x0390). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final <T> java.lang.Object withApiMirrors(boolean r22, kotlin.jvm.functions.Function1<? super java.lang.String, okhttp3.Request> r23, kotlin.jvm.functions.Function2<? super okhttp3.Response, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r24, kotlin.coroutines.Continuation<? super T> r25) {
        /*
            Method dump skipped, instruction units count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi.withApiMirrors(boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object withApiMirrors$default(SborksApi sborksApi, boolean z, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return sborksApi.withApiMirrors(z, function1, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3 A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:34:0x00b3, B:28:0x0098, B:30:0x00a3, B:39:0x00c5, B:41:0x00d7, B:44:0x00e4, B:46:0x00ea, B:48:0x00f0, B:65:0x013e, B:66:0x0165, B:53:0x00fb, B:55:0x012d), top: B:84:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5 A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:34:0x00b3, B:28:0x0098, B:30:0x00a3, B:39:0x00c5, B:41:0x00d7, B:44:0x00e4, B:46:0x00ea, B:48:0x00f0, B:65:0x013e, B:66:0x0165, B:53:0x00fb, B:55:0x012d), top: B:84:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:34:0x00b3, B:28:0x0098, B:30:0x00a3, B:39:0x00c5, B:41:0x00d7, B:44:0x00e4, B:46:0x00ea, B:48:0x00f0, B:65:0x013e, B:66:0x0165, B:53:0x00fb, B:55:0x012d), top: B:84:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x012d A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:34:0x00b3, B:28:0x0098, B:30:0x00a3, B:39:0x00c5, B:41:0x00d7, B:44:0x00e4, B:46:0x00ea, B:48:0x00f0, B:65:0x013e, B:66:0x0165, B:53:0x00fb, B:55:0x012d), top: B:84:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0136  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:62:0x013a  */
    /* JADX WARN: Code duplicated, block: B:65:0x013e A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:34:0x00b3, B:28:0x0098, B:30:0x00a3, B:39:0x00c5, B:41:0x00d7, B:44:0x00e4, B:46:0x00ea, B:48:0x00f0, B:65:0x013e, B:66:0x0165, B:53:0x00fb, B:55:0x012d), top: B:84:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0165 A[Catch: all -> 0x00bd, TRY_LEAVE, TryCatch #3 {all -> 0x00bd, blocks: (B:34:0x00b3, B:28:0x0098, B:30:0x00a3, B:39:0x00c5, B:41:0x00d7, B:44:0x00e4, B:46:0x00ea, B:48:0x00f0, B:65:0x013e, B:66:0x0165, B:53:0x00fb, B:55:0x012d), top: B:84:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final <T> Object withApiMirrors$attempt(Function1<? super String, Request> function1, Function2<? super Response, ? super Continuation<? super T>, ? extends Object> function2, boolean z, int idx, Continuation<? super ApiAttempt<? extends T>> continuation) {
        SborksApi$withApiMirrors$attempt$1 sborksApi$withApiMirrors$attempt$1;
        boolean $mutating;
        Function2<? super Response, ? super Continuation<? super T>, ? extends Object> function3;
        Object objAwait;
        Request req;
        int idx2;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        Response resp;
        boolean fallbackAllowed;
        ApiAttempt.TerminalFailure terminalFailure;
        boolean z2;
        Object objInvoke;
        int i;
        if (continuation instanceof SborksApi$withApiMirrors$attempt$1) {
            sborksApi$withApiMirrors$attempt$1 = (SborksApi$withApiMirrors$attempt$1) continuation;
            if ((sborksApi$withApiMirrors$attempt$1.label & Integer.MIN_VALUE) != 0) {
                sborksApi$withApiMirrors$attempt$1.label -= Integer.MIN_VALUE;
            } else {
                sborksApi$withApiMirrors$attempt$1 = new SborksApi$withApiMirrors$attempt$1(continuation);
            }
        } else {
            sborksApi$withApiMirrors$attempt$1 = new SborksApi$withApiMirrors$attempt$1(continuation);
        }
        Object $result = sborksApi$withApiMirrors$attempt$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int idx3 = sborksApi$withApiMirrors$attempt$1.label;
        boolean z3 = true;
        try {
            try {
                switch (idx3) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        $mutating = z;
                        function3 = function2;
                        String base = ApiConfig.INSTANCE.getAPI_BASES().get(idx);
                        try {
                            Request req2 = function1.invoke(base);
                            Call callNewCall = INSTANCE.getClient().newCall(req2);
                            sborksApi$withApiMirrors$attempt$1.L$0 = function3;
                            sborksApi$withApiMirrors$attempt$1.L$1 = req2;
                            sborksApi$withApiMirrors$attempt$1.Z$0 = $mutating;
                            sborksApi$withApiMirrors$attempt$1.I$0 = idx;
                            sborksApi$withApiMirrors$attempt$1.label = 1;
                            objAwait = OkHttpAwaitKt.await(callNewCall, sborksApi$withApiMirrors$attempt$1);
                            if (objAwait == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            req = req2;
                            idx2 = idx;
                            closeable = (Closeable) objAwait;
                            try {
                                resp = (Response) closeable;
                                if (resp.getIsSuccessful()) {
                                    sborksApi$withApiMirrors$attempt$1.L$0 = closeable;
                                    sborksApi$withApiMirrors$attempt$1.L$1 = null;
                                    sborksApi$withApiMirrors$attempt$1.I$0 = idx2;
                                    sborksApi$withApiMirrors$attempt$1.label = 2;
                                    objInvoke = function3.invoke(resp, sborksApi$withApiMirrors$attempt$1);
                                    if (objInvoke == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    i = 0;
                                    terminalFailure = new ApiAttempt.Success(objInvoke, idx2);
                                } else {
                                    if ($mutating) {
                                        z3 = false;
                                    } else {
                                        if (Intrinsics.areEqual(req.method(), ShareTarget.METHOD_GET) && !Intrinsics.areEqual(req.method(), "HEAD")) {
                                            z2 = resp.code() == 408 || resp.code() == 429 || resp.code() >= 500;
                                        } else if (!CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(403), Boxing.boxInt(DonateConstants.ACTION_SEND_ERROR), Boxing.boxInt(408), Boxing.boxInt(429)}).contains(Boxing.boxInt(resp.code())) || resp.code() >= 500) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            z3 = false;
                                        }
                                    }
                                    fallbackAllowed = z3;
                                    if (fallbackAllowed) {
                                        terminalFailure = new ApiAttempt.RetryableFailure(new IOException("HTTP " + resp.code()), idx2);
                                    } else {
                                        terminalFailure = new ApiAttempt.TerminalFailure(new TerminalHttpException(resp.code()));
                                    }
                                }
                                CloseableKt.closeFinally(closeable, null);
                                return terminalFailure;
                            } catch (Throwable th2) {
                                th = th2;
                                closeable2 = closeable;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    CloseableKt.closeFinally(closeable2, th);
                                    throw th3;
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            idx3 = idx;
                            return new ApiAttempt.RetryableFailure(e, idx3);
                        }
                    case 1:
                        idx2 = sborksApi$withApiMirrors$attempt$1.I$0;
                        $mutating = sborksApi$withApiMirrors$attempt$1.Z$0;
                        req = (Request) sborksApi$withApiMirrors$attempt$1.L$1;
                        function3 = (Function2) sborksApi$withApiMirrors$attempt$1.L$0;
                        ResultKt.throwOnFailure($result);
                        objAwait = $result;
                        closeable = (Closeable) objAwait;
                        resp = (Response) closeable;
                        if (resp.getIsSuccessful()) {
                            sborksApi$withApiMirrors$attempt$1.L$0 = closeable;
                            sborksApi$withApiMirrors$attempt$1.L$1 = null;
                            sborksApi$withApiMirrors$attempt$1.I$0 = idx2;
                            sborksApi$withApiMirrors$attempt$1.label = 2;
                            objInvoke = function3.invoke(resp, sborksApi$withApiMirrors$attempt$1);
                            if (objInvoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i = 0;
                            terminalFailure = new ApiAttempt.Success(objInvoke, idx2);
                        } else {
                            if ($mutating) {
                                z3 = false;
                            } else {
                                if (Intrinsics.areEqual(req.method(), ShareTarget.METHOD_GET)) {
                                    if (CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(403), Boxing.boxInt(DonateConstants.ACTION_SEND_ERROR), Boxing.boxInt(408), Boxing.boxInt(429)}).contains(Boxing.boxInt(resp.code()))) {
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                    }
                                } else if (CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(403), Boxing.boxInt(DonateConstants.ACTION_SEND_ERROR), Boxing.boxInt(408), Boxing.boxInt(429)}).contains(Boxing.boxInt(resp.code()))) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    z3 = false;
                                }
                            }
                            fallbackAllowed = z3;
                            if (fallbackAllowed) {
                                terminalFailure = new ApiAttempt.RetryableFailure(new IOException("HTTP " + resp.code()), idx2);
                            } else {
                                terminalFailure = new ApiAttempt.TerminalFailure(new TerminalHttpException(resp.code()));
                            }
                        }
                        CloseableKt.closeFinally(closeable, null);
                        return terminalFailure;
                    case 2:
                        i = 0;
                        idx2 = sborksApi$withApiMirrors$attempt$1.I$0;
                        closeable2 = (Closeable) sborksApi$withApiMirrors$attempt$1.L$0;
                        try {
                            ResultKt.throwOnFailure($result);
                            closeable = closeable2;
                            objInvoke = $result;
                            terminalFailure = new ApiAttempt.Success(objInvoke, idx2);
                            CloseableKt.closeFinally(closeable, null);
                            return terminalFailure;
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (CancellationException cancelled) {
            throw cancelled;
        }
    }

    private static final Endpoint withApiMirrors$endpointFor(int index) {
        Iterable $this$first$iv = EndpointGroup.KOLSON.getEndpoints();
        for (Object element$iv : $this$first$iv) {
            Endpoint endpoint = (Endpoint) element$iv;
            if (StringsKt__StringsJVMKt.startsWith$default(ApiConfig.INSTANCE.getAPI_BASES().get(index), endpoint.getBaseUrl(), false, 2, null)) {
                return (Endpoint) element$iv;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private static final <T> T withApiMirrors$success(ApiAttempt.Success<T> success) {
        MirrorState.INSTANCE.setApiIndex(success.getIndex());
        NetworkRuntime.INSTANCE.getRouter().reportSuccess(EndpointGroup.KOLSON, withApiMirrors$endpointFor(success.getIndex()));
        return success.getValue();
    }

    private static final void withApiMirrors$failure(ApiAttempt.RetryableFailure result) {
        NetworkRuntime.INSTANCE.getRouter().reportFailure(EndpointGroup.KOLSON, withApiMirrors$endpointFor(result.getIndex()));
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$listFolders$2 */
    /* JADX INFO: compiled from: SborksApi.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "Lorg/json/JSONArray;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$listFolders$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {196}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55752 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super JSONArray>, Object> {
        int label;

        C55752(Continuation<? super C55752> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55752(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super JSONArray> continuation) {
            return ((C55752) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objWithApiMirrors$default = SborksApi.withApiMirrors$default(SborksApi.INSTANCE, false, new Function1<String, Request>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi.listFolders.2.1
                        @Override // kotlin.jvm.functions.Function1
                        public final Request invoke(String base) {
                            Intrinsics.checkNotNullParameter(base, "base");
                            return new Request.Builder().url(base + "/list_folders").build();
                        }
                    }, new AnonymousClass2(null), this, 1, null);
                    return objWithApiMirrors$default == coroutine_suspended ? coroutine_suspended : objWithApiMirrors$default;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$listFolders$2$2, reason: invalid class name */
        /* JADX INFO: compiled from: SborksApi.kt */
        @Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lorg/json/JSONArray;", "r", "Lokhttp3/Response;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$listFolders$2$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Response, Continuation<? super JSONArray>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Response response, Continuation<? super JSONArray> continuation) {
                return ((AnonymousClass2) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        Response r = (Response) this.L$0;
                        ResponseBody responseBodyBody = r.body();
                        String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                        if (strString == null) {
                            strString = "";
                        }
                        return new JSONArray(strString);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final Object listFolders(Continuation<? super JSONArray> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C55752(null), continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$getDownloadCount$2 */
    /* JADX INFO: compiled from: SborksApi.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$getDownloadCount$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {203}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55692 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        final /* synthetic */ String $folderName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55692(String str, Continuation<? super C55692> continuation) {
            super(2, continuation);
            this.$folderName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55692(this.$folderName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((C55692) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    SborksApi sborksApi = SborksApi.INSTANCE;
                    final String str = this.$folderName;
                    this.label = 1;
                    Object objWithApiMirrors$default = SborksApi.withApiMirrors$default(sborksApi, false, new Function1<String, Request>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi.getDownloadCount.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Request invoke(String base) {
                            Intrinsics.checkNotNullParameter(base, "base");
                            HttpUrl url = SborksApi.apiUrl$default(SborksApi.INSTANCE, base, new String[]{"get_download_count", str}, null, 4, null);
                            return new Request.Builder().url(url).build();
                        }
                    }, new AnonymousClass2(null), this, 1, null);
                    return objWithApiMirrors$default == coroutine_suspended ? coroutine_suspended : objWithApiMirrors$default;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$getDownloadCount$2$2, reason: invalid class name */
        /* JADX INFO: compiled from: SborksApi.kt */
        @Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "r", "Lokhttp3/Response;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$getDownloadCount$2$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Response, Continuation<? super Integer>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Response response, Continuation<? super Integer> continuation) {
                return ((AnonymousClass2) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        Response r = (Response) this.L$0;
                        String ct = Response.header$default(r, HttpHeaders.CONTENT_TYPE, null, 2, null);
                        if (ct == null) {
                            ct = "";
                        }
                        ResponseBody responseBodyBody = r.body();
                        String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                        String body = strString != null ? strString : "";
                        if (!StringsKt__StringsKt.contains((CharSequence) ct, (CharSequence) Other.APPLICATION_JSON, true)) {
                            throw new IOException("Bad CT: " + ct);
                        }
                        int v = new JSONObject(body).optInt("download_count", -1);
                        if (v < 0) {
                            throw new IOException("Bad JSON: " + body);
                        }
                        return Boxing.boxInt(v);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final Object getDownloadCount(String folderName, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C55692(folderName, null), continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$isNewFolder$2 */
    /* JADX INFO: compiled from: SborksApi.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$isNewFolder$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {220, 234}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55722 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $folderName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55722(String str, Continuation<? super C55722> continuation) {
            super(2, continuation);
            this.$folderName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55722(this.$folderName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C55722) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C55722 c55722;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    SborksApi sborksApi = SborksApi.INSTANCE;
                    final String str = this.$folderName;
                    this.label = 1;
                    Object objWithApiMirrors$default = SborksApi.withApiMirrors$default(sborksApi, false, new Function1<String, Request>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$isNewFolder$2$exists$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Request invoke(String base) {
                            Intrinsics.checkNotNullParameter(base, "base");
                            HttpUrl url = SborksApi.INSTANCE.apiUrl(base, new String[]{"check_new_folder"}, MapsKt__MapsJVMKt.mapOf(TuplesKt.m4423to("folder_name", str)));
                            return new Request.Builder().url(url).build();
                        }
                    }, new SborksApi$isNewFolder$2$exists$2(null), this, 1, null);
                    if (objWithApiMirrors$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objWithApiMirrors$default;
                    c55722 = this;
                    break;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c55722 = this;
                    break;
                case 2:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean exists = ((Boolean) $result).booleanValue();
            if (!exists) {
                return Boxing.boxBoolean(false);
            }
            SborksApi sborksApi2 = SborksApi.INSTANCE;
            final String str2 = c55722.$folderName;
            c55722.label = 2;
            Object $result2 = SborksApi.withApiMirrors$default(sborksApi2, false, new Function1<String, Request>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi.isNewFolder.2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Request invoke(String base) {
                    Intrinsics.checkNotNullParameter(base, "base");
                    HttpUrl url = SborksApi.INSTANCE.apiUrl(base, new String[]{"get_new_folder_creation_date"}, MapsKt__MapsJVMKt.mapOf(TuplesKt.m4423to("folder_name", str2)));
                    return new Request.Builder().url(url).build();
                }
            }, new AnonymousClass2(null), c55722, 1, null);
            if ($result2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            return $result2;
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$isNewFolder$2$2, reason: invalid class name */
        /* JADX INFO: compiled from: SborksApi.kt */
        @Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "r", "Lokhttp3/Response;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$isNewFolder$2$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Response, Continuation<? super Boolean>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Response response, Continuation<? super Boolean> continuation) {
                return ((AnonymousClass2) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0076  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                long t;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        Response r = (Response) this.L$0;
                        String ct = Response.header$default(r, HttpHeaders.CONTENT_TYPE, null, 2, null);
                        if (ct == null) {
                            ct = "";
                        }
                        ResponseBody responseBodyBody = r.body();
                        String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                        String body = strString != null ? strString : "";
                        if (!StringsKt__StringsKt.contains((CharSequence) ct, (CharSequence) Other.APPLICATION_JSON, true)) {
                            throw new IOException("Bad CT: " + ct);
                        }
                        String creation = new JSONObject(body).optString("creation_date", null);
                        boolean z = false;
                        try {
                            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
                            if (creation == null) {
                                t = 0;
                            } else {
                                Date date = sdf.parse(creation);
                                Long lBoxLong = date != null ? Boxing.boxLong(date.getTime()) : null;
                                if (lBoxLong != null) {
                                    t = lBoxLong.longValue();
                                } else {
                                    t = 0;
                                }
                            }
                            z = System.currentTimeMillis() - t < 172800000;
                        } catch (Exception e) {
                        }
                        return Boxing.boxBoolean(z);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final Object isNewFolder(String folderName, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C55722(folderName, null), continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$getLikesCount$2 */
    /* JADX INFO: compiled from: SborksApi.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$getLikesCount$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {256}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55702 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        final /* synthetic */ String $folderName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55702(String str, Continuation<? super C55702> continuation) {
            super(2, continuation);
            this.$folderName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55702(this.$folderName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((C55702) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    RequestBody.Companion companion = RequestBody.INSTANCE;
                    String string = new JSONObject().put("folder_name", this.$folderName).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    final RequestBody body = companion.create(string, MediaType.INSTANCE.get(Other.APPLICATION_JSON));
                    this.label = 1;
                    Object objWithApiMirrors$default = SborksApi.withApiMirrors$default(SborksApi.INSTANCE, false, new Function1<String, Request>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi.getLikesCount.2.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Request invoke(String base) {
                            Intrinsics.checkNotNullParameter(base, "base");
                            HttpUrl url = SborksApi.apiUrl$default(SborksApi.INSTANCE, base, new String[]{"get_likes"}, null, 4, null);
                            return new Request.Builder().url(url).post(body).build();
                        }
                    }, new AnonymousClass2(null), this, 1, null);
                    return objWithApiMirrors$default == coroutine_suspended ? coroutine_suspended : objWithApiMirrors$default;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$getLikesCount$2$2, reason: invalid class name */
        /* JADX INFO: compiled from: SborksApi.kt */
        @Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "r", "Lokhttp3/Response;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$getLikesCount$2$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Response, Continuation<? super Integer>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Response response, Continuation<? super Integer> continuation) {
                return ((AnonymousClass2) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        Response r = (Response) this.L$0;
                        String ct = Response.header$default(r, HttpHeaders.CONTENT_TYPE, null, 2, null);
                        if (ct == null) {
                            ct = "";
                        }
                        ResponseBody responseBodyBody = r.body();
                        String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                        String resp = strString != null ? strString : "";
                        if (!StringsKt__StringsKt.contains((CharSequence) ct, (CharSequence) Other.APPLICATION_JSON, true)) {
                            throw new IOException("Bad CT: " + ct);
                        }
                        int v = new JSONObject(resp).optInt("like_count", -1);
                        if (v < 0) {
                            throw new IOException("Bad JSON: " + resp);
                        }
                        return Boxing.boxInt(v);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final Object getLikesCount(String folderName, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C55702(folderName, null), continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$like$2 */
    /* JADX INFO: compiled from: SborksApi.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$like$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {275}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55732 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $androidId;
        final /* synthetic */ String $folderName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55732(String str, String str2, Continuation<? super C55732> continuation) {
            super(2, continuation);
            this.$folderName = str;
            this.$androidId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55732(this.$folderName, this.$androidId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55732) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    RequestBody.Companion companion = RequestBody.INSTANCE;
                    String string = new JSONObject().put("folder_name", this.$folderName).put("android_id_like", this.$androidId).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    final RequestBody body = companion.create(string, MediaType.INSTANCE.get(Other.APPLICATION_JSON));
                    this.label = 1;
                    if (SborksApi.INSTANCE.withApiMirrors(true, new Function1<String, Request>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi.like.2.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Request invoke(String base) {
                            Intrinsics.checkNotNullParameter(base, "base");
                            return new Request.Builder().url(base + "/like").post(body).build();
                        }
                    }, new AnonymousClass2(null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$like$2$2, reason: invalid class name */
        /* JADX INFO: compiled from: SborksApi.kt */
        @Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "it", "Lokhttp3/Response;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$like$2$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Response, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Response response, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
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
    }

    public final Object like(String folderName, String androidId, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C55732(folderName, androidId, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$removeLike$2 */
    /* JADX INFO: compiled from: SborksApi.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$removeLike$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {285}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55762 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $androidId;
        final /* synthetic */ String $folderName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55762(String str, String str2, Continuation<? super C55762> continuation) {
            super(2, continuation);
            this.$folderName = str;
            this.$androidId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55762(this.$folderName, this.$androidId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55762) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    RequestBody.Companion companion = RequestBody.INSTANCE;
                    String string = new JSONObject().put("folder_name", this.$folderName).put("android_id_like", this.$androidId).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    final RequestBody body = companion.create(string, MediaType.INSTANCE.get(Other.APPLICATION_JSON));
                    this.label = 1;
                    if (SborksApi.INSTANCE.withApiMirrors(true, new Function1<String, Request>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi.removeLike.2.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Request invoke(String base) {
                            Intrinsics.checkNotNullParameter(base, "base");
                            return new Request.Builder().url(base + "/remove_like").post(body).build();
                        }
                    }, new AnonymousClass2(null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$removeLike$2$2, reason: invalid class name */
        /* JADX INFO: compiled from: SborksApi.kt */
        @Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "it", "Lokhttp3/Response;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$removeLike$2$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Response, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Response response, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
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
    }

    public final Object removeLike(String folderName, String androidId, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C55762(folderName, androidId, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$checkSubscription$2 */
    /* JADX INFO: compiled from: SborksApi.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "Lorg/json/JSONObject;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$checkSubscription$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {302}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55662 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super JSONObject>, Object> {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $folderName;
        final /* synthetic */ String $keyValue;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55662(String str, String str2, String str3, Continuation<? super C55662> continuation) {
            super(2, continuation);
            this.$keyValue = str;
            this.$folderName = str2;
            this.$channelId = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55662(this.$keyValue, this.$folderName, this.$channelId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super JSONObject> continuation) {
            return ((C55662) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    RequestBody.Companion companion = RequestBody.INSTANCE;
                    String string = new JSONObject().put("key_value", this.$keyValue).put("folder_name", this.$folderName).put("channel_id", this.$channelId).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    final RequestBody body = companion.create(string, MediaType.INSTANCE.get(Other.APPLICATION_JSON));
                    this.label = 1;
                    Object objWithApiMirrors$default = SborksApi.withApiMirrors$default(SborksApi.INSTANCE, false, new Function1<String, Request>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi.checkSubscription.2.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Request invoke(String base) {
                            Intrinsics.checkNotNullParameter(base, "base");
                            return new Request.Builder().url(base + "/check_subscription").post(body).build();
                        }
                    }, new AnonymousClass2(null), this, 1, null);
                    return objWithApiMirrors$default == coroutine_suspended ? coroutine_suspended : objWithApiMirrors$default;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$checkSubscription$2$2, reason: invalid class name */
        /* JADX INFO: compiled from: SborksApi.kt */
        @Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lorg/json/JSONObject;", "r", "Lokhttp3/Response;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$checkSubscription$2$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Response, Continuation<? super JSONObject>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Response response, Continuation<? super JSONObject> continuation) {
                return ((AnonymousClass2) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        Response r = (Response) this.L$0;
                        ResponseBody responseBodyBody = r.body();
                        String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                        if (strString == null) {
                            strString = "";
                        }
                        return new JSONObject(strString);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final Object checkSubscription(String folderName, String keyValue, String channelId, Continuation<? super JSONObject> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C55662(keyValue, folderName, channelId, null), continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$addDownload$2 */
    /* JADX INFO: compiled from: SborksApi.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$addDownload$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {311}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55642 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $androidId;
        final /* synthetic */ String $folderName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55642(String str, String str2, Continuation<? super C55642> continuation) {
            super(2, continuation);
            this.$folderName = str;
            this.$androidId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55642(this.$folderName, this.$androidId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55642) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    RequestBody.Companion companion = RequestBody.INSTANCE;
                    String string = new JSONObject().put("folder_name", this.$folderName).put("android_id", this.$androidId).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    final RequestBody body = companion.create(string, MediaType.INSTANCE.get(Other.APPLICATION_JSON));
                    this.label = 1;
                    if (SborksApi.INSTANCE.withApiMirrors(true, new Function1<String, Request>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi.addDownload.2.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Request invoke(String base) {
                            Intrinsics.checkNotNullParameter(base, "base");
                            return new Request.Builder().url(base + "/add_download").post(body).build();
                        }
                    }, new AnonymousClass2(null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$addDownload$2$2, reason: invalid class name */
        /* JADX INFO: compiled from: SborksApi.kt */
        @Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "it", "Lokhttp3/Response;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$addDownload$2$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Response, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Response response, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
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
    }

    public final Object addDownload(String folderName, String androidId, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C55642(folderName, androidId, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$listFilesInFolder$2 */
    /* JADX INFO: compiled from: SborksApi.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "Lorg/json/JSONArray;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$listFilesInFolder$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {319}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55742 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super JSONArray>, Object> {
        final /* synthetic */ String $folderName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55742(String str, Continuation<? super C55742> continuation) {
            super(2, continuation);
            this.$folderName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55742(this.$folderName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super JSONArray> continuation) {
            return ((C55742) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    SborksApi sborksApi = SborksApi.INSTANCE;
                    final String str = this.$folderName;
                    this.label = 1;
                    Object objWithApiMirrors$default = SborksApi.withApiMirrors$default(sborksApi, false, new Function1<String, Request>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi.listFilesInFolder.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Request invoke(String base) {
                            Intrinsics.checkNotNullParameter(base, "base");
                            HttpUrl url = SborksApi.apiUrl$default(SborksApi.INSTANCE, base, new String[]{"list_files_in_folder", str}, null, 4, null);
                            return new Request.Builder().url(url).build();
                        }
                    }, new AnonymousClass2(null), this, 1, null);
                    return objWithApiMirrors$default == coroutine_suspended ? coroutine_suspended : objWithApiMirrors$default;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$listFilesInFolder$2$2, reason: invalid class name */
        /* JADX INFO: compiled from: SborksApi.kt */
        @Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lorg/json/JSONArray;", "r", "Lokhttp3/Response;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$listFilesInFolder$2$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Response, Continuation<? super JSONArray>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Response response, Continuation<? super JSONArray> continuation) {
                return ((AnonymousClass2) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        Response r = (Response) this.L$0;
                        String ct = Response.header$default(r, HttpHeaders.CONTENT_TYPE, null, 2, null);
                        if (ct == null) {
                            ct = "";
                        }
                        ResponseBody responseBodyBody = r.body();
                        String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                        String body = strString != null ? strString : "";
                        if (!StringsKt__StringsKt.contains((CharSequence) ct, (CharSequence) Other.APPLICATION_JSON, true)) {
                            throw new IOException("Bad CT: " + ct);
                        }
                        return new JSONArray(body);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final Object listFilesInFolder(String folderName, Continuation<? super JSONArray> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C55742(folderName, null), continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$downloadFileTo$2 */
    /* JADX INFO: compiled from: SborksApi.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$downloadFileTo$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {339}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55682 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $expectedSize;
        final /* synthetic */ Function1<Integer, Unit> $onChunk;
        final /* synthetic */ File $outFile;
        final /* synthetic */ String $relativePath;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C55682(long j, String str, File file, Function1<? super Integer, Unit> function1, Continuation<? super C55682> continuation) {
            super(2, continuation);
            this.$expectedSize = j;
            this.$relativePath = str;
            this.$outFile = file;
            this.$onChunk = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55682(this.$expectedSize, this.$relativePath, this.$outFile, this.$onChunk, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55682) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C55682 c55682;
            Object $result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    if (this.$expectedSize <= 0) {
                        throw new IOException("Пустой файл в списке сборки: " + this.$relativePath);
                    }
                    Ref.LongRef reportedBytes = new Ref.LongRef();
                    EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                    StringBuilder sbAppend = new StringBuilder().append("/download2/");
                    String str = this.$relativePath;
                    char[] cArr = {FileSystemKt.UnixPathSeparator};
                    this.label = 1;
                    Object objDownload = router.download(endpointGroup, sbAppend.append(Uri.encode(StringsKt__StringsKt.trimStart(str, cArr), "/")).toString(), new DownloadSpec(this.$outFile, Boxing.boxLong(this.$expectedSize), null, false, null, 20, null), new SborksApi$downloadFileTo$2$result$1(reportedBytes, this.$onChunk, null), this);
                    if (objDownload == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c55682 = this;
                    $result = objDownload;
                    break;
                    break;
                case 1:
                    c55682 = this;
                    $result = obj;
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            NetworkResult result = (NetworkResult) $result;
            if (result instanceof NetworkResult.Failure) {
                Throwable cause = ((NetworkResult.Failure) result).getCause();
                if (cause == null) {
                    throw new IOException(CollectionsKt___CollectionsKt.joinToString$default(((NetworkResult.Failure) result).getErrors(), null, null, null, 0, null, null, 63, null));
                }
                throw cause;
            }
            if (!c55682.$outFile.isFile() || c55682.$outFile.length() != c55682.$expectedSize) {
                throw new IOException("Файл скачан не полностью: " + c55682.$relativePath);
            }
            return Unit.INSTANCE;
        }
    }

    public final Object downloadFileTo(String relativePath, File outFile, long expectedSize, Function1<? super Integer, Unit> function1, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C55682(expectedSize, relativePath, outFile, function1, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$contentExists$2 */
    /* JADX INFO: compiled from: SborksApi.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$contentExists$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {357}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55672 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $relativePath;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55672(String str, Continuation<? super C55672> continuation) {
            super(2, continuation);
            this.$relativePath = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55672(this.$relativePath, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C55672) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                    StringBuilder sbAppend = new StringBuilder().append(FileSystemKt.UnixPathSeparator);
                    String str = this.$relativePath;
                    char[] cArr = {FileSystemKt.UnixPathSeparator};
                    this.label = 1;
                    Object objResourceExists = router.resourceExists(endpointGroup, sbAppend.append(StringsKt__StringsKt.trimStart(str, cArr)).toString(), this);
                    if (objResourceExists == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objResourceExists;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Boxing.boxBoolean($result instanceof NetworkResult.Success);
        }
    }

    public final Object contentExists(String relativePath, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C55672(relativePath, null), continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$hasVideo$2 */
    /* JADX INFO: compiled from: SborksApi.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$hasVideo$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {366}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55712 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $folderName;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55712(String str, Continuation<? super C55712> continuation) {
            super(2, continuation);
            this.$folderName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C55712 c55712 = new C55712(this.$folderName, continuation);
            c55712.L$0 = obj;
            return c55712;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C55712) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0088  */
        /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C55712 c55712;
            Throwable th;
            C55712 c55713;
            Object $result2;
            Boolean boolBoxBoolean;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c55712 = this;
                    String str = c55712.$folderName;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        String seg = Uri.encode(str, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
                        c55712.label = 1;
                        Object objContentExists = SborksApi.INSTANCE.contentExists("download2/" + seg + "/NEIZZIR/video.mp4", c55712);
                        if (objContentExists == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        $result = objContentExists;
                        try {
                            $result2 = Result.m15551constructorimpl(Boxing.boxBoolean(((Boolean) $result).booleanValue()));
                            break;
                        } catch (Throwable th2) {
                            C55712 c55714 = c55712;
                            th = th2;
                            $result = $result;
                            c55713 = c55714;
                            Result.Companion companion2 = Result.INSTANCE;
                            $result2 = Result.m15551constructorimpl(ResultKt.createFailure(th));
                        }
                        boolBoxBoolean = Boxing.boxBoolean(false);
                        if (Result.m15557isFailureimpl($result2)) {
                            return boolBoxBoolean;
                        }
                        return $result2;
                    } catch (Throwable th3) {
                        th = th3;
                        c55713 = c55712;
                        Result.Companion companion3 = Result.INSTANCE;
                        $result2 = Result.m15551constructorimpl(ResultKt.createFailure(th));
                        boolBoxBoolean = Boxing.boxBoolean(false);
                        if (Result.m15557isFailureimpl($result2)) {
                            return boolBoxBoolean;
                        }
                        return $result2;
                    }
                case 1:
                    c55713 = this;
                    try {
                        ResultKt.throwOnFailure($result);
                        c55712 = c55713;
                        $result2 = Result.m15551constructorimpl(Boxing.boxBoolean(((Boolean) $result).booleanValue()));
                        break;
                    } catch (Throwable th4) {
                        th = th4;
                        Result.Companion companion4 = Result.INSTANCE;
                        $result2 = Result.m15551constructorimpl(ResultKt.createFailure(th));
                        boolBoxBoolean = Boxing.boxBoolean(false);
                        if (Result.m15557isFailureimpl($result2)) {
                            return boolBoxBoolean;
                        }
                        return $result2;
                    }
                    boolBoxBoolean = Boxing.boxBoolean(false);
                    if (Result.m15557isFailureimpl($result2)) {
                        return boolBoxBoolean;
                    }
                    return $result2;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Object hasVideo(String folderName, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C55712(folderName, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ HttpUrl apiUrl$default(SborksApi sborksApi, String str, String[] strArr, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        return sborksApi.apiUrl(str, strArr, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpUrl apiUrl(String base, String[] seg, Map<String, String> query) {
        HttpUrl.Builder b = HttpUrl.INSTANCE.get(base).newBuilder();
        for (String str : seg) {
            b.addPathSegment(str);
        }
        if (query != null) {
            for (Map.Entry<String, String> entry : query.entrySet()) {
                String k = entry.getKey();
                String v = entry.getValue();
                b.addQueryParameter(k, v);
            }
        }
        return b.build();
    }

    /* JADX INFO: compiled from: SborksApi.kt */
    @Metadata(m4415d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/network/SborksApi$TerminalHttpException;", "Ljava/io/IOException;", "code", "", "(I)V", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final class TerminalHttpException extends IOException {
        public TerminalHttpException(int code) {
            super("HTTP " + code);
        }
    }
}
