package com.blackhub.bronline.neizzir.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: EndpointRouter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/network/EndpointRouter$Attempt;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter$hedgedAttempt$second$1", m4426f = "EndpointRouter.kt", m4427i = {}, m4428l = {356}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class EndpointRouter$hedgedAttempt$second$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EndpointRouter.Attempt>, Object> {
    final /* synthetic */ Function2<Endpoint, Continuation<? super EndpointRouter.Attempt>, Object> $block;
    final /* synthetic */ List<Endpoint> $endpoints;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EndpointRouter$hedgedAttempt$second$1(Function2<? super Endpoint, ? super Continuation<? super EndpointRouter.Attempt>, ? extends Object> function2, List<Endpoint> list, Continuation<? super EndpointRouter$hedgedAttempt$second$1> continuation) {
        super(2, continuation);
        this.$block = function2;
        this.$endpoints = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EndpointRouter$hedgedAttempt$second$1(this.$block, this.$endpoints, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EndpointRouter.Attempt> continuation) {
        return ((EndpointRouter$hedgedAttempt$second$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.blackhub.bronline.neizzir.network.EndpointRouter$hedgedAttempt$second$1 for r5v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            switch(r1) {
                case 0: goto L17;
                case 1: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L11:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r6)
            r2 = r6
            goto L2e
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
            r1 = r5
            kotlin.jvm.functions.Function2<com.blackhub.bronline.neizzir.network.Endpoint, kotlin.coroutines.Continuation<? super com.blackhub.bronline.neizzir.network.EndpointRouter$Attempt>, java.lang.Object> r2 = r1.$block
            java.util.List<com.blackhub.bronline.neizzir.network.Endpoint> r3 = r1.$endpoints
            r4 = 1
            java.lang.Object r3 = r3.get(r4)
            r1.label = r4
            java.lang.Object r2 = r2.invoke(r3, r1)
            if (r2 != r0) goto L2d
            return r0
        L2d:
            r0 = r1
        L2e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.network.EndpointRouter$hedgedAttempt$second$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
