package com.blackhub.bronline.neizzir.typefaces;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.blackhub.bronline.neizzir.Utils;

/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
public class CheckBoxWindow extends LinearLayout {
    public Callback callback;
    public ImageView check;
    public LinearLayout checkboxwindow;
    Context context;
    public LinearLayout expand;
    public boolean isChecked;
    public TextView title;

    public interface Callback {
        void onChanged(boolean z);
    }

    public void setChecked(boolean isch) {
        this.isChecked = isch;
        if (this.callback != null) {
            this.callback.onChanged(this.isChecked);
        }
        if (this.isChecked) {
            this.check.setAlpha(0.0f);
            this.check.animate().alpha(1.0f).setDuration(400L);
        } else {
            this.check.setAlpha(this.check.getAlpha());
            this.check.animate().alpha(0.0f).setDuration(400L);
        }
    }

    public void setCallback(Callback call) {
        this.callback = call;
    }

    public void setText(String t) {
        this.title.setText(t);
    }

    public CheckBoxWindow(Context ctx) {
        super(ctx);
        this.isChecked = false;
        this.context = ctx;
        setOrientation(0);
        this.checkboxwindow = new LinearLayout(this.context);
        GradientDrawable grad = new GradientDrawable();
        grad.setCornerRadius(10.0f);
        grad.setColor(-12303292);
        this.checkboxwindow.setBackgroundDrawable(grad);
        this.checkboxwindow.setPadding(dpi(1.0f), dpi(1.0f), dpi(1.0f), dpi(1.0f));
        this.check = new ImageView(this.context);
        Utils.SetAssets(this.context, this.check, "check.png");
        this.check.setColorFilter(-1);
        this.checkboxwindow.addView(this.check, -1, -1);
        this.expand = new LinearLayout(this.context);
        this.expand.setGravity(17);
        this.expand.addView(this.checkboxwindow, -1, -1);
        this.title = new TextView(this.context);
        this.title.setTextSize(8.5f);
        this.title.setTypeface(Utils.font(this.context));
        this.title.setTextColor(-1);
        this.title.setGravity(16);
        this.title.setPadding(dpi(5.0f), 0, 0, 0);
        View.OnClickListener clck = new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.typefaces.CheckBoxWindow.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                CheckBoxWindow.this.setChecked(!CheckBoxWindow.this.isChecked);
            }
        };
        this.checkboxwindow.setOnClickListener(clck);
        this.title.setOnClickListener(clck);
        setOnClickListener(clck);
        addView(this.expand, Utils.m1421dp(this.context, 13.0f), Utils.m1421dp(this.context, 13.0f));
        addView(this.title, -1, -1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, Utils.m1421dp(this.context, 18.0f)));
        setGravity(16);
        setChecked(false);
    }

    public int dpi(float dp) {
        float scale = this.context.getResources().getDisplayMetrics().density;
        return (int) ((dp * scale) + 0.5f);
    }
}
