package com.blackhub.bronline.neizzir.fragments.custom.util;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager;
import com.google.android.material.card.MaterialCardView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProgressDialogHelper.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¨\u0006\r"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/util/ProgressDialogHelper;", "", "()V", "show", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "title", "", "message", "updateMessage", "", "dialog", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class ProgressDialogHelper {
    public static final ProgressDialogHelper INSTANCE = new ProgressDialogHelper();

    private ProgressDialogHelper() {
    }

    public static /* synthetic */ Dialog show$default(ProgressDialogHelper progressDialogHelper, Context context, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "Установка";
        }
        if ((i & 4) != 0) {
            str2 = "Упаковка файлов...";
        }
        return progressDialogHelper.show(context, str, str2);
    }

    public final Dialog show(Context context, String title, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        final float density = context.getResources().getDisplayMetrics().density;
        Function1<Integer, Integer> function1 = new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.ProgressDialogHelper$show$dp$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Integer invoke(int value) {
                return Integer.valueOf((int) (value * density));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        };
        AlertDialog dialog = new AlertDialog.Builder(context).create();
        Intrinsics.checkNotNullExpressionValue(dialog, "create(...)");
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        MaterialCardView cardWrap = new MaterialCardView(context);
        FrameLayout.LayoutParams $this$show_u24lambda_u241_u24lambda_u240 = new FrameLayout.LayoutParams(-1, -2);
        $this$show_u24lambda_u241_u24lambda_u240.setMargins(function1.invoke(32).intValue(), function1.invoke(48).intValue(), function1.invoke(32).intValue(), function1.invoke(48).intValue());
        cardWrap.setLayoutParams($this$show_u24lambda_u241_u24lambda_u240);
        cardWrap.setRadius(24.0f * density);
        cardWrap.setCardElevation(12.0f * density);
        cardWrap.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        cardWrap.setStrokeWidth(function1.invoke(1).intValue());
        cardWrap.setStrokeColor(Color.parseColor("#2D2D35"));
        LinearLayout rootLayout = new LinearLayout(context);
        rootLayout.setOrientation(1);
        rootLayout.setGravity(17);
        rootLayout.setPadding(function1.invoke(32).intValue(), function1.invoke(28).intValue(), function1.invoke(32).intValue(), function1.invoke(28).intValue());
        ProgressBar $this$show_u24lambda_u243 = new ProgressBar(context);
        $this$show_u24lambda_u243.setIndeterminate(true);
        $this$show_u24lambda_u243.setIndeterminateTintList(ColorStateList.valueOf(Color.parseColor("#00E5CC")));
        $this$show_u24lambda_u243.setLayoutParams(new LinearLayout.LayoutParams(function1.invoke(48).intValue(), function1.invoke(48).intValue()));
        rootLayout.addView($this$show_u24lambda_u243);
        TextView $this$show_u24lambda_u245 = new TextView(context);
        $this$show_u24lambda_u245.setText(title);
        $this$show_u24lambda_u245.setTextSize(18.0f);
        $this$show_u24lambda_u245.setTextColor(-1);
        $this$show_u24lambda_u245.setTypeface(null, 1);
        $this$show_u24lambda_u245.setGravity(17);
        LinearLayout.LayoutParams $this$show_u24lambda_u245_u24lambda_u244 = new LinearLayout.LayoutParams(-2, -2);
        $this$show_u24lambda_u245_u24lambda_u244.topMargin = function1.invoke(20).intValue();
        $this$show_u24lambda_u245.setLayoutParams($this$show_u24lambda_u245_u24lambda_u244);
        rootLayout.addView($this$show_u24lambda_u245);
        TextView $this$show_u24lambda_u247 = new TextView(context);
        $this$show_u24lambda_u247.setText(message);
        $this$show_u24lambda_u247.setTextSize(14.0f);
        $this$show_u24lambda_u247.setTextColor(Color.parseColor(TCPSettingsManager.COLOR_HINT));
        $this$show_u24lambda_u247.setGravity(17);
        LinearLayout.LayoutParams $this$show_u24lambda_u247_u24lambda_u246 = new LinearLayout.LayoutParams(-2, -2);
        $this$show_u24lambda_u247_u24lambda_u246.topMargin = function1.invoke(8).intValue();
        $this$show_u24lambda_u247.setLayoutParams($this$show_u24lambda_u247_u24lambda_u246);
        rootLayout.addView($this$show_u24lambda_u247);
        cardWrap.addView(rootLayout);
        dialog.setView(cardWrap);
        dialog.show();
        return dialog;
    }

    public final void updateMessage(Dialog dialog, String message) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(message, "message");
        AlertDialog alertDialog = dialog instanceof AlertDialog ? (AlertDialog) dialog : null;
        MaterialCardView cardWrap = alertDialog != null ? (MaterialCardView) alertDialog.findViewById(R.id.content) : null;
        TextView messageView = cardWrap != null ? (TextView) cardWrap.findViewById(R.id.message) : null;
        if (messageView == null) {
            return;
        }
        messageView.setText(message);
    }
}
