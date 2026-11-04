package com.blackhub.bronline.neizzir.fragments.custom.p023ui;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.p040io.ByteStreamsKt;
import kotlin.p040io.CloseableKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BtxArchiveToolController.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$handleBpcImportResult$1$sourceBytes$1", m4426f = "BtxArchiveToolController.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class BtxArchiveToolController$handleBpcImportResult$1$sourceBytes$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
    final /* synthetic */ String $displayName;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ BtxArchiveToolController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BtxArchiveToolController$handleBpcImportResult$1$sourceBytes$1(BtxArchiveToolController btxArchiveToolController, Uri uri, String str, Continuation<? super BtxArchiveToolController$handleBpcImportResult$1$sourceBytes$1> continuation) {
        super(2, continuation);
        this.this$0 = btxArchiveToolController;
        this.$uri = uri;
        this.$displayName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BtxArchiveToolController$handleBpcImportResult$1$sourceBytes$1(this.this$0, this.$uri, this.$displayName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
        return ((BtxArchiveToolController$handleBpcImportResult$1$sourceBytes$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws FileNotFoundException {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                InputStream inputStreamOpenInputStream = this.this$0.getCtx().getContentResolver().openInputStream(this.$uri);
                if (inputStreamOpenInputStream != null) {
                    InputStream inputStream = inputStreamOpenInputStream;
                    try {
                        InputStream it = inputStream;
                        byte[] bytes = ByteStreamsKt.readBytes(it);
                        CloseableKt.closeFinally(inputStream, null);
                        if (bytes != null) {
                            return bytes;
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
                throw new IllegalArgumentException("Не удалось прочитать " + this.$displayName);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
