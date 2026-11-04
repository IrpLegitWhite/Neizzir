package com.blackhub.bronline.neizzir.service.websocket;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: WebSocketService.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/blackhub/bronline/neizzir/service/websocket/WebSocketService$Connected;", "it"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.service.websocket.WebSocketService$raceServers$2$finished$1$2", m4426f = "WebSocketService.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class WebSocketService$raceServers$2$finished$1$2 extends SuspendLambda implements Function2<WebSocketService.Connected, Continuation<? super Pair<? extends Integer, ? extends WebSocketService.Connected>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    WebSocketService$raceServers$2$finished$1$2(Continuation<? super WebSocketService$raceServers$2$finished$1$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WebSocketService$raceServers$2$finished$1$2 webSocketService$raceServers$2$finished$1$2 = new WebSocketService$raceServers$2$finished$1$2(continuation);
        webSocketService$raceServers$2$finished$1$2.L$0 = obj;
        return webSocketService$raceServers$2$finished$1$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(WebSocketService.Connected connected, Continuation<? super Pair<Integer, WebSocketService.Connected>> continuation) {
        return ((WebSocketService$raceServers$2$finished$1$2) create(connected, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(WebSocketService.Connected connected, Continuation<? super Pair<? extends Integer, ? extends WebSocketService.Connected>> continuation) {
        return invoke2(connected, (Continuation<? super Pair<Integer, WebSocketService.Connected>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                WebSocketService.Connected it = (WebSocketService.Connected) this.L$0;
                return TuplesKt.m4423to(Boxing.boxInt(1), it);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
