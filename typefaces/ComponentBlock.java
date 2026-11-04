package com.blackhub.bronline.neizzir.typefaces;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.blackhub.bronline.neizzir.Utils;

/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
public class ComponentBlock extends LinearLayout {
    Context context;
    public float corner;
    public LinearLayout main;
    public ScrollView scrl;

    public ComponentBlock(Context ctx, String name) {
        super(ctx);
        this.corner = 1.0f;
        this.context = ctx;
        setOrientation(1);
        this.main = new LinearLayout(this.context);
        this.main.setOrientation(1);
        GradientDrawable menu = new GradientDrawable();
        menu.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, this.corner, this.corner, this.corner, this.corner});
        menu.setColor(0);
        this.main.setBackgroundDrawable(menu);
        this.main.setPadding(0, 0, 0, 0);
        this.main.setMinimumHeight(Utils.m1421dp(this.context, 0.0f));
        this.scrl = new ScrollView(this.context);
        this.scrl.addView(this.main, -1, -1);
        this.scrl.setFillViewport(true);
        addView(this.scrl, new LinearLayout.LayoutParams(-1, -1));
    }
}
