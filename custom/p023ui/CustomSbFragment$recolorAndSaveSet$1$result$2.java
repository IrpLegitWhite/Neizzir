package com.blackhub.bronline.neizzir.fragments.custom.p023ui;

import com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: CustomSbFragment.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "d", "", "t"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$recolorAndSaveSet$1$result$2", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {733}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class CustomSbFragment$recolorAndSaveSet$1$result$2 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super Unit>, Object> {
    final /* synthetic */ LauncherDialogHelper.ProgressHandle $progress;
    /* synthetic */ int I$0;
    /* synthetic */ int I$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomSbFragment$recolorAndSaveSet$1$result$2(LauncherDialogHelper.ProgressHandle progressHandle, Continuation<? super CustomSbFragment$recolorAndSaveSet$1$result$2> continuation) {
        super(3, continuation);
        this.$progress = progressHandle;
    }

    public final Object invoke(int i, int i2, Continuation<? super Unit> continuation) {
        CustomSbFragment$recolorAndSaveSet$1$result$2 customSbFragment$recolorAndSaveSet$1$result$2 = new CustomSbFragment$recolorAndSaveSet$1$result$2(this.$progress, continuation);
        customSbFragment$recolorAndSaveSet$1$result$2.I$0 = i;
        customSbFragment$recolorAndSaveSet$1$result$2.I$1 = i2;
        return customSbFragment$recolorAndSaveSet$1$result$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Integer num, Integer num2, Continuation<? super Unit> continuation) {
        return invoke(num.intValue(), num2.intValue(), continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$recolorAndSaveSet$1$result$2$1 */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$recolorAndSaveSet$1$result$2$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: $d */
        final /* synthetic */ int f818$d;
        final /* synthetic */ LauncherDialogHelper.ProgressHandle $progress;

        /* JADX INFO: renamed from: $t */
        final /* synthetic */ int f819$t;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54911(LauncherDialogHelper.ProgressHandle progressHandle, int i, int i2, Continuation<? super C54911> continuation) {
            super(2, continuation);
            this.$progress = progressHandle;
            this.f818$d = i;
            this.f819$t = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54911(this.$progress, this.f818$d, this.f819$t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    this.$progress.setProgress(this.f818$d, this.f819$t, "Обработано " + this.f818$d + " / " + this.f819$t + "...");
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                int d = this.I$0;
                int t = this.I$1;
                this.label = 1;
                if (BuildersKt.withContext(Dispatchers.getMain(), new C54911(this.$progress, d, t, null), this) == coroutine_suspended) {
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
