package com.blackhub.bronline.neizzir.gui.editor;

import android.content.Context;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.ByteStreamsKt;
import kotlin.p040io.CloseableKt;
import kotlin.p040io.FilesKt__UtilsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.p044io.inputstream.ZipInputStream;

/* JADX INFO: compiled from: GuiBpcRepository.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0006J\u0006\u0010\u0019\u001a\u00020\u0012J\u0006\u0010\u001a\u001a\u00020\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiBpcRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "guiFile", "Ljava/io/File;", "(Ljava/io/File;)V", "backupTo", "directory", "exists", "", "file", "findHeader", "Lnet/lingala/zip4j/model/FileHeader;", "zip", "Lnet/lingala/zip4j/ZipFile;", "entryName", "", "readHudXaml", "replaceHudXaml", "", "xaml", "restoreFrom", "backup", "sha256OrEmpty", "validate", "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class GuiBpcRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String GUI_BPC_NAME = "gui.bpc";
    public static final String HUD_XAML_ENTRY = "Hud/NewHud.xaml";
    private final File guiFile;

    public GuiBpcRepository(File guiFile) {
        Intrinsics.checkNotNullParameter(guiFile, "guiFile");
        this.guiFile = guiFile;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuiBpcRepository(Context context) {
        this(new File(context.getExternalFilesDir(null), GUI_BPC_NAME));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: file, reason: from getter */
    public final File getGuiFile() {
        return this.guiFile;
    }

    public final boolean exists() {
        return this.guiFile.isFile();
    }

    public final void validate() throws ZipException {
        if (!this.guiFile.isFile()) {
            throw new IllegalStateException("Не найден gui.bpc: " + this.guiFile.getAbsolutePath());
        }
        ZipFile zip = new ZipFile(this.guiFile);
        if (!zip.isValidZipFile()) {
            throw new IllegalStateException("gui.bpc поврежден или не является ZIP/BPC архивом.");
        }
        findHeader(zip, HUD_XAML_ENTRY);
    }

    public final String readHudXaml() throws IOException {
        validate();
        ZipFile zip = new ZipFile(this.guiFile);
        FileHeader header = findHeader(zip, HUD_XAML_ENTRY);
        ZipInputStream inputStream = zip.getInputStream(header);
        try {
            ZipInputStream input = inputStream;
            Intrinsics.checkNotNull(input);
            String str = new String(ByteStreamsKt.readBytes(input), Charsets.UTF_8);
            CloseableKt.closeFinally(inputStream, null);
            return str;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(inputStream, th);
                throw th2;
            }
        }
    }

    public final void replaceHudXaml(String xaml) throws ZipException {
        Intrinsics.checkNotNullParameter(xaml, "xaml");
        validate();
        ZipFile zip = new ZipFile(this.guiFile);
        FileHeader existing = findHeader(zip, HUD_XAML_ENTRY);
        zip.removeFile(existing);
        ZipParameters $this$replaceHudXaml_u24lambda_u241 = new ZipParameters();
        $this$replaceHudXaml_u24lambda_u241.setFileNameInZip(HUD_XAML_ENTRY);
        byte[] bytes = xaml.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ByteArrayInputStream input = byteArrayInputStream;
            zip.addStream(input, $this$replaceHudXaml_u24lambda_u241);
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

    public final File backupTo(File directory) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        if (!this.guiFile.isFile()) {
            throw new IllegalStateException("Не найден gui.bpc для backup.");
        }
        directory.mkdirs();
        File backup = new File(directory, GUI_BPC_NAME);
        FilesKt__UtilsKt.copyTo$default(this.guiFile, backup, true, 0, 4, null);
        return backup;
    }

    public final void restoreFrom(File backup) {
        Intrinsics.checkNotNullParameter(backup, "backup");
        if (backup.isFile()) {
            File parentFile = this.guiFile.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FilesKt__UtilsKt.copyTo$default(backup, this.guiFile, true, 0, 4, null);
        }
    }

    public final String sha256OrEmpty() {
        return this.guiFile.isFile() ? INSTANCE.sha256(this.guiFile) : "";
    }

    private final FileHeader findHeader(ZipFile zip, String entryName) throws ZipException {
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
        } while (!StringsKt__StringsJVMKt.equals(it.getFileName(), entryName, true));
        FileHeader fileHeader = (FileHeader) element$iv;
        if (fileHeader != null) {
            return fileHeader;
        }
        throw new ZipException("Entry не найден в gui.bpc: " + entryName);
    }

    /* JADX INFO: compiled from: GuiBpcRepository.kt */
    @Metadata(m4415d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiBpcRepository$Companion;", "", "()V", "GUI_BPC_NAME", "", "HUD_XAML_ENTRY", "sha256", "file", "Ljava/io/File;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String sha256(File file) throws NoSuchAlgorithmException {
            Intrinsics.checkNotNullParameter(file, "file");
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileInputStream input = fileInputStream;
                byte[] buffer = new byte[8192];
                while (true) {
                    int read = input.read(buffer);
                    if (read <= 0) {
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileInputStream, null);
                        byte[] bArrDigest = digest.digest();
                        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                        return ArraysKt___ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiBpcRepository$Companion$sha256$2
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
                    digest.update(buffer, 0, read);
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
    }
}
