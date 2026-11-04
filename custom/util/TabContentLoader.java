package com.blackhub.bronline.neizzir.fragments.custom.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blackhub.bronline.neizzir.network.CachePolicy;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.EndpointRouter;
import com.blackhub.bronline.neizzir.network.NetworkResult;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.CloseableKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import kotlinx.p043io.files.FileSystemKt;

/* JADX INFO: compiled from: TabContentLoader.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJr\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u001528\b\u0002\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\r0\u00172\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u001eJ$\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\"J8\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\"J(\u0010$\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00102\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\r0\u001eJ\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u0010H\u0002J\u0014\u0010*\u001a\u00020\u001f*\u00020\u00152\u0006\u0010+\u001a\u00020\u0013H\u0002J\f\u0010,\u001a\u00020\u0010*\u00020\u0015H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/util/TabContentLoader;", "", "fragment", "Landroidx/fragment/app/Fragment;", "router", "Lcom/blackhub/bronline/neizzir/network/EndpointRouter;", "(Landroidx/fragment/app/Fragment;Lcom/blackhub/bronline/neizzir/network/EndpointRouter;)V", "downloadJob", "Lkotlinx/coroutines/Job;", "listJob", "smallFileSemaphore", "Lkotlinx/coroutines/sync/Semaphore;", "cancel", "", "downloadFiles", "remotePrefix", "", "files", "", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomFile;", "localFolder", "Ljava/io/File;", "onProgress", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "done", "total", "onComplete", "Lkotlin/Function1;", "", "downloadFolder", "remotePath", "Lkotlin/Function0;", "shouldDownload", "fetchIndex", "parseValidIndex", "bytes", "", "uiError", "message", "isValid", "remote", "sha1", "ProgressHolder", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class TabContentLoader {
    private Job downloadJob;
    private final Fragment fragment;
    private Job listJob;
    private final EndpointRouter router;
    private final Semaphore smallFileSemaphore;

    /* JADX INFO: compiled from: TabContentLoader.kt */
    @Metadata(m4415d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/util/TabContentLoader$ProgressHolder;", "", "showProgress", "", "show", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public interface ProgressHolder {
        void showProgress(boolean show);
    }

    public TabContentLoader(Fragment fragment, EndpointRouter router) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(router, "router");
        this.fragment = fragment;
        this.router = router;
        this.smallFileSemaphore = SemaphoreKt.Semaphore$default(4, 0, 2, null);
    }

    public /* synthetic */ TabContentLoader(Fragment fragment, EndpointRouter endpointRouter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, (i & 2) != 0 ? NetworkRuntime.INSTANCE.getRouter() : endpointRouter);
    }

    public final void cancel() {
        Job job = this.listJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.downloadJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.listJob = null;
        this.downloadJob = null;
        ActivityResultCaller activityResultCaller = this.fragment;
        ProgressHolder progressHolder = activityResultCaller instanceof ProgressHolder ? (ProgressHolder) activityResultCaller : null;
        if (progressHolder != null) {
            progressHolder.showProgress(false);
        }
    }

    public final void fetchIndex(String remotePath, Function1<? super List<RemoteCustomFile>, Unit> onComplete) {
        ProgressHolder progressHolder;
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        cancel();
        String normalized = StringsKt__StringsKt.trimStart(remotePath, FileSystemKt.UnixPathSeparator);
        String cacheKey = "custom-index:" + normalized;
        byte[] cachedBytes = this.router.cachedBytes(cacheKey);
        List<RemoteCustomFile> validIndex = cachedBytes != null ? parseValidIndex(cachedBytes) : null;
        Integer cachedFingerprint = cachedBytes != null ? Integer.valueOf(Arrays.hashCode(cachedBytes)) : null;
        if (validIndex != null) {
            onComplete.invoke(validIndex);
            ActivityResultCaller activityResultCaller = this.fragment;
            progressHolder = activityResultCaller instanceof ProgressHolder ? (ProgressHolder) activityResultCaller : null;
            if (progressHolder != null) {
                progressHolder.showProgress(false);
            }
        } else {
            ActivityResultCaller activityResultCaller2 = this.fragment;
            progressHolder = activityResultCaller2 instanceof ProgressHolder ? (ProgressHolder) activityResultCaller2 : null;
            if (progressHolder != null) {
                progressHolder.showProgress(true);
            }
        }
        if (validIndex != null) {
            Long lCachedAgeMs = this.router.cachedAgeMs(cacheKey);
            if ((lCachedAgeMs != null ? lCachedAgeMs.longValue() : Long.MAX_VALUE) <= 60000) {
                return;
            }
        }
        LifecycleOwner viewLifecycleOwner = this.fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.listJob = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C55101(normalized, cacheKey, cachedFingerprint, onComplete, validIndex, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.util.TabContentLoader$fetchIndex$1 */
    /* JADX INFO: compiled from: TabContentLoader.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.util.TabContentLoader$fetchIndex$1", m4426f = "TabContentLoader.kt", m4427i = {}, m4428l = {63}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $cacheKey;
        final /* synthetic */ List<RemoteCustomFile> $cachedFiles;
        final /* synthetic */ Integer $cachedFingerprint;
        final /* synthetic */ String $normalized;
        final /* synthetic */ Function1<List<RemoteCustomFile>, Unit> $onComplete;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C55101(String str, String str2, Integer num, Function1<? super List<RemoteCustomFile>, Unit> function1, List<RemoteCustomFile> list, Continuation<? super C55101> continuation) {
            super(2, continuation);
            this.$normalized = str;
            this.$cacheKey = str2;
            this.$cachedFingerprint = num;
            this.$onComplete = function1;
            this.$cachedFiles = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TabContentLoader.this.new C55101(this.$normalized, this.$cacheKey, this.$cachedFingerprint, this.$onComplete, this.$cachedFiles, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C55101 c55101;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c55101 = this;
                    EndpointRouter endpointRouter = TabContentLoader.this.router;
                    EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                    String str = "/api/" + c55101.$normalized;
                    String str2 = c55101.$cacheKey;
                    final TabContentLoader tabContentLoader = TabContentLoader.this;
                    c55101.label = 1;
                    Object objRefreshBytes$default = EndpointRouter.refreshBytes$default(endpointRouter, endpointGroup, str, str2, 0L, new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.TabContentLoader$fetchIndex$1$result$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(byte[] it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Boolean.valueOf(tabContentLoader.parseValidIndex(it) != null);
                        }
                    }, c55101, 8, null);
                    if (objRefreshBytes$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objRefreshBytes$default;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c55101 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            NetworkResult result = (NetworkResult) $result;
            if (result instanceof NetworkResult.Success) {
                List<RemoteCustomFile> validIndex = TabContentLoader.this.parseValidIndex((byte[]) ((NetworkResult.Success) result).getValue());
                if (validIndex != null) {
                    int iHashCode = Arrays.hashCode((byte[]) ((NetworkResult.Success) result).getValue());
                    Integer num = c55101.$cachedFingerprint;
                    if (num == null || iHashCode != num.intValue()) {
                        c55101.$onComplete.invoke(validIndex);
                    }
                }
            } else if ((result instanceof NetworkResult.Failure) && c55101.$cachedFiles == null) {
                TabContentLoader.this.uiError("Не удалось загрузить каталог. Проверьте подключение к интернету");
                c55101.$onComplete.invoke(CollectionsKt__CollectionsKt.emptyList());
            }
            ActivityResultCaller activityResultCaller = TabContentLoader.this.fragment;
            ProgressHolder progressHolder = activityResultCaller instanceof ProgressHolder ? (ProgressHolder) activityResultCaller : null;
            if (progressHolder != null) {
                progressHolder.showProgress(false);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void downloadFiles$default(TabContentLoader tabContentLoader, String str, List list, File file, Function2 function2, Function1 function1, int i, Object obj) {
        Function2 function3;
        if ((i & 8) == 0) {
            function3 = function2;
        } else {
            function3 = new Function2<Integer, Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.TabContentLoader.downloadFiles.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
                    invoke(num.intValue(), num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i2, int i3) {
                }
            };
        }
        tabContentLoader.downloadFiles(str, list, file, function3, function1);
    }

    public final void downloadFiles(String remotePrefix, List<RemoteCustomFile> files, File localFolder, Function2<? super Integer, ? super Integer, Unit> onProgress, Function1<? super Boolean, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(remotePrefix, "remotePrefix");
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(localFolder, "localFolder");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Job job = this.downloadJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        localFolder.mkdirs();
        List<RemoteCustomFile> $this$distinctBy$iv = files;
        HashSet set$iv = new HashSet();
        ArrayList list$iv = new ArrayList();
        for (Object e$iv : $this$distinctBy$iv) {
            RemoteCustomFile it = (RemoteCustomFile) e$iv;
            if (set$iv.add(it.getPath())) {
                list$iv.add(e$iv);
            }
        }
        ArrayList selected = list$iv;
        LifecycleOwner viewLifecycleOwner = this.fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.downloadJob = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C55072(selected, onComplete, this, remotePrefix, localFolder, onProgress, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.util.TabContentLoader$downloadFiles$2 */
    /* JADX INFO: compiled from: TabContentLoader.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.util.TabContentLoader$downloadFiles$2", m4426f = "TabContentLoader.kt", m4427i = {0}, m4428l = {118}, m4429m = "invokeSuspend", m4430n = {"success"}, m4431s = {"L$0"})
    static final class C55072 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ File $localFolder;
        final /* synthetic */ Function1<Boolean, Unit> $onComplete;
        final /* synthetic */ Function2<Integer, Integer, Unit> $onProgress;
        final /* synthetic */ String $remotePrefix;
        final /* synthetic */ List<RemoteCustomFile> $selected;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TabContentLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C55072(List<RemoteCustomFile> list, Function1<? super Boolean, Unit> function1, TabContentLoader tabContentLoader, String str, File file, Function2<? super Integer, ? super Integer, Unit> function2, Continuation<? super C55072> continuation) {
            super(2, continuation);
            this.$selected = list;
            this.$onComplete = function1;
            this.this$0 = tabContentLoader;
            this.$remotePrefix = str;
            this.$localFolder = file;
            this.$onProgress = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C55072 c55072 = new C55072(this.$selected, this.$onComplete, this.this$0, this.$remotePrefix, this.$localFolder, this.$onProgress, continuation);
            c55072.L$0 = obj;
            return c55072;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55072) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C55072 c55072;
            AtomicBoolean success;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        c55072 = this;
                        CoroutineScope $this$launch = (CoroutineScope) c55072.L$0;
                        AtomicInteger done = new AtomicInteger(0);
                        int i = 1;
                        AtomicBoolean success2 = new AtomicBoolean(true);
                        Iterable $this$map$iv = c55072.$selected;
                        TabContentLoader tabContentLoader = c55072.this$0;
                        String str = c55072.$remotePrefix;
                        File file = c55072.$localFolder;
                        Function2<Integer, Integer, Unit> function2 = c55072.$onProgress;
                        List<RemoteCustomFile> list = c55072.$selected;
                        Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
                        Collection destination$iv$iv2 = destination$iv$iv;
                        for (Object item$iv$iv : $this$map$iv) {
                            RemoteCustomFile file2 = (RemoteCustomFile) item$iv$iv;
                            Collection destination$iv$iv3 = destination$iv$iv2;
                            List<RemoteCustomFile> list2 = list;
                            Function2<Integer, Integer, Unit> function3 = function2;
                            destination$iv$iv3.add(BuildersKt__Builders_commonKt.async$default($this$launch, null, null, new TabContentLoader$downloadFiles$2$1$1(tabContentLoader, str, file2, file, success2, function3, done, list2, null), 3, null));
                            success2 = success2;
                            i = i;
                            str = str;
                            tabContentLoader = tabContentLoader;
                            list = list2;
                            function2 = function3;
                            destination$iv$iv2 = destination$iv$iv3;
                            file = file;
                        }
                        AtomicBoolean success3 = success2;
                        Collection destination$iv$iv4 = destination$iv$iv2;
                        c55072.L$0 = success3;
                        c55072.label = i;
                        if (AwaitKt.awaitAll((List) destination$iv$iv4, c55072) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        success = success3;
                        break;
                        break;
                    case 1:
                        c55072 = this;
                        success = (AtomicBoolean) c55072.L$0;
                        ResultKt.throwOnFailure($result);
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c55072.$onComplete.invoke(Boxing.boxBoolean(success.get()));
            } catch (CancellationException e) {
            }
            return Unit.INSTANCE;
        }
    }

    public final void downloadFolder(String remotePath, File localFolder, Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        Intrinsics.checkNotNullParameter(localFolder, "localFolder");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        downloadFolder(remotePath, localFolder, new Function1<String, Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.TabContentLoader.downloadFolder.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return true;
            }
        }, onComplete);
    }

    public final void downloadFolder(String remotePath, File localFolder, Function1<? super String, Boolean> shouldDownload, Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        Intrinsics.checkNotNullParameter(localFolder, "localFolder");
        Intrinsics.checkNotNullParameter(shouldDownload, "shouldDownload");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        cancel();
        localFolder.mkdirs();
        ActivityResultCaller activityResultCaller = this.fragment;
        ProgressHolder progressHolder = activityResultCaller instanceof ProgressHolder ? (ProgressHolder) activityResultCaller : null;
        if (progressHolder != null) {
            progressHolder.showProgress(true);
        }
        String normalized = StringsKt__StringsKt.trimStart(remotePath, FileSystemKt.UnixPathSeparator);
        String cacheKey = "custom-index:" + normalized;
        LifecycleOwner viewLifecycleOwner = this.fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.listJob = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C55092(normalized, cacheKey, localFolder, shouldDownload, onComplete, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.util.TabContentLoader$downloadFolder$2 */
    /* JADX INFO: compiled from: TabContentLoader.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.util.TabContentLoader$downloadFolder$2", m4426f = "TabContentLoader.kt", m4427i = {}, m4428l = {142}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55092 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $cacheKey;
        final /* synthetic */ File $localFolder;
        final /* synthetic */ String $normalized;
        final /* synthetic */ Function0<Unit> $onComplete;
        final /* synthetic */ Function1<String, Boolean> $shouldDownload;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C55092(String str, String str2, File file, Function1<? super String, Boolean> function1, Function0<Unit> function0, Continuation<? super C55092> continuation) {
            super(2, continuation);
            this.$normalized = str;
            this.$cacheKey = str2;
            this.$localFolder = file;
            this.$shouldDownload = function1;
            this.$onComplete = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TabContentLoader.this.new C55092(this.$normalized, this.$cacheKey, this.$localFolder, this.$shouldDownload, this.$onComplete, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55092) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C55092 c55092;
            List files;
            byte[] p0;
            Iterable validIndex;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c55092 = this;
                    EndpointRouter endpointRouter = TabContentLoader.this.router;
                    EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                    String str = "/api/" + c55092.$normalized;
                    CachePolicy.LastKnownGood lastKnownGood = new CachePolicy.LastKnownGood(c55092.$cacheKey, 0L, 2, null);
                    final TabContentLoader tabContentLoader = TabContentLoader.this;
                    Function1<byte[], Boolean> function1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.TabContentLoader$downloadFolder$2$result$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(byte[] it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Boolean.valueOf(tabContentLoader.parseValidIndex(it) != null);
                        }
                    };
                    c55092.label = 1;
                    Object bytes = endpointRouter.getBytes(endpointGroup, str, (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : lastKnownGood, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? EndpointRouter.C56582.INSTANCE : function1, c55092);
                    if (bytes == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = bytes;
                    break;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c55092 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            NetworkResult result = (NetworkResult) $result;
            NetworkResult.Success success = result instanceof NetworkResult.Success ? (NetworkResult.Success) result : null;
            if (success == null || (p0 = (byte[]) success.getValue()) == null || (validIndex = TabContentLoader.this.parseValidIndex(p0)) == null) {
                files = null;
            } else {
                Iterable $this$filterTo$iv$iv = validIndex;
                Function1<String, Boolean> function2 = c55092.$shouldDownload;
                Collection destination$iv$iv = new ArrayList();
                for (Object element$iv$iv : $this$filterTo$iv$iv) {
                    RemoteCustomFile it = (RemoteCustomFile) element$iv$iv;
                    if (function2.invoke(it.getPath()).booleanValue()) {
                        destination$iv$iv.add(element$iv$iv);
                    }
                }
                files = (List) destination$iv$iv;
            }
            if (files == null) {
                ActivityResultCaller activityResultCaller = TabContentLoader.this.fragment;
                ProgressHolder progressHolder = activityResultCaller instanceof ProgressHolder ? (ProgressHolder) activityResultCaller : null;
                if (progressHolder != null) {
                    progressHolder.showProgress(false);
                }
                TabContentLoader.this.uiError("Не удалось загрузить каталог");
                return Unit.INSTANCE;
            }
            TabContentLoader tabContentLoader2 = TabContentLoader.this;
            String str2 = c55092.$normalized;
            File file = c55092.$localFolder;
            AnonymousClass1 anonymousClass1 = new Function2<Integer, Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.TabContentLoader.downloadFolder.2.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
                    invoke(num.intValue(), num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i, int i2) {
                }
            };
            final TabContentLoader tabContentLoader3 = TabContentLoader.this;
            final Function0<Unit> function0 = c55092.$onComplete;
            tabContentLoader2.downloadFiles(str2, files, file, anonymousClass1, new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.TabContentLoader.downloadFolder.2.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean success2) {
                    ActivityResultCaller activityResultCaller2 = tabContentLoader3.fragment;
                    ProgressHolder progressHolder2 = activityResultCaller2 instanceof ProgressHolder ? (ProgressHolder) activityResultCaller2 : null;
                    if (progressHolder2 != null) {
                        progressHolder2.showProgress(false);
                    }
                    if (!success2) {
                        tabContentLoader3.uiError("Часть файлов не удалось загрузить");
                    }
                    function0.invoke();
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<RemoteCustomFile> parseValidIndex(byte[] bytes) {
        Object objM15551constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            TabContentLoader tabContentLoader = this;
            objM15551constructorimpl = Result.m15551constructorimpl(RemoteCustomIndex.INSTANCE.parseFiles(new String(bytes, Charsets.UTF_8)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
            objM15551constructorimpl = null;
        }
        List<RemoteCustomFile> list = (List) objM15551constructorimpl;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(File $this$isValid, RemoteCustomFile remote) {
        if (!$this$isValid.isFile()) {
            return false;
        }
        if (remote.getSize() >= 0 && $this$isValid.length() != remote.getSize()) {
            return false;
        }
        if (StringsKt__StringsKt.isBlank(remote.getSha1()) || StringsKt__StringsJVMKt.equals(sha1($this$isValid), remote.getSha1(), true)) {
            return remote.getSize() >= 0 || !StringsKt__StringsKt.isBlank(remote.getSha1());
        }
        return false;
    }

    private final String sha1(File $this$sha1) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-1");
        byte[] buffer = new byte[8192];
        FileInputStream fileInputStream = new FileInputStream($this$sha1);
        try {
            FileInputStream input = fileInputStream;
            while (true) {
                int count = input.read(buffer);
                if (count < 0) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    byte[] bArrDigest = digest.digest();
                    Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                    return ArraysKt___ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.TabContentLoader.sha1.2
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
                digest.update(buffer, 0, count);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void uiError(final String message) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.TabContentLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TabContentLoader.uiError$lambda$4(this.f$0, message);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uiError$lambda$4(TabContentLoader this$0, String message) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "$message");
        Context context = this$0.fragment.getContext();
        if (context == null || this$0.fragment.getView() == null) {
            return;
        }
        Toast.makeText(context, message, 0).show();
    }
}
