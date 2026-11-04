package com.blackhub.bronline.neizzir.gui.editor;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.blackhub.bronline.neizzir.converter.BtxPngConverter;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: GuiEditorActivity.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0004H\u008a@"}, m4416d2 = {"<anonymous>", "Lkotlin/Result;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$updatePreviewTexture$1$result$1", m4426f = "GuiEditorActivity.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class GuiEditorActivity$updatePreviewTexture$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Bitmap>>, Object> {
    final /* synthetic */ byte[] $bytes;
    final /* synthetic */ String $sourceName;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GuiEditorActivity$updatePreviewTexture$1$result$1(String str, byte[] bArr, Continuation<? super GuiEditorActivity$updatePreviewTexture$1$result$1> continuation) {
        super(2, continuation);
        this.$sourceName = str;
        this.$bytes = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GuiEditorActivity$updatePreviewTexture$1$result$1 guiEditorActivity$updatePreviewTexture$1$result$1 = new GuiEditorActivity$updatePreviewTexture$1$result$1(this.$sourceName, this.$bytes, continuation);
        guiEditorActivity$updatePreviewTexture$1$result$1.L$0 = obj;
        return guiEditorActivity$updatePreviewTexture$1$result$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Bitmap>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Bitmap>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Bitmap>> continuation) {
        return ((GuiEditorActivity$updatePreviewTexture$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM15551constructorimpl;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                String str = this.$sourceName;
                byte[] bArrBtxToPng = this.$bytes;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    if (StringsKt__StringsJVMKt.endsWith(str, ".btx", true)) {
                        bArrBtxToPng = BtxPngConverter.INSTANCE.btxToPng(bArrBtxToPng);
                    }
                    byte[] pngBytes = bArrBtxToPng;
                    objM15551constructorimpl = Result.m15551constructorimpl(BitmapFactory.decodeByteArray(pngBytes, 0, pngBytes.length));
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
