package com.blackhub.bronline.neizzir.fragments.custom.p023ui;

import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcArchiveItem;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcArchiveRepository;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcExportFormat;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcExportPayload;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcTextureEntry;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter;
import java.io.IOException;
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
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$exportEntries$1$1$1", m4426f = "BtxArchiveToolController.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class BtxArchiveToolController$exportEntries$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BpcArchiveItem $archive;
    final /* synthetic */ String $archiveName;
    final /* synthetic */ BtxConverter $converter;
    final /* synthetic */ BpcTextureEntry $entry;
    final /* synthetic */ BpcExportFormat $format;
    final /* synthetic */ BpcArchiveRepository $repo;
    final /* synthetic */ BtxConverter.ArchiveExportTarget $target;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BtxArchiveToolController$exportEntries$1$1$1(BpcExportFormat bpcExportFormat, BtxConverter.ArchiveExportTarget archiveExportTarget, BpcArchiveRepository bpcArchiveRepository, BpcArchiveItem bpcArchiveItem, BpcTextureEntry bpcTextureEntry, BtxConverter btxConverter, String str, Continuation<? super BtxArchiveToolController$exportEntries$1$1$1> continuation) {
        super(2, continuation);
        this.$format = bpcExportFormat;
        this.$target = archiveExportTarget;
        this.$repo = bpcArchiveRepository;
        this.$archive = bpcArchiveItem;
        this.$entry = bpcTextureEntry;
        this.$converter = btxConverter;
        this.$archiveName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BtxArchiveToolController$exportEntries$1$1$1(this.$format, this.$target, this.$repo, this.$archive, this.$entry, this.$converter, this.$archiveName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BtxArchiveToolController$exportEntries$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (this.$format == BpcExportFormat.BTX && (this.$target instanceof BtxConverter.ArchiveExportTarget.FileSystem)) {
                    this.$repo.extractEntryAsBtx(this.$archive, this.$entry, ((BtxConverter.ArchiveExportTarget.FileSystem) this.$target).getDirectory());
                } else {
                    BpcExportPayload payload = this.$repo.buildEntryExport(this.$archive, this.$entry, this.$format);
                    this.$converter.writeArchiveExport(this.$archiveName, payload.getRelativePath(), payload.getBytes(), payload.getMimeType());
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
