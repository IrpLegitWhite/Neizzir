package com.blackhub.bronline.neizzir.fragments.hpbar;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.C3715R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.slider.Slider;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.firebase.messaging.Constants;
import com.helpshift.proactive.InAppViewConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.p040io.CloseableKt;
import kotlin.p040io.FilesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.DebugKt;
import org.slf4j.Marker;
import yuku.ambilwarna.AmbilWarnaDialog;

/* JADX INFO: compiled from: HpBarEditor.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 I2\u00020\u0001:\u0001IB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J<\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00120\u001cH\u0002J&\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\t2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\"H\u0002J\b\u0010#\u001a\u00020$H\u0002J \u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002Jd\u0010*\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020(2\u0006\u00101\u001a\u00020\t2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00120\u001cH\u0002JT\u00102\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u00103\u001a\u00020\t2\u0006\u00101\u001a\u00020\t2\u0006\u00104\u001a\u0002052\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00120\u001cH\u0002J<\u00106\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00107\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u00108\u001a\u00020\u001d2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00120\u001cH\u0002J\u0010\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020(H\u0002J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010<\u001a\u00020=2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\t2\u0006\u0010>\u001a\u00020\u001dH\u0002J$\u0010?\u001a\u00020\u00162\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\b\u0010F\u001a\u00020\u0012H\u0002J\b\u0010G\u001a\u00020\u0012H\u0002J\u0018\u0010H\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006J"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/hpbar/HpBarEditorFragment;", "Landroidx/fragment/app/Fragment;", "()V", "cfg", "Lcom/blackhub/bronline/neizzir/fragments/hpbar/TagConfig;", "preview", "Lcom/blackhub/bronline/neizzir/fragments/hpbar/HpBarPreviewView;", "sliderRefs", "", "", "Lcom/google/android/material/slider/Slider;", "switchRefs", "Lcom/google/android/material/switchmaterial/SwitchMaterial;", "configFile", "Ljava/io/File;", "ctx", "Landroid/content/Context;", "copyInto", "", "dst", "src", "createColorCard", "Landroid/view/View;", "title", "accentColor", "rgba", "Lcom/blackhub/bronline/neizzir/fragments/hpbar/Rgba;", "onChange", "Lkotlin/Function1;", "", "createMiniButton", "Lcom/google/android/material/button/MaterialButton;", "text", "onClick", "Lkotlin/Function0;", "createRippleCircle", "Landroid/graphics/drawable/GradientDrawable;", "createRoundedBg", "colorHex", "alpha", "", InAppViewConstants.RADIUS, "createSliderCard", "icon", "color", "value", "min", "max", "step", "key", "createSwitchCard", "description", "checked", "", "createTestSlider", Constants.ScionAnalytics.PARAM_LABEL, "initialValue", "formatValue", "v", "loadTags", "makeSectionTitle", "Landroid/widget/TextView;", "topMargin", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "resetToDefault", "saveAndClose", "saveTags", "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class HpBarEditorFragment extends Fragment {
    private static final String COLOR_ACCENT = "#00E5CC";
    private static final String COLOR_BG = "#0A0A0F";
    private static final String COLOR_BLUE = "#3B82F6";
    private static final String COLOR_CARD = "#1A1A1F";
    private static final String COLOR_CYAN = "#06B6D4";
    private static final String COLOR_DIVIDER = "#2D2D35";
    private static final String COLOR_GREEN = "#22C55E";
    private static final String COLOR_HINT = "#808080";
    private static final String COLOR_ORANGE = "#F97316";
    private static final String COLOR_PINK = "#EC4899";
    private static final String COLOR_PURPLE = "#A855F7";
    private static final String COLOR_RED = "#EF4444";
    private static final String COLOR_TEXT = "#FFFFFF";
    private static final String COLOR_YELLOW = "#EAB308";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private TagConfig cfg;
    private HpBarPreviewView preview;
    private final Map<String, Slider> sliderRefs = new LinkedHashMap();
    private final Map<String, SwitchMaterial> switchRefs = new LinkedHashMap();

    /* JADX INFO: compiled from: HpBarEditor.kt */
    @Metadata(m4415d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/hpbar/HpBarEditorFragment$Companion;", "", "()V", "COLOR_ACCENT", "", "COLOR_BG", "COLOR_BLUE", "COLOR_CARD", "COLOR_CYAN", "COLOR_DIVIDER", "COLOR_GREEN", "COLOR_HINT", "COLOR_ORANGE", "COLOR_PINK", "COLOR_PURPLE", "COLOR_RED", "COLOR_TEXT", "COLOR_YELLOW", "newInstance", "Lcom/blackhub/bronline/neizzir/fragments/hpbar/HpBarEditorFragment;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HpBarEditorFragment newInstance() {
            return new HpBarEditorFragment();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context ctx = requireContext();
        Intrinsics.checkNotNullExpressionValue(ctx, "requireContext(...)");
        this.cfg = loadTags(ctx);
        float density = ctx.getResources().getDisplayMetrics().density;
        ScrollView $this$onCreateView_u24lambda_u240 = new ScrollView(ctx);
        $this$onCreateView_u24lambda_u240.setBackgroundColor(Color.parseColor("#0A0A0F"));
        $this$onCreateView_u24lambda_u240.setFillViewport(true);
        LinearLayout $this$onCreateView_u24lambda_u241 = new LinearLayout(ctx);
        $this$onCreateView_u24lambda_u241.setOrientation(1);
        $this$onCreateView_u24lambda_u241.setPadding(onCreateView$dp(density, 20), onCreateView$dp(density, 24), onCreateView$dp(density, 20), onCreateView$dp(density, 120));
        $this$onCreateView_u24lambda_u240.addView($this$onCreateView_u24lambda_u241);
        LinearLayout $this$onCreateView_u24lambda_u242 = new LinearLayout(ctx);
        $this$onCreateView_u24lambda_u242.setOrientation(0);
        $this$onCreateView_u24lambda_u242.setGravity(16);
        FrameLayout $this$onCreateView_u24lambda_u244 = new FrameLayout(ctx);
        $this$onCreateView_u24lambda_u244.setBackground(createRippleCircle());
        $this$onCreateView_u24lambda_u244.setLayoutParams(new LinearLayout.LayoutParams(onCreateView$dp(density, 40), onCreateView$dp(density, 40)));
        $this$onCreateView_u24lambda_u244.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HpBarEditorFragment.onCreateView$lambda$4$lambda$3(this.f$0, view);
            }
        });
        ImageView $this$onCreateView_u24lambda_u245 = new ImageView(ctx);
        $this$onCreateView_u24lambda_u245.setImageResource(C3715R.drawable.neizzir19_ic_arrow_back);
        $this$onCreateView_u24lambda_u245.setColorFilter(-1);
        $this$onCreateView_u24lambda_u245.setLayoutParams(new FrameLayout.LayoutParams(onCreateView$dp(density, 24), onCreateView$dp(density, 24), 17));
        $this$onCreateView_u24lambda_u244.addView($this$onCreateView_u24lambda_u245);
        TextView $this$onCreateView_u24lambda_u247 = new TextView(ctx);
        $this$onCreateView_u24lambda_u247.setText("Редактор HP-бара");
        $this$onCreateView_u24lambda_u247.setTextColor(Color.parseColor("#FFFFFF"));
        $this$onCreateView_u24lambda_u247.setTextSize(24.0f);
        $this$onCreateView_u24lambda_u247.setTypeface($this$onCreateView_u24lambda_u247.getTypeface(), 1);
        LinearLayout.LayoutParams $this$onCreateView_u24lambda_u247_u24lambda_u246 = new LinearLayout.LayoutParams(-2, -2);
        $this$onCreateView_u24lambda_u247_u24lambda_u246.setMarginStart(onCreateView$dp(density, 12));
        $this$onCreateView_u24lambda_u247.setLayoutParams($this$onCreateView_u24lambda_u247_u24lambda_u246);
        $this$onCreateView_u24lambda_u242.addView($this$onCreateView_u24lambda_u244);
        $this$onCreateView_u24lambda_u242.addView($this$onCreateView_u24lambda_u247);
        $this$onCreateView_u24lambda_u241.addView($this$onCreateView_u24lambda_u242);
        MaterialCardView $this$onCreateView_u24lambda_u249 = new MaterialCardView(ctx);
        $this$onCreateView_u24lambda_u249.setRadius(onCreateView$dp(density, 20));
        $this$onCreateView_u24lambda_u249.setCardElevation(0.0f);
        $this$onCreateView_u24lambda_u249.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        $this$onCreateView_u24lambda_u249.setStrokeWidth(0);
        LinearLayout.LayoutParams $this$onCreateView_u24lambda_u249_u24lambda_u248 = new LinearLayout.LayoutParams(-1, -2);
        $this$onCreateView_u24lambda_u249_u24lambda_u248.topMargin = onCreateView$dp(density, 20);
        $this$onCreateView_u24lambda_u249.setLayoutParams($this$onCreateView_u24lambda_u249_u24lambda_u248);
        LinearLayout $this$onCreateView_u24lambda_u2410 = new LinearLayout(ctx);
        $this$onCreateView_u24lambda_u2410.setOrientation(1);
        $this$onCreateView_u24lambda_u2410.setGravity(17);
        $this$onCreateView_u24lambda_u2410.setPadding(onCreateView$dp(density, 20), onCreateView$dp(density, 24), onCreateView$dp(density, 20), onCreateView$dp(density, 24));
        TextView $this$onCreateView_u24lambda_u2411 = new TextView(ctx);
        $this$onCreateView_u24lambda_u2411.setText("Предпросмотр");
        $this$onCreateView_u24lambda_u2411.setTextColor(Color.parseColor("#808080"));
        $this$onCreateView_u24lambda_u2411.setTextSize(12.0f);
        $this$onCreateView_u24lambda_u2411.setGravity(17);
        HpBarPreviewView $this$onCreateView_u24lambda_u2413 = new HpBarPreviewView(ctx);
        TagConfig tagConfig = this.cfg;
        TagConfig tagConfig2 = null;
        if (tagConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cfg");
            tagConfig = null;
        }
        $this$onCreateView_u24lambda_u2413.setCfg(tagConfig);
        $this$onCreateView_u24lambda_u2413.setZoom(1.5f);
        LinearLayout.LayoutParams $this$onCreateView_u24lambda_u2413_u24lambda_u2412 = new LinearLayout.LayoutParams(-2, -2);
        $this$onCreateView_u24lambda_u2413_u24lambda_u2412.topMargin = onCreateView$dp(density, 12);
        $this$onCreateView_u24lambda_u2413.setLayoutParams($this$onCreateView_u24lambda_u2413_u24lambda_u2412);
        this.preview = $this$onCreateView_u24lambda_u2413;
        LinearLayout $this$onCreateView_u24lambda_u2415 = new LinearLayout(ctx);
        $this$onCreateView_u24lambda_u2415.setOrientation(0);
        $this$onCreateView_u24lambda_u2415.setGravity(17);
        LinearLayout.LayoutParams $this$onCreateView_u24lambda_u2415_u24lambda_u2414 = new LinearLayout.LayoutParams(-1, -2);
        $this$onCreateView_u24lambda_u2415_u24lambda_u2414.topMargin = onCreateView$dp(density, 16);
        $this$onCreateView_u24lambda_u2415.setLayoutParams($this$onCreateView_u24lambda_u2415_u24lambda_u2414);
        MaterialButton zoomMinus = createMiniButton(ctx, "−", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment$onCreateView$zoomMinus$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HpBarPreviewView hpBarPreviewView = this.this$0.preview;
                HpBarPreviewView hpBarPreviewView2 = null;
                if (hpBarPreviewView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                    hpBarPreviewView = null;
                }
                float newZoom = RangesKt___RangesKt.coerceAtLeast(hpBarPreviewView.getZoom() - 0.25f, 0.5f);
                HpBarPreviewView hpBarPreviewView3 = this.this$0.preview;
                if (hpBarPreviewView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                } else {
                    hpBarPreviewView2 = hpBarPreviewView3;
                }
                hpBarPreviewView2.setZoom(newZoom);
            }
        });
        TextView $this$onCreateView_u24lambda_u2417 = new TextView(ctx);
        $this$onCreateView_u24lambda_u2417.setText("Масштаб");
        $this$onCreateView_u24lambda_u2417.setTextColor(Color.parseColor("#808080"));
        $this$onCreateView_u24lambda_u2417.setTextSize(12.0f);
        LinearLayout.LayoutParams $this$onCreateView_u24lambda_u2417_u24lambda_u2416 = new LinearLayout.LayoutParams(-2, -2);
        $this$onCreateView_u24lambda_u2417_u24lambda_u2416.setMarginStart(onCreateView$dp(density, 12));
        $this$onCreateView_u24lambda_u2417_u24lambda_u2416.setMarginEnd(onCreateView$dp(density, 12));
        $this$onCreateView_u24lambda_u2417.setLayoutParams($this$onCreateView_u24lambda_u2417_u24lambda_u2416);
        MaterialButton zoomPlus = createMiniButton(ctx, Marker.ANY_NON_NULL_MARKER, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment$onCreateView$zoomPlus$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HpBarPreviewView hpBarPreviewView = this.this$0.preview;
                HpBarPreviewView hpBarPreviewView2 = null;
                if (hpBarPreviewView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                    hpBarPreviewView = null;
                }
                float newZoom = RangesKt___RangesKt.coerceAtMost(hpBarPreviewView.getZoom() + 0.25f, 3.0f);
                HpBarPreviewView hpBarPreviewView3 = this.this$0.preview;
                if (hpBarPreviewView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                } else {
                    hpBarPreviewView2 = hpBarPreviewView3;
                }
                hpBarPreviewView2.setZoom(newZoom);
            }
        });
        $this$onCreateView_u24lambda_u2415.addView(zoomMinus);
        $this$onCreateView_u24lambda_u2415.addView($this$onCreateView_u24lambda_u2417);
        $this$onCreateView_u24lambda_u2415.addView(zoomPlus);
        $this$onCreateView_u24lambda_u2410.addView($this$onCreateView_u24lambda_u2411);
        HpBarPreviewView hpBarPreviewView = this.preview;
        if (hpBarPreviewView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preview");
            hpBarPreviewView = null;
        }
        $this$onCreateView_u24lambda_u2410.addView(hpBarPreviewView);
        $this$onCreateView_u24lambda_u2410.addView($this$onCreateView_u24lambda_u2415);
        $this$onCreateView_u24lambda_u249.addView($this$onCreateView_u24lambda_u2410);
        $this$onCreateView_u24lambda_u241.addView($this$onCreateView_u24lambda_u249);
        MaterialCardView $this$onCreateView_u24lambda_u2419 = new MaterialCardView(ctx);
        $this$onCreateView_u24lambda_u2419.setRadius(onCreateView$dp(density, 16));
        $this$onCreateView_u24lambda_u2419.setCardElevation(0.0f);
        $this$onCreateView_u24lambda_u2419.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        $this$onCreateView_u24lambda_u2419.setStrokeWidth(0);
        LinearLayout.LayoutParams $this$onCreateView_u24lambda_u2419_u24lambda_u2418 = new LinearLayout.LayoutParams(-1, -2);
        $this$onCreateView_u24lambda_u2419_u24lambda_u2418.topMargin = onCreateView$dp(density, 12);
        $this$onCreateView_u24lambda_u2419.setLayoutParams($this$onCreateView_u24lambda_u2419_u24lambda_u2418);
        LinearLayout $this$onCreateView_u24lambda_u2420 = new LinearLayout(ctx);
        $this$onCreateView_u24lambda_u2420.setOrientation(1);
        $this$onCreateView_u24lambda_u2420.setPadding(onCreateView$dp(density, 16), onCreateView$dp(density, 14), onCreateView$dp(density, 16), onCreateView$dp(density, 14));
        $this$onCreateView_u24lambda_u2420.addView(createTestSlider(ctx, "HP для теста", "#EF4444", 75, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment.onCreateView.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int it) {
                HpBarPreviewView hpBarPreviewView2 = HpBarEditorFragment.this.preview;
                HpBarPreviewView hpBarPreviewView3 = null;
                if (hpBarPreviewView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                    hpBarPreviewView2 = null;
                }
                hpBarPreviewView2.setHpPct(it / 100.0f);
                HpBarPreviewView hpBarPreviewView4 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                } else {
                    hpBarPreviewView3 = hpBarPreviewView4;
                }
                hpBarPreviewView3.invalidate();
            }
        }));
        $this$onCreateView_u24lambda_u2420.addView(createTestSlider(ctx, "Броня для теста", "#3B82F6", 40, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment.onCreateView.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int it) {
                HpBarPreviewView hpBarPreviewView2 = HpBarEditorFragment.this.preview;
                HpBarPreviewView hpBarPreviewView3 = null;
                if (hpBarPreviewView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                    hpBarPreviewView2 = null;
                }
                hpBarPreviewView2.setArPct(it / 100.0f);
                HpBarPreviewView hpBarPreviewView4 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                } else {
                    hpBarPreviewView3 = hpBarPreviewView4;
                }
                hpBarPreviewView3.invalidate();
            }
        }));
        $this$onCreateView_u24lambda_u2419.addView($this$onCreateView_u24lambda_u2420);
        $this$onCreateView_u24lambda_u241.addView($this$onCreateView_u24lambda_u2419);
        $this$onCreateView_u24lambda_u241.addView(makeSectionTitle(ctx, "Основные настройки", onCreateView$dp(density, 24)));
        int i = C3715R.drawable.neizzir19_ic_check;
        TagConfig tagConfig3 = this.cfg;
        if (tagConfig3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cfg");
            tagConfig3 = null;
        }
        $this$onCreateView_u24lambda_u241.addView(createSwitchCard(ctx, i, "#22C55E", "Включить HP-бар", "Показывать кастомный HP-бар над игроками", "enabled", tagConfig3.getEnabled(), new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment.onCreateView.4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean it) {
                TagConfig tagConfig4 = HpBarEditorFragment.this.cfg;
                HpBarPreviewView hpBarPreviewView2 = null;
                if (tagConfig4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cfg");
                    tagConfig4 = null;
                }
                tagConfig4.setEnabled(it);
                HpBarPreviewView hpBarPreviewView3 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                } else {
                    hpBarPreviewView2 = hpBarPreviewView3;
                }
                hpBarPreviewView2.invalidate();
            }
        }));
        int i2 = C3715R.drawable.neizzir19_ic_info;
        TagConfig tagConfig4 = this.cfg;
        if (tagConfig4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cfg");
            tagConfig4 = null;
        }
        $this$onCreateView_u24lambda_u241.addView(createSwitchCard(ctx, i2, "#06B6D4", "Показывать текст HP", "Отображать числовое значение здоровья", "showHpText", tagConfig4.getShowHpText(), new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment.onCreateView.5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean it) {
                TagConfig tagConfig5 = HpBarEditorFragment.this.cfg;
                HpBarPreviewView hpBarPreviewView2 = null;
                if (tagConfig5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cfg");
                    tagConfig5 = null;
                }
                tagConfig5.setShowHpText(it);
                HpBarPreviewView hpBarPreviewView3 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                } else {
                    hpBarPreviewView2 = hpBarPreviewView3;
                }
                hpBarPreviewView2.invalidate();
            }
        }));
        $this$onCreateView_u24lambda_u241.addView(makeSectionTitle(ctx, "Размеры", onCreateView$dp(density, 20)));
        int i3 = C3715R.drawable.neizzir19_ic_horizontal;
        TagConfig tagConfig5 = this.cfg;
        if (tagConfig5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cfg");
            tagConfig5 = null;
        }
        $this$onCreateView_u24lambda_u241.addView(createSliderCard(ctx, i3, "#A855F7", "Ширина", tagConfig5.getHpWidthRef640(), 12.0f, 200.0f, 1.0f, InAppViewConstants.WIDTH, new Function1<Float, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment.onCreateView.6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke(f.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float it) {
                TagConfig tagConfig6 = HpBarEditorFragment.this.cfg;
                HpBarPreviewView hpBarPreviewView2 = null;
                if (tagConfig6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cfg");
                    tagConfig6 = null;
                }
                tagConfig6.setHpWidthRef640(it);
                HpBarPreviewView hpBarPreviewView3 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                    hpBarPreviewView3 = null;
                }
                hpBarPreviewView3.requestLayout();
                HpBarPreviewView hpBarPreviewView4 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                } else {
                    hpBarPreviewView2 = hpBarPreviewView4;
                }
                hpBarPreviewView2.invalidate();
            }
        }));
        int i4 = C3715R.drawable.neizzir19_ic_vertical;
        TagConfig tagConfig6 = this.cfg;
        if (tagConfig6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cfg");
            tagConfig6 = null;
        }
        $this$onCreateView_u24lambda_u241.addView(createSliderCard(ctx, i4, "#3B82F6", "Высота", tagConfig6.getHpHeightRef480(), 8.0f, 80.0f, 1.0f, InAppViewConstants.HEIGHT, new Function1<Float, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment.onCreateView.7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke(f.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float it) {
                TagConfig tagConfig7 = HpBarEditorFragment.this.cfg;
                HpBarPreviewView hpBarPreviewView2 = null;
                if (tagConfig7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cfg");
                    tagConfig7 = null;
                }
                tagConfig7.setHpHeightRef480(it);
                HpBarPreviewView hpBarPreviewView3 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                    hpBarPreviewView3 = null;
                }
                hpBarPreviewView3.requestLayout();
                HpBarPreviewView hpBarPreviewView4 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                } else {
                    hpBarPreviewView2 = hpBarPreviewView4;
                }
                hpBarPreviewView2.invalidate();
            }
        }));
        int i5 = C3715R.drawable.neizzir19_ic_border;
        TagConfig tagConfig7 = this.cfg;
        if (tagConfig7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cfg");
            tagConfig7 = null;
        }
        $this$onCreateView_u24lambda_u241.addView(createSliderCard(ctx, i5, "#F97316", "Толщина рамки", tagConfig7.getOutlinePx(), 0.0f, 30.0f, 0.5f, "outline", new Function1<Float, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment.onCreateView.8
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke(f.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float it) {
                TagConfig tagConfig8 = HpBarEditorFragment.this.cfg;
                HpBarPreviewView hpBarPreviewView2 = null;
                if (tagConfig8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cfg");
                    tagConfig8 = null;
                }
                tagConfig8.setOutlinePx(it);
                HpBarPreviewView hpBarPreviewView3 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                    hpBarPreviewView3 = null;
                }
                hpBarPreviewView3.requestLayout();
                HpBarPreviewView hpBarPreviewView4 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                } else {
                    hpBarPreviewView2 = hpBarPreviewView4;
                }
                hpBarPreviewView2.invalidate();
            }
        }));
        int i6 = C3715R.drawable.neizzir19_ic_rounded;
        TagConfig tagConfig8 = this.cfg;
        if (tagConfig8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cfg");
            tagConfig8 = null;
        }
        $this$onCreateView_u24lambda_u241.addView(createSliderCard(ctx, i6, "#EC4899", "Скругление углов", tagConfig8.getRoundPx(), 0.0f, 50.0f, 1.0f, "round", new Function1<Float, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment.onCreateView.9
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke(f.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float it) {
                TagConfig tagConfig9 = HpBarEditorFragment.this.cfg;
                HpBarPreviewView hpBarPreviewView2 = null;
                if (tagConfig9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cfg");
                    tagConfig9 = null;
                }
                tagConfig9.setRoundPx(it);
                HpBarPreviewView hpBarPreviewView3 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                } else {
                    hpBarPreviewView2 = hpBarPreviewView3;
                }
                hpBarPreviewView2.invalidate();
            }
        }));
        int i7 = C3715R.drawable.neizzir19_ic_spacing;
        TagConfig tagConfig9 = this.cfg;
        if (tagConfig9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cfg");
            tagConfig9 = null;
        }
        $this$onCreateView_u24lambda_u241.addView(createSliderCard(ctx, i7, "#EAB308", "Отступ до брони", tagConfig9.getArmorGapPx(), 0.0f, 60.0f, 1.0f, "gap", new Function1<Float, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment.onCreateView.10
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke(f.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float it) {
                TagConfig tagConfig10 = HpBarEditorFragment.this.cfg;
                HpBarPreviewView hpBarPreviewView2 = null;
                if (tagConfig10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cfg");
                    tagConfig10 = null;
                }
                tagConfig10.setArmorGapPx(it);
                HpBarPreviewView hpBarPreviewView3 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                    hpBarPreviewView3 = null;
                }
                hpBarPreviewView3.requestLayout();
                HpBarPreviewView hpBarPreviewView4 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                } else {
                    hpBarPreviewView2 = hpBarPreviewView4;
                }
                hpBarPreviewView2.invalidate();
            }
        }));
        $this$onCreateView_u24lambda_u241.addView(makeSectionTitle(ctx, "Цвета HP", onCreateView$dp(density, 20)));
        TagConfig tagConfig10 = this.cfg;
        if (tagConfig10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cfg");
            tagConfig10 = null;
        }
        $this$onCreateView_u24lambda_u241.addView(createColorCard(ctx, "Заливка HP", "#EF4444", tagConfig10.getHpFill(), new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment.onCreateView.11
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int it) {
                TagConfig tagConfig11 = HpBarEditorFragment.this.cfg;
                HpBarPreviewView hpBarPreviewView2 = null;
                if (tagConfig11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cfg");
                    tagConfig11 = null;
                }
                tagConfig11.getHpFill().setFromColorInt(it);
                HpBarPreviewView hpBarPreviewView3 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                } else {
                    hpBarPreviewView2 = hpBarPreviewView3;
                }
                hpBarPreviewView2.invalidate();
            }
        }));
        TagConfig tagConfig11 = this.cfg;
        if (tagConfig11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cfg");
            tagConfig11 = null;
        }
        $this$onCreateView_u24lambda_u241.addView(createColorCard(ctx, "Фон HP", "#F97316", tagConfig11.getHpBg(), new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment.onCreateView.12
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int it) {
                TagConfig tagConfig12 = HpBarEditorFragment.this.cfg;
                HpBarPreviewView hpBarPreviewView2 = null;
                if (tagConfig12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cfg");
                    tagConfig12 = null;
                }
                tagConfig12.getHpBg().setFromColorInt(it);
                HpBarPreviewView hpBarPreviewView3 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                } else {
                    hpBarPreviewView2 = hpBarPreviewView3;
                }
                hpBarPreviewView2.invalidate();
            }
        }));
        TagConfig tagConfig12 = this.cfg;
        if (tagConfig12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cfg");
            tagConfig12 = null;
        }
        $this$onCreateView_u24lambda_u241.addView(createColorCard(ctx, "Текст HP", "#FFFFFF", tagConfig12.getHpText(), new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment.onCreateView.13
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int it) {
                TagConfig tagConfig13 = HpBarEditorFragment.this.cfg;
                HpBarPreviewView hpBarPreviewView2 = null;
                if (tagConfig13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cfg");
                    tagConfig13 = null;
                }
                tagConfig13.getHpText().setFromColorInt(it);
                HpBarPreviewView hpBarPreviewView3 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                } else {
                    hpBarPreviewView2 = hpBarPreviewView3;
                }
                hpBarPreviewView2.invalidate();
            }
        }));
        TagConfig tagConfig13 = this.cfg;
        if (tagConfig13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cfg");
            tagConfig13 = null;
        }
        $this$onCreateView_u24lambda_u241.addView(createColorCard(ctx, "Рамка", "#808080", tagConfig13.getBorder(), new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment.onCreateView.14
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int it) {
                TagConfig tagConfig14 = HpBarEditorFragment.this.cfg;
                HpBarPreviewView hpBarPreviewView2 = null;
                if (tagConfig14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cfg");
                    tagConfig14 = null;
                }
                tagConfig14.getBorder().setFromColorInt(it);
                HpBarPreviewView hpBarPreviewView3 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                } else {
                    hpBarPreviewView2 = hpBarPreviewView3;
                }
                hpBarPreviewView2.invalidate();
            }
        }));
        $this$onCreateView_u24lambda_u241.addView(makeSectionTitle(ctx, "Цвета брони", onCreateView$dp(density, 20)));
        TagConfig tagConfig14 = this.cfg;
        if (tagConfig14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cfg");
            tagConfig14 = null;
        }
        $this$onCreateView_u24lambda_u241.addView(createColorCard(ctx, "Заливка брони", "#3B82F6", tagConfig14.getArmorFill(), new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment.onCreateView.15
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int it) {
                TagConfig tagConfig15 = HpBarEditorFragment.this.cfg;
                HpBarPreviewView hpBarPreviewView2 = null;
                if (tagConfig15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cfg");
                    tagConfig15 = null;
                }
                tagConfig15.getArmorFill().setFromColorInt(it);
                HpBarPreviewView hpBarPreviewView3 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                } else {
                    hpBarPreviewView2 = hpBarPreviewView3;
                }
                hpBarPreviewView2.invalidate();
            }
        }));
        TagConfig tagConfig15 = this.cfg;
        if (tagConfig15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cfg");
        } else {
            tagConfig2 = tagConfig15;
        }
        $this$onCreateView_u24lambda_u241.addView(createColorCard(ctx, "Фон брони", "#A855F7", tagConfig2.getArmorBg(), new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment.onCreateView.16
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int it) {
                TagConfig tagConfig16 = HpBarEditorFragment.this.cfg;
                HpBarPreviewView hpBarPreviewView2 = null;
                if (tagConfig16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cfg");
                    tagConfig16 = null;
                }
                tagConfig16.getArmorBg().setFromColorInt(it);
                HpBarPreviewView hpBarPreviewView3 = HpBarEditorFragment.this.preview;
                if (hpBarPreviewView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preview");
                } else {
                    hpBarPreviewView2 = hpBarPreviewView3;
                }
                hpBarPreviewView2.invalidate();
            }
        }));
        LinearLayout btnRow = new LinearLayout(ctx);
        btnRow.setOrientation(0);
        btnRow.setGravity(17);
        LinearLayout.LayoutParams $this$onCreateView_u24lambda_u2422_u24lambda_u2421 = new LinearLayout.LayoutParams(-1, -2);
        $this$onCreateView_u24lambda_u2422_u24lambda_u2421.topMargin = onCreateView$dp(density, 32);
        btnRow.setLayoutParams($this$onCreateView_u24lambda_u2422_u24lambda_u2421);
        MaterialButton $this$onCreateView_u24lambda_u2425 = new MaterialButton(ctx);
        $this$onCreateView_u24lambda_u2425.setText("Сбросить");
        $this$onCreateView_u24lambda_u2425.setBackgroundColor(Color.parseColor("#2D2D35"));
        $this$onCreateView_u24lambda_u2425.setTextColor(Color.parseColor("#FFFFFF"));
        $this$onCreateView_u24lambda_u2425.setCornerRadius(onCreateView$dp(density, 12));
        LinearLayout.LayoutParams $this$onCreateView_u24lambda_u2425_u24lambda_u2423 = new LinearLayout.LayoutParams(0, onCreateView$dp(density, 48), 1.0f);
        $this$onCreateView_u24lambda_u2425_u24lambda_u2423.setMarginEnd(onCreateView$dp(density, 8));
        $this$onCreateView_u24lambda_u2425.setLayoutParams($this$onCreateView_u24lambda_u2425_u24lambda_u2423);
        $this$onCreateView_u24lambda_u2425.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HpBarEditorFragment.onCreateView$lambda$25$lambda$24(this.f$0, view);
            }
        });
        MaterialButton $this$onCreateView_u24lambda_u2428 = new MaterialButton(ctx);
        $this$onCreateView_u24lambda_u2428.setText("Сохранить");
        $this$onCreateView_u24lambda_u2428.setBackgroundColor(Color.parseColor("#00E5CC"));
        $this$onCreateView_u24lambda_u2428.setTextColor(Color.parseColor("#000000"));
        $this$onCreateView_u24lambda_u2428.setCornerRadius(onCreateView$dp(density, 12));
        LinearLayout.LayoutParams $this$onCreateView_u24lambda_u2428_u24lambda_u2426 = new LinearLayout.LayoutParams(0, onCreateView$dp(density, 48), 1.0f);
        $this$onCreateView_u24lambda_u2428_u24lambda_u2426.setMarginStart(onCreateView$dp(density, 8));
        $this$onCreateView_u24lambda_u2428.setLayoutParams($this$onCreateView_u24lambda_u2428_u24lambda_u2426);
        $this$onCreateView_u24lambda_u2428.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IOException {
                HpBarEditorFragment.onCreateView$lambda$28$lambda$27(this.f$0, view);
            }
        });
        btnRow.addView($this$onCreateView_u24lambda_u2425);
        btnRow.addView($this$onCreateView_u24lambda_u2428);
        $this$onCreateView_u24lambda_u241.addView(btnRow);
        return $this$onCreateView_u24lambda_u240;
    }

    private static final int onCreateView$dp(float density, int v) {
        return (int) (v * density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$4$lambda$3(HpBarEditorFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getParentFragmentManager().popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$25$lambda$24(HpBarEditorFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.resetToDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$28$lambda$27(HpBarEditorFragment this$0, View it) throws IOException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.saveAndClose();
    }

    private final TextView makeSectionTitle(Context ctx, String text, int topMargin) {
        float density = ctx.getResources().getDisplayMetrics().density;
        TextView $this$makeSectionTitle_u24lambda_u2430 = new TextView(ctx);
        $this$makeSectionTitle_u24lambda_u2430.setText(text);
        $this$makeSectionTitle_u24lambda_u2430.setTextColor(Color.parseColor("#808080"));
        $this$makeSectionTitle_u24lambda_u2430.setTextSize(13.0f);
        $this$makeSectionTitle_u24lambda_u2430.setTypeface($this$makeSectionTitle_u24lambda_u2430.getTypeface(), 1);
        LinearLayout.LayoutParams $this$makeSectionTitle_u24lambda_u2430_u24lambda_u2429 = new LinearLayout.LayoutParams(-2, -2);
        $this$makeSectionTitle_u24lambda_u2430_u24lambda_u2429.topMargin = topMargin;
        $this$makeSectionTitle_u24lambda_u2430_u24lambda_u2429.bottomMargin = (int) (12 * density);
        $this$makeSectionTitle_u24lambda_u2430.setLayoutParams($this$makeSectionTitle_u24lambda_u2430_u24lambda_u2429);
        return $this$makeSectionTitle_u24lambda_u2430;
    }

    private final MaterialButton createMiniButton(Context ctx, String text, final Function0<Unit> onClick) {
        float density = ctx.getResources().getDisplayMetrics().density;
        MaterialButton $this$createMiniButton_u24lambda_u2433 = new MaterialButton(ctx);
        $this$createMiniButton_u24lambda_u2433.setText(text);
        $this$createMiniButton_u24lambda_u2433.setBackgroundColor(Color.parseColor("#2D2D35"));
        $this$createMiniButton_u24lambda_u2433.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createMiniButton_u24lambda_u2433.setCornerRadius(createMiniButton$dp$31(density, 8));
        $this$createMiniButton_u24lambda_u2433.setTextSize(18.0f);
        $this$createMiniButton_u24lambda_u2433.setMinWidth(createMiniButton$dp$31(density, 40));
        $this$createMiniButton_u24lambda_u2433.setMinimumWidth(createMiniButton$dp$31(density, 40));
        $this$createMiniButton_u24lambda_u2433.setPadding(0, 0, 0, 0);
        $this$createMiniButton_u24lambda_u2433.setInsetTop(0);
        $this$createMiniButton_u24lambda_u2433.setInsetBottom(0);
        $this$createMiniButton_u24lambda_u2433.setLayoutParams(new LinearLayout.LayoutParams(createMiniButton$dp$31(density, 40), createMiniButton$dp$31(density, 36)));
        $this$createMiniButton_u24lambda_u2433.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HpBarEditorFragment.createMiniButton$lambda$33$lambda$32(onClick, view);
            }
        });
        return $this$createMiniButton_u24lambda_u2433;
    }

    private static final int createMiniButton$dp$31(float density, int v) {
        return (int) (v * density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createMiniButton$lambda$33$lambda$32(Function0 onClick, View it) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        onClick.invoke();
    }

    private final View createTestSlider(Context ctx, String label, String color, int initialValue, final Function1<? super Integer, Unit> onChange) {
        float density = ctx.getResources().getDisplayMetrics().density;
        LinearLayout row = new LinearLayout(ctx);
        row.setOrientation(0);
        row.setGravity(16);
        LinearLayout.LayoutParams $this$createTestSlider_u24lambda_u2436_u24lambda_u2435 = new LinearLayout.LayoutParams(-1, -2);
        $this$createTestSlider_u24lambda_u2436_u24lambda_u2435.bottomMargin = createTestSlider$dp$34(density, 8);
        row.setLayoutParams($this$createTestSlider_u24lambda_u2436_u24lambda_u2435);
        TextView $this$createTestSlider_u24lambda_u2437 = new TextView(ctx);
        $this$createTestSlider_u24lambda_u2437.setText(label);
        $this$createTestSlider_u24lambda_u2437.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createTestSlider_u24lambda_u2437.setTextSize(13.0f);
        $this$createTestSlider_u24lambda_u2437.setLayoutParams(new LinearLayout.LayoutParams(createTestSlider$dp$34(density, 120), -2));
        final TextView $this$createTestSlider_u24lambda_u2438 = new TextView(ctx);
        $this$createTestSlider_u24lambda_u2438.setText(new StringBuilder().append(initialValue).append('%').toString());
        $this$createTestSlider_u24lambda_u2438.setTextColor(Color.parseColor(color));
        $this$createTestSlider_u24lambda_u2438.setTextSize(14.0f);
        $this$createTestSlider_u24lambda_u2438.setTypeface($this$createTestSlider_u24lambda_u2438.getTypeface(), 1);
        $this$createTestSlider_u24lambda_u2438.setGravity(GravityCompat.END);
        $this$createTestSlider_u24lambda_u2438.setLayoutParams(new LinearLayout.LayoutParams(createTestSlider$dp$34(density, 50), -2));
        Slider $this$createTestSlider_u24lambda_u2440 = new Slider(ctx);
        $this$createTestSlider_u24lambda_u2440.setValueFrom(0.0f);
        $this$createTestSlider_u24lambda_u2440.setValueTo(100.0f);
        $this$createTestSlider_u24lambda_u2440.setValue(initialValue);
        $this$createTestSlider_u24lambda_u2440.setStepSize(1.0f);
        $this$createTestSlider_u24lambda_u2440.setTrackActiveTintList(ColorStateList.valueOf(Color.parseColor(color)));
        $this$createTestSlider_u24lambda_u2440.setTrackInactiveTintList(ColorStateList.valueOf(Color.parseColor("#2D2D35")));
        $this$createTestSlider_u24lambda_u2440.setThumbTintList(ColorStateList.valueOf(Color.parseColor(color)));
        $this$createTestSlider_u24lambda_u2440.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        $this$createTestSlider_u24lambda_u2440.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment$$ExternalSyntheticLambda1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider, float f, boolean z) {
                HpBarEditorFragment.createTestSlider$lambda$40$lambda$39($this$createTestSlider_u24lambda_u2438, onChange, slider, f, z);
            }
        });
        row.addView($this$createTestSlider_u24lambda_u2437);
        row.addView($this$createTestSlider_u24lambda_u2440);
        row.addView($this$createTestSlider_u24lambda_u2438);
        return row;
    }

    private static final int createTestSlider$dp$34(float density, int v) {
        return (int) (v * density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createTestSlider$lambda$40$lambda$39(TextView valueView, Function1 onChange, Slider slider, float value, boolean z) {
        Intrinsics.checkNotNullParameter(valueView, "$valueView");
        Intrinsics.checkNotNullParameter(onChange, "$onChange");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        valueView.setText(new StringBuilder().append((int) value).append('%').toString());
        onChange.invoke(Integer.valueOf((int) value));
    }

    private final View createSwitchCard(Context ctx, int icon, String color, String title, String description, String key, boolean checked, final Function1<? super Boolean, Unit> onChange) {
        float density = ctx.getResources().getDisplayMetrics().density;
        MaterialCardView card = new MaterialCardView(ctx);
        card.setRadius(createSwitchCard$dp$41(density, 16));
        card.setCardElevation(0.0f);
        card.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        card.setStrokeWidth(0);
        LinearLayout.LayoutParams $this$createSwitchCard_u24lambda_u2443_u24lambda_u2442 = new LinearLayout.LayoutParams(-1, -2);
        $this$createSwitchCard_u24lambda_u2443_u24lambda_u2442.bottomMargin = createSwitchCard$dp$41(density, 10);
        card.setLayoutParams($this$createSwitchCard_u24lambda_u2443_u24lambda_u2442);
        LinearLayout row = new LinearLayout(ctx);
        row.setOrientation(0);
        row.setGravity(16);
        row.setPadding(createSwitchCard$dp$41(density, 16), createSwitchCard$dp$41(density, 14), createSwitchCard$dp$41(density, 12), createSwitchCard$dp$41(density, 14));
        FrameLayout iconBg = new FrameLayout(ctx);
        iconBg.setBackground(createRoundedBg(color, 0.15f, createSwitchCard$dp$41(density, 10)));
        iconBg.setLayoutParams(new LinearLayout.LayoutParams(createSwitchCard$dp$41(density, 40), createSwitchCard$dp$41(density, 40)));
        ImageView $this$createSwitchCard_u24lambda_u2446 = new ImageView(ctx);
        $this$createSwitchCard_u24lambda_u2446.setImageResource(icon);
        $this$createSwitchCard_u24lambda_u2446.setColorFilter(Color.parseColor(color));
        $this$createSwitchCard_u24lambda_u2446.setLayoutParams(new FrameLayout.LayoutParams(createSwitchCard$dp$41(density, 22), createSwitchCard$dp$41(density, 22), 17));
        iconBg.addView($this$createSwitchCard_u24lambda_u2446);
        LinearLayout texts = new LinearLayout(ctx);
        texts.setOrientation(1);
        LinearLayout.LayoutParams $this$createSwitchCard_u24lambda_u2448_u24lambda_u2447 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$createSwitchCard_u24lambda_u2448_u24lambda_u2447.setMarginStart(createSwitchCard$dp$41(density, 14));
        texts.setLayoutParams($this$createSwitchCard_u24lambda_u2448_u24lambda_u2447);
        TextView $this$createSwitchCard_u24lambda_u2449 = new TextView(ctx);
        $this$createSwitchCard_u24lambda_u2449.setText(title);
        $this$createSwitchCard_u24lambda_u2449.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createSwitchCard_u24lambda_u2449.setTextSize(15.0f);
        TextView $this$createSwitchCard_u24lambda_u2450 = new TextView(ctx);
        $this$createSwitchCard_u24lambda_u2450.setText(description);
        $this$createSwitchCard_u24lambda_u2450.setTextColor(Color.parseColor("#808080"));
        $this$createSwitchCard_u24lambda_u2450.setTextSize(11.0f);
        texts.addView($this$createSwitchCard_u24lambda_u2449);
        texts.addView($this$createSwitchCard_u24lambda_u2450);
        final SwitchMaterial $this$createSwitchCard_u24lambda_u2452 = new SwitchMaterial(ctx);
        $this$createSwitchCard_u24lambda_u2452.setChecked(checked);
        $this$createSwitchCard_u24lambda_u2452.setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{Color.parseColor("#00E5CC"), Color.parseColor("#2D2D35")}));
        $this$createSwitchCard_u24lambda_u2452.setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{Color.parseColor("#00E5CC"), Color.parseColor("#808080")}));
        $this$createSwitchCard_u24lambda_u2452.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment$$ExternalSyntheticLambda2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HpBarEditorFragment.createSwitchCard$lambda$52$lambda$51(onChange, compoundButton, z);
            }
        });
        this.switchRefs.put(key, $this$createSwitchCard_u24lambda_u2452);
        row.addView(iconBg);
        row.addView(texts);
        row.addView($this$createSwitchCard_u24lambda_u2452);
        card.addView(row);
        card.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HpBarEditorFragment.createSwitchCard$lambda$53($this$createSwitchCard_u24lambda_u2452, view);
            }
        });
        return card;
    }

    private static final int createSwitchCard$dp$41(float density, int v) {
        return (int) (v * density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSwitchCard$lambda$52$lambda$51(Function1 onChange, CompoundButton compoundButton, boolean isChecked) {
        Intrinsics.checkNotNullParameter(onChange, "$onChange");
        onChange.invoke(Boolean.valueOf(isChecked));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSwitchCard$lambda$53(SwitchMaterial $switch, View it) {
        Intrinsics.checkNotNullParameter($switch, "$switch");
        $switch.setChecked(!$switch.isChecked());
    }

    private final View createSliderCard(Context ctx, int icon, String color, String title, float value, float min, float max, float step, String key, final Function1<? super Float, Unit> onChange) {
        float density = ctx.getResources().getDisplayMetrics().density;
        MaterialCardView card = new MaterialCardView(ctx);
        card.setRadius(createSliderCard$dp$54(density, 16));
        card.setCardElevation(0.0f);
        card.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        card.setStrokeWidth(0);
        LinearLayout.LayoutParams $this$createSliderCard_u24lambda_u2456_u24lambda_u2455 = new LinearLayout.LayoutParams(-1, -2);
        $this$createSliderCard_u24lambda_u2456_u24lambda_u2455.bottomMargin = createSliderCard$dp$54(density, 10);
        card.setLayoutParams($this$createSliderCard_u24lambda_u2456_u24lambda_u2455);
        LinearLayout content = new LinearLayout(ctx);
        content.setOrientation(1);
        content.setPadding(createSliderCard$dp$54(density, 16), createSliderCard$dp$54(density, 14), createSliderCard$dp$54(density, 16), createSliderCard$dp$54(density, 14));
        LinearLayout headerRow = new LinearLayout(ctx);
        headerRow.setOrientation(0);
        headerRow.setGravity(16);
        FrameLayout iconBg = new FrameLayout(ctx);
        iconBg.setBackground(createRoundedBg(color, 0.15f, createSliderCard$dp$54(density, 10)));
        iconBg.setLayoutParams(new LinearLayout.LayoutParams(createSliderCard$dp$54(density, 36), createSliderCard$dp$54(density, 36)));
        ImageView $this$createSliderCard_u24lambda_u2460 = new ImageView(ctx);
        $this$createSliderCard_u24lambda_u2460.setImageResource(icon);
        $this$createSliderCard_u24lambda_u2460.setColorFilter(Color.parseColor(color));
        $this$createSliderCard_u24lambda_u2460.setLayoutParams(new FrameLayout.LayoutParams(createSliderCard$dp$54(density, 20), createSliderCard$dp$54(density, 20), 17));
        iconBg.addView($this$createSliderCard_u24lambda_u2460);
        TextView $this$createSliderCard_u24lambda_u2462 = new TextView(ctx);
        $this$createSliderCard_u24lambda_u2462.setText(title);
        $this$createSliderCard_u24lambda_u2462.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createSliderCard_u24lambda_u2462.setTextSize(15.0f);
        LinearLayout.LayoutParams $this$createSliderCard_u24lambda_u2462_u24lambda_u2461 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$createSliderCard_u24lambda_u2462_u24lambda_u2461.setMarginStart(createSliderCard$dp$54(density, 12));
        $this$createSliderCard_u24lambda_u2462.setLayoutParams($this$createSliderCard_u24lambda_u2462_u24lambda_u2461);
        final TextView $this$createSliderCard_u24lambda_u2463 = new TextView(ctx);
        $this$createSliderCard_u24lambda_u2463.setText(formatValue(value));
        $this$createSliderCard_u24lambda_u2463.setTextColor(Color.parseColor(color));
        $this$createSliderCard_u24lambda_u2463.setTextSize(16.0f);
        $this$createSliderCard_u24lambda_u2463.setTypeface($this$createSliderCard_u24lambda_u2463.getTypeface(), 1);
        headerRow.addView(iconBg);
        headerRow.addView($this$createSliderCard_u24lambda_u2462);
        headerRow.addView($this$createSliderCard_u24lambda_u2463);
        Slider $this$createSliderCard_u24lambda_u2466 = new Slider(ctx);
        $this$createSliderCard_u24lambda_u2466.setValueFrom(min);
        $this$createSliderCard_u24lambda_u2466.setValueTo(max);
        $this$createSliderCard_u24lambda_u2466.setValue(RangesKt___RangesKt.coerceIn(value, min, max));
        $this$createSliderCard_u24lambda_u2466.setStepSize(step);
        $this$createSliderCard_u24lambda_u2466.setTrackActiveTintList(ColorStateList.valueOf(Color.parseColor(color)));
        $this$createSliderCard_u24lambda_u2466.setTrackInactiveTintList(ColorStateList.valueOf(Color.parseColor("#2D2D35")));
        $this$createSliderCard_u24lambda_u2466.setThumbTintList(ColorStateList.valueOf(Color.parseColor(color)));
        LinearLayout.LayoutParams $this$createSliderCard_u24lambda_u2466_u24lambda_u2464 = new LinearLayout.LayoutParams(-1, -2);
        $this$createSliderCard_u24lambda_u2466_u24lambda_u2464.topMargin = createSliderCard$dp$54(density, 8);
        $this$createSliderCard_u24lambda_u2466.setLayoutParams($this$createSliderCard_u24lambda_u2466_u24lambda_u2464);
        $this$createSliderCard_u24lambda_u2466.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment$$ExternalSyntheticLambda4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider, float f, boolean z) {
                HpBarEditorFragment.createSliderCard$lambda$66$lambda$65($this$createSliderCard_u24lambda_u2463, this, onChange, slider, f, z);
            }
        });
        this.sliderRefs.put(key, $this$createSliderCard_u24lambda_u2466);
        content.addView(headerRow);
        content.addView($this$createSliderCard_u24lambda_u2466);
        card.addView(content);
        return card;
    }

    private static final int createSliderCard$dp$54(float density, int v) {
        return (int) (v * density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSliderCard$lambda$66$lambda$65(TextView valueView, HpBarEditorFragment this$0, Function1 onChange, Slider slider, float v, boolean z) {
        Intrinsics.checkNotNullParameter(valueView, "$valueView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onChange, "$onChange");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        valueView.setText(this$0.formatValue(v));
        onChange.invoke(Float.valueOf(v));
    }

    private final View createColorCard(final Context ctx, String title, String accentColor, final Rgba rgba, final Function1<? super Integer, Unit> onChange) {
        float density = ctx.getResources().getDisplayMetrics().density;
        MaterialCardView $this$createColorCard_u24lambda_u2469 = new MaterialCardView(ctx);
        $this$createColorCard_u24lambda_u2469.setRadius(createColorCard$dp$67(density, 16));
        $this$createColorCard_u24lambda_u2469.setCardElevation(0.0f);
        $this$createColorCard_u24lambda_u2469.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        $this$createColorCard_u24lambda_u2469.setStrokeWidth(0);
        $this$createColorCard_u24lambda_u2469.setClickable(true);
        $this$createColorCard_u24lambda_u2469.setFocusable(true);
        LinearLayout.LayoutParams $this$createColorCard_u24lambda_u2469_u24lambda_u2468 = new LinearLayout.LayoutParams(-1, -2);
        $this$createColorCard_u24lambda_u2469_u24lambda_u2468.bottomMargin = createColorCard$dp$67(density, 10);
        $this$createColorCard_u24lambda_u2469.setLayoutParams($this$createColorCard_u24lambda_u2469_u24lambda_u2468);
        LinearLayout $this$createColorCard_u24lambda_u2470 = new LinearLayout(ctx);
        $this$createColorCard_u24lambda_u2470.setOrientation(0);
        $this$createColorCard_u24lambda_u2470.setGravity(16);
        $this$createColorCard_u24lambda_u2470.setPadding(createColorCard$dp$67(density, 16), createColorCard$dp$67(density, 14), createColorCard$dp$67(density, 16), createColorCard$dp$67(density, 14));
        final View $this$createColorCard_u24lambda_u2472 = new View(ctx);
        GradientDrawable $this$createColorCard_u24lambda_u2472_u24lambda_u2471 = new GradientDrawable();
        $this$createColorCard_u24lambda_u2472_u24lambda_u2471.setShape(1);
        $this$createColorCard_u24lambda_u2472_u24lambda_u2471.setColor(rgba.toColorInt());
        $this$createColorCard_u24lambda_u2472_u24lambda_u2471.setStroke(createColorCard$dp$67(density, 2), Color.parseColor("#2D2D35"));
        $this$createColorCard_u24lambda_u2472.setBackground($this$createColorCard_u24lambda_u2472_u24lambda_u2471);
        $this$createColorCard_u24lambda_u2472.setLayoutParams(new LinearLayout.LayoutParams(createColorCard$dp$67(density, 40), createColorCard$dp$67(density, 40)));
        TextView $this$createColorCard_u24lambda_u2474 = new TextView(ctx);
        $this$createColorCard_u24lambda_u2474.setText(title);
        $this$createColorCard_u24lambda_u2474.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createColorCard_u24lambda_u2474.setTextSize(15.0f);
        LinearLayout.LayoutParams $this$createColorCard_u24lambda_u2474_u24lambda_u2473 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$createColorCard_u24lambda_u2474_u24lambda_u2473.setMarginStart(createColorCard$dp$67(density, 14));
        $this$createColorCard_u24lambda_u2474.setLayoutParams($this$createColorCard_u24lambda_u2474_u24lambda_u2473);
        final TextView $this$createColorCard_u24lambda_u2475 = new TextView(ctx);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(rgba.toColorInt() & ViewCompat.MEASURED_SIZE_MASK)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        $this$createColorCard_u24lambda_u2475.setText(str);
        $this$createColorCard_u24lambda_u2475.setTextColor(Color.parseColor("#808080"));
        $this$createColorCard_u24lambda_u2475.setTextSize(12.0f);
        $this$createColorCard_u24lambda_u2475.setTypeface(Typeface.MONOSPACE);
        ImageView $this$createColorCard_u24lambda_u2477 = new ImageView(ctx);
        $this$createColorCard_u24lambda_u2477.setImageResource(C3715R.drawable.neizzir19_ic_edit);
        $this$createColorCard_u24lambda_u2477.setColorFilter(Color.parseColor("#808080"));
        LinearLayout.LayoutParams $this$createColorCard_u24lambda_u2477_u24lambda_u2476 = new LinearLayout.LayoutParams(createColorCard$dp$67(density, 20), createColorCard$dp$67(density, 20));
        $this$createColorCard_u24lambda_u2477_u24lambda_u2476.setMarginStart(createColorCard$dp$67(density, 12));
        $this$createColorCard_u24lambda_u2477.setLayoutParams($this$createColorCard_u24lambda_u2477_u24lambda_u2476);
        $this$createColorCard_u24lambda_u2470.addView($this$createColorCard_u24lambda_u2472);
        $this$createColorCard_u24lambda_u2470.addView($this$createColorCard_u24lambda_u2474);
        $this$createColorCard_u24lambda_u2470.addView($this$createColorCard_u24lambda_u2475);
        $this$createColorCard_u24lambda_u2470.addView($this$createColorCard_u24lambda_u2477);
        $this$createColorCard_u24lambda_u2469.addView($this$createColorCard_u24lambda_u2470);
        $this$createColorCard_u24lambda_u2469.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HpBarEditorFragment.createColorCard$lambda$78(ctx, rgba, $this$createColorCard_u24lambda_u2472, $this$createColorCard_u24lambda_u2475, onChange, view);
            }
        });
        return $this$createColorCard_u24lambda_u2469;
    }

    private static final int createColorCard$dp$67(float density, int v) {
        return (int) (v * density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createColorCard$lambda$78(Context ctx, Rgba rgba, final View colorPreview, final TextView colorHex, final Function1 onChange, View it) {
        Intrinsics.checkNotNullParameter(ctx, "$ctx");
        Intrinsics.checkNotNullParameter(rgba, "$rgba");
        Intrinsics.checkNotNullParameter(colorPreview, "$colorPreview");
        Intrinsics.checkNotNullParameter(colorHex, "$colorHex");
        Intrinsics.checkNotNullParameter(onChange, "$onChange");
        new AmbilWarnaDialog(ctx, rgba.toColorInt(), true, new AmbilWarnaDialog.OnAmbilWarnaListener() { // from class: com.blackhub.bronline.neizzir.fragments.hpbar.HpBarEditorFragment$createColorCard$1$1
            @Override // yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
            public void onOk(AmbilWarnaDialog dialog, int color) {
                Drawable background = colorPreview.getBackground();
                Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) background).setColor(color);
                TextView textView = colorHex;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & color)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                textView.setText(str);
                onChange.invoke(Integer.valueOf(color));
            }

            @Override // yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
            public void onCancel(AmbilWarnaDialog dialog) {
            }
        }).show();
    }

    private final String formatValue(float v) {
        if (v == ((float) ((long) v))) {
            return String.valueOf((long) v);
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.US, com.blackhub.bronline.game.gui.inventory.Constants.STRING_FORMAT, Arrays.copyOf(new Object[]{Float.valueOf(v)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final GradientDrawable createRoundedBg(String colorHex, float alpha, float radius) {
        int color = Color.parseColor(colorHex);
        GradientDrawable $this$createRoundedBg_u24lambda_u2479 = new GradientDrawable();
        $this$createRoundedBg_u24lambda_u2479.setShape(0);
        $this$createRoundedBg_u24lambda_u2479.setCornerRadius(radius);
        $this$createRoundedBg_u24lambda_u2479.setColor(Color.argb((int) (255 * alpha), Color.red(color), Color.green(color), Color.blue(color)));
        return $this$createRoundedBg_u24lambda_u2479;
    }

    private final GradientDrawable createRippleCircle() {
        GradientDrawable $this$createRippleCircle_u24lambda_u2480 = new GradientDrawable();
        $this$createRippleCircle_u24lambda_u2480.setShape(1);
        $this$createRippleCircle_u24lambda_u2480.setColor(Color.parseColor("#2D2D35"));
        return $this$createRippleCircle_u24lambda_u2480;
    }

    private final void resetToDefault() {
        TagConfig tagConfig = new TagConfig(false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, 16383, null);
        TagConfig tagConfig2 = this.cfg;
        HpBarPreviewView hpBarPreviewView = null;
        if (tagConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cfg");
            tagConfig2 = null;
        }
        copyInto(tagConfig2, tagConfig);
        SwitchMaterial switchMaterial = this.switchRefs.get("enabled");
        if (switchMaterial != null) {
            TagConfig tagConfig3 = this.cfg;
            if (tagConfig3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cfg");
                tagConfig3 = null;
            }
            switchMaterial.setChecked(tagConfig3.getEnabled());
        }
        SwitchMaterial switchMaterial2 = this.switchRefs.get("showHpText");
        if (switchMaterial2 != null) {
            TagConfig tagConfig4 = this.cfg;
            if (tagConfig4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cfg");
                tagConfig4 = null;
            }
            switchMaterial2.setChecked(tagConfig4.getShowHpText());
        }
        Slider slider = this.sliderRefs.get(InAppViewConstants.WIDTH);
        if (slider != null) {
            TagConfig tagConfig5 = this.cfg;
            if (tagConfig5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cfg");
                tagConfig5 = null;
            }
            slider.setValue(RangesKt___RangesKt.coerceIn(tagConfig5.getHpWidthRef640(), 12.0f, 200.0f));
        }
        Slider slider2 = this.sliderRefs.get(InAppViewConstants.HEIGHT);
        if (slider2 != null) {
            TagConfig tagConfig6 = this.cfg;
            if (tagConfig6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cfg");
                tagConfig6 = null;
            }
            slider2.setValue(RangesKt___RangesKt.coerceIn(tagConfig6.getHpHeightRef480(), 8.0f, 80.0f));
        }
        Slider slider3 = this.sliderRefs.get("outline");
        if (slider3 != null) {
            TagConfig tagConfig7 = this.cfg;
            if (tagConfig7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cfg");
                tagConfig7 = null;
            }
            slider3.setValue(RangesKt___RangesKt.coerceIn(tagConfig7.getOutlinePx(), 0.0f, 30.0f));
        }
        Slider slider4 = this.sliderRefs.get("round");
        if (slider4 != null) {
            TagConfig tagConfig8 = this.cfg;
            if (tagConfig8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cfg");
                tagConfig8 = null;
            }
            slider4.setValue(RangesKt___RangesKt.coerceIn(tagConfig8.getRoundPx(), 0.0f, 50.0f));
        }
        Slider slider5 = this.sliderRefs.get("gap");
        if (slider5 != null) {
            TagConfig tagConfig9 = this.cfg;
            if (tagConfig9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cfg");
                tagConfig9 = null;
            }
            slider5.setValue(RangesKt___RangesKt.coerceIn(tagConfig9.getArmorGapPx(), 0.0f, 60.0f));
        }
        HpBarPreviewView hpBarPreviewView2 = this.preview;
        if (hpBarPreviewView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preview");
            hpBarPreviewView2 = null;
        }
        hpBarPreviewView2.requestLayout();
        HpBarPreviewView hpBarPreviewView3 = this.preview;
        if (hpBarPreviewView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preview");
        } else {
            hpBarPreviewView = hpBarPreviewView3;
        }
        hpBarPreviewView.invalidate();
        Toast.makeText(requireContext(), "Сброшено к настройкам по умолчанию", 0).show();
    }

    private final void saveAndClose() throws IOException {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        TagConfig tagConfig = this.cfg;
        if (tagConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cfg");
            tagConfig = null;
        }
        saveTags(contextRequireContext, tagConfig);
        Toast.makeText(requireContext(), "✓ Сохранено", 0).show();
        getParentFragmentManager().popBackStack();
    }

    private final File configFile(Context ctx) {
        File externalFilesDir = ctx.getExternalFilesDir(null);
        String parent = externalFilesDir != null ? externalFilesDir.getParent() : null;
        if (parent == null) {
            return null;
        }
        String parent2 = parent;
        File $this$configFile_u24lambda_u2481 = new File(parent2, InAppViewConstants.CONFIG);
        $this$configFile_u24lambda_u2481.mkdirs();
        return new File($this$configFile_u24lambda_u2481, "config.ini");
    }

    private final TagConfig loadTags(Context ctx) {
        File file = configFile(ctx);
        if (file != null && file.exists()) {
            List lines = FilesKt.readLines$default(file, null, 1, null);
            return new TagConfig(loadTags$parseB(loadTags$v(lines, "enabled"), true), loadTags$parseF(loadTags$v(lines, "nameToBarGapMul"), 1.2f), loadTags$parseF(loadTags$v(lines, "hpWidthRef_640"), 34.0f), loadTags$parseF(loadTags$v(lines, "hpHeightRef_480"), 16.0f), loadTags$parseF(loadTags$v(lines, "outlinePx"), 2.0f), loadTags$parseF(loadTags$v(lines, "roundPx"), 7.0f), loadTags$parseF(loadTags$v(lines, "armorGapPx"), 13.0f), loadTags$parseB(loadTags$v(lines, "showHpText"), true), new Rgba(loadTags$parseF(loadTags$v(lines, "hpTextR"), 255.0f), loadTags$parseF(loadTags$v(lines, "hpTextG"), 255.0f), loadTags$parseF(loadTags$v(lines, "hpTextB"), 255.0f), loadTags$parseF(loadTags$v(lines, "hpTextA"), 255.0f)), new Rgba(loadTags$parseF(loadTags$v(lines, "bdrR"), 0.0f), loadTags$parseF(loadTags$v(lines, "bdrG"), 0.0f), loadTags$parseF(loadTags$v(lines, "bdrB"), 0.0f), loadTags$parseF(loadTags$v(lines, "bdrA"), 255.0f)), new Rgba(loadTags$parseF(loadTags$v(lines, "bgR"), 75.0f), loadTags$parseF(loadTags$v(lines, "bgG"), 11.0f), loadTags$parseF(loadTags$v(lines, "bgB"), 20.0f), loadTags$parseF(loadTags$v(lines, "bgA"), 255.0f)), new Rgba(loadTags$parseF(loadTags$v(lines, "hpR"), 185.0f), loadTags$parseF(loadTags$v(lines, "hpG"), 34.0f), loadTags$parseF(loadTags$v(lines, "hpB"), 40.0f), loadTags$parseF(loadTags$v(lines, "hpA"), 255.0f)), new Rgba(loadTags$parseF(loadTags$v(lines, "arR"), 200.0f), loadTags$parseF(loadTags$v(lines, "arG"), 200.0f), loadTags$parseF(loadTags$v(lines, "arB"), 200.0f), loadTags$parseF(loadTags$v(lines, "arA"), 255.0f)), new Rgba(loadTags$parseF(loadTags$v(lines, "arBgR"), 40.0f), loadTags$parseF(loadTags$v(lines, "arBgG"), 40.0f), loadTags$parseF(loadTags$v(lines, "arBgB"), 40.0f), loadTags$parseF(loadTags$v(lines, "arBgA"), 255.0f)));
        }
        return new TagConfig(false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, 16383, null);
    }

    private static final String loadTags$v(List<String> list, String k) {
        Object element$iv;
        String strSubstringAfter$default;
        String it;
        List<String> $this$firstOrNull$iv = list;
        Iterator it2 = $this$firstOrNull$iv.iterator();
        do {
            if (!it2.hasNext()) {
                element$iv = null;
                break;
            }
            element$iv = it2.next();
            it = (String) element$iv;
        } while (!StringsKt__StringsJVMKt.startsWith$default(new Regex("\\s").replace(it, ""), k + '=', false, 2, null));
        String str = (String) element$iv;
        if (str == null || (strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(str, "=", (String) null, 2, (Object) null)) == null) {
            return null;
        }
        return StringsKt__StringsKt.trim((CharSequence) strSubstringAfter$default).toString();
    }

    private static final float loadTags$parseF(String s, float def) {
        Float floatOrNull;
        return (s == null || (floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(s)) == null) ? def : floatOrNull.floatValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final boolean loadTags$parseB(String s, boolean def) {
        String string = s != null ? StringsKt__StringsKt.trim((CharSequence) s).toString() : null;
        if (string != null) {
            switch (string.hashCode()) {
                case 48:
                    if (!string.equals(CommonUrlParts.Values.FALSE_INTEGER)) {
                        return def;
                    }
                    return false;
                case 49:
                    if (!string.equals("1")) {
                        return def;
                    }
                    return true;
                case 3551:
                    if (!string.equals(DebugKt.DEBUG_PROPERTY_VALUE_ON)) {
                        return def;
                    }
                    return true;
                case 109935:
                    if (!string.equals(DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                        return def;
                    }
                    return false;
                case 3569038:
                    if (!string.equals("true")) {
                        return def;
                    }
                    return true;
                case 97196323:
                    if (!string.equals("false")) {
                        return def;
                    }
                    return false;
                default:
                    return def;
            }
        }
        return def;
    }

    private final void saveTags(Context ctx, TagConfig cfg) throws IOException {
        File file = configFile(ctx);
        if (file == null) {
            return;
        }
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            file.createNewFile();
        }
        List original = CollectionsKt___CollectionsKt.toMutableList((Collection) FilesKt.readLines$default(file, null, 1, null));
        int index$iv = 0;
        Iterator it = original.iterator();
        while (true) {
            if (it.hasNext()) {
                Object item$iv = it.next();
                String it2 = (String) item$iv;
                if (Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) it2).toString(), "[tags]")) {
                    break;
                } else {
                    index$iv++;
                }
            } else {
                index$iv = -1;
                break;
            }
        }
        int tagStart = index$iv;
        if (tagStart >= 0) {
            int tagEnd = original.size();
            int size = original.size();
            for (int i = tagStart + 1; i < size; i++) {
                String s = StringsKt__StringsKt.trim((CharSequence) original.get(i)).toString();
                if (StringsKt__StringsJVMKt.startsWith$default(s, "[", false, 2, null) && StringsKt__StringsJVMKt.endsWith$default(s, "]", false, 2, null)) {
                    tagEnd = i;
                    break;
                }
            }
            original.subList(tagStart, tagEnd).clear();
        } else {
            if (!original.isEmpty() && !StringsKt__StringsKt.isBlank((CharSequence) CollectionsKt___CollectionsKt.last(original))) {
                original.add("");
            }
            tagStart = original.size();
        }
        List $this$saveTags_u24lambda_u2484 = CollectionsKt__CollectionsJVMKt.createListBuilder();
        $this$saveTags_u24lambda_u2484.add("[tags]");
        $this$saveTags_u24lambda_u2484.add("enabled=" + saveTags$bool01(cfg.getEnabled()));
        $this$saveTags_u24lambda_u2484.add("nameToBarGapMul=" + saveTags$fmt(cfg.getNameToBarGapMul()));
        $this$saveTags_u24lambda_u2484.add("hpWidthRef_640=" + saveTags$fmt(cfg.getHpWidthRef640()));
        $this$saveTags_u24lambda_u2484.add("hpHeightRef_480=" + saveTags$fmt(cfg.getHpHeightRef480()));
        $this$saveTags_u24lambda_u2484.add("outlinePx=" + saveTags$fmt(cfg.getOutlinePx()));
        $this$saveTags_u24lambda_u2484.add("roundPx=" + saveTags$fmt(cfg.getRoundPx()));
        $this$saveTags_u24lambda_u2484.add("armorGapPx=" + saveTags$fmt(cfg.getArmorGapPx()));
        $this$saveTags_u24lambda_u2484.add("showHpText=" + saveTags$bool01(cfg.getShowHpText()));
        saveTags$lambda$84$addColor($this$saveTags_u24lambda_u2484, "hpText", cfg.getHpText());
        saveTags$lambda$84$addColor($this$saveTags_u24lambda_u2484, "bdr", cfg.getBorder());
        saveTags$lambda$84$addColor($this$saveTags_u24lambda_u2484, "bg", cfg.getHpBg());
        saveTags$lambda$84$addColor($this$saveTags_u24lambda_u2484, "hp", cfg.getHpFill());
        saveTags$lambda$84$addColor($this$saveTags_u24lambda_u2484, "ar", cfg.getArmorFill());
        saveTags$lambda$84$addColor($this$saveTags_u24lambda_u2484, "arBg", cfg.getArmorBg());
        List out = CollectionsKt__CollectionsJVMKt.build($this$saveTags_u24lambda_u2484);
        original.addAll(tagStart, out);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            FileOutputStream it3 = fileOutputStream;
            byte[] bytes = CollectionsKt___CollectionsKt.joinToString$default(original, "\n", null, null, 0, null, null, 62, null).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            it3.write(bytes);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileOutputStream, th);
                throw th2;
            }
        }
    }

    private static final String saveTags$fmt(float v) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.US, "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(v)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private static final String saveTags$bool01(boolean b) {
        return b ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
    }

    private static final void saveTags$lambda$84$addColor(List<String> list, String p, Rgba c) {
        list.add(p + "R=" + saveTags$fmt(c.getR()));
        list.add(p + "G=" + saveTags$fmt(c.getG()));
        list.add(p + "B=" + saveTags$fmt(c.getB()));
        list.add(p + "A=" + saveTags$fmt(c.getA()));
    }

    private final void copyInto(TagConfig dst, TagConfig src) {
        dst.setEnabled(src.getEnabled());
        dst.setNameToBarGapMul(src.getNameToBarGapMul());
        dst.setHpWidthRef640(src.getHpWidthRef640());
        dst.setHpHeightRef480(src.getHpHeightRef480());
        dst.setOutlinePx(src.getOutlinePx());
        dst.setRoundPx(src.getRoundPx());
        dst.setArmorGapPx(src.getArmorGapPx());
        dst.setShowHpText(src.getShowHpText());
        dst.setHpText(Rgba.copy$default(src.getHpText(), 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
        dst.setBorder(Rgba.copy$default(src.getBorder(), 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
        dst.setHpBg(Rgba.copy$default(src.getHpBg(), 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
        dst.setHpFill(Rgba.copy$default(src.getHpFill(), 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
        dst.setArmorFill(Rgba.copy$default(src.getArmorFill(), 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
        dst.setArmorBg(Rgba.copy$default(src.getArmorBg(), 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
    }
}
