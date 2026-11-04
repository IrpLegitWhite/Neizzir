package com.blackhub.bronline.neizzir.typefaces;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.blackhub.bronline.neizzir.Utils;

/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
public class CheckBox extends LinearLayout {
    public Callback callback;
    private View checkbox;
    Context context;
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
            Utils.anim(this.checkbox, 300);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-1, Utils.m1421dp(this.context, 35.0f));
            lp.leftMargin = 0;
            lp.topMargin = 0;
            lp.rightMargin = 0;
            lp.bottomMargin = 5;
            setLayoutParams(lp);
            GradientDrawable design = new GradientDrawable();
            design.setCornerRadius(8.0f);
            design.setColor(Colors.SWITCH_ACTIVE);
            setBackgroundDrawable(design);
            return;
        }
        LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(-1, Utils.m1421dp(this.context, 35.0f));
        lp2.leftMargin = 0;
        lp2.topMargin = 0;
        lp2.rightMargin = 0;
        lp2.bottomMargin = 5;
        setLayoutParams(lp2);
        GradientDrawable design2 = new GradientDrawable();
        design2.setCornerRadius(8.0f);
        design2.setColor(Colors.SWITCH_INACTIVE);
        setBackgroundDrawable(design2);
        Utils.disanim(this.checkbox, 150);
        new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.neizzir.typefaces.CheckBox$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1432x3f00063b();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: lambda$setChecked$0$com-blackhub-bronline-neizzir-typefaces-CheckBox */
    /* synthetic */ void m1432x3f00063b() {
        Utils.anim(this.checkbox, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    }

    public void setCallback(Callback call) {
        this.callback = call;
    }

    public void setText(String t) {
        this.title.setText(t);
    }

    public CheckBox(Context ctx) {
        super(ctx);
        this.isChecked = false;
        this.context = ctx;
        setOrientation(0);
        this.title = new TextView(this.context);
        this.title.setTextSize(9.5f);
        this.title.setTypeface(Utils.font(this.context));
        this.title.setTextColor(-1);
        this.title.setGravity(17);
        this.title.setPadding(0, 0, 0, 0);
        View.OnClickListener clck = new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.typefaces.CheckBox$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m14932lambda$new$1$comblackhubbronlineneizzirtypefacesCheckBox(view);
            }
        };
        this.title.setOnClickListener(clck);
        setOnClickListener(clck);
        addView(this.title, -1, -1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, Utils.m1421dp(this.context, 35.0f)));
        setChecked(false);
    }

    /* JADX INFO: renamed from: lambda$new$1$com-blackhub-bronline-neizzir-typefaces-CheckBox, reason: not valid java name */
    /* synthetic */ void m14932lambda$new$1$comblackhubbronlineneizzirtypefacesCheckBox(View v) {
        setChecked(!this.isChecked);
    }
}
