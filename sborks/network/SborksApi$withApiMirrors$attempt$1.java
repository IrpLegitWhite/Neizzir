package com.blackhub.bronline.neizzir.fragments.sborks.network;

import com.blackhub.bronline.game.gui.donate.utils.DonateConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SborksApi.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi", m4426f = "SborksApi.kt", m4427i = {0, 0, 0, 0, 1}, m4428l = {DonateConstants.ID_PREMIUM_KITS, 96}, m4429m = "withApiMirrors$attempt", m4430n = {"$handle", "req", "$mutating", "idx", "idx"}, m4431s = {"L$0", "L$1", "Z$0", "I$0", "I$0"})
final class SborksApi$withApiMirrors$attempt$1<T> extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    SborksApi$withApiMirrors$attempt$1(Continuation<? super SborksApi$withApiMirrors$attempt$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SborksApi.withApiMirrors$attempt(null, null, false, 0, this);
    }
}
