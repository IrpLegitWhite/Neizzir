package com.blackhub.bronline.neizzir.fragments.custom.btx;

import android.content.Context;
import com.blackhub.bronline.game.core.constants.FileFormats;
import com.blackhub.bronline.neizzir.converter.BtxPngConverter;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.FilesKt;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: BpcPreviewRepository.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ$\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcPreviewRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "invalidateArchive", "", "archive", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcArchiveItem;", "loadPreview", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/PreviewState;", "entry", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcTextureEntry;", "entryBytesProvider", "Lkotlin/Function0;", "", "previewDirForArchive", "Ljava/io/File;", "previewFileFor", "sha256", "", "value", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class BpcPreviewRepository {
    private final Context context;

    public BpcPreviewRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final PreviewState loadPreview(BpcArchiveItem archive, BpcTextureEntry entry, Function0<byte[]> entryBytesProvider) {
        Intrinsics.checkNotNullParameter(archive, "archive");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(entryBytesProvider, "entryBytesProvider");
        try {
            File previewFile = previewFileFor(archive, entry);
            if (!previewFile.exists()) {
                File parentFile = previewFile.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FilesKt.writeBytes(previewFile, BtxPngConverter.INSTANCE.btxToPng(entryBytesProvider.invoke()));
            }
            return new PreviewState.Ready(previewFile);
        } catch (Throwable t) {
            String message = t.getMessage();
            if (message == null) {
                message = "preview decode failed";
            }
            return new PreviewState.Failed(message);
        }
    }

    public final void invalidateArchive(BpcArchiveItem archive) {
        Intrinsics.checkNotNullParameter(archive, "archive");
        FilesKt.deleteRecursively(previewDirForArchive(archive));
    }

    private final File previewFileFor(BpcArchiveItem archive, BpcTextureEntry entry) throws NoSuchAlgorithmException {
        String entryKey = sha256(CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{archive.getFile().getAbsolutePath(), String.valueOf(archive.getLastModified()), String.valueOf(archive.getSizeBytes()), entry.getArchivePath(), String.valueOf(entry.getSizeBytes())}), "|", null, null, 0, null, null, 62, null));
        return new File(previewDirForArchive(archive), entryKey + FileFormats.PNG_FORMAT);
    }

    private final File previewDirForArchive(BpcArchiveItem archive) throws NoSuchAlgorithmException {
        String absolutePath = archive.getFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        String archiveKey = sha256(absolutePath);
        return new File(this.context.getCacheDir(), "bpc_tool/previews/" + archiveKey);
    }

    private final String sha256(String value) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = value.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        StringBuilder $this$sha256_u24lambda_u241 = new StringBuilder(digest.length * 2);
        Intrinsics.checkNotNull(digest);
        for (byte element$iv : digest) {
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(element$iv)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            $this$sha256_u24lambda_u241.append(str);
        }
        String string = $this$sha256_u24lambda_u241.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
