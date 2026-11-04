package com.blackhub.bronline.neizzir.fragments.custom.sounds;

import android.media.MediaPlayer;
import android.os.Handler;
import com.blackhub.bronline.neizzir.network.Endpoint;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: SoundPreviewPlayer.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundPreviewPlayer$toggle$next$1", m4426f = "SoundPreviewPlayer.kt", m4427i = {0}, m4428l = {48}, m4429m = "invokeSuspend", m4430n = {"$this$launch"}, m4431s = {"L$0"})
final class SoundPreviewPlayer$toggle$next$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.IntRef $index;
    final /* synthetic */ String $key;
    final /* synthetic */ String $routePath;
    final /* synthetic */ List<String> $sources;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SoundPreviewPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SoundPreviewPlayer$toggle$next$1(String str, SoundPreviewPlayer soundPreviewPlayer, String str2, Ref.IntRef intRef, List<String> list, Continuation<? super SoundPreviewPlayer$toggle$next$1> continuation) {
        super(2, continuation);
        this.$routePath = str;
        this.this$0 = soundPreviewPlayer;
        this.$key = str2;
        this.$index = intRef;
        this.$sources = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SoundPreviewPlayer$toggle$next$1 soundPreviewPlayer$toggle$next$1 = new SoundPreviewPlayer$toggle$next$1(this.$routePath, this.this$0, this.$key, this.$index, this.$sources, continuation);
        soundPreviewPlayer$toggle$next$1.L$0 = obj;
        return soundPreviewPlayer$toggle$next$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SoundPreviewPlayer$toggle$next$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) throws Throwable {
        SoundPreviewPlayer$toggle$next$1 soundPreviewPlayer$toggle$next$1;
        CoroutineScope $this$launch;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                soundPreviewPlayer$toggle$next$1 = this;
                CoroutineScope $this$launch2 = (CoroutineScope) soundPreviewPlayer$toggle$next$1.L$0;
                soundPreviewPlayer$toggle$next$1.L$0 = $this$launch2;
                soundPreviewPlayer$toggle$next$1.label = 1;
                Object objResolveEndpointForDownload = NetworkRuntime.INSTANCE.getRouter().resolveEndpointForDownload(EndpointGroup.KOLSON, soundPreviewPlayer$toggle$next$1.$routePath, soundPreviewPlayer$toggle$next$1);
                if (objResolveEndpointForDownload == coroutine_suspended) {
                    return coroutine_suspended;
                }
                $this$launch = $this$launch2;
                $result = objResolveEndpointForDownload;
                break;
            case 1:
                CoroutineScope $this$launch3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure($result);
                $this$launch = $this$launch3;
                soundPreviewPlayer$toggle$next$1 = this;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        final Endpoint endpoint = (Endpoint) $result;
        Handler handler = soundPreviewPlayer$toggle$next$1.this$0.handler;
        final SoundPreviewPlayer soundPreviewPlayer = soundPreviewPlayer$toggle$next$1.this$0;
        final String str = soundPreviewPlayer$toggle$next$1.$key;
        final String str2 = soundPreviewPlayer$toggle$next$1.$routePath;
        final Ref.IntRef intRef = soundPreviewPlayer$toggle$next$1.$index;
        final List<String> list = soundPreviewPlayer$toggle$next$1.$sources;
        final CoroutineScope coroutineScope = $this$launch;
        handler.post(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundPreviewPlayer$toggle$next$1$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                SoundPreviewPlayer$toggle$next$1.invokeSuspend$lambda$6(soundPreviewPlayer, str, endpoint, coroutineScope, str2, intRef, list);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$6(SoundPreviewPlayer this$0, String $key, Endpoint $endpoint, CoroutineScope $$this$launch, String $routePath, Ref.IntRef $index, List $sources) {
        if (Intrinsics.areEqual(this$0.getActiveKey(), $key)) {
            invokeSuspend$lambda$6$playFrom($$this$launch, this$0, $routePath, $index, $key, $sources, $endpoint, false);
        }
    }

    private static final void invokeSuspend$lambda$6$playFrom(final CoroutineScope $this$launch, final SoundPreviewPlayer this$0, final String routePath, final Ref.IntRef index, final String $key, final List<String> list, final Endpoint selected, final boolean retried) {
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaPlayer mediaPlayer = this$0.player;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m15551constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m15551constructorimpl(ResultKt.createFailure(th));
        }
        MediaPlayer current = new MediaPlayer();
        this$0.player = current;
        try {
            try {
                HttpUrl url = NetworkRuntime.INSTANCE.getRouter().urlFor(EndpointGroup.KOLSON, routePath, selected);
                current.setDataSource(url.getUrl());
                try {
                    current.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundPreviewPlayer$toggle$next$1$$ExternalSyntheticLambda0
                        @Override // android.media.MediaPlayer.OnPreparedListener
                        public final void onPrepared(MediaPlayer mediaPlayer2) {
                            SoundPreviewPlayer$toggle$next$1.invokeSuspend$lambda$6$playFrom$lambda$3(this$0, selected, $this$launch, mediaPlayer2);
                        }
                    });
                    try {
                        current.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundPreviewPlayer$toggle$next$1$$ExternalSyntheticLambda1
                            @Override // android.media.MediaPlayer.OnCompletionListener
                            public final void onCompletion(MediaPlayer mediaPlayer2) {
                                SoundPreviewPlayer$toggle$next$1.invokeSuspend$lambda$6$playFrom$lambda$4(this$0, index, $key, list, mediaPlayer2);
                            }
                        });
                        current.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundPreviewPlayer$toggle$next$1$$ExternalSyntheticLambda2
                            @Override // android.media.MediaPlayer.OnErrorListener
                            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                                return SoundPreviewPlayer$toggle$next$1.invokeSuspend$lambda$6$playFrom$lambda$5(this$0, selected, retried, $this$launch, routePath, index, $key, list, mediaPlayer2, i, i2);
                            }
                        });
                        this$0.handler.removeCallbacks(this$0.timeout);
                        this$0.handler.postDelayed(this$0.timeout, 15000L);
                        current.prepareAsync();
                    } catch (Exception e) {
                        Endpoint alternate = NetworkRuntime.INSTANCE.getRouter().alternateEndpoint(EndpointGroup.KOLSON, selected);
                        if (!retried) {
                        }
                        this$0.stop();
                        this$0.onError.invoke();
                    }
                } catch (Exception e2) {
                    Endpoint alternate2 = NetworkRuntime.INSTANCE.getRouter().alternateEndpoint(EndpointGroup.KOLSON, selected);
                    if (!retried || alternate2 == null) {
                        this$0.stop();
                        this$0.onError.invoke();
                    } else {
                        invokeSuspend$lambda$6$playFrom($this$launch, this$0, routePath, index, $key, list, alternate2, true);
                    }
                }
            } catch (Exception e3) {
            }
        } catch (Exception e4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$6$playFrom$lambda$3(SoundPreviewPlayer this$0, Endpoint $selected, CoroutineScope $$this$launch, MediaPlayer it) {
        Object objM15551constructorimpl;
        if (this$0.player == it) {
            NetworkRuntime.INSTANCE.getRouter().reportSuccess(EndpointGroup.KOLSON, $selected);
            this$0.handler.removeCallbacks(this$0.timeout);
            this$0.handler.postDelayed(this$0.timeout, 10000L);
            try {
                Result.Companion companion = Result.INSTANCE;
                it.start();
                objM15551constructorimpl = Result.m15551constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m15554exceptionOrNullimpl(objM15551constructorimpl) != null) {
                this$0.stop();
                this$0.onError.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$6$playFrom$lambda$4(SoundPreviewPlayer this$0, Ref.IntRef $index, String $key, List $sources, MediaPlayer it) {
        if (this$0.player == it) {
            this$0.handler.removeCallbacks(this$0.timeout);
            $index.element++;
            SoundPreviewPlayer.toggle$next(this$0, $key, $index, $sources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$6$playFrom$lambda$5(SoundPreviewPlayer this$0, Endpoint $selected, boolean $retried, CoroutineScope $$this$launch, String $routePath, Ref.IntRef $index, String $key, List $sources, MediaPlayer failed, int i, int i2) {
        if (this$0.player != failed) {
            return true;
        }
        NetworkRuntime.INSTANCE.getRouter().reportFailure(EndpointGroup.KOLSON, $selected);
        Endpoint alternate = NetworkRuntime.INSTANCE.getRouter().alternateEndpoint(EndpointGroup.KOLSON, $selected);
        if ($retried || alternate == null) {
            this$0.stop();
            this$0.onError.invoke();
        } else {
            invokeSuspend$lambda$6$playFrom($$this$launch, this$0, $routePath, $index, $key, $sources, alternate, true);
        }
        return true;
    }
}
