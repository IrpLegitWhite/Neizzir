package com.blackhub.bronline.neizzir.network;

import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: EndpointRouter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/network/NetworkResult;", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter$download$3$candidate$1", m4426f = "EndpointRouter.kt", m4427i = {}, m4428l = {216}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class EndpointRouter$download$3$candidate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super NetworkResult<? extends File>>, Object> {
    final /* synthetic */ EndpointGroup $group;
    final /* synthetic */ Function2<DownloadProgress, Continuation<? super Unit>, Object> $onProgress;
    final /* synthetic */ String $path;
    final /* synthetic */ DownloadSpec $spec;
    int label;
    final /* synthetic */ EndpointRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EndpointRouter$download$3$candidate$1(EndpointRouter endpointRouter, EndpointGroup endpointGroup, String str, DownloadSpec downloadSpec, Function2<? super DownloadProgress, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super EndpointRouter$download$3$candidate$1> continuation) {
        super(2, continuation);
        this.this$0 = endpointRouter;
        this.$group = endpointGroup;
        this.$path = str;
        this.$spec = downloadSpec;
        this.$onProgress = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EndpointRouter$download$3$candidate$1(this.this$0, this.$group, this.$path, this.$spec, this.$onProgress, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkResult<? extends File>> continuation) {
        return ((EndpointRouter$download$3$candidate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                Object objPerformDownload = this.this$0.performDownload(this.$group, this.$path, this.$spec, this.$onProgress, this);
                return objPerformDownload == coroutine_suspended ? coroutine_suspended : objPerformDownload;
            case 1:
                ResultKt.throwOnFailure($result);
                return $result;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
