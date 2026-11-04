package com.blackhub.bronline.neizzir.fragments.custom.btx;

import android.content.Context;
import androidx.media3.common.MimeTypes;
import com.blackhub.bronline.game.core.constants.FileFormats;
import com.blackhub.bronline.neizzir.converter.BtxPngConverter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.ByteStreamsKt;
import kotlin.p040io.CloseableKt;
import kotlin.p040io.FilesKt;
import kotlin.p040io.FilesKt__UtilsKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.p043io.files.FileSystemKt;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.p044io.inputstream.ZipInputStream;

/* JADX INFO: compiled from: BpcArchiveRepository.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u00019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ \u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\rH\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\bJ\"\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0002J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u001e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010!\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bJ0\u0010\"\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00060%J\u001e\u0010&\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010'\u001a\u00020\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010+\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020 0\u001a2\u0006\u0010\u0007\u001a\u00020\bJ$\u0010-\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060/H\u0002J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0016H\u0002J\u0016\u00103\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nJ&\u00104\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ \u00105\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\rH\u0002J\f\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\u001aJ\u0010\u00107\u001a\u0004\u0018\u00010\n2\u0006\u00108\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcArchiveRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "addEntry", "", "archive", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcArchiveItem;", "targetEntryPath", "", "sourceName", "sourceBytes", "", "overwrite", "", "addZipEntry", "zip", "Lnet/lingala/zip4j/ZipFile;", "entryPath", "bytes", "backupFileFor", "Ljava/io/File;", "buildArchiveBtxPayload", "templateBytes", "buildBulkExport", "", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcExportPayload;", "format", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcExportFormat;", "buildEntryExport", "entry", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcTextureEntry;", "canAddPng", "exportAll", "", "onEntry", "Lkotlin/Function2;", "extractEntryAsBtx", "targetDirectory", "findFileHeader", "Lnet/lingala/zip4j/model/FileHeader;", "firstTemplateBytes", "hasAnyTextureEntries", "listTextureEntries", "mutateArchive", "action", "Lkotlin/Function1;", "readArchiveInfo", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcArchiveRepository$ArchiveInfo;", "file", "readEntryBytes", "replaceEntry", "replaceZipEntry", "scanArchives", "validateEntryPath", "input", "ArchiveInfo", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class BpcArchiveRepository {
    private final Context context;

    /* JADX INFO: compiled from: BpcArchiveRepository.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BpcExportFormat.values().length];
            try {
                iArr[BpcExportFormat.BTX.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[BpcExportFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BpcArchiveRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final List<BpcArchiveItem> scanArchives() {
        final File texturesDir = this.context.getExternalFilesDir("textures");
        if (texturesDir == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (!texturesDir.exists()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Sequence map = SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(FilesKt.walkTopDown(texturesDir), new Function1<File, Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.btx.BpcArchiveRepository.scanArchives.1
            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(File it) {
                boolean z;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.isFile()) {
                    z = StringsKt__StringsJVMKt.equals(FilesKt__UtilsKt.getExtension(it), "bpc", true);
                }
                return Boolean.valueOf(z);
            }
        }), new Function1<File, BpcArchiveItem>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.btx.BpcArchiveRepository.scanArchives.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final BpcArchiveItem invoke(File archive) {
                Object objM15551constructorimpl;
                Intrinsics.checkNotNullParameter(archive, "archive");
                String relative = FilesKt.getInvariantSeparatorsPath(FilesKt.relativeTo(archive, texturesDir));
                BpcArchiveRepository $this$invoke_u24lambda_u240 = this;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM15551constructorimpl = Result.m15551constructorimpl($this$invoke_u24lambda_u240.readArchiveInfo(archive));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
                    objM15551constructorimpl = null;
                }
                ArchiveInfo info = (ArchiveInfo) objM15551constructorimpl;
                return new BpcArchiveItem(archive, relative, archive.length(), archive.lastModified(), info != null ? info.getTextureCount() : 0, info != null ? info.getSupported() : false);
            }
        });
        final Comparator comparator = new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.custom.btx.BpcArchiveRepository$scanArchives$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                BpcArchiveItem it = (BpcArchiveItem) t;
                Boolean boolValueOf = Boolean.valueOf(!it.getSupported());
                BpcArchiveItem it2 = (BpcArchiveItem) t2;
                return ComparisonsKt__ComparisonsKt.compareValues(boolValueOf, Boolean.valueOf(!it2.getSupported()));
            }
        };
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.sortedWith(map, new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.custom.btx.BpcArchiveRepository$scanArchives$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int previousCompare = comparator.compare(t, t2);
                if (previousCompare != 0) {
                    return previousCompare;
                }
                BpcArchiveItem it = (BpcArchiveItem) t;
                String relativePath = it.getRelativePath();
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = relativePath.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                BpcArchiveItem it2 = (BpcArchiveItem) t2;
                String relativePath2 = it2.getRelativePath();
                Locale US2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase2 = relativePath2.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                return ComparisonsKt__ComparisonsKt.compareValues(lowerCase, lowerCase2);
            }
        }));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0051  */
    public final List<BpcTextureEntry> listTextureEntries(BpcArchiveItem archive) throws ZipException {
        boolean z;
        Intrinsics.checkNotNullParameter(archive, "archive");
        ZipFile zip = new ZipFile(archive.getFile());
        Iterable fileHeaders = zip.getFileHeaders();
        Intrinsics.checkNotNullExpressionValue(fileHeaders, "getFileHeaders(...)");
        Iterable $this$filter$iv = fileHeaders;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            FileHeader header = (FileHeader) element$iv$iv;
            if (!header.isDirectory()) {
                String fileName = header.getFileName();
                Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                z = StringsKt__StringsJVMKt.endsWith(fileName, ".btx", true);
            }
            if (z) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        Iterable $this$sortedBy$iv = (List) destination$iv$iv;
        Iterable $this$map$iv = CollectionsKt___CollectionsKt.sortedWith($this$sortedBy$iv, new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.custom.btx.BpcArchiveRepository$listTextureEntries$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                FileHeader it = (FileHeader) t;
                String fileName2 = it.getFileName();
                Intrinsics.checkNotNullExpressionValue(fileName2, "getFileName(...)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = fileName2.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                FileHeader it2 = (FileHeader) t2;
                String fileName3 = it2.getFileName();
                Intrinsics.checkNotNullExpressionValue(fileName3, "getFileName(...)");
                Locale US2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase2 = fileName3.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                return ComparisonsKt__ComparisonsKt.compareValues(lowerCase, lowerCase2);
            }
        });
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            FileHeader header2 = (FileHeader) item$iv$iv;
            String fileName2 = header2.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName2, "getFileName(...)");
            String fileName3 = header2.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName3, "getFileName(...)");
            destination$iv$iv2.add(new BpcTextureEntry(fileName2, StringsKt__StringsKt.substringAfterLast$default(fileName3, FileSystemKt.UnixPathSeparator, (String) null, 2, (Object) null), header2.getUncompressedSize(), null, false, 24, null));
            zip = zip;
            $this$map$iv = $this$map$iv;
        }
        return (List) destination$iv$iv2;
    }

    public final boolean hasAnyTextureEntries(BpcArchiveItem archive) {
        Object objM15551constructorimpl;
        Intrinsics.checkNotNullParameter(archive, "archive");
        try {
            Result.Companion companion = Result.INSTANCE;
            BpcArchiveRepository $this$hasAnyTextureEntries_u24lambda_u245 = this;
            objM15551constructorimpl = Result.m15551constructorimpl(Boolean.valueOf(!$this$hasAnyTextureEntries_u24lambda_u245.listTextureEntries(archive).isEmpty()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
            objM15551constructorimpl = false;
        }
        return ((Boolean) objM15551constructorimpl).booleanValue();
    }

    public final byte[] readEntryBytes(BpcArchiveItem archive, String entryPath) throws IOException {
        Intrinsics.checkNotNullParameter(archive, "archive");
        Intrinsics.checkNotNullParameter(entryPath, "entryPath");
        ZipFile zip = new ZipFile(archive.getFile());
        FileHeader header = findFileHeader(zip, entryPath);
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

    public final BpcExportPayload buildEntryExport(BpcArchiveItem archive, BpcTextureEntry entry, BpcExportFormat format) throws IOException {
        Intrinsics.checkNotNullParameter(archive, "archive");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(format, "format");
        byte[] entryBytes = readEntryBytes(archive, entry.getArchivePath());
        switch (WhenMappings.$EnumSwitchMapping$0[format.ordinal()]) {
            case 1:
                return new BpcExportPayload(entry.getArchivePath(), entryBytes, "application/octet-stream");
            case 2:
                return new BpcExportPayload(StringsKt__StringsKt.substringBeforeLast(entry.getArchivePath(), '.', entry.getArchivePath()) + FileFormats.PNG_FORMAT, BtxPngConverter.INSTANCE.btxToPng(entryBytes), MimeTypes.IMAGE_PNG);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final List<BpcExportPayload> buildBulkExport(BpcArchiveItem archive, BpcExportFormat format) throws ZipException {
        Intrinsics.checkNotNullParameter(archive, "archive");
        Intrinsics.checkNotNullParameter(format, "format");
        Iterable $this$map$iv = listTextureEntries(archive);
        Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            BpcTextureEntry it = (BpcTextureEntry) item$iv$iv;
            destination$iv$iv.add(buildEntryExport(archive, it, format));
        }
        return (List) destination$iv$iv;
    }

    public final int exportAll(BpcArchiveItem archive, BpcExportFormat format, Function2<? super BpcTextureEntry, ? super BpcExportPayload, Unit> onEntry) throws ZipException {
        Intrinsics.checkNotNullParameter(archive, "archive");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(onEntry, "onEntry");
        int exported = 0;
        Iterable $this$forEach$iv = listTextureEntries(archive);
        for (Object element$iv : $this$forEach$iv) {
            BpcTextureEntry entry = (BpcTextureEntry) element$iv;
            onEntry.invoke(entry, buildEntryExport(archive, entry, format));
            exported++;
        }
        return exported;
    }

    public final void extractEntryAsBtx(BpcArchiveItem archive, BpcTextureEntry entry, File targetDirectory) throws ZipException {
        Intrinsics.checkNotNullParameter(archive, "archive");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(targetDirectory, "targetDirectory");
        if (!targetDirectory.exists() && !targetDirectory.mkdirs()) {
            throw new IllegalStateException("Не удалось создать папку экспорта: " + targetDirectory.getAbsolutePath());
        }
        if (!targetDirectory.isDirectory() || !targetDirectory.canWrite()) {
            throw new IllegalStateException("Нет доступа к папке экспорта: " + targetDirectory.getAbsolutePath());
        }
        ZipFile zip = new ZipFile(archive.getFile());
        FileHeader header = findFileHeader(zip, entry.getArchivePath());
        File targetFile = new File(targetDirectory, StringsKt__StringsJVMKt.replace$default(entry.getArchivePath(), FileSystemKt.UnixPathSeparator, File.separatorChar, false, 4, (Object) null));
        File parent = targetFile.getParentFile();
        if (parent != null && !parent.exists() && !parent.mkdirs()) {
            throw new IllegalStateException("Не удалось создать папку: " + parent.getAbsolutePath());
        }
        if (targetFile.exists() && !targetFile.delete()) {
            throw new IllegalStateException("Не удалось перезаписать файл: " + targetFile.getAbsolutePath());
        }
        zip.extractFile(header, targetDirectory.getAbsolutePath(), entry.getArchivePath());
    }

    public final void replaceEntry(BpcArchiveItem archive, final String entryPath, String sourceName, byte[] sourceBytes) throws IOException {
        Intrinsics.checkNotNullParameter(archive, "archive");
        Intrinsics.checkNotNullParameter(entryPath, "entryPath");
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        Intrinsics.checkNotNullParameter(sourceBytes, "sourceBytes");
        byte[] existingBytes = readEntryBytes(archive, entryPath);
        final byte[] outputBytes = buildArchiveBtxPayload(sourceName, sourceBytes, existingBytes);
        mutateArchive(archive, new Function1<ZipFile, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.btx.BpcArchiveRepository.replaceEntry.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ZipFile zipFile) throws ZipException {
                invoke2(zipFile);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ZipFile zip) throws ZipException {
                Intrinsics.checkNotNullParameter(zip, "zip");
                BpcArchiveRepository.this.replaceZipEntry(zip, entryPath, outputBytes);
            }
        });
    }

    public final void addEntry(BpcArchiveItem archive, final String targetEntryPath, String sourceName, byte[] sourceBytes, boolean overwrite) throws ZipException {
        byte[] bArrFirstTemplateBytes;
        Object element$iv;
        Intrinsics.checkNotNullParameter(archive, "archive");
        Intrinsics.checkNotNullParameter(targetEntryPath, "targetEntryPath");
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        Intrinsics.checkNotNullParameter(sourceBytes, "sourceBytes");
        String it = validateEntryPath(targetEntryPath);
        if (it != null) {
            throw new IllegalArgumentException(it);
        }
        ZipFile zip = new ZipFile(archive.getFile());
        Iterable fileHeaders = zip.getFileHeaders();
        Intrinsics.checkNotNullExpressionValue(fileHeaders, "getFileHeaders(...)");
        Iterable $this$firstOrNull$iv = fileHeaders;
        Iterator it2 = $this$firstOrNull$iv.iterator();
        do {
            bArrFirstTemplateBytes = null;
            if (!it2.hasNext()) {
                element$iv = null;
                break;
            }
            element$iv = it2.next();
        } while (!StringsKt__StringsJVMKt.equals(((FileHeader) element$iv).getFileName(), targetEntryPath, true));
        final FileHeader existingHeader = (FileHeader) element$iv;
        if (existingHeader != null && !overwrite) {
            throw new IllegalStateException("Entry already exists: " + targetEntryPath);
        }
        if ((!StringsKt__StringsJVMKt.endsWith(sourceName, FileFormats.PNG_FORMAT, true) && !StringsKt__StringsJVMKt.endsWith(sourceName, ".pngg", true)) || (bArrFirstTemplateBytes = firstTemplateBytes(archive)) != null) {
            byte[] templateBytes = bArrFirstTemplateBytes;
            final byte[] outputBytes = buildArchiveBtxPayload(sourceName, sourceBytes, templateBytes);
            mutateArchive(archive, new Function1<ZipFile, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.btx.BpcArchiveRepository.addEntry.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ZipFile zipFile) throws ZipException {
                    invoke2(zipFile);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ZipFile mutableZip) throws ZipException {
                    Intrinsics.checkNotNullParameter(mutableZip, "mutableZip");
                    if (existingHeader != null) {
                        mutableZip.removeFile(existingHeader);
                    }
                    this.addZipEntry(mutableZip, targetEntryPath, outputBytes);
                }
            });
            return;
        }
        throw new IllegalStateException("Archive does not contain BTX template for PNG import.");
    }

    public final boolean canAddPng(BpcArchiveItem archive) {
        Intrinsics.checkNotNullParameter(archive, "archive");
        return firstTemplateBytes(archive) != null;
    }

    public final String validateEntryPath(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String path = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsKt.trim((CharSequence) input).toString(), '\\', FileSystemKt.UnixPathSeparator, false, 4, (Object) null);
        if (path.length() == 0) {
            return "Entry path is empty.";
        }
        if (!StringsKt__StringsJVMKt.endsWith(path, ".btx", true)) {
            return "Entry path must end with .btx";
        }
        if (StringsKt__StringsJVMKt.startsWith$default(path, "/", false, 2, null)) {
            return "Entry path must not start with /";
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) path, (CharSequence) "..", false, 2, (Object) null)) {
            return "Entry path must not contain ..";
        }
        return null;
    }

    public final File backupFileFor(BpcArchiveItem archive) {
        Intrinsics.checkNotNullParameter(archive, "archive");
        File $this$backupFileFor_u24lambda_u2412 = new File(this.context.getExternalFilesDir("NEIZZIR"), "BPC_BACKUPS");
        $this$backupFileFor_u24lambda_u2412.mkdirs();
        return new File($this$backupFileFor_u24lambda_u2412, archive.getFile().getName() + ".bak");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    public final ArchiveInfo readArchiveInfo(File file) throws ZipException {
        boolean z;
        ZipFile zip = new ZipFile(file);
        Iterable fileHeaders = zip.getFileHeaders();
        Intrinsics.checkNotNull(fileHeaders);
        Iterable $this$count$iv = fileHeaders;
        int i = 0;
        if (!($this$count$iv instanceof Collection) || !((Collection) $this$count$iv).isEmpty()) {
            int count$iv = 0;
            for (Object element$iv : $this$count$iv) {
                FileHeader it = (FileHeader) element$iv;
                if (it.isDirectory()) {
                    z = false;
                } else {
                    String fileName = it.getFileName();
                    Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                    if (StringsKt__StringsJVMKt.endsWith(fileName, ".btx", true)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z && (count$iv = count$iv + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
            i = count$iv;
        }
        int count = i;
        return new ArchiveInfo(count, true);
    }

    private final byte[] firstTemplateBytes(BpcArchiveItem archive) {
        BpcTextureEntry firstTexture = (BpcTextureEntry) CollectionsKt___CollectionsKt.firstOrNull((List) listTextureEntries(archive));
        if (firstTexture == null) {
            return null;
        }
        return readEntryBytes(archive, firstTexture.getArchivePath());
    }

    private final byte[] buildArchiveBtxPayload(String sourceName, byte[] sourceBytes, byte[] templateBytes) {
        if (StringsKt__StringsJVMKt.endsWith(sourceName, ".btx", true)) {
            return sourceBytes;
        }
        if (StringsKt__StringsJVMKt.endsWith(sourceName, FileFormats.PNG_FORMAT, true) || StringsKt__StringsJVMKt.endsWith(sourceName, ".pngg", true)) {
            return BtxPngConverter.INSTANCE.pngToBtx(sourceBytes, templateBytes);
        }
        throw new IllegalArgumentException("Unsupported import format: " + sourceName);
    }

    private final void mutateArchive(BpcArchiveItem archive, Function1<? super ZipFile, Unit> action) {
        File backupFile = backupFileFor(archive);
        File parentFile = archive.getFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        File parentFile2 = backupFile.getParentFile();
        if (parentFile2 != null) {
            parentFile2.mkdirs();
        }
        FilesKt__UtilsKt.copyTo$default(archive.getFile(), backupFile, true, 0, 4, null);
        try {
            ZipFile zip = new ZipFile(archive.getFile());
            action.invoke(zip);
        } catch (Throwable t) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Result.m15551constructorimpl(FilesKt__UtilsKt.copyTo$default(backupFile, archive.getFile(), true, 0, 4, null));
                throw t;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m15551constructorimpl(ResultKt.createFailure(th));
                throw t;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void replaceZipEntry(ZipFile zip, String entryPath, byte[] bytes) throws ZipException {
        FileHeader existing = findFileHeader(zip, entryPath);
        zip.removeFile(existing);
        addZipEntry(zip, entryPath, bytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addZipEntry(ZipFile zip, String entryPath, byte[] bytes) {
        ZipParameters params = new ZipParameters();
        params.setFileNameInZip(entryPath);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ByteArrayInputStream input = byteArrayInputStream;
            zip.addStream(input, params);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(byteArrayInputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(byteArrayInputStream, th);
                throw th2;
            }
        }
    }

    private final FileHeader findFileHeader(ZipFile zip, String entryPath) throws ZipException {
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
        throw new ZipException("Entry not found in archive: " + entryPath);
    }

    /* JADX INFO: compiled from: BpcArchiveRepository.kt */
    @Metadata(m4415d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcArchiveRepository$ArchiveInfo;", "", "textureCount", "", "supported", "", "(IZ)V", "getSupported", "()Z", "getTextureCount", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final /* data */ class ArchiveInfo {
        private final boolean supported;
        private final int textureCount;

        public static /* synthetic */ ArchiveInfo copy$default(ArchiveInfo archiveInfo, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = archiveInfo.textureCount;
            }
            if ((i2 & 2) != 0) {
                z = archiveInfo.supported;
            }
            return archiveInfo.copy(i, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTextureCount() {
            return this.textureCount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getSupported() {
            return this.supported;
        }

        public final ArchiveInfo copy(int textureCount, boolean supported) {
            return new ArchiveInfo(textureCount, supported);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ArchiveInfo)) {
                return false;
            }
            ArchiveInfo archiveInfo = (ArchiveInfo) other;
            return this.textureCount == archiveInfo.textureCount && this.supported == archiveInfo.supported;
        }

        public int hashCode() {
            return (Integer.hashCode(this.textureCount) * 31) + Boolean.hashCode(this.supported);
        }

        public String toString() {
            return "ArchiveInfo(textureCount=" + this.textureCount + ", supported=" + this.supported + ')';
        }

        public ArchiveInfo(int textureCount, boolean supported) {
            this.textureCount = textureCount;
            this.supported = supported;
        }

        public final int getTextureCount() {
            return this.textureCount;
        }

        public final boolean getSupported() {
            return this.supported;
        }
    }
}
