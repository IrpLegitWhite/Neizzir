package com.blackhub.bronline.neizzir.fragments.custom.util;

import com.blackhub.bronline.neizzir.network.DownloadSpec;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.EndpointRouter;
import com.blackhub.bronline.neizzir.network.NetworkResult;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.p043io.files.FileSystemKt;

/* JADX INFO: compiled from: TabContentLoader.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.util.TabContentLoader$downloadFiles$2$1$1", m4426f = "TabContentLoader.kt", m4427i = {0, 1}, m4428l = {209, 104}, m4429m = "invokeSuspend", m4430n = {"$this$withPermit$iv", "$this$withPermit$iv"}, m4431s = {"L$0", "L$0"})
final class TabContentLoader$downloadFiles$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AtomicInteger $done;
    final /* synthetic */ RemoteCustomFile $file;
    final /* synthetic */ File $localFolder;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onProgress;
    final /* synthetic */ String $remotePrefix;
    final /* synthetic */ List<RemoteCustomFile> $selected;
    final /* synthetic */ AtomicBoolean $success;
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
    final /* synthetic */ TabContentLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TabContentLoader$downloadFiles$2$1$1(TabContentLoader tabContentLoader, String str, RemoteCustomFile remoteCustomFile, File file, AtomicBoolean atomicBoolean, Function2<? super Integer, ? super Integer, Unit> function2, AtomicInteger atomicInteger, List<RemoteCustomFile> list, Continuation<? super TabContentLoader$downloadFiles$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = tabContentLoader;
        this.$remotePrefix = str;
        this.$file = remoteCustomFile;
        this.$localFolder = file;
        this.$success = atomicBoolean;
        this.$onProgress = function2;
        this.$done = atomicInteger;
        this.$selected = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TabContentLoader$downloadFiles$2$1$1(this.this$0, this.$remotePrefix, this.$file, this.$localFolder, this.$success, this.$onProgress, this.$done, this.$selected, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TabContentLoader$downloadFiles$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e0 A[Catch: all -> 0x01ca, TRY_LEAVE, TryCatch #4 {all -> 0x01ca, blocks: (B:17:0x00b7, B:21:0x00d7, B:24:0x00e0), top: B:75:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0126  */
    /* JADX WARN: Code duplicated, block: B:30:0x0128  */
    /* JADX WARN: Code duplicated, block: B:33:0x012c  */
    /* JADX WARN: Code duplicated, block: B:34:0x012f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0141  */
    /* JADX WARN: Code duplicated, block: B:38:0x0144  */
    /* JADX WARN: Code duplicated, block: B:40:0x0148  */
    /* JADX WARN: Code duplicated, block: B:41:0x014b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0189 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x018a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0196  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TabContentLoader$downloadFiles$2$1$1 tabContentLoader$downloadFiles$2$1$1;
        Object $result;
        String str;
        RemoteCustomFile remoteCustomFile;
        File file;
        TabContentLoader tabContentLoader;
        Function2<Integer, Integer, Unit> function2;
        int $i$f$withPermit;
        Semaphore $this$withPermit$iv;
        List<RemoteCustomFile> list;
        AtomicBoolean atomicBoolean;
        AtomicInteger atomicInteger;
        File $this$invokeSuspend_u24lambda_u243_u24lambda_u240;
        File parentFile;
        Object $result2;
        Long lBoxLong;
        int i;
        Long l;
        String it;
        boolean z;
        String str2;
        Object $result3;
        int i2;
        int $i$f$withPermit2;
        boolean z2;
        boolean ok;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                tabContentLoader$downloadFiles$2$1$1 = this;
                $result = obj;
                Semaphore $this$withPermit$iv2 = tabContentLoader$downloadFiles$2$1$1.this$0.smallFileSemaphore;
                str = tabContentLoader$downloadFiles$2$1$1.$remotePrefix;
                remoteCustomFile = tabContentLoader$downloadFiles$2$1$1.$file;
                file = tabContentLoader$downloadFiles$2$1$1.$localFolder;
                tabContentLoader = tabContentLoader$downloadFiles$2$1$1.this$0;
                AtomicBoolean atomicBoolean2 = tabContentLoader$downloadFiles$2$1$1.$success;
                function2 = tabContentLoader$downloadFiles$2$1$1.$onProgress;
                AtomicInteger atomicInteger2 = tabContentLoader$downloadFiles$2$1$1.$done;
                List<RemoteCustomFile> list2 = tabContentLoader$downloadFiles$2$1$1.$selected;
                $i$f$withPermit = 0;
                tabContentLoader$downloadFiles$2$1$1.L$0 = $this$withPermit$iv2;
                tabContentLoader$downloadFiles$2$1$1.L$1 = str;
                tabContentLoader$downloadFiles$2$1$1.L$2 = remoteCustomFile;
                tabContentLoader$downloadFiles$2$1$1.L$3 = file;
                tabContentLoader$downloadFiles$2$1$1.L$4 = tabContentLoader;
                tabContentLoader$downloadFiles$2$1$1.L$5 = atomicBoolean2;
                tabContentLoader$downloadFiles$2$1$1.L$6 = function2;
                tabContentLoader$downloadFiles$2$1$1.L$7 = atomicInteger2;
                tabContentLoader$downloadFiles$2$1$1.L$8 = list2;
                tabContentLoader$downloadFiles$2$1$1.label = 1;
                if ($this$withPermit$iv2.acquire(tabContentLoader$downloadFiles$2$1$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                $this$withPermit$iv = $this$withPermit$iv2;
                list = list2;
                atomicBoolean = atomicBoolean2;
                atomicInteger = atomicInteger2;
                try {
                    String relative = RemoteCustomIndex.INSTANCE.relativePath(str, remoteCustomFile.getPath());
                    $this$invokeSuspend_u24lambda_u243_u24lambda_u240 = new File(file, relative);
                    parentFile = $this$invokeSuspend_u24lambda_u243_u24lambda_u240.getParentFile();
                    if (parentFile != null) {
                        try {
                            Boxing.boxBoolean(parentFile.mkdirs());
                        } catch (Throwable th) {
                            th = th;
                            $this$withPermit$iv.release();
                            throw th;
                        }
                    }
                    if (tabContentLoader.isValid($this$invokeSuspend_u24lambda_u243_u24lambda_u240, remoteCustomFile)) {
                        z2 = true;
                    } else {
                        EndpointRouter endpointRouter = tabContentLoader.router;
                        EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                        $result2 = $result;
                        try {
                            try {
                                String str3 = "/api/fetch_file/" + StringsKt__StringsKt.trimStart(remoteCustomFile.getPath(), FileSystemKt.UnixPathSeparator);
                                lBoxLong = Boxing.boxLong(remoteCustomFile.getSize());
                                if (lBoxLong.longValue() >= 0) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                if (i != 0) {
                                    l = lBoxLong;
                                } else {
                                    l = null;
                                }
                                it = remoteCustomFile.getSha1();
                                if (StringsKt__StringsKt.isBlank(it)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z) {
                                    str2 = it;
                                } else {
                                    str2 = null;
                                }
                                DownloadSpec downloadSpec = new DownloadSpec($this$invokeSuspend_u24lambda_u243_u24lambda_u240, l, str2, false, null, 24, null);
                                tabContentLoader$downloadFiles$2$1$1.L$0 = $this$withPermit$iv;
                                tabContentLoader$downloadFiles$2$1$1.L$1 = atomicBoolean;
                                tabContentLoader$downloadFiles$2$1$1.L$2 = function2;
                                tabContentLoader$downloadFiles$2$1$1.L$3 = atomicInteger;
                                tabContentLoader$downloadFiles$2$1$1.L$4 = list;
                                tabContentLoader$downloadFiles$2$1$1.L$5 = null;
                                tabContentLoader$downloadFiles$2$1$1.L$6 = null;
                                tabContentLoader$downloadFiles$2$1$1.L$7 = null;
                                tabContentLoader$downloadFiles$2$1$1.L$8 = null;
                                tabContentLoader$downloadFiles$2$1$1.label = 2;
                                $result3 = EndpointRouter.download$default(endpointRouter, endpointGroup, str3, downloadSpec, null, tabContentLoader$downloadFiles$2$1$1, 8, null);
                                if ($result3 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                i2 = 0;
                                $i$f$withPermit2 = $i$f$withPermit;
                                try {
                                    z2 = $result3 instanceof NetworkResult.Success;
                                    $i$f$withPermit = $i$f$withPermit2;
                                    $result = $result2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    $this$withPermit$iv.release();
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                $this$withPermit$iv.release();
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    ok = z2;
                    if (!ok) {
                        atomicBoolean.set(false);
                    }
                    function2.invoke(Boxing.boxInt(atomicInteger.incrementAndGet()), Boxing.boxInt(list.size()));
                    Unit unit = Unit.INSTANCE;
                    $this$withPermit$iv.release();
                    return Unit.INSTANCE;
                } catch (Throwable th5) {
                    th = th5;
                }
                break;
            case 1:
                tabContentLoader$downloadFiles$2$1$1 = this;
                $result = obj;
                List<RemoteCustomFile> list3 = (List) tabContentLoader$downloadFiles$2$1$1.L$8;
                AtomicInteger atomicInteger3 = (AtomicInteger) tabContentLoader$downloadFiles$2$1$1.L$7;
                Function2<Integer, Integer, Unit> function3 = (Function2) tabContentLoader$downloadFiles$2$1$1.L$6;
                AtomicBoolean atomicBoolean3 = (AtomicBoolean) tabContentLoader$downloadFiles$2$1$1.L$5;
                tabContentLoader = (TabContentLoader) tabContentLoader$downloadFiles$2$1$1.L$4;
                file = (File) tabContentLoader$downloadFiles$2$1$1.L$3;
                remoteCustomFile = (RemoteCustomFile) tabContentLoader$downloadFiles$2$1$1.L$2;
                str = (String) tabContentLoader$downloadFiles$2$1$1.L$1;
                Semaphore $this$withPermit$iv3 = (Semaphore) tabContentLoader$downloadFiles$2$1$1.L$0;
                ResultKt.throwOnFailure($result);
                $i$f$withPermit = 0;
                list = list3;
                atomicInteger = atomicInteger3;
                function2 = function3;
                atomicBoolean = atomicBoolean3;
                $this$withPermit$iv = $this$withPermit$iv3;
                String relative2 = RemoteCustomIndex.INSTANCE.relativePath(str, remoteCustomFile.getPath());
                $this$invokeSuspend_u24lambda_u243_u24lambda_u240 = new File(file, relative2);
                parentFile = $this$invokeSuspend_u24lambda_u243_u24lambda_u240.getParentFile();
                if (parentFile != null) {
                    Boxing.boxBoolean(parentFile.mkdirs());
                }
                if (tabContentLoader.isValid($this$invokeSuspend_u24lambda_u243_u24lambda_u240, remoteCustomFile)) {
                    z2 = true;
                } else {
                    EndpointRouter endpointRouter2 = tabContentLoader.router;
                    EndpointGroup endpointGroup2 = EndpointGroup.KOLSON;
                    $result2 = $result;
                    String str4 = "/api/fetch_file/" + StringsKt__StringsKt.trimStart(remoteCustomFile.getPath(), FileSystemKt.UnixPathSeparator);
                    lBoxLong = Boxing.boxLong(remoteCustomFile.getSize());
                    if (lBoxLong.longValue() >= 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (i != 0) {
                        l = lBoxLong;
                    } else {
                        l = null;
                    }
                    it = remoteCustomFile.getSha1();
                    if (StringsKt__StringsKt.isBlank(it)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str2 = it;
                    } else {
                        str2 = null;
                    }
                    DownloadSpec downloadSpec2 = new DownloadSpec($this$invokeSuspend_u24lambda_u243_u24lambda_u240, l, str2, false, null, 24, null);
                    tabContentLoader$downloadFiles$2$1$1.L$0 = $this$withPermit$iv;
                    tabContentLoader$downloadFiles$2$1$1.L$1 = atomicBoolean;
                    tabContentLoader$downloadFiles$2$1$1.L$2 = function2;
                    tabContentLoader$downloadFiles$2$1$1.L$3 = atomicInteger;
                    tabContentLoader$downloadFiles$2$1$1.L$4 = list;
                    tabContentLoader$downloadFiles$2$1$1.L$5 = null;
                    tabContentLoader$downloadFiles$2$1$1.L$6 = null;
                    tabContentLoader$downloadFiles$2$1$1.L$7 = null;
                    tabContentLoader$downloadFiles$2$1$1.L$8 = null;
                    tabContentLoader$downloadFiles$2$1$1.label = 2;
                    $result3 = EndpointRouter.download$default(endpointRouter2, endpointGroup2, str4, downloadSpec2, null, tabContentLoader$downloadFiles$2$1$1, 8, null);
                    if ($result3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i2 = 0;
                    $i$f$withPermit2 = $i$f$withPermit;
                    z2 = $result3 instanceof NetworkResult.Success;
                    $i$f$withPermit = $i$f$withPermit2;
                    $result = $result2;
                }
                ok = z2;
                if (!ok) {
                    atomicBoolean.set(false);
                }
                function2.invoke(Boxing.boxInt(atomicInteger.incrementAndGet()), Boxing.boxInt(list.size()));
                Unit unit2 = Unit.INSTANCE;
                $this$withPermit$iv.release();
                return Unit.INSTANCE;
            case 2:
                $result3 = obj;
                $i$f$withPermit2 = 0;
                i2 = 0;
                list = (List) this.L$4;
                atomicInteger = (AtomicInteger) this.L$3;
                function2 = (Function2) this.L$2;
                atomicBoolean = (AtomicBoolean) this.L$1;
                $this$withPermit$iv = (Semaphore) this.L$0;
                try {
                    ResultKt.throwOnFailure($result3);
                    $result2 = $result3;
                    z2 = $result3 instanceof NetworkResult.Success;
                    $i$f$withPermit = $i$f$withPermit2;
                    $result = $result2;
                    ok = z2;
                    if (!ok) {
                        atomicBoolean.set(false);
                    }
                    function2.invoke(Boxing.boxInt(atomicInteger.incrementAndGet()), Boxing.boxInt(list.size()));
                    Unit unit3 = Unit.INSTANCE;
                    $this$withPermit$iv.release();
                    return Unit.INSTANCE;
                } catch (Throwable th6) {
                    th = th6;
                    $this$withPermit$iv.release();
                    throw th;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
