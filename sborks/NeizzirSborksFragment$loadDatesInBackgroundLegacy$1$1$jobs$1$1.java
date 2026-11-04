package com.blackhub.bronline.neizzir.fragments.sborks;

import com.blackhub.bronline.neizzir.fragments.sborks.model.FolderData;
import java.util.Date;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: compiled from: NeizzirSborksFragment.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1", m4426f = "NeizzirSborksFragment.kt", m4427i = {0, 1}, m4428l = {1101, 1070}, m4429m = "invokeSuspend", m4430n = {"$this$withPermit$iv", "$this$withPermit$iv"}, m4431s = {"L$0", "L$0"})
final class NeizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FolderData $folderData;
    final /* synthetic */ Semaphore $semaphore;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ NeizzirSborksFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NeizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1(Semaphore semaphore, NeizzirSborksFragment neizzirSborksFragment, FolderData folderData, Continuation<? super NeizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1> continuation) {
        super(2, continuation);
        this.$semaphore = semaphore;
        this.this$0 = neizzirSborksFragment;
        this.$folderData = folderData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NeizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1(this.$semaphore, this.this$0, this.$folderData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NeizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) throws Throwable {
        NeizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1 neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1;
        Semaphore $this$withPermit$iv;
        Semaphore $this$withPermit$iv2;
        NeizzirSborksFragment neizzirSborksFragment;
        FolderData folderData;
        int i;
        Throwable th;
        int $i$f$withPermit;
        Object folderCreatedDate;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1 = this;
                Semaphore $this$withPermit$iv3 = neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1.$semaphore;
                NeizzirSborksFragment neizzirSborksFragment2 = neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1.this$0;
                FolderData folderData2 = neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1.$folderData;
                neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1.L$0 = $this$withPermit$iv3;
                neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1.L$1 = neizzirSborksFragment2;
                neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1.L$2 = folderData2;
                neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1.label = 1;
                if ($this$withPermit$iv3.acquire(neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                $this$withPermit$iv = $this$withPermit$iv3;
                $this$withPermit$iv2 = null;
                neizzirSborksFragment = neizzirSborksFragment2;
                folderData = folderData2;
                i = 0;
                try {
                    String folderName = folderData.getFolderName();
                    String updateDate = folderData.getUpdateDate();
                    neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1.L$0 = $this$withPermit$iv;
                    neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1.L$1 = neizzirSborksFragment;
                    neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1.L$2 = folderData;
                    neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1.label = 2;
                    folderCreatedDate = neizzirSborksFragment.getFolderCreatedDate(folderName, updateDate, neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1);
                    if (folderCreatedDate == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = folderCreatedDate;
                    try {
                        Date date = (Date) $result;
                        neizzirSborksFragment.createdDatesCache.put(folderData.getFolderName(), date);
                    } catch (Exception e) {
                        $i$f$withPermit = i;
                    } catch (Throwable th2) {
                        th = th2;
                        $this$withPermit$iv.release();
                        throw th;
                    }
                    Unit unit = Unit.INSTANCE;
                    $this$withPermit$iv.release();
                    return Unit.INSTANCE;
                } catch (Exception e2) {
                    $i$f$withPermit = 0;
                    Unit unit2 = Unit.INSTANCE;
                    $this$withPermit$iv.release();
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                    $this$withPermit$iv.release();
                    throw th;
                }
            case 1:
                neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1 = this;
                $this$withPermit$iv2 = null;
                folderData = (FolderData) neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1.L$2;
                neizzirSborksFragment = (NeizzirSborksFragment) neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1.L$1;
                $this$withPermit$iv = (Semaphore) neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1.L$0;
                ResultKt.throwOnFailure($result);
                i = 0;
                String folderName2 = folderData.getFolderName();
                String updateDate2 = folderData.getUpdateDate();
                neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1.L$0 = $this$withPermit$iv;
                neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1.L$1 = neizzirSborksFragment;
                neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1.L$2 = folderData;
                neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1.label = 2;
                folderCreatedDate = neizzirSborksFragment.getFolderCreatedDate(folderName2, updateDate2, neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1);
                if (folderCreatedDate == coroutine_suspended) {
                    return coroutine_suspended;
                }
                $result = folderCreatedDate;
                Date date2 = (Date) $result;
                neizzirSborksFragment.createdDatesCache.put(folderData.getFolderName(), date2);
                Unit unit3 = Unit.INSTANCE;
                $this$withPermit$iv.release();
                return Unit.INSTANCE;
            case 2:
                $i$f$withPermit = 0;
                folderData = (FolderData) this.L$2;
                neizzirSborksFragment = (NeizzirSborksFragment) this.L$1;
                $this$withPermit$iv = (Semaphore) this.L$0;
                try {
                    try {
                        ResultKt.throwOnFailure($result);
                        i = 0;
                        $this$withPermit$iv2 = null;
                        neizzirSborksFragment$loadDatesInBackgroundLegacy$1$1$jobs$1$1 = this;
                        Date date3 = (Date) $result;
                        neizzirSborksFragment.createdDatesCache.put(folderData.getFolderName(), date3);
                    } catch (Throwable th4) {
                        th = th4;
                        $this$withPermit$iv.release();
                        throw th;
                    }
                } catch (Exception e3) {
                    Unit unit4 = Unit.INSTANCE;
                    $this$withPermit$iv.release();
                    return Unit.INSTANCE;
                }
                Unit unit5 = Unit.INSTANCE;
                $this$withPermit$iv.release();
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
