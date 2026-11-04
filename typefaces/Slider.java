package com.blackhub.bronline.neizzir.typefaces;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.blackhub.bronline.neizzir.Utils;

/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
public class Slider extends LinearLayout {
    public Callback callback;
    Context context;
    public SeekBar slider;
    public TextView title;
    public TextView value;

    public interface Callback {
        void onChange(int i);
    }

    public int dpi(float dp) {
        float scale = this.context.getResources().getDisplayMetrics().density;
        return (int) ((dp * scale) + 0.5f);
    }

    public void setCallback(Callback c) {
        this.callback = c;
    }

    public void setValue(int v) {
        this.slider.setProgress(v);
        this.value.setText(String.valueOf(v));
        if (this.callback != null) {
            this.callback.onChange(v);
        }
    }

    public Slider(Context context, String text, int max, int current) {
        super(context);
        this.context = context;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
        this.slider = new SeekBar(context);
        this.slider.setMax(max);
        this.slider.setProgress(current);
        GradientDrawable thumb = new GradientDrawable();
        thumb.setColor(-1);
        thumb.setSize(dpi(3.0f), dpi(13.0f));
        thumb.setCornerRadius(10.0f);
        this.slider.setPadding(0, 0, 0, 0);
        thumb.setTintMode(PorterDuff.Mode.MULTIPLY);
        GradientDrawable btn = new GradientDrawable();
        btn.setColor(-12303292);
        btn.setSize(-1, dpi(13.0f));
        btn.setCornerRadius(8.0f);
        btn.setTintMode(PorterDuff.Mode.MULTIPLY);
        this.slider.setThumb(thumb);
        this.slider.setProgressDrawable(btn);
        this.slider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.blackhub.bronline.neizzir.typefaces.Slider.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar sl, int v, boolean b) {
                Slider.this.setValue(v);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar sl) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar sl) {
            }
        });
        this.slider.setLayoutParams(layoutParams1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        this.value = new TextView(context);
        this.value.setText(String.valueOf(current));
        this.value.setTextSize(8.5f);
        this.value.setTypeface(Utils.font(context));
        this.value.setTextColor(-1);
        this.value.setGravity(17);
        layoutParams2.addRule(3, this.slider.getId());
        this.value.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.slider);
        relativeLayout.addView(this.value);
        addView(relativeLayout, new LinearLayout.LayoutParams(dpi(120.0f), -1, 0.0f));
        LinearLayout rightlayout = new LinearLayout(context);
        this.title = new TextView(context);
        this.title.setText(text);
        this.title.setTextSize(8.5f);
        this.title.setTypeface(Utils.font(context));
        this.title.setTextColor(-1);
        this.title.setGravity(16);
        this.title.setPadding(dpi(4.0f), 0, 0, 0);
        rightlayout.addView(this.title, -2, -1);
        addView(rightlayout, new LinearLayout.LayoutParams(-2, -1));
        setPadding(0, 0, 0, 0);
        setOrientation(0);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-1, Utils.m1421dp(context, 13.0f));
        lp.bottomMargin = dpi(3.0f);
        lp.topMargin = dpi(3.0f);
        setLayoutParams(lp);
    }
}
