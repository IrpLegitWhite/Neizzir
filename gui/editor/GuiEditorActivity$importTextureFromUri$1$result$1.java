package com.blackhub.bronline.neizzir.gui.editor;

import android.net.Uri;
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
@Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$importTextureFromUri$1$result$1", m4426f = "GuiEditorActivity.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class GuiEditorActivity$importTextureFromUri$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends byte[]>>, Object> {
    final /* synthetic */ String $sourceName;
    final /* synthetic */ Uri $uri;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GuiEditorActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GuiEditorActivity$importTextureFromUri$1$result$1(GuiEditorActivity guiEditorActivity, Uri uri, String str, Continuation<? super GuiEditorActivity$importTextureFromUri$1$result$1> continuation) {
        super(2, continuation);
        this.this$0 = guiEditorActivity;
        this.$uri = uri;
        this.$sourceName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GuiEditorActivity$importTextureFromUri$1$result$1 guiEditorActivity$importTextureFromUri$1$result$1 = new GuiEditorActivity$importTextureFromUri$1$result$1(this.this$0, this.$uri, this.$sourceName, continuation);
        guiEditorActivity$importTextureFromUri$1$result$1.L$0 = obj;
        return guiEditorActivity$importTextureFromUri$1$result$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends byte[]>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<byte[]>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<byte[]>> continuation) {
        return ((GuiEditorActivity$importTextureFromUri$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                String str = this.$sourceName;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    InputStream inputStreamOpenInputStream = guiEditorActivity.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        InputStream inputStream = inputStreamOpenInputStream;
                        try {
                            InputStream it = inputStream;
                            Intrinsics.checkNotNull(it);
                            byte[] bytes = ByteStreamsKt.readBytes(it);
                            CloseableKt.closeFinally(inputStream, null);
                            if (bytes != null) {
                                if (!(bytes.length == 0)) {
                                    objM15551constructorimpl = Result.m15551constructorimpl(bytes);
                                    return Result.m15550boximpl(objM15551constructorimpl);
                                }
                                throw new IllegalArgumentException("Файл пустой: " + str);
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(inputStream, th);
                                throw th2;
                            }
                        }
                    }
                    throw new IllegalArgumentException("Файл не открылся: " + str);
                } catch (Throwable th3) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th3));
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
