package com.blackhub.bronline.neizzir.fragments.custom.sounds;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.p043io.files.FileSystemKt;

/* JADX INFO: compiled from: SoundPreviewPlayer.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0014\u001a\u00020\u0004J0\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundPreviewPlayer;", "", "onError", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "<set-?>", "", "activeKey", "getActiveKey", "()Ljava/lang/String;", "handler", "Landroid/os/Handler;", "player", "Landroid/media/MediaPlayer;", "resetIcon", "resolverJob", "Lkotlinx/coroutines/Job;", "timeout", "Ljava/lang/Runnable;", "stop", "toggle", "key", "sources", "", "onState", "Lkotlin/Function1;", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class SoundPreviewPlayer {
    private String activeKey;
    private final Handler handler;
    private final Function0<Unit> onError;
    private MediaPlayer player;
    private Function0<Unit> resetIcon;
    private Job resolverJob;
    private final Runnable timeout;

    public SoundPreviewPlayer(Function0<Unit> onError) {
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.onError = onError;
        this.handler = new Handler(Looper.getMainLooper());
        this.timeout = new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundPreviewPlayer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SoundPreviewPlayer.timeout$lambda$0(this.f$0);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void timeout$lambda$0(SoundPreviewPlayer this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.stop();
        this$0.onError.invoke();
    }

    public final String getActiveKey() {
        return this.activeKey;
    }

    public final void stop() {
        Unit unit;
        this.handler.removeCallbacks(this.timeout);
        Job job = this.resolverJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.resolverJob = null;
        MediaPlayer old = this.player;
        this.player = null;
        this.activeKey = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            SoundPreviewPlayer soundPreviewPlayer = this;
            if (old != null) {
                old.release();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m15551constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m15551constructorimpl(ResultKt.createFailure(th));
        }
        Function0<Unit> function0 = this.resetIcon;
        if (function0 != null) {
            function0.invoke();
        }
        this.resetIcon = null;
    }

    public final void toggle(String key, List<String> sources, final Function1<? super Boolean, Unit> onState) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(onState, "onState");
        boolean wasActive = Intrinsics.areEqual(this.activeKey, key);
        stop();
        if (wasActive || sources.isEmpty()) {
            return;
        }
        this.activeKey = key;
        this.resetIcon = new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundPreviewPlayer.toggle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                onState.invoke(false);
            }
        };
        onState.invoke(true);
        Ref.IntRef index = new Ref.IntRef();
        toggle$next(this, key, index, sources);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggle$next(SoundPreviewPlayer this$0, String $key, Ref.IntRef index, List<String> list) {
        if (Intrinsics.areEqual(this$0.activeKey, $key)) {
            if (index.element >= list.size()) {
                this$0.stop();
                return;
            }
            String relativePath = StringsKt__StringsKt.trimStart(list.get(index.element), FileSystemKt.UnixPathSeparator);
            String routePath = "/api/fetch_file/" + relativePath;
            this$0.resolverJob = BuildersKt__Builders_commonKt.launch$default(NetworkRuntime.INSTANCE.getApplicationScope(), null, null, new SoundPreviewPlayer$toggle$next$1(routePath, this$0, $key, index, list, null), 3, null);
        }
    }
}
