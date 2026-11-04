package com.blackhub.bronline.neizzir.umbrella;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.neizzir.network.NetworkImages;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: UmbrellaGallery.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaGallery;", "", "()V", "show", "", "fragment", "Landroidx/fragment/app/Fragment;", "ZoomImage", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class UmbrellaGallery {
    public static final UmbrellaGallery INSTANCE = new UmbrellaGallery();

    private UmbrellaGallery() {
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.blackhub.bronline.neizzir.umbrella.UmbrellaGallery$show$observer$1] */
    public final void show(final Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        final FragmentActivity activity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(1);
        View root = activity.getLayoutInflater().inflate(C3715R.layout.neizzir_umbrella_gallery, (ViewGroup) null);
        final TextView counter = (TextView) root.findViewById(C3715R.id.umbrella_gallery_counter);
        final ProgressBar progress = (ProgressBar) root.findViewById(C3715R.id.umbrella_gallery_progress);
        final TextView error = (TextView) root.findViewById(C3715R.id.umbrella_gallery_error);
        FrameLayout frame = (FrameLayout) root.findViewById(C3715R.id.umbrella_gallery_image_frame);
        final ZoomImage $this$show_u24lambda_u240 = new ZoomImage(activity);
        $this$show_u24lambda_u240.setContentDescription("Скриншот функций Umbrella");
        frame.addView($this$show_u24lambda_u240, 0, new FrameLayout.LayoutParams(-1, -1));
        final View previous = root.findViewById(C3715R.id.umbrella_gallery_previous);
        View retry = root.findViewById(C3715R.id.umbrella_gallery_retry);
        final View next = root.findViewById(C3715R.id.umbrella_gallery_next);
        View close = root.findViewById(C3715R.id.umbrella_gallery_close);
        final Ref.ObjectRef images = new Ref.ObjectRef();
        images.element = CollectionsKt__CollectionsKt.emptyList();
        final Ref.IntRef index = new Ref.IntRef();
        final Ref.ObjectRef request = new Ref.ObjectRef();
        final Ref.IntRef generation = new Ref.IntRef();
        previous.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaGallery$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UmbrellaGallery.show$lambda$1(images, index, dialog, generation, $this$show_u24lambda_u240, counter, previous, next, progress, error, view);
            }
        });
        next.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaGallery$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UmbrellaGallery.show$lambda$2(images, index, dialog, generation, $this$show_u24lambda_u240, counter, previous, next, progress, error, view);
            }
        });
        $this$show_u24lambda_u240.setOnSwipe(new C56913(images, index, dialog, generation, $this$show_u24lambda_u240, counter, previous, next, progress, error));
        retry.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaGallery$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UmbrellaGallery.show$lambda$3(request, generation, $this$show_u24lambda_u240, fragment, progress, error, previous, index, next, images, activity, dialog, counter, view);
            }
        });
        close.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaGallery$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UmbrellaGallery.show$lambda$4(dialog, view);
            }
        });
        final Lifecycle lifecycle = fragment.getViewLifecycleOwner().getLifecycle();
        final ?? r3 = new DefaultLifecycleObserver() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaGallery$show$observer$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                dialog.dismiss();
            }
        };
        lifecycle.addObserver((LifecycleObserver) r3);
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaGallery$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                UmbrellaGallery.show$lambda$5(request, generation, $this$show_u24lambda_u240, lifecycle, r3, dialogInterface);
            }
        });
        dialog.setContentView(root);
        dialog.show();
        Window $this$show_u24lambda_u246 = dialog.getWindow();
        if ($this$show_u24lambda_u246 != null) {
            $this$show_u24lambda_u246.setBackgroundDrawable(new ColorDrawable(0));
            $this$show_u24lambda_u246.setLayout(-1, -1);
        }
        show$loadCatalog(request, generation, $this$show_u24lambda_u240, fragment, progress, error, previous, index, next, images, activity, dialog, counter);
    }

    private static final void show$navigation(View previous, Ref.IntRef index, View next, Ref.ObjectRef<List<String>> objectRef, boolean available) {
        previous.setEnabled(available && index.element > 0);
        next.setEnabled(available && index.element < CollectionsKt__CollectionsKt.getLastIndex(objectRef.element));
        previous.setAlpha(previous.isEnabled() ? 1.0f : 0.3f);
        next.setAlpha(next.isEnabled() ? 1.0f : 0.3f);
    }

    private static final void show$loading(ProgressBar progress, TextView error) {
        progress.setVisibility(0);
        error.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$failed(ProgressBar progress, TextView error, String message) {
        progress.setVisibility(8);
        error.setText(message);
        error.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$display(Dialog dialog, Ref.ObjectRef<List<String>> objectRef, final Ref.IntRef generation, ZoomImage image, TextView counter, Ref.IntRef index, View previous, View next, final ProgressBar progress, final TextView error) {
        if (dialog.isShowing() && !objectRef.element.isEmpty()) {
            generation.element++;
            final int token = generation.element;
            image.resetZoom();
            counter.setText((index.element + 1) + " / " + objectRef.element.size());
            show$navigation(previous, index, next, objectRef, true);
            show$loading(progress, error);
            NetworkImages.INSTANCE.loadKolsonPath(image, objectRef.element.get(index.element), (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 4) != 0 ? null : null, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 8) != 0 ? null : null, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 16) != 0 ? false : false, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 32) != 0 ? 17301579 : 0, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 64) != 0 ? 17301579 : 0, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 128) != 0 ? null : new Function1<Drawable, Unit>() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaGallery$show$display$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    if (token == generation.element) {
                        progress.setVisibility(8);
                    }
                }
            }, (AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR & 256) != 0 ? null : new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaGallery$show$display$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    if (token == generation.element) {
                        UmbrellaGallery.show$failed(progress, error, "Не удалось загрузить изображение");
                    }
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [T, kotlinx.coroutines.Job] */
    private static final void show$loadCatalog(Ref.ObjectRef<Job> objectRef, Ref.IntRef generation, ZoomImage image, Fragment $fragment, ProgressBar progress, TextView error, View previous, Ref.IntRef index, View next, Ref.ObjectRef<List<String>> objectRef2, FragmentActivity activity, Dialog dialog, TextView counter) {
        Job job = objectRef.element;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        generation.element++;
        NetworkImages.INSTANCE.clear(image);
        show$loading(progress, error);
        show$navigation(previous, index, next, objectRef2, false);
        LifecycleOwner viewLifecycleOwner = $fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        objectRef.element = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new UmbrellaGallery$show$loadCatalog$1(activity, objectRef2, index, dialog, generation, image, counter, previous, next, progress, error, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$move(Ref.ObjectRef<List<String>> objectRef, Ref.IntRef index, Dialog dialog, Ref.IntRef generation, ZoomImage image, TextView counter, View previous, View next, ProgressBar progress, TextView error, int delta) {
        int target;
        if (!objectRef.element.isEmpty() && (target = RangesKt___RangesKt.coerceIn(index.element + delta, 0, CollectionsKt__CollectionsKt.getLastIndex(objectRef.element))) != index.element) {
            index.element = target;
            show$display(dialog, objectRef, generation, image, counter, index, previous, next, progress, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$1(Ref.ObjectRef images, Ref.IntRef index, Dialog dialog, Ref.IntRef generation, ZoomImage image, TextView $counter, View $previous, View $next, ProgressBar $progress, TextView $error, View it) {
        Intrinsics.checkNotNullParameter(images, "$images");
        Intrinsics.checkNotNullParameter(index, "$index");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(generation, "$generation");
        Intrinsics.checkNotNullParameter(image, "$image");
        show$move(images, index, dialog, generation, image, $counter, $previous, $next, $progress, $error, -1);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.umbrella.UmbrellaGallery$show$3 */
    /* JADX INFO: compiled from: UmbrellaGallery.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    /* synthetic */ class C56913 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        final /* synthetic */ TextView $counter;
        final /* synthetic */ Dialog $dialog;
        final /* synthetic */ TextView $error;
        final /* synthetic */ Ref.IntRef $generation;
        final /* synthetic */ ZoomImage $image;
        final /* synthetic */ Ref.ObjectRef<List<String>> $images;
        final /* synthetic */ Ref.IntRef $index;
        final /* synthetic */ View $next;
        final /* synthetic */ View $previous;
        final /* synthetic */ ProgressBar $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C56913(Ref.ObjectRef<List<String>> objectRef, Ref.IntRef intRef, Dialog dialog, Ref.IntRef intRef2, ZoomImage zoomImage, TextView textView, View view, View view2, ProgressBar progressBar, TextView textView2) {
            super(1, Intrinsics.Kotlin.class, "move", "show$move(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$IntRef;Landroid/app/Dialog;Lkotlin/jvm/internal/Ref$IntRef;Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaGallery$ZoomImage;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;Landroid/widget/ProgressBar;Landroid/widget/TextView;I)V", 0);
            this.$images = objectRef;
            this.$index = intRef;
            this.$dialog = dialog;
            this.$generation = intRef2;
            this.$image = zoomImage;
            this.$counter = textView;
            this.$previous = view;
            this.$next = view2;
            this.$progress = progressBar;
            this.$error = textView2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int p0) {
            UmbrellaGallery.show$move(this.$images, this.$index, this.$dialog, this.$generation, this.$image, this.$counter, this.$previous, this.$next, this.$progress, this.$error, p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$2(Ref.ObjectRef images, Ref.IntRef index, Dialog dialog, Ref.IntRef generation, ZoomImage image, TextView $counter, View $previous, View $next, ProgressBar $progress, TextView $error, View it) {
        Intrinsics.checkNotNullParameter(images, "$images");
        Intrinsics.checkNotNullParameter(index, "$index");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(generation, "$generation");
        Intrinsics.checkNotNullParameter(image, "$image");
        show$move(images, index, dialog, generation, image, $counter, $previous, $next, $progress, $error, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$3(Ref.ObjectRef request, Ref.IntRef generation, ZoomImage image, Fragment fragment, ProgressBar $progress, TextView $error, View $previous, Ref.IntRef index, View $next, Ref.ObjectRef images, FragmentActivity activity, Dialog dialog, TextView $counter, View it) {
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(generation, "$generation");
        Intrinsics.checkNotNullParameter(image, "$image");
        Intrinsics.checkNotNullParameter(fragment, "$fragment");
        Intrinsics.checkNotNullParameter(index, "$index");
        Intrinsics.checkNotNullParameter(images, "$images");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        show$loadCatalog(request, generation, image, fragment, $progress, $error, $previous, index, $next, images, activity, dialog, $counter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$4(Dialog dialog, View it) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$5(Ref.ObjectRef request, Ref.IntRef generation, ZoomImage image, Lifecycle lifecycle, UmbrellaGallery$show$observer$1 observer, DialogInterface it) {
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(generation, "$generation");
        Intrinsics.checkNotNullParameter(image, "$image");
        Intrinsics.checkNotNullParameter(lifecycle, "$lifecycle");
        Intrinsics.checkNotNullParameter(observer, "$observer");
        Job job = (Job) request.element;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        generation.element++;
        NetworkImages.INSTANCE.clear(image);
        lifecycle.removeObserver(observer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: UmbrellaGallery.kt */
    @Metadata(m4415d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0006\u0010\u001a\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaGallery$ZoomImage;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "gestures", "Landroid/view/GestureDetector;", "onSwipe", "Lkotlin/Function1;", "", "", "getOnSwipe", "()Lkotlin/jvm/functions/Function1;", "setOnSwipe", "(Lkotlin/jvm/functions/Function1;)V", "px", "", "py", "scale", "Landroid/view/ScaleGestureDetector;", "zoom", "onTouchEvent", "", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "performClick", "resetZoom", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    static final class ZoomImage extends AppCompatImageView {
        private final GestureDetector gestures;
        private Function1<? super Integer, Unit> onSwipe;
        private float px;
        private float py;
        private final ScaleGestureDetector scale;
        private float zoom;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ZoomImage(Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.onSwipe = new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaGallery$ZoomImage$onSwipe$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int it) {
                }
            };
            this.zoom = 1.0f;
            this.scale = new ScaleGestureDetector(context, new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaGallery$ZoomImage$scale$1
                @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
                public boolean onScale(ScaleGestureDetector detector) {
                    Intrinsics.checkNotNullParameter(detector, "detector");
                    this.this$0.zoom = RangesKt___RangesKt.coerceIn(this.this$0.zoom * detector.getScaleFactor(), 1.0f, 5.0f);
                    this.this$0.setScaleX(this.this$0.zoom);
                    this.this$0.setScaleY(this.this$0.zoom);
                    if (this.this$0.zoom == 1.0f) {
                        this.this$0.setTranslationX(0.0f);
                        this.this$0.setTranslationY(0.0f);
                    }
                    return true;
                }
            });
            this.gestures = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaGallery$ZoomImage$gestures$1
                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public boolean onDown(MotionEvent e) {
                    Intrinsics.checkNotNullParameter(e, "e");
                    return true;
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                public boolean onDoubleTap(MotionEvent e) {
                    Intrinsics.checkNotNullParameter(e, "e");
                    if (this.this$0.zoom <= 1.0f) {
                        this.this$0.zoom = 2.0f;
                        this.this$0.setScaleX(this.this$0.zoom);
                        this.this$0.setScaleY(this.this$0.zoom);
                        return true;
                    }
                    this.this$0.resetZoom();
                    return true;
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public boolean onFling(MotionEvent a2, MotionEvent b, float vx, float vy) {
                    Intrinsics.checkNotNullParameter(b, "b");
                    if (!(this.this$0.zoom == 1.0f) || a2 == null || Math.abs(b.getX() - a2.getX()) <= 70.0f || Math.abs(vx) <= Math.abs(vy)) {
                        return false;
                    }
                    this.this$0.getOnSwipe().invoke(Integer.valueOf(b.getX() < a2.getX() ? 1 : -1));
                    return true;
                }
            });
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }

        public final Function1<Integer, Unit> getOnSwipe() {
            return this.onSwipe;
        }

        public final void setOnSwipe(Function1<? super Integer, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            this.onSwipe = function1;
        }

        public final void resetZoom() {
            this.zoom = 1.0f;
            setScaleX(1.0f);
            setScaleY(1.0f);
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.scale.onTouchEvent(event);
            this.gestures.onTouchEvent(event);
            if (event.getActionMasked() == 2 && this.zoom > 1.0f && !this.scale.isInProgress() && event.getPointerCount() == 1) {
                float f = 1;
                float f2 = 2;
                setTranslationX(RangesKt___RangesKt.coerceIn((getTranslationX() + event.getRawX()) - this.px, ((-getWidth()) * (this.zoom - f)) / f2, (getWidth() * (this.zoom - f)) / f2));
                setTranslationY(RangesKt___RangesKt.coerceIn((getTranslationY() + event.getRawY()) - this.py, ((-getHeight()) * (this.zoom - f)) / f2, (getHeight() * (this.zoom - f)) / f2));
            }
            this.px = event.getRawX();
            this.py = event.getRawY();
            if (event.getActionMasked() == 1) {
                performClick();
            }
            return true;
        }

        @Override // android.view.View
        public boolean performClick() {
            return super.performClick();
        }
    }
}
