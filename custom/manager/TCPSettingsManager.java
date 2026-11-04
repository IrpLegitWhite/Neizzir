package com.blackhub.bronline.neizzir.fragments.custom.manager;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import com.blackhub.bronline.game.gui.cases.CasesKeys;
import com.google.android.material.card.MaterialCardView;
import com.helpshift.proactive.InAppViewConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.FilesKt__FileReadWriteKt;
import kotlin.p040io.FilesKt__UtilsKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yuku.ambilwarna.AmbilWarnaDialog;

/* JADX INFO: compiled from: TCPSettingsManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 [2\u00020\u0001:\u0001[B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002JP\u0010\u001a\u001a&\u0012\u0004\u0012\u00020\u001c\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001b0\u001d0\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u001d2\u0006\u0010 \u001a\u00020!H\u0002J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u001d2\u0006\u0010 \u001a\u00020!H\u0002J6\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002J\u001e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e02H\u0002J\u0010\u00103\u001a\u0002042\u0006\u0010)\u001a\u00020&H\u0002J,\u00105\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u0019H\u0003J\b\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020$H\u0002J\b\u0010;\u001a\u00020.H\u0002J\b\u0010<\u001a\u000204H\u0002J\u0010\u0010=\u001a\u00020,2\u0006\u0010/\u001a\u000200H\u0002J,\u0010>\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\u0019H\u0002J\"\u0010@\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u0002000\u001b2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e02H\u0002J\b\u0010A\u001a\u00020BH\u0002J \u0010C\u001a\u0002042\u0006\u0010D\u001a\u00020\u00192\u0006\u0010E\u001a\u00020\n2\u0006\u0010F\u001a\u00020\nH\u0002J\u0010\u0010G\u001a\u00020,2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u0010H\u001a\u00020I2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010J\u001a\u00020\u000eH\u0002J\u001a\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010M\u001a\u00020\u00192\u0006\u0010N\u001a\u00020&H\u0002J\u0019\u0010O\u001a\u0004\u0018\u00010&2\b\u0010M\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010PJ8\u0010Q\u001a\u00020,2\u0006\u0010 \u001a\u00020!2\u001e\u0010R\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001b0\u001d2\u0006\u0010S\u001a\u00020\u000eH\u0002J\u0006\u0010T\u001a\u00020,J\u001c\u0010U\u001a\u00020,2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020,0WH\u0002J\b\u0010X\u001a\u00020,H\u0002J\u0010\u0010Y\u001a\u00020,2\u0006\u0010S\u001a\u00020\u000eH\u0002J\f\u0010Z\u001a\u00020&*\u00020&H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010¨\u0006\\"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/TCPSettingsManager;", "", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "ctx", "Landroid/content/Context;", "getCtx", "()Landroid/content/Context;", "density", "", "getDensity", "()F", "presetFolder", "Ljava/io/File;", "getPresetFolder", "()Ljava/io/File;", "presetFolder$delegate", "Lkotlin/Lazy;", "templateFile", "getTemplateFile", "templateFile$delegate", "buildDialogTitle", "Landroid/widget/TextView;", "text", "", "buildEditorLayout", "Lkotlin/Pair;", "Landroid/widget/ScrollView;", "", "Landroid/widget/EditText;", "keyFormats", "json", "Lorg/json/JSONObject;", "collectKeyFormats", "createActionButton", "Landroid/widget/LinearLayout;", "icon", "", "title", "subtitle", "color", "onClick", "Lkotlin/Function0;", "", "createActionsCard", "Lcom/google/android/material/card/MaterialCardView;", "spinner", "Landroid/widget/Spinner;", "presets", "", "createColorBoxBg", "Landroid/graphics/drawable/GradientDrawable;", "createColorInputField", "key", "initial", "createDivider", "Landroid/view/View;", "createHeader", "createHelpCard", "createInputBg", "createNewPreset", "createNormalInputField", "value", "createPresetSelector", "createRippleBackground", "Landroid/graphics/drawable/RippleDrawable;", "createRoundedBg", "colorHex", "alpha", InAppViewConstants.RADIUS, "deletePreset", "formatDescription", "Landroid/text/SpannableStringBuilder;", "generateNextPresetFile", "parseArray", "Lorg/json/JSONArray;", "s", "len", "parseRgb", "(Ljava/lang/String;)Ljava/lang/Integer;", "save", "editors", "file", "show", "showColorPicker", CasesKeys.ARRAY_BONUS_REWARDS_KEY, "Lkotlin/Function1;", "showHelpDialog", "showJsonEditorDialog", CalendarKeys.DAYS_GAME_KEY, "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class TCPSettingsManager {
    public static final String COLOR_ACCENT = "#00E5CC";
    public static final String COLOR_BG = "#0A0A0F";
    public static final String COLOR_CARD = "#1A1A1F";
    public static final String COLOR_DIVIDER = "#2D2D35";
    public static final String COLOR_HINT = "#808080";
    public static final String COLOR_PARAM_HIGHLIGHT = "#60A5FA";
    public static final String COLOR_PURPLE = "#A855F7";
    public static final String COLOR_RED = "#EF4444";
    public static final String COLOR_TEXT = "#FFFFFF";
    public static final String COLOR_YELLOW = "#EAB308";
    private final Fragment fragment;

    /* JADX INFO: renamed from: presetFolder$delegate, reason: from kotlin metadata */
    private final Lazy presetFolder;

    /* JADX INFO: renamed from: templateFile$delegate, reason: from kotlin metadata */
    private final Lazy templateFile;

    public TCPSettingsManager(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
        this.presetFolder = LazyKt__LazyJVMKt.lazy(new Function0<File>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager$presetFolder$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                File externalFilesDir = this.this$0.getCtx().getExternalFilesDir(null);
                return new File(externalFilesDir != null ? externalFilesDir.getParent() : null, "Custom/tcp/timecyclePresets");
            }
        });
        this.templateFile = LazyKt__LazyJVMKt.lazy(new Function0<File>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager$templateFile$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                return new File(this.this$0.getPresetFolder(), "timecyclePreset.json");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getCtx() {
        Context contextRequireContext = this.fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return contextRequireContext;
    }

    private final float getDensity() {
        return getCtx().getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: dp */
    private final int m1426dp(int $this$dp) {
        return (int) ($this$dp * getDensity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getPresetFolder() {
        return (File) this.presetFolder.getValue();
    }

    private final File getTemplateFile() {
        return (File) this.templateFile.getValue();
    }

    public final void show() {
        List<? extends File> listEmptyList;
        LinearLayout root = (LinearLayout) this.fragment.requireView().findViewById(C3715R.id.neizzir2_skySettingsLayout);
        if (root == null) {
            return;
        }
        root.setVisibility(0);
        root.removeAllViews();
        root.setBackgroundColor(Color.parseColor("#0A0A0F"));
        ScrollView scrollView = new ScrollView(getCtx());
        scrollView.setFillViewport(true);
        LinearLayout container = new LinearLayout(getCtx());
        container.setOrientation(1);
        container.setPadding(m1426dp(20), m1426dp(24), m1426dp(20), m1426dp(20));
        container.addView(createHeader());
        Object[] $this$sortedBy$iv = getPresetFolder().listFiles(new FileFilter() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager$$ExternalSyntheticLambda4
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return TCPSettingsManager.show$lambda$2(file);
            }
        });
        if ($this$sortedBy$iv == null || (listEmptyList = ArraysKt___ArraysKt.sortedWith($this$sortedBy$iv, new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager$show$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                File it = (File) t;
                File it2 = (File) t2;
                return ComparisonsKt__ComparisonsKt.compareValues(it.getName(), it2.getName());
            }
        })) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Pair<MaterialCardView, Spinner> pairCreatePresetSelector = createPresetSelector(listEmptyList);
        MaterialCardView presetCard = pairCreatePresetSelector.component1();
        Spinner spinner = pairCreatePresetSelector.component2();
        container.addView(presetCard);
        container.addView(createActionsCard(spinner, listEmptyList));
        container.addView(createHelpCard());
        scrollView.addView(container);
        root.addView(scrollView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean show$lambda$2(File f) {
        String name = f.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new Regex("timecyclePreset([4-9]|[1-9]\\d*)\\.json").matches(name);
    }

    private final LinearLayout createHeader() {
        LinearLayout $this$createHeader_u24lambda_u2411 = new LinearLayout(getCtx());
        $this$createHeader_u24lambda_u2411.setOrientation(0);
        $this$createHeader_u24lambda_u2411.setGravity(16);
        LinearLayout.LayoutParams $this$createHeader_u24lambda_u2411_u24lambda_u244 = new LinearLayout.LayoutParams(-1, -2);
        $this$createHeader_u24lambda_u2411_u24lambda_u244.bottomMargin = m1426dp(20);
        $this$createHeader_u24lambda_u2411.setLayoutParams($this$createHeader_u24lambda_u2411_u24lambda_u244);
        FrameLayout iconBg = new FrameLayout(getCtx());
        iconBg.setBackground(createRoundedBg("#A855F7", 0.15f, m1426dp(12)));
        iconBg.setLayoutParams(new LinearLayout.LayoutParams(m1426dp(44), m1426dp(44)));
        ImageView $this$createHeader_u24lambda_u2411_u24lambda_u246 = new ImageView(getCtx());
        $this$createHeader_u24lambda_u2411_u24lambda_u246.setImageResource(C3715R.drawable.neizzir19_ic_preset);
        $this$createHeader_u24lambda_u2411_u24lambda_u246.setColorFilter(Color.parseColor("#A855F7"));
        $this$createHeader_u24lambda_u2411_u24lambda_u246.setLayoutParams(new FrameLayout.LayoutParams(m1426dp(24), m1426dp(24), 17));
        iconBg.addView($this$createHeader_u24lambda_u2411_u24lambda_u246);
        LinearLayout $this$createHeader_u24lambda_u2411_u24lambda_u248 = new LinearLayout(getCtx());
        $this$createHeader_u24lambda_u2411_u24lambda_u248.setOrientation(1);
        LinearLayout.LayoutParams $this$createHeader_u24lambda_u2411_u24lambda_u248_u24lambda_u247 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$createHeader_u24lambda_u2411_u24lambda_u248_u24lambda_u247.setMarginStart(m1426dp(12));
        $this$createHeader_u24lambda_u2411_u24lambda_u248.setLayoutParams($this$createHeader_u24lambda_u2411_u24lambda_u248_u24lambda_u247);
        TextView $this$createHeader_u24lambda_u2411_u24lambda_u249 = new TextView(getCtx());
        $this$createHeader_u24lambda_u2411_u24lambda_u249.setText("TCP Пресеты");
        $this$createHeader_u24lambda_u2411_u24lambda_u249.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createHeader_u24lambda_u2411_u24lambda_u249.setTextSize(20.0f);
        $this$createHeader_u24lambda_u2411_u24lambda_u249.setTypeface($this$createHeader_u24lambda_u2411_u24lambda_u249.getTypeface(), 1);
        TextView $this$createHeader_u24lambda_u2411_u24lambda_u2410 = new TextView(getCtx());
        $this$createHeader_u24lambda_u2411_u24lambda_u2410.setText("Управление пресетами неба");
        $this$createHeader_u24lambda_u2411_u24lambda_u2410.setTextColor(Color.parseColor(COLOR_HINT));
        $this$createHeader_u24lambda_u2411_u24lambda_u2410.setTextSize(12.0f);
        $this$createHeader_u24lambda_u2411_u24lambda_u248.addView($this$createHeader_u24lambda_u2411_u24lambda_u249);
        $this$createHeader_u24lambda_u2411_u24lambda_u248.addView($this$createHeader_u24lambda_u2411_u24lambda_u2410);
        $this$createHeader_u24lambda_u2411.addView(iconBg);
        $this$createHeader_u24lambda_u2411.addView($this$createHeader_u24lambda_u2411_u24lambda_u248);
        return $this$createHeader_u24lambda_u2411;
    }

    private final Pair<MaterialCardView, Spinner> createPresetSelector(List<? extends File> presets) {
        MaterialCardView card = new MaterialCardView(getCtx());
        card.setRadius(m1426dp(16));
        card.setCardElevation(0.0f);
        card.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        LinearLayout.LayoutParams $this$createPresetSelector_u24lambda_u2413_u24lambda_u2412 = new LinearLayout.LayoutParams(-1, -2);
        $this$createPresetSelector_u24lambda_u2413_u24lambda_u2412.bottomMargin = m1426dp(12);
        card.setLayoutParams($this$createPresetSelector_u24lambda_u2413_u24lambda_u2412);
        LinearLayout container = new LinearLayout(getCtx());
        container.setOrientation(1);
        container.setPadding(m1426dp(20), m1426dp(16), m1426dp(20), m1426dp(16));
        TextView $this$createPresetSelector_u24lambda_u2415 = new TextView(getCtx());
        $this$createPresetSelector_u24lambda_u2415.setText("Выберите пресет");
        $this$createPresetSelector_u24lambda_u2415.setTextColor(Color.parseColor(COLOR_HINT));
        $this$createPresetSelector_u24lambda_u2415.setTextSize(13.0f);
        $this$createPresetSelector_u24lambda_u2415.setTypeface($this$createPresetSelector_u24lambda_u2415.getTypeface(), 1);
        Spinner $this$createPresetSelector_u24lambda_u2417 = new Spinner(getCtx());
        $this$createPresetSelector_u24lambda_u2417.setBackground(createInputBg());
        $this$createPresetSelector_u24lambda_u2417.setPadding(m1426dp(16), m1426dp(12), m1426dp(16), m1426dp(12));
        LinearLayout.LayoutParams $this$createPresetSelector_u24lambda_u2417_u24lambda_u2416 = new LinearLayout.LayoutParams(-1, -2);
        $this$createPresetSelector_u24lambda_u2417_u24lambda_u2416.topMargin = m1426dp(8);
        $this$createPresetSelector_u24lambda_u2417.setLayoutParams($this$createPresetSelector_u24lambda_u2417_u24lambda_u2416);
        Context ctx = getCtx();
        List<? extends File> $this$map$iv = presets;
        Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            File it = (File) item$iv$iv;
            destination$iv$iv.add(it.getName());
        }
        ArrayAdapter adapter = new ArrayAdapter(ctx, R.layout.simple_spinner_dropdown_item, (List) destination$iv$iv);
        $this$createPresetSelector_u24lambda_u2417.setAdapter((SpinnerAdapter) adapter);
        container.addView($this$createPresetSelector_u24lambda_u2415);
        container.addView($this$createPresetSelector_u24lambda_u2417);
        card.addView(container);
        return TuplesKt.m4423to(card, $this$createPresetSelector_u24lambda_u2417);
    }

    private final MaterialCardView createActionsCard(final Spinner spinner, List<? extends File> presets) {
        MaterialCardView card = new MaterialCardView(getCtx());
        card.setRadius(m1426dp(16));
        card.setCardElevation(0.0f);
        card.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        LinearLayout.LayoutParams $this$createActionsCard_u24lambda_u2420_u24lambda_u2419 = new LinearLayout.LayoutParams(-1, -2);
        $this$createActionsCard_u24lambda_u2420_u24lambda_u2419.bottomMargin = m1426dp(12);
        card.setLayoutParams($this$createActionsCard_u24lambda_u2420_u24lambda_u2419);
        LinearLayout container = new LinearLayout(getCtx());
        container.setOrientation(1);
        container.setPadding(m1426dp(20), m1426dp(20), m1426dp(20), m1426dp(20));
        LinearLayout createBtn = createActionButton(C3715R.drawable.neizzir19_ic_add, "Создать новый пресет", "На основе шаблона", "#00E5CC", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager$createActionsCard$createBtn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                this.this$0.createNewPreset(spinner);
            }
        });
        LinearLayout editBtn = createActionButton(C3715R.drawable.neizzir19_ic_settings, "Редактировать выбранный", "Изменить параметры пресета", "#A855F7", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager$createActionsCard$editBtn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                String selected;
                Object selectedItem = spinner.getSelectedItem();
                if (selectedItem == null || (selected = selectedItem.toString()) == null) {
                    return;
                }
                File selectedFile = new File(this.getPresetFolder(), selected);
                this.showJsonEditorDialog(selectedFile);
            }
        });
        LinearLayout deleteBtn = createActionButton(C3715R.drawable.neizzir19_ic_delete, "Удалить выбранный", "Безвозвратное удаление", "#EF4444", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager$createActionsCard$deleteBtn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                this.this$0.deletePreset(spinner);
            }
        });
        container.addView(createBtn);
        container.addView(createDivider());
        container.addView(editBtn);
        container.addView(createDivider());
        container.addView(deleteBtn);
        card.addView(container);
        return card;
    }

    private final MaterialCardView createHelpCard() {
        MaterialCardView card = new MaterialCardView(getCtx());
        card.setRadius(m1426dp(16));
        card.setCardElevation(0.0f);
        card.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        card.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout container = new LinearLayout(getCtx());
        container.setOrientation(1);
        container.setPadding(m1426dp(20), m1426dp(20), m1426dp(20), m1426dp(20));
        LinearLayout helpBtn = createActionButton(C3715R.drawable.neizzir19_ic_play_video, "Справочник параметров", "Описание всех настроек JSON", "#EAB308", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager$createHelpCard$helpBtn$1
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
                this.this$0.showHelpDialog();
            }
        });
        container.addView(helpBtn);
        card.addView(container);
        return card;
    }

    private final LinearLayout createActionButton(int icon, String title, String subtitle, String color, final Function0<Unit> onClick) {
        LinearLayout $this$createActionButton_u24lambda_u2432 = new LinearLayout(getCtx());
        $this$createActionButton_u24lambda_u2432.setOrientation(0);
        $this$createActionButton_u24lambda_u2432.setGravity(16);
        $this$createActionButton_u24lambda_u2432.setPadding(0, m1426dp(12), 0, m1426dp(12));
        $this$createActionButton_u24lambda_u2432.setBackground(createRippleBackground());
        $this$createActionButton_u24lambda_u2432.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TCPSettingsManager.createActionButton$lambda$32$lambda$24(onClick, view);
            }
        });
        $this$createActionButton_u24lambda_u2432.setClickable(true);
        $this$createActionButton_u24lambda_u2432.setFocusable(true);
        FrameLayout $this$createActionButton_u24lambda_u2432_u24lambda_u2425 = new FrameLayout(getCtx());
        $this$createActionButton_u24lambda_u2432_u24lambda_u2425.setBackground(createRoundedBg(color, 0.15f, m1426dp(10)));
        $this$createActionButton_u24lambda_u2432_u24lambda_u2425.setLayoutParams(new LinearLayout.LayoutParams(m1426dp(40), m1426dp(40)));
        ImageView $this$createActionButton_u24lambda_u2432_u24lambda_u2426 = new ImageView(getCtx());
        try {
            $this$createActionButton_u24lambda_u2432_u24lambda_u2426.setImageResource(icon);
        } catch (Exception e) {
        }
        $this$createActionButton_u24lambda_u2432_u24lambda_u2426.setColorFilter(Color.parseColor(color));
        $this$createActionButton_u24lambda_u2432_u24lambda_u2426.setLayoutParams(new FrameLayout.LayoutParams(m1426dp(22), m1426dp(22), 17));
        $this$createActionButton_u24lambda_u2432_u24lambda_u2425.addView($this$createActionButton_u24lambda_u2432_u24lambda_u2426);
        LinearLayout textLayout = new LinearLayout(getCtx());
        textLayout.setOrientation(1);
        LinearLayout.LayoutParams $this$createActionButton_u24lambda_u2432_u24lambda_u2428_u24lambda_u2427 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$createActionButton_u24lambda_u2432_u24lambda_u2428_u24lambda_u2427.setMarginStart(m1426dp(14));
        textLayout.setLayoutParams($this$createActionButton_u24lambda_u2432_u24lambda_u2428_u24lambda_u2427);
        TextView $this$createActionButton_u24lambda_u2432_u24lambda_u2429 = new TextView(getCtx());
        $this$createActionButton_u24lambda_u2432_u24lambda_u2429.setText(title);
        $this$createActionButton_u24lambda_u2432_u24lambda_u2429.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createActionButton_u24lambda_u2432_u24lambda_u2429.setTextSize(15.0f);
        $this$createActionButton_u24lambda_u2432_u24lambda_u2429.setTypeface($this$createActionButton_u24lambda_u2432_u24lambda_u2429.getTypeface(), 1);
        TextView $this$createActionButton_u24lambda_u2432_u24lambda_u2430 = new TextView(getCtx());
        $this$createActionButton_u24lambda_u2432_u24lambda_u2430.setText(subtitle);
        $this$createActionButton_u24lambda_u2432_u24lambda_u2430.setTextColor(Color.parseColor(COLOR_HINT));
        $this$createActionButton_u24lambda_u2432_u24lambda_u2430.setTextSize(12.0f);
        textLayout.addView($this$createActionButton_u24lambda_u2432_u24lambda_u2429);
        textLayout.addView($this$createActionButton_u24lambda_u2432_u24lambda_u2430);
        ImageView $this$createActionButton_u24lambda_u2432_u24lambda_u2431 = new ImageView(getCtx());
        $this$createActionButton_u24lambda_u2432_u24lambda_u2431.setImageResource(C3715R.drawable.neizzir19_ic_chevron);
        $this$createActionButton_u24lambda_u2432_u24lambda_u2431.setColorFilter(Color.parseColor("#404040"));
        $this$createActionButton_u24lambda_u2432_u24lambda_u2431.setLayoutParams(new LinearLayout.LayoutParams(m1426dp(24), m1426dp(24)));
        $this$createActionButton_u24lambda_u2432.addView($this$createActionButton_u24lambda_u2432_u24lambda_u2425);
        $this$createActionButton_u24lambda_u2432.addView(textLayout);
        $this$createActionButton_u24lambda_u2432.addView($this$createActionButton_u24lambda_u2432_u24lambda_u2431);
        return $this$createActionButton_u24lambda_u2432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createActionButton$lambda$32$lambda$24(Function0 onClick, View it) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        onClick.invoke();
    }

    private final View createDivider() {
        View $this$createDivider_u24lambda_u2434 = new View(getCtx());
        LinearLayout.LayoutParams $this$createDivider_u24lambda_u2434_u24lambda_u2433 = new LinearLayout.LayoutParams(-1, 1);
        $this$createDivider_u24lambda_u2434_u24lambda_u2433.setMargins(0, m1426dp(8), 0, m1426dp(8));
        $this$createDivider_u24lambda_u2434.setLayoutParams($this$createDivider_u24lambda_u2434_u24lambda_u2433);
        $this$createDivider_u24lambda_u2434.setBackgroundColor(Color.parseColor("#2D2D35"));
        return $this$createDivider_u24lambda_u2434;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createNewPreset(Spinner spinner) {
        if (!getTemplateFile().exists()) {
            Toast.makeText(getCtx(), "Шаблон не найден: timecyclePreset.json", 0).show();
            return;
        }
        File newFile = generateNextPresetFile();
        FilesKt__UtilsKt.copyTo$default(getTemplateFile(), newFile, false, 0, 6, null);
        Toast.makeText(getCtx(), "✓ Создан: " + newFile.getName(), 0).show();
        show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deletePreset(Spinner spinner) {
        String selected;
        Object selectedItem = spinner.getSelectedItem();
        if (selectedItem == null || (selected = selectedItem.toString()) == null) {
            return;
        }
        final File selectedFile = new File(getPresetFolder(), selected);
        new AlertDialog.Builder(getCtx()).setTitle("Удалить пресет?").setMessage("Вы действительно хотите удалить " + selected + '?').setPositiveButton("Удалить", new DialogInterface.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                TCPSettingsManager.deletePreset$lambda$35(selectedFile, this, dialogInterface, i);
            }
        }).setNegativeButton("Отмена", (DialogInterface.OnClickListener) null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deletePreset$lambda$35(File selectedFile, TCPSettingsManager this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(selectedFile, "$selectedFile");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (selectedFile.exists()) {
            selectedFile.delete();
            Toast.makeText(this$0.getCtx(), "✓ Удалено: " + selectedFile.getName(), 0).show();
            this$0.show();
        }
    }

    private final File generateNextPresetFile() {
        List numbers;
        List<String> groupValues;
        String str;
        File[] fileArrListFiles = getPresetFolder().listFiles(new FileFilter() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager$$ExternalSyntheticLambda5
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return TCPSettingsManager.generateNextPresetFile$lambda$36(file);
            }
        });
        if (fileArrListFiles != null) {
            int $i$f$mapNotNull = 0;
            Collection destination$iv$iv = new ArrayList();
            File[] fileArr = fileArrListFiles;
            int length = fileArr.length;
            int i = 0;
            while (i < length) {
                File file = fileArr[i];
                Regex regex = new Regex("timecyclePreset(\\d+)\\.json");
                String name = file.getName();
                File[] fileArr2 = fileArrListFiles;
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                int $i$f$mapNotNull2 = $i$f$mapNotNull;
                Integer intOrNull = null;
                File[] fileArr3 = fileArr;
                MatchResult matchResultFind$default = Regex.find$default(regex, name, 0, 2, null);
                if (matchResultFind$default != null && (groupValues = matchResultFind$default.getGroupValues()) != null && (str = groupValues.get(1)) != null) {
                    intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str);
                }
                if (intOrNull != null) {
                    destination$iv$iv.add(intOrNull);
                }
                i++;
                fileArrListFiles = fileArr2;
                $i$f$mapNotNull = $i$f$mapNotNull2;
                fileArr = fileArr3;
            }
            numbers = (List) destination$iv$iv;
        } else {
            numbers = CollectionsKt__CollectionsKt.emptyList();
        }
        Integer num = (Integer) CollectionsKt___CollectionsKt.m15992maxOrNull((Iterable<Float>) numbers);
        int nextIndex = (num != null ? num.intValue() : 3) + 1;
        return new File(getPresetFolder(), "timecyclePreset" + nextIndex + ".json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean generateNextPresetFile$lambda$36(File f) {
        String name = f.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new Regex("timecyclePreset(\\d+)\\.json").matches(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showJsonEditorDialog(final File file) {
        try {
            final JSONObject json = new JSONObject(FilesKt__FileReadWriteKt.readText$default(file, null, 1, null));
            Pair<ScrollView, Map<String, Pair<EditText, Object>>> pairBuildEditorLayout = buildEditorLayout(getCtx(), collectKeyFormats(json), json);
            ScrollView scrollView = pairBuildEditorLayout.component1();
            final Map<String, Pair<EditText, Object>> mapComponent2 = pairBuildEditorLayout.component2();
            AlertDialog $this$showJsonEditorDialog_u24lambda_u2439 = new AlertDialog.Builder(getCtx()).setCustomTitle(buildDialogTitle("Редактирование " + file.getName())).setView(scrollView).setPositiveButton("Сохранить", new DialogInterface.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    TCPSettingsManager.showJsonEditorDialog$lambda$38(this.f$0, json, mapComponent2, file, dialogInterface, i);
                }
            }).setNegativeButton("Отмена", (DialogInterface.OnClickListener) null).create();
            Window window = $this$showJsonEditorDialog_u24lambda_u2439.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0A0A0F")));
            }
            $this$showJsonEditorDialog_u24lambda_u2439.show();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getCtx(), "Ошибка при чтении JSON", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showJsonEditorDialog$lambda$38(TCPSettingsManager this$0, JSONObject json, Map editors, File file, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(json, "$json");
        Intrinsics.checkNotNullParameter(editors, "$editors");
        Intrinsics.checkNotNullParameter(file, "$file");
        this$0.save(json, editors, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showHelpDialog() {
        ScrollView $this$showHelpDialog_u24lambda_u2440 = new ScrollView(getCtx());
        $this$showHelpDialog_u24lambda_u2440.setFillViewport(true);
        $this$showHelpDialog_u24lambda_u2440.setOverScrollMode(2);
        $this$showHelpDialog_u24lambda_u2440.setBackgroundColor(Color.parseColor("#0A0A0F"));
        LinearLayout $this$showHelpDialog_u24lambda_u2441 = new LinearLayout(getCtx());
        $this$showHelpDialog_u24lambda_u2441.setOrientation(1);
        $this$showHelpDialog_u24lambda_u2441.setPadding(m1426dp(24), m1426dp(16), m1426dp(24), m1426dp(24));
        showHelpDialog$addSection$default(this, $this$showHelpDialog_u24lambda_u2441, "🌤️ Основные параметры", "• SkyTopRGB — цвет верхней части неба\n• SkyBottomRGB — цвет нижней части неба\n• SunCoreRGB — цвет ядра солнца (основное яркое пятно)\n• SunCoronaRGB — ореол солнца\n• CloudRGB — цвет облаков\n• FluffyBottomRGB — цвет основания облаков (низкий слой)", false, 16, null);
        showHelpDialog$addSection$default(this, $this$showHelpDialog_u24lambda_u2441, "🎨 Цвет и освещение", "• AmbientRGB — базовый окружающий свет, влияет на затенённые участки\n• DirectionalRGB — направленный свет (солнце/луна)\n• AmbientPhysicalRGB — общий цвет освещения сцены от физических источников (небо и окружение)\n• WaterRGBA — цвет воды (A — прозрачность)", false, 16, null);
        showHelpDialog$addSection$default(this, $this$showHelpDialog_u24lambda_u2441, "🌀 Эффекты и визуал", "• FogStart — дистанция, с которой начинается туман\n• PostFX1ARGB / PostFX2ARGB — постобработка цветокоррекции \n• FarClip — дальность прорисовки объектов (в метрах)", false, 16, null);
        showHelpDialog$addSection(this, $this$showHelpDialog_u24lambda_u2441, "⏰ Время и погода", "• TimePeriod — время от 0 до 23\n• Weather — ID погоды (1 — ясно, 2 — облачно, 3 — дождь и т.д.)", true);
        $this$showHelpDialog_u24lambda_u2440.addView($this$showHelpDialog_u24lambda_u2441);
        AlertDialog $this$showHelpDialog_u24lambda_u2446 = new AlertDialog.Builder(getCtx()).setCustomTitle(buildDialogTitle("Справочник параметров")).setView($this$showHelpDialog_u24lambda_u2440).setPositiveButton("Понятно", (DialogInterface.OnClickListener) null).create();
        Window window = $this$showHelpDialog_u24lambda_u2446.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0A0A0F")));
        }
        $this$showHelpDialog_u24lambda_u2446.show();
    }

    static /* synthetic */ void showHelpDialog$addSection$default(TCPSettingsManager tCPSettingsManager, LinearLayout linearLayout, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        showHelpDialog$addSection(tCPSettingsManager, linearLayout, str, str2, z);
    }

    private static final void showHelpDialog$addSection(TCPSettingsManager this$0, LinearLayout container, String title, String desc, boolean isLast) {
        TextView $this$showHelpDialog_u24addSection_u24lambda_u2442 = new TextView(this$0.getCtx());
        $this$showHelpDialog_u24addSection_u24lambda_u2442.setText(title);
        $this$showHelpDialog_u24addSection_u24lambda_u2442.setTextColor(Color.parseColor("#EAB308"));
        $this$showHelpDialog_u24addSection_u24lambda_u2442.setTextSize(16.0f);
        $this$showHelpDialog_u24addSection_u24lambda_u2442.setTypeface($this$showHelpDialog_u24addSection_u24lambda_u2442.getTypeface(), 1);
        $this$showHelpDialog_u24addSection_u24lambda_u2442.setPadding(0, this$0.m1426dp(16), 0, this$0.m1426dp(8));
        TextView $this$showHelpDialog_u24addSection_u24lambda_u2443 = new TextView(this$0.getCtx());
        $this$showHelpDialog_u24addSection_u24lambda_u2443.setText(this$0.formatDescription(desc));
        $this$showHelpDialog_u24addSection_u24lambda_u2443.setTextSize(14.0f);
        $this$showHelpDialog_u24addSection_u24lambda_u2443.setTextColor(Color.parseColor("#B0B0B0"));
        $this$showHelpDialog_u24addSection_u24lambda_u2443.setLineSpacing(8.0f, 1.0f);
        container.addView($this$showHelpDialog_u24addSection_u24lambda_u2442);
        container.addView($this$showHelpDialog_u24addSection_u24lambda_u2443);
        if (!isLast) {
            View divider = new View(this$0.getCtx());
            LinearLayout.LayoutParams $this$showHelpDialog_u24addSection_u24lambda_u2445_u24lambda_u2444 = new LinearLayout.LayoutParams(-1, 1);
            $this$showHelpDialog_u24addSection_u24lambda_u2445_u24lambda_u2444.setMargins(0, this$0.m1426dp(16), 0, 0);
            divider.setLayoutParams($this$showHelpDialog_u24addSection_u24lambda_u2445_u24lambda_u2444);
            divider.setBackgroundColor(Color.parseColor("#2D2D35"));
            container.addView(divider);
        }
    }

    private final SpannableStringBuilder formatDescription(String text) {
        SpannableStringBuilder builder = new SpannableStringBuilder(text);
        Regex regex = new Regex("•\\s+(\\w+)");
        int paramColor = Color.parseColor(COLOR_PARAM_HIGHLIGHT);
        Sequence $this$forEach$iv = Regex.findAll$default(regex, text, 0, 2, null);
        for (Object element$iv : $this$forEach$iv) {
            MatchResult match = (MatchResult) element$iv;
            String word = match.getGroupValues().get(1);
            int start = match.getRange().getFirst() + 2;
            int end = word.length() + start;
            builder.setSpan(new StyleSpan(1), start, end, 33);
            builder.setSpan(new ForegroundColorSpan(paramColor), start, end, 33);
        }
        return builder;
    }

    private final TextView buildDialogTitle(String text) {
        TextView $this$buildDialogTitle_u24lambda_u2448 = new TextView(getCtx());
        $this$buildDialogTitle_u24lambda_u2448.setText(text);
        $this$buildDialogTitle_u24lambda_u2448.setTextColor(Color.parseColor("#FFFFFF"));
        $this$buildDialogTitle_u24lambda_u2448.setTextSize(18.0f);
        $this$buildDialogTitle_u24lambda_u2448.setGravity(17);
        $this$buildDialogTitle_u24lambda_u2448.setPadding(m1426dp(16), m1426dp(20), m1426dp(16), m1426dp(10));
        $this$buildDialogTitle_u24lambda_u2448.setBackgroundColor(Color.parseColor("#0A0A0F"));
        $this$buildDialogTitle_u24lambda_u2448.setTypeface($this$buildDialogTitle_u24lambda_u2448.getTypeface(), 1);
        return $this$buildDialogTitle_u24lambda_u2448;
    }

    private final Map<String, Object> collectKeyFormats(JSONObject json) throws JSONException {
        Map map = new LinkedHashMap();
        Iterator<String> itKeys = json.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Object value = json.get(key);
            if (value instanceof JSONArray) {
                Intrinsics.checkNotNull(key);
                map.put(key, new Pair("array", Integer.valueOf(((JSONArray) value).length())));
            } else if (value instanceof Number) {
                Intrinsics.checkNotNull(key);
                map.put(key, value);
            } else {
                Intrinsics.checkNotNull(key);
                map.put(key, "");
            }
        }
        return map;
    }

    private final Pair<ScrollView, Map<String, Pair<EditText, Object>>> buildEditorLayout(Context ctx, Map<String, ? extends Object> keyFormats, JSONObject json) {
        String string;
        LinearLayout container = new LinearLayout(ctx);
        container.setOrientation(1);
        container.setPadding(m1426dp(20), m1426dp(20), m1426dp(20), m1426dp(20));
        Map editors = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : keyFormats.entrySet()) {
            String key = entry.getKey();
            Object fmt = entry.getValue();
            final Object value = json.opt(key);
            if (value instanceof JSONArray) {
                string = CollectionsKt___CollectionsKt.joinToString$default(RangesKt___RangesKt.until(0, ((JSONArray) value).length()), StringUtils.COMMA, null, null, 0, null, new Function1<Integer, CharSequence>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager$buildEditorLayout$currentValue$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final CharSequence invoke(int it) {
                        return String.valueOf(((JSONArray) value).getInt(it));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                }, 30, null);
            } else if (value == null || (string = value.toString()) == null) {
                string = "";
            }
            String currentValue = string;
            if (StringsKt__StringsJVMKt.endsWith(key, "RGB", true) || StringsKt__StringsJVMKt.endsWith(key, "RGBA", true)) {
                Pair<LinearLayout, EditText> pairCreateColorInputField = createColorInputField(ctx, key, currentValue);
                LinearLayout row = pairCreateColorInputField.component1();
                EditText et = pairCreateColorInputField.component2();
                container.addView(row);
                editors.put(key, TuplesKt.m4423to(et, fmt));
            } else {
                Pair<LinearLayout, EditText> pairCreateNormalInputField = createNormalInputField(ctx, key, currentValue);
                LinearLayout row2 = pairCreateNormalInputField.component1();
                EditText et2 = pairCreateNormalInputField.component2();
                container.addView(row2);
                editors.put(key, TuplesKt.m4423to(et2, fmt));
            }
        }
        ScrollView $this$buildEditorLayout_u24lambda_u2450 = new ScrollView(ctx);
        $this$buildEditorLayout_u24lambda_u2450.addView(container);
        $this$buildEditorLayout_u24lambda_u2450.setBackgroundColor(Color.parseColor("#0A0A0F"));
        return TuplesKt.m4423to($this$buildEditorLayout_u24lambda_u2450, editors);
    }

    private final Pair<LinearLayout, EditText> createNormalInputField(Context ctx, String key, String value) {
        LinearLayout row = new LinearLayout(ctx);
        row.setOrientation(1);
        LinearLayout.LayoutParams $this$createNormalInputField_u24lambda_u2452_u24lambda_u2451 = new LinearLayout.LayoutParams(-1, -2);
        $this$createNormalInputField_u24lambda_u2452_u24lambda_u2451.setMargins(0, 0, 0, m1426dp(16));
        row.setLayoutParams($this$createNormalInputField_u24lambda_u2452_u24lambda_u2451);
        TextView $this$createNormalInputField_u24lambda_u2453 = new TextView(ctx);
        $this$createNormalInputField_u24lambda_u2453.setText(key);
        $this$createNormalInputField_u24lambda_u2453.setTextColor(Color.parseColor(COLOR_HINT));
        $this$createNormalInputField_u24lambda_u2453.setTextSize(13.0f);
        $this$createNormalInputField_u24lambda_u2453.setTypeface($this$createNormalInputField_u24lambda_u2453.getTypeface(), 1);
        EditText et = new EditText(ctx);
        et.setInputType(1);
        et.setTextColor(Color.parseColor("#FFFFFF"));
        et.setHintTextColor(Color.parseColor(COLOR_HINT));
        et.setText(value);
        et.setBackground(createInputBg());
        et.setPadding(m1426dp(16), m1426dp(14), m1426dp(16), m1426dp(14));
        et.setTextSize(15.0f);
        LinearLayout.LayoutParams $this$createNormalInputField_u24lambda_u2455_u24lambda_u2454 = new LinearLayout.LayoutParams(-1, -2);
        $this$createNormalInputField_u24lambda_u2455_u24lambda_u2454.topMargin = m1426dp(8);
        et.setLayoutParams($this$createNormalInputField_u24lambda_u2455_u24lambda_u2454);
        row.addView($this$createNormalInputField_u24lambda_u2453);
        row.addView(et);
        return TuplesKt.m4423to(row, et);
    }

    private final Pair<LinearLayout, EditText> createColorInputField(Context ctx, String key, String initial) {
        LinearLayout container = new LinearLayout(ctx);
        container.setOrientation(1);
        LinearLayout.LayoutParams $this$createColorInputField_u24lambda_u2457_u24lambda_u2456 = new LinearLayout.LayoutParams(-1, -2);
        $this$createColorInputField_u24lambda_u2457_u24lambda_u2456.setMargins(0, 0, 0, m1426dp(16));
        container.setLayoutParams($this$createColorInputField_u24lambda_u2457_u24lambda_u2456);
        TextView $this$createColorInputField_u24lambda_u2458 = new TextView(ctx);
        $this$createColorInputField_u24lambda_u2458.setText(key);
        $this$createColorInputField_u24lambda_u2458.setTextColor(Color.parseColor(COLOR_HINT));
        $this$createColorInputField_u24lambda_u2458.setTextSize(13.0f);
        $this$createColorInputField_u24lambda_u2458.setTypeface($this$createColorInputField_u24lambda_u2458.getTypeface(), 1);
        LinearLayout row = new LinearLayout(ctx);
        row.setOrientation(0);
        row.setGravity(16);
        row.setBackground(createInputBg());
        row.setPadding(m1426dp(12), m1426dp(10), m1426dp(12), m1426dp(10));
        row.setClickable(true);
        row.setFocusable(true);
        LinearLayout.LayoutParams $this$createColorInputField_u24lambda_u2460_u24lambda_u2459 = new LinearLayout.LayoutParams(-1, -2);
        $this$createColorInputField_u24lambda_u2460_u24lambda_u2459.topMargin = m1426dp(8);
        row.setLayoutParams($this$createColorInputField_u24lambda_u2460_u24lambda_u2459);
        final View colorBox = new View(ctx);
        LinearLayout.LayoutParams $this$createColorInputField_u24lambda_u2462_u24lambda_u2461 = new LinearLayout.LayoutParams(m1426dp(36), m1426dp(36));
        $this$createColorInputField_u24lambda_u2462_u24lambda_u2461.setMarginEnd(m1426dp(12));
        colorBox.setLayoutParams($this$createColorInputField_u24lambda_u2462_u24lambda_u2461);
        Integer rgb = parseRgb(initial);
        colorBox.setBackground(createColorBoxBg(rgb != null ? rgb.intValue() : -1));
        final EditText $this$createColorInputField_u24lambda_u2465 = new EditText(ctx);
        $this$createColorInputField_u24lambda_u2465.setHint("R,G,B (0-255)");
        $this$createColorInputField_u24lambda_u2465.setInputType(1);
        $this$createColorInputField_u24lambda_u2465.setTextColor(Color.parseColor("#00E5CC"));
        $this$createColorInputField_u24lambda_u2465.setHintTextColor(Color.parseColor(COLOR_HINT));
        $this$createColorInputField_u24lambda_u2465.setText(initial);
        $this$createColorInputField_u24lambda_u2465.setTextSize(15.0f);
        $this$createColorInputField_u24lambda_u2465.setBackgroundColor(0);
        $this$createColorInputField_u24lambda_u2465.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        EditText $this$addTextChangedListener_u24default$iv = $this$createColorInputField_u24lambda_u2465;
        $this$addTextChangedListener_u24default$iv.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager$createColorInputField$lambda$65$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                Integer rgb2 = this.this$0.parseRgb(String.valueOf(s));
                if (rgb2 != null) {
                    int color = rgb2.intValue();
                    colorBox.setBackground(this.this$0.createColorBoxBg(color));
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        View.OnClickListener colorClick = new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TCPSettingsManager.createColorInputField$lambda$66(this.f$0, $this$createColorInputField_u24lambda_u2465, colorBox, view);
            }
        };
        colorBox.setOnClickListener(colorClick);
        row.setOnClickListener(colorClick);
        row.addView(colorBox);
        row.addView($this$createColorInputField_u24lambda_u2465);
        container.addView($this$createColorInputField_u24lambda_u2458);
        container.addView(row);
        return TuplesKt.m4423to(container, $this$createColorInputField_u24lambda_u2465);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createColorInputField$lambda$66(final TCPSettingsManager this$0, final EditText et, final View colorBox, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(et, "$et");
        Intrinsics.checkNotNullParameter(colorBox, "$colorBox");
        this$0.showColorPicker(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager$createColorInputField$colorClick$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int color) {
                et.setText(new StringBuilder().append(Color.red(color)).append(AbstractJsonLexerKt.COMMA).append(Color.green(color)).append(AbstractJsonLexerKt.COMMA).append(Color.blue(color)).toString());
                colorBox.setBackground(this$0.createColorBoxBg(color));
            }
        });
    }

    private final void save(JSONObject json, Map<String, ? extends Pair<? extends EditText, ? extends Object>> editors, File file) {
        Object doubleOrNull;
        try {
            for (Map.Entry<String, ? extends Pair<? extends EditText, ? extends Object>> entry : editors.entrySet()) {
                String key = entry.getKey();
                Pair<? extends EditText, ? extends Object> value = entry.getValue();
                EditText et = value.component1();
                Object fmt = value.component2();
                String text = StringsKt__StringsKt.trim((CharSequence) et.getText().toString()).toString();
                if (!(text.length() == 0)) {
                    if (fmt instanceof Pair) {
                        if (Intrinsics.areEqual(((Pair) fmt).getFirst(), "array") && (((Pair) fmt).getSecond() instanceof Integer)) {
                            Object second = ((Pair) fmt).getSecond();
                            Intrinsics.checkNotNull(second, "null cannot be cast to non-null type kotlin.Int");
                            JSONArray it = parseArray(text, ((Integer) second).intValue());
                            if (it != null) {
                                json.put(key, it);
                            }
                        }
                    } else if ((fmt instanceof Number) && ((doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(text)) != null || (doubleOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(text)) != null)) {
                        json.put(key, doubleOrNull);
                    }
                }
            }
            String string = json.toString(4);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            FilesKt__FileReadWriteKt.writeText$default(file, string, null, 2, null);
            Toast.makeText(getCtx(), "✓ Сохранено: " + file.getName(), 0).show();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getCtx(), "Ошибка сохранения", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x005b  */
    public final Integer parseRgb(String s) {
        List list;
        if (s != null) {
            try {
                Iterable iterableSplit$default = StringsKt__StringsKt.split$default((CharSequence) s, new String[]{StringUtils.COMMA}, false, 0, 6, (Object) null);
                if (iterableSplit$default == null) {
                    list = null;
                } else {
                    Iterable $this$map$iv = iterableSplit$default;
                    Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
                    for (Object item$iv$iv : $this$map$iv) {
                        String it = (String) item$iv$iv;
                        destination$iv$iv.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it).toString())));
                    }
                    list = (List) destination$iv$iv;
                }
            } catch (Exception e) {
                return null;
            }
        } else {
            list = null;
        }
        List parts = list;
        if (parts == null || parts.size() < 3) {
            return null;
        }
        return Integer.valueOf(Color.rgb(((Number) parts.get(0)).intValue(), ((Number) parts.get(1)).intValue(), ((Number) parts.get(2)).intValue()));
    }

    private final JSONArray parseArray(String s, int len) {
        try {
            Iterable $this$map$iv = StringsKt__StringsKt.split$default((CharSequence) s, new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, (Object) null);
            Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                String it = (String) item$iv$iv;
                destination$iv$iv.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it).toString())));
            }
            List parts = (List) destination$iv$iv;
            if (parts.size() == len) {
                return new JSONArray((Collection) parts);
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    private final void showColorPicker(final Function1<? super Integer, Unit> cb) {
        AmbilWarnaDialog dlg = new AmbilWarnaDialog(getCtx(), -1, new AmbilWarnaDialog.OnAmbilWarnaListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager$showColorPicker$dlg$1
            @Override // yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
            public void onOk(AmbilWarnaDialog d, int color) {
                Intrinsics.checkNotNullParameter(d, "d");
                cb.invoke(Integer.valueOf(color));
            }

            @Override // yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
            public void onCancel(AmbilWarnaDialog d) {
                Intrinsics.checkNotNullParameter(d, "d");
            }
        });
        dlg.show();
    }

    private final GradientDrawable createRoundedBg(String colorHex, float alpha, float radius) {
        int color = Color.parseColor(colorHex);
        GradientDrawable $this$createRoundedBg_u24lambda_u2470 = new GradientDrawable();
        $this$createRoundedBg_u24lambda_u2470.setShape(0);
        $this$createRoundedBg_u24lambda_u2470.setCornerRadius(radius);
        $this$createRoundedBg_u24lambda_u2470.setColor(Color.argb((int) (255 * alpha), Color.red(color), Color.green(color), Color.blue(color)));
        return $this$createRoundedBg_u24lambda_u2470;
    }

    private final GradientDrawable createInputBg() {
        GradientDrawable $this$createInputBg_u24lambda_u2471 = new GradientDrawable();
        $this$createInputBg_u24lambda_u2471.setShape(0);
        $this$createInputBg_u24lambda_u2471.setCornerRadius(m1426dp(12));
        $this$createInputBg_u24lambda_u2471.setColor(Color.parseColor("#2D2D35"));
        $this$createInputBg_u24lambda_u2471.setStroke(1, Color.parseColor("#404040"));
        return $this$createInputBg_u24lambda_u2471;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GradientDrawable createColorBoxBg(int color) {
        GradientDrawable $this$createColorBoxBg_u24lambda_u2472 = new GradientDrawable();
        $this$createColorBoxBg_u24lambda_u2472.setShape(0);
        $this$createColorBoxBg_u24lambda_u2472.setCornerRadius(m1426dp(8));
        $this$createColorBoxBg_u24lambda_u2472.setColor(color);
        $this$createColorBoxBg_u24lambda_u2472.setStroke(2, Color.parseColor("#FFFFFF33"));
        return $this$createColorBoxBg_u24lambda_u2472;
    }

    private final RippleDrawable createRippleBackground() {
        return new RippleDrawable(ColorStateList.valueOf(Color.parseColor("#33FFFFFF")), null, null);
    }
}
