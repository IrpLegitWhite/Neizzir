package com.blackhub.bronline.neizzir;

import android.content.Context;
import android.widget.TextView;
import com.blackhub.bronline.neizzir.typefaces.CheckBox;
import com.blackhub.bronline.neizzir.typefaces.CheckBoxWindow;
import com.blackhub.bronline.neizzir.typefaces.CheckBoxWindowSetting;
import com.blackhub.bronline.neizzir.typefaces.ColorChange;
import com.blackhub.bronline.neizzir.typefaces.ComponentBlock;
import com.blackhub.bronline.neizzir.typefaces.Menu;
import com.blackhub.bronline.neizzir.typefaces.Slider;

/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
public class Main {
    protected static Context context;
    private KolsonLibrary kolsonLibrary;

    public final void MenuMain(Context context2) {
        context = context2;
        Menu menu = new Menu(context2);
        this.kolsonLibrary = new KolsonLibrary();
        String[] ft = KolsonLibrary.getFeatures();
        for (String token : ft) {
            String[] s = token.split("_");
            switch (s[0]) {
                case "page":
                    menu.newPage(s[1], s[2]);
                    break;
                case "BLOCK":
                    int pageId = Integer.parseInt(s[1]);
                    if ("auto".equalsIgnoreCase(s[2])) {
                        menu.enableAutoGrid(pageId);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "title":
                    int pageId2 = Integer.parseInt(s[1]);
                    int IsChSettings = Integer.parseInt(s[2]);
                    TextView Title = new TextView(context2);
                    Title.setText(s[3]);
                    Title.setTextSize(9.5f);
                    Title.setTypeface(Utils.font(context2));
                    Title.setTextColor(-1);
                    if (IsChSettings == 0) {
                        menu.addFullWidth(pageId2, Title);
                        break;
                    } else {
                        menu.chSettings.get(pageId2).main.addView(Title);
                        break;
                    }
                    break;
                case "slider":
                    final int pageId3 = Integer.parseInt(s[1]);
                    final int cfgKey = Integer.parseInt(s[2]);
                    int current = KolsonLibrary.getFeatureState(pageId3, cfgKey);
                    Slider slider = new Slider(context2, s[3], Integer.parseInt(s[4]), current);
                    slider.setCallback(new Slider.Callback() { // from class: com.blackhub.bronline.neizzir.Main$$ExternalSyntheticLambda0
                        @Override // com.blackhub.bronline.neizzir.typefaces.Slider.Callback
                        public final void onChange(int i) {
                            this.f$0.m14782lambda$MenuMain$0$comblackhubbronlineneizzirMain(pageId3, cfgKey, i);
                        }
                    });
                    menu.addFullWidth(pageId3, slider);
                    break;
                case "switch":
                    final int pageId4 = Integer.parseInt(s[1]);
                    final int cfgKey2 = Integer.parseInt(s[2]);
                    String title = s[3];
                    CheckBox btn = new CheckBox(context2);
                    btn.setText(title);
                    int state = KolsonLibrary.getFeatureState(pageId4, cfgKey2);
                    btn.setChecked(state == 1);
                    btn.setCallback(new CheckBox.Callback() { // from class: com.blackhub.bronline.neizzir.Main$$ExternalSyntheticLambda1
                        @Override // com.blackhub.bronline.neizzir.typefaces.CheckBox.Callback
                        public final void onChanged(boolean z) {
                            this.f$0.m14783lambda$MenuMain$1$comblackhubbronlineneizzirMain(pageId4, cfgKey2, z);
                        }
                    });
                    ComponentBlock cell = menu.nextAutoCell(pageId4);
                    cell.main.addView(btn);
                    break;
                case "picker":
                    final int pageId5 = Integer.parseInt(s[1]);
                    final int cfgKey3 = Integer.parseInt(s[2]);
                    ColorChange button = new ColorChange(context2);
                    button.setText(s[3]);
                    int savedColor = KolsonLibrary.getSettingsState(pageId5, cfgKey3);
                    button.setColor(savedColor);
                    button.setCallback(new ColorChange.Callback() { // from class: com.blackhub.bronline.neizzir.Main$$ExternalSyntheticLambda2
                        @Override // com.blackhub.bronline.neizzir.typefaces.ColorChange.Callback
                        public final void onChanged(int i) {
                            this.f$0.m14784lambda$MenuMain$2$comblackhubbronlineneizzirMain(pageId5, cfgKey3, i);
                        }
                    });
                    menu.chSettings.get(pageId5).main.addView(button);
                    break;
                case "checkbox":
                    final int pageId6 = Integer.parseInt(s[1]);
                    final int cfgKey4 = Integer.parseInt(s[2]);
                    CheckBoxWindow button2 = new CheckBoxWindow(context2);
                    button2.setText(s[3]);
                    int state2 = KolsonLibrary.getSettingsState(pageId6, cfgKey4);
                    button2.setChecked(state2 == 1);
                    button2.setCallback(new CheckBoxWindow.Callback() { // from class: com.blackhub.bronline.neizzir.Main$$ExternalSyntheticLambda3
                        @Override // com.blackhub.bronline.neizzir.typefaces.CheckBoxWindow.Callback
                        public final void onChanged(boolean z) {
                            this.f$0.m14785lambda$MenuMain$3$comblackhubbronlineneizzirMain(pageId6, cfgKey4, z);
                        }
                    });
                    menu.chSettings.get(pageId6).main.addView(button2);
                    break;
                case "checkboxSetting":
                    final int pageId7 = Integer.parseInt(s[1]);
                    final int cfgKey5 = Integer.parseInt(s[2]);
                    CheckBoxWindowSetting button3 = new CheckBoxWindowSetting(context2, s[3]);
                    menu.chSettings.add(button3);
                    int state3 = KolsonLibrary.getFeatureState(pageId7, cfgKey5);
                    button3.setChecked(state3 == 1);
                    button3.setCallback(new CheckBoxWindowSetting.Callback() { // from class: com.blackhub.bronline.neizzir.Main$$ExternalSyntheticLambda4
                        @Override // com.blackhub.bronline.neizzir.typefaces.CheckBoxWindowSetting.Callback
                        public final void onChanged(boolean z) {
                            this.f$0.m14786lambda$MenuMain$4$comblackhubbronlineneizzirMain(pageId7, cfgKey5, z);
                        }
                    });
                    menu.addFullWidth(pageId7, button3);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: lambda$MenuMain$0$com-blackhub-bronline-neizzir-Main, reason: not valid java name */
    /* synthetic */ void m14782lambda$MenuMain$0$comblackhubbronlineneizzirMain(int pageId, int cfgKey, int value) {
        KolsonLibrary.Changes(pageId, cfgKey, value);
    }

    /* JADX INFO: renamed from: lambda$MenuMain$1$com-blackhub-bronline-neizzir-Main, reason: not valid java name */
    /* synthetic */ void m14783lambda$MenuMain$1$comblackhubbronlineneizzirMain(int i, int i2, boolean z) {
        KolsonLibrary.Changes(i, i2, z ? 1 : 0);
    }

    /* JADX INFO: renamed from: lambda$MenuMain$2$com-blackhub-bronline-neizzir-Main, reason: not valid java name */
    /* synthetic */ void m14784lambda$MenuMain$2$comblackhubbronlineneizzirMain(int pageId, int cfgKey, int value) {
        KolsonLibrary.SettingsChanges(pageId, cfgKey, value);
    }

    /* JADX INFO: renamed from: lambda$MenuMain$3$com-blackhub-bronline-neizzir-Main, reason: not valid java name */
    /* synthetic */ void m14785lambda$MenuMain$3$comblackhubbronlineneizzirMain(int i, int i2, boolean z) {
        KolsonLibrary.SettingsChanges(i, i2, z ? 1 : 0);
    }

    /* JADX INFO: renamed from: lambda$MenuMain$4$com-blackhub-bronline-neizzir-Main, reason: not valid java name */
    /* synthetic */ void m14786lambda$MenuMain$4$comblackhubbronlineneizzirMain(int i, int i2, boolean z) {
        KolsonLibrary.Changes(i, i2, z ? 1 : 0);
    }
}
