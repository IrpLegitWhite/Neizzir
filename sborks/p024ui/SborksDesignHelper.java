package com.blackhub.bronline.neizzir.fragments.sborks.p024ui;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.blackhub.bronline.C3715R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: SborksDesignHelper.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/SborksDesignHelper;", "", "()V", "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class SborksDesignHelper {
    private static final String COLOR_ACCENT = "#00E5CC";
    private static final String COLOR_INACTIVE = "#666666";
    private static final String COLOR_TEXT_ACTIVE = "#FFFFFF";
    private static final String COLOR_TEXT_ACTIVE_DARK = "#0A0A0F";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: SborksDesignHelper.kt */
    @Metadata(m4415d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018J*\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u001fJ:\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u001fJ \u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006)"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/SborksDesignHelper$Companion;", "", "()V", "COLOR_ACCENT", "", "COLOR_INACTIVE", "COLOR_TEXT_ACTIVE", "COLOR_TEXT_ACTIVE_DARK", "animateClearButton", "", "button", "Landroid/widget/ImageView;", "show", "", "animateTabSwitch", "activeTab", "Landroid/widget/TextView;", "inactiveTab", "context", "Landroid/content/Context;", "fadeIn", "view", "Landroid/view/View;", TypedValues.TransitionType.S_DURATION, "", "fadeOut", "setupSearch", "editText", "Landroid/widget/EditText;", "clearButton", "onSearchChanged", "Lkotlin/Function1;", "setupTabs", "tabAll", "tabMy", "initialTabIndex", "", "onTabSelected", "updateTabStyle", "tab", "isSelected", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void setupTabs(final TextView tabAll, final TextView tabMy, final Context context, int initialTabIndex, final Function1<? super Integer, Unit> onTabSelected) {
            Intrinsics.checkNotNullParameter(tabAll, "tabAll");
            Intrinsics.checkNotNullParameter(tabMy, "tabMy");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(onTabSelected, "onTabSelected");
            updateTabStyle(tabAll, initialTabIndex == 0, context);
            updateTabStyle(tabMy, initialTabIndex == 1, context);
            tabAll.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.SborksDesignHelper$Companion$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SborksDesignHelper.Companion.setupTabs$lambda$0(tabAll, tabMy, context, onTabSelected, view);
                }
            });
            tabMy.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.SborksDesignHelper$Companion$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SborksDesignHelper.Companion.setupTabs$lambda$1(tabMy, tabAll, context, onTabSelected, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setupTabs$lambda$0(TextView tabAll, TextView tabMy, Context context, Function1 onTabSelected, View it) {
            Intrinsics.checkNotNullParameter(tabAll, "$tabAll");
            Intrinsics.checkNotNullParameter(tabMy, "$tabMy");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(onTabSelected, "$onTabSelected");
            if (tabAll.getBackground() == null || tabAll.getCurrentTextColor() != Color.parseColor("#0A0A0F")) {
                SborksDesignHelper.INSTANCE.animateTabSwitch(tabAll, tabMy, context);
                onTabSelected.invoke(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setupTabs$lambda$1(TextView tabMy, TextView tabAll, Context context, Function1 onTabSelected, View it) {
            Intrinsics.checkNotNullParameter(tabMy, "$tabMy");
            Intrinsics.checkNotNullParameter(tabAll, "$tabAll");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(onTabSelected, "$onTabSelected");
            if (tabMy.getBackground() == null || tabMy.getCurrentTextColor() != Color.parseColor("#0A0A0F")) {
                SborksDesignHelper.INSTANCE.animateTabSwitch(tabMy, tabAll, context);
                onTabSelected.invoke(1);
            }
        }

        private final void updateTabStyle(TextView tab, boolean isSelected, Context context) {
            if (isSelected) {
                tab.setBackground(ContextCompat.getDrawable(context, C3715R.drawable.neizzir20_tab_active));
                tab.setTextColor(Color.parseColor("#0A0A0F"));
            } else {
                tab.setBackground(null);
                tab.setTextColor(Color.parseColor(SborksDesignHelper.COLOR_INACTIVE));
            }
        }

        private final void animateTabSwitch(final TextView activeTab, final TextView inactiveTab, Context context) {
            activeTab.setBackground(ContextCompat.getDrawable(context, C3715R.drawable.neizzir20_tab_active));
            activeTab.setAlpha(0.0f);
            activeTab.animate().alpha(1.0f).setDuration(200L).setInterpolator(new DecelerateInterpolator()).start();
            ValueAnimator $this$animateTabSwitch_u24lambda_u243 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(activeTab.getCurrentTextColor()), Integer.valueOf(Color.parseColor("#0A0A0F")));
            $this$animateTabSwitch_u24lambda_u243.setDuration(200L);
            $this$animateTabSwitch_u24lambda_u243.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.SborksDesignHelper$Companion$$ExternalSyntheticLambda2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SborksDesignHelper.Companion.animateTabSwitch$lambda$3$lambda$2(activeTab, valueAnimator);
                }
            });
            $this$animateTabSwitch_u24lambda_u243.start();
            inactiveTab.setBackground(null);
            ValueAnimator $this$animateTabSwitch_u24lambda_u245 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(inactiveTab.getCurrentTextColor()), Integer.valueOf(Color.parseColor(SborksDesignHelper.COLOR_INACTIVE)));
            $this$animateTabSwitch_u24lambda_u245.setDuration(200L);
            $this$animateTabSwitch_u24lambda_u245.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.SborksDesignHelper$Companion$$ExternalSyntheticLambda3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SborksDesignHelper.Companion.animateTabSwitch$lambda$5$lambda$4(inactiveTab, valueAnimator);
                }
            });
            $this$animateTabSwitch_u24lambda_u245.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void animateTabSwitch$lambda$3$lambda$2(TextView activeTab, ValueAnimator it) {
            Intrinsics.checkNotNullParameter(activeTab, "$activeTab");
            Intrinsics.checkNotNullParameter(it, "it");
            Object animatedValue = it.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            activeTab.setTextColor(((Integer) animatedValue).intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void animateTabSwitch$lambda$5$lambda$4(TextView inactiveTab, ValueAnimator it) {
            Intrinsics.checkNotNullParameter(inactiveTab, "$inactiveTab");
            Intrinsics.checkNotNullParameter(it, "it");
            Object animatedValue = it.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            inactiveTab.setTextColor(((Integer) animatedValue).intValue());
        }

        public final void setupSearch(final EditText editText, final ImageView clearButton, final Function1<? super String, Unit> onSearchChanged) {
            Intrinsics.checkNotNullParameter(editText, "editText");
            Intrinsics.checkNotNullParameter(clearButton, "clearButton");
            Intrinsics.checkNotNullParameter(onSearchChanged, "onSearchChanged");
            editText.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.SborksDesignHelper$Companion$setupSearch$1
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    String query = StringsKt__StringsKt.trim((CharSequence) String.valueOf(s)).toString();
                    SborksDesignHelper.INSTANCE.animateClearButton(clearButton, query.length() > 0);
                    onSearchChanged.invoke(query);
                }
            });
            clearButton.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.SborksDesignHelper$Companion$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SborksDesignHelper.Companion.setupSearch$lambda$6(editText, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setupSearch$lambda$6(EditText editText, View it) {
            Intrinsics.checkNotNullParameter(editText, "$editText");
            editText.getText().clear();
            editText.clearFocus();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void animateClearButton(final ImageView button, boolean show) {
            if (show && button.getVisibility() != 0) {
                button.setVisibility(0);
                button.setAlpha(0.0f);
                button.animate().alpha(1.0f).setDuration(150L).start();
            } else if (!show && button.getVisibility() == 0) {
                button.animate().alpha(0.0f).setDuration(150L).withEndAction(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.SborksDesignHelper$Companion$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        SborksDesignHelper.Companion.animateClearButton$lambda$7(button);
                    }
                }).start();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void animateClearButton$lambda$7(ImageView button) {
            Intrinsics.checkNotNullParameter(button, "$button");
            button.setVisibility(8);
        }

        public static /* synthetic */ void fadeIn$default(Companion companion, View view, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = 250;
            }
            companion.fadeIn(view, j);
        }

        public final void fadeIn(View view, long duration) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setAlpha(0.0f);
            view.setVisibility(0);
            view.animate().alpha(1.0f).setDuration(duration).setInterpolator(new DecelerateInterpolator()).start();
        }

        public static /* synthetic */ void fadeOut$default(Companion companion, View view, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = 250;
            }
            companion.fadeOut(view, j);
        }

        public final void fadeOut(final View view, long duration) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.animate().alpha(0.0f).setDuration(duration).setInterpolator(new DecelerateInterpolator()).withEndAction(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.SborksDesignHelper$Companion$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SborksDesignHelper.Companion.fadeOut$lambda$8(view);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void fadeOut$lambda$8(View view) {
            Intrinsics.checkNotNullParameter(view, "$view");
            view.setVisibility(8);
            view.setAlpha(1.0f);
        }
    }
}
