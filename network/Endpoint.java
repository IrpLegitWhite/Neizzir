package com.blackhub.bronline.neizzir.network;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NetworkModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/Endpoint;", "", "id", "", "baseUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getBaseUrl", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class Endpoint {
    private final String baseUrl;
    private final String id;

    public static /* synthetic */ Endpoint copy$default(Endpoint endpoint, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = endpoint.id;
        }
        if ((i & 2) != 0) {
            str2 = endpoint.baseUrl;
        }
        return endpoint.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final Endpoint copy(String id, String baseUrl) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        return new Endpoint(id, baseUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Endpoint)) {
            return false;
        }
        Endpoint endpoint = (Endpoint) other;
        return Intrinsics.areEqual(this.id, endpoint.id) && Intrinsics.areEqual(this.baseUrl, endpoint.baseUrl);
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.baseUrl.hashCode();
    }

    public String toString() {
        return "Endpoint(id=" + this.id + ", baseUrl=" + this.baseUrl + ')';
    }

    public Endpoint(String id, String baseUrl) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        this.id = id;
        this.baseUrl = baseUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }
}
