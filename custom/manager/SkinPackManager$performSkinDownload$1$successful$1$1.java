package com.blackhub.bronline.neizzir.fragments.custom.manager;

import android.app.AlertDialog;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.blackhub.bronline.neizzir.network.DownloadSpec;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.EndpointRouter;
import com.blackhub.bronline.neizzir.network.NetworkResult;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: compiled from: SkinPackManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$performSkinDownload$1$successful$1$1", m4426f = "SkinPackManager.kt", m4427i = {0, 1}, m4428l = {449, 357}, m4429m = "invokeSuspend", m4430n = {"$this$withPermit$iv", "$this$withPermit$iv"}, m4431s = {"L$0", "L$0"})
final class SkinPackManager$performSkinDownload$1$successful$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ ProgressBar $bar;
    final /* synthetic */ AlertDialog $dialog;
    final /* synthetic */ AtomicInteger $doneCnt;
    final /* synthetic */ String $path;
    final /* synthetic */ List<File> $tempFiles;
    final /* synthetic */ List<String> $toDownload;
    final /* synthetic */ TextView $txt;
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
    final /* synthetic */ SkinPackManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkinPackManager$performSkinDownload$1$successful$1$1(SkinPackManager skinPackManager, String str, List<File> list, AtomicInteger atomicInteger, AlertDialog alertDialog, ProgressBar progressBar, TextView textView, List<String> list2, Continuation<? super SkinPackManager$performSkinDownload$1$successful$1$1> continuation) {
        super(2, continuation);
        this.this$0 = skinPackManager;
        this.$path = str;
        this.$tempFiles = list;
        this.$doneCnt = atomicInteger;
        this.$dialog = alertDialog;
        this.$bar = progressBar;
        this.$txt = textView;
        this.$toDownload = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SkinPackManager$performSkinDownload$1$successful$1$1(this.this$0, this.$path, this.$tempFiles, this.$doneCnt, this.$dialog, this.$bar, this.$txt, this.$toDownload, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((SkinPackManager$performSkinDownload$1$successful$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:28:0x0150 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0151  */
    /* JADX WARN: Code duplicated, block: B:32:0x0162 A[Catch: all -> 0x018d, TryCatch #4 {all -> 0x018d, blocks: (B:30:0x015c, B:32:0x0162, B:33:0x0171), top: B:52:0x015c }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SkinPackManager$performSkinDownload$1$successful$1$1 skinPackManager$performSkinDownload$1$successful$1$1;
        Object $result;
        AlertDialog alertDialog;
        Semaphore $this$withPermit$iv;
        SkinPackManager skinPackManager;
        List<String> list;
        String str;
        Collection collection;
        TextView textView;
        AtomicInteger atomicInteger;
        final ProgressBar progressBar;
        Semaphore $this$withPermit$iv2;
        File $this$invokeSuspend_u24lambda_u241_u24lambda_u240;
        File parentFile;
        Object $result2;
        Object $result3;
        Object $result4;
        SkinPackManager skinPackManager2;
        TextView textView2;
        final AlertDialog alertDialog2;
        final List<String> list2;
        Collection collection2;
        NetworkResult result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                skinPackManager$performSkinDownload$1$successful$1$1 = this;
                $result = obj;
                Semaphore $this$withPermit$iv3 = NetworkRuntime.INSTANCE.getGameDownloadSemaphore();
                SkinPackManager skinPackManager3 = skinPackManager$performSkinDownload$1$successful$1$1.this$0;
                String str2 = skinPackManager$performSkinDownload$1$successful$1$1.$path;
                Collection collection3 = skinPackManager$performSkinDownload$1$successful$1$1.$tempFiles;
                AtomicInteger atomicInteger2 = skinPackManager$performSkinDownload$1$successful$1$1.$doneCnt;
                alertDialog = skinPackManager$performSkinDownload$1$successful$1$1.$dialog;
                ProgressBar progressBar2 = skinPackManager$performSkinDownload$1$successful$1$1.$bar;
                TextView textView3 = skinPackManager$performSkinDownload$1$successful$1$1.$txt;
                List<String> list3 = skinPackManager$performSkinDownload$1$successful$1$1.$toDownload;
                skinPackManager$performSkinDownload$1$successful$1$1.L$0 = $this$withPermit$iv3;
                skinPackManager$performSkinDownload$1$successful$1$1.L$1 = skinPackManager3;
                skinPackManager$performSkinDownload$1$successful$1$1.L$2 = str2;
                skinPackManager$performSkinDownload$1$successful$1$1.L$3 = collection3;
                skinPackManager$performSkinDownload$1$successful$1$1.L$4 = atomicInteger2;
                skinPackManager$performSkinDownload$1$successful$1$1.L$5 = alertDialog;
                skinPackManager$performSkinDownload$1$successful$1$1.L$6 = progressBar2;
                skinPackManager$performSkinDownload$1$successful$1$1.L$7 = textView3;
                skinPackManager$performSkinDownload$1$successful$1$1.L$8 = list3;
                skinPackManager$performSkinDownload$1$successful$1$1.label = 1;
                if ($this$withPermit$iv3.acquire(skinPackManager$performSkinDownload$1$successful$1$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                $this$withPermit$iv = $this$withPermit$iv3;
                skinPackManager = skinPackManager3;
                list = list3;
                str = str2;
                collection = collection3;
                textView = textView3;
                atomicInteger = atomicInteger2;
                progressBar = progressBar2;
                try {
                    $this$invokeSuspend_u24lambda_u241_u24lambda_u240 = new File(skinPackManager.ctx.getCacheDir(), str);
                    parentFile = $this$invokeSuspend_u24lambda_u241_u24lambda_u240.getParentFile();
                    if (parentFile != null) {
                        EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                        EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                        $result2 = $result;
                        String str3 = "/api/fetch_file/" + str;
                        DownloadSpec downloadSpec = new DownloadSpec($this$invokeSuspend_u24lambda_u241_u24lambda_u240, null, null, false, null, 30, null);
                        skinPackManager$performSkinDownload$1$successful$1$1.L$0 = $this$withPermit$iv;
                        skinPackManager$performSkinDownload$1$successful$1$1.L$1 = skinPackManager;
                        skinPackManager$performSkinDownload$1$successful$1$1.L$2 = collection;
                        skinPackManager$performSkinDownload$1$successful$1$1.L$3 = atomicInteger;
                        skinPackManager$performSkinDownload$1$successful$1$1.L$4 = alertDialog;
                        skinPackManager$performSkinDownload$1$successful$1$1.L$5 = progressBar;
                        skinPackManager$performSkinDownload$1$successful$1$1.L$6 = textView;
                        skinPackManager$performSkinDownload$1$successful$1$1.L$7 = list;
                        skinPackManager$performSkinDownload$1$successful$1$1.L$8 = null;
                        skinPackManager$performSkinDownload$1$successful$1$1.label = 2;
                        $result3 = EndpointRouter.download$default(router, endpointGroup, str3, downloadSpec, null, skinPackManager$performSkinDownload$1$successful$1$1, 8, null);
                        if ($result3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        $result4 = $result2;
                        skinPackManager2 = skinPackManager;
                        textView2 = textView;
                        alertDialog2 = alertDialog;
                        Collection collection4 = collection;
                        list2 = list;
                        collection2 = collection4;
                        result = (NetworkResult) $result3;
                        if (result instanceof NetworkResult.Success) {
                            Intrinsics.checkNotNull(collection2);
                            collection2.add(((NetworkResult.Success) result).getValue());
                        }
                        final int done = atomicInteger.incrementAndGet();
                        final TextView textView4 = textView2;
                        skinPackManager2.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$performSkinDownload$1$successful$1$1$1$1
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
                                    progressBar.setProgress(done);
                                    textView4.setText(done + " / " + list2.size() + " файлов");
                                }
                            }
                        });
                        Boolean boolBoxBoolean = Boxing.boxBoolean(result instanceof NetworkResult.Success);
                        $this$withPermit$iv.release();
                        return boolBoxBoolean;
                    }
                    try {
                        Boxing.boxBoolean(parentFile.mkdirs());
                        EndpointRouter router2 = NetworkRuntime.INSTANCE.getRouter();
                        EndpointGroup endpointGroup2 = EndpointGroup.KOLSON;
                        $result2 = $result;
                        try {
                            String str4 = "/api/fetch_file/" + str;
                            DownloadSpec downloadSpec2 = new DownloadSpec($this$invokeSuspend_u24lambda_u241_u24lambda_u240, null, null, false, null, 30, null);
                            skinPackManager$performSkinDownload$1$successful$1$1.L$0 = $this$withPermit$iv;
                            skinPackManager$performSkinDownload$1$successful$1$1.L$1 = skinPackManager;
                            skinPackManager$performSkinDownload$1$successful$1$1.L$2 = collection;
                            skinPackManager$performSkinDownload$1$successful$1$1.L$3 = atomicInteger;
                            skinPackManager$performSkinDownload$1$successful$1$1.L$4 = alertDialog;
                            skinPackManager$performSkinDownload$1$successful$1$1.L$5 = progressBar;
                            skinPackManager$performSkinDownload$1$successful$1$1.L$6 = textView;
                            skinPackManager$performSkinDownload$1$successful$1$1.L$7 = list;
                            skinPackManager$performSkinDownload$1$successful$1$1.L$8 = null;
                            skinPackManager$performSkinDownload$1$successful$1$1.label = 2;
                            $result3 = EndpointRouter.download$default(router2, endpointGroup2, str4, downloadSpec2, null, skinPackManager$performSkinDownload$1$successful$1$1, 8, null);
                            if ($result3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            $result4 = $result2;
                            skinPackManager2 = skinPackManager;
                            textView2 = textView;
                            alertDialog2 = alertDialog;
                            Collection collection5 = collection;
                            list2 = list;
                            collection2 = collection5;
                            try {
                                result = (NetworkResult) $result3;
                                if (result instanceof NetworkResult.Success) {
                                    Intrinsics.checkNotNull(collection2);
                                    collection2.add(((NetworkResult.Success) result).getValue());
                                }
                                final int done2 = atomicInteger.incrementAndGet();
                                final TextView textView5 = textView2;
                                skinPackManager2.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$performSkinDownload$1$successful$1$1$1$1
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
                                            progressBar.setProgress(done2);
                                            textView5.setText(done2 + " / " + list2.size() + " файлов");
                                        }
                                    }
                                });
                                Boolean boolBoxBoolean2 = Boxing.boxBoolean(result instanceof NetworkResult.Success);
                                $this$withPermit$iv.release();
                                return boolBoxBoolean2;
                            } catch (Throwable th) {
                                th = th;
                                $this$withPermit$iv2 = $this$withPermit$iv;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            $this$withPermit$iv2 = $this$withPermit$iv;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        $this$withPermit$iv2 = $this$withPermit$iv;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    $this$withPermit$iv2 = $this$withPermit$iv;
                }
                $this$withPermit$iv2.release();
                throw th;
            case 1:
                skinPackManager$performSkinDownload$1$successful$1$1 = this;
                $result = obj;
                list = (List) skinPackManager$performSkinDownload$1$successful$1$1.L$8;
                textView = (TextView) skinPackManager$performSkinDownload$1$successful$1$1.L$7;
                progressBar = (ProgressBar) skinPackManager$performSkinDownload$1$successful$1$1.L$6;
                alertDialog = (AlertDialog) skinPackManager$performSkinDownload$1$successful$1$1.L$5;
                atomicInteger = (AtomicInteger) skinPackManager$performSkinDownload$1$successful$1$1.L$4;
                collection = (List) skinPackManager$performSkinDownload$1$successful$1$1.L$3;
                String str5 = (String) skinPackManager$performSkinDownload$1$successful$1$1.L$2;
                SkinPackManager skinPackManager4 = (SkinPackManager) skinPackManager$performSkinDownload$1$successful$1$1.L$1;
                $this$withPermit$iv = (Semaphore) skinPackManager$performSkinDownload$1$successful$1$1.L$0;
                ResultKt.throwOnFailure($result);
                str = str5;
                skinPackManager = skinPackManager4;
                $this$invokeSuspend_u24lambda_u241_u24lambda_u240 = new File(skinPackManager.ctx.getCacheDir(), str);
                parentFile = $this$invokeSuspend_u24lambda_u241_u24lambda_u240.getParentFile();
                if (parentFile != null) {
                    EndpointRouter router3 = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup3 = EndpointGroup.KOLSON;
                    $result2 = $result;
                    String str6 = "/api/fetch_file/" + str;
                    DownloadSpec downloadSpec3 = new DownloadSpec($this$invokeSuspend_u24lambda_u241_u24lambda_u240, null, null, false, null, 30, null);
                    skinPackManager$performSkinDownload$1$successful$1$1.L$0 = $this$withPermit$iv;
                    skinPackManager$performSkinDownload$1$successful$1$1.L$1 = skinPackManager;
                    skinPackManager$performSkinDownload$1$successful$1$1.L$2 = collection;
                    skinPackManager$performSkinDownload$1$successful$1$1.L$3 = atomicInteger;
                    skinPackManager$performSkinDownload$1$successful$1$1.L$4 = alertDialog;
                    skinPackManager$performSkinDownload$1$successful$1$1.L$5 = progressBar;
                    skinPackManager$performSkinDownload$1$successful$1$1.L$6 = textView;
                    skinPackManager$performSkinDownload$1$successful$1$1.L$7 = list;
                    skinPackManager$performSkinDownload$1$successful$1$1.L$8 = null;
                    skinPackManager$performSkinDownload$1$successful$1$1.label = 2;
                    $result3 = EndpointRouter.download$default(router3, endpointGroup3, str6, downloadSpec3, null, skinPackManager$performSkinDownload$1$successful$1$1, 8, null);
                    if ($result3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result4 = $result2;
                    skinPackManager2 = skinPackManager;
                    textView2 = textView;
                    alertDialog2 = alertDialog;
                    Collection collection6 = collection;
                    list2 = list;
                    collection2 = collection6;
                    result = (NetworkResult) $result3;
                    if (result instanceof NetworkResult.Success) {
                        Intrinsics.checkNotNull(collection2);
                        collection2.add(((NetworkResult.Success) result).getValue());
                    }
                    final int done3 = atomicInteger.incrementAndGet();
                    final TextView textView6 = textView2;
                    skinPackManager2.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$performSkinDownload$1$successful$1$1$1$1
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
                                progressBar.setProgress(done3);
                                textView6.setText(done3 + " / " + list2.size() + " файлов");
                            }
                        }
                    });
                    Boolean boolBoxBoolean3 = Boxing.boxBoolean(result instanceof NetworkResult.Success);
                    $this$withPermit$iv.release();
                    return boolBoxBoolean3;
                }
                Boxing.boxBoolean(parentFile.mkdirs());
                EndpointRouter router4 = NetworkRuntime.INSTANCE.getRouter();
                EndpointGroup endpointGroup4 = EndpointGroup.KOLSON;
                $result2 = $result;
                String str7 = "/api/fetch_file/" + str;
                DownloadSpec downloadSpec4 = new DownloadSpec($this$invokeSuspend_u24lambda_u241_u24lambda_u240, null, null, false, null, 30, null);
                skinPackManager$performSkinDownload$1$successful$1$1.L$0 = $this$withPermit$iv;
                skinPackManager$performSkinDownload$1$successful$1$1.L$1 = skinPackManager;
                skinPackManager$performSkinDownload$1$successful$1$1.L$2 = collection;
                skinPackManager$performSkinDownload$1$successful$1$1.L$3 = atomicInteger;
                skinPackManager$performSkinDownload$1$successful$1$1.L$4 = alertDialog;
                skinPackManager$performSkinDownload$1$successful$1$1.L$5 = progressBar;
                skinPackManager$performSkinDownload$1$successful$1$1.L$6 = textView;
                skinPackManager$performSkinDownload$1$successful$1$1.L$7 = list;
                skinPackManager$performSkinDownload$1$successful$1$1.L$8 = null;
                skinPackManager$performSkinDownload$1$successful$1$1.label = 2;
                $result3 = EndpointRouter.download$default(router4, endpointGroup4, str7, downloadSpec4, null, skinPackManager$performSkinDownload$1$successful$1$1, 8, null);
                if ($result3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                $result4 = $result2;
                skinPackManager2 = skinPackManager;
                textView2 = textView;
                alertDialog2 = alertDialog;
                Collection collection7 = collection;
                list2 = list;
                collection2 = collection7;
                result = (NetworkResult) $result3;
                if (result instanceof NetworkResult.Success) {
                    Intrinsics.checkNotNull(collection2);
                    collection2.add(((NetworkResult.Success) result).getValue());
                }
                final int done4 = atomicInteger.incrementAndGet();
                final TextView textView7 = textView2;
                skinPackManager2.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$performSkinDownload$1$successful$1$1$1$1
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
                            progressBar.setProgress(done4);
                            textView7.setText(done4 + " / " + list2.size() + " файлов");
                        }
                    }
                });
                Boolean boolBoxBoolean4 = Boxing.boxBoolean(result instanceof NetworkResult.Success);
                $this$withPermit$iv.release();
                return boolBoxBoolean4;
                $this$withPermit$iv2.release();
                throw th;
            case 2:
                $result3 = obj;
                List<String> list4 = (List) this.L$7;
                TextView textView8 = (TextView) this.L$6;
                progressBar = (ProgressBar) this.L$5;
                AlertDialog alertDialog3 = (AlertDialog) this.L$4;
                atomicInteger = (AtomicInteger) this.L$3;
                Collection collection8 = (List) this.L$2;
                SkinPackManager skinPackManager5 = (SkinPackManager) this.L$1;
                $this$withPermit$iv2 = (Semaphore) this.L$0;
                try {
                    ResultKt.throwOnFailure($result3);
                    $result4 = $result3;
                    $this$withPermit$iv = $this$withPermit$iv2;
                    skinPackManager2 = skinPackManager5;
                    textView2 = textView8;
                    alertDialog2 = alertDialog3;
                    list2 = list4;
                    collection2 = collection8;
                    result = (NetworkResult) $result3;
                    if (result instanceof NetworkResult.Success) {
                        Intrinsics.checkNotNull(collection2);
                        collection2.add(((NetworkResult.Success) result).getValue());
                    }
                    final int done5 = atomicInteger.incrementAndGet();
                    final TextView textView9 = textView2;
                    skinPackManager2.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$performSkinDownload$1$successful$1$1$1$1
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
                                progressBar.setProgress(done5);
                                textView9.setText(done5 + " / " + list2.size() + " файлов");
                            }
                        }
                    });
                    Boolean boolBoxBoolean5 = Boxing.boxBoolean(result instanceof NetworkResult.Success);
                    $this$withPermit$iv.release();
                    return boolBoxBoolean5;
                } catch (Throwable th5) {
                    th = th5;
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
