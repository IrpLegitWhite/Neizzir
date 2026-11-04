package com.blackhub.bronline.neizzir.fragments.custom.p023ui;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.core.constants.FileFormats;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import com.blackhub.bronline.game.gui.inventory.Constants;
import com.blackhub.bronline.neizzir.fragments.custom.adapters.BpcArchiveAdapter;
import com.blackhub.bronline.neizzir.fragments.custom.adapters.BpcTextureEntryAdapter;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcArchiveItem;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcArchiveRepository;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcExportFormat;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcExportPayload;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcPreviewRepository;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcTextureEntry;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter;
import com.blackhub.bronline.neizzir.fragments.custom.btx.PreviewState;
import com.blackhub.bronline.neizzir.fragments.custom.util.DialogUtils;
import com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.helpshift.HelpshiftEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.CloseableKt;
import kotlin.p040io.FilesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.p043io.files.FileSystemKt;
import net.lingala.zip4j.exception.ZipException;

/* JADX INFO: compiled from: BtxArchiveToolController.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0004\u008e\u0001\u008f\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\"H\u0002J\b\u0010I\u001a\u00020GH\u0002J\u0006\u0010J\u001a\u00020GJ\b\u0010K\u001a\u00020GH\u0002J(\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\"2\b\b\u0002\u0010O\u001a\u00020P2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020G0RH\u0002J\u0010\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020TH\u0002J\b\u0010V\u001a\u00020GH\u0002J\u0018\u0010W\u001a\u00020G2\u0006\u0010X\u001a\u0002092\u0006\u0010Y\u001a\u00020ZH\u0002J6\u0010[\u001a\u00020G2\u0006\u0010X\u001a\u0002092\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010Y\u001a\u00020Z2\u0006\u0010]\u001a\u00020\"2\u0006\u0010^\u001a\u00020PH\u0002J\u0018\u0010_\u001a\u00020G2\u0006\u0010X\u001a\u0002092\u0006\u0010Y\u001a\u00020ZH\u0002J\u0018\u0010`\u001a\u00020G2\u0006\u0010a\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020ZH\u0002J\u0012\u0010b\u001a\u0004\u0018\u00010\"2\u0006\u0010c\u001a\u00020dH\u0002J\u0012\u0010e\u001a\u00020G2\b\u0010c\u001a\u0004\u0018\u00010dH\u0002J\b\u0010f\u001a\u00020GH\u0002J\u0010\u0010g\u001a\u00020G2\u0006\u0010h\u001a\u00020@H\u0002J\b\u0010i\u001a\u00020GH\u0002J\b\u0010j\u001a\u00020GH\u0002J\b\u0010k\u001a\u00020GH\u0002J\u0018\u0010l\u001a\u00020P2\u0006\u0010m\u001a\u00020\"2\u0006\u0010h\u001a\u00020@H\u0002J\u0006\u0010n\u001a\u00020GJ\u0010\u0010o\u001a\u00020G2\u0006\u0010X\u001a\u000209H\u0002J0\u0010p\u001a\u00020G2\u0006\u0010X\u001a\u0002092\u0006\u0010q\u001a\u00020\"2\u0006\u0010r\u001a\u00020\"2\u0006\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020PH\u0002J(\u0010v\u001a\u00020G2\u0006\u0010X\u001a\u0002092\u0006\u0010a\u001a\u00020\u00072\u0006\u0010r\u001a\u00020\"2\u0006\u0010s\u001a\u00020tH\u0002J\u0010\u0010w\u001a\u00020G2\u0006\u0010a\u001a\u00020\u0007H\u0002JH\u0010x\u001a\u00020G2\u0006\u0010r\u001a\u00020\"26\u0010y\u001a2\u0012\u0013\u0012\u00110\"¢\u0006\f\b{\u0012\b\b|\u0012\u0004\b\b(q\u0012\u0013\u0012\u00110P¢\u0006\f\b{\u0012\b\b|\u0012\u0004\b\b(u\u0012\u0004\u0012\u00020G0zH\u0002J\u0010\u0010}\u001a\u0002092\u0006\u0010X\u001a\u000209H\u0002J\b\u0010~\u001a\u00020GH\u0002J\b\u0010\u007f\u001a\u00020GH\u0002J\u0011\u0010\u0080\u0001\u001a\u00020G2\u0006\u0010X\u001a\u000209H\u0002J\t\u0010\u0081\u0001\u001a\u00020GH\u0002J\u0011\u0010\u0082\u0001\u001a\u00020G2\u0006\u0010a\u001a\u00020\u0007H\u0002J\u0010\u0010\u0083\u0001\u001a\u00020G2\u0007\u0010\u0084\u0001\u001a\u00020.J\u0011\u0010\u0085\u0001\u001a\u00020G2\u0006\u0010X\u001a\u000209H\u0002J\t\u0010\u0086\u0001\u001a\u00020GH\u0002J\t\u0010\u0087\u0001\u001a\u00020GH\u0002J\u0011\u0010\u0088\u0001\u001a\u00020G2\u0006\u0010a\u001a\u00020\u0007H\u0002J\u0011\u0010\u0089\u0001\u001a\u00020G2\u0006\u0010a\u001a\u00020\u0007H\u0002J\u001c\u0010\u008a\u0001\u001a\u00020G2\u0007\u0010\u008b\u0001\u001a\u00020\"2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001a0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010A\u001a\u0004\u0018\u00010B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0010\u0010E\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0090\u0001"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/ui/BtxArchiveToolController;", "", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "allBpcEntries", "", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcTextureEntry;", "boldFont", "Landroid/graphics/Typeface;", "getBoldFont", "()Landroid/graphics/Typeface;", "boldFont$delegate", "Lkotlin/Lazy;", "bpcArchiveAdapter", "Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/BpcArchiveAdapter;", "bpcArchiveRepository", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcArchiveRepository;", "bpcImportChooser", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "bpcPreviewRepository", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcPreviewRepository;", "bpcTextureAdapter", "Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/BpcTextureEntryAdapter;", "btxArchiveScanJob", "Lkotlinx/coroutines/Job;", "btxChooser", "btxConverter", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter;", "btxFolderChooser", "btxOutputFolderChooser", "btxPreviewJobs", "Ljava/util/LinkedHashMap;", "", "btxPreviewLoading", "Ljava/util/LinkedHashSet;", "btxToolArchiveActions", "Landroid/widget/LinearLayout;", "btxToolBackButton", "Landroid/widget/ImageView;", "btxToolEmptyView", "Landroid/widget/TextView;", "btxToolHomeActions", "btxToolMetaView", "btxToolRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "btxToolSearchContainer", "Landroid/view/View;", "btxToolSearchInput", "Landroid/widget/EditText;", "btxToolTitleView", "ctx", "Landroid/content/Context;", "getCtx", "()Landroid/content/Context;", "currentBpcArchive", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcArchiveItem;", "hostRecyclerView", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "getLifecycleScope", "()Landroidx/lifecycle/LifecycleCoroutineScope;", "pendingArchiveImport", "Lcom/blackhub/bronline/neizzir/fragments/custom/ui/BtxArchiveToolController$PendingArchiveImport;", "rootView", "Landroid/view/ViewGroup;", "getRootView", "()Landroid/view/ViewGroup;", "toolView", "applyBtxEntryFilter", "", SearchIntents.EXTRA_QUERY, "cancelPreviewRequests", "clear", "clearBtxSelection", "createBtxActionChip", "Lcom/google/android/material/card/MaterialCardView;", "title", "accent", "", "action", "Lkotlin/Function0;", "dpToPx", "", CalendarKeys.DAYS_GAME_KEY, "ensureToolView", "exportAllFromArchive", "archive", "format", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcExportFormat;", "exportEntries", "entries", "dialogTitle", "clearSelectionOnSuccess", "exportSelectedEntries", "exportSingleEntry", "entry", "getUriDisplayName", "uri", "Landroid/net/Uri;", "handleBpcImportResult", "initDependencies", "launchArchiveImportPicker", "pending", "launchBtxFilePicker", "launchBtxInputFolderPicker", "launchBtxOutputFolderPicker", "matchesImportKind", HelpshiftEvent.DATA_FILE_NAME, "onPause", "openBtxArchive", "performArchiveAdd", "targetPath", "sourceName", "sourceBytes", "", "overwrite", "performArchiveReplace", "previewBtxEntry", "promptArchiveEntryName", "onConfirmed", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "refreshArchiveState", "refreshVisibleState", "registerLaunchers", "renderBtxArchiveActions", "renderBtxHomeActions", "requestBtxEntryPreview", "show", "contentRecyclerView", "showAddTextureDialog", "showBtxActionDialog", "showBtxArchiveList", "showBtxEntryExportDialog", "toggleBtxEntrySelection", "updateBtxEntryPreviewState", "entryPath", "previewState", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/PreviewState;", "ArchiveImportKind", "PendingArchiveImport", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class BtxArchiveToolController {
    private List<BpcTextureEntry> allBpcEntries;

    /* JADX INFO: renamed from: boldFont$delegate, reason: from kotlin metadata */
    private final Lazy boldFont;
    private BpcArchiveAdapter bpcArchiveAdapter;
    private BpcArchiveRepository bpcArchiveRepository;
    private ActivityResultLauncher<Intent> bpcImportChooser;
    private BpcPreviewRepository bpcPreviewRepository;
    private BpcTextureEntryAdapter bpcTextureAdapter;
    private Job btxArchiveScanJob;
    private ActivityResultLauncher<Intent> btxChooser;
    private BtxConverter btxConverter;
    private ActivityResultLauncher<Intent> btxFolderChooser;
    private ActivityResultLauncher<Intent> btxOutputFolderChooser;
    private final LinkedHashMap<String, Job> btxPreviewJobs;
    private final LinkedHashSet<String> btxPreviewLoading;
    private LinearLayout btxToolArchiveActions;
    private ImageView btxToolBackButton;
    private TextView btxToolEmptyView;
    private LinearLayout btxToolHomeActions;
    private TextView btxToolMetaView;
    private RecyclerView btxToolRecyclerView;
    private View btxToolSearchContainer;
    private EditText btxToolSearchInput;
    private TextView btxToolTitleView;
    private BpcArchiveItem currentBpcArchive;
    private final Fragment fragment;
    private RecyclerView hostRecyclerView;
    private PendingArchiveImport pendingArchiveImport;
    private View toolView;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: BtxArchiveToolController.kt */
    @Metadata(m4415d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/ui/BtxArchiveToolController$ArchiveImportKind;", "", "(Ljava/lang/String;I)V", "ANY", "PNG", "BTX", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    enum ArchiveImportKind {
        ANY,
        PNG,
        BTX;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        public static EnumEntries<ArchiveImportKind> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: BtxArchiveToolController.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ArchiveImportKind.values().length];
            try {
                iArr[ArchiveImportKind.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[ArchiveImportKind.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[ArchiveImportKind.BTX.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BtxArchiveToolController(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
        this.boldFont = LazyKt__LazyJVMKt.lazy(new Function0<Typeface>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$boldFont$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Typeface invoke() {
                return ResourcesCompat.getFont(this.this$0.getCtx(), C3715R.font.montserrat_extra_bold);
            }
        });
        this.allBpcEntries = CollectionsKt__CollectionsKt.emptyList();
        this.btxPreviewJobs = new LinkedHashMap<>();
        this.btxPreviewLoading = new LinkedHashSet<>();
        initDependencies();
        registerLaunchers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: BtxArchiveToolController.kt */
    @Metadata(m4415d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/ui/BtxArchiveToolController$PendingArchiveImport;", "", "()V", "Add", "Replace", "Lcom/blackhub/bronline/neizzir/fragments/custom/ui/BtxArchiveToolController$PendingArchiveImport$Add;", "Lcom/blackhub/bronline/neizzir/fragments/custom/ui/BtxArchiveToolController$PendingArchiveImport$Replace;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    static abstract class PendingArchiveImport {
        public /* synthetic */ PendingArchiveImport(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: compiled from: BtxArchiveToolController.kt */
        @Metadata(m4415d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/ui/BtxArchiveToolController$PendingArchiveImport$Replace;", "Lcom/blackhub/bronline/neizzir/fragments/custom/ui/BtxArchiveToolController$PendingArchiveImport;", "archive", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcArchiveItem;", "entry", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcTextureEntry;", "expectedKind", "Lcom/blackhub/bronline/neizzir/fragments/custom/ui/BtxArchiveToolController$ArchiveImportKind;", "(Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcArchiveItem;Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcTextureEntry;Lcom/blackhub/bronline/neizzir/fragments/custom/ui/BtxArchiveToolController$ArchiveImportKind;)V", "getArchive", "()Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcArchiveItem;", "getEntry", "()Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcTextureEntry;", "getExpectedKind", "()Lcom/blackhub/bronline/neizzir/fragments/custom/ui/BtxArchiveToolController$ArchiveImportKind;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
        public static final /* data */ class Replace extends PendingArchiveImport {
            private final BpcArchiveItem archive;
            private final BpcTextureEntry entry;
            private final ArchiveImportKind expectedKind;

            public static /* synthetic */ Replace copy$default(Replace replace, BpcArchiveItem bpcArchiveItem, BpcTextureEntry bpcTextureEntry, ArchiveImportKind archiveImportKind, int i, Object obj) {
                if ((i & 1) != 0) {
                    bpcArchiveItem = replace.archive;
                }
                if ((i & 2) != 0) {
                    bpcTextureEntry = replace.entry;
                }
                if ((i & 4) != 0) {
                    archiveImportKind = replace.expectedKind;
                }
                return replace.copy(bpcArchiveItem, bpcTextureEntry, archiveImportKind);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final BpcArchiveItem getArchive() {
                return this.archive;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final BpcTextureEntry getEntry() {
                return this.entry;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final ArchiveImportKind getExpectedKind() {
                return this.expectedKind;
            }

            public final Replace copy(BpcArchiveItem archive, BpcTextureEntry entry, ArchiveImportKind expectedKind) {
                Intrinsics.checkNotNullParameter(archive, "archive");
                Intrinsics.checkNotNullParameter(entry, "entry");
                Intrinsics.checkNotNullParameter(expectedKind, "expectedKind");
                return new Replace(archive, entry, expectedKind);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Replace)) {
                    return false;
                }
                Replace replace = (Replace) other;
                return Intrinsics.areEqual(this.archive, replace.archive) && Intrinsics.areEqual(this.entry, replace.entry) && this.expectedKind == replace.expectedKind;
            }

            public int hashCode() {
                return (((this.archive.hashCode() * 31) + this.entry.hashCode()) * 31) + this.expectedKind.hashCode();
            }

            public String toString() {
                return "Replace(archive=" + this.archive + ", entry=" + this.entry + ", expectedKind=" + this.expectedKind + ')';
            }

            public /* synthetic */ Replace(BpcArchiveItem bpcArchiveItem, BpcTextureEntry bpcTextureEntry, ArchiveImportKind archiveImportKind, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(bpcArchiveItem, bpcTextureEntry, (i & 4) != 0 ? ArchiveImportKind.ANY : archiveImportKind);
            }

            public final BpcArchiveItem getArchive() {
                return this.archive;
            }

            public final BpcTextureEntry getEntry() {
                return this.entry;
            }

            public final ArchiveImportKind getExpectedKind() {
                return this.expectedKind;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Replace(BpcArchiveItem archive, BpcTextureEntry entry, ArchiveImportKind expectedKind) {
                super(null);
                Intrinsics.checkNotNullParameter(archive, "archive");
                Intrinsics.checkNotNullParameter(entry, "entry");
                Intrinsics.checkNotNullParameter(expectedKind, "expectedKind");
                this.archive = archive;
                this.entry = entry;
                this.expectedKind = expectedKind;
            }
        }

        private PendingArchiveImport() {
        }

        /* JADX INFO: compiled from: BtxArchiveToolController.kt */
        @Metadata(m4415d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/ui/BtxArchiveToolController$PendingArchiveImport$Add;", "Lcom/blackhub/bronline/neizzir/fragments/custom/ui/BtxArchiveToolController$PendingArchiveImport;", "archive", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcArchiveItem;", "expectedKind", "Lcom/blackhub/bronline/neizzir/fragments/custom/ui/BtxArchiveToolController$ArchiveImportKind;", "(Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcArchiveItem;Lcom/blackhub/bronline/neizzir/fragments/custom/ui/BtxArchiveToolController$ArchiveImportKind;)V", "getArchive", "()Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcArchiveItem;", "getExpectedKind", "()Lcom/blackhub/bronline/neizzir/fragments/custom/ui/BtxArchiveToolController$ArchiveImportKind;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
        public static final /* data */ class Add extends PendingArchiveImport {
            private final BpcArchiveItem archive;
            private final ArchiveImportKind expectedKind;

            public static /* synthetic */ Add copy$default(Add add, BpcArchiveItem bpcArchiveItem, ArchiveImportKind archiveImportKind, int i, Object obj) {
                if ((i & 1) != 0) {
                    bpcArchiveItem = add.archive;
                }
                if ((i & 2) != 0) {
                    archiveImportKind = add.expectedKind;
                }
                return add.copy(bpcArchiveItem, archiveImportKind);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final BpcArchiveItem getArchive() {
                return this.archive;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final ArchiveImportKind getExpectedKind() {
                return this.expectedKind;
            }

            public final Add copy(BpcArchiveItem archive, ArchiveImportKind expectedKind) {
                Intrinsics.checkNotNullParameter(archive, "archive");
                Intrinsics.checkNotNullParameter(expectedKind, "expectedKind");
                return new Add(archive, expectedKind);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Add)) {
                    return false;
                }
                Add add = (Add) other;
                return Intrinsics.areEqual(this.archive, add.archive) && this.expectedKind == add.expectedKind;
            }

            public int hashCode() {
                return (this.archive.hashCode() * 31) + this.expectedKind.hashCode();
            }

            public String toString() {
                return "Add(archive=" + this.archive + ", expectedKind=" + this.expectedKind + ')';
            }

            public final BpcArchiveItem getArchive() {
                return this.archive;
            }

            public final ArchiveImportKind getExpectedKind() {
                return this.expectedKind;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Add(BpcArchiveItem archive, ArchiveImportKind expectedKind) {
                super(null);
                Intrinsics.checkNotNullParameter(archive, "archive");
                Intrinsics.checkNotNullParameter(expectedKind, "expectedKind");
                this.archive = archive;
                this.expectedKind = expectedKind;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getCtx() {
        Context contextRequireContext = this.fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return contextRequireContext;
    }

    private final ViewGroup getRootView() {
        View view = this.fragment.getView();
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    private final LifecycleCoroutineScope getLifecycleScope() {
        LifecycleOwner viewLifecycleOwner = this.fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
    }

    private final Typeface getBoldFont() {
        return (Typeface) this.boldFont.getValue();
    }

    public final void show(RecyclerView contentRecyclerView) {
        Intrinsics.checkNotNullParameter(contentRecyclerView, "contentRecyclerView");
        this.hostRecyclerView = contentRecyclerView;
        contentRecyclerView.setAdapter(null);
        contentRecyclerView.setVisibility(8);
        ensureToolView();
        showBtxArchiveList();
    }

    public final void onPause() {
        Job job = this.btxArchiveScanJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Iterable iterableValues = this.btxPreviewJobs.values();
        Intrinsics.checkNotNullExpressionValue(iterableValues, "<get-values>(...)");
        Iterable $this$forEach$iv = iterableValues;
        for (Object element$iv : $this$forEach$iv) {
            Job it = (Job) element$iv;
            Intrinsics.checkNotNull(it);
            Job.DefaultImpls.cancel$default(it, (CancellationException) null, 1, (Object) null);
        }
        this.btxPreviewJobs.clear();
        this.btxPreviewLoading.clear();
    }

    public final void clear() {
        ViewGroup rootView;
        onPause();
        RecyclerView recyclerView = this.hostRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        View existing = this.toolView;
        if (existing != null && (rootView = getRootView()) != null) {
            rootView.removeView(existing);
        }
        this.toolView = null;
        this.currentBpcArchive = null;
        this.allBpcEntries = CollectionsKt__CollectionsKt.emptyList();
        this.btxToolTitleView = null;
        this.btxToolMetaView = null;
        this.btxToolBackButton = null;
        this.btxToolSearchContainer = null;
        this.btxToolSearchInput = null;
        this.btxToolHomeActions = null;
        this.btxToolArchiveActions = null;
        this.btxToolRecyclerView = null;
        this.btxToolEmptyView = null;
    }

    private final void initDependencies() {
        this.btxConverter = new BtxConverter(this.fragment);
        this.bpcArchiveRepository = new BpcArchiveRepository(getCtx());
        this.bpcPreviewRepository = new BpcPreviewRepository(getCtx());
    }

    private final void registerLaunchers() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = this.fragment.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$$ExternalSyntheticLambda1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                BtxArchiveToolController.registerLaunchers$lambda$2(this.f$0, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.btxChooser = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = this.fragment.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$$ExternalSyntheticLambda2
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                BtxArchiveToolController.registerLaunchers$lambda$3(this.f$0, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.btxFolderChooser = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult3 = this.fragment.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$$ExternalSyntheticLambda3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                BtxArchiveToolController.registerLaunchers$lambda$4(this.f$0, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "registerForActivityResult(...)");
        this.btxOutputFolderChooser = activityResultLauncherRegisterForActivityResult3;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult4 = this.fragment.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$$ExternalSyntheticLambda4
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                BtxArchiveToolController.registerLaunchers$lambda$5(this.f$0, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult4, "registerForActivityResult(...)");
        this.bpcImportChooser = activityResultLauncherRegisterForActivityResult4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerLaunchers$lambda$2(BtxArchiveToolController this$0, ActivityResult result) {
        BtxConverter btxConverter;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() != -1 || (btxConverter = this$0.btxConverter) == null) {
            return;
        }
        btxConverter.onFilesChosen(result.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerLaunchers$lambda$3(BtxArchiveToolController this$0, ActivityResult result) {
        BtxConverter btxConverter;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() != -1 || (btxConverter = this$0.btxConverter) == null) {
            return;
        }
        Intent data = result.getData();
        btxConverter.onInputFolderChosen(data != null ? data.getData() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerLaunchers$lambda$4(BtxArchiveToolController this$0, ActivityResult result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() == -1) {
            BtxConverter btxConverter = this$0.btxConverter;
            if (btxConverter != null) {
                Intent data = result.getData();
                btxConverter.onOutputFolderChosen(data != null ? data.getData() : null);
            }
            this$0.refreshVisibleState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerLaunchers$lambda$5(BtxArchiveToolController this$0, ActivityResult result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            this$0.handleBpcImportResult(data != null ? data.getData() : null);
        }
    }

    private final void ensureToolView() {
        if (this.toolView != null) {
            View view = this.toolView;
            if (view == null) {
                return;
            }
            view.setVisibility(0);
            return;
        }
        ViewGroup root = getRootView();
        if (root == null) {
            return;
        }
        View $this$ensureToolView_u24lambda_u247 = this.fragment.getLayoutInflater().inflate(C3715R.layout.neizzir20_view_btx_archive_tool, root, false);
        ConstraintLayout.LayoutParams $this$ensureToolView_u24lambda_u247_u24lambda_u246 = new ConstraintLayout.LayoutParams(-1, 0);
        $this$ensureToolView_u24lambda_u247_u24lambda_u246.startToStart = 0;
        $this$ensureToolView_u24lambda_u247_u24lambda_u246.endToEnd = 0;
        $this$ensureToolView_u24lambda_u247_u24lambda_u246.topToBottom = C3715R.id.neizzir20_divider;
        $this$ensureToolView_u24lambda_u247_u24lambda_u246.bottomToTop = C3715R.id.neizzir20_bottom_nav;
        $this$ensureToolView_u24lambda_u247.setLayoutParams($this$ensureToolView_u24lambda_u247_u24lambda_u246);
        this.btxToolTitleView = (TextView) $this$ensureToolView_u24lambda_u247.findViewById(C3715R.id.neizzir20_btx_title);
        this.btxToolMetaView = (TextView) $this$ensureToolView_u24lambda_u247.findViewById(C3715R.id.neizzir20_btx_meta);
        this.btxToolBackButton = (ImageView) $this$ensureToolView_u24lambda_u247.findViewById(C3715R.id.neizzir20_btx_back);
        this.btxToolSearchContainer = $this$ensureToolView_u24lambda_u247.findViewById(C3715R.id.neizzir20_btx_search_container);
        this.btxToolSearchInput = (EditText) $this$ensureToolView_u24lambda_u247.findViewById(C3715R.id.neizzir20_btx_search_input);
        this.btxToolHomeActions = (LinearLayout) $this$ensureToolView_u24lambda_u247.findViewById(C3715R.id.neizzir20_btx_home_actions);
        this.btxToolArchiveActions = (LinearLayout) $this$ensureToolView_u24lambda_u247.findViewById(C3715R.id.neizzir20_btx_archive_actions);
        View viewFindViewById = $this$ensureToolView_u24lambda_u247.findViewById(C3715R.id.neizzir20_btx_recycler);
        RecyclerView $this$ensureToolView_u24lambda_u248 = (RecyclerView) viewFindViewById;
        $this$ensureToolView_u24lambda_u248.setLayoutManager(new LinearLayoutManager(getCtx()));
        this.btxToolRecyclerView = (RecyclerView) viewFindViewById;
        this.btxToolEmptyView = (TextView) $this$ensureToolView_u24lambda_u247.findViewById(C3715R.id.neizzir20_btx_empty);
        ImageView imageView = this.btxToolBackButton;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BtxArchiveToolController.ensureToolView$lambda$9(this.f$0, view2);
                }
            });
        }
        EditText editText = this.btxToolSearchInput;
        if (editText != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.ensureToolView.3
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    BtxArchiveToolController btxArchiveToolController = BtxArchiveToolController.this;
                    String string = s != null ? s.toString() : null;
                    if (string == null) {
                        string = "";
                    }
                    btxArchiveToolController.applyBtxEntryFilter(string);
                }
            });
        }
        this.toolView = $this$ensureToolView_u24lambda_u247;
        root.addView($this$ensureToolView_u24lambda_u247);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureToolView$lambda$9(BtxArchiveToolController this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showBtxArchiveList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showBtxArchiveList() {
        String outputTargetSummary;
        ensureToolView();
        this.currentBpcArchive = null;
        this.allBpcEntries = CollectionsKt__CollectionsKt.emptyList();
        Job job = this.btxArchiveScanJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        cancelPreviewRequests();
        ImageView imageView = this.btxToolBackButton;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        LinearLayout linearLayout = this.btxToolHomeActions;
        Object parent = linearLayout != null ? linearLayout.getParent() : null;
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.btxToolArchiveActions;
        Object parent2 = linearLayout2 != null ? linearLayout2.getParent() : null;
        View view2 = parent2 instanceof View ? (View) parent2 : null;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.btxToolSearchContainer;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        EditText editText = this.btxToolSearchInput;
        if (editText != null) {
            editText.setText("");
        }
        TextView textView = this.btxToolTitleView;
        if (textView != null) {
            textView.setText("BTX / BPC");
        }
        TextView textView2 = this.btxToolMetaView;
        if (textView2 != null) {
            StringBuilder sbAppend = new StringBuilder().append("textures archives • export: ");
            BtxConverter btxConverter = this.btxConverter;
            if (btxConverter == null || (outputTargetSummary = btxConverter.getOutputTargetSummary()) == null) {
                outputTargetSummary = "files/BTX";
            }
            textView2.setText(sbAppend.append(outputTargetSummary).toString());
        }
        TextView textView3 = this.btxToolEmptyView;
        if (textView3 != null) {
            textView3.setText("Scanning .bpc archives...");
        }
        TextView textView4 = this.btxToolEmptyView;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        renderBtxHomeActions();
        BpcArchiveAdapter it = this.bpcArchiveAdapter;
        if (it == null) {
            it = new BpcArchiveAdapter(getCtx(), new Function1<BpcArchiveItem, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$showBtxArchiveList$adapter$1
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BpcArchiveItem archive) {
                    Intrinsics.checkNotNullParameter(archive, "archive");
                    this.this$0.openBtxArchive(archive);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BpcArchiveItem bpcArchiveItem) {
                    invoke2(bpcArchiveItem);
                    return Unit.INSTANCE;
                }
            });
            this.bpcArchiveAdapter = it;
        }
        RecyclerView recyclerView = this.btxToolRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(it);
        }
        it.replaceData(CollectionsKt__CollectionsKt.emptyList());
        BpcArchiveRepository repo = this.bpcArchiveRepository;
        if (repo == null) {
            return;
        }
        this.btxArchiveScanJob = BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C54371(it, this, repo, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$showBtxArchiveList$1 */
    /* JADX INFO: compiled from: BtxArchiveToolController.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$showBtxArchiveList$1", m4426f = "BtxArchiveToolController.kt", m4427i = {}, m4428l = {243}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BpcArchiveAdapter $adapter;
        final /* synthetic */ BpcArchiveRepository $repo;
        int label;
        final /* synthetic */ BtxArchiveToolController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54371(BpcArchiveAdapter bpcArchiveAdapter, BtxArchiveToolController btxArchiveToolController, BpcArchiveRepository bpcArchiveRepository, Continuation<? super C54371> continuation) {
            super(2, continuation);
            this.$adapter = bpcArchiveAdapter;
            this.this$0 = btxArchiveToolController;
            this.$repo = bpcArchiveRepository;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54371(this.$adapter, this.this$0, this.$repo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C54371 c54371;
            String outputTargetSummary;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c54371 = this;
                    c54371.label = 1;
                    Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new BtxArchiveToolController$showBtxArchiveList$1$archives$1(c54371.$repo, null), c54371);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objWithContext;
                    break;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c54371 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<BpcArchiveItem> list = (List) $result;
            c54371.$adapter.replaceData(list);
            TextView textView = c54371.this$0.btxToolEmptyView;
            if (textView != null) {
                textView.setText("No .bpc archives found in textures");
            }
            TextView textView2 = c54371.this$0.btxToolEmptyView;
            int count$iv = 0;
            if (textView2 != null) {
                textView2.setVisibility(list.isEmpty() ? 0 : 8);
            }
            List<BpcArchiveItem> $this$count$iv = list;
            if (!($this$count$iv instanceof Collection) || !$this$count$iv.isEmpty()) {
                count$iv = 0;
                for (Object element$iv : $this$count$iv) {
                    BpcArchiveItem it = (BpcArchiveItem) element$iv;
                    if (it.getSupported() && (count$iv = count$iv + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            int supportedCount = count$iv;
            TextView textView3 = c54371.this$0.btxToolMetaView;
            if (textView3 != null) {
                StringBuilder sbAppend = new StringBuilder().append("textures archives: ").append(list.size()).append(", supported: ").append(supportedCount).append(" • export: ");
                BtxConverter btxConverter = c54371.this$0.btxConverter;
                if (btxConverter == null || (outputTargetSummary = btxConverter.getOutputTargetSummary()) == null) {
                    outputTargetSummary = "files/BTX";
                }
                textView3.setText(sbAppend.append(outputTargetSummary).toString());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openBtxArchive(BpcArchiveItem archive) {
        ensureToolView();
        Job job = this.btxArchiveScanJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        cancelPreviewRequests();
        BpcArchiveItem currentArchive = archive.copy((51 & 1) != 0 ? archive.file : null, (51 & 2) != 0 ? archive.relativePath : null, (51 & 4) != 0 ? archive.sizeBytes : archive.getFile().length(), (51 & 8) != 0 ? archive.lastModified : archive.getFile().lastModified(), (51 & 16) != 0 ? archive.textureCount : 0, (51 & 32) != 0 ? archive.supported : false);
        this.currentBpcArchive = currentArchive;
        this.allBpcEntries = CollectionsKt__CollectionsKt.emptyList();
        ImageView imageView = this.btxToolBackButton;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        LinearLayout linearLayout = this.btxToolHomeActions;
        Object parent = linearLayout != null ? linearLayout.getParent() : null;
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.btxToolArchiveActions;
        Object parent2 = linearLayout2 != null ? linearLayout2.getParent() : null;
        View view2 = parent2 instanceof View ? (View) parent2 : null;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.btxToolSearchContainer;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        EditText editText = this.btxToolSearchInput;
        if (editText != null) {
            editText.setText("");
        }
        TextView textView = this.btxToolTitleView;
        if (textView != null) {
            textView.setText(currentArchive.getFile().getName());
        }
        TextView textView2 = this.btxToolMetaView;
        if (textView2 != null) {
            textView2.setText("Reading BTX entries from " + currentArchive.getRelativePath());
        }
        TextView textView3 = this.btxToolEmptyView;
        if (textView3 != null) {
            textView3.setText("Reading BTX entries...");
        }
        TextView textView4 = this.btxToolEmptyView;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        renderBtxArchiveActions(currentArchive);
        BpcTextureEntryAdapter it = this.bpcTextureAdapter;
        if (it == null) {
            it = new BpcTextureEntryAdapter(getCtx(), new Function1<BpcTextureEntry, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$openBtxArchive$adapter$1
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BpcTextureEntry entry) {
                    Intrinsics.checkNotNullParameter(entry, "entry");
                    this.this$0.previewBtxEntry(entry);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BpcTextureEntry bpcTextureEntry) {
                    invoke2(bpcTextureEntry);
                    return Unit.INSTANCE;
                }
            }, new Function1<BpcTextureEntry, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$openBtxArchive$adapter$2
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BpcTextureEntry entry) {
                    Intrinsics.checkNotNullParameter(entry, "entry");
                    this.this$0.showBtxEntryExportDialog(entry);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BpcTextureEntry bpcTextureEntry) {
                    invoke2(bpcTextureEntry);
                    return Unit.INSTANCE;
                }
            }, new Function1<BpcTextureEntry, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$openBtxArchive$adapter$3
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BpcTextureEntry entry) {
                    Intrinsics.checkNotNullParameter(entry, "entry");
                    BpcArchiveItem it2 = this.this$0.currentBpcArchive;
                    if (it2 != null) {
                        this.this$0.launchArchiveImportPicker(new BtxArchiveToolController.PendingArchiveImport.Replace(it2, entry, null, 4, null));
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BpcTextureEntry bpcTextureEntry) {
                    invoke2(bpcTextureEntry);
                    return Unit.INSTANCE;
                }
            }, new Function1<BpcTextureEntry, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$openBtxArchive$adapter$4
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BpcTextureEntry entry) {
                    Intrinsics.checkNotNullParameter(entry, "entry");
                    this.this$0.toggleBtxEntrySelection(entry);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BpcTextureEntry bpcTextureEntry) {
                    invoke2(bpcTextureEntry);
                    return Unit.INSTANCE;
                }
            }, new Function1<BpcTextureEntry, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$openBtxArchive$adapter$5
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BpcTextureEntry entry) {
                    Intrinsics.checkNotNullParameter(entry, "entry");
                    this.this$0.requestBtxEntryPreview(entry);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BpcTextureEntry bpcTextureEntry) {
                    invoke2(bpcTextureEntry);
                    return Unit.INSTANCE;
                }
            });
            this.bpcTextureAdapter = it;
        }
        RecyclerView recyclerView = this.btxToolRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(it);
        }
        it.replaceData(CollectionsKt__CollectionsKt.emptyList());
        BpcArchiveRepository repo = this.bpcArchiveRepository;
        if (repo == null) {
            return;
        }
        this.btxArchiveScanJob = BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C54131(currentArchive, repo, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$openBtxArchive$1 */
    /* JADX INFO: compiled from: BtxArchiveToolController.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$openBtxArchive$1", m4426f = "BtxArchiveToolController.kt", m4427i = {}, m4428l = {291}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BpcArchiveItem $currentArchive;
        final /* synthetic */ BpcArchiveRepository $repo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54131(BpcArchiveItem bpcArchiveItem, BpcArchiveRepository bpcArchiveRepository, Continuation<? super C54131> continuation) {
            super(2, continuation);
            this.$currentArchive = bpcArchiveItem;
            this.$repo = bpcArchiveRepository;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BtxArchiveToolController.this.new C54131(this.$currentArchive, this.$repo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C54131 c54131;
            String archiveExportHint;
            File file;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            String absolutePath = null;
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c54131 = this;
                    c54131.label = 1;
                    Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new BtxArchiveToolController$openBtxArchive$1$entries$1(c54131.$repo, c54131.$currentArchive, null), c54131);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objWithContext;
                    break;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c54131 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List entries = (List) $result;
            BpcArchiveItem bpcArchiveItem = BtxArchiveToolController.this.currentBpcArchive;
            if (bpcArchiveItem != null && (file = bpcArchiveItem.getFile()) != null) {
                absolutePath = file.getAbsolutePath();
            }
            if (Intrinsics.areEqual(absolutePath, c54131.$currentArchive.getFile().getAbsolutePath())) {
                BtxArchiveToolController.this.allBpcEntries = entries;
                BtxArchiveToolController.this.applyBtxEntryFilter("");
                TextView textView = BtxArchiveToolController.this.btxToolEmptyView;
                if (textView != null) {
                    textView.setText("Archive does not contain .btx textures");
                }
                TextView textView2 = BtxArchiveToolController.this.btxToolEmptyView;
                if (textView2 != null) {
                    textView2.setVisibility(entries.isEmpty() ? 0 : 8);
                }
                TextView textView3 = BtxArchiveToolController.this.btxToolMetaView;
                if (textView3 != null) {
                    StringBuilder sbAppend = new StringBuilder().append(c54131.$currentArchive.getRelativePath()).append(" • BTX: ").append(entries.size()).append(" • export: ");
                    BtxConverter btxConverter = BtxArchiveToolController.this.btxConverter;
                    if (btxConverter == null || (archiveExportHint = btxConverter.getArchiveExportHint(FilesKt.getNameWithoutExtension(c54131.$currentArchive.getFile()))) == null) {
                        archiveExportHint = "files/BTX";
                    }
                    textView3.setText(sbAppend.append(archiveExportHint).toString());
                }
                Iterable $this$forEach$iv = CollectionsKt___CollectionsKt.take(entries, 18);
                BtxArchiveToolController btxArchiveToolController = BtxArchiveToolController.this;
                for (Object element$iv : $this$forEach$iv) {
                    BpcTextureEntry it = (BpcTextureEntry) element$iv;
                    btxArchiveToolController.requestBtxEntryPreview(it);
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    private final void renderBtxHomeActions() {
        LinearLayout container = this.btxToolHomeActions;
        if (container == null) {
            return;
        }
        container.removeAllViews();
        container.addView(createBtxActionChip("Архивы textures", true, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.renderBtxHomeActions.1
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
                BtxArchiveToolController.this.showBtxArchiveList();
            }
        }));
        container.addView(createBtxActionChip$default(this, "Локальный конвертер", false, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.renderBtxHomeActions.2
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
                BtxArchiveToolController.this.showBtxActionDialog();
            }
        }, 2, null));
        container.addView(createBtxActionChip$default(this, "Обновить список", false, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.renderBtxHomeActions.3
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
                BtxArchiveToolController.this.showBtxArchiveList();
            }
        }, 2, null));
        container.addView(createBtxActionChip$default(this, "Папка экспорта", false, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.renderBtxHomeActions.4
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
                BtxArchiveToolController.this.launchBtxOutputFolderPicker();
            }
        }, 2, null));
    }

    private final void renderBtxArchiveActions(final BpcArchiveItem archive) {
        int count$iv;
        LinearLayout container = this.btxToolArchiveActions;
        if (container == null) {
            return;
        }
        container.removeAllViews();
        Iterable $this$count$iv = this.allBpcEntries;
        if (($this$count$iv instanceof Collection) && ((Collection) $this$count$iv).isEmpty()) {
            count$iv = 0;
        } else {
            count$iv = 0;
            for (Object element$iv : $this$count$iv) {
                BpcTextureEntry it = (BpcTextureEntry) element$iv;
                if (it.isSelected() && (count$iv = count$iv + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        int selectedCount = count$iv;
        container.addView(createBtxActionChip("Назад к архивам", true, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.renderBtxArchiveActions.1
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
                BtxArchiveToolController.this.showBtxArchiveList();
            }
        }));
        if (selectedCount > 0) {
            container.addView(createBtxActionChip$default(this, "Снять выделение (" + selectedCount + ')', false, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.renderBtxArchiveActions.2
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
                    BtxArchiveToolController.this.clearBtxSelection();
                }
            }, 2, null));
            container.addView(createBtxActionChip$default(this, "Выбранные PNG", false, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.renderBtxArchiveActions.3
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
                    BtxArchiveToolController.this.exportSelectedEntries(archive, BpcExportFormat.PNG);
                }
            }, 2, null));
            container.addView(createBtxActionChip$default(this, "Выбранные BTX", false, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.renderBtxArchiveActions.4
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
                    BtxArchiveToolController.this.exportSelectedEntries(archive, BpcExportFormat.BTX);
                }
            }, 2, null));
        } else {
            container.addView(createBtxActionChip$default(this, "Добавить текстуру", false, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.renderBtxArchiveActions.5
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
                    BtxArchiveToolController.this.showAddTextureDialog(archive);
                }
            }, 2, null));
            container.addView(createBtxActionChip$default(this, "Экспортировать всё PNG", false, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.renderBtxArchiveActions.6
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
                    BtxArchiveToolController.this.exportAllFromArchive(archive, BpcExportFormat.PNG);
                }
            }, 2, null));
            container.addView(createBtxActionChip$default(this, "Экспортировать всё BTX", false, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.renderBtxArchiveActions.7
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
                    BtxArchiveToolController.this.exportAllFromArchive(archive, BpcExportFormat.BTX);
                }
            }, 2, null));
        }
    }

    static /* synthetic */ MaterialCardView createBtxActionChip$default(BtxArchiveToolController btxArchiveToolController, String str, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return btxArchiveToolController.createBtxActionChip(str, z, function0);
    }

    private final MaterialCardView createBtxActionChip(String title, boolean accent, final Function0<Unit> action) {
        MaterialCardView $this$createBtxActionChip_u24lambda_u2416 = new MaterialCardView(getCtx());
        $this$createBtxActionChip_u24lambda_u2416.setRadius(dpToPx(14));
        $this$createBtxActionChip_u24lambda_u2416.setCardElevation(0.0f);
        $this$createBtxActionChip_u24lambda_u2416.setCardBackgroundColor(Color.parseColor(accent ? "#00E5CC" : "#1B2630"));
        LinearLayout.LayoutParams $this$createBtxActionChip_u24lambda_u2416_u24lambda_u2413 = new LinearLayout.LayoutParams(-2, -2);
        $this$createBtxActionChip_u24lambda_u2416_u24lambda_u2413.setMarginEnd(dpToPx(8));
        $this$createBtxActionChip_u24lambda_u2416.setLayoutParams($this$createBtxActionChip_u24lambda_u2416_u24lambda_u2413);
        TextView $this$createBtxActionChip_u24lambda_u2416_u24lambda_u2414 = new TextView($this$createBtxActionChip_u24lambda_u2416.getContext());
        $this$createBtxActionChip_u24lambda_u2416_u24lambda_u2414.setText(title);
        $this$createBtxActionChip_u24lambda_u2416_u24lambda_u2414.setTextColor(Color.parseColor(accent ? "#0A0A0F" : "#FFFFFF"));
        $this$createBtxActionChip_u24lambda_u2416_u24lambda_u2414.setTextSize(13.0f);
        $this$createBtxActionChip_u24lambda_u2416_u24lambda_u2414.setTypeface(accent ? getBoldFont() : Typeface.DEFAULT_BOLD);
        $this$createBtxActionChip_u24lambda_u2416_u24lambda_u2414.setPadding(dpToPx(14), dpToPx(10), dpToPx(14), dpToPx(10));
        $this$createBtxActionChip_u24lambda_u2416.addView($this$createBtxActionChip_u24lambda_u2416_u24lambda_u2414);
        $this$createBtxActionChip_u24lambda_u2416.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BtxArchiveToolController.createBtxActionChip$lambda$16$lambda$15(action, view);
            }
        });
        return $this$createBtxActionChip_u24lambda_u2416;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createBtxActionChip$lambda$16$lambda$15(Function0 action, View it) {
        Intrinsics.checkNotNullParameter(action, "$action");
        action.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyBtxEntryFilter(String query) {
        List<BpcTextureEntry> list;
        String str;
        BpcTextureEntryAdapter adapter = this.bpcTextureAdapter;
        if (adapter == null) {
            return;
        }
        String normalized = StringsKt__StringsKt.trim((CharSequence) query).toString();
        if (normalized.length() == 0) {
            list = this.allBpcEntries;
        } else {
            Iterable $this$filter$iv = this.allBpcEntries;
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv : $this$filter$iv) {
                BpcTextureEntry it = (BpcTextureEntry) element$iv$iv;
                if (StringsKt__StringsKt.contains((CharSequence) it.getArchivePath(), (CharSequence) normalized, true) || StringsKt__StringsKt.contains((CharSequence) it.getDisplayName(), (CharSequence) normalized, true)) {
                    destination$iv$iv.add(element$iv$iv);
                }
            }
            list = (List) destination$iv$iv;
        }
        adapter.replaceData(list);
        TextView textView = this.btxToolEmptyView;
        if (textView != null) {
            if (!this.allBpcEntries.isEmpty()) {
                str = "No textures match \"" + normalized + '\"';
            }
            textView.setText(str);
        }
        TextView textView2 = this.btxToolEmptyView;
        if (textView2 != null) {
            textView2.setVisibility(list.isEmpty() ? 0 : 8);
        }
        BpcArchiveItem it2 = this.currentBpcArchive;
        if (it2 != null) {
            renderBtxArchiveActions(it2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleBtxEntrySelection(BpcTextureEntry entry) {
        Editable text;
        BpcTextureEntry bpcTextureEntryCopy$default;
        Iterable $this$map$iv = this.allBpcEntries;
        Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            BpcTextureEntry current = (BpcTextureEntry) item$iv$iv;
            if (StringsKt__StringsJVMKt.equals(current.getArchivePath(), entry.getArchivePath(), true)) {
                bpcTextureEntryCopy$default = BpcTextureEntry.copy$default(current, null, null, 0L, null, !current.isSelected(), 15, null);
            } else {
                bpcTextureEntryCopy$default = current;
            }
            destination$iv$iv.add(bpcTextureEntryCopy$default);
        }
        this.allBpcEntries = (List) destination$iv$iv;
        EditText editText = this.btxToolSearchInput;
        String string = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
        if (string == null) {
            string = "";
        }
        applyBtxEntryFilter(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearBtxSelection() {
        Editable text;
        Iterable $this$none$iv = this.allBpcEntries;
        boolean z = true;
        if (!($this$none$iv instanceof Collection) || !((Collection) $this$none$iv).isEmpty()) {
            for (Object element$iv : $this$none$iv) {
                BpcTextureEntry it = (BpcTextureEntry) element$iv;
                if (it.isSelected()) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            return;
        }
        Iterable $this$map$iv = this.allBpcEntries;
        Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            BpcTextureEntry it2 = (BpcTextureEntry) item$iv$iv;
            destination$iv$iv.add(BpcTextureEntry.copy$default(it2, null, null, 0L, null, false, 15, null));
        }
        this.allBpcEntries = (List) destination$iv$iv;
        EditText editText = this.btxToolSearchInput;
        String string = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
        if (string == null) {
            string = "";
        }
        applyBtxEntryFilter(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestBtxEntryPreview(BpcTextureEntry entry) {
        BpcArchiveItem archive;
        BpcArchiveRepository repo;
        BpcPreviewRepository previewRepo;
        if ((entry.getPreviewState() instanceof PreviewState.Loading) && (archive = this.currentBpcArchive) != null) {
            StringBuilder sbAppend = new StringBuilder().append(archive.getFile().getAbsolutePath()).append('|');
            String lowerCase = entry.getArchivePath().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String key = sbAppend.append(lowerCase).toString();
            if (!this.btxPreviewLoading.add(key) || (repo = this.bpcArchiveRepository) == null || (previewRepo = this.bpcPreviewRepository) == null) {
                return;
            }
            this.btxPreviewJobs.put(key, BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C54291(key, archive, entry, previewRepo, repo, null), 3, null));
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$requestBtxEntryPreview$1 */
    /* JADX INFO: compiled from: BtxArchiveToolController.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$requestBtxEntryPreview$1", m4426f = "BtxArchiveToolController.kt", m4427i = {}, m4428l = {406}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BpcArchiveItem $archive;
        final /* synthetic */ BpcTextureEntry $entry;
        final /* synthetic */ String $key;
        final /* synthetic */ BpcPreviewRepository $previewRepo;
        final /* synthetic */ BpcArchiveRepository $repo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54291(String str, BpcArchiveItem bpcArchiveItem, BpcTextureEntry bpcTextureEntry, BpcPreviewRepository bpcPreviewRepository, BpcArchiveRepository bpcArchiveRepository, Continuation<? super C54291> continuation) {
            super(2, continuation);
            this.$key = str;
            this.$archive = bpcArchiveItem;
            this.$entry = bpcTextureEntry;
            this.$previewRepo = bpcPreviewRepository;
            this.$repo = bpcArchiveRepository;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BtxArchiveToolController.this.new C54291(this.$key, this.$archive, this.$entry, this.$previewRepo, this.$repo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C54291 c54291;
            File file;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c54291 = this;
                    c54291.label = 1;
                    Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new BtxArchiveToolController$requestBtxEntryPreview$1$previewState$1(c54291.$previewRepo, c54291.$archive, c54291.$entry, c54291.$repo, null), c54291);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objWithContext;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c54291 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PreviewState previewState = (PreviewState) $result;
            BtxArchiveToolController.this.btxPreviewLoading.remove(c54291.$key);
            BtxArchiveToolController.this.btxPreviewJobs.remove(c54291.$key);
            BpcArchiveItem bpcArchiveItem = BtxArchiveToolController.this.currentBpcArchive;
            if (Intrinsics.areEqual((bpcArchiveItem == null || (file = bpcArchiveItem.getFile()) == null) ? null : file.getAbsolutePath(), c54291.$archive.getFile().getAbsolutePath())) {
                BtxArchiveToolController.this.updateBtxEntryPreviewState(c54291.$entry.getArchivePath(), previewState);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBtxEntryPreviewState(String entryPath, PreviewState previewState) {
        Editable text;
        BpcTextureEntry bpcTextureEntryCopy$default;
        File file;
        StringBuilder sb = new StringBuilder();
        BpcArchiveItem bpcArchiveItem = this.currentBpcArchive;
        String string = null;
        String absolutePath = (bpcArchiveItem == null || (file = bpcArchiveItem.getFile()) == null) ? null : file.getAbsolutePath();
        if (absolutePath == null) {
            absolutePath = "";
        }
        StringBuilder sbAppend = sb.append(absolutePath).append('|');
        String lowerCase = entryPath.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String key = sbAppend.append(lowerCase).toString();
        this.btxPreviewLoading.remove(key);
        Job jobRemove = this.btxPreviewJobs.remove(key);
        if (jobRemove != null) {
            Job.DefaultImpls.cancel$default(jobRemove, (CancellationException) null, 1, (Object) null);
        }
        Iterable $this$map$iv = this.allBpcEntries;
        Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            BpcTextureEntry entry = (BpcTextureEntry) item$iv$iv;
            if (StringsKt__StringsJVMKt.equals(entry.getArchivePath(), entryPath, true)) {
                bpcTextureEntryCopy$default = BpcTextureEntry.copy$default(entry, null, null, 0L, previewState, false, 23, null);
            } else {
                bpcTextureEntryCopy$default = entry;
            }
            destination$iv$iv.add(bpcTextureEntryCopy$default);
        }
        this.allBpcEntries = (List) destination$iv$iv;
        EditText editText = this.btxToolSearchInput;
        if (editText != null && (text = editText.getText()) != null) {
            string = text.toString();
        }
        applyBtxEntryFilter(string != null ? string : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void previewBtxEntry(BpcTextureEntry entry) {
        boolean z;
        Iterable $this$any$iv = this.allBpcEntries;
        if (!($this$any$iv instanceof Collection) || !((Collection) $this$any$iv).isEmpty()) {
            Iterator it = $this$any$iv.iterator();
            while (true) {
                if (it.hasNext()) {
                    Object element$iv = it.next();
                    BpcTextureEntry it2 = (BpcTextureEntry) element$iv;
                    if (it2.isSelected()) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        } else {
            z = false;
        }
        if (z) {
            toggleBtxEntrySelection(entry);
            return;
        }
        PreviewState state = entry.getPreviewState();
        if (state instanceof PreviewState.Ready) {
            DialogUtils.INSTANCE.showImageDialog(getCtx(), ((PreviewState.Ready) state).getPngFile(), entry.getArchivePath());
            return;
        }
        if (state instanceof PreviewState.Failed) {
            Toast.makeText(getCtx(), "Preview unavailable: " + ((PreviewState.Failed) state).getReason(), 0).show();
        } else if (Intrinsics.areEqual(state, PreviewState.Loading.INSTANCE)) {
            requestBtxEntryPreview(entry);
            Toast.makeText(getCtx(), "Preview building...", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showBtxEntryExportDialog(final BpcTextureEntry entry) {
        LauncherDialogHelper.INSTANCE.showActionDialog(getCtx(), entry.getDisplayName(), (48 & 4) != 0 ? null : "Экспорт из архива", CollectionsKt__CollectionsKt.listOf((Object[]) new LauncherDialogHelper.ActionItem[]{new LauncherDialogHelper.ActionItem("Экспортировать как PNG", "Декодировать BTX локально и сохранить PNG.", true, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.showBtxEntryExportDialog.1
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
                BtxArchiveToolController.this.exportSingleEntry(entry, BpcExportFormat.PNG);
            }
        }), new LauncherDialogHelper.ActionItem("Экспортировать как BTX", "Сохранить исходный entry из архива без изменений.", false, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.showBtxEntryExportDialog.2
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
                BtxArchiveToolController.this.exportSingleEntry(entry, BpcExportFormat.BTX);
            }
        }, 4, null)}), (48 & 16) != 0 ? "Закрыть" : null, (48 & 32) != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAddTextureDialog(final BpcArchiveItem archive) {
        String str;
        BpcArchiveRepository repo = this.bpcArchiveRepository;
        if (repo == null) {
            return;
        }
        boolean canAddPng = repo.canAddPng(archive);
        ArrayList actions = new ArrayList();
        if (canAddPng) {
            actions.add(new LauncherDialogHelper.ActionItem("Добавить PNG", "PNG будет конвертирован локально в BTX по шаблону из архива.", true, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.showAddTextureDialog.1
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
                    BtxArchiveToolController.this.launchArchiveImportPicker(new PendingArchiveImport.Add(archive, ArchiveImportKind.PNG));
                }
            }));
        }
        actions.add(new LauncherDialogHelper.ActionItem("Добавить BTX", "Добавить готовый BTX без дополнительной конвертации.", false, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.showAddTextureDialog.2
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
                BtxArchiveToolController.this.launchArchiveImportPicker(new PendingArchiveImport.Add(archive, ArchiveImportKind.BTX));
            }
        }, 4, null));
        LauncherDialogHelper launcherDialogHelper = LauncherDialogHelper.INSTANCE;
        Context ctx = getCtx();
        if (canAddPng) {
            str = "PNG будет упакован по локальному конвертеру и сохранён прямо в исходный .bpc.";
        } else {
            str = "В архиве нет BTX-шаблона. Сейчас доступно только добавление готового BTX.";
        }
        launcherDialogHelper.showActionDialog(ctx, "Добавить текстуру", (48 & 4) != 0 ? null : str, actions, (48 & 16) != 0 ? "Закрыть" : null, (48 & 32) != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showBtxActionDialog() {
        final BtxConverter converter = this.btxConverter;
        if (converter == null) {
            return;
        }
        LauncherDialogHelper.INSTANCE.showActionDialog(getCtx(), "BTX локальный конвертер", (48 & 4) != 0 ? null : converter.getOutputTargetHint(), CollectionsKt__CollectionsKt.listOf((Object[]) new LauncherDialogHelper.ActionItem[]{new LauncherDialogHelper.ActionItem("Выбрать файлы PNG/BTX", "Смешанный режим: PNG -> BTX, BTX -> PNG в одном запуске.", true, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.showBtxActionDialog.1
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
                BtxArchiveToolController.this.launchBtxFilePicker();
            }
        }), new LauncherDialogHelper.ActionItem("Конвертировать папку целиком", "Рекурсивно обработать все PNG и BTX внутри выбранной папки.", false, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.showBtxActionDialog.2
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
                BtxArchiveToolController.this.launchBtxInputFolderPicker();
            }
        }, 4, null), new LauncherDialogHelper.ActionItem("Выбрать папку сохранения", "Переопределить стандартный вывод files/BTX.", false, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.showBtxActionDialog.3
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
                BtxArchiveToolController.this.launchBtxOutputFolderPicker();
            }
        }, 4, null), new LauncherDialogHelper.ActionItem("Сбросить папку сохранения", "Вернуться к стандартной директории files/BTX.", false, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.showBtxActionDialog.4
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
                converter.clearOutputFolderOverride();
                this.refreshVisibleState();
            }
        }, 4, null)}), (48 & 16) != 0 ? "Закрыть" : null, (48 & 32) != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void exportSingleEntry(BpcTextureEntry entry, BpcExportFormat format) {
        BpcArchiveRepository repo;
        BtxConverter converter;
        BpcArchiveItem archive = this.currentBpcArchive;
        if (archive == null || (repo = this.bpcArchiveRepository) == null || (converter = this.btxConverter) == null) {
            return;
        }
        LauncherDialogHelper.ProgressHandle dialog = LauncherDialogHelper.createBusyDialog$default(LauncherDialogHelper.INSTANCE, getCtx(), "Экспорт", "Обработка " + entry.getDisplayName() + "...", null, null, 24, null);
        dialog.show();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C54111(archive, dialog, this, converter, format, repo, entry, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$exportSingleEntry$1 */
    /* JADX INFO: compiled from: BtxArchiveToolController.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$exportSingleEntry$1", m4426f = "BtxArchiveToolController.kt", m4427i = {0, 1}, m4428l = {558, 561}, m4429m = "invokeSuspend", m4430n = {"archiveName", "archiveName"}, m4431s = {"L$0", "L$0"})
    static final class C54111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BpcArchiveItem $archive;
        final /* synthetic */ BtxConverter $converter;
        final /* synthetic */ LauncherDialogHelper.ProgressHandle $dialog;
        final /* synthetic */ BpcTextureEntry $entry;
        final /* synthetic */ BpcExportFormat $format;
        final /* synthetic */ BpcArchiveRepository $repo;
        Object L$0;
        int label;
        final /* synthetic */ BtxArchiveToolController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54111(BpcArchiveItem bpcArchiveItem, LauncherDialogHelper.ProgressHandle progressHandle, BtxArchiveToolController btxArchiveToolController, BtxConverter btxConverter, BpcExportFormat bpcExportFormat, BpcArchiveRepository bpcArchiveRepository, BpcTextureEntry bpcTextureEntry, Continuation<? super C54111> continuation) {
            super(2, continuation);
            this.$archive = bpcArchiveItem;
            this.$dialog = progressHandle;
            this.this$0 = btxArchiveToolController;
            this.$converter = btxConverter;
            this.$format = bpcExportFormat;
            this.$repo = bpcArchiveRepository;
            this.$entry = bpcTextureEntry;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54111(this.$archive, this.$dialog, this.this$0, this.$converter, this.$format, this.$repo, this.$entry, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0091 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0092  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v6, types: [com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$exportSingleEntry$1] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String nameWithoutExtension;
            Object obj2;
            Object obj3;
            BtxConverter.ArchiveExportTarget archiveExportTarget;
            String str;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C54111 c54111 = this.label;
            try {
                switch (c54111) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        C54111 c54112 = this;
                        nameWithoutExtension = FilesKt.getNameWithoutExtension(c54112.$archive.getFile());
                        c54112.L$0 = nameWithoutExtension;
                        c54112.label = 1;
                        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new BtxArchiveToolController$exportSingleEntry$1$target$1(c54112.$converter, nameWithoutExtension, null), c54112);
                        if (objWithContext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = obj;
                        obj3 = objWithContext;
                        c54111 = c54112;
                        try {
                            archiveExportTarget = (BtxConverter.ArchiveExportTarget) obj3;
                            c54111.L$0 = nameWithoutExtension;
                            c54111.label = 2;
                            if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(c54111.$format, archiveExportTarget, c54111.$repo, c54111.$archive, c54111.$entry, c54111.$converter, nameWithoutExtension, null), c54111) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            str = nameWithoutExtension;
                            c54111 = c54111;
                            c54111.$dialog.dismiss();
                            Toast.makeText(c54111.this$0.getCtx(), "Сохранено в " + c54111.$converter.getArchiveExportHint(str), 1).show();
                            return Unit.INSTANCE;
                        } catch (Exception e) {
                            e = e;
                            c54111.$dialog.dismiss();
                            Toast.makeText(c54111.this$0.getCtx(), "Ошибка экспорта: " + e.getMessage(), 1).show();
                        }
                        break;
                    case 1:
                        C54111 c54113 = this;
                        obj3 = obj;
                        nameWithoutExtension = (String) c54113.L$0;
                        ResultKt.throwOnFailure(obj3);
                        obj2 = obj3;
                        c54111 = c54113;
                        archiveExportTarget = (BtxConverter.ArchiveExportTarget) obj3;
                        c54111.L$0 = nameWithoutExtension;
                        c54111.label = 2;
                        if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(c54111.$format, archiveExportTarget, c54111.$repo, c54111.$archive, c54111.$entry, c54111.$converter, nameWithoutExtension, null), c54111) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str = nameWithoutExtension;
                        c54111 = c54111;
                        c54111.$dialog.dismiss();
                        Toast.makeText(c54111.this$0.getCtx(), "Сохранено в " + c54111.$converter.getArchiveExportHint(str), 1).show();
                        return Unit.INSTANCE;
                    case 2:
                        C54111 c54114 = this;
                        str = (String) c54114.L$0;
                        ResultKt.throwOnFailure(obj);
                        c54111 = c54114;
                        c54111.$dialog.dismiss();
                        Toast.makeText(c54111.this$0.getCtx(), "Сохранено в " + c54111.$converter.getArchiveExportHint(str), 1).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e2) {
                e = e2;
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$exportSingleEntry$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: BtxArchiveToolController.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$exportSingleEntry$1$1", m4426f = "BtxArchiveToolController.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ BpcArchiveItem $archive;
            final /* synthetic */ String $archiveName;
            final /* synthetic */ BtxConverter $converter;
            final /* synthetic */ BpcTextureEntry $entry;
            final /* synthetic */ BpcExportFormat $format;
            final /* synthetic */ BpcArchiveRepository $repo;
            final /* synthetic */ BtxConverter.ArchiveExportTarget $target;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BpcExportFormat bpcExportFormat, BtxConverter.ArchiveExportTarget archiveExportTarget, BpcArchiveRepository bpcArchiveRepository, BpcArchiveItem bpcArchiveItem, BpcTextureEntry bpcTextureEntry, BtxConverter btxConverter, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$format = bpcExportFormat;
                this.$target = archiveExportTarget;
                this.$repo = bpcArchiveRepository;
                this.$archive = bpcArchiveItem;
                this.$entry = bpcTextureEntry;
                this.$converter = btxConverter;
                this.$archiveName = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$format, this.$target, this.$repo, this.$archive, this.$entry, this.$converter, this.$archiveName, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        if (this.$format == BpcExportFormat.BTX && (this.$target instanceof BtxConverter.ArchiveExportTarget.FileSystem)) {
                            this.$repo.extractEntryAsBtx(this.$archive, this.$entry, ((BtxConverter.ArchiveExportTarget.FileSystem) this.$target).getDirectory());
                        } else {
                            BpcExportPayload payload = this.$repo.buildEntryExport(this.$archive, this.$entry, this.$format);
                            this.$converter.writeArchiveExport(this.$archiveName, payload.getRelativePath(), payload.getBytes(), payload.getMimeType());
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void exportAllFromArchive(BpcArchiveItem archive, BpcExportFormat format) {
        File file;
        BpcArchiveItem bpcArchiveItem = this.currentBpcArchive;
        exportEntries(archive, Intrinsics.areEqual((bpcArchiveItem == null || (file = bpcArchiveItem.getFile()) == null) ? null : file.getAbsolutePath(), archive.getFile().getAbsolutePath()) ? this.allBpcEntries : CollectionsKt__CollectionsKt.emptyList(), format, "Экспорт архива", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void exportSelectedEntries(BpcArchiveItem archive, BpcExportFormat format) {
        Iterable $this$filter$iv = this.allBpcEntries;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            BpcTextureEntry it = (BpcTextureEntry) element$iv$iv;
            if (it.isSelected()) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        List selectedEntries = (List) destination$iv$iv;
        if (selectedEntries.isEmpty()) {
            Toast.makeText(getCtx(), "Нет выделенных текстур", 0).show();
        } else {
            exportEntries(archive, selectedEntries, format, "Экспорт выбранных", true);
        }
    }

    private final void exportEntries(BpcArchiveItem archive, List<BpcTextureEntry> entries, BpcExportFormat format, String dialogTitle, boolean clearSelectionOnSuccess) {
        BtxConverter converter;
        BpcArchiveRepository repo = this.bpcArchiveRepository;
        if (repo == null || (converter = this.btxConverter) == null) {
            return;
        }
        LauncherDialogHelper.ProgressHandle dialog = LauncherDialogHelper.INSTANCE.createDeterminateProgressDialog(getCtx(), dialogTitle, Math.max(entries.size(), 1), "Отмена", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$exportEntries$dialog$1
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
                Job job = jobHolder[0];
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
            }
        });
        dialog.setMessage("Подготовка " + archive.getFile().getName() + "...");
        dialog.show();
        final Job[] jobHolder = {BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C54101(entries, dialog, this, archive, clearSelectionOnSuccess, converter, repo, format, null), 3, null)};
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$exportEntries$1 */
    /* JADX INFO: compiled from: BtxArchiveToolController.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$exportEntries$1", m4426f = "BtxArchiveToolController.kt", m4427i = {1, 1, 2, 2, 2, 2, 2, 2}, m4428l = {Constants.ID_TACKLE_3, 653, 662}, m4429m = "invokeSuspend", m4430n = {"sourceEntries", "archiveName", "sourceEntries", "archiveName", TypedValues.AttributesType.S_TARGET, "entry", "index$iv", FirebaseAnalytics.Param.INDEX}, m4431s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$9", "I$0", "I$1"})
    static final class C54101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BpcArchiveItem $archive;
        final /* synthetic */ boolean $clearSelectionOnSuccess;
        final /* synthetic */ BtxConverter $converter;
        final /* synthetic */ LauncherDialogHelper.ProgressHandle $dialog;
        final /* synthetic */ List<BpcTextureEntry> $entries;
        final /* synthetic */ BpcExportFormat $format;
        final /* synthetic */ BpcArchiveRepository $repo;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        final /* synthetic */ BtxArchiveToolController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54101(List<BpcTextureEntry> list, LauncherDialogHelper.ProgressHandle progressHandle, BtxArchiveToolController btxArchiveToolController, BpcArchiveItem bpcArchiveItem, boolean z, BtxConverter btxConverter, BpcArchiveRepository bpcArchiveRepository, BpcExportFormat bpcExportFormat, Continuation<? super C54101> continuation) {
            super(2, continuation);
            this.$entries = list;
            this.$dialog = progressHandle;
            this.this$0 = btxArchiveToolController;
            this.$archive = bpcArchiveItem;
            this.$clearSelectionOnSuccess = z;
            this.$converter = btxConverter;
            this.$repo = bpcArchiveRepository;
            this.$format = bpcExportFormat;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54101(this.$entries, this.$dialog, this.this$0, this.$archive, this.$clearSelectionOnSuccess, this.$converter, this.$repo, this.$format, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0173 A[Catch: Exception -> 0x028a, CancellationException -> 0x0291, TRY_LEAVE, TryCatch #13 {CancellationException -> 0x0291, Exception -> 0x028a, blocks: (B:44:0x016d, B:46:0x0173, B:55:0x0189), top: B:93:0x016d }] */
        /* JADX WARN: Code duplicated, block: B:60:0x01f1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:61:0x01f2  */
        /* JADX WARN: Code duplicated, block: B:98:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1 */
        /* JADX WARN: Type inference failed for: r12v3 */
        /* JADX WARN: Type inference failed for: r12v4, types: [com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$exportEntries$1, kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$exportEntries$1] */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v2, types: [com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$exportEntries$1] */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v34 */
        /* JADX WARN: Type inference failed for: r2v35 */
        /* JADX WARN: Type inference failed for: r2v36 */
        /* JADX WARN: Type inference failed for: r2v37 */
        /* JADX WARN: Type inference failed for: r2v38 */
        /* JADX WARN: Type inference failed for: r2v4, types: [com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$exportEntries$1] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9, types: [com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$exportEntries$1] */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r4v28 */
        /* JADX WARN: Type inference failed for: r4v29 */
        /* JADX WARN: Type inference failed for: r4v32 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01f2 -> B:62:0x0209). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r32) {
            /*
                Method dump skipped, instruction units count: 760
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.custom.p023ui.BtxArchiveToolController.C54101.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchArchiveImportPicker(PendingArchiveImport pending) {
        this.pendingArchiveImport = pending;
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        ActivityResultLauncher<Intent> activityResultLauncher = this.bpcImportChooser;
        if (activityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bpcImportChooser");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch(intent);
    }

    private final void handleBpcImportResult(Uri uri) {
        PendingArchiveImport pending = this.pendingArchiveImport;
        if (pending == null) {
            return;
        }
        this.pendingArchiveImport = null;
        if (uri == null) {
            return;
        }
        String uriDisplayName = getUriDisplayName(uri);
        if (uriDisplayName == null) {
            BtxArchiveToolController $this$handleBpcImportResult_u24lambda_u2426 = this;
            Toast.makeText($this$handleBpcImportResult_u24lambda_u2426.getCtx(), "Не удалось определить имя файла", 0).show();
        } else if (matchesImportKind(uriDisplayName, pending)) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C54121(pending, this, uriDisplayName, uri, null), 3, null);
        } else {
            Toast.makeText(getCtx(), "Неподдерживаемый формат: " + uriDisplayName, 0).show();
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$handleBpcImportResult$1 */
    /* JADX INFO: compiled from: BtxArchiveToolController.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$handleBpcImportResult$1", m4426f = "BtxArchiveToolController.kt", m4427i = {}, m4428l = {723}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $displayName;
        final /* synthetic */ PendingArchiveImport $pending;
        final /* synthetic */ Uri $uri;
        int label;
        final /* synthetic */ BtxArchiveToolController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54121(PendingArchiveImport pendingArchiveImport, BtxArchiveToolController btxArchiveToolController, String str, Uri uri, Continuation<? super C54121> continuation) {
            super(2, continuation);
            this.$pending = pendingArchiveImport;
            this.this$0 = btxArchiveToolController;
            this.$displayName = str;
            this.$uri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54121(this.$pending, this.this$0, this.$displayName, this.$uri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004b A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:16:0x0043, B:18:0x004b, B:19:0x0063, B:21:0x0067), top: B:31:0x0043 }] */
        /* JADX WARN: Code duplicated, block: B:19:0x0063 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:16:0x0043, B:18:0x004b, B:19:0x0063, B:21:0x0067), top: B:31:0x0043 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0067 A[Catch: Exception -> 0x007c, TRY_LEAVE, TryCatch #0 {Exception -> 0x007c, blocks: (B:16:0x0043, B:18:0x004b, B:19:0x0063, B:21:0x0067), top: B:31:0x0043 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C54121 c54121;
            Exception e;
            C54121 c54122;
            final byte[] sourceBytes;
            PendingArchiveImport pendingArchiveImport;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c54121 = this;
                    try {
                        c54121.label = 1;
                        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new BtxArchiveToolController$handleBpcImportResult$1$sourceBytes$1(c54121.this$0, c54121.$uri, c54121.$displayName, null), c54121);
                        if (objWithContext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        $result = objWithContext;
                        try {
                            sourceBytes = (byte[]) $result;
                            pendingArchiveImport = c54121.$pending;
                            if (pendingArchiveImport instanceof PendingArchiveImport.Replace) {
                                c54121.this$0.performArchiveReplace(((PendingArchiveImport.Replace) c54121.$pending).getArchive(), ((PendingArchiveImport.Replace) c54121.$pending).getEntry(), c54121.$displayName, sourceBytes);
                            } else if (pendingArchiveImport instanceof PendingArchiveImport.Add) {
                                BtxArchiveToolController btxArchiveToolController = c54121.this$0;
                                String str = c54121.$displayName;
                                final BtxArchiveToolController btxArchiveToolController2 = c54121.this$0;
                                final PendingArchiveImport pendingArchiveImport2 = c54121.$pending;
                                final String str2 = c54121.$displayName;
                                btxArchiveToolController.promptArchiveEntryName(str, new Function2<String, Boolean, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.handleBpcImportResult.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(String str3, Boolean bool) {
                                        invoke(str3, bool.booleanValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(String targetPath, boolean overwrite) {
                                        Intrinsics.checkNotNullParameter(targetPath, "targetPath");
                                        btxArchiveToolController2.performArchiveAdd(((PendingArchiveImport.Add) pendingArchiveImport2).getArchive(), targetPath, str2, sourceBytes, overwrite);
                                    }
                                });
                            }
                            break;
                        } catch (Exception e2) {
                            C54121 c54123 = c54121;
                            e = e2;
                            $result = $result;
                            c54122 = c54123;
                            Toast.makeText(c54122.this$0.getCtx(), "Ошибка импорта: " + e.getMessage(), 1).show();
                        }
                        return Unit.INSTANCE;
                    } catch (Exception e3) {
                        e = e3;
                        c54122 = c54121;
                        Toast.makeText(c54122.this$0.getCtx(), "Ошибка импорта: " + e.getMessage(), 1).show();
                        return Unit.INSTANCE;
                    }
                case 1:
                    c54122 = this;
                    try {
                        ResultKt.throwOnFailure($result);
                        c54121 = c54122;
                        sourceBytes = (byte[]) $result;
                        pendingArchiveImport = c54121.$pending;
                        if (pendingArchiveImport instanceof PendingArchiveImport.Replace) {
                            c54121.this$0.performArchiveReplace(((PendingArchiveImport.Replace) c54121.$pending).getArchive(), ((PendingArchiveImport.Replace) c54121.$pending).getEntry(), c54121.$displayName, sourceBytes);
                        } else if (pendingArchiveImport instanceof PendingArchiveImport.Add) {
                            BtxArchiveToolController btxArchiveToolController3 = c54121.this$0;
                            String str3 = c54121.$displayName;
                            final BtxArchiveToolController btxArchiveToolController4 = c54121.this$0;
                            final PendingArchiveImport pendingArchiveImport3 = c54121.$pending;
                            final String str4 = c54121.$displayName;
                            btxArchiveToolController3.promptArchiveEntryName(str3, new Function2<String, Boolean, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.handleBpcImportResult.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(String str5, Boolean bool) {
                                    invoke(str5, bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(String targetPath, boolean overwrite) {
                                    Intrinsics.checkNotNullParameter(targetPath, "targetPath");
                                    btxArchiveToolController4.performArchiveAdd(((PendingArchiveImport.Add) pendingArchiveImport3).getArchive(), targetPath, str4, sourceBytes, overwrite);
                                }
                            });
                        }
                        break;
                    } catch (Exception e4) {
                        e = e4;
                        Toast.makeText(c54122.this$0.getCtx(), "Ошибка импорта: " + e.getMessage(), 1).show();
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void promptArchiveEntryName(String sourceName, final Function2<? super String, ? super Boolean, Unit> onConfirmed) {
        final BpcArchiveRepository repo = this.bpcArchiveRepository;
        if (repo == null) {
            return;
        }
        LauncherDialogHelper.showInputDialog$default(LauncherDialogHelper.INSTANCE, getCtx(), "Путь файла в архиве", "Например: radar196.btx или gui/custom/newtex.btx", StringsKt__StringsKt.substringBeforeLast(sourceName, '.', sourceName) + ".btx", "radar196.btx", null, null, new Function1<String, String>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.promptArchiveEntryName.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final String invoke(String rawValue) {
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                return repo.validateEntryPath(StringsKt__StringsJVMKt.replace$default(rawValue, '\\', FileSystemKt.UnixPathSeparator, false, 4, (Object) null));
            }
        }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.promptArchiveEntryName.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String rawValue) {
                boolean z;
                BpcTextureEntry it;
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                final String targetPath = StringsKt__StringsJVMKt.replace$default(rawValue, '\\', FileSystemKt.UnixPathSeparator, false, 4, (Object) null);
                Iterable $this$any$iv = BtxArchiveToolController.this.allBpcEntries;
                if (!($this$any$iv instanceof Collection) || !((Collection) $this$any$iv).isEmpty()) {
                    Iterator it2 = $this$any$iv.iterator();
                    do {
                        if (!it2.hasNext()) {
                            z = false;
                            break;
                        } else {
                            Object element$iv = it2.next();
                            it = (BpcTextureEntry) element$iv;
                            z = true;
                        }
                    } while (!StringsKt__StringsJVMKt.equals(it.getArchivePath(), targetPath, true));
                } else {
                    z = false;
                }
                boolean exists = z;
                if (exists) {
                    final Function2<String, Boolean, Unit> function2 = onConfirmed;
                    LauncherDialogHelper.INSTANCE.showConfirmDialog(BtxArchiveToolController.this.getCtx(), "Перезаписать запись?", targetPath + " уже существует в архиве.", (128 & 8) != 0 ? "Подтвердить" : "Перезаписать", (128 & 16) != 0 ? "Отмена" : "Отмена", (128 & 32) != 0, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController.promptArchiveEntryName.2.1
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
                            function2.invoke(targetPath, true);
                        }
                    }, (128 & 128) != 0 ? null : null);
                    return;
                }
                onConfirmed.invoke(targetPath, false);
            }
        }, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performArchiveReplace(BpcArchiveItem archive, BpcTextureEntry entry, String sourceName, byte[] sourceBytes) {
        BpcPreviewRepository previewRepo;
        BpcArchiveRepository repo = this.bpcArchiveRepository;
        if (repo == null || (previewRepo = this.bpcPreviewRepository) == null) {
            return;
        }
        LauncherDialogHelper.ProgressHandle dialog = LauncherDialogHelper.createBusyDialog$default(LauncherDialogHelper.INSTANCE, getCtx(), "Архив BTX", "Замена " + entry.getDisplayName() + "...", null, null, 24, null);
        dialog.show();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C54151(previewRepo, archive, dialog, this, entry, repo, sourceName, sourceBytes, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$performArchiveReplace$1 */
    /* JADX INFO: compiled from: BtxArchiveToolController.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$performArchiveReplace$1", m4426f = "BtxArchiveToolController.kt", m4427i = {}, m4428l = {795}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BpcArchiveItem $archive;
        final /* synthetic */ LauncherDialogHelper.ProgressHandle $dialog;
        final /* synthetic */ BpcTextureEntry $entry;
        final /* synthetic */ BpcPreviewRepository $previewRepo;
        final /* synthetic */ BpcArchiveRepository $repo;
        final /* synthetic */ byte[] $sourceBytes;
        final /* synthetic */ String $sourceName;
        int label;
        final /* synthetic */ BtxArchiveToolController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54151(BpcPreviewRepository bpcPreviewRepository, BpcArchiveItem bpcArchiveItem, LauncherDialogHelper.ProgressHandle progressHandle, BtxArchiveToolController btxArchiveToolController, BpcTextureEntry bpcTextureEntry, BpcArchiveRepository bpcArchiveRepository, String str, byte[] bArr, Continuation<? super C54151> continuation) {
            super(2, continuation);
            this.$previewRepo = bpcPreviewRepository;
            this.$archive = bpcArchiveItem;
            this.$dialog = progressHandle;
            this.this$0 = btxArchiveToolController;
            this.$entry = bpcTextureEntry;
            this.$repo = bpcArchiveRepository;
            this.$sourceName = str;
            this.$sourceBytes = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54151(this.$previewRepo, this.$archive, this.$dialog, this.this$0, this.$entry, this.$repo, this.$sourceName, this.$sourceBytes, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Exception e;
            C54151 c54151;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    try {
                        this.label = 1;
                        if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$repo, this.$archive, this.$entry, this.$sourceName, this.$sourceBytes, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c54151 = this;
                        c54151.$previewRepo.invalidateArchive(c54151.$archive);
                        c54151.$dialog.dismiss();
                        Toast.makeText(c54151.this$0.getCtx(), "Текстура обновлена: " + c54151.$entry.getArchivePath(), 1).show();
                        c54151.this$0.openBtxArchive(c54151.this$0.refreshArchiveState(c54151.$archive));
                        return Unit.INSTANCE;
                    } catch (Exception e2) {
                        e = e2;
                        c54151 = this;
                        c54151.$dialog.dismiss();
                        Toast.makeText(c54151.this$0.getCtx(), "Ошибка замены: " + e.getMessage(), 1).show();
                    }
                    break;
                case 1:
                    c54151 = this;
                    try {
                        ResultKt.throwOnFailure($result);
                        c54151.$previewRepo.invalidateArchive(c54151.$archive);
                        c54151.$dialog.dismiss();
                        Toast.makeText(c54151.this$0.getCtx(), "Текстура обновлена: " + c54151.$entry.getArchivePath(), 1).show();
                        c54151.this$0.openBtxArchive(c54151.this$0.refreshArchiveState(c54151.$archive));
                        break;
                    } catch (Exception e3) {
                        e = e3;
                        c54151.$dialog.dismiss();
                        Toast.makeText(c54151.this$0.getCtx(), "Ошибка замены: " + e.getMessage(), 1).show();
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$performArchiveReplace$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: BtxArchiveToolController.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$performArchiveReplace$1$1", m4426f = "BtxArchiveToolController.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ BpcArchiveItem $archive;
            final /* synthetic */ BpcTextureEntry $entry;
            final /* synthetic */ BpcArchiveRepository $repo;
            final /* synthetic */ byte[] $sourceBytes;
            final /* synthetic */ String $sourceName;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BpcArchiveRepository bpcArchiveRepository, BpcArchiveItem bpcArchiveItem, BpcTextureEntry bpcTextureEntry, String str, byte[] bArr, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$repo = bpcArchiveRepository;
                this.$archive = bpcArchiveItem;
                this.$entry = bpcTextureEntry;
                this.$sourceName = str;
                this.$sourceBytes = bArr;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$repo, this.$archive, this.$entry, this.$sourceName, this.$sourceBytes, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.$repo.replaceEntry(this.$archive, this.$entry.getArchivePath(), this.$sourceName, this.$sourceBytes);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performArchiveAdd(BpcArchiveItem archive, String targetPath, String sourceName, byte[] sourceBytes, boolean overwrite) {
        BpcPreviewRepository previewRepo;
        BpcArchiveRepository repo = this.bpcArchiveRepository;
        if (repo == null || (previewRepo = this.bpcPreviewRepository) == null) {
            return;
        }
        LauncherDialogHelper.ProgressHandle dialog = LauncherDialogHelper.createBusyDialog$default(LauncherDialogHelper.INSTANCE, getCtx(), "Архив BTX", "Добавление " + targetPath + "...", null, null, 24, null);
        dialog.show();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C54141(previewRepo, archive, dialog, this, targetPath, repo, sourceName, sourceBytes, overwrite, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$performArchiveAdd$1 */
    /* JADX INFO: compiled from: BtxArchiveToolController.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$performArchiveAdd$1", m4426f = "BtxArchiveToolController.kt", m4427i = {}, m4428l = {827}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BpcArchiveItem $archive;
        final /* synthetic */ LauncherDialogHelper.ProgressHandle $dialog;
        final /* synthetic */ boolean $overwrite;
        final /* synthetic */ BpcPreviewRepository $previewRepo;
        final /* synthetic */ BpcArchiveRepository $repo;
        final /* synthetic */ byte[] $sourceBytes;
        final /* synthetic */ String $sourceName;
        final /* synthetic */ String $targetPath;
        int label;
        final /* synthetic */ BtxArchiveToolController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54141(BpcPreviewRepository bpcPreviewRepository, BpcArchiveItem bpcArchiveItem, LauncherDialogHelper.ProgressHandle progressHandle, BtxArchiveToolController btxArchiveToolController, String str, BpcArchiveRepository bpcArchiveRepository, String str2, byte[] bArr, boolean z, Continuation<? super C54141> continuation) {
            super(2, continuation);
            this.$previewRepo = bpcPreviewRepository;
            this.$archive = bpcArchiveItem;
            this.$dialog = progressHandle;
            this.this$0 = btxArchiveToolController;
            this.$targetPath = str;
            this.$repo = bpcArchiveRepository;
            this.$sourceName = str2;
            this.$sourceBytes = bArr;
            this.$overwrite = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54141(this.$previewRepo, this.$archive, this.$dialog, this.this$0, this.$targetPath, this.$repo, this.$sourceName, this.$sourceBytes, this.$overwrite, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Exception e;
            C54141 c54141;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    try {
                        this.label = 1;
                        if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$repo, this.$archive, this.$targetPath, this.$sourceName, this.$sourceBytes, this.$overwrite, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c54141 = this;
                        c54141.$previewRepo.invalidateArchive(c54141.$archive);
                        c54141.$dialog.dismiss();
                        Toast.makeText(c54141.this$0.getCtx(), "Текстура сохранена: " + c54141.$targetPath, 1).show();
                        c54141.this$0.openBtxArchive(c54141.this$0.refreshArchiveState(c54141.$archive));
                        return Unit.INSTANCE;
                    } catch (Exception e2) {
                        e = e2;
                        c54141 = this;
                        c54141.$dialog.dismiss();
                        Toast.makeText(c54141.this$0.getCtx(), "Ошибка добавления: " + e.getMessage(), 1).show();
                    }
                    break;
                case 1:
                    c54141 = this;
                    try {
                        ResultKt.throwOnFailure($result);
                        c54141.$previewRepo.invalidateArchive(c54141.$archive);
                        c54141.$dialog.dismiss();
                        Toast.makeText(c54141.this$0.getCtx(), "Текстура сохранена: " + c54141.$targetPath, 1).show();
                        c54141.this$0.openBtxArchive(c54141.this$0.refreshArchiveState(c54141.$archive));
                        break;
                    } catch (Exception e3) {
                        e = e3;
                        c54141.$dialog.dismiss();
                        Toast.makeText(c54141.this$0.getCtx(), "Ошибка добавления: " + e.getMessage(), 1).show();
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$performArchiveAdd$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: BtxArchiveToolController.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.BtxArchiveToolController$performArchiveAdd$1$1", m4426f = "BtxArchiveToolController.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ BpcArchiveItem $archive;
            final /* synthetic */ boolean $overwrite;
            final /* synthetic */ BpcArchiveRepository $repo;
            final /* synthetic */ byte[] $sourceBytes;
            final /* synthetic */ String $sourceName;
            final /* synthetic */ String $targetPath;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BpcArchiveRepository bpcArchiveRepository, BpcArchiveItem bpcArchiveItem, String str, String str2, byte[] bArr, boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$repo = bpcArchiveRepository;
                this.$archive = bpcArchiveItem;
                this.$targetPath = str;
                this.$sourceName = str2;
                this.$sourceBytes = bArr;
                this.$overwrite = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$repo, this.$archive, this.$targetPath, this.$sourceName, this.$sourceBytes, this.$overwrite, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws ZipException {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.$repo.addEntry(this.$archive, this.$targetPath, this.$sourceName, this.$sourceBytes, this.$overwrite);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BpcArchiveItem refreshArchiveState(BpcArchiveItem archive) {
        return archive.copy((51 & 1) != 0 ? archive.file : null, (51 & 2) != 0 ? archive.relativePath : null, (51 & 4) != 0 ? archive.sizeBytes : archive.getFile().length(), (51 & 8) != 0 ? archive.lastModified : archive.getFile().lastModified(), (51 & 16) != 0 ? archive.textureCount : 0, (51 & 32) != 0 ? archive.supported : false);
    }

    private final boolean matchesImportKind(String fileName, PendingArchiveImport pending) {
        ArchiveImportKind kind;
        String lower = fileName.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lower, "toLowerCase(...)");
        if (pending instanceof PendingArchiveImport.Replace) {
            kind = ((PendingArchiveImport.Replace) pending).getExpectedKind();
        } else {
            if (!(pending instanceof PendingArchiveImport.Add)) {
                throw new NoWhenBranchMatchedException();
            }
            kind = ((PendingArchiveImport.Add) pending).getExpectedKind();
        }
        switch (WhenMappings.$EnumSwitchMapping$0[kind.ordinal()]) {
            case 1:
                return StringsKt__StringsJVMKt.endsWith$default(lower, ".btx", false, 2, null) || StringsKt__StringsJVMKt.endsWith$default(lower, FileFormats.PNG_FORMAT, false, 2, null) || StringsKt__StringsJVMKt.endsWith$default(lower, ".pngg", false, 2, null);
            case 2:
                return StringsKt__StringsJVMKt.endsWith$default(lower, FileFormats.PNG_FORMAT, false, 2, null) || StringsKt__StringsJVMKt.endsWith$default(lower, ".pngg", false, 2, null);
            case 3:
                return StringsKt__StringsJVMKt.endsWith$default(lower, ".btx", false, 2, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String getUriDisplayName(Uri uri) {
        Cursor cursorQuery = getCtx().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery != null) {
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                if (cursor2.moveToFirst()) {
                    String string = cursor2.getString(0);
                    CloseableKt.closeFinally(cursor, null);
                    return string;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursor, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(cursor, th);
                    throw th2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchBtxFilePicker() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        ActivityResultLauncher<Intent> activityResultLauncher = this.btxChooser;
        if (activityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btxChooser");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchBtxInputFolderPicker() {
        ActivityResultLauncher<Intent> activityResultLauncher = this.btxFolderChooser;
        if (activityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btxFolderChooser");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchBtxOutputFolderPicker() {
        ActivityResultLauncher<Intent> activityResultLauncher = this.btxOutputFolderChooser;
        if (activityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btxOutputFolderChooser");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshVisibleState() {
        View view = this.toolView;
        Unit unit = null;
        if ((view != null ? view.getParent() : null) == null) {
            return;
        }
        BpcArchiveItem it = this.currentBpcArchive;
        if (it != null) {
            openBtxArchive(it);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            showBtxArchiveList();
        }
    }

    private final void cancelPreviewRequests() {
        Iterable iterableValues = this.btxPreviewJobs.values();
        Intrinsics.checkNotNullExpressionValue(iterableValues, "<get-values>(...)");
        Iterable $this$forEach$iv = iterableValues;
        for (Object element$iv : $this$forEach$iv) {
            Job it = (Job) element$iv;
            Intrinsics.checkNotNull(it);
            Job.DefaultImpls.cancel$default(it, (CancellationException) null, 1, (Object) null);
        }
        this.btxPreviewJobs.clear();
        this.btxPreviewLoading.clear();
    }

    private final int dpToPx(int dp) {
        return (int) (dp * getCtx().getResources().getDisplayMetrics().density);
    }
}
