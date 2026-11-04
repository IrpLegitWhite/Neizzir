package com.blackhub.bronline.neizzir.network;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: EndpointRouter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/network/NetworkResult;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter$fetchSingleFlight$2$candidate$1", m4426f = "EndpointRouter.kt", m4427i = {}, m4428l = {324}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class EndpointRouter$fetchSingleFlight$2$candidate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super NetworkResult<? extends byte[]>>, Object> {
    final /* synthetic */ EndpointGroup $group;
    final /* synthetic */ long $maxBytes;
    final /* synthetic */ String $path;
    final /* synthetic */ Function1<byte[], Boolean> $validator;
    int label;
    final /* synthetic */ EndpointRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EndpointRouter$fetchSingleFlight$2$candidate$1(EndpointRouter endpointRouter, EndpointGroup endpointGroup, String str, long j, Function1<? super byte[], Boolean> function1, Continuation<? super EndpointRouter$fetchSingleFlight$2$candidate$1> continuation) {
        super(2, continuation);
        this.this$0 = endpointRouter;
        this.$group = endpointGroup;
        this.$path = str;
        this.$maxBytes = j;
        this.$validator = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EndpointRouter$fetchSingleFlight$2$candidate$1(this.this$0, this.$group, this.$path, this.$maxBytes, this.$validator, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkResult<? extends byte[]>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super NetworkResult<byte[]>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super NetworkResult<byte[]>> continuation) {
        return ((EndpointRouter$fetchSingleFlight$2$candidate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                Object objFetchNetworkBytes = this.this$0.fetchNetworkBytes(this.$group, this.$path, this.$maxBytes, this.$validator, this);
                return objFetchNetworkBytes == coroutine_suspended ? coroutine_suspended : objFetchNetworkBytes;
            case 1:
                ResultKt.throwOnFailure($result);
                return $result;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
