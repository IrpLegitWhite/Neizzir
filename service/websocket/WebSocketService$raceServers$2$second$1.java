package com.blackhub.bronline.neizzir.service.websocket;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: WebSocketService.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/service/websocket/WebSocketService$Connected;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.service.websocket.WebSocketService$raceServers$2$second$1", m4426f = "WebSocketService.kt", m4427i = {}, m4428l = {112}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class WebSocketService$raceServers$2$second$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super WebSocketService.Connected>, Object> {
    final /* synthetic */ List<WebSocketService.Server> $ordered;
    int label;
    final /* synthetic */ WebSocketService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketService$raceServers$2$second$1(WebSocketService webSocketService, List<WebSocketService.Server> list, Continuation<? super WebSocketService$raceServers$2$second$1> continuation) {
        super(2, continuation);
        this.this$0 = webSocketService;
        this.$ordered = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebSocketService$raceServers$2$second$1(this.this$0, this.$ordered, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WebSocketService.Connected> continuation) {
        return ((WebSocketService$raceServers$2$second$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                Object objOpenCandidate = this.this$0.openCandidate(this.$ordered.get(1), this);
                return objOpenCandidate == coroutine_suspended ? coroutine_suspended : objOpenCandidate;
            case 1:
                ResultKt.throwOnFailure($result);
                return $result;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
