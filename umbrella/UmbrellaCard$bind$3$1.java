package com.blackhub.bronline.neizzir.umbrella;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: UmbrellaCard.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$bind$3$1", m4426f = "UmbrellaCard.kt", m4427i = {}, m4428l = {60, 61, 61}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class UmbrellaCard$bind$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $requested;
    final /* synthetic */ View $toggle;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UmbrellaCard$bind$3$1(Context context, boolean z, View view, Continuation<? super UmbrellaCard$bind$3$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$requested = z;
        this.$toggle = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UmbrellaCard$bind$3$1(this.$context, this.$requested, this.$toggle, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UmbrellaCard$bind$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$bind$3$1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$bind$3$1] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        ?? WithContext = 0;
        try {
            switch (r1) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    UmbrellaCard$bind$3$1 umbrellaCard$bind$3$1 = this;
                    UmbrellaManager umbrellaManager = UmbrellaManager.INSTANCE;
                    Context context = umbrellaCard$bind$3$1.$context;
                    Intrinsics.checkNotNullExpressionValue(context, "$context");
                    umbrellaCard$bind$3$1.label = 1;
                    Object enabled = umbrellaManager.setEnabled(context, umbrellaCard$bind$3$1.$requested, umbrellaCard$bind$3$1);
                    r1 = umbrellaCard$bind$3$1;
                    if (enabled == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r1.label = 2;
                    WithContext = BuildersKt.withContext(Dispatchers.getMain(), new C56871(r1.$toggle, null), (Continuation) r1);
                    if (WithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    r1 = this;
                    ResultKt.throwOnFailure(obj);
                    r1.label = 2;
                    WithContext = BuildersKt.withContext(Dispatchers.getMain(), new C56871(r1.$toggle, null), (Continuation) r1);
                    if (WithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 2:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 3:
                    Throwable th = (Throwable) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    throw th;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th2) {
            r1.L$0 = th2;
            r1.label = 3;
            if (BuildersKt.withContext(Dispatchers.getMain(), new C56871(r1.$toggle, WithContext), (Continuation) r1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$bind$3$1$1 */
    /* JADX INFO: compiled from: UmbrellaCard.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$bind$3$1$1", m4426f = "UmbrellaCard.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ View $toggle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C56871(View view, Continuation<? super C56871> continuation) {
            super(2, continuation);
            this.$toggle = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C56871(this.$toggle, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    this.$toggle.setEnabled(!UmbrellaManager.INSTANCE.getState().getValue().getBusy());
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
