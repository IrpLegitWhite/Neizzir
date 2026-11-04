package com.blackhub.bronline.neizzir.fragments.custom.btx;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.widget.Toast;
import androidx.documentfile.provider.DocumentFile;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.MimeTypes;
import com.blackhub.bronline.game.core.constants.FileFormats;
import com.blackhub.bronline.neizzir.converter.BtxPngConverter;
import com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper;
import com.helpshift.HelpshiftEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.CloseableKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.p043io.files.FileSystemKt;

/* JADX INFO: compiled from: BtxConverter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 N2\u00020\u0001:\u0004MNOPB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J,\u0010 \u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020#0%H\u0002J\u001e\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u001aH\u0002J8\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020)2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020#0%2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020#0%H\u0002J\b\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0015H\u0002J\u000e\u00101\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u0015J\u0012\u00103\u001a\u0004\u0018\u00010\u00152\u0006\u00104\u001a\u00020\nH\u0002J\u0006\u00105\u001a\u00020\u0015J\u0006\u00106\u001a\u00020\u0015J\n\u00107\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u00108\u001a\u0002092\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010:\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010;\u001a\u00020\u00182\b\u00104\u001a\u0004\u0018\u00010\nJ\u0010\u0010<\u001a\u00020\u00182\b\u00104\u001a\u0004\u0018\u00010\nJ\u000e\u0010=\u001a\u00020>2\u0006\u00102\u001a\u00020\u0015J\u0010\u0010?\u001a\u00020#2\u0006\u0010+\u001a\u00020)H\u0002J\u0018\u0010@\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u00152\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010C\u001a\u00020\u00182\u0006\u00104\u001a\u00020\nH\u0002J \u0010D\u001a\u00020\u00182\u0006\u0010E\u001a\u00020B2\u0006\u0010F\u001a\u00020B2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J&\u0010G\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0006\u0010H\u001a\u00020\u0015J\u0018\u0010I\u001a\u00020\u00182\u0006\u0010J\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0002J,\u0010K\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0015H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Q"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter;", "", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "ctx", "Landroid/content/Context;", "getCtx", "()Landroid/content/Context;", "outputTreeUri", "Landroid/net/Uri;", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "progressDialog", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/LauncherDialogHelper$ProgressHandle;", "baseNameKey", "", "name", "clearOutputFolderOverride", "", "collectConvertibleFiles", "", "Landroidx/documentfile/provider/DocumentFile;", "root", "collectUris", "data", "Landroid/content/Intent;", "convertByName", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter$ConvertedData;", "bytes", "", "templatesByBase", "", "convertInputs", "title", "inputs", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter$InputRef;", "convertSingle", "ref", "cache", "ensureDefaultOutputDir", "Ljava/io/File;", "ensureWritableTreePath", "relativePath", "getArchiveExportHint", "archiveName", "getDisplayName", "uri", "getOutputTargetHint", "getOutputTargetSummary", "getOutputTreeRoot", "isConvertibleName", "", "onFilesChosen", "onInputFolderChosen", "onOutputFolderChosen", "prepareArchiveExportTarget", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter$ArchiveExportTarget;", "readInputBytes", "showProgressDialog", "totalFiles", "", "takePersistableTreePermission", "updateProgress", "done", "total", "writeArchiveExport", "mimeType", "writeOutput", HelpshiftEvent.DATA_FILE_NAME, "writeRelativeToTree", "explicitMime", "ArchiveExportTarget", "Companion", "ConvertedData", "InputRef", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class BtxConverter {
    private static final String KEY_OUTPUT_TREE_URI = "output_tree_uri";
    private static final String PREFS_NAME = "btx_converter_prefs";
    private final Fragment fragment;
    private Uri outputTreeUri;

    /* JADX INFO: renamed from: prefs$delegate, reason: from kotlin metadata */
    private final Lazy prefs;
    private LauncherDialogHelper.ProgressHandle progressDialog;

    public BtxConverter(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
        this.prefs = LazyKt__LazyJVMKt.lazy(new Function0<SharedPreferences>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter$prefs$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SharedPreferences invoke() {
                return this.this$0.getCtx().getSharedPreferences("btx_converter_prefs", 0);
            }
        });
        String p0 = getPrefs().getString(KEY_OUTPUT_TREE_URI, null);
        this.outputTreeUri = p0 != null ? Uri.parse(p0) : null;
    }

    /* JADX INFO: compiled from: BtxConverter.kt */
    @Metadata(m4415d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter$ArchiveExportTarget;", "", "()V", "FileSystem", "ScopedStorage", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter$ArchiveExportTarget$FileSystem;", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter$ArchiveExportTarget$ScopedStorage;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static abstract class ArchiveExportTarget {
        public /* synthetic */ ArchiveExportTarget(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: compiled from: BtxConverter.kt */
        @Metadata(m4415d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter$ArchiveExportTarget$FileSystem;", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter$ArchiveExportTarget;", "directory", "Ljava/io/File;", "(Ljava/io/File;)V", "getDirectory", "()Ljava/io/File;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
        public static final /* data */ class FileSystem extends ArchiveExportTarget {
            private final File directory;

            public static /* synthetic */ FileSystem copy$default(FileSystem fileSystem, File file, int i, Object obj) {
                if ((i & 1) != 0) {
                    file = fileSystem.directory;
                }
                return fileSystem.copy(file);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final File getDirectory() {
                return this.directory;
            }

            public final FileSystem copy(File directory) {
                Intrinsics.checkNotNullParameter(directory, "directory");
                return new FileSystem(directory);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FileSystem) && Intrinsics.areEqual(this.directory, ((FileSystem) other).directory);
            }

            public int hashCode() {
                return this.directory.hashCode();
            }

            public String toString() {
                return "FileSystem(directory=" + this.directory + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FileSystem(File directory) {
                super(null);
                Intrinsics.checkNotNullParameter(directory, "directory");
                this.directory = directory;
            }

            public final File getDirectory() {
                return this.directory;
            }
        }

        private ArchiveExportTarget() {
        }

        /* JADX INFO: compiled from: BtxConverter.kt */
        @Metadata(m4415d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter$ArchiveExportTarget$ScopedStorage;", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter$ArchiveExportTarget;", "root", "Landroidx/documentfile/provider/DocumentFile;", "(Landroidx/documentfile/provider/DocumentFile;)V", "getRoot", "()Landroidx/documentfile/provider/DocumentFile;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
        public static final /* data */ class ScopedStorage extends ArchiveExportTarget {
            private final DocumentFile root;

            public static /* synthetic */ ScopedStorage copy$default(ScopedStorage scopedStorage, DocumentFile documentFile, int i, Object obj) {
                if ((i & 1) != 0) {
                    documentFile = scopedStorage.root;
                }
                return scopedStorage.copy(documentFile);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DocumentFile getRoot() {
                return this.root;
            }

            public final ScopedStorage copy(DocumentFile root) {
                Intrinsics.checkNotNullParameter(root, "root");
                return new ScopedStorage(root);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ScopedStorage) && Intrinsics.areEqual(this.root, ((ScopedStorage) other).root);
            }

            public int hashCode() {
                return this.root.hashCode();
            }

            public String toString() {
                return "ScopedStorage(root=" + this.root + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ScopedStorage(DocumentFile root) {
                super(null);
                Intrinsics.checkNotNullParameter(root, "root");
                this.root = root;
            }

            public final DocumentFile getRoot() {
                return this.root;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getCtx() {
        Context contextRequireContext = this.fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return contextRequireContext;
    }

    private final SharedPreferences getPrefs() {
        return (SharedPreferences) this.prefs.getValue();
    }

    public final String getOutputTargetSummary() {
        return StringsKt__StringsKt.substringAfter(getOutputTargetHint(), ": ", "files/BTX");
    }

    public final String getOutputTargetHint() {
        DocumentFile root = getOutputTreeRoot();
        if (root != null) {
            StringBuilder sbAppend = new StringBuilder().append("Папка сохранения: ");
            String name = root.getName();
            if (name == null) {
                name = "выбранная папка";
            }
            return sbAppend.append(name).toString();
        }
        return "Папка сохранения: files/BTX";
    }

    public final void clearOutputFolderOverride() {
        this.outputTreeUri = null;
        getPrefs().edit().remove(KEY_OUTPUT_TREE_URI).apply();
        Toast.makeText(getCtx(), "Папка сохранения сброшена: files/BTX", 0).show();
    }

    public final void onOutputFolderChosen(Uri uri) {
        if (uri == null) {
            return;
        }
        takePersistableTreePermission(uri);
        DocumentFile root = DocumentFile.fromTreeUri(getCtx(), uri);
        if (root == null || !root.exists() || !root.canWrite()) {
            Toast.makeText(getCtx(), "Не удалось выбрать папку сохранения", 0).show();
            return;
        }
        this.outputTreeUri = uri;
        getPrefs().edit().putString(KEY_OUTPUT_TREE_URI, uri.toString()).apply();
        Context ctx = getCtx();
        StringBuilder sbAppend = new StringBuilder().append("Папка сохранения выбрана: ");
        String name = root.getName();
        if (name == null) {
            name = "папка";
        }
        Toast.makeText(ctx, sbAppend.append(name).toString(), 0).show();
    }

    public final void onFilesChosen(Intent data) {
        List<Uri> listCollectUris = collectUris(data);
        if (listCollectUris.isEmpty()) {
            Toast.makeText(getCtx(), "Нет PNG/BTX файлов", 0).show();
            return;
        }
        List<Uri> $this$mapNotNull$iv = listCollectUris;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            Uri uri = (Uri) element$iv$iv$iv;
            String name = getDisplayName(uri);
            InputRef.UriInput uriInput = (name != null && isConvertibleName(name)) ? new InputRef.UriInput(uri, name) : null;
            if (uriInput != null) {
                destination$iv$iv.add(uriInput);
            }
            listCollectUris = listCollectUris;
        }
        List refs = (List) destination$iv$iv;
        if (refs.isEmpty()) {
            Toast.makeText(getCtx(), "Нет PNG/BTX файлов", 0).show();
        } else {
            convertInputs("Локальная конвертация", refs);
        }
    }

    public final void onInputFolderChosen(Uri uri) {
        InputRef.DocumentInput documentInput;
        if (uri == null) {
            return;
        }
        takePersistableTreePermission(uri);
        DocumentFile root = DocumentFile.fromTreeUri(getCtx(), uri);
        if (root == null || !root.exists() || !root.isDirectory() || !root.canRead()) {
            Toast.makeText(getCtx(), "Не удалось открыть папку", 0).show();
            return;
        }
        List<DocumentFile> listCollectConvertibleFiles = collectConvertibleFiles(root);
        if (listCollectConvertibleFiles.isEmpty()) {
            Toast.makeText(getCtx(), "В папке нет PNG/BTX файлов", 0).show();
            return;
        }
        List<DocumentFile> $this$mapNotNull$iv = listCollectConvertibleFiles;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            DocumentFile doc = (DocumentFile) element$iv$iv$iv;
            String name = doc.getName();
            if (name == null) {
                documentInput = null;
            } else {
                Intrinsics.checkNotNull(name);
                documentInput = new InputRef.DocumentInput(doc, name);
            }
            if (documentInput != null) {
                destination$iv$iv.add(documentInput);
            }
            root = root;
        }
        List refs = (List) destination$iv$iv;
        convertInputs("Локальная конвертация папки", refs);
    }

    public final ArchiveExportTarget prepareArchiveExportTarget(String archiveName) {
        Intrinsics.checkNotNullParameter(archiveName, "archiveName");
        DocumentFile treeRoot = getOutputTreeRoot();
        if (treeRoot != null) {
            ensureWritableTreePath(treeRoot, "exports/" + archiveName);
            return new ArchiveExportTarget.ScopedStorage(treeRoot);
        }
        File rootDir = ensureDefaultOutputDir();
        File archiveDir = new File(rootDir, "exports" + File.separator + archiveName);
        if (!archiveDir.exists() && !archiveDir.mkdirs()) {
            throw new IllegalStateException("Не удалось создать папку экспорта: " + archiveDir.getAbsolutePath());
        }
        if (!archiveDir.isDirectory() || !archiveDir.canWrite()) {
            throw new IllegalStateException("Нет доступа к папке экспорта: " + archiveDir.getAbsolutePath());
        }
        return new ArchiveExportTarget.FileSystem(archiveDir);
    }

    public final void writeArchiveExport(String archiveName, String relativePath, byte[] bytes, String mimeType) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(archiveName, "archiveName");
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        String normalizedPath = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsKt.trimStart(relativePath, FileSystemKt.UnixPathSeparator), '\\', FileSystemKt.UnixPathSeparator, false, 4, (Object) null);
        ArchiveExportTarget target = prepareArchiveExportTarget(archiveName);
        if (target instanceof ArchiveExportTarget.FileSystem) {
            File outFile = new File(((ArchiveExportTarget.FileSystem) target).getDirectory(), StringsKt__StringsJVMKt.replace$default(normalizedPath, FileSystemKt.UnixPathSeparator, File.separatorChar, false, 4, (Object) null));
            File parent = outFile.getParentFile();
            if (parent != null && !parent.exists() && !parent.mkdirs()) {
                throw new IllegalStateException("Не удалось создать папку: " + parent.getAbsolutePath());
            }
            FileOutputStream fileOutputStream = new FileOutputStream(outFile);
            try {
                FileOutputStream it = fileOutputStream;
                it.write(bytes);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileOutputStream, th);
                    throw th2;
                }
            }
        }
        if (target instanceof ArchiveExportTarget.ScopedStorage) {
            writeRelativeToTree(((ArchiveExportTarget.ScopedStorage) target).getRoot(), "exports/" + archiveName + FileSystemKt.UnixPathSeparator + normalizedPath, bytes, mimeType);
        }
    }

    public final String getArchiveExportHint(String archiveName) {
        Intrinsics.checkNotNullParameter(archiveName, "archiveName");
        DocumentFile root = getOutputTreeRoot();
        String suffix = "exports/" + archiveName;
        if (root != null) {
            StringBuilder sb = new StringBuilder();
            String name = root.getName();
            if (name == null) {
                name = "выбранная папка";
            }
            return sb.append(name).append(FileSystemKt.UnixPathSeparator).append(suffix).toString();
        }
        return "files/BTX/" + suffix;
    }

    private final void convertInputs(String title, List<? extends InputRef> inputs) {
        showProgressDialog(title, inputs.size());
        LifecycleOwner viewLifecycleOwner = this.fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C53181(inputs, this, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter$convertInputs$1 */
    /* JADX INFO: compiled from: BtxConverter.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter$convertInputs$1", m4426f = "BtxConverter.kt", m4427i = {0, 0, 0, 1, 1, 1, 1, 1, 1}, m4428l = {182, 197}, m4429m = "invokeSuspend", m4430n = {"inputBytesCache", "templatesByBase", "ref", "inputBytesCache", "templatesByBase", "failed", "ref", "done", "success"}, m4431s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$2", "L$4", "I$0", "I$1"})
    static final class C53181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<InputRef> $inputs;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ BtxConverter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C53181(List<? extends InputRef> list, BtxConverter btxConverter, Continuation<? super C53181> continuation) {
            super(2, continuation);
            this.$inputs = list;
            this.this$0 = btxConverter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C53181(this.$inputs, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0081  */
        /* JADX WARN: Code duplicated, block: B:13:0x00a9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:17:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:19:0x00e4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00aa -> B:15:0x00b3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0159 -> B:28:0x015e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 604
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter.C53181.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void convertSingle(InputRef ref, Map<InputRef, byte[]> cache, Map<String, byte[]> templatesByBase) throws Throwable {
        byte[] inputBytes = cache.get(ref);
        if (inputBytes == null) {
            inputBytes = readInputBytes(ref);
        }
        ConvertedData converted = convertByName(ref.getDisplayName(), inputBytes, templatesByBase);
        writeOutput(converted.getOutputName(), converted.getOutputBytes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r5 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r5 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] readInputBytes(com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter.InputRef r7) throws java.io.FileNotFoundException {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter.InputRef.UriInput
            r1 = 0
            java.lang.String r2 = "Не удалось прочитать "
            if (r0 == 0) goto L50
            android.content.Context r0 = r6.getCtx()
            android.content.ContentResolver r0 = r0.getContentResolver()
            r3 = r7
            com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter$InputRef$UriInput r3 = (com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter.InputRef.UriInput) r3
            android.net.Uri r3 = r3.getUri()
            java.io.InputStream r0 = r0.openInputStream(r3)
            if (r0 == 0) goto L35
            java.io.Closeable r0 = (java.io.Closeable) r0
            r3 = r0
            java.io.InputStream r3 = (java.io.InputStream) r3     // Catch: java.lang.Throwable -> L2e
            r4 = 0
            byte[] r5 = kotlin.p040io.ByteStreamsKt.readBytes(r3)     // Catch: java.lang.Throwable -> L2e
            kotlin.p040io.CloseableKt.closeFinally(r0, r1)
            if (r5 == 0) goto L35
            goto L7c
        L2e:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L30
        L30:
            r2 = move-exception
            kotlin.p040io.CloseableKt.closeFinally(r0, r1)
            throw r2
        L35:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r7.getDisplayName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L50:
            boolean r0 = r7 instanceof com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter.InputRef.DocumentInput
            if (r0 == 0) goto L9f
            android.content.Context r0 = r6.getCtx()
            android.content.ContentResolver r0 = r0.getContentResolver()
            r3 = r7
            com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter$InputRef$DocumentInput r3 = (com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter.InputRef.DocumentInput) r3
            androidx.documentfile.provider.DocumentFile r3 = r3.getDoc()
            android.net.Uri r3 = r3.getUri()
            java.io.InputStream r0 = r0.openInputStream(r3)
            if (r0 == 0) goto L84
            java.io.Closeable r0 = (java.io.Closeable) r0
            r3 = r0
            java.io.InputStream r3 = (java.io.InputStream) r3     // Catch: java.lang.Throwable -> L7d
            r4 = 0
            byte[] r5 = kotlin.p040io.ByteStreamsKt.readBytes(r3)     // Catch: java.lang.Throwable -> L7d
            kotlin.p040io.CloseableKt.closeFinally(r0, r1)
            if (r5 == 0) goto L84
        L7c:
            return r5
        L7d:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L7f
        L7f:
            r2 = move-exception
            kotlin.p040io.CloseableKt.closeFinally(r0, r1)
            throw r2
        L84:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r7.getDisplayName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter.readInputBytes(com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter$InputRef):byte[]");
    }

    private final ConvertedData convertByName(String name, byte[] bytes, Map<String, byte[]> templatesByBase) throws Throwable {
        byte[] btx;
        String lower = name.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lower, "toLowerCase(...)");
        String base = StringsKt__StringsKt.substringBeforeLast(name, '.', name);
        if (StringsKt__StringsJVMKt.endsWith$default(lower, ".btx", false, 2, null)) {
            byte[] png = BtxPngConverter.INSTANCE.btxToPng(bytes);
            return new ConvertedData(base + FileFormats.PNG_FORMAT, png);
        }
        if (StringsKt__StringsJVMKt.endsWith$default(lower, FileFormats.PNG_FORMAT, false, 2, null) || StringsKt__StringsJVMKt.endsWith$default(lower, ".pngg", false, 2, null)) {
            String key = baseNameKey(name);
            byte[] preferredTemplate = templatesByBase.get(key);
            byte[] fallbackTemplate = (byte[]) CollectionsKt___CollectionsKt.firstOrNull(templatesByBase.values());
            byte[] template = preferredTemplate == null ? fallbackTemplate : preferredTemplate;
            if (template != null) {
                btx = BtxPngConverter.INSTANCE.pngToBtx(bytes, template);
            } else {
                btx = BtxPngConverter.pngToBtx$default(BtxPngConverter.INSTANCE, bytes, null, 2, null);
            }
            return new ConvertedData(base + ".btx", btx);
        }
        throw new IllegalArgumentException("Неподдерживаемый формат: " + name);
    }

    private final void writeOutput(String fileName, byte[] bytes) throws FileNotFoundException {
        DocumentFile treeRoot = getOutputTreeRoot();
        if (treeRoot != null) {
            writeRelativeToTree$default(this, treeRoot, fileName, bytes, null, 8, null);
            return;
        }
        File outDir = ensureDefaultOutputDir();
        File outFile = new File(outDir, fileName);
        File parent = outFile.getParentFile();
        if (parent != null && !parent.exists() && !parent.mkdirs()) {
            throw new IllegalStateException("Не удалось создать папку: " + parent.getAbsolutePath());
        }
        FileOutputStream fileOutputStream = new FileOutputStream(outFile);
        try {
            FileOutputStream it = fileOutputStream;
            it.write(bytes);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileOutputStream, th);
                throw th2;
            }
        }
    }

    static /* synthetic */ void writeRelativeToTree$default(BtxConverter btxConverter, DocumentFile documentFile, String str, byte[] bArr, String str2, int i, Object obj) throws FileNotFoundException {
        if ((i & 8) != 0) {
            str2 = null;
        }
        btxConverter.writeRelativeToTree(documentFile, str, bArr, str2);
    }

    private final void writeRelativeToTree(DocumentFile root, String relativePath, byte[] bytes, String explicitMime) throws FileNotFoundException {
        String mime;
        Iterable $this$filter$iv = StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsJVMKt.replace$default(StringsKt__StringsKt.trimStart(StringsKt__StringsKt.trim((CharSequence) relativePath).toString(), FileSystemKt.UnixPathSeparator), '\\', FileSystemKt.UnixPathSeparator, false, 4, (Object) null), new char[]{FileSystemKt.UnixPathSeparator}, false, 0, 6, (Object) null);
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            String it = (String) element$iv$iv;
            if (!StringsKt__StringsKt.isBlank(it)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        List parts = (List) destination$iv$iv;
        if (parts.isEmpty()) {
            throw new IllegalArgumentException("Пустой путь сохранения".toString());
        }
        DocumentFile current = root;
        for (String part : CollectionsKt___CollectionsKt.dropLast(parts, 1)) {
            DocumentFile documentFileFindFile = current.findFile(part);
            if (documentFileFindFile == null) {
                documentFileFindFile = current.createDirectory(part);
            }
            if (documentFileFindFile == null) {
                throw new IllegalStateException("Не удалось создать папку " + part);
            }
            current = documentFileFindFile;
        }
        String fileName = (String) CollectionsKt___CollectionsKt.last(parts);
        DocumentFile documentFileFindFile2 = current.findFile(fileName);
        if (documentFileFindFile2 != null) {
            documentFileFindFile2.delete();
        }
        if (explicitMime != null) {
            mime = explicitMime;
        } else {
            String lowerCase = StringsKt__StringsKt.substringAfterLast(fileName, '.', "").toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            mime = Intrinsics.areEqual(lowerCase, "png") ? MimeTypes.IMAGE_PNG : "application/octet-stream";
        }
        DocumentFile doc = current.createFile(mime, fileName);
        if (doc == null) {
            throw new IllegalStateException("Не удалось создать файл " + fileName);
        }
        OutputStream outputStreamOpenOutputStream = getCtx().getContentResolver().openOutputStream(doc.getUri(), "w");
        Unit unit = null;
        if (outputStreamOpenOutputStream != null) {
            OutputStream outputStream = outputStreamOpenOutputStream;
            try {
                OutputStream it2 = outputStream;
                it2.write(bytes);
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(outputStream, null);
                unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(outputStream, th);
                    throw th2;
                }
            }
        }
        if (unit == null) {
            throw new IllegalStateException("Не удалось записать файл " + fileName);
        }
    }

    private final List<Uri> collectUris(Intent data) {
        Uri it;
        ClipData clip;
        List result = new ArrayList();
        if (data != null && (clip = data.getClipData()) != null) {
            int itemCount = clip.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                result.add(clip.getItemAt(i).getUri());
            }
        } else if (data != null && (it = data.getData()) != null) {
            result.add(it);
        }
        return result;
    }

    private final List<DocumentFile> collectConvertibleFiles(DocumentFile root) {
        String name;
        Iterable out = new ArrayList();
        ArrayDeque stack = new ArrayDeque();
        stack.add(root);
        while (!stack.isEmpty()) {
            DocumentFile current = (DocumentFile) stack.removeFirst();
            Object[] objArrListFiles = current.listFiles();
            Intrinsics.checkNotNullExpressionValue(objArrListFiles, "listFiles(...)");
            Object[] $this$forEach$iv = objArrListFiles;
            for (Object element$iv : $this$forEach$iv) {
                DocumentFile child = (DocumentFile) element$iv;
                if (child.isDirectory()) {
                    Intrinsics.checkNotNull(child);
                    stack.add(child);
                } else if (child.isFile() && (name = child.getName()) != null) {
                    Intrinsics.checkNotNull(name);
                    if (isConvertibleName(name)) {
                        ((Collection) out).add(child);
                    }
                }
            }
        }
        Iterable $this$sortedBy$iv = out;
        return CollectionsKt___CollectionsKt.sortedWith($this$sortedBy$iv, new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter$collectConvertibleFiles$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                DocumentFile it = (DocumentFile) t;
                String name2 = it.getName();
                if (name2 == null) {
                    name2 = "";
                }
                String str = name2;
                DocumentFile it2 = (DocumentFile) t2;
                String name3 = it2.getName();
                return ComparisonsKt__ComparisonsKt.compareValues(str, name3 != null ? name3 : "");
            }
        });
    }

    private final boolean isConvertibleName(String name) {
        String lower = name.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lower, "toLowerCase(...)");
        return StringsKt__StringsJVMKt.endsWith$default(lower, FileFormats.PNG_FORMAT, false, 2, null) || StringsKt__StringsJVMKt.endsWith$default(lower, ".pngg", false, 2, null) || StringsKt__StringsJVMKt.endsWith$default(lower, ".btx", false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String baseNameKey(String name) {
        String lowerCase = StringsKt__StringsKt.substringBeforeLast(name, '.', name).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final String getDisplayName(Uri uri) {
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

    private final void takePersistableTreePermission(Uri uri) {
        try {
            Result.Companion companion = Result.INSTANCE;
            BtxConverter $this$takePersistableTreePermission_u24lambda_u2416 = this;
            $this$takePersistableTreePermission_u24lambda_u2416.getCtx().getContentResolver().takePersistableUriPermission(uri, 3);
            Result.m15551constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m15551constructorimpl(ResultKt.createFailure(th));
        }
    }

    private final DocumentFile getOutputTreeRoot() {
        Uri uri = this.outputTreeUri;
        if (uri == null) {
            return null;
        }
        DocumentFile doc = DocumentFile.fromTreeUri(getCtx(), uri);
        if (doc == null || !doc.exists() || !doc.canWrite()) {
            this.outputTreeUri = null;
            getPrefs().edit().remove(KEY_OUTPUT_TREE_URI).apply();
            return null;
        }
        return doc;
    }

    private final DocumentFile ensureWritableTreePath(DocumentFile root, String relativePath) {
        Iterable $this$filter$iv = StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsJVMKt.replace$default(StringsKt__StringsKt.trimStart(StringsKt__StringsKt.trim((CharSequence) relativePath).toString(), FileSystemKt.UnixPathSeparator), '\\', FileSystemKt.UnixPathSeparator, false, 4, (Object) null), new char[]{FileSystemKt.UnixPathSeparator}, false, 0, 6, (Object) null);
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            String it = (String) element$iv$iv;
            if (!StringsKt__StringsKt.isBlank(it)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        List<String> parts = (List) destination$iv$iv;
        DocumentFile current = root;
        for (String part : parts) {
            DocumentFile documentFileFindFile = current.findFile(part);
            if (documentFileFindFile == null) {
                documentFileFindFile = current.createDirectory(part);
            }
            if (documentFileFindFile == null) {
                throw new IllegalStateException("Не удалось создать папку " + part);
            }
            current = documentFileFindFile;
            if (!current.canWrite()) {
                StringBuilder sbAppend = new StringBuilder().append("Нет доступа к папке ");
                String name = current.getName();
                if (name == null) {
                    name = part;
                }
                throw new IllegalStateException(sbAppend.append(name).toString());
            }
        }
        return current;
    }

    private final File ensureDefaultOutputDir() {
        File outDir = getCtx().getExternalFilesDir("BTX");
        if (outDir == null) {
            throw new IllegalStateException("Нет доступа к files/BTX");
        }
        if (!outDir.exists() && !outDir.mkdirs()) {
            throw new IllegalStateException("Не удалось создать папку сохранения: " + outDir.getAbsolutePath());
        }
        if (!outDir.isDirectory() || !outDir.canWrite()) {
            throw new IllegalStateException("Нет доступа к папке сохранения: " + outDir.getAbsolutePath());
        }
        return outDir;
    }

    private final void showProgressDialog(String title, int totalFiles) {
        LauncherDialogHelper.ProgressHandle progressHandle = this.progressDialog;
        if (progressHandle != null) {
            progressHandle.dismiss();
        }
        LauncherDialogHelper.ProgressHandle it = LauncherDialogHelper.createDeterminateProgressDialog$default(LauncherDialogHelper.INSTANCE, getCtx(), title, totalFiles, null, null, 24, null);
        it.show();
        this.progressDialog = it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateProgress(int done, int total, String name) {
        LauncherDialogHelper.ProgressHandle progressHandle = this.progressDialog;
        if (progressHandle != null) {
            progressHandle.setProgress(done, total, name);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: BtxConverter.kt */
    @Metadata(m4415d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter$InputRef;", "", "displayName", "", "(Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "DocumentInput", "UriInput", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter$InputRef$DocumentInput;", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter$InputRef$UriInput;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    static abstract class InputRef {
        private final String displayName;

        public /* synthetic */ InputRef(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* JADX INFO: compiled from: BtxConverter.kt */
        @Metadata(m4415d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter$InputRef$UriInput;", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter$InputRef;", "uri", "Landroid/net/Uri;", "displayName", "", "(Landroid/net/Uri;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getUri", "()Landroid/net/Uri;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
        public static final /* data */ class UriInput extends InputRef {
            private final String displayName;
            private final Uri uri;

            public static /* synthetic */ UriInput copy$default(UriInput uriInput, Uri uri, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    uri = uriInput.uri;
                }
                if ((i & 2) != 0) {
                    str = uriInput.displayName;
                }
                return uriInput.copy(uri, str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Uri getUri() {
                return this.uri;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getDisplayName() {
                return this.displayName;
            }

            public final UriInput copy(Uri uri, String displayName) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(displayName, "displayName");
                return new UriInput(uri, displayName);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UriInput)) {
                    return false;
                }
                UriInput uriInput = (UriInput) other;
                return Intrinsics.areEqual(this.uri, uriInput.uri) && Intrinsics.areEqual(this.displayName, uriInput.displayName);
            }

            public int hashCode() {
                return (this.uri.hashCode() * 31) + this.displayName.hashCode();
            }

            public String toString() {
                return "UriInput(uri=" + this.uri + ", displayName=" + this.displayName + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UriInput(Uri uri, String displayName) {
                super(displayName, null);
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(displayName, "displayName");
                this.uri = uri;
                this.displayName = displayName;
            }

            @Override // com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter.InputRef
            public String getDisplayName() {
                return this.displayName;
            }

            public final Uri getUri() {
                return this.uri;
            }
        }

        private InputRef(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        /* JADX INFO: compiled from: BtxConverter.kt */
        @Metadata(m4415d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter$InputRef$DocumentInput;", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter$InputRef;", "doc", "Landroidx/documentfile/provider/DocumentFile;", "displayName", "", "(Landroidx/documentfile/provider/DocumentFile;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getDoc", "()Landroidx/documentfile/provider/DocumentFile;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
        public static final /* data */ class DocumentInput extends InputRef {
            private final String displayName;
            private final DocumentFile doc;

            public static /* synthetic */ DocumentInput copy$default(DocumentInput documentInput, DocumentFile documentFile, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    documentFile = documentInput.doc;
                }
                if ((i & 2) != 0) {
                    str = documentInput.displayName;
                }
                return documentInput.copy(documentFile, str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DocumentFile getDoc() {
                return this.doc;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getDisplayName() {
                return this.displayName;
            }

            public final DocumentInput copy(DocumentFile doc, String displayName) {
                Intrinsics.checkNotNullParameter(doc, "doc");
                Intrinsics.checkNotNullParameter(displayName, "displayName");
                return new DocumentInput(doc, displayName);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DocumentInput)) {
                    return false;
                }
                DocumentInput documentInput = (DocumentInput) other;
                return Intrinsics.areEqual(this.doc, documentInput.doc) && Intrinsics.areEqual(this.displayName, documentInput.displayName);
            }

            public int hashCode() {
                return (this.doc.hashCode() * 31) + this.displayName.hashCode();
            }

            public String toString() {
                return "DocumentInput(doc=" + this.doc + ", displayName=" + this.displayName + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DocumentInput(DocumentFile doc, String displayName) {
                super(displayName, null);
                Intrinsics.checkNotNullParameter(doc, "doc");
                Intrinsics.checkNotNullParameter(displayName, "displayName");
                this.doc = doc;
                this.displayName = displayName;
            }

            @Override // com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter.InputRef
            public String getDisplayName() {
                return this.displayName;
            }

            public final DocumentFile getDoc() {
                return this.doc;
            }
        }
    }

    /* JADX INFO: compiled from: BtxConverter.kt */
    @Metadata(m4415d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BtxConverter$ConvertedData;", "", "outputName", "", "outputBytes", "", "(Ljava/lang/String;[B)V", "getOutputBytes", "()[B", "getOutputName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final /* data */ class ConvertedData {
        private final byte[] outputBytes;
        private final String outputName;

        public static /* synthetic */ ConvertedData copy$default(ConvertedData convertedData, String str, byte[] bArr, int i, Object obj) {
            if ((i & 1) != 0) {
                str = convertedData.outputName;
            }
            if ((i & 2) != 0) {
                bArr = convertedData.outputBytes;
            }
            return convertedData.copy(str, bArr);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getOutputName() {
            return this.outputName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final byte[] getOutputBytes() {
            return this.outputBytes;
        }

        public final ConvertedData copy(String outputName, byte[] outputBytes) {
            Intrinsics.checkNotNullParameter(outputName, "outputName");
            Intrinsics.checkNotNullParameter(outputBytes, "outputBytes");
            return new ConvertedData(outputName, outputBytes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConvertedData)) {
                return false;
            }
            ConvertedData convertedData = (ConvertedData) other;
            return Intrinsics.areEqual(this.outputName, convertedData.outputName) && Intrinsics.areEqual(this.outputBytes, convertedData.outputBytes);
        }

        public int hashCode() {
            return (this.outputName.hashCode() * 31) + Arrays.hashCode(this.outputBytes);
        }

        public String toString() {
            return "ConvertedData(outputName=" + this.outputName + ", outputBytes=" + Arrays.toString(this.outputBytes) + ')';
        }

        public ConvertedData(String outputName, byte[] outputBytes) {
            Intrinsics.checkNotNullParameter(outputName, "outputName");
            Intrinsics.checkNotNullParameter(outputBytes, "outputBytes");
            this.outputName = outputName;
            this.outputBytes = outputBytes;
        }

        public final String getOutputName() {
            return this.outputName;
        }

        public final byte[] getOutputBytes() {
            return this.outputBytes;
        }
    }
}
