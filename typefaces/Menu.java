package com.blackhub.bronline.neizzir.typefaces;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Handler;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import com.blackhub.bronline.game.gui.inventory.Constants;
import com.blackhub.bronline.neizzir.KolsonLibrary;
import com.blackhub.bronline.neizzir.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
public class Menu {
    private static final int CELLS_PER_ROW = 3;
    TextView Close;
    protected int HEIGHT;
    protected int WIDTH;
    protected LinearLayout __page;
    public ImageView __pagesrc;
    public TextView __pagetitle;
    protected ScrollView __scroll;
    LinearLayout _close;
    LinearLayout _pages;
    protected FrameLayout _parentBox;
    LinearLayout _scroll;
    protected Context context;
    TextView leftBottomTextMenu;
    LinearLayout leftHeaderMenu;
    LinearLayout leftMenu;
    TextView leftTopTextMenu;
    LinearLayout linear33;
    LinearLayout menulayout;
    ImageView pngclose;
    TextView statusView;
    protected WindowManager wmManager;
    protected WindowManager.LayoutParams wmParams;
    public ArrayList<PageButton> _pagebuttons = new ArrayList<>();
    public ArrayList<ComponentBlock> blocks = new ArrayList<>();
    public ArrayList<LinearLayout> __pages = new ArrayList<>();
    public ArrayList<CheckBoxWindowSetting> chSettings = new ArrayList<>();
    boolean _isShow = false;
    private Map<Integer, AutoGridState> autoPages = new HashMap();
    View.OnTouchListener handleMotionTouch = new View.OnTouchListener() { // from class: com.blackhub.bronline.neizzir.typefaces.Menu.1
        double clock = Constants.DEFAULT_DOUBLE_VALUE;
        private float initX;
        private float initY;
        private float touchX;
        private float touchY;

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View vw, MotionEvent ev) {
            switch (ev.getAction()) {
                case 0:
                    this.initX = Menu.this.wmParams.x;
                    this.initY = Menu.this.wmParams.y;
                    this.touchX = ev.getRawX();
                    this.touchY = ev.getRawY();
                    this.clock = System.currentTimeMillis();
                    break;
                case 1:
                    if (!Menu.this._isShow && System.currentTimeMillis() < this.clock + 200.0d) {
                        Menu.this.showMenu();
                        break;
                    }
                    break;
                case 2:
                    Menu.this.wmParams.x = ((int) this.initX) + ((int) (ev.getRawX() - this.touchX));
                    Menu.this.wmParams.y = ((int) this.initY) + ((int) (ev.getRawY() - this.touchY));
                    Menu.this.wmManager.updateViewLayout(vw, Menu.this.wmParams);
                    break;
            }
            return true;
        }
    };

    private static String name() {
        return "NEIZZIR Menu";
    }

    private static String name2() {
        return "by Kolson";
    }

    public Typeface google(Context yes) {
        return Typeface.createFromAsset(yes.getAssets(), "muller_bold.ttf");
    }

    protected void init(Context context) {
        this.context = context;
        this._parentBox = new FrameLayout(context);
        this._parentBox.setOnTouchListener(this.handleMotionTouch);
        this.wmManager = ((Activity) context).getWindowManager();
        int aditionalFlags = 8388608 | 131072;
        this.wmParams = new WindowManager.LayoutParams(-2, -2, 0, 0, 2, aditionalFlags | 33554696, -2);
        this.wmParams.gravity = 17;
    }

    public int dpi(float dp) {
        float scale = this.context.getResources().getDisplayMetrics().density;
        return (int) ((dp * scale) + 0.5f);
    }

    public void showMenu() {
        this._isShow = true;
        this._parentBox.removeAllViews();
        this._parentBox.addView(this.menulayout);
        ObjectAnimator scaleDown = ObjectAnimator.ofPropertyValuesHolder(this.menulayout, PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f));
        PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f);
        scaleDown.setDuration(350L);
        scaleDown.start();
    }

    public void hideMenu() {
        this._isShow = false;
        ObjectAnimator scaleDown = ObjectAnimator.ofPropertyValuesHolder(this.menulayout, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f));
        scaleDown.setDuration(350L);
        scaleDown.start();
        new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.neizzir.typefaces.Menu$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m14935lambda$hideMenu$0$comblackhubbronlineneizzirtypefacesMenu();
            }
        }, 350L);
    }

    /* JADX INFO: renamed from: lambda$hideMenu$0$com-blackhub-bronline-neizzir-typefaces-Menu, reason: not valid java name */
    /* synthetic */ void m14935lambda$hideMenu$0$comblackhubbronlineneizzirtypefacesMenu() {
        this._parentBox.removeAllViews();
    }

    public void newPage(final String nm, final String src) {
        LinearLayout _page = new LinearLayout(this.context);
        PageButton _butt = new PageButton(this.context, nm, src);
        final int pageid = this.__pages.size();
        this.__page.setOrientation(1);
        _page.setOrientation(1);
        this.__page.addView(_page, -1, -1);
        _page.setVisibility(8);
        this.__pages.add(_page);
        _butt.callback = new PageButton.Callback() { // from class: com.blackhub.bronline.neizzir.typefaces.Menu$$ExternalSyntheticLambda1
            @Override // com.blackhub.bronline.neizzir.typefaces.PageButton.Callback
            public final void onClick() {
                this.f$0.m14938lambda$newPage$1$comblackhubbronlineneizzirtypefacesMenu(nm, src, pageid);
            }
        };
        this._pagebuttons.add(_butt);
        this._pages.addView(_butt);
    }

    /* JADX INFO: renamed from: lambda$newPage$1$com-blackhub-bronline-neizzir-typefaces-Menu, reason: not valid java name */
    /* synthetic */ void m14938lambda$newPage$1$comblackhubbronlineneizzirtypefacesMenu(String nm, String src, int pageid) {
        this.__pagetitle.setText(nm);
        Utils.SetAssets(this.context, this.__pagesrc, src);
        showPage(pageid);
    }

    private static class AutoGridState {
        int cellsInCurrentRow;
        LinearLayout currentRow;

        private AutoGridState() {
            this.cellsInCurrentRow = 0;
        }
    }

    public void enableAutoGrid(int pageId) {
        if (!this.autoPages.containsKey(Integer.valueOf(pageId))) {
            this.autoPages.put(Integer.valueOf(pageId), new AutoGridState());
        }
    }

    public ComponentBlock nextAutoCell(int pageId) {
        AutoGridState st = this.autoPages.get(Integer.valueOf(pageId));
        if (st == null) {
            st = new AutoGridState();
            this.autoPages.put(Integer.valueOf(pageId), st);
        }
        if (st.currentRow == null || st.cellsInCurrentRow >= 3) {
            st.currentRow = new LinearLayout(this.context);
            st.currentRow.setOrientation(0);
            LinearLayout page = this.__pages.get(pageId);
            LinearLayout.LayoutParams rowLp = new LinearLayout.LayoutParams(-1, -2);
            if (page.getChildCount() > 0) {
                rowLp.topMargin = dpi(6.0f);
            }
            page.addView(st.currentRow, rowLp);
            st.cellsInCurrentRow = 0;
        }
        ComponentBlock block = new ComponentBlock(this.context, "");
        this.blocks.add(block);
        LinearLayout.LayoutParams cellLp = new LinearLayout.LayoutParams(0, -2, 1.0f);
        st.currentRow.addView(block, cellLp);
        st.cellsInCurrentRow++;
        if (st.cellsInCurrentRow < 3) {
            LinearLayout spacer = new LinearLayout(this.context);
            st.currentRow.addView(spacer, new LinearLayout.LayoutParams(dpi(5.0f), -1));
        }
        return block;
    }

    public void addFullWidth(int pageId, View v) {
        LinearLayout page = this.__pages.get(pageId);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-1, -2);
        if (page.getChildCount() > 0) {
            lp.topMargin = dpi(6.0f);
        }
        page.addView(v, lp);
    }

    private void openUrl(Context context, String url) {
        try {
            Intent i = new Intent("android.intent.action.VIEW", Uri.parse(url));
            i.addFlags(268435456);
            context.startActivity(i);
        } catch (Exception e) {
        }
    }

    public void showPage(int id) {
        for (PageButton pg : this._pagebuttons) {
            pg.hide();
        }
        for (LinearLayout layout : this.__pages) {
            layout.setVisibility(8);
        }
        this.__pages.get(id).setVisibility(0);
        this._pagebuttons.get(id).show();
        Utils.anim(this.__pages.get(id), 400);
    }

    private LinearLayout makeTelegramRow(final Context context, String label, final String url) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout.LayoutParams lpRow = new LinearLayout.LayoutParams(-2, -2);
        lpRow.topMargin = Utils.m1421dp(context, 8.0f);
        linearLayout.setLayoutParams(lpRow);
        int iconSize = Utils.m1421dp(context, 10.0f);
        ImageView icon = new ImageView(context);
        GradientDrawable design = new GradientDrawable();
        design.setColor(0);
        design.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        icon.setBackgroundDrawable(design);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(iconSize, iconSize);
        lp.rightMargin = Utils.m1421dp(context, 4.0f);
        icon.setLayoutParams(lp);
        Utils.SetAssets(context, icon, "ic_telegram.png");
        TextView link = new TextView(context);
        link.setText(label);
        link.setTextColor(Colors.TEXT_LINK);
        link.setTextSize(9.5f);
        link.setTypeface(Utils.font(context));
        link.setPadding(Utils.m1421dp(context, 2.0f), 0, 0, 0);
        SpannableString ss = new SpannableString(label);
        ss.setSpan(new UnderlineSpan(), 0, label.length(), 0);
        link.setText(ss);
        link.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.typefaces.Menu$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1434x8f985429(context, url, view);
            }
        });
        linearLayout.addView(icon);
        linearLayout.addView(link);
        return linearLayout;
    }

    /* JADX INFO: renamed from: lambda$makeTelegramRow$2$com-blackhub-bronline-neizzir-typefaces-Menu */
    /* synthetic */ void m1434x8f985429(Context context, String url, View v) {
        openUrl(context, url);
    }

    public Menu(Context context) {
        String suffix;
        int suffixColor;
        init(context);
        this.menulayout = new LinearLayout(context);
        this.menulayout.setOrientation(1);
        this.menulayout.setPadding(0, 0, 0, 0);
        this.menulayout.setGravity(16);
        GradientDrawable design = new GradientDrawable();
        design.setColor(Colors.BACKGROUND);
        design.setCornerRadius(10.0f);
        this.menulayout.setBackgroundDrawable(design);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(dpi(425.0f), dpi(275.0f), 0.0f);
        lp.leftMargin = 0;
        lp.topMargin = 0;
        lp.rightMargin = 0;
        lp.bottomMargin = 0;
        this.menulayout.setLayoutParams(lp);
        this.linear33 = new LinearLayout(context);
        this.linear33.setOrientation(0);
        this.linear33.setPadding(0, 0, 0, 0);
        this.linear33.setGravity(51);
        GradientDrawable design2 = new GradientDrawable();
        design2.setColor(0);
        design2.setCornerRadius(10.0f);
        this.linear33.setBackgroundDrawable(design2);
        LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(-1, -1, 0.0f);
        lp2.leftMargin = 0;
        lp2.topMargin = 0;
        lp2.rightMargin = 0;
        lp2.bottomMargin = 0;
        this.linear33.setLayoutParams(lp2);
        this.menulayout.addView(this.linear33);
        this.leftMenu = new LinearLayout(context);
        this.leftMenu.setOrientation(1);
        this.leftMenu.setPadding(0, 0, 0, 0);
        this.leftMenu.setGravity(51);
        GradientDrawable design3 = new GradientDrawable();
        design3.setColor(Colors.BLOCK_BACKGROUND);
        design3.setCornerRadii(new float[]{10.0f, 10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.0f, 10.0f});
        this.leftMenu.setBackgroundDrawable(design3);
        LinearLayout.LayoutParams lp3 = new LinearLayout.LayoutParams(dpi(111.0f), -1, 0.0f);
        lp3.leftMargin = 0;
        lp3.topMargin = 0;
        lp3.rightMargin = 0;
        lp3.bottomMargin = 0;
        this.leftMenu.setLayoutParams(lp3);
        this.linear33.addView(this.leftMenu);
        this.leftHeaderMenu = new LinearLayout(context);
        this.leftHeaderMenu.setOrientation(1);
        this.leftHeaderMenu.setPadding(Utils.m1421dp(context, 10.0f), Utils.m1421dp(context, 7.0f), Utils.m1421dp(context, 10.0f), Utils.m1421dp(context, 7.0f));
        this.leftHeaderMenu.setGravity(1);
        GradientDrawable design4 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Colors.BACKGROUND, Colors.BLOCK_BACKGROUND});
        design4.setCornerRadii(new float[]{10.0f, 10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        design4.setStroke(Utils.m1421dp(context, 1.0f), Colors.DIVIDER);
        this.leftHeaderMenu.setBackgroundDrawable(design4);
        LinearLayout.LayoutParams lp4 = new LinearLayout.LayoutParams(-1, dpi(86.0f), 0.0f);
        lp4.leftMargin = 0;
        lp4.topMargin = 0;
        lp4.rightMargin = 0;
        lp4.bottomMargin = 0;
        this.leftHeaderMenu.setLayoutParams(lp4);
        this.leftMenu.addView(this.leftHeaderMenu);
        this.leftTopTextMenu = new TextView(context);
        this.leftTopTextMenu.setText(name());
        this.leftTopTextMenu.setPadding(0, 0, 0, 0);
        this.leftTopTextMenu.setGravity(17);
        this.leftTopTextMenu.setTextColor(Colors.TEXT_HEADER);
        this.leftTopTextMenu.setTextSize(12.5f);
        this.leftTopTextMenu.setTypeface(Utils.font(context));
        GradientDrawable design5 = new GradientDrawable();
        design5.setColor(0);
        design5.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        design5.setStroke(0, 0);
        this.leftTopTextMenu.setBackgroundDrawable(design5);
        LinearLayout.LayoutParams lp5 = new LinearLayout.LayoutParams(-2, -2, 0.0f);
        lp5.leftMargin = 0;
        lp5.topMargin = 0;
        lp5.rightMargin = 0;
        lp5.bottomMargin = 0;
        this.leftTopTextMenu.setLayoutParams(lp5);
        this.leftHeaderMenu.addView(this.leftTopTextMenu);
        this.leftBottomTextMenu = new TextView(context);
        this.leftBottomTextMenu.setText(name2());
        this.leftBottomTextMenu.setPadding(0, Utils.m1421dp(context, 2.0f), 0, 0);
        this.leftBottomTextMenu.setGravity(17);
        this.leftBottomTextMenu.setTextColor(Colors.TEXT_SECONDARY);
        this.leftBottomTextMenu.setTextSize(10.5f);
        this.leftBottomTextMenu.setTypeface(Utils.font(context));
        LinearLayout.LayoutParams lp6 = new LinearLayout.LayoutParams(-2, -2, 0.0f);
        lp6.leftMargin = 0;
        lp6.topMargin = 0;
        lp6.rightMargin = 0;
        lp6.bottomMargin = 0;
        this.leftBottomTextMenu.setLayoutParams(lp6);
        this.leftHeaderMenu.addView(this.leftBottomTextMenu);
        this.leftHeaderMenu.addView(makeTelegramRow(context, "@MrKolson", "https://t.me/MrKolson"));
        this.statusView = new TextView(context);
        this.statusView.setPadding(0, Utils.m1421dp(context, 4.0f), 0, 0);
        this.statusView.setGravity(17);
        this.statusView.setTypeface(Utils.font(context));
        this.statusView.setTextSize(9.5f);
        if (KolsonLibrary.isPremiumUser()) {
            suffix = "Premium";
            suffixColor = Colors.STATE_SUCCESS;
        } else {
            suffix = "Обычный";
            suffixColor = Colors.STATE_ERROR;
        }
        String full = "Статус: " + suffix;
        SpannableString ss = new SpannableString(full);
        ss.setSpan(new ForegroundColorSpan(suffixColor), "Статус: ".length(), full.length(), 33);
        this.statusView.setTextColor(-1);
        this.statusView.setText(ss);
        this.leftHeaderMenu.addView(this.statusView);
        this._pages = new LinearLayout(context);
        this._pages.setOrientation(1);
        this._pages.setPadding(10, 10, 10, 10);
        this._pages.setGravity(51);
        GradientDrawable design6 = new GradientDrawable();
        design6.setColor(0);
        this._pages.setBackgroundDrawable(design6);
        LinearLayout.LayoutParams lp7 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        lp7.leftMargin = 0;
        lp7.topMargin = 0;
        lp7.rightMargin = 0;
        lp7.bottomMargin = 0;
        this._pages.setLayoutParams(lp7);
        this.leftMenu.addView(this._pages);
        this._close = new LinearLayout(context);
        this._close.setOrientation(0);
        this._close.setPadding(0, 0, 0, 0);
        this._close.setGravity(17);
        this._close.setY(dpi(26.0f));
        GradientDrawable design7 = new GradientDrawable();
        design7.setColor(Colors.SWITCH_INACTIVE);
        design7.setCornerRadius(10.0f);
        design7.setStroke(0, SupportMenu.CATEGORY_MASK);
        this._close.setBackgroundDrawable(design7);
        LinearLayout.LayoutParams lp8 = new LinearLayout.LayoutParams(-1, dpi(27.0f), 0.0f);
        lp8.leftMargin = 10;
        lp8.topMargin = 0;
        lp8.rightMargin = 10;
        lp8.bottomMargin = 0;
        this._close.setLayoutParams(lp8);
        this.leftMenu.addView(this._close);
        this.pngclose = new ImageView(context);
        this.pngclose.setPadding(5, 5, 5, 5);
        this.pngclose.setX(dpi(-7.0f));
        GradientDrawable design8 = new GradientDrawable();
        design8.setColor(0);
        design8.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        design8.setStroke(0, -16776961);
        this.pngclose.setBackgroundDrawable(design8);
        LinearLayout.LayoutParams lp9 = new LinearLayout.LayoutParams(dpi(15.0f), dpi(15.0f), 0.0f);
        lp9.leftMargin = 0;
        lp9.topMargin = 0;
        lp9.rightMargin = 0;
        lp9.bottomMargin = 0;
        this.pngclose.setLayoutParams(lp9);
        Utils.SetAssets(context, this.pngclose, "close.png");
        this._close.addView(this.pngclose);
        this.Close = new TextView(context);
        this.Close.setText(" Закрыть");
        this.Close.setPadding(0, 0, 0, 0);
        this.Close.setGravity(17);
        this.Close.setX(dpi(-7.0f));
        GradientDrawable design9 = new GradientDrawable();
        design9.setColor(0);
        design9.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        design9.setStroke(0, 0);
        this.Close.setBackgroundDrawable(design9);
        LinearLayout.LayoutParams lp10 = new LinearLayout.LayoutParams(-2, -2, 0.0f);
        lp10.leftMargin = 0;
        lp10.topMargin = 0;
        lp10.rightMargin = 0;
        lp10.bottomMargin = 0;
        this.Close.setLayoutParams(lp10);
        this.Close.setTextColor(-1);
        this.Close.setTextSize(9.0f);
        this.Close.setTypeface(Utils.font(context));
        this._close.addView(this.Close);
        this._scroll = new LinearLayout(context);
        this._scroll.setOrientation(1);
        this._scroll.setPadding(6, 6, 6, 6);
        this._scroll.setGravity(51);
        this._scroll.setX(dpi(-3.0f));
        GradientDrawable design10 = new GradientDrawable();
        design10.setColor(0);
        design10.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        this._scroll.setBackgroundDrawable(design10);
        LinearLayout.LayoutParams lp11 = new LinearLayout.LayoutParams(-1, -1, 0.0f);
        lp11.leftMargin = 12;
        lp11.topMargin = 10;
        lp11.rightMargin = 12;
        lp11.bottomMargin = 10;
        this._scroll.setLayoutParams(lp11);
        this.linear33.addView(this._scroll);
        TextView _pagetitle = new TextView(context);
        ImageView _pagesrc = new ImageView(context);
        this.__pagetitle = _pagetitle;
        this.__pagesrc = _pagesrc;
        TextView cls = new TextView(context);
        cls.setText("REVERSED");
        cls.setTextSize(15.0f);
        cls.setTypeface(google(context));
        cls.setGravity(17);
        cls.setTextColor(-16777216);
        cls.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.typefaces.Menu$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m14936lambda$new$3$comblackhubbronlineneizzirtypefacesMenu(view);
            }
        });
        showMenu();
        GradientDrawable grT = new GradientDrawable();
        grT.setColor(-1);
        grT.setCornerRadius(20.0f);
        cls.setBackgroundDrawable(grT);
        cls.setPadding(25, 5, 25, 5);
        int aditionalFlags = 8388608 | 131072;
        WindowManager.LayoutParams wmParams2 = new WindowManager.LayoutParams(-2, -2, 0, 20, 2, aditionalFlags | 33554696, -2);
        wmParams2.gravity = 81;
        this.wmManager.addView(cls, wmParams2);
        this._close.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.typefaces.Menu$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m14937lambda$new$4$comblackhubbronlineneizzirtypefacesMenu(view);
            }
        });
        this.__scroll = new ScrollView(context);
        this.__scroll.setFillViewport(true);
        this.__page = new LinearLayout(context);
        this.__page.setOrientation(1);
        this.__scroll.addView(this.__page, -1, -1);
        this._scroll.addView(this.__scroll, -1, -1);
        hideMenu();
        this.wmManager.addView(this._parentBox, this.wmParams);
    }

    /* JADX INFO: renamed from: lambda$new$3$com-blackhub-bronline-neizzir-typefaces-Menu, reason: not valid java name */
    /* synthetic */ void m14936lambda$new$3$comblackhubbronlineneizzirtypefacesMenu(View v) {
        if (!this._isShow) {
            showMenu();
        }
    }

    /* JADX INFO: renamed from: lambda$new$4$com-blackhub-bronline-neizzir-typefaces-Menu, reason: not valid java name */
    /* synthetic */ void m14937lambda$new$4$comblackhubbronlineneizzirtypefacesMenu(View v) {
        hideMenu();
    }
}
