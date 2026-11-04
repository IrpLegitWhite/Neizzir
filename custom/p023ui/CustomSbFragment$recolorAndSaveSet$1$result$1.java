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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: CustomSbFragment.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "t", ""}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$recolorAndSaveSet$1$result$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {728}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class CustomSbFragment$recolorAndSaveSet$1$result$1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    final /* synthetic */ LauncherDialogHelper.ProgressHandle $progress;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomSbFragment$recolorAndSaveSet$1$result$1(LauncherDialogHelper.ProgressHandle progressHandle, Continuation<? super CustomSbFragment$recolorAndSaveSet$1$result$1> continuation) {
        super(2, continuation);
        this.$progress = progressHandle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CustomSbFragment$recolorAndSaveSet$1$result$1 customSbFragment$recolorAndSaveSet$1$result$1 = new CustomSbFragment$recolorAndSaveSet$1$result$1(this.$progress, continuation);
        customSbFragment$recolorAndSaveSet$1$result$1.L$0 = obj;
        return customSbFragment$recolorAndSaveSet$1$result$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((CustomSbFragment$recolorAndSaveSet$1$result$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$recolorAndSaveSet$1$result$1$1 */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$recolorAndSaveSet$1$result$1$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LauncherDialogHelper.ProgressHandle $progress;

        /* JADX INFO: renamed from: $t */
        final /* synthetic */ String f817$t;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54901(LauncherDialogHelper.ProgressHandle progressHandle, String str, Continuation<? super C54901> continuation) {
            super(2, continuation);
            this.$progress = progressHandle;
            this.f817$t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54901(this.$progress, this.f817$t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    this.$progress.setMessage(this.f817$t);
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
                String t = (String) this.L$0;
                this.label = 1;
                if (BuildersKt.withContext(Dispatchers.getMain(), new C54901(this.$progress, t, null), this) == coroutine_suspended) {
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
