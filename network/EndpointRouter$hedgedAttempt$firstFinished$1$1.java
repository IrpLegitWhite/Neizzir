package com.blackhub.bronline.neizzir.network;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: EndpointRouter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/network/EndpointRouter$IndexedAttempt;", "it", "Lcom/blackhub/bronline/neizzir/network/EndpointRouter$Attempt;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter$hedgedAttempt$firstFinished$1$1", m4426f = "EndpointRouter.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class EndpointRouter$hedgedAttempt$firstFinished$1$1 extends SuspendLambda implements Function2<EndpointRouter.Attempt, Continuation<? super EndpointRouter.IndexedAttempt>, Object> {
    /* synthetic */ Object L$0;
    int label;

    EndpointRouter$hedgedAttempt$firstFinished$1$1(Continuation<? super EndpointRouter$hedgedAttempt$firstFinished$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EndpointRouter$hedgedAttempt$firstFinished$1$1 endpointRouter$hedgedAttempt$firstFinished$1$1 = new EndpointRouter$hedgedAttempt$firstFinished$1$1(continuation);
        endpointRouter$hedgedAttempt$firstFinished$1$1.L$0 = obj;
        return endpointRouter$hedgedAttempt$firstFinished$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EndpointRouter.Attempt attempt, Continuation<? super EndpointRouter.IndexedAttempt> continuation) {
        return ((EndpointRouter$hedgedAttempt$firstFinished$1$1) create(attempt, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                EndpointRouter.Attempt it = (EndpointRouter.Attempt) this.L$0;
                return new EndpointRouter.IndexedAttempt(0, it);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
