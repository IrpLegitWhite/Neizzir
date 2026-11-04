package com.blackhub.bronline.neizzir.fragments.custom.sounds;

import android.content.Context;
import android.net.Uri;
import android.util.AtomicFile;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__ReversedViewsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.CloseableKt;
import kotlin.p040io.FilesKt__UtilsKt;
import kotlin.p040io.TextStreamsKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: LocalSoundRepository.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a2\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001aH\u0002J\u0016\u0010\u001d\u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001aH\u0002R\u0016\u0010\u0002\u001a\n \u0005*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006 "}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/LocalSoundRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "kotlin.jvm.PlatformType", "directory", "Ljava/io/File;", FirebaseAnalytics.Param.INDEX, "Landroid/util/AtomicFile;", "getIndex", "()Landroid/util/AtomicFile;", "clearTemporaryFiles", "", "delete", "item", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/LocalSound;", "(Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/LocalSound;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "file", "import", "uri", "Landroid/net/Uri;", "category", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCategory;", "(Landroid/net/Uri;Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "list", "", "(Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "read", "write", FirebaseAnalytics.Param.ITEMS, "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class LocalSoundRepository {
    private static final Mutex mutex = MutexKt.Mutex$default(false, 1, null);
    private static final ScheduledExecutorService watchdog = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.LocalSoundRepository$$ExternalSyntheticLambda0
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return LocalSoundRepository.watchdog$lambda$8(runnable);
        }
    });
    private final Context context;
    private final File directory;

    public LocalSoundRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context.getApplicationContext();
        this.directory = new File(context.getFilesDir(), "custom_sounds");
    }

    private final AtomicFile getIndex() {
        return new AtomicFile(new File(this.directory, "index.json"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread watchdog$lambda$8(Runnable task) {
        Thread $this$watchdog_u24lambda_u248_u24lambda_u247 = new Thread(task, "sound-import-timeout");
        $this$watchdog_u24lambda_u248_u24lambda_u247.setDaemon(true);
        return $this$watchdog_u24lambda_u248_u24lambda_u247;
    }

    public final File file(LocalSound item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!(new Regex("[a-f0-9]{64}").matches(item.getId()) && item.getCategory().getFormats().contains(item.getInfo().getExtension()))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        File file = this.directory;
        StringBuilder sb = new StringBuilder();
        String lowerCase = item.getCategory().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new File(file, sb.append(lowerCase).append(LauncherConstants.UNDERSCORE_CHAR).append(item.getId()).append('.').append(item.getInfo().getExtension()).toString());
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.sounds.LocalSoundRepository$list$2 */
    /* JADX INFO: compiled from: LocalSoundRepository.kt */
    @Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/LocalSound;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.sounds.LocalSoundRepository$list$2", m4426f = "LocalSoundRepository.kt", m4427i = {0}, m4428l = {146}, m4429m = "invokeSuspend", m4430n = {"$this$withLock_u24default$iv"}, m4431s = {"L$0"})
    static final class C53902 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends LocalSound>>, Object> {
        final /* synthetic */ SoundCategory $category;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53902(SoundCategory soundCategory, Continuation<? super C53902> continuation) {
            super(2, continuation);
            this.$category = soundCategory;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LocalSoundRepository.this.new C53902(this.$category, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends LocalSound>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<LocalSound>>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<LocalSound>> continuation) {
            return ((C53902) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Mutex $this$withLock_u24default$iv;
            LocalSoundRepository localSoundRepository;
            SoundCategory soundCategory;
            Object owner$iv;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    $this$withLock_u24default$iv = LocalSoundRepository.mutex;
                    localSoundRepository = LocalSoundRepository.this;
                    soundCategory = this.$category;
                    owner$iv = null;
                    this.L$0 = $this$withLock_u24default$iv;
                    this.L$1 = localSoundRepository;
                    this.L$2 = soundCategory;
                    this.label = 1;
                    if ($this$withLock_u24default$iv.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    soundCategory = (SoundCategory) this.L$2;
                    localSoundRepository = (LocalSoundRepository) this.L$1;
                    owner$iv = null;
                    $this$withLock_u24default$iv = (Mutex) this.L$0;
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                localSoundRepository.clearTemporaryFiles();
                Iterable $this$filterTo$iv$iv = localSoundRepository.read();
                Collection destination$iv$iv = new ArrayList();
                for (Object element$iv$iv : $this$filterTo$iv$iv) {
                    LocalSound it = (LocalSound) element$iv$iv;
                    if (it.getCategory() == soundCategory && localSoundRepository.file(it).isFile()) {
                        destination$iv$iv.add(element$iv$iv);
                    }
                }
                return CollectionsKt__ReversedViewsKt.asReversed((List) destination$iv$iv);
            } finally {
                $this$withLock_u24default$iv.unlock(owner$iv);
            }
        }
    }

    public final Object list(SoundCategory category, Continuation<? super List<LocalSound>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C53902(category, null), continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.sounds.LocalSoundRepository$import$2 */
    /* JADX INFO: compiled from: LocalSoundRepository.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/LocalSound;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.sounds.LocalSoundRepository$import$2", m4426f = "LocalSoundRepository.kt", m4427i = {0, 1}, m4428l = {146, 47}, m4429m = "invokeSuspend", m4430n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, m4431s = {"L$0", "L$0"})
    static final class C53892 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LocalSound>, Object> {
        final /* synthetic */ SoundCategory $category;
        final /* synthetic */ Uri $uri;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53892(Uri uri, SoundCategory soundCategory, Continuation<? super C53892> continuation) {
            super(2, continuation);
            this.$uri = uri;
            this.$category = soundCategory;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LocalSoundRepository.this.new C53892(this.$uri, this.$category, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LocalSound> continuation) {
            return ((C53892) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0080 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0081  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws Throwable {
            C53892 c53892;
            LocalSoundRepository localSoundRepository;
            Uri uri;
            SoundCategory soundCategory;
            Object owner$iv;
            Mutex $this$withLock_u24default$iv;
            Mutex $this$withLock_u24default$iv2;
            Mutex $this$withLock_u24default$iv3;
            Throwable th;
            Object objWithTimeout;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            Object owner$iv2 = null;
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c53892 = this;
                    Mutex $this$withLock_u24default$iv4 = LocalSoundRepository.mutex;
                    localSoundRepository = LocalSoundRepository.this;
                    uri = c53892.$uri;
                    soundCategory = c53892.$category;
                    owner$iv = null;
                    c53892.L$0 = $this$withLock_u24default$iv4;
                    c53892.L$1 = localSoundRepository;
                    c53892.L$2 = uri;
                    c53892.L$3 = soundCategory;
                    c53892.label = 1;
                    if ($this$withLock_u24default$iv4.lock(null, c53892) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $this$withLock_u24default$iv = $this$withLock_u24default$iv4;
                    $this$withLock_u24default$iv2 = null;
                    try {
                        LocalSoundRepository$import$2$1$1 localSoundRepository$import$2$1$1 = new LocalSoundRepository$import$2$1$1(localSoundRepository, uri, soundCategory, null);
                        c53892.L$0 = $this$withLock_u24default$iv;
                        c53892.L$1 = null;
                        c53892.L$2 = null;
                        c53892.L$3 = null;
                        c53892.label = 2;
                        objWithTimeout = TimeoutKt.withTimeout(10000L, localSoundRepository$import$2$1$1, c53892);
                        if (objWithTimeout == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        $result = objWithTimeout;
                        owner$iv2 = owner$iv;
                        $this$withLock_u24default$iv3 = $this$withLock_u24default$iv;
                        try {
                            Object $result2 = (LocalSound) $result;
                            $this$withLock_u24default$iv3.unlock(owner$iv2);
                            return $result2;
                        } catch (Throwable th2) {
                            th = th2;
                            $this$withLock_u24default$iv3.unlock(owner$iv2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        owner$iv2 = owner$iv;
                        $this$withLock_u24default$iv3 = $this$withLock_u24default$iv;
                        th = th3;
                        $this$withLock_u24default$iv3.unlock(owner$iv2);
                        throw th;
                    }
                case 1:
                    c53892 = this;
                    $this$withLock_u24default$iv2 = null;
                    soundCategory = (SoundCategory) c53892.L$3;
                    uri = (Uri) c53892.L$2;
                    localSoundRepository = (LocalSoundRepository) c53892.L$1;
                    owner$iv = null;
                    $this$withLock_u24default$iv = (Mutex) c53892.L$0;
                    ResultKt.throwOnFailure($result);
                    LocalSoundRepository$import$2$1$1 localSoundRepository$import$2$1$2 = new LocalSoundRepository$import$2$1$1(localSoundRepository, uri, soundCategory, null);
                    c53892.L$0 = $this$withLock_u24default$iv;
                    c53892.L$1 = null;
                    c53892.L$2 = null;
                    c53892.L$3 = null;
                    c53892.label = 2;
                    objWithTimeout = TimeoutKt.withTimeout(10000L, localSoundRepository$import$2$1$2, c53892);
                    if (objWithTimeout == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objWithTimeout;
                    owner$iv2 = owner$iv;
                    $this$withLock_u24default$iv3 = $this$withLock_u24default$iv;
                    Object $result3 = (LocalSound) $result;
                    $this$withLock_u24default$iv3.unlock(owner$iv2);
                    return $result3;
                case 2:
                    $this$withLock_u24default$iv3 = (Mutex) this.L$0;
                    try {
                        ResultKt.throwOnFailure($result);
                        $this$withLock_u24default$iv2 = null;
                        c53892 = this;
                        Object $result4 = (LocalSound) $result;
                        $this$withLock_u24default$iv3.unlock(owner$iv2);
                        return $result4;
                    } catch (Throwable th4) {
                        th = th4;
                        $this$withLock_u24default$iv3.unlock(owner$iv2);
                        throw th;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final Object m14876import(Uri uri, SoundCategory category, Continuation<? super LocalSound> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C53892(uri, category, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearTemporaryFiles() {
        File[] fileArrListFiles = this.directory.listFiles(new FileFilter() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.LocalSoundRepository$$ExternalSyntheticLambda1
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return LocalSoundRepository.clearTemporaryFiles$lambda$0(file);
            }
        });
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            file.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearTemporaryFiles$lambda$0(File file) {
        if (!file.isFile()) {
            return false;
        }
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (!StringsKt__StringsJVMKt.startsWith$default(name, "import_", false, 2, null)) {
            return false;
        }
        Intrinsics.checkNotNull(file);
        return Intrinsics.areEqual(FilesKt__UtilsKt.getExtension(file), "tmp");
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.sounds.LocalSoundRepository$delete$2 */
    /* JADX INFO: compiled from: LocalSoundRepository.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.sounds.LocalSoundRepository$delete$2", m4426f = "LocalSoundRepository.kt", m4427i = {0}, m4428l = {146}, m4429m = "invokeSuspend", m4430n = {"$this$withLock_u24default$iv"}, m4431s = {"L$0"})
    static final class C53882 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LocalSound $item;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53882(LocalSound localSound, Continuation<? super C53882> continuation) {
            super(2, continuation);
            this.$item = localSound;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LocalSoundRepository.this.new C53882(this.$item, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53882) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Mutex $this$withLock_u24default$iv;
            LocalSoundRepository localSoundRepository;
            LocalSound localSound;
            Object owner$iv;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    $this$withLock_u24default$iv = LocalSoundRepository.mutex;
                    localSoundRepository = LocalSoundRepository.this;
                    localSound = this.$item;
                    owner$iv = null;
                    this.L$0 = $this$withLock_u24default$iv;
                    this.L$1 = localSoundRepository;
                    this.L$2 = localSound;
                    this.label = 1;
                    if ($this$withLock_u24default$iv.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    localSound = (LocalSound) this.L$2;
                    localSoundRepository = (LocalSoundRepository) this.L$1;
                    owner$iv = null;
                    $this$withLock_u24default$iv = (Mutex) this.L$0;
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i = 0;
            try {
                Iterable $this$filterNotTo$iv$iv = localSoundRepository.read();
                Collection destination$iv$iv = new ArrayList();
                for (Object element$iv$iv : $this$filterNotTo$iv$iv) {
                    LocalSound it = (LocalSound) element$iv$iv;
                    int i2 = i;
                    if (!(Intrinsics.areEqual(it.getId(), localSound.getId()) && it.getCategory() == localSound.getCategory())) {
                        destination$iv$iv.add(element$iv$iv);
                    }
                    i = i2;
                }
                localSoundRepository.write((List) destination$iv$iv);
                localSoundRepository.file(localSound).delete();
                Unit unit = Unit.INSTANCE;
                return Unit.INSTANCE;
            } finally {
                $this$withLock_u24default$iv.unlock(owner$iv);
            }
        }
    }

    public final Object delete(LocalSound item, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C53882(item, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<LocalSound> read() throws JSONException {
        try {
            FileInputStream fileInputStreamOpenRead = getIndex().openRead();
            Intrinsics.checkNotNullExpressionValue(fileInputStreamOpenRead, "openRead(...)");
            Reader inputStreamReader = new InputStreamReader(fileInputStreamOpenRead, Charsets.UTF_8);
            BufferedReader it = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String text = TextStreamsKt.readText(it);
                CloseableKt.closeFinally(it, null);
                String text2 = text;
                JSONArray array = new JSONArray(text2);
                Iterable $this$map$iv = RangesKt___RangesKt.until(0, array.length());
                Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
                Iterator<Integer> it2 = $this$map$iv.iterator();
                while (it2.hasNext()) {
                    int item$iv$iv = ((IntIterator) it2).nextInt();
                    JSONObject value = array.getJSONObject(item$iv$iv);
                    String string = value.getString("id");
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = value.getString("category");
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    SoundCategory soundCategoryValueOf = SoundCategory.valueOf(string2);
                    String text3 = text2;
                    String string3 = value.getString("name");
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    JSONArray array2 = array;
                    String string4 = value.getString("extension");
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    LocalSound it3 = new LocalSound(string, soundCategoryValueOf, string3, new SoundInfo(string4, value.getLong("durationMs"), value.getInt("sampleRate"), value.getInt("channels")), value.getLong("bytes"));
                    file(it3);
                    destination$iv$iv.add(it3);
                    text2 = text3;
                    array = array2;
                }
                return (List) destination$iv$iv;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        CloseableKt.closeFinally(it, th);
                        throw th2;
                    } catch (FileNotFoundException e) {
                        return CollectionsKt__CollectionsKt.emptyList();
                    }
                }
            }
        } catch (FileNotFoundException e2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(List<LocalSound> items) throws Exception {
        JSONArray values = new JSONArray();
        List<LocalSound> $this$forEach$iv = items;
        for (Object element$iv : $this$forEach$iv) {
            LocalSound item = (LocalSound) element$iv;
            JSONObject $this$write_u24lambda_u246_u24lambda_u245 = new JSONObject();
            $this$write_u24lambda_u246_u24lambda_u245.put("id", item.getId());
            $this$write_u24lambda_u246_u24lambda_u245.put("category", item.getCategory().name());
            $this$write_u24lambda_u246_u24lambda_u245.put("name", item.getName());
            $this$write_u24lambda_u246_u24lambda_u245.put("extension", item.getInfo().getExtension());
            $this$write_u24lambda_u246_u24lambda_u245.put("durationMs", item.getInfo().getDurationMs());
            $this$write_u24lambda_u246_u24lambda_u245.put("sampleRate", item.getInfo().getSampleRate());
            $this$write_u24lambda_u246_u24lambda_u245.put("channels", item.getInfo().getChannels());
            $this$write_u24lambda_u246_u24lambda_u245.put("bytes", item.getBytes());
            values.put($this$write_u24lambda_u246_u24lambda_u245);
        }
        AtomicFile atomic = getIndex();
        FileOutputStream output = atomic.startWrite();
        try {
            String string = values.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            output.write(bytes);
            atomic.finishWrite(output);
        } catch (Exception e) {
            atomic.failWrite(output);
            throw e;
        }
    }
}
