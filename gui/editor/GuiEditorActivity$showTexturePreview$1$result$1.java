package com.blackhub.bronline.neizzir.gui.editor;

import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: GuiEditorActivity.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lkotlin/Result;", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$showTexturePreview$1$result$1", m4426f = "GuiEditorActivity.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class GuiEditorActivity$showTexturePreview$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends File>>, Object> {
    final /* synthetic */ GuiTextureEntry $entry;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GuiEditorActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GuiEditorActivity$showTexturePreview$1$result$1(GuiEditorActivity guiEditorActivity, GuiTextureEntry guiTextureEntry, Continuation<? super GuiEditorActivity$showTexturePreview$1$result$1> continuation) {
        super(2, continuation);
        this.this$0 = guiEditorActivity;
        this.$entry = guiTextureEntry;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GuiEditorActivity$showTexturePreview$1$result$1 guiEditorActivity$showTexturePreview$1$result$1 = new GuiEditorActivity$showTexturePreview$1$result$1(this.this$0, this.$entry, continuation);
        guiEditorActivity$showTexturePreview$1$result$1.L$0 = obj;
        return guiEditorActivity$showTexturePreview$1$result$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends File>> continuation) {
        return ((GuiEditorActivity$showTexturePreview$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM15551constructorimpl;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                GuiEditorActivity guiEditorActivity = this.this$0;
                GuiTextureEntry guiTextureEntry = this.$entry;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    GuiTextureRepository guiTextureRepository = guiEditorActivity.textureRepository;
                    if (guiTextureRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("textureRepository");
                        guiTextureRepository = null;
                    }
                    objM15551constructorimpl = Result.m15551constructorimpl(guiTextureRepository.previewFile(guiTextureEntry));
                    break;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                }
                return Result.m15550boximpl(objM15551constructorimpl);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
