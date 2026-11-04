package com.blackhub.bronline.neizzir.gui.editor;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.game.core.constants.Other;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.google.firebase.messaging.Constants;
import com.helpshift.network.NetworkResponseCodes;
import com.helpshift.proactive.InAppViewConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.slf4j.Marker;
import yuku.ambilwarna.AmbilWarnaDialog;

/* JADX INFO: compiled from: GuiEditorActivity.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u008c\u00012\u00020\u0001:\u0002\u008c\u0001B\u0005¢\u0006\u0002\u0010\u0002J4\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020201H\u0002J@\u00103\u001a\u00020+2\u0006\u00104\u001a\u0002022\u0006\u0010,\u001a\u00020\n2\u0006\u00105\u001a\u00020\n2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00106\u001a\u00020.2\u0006\u00107\u001a\u00020.H\u0002J \u00108\u001a\u00020+2\u0006\u00104\u001a\u0002022\u0006\u0010,\u001a\u00020\n2\u0006\u00105\u001a\u00020\nH\u0002J\b\u00109\u001a\u00020+H\u0002J\u0010\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020\rH\u0002J\b\u0010<\u001a\u00020+H\u0002J\u0010\u0010=\u001a\u00020\n2\u0006\u00105\u001a\u00020\nH\u0002J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\n0?2\u0006\u0010@\u001a\u000202H\u0002J\u0010\u0010A\u001a\u00020\n2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020EH\u0002J\b\u0010G\u001a\u00020+H\u0002J\u0010\u0010H\u001a\u00020+2\u0006\u0010;\u001a\u00020\rH\u0002J\u0010\u0010I\u001a\u00020J2\u0006\u0010;\u001a\u00020\rH\u0002J\u0010\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\nH\u0002J\u0010\u0010M\u001a\u00020+2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010N\u001a\u00020+2\u0006\u0010B\u001a\u00020CH\u0002J \u0010O\u001a\u00020\"2\u0006\u0010P\u001a\u00020\n2\u0006\u0010Q\u001a\u00020E2\u0006\u0010R\u001a\u00020JH\u0002J\b\u0010S\u001a\u00020+H\u0002J\b\u0010T\u001a\u00020+H\u0002J\u0010\u0010U\u001a\u00020+2\u0006\u0010;\u001a\u00020\rH\u0002J\u0012\u0010V\u001a\u00020+2\b\u0010W\u001a\u0004\u0018\u00010XH\u0014J\u001a\u0010Y\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\n2\u0006\u0010Z\u001a\u00020EH\u0002J\u0018\u0010[\u001a\u00020\n2\u0006\u0010\\\u001a\u00020\n2\u0006\u0010]\u001a\u00020\nH\u0002J\u0018\u0010^\u001a\u00020+2\u0006\u0010@\u001a\u0002022\u0006\u00105\u001a\u00020\nH\u0002J\b\u0010_\u001a\u00020+H\u0002J\u0010\u0010`\u001a\u00020+2\u0006\u0010a\u001a\u00020\u0015H\u0002J\b\u0010b\u001a\u00020+H\u0002J\b\u0010c\u001a\u00020+H\u0002J\u0010\u0010d\u001a\u00020+2\u0006\u0010\\\u001a\u00020\nH\u0002J\b\u0010e\u001a\u00020+H\u0002J\u0010\u0010f\u001a\u00020\n2\u0006\u0010F\u001a\u00020\nH\u0002J(\u0010g\u001a\u00020+2\u0006\u0010h\u001a\u00020\n2\u0016\b\u0002\u0010i\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020+\u0018\u000101H\u0002J\u0010\u0010j\u001a\u00020+2\u0006\u0010k\u001a\u00020JH\u0002J\b\u0010l\u001a\u00020+H\u0002J\u001a\u0010m\u001a\u00020+2\u0006\u0010n\u001a\u00020\n2\b\u0010o\u001a\u0004\u0018\u00010pH\u0002J\b\u0010q\u001a\u00020+H\u0002J\b\u0010r\u001a\u00020+H\u0002J\b\u0010s\u001a\u00020+H\u0002J\u0010\u0010t\u001a\u00020+2\u0006\u0010a\u001a\u00020\u0015H\u0002J\b\u0010u\u001a\u00020+H\u0002J\u0010\u0010v\u001a\u00020+2\u0006\u0010a\u001a\u00020\u0015H\u0002J\b\u0010w\u001a\u00020+H\u0002J\u001e\u0010x\u001a\u00020y2\u0006\u0010P\u001a\u00020\n2\f\u0010z\u001a\b\u0012\u0004\u0012\u00020+0{H\u0002J\u0010\u0010|\u001a\u00020}2\u0006\u0010~\u001a\u00020EH\u0002J\u0010\u0010\u007f\u001a\u00020\n2\u0006\u0010F\u001a\u00020.H\u0002J\t\u0010\u0080\u0001\u001a\u00020\nH\u0002J\u0012\u0010\u0081\u0001\u001a\u00020+2\u0007\u0010\u0082\u0001\u001a\u00020\nH\u0002J\u001f\u0010\u0083\u0001\u001a\u00020y2\u0006\u0010P\u001a\u00020\n2\f\u0010z\u001a\b\u0012\u0004\u0012\u00020+0{H\u0002J\t\u0010\u0084\u0001\u001a\u00020+H\u0002J$\u0010\u0085\u0001\u001a\u00020+2\u0007\u0010\u0086\u0001\u001a\u00020\n2\u0007\u0010\u0087\u0001\u001a\u00020\n2\u0007\u0010\u0088\u0001\u001a\u00020\u0012H\u0002J\u001d\u0010\u0089\u0001\u001a\u00020+2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020201H\u0002J\t\u0010\u008a\u0001\u001a\u00020+H\u0002J\u0013\u0010\u008b\u0001\u001a\u00020\n2\b\u0010F\u001a\u0004\u0018\u00010\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R*\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u0011j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010%\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020&0\u0011j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020&`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u008d\u0001"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiEditorActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "bpcRepository", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiBpcRepository;", "currentPatch", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudPatch;", "importPresetLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "importTextureLauncher", "lastSavedPreset", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiPresetHandle;", "panel", "Landroid/widget/LinearLayout;", "payloads", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "pendingTextureEntry", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiTextureEntry;", "presetApplier", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiPresetApplier;", "presetList", "presetRepository", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiPresetRepository;", "previewView", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudPreviewView;", "progress", "Landroid/widget/ProgressBar;", "redoStack", "Lkotlin/collections/ArrayDeque;", "selectedMeta", "Landroid/widget/TextView;", "selectedTitle", "sourcePreset", "texturePatches", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiTexturePatch;", "textureRepository", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiTextureRepository;", "undoStack", "addNudgeRow", "", "title", "negative", "", "positive", "transform", "Lkotlin/Function1;", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudElementPatch;", "addStyleNudgeRow", "selected", "key", "min", "max", "addStyleToggleRow", "applyCurrentPreset", "applyPreset", "handle", "buildUi", "colorKeyLabel", "colorKeysFor", "", "element", "displayName", "uri", "Landroid/net/Uri;", CalendarKeys.DAYS_GAME_KEY, "", "value", "exportCurrentPreset", "exportPreset", "hasUnsavedPresetChanges", "", "humanName", "id", "importPresetFromUri", "importTextureFromUri", Constants.ScionAnalytics.PARAM_LABEL, "text", "sp", TtmlNode.BOLD, "loadCurrentHud", "loadHudTexturePreviews", "loadPreset", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "parseAndroidColor", Other.FALLBACK, "payloadNameFor", "entryPath", "extension", "pickColor", "pushUndo", "recolorTexture", "entry", "redo", "refreshPresetList", "removePayloadsForEntry", "resetPatch", "safeFileName", "savePreset", "name", "onSaved", "setBusy", "busy", "showColorDialog", "showError", "prefix", "throwable", "", "showRadarBarsDialog", "showRadarShapeDialog", "showSavePresetDialog", "showTextureActions", "showTextureListDialog", "showTexturePreview", "showWeaponShapeDialog", "smallButton", "Landroid/widget/Button;", "onClick", "Lkotlin/Function0;", "space", "Landroid/view/View;", InAppViewConstants.HEIGHT, "styleValue", "timestampForName", "toast", "message", "toolbarButton", "undo", "updatePreviewTexture", "path", "sourceName", "bytes", "updateSelected", "updateSelectionPanel", "weaponShapeLabel", "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class GuiEditorActivity extends AppCompatActivity {
    private static final Companion Companion = new Companion(null);
    private static final List<String> previewTexturePaths = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Hud/Images/Radar/hp_icon.btx", "Hud/Images/Radar/armor_icon.btx", "Hud/Images/Buttons/old_daily_case.btx", "Hud/Images/Crosshair/sniper_plus.btx", "Hud/Images/Crosshair/sniper_minus.btx", "Hud/Images/Speedometer/scale.btx", "Hud/Images/Speedometer/left.btx", "Hud/Images/Speedometer/right.btx", "Hud/Images/Speedometer/engine.btx", "Hud/Images/Speedometer/fuel.btx", "Hud/Images/Weapons/ak47.btx"});
    private GuiBpcRepository bpcRepository;
    private GuiPresetHandle lastSavedPreset;
    private LinearLayout panel;
    private GuiTextureEntry pendingTextureEntry;
    private GuiPresetApplier presetApplier;
    private LinearLayout presetList;
    private GuiPresetRepository presetRepository;
    private GuiHudPreviewView previewView;
    private ProgressBar progress;
    private TextView selectedMeta;
    private TextView selectedTitle;
    private GuiPresetHandle sourcePreset;
    private GuiTextureRepository textureRepository;
    private GuiHudPatch currentPatch = new GuiHudPatch((RadarShape) null, (RadarBarsShape) null, (List) null, 7, (DefaultConstructorMarker) null);
    private final LinkedHashMap<String, GuiTexturePatch> texturePatches = new LinkedHashMap<>();
    private final LinkedHashMap<String, byte[]> payloads = new LinkedHashMap<>();
    private final ArrayDeque<GuiHudPatch> undoStack = new ArrayDeque<>();
    private final ArrayDeque<GuiHudPatch> redoStack = new ArrayDeque<>();
    private final ActivityResultLauncher<String[]> importTextureLauncher = registerForActivityResult(new ActivityResultContracts.OpenDocument(), new ActivityResultCallback() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$$ExternalSyntheticLambda9
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            GuiEditorActivity.importTextureLauncher$lambda$0(this.f$0, (Uri) obj);
        }
    });
    private final ActivityResultLauncher<String[]> importPresetLauncher = registerForActivityResult(new ActivityResultContracts.OpenDocument(), new ActivityResultCallback() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$$ExternalSyntheticLambda10
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            GuiEditorActivity.importPresetLauncher$lambda$1(this.f$0, (Uri) obj);
        }
    });

    public static final /* synthetic */ void access$showTextureActions(GuiEditorActivity $this, GuiTextureEntry entry) {
        $this.showTextureActions(entry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void importTextureLauncher$lambda$0(GuiEditorActivity this$0, Uri uri) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (uri != null) {
            this$0.importTextureFromUri(uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void importPresetLauncher$lambda$1(GuiEditorActivity this$0, Uri uri) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (uri != null) {
            this$0.importPresetFromUri(uri);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(0);
        getWindow().setFlags(1024, 1024);
        getWindow().getDecorView().setSystemUiVisibility(5894);
        this.bpcRepository = new GuiBpcRepository(this);
        this.textureRepository = new GuiTextureRepository(this);
        this.presetRepository = new GuiPresetRepository(this);
        GuiEditorActivity guiEditorActivity = this;
        GuiBpcRepository guiBpcRepository = this.bpcRepository;
        GuiPresetRepository guiPresetRepository = null;
        if (guiBpcRepository == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bpcRepository");
            guiBpcRepository = null;
        }
        GuiTextureRepository guiTextureRepository = this.textureRepository;
        if (guiTextureRepository == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textureRepository");
            guiTextureRepository = null;
        }
        GuiPresetRepository guiPresetRepository2 = this.presetRepository;
        if (guiPresetRepository2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presetRepository");
        } else {
            guiPresetRepository = guiPresetRepository2;
        }
        this.presetApplier = new GuiPresetApplier(guiEditorActivity, guiBpcRepository, guiTextureRepository, guiPresetRepository);
        buildUi();
        loadCurrentHud();
        loadHudTexturePreviews();
        refreshPresetList();
    }

    private final void buildUi() {
        ProgressBar progressBar;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(Color.rgb(7, 10, 16));
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(m1431dp(10), m1431dp(8), m1431dp(10), m1431dp(8));
        linearLayout2.addView(toolbarButton("Назад", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.buildUi.1
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
                GuiEditorActivity.this.finish();
            }
        }));
        linearLayout2.addView(toolbarButton("Undo", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.buildUi.2
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
                GuiEditorActivity.this.undo();
            }
        }));
        linearLayout2.addView(toolbarButton("Redo", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.buildUi.3
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
                GuiEditorActivity.this.redo();
            }
        }));
        linearLayout2.addView(toolbarButton("Reset", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.buildUi.4
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
                GuiEditorActivity.this.resetPatch();
            }
        }));
        linearLayout2.addView(toolbarButton("Форма карты", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.buildUi.5
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
                GuiEditorActivity.this.showRadarShapeDialog();
            }
        }));
        linearLayout2.addView(toolbarButton("HP/Armor", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.buildUi.6
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
                GuiEditorActivity.this.showRadarBarsDialog();
            }
        }));
        linearLayout2.addView(toolbarButton("Цвет", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.buildUi.7
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
                GuiEditorActivity.this.showColorDialog();
            }
        }));
        linearLayout2.addView(toolbarButton("Текстуры", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.buildUi.8
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
                GuiEditorActivity.this.showTextureListDialog();
            }
        }));
        linearLayout2.addView(toolbarButton("Сохранить", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.buildUi.9
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
                GuiEditorActivity.this.showSavePresetDialog();
            }
        }));
        linearLayout2.addView(toolbarButton("Применить", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.buildUi.10
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
                GuiEditorActivity.this.applyCurrentPreset();
            }
        }));
        linearLayout2.addView(toolbarButton("Импорт ZIP", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.buildUi.11
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
                GuiEditorActivity.this.importPresetLauncher.launch(new String[]{"application/zip", "application/octet-stream", "*/*"});
            }
        }));
        linearLayout2.addView(toolbarButton("Экспорт ZIP", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.buildUi.12
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
                GuiEditorActivity.this.exportCurrentPreset();
            }
        }));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.addView(linearLayout2);
        linearLayout.addView(horizontalScrollView, new LinearLayout.LayoutParams(-1, m1431dp(58)));
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(m1431dp(8), 0, m1431dp(8), m1431dp(8));
        GuiHudPreviewView guiHudPreviewView = new GuiHudPreviewView(this, null, 2, 0 == true ? 1 : 0);
        guiHudPreviewView.setSelectedId(GuiHudElementIds.RADAR);
        guiHudPreviewView.setOnBeforeUserChange(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$buildUi$14$1
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
                this.this$0.pushUndo();
            }
        });
        guiHudPreviewView.setOnPatchChanged(new Function1<GuiHudPatch, Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$buildUi$14$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GuiHudPatch guiHudPatch) {
                invoke2(guiHudPatch);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GuiHudPatch it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.currentPatch = it;
                this.this$0.lastSavedPreset = null;
                this.this$0.updateSelectionPanel();
            }
        });
        guiHudPreviewView.setOnSelectionChanged(new Function1<String, Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$buildUi$14$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.updateSelectionPanel();
            }
        });
        this.previewView = guiHudPreviewView;
        GuiHudPreviewView guiHudPreviewView2 = this.previewView;
        if (guiHudPreviewView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewView");
            guiHudPreviewView2 = null;
        }
        linearLayout3.addView(guiHudPreviewView2, new LinearLayout.LayoutParams(0, -1, 1.0f));
        LinearLayout linearLayout4 = new LinearLayout(this);
        linearLayout4.setOrientation(1);
        linearLayout4.setPadding(m1431dp(12), m1431dp(12), m1431dp(12), m1431dp(12));
        linearLayout4.setBackgroundColor(Color.rgb(16, 21, 31));
        this.panel = linearLayout4;
        ScrollView scrollView = new ScrollView(this);
        LinearLayout linearLayout5 = this.panel;
        if (linearLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("panel");
            linearLayout5 = null;
        }
        scrollView.addView(linearLayout5);
        linearLayout3.addView(scrollView, new LinearLayout.LayoutParams(m1431dp(330), -1));
        linearLayout.addView(linearLayout3, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        ProgressBar progressBar2 = new ProgressBar(this);
        progressBar2.setVisibility(8);
        this.progress = progressBar2;
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.addView(linearLayout);
        ProgressBar progressBar3 = this.progress;
        if (progressBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            progressBar = null;
        } else {
            progressBar = progressBar3;
        }
        frameLayout.addView(progressBar, new FrameLayout.LayoutParams(m1431dp(64), m1431dp(64), 17));
        setContentView(frameLayout);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$loadCurrentHud$1 */
    /* JADX INFO: compiled from: GuiEditorActivity.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$loadCurrentHud$1", m4426f = "GuiEditorActivity.kt", m4427i = {}, m4428l = {160}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C56311(Continuation<? super C56311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GuiEditorActivity.this.new C56311(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C56311 c56311;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            GuiBpcRepository guiBpcRepository = null;
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c56311 = this;
                    c56311.label = 1;
                    Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new GuiEditorActivity$loadCurrentHud$1$result$1(GuiEditorActivity.this, null), c56311);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objWithContext;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c56311 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object result = ((Result) $result).getValue();
            GuiEditorActivity guiEditorActivity = GuiEditorActivity.this;
            GuiHudDefaults guiHudDefaults = GuiHudDefaults.INSTANCE;
            Object guiHudPatch = new GuiHudPatch((RadarShape) null, (RadarBarsShape) null, (List) null, 7, (DefaultConstructorMarker) null);
            if (!Result.m15557isFailureimpl(result)) {
                guiHudPatch = result;
            }
            guiEditorActivity.currentPatch = guiHudDefaults.normalize((GuiHudPatch) guiHudPatch);
            GuiHudPreviewView guiHudPreviewView = GuiEditorActivity.this.previewView;
            if (guiHudPreviewView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("previewView");
                guiHudPreviewView = null;
            }
            guiHudPreviewView.setPatch(GuiEditorActivity.this.currentPatch);
            GuiEditorActivity.this.updateSelectionPanel();
            if (Result.m15557isFailureimpl(result)) {
                GuiEditorActivity.this.showError("Не удалось прочитать Hud/NewHud.xaml", Result.m15554exceptionOrNullimpl(result));
            } else {
                GuiBpcRepository guiBpcRepository2 = GuiEditorActivity.this.bpcRepository;
                if (guiBpcRepository2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bpcRepository");
                } else {
                    guiBpcRepository = guiBpcRepository2;
                }
                if (!guiBpcRepository.exists()) {
                    GuiEditorActivity.this.toast("gui.bpc не найден. Можно собрать пресет, но применить получится после установки игры.");
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void loadCurrentHud() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C56311(null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$loadHudTexturePreviews$1 */
    /* JADX INFO: compiled from: GuiEditorActivity.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$loadHudTexturePreviews$1", m4426f = "GuiEditorActivity.kt", m4427i = {}, m4428l = {182}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C56321(Continuation<? super C56321> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GuiEditorActivity.this.new C56321(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C56321 c56321;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            GuiHudPreviewView guiHudPreviewView = null;
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c56321 = this;
                    c56321.label = 1;
                    Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new GuiEditorActivity$loadHudTexturePreviews$1$result$1(GuiEditorActivity.this, null), c56321);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objWithContext;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c56321 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object result = ((Result) $result).getValue();
            GuiEditorActivity guiEditorActivity = GuiEditorActivity.this;
            if (Result.m15558isSuccessimpl(result)) {
                Map<String, Bitmap> map = (Map) result;
                GuiHudPreviewView guiHudPreviewView2 = guiEditorActivity.previewView;
                if (guiHudPreviewView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("previewView");
                } else {
                    guiHudPreviewView = guiHudPreviewView2;
                }
                guiHudPreviewView.setTextureBitmaps(map);
            }
            return Unit.INSTANCE;
        }
    }

    private final void loadHudTexturePreviews() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C56321(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectionPanel() {
        Object element$iv;
        String id;
        GuiHudPreviewView guiHudPreviewView;
        LinearLayout linearLayout = this.panel;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("panel");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        Iterable $this$firstOrNull$iv = this.currentPatch.getElements();
        Iterator it = $this$firstOrNull$iv.iterator();
        do {
            if (!it.hasNext()) {
                element$iv = null;
                break;
            }
            element$iv = it.next();
            GuiHudElementPatch it2 = (GuiHudElementPatch) element$iv;
            id = it2.getId();
            guiHudPreviewView = this.previewView;
            if (guiHudPreviewView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("previewView");
                guiHudPreviewView = null;
            }
        } while (!Intrinsics.areEqual(id, guiHudPreviewView.getSelectedId()));
        GuiHudElementPatch guiHudElementPatchElement = (GuiHudElementPatch) element$iv;
        if (guiHudElementPatchElement == null) {
            GuiHudDefaults guiHudDefaults = GuiHudDefaults.INSTANCE;
            GuiHudPreviewView guiHudPreviewView2 = this.previewView;
            if (guiHudPreviewView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("previewView");
                guiHudPreviewView2 = null;
            }
            guiHudElementPatchElement = guiHudDefaults.element(guiHudPreviewView2.getSelectedId());
        }
        final GuiHudElementPatch selected = guiHudElementPatchElement;
        this.selectedTitle = label("Выбран: " + humanName(selected.getId()), 18, true);
        StringBuilder sbAppend = new StringBuilder().append("x=").append((int) selected.getX()).append("  y=").append((int) selected.getY()).append("  w=").append((int) selected.getWidth()).append("  h=").append((int) selected.getHeight()).append("  scale=");
        String str = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(selected.getScale())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        this.selectedMeta = label(sbAppend.append(str).toString(), 13, false);
        LinearLayout linearLayout3 = this.panel;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("panel");
            linearLayout3 = null;
        }
        TextView textView = this.selectedTitle;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedTitle");
            textView = null;
        }
        linearLayout3.addView(textView);
        LinearLayout linearLayout4 = this.panel;
        if (linearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("panel");
            linearLayout4 = null;
        }
        TextView textView2 = this.selectedMeta;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedMeta");
            textView2 = null;
        }
        linearLayout4.addView(textView2);
        LinearLayout linearLayout5 = this.panel;
        if (linearLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("panel");
            linearLayout5 = null;
        }
        linearLayout5.addView(space(8));
        LinearLayout linearLayout6 = this.panel;
        if (linearLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("panel");
            linearLayout6 = null;
        }
        linearLayout6.addView(label("Позиция", 13, true));
        addNudgeRow("X", -10.0f, 10.0f, new Function1<Float, GuiHudElementPatch>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.updateSelectionPanel.1
            {
                super(1);
            }

            public final GuiHudElementPatch invoke(float delta) {
                GuiHudElementPatch guiHudElementPatch = selected;
                return guiHudElementPatch.copy((71 & 1) != 0 ? guiHudElementPatch.id : null, (71 & 2) != 0 ? guiHudElementPatch.x : RangesKt___RangesKt.coerceIn(selected.getX() + delta, 0.0f, 1920.0f), (71 & 4) != 0 ? guiHudElementPatch.y : 0.0f, (71 & 8) != 0 ? guiHudElementPatch.width : 0.0f, (71 & 16) != 0 ? guiHudElementPatch.height : 0.0f, (71 & 32) != 0 ? guiHudElementPatch.scale : 0.0f, (71 & 64) != 0 ? guiHudElementPatch.visible : false, (71 & 128) != 0 ? guiHudElementPatch.colorOverrides : null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ GuiHudElementPatch invoke(Float f) {
                return invoke(f.floatValue());
            }
        });
        addNudgeRow("Y", -10.0f, 10.0f, new Function1<Float, GuiHudElementPatch>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.updateSelectionPanel.2
            {
                super(1);
            }

            public final GuiHudElementPatch invoke(float delta) {
                GuiHudElementPatch guiHudElementPatch = selected;
                return guiHudElementPatch.copy((71 & 1) != 0 ? guiHudElementPatch.id : null, (71 & 2) != 0 ? guiHudElementPatch.x : 0.0f, (71 & 4) != 0 ? guiHudElementPatch.y : RangesKt___RangesKt.coerceIn(selected.getY() + delta, 0.0f, 1080.0f), (71 & 8) != 0 ? guiHudElementPatch.width : 0.0f, (71 & 16) != 0 ? guiHudElementPatch.height : 0.0f, (71 & 32) != 0 ? guiHudElementPatch.scale : 0.0f, (71 & 64) != 0 ? guiHudElementPatch.visible : false, (71 & 128) != 0 ? guiHudElementPatch.colorOverrides : null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ GuiHudElementPatch invoke(Float f) {
                return invoke(f.floatValue());
            }
        });
        LinearLayout linearLayout7 = this.panel;
        if (linearLayout7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("panel");
            linearLayout7 = null;
        }
        linearLayout7.addView(label("Размер", 13, true));
        addNudgeRow(ExifInterface.LONGITUDE_WEST, -10.0f, 10.0f, new Function1<Float, GuiHudElementPatch>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.updateSelectionPanel.3
            {
                super(1);
            }

            public final GuiHudElementPatch invoke(float delta) {
                GuiHudElementPatch guiHudElementPatch = selected;
                return guiHudElementPatch.copy((71 & 1) != 0 ? guiHudElementPatch.id : null, (71 & 2) != 0 ? guiHudElementPatch.x : 0.0f, (71 & 4) != 0 ? guiHudElementPatch.y : 0.0f, (71 & 8) != 0 ? guiHudElementPatch.width : RangesKt___RangesKt.coerceIn(selected.getWidth() + delta, 30.0f, 1920.0f), (71 & 16) != 0 ? guiHudElementPatch.height : 0.0f, (71 & 32) != 0 ? guiHudElementPatch.scale : 0.0f, (71 & 64) != 0 ? guiHudElementPatch.visible : false, (71 & 128) != 0 ? guiHudElementPatch.colorOverrides : null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ GuiHudElementPatch invoke(Float f) {
                return invoke(f.floatValue());
            }
        });
        addNudgeRow("H", -10.0f, 10.0f, new Function1<Float, GuiHudElementPatch>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.updateSelectionPanel.4
            {
                super(1);
            }

            public final GuiHudElementPatch invoke(float delta) {
                GuiHudElementPatch guiHudElementPatch = selected;
                return guiHudElementPatch.copy((71 & 1) != 0 ? guiHudElementPatch.id : null, (71 & 2) != 0 ? guiHudElementPatch.x : 0.0f, (71 & 4) != 0 ? guiHudElementPatch.y : 0.0f, (71 & 8) != 0 ? guiHudElementPatch.width : 0.0f, (71 & 16) != 0 ? guiHudElementPatch.height : RangesKt___RangesKt.coerceIn(selected.getHeight() + delta, 30.0f, 1080.0f), (71 & 32) != 0 ? guiHudElementPatch.scale : 0.0f, (71 & 64) != 0 ? guiHudElementPatch.visible : false, (71 & 128) != 0 ? guiHudElementPatch.colorOverrides : null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ GuiHudElementPatch invoke(Float f) {
                return invoke(f.floatValue());
            }
        });
        LinearLayout linearLayout8 = this.panel;
        if (linearLayout8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("panel");
            linearLayout8 = null;
        }
        linearLayout8.addView(label("Масштаб", 13, true));
        addNudgeRow("Scale", -0.05f, 0.05f, new Function1<Float, GuiHudElementPatch>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.updateSelectionPanel.5
            {
                super(1);
            }

            public final GuiHudElementPatch invoke(float delta) {
                GuiHudElementPatch guiHudElementPatch = selected;
                return guiHudElementPatch.copy((71 & 1) != 0 ? guiHudElementPatch.id : null, (71 & 2) != 0 ? guiHudElementPatch.x : 0.0f, (71 & 4) != 0 ? guiHudElementPatch.y : 0.0f, (71 & 8) != 0 ? guiHudElementPatch.width : 0.0f, (71 & 16) != 0 ? guiHudElementPatch.height : 0.0f, (71 & 32) != 0 ? guiHudElementPatch.scale : RangesKt___RangesKt.coerceIn(selected.getScale() + delta, 0.2f, 3.5f), (71 & 64) != 0 ? guiHudElementPatch.visible : false, (71 & 128) != 0 ? guiHudElementPatch.colorOverrides : null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ GuiHudElementPatch invoke(Float f) {
                return invoke(f.floatValue());
            }
        });
        CheckBox $this$updateSelectionPanel_u24lambda_u2413 = new CheckBox(this);
        $this$updateSelectionPanel_u24lambda_u2413.setText("Показывать элемент");
        $this$updateSelectionPanel_u24lambda_u2413.setTextColor(-1);
        $this$updateSelectionPanel_u24lambda_u2413.setTextSize(14.0f);
        $this$updateSelectionPanel_u24lambda_u2413.setChecked(selected.getVisible());
        $this$updateSelectionPanel_u24lambda_u2413.setButtonTintList(ColorStateList.valueOf(Color.rgb(0, 229, ComposerKt.providerMapsKey)));
        $this$updateSelectionPanel_u24lambda_u2413.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$$ExternalSyntheticLambda5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                GuiEditorActivity.updateSelectionPanel$lambda$13$lambda$12(this.f$0, compoundButton, z);
            }
        });
        LinearLayout linearLayout9 = this.panel;
        if (linearLayout9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("panel");
            linearLayout9 = null;
        }
        linearLayout9.addView($this$updateSelectionPanel_u24lambda_u2413);
        if (Intrinsics.areEqual(selected.getId(), GuiHudElementIds.HP_BAR) || Intrinsics.areEqual(selected.getId(), GuiHudElementIds.ARMOR_BAR)) {
            LinearLayout linearLayout10 = this.panel;
            if (linearLayout10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("panel");
                linearLayout10 = null;
            }
            linearLayout10.addView(space(8));
            LinearLayout linearLayout11 = this.panel;
            if (linearLayout11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("panel");
                linearLayout11 = null;
            }
            linearLayout11.addView(label("Стиль полоски", 13, true));
            addStyleNudgeRow(selected, "Border", "borderWidth", -1.0f, 1.0f, 0.0f, 16.0f);
            addStyleNudgeRow(selected, "Radius", InAppViewConstants.RADIUS, -2.0f, 2.0f, 0.0f, 60.0f);
        }
        if (Intrinsics.areEqual(selected.getId(), GuiHudElementIds.MONEY_VALUE)) {
            LinearLayout linearLayout12 = this.panel;
            if (linearLayout12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("panel");
                linearLayout12 = null;
            }
            linearLayout12.addView(space(8));
            LinearLayout linearLayout13 = this.panel;
            if (linearLayout13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("panel");
                linearLayout13 = null;
            }
            linearLayout13.addView(label("Стиль денег", 13, true));
            addStyleToggleRow(selected, "Фон денег", "backgroundVisible");
        }
        if (Intrinsics.areEqual(selected.getId(), GuiHudElementIds.WEAPON)) {
            LinearLayout linearLayout14 = this.panel;
            if (linearLayout14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("panel");
                linearLayout14 = null;
            }
            linearLayout14.addView(space(8));
            LinearLayout linearLayout15 = this.panel;
            if (linearLayout15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("panel");
                linearLayout15 = null;
            }
            linearLayout15.addView(label("Стиль Weapon", 13, true));
            LinearLayout linearLayout16 = this.panel;
            if (linearLayout16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("panel");
                linearLayout16 = null;
            }
            linearLayout16.addView(toolbarButton("Форма: " + weaponShapeLabel(selected.getColorOverrides().get("shape")), new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.updateSelectionPanel.6
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
                    GuiEditorActivity.this.showWeaponShapeDialog();
                }
            }));
            addStyleToggleRow(selected, "Фон кнопки", "backgroundVisible");
            addStyleNudgeRow(selected, "Border", "borderWidth", -1.0f, 1.0f, 0.0f, 16.0f);
            addStyleNudgeRow(selected, "Radius", InAppViewConstants.RADIUS, -2.0f, 2.0f, 0.0f, 80.0f);
        }
        LinearLayout linearLayout17 = this.panel;
        if (linearLayout17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("panel");
            linearLayout17 = null;
        }
        linearLayout17.addView(space(12));
        LinearLayout linearLayout18 = this.panel;
        if (linearLayout18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("panel");
            linearLayout18 = null;
        }
        linearLayout18.addView(label("Пресеты", 16, true));
        LinearLayout $this$updateSelectionPanel_u24lambda_u2414 = new LinearLayout(this);
        $this$updateSelectionPanel_u24lambda_u2414.setOrientation(1);
        this.presetList = $this$updateSelectionPanel_u24lambda_u2414;
        LinearLayout linearLayout19 = this.panel;
        if (linearLayout19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("panel");
            linearLayout19 = null;
        }
        LinearLayout linearLayout20 = this.presetList;
        if (linearLayout20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presetList");
        } else {
            linearLayout2 = linearLayout20;
        }
        linearLayout19.addView(linearLayout2);
        refreshPresetList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSelectionPanel$lambda$13$lambda$12(GuiEditorActivity this$0, CompoundButton compoundButton, final boolean checked) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.pushUndo();
        this$0.updateSelected(new Function1<GuiHudElementPatch, GuiHudElementPatch>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$updateSelectionPanel$visible$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final GuiHudElementPatch invoke(GuiHudElementPatch it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.copy((71 & 1) != 0 ? it.id : null, (71 & 2) != 0 ? it.x : 0.0f, (71 & 4) != 0 ? it.y : 0.0f, (71 & 8) != 0 ? it.width : 0.0f, (71 & 16) != 0 ? it.height : 0.0f, (71 & 32) != 0 ? it.scale : 0.0f, (71 & 64) != 0 ? it.visible : checked, (71 & 128) != 0 ? it.colorOverrides : null);
            }
        });
    }

    private final void addNudgeRow(String title, final float negative, final float positive, final Function1<? super Float, GuiHudElementPatch> transform) {
        LinearLayout row = new LinearLayout(this);
        row.setOrientation(0);
        row.setGravity(16);
        row.setPadding(0, m1431dp(3), 0, m1431dp(3));
        row.addView(label(title, 13, false), new LinearLayout.LayoutParams(0, -2, 1.0f));
        row.addView(smallButton("-", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.addNudgeRow.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                GuiEditorActivity.this.pushUndo();
                GuiEditorActivity guiEditorActivity = GuiEditorActivity.this;
                final Function1<Float, GuiHudElementPatch> function1 = transform;
                final float f = negative;
                guiEditorActivity.updateSelected(new Function1<GuiHudElementPatch, GuiHudElementPatch>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.addNudgeRow.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final GuiHudElementPatch invoke(GuiHudElementPatch it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return function1.invoke(Float.valueOf(f));
                    }
                });
            }
        }));
        row.addView(smallButton(Marker.ANY_NON_NULL_MARKER, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.addNudgeRow.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                GuiEditorActivity.this.pushUndo();
                GuiEditorActivity guiEditorActivity = GuiEditorActivity.this;
                final Function1<Float, GuiHudElementPatch> function1 = transform;
                final float f = positive;
                guiEditorActivity.updateSelected(new Function1<GuiHudElementPatch, GuiHudElementPatch>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.addNudgeRow.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final GuiHudElementPatch invoke(GuiHudElementPatch it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return function1.invoke(Float.valueOf(f));
                    }
                });
            }
        }));
        LinearLayout linearLayout = this.panel;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("panel");
            linearLayout = null;
        }
        linearLayout.addView(row);
    }

    private final void addStyleNudgeRow(GuiHudElementPatch selected, String title, final String key, final float negative, final float positive, final float min, final float max) {
        Float floatOrNull;
        LinearLayout $this$addStyleNudgeRow_u24lambda_u2416 = new LinearLayout(this);
        $this$addStyleNudgeRow_u24lambda_u2416.setOrientation(0);
        $this$addStyleNudgeRow_u24lambda_u2416.setGravity(16);
        $this$addStyleNudgeRow_u24lambda_u2416.setPadding(0, m1431dp(3), 0, m1431dp(3));
        String str = selected.getColorOverrides().get(key);
        final float current = (str == null || (floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(str)) == null) ? 0.0f : floatOrNull.floatValue();
        $this$addStyleNudgeRow_u24lambda_u2416.addView(label(title + ' ' + ((int) current), 13, false), new LinearLayout.LayoutParams(0, -2, 1.0f));
        $this$addStyleNudgeRow_u24lambda_u2416.addView(smallButton("-", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.addStyleNudgeRow.1
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
                GuiEditorActivity.this.pushUndo();
                GuiEditorActivity guiEditorActivity = GuiEditorActivity.this;
                final String str2 = key;
                final float f = current;
                final float f2 = negative;
                final float f3 = min;
                final float f4 = max;
                final GuiEditorActivity guiEditorActivity2 = GuiEditorActivity.this;
                guiEditorActivity.updateSelected(new Function1<GuiHudElementPatch, GuiHudElementPatch>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.addStyleNudgeRow.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final GuiHudElementPatch invoke(GuiHudElementPatch element) {
                        Float floatOrNull2;
                        Intrinsics.checkNotNullParameter(element, "element");
                        String str3 = element.getColorOverrides().get(str2);
                        float value = RangesKt___RangesKt.coerceIn(((str3 == null || (floatOrNull2 = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(str3)) == null) ? f : floatOrNull2.floatValue()) + f2, f3, f4);
                        return element.copy((71 & 1) != 0 ? element.id : null, (71 & 2) != 0 ? element.x : 0.0f, (71 & 4) != 0 ? element.y : 0.0f, (71 & 8) != 0 ? element.width : 0.0f, (71 & 16) != 0 ? element.height : 0.0f, (71 & 32) != 0 ? element.scale : 0.0f, (71 & 64) != 0 ? element.visible : false, (71 & 128) != 0 ? element.colorOverrides : MapsKt__MapsKt.plus(element.getColorOverrides(), TuplesKt.m4423to(str2, guiEditorActivity2.styleValue(value))));
                    }
                });
            }
        }));
        $this$addStyleNudgeRow_u24lambda_u2416.addView(smallButton(Marker.ANY_NON_NULL_MARKER, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.addStyleNudgeRow.2
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
                GuiEditorActivity.this.pushUndo();
                GuiEditorActivity guiEditorActivity = GuiEditorActivity.this;
                final String str2 = key;
                final float f = current;
                final float f2 = positive;
                final float f3 = min;
                final float f4 = max;
                final GuiEditorActivity guiEditorActivity2 = GuiEditorActivity.this;
                guiEditorActivity.updateSelected(new Function1<GuiHudElementPatch, GuiHudElementPatch>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.addStyleNudgeRow.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final GuiHudElementPatch invoke(GuiHudElementPatch element) {
                        Float floatOrNull2;
                        Intrinsics.checkNotNullParameter(element, "element");
                        String str3 = element.getColorOverrides().get(str2);
                        float value = RangesKt___RangesKt.coerceIn(((str3 == null || (floatOrNull2 = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(str3)) == null) ? f : floatOrNull2.floatValue()) + f2, f3, f4);
                        return element.copy((71 & 1) != 0 ? element.id : null, (71 & 2) != 0 ? element.x : 0.0f, (71 & 4) != 0 ? element.y : 0.0f, (71 & 8) != 0 ? element.width : 0.0f, (71 & 16) != 0 ? element.height : 0.0f, (71 & 32) != 0 ? element.scale : 0.0f, (71 & 64) != 0 ? element.visible : false, (71 & 128) != 0 ? element.colorOverrides : MapsKt__MapsKt.plus(element.getColorOverrides(), TuplesKt.m4423to(str2, guiEditorActivity2.styleValue(value))));
                    }
                });
            }
        }));
        LinearLayout linearLayout = this.panel;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("panel");
            linearLayout = null;
        }
        linearLayout.addView($this$addStyleNudgeRow_u24lambda_u2416);
    }

    private final void addStyleToggleRow(GuiHudElementPatch selected, String title, final String key) {
        CheckBox $this$addStyleToggleRow_u24lambda_u2418 = new CheckBox(this);
        $this$addStyleToggleRow_u24lambda_u2418.setText(title);
        $this$addStyleToggleRow_u24lambda_u2418.setTextColor(-1);
        $this$addStyleToggleRow_u24lambda_u2418.setTextSize(14.0f);
        $this$addStyleToggleRow_u24lambda_u2418.setChecked(!Intrinsics.areEqual(selected.getColorOverrides().get(key), CommonUrlParts.Values.FALSE_INTEGER));
        $this$addStyleToggleRow_u24lambda_u2418.setButtonTintList(ColorStateList.valueOf(Color.rgb(0, 229, ComposerKt.providerMapsKey)));
        $this$addStyleToggleRow_u24lambda_u2418.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$$ExternalSyntheticLambda7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                GuiEditorActivity.addStyleToggleRow$lambda$18$lambda$17(this.f$0, key, compoundButton, z);
            }
        });
        LinearLayout linearLayout = this.panel;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("panel");
            linearLayout = null;
        }
        linearLayout.addView($this$addStyleToggleRow_u24lambda_u2418);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addStyleToggleRow$lambda$18$lambda$17(GuiEditorActivity this$0, final String key, CompoundButton compoundButton, final boolean checked) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        this$0.pushUndo();
        this$0.updateSelected(new Function1<GuiHudElementPatch, GuiHudElementPatch>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$addStyleToggleRow$toggle$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final GuiHudElementPatch invoke(GuiHudElementPatch element) {
                Intrinsics.checkNotNullParameter(element, "element");
                return element.copy((71 & 1) != 0 ? element.id : null, (71 & 2) != 0 ? element.x : 0.0f, (71 & 4) != 0 ? element.y : 0.0f, (71 & 8) != 0 ? element.width : 0.0f, (71 & 16) != 0 ? element.height : 0.0f, (71 & 32) != 0 ? element.scale : 0.0f, (71 & 64) != 0 ? element.visible : false, (71 & 128) != 0 ? element.colorOverrides : MapsKt__MapsKt.plus(element.getColorOverrides(), TuplesKt.m4423to(key, checked ? "1" : CommonUrlParts.Values.FALSE_INTEGER)));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshPresetList() {
        Object objM15551constructorimpl;
        LinearLayout linearLayout;
        if (this.presetList == null) {
            return;
        }
        LinearLayout linearLayout2 = this.presetList;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presetList");
            linearLayout2 = null;
        }
        linearLayout2.removeAllViews();
        try {
            Result.Companion companion = Result.INSTANCE;
            GuiEditorActivity $this$refreshPresetList_u24lambda_u2419 = this;
            GuiPresetRepository guiPresetRepository = $this$refreshPresetList_u24lambda_u2419.presetRepository;
            if (guiPresetRepository == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presetRepository");
                guiPresetRepository = null;
            }
            objM15551constructorimpl = Result.m15551constructorimpl(guiPresetRepository.listPresets());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
        }
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
            objM15551constructorimpl = listEmptyList;
        }
        List handles = (List) objM15551constructorimpl;
        if (handles.isEmpty()) {
            LinearLayout linearLayout3 = this.presetList;
            if (linearLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presetList");
                linearLayout = null;
            } else {
                linearLayout = linearLayout3;
            }
            linearLayout.addView(label("Пока нет сохраненных пресетов", 12, false));
            return;
        }
        Iterable $this$forEach$iv = CollectionsKt___CollectionsKt.take(handles, 8);
        for (Object element$iv : $this$forEach$iv) {
            final GuiPresetHandle handle = (GuiPresetHandle) element$iv;
            LinearLayout $this$refreshPresetList_u24lambda_u2422_u24lambda_u2421 = new LinearLayout(this);
            $this$refreshPresetList_u24lambda_u2422_u24lambda_u2421.setOrientation(1);
            $this$refreshPresetList_u24lambda_u2422_u24lambda_u2421.setPadding(0, m1431dp(6), 0, m1431dp(6));
            $this$refreshPresetList_u24lambda_u2422_u24lambda_u2421.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$$ExternalSyntheticLambda11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GuiEditorActivity.refreshPresetList$lambda$22$lambda$21$lambda$20(this.f$0, handle, view);
                }
            });
            $this$refreshPresetList_u24lambda_u2422_u24lambda_u2421.addView(label(handle.getPreset().getName(), 14, true));
            $this$refreshPresetList_u24lambda_u2422_u24lambda_u2421.addView(label(handle.getPreset().getTexturePatches().size() + " texture patches", 11, false));
            LinearLayout linearLayout4 = this.presetList;
            if (linearLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presetList");
                linearLayout4 = null;
            }
            linearLayout4.addView($this$refreshPresetList_u24lambda_u2422_u24lambda_u2421);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshPresetList$lambda$22$lambda$21$lambda$20(GuiEditorActivity this$0, GuiPresetHandle handle, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(handle, "$handle");
        this$0.loadPreset(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRadarShapeDialog() {
        String[] names = {"Круглая", "Квадратная", "Скругленная"};
        final RadarShape[] values = {RadarShape.ROUND, RadarShape.SQUARE, RadarShape.ROUNDED};
        int selected = RangesKt___RangesKt.coerceAtLeast(ArraysKt___ArraysKt.indexOf(values, this.currentPatch.getRadarShape()), 0);
        new AlertDialog.Builder(this).setTitle("Форма миникарты").setSingleChoiceItems(names, selected, new DialogInterface.OnClickListener() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$$ExternalSyntheticLambda8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                GuiEditorActivity.showRadarShapeDialog$lambda$23(this.f$0, values, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRadarShapeDialog$lambda$23(GuiEditorActivity this$0, RadarShape[] values, DialogInterface dialog, int which) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(values, "$values");
        this$0.pushUndo();
        this$0.currentPatch = GuiHudPatch.copy$default(this$0.currentPatch, values[which], null, null, 6, null);
        GuiHudPreviewView guiHudPreviewView = this$0.previewView;
        if (guiHudPreviewView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewView");
            guiHudPreviewView = null;
        }
        guiHudPreviewView.setPatch(this$0.currentPatch);
        this$0.lastSavedPreset = null;
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRadarBarsDialog() {
        String[] names = {"Дуги", "Прямые полоски"};
        final RadarBarsShape[] values = {RadarBarsShape.CURVED, RadarBarsShape.STRAIGHT};
        int selected = RangesKt___RangesKt.coerceAtLeast(ArraysKt___ArraysKt.indexOf(values, this.currentPatch.getRadarBarsShape()), 0);
        new AlertDialog.Builder(this).setTitle("HP / Armor").setSingleChoiceItems(names, selected, new DialogInterface.OnClickListener() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                GuiEditorActivity.showRadarBarsDialog$lambda$24(this.f$0, values, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRadarBarsDialog$lambda$24(GuiEditorActivity this$0, RadarBarsShape[] values, DialogInterface dialog, int which) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(values, "$values");
        this$0.pushUndo();
        this$0.currentPatch = GuiHudPatch.copy$default(this$0.currentPatch, null, values[which], null, 5, null);
        GuiHudPreviewView guiHudPreviewView = this$0.previewView;
        if (guiHudPreviewView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewView");
            guiHudPreviewView = null;
        }
        guiHudPreviewView.setPatch(this$0.currentPatch);
        this$0.lastSavedPreset = null;
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showWeaponShapeDialog() {
        Object element$iv;
        GuiHudElementPatch it;
        Iterable $this$firstOrNull$iv = this.currentPatch.getElements();
        Iterator it2 = $this$firstOrNull$iv.iterator();
        do {
            if (!it2.hasNext()) {
                element$iv = null;
                break;
            } else {
                element$iv = it2.next();
                it = (GuiHudElementPatch) element$iv;
            }
        } while (!Intrinsics.areEqual(it.getId(), GuiHudElementIds.WEAPON));
        GuiHudElementPatch selected = (GuiHudElementPatch) element$iv;
        if (selected == null) {
            return;
        }
        String[] names = {"Круглая", "Квадратная", "Скругленная"};
        final String[] values = {"round", "square", "rounded"};
        int current = RangesKt___RangesKt.coerceAtLeast(ArraysKt___ArraysKt.indexOf(values, selected.getColorOverrides().get("shape")), 0);
        new AlertDialog.Builder(this).setTitle("Форма Weapon").setSingleChoiceItems(names, current, new DialogInterface.OnClickListener() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                GuiEditorActivity.showWeaponShapeDialog$lambda$26(this.f$0, values, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWeaponShapeDialog$lambda$26(GuiEditorActivity this$0, final String[] values, DialogInterface dialog, final int which) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(values, "$values");
        this$0.pushUndo();
        GuiHudPreviewView guiHudPreviewView = this$0.previewView;
        if (guiHudPreviewView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewView");
            guiHudPreviewView = null;
        }
        guiHudPreviewView.setSelectedId(GuiHudElementIds.WEAPON);
        this$0.updateSelected(new Function1<GuiHudElementPatch, GuiHudElementPatch>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$showWeaponShapeDialog$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final GuiHudElementPatch invoke(GuiHudElementPatch element) {
                Intrinsics.checkNotNullParameter(element, "element");
                return element.copy((71 & 1) != 0 ? element.id : null, (71 & 2) != 0 ? element.x : 0.0f, (71 & 4) != 0 ? element.y : 0.0f, (71 & 8) != 0 ? element.width : 0.0f, (71 & 16) != 0 ? element.height : 0.0f, (71 & 32) != 0 ? element.scale : 0.0f, (71 & 64) != 0 ? element.visible : false, (71 & 128) != 0 ? element.colorOverrides : MapsKt__MapsKt.plus(element.getColorOverrides(), TuplesKt.m4423to("shape", values[which])));
            }
        });
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showColorDialog() {
        Object obj;
        Iterator<T> it = this.currentPatch.getElements().iterator();
        while (true) {
            obj = null;
            GuiHudPreviewView guiHudPreviewView = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String id = ((GuiHudElementPatch) next).getId();
            GuiHudPreviewView guiHudPreviewView2 = this.previewView;
            if (guiHudPreviewView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("previewView");
            } else {
                guiHudPreviewView = guiHudPreviewView2;
            }
            if (Intrinsics.areEqual(id, guiHudPreviewView.getSelectedId())) {
                obj = next;
                break;
            }
        }
        final GuiHudElementPatch guiHudElementPatch = (GuiHudElementPatch) obj;
        if (guiHudElementPatch == null) {
            return;
        }
        final List<String> listColorKeysFor = colorKeysFor(guiHudElementPatch);
        if (listColorKeysFor.isEmpty()) {
            toast("Для этого элемента пока нет безопасных XAML-цветов.");
            return;
        }
        List<String> list = listColorKeysFor;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(colorKeyLabel((String) it2.next()));
        }
        new AlertDialog.Builder(this).setTitle("Цвет: " + humanName(guiHudElementPatch.getId())).setItems((String[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                GuiEditorActivity.showColorDialog$lambda$29(this.f$0, guiHudElementPatch, listColorKeysFor, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showColorDialog$lambda$29(GuiEditorActivity this$0, GuiHudElementPatch element, List keys, DialogInterface dialogInterface, int which) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(element, "$element");
        Intrinsics.checkNotNullParameter(keys, "$keys");
        this$0.pickColor(element, (String) keys.get(which));
    }

    private final void pickColor(GuiHudElementPatch element, final String key) {
        int initial = parseAndroidColor(element.getColorOverrides().get(key), -1);
        new AmbilWarnaDialog(this, initial, true, new AmbilWarnaDialog.OnAmbilWarnaListener() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.pickColor.1
            @Override // yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
            public void onOk(AmbilWarnaDialog dialog, int color) {
                GuiEditorActivity.this.pushUndo();
                final String hex = String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(color)}, 1));
                Intrinsics.checkNotNullExpressionValue(hex, "format(...)");
                GuiEditorActivity guiEditorActivity = GuiEditorActivity.this;
                final String str = key;
                guiEditorActivity.updateSelected(new Function1<GuiHudElementPatch, GuiHudElementPatch>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$pickColor$1$onOk$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final GuiHudElementPatch invoke(GuiHudElementPatch selected) {
                        Intrinsics.checkNotNullParameter(selected, "selected");
                        return selected.copy((71 & 1) != 0 ? selected.id : null, (71 & 2) != 0 ? selected.x : 0.0f, (71 & 4) != 0 ? selected.y : 0.0f, (71 & 8) != 0 ? selected.width : 0.0f, (71 & 16) != 0 ? selected.height : 0.0f, (71 & 32) != 0 ? selected.scale : 0.0f, (71 & 64) != 0 ? selected.visible : false, (71 & 128) != 0 ? selected.colorOverrides : MapsKt__MapsKt.plus(selected.getColorOverrides(), TuplesKt.m4423to(str, hex)));
                    }
                });
            }

            @Override // yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
            public void onCancel(AmbilWarnaDialog dialog) {
            }
        }).show();
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$showTextureListDialog$1 */
    /* JADX INFO: compiled from: GuiEditorActivity.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$showTextureListDialog$1", m4426f = "GuiEditorActivity.kt", m4427i = {}, m4428l = {NetworkResponseCodes.AUTH_TOKEN_NOT_PROVIDED}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C56361(Continuation<? super C56361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GuiEditorActivity.this.new C56361(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object $result;
            C56361 c56361;
            Object $result2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = 1;
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    $result = obj;
                    this.label = 1;
                    Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new GuiEditorActivity$showTextureListDialog$1$result$1(GuiEditorActivity.this, null), this);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c56361 = this;
                    $result2 = objWithContext;
                    break;
                    break;
                case 1:
                    c56361 = this;
                    $result2 = obj;
                    ResultKt.throwOnFailure($result2);
                    $result = $result2;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object result = ((Result) $result2).getValue();
            int i2 = 0;
            GuiEditorActivity.this.setBusy(false);
            GuiEditorActivity guiEditorActivity = GuiEditorActivity.this;
            Throwable it = Result.m15554exceptionOrNullimpl(result);
            if (it != null) {
                guiEditorActivity.showError("Не удалось прочитать gui_textures.astc.bpc", it);
                return Unit.INSTANCE;
            }
            List entries = (List) result;
            if (entries.isEmpty()) {
                GuiEditorActivity.this.toast("HUD .btx в Hud/Images не найдены.");
                return Unit.INSTANCE;
            }
            LinearLayout list = new LinearLayout(GuiEditorActivity.this);
            GuiEditorActivity guiEditorActivity2 = GuiEditorActivity.this;
            list.setOrientation(1);
            int i3 = 8;
            list.setPadding(guiEditorActivity2.m1431dp(12), guiEditorActivity2.m1431dp(8), guiEditorActivity2.m1431dp(12), guiEditorActivity2.m1431dp(8));
            List $this$forEach$iv = entries;
            final GuiEditorActivity guiEditorActivity3 = GuiEditorActivity.this;
            List entries2 = null;
            for (Object element$iv : $this$forEach$iv) {
                final GuiTextureEntry entry = (GuiTextureEntry) element$iv;
                GuiEditorActivity guiEditorActivity4 = guiEditorActivity3;
                LinearLayout $this$invokeSuspend_u24lambda_u246_u24lambda_u243 = new LinearLayout(guiEditorActivity4);
                $this$invokeSuspend_u24lambda_u246_u24lambda_u243.setOrientation(i);
                $this$invokeSuspend_u24lambda_u246_u24lambda_u243.setPadding(i2, guiEditorActivity3.m1431dp(i3), i2, guiEditorActivity3.m1431dp(i3));
                $this$invokeSuspend_u24lambda_u246_u24lambda_u243.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$showTextureListDialog$1$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        GuiEditorActivity.access$showTextureActions(guiEditorActivity3, entry);
                    }
                });
                TextView $this$invokeSuspend_u24lambda_u246_u24lambda_u244 = new TextView(guiEditorActivity4);
                $this$invokeSuspend_u24lambda_u246_u24lambda_u244.setText(entry.getArchivePath());
                List list2 = entries2;
                $this$invokeSuspend_u24lambda_u246_u24lambda_u244.setTextColor(Color.rgb(25, 31, 43));
                $this$invokeSuspend_u24lambda_u246_u24lambda_u244.setTextSize(14.0f);
                $this$invokeSuspend_u24lambda_u246_u24lambda_u243.addView($this$invokeSuspend_u24lambda_u246_u24lambda_u244);
                TextView $this$invokeSuspend_u24lambda_u246_u24lambda_u245 = new TextView(guiEditorActivity4);
                $this$invokeSuspend_u24lambda_u246_u24lambda_u245.setText((entry.getSizeBytes() / ((long) 1024)) + " KB");
                $this$invokeSuspend_u24lambda_u246_u24lambda_u245.setTextColor(Color.rgb(90, 100, 118));
                $this$invokeSuspend_u24lambda_u246_u24lambda_u245.setTextSize(12.0f);
                $this$invokeSuspend_u24lambda_u246_u24lambda_u243.addView($this$invokeSuspend_u24lambda_u246_u24lambda_u245);
                list.addView($this$invokeSuspend_u24lambda_u246_u24lambda_u243);
                entries2 = list2;
                $result = $result;
                i = 1;
                i2 = 0;
                i3 = 8;
            }
            AlertDialog.Builder title = new AlertDialog.Builder(GuiEditorActivity.this).setTitle("HUD текстуры");
            ScrollView $this$invokeSuspend_u24lambda_u247 = new ScrollView(GuiEditorActivity.this);
            $this$invokeSuspend_u24lambda_u247.addView(list);
            title.setView($this$invokeSuspend_u24lambda_u247).setNegativeButton("Закрыть", (DialogInterface.OnClickListener) null).show();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTextureListDialog() {
        setBusy(true);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C56361(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTextureActions(final GuiTextureEntry entry) {
        String[] actions = {"Превью", "Перекрасить", "Импорт PNG/BTX"};
        new AlertDialog.Builder(this).setTitle(entry.getDisplayName()).setItems(actions, new DialogInterface.OnClickListener() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                GuiEditorActivity.showTextureActions$lambda$30(this.f$0, entry, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTextureActions$lambda$30(GuiEditorActivity this$0, GuiTextureEntry entry, DialogInterface dialogInterface, int which) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(entry, "$entry");
        switch (which) {
            case 0:
                this$0.showTexturePreview(entry);
                break;
            case 1:
                this$0.recolorTexture(entry);
                break;
            case 2:
                this$0.pendingTextureEntry = entry;
                this$0.importTextureLauncher.launch(new String[]{MimeTypes.IMAGE_PNG, "application/octet-stream", "*/*"});
                break;
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$showTexturePreview$1 */
    /* JADX INFO: compiled from: GuiEditorActivity.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$showTexturePreview$1", m4426f = "GuiEditorActivity.kt", m4427i = {}, m4428l = {TypedValues.PositionType.TYPE_TRANSITION_EASING}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GuiTextureEntry $entry;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C56381(GuiTextureEntry guiTextureEntry, Continuation<? super C56381> continuation) {
            super(2, continuation);
            this.$entry = guiTextureEntry;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GuiEditorActivity.this.new C56381(this.$entry, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C56381 c56381;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c56381 = this;
                    c56381.label = 1;
                    Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new GuiEditorActivity$showTexturePreview$1$result$1(GuiEditorActivity.this, c56381.$entry, null), c56381);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objWithContext;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c56381 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object result = ((Result) $result).getValue();
            GuiEditorActivity.this.setBusy(false);
            GuiEditorActivity guiEditorActivity = GuiEditorActivity.this;
            Throwable thM15554exceptionOrNullimpl = Result.m15554exceptionOrNullimpl(result);
            if (thM15554exceptionOrNullimpl != null) {
                guiEditorActivity.showError("Не удалось сделать PNG превью", thM15554exceptionOrNullimpl);
                return Unit.INSTANCE;
            }
            File file = (File) result;
            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
            if (bitmap == null) {
                GuiEditorActivity.this.toast("PNG превью не открылось.");
                return Unit.INSTANCE;
            }
            ImageView $this$invokeSuspend_u24lambda_u241 = new ImageView(GuiEditorActivity.this);
            GuiEditorActivity guiEditorActivity2 = GuiEditorActivity.this;
            $this$invokeSuspend_u24lambda_u241.setImageBitmap(bitmap);
            $this$invokeSuspend_u24lambda_u241.setAdjustViewBounds(true);
            $this$invokeSuspend_u24lambda_u241.setPadding(guiEditorActivity2.m1431dp(12), guiEditorActivity2.m1431dp(12), guiEditorActivity2.m1431dp(12), guiEditorActivity2.m1431dp(12));
            new AlertDialog.Builder(GuiEditorActivity.this).setTitle(c56381.$entry.getArchivePath()).setView($this$invokeSuspend_u24lambda_u241).setPositiveButton("OK", (DialogInterface.OnClickListener) null).show();
            return Unit.INSTANCE;
        }
    }

    private final void showTexturePreview(GuiTextureEntry entry) {
        setBusy(true);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C56381(entry, null), 3, null);
    }

    private final void recolorTexture(final GuiTextureEntry entry) {
        new AmbilWarnaDialog(this, -1, true, new AmbilWarnaDialog.OnAmbilWarnaListener() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.recolorTexture.1
            @Override // yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
            public void onOk(AmbilWarnaDialog dialog, int color) {
                LinkedHashMap linkedHashMap = GuiEditorActivity.this.texturePatches;
                String archivePath = entry.getArchivePath();
                String archivePath2 = entry.getArchivePath();
                GuiTexturePatchMode guiTexturePatchMode = GuiTexturePatchMode.RECOLOR;
                String str = String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(color)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                linkedHashMap.put(archivePath, new GuiTexturePatch(archivePath2, guiTexturePatchMode, str, (String) null, (String) null, 24, (DefaultConstructorMarker) null));
                GuiEditorActivity.this.removePayloadsForEntry(entry.getArchivePath());
                GuiEditorActivity.this.lastSavedPreset = null;
                GuiEditorActivity.this.toast("Перекраска добавлена в пресет.");
            }

            @Override // yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
            public void onCancel(AmbilWarnaDialog dialog) {
            }
        }).show();
    }

    private final void importTextureFromUri(Uri uri) {
        GuiTextureEntry entry = this.pendingTextureEntry;
        if (entry == null) {
            return;
        }
        String strDisplayName = displayName(uri);
        if (StringsKt__StringsKt.isBlank(strDisplayName)) {
            strDisplayName = "texture.png";
        }
        String sourceName = strDisplayName;
        GuiTexturePatchMode mode = StringsKt__StringsJVMKt.endsWith(sourceName, ".btx", true) ? GuiTexturePatchMode.BTX_IMPORT : GuiTexturePatchMode.PNG_IMPORT;
        String extension = mode == GuiTexturePatchMode.BTX_IMPORT ? "btx" : "png";
        String payloadName = payloadNameFor(entry.getArchivePath(), extension);
        setBusy(true);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C56301(entry, payloadName, mode, sourceName, uri, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$importTextureFromUri$1 */
    /* JADX INFO: compiled from: GuiEditorActivity.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$importTextureFromUri$1", m4426f = "GuiEditorActivity.kt", m4427i = {}, m4428l = {LauncherConstants.ADDITIONAL_FREE_SPACE}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GuiTextureEntry $entry;
        final /* synthetic */ GuiTexturePatchMode $mode;
        final /* synthetic */ String $payloadName;
        final /* synthetic */ String $sourceName;
        final /* synthetic */ Uri $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C56301(GuiTextureEntry guiTextureEntry, String str, GuiTexturePatchMode guiTexturePatchMode, String str2, Uri uri, Continuation<? super C56301> continuation) {
            super(2, continuation);
            this.$entry = guiTextureEntry;
            this.$payloadName = str;
            this.$mode = guiTexturePatchMode;
            this.$sourceName = str2;
            this.$uri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GuiEditorActivity.this.new C56301(this.$entry, this.$payloadName, this.$mode, this.$sourceName, this.$uri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C56301 c56301;
            Object $result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new GuiEditorActivity$importTextureFromUri$1$result$1(GuiEditorActivity.this, this.$uri, this.$sourceName, null), this);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c56301 = this;
                    $result = objWithContext;
                    break;
                    break;
                case 1:
                    c56301 = this;
                    $result = obj;
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object result = ((Result) $result).getValue();
            GuiEditorActivity.this.setBusy(false);
            GuiEditorActivity guiEditorActivity = GuiEditorActivity.this;
            Throwable it = Result.m15554exceptionOrNullimpl(result);
            if (it == null) {
                byte[] bytes = (byte[]) result;
                GuiEditorActivity.this.removePayloadsForEntry(c56301.$entry.getArchivePath());
                GuiEditorActivity.this.payloads.put(c56301.$payloadName, bytes);
                GuiEditorActivity.this.texturePatches.put(c56301.$entry.getArchivePath(), new GuiTexturePatch(c56301.$entry.getArchivePath(), c56301.$mode, (String) null, c56301.$payloadName, c56301.$sourceName, 4, (DefaultConstructorMarker) null));
                GuiEditorActivity.this.updatePreviewTexture(c56301.$entry.getArchivePath(), c56301.$sourceName, bytes);
                GuiEditorActivity.this.lastSavedPreset = null;
                GuiEditorActivity.this.toast("Текстура добавлена в пресет: " + c56301.$entry.getDisplayName());
                return Unit.INSTANCE;
            }
            guiEditorActivity.showError("Не удалось импортировать текстуру", it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$updatePreviewTexture$1 */
    /* JADX INFO: compiled from: GuiEditorActivity.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$updatePreviewTexture$1", m4426f = "GuiEditorActivity.kt", m4427i = {}, m4428l = {580}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $bytes;
        final /* synthetic */ String $path;
        final /* synthetic */ String $sourceName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C56391(String str, String str2, byte[] bArr, Continuation<? super C56391> continuation) {
            super(2, continuation);
            this.$path = str;
            this.$sourceName = str2;
            this.$bytes = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GuiEditorActivity.this.new C56391(this.$path, this.$sourceName, this.$bytes, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C56391 c56391;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            GuiHudPreviewView guiHudPreviewView = null;
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c56391 = this;
                    c56391.label = 1;
                    Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new GuiEditorActivity$updatePreviewTexture$1$result$1(c56391.$sourceName, c56391.$bytes, null), c56391);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objWithContext;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c56391 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object result = ((Result) $result).getValue();
            if (Result.m15557isFailureimpl(result)) {
                result = null;
            }
            Bitmap bitmap = (Bitmap) result;
            if (bitmap == null) {
                return Unit.INSTANCE;
            }
            GuiHudPreviewView guiHudPreviewView2 = GuiEditorActivity.this.previewView;
            if (guiHudPreviewView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("previewView");
                guiHudPreviewView2 = null;
            }
            LinkedHashMap updated = new LinkedHashMap(guiHudPreviewView2.getTextureBitmaps());
            updated.put(c56391.$path, bitmap);
            GuiHudPreviewView guiHudPreviewView3 = GuiEditorActivity.this.previewView;
            if (guiHudPreviewView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("previewView");
            } else {
                guiHudPreviewView = guiHudPreviewView3;
            }
            guiHudPreviewView.setTextureBitmaps(updated);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePreviewTexture(String path, String sourceName, byte[] bytes) {
        if (previewTexturePaths.contains(path)) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C56391(path, sourceName, bytes, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSavePresetDialog() {
        String name;
        GuiEditorPreset preset;
        final EditText $this$showSavePresetDialog_u24lambda_u2432 = new EditText(this);
        $this$showSavePresetDialog_u24lambda_u2432.setHint("Название пресета");
        GuiPresetHandle guiPresetHandle = this.sourcePreset;
        if (guiPresetHandle == null || (preset = guiPresetHandle.getPreset()) == null || (name = preset.getName()) == null) {
            name = "GUI " + timestampForName();
        }
        $this$showSavePresetDialog_u24lambda_u2432.setText(name);
        $this$showSavePresetDialog_u24lambda_u2432.selectAll();
        new AlertDialog.Builder(this).setTitle("Сохранить GUI пресет").setView($this$showSavePresetDialog_u24lambda_u2432).setPositiveButton("Сохранить", new DialogInterface.OnClickListener() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                GuiEditorActivity.showSavePresetDialog$lambda$34($this$showSavePresetDialog_u24lambda_u2432, this, dialogInterface, i);
            }
        }).setNegativeButton("Отмена", (DialogInterface.OnClickListener) null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSavePresetDialog$lambda$34(EditText input, GuiEditorActivity this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(input, "$input");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = StringsKt__StringsKt.trim((CharSequence) input.getText().toString()).toString();
        if (StringsKt__StringsKt.isBlank(string)) {
            string = "GUI " + this$0.timestampForName();
        }
        String name = string;
        savePreset$default(this$0, name, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void savePreset$default(GuiEditorActivity guiEditorActivity, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        guiEditorActivity.savePreset(str, function1);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$savePreset$1 */
    /* JADX INFO: compiled from: GuiEditorActivity.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$savePreset$1", m4426f = "GuiEditorActivity.kt", m4427i = {}, m4428l = {625}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $name;
        final /* synthetic */ Function1<GuiPresetHandle, Unit> $onSaved;
        int label;
        final /* synthetic */ GuiEditorActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C56351(String str, GuiEditorActivity guiEditorActivity, Function1<? super GuiPresetHandle, Unit> function1, Continuation<? super C56351> continuation) {
            super(2, continuation);
            this.$name = str;
            this.this$0 = guiEditorActivity;
            this.$onSaved = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C56351(this.$name, this.this$0, this.$onSaved, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C56351 c56351;
            Object $result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    String str = this.$name;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    GuiBpcRepository guiBpcRepository = this.this$0.bpcRepository;
                    if (guiBpcRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("bpcRepository");
                        guiBpcRepository = null;
                    }
                    String strSha256OrEmpty = guiBpcRepository.sha256OrEmpty();
                    GuiTextureRepository guiTextureRepository = this.this$0.textureRepository;
                    if (guiTextureRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("textureRepository");
                        guiTextureRepository = null;
                    }
                    String strSha256OrEmpty2 = guiTextureRepository.sha256OrEmpty();
                    GuiHudPatch guiHudPatch = this.this$0.currentPatch;
                    Collection collectionValues = this.this$0.texturePatches.values();
                    Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                    GuiEditorPreset preset = new GuiEditorPreset(0, str, jCurrentTimeMillis, strSha256OrEmpty, strSha256OrEmpty2, guiHudPatch, CollectionsKt___CollectionsKt.toList(collectionValues), 1, (DefaultConstructorMarker) null);
                    this.label = 1;
                    Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new GuiEditorActivity$savePreset$1$result$1(this.this$0, preset, null), this);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c56351 = this;
                    $result = objWithContext;
                    break;
                    break;
                case 1:
                    c56351 = this;
                    $result = obj;
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object result = ((Result) $result).getValue();
            c56351.this$0.setBusy(false);
            GuiEditorActivity guiEditorActivity = c56351.this$0;
            Throwable it = Result.m15554exceptionOrNullimpl(result);
            if (it == null) {
                GuiPresetHandle handle = (GuiPresetHandle) result;
                c56351.this$0.sourcePreset = handle;
                c56351.this$0.lastSavedPreset = handle;
                c56351.this$0.refreshPresetList();
                c56351.this$0.toast("GUI пресет сохранен.");
                Function1<GuiPresetHandle, Unit> function1 = c56351.$onSaved;
                if (function1 != null) {
                    function1.invoke(handle);
                }
                return Unit.INSTANCE;
            }
            guiEditorActivity.showError("Не удалось сохранить пресет", it);
            return Unit.INSTANCE;
        }
    }

    private final void savePreset(String name, Function1<? super GuiPresetHandle, Unit> onSaved) {
        setBusy(true);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C56351(name, this, onSaved, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyCurrentPreset() {
        GuiPresetHandle handle = this.lastSavedPreset;
        if (handle == null) {
            handle = this.sourcePreset;
        }
        if (handle != null && !hasUnsavedPresetChanges(handle)) {
            applyPreset(handle);
        } else {
            savePreset("Applied " + timestampForName(), new Function1<GuiPresetHandle, Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.applyCurrentPreset.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GuiPresetHandle guiPresetHandle) {
                    invoke2(guiPresetHandle);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(GuiPresetHandle saved) {
                    Intrinsics.checkNotNullParameter(saved, "saved");
                    GuiEditorActivity.this.applyPreset(saved);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$applyPreset$1 */
    /* JADX INFO: compiled from: GuiEditorActivity.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$applyPreset$1", m4426f = "GuiEditorActivity.kt", m4427i = {}, m4428l = {653}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GuiPresetHandle $handle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C56141(GuiPresetHandle guiPresetHandle, Continuation<? super C56141> continuation) {
            super(2, continuation);
            this.$handle = guiPresetHandle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GuiEditorActivity.this.new C56141(this.$handle, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C56141 c56141;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c56141 = this;
                    c56141.label = 1;
                    Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new GuiEditorActivity$applyPreset$1$result$1(GuiEditorActivity.this, c56141.$handle, null), c56141);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objWithContext;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c56141 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object result = ((Result) $result).getValue();
            GuiEditorActivity.this.setBusy(false);
            GuiEditorActivity guiEditorActivity = GuiEditorActivity.this;
            if (Result.m15558isSuccessimpl(result)) {
                GuiPresetApplier.Result it = (GuiPresetApplier.Result) result;
                guiEditorActivity.toast("Применено. Backup: " + it.getBackupDir().getName() + ", textures: " + it.getTextureCount());
            }
            GuiEditorActivity guiEditorActivity2 = GuiEditorActivity.this;
            Throwable it2 = Result.m15554exceptionOrNullimpl(result);
            if (it2 != null) {
                guiEditorActivity2.showError("Не удалось применить пресет. Backup восстановлен.", it2);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPreset(GuiPresetHandle handle) {
        setBusy(true);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C56141(handle, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void exportCurrentPreset() {
        GuiPresetHandle handle = this.lastSavedPreset;
        if (handle == null) {
            handle = this.sourcePreset;
        }
        if (handle == null || hasUnsavedPresetChanges(handle)) {
            savePreset("Export " + timestampForName(), new Function1<GuiPresetHandle, Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.exportCurrentPreset.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GuiPresetHandle guiPresetHandle) {
                    invoke2(guiPresetHandle);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(GuiPresetHandle it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    GuiEditorActivity.this.exportPreset(it);
                }
            });
        } else {
            exportPreset(handle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void exportPreset(GuiPresetHandle handle) {
        File exportDir = new File(getExternalFilesDir("NEIZZIR"), "GUI_EXPORTS");
        File output = new File(exportDir, safeFileName(handle.getPreset().getName()) + LauncherConstants.UNDERSCORE_CHAR + handle.getPreset().getCreatedAt() + ".zip");
        setBusy(true);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C56281(handle, output, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$exportPreset$1 */
    /* JADX INFO: compiled from: GuiEditorActivity.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$exportPreset$1", m4426f = "GuiEditorActivity.kt", m4427i = {}, m4428l = {677}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GuiPresetHandle $handle;
        final /* synthetic */ File $output;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C56281(GuiPresetHandle guiPresetHandle, File file, Continuation<? super C56281> continuation) {
            super(2, continuation);
            this.$handle = guiPresetHandle;
            this.$output = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GuiEditorActivity.this.new C56281(this.$handle, this.$output, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C56281 c56281;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c56281 = this;
                    c56281.label = 1;
                    Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new GuiEditorActivity$exportPreset$1$result$1(GuiEditorActivity.this, c56281.$handle, c56281.$output, null), c56281);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objWithContext;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c56281 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object result = ((Result) $result).getValue();
            GuiEditorActivity.this.setBusy(false);
            GuiEditorActivity guiEditorActivity = GuiEditorActivity.this;
            if (Result.m15558isSuccessimpl(result)) {
                guiEditorActivity.toast("ZIP экспортирован: " + ((File) result).getAbsolutePath());
            }
            GuiEditorActivity guiEditorActivity2 = GuiEditorActivity.this;
            Throwable it = Result.m15554exceptionOrNullimpl(result);
            if (it != null) {
                guiEditorActivity2.showError("Не удалось экспортировать ZIP", it);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$importPresetFromUri$1 */
    /* JADX INFO: compiled from: GuiEditorActivity.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$importPresetFromUri$1", m4426f = "GuiEditorActivity.kt", m4427i = {}, m4428l = {690}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Uri $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C56291(Uri uri, Continuation<? super C56291> continuation) {
            super(2, continuation);
            this.$uri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GuiEditorActivity.this.new C56291(this.$uri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C56291 c56291;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c56291 = this;
                    c56291.label = 1;
                    Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new GuiEditorActivity$importPresetFromUri$1$result$1(GuiEditorActivity.this, c56291.$uri, null), c56291);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objWithContext;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c56291 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object result = ((Result) $result).getValue();
            GuiEditorActivity.this.setBusy(false);
            GuiEditorActivity guiEditorActivity = GuiEditorActivity.this;
            Throwable it = Result.m15554exceptionOrNullimpl(result);
            if (it == null) {
                GuiPresetHandle handle = (GuiPresetHandle) result;
                GuiEditorActivity.this.loadPreset(handle);
                GuiEditorActivity.this.toast("GUI пресет импортирован.");
                return Unit.INSTANCE;
            }
            guiEditorActivity.showError("Не удалось импортировать GUI пресет", it);
            return Unit.INSTANCE;
        }
    }

    private final void importPresetFromUri(Uri uri) {
        setBusy(true);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C56291(uri, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadPreset(GuiPresetHandle handle) {
        this.sourcePreset = handle;
        this.lastSavedPreset = handle;
        this.currentPatch = GuiHudDefaults.INSTANCE.normalize(handle.getPreset().getHudPatch());
        this.texturePatches.clear();
        LinkedHashMap<String, GuiTexturePatch> linkedHashMap = this.texturePatches;
        Iterable $this$associateBy$iv = handle.getPreset().getTexturePatches();
        int capacity$iv = RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$associateBy$iv, 10)), 16);
        Map destination$iv$iv = new LinkedHashMap(capacity$iv);
        for (Object element$iv$iv : $this$associateBy$iv) {
            GuiTexturePatch it = (GuiTexturePatch) element$iv$iv;
            destination$iv$iv.put(it.getArchivePath(), element$iv$iv);
        }
        linkedHashMap.putAll(destination$iv$iv);
        this.payloads.clear();
        GuiHudPreviewView guiHudPreviewView = this.previewView;
        if (guiHudPreviewView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewView");
            guiHudPreviewView = null;
        }
        guiHudPreviewView.setPatch(this.currentPatch);
        updateSelectionPanel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void undo() {
        GuiHudPatch previous = this.undoStack.removeLastOrNull();
        if (previous == null) {
            return;
        }
        this.redoStack.addLast(this.currentPatch);
        this.currentPatch = previous;
        GuiHudPreviewView guiHudPreviewView = this.previewView;
        if (guiHudPreviewView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewView");
            guiHudPreviewView = null;
        }
        guiHudPreviewView.setPatch(this.currentPatch);
        this.lastSavedPreset = null;
        updateSelectionPanel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void redo() {
        GuiHudPatch next = this.redoStack.removeLastOrNull();
        if (next == null) {
            return;
        }
        this.undoStack.addLast(this.currentPatch);
        this.currentPatch = next;
        GuiHudPreviewView guiHudPreviewView = this.previewView;
        if (guiHudPreviewView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewView");
            guiHudPreviewView = null;
        }
        guiHudPreviewView.setPatch(this.currentPatch);
        this.lastSavedPreset = null;
        updateSelectionPanel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetPatch() {
        pushUndo();
        this.currentPatch = new GuiHudPatch((RadarShape) null, (RadarBarsShape) null, (List) null, 7, (DefaultConstructorMarker) null);
        this.texturePatches.clear();
        this.payloads.clear();
        GuiHudPreviewView guiHudPreviewView = null;
        this.sourcePreset = null;
        this.lastSavedPreset = null;
        GuiHudPreviewView guiHudPreviewView2 = this.previewView;
        if (guiHudPreviewView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewView");
        } else {
            guiHudPreviewView = guiHudPreviewView2;
        }
        guiHudPreviewView.setPatch(this.currentPatch);
        updateSelectionPanel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pushUndo() {
        if (!Intrinsics.areEqual(this.undoStack.lastOrNull(), this.currentPatch)) {
            this.undoStack.addLast(this.currentPatch);
            while (this.undoStack.size() > 60) {
                this.undoStack.removeFirst();
            }
        }
        this.redoStack.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelected(Function1<? super GuiHudElementPatch, GuiHudElementPatch> transform) {
        GuiHudPreviewView guiHudPreviewView = this.previewView;
        if (guiHudPreviewView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewView");
            guiHudPreviewView = null;
        }
        guiHudPreviewView.updateSelected(transform);
        GuiHudPreviewView guiHudPreviewView2 = this.previewView;
        if (guiHudPreviewView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewView");
            guiHudPreviewView2 = null;
        }
        this.currentPatch = guiHudPreviewView2.getPatch();
        this.lastSavedPreset = null;
        updateSelectionPanel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBusy(boolean busy) {
        ProgressBar progressBar = this.progress;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            progressBar = null;
        }
        progressBar.setVisibility(busy ? 0 : 8);
    }

    private final Button toolbarButton(String text, final Function0<Unit> onClick) {
        Button $this$toolbarButton_u24lambda_u2438 = new Button(this);
        $this$toolbarButton_u24lambda_u2438.setText(text);
        $this$toolbarButton_u24lambda_u2438.setTextSize(12.0f);
        $this$toolbarButton_u24lambda_u2438.setAllCaps(false);
        $this$toolbarButton_u24lambda_u2438.setTextColor(-1);
        $this$toolbarButton_u24lambda_u2438.setBackgroundColor(Color.rgb(30, 38, 52));
        $this$toolbarButton_u24lambda_u2438.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuiEditorActivity.toolbarButton$lambda$38$lambda$36(onClick, view);
            }
        });
        LinearLayout.LayoutParams $this$toolbarButton_u24lambda_u2438_u24lambda_u2437 = new LinearLayout.LayoutParams(-2, m1431dp(42));
        $this$toolbarButton_u24lambda_u2438_u24lambda_u2437.setMarginEnd(m1431dp(8));
        $this$toolbarButton_u24lambda_u2438.setLayoutParams($this$toolbarButton_u24lambda_u2438_u24lambda_u2437);
        return $this$toolbarButton_u24lambda_u2438;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toolbarButton$lambda$38$lambda$36(Function0 onClick, View it) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        onClick.invoke();
    }

    private final Button smallButton(String text, final Function0<Unit> onClick) {
        Button $this$smallButton_u24lambda_u2441 = new Button(this);
        $this$smallButton_u24lambda_u2441.setText(text);
        $this$smallButton_u24lambda_u2441.setTextSize(16.0f);
        $this$smallButton_u24lambda_u2441.setAllCaps(false);
        $this$smallButton_u24lambda_u2441.setTextColor(-1);
        $this$smallButton_u24lambda_u2441.setBackgroundColor(Color.rgb(31, 40, 54));
        $this$smallButton_u24lambda_u2441.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuiEditorActivity.smallButton$lambda$41$lambda$39(onClick, view);
            }
        });
        LinearLayout.LayoutParams $this$smallButton_u24lambda_u2441_u24lambda_u2440 = new LinearLayout.LayoutParams(m1431dp(54), m1431dp(42));
        $this$smallButton_u24lambda_u2441_u24lambda_u2440.setMarginStart(m1431dp(6));
        $this$smallButton_u24lambda_u2441.setLayoutParams($this$smallButton_u24lambda_u2441_u24lambda_u2440);
        return $this$smallButton_u24lambda_u2441;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void smallButton$lambda$41$lambda$39(Function0 onClick, View it) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        onClick.invoke();
    }

    private final TextView label(String text, int sp, boolean bold) {
        TextView $this$label_u24lambda_u2442 = new TextView(this);
        $this$label_u24lambda_u2442.setText(text);
        $this$label_u24lambda_u2442.setTextSize(sp);
        $this$label_u24lambda_u2442.setTextColor(bold ? -1 : Color.rgb(180, 190, 205));
        if (bold) {
            $this$label_u24lambda_u2442.setTypeface(Typeface.DEFAULT_BOLD);
        }
        $this$label_u24lambda_u2442.setPadding(0, m1431dp(2), 0, m1431dp(2));
        return $this$label_u24lambda_u2442;
    }

    private final View space(int height) {
        View $this$space_u24lambda_u2443 = new View(this);
        $this$space_u24lambda_u2443.setLayoutParams(new LinearLayout.LayoutParams(1, m1431dp(height)));
        return $this$space_u24lambda_u2443;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r0.equals(com.blackhub.bronline.neizzir.gui.editor.GuiHudElementIds.ARMOR_ICON) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r0.equals(com.blackhub.bronline.neizzir.gui.editor.GuiHudElementIds.HP_ICON) == false) goto L36;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<java.lang.String> colorKeysFor(com.blackhub.bronline.neizzir.gui.editor.GuiHudElementPatch r11) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity.colorKeysFor(com.blackhub.bronline.neizzir.gui.editor.GuiHudElementPatch):java.util.List");
    }

    private final boolean hasUnsavedPresetChanges(GuiPresetHandle handle) {
        if (Intrinsics.areEqual(handle.getPreset().getHudPatch(), this.currentPatch)) {
            List<GuiTexturePatch> texturePatches = handle.getPreset().getTexturePatches();
            Collection<GuiTexturePatch> collectionValues = this.texturePatches.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            if (Intrinsics.areEqual(texturePatches, CollectionsKt___CollectionsKt.toList(collectionValues))) {
                return false;
            }
        }
        return true;
    }

    private final String colorKeyLabel(String key) {
        switch (key.hashCode()) {
            case -1383304148:
                return !key.equals("border") ? key : "Border";
            case -1332194002:
                return !key.equals("background") ? key : "Background";
            case -1001078227:
                return !key.equals("progress") ? key : "Progress";
            case 3336:
                return !key.equals("hp") ? key : "HP";
            case 3556653:
                return !key.equals("text") ? key : "Text";
            case 93086015:
                return !key.equals("armor") ? key : "Armor";
            case 104079552:
                return !key.equals("money") ? key : "Money";
            case 109641799:
                return !key.equals("speed") ? key : "Speed progress";
            default:
                return key;
        }
    }

    private final String weaponShapeLabel(String value) {
        if (Intrinsics.areEqual(value, "square")) {
            return "квадрат";
        }
        return Intrinsics.areEqual(value, "rounded") ? "скругл." : "круг";
    }

    private final String humanName(String id) {
        switch (id.hashCode()) {
            case -2127960639:
                return !id.equals(GuiHudElementIds.HP_ICON) ? id : "HP иконка";
            case -1707954628:
                return !id.equals(GuiHudElementIds.WEAPON) ? id : GuiHudElementIds.WEAPON;
            case -893989854:
                return !id.equals(GuiHudElementIds.CROSSHAIR) ? id : GuiHudElementIds.CROSSHAIR;
            case 2099064:
                return !id.equals(GuiHudElementIds.CHAT) ? id : "Чат";
            case 78717670:
                return !id.equals(GuiHudElementIds.RADAR) ? id : "Миникарта";
            case 199708030:
                return !id.equals(GuiHudElementIds.TOUCH_BUTTONS) ? id : "Touch buttons";
            case 396953549:
                return !id.equals(GuiHudElementIds.MONEY_VALUE) ? id : "Деньги";
            case 474024044:
                return !id.equals(GuiHudElementIds.ARMOR_BAR) ? id : "Armor полоска";
            case 805451977:
                return !id.equals(GuiHudElementIds.DAILY_CASE) ? id : "Daily case";
            case 830503480:
                return !id.equals(GuiHudElementIds.ARMOR_ICON) ? id : "Armor иконка";
            case 1286666050:
                return !id.equals(GuiHudElementIds.MONEY_DAILY) ? id : "Деньги и Daily";
            case 1523025781:
                return !id.equals(GuiHudElementIds.HP_BAR) ? id : "HP полоска";
            case 1656962810:
                return !id.equals(GuiHudElementIds.SPEEDOMETER) ? id : "Спидометр";
            default:
                return id;
        }
    }

    private final int parseAndroidColor(String value, int fallback) {
        Object objM15551constructorimpl;
        int color;
        String str = value;
        if (str == null || StringsKt__StringsKt.isBlank(str)) {
            return fallback;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            GuiEditorActivity guiEditorActivity = this;
            if (value.length() == 9 && StringsKt__StringsJVMKt.startsWith$default(value, "#", false, 2, null)) {
                StringBuilder sbAppend = new StringBuilder().append('#');
                String strSubstring = value.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                color = Color.parseColor(sbAppend.append(strSubstring).toString());
            } else {
                color = Color.parseColor(value);
            }
            objM15551constructorimpl = Result.m15551constructorimpl(Integer.valueOf(color));
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

    private final String displayName(Uri uri) {
        String string;
        String str = "";
        if (Intrinsics.areEqual(uri.getScheme(), "file")) {
            String path = uri.getPath();
            String name = new File(path != null ? path : "").getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }
        Cursor cursor = null;
        try {
            cursor = getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
            if (cursor != null && cursor.moveToFirst() && (string = cursor.getString(0)) != null) {
                str = string;
            }
            return str;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private final String payloadNameFor(String entryPath, String extension) {
        return "textures/" + safeFileName(entryPath) + '.' + extension;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePayloadsForEntry(String entryPath) {
        this.payloads.remove(payloadNameFor(entryPath, "png"));
        this.payloads.remove(payloadNameFor(entryPath, "btx"));
    }

    private final String safeFileName(String value) {
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = value.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strTrim = StringsKt__StringsKt.trim(new Regex("[^a-z0-9._-]+").replace(lowerCase, "_"), LauncherConstants.UNDERSCORE_CHAR);
        if (StringsKt__StringsKt.isBlank(strTrim)) {
            strTrim = "preset";
        }
        return strTrim;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String styleValue(float value) {
        if (value % 1.0f == 0.0f) {
            return String.valueOf((int) value);
        }
        String str = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(value)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return StringsKt.trimEnd(StringsKt.trimEnd(str, '0'), '.');
    }

    private final String timestampForName() {
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toast(String message) {
        Toast.makeText(this, message, 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    public final void showError(String prefix, Throwable throwable) {
        String it;
        Class<?> cls;
        String simpleName = null;
        if (throwable == null || (it = throwable.getMessage()) == null) {
            if (throwable != null && (cls = throwable.getClass()) != null) {
                simpleName = cls.getSimpleName();
            }
            if (simpleName == null) {
                it = "unknown";
            } else {
                it = simpleName;
            }
        } else {
            if (StringsKt__StringsKt.isBlank(it)) {
                it = null;
            }
            if (it == null) {
                if (throwable != null) {
                    simpleName = cls.getSimpleName();
                }
                if (simpleName == null) {
                    it = "unknown";
                } else {
                    it = simpleName;
                }
            }
        }
        String message = it;
        Toast.makeText(this, prefix + ": " + message, 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dp */
    public final int m1431dp(int value) {
        return (int) (value * getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: GuiEditorActivity.kt */
    @Metadata(m4415d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiEditorActivity$Companion;", "", "()V", "previewTexturePaths", "", "", "getPreviewTexturePaths", "()Ljava/util/List;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<String> getPreviewTexturePaths() {
            return GuiEditorActivity.previewTexturePaths;
        }
    }
}
