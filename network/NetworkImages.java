package com.blackhub.bronline.neizzir.network;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import coil.request.Disposable;
import coil.request.ImageRequest;
import coil.size.Precision;
import coil.size.Scale;
import coil.target.Target;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.helpshift.proactive.InAppViewConstants;
import java.io.File;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.p043io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: NetworkImages.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u00017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u008f\u0001\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n\u0018\u00010\u001e2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!H\u0002¢\u0006\u0002\u0010\"J\u0018\u0010#\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J{\u0010$\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n\u0018\u00010\u001e2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!¢\u0006\u0002\u0010&Jw\u0010'\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n\u0018\u00010\u001e2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!H\u0002¢\u0006\u0002\u0010*Jg\u0010+\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010,\u001a\u00020-2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00162\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n\u0018\u00010\u001e2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!¢\u0006\u0002\u0010.J{\u0010/\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n\u0018\u00010\u001e2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!¢\u0006\u0002\u0010&Jw\u00100\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n\u0018\u00010\u001e2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!H\u0002¢\u0006\u0002\u00101J{\u00102\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n\u0018\u00010\u001e2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!¢\u0006\u0002\u0010&JA\u00104\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0002\u00106R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/NetworkImages;", "", "()V", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "Ljava/util/WeakHashMap;", "Landroid/widget/ImageView;", "Lcom/blackhub/bronline/neizzir/network/NetworkImages$ActiveRequest;", "nextToken", "Ljava/util/concurrent/atomic/AtomicLong;", "clear", "", "view", "enqueueRouted", "group", "Lcom/blackhub/bronline/neizzir/network/EndpointGroup;", "path", "", "endpoint", "Lcom/blackhub/bronline/neizzir/network/Endpoint;", "token", "", "retried", "", InAppViewConstants.WIDTH, "", InAppViewConstants.HEIGHT, "centerCrop", "placeholder", "error", "onSuccess", "Lkotlin/Function1;", "Landroid/graphics/drawable/Drawable;", "onError", "Lkotlin/Function0;", "(Landroid/widget/ImageView;Lcom/blackhub/bronline/neizzir/network/EndpointGroup;Ljava/lang/String;Lcom/blackhub/bronline/neizzir/network/Endpoint;JZLjava/lang/Integer;Ljava/lang/Integer;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "isCurrent", "loadCdn", "relativePath", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "loadDirect", "data", "cacheKey", "(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "loadFile", "file", "Ljava/io/File;", "(Landroid/widget/ImageView;Ljava/io/File;Ljava/lang/Integer;Ljava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "loadKolsonPath", "loadRouted", "(Landroid/widget/ImageView;Lcom/blackhub/bronline/neizzir/network/EndpointGroup;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "loadUrl", "url", "requestBuilder", "Lcoil/request/ImageRequest$Builder;", "(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcoil/request/ImageRequest$Builder;", "ActiveRequest", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class NetworkImages {
    public static final NetworkImages INSTANCE = new NetworkImages();
    private static final AtomicLong nextToken = new AtomicLong();
    private static final WeakHashMap<ImageView, ActiveRequest> active = new WeakHashMap<>();

    /* JADX INFO: compiled from: NetworkImages.kt */
    @Metadata(m4415d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/NetworkImages$ActiveRequest;", "", "token", "", "resolverJob", "Lkotlinx/coroutines/Job;", "disposable", "Lcoil/request/Disposable;", "(JLkotlinx/coroutines/Job;Lcoil/request/Disposable;)V", "getDisposable", "()Lcoil/request/Disposable;", "getResolverJob", "()Lkotlinx/coroutines/Job;", "getToken", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final /* data */ class ActiveRequest {
        private final Disposable disposable;
        private final Job resolverJob;
        private final long token;

        public static /* synthetic */ ActiveRequest copy$default(ActiveRequest activeRequest, long j, Job job, Disposable disposable, int i, Object obj) {
            if ((i & 1) != 0) {
                j = activeRequest.token;
            }
            if ((i & 2) != 0) {
                job = activeRequest.resolverJob;
            }
            if ((i & 4) != 0) {
                disposable = activeRequest.disposable;
            }
            return activeRequest.copy(j, job, disposable);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getToken() {
            return this.token;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Job getResolverJob() {
            return this.resolverJob;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Disposable getDisposable() {
            return this.disposable;
        }

        public final ActiveRequest copy(long token, Job resolverJob, Disposable disposable) {
            return new ActiveRequest(token, resolverJob, disposable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActiveRequest)) {
                return false;
            }
            ActiveRequest activeRequest = (ActiveRequest) other;
            return this.token == activeRequest.token && Intrinsics.areEqual(this.resolverJob, activeRequest.resolverJob) && Intrinsics.areEqual(this.disposable, activeRequest.disposable);
        }

        public int hashCode() {
            return (((Long.hashCode(this.token) * 31) + (this.resolverJob == null ? 0 : this.resolverJob.hashCode())) * 31) + (this.disposable != null ? this.disposable.hashCode() : 0);
        }

        public String toString() {
            return "ActiveRequest(token=" + this.token + ", resolverJob=" + this.resolverJob + ", disposable=" + this.disposable + ')';
        }

        public ActiveRequest(long token, Job resolverJob, Disposable disposable) {
            this.token = token;
            this.resolverJob = resolverJob;
            this.disposable = disposable;
        }

        public /* synthetic */ ActiveRequest(long j, Job job, Disposable disposable, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? null : job, (i & 4) != 0 ? null : disposable);
        }

        public final long getToken() {
            return this.token;
        }

        public final Job getResolverJob() {
            return this.resolverJob;
        }

        public final Disposable getDisposable() {
            return this.disposable;
        }
    }

    private NetworkImages() {
    }

    public final void loadCdn(ImageView view, String relativePath, Integer width, Integer height, boolean centerCrop, int placeholder, int error, Function1<? super Drawable, Unit> onSuccess, Function0<Unit> onError) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        loadRouted(view, EndpointGroup.KOLSON, "/api/fetch_file/" + StringsKt__StringsKt.trimStart(relativePath, FileSystemKt.UnixPathSeparator), width, height, centerCrop, placeholder, error, onSuccess, onError);
    }

    public final void loadKolsonPath(ImageView view, String path, Integer width, Integer height, boolean centerCrop, int placeholder, int error, Function1<? super Drawable, Unit> onSuccess, Function0<Unit> onError) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(path, "path");
        loadRouted(view, EndpointGroup.KOLSON, FileSystemKt.UnixPathSeparator + StringsKt__StringsKt.trimStart(path, FileSystemKt.UnixPathSeparator), width, height, centerCrop, placeholder, error, onSuccess, onError);
    }

    public final void loadUrl(ImageView view, String url, Integer width, Integer height, boolean centerCrop, int placeholder, int error, Function1<? super Drawable, Unit> onSuccess, Function0<Unit> onError) {
        Object objM15551constructorimpl;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Result.Companion companion = Result.INSTANCE;
            NetworkImages networkImages = this;
            objM15551constructorimpl = Result.m15551constructorimpl(Uri.parse(url));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
        }
        Object obj = null;
        if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
            objM15551constructorimpl = null;
        }
        Uri uri = (Uri) objM15551constructorimpl;
        Iterable $this$firstOrNull$iv = EndpointGroup.KOLSON.getEndpoints();
        for (Object element$iv : $this$firstOrNull$iv) {
            if (StringsKt__StringsJVMKt.equals(uri != null ? uri.getHost() : null, Uri.parse(((Endpoint) element$iv).getBaseUrl()).getHost(), true)) {
                obj = element$iv;
                break;
            }
        }
        Endpoint endpoint = (Endpoint) obj;
        if (endpoint != null && uri != null) {
            StringBuilder $this$loadUrl_u24lambda_u244 = new StringBuilder();
            String encodedPath = uri.getEncodedPath();
            if (encodedPath == null) {
                encodedPath = "";
            }
            String str = encodedPath;
            if (StringsKt__StringsKt.isBlank(str)) {
                str = "/";
            }
            $this$loadUrl_u24lambda_u244.append(str);
            String it = uri.getEncodedQuery();
            if (it != null) {
                $this$loadUrl_u24lambda_u244.append('?').append(it);
            }
            String path = $this$loadUrl_u24lambda_u244.toString();
            Intrinsics.checkNotNullExpressionValue(path, "toString(...)");
            loadRouted(view, EndpointGroup.KOLSON, path, width, height, centerCrop, placeholder, error, onSuccess, onError);
            return;
        }
        loadDirect(view, url, "url:" + url, width, height, centerCrop, placeholder, error, onSuccess, onError);
    }

    public final void loadFile(ImageView view, File file, Integer width, Integer height, boolean centerCrop, Function1<? super Drawable, Unit> onSuccess, Function0<Unit> onError) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(file, "file");
        loadDirect(view, file, "file:" + file.getAbsolutePath() + AbstractJsonLexerKt.COLON + file.lastModified(), width, height, centerCrop, 0, 0, onSuccess, onError);
    }

    public final void clear(ImageView view) {
        ActiveRequest old;
        Disposable disposable;
        Job resolverJob;
        Intrinsics.checkNotNullParameter(view, "view");
        synchronized (active) {
            old = active.remove(view);
        }
        if (old != null && (resolverJob = old.getResolverJob()) != null) {
            Job.DefaultImpls.cancel$default(resolverJob, (CancellationException) null, 1, (Object) null);
        }
        if (old != null && (disposable = old.getDisposable()) != null) {
            disposable.dispose();
        }
        view.setImageDrawable(null);
    }

    private final void loadRouted(ImageView view, EndpointGroup group, String path, Integer width, Integer height, boolean centerCrop, int placeholder, int error, Function1<? super Drawable, Unit> onSuccess, Function0<Unit> onError) {
        clear(view);
        if (placeholder != 0) {
            view.setImageResource(placeholder);
        }
        long token = nextToken.incrementAndGet();
        Job job = BuildersKt__Builders_commonKt.launch$default(NetworkRuntime.INSTANCE.getApplicationScope(), null, null, new NetworkImages$loadRouted$job$1(group, path, view, token, width, height, centerCrop, placeholder, error, onSuccess, onError, null), 3, null);
        synchronized (active) {
            active.put(view, new ActiveRequest(token, job, null, 4, null));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueRouted(final ImageView view, final EndpointGroup group, final String path, final Endpoint endpoint, final long token, final boolean retried, final Integer width, final Integer height, final boolean centerCrop, final int placeholder, final int error, final Function1<? super Drawable, Unit> onSuccess, final Function0<Unit> onError) throws Throwable {
        String url = NetworkRuntime.INSTANCE.getRouter().urlFor(group, path, endpoint).getUrl();
        ImageRequest.Builder builderRequestBuilder = requestBuilder(view, url, group.name() + AbstractJsonLexerKt.COLON + StringsKt__StringsKt.substringBefore$default(path, '?', (String) null, 2, (Object) null), width, height, centerCrop);
        int i = R.color.transparent;
        ImageRequest.Builder builderPlaceholder = builderRequestBuilder.placeholder(placeholder != 0 ? placeholder : 17170445);
        if (error != 0) {
            i = error;
        }
        ImageRequest.Builder $this$iv = builderPlaceholder.error(i);
        ImageRequest request = $this$iv.target(new Target() { // from class: com.blackhub.bronline.neizzir.network.NetworkImages$enqueueRouted$$inlined$target$default$1
            @Override // coil.target.Target
            public void onStart(Drawable placeholder2) {
            }

            @Override // coil.target.Target
            public void onError(Drawable error2) throws Throwable {
                if (NetworkImages.INSTANCE.isCurrent(view, token)) {
                    NetworkRuntime.INSTANCE.getRouter().reportFailure(group, endpoint);
                    Endpoint alternate = NetworkRuntime.INSTANCE.getRouter().alternateEndpoint(group, endpoint);
                    if (!retried && alternate != null) {
                        NetworkImages.INSTANCE.enqueueRouted(view, group, path, alternate, token, true, width, height, centerCrop, placeholder, error, onSuccess, onError);
                        return;
                    }
                    view.setImageDrawable(error2);
                    if (onError != null) {
                        onError.invoke();
                    }
                }
            }

            @Override // coil.target.Target
            public void onSuccess(Drawable result) {
                if (!NetworkImages.INSTANCE.isCurrent(view, token)) {
                    return;
                }
                NetworkRuntime.INSTANCE.getRouter().reportSuccess(group, endpoint);
                view.setImageDrawable(result);
                if (onSuccess != null) {
                    onSuccess.invoke(result);
                }
            }
        }).build();
        Disposable disposable = NetworkRuntime.INSTANCE.getImageLoader().enqueue(request);
        synchronized (active) {
            try {
                try {
                    ActiveRequest activeRequest = active.get(view);
                    boolean z = false;
                    if (activeRequest != null && activeRequest.getToken() == token) {
                        z = true;
                    }
                    if (z) {
                        active.put(view, new ActiveRequest(token, null, disposable, 2, null));
                    } else {
                        disposable.dispose();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private final void loadDirect(final ImageView view, Object data, String cacheKey, Integer width, Integer height, boolean centerCrop, int placeholder, int error, final Function1<? super Drawable, Unit> onSuccess, final Function0<Unit> onError) {
        clear(view);
        final long token = nextToken.incrementAndGet();
        synchronized (active) {
            active.put(view, new ActiveRequest(token, null, null, 6, null));
            Unit unit = Unit.INSTANCE;
        }
        ImageRequest.Builder $this$iv = requestBuilder(view, data, cacheKey, width, height, centerCrop);
        if (placeholder != 0) {
            $this$iv.placeholder(placeholder);
        }
        if (error != 0) {
            $this$iv.error(error);
        }
        ImageRequest request = $this$iv.target(new Target() { // from class: com.blackhub.bronline.neizzir.network.NetworkImages$loadDirect$$inlined$target$default$1
            @Override // coil.target.Target
            public void onStart(Drawable placeholder2) {
            }

            @Override // coil.target.Target
            public void onError(Drawable error2) {
                if (NetworkImages.INSTANCE.isCurrent(view, token)) {
                    view.setImageDrawable(error2);
                    if (onError != null) {
                        onError.invoke();
                    }
                }
            }

            @Override // coil.target.Target
            public void onSuccess(Drawable result) {
                if (NetworkImages.INSTANCE.isCurrent(view, token)) {
                    view.setImageDrawable(result);
                    if (onSuccess != null) {
                        onSuccess.invoke(result);
                    }
                }
            }
        }).build();
        Disposable disposable = NetworkRuntime.INSTANCE.getImageLoader().enqueue(request);
        synchronized (active) {
            ActiveRequest activeRequest = active.get(view);
            boolean z = false;
            if (activeRequest != null && activeRequest.getToken() == token) {
                z = true;
            }
            if (z) {
                active.put(view, new ActiveRequest(token, null, disposable, 2, null));
            } else {
                disposable.dispose();
            }
            Unit unit2 = Unit.INSTANCE;
        }
    }

    private final ImageRequest.Builder requestBuilder(ImageView view, Object data, String cacheKey, Integer width, Integer height, boolean centerCrop) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageRequest.Builder $this$requestBuilder_u24lambda_u2415 = new ImageRequest.Builder(context).data(data).memoryCacheKey(cacheKey).diskCacheKey(cacheKey).precision(Precision.INEXACT);
        if (width != null && height != null) {
            $this$requestBuilder_u24lambda_u2415.size(width.intValue(), height.intValue());
        }
        if (centerCrop) {
            $this$requestBuilder_u24lambda_u2415.scale(Scale.FILL);
        }
        return $this$requestBuilder_u24lambda_u2415;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCurrent(ImageView view, long token) {
        boolean z;
        synchronized (active) {
            ActiveRequest activeRequest = active.get(view);
            z = false;
            if (activeRequest != null && activeRequest.getToken() == token) {
                z = true;
            }
        }
        return z;
    }
}
