package com.blackhub.bronline.neizzir.video;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoPlayerManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/video/VideoPlayerManager;", "", "()V", "onDestroy", "", "showVideo", "context", "Landroid/content/Context;", "videoKey", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class VideoPlayerManager {
    public static final VideoPlayerManager INSTANCE = new VideoPlayerManager();

    private VideoPlayerManager() {
    }

    public final void showVideo(Context context, String videoKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoKey, "videoKey");
        VideoPlayerActivity.INSTANCE.start(context, videoKey);
    }

    public final void onDestroy() {
    }
}
