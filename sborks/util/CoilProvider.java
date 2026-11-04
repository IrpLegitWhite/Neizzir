package com.blackhub.bronline.neizzir.fragments.sborks.util;

import android.content.Context;
import coil.ImageLoader;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoilProvider.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/util/CoilProvider;", "", "()V", "get", "Lcoil/ImageLoader;", "context", "Landroid/content/Context;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class CoilProvider {
    public static final CoilProvider INSTANCE = new CoilProvider();

    private CoilProvider() {
    }

    public final ImageLoader get(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return NetworkRuntime.INSTANCE.getImageLoader();
    }
}
