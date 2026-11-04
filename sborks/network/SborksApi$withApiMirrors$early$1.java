package com.blackhub.bronline.neizzir.fragments.sborks.network;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SborksApi.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/fragments/sborks/network/SborksApi$ApiAttempt;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$withApiMirrors$early$1", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {146}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class SborksApi$withApiMirrors$early$1<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SborksApi.ApiAttempt<? extends T>>, Object> {
    final /* synthetic */ Deferred<SborksApi.ApiAttempt<T>> $first;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SborksApi$withApiMirrors$early$1(Deferred<? extends SborksApi.ApiAttempt<? extends T>> deferred, Continuation<? super SborksApi$withApiMirrors$early$1> continuation) {
        super(2, continuation);
        this.$first = deferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SborksApi$withApiMirrors$early$1(this.$first, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SborksApi.ApiAttempt<? extends T>> continuation) {
        return ((SborksApi$withApiMirrors$early$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                Object objAwait = this.$first.await(this);
                return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
            case 1:
                ResultKt.throwOnFailure($result);
                return $result;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
