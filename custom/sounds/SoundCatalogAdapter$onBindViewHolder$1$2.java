package com.blackhub.bronline.neizzir.fragments.custom.sounds;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: SoundCatalogAdapter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
/* synthetic */ class SoundCatalogAdapter$onBindViewHolder$1$2 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    SoundCatalogAdapter$onBindViewHolder$1$2(Object obj) {
        super(1, obj, SoundCatalogAdapter.Holder.class, "update", "update(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean p0) {
        ((SoundCatalogAdapter.Holder) this.receiver).update(p0);
    }
}
