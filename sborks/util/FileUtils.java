package com.blackhub.bronline.neizzir.fragments.sborks.util;

import android.content.Context;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.neizzir.activities.main.util.ResourceFileSafety;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.helpshift.proactive.InAppViewConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.ByteStreamsKt;
import kotlin.p040io.CloseableKt;
import kotlin.p040io.FilesKt;

/* JADX INFO: compiled from: FileUtils.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006J \u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006J\u001e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019¨\u0006\u001a"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/util/FileUtils;", "", "()V", "copyPack", "", "source", "Ljava/io/File;", FirebaseAnalytics.Param.DESTINATION, "deleteFile", "file", "deleteFolder", "folder", "deleteSborks2", "context", "Landroid/content/Context;", "onDone", "Lkotlin/Function0;", "deleteSpecificFilesAndFolders", "externalFilesParent", "moveFolder", "dest", "moveRawToExternal", "rawResId", "", "outName", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class FileUtils {
    public static final FileUtils INSTANCE = new FileUtils();

    private FileUtils() {
    }

    public final File externalFilesParent(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            return externalFilesDir.getParentFile();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void deleteSborks2$default(FileUtils fileUtils, Context context, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        fileUtils.deleteSborks2(context, function0);
    }

    public final void deleteSborks2(Context context, Function0<Unit> onDone) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            File parent = externalFilesParent(context);
            if (parent == null) {
                if (onDone != null) {
                    onDone.invoke();
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                return;
            }
            File sborks2 = new File(parent, "sborks2");
            if (sborks2.exists()) {
                File[] fileArrListFiles = sborks2.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        Intrinsics.checkNotNull(file);
                        FilesKt.deleteRecursively(file);
                    }
                }
                sborks2.delete();
            }
            if (onDone != null) {
                onDone.invoke();
            }
        } catch (Exception e) {
        }
    }

    public final void moveFolder(File source, File dest) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        ResourceFileSafety.INSTANCE.requireCompletePack(source);
        File parentFile = dest.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        File previous = new File(dest.getParentFile(), dest.getName() + ".previous");
        if (previous.exists()) {
            throw new IOException("Сначала восстановите резервную сборку: " + previous.getName());
        }
        if (dest.exists() && !dest.renameTo(previous)) {
            throw new IOException("Не удалось сохранить предыдущую сборку: " + dest.getName());
        }
        if (!source.renameTo(dest)) {
            if (previous.exists() && !previous.renameTo(dest)) {
                throw new IOException("Не удалось переместить сборку; предыдущая сохранена в " + previous.getPath());
            }
            throw new IOException("Не удалось переместить сборку: " + source.getName());
        }
        FilesKt.deleteRecursively(previous);
    }

    public final void copyPack(File source, File destination) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (source.isDirectory()) {
            if (!destination.isDirectory() && !destination.mkdirs()) {
                throw new IOException("Не удалось создать " + destination.getPath());
            }
            File[] fileArrListFiles = source.listFiles();
            if (fileArrListFiles == null) {
                throw new IOException("Не удалось прочитать " + source.getPath());
            }
            for (File file : fileArrListFiles) {
                FileUtils fileUtils = INSTANCE;
                Intrinsics.checkNotNull(file);
                fileUtils.copyPack(file, new File(destination, file.getName()));
            }
            return;
        }
        long size = source.length();
        if (!source.isFile() || size <= 0) {
            throw new IOException("Пустой файл сборки: " + source.getPath());
        }
        File temporary = File.createTempFile(".sbork-", ".tmp", destination.getParentFile());
        try {
            FileInputStream fileInputStream = new FileInputStream(source);
            try {
                FileInputStream input = fileInputStream;
                FileOutputStream fileOutputStream = new FileOutputStream(temporary);
                try {
                    FileOutputStream output = fileOutputStream;
                    ByteStreamsKt.copyTo$default(input, output, 0, 2, null);
                    output.getFD().sync();
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                    Unit unit2 = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    if (temporary.length() != size || source.length() != size) {
                        throw new IOException("Не удалось полностью скопировать " + source.getName());
                    }
                    if (!temporary.renameTo(destination)) {
                        throw new IOException("Не удалось установить " + source.getName());
                    }
                    temporary.delete();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(fileInputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            temporary.delete();
            throw th5;
        }
    }

    public final void deleteSpecificFilesAndFolders(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File efd = context.getExternalFilesDir(null);
        if (efd == null) {
            return;
        }
        deleteFile(new File(efd, "audio/GENERIC.bpcmeta"));
        deleteFolder(new File(efd, "anim"));
        deleteFolder(new File(efd, "data"));
        deleteFolder(new File(efd, InAppViewConstants.FONTS));
        deleteFolder(new File(efd, "rml"));
        deleteFolder(new File(efd, "NEIZZIR"));
        moveRawToExternal(context, C3715R.raw.common, "common.bpc");
        moveRawToExternal(context, C3715R.raw.generic, "audio/samples/GENERIC.bpc");
    }

    public final void moveRawToExternal(Context context, int rawResId, String outName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(outName, "outName");
        File efd = context.getExternalFilesDir(null);
        if (efd == null) {
            return;
        }
        File out = new File(efd, outName);
        File parentFile = out.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(rawResId);
        try {
            InputStream input = inputStreamOpenRawResource;
            FileOutputStream fileOutputStream = new FileOutputStream(out);
            try {
                FileOutputStream output = fileOutputStream;
                Intrinsics.checkNotNull(input);
                ByteStreamsKt.copyTo$default(input, output, 0, 2, null);
                CloseableKt.closeFinally(fileOutputStream, null);
                CloseableKt.closeFinally(inputStreamOpenRawResource, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.closeFinally(inputStreamOpenRawResource, th3);
                throw th4;
            }
        }
    }

    public final void deleteFolder(File folder) {
        Intrinsics.checkNotNullParameter(folder, "folder");
        if (!folder.exists() || !folder.isDirectory()) {
            return;
        }
        FilesKt.deleteRecursively(folder);
    }

    public final void deleteFile(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists() || !file.isFile()) {
            return;
        }
        file.delete();
    }
}
