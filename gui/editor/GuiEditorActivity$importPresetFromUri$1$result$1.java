package com.blackhub.bronline.neizzir.gui.editor;

import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
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
import kotlin.p040io.ByteStreamsKt;
import kotlin.p040io.CloseableKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: GuiEditorActivity.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiPresetHandle;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$importPresetFromUri$1$result$1", m4426f = "GuiEditorActivity.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class GuiEditorActivity$importPresetFromUri$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends GuiPresetHandle>>, Object> {
    final /* synthetic */ Uri $uri;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GuiEditorActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GuiEditorActivity$importPresetFromUri$1$result$1(GuiEditorActivity guiEditorActivity, Uri uri, Continuation<? super GuiEditorActivity$importPresetFromUri$1$result$1> continuation) {
        super(2, continuation);
        this.this$0 = guiEditorActivity;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GuiEditorActivity$importPresetFromUri$1$result$1 guiEditorActivity$importPresetFromUri$1$result$1 = new GuiEditorActivity$importPresetFromUri$1$result$1(this.this$0, this.$uri, continuation);
        guiEditorActivity$importPresetFromUri$1$result$1.L$0 = obj;
        return guiEditorActivity$importPresetFromUri$1$result$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends GuiPresetHandle>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<GuiPresetHandle>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<GuiPresetHandle>> continuation) {
        return ((GuiEditorActivity$importPresetFromUri$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM15551constructorimpl;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                GuiEditorActivity guiEditorActivity = this.this$0;
                Uri uri = this.$uri;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    File temp = new File(guiEditorActivity.getCacheDir(), "gui_preset_import_" + System.currentTimeMillis() + ".zip");
                    InputStream inputStreamOpenInputStream = guiEditorActivity.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        InputStream inputStream = inputStreamOpenInputStream;
                        try {
                            InputStream input = inputStream;
                            FileOutputStream fileOutputStream = new FileOutputStream(temp);
                            try {
                                FileOutputStream output = fileOutputStream;
                                Intrinsics.checkNotNull(input);
                                GuiPresetRepository guiPresetRepository = null;
                                ByteStreamsKt.copyTo$default(input, output, 0, 2, null);
                                CloseableKt.closeFinally(fileOutputStream, null);
                                CloseableKt.closeFinally(inputStream, null);
                                GuiPresetRepository guiPresetRepository2 = guiEditorActivity.presetRepository;
                                if (guiPresetRepository2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("presetRepository");
                                } else {
                                    guiPresetRepository = guiPresetRepository2;
                                }
                                objM15551constructorimpl = Result.m15551constructorimpl(guiPresetRepository.importPreset(temp));
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    CloseableKt.closeFinally(fileOutputStream, th);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                CloseableKt.closeFinally(inputStream, th3);
                                throw th4;
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("ZIP не открылся.");
                    }
                } catch (Throwable th5) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th5));
                }
                return Result.m15550boximpl(objM15551constructorimpl);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
