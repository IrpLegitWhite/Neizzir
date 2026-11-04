package com.blackhub.bronline.neizzir.gui.editor;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.ComposerKt;
import androidx.core.app.NotificationCompat;
import com.blackhub.bronline.game.core.constants.Other;
import com.blackhub.bronline.game.core.constants.TimeConstants;
import com.google.firebase.messaging.Constants;
import com.helpshift.proactive.InAppViewConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__ReversedViewsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;

/* JADX INFO: compiled from: GuiHudPreviewView.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001wB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010>\u001a\u00020\u0017H\u0002J(\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000bH\u0002J(\u0010E\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u0002032\u0006\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020$H\u0002J\u0018\u0010K\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u000203H\u0002J\u0018\u0010L\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u000203H\u0002J\u0018\u0010M\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u000203H\u0002J\u0018\u0010N\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u000203H\u0002J\u0018\u0010O\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u000203H\u0002J\u0018\u0010P\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010Q\u001a\u00020@H\u0002J(\u0010R\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u0002032\u0006\u0010S\u001a\u00020$2\u0006\u0010J\u001a\u00020$H\u0002J \u0010T\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u0002032\u0006\u0010J\u001a\u00020$H\u0002J\u0018\u0010U\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u000203H\u0002J\u0018\u0010V\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u000203H\u0002J\u0018\u0010W\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u000203H\u0002J\u0018\u0010X\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u000203H\u0002J \u0010Y\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u0002032\u0006\u0010Z\u001a\u00020$H\u0002J0\u0010[\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010\\\u001a\u00020$2\u0006\u0010A\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\bH\u0002J \u0010^\u001a\u00020_2\u0006\u0010F\u001a\u00020G2\u0006\u0010S\u001a\u00020$2\u0006\u0010`\u001a\u00020@H\u0002J\u0018\u0010a\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u000203H\u0002J0\u0010b\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010c\u001a\u00020@2\u0006\u0010d\u001a\u00020$2\u0006\u0010e\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\bH\u0002J\u001a\u0010f\u001a\u0004\u0018\u0001032\u0006\u0010A\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u000bH\u0002J \u0010g\u001a\u00020_2\u0006\u0010H\u001a\u0002032\u0006\u0010A\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u000bH\u0002J\u0010\u0010h\u001a\u00020\u00172\u0006\u0010F\u001a\u00020GH\u0014J\u0010\u0010i\u001a\u00020_2\u0006\u0010j\u001a\u00020kH\u0016J\u001a\u0010l\u001a\u00020m2\b\u0010'\u001a\u0004\u0018\u00010$2\u0006\u0010n\u001a\u00020mH\u0002J\u0010\u0010c\u001a\u00020@2\u0006\u0010H\u001a\u000203H\u0002J\u0010\u0010o\u001a\u00020@2\u0006\u0010c\u001a\u00020@H\u0002J$\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0q2\u0006\u0010A\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u000bH\u0002J \u0010r\u001a\u00020\u000b2\u0006\u0010H\u001a\u0002032\u0006\u0010Z\u001a\u00020$2\u0006\u0010n\u001a\u00020\u000bH\u0002J\u0010\u0010s\u001a\u00020\u00172\u0006\u0010t\u001a\u000203H\u0002J\u001a\u0010u\u001a\u00020\u00172\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002030\u001dR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010#\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R$\u0010(\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u001e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u00020$2\u0006\u0010'\u001a\u00020$@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R<\u00109\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u000208072\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020807@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006x"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudPreviewView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bgPaint", "Landroid/graphics/Paint;", "bitmapPaint", "designScale", "", "dragStartX", "dragStartY", "fillPaint", "gridPaint", "handlePaint", "mode", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudPreviewView$Mode;", "offsetX", "offsetY", "onBeforeUserChange", "Lkotlin/Function0;", "", "getOnBeforeUserChange", "()Lkotlin/jvm/functions/Function0;", "setOnBeforeUserChange", "(Lkotlin/jvm/functions/Function0;)V", "onPatchChanged", "Lkotlin/Function1;", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudPatch;", "getOnPatchChanged", "()Lkotlin/jvm/functions/Function1;", "setOnPatchChanged", "(Lkotlin/jvm/functions/Function1;)V", "onSelectionChanged", "", "getOnSelectionChanged", "setOnSelectionChanged", "value", "patch", "getPatch", "()Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudPatch;", "setPatch", "(Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudPatch;)V", "selectedId", "getSelectedId", "()Ljava/lang/String;", "setSelectedId", "(Ljava/lang/String;)V", "startElement", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudElementPatch;", "strokePaint", "subTextPaint", "textPaint", "", "Landroid/graphics/Bitmap;", "textureBitmaps", "getTextureBitmaps", "()Ljava/util/Map;", "setTextureBitmaps", "(Ljava/util/Map;)V", "computeTransform", "designRect", "Landroid/graphics/RectF;", "x", "y", InAppViewConstants.WIDTH, InAppViewConstants.HEIGHT, "drawBox", "canvas", "Landroid/graphics/Canvas;", "element", "color", Constants.ScionAnalytics.PARAM_LABEL, "drawButtons", "drawChat", "drawCrosshair", "drawDailyCase", "drawElement", "drawGrid", "bounds", "drawIcon", "path", "drawLabel", "drawMoneyValue", "drawRadar", "drawSelection", "drawSpeedometer", "drawStraightBar", "key", "drawText", "text", "paint", "drawTexture", "", "dest", "drawWeapon", "drawWeaponShape", "rect", "shape", InAppViewConstants.RADIUS, "hitTest", "isInResizeHandle", "onDraw", "onTouchEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "parseColor", "", Other.FALLBACK, "resizeHandle", "screenToDesign", "Lkotlin/Pair;", "styleFloat", "updateElement", "updated", "updateSelected", "transform", "Mode", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class GuiHudPreviewView extends View {
    private final Paint bgPaint;
    private final Paint bitmapPaint;
    private float designScale;
    private float dragStartX;
    private float dragStartY;
    private final Paint fillPaint;
    private final Paint gridPaint;
    private final Paint handlePaint;
    private Mode mode;
    private float offsetX;
    private float offsetY;
    private Function0<Unit> onBeforeUserChange;
    private Function1<? super GuiHudPatch, Unit> onPatchChanged;
    private Function1<? super String, Unit> onSelectionChanged;
    private GuiHudPatch patch;
    private String selectedId;
    private GuiHudElementPatch startElement;
    private final Paint strokePaint;
    private final Paint subTextPaint;
    private final Paint textPaint;
    private Map<String, Bitmap> textureBitmaps;

    /* JADX INFO: compiled from: GuiHudPreviewView.kt */
    @Metadata(m4415d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudPreviewView$Mode;", "", "(Ljava/lang/String;I)V", "NONE", "MOVE", "RESIZE", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private enum Mode {
        NONE,
        MOVE,
        RESIZE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        public static EnumEntries<Mode> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: GuiHudPreviewView.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.MOVE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Mode.RESIZE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Mode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RadarShape.values().length];
            try {
                iArr2[RadarShape.ROUND.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr2[RadarShape.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr2[RadarShape.ROUNDED.ordinal()] = 3;
            } catch (NoSuchFieldError e6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuiHudPreviewView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GuiHudPreviewView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuiHudPreviewView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        this.patch = new GuiHudPatch((RadarShape) null, (RadarBarsShape) null, (List) null, 7, (DefaultConstructorMarker) null);
        this.selectedId = GuiHudElementIds.RADAR;
        this.textureBitmaps = MapsKt__MapsKt.emptyMap();
        Paint $this$bgPaint_u24lambda_u240 = new Paint(1);
        $this$bgPaint_u24lambda_u240.setColor(Color.rgb(9, 12, 18));
        this.bgPaint = $this$bgPaint_u24lambda_u240;
        Paint $this$gridPaint_u24lambda_u241 = new Paint(1);
        $this$gridPaint_u24lambda_u241.setColor(Color.argb(42, 255, 255, 255));
        $this$gridPaint_u24lambda_u241.setStrokeWidth(1.0f);
        this.gridPaint = $this$gridPaint_u24lambda_u241;
        Paint $this$textPaint_u24lambda_u242 = new Paint(1);
        $this$textPaint_u24lambda_u242.setColor(-1);
        $this$textPaint_u24lambda_u242.setTextSize(24.0f);
        $this$textPaint_u24lambda_u242.setTypeface(Typeface.DEFAULT_BOLD);
        this.textPaint = $this$textPaint_u24lambda_u242;
        Paint $this$subTextPaint_u24lambda_u243 = new Paint(1);
        $this$subTextPaint_u24lambda_u243.setColor(Color.argb(190, 255, 255, 255));
        $this$subTextPaint_u24lambda_u243.setTextSize(18.0f);
        this.subTextPaint = $this$subTextPaint_u24lambda_u243;
        this.fillPaint = new Paint(1);
        Paint $this$strokePaint_u24lambda_u244 = new Paint(1);
        $this$strokePaint_u24lambda_u244.setStyle(Paint.Style.STROKE);
        $this$strokePaint_u24lambda_u244.setStrokeWidth(3.0f);
        $this$strokePaint_u24lambda_u244.setColor(-1);
        this.strokePaint = $this$strokePaint_u24lambda_u244;
        Paint $this$handlePaint_u24lambda_u245 = new Paint(1);
        $this$handlePaint_u24lambda_u245.setStyle(Paint.Style.FILL);
        $this$handlePaint_u24lambda_u245.setColor(Color.rgb(0, 229, ComposerKt.providerMapsKey));
        this.handlePaint = $this$handlePaint_u24lambda_u245;
        this.bitmapPaint = new Paint(3);
        this.designScale = 1.0f;
        this.mode = Mode.NONE;
    }

    public final GuiHudPatch getPatch() {
        return this.patch;
    }

    public final void setPatch(GuiHudPatch value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.patch = GuiHudDefaults.INSTANCE.normalize(value);
        invalidate();
    }

    public final String getSelectedId() {
        return this.selectedId;
    }

    public final void setSelectedId(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.selectedId = value;
        invalidate();
    }

    public final Map<String, Bitmap> getTextureBitmaps() {
        return this.textureBitmaps;
    }

    public final void setTextureBitmaps(Map<String, Bitmap> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.textureBitmaps = value;
        invalidate();
    }

    public final Function0<Unit> getOnBeforeUserChange() {
        return this.onBeforeUserChange;
    }

    public final void setOnBeforeUserChange(Function0<Unit> function0) {
        this.onBeforeUserChange = function0;
    }

    public final Function1<GuiHudPatch, Unit> getOnPatchChanged() {
        return this.onPatchChanged;
    }

    public final void setOnPatchChanged(Function1<? super GuiHudPatch, Unit> function1) {
        this.onPatchChanged = function1;
    }

    public final Function1<String, Unit> getOnSelectionChanged() {
        return this.onSelectionChanged;
    }

    public final void setOnSelectionChanged(Function1<? super String, Unit> function1) {
        this.onSelectionChanged = function1;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        computeTransform();
        canvas.drawColor(Color.rgb(6, 8, 13));
        RectF bounds = designRect(0.0f, 0.0f, 1920.0f, 1080.0f);
        canvas.drawRoundRect(bounds, 18.0f, 18.0f, this.bgPaint);
        drawGrid(canvas, bounds);
        Iterable $this$forEach$iv = this.patch.getElements();
        for (Object element$iv : $this$forEach$iv) {
            GuiHudElementPatch it = (GuiHudElementPatch) element$iv;
            drawElement(canvas, it);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        GuiHudElementPatch guiHudElementPatchCopy;
        Intrinsics.checkNotNullParameter(event, "event");
        Pair<Float, Float> pairScreenToDesign = screenToDesign(event.getX(), event.getY());
        switch (event.getActionMasked()) {
            case 0:
                GuiHudElementPatch hit = hitTest(pairScreenToDesign.getFirst().floatValue(), pairScreenToDesign.getSecond().floatValue());
                if (hit == null) {
                    return true;
                }
                setSelectedId(hit.getId());
                Function1<? super String, Unit> function1 = this.onSelectionChanged;
                if (function1 != null) {
                    function1.invoke(hit.getId());
                }
                Function0<Unit> function0 = this.onBeforeUserChange;
                if (function0 != null) {
                    function0.invoke();
                }
                this.dragStartX = pairScreenToDesign.getFirst().floatValue();
                this.dragStartY = pairScreenToDesign.getSecond().floatValue();
                this.startElement = hit;
                this.mode = isInResizeHandle(hit, pairScreenToDesign.getFirst().floatValue(), pairScreenToDesign.getSecond().floatValue()) ? Mode.RESIZE : Mode.MOVE;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                return true;
            case 1:
            case 3:
                this.mode = Mode.NONE;
                this.startElement = null;
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                }
                return true;
            case 2:
                GuiHudElementPatch start = this.startElement;
                if (start == null) {
                    return true;
                }
                float dx = pairScreenToDesign.getFirst().floatValue() - this.dragStartX;
                float dy = pairScreenToDesign.getSecond().floatValue() - this.dragStartY;
                switch (WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()]) {
                    case 1:
                        guiHudElementPatchCopy = start.copy((71 & 1) != 0 ? start.id : null, (71 & 2) != 0 ? start.x : RangesKt___RangesKt.coerceIn(start.getX() + dx, 0.0f, 1900.0f), (71 & 4) != 0 ? start.y : RangesKt___RangesKt.coerceIn(start.getY() + dy, 0.0f, 1060.0f), (71 & 8) != 0 ? start.width : 0.0f, (71 & 16) != 0 ? start.height : 0.0f, (71 & 32) != 0 ? start.scale : 0.0f, (71 & 64) != 0 ? start.visible : false, (71 & 128) != 0 ? start.colorOverrides : null);
                        break;
                    case 2:
                        guiHudElementPatchCopy = start.copy((71 & 1) != 0 ? start.id : null, (71 & 2) != 0 ? start.x : 0.0f, (71 & 4) != 0 ? start.y : 0.0f, (71 & 8) != 0 ? start.width : RangesKt___RangesKt.coerceIn(start.getWidth() + dx, 30.0f, 1920.0f), (71 & 16) != 0 ? start.height : RangesKt___RangesKt.coerceIn(start.getHeight() + dy, 30.0f, 1080.0f), (71 & 32) != 0 ? start.scale : 0.0f, (71 & 64) != 0 ? start.visible : false, (71 & 128) != 0 ? start.colorOverrides : null);
                        break;
                    case 3:
                        guiHudElementPatchCopy = start;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                updateElement(guiHudElementPatchCopy);
                return true;
            default:
                return true;
        }
    }

    public final void updateSelected(Function1<? super GuiHudElementPatch, GuiHudElementPatch> transform) {
        Object element$iv;
        GuiHudElementPatch it;
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterable $this$firstOrNull$iv = this.patch.getElements();
        Iterator it2 = $this$firstOrNull$iv.iterator();
        do {
            if (!it2.hasNext()) {
                element$iv = null;
                break;
            } else {
                element$iv = it2.next();
                it = (GuiHudElementPatch) element$iv;
            }
        } while (!Intrinsics.areEqual(it.getId(), this.selectedId));
        GuiHudElementPatch current = (GuiHudElementPatch) element$iv;
        if (current == null) {
            return;
        }
        updateElement(transform.invoke(current));
    }

    private final void updateElement(GuiHudElementPatch updated) {
        GuiHudPatch guiHudPatch = this.patch;
        Iterable $this$map$iv = this.patch.getElements();
        Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            GuiHudElementPatch it = (GuiHudElementPatch) item$iv$iv;
            if (Intrinsics.areEqual(it.getId(), updated.getId())) {
                it = updated;
            }
            destination$iv$iv.add(it);
        }
        setPatch(GuiHudPatch.copy$default(guiHudPatch, null, null, (List) destination$iv$iv, 3, null));
        Function1<? super GuiHudPatch, Unit> function1 = this.onPatchChanged;
        if (function1 != null) {
            function1.invoke(this.patch);
        }
    }

    private final void drawGrid(Canvas canvas, RectF bounds) {
        float step = this.designScale * 120.0f;
        for (float x = bounds.left; x <= bounds.right; x += step) {
            canvas.drawLine(x, bounds.top, x, bounds.bottom, this.gridPaint);
        }
        for (float y = bounds.top; y <= bounds.bottom; y += step) {
            canvas.drawLine(bounds.left, y, bounds.right, y, this.gridPaint);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x00ea  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void drawElement(Canvas canvas, GuiHudElementPatch element) {
        if (element.getVisible()) {
            if ((Intrinsics.areEqual(element.getId(), GuiHudElementIds.HP_BAR) || Intrinsics.areEqual(element.getId(), GuiHudElementIds.ARMOR_BAR)) && this.patch.getRadarBarsShape() != RadarBarsShape.STRAIGHT) {
                return;
            }
            String id = element.getId();
            switch (id.hashCode()) {
                case -2127960639:
                    if (!id.equals(GuiHudElementIds.HP_ICON)) {
                        drawBox(canvas, element, "#263241", element.getId());
                    } else {
                        drawIcon(canvas, element, "Hud/Images/Radar/hp_icon.btx", "HP");
                    }
                    break;
                case -1707954628:
                    if (!id.equals(GuiHudElementIds.WEAPON)) {
                        drawBox(canvas, element, "#263241", element.getId());
                    } else {
                        drawWeapon(canvas, element);
                    }
                    break;
                case -893989854:
                    if (!id.equals(GuiHudElementIds.CROSSHAIR)) {
                        drawBox(canvas, element, "#263241", element.getId());
                    } else {
                        drawCrosshair(canvas, element);
                    }
                    break;
                case 2099064:
                    if (!id.equals(GuiHudElementIds.CHAT)) {
                        drawBox(canvas, element, "#263241", element.getId());
                    } else {
                        drawChat(canvas, element);
                    }
                    break;
                case 78717670:
                    if (!id.equals(GuiHudElementIds.RADAR)) {
                        drawBox(canvas, element, "#263241", element.getId());
                    } else {
                        drawRadar(canvas, element);
                    }
                    break;
                case 396953549:
                    if (!id.equals(GuiHudElementIds.MONEY_VALUE)) {
                        drawBox(canvas, element, "#263241", element.getId());
                    } else {
                        drawMoneyValue(canvas, element);
                    }
                    break;
                case 474024044:
                    if (!id.equals(GuiHudElementIds.ARMOR_BAR)) {
                        drawBox(canvas, element, "#263241", element.getId());
                    } else if (this.patch.getRadarBarsShape() == RadarBarsShape.STRAIGHT) {
                        drawStraightBar(canvas, element, "armor");
                    }
                    break;
                case 805451977:
                    if (!id.equals(GuiHudElementIds.DAILY_CASE)) {
                        drawBox(canvas, element, "#263241", element.getId());
                    } else {
                        drawDailyCase(canvas, element);
                    }
                    break;
                case 830503480:
                    if (!id.equals(GuiHudElementIds.ARMOR_ICON)) {
                        drawBox(canvas, element, "#263241", element.getId());
                    } else {
                        drawIcon(canvas, element, "Hud/Images/Radar/armor_icon.btx", "Armor");
                    }
                    break;
                case 1523025781:
                    if (!id.equals(GuiHudElementIds.HP_BAR)) {
                        drawBox(canvas, element, "#263241", element.getId());
                    } else if (this.patch.getRadarBarsShape() == RadarBarsShape.STRAIGHT) {
                        drawStraightBar(canvas, element, "hp");
                    }
                    break;
                case 1656962810:
                    if (!id.equals(GuiHudElementIds.SPEEDOMETER)) {
                        drawBox(canvas, element, "#263241", element.getId());
                    } else {
                        drawSpeedometer(canvas, element);
                    }
                    break;
                default:
                    drawBox(canvas, element, "#263241", element.getId());
                    break;
            }
            if (Intrinsics.areEqual(element.getId(), this.selectedId)) {
                drawSelection(canvas, element);
            }
        }
    }

    private final void drawRadar(Canvas canvas, GuiHudElementPatch element) {
        RectF rect = rect(element);
        this.fillPaint.setStyle(Paint.Style.FILL);
        this.fillPaint.setColor(Color.rgb(22, 32, 41));
        RectF mapRect = new RectF(rect.left + (rect.width() * 0.12f), rect.top + (rect.height() * 0.12f), rect.right - (rect.width() * 0.12f), rect.bottom - (rect.height() * 0.12f));
        switch (WhenMappings.$EnumSwitchMapping$1[this.patch.getRadarShape().ordinal()]) {
            case 1:
                canvas.drawOval(mapRect, this.fillPaint);
                break;
            case 2:
                canvas.drawRect(mapRect, this.fillPaint);
                break;
            case 3:
                canvas.drawRoundRect(mapRect, this.designScale * 28.0f, this.designScale * 28.0f, this.fillPaint);
                break;
        }
        this.strokePaint.setColor(parseColor(element.getColorOverrides().get("border"), -1));
        this.strokePaint.setStrokeWidth(this.designScale * 3.0f);
        switch (WhenMappings.$EnumSwitchMapping$1[this.patch.getRadarShape().ordinal()]) {
            case 1:
                canvas.drawOval(mapRect, this.strokePaint);
                break;
            case 2:
                canvas.drawRect(mapRect, this.strokePaint);
                break;
            case 3:
                canvas.drawRoundRect(mapRect, this.designScale * 28.0f, this.designScale * 28.0f, this.strokePaint);
                break;
        }
        if (this.patch.getRadarBarsShape() != RadarBarsShape.STRAIGHT) {
            this.strokePaint.setStrokeWidth(this.designScale * 8.0f);
            this.strokePaint.setColor(parseColor(element.getColorOverrides().get("hp"), Color.rgb(254, 65, 65)));
            canvas.drawArc(new RectF(rect.left + (this.designScale * 6.0f), rect.top + (this.designScale * 12.0f), rect.right - (this.designScale * 18.0f), rect.bottom - (this.designScale * 2.0f)), 120.0f, 130.0f, false, this.strokePaint);
            this.strokePaint.setColor(parseColor(element.getColorOverrides().get("armor"), Color.rgb(84, 75, 191)));
            canvas.drawArc(new RectF(rect.left + (this.designScale * 18.0f), rect.top + (this.designScale * 10.0f), rect.right - (this.designScale * 6.0f), rect.bottom - (this.designScale * 8.0f)), 280.0f, 115.0f, false, this.strokePaint);
        }
        drawLabel(canvas, element, GuiHudElementIds.RADAR);
    }

    private final void drawIcon(Canvas canvas, GuiHudElementPatch element, String path, String label) {
        RectF dest = rect(element);
        if (!drawTexture(canvas, path, dest)) {
            this.fillPaint.setStyle(Paint.Style.FILL);
            this.fillPaint.setColor(Color.argb(110, 255, 255, 255));
            canvas.drawOval(dest, this.fillPaint);
            drawText(canvas, StringsKt___StringsKt.take(label, 1), dest.centerX() - (this.designScale * 6.0f), dest.centerY() + (this.designScale * 7.0f), this.subTextPaint);
        }
        drawLabel(canvas, element, label);
    }

    private final void drawStraightBar(Canvas canvas, GuiHudElementPatch element, String key) {
        RectF bar = rect(element);
        float radius = styleFloat(element, InAppViewConstants.RADIUS, 4.0f) * this.designScale;
        float borderWidth = styleFloat(element, "borderWidth", 0.0f) * this.designScale;
        this.fillPaint.setStyle(Paint.Style.FILL);
        this.fillPaint.setColor(parseColor(element.getColorOverrides().get("background"), Color.argb(112, 0, 0, 0)));
        canvas.drawRoundRect(bar, radius, radius, this.fillPaint);
        RectF fillBar = new RectF(bar.left + borderWidth, bar.top + borderWidth, bar.right - borderWidth, bar.bottom - borderWidth);
        float fillRadius = RangesKt___RangesKt.coerceAtLeast(radius - borderWidth, 0.0f);
        this.fillPaint.setColor(Intrinsics.areEqual(key, "hp") ? parseColor(element.getColorOverrides().get("hp"), Color.rgb(254, 65, 65)) : parseColor(element.getColorOverrides().get("armor"), Color.rgb(84, 75, 191)));
        canvas.drawRoundRect(fillBar, fillRadius, fillRadius, this.fillPaint);
        if (borderWidth > 0.0f) {
            this.strokePaint.setColor(parseColor(element.getColorOverrides().get("border"), 0));
            this.strokePaint.setStrokeWidth(borderWidth);
            canvas.drawRoundRect(bar, radius, radius, this.strokePaint);
        }
        drawLabel(canvas, element, Intrinsics.areEqual(key, "hp") ? "HP" : "Armor");
    }

    private final void drawChat(Canvas canvas, GuiHudElementPatch element) {
        RectF rect = rect(element);
        this.fillPaint.setStyle(Paint.Style.FILL);
        this.fillPaint.setColor(Color.argb(120, 38, 40, 55));
        canvas.drawRoundRect(rect, this.designScale * 12.0f, this.designScale * 12.0f, this.fillPaint);
        drawText(canvas, "RP chat message preview", rect.left + (this.designScale * 20.0f), rect.top + (this.designScale * 42.0f), this.textPaint);
        drawText(canvas, "NRP chat line preview", rect.left + (this.designScale * 20.0f), rect.top + (this.designScale * 78.0f), this.subTextPaint);
        drawLabel(canvas, element, GuiHudElementIds.CHAT);
    }

    private final void drawMoneyValue(Canvas canvas, GuiHudElementPatch element) {
        RectF rect = rect(element);
        if (!Intrinsics.areEqual(element.getColorOverrides().get("backgroundVisible"), CommonUrlParts.Values.FALSE_INTEGER)) {
            this.fillPaint.setStyle(Paint.Style.FILL);
            this.fillPaint.setColor(Color.argb(TimeConstants.ANIMATE_DURATION_DEFAULT, 38, 40, 55));
            canvas.drawRoundRect(rect, this.designScale * 12.0f, this.designScale * 12.0f, this.fillPaint);
        }
        int old = this.textPaint.getColor();
        this.textPaint.setColor(parseColor(element.getColorOverrides().get("money"), -1));
        drawText(canvas, "990000 RUB", rect.left + (this.designScale * 46.0f), rect.centerY() + (this.designScale * 8.0f), this.textPaint);
        this.textPaint.setColor(old);
        drawLabel(canvas, element, "Money");
    }

    private final void drawDailyCase(Canvas canvas, GuiHudElementPatch element) {
        RectF rect = rect(element);
        if (!drawTexture(canvas, "Hud/Images/Buttons/old_daily_case.btx", rect)) {
            this.fillPaint.setStyle(Paint.Style.FILL);
            this.fillPaint.setColor(Color.argb(140, 38, 40, 55));
            canvas.drawRoundRect(rect, this.designScale * 10.0f, this.designScale * 10.0f, this.fillPaint);
            drawText(canvas, "Case", rect.left + (this.designScale * 18.0f), rect.centerY() + (this.designScale * 8.0f), this.textPaint);
        }
        drawLabel(canvas, element, "Daily");
    }

    private final void drawSpeedometer(Canvas canvas, GuiHudElementPatch element) {
        RectF rect = rect(element);
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        float radius = Math.min(rect.width(), rect.height()) * 0.42f;
        this.fillPaint.setStyle(Paint.Style.FILL);
        this.fillPaint.setColor(Color.argb(100, 0, 0, 0));
        canvas.drawCircle(centerX, centerY, radius, this.fillPaint);
        drawTexture(canvas, "Hud/Images/Speedometer/scale.btx", new RectF(centerX - radius, centerY - radius, centerX + radius, centerY + radius));
        drawTexture(canvas, "Hud/Images/Speedometer/left.btx", new RectF(rect.left + (this.designScale * 8.0f), centerY - (this.designScale * 34.0f), rect.left + (this.designScale * 138.0f), (this.designScale * 30.0f) + centerY));
        drawTexture(canvas, "Hud/Images/Speedometer/right.btx", new RectF(rect.right - (this.designScale * 138.0f), centerY - (this.designScale * 34.0f), rect.right - (this.designScale * 8.0f), (this.designScale * 30.0f) + centerY));
        drawTexture(canvas, "Hud/Images/Speedometer/engine.btx", new RectF(centerX - (this.designScale * 126.0f), rect.bottom - (this.designScale * 48.0f), centerX - (this.designScale * 86.0f), rect.bottom - (this.designScale * 8.0f)));
        drawTexture(canvas, "Hud/Images/Speedometer/fuel.btx", new RectF((this.designScale * 86.0f) + centerX, rect.bottom - (this.designScale * 48.0f), (this.designScale * 126.0f) + centerX, rect.bottom - (this.designScale * 8.0f)));
        this.strokePaint.setStyle(Paint.Style.STROKE);
        this.strokePaint.setStrokeWidth(this.designScale * 8.0f);
        this.strokePaint.setColor(parseColor(element.getColorOverrides().get("speed"), Color.rgb(247, 85, 20)));
        canvas.drawArc(new RectF(centerX - radius, centerY - radius, centerX + radius, centerY + radius), 130.0f, 260.0f, false, this.strokePaint);
        drawText(canvas, "120", centerX - (this.designScale * 28.0f), centerY + (this.designScale * 8.0f), this.textPaint);
        drawLabel(canvas, element, "Speedometer");
    }

    private final void drawButtons(Canvas canvas, GuiHudElementPatch element) {
        List points = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m4423to(Float.valueOf(150.0f), Float.valueOf(700.0f)), TuplesKt.m4423to(Float.valueOf(310.0f), Float.valueOf(830.0f)), TuplesKt.m4423to(Float.valueOf(1560.0f), Float.valueOf(760.0f)), TuplesKt.m4423to(Float.valueOf(1700.0f), Float.valueOf(620.0f)), TuplesKt.m4423to(Float.valueOf(1380.0f), Float.valueOf(880.0f))});
        this.fillPaint.setStyle(Paint.Style.FILL);
        this.fillPaint.setColor(Color.argb(110, 255, 255, 255));
        this.strokePaint.setColor(Color.argb(210, 255, 255, 255));
        this.strokePaint.setStrokeWidth(this.designScale * 2.0f);
        List icons = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Hud/Images/Buttons/old_inventory.btx", "Hud/Images/Buttons/old_tablet.btx", "Hud/Images/Buttons/old_store.btx", "Hud/Images/Buttons/old_exit.btx", "Hud/Images/Buttons/old_mission.btx"});
        List $this$forEachIndexed$iv = points;
        int $i$f$forEachIndexed = 0;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int index$iv2 = index$iv + 1;
            if (index$iv < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Pair point = (Pair) item$iv;
            int index = index$iv;
            float cx = this.offsetX + (((Number) point.getFirst()).floatValue() * this.designScale);
            float cy = this.offsetY + (((Number) point.getSecond()).floatValue() * this.designScale);
            Iterable $this$forEachIndexed$iv2 = $this$forEachIndexed$iv;
            List points2 = points;
            int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
            RectF iconRect = new RectF(cx - (this.designScale * 42.0f), cy - (this.designScale * 42.0f), (this.designScale * 42.0f) + cx, (this.designScale * 42.0f) + cy);
            if (!drawTexture(canvas, "Hud/Images/Buttons/old_button_shadow.btx", iconRect)) {
                canvas.drawCircle(cx, cy, this.designScale * 42.0f, this.fillPaint);
            }
            String str = (String) CollectionsKt___CollectionsKt.getOrNull(icons, index);
            if (str == null) {
                str = "";
            }
            List icons2 = icons;
            if (!drawTexture(canvas, str, new RectF(cx - (this.designScale * 28.0f), cy - (this.designScale * 28.0f), (this.designScale * 28.0f) + cx, (this.designScale * 28.0f) + cy))) {
                canvas.drawCircle(cx, cy, this.designScale * 42.0f, this.strokePaint);
                drawText(canvas, String.valueOf(index + 1), cx - (this.designScale * 7.0f), cy + (this.designScale * 8.0f), this.subTextPaint);
            }
            index$iv = index$iv2;
            $this$forEachIndexed$iv = $this$forEachIndexed$iv2;
            points = points2;
            $i$f$forEachIndexed = $i$f$forEachIndexed2;
            icons = icons2;
        }
        if (Intrinsics.areEqual(element.getId(), this.selectedId)) {
            drawSelection(canvas, element);
        }
    }

    private final void drawCrosshair(Canvas canvas, GuiHudElementPatch element) {
        RectF rect = rect(element);
        boolean plus = drawTexture(canvas, "Hud/Images/Crosshair/sniper_plus.btx", new RectF(rect.centerX() - (this.designScale * 26.0f), rect.top, rect.centerX() + (this.designScale * 26.0f), rect.top + (this.designScale * 52.0f)));
        boolean minus = drawTexture(canvas, "Hud/Images/Crosshair/sniper_minus.btx", new RectF(rect.centerX() - (this.designScale * 26.0f), rect.bottom - (this.designScale * 52.0f), rect.centerX() + (this.designScale * 26.0f), rect.bottom));
        if (plus || minus) {
            drawLabel(canvas, element, "Crosshair");
            return;
        }
        this.strokePaint.setColor(-1);
        this.strokePaint.setStrokeWidth(this.designScale * 3.0f);
        canvas.drawLine(rect.centerX() - (rect.width() * 0.35f), rect.centerY(), (rect.width() * 0.35f) + rect.centerX(), rect.centerY(), this.strokePaint);
        canvas.drawLine(rect.centerX(), rect.centerY() - (rect.height() * 0.35f), rect.centerX(), (rect.height() * 0.35f) + rect.centerY(), this.strokePaint);
        drawLabel(canvas, element, "Crosshair");
    }

    private final void drawWeapon(Canvas canvas, GuiHudElementPatch element) {
        RectF rect = rect(element);
        float visualSize = Math.min(rect.width(), rect.height()) * 0.73f;
        RectF backgroundRect = new RectF(rect.centerX() - (visualSize / 2.0f), rect.centerY() - (visualSize / 2.0f), rect.centerX() + (visualSize / 2.0f), rect.centerY() + (visualSize / 2.0f));
        float radius = styleFloat(element, InAppViewConstants.RADIUS, 16.0f) * this.designScale;
        float borderWidth = styleFloat(element, "borderWidth", 2.0f) * this.designScale;
        String str = element.getColorOverrides().get("shape");
        if (str == null) {
            str = "round";
        }
        String shape = str;
        if (!Intrinsics.areEqual(element.getColorOverrides().get("backgroundVisible"), CommonUrlParts.Values.FALSE_INTEGER)) {
            this.fillPaint.setStyle(Paint.Style.FILL);
            this.fillPaint.setColor(parseColor(element.getColorOverrides().get("background"), Color.argb(153, 38, 40, 55)));
            drawWeaponShape(canvas, backgroundRect, shape, radius, this.fillPaint);
        }
        if (borderWidth > 0.0f) {
            this.strokePaint.setColor(parseColor(element.getColorOverrides().get("border"), -1));
            this.strokePaint.setStrokeWidth(borderWidth);
            drawWeaponShape(canvas, backgroundRect, shape, radius, this.strokePaint);
        }
        float iconSize = Math.min(rect.width(), rect.height()) * 0.8f;
        RectF iconRect = new RectF(rect.centerX() - (iconSize / 2.0f), rect.centerY() - (iconSize / 2.0f), rect.centerX() + (iconSize / 2.0f), rect.centerY() + (iconSize / 2.0f));
        if (!drawTexture(canvas, "Hud/Images/Weapons/ak47.btx", iconRect)) {
            drawText(canvas, "AK", rect.centerX() - (this.designScale * 16.0f), rect.centerY() + (this.designScale * 8.0f), this.textPaint);
        }
    }

    private final void drawWeaponShape(Canvas canvas, RectF rect, String shape, float radius, Paint paint) {
        if (!Intrinsics.areEqual(shape, "square")) {
            if (!Intrinsics.areEqual(shape, "rounded")) {
                canvas.drawOval(rect, paint);
                return;
            } else {
                canvas.drawRoundRect(rect, radius, radius, paint);
                return;
            }
        }
        canvas.drawRect(rect, paint);
    }

    private final void drawBox(Canvas canvas, GuiHudElementPatch element, String color, String label) {
        this.fillPaint.setStyle(Paint.Style.FILL);
        this.fillPaint.setColor(Color.parseColor(color));
        canvas.drawRoundRect(rect(element), this.designScale * 8.0f, this.designScale * 8.0f, this.fillPaint);
        drawLabel(canvas, element, label);
    }

    private final void drawSelection(Canvas canvas, GuiHudElementPatch element) {
        RectF rect = rect(element);
        this.strokePaint.setColor(Color.rgb(0, 229, ComposerKt.providerMapsKey));
        this.strokePaint.setStrokeWidth(3.0f);
        canvas.drawRect(rect, this.strokePaint);
        RectF handle = resizeHandle(rect);
        canvas.drawRoundRect(handle, 4.0f, 4.0f, this.handlePaint);
    }

    private final void drawLabel(Canvas canvas, GuiHudElementPatch element, String label) {
        RectF rect = rect(element);
        drawText(canvas, label, rect.left + (this.designScale * 10.0f), rect.bottom - (this.designScale * 12.0f), this.subTextPaint);
    }

    private final void drawText(Canvas canvas, String text, float x, float y, Paint paint) {
        float oldSize = paint.getTextSize();
        paint.setTextSize(this.designScale * oldSize);
        canvas.drawText(text, x, y, paint);
        paint.setTextSize(oldSize);
    }

    private final boolean drawTexture(Canvas canvas, String path, RectF dest) {
        Bitmap bitmap;
        if (StringsKt__StringsKt.isBlank(path) || (bitmap = this.textureBitmaps.get(path)) == null || bitmap.isRecycled()) {
            return false;
        }
        canvas.drawBitmap(bitmap, (Rect) null, dest, this.bitmapPaint);
        return true;
    }

    private final RectF rect(GuiHudElementPatch element) {
        return designRect(element.getX(), element.getY(), element.getWidth() * element.getScale(), element.getHeight() * element.getScale());
    }

    private final RectF designRect(float x, float y, float width, float height) {
        return new RectF(this.offsetX + (this.designScale * x), this.offsetY + (this.designScale * y), this.offsetX + ((x + width) * this.designScale), this.offsetY + ((y + height) * this.designScale));
    }

    private final RectF resizeHandle(RectF rect) {
        return new RectF(rect.right - 20.0f, rect.bottom - 20.0f, rect.right + 2.0f, rect.bottom + 2.0f);
    }

    private final boolean isInResizeHandle(GuiHudElementPatch element, float x, float y) {
        float right = element.getX() + (element.getWidth() * element.getScale());
        float bottom = element.getY() + (element.getHeight() * element.getScale());
        float threshold = 40.0f / Math.max(this.designScale, 0.1f);
        return Math.abs(x - right) <= threshold && Math.abs(y - bottom) <= threshold;
    }

    private final GuiHudElementPatch hitTest(float x, float y) {
        Object element$iv;
        Iterable $this$firstOrNull$iv = CollectionsKt__ReversedViewsKt.asReversed(this.patch.getElements());
        Iterator it = $this$firstOrNull$iv.iterator();
        while (it.hasNext()) {
            element$iv = it.next();
            GuiHudElementPatch element = (GuiHudElementPatch) element$iv;
            boolean z = false;
            if ((!Intrinsics.areEqual(element.getId(), GuiHudElementIds.HP_BAR) && !Intrinsics.areEqual(element.getId(), GuiHudElementIds.ARMOR_BAR)) || this.patch.getRadarBarsShape() == RadarBarsShape.STRAIGHT) {
                float w = element.getWidth() * element.getScale();
                float h = element.getHeight() * element.getScale();
                if (x >= element.getX() && x <= element.getX() + w && y >= element.getY() && y <= element.getY() + h) {
                    z = true;
                }
            }
            if (z) {
                return (GuiHudElementPatch) element$iv;
            }
        }
        element$iv = null;
        return (GuiHudElementPatch) element$iv;
    }

    private final Pair<Float, Float> screenToDesign(float x, float y) {
        return TuplesKt.m4423to(Float.valueOf(RangesKt___RangesKt.coerceIn((x - this.offsetX) / this.designScale, 0.0f, 1920.0f)), Float.valueOf(RangesKt___RangesKt.coerceIn((y - this.offsetY) / this.designScale, 0.0f, 1080.0f)));
    }

    private final void computeTransform() {
        this.designScale = Math.min(getWidth() / 1920.0f, getHeight() / 1080.0f);
        if (this.designScale <= 0.0f) {
            this.designScale = 1.0f;
        }
        this.offsetX = (getWidth() - (this.designScale * 1920.0f)) / 2.0f;
        this.offsetY = (getHeight() - (this.designScale * 1080.0f)) / 2.0f;
    }

    private final int parseColor(String value, int fallback) {
        Object objM15551constructorimpl;
        String str = value;
        if (str == null || StringsKt__StringsKt.isBlank(str)) {
            return fallback;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            GuiHudPreviewView guiHudPreviewView = this;
            objM15551constructorimpl = Result.m15551constructorimpl(Integer.valueOf(Color.parseColor(value)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
        }
        Integer numValueOf = Integer.valueOf(fallback);
        if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
            objM15551constructorimpl = numValueOf;
        }
        return ((Number) objM15551constructorimpl).intValue();
    }

    private final float styleFloat(GuiHudElementPatch element, String key, float fallback) {
        Float floatOrNull;
        String str = element.getColorOverrides().get(key);
        return (str == null || (floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(str)) == null) ? fallback : floatOrNull.floatValue();
    }
}
