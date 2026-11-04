package com.blackhub.bronline.neizzir.fragments.custom.manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.blackhub.bronline.neizzir.activities.main.util.CustomResourceStore;
import com.blackhub.bronline.neizzir.activities.main.util.CustomResources;
import com.blackhub.bronline.neizzir.network.DownloadSpec;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.EndpointRouter;
import com.blackhub.bronline.neizzir.network.NetworkResult;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.CloseableKt;
import kotlin.p040io.FilesKt__FileReadWriteKt;
import kotlin.p040io.FilesKt__UtilsKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.p043io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.CompressionMethod;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: FoliageManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 O2\u00020\u0001:\u0005OPQRSB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JR\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018H\u0082@¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u001e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0082@¢\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00020\u000f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010#\u001a\u00020\u0016H\u0002J\u0006\u0010$\u001a\u00020\u0016Jh\u0010%\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u00162$\b\u0002\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00182*\b\u0002\u0010'\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010(H\u0086@¢\u0006\u0002\u0010)J`\u0010*\u001a\u00020&2$\b\u0002\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00182*\b\u0002\u0010'\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010(H\u0086@¢\u0006\u0002\u0010+JF\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020.0-2\u0006\u0010/\u001a\u00020\u000b2\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018H\u0082@¢\u0006\u0002\u00100J\"\u00101\u001a\u00020\u000f2\u0018\u00102\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00110-H\u0002J\u001c\u00104\u001a\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002030-H\u0002J\b\u00106\u001a\u00020\u001cH\u0002J\u0010\u00107\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020<H\u0002Jj\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010>\u001a\u00020\u001c2\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00182(\u0010'\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010(H\u0082@¢\u0006\u0002\u0010?J\u001e\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020B2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H\u0002J@\u0010D\u001a\u00020\u000b2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\t0\b2\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018H\u0082@¢\u0006\u0002\u0010FJ \u0010G\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020\u001c2\u0006\u0010J\u001a\u00020KH\u0002J\u000e\u0010L\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010M\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020<H\u0002R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0006*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006T"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appContext", "kotlin.jvm.PlatformType", "cachedRequiredBaseNames", "", "", "cachedTemplateResolution", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageTemplateResolution;", "prefs", "Landroid/content/SharedPreferences;", "applyStagedEntries", "", "stagedEntries", "", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager$StagedEntry;", "mode", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager$Mode;", "color", "", "onTitle", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Ljava/util/List;Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager$Mode;Ljava/lang/Integer;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "astcZipFile", "Ljava/io/File;", "downloadArchive", "relativePath", "tempPrefix", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureUniqueOutputNames", "uniqueNames", "expectedCount", "getSelectedColor", "installColored", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager$Result;", "onStep", "Lkotlin/Function3;", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installTransparent", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTemplateBytes", "", "", "resolution", "(Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageTemplateResolution;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logDuplicates", "duplicates", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageTemplateCandidate;", "logFallbackAssignments", "fallbackAssignments", "manifestFile", "normalizeColor", "outputBaseNameFor", "header", "Lnet/lingala/zip4j/model/FileHeader;", "readManifest", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager$Manifest;", "readTransparentEntries", "zipFile", "(Ljava/io/File;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeManifestEntries", "zip", "Lnet/lingala/zip4j/ZipFile;", "recordedEntries", "resolveTemplates", "requiredBaseNames", "(Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "restoreFile", "targetFile", "backupFile", "existedBefore", "", "setSelectedColor", "writeManifest", "manifest", "Companion", "Manifest", "Mode", "Result", "StagedEntry", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class FoliageManager {
    private static final String COLORED_ARCHIVE_PATH = "foliage/png/defcolorpng.zip";
    private static final int DEFAULT_COLOR = -1;
    private static final String KEY_SELECTED_COLOR = "foliage_selected_color";
    private static final String MANIFEST_FILE_NAME = "foliage_manifest.json";
    private static final String PREFS_NAME = "custom_prefs";
    private static final String TAG = "FoliageManager";
    private static final String TRANSPARENT_ARCHIVE_PATH = "foliage/1/1.zip";
    private final Context appContext;
    private Set<String> cachedRequiredBaseNames;
    private FoliageTemplateResolution cachedTemplateResolution;
    private final SharedPreferences prefs;

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$applyStagedEntries$1 */
    /* JADX INFO: compiled from: FoliageManager.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager", m4426f = "FoliageManager.kt", m4427i = {0, 0, 0, 0}, m4428l = {TypedValues.CycleType.TYPE_WAVE_OFFSET}, m4429m = "applyStagedEntries", m4430n = {"this", "mode", "color", "entries"}, m4431s = {"L$0", "L$1", "L$2", "L$3"})
    static final class C53331 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C53331(Continuation<? super C53331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FoliageManager.this.applyStagedEntries(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$downloadArchive$1 */
    /* JADX INFO: compiled from: FoliageManager.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager", m4426f = "FoliageManager.kt", m4427i = {0, 0}, m4428l = {TypedValues.PositionType.TYPE_TRANSITION_EASING}, m4429m = "downloadArchive", m4430n = {"relativePath", "tempFile"}, m4431s = {"L$0", "L$1"})
    static final class C53351 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C53351(Continuation<? super C53351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FoliageManager.this.downloadArchive(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$installColored$1 */
    /* JADX INFO: compiled from: FoliageManager.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager", m4426f = "FoliageManager.kt", m4427i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8}, m4428l = {ComposerKt.providerMapsKey, 205, 221, 222, 231, 236, 247, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 251}, m4429m = "installColored", m4430n = {"this", "onTitle", "onStep", "selectedColor", "this", "onTitle", "onStep", "selectedColor", "this", "onTitle", "onStep", "zipFile", "sourceZip", "pngEntries", "requiredBaseNames", "selectedColor", "this", "onTitle", "onStep", "zipFile", "sourceZip", "pngEntries", "selectedColor", "this", "onTitle", "onStep", "zipFile", "sourceZip", "pngEntries", "selectedColor", "this", "onTitle", "onStep", "zipFile", "sourceZip", "templateBytes", "stagedEntries", "header", "selectedColor", "total", FirebaseAnalytics.Param.INDEX, "this", "onTitle", "onStep", "zipFile", "sourceZip", "templateBytes", "stagedEntries", "selectedColor", "total", "onTitle", "zipFile", "stagedEntries", "selectedColor", "zipFile", "stagedEntries", "selectedColor"}, m4431s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$8", "I$0", "I$1", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
    static final class C53361 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        C53361(Continuation<? super C53361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FoliageManager.this.installColored(0, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$installTransparent$1 */
    /* JADX INFO: compiled from: FoliageManager.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager", m4426f = "FoliageManager.kt", m4427i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4}, m4428l = {180, 181, 183, 184, 185}, m4429m = "installTransparent", m4430n = {"this", "onTitle", "onStep", "this", "onTitle", "onStep", "this", "onTitle", "zipFile", "onTitle", "zipFile", "stagedEntries", "zipFile", "stagedEntries"}, m4431s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class C53391 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C53391(Continuation<? super C53391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FoliageManager.this.installTransparent(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$loadTemplateBytes$1 */
    /* JADX INFO: compiled from: FoliageManager.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager", m4426f = "FoliageManager.kt", m4427i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, m4428l = {396}, m4429m = "loadTemplateBytes", m4430n = {"this", "onTitle", "templates", "bytesCache", "archiveZip", "headersByPath", "baseName", "candidate", "done", "total"}, m4431s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$8", "L$9", "I$0", "I$1"})
    static final class C53421 extends ContinuationImpl {
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
        /* synthetic */ Object result;

        C53421(Continuation<? super C53421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FoliageManager.this.loadTemplateBytes(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$readTransparentEntries$1 */
    /* JADX INFO: compiled from: FoliageManager.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager", m4426f = "FoliageManager.kt", m4427i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m4428l = {280, 285}, m4429m = "readTransparentEntries", m4430n = {"this", "onTitle", "onStep", "sourceZip", "headers", "stagedEntries", "header", FirebaseAnalytics.Param.INDEX, "this", "onTitle", "onStep", "sourceZip", "headers", "stagedEntries"}, m4431s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    static final class C53431 extends ContinuationImpl {
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
        int label;
        /* synthetic */ Object result;

        C53431(Continuation<? super C53431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FoliageManager.this.readTransparentEntries(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$resolveTemplates$1 */
    /* JADX INFO: compiled from: FoliageManager.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager", m4426f = "FoliageManager.kt", m4427i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, m4428l = {329}, m4429m = "resolveTemplates", m4430n = {"this", "onTitle", "normalizedRequired", "texturesDir", "archives", "collected", "resolvedNames", "fallbackCandidate", "archive"}, m4431s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9"})
    static final class C53441 extends ContinuationImpl {
        int I$0;
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
        /* synthetic */ Object result;

        C53441(Continuation<? super C53441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FoliageManager.this.resolveTemplates(null, null, this);
        }
    }

    public FoliageManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.appContext = context.getApplicationContext();
        this.prefs = this.appContext.getSharedPreferences(PREFS_NAME, 0);
    }

    /* JADX INFO: compiled from: FoliageManager.kt */
    @Metadata(m4415d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager$Mode;", "", "wireName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getWireName", "()Ljava/lang/String;", "TRANSPARENT", "COLORED", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public enum Mode {
        TRANSPARENT("transparent"),
        COLORED("colored");

        private final String wireName;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        public static EnumEntries<Mode> getEntries() {
            return $ENTRIES;
        }

        Mode(String wireName) {
            this.wireName = wireName;
        }

        public final String getWireName() {
            return this.wireName;
        }
    }

    /* JADX INFO: compiled from: FoliageManager.kt */
    @Metadata(m4415d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager$Result;", "", "appliedCount", "", "mode", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager$Mode;", "color", "(ILcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager$Mode;Ljava/lang/Integer;)V", "getAppliedCount", "()I", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMode", "()Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager$Mode;", "component1", "component2", "component3", "copy", "(ILcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager$Mode;Ljava/lang/Integer;)Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager$Result;", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final /* data */ class Result {
        private final int appliedCount;
        private final Integer color;
        private final Mode mode;

        public static /* synthetic */ Result copy$default(Result result, int i, Mode mode, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = result.appliedCount;
            }
            if ((i2 & 2) != 0) {
                mode = result.mode;
            }
            if ((i2 & 4) != 0) {
                num = result.color;
            }
            return result.copy(i, mode, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getAppliedCount() {
            return this.appliedCount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Mode getMode() {
            return this.mode;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getColor() {
            return this.color;
        }

        public final Result copy(int appliedCount, Mode mode, Integer color) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            return new Result(appliedCount, mode, color);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return this.appliedCount == result.appliedCount && this.mode == result.mode && Intrinsics.areEqual(this.color, result.color);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.appliedCount) * 31) + this.mode.hashCode()) * 31) + (this.color == null ? 0 : this.color.hashCode());
        }

        public String toString() {
            return "Result(appliedCount=" + this.appliedCount + ", mode=" + this.mode + ", color=" + this.color + ')';
        }

        public Result(int appliedCount, Mode mode, Integer color) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.appliedCount = appliedCount;
            this.mode = mode;
            this.color = color;
        }

        public final int getAppliedCount() {
            return this.appliedCount;
        }

        public final Mode getMode() {
            return this.mode;
        }

        public final Integer getColor() {
            return this.color;
        }
    }

    /* JADX INFO: compiled from: FoliageManager.kt */
    @Metadata(m4415d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager$StagedEntry;", "", "entryName", "", "bytes", "", "(Ljava/lang/String;[B)V", "getBytes", "()[B", "getEntryName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final /* data */ class StagedEntry {
        private final byte[] bytes;
        private final String entryName;

        public static /* synthetic */ StagedEntry copy$default(StagedEntry stagedEntry, String str, byte[] bArr, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stagedEntry.entryName;
            }
            if ((i & 2) != 0) {
                bArr = stagedEntry.bytes;
            }
            return stagedEntry.copy(str, bArr);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getEntryName() {
            return this.entryName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final byte[] getBytes() {
            return this.bytes;
        }

        public final StagedEntry copy(String entryName, byte[] bytes) {
            Intrinsics.checkNotNullParameter(entryName, "entryName");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            return new StagedEntry(entryName, bytes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StagedEntry)) {
                return false;
            }
            StagedEntry stagedEntry = (StagedEntry) other;
            return Intrinsics.areEqual(this.entryName, stagedEntry.entryName) && Intrinsics.areEqual(this.bytes, stagedEntry.bytes);
        }

        public int hashCode() {
            return (this.entryName.hashCode() * 31) + Arrays.hashCode(this.bytes);
        }

        public String toString() {
            return "StagedEntry(entryName=" + this.entryName + ", bytes=" + Arrays.toString(this.bytes) + ')';
        }

        public StagedEntry(String entryName, byte[] bytes) {
            Intrinsics.checkNotNullParameter(entryName, "entryName");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            this.entryName = entryName;
            this.bytes = bytes;
        }

        public final String getEntryName() {
            return this.entryName;
        }

        public final byte[] getBytes() {
            return this.bytes;
        }
    }

    /* JADX INFO: compiled from: FoliageManager.kt */
    @Metadata(m4415d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J6\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager$Manifest;", "", "mode", "", "color", "", "entries", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEntries", "()Ljava/util/List;", "getMode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManager$Manifest;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final /* data */ class Manifest {
        private final Integer color;
        private final List<String> entries;
        private final String mode;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Manifest copy$default(Manifest manifest, String str, Integer num, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = manifest.mode;
            }
            if ((i & 2) != 0) {
                num = manifest.color;
            }
            if ((i & 4) != 0) {
                list = manifest.entries;
            }
            return manifest.copy(str, num, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMode() {
            return this.mode;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getColor() {
            return this.color;
        }

        public final List<String> component3() {
            return this.entries;
        }

        public final Manifest copy(String mode, Integer color, List<String> entries) {
            Intrinsics.checkNotNullParameter(entries, "entries");
            return new Manifest(mode, color, entries);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Manifest)) {
                return false;
            }
            Manifest manifest = (Manifest) other;
            return Intrinsics.areEqual(this.mode, manifest.mode) && Intrinsics.areEqual(this.color, manifest.color) && Intrinsics.areEqual(this.entries, manifest.entries);
        }

        public int hashCode() {
            return ((((this.mode == null ? 0 : this.mode.hashCode()) * 31) + (this.color != null ? this.color.hashCode() : 0)) * 31) + this.entries.hashCode();
        }

        public String toString() {
            return "Manifest(mode=" + this.mode + ", color=" + this.color + ", entries=" + this.entries + ')';
        }

        public Manifest(String mode, Integer color, List<String> entries) {
            Intrinsics.checkNotNullParameter(entries, "entries");
            this.mode = mode;
            this.color = color;
            this.entries = entries;
        }

        public final String getMode() {
            return this.mode;
        }

        public final Integer getColor() {
            return this.color;
        }

        public final List<String> getEntries() {
            return this.entries;
        }
    }

    public final int getSelectedColor() {
        if (this.prefs.contains(KEY_SELECTED_COLOR)) {
            return this.prefs.getInt(KEY_SELECTED_COLOR, -1);
        }
        Integer color = readManifest().getColor();
        if (color != null) {
            return color.intValue();
        }
        return -1;
    }

    public final void setSelectedColor(int color) {
        this.prefs.edit().putInt(KEY_SELECTED_COLOR, normalizeColor(color)).apply();
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$installTransparent$2 */
    /* JADX INFO: compiled from: FoliageManager.kt */
    @Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "it", ""}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$installTransparent$2", m4426f = "FoliageManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C53402 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        int label;

        C53402(Continuation<? super C53402> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C53402(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C53402) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object installTransparent$default(FoliageManager foliageManager, Function2 function2, Function3 function3, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function2 = new C53402(null);
        }
        if ((i & 2) != 0) {
            function3 = new C53413(null);
        }
        return foliageManager.installTransparent(function2, function3, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:43:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v18, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v8 */
    public final Object installTransparent(Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function2, Function3<? super Integer, ? super Integer, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Result> continuation) {
        C53391 c53391;
        Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function4;
        ?? r13;
        FoliageManager foliageManager;
        Object objDownloadArchive;
        ?? r14;
        ?? r0;
        File file;
        Object transparentEntries;
        Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function5;
        ?? r15;
        File file2;
        List list;
        Mode mode;
        Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function6;
        List list2;
        File file3;
        String str;
        if (continuation instanceof C53391) {
            c53391 = (C53391) continuation;
            if ((c53391.label & Integer.MIN_VALUE) != 0) {
                c53391.label -= Integer.MIN_VALUE;
            } else {
                c53391 = new C53391(continuation);
            }
        } else {
            c53391 = new C53391(continuation);
        }
        C53391 c53392 = c53391;
        Object obj = c53392.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (c53392.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    FoliageManager foliageManager2 = this;
                    c53392.L$0 = foliageManager2;
                    c53392.L$1 = function2;
                    c53392.L$2 = function3;
                    c53392.label = 1;
                    if (function2.invoke("Скачивание прозрачной листвы...", c53392) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function4 = function2;
                    r13 = function3;
                    foliageManager = foliageManager2;
                    c53392.L$0 = foliageManager;
                    c53392.L$1 = function4;
                    c53392.L$2 = r13;
                    c53392.label = 2;
                    objDownloadArchive = foliageManager.downloadArchive(TRANSPARENT_ARCHIVE_PATH, "foliage_transparent", c53392);
                    r0 = foliageManager;
                    r14 = r13;
                    if (objDownloadArchive == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    file = (File) objDownloadArchive;
                    try {
                        c53392.L$0 = r0;
                        c53392.L$1 = function4;
                        c53392.L$2 = file;
                        c53392.label = 3;
                        transparentEntries = r0.readTransparentEntries(file, function4, r14, c53392);
                        if (transparentEntries == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        function5 = function4;
                        r15 = r0;
                        file2 = file;
                        list = (List) transparentEntries;
                        mode = Mode.TRANSPARENT;
                        c53392.L$0 = function5;
                        c53392.L$1 = file2;
                        c53392.L$2 = list;
                        c53392.label = 4;
                        if (r15.applyStagedEntries(list, mode, null, function5, c53392) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        function6 = function5;
                        list2 = list;
                        file3 = file2;
                        str = "Готово: " + list2.size() + " текстур.";
                        c53392.L$0 = file3;
                        c53392.L$1 = list2;
                        c53392.L$2 = null;
                        c53392.label = 5;
                        function3 = file3;
                        if (function6.invoke(str, c53392) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result result = new Result(list2.size(), Mode.TRANSPARENT, null);
                        function3.delete();
                        return result;
                    } catch (Throwable th) {
                        th = th;
                        function3 = file;
                        function3.delete();
                        throw th;
                    }
                case 1:
                    Function3 function7 = (Function3) c53392.L$2;
                    function4 = (Function2) c53392.L$1;
                    FoliageManager foliageManager3 = (FoliageManager) c53392.L$0;
                    ResultKt.throwOnFailure(obj);
                    foliageManager = foliageManager3;
                    r13 = function7;
                    c53392.L$0 = foliageManager;
                    c53392.L$1 = function4;
                    c53392.L$2 = r13;
                    c53392.label = 2;
                    objDownloadArchive = foliageManager.downloadArchive(TRANSPARENT_ARCHIVE_PATH, "foliage_transparent", c53392);
                    r0 = foliageManager;
                    r14 = r13;
                    if (objDownloadArchive == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    file = (File) objDownloadArchive;
                    c53392.L$0 = r0;
                    c53392.L$1 = function4;
                    c53392.L$2 = file;
                    c53392.label = 3;
                    transparentEntries = r0.readTransparentEntries(file, function4, r14, c53392);
                    if (transparentEntries == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function5 = function4;
                    r15 = r0;
                    file2 = file;
                    list = (List) transparentEntries;
                    mode = Mode.TRANSPARENT;
                    c53392.L$0 = function5;
                    c53392.L$1 = file2;
                    c53392.L$2 = list;
                    c53392.label = 4;
                    if (r15.applyStagedEntries(list, mode, null, function5, c53392) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function6 = function5;
                    list2 = list;
                    file3 = file2;
                    str = "Готово: " + list2.size() + " текстур.";
                    c53392.L$0 = file3;
                    c53392.L$1 = list2;
                    c53392.L$2 = null;
                    c53392.label = 5;
                    function3 = file3;
                    if (function6.invoke(str, c53392) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Result result2 = new Result(list2.size(), Mode.TRANSPARENT, null);
                    function3.delete();
                    return result2;
                case 2:
                    Function3 function8 = (Function3) c53392.L$2;
                    function4 = (Function2) c53392.L$1;
                    FoliageManager foliageManager4 = (FoliageManager) c53392.L$0;
                    ResultKt.throwOnFailure(obj);
                    objDownloadArchive = obj;
                    r0 = foliageManager4;
                    r14 = function8;
                    file = (File) objDownloadArchive;
                    c53392.L$0 = r0;
                    c53392.L$1 = function4;
                    c53392.L$2 = file;
                    c53392.label = 3;
                    transparentEntries = r0.readTransparentEntries(file, function4, r14, c53392);
                    if (transparentEntries == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function5 = function4;
                    r15 = r0;
                    file2 = file;
                    list = (List) transparentEntries;
                    mode = Mode.TRANSPARENT;
                    c53392.L$0 = function5;
                    c53392.L$1 = file2;
                    c53392.L$2 = list;
                    c53392.label = 4;
                    if (r15.applyStagedEntries(list, mode, null, function5, c53392) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function6 = function5;
                    list2 = list;
                    file3 = file2;
                    str = "Готово: " + list2.size() + " текстур.";
                    c53392.L$0 = file3;
                    c53392.L$1 = list2;
                    c53392.L$2 = null;
                    c53392.label = 5;
                    function3 = file3;
                    if (function6.invoke(str, c53392) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Result result3 = new Result(list2.size(), Mode.TRANSPARENT, null);
                    function3.delete();
                    return result3;
                case 3:
                    File file4 = (File) c53392.L$2;
                    Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function9 = (Function2) c53392.L$1;
                    FoliageManager foliageManager5 = (FoliageManager) c53392.L$0;
                    ResultKt.throwOnFailure(obj);
                    function5 = function9;
                    r15 = foliageManager5;
                    transparentEntries = obj;
                    file2 = file4;
                    list = (List) transparentEntries;
                    mode = Mode.TRANSPARENT;
                    c53392.L$0 = function5;
                    c53392.L$1 = file2;
                    c53392.L$2 = list;
                    c53392.label = 4;
                    if (r15.applyStagedEntries(list, mode, null, function5, c53392) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function6 = function5;
                    list2 = list;
                    file3 = file2;
                    str = "Готово: " + list2.size() + " текстур.";
                    c53392.L$0 = file3;
                    c53392.L$1 = list2;
                    c53392.L$2 = null;
                    c53392.label = 5;
                    function3 = file3;
                    if (function6.invoke(str, c53392) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Result result4 = new Result(list2.size(), Mode.TRANSPARENT, null);
                    function3.delete();
                    return result4;
                case 4:
                    list2 = (List) c53392.L$2;
                    File file5 = (File) c53392.L$1;
                    function6 = (Function2) c53392.L$0;
                    ResultKt.throwOnFailure(obj);
                    file3 = file5;
                    str = "Готово: " + list2.size() + " текстур.";
                    c53392.L$0 = file3;
                    c53392.L$1 = list2;
                    c53392.L$2 = null;
                    c53392.label = 5;
                    function3 = file3;
                    if (function6.invoke(str, c53392) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Result result5 = new Result(list2.size(), Mode.TRANSPARENT, null);
                    function3.delete();
                    return result5;
                case 5:
                    list2 = (List) c53392.L$1;
                    File file6 = (File) c53392.L$0;
                    ResultKt.throwOnFailure(obj);
                    function3 = file6;
                    Result result6 = new Result(list2.size(), Mode.TRANSPARENT, null);
                    function3.delete();
                    return result6;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$installTransparent$3 */
    /* JADX INFO: compiled from: FoliageManager.kt */
    @Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$installTransparent$3", m4426f = "FoliageManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C53413 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super Unit>, Object> {
        int label;

        C53413(Continuation<? super C53413> continuation) {
            super(3, continuation);
        }

        public final Object invoke(int i, int i2, Continuation<? super Unit> continuation) {
            return new C53413(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Integer num2, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), num2.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object installColored$default(FoliageManager foliageManager, int i, Function2 function2, Function3 function3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function2 = new C53372(null);
        }
        if ((i2 & 4) != 0) {
            function3 = new C53383(null);
        }
        return foliageManager.installColored(i, function2, function3, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:79:0x02da A[Catch: all -> 0x0499, TRY_LEAVE, TryCatch #9 {all -> 0x0499, blocks: (B:77:0x02d4, B:79:0x02da, B:111:0x0422), top: B:148:0x02d4 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x032a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x032b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0352 A[Catch: all -> 0x0417, TRY_LEAVE, TryCatch #8 {all -> 0x0417, blocks: (B:86:0x034a, B:88:0x0352, B:91:0x0372, B:102:0x03f3, B:103:0x03f6, B:104:0x03f7, B:105:0x0416, B:89:0x035e, B:99:0x03f0), top: B:147:0x034a, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x03de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:95:0x03df  */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x04db: MOVE (r3 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY] A[D('$result' java.lang.Object)]), block:B:128:0x04db */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0129: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY] A[D('zipFile' java.io.File)]), block:B:37:0x0129 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0154: MOVE (r5 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY] A[D('zipFile' java.io.File)]), block:B:42:0x0154 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x03df -> B:148:0x02d4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object installColored(int r22, kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r23, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r24, kotlin.coroutines.Continuation<? super com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager.Result> r25) {
        /*
            Method dump skipped, instruction units count: 1288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager.installColored(int, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$installColored$2 */
    /* JADX INFO: compiled from: FoliageManager.kt */
    @Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "it", ""}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$installColored$2", m4426f = "FoliageManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C53372 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        int label;

        C53372(Continuation<? super C53372> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C53372(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C53372) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$installColored$3 */
    /* JADX INFO: compiled from: FoliageManager.kt */
    @Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$installColored$3", m4426f = "FoliageManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C53383 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super Unit>, Object> {
        int label;

        C53383(Continuation<? super C53383> continuation) {
            super(3, continuation);
        }

        public final Object invoke(int i, int i2, Continuation<? super Unit> continuation) {
            return new C53383(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Integer num2, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), num2.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:21:0x013f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0140  */
    /* JADX WARN: Code duplicated, block: B:29:0x01b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x01b2 -> B:31:0x01c3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object readTransparentEntries(java.io.File r22, kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r23, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r24, kotlin.coroutines.Continuation<? super java.util.List<com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager.StagedEntry>> r25) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager.readTransparentEntries(java.io.File, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0119  */
    /* JADX WARN: Code duplicated, block: B:35:0x0169 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x016a  */
    /* JADX WARN: Code duplicated, block: B:42:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:52:0x0226  */
    /* JADX WARN: Code duplicated, block: B:55:0x025c A[PHI: r18 r19 r25 r27
  0x025c: PHI (r18v1 java.lang.Object) = (r18v0 java.lang.Object), (r18v2 java.lang.Object) binds: [B:54:0x022c, B:51:0x0224] A[DONT_GENERATE, DONT_INLINE]
  0x025c: PHI (r19v1 int) = (r19v0 int), (r19v2 int) binds: [B:54:0x022c, B:51:0x0224] A[DONT_GENERATE, DONT_INLINE]
  0x025c: PHI (r25v2 com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$resolveTemplates$1) = 
  (r25v1 com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$resolveTemplates$1)
  (r25v3 com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$resolveTemplates$1)
 binds: [B:54:0x022c, B:51:0x0224] A[DONT_GENERATE, DONT_INLINE]
  0x025c: PHI (r27v2 '$result' java.lang.Object) = (r27v1 '$result' java.lang.Object), (r27v3 '$result' java.lang.Object) binds: [B:54:0x022c, B:51:0x0224] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v29, types: [T, com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageTemplateCandidate, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x016a -> B:37:0x016e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object resolveTemplates(java.util.Set<java.lang.String> r25, kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r26, kotlin.coroutines.Continuation<? super com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageTemplateResolution> r27) {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager.resolveTemplates(java.util.Set, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x0206  */
    /* JADX WARN: Code duplicated, block: B:42:0x0261 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0262  */
    /* JADX WARN: Code duplicated, block: B:46:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:48:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:59:0x0321  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x01db -> B:38:0x0200). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0262 -> B:44:0x026a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object loadTemplateBytes(com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageTemplateResolution r24, kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r25, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, byte[]>> r26) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager.loadTemplateBytes(com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageTemplateResolution, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object applyStagedEntries(List<StagedEntry> list, Mode mode, Integer color, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws JSONException {
        C53331 c53331;
        final FoliageManager foliageManager;
        Mode mode2;
        final List entries;
        Integer color2;
        if (continuation instanceof C53331) {
            C53331 c53332 = (C53331) continuation;
            if ((c53332.label & Integer.MIN_VALUE) != 0) {
                c53332.label -= Integer.MIN_VALUE;
                c53331 = c53332;
            } else {
                c53331 = new C53331(continuation);
            }
        } else {
            c53331 = new C53331(continuation);
        }
        Object $result = c53331.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c53331.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                foliageManager = this;
                mode2 = mode;
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("Нет текстур листвы для установки".toString());
                }
                List<StagedEntry> $this$map$iv = list;
                Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
                for (Object item$iv$iv : $this$map$iv) {
                    StagedEntry it = (StagedEntry) item$iv$iv;
                    destination$iv$iv.add(StagedEntry.copy$default(it, FoliageManagerKt.normalizeZipEntryName(it.getEntryName()), null, 2, null));
                    $result = $result;
                }
                List entries2 = (List) destination$iv$iv;
                List $this$map$iv2 = entries2;
                Collection destination$iv$iv2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv2, 10));
                for (Object item$iv$iv2 : $this$map$iv2) {
                    String entryName = ((StagedEntry) item$iv$iv2).getEntryName();
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = entryName.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    destination$iv$iv2.add(lowerCase);
                }
                foliageManager.ensureUniqueOutputNames(CollectionsKt___CollectionsKt.toSet((List) destination$iv$iv2), entries2.size());
                c53331.L$0 = foliageManager;
                c53331.L$1 = mode2;
                c53331.L$2 = color;
                c53331.L$3 = entries2;
                c53331.label = 1;
                if (function2.invoke("Сохранение текстур листвы...", c53331) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                entries = entries2;
                color2 = color;
                break;
                break;
            case 1:
                entries = (List) c53331.L$3;
                color2 = (Integer) c53331.L$2;
                mode2 = (Mode) c53331.L$1;
                foliageManager = (FoliageManager) c53331.L$0;
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CustomResources customResources = CustomResources.INSTANCE;
        Context appContext = foliageManager.appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        customResources.edit(appContext, new Function1<File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager.applyStagedEntries.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(File file) throws JSONException, IOException {
                invoke2(file);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(File stage) throws JSONException, IOException {
                Throwable th;
                Iterator it2;
                Iterable $this$forEach$iv;
                File archive;
                int $i$f$forEach;
                int i;
                Intrinsics.checkNotNullParameter(stage, "stage");
                File archive2 = new File(stage, CustomResourceStore.TEXTURES);
                File manifest = new File(stage, ".foliage.json");
                File parentFile = archive2.getParentFile();
                Intrinsics.checkNotNull(parentFile);
                parentFile.mkdirs();
                ZipFile zipFile = new ZipFile(archive2);
                FoliageManager foliageManager2 = foliageManager;
                Iterable iterable = entries;
                try {
                    ZipFile zip = zipFile;
                    int i2 = 0;
                    if (archive2.exists()) {
                        try {
                            if (manifest.isFile()) {
                                JSONArray previous = new JSONObject(FilesKt__FileReadWriteKt.readText$default(manifest, null, 1, null)).getJSONArray("entries");
                                Iterable $this$map$iv3 = RangesKt___RangesKt.until(0, previous.length());
                                Collection destination$iv$iv3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv3, 10));
                                Iterator<Integer> it3 = $this$map$iv3.iterator();
                                while (it3.hasNext()) {
                                    int item$iv$iv3 = ((IntIterator) it3).nextInt();
                                    destination$iv$iv3.add(previous.getString(item$iv$iv3));
                                }
                                foliageManager2.removeManifestEntries(zip, (List) destination$iv$iv3);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                CloseableKt.closeFinally(zipFile, th);
                                throw th3;
                            }
                        }
                    }
                    Iterable $this$forEach$iv2 = iterable;
                    int $i$f$forEach2 = 0;
                    Iterator it4 = $this$forEach$iv2.iterator();
                    while (it4.hasNext()) {
                        Object element$iv = it4.next();
                        StagedEntry entry = (StagedEntry) element$iv;
                        if (archive2.exists()) {
                            Iterable fileHeaders = zip.getFileHeaders();
                            Intrinsics.checkNotNullExpressionValue(fileHeaders, "getFileHeaders(...)");
                            Iterable $this$filter$iv = fileHeaders;
                            Collection destination$iv$iv4 = new ArrayList();
                            for (Object element$iv$iv : $this$filter$iv) {
                                Iterator it5 = it4;
                                FileHeader it6 = (FileHeader) element$iv$iv;
                                Iterable $this$forEach$iv3 = $this$forEach$iv2;
                                String fileName = it6.getFileName();
                                File archive3 = archive2;
                                try {
                                    Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                                    int $i$f$forEach3 = $i$f$forEach2;
                                    int i3 = i2;
                                    Object element$iv2 = element$iv;
                                    if (StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.substringAfterLast$default(fileName, FileSystemKt.UnixPathSeparator, (String) null, 2, (Object) null), StringsKt__StringsKt.substringAfterLast$default(entry.getEntryName(), FileSystemKt.UnixPathSeparator, (String) null, 2, (Object) null), true)) {
                                        destination$iv$iv4.add(element$iv$iv);
                                    }
                                    it4 = it5;
                                    $this$forEach$iv2 = $this$forEach$iv3;
                                    archive2 = archive3;
                                    $i$f$forEach2 = $i$f$forEach3;
                                    i2 = i3;
                                    element$iv = element$iv2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    throw th;
                                }
                            }
                            it2 = it4;
                            $this$forEach$iv = $this$forEach$iv2;
                            archive = archive2;
                            $i$f$forEach = $i$f$forEach2;
                            i = i2;
                            for (FileHeader it7 : (List) destination$iv$iv4) {
                                zip.removeFile(it7);
                            }
                        } else {
                            it2 = it4;
                            $this$forEach$iv = $this$forEach$iv2;
                            archive = archive2;
                            $i$f$forEach = $i$f$forEach2;
                            i = i2;
                        }
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(entry.getBytes());
                        try {
                            ByteArrayInputStream it8 = byteArrayInputStream;
                            ByteArrayInputStream byteArrayInputStream2 = it8;
                            ZipParameters $this$invoke_u24lambda_u246_u24lambda_u245_u24lambda_u244_u24lambda_u243 = new ZipParameters();
                            String entryName2 = entry.getEntryName();
                            Locale US2 = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(US2, "US");
                            String lowerCase2 = entryName2.toLowerCase(US2);
                            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                            $this$invoke_u24lambda_u246_u24lambda_u245_u24lambda_u244_u24lambda_u243.setFileNameInZip(lowerCase2);
                            $this$invoke_u24lambda_u246_u24lambda_u245_u24lambda_u244_u24lambda_u243.setCompressionMethod(CompressionMethod.STORE);
                            Unit unit = Unit.INSTANCE;
                            zip.addStream(byteArrayInputStream2, $this$invoke_u24lambda_u246_u24lambda_u245_u24lambda_u244_u24lambda_u243);
                            Unit unit2 = Unit.INSTANCE;
                            CloseableKt.closeFinally(byteArrayInputStream, null);
                            it4 = it2;
                            $this$forEach$iv2 = $this$forEach$iv;
                            archive2 = archive;
                            $i$f$forEach2 = $i$f$forEach;
                            i2 = i;
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                CloseableKt.closeFinally(byteArrayInputStream, th5);
                                throw th6;
                            }
                        }
                    }
                    Unit unit3 = Unit.INSTANCE;
                    CloseableKt.closeFinally(zipFile, null);
                    CustomResourceStore.Companion companion = CustomResourceStore.INSTANCE;
                    JSONObject jSONObject = new JSONObject();
                    Iterable $this$map$iv4 = entries;
                    Collection destination$iv$iv5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv4, 10));
                    for (Object item$iv$iv4 : $this$map$iv4) {
                        StagedEntry it9 = (StagedEntry) item$iv$iv4;
                        destination$iv$iv5.add(it9.getEntryName());
                    }
                    JSONObject jSONObjectPut = jSONObject.put("entries", new JSONArray(destination$iv$iv5));
                    Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
                    companion.write(manifest, jSONObjectPut);
                } catch (Throwable th7) {
                    th = th7;
                }
            }
        });
        String wireName = mode2.getWireName();
        Iterable $this$map$iv3 = entries;
        Collection destination$iv$iv3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv3, 10));
        for (Object item$iv$iv3 : $this$map$iv3) {
            destination$iv$iv3.add(((StagedEntry) item$iv$iv3).getEntryName());
        }
        foliageManager.writeManifest(new Manifest(wireName, color2, (List) destination$iv$iv3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeManifestEntries(ZipFile zip, List<String> recordedEntries) throws ZipException {
        if (recordedEntries.isEmpty()) {
            return;
        }
        Iterable fileHeaders = zip.getFileHeaders();
        Intrinsics.checkNotNullExpressionValue(fileHeaders, "getFileHeaders(...)");
        Iterable $this$filter$iv = fileHeaders;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            FileHeader it = (FileHeader) element$iv$iv;
            if (!it.isDirectory()) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        List headers = (List) destination$iv$iv;
        List $this$map$iv = headers;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            FileHeader it2 = (FileHeader) item$iv$iv;
            String fileName = it2.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
            destination$iv$iv2.add(FoliageManagerKt.normalizeZipEntryName(fileName));
        }
        List actualNames = (List) destination$iv$iv2;
        List<String> listEntriesToRemove = FoliageManifestCleanup.INSTANCE.entriesToRemove(recordedEntries, actualNames);
        if (listEntriesToRemove.isEmpty()) {
            return;
        }
        List $this$associateBy$iv = headers;
        int capacity$iv = RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$associateBy$iv, 10)), 16);
        Map destination$iv$iv3 = new LinkedHashMap(capacity$iv);
        for (Object element$iv$iv2 : $this$associateBy$iv) {
            FileHeader it3 = (FileHeader) element$iv$iv2;
            List headers2 = headers;
            String fileName2 = it3.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName2, "getFileName(...)");
            String strNormalizeZipEntryName = FoliageManagerKt.normalizeZipEntryName(fileName2);
            List actualNames2 = actualNames;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strNormalizeZipEntryName.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            destination$iv$iv3.put(lowerCase, element$iv$iv2);
            headers = headers2;
            actualNames = actualNames2;
        }
        List<String> $this$forEach$iv = listEntriesToRemove;
        for (Object element$iv : $this$forEach$iv) {
            String entryName = (String) element$iv;
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            Object lowerCase2 = entryName.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            FileHeader p0 = (FileHeader) destination$iv$iv3.get(lowerCase2);
            if (p0 != null) {
                zip.removeFile(p0);
            }
        }
    }

    private final void writeManifest(Manifest manifest) throws JSONException {
        JSONObject json = new JSONObject();
        Object mode = manifest.getMode();
        if (mode == null) {
            mode = JSONObject.NULL;
        }
        json.put("mode", mode);
        Object color = manifest.getColor();
        if (color == null) {
            color = JSONObject.NULL;
        }
        json.put("color", color);
        JSONArray $this$writeManifest_u24lambda_u2428_u24lambda_u2427 = new JSONArray();
        Iterable $this$forEach$iv = manifest.getEntries();
        for (Object element$iv : $this$forEach$iv) {
            $this$writeManifest_u24lambda_u2428_u24lambda_u2427.put(element$iv);
        }
        Unit unit = Unit.INSTANCE;
        json.put("entries", $this$writeManifest_u24lambda_u2428_u24lambda_u2427);
        File fileManifestFile = manifestFile();
        String string = json.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        FilesKt__FileReadWriteKt.writeText$default(fileManifestFile, string, null, 2, null);
    }

    private final Manifest readManifest() {
        Object objM15551constructorimpl;
        File file = manifestFile();
        if (!file.exists()) {
            return new Manifest(null, null, CollectionsKt__CollectionsKt.emptyList());
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            FoliageManager foliageManager = this;
            JSONObject json = new JSONObject(FilesKt__FileReadWriteKt.readText$default(file, null, 1, null));
            JSONArray entriesArray = json.optJSONArray("entries");
            if (entriesArray == null) {
                entriesArray = new JSONArray();
            } else {
                Intrinsics.checkNotNull(entriesArray);
            }
            ArrayList entries = new ArrayList(entriesArray.length());
            int length = entriesArray.length();
            for (int index = 0; index < length; index++) {
                String value = entriesArray.optString(index);
                Intrinsics.checkNotNull(value);
                if (!StringsKt__StringsKt.isBlank(value)) {
                    entries.add(FoliageManagerKt.normalizeZipEntryName(value));
                }
            }
            String strOptString = json.optString("mode");
            if (StringsKt__StringsKt.isBlank(strOptString)) {
                strOptString = null;
            }
            objM15551constructorimpl = kotlin.Result.m15551constructorimpl(new Manifest(strOptString, (!json.has("color") || json.isNull("color")) ? null : Integer.valueOf(json.optInt("color")), entries));
        } catch (Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM15551constructorimpl = kotlin.Result.m15551constructorimpl(ResultKt.createFailure(th));
        }
        Throwable error = kotlin.Result.m15554exceptionOrNullimpl(objM15551constructorimpl);
        if (error != null) {
            Log.w(TAG, "Не удалось прочитать foliage manifest: " + error.getMessage());
            objM15551constructorimpl = new Manifest(null, null, CollectionsKt__CollectionsKt.emptyList());
        }
        return (Manifest) objM15551constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object downloadArchive(String relativePath, String tempPrefix, Continuation<? super File> continuation) throws IOException {
        C53351 c53351;
        File tempFile;
        Object objDownload$default;
        String relativePath2;
        if (continuation instanceof C53351) {
            C53351 c53352 = (C53351) continuation;
            if ((c53352.label & Integer.MIN_VALUE) != 0) {
                c53352.label -= Integer.MIN_VALUE;
                c53351 = c53352;
            } else {
                c53351 = new C53351(continuation);
            }
        } else {
            c53351 = new C53351(continuation);
        }
        Object $result = c53351.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c53351.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                File it = File.createTempFile(tempPrefix, ".zip", this.appContext.getCacheDir());
                it.delete();
                EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                String str = "/Custom/" + StringsKt__StringsKt.trimStart(relativePath, FileSystemKt.UnixPathSeparator);
                Intrinsics.checkNotNull(it);
                tempFile = it;
                DownloadSpec downloadSpec = new DownloadSpec(tempFile, null, null, false, null, 30, null);
                c53351.L$0 = relativePath;
                c53351.L$1 = it;
                c53351.label = 1;
                objDownload$default = EndpointRouter.download$default(router, endpointGroup, str, downloadSpec, null, c53351, 8, null);
                if (objDownload$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                relativePath2 = relativePath;
                break;
                break;
            case 1:
                File tempFile2 = (File) c53351.L$1;
                relativePath2 = (String) c53351.L$0;
                ResultKt.throwOnFailure($result);
                tempFile = tempFile2;
                objDownload$default = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        NetworkResult result = (NetworkResult) objDownload$default;
        if (result instanceof NetworkResult.Success) {
            Intrinsics.checkNotNull(tempFile);
            return tempFile;
        }
        String str2 = "Не удалось скачать " + relativePath2;
        Intrinsics.checkNotNull(result, "null cannot be cast to non-null type com.blackhub.bronline.neizzir.network.NetworkResult.Failure");
        throw new IllegalStateException(str2, ((NetworkResult.Failure) result).getCause());
    }

    private final String outputBaseNameFor(FileHeader header) {
        String fileName = header.getFileName();
        Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
        return FoliageManagerKt.foliageBaseName(fileName);
    }

    private final void ensureUniqueOutputNames(Set<String> uniqueNames, int expectedCount) {
        if (uniqueNames.size() != expectedCount) {
            throw new IllegalStateException("Найдены дублирующиеся имена текстур листвы.");
        }
    }

    private final void logDuplicates(Map<String, ? extends List<FoliageTemplateCandidate>> duplicates) {
        for (Map.Entry<String, ? extends List<FoliageTemplateCandidate>> entry : duplicates.entrySet()) {
            String baseName = entry.getKey();
            String summary = CollectionsKt___CollectionsKt.joinToString$default(entry.getValue(), null, null, null, 4, "...", new Function1<FoliageTemplateCandidate, CharSequence>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageManager$logDuplicates$1$summary$1
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(FoliageTemplateCandidate it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getArchivePath() + AbstractJsonLexerKt.COLON + it.getEntryPath();
                }
            }, 7, null);
            Log.w(TAG, "Найдены дубли foliage template для " + baseName + " -> " + summary);
        }
    }

    private final void logFallbackAssignments(Map<String, FoliageTemplateCandidate> fallbackAssignments) {
        for (Map.Entry<String, FoliageTemplateCandidate> entry : fallbackAssignments.entrySet()) {
            String baseName = entry.getKey();
            FoliageTemplateCandidate candidate = entry.getValue();
            Log.w(TAG, "Точный foliage template для " + baseName + " не найден, использую запасной " + candidate.getArchivePath() + AbstractJsonLexerKt.COLON + candidate.getEntryPath());
        }
    }

    private final void restoreFile(File targetFile, File backupFile, boolean existedBefore) {
        if (existedBefore && backupFile.exists()) {
            FilesKt__UtilsKt.copyTo$default(backupFile, targetFile, true, 0, 4, null);
        } else if (!existedBefore && targetFile.exists()) {
            targetFile.delete();
        }
    }

    private final int normalizeColor(int color) {
        return (-16777216) | color;
    }

    private final File astcZipFile() {
        return new File(this.appContext.getExternalFilesDir("NEIZZIR"), "NEIZZIR.astc.zip");
    }

    private final File manifestFile() {
        return new File(this.appContext.getExternalFilesDir("NEIZZIR"), MANIFEST_FILE_NAME);
    }
}
