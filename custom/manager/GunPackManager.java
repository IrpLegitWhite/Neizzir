package com.blackhub.bronline.neizzir.fragments.custom.manager;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.core.constants.ScreenId;
import com.blackhub.bronline.neizzir.activities.main.util.CustomResources;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomFile;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomIndex;
import com.blackhub.bronline.neizzir.network.CachePolicy;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.EndpointRouter;
import com.blackhub.bronline.neizzir.network.NetworkResult;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import com.google.android.material.card.MaterialCardView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.FilesKt;
import kotlin.p040io.FilesKt__UtilsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.p043io.files.FileSystemKt;

/* JADX INFO: compiled from: GunPackManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001c\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J(\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\f0\u0015J&\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0002JN\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0002J\u001e\u0010$\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0002J\u0016\u0010&\u001a\u00020\f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0(H\u0002J\u0010\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006+"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/GunPackManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "<set-?>", "", "", "latestFileList", "getLatestFileList", "()Ljava/util/List;", "deleteEmptyFolders", "", "folder", "Ljava/io/File;", "downloadAndPack", "packId", "allFiles", "fetchPackList", "logosDir", "onResult", "Lkotlin/Function1;", "onAllComplete", "dialog", "Landroid/app/AlertDialog;", "tempFiles", "onItemComplete", "raw", "total", "", "bar", "Landroid/widget/ProgressBar;", "txt", "Landroid/widget/TextView;", "doneCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "packAll", "files", "runOnMain", "block", "Lkotlin/Function0;", "toast", NotificationCompat.CATEGORY_MESSAGE, "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class GunPackManager {
    private final Context context;
    private List<String> latestFileList;

    public GunPackManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.latestFileList = CollectionsKt__CollectionsKt.emptyList();
    }

    public final List<String> getLatestFileList() {
        return this.latestFileList;
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager$fetchPackList$1 */
    /* JADX INFO: compiled from: GunPackManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager$fetchPackList$1", m4426f = "GunPackManager.kt", m4427i = {0}, m4428l = {ScreenId.SCREEN_CATCH_STREAMER, 70}, m4429m = "invokeSuspend", m4430n = {"$this$launch"}, m4431s = {"L$0"})
    static final class C53471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<String>, Unit> $onResult;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C53471(Function1<? super List<String>, Unit> function1, Continuation<? super C53471> continuation) {
            super(2, continuation);
            this.$onResult = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C53471 c53471 = GunPackManager.this.new C53471(this.$onResult, continuation);
            c53471.L$0 = obj;
            return c53471;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0078  */
        /* JADX WARN: Code duplicated, block: B:15:0x007c  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:40:0x010c  */
        /* JADX WARN: Code duplicated, block: B:45:0x0144  */
        /* JADX WARN: Code duplicated, block: B:48:0x0148  */
        /* JADX WARN: Code duplicated, block: B:50:0x014b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0153  */
        /* JADX WARN: Code duplicated, block: B:53:0x0157  */
        /* JADX WARN: Code duplicated, block: B:57:0x018f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:58:0x0190  */
        /* JADX WARN: Code duplicated, block: B:66:0x015b A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object bytes;
            C53471 c53471;
            Object $result2;
            NetworkResult result;
            NetworkResult.Success success;
            List files;
            Collection destination$iv$iv;
            List ids;
            List list;
            List it;
            boolean z;
            int i;
            String str;
            byte[] it2;
            Object objM15551constructorimpl;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = 1;
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    final CoroutineScope $this$launch = (CoroutineScope) this.L$0;
                    EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                    CachePolicy.LastKnownGood lastKnownGood = new CachePolicy.LastKnownGood("custom-index:gunpuck", 0L, 2, null);
                    Function1<byte[], Boolean> function1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager$fetchPackList$1$result$1
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
                    bytes = router.getBytes(endpointGroup, "/api/gunpuck", (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : lastKnownGood, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.network.EndpointRouter.getBytes.2
                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(byte[] it4) {
                            Intrinsics.checkNotNullParameter(it4, "it");
                            return Boolean.valueOf(!(it4.length == 0));
                        }
                    } : function1, this);
                    if (bytes == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c53471 = this;
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
                    GunPackManager.this.latestFileList = files;
                    Iterable $this$forEach$iv$iv$iv = files;
                    destination$iv$iv = new ArrayList();
                    for (Object element$iv$iv : $this$forEach$iv$iv$iv) {
                        String path = (String) element$iv$iv;
                        char[] cArr = new char[i2];
                        cArr[0] = FileSystemKt.UnixPathSeparator;
                        it = StringsKt__StringsKt.split$default((CharSequence) path, cArr, false, 0, 6, (Object) null);
                        if (it.size() >= 3 || !Intrinsics.areEqual(it.get(0), "gunpuck")) {
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
                        i2 = i;
                    }
                    ids = CollectionsKt___CollectionsKt.distinct((List) destination$iv$iv);
                    list = files;
                    c53471.L$0 = null;
                    c53471.label = 2;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(list, GunPackManager.this, c53471.$onResult, ids, null), c53471) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure($result);
                    bytes = $result;
                    c53471 = this;
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
                    GunPackManager.this.latestFileList = files;
                    Iterable $this$forEach$iv$iv$iv2 = files;
                    destination$iv$iv = new ArrayList();
                    while (r12.hasNext()) {
                        String path2 = (String) element$iv$iv;
                        char[] cArr2 = new char[i2];
                        cArr2[0] = FileSystemKt.UnixPathSeparator;
                        it = StringsKt__StringsKt.split$default((CharSequence) path2, cArr2, false, 0, 6, (Object) null);
                        if (it.size() >= 3) {
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
                        i2 = i;
                    }
                    ids = CollectionsKt___CollectionsKt.distinct((List) destination$iv$iv);
                    list = files;
                    c53471.L$0 = null;
                    c53471.label = 2;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(list, GunPackManager.this, c53471.$onResult, ids, null), c53471) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager$fetchPackList$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: GunPackManager.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager$fetchPackList$1$1", m4426f = "GunPackManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<String> $files;
            final /* synthetic */ List<String> $ids;
            final /* synthetic */ Function1<List<String>, Unit> $onResult;
            int label;
            final /* synthetic */ GunPackManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(List<String> list, GunPackManager gunPackManager, Function1<? super List<String>, Unit> function1, List<String> list2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$files = list;
                this.this$0 = gunPackManager;
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
                            this.this$0.toast("Не удалось получить список");
                        }
                        this.$onResult.invoke(this.$ids);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void fetchPackList(File logosDir, Function1<? super List<String>, Unit> onResult) {
        Intrinsics.checkNotNullParameter(logosDir, "logosDir");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        BuildersKt__Builders_commonKt.launch$default(NetworkRuntime.INSTANCE.getApplicationScope(), null, null, new C53471(onResult, null), 3, null);
    }

    public final void downloadAndPack(String packId, List<String> allFiles) {
        Intrinsics.checkNotNullParameter(packId, "packId");
        Intrinsics.checkNotNullParameter(allFiles, "allFiles");
        List<String> $this$filter$iv = allFiles;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            String it = (String) element$iv$iv;
            if (StringsKt__StringsJVMKt.startsWith$default(it, new StringBuilder().append("gunpuck/").append(packId).append(FileSystemKt.UnixPathSeparator).toString(), false, 2, null) && !StringsKt__StringsJVMKt.endsWith$default(it, "logo.jpgg", false, 2, null)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        List toDownload = (List) destination$iv$iv;
        if (toDownload.isEmpty()) {
            toast("Нет файлов для загрузки");
            return;
        }
        final float density = this.context.getResources().getDisplayMetrics().density;
        Function1<Integer, Integer> function1 = new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager$downloadAndPack$dp$1
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
        MaterialCardView $this$downloadAndPack_u24lambda_u242 = new MaterialCardView(this.context);
        FrameLayout.LayoutParams $this$downloadAndPack_u24lambda_u242_u24lambda_u241 = new FrameLayout.LayoutParams(-1, -2);
        $this$downloadAndPack_u24lambda_u242_u24lambda_u241.setMargins(function1.invoke(24).intValue(), function1.invoke(48).intValue(), function1.invoke(24).intValue(), function1.invoke(48).intValue());
        $this$downloadAndPack_u24lambda_u242.setLayoutParams($this$downloadAndPack_u24lambda_u242_u24lambda_u241);
        $this$downloadAndPack_u24lambda_u242.setRadius(24.0f * density);
        $this$downloadAndPack_u24lambda_u242.setCardElevation(density * 12.0f);
        $this$downloadAndPack_u24lambda_u242.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        $this$downloadAndPack_u24lambda_u242.setStrokeWidth(function1.invoke(1).intValue());
        $this$downloadAndPack_u24lambda_u242.setStrokeColor(Color.parseColor("#2D2D35"));
        LinearLayout $this$downloadAndPack_u24lambda_u243 = new LinearLayout(this.context);
        $this$downloadAndPack_u24lambda_u243.setOrientation(1);
        $this$downloadAndPack_u24lambda_u243.setPadding(function1.invoke(24).intValue(), function1.invoke(24).intValue(), function1.invoke(24).intValue(), function1.invoke(24).intValue());
        LinearLayout $this$downloadAndPack_u24lambda_u245 = new LinearLayout(this.context);
        $this$downloadAndPack_u24lambda_u245.setOrientation(0);
        $this$downloadAndPack_u24lambda_u245.setGravity(16);
        LinearLayout.LayoutParams $this$downloadAndPack_u24lambda_u245_u24lambda_u244 = new LinearLayout.LayoutParams(-1, -2);
        $this$downloadAndPack_u24lambda_u245_u24lambda_u244.bottomMargin = function1.invoke(20).intValue();
        $this$downloadAndPack_u24lambda_u245.setLayoutParams($this$downloadAndPack_u24lambda_u245_u24lambda_u244);
        FrameLayout $this$downloadAndPack_u24lambda_u247 = new FrameLayout(this.context);
        GradientDrawable $this$downloadAndPack_u24lambda_u247_u24lambda_u246 = new GradientDrawable();
        $this$downloadAndPack_u24lambda_u247_u24lambda_u246.setShape(0);
        $this$downloadAndPack_u24lambda_u247_u24lambda_u246.setCornerRadius(12.0f * density);
        $this$downloadAndPack_u24lambda_u247_u24lambda_u246.setColor(Color.parseColor("#1A00E5CC"));
        $this$downloadAndPack_u24lambda_u247.setBackground($this$downloadAndPack_u24lambda_u247_u24lambda_u246);
        $this$downloadAndPack_u24lambda_u247.setLayoutParams(new LinearLayout.LayoutParams(function1.invoke(48).intValue(), function1.invoke(48).intValue()));
        ImageView $this$downloadAndPack_u24lambda_u248 = new ImageView(this.context);
        $this$downloadAndPack_u24lambda_u248.setImageResource(C3715R.drawable.neizzir19_ic_body);
        $this$downloadAndPack_u24lambda_u248.setColorFilter(Color.parseColor("#00E5CC"));
        $this$downloadAndPack_u24lambda_u248.setLayoutParams(new FrameLayout.LayoutParams(function1.invoke(28).intValue(), function1.invoke(28).intValue(), 17));
        $this$downloadAndPack_u24lambda_u247.addView($this$downloadAndPack_u24lambda_u248);
        TextView $this$downloadAndPack_u24lambda_u2410 = new TextView(this.context);
        $this$downloadAndPack_u24lambda_u2410.setText("Скачивание GunPack");
        $this$downloadAndPack_u24lambda_u2410.setTextSize(18.0f);
        $this$downloadAndPack_u24lambda_u2410.setTextColor(-1);
        $this$downloadAndPack_u24lambda_u2410.setTypeface(null, 1);
        LinearLayout.LayoutParams $this$downloadAndPack_u24lambda_u2410_u24lambda_u249 = new LinearLayout.LayoutParams(-2, -2);
        $this$downloadAndPack_u24lambda_u2410_u24lambda_u249.setMarginStart(function1.invoke(14).intValue());
        $this$downloadAndPack_u24lambda_u2410.setLayoutParams($this$downloadAndPack_u24lambda_u2410_u24lambda_u249);
        $this$downloadAndPack_u24lambda_u245.addView($this$downloadAndPack_u24lambda_u247);
        $this$downloadAndPack_u24lambda_u245.addView($this$downloadAndPack_u24lambda_u2410);
        $this$downloadAndPack_u24lambda_u243.addView($this$downloadAndPack_u24lambda_u245);
        TextView $this$downloadAndPack_u24lambda_u2412 = new TextView(this.context);
        $this$downloadAndPack_u24lambda_u2412.setText("Pack #" + packId);
        $this$downloadAndPack_u24lambda_u2412.setTextSize(14.0f);
        $this$downloadAndPack_u24lambda_u2412.setTextColor(Color.parseColor(TCPSettingsManager.COLOR_HINT));
        LinearLayout.LayoutParams $this$downloadAndPack_u24lambda_u2412_u24lambda_u2411 = new LinearLayout.LayoutParams(-1, -2);
        $this$downloadAndPack_u24lambda_u2412_u24lambda_u2411.bottomMargin = function1.invoke(20).intValue();
        $this$downloadAndPack_u24lambda_u2412.setLayoutParams($this$downloadAndPack_u24lambda_u2412_u24lambda_u2411);
        $this$downloadAndPack_u24lambda_u243.addView($this$downloadAndPack_u24lambda_u2412);
        ProgressBar $this$downloadAndPack_u24lambda_u2414 = new ProgressBar(this.context, null, R.attr.progressBarStyleHorizontal);
        $this$downloadAndPack_u24lambda_u2414.setMax(toDownload.size());
        $this$downloadAndPack_u24lambda_u2414.setProgress(0);
        $this$downloadAndPack_u24lambda_u2414.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#00E5CC")));
        $this$downloadAndPack_u24lambda_u2414.setProgressBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#2D2D35")));
        LinearLayout.LayoutParams $this$downloadAndPack_u24lambda_u2414_u24lambda_u2413 = new LinearLayout.LayoutParams(-1, function1.invoke(8).intValue());
        $this$downloadAndPack_u24lambda_u2414_u24lambda_u2413.bottomMargin = function1.invoke(12).intValue();
        $this$downloadAndPack_u24lambda_u2414.setLayoutParams($this$downloadAndPack_u24lambda_u2414_u24lambda_u2413);
        $this$downloadAndPack_u24lambda_u243.addView($this$downloadAndPack_u24lambda_u2414);
        TextView $this$downloadAndPack_u24lambda_u2415 = new TextView(this.context);
        $this$downloadAndPack_u24lambda_u2415.setText("0 / " + toDownload.size() + " файлов");
        $this$downloadAndPack_u24lambda_u2415.setTextSize(14.0f);
        $this$downloadAndPack_u24lambda_u2415.setTextColor(Color.parseColor("#B0FFFFFF"));
        $this$downloadAndPack_u24lambda_u2415.setGravity(17);
        $this$downloadAndPack_u24lambda_u243.addView($this$downloadAndPack_u24lambda_u2415);
        $this$downloadAndPack_u24lambda_u242.addView($this$downloadAndPack_u24lambda_u243);
        dialog.setView($this$downloadAndPack_u24lambda_u242);
        dialog.show();
        AtomicInteger doneCounter = new AtomicInteger(0);
        List tempFiles = Collections.synchronizedList(new ArrayList());
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C53461(toDownload, tempFiles, this, packId, doneCounter, dialog, $this$downloadAndPack_u24lambda_u2414, $this$downloadAndPack_u24lambda_u2415, $this$downloadAndPack_u24lambda_u2410, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager$downloadAndPack$1 */
    /* JADX INFO: compiled from: GunPackManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager$downloadAndPack$1", m4426f = "GunPackManager.kt", m4427i = {}, m4428l = {216}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C53461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProgressBar $bar;
        final /* synthetic */ AlertDialog $dialog;
        final /* synthetic */ AtomicInteger $doneCounter;
        final /* synthetic */ String $packId;
        final /* synthetic */ List<File> $tempFiles;
        final /* synthetic */ TextView $titleView;
        final /* synthetic */ List<String> $toDownload;
        final /* synthetic */ TextView $txt;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ GunPackManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53461(List<String> list, List<File> list2, GunPackManager gunPackManager, String str, AtomicInteger atomicInteger, AlertDialog alertDialog, ProgressBar progressBar, TextView textView, TextView textView2, Continuation<? super C53461> continuation) {
            super(2, continuation);
            this.$toDownload = list;
            this.$tempFiles = list2;
            this.this$0 = gunPackManager;
            this.$packId = str;
            this.$doneCounter = atomicInteger;
            this.$dialog = alertDialog;
            this.$bar = progressBar;
            this.$txt = textView;
            this.$titleView = textView2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C53461 c53461 = new C53461(this.$toDownload, this.$tempFiles, this.this$0, this.$packId, this.$doneCounter, this.$dialog, this.$bar, this.$txt, this.$titleView, continuation);
            c53461.L$0 = obj;
            return c53461;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C53461 c53461;
            int i;
            Object objAwaitAll;
            int $i$f$all;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c53461 = this;
                    CoroutineScope $this$launch = (CoroutineScope) c53461.L$0;
                    Iterable $this$map$iv = c53461.$toDownload;
                    GunPackManager gunPackManager = c53461.this$0;
                    List<File> list = c53461.$tempFiles;
                    AtomicInteger atomicInteger = c53461.$doneCounter;
                    AlertDialog alertDialog = c53461.$dialog;
                    ProgressBar progressBar = c53461.$bar;
                    TextView textView = c53461.$txt;
                    List<String> list2 = c53461.$toDownload;
                    Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
                    for (Object item$iv$iv : $this$map$iv) {
                        String raw = (String) item$iv$iv;
                        Collection destination$iv$iv2 = destination$iv$iv;
                        List<String> list3 = list2;
                        TextView textView2 = textView;
                        ProgressBar progressBar2 = progressBar;
                        destination$iv$iv2.add(BuildersKt__Builders_commonKt.async$default($this$launch, null, null, new GunPackManager$downloadAndPack$1$successful$1$1(gunPackManager, raw, list, atomicInteger, alertDialog, progressBar2, textView2, list3, null), 3, null));
                        destination$iv$iv = destination$iv$iv2;
                        list2 = list3;
                        textView = textView2;
                        progressBar = progressBar2;
                        atomicInteger = atomicInteger;
                        list = list;
                        gunPackManager = gunPackManager;
                    }
                    i = 1;
                    c53461.label = 1;
                    objAwaitAll = AwaitKt.awaitAll((List) destination$iv$iv, c53461);
                    if (objAwaitAll == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objAwaitAll = $result;
                    i = 1;
                    c53461 = this;
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
                Iterable tempFiles = c53461.$tempFiles;
                Intrinsics.checkNotNullExpressionValue(tempFiles, "$tempFiles");
                Iterable $this$forEach$iv = tempFiles;
                for (Object element$iv2 : $this$forEach$iv) {
                    File p0 = (File) element$iv2;
                    p0.delete();
                }
                GunPackManager gunPackManager2 = c53461.this$0;
                final AlertDialog alertDialog2 = c53461.$dialog;
                final GunPackManager gunPackManager3 = c53461.this$0;
                final String str = c53461.$packId;
                gunPackManager2.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager.downloadAndPack.1.2
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
                        gunPackManager3.toast("⚠️ Не удалось скачать все файлы Pack " + str);
                    }
                });
                return Unit.INSTANCE;
            }
            GunPackManager gunPackManager4 = c53461.this$0;
            final AlertDialog alertDialog3 = c53461.$dialog;
            final TextView textView3 = c53461.$titleView;
            final TextView textView4 = c53461.$txt;
            gunPackManager4.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager.downloadAndPack.1.3
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
                        textView3.setText("Упаковка файлов...");
                        textView4.setText("Подготовка архива...");
                    }
                }
            });
            try {
                GunPackManager gunPackManager5 = c53461.this$0;
                String str2 = c53461.$packId;
                List<File> tempFiles2 = c53461.$tempFiles;
                Intrinsics.checkNotNullExpressionValue(tempFiles2, "$tempFiles");
                gunPackManager5.packAll(str2, tempFiles2);
                GunPackManager gunPackManager6 = c53461.this$0;
                final AlertDialog alertDialog4 = c53461.$dialog;
                final GunPackManager gunPackManager7 = c53461.this$0;
                final String str3 = c53461.$packId;
                gunPackManager6.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager.downloadAndPack.1.4
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
                        gunPackManager7.toast("✓ Pack " + str3 + " установлен");
                    }
                });
            } catch (Exception e) {
                GunPackManager gunPackManager8 = c53461.this$0;
                final AlertDialog alertDialog5 = c53461.$dialog;
                final GunPackManager gunPackManager9 = c53461.this$0;
                gunPackManager8.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager.downloadAndPack.1.5
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
                        gunPackManager9.toast("⚠️ Ошибка упаковки: " + e.getMessage());
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runOnMain(final Function0<Unit> block) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                GunPackManager.runOnMain$lambda$16(block);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runOnMain$lambda$16(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager$onAllComplete$1 */
    /* JADX INFO: compiled from: GunPackManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager$onAllComplete$1", m4426f = "GunPackManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C53481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AlertDialog $dialog;
        final /* synthetic */ String $packId;
        final /* synthetic */ List<File> $tempFiles;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C53481(String str, List<? extends File> list, AlertDialog alertDialog, Continuation<? super C53481> continuation) {
            super(2, continuation);
            this.$packId = str;
            this.$tempFiles = list;
            this.$dialog = alertDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GunPackManager.this.new C53481(this.$packId, this.$tempFiles, this.$dialog, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    GunPackManager.this.packAll(this.$packId, this.$tempFiles);
                    Handler handler = new Handler(Looper.getMainLooper());
                    final AlertDialog alertDialog = this.$dialog;
                    final GunPackManager gunPackManager = GunPackManager.this;
                    final String str = this.$packId;
                    handler.post(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager$onAllComplete$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            GunPackManager.C53481.invokeSuspend$lambda$0(alertDialog, gunPackManager, str);
                        }
                    });
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(AlertDialog $dialog, GunPackManager this$0, String $packId) {
            $dialog.dismiss();
            this$0.toast("✓ Pack " + $packId + " скачан и упакован");
        }
    }

    private final void onAllComplete(AlertDialog dialog, String packId, List<? extends File> tempFiles) {
        dialog.setTitle("Упаковка Pack " + packId + Typography.ellipsis);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C53481(packId, tempFiles, dialog, null), 3, null);
    }

    private final void onItemComplete(String raw, final String packId, final int total, final ProgressBar bar, final TextView txt, final AlertDialog dialog, AtomicInteger doneCounter, final List<? extends File> tempFiles) {
        final int done = doneCounter.incrementAndGet();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                GunPackManager.onItemComplete$lambda$17(bar, done, txt, total, dialog, packId, this, tempFiles);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onItemComplete$lambda$17(ProgressBar bar, int $done, TextView txt, int $total, AlertDialog dialog, String packId, GunPackManager this$0, List tempFiles) {
        Intrinsics.checkNotNullParameter(bar, "$bar");
        Intrinsics.checkNotNullParameter(txt, "$txt");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(packId, "$packId");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tempFiles, "$tempFiles");
        bar.setProgress($done);
        txt.setText(new StringBuilder().append($done).append(FileSystemKt.UnixPathSeparator).append($total).toString());
        if ($done == $total) {
            dialog.setTitle("Упаковка Pack " + packId + Typography.ellipsis);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new GunPackManager$onItemComplete$1$1(this$0, packId, tempFiles, dialog, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void packAll(String packId, final List<? extends File> files) throws IOException {
        final File packRoot = new File(this.context.getCacheDir(), "gunpuck/" + packId).getCanonicalFile();
        CustomResources.INSTANCE.edit(this.context, new Function1<File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager.packAll.1
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
                File file = packRoot;
                for (Object element$iv : $this$forEach$iv) {
                    File file2 = (File) element$iv;
                    String canonicalPath = file2.getCanonicalPath();
                    Intrinsics.checkNotNullExpressionValue(canonicalPath, "getCanonicalPath(...)");
                    if (!StringsKt__StringsJVMKt.startsWith$default(canonicalPath, file.getPath() + File.separator, false, 2, null)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    File canonicalFile = file2.getCanonicalFile();
                    Intrinsics.checkNotNullExpressionValue(canonicalFile, "getCanonicalFile(...)");
                    Intrinsics.checkNotNull(file);
                    String name = FilesKt.getInvariantSeparatorsPath(FilesKt.relativeTo(canonicalFile, file));
                    String lowerCase = FilesKt__UtilsKt.getExtension(file2).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    switch (lowerCase.hashCode()) {
                        case 97894:
                            if (lowerCase.equals("btx")) {
                                CustomResources.INSTANCE.putTexture(stage, file2, name);
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
                    CustomResources.INSTANCE.putModel(stage, file2, name);
                }
            }
        });
        List<? extends File> $this$forEach$iv = files;
        for (Object element$iv : $this$forEach$iv) {
            File it = (File) element$iv;
            it.delete();
        }
    }

    private final void deleteEmptyFolders(File folder) {
        File[] files;
        if (folder.exists() && folder.isDirectory() && (files = folder.listFiles()) != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    Intrinsics.checkNotNull(file);
                    deleteEmptyFolders(file);
                }
            }
            File[] remainingFiles = folder.listFiles();
            if (remainingFiles != null) {
                if (!(remainingFiles.length == 0)) {
                    return;
                }
            }
            folder.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toast(final String msg) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                GunPackManager.toast$lambda$19(this.f$0, msg);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toast$lambda$19(GunPackManager this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "$msg");
        Toast.makeText(this$0.context, msg, 0).show();
    }
}
