package com.blackhub.bronline.neizzir.fragments.hitbox;

import android.graphics.Color;
import android.widget.TextView;
import com.google.android.material.slider.Slider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: HitboxEditorFragment.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.hitbox.HitboxEditorFragment$buildContent$btnReset$1$2$1", m4426f = "HitboxEditorFragment.kt", m4427i = {}, m4428l = {469}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class HitboxEditorFragment$buildContent$btnReset$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Slider $slider;
    final /* synthetic */ TextView $sliderValue;
    int label;
    final /* synthetic */ HitboxEditorFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HitboxEditorFragment$buildContent$btnReset$1$2$1(HitboxEditorFragment hitboxEditorFragment, Slider slider, TextView textView, Continuation<? super HitboxEditorFragment$buildContent$btnReset$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = hitboxEditorFragment;
        this.$slider = slider;
        this.$sliderValue = textView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HitboxEditorFragment$buildContent$btnReset$1$2$1(this.this$0, this.$slider, this.$sliderValue, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HitboxEditorFragment$buildContent$btnReset$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        HitboxEditorFragment$buildContent$btnReset$1$2$1 hitboxEditorFragment$buildContent$btnReset$1$2$1;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (this.this$0.resetToStock(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hitboxEditorFragment$buildContent$btnReset$1$2$1 = this;
                break;
                break;
            case 1:
                hitboxEditorFragment$buildContent$btnReset$1$2$1 = this;
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hitboxEditorFragment$buildContent$btnReset$1$2$1.$slider.setValue(0.0f);
        hitboxEditorFragment$buildContent$btnReset$1$2$1.$sliderValue.setText("0%");
        hitboxEditorFragment$buildContent$btnReset$1$2$1.$sliderValue.setTextColor(Color.parseColor("#00E5CC"));
        return Unit.INSTANCE;
    }
}
