package com.blackhub.bronline.neizzir.fragments.custom.p023ui;

import androidx.fragment.app.FragmentActivity;
import com.blackhub.bronline.neizzir.activities.main.game.GameStarter;
import com.blackhub.bronline.neizzir.activities.main.settings.SettingsRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: CustomSbFragment.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$setupBottomNavigation$2$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {781}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class CustomSbFragment$setupBottomNavigation$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CustomSbFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomSbFragment$setupBottomNavigation$2$1(CustomSbFragment customSbFragment, Continuation<? super CustomSbFragment$setupBottomNavigation$2$1> continuation) {
        super(2, continuation);
        this.this$0 = customSbFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CustomSbFragment$setupBottomNavigation$2$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CustomSbFragment$setupBottomNavigation$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                GameStarter gameStarter = GameStarter.INSTANCE;
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                FragmentActivity fragmentActivity = fragmentActivityRequireActivity;
                SettingsRepository settingsRepository = this.this$0.settingsRepo;
                if (settingsRepository == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("settingsRepo");
                    settingsRepository = null;
                }
                this.label = 1;
                if (gameStarter.start(fragmentActivity, settingsRepository, this) == coroutine_suspended) {
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
