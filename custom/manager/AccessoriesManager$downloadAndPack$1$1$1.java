package com.blackhub.bronline.neizzir.fragments.custom.manager;

import com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomFile;
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

/* JADX INFO: compiled from: AccessoriesManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$downloadAndPack$1$1$1", m4426f = "AccessoriesManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class AccessoriesManager$downloadAndPack$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ LauncherDialogHelper.ProgressHandle $progress;
    final /* synthetic */ List<RemoteCustomFile> $toDownload;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccessoriesManager$downloadAndPack$1$1$1(LauncherDialogHelper.ProgressHandle progressHandle, int i, List<RemoteCustomFile> list, Continuation<? super AccessoriesManager$downloadAndPack$1$1$1> continuation) {
        super(2, continuation);
        this.$progress = progressHandle;
        this.$index = i;
        this.$toDownload = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccessoriesManager$downloadAndPack$1$1$1(this.$progress, this.$index, this.$toDownload, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccessoriesManager$downloadAndPack$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                this.$progress.setProgress(this.$index + 1, this.$toDownload.size(), "Загружено " + (this.$index + 1) + " / " + this.$toDownload.size());
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
