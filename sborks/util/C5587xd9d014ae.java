package com.blackhub.bronline.neizzir.fragments.sborks.util;

import androidx.media3.extractor.p007ts.TsExtractor;
import com.blackhub.bronline.game.core.constants.ScreenId;
import com.blackhub.bronline.neizzir.fragments.sborks.model.FolderData;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.util.SborksNewestSupport$loadMissingCreatedDates$2$resolvedChunk$1$1$1 */
/* JADX INFO: compiled from: SborksNewestSupport.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004H\u008a@"}, m4416d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Ljava/util/Date;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.util.SborksNewestSupport$loadMissingCreatedDates$2$resolvedChunk$1$1$1", m4426f = "SborksNewestSupport.kt", m4427i = {0, 0, 1}, m4428l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS, ScreenId.SCREEN_GIFTS}, m4429m = "invokeSuspend", m4430n = {"$this$async", "$this$withPermit$iv", "$this$withPermit$iv"}, m4431s = {"L$0", "L$1", "L$0"})
final class C5587xd9d014ae extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends String, ? extends Date>>, Object> {
    final /* synthetic */ Function2<FolderData, Continuation<? super Date>, Object> $fetchDate;
    final /* synthetic */ FolderData $folderData;
    final /* synthetic */ Semaphore $semaphore;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C5587xd9d014ae(Semaphore semaphore, FolderData folderData, Function2<? super FolderData, ? super Continuation<? super Date>, ? extends Object> function2, Continuation<? super C5587xd9d014ae> continuation) {
        super(2, continuation);
        this.$semaphore = semaphore;
        this.$folderData = folderData;
        this.$fetchDate = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C5587xd9d014ae c5587xd9d014ae = new C5587xd9d014ae(this.$semaphore, this.$folderData, this.$fetchDate, continuation);
        c5587xd9d014ae.L$0 = obj;
        return c5587xd9d014ae;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends String, ? extends Date>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<String, ? extends Date>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<String, ? extends Date>> continuation) {
        return ((C5587xd9d014ae) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) throws Throwable {
        C5587xd9d014ae c5587xd9d014ae;
        FolderData folderData;
        Function2<FolderData, Continuation<? super Date>, Object> function2;
        Semaphore $this$withPermit$iv;
        Semaphore $this$withPermit$iv2;
        int i;
        Throwable th;
        String folderName;
        C5587xd9d014ae c5587xd9d014ae2;
        Semaphore semaphore;
        int $i$f$withPermit;
        String str;
        Object objInvoke;
        Object $result2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object obj = null;
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                c5587xd9d014ae = this;
                CoroutineScope $this$async = (CoroutineScope) c5587xd9d014ae.L$0;
                Semaphore $this$withPermit$iv3 = c5587xd9d014ae.$semaphore;
                folderData = c5587xd9d014ae.$folderData;
                function2 = c5587xd9d014ae.$fetchDate;
                c5587xd9d014ae.L$0 = $this$async;
                c5587xd9d014ae.L$1 = $this$withPermit$iv3;
                c5587xd9d014ae.L$2 = folderData;
                c5587xd9d014ae.L$3 = function2;
                c5587xd9d014ae.label = 1;
                if ($this$withPermit$iv3.acquire(c5587xd9d014ae) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                $this$withPermit$iv = $this$withPermit$iv3;
                $this$withPermit$iv2 = null;
                i = 0;
                try {
                    folderName = folderData.getFolderName();
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        c5587xd9d014ae.L$0 = $this$withPermit$iv;
                        c5587xd9d014ae.L$1 = folderName;
                        c5587xd9d014ae.L$2 = null;
                        c5587xd9d014ae.L$3 = null;
                        c5587xd9d014ae.label = 2;
                        objInvoke = function2.invoke(folderData, c5587xd9d014ae);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        $result = objInvoke;
                        str = folderName;
                        try {
                            $result2 = Result.m15551constructorimpl((Date) $result);
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            $result = $result;
                            c5587xd9d014ae2 = c5587xd9d014ae;
                            semaphore = $this$withPermit$iv2;
                            $i$f$withPermit = i;
                            try {
                                Result.Companion companion2 = Result.INSTANCE;
                                $result2 = Result.m15551constructorimpl(ResultKt.createFailure(th));
                            } catch (Throwable th3) {
                                th = th3;
                                $this$withPermit$iv.release();
                                throw th;
                            }
                        }
                        try {
                            if (!Result.m15557isFailureimpl($result2)) {
                                obj = $result2;
                            }
                            Pair pairM4423to = TuplesKt.m4423to(str, obj);
                            $this$withPermit$iv.release();
                            return pairM4423to;
                        } catch (Throwable th4) {
                            th = th4;
                            $this$withPermit$iv.release();
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        c5587xd9d014ae2 = c5587xd9d014ae;
                        semaphore = $this$withPermit$iv2;
                        $i$f$withPermit = 0;
                        str = folderName;
                        Result.Companion companion3 = Result.INSTANCE;
                        $result2 = Result.m15551constructorimpl(ResultKt.createFailure(th));
                        if (!Result.m15557isFailureimpl($result2)) {
                            obj = $result2;
                        }
                        Pair pairM4423to2 = TuplesKt.m4423to(str, obj);
                        $this$withPermit$iv.release();
                        return pairM4423to2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    $this$withPermit$iv.release();
                    throw th;
                }
            case 1:
                c5587xd9d014ae = this;
                $this$withPermit$iv2 = null;
                function2 = (Function2) c5587xd9d014ae.L$3;
                folderData = (FolderData) c5587xd9d014ae.L$2;
                $this$withPermit$iv = (Semaphore) c5587xd9d014ae.L$1;
                ResultKt.throwOnFailure($result);
                i = 0;
                folderName = folderData.getFolderName();
                Result.Companion companion4 = Result.INSTANCE;
                c5587xd9d014ae.L$0 = $this$withPermit$iv;
                c5587xd9d014ae.L$1 = folderName;
                c5587xd9d014ae.L$2 = null;
                c5587xd9d014ae.L$3 = null;
                c5587xd9d014ae.label = 2;
                objInvoke = function2.invoke(folderData, c5587xd9d014ae);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                $result = objInvoke;
                str = folderName;
                $result2 = Result.m15551constructorimpl((Date) $result);
                if (!Result.m15557isFailureimpl($result2)) {
                    obj = $result2;
                }
                Pair pairM4423to3 = TuplesKt.m4423to(str, obj);
                $this$withPermit$iv.release();
                return pairM4423to3;
            case 2:
                c5587xd9d014ae2 = this;
                semaphore = null;
                $i$f$withPermit = 0;
                str = (String) c5587xd9d014ae2.L$1;
                $this$withPermit$iv = (Semaphore) c5587xd9d014ae2.L$0;
                try {
                    ResultKt.throwOnFailure($result);
                    i = 0;
                    $this$withPermit$iv2 = null;
                    c5587xd9d014ae = c5587xd9d014ae2;
                    $result2 = Result.m15551constructorimpl((Date) $result);
                    break;
                } catch (Throwable th7) {
                    th = th7;
                    Result.Companion companion5 = Result.INSTANCE;
                    $result2 = Result.m15551constructorimpl(ResultKt.createFailure(th));
                    if (!Result.m15557isFailureimpl($result2)) {
                        obj = $result2;
                    }
                    Pair pairM4423to4 = TuplesKt.m4423to(str, obj);
                    $this$withPermit$iv.release();
                    return pairM4423to4;
                }
                if (!Result.m15557isFailureimpl($result2)) {
                    obj = $result2;
                }
                Pair pairM4423to5 = TuplesKt.m4423to(str, obj);
                $this$withPermit$iv.release();
                return pairM4423to5;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
