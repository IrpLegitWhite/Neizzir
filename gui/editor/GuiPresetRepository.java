package com.blackhub.bronline.neizzir.gui.editor;

import android.content.Context;
import com.blackhub.bronline.launcher.LauncherConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.ByteStreamsKt;
import kotlin.p040io.CloseableKt;
import kotlin.p040io.FilesKt;
import kotlin.p040io.FilesKt__UtilsKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.p043io.files.FileSystemKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.StringFormat;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* JADX INFO: compiled from: GuiPresetRepository.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0016\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0006J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0006J\u0016\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0010J0\u0010\u001d\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020 0\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0013J\u0018\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiPresetRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "presetsDir", "Ljava/io/File;", "(Ljava/io/File;)V", "copyMissingPayloads", "", "preset", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiEditorPreset;", "fromDir", "toDir", "alreadyWritten", "", "", "exportPreset", "handle", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiPresetHandle;", "targetZip", "importPreset", "zipFile", "listPresets", "", "loadPreset", "directory", "payloadFile", "relativePath", "savePreset", "payloads", "", "", "sourceHandle", "uniqueDirectoryName", "name", "createdAt", "", "validatePreset", "validateRelativePath", "path", "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class GuiPresetRepository {
    public static final String MANIFEST_NAME = "preset.json";
    private final File presetsDir;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Json json = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiPresetRepository$Companion$json$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            invoke2(jsonBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(JsonBuilder Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setPrettyPrint(true);
            Json.setEncodeDefaults(true);
            Json.setIgnoreUnknownKeys(true);
        }
    }, 1, null);

    public GuiPresetRepository(File presetsDir) {
        Intrinsics.checkNotNullParameter(presetsDir, "presetsDir");
        this.presetsDir = presetsDir;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GuiPresetRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File externalFilesDir = context.getExternalFilesDir(null);
        this(new File(externalFilesDir != null ? externalFilesDir.getParentFile() : null, "Custom/gui/presets"));
    }

    public final List<GuiPresetHandle> listPresets() {
        Object objM15551constructorimpl;
        this.presetsDir.mkdirs();
        File[] fileArrListFiles = this.presetsDir.listFiles();
        File[] fileArr = fileArrListFiles == null ? new File[0] : fileArrListFiles;
        Collection destination$iv$iv = new ArrayList();
        for (File file : fileArr) {
            if (file.isDirectory() && new File(file, MANIFEST_NAME).isFile()) {
                destination$iv$iv.add(file);
            }
        }
        Iterable $this$mapNotNull$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            File dir = (File) element$iv$iv$iv;
            try {
                Result.Companion companion = Result.INSTANCE;
                GuiPresetRepository $this$listPresets_u24lambda_u242_u24lambda_u241 = this;
                Intrinsics.checkNotNull(dir);
                objM15551constructorimpl = Result.m15551constructorimpl($this$listPresets_u24lambda_u242_u24lambda_u241.loadPreset(dir));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
                objM15551constructorimpl = null;
            }
            GuiPresetHandle guiPresetHandle = (GuiPresetHandle) objM15551constructorimpl;
            if (guiPresetHandle != null) {
                destination$iv$iv2.add(guiPresetHandle);
            }
        }
        Iterable $this$sortedByDescending$iv = (List) destination$iv$iv2;
        return CollectionsKt___CollectionsKt.sortedWith($this$sortedByDescending$iv, new Comparator() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiPresetRepository$listPresets$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                GuiPresetHandle it = (GuiPresetHandle) t2;
                GuiPresetHandle it2 = (GuiPresetHandle) t;
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(it.getPreset().getCreatedAt()), Long.valueOf(it2.getPreset().getCreatedAt()));
            }
        });
    }

    public final GuiPresetHandle loadPreset(File directory) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        File manifest = new File(directory, MANIFEST_NAME);
        if (!manifest.isFile()) {
            throw new IllegalArgumentException("Preset manifest не найден: " + manifest.getAbsolutePath());
        }
        Json this_$iv = json;
        String string$iv = FilesKt.readText(manifest, Charsets.UTF_8);
        this_$iv.getSerializersModule();
        GuiEditorPreset preset = (GuiEditorPreset) this_$iv.decodeFromString(GuiEditorPreset.INSTANCE.serializer(), string$iv);
        validatePreset(preset);
        return new GuiPresetHandle(directory, preset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GuiPresetHandle savePreset$default(GuiPresetRepository guiPresetRepository, GuiEditorPreset guiEditorPreset, Map map, GuiPresetHandle guiPresetHandle, int i, Object obj) {
        if ((i & 2) != 0) {
            map = MapsKt__MapsKt.emptyMap();
        }
        if ((i & 4) != 0) {
            guiPresetHandle = null;
        }
        return guiPresetRepository.savePreset(guiEditorPreset, map, guiPresetHandle);
    }

    public final GuiPresetHandle savePreset(GuiEditorPreset preset, Map<String, byte[]> payloads, GuiPresetHandle sourceHandle) {
        Intrinsics.checkNotNullParameter(preset, "preset");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        validatePreset(preset);
        this.presetsDir.mkdirs();
        File dir = new File(this.presetsDir, uniqueDirectoryName(preset.getName(), preset.getCreatedAt()));
        if (dir.exists()) {
            FilesKt.deleteRecursively(dir);
        }
        dir.mkdirs();
        File file = new File(dir, MANIFEST_NAME);
        StringFormat $this$encodeToString$iv = json;
        $this$encodeToString$iv.getSerializersModule();
        FilesKt.writeText(file, $this$encodeToString$iv.encodeToString(GuiEditorPreset.INSTANCE.serializer(), preset), Charsets.UTF_8);
        for (Map.Entry<String, byte[]> entry : payloads.entrySet()) {
            String relativePath = entry.getKey();
            byte[] bytes = entry.getValue();
            validateRelativePath(relativePath);
            File output = new File(dir, StringsKt__StringsJVMKt.replace$default(relativePath, FileSystemKt.UnixPathSeparator, File.separatorChar, false, 4, (Object) null));
            File parentFile = output.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FilesKt.writeBytes(output, bytes);
        }
        if (sourceHandle != null) {
            copyMissingPayloads(preset, sourceHandle.getDirectory(), dir, payloads.keySet());
        }
        return new GuiPresetHandle(dir, preset);
    }

    public final File exportPreset(GuiPresetHandle handle, File targetZip) {
        Throwable th;
        Intrinsics.checkNotNullParameter(handle, "handle");
        Intrinsics.checkNotNullParameter(targetZip, "targetZip");
        File parentFile = targetZip.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        if (targetZip.exists()) {
            targetZip.delete();
        }
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(targetZip));
        try {
            ZipOutputStream zip = zipOutputStream;
            int i = 0;
            Sequence $this$forEach$iv = SequencesKt___SequencesKt.filter(FilesKt.walkTopDown(handle.getDirectory()), new Function1<File, Boolean>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiPresetRepository$exportPreset$1$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(File it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(it.isFile());
                }
            });
            Iterator it = $this$forEach$iv.iterator();
            while (it.hasNext()) {
                Object element$iv = it.next();
                File file = (File) element$iv;
                String relative = FilesKt.getInvariantSeparatorsPath(FilesKt.relativeTo(file, handle.getDirectory()));
                try {
                    validateRelativePath(relative);
                    zip.putNextEntry(new ZipEntry(relative));
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        FileInputStream input = fileInputStream;
                        Iterator it2 = it;
                        int i2 = i;
                        Sequence $this$forEach$iv2 = $this$forEach$iv;
                        try {
                            ByteStreamsKt.copyTo$default(input, zip, 0, 2, null);
                            CloseableKt.closeFinally(fileInputStream, null);
                            zip.closeEntry();
                            it = it2;
                            i = i2;
                            $this$forEach$iv = $this$forEach$iv2;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                CloseableKt.closeFinally(fileInputStream, th);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    Throwable th6 = th;
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        CloseableKt.closeFinally(zipOutputStream, th6);
                        throw th7;
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(zipOutputStream, null);
            return targetZip;
        } catch (Throwable th8) {
            th = th8;
        }
    }

    public final GuiPresetHandle importPreset(File zipFile) {
        Intrinsics.checkNotNullParameter(zipFile, "zipFile");
        if (!zipFile.isFile()) {
            throw new IllegalArgumentException("ZIP пресета не найден: " + zipFile.getAbsolutePath());
        }
        this.presetsDir.mkdirs();
        File importDir = new File(this.presetsDir, "import_" + System.currentTimeMillis());
        if (importDir.exists()) {
            FilesKt.deleteRecursively(importDir);
        }
        importDir.mkdirs();
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
            try {
                ZipInputStream zip = zipInputStream;
                while (true) {
                    ZipEntry entry = zip.getNextEntry();
                    if (entry == null) {
                        break;
                    }
                    Intrinsics.checkNotNull(entry);
                    String name = entry.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    String name2 = StringsKt__StringsJVMKt.replace$default(name, '\\', FileSystemKt.UnixPathSeparator, false, 4, (Object) null);
                    validateRelativePath(name2);
                    if (!entry.isDirectory()) {
                        File output = new File(importDir, StringsKt__StringsJVMKt.replace$default(name2, FileSystemKt.UnixPathSeparator, File.separatorChar, false, 4, (Object) null));
                        File parentFile = output.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(output);
                        try {
                            FileOutputStream out = fileOutputStream;
                            ByteStreamsKt.copyTo$default(zip, out, 0, 2, null);
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
                    zip.closeEntry();
                    FilesKt.deleteRecursively(importDir);
                    throw t;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(zipInputStream, null);
                GuiPresetHandle handle = loadPreset(importDir);
                File finalDir = new File(this.presetsDir, uniqueDirectoryName(handle.getPreset().getName(), handle.getPreset().getCreatedAt()));
                if (finalDir.exists()) {
                    FilesKt.deleteRecursively(finalDir);
                }
                if (!importDir.renameTo(finalDir)) {
                    FilesKt.copyRecursively$default(importDir, finalDir, true, null, 4, null);
                    FilesKt.deleteRecursively(importDir);
                }
                return loadPreset(finalDir);
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(zipInputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable t) {
            FilesKt.deleteRecursively(importDir);
            throw t;
        }
    }

    public final File payloadFile(GuiPresetHandle handle, String relativePath) {
        Intrinsics.checkNotNullParameter(handle, "handle");
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        validateRelativePath(relativePath);
        File file = new File(handle.getDirectory(), StringsKt__StringsJVMKt.replace$default(relativePath, FileSystemKt.UnixPathSeparator, File.separatorChar, false, 4, (Object) null));
        if (!file.isFile()) {
            throw new IllegalStateException("Файл пресета не найден: " + relativePath);
        }
        return file;
    }

    private final void copyMissingPayloads(GuiEditorPreset preset, File fromDir, File toDir, Set<String> alreadyWritten) {
        Iterable $this$mapNotNull$iv = preset.getTexturePatches();
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            GuiTexturePatch it = (GuiTexturePatch) element$iv$iv$iv;
            String payloadFile = it.getPayloadFile();
            if (payloadFile != null) {
                destination$iv$iv.add(payloadFile);
            }
        }
        Iterable $this$filterNot$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList();
        for (Object element$iv$iv : $this$filterNot$iv) {
            String it2 = (String) element$iv$iv;
            if (!alreadyWritten.contains(it2)) {
                destination$iv$iv2.add(element$iv$iv);
            }
        }
        Iterable $this$forEach$iv = (List) destination$iv$iv2;
        for (Object element$iv : $this$forEach$iv) {
            String relative = (String) element$iv;
            validateRelativePath(relative);
            File source = new File(fromDir, StringsKt__StringsJVMKt.replace$default(relative, FileSystemKt.UnixPathSeparator, File.separatorChar, false, 4, (Object) null));
            if (source.isFile()) {
                File target = new File(toDir, StringsKt__StringsJVMKt.replace$default(relative, FileSystemKt.UnixPathSeparator, File.separatorChar, false, 4, (Object) null));
                File parentFile = target.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FilesKt__UtilsKt.copyTo$default(source, target, true, 0, 4, null);
            }
        }
    }

    private final void validatePreset(GuiEditorPreset preset) {
        if (preset.getVersion() != 1) {
            throw new SerializationException("Неподдерживаемая версия GUI пресета: " + preset.getVersion());
        }
        if (StringsKt__StringsKt.isBlank(preset.getName())) {
            throw new SerializationException("Имя GUI пресета пустое.");
        }
        Iterable $this$forEach$iv = preset.getTexturePatches();
        for (Object element$iv : $this$forEach$iv) {
            GuiTexturePatch patch = (GuiTexturePatch) element$iv;
            if (!StringsKt__StringsJVMKt.startsWith$default(patch.getArchivePath(), "Hud/Images/", false, 2, null) || !StringsKt__StringsJVMKt.endsWith(patch.getArchivePath(), ".btx", true)) {
                throw new SerializationException("Texture patch вне HUD whitelist: " + patch.getArchivePath());
            }
            String p0 = patch.getPayloadFile();
            if (p0 != null) {
                validateRelativePath(p0);
            }
        }
    }

    private final void validateRelativePath(String path) {
        String normalized = StringsKt__StringsJVMKt.replace$default(path, '\\', FileSystemKt.UnixPathSeparator, false, 4, (Object) null);
        if (StringsKt__StringsKt.isBlank(normalized)) {
            throw new IllegalArgumentException("Пустой путь в пресете.".toString());
        }
        if (StringsKt__StringsJVMKt.startsWith$default(normalized, "/", false, 2, null)) {
            throw new IllegalArgumentException(("Абсолютный путь запрещен: " + path).toString());
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) normalized, (CharSequence) "..", false, 2, (Object) null)) {
            throw new IllegalArgumentException(("Path traversal запрещен: " + path).toString());
        }
    }

    private final String uniqueDirectoryName(String name, long createdAt) {
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = name.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strTrim = StringsKt__StringsKt.trim(new Regex("[^a-z0-9а-яё_-]+").replace(lowerCase, "_"), LauncherConstants.UNDERSCORE_CHAR);
        if (StringsKt__StringsKt.isBlank(strTrim)) {
            strTrim = "preset";
        }
        String safeName = strTrim;
        return createdAt + LauncherConstants.UNDERSCORE_CHAR + safeName;
    }

    /* JADX INFO: compiled from: GuiPresetRepository.kt */
    @Metadata(m4415d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiPresetRepository$Companion;", "", "()V", "MANIFEST_NAME", "", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Json getJson() {
            return GuiPresetRepository.json;
        }
    }
}
