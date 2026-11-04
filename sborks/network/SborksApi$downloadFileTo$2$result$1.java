package com.blackhub.bronline.neizzir.fragments.sborks.network;

import androidx.collection.SieveCacheKt;
import com.blackhub.bronline.neizzir.network.DownloadProgress;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: compiled from: SborksApi.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "progress", "Lcom/blackhub/bronline/neizzir/network/DownloadProgress;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$downloadFileTo$2$result$1", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class SborksApi$downloadFileTo$2$result$1 extends SuspendLambda implements Function2<DownloadProgress, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Integer, Unit> $onChunk;
    final /* synthetic */ Ref.LongRef $reportedBytes;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SborksApi$downloadFileTo$2$result$1(Ref.LongRef longRef, Function1<? super Integer, Unit> function1, Continuation<? super SborksApi$downloadFileTo$2$result$1> continuation) {
        super(2, continuation);
        this.$reportedBytes = longRef;
        this.$onChunk = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SborksApi$downloadFileTo$2$result$1 sborksApi$downloadFileTo$2$result$1 = new SborksApi$downloadFileTo$2$result$1(this.$reportedBytes, this.$onChunk, continuation);
        sborksApi$downloadFileTo$2$result$1.L$0 = obj;
        return sborksApi$downloadFileTo$2$result$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DownloadProgress downloadProgress, Continuation<? super Unit> continuation) {
        return ((SborksApi$downloadFileTo$2$result$1) create(downloadProgress, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                DownloadProgress progress = (DownloadProgress) this.L$0;
                long delta = progress.getDownloadedBytes() - this.$reportedBytes.element;
                this.$reportedBytes.element = progress.getDownloadedBytes();
                if (delta != 0) {
                    this.$onChunk.invoke(Boxing.boxInt((int) RangesKt___RangesKt.coerceIn(delta, SieveCacheKt.NodeMetaAndPreviousMask, SieveCacheKt.NodeLinkMask)));
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
