package com.blackhub.bronline.neizzir.fragments.sborks.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: DateUtils.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/util/DateUtils;", "", "()V", "isUpdateAvailable", "", "localFolder", "Ljava/io/File;", "updateDate", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class DateUtils {
    public static final DateUtils INSTANCE = new DateUtils();

    private DateUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Type inference failed for: r6v9, types: [kotlin.collections.IntIterator] */
    public final boolean isUpdateAvailable(File localFolder, String updateDate) {
        Date serverDate;
        long localLast;
        Intrinsics.checkNotNullParameter(localFolder, "localFolder");
        Intrinsics.checkNotNullParameter(updateDate, "updateDate");
        SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault());
        f.setTimeZone(TimeZone.getTimeZone("Europe/Moscow"));
        Long lValueOf = null;
        try {
            serverDate = f.parse(updateDate);
        } catch (Exception e) {
            serverDate = null;
        }
        File[] fileArrListFiles = localFolder.listFiles();
        if (fileArrListFiles == null) {
            localLast = 0;
        } else {
            if (!(fileArrListFiles.length == 0)) {
                File it = fileArrListFiles[0];
                lValueOf = Long.valueOf(it.lastModified());
                ?? it2 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(fileArrListFiles)).iterator();
                while (it2.hasNext()) {
                    File it3 = fileArrListFiles[it2.nextInt()];
                    Long lValueOf2 = Long.valueOf(it3.lastModified());
                    if (lValueOf.compareTo(lValueOf2) < 0) {
                        lValueOf = lValueOf2;
                    }
                }
            }
            Long l = lValueOf;
            if (l != null) {
                localLast = l.longValue();
            } else {
                localLast = 0;
            }
        }
        if (serverDate == null) {
            return false;
        }
        long it4 = serverDate.getTime();
        return it4 > localLast;
    }
}
