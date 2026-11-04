package com.blackhub.bronline.neizzir.fragments.custom.p023ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.p008ui.PlayerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.core.constants.RegionCode;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import com.blackhub.bronline.neizzir.activities.main.p022ui.MenuFragment;
import com.blackhub.bronline.neizzir.activities.main.settings.SettingsRepository;
import com.blackhub.bronline.neizzir.activities.main.util.CustomResourceStore;
import com.blackhub.bronline.neizzir.activities.main.util.CustomResources;
import com.blackhub.bronline.neizzir.fragments.custom.adapters.AccessoriesAdapter;
import com.blackhub.bronline.neizzir.fragments.custom.adapters.AnimationsAdapter;
import com.blackhub.bronline.neizzir.fragments.custom.adapters.BloodAdapter;
import com.blackhub.bronline.neizzir.fragments.custom.adapters.ButtonsAdapter;
import com.blackhub.bronline.neizzir.fragments.custom.adapters.FoliageAdapter;
import com.blackhub.bronline.neizzir.fragments.custom.adapters.FontsAdapter;
import com.blackhub.bronline.neizzir.fragments.custom.adapters.GunPuckAdapter;
import com.blackhub.bronline.neizzir.fragments.custom.adapters.GunSoundsAdapter;
import com.blackhub.bronline.neizzir.fragments.custom.adapters.HitSoundsAdapter;
import com.blackhub.bronline.neizzir.fragments.custom.adapters.MapColorsAdapter;
import com.blackhub.bronline.neizzir.fragments.custom.adapters.ModelsAdapter;
import com.blackhub.bronline.neizzir.fragments.custom.adapters.ModulesAdapter;
import com.blackhub.bronline.neizzir.fragments.custom.adapters.ScopesAdapter;
import com.blackhub.bronline.neizzir.fragments.custom.adapters.SkinsAdapter;
import com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager;
import com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager;
import com.blackhub.bronline.neizzir.fragments.custom.manager.GunPackManager;
import com.blackhub.bronline.neizzir.fragments.custom.manager.ModelsManager;
import com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager;
import com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager;
import com.blackhub.bronline.neizzir.fragments.custom.manager.SkySettingsManager;
import com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager;
import com.blackhub.bronline.neizzir.fragments.custom.map.MapRecolorer;
import com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCategory;
import com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController;
import com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper;
import com.blackhub.bronline.neizzir.fragments.custom.util.ProgressDialogHelper;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomFile;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomIndex;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomItem;
import com.blackhub.bronline.neizzir.fragments.custom.util.TabContentLoader;
import com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment;
import com.blackhub.bronline.neizzir.network.Endpoint;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.EndpointRouter;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import com.google.android.material.card.MaterialCardView;
import com.google.api.FieldBehaviorProto;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.helpshift.proactive.InAppViewConstants;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.p043io.files.FileSystemKt;
import okhttp3.HttpUrl;
import yuku.ambilwarna.AmbilWarnaDialog;

