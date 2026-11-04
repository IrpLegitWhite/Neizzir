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
@Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/network/EndpointRouter$Attempt;", "endpoint", "Lcom/blackhub/bronline/neizzir/network/Endpoint;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter$resourceExists$result$1", m4426f = "EndpointRouter.kt", m4427i = {}, m4428l = {196}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class EndpointRouter$resourceExists$result$1 extends SuspendLambda implements Function2<Endpoint, Continuation<? super EndpointRouter.Attempt>, Object> {
    final /* synthetic */ EndpointGroup $group;
    final /* synthetic */ String $path;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EndpointRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EndpointRouter$resourceExists$result$1(EndpointRouter endpointRouter, EndpointGroup endpointGroup, String str, Continuation<? super EndpointRouter$resourceExists$result$1> continuation) {
        super(2, continuation);
        this.this$0 = endpointRouter;
        this.$group = endpointGroup;
        this.$path = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EndpointRouter$resourceExists$result$1 endpointRouter$resourceExists$result$1 = new EndpointRouter$resourceExists$result$1(this.this$0, this.$group, this.$path, continuation);
        endpointRouter$resourceExists$result$1.L$0 = obj;
        return endpointRouter$resourceExists$result$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Endpoint endpoint, Continuation<? super EndpointRouter.Attempt> continuation) {
        return ((EndpointRouter$resourceExists$result$1) create(endpoint, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Endpoint endpoint = (Endpoint) this.L$0;
                this.label = 1;
                Object objProbe = this.this$0.probe(endpoint, this.$group, this.$path, this);
                return objProbe == coroutine_suspended ? coroutine_suspended : objProbe;
            case 1:
                ResultKt.throwOnFailure($result);
                return $result;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
