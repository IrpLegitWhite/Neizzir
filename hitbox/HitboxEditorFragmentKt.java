package com.blackhub.bronline.neizzir.fragments.hitbox;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: HitboxEditorFragment.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m4416d2 = {"pretty", "", "", "app_debug"}, m4417k = 2, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class HitboxEditorFragmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String pretty(double $this$pretty) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String raw = String.format(Locale.US, "%.4f", Arrays.copyOf(new Object[]{Double.valueOf($this$pretty)}, 1));
        Intrinsics.checkNotNullExpressionValue(raw, "format(...)");
        return StringsKt.trimEnd(StringsKt.trimEnd(raw, '0'), '.');
    }
}
