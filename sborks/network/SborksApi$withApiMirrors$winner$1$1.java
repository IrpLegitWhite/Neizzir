package com.blackhub.bronline.neizzir.fragments.sborks.network;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SborksApi.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0001\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/blackhub/bronline/neizzir/fragments/sborks/network/SborksApi$ApiAttempt;", ExifInterface.GPS_DIRECTION_TRUE, "it"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$withApiMirrors$winner$1$1", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class SborksApi$withApiMirrors$winner$1$1<T> extends SuspendLambda implements Function2<SborksApi.ApiAttempt<? extends T>, Continuation<? super Pair<? extends Integer, ? extends SborksApi.ApiAttempt<? extends T>>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    SborksApi$withApiMirrors$winner$1$1(Continuation<? super SborksApi$withApiMirrors$winner$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SborksApi$withApiMirrors$winner$1$1 sborksApi$withApiMirrors$winner$1$1 = new SborksApi$withApiMirrors$winner$1$1(continuation);
        sborksApi$withApiMirrors$winner$1$1.L$0 = obj;
        return sborksApi$withApiMirrors$winner$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SborksApi.ApiAttempt<? extends T> apiAttempt, Continuation<? super Pair<Integer, ? extends SborksApi.ApiAttempt<? extends T>>> continuation) {
        return ((SborksApi$withApiMirrors$winner$1$1) create(apiAttempt, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                SborksApi.ApiAttempt it = (SborksApi.ApiAttempt) this.L$0;
                return TuplesKt.m4423to(Boxing.boxInt(0), it);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
