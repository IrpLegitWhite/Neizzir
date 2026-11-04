package com.blackhub.bronline.neizzir.fragments.weapon.p025ui;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.C2493C;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import com.blackhub.bronline.neizzir.fragments.sborks.util.FileUtils;
import com.blackhub.bronline.neizzir.fragments.weapon.Weapon;
import com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.helpshift.network.NetworkResponseCodes;
import com.helpshift.proactive.InAppViewConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.FilesKt__FileReadWriteKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: compiled from: WeaponEditorFragment.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 N2\u00020\u0001:\u0003NOPB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0018H\u0002J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u000fH\u0002Jd\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0$2\u0006\u0010%\u001a\u00020!2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0'2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00142\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001b0'H\u0002J\b\u0010.\u001a\u00020/H\u0002J \u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000203H\u0002J\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0002J\u0010\u00107\u001a\u0002082\u0006\u0010 \u001a\u00020!H\u0002J\b\u00109\u001a\u00020\u001bH\u0002J\u0010\u0010:\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0002J$\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u001a\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u000f2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\b\u0010D\u001a\u00020\u001bH\u0002J\b\u0010E\u001a\u00020\u001bH\u0002J\u0010\u0010F\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010G\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020\u0018H\u0002J\b\u0010I\u001a\u00020\u001bH\u0002J\u0010\u0010J\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020\u0007H\u0002J\b\u0010L\u001a\u00020\u001bH\u0002J\b\u0010M\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Q"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/ui/WeaponEditorFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/blackhub/bronline/neizzir/fragments/weapon/ui/WeaponEditorFragment$WeaponsAdapter;", "allWeapons", "", "Lcom/blackhub/bronline/neizzir/fragments/weapon/Weapon;", "btnReset", "Lcom/google/android/material/button/MaterialButton;", "btnSave", "cbAntiReload", "Landroid/widget/CheckBox;", "cbAntiSpread", "contentContainer", "Landroid/view/View;", "filteredWeapons", "loaderContainer", "mainWeaponsOrder", "", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "showOnlyMain", "", "updatingPresetCheckboxes", "applyAntiReloadPreset", "", "enabled", "applyAntiSpreadStaticAimPreset", "applyFilterAndShow", "clearPresetBaselinesOnDisk", "context", "Landroid/content/Context;", "createHeaderView", "createPresetCard", "Lkotlin/Pair;", "ctx", CalendarKeys.DAYS_GAME_KEY, "Lkotlin/Function1;", "", "icon", "color", "title", "description", "onCheckedChange", "createRippleCircle", "Landroid/graphics/drawable/GradientDrawable;", "createRoundedBg", "colorHex", "alpha", "", InAppViewConstants.RADIUS, "filterMainWeapons", "all", "getPresetsFile", "Ljava/io/File;", "loadData", "loadPresetBaselinesFromDisk", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "resetToStock", "saveCurrent", "savePresetBaselinesToDisk", "setLoading", "loading", "setupHeaderAdapter", "showEditDialog", "weapon", "updateAllWeaponsFromFiltered", "updatePresetCheckboxesFromData", "Companion", "WeaponEditPagerAdapter", "WeaponsAdapter", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class WeaponEditorFragment extends Fragment {
    private static final String COLOR_ACCENT = "#00E5CC";
    private static final String COLOR_BG = "#0A0A0F";
    private static final String COLOR_BLUE = "#3B82F6";
    private static final String COLOR_CARD = "#1A1A1F";
    private static final String COLOR_DIVIDER = "#2D2D35";
    private static final String COLOR_HINT = "#808080";
    private static final String COLOR_ORANGE = "#F97316";
    private static final String COLOR_PURPLE = "#A855F7";
    private static final String COLOR_RED = "#EF4444";
    private static final String COLOR_TEXT = "#FFFFFF";
    private static final String COLOR_YELLOW = "#EAB308";
    private WeaponsAdapter adapter;
    private MaterialButton btnReset;
    private MaterialButton btnSave;
    private CheckBox cbAntiReload;
    private CheckBox cbAntiSpread;
    private View contentContainer;
    private View loaderContainer;
    private RecyclerView recyclerView;
    private boolean updatingPresetCheckboxes;
    private static final Map<String, Pair<Float, Float>> baselineAntiSpreadStaticAim = new LinkedHashMap();
    private static final Map<String, Integer> baselineAntiReload = new LinkedHashMap();
    private List<Weapon> allWeapons = new ArrayList();
    private List<Weapon> filteredWeapons = new ArrayList();
    private boolean showOnlyMain = true;
    private final List<String> mainWeaponsOrder = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"DESERT_EAGLE", "MP5", "AK47", "M4", "SNIPERRIFLE", "SHOTGUN", "SPAS12"});

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View view = inflater.inflate(C3715R.layout.neizzir13_fragment_weapon_editor, container, false);
        View viewFindViewById = view.findViewById(C3715R.id.neizzir13_contentContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.contentContainer = viewFindViewById;
        View viewFindViewById2 = view.findViewById(C3715R.id.neizzir13_loaderContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.loaderContainer = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(C3715R.id.neizzir13_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.recyclerView = (RecyclerView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(C3715R.id.neizzir13_btnSave);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.btnSave = (MaterialButton) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(C3715R.id.neizzir13_btnReset);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.btnReset = (MaterialButton) viewFindViewById5;
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        setupHeaderAdapter();
        Intrinsics.checkNotNull(view);
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        MaterialButton materialButton = this.btnSave;
        MaterialButton materialButton2 = null;
        if (materialButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnSave");
            materialButton = null;
        }
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WeaponEditorFragment.onViewCreated$lambda$0(this.f$0, view2);
            }
        });
        MaterialButton materialButton3 = this.btnReset;
        if (materialButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnReset");
        } else {
            materialButton2 = materialButton3;
        }
        materialButton2.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WeaponEditorFragment.onViewCreated$lambda$1(this.f$0, view2);
            }
        });
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(WeaponEditorFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.saveCurrent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(WeaponEditorFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.resetToStock();
    }

    private final void setupHeaderAdapter() {
        this.adapter = new WeaponsAdapter(new Function1<Weapon, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment.setupHeaderAdapter.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Weapon weapon) {
                invoke2(weapon);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Weapon weapon) {
                Intrinsics.checkNotNullParameter(weapon, "weapon");
                WeaponEditorFragment.this.showEditDialog(weapon);
            }
        }, new Function0<View>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment.setupHeaderAdapter.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                return WeaponEditorFragment.this.createHeaderView();
            }
        });
        RecyclerView recyclerView = this.recyclerView;
        WeaponsAdapter weaponsAdapter = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView = null;
        }
        WeaponsAdapter weaponsAdapter2 = this.adapter;
        if (weaponsAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            weaponsAdapter = weaponsAdapter2;
        }
        recyclerView.setAdapter(weaponsAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createHeaderView() {
        Context ctx = requireContext();
        Intrinsics.checkNotNullExpressionValue(ctx, "requireContext(...)");
        final float density = ctx.getResources().getDisplayMetrics().density;
        Function1<Integer, Integer> function1 = new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$createHeaderView$dp$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Integer invoke(int v) {
                return Integer.valueOf((int) (v * density));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        };
        LinearLayout $this$createHeaderView_u24lambda_u242 = new LinearLayout(ctx);
        $this$createHeaderView_u24lambda_u242.setOrientation(1);
        $this$createHeaderView_u24lambda_u242.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        LinearLayout $this$createHeaderView_u24lambda_u243 = new LinearLayout(ctx);
        $this$createHeaderView_u24lambda_u243.setOrientation(0);
        $this$createHeaderView_u24lambda_u243.setGravity(16);
        $this$createHeaderView_u24lambda_u243.setPadding(0, function1.invoke(24).intValue(), 0, 0);
        FrameLayout $this$createHeaderView_u24lambda_u245 = new FrameLayout(ctx);
        $this$createHeaderView_u24lambda_u245.setBackground(createRippleCircle());
        $this$createHeaderView_u24lambda_u245.setLayoutParams(new LinearLayout.LayoutParams(function1.invoke(40).intValue(), function1.invoke(40).intValue()));
        $this$createHeaderView_u24lambda_u245.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeaponEditorFragment.createHeaderView$lambda$5$lambda$4(this.f$0, view);
            }
        });
        ImageView $this$createHeaderView_u24lambda_u246 = new ImageView(ctx);
        $this$createHeaderView_u24lambda_u246.setImageResource(C3715R.drawable.neizzir19_ic_arrow_back);
        $this$createHeaderView_u24lambda_u246.setColorFilter(-1);
        $this$createHeaderView_u24lambda_u246.setLayoutParams(new FrameLayout.LayoutParams(function1.invoke(24).intValue(), function1.invoke(24).intValue(), 17));
        $this$createHeaderView_u24lambda_u245.addView($this$createHeaderView_u24lambda_u246);
        TextView $this$createHeaderView_u24lambda_u248 = new TextView(ctx);
        $this$createHeaderView_u24lambda_u248.setText("Редактор оружия");
        $this$createHeaderView_u24lambda_u248.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createHeaderView_u24lambda_u248.setTextSize(24.0f);
        $this$createHeaderView_u24lambda_u248.setTypeface($this$createHeaderView_u24lambda_u248.getTypeface(), 1);
        LinearLayout.LayoutParams $this$createHeaderView_u24lambda_u248_u24lambda_u247 = new LinearLayout.LayoutParams(-2, -2);
        $this$createHeaderView_u24lambda_u248_u24lambda_u247.setMarginStart(function1.invoke(12).intValue());
        $this$createHeaderView_u24lambda_u248.setLayoutParams($this$createHeaderView_u24lambda_u248_u24lambda_u247);
        $this$createHeaderView_u24lambda_u243.addView($this$createHeaderView_u24lambda_u245);
        $this$createHeaderView_u24lambda_u243.addView($this$createHeaderView_u24lambda_u248);
        $this$createHeaderView_u24lambda_u242.addView($this$createHeaderView_u24lambda_u243);
        MaterialCardView $this$createHeaderView_u24lambda_u2410 = new MaterialCardView(ctx);
        $this$createHeaderView_u24lambda_u2410.setRadius(function1.invoke(16).intValue());
        $this$createHeaderView_u24lambda_u2410.setCardElevation(0.0f);
        $this$createHeaderView_u24lambda_u2410.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        $this$createHeaderView_u24lambda_u2410.setStrokeWidth(0);
        LinearLayout.LayoutParams $this$createHeaderView_u24lambda_u2410_u24lambda_u249 = new LinearLayout.LayoutParams(-1, -2);
        $this$createHeaderView_u24lambda_u2410_u24lambda_u249.topMargin = function1.invoke(20).intValue();
        $this$createHeaderView_u24lambda_u2410.setLayoutParams($this$createHeaderView_u24lambda_u2410_u24lambda_u249);
        LinearLayout $this$createHeaderView_u24lambda_u2411 = new LinearLayout(ctx);
        $this$createHeaderView_u24lambda_u2411.setOrientation(0);
        $this$createHeaderView_u24lambda_u2411.setGravity(16);
        $this$createHeaderView_u24lambda_u2411.setPadding(function1.invoke(16).intValue(), function1.invoke(14).intValue(), function1.invoke(16).intValue(), function1.invoke(14).intValue());
        FrameLayout $this$createHeaderView_u24lambda_u2412 = new FrameLayout(ctx);
        $this$createHeaderView_u24lambda_u2412.setBackground(createRoundedBg("#F97316", 0.15f, function1.invoke(12).intValue()));
        $this$createHeaderView_u24lambda_u2412.setLayoutParams(new LinearLayout.LayoutParams(function1.invoke(44).intValue(), function1.invoke(44).intValue()));
        ImageView $this$createHeaderView_u24lambda_u2413 = new ImageView(ctx);
        $this$createHeaderView_u24lambda_u2413.setImageResource(C3715R.drawable.neizzir12_ic_weapon);
        $this$createHeaderView_u24lambda_u2413.setColorFilter(Color.parseColor("#F97316"));
        $this$createHeaderView_u24lambda_u2413.setLayoutParams(new FrameLayout.LayoutParams(function1.invoke(24).intValue(), function1.invoke(24).intValue(), 17));
        $this$createHeaderView_u24lambda_u2412.addView($this$createHeaderView_u24lambda_u2413);
        LinearLayout $this$createHeaderView_u24lambda_u2415 = new LinearLayout(ctx);
        $this$createHeaderView_u24lambda_u2415.setOrientation(1);
        LinearLayout.LayoutParams $this$createHeaderView_u24lambda_u2415_u24lambda_u2414 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$createHeaderView_u24lambda_u2415_u24lambda_u2414.setMarginStart(function1.invoke(14).intValue());
        $this$createHeaderView_u24lambda_u2415.setLayoutParams($this$createHeaderView_u24lambda_u2415_u24lambda_u2414);
        TextView $this$createHeaderView_u24lambda_u2416 = new TextView(ctx);
        $this$createHeaderView_u24lambda_u2416.setText("weapon.json");
        $this$createHeaderView_u24lambda_u2416.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createHeaderView_u24lambda_u2416.setTextSize(16.0f);
        $this$createHeaderView_u24lambda_u2416.setTypeface($this$createHeaderView_u24lambda_u2416.getTypeface(), 1);
        TextView $this$createHeaderView_u24lambda_u2417 = new TextView(ctx);
        $this$createHeaderView_u24lambda_u2417.setText("Настройка параметров оружия");
        $this$createHeaderView_u24lambda_u2417.setTextColor(Color.parseColor("#808080"));
        $this$createHeaderView_u24lambda_u2417.setTextSize(12.0f);
        $this$createHeaderView_u24lambda_u2415.addView($this$createHeaderView_u24lambda_u2416);
        $this$createHeaderView_u24lambda_u2415.addView($this$createHeaderView_u24lambda_u2417);
        $this$createHeaderView_u24lambda_u2411.addView($this$createHeaderView_u24lambda_u2412);
        $this$createHeaderView_u24lambda_u2411.addView($this$createHeaderView_u24lambda_u2415);
        $this$createHeaderView_u24lambda_u2410.addView($this$createHeaderView_u24lambda_u2411);
        $this$createHeaderView_u24lambda_u242.addView($this$createHeaderView_u24lambda_u2410);
        MaterialCardView $this$createHeaderView_u24lambda_u2419 = new MaterialCardView(ctx);
        $this$createHeaderView_u24lambda_u2419.setRadius(function1.invoke(12).intValue());
        $this$createHeaderView_u24lambda_u2419.setCardElevation(0.0f);
        $this$createHeaderView_u24lambda_u2419.setCardBackgroundColor(Color.parseColor("#2D2D35"));
        $this$createHeaderView_u24lambda_u2419.setStrokeWidth(0);
        $this$createHeaderView_u24lambda_u2419.setClickable(true);
        $this$createHeaderView_u24lambda_u2419.setFocusable(true);
        LinearLayout.LayoutParams $this$createHeaderView_u24lambda_u2419_u24lambda_u2418 = new LinearLayout.LayoutParams(-1, -2);
        $this$createHeaderView_u24lambda_u2419_u24lambda_u2418.topMargin = function1.invoke(12).intValue();
        $this$createHeaderView_u24lambda_u2419.setLayoutParams($this$createHeaderView_u24lambda_u2419_u24lambda_u2418);
        LinearLayout $this$createHeaderView_u24lambda_u2420 = new LinearLayout(ctx);
        $this$createHeaderView_u24lambda_u2420.setOrientation(0);
        $this$createHeaderView_u24lambda_u2420.setGravity(16);
        $this$createHeaderView_u24lambda_u2420.setPadding(function1.invoke(16).intValue(), function1.invoke(12).intValue(), function1.invoke(16).intValue(), function1.invoke(12).intValue());
        FrameLayout $this$createHeaderView_u24lambda_u2421 = new FrameLayout(ctx);
        $this$createHeaderView_u24lambda_u2421.setBackground(createRoundedBg("#A855F7", 0.15f, function1.invoke(10).intValue()));
        $this$createHeaderView_u24lambda_u2421.setLayoutParams(new LinearLayout.LayoutParams(function1.invoke(36).intValue(), function1.invoke(36).intValue()));
        ImageView $this$createHeaderView_u24lambda_u2422 = new ImageView(ctx);
        $this$createHeaderView_u24lambda_u2422.setImageResource(C3715R.drawable.neizzir19_ic_settings);
        $this$createHeaderView_u24lambda_u2422.setColorFilter(Color.parseColor("#A855F7"));
        $this$createHeaderView_u24lambda_u2422.setLayoutParams(new FrameLayout.LayoutParams(function1.invoke(20).intValue(), function1.invoke(20).intValue(), 17));
        $this$createHeaderView_u24lambda_u2421.addView($this$createHeaderView_u24lambda_u2422);
        final TextView $this$createHeaderView_u24lambda_u2424 = new TextView(ctx);
        $this$createHeaderView_u24lambda_u2424.setText(this.showOnlyMain ? "Основные оружия" : "Все оружия");
        $this$createHeaderView_u24lambda_u2424.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createHeaderView_u24lambda_u2424.setTextSize(15.0f);
        LinearLayout.LayoutParams $this$createHeaderView_u24lambda_u2424_u24lambda_u2423 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$createHeaderView_u24lambda_u2424_u24lambda_u2423.setMarginStart(function1.invoke(12).intValue());
        $this$createHeaderView_u24lambda_u2424.setLayoutParams($this$createHeaderView_u24lambda_u2424_u24lambda_u2423);
        ImageView $this$createHeaderView_u24lambda_u2425 = new ImageView(ctx);
        $this$createHeaderView_u24lambda_u2425.setImageResource(C3715R.drawable.neizzir19_ic_chevron_right);
        $this$createHeaderView_u24lambda_u2425.setColorFilter(Color.parseColor("#808080"));
        $this$createHeaderView_u24lambda_u2425.setLayoutParams(new LinearLayout.LayoutParams(function1.invoke(20).intValue(), function1.invoke(20).intValue()));
        $this$createHeaderView_u24lambda_u2420.addView($this$createHeaderView_u24lambda_u2421);
        $this$createHeaderView_u24lambda_u2420.addView($this$createHeaderView_u24lambda_u2424);
        $this$createHeaderView_u24lambda_u2420.addView($this$createHeaderView_u24lambda_u2425);
        $this$createHeaderView_u24lambda_u2419.addView($this$createHeaderView_u24lambda_u2420);
        $this$createHeaderView_u24lambda_u2419.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeaponEditorFragment.createHeaderView$lambda$26(this.f$0, $this$createHeaderView_u24lambda_u2424, view);
            }
        });
        $this$createHeaderView_u24lambda_u242.addView($this$createHeaderView_u24lambda_u2419);
        TextView $this$createHeaderView_u24lambda_u2428 = new TextView(ctx);
        $this$createHeaderView_u24lambda_u2428.setText("Быстрые пресеты");
        $this$createHeaderView_u24lambda_u2428.setTextColor(Color.parseColor("#808080"));
        $this$createHeaderView_u24lambda_u2428.setTextSize(13.0f);
        $this$createHeaderView_u24lambda_u2428.setTypeface($this$createHeaderView_u24lambda_u2428.getTypeface(), 1);
        LinearLayout.LayoutParams $this$createHeaderView_u24lambda_u2428_u24lambda_u2427 = new LinearLayout.LayoutParams(-2, -2);
        $this$createHeaderView_u24lambda_u2428_u24lambda_u2427.topMargin = function1.invoke(20).intValue();
        $this$createHeaderView_u24lambda_u2428_u24lambda_u2427.bottomMargin = function1.invoke(12).intValue();
        $this$createHeaderView_u24lambda_u2428.setLayoutParams($this$createHeaderView_u24lambda_u2428_u24lambda_u2427);
        $this$createHeaderView_u24lambda_u242.addView($this$createHeaderView_u24lambda_u2428);
        Pair<View, CheckBox> pairCreatePresetCard = createPresetCard(ctx, function1, C3715R.drawable.neizzir19_ic_target, "#EF4444", "Антиразброс + Статичный прицел", "Accuracy = 500, Range = 500", new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$createHeaderView$preset1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean isChecked) {
                if (!this.this$0.updatingPresetCheckboxes) {
                    this.this$0.applyAntiSpreadStaticAimPreset(isChecked);
                }
            }
        });
        this.cbAntiSpread = pairCreatePresetCard.getSecond();
        $this$createHeaderView_u24lambda_u242.addView(pairCreatePresetCard.getFirst());
        TextView $this$createHeaderView_u24lambda_u2430 = new TextView(ctx);
        $this$createHeaderView_u24lambda_u2430.setText("Список оружия");
        $this$createHeaderView_u24lambda_u2430.setTextColor(Color.parseColor("#808080"));
        $this$createHeaderView_u24lambda_u2430.setTextSize(13.0f);
        $this$createHeaderView_u24lambda_u2430.setTypeface($this$createHeaderView_u24lambda_u2430.getTypeface(), 1);
        LinearLayout.LayoutParams $this$createHeaderView_u24lambda_u2430_u24lambda_u2429 = new LinearLayout.LayoutParams(-2, -2);
        $this$createHeaderView_u24lambda_u2430_u24lambda_u2429.topMargin = function1.invoke(20).intValue();
        $this$createHeaderView_u24lambda_u2430_u24lambda_u2429.bottomMargin = function1.invoke(8).intValue();
        $this$createHeaderView_u24lambda_u2430.setLayoutParams($this$createHeaderView_u24lambda_u2430_u24lambda_u2429);
        $this$createHeaderView_u24lambda_u242.addView($this$createHeaderView_u24lambda_u2430);
        return $this$createHeaderView_u24lambda_u242;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createHeaderView$lambda$5$lambda$4(WeaponEditorFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getParentFragmentManager().popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createHeaderView$lambda$26(WeaponEditorFragment this$0, TextView modeText, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(modeText, "$modeText");
        this$0.showOnlyMain = !this$0.showOnlyMain;
        modeText.setText(this$0.showOnlyMain ? "Основные оружия" : "Все оружия");
        this$0.applyFilterAndShow();
        this$0.updatePresetCheckboxesFromData();
    }

    private final Pair<View, CheckBox> createPresetCard(Context ctx, Function1<? super Integer, Integer> dp, int icon, String color, String title, String description, final Function1<? super Boolean, Unit> onCheckedChange) {
        float density = ctx.getResources().getDisplayMetrics().density;
        MaterialCardView card = new MaterialCardView(ctx);
        card.setRadius(createPresetCard$dpLocal(density, 16));
        card.setCardElevation(0.0f);
        card.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        card.setStrokeWidth(0);
        LinearLayout.LayoutParams $this$createPresetCard_u24lambda_u2432_u24lambda_u2431 = new LinearLayout.LayoutParams(-1, -2);
        $this$createPresetCard_u24lambda_u2432_u24lambda_u2431.bottomMargin = createPresetCard$dpLocal(density, 8);
        card.setLayoutParams($this$createPresetCard_u24lambda_u2432_u24lambda_u2431);
        LinearLayout row = new LinearLayout(ctx);
        row.setOrientation(0);
        row.setGravity(16);
        row.setPadding(createPresetCard$dpLocal(density, 16), createPresetCard$dpLocal(density, 14), createPresetCard$dpLocal(density, 12), createPresetCard$dpLocal(density, 14));
        FrameLayout iconBg = new FrameLayout(ctx);
        iconBg.setBackground(createRoundedBg(color, 0.15f, createPresetCard$dpLocal(density, 10)));
        iconBg.setLayoutParams(new LinearLayout.LayoutParams(createPresetCard$dpLocal(density, 40), createPresetCard$dpLocal(density, 40)));
        ImageView $this$createPresetCard_u24lambda_u2435 = new ImageView(ctx);
        $this$createPresetCard_u24lambda_u2435.setImageResource(icon);
        $this$createPresetCard_u24lambda_u2435.setColorFilter(Color.parseColor(color));
        $this$createPresetCard_u24lambda_u2435.setLayoutParams(new FrameLayout.LayoutParams(createPresetCard$dpLocal(density, 22), createPresetCard$dpLocal(density, 22), 17));
        iconBg.addView($this$createPresetCard_u24lambda_u2435);
        LinearLayout texts = new LinearLayout(ctx);
        texts.setOrientation(1);
        LinearLayout.LayoutParams $this$createPresetCard_u24lambda_u2437_u24lambda_u2436 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$createPresetCard_u24lambda_u2437_u24lambda_u2436.setMarginStart(createPresetCard$dpLocal(density, 14));
        texts.setLayoutParams($this$createPresetCard_u24lambda_u2437_u24lambda_u2436);
        TextView $this$createPresetCard_u24lambda_u2438 = new TextView(ctx);
        $this$createPresetCard_u24lambda_u2438.setText(title);
        $this$createPresetCard_u24lambda_u2438.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createPresetCard_u24lambda_u2438.setTextSize(14.0f);
        TextView $this$createPresetCard_u24lambda_u2439 = new TextView(ctx);
        $this$createPresetCard_u24lambda_u2439.setText(description);
        $this$createPresetCard_u24lambda_u2439.setTextColor(Color.parseColor("#808080"));
        $this$createPresetCard_u24lambda_u2439.setTextSize(11.0f);
        texts.addView($this$createPresetCard_u24lambda_u2438);
        texts.addView($this$createPresetCard_u24lambda_u2439);
        CheckBox checkbox = new CheckBox(ctx);
        checkbox.setButtonTintList(ColorStateList.valueOf(Color.parseColor("#00E5CC")));
        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$$ExternalSyntheticLambda8
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                WeaponEditorFragment.createPresetCard$lambda$41$lambda$40(onCheckedChange, compoundButton, z);
            }
        });
        row.addView(iconBg);
        row.addView(texts);
        row.addView(checkbox);
        card.addView(row);
        return TuplesKt.m4423to(card, checkbox);
    }

    private static final int createPresetCard$dpLocal(float density, int v) {
        return (int) (v * density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createPresetCard$lambda$41$lambda$40(Function1 onCheckedChange, CompoundButton compoundButton, boolean isChecked) {
        Intrinsics.checkNotNullParameter(onCheckedChange, "$onCheckedChange");
        onCheckedChange.invoke(Boolean.valueOf(isChecked));
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$loadData$1 */
    /* JADX INFO: compiled from: WeaponEditorFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$loadData$1", m4426f = "WeaponEditorFragment.kt", m4427i = {}, m4428l = {TypedValues.CycleType.TYPE_WAVE_OFFSET}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C56041(Continuation<? super C56041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WeaponEditorFragment.this.new C56041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws Throwable {
            C56041 c56041;
            Exception e;
            C56041 c56042;
            WeaponEditorFragment weaponEditorFragment;
            C56041 coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        c56041 = this;
                        WeaponEditorFragment.this.setLoading(true);
                        try {
                            weaponEditorFragment = WeaponEditorFragment.this;
                            WeaponJsonRepository weaponJsonRepository = WeaponJsonRepository.INSTANCE;
                            Context contextRequireContext = WeaponEditorFragment.this.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                            c56041.L$0 = weaponEditorFragment;
                            c56041.label = 1;
                            Object objLoadWeapons = weaponJsonRepository.loadWeapons(contextRequireContext, c56041);
                            if (objLoadWeapons == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            $result = objLoadWeapons;
                            try {
                                weaponEditorFragment.allWeapons = CollectionsKt___CollectionsKt.toMutableList((Collection) $result);
                                WeaponEditorFragment weaponEditorFragment2 = WeaponEditorFragment.this;
                                Context contextRequireContext2 = WeaponEditorFragment.this.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                weaponEditorFragment2.loadPresetBaselinesFromDisk(contextRequireContext2);
                                WeaponEditorFragment.this.applyFilterAndShow();
                                WeaponEditorFragment.this.updatePresetCheckboxesFromData();
                                WeaponEditorFragment.this.setLoading(false);
                            } catch (Exception e2) {
                                C56041 c56043 = c56041;
                                e = e2;
                                $result = $result;
                                c56042 = c56043;
                                e.printStackTrace();
                                Toast.makeText(WeaponEditorFragment.this.requireContext(), "Ошибка загрузки: " + e.getMessage(), 1).show();
                                WeaponEditorFragment.this.setLoading(false);
                            } catch (Throwable th) {
                                C56041 c56044 = c56041;
                                th = th;
                                coroutine_suspended = c56044;
                                WeaponEditorFragment.this.setLoading(false);
                                throw th;
                            }
                            return Unit.INSTANCE;
                        } catch (Exception e3) {
                            e = e3;
                            c56042 = c56041;
                            e.printStackTrace();
                            Toast.makeText(WeaponEditorFragment.this.requireContext(), "Ошибка загрузки: " + e.getMessage(), 1).show();
                            WeaponEditorFragment.this.setLoading(false);
                            return Unit.INSTANCE;
                        } catch (Throwable th2) {
                            th = th2;
                            coroutine_suspended = c56041;
                            WeaponEditorFragment.this.setLoading(false);
                            throw th;
                        }
                    case 1:
                        c56042 = this;
                        WeaponEditorFragment weaponEditorFragment3 = (WeaponEditorFragment) c56042.L$0;
                        try {
                            ResultKt.throwOnFailure($result);
                            weaponEditorFragment = weaponEditorFragment3;
                            c56041 = c56042;
                            weaponEditorFragment.allWeapons = CollectionsKt___CollectionsKt.toMutableList((Collection) $result);
                            WeaponEditorFragment weaponEditorFragment4 = WeaponEditorFragment.this;
                            Context contextRequireContext3 = WeaponEditorFragment.this.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                            weaponEditorFragment4.loadPresetBaselinesFromDisk(contextRequireContext3);
                            WeaponEditorFragment.this.applyFilterAndShow();
                            WeaponEditorFragment.this.updatePresetCheckboxesFromData();
                            WeaponEditorFragment.this.setLoading(false);
                        } catch (Exception e4) {
                            e = e4;
                            e.printStackTrace();
                            Toast.makeText(WeaponEditorFragment.this.requireContext(), "Ошибка загрузки: " + e.getMessage(), 1).show();
                            WeaponEditorFragment.this.setLoading(false);
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    private final void loadData() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C56041(null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$resetToStock$1 */
    /* JADX INFO: compiled from: WeaponEditorFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$resetToStock$1", m4426f = "WeaponEditorFragment.kt", m4427i = {}, m4428l = {NetworkResponseCodes.AUTH_TOKEN_NOT_PROVIDED}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C56051(Continuation<? super C56051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WeaponEditorFragment.this.new C56051(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws Throwable {
            C56051 c56051;
            Exception e;
            C56051 c56052;
            WeaponEditorFragment weaponEditorFragment;
            C56051 coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        c56051 = this;
                        WeaponEditorFragment.this.setLoading(true);
                        try {
                            weaponEditorFragment = WeaponEditorFragment.this;
                            WeaponJsonRepository weaponJsonRepository = WeaponJsonRepository.INSTANCE;
                            Context contextRequireContext = WeaponEditorFragment.this.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                            c56051.L$0 = weaponEditorFragment;
                            c56051.label = 1;
                            Object objResetToStock = weaponJsonRepository.resetToStock(contextRequireContext, c56051);
                            if (objResetToStock == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            $result = objResetToStock;
                            try {
                                weaponEditorFragment.allWeapons = CollectionsKt___CollectionsKt.toMutableList((Collection) $result);
                                WeaponEditorFragment.baselineAntiSpreadStaticAim.clear();
                                WeaponEditorFragment.baselineAntiReload.clear();
                                WeaponEditorFragment weaponEditorFragment2 = WeaponEditorFragment.this;
                                Context contextRequireContext2 = WeaponEditorFragment.this.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                weaponEditorFragment2.clearPresetBaselinesOnDisk(contextRequireContext2);
                                WeaponEditorFragment.this.applyFilterAndShow();
                                WeaponEditorFragment.this.updatePresetCheckboxesFromData();
                                Toast.makeText(WeaponEditorFragment.this.requireContext(), "✓ Сброшено на сток", 0).show();
                                WeaponEditorFragment.this.setLoading(false);
                            } catch (Exception e2) {
                                C56051 c56053 = c56051;
                                e = e2;
                                $result = $result;
                                c56052 = c56053;
                                Toast.makeText(WeaponEditorFragment.this.requireContext(), "Ошибка сброса: " + e.getMessage(), 1).show();
                                WeaponEditorFragment.this.setLoading(false);
                            } catch (Throwable th) {
                                C56051 c56054 = c56051;
                                th = th;
                                coroutine_suspended = c56054;
                                WeaponEditorFragment.this.setLoading(false);
                                throw th;
                            }
                            return Unit.INSTANCE;
                        } catch (Exception e3) {
                            e = e3;
                            c56052 = c56051;
                            Toast.makeText(WeaponEditorFragment.this.requireContext(), "Ошибка сброса: " + e.getMessage(), 1).show();
                            WeaponEditorFragment.this.setLoading(false);
                            return Unit.INSTANCE;
                        } catch (Throwable th2) {
                            th = th2;
                            coroutine_suspended = c56051;
                            WeaponEditorFragment.this.setLoading(false);
                            throw th;
                        }
                    case 1:
                        c56052 = this;
                        WeaponEditorFragment weaponEditorFragment3 = (WeaponEditorFragment) c56052.L$0;
                        try {
                            ResultKt.throwOnFailure($result);
                            weaponEditorFragment = weaponEditorFragment3;
                            c56051 = c56052;
                            weaponEditorFragment.allWeapons = CollectionsKt___CollectionsKt.toMutableList((Collection) $result);
                            WeaponEditorFragment.baselineAntiSpreadStaticAim.clear();
                            WeaponEditorFragment.baselineAntiReload.clear();
                            WeaponEditorFragment weaponEditorFragment4 = WeaponEditorFragment.this;
                            Context contextRequireContext3 = WeaponEditorFragment.this.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                            weaponEditorFragment4.clearPresetBaselinesOnDisk(contextRequireContext3);
                            WeaponEditorFragment.this.applyFilterAndShow();
                            WeaponEditorFragment.this.updatePresetCheckboxesFromData();
                            Toast.makeText(WeaponEditorFragment.this.requireContext(), "✓ Сброшено на сток", 0).show();
                            WeaponEditorFragment.this.setLoading(false);
                        } catch (Exception e4) {
                            e = e4;
                            Toast.makeText(WeaponEditorFragment.this.requireContext(), "Ошибка сброса: " + e.getMessage(), 1).show();
                            WeaponEditorFragment.this.setLoading(false);
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    private final void resetToStock() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C56051(null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$saveCurrent$1 */
    /* JADX INFO: compiled from: WeaponEditorFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$saveCurrent$1", m4426f = "WeaponEditorFragment.kt", m4427i = {}, m4428l = {460}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C56061(Continuation<? super C56061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WeaponEditorFragment.this.new C56061(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws Throwable {
            Throwable th;
            C56061 c56061;
            Exception e;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    WeaponEditorFragment.this.setLoading(true);
                    try {
                        WeaponJsonRepository weaponJsonRepository = WeaponJsonRepository.INSTANCE;
                        Context contextRequireContext = WeaponEditorFragment.this.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        this.label = 1;
                        if (weaponJsonRepository.saveWeapons(contextRequireContext, WeaponEditorFragment.this.allWeapons, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c56061 = this;
                        Toast.makeText(WeaponEditorFragment.this.requireContext(), "✓ Сохранено", 0).show();
                        WeaponEditorFragment.this.setLoading(false);
                        return Unit.INSTANCE;
                    } catch (Exception e2) {
                        e = e2;
                        c56061 = this;
                        Toast.makeText(WeaponEditorFragment.this.requireContext(), "Ошибка сохранения: " + e.getMessage(), 1).show();
                    } catch (Throwable th2) {
                        th = th2;
                        c56061 = this;
                        WeaponEditorFragment.this.setLoading(false);
                        throw th;
                    }
                    break;
                case 1:
                    c56061 = this;
                    try {
                        try {
                            ResultKt.throwOnFailure($result);
                            Toast.makeText(WeaponEditorFragment.this.requireContext(), "✓ Сохранено", 0).show();
                        } catch (Throwable th3) {
                            th = th3;
                            WeaponEditorFragment.this.setLoading(false);
                            throw th;
                        }
                        break;
                    } catch (Exception e3) {
                        e = e3;
                        Toast.makeText(WeaponEditorFragment.this.requireContext(), "Ошибка сохранения: " + e.getMessage(), 1).show();
                        break;
                    }
                    WeaponEditorFragment.this.setLoading(false);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final void saveCurrent() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C56061(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyFilterAndShow() {
        List<Weapon> mutableList;
        if (this.showOnlyMain) {
            mutableList = filterMainWeapons(this.allWeapons);
        } else {
            Iterable $this$filter$iv = this.allWeapons;
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv : $this$filter$iv) {
                Weapon weapon = (Weapon) element$iv$iv;
                boolean z = false;
                if (!CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 1, 9}).contains(Integer.valueOf(weapon.getWeaponCategory())) && !CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"MELEE", "NONE", "USE", "CAMERA"}).contains(weapon.getFireType())) {
                    z = true;
                }
                if (z) {
                    destination$iv$iv.add(element$iv$iv);
                }
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList(destination$iv$iv);
        }
        this.filteredWeapons = mutableList;
        WeaponsAdapter weaponsAdapter = this.adapter;
        if (weaponsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            weaponsAdapter = null;
        }
        Iterable $this$sortedBy$iv = this.filteredWeapons;
        weaponsAdapter.submitList(CollectionsKt___CollectionsKt.sortedWith($this$sortedBy$iv, new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$applyFilterAndShow$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Weapon it = (Weapon) t;
                Weapon it2 = (Weapon) t2;
                return ComparisonsKt__ComparisonsKt.compareValues(it.getUniqueName(), it2.getUniqueName());
            }
        }));
    }

    private final List<Weapon> filterMainWeapons(List<Weapon> all) {
        List<Weapon> $this$associateBy$iv = all;
        int capacity$iv = RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$associateBy$iv, 10)), 16);
        Map destination$iv$iv = new LinkedHashMap(capacity$iv);
        for (Object element$iv$iv : $this$associateBy$iv) {
            Weapon it = (Weapon) element$iv$iv;
            String upperCase = it.getUniqueName().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            destination$iv$iv.put(upperCase, element$iv$iv);
        }
        Iterable $this$mapNotNull$iv = this.mainWeaponsOrder;
        Collection destination$iv$iv2 = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            String it2 = (String) element$iv$iv$iv;
            Object upperCase2 = it2.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            Weapon weapon = (Weapon) destination$iv$iv.get(upperCase2);
            if (weapon != null) {
                destination$iv$iv2.add(weapon);
            }
        }
        return CollectionsKt___CollectionsKt.toMutableList(destination$iv$iv2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyAntiSpreadStaticAimPreset(boolean enabled) {
        Iterable $this$forEachIndexed$iv;
        if (this.filteredWeapons.isEmpty()) {
            return;
        }
        Iterable $this$forEachIndexed$iv2 = this.filteredWeapons;
        int index = 0;
        for (Object item$iv : $this$forEachIndexed$iv2) {
            int index$iv = index + 1;
            if (index < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Weapon weapon = (Weapon) item$iv;
            if (enabled) {
                Map<String, Pair<Float, Float>> map = baselineAntiSpreadStaticAim;
                String upperCase = weapon.getUniqueName().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                map.put(upperCase, new Pair<>(Float.valueOf(weapon.getAccuracy()), Float.valueOf(weapon.getRange())));
                $this$forEachIndexed$iv = $this$forEachIndexed$iv2;
                this.filteredWeapons.set(index, weapon.copy((263720191 & 1) != 0 ? weapon.id : 0, (263720191 & 2) != 0 ? weapon.uniqueName : null, (263720191 & 4) != 0 ? weapon.modelId : 0, (263720191 & 8) != 0 ? weapon.name : null, (263720191 & 16) != 0 ? weapon.image : null, (263720191 & 32) != 0 ? weapon.weaponCategory : 0, (263720191 & 64) != 0 ? weapon.weaponSlot : null, (263720191 & 128) != 0 ? weapon.fireType : null, (263720191 & 256) != 0 ? weapon.range : 500.0f, (263720191 & 512) != 0 ? weapon.radius : 0.0f, (263720191 & 1024) != 0 ? weapon.ammo : 0, (263720191 & 2048) != 0 ? weapon.damage : 0.0f, (263720191 & 4096) != 0 ? weapon.firingRate : 0.0f, (263720191 & 8192) != 0 ? weapon.accuracy : 500.0f, (263720191 & 16384) != 0 ? weapon.moveSpeed : 0.0f, (263720191 & 32768) != 0 ? weapon.flags : 0, (263720191 & 65536) != 0 ? weapon.speed : 0.0f, (263720191 & 131072) != 0 ? weapon.lifespan : 0.0f, (263720191 & 262144) != 0 ? weapon.spread : 0.0f, (263720191 & 524288) != 0 ? weapon.animGrpName : null, (263720191 & 1048576) != 0 ? weapon.animStand : null, (263720191 & 2097152) != 0 ? weapon.animCrouch : null, (263720191 & 4194304) != 0 ? weapon.animBreakout : 0, (263720191 & 8388608) != 0 ? weapon.fireOffset : null, (263720191 & 16777216) != 0 ? weapon.ammoType : null, (263720191 & 33554432) != 0 ? weapon.sight : null, (263720191 & 67108864) != 0 ? weapon.baseComboName : null, (263720191 & C2493C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? weapon.sourceJson : null));
            } else {
                $this$forEachIndexed$iv = $this$forEachIndexed$iv2;
                Map<String, Pair<Float, Float>> map2 = baselineAntiSpreadStaticAim;
                String upperCase2 = weapon.getUniqueName().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                Pair<Float, Float> pair = map2.get(upperCase2);
                if (pair != null) {
                    this.filteredWeapons.set(index, weapon.copy((263720191 & 1) != 0 ? weapon.id : 0, (263720191 & 2) != 0 ? weapon.uniqueName : null, (263720191 & 4) != 0 ? weapon.modelId : 0, (263720191 & 8) != 0 ? weapon.name : null, (263720191 & 16) != 0 ? weapon.image : null, (263720191 & 32) != 0 ? weapon.weaponCategory : 0, (263720191 & 64) != 0 ? weapon.weaponSlot : null, (263720191 & 128) != 0 ? weapon.fireType : null, (263720191 & 256) != 0 ? weapon.range : pair.getSecond().floatValue(), (263720191 & 512) != 0 ? weapon.radius : 0.0f, (263720191 & 1024) != 0 ? weapon.ammo : 0, (263720191 & 2048) != 0 ? weapon.damage : 0.0f, (263720191 & 4096) != 0 ? weapon.firingRate : 0.0f, (263720191 & 8192) != 0 ? weapon.accuracy : pair.getFirst().floatValue(), (263720191 & 16384) != 0 ? weapon.moveSpeed : 0.0f, (263720191 & 32768) != 0 ? weapon.flags : 0, (263720191 & 65536) != 0 ? weapon.speed : 0.0f, (263720191 & 131072) != 0 ? weapon.lifespan : 0.0f, (263720191 & 262144) != 0 ? weapon.spread : 0.0f, (263720191 & 524288) != 0 ? weapon.animGrpName : null, (263720191 & 1048576) != 0 ? weapon.animStand : null, (263720191 & 2097152) != 0 ? weapon.animCrouch : null, (263720191 & 4194304) != 0 ? weapon.animBreakout : 0, (263720191 & 8388608) != 0 ? weapon.fireOffset : null, (263720191 & 16777216) != 0 ? weapon.ammoType : null, (263720191 & 33554432) != 0 ? weapon.sight : null, (263720191 & 67108864) != 0 ? weapon.baseComboName : null, (263720191 & C2493C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? weapon.sourceJson : null));
                }
            }
            index = index$iv;
            $this$forEachIndexed$iv2 = $this$forEachIndexed$iv;
        }
        if (!enabled) {
            baselineAntiSpreadStaticAim.clear();
        }
        updateAllWeaponsFromFiltered();
        applyFilterAndShow();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        savePresetBaselinesToDisk(contextRequireContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyAntiReloadPreset(boolean enabled) {
        if (!enabled) {
            baselineAntiReload.clear();
        }
    }

    private final void updateAllWeaponsFromFiltered() {
        Iterable $this$associateBy$iv = this.filteredWeapons;
        int capacity$iv = RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$associateBy$iv, 10)), 16);
        Map destination$iv$iv = new LinkedHashMap(capacity$iv);
        for (Object element$iv$iv : $this$associateBy$iv) {
            destination$iv$iv.put(((Weapon) element$iv$iv).getUniqueName(), element$iv$iv);
        }
        Iterable $this$forEachIndexed$iv = this.allWeapons;
        int index = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int index$iv = index + 1;
            if (index < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Weapon weapon = (Weapon) item$iv;
            Weapon it = (Weapon) destination$iv$iv.get(weapon.getUniqueName());
            if (it != null) {
                this.allWeapons.set(index, it);
            }
            index = index$iv;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    public final void updatePresetCheckboxesFromData() {
        boolean z;
        if (this.filteredWeapons.isEmpty()) {
            CheckBox checkBox = this.cbAntiSpread;
            if (checkBox == null) {
                return;
            }
            checkBox.setChecked(false);
            return;
        }
        boolean z2 = true;
        this.updatingPresetCheckboxes = true;
        CheckBox checkBox2 = this.cbAntiSpread;
        if (checkBox2 != null) {
            Iterable $this$all$iv = this.filteredWeapons;
            if (!($this$all$iv instanceof Collection) || !((Collection) $this$all$iv).isEmpty()) {
                for (Object element$iv : $this$all$iv) {
                    Weapon it = (Weapon) element$iv;
                    if (!(it.getAccuracy() == 500.0f)) {
                        z = false;
                    } else if (it.getRange() == 500.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        z2 = false;
                        break;
                    }
                }
            }
            checkBox2.setChecked(z2);
        }
        this.updatingPresetCheckboxes = false;
    }

    private final File getPresetsFile(Context context) {
        File parent = FileUtils.INSTANCE.externalFilesParent(context);
        File $this$getPresetsFile_u24lambda_u2452 = new File(new File(parent, TypedValues.Custom.NAME), "weapon");
        $this$getPresetsFile_u24lambda_u2452.mkdirs();
        return new File($this$getPresetsFile_u24lambda_u2452, "weapon_presets.json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadPresetBaselinesFromDisk(Context context) {
        baselineAntiSpreadStaticAim.clear();
        File file = getPresetsFile(context);
        if (file.exists()) {
            try {
                JSONObject root = new JSONObject(FilesKt__FileReadWriteKt.readText$default(file, null, 1, null));
                JSONObject obj = root.optJSONObject("antiSpreadStaticAim");
                if (obj != null) {
                    Iterator<String> itKeys = obj.keys();
                    Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
                    while (itKeys.hasNext()) {
                        Object element$iv = itKeys.next();
                        String name = (String) element$iv;
                        JSONObject pairObj = obj.optJSONObject(name);
                        if (pairObj != null) {
                            Intrinsics.checkNotNull(pairObj);
                            double acc = pairObj.optDouble("accuracy", Double.NaN);
                            double rng = pairObj.optDouble("range", Double.NaN);
                            if (!Double.isNaN(acc) && !Double.isNaN(rng)) {
                                Map<String, Pair<Float, Float>> map = baselineAntiSpreadStaticAim;
                                Intrinsics.checkNotNull(name);
                                try {
                                    map.put(name, new Pair<>(Float.valueOf((float) acc), Float.valueOf((float) rng)));
                                } catch (Exception e) {
                                }
                            }
                        }
                        root = root;
                        file = file;
                        obj = obj;
                    }
                    return;
                }
                return;
            } catch (Exception e2) {
            }
            baselineAntiSpreadStaticAim.clear();
        }
    }

    private final void savePresetBaselinesToDisk(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject antiSpreadObj = new JSONObject();
            for (Map.Entry<String, Pair<Float, Float>> entry : baselineAntiSpreadStaticAim.entrySet()) {
                String name = entry.getKey();
                Pair<Float, Float> value = entry.getValue();
                JSONObject $this$savePresetBaselinesToDisk_u24lambda_u2457_u24lambda_u2456 = new JSONObject();
                $this$savePresetBaselinesToDisk_u24lambda_u2457_u24lambda_u2456.put("accuracy", value.getFirst().floatValue());
                $this$savePresetBaselinesToDisk_u24lambda_u2457_u24lambda_u2456.put("range", value.getSecond().floatValue());
                Unit unit = Unit.INSTANCE;
                antiSpreadObj.put(name, $this$savePresetBaselinesToDisk_u24lambda_u2457_u24lambda_u2456);
            }
            jSONObject.put("antiSpreadStaticAim", antiSpreadObj);
            File $this$savePresetBaselinesToDisk_u24lambda_u2458 = getPresetsFile(context);
            File parentFile = $this$savePresetBaselinesToDisk_u24lambda_u2458.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            FilesKt__FileReadWriteKt.writeText$default($this$savePresetBaselinesToDisk_u24lambda_u2458, string, null, 2, null);
        } catch (Exception e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearPresetBaselinesOnDisk(Context context) {
        try {
            getPresetsFile(context).delete();
        } catch (Exception e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showEditDialog(final Weapon weapon) {
        Context ctx = requireContext();
        Intrinsics.checkNotNullExpressionValue(ctx, "requireContext(...)");
        float density = ctx.getResources().getDisplayMetrics().density;
        final Dialog dialog = new Dialog(ctx);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(true);
        FrameLayout $this$showEditDialog_u24lambda_u2459 = new FrameLayout(ctx);
        $this$showEditDialog_u24lambda_u2459.setBackgroundColor(Color.parseColor("#E6000000"));
        MaterialCardView card = new MaterialCardView(ctx);
        card.setRadius(showEditDialog$dp(density, 20));
        card.setCardElevation(0.0f);
        card.setCardBackgroundColor(Color.parseColor("#0A0A0F"));
        card.setStrokeWidth(0);
        FrameLayout.LayoutParams $this$showEditDialog_u24lambda_u2461 = new FrameLayout.LayoutParams(-1, -2);
        $this$showEditDialog_u24lambda_u2461.setMargins(showEditDialog$dp(density, 16), showEditDialog$dp(density, 48), showEditDialog$dp(density, 16), showEditDialog$dp(density, 48));
        $this$showEditDialog_u24lambda_u2461.gravity = 17;
        card.setLayoutParams($this$showEditDialog_u24lambda_u2461);
        LinearLayout $this$showEditDialog_u24lambda_u2462 = new LinearLayout(ctx);
        $this$showEditDialog_u24lambda_u2462.setOrientation(1);
        $this$showEditDialog_u24lambda_u2462.setPadding(showEditDialog$dp(density, 20), showEditDialog$dp(density, 20), showEditDialog$dp(density, 20), showEditDialog$dp(density, 20));
        LinearLayout header = new LinearLayout(ctx);
        header.setOrientation(0);
        header.setGravity(16);
        FrameLayout $this$showEditDialog_u24lambda_u2464 = new FrameLayout(ctx);
        $this$showEditDialog_u24lambda_u2464.setBackground(createRoundedBg("#F97316", 0.15f, showEditDialog$dp(density, 14)));
        $this$showEditDialog_u24lambda_u2464.setLayoutParams(new LinearLayout.LayoutParams(showEditDialog$dp(density, 52), showEditDialog$dp(density, 52)));
        ImageView $this$showEditDialog_u24lambda_u2465 = new ImageView(ctx);
        $this$showEditDialog_u24lambda_u2465.setImageResource(C3715R.drawable.neizzir12_ic_weapon);
        $this$showEditDialog_u24lambda_u2465.setColorFilter(Color.parseColor("#F97316"));
        $this$showEditDialog_u24lambda_u2465.setLayoutParams(new FrameLayout.LayoutParams(showEditDialog$dp(density, 28), showEditDialog$dp(density, 28), 17));
        $this$showEditDialog_u24lambda_u2464.addView($this$showEditDialog_u24lambda_u2465);
        LinearLayout $this$showEditDialog_u24lambda_u2467 = new LinearLayout(ctx);
        $this$showEditDialog_u24lambda_u2467.setOrientation(1);
        LinearLayout.LayoutParams $this$showEditDialog_u24lambda_u2467_u24lambda_u2466 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$showEditDialog_u24lambda_u2467_u24lambda_u2466.setMarginStart(showEditDialog$dp(density, 14));
        $this$showEditDialog_u24lambda_u2467.setLayoutParams($this$showEditDialog_u24lambda_u2467_u24lambda_u2466);
        TextView $this$showEditDialog_u24lambda_u2469 = new TextView(ctx);
        String name = weapon.getName();
        if (name.length() == 0) {
            name = weapon.getUniqueName();
        }
        $this$showEditDialog_u24lambda_u2469.setText(name);
        $this$showEditDialog_u24lambda_u2469.setTextColor(Color.parseColor("#FFFFFF"));
        $this$showEditDialog_u24lambda_u2469.setTextSize(18.0f);
        $this$showEditDialog_u24lambda_u2469.setTypeface($this$showEditDialog_u24lambda_u2469.getTypeface(), 1);
        TextView $this$showEditDialog_u24lambda_u2470 = new TextView(ctx);
        $this$showEditDialog_u24lambda_u2470.setText("ID: " + weapon.getId() + " • " + weapon.getUniqueName());
        $this$showEditDialog_u24lambda_u2470.setTextColor(Color.parseColor("#808080"));
        $this$showEditDialog_u24lambda_u2470.setTextSize(12.0f);
        $this$showEditDialog_u24lambda_u2467.addView($this$showEditDialog_u24lambda_u2469);
        $this$showEditDialog_u24lambda_u2467.addView($this$showEditDialog_u24lambda_u2470);
        FrameLayout $this$showEditDialog_u24lambda_u2472 = new FrameLayout(ctx);
        $this$showEditDialog_u24lambda_u2472.setBackground(createRippleCircle());
        $this$showEditDialog_u24lambda_u2472.setLayoutParams(new LinearLayout.LayoutParams(showEditDialog$dp(density, 36), showEditDialog$dp(density, 36)));
        $this$showEditDialog_u24lambda_u2472.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeaponEditorFragment.showEditDialog$lambda$72$lambda$71(dialog, view);
            }
        });
        ImageView $this$showEditDialog_u24lambda_u2473 = new ImageView(ctx);
        $this$showEditDialog_u24lambda_u2473.setImageResource(C3715R.drawable.neizzir19_ic_close);
        $this$showEditDialog_u24lambda_u2473.setColorFilter(Color.parseColor("#808080"));
        $this$showEditDialog_u24lambda_u2473.setLayoutParams(new FrameLayout.LayoutParams(showEditDialog$dp(density, 20), showEditDialog$dp(density, 20), 17));
        $this$showEditDialog_u24lambda_u2472.addView($this$showEditDialog_u24lambda_u2473);
        header.addView($this$showEditDialog_u24lambda_u2464);
        header.addView($this$showEditDialog_u24lambda_u2467);
        header.addView($this$showEditDialog_u24lambda_u2472);
        $this$showEditDialog_u24lambda_u2462.addView(header);
        TabLayout $this$showEditDialog_u24lambda_u2475 = new TabLayout(ctx);
        $this$showEditDialog_u24lambda_u2475.setTabMode(0);
        $this$showEditDialog_u24lambda_u2475.setTabGravity(2);
        $this$showEditDialog_u24lambda_u2475.setBackgroundColor(0);
        $this$showEditDialog_u24lambda_u2475.setSelectedTabIndicatorColor(Color.parseColor("#00E5CC"));
        $this$showEditDialog_u24lambda_u2475.setTabTextColors(Color.parseColor("#808080"), Color.parseColor("#00E5CC"));
        LinearLayout.LayoutParams $this$showEditDialog_u24lambda_u2475_u24lambda_u2474 = new LinearLayout.LayoutParams(-1, -2);
        $this$showEditDialog_u24lambda_u2475_u24lambda_u2474.topMargin = showEditDialog$dp(density, 16);
        $this$showEditDialog_u24lambda_u2475.setLayoutParams($this$showEditDialog_u24lambda_u2475_u24lambda_u2474);
        ViewPager2 viewPager = new ViewPager2(ctx);
        viewPager.setAdapter(new WeaponEditPagerAdapter(this, weapon, ctx));
        LinearLayout.LayoutParams $this$showEditDialog_u24lambda_u2477_u24lambda_u2476 = new LinearLayout.LayoutParams(-1, showEditDialog$dp(density, 350));
        $this$showEditDialog_u24lambda_u2477_u24lambda_u2476.topMargin = showEditDialog$dp(density, 8);
        viewPager.setLayoutParams($this$showEditDialog_u24lambda_u2477_u24lambda_u2476);
        new TabLayoutMediator($this$showEditDialog_u24lambda_u2475, viewPager, new TabLayoutMediator.TabConfigurationStrategy() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$$ExternalSyntheticLambda5
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                WeaponEditorFragment.showEditDialog$lambda$78(tab, i);
            }
        }).attach();
        $this$showEditDialog_u24lambda_u2462.addView($this$showEditDialog_u24lambda_u2475);
        $this$showEditDialog_u24lambda_u2462.addView(viewPager);
        LinearLayout btnRow = new LinearLayout(ctx);
        btnRow.setOrientation(0);
        btnRow.setGravity(GravityCompat.END);
        LinearLayout.LayoutParams $this$showEditDialog_u24lambda_u2480_u24lambda_u2479 = new LinearLayout.LayoutParams(-1, -2);
        $this$showEditDialog_u24lambda_u2480_u24lambda_u2479.topMargin = showEditDialog$dp(density, 20);
        btnRow.setLayoutParams($this$showEditDialog_u24lambda_u2480_u24lambda_u2479);
        MaterialButton $this$showEditDialog_u24lambda_u2483 = new MaterialButton(ctx);
        $this$showEditDialog_u24lambda_u2483.setText("Отмена");
        $this$showEditDialog_u24lambda_u2483.setTextColor(Color.parseColor("#FFFFFF"));
        $this$showEditDialog_u24lambda_u2483.setBackgroundColor(Color.parseColor("#2D2D35"));
        $this$showEditDialog_u24lambda_u2483.setCornerRadius(showEditDialog$dp(density, 12));
        LinearLayout.LayoutParams $this$showEditDialog_u24lambda_u2483_u24lambda_u2481 = new LinearLayout.LayoutParams(0, showEditDialog$dp(density, 44), 1.0f);
        $this$showEditDialog_u24lambda_u2483_u24lambda_u2481.setMarginEnd(showEditDialog$dp(density, 8));
        $this$showEditDialog_u24lambda_u2483.setLayoutParams($this$showEditDialog_u24lambda_u2483_u24lambda_u2481);
        $this$showEditDialog_u24lambda_u2483.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeaponEditorFragment.showEditDialog$lambda$83$lambda$82(dialog, view);
            }
        });
        MaterialButton btnOk = new MaterialButton(ctx);
        btnOk.setText("Сохранить");
        btnOk.setTextColor(Color.parseColor("#000000"));
        btnOk.setBackgroundColor(Color.parseColor("#00E5CC"));
        btnOk.setCornerRadius(showEditDialog$dp(density, 12));
        LinearLayout.LayoutParams $this$showEditDialog_u24lambda_u2485_u24lambda_u2484 = new LinearLayout.LayoutParams(0, showEditDialog$dp(density, 44), 1.0f);
        $this$showEditDialog_u24lambda_u2485_u24lambda_u2484.setMarginStart(showEditDialog$dp(density, 8));
        btnOk.setLayoutParams($this$showEditDialog_u24lambda_u2485_u24lambda_u2484);
        btnRow.addView($this$showEditDialog_u24lambda_u2483);
        btnRow.addView(btnOk);
        $this$showEditDialog_u24lambda_u2462.addView(btnRow);
        card.addView($this$showEditDialog_u24lambda_u2462);
        $this$showEditDialog_u24lambda_u2459.addView(card);
        dialog.setContentView($this$showEditDialog_u24lambda_u2459);
        Window $this$showEditDialog_u24lambda_u2486 = dialog.getWindow();
        if ($this$showEditDialog_u24lambda_u2486 != null) {
            $this$showEditDialog_u24lambda_u2486.setLayout(-1, -1);
            $this$showEditDialog_u24lambda_u2486.setBackgroundDrawable(new ColorDrawable(0));
        }
        RecyclerView.Adapter adapter = viewPager.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment.WeaponEditPagerAdapter");
        final WeaponEditPagerAdapter pagerAdapter = (WeaponEditPagerAdapter) adapter;
        btnOk.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeaponEditorFragment.showEditDialog$lambda$88(pagerAdapter, this, dialog, weapon, view);
            }
        });
        dialog.show();
    }

    private static final int showEditDialog$dp(float density, int v) {
        return (int) (v * density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showEditDialog$lambda$72$lambda$71(Dialog dialog, View it) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showEditDialog$lambda$78(TabLayout.Tab tab, int position) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(tab, "tab");
        switch (position) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
        tab.setText(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showEditDialog$lambda$83$lambda$82(Dialog dialog, View it) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showEditDialog$lambda$88(WeaponEditPagerAdapter pagerAdapter, WeaponEditorFragment this$0, Dialog dialog, Weapon weapon, View it) {
        Intrinsics.checkNotNullParameter(pagerAdapter, "$pagerAdapter");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(weapon, "$weapon");
        Weapon updatedWeapon = pagerAdapter.getCurrentWeapon();
        int index$iv = 0;
        Iterator<Weapon> it2 = this$0.allWeapons.iterator();
        while (true) {
            if (it2.hasNext()) {
                Object item$iv = it2.next();
                Weapon it3 = (Weapon) item$iv;
                if (Intrinsics.areEqual(it3.getUniqueName(), weapon.getUniqueName())) {
                    break;
                } else {
                    index$iv++;
                }
            } else {
                index$iv = -1;
                break;
            }
        }
        int index = index$iv;
        if (index != -1) {
            this$0.allWeapons.set(index, updatedWeapon);
            this$0.applyFilterAndShow();
            this$0.updatePresetCheckboxesFromData();
        }
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: WeaponEditorFragment.kt */
    @Metadata(m4415d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001'B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ<\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0016J\u0006\u0010\u001f\u001a\u00020\u0005J \u0010 \u001a\u00020\r2\u000e\u0010!\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\"\u001a\u00020\u001cH\u0016J \u0010#\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/ui/WeaponEditorFragment$WeaponEditPagerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/neizzir/fragments/weapon/ui/WeaponEditorFragment$WeaponEditPagerAdapter$PageViewHolder;", "Lcom/blackhub/bronline/neizzir/fragments/weapon/ui/WeaponEditorFragment;", "weapon", "Lcom/blackhub/bronline/neizzir/fragments/weapon/Weapon;", "context", "Landroid/content/Context;", "(Lcom/blackhub/bronline/neizzir/fragments/weapon/ui/WeaponEditorFragment;Lcom/blackhub/bronline/neizzir/fragments/weapon/Weapon;Landroid/content/Context;)V", "currentWeapon", "density", "", "addStyledField", "", TtmlNode.RUBY_CONTAINER, "Landroid/widget/LinearLayout;", Constants.ScionAnalytics.PARAM_LABEL, "", "jsonName", "value", "", "onChange", "Lkotlin/Function1;", "createAdvancedTab", "createAnimationsTab", "createBasicTab", "createFlagsTab", CalendarKeys.DAYS_GAME_KEY, "", "v", "getItemCount", "getUpdatedWeapon", "onBindViewHolder", "holder", InAppViewConstants.POSITION, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "PageViewHolder", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    final class WeaponEditPagerAdapter extends RecyclerView.Adapter<PageViewHolder> {
        private final Context context;
        private Weapon currentWeapon;
        private final float density;
        final /* synthetic */ WeaponEditorFragment this$0;
        private final Weapon weapon;

        public WeaponEditPagerAdapter(WeaponEditorFragment this$0, Weapon weapon, Context context) {
            Intrinsics.checkNotNullParameter(weapon, "weapon");
            Intrinsics.checkNotNullParameter(context, "context");
            this.this$0 = this$0;
            this.weapon = weapon;
            this.context = context;
            Weapon weapon2 = this.weapon;
            this.currentWeapon = weapon2.copy((263720191 & 1) != 0 ? weapon2.id : 0, (263720191 & 2) != 0 ? weapon2.uniqueName : null, (263720191 & 4) != 0 ? weapon2.modelId : 0, (263720191 & 8) != 0 ? weapon2.name : null, (263720191 & 16) != 0 ? weapon2.image : null, (263720191 & 32) != 0 ? weapon2.weaponCategory : 0, (263720191 & 64) != 0 ? weapon2.weaponSlot : null, (263720191 & 128) != 0 ? weapon2.fireType : null, (263720191 & 256) != 0 ? weapon2.range : 0.0f, (263720191 & 512) != 0 ? weapon2.radius : 0.0f, (263720191 & 1024) != 0 ? weapon2.ammo : 0, (263720191 & 2048) != 0 ? weapon2.damage : 0.0f, (263720191 & 4096) != 0 ? weapon2.firingRate : 0.0f, (263720191 & 8192) != 0 ? weapon2.accuracy : 0.0f, (263720191 & 16384) != 0 ? weapon2.moveSpeed : 0.0f, (263720191 & 32768) != 0 ? weapon2.flags : 0, (263720191 & 65536) != 0 ? weapon2.speed : 0.0f, (263720191 & 131072) != 0 ? weapon2.lifespan : 0.0f, (263720191 & 262144) != 0 ? weapon2.spread : 0.0f, (263720191 & 524288) != 0 ? weapon2.animGrpName : null, (263720191 & 1048576) != 0 ? weapon2.animStand : null, (263720191 & 2097152) != 0 ? weapon2.animCrouch : null, (263720191 & 4194304) != 0 ? weapon2.animBreakout : 0, (263720191 & 8388608) != 0 ? weapon2.fireOffset : null, (263720191 & 16777216) != 0 ? weapon2.ammoType : null, (263720191 & 33554432) != 0 ? weapon2.sight : null, (263720191 & 67108864) != 0 ? weapon2.baseComboName : null, (263720191 & C2493C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? weapon2.sourceJson : null);
            this.density = this.context.getResources().getDisplayMetrics().density;
        }

        /* JADX INFO: renamed from: dp */
        private final int m1430dp(int v) {
            return (int) (v * this.density);
        }

        /* JADX INFO: compiled from: WeaponEditorFragment.kt */
        @Metadata(m4415d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/ui/WeaponEditorFragment$WeaponEditPagerAdapter$PageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/blackhub/bronline/neizzir/fragments/weapon/ui/WeaponEditorFragment$WeaponEditPagerAdapter;Landroid/view/View;)V", TtmlNode.RUBY_CONTAINER, "Landroid/widget/LinearLayout;", "getContainer", "()Landroid/widget/LinearLayout;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
        public final class PageViewHolder extends RecyclerView.ViewHolder {
            private final LinearLayout container;
            final /* synthetic */ WeaponEditPagerAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PageViewHolder(WeaponEditPagerAdapter this$0, View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "view");
                this.this$0 = this$0;
                this.container = (LinearLayout) view;
            }

            public final LinearLayout getContainer() {
                return this.container;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public PageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            LinearLayout $this$onCreateViewHolder_u24lambda_u240 = new LinearLayout(parent.getContext());
            $this$onCreateViewHolder_u24lambda_u240.setOrientation(1);
            $this$onCreateViewHolder_u24lambda_u240.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return new PageViewHolder(this, $this$onCreateViewHolder_u24lambda_u240);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(PageViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.getContainer().removeAllViews();
            switch (position) {
                case 0:
                    createBasicTab(holder.getContainer());
                    break;
                case 1:
                    createAdvancedTab(holder.getContainer());
                    break;
                case 2:
                    createAnimationsTab(holder.getContainer());
                    break;
                case 3:
                    createFlagsTab(holder.getContainer());
                    break;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 4;
        }

        private final void createBasicTab(LinearLayout container) {
            ScrollView scroll = new ScrollView(this.context);
            LinearLayout $this$createBasicTab_u24lambda_u241 = new LinearLayout(this.context);
            $this$createBasicTab_u24lambda_u241.setOrientation(1);
            $this$createBasicTab_u24lambda_u241.setPadding(0, m1430dp(8), 0, m1430dp(16));
            scroll.addView($this$createBasicTab_u24lambda_u241);
            addStyledField($this$createBasicTab_u24lambda_u241, "Accuracy", "accuracy", Float.valueOf(this.currentWeapon.getAccuracy()), new Function1<Number, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$WeaponEditPagerAdapter$createBasicTab$5
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Number number) {
                    invoke2(number);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Number it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.this$0.currentWeapon.setAccuracy(((Float) it).floatValue());
                }
            });
            addStyledField($this$createBasicTab_u24lambda_u241, "Move Speed", "moveSpeed", Float.valueOf(this.currentWeapon.getMoveSpeed()), new Function1<Number, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$WeaponEditPagerAdapter$createBasicTab$6
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Number number) {
                    invoke2(number);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Number it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.this$0.currentWeapon.setMoveSpeed(((Float) it).floatValue());
                }
            });
            addStyledField($this$createBasicTab_u24lambda_u241, HttpHeaders.RANGE, "range", Float.valueOf(this.currentWeapon.getRange()), new Function1<Number, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$WeaponEditPagerAdapter$createBasicTab$7
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Number number) {
                    invoke2(number);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Number it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.this$0.currentWeapon.setRange(((Float) it).floatValue());
                }
            });
            container.addView(scroll);
        }

        private final void createAdvancedTab(LinearLayout container) {
            ScrollView scroll = new ScrollView(this.context);
            LinearLayout $this$createAdvancedTab_u24lambda_u242 = new LinearLayout(this.context);
            $this$createAdvancedTab_u24lambda_u242.setOrientation(1);
            $this$createAdvancedTab_u24lambda_u242.setPadding(0, m1430dp(8), 0, m1430dp(16));
            scroll.addView($this$createAdvancedTab_u24lambda_u242);
            addStyledField($this$createAdvancedTab_u24lambda_u242, "Скорострельность", "firingRate", Float.valueOf(this.currentWeapon.getFiringRate()), new Function1<Number, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$WeaponEditPagerAdapter$createAdvancedTab$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Number number) {
                    invoke2(number);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Number it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.this$0.currentWeapon.setFiringRate(((Float) it).floatValue());
                }
            });
            addStyledField($this$createAdvancedTab_u24lambda_u242, "Радиус", InAppViewConstants.RADIUS, Float.valueOf(this.currentWeapon.getRadius()), new Function1<Number, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$WeaponEditPagerAdapter$createAdvancedTab$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Number number) {
                    invoke2(number);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Number it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.this$0.currentWeapon.setRadius(((Float) it).floatValue());
                }
            });
            addStyledField($this$createAdvancedTab_u24lambda_u242, "Скорость пули", "speed", Float.valueOf(this.currentWeapon.getSpeed()), new Function1<Number, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$WeaponEditPagerAdapter$createAdvancedTab$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Number number) {
                    invoke2(number);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Number it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.this$0.currentWeapon.setSpeed(((Float) it).floatValue());
                }
            });
            addStyledField($this$createAdvancedTab_u24lambda_u242, "Время жизни", "lifespan", Float.valueOf(this.currentWeapon.getLifespan()), new Function1<Number, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$WeaponEditPagerAdapter$createAdvancedTab$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Number number) {
                    invoke2(number);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Number it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.this$0.currentWeapon.setLifespan(((Float) it).floatValue());
                }
            });
            addStyledField($this$createAdvancedTab_u24lambda_u242, "Разброс", "spread", Float.valueOf(this.currentWeapon.getSpread()), new Function1<Number, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$WeaponEditPagerAdapter$createAdvancedTab$5
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Number number) {
                    invoke2(number);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Number it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.this$0.currentWeapon.setSpread(((Float) it).floatValue());
                }
            });
            container.addView(scroll);
        }

        private final void createAnimationsTab(LinearLayout container) {
            ScrollView scroll = new ScrollView(this.context);
            LinearLayout content = new LinearLayout(this.context);
            content.setOrientation(1);
            content.setPadding(0, m1430dp(8), 0, m1430dp(16));
            scroll.addView(content);
            TextView $this$createAnimationsTab_u24lambda_u244 = new TextView(this.context);
            $this$createAnimationsTab_u24lambda_u244.setText("Анимации и смещения");
            $this$createAnimationsTab_u24lambda_u244.setTextColor(Color.parseColor("#808080"));
            $this$createAnimationsTab_u24lambda_u244.setTextSize(13.0f);
            $this$createAnimationsTab_u24lambda_u244.setPadding(0, 0, 0, m1430dp(8));
            content.addView($this$createAnimationsTab_u24lambda_u244);
            addStyledField(content, "Breakout", "animBreakout", Integer.valueOf(this.currentWeapon.getAnimBreakout()), new Function1<Number, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$WeaponEditPagerAdapter$createAnimationsTab$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Number number) {
                    invoke2(number);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Number it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.this$0.currentWeapon.setAnimBreakout(((Integer) it).intValue());
                }
            });
            container.addView(scroll);
        }

        private final void createFlagsTab(LinearLayout container) {
            ScrollView scroll = new ScrollView(this.context);
            LinearLayout content = new LinearLayout(this.context);
            content.setOrientation(1);
            content.setPadding(0, m1430dp(8), 0, m1430dp(16));
            scroll.addView(content);
            MaterialCardView card = new MaterialCardView(this.context);
            card.setRadius(m1430dp(12));
            card.setCardElevation(0.0f);
            card.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
            card.setStrokeWidth(0);
            card.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            LinearLayout cardContent = new LinearLayout(this.context);
            cardContent.setOrientation(1);
            cardContent.setPadding(m1430dp(14), m1430dp(12), m1430dp(14), m1430dp(12));
            TextView $this$createFlagsTab_u24lambda_u248 = new TextView(this.context);
            $this$createFlagsTab_u24lambda_u248.setText("Флаги (HEX)");
            $this$createFlagsTab_u24lambda_u248.setTextColor(Color.parseColor("#808080"));
            $this$createFlagsTab_u24lambda_u248.setTextSize(12.0f);
            EditText $this$createFlagsTab_u24lambda_u249 = new EditText(this.context);
            String string = Integer.toString(this.currentWeapon.getFlags(), CharsKt__CharJVMKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String upperCase = string.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            $this$createFlagsTab_u24lambda_u249.setText(upperCase);
            $this$createFlagsTab_u24lambda_u249.setTextColor(Color.parseColor("#00E5CC"));
            $this$createFlagsTab_u24lambda_u249.setHintTextColor(Color.parseColor("#808080"));
            $this$createFlagsTab_u24lambda_u249.setTextSize(18.0f);
            $this$createFlagsTab_u24lambda_u249.setBackground(null);
            $this$createFlagsTab_u24lambda_u249.setInputType(4096);
            $this$createFlagsTab_u24lambda_u249.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$WeaponEditPagerAdapter$createFlagsTab$input$1$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    String string2;
                    Integer intOrNull;
                    this.this$0.currentWeapon.setFlags((s == null || (string2 = s.toString()) == null || (intOrNull = StringsKt.toIntOrNull(string2, 16)) == null) ? 0 : intOrNull.intValue());
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                }
            });
            cardContent.addView($this$createFlagsTab_u24lambda_u248);
            cardContent.addView($this$createFlagsTab_u24lambda_u249);
            card.addView(cardContent);
            content.addView(card);
            container.addView(scroll);
        }

        private final void addStyledField(LinearLayout container, String label, String jsonName, final Number value, final Function1<? super Number, Unit> onChange) {
            MaterialCardView card = new MaterialCardView(this.context);
            card.setRadius(m1430dp(12));
            card.setCardElevation(0.0f);
            card.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
            card.setStrokeWidth(0);
            LinearLayout.LayoutParams $this$addStyledField_u24lambda_u2411_u24lambda_u2410 = new LinearLayout.LayoutParams(-1, -2);
            $this$addStyledField_u24lambda_u2411_u24lambda_u2410.bottomMargin = m1430dp(8);
            card.setLayoutParams($this$addStyledField_u24lambda_u2411_u24lambda_u2410);
            LinearLayout row = new LinearLayout(this.context);
            row.setOrientation(0);
            row.setGravity(16);
            row.setPadding(m1430dp(14), m1430dp(10), m1430dp(14), m1430dp(10));
            TextView $this$addStyledField_u24lambda_u2413 = new TextView(this.context);
            $this$addStyledField_u24lambda_u2413.setText(label + " (" + jsonName + ')');
            $this$addStyledField_u24lambda_u2413.setTextColor(Color.parseColor("#FFFFFF"));
            $this$addStyledField_u24lambda_u2413.setTextSize(14.0f);
            $this$addStyledField_u24lambda_u2413.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            EditText $this$addStyledField_u24lambda_u2414 = new EditText(this.context);
            WeaponEditorFragment weaponEditorFragment = this.this$0;
            $this$addStyledField_u24lambda_u2414.setText(value.toString());
            $this$addStyledField_u24lambda_u2414.setTextColor(Color.parseColor("#00E5CC"));
            $this$addStyledField_u24lambda_u2414.setTextSize(16.0f);
            $this$addStyledField_u24lambda_u2414.setGravity(GravityCompat.END);
            $this$addStyledField_u24lambda_u2414.setBackground(weaponEditorFragment.createRoundedBg("#2D2D35", 1.0f, m1430dp(8)));
            $this$addStyledField_u24lambda_u2414.setPadding(m1430dp(12), m1430dp(8), m1430dp(12), m1430dp(8));
            $this$addStyledField_u24lambda_u2414.setLayoutParams(new LinearLayout.LayoutParams(m1430dp(100), -2));
            $this$addStyledField_u24lambda_u2414.setInputType(12290);
            $this$addStyledField_u24lambda_u2414.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$WeaponEditPagerAdapter$addStyledField$input$1$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    String string;
                    Float floatOrNull;
                    String string2;
                    Integer intOrNull;
                    Number number = value;
                    if (number instanceof Integer) {
                        if (s != null && (string2 = s.toString()) != null && (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(string2)) != null) {
                            Function1<Number, Unit> function1 = onChange;
                            int it = intOrNull.intValue();
                            function1.invoke(Integer.valueOf(it));
                            return;
                        }
                        return;
                    }
                    if ((number instanceof Float) && s != null && (string = s.toString()) != null && (floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string)) != null) {
                        Function1<Number, Unit> function2 = onChange;
                        float it2 = floatOrNull.floatValue();
                        function2.invoke(Float.valueOf(it2));
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                }
            });
            row.addView($this$addStyledField_u24lambda_u2413);
            row.addView($this$addStyledField_u24lambda_u2414);
            card.addView(row);
            container.addView(card);
        }

        /* JADX INFO: renamed from: getUpdatedWeapon, reason: from getter */
        public final Weapon getCurrentWeapon() {
            return this.currentWeapon;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLoading(boolean loading) {
        View view = this.loaderContainer;
        MaterialButton materialButton = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loaderContainer");
            view = null;
        }
        view.setVisibility(loading ? 0 : 8);
        View view2 = this.contentContainer;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentContainer");
            view2 = null;
        }
        view2.setAlpha(loading ? 0.5f : 1.0f);
        MaterialButton materialButton2 = this.btnSave;
        if (materialButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnSave");
            materialButton2 = null;
        }
        materialButton2.setEnabled(!loading);
        MaterialButton materialButton3 = this.btnReset;
        if (materialButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnReset");
        } else {
            materialButton = materialButton3;
        }
        materialButton.setEnabled(!loading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GradientDrawable createRoundedBg(String colorHex, float alpha, float radius) {
        int color = Color.parseColor(colorHex);
        GradientDrawable $this$createRoundedBg_u24lambda_u2489 = new GradientDrawable();
        $this$createRoundedBg_u24lambda_u2489.setShape(0);
        $this$createRoundedBg_u24lambda_u2489.setCornerRadius(radius);
        $this$createRoundedBg_u24lambda_u2489.setColor(Color.argb((int) (255 * alpha), Color.red(color), Color.green(color), Color.blue(color)));
        return $this$createRoundedBg_u24lambda_u2489;
    }

    private final GradientDrawable createRippleCircle() {
        GradientDrawable $this$createRippleCircle_u24lambda_u2490 = new GradientDrawable();
        $this$createRippleCircle_u24lambda_u2490.setShape(1);
        $this$createRippleCircle_u24lambda_u2490.setColor(Color.parseColor("#2D2D35"));
        return $this$createRippleCircle_u24lambda_u2490;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: WeaponEditorFragment.kt */
    @Metadata(m4415d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cB'\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0014\u0010\u0017\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/ui/WeaponEditorFragment$WeaponsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onItemClick", "Lkotlin/Function1;", "Lcom/blackhub/bronline/neizzir/fragments/weapon/Weapon;", "", "headerProvider", "Lkotlin/Function0;", "Landroid/view/View;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", FirebaseAnalytics.Param.ITEMS, "", "getItemCount", "", "getItemViewType", InAppViewConstants.POSITION, "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "newItems", "", "Companion", "HeaderViewHolder", "WeaponViewHolder", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    static final class WeaponsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private static final int TYPE_HEADER = 0;
        private static final int TYPE_ITEM = 1;
        private final Function0<View> headerProvider;
        private final List<Weapon> items;
        private final Function1<Weapon, Unit> onItemClick;

        /* JADX WARN: Multi-variable type inference failed */
        public WeaponsAdapter(Function1<? super Weapon, Unit> onItemClick, Function0<? extends View> headerProvider) {
            Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
            Intrinsics.checkNotNullParameter(headerProvider, "headerProvider");
            this.onItemClick = onItemClick;
            this.headerProvider = headerProvider;
            this.items = new ArrayList();
        }

        public final void submitList(List<Weapon> newItems) {
            Intrinsics.checkNotNullParameter(newItems, "newItems");
            this.items.clear();
            this.items.addAll(newItems);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            return position == 0 ? 0 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (viewType == 0) {
                return new HeaderViewHolder(this.headerProvider.invoke());
            }
            Context ctx = parent.getContext();
            float density = ctx.getResources().getDisplayMetrics().density;
            MaterialCardView card = new MaterialCardView(ctx);
            card.setRadius(onCreateViewHolder$dp(density, 16));
            card.setCardElevation(0.0f);
            card.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
            card.setStrokeWidth(0);
            card.setClickable(true);
            card.setFocusable(true);
            LinearLayout row = new LinearLayout(ctx);
            row.setOrientation(0);
            row.setGravity(16);
            row.setPadding(onCreateViewHolder$dp(density, 14), onCreateViewHolder$dp(density, 12), onCreateViewHolder$dp(density, 14), onCreateViewHolder$dp(density, 12));
            FrameLayout iconBg = new FrameLayout(ctx);
            GradientDrawable $this$onCreateViewHolder_u24lambda_u243_u24lambda_u242 = new GradientDrawable();
            $this$onCreateViewHolder_u24lambda_u243_u24lambda_u242.setShape(0);
            $this$onCreateViewHolder_u24lambda_u243_u24lambda_u242.setCornerRadius(onCreateViewHolder$dp(density, 10));
            $this$onCreateViewHolder_u24lambda_u243_u24lambda_u242.setColor(Color.parseColor("#26F97316"));
            iconBg.setBackground($this$onCreateViewHolder_u24lambda_u243_u24lambda_u242);
            iconBg.setLayoutParams(new LinearLayout.LayoutParams(onCreateViewHolder$dp(density, 40), onCreateViewHolder$dp(density, 40)));
            ImageView $this$onCreateViewHolder_u24lambda_u244 = new ImageView(ctx);
            $this$onCreateViewHolder_u24lambda_u244.setImageResource(C3715R.drawable.neizzir12_ic_weapon);
            $this$onCreateViewHolder_u24lambda_u244.setColorFilter(Color.parseColor("#F97316"));
            $this$onCreateViewHolder_u24lambda_u244.setLayoutParams(new FrameLayout.LayoutParams(onCreateViewHolder$dp(density, 22), onCreateViewHolder$dp(density, 22), 17));
            iconBg.addView($this$onCreateViewHolder_u24lambda_u244);
            LinearLayout $this$onCreateViewHolder_u24lambda_u246 = new LinearLayout(ctx);
            $this$onCreateViewHolder_u24lambda_u246.setOrientation(1);
            LinearLayout.LayoutParams $this$onCreateViewHolder_u24lambda_u246_u24lambda_u245 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            $this$onCreateViewHolder_u24lambda_u246_u24lambda_u245.setMarginStart(onCreateViewHolder$dp(density, 12));
            $this$onCreateViewHolder_u24lambda_u246.setLayoutParams($this$onCreateViewHolder_u24lambda_u246_u24lambda_u245);
            TextView $this$onCreateViewHolder_u24lambda_u247 = new TextView(ctx);
            $this$onCreateViewHolder_u24lambda_u247.setTextColor(-1);
            $this$onCreateViewHolder_u24lambda_u247.setTextSize(15.0f);
            $this$onCreateViewHolder_u24lambda_u247.setTypeface($this$onCreateViewHolder_u24lambda_u247.getTypeface(), 1);
            TextView $this$onCreateViewHolder_u24lambda_u248 = new TextView(ctx);
            $this$onCreateViewHolder_u24lambda_u248.setTextColor(Color.parseColor("#808080"));
            $this$onCreateViewHolder_u24lambda_u248.setTextSize(12.0f);
            $this$onCreateViewHolder_u24lambda_u246.addView($this$onCreateViewHolder_u24lambda_u247);
            $this$onCreateViewHolder_u24lambda_u246.addView($this$onCreateViewHolder_u24lambda_u248);
            ImageView $this$onCreateViewHolder_u24lambda_u249 = new ImageView(ctx);
            $this$onCreateViewHolder_u24lambda_u249.setImageResource(C3715R.drawable.neizzir19_ic_chevron_right);
            $this$onCreateViewHolder_u24lambda_u249.setColorFilter(Color.parseColor("#808080"));
            $this$onCreateViewHolder_u24lambda_u249.setLayoutParams(new LinearLayout.LayoutParams(onCreateViewHolder$dp(density, 20), onCreateViewHolder$dp(density, 20)));
            row.addView(iconBg);
            row.addView($this$onCreateViewHolder_u24lambda_u246);
            row.addView($this$onCreateViewHolder_u24lambda_u249);
            card.addView(row);
            RecyclerView.LayoutParams $this$onCreateViewHolder_u24lambda_u2410 = new RecyclerView.LayoutParams(-1, -2);
            $this$onCreateViewHolder_u24lambda_u2410.bottomMargin = onCreateViewHolder$dp(density, 8);
            card.setLayoutParams($this$onCreateViewHolder_u24lambda_u2410);
            return new WeaponViewHolder(card, $this$onCreateViewHolder_u24lambda_u247, $this$onCreateViewHolder_u24lambda_u248);
        }

        private static final int onCreateViewHolder$dp(float density, int v) {
            return (int) (v * density);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            if ((holder instanceof WeaponViewHolder) && position > 0) {
                final Weapon weapon = this.items.get(position - 1);
                ((WeaponViewHolder) holder).bind(weapon);
                holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.ui.WeaponEditorFragment$WeaponsAdapter$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        WeaponEditorFragment.WeaponsAdapter.onBindViewHolder$lambda$11(this.f$0, weapon, view);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onBindViewHolder$lambda$11(WeaponsAdapter this$0, Weapon weapon, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(weapon, "$weapon");
            this$0.onItemClick.invoke(weapon);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.items.size() + 1;
        }

        /* JADX INFO: compiled from: WeaponEditorFragment.kt */
        @Metadata(m4415d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/ui/WeaponEditorFragment$WeaponsAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
        public static final class HeaderViewHolder extends RecyclerView.ViewHolder {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HeaderViewHolder(View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "view");
            }
        }

        /* JADX INFO: compiled from: WeaponEditorFragment.kt */
        @Metadata(m4415d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/ui/WeaponEditorFragment$WeaponsAdapter$WeaponViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "nameView", "Landroid/widget/TextView;", "infoView", "(Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;)V", "bind", "", "weapon", "Lcom/blackhub/bronline/neizzir/fragments/weapon/Weapon;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
        public static final class WeaponViewHolder extends RecyclerView.ViewHolder {
            private final TextView infoView;
            private final TextView nameView;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WeaponViewHolder(View itemView, TextView nameView, TextView infoView) {
                super(itemView);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                Intrinsics.checkNotNullParameter(nameView, "nameView");
                Intrinsics.checkNotNullParameter(infoView, "infoView");
                this.nameView = nameView;
                this.infoView = infoView;
            }

            public final void bind(Weapon weapon) {
                Intrinsics.checkNotNullParameter(weapon, "weapon");
                TextView textView = this.nameView;
                String name = weapon.getName();
                if (name.length() == 0) {
                    name = weapon.getUniqueName();
                }
                textView.setText(name);
                this.infoView.setText("Ammo: " + weapon.getAmmo() + " • Range: " + ((int) weapon.getRange()) + " • Acc: " + ((int) weapon.getAccuracy()));
            }
        }
    }
}
