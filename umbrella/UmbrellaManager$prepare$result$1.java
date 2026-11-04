package com.blackhub.bronline.neizzir.umbrella;

import android.content.Context;
import com.blackhub.bronline.neizzir.network.DownloadProgress;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: UmbrellaManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "it", "Lcom/blackhub/bronline/neizzir/network/DownloadProgress;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$prepare$result$1", m4426f = "UmbrellaManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class UmbrellaManager$prepare$result$1 extends SuspendLambda implements Function2<DownloadProgress, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: $c */
    final /* synthetic */ Context f850$c;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UmbrellaManager$prepare$result$1(Context context, Continuation<? super UmbrellaManager$prepare$result$1> continuation) {
        super(2, continuation);
        this.f850$c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UmbrellaManager$prepare$result$1 umbrellaManager$prepare$result$1 = new UmbrellaManager$prepare$result$1(this.f850$c, continuation);
        umbrellaManager$prepare$result$1.L$0 = obj;
        return umbrellaManager$prepare$result$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DownloadProgress downloadProgress, Continuation<? super Unit> continuation) {
        return ((UmbrellaManager$prepare$result$1) create(downloadProgress, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                DownloadProgress it = (DownloadProgress) this.L$0;
                UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, this.f850$c, null, true, it.getPercent(), false, 18, null);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
