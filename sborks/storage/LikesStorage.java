package com.blackhub.bronline.neizzir.fragments.sborks.storage;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LikesStorage.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/storage/LikesStorage;", "", "()V", "KEY", "", "PREF", "getLiked", "", "context", "Landroid/content/Context;", "saveLiked", "", "liked", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class LikesStorage {
    public static final LikesStorage INSTANCE = new LikesStorage();
    private static final String KEY = "liked_folders";
    private static final String PREF = "app_prefs";

    private LikesStorage() {
    }

    public final Set<String> getLiked(Context context) {
        Set<String> mutableSet;
        Intrinsics.checkNotNullParameter(context, "context");
        Set<String> stringSet = context.getSharedPreferences(PREF, 0).getStringSet(KEY, new LinkedHashSet());
        return (stringSet == null || (mutableSet = CollectionsKt___CollectionsKt.toMutableSet(stringSet)) == null) ? new LinkedHashSet() : mutableSet;
    }

    public final void saveLiked(Context context, Set<String> liked) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(liked, "liked");
        context.getSharedPreferences(PREF, 0).edit().putStringSet(KEY, liked).apply();
    }
}
