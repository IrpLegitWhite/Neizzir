package com.blackhub.bronline.neizzir.network;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* JADX INFO: compiled from: EndpointRouter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/network/EndpointRouter$Attempt;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter$hedgedAttempt$early$1", m4426f = "EndpointRouter.kt", m4427i = {}, m4428l = {347}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class EndpointRouter$hedgedAttempt$early$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EndpointRouter.Attempt>, Object> {
    final /* synthetic */ Deferred<EndpointRouter.Attempt> $first;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EndpointRouter$hedgedAttempt$early$1(Deferred<? extends EndpointRouter.Attempt> deferred, Continuation<? super EndpointRouter$hedgedAttempt$early$1> continuation) {
        super(2, continuation);
        this.$first = deferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EndpointRouter$hedgedAttempt$early$1(this.$first, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EndpointRouter.Attempt> continuation) {
        return ((EndpointRouter$hedgedAttempt$early$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                Object objAwait = this.$first.await(this);
                return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
            case 1:
                ResultKt.throwOnFailure($result);
                return $result;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
