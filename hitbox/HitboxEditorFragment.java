package com.blackhub.bronline.neizzir.fragments.hitbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.gui.inventory.Constants;
import com.blackhub.bronline.neizzir.activities.main.p022ui.MenuFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.slider.Slider;
import com.helpshift.proactive.InAppViewConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: HitboxEditorFragment.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J$\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u000e\u0010(\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006,"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/hitbox/HitboxEditorFragment;", "Landroidx/fragment/app/Fragment;", "()V", "configFile", "Ljava/io/File;", "editTriples", "", "Lkotlin/Triple;", "Landroid/widget/EditText;", "json", "Lorg/json/JSONObject;", "nodes", "Lorg/json/JSONArray;", "applyScalePercent", "", "percent", "", "buildContent", "Landroid/view/View;", "context", "Landroid/content/Context;", "computePercentFromCurrent", "createRippleCircle", "Landroid/graphics/drawable/Drawable;", "createRoundedBg", "Landroid/graphics/drawable/GradientDrawable;", "colorHex", "", "alpha", "", InAppViewConstants.RADIUS, "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "resetToStock", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveConfig", "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class HitboxEditorFragment extends Fragment {
    private static final String COLOR_ACCENT = "#00E5CC";
    private static final String COLOR_BG = "#0A0A0F";
    private static final String COLOR_CARD = "#1A1A1F";
    private static final String COLOR_DIVIDER = "#2D2D35";
    private static final String COLOR_HINT = "#808080";
    private static final String COLOR_RED = "#EF4444";
    private static final String COLOR_TEXT = "#FFFFFF";
    private File configFile;
    private final List<Triple<EditText, EditText, EditText>> editTriples = new ArrayList();
    private JSONObject json;
    private JSONArray nodes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<String> BODY_PART_COLORS = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"#EF4444", MenuFragment.COLOR_ORANGE, "#EAB308", MenuFragment.COLOR_GREEN, "#3B82F6", MenuFragment.COLOR_CYAN, MenuFragment.COLOR_VIOLET, "#A855F7", MenuFragment.COLOR_PINK, "#F43F5E"});

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.hitbox.HitboxEditorFragment$resetToStock$1 */
    /* JADX INFO: compiled from: HitboxEditorFragment.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.hitbox.HitboxEditorFragment", m4426f = "HitboxEditorFragment.kt", m4427i = {0}, m4428l = {621}, m4429m = "resetToStock", m4430n = {"ctx"}, m4431s = {"L$0"})
    static final class C55211 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C55211(Continuation<? super C55211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HitboxEditorFragment.this.resetToStock(this);
        }
    }

    /* JADX INFO: compiled from: HitboxEditorFragment.kt */
    @Metadata(m4415d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/hitbox/HitboxEditorFragment$Companion;", "", "()V", "BODY_PART_COLORS", "", "", "COLOR_ACCENT", "COLOR_BG", "COLOR_CARD", "COLOR_DIVIDER", "COLOR_HINT", "COLOR_RED", "COLOR_TEXT", "newInstance", "Lcom/blackhub/bronline/neizzir/fragments/hitbox/HitboxEditorFragment;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HitboxEditorFragment newInstance() {
            return new HitboxEditorFragment();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FrameLayout $this$onCreateView_u24lambda_u240 = new FrameLayout(requireContext());
        $this$onCreateView_u24lambda_u240.setBackgroundColor(Color.parseColor("#0A0A0F"));
        return $this$onCreateView_u24lambda_u240;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FrameLayout frame = (FrameLayout) view;
        LinearLayout loaderContainer = new LinearLayout(requireContext());
        loaderContainer.setOrientation(1);
        loaderContainer.setGravity(17);
        loaderContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ProgressBar progress = new ProgressBar(requireContext());
        TextView $this$onViewCreated_u24lambda_u242 = new TextView(requireContext());
        $this$onViewCreated_u24lambda_u242.setText("Загрузка...");
        $this$onViewCreated_u24lambda_u242.setTextColor(Color.parseColor("#808080"));
        $this$onViewCreated_u24lambda_u242.setTextSize(14.0f);
        $this$onViewCreated_u24lambda_u242.setGravity(17);
        loaderContainer.addView(progress);
        loaderContainer.addView($this$onViewCreated_u24lambda_u242);
        frame.addView(loaderContainer);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C55201(frame, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.hitbox.HitboxEditorFragment$onViewCreated$1 */
    /* JADX INFO: compiled from: HitboxEditorFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.hitbox.HitboxEditorFragment$onViewCreated$1", m4426f = "HitboxEditorFragment.kt", m4427i = {0, 1, 2, 2}, m4428l = {107, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY}, m4429m = "invokeSuspend", m4430n = {"ctx", "ctx", "ctx", "repaired"}, m4431s = {"L$0", "L$0", "L$0", "Z$0"})
    static final class C55201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FrameLayout $frame;
        Object L$0;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55201(FrameLayout frameLayout, Continuation<? super C55201> continuation) {
            super(2, continuation);
            this.$frame = frameLayout;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HitboxEditorFragment.this.new C55201(this.$frame, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0074 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x0075  */
        /* JADX WARN: Code duplicated, block: B:28:0x0091 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x0092  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b7 A[Catch: Exception -> 0x00ec, TryCatch #0 {Exception -> 0x00ec, blocks: (B:30:0x0095, B:32:0x00b7, B:33:0x00bd, B:35:0x00de), top: B:46:0x0095 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00de A[Catch: Exception -> 0x00ec, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ec, blocks: (B:30:0x0095, B:32:0x00b7, B:33:0x00bd, B:35:0x00de), top: B:46:0x0095 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Exception e;
            C55201 c55201;
            C55201 c55202;
            Context context;
            Object objRepairConfigIfNeededIO$default;
            C55201 c55203;
            boolean zBooleanValue;
            Object jsonIO;
            boolean z;
            JSONObject jSONObject;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                switch (r1) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        c55202 = this;
                        Context contextRequireContext = HitboxEditorFragment.this.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        c55202.L$0 = contextRequireContext;
                        c55202.label = 1;
                        if (HitboxConfigManager.ensureExistsIO$default(HitboxConfigManager.INSTANCE, contextRequireContext, 0, c55202, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        context = contextRequireContext;
                        c55202.L$0 = context;
                        c55202.label = 2;
                        objRepairConfigIfNeededIO$default = HitboxConfigManager.repairConfigIfNeededIO$default(HitboxConfigManager.INSTANCE, context, 0, c55202, 2, null);
                        if (objRepairConfigIfNeededIO$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = objRepairConfigIfNeededIO$default;
                        c55203 = c55202;
                        try {
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            c55203.L$0 = context;
                            c55203.Z$0 = zBooleanValue;
                            c55203.label = 3;
                            jsonIO = HitboxConfigManager.INSTANCE.readJsonIO(context, c55203);
                            if (jsonIO == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c55201 = c55203;
                            z = zBooleanValue;
                            obj = jsonIO;
                            try {
                                Pair pair = (Pair) obj;
                                File file = (File) pair.component1();
                                JSONObject jSONObject2 = (JSONObject) pair.component2();
                                HitboxEditorFragment.this.configFile = file;
                                HitboxEditorFragment.this.json = jSONObject2;
                                HitboxEditorFragment hitboxEditorFragment = HitboxEditorFragment.this;
                                jSONObject = HitboxEditorFragment.this.json;
                                if (jSONObject == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("json");
                                    jSONObject = null;
                                }
                                JSONArray jSONArray = jSONObject.getJSONArray("nodes");
                                Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
                                hitboxEditorFragment.nodes = jSONArray;
                                c55201.$frame.removeAllViews();
                                c55201.$frame.addView(HitboxEditorFragment.this.buildContent(context));
                                if (z) {
                                    Toast.makeText(context, "Некорректные значения хитбокса исправлены автоматически", 1).show();
                                }
                                break;
                            } catch (Exception e2) {
                                Object obj2 = obj;
                                e = e2;
                                obj = obj2;
                                c55201.$frame.removeAllViews();
                                Toast.makeText(HitboxEditorFragment.this.requireContext(), "Ошибка: " + e.getMessage(), 0).show();
                                HitboxEditorFragment.this.getParentFragmentManager().popBackStack();
                            }
                            return Unit.INSTANCE;
                        } catch (Exception e3) {
                            c55201 = c55203;
                            e = e3;
                            obj = obj;
                            c55201.$frame.removeAllViews();
                            Toast.makeText(HitboxEditorFragment.this.requireContext(), "Ошибка: " + e.getMessage(), 0).show();
                            HitboxEditorFragment.this.getParentFragmentManager().popBackStack();
                            return Unit.INSTANCE;
                        }
                    case 1:
                        c55202 = this;
                        Context context2 = (Context) c55202.L$0;
                        ResultKt.throwOnFailure(obj);
                        context = context2;
                        c55202.L$0 = context;
                        c55202.label = 2;
                        objRepairConfigIfNeededIO$default = HitboxConfigManager.repairConfigIfNeededIO$default(HitboxConfigManager.INSTANCE, context, 0, c55202, 2, null);
                        if (objRepairConfigIfNeededIO$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = objRepairConfigIfNeededIO$default;
                        c55203 = c55202;
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        c55203.L$0 = context;
                        c55203.Z$0 = zBooleanValue;
                        c55203.label = 3;
                        jsonIO = HitboxConfigManager.INSTANCE.readJsonIO(context, c55203);
                        if (jsonIO == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c55201 = c55203;
                        z = zBooleanValue;
                        obj = jsonIO;
                        Pair pair2 = (Pair) obj;
                        File file2 = (File) pair2.component1();
                        JSONObject jSONObject3 = (JSONObject) pair2.component2();
                        HitboxEditorFragment.this.configFile = file2;
                        HitboxEditorFragment.this.json = jSONObject3;
                        HitboxEditorFragment hitboxEditorFragment2 = HitboxEditorFragment.this;
                        jSONObject = HitboxEditorFragment.this.json;
                        if (jSONObject == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("json");
                            jSONObject = null;
                        }
                        JSONArray jSONArray2 = jSONObject.getJSONArray("nodes");
                        Intrinsics.checkNotNullExpressionValue(jSONArray2, "getJSONArray(...)");
                        hitboxEditorFragment2.nodes = jSONArray2;
                        c55201.$frame.removeAllViews();
                        c55201.$frame.addView(HitboxEditorFragment.this.buildContent(context));
                        if (z) {
                            Toast.makeText(context, "Некорректные значения хитбокса исправлены автоматически", 1).show();
                            break;
                        }
                        return Unit.INSTANCE;
                    case 2:
                        Context context3 = (Context) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        context = context3;
                        c55203 = this;
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        c55203.L$0 = context;
                        c55203.Z$0 = zBooleanValue;
                        c55203.label = 3;
                        jsonIO = HitboxConfigManager.INSTANCE.readJsonIO(context, c55203);
                        if (jsonIO == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c55201 = c55203;
                        z = zBooleanValue;
                        obj = jsonIO;
                        Pair pair3 = (Pair) obj;
                        File file3 = (File) pair3.component1();
                        JSONObject jSONObject4 = (JSONObject) pair3.component2();
                        HitboxEditorFragment.this.configFile = file3;
                        HitboxEditorFragment.this.json = jSONObject4;
                        HitboxEditorFragment hitboxEditorFragment3 = HitboxEditorFragment.this;
                        jSONObject = HitboxEditorFragment.this.json;
                        if (jSONObject == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("json");
                            jSONObject = null;
                        }
                        JSONArray jSONArray3 = jSONObject.getJSONArray("nodes");
                        Intrinsics.checkNotNullExpressionValue(jSONArray3, "getJSONArray(...)");
                        hitboxEditorFragment3.nodes = jSONArray3;
                        c55201.$frame.removeAllViews();
                        c55201.$frame.addView(HitboxEditorFragment.this.buildContent(context));
                        if (z) {
                            Toast.makeText(context, "Некорректные значения хитбокса исправлены автоматически", 1).show();
                            break;
                        }
                        return Unit.INSTANCE;
                    case 3:
                        c55201 = this;
                        boolean z2 = c55201.Z$0;
                        Context context4 = (Context) c55201.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            context = context4;
                            z = z2;
                            obj = obj;
                            c55201 = c55201;
                            Pair pair4 = (Pair) obj;
                            File file4 = (File) pair4.component1();
                            JSONObject jSONObject5 = (JSONObject) pair4.component2();
                            HitboxEditorFragment.this.configFile = file4;
                            HitboxEditorFragment.this.json = jSONObject5;
                            HitboxEditorFragment hitboxEditorFragment4 = HitboxEditorFragment.this;
                            jSONObject = HitboxEditorFragment.this.json;
                            if (jSONObject == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("json");
                                jSONObject = null;
                            }
                            JSONArray jSONArray4 = jSONObject.getJSONArray("nodes");
                            Intrinsics.checkNotNullExpressionValue(jSONArray4, "getJSONArray(...)");
                            hitboxEditorFragment4.nodes = jSONArray4;
                            c55201.$frame.removeAllViews();
                            c55201.$frame.addView(HitboxEditorFragment.this.buildContent(context));
                            if (z) {
                                Toast.makeText(context, "Некорректные значения хитбокса исправлены автоматически", 1).show();
                            }
                            break;
                        } catch (Exception e4) {
                            e = e4;
                            c55201.$frame.removeAllViews();
                            Toast.makeText(HitboxEditorFragment.this.requireContext(), "Ошибка: " + e.getMessage(), 0).show();
                            HitboxEditorFragment.this.getParentFragmentManager().popBackStack();
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e5) {
                e = e5;
                c55201 = r1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View buildContent(Context context) throws JSONException {
        Object objValueOf;
        this.editTriples.clear();
        float density = context.getResources().getDisplayMetrics().density;
        ScrollView $this$buildContent_u24lambda_u243 = new ScrollView(context);
        $this$buildContent_u24lambda_u243.setBackgroundColor(Color.parseColor("#0A0A0F"));
        $this$buildContent_u24lambda_u243.setFillViewport(true);
        ScrollView rootScroll = $this$buildContent_u24lambda_u243;
        LinearLayout $this$buildContent_u24lambda_u244 = new LinearLayout(context);
        $this$buildContent_u24lambda_u244.setOrientation(1);
        $this$buildContent_u24lambda_u244.setPadding(buildContent$dp(density, 20), buildContent$dp(density, 24), buildContent$dp(density, 20), buildContent$dp(density, 100));
        LinearLayout root = $this$buildContent_u24lambda_u244;
        rootScroll.addView(root);
        LinearLayout $this$buildContent_u24lambda_u245 = new LinearLayout(context);
        $this$buildContent_u24lambda_u245.setOrientation(0);
        $this$buildContent_u24lambda_u245.setGravity(16);
        FrameLayout $this$buildContent_u24lambda_u247 = new FrameLayout(context);
        $this$buildContent_u24lambda_u247.setBackground(createRippleCircle(context));
        $this$buildContent_u24lambda_u247.setLayoutParams(new LinearLayout.LayoutParams(buildContent$dp(density, 40), buildContent$dp(density, 40)));
        $this$buildContent_u24lambda_u247.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.hitbox.HitboxEditorFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HitboxEditorFragment.buildContent$lambda$7$lambda$6(this.f$0, view);
            }
        });
        ImageView $this$buildContent_u24lambda_u248 = new ImageView(context);
        $this$buildContent_u24lambda_u248.setImageResource(C3715R.drawable.neizzir19_ic_arrow_back);
        $this$buildContent_u24lambda_u248.setColorFilter(-1);
        $this$buildContent_u24lambda_u248.setLayoutParams(new FrameLayout.LayoutParams(buildContent$dp(density, 24), buildContent$dp(density, 24), 17));
        $this$buildContent_u24lambda_u247.addView($this$buildContent_u24lambda_u248);
        TextView $this$buildContent_u24lambda_u2410 = new TextView(context);
        $this$buildContent_u24lambda_u2410.setText("Редактор HitBox");
        $this$buildContent_u24lambda_u2410.setTextColor(Color.parseColor("#FFFFFF"));
        $this$buildContent_u24lambda_u2410.setTextSize(24.0f);
        $this$buildContent_u24lambda_u2410.setTypeface($this$buildContent_u24lambda_u2410.getTypeface(), 1);
        LinearLayout.LayoutParams $this$buildContent_u24lambda_u2410_u24lambda_u249 = new LinearLayout.LayoutParams(-2, -2);
        $this$buildContent_u24lambda_u2410_u24lambda_u249.setMarginStart(buildContent$dp(density, 12));
        $this$buildContent_u24lambda_u2410.setLayoutParams($this$buildContent_u24lambda_u2410_u24lambda_u249);
        $this$buildContent_u24lambda_u245.addView($this$buildContent_u24lambda_u247);
        $this$buildContent_u24lambda_u245.addView($this$buildContent_u24lambda_u2410);
        root.addView($this$buildContent_u24lambda_u245);
        MaterialCardView $this$buildContent_u24lambda_u2412 = new MaterialCardView(context);
        $this$buildContent_u24lambda_u2412.setRadius(buildContent$dp(density, 16));
        $this$buildContent_u24lambda_u2412.setCardElevation(0.0f);
        $this$buildContent_u24lambda_u2412.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        $this$buildContent_u24lambda_u2412.setStrokeWidth(0);
        LinearLayout.LayoutParams $this$buildContent_u24lambda_u2412_u24lambda_u2411 = new LinearLayout.LayoutParams(-1, -2);
        $this$buildContent_u24lambda_u2412_u24lambda_u2411.topMargin = buildContent$dp(density, 20);
        $this$buildContent_u24lambda_u2412.setLayoutParams($this$buildContent_u24lambda_u2412_u24lambda_u2411);
        LinearLayout $this$buildContent_u24lambda_u2413 = new LinearLayout(context);
        $this$buildContent_u24lambda_u2413.setOrientation(0);
        $this$buildContent_u24lambda_u2413.setGravity(16);
        LinearLayout header = $this$buildContent_u24lambda_u245;
        $this$buildContent_u24lambda_u2413.setPadding(buildContent$dp(density, 16), buildContent$dp(density, 14), buildContent$dp(density, 16), buildContent$dp(density, 14));
        FrameLayout $this$buildContent_u24lambda_u2414 = new FrameLayout(context);
        $this$buildContent_u24lambda_u2414.setBackground(createRoundedBg("#EF4444", 0.15f, buildContent$dp(density, 12)));
        $this$buildContent_u24lambda_u2414.setLayoutParams(new LinearLayout.LayoutParams(buildContent$dp(density, 44), buildContent$dp(density, 44)));
        FrameLayout infoIconBg = $this$buildContent_u24lambda_u2414;
        ImageView $this$buildContent_u24lambda_u2415 = new ImageView(context);
        $this$buildContent_u24lambda_u2415.setImageResource(C3715R.drawable.neizzir_hitcfg_ic);
        $this$buildContent_u24lambda_u2415.setColorFilter(Color.parseColor("#EF4444"));
        $this$buildContent_u24lambda_u2415.setLayoutParams(new FrameLayout.LayoutParams(buildContent$dp(density, 24), buildContent$dp(density, 24), 17));
        infoIconBg.addView($this$buildContent_u24lambda_u2415);
        LinearLayout $this$buildContent_u24lambda_u2417 = new LinearLayout(context);
        $this$buildContent_u24lambda_u2417.setOrientation(1);
        LinearLayout.LayoutParams $this$buildContent_u24lambda_u2417_u24lambda_u2416 = new LinearLayout.LayoutParams(-2, -2);
        $this$buildContent_u24lambda_u2417_u24lambda_u2416.setMarginStart(buildContent$dp(density, 14));
        $this$buildContent_u24lambda_u2417.setLayoutParams($this$buildContent_u24lambda_u2417_u24lambda_u2416);
        Iterable hintLines = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"0% — стоковые хитбоксы", "20-30% — легитные", "31-80% — средние", "81-100% — большие"});
        Iterable $this$forEach$iv = hintLines;
        for (Object element$iv : $this$forEach$iv) {
            String line = (String) element$iv;
            TextView $this$buildContent_u24lambda_u2419_u24lambda_u2418 = new TextView(context);
            $this$buildContent_u24lambda_u2419_u24lambda_u2418.setText("• " + line);
            $this$buildContent_u24lambda_u2419_u24lambda_u2418.setTextColor(Color.parseColor("#B0FFFFFF"));
            $this$buildContent_u24lambda_u2419_u24lambda_u2418.setTextSize(12.0f);
            $this$buildContent_u24lambda_u2417.addView($this$buildContent_u24lambda_u2419_u24lambda_u2418);
            $this$forEach$iv = $this$forEach$iv;
        }
        $this$buildContent_u24lambda_u2413.addView(infoIconBg);
        $this$buildContent_u24lambda_u2413.addView($this$buildContent_u24lambda_u2417);
        $this$buildContent_u24lambda_u2412.addView($this$buildContent_u24lambda_u2413);
        root.addView($this$buildContent_u24lambda_u2412);
        int initialPercent = computePercentFromCurrent();
        MaterialCardView $this$buildContent_u24lambda_u2421 = new MaterialCardView(context);
        $this$buildContent_u24lambda_u2421.setRadius(buildContent$dp(density, 16));
        $this$buildContent_u24lambda_u2421.setCardElevation(0.0f);
        $this$buildContent_u24lambda_u2421.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        $this$buildContent_u24lambda_u2421.setStrokeWidth(0);
        LinearLayout infoContent = $this$buildContent_u24lambda_u2413;
        LinearLayout.LayoutParams $this$buildContent_u24lambda_u2421_u24lambda_u2420 = new LinearLayout.LayoutParams(-1, -2);
        $this$buildContent_u24lambda_u2421_u24lambda_u2420.topMargin = buildContent$dp(density, 12);
        $this$buildContent_u24lambda_u2421.setLayoutParams($this$buildContent_u24lambda_u2421_u24lambda_u2420);
        MaterialCardView sliderCard = $this$buildContent_u24lambda_u2421;
        LinearLayout $this$buildContent_u24lambda_u2422 = new LinearLayout(context);
        $this$buildContent_u24lambda_u2422.setOrientation(1);
        $this$buildContent_u24lambda_u2422.setPadding(buildContent$dp(density, 16), buildContent$dp(density, 16), buildContent$dp(density, 16), buildContent$dp(density, 16));
        LinearLayout sliderContent = $this$buildContent_u24lambda_u2422;
        LinearLayout $this$buildContent_u24lambda_u2423 = new LinearLayout(context);
        $this$buildContent_u24lambda_u2423.setOrientation(0);
        $this$buildContent_u24lambda_u2423.setGravity(16);
        LinearLayout sliderHeader = $this$buildContent_u24lambda_u2423;
        TextView $this$buildContent_u24lambda_u2424 = new TextView(context);
        $this$buildContent_u24lambda_u2424.setText("Размер хитбокса");
        $this$buildContent_u24lambda_u2424.setTextColor(Color.parseColor("#FFFFFF"));
        $this$buildContent_u24lambda_u2424.setTextSize(15.0f);
        $this$buildContent_u24lambda_u2424.setTypeface($this$buildContent_u24lambda_u2424.getTypeface(), 1);
        $this$buildContent_u24lambda_u2424.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView $this$buildContent_u24lambda_u2425 = new TextView(context);
        $this$buildContent_u24lambda_u2425.setText(new StringBuilder().append(initialPercent).append('%').toString());
        $this$buildContent_u24lambda_u2425.setTextColor(Color.parseColor("#00E5CC"));
        $this$buildContent_u24lambda_u2425.setTextSize(18.0f);
        $this$buildContent_u24lambda_u2425.setTypeface($this$buildContent_u24lambda_u2425.getTypeface(), 1);
        final TextView sliderValue = $this$buildContent_u24lambda_u2425;
        sliderHeader.addView($this$buildContent_u24lambda_u2424);
        sliderHeader.addView(sliderValue);
        Slider $this$buildContent_u24lambda_u2427 = new Slider(context);
        $this$buildContent_u24lambda_u2427.setValueFrom(0.0f);
        $this$buildContent_u24lambda_u2427.setValueTo(100.0f);
        $this$buildContent_u24lambda_u2427.setStepSize(1.0f);
        $this$buildContent_u24lambda_u2427.setValue(initialPercent);
        $this$buildContent_u24lambda_u2427.setTrackActiveTintList(ColorStateList.valueOf(Color.parseColor("#00E5CC")));
        $this$buildContent_u24lambda_u2427.setTrackInactiveTintList(ColorStateList.valueOf(Color.parseColor("#2D2D35")));
        $this$buildContent_u24lambda_u2427.setThumbTintList(ColorStateList.valueOf(Color.parseColor("#00E5CC")));
        int initialPercent2 = initialPercent;
        LinearLayout.LayoutParams $this$buildContent_u24lambda_u2427_u24lambda_u2426 = new LinearLayout.LayoutParams(-1, -2);
        $this$buildContent_u24lambda_u2427_u24lambda_u2426.topMargin = buildContent$dp(density, 8);
        $this$buildContent_u24lambda_u2427.setLayoutParams($this$buildContent_u24lambda_u2427_u24lambda_u2426);
        $this$buildContent_u24lambda_u2427.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.neizzir.fragments.hitbox.HitboxEditorFragment$$ExternalSyntheticLambda1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider, float f, boolean z) throws JSONException {
                HitboxEditorFragment.buildContent$lambda$28(sliderValue, this, slider, f, z);
            }
        });
        sliderContent.addView(sliderHeader);
        sliderContent.addView($this$buildContent_u24lambda_u2427);
        sliderCard.addView(sliderContent);
        root.addView(sliderCard);
        TextView $this$buildContent_u24lambda_u2430 = new TextView(context);
        $this$buildContent_u24lambda_u2430.setText("Детальная настройка");
        $this$buildContent_u24lambda_u2430.setTextColor(Color.parseColor("#808080"));
        $this$buildContent_u24lambda_u2430.setTextSize(13.0f);
        $this$buildContent_u24lambda_u2430.setTypeface($this$buildContent_u24lambda_u2430.getTypeface(), 1);
        LinearLayout.LayoutParams $this$buildContent_u24lambda_u2430_u24lambda_u2429 = new LinearLayout.LayoutParams(-2, -2);
        Slider slider = $this$buildContent_u24lambda_u2427;
        $this$buildContent_u24lambda_u2430_u24lambda_u2429.topMargin = buildContent$dp(density, 24);
        $this$buildContent_u24lambda_u2430_u24lambda_u2429.bottomMargin = buildContent$dp(density, 12);
        $this$buildContent_u24lambda_u2430.setLayoutParams($this$buildContent_u24lambda_u2430_u24lambda_u2429);
        TextView sectionTitle = $this$buildContent_u24lambda_u2430;
        root.addView(sectionTitle);
        List bodyParts = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Голова", "Тело верхняя", "Тело нижняя", "Тело середина", "Лев. предплечье", "Прав. предплечье", "Лев. нога (низ)", "Прав. нога (низ)", "Нога левая", "Нога правая"});
        List bodyIcons = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(C3715R.drawable.neizzir19_ic_head), Integer.valueOf(C3715R.drawable.neizzir19_ic_body), Integer.valueOf(C3715R.drawable.neizzir19_ic_body), Integer.valueOf(C3715R.drawable.neizzir19_ic_body), Integer.valueOf(C3715R.drawable.neizzir19_ic_arm), Integer.valueOf(C3715R.drawable.neizzir19_ic_arm), Integer.valueOf(C3715R.drawable.neizzir19_ic_leg), Integer.valueOf(C3715R.drawable.neizzir19_ic_leg), Integer.valueOf(C3715R.drawable.neizzir19_ic_leg), Integer.valueOf(C3715R.drawable.neizzir19_ic_leg)});
        int i = 0;
        JSONArray jSONArray = this.nodes;
        if (jSONArray == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nodes");
            jSONArray = null;
        }
        int length = jSONArray.length();
        while (i < length) {
            JSONArray jSONArray2 = this.nodes;
            if (jSONArray2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nodes");
                jSONArray2 = null;
            }
            JSONObject node = jSONArray2.getJSONObject(i);
            int i2 = length;
            LinearLayout sliderContent2 = sliderContent;
            LinearLayout sliderHeader2 = sliderHeader;
            double n3 = node.optDouble("n3", Constants.DEFAULT_DOUBLE_VALUE);
            double n4 = node.optDouble("n4", Constants.DEFAULT_DOUBLE_VALUE);
            double n5 = node.optDouble("n5", Constants.DEFAULT_DOUBLE_VALUE);
            List<String> list = BODY_PART_COLORS;
            String color = (i < 0 || i > CollectionsKt__CollectionsKt.getLastIndex(list)) ? "#00E5CC" : list.get(i);
            MaterialCardView $this$buildContent_u24lambda_u2433 = new MaterialCardView(context);
            TextView sliderValue2 = sliderValue;
            MaterialCardView sliderCard2 = sliderCard;
            $this$buildContent_u24lambda_u2433.setRadius(buildContent$dp(density, 16));
            $this$buildContent_u24lambda_u2433.setCardElevation(0.0f);
            $this$buildContent_u24lambda_u2433.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
            $this$buildContent_u24lambda_u2433.setStrokeWidth(0);
            TextView sectionTitle2 = sectionTitle;
            FrameLayout infoIconBg2 = infoIconBg;
            LinearLayout.LayoutParams $this$buildContent_u24lambda_u2433_u24lambda_u2432 = new LinearLayout.LayoutParams(-1, -2);
            ScrollView rootScroll2 = rootScroll;
            $this$buildContent_u24lambda_u2433_u24lambda_u2432.bottomMargin = buildContent$dp(density, 10);
            $this$buildContent_u24lambda_u2433.setLayoutParams($this$buildContent_u24lambda_u2433_u24lambda_u2432);
            LinearLayout $this$buildContent_u24lambda_u2434 = new LinearLayout(context);
            $this$buildContent_u24lambda_u2434.setOrientation(1);
            LinearLayout root2 = root;
            $this$buildContent_u24lambda_u2434.setPadding(buildContent$dp(density, 16), buildContent$dp(density, 14), buildContent$dp(density, 16), buildContent$dp(density, 14));
            LinearLayout $this$buildContent_u24lambda_u2435 = new LinearLayout(context);
            $this$buildContent_u24lambda_u2435.setOrientation(0);
            $this$buildContent_u24lambda_u2435.setGravity(16);
            FrameLayout $this$buildContent_u24lambda_u2436 = new FrameLayout(context);
            $this$buildContent_u24lambda_u2436.setBackground(createRoundedBg(color, 0.15f, buildContent$dp(density, 10)));
            $this$buildContent_u24lambda_u2436.setLayoutParams(new LinearLayout.LayoutParams(buildContent$dp(density, 36), buildContent$dp(density, 36)));
            ImageView $this$buildContent_u24lambda_u2438 = new ImageView(context);
            if (i < 0 || i > CollectionsKt__CollectionsKt.getLastIndex(bodyIcons)) {
                int it = C3715R.drawable.neizzir_hitcfg_ic;
                objValueOf = Integer.valueOf(it);
            } else {
                objValueOf = bodyIcons.get(i);
            }
            $this$buildContent_u24lambda_u2438.setImageResource(((Number) objValueOf).intValue());
            $this$buildContent_u24lambda_u2438.setColorFilter(Color.parseColor(color));
            List bodyIcons2 = bodyIcons;
            $this$buildContent_u24lambda_u2438.setLayoutParams(new FrameLayout.LayoutParams(buildContent$dp(density, 20), buildContent$dp(density, 20), 17));
            $this$buildContent_u24lambda_u2436.addView($this$buildContent_u24lambda_u2438);
            TextView $this$buildContent_u24lambda_u2440 = new TextView(context);
            String str = (String) CollectionsKt___CollectionsKt.getOrNull(bodyParts, i);
            if (str == null) {
                str = "Часть " + i;
            }
            $this$buildContent_u24lambda_u2440.setText(str);
            $this$buildContent_u24lambda_u2440.setTextColor(Color.parseColor("#FFFFFF"));
            $this$buildContent_u24lambda_u2440.setTextSize(15.0f);
            $this$buildContent_u24lambda_u2440.setTypeface($this$buildContent_u24lambda_u2440.getTypeface(), 1);
            LinearLayout.LayoutParams $this$buildContent_u24lambda_u2440_u24lambda_u2439 = new LinearLayout.LayoutParams(-2, -2);
            int i3 = i;
            $this$buildContent_u24lambda_u2440_u24lambda_u2439.setMarginStart(buildContent$dp(density, 12));
            $this$buildContent_u24lambda_u2440.setLayoutParams($this$buildContent_u24lambda_u2440_u24lambda_u2439);
            $this$buildContent_u24lambda_u2435.addView($this$buildContent_u24lambda_u2436);
            $this$buildContent_u24lambda_u2435.addView($this$buildContent_u24lambda_u2440);
            LinearLayout $this$buildContent_u24lambda_u2442 = new LinearLayout(context);
            $this$buildContent_u24lambda_u2442.setOrientation(0);
            $this$buildContent_u24lambda_u2442.setGravity(16);
            LinearLayout.LayoutParams $this$buildContent_u24lambda_u2442_u24lambda_u2441 = new LinearLayout.LayoutParams(-1, -2);
            $this$buildContent_u24lambda_u2442_u24lambda_u2441.topMargin = buildContent$dp(density, 12);
            $this$buildContent_u24lambda_u2442.setLayoutParams($this$buildContent_u24lambda_u2442_u24lambda_u2441);
            EditText inputX = buildContent$createInput(context, this, density, n3, "X");
            EditText inputZ = buildContent$createInput(context, this, density, n4, "Z");
            EditText inputRadius = buildContent$createInput(context, this, density, n5, "Radius");
            inputRadius.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            $this$buildContent_u24lambda_u2442.addView(inputX);
            $this$buildContent_u24lambda_u2442.addView(inputZ);
            $this$buildContent_u24lambda_u2442.addView(inputRadius);
            $this$buildContent_u24lambda_u2434.addView($this$buildContent_u24lambda_u2435);
            $this$buildContent_u24lambda_u2434.addView($this$buildContent_u24lambda_u2442);
            $this$buildContent_u24lambda_u2433.addView($this$buildContent_u24lambda_u2434);
            root2.addView($this$buildContent_u24lambda_u2433);
            this.editTriples.add(new Triple<>(inputX, inputZ, inputRadius));
            i = i3 + 1;
            slider = slider;
            root = root2;
            bodyIcons = bodyIcons2;
            header = header;
            infoContent = infoContent;
            length = i2;
            sliderContent = sliderContent2;
            bodyParts = bodyParts;
            sliderHeader = sliderHeader2;
            sectionTitle = sectionTitle2;
            sliderCard = sliderCard2;
            infoIconBg = infoIconBg2;
            rootScroll = rootScroll2;
            sliderValue = sliderValue2;
            initialPercent2 = initialPercent2;
        }
        final TextView sliderValue3 = sliderValue;
        ScrollView rootScroll3 = rootScroll;
        final Slider slider2 = slider;
        LinearLayout btnRow = new LinearLayout(context);
        btnRow.setOrientation(0);
        btnRow.setGravity(17);
        LinearLayout.LayoutParams $this$buildContent_u24lambda_u2446_u24lambda_u2445 = new LinearLayout.LayoutParams(-1, -2);
        $this$buildContent_u24lambda_u2446_u24lambda_u2445.topMargin = buildContent$dp(density, 24);
        btnRow.setLayoutParams($this$buildContent_u24lambda_u2446_u24lambda_u2445);
        MaterialButton $this$buildContent_u24lambda_u2449 = new MaterialButton(context);
        $this$buildContent_u24lambda_u2449.setText("Сбросить");
        $this$buildContent_u24lambda_u2449.setBackgroundColor(Color.parseColor("#2D2D35"));
        $this$buildContent_u24lambda_u2449.setTextColor(Color.parseColor("#FFFFFF"));
        $this$buildContent_u24lambda_u2449.setCornerRadius(buildContent$dp(density, 12));
        LinearLayout.LayoutParams $this$buildContent_u24lambda_u2449_u24lambda_u2447 = new LinearLayout.LayoutParams(0, buildContent$dp(density, 48), 1.0f);
        $this$buildContent_u24lambda_u2449_u24lambda_u2447.setMarginEnd(buildContent$dp(density, 8));
        $this$buildContent_u24lambda_u2449.setLayoutParams($this$buildContent_u24lambda_u2449_u24lambda_u2447);
        $this$buildContent_u24lambda_u2449.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.hitbox.HitboxEditorFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HitboxEditorFragment.buildContent$lambda$49$lambda$48(this.f$0, slider2, sliderValue3, view);
            }
        });
        MaterialButton $this$buildContent_u24lambda_u2452 = new MaterialButton(context);
        $this$buildContent_u24lambda_u2452.setText("Сохранить");
        $this$buildContent_u24lambda_u2452.setBackgroundColor(Color.parseColor("#00E5CC"));
        $this$buildContent_u24lambda_u2452.setTextColor(Color.parseColor("#000000"));
        $this$buildContent_u24lambda_u2452.setCornerRadius(buildContent$dp(density, 12));
        LinearLayout.LayoutParams $this$buildContent_u24lambda_u2452_u24lambda_u2450 = new LinearLayout.LayoutParams(0, buildContent$dp(density, 48), 1.0f);
        $this$buildContent_u24lambda_u2452_u24lambda_u2450.setMarginStart(buildContent$dp(density, 8));
        $this$buildContent_u24lambda_u2452.setLayoutParams($this$buildContent_u24lambda_u2452_u24lambda_u2450);
        $this$buildContent_u24lambda_u2452.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.hitbox.HitboxEditorFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                HitboxEditorFragment.buildContent$lambda$52$lambda$51(this.f$0, view);
            }
        });
        btnRow.addView($this$buildContent_u24lambda_u2449);
        btnRow.addView($this$buildContent_u24lambda_u2452);
        root.addView(btnRow);
        return rootScroll3;
    }

    private static final int buildContent$dp(float density, int v) {
        return (int) (v * density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildContent$lambda$7$lambda$6(HitboxEditorFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getParentFragmentManager().popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildContent$lambda$28(TextView sliderValue, HitboxEditorFragment this$0, Slider slider, float value, boolean fromUser) throws JSONException {
        String color;
        Intrinsics.checkNotNullParameter(sliderValue, "$sliderValue");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        if (fromUser) {
            int percent = (int) value;
            sliderValue.setText(new StringBuilder().append(percent).append('%').toString());
            if (percent <= 30) {
                color = "#00E5CC";
            } else {
                color = percent <= 80 ? "#EAB308" : "#EF4444";
            }
            sliderValue.setTextColor(Color.parseColor(color));
            this$0.applyScalePercent(percent);
        }
    }

    private static final EditText buildContent$createInput(Context $context, HitboxEditorFragment this$0, float density, double value, String hint) {
        EditText $this$buildContent_u24createInput_u24lambda_u2444 = new EditText($context);
        $this$buildContent_u24createInput_u24lambda_u2444.setText(HitboxEditorFragmentKt.pretty(value));
        $this$buildContent_u24createInput_u24lambda_u2444.setHint(hint);
        $this$buildContent_u24createInput_u24lambda_u2444.setTextColor(Color.parseColor("#00E5CC"));
        $this$buildContent_u24createInput_u24lambda_u2444.setHintTextColor(Color.parseColor("#808080"));
        $this$buildContent_u24createInput_u24lambda_u2444.setTextSize(14.0f);
        $this$buildContent_u24createInput_u24lambda_u2444.setGravity(17);
        $this$buildContent_u24createInput_u24lambda_u2444.setBackground(this$0.createRoundedBg("#2D2D35", 1.0f, buildContent$dp(density, 8)));
        $this$buildContent_u24createInput_u24lambda_u2444.setPadding(buildContent$dp(density, 8), buildContent$dp(density, 10), buildContent$dp(density, 8), buildContent$dp(density, 10));
        $this$buildContent_u24createInput_u24lambda_u2444.setInputType(12290);
        LinearLayout.LayoutParams $this$buildContent_u24createInput_u24lambda_u2444_u24lambda_u2443 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$buildContent_u24createInput_u24lambda_u2444_u24lambda_u2443.setMarginEnd(buildContent$dp(density, 6));
        $this$buildContent_u24createInput_u24lambda_u2444.setLayoutParams($this$buildContent_u24createInput_u24lambda_u2444_u24lambda_u2443);
        return $this$buildContent_u24createInput_u24lambda_u2444;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildContent$lambda$49$lambda$48(HitboxEditorFragment this$0, Slider slider, TextView sliderValue, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "$slider");
        Intrinsics.checkNotNullParameter(sliderValue, "$sliderValue");
        LifecycleOwner viewLifecycleOwner = this$0.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new HitboxEditorFragment$buildContent$btnReset$1$2$1(this$0, slider, sliderValue, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildContent$lambda$52$lambda$51(HitboxEditorFragment this$0, View it) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.saveConfig();
    }

    private final int computePercentFromCurrent() {
        try {
            JSONArray stockNodes = HitboxConfigManager.INSTANCE.getStockNodes();
            int length = stockNodes.length();
            JSONArray jSONArray = this.nodes;
            if (jSONArray == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nodes");
                jSONArray = null;
            }
            int len = Math.min(length, jSONArray.length());
            double sumRatio = Constants.DEFAULT_DOUBLE_VALUE;
            int count = 0;
            for (int i = 0; i < len; i++) {
                JSONObject s = stockNodes.getJSONObject(i);
                JSONArray jSONArray2 = this.nodes;
                if (jSONArray2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("nodes");
                    jSONArray2 = null;
                }
                JSONObject c = jSONArray2.getJSONObject(i);
                double baseSize = s.optDouble("n5", Constants.DEFAULT_DOUBLE_VALUE);
                double currSize = c.optDouble("n5", Constants.DEFAULT_DOUBLE_VALUE);
                if (baseSize > Constants.DEFAULT_DOUBLE_VALUE && currSize > Constants.DEFAULT_DOUBLE_VALUE) {
                    sumRatio += currSize / baseSize;
                    count++;
                }
            }
            if (count == 0) {
                return 0;
            }
            double factor = sumRatio / ((double) count);
            return MathKt__MathJVMKt.roundToInt(RangesKt___RangesKt.coerceIn((factor - 1.0d) * 10.0d, Constants.DEFAULT_DOUBLE_VALUE, 100.0d));
        } catch (Exception e) {
            return 0;
        }
    }

    private final void applyScalePercent(int percent) throws JSONException {
        int p = RangesKt___RangesKt.coerceIn(percent, 0, 100);
        double factor = (((double) p) / 10.0d) + 1.0d;
        JSONArray stockNodes = HitboxConfigManager.INSTANCE.getStockNodes();
        int length = stockNodes.length();
        JSONArray jSONArray = this.nodes;
        if (jSONArray == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nodes");
            jSONArray = null;
        }
        int len = Math.min(length, jSONArray.length());
        for (int i = 0; i < len; i++) {
            JSONObject stockNode = stockNodes.getJSONObject(i);
            JSONArray jSONArray2 = this.nodes;
            if (jSONArray2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nodes");
                jSONArray2 = null;
            }
            JSONObject currNode = jSONArray2.getJSONObject(i);
            double newN5 = stockNode.optDouble("n5", Constants.DEFAULT_DOUBLE_VALUE) * factor;
            currNode.put("n5", newN5);
            if (i < this.editTriples.size()) {
                EditText radiusEdit = this.editTriples.get(i).component3();
                radiusEdit.setText(HitboxEditorFragmentKt.pretty(newN5));
            }
        }
    }

    private final void saveConfig() throws JSONException {
        int i = 0;
        int size = this.editTriples.size();
        while (true) {
            JSONArray jSONArray = null;
            if (i < size) {
                Triple<EditText, EditText, EditText> triple = this.editTriples.get(i);
                EditText x = triple.component1();
                EditText y = triple.component2();
                EditText z = triple.component3();
                Double dx = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(x.getText().toString());
                Double dy = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(y.getText().toString());
                Double dz = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(z.getText().toString());
                if (dx == null || dy == null || dz == null) {
                    Toast.makeText(requireContext(), "Ошибка в строке " + i, 0).show();
                    return;
                }
                JSONArray jSONArray2 = this.nodes;
                if (jSONArray2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("nodes");
                } else {
                    jSONArray = jSONArray2;
                }
                jSONArray.getJSONObject(i).put("n3", dx.doubleValue()).put("n4", dy.doubleValue()).put("n5", dz.doubleValue());
                i++;
            } else {
                HitboxConfigManager hitboxConfigManager = HitboxConfigManager.INSTANCE;
                JSONArray jSONArray3 = this.nodes;
                if (jSONArray3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("nodes");
                    jSONArray3 = null;
                }
                boolean repairedBeforeSave = hitboxConfigManager.sanitizeNodes(jSONArray3);
                if (repairedBeforeSave) {
                    JSONArray jSONArray4 = this.nodes;
                    if (jSONArray4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("nodes");
                        jSONArray4 = null;
                    }
                    int iMin = Math.min(jSONArray4.length(), this.editTriples.size());
                    for (int i2 = 0; i2 < iMin; i2++) {
                        JSONArray jSONArray5 = this.nodes;
                        if (jSONArray5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("nodes");
                            jSONArray5 = null;
                        }
                        JSONObject node = jSONArray5.getJSONObject(i2);
                        Triple<EditText, EditText, EditText> triple2 = this.editTriples.get(i2);
                        EditText x2 = triple2.component1();
                        EditText y2 = triple2.component2();
                        EditText z2 = triple2.component3();
                        x2.setText(HitboxEditorFragmentKt.pretty(node.getDouble("n3")));
                        y2.setText(HitboxEditorFragmentKt.pretty(node.getDouble("n4")));
                        z2.setText(HitboxEditorFragmentKt.pretty(node.getDouble("n5")));
                    }
                }
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C55221(repairedBeforeSave, null), 3, null);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.hitbox.HitboxEditorFragment$saveConfig$1 */
    /* JADX INFO: compiled from: HitboxEditorFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.hitbox.HitboxEditorFragment$saveConfig$1", m4426f = "HitboxEditorFragment.kt", m4427i = {0}, m4428l = {579}, m4429m = "invokeSuspend", m4430n = {"ctx"}, m4431s = {"L$0"})
    static final class C55221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $repairedBeforeSave;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55221(boolean z, Continuation<? super C55221> continuation) {
            super(2, continuation);
            this.$repairedBeforeSave = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HitboxEditorFragment.this.new C55221(this.$repairedBeforeSave, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0063  */
        /* JADX WARN: Code duplicated, block: B:31:0x0067  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Exception e;
            Context ctx;
            C55221 c55221;
            String str;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Context ctx2 = HitboxEditorFragment.this.getContext();
                    if (ctx2 == null) {
                        return Unit.INSTANCE;
                    }
                    try {
                        HitboxConfigManager hitboxConfigManager = HitboxConfigManager.INSTANCE;
                        File file = HitboxEditorFragment.this.configFile;
                        JSONObject jSONObject = null;
                        if (file == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("configFile");
                            file = null;
                        }
                        JSONObject jSONObject2 = HitboxEditorFragment.this.json;
                        if (jSONObject2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("json");
                        } else {
                            jSONObject = jSONObject2;
                        }
                        this.L$0 = ctx2;
                        this.label = 1;
                        if (hitboxConfigManager.saveJsonIO(ctx2, file, jSONObject, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c55221 = this;
                        ctx = ctx2;
                        if (c55221.$repairedBeforeSave) {
                            str = "✓ Сохранено, некорректные нули исправлены автоматически";
                        } else {
                            str = "✓ Сохранено";
                        }
                        Toast.makeText(ctx, str, 0).show();
                        return Unit.INSTANCE;
                    } catch (Exception e2) {
                        e = e2;
                        ctx = ctx2;
                        Toast.makeText(ctx, "Ошибка: " + e.getMessage(), 0).show();
                    }
                    break;
                case 1:
                    c55221 = this;
                    ctx = (Context) c55221.L$0;
                    try {
                        ResultKt.throwOnFailure($result);
                        if (c55221.$repairedBeforeSave) {
                            str = "✓ Сохранено, некорректные нули исправлены автоматически";
                        } else {
                            str = "✓ Сохранено";
                        }
                        Toast.makeText(ctx, str, 0).show();
                        break;
                    } catch (Exception e3) {
                        e = e3;
                        Toast.makeText(ctx, "Ошибка: " + e.getMessage(), 0).show();
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object resetToStock(Continuation<? super Unit> continuation) throws JSONException {
        C55211 c55211;
        JSONObject jSONObject;
        Context ctx;
        if (continuation instanceof C55211) {
            C55211 c55212 = (C55211) continuation;
            if ((c55212.label & Integer.MIN_VALUE) != 0) {
                c55212.label -= Integer.MIN_VALUE;
                c55211 = c55212;
            } else {
                c55211 = new C55211(continuation);
            }
        } else {
            c55211 = new C55211(continuation);
        }
        Object $result = c55211.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c55211.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Context ctx2 = getContext();
                if (ctx2 == null) {
                    return Unit.INSTANCE;
                }
                JSONArray stockNodes = HitboxConfigManager.INSTANCE.getStockNodes();
                int length = stockNodes.length();
                JSONArray jSONArray = this.nodes;
                String str = "nodes";
                if (jSONArray == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("nodes");
                    jSONArray = null;
                }
                int len = Math.min(length, Math.min(jSONArray.length(), this.editTriples.size()));
                int i = 0;
                while (i < len) {
                    JSONObject stockNode = stockNodes.getJSONObject(i);
                    Triple<EditText, EditText, EditText> triple = this.editTriples.get(i);
                    EditText x = triple.component1();
                    EditText y = triple.component2();
                    EditText z = triple.component3();
                    Object $result2 = $result;
                    double n3 = stockNode.getDouble("n3");
                    JSONArray stockNodes2 = stockNodes;
                    int len2 = len;
                    double n4 = stockNode.getDouble("n4");
                    Object obj = coroutine_suspended;
                    int i2 = i;
                    String str2 = str;
                    double n5 = stockNode.getDouble("n5");
                    C55211 c55213 = c55211;
                    x.setText(HitboxEditorFragmentKt.pretty(n3));
                    y.setText(HitboxEditorFragmentKt.pretty(n4));
                    z.setText(HitboxEditorFragmentKt.pretty(n5));
                    JSONArray jSONArray2 = this.nodes;
                    if (jSONArray2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str2);
                        jSONArray2 = null;
                    }
                    jSONArray2.getJSONObject(i2).put("n1", stockNode.getInt("n1")).put("n2", stockNode.getInt("n2")).put("n3", n3).put("n4", n4).put("n5", n5);
                    i = i2 + 1;
                    $result = $result2;
                    stockNodes = stockNodes2;
                    len = len2;
                    coroutine_suspended = obj;
                    str = str2;
                    c55211 = c55213;
                }
                C55211 c55214 = c55211;
                Object obj2 = coroutine_suspended;
                HitboxConfigManager hitboxConfigManager = HitboxConfigManager.INSTANCE;
                File file = this.configFile;
                if (file == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("configFile");
                    file = null;
                }
                JSONObject jSONObject2 = this.json;
                if (jSONObject2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("json");
                    jSONObject = null;
                } else {
                    jSONObject = jSONObject2;
                }
                c55214.L$0 = ctx2;
                c55214.label = 1;
                if (hitboxConfigManager.saveJsonIO(ctx2, file, jSONObject, c55214) == obj2) {
                    return obj2;
                }
                ctx = ctx2;
                break;
            case 1:
                ctx = (Context) c55211.L$0;
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Toast.makeText(ctx, "✓ Сброшено", 0).show();
        return Unit.INSTANCE;
    }

    private final GradientDrawable createRoundedBg(String colorHex, float alpha, float radius) {
        int color = Color.parseColor(colorHex);
        int r = Color.red(color);
        int g = Color.green(color);
        int b = Color.blue(color);
        int a2 = (int) (255 * alpha);
        GradientDrawable $this$createRoundedBg_u24lambda_u2453 = new GradientDrawable();
        $this$createRoundedBg_u24lambda_u2453.setShape(0);
        $this$createRoundedBg_u24lambda_u2453.setCornerRadius(radius);
        $this$createRoundedBg_u24lambda_u2453.setColor(Color.argb(a2, r, g, b));
        return $this$createRoundedBg_u24lambda_u2453;
    }

    private final Drawable createRippleCircle(Context context) {
        try {
            return ContextCompat.getDrawable(context, C3715R.drawable.neizzir19_ripple_circle);
        } catch (Exception e) {
            return createRoundedBg("#2D2D35", 0.5f, 100.0f);
        }
    }
}