/* JADX INFO: compiled from: CustomSbFragment.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002:\u0004¡\u0001¢\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001dH\u0002J\b\u0010C\u001a\u00020AH\u0002J\b\u0010D\u001a\u00020AH\u0002J\u0018\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u00172\u0006\u0010G\u001a\u00020HH\u0002J\u0010\u0010I\u001a\u0002052\u0006\u0010J\u001a\u000205H\u0002J\b\u0010K\u001a\u00020\u001dH\u0002J\u0010\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u0005H\u0002J\u0010\u0010N\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001dH\u0002J\u0010\u0010O\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001dH\u0002J\u0010\u0010P\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001dH\u0002J\u0010\u0010Q\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001dH\u0002J\u0010\u0010R\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001dH\u0002J\b\u0010S\u001a\u00020AH\u0002J\u0010\u0010T\u001a\u00020A2\u0006\u0010U\u001a\u00020VH\u0002J\u0010\u0010W\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001dH\u0002J\u0010\u0010X\u001a\u00020A2\u0006\u0010Y\u001a\u000205H\u0002J\u0010\u0010Z\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001dH\u0002J6\u0010[\u001a\u00020A2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u00052\b\b\u0002\u0010_\u001a\u00020\u00052\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020A0aH\u0002J\b\u0010b\u001a\u00020AH\u0002J\u001e\u0010c\u001a\u00020A2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010e\u001a\u00020\u001dH\u0002J\u0016\u0010f\u001a\u00020A2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020]0\u0016H\u0002J\u0016\u0010h\u001a\u00020A2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020]0\u0016H\u0002J\u0016\u0010i\u001a\u00020A2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020]0\u0016H\u0002J\b\u0010j\u001a\u00020AH\u0002J\u0016\u0010k\u001a\u00020A2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020]0\u0016H\u0002J\u001e\u0010l\u001a\u00020A2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010e\u001a\u00020\u001dH\u0002J\u0016\u0010m\u001a\u00020A2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020]0\u0016H\u0002J\u0016\u0010n\u001a\u00020A2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020]0\u0016H\u0002J\b\u0010o\u001a\u00020AH\u0002J\u001e\u0010p\u001a\u00020A2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010e\u001a\u00020\u001dH\u0002J\u001e\u0010q\u001a\u00020A2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010e\u001a\u00020\u001dH\u0002J*\u0010r\u001a\u00020A2\u0006\u0010s\u001a\u00020\u00052\u0018\u0010t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0\u0016\u0012\u0004\u0012\u00020A0aH\u0002J\b\u0010u\u001a\u00020AH\u0002J\u0016\u0010v\u001a\u00020A2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020]0\u0016H\u0002J\u001e\u0010w\u001a\u00020A2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010e\u001a\u00020\u001dH\u0002J\u0010\u0010x\u001a\u00020A2\u0006\u0010y\u001a\u00020\u0005H\u0002J\u0010\u0010z\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020]H\u0002J\u0012\u0010{\u001a\u00020A2\b\u0010|\u001a\u0004\u0018\u00010}H\u0016J'\u0010~\u001a\u00020V2\u0007\u0010\u007f\u001a\u00030\u0080\u00012\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u00012\b\u0010|\u001a\u0004\u0018\u00010}H\u0016J\t\u0010\u0083\u0001\u001a\u00020AH\u0016J\t\u0010\u0084\u0001\u001a\u00020AH\u0016J\u0012\u0010\u0085\u0001\u001a\u00020A2\u0007\u0010\u0086\u0001\u001a\u00020}H\u0016J\u001b\u0010\u0087\u0001\u001a\u00020A2\u0006\u0010U\u001a\u00020V2\b\u0010|\u001a\u0004\u0018\u00010}H\u0016J\u0011\u0010\u0088\u0001\u001a\u00020A2\u0006\u0010\\\u001a\u00020]H\u0002J\u0011\u0010\u0089\u0001\u001a\u00020A2\u0006\u0010Y\u001a\u000205H\u0002J\t\u0010\u008a\u0001\u001a\u00020AH\u0002J®\u0001\u0010\u008b\u0001\u001a\u00020A2\u0006\u0010^\u001a\u00020\u00052\u0094\u0001\u0010\u008c\u0001\u001a\u008e\u0001\b\u0001\u00124\u00122\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020A0\u008f\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0090\u00010\u008e\u0001¢\u0006\u000e\b\u0091\u0001\u0012\t\bM\u0012\u0005\b\b(\u0092\u0001\u0012:\u00128\b\u0001\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000205\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020A0\u008f\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0090\u00010\u008d\u0001¢\u0006\u000e\b\u0091\u0001\u0012\t\bM\u0012\u0005\b\b(\u0093\u0001\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0094\u00010\u008f\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0090\u00010\u008d\u0001H\u0002¢\u0006\u0003\u0010\u0095\u0001J\t\u0010\u0096\u0001\u001a\u00020AH\u0002J\u0012\u0010\u0097\u0001\u001a\u00020A2\u0007\u0010\u0098\u0001\u001a\u00020\u0015H\u0002J\u0011\u0010\u0099\u0001\u001a\u00020A2\u0006\u0010U\u001a\u00020VH\u0002J\t\u0010\u009a\u0001\u001a\u00020AH\u0002J\t\u0010\u009b\u0001\u001a\u00020AH\u0002J\u0012\u0010\u009c\u0001\u001a\u00020A2\u0007\u0010\u009d\u0001\u001a\u00020HH\u0002J\t\u0010\u009e\u0001\u001a\u00020AH\u0002J\u0012\u0010\u009f\u0001\u001a\u00020A2\u0007\u0010\u009d\u0001\u001a\u00020HH\u0016J\t\u0010 \u0001\u001a\u00020AH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u000e\u0010,\u001a\u00020-X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082.¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082.¢\u0006\u0002\n\u0000¨\u0006£\u0001"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/ui/CustomSbFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/TabContentLoader$ProgressHolder;", "()V", "MAP_BASE", "", "accessoriesManager", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/AccessoriesManager;", "boldFont", "Landroid/graphics/Typeface;", "btxToolController", "Lcom/blackhub/bronline/neizzir/fragments/custom/ui/BtxArchiveToolController;", "catCharacter", "Lcom/google/android/material/card/MaterialCardView;", "catSounds", "catUtils", "catVisual", "catWeapon", "catWorld", "categorySubcategories", "", "Lcom/blackhub/bronline/neizzir/fragments/custom/ui/CustomSbFragment$Category;", "", "Lcom/blackhub/bronline/neizzir/fragments/custom/ui/CustomSbFragment$SubCategory;", "contentRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "currentCategory", "currentSubcategory", "customRootDir", "Ljava/io/File;", "foliageAdapter", "Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/FoliageAdapter;", "foliageManager", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager;", "loadingContainer", "Landroid/widget/LinearLayout;", "mapAdapter", "Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/MapColorsAdapter;", "mapRecolorer", "Lcom/blackhub/bronline/neizzir/fragments/custom/map/MapRecolorer;", "getMapRecolorer", "()Lcom/blackhub/bronline/neizzir/fragments/custom/map/MapRecolorer;", "mapRecolorer$delegate", "Lkotlin/Lazy;", "modelsManager", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/ModelsManager;", "modulesManager", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/ModulesManager;", "packManager", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/GunPackManager;", "remoteItemsJob", "Lkotlinx/coroutines/Job;", "remoteItemsRequestId", "", "settingsRepo", "Lcom/blackhub/bronline/neizzir/activities/main/settings/SettingsRepository;", "skinManager", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkinPackManager;", "skySettingsLayout", "soundController", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCustomizationController;", "subcategoriesContainer", "tabLoader", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/TabContentLoader;", "addFolderBtxToNeizzirZip", "", "folder", "buildSubcategories", "clearAllTabs", "createSubcategoryChip", "sub", "isActive", "", "dpToPx", CalendarKeys.DAYS_GAME_KEY, "getCustomRootDir", "getLocalFolder", "name", "handleBloodSelection", "handleButtonsSelection", "handleGunSoundSelection", "handleScopeSelection", "handleSoundSelection", "initManagers", "initViews", "view", "Landroid/view/View;", "installAnimation", "installColoredFoliage", "color", "installFont", "installRemoteItem", "item", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomItem;", "title", "message", "onReady", "Lkotlin/Function1;", "installTransparentFoliage", "loadAccessories", "ids", "logosDir", "loadAnimations", FirebaseAnalytics.Param.ITEMS, "loadBlood", "loadButtons", "loadFoliage", "loadFonts", "loadGunPack", "loadGunSounds", "loadHitSounds", "loadMapColors", "loadModels", "loadModules", "loadRemoteTab", "remotePath", "onLoaded", "loadSavedState", "loadScopes", "loadSkins", "loadTab", "tabName", "localFolderFor", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onDestroyView", "onPause", "onSaveInstanceState", "outState", "onViewCreated", "previewAnimationFromServer", "recolorAndSaveSet", "refreshMapColors", "runFoliageInstall", "installer", "Lkotlin/Function3;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ParameterName;", "onTitle", "onStep", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager$Result;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", "saveState", "selectCategory", "category", "setupBottomNavigation", "setupCategories", "showFoliageColorPicker", "showLoading", "show", "showMapColorPicker", "showProgress", "updateCategoryUI", "Category", "SubCategory", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class CustomSbFragment extends Fragment implements TabContentLoader.ProgressHolder {
    private AccessoriesManager accessoriesManager;
    private Typeface boldFont;
    private BtxArchiveToolController btxToolController;
    private MaterialCardView catCharacter;
    private MaterialCardView catSounds;
    private MaterialCardView catUtils;
    private MaterialCardView catVisual;
    private MaterialCardView catWeapon;
    private MaterialCardView catWorld;
    private RecyclerView contentRecyclerView;
    private File customRootDir;
    private FoliageAdapter foliageAdapter;
    private FoliageManager foliageManager;
    private LinearLayout loadingContainer;
    private MapColorsAdapter mapAdapter;
    private ModelsManager modelsManager;
    private ModulesManager modulesManager;
    private GunPackManager packManager;
    private Job remoteItemsJob;
    private int remoteItemsRequestId;
    private SettingsRepository settingsRepo;
    private SkinPackManager skinManager;
    private LinearLayout skySettingsLayout;
    private LinearLayout subcategoriesContainer;
    private TabContentLoader tabLoader;
    private final SoundCustomizationController soundController = new SoundCustomizationController(this);
    private final Map<Category, List<SubCategory>> categorySubcategories = MapsKt__MapsKt.mapOf(TuplesKt.m4423to(Category.WEAPON, CollectionsKt__CollectionsKt.listOf((Object[]) new SubCategory[]{new SubCategory("Прицелы", "🎯", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$categorySubcategories$1
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
            this.this$0.loadTab("Прицелы");
        }
    }), new SubCategory("GunPack", "🔫", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$categorySubcategories$2
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
            this.this$0.loadTab("GunPack");
        }
    })})), TuplesKt.m4423to(Category.SOUNDS, CollectionsKt__CollectionsKt.listOf((Object[]) new SubCategory[]{new SubCategory("Попадания", "💥", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$categorySubcategories$3
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
            this.this$0.loadTab("Звуки попадания");
        }
    }), new SubCategory("Стрельба", "🔊", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$categorySubcategories$4
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
            this.this$0.loadTab("Звуки стрельбы");
        }
    })})), TuplesKt.m4423to(Category.VISUAL, CollectionsKt__CollectionsKt.listOf((Object[]) new SubCategory[]{new SubCategory("Кровь", "🩸", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$categorySubcategories$5
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
            this.this$0.loadTab("Кровь");
        }
    }), new SubCategory("Кнопки", "🔘", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$categorySubcategories$6
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
            this.this$0.loadTab("Кнопки");
        }
    }), new SubCategory("Шрифты", "🔤", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$categorySubcategories$7
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
            this.this$0.loadTab("Шрифты");
        }
    })})), TuplesKt.m4423to(Category.WORLD, CollectionsKt__CollectionsKt.listOf((Object[]) new SubCategory[]{new SubCategory("Небо", "🌤️", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$categorySubcategories$8
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
            this.this$0.loadTab("Небо");
        }
    }), new SubCategory("Листва", "🌿", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$categorySubcategories$9
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
            this.this$0.loadTab("Листва");
        }
    }), new SubCategory("Карта", "🗺️", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$categorySubcategories$10
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
            this.this$0.loadTab("Покрасить карту");
        }
    }), new SubCategory("TCP", "🎨", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$categorySubcategories$11
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
            this.this$0.loadTab("TCP");
        }
    }), new SubCategory("Models", "📦", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$categorySubcategories$12
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
            this.this$0.loadTab("Models");
        }
    })})), TuplesKt.m4423to(Category.CHARACTER, CollectionsKt__CollectionsKt.listOf((Object[]) new SubCategory[]{new SubCategory("Скины", "👤", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$categorySubcategories$13
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
            this.this$0.loadTab("Скины");
        }
    }), new SubCategory("Аксессуары", "🕶️", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$categorySubcategories$14
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
            this.this$0.loadTab("Аксессуары");
        }
    }), new SubCategory("Анимации", "🏃", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$categorySubcategories$15
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
            this.this$0.loadTab("Анимации");
        }
    })})), TuplesKt.m4423to(Category.UTILS, CollectionsKt__CollectionsKt.listOf((Object[]) new SubCategory[]{new SubCategory("Модули", "⚙️", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$categorySubcategories$16
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
            this.this$0.loadTab("Модули");
        }
    }), new SubCategory("BTX", "🔧", new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$categorySubcategories$17
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
            this.this$0.loadTab("BTX");
        }
    })})));
    private Category currentCategory = Category.WEAPON;
    private String currentSubcategory = "Прицелы";
    private final String MAP_BASE = "radarmap";

    /* JADX INFO: renamed from: mapRecolorer$delegate, reason: from kotlin metadata */
    private final Lazy mapRecolorer = LazyKt__LazyJVMKt.lazy(new Function0<MapRecolorer>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$mapRecolorer$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final MapRecolorer invoke() {
            return new MapRecolorer(this.this$0.MAP_BASE);
        }
    });

    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4415d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/ui/CustomSbFragment$Category;", "", "(Ljava/lang/String;I)V", "WEAPON", "SOUNDS", "VISUAL", RegionCode.REGION_WORLD, "CHARACTER", "UTILS", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private enum Category {
        WEAPON,
        SOUNDS,
        VISUAL,
        WORLD,
        CHARACTER,
        UTILS;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        public static EnumEntries<Category> getEntries() {
            return $ENTRIES;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.soundController.restore(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.soundController.save(outState);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.remoteItemsRequestId++;
        Job job = this.remoteItemsJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        TabContentLoader tabContentLoader = this.tabLoader;
        if (tabContentLoader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabLoader");
            tabContentLoader = null;
        }
        tabContentLoader.cancel();
        this.soundController.destroyView();
        RecyclerView recyclerView = this.contentRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            recyclerView = null;
        }
        recyclerView.setAdapter(null);
        super.onDestroyView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4415d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/ui/CustomSbFragment$SubCategory;", "", "name", "", "icon", "action", "Lkotlin/Function0;", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "getIcon", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    static final /* data */ class SubCategory {
        private final Function0<Unit> action;
        private final String icon;
        private final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SubCategory copy$default(SubCategory subCategory, String str, String str2, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subCategory.name;
            }
            if ((i & 2) != 0) {
                str2 = subCategory.icon;
            }
            if ((i & 4) != 0) {
                function0 = subCategory.action;
            }
            return subCategory.copy(str, str2, function0);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        public final Function0<Unit> component3() {
            return this.action;
        }

        public final SubCategory copy(String name, String icon, Function0<Unit> action) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(action, "action");
            return new SubCategory(name, icon, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubCategory)) {
                return false;
            }
            SubCategory subCategory = (SubCategory) other;
            return Intrinsics.areEqual(this.name, subCategory.name) && Intrinsics.areEqual(this.icon, subCategory.icon) && Intrinsics.areEqual(this.action, subCategory.action);
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.icon.hashCode()) * 31) + this.action.hashCode();
        }

        public String toString() {
            return "SubCategory(name=" + this.name + ", icon=" + this.icon + ", action=" + this.action + ')';
        }

        public SubCategory(String name, String icon, Function0<Unit> action) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(action, "action");
            this.name = name;
            this.icon = icon;
            this.action = action;
        }

        public final String getName() {
            return this.name;
        }

        public final String getIcon() {
            return this.icon;
        }

        public final Function0<Unit> getAction() {
            return this.action;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MapRecolorer getMapRecolorer() {
        return (MapRecolorer) this.mapRecolorer.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C3715R.layout.neizzir2_fragment_custom_sb, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.boldFont = ResourcesCompat.getFont(requireContext(), C3715R.font.montserrat_extra_bold);
        initManagers();
        initViews(view);
        SoundCustomizationController soundCustomizationController = this.soundController;
        RecyclerView recyclerView = this.contentRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            recyclerView = null;
        }
        soundCustomizationController.attach(recyclerView);
        setupCategories();
        setupBottomNavigation(view);
        loadSavedState();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.soundController.onPause();
        TabContentLoader tabContentLoader = this.tabLoader;
        BtxArchiveToolController btxArchiveToolController = null;
        if (tabContentLoader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabLoader");
            tabContentLoader = null;
        }
        tabContentLoader.cancel();
        Job job = this.remoteItemsJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        BtxArchiveToolController btxArchiveToolController2 = this.btxToolController;
        if (btxArchiveToolController2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btxToolController");
        } else {
            btxArchiveToolController = btxArchiveToolController2;
        }
        btxArchiveToolController.onPause();
        saveState();
    }

    private final void initManagers() {
        this.tabLoader = new TabContentLoader(this, NetworkRuntime.INSTANCE.getRouter());
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.packManager = new GunPackManager(contextRequireContext);
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        this.modelsManager = new ModelsManager(contextRequireContext2);
        Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
        this.modulesManager = new ModulesManager(contextRequireContext3, NetworkRuntime.INSTANCE.getApiClient());
        Context contextRequireContext4 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
        this.foliageManager = new FoliageManager(contextRequireContext4);
        this.skinManager = new SkinPackManager(this);
        Context contextRequireContext5 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "requireContext(...)");
        this.accessoriesManager = new AccessoriesManager(contextRequireContext5);
        Context contextRequireContext6 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "requireContext(...)");
        this.settingsRepo = new SettingsRepository(contextRequireContext6);
        this.btxToolController = new BtxArchiveToolController(this);
    }

    private final void initViews(View view) {
        View viewFindViewById = view.findViewById(C3715R.id.neizzir2_contentRecyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.contentRecyclerView = (RecyclerView) viewFindViewById;
        RecyclerView recyclerView = this.contentRecyclerView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView3 = this.contentRecyclerView;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            recyclerView3 = null;
        }
        recyclerView3.setHasFixedSize(true);
        RecyclerView recyclerView4 = this.contentRecyclerView;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            recyclerView4 = null;
        }
        recyclerView4.setItemAnimator(null);
        RecyclerView recyclerView5 = this.contentRecyclerView;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
        } else {
            recyclerView2 = recyclerView5;
        }
        recyclerView2.setItemViewCacheSize(8);
        View viewFindViewById2 = view.findViewById(C3715R.id.neizzir20_loading_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.loadingContainer = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(C3715R.id.neizzir2_skySettingsLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.skySettingsLayout = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(C3715R.id.neizzir20_subcategories_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.subcategoriesContainer = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(C3715R.id.neizzir20_cat_weapon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.catWeapon = (MaterialCardView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(C3715R.id.neizzir20_cat_sounds);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.catSounds = (MaterialCardView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(C3715R.id.neizzir20_cat_visual);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.catVisual = (MaterialCardView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(C3715R.id.neizzir20_cat_world);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.catWorld = (MaterialCardView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(C3715R.id.neizzir20_cat_character);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.catCharacter = (MaterialCardView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(C3715R.id.neizzir20_cat_utils);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.catUtils = (MaterialCardView) viewFindViewById10;
    }

    private final void setupCategories() {
        MaterialCardView materialCardView = this.catWeapon;
        MaterialCardView materialCardView2 = null;
        if (materialCardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("catWeapon");
            materialCardView = null;
        }
        materialCardView.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomSbFragment.setupCategories$lambda$0(this.f$0, view);
            }
        });
        MaterialCardView materialCardView3 = this.catSounds;
        if (materialCardView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("catSounds");
            materialCardView3 = null;
        }
        materialCardView3.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomSbFragment.setupCategories$lambda$1(this.f$0, view);
            }
        });
        MaterialCardView materialCardView4 = this.catVisual;
        if (materialCardView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("catVisual");
            materialCardView4 = null;
        }
        materialCardView4.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomSbFragment.setupCategories$lambda$2(this.f$0, view);
            }
        });
        MaterialCardView materialCardView5 = this.catWorld;
        if (materialCardView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("catWorld");
            materialCardView5 = null;
        }
        materialCardView5.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomSbFragment.setupCategories$lambda$3(this.f$0, view);
            }
        });
        MaterialCardView materialCardView6 = this.catCharacter;
        if (materialCardView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("catCharacter");
            materialCardView6 = null;
        }
        materialCardView6.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomSbFragment.setupCategories$lambda$4(this.f$0, view);
            }
        });
        MaterialCardView materialCardView7 = this.catUtils;
        if (materialCardView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("catUtils");
        } else {
            materialCardView2 = materialCardView7;
        }
        materialCardView2.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomSbFragment.setupCategories$lambda$5(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCategories$lambda$0(CustomSbFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectCategory(Category.WEAPON);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCategories$lambda$1(CustomSbFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectCategory(Category.SOUNDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCategories$lambda$2(CustomSbFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectCategory(Category.VISUAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCategories$lambda$3(CustomSbFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectCategory(Category.WORLD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCategories$lambda$4(CustomSbFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectCategory(Category.CHARACTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCategories$lambda$5(CustomSbFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectCategory(Category.UTILS);
    }

    private final void selectCategory(Category category) {
        SubCategory it;
        if (this.currentCategory == category) {
            return;
        }
        this.currentCategory = category;
        this.currentSubcategory = "";
        updateCategoryUI();
        buildSubcategories();
        List<SubCategory> list = this.categorySubcategories.get(category);
        if (list != null && (it = (SubCategory) CollectionsKt___CollectionsKt.firstOrNull((List) list)) != null) {
            this.currentSubcategory = it.getName();
            buildSubcategories();
            it.getAction().invoke();
        }
    }

    private final void updateCategoryUI() {
        Pair[] pairArr = new Pair[6];
        MaterialCardView materialCardView = this.catWeapon;
        if (materialCardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("catWeapon");
            materialCardView = null;
        }
        pairArr[0] = TuplesKt.m4423to(materialCardView, Category.WEAPON);
        MaterialCardView materialCardView2 = this.catSounds;
        if (materialCardView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("catSounds");
            materialCardView2 = null;
        }
        pairArr[1] = TuplesKt.m4423to(materialCardView2, Category.SOUNDS);
        MaterialCardView materialCardView3 = this.catVisual;
        if (materialCardView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("catVisual");
            materialCardView3 = null;
        }
        pairArr[2] = TuplesKt.m4423to(materialCardView3, Category.VISUAL);
        MaterialCardView materialCardView4 = this.catWorld;
        if (materialCardView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("catWorld");
            materialCardView4 = null;
        }
        pairArr[3] = TuplesKt.m4423to(materialCardView4, Category.WORLD);
        MaterialCardView materialCardView5 = this.catCharacter;
        if (materialCardView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("catCharacter");
            materialCardView5 = null;
        }
        pairArr[4] = TuplesKt.m4423to(materialCardView5, Category.CHARACTER);
        MaterialCardView materialCardView6 = this.catUtils;
        if (materialCardView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("catUtils");
            materialCardView6 = null;
        }
        pairArr[5] = TuplesKt.m4423to(materialCardView6, Category.UTILS);
        Iterable allCats = CollectionsKt__CollectionsKt.listOf((Object[]) pairArr);
        Iterable $this$forEach$iv = allCats;
        for (Object element$iv : $this$forEach$iv) {
            Pair pair = (Pair) element$iv;
            MaterialCardView card = (MaterialCardView) pair.component1();
            Category cat = (Category) pair.component2();
            boolean isActive = cat == this.currentCategory;
            card.setCardBackgroundColor(Color.parseColor(isActive ? "#00E5CC" : "#1A1A1F"));
            card.setStrokeWidth(isActive ? 0 : dpToPx(1));
            card.setStrokeColor(Color.parseColor("#2D2D35"));
            View childAt = card.getChildAt(0);
            TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView != null) {
                textView.setTextColor(Color.parseColor(isActive ? "#0A0A0F" : TCPSettingsManager.COLOR_HINT));
            }
            if (isActive) {
                if (textView != null) {
                    textView.setTypeface(this.boldFont);
                }
            } else if (textView != null) {
                textView.setTypeface(Typeface.DEFAULT);
            }
        }
    }

    private final void buildSubcategories() {
        LinearLayout linearLayout = this.subcategoriesContainer;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subcategoriesContainer");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        List<SubCategory> list = this.categorySubcategories.get(this.currentCategory);
        if (list == null) {
            return;
        }
        List<SubCategory> $this$forEach$iv = list;
        for (Object element$iv : $this$forEach$iv) {
            SubCategory sub = (SubCategory) element$iv;
            boolean z = true;
            if (!Intrinsics.areEqual(sub.getName(), this.currentSubcategory)) {
                if (!(this.currentSubcategory.length() == 0) || !Intrinsics.areEqual(sub, CollectionsKt___CollectionsKt.first((List) list))) {
                    z = false;
                }
            }
            boolean isActive = z;
            MaterialCardView chip = createSubcategoryChip(sub, isActive);
            LinearLayout linearLayout2 = this.subcategoriesContainer;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subcategoriesContainer");
                linearLayout2 = null;
            }
            linearLayout2.addView(chip);
        }
    }

    private final MaterialCardView createSubcategoryChip(final SubCategory sub, boolean isActive) {
        MaterialCardView $this$createSubcategoryChip_u24lambda_u2412 = new MaterialCardView(requireContext());
        LinearLayout.LayoutParams $this$createSubcategoryChip_u24lambda_u2412_u24lambda_u249 = new LinearLayout.LayoutParams(-2, dpToPx(32));
        $this$createSubcategoryChip_u24lambda_u2412_u24lambda_u249.setMarginEnd(dpToPx(8));
        $this$createSubcategoryChip_u24lambda_u2412.setLayoutParams($this$createSubcategoryChip_u24lambda_u2412_u24lambda_u249);
        $this$createSubcategoryChip_u24lambda_u2412.setRadius(dpToPx(16));
        $this$createSubcategoryChip_u24lambda_u2412.setCardElevation(0.0f);
        $this$createSubcategoryChip_u24lambda_u2412.setCardBackgroundColor(Color.parseColor(isActive ? "#1A00E5CC" : "#0DFFFFFF"));
        $this$createSubcategoryChip_u24lambda_u2412.setStrokeWidth(isActive ? dpToPx(1) : 0);
        $this$createSubcategoryChip_u24lambda_u2412.setStrokeColor(Color.parseColor("#00E5CC"));
        TextView $this$createSubcategoryChip_u24lambda_u2412_u24lambda_u2410 = new TextView($this$createSubcategoryChip_u24lambda_u2412.getContext());
        $this$createSubcategoryChip_u24lambda_u2412_u24lambda_u2410.setText(sub.getIcon() + ' ' + sub.getName());
        $this$createSubcategoryChip_u24lambda_u2412_u24lambda_u2410.setTextColor(Color.parseColor(isActive ? "#00E5CC" : TCPSettingsManager.COLOR_HINT));
        $this$createSubcategoryChip_u24lambda_u2412_u24lambda_u2410.setTextSize(12.0f);
        $this$createSubcategoryChip_u24lambda_u2412_u24lambda_u2410.setGravity(17);
        $this$createSubcategoryChip_u24lambda_u2412_u24lambda_u2410.setPadding(dpToPx(14), 0, dpToPx(14), 0);
        $this$createSubcategoryChip_u24lambda_u2412_u24lambda_u2410.setTypeface(isActive ? this.boldFont : Typeface.DEFAULT);
        $this$createSubcategoryChip_u24lambda_u2412.addView($this$createSubcategoryChip_u24lambda_u2412_u24lambda_u2410);
        $this$createSubcategoryChip_u24lambda_u2412.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomSbFragment.createSubcategoryChip$lambda$12$lambda$11(this.f$0, sub, view);
            }
        });
        return $this$createSubcategoryChip_u24lambda_u2412;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSubcategoryChip$lambda$12$lambda$11(CustomSbFragment this$0, SubCategory sub, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sub, "$sub");
        this$0.currentSubcategory = sub.getName();
        this$0.buildSubcategories();
        sub.getAction().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void loadTab(String tabName) {
        TabContentLoader tabContentLoader = this.tabLoader;
        ModelsManager modelsManager = null;
        GunPackManager gunPackManager = null;
        ModulesManager modulesManager = null;
        SkinPackManager skinPackManager = null;
        AccessoriesManager accessoriesManager = null;
        TabContentLoader tabContentLoader2 = null;
        TabContentLoader tabContentLoader3 = null;
        RecyclerView recyclerView = null;
        if (tabContentLoader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabLoader");
            tabContentLoader = null;
        }
        tabContentLoader.cancel();
        Job job = this.remoteItemsJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.remoteItemsRequestId++;
        clearAllTabs();
        showLoading(true);
        switch (tabName.hashCode()) {
            case -1984932214:
                if (tabName.equals("Models")) {
                    final File file = new File(requireContext().getCacheDir(), "models_logos");
                    file.mkdirs();
                    ModelsManager modelsManager2 = this.modelsManager;
                    if (modelsManager2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("modelsManager");
                    } else {
                        modelsManager = modelsManager2;
                    }
                    modelsManager.fetchModelList(file, new Function1<List<? extends String>, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadTab.15
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
                            invoke2((List<String>) list);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<String> ids) {
                            Intrinsics.checkNotNullParameter(ids, "ids");
                            CustomSbFragment.this.showLoading(false);
                            CustomSbFragment.this.loadModels(ids, file);
                        }
                    });
                    return;
                }
                break;
            case -1490767609:
                if (tabName.equals("Анимации")) {
                    loadRemoteTab("anim", new Function1<List<? extends RemoteCustomItem>, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadTab.14
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RemoteCustomItem> list) {
                            invoke2((List<RemoteCustomItem>) list);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<RemoteCustomItem> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CustomSbFragment.this.loadAnimations(it);
                        }
                    });
                    return;
                }
                break;
            case -67877778:
                if (tabName.equals("Звуки попадания")) {
                    this.soundController.show(SoundCategory.HIT, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadTab.3
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
                            CustomSbFragment customSbFragment = CustomSbFragment.this;
                            final CustomSbFragment customSbFragment2 = CustomSbFragment.this;
                            customSbFragment.loadRemoteTab("sounds", new Function1<List<? extends RemoteCustomItem>, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadTab.3.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends RemoteCustomItem> list) {
                                    invoke2((List<RemoteCustomItem>) list);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(List<RemoteCustomItem> it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    customSbFragment2.loadHitSounds(it);
                                }
                            });
                        }
                    });
                    showLoading(false);
                    loadRemoteTab("sounds", new Function1<List<? extends RemoteCustomItem>, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadTab.4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RemoteCustomItem> list) {
                            invoke2((List<RemoteCustomItem>) list);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<RemoteCustomItem> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CustomSbFragment.this.loadHitSounds(it);
                        }
                    });
                    return;
                }
                break;
            case 66118:
                if (tabName.equals("BTX")) {
                    showLoading(false);
                    BtxArchiveToolController btxArchiveToolController = this.btxToolController;
                    if (btxArchiveToolController == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("btxToolController");
                        btxArchiveToolController = null;
                    }
                    RecyclerView recyclerView2 = this.contentRecyclerView;
                    if (recyclerView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
                    } else {
                        recyclerView = recyclerView2;
                    }
                    btxArchiveToolController.show(recyclerView);
                    return;
                }
                break;
            case 82881:
                if (tabName.equals("TCP")) {
                    TabContentLoader tabContentLoader4 = this.tabLoader;
                    if (tabContentLoader4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tabLoader");
                    } else {
                        tabContentLoader3 = tabContentLoader4;
                    }
                    tabContentLoader3.downloadFolder("tcp", getLocalFolder("tcp"), new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadTab.13
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
                            CustomSbFragment.this.showLoading(false);
                            new TCPSettingsManager(CustomSbFragment.this).show();
                        }
                    });
                    return;
                }
                break;
            case 32439269:
                if (tabName.equals("Небо")) {
                    TabContentLoader tabContentLoader5 = this.tabLoader;
                    if (tabContentLoader5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tabLoader");
                    } else {
                        tabContentLoader2 = tabContentLoader5;
                    }
                    tabContentLoader2.downloadFolder("tcyc", getLocalFolder("tcyc"), new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadTab.9
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
                            CustomSbFragment.this.showLoading(false);
                            new SkySettingsManager(CustomSbFragment.this).show();
                        }
                    });
                    return;
                }
                break;
            case 89098870:
                if (tabName.equals("Аксессуары")) {
                    final File file2 = new File(requireContext().getCacheDir(), "accessories_logos");
                    file2.mkdirs();
                    AccessoriesManager accessoriesManager2 = this.accessoriesManager;
                    if (accessoriesManager2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("accessoriesManager");
                    } else {
                        accessoriesManager = accessoriesManager2;
                    }
                    accessoriesManager.fetchAccessoryList(file2, new Function1<List<? extends String>, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadTab.12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
                            invoke2((List<String>) list);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<String> ids) {
                            Intrinsics.checkNotNullParameter(ids, "ids");
                            CustomSbFragment.this.showLoading(false);
                            CustomSbFragment.this.loadAccessories(ids, file2);
                        }
                    });
                    return;
                }
                break;
            case 970844987:
                if (tabName.equals("Звуки стрельбы")) {
                    this.soundController.show(SoundCategory.GUN, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadTab.5
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
                            CustomSbFragment customSbFragment = CustomSbFragment.this;
                            final CustomSbFragment customSbFragment2 = CustomSbFragment.this;
                            customSbFragment.loadRemoteTab("genrl", new Function1<List<? extends RemoteCustomItem>, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadTab.5.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends RemoteCustomItem> list) {
                                    invoke2((List<RemoteCustomItem>) list);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(List<RemoteCustomItem> it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    customSbFragment2.loadGunSounds(it);
                                }
                            });
                        }
                    });
                    showLoading(false);
                    loadRemoteTab("genrl", new Function1<List<? extends RemoteCustomItem>, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadTab.6
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RemoteCustomItem> list) {
                            invoke2((List<RemoteCustomItem>) list);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<RemoteCustomItem> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CustomSbFragment.this.loadGunSounds(it);
                        }
                    });
                    return;
                }
                break;
            case 1003187698:
                if (tabName.equals("Кровь")) {
                    loadRemoteTab("blood", new Function1<List<? extends RemoteCustomItem>, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadTab.2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RemoteCustomItem> list) {
                            invoke2((List<RemoteCustomItem>) list);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<RemoteCustomItem> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CustomSbFragment.this.loadBlood(it);
                        }
                    });
                    return;
                }
                break;
            case 1009468173:
                if (tabName.equals("Скины")) {
                    final File file3 = new File(requireContext().getCacheDir(), "skins_logos");
                    file3.mkdirs();
                    SkinPackManager skinPackManager2 = this.skinManager;
                    if (skinPackManager2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("skinManager");
                    } else {
                        skinPackManager = skinPackManager2;
                    }
                    skinPackManager.fetchSkinList(file3, new Function1<List<? extends String>, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadTab.11
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
                            invoke2((List<String>) list);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<String> ids) {
                            Intrinsics.checkNotNullParameter(ids, "ids");
                            CustomSbFragment.this.showLoading(false);
                            CustomSbFragment.this.loadSkins(ids, file3);
                        }
                    });
                    return;
                }
                break;
            case 1031290018:
                if (tabName.equals("Кнопки")) {
                    loadRemoteTab(InAppViewConstants.BUTTONS, new Function1<List<? extends RemoteCustomItem>, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadTab.7
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RemoteCustomItem> list) {
                            invoke2((List<RemoteCustomItem>) list);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<RemoteCustomItem> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CustomSbFragment.this.loadButtons(it);
                        }
                    });
                    return;
                }
                break;
            case 1055393564:
                if (tabName.equals("Листва")) {
                    showLoading(false);
                    loadFoliage();
                    return;
                }
                break;
            case 1089177806:
                if (tabName.equals("Модули")) {
                    final File file4 = new File(requireContext().getCacheDir(), "modules_logos");
                    file4.mkdirs();
                    ModulesManager modulesManager2 = this.modulesManager;
                    if (modulesManager2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("modulesManager");
                    } else {
                        modulesManager = modulesManager2;
                    }
                    modulesManager.fetchModuleList(file4, new Function1<List<? extends String>, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadTab.16
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
                            invoke2((List<String>) list);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<String> ids) {
                            Intrinsics.checkNotNullParameter(ids, "ids");
                            CustomSbFragment.this.showLoading(false);
                            CustomSbFragment.this.loadModules(ids, file4);
                        }
                    });
                    return;
                }
                break;
            case 1434695021:
                if (tabName.equals("Шрифты")) {
                    loadRemoteTab(InAppViewConstants.FONTS, new Function1<List<? extends RemoteCustomItem>, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadTab.8
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RemoteCustomItem> list) {
                            invoke2((List<RemoteCustomItem>) list);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<RemoteCustomItem> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CustomSbFragment.this.loadFonts(it);
                        }
                    });
                    return;
                }
                break;
            case 2041929561:
                if (tabName.equals("GunPack")) {
                    final File file5 = new File(requireContext().getCacheDir(), "gunpuck_logos");
                    file5.mkdirs();
                    GunPackManager gunPackManager2 = this.packManager;
                    if (gunPackManager2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("packManager");
                    } else {
                        gunPackManager = gunPackManager2;
                    }
                    gunPackManager.fetchPackList(file5, new Function1<List<? extends String>, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadTab.10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
                            invoke2((List<String>) list);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<String> ids) {
                            Intrinsics.checkNotNullParameter(ids, "ids");
                            CustomSbFragment.this.showLoading(false);
                            CustomSbFragment.this.loadGunPack(ids, file5);
                        }
                    });
                    return;
                }
                break;
            case 2077584087:
                if (tabName.equals("Покрасить карту")) {
                    showLoading(false);
                    loadMapColors();
                    return;
                }
                break;
            case 2128321846:
                if (tabName.equals("Прицелы")) {
                    loadRemoteTab("scopes", new Function1<List<? extends RemoteCustomItem>, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadTab.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RemoteCustomItem> list) {
                            invoke2((List<RemoteCustomItem>) list);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<RemoteCustomItem> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CustomSbFragment.this.loadScopes(it);
                        }
                    });
                    return;
                }
                break;
        }
        showLoading(false);
        Toast.makeText(requireContext(), "Эта вкладка ещё не настроена", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoading(boolean show) {
        RecyclerView recyclerView = null;
        if (this.soundController.isVisible()) {
            LinearLayout linearLayout = this.loadingContainer;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingContainer");
                linearLayout = null;
            }
            linearLayout.setVisibility(8);
            RecyclerView recyclerView2 = this.contentRecyclerView;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            } else {
                recyclerView = recyclerView2;
            }
            recyclerView.setVisibility(0);
            return;
        }
        LinearLayout linearLayout2 = this.loadingContainer;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingContainer");
            linearLayout2 = null;
        }
        linearLayout2.setVisibility(show ? 0 : 8);
        RecyclerView recyclerView3 = this.contentRecyclerView;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
        } else {
            recyclerView = recyclerView3;
        }
        recyclerView.setVisibility(show ? 8 : 0);
    }

    private final File getLocalFolder(String name) {
        return new File(getCustomRootDir(), name);
    }

    private final File getCustomRootDir() {
        File it = this.customRootDir;
        if (it != null) {
            return it;
        }
        File externalFilesDir = requireContext().getExternalFilesDir(null);
        File externalRoot = externalFilesDir != null ? externalFilesDir.getParentFile() : null;
        File it2 = new File(externalRoot == null ? requireContext().getFilesDir() : externalRoot, TypedValues.Custom.NAME);
        this.customRootDir = it2;
        return it2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadRemoteTab(final String remotePath, final Function1<? super List<RemoteCustomItem>, Unit> onLoaded) {
        final int requestId = this.remoteItemsRequestId;
        TabContentLoader tabContentLoader = this.tabLoader;
        if (tabContentLoader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabLoader");
            tabContentLoader = null;
        }
        tabContentLoader.fetchIndex(remotePath, new Function1<List<? extends RemoteCustomFile>, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadRemoteTab.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends RemoteCustomFile> list) {
                invoke2((List<RemoteCustomFile>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<RemoteCustomFile> files) {
                Intrinsics.checkNotNullParameter(files, "files");
                if (CustomSbFragment.this.getView() != null && requestId == CustomSbFragment.this.remoteItemsRequestId) {
                    CustomSbFragment.this.showLoading(true);
                    Job job = CustomSbFragment.this.remoteItemsJob;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    CustomSbFragment.this.remoteItemsJob = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(CustomSbFragment.this), Dispatchers.getDefault(), null, new AnonymousClass1(remotePath, files, CustomSbFragment.this, requestId, onLoaded, null), 2, null);
                }
            }

            /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$loadRemoteTab$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: CustomSbFragment.kt */
            @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
            @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$loadRemoteTab$1$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {473}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ List<RemoteCustomFile> $files;
                final /* synthetic */ Function1<List<RemoteCustomItem>, Unit> $onLoaded;
                final /* synthetic */ String $remotePath;
                final /* synthetic */ int $requestId;
                int label;
                final /* synthetic */ CustomSbFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(String str, List<RemoteCustomFile> list, CustomSbFragment customSbFragment, int i, Function1<? super List<RemoteCustomItem>, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$remotePath = str;
                    this.$files = list;
                    this.this$0 = customSbFragment;
                    this.$requestId = i;
                    this.$onLoaded = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$remotePath, this.$files, this.this$0, this.$requestId, this.$onLoaded, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object $result) {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (this.label) {
                        case 0:
                            ResultKt.throwOnFailure($result);
                            List<RemoteCustomItem> listBuildItems = RemoteCustomIndex.INSTANCE.buildItems(this.$remotePath, this.$files);
                            this.label = 1;
                            if (BuildersKt.withContext(Dispatchers.getMain(), new C104061(this.this$0, this.$requestId, this.$onLoaded, listBuildItems, null), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            break;
                        case 1:
                            ResultKt.throwOnFailure($result);
                            break;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$loadRemoteTab$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: CustomSbFragment.kt */
                @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
                @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$loadRemoteTab$1$1$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
                static final class C104061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ List<RemoteCustomItem> $items;
                    final /* synthetic */ Function1<List<RemoteCustomItem>, Unit> $onLoaded;
                    final /* synthetic */ int $requestId;
                    int label;
                    final /* synthetic */ CustomSbFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C104061(CustomSbFragment customSbFragment, int i, Function1<? super List<RemoteCustomItem>, Unit> function1, List<RemoteCustomItem> list, Continuation<? super C104061> continuation) {
                        super(2, continuation);
                        this.this$0 = customSbFragment;
                        this.$requestId = i;
                        this.$onLoaded = function1;
                        this.$items = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C104061(this.this$0, this.$requestId, this.$onLoaded, this.$items, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C104061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        switch (this.label) {
                            case 0:
                                ResultKt.throwOnFailure(obj);
                                if (this.this$0.isAdded() && this.$requestId == this.this$0.remoteItemsRequestId) {
                                    this.this$0.showLoading(false);
                                    this.$onLoaded.invoke(this.$items);
                                    return Unit.INSTANCE;
                                }
                                return Unit.INSTANCE;
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File localFolderFor(RemoteCustomItem item) {
        return new File(getLocalFolder(item.getRemotePath()), item.getId());
    }

    static /* synthetic */ void installRemoteItem$default(CustomSbFragment customSbFragment, RemoteCustomItem remoteCustomItem, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "Загрузка файлов...";
        }
        customSbFragment.installRemoteItem(remoteCustomItem, str, str2, function1);
    }

    private final void installRemoteItem(RemoteCustomItem item, String title, String message, final Function1<? super File, Unit> onReady) {
        final File folder = localFolderFor(item);
        List<RemoteCustomFile> installPaths = item.getInstallPaths();
        if (installPaths.isEmpty()) {
            Toast.makeText(requireContext(), "Нет файлов для загрузки", 0).show();
            return;
        }
        LauncherDialogHelper launcherDialogHelper = LauncherDialogHelper.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        final LauncherDialogHelper.ProgressHandle progress = LauncherDialogHelper.createDeterminateProgressDialog$default(launcherDialogHelper, contextRequireContext, title, installPaths.size(), null, null, 24, null);
        progress.show();
        progress.setMessage(message);
        TabContentLoader tabContentLoader = this.tabLoader;
        if (tabContentLoader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabLoader");
            tabContentLoader = null;
        }
        tabContentLoader.downloadFiles(item.getRemotePath() + FileSystemKt.UnixPathSeparator + item.getId(), installPaths, folder, new Function2<Integer, Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.installRemoteItem.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
                invoke(num.intValue(), num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int done, int total) {
                progress.setProgress(done, total, "Загружено " + done + " / " + total + "...");
            }
        }, new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.installRemoteItem.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean success) {
                progress.dismiss();
                if (success) {
                    onReady.invoke(folder);
                } else {
                    Toast.makeText(this.requireContext(), "Не удалось загрузить все файлы", 0).show();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadScopes(List<RemoteCustomItem> items) {
        RecyclerView recyclerView = this.contentRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            recyclerView = null;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        recyclerView.setAdapter(new ScopesAdapter(contextRequireContext, items, new C54691(this), new Function2<RemoteCustomItem, File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadScopes.2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(RemoteCustomItem remoteCustomItem, File file) {
                invoke2(remoteCustomItem, file);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RemoteCustomItem item, File file) {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(file, "<anonymous parameter 1>");
                CustomSbFragment customSbFragment = CustomSbFragment.this;
                final CustomSbFragment customSbFragment2 = CustomSbFragment.this;
                CustomSbFragment.installRemoteItem$default(customSbFragment, item, "Загрузка прицела", null, new Function1<File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadScopes.2.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(File file2) {
                        invoke2(file2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(File it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        customSbFragment2.handleScopeSelection(it);
                    }
                }, 4, null);
            }
        }));
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$loadScopes$1 */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    /* synthetic */ class C54691 extends FunctionReferenceImpl implements Function1<RemoteCustomItem, File> {
        C54691(Object obj) {
            super(1, obj, CustomSbFragment.class, "localFolderFor", "localFolderFor(Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomItem;)Ljava/io/File;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final File invoke(RemoteCustomItem p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((CustomSbFragment) this.receiver).localFolderFor(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadBlood(List<RemoteCustomItem> items) {
        RecyclerView recyclerView = this.contentRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            recyclerView = null;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        BloodAdapter $this$loadBlood_u24lambda_u2420 = new BloodAdapter(contextRequireContext, items, new C54561(this), new Function2<RemoteCustomItem, File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadBlood.2
            {
                super(2);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RemoteCustomItem item, File file) {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(file, "<anonymous parameter 1>");
                CustomSbFragment customSbFragment = CustomSbFragment.this;
                final CustomSbFragment customSbFragment2 = CustomSbFragment.this;
                CustomSbFragment.installRemoteItem$default(customSbFragment, item, "Загрузка крови", null, new Function1<File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadBlood.2.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(File file2) {
                        invoke2(file2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(File it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        customSbFragment2.handleBloodSelection(it);
                    }
                }, 4, null);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(RemoteCustomItem remoteCustomItem, File file) {
                invoke2(remoteCustomItem, file);
                return Unit.INSTANCE;
            }
        });
        $this$loadBlood_u24lambda_u2420.setPreviewButtonVisibility(true);
        recyclerView.setAdapter($this$loadBlood_u24lambda_u2420);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$loadBlood$1 */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    /* synthetic */ class C54561 extends FunctionReferenceImpl implements Function1<RemoteCustomItem, File> {
        C54561(Object obj) {
            super(1, obj, CustomSbFragment.class, "localFolderFor", "localFolderFor(Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomItem;)Ljava/io/File;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final File invoke(RemoteCustomItem p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((CustomSbFragment) this.receiver).localFolderFor(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadHitSounds(List<RemoteCustomItem> items) {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        HitSoundsAdapter adapter = new HitSoundsAdapter(contextRequireContext, items, new CustomSbFragment$loadHitSounds$adapter$1(this), this.soundController.getPreview(), new Function2<RemoteCustomItem, File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$loadHitSounds$adapter$2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(RemoteCustomItem remoteCustomItem, File file) {
                invoke2(remoteCustomItem, file);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RemoteCustomItem item, File file) {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(file, "<anonymous parameter 1>");
                CustomSbFragment customSbFragment = this.this$0;
                final CustomSbFragment customSbFragment2 = this.this$0;
                CustomSbFragment.installRemoteItem$default(customSbFragment, item, "Загрузка звуков", null, new Function1<File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$loadHitSounds$adapter$2.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(File file2) {
                        invoke2(file2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(File it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        customSbFragment2.handleSoundSelection(it);
                    }
                }, 4, null);
            }
        });
        this.soundController.setRemote(SoundCategory.HIT, adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadGunSounds(List<RemoteCustomItem> items) {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        GunSoundsAdapter adapter = new GunSoundsAdapter(contextRequireContext, items, new CustomSbFragment$loadGunSounds$adapter$1(this), this.soundController.getPreview(), new Function2<RemoteCustomItem, File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$loadGunSounds$adapter$2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(RemoteCustomItem remoteCustomItem, File file) {
                invoke2(remoteCustomItem, file);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RemoteCustomItem item, File file) {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(file, "<anonymous parameter 1>");
                CustomSbFragment customSbFragment = this.this$0;
                final CustomSbFragment customSbFragment2 = this.this$0;
                CustomSbFragment.installRemoteItem$default(customSbFragment, item, "Загрузка звуков стрельбы", null, new Function1<File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$loadGunSounds$adapter$2.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(File file2) {
                        invoke2(file2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(File it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        customSbFragment2.handleGunSoundSelection(it);
                    }
                }, 4, null);
            }
        });
        this.soundController.setRemote(SoundCategory.GUN, adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadButtons(List<RemoteCustomItem> items) {
        RecyclerView recyclerView = this.contentRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            recyclerView = null;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        recyclerView.setAdapter(new ButtonsAdapter(contextRequireContext, items, new C54581(this), new Function2<RemoteCustomItem, File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadButtons.2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(RemoteCustomItem remoteCustomItem, File file) {
                invoke2(remoteCustomItem, file);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RemoteCustomItem item, File file) {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(file, "<anonymous parameter 1>");
                CustomSbFragment customSbFragment = CustomSbFragment.this;
                final CustomSbFragment customSbFragment2 = CustomSbFragment.this;
                CustomSbFragment.installRemoteItem$default(customSbFragment, item, "Загрузка кнопок", null, new Function1<File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadButtons.2.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(File file2) {
                        invoke2(file2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(File it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        customSbFragment2.handleButtonsSelection(it);
                    }
                }, 4, null);
            }
        }));
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$loadButtons$1 */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    /* synthetic */ class C54581 extends FunctionReferenceImpl implements Function1<RemoteCustomItem, File> {
        C54581(Object obj) {
            super(1, obj, CustomSbFragment.class, "localFolderFor", "localFolderFor(Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomItem;)Ljava/io/File;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final File invoke(RemoteCustomItem p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((CustomSbFragment) this.receiver).localFolderFor(p0);
        }
    }

    private final void loadFoliage() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        FoliageManager foliageManager = this.foliageManager;
        RecyclerView recyclerView = null;
        if (foliageManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("foliageManager");
            foliageManager = null;
        }
        FoliageAdapter adapter = new FoliageAdapter(contextRequireContext, foliageManager.getSelectedColor(), new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$loadFoliage$adapter$1
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
                this.this$0.installTransparentFoliage();
            }
        }, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$loadFoliage$adapter$2
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
                this.this$0.showFoliageColorPicker();
            }
        });
        this.foliageAdapter = adapter;
        RecyclerView recyclerView2 = this.contentRecyclerView;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
        } else {
            recyclerView = recyclerView2;
        }
        recyclerView.setAdapter(adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadFonts(List<RemoteCustomItem> items) {
        RecyclerView recyclerView = this.contentRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            recyclerView = null;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        recyclerView.setAdapter(new FontsAdapter(contextRequireContext, items, new C54601(this), new Function2<RemoteCustomItem, File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadFonts.2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(RemoteCustomItem remoteCustomItem, File file) {
                invoke2(remoteCustomItem, file);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RemoteCustomItem item, File file) {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(file, "<anonymous parameter 1>");
                CustomSbFragment customSbFragment = CustomSbFragment.this;
                final CustomSbFragment customSbFragment2 = CustomSbFragment.this;
                CustomSbFragment.installRemoteItem$default(customSbFragment, item, "Загрузка шрифта", null, new Function1<File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadFonts.2.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(File file2) {
                        invoke2(file2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(File it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        customSbFragment2.installFont(it);
                    }
                }, 4, null);
            }
        }));
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$loadFonts$1 */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    /* synthetic */ class C54601 extends FunctionReferenceImpl implements Function1<RemoteCustomItem, File> {
        C54601(Object obj) {
            super(1, obj, CustomSbFragment.class, "localFolderFor", "localFolderFor(Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomItem;)Ljava/io/File;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final File invoke(RemoteCustomItem p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((CustomSbFragment) this.receiver).localFolderFor(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadGunPack(List<String> ids, File logosDir) {
        List<String> $this$mapNotNull$iv = ids;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            String it = (String) element$iv$iv$iv;
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(it);
            if (intOrNull != null) {
                destination$iv$iv.add(intOrNull);
            }
        }
        Iterable $this$map$iv = CollectionsKt.sortedDescending((List) destination$iv$iv);
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            int it2 = ((Number) item$iv$iv).intValue();
            destination$iv$iv2.add(String.valueOf(it2));
        }
        List sortedIds = (List) destination$iv$iv2;
        RecyclerView recyclerView = this.contentRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            recyclerView = null;
        }
        recyclerView.setAdapter(new GunPuckAdapter(sortedIds, logosDir, new Function1<String, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadGunPack.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String packId) {
                Intrinsics.checkNotNullParameter(packId, "packId");
                GunPackManager gunPackManager = CustomSbFragment.this.packManager;
                GunPackManager gunPackManager2 = null;
                if (gunPackManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("packManager");
                    gunPackManager = null;
                }
                GunPackManager gunPackManager3 = CustomSbFragment.this.packManager;
                if (gunPackManager3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("packManager");
                } else {
                    gunPackManager2 = gunPackManager3;
                }
                gunPackManager.downloadAndPack(packId, gunPackManager2.getLatestFileList());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadSkins(List<String> ids, File logosDir) {
        List<String> $this$mapNotNull$iv = ids;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            String it = (String) element$iv$iv$iv;
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(it);
            if (intOrNull != null) {
                destination$iv$iv.add(intOrNull);
            }
        }
        Iterable $this$map$iv = CollectionsKt.sortedDescending((List) destination$iv$iv);
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            int it2 = ((Number) item$iv$iv).intValue();
            destination$iv$iv2.add(String.valueOf(it2));
        }
        List sorted = (List) destination$iv$iv2;
        RecyclerView recyclerView = this.contentRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            recyclerView = null;
        }
        recyclerView.setAdapter(new SkinsAdapter(sorted, logosDir, new Function1<String, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadSkins.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String skinId) {
                Intrinsics.checkNotNullParameter(skinId, "skinId");
                SkinPackManager skinPackManager = CustomSbFragment.this.skinManager;
                if (skinPackManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("skinManager");
                    skinPackManager = null;
                }
                skinPackManager.downloadSkin(skinId);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadAccessories(List<String> ids, File logosDir) {
        List<String> $this$mapNotNull$iv = ids;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            String it = (String) element$iv$iv$iv;
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(it);
            if (intOrNull != null) {
                destination$iv$iv.add(intOrNull);
            }
        }
        Iterable $this$map$iv = CollectionsKt.sortedDescending((List) destination$iv$iv);
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            int it2 = ((Number) item$iv$iv).intValue();
            destination$iv$iv2.add(String.valueOf(it2));
        }
        List sorted = (List) destination$iv$iv2;
        RecyclerView recyclerView = this.contentRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            recyclerView = null;
        }
        recyclerView.setAdapter(new AccessoriesAdapter(sorted, logosDir, new Function1<String, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadAccessories.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String packId) {
                Intrinsics.checkNotNullParameter(packId, "packId");
                AccessoriesManager accessoriesManager = CustomSbFragment.this.accessoriesManager;
                if (accessoriesManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("accessoriesManager");
                    accessoriesManager = null;
                }
                accessoriesManager.checkSubscriptionAndMaybeShowPicker(packId);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadModels(List<String> ids, File logosDir) {
        List<String> $this$mapNotNull$iv = ids;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            String it = (String) element$iv$iv$iv;
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(it);
            if (intOrNull != null) {
                destination$iv$iv.add(intOrNull);
            }
        }
        Iterable $this$map$iv = CollectionsKt.sortedDescending((List) destination$iv$iv);
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            int it2 = ((Number) item$iv$iv).intValue();
            destination$iv$iv2.add(String.valueOf(it2));
        }
        List sorted = (List) destination$iv$iv2;
        RecyclerView recyclerView = this.contentRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            recyclerView = null;
        }
        recyclerView.setAdapter(new ModelsAdapter(sorted, logosDir, new Function1<String, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadModels.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String modelId) {
                Intrinsics.checkNotNullParameter(modelId, "modelId");
                ModelsManager modelsManager = CustomSbFragment.this.modelsManager;
                if (modelsManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("modelsManager");
                    modelsManager = null;
                }
                modelsManager.checkSubscriptionAndMaybeDownload(modelId);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadModules(List<String> ids, File logosDir) {
        List<String> $this$mapNotNull$iv = ids;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            String it = (String) element$iv$iv$iv;
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(it);
            if (intOrNull != null) {
                destination$iv$iv.add(intOrNull);
            }
        }
        Iterable $this$map$iv = CollectionsKt.sortedDescending((List) destination$iv$iv);
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            int it2 = ((Number) item$iv$iv).intValue();
            destination$iv$iv2.add(String.valueOf(it2));
        }
        List sorted = (List) destination$iv$iv2;
        RecyclerView recyclerView = this.contentRecyclerView;
        ModulesManager modulesManager = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            recyclerView = null;
        }
        ModulesManager modulesManager2 = this.modulesManager;
        if (modulesManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("modulesManager");
        } else {
            modulesManager = modulesManager2;
        }
        recyclerView.setAdapter(new ModulesAdapter(sorted, logosDir, modulesManager));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadAnimations(List<RemoteCustomItem> items) {
        RecyclerView recyclerView = this.contentRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            recyclerView = null;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        recyclerView.setAdapter(new AnimationsAdapter(contextRequireContext, items, new C54531(this), new Function1<RemoteCustomItem, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadAnimations.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RemoteCustomItem remoteCustomItem) {
                invoke2(remoteCustomItem);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RemoteCustomItem item) {
                Intrinsics.checkNotNullParameter(item, "item");
                CustomSbFragment.this.previewAnimationFromServer(item);
            }
        }, new Function2<RemoteCustomItem, File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadAnimations.3
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(RemoteCustomItem remoteCustomItem, File file) {
                invoke2(remoteCustomItem, file);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RemoteCustomItem item, File file) {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(file, "<anonymous parameter 1>");
                CustomSbFragment customSbFragment = CustomSbFragment.this;
                final CustomSbFragment customSbFragment2 = CustomSbFragment.this;
                CustomSbFragment.installRemoteItem$default(customSbFragment, item, "Загрузка анимации", null, new Function1<File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadAnimations.3.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(File file2) {
                        invoke2(file2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(File it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        customSbFragment2.installAnimation(it);
                    }
                }, 4, null);
            }
        }));
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$loadAnimations$1 */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    /* synthetic */ class C54531 extends FunctionReferenceImpl implements Function1<RemoteCustomItem, File> {
        C54531(Object obj) {
            super(1, obj, CustomSbFragment.class, "localFolderFor", "localFolderFor(Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomItem;)Ljava/io/File;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final File invoke(RemoteCustomItem p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((CustomSbFragment) this.receiver).localFolderFor(p0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    private final void loadMapColors() {
        List list;
        File base = getLocalFolder(this.MAP_BASE);
        File[] fileArrListFiles = base.listFiles();
        if (fileArrListFiles != null) {
            Collection destination$iv$iv = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    destination$iv$iv.add(file);
                }
            }
            Iterable $this$sortedBy$iv = (List) destination$iv$iv;
            list = CollectionsKt___CollectionsKt.sortedWith($this$sortedBy$iv, new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$loadMapColors$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    File it = (File) t;
                    String name = it.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(name);
                    Integer numValueOf = Integer.valueOf(intOrNull != null ? intOrNull.intValue() : Integer.MAX_VALUE);
                    File it2 = (File) t2;
                    String name2 = it2.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(name2);
                    return ComparisonsKt__ComparisonsKt.compareValues(numValueOf, Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : Integer.MAX_VALUE));
                }
            });
            if (list == null) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
        } else {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.mapAdapter = new MapColorsAdapter(contextRequireContext, list, new Function1<File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadMapColors.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(File file2) {
                invoke2(file2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(File folder) {
                Intrinsics.checkNotNullParameter(folder, "folder");
                CustomSbFragment.this.addFolderBtxToNeizzirZip(folder);
            }
        }, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.loadMapColors.2
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
                CustomSbFragment.this.showMapColorPicker();
            }
        });
        RecyclerView recyclerView = this.contentRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            recyclerView = null;
        }
        recyclerView.setAdapter(this.mapAdapter);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    private final void refreshMapColors() {
        List<? extends File> listEmptyList;
        File base = getLocalFolder(this.MAP_BASE);
        File[] fileArrListFiles = base.listFiles();
        if (fileArrListFiles != null) {
            Collection destination$iv$iv = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    destination$iv$iv.add(file);
                }
            }
            Iterable $this$sortedBy$iv = (List) destination$iv$iv;
            listEmptyList = CollectionsKt___CollectionsKt.sortedWith($this$sortedBy$iv, new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$refreshMapColors$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    File it = (File) t;
                    String name = it.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(name);
                    Integer numValueOf = Integer.valueOf(intOrNull != null ? intOrNull.intValue() : Integer.MAX_VALUE);
                    File it2 = (File) t2;
                    String name2 = it2.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(name2);
                    return ComparisonsKt__ComparisonsKt.compareValues(numValueOf, Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : Integer.MAX_VALUE));
                }
            });
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        MapColorsAdapter mapColorsAdapter = this.mapAdapter;
        if (mapColorsAdapter != null) {
            mapColorsAdapter.replaceData(listEmptyList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMapColorPicker() {
        new AmbilWarnaDialog(requireContext(), -1, new AmbilWarnaDialog.OnAmbilWarnaListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.showMapColorPicker.1
            @Override // yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
            public void onOk(AmbilWarnaDialog dialog, int color) {
                CustomSbFragment.this.recolorAndSaveSet(color);
            }

            @Override // yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
            public void onCancel(AmbilWarnaDialog dialog) {
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recolorAndSaveSet(int color) {
        Context ctx = requireContext();
        Intrinsics.checkNotNullExpressionValue(ctx, "requireContext(...)");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String hex = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(color & ViewCompat.MEASURED_SIZE_MASK)}, 1));
        Intrinsics.checkNotNullExpressionValue(hex, "format(...)");
        LauncherDialogHelper.ProgressHandle progress = LauncherDialogHelper.createDeterminateProgressDialog$default(LauncherDialogHelper.INSTANCE, ctx, "Покраска карты", 1, null, null, 24, null);
        progress.show();
        progress.setMessage("Подготовка цвета " + hex + "...");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C54891(ctx, color, progress, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$recolorAndSaveSet$1 */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$recolorAndSaveSet$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {724, 738, 743}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $color;
        final /* synthetic */ Context $ctx;
        final /* synthetic */ LauncherDialogHelper.ProgressHandle $progress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54891(Context context, int i, LauncherDialogHelper.ProgressHandle progressHandle, Continuation<? super C54891> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$color = i;
            this.$progress = progressHandle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomSbFragment.this.new C54891(this.$ctx, this.$color, this.$progress, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0079 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x007a  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object obj;
            C54891 c54891;
            MapRecolorer.Result result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C54891 c54892 = this.label;
            try {
                switch (c54892) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        Object objRecolor = CustomSbFragment.this.getMapRecolorer().recolor(this.$ctx, this.$color, new CustomSbFragment$recolorAndSaveSet$1$result$1(this.$progress, null), new CustomSbFragment$recolorAndSaveSet$1$result$2(this.$progress, null), this);
                        if (objRecolor == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        $result = objRecolor;
                        c54891 = this;
                        try {
                            result = (MapRecolorer.Result) $result;
                            c54891.label = 2;
                            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(c54891.$progress, c54891.$ctx, result, null), c54891) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        } catch (Exception e) {
                            C54891 c54893 = c54891;
                            e = e;
                            c54892 = c54893;
                            c54892.label = 3;
                            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(c54892.$progress, c54892.$ctx, e, null), c54892) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj = c54892;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        c54891 = this;
                        result = (MapRecolorer.Result) $result;
                        c54891.label = 2;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(c54891.$progress, c54891.$ctx, result, null), c54891) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 2:
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    case 3:
                        obj = this;
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e2) {
                e = e2;
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$recolorAndSaveSet$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$recolorAndSaveSet$1$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Context $ctx;
            final /* synthetic */ LauncherDialogHelper.ProgressHandle $progress;
            final /* synthetic */ MapRecolorer.Result $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LauncherDialogHelper.ProgressHandle progressHandle, Context context, MapRecolorer.Result result, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$progress = progressHandle;
                this.$ctx = context;
                this.$result = result;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$progress, this.$ctx, this.$result, continuation);
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
                        this.$progress.dismiss();
                        Toast.makeText(this.$ctx, "Карта перекрашена: " + this.$result.getProcessedCount() + " тайлов", 1).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$recolorAndSaveSet$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$recolorAndSaveSet$1$2", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Context $ctx;

            /* JADX INFO: renamed from: $e */
            final /* synthetic */ Exception f816$e;
            final /* synthetic */ LauncherDialogHelper.ProgressHandle $progress;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(LauncherDialogHelper.ProgressHandle progressHandle, Context context, Exception exc, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$progress = progressHandle;
                this.$ctx = context;
                this.f816$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$progress, this.$ctx, this.f816$e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.$progress.dismiss();
                        Toast.makeText(this.$ctx, "Ошибка: " + this.f816$e.getMessage(), 1).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFoliageColorPicker() {
        FoliageManager foliageManager = this.foliageManager;
        if (foliageManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("foliageManager");
            foliageManager = null;
        }
        int startColor = foliageManager.getSelectedColor();
        new AmbilWarnaDialog(requireContext(), startColor, new AmbilWarnaDialog.OnAmbilWarnaListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.showFoliageColorPicker.1
            @Override // yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
            public void onOk(AmbilWarnaDialog dialog, int color) {
                FoliageManager foliageManager2 = CustomSbFragment.this.foliageManager;
                if (foliageManager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("foliageManager");
                    foliageManager2 = null;
                }
                foliageManager2.setSelectedColor(color);
                FoliageAdapter foliageAdapter = CustomSbFragment.this.foliageAdapter;
                if (foliageAdapter != null) {
                    foliageAdapter.updateColor(color);
                }
                CustomSbFragment.this.installColoredFoliage(color);
            }

            @Override // yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
            public void onCancel(AmbilWarnaDialog dialog) {
            }
        }).show();
    }

    private final void setupBottomNavigation(View view) {
        LinearLayout navHome = (LinearLayout) view.findViewById(C3715R.id.neizzir_nav_home);
        LinearLayout navPlay = (LinearLayout) view.findViewById(C3715R.id.neizzir_nav_play);
        LinearLayout navMenu = (LinearLayout) view.findViewById(C3715R.id.neizzir_nav_menu);
        LinearLayout navSborks = (LinearLayout) view.findViewById(C3715R.id.neizzir_nav_sborks);
        if (navHome != null) {
            navHome.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$$ExternalSyntheticLambda10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CustomSbFragment.setupBottomNavigation$lambda$35(this.f$0, view2);
                }
            });
        }
        if (navPlay != null) {
            navPlay.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$$ExternalSyntheticLambda11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CustomSbFragment.setupBottomNavigation$lambda$36(this.f$0, view2);
                }
            });
        }
        if (navMenu != null) {
            navMenu.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CustomSbFragment.setupBottomNavigation$lambda$37(this.f$0, view2);
                }
            });
        }
        if (navSborks != null) {
            navSborks.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CustomSbFragment.setupBottomNavigation$lambda$38(this.f$0, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupBottomNavigation$lambda$35(CustomSbFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getParentFragmentManager().popBackStack((String) null, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupBottomNavigation$lambda$36(CustomSbFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new CustomSbFragment$setupBottomNavigation$2$1(this$0, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupBottomNavigation$lambda$37(CustomSbFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getParentFragmentManager().beginTransaction().replace(C3715R.id.neizzir_fragment_container, new MenuFragment()).addToBackStack(null).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupBottomNavigation$lambda$38(CustomSbFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getParentFragmentManager().beginTransaction().replace(C3715R.id.neizzir_fragment_container, new NeizzirSborksFragment()).addToBackStack(null).commit();
    }

    private final void saveState() {
        requireContext().getSharedPreferences("custom_prefs", 0).edit().putInt("category", this.currentCategory.ordinal()).putString("subcategory", this.currentSubcategory).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadSavedState() {
        Function0<Unit> action;
        SubCategory subCategory;
        String name;
        SharedPreferences prefs = requireContext().getSharedPreferences("custom_prefs", 0);
        int catIndex = prefs.getInt("category", 0);
        EnumEntries<Category> entries = Category.getEntries();
        this.currentCategory = (catIndex < 0 || catIndex > CollectionsKt__CollectionsKt.getLastIndex(entries)) ? Category.WEAPON : entries.get(catIndex);
        String str = "";
        String string = prefs.getString("subcategory", "");
        if (string == null) {
            string = "";
        }
        this.currentSubcategory = string;
        updateCategoryUI();
        if (this.currentSubcategory.length() == 0) {
            List<SubCategory> list = this.categorySubcategories.get(this.currentCategory);
            if (list != null && (subCategory = (SubCategory) CollectionsKt___CollectionsKt.firstOrNull((List) list)) != null && (name = subCategory.getName()) != null) {
                str = name;
            }
            this.currentSubcategory = str;
        }
        buildSubcategories();
        List<SubCategory> list2 = this.categorySubcategories.get(this.currentCategory);
        Object obj = null;
        if (list2 != null) {
            for (Object obj2 : list2) {
                SubCategory it = (SubCategory) obj2;
                if (Intrinsics.areEqual(it.getName(), this.currentSubcategory)) {
                    obj = obj2;
                    break;
                }
            }
            obj = (SubCategory) obj;
        }
        SubCategory subCategory2 = obj;
        if (subCategory2 == 0 || (action = subCategory2.getAction()) == null) {
            return;
        }
        action.invoke();
    }

    private final void clearAllTabs() {
        this.soundController.clear();
        RecyclerView recyclerView = this.contentRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            recyclerView = null;
        }
        recyclerView.setAdapter(null);
        RecyclerView recyclerView2 = this.contentRecyclerView;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setVisibility(0);
        BtxArchiveToolController btxArchiveToolController = this.btxToolController;
        if (btxArchiveToolController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btxToolController");
            btxArchiveToolController = null;
        }
        btxArchiveToolController.clear();
        LinearLayout linearLayout = this.skySettingsLayout;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("skySettingsLayout");
            linearLayout = null;
        }
        linearLayout.setVisibility(8);
        this.foliageAdapter = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void installFont(File folder) {
        ProgressDialogHelper progressDialogHelper = ProgressDialogHelper.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Dialog dialog = progressDialogHelper.show(contextRequireContext, "Установка шрифта", "Копирование файла...");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new C54481(folder, this, dialog, null), 2, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installFont$1 */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installFont$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {847, 856, 861}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Dialog $dialog;
        final /* synthetic */ File $folder;
        int label;
        final /* synthetic */ CustomSbFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54481(File file, CustomSbFragment customSbFragment, Dialog dialog, Continuation<? super C54481> continuation) {
            super(2, continuation);
            this.$folder = file;
            this.this$0 = customSbFragment;
            this.$dialog = dialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54481(this.$folder, this.this$0, this.$dialog, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installFont$1, int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            ?? r0;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                switch (r1) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        File fontFile = new File(this.$folder, "arial.ttf");
                        if (!fontFile.exists()) {
                            this.label = 1;
                            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$dialog, this.this$0, null), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        CustomResources customResources = CustomResources.INSTANCE;
                        Context contextRequireContext = this.this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        customResources.installFiles(contextRequireContext, MapsKt__MapsJVMKt.mapOf(TuplesKt.m4423to("fonts/arial.ttf", fontFile)));
                        this.label = 2;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(this.$dialog, this.this$0, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    case 2:
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    case 3:
                        r0 = this;
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e) {
                r1.label = 3;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(r1.$dialog, r1.this$0, e, null), (Continuation) r1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r0 = r1;
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installFont$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installFont$1$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Dialog $dialog;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Dialog dialog, CustomSbFragment customSbFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$dialog = dialog;
                this.this$0 = customSbFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$dialog, this.this$0, continuation);
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
                        this.$dialog.dismiss();
                        Toast.makeText(this.this$0.requireContext(), "Шрифт не найден", 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installFont$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installFont$1$2", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Dialog $dialog;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Dialog dialog, CustomSbFragment customSbFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$dialog = dialog;
                this.this$0 = customSbFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$dialog, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.$dialog.dismiss();
                        Toast.makeText(this.this$0.requireContext(), "✓ Шрифт установлен", 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installFont$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installFont$1$3", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Dialog $dialog;

            /* JADX INFO: renamed from: $e */
            final /* synthetic */ Exception f815$e;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Dialog dialog, CustomSbFragment customSbFragment, Exception exc, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$dialog = dialog;
                this.this$0 = customSbFragment;
                this.f815$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$dialog, this.this$0, this.f815$e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.$dialog.dismiss();
                        Toast.makeText(this.this$0.requireContext(), "Ошибка: " + this.f815$e.getMessage(), 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleScopeSelection(File folder) {
        ProgressDialogHelper progressDialogHelper = ProgressDialogHelper.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Dialog dialog = progressDialogHelper.show(contextRequireContext, "Установка прицела", "Добавление в архив...");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new C54451(folder, this, dialog, null), 2, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleScopeSelection$1 */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleScopeSelection$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {876, 885, 890}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Dialog $dialog;
        final /* synthetic */ File $folder;
        int label;
        final /* synthetic */ CustomSbFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54451(File file, CustomSbFragment customSbFragment, Dialog dialog, Continuation<? super C54451> continuation) {
            super(2, continuation);
            this.$folder = file;
            this.this$0 = customSbFragment;
            this.$dialog = dialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54451(this.$folder, this.this$0, this.$dialog, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleScopeSelection$1, int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            ?? r0;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                switch (r1) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        File btx = new File(this.$folder, "siteM16.btx");
                        if (!btx.exists()) {
                            this.label = 1;
                            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$dialog, this.this$0, null), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        CustomResources customResources = CustomResources.INSTANCE;
                        Context contextRequireContext = this.this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        customResources.installTextures(contextRequireContext, CollectionsKt__CollectionsJVMKt.listOf(btx));
                        this.label = 2;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(this.$dialog, this.this$0, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    case 2:
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    case 3:
                        r0 = this;
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e) {
                r1.label = 3;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(r1.$dialog, r1.this$0, e, null), (Continuation) r1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r0 = r1;
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleScopeSelection$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleScopeSelection$1$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Dialog $dialog;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Dialog dialog, CustomSbFragment customSbFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$dialog = dialog;
                this.this$0 = customSbFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$dialog, this.this$0, continuation);
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
                        this.$dialog.dismiss();
                        Toast.makeText(this.this$0.requireContext(), "siteM16.btx не найден", 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleScopeSelection$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleScopeSelection$1$2", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Dialog $dialog;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Dialog dialog, CustomSbFragment customSbFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$dialog = dialog;
                this.this$0 = customSbFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$dialog, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.$dialog.dismiss();
                        Toast.makeText(this.this$0.requireContext(), "✓ Прицел установлен", 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleScopeSelection$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleScopeSelection$1$3", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Dialog $dialog;

            /* JADX INFO: renamed from: $e */
            final /* synthetic */ Exception f813$e;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Dialog dialog, CustomSbFragment customSbFragment, Exception exc, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$dialog = dialog;
                this.this$0 = customSbFragment;
                this.f813$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$dialog, this.this$0, this.f813$e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.$dialog.dismiss();
                        Toast.makeText(this.this$0.requireContext(), "Ошибка: " + this.f813$e.getMessage(), 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleBloodSelection(File folder) {
        ProgressDialogHelper progressDialogHelper = ProgressDialogHelper.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Dialog dialog = progressDialogHelper.show(contextRequireContext, "Установка крови", "Копирование файлов...");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new C54421(folder, this, dialog, null), 2, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleBloodSelection$1 */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleBloodSelection$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {907, 919, 924}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Dialog $dialog;
        final /* synthetic */ File $folder;
        int label;
        final /* synthetic */ CustomSbFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54421(File file, CustomSbFragment customSbFragment, Dialog dialog, Continuation<? super C54421> continuation) {
            super(2, continuation);
            this.$folder = file;
            this.this$0 = customSbFragment;
            this.$dialog = dialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54421(this.$folder, this.this$0, this.$dialog, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleBloodSelection$1, int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            ?? r0;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                switch (r1) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        final File cfg = new File(this.$folder, "particle.cfg");
                        final File btx = new File(this.$folder, "bloodsplat2.btx");
                        if (cfg.exists() && btx.exists()) {
                            CustomResources customResources = CustomResources.INSTANCE;
                            Context contextRequireContext = this.this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                            customResources.edit(contextRequireContext, new Function1<File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment.handleBloodSelection.1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(File file) throws IOException {
                                    invoke2(file);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(File stage) throws IOException {
                                    Intrinsics.checkNotNullParameter(stage, "stage");
                                    CustomResourceStore.INSTANCE.copy(cfg, new File(stage, "data/particle.cfg"));
                                    CustomResources customResources2 = CustomResources.INSTANCE;
                                    File file = btx;
                                    String name = btx.getName();
                                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                                    customResources2.putTexture(stage, file, name);
                                }
                            });
                            this.label = 2;
                            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(this.$dialog, this.this$0, null), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        this.label = 1;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$dialog, this.this$0, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    case 2:
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    case 3:
                        r0 = this;
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e) {
                r1.label = 3;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass4(r1.$dialog, r1.this$0, e, null), (Continuation) r1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r0 = r1;
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleBloodSelection$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleBloodSelection$1$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Dialog $dialog;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Dialog dialog, CustomSbFragment customSbFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$dialog = dialog;
                this.this$0 = customSbFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$dialog, this.this$0, continuation);
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
                        this.$dialog.dismiss();
                        Toast.makeText(this.this$0.requireContext(), "Файлы не найдены", 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleBloodSelection$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleBloodSelection$1$3", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Dialog $dialog;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Dialog dialog, CustomSbFragment customSbFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$dialog = dialog;
                this.this$0 = customSbFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$dialog, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.$dialog.dismiss();
                        Toast.makeText(this.this$0.requireContext(), "✓ Кровь установлена", 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleBloodSelection$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleBloodSelection$1$4", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Dialog $dialog;

            /* JADX INFO: renamed from: $e */
            final /* synthetic */ Exception f811$e;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Dialog dialog, CustomSbFragment customSbFragment, Exception exc, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$dialog = dialog;
                this.this$0 = customSbFragment;
                this.f811$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$dialog, this.this$0, this.f811$e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.$dialog.dismiss();
                        Toast.makeText(this.this$0.requireContext(), "Ошибка: " + this.f811$e.getMessage(), 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSoundSelection(File folder) {
        this.soundController.installRemote(SoundCategory.HIT, folder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleGunSoundSelection(File folder) {
        this.soundController.installRemote(SoundCategory.GUN, folder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleButtonsSelection(File folder) {
        ProgressDialogHelper progressDialogHelper = ProgressDialogHelper.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Dialog dialog = progressDialogHelper.show(contextRequireContext, "Установка кнопок", "Упаковка текстур...");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new C54431(folder, this, dialog, null), 2, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleButtonsSelection$1 */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleButtonsSelection$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {947, 956, 961}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Dialog $dialog;
        final /* synthetic */ File $folder;
        int label;
        final /* synthetic */ CustomSbFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54431(File file, CustomSbFragment customSbFragment, Dialog dialog, Continuation<? super C54431> continuation) {
            super(2, continuation);
            this.$folder = file;
            this.this$0 = customSbFragment;
            this.$dialog = dialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54431(this.$folder, this.this$0, this.$dialog, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleButtonsSelection$1, int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            ?? r0;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                switch (r1) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        File[] btxFiles = this.$folder.listFiles(new FilenameFilter() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleButtonsSelection$1$$ExternalSyntheticLambda0
                            @Override // java.io.FilenameFilter
                            public final boolean accept(File file, String str) {
                                return CustomSbFragment.C54431.invokeSuspend$lambda$0(file, str);
                            }
                        });
                        if (btxFiles == null) {
                            btxFiles = new File[0];
                        }
                        if (btxFiles.length == 0) {
                            this.label = 1;
                            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$dialog, this.this$0, null), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        CustomResources customResources = CustomResources.INSTANCE;
                        Context contextRequireContext = this.this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        customResources.installTextures(contextRequireContext, ArraysKt___ArraysKt.toList(btxFiles));
                        this.label = 2;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(this.$dialog, this.this$0, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    case 2:
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    case 3:
                        r0 = this;
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e) {
                r1.label = 3;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(r1.$dialog, r1.this$0, e, null), (Continuation) r1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r0 = r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(File file, String name) {
            Intrinsics.checkNotNull(name);
            return StringsKt__StringsJVMKt.endsWith$default(name, ".btx", false, 2, null);
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleButtonsSelection$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleButtonsSelection$1$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Dialog $dialog;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Dialog dialog, CustomSbFragment customSbFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$dialog = dialog;
                this.this$0 = customSbFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$dialog, this.this$0, continuation);
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
                        this.$dialog.dismiss();
                        Toast.makeText(this.this$0.requireContext(), "Нет .btx файлов", 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleButtonsSelection$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleButtonsSelection$1$2", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Dialog $dialog;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Dialog dialog, CustomSbFragment customSbFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$dialog = dialog;
                this.this$0 = customSbFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$dialog, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.$dialog.dismiss();
                        Toast.makeText(this.this$0.requireContext(), "✓ Кнопки установлены", 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleButtonsSelection$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$handleButtonsSelection$1$3", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Dialog $dialog;

            /* JADX INFO: renamed from: $e */
            final /* synthetic */ Exception f812$e;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Dialog dialog, CustomSbFragment customSbFragment, Exception exc, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$dialog = dialog;
                this.this$0 = customSbFragment;
                this.f812$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$dialog, this.this$0, this.f812$e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.$dialog.dismiss();
                        Toast.makeText(this.this$0.requireContext(), "Ошибка: " + this.f812$e.getMessage(), 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installTransparentFoliage$1 */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4415d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00032(\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\tH\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager$Result;", "onTitle", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "", "onStep", "Lkotlin/Function3;", ""}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installTransparentFoliage$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {971}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54511 extends SuspendLambda implements Function3<Function2<? super String, ? super Continuation<? super Unit>, ? extends Object>, Function3<? super Integer, ? super Integer, ? super Continuation<? super Unit>, ? extends Object>, Continuation<? super FoliageManager.Result>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C54511(Continuation<? super C54511> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function2, Function3<? super Integer, ? super Integer, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super FoliageManager.Result> continuation) {
            C54511 c54511 = CustomSbFragment.this.new C54511(continuation);
            c54511.L$0 = function2;
            c54511.L$1 = function3;
            return c54511.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function2 = (Function2) this.L$0;
                    Function3<? super Integer, ? super Integer, ? super Continuation<? super Unit>, ? extends Object> function3 = (Function3) this.L$1;
                    FoliageManager foliageManager = CustomSbFragment.this.foliageManager;
                    if (foliageManager == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("foliageManager");
                        foliageManager = null;
                    }
                    this.L$0 = null;
                    this.label = 1;
                    Object objInstallTransparent = foliageManager.installTransparent(function2, function3, this);
                    return objInstallTransparent == coroutine_suspended ? coroutine_suspended : objInstallTransparent;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void installTransparentFoliage() {
        runFoliageInstall("Установка листвы", new C54511(null));
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installColoredFoliage$1 */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4415d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00032(\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\tH\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager$Result;", "onTitle", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "", "onStep", "Lkotlin/Function3;", ""}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installColoredFoliage$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {977}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54471 extends SuspendLambda implements Function3<Function2<? super String, ? super Continuation<? super Unit>, ? extends Object>, Function3<? super Integer, ? super Integer, ? super Continuation<? super Unit>, ? extends Object>, Continuation<? super FoliageManager.Result>, Object> {
        final /* synthetic */ int $color;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54471(int i, Continuation<? super C54471> continuation) {
            super(3, continuation);
            this.$color = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function2, Function3<? super Integer, ? super Integer, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super FoliageManager.Result> continuation) {
            C54471 c54471 = CustomSbFragment.this.new C54471(this.$color, continuation);
            c54471.L$0 = function2;
            c54471.L$1 = function3;
            return c54471.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function2 = (Function2) this.L$0;
                    Function3<? super Integer, ? super Integer, ? super Continuation<? super Unit>, ? extends Object> function3 = (Function3) this.L$1;
                    FoliageManager foliageManager = CustomSbFragment.this.foliageManager;
                    if (foliageManager == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("foliageManager");
                        foliageManager = null;
                    }
                    this.L$0 = null;
                    this.label = 1;
                    Object objInstallColored = foliageManager.installColored(this.$color, function2, function3, this);
                    return objInstallColored == coroutine_suspended ? coroutine_suspended : objInstallColored;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void installColoredFoliage(int color) {
        runFoliageInstall("Покраска листвы", new C54471(color, null));
    }

    private final void runFoliageInstall(String title, Function3<? super Function2<? super String, ? super Continuation<? super Unit>, ? extends Object>, ? super Function3<? super Integer, ? super Integer, ? super Continuation<? super Unit>, ? extends Object>, ? super Continuation<? super FoliageManager.Result>, ? extends Object> installer) {
        Context ctx = requireContext();
        Intrinsics.checkNotNullExpressionValue(ctx, "requireContext(...)");
        LauncherDialogHelper.ProgressHandle progress = LauncherDialogHelper.createDeterminateProgressDialog$default(LauncherDialogHelper.INSTANCE, ctx, title, 1, null, null, 24, null);
        progress.show();
        progress.setMessage("Подготовка листвы...");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new C54921(installer, progress, ctx, this, null), 2, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$runFoliageInstall$1 */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$runFoliageInstall$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {999, 1012, AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ Function3<Function2<? super String, ? super Continuation<? super Unit>, ? extends Object>, Function3<? super Integer, ? super Integer, ? super Continuation<? super Unit>, ? extends Object>, Continuation<? super FoliageManager.Result>, Object> $installer;
        final /* synthetic */ LauncherDialogHelper.ProgressHandle $progress;
        int label;
        final /* synthetic */ CustomSbFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C54921(Function3<? super Function2<? super String, ? super Continuation<? super Unit>, ? extends Object>, ? super Function3<? super Integer, ? super Integer, ? super Continuation<? super Unit>, ? extends Object>, ? super Continuation<? super FoliageManager.Result>, ? extends Object> function3, LauncherDialogHelper.ProgressHandle progressHandle, Context context, CustomSbFragment customSbFragment, Continuation<? super C54921> continuation) {
            super(2, continuation);
            this.$installer = function3;
            this.$progress = progressHandle;
            this.$ctx = context;
            this.this$0 = customSbFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54921(this.$installer, this.$progress, this.$ctx, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0070 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x0071  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C54921 c54921;
            Exception exc;
            Object obj2;
            C54921 c54922;
            FoliageManager.Result result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                switch (r1) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        Function3<Function2<? super String, ? super Continuation<? super Unit>, ? extends Object>, Function3<? super Integer, ? super Integer, ? super Continuation<? super Unit>, ? extends Object>, Continuation<? super FoliageManager.Result>, Object> function3 = this.$installer;
                        CustomSbFragment$runFoliageInstall$1$result$1 customSbFragment$runFoliageInstall$1$result$1 = new CustomSbFragment$runFoliageInstall$1$result$1(this.$progress, null);
                        CustomSbFragment$runFoliageInstall$1$result$2 customSbFragment$runFoliageInstall$1$result$2 = new CustomSbFragment$runFoliageInstall$1$result$2(this.$progress, null);
                        this.label = 1;
                        Object objInvoke = function3.invoke(customSbFragment$runFoliageInstall$1$result$1, customSbFragment$runFoliageInstall$1$result$2, this);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = objInvoke;
                        c54922 = this;
                        try {
                            result = (FoliageManager.Result) obj;
                            c54922.label = 2;
                            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(c54922.$progress, c54922.$ctx, result, c54922.this$0, null), c54922) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        } catch (Exception e) {
                            exc = e;
                            c54921 = c54922;
                            c54921.label = 3;
                            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(c54921.$progress, c54921.$ctx, exc, null), c54921) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj2 = c54921;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure(obj);
                        c54922 = this;
                        result = (FoliageManager.Result) obj;
                        c54922.label = 2;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(c54922.$progress, c54922.$ctx, result, c54922.this$0, null), c54922) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 2:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 3:
                        obj2 = this;
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e2) {
                c54921 = r1;
                exc = e2;
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$runFoliageInstall$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$runFoliageInstall$1$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Context $ctx;
            final /* synthetic */ LauncherDialogHelper.ProgressHandle $progress;
            final /* synthetic */ FoliageManager.Result $result;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LauncherDialogHelper.ProgressHandle progressHandle, Context context, FoliageManager.Result result, CustomSbFragment customSbFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$progress = progressHandle;
                this.$ctx = context;
                this.$result = result;
                this.this$0 = customSbFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$progress, this.$ctx, this.$result, this.this$0, continuation);
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
                        this.$progress.dismiss();
                        Toast.makeText(this.$ctx, "✓ Листва установлена: " + this.$result.getAppliedCount() + " текстур", 1).show();
                        FoliageAdapter foliageAdapter = this.this$0.foliageAdapter;
                        FoliageManager foliageManager = null;
                        if (foliageAdapter == null) {
                            return null;
                        }
                        FoliageManager foliageManager2 = this.this$0.foliageManager;
                        if (foliageManager2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("foliageManager");
                        } else {
                            foliageManager = foliageManager2;
                        }
                        foliageAdapter.updateColor(foliageManager.getSelectedColor());
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$runFoliageInstall$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$runFoliageInstall$1$2", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Context $ctx;

            /* JADX INFO: renamed from: $e */
            final /* synthetic */ Exception f820$e;
            final /* synthetic */ LauncherDialogHelper.ProgressHandle $progress;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(LauncherDialogHelper.ProgressHandle progressHandle, Context context, Exception exc, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$progress = progressHandle;
                this.$ctx = context;
                this.f820$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$progress, this.$ctx, this.f820$e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.$progress.dismiss();
                        Toast.makeText(this.$ctx, "Ошибка: " + this.f820$e.getMessage(), 1).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addFolderBtxToNeizzirZip(File folder) {
        ProgressDialogHelper progressDialogHelper = ProgressDialogHelper.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Dialog dialog = progressDialogHelper.show(contextRequireContext, "Установка карты", "Упаковка текстур...");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new C54401(folder, this, dialog, null), 2, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$addFolderBtxToNeizzirZip$1 */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$addFolderBtxToNeizzirZip$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {1038, 1047, FieldBehaviorProto.FIELD_BEHAVIOR_FIELD_NUMBER}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Dialog $dialog;
        final /* synthetic */ File $folder;
        int label;
        final /* synthetic */ CustomSbFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54401(File file, CustomSbFragment customSbFragment, Dialog dialog, Continuation<? super C54401> continuation) {
            super(2, continuation);
            this.$folder = file;
            this.this$0 = customSbFragment;
            this.$dialog = dialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54401(this.$folder, this.this$0, this.$dialog, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$addFolderBtxToNeizzirZip$1, int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            ?? r0;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                switch (r1) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        File[] fileArrListFiles = this.$folder.listFiles(new FilenameFilter() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$addFolderBtxToNeizzirZip$1$$ExternalSyntheticLambda0
                            @Override // java.io.FilenameFilter
                            public final boolean accept(File file, String str) {
                                return CustomSbFragment.C54401.invokeSuspend$lambda$0(file, str);
                            }
                        });
                        List<? extends File> list = fileArrListFiles != null ? ArraysKt___ArraysKt.toList(fileArrListFiles) : null;
                        if (list == null) {
                            list = CollectionsKt__CollectionsKt.emptyList();
                        }
                        if (list.isEmpty()) {
                            this.label = 1;
                            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$dialog, this.this$0, null), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        CustomResources customResources = CustomResources.INSTANCE;
                        Context contextRequireContext = this.this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        customResources.installTextures(contextRequireContext, list);
                        this.label = 2;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(this.$dialog, this.this$0, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    case 2:
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    case 3:
                        r0 = this;
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e) {
                r1.label = 3;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(r1.$dialog, r1.this$0, e, null), (Continuation) r1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r0 = r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(File file, String n) {
            Intrinsics.checkNotNull(n);
            return StringsKt__StringsJVMKt.endsWith(n, ".btx", true);
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$addFolderBtxToNeizzirZip$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$addFolderBtxToNeizzirZip$1$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Dialog $dialog;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Dialog dialog, CustomSbFragment customSbFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$dialog = dialog;
                this.this$0 = customSbFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$dialog, this.this$0, continuation);
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
                        this.$dialog.dismiss();
                        Toast.makeText(this.this$0.requireContext(), "Нет .btx для добавления", 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$addFolderBtxToNeizzirZip$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$addFolderBtxToNeizzirZip$1$2", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Dialog $dialog;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Dialog dialog, CustomSbFragment customSbFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$dialog = dialog;
                this.this$0 = customSbFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$dialog, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.$dialog.dismiss();
                        Toast.makeText(this.this$0.requireContext(), "✓ Карта установлена", 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$addFolderBtxToNeizzirZip$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$addFolderBtxToNeizzirZip$1$3", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Dialog $dialog;

            /* JADX INFO: renamed from: $e */
            final /* synthetic */ Exception f810$e;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Dialog dialog, CustomSbFragment customSbFragment, Exception exc, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$dialog = dialog;
                this.this$0 = customSbFragment;
                this.f810$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$dialog, this.this$0, this.f810$e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.$dialog.dismiss();
                        Toast.makeText(this.this$0.requireContext(), "Ошибка: " + this.f810$e.getMessage(), 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void installAnimation(File folder) {
        ProgressDialogHelper progressDialogHelper = ProgressDialogHelper.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Dialog dialog = progressDialogHelper.show(contextRequireContext, "Установка анимации", "Копирование файла...");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new C54461(folder, this, dialog, null), 2, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installAnimation$1 */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installAnimation$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {1068, 1077, 1082}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Dialog $dialog;
        final /* synthetic */ File $folder;
        int label;
        final /* synthetic */ CustomSbFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54461(File file, CustomSbFragment customSbFragment, Dialog dialog, Continuation<? super C54461> continuation) {
            super(2, continuation);
            this.$folder = file;
            this.this$0 = customSbFragment;
            this.$dialog = dialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54461(this.$folder, this.this$0, this.$dialog, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installAnimation$1, int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            ?? r0;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                switch (r1) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        File src = new File(this.$folder, "ped.ani");
                        if (!src.exists()) {
                            this.label = 1;
                            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$dialog, this.this$0, null), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        CustomResources customResources = CustomResources.INSTANCE;
                        Context contextRequireContext = this.this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        customResources.installFiles(contextRequireContext, MapsKt__MapsJVMKt.mapOf(TuplesKt.m4423to("anim/ped.ani", src)));
                        this.label = 2;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(this.$dialog, this.this$0, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    case 2:
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    case 3:
                        r0 = this;
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e) {
                r1.label = 3;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(r1.$dialog, r1.this$0, e, null), (Continuation) r1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r0 = r1;
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installAnimation$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installAnimation$1$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Dialog $dialog;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Dialog dialog, CustomSbFragment customSbFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$dialog = dialog;
                this.this$0 = customSbFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$dialog, this.this$0, continuation);
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
                        this.$dialog.dismiss();
                        Toast.makeText(this.this$0.requireContext(), "ped.ani не найден", 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installAnimation$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installAnimation$1$2", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Dialog $dialog;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Dialog dialog, CustomSbFragment customSbFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$dialog = dialog;
                this.this$0 = customSbFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$dialog, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.$dialog.dismiss();
                        Toast.makeText(this.this$0.requireContext(), "✓ Анимация установлена", 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installAnimation$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: CustomSbFragment.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$installAnimation$1$3", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Dialog $dialog;

            /* JADX INFO: renamed from: $e */
            final /* synthetic */ Exception f814$e;
            int label;
            final /* synthetic */ CustomSbFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Dialog dialog, CustomSbFragment customSbFragment, Exception exc, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$dialog = dialog;
                this.this$0 = customSbFragment;
                this.f814$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$dialog, this.this$0, this.f814$e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.$dialog.dismiss();
                        Toast.makeText(this.this$0.requireContext(), "Ошибка: " + this.f814$e.getMessage(), 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void previewAnimationFromServer(RemoteCustomItem item) {
        Context ctx = requireContext();
        Intrinsics.checkNotNullExpressionValue(ctx, "requireContext(...)");
        String rel = item.getVideoPath();
        if (rel == null) {
            rel = "anim/" + item.getId() + "/video.mp44";
        }
        String path = "/api/fetch_file/" + rel;
        final ExoPlayer exo = new ExoPlayer.Builder(ctx).build();
        Intrinsics.checkNotNullExpressionValue(exo, "build(...)");
        PlayerView $this$previewAnimationFromServer_u24lambda_u2441 = new PlayerView(ctx);
        $this$previewAnimationFromServer_u24lambda_u2441.setUseController(true);
        $this$previewAnimationFromServer_u24lambda_u2441.setPlayer(exo);
        AlertDialog dialog = new AlertDialog.Builder(ctx).setView($this$previewAnimationFromServer_u24lambda_u2441).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$$ExternalSyntheticLambda8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CustomSbFragment.previewAnimationFromServer$lambda$42(exo, dialogInterface);
            }
        }).create();
        Intrinsics.checkNotNullExpressionValue(dialog, "create(...)");
        Ref.BooleanRef attemptedFallback = new Ref.BooleanRef();
        dialog.show();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C54881(ctx, dialog, path, exo, attemptedFallback, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewAnimationFromServer$lambda$42(ExoPlayer exo, DialogInterface it) {
        Intrinsics.checkNotNullParameter(exo, "$exo");
        exo.release();
    }

    static /* synthetic */ void previewAnimationFromServer$play$default(String str, ExoPlayer exoPlayer, Ref.BooleanRef booleanRef, Context context, AlertDialog alertDialog, Endpoint endpoint, long j, int i, Object obj) {
        previewAnimationFromServer$play(str, exoPlayer, booleanRef, context, alertDialog, endpoint, (i & 64) != 0 ? 0L : j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewAnimationFromServer$play(final String path, final ExoPlayer exo, final Ref.BooleanRef attemptedFallback, final Context ctx, final AlertDialog dialog, final Endpoint endpoint, long position) {
        HttpUrl url = NetworkRuntime.INSTANCE.getRouter().urlFor(EndpointGroup.KOLSON, path, endpoint);
        exo.setMediaItem(MediaItem.fromUri(url.getUrl()));
        exo.seekTo(position);
        exo.prepare();
        exo.setPlayWhenReady(true);
        exo.addListener(new Player.Listener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$previewAnimationFromServer$play$1
            @Override // androidx.media3.common.Player.Listener
            public void onPlayerError(PlaybackException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                exo.removeListener(this);
                NetworkRuntime.INSTANCE.getRouter().reportFailure(EndpointGroup.KOLSON, endpoint);
                Endpoint fallback = NetworkRuntime.INSTANCE.getRouter().alternateEndpoint(EndpointGroup.KOLSON, endpoint);
                if (!attemptedFallback.element && fallback != null) {
                    attemptedFallback.element = true;
                    CustomSbFragment.previewAnimationFromServer$play(path, exo, attemptedFallback, ctx, dialog, fallback, exo.getCurrentPosition());
                } else {
                    Toast.makeText(ctx, "Видео недоступно", 0).show();
                    dialog.dismiss();
                }
            }
        });
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$previewAnimationFromServer$1 */
    /* JADX INFO: compiled from: CustomSbFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.ui.CustomSbFragment$previewAnimationFromServer$1", m4426f = "CustomSbFragment.kt", m4427i = {}, m4428l = {1132}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.BooleanRef $attemptedFallback;
        final /* synthetic */ Context $ctx;
        final /* synthetic */ AlertDialog $dialog;
        final /* synthetic */ ExoPlayer $exo;
        final /* synthetic */ String $path;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54881(Context context, AlertDialog alertDialog, String str, ExoPlayer exoPlayer, Ref.BooleanRef booleanRef, Continuation<? super C54881> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$dialog = alertDialog;
            this.$path = str;
            this.$exo = exoPlayer;
            this.$attemptedFallback = booleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C54881 c54881 = new C54881(this.$ctx, this.$dialog, this.$path, this.$exo, this.$attemptedFallback, continuation);
            c54881.L$0 = obj;
            return c54881;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0062  */
        /* JADX WARN: Code duplicated, block: B:28:0x0068  */
        /* JADX WARN: Code duplicated, block: B:30:0x007f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C54881 c54881;
            Throwable th;
            C54881 c54882;
            Object $result2;
            Endpoint endpoint;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c54881 = this;
                    String str = c54881.$path;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                        EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                        c54881.label = 1;
                        Object objResolveEndpointForDownload = router.resolveEndpointForDownload(endpointGroup, str, c54881);
                        if (objResolveEndpointForDownload == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        $result = objResolveEndpointForDownload;
                        try {
                            $result2 = Result.m15551constructorimpl((Endpoint) $result);
                            break;
                        } catch (Throwable th2) {
                            C54881 c54883 = c54881;
                            th = th2;
                            $result = $result;
                            c54882 = c54883;
                            Result.Companion companion2 = Result.INSTANCE;
                            $result2 = Result.m15551constructorimpl(ResultKt.createFailure(th));
                            c54881 = c54882;
                        }
                        if (Result.m15557isFailureimpl($result2)) {
                            $result2 = null;
                        }
                        endpoint = (Endpoint) $result2;
                        if (endpoint == null) {
                            CustomSbFragment.previewAnimationFromServer$play$default(c54881.$path, c54881.$exo, c54881.$attemptedFallback, c54881.$ctx, c54881.$dialog, endpoint, 0L, 64, null);
                            return Unit.INSTANCE;
                        }
                        Toast.makeText(c54881.$ctx, "Видео недоступно", 0).show();
                        c54881.$dialog.dismiss();
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        th = th3;
                        c54882 = c54881;
                        Result.Companion companion3 = Result.INSTANCE;
                        $result2 = Result.m15551constructorimpl(ResultKt.createFailure(th));
                        c54881 = c54882;
                        if (Result.m15557isFailureimpl($result2)) {
                            $result2 = null;
                        }
                        endpoint = (Endpoint) $result2;
                        if (endpoint == null) {
                            CustomSbFragment.previewAnimationFromServer$play$default(c54881.$path, c54881.$exo, c54881.$attemptedFallback, c54881.$ctx, c54881.$dialog, endpoint, 0L, 64, null);
                            return Unit.INSTANCE;
                        }
                        Toast.makeText(c54881.$ctx, "Видео недоступно", 0).show();
                        c54881.$dialog.dismiss();
                        return Unit.INSTANCE;
                    }
                case 1:
                    c54882 = this;
                    try {
                        ResultKt.throwOnFailure($result);
                        c54881 = c54882;
                        $result2 = Result.m15551constructorimpl((Endpoint) $result);
                        break;
                    } catch (Throwable th4) {
                        th = th4;
                        Result.Companion companion4 = Result.INSTANCE;
                        $result2 = Result.m15551constructorimpl(ResultKt.createFailure(th));
                        c54881 = c54882;
                        if (Result.m15557isFailureimpl($result2)) {
                            $result2 = null;
                        }
                        endpoint = (Endpoint) $result2;
                        if (endpoint == null) {
                            CustomSbFragment.previewAnimationFromServer$play$default(c54881.$path, c54881.$exo, c54881.$attemptedFallback, c54881.$ctx, c54881.$dialog, endpoint, 0L, 64, null);
                            return Unit.INSTANCE;
                        }
                        Toast.makeText(c54881.$ctx, "Видео недоступно", 0).show();
                        c54881.$dialog.dismiss();
                        return Unit.INSTANCE;
                    }
                    if (Result.m15557isFailureimpl($result2)) {
                        $result2 = null;
                    }
                    endpoint = (Endpoint) $result2;
                    if (endpoint == null) {
                        CustomSbFragment.previewAnimationFromServer$play$default(c54881.$path, c54881.$exo, c54881.$attemptedFallback, c54881.$ctx, c54881.$dialog, endpoint, 0L, 64, null);
                        return Unit.INSTANCE;
                    }
                    Toast.makeText(c54881.$ctx, "Видео недоступно", 0).show();
                    c54881.$dialog.dismiss();
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final int dpToPx(int dp) {
        return (int) (dp * getResources().getDisplayMetrics().density);
    }

    @Override // com.blackhub.bronline.neizzir.fragments.custom.util.TabContentLoader.ProgressHolder
    public void showProgress(boolean show) {
        showLoading(show);
    }
}
