package com.blackhub.bronline.neizzir.fragments.custom.manager;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.media3.extractor.p007ts.TsExtractor;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.neizzir.activities.main.util.CustomResources;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomFile;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomIndex;
import com.blackhub.bronline.neizzir.network.CachePolicy;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.EndpointRouter;
import com.blackhub.bronline.neizzir.network.NetworkResult;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import com.google.android.material.card.MaterialCardView;
import com.helpshift.HelpshiftEvent;
import io.ktor.sse.ServerSentEventKt;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.FilesKt__UtilsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.p043io.files.FileSystemKt;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONObject;

/* JADX INFO: compiled from: ModelsManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tJ\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\tH\u0082@¢\u0006\u0002\u0010\u0013J(\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0018\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u000e0\u0018J\n\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0002J\u001e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\bH\u0002J\u0016\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001eH\u0002J\u001a\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006$"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/ModelsManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "jsonMediaType", "Lokhttp3/MediaType;", "<set-?>", "", "", "latestFileList", "getLatestFileList", "()Ljava/util/List;", "checkSubscriptionAndMaybeDownload", "", "modelId", "downloadAndPack", "fetchModelInfo", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/ModelsManager$ModelInfo;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchModelList", "logosDir", "Ljava/io/File;", "onResult", "Lkotlin/Function1;", "getLauncherKeyFromPrefs", "packAll", "files", "runOnMain", "block", "Lkotlin/Function0;", "showSubscribeDialog", HelpshiftEvent.DATA_ACTION_TYPE_LINK, "toast", NotificationCompat.CATEGORY_MESSAGE, "ModelInfo", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class ModelsManager {
    private final Context context;
    private final MediaType jsonMediaType;
    private List<String> latestFileList;

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$fetchModelInfo$1 */
    /* JADX INFO: compiled from: ModelsManager.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager", m4426f = "ModelsManager.kt", m4427i = {0}, m4428l = {104}, m4429m = "fetchModelInfo", m4430n = {"this"}, m4431s = {"L$0"})
    static final class C53531 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C53531(Continuation<? super C53531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ModelsManager.this.fetchModelInfo(null, this);
        }
    }

    public ModelsManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.latestFileList = CollectionsKt__CollectionsKt.emptyList();
        this.jsonMediaType = MediaType.INSTANCE.get("application/json; charset=utf-8");
    }

    public final List<String> getLatestFileList() {
        return this.latestFileList;
    }

    /* JADX INFO: compiled from: ModelsManager.kt */
    @Metadata(m4415d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/ModelsManager$ModelInfo;", "", "channelId", "", "telegramLink", "description", "version", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getDescription", "getTelegramLink", "getVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final /* data */ class ModelInfo {
        private final String channelId;
        private final String description;
        private final String telegramLink;
        private final String version;

        public static /* synthetic */ ModelInfo copy$default(ModelInfo modelInfo, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = modelInfo.channelId;
            }
            if ((i & 2) != 0) {
                str2 = modelInfo.telegramLink;
            }
            if ((i & 4) != 0) {
                str3 = modelInfo.description;
            }
            if ((i & 8) != 0) {
                str4 = modelInfo.version;
            }
            return modelInfo.copy(str, str2, str3, str4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTelegramLink() {
            return this.telegramLink;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final ModelInfo copy(String channelId, String telegramLink, String description, String version) {
            return new ModelInfo(channelId, telegramLink, description, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ModelInfo)) {
                return false;
            }
            ModelInfo modelInfo = (ModelInfo) other;
            return Intrinsics.areEqual(this.channelId, modelInfo.channelId) && Intrinsics.areEqual(this.telegramLink, modelInfo.telegramLink) && Intrinsics.areEqual(this.description, modelInfo.description) && Intrinsics.areEqual(this.version, modelInfo.version);
        }

        public int hashCode() {
            return ((((((this.channelId == null ? 0 : this.channelId.hashCode()) * 31) + (this.telegramLink == null ? 0 : this.telegramLink.hashCode())) * 31) + (this.description == null ? 0 : this.description.hashCode())) * 31) + (this.version != null ? this.version.hashCode() : 0);
        }

        public String toString() {
            return "ModelInfo(channelId=" + this.channelId + ", telegramLink=" + this.telegramLink + ", description=" + this.description + ", version=" + this.version + ')';
        }

        public ModelInfo(String channelId, String telegramLink, String description, String version) {
            this.channelId = channelId;
            this.telegramLink = telegramLink;
            this.description = description;
            this.version = version;
        }

        public final String getChannelId() {
            return this.channelId;
        }

        public final String getTelegramLink() {
            return this.telegramLink;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getVersion() {
            return this.version;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runOnMain(final Function0<Unit> block) {
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ModelsManager.runOnMain$lambda$0(block);
                }
            });
        } else {
            block.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runOnMain$lambda$0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    private final String getLauncherKeyFromPrefs() {
        try {
            SharedPreferences prefs = this.context.getSharedPreferences("MyPreferences", 0);
            String key = prefs.getString("key", null);
            String str = key;
            if (str == null || StringsKt__StringsKt.isBlank(str)) {
                return null;
            }
            return key;
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$fetchModelList$1 */
    /* JADX INFO: compiled from: ModelsManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$fetchModelList$1", m4426f = "ModelsManager.kt", m4427i = {0}, m4428l = {82, 95}, m4429m = "invokeSuspend", m4430n = {"$this$launch"}, m4431s = {"L$0"})
    static final class C53541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<String>, Unit> $onResult;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C53541(Function1<? super List<String>, Unit> function1, Continuation<? super C53541> continuation) {
            super(2, continuation);
            this.$onResult = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C53541 c53541 = ModelsManager.this.new C53541(this.$onResult, continuation);
            c53541.L$0 = obj;
            return c53541;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0078  */
        /* JADX WARN: Code duplicated, block: B:15:0x007c  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:40:0x010d  */
        /* JADX WARN: Code duplicated, block: B:45:0x0146  */
        /* JADX WARN: Code duplicated, block: B:48:0x014a  */
        /* JADX WARN: Code duplicated, block: B:50:0x014d  */
        /* JADX WARN: Code duplicated, block: B:51:0x0155  */
        /* JADX WARN: Code duplicated, block: B:57:0x018d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:58:0x018e  */
        /* JADX WARN: Code duplicated, block: B:65:0x0159 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:67:0x0106 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object bytes;
            C53541 c53541;
            Object $result2;
            NetworkResult result;
            NetworkResult.Success success;
            List files;
            Collection destination$iv$iv;
            List ids;
            List list;
            List it;
            boolean z;
            String str;
            byte[] it2;
            Object objM15551constructorimpl;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = 1;
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    final CoroutineScope $this$launch = (CoroutineScope) this.L$0;
                    EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                    CachePolicy.LastKnownGood lastKnownGood = new CachePolicy.LastKnownGood("custom-index:models", 0L, 2, null);
                    Function1<byte[], Boolean> function1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$fetchModelList$1$result$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(byte[] it3) {
                            Object objM15551constructorimpl2;
                            Intrinsics.checkNotNullParameter(it3, "it");
                            CoroutineScope coroutineScope = $this$launch;
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                objM15551constructorimpl2 = Result.m15551constructorimpl(Boolean.valueOf(!RemoteCustomIndex.INSTANCE.parseFiles(new String(it3, Charsets.UTF_8)).isEmpty()));
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM15551constructorimpl2 = Result.m15551constructorimpl(ResultKt.createFailure(th));
                            }
                            if (Result.m15557isFailureimpl(objM15551constructorimpl2)) {
                                objM15551constructorimpl2 = false;
                            }
                            return (Boolean) objM15551constructorimpl2;
                        }
                    };
                    this.L$0 = $this$launch;
                    this.label = 1;
                    bytes = router.getBytes(endpointGroup, "/api/models", (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : lastKnownGood, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? EndpointRouter.C56582.INSTANCE : function1, this);
                    if (bytes == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c53541 = this;
                    $result2 = $result;
                    result = (NetworkResult) bytes;
                    if (result instanceof NetworkResult.Success) {
                        success = (NetworkResult.Success) result;
                    } else {
                        success = null;
                    }
                    if (success == null && (it2 = (byte[]) success.getValue()) != null) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            objM15551constructorimpl = Result.m15551constructorimpl(RemoteCustomIndex.INSTANCE.parseFiles(new String(it2, Charsets.UTF_8)));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                        }
                        if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
                            objM15551constructorimpl = null;
                        }
                        Iterable iterable = (List) objM15551constructorimpl;
                        if (iterable != null) {
                            Iterable $this$map$iv = iterable;
                            Collection destination$iv$iv2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
                            for (Object item$iv$iv : $this$map$iv) {
                                destination$iv$iv2.add(((RemoteCustomFile) item$iv$iv).getPath());
                            }
                            files = (List) destination$iv$iv2;
                        } else {
                            files = null;
                        }
                        break;
                    } else {
                        files = null;
                    }
                    if (files == null) {
                        files = CollectionsKt__CollectionsKt.emptyList();
                    }
                    ModelsManager.this.latestFileList = files;
                    Iterable $this$forEach$iv$iv$iv = files;
                    destination$iv$iv = new ArrayList();
                    for (Object element$iv$iv : $this$forEach$iv$iv$iv) {
                        String path = (String) element$iv$iv;
                        char[] cArr = new char[i];
                        cArr[0] = FileSystemKt.UnixPathSeparator;
                        it = StringsKt__StringsKt.split$default((CharSequence) path, cArr, false, 0, 6, (Object) null);
                        if (it.size() >= 2 || !Intrinsics.areEqual(it.get(0), "models")) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            it = null;
                        }
                        if (it != null) {
                            i = 1;
                            str = (String) it.get(1);
                        } else {
                            i = 1;
                            str = null;
                        }
                        if (str != null) {
                            destination$iv$iv.add(str);
                        }
                    }
                    ids = CollectionsKt___CollectionsKt.distinct((List) destination$iv$iv);
                    list = files;
                    c53541.L$0 = null;
                    c53541.label = 2;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(list, ModelsManager.this, c53541.$onResult, ids, null), c53541) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure($result);
                    bytes = $result;
                    c53541 = this;
                    $result2 = bytes;
                    result = (NetworkResult) bytes;
                    if (result instanceof NetworkResult.Success) {
                        success = (NetworkResult.Success) result;
                    } else {
                        success = null;
                    }
                    if (success == null) {
                        files = null;
                    } else {
                        files = null;
                    }
                    if (files == null) {
                        files = CollectionsKt__CollectionsKt.emptyList();
                    }
                    ModelsManager.this.latestFileList = files;
                    Iterable $this$forEach$iv$iv$iv2 = files;
                    destination$iv$iv = new ArrayList();
                    while (r12.hasNext()) {
                        String path2 = (String) element$iv$iv;
                        char[] cArr2 = new char[i];
                        cArr2[0] = FileSystemKt.UnixPathSeparator;
                        it = StringsKt__StringsKt.split$default((CharSequence) path2, cArr2, false, 0, 6, (Object) null);
                        if (it.size() >= 2) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            it = null;
                        }
                        if (it != null) {
                            i = 1;
                            str = (String) it.get(1);
                        } else {
                            i = 1;
                            str = null;
                        }
                        if (str != null) {
                            destination$iv$iv.add(str);
                        }
                    }
                    ids = CollectionsKt___CollectionsKt.distinct((List) destination$iv$iv);
                    list = files;
                    c53541.L$0 = null;
                    c53541.label = 2;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(list, ModelsManager.this, c53541.$onResult, ids, null), c53541) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 2:
                    ResultKt.throwOnFailure($result);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$fetchModelList$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: ModelsManager.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$fetchModelList$1$1", m4426f = "ModelsManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<String> $files;
            final /* synthetic */ List<String> $ids;
            final /* synthetic */ Function1<List<String>, Unit> $onResult;
            int label;
            final /* synthetic */ ModelsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(List<String> list, ModelsManager modelsManager, Function1<? super List<String>, Unit> function1, List<String> list2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$files = list;
                this.this$0 = modelsManager;
                this.$onResult = function1;
                this.$ids = list2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$files, this.this$0, this.$onResult, this.$ids, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        if (this.$files.isEmpty()) {
                            this.this$0.toast("Не удалось получить список моделей");
                        }
                        this.$onResult.invoke(this.$ids);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void fetchModelList(File logosDir, Function1<? super List<String>, Unit> onResult) {
        Intrinsics.checkNotNullParameter(logosDir, "logosDir");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        BuildersKt__Builders_commonKt.launch$default(NetworkRuntime.INSTANCE.getApplicationScope(), null, null, new C53541(onResult, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final java.lang.Object fetchModelInfo(java.lang.String r23, kotlin.coroutines.Continuation<? super com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager.ModelInfo> r24) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager.fetchModelInfo(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void checkSubscriptionAndMaybeDownload(String modelId) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        String keyValue = getLauncherKeyFromPrefs();
        String str = keyValue;
        if (!(str == null || StringsKt__StringsKt.isBlank(str))) {
            BuildersKt__Builders_commonKt.launch$default(NetworkRuntime.INSTANCE.getApplicationScope(), null, null, new C53501(modelId, keyValue, null), 3, null);
        } else {
            toast("Не найден ключ игры. Запустите игру, активируйте ключ и попробуйте снова.");
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$checkSubscriptionAndMaybeDownload$1 */
    /* JADX INFO: compiled from: ModelsManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$checkSubscriptionAndMaybeDownload$1", m4426f = "ModelsManager.kt", m4427i = {0, 2, 2}, m4428l = {134, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 148, 157, 165, 171}, m4429m = "invokeSuspend", m4430n = {"$this$launch", "$this$launch", HelpshiftEvent.DATA_ACTION_TYPE_LINK}, m4431s = {"L$0", "L$0", "L$1"})
    static final class C53501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $keyValue;
        final /* synthetic */ String $modelId;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53501(String str, String str2, Continuation<? super C53501> continuation) {
            super(2, continuation);
            this.$modelId = str;
            this.$keyValue = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C53501 c53501 = ModelsManager.this.new C53501(this.$modelId, this.$keyValue, continuation);
            c53501.L$0 = obj;
            return c53501;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x007e  */
        /* JADX WARN: Code duplicated, block: B:18:0x0083  */
        /* JADX WARN: Code duplicated, block: B:20:0x0086  */
        /* JADX WARN: Code duplicated, block: B:21:0x008b  */
        /* JADX WARN: Code duplicated, block: B:28:0x009b  */
        /* JADX WARN: Code duplicated, block: B:30:0x009e  */
        /* JADX WARN: Code duplicated, block: B:32:0x00bd A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:33:0x00be  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:38:0x011b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x011c  */
        /* JADX WARN: Code duplicated, block: B:42:0x0128  */
        /* JADX WARN: Code duplicated, block: B:43:0x012c  */
        /* JADX WARN: Code duplicated, block: B:45:0x012f  */
        /* JADX WARN: Code duplicated, block: B:46:0x0136  */
        /* JADX WARN: Code duplicated, block: B:48:0x0139  */
        /* JADX WARN: Code duplicated, block: B:50:0x0158 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:51:0x0159  */
        /* JADX WARN: Code duplicated, block: B:61:0x0184  */
        /* JADX WARN: Code duplicated, block: B:64:0x0189  */
        /* JADX WARN: Code duplicated, block: B:66:0x01a8 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:67:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:70:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:72:0x01cb  */
        /* JADX WARN: Code duplicated, block: B:75:0x01da  */
        /* JADX WARN: Code duplicated, block: B:76:0x01dc  */
        /* JADX WARN: Code duplicated, block: B:79:0x01e1  */
        /* JADX WARN: Code duplicated, block: B:80:0x01e3  */
        /* JADX WARN: Code duplicated, block: B:83:0x0203 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:84:0x0204  */
        /* JADX WARN: Code duplicated, block: B:87:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C53501 c53501;
            Object $result2;
            final CoroutineScope $this$launch;
            Object objFetchModelInfo;
            ModelInfo info;
            String channelId;
            String telegramLink;
            String link;
            String str;
            boolean z;
            Object objPostBytes;
            C53501 c53502;
            Object $result3;
            NetworkResult result;
            NetworkResult.Success success;
            byte[] bytes;
            Object objM15551constructorimpl;
            JSONObject response;
            boolean isOk;
            boolean isSubscribed;
            String strOptString;
            String str2;
            MainCoroutineDispatcher main;
            boolean z2;
            ModelsManager modelsManager;
            boolean z3;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c53501 = this;
                    $result2 = $result;
                    $this$launch = (CoroutineScope) c53501.L$0;
                    c53501.L$0 = $this$launch;
                    c53501.label = 1;
                    objFetchModelInfo = ModelsManager.this.fetchModelInfo(c53501.$modelId, c53501);
                    if (objFetchModelInfo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    info = (ModelInfo) objFetchModelInfo;
                    if (info != null) {
                        channelId = info.getChannelId();
                    } else {
                        channelId = null;
                    }
                    if (info != null) {
                        telegramLink = info.getTelegramLink();
                    } else {
                        telegramLink = null;
                    }
                    link = telegramLink;
                    str = channelId;
                    if (str != null || StringsKt__StringsKt.isBlank(str)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        c53501.L$0 = null;
                        c53501.label = 2;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(ModelsManager.this, c53501.$modelId, null), c53501) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    final String payload = new JSONObject().put("key_value", c53501.$keyValue).put("channel_id", channelId).toString();
                    Intrinsics.checkNotNullExpressionValue(payload, "toString(...)");
                    EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                    final ModelsManager modelsManager2 = ModelsManager.this;
                    Function0<RequestBody> function0 = new Function0<RequestBody>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$checkSubscriptionAndMaybeDownload$1$result$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final RequestBody invoke() {
                            return RequestBody.INSTANCE.create(payload, modelsManager2.jsonMediaType);
                        }
                    };
                    Function1<byte[], Boolean> function1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$checkSubscriptionAndMaybeDownload$1$result$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(byte[] bytes2) {
                            Object objM15551constructorimpl2;
                            Intrinsics.checkNotNullParameter(bytes2, "bytes");
                            CoroutineScope coroutineScope = $this$launch;
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                objM15551constructorimpl2 = Result.m15551constructorimpl(new JSONObject(new String(bytes2, Charsets.UTF_8)));
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM15551constructorimpl2 = Result.m15551constructorimpl(ResultKt.createFailure(th));
                            }
                            return Boolean.valueOf(Result.m15558isSuccessimpl(objM15551constructorimpl2));
                        }
                    };
                    c53501.L$0 = $this$launch;
                    c53501.L$1 = link;
                    c53501.label = 3;
                    objPostBytes = router.postBytes(endpointGroup, "/api/subscription/check", function0, (232 & 8) != 0 ? MapsKt__MapsKt.emptyMap() : null, true, (232 & 32) != 0 ? SetsKt__SetsKt.emptySet() : null, (232 & 64) != 0 ? 2097152L : 0L, (232 & 128) != 0 ? EndpointRouter.C56622.INSTANCE : function1, c53501);
                    if (objPostBytes == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Object obj = $result2;
                    c53502 = c53501;
                    $result3 = obj;
                    result = (NetworkResult) objPostBytes;
                    if (result instanceof NetworkResult.Success) {
                        success = (NetworkResult.Success) result;
                    } else {
                        success = null;
                    }
                    if (success != null) {
                        bytes = (byte[]) success.getValue();
                    } else {
                        bytes = null;
                    }
                    if (bytes == null) {
                        c53502.L$0 = null;
                        c53502.L$1 = null;
                        c53502.label = 4;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(ModelsManager.this, null), c53502) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        objM15551constructorimpl = Result.m15551constructorimpl(new JSONObject(new String(bytes, Charsets.UTF_8)));
                        break;
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                    }
                    if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
                        objM15551constructorimpl = null;
                    }
                    response = (JSONObject) objM15551constructorimpl;
                    if (response == null) {
                        c53502.L$0 = null;
                        c53502.L$1 = null;
                        c53502.label = 5;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(ModelsManager.this, null), c53502) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    isOk = response.optBoolean("ok", false);
                    isSubscribed = response.optBoolean("is_subscribed", false);
                    strOptString = response.optString("message", "");
                    if (StringsKt__StringsKt.isBlank(strOptString)) {
                        strOptString = null;
                    }
                    str2 = strOptString;
                    main = Dispatchers.getMain();
                    if (isOk) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    modelsManager = ModelsManager.this;
                    if (isSubscribed) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c53502.L$0 = null;
                    c53502.L$1 = null;
                    c53502.label = 6;
                    if (BuildersKt.withContext(main, new AnonymousClass4(z2, modelsManager, str2, z3, c53502.$modelId, link, null), c53502) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    c53501 = this;
                    $result2 = $result;
                    $this$launch = (CoroutineScope) c53501.L$0;
                    ResultKt.throwOnFailure($result2);
                    objFetchModelInfo = $result2;
                    info = (ModelInfo) objFetchModelInfo;
                    if (info != null) {
                        channelId = info.getChannelId();
                    } else {
                        channelId = null;
                    }
                    if (info != null) {
                        telegramLink = info.getTelegramLink();
                    } else {
                        telegramLink = null;
                    }
                    link = telegramLink;
                    str = channelId;
                    if (str != null) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (z) {
                        c53501.L$0 = null;
                        c53501.label = 2;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(ModelsManager.this, c53501.$modelId, null), c53501) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    final String payload2 = new JSONObject().put("key_value", c53501.$keyValue).put("channel_id", channelId).toString();
                    Intrinsics.checkNotNullExpressionValue(payload2, "toString(...)");
                    EndpointRouter router2 = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup2 = EndpointGroup.KOLSON;
                    final ModelsManager modelsManager3 = ModelsManager.this;
                    Function0<RequestBody> function2 = new Function0<RequestBody>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$checkSubscriptionAndMaybeDownload$1$result$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final RequestBody invoke() {
                            return RequestBody.INSTANCE.create(payload2, modelsManager3.jsonMediaType);
                        }
                    };
                    Function1<byte[], Boolean> function3 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$checkSubscriptionAndMaybeDownload$1$result$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(byte[] bytes2) {
                            Object objM15551constructorimpl2;
                            Intrinsics.checkNotNullParameter(bytes2, "bytes");
                            CoroutineScope coroutineScope = $this$launch;
                            try {
                                Result.Companion companion3 = Result.INSTANCE;
                                objM15551constructorimpl2 = Result.m15551constructorimpl(new JSONObject(new String(bytes2, Charsets.UTF_8)));
                            } catch (Throwable th2) {
                                Result.Companion companion4 = Result.INSTANCE;
                                objM15551constructorimpl2 = Result.m15551constructorimpl(ResultKt.createFailure(th2));
                            }
                            return Boolean.valueOf(Result.m15558isSuccessimpl(objM15551constructorimpl2));
                        }
                    };
                    c53501.L$0 = $this$launch;
                    c53501.L$1 = link;
                    c53501.label = 3;
                    objPostBytes = router2.postBytes(endpointGroup2, "/api/subscription/check", function2, (232 & 8) != 0 ? MapsKt__MapsKt.emptyMap() : null, true, (232 & 32) != 0 ? SetsKt__SetsKt.emptySet() : null, (232 & 64) != 0 ? 2097152L : 0L, (232 & 128) != 0 ? EndpointRouter.C56622.INSTANCE : function3, c53501);
                    if (objPostBytes == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Object obj2 = $result2;
                    c53502 = c53501;
                    $result3 = obj2;
                    result = (NetworkResult) objPostBytes;
                    if (result instanceof NetworkResult.Success) {
                        success = (NetworkResult.Success) result;
                    } else {
                        success = null;
                    }
                    if (success != null) {
                        bytes = (byte[]) success.getValue();
                    } else {
                        bytes = null;
                    }
                    if (bytes == null) {
                        c53502.L$0 = null;
                        c53502.L$1 = null;
                        c53502.label = 4;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(ModelsManager.this, null), c53502) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    Result.Companion companion3 = Result.INSTANCE;
                    objM15551constructorimpl = Result.m15551constructorimpl(new JSONObject(new String(bytes, Charsets.UTF_8)));
                    if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
                        objM15551constructorimpl = null;
                    }
                    response = (JSONObject) objM15551constructorimpl;
                    if (response == null) {
                        c53502.L$0 = null;
                        c53502.L$1 = null;
                        c53502.label = 5;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(ModelsManager.this, null), c53502) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    isOk = response.optBoolean("ok", false);
                    isSubscribed = response.optBoolean("is_subscribed", false);
                    strOptString = response.optString("message", "");
                    if (StringsKt__StringsKt.isBlank(strOptString)) {
                        strOptString = null;
                    }
                    str2 = strOptString;
                    main = Dispatchers.getMain();
                    if (isOk) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    modelsManager = ModelsManager.this;
                    if (isSubscribed) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c53502.L$0 = null;
                    c53502.L$1 = null;
                    c53502.label = 6;
                    if (BuildersKt.withContext(main, new AnonymousClass4(z2, modelsManager, str2, z3, c53502.$modelId, link, null), c53502) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 2:
                    ResultKt.throwOnFailure($result);
                    return Unit.INSTANCE;
                case 3:
                    String link2 = (String) this.L$1;
                    ResultKt.throwOnFailure($result);
                    objPostBytes = $result;
                    c53502 = this;
                    link = link2;
                    $result3 = objPostBytes;
                    result = (NetworkResult) objPostBytes;
                    if (result instanceof NetworkResult.Success) {
                        success = (NetworkResult.Success) result;
                    } else {
                        success = null;
                    }
                    if (success != null) {
                        bytes = (byte[]) success.getValue();
                    } else {
                        bytes = null;
                    }
                    if (bytes == null) {
                        c53502.L$0 = null;
                        c53502.L$1 = null;
                        c53502.label = 4;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(ModelsManager.this, null), c53502) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    Result.Companion companion4 = Result.INSTANCE;
                    objM15551constructorimpl = Result.m15551constructorimpl(new JSONObject(new String(bytes, Charsets.UTF_8)));
                    if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
                        objM15551constructorimpl = null;
                    }
                    response = (JSONObject) objM15551constructorimpl;
                    if (response == null) {
                        c53502.L$0 = null;
                        c53502.L$1 = null;
                        c53502.label = 5;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(ModelsManager.this, null), c53502) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    isOk = response.optBoolean("ok", false);
                    isSubscribed = response.optBoolean("is_subscribed", false);
                    strOptString = response.optString("message", "");
                    if (StringsKt__StringsKt.isBlank(strOptString)) {
                        strOptString = null;
                    }
                    str2 = strOptString;
                    main = Dispatchers.getMain();
                    if (isOk) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    modelsManager = ModelsManager.this;
                    if (isSubscribed) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c53502.L$0 = null;
                    c53502.L$1 = null;
                    c53502.label = 6;
                    if (BuildersKt.withContext(main, new AnonymousClass4(z2, modelsManager, str2, z3, c53502.$modelId, link, null), c53502) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 4:
                    ResultKt.throwOnFailure($result);
                    return Unit.INSTANCE;
                case 5:
                    ResultKt.throwOnFailure($result);
                    return Unit.INSTANCE;
                case 6:
                    ResultKt.throwOnFailure($result);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$checkSubscriptionAndMaybeDownload$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: ModelsManager.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$checkSubscriptionAndMaybeDownload$1$1", m4426f = "ModelsManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $modelId;
            int label;
            final /* synthetic */ ModelsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ModelsManager modelsManager, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = modelsManager;
                this.$modelId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$modelId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.this$0.downloadAndPack(this.$modelId);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$checkSubscriptionAndMaybeDownload$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: ModelsManager.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$checkSubscriptionAndMaybeDownload$1$2", m4426f = "ModelsManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ModelsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ModelsManager modelsManager, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = modelsManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.this$0.toast("Проверка подписки не удалась");
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$checkSubscriptionAndMaybeDownload$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: ModelsManager.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$checkSubscriptionAndMaybeDownload$1$3", m4426f = "ModelsManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ModelsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ModelsManager modelsManager, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = modelsManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.this$0.toast("Ошибка разбора ответа сервера");
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$checkSubscriptionAndMaybeDownload$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: ModelsManager.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$checkSubscriptionAndMaybeDownload$1$4", m4426f = "ModelsManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $isOk;
            final /* synthetic */ boolean $isSubscribed;
            final /* synthetic */ String $link;
            final /* synthetic */ String $message;
            final /* synthetic */ String $modelId;
            int label;
            final /* synthetic */ ModelsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(boolean z, ModelsManager modelsManager, String str, boolean z2, String str2, String str3, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$isOk = z;
                this.this$0 = modelsManager;
                this.$message = str;
                this.$isSubscribed = z2;
                this.$modelId = str2;
                this.$link = str3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$isOk, this.this$0, this.$message, this.$isSubscribed, this.$modelId, this.$link, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        if (!this.$isOk) {
                            ModelsManager modelsManager = this.this$0;
                            StringBuilder sbAppend = new StringBuilder().append("Сервер: ");
                            String str = this.$message;
                            if (str == null) {
                                str = "ошибка проверки подписки";
                            }
                            modelsManager.toast(sbAppend.append(str).toString());
                        } else if (this.$isSubscribed) {
                            this.this$0.downloadAndPack(this.$modelId);
                        } else {
                            this.this$0.showSubscribeDialog(this.$modelId, this.$link);
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSubscribeDialog(final String modelId, final String link) {
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager.showSubscribeDialog.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ModelsManager.this.showSubscribeDialog(modelId, link);
                }
            });
            return;
        }
        String str = (String) CollectionsKt___CollectionsKt.lastOrNull(StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.trim((CharSequence) (link == null ? "" : link)).toString(), new String[]{ServerSentEventKt.SPACE}, false, 0, 6, (Object) null));
        final String cleanLink = str != null ? str : "";
        if (!StringsKt__StringsJVMKt.startsWith$default(cleanLink, "https://t.me/", false, 2, null)) {
            toast("Некорректная ссылка на канал");
            return;
        }
        TextView $this$showSubscribeDialog_u24lambda_u246 = new TextView(this.context);
        $this$showSubscribeDialog_u24lambda_u246.setText("Чтобы скачать модель, подпишитесь на канал автора с того же аккаунта, которым привязан ваш ключ.");
        $this$showSubscribeDialog_u24lambda_u246.setTextSize(16.0f);
        $this$showSubscribeDialog_u24lambda_u246.setPadding(showSubscribeDialog$dp(this, 20), showSubscribeDialog$dp(this, 20), showSubscribeDialog$dp(this, 20), showSubscribeDialog$dp(this, 8));
        $this$showSubscribeDialog_u24lambda_u246.setTextColor(-1);
        TextView $this$showSubscribeDialog_u24lambda_u247 = new TextView(this.context);
        $this$showSubscribeDialog_u24lambda_u247.setText("После подписки вернитесь в приложение и снова нажмите «Скачать».");
        $this$showSubscribeDialog_u24lambda_u247.setTextSize(13.0f);
        $this$showSubscribeDialog_u24lambda_u247.setPadding(showSubscribeDialog$dp(this, 20), 0, showSubscribeDialog$dp(this, 20), showSubscribeDialog$dp(this, 16));
        $this$showSubscribeDialog_u24lambda_u247.setTextColor(Color.parseColor("#CCFFFFFF"));
        LinearLayout $this$showSubscribeDialog_u24lambda_u248 = new LinearLayout(this.context);
        $this$showSubscribeDialog_u24lambda_u248.setOrientation(1);
        $this$showSubscribeDialog_u24lambda_u248.addView($this$showSubscribeDialog_u24lambda_u246);
        $this$showSubscribeDialog_u24lambda_u248.addView($this$showSubscribeDialog_u24lambda_u247);
        $this$showSubscribeDialog_u24lambda_u248.setBackgroundColor(0);
        final AlertDialog alertDialog = new AlertDialog.Builder(this.context).setView($this$showSubscribeDialog_u24lambda_u248).setPositiveButton("Подписаться", new DialogInterface.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ModelsManager.showSubscribeDialog$lambda$10(cleanLink, this, dialogInterface, i);
            }
        }).setNegativeButton("Отмена", (DialogInterface.OnClickListener) null).create();
        alertDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ModelsManager.showSubscribeDialog$lambda$15(alertDialog, this, dialogInterface);
            }
        });
        alertDialog.show();
    }

    private static final int showSubscribeDialog$dp(ModelsManager this$0, int v) {
        return (int) (v * this$0.context.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSubscribeDialog$lambda$10(String cleanLink, ModelsManager this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(cleanLink, "$cleanLink");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(cleanLink));
            intent.addFlags(268435456);
            this$0.context.startActivity(intent);
        } catch (Exception e) {
            this$0.toast("Не удалось открыть ссылку");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSubscribeDialog$lambda$15(AlertDialog $alertDialog, ModelsManager this$0, DialogInterface it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Window window = $alertDialog.getWindow();
        if (window != null) {
            GradientDrawable $this$showSubscribeDialog_u24lambda_u2415_u24lambda_u2411 = new GradientDrawable();
            $this$showSubscribeDialog_u24lambda_u2415_u24lambda_u2411.setCornerRadius(showSubscribeDialog$dp(this$0, 16));
            $this$showSubscribeDialog_u24lambda_u2415_u24lambda_u2411.setColor(Color.parseColor("#CC000000"));
            $this$showSubscribeDialog_u24lambda_u2415_u24lambda_u2411.setStroke(showSubscribeDialog$dp(this$0, 2), SupportMenu.CATEGORY_MASK);
            window.setBackgroundDrawable($this$showSubscribeDialog_u24lambda_u2415_u24lambda_u2411);
        }
        int i = -1;
        Button positive = $alertDialog.getButton(-1);
        Button negative = $alertDialog.getButton(-2);
        Iterable $this$forEach$iv = CollectionsKt__CollectionsKt.listOf((Object[]) new Button[]{positive, negative});
        for (Object element$iv : $this$forEach$iv) {
            Button btn = (Button) element$iv;
            btn.setTextColor(i);
            GradientDrawable $this$showSubscribeDialog_u24lambda_u2415_u24lambda_u2414_u24lambda_u2412 = new GradientDrawable();
            $this$showSubscribeDialog_u24lambda_u2415_u24lambda_u2414_u24lambda_u2412.setCornerRadius(showSubscribeDialog$dp(this$0, 12));
            $this$showSubscribeDialog_u24lambda_u2415_u24lambda_u2414_u24lambda_u2412.setColor(Color.parseColor("#80000000"));
            $this$showSubscribeDialog_u24lambda_u2415_u24lambda_u2414_u24lambda_u2412.setStroke(showSubscribeDialog$dp(this$0, 1), -7829368);
            btn.setBackground($this$showSubscribeDialog_u24lambda_u2415_u24lambda_u2414_u24lambda_u2412);
            btn.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$$ExternalSyntheticLambda0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return ModelsManager.showSubscribeDialog$lambda$15$lambda$14$lambda$13(view, motionEvent);
                }
            });
            i = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showSubscribeDialog$lambda$15$lambda$14$lambda$13(View v, MotionEvent event) {
        switch (event.getAction()) {
            case 0:
                v.animate().alpha(0.7f).setDuration(120L).start();
                break;
            case 1:
            case 3:
                v.animate().alpha(1.0f).setDuration(120L).start();
                break;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0096  */
    public final void downloadAndPack(final String modelId) {
        boolean z;
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager.downloadAndPack.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ModelsManager.this.downloadAndPack(modelId);
                }
            });
            return;
        }
        Set allowed = SetsKt__SetsKt.setOf((Object[]) new String[]{"mod", "cls", "btx"});
        Iterable $this$filter$iv = this.latestFileList;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            String path = (String) element$iv$iv;
            if (StringsKt__StringsJVMKt.startsWith$default(path, "models/" + modelId + FileSystemKt.UnixPathSeparator, false, 2, null)) {
                String lowerCase = StringsKt__StringsKt.substringAfterLast(path, '.', "").toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (allowed.contains(lowerCase)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        List toDownload = (List) destination$iv$iv;
        if (toDownload.isEmpty()) {
            toast("Нет подходящих файлов (.mod/.cls/.btx) для модели " + modelId);
            return;
        }
        final float density = this.context.getResources().getDisplayMetrics().density;
        Function1<Integer, Integer> function1 = new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$downloadAndPack$dp$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Integer invoke(int value) {
                return Integer.valueOf((int) (value * density));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        };
        AlertDialog dialog = new AlertDialog.Builder(this.context).create();
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        MaterialCardView $this$downloadAndPack_u24lambda_u2418 = new MaterialCardView(this.context);
        FrameLayout.LayoutParams $this$downloadAndPack_u24lambda_u2418_u24lambda_u2417 = new FrameLayout.LayoutParams(-1, -2);
        $this$downloadAndPack_u24lambda_u2418_u24lambda_u2417.setMargins(function1.invoke(24).intValue(), function1.invoke(48).intValue(), function1.invoke(24).intValue(), function1.invoke(48).intValue());
        $this$downloadAndPack_u24lambda_u2418.setLayoutParams($this$downloadAndPack_u24lambda_u2418_u24lambda_u2417);
        $this$downloadAndPack_u24lambda_u2418.setRadius(24.0f * density);
        $this$downloadAndPack_u24lambda_u2418.setCardElevation(density * 12.0f);
        $this$downloadAndPack_u24lambda_u2418.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        $this$downloadAndPack_u24lambda_u2418.setStrokeWidth(function1.invoke(1).intValue());
        $this$downloadAndPack_u24lambda_u2418.setStrokeColor(Color.parseColor("#2D2D35"));
        LinearLayout $this$downloadAndPack_u24lambda_u2419 = new LinearLayout(this.context);
        $this$downloadAndPack_u24lambda_u2419.setOrientation(1);
        $this$downloadAndPack_u24lambda_u2419.setPadding(function1.invoke(24).intValue(), function1.invoke(24).intValue(), function1.invoke(24).intValue(), function1.invoke(24).intValue());
        LinearLayout $this$downloadAndPack_u24lambda_u2421 = new LinearLayout(this.context);
        $this$downloadAndPack_u24lambda_u2421.setOrientation(0);
        $this$downloadAndPack_u24lambda_u2421.setGravity(16);
        LinearLayout.LayoutParams $this$downloadAndPack_u24lambda_u2421_u24lambda_u2420 = new LinearLayout.LayoutParams(-1, -2);
        $this$downloadAndPack_u24lambda_u2421_u24lambda_u2420.bottomMargin = function1.invoke(20).intValue();
        $this$downloadAndPack_u24lambda_u2421.setLayoutParams($this$downloadAndPack_u24lambda_u2421_u24lambda_u2420);
        FrameLayout $this$downloadAndPack_u24lambda_u2423 = new FrameLayout(this.context);
        GradientDrawable $this$downloadAndPack_u24lambda_u2423_u24lambda_u2422 = new GradientDrawable();
        $this$downloadAndPack_u24lambda_u2423_u24lambda_u2422.setShape(0);
        $this$downloadAndPack_u24lambda_u2423_u24lambda_u2422.setCornerRadius(12.0f * density);
        $this$downloadAndPack_u24lambda_u2423_u24lambda_u2422.setColor(Color.parseColor("#1A00E5CC"));
        $this$downloadAndPack_u24lambda_u2423.setBackground($this$downloadAndPack_u24lambda_u2423_u24lambda_u2422);
        $this$downloadAndPack_u24lambda_u2423.setLayoutParams(new LinearLayout.LayoutParams(function1.invoke(48).intValue(), function1.invoke(48).intValue()));
        ImageView $this$downloadAndPack_u24lambda_u2424 = new ImageView(this.context);
        $this$downloadAndPack_u24lambda_u2424.setImageResource(C3715R.drawable.neizzir20_ic_download);
        $this$downloadAndPack_u24lambda_u2424.setColorFilter(Color.parseColor("#00E5CC"));
        $this$downloadAndPack_u24lambda_u2424.setLayoutParams(new FrameLayout.LayoutParams(function1.invoke(28).intValue(), function1.invoke(28).intValue(), 17));
        $this$downloadAndPack_u24lambda_u2423.addView($this$downloadAndPack_u24lambda_u2424);
        TextView $this$downloadAndPack_u24lambda_u2426 = new TextView(this.context);
        $this$downloadAndPack_u24lambda_u2426.setText("Скачивание модели");
        $this$downloadAndPack_u24lambda_u2426.setTextSize(18.0f);
        $this$downloadAndPack_u24lambda_u2426.setTextColor(-1);
        $this$downloadAndPack_u24lambda_u2426.setTypeface(null, 1);
        LinearLayout.LayoutParams $this$downloadAndPack_u24lambda_u2426_u24lambda_u2425 = new LinearLayout.LayoutParams(-2, -2);
        $this$downloadAndPack_u24lambda_u2426_u24lambda_u2425.setMarginStart(function1.invoke(14).intValue());
        $this$downloadAndPack_u24lambda_u2426.setLayoutParams($this$downloadAndPack_u24lambda_u2426_u24lambda_u2425);
        $this$downloadAndPack_u24lambda_u2421.addView($this$downloadAndPack_u24lambda_u2423);
        $this$downloadAndPack_u24lambda_u2421.addView($this$downloadAndPack_u24lambda_u2426);
        $this$downloadAndPack_u24lambda_u2419.addView($this$downloadAndPack_u24lambda_u2421);
        TextView $this$downloadAndPack_u24lambda_u2428 = new TextView(this.context);
        $this$downloadAndPack_u24lambda_u2428.setText("Models #" + modelId);
        $this$downloadAndPack_u24lambda_u2428.setTextSize(14.0f);
        $this$downloadAndPack_u24lambda_u2428.setTextColor(Color.parseColor(TCPSettingsManager.COLOR_HINT));
        LinearLayout.LayoutParams $this$downloadAndPack_u24lambda_u2428_u24lambda_u2427 = new LinearLayout.LayoutParams(-1, -2);
        $this$downloadAndPack_u24lambda_u2428_u24lambda_u2427.bottomMargin = function1.invoke(20).intValue();
        $this$downloadAndPack_u24lambda_u2428.setLayoutParams($this$downloadAndPack_u24lambda_u2428_u24lambda_u2427);
        $this$downloadAndPack_u24lambda_u2419.addView($this$downloadAndPack_u24lambda_u2428);
        ProgressBar $this$downloadAndPack_u24lambda_u2430 = new ProgressBar(this.context, null, R.attr.progressBarStyleHorizontal);
        $this$downloadAndPack_u24lambda_u2430.setMax(toDownload.size());
        $this$downloadAndPack_u24lambda_u2430.setProgress(0);
        $this$downloadAndPack_u24lambda_u2430.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#00E5CC")));
        $this$downloadAndPack_u24lambda_u2430.setProgressBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#2D2D35")));
        LinearLayout.LayoutParams $this$downloadAndPack_u24lambda_u2430_u24lambda_u2429 = new LinearLayout.LayoutParams(-1, function1.invoke(8).intValue());
        $this$downloadAndPack_u24lambda_u2430_u24lambda_u2429.bottomMargin = function1.invoke(12).intValue();
        $this$downloadAndPack_u24lambda_u2430.setLayoutParams($this$downloadAndPack_u24lambda_u2430_u24lambda_u2429);
        $this$downloadAndPack_u24lambda_u2419.addView($this$downloadAndPack_u24lambda_u2430);
        TextView $this$downloadAndPack_u24lambda_u2431 = new TextView(this.context);
        $this$downloadAndPack_u24lambda_u2431.setText("0 / " + toDownload.size() + " файлов");
        $this$downloadAndPack_u24lambda_u2431.setTextSize(14.0f);
        $this$downloadAndPack_u24lambda_u2431.setTextColor(Color.parseColor("#B0FFFFFF"));
        $this$downloadAndPack_u24lambda_u2431.setGravity(17);
        $this$downloadAndPack_u24lambda_u2419.addView($this$downloadAndPack_u24lambda_u2431);
        $this$downloadAndPack_u24lambda_u2418.addView($this$downloadAndPack_u24lambda_u2419);
        dialog.setView($this$downloadAndPack_u24lambda_u2418);
        dialog.show();
        AtomicInteger doneCounter = new AtomicInteger(0);
        List tempFiles = Collections.synchronizedList(new ArrayList());
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C53522(toDownload, tempFiles, this, modelId, doneCounter, dialog, $this$downloadAndPack_u24lambda_u2430, $this$downloadAndPack_u24lambda_u2431, $this$downloadAndPack_u24lambda_u2426, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$downloadAndPack$2 */
    /* JADX INFO: compiled from: ModelsManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager$downloadAndPack$2", m4426f = "ModelsManager.kt", m4427i = {}, m4428l = {TypedValues.CycleType.TYPE_WAVE_OFFSET}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C53522 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProgressBar $bar;
        final /* synthetic */ AlertDialog $dialog;
        final /* synthetic */ AtomicInteger $doneCounter;
        final /* synthetic */ String $modelId;
        final /* synthetic */ List<File> $tempFiles;
        final /* synthetic */ TextView $titleView;
        final /* synthetic */ List<String> $toDownload;
        final /* synthetic */ TextView $txt;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ModelsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53522(List<String> list, List<File> list2, ModelsManager modelsManager, String str, AtomicInteger atomicInteger, AlertDialog alertDialog, ProgressBar progressBar, TextView textView, TextView textView2, Continuation<? super C53522> continuation) {
            super(2, continuation);
            this.$toDownload = list;
            this.$tempFiles = list2;
            this.this$0 = modelsManager;
            this.$modelId = str;
            this.$doneCounter = atomicInteger;
            this.$dialog = alertDialog;
            this.$bar = progressBar;
            this.$txt = textView;
            this.$titleView = textView2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C53522 c53522 = new C53522(this.$toDownload, this.$tempFiles, this.this$0, this.$modelId, this.$doneCounter, this.$dialog, this.$bar, this.$txt, this.$titleView, continuation);
            c53522.L$0 = obj;
            return c53522;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53522) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C53522 c53522;
            int i;
            Object objAwaitAll;
            int $i$f$all;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c53522 = this;
                    CoroutineScope $this$launch = (CoroutineScope) c53522.L$0;
                    Iterable $this$map$iv = c53522.$toDownload;
                    ModelsManager modelsManager = c53522.this$0;
                    List<File> list = c53522.$tempFiles;
                    AtomicInteger atomicInteger = c53522.$doneCounter;
                    AlertDialog alertDialog = c53522.$dialog;
                    ProgressBar progressBar = c53522.$bar;
                    TextView textView = c53522.$txt;
                    List<String> list2 = c53522.$toDownload;
                    Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
                    for (Object item$iv$iv : $this$map$iv) {
                        String raw = (String) item$iv$iv;
                        Collection destination$iv$iv2 = destination$iv$iv;
                        List<String> list3 = list2;
                        TextView textView2 = textView;
                        ProgressBar progressBar2 = progressBar;
                        destination$iv$iv2.add(BuildersKt__Builders_commonKt.async$default($this$launch, null, null, new ModelsManager$downloadAndPack$2$successful$1$1(modelsManager, raw, list, atomicInteger, alertDialog, progressBar2, textView2, list3, null), 3, null));
                        destination$iv$iv = destination$iv$iv2;
                        list2 = list3;
                        textView = textView2;
                        progressBar = progressBar2;
                        atomicInteger = atomicInteger;
                        list = list;
                        modelsManager = modelsManager;
                    }
                    i = 1;
                    c53522.label = 1;
                    objAwaitAll = AwaitKt.awaitAll((List) destination$iv$iv, c53522);
                    if (objAwaitAll == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objAwaitAll = $result;
                    i = 1;
                    c53522 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterable $this$all$iv = (Iterable) objAwaitAll;
            if (($this$all$iv instanceof Collection) && ((Collection) $this$all$iv).isEmpty()) {
                $i$f$all = i;
            } else {
                Iterator it = $this$all$iv.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object element$iv = it.next();
                        boolean it2 = ((Boolean) element$iv).booleanValue();
                        if ((it2 ? i : 0) == 0) {
                            $i$f$all = 0;
                        }
                    } else {
                        $i$f$all = i;
                    }
                }
            }
            if ($i$f$all == 0) {
                Iterable tempFiles = c53522.$tempFiles;
                Intrinsics.checkNotNullExpressionValue(tempFiles, "$tempFiles");
                Iterable $this$forEach$iv = tempFiles;
                for (Object element$iv2 : $this$forEach$iv) {
                    File p0 = (File) element$iv2;
                    p0.delete();
                }
                ModelsManager modelsManager2 = c53522.this$0;
                final AlertDialog alertDialog2 = c53522.$dialog;
                final ModelsManager modelsManager3 = c53522.this$0;
                final String str = c53522.$modelId;
                modelsManager2.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager.downloadAndPack.2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (alertDialog2.isShowing()) {
                            alertDialog2.dismiss();
                        }
                        modelsManager3.toast("⚠️ Не удалось скачать все файлы модели " + str);
                    }
                });
                return Unit.INSTANCE;
            }
            ModelsManager modelsManager4 = c53522.this$0;
            final AlertDialog alertDialog3 = c53522.$dialog;
            final TextView textView3 = c53522.$titleView;
            final TextView textView4 = c53522.$txt;
            modelsManager4.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager.downloadAndPack.2.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (alertDialog3.isShowing()) {
                        textView3.setText("Упаковка...");
                        textView4.setText("Обработка файлов...");
                    }
                }
            });
            try {
                ModelsManager modelsManager5 = c53522.this$0;
                String str2 = c53522.$modelId;
                List<File> tempFiles2 = c53522.$tempFiles;
                Intrinsics.checkNotNullExpressionValue(tempFiles2, "$tempFiles");
                modelsManager5.packAll(str2, tempFiles2);
                ModelsManager modelsManager6 = c53522.this$0;
                final AlertDialog alertDialog4 = c53522.$dialog;
                final ModelsManager modelsManager7 = c53522.this$0;
                final String str3 = c53522.$modelId;
                modelsManager6.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager.downloadAndPack.2.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (alertDialog4.isShowing()) {
                            alertDialog4.dismiss();
                        }
                        modelsManager7.toast("✓ Модель " + str3 + " установлена");
                    }
                });
            } catch (Exception e) {
                ModelsManager modelsManager8 = c53522.this$0;
                final AlertDialog alertDialog5 = c53522.$dialog;
                final ModelsManager modelsManager9 = c53522.this$0;
                modelsManager8.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager.downloadAndPack.2.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (alertDialog5.isShowing()) {
                            alertDialog5.dismiss();
                        }
                        modelsManager9.toast("⚠️ Ошибка установки: " + e.getMessage());
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void packAll(String modelId, final List<? extends File> files) {
        CustomResources.INSTANCE.edit(this.context, new Function1<File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager.packAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(File file) throws IOException {
                invoke2(file);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(File stage) throws IOException {
                Intrinsics.checkNotNullParameter(stage, "stage");
                Iterable $this$forEach$iv = files;
                for (Object element$iv : $this$forEach$iv) {
                    File f = (File) element$iv;
                    String lowerCase = FilesKt__UtilsKt.getExtension(f).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    switch (lowerCase.hashCode()) {
                        case 97894:
                            if (lowerCase.equals("btx")) {
                                CustomResources customResources = CustomResources.INSTANCE;
                                String name = f.getName();
                                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                                customResources.putTexture(stage, f, name);
                            } else {
                                continue;
                            }
                            break;
                        case 98602:
                            if (lowerCase.equals("cls")) {
                                break;
                            }
                            break;
                        case 108290:
                            if (lowerCase.equals("mod")) {
                                break;
                            }
                            break;
                        default:
                            continue;
                    }
                    CustomResources customResources2 = CustomResources.INSTANCE;
                    String name2 = f.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    customResources2.putModel(stage, f, name2);
                }
            }
        });
        List<? extends File> $this$forEach$iv = files;
        for (Object element$iv : $this$forEach$iv) {
            File it = (File) element$iv;
            it.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toast(final String msg) {
        runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager.toast.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Toast.makeText(ModelsManager.this.context, msg, 0).show();
            }
        });
    }
}
