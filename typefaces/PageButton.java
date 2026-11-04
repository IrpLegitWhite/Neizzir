package com.blackhub.bronline.neizzir.typefaces;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import com.blackhub.bronline.neizzir.Utils;

/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
public class PageButton extends LinearLayout {
    View __isopen;
    ImageView _pagesrc;
    TextView _pagetitle;
    public Callback callback;
    Context context;

    public interface Callback {
        void onClick();
    }

    public void show() {
        this._pagetitle.setTextColor(Colors.TEXT_BUTTON);
        this._pagetitle.setGravity(17);
        setOrientation(0);
        setPadding(5, 5, 5, 5);
        setGravity(17);
        GradientDrawable design = new GradientDrawable();
        design.setColor(Colors.SWITCH_ACTIVE);
        design.setCornerRadius(8.0f);
        setBackgroundDrawable(design);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-1, Utils.m1421dp(this.context, 27.0f), 0.0f);
        lp.leftMargin = 0;
        lp.topMargin = 0;
        lp.rightMargin = 0;
        lp.bottomMargin = 5;
        setLayoutParams(lp);
    }

    public void hide() {
        this._pagetitle.setTextColor(-1);
        this._pagetitle.setGravity(17);
        this.__isopen.setVisibility(8);
        setOrientation(0);
        setPadding(5, 5, 5, 5);
        setGravity(17);
        GradientDrawable design = new GradientDrawable();
        design.setColor(Colors.SWITCH_INACTIVE);
        design.setCornerRadius(8.0f);
        setBackgroundDrawable(design);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-1, Utils.m1421dp(this.context, 27.0f), 0.0f);
        lp.leftMargin = 0;
        lp.topMargin = 0;
        lp.rightMargin = 0;
        lp.bottomMargin = 5;
        setLayoutParams(lp);
    }

    public void anim() {
        Utils.anim(this, 0);
    }

    public PageButton(Context context, String __text, String __src) {
        super(context);
        this.context = context;
        setOrientation(0);
        setPadding(5, 5, 5, 5);
        setGravity(17);
        GradientDrawable design = new GradientDrawable();
        design.setColor(Colors.SWITCH_INACTIVE);
        design.setCornerRadius(10.0f);
        design.setStroke(0, SupportMenu.CATEGORY_MASK);
        setBackgroundDrawable(design);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-1, Utils.m1421dp(context, 27.0f), 0.0f);
        lp.leftMargin = 0;
        lp.topMargin = 0;
        lp.rightMargin = 0;
        lp.bottomMargin = 5;
        setLayoutParams(lp);
        this._pagesrc = new ImageView(context);
        this._pagesrc.setPadding(5, 5, 5, 5);
        GradientDrawable design2 = new GradientDrawable();
        design2.setColor(0);
        design2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        design2.setStroke(0, -16776961);
        this._pagesrc.setBackgroundDrawable(design2);
        LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(Utils.m1421dp(context, 15.0f), Utils.m1421dp(context, 15.0f), 0.0f);
        lp2.leftMargin = 0;
        lp2.topMargin = 0;
        lp2.rightMargin = 0;
        lp2.bottomMargin = 0;
        this._pagesrc.setLayoutParams(lp2);
        Utils.SetAssets(context, this._pagesrc, "icon.png");
        addView(this._pagesrc);
        this._pagetitle = new TextView(context);
        this._pagetitle.setText("TextView");
        this._pagetitle.setPadding(5, 5, 5, 5);
        this._pagetitle.setGravity(17);
        GradientDrawable design3 = new GradientDrawable();
        design3.setColor(0);
        design3.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        design3.setStroke(1, 0);
        this._pagetitle.setBackgroundDrawable(design3);
        LinearLayout.LayoutParams lp3 = new LinearLayout.LayoutParams(-2, -2, 0.0f);
        lp3.leftMargin = 0;
        lp3.topMargin = 0;
        lp3.rightMargin = 0;
        lp3.bottomMargin = 0;
        this._pagetitle.setLayoutParams(lp3);
        this._pagetitle.setTextColor(-1);
        this._pagetitle.setTextSize(11.0f);
        this._pagetitle.setTypeface(Utils.font(context));
        addView(this._pagetitle);
        LinearLayout _isopen = new LinearLayout(context);
        this.__isopen = _isopen;
        setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.typefaces.PageButton$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m14939lambda$new$0$comblackhubbronlineneizzirtypefacesPageButton(view);
            }
        });
        this._pagetitle.setText(__text);
        Utils.SetAssets(context, this._pagesrc, __src);
    }

    /* JADX INFO: renamed from: lambda$new$0$com-blackhub-bronline-neizzir-typefaces-PageButton, reason: not valid java name */
    /* synthetic */ void m14939lambda$new$0$comblackhubbronlineneizzirtypefacesPageButton(View v) {
        anim();
        if (this.callback != null) {
            this.callback.onClick();
        }
    }
}
