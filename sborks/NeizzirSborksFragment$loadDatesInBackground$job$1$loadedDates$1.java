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

/* JADX INFO: compiled from: NeizzirSborksFragment.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Ljava/util/Date;", "folderData", "Lcom/blackhub/bronline/neizzir/fragments/sborks/model/FolderData;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$loadDatesInBackground$job$1$loadedDates$1", m4426f = "NeizzirSborksFragment.kt", m4427i = {}, m4428l = {1036}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class NeizzirSborksFragment$loadDatesInBackground$job$1$loadedDates$1 extends SuspendLambda implements Function2<FolderData, Continuation<? super Date>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NeizzirSborksFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NeizzirSborksFragment$loadDatesInBackground$job$1$loadedDates$1(NeizzirSborksFragment neizzirSborksFragment, Continuation<? super NeizzirSborksFragment$loadDatesInBackground$job$1$loadedDates$1> continuation) {
        super(2, continuation);
        this.this$0 = neizzirSborksFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NeizzirSborksFragment$loadDatesInBackground$job$1$loadedDates$1 neizzirSborksFragment$loadDatesInBackground$job$1$loadedDates$1 = new NeizzirSborksFragment$loadDatesInBackground$job$1$loadedDates$1(this.this$0, continuation);
        neizzirSborksFragment$loadDatesInBackground$job$1$loadedDates$1.L$0 = obj;
        return neizzirSborksFragment$loadDatesInBackground$job$1$loadedDates$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FolderData folderData, Continuation<? super Date> continuation) {
        return ((NeizzirSborksFragment$loadDatesInBackground$job$1$loadedDates$1) create(folderData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                FolderData folderData = (FolderData) this.L$0;
                this.label = 1;
                Object folderCreatedDate = this.this$0.getFolderCreatedDate(folderData.getFolderName(), folderData.getUpdateDate(), this);
                return folderCreatedDate == coroutine_suspended ? coroutine_suspended : folderCreatedDate;
            case 1:
                ResultKt.throwOnFailure($result);
                return $result;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
