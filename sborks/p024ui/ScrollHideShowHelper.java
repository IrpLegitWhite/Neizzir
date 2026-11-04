package com.blackhub.bronline.neizzir.fragments.sborks.p024ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScrollHideShowHelper.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\rJ\u0006\u0010\u0014\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\f\u0010\u0017\u001a\u00020\b*\u00020\bH\u0002R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/ScrollHideShowHelper;", "", "topCard", "Landroid/view/View;", "divider", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "visiblePartDp", "", "(Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;I)V", "accumulatedScrollDown", "accumulatedScrollUp", "isAnimating", "", "isPanelVisible", "panelHeight", "scrollThreshold", "hidePanel", "", "isVisible", "setup", "setupSmoothScrollListener", "showPanel", "dpToPx", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class ScrollHideShowHelper {
    private int accumulatedScrollDown;
    private int accumulatedScrollUp;
    private final View divider;
    private boolean isAnimating;
    private boolean isPanelVisible;
    private int panelHeight;
    private final RecyclerView recyclerView;
    private int scrollThreshold;
    private final View topCard;
    private final int visiblePartDp;

    public ScrollHideShowHelper(View topCard, View divider, RecyclerView recyclerView, int visiblePartDp) {
        Intrinsics.checkNotNullParameter(topCard, "topCard");
        Intrinsics.checkNotNullParameter(divider, "divider");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.topCard = topCard;
        this.divider = divider;
        this.recyclerView = recyclerView;
        this.visiblePartDp = visiblePartDp;
        this.isPanelVisible = true;
    }

    public /* synthetic */ ScrollHideShowHelper(View view, View view2, RecyclerView recyclerView, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, view2, recyclerView, (i2 & 8) != 0 ? 10 : i);
    }

    public final void setup() {
        this.topCard.post(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.ScrollHideShowHelper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ScrollHideShowHelper.setup$lambda$0(this.f$0);
            }
        });
        setupSmoothScrollListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setup$lambda$0(ScrollHideShowHelper this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.panelHeight = this$0.topCard.getHeight() + this$0.divider.getHeight();
        this$0.scrollThreshold = this$0.panelHeight / 3;
        ViewGroup.LayoutParams layoutParams = this$0.recyclerView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) layoutParams;
        params.topToTop = this$0.divider.getId();
        params.topMargin = 0;
        this$0.recyclerView.setLayoutParams(params);
    }

    private final void setupSmoothScrollListener() {
        this.recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.ScrollHideShowHelper.setupSmoothScrollListener.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx, dy);
                if (ScrollHideShowHelper.this.isAnimating) {
                    return;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int firstVisibleItem = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                if (firstVisibleItem == 0) {
                    if (!ScrollHideShowHelper.this.isPanelVisible) {
                        ScrollHideShowHelper.this.showPanel();
                    }
                    ScrollHideShowHelper.this.accumulatedScrollDown = 0;
                    ScrollHideShowHelper.this.accumulatedScrollUp = 0;
                    return;
                }
                if (dy > 0) {
                    ScrollHideShowHelper.this.accumulatedScrollDown += dy;
                    ScrollHideShowHelper.this.accumulatedScrollUp = 0;
                    if (ScrollHideShowHelper.this.isPanelVisible && ScrollHideShowHelper.this.accumulatedScrollDown > ScrollHideShowHelper.this.scrollThreshold) {
                        ScrollHideShowHelper.this.hidePanel();
                        return;
                    }
                    return;
                }
                if (dy < 0) {
                    ScrollHideShowHelper.this.accumulatedScrollUp += Math.abs(dy);
                    ScrollHideShowHelper.this.accumulatedScrollDown = 0;
                    if (!ScrollHideShowHelper.this.isPanelVisible && ScrollHideShowHelper.this.accumulatedScrollUp > ScrollHideShowHelper.this.scrollThreshold) {
                        ScrollHideShowHelper.this.showPanel();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hidePanel() {
        if (!this.isPanelVisible || this.isAnimating) {
            return;
        }
        this.isAnimating = true;
        this.isPanelVisible = false;
        int shift = this.panelHeight - dpToPx(this.visiblePartDp);
        this.topCard.animate().translationY(-shift).setDuration(300L).withEndAction(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.ScrollHideShowHelper$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ScrollHideShowHelper.hidePanel$lambda$1(this.f$0);
            }
        }).start();
        this.divider.animate().alpha(0.0f).setDuration(300L).start();
        ViewGroup.LayoutParams layoutParams = this.recyclerView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) layoutParams;
        params.topToTop = 0;
        params.topMargin = dpToPx(this.visiblePartDp);
        this.recyclerView.setLayoutParams(params);
        this.accumulatedScrollDown = 0;
        this.accumulatedScrollUp = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hidePanel$lambda$1(ScrollHideShowHelper this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isAnimating = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPanel() {
        if (this.isPanelVisible || this.isAnimating) {
            return;
        }
        this.isAnimating = true;
        this.isPanelVisible = true;
        this.topCard.animate().translationY(0.0f).setDuration(300L).withEndAction(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.ScrollHideShowHelper$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ScrollHideShowHelper.showPanel$lambda$2(this.f$0);
            }
        }).start();
        this.divider.animate().alpha(1.0f).setDuration(300L).start();
        ViewGroup.LayoutParams layoutParams = this.recyclerView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) layoutParams;
        params.topToTop = this.divider.getId();
        params.topMargin = 0;
        this.recyclerView.setLayoutParams(params);
        this.accumulatedScrollDown = 0;
        this.accumulatedScrollUp = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPanel$lambda$2(ScrollHideShowHelper this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isAnimating = false;
    }

    /* JADX INFO: renamed from: isVisible, reason: from getter */
    public final boolean getIsPanelVisible() {
        return this.isPanelVisible;
    }

    private final int dpToPx(int $this$dpToPx) {
        return (int) ($this$dpToPx * this.topCard.getResources().getDisplayMetrics().density);
    }
}
