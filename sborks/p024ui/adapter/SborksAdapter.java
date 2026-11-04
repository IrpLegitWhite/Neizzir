package com.blackhub.bronline.neizzir.fragments.sborks.p024ui.adapter;

import android.R;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.core.constants.FileFormats;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import com.blackhub.bronline.neizzir.fragments.sborks.model.FolderData;
import com.blackhub.bronline.neizzir.network.NetworkImages;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.helpshift.proactive.InAppViewConstants;
import io.ktor.http.LinkHeader;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: SborksAdapter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0004YZ[\\B\u0082\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b\u0012!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\b\u0012'\u0010\u0013\u001a#\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\b\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\b\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ8\u0010!\u001a\u00020\u000f2\n\u0010\"\u001a\u00060\u0003R\u00020\u00002\u0006\u0010#\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0%H\u0002J$\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)2\n\u0010\"\u001a\u00060\u0003R\u00020\u00002\u0006\u0010*\u001a\u00020\u0002H\u0003J\u001c\u0010+\u001a\u00020\u000f2\n\u0010\"\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0018\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020\u001dH\u0002J\u0014\u0010/\u001a\u00020\u000f2\n\u0010\"\u001a\u00060\u0003R\u00020\u0000H\u0002J\u0014\u00100\u001a\u00020\u000f2\n\u0010\"\u001a\u00060\u0003R\u00020\u0000H\u0002J\u001c\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u00062\n\u0010\"\u001a\u00060\u0003R\u00020\u0000H\u0002J\u0010\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u001dH\u0002J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u001dH\u0016J5\u00108\u001a\u00020\f2\n\u0010\"\u001a\u00060\u0003R\u00020\u00002\u0006\u00102\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u001d2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0002\u0010;J$\u0010<\u001a\u00020\u000f2\n\u0010\"\u001a\u00060\u0003R\u00020\u00002\u0006\u00102\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u001dH\u0002J4\u0010=\u001a\u00020\u000f2\n\u0010\"\u001a\u00060\u0003R\u00020\u00002\u0006\u0010*\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001dH\u0002J\u001c\u0010@\u001a\u00020\u000f2\n\u0010\"\u001a\u00060\u0003R\u00020\u00002\u0006\u0010A\u001a\u00020\u001dH\u0017J*\u0010@\u001a\u00020\u000f2\n\u0010B\u001a\u00060\u0003R\u00020\u00002\u0006\u00107\u001a\u00020\u001d2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020E0DH\u0016J\u001c\u0010F\u001a\u00060\u0003R\u00020\u00002\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u001dH\u0016J\u0014\u0010J\u001a\u00020\u000f2\n\u0010B\u001a\u00060\u0003R\u00020\u0000H\u0016J$\u0010K\u001a\u00020\u000f2\n\u0010\"\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u001dH\u0002J\u0014\u0010L\u001a\u00020\u000f2\n\u0010\"\u001a\u00060\u0003R\u00020\u0000H\u0002J\u001c\u0010M\u001a\u00020\u000f2\n\u0010\"\u001a\u00060\u0003R\u00020\u00002\u0006\u0010N\u001a\u00020\fH\u0002J&\u0010O\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u001d2\u0006\u0010R\u001a\u00020\u0006J$\u0010S\u001a\u00020\u000f2\n\u0010\"\u001a\u00060\u0003R\u00020\u00002\u0006\u0010?\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020\u001dH\u0002J\u001c\u0010U\u001a\u00020\u000f2\n\u0010\"\u001a\u00060\u0003R\u00020\u00002\u0006\u0010*\u001a\u00020\u0002H\u0002J\u0014\u0010V\u001a\u00020W*\u00020)2\u0006\u0010X\u001a\u00020WH\u0002R)\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0013\u001a#\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u000f0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006]"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/adapter/SborksAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/blackhub/bronline/neizzir/fragments/sborks/model/FolderData;", "Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/adapter/SborksAdapter$VH;", "liked", "", "", "getHasLocal", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "folderName", "", "isUpdateAvailable", "onDownloadClick", "", "onInstallClick", "onDeleteClick", "onFaqClick", "onLikeToggle", "Lkotlin/Function2;", "isLikedNow", "onPlayVideo", "onShareClick", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "(Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;)V", "logoCount", "", "", "logoIndex", "progress", "Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/adapter/SborksAdapter$ProgressState;", "animateSwitch", "h", "direction", "canCommit", "Lkotlin/Function0;", "onEnd", "attachSwipe", TypedValues.AttributesType.S_TARGET, "Landroid/view/View;", "item", "bindDownloadState", "bounce", "view", "dir", "cancelHolderJobs", "clearNextLogo", "ensureLogoCountAsync", "folder", "fileNameForIndex", "idx", "getItemId", "", InAppViewConstants.POSITION, "isCurrentBinding", "bindToken", "logoPosition", "(Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/adapter/SborksAdapter$VH;Ljava/lang/String;ILjava/lang/Integer;)Z", "loadPrimaryLogoAsync", "loadSwipeLogo", "targetIndex", "total", "onBindViewHolder", "pos", "holder", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "prepareHolderForBind", "recycleHolder", "showPrimaryPlaceholder", "loading", "updateDownloadState", "downloading", "percent", Constants.ScionAnalytics.PARAM_LABEL, "updateIndicator", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "updatePlayVisibility", CalendarKeys.DAYS_GAME_KEY, "", "v", "Diff", "DownloadStatePayload", "ProgressState", "VH", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class SborksAdapter extends ListAdapter<FolderData, C5580VH> {
    private final Function1<String, Boolean> getHasLocal;
    private final Function1<String, Boolean> isUpdateAvailable;
    private final Set<String> liked;
    private final Map<String, Integer> logoCount;
    private final Map<String, Integer> logoIndex;
    private final Function1<FolderData, Unit> onDeleteClick;
    private final Function1<FolderData, Unit> onDownloadClick;
    private final Function1<FolderData, Unit> onFaqClick;
    private final Function1<FolderData, Unit> onInstallClick;
    private final Function2<FolderData, Boolean, Unit> onLikeToggle;
    private final Function1<FolderData, Unit> onPlayVideo;
    private final Function1<FolderData, Unit> onShareClick;
    private final Map<String, ProgressState> progress;
    private final CoroutineScope uiScope;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder p0, int p1, List p2) {
        onBindViewHolder((C5580VH) p0, p1, (List<Object>) p2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SborksAdapter(Set<String> liked, Function1<? super String, Boolean> getHasLocal, Function1<? super String, Boolean> isUpdateAvailable, Function1<? super FolderData, Unit> onDownloadClick, Function1<? super FolderData, Unit> onInstallClick, Function1<? super FolderData, Unit> onDeleteClick, Function1<? super FolderData, Unit> onFaqClick, Function2<? super FolderData, ? super Boolean, Unit> onLikeToggle, Function1<? super FolderData, Unit> onPlayVideo, Function1<? super FolderData, Unit> onShareClick, CoroutineScope uiScope) {
        super(Diff.INSTANCE);
        Intrinsics.checkNotNullParameter(liked, "liked");
        Intrinsics.checkNotNullParameter(getHasLocal, "getHasLocal");
        Intrinsics.checkNotNullParameter(isUpdateAvailable, "isUpdateAvailable");
        Intrinsics.checkNotNullParameter(onDownloadClick, "onDownloadClick");
        Intrinsics.checkNotNullParameter(onInstallClick, "onInstallClick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        Intrinsics.checkNotNullParameter(onFaqClick, "onFaqClick");
        Intrinsics.checkNotNullParameter(onLikeToggle, "onLikeToggle");
        Intrinsics.checkNotNullParameter(onPlayVideo, "onPlayVideo");
        Intrinsics.checkNotNullParameter(onShareClick, "onShareClick");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        this.liked = liked;
        this.getHasLocal = getHasLocal;
        this.isUpdateAvailable = isUpdateAvailable;
        this.onDownloadClick = onDownloadClick;
        this.onInstallClick = onInstallClick;
        this.onDeleteClick = onDeleteClick;
        this.onFaqClick = onFaqClick;
        this.onLikeToggle = onLikeToggle;
        this.onPlayVideo = onPlayVideo;
        this.onShareClick = onShareClick;
        this.uiScope = uiScope;
        this.progress = new LinkedHashMap();
        this.logoIndex = new LinkedHashMap();
        this.logoCount = new LinkedHashMap();
        setHasStableIds(true);
    }

    /* JADX INFO: compiled from: SborksAdapter.kt */
    @Metadata(m4415d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/adapter/SborksAdapter$DownloadStatePayload;", "", "()V", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final class DownloadStatePayload {
        public static final DownloadStatePayload INSTANCE = new DownloadStatePayload();

        private DownloadStatePayload() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return getItem(position).getFolderName().hashCode();
    }

    /* JADX INFO: compiled from: SborksAdapter.kt */
    @Metadata(m4415d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/adapter/SborksAdapter$ProgressState;", "", "downloading", "", "percent", "", Constants.ScionAnalytics.PARAM_LABEL, "", "(ZILjava/lang/String;)V", "getDownloading", "()Z", "getLabel", "()Ljava/lang/String;", "getPercent", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final /* data */ class ProgressState {
        private final boolean downloading;
        private final String label;
        private final int percent;

        public static /* synthetic */ ProgressState copy$default(ProgressState progressState, boolean z, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = progressState.downloading;
            }
            if ((i2 & 2) != 0) {
                i = progressState.percent;
            }
            if ((i2 & 4) != 0) {
                str = progressState.label;
            }
            return progressState.copy(z, i, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getDownloading() {
            return this.downloading;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getPercent() {
            return this.percent;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final ProgressState copy(boolean downloading, int percent, String label) {
            Intrinsics.checkNotNullParameter(label, "label");
            return new ProgressState(downloading, percent, label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressState)) {
                return false;
            }
            ProgressState progressState = (ProgressState) other;
            return this.downloading == progressState.downloading && this.percent == progressState.percent && Intrinsics.areEqual(this.label, progressState.label);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.downloading) * 31) + Integer.hashCode(this.percent)) * 31) + this.label.hashCode();
        }

        public String toString() {
            return "ProgressState(downloading=" + this.downloading + ", percent=" + this.percent + ", label=" + this.label + ')';
        }

        public ProgressState(boolean downloading, int percent, String label) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.downloading = downloading;
            this.percent = percent;
            this.label = label;
        }

        public final boolean getDownloading() {
            return this.downloading;
        }

        public final String getLabel() {
            return this.label;
        }

        public final int getPercent() {
            return this.percent;
        }
    }

    /* JADX INFO: compiled from: SborksAdapter.kt */
    @Metadata(m4415d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/adapter/SborksAdapter$Diff;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/blackhub/bronline/neizzir/fragments/sborks/model/FolderData;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final class Diff extends DiffUtil.ItemCallback<FolderData> {
        public static final Diff INSTANCE = new Diff();

        private Diff() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(FolderData oldItem, FolderData newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getFolderName(), newItem.getFolderName());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(FolderData oldItem, FolderData newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter$VH */
    /* JADX INFO: compiled from: SborksAdapter.kt */
    @Metadata(m4415d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010,\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0011\u0010.\u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0011\u00100\u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0011\u00102\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001c\u00105\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0011\u0010;\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u0011\u0010=\u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u001c\u0010?\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00108\"\u0004\bA\u0010:R\u0011\u0010B\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u001bR\u0011\u0010D\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u001bR\u0011\u0010F\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u00104R\u0013\u0010H\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0017R\u0011\u0010J\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u00104R\u0011\u0010L\u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\bM\u0010#R\u0011\u0010N\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u001bR\u001c\u0010P\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u00108\"\u0004\bR\u0010:¨\u0006S"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/adapter/SborksAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/adapter/SborksAdapter;Landroid/view/View;)V", "bindToken", "", "getBindToken", "()I", "setBindToken", "(I)V", "boundFolder", "", "getBoundFolder", "()Ljava/lang/String;", "setBoundFolder", "(Ljava/lang/String;)V", "boundLogoIndex", "getBoundLogoIndex", "setBoundLogoIndex", "buttonsLayout", "Landroid/widget/LinearLayout;", "getButtonsLayout", "()Landroid/widget/LinearLayout;", "delete", "Landroid/widget/TextView;", "getDelete", "()Landroid/widget/TextView;", "dlCount", "getDlCount", "download", "getDownload", "faq", "Landroid/widget/ImageView;", "getFaq", "()Landroid/widget/ImageView;", "indicator", "getIndicator", "itemProgress", "Landroid/widget/ProgressBar;", "getItemProgress", "()Landroid/widget/ProgressBar;", "itemProgressText", "getItemProgressText", "likeCount", "getLikeCount", "likeIcon", "getLikeIcon", "logo", "getLogo", "logoContainer", "getLogoContainer", "()Landroid/view/View;", "logoLoadJob", "Lkotlinx/coroutines/Job;", "getLogoLoadJob", "()Lkotlinx/coroutines/Job;", "setLogoLoadJob", "(Lkotlinx/coroutines/Job;)V", "logoLoading", "getLogoLoading", "logoNext", "getLogoNext", "logoProbeJob", "getLogoProbeJob", "setLogoProbeJob", "name", "getName", "newIcon", "getNewIcon", "play", "getPlay", "progressContainer", "getProgressContainer", "rowSpacer", "getRowSpacer", FirebaseAnalytics.Event.SHARE, "getShare", "singleDownload", "getSingleDownload", "swipeLoadJob", "getSwipeLoadJob", "setSwipeLoadJob", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public final class C5580VH extends RecyclerView.ViewHolder {
        private int bindToken;
        private String boundFolder;
        private int boundLogoIndex;
        private final LinearLayout buttonsLayout;
        private final TextView delete;
        private final TextView dlCount;
        private final TextView download;
        private final ImageView faq;
        private final LinearLayout indicator;
        private final ProgressBar itemProgress;
        private final TextView itemProgressText;
        private final TextView likeCount;
        private final ImageView likeIcon;
        private final ImageView logo;
        private final View logoContainer;
        private Job logoLoadJob;
        private final ProgressBar logoLoading;
        private final ImageView logoNext;
        private Job logoProbeJob;
        private final TextView name;
        private final TextView newIcon;
        private final View play;
        private final LinearLayout progressContainer;
        private final View rowSpacer;
        private final ImageView share;
        private final TextView singleDownload;
        private Job swipeLoadJob;
        final /* synthetic */ SborksAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5580VH(SborksAdapter this$0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = this$0;
            View viewFindViewById = view.findViewById(C3715R.id.neizzir6_newTextView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.newIcon = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(C3715R.id.neizzir6_logoImageView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.logo = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(C3715R.id.neizzir10_logoImageViewNext);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.logoNext = (ImageView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(C3715R.id.neizzir10_logoProgressBar);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.logoLoading = (ProgressBar) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(C3715R.id.neizzir10_logoContainer);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.logoContainer = viewFindViewById5;
            View viewFindViewById6 = view.findViewById(C3715R.id.neizzir10_playOverlayImageView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.play = viewFindViewById6;
            View viewFindViewById7 = view.findViewById(C3715R.id.neizzir10_pageIndicator);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.indicator = (LinearLayout) viewFindViewById7;
            View viewFindViewById8 = view.findViewById(C3715R.id.neizzir6_packNameTextView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
            this.name = (TextView) viewFindViewById8;
            View viewFindViewById9 = view.findViewById(C3715R.id.neizzir6_faqImageView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
            this.faq = (ImageView) viewFindViewById9;
            View viewFindViewById10 = view.findViewById(C3715R.id.neizzir6_downloadCountTextView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
            this.dlCount = (TextView) viewFindViewById10;
            View viewFindViewById11 = view.findViewById(C3715R.id.neizzir6_likeIconImageView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
            this.likeIcon = (ImageView) viewFindViewById11;
            View viewFindViewById12 = view.findViewById(C3715R.id.neizzir6_likeCountTextView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
            this.likeCount = (TextView) viewFindViewById12;
            View viewFindViewById13 = view.findViewById(C3715R.id.neizzir6_shareImageView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
            this.share = (ImageView) viewFindViewById13;
            View viewFindViewById14 = view.findViewById(C3715R.id.neizzir6_singleDownloadButton);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
            this.singleDownload = (TextView) viewFindViewById14;
            View viewFindViewById15 = view.findViewById(C3715R.id.neizzir6_downloadButton);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
            this.download = (TextView) viewFindViewById15;
            View viewFindViewById16 = view.findViewById(C3715R.id.neizzir6_deleteButton);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
            this.delete = (TextView) viewFindViewById16;
            View viewFindViewById17 = view.findViewById(C3715R.id.neizzir6_rowSpacer);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
            this.rowSpacer = viewFindViewById17;
            View viewFindViewById18 = view.findViewById(C3715R.id.neizzir6_buttonsLayout);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
            this.buttonsLayout = (LinearLayout) viewFindViewById18;
            View viewFindViewById19 = view.findViewById(C3715R.id.neizzir8_itemProgress);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById19, "findViewById(...)");
            this.itemProgress = (ProgressBar) viewFindViewById19;
            View viewFindViewById20 = view.findViewById(C3715R.id.neizzir8_itemProgressText);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById20, "findViewById(...)");
            this.itemProgressText = (TextView) viewFindViewById20;
            this.progressContainer = (LinearLayout) view.findViewById(C3715R.id.neizzir20_progress_container);
            this.boundLogoIndex = 1;
        }

        public final TextView getNewIcon() {
            return this.newIcon;
        }

        public final ImageView getLogo() {
            return this.logo;
        }

        public final ImageView getLogoNext() {
            return this.logoNext;
        }

        public final ProgressBar getLogoLoading() {
            return this.logoLoading;
        }

        public final View getLogoContainer() {
            return this.logoContainer;
        }

        public final View getPlay() {
            return this.play;
        }

        public final LinearLayout getIndicator() {
            return this.indicator;
        }

        public final TextView getName() {
            return this.name;
        }

        public final ImageView getFaq() {
            return this.faq;
        }

        public final TextView getDlCount() {
            return this.dlCount;
        }

        public final ImageView getLikeIcon() {
            return this.likeIcon;
        }

        public final TextView getLikeCount() {
            return this.likeCount;
        }

        public final ImageView getShare() {
            return this.share;
        }

        public final TextView getSingleDownload() {
            return this.singleDownload;
        }

        public final TextView getDownload() {
            return this.download;
        }

        public final TextView getDelete() {
            return this.delete;
        }

        public final View getRowSpacer() {
            return this.rowSpacer;
        }

        public final LinearLayout getButtonsLayout() {
            return this.buttonsLayout;
        }

        public final ProgressBar getItemProgress() {
            return this.itemProgress;
        }

        public final TextView getItemProgressText() {
            return this.itemProgressText;
        }

        public final LinearLayout getProgressContainer() {
            return this.progressContainer;
        }

        public final String getBoundFolder() {
            return this.boundFolder;
        }

        public final void setBoundFolder(String str) {
            this.boundFolder = str;
        }

        public final int getBoundLogoIndex() {
            return this.boundLogoIndex;
        }

        public final void setBoundLogoIndex(int i) {
            this.boundLogoIndex = i;
        }

        public final int getBindToken() {
            return this.bindToken;
        }

        public final void setBindToken(int i) {
            this.bindToken = i;
        }

        public final Job getLogoLoadJob() {
            return this.logoLoadJob;
        }

        public final void setLogoLoadJob(Job job) {
            this.logoLoadJob = job;
        }

        public final Job getLogoProbeJob() {
            return this.logoProbeJob;
        }

        public final void setLogoProbeJob(Job job) {
            this.logoProbeJob = job;
        }

        public final Job getSwipeLoadJob() {
            return this.swipeLoadJob;
        }

        public final void setSwipeLoadJob(Job job) {
            this.swipeLoadJob = job;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public C5580VH onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View v = LayoutInflater.from(parent.getContext()).inflate(C3715R.layout.neizzir6_item_sborks, parent, false);
        Intrinsics.checkNotNull(v);
        return new C5580VH(this, v);
    }

    public void onBindViewHolder(C5580VH holder, int position, List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        List<Object> $this$any$iv = payloads;
        boolean z = false;
        if (!($this$any$iv instanceof Collection) || !$this$any$iv.isEmpty()) {
            Iterator it = $this$any$iv.iterator();
            while (it.hasNext()) {
                Object element$iv = it.next();
                if (element$iv == DownloadStatePayload.INSTANCE) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            bindDownloadState(holder, getItem(position).getFolderName());
        } else {
            super.onBindViewHolder(holder, position, payloads);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final C5580VH h, int pos) {
        Integer num;
        Intrinsics.checkNotNullParameter(h, "h");
        final FolderData item = getItem(pos);
        Map<String, Integer> map = this.logoIndex;
        String folderName = item.getFolderName();
        Integer num2 = map.get(folderName);
        if (num2 == null) {
            num = 1;
            map.put(folderName, num);
        } else {
            num = num2;
        }
        int currentLogo = num.intValue();
        prepareHolderForBind(h, item.getFolderName(), currentLogo);
        View $this$isVisible$iv = h.getNewIcon();
        boolean value$iv = item.isNew();
        $this$isVisible$iv.setVisibility(value$iv ? 0 : 8);
        h.getName().setText(item.getFolderName());
        h.getDlCount().setText(String.valueOf(item.getDownloadCount()));
        h.getLikeCount().setText(String.valueOf(item.getLikeCount()));
        h.getShare().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SborksAdapter.onBindViewHolder$lambda$2(this.f$0, item, view);
            }
        });
        Integer num3 = this.logoCount.get(item.getFolderName());
        updateIndicator(h, num3 != null ? num3.intValue() : 1, currentLogo);
        ensureLogoCountAsync(item.getFolderName(), h);
        loadPrimaryLogoAsync(h, item.getFolderName(), currentLogo);
        h.getLogoContainer().setClickable(true);
        h.getLogoContainer().setFocusable(true);
        h.getPlay().setClickable(true);
        h.getPlay().setFocusable(true);
        View logoContainer = h.getLogoContainer();
        Intrinsics.checkNotNull(item);
        attachSwipe(logoContainer, h, item);
        attachSwipe(h.getPlay(), h, item);
        updatePlayVisibility(h, item);
        h.getPlay().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SborksAdapter.onBindViewHolder$lambda$3(item, this, view);
            }
        });
        h.getFaq().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SborksAdapter.onBindViewHolder$lambda$4(this.f$0, item, view);
            }
        });
        final Ref.BooleanRef likedNow = new Ref.BooleanRef();
        likedNow.element = this.liked.contains(item.getFolderName());
        h.getLikeIcon().setColorFilter(likedNow.element ? -1 : -7829368);
        h.getLikeIcon().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SborksAdapter.onBindViewHolder$lambda$5(likedNow, h, this, item, view);
            }
        });
        boolean hasLocal = this.getHasLocal.invoke(item.getFolderName()).booleanValue();
        if (hasLocal) {
            View $this$isVisible$iv2 = h.getButtonsLayout();
            $this$isVisible$iv2.setVisibility(0);
            View $this$isVisible$iv3 = h.getRowSpacer();
            $this$isVisible$iv3.setVisibility(8);
            View $this$isVisible$iv4 = h.getSingleDownload();
            $this$isVisible$iv4.setVisibility(8);
            View $this$isVisible$iv5 = h.getDelete();
            $this$isVisible$iv5.setVisibility(0);
            View $this$isVisible$iv6 = h.getDownload();
            $this$isVisible$iv6.setVisibility(0);
            h.getDownload().setText(this.isUpdateAvailable.invoke(item.getFolderName()).booleanValue() ? "Обновить" : "Установить");
            h.getDownload().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SborksAdapter.onBindViewHolder$lambda$6(this.f$0, item, view);
                }
            });
            h.getDelete().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SborksAdapter.onBindViewHolder$lambda$7(this.f$0, item, view);
                }
            });
        } else {
            View $this$isVisible$iv7 = h.getButtonsLayout();
            $this$isVisible$iv7.setVisibility(8);
            View $this$isVisible$iv8 = h.getRowSpacer();
            $this$isVisible$iv8.setVisibility(0);
            View $this$isVisible$iv9 = h.getSingleDownload();
            $this$isVisible$iv9.setVisibility(0);
            View $this$isVisible$iv10 = h.getDownload();
            $this$isVisible$iv10.setVisibility(8);
            View $this$isVisible$iv11 = h.getDelete();
            $this$isVisible$iv11.setVisibility(8);
            h.getSingleDownload().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SborksAdapter.onBindViewHolder$lambda$8(this.f$0, item, view);
                }
            });
        }
        bindDownloadState(h, item.getFolderName());
        int likeColor = Color.parseColor(likedNow.element ? "#EF4444" : "#666666");
        h.getLikeIcon().setColorFilter(likeColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2(SborksAdapter this$0, FolderData $item, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<FolderData, Unit> function1 = this$0.onShareClick;
        Intrinsics.checkNotNull($item);
        function1.invoke($item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$3(FolderData $item, SborksAdapter this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if ($item.getHasVideo()) {
            Function1<FolderData, Unit> function1 = this$0.onPlayVideo;
            Intrinsics.checkNotNull($item);
            function1.invoke($item);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$4(SborksAdapter this$0, FolderData $item, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<FolderData, Unit> function1 = this$0.onFaqClick;
        Intrinsics.checkNotNull($item);
        function1.invoke($item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$5(Ref.BooleanRef likedNow, C5580VH h, SborksAdapter this$0, FolderData $item, View it) {
        Intrinsics.checkNotNullParameter(likedNow, "$likedNow");
        Intrinsics.checkNotNullParameter(h, "$h");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        likedNow.element = !likedNow.element;
        h.getLikeIcon().setColorFilter(likedNow.element ? -1 : -7829368);
        Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(h.getLikeCount().getText().toString());
        int current = intOrNull != null ? intOrNull.intValue() : 0;
        h.getLikeCount().setText(String.valueOf((likedNow.element ? 1 : -1) + current));
        Function2<FolderData, Boolean, Unit> function2 = this$0.onLikeToggle;
        Intrinsics.checkNotNull($item);
        function2.invoke($item, Boolean.valueOf(likedNow.element));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$6(SborksAdapter this$0, FolderData $item, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<FolderData, Unit> function1 = this$0.isUpdateAvailable.invoke($item.getFolderName()).booleanValue() ? this$0.onDownloadClick : this$0.onInstallClick;
        Intrinsics.checkNotNull($item);
        function1.invoke($item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$7(SborksAdapter this$0, FolderData $item, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<FolderData, Unit> function1 = this$0.onDeleteClick;
        Intrinsics.checkNotNull($item);
        function1.invoke($item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$8(SborksAdapter this$0, FolderData $item, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<FolderData, Unit> function1 = this$0.onDownloadClick;
        Intrinsics.checkNotNull($item);
        function1.invoke($item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(C5580VH holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        recycleHolder(holder);
        super.onViewRecycled(holder);
    }

    public final void updateDownloadState(String folderName, boolean downloading, int percent, String label) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        Intrinsics.checkNotNullParameter(label, "label");
        this.progress.put(folderName, new ProgressState(downloading, percent, label));
        List<FolderData> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        int index$iv = 0;
        Iterator<FolderData> it = currentList.iterator();
        while (true) {
            if (it.hasNext()) {
                Object item$iv = it.next();
                FolderData it2 = (FolderData) item$iv;
                if (Intrinsics.areEqual(it2.getFolderName(), folderName)) {
                    break;
                } else {
                    index$iv++;
                }
            } else {
                index$iv = -1;
                break;
            }
        }
        int idx = index$iv;
        if (idx != -1) {
            notifyItemChanged(idx, DownloadStatePayload.INSTANCE);
        }
    }

    private final void prepareHolderForBind(C5580VH h, String folderName, int logoPosition) {
        cancelHolderJobs(h);
        h.setBindToken(h.getBindToken() + 1);
        h.setBoundFolder(folderName);
        h.setBoundLogoIndex(logoPosition);
        h.getLogo().animate().cancel();
        h.getLogo().setTranslationX(0.0f);
        h.getLogo().setAlpha(1.0f);
        clearNextLogo(h);
        showPrimaryPlaceholder(h, true);
    }

    private final void recycleHolder(C5580VH h) {
        cancelHolderJobs(h);
        h.setBindToken(h.getBindToken() + 1);
        h.setBoundFolder(null);
        h.setBoundLogoIndex(1);
        h.getLogo().animate().cancel();
        h.getLogo().setTranslationX(0.0f);
        h.getLogo().setAlpha(1.0f);
        clearNextLogo(h);
        showPrimaryPlaceholder(h, false);
    }

    private final void cancelHolderJobs(C5580VH h) {
        Job logoLoadJob = h.getLogoLoadJob();
        if (logoLoadJob != null) {
            Job.DefaultImpls.cancel$default(logoLoadJob, (CancellationException) null, 1, (Object) null);
        }
        Job logoProbeJob = h.getLogoProbeJob();
        if (logoProbeJob != null) {
            Job.DefaultImpls.cancel$default(logoProbeJob, (CancellationException) null, 1, (Object) null);
        }
        Job swipeLoadJob = h.getSwipeLoadJob();
        if (swipeLoadJob != null) {
            Job.DefaultImpls.cancel$default(swipeLoadJob, (CancellationException) null, 1, (Object) null);
        }
        h.setLogoLoadJob(null);
        h.setLogoProbeJob(null);
        h.setSwipeLoadJob(null);
        NetworkImages.INSTANCE.clear(h.getLogo());
        NetworkImages.INSTANCE.clear(h.getLogoNext());
    }

    private final void showPrimaryPlaceholder(C5580VH h, boolean loading) {
        h.getLogo().setImageResource(R.drawable.ic_menu_report_image);
        View $this$isVisible$iv = h.getLogoLoading();
        $this$isVisible$iv.setVisibility(loading ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearNextLogo(C5580VH h) {
        h.getLogoNext().animate().cancel();
        h.getLogoNext().setTranslationX(0.0f);
        h.getLogoNext().setAlpha(1.0f);
        View $this$isVisible$iv = h.getLogoNext();
        $this$isVisible$iv.setVisibility(8);
        NetworkImages.INSTANCE.clear(h.getLogoNext());
    }

    static /* synthetic */ boolean isCurrentBinding$default(SborksAdapter sborksAdapter, C5580VH c5580vh, String str, int i, Integer num, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            num = null;
        }
        return sborksAdapter.isCurrentBinding(c5580vh, str, i, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCurrentBinding(C5580VH h, String folder, int bindToken, Integer logoPosition) {
        if (Intrinsics.areEqual(h.getBoundFolder(), folder) && h.getBindToken() == bindToken) {
            return logoPosition == null || h.getBoundLogoIndex() == logoPosition.intValue();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final void bindDownloadState(C5580VH h, String folderName) {
        boolean z;
        ProgressState st = this.progress.get(folderName);
        if (st != null) {
            z = st.getDownloading();
        }
        if (z) {
            View progressContainer = h.getProgressContainer();
            if (progressContainer != null) {
                View $this$isVisible$iv = progressContainer;
                $this$isVisible$iv.setVisibility(0);
            }
            View $this$isVisible$iv2 = h.getItemProgress();
            $this$isVisible$iv2.setVisibility(0);
            h.getItemProgress().setProgress(st.getPercent());
            View $this$isVisible$iv3 = h.getItemProgressText();
            $this$isVisible$iv3.setVisibility(0);
            h.getItemProgressText().setText(st.getLabel());
            return;
        }
        View progressContainer2 = h.getProgressContainer();
        if (progressContainer2 != null) {
            View $this$isVisible$iv4 = progressContainer2;
            $this$isVisible$iv4.setVisibility(8);
        }
        View $this$isVisible$iv5 = h.getItemProgress();
        $this$isVisible$iv5.setVisibility(8);
        View $this$isVisible$iv6 = h.getItemProgressText();
        $this$isVisible$iv6.setVisibility(8);
    }

    private final void loadPrimaryLogoAsync(final C5580VH h, final String folder, final int logoPosition) {
        final int bindToken = h.getBindToken();
        Job logoLoadJob = h.getLogoLoadJob();
        if (logoLoadJob != null) {
            Job.DefaultImpls.cancel$default(logoLoadJob, (CancellationException) null, 1, (Object) null);
        }
        String seg = Uri.encode(folder, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
        String path = "/download2/" + seg + "/NEIZZIR/" + fileNameForIndex(logoPosition);
        NetworkImages.INSTANCE.loadKolsonPath(h.getLogo(), path, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 4) != 0 ? null : null, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 8) != 0 ? null : null, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 16) != 0 ? false : true, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 32) != 0 ? 17301579 : 0, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 64) != 0 ? 17301579 : 0, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 128) != 0 ? null : new Function1<Drawable, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter.loadPrimaryLogoAsync.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Drawable drawable) {
                invoke2(drawable);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Drawable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (SborksAdapter.this.isCurrentBinding(h, folder, bindToken, Integer.valueOf(logoPosition))) {
                    View $this$isVisible$iv = h.getLogoLoading();
                    $this$isVisible$iv.setVisibility(8);
                }
            }
        }, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 256) != 0 ? null : new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter.loadPrimaryLogoAsync.2
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
                if (SborksAdapter.this.isCurrentBinding(h, folder, bindToken, Integer.valueOf(logoPosition))) {
                    View $this$isVisible$iv = h.getLogoLoading();
                    $this$isVisible$iv.setVisibility(8);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String fileNameForIndex(int idx) {
        return idx <= 1 ? "logo.png" : "logo" + idx + FileFormats.PNG_FORMAT;
    }

    /* JADX INFO: renamed from: dp */
    private final float m1429dp(View $this$dp, float v) {
        return $this$dp.getResources().getDisplayMetrics().density * v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateIndicator(C5580VH h, int total, int active) {
        if (total <= 1) {
            View $this$isVisible$iv = h.getIndicator();
            $this$isVisible$iv.setVisibility(8);
            if (h.getIndicator().getChildCount() != 0) {
                h.getIndicator().removeAllViews();
                return;
            }
            return;
        }
        View $this$isVisible$iv2 = h.getIndicator();
        $this$isVisible$iv2.setVisibility(0);
        while (h.getIndicator().getChildCount() < total) {
            ImageView $this$updateIndicator_u24lambda_u2411 = new ImageView(h.getIndicator().getContext());
            $this$updateIndicator_u24lambda_u2411.setImageResource(C3715R.drawable.neizzir10_indicator_dot);
            LinearLayout.LayoutParams $this$updateIndicator_u24lambda_u2411_u24lambda_u2410 = new LinearLayout.LayoutParams(-2, -2);
            $this$updateIndicator_u24lambda_u2411_u24lambda_u2410.setMargins((int) m1429dp(h.getIndicator(), 4.0f), 0, (int) m1429dp(h.getIndicator(), 4.0f), 0);
            $this$updateIndicator_u24lambda_u2411.setLayoutParams($this$updateIndicator_u24lambda_u2411_u24lambda_u2410);
            h.getIndicator().addView($this$updateIndicator_u24lambda_u2411);
        }
        while (h.getIndicator().getChildCount() > total) {
            h.getIndicator().removeViewAt(h.getIndicator().getChildCount() - 1);
        }
        int childCount = h.getIndicator().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View v = h.getIndicator().getChildAt(i);
            float f = 1.0f;
            v.setAlpha(i + 1 == active ? 1.0f : 0.35f);
            v.setScaleX(i + 1 == active ? 1.0f : 0.9f);
            if (i + 1 != active) {
                f = 0.9f;
            }
            v.setScaleY(f);
        }
    }

    private final void ensureLogoCountAsync(String folder, C5580VH h) {
        int bindToken = h.getBindToken();
        if (this.logoCount.containsKey(folder)) {
            if (isCurrentBinding$default(this, h, folder, bindToken, null, 8, null)) {
                Integer num = this.logoCount.get(folder);
                int iIntValue = num != null ? num.intValue() : 1;
                Integer num2 = this.logoIndex.get(folder);
                updateIndicator(h, iIntValue, num2 != null ? num2.intValue() : 1);
                return;
            }
            return;
        }
        Job logoProbeJob = h.getLogoProbeJob();
        if (logoProbeJob != null) {
            Job.DefaultImpls.cancel$default(logoProbeJob, (CancellationException) null, 1, (Object) null);
        }
        h.setLogoProbeJob(BuildersKt__Builders_commonKt.launch$default(this.uiScope, null, null, new C55811(folder, this, h, bindToken, null), 3, null));
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter$ensureLogoCountAsync$1 */
    /* JADX INFO: compiled from: SborksAdapter.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter$ensureLogoCountAsync$1", m4426f = "SborksAdapter.kt", m4427i = {0, 0, 0, 0, 0}, m4428l = {331}, m4429m = "invokeSuspend", m4430n = {"$this$launch", "seg", LinkHeader.Parameters.Rel, "count", "i"}, m4431s = {"L$0", "L$1", "L$2", "I$0", "I$1"})
    static final class C55811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $bindToken;
        final /* synthetic */ String $folder;

        /* JADX INFO: renamed from: $h */
        final /* synthetic */ C5580VH f832$h;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ SborksAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55811(String str, SborksAdapter sborksAdapter, C5580VH c5580vh, int i, Continuation<? super C55811> continuation) {
            super(2, continuation);
            this.$folder = str;
            this.this$0 = sborksAdapter;
            this.f832$h = c5580vh;
            this.$bindToken = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C55811 c55811 = new C55811(this.$folder, this.this$0, this.f832$h, this.$bindToken, continuation);
            c55811.L$0 = obj;
            return c55811;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0058  */
        /* JADX WARN: Code duplicated, block: B:17:0x00af A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:26:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:29:0x0117  */
        /* JADX WARN: Code duplicated, block: B:32:0x0137  */
        /* JADX WARN: Code duplicated, block: B:35:0x0146  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00b0 -> B:53:0x00ba). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 480
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.sborks.p024ui.adapter.SborksAdapter.C55811.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bounce(final View view, int dir) {
        float dist = m1429dp(view, 12.0f) * dir;
        view.animate().translationX(dist).setDuration(90L).withEndAction(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                SborksAdapter.bounce$lambda$12(view);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bounce$lambda$12(View view) {
        Intrinsics.checkNotNullParameter(view, "$view");
        view.animate().translationX(0.0f).setDuration(90L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateSwitch(final C5580VH h, int direction, final Function0<Boolean> canCommit, final Function0<Unit> onEnd) {
        Integer numValueOf = Integer.valueOf(h.getLogo().getWidth());
        int it = numValueOf.intValue();
        if (!(it > 0)) {
            numValueOf = null;
        }
        float w = numValueOf != null ? numValueOf.intValue() : h.itemView.getWidth();
        h.getLogoNext().setAlpha(0.0f);
        h.getLogoNext().setTranslationX(direction * w);
        h.getLogoNext().setVisibility(0);
        h.getLogo().animate().translationX((-w) * 0.25f * direction).alpha(0.15f).setDuration(180L).start();
        h.getLogoNext().animate().translationX(0.0f).alpha(1.0f).setDuration(180L).withEndAction(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                SborksAdapter.animateSwitch$lambda$14(canCommit, h, this, onEnd);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateSwitch$lambda$14(Function0 canCommit, C5580VH h, SborksAdapter this$0, Function0 onEnd) {
        Intrinsics.checkNotNullParameter(canCommit, "$canCommit");
        Intrinsics.checkNotNullParameter(h, "$h");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onEnd, "$onEnd");
        if (!((Boolean) canCommit.invoke()).booleanValue()) {
            h.getLogo().setTranslationX(0.0f);
            h.getLogo().setAlpha(1.0f);
            this$0.clearNextLogo(h);
        } else {
            h.getLogo().setImageDrawable(h.getLogoNext().getDrawable());
            h.getLogo().setTranslationX(0.0f);
            h.getLogo().setAlpha(1.0f);
            this$0.clearNextLogo(h);
            onEnd.invoke();
        }
    }

    private final void loadSwipeLogo(final C5580VH h, final FolderData item, final int targetIndex, final int total, final int direction) {
        final String folder = item.getFolderName();
        final int bindToken = h.getBindToken();
        String file = fileNameForIndex(targetIndex);
        Job swipeLoadJob = h.getSwipeLoadJob();
        if (swipeLoadJob != null) {
            Job.DefaultImpls.cancel$default(swipeLoadJob, (CancellationException) null, 1, (Object) null);
        }
        clearNextLogo(h);
        View $this$isVisible$iv = h.getLogoLoading();
        $this$isVisible$iv.setVisibility(0);
        String seg = Uri.encode(folder, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
        NetworkImages.INSTANCE.loadKolsonPath(h.getLogoNext(), "/download2/" + seg + "/NEIZZIR/" + file, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 4) != 0 ? null : null, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 8) != 0 ? null : null, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 16) != 0 ? false : true, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 32) != 0 ? 17301579 : 0, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 64) != 0 ? 17301579 : 0, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 128) != 0 ? null : new Function1<Drawable, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter.loadSwipeLogo.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Drawable drawable) {
                invoke2(drawable);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Drawable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (SborksAdapter.isCurrentBinding$default(SborksAdapter.this, h, folder, bindToken, null, 8, null)) {
                    View $this$isVisible$iv2 = h.getLogoLoading();
                    $this$isVisible$iv2.setVisibility(8);
                    SborksAdapter sborksAdapter = SborksAdapter.this;
                    C5580VH c5580vh = h;
                    int i = direction;
                    final SborksAdapter sborksAdapter2 = SborksAdapter.this;
                    final C5580VH c5580vh2 = h;
                    final String str = folder;
                    final int i2 = bindToken;
                    Function0<Boolean> function0 = new Function0<Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter.loadSwipeLogo.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(SborksAdapter.isCurrentBinding$default(sborksAdapter2, c5580vh2, str, i2, null, 8, null));
                        }
                    };
                    final SborksAdapter sborksAdapter3 = SborksAdapter.this;
                    final String str2 = folder;
                    final int i3 = targetIndex;
                    final C5580VH c5580vh3 = h;
                    final int i4 = total;
                    final FolderData folderData = item;
                    sborksAdapter.animateSwitch(c5580vh, i, function0, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter.loadSwipeLogo.1.2
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
                            sborksAdapter3.logoIndex.put(str2, Integer.valueOf(i3));
                            c5580vh3.setBoundLogoIndex(i3);
                            sborksAdapter3.updateIndicator(c5580vh3, i4, i3);
                            sborksAdapter3.updatePlayVisibility(c5580vh3, folderData);
                        }
                    });
                }
            }
        }, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 256) != 0 ? null : new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter.loadSwipeLogo.2
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
                if (SborksAdapter.isCurrentBinding$default(SborksAdapter.this, h, folder, bindToken, null, 8, null)) {
                    View $this$isVisible$iv2 = h.getLogoLoading();
                    $this$isVisible$iv2.setVisibility(8);
                    SborksAdapter.this.clearNextLogo(h);
                    SborksAdapter.this.bounce(h.getLogo(), direction);
                }
            }
        });
    }

    private final void attachSwipe(View target, final C5580VH h, final FolderData item) {
        final Ref.FloatRef downX = new Ref.FloatRef();
        final Ref.FloatRef downY = new Ref.FloatRef();
        final Ref.BooleanRef swiping = new Ref.BooleanRef();
        View itemView = h.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final float threshold = m1429dp(itemView, 16.0f);
        final int touchSlop = ViewConfiguration.get(target.getContext()).getScaledTouchSlop();
        target.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.adapter.SborksAdapter$$ExternalSyntheticLambda7
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SborksAdapter.attachSwipe$lambda$15(downX, downY, swiping, this, item, touchSlop, h, threshold, view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachSwipe$lambda$15(Ref.FloatRef downX, Ref.FloatRef downY, Ref.BooleanRef swiping, SborksAdapter this$0, FolderData item, int $touchSlop, C5580VH h, float $threshold, View v, MotionEvent ev) {
        Intrinsics.checkNotNullParameter(downX, "$downX");
        Intrinsics.checkNotNullParameter(downY, "$downY");
        Intrinsics.checkNotNullParameter(swiping, "$swiping");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(h, "$h");
        switch (ev.getActionMasked()) {
            case 0:
                downX.element = ev.getX();
                downY.element = ev.getY();
                swiping.element = false;
                Log.d("SWIPE", "DOWN view=" + v.getResources().getResourceEntryName(v.getId()) + " x=" + downX.element + " y=" + downY.element);
                break;
            case 1:
            case 3:
                float dx = ev.getX() - downX.element;
                float dy = ev.getY() - downY.element;
                ViewParent parent = v.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                Log.d("SWIPE", "UP/CANCEL view=" + v.getResources().getResourceEntryName(v.getId()) + " swiping=" + swiping.element + " dx=" + dx + " dy=" + dy);
                Integer num = this$0.logoCount.get(item.getFolderName());
                int total = num != null ? num.intValue() : 1;
                if (total <= 1) {
                    if (ev.getActionMasked() == 1 && v == h.getPlay()) {
                        View $this$isVisible$iv = h.getPlay();
                        if ($this$isVisible$iv.getVisibility() == 0) {
                            h.getPlay().performClick();
                        }
                    }
                } else if (ev.getActionMasked() == 1) {
                    if (swiping.element && Math.abs(dx) >= $threshold && Math.abs(dx) > Math.abs(dy)) {
                        Integer num2 = this$0.logoIndex.get(item.getFolderName());
                        int current = num2 != null ? num2.intValue() : 1;
                        Log.d("SWIPE", "switch total=" + total + " current=" + current + " dir=" + (dx < 0.0f ? "NEXT" : "PREV"));
                        if (dx < 0.0f) {
                            int next = current + 1;
                            if (next <= total) {
                                Log.d("SWIPE", "try NEXT to " + next + " file=" + this$0.fileNameForIndex(next));
                                this$0.loadSwipeLogo(h, item, next, total, 1);
                            } else {
                                Log.d("SWIPE", "at LAST -> bounce");
                                this$0.bounce(h.getLogo(), 1);
                            }
                        } else {
                            int prev = current - 1;
                            if (prev >= 1) {
                                Log.d("SWIPE", "try PREV to " + prev + " file=" + this$0.fileNameForIndex(prev));
                                this$0.loadSwipeLogo(h, item, prev, total, -1);
                            } else {
                                Log.d("SWIPE", "at FIRST -> bounce");
                                this$0.bounce(h.getLogo(), -1);
                            }
                        }
                    } else if (v == h.getPlay()) {
                        View $this$isVisible$iv2 = h.getPlay();
                        if ($this$isVisible$iv2.getVisibility() == 0) {
                            Log.d("SWIPE", "CLICK PLAY");
                            h.getPlay().performClick();
                        }
                    }
                }
                break;
            case 2:
                Integer num3 = this$0.logoCount.get(item.getFolderName());
                int totalNow = num3 != null ? num3.intValue() : 1;
                if (totalNow > 1) {
                    float dx2 = ev.getX() - downX.element;
                    float dy2 = ev.getY() - downY.element;
                    if (!swiping.element && Math.abs(dx2) > Math.abs(dy2)) {
                        if (Math.abs(dx2) > $touchSlop) {
                            swiping.element = true;
                            ViewParent parent2 = v.getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            Log.d("SWIPE", "START dx=" + dx2 + " dy=" + dy2);
                        }
                    }
                    break;
                }
                break;
            default:
                break;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePlayVisibility(C5580VH h, FolderData item) {
        Integer num = this.logoIndex.get(item.getFolderName());
        int current = num != null ? num.intValue() : 1;
        View $this$isVisible$iv = h.getPlay();
        boolean value$iv = item.getHasVideo() && current == 1;
        $this$isVisible$iv.setVisibility(value$iv ? 0 : 8);
    }
}
