package com.blackhub.bronline.neizzir.fragments.hpbar;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: compiled from: HpBarEditor.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u001bJ\t\u0010 \u001a\u00020!HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\""}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/hpbar/Rgba;", "", "r", "", "g", "b", "a", "(FFFF)V", "getA", "()F", "setA", "(F)V", "getB", "setB", "getG", "setG", "getR", "setR", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "setFromColorInt", "", "c", "toColorInt", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class Rgba {
    private float a;
    private float b;
    private float g;
    private float r;

    public static /* synthetic */ Rgba copy$default(Rgba rgba, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = rgba.r;
        }
        if ((i & 2) != 0) {
            f2 = rgba.g;
        }
        if ((i & 4) != 0) {
            f3 = rgba.b;
        }
        if ((i & 8) != 0) {
            f4 = rgba.a;
        }
        return rgba.copy(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getR() {
        return this.r;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getA() {
        return this.a;
    }

    public final Rgba copy(float r, float g, float b, float a2) {
        return new Rgba(r, g, b, a2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Rgba)) {
            return false;
        }
        Rgba rgba = (Rgba) other;
        return Float.compare(this.r, rgba.r) == 0 && Float.compare(this.g, rgba.g) == 0 && Float.compare(this.b, rgba.b) == 0 && Float.compare(this.a, rgba.a) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.r) * 31) + Float.hashCode(this.g)) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.a);
    }

    public String toString() {
        return "Rgba(r=" + this.r + ", g=" + this.g + ", b=" + this.b + ", a=" + this.a + ')';
    }

    public Rgba(float r, float g, float b, float a2) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a2;
    }

    public final float getA() {
        return this.a;
    }

    public final float getB() {
        return this.b;
    }

    public final float getG() {
        return this.g;
    }

    public final float getR() {
        return this.r;
    }

    public final void setA(float f) {
        this.a = f;
    }

    public final void setB(float f) {
        this.b = f;
    }

    public final void setG(float f) {
        this.g = f;
    }

    public final void setR(float f) {
        this.r = f;
    }

    public final int toColorInt() {
        return Color.argb(RangesKt___RangesKt.coerceIn(MathKt__MathJVMKt.roundToInt(this.a), 0, 255), RangesKt___RangesKt.coerceIn(MathKt__MathJVMKt.roundToInt(this.r), 0, 255), RangesKt___RangesKt.coerceIn(MathKt__MathJVMKt.roundToInt(this.g), 0, 255), RangesKt___RangesKt.coerceIn(MathKt__MathJVMKt.roundToInt(this.b), 0, 255));
    }

    public final void setFromColorInt(int c) {
        this.a = Color.alpha(c);
        this.r = Color.red(c);
        this.g = Color.green(c);
        this.b = Color.blue(c);
    }
}
