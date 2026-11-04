package com.blackhub.bronline.neizzir.umbrella;

import android.content.Context;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UmbrellaCard.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "it", ""}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$bind$autosaver$1", m4426f = "UmbrellaCard.kt", m4427i = {}, m4428l = {67}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class UmbrellaCard$bind$autosaver$1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UmbrellaCard$bind$autosaver$1(Context context, Continuation<? super UmbrellaCard$bind$autosaver$1> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UmbrellaCard$bind$autosaver$1 umbrellaCard$bind$autosaver$1 = new UmbrellaCard$bind$autosaver$1(this.$context, continuation);
        umbrellaCard$bind$autosaver$1.L$0 = obj;
        return umbrellaCard$bind$autosaver$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((UmbrellaCard$bind$autosaver$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                String it = (String) this.L$0;
                UmbrellaManager umbrellaManager = UmbrellaManager.INSTANCE;
                Context context = this.$context;
                Intrinsics.checkNotNullExpressionValue(context, "$context");
                this.label = 1;
                if (umbrellaManager.saveCommand(context, it, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
