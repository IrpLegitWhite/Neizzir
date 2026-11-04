package com.blackhub.bronline.neizzir.typefaces;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.blackhub.bronline.neizzir.Utils;

/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
public class ColorChange extends LinearLayout {
    private final int POLL_MS;
    public Callback callback;
    public int color;
    Context context;
    public LinearLayout expand;
    private final Handler handler;
    private int lastColor;
    public ColorPicker picker;
    private final Runnable pollTask;
    private boolean polling;
    public PopupWindow popup;
    public TextView title;

    public interface Callback {
        void onChanged(int i);
    }

    public void setCallback(Callback call) {
        this.callback = call;
    }

    public void setText(String t) {
        this.title.setText(t);
    }

    public ColorChange(Context ctx) {
        super(ctx);
        this.color = -1;
        this.lastColor = this.color;
        this.handler = new Handler();
        this.POLL_MS = 30;
        this.polling = false;
        this.pollTask = new Runnable() { // from class: com.blackhub.bronline.neizzir.typefaces.ColorChange.1
            @Override // java.lang.Runnable
            public void run() {
                int cur = ColorChange.this.picker.getColor();
                if (cur != ColorChange.this.lastColor) {
                    ColorChange.this.lastColor = cur;
                    ColorChange.this.color = cur;
                    ColorChange.this.applyPreview(ColorChange.this.color);
                    if (ColorChange.this.callback != null) {
                        ColorChange.this.callback.onChanged(ColorChange.this.color);
                    }
                }
                if (!ColorChange.this.polling || ColorChange.this.popup == null || !ColorChange.this.popup.isShowing()) {
                    ColorChange.this.polling = false;
                } else {
                    ColorChange.this.handler.postDelayed(this, 30L);
                }
            }
        };
        this.context = ctx;
        setOrientation(0);
        setGravity(16);
        setLayoutParams(new LinearLayout.LayoutParams(-1, Utils.m1421dp(this.context, 18.0f)));
        this.expand = new LinearLayout(this.context);
        this.expand.setGravity(17);
        addView(this.expand, Utils.m1421dp(this.context, 13.0f), Utils.m1421dp(this.context, 13.0f));
        this.title = new TextView(this.context);
        this.title.setTextSize(8.5f);
        this.title.setTypeface(Utils.font(this.context));
        this.title.setTextColor(-1);
        this.title.setGravity(16);
        this.title.setPadding(dpi(5.0f), 0, 0, 0);
        addView(this.title, -1, -1);
        this.picker = new ColorPicker(this.context);
        GradientDrawable gg = new GradientDrawable();
        gg.setColor(-16777216);
        gg.setStroke(dpi(1.0f), -1);
        gg.setCornerRadii(new float[]{0.0f, 0.0f, 100.0f, 100.0f, 100.0f, 100.0f, 100.0f, 100.0f});
        this.picker.setBackgroundDrawable(gg);
        this.popup = new PopupWindow((View) this.picker, dpi(120.0f), dpi(120.0f), true);
        this.popup.setOutsideTouchable(true);
        this.popup.setElevation(10.0f);
        View.OnClickListener clck = new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.typefaces.ColorChange$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m14933lambda$new$0$comblackhubbronlineneizzirtypefacesColorChange(view);
            }
        };
        this.title.setOnClickListener(clck);
        setOnClickListener(clck);
        this.expand.setOnClickListener(clck);
        this.popup.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.blackhub.bronline.neizzir.typefaces.ColorChange$$ExternalSyntheticLambda1
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f$0.m14934lambda$new$1$comblackhubbronlineneizzirtypefacesColorChange();
            }
        });
        applyPreview(this.color);
    }

    /* JADX INFO: renamed from: lambda$new$0$com-blackhub-bronline-neizzir-typefaces-ColorChange, reason: not valid java name */
    /* synthetic */ void m14933lambda$new$0$comblackhubbronlineneizzirtypefacesColorChange(View v) {
        this.popup.showAsDropDown(v, 0, 0);
        if (!this.polling) {
            this.polling = true;
            this.handler.removeCallbacks(this.pollTask);
            this.handler.post(this.pollTask);
        }
    }

    /* JADX INFO: renamed from: lambda$new$1$com-blackhub-bronline-neizzir-typefaces-ColorChange, reason: not valid java name */
    /* synthetic */ void m14934lambda$new$1$comblackhubbronlineneizzirtypefacesColorChange() {
        this.polling = false;
        this.handler.removeCallbacks(this.pollTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyPreview(int c) {
        GradientDrawable gg = new GradientDrawable();
        gg.setColor(c);
        gg.setCornerRadius(10.0f);
        gg.setStroke(dpi(1.0f), -1);
        this.expand.setBackgroundDrawable(gg);
    }

    public void setColor(int argb) {
        this.picker.setColor(argb);
        this.color = this.picker.getColor();
        this.lastColor = this.color;
        applyPreview(this.color);
    }

    public int dpi(float dp) {
        float scale = this.context.getResources().getDisplayMetrics().density;
        return (int) ((dp * scale) + 0.5f);
    }
}
