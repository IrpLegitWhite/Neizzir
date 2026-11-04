package com.blackhub.bronline.neizzir.umbrella;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.provider.Settings;
import android.util.Log;
import androidx.media3.extractor.p007ts.TsExtractor;
import com.blackhub.bronline.game.core.constants.Other;
import com.blackhub.bronline.game.core.constants.ScreenId;
import com.blackhub.bronline.game.gui.donate.utils.DonateConstants;
import com.blackhub.bronline.neizzir.KolsonLibrary;
import com.blackhub.bronline.neizzir.activities.main.settings.SettingsRepository;
import com.blackhub.bronline.neizzir.activities.main.updates.LauncherVersioningKt;
import com.blackhub.bronline.neizzir.activities.main.util.KeyManager;
import com.blackhub.bronline.neizzir.activities.main.util.NativeLibraryLoader;
import com.blackhub.bronline.neizzir.network.CachePolicy;
import com.blackhub.bronline.neizzir.network.DownloadSpec;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.EndpointRouter;
import com.blackhub.bronline.neizzir.network.NetworkResult;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import com.helpshift.proactive.InAppViewConstants;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.p043io.files.FileSystemKt;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: UmbrellaManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001>B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0087@¢\u0006\u0002\u0010\u0019J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u0019J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010!\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\u001b2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010'\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010(\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010)\u001a\n +*\u0004\u0018\u00010*0*2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010,\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u0019J8\u0010.\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u00062\b\b\u0002\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u00020\u0006H\u0002J\u000e\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u0004J\u0016\u00106\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0019J\u0010\u00107\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u00108\u001a\u0004\u0018\u00010-2\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u0019J\u001e\u00109\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u0004H\u0086@¢\u0006\u0002\u0010;J\u001e\u0010<\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010=R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006?"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaManager;", "", "()V", "CHANNEL_URL", "", "isLoaded", "", "()Z", "loadedIdentity", "loadedManaged", "loadedPath", "mutableState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaState;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "applyPendingCommand", "", "c", "Landroid/content/Context;", "beforeGame", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "catalog", "", "Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaBuild;", "checkAccess", "command", InAppViewConstants.CONFIG, "Ljava/io/File;", "enabled", "identity", "Lkotlin/Pair;", "Lorg/json/JSONObject;", "kolsonCommand", "manualCopies", "onKeyChanged", "pending", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "prepare", "Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaManager$Prepared;", "publish", "message", "busy", "progress", "", "restart", "recordManualLoaded", "path", "refresh", "restartNeeded", "runPreparation", "saveCommand", "value", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setEnabled", "(Landroid/content/Context;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Prepared", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class UmbrellaManager {
    public static final String CHANNEL_URL = "https://t.me/umbrella_br";
    private static volatile String loadedIdentity;
    private static volatile boolean loadedManaged;
    private static volatile String loadedPath;
    public static final UmbrellaManager INSTANCE = new UmbrellaManager();
    private static final Mutex mutex = MutexKt.Mutex$default(false, 1, null);
    private static final MutableStateFlow<UmbrellaState> mutableState = StateFlowKt.MutableStateFlow(new UmbrellaState(false, false, null, 0, false, 31, null));
    private static final StateFlow<UmbrellaState> state = FlowKt.asStateFlow(mutableState);

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$checkAccess$1 */
    /* JADX INFO: compiled from: UmbrellaManager.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.umbrella.UmbrellaManager", m4426f = "UmbrellaManager.kt", m4427i = {0, 0, 0, 0, 0}, m4428l = {TsExtractor.TS_STREAM_TYPE_DTS}, m4429m = "checkAccess", m4430n = {"this", "c", "fingerprint", "p", "now"}, m4431s = {"L$0", "L$1", "L$2", "L$3", "J$0"})
    static final class C56941 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C56941(Continuation<? super C56941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UmbrellaManager.this.checkAccess(null, this);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$prepare$1 */
    /* JADX INFO: compiled from: UmbrellaManager.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.umbrella.UmbrellaManager", m4426f = "UmbrellaManager.kt", m4427i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, m4428l = {181, 184, 191}, m4429m = "prepare", m4430n = {"this", "c", "this", "c", "fingerprint", "game", "this", "c", "fingerprint", "build", "file", "staged"}, m4431s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    static final class C56951 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C56951(Continuation<? super C56951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UmbrellaManager.this.prepare(null, this);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$runPreparation$1 */
    /* JADX INFO: compiled from: UmbrellaManager.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.umbrella.UmbrellaManager", m4426f = "UmbrellaManager.kt", m4427i = {0, 0}, m4428l = {205}, m4429m = "runPreparation", m4430n = {"this", "c"}, m4431s = {"L$0", "L$1"})
    static final class C56971 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C56971(Continuation<? super C56971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UmbrellaManager.this.runPreparation(null, this);
        }
    }

    private UmbrellaManager() {
    }

    public final StateFlow<UmbrellaState> getState() {
        return state;
    }

    public final boolean isLoaded() {
        return loadedPath != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences prefs(Context c) {
        return c.getSharedPreferences("umbrella", 0);
    }

    public final boolean enabled(Context c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return prefs(c).getBoolean("enabled", false);
    }

    public final void onKeyChanged(Context c) {
        Intrinsics.checkNotNullParameter(c, "c");
        prefs(c).edit().remove("accessIdentity").remove("accessAt").remove("accessUntil").apply();
        if (enabled(c)) {
            publish$default(this, c, null, false, 0, isLoaded(), 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File config(Context c) {
        File externalFilesDir = c.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            return new File(externalFilesDir, "config.umbr");
        }
        throw new IllegalStateException("Папка игры недоступна".toString());
    }

    public final String command(Context c) {
        Intrinsics.checkNotNullParameter(c, "c");
        String string = prefs(c).getString("pendingCommand", null);
        if (string == null) {
            string = UmbrellaConfig.INSTANCE.read(config(c));
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String kolsonCommand(Context c) {
        return new SettingsRepository(c).readMenuCommand(new File(c.getFilesDir(), "settings.ini"));
    }

    public final boolean pending(Context c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return prefs(c).contains("pendingCommand");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean restartNeeded(Context c) {
        return isLoaded() && (pending(c) || loadedManaged != enabled(c));
    }

    static /* synthetic */ void publish$default(UmbrellaManager umbrellaManager, Context context, String str, boolean z, int i, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z2 = umbrellaManager.restartNeeded(context);
        }
        umbrellaManager.publish(context, str2, z3, i3, z2);
    }

    private final void publish(Context c, String message, boolean busy, int progress, boolean restart) {
        String str = message;
        if (StringsKt__StringsKt.isBlank(str)) {
            str = restart ? "Перезапустите лаунчер, чтобы применить изменения Umbrella" : "";
        }
        String notice = str;
        mutableState.setValue(new UmbrellaState(enabled(c), busy, notice, progress, restart));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0103  */
    /* JADX WARN: Code duplicated, block: B:39:0x0109  */
    public final List<File> manualCopies(Context c) {
        String arch;
        boolean z;
        List roots;
        Iterable iterableEmptyList;
        String arch2;
        List roots2;
        File[] fileArr;
        boolean z2;
        Collection destination$iv$iv;
        File base;
        File[] fileArrListFiles;
        Intrinsics.checkNotNullParameter(c, "c");
        String arch3 = Process.is64Bit() ? "arm64" : "arm32";
        boolean z3 = true;
        List roots3 = CollectionsKt__CollectionsKt.mutableListOf(new File("/storage/emulated/0/1NEIZZIR/Modules/" + arch3));
        File externalFilesDir = c.getExternalFilesDir(null);
        if (externalFilesDir != null && (base = externalFilesDir.getParentFile()) != null && (fileArrListFiles = new File(base, "Custom/modules").listFiles()) != null) {
            Intrinsics.checkNotNull(fileArrListFiles);
            Collection destination$iv$iv2 = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    destination$iv$iv2.add(file);
                }
            }
            Iterable $this$forEach$iv = (List) destination$iv$iv2;
            for (Object element$iv : $this$forEach$iv) {
                File it = (File) element$iv;
                roots3.add(new File(it, arch3));
            }
        }
        List $this$flatMap$iv = roots3;
        Collection destination$iv$iv3 = new ArrayList();
        for (Object element$iv$iv : $this$flatMap$iv) {
            File it2 = (File) element$iv$iv;
            File[] fileArrListFiles2 = it2.listFiles();
            if (fileArrListFiles2 != null) {
                Intrinsics.checkNotNull(fileArrListFiles2);
                Collection destination$iv$iv4 = new ArrayList();
                File[] fileArr2 = fileArrListFiles2;
                int length = fileArr2.length;
                int i = 0;
                while (i < length) {
                    File file2 = fileArr2[i];
                    if (file2.isFile()) {
                        arch2 = arch3;
                        roots2 = roots3;
                        fileArr = fileArr2;
                        z2 = StringsKt__StringsJVMKt.equals(file2.getName(), "libumbrella.so", true);
                        if (z2) {
                            destination$iv$iv = destination$iv$iv4;
                            destination$iv$iv.add(file2);
                        } else {
                            destination$iv$iv = destination$iv$iv4;
                        }
                        i++;
                        destination$iv$iv4 = destination$iv$iv;
                        arch3 = arch2;
                        roots3 = roots2;
                        fileArr2 = fileArr;
                    } else {
                        arch2 = arch3;
                        roots2 = roots3;
                        fileArr = fileArr2;
                    }
                    if (z2) {
                        destination$iv$iv = destination$iv$iv4;
                        destination$iv$iv.add(file2);
                    } else {
                        destination$iv$iv = destination$iv$iv4;
                    }
                    i++;
                    destination$iv$iv4 = destination$iv$iv;
                    arch3 = arch2;
                    roots3 = roots2;
                    fileArr2 = fileArr;
                }
                arch = arch3;
                roots = roots3;
                z = true;
                iterableEmptyList = (List) destination$iv$iv4;
            } else {
                arch = arch3;
                z = z3;
                roots = roots3;
                iterableEmptyList = null;
            }
            if (iterableEmptyList == null) {
                iterableEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            Iterable list$iv$iv = iterableEmptyList;
            CollectionsKt__MutableCollectionsKt.addAll(destination$iv$iv3, list$iv$iv);
            z3 = z;
            arch3 = arch;
            roots3 = roots;
        }
        return (List) destination$iv$iv3;
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$refresh$2 */
    /* JADX INFO: compiled from: UmbrellaManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$refresh$2", m4426f = "UmbrellaManager.kt", m4427i = {}, m4428l = {ScreenId.SCREEN_UPGRADE_OBJECT_EVENT}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56962 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: $c */
        final /* synthetic */ Context f851$c;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C56962(Context context, Continuation<? super C56962> continuation) {
            super(2, continuation);
            this.f851$c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C56962(this.f851$c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56962) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws Throwable {
            Throwable th;
            C56962 c56962;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (!Mutex.DefaultImpls.tryLock$default(UmbrellaManager.mutex, null, 1, null)) {
                        return Unit.INSTANCE;
                    }
                    try {
                        if (UmbrellaManager.INSTANCE.restartNeeded(this.f851$c)) {
                            UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, this.f851$c, "Изменения вступят в силу после перезапуска лаунчера", false, 0, false, 28, null);
                        } else if (UmbrellaManager.INSTANCE.enabled(this.f851$c)) {
                            this.label = 1;
                            if (UmbrellaManager.INSTANCE.runPreparation(this.f851$c, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c56962 = this;
                        } else {
                            UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, this.f851$c, !Process.is64Bit() ? "Umbrella доступна только в ARM64-версии приложения" : "", false, 0, false, 28, null);
                        }
                        Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                        throw th;
                    }
                case 1:
                    c56962 = this;
                    try {
                        ResultKt.throwOnFailure($result);
                        Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        th = th3;
                        Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                        throw th;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Object refresh(Context c, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C56962(c, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$setEnabled$2 */
    /* JADX INFO: compiled from: UmbrellaManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$setEnabled$2", m4426f = "UmbrellaManager.kt", m4427i = {}, m4428l = {81}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56992 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: $c */
        final /* synthetic */ Context f853$c;
        final /* synthetic */ boolean $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C56992(boolean z, Context context, Continuation<? super C56992> continuation) {
            super(2, continuation);
            this.$value = z;
            this.f853$c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C56992(this.$value, this.f853$c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56992) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00a3 A[Catch: all -> 0x00dc, Exception -> 0x00df, CancellationException -> 0x00e2, TryCatch #4 {CancellationException -> 0x00e2, Exception -> 0x00df, all -> 0x00dc, blocks: (B:35:0x009e, B:37:0x00a3, B:39:0x00b9, B:40:0x00c9, B:41:0x00d2), top: B:62:0x009e }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00b9 A[Catch: all -> 0x00dc, Exception -> 0x00df, CancellationException -> 0x00e2, TryCatch #4 {CancellationException -> 0x00e2, Exception -> 0x00df, all -> 0x00dc, blocks: (B:35:0x009e, B:37:0x00a3, B:39:0x00b9, B:40:0x00c9, B:41:0x00d2), top: B:62:0x009e }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00c9 A[Catch: all -> 0x00dc, Exception -> 0x00df, CancellationException -> 0x00e2, TryCatch #4 {CancellationException -> 0x00e2, Exception -> 0x00df, all -> 0x00dc, blocks: (B:35:0x009e, B:37:0x00a3, B:39:0x00b9, B:40:0x00c9, B:41:0x00d2), top: B:62:0x009e }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3, types: [com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$setEnabled$2] */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            Object obj3;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C56992 c56992 = this.label;
            try {
                try {
                    switch (c56992) {
                        case 0:
                            ResultKt.throwOnFailure(obj);
                            C56992 c56993 = this;
                            if (!Mutex.DefaultImpls.tryLock$default(UmbrellaManager.mutex, null, 1, null)) {
                                return Unit.INSTANCE;
                            }
                            if (c56993.$value) {
                                c56993.label = 1;
                                Object objRunPreparation = UmbrellaManager.INSTANCE.runPreparation(c56993.f853$c, c56993);
                                if (objRunPreparation == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj2 = obj;
                                obj3 = objRunPreparation;
                                c56992 = c56993;
                                try {
                                    if (((Prepared) obj3) != null) {
                                        if (UmbrellaManager.INSTANCE.prefs(c56992.f853$c).edit().putBoolean("enabled", true).commit()) {
                                            throw new IllegalStateException("Check failed.".toString());
                                        }
                                        UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, c56992.f853$c, null, false, 0, false, 30, null);
                                    }
                                } catch (CancellationException e) {
                                    throw e;
                                } catch (Exception e2) {
                                    e = e2;
                                    UmbrellaManager umbrellaManager = UmbrellaManager.INSTANCE;
                                    Context context = c56992.f853$c;
                                    String message = e.getMessage();
                                    UmbrellaManager.publish$default(umbrellaManager, context, message == null ? "Не удалось сохранить настройку Umbrella" : message, false, 0, false, 28, null);
                                } catch (Throwable th) {
                                    th = th;
                                    Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                                    throw th;
                                }
                            } else {
                                if (!UmbrellaManager.INSTANCE.prefs(c56993.f853$c).edit().putBoolean("enabled", false).commit()) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, c56993.f853$c, UmbrellaManager.INSTANCE.isLoaded() ? "Umbrella уже загружена. Перезапустите лаунчер; ручные копии продолжат работать" : "", false, 0, UmbrellaManager.INSTANCE.isLoaded(), 12, null);
                            }
                            Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                            return Unit.INSTANCE;
                        case 1:
                            c56992 = this;
                            obj3 = obj;
                            ResultKt.throwOnFailure(obj3);
                            obj2 = obj3;
                            if (((Prepared) obj3) != null) {
                                if (UmbrellaManager.INSTANCE.prefs(c56992.f853$c).edit().putBoolean("enabled", true).commit()) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, c56992.f853$c, null, false, 0, false, 30, null);
                            }
                            Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final Object setEnabled(Context c, boolean value, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C56992(value, c, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$saveCommand$2 */
    /* JADX INFO: compiled from: UmbrellaManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$saveCommand$2", m4426f = "UmbrellaManager.kt", m4427i = {}, m4428l = {DonateConstants.ID_PREMIUM_KITS}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56982 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: $c */
        final /* synthetic */ Context f852$c;
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C56982(String str, Context context, Continuation<? super C56982> continuation) {
            super(2, continuation);
            this.$value = str;
            this.f852$c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C56982(this.$value, this.f852$c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56982) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C56982 c56982;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (Mutex.DefaultImpls.lock$default(UmbrellaManager.mutex, null, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c56982 = this;
                    break;
                    break;
                case 1:
                    c56982 = this;
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                UmbrellaConfig.INSTANCE.validate(c56982.$value, UmbrellaManager.INSTANCE.kolsonCommand(c56982.f852$c));
                if (Intrinsics.areEqual(c56982.$value, UmbrellaManager.INSTANCE.command(c56982.f852$c))) {
                    Unit unit = Unit.INSTANCE;
                    Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                    return unit;
                }
                if (UmbrellaManager.INSTANCE.isLoaded()) {
                    if (!UmbrellaManager.INSTANCE.prefs(c56982.f852$c).edit().putString("pendingCommand", c56982.$value).commit()) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, c56982.f852$c, "Новая команда применится после перезапуска лаунчера", false, 0, true, 12, null);
                } else {
                    UmbrellaConfig.write$default(UmbrellaConfig.INSTANCE, UmbrellaManager.INSTANCE.config(c56982.f852$c), c56982.$value, null, 4, null);
                    if (!UmbrellaManager.INSTANCE.prefs(c56982.f852$c).edit().remove("pendingCommand").commit()) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                throw th;
            }
        }
    }

    public final Object saveCommand(Context c, String value, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C56982(value, c, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final void applyPendingCommand(Context c) {
        String value;
        Intrinsics.checkNotNullParameter(c, "c");
        if (isLoaded() || (value = prefs(c).getString("pendingCommand", null)) == null) {
            return;
        }
        UmbrellaConfig.INSTANCE.validate(value, kolsonCommand(c));
        UmbrellaConfig.write$default(UmbrellaConfig.INSTANCE, config(c), value, null, 4, null);
        if (!prefs(c).edit().remove("pendingCommand").commit()) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final void recordManualLoaded(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        loadedPath = path;
        loadedManaged = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<String, JSONObject> identity(Context c) throws NoSuchAlgorithmException {
        String key = KeyManager.INSTANCE.readSavedKey(c);
        String device = Settings.Secure.getString(c.getContentResolver(), "android_id");
        if (device == null) {
            device = "";
        }
        if (!((StringsKt__StringsKt.isBlank(key) || StringsKt__StringsKt.isBlank(device)) ? false : true)) {
            throw new IllegalStateException("Сначала активируйте ключ лаунчера".toString());
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = (key + (char) 0 + device).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        String fingerprint = ArraysKt___ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$identity$fingerprint$1
            public final CharSequence invoke(byte it) {
                String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(it)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                return invoke(b.byteValue());
            }
        }, 30, (Object) null);
        return TuplesKt.m4423to(fingerprint, new JSONObject().put("key", key).put("android_id", device));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Object checkAccess(Context c, Continuation<? super String> continuation) throws JSONException, NoSuchAlgorithmException {
        C56941 c56941;
        SharedPreferences p;
        String str;
        long j;
        String str2;
        boolean z;
        Object objPostBytes;
        Context c2;
        long now;
        UmbrellaManager umbrellaManager;
        String fingerprint;
        byte[] it;
        if (continuation instanceof C56941) {
            C56941 c56942 = (C56941) continuation;
            if ((c56942.label & Integer.MIN_VALUE) != 0) {
                c56942.label -= Integer.MIN_VALUE;
                c56941 = c56942;
            } else {
                c56941 = new C56941(continuation);
            }
        } else {
            c56941 = new C56941(continuation);
        }
        Object $result = c56941.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c56941.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Pair<String, JSONObject> pairIdentity = identity(c);
                String fingerprint2 = pairIdentity.component1();
                final JSONObject body = pairIdentity.component2();
                SharedPreferences p2 = prefs(c);
                long now2 = System.currentTimeMillis();
                if (!Intrinsics.areEqual(p2.getString("accessIdentity", null), fingerprint2)) {
                    p2.edit().remove("accessIdentity").remove("accessAt").remove("accessUntil").commit();
                }
                if (UmbrellaPolicy.INSTANCE.fresh(p2.getLong("accessAt", 0L), now2) && now2 < p2.getLong("accessUntil", 0L) && Intrinsics.areEqual(p2.getString("accessIdentity", null), fingerprint2)) {
                    return fingerprint2;
                }
                EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                Function0<RequestBody> function0 = new Function0<RequestBody>() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$checkAccess$result$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final RequestBody invoke() {
                        RequestBody.Companion companion = RequestBody.INSTANCE;
                        String string = body.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        return companion.create(string, MediaType.INSTANCE.get(Other.APPLICATION_JSON));
                    }
                };
                Set of = SetsKt__SetsJVMKt.setOf(Boxing.boxInt(403));
                UmbrellaManager$checkAccess$result$2 umbrellaManager$checkAccess$result$2 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$checkAccess$result$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(byte[] it2) {
                        Object objM15551constructorimpl;
                        Intrinsics.checkNotNullParameter(it2, "it");
                        UmbrellaManager umbrellaManager2 = UmbrellaManager.INSTANCE;
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            objM15551constructorimpl = Result.m15551constructorimpl(Boolean.valueOf(SetsKt__SetsKt.setOf((Object[]) new String[]{"allowed", "unsubscribed", "invalid_key", "unavailable"}).contains(new JSONObject(new String(it2, Charsets.UTF_8)).getString("status"))));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                        }
                        if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
                            objM15551constructorimpl = false;
                        }
                        return (Boolean) objM15551constructorimpl;
                    }
                };
                c56941.L$0 = this;
                c56941.L$1 = c;
                c56941.L$2 = fingerprint2;
                c56941.L$3 = p2;
                c56941.J$0 = now2;
                c56941.label = 1;
                p = p2;
                str = "accessUntil";
                j = 0;
                str2 = "accessIdentity";
                z = true;
                objPostBytes = router.postBytes(endpointGroup, "/api/umbrella/access", function0, (232 & 8) != 0 ? MapsKt__MapsKt.emptyMap() : null, true, (232 & 32) != 0 ? SetsKt__SetsKt.emptySet() : of, (232 & 64) != 0 ? 2097152L : 0L, (232 & 128) != 0 ? new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.network.EndpointRouter.postBytes.2
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(byte[] it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return true;
                    }
                } : umbrellaManager$checkAccess$result$2, c56941);
                if (objPostBytes == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c2 = c;
                now = now2;
                umbrellaManager = this;
                fingerprint = fingerprint2;
                break;
            case 1:
                long now3 = c56941.J$0;
                SharedPreferences p3 = (SharedPreferences) c56941.L$3;
                fingerprint = (String) c56941.L$2;
                c2 = (Context) c56941.L$1;
                umbrellaManager = (UmbrellaManager) c56941.L$0;
                ResultKt.throwOnFailure($result);
                p = p3;
                str2 = "accessIdentity";
                str = "accessUntil";
                z = true;
                j = 0;
                now = now3;
                objPostBytes = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        NetworkResult result = (NetworkResult) objPostBytes;
        NetworkResult.Success success = result instanceof NetworkResult.Success ? (NetworkResult.Success) result : null;
        if (success == null || (it = (byte[]) success.getValue()) == null) {
            throw new IllegalStateException("Не удалось проверить подписку. Игра запустится без Umbrella".toString());
        }
        JSONObject response = new JSONObject(new String(it, Charsets.UTF_8));
        String str3 = str;
        p.edit().remove(str3).commit();
        String string = response.getString("status");
        if (string != null) {
            switch (string.hashCode()) {
                case -952833001:
                    if (string.equals("invalid_key")) {
                        throw new IllegalStateException("Проверьте ключ лаунчера и привязку устройства".toString());
                    }
                    break;
                case -911343192:
                    if (string.equals("allowed")) {
                        long ttl = RangesKt___RangesKt.coerceAtMost((response.getLong("expiresAt") - response.getLong("serverTime")) * ((long) 1000), 86400000L);
                        if (!(ttl > j ? z : false)) {
                            throw new IllegalStateException("Срок подтверждения подписки истёк".toString());
                        }
                        if (!Intrinsics.areEqual(umbrellaManager.identity(c2).getFirst(), fingerprint)) {
                            throw new IllegalStateException("Ключ изменился. Повторите проверку".toString());
                        }
                        if (!p.edit().putString(str2, fingerprint).putLong("accessAt", now).putLong(str3, now + ttl).commit()) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        return fingerprint;
                    }
                    break;
                case 901853107:
                    if (string.equals("unsubscribed")) {
                        throw new IllegalStateException("Подпишитесь на https://t.me/umbrella_br и включите Umbrella снова. Premium: подписка не требуется".toString());
                    }
                    break;
            }
        }
        throw new IllegalStateException("Проверка Telegram временно недоступна".toString());
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$catalog$2 */
    /* JADX INFO: compiled from: UmbrellaManager.kt */
    @Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaBuild;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$catalog$2", m4426f = "UmbrellaManager.kt", m4427i = {0}, m4428l = {163}, m4429m = "invokeSuspend", m4430n = {"p"}, m4431s = {"L$0"})
    static final class C56932 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends UmbrellaBuild>>, Object> {

        /* JADX INFO: renamed from: $c */
        final /* synthetic */ Context f849$c;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C56932(Context context, Continuation<? super C56932> continuation) {
            super(2, continuation);
            this.f849$c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C56932 c56932 = new C56932(this.f849$c, continuation);
            c56932.L$0 = obj;
            return c56932;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends UmbrellaBuild>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<UmbrellaBuild>>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<UmbrellaBuild>> continuation) {
            return ((C56932) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SharedPreferences p;
            Object $result;
            String it;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    final CoroutineScope $this$withContext = (CoroutineScope) this.L$0;
                    NetworkRuntime.INSTANCE.initialize(this.f849$c);
                    p = UmbrellaManager.INSTANCE.prefs(this.f849$c);
                    EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                    Function1<byte[], Boolean> function1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$catalog$2$result$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(byte[] it2) {
                            Object objM15551constructorimpl;
                            Intrinsics.checkNotNullParameter(it2, "it");
                            CoroutineScope coroutineScope = $this$withContext;
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                objM15551constructorimpl = Result.m15551constructorimpl(UmbrellaPolicy.INSTANCE.parseCatalog(it2));
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                            }
                            return Boolean.valueOf(Result.m15558isSuccessimpl(objM15551constructorimpl));
                        }
                    };
                    this.L$0 = p;
                    this.label = 1;
                    Object bytes = router.getBytes(endpointGroup, "/api/umbrella/catalog", (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : null, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.network.EndpointRouter.getBytes.2
                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(byte[] it4) {
                            Intrinsics.checkNotNullParameter(it4, "it");
                            return Boolean.valueOf(!(it4.length == 0));
                        }
                    } : function1, this);
                    if (bytes == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = bytes;
                    break;
                case 1:
                    $result = obj;
                    SharedPreferences p2 = (SharedPreferences) this.L$0;
                    ResultKt.throwOnFailure($result);
                    p = p2;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            NetworkResult result = (NetworkResult) $result;
            if (result instanceof NetworkResult.Success) {
                List<UmbrellaBuild> catalog = UmbrellaPolicy.INSTANCE.parseCatalog((byte[]) ((NetworkResult.Success) result).getValue());
                if (!p.edit().putString("catalog", new String((byte[]) ((NetworkResult.Success) result).getValue(), Charsets.UTF_8)).putLong("catalogAt", System.currentTimeMillis()).commit()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                return catalog;
            }
            if (UmbrellaPolicy.INSTANCE.fresh(p.getLong("catalogAt", 0L), System.currentTimeMillis()) && (it = p.getString("catalog", null)) != null) {
                UmbrellaPolicy umbrellaPolicy = UmbrellaPolicy.INSTANCE;
                byte[] bytes2 = it.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                return umbrellaPolicy.parseCatalog(bytes2);
            }
            throw new IllegalStateException("Не удалось проверить совместимость. Повторите позже".toString());
        }
    }

    public final Object catalog(Context c, Continuation<? super List<UmbrellaBuild>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C56932(c, null), continuation);
    }

    /* JADX INFO: compiled from: UmbrellaManager.kt */
    @Metadata(m4415d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaManager$Prepared;", "", "build", "Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaBuild;", "file", "Ljava/io/File;", "identity", "", "(Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaBuild;Ljava/io/File;Ljava/lang/String;)V", "getBuild", "()Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaBuild;", "getFile", "()Ljava/io/File;", "getIdentity", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final /* data */ class Prepared {
        private final UmbrellaBuild build;
        private final File file;
        private final String identity;

        public static /* synthetic */ Prepared copy$default(Prepared prepared, UmbrellaBuild umbrellaBuild, File file, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                umbrellaBuild = prepared.build;
            }
            if ((i & 2) != 0) {
                file = prepared.file;
            }
            if ((i & 4) != 0) {
                str = prepared.identity;
            }
            return prepared.copy(umbrellaBuild, file, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final UmbrellaBuild getBuild() {
            return this.build;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getIdentity() {
            return this.identity;
        }

        public final Prepared copy(UmbrellaBuild build, File file, String identity) {
            Intrinsics.checkNotNullParameter(build, "build");
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(identity, "identity");
            return new Prepared(build, file, identity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Prepared)) {
                return false;
            }
            Prepared prepared = (Prepared) other;
            return Intrinsics.areEqual(this.build, prepared.build) && Intrinsics.areEqual(this.file, prepared.file) && Intrinsics.areEqual(this.identity, prepared.identity);
        }

        public int hashCode() {
            return (((this.build.hashCode() * 31) + this.file.hashCode()) * 31) + this.identity.hashCode();
        }

        public String toString() {
            return "Prepared(build=" + this.build + ", file=" + this.file + ", identity=" + this.identity + ')';
        }

        public Prepared(UmbrellaBuild build, File file, String identity) {
            Intrinsics.checkNotNullParameter(build, "build");
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(identity, "identity");
            this.build = build;
            this.file = file;
            this.identity = identity;
        }

        public final UmbrellaBuild getBuild() {
            return this.build;
        }

        public final File getFile() {
            return this.file;
        }

        public final String getIdentity() {
            return this.identity;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:29:0x013f  */
    /* JADX WARN: Code duplicated, block: B:31:0x014b  */
    /* JADX WARN: Code duplicated, block: B:33:0x01b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:37:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:43:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:48:0x0200  */
    /* JADX WARN: Code duplicated, block: B:50:0x020f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0223  */
    /* JADX WARN: Code duplicated, block: B:55:0x0229  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object prepare(Context context, Continuation<? super Prepared> continuation) throws JSONException, NoSuchAlgorithmException {
        C56951 c56951;
        UmbrellaManager umbrellaManager;
        Context c;
        Object objCheckAccess;
        String fingerprint;
        String game;
        UmbrellaPolicy umbrellaPolicy;
        Object objCatalog;
        String fingerprint2;
        Object obj;
        Context c2;
        UmbrellaPolicy umbrellaPolicy2;
        UmbrellaManager umbrellaManager2;
        String game2;
        UmbrellaBuild build;
        File file;
        File staged;
        UmbrellaManager umbrellaManager3;
        Context c3;
        Object objDownload;
        String fingerprint3;
        File file2;
        Context c4;
        UmbrellaBuild build2;
        UmbrellaManager umbrellaManager4;
        NetworkResult result;
        if (continuation instanceof C56951) {
            C56951 c56952 = (C56951) continuation;
            if ((c56952.label & Integer.MIN_VALUE) != 0) {
                c56952.label -= Integer.MIN_VALUE;
                c56951 = c56952;
            } else {
                c56951 = new C56951(continuation);
            }
        } else {
            c56951 = new C56951(continuation);
        }
        Object $result = c56951.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z = false;
        switch (c56951.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                umbrellaManager = this;
                c = context;
                if (!Process.is64Bit()) {
                    throw new IllegalStateException("Umbrella доступна только в ARM64-версии приложения".toString());
                }
                NetworkRuntime.INSTANCE.initialize(c);
                publish$default(umbrellaManager, c, null, true, 0, false, 26, null);
                c56951.L$0 = umbrellaManager;
                c56951.L$1 = c;
                c56951.label = 1;
                objCheckAccess = umbrellaManager.checkAccess(c, c56951);
                if (objCheckAccess == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fingerprint = (String) objCheckAccess;
                publish$default(umbrellaManager, c, null, true, 0, false, 26, null);
                game = c.getPackageManager().getPackageInfo(c.getPackageName(), 0).versionName;
                if (game == null) {
                    game = "";
                }
                umbrellaPolicy = UmbrellaPolicy.INSTANCE;
                c56951.L$0 = umbrellaManager;
                c56951.L$1 = c;
                c56951.L$2 = fingerprint;
                c56951.L$3 = game;
                c56951.L$4 = umbrellaPolicy;
                c56951.label = 2;
                objCatalog = umbrellaManager.catalog(c, c56951);
                if (objCatalog == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fingerprint2 = fingerprint;
                obj = objCatalog;
                c2 = c;
                umbrellaPolicy2 = umbrellaPolicy;
                umbrellaManager2 = umbrellaManager;
                game2 = game;
                build = umbrellaPolicy2.choose((List) obj, LauncherVersioningKt.readLocalLauncherVersionText(c2), game2);
                file = new File(c2.getFilesDir(), "umbrella/" + build.getLauncherVersion() + FileSystemKt.UnixPathSeparator + build.getGameVersion() + FileSystemKt.UnixPathSeparator + build.getSha256() + "/libumbrella.so");
                if (!UmbrellaPolicy.INSTANCE.verified(file, build)) {
                    if (Intrinsics.areEqual(file.getAbsolutePath(), loadedPath)) {
                        throw new IllegalStateException("Загруженный файл изменён. Требуется перезапуск".toString());
                    }
                    File staged2 = new File(file.getParentFile(), "download.so");
                    publish$default(umbrellaManager2, c2, null, true, 0, false, 18, null);
                    EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                    String library = build.getLibrary();
                    DownloadSpec downloadSpec = new DownloadSpec(staged2, Boxing.boxLong(build.getSize()), null, false, build.getSha256(), 12, null);
                    UmbrellaManager$prepare$result$1 umbrellaManager$prepare$result$1 = new UmbrellaManager$prepare$result$1(c2, null);
                    c56951.L$0 = umbrellaManager2;
                    c56951.L$1 = c2;
                    c56951.L$2 = fingerprint2;
                    c56951.L$3 = build;
                    c56951.L$4 = file;
                    c56951.L$5 = staged2;
                    c56951.label = 3;
                    staged = staged2;
                    umbrellaManager3 = umbrellaManager2;
                    c3 = c2;
                    objDownload = router.download(endpointGroup, library, downloadSpec, umbrellaManager$prepare$result$1, c56951);
                    if (objDownload == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fingerprint3 = fingerprint2;
                    file2 = file;
                    c4 = c3;
                    build2 = build;
                    umbrellaManager4 = umbrellaManager3;
                    result = (NetworkResult) objDownload;
                    if ((result instanceof NetworkResult.Success) && UmbrellaPolicy.INSTANCE.verified(staged, build2)) {
                        z = true;
                    }
                    if (z) {
                        staged.delete();
                        throw new IllegalStateException("Не удалось скачать и проверить Umbrella. Повторите попытку".toString());
                    }
                    if (staged.renameTo(file2)) {
                        throw new IllegalStateException("Не удалось сохранить Umbrella".toString());
                    }
                    fingerprint2 = fingerprint3;
                    build = build2;
                    file = file2;
                    UmbrellaManager umbrellaManager5 = umbrellaManager4;
                    c2 = c4;
                    umbrellaManager2 = umbrellaManager5;
                }
                if (Intrinsics.areEqual(umbrellaManager2.identity(c2).getFirst(), fingerprint2)) {
                    return new Prepared(build, file, fingerprint2);
                }
                throw new IllegalStateException("Ключ изменился. Повторите проверку".toString());
            case 1:
                c = (Context) c56951.L$1;
                umbrellaManager = (UmbrellaManager) c56951.L$0;
                ResultKt.throwOnFailure($result);
                objCheckAccess = $result;
                fingerprint = (String) objCheckAccess;
                publish$default(umbrellaManager, c, null, true, 0, false, 26, null);
                game = c.getPackageManager().getPackageInfo(c.getPackageName(), 0).versionName;
                if (game == null) {
                    game = "";
                }
                umbrellaPolicy = UmbrellaPolicy.INSTANCE;
                c56951.L$0 = umbrellaManager;
                c56951.L$1 = c;
                c56951.L$2 = fingerprint;
                c56951.L$3 = game;
                c56951.L$4 = umbrellaPolicy;
                c56951.label = 2;
                objCatalog = umbrellaManager.catalog(c, c56951);
                if (objCatalog == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fingerprint2 = fingerprint;
                obj = objCatalog;
                c2 = c;
                umbrellaPolicy2 = umbrellaPolicy;
                umbrellaManager2 = umbrellaManager;
                game2 = game;
                build = umbrellaPolicy2.choose((List) obj, LauncherVersioningKt.readLocalLauncherVersionText(c2), game2);
                file = new File(c2.getFilesDir(), "umbrella/" + build.getLauncherVersion() + FileSystemKt.UnixPathSeparator + build.getGameVersion() + FileSystemKt.UnixPathSeparator + build.getSha256() + "/libumbrella.so");
                if (!UmbrellaPolicy.INSTANCE.verified(file, build)) {
                    if (Intrinsics.areEqual(file.getAbsolutePath(), loadedPath)) {
                        throw new IllegalStateException("Загруженный файл изменён. Требуется перезапуск".toString());
                    }
                    File staged3 = new File(file.getParentFile(), "download.so");
                    publish$default(umbrellaManager2, c2, null, true, 0, false, 18, null);
                    EndpointRouter router2 = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup2 = EndpointGroup.KOLSON;
                    String library2 = build.getLibrary();
                    DownloadSpec downloadSpec2 = new DownloadSpec(staged3, Boxing.boxLong(build.getSize()), null, false, build.getSha256(), 12, null);
                    UmbrellaManager$prepare$result$1 umbrellaManager$prepare$result$2 = new UmbrellaManager$prepare$result$1(c2, null);
                    c56951.L$0 = umbrellaManager2;
                    c56951.L$1 = c2;
                    c56951.L$2 = fingerprint2;
                    c56951.L$3 = build;
                    c56951.L$4 = file;
                    c56951.L$5 = staged3;
                    c56951.label = 3;
                    staged = staged3;
                    umbrellaManager3 = umbrellaManager2;
                    c3 = c2;
                    objDownload = router2.download(endpointGroup2, library2, downloadSpec2, umbrellaManager$prepare$result$2, c56951);
                    if (objDownload == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fingerprint3 = fingerprint2;
                    file2 = file;
                    c4 = c3;
                    build2 = build;
                    umbrellaManager4 = umbrellaManager3;
                    result = (NetworkResult) objDownload;
                    if (result instanceof NetworkResult.Success) {
                        z = true;
                    }
                    if (z) {
                        staged.delete();
                        throw new IllegalStateException("Не удалось скачать и проверить Umbrella. Повторите попытку".toString());
                    }
                    if (staged.renameTo(file2)) {
                        throw new IllegalStateException("Не удалось сохранить Umbrella".toString());
                    }
                    fingerprint2 = fingerprint3;
                    build = build2;
                    file = file2;
                    UmbrellaManager umbrellaManager6 = umbrellaManager4;
                    c2 = c4;
                    umbrellaManager2 = umbrellaManager6;
                }
                if (Intrinsics.areEqual(umbrellaManager2.identity(c2).getFirst(), fingerprint2)) {
                    return new Prepared(build, file, fingerprint2);
                }
                throw new IllegalStateException("Ключ изменился. Повторите проверку".toString());
            case 2:
                umbrellaPolicy2 = (UmbrellaPolicy) c56951.L$4;
                game2 = (String) c56951.L$3;
                String fingerprint4 = (String) c56951.L$2;
                Context c5 = (Context) c56951.L$1;
                umbrellaManager2 = (UmbrellaManager) c56951.L$0;
                ResultKt.throwOnFailure($result);
                fingerprint2 = fingerprint4;
                c2 = c5;
                obj = $result;
                build = umbrellaPolicy2.choose((List) obj, LauncherVersioningKt.readLocalLauncherVersionText(c2), game2);
                file = new File(c2.getFilesDir(), "umbrella/" + build.getLauncherVersion() + FileSystemKt.UnixPathSeparator + build.getGameVersion() + FileSystemKt.UnixPathSeparator + build.getSha256() + "/libumbrella.so");
                if (!UmbrellaPolicy.INSTANCE.verified(file, build)) {
                    if (Intrinsics.areEqual(file.getAbsolutePath(), loadedPath)) {
                        throw new IllegalStateException("Загруженный файл изменён. Требуется перезапуск".toString());
                    }
                    File staged4 = new File(file.getParentFile(), "download.so");
                    publish$default(umbrellaManager2, c2, null, true, 0, false, 18, null);
                    EndpointRouter router3 = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup3 = EndpointGroup.KOLSON;
                    String library3 = build.getLibrary();
                    DownloadSpec downloadSpec3 = new DownloadSpec(staged4, Boxing.boxLong(build.getSize()), null, false, build.getSha256(), 12, null);
                    UmbrellaManager$prepare$result$1 umbrellaManager$prepare$result$3 = new UmbrellaManager$prepare$result$1(c2, null);
                    c56951.L$0 = umbrellaManager2;
                    c56951.L$1 = c2;
                    c56951.L$2 = fingerprint2;
                    c56951.L$3 = build;
                    c56951.L$4 = file;
                    c56951.L$5 = staged4;
                    c56951.label = 3;
                    staged = staged4;
                    umbrellaManager3 = umbrellaManager2;
                    c3 = c2;
                    objDownload = router3.download(endpointGroup3, library3, downloadSpec3, umbrellaManager$prepare$result$3, c56951);
                    if (objDownload == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fingerprint3 = fingerprint2;
                    file2 = file;
                    c4 = c3;
                    build2 = build;
                    umbrellaManager4 = umbrellaManager3;
                    result = (NetworkResult) objDownload;
                    if (result instanceof NetworkResult.Success) {
                        z = true;
                    }
                    if (z) {
                        staged.delete();
                        throw new IllegalStateException("Не удалось скачать и проверить Umbrella. Повторите попытку".toString());
                    }
                    if (staged.renameTo(file2)) {
                        throw new IllegalStateException("Не удалось сохранить Umbrella".toString());
                    }
                    fingerprint2 = fingerprint3;
                    build = build2;
                    file = file2;
                    UmbrellaManager umbrellaManager7 = umbrellaManager4;
                    c2 = c4;
                    umbrellaManager2 = umbrellaManager7;
                }
                if (Intrinsics.areEqual(umbrellaManager2.identity(c2).getFirst(), fingerprint2)) {
                    return new Prepared(build, file, fingerprint2);
                }
                throw new IllegalStateException("Ключ изменился. Повторите проверку".toString());
            case 3:
                File staged5 = (File) c56951.L$5;
                file2 = (File) c56951.L$4;
                build2 = (UmbrellaBuild) c56951.L$3;
                fingerprint3 = (String) c56951.L$2;
                c4 = (Context) c56951.L$1;
                umbrellaManager4 = (UmbrellaManager) c56951.L$0;
                ResultKt.throwOnFailure($result);
                staged = staged5;
                objDownload = $result;
                result = (NetworkResult) objDownload;
                if (result instanceof NetworkResult.Success) {
                    z = true;
                }
                if (z) {
                    staged.delete();
                    throw new IllegalStateException("Не удалось скачать и проверить Umbrella. Повторите попытку".toString());
                }
                if (staged.renameTo(file2)) {
                    throw new IllegalStateException("Не удалось сохранить Umbrella".toString());
                }
                fingerprint2 = fingerprint3;
                build = build2;
                file = file2;
                UmbrellaManager umbrellaManager8 = umbrellaManager4;
                c2 = c4;
                umbrellaManager2 = umbrellaManager8;
                if (Intrinsics.areEqual(umbrellaManager2.identity(c2).getFirst(), fingerprint2)) {
                    return new Prepared(build, file, fingerprint2);
                }
                throw new IllegalStateException("Ключ изменился. Повторите проверку".toString());
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object runPreparation(Context c, Continuation<? super Prepared> continuation) {
        C56971 c56971;
        Context c2;
        UmbrellaManager umbrellaManager;
        Exception e;
        CancellationException cancelled;
        UmbrellaManager umbrellaManager2;
        Object objPrepare;
        String message;
        if (continuation instanceof C56971) {
            c56971 = (C56971) continuation;
            if ((c56971.label & Integer.MIN_VALUE) != 0) {
                c56971.label -= Integer.MIN_VALUE;
            } else {
                c56971 = new C56971(continuation);
            }
        } else {
            c56971 = new C56971(continuation);
        }
        C56971 c56972 = c56971;
        Object $result = c56972.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c56972.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                try {
                    c56972.L$0 = this;
                    c56972.L$1 = c;
                    c56972.label = 1;
                    objPrepare = prepare(c, c56972);
                    if (objPrepare == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    umbrellaManager2 = this;
                    publish$default(INSTANCE, c, null, false, 0, false, 30, null);
                    return (Prepared) objPrepare;
                } catch (CancellationException e2) {
                    cancelled = e2;
                    umbrellaManager2 = this;
                    publish$default(umbrellaManager2, c, null, false, 0, false, 30, null);
                    throw cancelled;
                } catch (Exception e3) {
                    c2 = c;
                    umbrellaManager = this;
                    e = e3;
                    Exception error = e;
                    message = error.getMessage();
                    if (message == null) {
                        message = "Не удалось подготовить Umbrella";
                    }
                    publish$default(umbrellaManager, c2, message, false, 0, false, 28, null);
                    Log.w("Umbrella", "Preparation failed: " + error.getClass().getSimpleName());
                    return null;
                }
            case 1:
                c = (Context) c56972.L$1;
                umbrellaManager2 = (UmbrellaManager) c56972.L$0;
                try {
                    ResultKt.throwOnFailure($result);
                    objPrepare = $result;
                    publish$default(INSTANCE, c, null, false, 0, false, 30, null);
                    return (Prepared) objPrepare;
                } catch (CancellationException e4) {
                    cancelled = e4;
                    publish$default(umbrellaManager2, c, null, false, 0, false, 30, null);
                    throw cancelled;
                } catch (Exception e5) {
                    e = e5;
                    c2 = c;
                    umbrellaManager = umbrellaManager2;
                    Exception error2 = e;
                    message = error2.getMessage();
                    if (message == null) {
                        message = "Не удалось подготовить Umbrella";
                    }
                    publish$default(umbrellaManager, c2, message, false, 0, false, 28, null);
                    Log.w("Umbrella", "Preparation failed: " + error2.getClass().getSimpleName());
                    return null;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$beforeGame$2 */
    /* JADX INFO: compiled from: UmbrellaManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.umbrella.UmbrellaManager$beforeGame$2", m4426f = "UmbrellaManager.kt", m4427i = {1, 2, 2}, m4428l = {216, 223, 229}, m4429m = "invokeSuspend", m4430n = {"automatic", "prepared", "automatic"}, m4431s = {"Z$0", "L$0", "Z$0"})
    static final class C56922 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: $c */
        final /* synthetic */ Context f848$c;
        Object L$0;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C56922(Context context, Continuation<? super C56922> continuation) {
            super(2, continuation);
            this.f848$c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C56922(this.f848$c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C56922) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0060 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:7:0x0020, B:56:0x0119, B:58:0x0122, B:60:0x0154, B:62:0x016a, B:64:0x0170, B:68:0x0181, B:70:0x0197, B:71:0x01d0, B:72:0x01dd, B:73:0x01de, B:74:0x01eb, B:75:0x01ec, B:76:0x01f9, B:77:0x01fa, B:78:0x0207, B:80:0x0209, B:84:0x0218, B:86:0x0224, B:88:0x0241, B:91:0x024b, B:10:0x002d, B:19:0x0056, B:21:0x0060, B:24:0x007c, B:26:0x0086), top: B:98:0x000b, inners: #3, #4 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x007c A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #0 {all -> 0x0033, blocks: (B:7:0x0020, B:56:0x0119, B:58:0x0122, B:60:0x0154, B:62:0x016a, B:64:0x0170, B:68:0x0181, B:70:0x0197, B:71:0x01d0, B:72:0x01dd, B:73:0x01de, B:74:0x01eb, B:75:0x01ec, B:76:0x01f9, B:77:0x01fa, B:78:0x0207, B:80:0x0209, B:84:0x0218, B:86:0x0224, B:88:0x0241, B:91:0x024b, B:10:0x002d, B:19:0x0056, B:21:0x0060, B:24:0x007c, B:26:0x0086), top: B:98:0x000b, inners: #3, #4 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0086 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:7:0x0020, B:56:0x0119, B:58:0x0122, B:60:0x0154, B:62:0x016a, B:64:0x0170, B:68:0x0181, B:70:0x0197, B:71:0x01d0, B:72:0x01dd, B:73:0x01de, B:74:0x01eb, B:75:0x01ec, B:76:0x01f9, B:77:0x01fa, B:78:0x0207, B:80:0x0209, B:84:0x0218, B:86:0x0224, B:88:0x0241, B:91:0x024b, B:10:0x002d, B:19:0x0056, B:21:0x0060, B:24:0x007c, B:26:0x0086), top: B:98:0x000b, inners: #3, #4 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x0098 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x0099  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:38:0x00b7 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:48:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:49:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:52:0x010f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:53:0x0110  */
        /* JADX WARN: Code duplicated, block: B:55:0x0117 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:60:0x0154 A[Catch: all -> 0x0033, Exception -> 0x0208, UnsatisfiedLinkError -> 0x0223, TryCatch #3 {UnsatisfiedLinkError -> 0x0223, blocks: (B:58:0x0122, B:60:0x0154, B:62:0x016a, B:64:0x0170, B:68:0x0181, B:70:0x0197, B:71:0x01d0, B:72:0x01dd, B:73:0x01de, B:74:0x01eb, B:75:0x01ec, B:76:0x01f9, B:77:0x01fa, B:78:0x0207), top: B:102:0x0122, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x016a A[Catch: all -> 0x0033, Exception -> 0x0208, UnsatisfiedLinkError -> 0x0223, TryCatch #3 {UnsatisfiedLinkError -> 0x0223, blocks: (B:58:0x0122, B:60:0x0154, B:62:0x016a, B:64:0x0170, B:68:0x0181, B:70:0x0197, B:71:0x01d0, B:72:0x01dd, B:73:0x01de, B:74:0x01eb, B:75:0x01ec, B:76:0x01f9, B:77:0x01fa, B:78:0x0207), top: B:102:0x0122, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x0170 A[Catch: all -> 0x0033, Exception -> 0x0208, UnsatisfiedLinkError -> 0x0223, TryCatch #3 {UnsatisfiedLinkError -> 0x0223, blocks: (B:58:0x0122, B:60:0x0154, B:62:0x016a, B:64:0x0170, B:68:0x0181, B:70:0x0197, B:71:0x01d0, B:72:0x01dd, B:73:0x01de, B:74:0x01eb, B:75:0x01ec, B:76:0x01f9, B:77:0x01fa, B:78:0x0207), top: B:102:0x0122, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:66:0x017e  */
        /* JADX WARN: Code duplicated, block: B:68:0x0181 A[Catch: all -> 0x0033, Exception -> 0x0208, UnsatisfiedLinkError -> 0x0223, TryCatch #3 {UnsatisfiedLinkError -> 0x0223, blocks: (B:58:0x0122, B:60:0x0154, B:62:0x016a, B:64:0x0170, B:68:0x0181, B:70:0x0197, B:71:0x01d0, B:72:0x01dd, B:73:0x01de, B:74:0x01eb, B:75:0x01ec, B:76:0x01f9, B:77:0x01fa, B:78:0x0207), top: B:102:0x0122, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:70:0x0197 A[Catch: all -> 0x0033, Exception -> 0x0208, UnsatisfiedLinkError -> 0x0223, TryCatch #3 {UnsatisfiedLinkError -> 0x0223, blocks: (B:58:0x0122, B:60:0x0154, B:62:0x016a, B:64:0x0170, B:68:0x0181, B:70:0x0197, B:71:0x01d0, B:72:0x01dd, B:73:0x01de, B:74:0x01eb, B:75:0x01ec, B:76:0x01f9, B:77:0x01fa, B:78:0x0207), top: B:102:0x0122, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x01d0 A[Catch: all -> 0x0033, Exception -> 0x0208, UnsatisfiedLinkError -> 0x0223, TryCatch #3 {UnsatisfiedLinkError -> 0x0223, blocks: (B:58:0x0122, B:60:0x0154, B:62:0x016a, B:64:0x0170, B:68:0x0181, B:70:0x0197, B:71:0x01d0, B:72:0x01dd, B:73:0x01de, B:74:0x01eb, B:75:0x01ec, B:76:0x01f9, B:77:0x01fa, B:78:0x0207), top: B:102:0x0122, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:73:0x01de A[Catch: all -> 0x0033, Exception -> 0x0208, UnsatisfiedLinkError -> 0x0223, TryCatch #3 {UnsatisfiedLinkError -> 0x0223, blocks: (B:58:0x0122, B:60:0x0154, B:62:0x016a, B:64:0x0170, B:68:0x0181, B:70:0x0197, B:71:0x01d0, B:72:0x01dd, B:73:0x01de, B:74:0x01eb, B:75:0x01ec, B:76:0x01f9, B:77:0x01fa, B:78:0x0207), top: B:102:0x0122, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:75:0x01ec A[Catch: all -> 0x0033, Exception -> 0x0208, UnsatisfiedLinkError -> 0x0223, TryCatch #3 {UnsatisfiedLinkError -> 0x0223, blocks: (B:58:0x0122, B:60:0x0154, B:62:0x016a, B:64:0x0170, B:68:0x0181, B:70:0x0197, B:71:0x01d0, B:72:0x01dd, B:73:0x01de, B:74:0x01eb, B:75:0x01ec, B:76:0x01f9, B:77:0x01fa, B:78:0x0207), top: B:102:0x0122, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:77:0x01fa A[Catch: all -> 0x0033, Exception -> 0x0208, UnsatisfiedLinkError -> 0x0223, TryCatch #3 {UnsatisfiedLinkError -> 0x0223, blocks: (B:58:0x0122, B:60:0x0154, B:62:0x016a, B:64:0x0170, B:68:0x0181, B:70:0x0197, B:71:0x01d0, B:72:0x01dd, B:73:0x01de, B:74:0x01eb, B:75:0x01ec, B:76:0x01f9, B:77:0x01fa, B:78:0x0207), top: B:102:0x0122, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:88:0x0241 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:7:0x0020, B:56:0x0119, B:58:0x0122, B:60:0x0154, B:62:0x016a, B:64:0x0170, B:68:0x0181, B:70:0x0197, B:71:0x01d0, B:72:0x01dd, B:73:0x01de, B:74:0x01eb, B:75:0x01ec, B:76:0x01f9, B:77:0x01fa, B:78:0x0207, B:80:0x0209, B:84:0x0218, B:86:0x0224, B:88:0x0241, B:91:0x024b, B:10:0x002d, B:19:0x0056, B:21:0x0060, B:24:0x007c, B:26:0x0086), top: B:98:0x000b, inners: #3, #4 }] */
        /* JADX WARN: Code duplicated, block: B:99:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws Throwable {
            C56922 c56922;
            Object $result2;
            boolean automatic;
            Object $result3;
            Prepared prepared;
            Object objRunPreparation;
            Object $result4;
            Object $result5;
            boolean automatic2;
            NativeLibraryLoader nativeLibraryLoader;
            Context context;
            boolean z;
            Prepared prepared2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        c56922 = this;
                        $result2 = $result;
                        c56922.label = 1;
                        if (Mutex.DefaultImpls.lock$default(UmbrellaManager.mutex, null, c56922, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (UmbrellaManager.INSTANCE.restartNeeded(c56922.f848$c)) {
                            UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, c56922.f848$c, "Перезапустите лаунчер, чтобы применить изменение Umbrella", false, 0, true, 12, null);
                            Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                            Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                            return boolBoxBoolean;
                        }
                        automatic = UmbrellaManager.INSTANCE.enabled(c56922.f848$c);
                        if (automatic) {
                            c56922.Z$0 = automatic;
                            c56922.label = 2;
                            objRunPreparation = UmbrellaManager.INSTANCE.runPreparation(c56922.f848$c, c56922);
                            if (objRunPreparation == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            $result4 = $result2;
                            $result5 = objRunPreparation;
                            automatic2 = automatic;
                            try {
                                prepared = (Prepared) $result5;
                                boolean z2 = automatic2;
                                $result3 = $result4;
                                automatic = z2;
                            } catch (Throwable th) {
                                th = th;
                                Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                                throw th;
                            }
                        } else {
                            $result3 = $result2;
                            prepared = null;
                        }
                        if (automatic) {
                            try {
                                if (UmbrellaManager.INSTANCE.isLoaded() && (prepared == null || !Intrinsics.areEqual(UmbrellaManager.loadedPath, prepared.getFile().getAbsolutePath()) || !Intrinsics.areEqual(UmbrellaManager.loadedIdentity, prepared.getIdentity()))) {
                                    UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, c56922.f848$c, "В процессе уже работает другая или недоступная Umbrella. Требуется перезапуск", false, 0, true, 12, null);
                                    Boolean boolBoxBoolean2 = Boxing.boxBoolean(false);
                                    Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                                    return boolBoxBoolean2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                                throw th;
                            }
                        }
                        nativeLibraryLoader = NativeLibraryLoader.INSTANCE;
                        context = c56922.f848$c;
                        if (automatic) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c56922.L$0 = prepared;
                        c56922.Z$0 = automatic;
                        c56922.label = 3;
                        if (nativeLibraryLoader.load(context, z, c56922) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        prepared2 = prepared;
                        if (automatic && prepared2 != null && !UmbrellaManager.INSTANCE.isLoaded()) {
                            try {
                                try {
                                    UmbrellaManager.INSTANCE.applyPendingCommand(c56922.f848$c);
                                    UmbrellaConfig.INSTANCE.validate(UmbrellaConfig.INSTANCE.read(UmbrellaManager.INSTANCE.config(c56922.f848$c)), UmbrellaManager.INSTANCE.kolsonCommand(c56922.f848$c));
                                    if (UmbrellaPolicy.INSTANCE.verified(prepared2.getFile(), prepared2.getBuild())) {
                                        throw new IllegalStateException("Проверка файла Umbrella не пройдена".toString());
                                    }
                                    if (Intrinsics.areEqual(UmbrellaManager.INSTANCE.identity(c56922.f848$c).getFirst(), prepared2.getIdentity())) {
                                        throw new IllegalStateException("Ключ изменился".toString());
                                    }
                                    if (KolsonLibrary.isLibraryLoaded() || KolsonLibrary.prepareOptionalLibrary(prepared2.getFile().getAbsolutePath())) {
                                        throw new IllegalStateException("Защита не разрешила эту сборку Umbrella. Подождите публикации обновления".toString());
                                    }
                                    if (Intrinsics.areEqual(UmbrellaManager.INSTANCE.identity(c56922.f848$c).getFirst(), prepared2.getIdentity())) {
                                        throw new IllegalStateException("Ключ изменился. Umbrella пропущена".toString());
                                    }
                                    System.load(prepared2.getFile().getAbsolutePath());
                                    UmbrellaManager umbrellaManager = UmbrellaManager.INSTANCE;
                                    UmbrellaManager.loadedPath = prepared2.getFile().getAbsolutePath();
                                    UmbrellaManager umbrellaManager2 = UmbrellaManager.INSTANCE;
                                    UmbrellaManager.loadedManaged = true;
                                    UmbrellaManager umbrellaManager3 = UmbrellaManager.INSTANCE;
                                    UmbrellaManager.loadedIdentity = prepared2.getIdentity();
                                    KolsonLibrary.notifyModuleLoaded();
                                    UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, c56922.f848$c, null, false, 0, false, 30, null);
                                } catch (Exception error) {
                                    UmbrellaManager umbrellaManager4 = UmbrellaManager.INSTANCE;
                                    Context context2 = c56922.f848$c;
                                    String message = error.getMessage();
                                    UmbrellaManager.publish$default(umbrellaManager4, context2, message == null ? "Umbrella пропущена" : message, false, 0, false, 28, null);
                                }
                            } catch (UnsatisfiedLinkError error2) {
                                UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, c56922.f848$c, "Не удалось загрузить Umbrella. Игра запустится без неё", false, 0, false, 28, null);
                                Log.w("Umbrella", "Optional JNI unavailable", error2);
                            }
                        }
                        if (automatic && UmbrellaManager.INSTANCE.isLoaded() && prepared2 != null) {
                            UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, c56922.f848$c, null, false, 0, false, 30, null);
                        }
                        Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                        return Boxing.boxBoolean(true);
                    case 1:
                        c56922 = this;
                        $result2 = $result;
                        ResultKt.throwOnFailure($result2);
                        if (UmbrellaManager.INSTANCE.restartNeeded(c56922.f848$c)) {
                            UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, c56922.f848$c, "Перезапустите лаунчер, чтобы применить изменение Umbrella", false, 0, true, 12, null);
                            Boolean boolBoxBoolean3 = Boxing.boxBoolean(false);
                            Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                            return boolBoxBoolean3;
                        }
                        automatic = UmbrellaManager.INSTANCE.enabled(c56922.f848$c);
                        if (automatic) {
                            c56922.Z$0 = automatic;
                            c56922.label = 2;
                            objRunPreparation = UmbrellaManager.INSTANCE.runPreparation(c56922.f848$c, c56922);
                            if (objRunPreparation == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            $result4 = $result2;
                            $result5 = objRunPreparation;
                            automatic2 = automatic;
                            prepared = (Prepared) $result5;
                            boolean z3 = automatic2;
                            $result3 = $result4;
                            automatic = z3;
                        } else {
                            $result3 = $result2;
                            prepared = null;
                        }
                        if (automatic) {
                            if (UmbrellaManager.INSTANCE.isLoaded()) {
                                UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, c56922.f848$c, "В процессе уже работает другая или недоступная Umbrella. Требуется перезапуск", false, 0, true, 12, null);
                                Boolean boolBoxBoolean4 = Boxing.boxBoolean(false);
                                Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                                return boolBoxBoolean4;
                            }
                        }
                        nativeLibraryLoader = NativeLibraryLoader.INSTANCE;
                        context = c56922.f848$c;
                        if (automatic) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c56922.L$0 = prepared;
                        c56922.Z$0 = automatic;
                        c56922.label = 3;
                        if (nativeLibraryLoader.load(context, z, c56922) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        prepared2 = prepared;
                        if (automatic) {
                            UmbrellaManager.INSTANCE.applyPendingCommand(c56922.f848$c);
                            UmbrellaConfig.INSTANCE.validate(UmbrellaConfig.INSTANCE.read(UmbrellaManager.INSTANCE.config(c56922.f848$c)), UmbrellaManager.INSTANCE.kolsonCommand(c56922.f848$c));
                            if (UmbrellaPolicy.INSTANCE.verified(prepared2.getFile(), prepared2.getBuild())) {
                                throw new IllegalStateException("Проверка файла Umbrella не пройдена".toString());
                            }
                            if (Intrinsics.areEqual(UmbrellaManager.INSTANCE.identity(c56922.f848$c).getFirst(), prepared2.getIdentity())) {
                                throw new IllegalStateException("Ключ изменился".toString());
                            }
                            if (KolsonLibrary.isLibraryLoaded() || KolsonLibrary.prepareOptionalLibrary(prepared2.getFile().getAbsolutePath())) {
                                throw new IllegalStateException("Защита не разрешила эту сборку Umbrella. Подождите публикации обновления".toString());
                            }
                            if (Intrinsics.areEqual(UmbrellaManager.INSTANCE.identity(c56922.f848$c).getFirst(), prepared2.getIdentity())) {
                                throw new IllegalStateException("Ключ изменился. Umbrella пропущена".toString());
                            }
                            System.load(prepared2.getFile().getAbsolutePath());
                            UmbrellaManager umbrellaManager5 = UmbrellaManager.INSTANCE;
                            UmbrellaManager.loadedPath = prepared2.getFile().getAbsolutePath();
                            UmbrellaManager umbrellaManager6 = UmbrellaManager.INSTANCE;
                            UmbrellaManager.loadedManaged = true;
                            UmbrellaManager umbrellaManager7 = UmbrellaManager.INSTANCE;
                            UmbrellaManager.loadedIdentity = prepared2.getIdentity();
                            KolsonLibrary.notifyModuleLoaded();
                            UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, c56922.f848$c, null, false, 0, false, 30, null);
                        }
                        if (automatic) {
                            UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, c56922.f848$c, null, false, 0, false, 30, null);
                        }
                        Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                        return Boxing.boxBoolean(true);
                    case 2:
                        c56922 = this;
                        $result5 = $result;
                        boolean automatic3 = c56922.Z$0;
                        ResultKt.throwOnFailure($result5);
                        automatic2 = automatic3;
                        $result4 = $result5;
                        prepared = (Prepared) $result5;
                        boolean z4 = automatic2;
                        $result3 = $result4;
                        automatic = z4;
                        if (automatic) {
                            if (UmbrellaManager.INSTANCE.isLoaded()) {
                                UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, c56922.f848$c, "В процессе уже работает другая или недоступная Umbrella. Требуется перезапуск", false, 0, true, 12, null);
                                Boolean boolBoxBoolean5 = Boxing.boxBoolean(false);
                                Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                                return boolBoxBoolean5;
                            }
                        }
                        nativeLibraryLoader = NativeLibraryLoader.INSTANCE;
                        context = c56922.f848$c;
                        if (automatic) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c56922.L$0 = prepared;
                        c56922.Z$0 = automatic;
                        c56922.label = 3;
                        if (nativeLibraryLoader.load(context, z, c56922) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        prepared2 = prepared;
                        if (automatic) {
                            UmbrellaManager.INSTANCE.applyPendingCommand(c56922.f848$c);
                            UmbrellaConfig.INSTANCE.validate(UmbrellaConfig.INSTANCE.read(UmbrellaManager.INSTANCE.config(c56922.f848$c)), UmbrellaManager.INSTANCE.kolsonCommand(c56922.f848$c));
                            if (UmbrellaPolicy.INSTANCE.verified(prepared2.getFile(), prepared2.getBuild())) {
                                throw new IllegalStateException("Проверка файла Umbrella не пройдена".toString());
                            }
                            if (Intrinsics.areEqual(UmbrellaManager.INSTANCE.identity(c56922.f848$c).getFirst(), prepared2.getIdentity())) {
                                throw new IllegalStateException("Ключ изменился".toString());
                            }
                            if (KolsonLibrary.isLibraryLoaded() || KolsonLibrary.prepareOptionalLibrary(prepared2.getFile().getAbsolutePath())) {
                                throw new IllegalStateException("Защита не разрешила эту сборку Umbrella. Подождите публикации обновления".toString());
                            }
                            if (Intrinsics.areEqual(UmbrellaManager.INSTANCE.identity(c56922.f848$c).getFirst(), prepared2.getIdentity())) {
                                throw new IllegalStateException("Ключ изменился. Umbrella пропущена".toString());
                            }
                            System.load(prepared2.getFile().getAbsolutePath());
                            UmbrellaManager umbrellaManager8 = UmbrellaManager.INSTANCE;
                            UmbrellaManager.loadedPath = prepared2.getFile().getAbsolutePath();
                            UmbrellaManager umbrellaManager9 = UmbrellaManager.INSTANCE;
                            UmbrellaManager.loadedManaged = true;
                            UmbrellaManager umbrellaManager10 = UmbrellaManager.INSTANCE;
                            UmbrellaManager.loadedIdentity = prepared2.getIdentity();
                            KolsonLibrary.notifyModuleLoaded();
                            UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, c56922.f848$c, null, false, 0, false, 30, null);
                        }
                        if (automatic) {
                            UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, c56922.f848$c, null, false, 0, false, 30, null);
                        }
                        Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                        return Boxing.boxBoolean(true);
                    case 3:
                        c56922 = this;
                        boolean automatic4 = c56922.Z$0;
                        Prepared prepared3 = (Prepared) c56922.L$0;
                        ResultKt.throwOnFailure($result);
                        prepared2 = prepared3;
                        automatic = automatic4;
                        if (automatic) {
                            UmbrellaManager.INSTANCE.applyPendingCommand(c56922.f848$c);
                            UmbrellaConfig.INSTANCE.validate(UmbrellaConfig.INSTANCE.read(UmbrellaManager.INSTANCE.config(c56922.f848$c)), UmbrellaManager.INSTANCE.kolsonCommand(c56922.f848$c));
                            if (UmbrellaPolicy.INSTANCE.verified(prepared2.getFile(), prepared2.getBuild())) {
                                throw new IllegalStateException("Проверка файла Umbrella не пройдена".toString());
                            }
                            if (Intrinsics.areEqual(UmbrellaManager.INSTANCE.identity(c56922.f848$c).getFirst(), prepared2.getIdentity())) {
                                throw new IllegalStateException("Ключ изменился".toString());
                            }
                            if (KolsonLibrary.isLibraryLoaded() || KolsonLibrary.prepareOptionalLibrary(prepared2.getFile().getAbsolutePath())) {
                                throw new IllegalStateException("Защита не разрешила эту сборку Umbrella. Подождите публикации обновления".toString());
                            }
                            if (Intrinsics.areEqual(UmbrellaManager.INSTANCE.identity(c56922.f848$c).getFirst(), prepared2.getIdentity())) {
                                throw new IllegalStateException("Ключ изменился. Umbrella пропущена".toString());
                            }
                            System.load(prepared2.getFile().getAbsolutePath());
                            UmbrellaManager umbrellaManager11 = UmbrellaManager.INSTANCE;
                            UmbrellaManager.loadedPath = prepared2.getFile().getAbsolutePath();
                            UmbrellaManager umbrellaManager12 = UmbrellaManager.INSTANCE;
                            UmbrellaManager.loadedManaged = true;
                            UmbrellaManager umbrellaManager13 = UmbrellaManager.INSTANCE;
                            UmbrellaManager.loadedIdentity = prepared2.getIdentity();
                            KolsonLibrary.notifyModuleLoaded();
                            UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, c56922.f848$c, null, false, 0, false, 30, null);
                        }
                        if (automatic) {
                            UmbrellaManager.publish$default(UmbrellaManager.INSTANCE, c56922.f848$c, null, false, 0, false, 30, null);
                        }
                        Mutex.DefaultImpls.unlock$default(UmbrellaManager.mutex, null, 1, null);
                        return Boxing.boxBoolean(true);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final Object beforeGame(Context c, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C56922(c, null), continuation);
    }
}
