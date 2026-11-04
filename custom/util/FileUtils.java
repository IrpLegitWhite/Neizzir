package com.blackhub.bronline.neizzir.fragments.custom.util;

import android.app.ProgressDialog;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.helpshift.HelpshiftEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.ByteStreamsKt;
import kotlin.p040io.CloseableKt;

/* JADX INFO: compiled from: FileUtils.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\b¨\u0006\u0010"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/util/FileUtils;", "", "()V", "copyRawFileToExternalStorage", "", "context", "Landroid/content/Context;", "rawResId", "", HelpshiftEvent.DATA_FILE_NAME, "", "showProgressDialog", "Landroid/app/ProgressDialog;", "ctx", NotificationCompat.CATEGORY_MESSAGE, "max", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class FileUtils {
    public static final FileUtils INSTANCE = new FileUtils();

    private FileUtils() {
    }

    public final void copyRawFileToExternalStorage(Context context, int rawResId, String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        File out = new File(context.getExternalFilesDir(null), fileName);
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

    public final ProgressDialog showProgressDialog(Context ctx, String msg, int max) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(msg, "msg");
        ProgressDialog $this$showProgressDialog_u24lambda_u242 = new ProgressDialog(ctx);
        $this$showProgressDialog_u24lambda_u242.setMessage(msg);
        $this$showProgressDialog_u24lambda_u242.setCancelable(false);
        $this$showProgressDialog_u24lambda_u242.setProgressStyle(1);
        $this$showProgressDialog_u24lambda_u242.setMax(max);
        $this$showProgressDialog_u24lambda_u242.show();
        return $this$showProgressDialog_u24lambda_u242;
    }
}
