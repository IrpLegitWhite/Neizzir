package com.blackhub.bronline.neizzir.fragments.sborks;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.C2493C;
import androidx.media3.extractor.p007ts.PsExtractor;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.webkit.internal.AssetHelper;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.core.utils.DateFormatter;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassUtils;
import com.blackhub.bronline.neizzir.activities.main.p022ui.MenuFragment;
import com.blackhub.bronline.neizzir.activities.main.p022ui.NEIZZIR;
import com.blackhub.bronline.neizzir.activities.main.util.LocalAssemblyInstaller;
import com.blackhub.bronline.neizzir.activities.main.util.ResourceFileSafety;
import com.blackhub.bronline.neizzir.fragments.custom.p023ui.CustomSbFragment;
import com.blackhub.bronline.neizzir.fragments.sborks.model.FolderData;
import com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi;
import com.blackhub.bronline.neizzir.fragments.sborks.p024ui.Dialogs;
import com.blackhub.bronline.neizzir.fragments.sborks.p024ui.DownloadDialogUi;
import com.blackhub.bronline.neizzir.fragments.sborks.p024ui.SborksDesignHelper;
import com.blackhub.bronline.neizzir.fragments.sborks.p024ui.ScrollHideShowHelper;
import com.blackhub.bronline.neizzir.fragments.sborks.p024ui.adapter.SborksAdapter;
import com.blackhub.bronline.neizzir.fragments.sborks.storage.LikesStorage;
import com.blackhub.bronline.neizzir.fragments.sborks.util.DateUtils;
import com.blackhub.bronline.neizzir.fragments.sborks.util.FileUtils;
import com.blackhub.bronline.neizzir.fragments.sborks.util.SborksNewestSupport;
import com.blackhub.bronline.neizzir.network.CachePolicy;
import com.blackhub.bronline.neizzir.network.Endpoint;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.EndpointRouter;
import com.blackhub.bronline.neizzir.network.NetworkResult;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import com.google.android.material.card.MaterialCardView;
import io.ktor.http.LinkHeader;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.p040io.FilesKt;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;
import okhttp3.internal.url._UrlKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: NeizzirSborksFragment.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020<H\u0002J\n\u0010=\u001a\u0004\u0018\u00010>H\u0002J\b\u0010?\u001a\u00020:H\u0002J\b\u0010@\u001a\u00020:H\u0002J\u0018\u0010A\u001a\u0004\u0018\u00010\f2\u0006\u0010B\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010CJ\b\u0010D\u001a\u00020:H\u0002J \u0010E\u001a\u0004\u0018\u00010\r2\u0006\u0010B\u001a\u00020\f2\u0006\u0010F\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010GJ\n\u0010H\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010I\u001a\u00020-H\u0002J\b\u0010J\u001a\u00020:H\u0002J\u0010\u0010K\u001a\u00020:2\u0006\u0010L\u001a\u00020-H\u0002J\u001a\u0010M\u001a\u00020!2\u0006\u0010N\u001a\u00020\f2\b\b\u0002\u0010O\u001a\u00020\u0019H\u0002J\b\u0010P\u001a\u00020:H\u0002J\b\u0010Q\u001a\u00020:H\u0002J$\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010W2\b\u0010X\u001a\u0004\u0018\u00010YH\u0017J\b\u0010Z\u001a\u00020:H\u0016J\u0018\u0010[\u001a\u00020:2\u0006\u0010\\\u001a\u00020\u00072\u0006\u0010]\u001a\u00020-H\u0002J\u0012\u0010^\u001a\u0004\u0018\u00010\r2\u0006\u0010_\u001a\u00020\fH\u0002J\u001e\u0010`\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010a2\u0006\u0010b\u001a\u00020\fH\u0002J\b\u0010c\u001a\u00020:H\u0002J\b\u0010d\u001a\u00020:H\u0002J\u0012\u0010e\u001a\u00020:2\b\u0010f\u001a\u0004\u0018\u00010>H\u0002J\u0010\u0010g\u001a\u00020:2\u0006\u0010B\u001a\u00020\fH\u0007J\u0010\u0010h\u001a\u00020:2\u0006\u0010i\u001a\u00020SH\u0002J\b\u0010j\u001a\u00020:H\u0002J\b\u0010k\u001a\u00020:H\u0002J\b\u0010l\u001a\u00020:H\u0002J\u0010\u0010m\u001a\u00020:2\u0006\u0010B\u001a\u00020\fH\u0002J\b\u0010n\u001a\u00020:H\u0002J\u0010\u0010o\u001a\u00020:2\u0006\u0010p\u001a\u00020\fH\u0002J\u0010\u0010q\u001a\u00020:2\u0006\u0010\\\u001a\u00020\u0007H\u0003J\u001c\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u001c\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u001c\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u001c\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010v\u001a\u00020:2\u0006\u0010B\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0%X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082.¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006w"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/NeizzirSborksFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/adapter/SborksAdapter;", "allFolders", "", "Lcom/blackhub/bronline/neizzir/fragments/sborks/model/FolderData;", "clearSearchButton", "Landroid/widget/ImageView;", "createdDatesCache", "", "", "Ljava/util/Date;", "createdDatesJob", "Lkotlinx/coroutines/Job;", "currentSearchQuery", "currentSortType", "Lcom/blackhub/bronline/neizzir/fragments/sborks/SortType;", "currentTabType", "Lcom/blackhub/bronline/neizzir/fragments/sborks/TabType;", "downloadJob", "downloadUi", "Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/DownloadDialogUi;", "downloadedFiles", "", "downloadedSize", "", "emptyContainer", "Landroid/widget/LinearLayout;", "emptyText", "Landroid/widget/TextView;", "isButtonLocked", "", "isDownloading", "lastUpdate", "liked", "", "list", "Landroidx/recyclerview/widget/RecyclerView;", "loadingContainer", "progressBar", "Landroid/widget/ProgressBar;", "progressText", "sborksDir", "Ljava/io/File;", "scrollHelper", "Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/ScrollHideShowHelper;", "searchEditText", "Landroid/widget/EditText;", "selectedFolder", "sortSpinner", "Landroid/widget/Spinner;", "tabAll", "tabMy", "totalFiles", "totalSize", "applyFilters", "", "reason", "Lcom/blackhub/bronline/neizzir/fragments/sborks/ListUpdateReason;", "captureScrollAnchor", "Lcom/blackhub/bronline/neizzir/fragments/sborks/ScrollAnchor;", "clearDateCache", "deleteTempSborks", "fetchCreatedDateFromServer", "folderName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFolders", "getFolderCreatedDate", "fallbackUpdateDate", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLauncherKey", "getSborks2Dir", "hideEmptyState", "installFolder", "sourceFolder", "isNewByUpdate", "update", "days", "loadDatesInBackground", "loadDatesInBackgroundLegacy", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onDownloadClick", "folder", "localFolder", "parseDate", "dateStr", "readSettingsConfig", "Lkotlin/Pair;", "folderPath", "refreshData", "resetCreatedDatesState", "restoreScrollAnchor", LinkHeader.Parameters.Anchor, "sendAndroidIdToServerAndMaybeDownload", "setupBottomNavigation", "view", "setupSearch", "setupSortSpinner", "setupTabs", "shareFolderLink", "showDownloadDialog", "showEmptyState", "message", "showFaqDialog", "sortByDownloads", "sortByLikes", "sortByNewest", "sortByNewestLegacy", "startFolderDownload", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class NeizzirSborksFragment extends Fragment {
    private SborksAdapter adapter;
    private ImageView clearSearchButton;
    private Job createdDatesJob;
    private Job downloadJob;
    private DownloadDialogUi downloadUi;
    private int downloadedFiles;
    private long downloadedSize;
    private LinearLayout emptyContainer;
    private TextView emptyText;
    private boolean isButtonLocked;
    private boolean isDownloading;
    private Set<String> liked;
    private RecyclerView list;
    private LinearLayout loadingContainer;
    private ProgressBar progressBar;
    private TextView progressText;
    private File sborksDir;
    private ScrollHideShowHelper scrollHelper;
    private EditText searchEditText;
    private String selectedFolder;
    private Spinner sortSpinner;
    private TextView tabAll;
    private TextView tabMy;
    private int totalFiles;
    private long totalSize;
    private SortType currentSortType = SortType.DOWNLOADS;
    private TabType currentTabType = TabType.ALL_BUILDS;
    private List<FolderData> allFolders = CollectionsKt__CollectionsKt.emptyList();
    private String currentSearchQuery = "";
    private final Map<String, String> lastUpdate = new LinkedHashMap();
    private final Map<String, Date> createdDatesCache = new LinkedHashMap();

    /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[TabType.values().length];
            try {
                iArr[TabType.ALL_BUILDS.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[TabType.MY_BUILDS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SortType.values().length];
            try {
                iArr2[SortType.NEWEST.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr2[SortType.DOWNLOADS.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr2[SortType.LIKES.ordinal()] = 3;
            } catch (NoSuchFieldError e5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ListUpdateReason.values().length];
            try {
                iArr3[ListUpdateReason.BACKGROUND_DATES_READY.ordinal()] = 1;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr3[ListUpdateReason.DATA_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr3[ListUpdateReason.USER_ACTION.ordinal()] = 3;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr3[ListUpdateReason.INITIAL_LOAD.ordinal()] = 4;
            } catch (NoSuchFieldError e9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Set<String> set;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View view = inflater.inflate(C3715R.layout.neizzir_sborks, container, false);
        View viewFindViewById = view.findViewById(C3715R.id.neizzir8_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.list = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(C3715R.id.neizzir_progressBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.progressBar = (ProgressBar) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(C3715R.id.neizzir_progressText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.progressText = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(C3715R.id.neizzir17_sortSpinner);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.sortSpinner = (Spinner) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(C3715R.id.neizzir17_searchEditText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.searchEditText = (EditText) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(C3715R.id.neizzir17_clearSearchButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.clearSearchButton = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(C3715R.id.neizzir17_tabAll);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.tabAll = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(C3715R.id.neizzir17_tabMy);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.tabMy = (TextView) viewFindViewById8;
        this.loadingContainer = (LinearLayout) view.findViewById(C3715R.id.neizzir20_loading_container);
        this.emptyContainer = (LinearLayout) view.findViewById(C3715R.id.neizzir20_empty_container);
        this.emptyText = (TextView) view.findViewById(C3715R.id.neizzir16_DelCarSnow);
        MaterialCardView topCard = (MaterialCardView) view.findViewById(C3715R.id.neizzir17_topCard);
        View divider = view.findViewById(C3715R.id.neizzir17_divider);
        FileUtils fileUtils = FileUtils.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        File parent = fileUtils.externalFilesParent(contextRequireContext);
        this.sborksDir = new File(parent, "sborks");
        LikesStorage likesStorage = LikesStorage.INSTANCE;
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        this.liked = likesStorage.getLiked(contextRequireContext2);
        Set<String> set2 = this.liked;
        ScrollHideShowHelper scrollHideShowHelper = null;
        if (set2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liked");
            set = null;
        } else {
            set = set2;
        }
        Function1<String, Boolean> function1 = new Function1<String, Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$onCreateView$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                File file = this.this$0.sborksDir;
                if (file == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sborksDir");
                    file = null;
                }
                return Boolean.valueOf(new File(file, name).exists());
            }
        };
        Function1<String, Boolean> function2 = new Function1<String, Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$onCreateView$1$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                File file = this.this$0.sborksDir;
                if (file == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sborksDir");
                    file = null;
                }
                File local = new File(file, name);
                DateUtils dateUtils = DateUtils.INSTANCE;
                String str = (String) this.this$0.lastUpdate.get(name);
                if (str == null) {
                    str = "";
                }
                return Boolean.valueOf(dateUtils.isUpdateAvailable(local, str));
            }
        };
        Function1<FolderData, Unit> function3 = new Function1<FolderData, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$onCreateView$1$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FolderData folderData) {
                invoke2(folderData);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$onCreateView$1$3$1 */
            /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
            @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
            @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$onCreateView$1$3$1", m4426f = "NeizzirSborksFragment.kt", m4427i = {}, m4428l = {166}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
            static final class C55451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ FolderData $item;
                int label;
                final /* synthetic */ NeizzirSborksFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C55451(NeizzirSborksFragment neizzirSborksFragment, FolderData folderData, Continuation<? super C55451> continuation) {
                    super(2, continuation);
                    this.this$0 = neizzirSborksFragment;
                    this.$item = folderData;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C55451(this.this$0, this.$item, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C55451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object $result) {
                    C55451 c55451;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (this.label) {
                        case 0:
                            ResultKt.throwOnFailure($result);
                            c55451 = this;
                            c55451.label = 1;
                            Object folderCreatedDate = c55451.this$0.getFolderCreatedDate(c55451.$item.getFolderName(), c55451.$item.getUpdateDate(), c55451);
                            if (folderCreatedDate == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            $result = folderCreatedDate;
                            break;
                        case 1:
                            ResultKt.throwOnFailure($result);
                            c55451 = this;
                            break;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Date date = (Date) $result;
                    c55451.this$0.createdDatesCache.put(c55451.$item.getFolderName(), date);
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FolderData item) {
                Intrinsics.checkNotNullParameter(item, "item");
                LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                File file = null;
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C55451(this.this$0, item, null), 3, null);
                NeizzirSborksFragment neizzirSborksFragment = this.this$0;
                File file2 = this.this$0.sborksDir;
                if (file2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sborksDir");
                } else {
                    file = file2;
                }
                neizzirSborksFragment.onDownloadClick(item, new File(file, item.getFolderName()));
            }
        };
        Function1<FolderData, Unit> function4 = new Function1<FolderData, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$onCreateView$1$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FolderData folderData) {
                invoke2(folderData);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FolderData item) {
                Intrinsics.checkNotNullParameter(item, "item");
                NeizzirSborksFragment neizzirSborksFragment = this.this$0;
                File file = this.this$0.sborksDir;
                if (file == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sborksDir");
                    file = null;
                }
                neizzirSborksFragment.installFolder(new File(file, item.getFolderName()));
            }
        };
        Function1<FolderData, Unit> function5 = new Function1<FolderData, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$onCreateView$1$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FolderData folderData) {
                invoke2(folderData);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FolderData item) {
                Intrinsics.checkNotNullParameter(item, "item");
                FileUtils fileUtils2 = FileUtils.INSTANCE;
                File file = this.this$0.sborksDir;
                if (file == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sborksDir");
                    file = null;
                }
                fileUtils2.deleteFolder(new File(file, item.getFolderName()));
                this.this$0.refreshData();
            }
        };
        Function1<FolderData, Unit> function6 = new Function1<FolderData, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$onCreateView$1$6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FolderData folderData) {
                invoke2(folderData);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FolderData item) {
                Intrinsics.checkNotNullParameter(item, "item");
                this.this$0.showFaqDialog(item);
            }
        };
        Function2<FolderData, Boolean, Unit> function7 = new Function2<FolderData, Boolean, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$onCreateView$1$7
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(FolderData folderData, Boolean bool) {
                invoke(folderData, bool.booleanValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$onCreateView$1$7$1 */
            /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
            @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
            @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$onCreateView$1$7$1", m4426f = "NeizzirSborksFragment.kt", m4427i = {}, m4428l = {181, 182}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
            static final class C55461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ FolderData $item;
                final /* synthetic */ boolean $nowLiked;
                int label;
                final /* synthetic */ NeizzirSborksFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C55461(NeizzirSborksFragment neizzirSborksFragment, boolean z, FolderData folderData, Continuation<? super C55461> continuation) {
                    super(2, continuation);
                    this.this$0 = neizzirSborksFragment;
                    this.$nowLiked = z;
                    this.$item = folderData;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C55461(this.this$0, this.$nowLiked, this.$item, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C55461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code duplicated, block: B:28:0x0072 A[Catch: Exception -> 0x001b, TRY_ENTER, TryCatch #1 {Exception -> 0x001b, blocks: (B:7:0x0012, B:25:0x006b, B:28:0x0072, B:30:0x007a, B:31:0x007e, B:36:0x009d, B:38:0x00b3, B:40:0x00b8, B:32:0x0088, B:34:0x0090, B:35:0x0094, B:8:0x0016), top: B:47:0x0006 }] */
                /* JADX WARN: Code duplicated, block: B:30:0x007a A[Catch: Exception -> 0x001b, TryCatch #1 {Exception -> 0x001b, blocks: (B:7:0x0012, B:25:0x006b, B:28:0x0072, B:30:0x007a, B:31:0x007e, B:36:0x009d, B:38:0x00b3, B:40:0x00b8, B:32:0x0088, B:34:0x0090, B:35:0x0094, B:8:0x0016), top: B:47:0x0006 }] */
                /* JADX WARN: Code duplicated, block: B:32:0x0088 A[Catch: Exception -> 0x001b, TryCatch #1 {Exception -> 0x001b, blocks: (B:7:0x0012, B:25:0x006b, B:28:0x0072, B:30:0x007a, B:31:0x007e, B:36:0x009d, B:38:0x00b3, B:40:0x00b8, B:32:0x0088, B:34:0x0090, B:35:0x0094, B:8:0x0016), top: B:47:0x0006 }] */
                /* JADX WARN: Code duplicated, block: B:34:0x0090 A[Catch: Exception -> 0x001b, TryCatch #1 {Exception -> 0x001b, blocks: (B:7:0x0012, B:25:0x006b, B:28:0x0072, B:30:0x007a, B:31:0x007e, B:36:0x009d, B:38:0x00b3, B:40:0x00b8, B:32:0x0088, B:34:0x0090, B:35:0x0094, B:8:0x0016), top: B:47:0x0006 }] */
                /* JADX WARN: Code duplicated, block: B:38:0x00b3 A[Catch: Exception -> 0x001b, TryCatch #1 {Exception -> 0x001b, blocks: (B:7:0x0012, B:25:0x006b, B:28:0x0072, B:30:0x007a, B:31:0x007e, B:36:0x009d, B:38:0x00b3, B:40:0x00b8, B:32:0x0088, B:34:0x0090, B:35:0x0094, B:8:0x0016), top: B:47:0x0006 }] */
                /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object $result) {
                    C55461 c55461;
                    Set<String> set;
                    Set set2;
                    Set<String> set3;
                    Set set4;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    try {
                        switch (this.label) {
                            case 0:
                                ResultKt.throwOnFailure($result);
                                String androidId = Settings.Secure.getString(this.this$0.requireContext().getContentResolver(), "android_id");
                                try {
                                    if (this.$nowLiked) {
                                        SborksApi sborksApi = SborksApi.INSTANCE;
                                        String folderName = this.$item.getFolderName();
                                        Intrinsics.checkNotNull(androidId);
                                        this.label = 1;
                                        if (sborksApi.like(folderName, androidId, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        c55461 = this;
                                    } else {
                                        SborksApi sborksApi2 = SborksApi.INSTANCE;
                                        String folderName2 = this.$item.getFolderName();
                                        Intrinsics.checkNotNull(androidId);
                                        this.label = 2;
                                        if (sborksApi2.removeLike(folderName2, androidId, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        c55461 = this;
                                    }
                                    set = null;
                                    if (c55461.$nowLiked) {
                                        set4 = c55461.this$0.liked;
                                        if (set4 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("liked");
                                            set4 = null;
                                        }
                                        set4.add(c55461.$item.getFolderName());
                                    } else {
                                        set2 = c55461.this$0.liked;
                                        if (set2 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("liked");
                                            set2 = null;
                                        }
                                        set2.remove(c55461.$item.getFolderName());
                                    }
                                    LikesStorage likesStorage = LikesStorage.INSTANCE;
                                    Context contextRequireContext = c55461.this$0.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    set3 = c55461.this$0.liked;
                                    if (set3 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("liked");
                                    } else {
                                        set = set3;
                                    }
                                    likesStorage.saveLiked(contextRequireContext, set);
                                    break;
                                } catch (Exception e) {
                                }
                                return Unit.INSTANCE;
                            case 1:
                                c55461 = this;
                                ResultKt.throwOnFailure($result);
                                set = null;
                                if (c55461.$nowLiked) {
                                    set4 = c55461.this$0.liked;
                                    if (set4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("liked");
                                        set4 = null;
                                    }
                                    set4.add(c55461.$item.getFolderName());
                                } else {
                                    set2 = c55461.this$0.liked;
                                    if (set2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("liked");
                                        set2 = null;
                                    }
                                    set2.remove(c55461.$item.getFolderName());
                                }
                                LikesStorage likesStorage2 = LikesStorage.INSTANCE;
                                Context contextRequireContext2 = c55461.this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                set3 = c55461.this$0.liked;
                                if (set3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("liked");
                                } else {
                                    set = set3;
                                }
                                likesStorage2.saveLiked(contextRequireContext2, set);
                                return Unit.INSTANCE;
                            case 2:
                                c55461 = this;
                                ResultKt.throwOnFailure($result);
                                set = null;
                                if (c55461.$nowLiked) {
                                    set4 = c55461.this$0.liked;
                                    if (set4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("liked");
                                        set4 = null;
                                    }
                                    set4.add(c55461.$item.getFolderName());
                                } else {
                                    set2 = c55461.this$0.liked;
                                    if (set2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("liked");
                                        set2 = null;
                                    }
                                    set2.remove(c55461.$item.getFolderName());
                                }
                                LikesStorage likesStorage3 = LikesStorage.INSTANCE;
                                Context contextRequireContext3 = c55461.this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                                set3 = c55461.this$0.liked;
                                if (set3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("liked");
                                } else {
                                    set = set3;
                                }
                                likesStorage3.saveLiked(contextRequireContext3, set);
                                return Unit.INSTANCE;
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } catch (Exception e2) {
                    }
                }
            }

            public final void invoke(FolderData item, boolean nowLiked) {
                Intrinsics.checkNotNullParameter(item, "item");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.this$0), null, null, new C55461(this.this$0, nowLiked, item, null), 3, null);
            }
        };
        Function1<FolderData, Unit> function8 = new Function1<FolderData, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$onCreateView$1$8
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FolderData folderData) {
                invoke2(folderData);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$onCreateView$1$8$1 */
            /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
            @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
            @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$onCreateView$1$8$1", m4426f = "NeizzirSborksFragment.kt", m4427i = {0}, m4428l = {PsExtractor.AUDIO_STREAM}, m4429m = "invokeSuspend", m4430n = {"path"}, m4431s = {"L$0"})
            static final class C55471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ FolderData $item;
                Object L$0;
                int label;
                final /* synthetic */ NeizzirSborksFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C55471(FolderData folderData, NeizzirSborksFragment neizzirSborksFragment, Continuation<? super C55471> continuation) {
                    super(2, continuation);
                    this.$item = folderData;
                    this.this$0 = neizzirSborksFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C55471(this.$item, this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C55471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object $result) throws Throwable {
                    C55471 c55471;
                    String path;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (this.label) {
                        case 0:
                            ResultKt.throwOnFailure($result);
                            c55471 = this;
                            String encoded = Uri.encode(c55471.$item.getFolderName(), _UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
                            path = "/download2/" + encoded + "/NEIZZIR/video.mp4";
                            c55471.L$0 = path;
                            c55471.label = 1;
                            Object objResolveEndpointForDownload = NetworkRuntime.INSTANCE.getRouter().resolveEndpointForDownload(EndpointGroup.KOLSON, path, c55471);
                            if (objResolveEndpointForDownload == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            $result = objResolveEndpointForDownload;
                            break;
                        case 1:
                            String path2 = (String) this.L$0;
                            ResultKt.throwOnFailure($result);
                            path = path2;
                            c55471 = this;
                            break;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Endpoint endpoint = (Endpoint) $result;
                    Dialogs dialogs = Dialogs.INSTANCE;
                    Context contextRequireContext = c55471.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    dialogs.showRoutedVideoDialog(contextRequireContext, path, endpoint);
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FolderData item) {
                Intrinsics.checkNotNullParameter(item, "item");
                LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C55471(item, this.this$0, null), 3, null);
            }
        };
        Function1<FolderData, Unit> function9 = new Function1<FolderData, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$onCreateView$1$9
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FolderData folderData) {
                invoke2(folderData);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FolderData item) {
                Intrinsics.checkNotNullParameter(item, "item");
                this.this$0.shareFolderLink(item.getFolderName());
            }
        };
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.adapter = new SborksAdapter(set, function1, function2, function3, function4, function5, function6, function7, function8, function9, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
        RecyclerView recyclerView2 = this.list;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
            recyclerView2 = null;
        }
        SborksAdapter sborksAdapter = this.adapter;
        if (sborksAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            sborksAdapter = null;
        }
        recyclerView2.setAdapter(sborksAdapter);
        RecyclerView recyclerView3 = this.list;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
            recyclerView3 = null;
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(requireContext()));
        deleteTempSborks();
        setupTabs();
        setupSortSpinner();
        setupSearch();
        fetchFolders();
        RecyclerView recyclerView4 = this.list;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
            recyclerView4 = null;
        }
        recyclerView4.setNestedScrollingEnabled(false);
        Bundle arguments = getArguments();
        String deepFolder = arguments != null ? arguments.getString("ARG_DEEP_FOLDER") : null;
        String str = deepFolder;
        if (!(str == null || str.length() == 0)) {
            this.selectedFolder = deepFolder;
            sendAndroidIdToServerAndMaybeDownload(deepFolder);
        }
        Intrinsics.checkNotNull(topCard);
        MaterialCardView materialCardView = topCard;
        Intrinsics.checkNotNull(divider);
        RecyclerView recyclerView5 = this.list;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
            recyclerView = null;
        } else {
            recyclerView = recyclerView5;
        }
        this.scrollHelper = new ScrollHideShowHelper(materialCardView, divider, recyclerView, 0, 8, null);
        ScrollHideShowHelper scrollHideShowHelper2 = this.scrollHelper;
        if (scrollHideShowHelper2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scrollHelper");
        } else {
            scrollHideShowHelper = scrollHideShowHelper2;
        }
        scrollHideShowHelper.setup();
        Intrinsics.checkNotNull(view);
        setupBottomNavigation(view);
        Intrinsics.checkNotNullExpressionValue(view, "also(...)");
        return view;
    }

    private final void setupBottomNavigation(View view) {
        LinearLayout navHome = (LinearLayout) view.findViewById(C3715R.id.neizzir_nav_home);
        LinearLayout navCustom = (LinearLayout) view.findViewById(C3715R.id.neizzir_nav_custom);
        LinearLayout navPlay = (LinearLayout) view.findViewById(C3715R.id.neizzir_nav_play);
        LinearLayout navMenu = (LinearLayout) view.findViewById(C3715R.id.neizzir_nav_menu);
        if (navHome != null) {
            navHome.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NeizzirSborksFragment.setupBottomNavigation$lambda$1(this.f$0, view2);
                }
            });
        }
        if (navCustom != null) {
            navCustom.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NeizzirSborksFragment.setupBottomNavigation$lambda$2(this.f$0, view2);
                }
            });
        }
        if (navPlay != null) {
            navPlay.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NeizzirSborksFragment.setupBottomNavigation$lambda$3(this.f$0, view2);
                }
            });
        }
        if (navMenu != null) {
            navMenu.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NeizzirSborksFragment.setupBottomNavigation$lambda$4(this.f$0, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupBottomNavigation$lambda$1(NeizzirSborksFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getParentFragmentManager().popBackStack((String) null, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupBottomNavigation$lambda$2(NeizzirSborksFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getParentFragmentManager().beginTransaction().replace(C3715R.id.neizzir_fragment_container, new CustomSbFragment()).addToBackStack(null).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupBottomNavigation$lambda$3(NeizzirSborksFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        NEIZZIR neizzir = activity instanceof NEIZZIR ? (NEIZZIR) activity : null;
        if (neizzir != null) {
            neizzir.startGame();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupBottomNavigation$lambda$4(NeizzirSborksFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getParentFragmentManager().popBackStack();
        this$0.getParentFragmentManager().beginTransaction().replace(C3715R.id.neizzir_fragment_container, new MenuFragment()).addToBackStack(null).commit();
    }

    private final void setupSearch() {
        SborksDesignHelper.Companion companion = SborksDesignHelper.INSTANCE;
        EditText editText = this.searchEditText;
        ImageView imageView = null;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchEditText");
            editText = null;
        }
        ImageView imageView2 = this.clearSearchButton;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearSearchButton");
        } else {
            imageView = imageView2;
        }
        companion.setupSearch(editText, imageView, new Function1<String, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment.setupSearch.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String query) {
                Intrinsics.checkNotNullParameter(query, "query");
                NeizzirSborksFragment.this.currentSearchQuery = query;
                NeizzirSborksFragment.this.applyFilters(ListUpdateReason.USER_ACTION);
            }
        });
    }

    private final void setupTabs() {
        final SharedPreferences prefs = requireContext().getSharedPreferences("sborks_prefs", 0);
        int savedTab = prefs.getInt("selected_tab", 0);
        this.currentTabType = TabType.getEntries().get(savedTab);
        SborksDesignHelper.Companion companion = SborksDesignHelper.INSTANCE;
        TextView textView = this.tabAll;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabAll");
            textView = null;
        }
        TextView textView2 = this.tabMy;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabMy");
            textView2 = null;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        companion.setupTabs(textView, textView2, contextRequireContext, savedTab, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment.setupTabs.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int position) {
                NeizzirSborksFragment.this.currentTabType = TabType.getEntries().get(position);
                SharedPreferences prefs2 = prefs;
                Intrinsics.checkNotNullExpressionValue(prefs2, "$prefs");
                SharedPreferences.Editor editor$iv = prefs2.edit();
                editor$iv.putInt("selected_tab", position);
                editor$iv.apply();
                NeizzirSborksFragment.this.applyFilters(ListUpdateReason.USER_ACTION);
            }
        });
    }

    private final void setupSortSpinner() {
        final String[] sortOptions = {"По загрузкам", "Новые", "По лайкам"};
        final Context contextRequireContext = requireContext();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(sortOptions, contextRequireContext) { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$setupSortSpinner$adapter$1
            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int position, View convertView, ViewGroup parent) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                View view = super.getView(position, convertView, parent);
                Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
                TextView textView = (TextView) view.findViewById(R.id.text1);
                textView.setTextColor(-1);
                textView.setTextSize(14.0f);
                textView.setPadding(8, 8, 8, 8);
                return view;
            }

            @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
            public View getDropDownView(int position, View convertView, ViewGroup parent) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                View view = super.getDropDownView(position, convertView, parent);
                TextView textView = (TextView) view.findViewById(R.id.text1);
                textView.setTextColor(-1);
                textView.setTextSize(14.0f);
                textView.setPadding(16, 16, 16, 16);
                Intrinsics.checkNotNull(view);
                return view;
            }
        };
        Spinner spinner = this.sortSpinner;
        Spinner spinner2 = null;
        if (spinner == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sortSpinner");
            spinner = null;
        }
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        final SharedPreferences prefs = requireContext().getSharedPreferences("sborks_prefs", 0);
        Spinner spinner3 = this.sortSpinner;
        if (spinner3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sortSpinner");
            spinner3 = null;
        }
        spinner3.setSelection(1);
        this.currentSortType = SortType.NEWEST;
        Spinner spinner4 = this.sortSpinner;
        if (spinner4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sortSpinner");
        } else {
            spinner2 = spinner4;
        }
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment.setupSortSpinner.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                NeizzirSborksFragment.this.currentSortType = SortType.getEntries().get(position);
                SharedPreferences prefs2 = prefs;
                Intrinsics.checkNotNullExpressionValue(prefs2, "$prefs");
                SharedPreferences.Editor editor$iv = prefs2.edit();
                editor$iv.putInt("sort_type", position);
                editor$iv.apply();
                Iterable $this$any$iv = NeizzirSborksFragment.this.allFolders;
                NeizzirSborksFragment neizzirSborksFragment = NeizzirSborksFragment.this;
                boolean z = false;
                if (!($this$any$iv instanceof Collection) || !((Collection) $this$any$iv).isEmpty()) {
                    for (Object element$iv : $this$any$iv) {
                        FolderData it = (FolderData) element$iv;
                        if (!neizzirSborksFragment.createdDatesCache.containsKey(it.getFolderName())) {
                            z = true;
                            break;
                        }
                    }
                }
                boolean hasMissingCreatedDates = z;
                if (NeizzirSborksFragment.this.currentSortType != SortType.NEWEST || !hasMissingCreatedDates) {
                    NeizzirSborksFragment.this.applyFilters(ListUpdateReason.USER_ACTION);
                } else {
                    NeizzirSborksFragment.this.loadDatesInBackground();
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    static /* synthetic */ void applyFilters$default(NeizzirSborksFragment neizzirSborksFragment, ListUpdateReason listUpdateReason, int i, Object obj) {
        if ((i & 1) != 0) {
            listUpdateReason = ListUpdateReason.USER_ACTION;
        }
        neizzirSborksFragment.applyFilters(listUpdateReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void applyFilters(final ListUpdateReason reason) {
        ArrayList arrayList;
        SborksAdapter sborksAdapter;
        List<FolderData> listSortByNewest;
        final ScrollAnchor scrollAnchorCaptureScrollAnchor;
        String str;
        if (this.allFolders.isEmpty()) {
            return;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[this.currentTabType.ordinal()]) {
            case 1:
                arrayList = this.allFolders;
                break;
            case 2:
                List<FolderData> list = this.allFolders;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    FolderData folderData = (FolderData) obj;
                    File file = this.sborksDir;
                    if (file == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sborksDir");
                        file = null;
                    }
                    if (new File(file, folderData.getFolderName()).exists()) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = arrayList2;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList3 = arrayList;
        if (this.currentSearchQuery.length() > 0) {
            String str2 = this.currentSearchQuery;
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                String folderName = ((FolderData) obj2).getFolderName();
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                String lowerCase2 = folderName.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                List<FolderData> list2 = arrayList3;
                String str3 = lowerCase;
                if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) lowerCase, false, 2, (Object) null)) {
                    arrayList4.add(obj2);
                }
                arrayList3 = list2;
                lowerCase = str3;
            }
            sborksAdapter = null;
            arrayList3 = arrayList4;
        } else {
            sborksAdapter = null;
        }
        switch (WhenMappings.$EnumSwitchMapping$1[this.currentSortType.ordinal()]) {
            case 1:
                listSortByNewest = sortByNewest(arrayList3);
                break;
            case 2:
                listSortByNewest = sortByDownloads(arrayList3);
                break;
            case 3:
                listSortByNewest = sortByLikes(arrayList3);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (listSortByNewest.isEmpty()) {
            if (this.currentSearchQuery.length() > 0) {
                str = "По запросу \"" + this.currentSearchQuery + "\" ничего не найдено";
            } else {
                str = this.currentTabType == TabType.ALL_BUILDS ? "Нет доступных сборок" : "У вас пока нет установленных сборок";
            }
            showEmptyState(str);
            return;
        }
        hideEmptyState();
        switch (WhenMappings.$EnumSwitchMapping$2[reason.ordinal()]) {
            case 1:
            case 2:
                scrollAnchorCaptureScrollAnchor = captureScrollAnchor();
                break;
            default:
                scrollAnchorCaptureScrollAnchor = sborksAdapter;
                break;
        }
        SborksAdapter sborksAdapter2 = this.adapter;
        if (sborksAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            sborksAdapter = sborksAdapter2;
        }
        sborksAdapter.submitList(listSortByNewest, new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                NeizzirSborksFragment.applyFilters$lambda$7(reason, this, scrollAnchorCaptureScrollAnchor);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyFilters$lambda$7(ListUpdateReason reason, NeizzirSborksFragment this$0, ScrollAnchor $anchor) {
        Intrinsics.checkNotNullParameter(reason, "$reason");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        switch (WhenMappings.$EnumSwitchMapping$2[reason.ordinal()]) {
            case 1:
            case 2:
                this$0.restoreScrollAnchor($anchor);
                break;
            case 3:
                RecyclerView recyclerView = this$0.list;
                if (recyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("list");
                    recyclerView = null;
                }
                recyclerView.scrollToPosition(0);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showEmptyState(String message) {
        LinearLayout container;
        View $this$isVisible$iv = this.list;
        if ($this$isVisible$iv == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
            $this$isVisible$iv = null;
        }
        $this$isVisible$iv.setVisibility(8);
        View $this$isVisible$iv2 = getView();
        if ($this$isVisible$iv2 == null || (container = (LinearLayout) $this$isVisible$iv2.findViewById(C3715R.id.neizzir20_empty_container)) == null) {
            return;
        }
        container.setVisibility(0);
        TextView textView = (TextView) container.findViewById(C3715R.id.neizzir16_DelCarSnow);
        if (textView != null) {
            textView.setText(message);
        }
        SborksDesignHelper.Companion.fadeIn$default(SborksDesignHelper.INSTANCE, container, 0L, 2, null);
    }

    private final void hideEmptyState() {
        View $this$isVisible$iv = this.list;
        if ($this$isVisible$iv == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
            $this$isVisible$iv = null;
        }
        $this$isVisible$iv.setVisibility(0);
        View $this$isVisible$iv2 = getView();
        View $this$isVisible$iv3 = $this$isVisible$iv2 != null ? (LinearLayout) $this$isVisible$iv2.findViewById(C3715R.id.neizzir20_empty_container) : null;
        if ($this$isVisible$iv3 == null) {
            return;
        }
        $this$isVisible$iv3.setVisibility(8);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$sortByNewest$1 */
    /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    /* synthetic */ class C55611 extends FunctionReferenceImpl implements Function1<String, Date> {
        C55611(Object obj) {
            super(1, obj, NeizzirSborksFragment.class, "parseDate", "parseDate(Ljava/lang/String;)Ljava/util/Date;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Date invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((NeizzirSborksFragment) this.receiver).parseDate(p0);
        }
    }

    private final List<FolderData> sortByNewest(List<FolderData> list) {
        return SborksNewestSupport.INSTANCE.sortByNewest(list, this.createdDatesCache, new C55611(this));
    }

    private final List<FolderData> sortByNewestLegacy(List<FolderData> list) {
        final Function2<FolderData, FolderData, Integer> function2 = new Function2<FolderData, FolderData, Integer>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment.sortByNewestLegacy.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(FolderData a2, FolderData b) {
                int iCompareTo;
                Date dateA = (Date) NeizzirSborksFragment.this.createdDatesCache.get(a2.getFolderName());
                Date dateB = (Date) NeizzirSborksFragment.this.createdDatesCache.get(b.getFolderName());
                if (dateA == null || dateB == null) {
                    iCompareTo = -1;
                    if (dateA == null) {
                        if (dateB == null) {
                            Date updateDateA = NeizzirSborksFragment.this.parseDate(a2.getUpdateDate());
                            Date updateDateB = NeizzirSborksFragment.this.parseDate(b.getUpdateDate());
                            if (updateDateA != null && updateDateB != null) {
                                iCompareTo = updateDateB.compareTo(updateDateA);
                            } else if (updateDateA == null) {
                                iCompareTo = updateDateB != null ? 1 : 0;
                            }
                        } else {
                            iCompareTo = 1;
                        }
                    }
                } else {
                    iCompareTo = dateB.compareTo(dateA);
                }
                return Integer.valueOf(iCompareTo);
            }
        };
        return CollectionsKt___CollectionsKt.sortedWith(list, new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return NeizzirSborksFragment.sortByNewestLegacy$lambda$9(function2, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByNewestLegacy$lambda$9(Function2 tmp0, Object p0, Object p1) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(p0, p1)).intValue();
    }

    private final List<FolderData> sortByDownloads(List<FolderData> list) {
        final C55591 c55591 = new Function2<FolderData, FolderData, Integer>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment.sortByDownloads.1
            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(FolderData a2, FolderData b) {
                if (a2.isNew() != b.isNew()) {
                    return Integer.valueOf(a2.isNew() ? -1 : 1);
                }
                return Integer.valueOf(Intrinsics.compare(b.getDownloadCount(), a2.getDownloadCount()));
            }
        };
        return CollectionsKt___CollectionsKt.sortedWith(list, new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$$ExternalSyntheticLambda8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return NeizzirSborksFragment.sortByDownloads$lambda$10(c55591, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByDownloads$lambda$10(Function2 tmp0, Object p0, Object p1) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(p0, p1)).intValue();
    }

    private final List<FolderData> sortByLikes(List<FolderData> list) {
        final C55601 c55601 = new Function2<FolderData, FolderData, Integer>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment.sortByLikes.1
            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(FolderData a2, FolderData b) {
                if (a2.isNew() != b.isNew()) {
                    return Integer.valueOf(a2.isNew() ? -1 : 1);
                }
                return Integer.valueOf(Intrinsics.compare(b.getLikeCount(), a2.getLikeCount()));
            }
        };
        return CollectionsKt___CollectionsKt.sortedWith(list, new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$$ExternalSyntheticLambda7
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return NeizzirSborksFragment.sortByLikes$lambda$11(c55601, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByLikes$lambda$11(Function2 tmp0, Object p0, Object p1) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(p0, p1)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Date parseDate(String dateStr) {
        Date date = null;
        if (StringsKt__StringsKt.isBlank(dateStr)) {
            return null;
        }
        String[] patterns = {"dd.MM.yyyy HH:mm", "dd.MM.'20'yy HH:mm"};
        for (String p : patterns) {
            try {
                SimpleDateFormat f = new SimpleDateFormat(p, Locale.getDefault());
                f.setLenient(false);
                return f.parse(dateStr);
            } catch (Exception e) {
            }
        }
        return date;
    }

    private final void fetchFolders() {
        LinearLayout linearLayout = this.loadingContainer;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        RecyclerView recyclerView = this.list;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
            recyclerView = null;
        }
        recyclerView.setVisibility(8);
        LinearLayout linearLayout2 = this.emptyContainer;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        resetCreatedDatesState();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C55401(null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$fetchFolders$1 */
    /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$fetchFolders$1", m4426f = "NeizzirSborksFragment.kt", m4427i = {0, 1}, m4428l = {458, 475, 500}, m4429m = "invokeSuspend", m4430n = {"$this$launch", "baseList"}, m4431s = {"L$0", "L$0"})
    static final class C55401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C55401(Continuation<? super C55401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C55401 c55401 = NeizzirSborksFragment.this.new C55401(continuation);
            c55401.L$0 = obj;
            return c55401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x02b5 A[Catch: Exception -> 0x02de, TryCatch #1 {Exception -> 0x02de, blocks: (B:94:0x026e, B:95:0x028d, B:99:0x02ad, B:101:0x02b5, B:102:0x02b9, B:104:0x02c7, B:106:0x02cd, B:98:0x02a8), top: B:123:0x026e }] */
        /* JADX WARN: Code duplicated, block: B:104:0x02c7 A[Catch: Exception -> 0x02de, TryCatch #1 {Exception -> 0x02de, blocks: (B:94:0x026e, B:95:0x028d, B:99:0x02ad, B:101:0x02b5, B:102:0x02b9, B:104:0x02c7, B:106:0x02cd, B:98:0x02a8), top: B:123:0x026e }] */
        /* JADX WARN: Code duplicated, block: B:105:0x02cc  */
        /* JADX WARN: Code duplicated, block: B:117:0x02f3  */
        /* JADX WARN: Code duplicated, block: B:141:0x01b8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:26:0x007c A[Catch: Exception -> 0x021f, TRY_LEAVE, TryCatch #0 {Exception -> 0x021f, blocks: (B:24:0x006c, B:26:0x007c), top: B:121:0x006c }] */
        /* JADX WARN: Code duplicated, block: B:32:0x00fb A[Catch: Exception -> 0x021b, LOOP:3: B:30:0x00f5->B:32:0x00fb, LOOP_END, TryCatch #2 {Exception -> 0x021b, blocks: (B:44:0x013a, B:48:0x0147, B:50:0x014f, B:51:0x0165, B:53:0x016b, B:55:0x0180, B:59:0x01a6, B:62:0x01b8, B:63:0x01bd, B:65:0x01c4, B:69:0x01df, B:71:0x01e7, B:72:0x01eb, B:74:0x01f9, B:75:0x01fd, B:77:0x0214, B:68:0x01da, B:47:0x0141, B:28:0x00ac, B:29:0x00d8, B:30:0x00f5, B:32:0x00fb, B:33:0x010b), top: B:125:0x00ac }] */
        /* JADX WARN: Code duplicated, block: B:36:0x0122 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:37:0x0123  */
        /* JADX WARN: Code duplicated, block: B:46:0x0140  */
        /* JADX WARN: Code duplicated, block: B:47:0x0141 A[Catch: Exception -> 0x021b, TryCatch #2 {Exception -> 0x021b, blocks: (B:44:0x013a, B:48:0x0147, B:50:0x014f, B:51:0x0165, B:53:0x016b, B:55:0x0180, B:59:0x01a6, B:62:0x01b8, B:63:0x01bd, B:65:0x01c4, B:69:0x01df, B:71:0x01e7, B:72:0x01eb, B:74:0x01f9, B:75:0x01fd, B:77:0x0214, B:68:0x01da, B:47:0x0141, B:28:0x00ac, B:29:0x00d8, B:30:0x00f5, B:32:0x00fb, B:33:0x010b), top: B:125:0x00ac }] */
        /* JADX WARN: Code duplicated, block: B:50:0x014f A[Catch: Exception -> 0x021b, TryCatch #2 {Exception -> 0x021b, blocks: (B:44:0x013a, B:48:0x0147, B:50:0x014f, B:51:0x0165, B:53:0x016b, B:55:0x0180, B:59:0x01a6, B:62:0x01b8, B:63:0x01bd, B:65:0x01c4, B:69:0x01df, B:71:0x01e7, B:72:0x01eb, B:74:0x01f9, B:75:0x01fd, B:77:0x0214, B:68:0x01da, B:47:0x0141, B:28:0x00ac, B:29:0x00d8, B:30:0x00f5, B:32:0x00fb, B:33:0x010b), top: B:125:0x00ac }] */
        /* JADX WARN: Code duplicated, block: B:53:0x016b A[Catch: Exception -> 0x021b, TryCatch #2 {Exception -> 0x021b, blocks: (B:44:0x013a, B:48:0x0147, B:50:0x014f, B:51:0x0165, B:53:0x016b, B:55:0x0180, B:59:0x01a6, B:62:0x01b8, B:63:0x01bd, B:65:0x01c4, B:69:0x01df, B:71:0x01e7, B:72:0x01eb, B:74:0x01f9, B:75:0x01fd, B:77:0x0214, B:68:0x01da, B:47:0x0141, B:28:0x00ac, B:29:0x00d8, B:30:0x00f5, B:32:0x00fb, B:33:0x010b), top: B:125:0x00ac }] */
        /* JADX WARN: Code duplicated, block: B:55:0x0180 A[Catch: Exception -> 0x021b, TryCatch #2 {Exception -> 0x021b, blocks: (B:44:0x013a, B:48:0x0147, B:50:0x014f, B:51:0x0165, B:53:0x016b, B:55:0x0180, B:59:0x01a6, B:62:0x01b8, B:63:0x01bd, B:65:0x01c4, B:69:0x01df, B:71:0x01e7, B:72:0x01eb, B:74:0x01f9, B:75:0x01fd, B:77:0x0214, B:68:0x01da, B:47:0x0141, B:28:0x00ac, B:29:0x00d8, B:30:0x00f5, B:32:0x00fb, B:33:0x010b), top: B:125:0x00ac }] */
        /* JADX WARN: Code duplicated, block: B:57:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:58:0x01a4  */
        /* JADX WARN: Code duplicated, block: B:61:0x01b6  */
        /* JADX WARN: Code duplicated, block: B:67:0x01d9  */
        /* JADX WARN: Code duplicated, block: B:68:0x01da A[Catch: Exception -> 0x021b, TryCatch #2 {Exception -> 0x021b, blocks: (B:44:0x013a, B:48:0x0147, B:50:0x014f, B:51:0x0165, B:53:0x016b, B:55:0x0180, B:59:0x01a6, B:62:0x01b8, B:63:0x01bd, B:65:0x01c4, B:69:0x01df, B:71:0x01e7, B:72:0x01eb, B:74:0x01f9, B:75:0x01fd, B:77:0x0214, B:68:0x01da, B:47:0x0141, B:28:0x00ac, B:29:0x00d8, B:30:0x00f5, B:32:0x00fb, B:33:0x010b), top: B:125:0x00ac }] */
        /* JADX WARN: Code duplicated, block: B:71:0x01e7 A[Catch: Exception -> 0x021b, TryCatch #2 {Exception -> 0x021b, blocks: (B:44:0x013a, B:48:0x0147, B:50:0x014f, B:51:0x0165, B:53:0x016b, B:55:0x0180, B:59:0x01a6, B:62:0x01b8, B:63:0x01bd, B:65:0x01c4, B:69:0x01df, B:71:0x01e7, B:72:0x01eb, B:74:0x01f9, B:75:0x01fd, B:77:0x0214, B:68:0x01da, B:47:0x0141, B:28:0x00ac, B:29:0x00d8, B:30:0x00f5, B:32:0x00fb, B:33:0x010b), top: B:125:0x00ac }] */
        /* JADX WARN: Code duplicated, block: B:74:0x01f9 A[Catch: Exception -> 0x021b, TryCatch #2 {Exception -> 0x021b, blocks: (B:44:0x013a, B:48:0x0147, B:50:0x014f, B:51:0x0165, B:53:0x016b, B:55:0x0180, B:59:0x01a6, B:62:0x01b8, B:63:0x01bd, B:65:0x01c4, B:69:0x01df, B:71:0x01e7, B:72:0x01eb, B:74:0x01f9, B:75:0x01fd, B:77:0x0214, B:68:0x01da, B:47:0x0141, B:28:0x00ac, B:29:0x00d8, B:30:0x00f5, B:32:0x00fb, B:33:0x010b), top: B:125:0x00ac }] */
        /* JADX WARN: Code duplicated, block: B:77:0x0214 A[Catch: Exception -> 0x021b, TRY_LEAVE, TryCatch #2 {Exception -> 0x021b, blocks: (B:44:0x013a, B:48:0x0147, B:50:0x014f, B:51:0x0165, B:53:0x016b, B:55:0x0180, B:59:0x01a6, B:62:0x01b8, B:63:0x01bd, B:65:0x01c4, B:69:0x01df, B:71:0x01e7, B:72:0x01eb, B:74:0x01f9, B:75:0x01fd, B:77:0x0214, B:68:0x01da, B:47:0x0141, B:28:0x00ac, B:29:0x00d8, B:30:0x00f5, B:32:0x00fb, B:33:0x010b), top: B:125:0x00ac }] */
        /* JADX WARN: Code duplicated, block: B:88:0x0239 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:89:0x023a  */
        /* JADX WARN: Code duplicated, block: B:92:0x024e A[Catch: Exception -> 0x02e2, TRY_LEAVE, TryCatch #8 {Exception -> 0x02e2, blocks: (B:90:0x023d, B:92:0x024e), top: B:136:0x023d }] */
        /* JADX WARN: Code duplicated, block: B:97:0x02a7  */
        /* JADX WARN: Code duplicated, block: B:98:0x02a8 A[Catch: Exception -> 0x02de, TryCatch #1 {Exception -> 0x02de, blocks: (B:94:0x026e, B:95:0x028d, B:99:0x02ad, B:101:0x02b5, B:102:0x02b9, B:104:0x02c7, B:106:0x02cd, B:98:0x02a8), top: B:123:0x026e }] */
        /* JADX WARN: Not initialized variable reg: 14, insn: 0x0226: MOVE (r4 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY] A[D('$result' java.lang.Object)]), block:B:84:0x0226 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object $result2;
            Object $result3;
            C55401 c55401;
            C55401 c55402;
            Object objListFolders;
            Object $result4;
            LinearLayout linearLayout;
            JSONArray raw;
            int length;
            NeizzirSborksFragment neizzirSborksFragment;
            ArrayList arrayList;
            int i;
            Object $result5;
            LinearLayout linearLayout2;
            RecyclerView recyclerView;
            RecyclerView recyclerView2;
            RecyclerView recyclerView3;
            CoroutineScope $this$launch;
            Object $result6;
            Object $result7;
            JSONArray raw2;
            int length2;
            NeizzirSborksFragment neizzirSborksFragment2;
            ArrayList arrayList2;
            int i2;
            Object $result8;
            List baseList;
            Collection destination$iv$iv;
            Object $result9;
            Throwable th;
            Object objM15551constructorimpl;
            Map stats;
            LinearLayout linearLayout3;
            RecyclerView recyclerView4;
            RecyclerView recyclerView5;
            Collection destination$iv$iv2;
            FolderData f;
            Triple triple;
            FolderData folderDataCopy$default;
            boolean hv;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            String str = "Дата не указана";
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        c55401 = this;
                        $this$launch = (CoroutineScope) c55401.L$0;
                        c55401.L$0 = $this$launch;
                        c55401.label = 1;
                        Object objListFolders2 = SborksApi.INSTANCE.listFolders(c55401);
                        if (objListFolders2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        $result6 = objListFolders2;
                        $result7 = $result;
                        try {
                            raw2 = (JSONArray) $result6;
                            length2 = raw2.length();
                            neizzirSborksFragment2 = NeizzirSborksFragment.this;
                            arrayList2 = new ArrayList(length2);
                            i2 = 0;
                            while (i2 < length2) {
                                int i3 = i2;
                                JSONObject js = raw2.getJSONObject(i3);
                                String name = js.getString("folder_name");
                                String upd = js.optString("update_date", "Дата не указана");
                                CoroutineScope $this$launch2 = $this$launch;
                                Intrinsics.checkNotNull(name);
                                Intrinsics.checkNotNull(upd);
                                $result8 = $result7;
                                try {
                                    FolderData folderData = new FolderData(name, upd, 0, NeizzirSborksFragment.isNewByUpdate$default(neizzirSborksFragment2, upd, 0, 2, null), 0, false);
                                    neizzirSborksFragment2.lastUpdate.put(name, upd);
                                    arrayList2.add(folderData);
                                    i2++;
                                    $this$launch = $this$launch2;
                                    $result7 = $result8;
                                } catch (Exception e) {
                                    $result3 = $result8;
                                    try {
                                        c55401.L$0 = null;
                                        c55401.label = 3;
                                        objListFolders = SborksApi.INSTANCE.listFolders(c55401);
                                        if (objListFolders == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        $result4 = $result3;
                                        c55402 = c55401;
                                        $result3 = objListFolders;
                                        try {
                                            raw = (JSONArray) $result3;
                                            length = raw.length();
                                            neizzirSborksFragment = NeizzirSborksFragment.this;
                                            arrayList = new ArrayList(length);
                                            i = 0;
                                            while (i < length) {
                                                int i4 = i;
                                                JSONObject js2 = raw.getJSONObject(i4);
                                                String name2 = js2.getString("folder_name");
                                                String upd2 = js2.optString("update_date", str);
                                                Intrinsics.checkNotNull(name2);
                                                Intrinsics.checkNotNull(upd2);
                                                $result5 = $result4;
                                                String str2 = str;
                                                int i5 = length;
                                                try {
                                                    arrayList.add(new FolderData(name2, upd2, 0, NeizzirSborksFragment.isNewByUpdate$default(neizzirSborksFragment, upd2, 0, 2, null), 0, false));
                                                    i++;
                                                    $result4 = $result5;
                                                    str = str2;
                                                    length = i5;
                                                } catch (Exception e2) {
                                                    $result3 = $result5;
                                                    linearLayout = NeizzirSborksFragment.this.loadingContainer;
                                                    if (linearLayout != null) {
                                                        linearLayout.setVisibility(8);
                                                    }
                                                    NeizzirSborksFragment.this.showEmptyState("Ошибка загрузки. Проверьте Интернет/VPN");
                                                    Toast.makeText(NeizzirSborksFragment.this.requireContext(), "Проверьте Интернет/VPN", 1).show();
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                            $result5 = $result4;
                                            ArrayList fallback = arrayList;
                                            NeizzirSborksFragment.this.allFolders = fallback;
                                            NeizzirSborksFragment.this.applyFilters(ListUpdateReason.INITIAL_LOAD);
                                            linearLayout2 = NeizzirSborksFragment.this.loadingContainer;
                                            if (linearLayout2 != null) {
                                                linearLayout2.setVisibility(8);
                                            }
                                            recyclerView = NeizzirSborksFragment.this.list;
                                            if (recyclerView == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("list");
                                                recyclerView = null;
                                            }
                                            recyclerView.setVisibility(0);
                                            SborksDesignHelper.Companion companion = SborksDesignHelper.INSTANCE;
                                            recyclerView2 = NeizzirSborksFragment.this.list;
                                            if (recyclerView2 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("list");
                                                recyclerView3 = null;
                                            } else {
                                                recyclerView3 = recyclerView2;
                                            }
                                            SborksDesignHelper.Companion.fadeIn$default(companion, recyclerView3, 0L, 2, null);
                                        } catch (Exception e3) {
                                            $result3 = $result4;
                                        }
                                        return Unit.INSTANCE;
                                    } catch (Exception e4) {
                                        c55402 = c55401;
                                        linearLayout = NeizzirSborksFragment.this.loadingContainer;
                                        if (linearLayout != null) {
                                            linearLayout.setVisibility(8);
                                        }
                                        NeizzirSborksFragment.this.showEmptyState("Ошибка загрузки. Проверьте Интернет/VPN");
                                        Toast.makeText(NeizzirSborksFragment.this.requireContext(), "Проверьте Интернет/VPN", 1).show();
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                            $result8 = $result7;
                            baseList = arrayList2;
                            List $this$map$iv = baseList;
                            destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
                            for (Object item$iv$iv : $this$map$iv) {
                                FolderData it = (FolderData) item$iv$iv;
                                destination$iv$iv.add(it.getFolderName());
                            }
                            List names = (List) destination$iv$iv;
                            try {
                                Result.Companion companion2 = Result.INSTANCE;
                                SborksApi sborksApi = SborksApi.INSTANCE;
                                c55401.L$0 = baseList;
                                c55401.label = 2;
                                $result9 = sborksApi.batchStats(names, c55401);
                                if ($result9 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                objM15551constructorimpl = Result.m15551constructorimpl((Map) $result9);
                                if (Result.m15554exceptionOrNullimpl(objM15551constructorimpl) != null) {
                                    objM15551constructorimpl = MapsKt__MapsKt.emptyMap();
                                }
                                stats = (Map) objM15551constructorimpl;
                                if (!stats.isEmpty()) {
                                    Iterable $this$map$iv2 = baseList;
                                    destination$iv$iv2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv2, 10));
                                    for (Object item$iv$iv2 : $this$map$iv2) {
                                        f = (FolderData) item$iv$iv2;
                                        triple = (Triple) stats.get(f.getFolderName());
                                        if (triple != null) {
                                            int iIntValue = ((Number) triple.component1()).intValue();
                                            int iIntValue2 = ((Number) triple.component2()).intValue();
                                            hv = ((Boolean) triple.component3()).booleanValue();
                                            if (hv) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            folderDataCopy$default = FolderData.copy$default(f, null, null, iIntValue, false, iIntValue2, z, 11, null);
                                            if (folderDataCopy$default == null) {
                                                folderDataCopy$default = f;
                                            }
                                        } else {
                                            folderDataCopy$default = f;
                                        }
                                        destination$iv$iv2.add(folderDataCopy$default);
                                    }
                                    baseList = (List) destination$iv$iv2;
                                }
                                List enriched = baseList;
                                NeizzirSborksFragment.this.allFolders = enriched;
                                NeizzirSborksFragment.this.applyFilters(ListUpdateReason.INITIAL_LOAD);
                                linearLayout3 = NeizzirSborksFragment.this.loadingContainer;
                                if (linearLayout3 != null) {
                                    linearLayout3.setVisibility(8);
                                }
                                recyclerView4 = NeizzirSborksFragment.this.list;
                                if (recyclerView4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("list");
                                    recyclerView4 = null;
                                }
                                recyclerView4.setVisibility(0);
                                SborksDesignHelper.Companion companion3 = SborksDesignHelper.INSTANCE;
                                recyclerView5 = NeizzirSborksFragment.this.list;
                                if (recyclerView5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("list");
                                    recyclerView5 = null;
                                }
                                SborksDesignHelper.Companion.fadeIn$default(companion3, recyclerView5, 0L, 2, null);
                                if (NeizzirSborksFragment.this.currentSortType == SortType.NEWEST) {
                                    NeizzirSborksFragment.this.loadDatesInBackground();
                                    break;
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                $result9 = $result8;
                                Result.Companion companion4 = Result.INSTANCE;
                                objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                                $result8 = $result9;
                            }
                        } catch (Exception e5) {
                            $result3 = $result7;
                            c55401.L$0 = null;
                            c55401.label = 3;
                            objListFolders = SborksApi.INSTANCE.listFolders(c55401);
                            if (objListFolders == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            $result4 = $result3;
                            c55402 = c55401;
                            $result3 = objListFolders;
                            raw = (JSONArray) $result3;
                            length = raw.length();
                            neizzirSborksFragment = NeizzirSborksFragment.this;
                            arrayList = new ArrayList(length);
                            i = 0;
                            while (i < length) {
                                int i6 = i;
                                JSONObject js3 = raw.getJSONObject(i6);
                                String name3 = js3.getString("folder_name");
                                String upd3 = js3.optString("update_date", str);
                                Intrinsics.checkNotNull(name3);
                                Intrinsics.checkNotNull(upd3);
                                $result5 = $result4;
                                String str3 = str;
                                int i7 = length;
                                arrayList.add(new FolderData(name3, upd3, 0, NeizzirSborksFragment.isNewByUpdate$default(neizzirSborksFragment, upd3, 0, 2, null), 0, false));
                                i++;
                                $result4 = $result5;
                                str = str3;
                                length = i7;
                            }
                            $result5 = $result4;
                            ArrayList fallback2 = arrayList;
                            NeizzirSborksFragment.this.allFolders = fallback2;
                            NeizzirSborksFragment.this.applyFilters(ListUpdateReason.INITIAL_LOAD);
                            linearLayout2 = NeizzirSborksFragment.this.loadingContainer;
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(8);
                            }
                            recyclerView = NeizzirSborksFragment.this.list;
                            if (recyclerView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("list");
                                recyclerView = null;
                            }
                            recyclerView.setVisibility(0);
                            SborksDesignHelper.Companion companion5 = SborksDesignHelper.INSTANCE;
                            recyclerView2 = NeizzirSborksFragment.this.list;
                            if (recyclerView2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("list");
                                recyclerView3 = null;
                            } else {
                                recyclerView3 = recyclerView2;
                            }
                            SborksDesignHelper.Companion.fadeIn$default(companion5, recyclerView3, 0L, 2, null);
                        }
                        break;
                    case 1:
                        c55401 = this;
                        $result6 = $result;
                        $this$launch = (CoroutineScope) c55401.L$0;
                        ResultKt.throwOnFailure($result6);
                        $result7 = $result6;
                        raw2 = (JSONArray) $result6;
                        length2 = raw2.length();
                        neizzirSborksFragment2 = NeizzirSborksFragment.this;
                        arrayList2 = new ArrayList(length2);
                        i2 = 0;
                        while (i2 < length2) {
                            int i8 = i2;
                            JSONObject js4 = raw2.getJSONObject(i8);
                            String name4 = js4.getString("folder_name");
                            String upd4 = js4.optString("update_date", "Дата не указана");
                            CoroutineScope $this$launch3 = $this$launch;
                            Intrinsics.checkNotNull(name4);
                            Intrinsics.checkNotNull(upd4);
                            $result8 = $result7;
                            FolderData folderData2 = new FolderData(name4, upd4, 0, NeizzirSborksFragment.isNewByUpdate$default(neizzirSborksFragment2, upd4, 0, 2, null), 0, false);
                            neizzirSborksFragment2.lastUpdate.put(name4, upd4);
                            arrayList2.add(folderData2);
                            i2++;
                            $this$launch = $this$launch3;
                            $result7 = $result8;
                        }
                        $result8 = $result7;
                        baseList = arrayList2;
                        List $this$map$iv3 = baseList;
                        destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv3, 10));
                        while (r8.hasNext()) {
                            FolderData it2 = (FolderData) item$iv$iv;
                            destination$iv$iv.add(it2.getFolderName());
                        }
                        List names2 = (List) destination$iv$iv;
                        Result.Companion companion6 = Result.INSTANCE;
                        SborksApi sborksApi2 = SborksApi.INSTANCE;
                        c55401.L$0 = baseList;
                        c55401.label = 2;
                        $result9 = sborksApi2.batchStats(names2, c55401);
                        if ($result9 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objM15551constructorimpl = Result.m15551constructorimpl((Map) $result9);
                        if (Result.m15554exceptionOrNullimpl(objM15551constructorimpl) != null) {
                            objM15551constructorimpl = MapsKt__MapsKt.emptyMap();
                        }
                        stats = (Map) objM15551constructorimpl;
                        if (!stats.isEmpty()) {
                            Iterable $this$map$iv4 = baseList;
                            destination$iv$iv2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv4, 10));
                            while (r10.hasNext()) {
                                f = (FolderData) item$iv$iv2;
                                triple = (Triple) stats.get(f.getFolderName());
                                if (triple != null) {
                                    int iIntValue3 = ((Number) triple.component1()).intValue();
                                    int iIntValue4 = ((Number) triple.component2()).intValue();
                                    hv = ((Boolean) triple.component3()).booleanValue();
                                    if (hv) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    folderDataCopy$default = FolderData.copy$default(f, null, null, iIntValue3, false, iIntValue4, z, 11, null);
                                    if (folderDataCopy$default == null) {
                                        folderDataCopy$default = f;
                                    }
                                } else {
                                    folderDataCopy$default = f;
                                }
                                destination$iv$iv2.add(folderDataCopy$default);
                            }
                            baseList = (List) destination$iv$iv2;
                        }
                        List enriched2 = baseList;
                        NeizzirSborksFragment.this.allFolders = enriched2;
                        NeizzirSborksFragment.this.applyFilters(ListUpdateReason.INITIAL_LOAD);
                        linearLayout3 = NeizzirSborksFragment.this.loadingContainer;
                        if (linearLayout3 != null) {
                            linearLayout3.setVisibility(8);
                        }
                        recyclerView4 = NeizzirSborksFragment.this.list;
                        if (recyclerView4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("list");
                            recyclerView4 = null;
                        }
                        recyclerView4.setVisibility(0);
                        SborksDesignHelper.Companion companion7 = SborksDesignHelper.INSTANCE;
                        recyclerView5 = NeizzirSborksFragment.this.list;
                        if (recyclerView5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("list");
                            recyclerView5 = null;
                        }
                        SborksDesignHelper.Companion.fadeIn$default(companion7, recyclerView5, 0L, 2, null);
                        if (NeizzirSborksFragment.this.currentSortType == SortType.NEWEST) {
                            NeizzirSborksFragment.this.loadDatesInBackground();
                            break;
                        }
                        return Unit.INSTANCE;
                    case 2:
                        c55401 = this;
                        $result9 = $result;
                        baseList = (List) c55401.L$0;
                        try {
                            ResultKt.throwOnFailure($result9);
                            $result8 = $result9;
                            objM15551constructorimpl = Result.m15551constructorimpl((Map) $result9);
                            break;
                        } catch (Throwable th3) {
                            th = th3;
                            Result.Companion companion8 = Result.INSTANCE;
                            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                            $result8 = $result9;
                        }
                        if (Result.m15554exceptionOrNullimpl(objM15551constructorimpl) != null) {
                            objM15551constructorimpl = MapsKt__MapsKt.emptyMap();
                        }
                        stats = (Map) objM15551constructorimpl;
                        if (!stats.isEmpty()) {
                            Iterable $this$map$iv5 = baseList;
                            destination$iv$iv2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv5, 10));
                            while (r10.hasNext()) {
                                f = (FolderData) item$iv$iv2;
                                triple = (Triple) stats.get(f.getFolderName());
                                if (triple != null) {
                                    int iIntValue5 = ((Number) triple.component1()).intValue();
                                    int iIntValue6 = ((Number) triple.component2()).intValue();
                                    hv = ((Boolean) triple.component3()).booleanValue();
                                    if (hv) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    folderDataCopy$default = FolderData.copy$default(f, null, null, iIntValue5, false, iIntValue6, z, 11, null);
                                    if (folderDataCopy$default == null) {
                                        folderDataCopy$default = f;
                                    }
                                } else {
                                    folderDataCopy$default = f;
                                }
                                destination$iv$iv2.add(folderDataCopy$default);
                            }
                            baseList = (List) destination$iv$iv2;
                        }
                        List enriched3 = baseList;
                        NeizzirSborksFragment.this.allFolders = enriched3;
                        NeizzirSborksFragment.this.applyFilters(ListUpdateReason.INITIAL_LOAD);
                        linearLayout3 = NeizzirSborksFragment.this.loadingContainer;
                        if (linearLayout3 != null) {
                            linearLayout3.setVisibility(8);
                        }
                        recyclerView4 = NeizzirSborksFragment.this.list;
                        if (recyclerView4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("list");
                            recyclerView4 = null;
                        }
                        recyclerView4.setVisibility(0);
                        SborksDesignHelper.Companion companion9 = SborksDesignHelper.INSTANCE;
                        recyclerView5 = NeizzirSborksFragment.this.list;
                        if (recyclerView5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("list");
                            recyclerView5 = null;
                        }
                        SborksDesignHelper.Companion.fadeIn$default(companion9, recyclerView5, 0L, 2, null);
                        if (NeizzirSborksFragment.this.currentSortType == SortType.NEWEST) {
                            NeizzirSborksFragment.this.loadDatesInBackground();
                            break;
                        }
                        return Unit.INSTANCE;
                    case 3:
                        c55402 = this;
                        $result3 = $result;
                        try {
                            ResultKt.throwOnFailure($result3);
                            $result4 = $result3;
                            raw = (JSONArray) $result3;
                            length = raw.length();
                            neizzirSborksFragment = NeizzirSborksFragment.this;
                            arrayList = new ArrayList(length);
                            i = 0;
                            while (i < length) {
                                int i9 = i;
                                JSONObject js5 = raw.getJSONObject(i9);
                                String name5 = js5.getString("folder_name");
                                String upd5 = js5.optString("update_date", str);
                                Intrinsics.checkNotNull(name5);
                                Intrinsics.checkNotNull(upd5);
                                $result5 = $result4;
                                String str4 = str;
                                int i10 = length;
                                arrayList.add(new FolderData(name5, upd5, 0, NeizzirSborksFragment.isNewByUpdate$default(neizzirSborksFragment, upd5, 0, 2, null), 0, false));
                                i++;
                                $result4 = $result5;
                                str = str4;
                                length = i10;
                            }
                            $result5 = $result4;
                            ArrayList fallback3 = arrayList;
                            NeizzirSborksFragment.this.allFolders = fallback3;
                            NeizzirSborksFragment.this.applyFilters(ListUpdateReason.INITIAL_LOAD);
                            linearLayout2 = NeizzirSborksFragment.this.loadingContainer;
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(8);
                            }
                            recyclerView = NeizzirSborksFragment.this.list;
                            if (recyclerView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("list");
                                recyclerView = null;
                            }
                            recyclerView.setVisibility(0);
                            SborksDesignHelper.Companion companion10 = SborksDesignHelper.INSTANCE;
                            recyclerView2 = NeizzirSborksFragment.this.list;
                            if (recyclerView2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("list");
                                recyclerView3 = null;
                            } else {
                                recyclerView3 = recyclerView2;
                            }
                            SborksDesignHelper.Companion.fadeIn$default(companion10, recyclerView3, 0L, 2, null);
                        } catch (Exception e6) {
                            linearLayout = NeizzirSborksFragment.this.loadingContainer;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                            }
                            NeizzirSborksFragment.this.showEmptyState("Ошибка загрузки. Проверьте Интернет/VPN");
                            Toast.makeText(NeizzirSborksFragment.this.requireContext(), "Проверьте Интернет/VPN", 1).show();
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e7) {
                $result3 = $result2;
            }
        }
    }

    static /* synthetic */ boolean isNewByUpdate$default(NeizzirSborksFragment neizzirSborksFragment, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return neizzirSborksFragment.isNewByUpdate(str, i);
    }

    private final boolean isNewByUpdate(String update, int days) {
        if (StringsKt__StringsKt.isBlank(update)) {
            return false;
        }
        String[] patterns = {"dd.MM.yyyy HH:mm", "dd.MM.'20'yy HH:mm"};
        for (String p : patterns) {
            try {
                SimpleDateFormat f = new SimpleDateFormat(p, Locale.getDefault());
                f.setLenient(false);
                Date date = f.parse(update);
                if (date != null) {
                    long t = date.getTime();
                    long delta = System.currentTimeMillis() - t;
                    if (delta <= ((long) days) * 24 * 60 * 60 * 1000) {
                        return true;
                    }
                }
            } catch (Exception e) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFaqDialog(FolderData folder) {
        String fn = folder.getFolderName();
        String encodedFolder = Uri.encode(fn, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C55541(encodedFolder, fn, this, folder, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFaqDialog$loadAndPlayFromFolder(NeizzirSborksFragment this$0, String relativeFolder) {
        LifecycleOwner viewLifecycleOwner = this$0.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new NeizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1(relativeFolder, this$0, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$showFaqDialog$1 */
    /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$showFaqDialog$1", m4426f = "NeizzirSborksFragment.kt", m4427i = {}, m4428l = {613}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $encodedFolder;
        final /* synthetic */ String $fn;
        final /* synthetic */ FolderData $folder;
        int label;
        final /* synthetic */ NeizzirSborksFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55541(String str, String str2, NeizzirSborksFragment neizzirSborksFragment, FolderData folderData, Continuation<? super C55541> continuation) {
            super(2, continuation);
            this.$encodedFolder = str;
            this.$fn = str2;
            this.this$0 = neizzirSborksFragment;
            this.$folder = folderData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55541(this.$encodedFolder, this.$fn, this.this$0, this.$folder, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C55541 c55541;
            byte[] bArr;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c55541 = this;
                    String str = "/download2/" + c55541.$encodedFolder + "/NEIZZIR/faq.txt";
                    EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                    CachePolicy.LastKnownGood lastKnownGood = new CachePolicy.LastKnownGood("sborks-faq:" + c55541.$fn, 0L, 2, null);
                    NeizzirSborksFragment$showFaqDialog$1$result$1 neizzirSborksFragment$showFaqDialog$1$result$1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$showFaqDialog$1$result$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(byte[] it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Boolean.valueOf(!(it.length == 0));
                        }
                    };
                    c55541.label = 1;
                    Object bytes = router.getBytes(endpointGroup, str, (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : lastKnownGood, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? EndpointRouter.C56582.INSTANCE : neizzirSborksFragment$showFaqDialog$1$result$1, c55541);
                    if (bytes == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = bytes;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c55541 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            NetworkResult result = (NetworkResult) $result;
            String str2 = null;
            NetworkResult.Success success = result instanceof NetworkResult.Success ? (NetworkResult.Success) result : null;
            if (success != null && (bArr = (byte[]) success.getValue()) != null) {
                str2 = new String(bArr, Charsets.UTF_8);
            }
            if (str2 == null) {
                str2 = "";
            }
            String text = str2;
            Dialogs dialogs = Dialogs.INSTANCE;
            Context contextRequireContext = c55541.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            String str3 = c55541.$fn;
            String updateDate = c55541.$folder.getUpdateDate();
            final String str4 = c55541.$encodedFolder;
            final NeizzirSborksFragment neizzirSborksFragment = c55541.this$0;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment.showFaqDialog.1.1
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
                    NeizzirSborksFragment.showFaqDialog$loadAndPlayFromFolder(neizzirSborksFragment, "/download2/" + str4 + "/NEIZZIR");
                }
            };
            final String str5 = c55541.$encodedFolder;
            final NeizzirSborksFragment neizzirSborksFragment2 = c55541.this$0;
            dialogs.showFaqDialog(contextRequireContext, str3, updateDate, text, function0, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment.showFaqDialog.1.2
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
                    NeizzirSborksFragment.showFaqDialog$loadAndPlayFromFolder(neizzirSborksFragment2, "/download2/" + str5 + "/NEIZZIR/GENRL/Bank_006");
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    public final void onDownloadClick(FolderData folder, File localFolder) {
        Object objM15551constructorimpl;
        if (this.isButtonLocked) {
            return;
        }
        this.isButtonLocked = true;
        if (localFolder.exists()) {
            if (!DateUtils.INSTANCE.isUpdateAvailable(localFolder, folder.getUpdateDate())) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    NeizzirSborksFragment neizzirSborksFragment = this;
                    ResourceFileSafety.INSTANCE.requireCompletePack(localFolder);
                    objM15551constructorimpl = Result.m15551constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                }
                if (!Result.m15557isFailureimpl(objM15551constructorimpl)) {
                    if (localFolder.exists()) {
                        installFolder(localFolder);
                    } else {
                        this.selectedFolder = folder.getFolderName();
                        sendAndroidIdToServerAndMaybeDownload(folder.getFolderName());
                    }
                }
            }
            sendAndroidIdToServerAndMaybeDownload(folder.getFolderName());
        } else if (localFolder.exists()) {
            installFolder(localFolder);
        } else {
            this.selectedFolder = folder.getFolderName();
            sendAndroidIdToServerAndMaybeDownload(folder.getFolderName());
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                NeizzirSborksFragment.onDownloadClick$lambda$13(this.f$0);
            }
        }, C2493C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDownloadClick$lambda$13(NeizzirSborksFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isButtonLocked = false;
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$sendAndroidIdToServerAndMaybeDownload$1 */
    /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$sendAndroidIdToServerAndMaybeDownload$1", m4426f = "NeizzirSborksFragment.kt", m4427i = {}, m4428l = {BlackPassUtils.CAR_AWARD_ID_672}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $folderName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55501(String str, Continuation<? super C55501> continuation) {
            super(2, continuation);
            this.$folderName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NeizzirSborksFragment.this.new C55501(this.$folderName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0087 A[Catch: Exception -> 0x00ca, TryCatch #1 {Exception -> 0x00ca, blocks: (B:31:0x0075, B:33:0x0087, B:34:0x0094, B:39:0x00a5, B:40:0x00b7), top: B:54:0x0075 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x0094 A[Catch: Exception -> 0x00ca, TryCatch #1 {Exception -> 0x00ca, blocks: (B:31:0x0075, B:33:0x0087, B:34:0x0094, B:39:0x00a5, B:40:0x00b7), top: B:54:0x0075 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:39:0x00a5 A[Catch: Exception -> 0x00ca, TryCatch #1 {Exception -> 0x00ca, blocks: (B:31:0x0075, B:33:0x0087, B:34:0x0094, B:39:0x00a5, B:40:0x00b7), top: B:54:0x0075 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00b7 A[Catch: Exception -> 0x00ca, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ca, blocks: (B:31:0x0075, B:33:0x0087, B:34:0x0094, B:39:0x00a5, B:40:0x00b7), top: B:54:0x0075 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C55501 c55501;
            C55501 c55502;
            String channelId;
            TextView textView;
            boolean isSub;
            String link;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c55501 = this;
                    try {
                        String keyValue = NeizzirSborksFragment.this.getLauncherKey();
                        String str = keyValue;
                        if (str == null || StringsKt__StringsKt.isBlank(str)) {
                            Toast.makeText(NeizzirSborksFragment.this.requireContext(), "Сначала активируйте ключ в лаунчере", 1).show();
                            return Unit.INSTANCE;
                        }
                        Pair settingsConfig = NeizzirSborksFragment.this.readSettingsConfig(c55501.$folderName);
                        if (settingsConfig == null || (channelId = (String) settingsConfig.getFirst()) == null) {
                            channelId = "";
                        }
                        c55501.label = 1;
                        Object objCheckSubscription = SborksApi.INSTANCE.checkSubscription(c55501.$folderName, keyValue, channelId, c55501);
                        if (objCheckSubscription == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        $result = objCheckSubscription;
                        try {
                            JSONObject json = (JSONObject) $result;
                            isSub = json.optBoolean("is_subscribed", false);
                            link = json.optString("telegram_link");
                            if (isSub) {
                                NeizzirSborksFragment.this.showDownloadDialog();
                                NeizzirSborksFragment.this.startFolderDownload(c55501.$folderName);
                            } else {
                                Intrinsics.checkNotNull(link);
                                if (link.length() > 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    Dialogs dialogs = Dialogs.INSTANCE;
                                    Context contextRequireContext = NeizzirSborksFragment.this.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    dialogs.showSubscriptionDialog(contextRequireContext, link);
                                } else {
                                    Toast.makeText(NeizzirSborksFragment.this.getContext(), "Ссылка на канал не найдена", 0).show();
                                }
                            }
                            break;
                        } catch (Exception e) {
                            $result = $result;
                            c55502 = c55501;
                            Toast.makeText(NeizzirSborksFragment.this.requireContext(), "Включите VPN или Интернет", 1).show();
                            textView = NeizzirSborksFragment.this.progressText;
                            if (textView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("progressText");
                                textView = null;
                            }
                            textView.setText("Ошибка получения списка папок");
                        }
                        return Unit.INSTANCE;
                    } catch (Exception e2) {
                        c55502 = c55501;
                        Toast.makeText(NeizzirSborksFragment.this.requireContext(), "Включите VPN или Интернет", 1).show();
                        textView = NeizzirSborksFragment.this.progressText;
                        if (textView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("progressText");
                            textView = null;
                        }
                        textView.setText("Ошибка получения списка папок");
                        return Unit.INSTANCE;
                    }
                case 1:
                    c55502 = this;
                    try {
                        ResultKt.throwOnFailure($result);
                        c55501 = c55502;
                        JSONObject json2 = (JSONObject) $result;
                        isSub = json2.optBoolean("is_subscribed", false);
                        link = json2.optString("telegram_link");
                        if (isSub) {
                            NeizzirSborksFragment.this.showDownloadDialog();
                            NeizzirSborksFragment.this.startFolderDownload(c55501.$folderName);
                        } else {
                            Intrinsics.checkNotNull(link);
                            if (link.length() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                Dialogs dialogs2 = Dialogs.INSTANCE;
                                Context contextRequireContext2 = NeizzirSborksFragment.this.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                dialogs2.showSubscriptionDialog(contextRequireContext2, link);
                            } else {
                                Toast.makeText(NeizzirSborksFragment.this.getContext(), "Ссылка на канал не найдена", 0).show();
                            }
                        }
                        break;
                    } catch (Exception e3) {
                        Toast.makeText(NeizzirSborksFragment.this.requireContext(), "Включите VPN или Интернет", 1).show();
                        textView = NeizzirSborksFragment.this.progressText;
                        if (textView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("progressText");
                            textView = null;
                        }
                        textView.setText("Ошибка получения списка папок");
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void sendAndroidIdToServerAndMaybeDownload(String folderName) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C55501(folderName, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDownloadDialog() {
        Dialogs dialogs = Dialogs.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.downloadUi = dialogs.createDownloadDialog(contextRequireContext);
        DownloadDialogUi downloadDialogUi = this.downloadUi;
        DownloadDialogUi downloadDialogUi2 = null;
        if (downloadDialogUi == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadUi");
            downloadDialogUi = null;
        }
        downloadDialogUi.getCancelButton().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NeizzirSborksFragment.showDownloadDialog$lambda$14(this.f$0, view);
            }
        });
        DownloadDialogUi downloadDialogUi3 = this.downloadUi;
        if (downloadDialogUi3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadUi");
        } else {
            downloadDialogUi2 = downloadDialogUi3;
        }
        downloadDialogUi2.getDialog().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDownloadDialog$lambda$14(NeizzirSborksFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Job job = this$0.downloadJob;
        DownloadDialogUi downloadDialogUi = null;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        DownloadDialogUi downloadDialogUi2 = this$0.downloadUi;
        if (downloadDialogUi2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadUi");
        } else {
            downloadDialogUi = downloadDialogUi2;
        }
        downloadDialogUi.getDialog().dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getSborks2Dir() throws IOException {
        FileUtils fileUtils = FileUtils.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        File parent = fileUtils.externalFilesParent(contextRequireContext);
        if (parent == null) {
            throw new IOException("Папка загрузки недоступна");
        }
        File sborks2 = new File(parent, "sborks2");
        if (sborks2.isDirectory() || sborks2.mkdirs()) {
            return sborks2;
        }
        throw new IOException("Не удалось создать папку загрузки");
    }

    public final void startFolderDownload(String folderName) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        if (this.isDownloading) {
            return;
        }
        this.isDownloading = true;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleCoroutineScope mainScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
        Context appContext = requireContext().getApplicationContext();
        this.downloadJob = BuildersKt__Builders_commonKt.launch$default(mainScope, null, null, new C55631(folderName, appContext, mainScope, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$startFolderDownload$1 */
    /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$startFolderDownload$1", m4426f = "NeizzirSborksFragment.kt", m4427i = {1, 1, 2, 2, 3}, m4428l = {727, 750, 756, 779, 787, 798, 798, 798}, m4429m = "invokeSuspend", m4430n = {"src", "entries", "src", "entries", "dst"}, m4431s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class C55631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $appContext;
        final /* synthetic */ String $folderName;
        final /* synthetic */ LifecycleCoroutineScope $mainScope;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55631(String str, Context context, LifecycleCoroutineScope lifecycleCoroutineScope, Continuation<? super C55631> continuation) {
            super(2, continuation);
            this.$folderName = str;
            this.$appContext = context;
            this.$mainScope = lifecycleCoroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NeizzirSborksFragment.this.new C55631(this.$folderName, this.$appContext, this.$mainScope, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:169:0x03c2 A[Catch: all -> 0x041b, Exception -> 0x0422, CancellationException -> 0x0428, TRY_ENTER, TryCatch #42 {all -> 0x041b, blocks: (B:189:0x0475, B:190:0x0477, B:193:0x0489, B:172:0x040f, B:169:0x03c2, B:183:0x0440), top: B:304:0x040f }] */
        /* JADX WARN: Code duplicated, block: B:171:0x040e A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 19, insn: 0x0578: MOVE (r2 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY] A[D('$result' java.lang.Object)]), block:B:249:0x0576 */
        /* JADX WARN: Type inference failed for: r10v15 */
        /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v15, types: [com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$startFolderDownload$1] */
        /* JADX WARN: Type inference failed for: r1v16, types: [com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$startFolderDownload$1] */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v28 */
        /* JADX WARN: Type inference failed for: r1v29 */
        /* JADX WARN: Type inference failed for: r1v32 */
        /* JADX WARN: Type inference failed for: r1v33 */
        /* JADX WARN: Type inference failed for: r1v37 */
        /* JADX WARN: Type inference failed for: r1v39 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v41 */
        /* JADX WARN: Type inference failed for: r1v42 */
        /* JADX WARN: Type inference failed for: r1v44 */
        /* JADX WARN: Type inference failed for: r1v45 */
        /* JADX WARN: Type inference failed for: r1v46, types: [com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$startFolderDownload$1, kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r1v47, types: [com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$startFolderDownload$1] */
        /* JADX WARN: Type inference failed for: r1v49 */
        /* JADX WARN: Type inference failed for: r1v50 */
        /* JADX WARN: Type inference failed for: r1v51 */
        /* JADX WARN: Type inference failed for: r1v52 */
        /* JADX WARN: Type inference failed for: r1v53, types: [com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$startFolderDownload$1] */
        /* JADX WARN: Type inference failed for: r1v55 */
        /* JADX WARN: Type inference failed for: r1v56 */
        /* JADX WARN: Type inference failed for: r1v57 */
        /* JADX WARN: Type inference failed for: r1v58, types: [com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$startFolderDownload$1] */
        /* JADX WARN: Type inference failed for: r1v59 */
        /* JADX WARN: Type inference failed for: r1v60, types: [com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$startFolderDownload$1] */
        /* JADX WARN: Type inference failed for: r1v61 */
        /* JADX WARN: Type inference failed for: r1v62 */
        /* JADX WARN: Type inference failed for: r1v65 */
        /* JADX WARN: Type inference failed for: r1v66 */
        /* JADX WARN: Type inference failed for: r1v67 */
        /* JADX WARN: Type inference failed for: r1v68 */
        /* JADX WARN: Type inference failed for: r1v69 */
        /* JADX WARN: Type inference failed for: r1v7, types: [com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$startFolderDownload$1] */
        /* JADX WARN: Type inference failed for: r1v70 */
        /* JADX WARN: Type inference failed for: r1v71 */
        /* JADX WARN: Type inference failed for: r1v72 */
        /* JADX WARN: Type inference failed for: r1v73 */
        /* JADX WARN: Type inference failed for: r1v74 */
        /* JADX WARN: Type inference failed for: r1v75 */
        /* JADX WARN: Type inference failed for: r1v76 */
        /* JADX WARN: Type inference failed for: r1v77 */
        /* JADX WARN: Type inference failed for: r1v78 */
        /* JADX WARN: Type inference failed for: r1v79 */
        /* JADX WARN: Type inference failed for: r1v80 */
        /* JADX WARN: Type inference failed for: r1v81 */
        /* JADX WARN: Type inference failed for: r24v3 */
        /* JADX WARN: Type inference failed for: r24v5 */
        /* JADX WARN: Type inference failed for: r24v6 */
        /* JADX WARN: Type inference failed for: r38v0 */
        /* JADX WARN: Type inference failed for: r3v11, types: [com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter] */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v42 */
        /* JADX WARN: Type inference failed for: r4v18, types: [com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter] */
        /* JADX WARN: Type inference failed for: r4v24 */
        /* JADX WARN: Type inference failed for: r4v78 */
        /* JADX WARN: Type inference failed for: r5v0, types: [int] */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v15, types: [com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$startFolderDownload$1] */
        /* JADX WARN: Type inference failed for: r5v17 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v22 */
        /* JADX WARN: Type inference failed for: r5v23 */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v39 */
        /* JADX WARN: Type inference failed for: r5v40 */
        /* JADX WARN: Type inference failed for: r5v45 */
        /* JADX WARN: Type inference failed for: r5v46 */
        /* JADX WARN: Type inference failed for: r5v47 */
        /* JADX WARN: Type inference failed for: r5v48 */
        /* JADX WARN: Type inference failed for: r5v49 */
        /* JADX WARN: Type inference failed for: r5v5 */
        /* JADX WARN: Type inference failed for: r5v50 */
        /* JADX WARN: Type inference failed for: r5v51 */
        /* JADX WARN: Type inference failed for: r5v52 */
        /* JADX WARN: Type inference failed for: r5v9, types: [com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$startFolderDownload$1] */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v20 */
        /* JADX WARN: Type inference failed for: r6v21 */
        /* JADX WARN: Type inference failed for: r6v23, types: [org.json.JSONArray] */
        /* JADX WARN: Type inference failed for: r6v24 */
        /* JADX WARN: Type inference failed for: r6v28 */
        /* JADX WARN: Type inference failed for: r6v29 */
        /* JADX WARN: Type inference failed for: r6v31, types: [org.json.JSONArray] */
        /* JADX WARN: Type inference failed for: r6v32 */
        /* JADX WARN: Type inference failed for: r6v33 */
        /* JADX WARN: Type inference failed for: r6v42 */
        /* JADX WARN: Type inference failed for: r6v43 */
        /* JADX WARN: Type inference failed for: r6v48 */
        /* JADX WARN: Type inference failed for: r6v49 */
        /* JADX WARN: Type inference failed for: r6v50 */
        /* JADX WARN: Type inference failed for: r6v51 */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r6v63 */
        /* JADX WARN: Type inference failed for: r6v66 */
        /* JADX WARN: Type inference failed for: r6v77 */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Type inference failed for: r6v81 */
        /* JADX WARN: Type inference failed for: r6v82 */
        /* JADX WARN: Type inference failed for: r6v83 */
        /* JADX WARN: Type inference failed for: r6v84 */
        /* JADX WARN: Type inference failed for: r6v86 */
        /* JADX WARN: Type inference failed for: r6v87 */
        /* JADX WARN: Type inference failed for: r6v88 */
        /* JADX WARN: Type inference failed for: r6v89 */
        /* JADX WARN: Type inference failed for: r6v9 */
        /* JADX WARN: Type inference failed for: r6v91 */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v22 */
        /* JADX WARN: Type inference failed for: r7v31 */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:170:0x040c -> B:304:0x040f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r40) {
            /*
                Method dump skipped, instruction units count: 1740
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment.C55631.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$startFolderDownload$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$startFolderDownload$1$3", m4426f = "NeizzirSborksFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ File $src;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(File file, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$src = file;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$src, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        if (!this.$src.exists() || FilesKt.deleteRecursively(this.$src)) {
                            return Unit.INSTANCE;
                        }
                        throw new IOException("Не удалось очистить загрузку");
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$startFolderDownload$1$5, reason: invalid class name */
        /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$startFolderDownload$1$5", m4426f = "NeizzirSborksFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ File $dst;
            final /* synthetic */ List<Triple<String, File, Long>> $entries;
            final /* synthetic */ File $src;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass5(List<? extends Triple<String, ? extends File, Long>> list, File file, File file2, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.$entries = list;
                this.$src = file;
                this.$dst = file2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.$entries, this.$src, this.$dst, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        Iterable $this$forEach$iv = this.$entries;
                        for (Object element$iv : $this$forEach$iv) {
                            Triple triple = (Triple) element$iv;
                            String path = (String) triple.component1();
                            File file = (File) triple.component2();
                            long size = ((Number) triple.component3()).longValue();
                            if (!file.isFile() || file.length() != size) {
                                throw new IOException("Файл скачан не полностью: " + path);
                            }
                        }
                        FileUtils.INSTANCE.moveFolder(this.$src, this.$dst);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$startFolderDownload$1$6, reason: invalid class name */
        /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$startFolderDownload$1$6", m4426f = "NeizzirSborksFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Context $appContext;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(Context context, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.$appContext = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.$appContext, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        FileUtils fileUtils = FileUtils.INSTANCE;
                        Context appContext = this.$appContext;
                        Intrinsics.checkNotNullExpressionValue(appContext, "$appContext");
                        FileUtils.deleteSborks2$default(fileUtils, appContext, null, 2, null);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void installFolder(File sourceFolder) {
        Dialog progressDialog = new Dialog(requireContext());
        Window window = progressDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#80000000")));
        }
        Window window2 = progressDialog.getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -2);
        }
        progressDialog.requestWindowFeature(1);
        LinearLayout container = new LinearLayout(progressDialog.getContext());
        container.setOrientation(1);
        container.setPadding(50, 50, 50, 50);
        GradientDrawable $this$installFolder_u24lambda_u2419_u24lambda_u2416_u24lambda_u2415 = new GradientDrawable();
        $this$installFolder_u24lambda_u2419_u24lambda_u2416_u24lambda_u2415.setColor(0);
        $this$installFolder_u24lambda_u2419_u24lambda_u2416_u24lambda_u2415.setCornerRadius(16.0f);
        $this$installFolder_u24lambda_u2419_u24lambda_u2416_u24lambda_u2415.setStroke(4, -7829368);
        container.setBackground($this$installFolder_u24lambda_u2419_u24lambda_u2416_u24lambda_u2415);
        container.setGravity(17);
        ProgressBar $this$installFolder_u24lambda_u2419_u24lambda_u2417 = new ProgressBar(progressDialog.getContext());
        $this$installFolder_u24lambda_u2419_u24lambda_u2417.setIndeterminate(true);
        container.addView($this$installFolder_u24lambda_u2419_u24lambda_u2417);
        TextView $this$installFolder_u24lambda_u2419_u24lambda_u2418 = new TextView(progressDialog.getContext());
        $this$installFolder_u24lambda_u2419_u24lambda_u2418.setText("Установка сборки...");
        $this$installFolder_u24lambda_u2419_u24lambda_u2418.setTextSize(16.0f);
        $this$installFolder_u24lambda_u2419_u24lambda_u2418.setTextColor(-1);
        $this$installFolder_u24lambda_u2419_u24lambda_u2418.setGravity(17);
        $this$installFolder_u24lambda_u2419_u24lambda_u2418.setPadding(0, 20, 0, 0);
        container.addView($this$installFolder_u24lambda_u2419_u24lambda_u2418);
        progressDialog.setContentView(container);
        progressDialog.setCancelable(false);
        progressDialog.show();
        File targetDir = requireContext().getExternalFilesDir(null);
        if (targetDir == null) {
            progressDialog.dismiss();
            Toast.makeText(requireContext(), "Ошибка: Целевая папка недоступна", 0).show();
        } else {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C55421(sourceFolder, progressDialog, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$installFolder$1 */
    /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$installFolder$1", m4426f = "NeizzirSborksFragment.kt", m4427i = {}, m4428l = {848}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Dialog $progressDialog;
        final /* synthetic */ File $sourceFolder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55421(File file, Dialog dialog, Continuation<? super C55421> continuation) {
            super(2, continuation);
            this.$sourceFolder = file;
            this.$progressDialog = dialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NeizzirSborksFragment.this.new C55421(this.$sourceFolder, this.$progressDialog, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Exception exception;
            C55421 c55421;
            C55421 coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        try {
                            this.label = 1;
                            if (BuildersKt.withContext(Dispatchers.getIO().plus(NonCancellable.INSTANCE), new AnonymousClass1(NeizzirSborksFragment.this, this.$sourceFolder, null), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c55421 = this;
                            Toast.makeText(NeizzirSborksFragment.this.requireContext(), "Сборка " + c55421.$sourceFolder.getName() + " установлена", 0).show();
                            NeizzirSborksFragment.this.startActivity(new Intent(NeizzirSborksFragment.this.requireContext(), (Class<?>) NEIZZIR.class));
                            c55421.$progressDialog.dismiss();
                            return Unit.INSTANCE;
                        } catch (CancellationException cancelled) {
                            throw cancelled;
                        } catch (Exception e) {
                            exception = e;
                            c55421 = this;
                            Toast.makeText(NeizzirSborksFragment.this.requireContext(), "Ошибка установки: " + exception.getMessage(), 1).show();
                        } catch (Throwable th) {
                            cancelled = th;
                            coroutine_suspended = this;
                            coroutine_suspended.$progressDialog.dismiss();
                            throw cancelled;
                        }
                        break;
                    case 1:
                        c55421 = this;
                        try {
                            ResultKt.throwOnFailure($result);
                            Toast.makeText(NeizzirSborksFragment.this.requireContext(), "Сборка " + c55421.$sourceFolder.getName() + " установлена", 0).show();
                            NeizzirSborksFragment.this.startActivity(new Intent(NeizzirSborksFragment.this.requireContext(), (Class<?>) NEIZZIR.class));
                            break;
                        } catch (CancellationException cancelled2) {
                            throw cancelled2;
                        } catch (Exception e2) {
                            exception = e2;
                            Toast.makeText(NeizzirSborksFragment.this.requireContext(), "Ошибка установки: " + exception.getMessage(), 1).show();
                        }
                        c55421.$progressDialog.dismiss();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th2) {
                cancelled = th2;
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$installFolder$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/activities/main/util/LocalAssemblyInstaller$Result;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$installFolder$1$1", m4426f = "NeizzirSborksFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LocalAssemblyInstaller.Result>, Object> {
            final /* synthetic */ File $sourceFolder;
            int label;
            final /* synthetic */ NeizzirSborksFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(NeizzirSborksFragment neizzirSborksFragment, File file, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = neizzirSborksFragment;
                this.$sourceFolder = file;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$sourceFolder, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LocalAssemblyInstaller.Result> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        LocalAssemblyInstaller localAssemblyInstaller = LocalAssemblyInstaller.INSTANCE;
                        Context contextRequireContext = this.this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        return localAssemblyInstaller.installCatalog(contextRequireContext, this.$sourceFolder);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<String, String> readSettingsConfig(String folderPath) {
        File settingsFile = new File(requireContext().getExternalFilesDir(null), folderPath + "/NEIZZIR/settings.cfg");
        if (!settingsFile.exists()) {
            return null;
        }
        final Ref.ObjectRef channelId = new Ref.ObjectRef();
        final Ref.ObjectRef telegramLink = new Ref.ObjectRef();
        boolean z = true;
        FilesKt.forEachLine$default(settingsFile, null, new Function1<String, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment.readSettingsConfig.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String line) {
                Intrinsics.checkNotNullParameter(line, "line");
                if (StringsKt__StringsJVMKt.startsWith$default(line, "ChannelID:", false, 2, null)) {
                    channelId.element = StringsKt__StringsKt.trim((CharSequence) StringsKt__StringsKt.substringAfter$default(line, "ChannelID:", (String) null, 2, (Object) null)).toString();
                } else if (StringsKt__StringsJVMKt.startsWith$default(line, "ТГК создателя сборки", false, 2, null)) {
                    telegramLink.element = StringsKt__StringsKt.trim((CharSequence) StringsKt__StringsKt.substringAfter$default(line, "ТГК создателя сборки", (String) null, 2, (Object) null)).toString();
                }
            }
        }, 1, null);
        CharSequence charSequence = (CharSequence) channelId.element;
        if (charSequence == null || charSequence.length() == 0) {
            return null;
        }
        CharSequence charSequence2 = (CharSequence) telegramLink.element;
        if (charSequence2 != null && charSequence2.length() != 0) {
            z = false;
        }
        if (z) {
            return null;
        }
        T t = channelId.element;
        Intrinsics.checkNotNull(t);
        T t2 = telegramLink.element;
        Intrinsics.checkNotNull(t2);
        return new Pair<>(t, t2);
    }

    private final void deleteTempSborks() {
        FileUtils fileUtils = FileUtils.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        fileUtils.deleteSborks2(contextRequireContext, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment.deleteTempSborks.1
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
                if (NeizzirSborksFragment.this.downloadUi != null) {
                    DownloadDialogUi downloadDialogUi = NeizzirSborksFragment.this.downloadUi;
                    if (downloadDialogUi == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("downloadUi");
                        downloadDialogUi = null;
                    }
                    downloadDialogUi.getDialog().dismiss();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareFolderLink(String folderName) {
        String encoded = Uri.encode(folderName, "[]()");
        String link = "https://cdn.kolson.online/api/open/" + encoded;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.SUBJECT", "Сборка " + folderName);
        intent.putExtra("android.intent.extra.TEXT", link);
        startActivity(Intent.createChooser(intent, "Поделиться сборкой"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getLauncherKey() {
        SharedPreferences prefs = requireContext().getSharedPreferences("MyPreferences", 0);
        return prefs.getString("key", null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$refreshData$1 */
    /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$refreshData$1", m4426f = "NeizzirSborksFragment.kt", m4427i = {0, 1}, m4428l = {TypedValues.Custom.TYPE_REFERENCE, 922}, m4429m = "invokeSuspend", m4430n = {"$this$launch", "baseList"}, m4431s = {"L$0", "L$0"})
    static final class C55491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C55491(Continuation<? super C55491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C55491 c55491 = NeizzirSborksFragment.this.new C55491(continuation);
            c55491.L$0 = obj;
            return c55491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x006c A[Catch: Exception -> 0x01c7, LOOP:1: B:20:0x006a->B:21:0x006c, LOOP_END, TryCatch #3 {Exception -> 0x01c7, blocks: (B:19:0x005c, B:21:0x006c, B:22:0x00bf, B:23:0x00da, B:25:0x00e0, B:26:0x00f0), top: B:73:0x005c }] */
        /* JADX WARN: Code duplicated, block: B:25:0x00e0 A[Catch: Exception -> 0x01c7, LOOP:2: B:23:0x00da->B:25:0x00e0, LOOP_END, TryCatch #3 {Exception -> 0x01c7, blocks: (B:19:0x005c, B:21:0x006c, B:22:0x00bf, B:23:0x00da, B:25:0x00e0, B:26:0x00f0), top: B:73:0x005c }] */
        /* JADX WARN: Code duplicated, block: B:29:0x0107 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x0108  */
        /* JADX WARN: Code duplicated, block: B:38:0x0125  */
        /* JADX WARN: Code duplicated, block: B:39:0x0126 A[Catch: Exception -> 0x01ca, TryCatch #2 {Exception -> 0x01ca, blocks: (B:36:0x011f, B:40:0x012c, B:42:0x0134, B:43:0x014b, B:45:0x0151, B:47:0x0166, B:51:0x018c, B:54:0x019e, B:55:0x01a3, B:57:0x01aa, B:59:0x01c1, B:39:0x0126, B:35:0x0114, B:12:0x002f, B:15:0x0041), top: B:71:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x0134 A[Catch: Exception -> 0x01ca, TryCatch #2 {Exception -> 0x01ca, blocks: (B:36:0x011f, B:40:0x012c, B:42:0x0134, B:43:0x014b, B:45:0x0151, B:47:0x0166, B:51:0x018c, B:54:0x019e, B:55:0x01a3, B:57:0x01aa, B:59:0x01c1, B:39:0x0126, B:35:0x0114, B:12:0x002f, B:15:0x0041), top: B:71:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x0151 A[Catch: Exception -> 0x01ca, TryCatch #2 {Exception -> 0x01ca, blocks: (B:36:0x011f, B:40:0x012c, B:42:0x0134, B:43:0x014b, B:45:0x0151, B:47:0x0166, B:51:0x018c, B:54:0x019e, B:55:0x01a3, B:57:0x01aa, B:59:0x01c1, B:39:0x0126, B:35:0x0114, B:12:0x002f, B:15:0x0041), top: B:71:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x0166 A[Catch: Exception -> 0x01ca, TryCatch #2 {Exception -> 0x01ca, blocks: (B:36:0x011f, B:40:0x012c, B:42:0x0134, B:43:0x014b, B:45:0x0151, B:47:0x0166, B:51:0x018c, B:54:0x019e, B:55:0x01a3, B:57:0x01aa, B:59:0x01c1, B:39:0x0126, B:35:0x0114, B:12:0x002f, B:15:0x0041), top: B:71:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x0187  */
        /* JADX WARN: Code duplicated, block: B:50:0x018a  */
        /* JADX WARN: Code duplicated, block: B:53:0x019c  */
        /* JADX WARN: Code duplicated, block: B:59:0x01c1 A[Catch: Exception -> 0x01ca, TRY_LEAVE, TryCatch #2 {Exception -> 0x01ca, blocks: (B:36:0x011f, B:40:0x012c, B:42:0x0134, B:43:0x014b, B:45:0x0151, B:47:0x0166, B:51:0x018c, B:54:0x019e, B:55:0x01a3, B:57:0x01aa, B:59:0x01c1, B:39:0x0126, B:35:0x0114, B:12:0x002f, B:15:0x0041), top: B:71:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:77:0x019e A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v8, types: [com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$refreshData$1] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            JSONArray jSONArray;
            int length;
            NeizzirSborksFragment neizzirSborksFragment;
            ArrayList arrayList;
            int i;
            ArrayList arrayList2;
            List<String> arrayList3;
            Iterator it;
            Object objBatchStats;
            List list;
            Throwable th;
            Object objM15551constructorimpl;
            Map map;
            ArrayList arrayList4;
            Triple triple;
            FolderData folderDataCopy$default;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C55491 c55491 = this.label;
            try {
                switch (c55491) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        C55491 c55492 = this;
                        CoroutineScope coroutineScope = (CoroutineScope) c55492.L$0;
                        NeizzirSborksFragment.this.resetCreatedDatesState();
                        c55492.L$0 = coroutineScope;
                        c55492.label = 1;
                        Object objListFolders = SborksApi.INSTANCE.listFolders(c55492);
                        if (objListFolders == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = obj;
                        obj3 = objListFolders;
                        c55491 = c55492;
                        try {
                            jSONArray = (JSONArray) obj3;
                            length = jSONArray.length();
                            neizzirSborksFragment = NeizzirSborksFragment.this;
                            arrayList = new ArrayList(length);
                            i = 0;
                            while (i < length) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i);
                                String string = jSONObject.getString("folder_name");
                                String strOptString = jSONObject.optString("update_date", "Дата не указана");
                                Intrinsics.checkNotNull(string);
                                Intrinsics.checkNotNull(strOptString);
                                FolderData folderData = new FolderData(string, strOptString, 0, NeizzirSborksFragment.isNewByUpdate$default(neizzirSborksFragment, strOptString, 0, 2, null), 0, false);
                                neizzirSborksFragment.lastUpdate.put(string, strOptString);
                                arrayList.add(folderData);
                                i++;
                                jSONArray = jSONArray;
                            }
                            arrayList2 = arrayList;
                            List list2 = arrayList2;
                            arrayList3 = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((FolderData) it.next()).getFolderName());
                            }
                            List<String> list3 = arrayList3;
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                SborksApi sborksApi = SborksApi.INSTANCE;
                                c55491.L$0 = arrayList2;
                                c55491.label = 2;
                                objBatchStats = sborksApi.batchStats(list3, c55491);
                                if (objBatchStats == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                c55491 = c55491;
                                objM15551constructorimpl = Result.m15551constructorimpl((Map) objBatchStats);
                                c55491 = c55491;
                                if (Result.m15554exceptionOrNullimpl(objM15551constructorimpl) != null) {
                                    objM15551constructorimpl = MapsKt__MapsKt.emptyMap();
                                }
                                map = (Map) objM15551constructorimpl;
                                if (!map.isEmpty()) {
                                    List<FolderData> list4 = arrayList2;
                                    arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                                    for (FolderData folderData2 : list4) {
                                        triple = (Triple) map.get(folderData2.getFolderName());
                                        if (triple != null) {
                                            int iIntValue = ((Number) triple.component1()).intValue();
                                            int iIntValue2 = ((Number) triple.component2()).intValue();
                                            if (((Boolean) triple.component3()).booleanValue()) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            folderDataCopy$default = FolderData.copy$default(folderData2, null, null, iIntValue, false, iIntValue2, z, 11, null);
                                            if (folderDataCopy$default == null) {
                                                folderDataCopy$default = folderData2;
                                            }
                                        } else {
                                            folderDataCopy$default = folderData2;
                                        }
                                        arrayList4.add(folderDataCopy$default);
                                    }
                                    arrayList2 = arrayList4;
                                }
                                NeizzirSborksFragment.this.allFolders = arrayList2;
                                NeizzirSborksFragment.this.applyFilters(ListUpdateReason.DATA_REFRESH);
                                if (NeizzirSborksFragment.this.currentSortType == SortType.NEWEST) {
                                    NeizzirSborksFragment.this.loadDatesInBackground();
                                    break;
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                list = arrayList2;
                                Result.Companion companion2 = Result.INSTANCE;
                                objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                                arrayList2 = list;
                                c55491 = c55491;
                            }
                        } catch (Exception e) {
                            Toast.makeText(NeizzirSborksFragment.this.requireContext(), "Ошибка обновления списка", 0).show();
                        }
                        break;
                    case 1:
                        C55491 c55493 = this;
                        obj3 = obj;
                        ResultKt.throwOnFailure(obj3);
                        obj2 = obj3;
                        c55491 = c55493;
                        jSONArray = (JSONArray) obj3;
                        length = jSONArray.length();
                        neizzirSborksFragment = NeizzirSborksFragment.this;
                        arrayList = new ArrayList(length);
                        i = 0;
                        while (i < length) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String string2 = jSONObject2.getString("folder_name");
                            String strOptString2 = jSONObject2.optString("update_date", "Дата не указана");
                            Intrinsics.checkNotNull(string2);
                            Intrinsics.checkNotNull(strOptString2);
                            FolderData folderData3 = new FolderData(string2, strOptString2, 0, NeizzirSborksFragment.isNewByUpdate$default(neizzirSborksFragment, strOptString2, 0, 2, null), 0, false);
                            neizzirSborksFragment.lastUpdate.put(string2, strOptString2);
                            arrayList.add(folderData3);
                            i++;
                            jSONArray = jSONArray;
                        }
                        arrayList2 = arrayList;
                        List list5 = arrayList2;
                        arrayList3 = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                        it = list5.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((FolderData) it.next()).getFolderName());
                        }
                        List<String> list6 = arrayList3;
                        Result.Companion companion3 = Result.INSTANCE;
                        SborksApi sborksApi2 = SborksApi.INSTANCE;
                        c55491.L$0 = arrayList2;
                        c55491.label = 2;
                        objBatchStats = sborksApi2.batchStats(list6, c55491);
                        if (objBatchStats == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c55491 = c55491;
                        objM15551constructorimpl = Result.m15551constructorimpl((Map) objBatchStats);
                        c55491 = c55491;
                        if (Result.m15554exceptionOrNullimpl(objM15551constructorimpl) != null) {
                            objM15551constructorimpl = MapsKt__MapsKt.emptyMap();
                        }
                        map = (Map) objM15551constructorimpl;
                        if (!map.isEmpty()) {
                            List<FolderData> list7 = arrayList2;
                            arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                            while (r7.hasNext()) {
                                triple = (Triple) map.get(folderData2.getFolderName());
                                if (triple != null) {
                                    int iIntValue3 = ((Number) triple.component1()).intValue();
                                    int iIntValue4 = ((Number) triple.component2()).intValue();
                                    if (((Boolean) triple.component3()).booleanValue()) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    folderDataCopy$default = FolderData.copy$default(folderData2, null, null, iIntValue3, false, iIntValue4, z, 11, null);
                                    if (folderDataCopy$default == null) {
                                        folderDataCopy$default = folderData2;
                                    }
                                } else {
                                    folderDataCopy$default = folderData2;
                                }
                                arrayList4.add(folderDataCopy$default);
                            }
                            arrayList2 = arrayList4;
                        }
                        NeizzirSborksFragment.this.allFolders = arrayList2;
                        NeizzirSborksFragment.this.applyFilters(ListUpdateReason.DATA_REFRESH);
                        if (NeizzirSborksFragment.this.currentSortType == SortType.NEWEST) {
                            NeizzirSborksFragment.this.loadDatesInBackground();
                            break;
                        }
                        return Unit.INSTANCE;
                    case 2:
                        c55491 = this;
                        objBatchStats = obj;
                        list = (List) c55491.L$0;
                        try {
                            ResultKt.throwOnFailure(objBatchStats);
                            arrayList2 = list;
                            obj2 = objBatchStats;
                            c55491 = c55491;
                            objM15551constructorimpl = Result.m15551constructorimpl((Map) objBatchStats);
                            c55491 = c55491;
                        } catch (Throwable th3) {
                            th = th3;
                            Result.Companion companion4 = Result.INSTANCE;
                            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                            arrayList2 = list;
                            c55491 = c55491;
                        }
                        if (Result.m15554exceptionOrNullimpl(objM15551constructorimpl) != null) {
                            objM15551constructorimpl = MapsKt__MapsKt.emptyMap();
                        }
                        map = (Map) objM15551constructorimpl;
                        if (!map.isEmpty()) {
                            List<FolderData> list8 = arrayList2;
                            arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                            while (r7.hasNext()) {
                                triple = (Triple) map.get(folderData2.getFolderName());
                                if (triple != null) {
                                    int iIntValue5 = ((Number) triple.component1()).intValue();
                                    int iIntValue6 = ((Number) triple.component2()).intValue();
                                    if (((Boolean) triple.component3()).booleanValue()) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    folderDataCopy$default = FolderData.copy$default(folderData2, null, null, iIntValue5, false, iIntValue6, z, 11, null);
                                    if (folderDataCopy$default == null) {
                                        folderDataCopy$default = folderData2;
                                    }
                                } else {
                                    folderDataCopy$default = folderData2;
                                }
                                arrayList4.add(folderDataCopy$default);
                            }
                            arrayList2 = arrayList4;
                        }
                        NeizzirSborksFragment.this.allFolders = arrayList2;
                        NeizzirSborksFragment.this.applyFilters(ListUpdateReason.DATA_REFRESH);
                        if (NeizzirSborksFragment.this.currentSortType == SortType.NEWEST) {
                            NeizzirSborksFragment.this.loadDatesInBackground();
                            break;
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshData() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C55491(null), 3, null);
    }

    private final void clearDateCache() {
        this.createdDatesCache.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetCreatedDatesState() {
        Job job = this.createdDatesJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.createdDatesJob = null;
        clearDateCache();
    }

    private final ScrollAnchor captureScrollAnchor() {
        int firstVisible;
        View firstView;
        RecyclerView recyclerView = this.list;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
            recyclerView = null;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager layoutManager2 = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (layoutManager2 == null || (firstVisible = layoutManager2.findFirstVisibleItemPosition()) == -1 || (firstView = layoutManager2.findViewByPosition(firstVisible)) == null) {
            return null;
        }
        SborksAdapter sborksAdapter = this.adapter;
        if (sborksAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            sborksAdapter = null;
        }
        List<FolderData> currentList = sborksAdapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        FolderData firstItem = (FolderData) CollectionsKt___CollectionsKt.getOrNull(currentList, firstVisible);
        if (firstItem == null) {
            return null;
        }
        return new ScrollAnchor(firstItem.getFolderName(), firstView.getTop());
    }

    private final void restoreScrollAnchor(ScrollAnchor anchor) {
        if (anchor == null) {
            return;
        }
        RecyclerView recyclerView = this.list;
        SborksAdapter sborksAdapter = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
            recyclerView = null;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager layoutManager2 = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (layoutManager2 == null) {
            return;
        }
        SborksAdapter sborksAdapter2 = this.adapter;
        if (sborksAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            sborksAdapter = sborksAdapter2;
        }
        List<FolderData> currentList = sborksAdapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        int index$iv = 0;
        Iterator<FolderData> it = currentList.iterator();
        while (true) {
            if (it.hasNext()) {
                Object item$iv = it.next();
                FolderData it2 = (FolderData) item$iv;
                if (Intrinsics.areEqual(it2.getFolderName(), anchor.getFolderName())) {
                    break;
                } else {
                    index$iv++;
                }
            } else {
                index$iv = -1;
                break;
            }
        }
        int targetIndex = index$iv;
        if (targetIndex != -1) {
            layoutManager2.scrollToPositionWithOffset(targetIndex, anchor.getTopOffset());
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$fetchCreatedDateFromServer$2 */
    /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$fetchCreatedDateFromServer$2", m4426f = "NeizzirSborksFragment.kt", m4427i = {}, m4428l = {982}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55392 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ String $folderName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55392(String str, Continuation<? super C55392> continuation) {
            super(2, continuation);
            this.$folderName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55392(this.$folderName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C55392) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            byte[] bArr;
            Object element$iv;
            String str;
            String strSubstringAfter$default;
            String it;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    String encodedName = Uri.encode(this.$folderName, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
                    CachePolicy.LastKnownGood lastKnownGood = new CachePolicy.LastKnownGood("sborks-settings:" + this.$folderName, 0L, 2, null);
                    NeizzirSborksFragment$fetchCreatedDateFromServer$2$result$1 neizzirSborksFragment$fetchCreatedDateFromServer$2$result$1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$fetchCreatedDateFromServer$2$result$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(byte[] it2) {
                            Intrinsics.checkNotNullParameter(it2, "it");
                            return Boolean.valueOf(!(it2.length == 0));
                        }
                    };
                    this.label = 1;
                    Object bytes = NetworkRuntime.INSTANCE.getRouter().getBytes(EndpointGroup.KOLSON, "/download2/" + encodedName + "/NEIZZIR/settings.cfg", (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : lastKnownGood, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? EndpointRouter.C56582.INSTANCE : neizzirSborksFragment$fetchCreatedDateFromServer$2$result$1, this);
                    if (bytes == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = bytes;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            NetworkResult result = (NetworkResult) $result;
            NetworkResult.Success success = result instanceof NetworkResult.Success ? (NetworkResult.Success) result : null;
            if (success == null || (bArr = (byte[]) success.getValue()) == null) {
                return null;
            }
            String text = new String(bArr, Charsets.UTF_8);
            Sequence $this$firstOrNull$iv = StringsKt__StringsKt.lineSequence(text);
            Iterator it2 = $this$firstOrNull$iv.iterator();
            do {
                if (it2.hasNext()) {
                    element$iv = it2.next();
                    it = (String) element$iv;
                } else {
                    element$iv = null;
                }
                str = (String) element$iv;
                if (str == null && (strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(str, "CreatedAt:", (String) null, 2, (Object) null)) != null) {
                    return StringsKt__StringsKt.trim((CharSequence) strSubstringAfter$default).toString();
                }
            } while (!StringsKt__StringsJVMKt.startsWith$default(it, "CreatedAt:", false, 2, null));
            str = (String) element$iv;
            return str == null ? null : null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchCreatedDateFromServer(String folderName, Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C55392(folderName, null), continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$getFolderCreatedDate$2 */
    /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "Ljava/util/Date;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$getFolderCreatedDate$2", m4426f = "NeizzirSborksFragment.kt", m4427i = {}, m4428l = {999}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55412 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Date>, Object> {
        final /* synthetic */ String $fallbackUpdateDate;
        final /* synthetic */ String $folderName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55412(String str, String str2, Continuation<? super C55412> continuation) {
            super(2, continuation);
            this.$folderName = str;
            this.$fallbackUpdateDate = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NeizzirSborksFragment.this.new C55412(this.$folderName, this.$fallbackUpdateDate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Date> continuation) {
            return ((C55412) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C55412 c55412;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c55412 = this;
                    c55412.label = 1;
                    Object objFetchCreatedDateFromServer = NeizzirSborksFragment.this.fetchCreatedDateFromServer(c55412.$folderName, c55412);
                    if (objFetchCreatedDateFromServer == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objFetchCreatedDateFromServer;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c55412 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String createdDateStr = (String) $result;
            if (createdDateStr != null) {
                try {
                    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault());
                    format.setLenient(false);
                    return format.parse(createdDateStr);
                } catch (Exception e) {
                    try {
                        SimpleDateFormat format2 = new SimpleDateFormat(DateFormatter.DD_MM_YYYY, Locale.getDefault());
                        format2.setLenient(false);
                        return format2.parse(createdDateStr);
                    } catch (Exception e2) {
                    }
                }
            }
            return NeizzirSborksFragment.this.parseDate(c55412.$fallbackUpdateDate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFolderCreatedDate(String folderName, String fallbackUpdateDate, Continuation<? super Date> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C55412(folderName, fallbackUpdateDate, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadDatesInBackground() {
        FolderData it;
        Job job = this.createdDatesJob;
        boolean z = false;
        if (job != null && job.isActive()) {
            return;
        }
        List<FolderData> list = this.allFolders;
        Map existingDates = MapsKt__MapsKt.toMap(this.createdDatesCache);
        List<FolderData> $this$none$iv = list;
        if (!($this$none$iv instanceof Collection) || !$this$none$iv.isEmpty()) {
            Iterator it2 = $this$none$iv.iterator();
            do {
                if (!it2.hasNext()) {
                    z = true;
                    break;
                } else {
                    Object element$iv = it2.next();
                    it = (FolderData) element$iv;
                }
            } while (existingDates.containsKey(it.getFolderName()));
        } else {
            z = true;
        }
        if (z) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        final Job job2 = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new NeizzirSborksFragment$loadDatesInBackground$job$1(list, existingDates, this, null), 3, null);
        this.createdDatesJob = job2;
        job2.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment.loadDatesInBackground.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it3) {
                if (NeizzirSborksFragment.this.createdDatesJob == job2) {
                    NeizzirSborksFragment.this.createdDatesJob = null;
                }
            }
        });
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$loadDatesInBackgroundLegacy$1 */
    /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$loadDatesInBackgroundLegacy$1", m4426f = "NeizzirSborksFragment.kt", m4427i = {0, 0, 1, 1}, m4428l = {1078, 1081}, m4429m = "invokeSuspend", m4430n = {"$this$launch", "semaphore", "$this$launch", "semaphore"}, m4431s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C55441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        C55441(Continuation<? super C55441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C55441 c55441 = NeizzirSborksFragment.this.new C55441(continuation);
            c55441.L$0 = obj;
            return c55441;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:26:0x00fd A[LOOP:0: B:24:0x00f7->B:26:0x00fd, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:29:0x0156 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x0157  */
        /* JADX WARN: Code duplicated, block: B:33:0x017b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x017c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x017c -> B:35:0x0181). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instruction units count: 408
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment.C55441.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final void loadDatesInBackgroundLegacy() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C55441(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Job job = this.createdDatesJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.createdDatesJob = null;
        super.onDestroyView();
    }
}
