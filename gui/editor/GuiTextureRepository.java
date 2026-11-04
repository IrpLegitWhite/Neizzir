package com.blackhub.bronline.neizzir.gui.editor;

import android.content.Context;
import android.graphics.Color;
import com.blackhub.bronline.game.core.constants.FileFormats;
import com.blackhub.bronline.neizzir.converter.BtxPngConverter;
import com.blackhub.bronline.neizzir.fragments.custom.util.PngTintUtil;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.ByteStreamsKt;
import kotlin.p040io.CloseableKt;
import kotlin.p040io.FilesKt;
import kotlin.p040io.FilesKt__UtilsKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.p043io.files.FileSystemKt;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.p044io.inputstream.ZipInputStream;

/* JADX INFO: compiled from: GuiTextureRepository.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 02\u00020\u0001:\u00010B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u001e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0006J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u000eH\u0002J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0002J\u000e\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020 J\u000e\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010&\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\fJ\u0016\u0010'\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\fJ\u000e\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0006J\u0010\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000eH\u0002J\u0006\u0010-\u001a\u00020\u000eJ\u0006\u0010.\u001a\u00020\u001bJ\u0010\u0010/\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiTextureRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "archiveFile", "Ljava/io/File;", "cacheDir", "(Ljava/io/File;Ljava/io/File;)V", "backupTo", "directory", "buildRecoloredBytes", "", "entryPath", "", "colorHex", "buildReplacementBytes", "sourceName", "sourceBytes", "exists", "", "file", "findHeader", "Lnet/lingala/zip4j/model/FileHeader;", "zip", "Lnet/lingala/zip4j/ZipFile;", "invalidatePreview", "", "isAllowedHudTexturePath", "path", "listHudTextures", "", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiTextureEntry;", "normalizeAndroidColor", "color", "previewFile", "entry", "readEntryBytes", "replaceEntry", "replaceEntryBytes", "outputBytes", "restoreFrom", "backup", "sha256", "value", "sha256OrEmpty", "validate", "validateEntryPath", "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class GuiTextureRepository {
    public static final String TEXTURE_BPC_NAME = "gui_textures.astc.bpc";
    private final File archiveFile;
    private final File cacheDir;

    public GuiTextureRepository(File archiveFile, File cacheDir) {
        Intrinsics.checkNotNullParameter(archiveFile, "archiveFile");
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        this.archiveFile = archiveFile;
        this.cacheDir = cacheDir;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuiTextureRepository(Context context) {
        this(new File(context.getExternalFilesDir("textures"), TEXTURE_BPC_NAME), new File(context.getCacheDir(), "gui_editor/texture_previews"));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: file, reason: from getter */
    public final File getArchiveFile() {
        return this.archiveFile;
    }

    public final boolean exists() {
        return this.archiveFile.isFile();
    }

    public final void validate() {
        if (!this.archiveFile.isFile()) {
            throw new IllegalStateException("Не найден gui_textures.astc.bpc: " + this.archiveFile.getAbsolutePath());
        }
        ZipFile zip = new ZipFile(this.archiveFile);
        if (!zip.isValidZipFile()) {
            throw new IllegalStateException("gui_textures.astc.bpc поврежден или не является ZIP/BPC архивом.");
        }
    }

    public final List<GuiTextureEntry> listHudTextures() throws ZipException {
        validate();
        ZipFile zip = new ZipFile(this.archiveFile);
        List<FileHeader> fileHeaders = zip.getFileHeaders();
        Intrinsics.checkNotNullExpressionValue(fileHeaders, "getFileHeaders(...)");
        Sequence $this$sortedBy$iv = SequencesKt___SequencesKt.filter(CollectionsKt___CollectionsKt.asSequence(fileHeaders), new Function1<FileHeader, Boolean>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiTextureRepository.listHudTextures.1
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FileHeader it) {
                boolean z;
                if (it.isDirectory()) {
                    z = false;
                } else {
                    GuiTextureRepository guiTextureRepository = GuiTextureRepository.this;
                    String fileName = it.getFileName();
                    Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                    if (guiTextureRepository.isAllowedHudTexturePath(fileName)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.sortedWith($this$sortedBy$iv, new Comparator() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiTextureRepository$listHudTextures$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                FileHeader it = (FileHeader) t;
                String fileName = it.getFileName();
                Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = fileName.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                FileHeader it2 = (FileHeader) t2;
                String fileName2 = it2.getFileName();
                Intrinsics.checkNotNullExpressionValue(fileName2, "getFileName(...)");
                Locale US2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase2 = fileName2.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                return ComparisonsKt__ComparisonsKt.compareValues(lowerCase, lowerCase2);
            }
        }), new Function1<FileHeader, GuiTextureEntry>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiTextureRepository.listHudTextures.3
            @Override // kotlin.jvm.functions.Function1
            public final GuiTextureEntry invoke(FileHeader it) {
                String fileName = it.getFileName();
                Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                String fileName2 = it.getFileName();
                Intrinsics.checkNotNullExpressionValue(fileName2, "getFileName(...)");
                return new GuiTextureEntry(fileName, StringsKt__StringsKt.substringAfterLast$default(fileName2, FileSystemKt.UnixPathSeparator, (String) null, 2, (Object) null), it.getUncompressedSize());
            }
        }));
    }

    public final byte[] readEntryBytes(String entryPath) throws IOException {
        Intrinsics.checkNotNullParameter(entryPath, "entryPath");
        validateEntryPath(entryPath);
        ZipFile zip = new ZipFile(this.archiveFile);
        FileHeader header = findHeader(zip, entryPath);
        ZipInputStream inputStream = zip.getInputStream(header);
        try {
            ZipInputStream it = inputStream;
            Intrinsics.checkNotNull(it);
            byte[] bytes = ByteStreamsKt.readBytes(it);
            CloseableKt.closeFinally(inputStream, null);
            return bytes;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(inputStream, th);
                throw th2;
            }
        }
    }

    public final File previewFile(GuiTextureEntry entry) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(entry, "entry");
        String key = sha256(this.archiveFile.getAbsolutePath() + '|' + this.archiveFile.lastModified() + '|' + this.archiveFile.length() + '|' + entry.getArchivePath());
        File output = new File(this.cacheDir, key + FileFormats.PNG_FORMAT);
        if (!output.exists()) {
            File parentFile = output.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FilesKt.writeBytes(output, BtxPngConverter.INSTANCE.btxToPng(readEntryBytes(entry.getArchivePath())));
        }
        return output;
    }

    public final void replaceEntry(String entryPath, String sourceName, byte[] sourceBytes) throws IOException {
        Intrinsics.checkNotNullParameter(entryPath, "entryPath");
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        Intrinsics.checkNotNullParameter(sourceBytes, "sourceBytes");
        byte[] outputBytes = buildReplacementBytes(entryPath, sourceName, sourceBytes);
        replaceEntryBytes(entryPath, outputBytes);
    }

    public final void replaceEntryBytes(String entryPath, byte[] outputBytes) {
        Intrinsics.checkNotNullParameter(entryPath, "entryPath");
        Intrinsics.checkNotNullParameter(outputBytes, "outputBytes");
        validateEntryPath(entryPath);
        ZipFile zip = new ZipFile(this.archiveFile);
        FileHeader existing = findHeader(zip, entryPath);
        zip.removeFile(existing);
        ZipParameters params = new ZipParameters();
        params.setFileNameInZip(entryPath);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(outputBytes);
        try {
            ByteArrayInputStream input = byteArrayInputStream;
            zip.addStream(input, params);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(byteArrayInputStream, null);
            invalidatePreview(entryPath);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(byteArrayInputStream, th);
                throw th2;
            }
        }
    }

    public final byte[] buildReplacementBytes(String entryPath, String sourceName, byte[] sourceBytes) throws IOException {
        Intrinsics.checkNotNullParameter(entryPath, "entryPath");
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        Intrinsics.checkNotNullParameter(sourceBytes, "sourceBytes");
        validateEntryPath(entryPath);
        if (StringsKt__StringsJVMKt.endsWith(sourceName, ".btx", true)) {
            return sourceBytes;
        }
        if (StringsKt__StringsJVMKt.endsWith(sourceName, FileFormats.PNG_FORMAT, true) || StringsKt__StringsJVMKt.endsWith(sourceName, ".pngg", true)) {
            byte[] template = readEntryBytes(entryPath);
            return BtxPngConverter.INSTANCE.pngToBtx(sourceBytes, template);
        }
        throw new IllegalArgumentException("Неподдерживаемый формат текстуры: " + sourceName);
    }

    public final byte[] buildRecoloredBytes(String entryPath, String colorHex) throws Throwable {
        Intrinsics.checkNotNullParameter(entryPath, "entryPath");
        Intrinsics.checkNotNullParameter(colorHex, "colorHex");
        validateEntryPath(entryPath);
        byte[] original = readEntryBytes(entryPath);
        byte[] png = BtxPngConverter.INSTANCE.btxToPng(original);
        byte[] tinted = PngTintUtil.INSTANCE.tintPng(png, Color.parseColor(normalizeAndroidColor(colorHex)));
        return BtxPngConverter.INSTANCE.pngToBtx(tinted, original);
    }

    public final File backupTo(File directory) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        if (!this.archiveFile.isFile()) {
            throw new IllegalStateException("Не найден gui_textures.astc.bpc для backup.");
        }
        directory.mkdirs();
        File backup = new File(directory, TEXTURE_BPC_NAME);
        FilesKt__UtilsKt.copyTo$default(this.archiveFile, backup, true, 0, 4, null);
        return backup;
    }

    public final void restoreFrom(File backup) {
        Intrinsics.checkNotNullParameter(backup, "backup");
        if (backup.isFile()) {
            File parentFile = this.archiveFile.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FilesKt__UtilsKt.copyTo$default(backup, this.archiveFile, true, 0, 4, null);
            FilesKt.deleteRecursively(this.cacheDir);
        }
    }

    public final String sha256OrEmpty() {
        return this.archiveFile.isFile() ? GuiBpcRepository.INSTANCE.sha256(this.archiveFile) : "";
    }

    private final void validateEntryPath(String entryPath) {
        if (!isAllowedHudTexturePath(entryPath)) {
            throw new IllegalArgumentException("Текстура вне HUD whitelist: " + entryPath);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAllowedHudTexturePath(String path) {
        String normalized = StringsKt__StringsJVMKt.replace$default(path, '\\', FileSystemKt.UnixPathSeparator, false, 4, (Object) null);
        return StringsKt__StringsJVMKt.startsWith$default(normalized, "Hud/Images/", false, 2, null) && StringsKt__StringsJVMKt.endsWith(normalized, ".btx", true) && !StringsKt__StringsKt.contains$default((CharSequence) normalized, (CharSequence) "..", false, 2, (Object) null);
    }

    private final FileHeader findHeader(ZipFile zip, String entryPath) throws ZipException {
        Object element$iv;
        FileHeader it;
        Iterable fileHeaders = zip.getFileHeaders();
        Intrinsics.checkNotNullExpressionValue(fileHeaders, "getFileHeaders(...)");
        Iterable $this$firstOrNull$iv = fileHeaders;
        Iterator it2 = $this$firstOrNull$iv.iterator();
        do {
            if (!it2.hasNext()) {
                element$iv = null;
                break;
            }
            element$iv = it2.next();
            it = (FileHeader) element$iv;
        } while (!StringsKt__StringsJVMKt.equals(it.getFileName(), entryPath, true));
        FileHeader fileHeader = (FileHeader) element$iv;
        if (fileHeader != null) {
            return fileHeader;
        }
        throw new ZipException("BTX entry не найден: " + entryPath);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0064  */
    private final void invalidatePreview(String entryPath) throws NoSuchAlgorithmException {
        if (this.cacheDir.exists()) {
            String prefix = sha256(this.archiveFile.getAbsolutePath() + '|');
            File[] fileArrListFiles = this.cacheDir.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file : fileArrListFiles) {
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt__StringsJVMKt.startsWith$default(name, prefix, false, 2, null)) {
                    file.delete();
                } else {
                    String name2 = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    if (StringsKt__StringsKt.contains$default((CharSequence) name2, (CharSequence) StringsKt___StringsKt.take(sha256(entryPath), 8), false, 2, (Object) null)) {
                        file.delete();
                    }
                }
            }
        }
    }

    private final String normalizeAndroidColor(String color) {
        String trimmed = StringsKt__StringsKt.trim((CharSequence) color).toString();
        if (!StringsKt__StringsJVMKt.startsWith$default(trimmed, "#", false, 2, null)) {
            return trimmed;
        }
        if (trimmed.length() != 9) {
            return trimmed;
        }
        StringBuilder sbAppend = new StringBuilder().append('#');
        String strSubstring = trimmed.substring(3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return sbAppend.append(strSubstring).toString();
    }

    private final String sha256(String value) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = value.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bytes2 = messageDigest.digest(bytes);
        Intrinsics.checkNotNull(bytes2);
        return ArraysKt___ArraysKt.joinToString$default(bytes2, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiTextureRepository.sha256.1
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
    }
}
