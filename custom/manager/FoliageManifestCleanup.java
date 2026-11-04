package com.blackhub.bronline.neizzir.fragments.custom.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FoliageManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¨\u0006\t"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageManifestCleanup;", "", "()V", "entriesToRemove", "", "", "recordedEntries", "existingEntries", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class FoliageManifestCleanup {
    public static final FoliageManifestCleanup INSTANCE = new FoliageManifestCleanup();

    private FoliageManifestCleanup() {
    }

    public final List<String> entriesToRemove(List<String> recordedEntries, Collection<String> existingEntries) {
        Intrinsics.checkNotNullParameter(recordedEntries, "recordedEntries");
        Intrinsics.checkNotNullParameter(existingEntries, "existingEntries");
        LinkedHashMap existingByLower = new LinkedHashMap(existingEntries.size());
        for (String entry : existingEntries) {
            String normalized = FoliageManagerKt.normalizeZipEntryName(entry);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = normalized.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            existingByLower.putIfAbsent(lowerCase, normalized);
        }
        ArrayList result = new ArrayList(recordedEntries.size());
        HashSet seen = new HashSet();
        for (String entry2 : recordedEntries) {
            String strNormalizeZipEntryName = FoliageManagerKt.normalizeZipEntryName(entry2);
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String key = strNormalizeZipEntryName.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(key, "toLowerCase(...)");
            String actual = (String) existingByLower.get(key);
            if (actual != null && seen.add(key)) {
                result.add(actual);
            }
        }
        return result;
    }
}
