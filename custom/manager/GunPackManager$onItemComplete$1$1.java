package com.blackhub.bronline.neizzir.fragments.custom.manager;

import android.app.AlertDialog;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.IOException;
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

/* JADX INFO: compiled from: GunPackManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager$onItemComplete$1$1", m4426f = "GunPackManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class GunPackManager$onItemComplete$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AlertDialog $dialog;
    final /* synthetic */ String $packId;
    final /* synthetic */ List<File> $tempFiles;
    int label;
    final /* synthetic */ GunPackManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GunPackManager$onItemComplete$1$1(GunPackManager gunPackManager, String str, List<? extends File> list, AlertDialog alertDialog, Continuation<? super GunPackManager$onItemComplete$1$1> continuation) {
        super(2, continuation);
        this.this$0 = gunPackManager;
        this.$packId = str;
        this.$tempFiles = list;
        this.$dialog = alertDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GunPackManager$onItemComplete$1$1(this.this$0, this.$packId, this.$tempFiles, this.$dialog, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GunPackManager$onItemComplete$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                this.this$0.packAll(this.$packId, this.$tempFiles);
                Handler handler = new Handler(Looper.getMainLooper());
                final AlertDialog alertDialog = this.$dialog;
                final GunPackManager gunPackManager = this.this$0;
                final String str = this.$packId;
                handler.post(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager$onItemComplete$1$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        GunPackManager$onItemComplete$1$1.invokeSuspend$lambda$0(alertDialog, gunPackManager, str);
                    }
                });
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(AlertDialog $dialog, GunPackManager this$0, String $packId) {
        $dialog.dismiss();
        this$0.toast("Pack " + $packId + " скачан и упакован");
    }
}
