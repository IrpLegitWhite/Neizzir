package com.blackhub.bronline.neizzir.fragments.custom.p023ui;

import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcArchiveItem;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcArchiveRepository;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcPreviewRepository;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcTextureEntry;
import com.blackhub.bronline.neizzir.fragments.custom.btx.PreviewState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BtxArchiveToolController.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/PreviewState;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$requestBtxEntryPreview$1$previewState$1", m4426f = "BtxArchiveToolController.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class BtxArchiveToolController$requestBtxEntryPreview$1$previewState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PreviewState>, Object> {
    final /* synthetic */ BpcArchiveItem $archive;
    final /* synthetic */ BpcTextureEntry $entry;
    final /* synthetic */ BpcPreviewRepository $previewRepo;
    final /* synthetic */ BpcArchiveRepository $repo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BtxArchiveToolController$requestBtxEntryPreview$1$previewState$1(BpcPreviewRepository bpcPreviewRepository, BpcArchiveItem bpcArchiveItem, BpcTextureEntry bpcTextureEntry, BpcArchiveRepository bpcArchiveRepository, Continuation<? super BtxArchiveToolController$requestBtxEntryPreview$1$previewState$1> continuation) {
        super(2, continuation);
        this.$previewRepo = bpcPreviewRepository;
        this.$archive = bpcArchiveItem;
        this.$entry = bpcTextureEntry;
        this.$repo = bpcArchiveRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BtxArchiveToolController$requestBtxEntryPreview$1$previewState$1(this.$previewRepo, this.$archive, this.$entry, this.$repo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PreviewState> continuation) {
        return ((BtxArchiveToolController$requestBtxEntryPreview$1$previewState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                BpcPreviewRepository bpcPreviewRepository = this.$previewRepo;
                BpcArchiveItem bpcArchiveItem = this.$archive;
                BpcTextureEntry bpcTextureEntry = this.$entry;
                final BpcArchiveRepository bpcArchiveRepository = this.$repo;
                final BpcArchiveItem bpcArchiveItem2 = this.$archive;
                final BpcTextureEntry bpcTextureEntry2 = this.$entry;
                return bpcPreviewRepository.loadPreview(bpcArchiveItem, bpcTextureEntry, new Function0<byte[]>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$requestBtxEntryPreview$1$previewState$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final byte[] invoke() {
                        return bpcArchiveRepository.readEntryBytes(bpcArchiveItem2, bpcTextureEntry2.getArchivePath());
                    }
                });
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
