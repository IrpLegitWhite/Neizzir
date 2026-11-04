package com.blackhub.bronline.neizzir.fragments.custom.p023ui;

import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcArchiveItem;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcArchiveRepository;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcTextureEntry;
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

/* JADX INFO: compiled from: BtxArchiveToolController.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcTextureEntry;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$exportEntries$1$sourceEntries$1", m4426f = "BtxArchiveToolController.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class BtxArchiveToolController$exportEntries$1$sourceEntries$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends BpcTextureEntry>>, Object> {
    final /* synthetic */ BpcArchiveItem $archive;
    final /* synthetic */ BpcArchiveRepository $repo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BtxArchiveToolController$exportEntries$1$sourceEntries$1(BpcArchiveRepository bpcArchiveRepository, BpcArchiveItem bpcArchiveItem, Continuation<? super BtxArchiveToolController$exportEntries$1$sourceEntries$1> continuation) {
        super(2, continuation);
        this.$repo = bpcArchiveRepository;
        this.$archive = bpcArchiveItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BtxArchiveToolController$exportEntries$1$sourceEntries$1(this.$repo, this.$archive, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends BpcTextureEntry>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<BpcTextureEntry>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<BpcTextureEntry>> continuation) {
        return ((BtxArchiveToolController$exportEntries$1$sourceEntries$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                return this.$repo.listTextureEntries(this.$archive);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
