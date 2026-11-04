package com.blackhub.bronline.neizzir.fragments.sborks.media;

import android.media.MediaPlayer;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SoundPlayer.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/media/SoundPlayer;", "", "()V", "isPlaying", "", "playSequential", "", "urls", "", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class SoundPlayer {
    public static final SoundPlayer INSTANCE = new SoundPlayer();
    private static volatile boolean isPlaying;

    private SoundPlayer() {
    }

    public final void playSequential(final List<String> urls) {
        Intrinsics.checkNotNullParameter(urls, "urls");
        if (isPlaying) {
            Log.d("SoundDebug", "Already playing. Skip.");
        } else {
            isPlaying = true;
            new Thread(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.media.SoundPlayer$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    SoundPlayer.playSequential$lambda$1(urls);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playSequential$lambda$1(List urls) {
        Intrinsics.checkNotNullParameter(urls, "$urls");
        try {
            Iterator it = urls.iterator();
            while (it.hasNext()) {
                String url = (String) it.next();
                Log.d("SoundDebug", "Play: " + url);
                final MediaPlayer mp = new MediaPlayer();
                final CountDownLatch latch = new CountDownLatch(1);
                mp.setDataSource(url);
                mp.prepare();
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.media.SoundPlayer$$ExternalSyntheticLambda0
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        SoundPlayer.playSequential$lambda$1$lambda$0(mp, latch, mediaPlayer);
                    }
                });
                latch.await();
            }
        } catch (Exception e) {
        } catch (Throwable th) {
            isPlaying = false;
            throw th;
        }
        isPlaying = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playSequential$lambda$1$lambda$0(MediaPlayer mp, CountDownLatch latch, MediaPlayer it) {
        Intrinsics.checkNotNullParameter(mp, "$mp");
        Intrinsics.checkNotNullParameter(latch, "$latch");
        mp.release();
        latch.countDown();
    }
}
