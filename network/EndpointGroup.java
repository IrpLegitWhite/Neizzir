package com.blackhub.bronline.neizzir.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: NetworkModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/EndpointGroup;", "", "endpoints", "", "Lcom/blackhub/bronline/neizzir/network/Endpoint;", "(Ljava/lang/String;ILjava/util/List;)V", "getEndpoints", "()Ljava/util/List;", "KOLSON", "PATCH_INDEX", "PRESENCE_HTTP", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public enum EndpointGroup {
    KOLSON(CollectionsKt__CollectionsKt.listOf((Object[]) new Endpoint[]{new Endpoint("cdn", "https://cdn.kolson.online"), new Endpoint("cdnru", "https://cdnru.kolson.online")})),
    PATCH_INDEX(CollectionsKt__CollectionsKt.listOf((Object[]) new Endpoint[]{new Endpoint("blackcdn", "https://dl.blackcdn.me"), new Endpoint("br-dl", "https://rsv.br-dl.com")})),
    PRESENCE_HTTP(CollectionsKt__CollectionsKt.listOf((Object[]) new Endpoint[]{new Endpoint("presence-ru", "http://85.193.87.60:5012"), new Endpoint("presence-eu", "http://162.19.254.18:5012")}));

    private final List<Endpoint> endpoints;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<EndpointGroup> getEntries() {
        return $ENTRIES;
    }

    EndpointGroup(List endpoints) {
        this.endpoints = endpoints;
    }

    public final List<Endpoint> getEndpoints() {
        return this.endpoints;
    }
}
