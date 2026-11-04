package com.blackhub.bronline.neizzir.fragments.sborks.config;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: ApiConfig.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/config/ApiConfig;", "", "()V", "API_BASES", "", "", "getAPI_BASES", "()Ljava/util/List;", "CONTENT_BASES", "getCONTENT_BASES", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class ApiConfig {
    public static final ApiConfig INSTANCE = new ApiConfig();
    private static final List<String> CONTENT_BASES = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"https://cdn.kolson.online", "https://cdnru.kolson.online"});
    private static final List<String> API_BASES = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"https://cdnru.kolson.online/api", "https://cdn.kolson.online/api"});

    private ApiConfig() {
    }

    public final List<String> getCONTENT_BASES() {
        return CONTENT_BASES;
    }

    public final List<String> getAPI_BASES() {
        return API_BASES;
    }
}
