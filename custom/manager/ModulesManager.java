package com.blackhub.bronline.neizzir.fragments.custom.manager;

import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomFile;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomIndex;
import com.blackhub.bronline.neizzir.network.CachePolicy;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.EndpointRouter;
import com.blackhub.bronline.neizzir.network.NetworkResult;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.p040io.CloseableKt;
import kotlin.p040io.FilesKt;
import kotlin.p040io.FilesKt__UtilsKt;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.p043io.files.FileSystemKt;
import okhttp3.OkHttpClient;
import okhttp3.internal.p045ws.WebSocketProtocol;
import org.json.JSONObject;

/* JADX INFO: compiled from: ModulesManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0002,-B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0002J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013J\b\u0010\u0014\u001a\u00020\fH\u0002J \u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\f2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010\u001aJ(\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b\u0012\u0004\u0012\u00020\u00110\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\"\u0010!\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u001fJ\u000e\u0010#\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\fJ\u0018\u0010$\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010%J\u0016\u0010&\u001a\u00020\u00112\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0002J\u0010\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u001dH\u0002J\u0010\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/ModulesManager;", "", "context", "Landroid/content/Context;", "client", "Lokhttp3/OkHttpClient;", "(Landroid/content/Context;Lokhttp3/OkHttpClient;)V", "latestFileList", "", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/ModulesManager$RemoteModuleFile;", "remoteVersionById", "Ljava/util/concurrent/ConcurrentHashMap;", "", "computeStatusWithHashAndVersion", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/ModulesManager$ModuleStatus;", "moduleId", "deleteModule", "", "onDeleted", "Lkotlin/Function0;", "detectCurrentArch", "downloadModule", "onFinished", "downloadSingleFile", "", "raw", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchModuleList", "logosDir", "Ljava/io/File;", "onResult", "Lkotlin/Function1;", "getModuleDir", "getModuleStatus", "callback", "isModuleInstalled", "loadRemoteVersionBlocking", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runOnMain", "block", "sha1OfFile", "file", "toast", NotificationCompat.CATEGORY_MESSAGE, "ModuleStatus", "RemoteModuleFile", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class ModulesManager {
    private final OkHttpClient client;
    private final Context context;
    private List<RemoteModuleFile> latestFileList;
    private final ConcurrentHashMap<String, String> remoteVersionById;

    /* JADX INFO: compiled from: ModulesManager.kt */
    @Metadata(m4415d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/ModulesManager$ModuleStatus;", "", "(Ljava/lang/String;I)V", "NOT_INSTALLED", "INSTALLED_SAME", "INSTALLED_OUTDATED", "INCOMPATIBLE", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public enum ModuleStatus {
        NOT_INSTALLED,
        INSTALLED_SAME,
        INSTALLED_OUTDATED,
        INCOMPATIBLE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        public static EnumEntries<ModuleStatus> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$downloadSingleFile$1 */
    /* JADX INFO: compiled from: ModulesManager.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager", m4426f = "ModulesManager.kt", m4427i = {}, m4428l = {442}, m4429m = "downloadSingleFile", m4430n = {}, m4431s = {})
    static final class C53621 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C53621(Continuation<? super C53621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ModulesManager.this.downloadSingleFile(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$loadRemoteVersionBlocking$1 */
    /* JADX INFO: compiled from: ModulesManager.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager", m4426f = "ModulesManager.kt", m4427i = {0}, m4428l = {WebSocketProtocol.PAYLOAD_SHORT}, m4429m = "loadRemoteVersionBlocking", m4430n = {"this"}, m4431s = {"L$0"})
    static final class C53651 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C53651(Continuation<? super C53651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ModulesManager.this.loadRemoteVersionBlocking(null, this);
        }
    }

    public ModulesManager(Context context, OkHttpClient client) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(client, "client");
        this.context = context;
        this.client = client;
        this.latestFileList = CollectionsKt__CollectionsKt.emptyList();
        this.remoteVersionById = new ConcurrentHashMap<>();
    }

    /* JADX INFO: compiled from: ModulesManager.kt */
    @Metadata(m4415d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/ModulesManager$RemoteModuleFile;", "", "path", "", "sha1", "size", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getPath", "()Ljava/lang/String;", "getSha1", "getSize", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final /* data */ class RemoteModuleFile {
        private final String path;
        private final String sha1;
        private final long size;

        public static /* synthetic */ RemoteModuleFile copy$default(RemoteModuleFile remoteModuleFile, String str, String str2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = remoteModuleFile.path;
            }
            if ((i & 2) != 0) {
                str2 = remoteModuleFile.sha1;
            }
            if ((i & 4) != 0) {
                j = remoteModuleFile.size;
            }
            return remoteModuleFile.copy(str, str2, j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSha1() {
            return this.sha1;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        public final RemoteModuleFile copy(String path, String sha1, long size) {
            Intrinsics.checkNotNullParameter(path, "path");
            return new RemoteModuleFile(path, sha1, size);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoteModuleFile)) {
                return false;
            }
            RemoteModuleFile remoteModuleFile = (RemoteModuleFile) other;
            return Intrinsics.areEqual(this.path, remoteModuleFile.path) && Intrinsics.areEqual(this.sha1, remoteModuleFile.sha1) && this.size == remoteModuleFile.size;
        }

        public int hashCode() {
            return (((this.path.hashCode() * 31) + (this.sha1 == null ? 0 : this.sha1.hashCode())) * 31) + Long.hashCode(this.size);
        }

        public String toString() {
            return "RemoteModuleFile(path=" + this.path + ", sha1=" + this.sha1 + ", size=" + this.size + ')';
        }

        public RemoteModuleFile(String path, String sha1, long size) {
            Intrinsics.checkNotNullParameter(path, "path");
            this.path = path;
            this.sha1 = sha1;
            this.size = size;
        }

        public final String getPath() {
            return this.path;
        }

        public final String getSha1() {
            return this.sha1;
        }

        public final long getSize() {
            return this.size;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runOnMain(final Function0<Unit> block) {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            block.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ModulesManager.runOnMain$lambda$0(block);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runOnMain$lambda$0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$fetchModuleList$1 */
    /* JADX INFO: compiled from: ModulesManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$fetchModuleList$1", m4426f = "ModulesManager.kt", m4427i = {0}, m4428l = {75, 87}, m4429m = "invokeSuspend", m4430n = {"$this$launch"}, m4431s = {"L$0"})
    static final class C53631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<String>, Unit> $onResult;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C53631(Function1<? super List<String>, Unit> function1, Continuation<? super C53631> continuation) {
            super(2, continuation);
            this.$onResult = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C53631 c53631 = ModulesManager.this.new C53631(this.$onResult, continuation);
            c53631.L$0 = obj;
            return c53631;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0078  */
        /* JADX WARN: Code duplicated, block: B:15:0x007c  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:34:0x00db A[LOOP:0: B:32:0x00d5->B:34:0x00db, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:38:0x0122  */
        /* JADX WARN: Code duplicated, block: B:43:0x0161  */
        /* JADX WARN: Code duplicated, block: B:46:0x0166  */
        /* JADX WARN: Code duplicated, block: B:48:0x0169  */
        /* JADX WARN: Code duplicated, block: B:49:0x0171  */
        /* JADX WARN: Code duplicated, block: B:51:0x0175  */
        /* JADX WARN: Code duplicated, block: B:55:0x01ac A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:56:0x01ad  */
        /* JADX WARN: Code duplicated, block: B:64:0x0179 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object bytes;
            C53631 c53631;
            Object $result2;
            NetworkResult result;
            NetworkResult.Success success;
            List remoteFiles;
            Collection destination$iv$iv;
            int $i$f$mapTo;
            Iterator it;
            Collection destination$iv$iv2;
            List ids;
            List list;
            List it2;
            boolean z;
            String str;
            byte[] it3;
            Object objM15551constructorimpl;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    final CoroutineScope $this$launch = (CoroutineScope) this.L$0;
                    EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                    CachePolicy.LastKnownGood lastKnownGood = new CachePolicy.LastKnownGood("custom-index:modules", 0L, 2, null);
                    Function1<byte[], Boolean> function1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$fetchModuleList$1$result$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(byte[] it4) {
                            Object objM15551constructorimpl2;
                            Intrinsics.checkNotNullParameter(it4, "it");
                            CoroutineScope coroutineScope = $this$launch;
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                objM15551constructorimpl2 = Result.m15551constructorimpl(Boolean.valueOf(!RemoteCustomIndex.INSTANCE.parseFiles(new String(it4, Charsets.UTF_8)).isEmpty()));
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM15551constructorimpl2 = Result.m15551constructorimpl(ResultKt.createFailure(th));
                            }
                            if (Result.m15557isFailureimpl(objM15551constructorimpl2)) {
                                objM15551constructorimpl2 = false;
                            }
                            return (Boolean) objM15551constructorimpl2;
                        }
                    };
                    this.L$0 = $this$launch;
                    this.label = 1;
                    bytes = router.getBytes(endpointGroup, "/api/modules", (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : lastKnownGood, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? EndpointRouter.C56582.INSTANCE : function1, this);
                    if (bytes == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c53631 = this;
                    $result2 = $result;
                    result = (NetworkResult) bytes;
                    if (result instanceof NetworkResult.Success) {
                        success = (NetworkResult.Success) result;
                    } else {
                        success = null;
                    }
                    if (success == null && (it3 = (byte[]) success.getValue()) != null) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            objM15551constructorimpl = Result.m15551constructorimpl(RemoteCustomIndex.INSTANCE.parseFiles(new String(it3, Charsets.UTF_8)));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                        }
                        if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
                            objM15551constructorimpl = null;
                        }
                        remoteFiles = (List) objM15551constructorimpl;
                        break;
                    } else {
                        remoteFiles = null;
                    }
                    if (remoteFiles == null) {
                        remoteFiles = CollectionsKt__CollectionsKt.emptyList();
                    }
                    ModulesManager modulesManager = ModulesManager.this;
                    Iterable $this$map$iv = remoteFiles;
                    destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
                    $i$f$mapTo = 0;
                    for (it = $this$map$iv.iterator(); it.hasNext(); it = it) {
                        Object item$iv$iv = it.next();
                        RemoteCustomFile it4 = (RemoteCustomFile) item$iv$iv;
                        destination$iv$iv.add(new RemoteModuleFile(it4.getPath(), it4.getSha1(), it4.getSize()));
                        $i$f$mapTo = $i$f$mapTo;
                    }
                    modulesManager.latestFileList = (List) destination$iv$iv;
                    Iterable $this$forEach$iv$iv$iv = remoteFiles;
                    destination$iv$iv2 = new ArrayList();
                    for (Object element$iv$iv : $this$forEach$iv$iv$iv) {
                        RemoteCustomFile file = (RemoteCustomFile) element$iv$iv;
                        it2 = StringsKt__StringsKt.split$default((CharSequence) file.getPath(), new char[]{FileSystemKt.UnixPathSeparator}, false, 0, 6, (Object) null);
                        if (it2.size() >= 2 || !Intrinsics.areEqual(it2.get(0), "modules")) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            it2 = null;
                        }
                        if (it2 != null) {
                            str = (String) it2.get(1);
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            destination$iv$iv2.add(str);
                        }
                    }
                    ids = CollectionsKt___CollectionsKt.distinct((List) destination$iv$iv2);
                    list = remoteFiles;
                    c53631.L$0 = null;
                    c53631.label = 2;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(list, ModulesManager.this, c53631.$onResult, ids, null), c53631) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure($result);
                    bytes = $result;
                    c53631 = this;
                    $result2 = bytes;
                    result = (NetworkResult) bytes;
                    if (result instanceof NetworkResult.Success) {
                        success = (NetworkResult.Success) result;
                    } else {
                        success = null;
                    }
                    if (success == null) {
                        remoteFiles = null;
                    } else {
                        remoteFiles = null;
                    }
                    if (remoteFiles == null) {
                        remoteFiles = CollectionsKt__CollectionsKt.emptyList();
                    }
                    ModulesManager modulesManager2 = ModulesManager.this;
                    Iterable $this$map$iv2 = remoteFiles;
                    destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv2, 10));
                    $i$f$mapTo = 0;
                    while (it.hasNext()) {
                        Object item$iv$iv2 = it.next();
                        RemoteCustomFile it5 = (RemoteCustomFile) item$iv$iv2;
                        destination$iv$iv.add(new RemoteModuleFile(it5.getPath(), it5.getSha1(), it5.getSize()));
                        $i$f$mapTo = $i$f$mapTo;
                    }
                    modulesManager2.latestFileList = (List) destination$iv$iv;
                    Iterable $this$forEach$iv$iv$iv2 = remoteFiles;
                    destination$iv$iv2 = new ArrayList();
                    while (r10.hasNext()) {
                        RemoteCustomFile file2 = (RemoteCustomFile) element$iv$iv;
                        it2 = StringsKt__StringsKt.split$default((CharSequence) file2.getPath(), new char[]{FileSystemKt.UnixPathSeparator}, false, 0, 6, (Object) null);
                        if (it2.size() >= 2) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            it2 = null;
                        }
                        if (it2 != null) {
                            str = (String) it2.get(1);
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            destination$iv$iv2.add(str);
                        }
                    }
                    ids = CollectionsKt___CollectionsKt.distinct((List) destination$iv$iv2);
                    list = remoteFiles;
                    c53631.L$0 = null;
                    c53631.label = 2;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(list, ModulesManager.this, c53631.$onResult, ids, null), c53631) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 2:
                    ResultKt.throwOnFailure($result);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$fetchModuleList$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: ModulesManager.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$fetchModuleList$1$2", m4426f = "ModulesManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<String> $ids;
            final /* synthetic */ Function1<List<String>, Unit> $onResult;
            final /* synthetic */ List<RemoteCustomFile> $remoteFiles;
            int label;
            final /* synthetic */ ModulesManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(List<RemoteCustomFile> list, ModulesManager modulesManager, Function1<? super List<String>, Unit> function1, List<String> list2, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$remoteFiles = list;
                this.this$0 = modulesManager;
                this.$onResult = function1;
                this.$ids = list2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$remoteFiles, this.this$0, this.$onResult, this.$ids, continuation);
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
                        if (this.$remoteFiles.isEmpty()) {
                            this.this$0.toast("Не удалось получить список модулей");
                        }
                        this.$onResult.invoke(this.$ids);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void fetchModuleList(File logosDir, Function1<? super List<String>, Unit> onResult) {
        Intrinsics.checkNotNullParameter(logosDir, "logosDir");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        BuildersKt__Builders_commonKt.launch$default(NetworkRuntime.INSTANCE.getApplicationScope(), null, null, new C53631(onResult, null), 3, null);
    }

    private final String detectCurrentArch() {
        String dir = this.context.getApplicationInfo().nativeLibraryDir;
        if (dir == null) {
            dir = "";
        }
        return StringsKt__StringsKt.contains((CharSequence) dir, (CharSequence) "arm64", true) ? "arm64" : "arm32";
    }

    public final boolean isModuleInstalled(String moduleId) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        File dir = getModuleDir(moduleId);
        if (dir == null || !dir.exists()) {
            return false;
        }
        Sequence $this$any$iv = FilesKt.walkTopDown(dir);
        for (Object element$iv : $this$any$iv) {
            File it = (File) element$iv;
            if (it.isFile() && StringsKt__StringsJVMKt.equals(FilesKt__UtilsKt.getExtension(it), "so", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$getModuleStatus$1 */
    /* JADX INFO: compiled from: ModulesManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$getModuleStatus$1", m4426f = "ModulesManager.kt", m4427i = {}, m4428l = {114}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C53641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<ModuleStatus, Unit> $callback;
        final /* synthetic */ String $moduleId;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C53641(String str, Function1<? super ModuleStatus, Unit> function1, Continuation<? super C53641> continuation) {
            super(2, continuation);
            this.$moduleId = str;
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ModulesManager.this.new C53641(this.$moduleId, this.$callback, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0058  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C53641 c53641;
            ConcurrentHashMap concurrentHashMap;
            String str;
            String str2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c53641 = this;
                    if (!ModulesManager.this.remoteVersionById.containsKey(c53641.$moduleId)) {
                        concurrentHashMap = ModulesManager.this.remoteVersionById;
                        str = c53641.$moduleId;
                        c53641.L$0 = concurrentHashMap;
                        c53641.L$1 = str;
                        c53641.label = 1;
                        Object objLoadRemoteVersionBlocking = ModulesManager.this.loadRemoteVersionBlocking(c53641.$moduleId, c53641);
                        if (objLoadRemoteVersionBlocking == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        $result = objLoadRemoteVersionBlocking;
                        str2 = (String) $result;
                        if (str2 == null) {
                            str2 = "";
                        }
                        concurrentHashMap.put(str, str2);
                    }
                    final ModuleStatus status = ModulesManager.this.computeStatusWithHashAndVersion(c53641.$moduleId);
                    ModulesManager modulesManager = ModulesManager.this;
                    final Function1<ModuleStatus, Unit> function1 = c53641.$callback;
                    modulesManager.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager.getModuleStatus.1.1
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
                            function1.invoke(status);
                        }
                    });
                    return Unit.INSTANCE;
                case 1:
                    String str3 = (String) this.L$1;
                    concurrentHashMap = (Map) this.L$0;
                    ResultKt.throwOnFailure($result);
                    str = str3;
                    c53641 = this;
                    str2 = (String) $result;
                    if (str2 == null) {
                        str2 = "";
                    }
                    concurrentHashMap.put(str, str2);
                    final ModuleStatus status2 = ModulesManager.this.computeStatusWithHashAndVersion(c53641.$moduleId);
                    ModulesManager modulesManager2 = ModulesManager.this;
                    final Function1<? super ModuleStatus, Unit> function2 = c53641.$callback;
                    modulesManager2.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager.getModuleStatus.1.1
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
                            function2.invoke(status2);
                        }
                    });
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void getModuleStatus(String moduleId, Function1<? super ModuleStatus, Unit> callback) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C53641(moduleId, callback, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object loadRemoteVersionBlocking(String moduleId, Continuation<? super String> continuation) {
        C53651 c53651;
        Object element$iv;
        RemoteModuleFile remoteModuleFile;
        String infoPath;
        Object bytes;
        ModulesManager modulesManager;
        RemoteModuleFile it;
        Object objM15551constructorimpl;
        if (continuation instanceof C53651) {
            c53651 = (C53651) continuation;
            if ((c53651.label & Integer.MIN_VALUE) != 0) {
                c53651.label -= Integer.MIN_VALUE;
            } else {
                c53651 = new C53651(continuation);
            }
        } else {
            c53651 = new C53651(continuation);
        }
        Object $result = c53651.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c53651.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Iterable $this$firstOrNull$iv = this.latestFileList;
                Iterator it2 = $this$firstOrNull$iv.iterator();
                do {
                    if (it2.hasNext()) {
                        element$iv = it2.next();
                        it = (RemoteModuleFile) element$iv;
                    } else {
                        element$iv = null;
                    }
                    remoteModuleFile = (RemoteModuleFile) element$iv;
                    if (remoteModuleFile != null || (infoPath = remoteModuleFile.getPath()) == null) {
                        return null;
                    }
                    CachePolicy.LastKnownGood lastKnownGood = new CachePolicy.LastKnownGood("modules-info:" + moduleId, 0L, 2, null);
                    Function1<byte[], Boolean> function1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$loadRemoteVersionBlocking$result$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(byte[] it3) {
                            Object objM15551constructorimpl2;
                            Intrinsics.checkNotNullParameter(it3, "it");
                            ModulesManager modulesManager2 = this.this$0;
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                String strOptString = new JSONObject(new String(it3, Charsets.UTF_8)).optString("version");
                                Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                                objM15551constructorimpl2 = Result.m15551constructorimpl(Boolean.valueOf(!StringsKt__StringsKt.isBlank(strOptString)));
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM15551constructorimpl2 = Result.m15551constructorimpl(ResultKt.createFailure(th));
                            }
                            if (Result.m15557isFailureimpl(objM15551constructorimpl2)) {
                                objM15551constructorimpl2 = false;
                            }
                            return (Boolean) objM15551constructorimpl2;
                        }
                    };
                    c53651.L$0 = this;
                    c53651.label = 1;
                    bytes = NetworkRuntime.INSTANCE.getRouter().getBytes(EndpointGroup.KOLSON, "/api/fetch_file/" + infoPath, (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : lastKnownGood, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? EndpointRouter.C56582.INSTANCE : function1, c53651);
                    if (bytes == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    modulesManager = this;
                    break;
                } while (!Intrinsics.areEqual(it.getPath(), "modules/" + moduleId + "/info.json"));
                remoteModuleFile = (RemoteModuleFile) element$iv;
                if (remoteModuleFile != null) {
                }
                return null;
            case 1:
                modulesManager = (ModulesManager) c53651.L$0;
                ResultKt.throwOnFailure($result);
                bytes = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        NetworkResult.Success result = bytes instanceof NetworkResult.Success ? (NetworkResult.Success) bytes : null;
        if (result == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            String strOptString = new JSONObject(new String((byte[]) result.getValue(), Charsets.UTF_8)).optString("version", "");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            objM15551constructorimpl = Result.m15551constructorimpl(StringsKt__StringsKt.trim((CharSequence) strOptString).toString());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
            return null;
        }
        return objM15551constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModuleStatus computeStatusWithHashAndVersion(String moduleId) {
        String str;
        String localSha;
        File dir = getModuleDir(moduleId);
        if (dir != null && dir.exists()) {
            try {
                PackageManager pm = this.context.getPackageManager();
                PackageInfo p = pm.getPackageInfo(this.context.getPackageName(), 0);
                str = p.versionName;
                if (str == null) {
                    str = "";
                }
            } catch (Exception e) {
                str = "";
            }
            String appVersion = str;
            String remoteVer = this.remoteVersionById.get(moduleId);
            String str2 = remoteVer;
            if (!(str2 == null || StringsKt__StringsKt.isBlank(str2))) {
                if ((appVersion.length() > 0) && !StringsKt__StringsJVMKt.equals(remoteVer, appVersion, true)) {
                    return ModuleStatus.INCOMPATIBLE;
                }
            }
            if (this.latestFileList.isEmpty()) {
                return isModuleInstalled(moduleId) ? ModuleStatus.INSTALLED_SAME : ModuleStatus.NOT_INSTALLED;
            }
            String arch = detectCurrentArch();
            Iterable $this$filter$iv = this.latestFileList;
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv : $this$filter$iv) {
                RemoteModuleFile file = (RemoteModuleFile) element$iv$iv;
                Iterable $this$filter$iv2 = $this$filter$iv;
                String appVersion2 = appVersion;
                String remoteVer2 = remoteVer;
                if (StringsKt__StringsJVMKt.startsWith$default(file.getPath(), new StringBuilder().append("modules/").append(moduleId).append(FileSystemKt.UnixPathSeparator).append(arch).append(FileSystemKt.UnixPathSeparator).toString(), false, 2, null) && StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.substringAfterLast(file.getPath(), '.', ""), "so", true)) {
                    destination$iv$iv.add(element$iv$iv);
                }
                $this$filter$iv = $this$filter$iv2;
                appVersion = appVersion2;
                remoteVer = remoteVer2;
            }
            List<RemoteModuleFile> remoteSo = (List) destination$iv$iv;
            if (remoteSo.isEmpty()) {
                return isModuleInstalled(moduleId) ? ModuleStatus.INSTALLED_SAME : ModuleStatus.NOT_INSTALLED;
            }
            boolean anyInstalled = false;
            boolean anyMismatch = false;
            for (RemoteModuleFile remote : remoteSo) {
                String rel = StringsKt__StringsKt.removePrefix(remote.getPath(), (CharSequence) ("modules/" + moduleId + FileSystemKt.UnixPathSeparator));
                File local = new File(dir, rel);
                if (!local.exists()) {
                    anyMismatch = true;
                } else {
                    String remoteSha = remote.getSha1();
                    String str3 = remoteSha;
                    if (!(str3 == null || StringsKt__StringsKt.isBlank(str3))) {
                        try {
                            localSha = sha1OfFile(local);
                        } catch (Exception e2) {
                            localSha = "";
                        }
                        if (!StringsKt__StringsJVMKt.equals(remoteSha, localSha, true)) {
                            anyMismatch = true;
                            anyInstalled = true;
                        }
                    }
                    anyInstalled = true;
                }
            }
            if (anyInstalled) {
                return anyMismatch ? ModuleStatus.INSTALLED_OUTDATED : ModuleStatus.INSTALLED_SAME;
            }
            return ModuleStatus.NOT_INSTALLED;
        }
        return ModuleStatus.NOT_INSTALLED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void downloadModule$default(ModulesManager modulesManager, String str, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        modulesManager.downloadModule(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v59, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r6v27, types: [T, java.util.List] */
    /*  JADX ERROR: NullPointerException in pass: ProcessVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getUseList()" because "ssaVar" is null
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final void downloadModule(final java.lang.String r42, final kotlin.jvm.functions.Function0<kotlin.Unit> r43) {
        /*
            Method dump skipped, instruction units count: 1430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager.downloadModule(java.lang.String, kotlin.jvm.functions.Function0):void");
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$downloadModule$2 */
    /* JADX INFO: compiled from: ModulesManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$downloadModule$2", m4426f = "ModulesManager.kt", m4427i = {}, m4428l = {215}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C53602 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $moduleId;
        final /* synthetic */ Function0<Unit> $onFinished;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53602(String str, Function0<Unit> function0, Continuation<? super C53602> continuation) {
            super(2, continuation);
            this.$moduleId = str;
            this.$onFinished = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ModulesManager.this.new C53602(this.$moduleId, this.$onFinished, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53602) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C53602 c53602;
            ConcurrentHashMap concurrentHashMap;
            String str;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c53602 = this;
                    concurrentHashMap = ModulesManager.this.remoteVersionById;
                    str = c53602.$moduleId;
                    c53602.L$0 = concurrentHashMap;
                    c53602.L$1 = str;
                    c53602.label = 1;
                    Object objLoadRemoteVersionBlocking = ModulesManager.this.loadRemoteVersionBlocking(c53602.$moduleId, c53602);
                    if (objLoadRemoteVersionBlocking == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objLoadRemoteVersionBlocking;
                    break;
                case 1:
                    String str2 = (String) this.L$1;
                    concurrentHashMap = (Map) this.L$0;
                    ResultKt.throwOnFailure($result);
                    str = str2;
                    c53602 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) $result;
            if (str3 == null) {
                str3 = "";
            }
            concurrentHashMap.put(str, str3);
            ModulesManager modulesManager = ModulesManager.this;
            final ModulesManager modulesManager2 = ModulesManager.this;
            final String str4 = c53602.$moduleId;
            final Function0<Unit> function0 = c53602.$onFinished;
            modulesManager.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager.downloadModule.2.1
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
                    modulesManager2.downloadModule(str4, function0);
                }
            });
            return Unit.INSTANCE;
        }
    }

    private static final List<String> downloadModule$filterByArch(String $moduleId, ModulesManager this$0, String arch) {
        String prefix = "modules/" + $moduleId + FileSystemKt.UnixPathSeparator + arch + FileSystemKt.UnixPathSeparator;
        Iterable $this$filter$iv = this$0.latestFileList;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            RemoteModuleFile file = (RemoteModuleFile) element$iv$iv;
            boolean z = false;
            if (StringsKt__StringsJVMKt.startsWith$default(file.getPath(), prefix, false, 2, null) && StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.substringAfterLast(file.getPath(), '.', ""), "so", true)) {
                z = true;
            }
            if (z) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        Iterable $this$map$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            RemoteModuleFile it = (RemoteModuleFile) item$iv$iv;
            destination$iv$iv2.add(it.getPath());
        }
        return (List) destination$iv$iv2;
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$downloadModule$3 */
    /* JADX INFO: compiled from: ModulesManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$downloadModule$3", m4426f = "ModulesManager.kt", m4427i = {}, m4428l = {387, 399}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C53613 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProgressBar $bar;
        final /* synthetic */ AlertDialog $dialog;
        final /* synthetic */ AtomicInteger $doneCounter;
        final /* synthetic */ String $infoPath;
        final /* synthetic */ String $moduleId;
        final /* synthetic */ Function0<Unit> $onFinished;
        final /* synthetic */ AtomicInteger $successCounter;
        final /* synthetic */ Ref.ObjectRef<List<String>> $toDownload;
        final /* synthetic */ int $total;
        final /* synthetic */ TextView $txt;
        final /* synthetic */ Ref.ObjectRef<String> $usingArch;
        Object L$0;
        int label;
        final /* synthetic */ ModulesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53613(Ref.ObjectRef<List<String>> objectRef, ModulesManager modulesManager, String str, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, String str2, ProgressBar progressBar, TextView textView, int i, AlertDialog alertDialog, Ref.ObjectRef<String> objectRef2, Function0<Unit> function0, Continuation<? super C53613> continuation) {
            super(2, continuation);
            this.$toDownload = objectRef;
            this.this$0 = modulesManager;
            this.$moduleId = str;
            this.$successCounter = atomicInteger;
            this.$doneCounter = atomicInteger2;
            this.$infoPath = str2;
            this.$bar = progressBar;
            this.$txt = textView;
            this.$total = i;
            this.$dialog = alertDialog;
            this.$usingArch = objectRef2;
            this.$onFinished = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C53613(this.$toDownload, this.this$0, this.$moduleId, this.$successCounter, this.$doneCounter, this.$infoPath, this.$bar, this.$txt, this.$total, this.$dialog, this.$usingArch, this.$onFinished, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53613) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003a  */
        /* JADX WARN: Code duplicated, block: B:13:0x0052 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0053  */
        /* JADX WARN: Code duplicated, block: B:17:0x0061  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0053 -> B:15:0x0059). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                switch(r1) {
                    case 0: goto L23;
                    case 1: goto L17;
                    case 2: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L11:
                r0 = r12
                kotlin.ResultKt.throwOnFailure(r13)
                goto L9d
            L17:
                r1 = r12
                java.lang.Object r2 = r1.L$0
                java.util.Iterator r2 = (java.util.Iterator) r2
                kotlin.ResultKt.throwOnFailure(r13)
                r3 = r2
                r2 = r0
                r0 = r13
                goto L59
            L23:
                kotlin.ResultKt.throwOnFailure(r13)
                r1 = r12
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<java.lang.String>> r2 = r1.$toDownload
                T r2 = r2.element
                java.util.List r2 = (java.util.List) r2
                java.util.Iterator r2 = r2.iterator()
                r11 = r1
                r1 = r0
                r0 = r11
            L34:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L83
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager r4 = r0.this$0
                java.lang.String r5 = r0.$moduleId
                r6 = r0
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r0.L$0 = r2
                r7 = 1
                r0.label = r7
                java.lang.Object r3 = com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager.access$downloadSingleFile(r4, r3, r5, r6)
                if (r3 != r1) goto L53
                return r1
            L53:
                r11 = r0
                r0 = r13
                r13 = r3
                r3 = r2
                r2 = r1
                r1 = r11
            L59:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L66
                java.util.concurrent.atomic.AtomicInteger r4 = r1.$successCounter
                r4.incrementAndGet()
            L66:
                java.util.concurrent.atomic.AtomicInteger r13 = r1.$doneCounter
                int r13 = r13.incrementAndGet()
                com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager r4 = r1.this$0
                com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$downloadModule$3$1 r5 = new com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$downloadModule$3$1
                android.widget.ProgressBar r6 = r1.$bar
                android.widget.TextView r7 = r1.$txt
                int r8 = r1.$total
                r5.<init>()
                kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
                com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager.access$runOnMain(r4, r5)
                r13 = r0
                r0 = r1
                r1 = r2
                r2 = r3
                goto L34
            L83:
                java.lang.String r2 = r0.$infoPath
                if (r2 == 0) goto L9e
                com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager r2 = r0.this$0
                java.lang.String r3 = r0.$infoPath
                java.lang.String r4 = r0.$moduleId
                r5 = r0
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r6 = 0
                r0.L$0 = r6
                r6 = 2
                r0.label = r6
                java.lang.Object r2 = com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager.access$downloadSingleFile(r2, r3, r4, r5)
                if (r2 != r1) goto L9d
                return r1
            L9d:
            L9e:
                com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager r1 = r0.this$0
                com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$downloadModule$3$2 r10 = new com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$downloadModule$3$2
                android.app.AlertDialog r3 = r0.$dialog
                java.util.concurrent.atomic.AtomicInteger r4 = r0.$successCounter
                int r5 = r0.$total
                com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager r6 = r0.this$0
                java.lang.String r7 = r0.$moduleId
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.String> r8 = r0.$usingArch
                kotlin.jvm.functions.Function0<kotlin.Unit> r9 = r0.$onFinished
                r2 = r10
                r2.<init>()
                kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
                com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager.access$runOnMain(r1, r10)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager.C53613.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void deleteModule$default(ModulesManager modulesManager, String str, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        modulesManager.deleteModule(str, function0);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$deleteModule$1 */
    /* JADX INFO: compiled from: ModulesManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$deleteModule$1", m4426f = "ModulesManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C53581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $moduleId;
        final /* synthetic */ Function0<Unit> $onDeleted;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53581(String str, Function0<Unit> function0, Continuation<? super C53581> continuation) {
            super(2, continuation);
            this.$moduleId = str;
            this.$onDeleted = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ModulesManager.this.new C53581(this.$moduleId, this.$onDeleted, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    File dir = ModulesManager.this.getModuleDir(this.$moduleId);
                    boolean result = dir != null && dir.exists() && FilesKt.deleteRecursively(dir);
                    ModulesManager modulesManager = ModulesManager.this;
                    final boolean z = result;
                    final ModulesManager modulesManager2 = ModulesManager.this;
                    final String str = this.$moduleId;
                    final Function0<Unit> function0 = this.$onDeleted;
                    modulesManager.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager.deleteModule.1.1
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
                            if (z) {
                                modulesManager2.toast("Модуль " + str + " удалён");
                                Function0<Unit> function1 = function0;
                                if (function1 != null) {
                                    function1.invoke();
                                    return;
                                }
                                return;
                            }
                            modulesManager2.toast("Не удалось удалить модуль " + str);
                        }
                    });
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void deleteModule(String moduleId, Function0<Unit> onDeleted) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C53581(moduleId, onDeleted, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:45:0x0109  */
    /* JADX WARN: Code duplicated, block: B:48:0x0129 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v11 'element$iv'  java.lang.Object, still in use, count: 2, list:
          (r3v11 'element$iv' java.lang.Object) from 0x0074: PHI (r3 I:??) = (r3v5 'element$iv' java.lang.Object), (r3v11 'element$iv' java.lang.Object) binds: [B:23:0x0073, B:52:0x0074] A[DONT_GENERATE, DONT_INLINE]
          (r3v11 'element$iv' java.lang.Object A[D('element$iv' java.lang.Object)]) from 0x0065: CHECK_CAST (com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager$RemoteModuleFile) (r3v11 'element$iv' java.lang.Object A[D('element$iv' java.lang.Object)])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object downloadSingleFile(java.lang.String r21, java.lang.String r22, kotlin.coroutines.Continuation<? super java.lang.Boolean> r23) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager.downloadSingleFile(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getModuleDir(String moduleId) {
        File appRoot;
        File filesDir = this.context.getExternalFilesDir(null);
        if (filesDir == null || (appRoot = filesDir.getParentFile()) == null) {
            return null;
        }
        return new File(appRoot, "Custom/modules/" + moduleId);
    }

    private final String sha1OfFile(File file) throws NoSuchAlgorithmException {
        byte[] buf = new byte[8192];
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileInputStream input = fileInputStream;
            while (true) {
                int read = input.read(buf);
                if (read <= 0) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    byte[] bArrDigest = md.digest();
                    Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                    return ArraysKt___ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager.sha1OfFile.2
                        public final CharSequence invoke(byte b) {
                            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                            return str;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                            return invoke(b.byteValue());
                        }
                    }, 30, (Object) null);
                }
                md.update(buf, 0, read);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toast(final String msg) {
        runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager.toast.1
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
                Toast.makeText(ModulesManager.this.context, msg, 0).show();
            }
        });
    }
}
