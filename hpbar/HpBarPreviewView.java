package com.blackhub.bronline.neizzir.fragments.hpbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperKeys;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: compiled from: HpBarEditor.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060 H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0014J\u0018\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001aH\u0014J\u000e\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082D¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\b¨\u0006*"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/hpbar/HpBarPreviewView;", "Landroid/view/View;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "arPct", "", "getArPct", "()F", "setArPct", "(F)V", "cfg", "Lcom/blackhub/bronline/neizzir/fragments/hpbar/TagConfig;", "getCfg", "()Lcom/blackhub/bronline/neizzir/fragments/hpbar/TagConfig;", "setCfg", "(Lcom/blackhub/bronline/neizzir/fragments/hpbar/TagConfig;)V", "hpPct", "getHpPct", "setHpPct", "paint", "Landroid/graphics/Paint;", "rect", "Landroid/graphics/RectF;", "textPaint", "virtH", "", "virtW", "<set-?>", "zoom", "getZoom", "contentSizePx", "Lkotlin/Pair;", "onDraw", "", "c", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setZoom", MiniGamesHelperKeys.ZOOM_KEY, "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class HpBarPreviewView extends View {
    private float arPct;
    private TagConfig cfg;
    private float hpPct;
    private final Paint paint;
    private final RectF rect;
    private final Paint textPaint;
    private final int virtH;
    private final int virtW;
    private float zoom;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HpBarPreviewView(Context ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.cfg = new TagConfig(false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, 16383, null);
        this.hpPct = 0.75f;
        this.arPct = 0.4f;
        this.virtW = 1920;
        this.virtH = 1080;
        this.zoom = 1.0f;
        this.paint = new Paint(1);
        Paint $this$textPaint_u24lambda_u240 = new Paint(1);
        $this$textPaint_u24lambda_u240.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        this.textPaint = $this$textPaint_u24lambda_u240;
        this.rect = new RectF();
    }

    public final TagConfig getCfg() {
        return this.cfg;
    }

    public final void setCfg(TagConfig tagConfig) {
        Intrinsics.checkNotNullParameter(tagConfig, "<set-?>");
        this.cfg = tagConfig;
    }

    public final float getHpPct() {
        return this.hpPct;
    }

    public final void setHpPct(float f) {
        this.hpPct = f;
    }

    public final float getArPct() {
        return this.arPct;
    }

    public final void setArPct(float f) {
        this.arPct = f;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public final void setZoom(float z) {
        this.zoom = RangesKt___RangesKt.coerceAtLeast(z, 0.1f);
        requestLayout();
        invalidate();
    }

    private final Pair<Float, Float> contentSizePx() {
        float bwPx = this.virtW * (this.cfg.getHpWidthRef640() / 640.0f);
        float bhPx = this.virtH * (this.cfg.getHpHeightRef480() / 480.0f);
        float contentWpx = (this.cfg.getOutlinePx() * 2.0f) + bwPx;
        float contentHpx = (bhPx * 2.0f) + this.cfg.getArmorGapPx() + (this.cfg.getOutlinePx() * 2.0f);
        return TuplesKt.m4423to(Float.valueOf(contentWpx), Float.valueOf(contentHpx));
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Pair<Float, Float> pairContentSizePx = contentSizePx();
        float contentWpx = pairContentSizePx.component1().floatValue();
        float contentHpx = pairContentSizePx.component2().floatValue();
        int measuredW = (int) (getPaddingLeft() + getPaddingRight() + (this.zoom * contentWpx));
        int measuredH = (int) (getPaddingTop() + getPaddingBottom() + (this.zoom * contentHpx));
        setMeasuredDimension(measuredW, View.resolveSize(measuredH, heightMeasureSpec));
    }

    @Override // android.view.View
    protected void onDraw(Canvas c) {
        Intrinsics.checkNotNullParameter(c, "c");
        super.onDraw(c);
        float s = this.zoom;
        float bw = this.virtW * (this.cfg.getHpWidthRef640() / 640.0f) * s;
        float bh = this.virtH * (this.cfg.getHpHeightRef480() / 480.0f) * s;
        float outline = this.cfg.getOutlinePx() * s;
        float radius = this.cfg.getRoundPx() * s;
        float armorGap = this.cfg.getArmorGapPx() * s;
        float blockW = (outline * 2.0f) + bw;
        float blockH = (bh * 2.0f) + armorGap + (outline * 2.0f);
        float availW = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float availH = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float left = getPaddingLeft() + ((availW - blockW) / 2.0f);
        float top = getPaddingTop() + (blockH < availH ? (availH - blockH) / 2.0f : 0.0f);
        float innerLeft = left + outline;
        float innerTop = top + outline;
        float s2 = (left + bw) - outline;
        float blockW2 = (top + bh) - outline;
        float availW2 = left + bw;
        this.rect.set(left, top, availW2, top + bh);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(this.cfg.getBorder().toColorInt());
        c.drawRoundRect(this.rect, radius, radius, this.paint);
        this.rect.set(innerLeft, innerTop, s2, blockW2);
        this.paint.setColor(this.cfg.getHpBg().toColorInt());
        float innerRad = Math.max(0.0f, radius - outline);
        c.drawRoundRect(this.rect, innerRad, innerRad, this.paint);
        float fillW = this.rect.width() * RangesKt___RangesKt.coerceIn(this.hpPct, 0.0f, 1.0f);
        RectF r2 = new RectF(this.rect.left, this.rect.top, this.rect.left + fillW, this.rect.bottom);
        this.paint.setColor(this.cfg.getHpFill().toColorInt());
        c.save();
        c.clipRect(this.rect.left, this.rect.top, this.rect.right, this.rect.bottom);
        c.drawRoundRect(r2, innerRad, innerRad, this.paint);
        c.restore();
        if (this.cfg.getShowHpText()) {
            this.textPaint.setColor(this.cfg.getHpText().toColorInt());
            this.textPaint.setTextSize(this.rect.height() * 0.55f);
            String text = MathKt__MathJVMKt.roundToInt(this.hpPct * 100) + " HP";
            float tw = this.textPaint.measureText(text);
            float tx = this.rect.centerX() - (tw / 2.0f);
            float ty = this.rect.centerY() - ((this.textPaint.descent() + this.textPaint.ascent()) / 2.0f);
            c.drawText(text, tx, ty, this.textPaint);
        }
        RectF r3 = this.rect;
        float topArmor = r3.bottom + armorGap + outline;
        float bottomArmor = topArmor + bh;
        this.paint.setColor(this.cfg.getBorder().toColorInt());
        c.drawRoundRect(new RectF(left, topArmor - outline, left + bw, bottomArmor + outline), radius, radius, this.paint);
        RectF armorInner = new RectF(innerLeft, topArmor, s2, bottomArmor);
        this.paint.setColor(this.cfg.getArmorBg().toColorInt());
        c.drawRoundRect(armorInner, innerRad, innerRad, this.paint);
        float fWidth = armorInner.width();
        float innerRight = RangesKt___RangesKt.coerceIn(this.arPct, 0.0f, 1.0f);
        float arFillW = fWidth * innerRight;
        RectF arRect = new RectF(armorInner.left, armorInner.top, armorInner.left + arFillW, armorInner.bottom);
        this.paint.setColor(this.cfg.getArmorFill().toColorInt());
        c.save();
        c.clipRect(armorInner);
        c.drawRoundRect(arRect, innerRad, innerRad, this.paint);
        c.restore();
    }
}
