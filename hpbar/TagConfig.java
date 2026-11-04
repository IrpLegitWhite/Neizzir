package com.blackhub.bronline.neizzir.fragments.hpbar;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HpBarEditor.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0002\u0010\u0013J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\rHÆ\u0003J\t\u00108\u001a\u00020\rHÆ\u0003J\t\u00109\u001a\u00020\rHÆ\u0003J\t\u0010:\u001a\u00020\rHÆ\u0003J\t\u0010;\u001a\u00020\rHÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\rHÆ\u0003J\u0095\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\rHÆ\u0001J\u0013\u0010E\u001a\u00020\u00032\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020JHÖ\u0001R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0011\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u000f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001a\u0010\u0010\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010!\"\u0004\b5\u0010#¨\u0006K"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/hpbar/TagConfig;", "", "enabled", "", "nameToBarGapMul", "", "hpWidthRef640", "hpHeightRef480", "outlinePx", "roundPx", "armorGapPx", "showHpText", "hpText", "Lcom/blackhub/bronline/neizzir/fragments/hpbar/Rgba;", "border", "hpBg", "hpFill", "armorFill", "armorBg", "(ZFFFFFFZLcom/blackhub/bronline/neizzir/fragments/hpbar/Rgba;Lcom/blackhub/bronline/neizzir/fragments/hpbar/Rgba;Lcom/blackhub/bronline/neizzir/fragments/hpbar/Rgba;Lcom/blackhub/bronline/neizzir/fragments/hpbar/Rgba;Lcom/blackhub/bronline/neizzir/fragments/hpbar/Rgba;Lcom/blackhub/bronline/neizzir/fragments/hpbar/Rgba;)V", "getArmorBg", "()Lcom/blackhub/bronline/neizzir/fragments/hpbar/Rgba;", "setArmorBg", "(Lcom/blackhub/bronline/neizzir/fragments/hpbar/Rgba;)V", "getArmorFill", "setArmorFill", "getArmorGapPx", "()F", "setArmorGapPx", "(F)V", "getBorder", "setBorder", "getEnabled", "()Z", "setEnabled", "(Z)V", "getHpBg", "setHpBg", "getHpFill", "setHpFill", "getHpHeightRef480", "setHpHeightRef480", "getHpText", "setHpText", "getHpWidthRef640", "setHpWidthRef640", "getNameToBarGapMul", "setNameToBarGapMul", "getOutlinePx", "setOutlinePx", "getRoundPx", "setRoundPx", "getShowHpText", "setShowHpText", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class TagConfig {
    private Rgba armorBg;
    private Rgba armorFill;
    private float armorGapPx;
    private Rgba border;
    private boolean enabled;
    private Rgba hpBg;
    private Rgba hpFill;
    private float hpHeightRef480;
    private Rgba hpText;
    private float hpWidthRef640;
    private float nameToBarGapMul;
    private float outlinePx;
    private float roundPx;
    private boolean showHpText;

    public TagConfig() {
        this(false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, 16383, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Rgba getBorder() {
        return this.border;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Rgba getHpBg() {
        return this.hpBg;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Rgba getHpFill() {
        return this.hpFill;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Rgba getArmorFill() {
        return this.armorFill;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Rgba getArmorBg() {
        return this.armorBg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getNameToBarGapMul() {
        return this.nameToBarGapMul;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getHpWidthRef640() {
        return this.hpWidthRef640;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getHpHeightRef480() {
        return this.hpHeightRef480;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getOutlinePx() {
        return this.outlinePx;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getRoundPx() {
        return this.roundPx;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getArmorGapPx() {
        return this.armorGapPx;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShowHpText() {
        return this.showHpText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Rgba getHpText() {
        return this.hpText;
    }

    public final TagConfig copy(boolean enabled, float nameToBarGapMul, float hpWidthRef640, float hpHeightRef480, float outlinePx, float roundPx, float armorGapPx, boolean showHpText, Rgba hpText, Rgba border, Rgba hpBg, Rgba hpFill, Rgba armorFill, Rgba armorBg) {
        Intrinsics.checkNotNullParameter(hpText, "hpText");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(hpBg, "hpBg");
        Intrinsics.checkNotNullParameter(hpFill, "hpFill");
        Intrinsics.checkNotNullParameter(armorFill, "armorFill");
        Intrinsics.checkNotNullParameter(armorBg, "armorBg");
        return new TagConfig(enabled, nameToBarGapMul, hpWidthRef640, hpHeightRef480, outlinePx, roundPx, armorGapPx, showHpText, hpText, border, hpBg, hpFill, armorFill, armorBg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagConfig)) {
            return false;
        }
        TagConfig tagConfig = (TagConfig) other;
        return this.enabled == tagConfig.enabled && Float.compare(this.nameToBarGapMul, tagConfig.nameToBarGapMul) == 0 && Float.compare(this.hpWidthRef640, tagConfig.hpWidthRef640) == 0 && Float.compare(this.hpHeightRef480, tagConfig.hpHeightRef480) == 0 && Float.compare(this.outlinePx, tagConfig.outlinePx) == 0 && Float.compare(this.roundPx, tagConfig.roundPx) == 0 && Float.compare(this.armorGapPx, tagConfig.armorGapPx) == 0 && this.showHpText == tagConfig.showHpText && Intrinsics.areEqual(this.hpText, tagConfig.hpText) && Intrinsics.areEqual(this.border, tagConfig.border) && Intrinsics.areEqual(this.hpBg, tagConfig.hpBg) && Intrinsics.areEqual(this.hpFill, tagConfig.hpFill) && Intrinsics.areEqual(this.armorFill, tagConfig.armorFill) && Intrinsics.areEqual(this.armorBg, tagConfig.armorBg);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Boolean.hashCode(this.enabled) * 31) + Float.hashCode(this.nameToBarGapMul)) * 31) + Float.hashCode(this.hpWidthRef640)) * 31) + Float.hashCode(this.hpHeightRef480)) * 31) + Float.hashCode(this.outlinePx)) * 31) + Float.hashCode(this.roundPx)) * 31) + Float.hashCode(this.armorGapPx)) * 31) + Boolean.hashCode(this.showHpText)) * 31) + this.hpText.hashCode()) * 31) + this.border.hashCode()) * 31) + this.hpBg.hashCode()) * 31) + this.hpFill.hashCode()) * 31) + this.armorFill.hashCode()) * 31) + this.armorBg.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TagConfig(enabled=").append(this.enabled).append(", nameToBarGapMul=").append(this.nameToBarGapMul).append(", hpWidthRef640=").append(this.hpWidthRef640).append(", hpHeightRef480=").append(this.hpHeightRef480).append(", outlinePx=").append(this.outlinePx).append(", roundPx=").append(this.roundPx).append(", armorGapPx=").append(this.armorGapPx).append(", showHpText=").append(this.showHpText).append(", hpText=").append(this.hpText).append(", border=").append(this.border).append(", hpBg=").append(this.hpBg).append(", hpFill=");
        sb.append(this.hpFill).append(", armorFill=").append(this.armorFill).append(", armorBg=").append(this.armorBg).append(')');
        return sb.toString();
    }

    public TagConfig(boolean enabled, float nameToBarGapMul, float hpWidthRef640, float hpHeightRef480, float outlinePx, float roundPx, float armorGapPx, boolean showHpText, Rgba hpText, Rgba border, Rgba hpBg, Rgba hpFill, Rgba armorFill, Rgba armorBg) {
        Intrinsics.checkNotNullParameter(hpText, "hpText");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(hpBg, "hpBg");
        Intrinsics.checkNotNullParameter(hpFill, "hpFill");
        Intrinsics.checkNotNullParameter(armorFill, "armorFill");
        Intrinsics.checkNotNullParameter(armorBg, "armorBg");
        this.enabled = enabled;
        this.nameToBarGapMul = nameToBarGapMul;
        this.hpWidthRef640 = hpWidthRef640;
        this.hpHeightRef480 = hpHeightRef480;
        this.outlinePx = outlinePx;
        this.roundPx = roundPx;
        this.armorGapPx = armorGapPx;
        this.showHpText = showHpText;
        this.hpText = hpText;
        this.border = border;
        this.hpBg = hpBg;
        this.hpFill = hpFill;
        this.armorFill = armorFill;
        this.armorBg = armorBg;
    }

    public /* synthetic */ TagConfig(boolean z, float f, float f2, float f3, float f4, float f5, float f6, boolean z2, Rgba rgba, Rgba rgba2, Rgba rgba3, Rgba rgba4, Rgba rgba5, Rgba rgba6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 1.2f : f, (i & 4) != 0 ? 34.0f : f2, (i & 8) != 0 ? 16.0f : f3, (i & 16) != 0 ? 2.0f : f4, (i & 32) != 0 ? 7.0f : f5, (i & 64) != 0 ? 13.0f : f6, (i & 128) == 0 ? z2 : true, (i & 256) != 0 ? new Rgba(255.0f, 255.0f, 255.0f, 255.0f) : rgba, (i & 512) != 0 ? new Rgba(0.0f, 0.0f, 0.0f, 255.0f) : rgba2, (i & 1024) != 0 ? new Rgba(75.0f, 11.0f, 20.0f, 255.0f) : rgba3, (i & 2048) != 0 ? new Rgba(185.0f, 34.0f, 40.0f, 255.0f) : rgba4, (i & 4096) != 0 ? new Rgba(200.0f, 200.0f, 200.0f, 255.0f) : rgba5, (i & 8192) != 0 ? new Rgba(40.0f, 40.0f, 40.0f, 255.0f) : rgba6);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final float getNameToBarGapMul() {
        return this.nameToBarGapMul;
    }

    public final void setNameToBarGapMul(float f) {
        this.nameToBarGapMul = f;
    }

    public final float getHpWidthRef640() {
        return this.hpWidthRef640;
    }

    public final void setHpWidthRef640(float f) {
        this.hpWidthRef640 = f;
    }

    public final float getHpHeightRef480() {
        return this.hpHeightRef480;
    }

    public final void setHpHeightRef480(float f) {
        this.hpHeightRef480 = f;
    }

    public final float getOutlinePx() {
        return this.outlinePx;
    }

    public final void setOutlinePx(float f) {
        this.outlinePx = f;
    }

    public final float getRoundPx() {
        return this.roundPx;
    }

    public final void setRoundPx(float f) {
        this.roundPx = f;
    }

    public final float getArmorGapPx() {
        return this.armorGapPx;
    }

    public final void setArmorGapPx(float f) {
        this.armorGapPx = f;
    }

    public final boolean getShowHpText() {
        return this.showHpText;
    }

    public final void setShowHpText(boolean z) {
        this.showHpText = z;
    }

    public final Rgba getHpText() {
        return this.hpText;
    }

    public final void setHpText(Rgba rgba) {
        Intrinsics.checkNotNullParameter(rgba, "<set-?>");
        this.hpText = rgba;
    }

    public final Rgba getBorder() {
        return this.border;
    }

    public final void setBorder(Rgba rgba) {
        Intrinsics.checkNotNullParameter(rgba, "<set-?>");
        this.border = rgba;
    }

    public final Rgba getHpBg() {
        return this.hpBg;
    }

    public final void setHpBg(Rgba rgba) {
        Intrinsics.checkNotNullParameter(rgba, "<set-?>");
        this.hpBg = rgba;
    }

    public final Rgba getHpFill() {
        return this.hpFill;
    }

    public final void setHpFill(Rgba rgba) {
        Intrinsics.checkNotNullParameter(rgba, "<set-?>");
        this.hpFill = rgba;
    }

    public final Rgba getArmorFill() {
        return this.armorFill;
    }

    public final void setArmorFill(Rgba rgba) {
        Intrinsics.checkNotNullParameter(rgba, "<set-?>");
        this.armorFill = rgba;
    }

    public final Rgba getArmorBg() {
        return this.armorBg;
    }

    public final void setArmorBg(Rgba rgba) {
        Intrinsics.checkNotNullParameter(rgba, "<set-?>");
        this.armorBg = rgba;
    }
}
