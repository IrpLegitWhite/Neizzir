package com.blackhub.bronline.neizzir.fragments.sborks.network;

import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import kotlin.Metadata;
import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: NetworkClient.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/network/NetworkClient;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "downloadClient", "getDownloadClient", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class NetworkClient {
    public static final NetworkClient INSTANCE = new NetworkClient();

    private NetworkClient() {
    }

    public final OkHttpClient getClient() {
        return NetworkRuntime.INSTANCE.getApiClient();
    }

    public final OkHttpClient getDownloadClient() {
        return NetworkRuntime.INSTANCE.getDownloadClient();
    }
}
