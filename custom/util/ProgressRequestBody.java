package com.blackhub.bronline.neizzir.fragments.custom.util;

import com.helpshift.HelpshiftEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.CloseableKt;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* JADX INFO: compiled from: ProgressRequestBody.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00126\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\u0010\u000eJ\b\u0010\f\u001a\u00020\bH\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R>\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/util/ProgressRequestBody;", "Lokhttp3/RequestBody;", "file", "Ljava/io/File;", HelpshiftEvent.DATA_CONTENT_TYPE, "Lokhttp3/MediaType;", "progressCallback", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "bytesWritten", "contentLength", "", "(Ljava/io/File;Lokhttp3/MediaType;Lkotlin/jvm/functions/Function2;)V", "writeTo", "sink", "Lokio/BufferedSink;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class ProgressRequestBody extends RequestBody {
    private final MediaType contentType;
    private final File file;
    private final Function2<Long, Long, Unit> progressCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public ProgressRequestBody(File file, MediaType contentType, Function2<? super Long, ? super Long, Unit> progressCallback) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(progressCallback, "progressCallback");
        this.file = file;
        this.contentType = contentType;
        this.progressCallback = progressCallback;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public MediaType getContentType() {
        return this.contentType;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        return this.file.length();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long length = contentLength();
        byte[] buffer = new byte[8192];
        long uploaded = 0;
        FileInputStream fileInputStream = new FileInputStream(this.file);
        try {
            FileInputStream input = fileInputStream;
            while (true) {
                int it = input.read(buffer);
                if (it == -1) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    return;
                } else {
                    sink.write(buffer, 0, it);
                    uploaded += (long) it;
                    this.progressCallback.invoke(Long.valueOf(uploaded), Long.valueOf(length));
                }
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
