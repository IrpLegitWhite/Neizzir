package com.blackhub.bronline.neizzir.video;

import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.p008ui.PlayerView;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.core.constants.FileFormats;
import com.blackhub.bronline.game.gui.donate.utils.DonateAllKeys;
import com.blackhub.bronline.neizzir.network.Endpoint;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.EndpointRouter;
import com.blackhub.bronline.neizzir.network.NetworkImages;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import com.google.android.material.button.MaterialButton;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: VideoPlayerActivity.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 I2\u00020\u0001:\u0001IB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020.H\u0003J\b\u00100\u001a\u00020.H\u0002J\u0018\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020.H\u0016J\u0012\u00106\u001a\u00020.2\b\u00107\u001a\u0004\u0018\u000108H\u0014J\b\u00109\u001a\u00020.H\u0014J\u0010\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u000208H\u0014J\b\u0010<\u001a\u00020.H\u0014J\b\u0010=\u001a\u00020.H\u0014J\b\u0010>\u001a\u00020.H\u0002J\b\u0010?\u001a\u00020.H\u0002J\b\u0010@\u001a\u00020.H\u0002J\b\u0010A\u001a\u00020.H\u0002J\b\u0010B\u001a\u00020.H\u0002J\u0010\u0010C\u001a\u00020\b2\u0006\u00103\u001a\u000204H\u0002J\u0018\u0010D\u001a\u00020.2\u0006\u0010E\u001a\u00020,2\u0006\u0010F\u001a\u00020\u0006H\u0003J\b\u0010G\u001a\u00020.H\u0002J\b\u0010H\u001a\u00020.H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/video/VideoPlayerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "closeButton", "Landroid/view/View;", "currentEndpoint", "Lcom/blackhub/bronline/neizzir/network/Endpoint;", "currentScale", "", "errorText", "Landroid/widget/TextView;", "errorView", "fullscreenButton", "Landroid/widget/ImageView;", "imageView", "isFullscreen", "", "isImage", "loadingText", "loadingView", "matrix", "Landroid/graphics/Matrix;", "maxScale", DonateAllKeys.KEY_MID_METRICA_INTERNAL_ID, "Landroid/graphics/PointF;", "minScale", "mode", "", "oldDist", "playWhenReady", "playbackPosition", "", "player", "Landroidx/media3/exoplayer/ExoPlayer;", "playerView", "Landroidx/media3/ui/PlayerView;", "resolveJob", "Lkotlinx/coroutines/Job;", "retryButton", "Lcom/google/android/material/button/MaterialButton;", "savedMatrix", TtmlNode.START, "useFallback", "videoKey", "", "initViews", "", "initializePlayer", "loadImage", "midPoint", "point", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onSaveInstanceState", "outState", "onStart", "onStop", "releasePlayer", "setupClickListeners", "setupFullscreen", "setupImageZoom", "showPlaybackError", "spacing", "startPlayer", "path", "endpoint", "toggleFullscreen", "updateOrientation", "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class VideoPlayerActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int DRAG = 1;
    private static final String EXTRA_VIDEO_KEY = "video_key";
    private static final int NONE = 0;
    private static final int ZOOM = 2;
    private View closeButton;
    private Endpoint currentEndpoint;
    private TextView errorText;
    private View errorView;
    private ImageView fullscreenButton;
    private ImageView imageView;
    private boolean isFullscreen;
    private boolean isImage;
    private TextView loadingText;
    private View loadingView;
    private int mode;
    private long playbackPosition;
    private ExoPlayer player;
    private PlayerView playerView;
    private Job resolveJob;
    private MaterialButton retryButton;
    private boolean useFallback;
    private String videoKey = "";
    private boolean playWhenReady = true;
    private final Matrix matrix = new Matrix();
    private final Matrix savedMatrix = new Matrix();
    private final PointF start = new PointF();
    private final PointF mid = new PointF();
    private float oldDist = 1.0f;
    private float minScale = 1.0f;
    private float maxScale = 4.0f;
    private float currentScale = 1.0f;

    /* JADX INFO: compiled from: VideoPlayerActivity.kt */
    @Metadata(m4415d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/video/VideoPlayerActivity$Companion;", "", "()V", "DRAG", "", "EXTRA_VIDEO_KEY", "", "NONE", "ZOOM", TtmlNode.START, "", "context", "Landroid/content/Context;", "videoKey", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(Context context, String videoKey) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(videoKey, "videoKey");
            Intent intent = new Intent(context, (Class<?>) VideoPlayerActivity.class);
            intent.putExtra(VideoPlayerActivity.EXTRA_VIDEO_KEY, videoKey);
            context.startActivity(intent);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C3715R.layout.neizzir20_activity_video_player);
        String stringExtra = getIntent().getStringExtra(EXTRA_VIDEO_KEY);
        if (stringExtra == null) {
            VideoPlayerActivity $this$onCreate_u24lambda_u240 = this;
            $this$onCreate_u24lambda_u240.finish();
            return;
        }
        this.videoKey = stringExtra;
        this.isImage = StringsKt__StringsJVMKt.endsWith(this.videoKey, FileFormats.PNG_FORMAT, true) || StringsKt__StringsJVMKt.endsWith(this.videoKey, ".jpg", true) || StringsKt__StringsJVMKt.endsWith(this.videoKey, ".jpeg", true);
        if (savedInstanceState != null) {
            this.playbackPosition = savedInstanceState.getLong("playback_position", 0L);
            this.playWhenReady = savedInstanceState.getBoolean("play_when_ready", true);
            this.isFullscreen = savedInstanceState.getBoolean("is_fullscreen", false);
        }
        initViews();
        setupFullscreen();
        setupClickListeners();
        if (this.isImage) {
            loadImage();
        } else {
            initializePlayer();
        }
    }

    private final void initViews() {
        View viewFindViewById = findViewById(C3715R.id.neizzir_video_player);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.playerView = (PlayerView) viewFindViewById;
        View viewFindViewById2 = findViewById(C3715R.id.neizzir_image_viewer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.imageView = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C3715R.id.neizzir_video_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.closeButton = viewFindViewById3;
        View viewFindViewById4 = findViewById(C3715R.id.neizzir_video_fullscreen);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.fullscreenButton = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C3715R.id.neizzir_video_loading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.loadingView = viewFindViewById5;
        View viewFindViewById6 = findViewById(C3715R.id.neizzir_video_loading_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.loadingText = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(C3715R.id.neizzir_video_error);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.errorView = viewFindViewById7;
        View viewFindViewById8 = findViewById(C3715R.id.neizzir_video_error_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.errorText = (TextView) viewFindViewById8;
        View viewFindViewById9 = findViewById(C3715R.id.neizzir_video_retry);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.retryButton = (MaterialButton) viewFindViewById9;
    }

    private final void setupFullscreen() {
        getWindow().setFlags(1024, 1024);
        getWindow().getDecorView().setSystemUiVisibility(5894);
        updateOrientation();
    }

    private final void setupClickListeners() {
        View view = this.closeButton;
        MaterialButton materialButton = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeButton");
            view = null;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.video.VideoPlayerActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VideoPlayerActivity.setupClickListeners$lambda$2(this.f$0, view2);
            }
        });
        ImageView imageView = this.fullscreenButton;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fullscreenButton");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.video.VideoPlayerActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VideoPlayerActivity.setupClickListeners$lambda$3(this.f$0, view2);
            }
        });
        MaterialButton materialButton2 = this.retryButton;
        if (materialButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retryButton");
        } else {
            materialButton = materialButton2;
        }
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.video.VideoPlayerActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VideoPlayerActivity.setupClickListeners$lambda$4(this.f$0, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$2(VideoPlayerActivity this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$3(VideoPlayerActivity this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.toggleFullscreen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$4(VideoPlayerActivity this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.errorView;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorView");
            view = null;
        }
        view.setVisibility(8);
        View view3 = this$0.loadingView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingView");
        } else {
            view2 = view3;
        }
        view2.setVisibility(0);
        this$0.useFallback = false;
        if (this$0.isImage) {
            this$0.loadImage();
        } else {
            this$0.releasePlayer();
            this$0.initializePlayer();
        }
    }

    private final void loadImage() {
        ImageView imageView;
        View view = this.loadingView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingView");
            view = null;
        }
        view.setVisibility(0);
        TextView textView = this.loadingText;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingText");
            textView = null;
        }
        textView.setText("Загрузка изображения...");
        ImageView imageView2 = this.imageView;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView2 = null;
        }
        imageView2.setVisibility(0);
        PlayerView playerView = this.playerView;
        if (playerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerView");
            playerView = null;
        }
        playerView.setVisibility(8);
        String cleanKey = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(this.videoKey, FileFormats.PNG_FORMAT, "", false, 4, (Object) null), ".jpg", "", false, 4, (Object) null), ".jpeg", "", false, 4, (Object) null);
        String imageUrl = EndpointRouter.urlFor$default(NetworkRuntime.INSTANCE.getRouter(), EndpointGroup.KOLSON, "/video/" + cleanKey + FileFormats.PNG_FORMAT, null, 4, null).getUrl();
        NetworkImages networkImages = NetworkImages.INSTANCE;
        ImageView imageView3 = this.imageView;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView = null;
        } else {
            imageView = imageView3;
        }
        networkImages.loadUrl(imageView, imageUrl, (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : null, (124 & 16) != 0 ? false : false, (124 & 32) != 0 ? 17301579 : 0, (124 & 64) != 0 ? 17301579 : 0, (124 & 128) != 0 ? null : new Function1<Drawable, Unit>() { // from class: com.blackhub.bronline.neizzir.video.VideoPlayerActivity.loadImage.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Drawable drawable) {
                invoke2(drawable);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Drawable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                View view2 = VideoPlayerActivity.this.loadingView;
                View view3 = null;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadingView");
                    view2 = null;
                }
                view2.setVisibility(8);
                View view4 = VideoPlayerActivity.this.errorView;
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("errorView");
                } else {
                    view3 = view4;
                }
                view3.setVisibility(8);
                VideoPlayerActivity.this.setupImageZoom();
            }
        }, (124 & 256) != 0 ? null : new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.video.VideoPlayerActivity.loadImage.2
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
                View view2 = VideoPlayerActivity.this.loadingView;
                TextView textView2 = null;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadingView");
                    view2 = null;
                }
                view2.setVisibility(8);
                View view3 = VideoPlayerActivity.this.errorView;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("errorView");
                    view3 = null;
                }
                view3.setVisibility(0);
                TextView textView3 = VideoPlayerActivity.this.errorText;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("errorText");
                } else {
                    textView2 = textView3;
                }
                textView2.setText("Не удалось загрузить изображение.\nПроверьте подключение к интернету.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupImageZoom() {
        ImageView imageView = this.imageView;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView = null;
        }
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView imageView3 = this.imageView;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView3 = null;
        }
        imageView3.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.neizzir.video.VideoPlayerActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return VideoPlayerActivity.setupImageZoom$lambda$5(this.f$0, view, motionEvent);
            }
        });
        ImageView imageView4 = this.imageView;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
        } else {
            imageView2 = imageView4;
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.video.VideoPlayerActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPlayerActivity.setupImageZoom$lambda$6(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupImageZoom$lambda$5(VideoPlayerActivity this$0, View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = false;
        switch (event.getActionMasked()) {
            case 0:
                this$0.savedMatrix.set(this$0.matrix);
                this$0.start.set(event.getX(), event.getY());
                this$0.mode = 1;
                break;
            case 1:
            case 6:
                this$0.mode = 0;
                break;
            case 2:
                if (this$0.mode == 1) {
                    this$0.matrix.set(this$0.savedMatrix);
                    this$0.matrix.postTranslate(event.getX() - this$0.start.x, event.getY() - this$0.start.y);
                } else if (this$0.mode == 2) {
                    Intrinsics.checkNotNull(event);
                    float newDist = this$0.spacing(event);
                    if (newDist > 10.0f) {
                        this$0.matrix.set(this$0.savedMatrix);
                        float scale = newDist / this$0.oldDist;
                        float newScale = this$0.currentScale * scale;
                        float f = this$0.minScale;
                        if (newScale <= this$0.maxScale && f <= newScale) {
                            z = true;
                        }
                        if (z) {
                            this$0.currentScale = newScale;
                            this$0.matrix.postScale(scale, scale, this$0.mid.x, this$0.mid.y);
                        }
                    }
                }
                break;
            case 5:
                Intrinsics.checkNotNull(event);
                this$0.oldDist = this$0.spacing(event);
                if (this$0.oldDist > 10.0f) {
                    this$0.savedMatrix.set(this$0.matrix);
                    this$0.midPoint(this$0.mid, event);
                    this$0.mode = 2;
                }
                break;
        }
        ImageView imageView = this$0.imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView = null;
        }
        imageView.setImageMatrix(this$0.matrix);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupImageZoom$lambda$6(VideoPlayerActivity this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.currentScale > 1.1f) {
            this$0.currentScale = 1.0f;
            this$0.matrix.reset();
            ImageView imageView = this$0.imageView;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
                imageView = null;
            }
            imageView.setImageMatrix(this$0.matrix);
        }
    }

    private final float spacing(MotionEvent event) {
        float x = event.getX(0) - event.getX(1);
        float y = event.getY(0) - event.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    private final void midPoint(PointF point, MotionEvent event) {
        float x = event.getX(0) + event.getX(1);
        float y = event.getY(0) + event.getY(1);
        float f = 2;
        point.set(x / f, y / f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    private final void initializePlayer() {
        boolean z;
        Job job = this.resolveJob;
        if (job != null) {
            z = job.isActive();
        }
        if (z || this.player != null) {
            return;
        }
        View view = this.loadingView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingView");
            view = null;
        }
        view.setVisibility(0);
        TextView textView = this.loadingText;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingText");
            textView = null;
        }
        textView.setText("Загрузка видео...");
        PlayerView playerView = this.playerView;
        if (playerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerView");
            playerView = null;
        }
        playerView.setVisibility(0);
        ImageView imageView = this.imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView = null;
        }
        imageView.setVisibility(8);
        String cleanKey = StringsKt__StringsJVMKt.replace$default(this.videoKey, ".mp4", "", false, 4, (Object) null);
        String path = "/video/" + cleanKey + ".mp4";
        this.resolveJob = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C57011(path, this, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.video.VideoPlayerActivity$initializePlayer$1 */
    /* JADX INFO: compiled from: VideoPlayerActivity.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.video.VideoPlayerActivity$initializePlayer$1", m4426f = "VideoPlayerActivity.kt", m4427i = {}, m4428l = {281}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C57011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $path;
        int label;
        final /* synthetic */ VideoPlayerActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C57011(String str, VideoPlayerActivity videoPlayerActivity, Continuation<? super C57011> continuation) {
            super(2, continuation);
            this.$path = str;
            this.this$0 = videoPlayerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C57011(this.$path, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C57011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws Throwable {
            C57011 c57011;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c57011 = this;
                    c57011.label = 1;
                    Object objResolveEndpointForDownload = NetworkRuntime.INSTANCE.getRouter().resolveEndpointForDownload(EndpointGroup.KOLSON, c57011.$path, c57011);
                    if (objResolveEndpointForDownload == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objResolveEndpointForDownload;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c57011 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Endpoint endpoint = (Endpoint) $result;
            c57011.this$0.currentEndpoint = endpoint;
            c57011.this$0.startPlayer(c57011.$path, endpoint);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startPlayer(final String path, final Endpoint endpoint) {
        String str;
        if (isFinishing() || isDestroyed()) {
            return;
        }
        this.player = new ExoPlayer.Builder(this).setVideoScalingMode(1).build();
        PlayerView playerView = this.playerView;
        TextView textView = null;
        if (playerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerView");
            playerView = null;
        }
        playerView.setPlayer(this.player);
        HttpUrl videoUrl = NetworkRuntime.INSTANCE.getRouter().urlFor(EndpointGroup.KOLSON, path, endpoint);
        TextView textView2 = this.loadingText;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingText");
        } else {
            textView = textView2;
        }
        if (this.useFallback) {
        }
        textView.setText(str);
        MediaItem mediaItem = MediaItem.fromUri(videoUrl.getUrl());
        Intrinsics.checkNotNullExpressionValue(mediaItem, "fromUri(...)");
        final ExoPlayer $this$startPlayer_u24lambda_u247 = this.player;
        if ($this$startPlayer_u24lambda_u247 != null) {
            $this$startPlayer_u24lambda_u247.setMediaItem(mediaItem);
            $this$startPlayer_u24lambda_u247.seekTo(this.playbackPosition);
            $this$startPlayer_u24lambda_u247.setPlayWhenReady(this.playWhenReady);
            $this$startPlayer_u24lambda_u247.prepare();
            $this$startPlayer_u24lambda_u247.addListener(new Player.Listener() { // from class: com.blackhub.bronline.neizzir.video.VideoPlayerActivity$startPlayer$1$1
                @Override // androidx.media3.common.Player.Listener
                public void onPlaybackStateChanged(int playbackState) {
                    switch (playbackState) {
                        case 3:
                            View view = this.this$0.loadingView;
                            View view2 = null;
                            if (view == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("loadingView");
                                view = null;
                            }
                            view.setVisibility(8);
                            View view3 = this.this$0.errorView;
                            if (view3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("errorView");
                            } else {
                                view2 = view3;
                            }
                            view2.setVisibility(8);
                            break;
                        case 4:
                            $this$startPlayer_u24lambda_u247.seekTo(0L);
                            $this$startPlayer_u24lambda_u247.pause();
                            break;
                    }
                }

                @Override // androidx.media3.common.Player.Listener
                public void onPlayerError(PlaybackException error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    if (!this.this$0.useFallback) {
                        this.this$0.useFallback = true;
                        NetworkRuntime.INSTANCE.getRouter().reportFailure(EndpointGroup.KOLSON, endpoint);
                        this.this$0.playbackPosition = $this$startPlayer_u24lambda_u247.getCurrentPosition();
                        Endpoint alternate = NetworkRuntime.INSTANCE.getRouter().alternateEndpoint(EndpointGroup.KOLSON, endpoint);
                        this.this$0.releasePlayer();
                        if (alternate != null) {
                            this.this$0.currentEndpoint = alternate;
                            this.this$0.startPlayer(path, alternate);
                            return;
                        } else {
                            this.this$0.showPlaybackError();
                            return;
                        }
                    }
                    NetworkRuntime.INSTANCE.getRouter().reportFailure(EndpointGroup.KOLSON, endpoint);
                    this.this$0.showPlaybackError();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPlaybackError() {
        View view = this.loadingView;
        TextView textView = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingView");
            view = null;
        }
        view.setVisibility(8);
        View view2 = this.errorView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorView");
            view2 = null;
        }
        view2.setVisibility(0);
        TextView textView2 = this.errorText;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorText");
        } else {
            textView = textView2;
        }
        textView.setText("Не удалось загрузить видео.\nПроверьте подключение к интернету.");
    }

    private final void toggleFullscreen() {
        this.isFullscreen = !this.isFullscreen;
        updateOrientation();
    }

    private final void updateOrientation() {
        ImageView imageView = null;
        if (this.isFullscreen) {
            setRequestedOrientation(6);
            ImageView imageView2 = this.fullscreenButton;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fullscreenButton");
            } else {
                imageView = imageView2;
            }
            imageView.setImageResource(C3715R.drawable.neizzir19_ic_fullscreen_exit);
            return;
        }
        setRequestedOrientation(1);
        ImageView imageView3 = this.fullscreenButton;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fullscreenButton");
        } else {
            imageView = imageView3;
        }
        imageView.setImageResource(C3715R.drawable.neizzir19_ic_fullscreen);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releasePlayer() {
        Job job = this.resolveJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.resolveJob = null;
        ExoPlayer it = this.player;
        if (it != null) {
            this.playbackPosition = it.getCurrentPosition();
            this.playWhenReady = it.getPlayWhenReady();
            it.release();
        }
        this.player = null;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        ExoPlayer exoPlayer = this.player;
        outState.putLong("playback_position", exoPlayer != null ? exoPlayer.getCurrentPosition() : this.playbackPosition);
        ExoPlayer exoPlayer2 = this.player;
        outState.putBoolean("play_when_ready", exoPlayer2 != null ? exoPlayer2.getPlayWhenReady() : this.playWhenReady);
        outState.putBoolean("is_fullscreen", this.isFullscreen);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        if (!this.isImage) {
            releasePlayer();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        if (!this.isImage && this.player == null) {
            initializePlayer();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        NetworkImages networkImages = NetworkImages.INSTANCE;
        ImageView imageView = this.imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView = null;
        }
        networkImages.clear(imageView);
        releasePlayer();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.isFullscreen) {
            toggleFullscreen();
        } else {
            super.onBackPressed();
        }
    }
}
