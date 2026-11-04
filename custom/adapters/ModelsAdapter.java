package com.blackhub.bronline.neizzir.fragments.custom.adapters;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.p008ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.neizzir.network.Endpoint;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.NetworkImages;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.helpshift.proactive.InAppViewConstants;
import java.io.File;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* JADX INFO: compiled from: ModelsAdapter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB/\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\n2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0014\u0010\u0019\u001a\u00020\n2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u0000H\u0016J\u0014\u0010\u001a\u001a\u00020\n2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u0000H\u0016R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/ModelsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/ModelsAdapter$VH;", FirebaseAnalytics.Param.ITEMS, "", "", "logosDir", "Ljava/io/File;", "onDownload", "Lkotlin/Function1;", "", "(Ljava/util/List;Ljava/io/File;Lkotlin/jvm/functions/Function1;)V", "descCache", "Ljava/util/concurrent/ConcurrentHashMap;", "descLoads", "Lkotlinx/coroutines/Job;", "getItemCount", "", "onBindViewHolder", "holder", InAppViewConstants.POSITION, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewDetachedFromWindow", "onViewRecycled", "VH", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class ModelsAdapter extends RecyclerView.Adapter<C5306VH> {
    private final ConcurrentHashMap<String, String> descCache;
    private final ConcurrentHashMap<String, Job> descLoads;
    private final List<String> items;
    private final File logosDir;
    private final Function1<String, Unit> onDownload;

    /* JADX WARN: Multi-variable type inference failed */
    public ModelsAdapter(List<String> items, File logosDir, Function1<? super String, Unit> onDownload) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(logosDir, "logosDir");
        Intrinsics.checkNotNullParameter(onDownload, "onDownload");
        this.items = items;
        this.logosDir = logosDir;
        this.onDownload = onDownload;
        this.descCache = new ConcurrentHashMap<>();
        this.descLoads = new ConcurrentHashMap<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public C5306VH onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View v = LayoutInflater.from(parent.getContext()).inflate(C3715R.layout.neizzir20_item_custom_media, parent, false);
        Intrinsics.checkNotNull(v);
        return new C5306VH(this, v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(C5306VH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(C5306VH holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        holder.clearImage();
        holder.releasePlayer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(C5306VH holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        holder.clearImage();
        holder.releasePlayer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getSizeInv() {
        return this.items.size();
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.adapters.ModelsAdapter$VH */
    /* JADX INFO: compiled from: ModelsAdapter.kt */
    @Metadata(m4415d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0015J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0003J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0017H\u0002J\u0016\u0010\"\u001a\u00020\u00152\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150$H\u0002J\u0006\u0010%\u001a\u00020\u0015J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/ModelsAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "item", "Landroid/view/View;", "(Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/ModelsAdapter;Landroid/view/View;)V", "btn", "Lcom/google/android/material/button/MaterialButton;", "desc", "Landroid/widget/TextView;", "image", "Landroid/widget/ImageView;", "playBtn", "Landroid/widget/FrameLayout;", "player", "Landroidx/media3/exoplayer/ExoPlayer;", "playerView", "Landroidx/media3/ui/PlayerView;", "title", "videoRouteJob", "Lkotlinx/coroutines/Job;", "bind", "", "modelId", "", "clearImage", "createPlayer", "path", "initialEndpoint", "Lcom/blackhub/bronline/neizzir/network/Endpoint;", "isCurrent", "", "loadInfoJson", "parseDescription", "json", "postToMain", "block", "Lkotlin/Function0;", "releasePlayer", "startVideo", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public final class C5306VH extends RecyclerView.ViewHolder {
        private final MaterialButton btn;
        private final TextView desc;
        private final ImageView image;
        private final FrameLayout playBtn;
        private ExoPlayer player;
        private final PlayerView playerView;
        final /* synthetic */ ModelsAdapter this$0;
        private final TextView title;
        private Job videoRouteJob;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5306VH(ModelsAdapter this$0, View item) {
            super(item);
            Intrinsics.checkNotNullParameter(item, "item");
            this.this$0 = this$0;
            View viewFindViewById = item.findViewById(C3715R.id.neizzir20_media_image);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.image = (ImageView) viewFindViewById;
            View viewFindViewById2 = item.findViewById(C3715R.id.neizzir20_player_view);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.playerView = (PlayerView) viewFindViewById2;
            View viewFindViewById3 = item.findViewById(C3715R.id.neizzir20_play_btn);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.playBtn = (FrameLayout) viewFindViewById3;
            View viewFindViewById4 = item.findViewById(C3715R.id.neizzir20_media_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.title = (TextView) viewFindViewById4;
            View viewFindViewById5 = item.findViewById(C3715R.id.neizzir20_media_desc);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.desc = (TextView) viewFindViewById5;
            View viewFindViewById6 = item.findViewById(C3715R.id.neizzir20_media_btn);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.btn = (MaterialButton) viewFindViewById6;
        }

        public final void bind(final String modelId) {
            Intrinsics.checkNotNullParameter(modelId, "modelId");
            this.title.setText("Model #" + modelId);
            File logoFile = new File(this.this$0.logosDir, modelId + ".pngg");
            if (!logoFile.exists()) {
                NetworkImages.INSTANCE.loadCdn(this.image, "models/" + modelId + "/logo.pngg", (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 4) != 0 ? null : null, (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 8) != 0 ? null : null, (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 16) != 0 ? false : false, (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 32) != 0 ? 17301579 : 0, (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 64) != 0 ? 17301579 : 0, (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 128) != 0 ? null : null, (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 256) != 0 ? null : null);
            } else {
                NetworkImages.INSTANCE.loadFile(this.image, logoFile, (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : null, (124 & 16) != 0 ? false : false, (124 & 32) != 0 ? null : null, (124 & 64) != 0 ? null : null);
            }
            View $this$isVisible$iv = this.playBtn;
            $this$isVisible$iv.setVisibility(0);
            View $this$isVisible$iv2 = this.playerView;
            $this$isVisible$iv2.setVisibility(8);
            View $this$isVisible$iv3 = this.image;
            $this$isVisible$iv3.setVisibility(0);
            View $this$isVisible$iv4 = this.desc;
            $this$isVisible$iv4.setVisibility(0);
            this.playBtn.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ModelsAdapter$VH$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ModelsAdapter.C5306VH.bind$lambda$0(this.f$0, modelId, view);
                }
            });
            this.btn.setText("Скачать");
            MaterialButton materialButton = this.btn;
            final ModelsAdapter modelsAdapter = this.this$0;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ModelsAdapter$VH$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ModelsAdapter.C5306VH.bind$lambda$1(modelsAdapter, modelId, view);
                }
            });
            String cached = (String) this.this$0.descCache.get(modelId);
            if (cached != null) {
                this.desc.setText(cached);
            } else {
                this.desc.setText("");
                loadInfoJson(modelId);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(C5306VH this$0, String modelId, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(modelId, "$modelId");
            this$0.startVideo(modelId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1(ModelsAdapter this$0, String modelId, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(modelId, "$modelId");
            this$0.onDownload.invoke(modelId);
        }

        private final void loadInfoJson(String modelId) {
            if (this.this$0.descLoads.containsKey(modelId)) {
                return;
            }
            Job job = BuildersKt__Builders_commonKt.launch$default(NetworkRuntime.INSTANCE.getApplicationScope(), null, null, new ModelsAdapter$VH$loadInfoJson$job$1(modelId, this.this$0, this, null), 3, null);
            if (((Job) this.this$0.descLoads.putIfAbsent(modelId, job)) != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:17:0x0073 A[Catch: Exception -> 0x00a7, TryCatch #0 {Exception -> 0x00a7, blocks: (B:6:0x0010, B:11:0x004d, B:16:0x005b, B:17:0x0073, B:23:0x0083, B:28:0x0090), top: B:35:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:19:0x007c  */
        /* JADX WARN: Code duplicated, block: B:20:0x007e  */
        /* JADX WARN: Code duplicated, block: B:22:0x0081  */
        /* JADX WARN: Code duplicated, block: B:23:0x0083 A[Catch: Exception -> 0x00a7, TryCatch #0 {Exception -> 0x00a7, blocks: (B:6:0x0010, B:11:0x004d, B:16:0x005b, B:17:0x0073, B:23:0x0083, B:28:0x0090), top: B:35:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:25:0x008c  */
        /* JADX WARN: Code duplicated, block: B:26:0x008d  */
        /* JADX WARN: Code duplicated, block: B:28:0x0090 A[Catch: Exception -> 0x00a7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a7, blocks: (B:6:0x0010, B:11:0x004d, B:16:0x005b, B:17:0x0073, B:23:0x0083, B:28:0x0090), top: B:35:0x0010 }] */
        public final String parseDescription(String json) {
            boolean z;
            String str = "";
            if (StringsKt__StringsKt.isBlank(json)) {
                return "";
            }
            try {
                JSONObject jo = new JSONObject(json);
                String strOptString = jo.optString("description", "");
                Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                String d = StringsKt__StringsKt.trim((CharSequence) strOptString).toString();
                String strOptString2 = jo.optString("version", "");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                String v = StringsKt__StringsKt.trim((CharSequence) strOptString2).toString();
                boolean z2 = true;
                if (d.length() > 0) {
                    if (v.length() > 0) {
                        str = d + "\nВерсия: " + v;
                    } else {
                        if (d.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            str = d;
                        } else {
                            if (v.length() > 0) {
                                z2 = false;
                            }
                            if (z2) {
                                str = "Версия: " + v;
                            }
                        }
                    }
                } else {
                    if (d.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str = d;
                    } else {
                        if (v.length() > 0) {
                            z2 = false;
                        }
                        if (z2) {
                            str = "Версия: " + v;
                        }
                    }
                }
            } catch (Exception e) {
            }
            return str;
        }

        private final void startVideo(String modelId) {
            if (this.player == null) {
                Job job = this.videoRouteJob;
                boolean z = false;
                if (job != null && job.isActive()) {
                    z = true;
                }
                if (z) {
                    return;
                }
                String path = "/api/fetch_file/models/" + modelId + "/video.mp44";
                this.videoRouteJob = BuildersKt__Builders_commonKt.launch$default(NetworkRuntime.INSTANCE.getApplicationScope(), null, null, new ModelsAdapter$VH$startVideo$1(path, this, modelId, null), 3, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void createPlayer(final String path, Endpoint initialEndpoint) {
            DefaultLoadControl loadControl = new DefaultLoadControl.Builder().setBufferDurationsMs(25000, 100000, 1500, 3000).build();
            Intrinsics.checkNotNullExpressionValue(loadControl, "build(...)");
            DefaultRenderersFactory renderersFactory = new DefaultRenderersFactory(this.itemView.getContext()).setEnableDecoderFallback(true).setExtensionRendererMode(2);
            Intrinsics.checkNotNullExpressionValue(renderersFactory, "setExtensionRendererMode(...)");
            final ExoPlayer p = new ExoPlayer.Builder(this.itemView.getContext(), renderersFactory).setLoadControl(loadControl).build();
            p.setVideoScalingMode(2);
            p.setRepeatMode(0);
            Intrinsics.checkNotNullExpressionValue(p, "apply(...)");
            this.player = p;
            this.playerView.setPlayer(p);
            View $this$isVisible$iv = this.playerView;
            $this$isVisible$iv.setVisibility(0);
            View $this$isVisible$iv2 = this.playBtn;
            $this$isVisible$iv2.setVisibility(8);
            View $this$isVisible$iv3 = this.image;
            $this$isVisible$iv3.setVisibility(8);
            final Ref.ObjectRef currentEndpoint = new Ref.ObjectRef();
            currentEndpoint.element = initialEndpoint;
            final Ref.BooleanRef didFallback = new Ref.BooleanRef();
            p.addListener(new Player.Listener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ModelsAdapter$VH$createPlayer$1
                @Override // androidx.media3.common.Player.Listener
                public void onPlaybackStateChanged(int state) {
                    if (state == 3) {
                        NetworkRuntime.INSTANCE.getRouter().reportSuccess(EndpointGroup.KOLSON, currentEndpoint.element);
                        p.setPlayWhenReady(true);
                    }
                }

                @Override // androidx.media3.common.Player.Listener
                public void onPlayerError(PlaybackException error) {
                    Endpoint alternate;
                    Intrinsics.checkNotNullParameter(error, "error");
                    if (didFallback.element || (alternate = NetworkRuntime.INSTANCE.getRouter().alternateEndpoint(EndpointGroup.KOLSON, currentEndpoint.element)) == null) {
                        return;
                    }
                    didFallback.element = true;
                    long position = RangesKt___RangesKt.coerceAtLeast(p.getCurrentPosition(), 0L);
                    NetworkRuntime.INSTANCE.getRouter().reportFailure(EndpointGroup.KOLSON, currentEndpoint.element);
                    ModelsAdapter.C5306VH.createPlayer$play(currentEndpoint, path, p, alternate, position);
                }
            });
            createPlayer$play(currentEndpoint, path, p, initialEndpoint, 0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void createPlayer$play(Ref.ObjectRef<Endpoint> objectRef, String $path, ExoPlayer p, Endpoint endpoint, long positionMs) {
            objectRef.element = endpoint;
            HttpUrl uri = NetworkRuntime.INSTANCE.getRouter().urlFor(EndpointGroup.KOLSON, $path, endpoint);
            MediaItem mediaItem = new MediaItem.Builder().setUri(uri.getUrl()).setMimeType(MimeTypes.VIDEO_MP4).build();
            Intrinsics.checkNotNullExpressionValue(mediaItem, "build(...)");
            p.setMediaItem(mediaItem);
            p.prepare();
            if (positionMs > 0) {
                p.seekTo(positionMs);
            }
        }

        public final void releasePlayer() {
            Job job = this.videoRouteJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.videoRouteJob = null;
            this.playerView.setPlayer(null);
            ExoPlayer exoPlayer = this.player;
            if (exoPlayer != null) {
                exoPlayer.release();
            }
            this.player = null;
            View $this$isVisible$iv = this.playerView;
            $this$isVisible$iv.setVisibility(8);
            View $this$isVisible$iv2 = this.image;
            $this$isVisible$iv2.setVisibility(0);
            View $this$isVisible$iv3 = this.playBtn;
            $this$isVisible$iv3.setVisibility(0);
        }

        public final void clearImage() {
            NetworkImages.INSTANCE.clear(this.image);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isCurrent(String modelId) {
            int pos = getBindingAdapterPosition();
            return pos != -1 && Intrinsics.areEqual(this.this$0.items.get(pos), modelId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void postToMain(final Function0<Unit> block) {
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ModelsAdapter$VH$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ModelsAdapter.C5306VH.postToMain$lambda$4(block);
                    }
                });
            } else {
                block.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void postToMain$lambda$4(Function0 tmp0) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke();
        }
    }
}
