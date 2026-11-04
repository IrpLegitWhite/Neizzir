package com.blackhub.bronline.neizzir.typefaces;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.blackhub.bronline.game.gui.inventory.Constants;
import com.blackhub.bronline.neizzir.Utils;

/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
public class CheckBoxWindowSetting extends LinearLayout {
    public Callback callback;
    public ImageView check;
    public LinearLayout checkbox;
    public FrameLayout container;
    Context context;
    public LinearLayout expand;
    public boolean isChecked;
    public boolean isWindow;
    public LinearLayout main;
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

    public CheckBoxWindowSetting(Context ctx, String text) {
        super(ctx);
        this.isChecked = false;
        this.context = ctx;
        setOrientation(0);
        this.checkbox = new LinearLayout(this.context);
        GradientDrawable grad = new GradientDrawable();
        grad.setCornerRadius(10.0f);
        grad.setColor(-12303292);
        this.checkbox.setBackgroundDrawable(grad);
        this.checkbox.setPadding(dpi(1.0f), dpi(1.0f), dpi(1.0f), dpi(1.0f));
        this.check = new ImageView(this.context);
        Utils.SetAssets(this.context, this.check, "check.png");
        this.check.setColorFilter(-1);
        this.checkbox.addView(this.check, -1, -1);
        this.expand = new LinearLayout(this.context);
        this.expand.setGravity(17);
        this.expand.addView(this.checkbox, -1, -1);
        this.title = new TextView(this.context);
        this.title.setTextSize(8.5f);
        this.title.setTypeface(Utils.font(this.context));
        this.title.setTextColor(-1);
        this.title.setGravity(16);
        this.title.setPadding(dpi(5.0f), 0, 0, 0);
        this.title.setText(text);
        final ImageView settings = new ImageView(ctx);
        Utils.SetAssets(ctx, settings, "settings.png");
        settings.setColorFilter(-7829368);
        settings.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.typefaces.CheckBoxWindowSetting.1
            @Override // android.view.View.OnClickListener
            public void onClick(View p1) {
                if (!CheckBoxWindowSetting.this.isWindow) {
                    settings.setColorFilter(-1);
                    CheckBoxWindowSetting.this.container.setVisibility(0);
                } else {
                    settings.setColorFilter(-7829368);
                    CheckBoxWindowSetting.this.container.setVisibility(8);
                }
                CheckBoxWindowSetting.this.isWindow = !CheckBoxWindowSetting.this.isWindow;
            }
        });
        View.OnClickListener clck = new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.typefaces.CheckBoxWindowSetting$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1433xae779f26(view);
            }
        };
        this.checkbox.setOnClickListener(clck);
        this.title.setOnClickListener(clck);
        setOnClickListener(clck);
        addView(this.expand, Utils.m1421dp(this.context, 13.0f), Utils.m1421dp(this.context, 13.0f));
        addView(this.title, new LinearLayout.LayoutParams(-1, -1, 1.0f));
        addView(settings, dpi(13.0f), dpi(13.0f));
        setPadding(0, 0, dpi(8.0f), 0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, Utils.m1421dp(this.context, 18.0f)));
        setGravity(16);
        setChecked(false);
        WindowCreate();
        WindowLayouts(text);
    }

    /* JADX INFO: renamed from: lambda$new$0$com-blackhub-bronline-neizzir-typefaces-CheckBoxWindowSetting */
    /* synthetic */ void m1433xae779f26(View v) {
        setChecked(!this.isChecked);
    }

    public void WindowLayouts(String text) {
        this.container.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(this.context);
        linearLayout.setPadding(dpi(4.0f), dpi(4.0f), dpi(4.0f), dpi(4.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(51);
        GradientDrawable design = new GradientDrawable();
        design.setColor(Colors.BACKGROUND);
        design.setCornerRadius(5.0f);
        design.setStroke(dpi(0.3f), Colors.DIVIDER);
        linearLayout.setBackgroundDrawable(design);
        this.container.addView(linearLayout, dpi(180.0f), dpi(200.0f));
        TextView title = new TextView(this.context);
        title.setTextSize(8.5f);
        title.setTypeface(Utils.font(this.context));
        title.setTextColor(-1);
        title.setGravity(17);
        title.setPadding(0, dpi(4.0f), 0, dpi(4.0f));
        title.setText(text);
        GradientDrawable design2 = new GradientDrawable();
        design2.setColor(Colors.BACKGROUND);
        design2.setCornerRadius(5.0f);
        design2.setStroke(dpi(0.3f), Colors.STATE_HOVER);
        title.setBackgroundDrawable(design2);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-1, -2);
        lp.bottomMargin = dpi(4.0f);
        title.setLayoutParams(lp);
        linearLayout.addView(title);
        ScrollView scroll = new ScrollView(this.context);
        GradientDrawable design3 = new GradientDrawable();
        design3.setColor(Colors.BACKGROUND);
        design3.setCornerRadius(5.0f);
        design3.setStroke(dpi(0.3f), Colors.STATE_HOVER);
        scroll.setBackgroundDrawable(design3);
        scroll.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(scroll);
        this.main = new LinearLayout(this.context);
        this.main.setOrientation(1);
        this.main.setGravity(51);
        this.main.setPadding(dpi(4.0f), dpi(4.0f), dpi(4.0f), dpi(4.0f));
        this.main.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        scroll.addView(this.main);
    }

    public void WindowCreate() {
        this.container = new FrameLayout(this.context);
        final WindowManager wmManager = ((Activity) this.context).getWindowManager();
        int aditionalFlags = 8388608 | 131072;
        final WindowManager.LayoutParams wmParams = new WindowManager.LayoutParams(-2, -2, 0, 0, 2, aditionalFlags | 33554440, -2);
        wmParams.gravity = 17;
        View.OnTouchListener handleMotionTouch = new View.OnTouchListener() { // from class: com.blackhub.bronline.neizzir.typefaces.CheckBoxWindowSetting.2
            double clock = Constants.DEFAULT_DOUBLE_VALUE;
            private float initX;
            private float initY;
            private float touchX;
            private float touchY;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View vw, MotionEvent ev) {
                switch (ev.getAction()) {
                    case 0:
                        this.initX = wmParams.x;
                        this.initY = wmParams.y;
                        this.touchX = ev.getRawX();
                        this.touchY = ev.getRawY();
                        this.clock = System.currentTimeMillis();
                        break;
                    case 2:
                        wmParams.x = ((int) this.initX) + ((int) (ev.getRawX() - this.touchX));
                        wmParams.y = ((int) this.initY) + ((int) (ev.getRawY() - this.touchY));
                        wmManager.updateViewLayout(vw, wmParams);
                        break;
                }
                return true;
            }
        };
        this.container.setOnTouchListener(handleMotionTouch);
        wmManager.addView(this.container, wmParams);
    }

    public int dpi(float dp) {
        float scale = this.context.getResources().getDisplayMetrics().density;
        return (int) ((dp * scale) + 0.5f);
    }
}
