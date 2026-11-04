package com.blackhub.bronline.neizzir.fragments.custom.manager;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import com.blackhub.bronline.neizzir.activities.main.util.CustomResourceStore;
import com.blackhub.bronline.neizzir.activities.main.util.CustomResources;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.messaging.Constants;
import com.helpshift.proactive.InAppViewConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.p040io.FilesKt__FileReadWriteKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.NonCancellable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import yuku.ambilwarna.AmbilWarnaDialog;

/* JADX INFO: compiled from: SkySettingsManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 t2\u00020\u0001:\u0005tuvwxB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014H\u0002J\"\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0010H\u0002J6\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100&H\u0002J\b\u0010'\u001a\u00020(H\u0002J\u001c\u0010)\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020\"H\u0002J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014H\u0002J\u0010\u0010-\u001a\u00020.2\u0006\u0010$\u001a\u00020\"H\u0002J\u0016\u0010/\u001a\u00020(2\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0016H\u0002J\b\u00102\u001a\u00020\u0012H\u0002J(\u00103\u001a\u00020(2\u0006\u0010!\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0014H\u0002J\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000207H\u0002J,\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001e092\u0006\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u0014H\u0002J\u0010\u0010=\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010>\u001a\u00020\u0012H\u0002J(\u0010?\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0014H\u0002J\b\u0010@\u001a\u00020.H\u0002J\b\u0010A\u001a\u00020(H\u0002J\b\u0010B\u001a\u00020CH\u0002J \u0010D\u001a\u00020.2\u0006\u0010E\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\n2\u0006\u0010G\u001a\u00020\nH\u0002J(\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u00142\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00140\u00162\b\b\u0002\u0010L\u001a\u00020\"H\u0002J\u0010\u0010M\u001a\u00020(2\u0006\u0010N\u001a\u00020OH\u0002J\u0019\u0010P\u001a\u0004\u0018\u00010\"2\b\u0010Q\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0002\u0010RJ\u001c\u0010S\u001a\u0004\u0018\u00010T2\u0006\u0010U\u001a\u00020V2\b\b\u0002\u0010W\u001a\u00020\u000eH\u0002J\u0014\u0010X\u001a\u0004\u0018\u00010O2\b\b\u0002\u0010W\u001a\u00020\u000eH\u0002J*\u0010Y\u001a\u00020\u00102\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100[2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00100&H\u0002J \u0010]\u001a\u00020\u00102\u0006\u0010^\u001a\u00020\u001e2\u0006\u0010Q\u001a\u00020\u00142\u0006\u0010_\u001a\u00020\u000eH\u0002J\u0006\u0010`\u001a\u00020\u0010J\b\u0010a\u001a\u00020\u0010H\u0002J\b\u0010b\u001a\u00020\u0010H\u0002J$\u0010c\u001a\u00020\u00102\u0006\u0010d\u001a\u00020\"2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100[H\u0002J\b\u0010f\u001a\u00020\u0010H\u0002J,\u0010g\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010^\u001a\u00020I2\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100[H\u0002J\u0010\u0010i\u001a\u00020\u00102\u0006\u0010j\u001a\u00020kH\u0002J\u0010\u0010l\u001a\u00020\u00102\u0006\u0010m\u001a\u00020\u0014H\u0002J,\u0010n\u001a\u00020\u00102\u0006\u0010o\u001a\u00020T2\f\u0010p\u001a\b\u0012\u0004\u0012\u00020q0\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016H\u0002J\u001e\u0010r\u001a\u00020\u00102\u0006\u0010o\u001a\u00020T2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00100&H\u0002J\f\u0010s\u001a\u00020\"*\u00020\"H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006y"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsManager;", "", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "ctx", "Landroid/content/Context;", "getCtx", "()Landroid/content/Context;", "density", "", "getDensity", "()F", "savingCustom", "", "addHelpSection", "", "root", "Landroid/widget/LinearLayout;", "title", "", "lines", "", "buildDialogTitle", "Landroid/widget/TextView;", "text", "collectDirtyOverrides", "", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsSupport$FieldSpec;", "bindings", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsManager$FieldBinding;", "confirmResetToStock", "createActionButton", "icon", "", "subtitle", "color", "onClick", "Lkotlin/Function0;", "createCard", "Lcom/google/android/material/card/MaterialCardView;", "createCardContainer", "paddingTop", "paddingBottom", "createCardTitle", "createColorBoxBg", "Landroid/graphics/drawable/GradientDrawable;", "createDialogActionsCard", "actions", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsManager$DialogAction;", "createDialogContainer", "createDialogHintCard", "createDialogScroll", "Landroid/widget/ScrollView;", "createDivider", "Landroid/view/View;", "createFieldEditor", "Lkotlin/Pair;", "spec", "initialText", "subtitleText", "createFieldSectionCard", "createHeader", "createInfoLine", "createInputBg", "createMainCard", "createRippleBackground", "Landroid/graphics/drawable/RippleDrawable;", "createRoundedBg", "colorHex", "alpha", InAppViewConstants.RADIUS, "createSelectionCard", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsManager$SelectionBinding;", Constants.ScionAnalytics.PARAM_LABEL, "entries", "initialIndex", "createStatusCard", "files", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsManager$SkyFiles;", "parseRgb", "value", "(Ljava/lang/String;)Ljava/lang/Integer;", "readJson", "Lorg/json/JSONArray;", "file", "Ljava/io/File;", "showToast", "resolveFiles", "saveCustom", "action", "Lkotlin/Function1;", "onSuccess", "setBindingText", "binding", "markDirty", "show", "showAdvancedEditorDialog", "showBasicEditorDialog", "showColorPicker", "initialColor", "onPicked", "showHelpDialog", "showSelectionDialog", "onSelected", "styleDialog", "dialog", "Landroid/app/AlertDialog;", "toast", "message", "updateFieldBindingsFromTargets", "json", "targets", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsSupport$Target;", "writeOutput", CalendarKeys.DAYS_GAME_KEY, "Companion", "DialogAction", "FieldBinding", "SelectionBinding", "SkyFiles", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class SkySettingsManager {
    public static final String COLOR_ACCENT = "#00E5CC";
    public static final String COLOR_BG = "#0A0A0F";
    public static final String COLOR_BLUE = "#3B82F6";
    public static final String COLOR_CARD = "#1A1A1F";
    public static final String COLOR_DIVIDER = "#2D2D35";
    public static final String COLOR_HINT = "#8B8B95";
    public static final String COLOR_INPUT = "#14141B";
    public static final String COLOR_RED = "#EF4444";
    public static final String COLOR_TEXT = "#FFFFFF";
    public static final String COLOR_YELLOW = "#EAB308";
    private final Fragment fragment;
    private boolean savingCustom;

    /* JADX INFO: compiled from: SkySettingsManager.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SkySettingsSupport.FieldKind.values().length];
            try {
                iArr[SkySettingsSupport.FieldKind.RGB.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[SkySettingsSupport.FieldKind.ARRAY4.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[SkySettingsSupport.FieldKind.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SkySettingsManager(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
    }

    private final Context getCtx() {
        Context contextRequireContext = this.fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return contextRequireContext;
    }

    private final float getDensity() {
        return getCtx().getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: dp */
    private final int m1425dp(int $this$dp) {
        return (int) ($this$dp * getDensity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: SkySettingsManager.kt */
    @Metadata(m4415d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsManager$SkyFiles;", "", "stock", "Ljava/io/File;", "current", "output", "(Ljava/io/File;Ljava/io/File;Ljava/io/File;)V", "getCurrent", "()Ljava/io/File;", "getOutput", "getStock", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    static final /* data */ class SkyFiles {
        private final File current;
        private final File output;
        private final File stock;

        public static /* synthetic */ SkyFiles copy$default(SkyFiles skyFiles, File file, File file2, File file3, int i, Object obj) {
            if ((i & 1) != 0) {
                file = skyFiles.stock;
            }
            if ((i & 2) != 0) {
                file2 = skyFiles.current;
            }
            if ((i & 4) != 0) {
                file3 = skyFiles.output;
            }
            return skyFiles.copy(file, file2, file3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final File getStock() {
            return this.stock;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final File getCurrent() {
            return this.current;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final File getOutput() {
            return this.output;
        }

        public final SkyFiles copy(File stock, File current, File output) {
            Intrinsics.checkNotNullParameter(stock, "stock");
            Intrinsics.checkNotNullParameter(current, "current");
            Intrinsics.checkNotNullParameter(output, "output");
            return new SkyFiles(stock, current, output);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SkyFiles)) {
                return false;
            }
            SkyFiles skyFiles = (SkyFiles) other;
            return Intrinsics.areEqual(this.stock, skyFiles.stock) && Intrinsics.areEqual(this.current, skyFiles.current) && Intrinsics.areEqual(this.output, skyFiles.output);
        }

        public int hashCode() {
            return (((this.stock.hashCode() * 31) + this.current.hashCode()) * 31) + this.output.hashCode();
        }

        public String toString() {
            return "SkyFiles(stock=" + this.stock + ", current=" + this.current + ", output=" + this.output + ')';
        }

        public SkyFiles(File stock, File current, File output) {
            Intrinsics.checkNotNullParameter(stock, "stock");
            Intrinsics.checkNotNullParameter(current, "current");
            Intrinsics.checkNotNullParameter(output, "output");
            this.stock = stock;
            this.current = current;
            this.output = output;
        }

        public final File getStock() {
            return this.stock;
        }

        public final File getCurrent() {
            return this.current;
        }

        public final File getOutput() {
            return this.output;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: SkySettingsManager.kt */
    @Metadata(m4415d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsManager$SelectionBinding;", "", "card", "Lcom/google/android/material/card/MaterialCardView;", "valueView", "Landroid/widget/TextView;", "entries", "", "", "selectedIndex", "", "(Lcom/google/android/material/card/MaterialCardView;Landroid/widget/TextView;Ljava/util/List;I)V", "getCard", "()Lcom/google/android/material/card/MaterialCardView;", "getEntries", "()Ljava/util/List;", "getSelectedIndex", "()I", "setSelectedIndex", "(I)V", "getValueView", "()Landroid/widget/TextView;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    static final /* data */ class SelectionBinding {
        private final MaterialCardView card;
        private final List<String> entries;
        private int selectedIndex;
        private final TextView valueView;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SelectionBinding copy$default(SelectionBinding selectionBinding, MaterialCardView materialCardView, TextView textView, List list, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                materialCardView = selectionBinding.card;
            }
            if ((i2 & 2) != 0) {
                textView = selectionBinding.valueView;
            }
            if ((i2 & 4) != 0) {
                list = selectionBinding.entries;
            }
            if ((i2 & 8) != 0) {
                i = selectionBinding.selectedIndex;
            }
            return selectionBinding.copy(materialCardView, textView, list, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MaterialCardView getCard() {
            return this.card;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TextView getValueView() {
            return this.valueView;
        }

        public final List<String> component3() {
            return this.entries;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getSelectedIndex() {
            return this.selectedIndex;
        }

        public final SelectionBinding copy(MaterialCardView card, TextView valueView, List<String> entries, int selectedIndex) {
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(valueView, "valueView");
            Intrinsics.checkNotNullParameter(entries, "entries");
            return new SelectionBinding(card, valueView, entries, selectedIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectionBinding)) {
                return false;
            }
            SelectionBinding selectionBinding = (SelectionBinding) other;
            return Intrinsics.areEqual(this.card, selectionBinding.card) && Intrinsics.areEqual(this.valueView, selectionBinding.valueView) && Intrinsics.areEqual(this.entries, selectionBinding.entries) && this.selectedIndex == selectionBinding.selectedIndex;
        }

        public int hashCode() {
            return (((((this.card.hashCode() * 31) + this.valueView.hashCode()) * 31) + this.entries.hashCode()) * 31) + Integer.hashCode(this.selectedIndex);
        }

        public String toString() {
            return "SelectionBinding(card=" + this.card + ", valueView=" + this.valueView + ", entries=" + this.entries + ", selectedIndex=" + this.selectedIndex + ')';
        }

        public SelectionBinding(MaterialCardView card, TextView valueView, List<String> entries, int selectedIndex) {
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(valueView, "valueView");
            Intrinsics.checkNotNullParameter(entries, "entries");
            this.card = card;
            this.valueView = valueView;
            this.entries = entries;
            this.selectedIndex = selectedIndex;
        }

        public final MaterialCardView getCard() {
            return this.card;
        }

        public final TextView getValueView() {
            return this.valueView;
        }

        public final List<String> getEntries() {
            return this.entries;
        }

        public final int getSelectedIndex() {
            return this.selectedIndex;
        }

        public final void setSelectedIndex(int i) {
            this.selectedIndex = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: SkySettingsManager.kt */
    @Metadata(m4415d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003JQ\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006/"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsManager$FieldBinding;", "", "spec", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsSupport$FieldSpec;", "input", "Landroid/widget/EditText;", "subtitle", "Landroid/widget/TextView;", "colorBox", "Landroid/view/View;", "dirty", "", "programmaticUpdate", "suggestedValue", "", "(Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsSupport$FieldSpec;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/view/View;ZZLjava/lang/String;)V", "getColorBox", "()Landroid/view/View;", "getDirty", "()Z", "setDirty", "(Z)V", "getInput", "()Landroid/widget/EditText;", "getProgrammaticUpdate", "setProgrammaticUpdate", "getSpec", "()Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsSupport$FieldSpec;", "getSubtitle", "()Landroid/widget/TextView;", "getSuggestedValue", "()Ljava/lang/String;", "setSuggestedValue", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    static final /* data */ class FieldBinding {
        private final View colorBox;
        private boolean dirty;
        private final EditText input;
        private boolean programmaticUpdate;
        private final SkySettingsSupport.FieldSpec spec;
        private final TextView subtitle;
        private String suggestedValue;

        public static /* synthetic */ FieldBinding copy$default(FieldBinding fieldBinding, SkySettingsSupport.FieldSpec fieldSpec, EditText editText, TextView textView, View view, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                fieldSpec = fieldBinding.spec;
            }
            if ((i & 2) != 0) {
                editText = fieldBinding.input;
            }
            EditText editText2 = editText;
            if ((i & 4) != 0) {
                textView = fieldBinding.subtitle;
            }
            TextView textView2 = textView;
            if ((i & 8) != 0) {
                view = fieldBinding.colorBox;
            }
            View view2 = view;
            if ((i & 16) != 0) {
                z = fieldBinding.dirty;
            }
            boolean z3 = z;
            if ((i & 32) != 0) {
                z2 = fieldBinding.programmaticUpdate;
            }
            boolean z4 = z2;
            if ((i & 64) != 0) {
                str = fieldBinding.suggestedValue;
            }
            return fieldBinding.copy(fieldSpec, editText2, textView2, view2, z3, z4, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SkySettingsSupport.FieldSpec getSpec() {
            return this.spec;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final EditText getInput() {
            return this.input;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final TextView getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final View getColorBox() {
            return this.colorBox;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getDirty() {
            return this.dirty;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getProgrammaticUpdate() {
            return this.programmaticUpdate;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getSuggestedValue() {
            return this.suggestedValue;
        }

        public final FieldBinding copy(SkySettingsSupport.FieldSpec spec, EditText input, TextView subtitle, View colorBox, boolean dirty, boolean programmaticUpdate, String suggestedValue) {
            Intrinsics.checkNotNullParameter(spec, "spec");
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(suggestedValue, "suggestedValue");
            return new FieldBinding(spec, input, subtitle, colorBox, dirty, programmaticUpdate, suggestedValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldBinding)) {
                return false;
            }
            FieldBinding fieldBinding = (FieldBinding) other;
            return Intrinsics.areEqual(this.spec, fieldBinding.spec) && Intrinsics.areEqual(this.input, fieldBinding.input) && Intrinsics.areEqual(this.subtitle, fieldBinding.subtitle) && Intrinsics.areEqual(this.colorBox, fieldBinding.colorBox) && this.dirty == fieldBinding.dirty && this.programmaticUpdate == fieldBinding.programmaticUpdate && Intrinsics.areEqual(this.suggestedValue, fieldBinding.suggestedValue);
        }

        public int hashCode() {
            return (((((((((((this.spec.hashCode() * 31) + this.input.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + (this.colorBox == null ? 0 : this.colorBox.hashCode())) * 31) + Boolean.hashCode(this.dirty)) * 31) + Boolean.hashCode(this.programmaticUpdate)) * 31) + this.suggestedValue.hashCode();
        }

        public String toString() {
            return "FieldBinding(spec=" + this.spec + ", input=" + this.input + ", subtitle=" + this.subtitle + ", colorBox=" + this.colorBox + ", dirty=" + this.dirty + ", programmaticUpdate=" + this.programmaticUpdate + ", suggestedValue=" + this.suggestedValue + ')';
        }

        public FieldBinding(SkySettingsSupport.FieldSpec spec, EditText input, TextView subtitle, View colorBox, boolean dirty, boolean programmaticUpdate, String suggestedValue) {
            Intrinsics.checkNotNullParameter(spec, "spec");
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(suggestedValue, "suggestedValue");
            this.spec = spec;
            this.input = input;
            this.subtitle = subtitle;
            this.colorBox = colorBox;
            this.dirty = dirty;
            this.programmaticUpdate = programmaticUpdate;
            this.suggestedValue = suggestedValue;
        }

        public /* synthetic */ FieldBinding(SkySettingsSupport.FieldSpec fieldSpec, EditText editText, TextView textView, View view, boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(fieldSpec, editText, textView, view, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? "" : str);
        }

        public final SkySettingsSupport.FieldSpec getSpec() {
            return this.spec;
        }

        public final EditText getInput() {
            return this.input;
        }

        public final TextView getSubtitle() {
            return this.subtitle;
        }

        public final View getColorBox() {
            return this.colorBox;
        }

        public final boolean getDirty() {
            return this.dirty;
        }

        public final void setDirty(boolean z) {
            this.dirty = z;
        }

        public final boolean getProgrammaticUpdate() {
            return this.programmaticUpdate;
        }

        public final void setProgrammaticUpdate(boolean z) {
            this.programmaticUpdate = z;
        }

        public final String getSuggestedValue() {
            return this.suggestedValue;
        }

        public final void setSuggestedValue(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.suggestedValue = str;
        }
    }

    /* JADX INFO: compiled from: SkySettingsManager.kt */
    @Metadata(m4415d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001f"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsManager$DialogAction;", "", "icon", "", "title", "", "subtitle", "color", "onClick", "Lkotlin/Function0;", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getColor", "()Ljava/lang/String;", "getIcon", "()I", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getSubtitle", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final /* data */ class DialogAction {
        private final String color;
        private final int icon;
        private final Function0<Unit> onClick;
        private final String subtitle;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DialogAction copy$default(DialogAction dialogAction, int i, String str, String str2, String str3, Function0 function0, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = dialogAction.icon;
            }
            if ((i2 & 2) != 0) {
                str = dialogAction.title;
            }
            String str4 = str;
            if ((i2 & 4) != 0) {
                str2 = dialogAction.subtitle;
            }
            String str5 = str2;
            if ((i2 & 8) != 0) {
                str3 = dialogAction.color;
            }
            String str6 = str3;
            if ((i2 & 16) != 0) {
                function0 = dialogAction.onClick;
            }
            return dialogAction.copy(i, str4, str5, str6, function0);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        public final Function0<Unit> component5() {
            return this.onClick;
        }

        public final DialogAction copy(int icon, String title, String subtitle, String color, Function0<Unit> onClick) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            return new DialogAction(icon, title, subtitle, color, onClick);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DialogAction)) {
                return false;
            }
            DialogAction dialogAction = (DialogAction) other;
            return this.icon == dialogAction.icon && Intrinsics.areEqual(this.title, dialogAction.title) && Intrinsics.areEqual(this.subtitle, dialogAction.subtitle) && Intrinsics.areEqual(this.color, dialogAction.color) && Intrinsics.areEqual(this.onClick, dialogAction.onClick);
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.icon) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.color.hashCode()) * 31) + this.onClick.hashCode();
        }

        public String toString() {
            return "DialogAction(icon=" + this.icon + ", title=" + this.title + ", subtitle=" + this.subtitle + ", color=" + this.color + ", onClick=" + this.onClick + ')';
        }

        public DialogAction(int icon, String title, String subtitle, String color, Function0<Unit> onClick) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.icon = icon;
            this.title = title;
            this.subtitle = subtitle;
            this.color = color;
            this.onClick = onClick;
        }

        public final int getIcon() {
            return this.icon;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getColor() {
            return this.color;
        }

        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }
    }

    public final void show() {
        LinearLayout root = (LinearLayout) this.fragment.requireView().findViewById(C3715R.id.neizzir2_skySettingsLayout);
        if (root == null) {
            return;
        }
        root.setVisibility(0);
        root.removeAllViews();
        root.setBackgroundColor(Color.parseColor("#0A0A0F"));
        root.addView(createHeader());
        SkyFiles it = resolveFiles(false);
        if (it != null) {
            root.addView(createStatusCard(it));
        }
        root.addView(createMainCard());
    }

    private final LinearLayout createHeader() {
        LinearLayout $this$createHeader_u24lambda_u247 = new LinearLayout(getCtx());
        $this$createHeader_u24lambda_u247.setOrientation(0);
        $this$createHeader_u24lambda_u247.setGravity(16);
        $this$createHeader_u24lambda_u247.setPadding(m1425dp(20), m1425dp(24), m1425dp(20), m1425dp(16));
        FrameLayout iconBg = new FrameLayout(getCtx());
        iconBg.setBackground(createRoundedBg("#3B82F6", 0.16f, m1425dp(12)));
        iconBg.setLayoutParams(new LinearLayout.LayoutParams(m1425dp(44), m1425dp(44)));
        ImageView $this$createHeader_u24lambda_u247_u24lambda_u242 = new ImageView(getCtx());
        $this$createHeader_u24lambda_u247_u24lambda_u242.setImageResource(C3715R.drawable.neizzir19_ic_sky);
        $this$createHeader_u24lambda_u247_u24lambda_u242.setColorFilter(Color.parseColor("#3B82F6"));
        $this$createHeader_u24lambda_u247_u24lambda_u242.setLayoutParams(new FrameLayout.LayoutParams(m1425dp(24), m1425dp(24), 17));
        iconBg.addView($this$createHeader_u24lambda_u247_u24lambda_u242);
        LinearLayout $this$createHeader_u24lambda_u247_u24lambda_u244 = new LinearLayout(getCtx());
        $this$createHeader_u24lambda_u247_u24lambda_u244.setOrientation(1);
        LinearLayout.LayoutParams $this$createHeader_u24lambda_u247_u24lambda_u244_u24lambda_u243 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$createHeader_u24lambda_u247_u24lambda_u244_u24lambda_u243.setMarginStart(m1425dp(12));
        $this$createHeader_u24lambda_u247_u24lambda_u244.setLayoutParams($this$createHeader_u24lambda_u247_u24lambda_u244_u24lambda_u243);
        TextView $this$createHeader_u24lambda_u247_u24lambda_u245 = new TextView(getCtx());
        $this$createHeader_u24lambda_u247_u24lambda_u245.setText("Редактор неба");
        $this$createHeader_u24lambda_u247_u24lambda_u245.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createHeader_u24lambda_u247_u24lambda_u245.setTextSize(20.0f);
        $this$createHeader_u24lambda_u247_u24lambda_u245.setTypeface($this$createHeader_u24lambda_u247_u24lambda_u245.getTypeface(), 1);
        $this$createHeader_u24lambda_u247_u24lambda_u244.addView($this$createHeader_u24lambda_u247_u24lambda_u245);
        TextView $this$createHeader_u24lambda_u247_u24lambda_u246 = new TextView(getCtx());
        $this$createHeader_u24lambda_u247_u24lambda_u246.setText("Быстрый и точный режим для timecyc");
        $this$createHeader_u24lambda_u247_u24lambda_u246.setTextColor(Color.parseColor(COLOR_HINT));
        $this$createHeader_u24lambda_u247_u24lambda_u246.setTextSize(12.0f);
        $this$createHeader_u24lambda_u247_u24lambda_u244.addView($this$createHeader_u24lambda_u247_u24lambda_u246);
        $this$createHeader_u24lambda_u247.addView(iconBg);
        $this$createHeader_u24lambda_u247.addView($this$createHeader_u24lambda_u247_u24lambda_u244);
        return $this$createHeader_u24lambda_u247;
    }

    private final MaterialCardView createStatusCard(SkyFiles files) {
        String str;
        String str2;
        JSONArray currentJson = readJson(files.getCurrent(), false);
        int weatherCount = currentJson != null ? SkySettingsSupport.INSTANCE.weatherCount(currentJson) : 0;
        int timeCount = currentJson != null ? SkySettingsSupport.INSTANCE.timeCount(currentJson) : 0;
        boolean isCustomActive = Intrinsics.areEqual(files.getCurrent(), files.getOutput()) && files.getOutput().exists();
        MaterialCardView card = createCard();
        LinearLayout container = createCardContainer$default(this, 0, 0, 3, null);
        container.addView(createCardTitle("Как устроен редактор"));
        container.addView(createInfoLine(C3715R.drawable.neizzir19_ic_palette, "#00E5CC", "Базовые настройки", "Верх и низ неба, облака и солнце"));
        container.addView(createDivider());
        int i = C3715R.drawable.neizzir19_ic_settings;
        if (weatherCount > 0 && timeCount > 0) {
            str = weatherCount + " погодных блоков по " + timeCount + " временных слотов";
        } else {
            str = "Все параметры timecyc с точной областью применения";
        }
        container.addView(createInfoLine(i, "#3B82F6", "Точный редактор", str));
        container.addView(createDivider());
        int i2 = isCustomActive ? C3715R.drawable.neizzir20_ic_save : C3715R.drawable.neizzir20_ic_undo;
        String str3 = isCustomActive ? "#EAB308" : "#00E5CC";
        String str4 = isCustomActive ? "Сейчас открыт кастомный файл" : "Сейчас открыт стоковый файл";
        if (isCustomActive) {
            str2 = "Редактор читает сохранённый timecyc из data";
        } else {
            str2 = "Изменения начнутся с оригинала из Custom/tcyc";
        }
        container.addView(createInfoLine(i2, str3, str4, str2));
        card.addView(container);
        return card;
    }

    private final MaterialCardView createMainCard() {
        MaterialCardView card = createCard();
        LinearLayout container = createCardContainer$default(this, 0, 0, 3, null);
        container.addView(createActionButton(C3715R.drawable.neizzir19_ic_palette, "Базовые настройки", "Верх и низ неба, облака, солнце и удобные области применения", "#00E5CC", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$createMainCard$1$1
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
                this.this$0.showBasicEditorDialog();
            }
        }));
        container.addView(createDivider());
        container.addView(createActionButton(C3715R.drawable.neizzir19_ic_settings, "Точный редактор", "Все параметры, все погоды и все времена", "#3B82F6", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$createMainCard$1$2
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
                this.this$0.showAdvancedEditorDialog();
            }
        }));
        container.addView(createDivider());
        container.addView(createActionButton(C3715R.drawable.neizzir20_ic_undo, "Сброс к стоку", "Вернуть исходный timecyc.json из папки Custom/tcyc", "#EAB308", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$createMainCard$1$3
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
                this.this$0.confirmResetToStock();
            }
        }));
        container.addView(createDivider());
        container.addView(createActionButton(C3715R.drawable.neizzir20_ic_info, "Справка", "Что означают параметры и как применять их по областям", "#EF4444", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$createMainCard$1$4
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
        }));
        card.addView(container);
        return card;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [T, android.app.AlertDialog] */
    public final void showBasicEditorDialog() {
        final JSONArray workingJson;
        final JSONArray stockJson;
        SkyFiles files = resolveFiles$default(this, false, 1, null);
        if (files == null || (workingJson = readJson$default(this, files.getCurrent(), false, 2, null)) == null || (stockJson = readJson$default(this, files.getStock(), false, 2, null)) == null) {
            return;
        }
        int weatherCount = SkySettingsSupport.INSTANCE.weatherCount(workingJson);
        final int timeCount = SkySettingsSupport.INSTANCE.timeCount(workingJson);
        if (weatherCount == 0 || timeCount == 0) {
            toast("Файл timecyc.json пустой или повреждён");
            return;
        }
        ScrollView scroll = createDialogScroll();
        LinearLayout container = createDialogContainer();
        scroll.addView(container);
        container.addView(createDialogHintCard(C3715R.drawable.neizzir19_ic_palette, "#00E5CC", "Базовый режим", "Поля сразу показывают текущие значения. Изменяются только те, которые вы реально тронули."));
        final SelectionBinding weatherSelection = createSelectionCard$default(this, "Область по погоде", SkySettingsSupport.INSTANCE.weatherLabels(weatherCount, true), 0, 4, null);
        Iterable $this$map$iv = SkySettingsSupport.INSTANCE.getBasicTimeScopes();
        Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            SkySettingsSupport.TimeScope it = (SkySettingsSupport.TimeScope) item$iv$iv;
            destination$iv$iv.add(it.getLabel());
        }
        final SelectionBinding timeSelection = createSelectionCard$default(this, "Область по времени", (List) destination$iv$iv, 0, 4, null);
        container.addView(weatherSelection.getCard());
        container.addView(timeSelection.getCard());
        Iterable $this$associateBy$iv = SkySettingsSupport.INSTANCE.getAllFields();
        int capacity$iv = RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$associateBy$iv, 10)), 16);
        Map destination$iv$iv2 = new LinkedHashMap(capacity$iv);
        for (Object element$iv$iv : $this$associateBy$iv) {
            SkySettingsSupport.FieldSpec it2 = (SkySettingsSupport.FieldSpec) element$iv$iv;
            destination$iv$iv2.put(it2.getKey(), element$iv$iv);
        }
        List sections = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m4423to("Небо", CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"SkyTopRGB", "SkyBottomRGB"})), TuplesKt.m4423to("Облака", CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"CloudRGB", "FluffyBottomRGB"})), TuplesKt.m4423to("Солнце", CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"SunCoreRGB", "SunCoronaRGB", "SunSize"}))});
        final List bindings = new ArrayList();
        Iterator it3 = sections.iterator();
        while (it3.hasNext()) {
            Pair pair = (Pair) it3.next();
            String title = (String) pair.component1();
            List keys = (List) pair.component2();
            MaterialCardView card = createFieldSectionCard(title);
            View childAt = card.getChildAt(0);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout sectionContainer = (LinearLayout) childAt;
            List $this$mapNotNull$iv = keys;
            Collection destination$iv$iv3 = new ArrayList();
            for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
                String p0 = (String) element$iv$iv$iv;
                SkySettingsSupport.FieldSpec fieldSpec = (SkySettingsSupport.FieldSpec) destination$iv$iv2.get(p0);
                if (fieldSpec != null) {
                    destination$iv$iv3.add(fieldSpec);
                }
            }
            Iterable $this$forEachIndexed$iv = (List) destination$iv$iv3;
            int index = 0;
            for (Object item$iv : $this$forEachIndexed$iv) {
                int index$iv = index + 1;
                if (index < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Iterator it4 = it3;
                SkySettingsSupport.FieldSpec spec = (SkySettingsSupport.FieldSpec) item$iv;
                String title2 = title;
                Iterable $this$forEachIndexed$iv2 = $this$forEachIndexed$iv;
                Pair<LinearLayout, FieldBinding> pairCreateFieldEditor = createFieldEditor(spec, "", spec.getKey() + " • " + spec.getDescription());
                LinearLayout row = pairCreateFieldEditor.component1();
                FieldBinding binding = pairCreateFieldEditor.component2();
                bindings.add(binding);
                sectionContainer.addView(row);
                if (index != CollectionsKt__CollectionsKt.getLastIndex(keys)) {
                    sectionContainer.addView(createDivider());
                }
                index = index$iv;
                it3 = it4;
                title = title2;
                $this$forEachIndexed$iv = $this$forEachIndexed$iv2;
            }
            container.addView(card);
            it3 = it3;
        }
        weatherSelection.getCard().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkySettingsManager.showBasicEditorDialog$lambda$18(this.f$0, weatherSelection, workingJson, bindings, timeSelection, timeCount, view);
            }
        });
        timeSelection.getCard().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkySettingsManager.showBasicEditorDialog$lambda$19(this.f$0, timeSelection, workingJson, bindings, weatherSelection, timeCount, view);
            }
        });
        showBasicEditorDialog$refreshFields(this, workingJson, bindings, weatherSelection, timeSelection, timeCount);
        final Ref.ObjectRef dialog = new Ref.ObjectRef();
        container.addView(createDialogActionsCard(CollectionsKt__CollectionsKt.listOf((Object[]) new DialogAction[]{new DialogAction(C3715R.drawable.neizzir20_ic_save, "Сохранить", "Применить изменения к выбранной области", "#00E5CC", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager.showBasicEditorDialog.5
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
                Map<SkySettingsSupport.FieldSpec, String> mapCollectDirtyOverrides = SkySettingsManager.this.collectDirtyOverrides(bindings);
                if (mapCollectDirtyOverrides.isEmpty()) {
                    SkySettingsManager.this.toast("Измените хотя бы одно поле");
                    return;
                }
                try {
                    List<SkySettingsSupport.Target> listShowBasicEditorDialog$selectedTargets = SkySettingsManager.showBasicEditorDialog$selectedTargets(weatherSelection, timeSelection, workingJson, timeCount);
                    if (listShowBasicEditorDialog$selectedTargets.isEmpty()) {
                        SkySettingsManager.this.toast("Не удалось определить область применения");
                        return;
                    }
                    SkySettingsSupport.INSTANCE.applyOverrides(workingJson, listShowBasicEditorDialog$selectedTargets, mapCollectDirtyOverrides);
                    SkySettingsManager skySettingsManager = SkySettingsManager.this;
                    JSONArray jSONArray = workingJson;
                    final SkySettingsManager skySettingsManager2 = SkySettingsManager.this;
                    final Ref.ObjectRef<AlertDialog> objectRef = dialog;
                    skySettingsManager.writeOutput(jSONArray, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager.showBasicEditorDialog.5.1
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
                            skySettingsManager2.toast("Базовые настройки сохранены");
                            AlertDialog alertDialog = objectRef.element;
                            if (alertDialog != null) {
                                alertDialog.dismiss();
                            }
                        }
                    });
                } catch (IllegalArgumentException error) {
                    SkySettingsManager skySettingsManager3 = SkySettingsManager.this;
                    String message = error.getMessage();
                    if (message == null) {
                        message = "Проверьте введённые значения";
                    }
                    skySettingsManager3.toast(message);
                } catch (Exception e) {
                    SkySettingsManager.this.toast("Не удалось сохранить настройки");
                }
            }
        }), new DialogAction(C3715R.drawable.neizzir19_ic_settings, "Точный режим", "Открыть все параметры и точную область применения", "#3B82F6", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager.showBasicEditorDialog.6
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
                AlertDialog alertDialog = dialog.element;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                this.showAdvancedEditorDialog();
            }
        }), new DialogAction(C3715R.drawable.neizzir20_ic_undo, "Сбросить к стоку", "Вернуть выбранную область к исходному timecyc", "#EAB308", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager.showBasicEditorDialog.7
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
                Iterable $this$forEach$iv = SkySettingsManager.showBasicEditorDialog$selectedTargets(weatherSelection, timeSelection, workingJson, timeCount);
                JSONArray jSONArray = workingJson;
                JSONArray jSONArray2 = stockJson;
                for (Object element$iv : $this$forEach$iv) {
                    SkySettingsSupport.Target target = (SkySettingsSupport.Target) element$iv;
                    SkySettingsSupport.INSTANCE.restoreSlotFromStock(jSONArray, jSONArray2, target.getWeatherIndex(), target.getTimeIndex());
                }
                Iterable $this$forEach$iv2 = bindings;
                for (Object element$iv2 : $this$forEach$iv2) {
                    FieldBinding it5 = (FieldBinding) element$iv2;
                    it5.setDirty(false);
                }
                SkySettingsManager.showBasicEditorDialog$refreshFields(this, workingJson, bindings, weatherSelection, timeSelection, timeCount);
                this.toast("Выбранная область восстановлена из стока");
            }
        }), new DialogAction(C3715R.drawable.neizzir20_ic_close, "Закрыть", "Выйти без сохранения", "#EF4444", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager.showBasicEditorDialog.8
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
                AlertDialog alertDialog = dialog.element;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
            }
        })})));
        dialog.element = new AlertDialog.Builder(getCtx()).setCustomTitle(buildDialogTitle("Базовые настройки неба")).setView(scroll).create();
        styleDialog((AlertDialog) dialog.element);
        ((AlertDialog) dialog.element).setCanceledOnTouchOutside(true);
        ((AlertDialog) dialog.element).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SkySettingsSupport.Target> showBasicEditorDialog$selectedTargets(SelectionBinding weatherSelection, SelectionBinding timeSelection, JSONArray workingJson, int timeCount) {
        Integer weatherIndex = weatherSelection.getSelectedIndex() == 0 ? null : Integer.valueOf(weatherSelection.getSelectedIndex() - 1);
        List<SkySettingsSupport.TimeScope> basicTimeScopes = SkySettingsSupport.INSTANCE.getBasicTimeScopes();
        int selectedIndex = timeSelection.getSelectedIndex();
        SkySettingsSupport.TimeScope scope = (selectedIndex < 0 || selectedIndex > CollectionsKt__CollectionsKt.getLastIndex(basicTimeScopes)) ? (SkySettingsSupport.TimeScope) CollectionsKt___CollectionsKt.first((List) SkySettingsSupport.INSTANCE.getBasicTimeScopes()) : basicTimeScopes.get(selectedIndex);
        Iterable $this$filter$iv = scope.getIndices();
        Collection destination$iv$iv = new ArrayList();
        Iterator it = $this$filter$iv.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object element$iv$iv = it.next();
            int it2 = ((Number) element$iv$iv).intValue();
            if (it2 >= 0 && it2 < timeCount) {
                z = true;
            }
            if (z) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        ArrayList list = (List) destination$iv$iv;
        if (list.isEmpty()) {
            list = CollectionsKt___CollectionsKt.toList(RangesKt___RangesKt.until(0, timeCount));
        }
        return SkySettingsSupport.INSTANCE.resolveTargets(workingJson, weatherIndex, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBasicEditorDialog$refreshFields(SkySettingsManager this$0, JSONArray workingJson, List<FieldBinding> list, SelectionBinding weatherSelection, SelectionBinding timeSelection, int timeCount) {
        this$0.updateFieldBindingsFromTargets(workingJson, showBasicEditorDialog$selectedTargets(weatherSelection, timeSelection, workingJson, timeCount), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBasicEditorDialog$lambda$18(final SkySettingsManager this$0, final SelectionBinding weatherSelection, final JSONArray workingJson, final List bindings, final SelectionBinding timeSelection, final int $timeCount, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(weatherSelection, "$weatherSelection");
        Intrinsics.checkNotNullParameter(workingJson, "$workingJson");
        Intrinsics.checkNotNullParameter(bindings, "$bindings");
        Intrinsics.checkNotNullParameter(timeSelection, "$timeSelection");
        this$0.showSelectionDialog("Область по погоде", weatherSelection, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$showBasicEditorDialog$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int it2) {
                SkySettingsManager.showBasicEditorDialog$refreshFields(this.this$0, workingJson, bindings, weatherSelection, timeSelection, $timeCount);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBasicEditorDialog$lambda$19(final SkySettingsManager this$0, final SelectionBinding timeSelection, final JSONArray workingJson, final List bindings, final SelectionBinding weatherSelection, final int $timeCount, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(timeSelection, "$timeSelection");
        Intrinsics.checkNotNullParameter(workingJson, "$workingJson");
        Intrinsics.checkNotNullParameter(bindings, "$bindings");
        Intrinsics.checkNotNullParameter(weatherSelection, "$weatherSelection");
        this$0.showSelectionDialog("Область по времени", timeSelection, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$showBasicEditorDialog$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int it2) {
                SkySettingsManager.showBasicEditorDialog$refreshFields(this.this$0, workingJson, bindings, weatherSelection, timeSelection, $timeCount);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [T, android.app.AlertDialog] */
    public final void showAdvancedEditorDialog() {
        final JSONArray workingJson;
        final JSONArray stockJson;
        int i = 0;
        SkyFiles files = resolveFiles$default(this, false, 1, null);
        if (files == null || (workingJson = readJson$default(this, files.getCurrent(), false, 2, null)) == null || (stockJson = readJson$default(this, files.getStock(), false, 2, null)) == null) {
            return;
        }
        int weatherCount = SkySettingsSupport.INSTANCE.weatherCount(workingJson);
        final int timeCount = SkySettingsSupport.INSTANCE.timeCount(workingJson);
        if (weatherCount == 0 || timeCount == 0) {
            toast("Файл timecyc.json пустой или повреждён");
            return;
        }
        ScrollView scroll = createDialogScroll();
        LinearLayout container = createDialogContainer();
        scroll.addView(container);
        container.addView(createDialogHintCard(C3715R.drawable.neizzir19_ic_settings, "#3B82F6", "Точный редактор", "Здесь доступны все параметры timecyc. Можно применить изменения ко всем погодам, одной погоде, ко всем временам или к одному часу."));
        final SelectionBinding weatherSelection = createSelectionCard$default(this, "Погода", SkySettingsSupport.INSTANCE.weatherLabels(weatherCount, true), 0, 4, null);
        final SelectionBinding timeSelection = createSelectionCard$default(this, "Игровое время", CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt__CollectionsJVMKt.listOf("Все времена"), (Iterable) SkySettingsSupport.INSTANCE.timeLabels(timeCount)), 0, 4, null);
        container.addView(weatherSelection.getCard());
        container.addView(timeSelection.getCard());
        final List bindings = new ArrayList();
        Iterator<Pair<String, List<SkySettingsSupport.FieldSpec>>> it = SkySettingsSupport.INSTANCE.getAdvancedSections().iterator();
        while (it.hasNext()) {
            Pair<String, List<SkySettingsSupport.FieldSpec>> next = it.next();
            String sectionTitle = next.component1();
            List<SkySettingsSupport.FieldSpec> listComponent2 = next.component2();
            MaterialCardView card = createFieldSectionCard(sectionTitle);
            View childAt = card.getChildAt(i);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout sectionContainer = (LinearLayout) childAt;
            List<SkySettingsSupport.FieldSpec> $this$forEachIndexed$iv = listComponent2;
            int index$iv = 0;
            for (Object item$iv : $this$forEachIndexed$iv) {
                int index$iv2 = index$iv + 1;
                if (index$iv < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                SkySettingsSupport.FieldSpec spec = (SkySettingsSupport.FieldSpec) item$iv;
                Pair<LinearLayout, FieldBinding> pairCreateFieldEditor = createFieldEditor(spec, "", spec.getKey() + " • " + spec.getDescription());
                LinearLayout row = pairCreateFieldEditor.component1();
                FieldBinding binding = pairCreateFieldEditor.component2();
                Iterator<Pair<String, List<SkySettingsSupport.FieldSpec>>> it2 = it;
                bindings.add(binding);
                sectionContainer.addView(row);
                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(listComponent2);
                List<SkySettingsSupport.FieldSpec> list = listComponent2;
                int index = index$iv;
                if (index != lastIndex) {
                    sectionContainer.addView(createDivider());
                }
                index$iv = index$iv2;
                it = it2;
                listComponent2 = list;
            }
            container.addView(card);
            it = it;
            i = 0;
        }
        weatherSelection.getCard().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkySettingsManager.showAdvancedEditorDialog$lambda$23(this.f$0, weatherSelection, workingJson, bindings, timeSelection, timeCount, view);
            }
        });
        timeSelection.getCard().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkySettingsManager.showAdvancedEditorDialog$lambda$24(this.f$0, timeSelection, workingJson, bindings, weatherSelection, timeCount, view);
            }
        });
        showAdvancedEditorDialog$refreshFields$22(this, workingJson, bindings, weatherSelection, timeSelection, timeCount);
        final Ref.ObjectRef dialog = new Ref.ObjectRef();
        container.addView(createDialogActionsCard(CollectionsKt__CollectionsKt.listOf((Object[]) new DialogAction[]{new DialogAction(C3715R.drawable.neizzir20_ic_save, "Сохранить", "Применить изменения к выбранной области", "#00E5CC", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager.showAdvancedEditorDialog.4
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
                Map<SkySettingsSupport.FieldSpec, String> mapCollectDirtyOverrides = SkySettingsManager.this.collectDirtyOverrides(bindings);
                if (mapCollectDirtyOverrides.isEmpty()) {
                    SkySettingsManager.this.toast("Измените хотя бы одно поле");
                    return;
                }
                try {
                    List<SkySettingsSupport.Target> listShowAdvancedEditorDialog$selectedTargets$21 = SkySettingsManager.showAdvancedEditorDialog$selectedTargets$21(weatherSelection, timeSelection, timeCount, workingJson);
                    if (listShowAdvancedEditorDialog$selectedTargets$21.isEmpty()) {
                        SkySettingsManager.this.toast("Не удалось определить область применения");
                        return;
                    }
                    SkySettingsSupport.INSTANCE.applyOverrides(workingJson, listShowAdvancedEditorDialog$selectedTargets$21, mapCollectDirtyOverrides);
                    SkySettingsManager skySettingsManager = SkySettingsManager.this;
                    JSONArray jSONArray = workingJson;
                    final SkySettingsManager skySettingsManager2 = SkySettingsManager.this;
                    final Ref.ObjectRef<AlertDialog> objectRef = dialog;
                    skySettingsManager.writeOutput(jSONArray, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager.showAdvancedEditorDialog.4.1
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
                            skySettingsManager2.toast("Точные настройки сохранены");
                            AlertDialog alertDialog = objectRef.element;
                            if (alertDialog != null) {
                                alertDialog.dismiss();
                            }
                        }
                    });
                } catch (IllegalArgumentException error) {
                    SkySettingsManager skySettingsManager3 = SkySettingsManager.this;
                    String message = error.getMessage();
                    if (message == null) {
                        message = "Проверьте значения полей";
                    }
                    skySettingsManager3.toast(message);
                } catch (Exception e) {
                    SkySettingsManager.this.toast("Не удалось сохранить настройки");
                }
            }
        }), new DialogAction(C3715R.drawable.neizzir20_ic_undo, "Сбросить выбранную область", "Вернуть выбранные погоды и времена к стоку", "#EAB308", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager.showAdvancedEditorDialog.5
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
                Iterable $this$forEach$iv = SkySettingsManager.showAdvancedEditorDialog$selectedTargets$21(weatherSelection, timeSelection, timeCount, workingJson);
                JSONArray jSONArray = workingJson;
                JSONArray jSONArray2 = stockJson;
                for (Object element$iv : $this$forEach$iv) {
                    SkySettingsSupport.Target target = (SkySettingsSupport.Target) element$iv;
                    SkySettingsSupport.INSTANCE.restoreSlotFromStock(jSONArray, jSONArray2, target.getWeatherIndex(), target.getTimeIndex());
                }
                Iterable $this$forEach$iv2 = bindings;
                for (Object element$iv2 : $this$forEach$iv2) {
                    FieldBinding it3 = (FieldBinding) element$iv2;
                    it3.setDirty(false);
                }
                SkySettingsManager.showAdvancedEditorDialog$refreshFields$22(this, workingJson, bindings, weatherSelection, timeSelection, timeCount);
                this.toast("Выбранная область восстановлена из стока");
            }
        }), new DialogAction(C3715R.drawable.neizzir20_ic_close, "Закрыть", "Выйти без сохранения", "#EF4444", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager.showAdvancedEditorDialog.6
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
                AlertDialog alertDialog = dialog.element;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
            }
        })})));
        dialog.element = new AlertDialog.Builder(getCtx()).setCustomTitle(buildDialogTitle("Точный редактор timecyc")).setView(scroll).create();
        styleDialog((AlertDialog) dialog.element);
        ((AlertDialog) dialog.element).setCanceledOnTouchOutside(true);
        ((AlertDialog) dialog.element).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SkySettingsSupport.Target> showAdvancedEditorDialog$selectedTargets$21(SelectionBinding weatherSelection, SelectionBinding timeSelection, int timeCount, JSONArray workingJson) {
        List<Integer> listListOf;
        Integer weatherIndex = weatherSelection.getSelectedIndex() == 0 ? null : Integer.valueOf(weatherSelection.getSelectedIndex() - 1);
        if (timeSelection.getSelectedIndex() == 0) {
            listListOf = CollectionsKt___CollectionsKt.toList(RangesKt___RangesKt.until(0, timeCount));
        } else {
            listListOf = CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(timeSelection.getSelectedIndex() - 1));
        }
        return SkySettingsSupport.INSTANCE.resolveTargets(workingJson, weatherIndex, listListOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAdvancedEditorDialog$refreshFields$22(SkySettingsManager this$0, JSONArray workingJson, List<FieldBinding> list, SelectionBinding weatherSelection, SelectionBinding timeSelection, int timeCount) {
        this$0.updateFieldBindingsFromTargets(workingJson, showAdvancedEditorDialog$selectedTargets$21(weatherSelection, timeSelection, timeCount, workingJson), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAdvancedEditorDialog$lambda$23(final SkySettingsManager this$0, final SelectionBinding weatherSelection, final JSONArray workingJson, final List bindings, final SelectionBinding timeSelection, final int $timeCount, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(weatherSelection, "$weatherSelection");
        Intrinsics.checkNotNullParameter(workingJson, "$workingJson");
        Intrinsics.checkNotNullParameter(bindings, "$bindings");
        Intrinsics.checkNotNullParameter(timeSelection, "$timeSelection");
        this$0.showSelectionDialog("Погода", weatherSelection, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$showAdvancedEditorDialog$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int it2) {
                SkySettingsManager.showAdvancedEditorDialog$refreshFields$22(this.this$0, workingJson, bindings, weatherSelection, timeSelection, $timeCount);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAdvancedEditorDialog$lambda$24(final SkySettingsManager this$0, final SelectionBinding timeSelection, final JSONArray workingJson, final List bindings, final SelectionBinding weatherSelection, final int $timeCount, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(timeSelection, "$timeSelection");
        Intrinsics.checkNotNullParameter(workingJson, "$workingJson");
        Intrinsics.checkNotNullParameter(bindings, "$bindings");
        Intrinsics.checkNotNullParameter(weatherSelection, "$weatherSelection");
        this$0.showSelectionDialog("Игровое время", timeSelection, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$showAdvancedEditorDialog$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int it2) {
                SkySettingsManager.showAdvancedEditorDialog$refreshFields$22(this.this$0, workingJson, bindings, weatherSelection, timeSelection, $timeCount);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirmResetToStock() {
        final SkyFiles files = resolveFiles$default(this, false, 1, null);
        if (files == null) {
            return;
        }
        AlertDialog p0 = new AlertDialog.Builder(getCtx()).setCustomTitle(buildDialogTitle("Сброс к стоку")).setMessage("Будет восстановлен исходный timecyc.json из папки Custom/tcyc. Пользовательский файл будет перезаписан.").setPositiveButton("Сбросить", new DialogInterface.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SkySettingsManager.confirmResetToStock$lambda$25(this.f$0, files, dialogInterface, i);
            }
        }).setNegativeButton("Отмена", (DialogInterface.OnClickListener) null).create();
        styleDialog(p0);
        p0.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void confirmResetToStock$lambda$25(final SkySettingsManager this$0, final SkyFiles files, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(files, "$files");
        this$0.saveCustom(new Function1<Context, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$confirmResetToStock$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Context context) {
                invoke2(context);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                CustomResources.INSTANCE.installFiles(context, MapsKt__MapsJVMKt.mapOf(TuplesKt.m4423to("data/timecyc.json", files.getStock())));
                new File(context.getFilesDir(), "NEIZZIR/user_settings.json").delete();
            }
        }, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$confirmResetToStock$1$2
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
                this.this$0.toast("Стоковый timecyc восстановлен");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showHelpDialog() {
        ScrollView scroll = createDialogScroll();
        LinearLayout container = createDialogContainer();
        scroll.addView(container);
        addHelpSection(container, "Как пользоваться", CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Базовый режим нужен для обычной настройки неба, облаков и солнца.", "Точный редактор нужен, когда надо менять все параметры timecyc.", "В обоих режимах область применения выбирается большими карточками, а не маленькими выпадающими списками."}));
        addHelpSection(container, "Погоды и время", CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"В точном режиме можно выбрать все погоды или одну конкретную погоду.", "В точном режиме можно выбрать все времена или один конкретный временной слот.", "В базовом режиме время выбирается более простыми группами: ночь, утро, день и вечер."}));
        addHelpSection(container, "Главные параметры", CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"SkyTopRGB и SkyBottomRGB отвечают за верх и низ неба.", "CloudRGB и FluffyBottomRGB отвечают за верхнюю и нижнюю часть облаков.", "SunCoreRGB, SunCoronaRGB и SunSize отвечают за ядро, ореол и размер солнца."}));
        addHelpSection(container, "Точный редактор", CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"AmbientRGB, AmbientPhysicalRGB и DirectionalRGB меняют освещение сцены.", "FogStart и FarClip влияют на туман и дальность видимости.", "PostFX1ARGB, PostFX2ARGB и WaterRGBA лучше настраивать именно в точном режиме."}));
        AlertDialog p0 = new AlertDialog.Builder(getCtx()).setCustomTitle(buildDialogTitle("Справка по редактору")).setView(scroll).setPositiveButton("Закрыть", (DialogInterface.OnClickListener) null).create();
        styleDialog(p0);
        p0.show();
    }

    private final MaterialCardView createDialogActionsCard(List<DialogAction> actions) {
        MaterialCardView card = createCard();
        LinearLayout container = createCardContainer$default(this, 0, 0, 3, null);
        container.addView(createCardTitle("Действия"));
        List<DialogAction> $this$forEachIndexed$iv = actions;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int index$iv2 = index$iv + 1;
            if (index$iv < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            DialogAction action = (DialogAction) item$iv;
            int index = index$iv;
            container.addView(createActionButton(action.getIcon(), action.getTitle(), action.getSubtitle(), action.getColor(), action.getOnClick()));
            if (index != CollectionsKt__CollectionsKt.getLastIndex(actions)) {
                container.addView(createDivider());
            }
            index$iv = index$iv2;
        }
        card.addView(container);
        return card;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<SkySettingsSupport.FieldSpec, String> collectDirtyOverrides(List<FieldBinding> bindings) {
        Map $this$collectDirtyOverrides_u24lambda_u2431 = MapsKt__MapsJVMKt.createMapBuilder();
        List<FieldBinding> $this$forEach$iv = bindings;
        for (Object element$iv : $this$forEach$iv) {
            FieldBinding binding = (FieldBinding) element$iv;
            String value = StringsKt__StringsKt.trim((CharSequence) binding.getInput().getText().toString()).toString();
            if (binding.getDirty()) {
                if (value.length() > 0) {
                    $this$collectDirtyOverrides_u24lambda_u2431.put(binding.getSpec(), value);
                }
            }
        }
        return MapsKt__MapsJVMKt.build($this$collectDirtyOverrides_u24lambda_u2431);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0090  */
    /* JADX WARN: Code duplicated, block: B:19:0x0098  */
    /* JADX WARN: Code duplicated, block: B:23:0x00aa  */
    private final void updateFieldBindingsFromTargets(JSONArray json, List<SkySettingsSupport.Target> targets, List<FieldBinding> bindings) {
        Iterable $this$forEach$iv;
        int $i$f$forEach;
        String description;
        Editable text;
        Integer rgb;
        List<FieldBinding> $this$forEach$iv2 = bindings;
        int $i$f$forEach2 = 0;
        for (Object element$iv : $this$forEach$iv2) {
            FieldBinding binding = (FieldBinding) element$iv;
            String sample = SkySettingsSupport.INSTANCE.sampleValue(json, targets, binding.getSpec());
            binding.setSuggestedValue(sample == null ? "" : sample);
            TextView subtitle = binding.getSubtitle();
            StringBuilder $this$updateFieldBindingsFromTargets_u24lambda_u2435_u24lambda_u2433 = new StringBuilder();
            $this$updateFieldBindingsFromTargets_u24lambda_u2435_u24lambda_u2433.append(binding.getSpec().getKey());
            $this$updateFieldBindingsFromTargets_u24lambda_u2435_u24lambda_u2433.append(" • ");
            if (sample != null) {
                $this$forEach$iv = $this$forEach$iv2;
                $i$f$forEach = $i$f$forEach2;
                description = "Среднее сейчас: " + sample;
                if (description == null) {
                }
                $this$updateFieldBindingsFromTargets_u24lambda_u2435_u24lambda_u2433.append(description);
                String string = $this$updateFieldBindingsFromTargets_u24lambda_u2435_u24lambda_u2433.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                subtitle.setText(string);
                if (!binding.getDirty()) {
                    setBindingText(binding, binding.getSuggestedValue(), false);
                } else {
                    text = binding.getInput().getText();
                    if (!(text != null || StringsKt__StringsKt.isBlank(text)) && (rgb = parseRgb(sample)) != null) {
                        int color = rgb.intValue();
                        View colorBox = binding.getColorBox();
                        if (colorBox != null) {
                            colorBox.setBackground(createColorBoxBg(color));
                        }
                    }
                }
                $this$forEach$iv2 = $this$forEach$iv;
                $i$f$forEach2 = $i$f$forEach;
            } else {
                $this$forEach$iv = $this$forEach$iv2;
                $i$f$forEach = $i$f$forEach2;
            }
            description = binding.getSpec().getDescription();
            $this$updateFieldBindingsFromTargets_u24lambda_u2435_u24lambda_u2433.append(description);
            String string2 = $this$updateFieldBindingsFromTargets_u24lambda_u2435_u24lambda_u2433.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            subtitle.setText(string2);
            if (!binding.getDirty()) {
                setBindingText(binding, binding.getSuggestedValue(), false);
            } else {
                text = binding.getInput().getText();
                if (!(text != null || StringsKt__StringsKt.isBlank(text))) {
                }
            }
            $this$forEach$iv2 = $this$forEach$iv;
            $i$f$forEach2 = $i$f$forEach;
        }
    }

    private final void addHelpSection(LinearLayout root, String title, List<String> lines) {
        SkySettingsManager skySettingsManager = this;
        MaterialCardView card = createCard();
        LinearLayout container = createCardContainer$default(skySettingsManager, 0, 0, 3, null);
        container.addView(skySettingsManager.createCardTitle(title));
        List<String> $this$forEachIndexed$iv = lines;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int index$iv2 = index$iv + 1;
            if (index$iv < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String line = (String) item$iv;
            TextView $this$addHelpSection_u24lambda_u2438_u24lambda_u2436 = new TextView(getCtx());
            $this$addHelpSection_u24lambda_u2438_u24lambda_u2436.setText(line);
            $this$addHelpSection_u24lambda_u2438_u24lambda_u2436.setTextColor(Color.parseColor(COLOR_HINT));
            $this$addHelpSection_u24lambda_u2438_u24lambda_u2436.setTextSize(13.0f);
            $this$addHelpSection_u24lambda_u2438_u24lambda_u2436.setLineSpacing(4.0f, 1.0f);
            container.addView($this$addHelpSection_u24lambda_u2438_u24lambda_u2436);
            if (index$iv != CollectionsKt__CollectionsKt.getLastIndex(lines)) {
                View $this$addHelpSection_u24lambda_u2438_u24lambda_u2437 = new View(getCtx());
                $this$addHelpSection_u24lambda_u2438_u24lambda_u2437.setLayoutParams(new LinearLayout.LayoutParams(-1, skySettingsManager.m1425dp(8)));
                container.addView($this$addHelpSection_u24lambda_u2438_u24lambda_u2437);
            }
            skySettingsManager = this;
            index$iv = index$iv2;
        }
        card.addView(container);
        root.addView(card);
    }

    private final LinearLayout createActionButton(int icon, String title, String subtitle, String color, final Function0<Unit> onClick) {
        LinearLayout $this$createActionButton_u24lambda_u2447 = new LinearLayout(getCtx());
        $this$createActionButton_u24lambda_u2447.setOrientation(0);
        $this$createActionButton_u24lambda_u2447.setGravity(16);
        $this$createActionButton_u24lambda_u2447.setPadding(0, m1425dp(12), 0, m1425dp(12));
        $this$createActionButton_u24lambda_u2447.setBackground(createRippleBackground());
        $this$createActionButton_u24lambda_u2447.setClickable(true);
        $this$createActionButton_u24lambda_u2447.setFocusable(true);
        $this$createActionButton_u24lambda_u2447.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkySettingsManager.createActionButton$lambda$47$lambda$39(onClick, view);
            }
        });
        FrameLayout iconBg = new FrameLayout(getCtx());
        iconBg.setBackground(createRoundedBg(color, 0.15f, m1425dp(10)));
        iconBg.setLayoutParams(new LinearLayout.LayoutParams(m1425dp(40), m1425dp(40)));
        ImageView $this$createActionButton_u24lambda_u2447_u24lambda_u2441 = new ImageView(getCtx());
        $this$createActionButton_u24lambda_u2447_u24lambda_u2441.setImageResource(icon);
        $this$createActionButton_u24lambda_u2447_u24lambda_u2441.setColorFilter(Color.parseColor(color));
        $this$createActionButton_u24lambda_u2447_u24lambda_u2441.setLayoutParams(new FrameLayout.LayoutParams(m1425dp(22), m1425dp(22), 17));
        iconBg.addView($this$createActionButton_u24lambda_u2447_u24lambda_u2441);
        LinearLayout $this$createActionButton_u24lambda_u2447_u24lambda_u2443 = new LinearLayout(getCtx());
        $this$createActionButton_u24lambda_u2447_u24lambda_u2443.setOrientation(1);
        LinearLayout.LayoutParams $this$createActionButton_u24lambda_u2447_u24lambda_u2443_u24lambda_u2442 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$createActionButton_u24lambda_u2447_u24lambda_u2443_u24lambda_u2442.setMarginStart(m1425dp(14));
        $this$createActionButton_u24lambda_u2447_u24lambda_u2443.setLayoutParams($this$createActionButton_u24lambda_u2447_u24lambda_u2443_u24lambda_u2442);
        TextView $this$createActionButton_u24lambda_u2447_u24lambda_u2444 = new TextView(getCtx());
        $this$createActionButton_u24lambda_u2447_u24lambda_u2444.setText(title);
        $this$createActionButton_u24lambda_u2447_u24lambda_u2444.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createActionButton_u24lambda_u2447_u24lambda_u2444.setTextSize(15.0f);
        $this$createActionButton_u24lambda_u2447_u24lambda_u2444.setTypeface($this$createActionButton_u24lambda_u2447_u24lambda_u2444.getTypeface(), 1);
        $this$createActionButton_u24lambda_u2447_u24lambda_u2443.addView($this$createActionButton_u24lambda_u2447_u24lambda_u2444);
        TextView $this$createActionButton_u24lambda_u2447_u24lambda_u2445 = new TextView(getCtx());
        $this$createActionButton_u24lambda_u2447_u24lambda_u2445.setText(subtitle);
        $this$createActionButton_u24lambda_u2447_u24lambda_u2445.setTextColor(Color.parseColor(COLOR_HINT));
        $this$createActionButton_u24lambda_u2447_u24lambda_u2445.setTextSize(12.0f);
        $this$createActionButton_u24lambda_u2447_u24lambda_u2443.addView($this$createActionButton_u24lambda_u2447_u24lambda_u2445);
        ImageView $this$createActionButton_u24lambda_u2447_u24lambda_u2446 = new ImageView(getCtx());
        $this$createActionButton_u24lambda_u2447_u24lambda_u2446.setImageResource(C3715R.drawable.neizzir19_ic_chevron);
        $this$createActionButton_u24lambda_u2447_u24lambda_u2446.setColorFilter(Color.parseColor("#4B4B56"));
        $this$createActionButton_u24lambda_u2447_u24lambda_u2446.setLayoutParams(new LinearLayout.LayoutParams(m1425dp(24), m1425dp(24)));
        $this$createActionButton_u24lambda_u2447.addView(iconBg);
        $this$createActionButton_u24lambda_u2447.addView($this$createActionButton_u24lambda_u2447_u24lambda_u2443);
        $this$createActionButton_u24lambda_u2447.addView($this$createActionButton_u24lambda_u2447_u24lambda_u2446);
        return $this$createActionButton_u24lambda_u2447;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createActionButton$lambda$47$lambda$39(Function0 onClick, View it) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        onClick.invoke();
    }

    private final LinearLayout createInfoLine(int icon, String color, String title, String subtitle) {
        LinearLayout $this$createInfoLine_u24lambda_u2454 = new LinearLayout(getCtx());
        $this$createInfoLine_u24lambda_u2454.setOrientation(0);
        $this$createInfoLine_u24lambda_u2454.setGravity(16);
        $this$createInfoLine_u24lambda_u2454.setPadding(0, m1425dp(6), 0, m1425dp(6));
        FrameLayout iconBg = new FrameLayout(getCtx());
        iconBg.setBackground(createRoundedBg(color, 0.15f, m1425dp(8)));
        iconBg.setLayoutParams(new LinearLayout.LayoutParams(m1425dp(34), m1425dp(34)));
        ImageView $this$createInfoLine_u24lambda_u2454_u24lambda_u2449 = new ImageView(getCtx());
        $this$createInfoLine_u24lambda_u2454_u24lambda_u2449.setImageResource(icon);
        $this$createInfoLine_u24lambda_u2454_u24lambda_u2449.setColorFilter(Color.parseColor(color));
        $this$createInfoLine_u24lambda_u2454_u24lambda_u2449.setLayoutParams(new FrameLayout.LayoutParams(m1425dp(18), m1425dp(18), 17));
        iconBg.addView($this$createInfoLine_u24lambda_u2454_u24lambda_u2449);
        LinearLayout $this$createInfoLine_u24lambda_u2454_u24lambda_u2451 = new LinearLayout(getCtx());
        $this$createInfoLine_u24lambda_u2454_u24lambda_u2451.setOrientation(1);
        LinearLayout.LayoutParams $this$createInfoLine_u24lambda_u2454_u24lambda_u2451_u24lambda_u2450 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$createInfoLine_u24lambda_u2454_u24lambda_u2451_u24lambda_u2450.setMarginStart(m1425dp(12));
        $this$createInfoLine_u24lambda_u2454_u24lambda_u2451.setLayoutParams($this$createInfoLine_u24lambda_u2454_u24lambda_u2451_u24lambda_u2450);
        TextView $this$createInfoLine_u24lambda_u2454_u24lambda_u2452 = new TextView(getCtx());
        $this$createInfoLine_u24lambda_u2454_u24lambda_u2452.setText(title);
        $this$createInfoLine_u24lambda_u2454_u24lambda_u2452.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createInfoLine_u24lambda_u2454_u24lambda_u2452.setTextSize(14.0f);
        $this$createInfoLine_u24lambda_u2454_u24lambda_u2452.setTypeface($this$createInfoLine_u24lambda_u2454_u24lambda_u2452.getTypeface(), 1);
        $this$createInfoLine_u24lambda_u2454_u24lambda_u2451.addView($this$createInfoLine_u24lambda_u2454_u24lambda_u2452);
        TextView $this$createInfoLine_u24lambda_u2454_u24lambda_u2453 = new TextView(getCtx());
        $this$createInfoLine_u24lambda_u2454_u24lambda_u2453.setText(subtitle);
        $this$createInfoLine_u24lambda_u2454_u24lambda_u2453.setTextColor(Color.parseColor(COLOR_HINT));
        $this$createInfoLine_u24lambda_u2454_u24lambda_u2453.setTextSize(12.0f);
        $this$createInfoLine_u24lambda_u2454_u24lambda_u2451.addView($this$createInfoLine_u24lambda_u2454_u24lambda_u2453);
        $this$createInfoLine_u24lambda_u2454.addView(iconBg);
        $this$createInfoLine_u24lambda_u2454.addView($this$createInfoLine_u24lambda_u2454_u24lambda_u2451);
        return $this$createInfoLine_u24lambda_u2454;
    }

    static /* synthetic */ SelectionBinding createSelectionCard$default(SkySettingsManager skySettingsManager, String str, List list, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return skySettingsManager.createSelectionCard(str, list, i);
    }

    private final SelectionBinding createSelectionCard(String label, List<String> entries, int initialIndex) {
        MaterialCardView card = createCard();
        LinearLayout container = createCardContainer(16, 16);
        TextView $this$createSelectionCard_u24lambda_u2455 = new TextView(getCtx());
        $this$createSelectionCard_u24lambda_u2455.setText(label);
        $this$createSelectionCard_u24lambda_u2455.setTextColor(Color.parseColor(COLOR_HINT));
        $this$createSelectionCard_u24lambda_u2455.setTextSize(13.0f);
        $this$createSelectionCard_u24lambda_u2455.setTypeface($this$createSelectionCard_u24lambda_u2455.getTypeface(), 1);
        container.addView($this$createSelectionCard_u24lambda_u2455);
        LinearLayout $this$createSelectionCard_u24lambda_u2457 = new LinearLayout(getCtx());
        $this$createSelectionCard_u24lambda_u2457.setOrientation(0);
        $this$createSelectionCard_u24lambda_u2457.setGravity(16);
        $this$createSelectionCard_u24lambda_u2457.setBackground(createInputBg());
        $this$createSelectionCard_u24lambda_u2457.setPadding(m1425dp(16), m1425dp(14), m1425dp(16), m1425dp(14));
        LinearLayout.LayoutParams $this$createSelectionCard_u24lambda_u2457_u24lambda_u2456 = new LinearLayout.LayoutParams(-1, -2);
        $this$createSelectionCard_u24lambda_u2457_u24lambda_u2456.topMargin = m1425dp(8);
        $this$createSelectionCard_u24lambda_u2457.setLayoutParams($this$createSelectionCard_u24lambda_u2457_u24lambda_u2456);
        TextView $this$createSelectionCard_u24lambda_u2459 = new TextView(getCtx());
        $this$createSelectionCard_u24lambda_u2459.setText((initialIndex < 0 || initialIndex > CollectionsKt__CollectionsKt.getLastIndex(entries)) ? "" : entries.get(initialIndex));
        $this$createSelectionCard_u24lambda_u2459.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createSelectionCard_u24lambda_u2459.setTextSize(15.0f);
        $this$createSelectionCard_u24lambda_u2459.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        ImageView $this$createSelectionCard_u24lambda_u2460 = new ImageView(getCtx());
        $this$createSelectionCard_u24lambda_u2460.setImageResource(C3715R.drawable.neizzir19_ic_chevron);
        $this$createSelectionCard_u24lambda_u2460.setColorFilter(Color.parseColor("#7B7B85"));
        $this$createSelectionCard_u24lambda_u2460.setLayoutParams(new LinearLayout.LayoutParams(m1425dp(22), m1425dp(22)));
        $this$createSelectionCard_u24lambda_u2457.addView($this$createSelectionCard_u24lambda_u2459);
        $this$createSelectionCard_u24lambda_u2457.addView($this$createSelectionCard_u24lambda_u2460);
        container.addView($this$createSelectionCard_u24lambda_u2457);
        card.addView(container);
        return new SelectionBinding(card, $this$createSelectionCard_u24lambda_u2459, entries, initialIndex);
    }

    private final void showSelectionDialog(String title, final SelectionBinding binding, final Function1<? super Integer, Unit> onSelected) {
        AlertDialog.Builder customTitle = new AlertDialog.Builder(getCtx()).setCustomTitle(buildDialogTitle(title));
        Collection $this$toTypedArray$iv = binding.getEntries();
        AlertDialog p0 = customTitle.setSingleChoiceItems((CharSequence[]) $this$toTypedArray$iv.toArray(new String[0]), binding.getSelectedIndex(), new DialogInterface.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SkySettingsManager.showSelectionDialog$lambda$61(binding, onSelected, dialogInterface, i);
            }
        }).setNegativeButton("Отмена", (DialogInterface.OnClickListener) null).create();
        styleDialog(p0);
        p0.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSelectionDialog$lambda$61(SelectionBinding binding, Function1 onSelected, DialogInterface dialog, int which) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(onSelected, "$onSelected");
        binding.setSelectedIndex(which);
        binding.getValueView().setText(binding.getEntries().get(which));
        onSelected.invoke(Integer.valueOf(which));
        dialog.dismiss();
    }

    private final MaterialCardView createFieldSectionCard(String title) {
        MaterialCardView card = createCard();
        LinearLayout container = createCardContainer$default(this, 0, 0, 3, null);
        container.addView(createCardTitle(title));
        card.addView(container);
        return card;
    }

    private final Pair<LinearLayout, FieldBinding> createFieldEditor(SkySettingsSupport.FieldSpec spec, String initialText, String subtitleText) {
        GradientDrawable gradientDrawableCreateInputBg;
        String str;
        int i;
        View $this$createFieldEditor_u24lambda_u2469;
        LinearLayout wrapper;
        LinearLayout $this$createFieldEditor_u24lambda_u2464 = new LinearLayout(getCtx());
        $this$createFieldEditor_u24lambda_u2464.setOrientation(1);
        $this$createFieldEditor_u24lambda_u2464.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        $this$createFieldEditor_u24lambda_u2464.setPadding(0, m1425dp(2), 0, m1425dp(2));
        TextView $this$createFieldEditor_u24lambda_u2465 = new TextView(getCtx());
        $this$createFieldEditor_u24lambda_u2465.setText(spec.getTitle());
        $this$createFieldEditor_u24lambda_u2465.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createFieldEditor_u24lambda_u2465.setTextSize(14.0f);
        $this$createFieldEditor_u24lambda_u2465.setTypeface($this$createFieldEditor_u24lambda_u2465.getTypeface(), 1);
        $this$createFieldEditor_u24lambda_u2464.addView($this$createFieldEditor_u24lambda_u2465);
        TextView $this$createFieldEditor_u24lambda_u2466 = new TextView(getCtx());
        $this$createFieldEditor_u24lambda_u2466.setText(subtitleText);
        $this$createFieldEditor_u24lambda_u2466.setTextColor(Color.parseColor(COLOR_HINT));
        $this$createFieldEditor_u24lambda_u2466.setTextSize(12.0f);
        $this$createFieldEditor_u24lambda_u2466.setPadding(0, m1425dp(2), 0, m1425dp(8));
        $this$createFieldEditor_u24lambda_u2464.addView($this$createFieldEditor_u24lambda_u2466);
        final EditText $this$createFieldEditor_u24lambda_u2467 = new EditText(getCtx());
        $this$createFieldEditor_u24lambda_u2467.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createFieldEditor_u24lambda_u2467.setHintTextColor(Color.parseColor(COLOR_HINT));
        if (spec.getKind() == SkySettingsSupport.FieldKind.RGB) {
            gradientDrawableCreateInputBg = new ColorDrawable(0);
        } else {
            gradientDrawableCreateInputBg = createInputBg();
        }
        $this$createFieldEditor_u24lambda_u2467.setBackground(gradientDrawableCreateInputBg);
        $this$createFieldEditor_u24lambda_u2467.setPadding(m1425dp(16), m1425dp(14), m1425dp(16), m1425dp(14));
        $this$createFieldEditor_u24lambda_u2467.setTextSize(15.0f);
        $this$createFieldEditor_u24lambda_u2467.setText(initialText);
        switch (WhenMappings.$EnumSwitchMapping$0[spec.getKind().ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        $this$createFieldEditor_u24lambda_u2467.setHint(str);
        if (WhenMappings.$EnumSwitchMapping$0[spec.getKind().ordinal()] == 3) {
            i = 12290;
        } else {
            i = 1;
        }
        $this$createFieldEditor_u24lambda_u2467.setInputType(i);
        if (spec.getKind() == SkySettingsSupport.FieldKind.RGB) {
            $this$createFieldEditor_u24lambda_u2469 = new View(getCtx());
            int size = m1425dp(36);
            LinearLayout.LayoutParams $this$createFieldEditor_u24lambda_u2469_u24lambda_u2468 = new LinearLayout.LayoutParams(size, size);
            $this$createFieldEditor_u24lambda_u2469_u24lambda_u2468.setMarginEnd(m1425dp(12));
            $this$createFieldEditor_u24lambda_u2469.setLayoutParams($this$createFieldEditor_u24lambda_u2469_u24lambda_u2468);
            Integer rgb = parseRgb(initialText);
            $this$createFieldEditor_u24lambda_u2469.setBackground(createColorBoxBg(rgb != null ? rgb.intValue() : -1));
        } else {
            $this$createFieldEditor_u24lambda_u2469 = null;
        }
        final View colorBox = $this$createFieldEditor_u24lambda_u2469;
        final FieldBinding binding = new FieldBinding(spec, $this$createFieldEditor_u24lambda_u2467, $this$createFieldEditor_u24lambda_u2466, colorBox, false, false, initialText, 48, null);
        if (colorBox == null) {
            wrapper = $this$createFieldEditor_u24lambda_u2464;
            EditText $this$addTextChangedListener_u24default$iv = $this$createFieldEditor_u24lambda_u2467;
            $this$addTextChangedListener_u24default$iv.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$createFieldEditor$$inlined$addTextChangedListener$default$2
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    if (binding.getProgrammaticUpdate()) {
                        return;
                    }
                    binding.setDirty(true);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }
            });
            $this$createFieldEditor_u24lambda_u2467.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            wrapper.addView($this$createFieldEditor_u24lambda_u2467);
        } else {
            LinearLayout row = new LinearLayout(getCtx());
            row.setOrientation(0);
            row.setGravity(16);
            row.setBackground(createInputBg());
            row.setPadding(m1425dp(12), m1425dp(10), m1425dp(12), m1425dp(10));
            row.setClickable(true);
            row.setFocusable(true);
            $this$createFieldEditor_u24lambda_u2467.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            EditText $this$addTextChangedListener_u24default$iv2 = $this$createFieldEditor_u24lambda_u2467;
            $this$addTextChangedListener_u24default$iv2.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$createFieldEditor$$inlined$addTextChangedListener$default$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    if (!binding.getProgrammaticUpdate()) {
                        binding.setDirty(true);
                    }
                    Integer rgb2 = this.parseRgb(s != null ? s.toString() : null);
                    if (rgb2 != null) {
                        int color = rgb2.intValue();
                        colorBox.setBackground(this.createColorBoxBg(color));
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }
            });
            final Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$createFieldEditor$openPicker$1
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
                    Integer rgb2 = this.this$0.parseRgb($this$createFieldEditor_u24lambda_u2467.getText().toString());
                    int initialColor = rgb2 != null ? rgb2.intValue() : -1;
                    SkySettingsManager skySettingsManager = this.this$0;
                    final SkySettingsManager skySettingsManager2 = this.this$0;
                    final SkySettingsManager.FieldBinding fieldBinding = binding;
                    skySettingsManager.showColorPicker(initialColor, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$createFieldEditor$openPicker$1.1
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
                            skySettingsManager2.setBindingText(fieldBinding, new StringBuilder().append(Color.red(color)).append(AbstractJsonLexerKt.COMMA).append(Color.green(color)).append(AbstractJsonLexerKt.COMMA).append(Color.blue(color)).toString(), true);
                        }
                    });
                }
            };
            colorBox.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SkySettingsManager.createFieldEditor$lambda$73(function0, view);
                }
            });
            row.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$$ExternalSyntheticLambda8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SkySettingsManager.createFieldEditor$lambda$74(function0, view);
                }
            });
            row.addView(colorBox);
            row.addView($this$createFieldEditor_u24lambda_u2467);
            wrapper = $this$createFieldEditor_u24lambda_u2464;
            wrapper.addView(row);
        }
        return TuplesKt.m4423to(wrapper, binding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createFieldEditor$lambda$73(Function0 openPicker, View it) {
        Intrinsics.checkNotNullParameter(openPicker, "$openPicker");
        openPicker.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createFieldEditor$lambda$74(Function0 openPicker, View it) {
        Intrinsics.checkNotNullParameter(openPicker, "$openPicker");
        openPicker.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBindingText(FieldBinding binding, String value, boolean markDirty) {
        binding.setProgrammaticUpdate(true);
        binding.getInput().setText(value);
        EditText input = binding.getInput();
        Editable text = binding.getInput().getText();
        input.setSelection(text != null ? text.length() : 0);
        binding.setProgrammaticUpdate(false);
        binding.setDirty(markDirty);
        Integer rgb = parseRgb(value);
        if (rgb != null) {
            int color = rgb.intValue();
            View colorBox = binding.getColorBox();
            if (colorBox == null) {
                return;
            }
            colorBox.setBackground(createColorBoxBg(color));
        }
    }

    private final MaterialCardView createDialogHintCard(int icon, String color, String title, String subtitle) {
        MaterialCardView card = createCard();
        LinearLayout container = createCardContainer$default(this, 0, 0, 3, null);
        container.addView(createInfoLine(icon, color, title, subtitle));
        card.addView(container);
        return card;
    }

    private final MaterialCardView createCard() {
        MaterialCardView $this$createCard_u24lambda_u2479 = new MaterialCardView(getCtx());
        $this$createCard_u24lambda_u2479.setRadius(m1425dp(16));
        $this$createCard_u24lambda_u2479.setCardElevation(0.0f);
        $this$createCard_u24lambda_u2479.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        LinearLayout.LayoutParams $this$createCard_u24lambda_u2479_u24lambda_u2478 = new LinearLayout.LayoutParams(-1, -2);
        $this$createCard_u24lambda_u2479_u24lambda_u2478.setMargins(m1425dp(20), 0, m1425dp(20), m1425dp(12));
        $this$createCard_u24lambda_u2479.setLayoutParams($this$createCard_u24lambda_u2479_u24lambda_u2478);
        return $this$createCard_u24lambda_u2479;
    }

    static /* synthetic */ LinearLayout createCardContainer$default(SkySettingsManager skySettingsManager, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 20;
        }
        if ((i3 & 2) != 0) {
            i2 = 20;
        }
        return skySettingsManager.createCardContainer(i, i2);
    }

    private final LinearLayout createCardContainer(int paddingTop, int paddingBottom) {
        LinearLayout $this$createCardContainer_u24lambda_u2480 = new LinearLayout(getCtx());
        $this$createCardContainer_u24lambda_u2480.setOrientation(1);
        $this$createCardContainer_u24lambda_u2480.setPadding(m1425dp(20), m1425dp(paddingTop), m1425dp(20), m1425dp(paddingBottom));
        return $this$createCardContainer_u24lambda_u2480;
    }

    private final TextView createCardTitle(String text) {
        TextView $this$createCardTitle_u24lambda_u2481 = new TextView(getCtx());
        $this$createCardTitle_u24lambda_u2481.setText(text);
        $this$createCardTitle_u24lambda_u2481.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createCardTitle_u24lambda_u2481.setTextSize(15.0f);
        $this$createCardTitle_u24lambda_u2481.setTypeface($this$createCardTitle_u24lambda_u2481.getTypeface(), 1);
        $this$createCardTitle_u24lambda_u2481.setPadding(0, 0, 0, m1425dp(12));
        return $this$createCardTitle_u24lambda_u2481;
    }

    private final ScrollView createDialogScroll() {
        ScrollView $this$createDialogScroll_u24lambda_u2482 = new ScrollView(getCtx());
        $this$createDialogScroll_u24lambda_u2482.setFillViewport(true);
        $this$createDialogScroll_u24lambda_u2482.setOverScrollMode(2);
        $this$createDialogScroll_u24lambda_u2482.setBackgroundColor(Color.parseColor("#0A0A0F"));
        return $this$createDialogScroll_u24lambda_u2482;
    }

    private final LinearLayout createDialogContainer() {
        LinearLayout $this$createDialogContainer_u24lambda_u2483 = new LinearLayout(getCtx());
        $this$createDialogContainer_u24lambda_u2483.setOrientation(1);
        $this$createDialogContainer_u24lambda_u2483.setPadding(0, m1425dp(16), 0, m1425dp(24));
        return $this$createDialogContainer_u24lambda_u2483;
    }

    private final TextView buildDialogTitle(String text) {
        TextView $this$buildDialogTitle_u24lambda_u2484 = new TextView(getCtx());
        $this$buildDialogTitle_u24lambda_u2484.setText(text);
        $this$buildDialogTitle_u24lambda_u2484.setTextColor(Color.parseColor("#FFFFFF"));
        $this$buildDialogTitle_u24lambda_u2484.setTextSize(18.0f);
        $this$buildDialogTitle_u24lambda_u2484.setGravity(17);
        $this$buildDialogTitle_u24lambda_u2484.setPadding(m1425dp(16), m1425dp(20), m1425dp(16), m1425dp(20));
        $this$buildDialogTitle_u24lambda_u2484.setBackgroundColor(Color.parseColor("#0A0A0F"));
        $this$buildDialogTitle_u24lambda_u2484.setTypeface($this$buildDialogTitle_u24lambda_u2484.getTypeface(), 1);
        return $this$buildDialogTitle_u24lambda_u2484;
    }

    private final void styleDialog(AlertDialog dialog) {
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0A0A0F")));
        }
    }

    private final View createDivider() {
        View $this$createDivider_u24lambda_u2486 = new View(getCtx());
        LinearLayout.LayoutParams $this$createDivider_u24lambda_u2486_u24lambda_u2485 = new LinearLayout.LayoutParams(-1, 1);
        $this$createDivider_u24lambda_u2486_u24lambda_u2485.setMargins(0, m1425dp(8), 0, m1425dp(8));
        $this$createDivider_u24lambda_u2486.setLayoutParams($this$createDivider_u24lambda_u2486_u24lambda_u2485);
        $this$createDivider_u24lambda_u2486.setBackgroundColor(Color.parseColor("#2D2D35"));
        return $this$createDivider_u24lambda_u2486;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer parseRgb(String value) {
        if (value != null) {
            try {
                Iterable iterableSplit$default = StringsKt__StringsKt.split$default((CharSequence) value, new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, (Object) null);
                if (iterableSplit$default != null) {
                    Iterable $this$map$iv = iterableSplit$default;
                    Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
                    for (Object item$iv$iv : $this$map$iv) {
                        String it = (String) item$iv$iv;
                        destination$iv$iv.add(StringsKt__StringsKt.trim((CharSequence) it).toString());
                    }
                    Iterable $this$filter$iv = (List) destination$iv$iv;
                    Collection destination$iv$iv2 = new ArrayList();
                    for (Object element$iv$iv : $this$filter$iv) {
                        String it2 = (String) element$iv$iv;
                        if (it2.length() > 0) {
                            destination$iv$iv2.add(element$iv$iv);
                        }
                    }
                    Iterable $this$map$iv2 = (List) destination$iv$iv2;
                    Collection destination$iv$iv3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv2, 10));
                    for (Object item$iv$iv2 : $this$map$iv2) {
                        String it3 = (String) item$iv$iv2;
                        destination$iv$iv3.add(Integer.valueOf(Integer.parseInt(it3)));
                    }
                    List parts = (List) destination$iv$iv3;
                    if (parts.size() != 3) {
                        return null;
                    }
                    return Integer.valueOf(Color.rgb(((Number) parts.get(0)).intValue(), ((Number) parts.get(1)).intValue(), ((Number) parts.get(2)).intValue()));
                }
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showColorPicker(int initialColor, final Function1<? super Integer, Unit> onPicked) {
        new AmbilWarnaDialog(getCtx(), initialColor, new AmbilWarnaDialog.OnAmbilWarnaListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager.showColorPicker.1
            @Override // yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
            public void onOk(AmbilWarnaDialog dialog, int color) {
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                onPicked.invoke(Integer.valueOf(color));
            }

            @Override // yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
            public void onCancel(AmbilWarnaDialog dialog) {
                Intrinsics.checkNotNullParameter(dialog, "dialog");
            }
        }).show();
    }

    static /* synthetic */ SkyFiles resolveFiles$default(SkySettingsManager skySettingsManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return skySettingsManager.resolveFiles(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final SkyFiles resolveFiles(boolean showToast) {
        Object objM15551constructorimpl;
        File file;
        byte b = 0;
        byte b2 = 0;
        File externalFilesDir = getCtx().getExternalFilesDir(null);
        String parent = externalFilesDir != null ? externalFilesDir.getParent() : null;
        File externalFilesDir2 = getCtx().getExternalFilesDir("data");
        String str = parent;
        boolean z = false;
        if ((str == null || StringsKt__StringsKt.isBlank(str)) != false || externalFilesDir2 == null) {
            if (showToast) {
                toast("Не удалось получить доступ к файлам игры");
            }
            return null;
        }
        File file2 = new File(parent, "Custom/tcyc/timecyc.json");
        if (!file2.exists()) {
            if (showToast) {
                toast("Файл timecyc.json не найден в Custom/tcyc");
            }
            return null;
        }
        File file3 = new File(externalFilesDir2, "timecyc.json");
        try {
            Result.Companion companion = Result.INSTANCE;
            File externalFilesDir3 = getCtx().getExternalFilesDir(null);
            File parentFile = externalFilesDir3 != null ? externalFilesDir3.getParentFile() : null;
            if (parentFile == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            File fileActive$default = CustomResourceStore.active$default(new CustomResourceStore(parentFile, b2 == true ? 1 : 0, 2, b == true ? 1 : 0), null, 1, null);
            objM15551constructorimpl = Result.m15551constructorimpl(fileActive$default != null ? new File(fileActive$default, "data/timecyc.json") : null);
            File file4 = (File) (Result.m15557isFailureimpl(objM15551constructorimpl) ? null : objM15551constructorimpl);
            if (file4 != null && file4.isFile()) {
                z = true;
            }
            if (z) {
                file = file4;
            } else {
                file = file3.exists() ? file3 : file2;
            }
            return new SkyFiles(file2, file, file3);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
        }
    }

    static /* synthetic */ JSONArray readJson$default(SkySettingsManager skySettingsManager, File file, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return skySettingsManager.readJson(file, z);
    }

    private final JSONArray readJson(File file, boolean showToast) {
        try {
            return new JSONArray(FilesKt__FileReadWriteKt.readText$default(file, null, 1, null));
        } catch (Exception e) {
            if (showToast) {
                toast("Не удалось прочитать " + file.getName());
                return null;
            }
            return null;
        }
    }

    private final void saveCustom(Function1<? super Context, Unit> action, Function0<Unit> onSuccess) {
        if (this.savingCustom) {
            return;
        }
        this.savingCustom = true;
        Context context = getCtx().getApplicationContext();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.fragment), null, null, new C53741(onSuccess, action, context, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$saveCustom$1 */
    /* JADX INFO: compiled from: SkySettingsManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$saveCustom$1", m4426f = "SkySettingsManager.kt", m4427i = {}, m4428l = {1158}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C53741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Context, Unit> $action;
        final /* synthetic */ Context $context;
        final /* synthetic */ Function0<Unit> $onSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C53741(Function0<Unit> function0, Function1<? super Context, Unit> function1, Context context, Continuation<? super C53741> continuation) {
            super(2, continuation);
            this.$onSuccess = function0;
            this.$action = function1;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SkySettingsManager.this.new C53741(this.$onSuccess, this.$action, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0056 A[Catch: all -> 0x0017, Exception -> 0x001a, CancellationException -> 0x001c, TRY_LEAVE, TryCatch #2 {all -> 0x0017, blocks: (B:7:0x0013, B:20:0x004a, B:22:0x0056, B:28:0x0065, B:30:0x0071, B:36:0x009b), top: B:39:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x0071 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #2 {all -> 0x0017, blocks: (B:7:0x0013, B:20:0x004a, B:22:0x0056, B:28:0x0065, B:30:0x0071, B:36:0x009b), top: B:39:0x0007 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Exception error;
            C53741 c53741;
            C53741 coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        try {
                            this.label = 1;
                            if (BuildersKt.withContext(Dispatchers.getIO().plus(NonCancellable.INSTANCE), new AnonymousClass1(this.$action, this.$context, null), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c53741 = this;
                            if (SkySettingsManager.this.fragment.isAdded()) {
                                c53741.$onSuccess.invoke();
                                break;
                            }
                            SkySettingsManager.this.savingCustom = false;
                            return Unit.INSTANCE;
                        } catch (CancellationException cancelled) {
                            throw cancelled;
                        } catch (Exception e) {
                            error = e;
                            c53741 = this;
                            if (SkySettingsManager.this.fragment.isAdded()) {
                                SkySettingsManager.this.toast("Не удалось сохранить настройки: " + error.getMessage());
                            }
                        } catch (Throwable th) {
                            cancelled = th;
                            coroutine_suspended = this;
                            SkySettingsManager.this.savingCustom = false;
                            throw cancelled;
                        }
                        break;
                    case 1:
                        c53741 = this;
                        try {
                            ResultKt.throwOnFailure($result);
                            if (SkySettingsManager.this.fragment.isAdded()) {
                                c53741.$onSuccess.invoke();
                            }
                            break;
                        } catch (CancellationException cancelled2) {
                            throw cancelled2;
                        } catch (Exception e2) {
                            error = e2;
                            if (SkySettingsManager.this.fragment.isAdded()) {
                                SkySettingsManager.this.toast("Не удалось сохранить настройки: " + error.getMessage());
                            }
                        }
                        SkySettingsManager.this.savingCustom = false;
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th2) {
                cancelled = th2;
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$saveCustom$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: SkySettingsManager.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager$saveCustom$1$1", m4426f = "SkySettingsManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Context, Unit> $action;
            final /* synthetic */ Context $context;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function1<? super Context, Unit> function1, Context context, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$action = function1;
                this.$context = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$action, this.$context, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        Function1<Context, Unit> function1 = this.$action;
                        Context context = this.$context;
                        Intrinsics.checkNotNullExpressionValue(context, "$context");
                        function1.invoke(context);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeOutput(JSONArray json, Function0<Unit> onSuccess) throws JSONException {
        final String text = json.toString(4);
        saveCustom(new Function1<Context, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager.writeOutput.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Context context) {
                invoke2(context);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                CustomResources customResources = CustomResources.INSTANCE;
                final String str = text;
                customResources.edit(context, new Function1<File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager.writeOutput.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(File file) {
                        invoke2(file);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(File stage) {
                        Intrinsics.checkNotNullParameter(stage, "stage");
                        File $this$invoke_u24lambda_u240 = new File(stage, "data/timecyc.json");
                        String str2 = str;
                        File parentFile = $this$invoke_u24lambda_u240.getParentFile();
                        Intrinsics.checkNotNull(parentFile);
                        parentFile.mkdirs();
                        Intrinsics.checkNotNull(str2);
                        FilesKt__FileReadWriteKt.writeText$default($this$invoke_u24lambda_u240, str2, null, 2, null);
                    }
                });
            }
        }, onSuccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toast(String message) {
        Toast.makeText(getCtx(), message, 0).show();
    }

    private final GradientDrawable createRoundedBg(String colorHex, float alpha, float radius) {
        int color = Color.parseColor(colorHex);
        GradientDrawable $this$createRoundedBg_u24lambda_u2492 = new GradientDrawable();
        $this$createRoundedBg_u24lambda_u2492.setShape(0);
        $this$createRoundedBg_u24lambda_u2492.setCornerRadius(radius);
        $this$createRoundedBg_u24lambda_u2492.setColor(Color.argb((int) (255 * alpha), Color.red(color), Color.green(color), Color.blue(color)));
        return $this$createRoundedBg_u24lambda_u2492;
    }

    private final GradientDrawable createInputBg() {
        GradientDrawable $this$createInputBg_u24lambda_u2493 = new GradientDrawable();
        $this$createInputBg_u24lambda_u2493.setShape(0);
        $this$createInputBg_u24lambda_u2493.setCornerRadius(m1425dp(12));
        $this$createInputBg_u24lambda_u2493.setColor(Color.parseColor(COLOR_INPUT));
        $this$createInputBg_u24lambda_u2493.setStroke(1, Color.parseColor("#3A3A45"));
        return $this$createInputBg_u24lambda_u2493;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GradientDrawable createColorBoxBg(int color) {
        GradientDrawable $this$createColorBoxBg_u24lambda_u2494 = new GradientDrawable();
        $this$createColorBoxBg_u24lambda_u2494.setShape(0);
        $this$createColorBoxBg_u24lambda_u2494.setCornerRadius(m1425dp(8));
        $this$createColorBoxBg_u24lambda_u2494.setColor(color);
        $this$createColorBoxBg_u24lambda_u2494.setStroke(2, Color.parseColor("#FFFFFF33"));
        return $this$createColorBoxBg_u24lambda_u2494;
    }

    private final RippleDrawable createRippleBackground() {
        return new RippleDrawable(ColorStateList.valueOf(Color.parseColor("#33FFFFFF")), null, null);
    }
}
