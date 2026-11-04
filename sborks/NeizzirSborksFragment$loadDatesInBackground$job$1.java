package com.blackhub.bronline.neizzir.fragments.sborks;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.blackhub.bronline.neizzir.fragments.sborks.model.FolderData;
import com.blackhub.bronline.neizzir.fragments.sborks.util.SborksNewestSupport;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: NeizzirSborksFragment.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$loadDatesInBackground$job$1", m4426f = "NeizzirSborksFragment.kt", m4427i = {}, m4428l = {AnalyticsListener.EVENT_AUDIO_TRACK_RELEASED}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class NeizzirSborksFragment$loadDatesInBackground$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, Date> $existingDates;
    final /* synthetic */ List<FolderData> $foldersSnapshot;
    int label;
    final /* synthetic */ NeizzirSborksFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NeizzirSborksFragment$loadDatesInBackground$job$1(List<FolderData> list, Map<String, ? extends Date> map, NeizzirSborksFragment neizzirSborksFragment, Continuation<? super NeizzirSborksFragment$loadDatesInBackground$job$1> continuation) {
        super(2, continuation);
        this.$foldersSnapshot = list;
        this.$existingDates = map;
        this.this$0 = neizzirSborksFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NeizzirSborksFragment$loadDatesInBackground$job$1(this.$foldersSnapshot, this.$existingDates, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NeizzirSborksFragment$loadDatesInBackground$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        NeizzirSborksFragment$loadDatesInBackground$job$1 neizzirSborksFragment$loadDatesInBackground$job$1;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                neizzirSborksFragment$loadDatesInBackground$job$1 = this;
                neizzirSborksFragment$loadDatesInBackground$job$1.label = 1;
                Object objLoadMissingCreatedDates$default = SborksNewestSupport.loadMissingCreatedDates$default(SborksNewestSupport.INSTANCE, neizzirSborksFragment$loadDatesInBackground$job$1.$foldersSnapshot, neizzirSborksFragment$loadDatesInBackground$job$1.$existingDates, 0, 0, new NeizzirSborksFragment$loadDatesInBackground$job$1$loadedDates$1(neizzirSborksFragment$loadDatesInBackground$job$1.this$0, null), neizzirSborksFragment$loadDatesInBackground$job$1, 12, null);
                if (objLoadMissingCreatedDates$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                $result = objLoadMissingCreatedDates$default;
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                neizzirSborksFragment$loadDatesInBackground$job$1 = this;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Map loadedDates = (Map) $result;
        if (loadedDates.isEmpty()) {
            return Unit.INSTANCE;
        }
        neizzirSborksFragment$loadDatesInBackground$job$1.this$0.createdDatesCache.putAll(loadedDates);
        if (neizzirSborksFragment$loadDatesInBackground$job$1.this$0.currentSortType == SortType.NEWEST) {
            neizzirSborksFragment$loadDatesInBackground$job$1.this$0.applyFilters(ListUpdateReason.BACKGROUND_DATES_READY);
        }
        return Unit.INSTANCE;
    }
}
