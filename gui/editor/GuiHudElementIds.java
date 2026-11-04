package com.blackhub.bronline.neizzir.gui.editor;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: GuiEditorModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudElementIds;", "", "()V", "ARMOR_BAR", "", "ARMOR_ICON", "CHAT", "CROSSHAIR", "DAILY_CASE", "HP_BAR", "HP_ICON", "MONEY_DAILY", "MONEY_VALUE", "RADAR", "SPEEDOMETER", "TOUCH_BUTTONS", "WEAPON", "editableIds", "", "getEditableIds", "()Ljava/util/List;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class GuiHudElementIds {
    public static final String MONEY_DAILY = "MoneyAndDaily";
    public static final String TOUCH_BUTTONS = "TouchButtonsItems";
    public static final GuiHudElementIds INSTANCE = new GuiHudElementIds();
    public static final String RADAR = "Radar";
    public static final String CHAT = "Chat";
    public static final String MONEY_VALUE = "MoneyBlock";
    public static final String DAILY_CASE = "DailyCase";
    public static final String SPEEDOMETER = "OldSpeedometer";
    public static final String HP_BAR = "HpProgress";
    public static final String ARMOR_BAR = "ArmorProgress";
    public static final String HP_ICON = "HpIcon";
    public static final String ARMOR_ICON = "ArmorIcon";
    public static final String CROSSHAIR = "CrossHair";
    public static final String WEAPON = "Weapon";
    private static final List<String> editableIds = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{RADAR, CHAT, MONEY_VALUE, DAILY_CASE, SPEEDOMETER, HP_BAR, ARMOR_BAR, HP_ICON, ARMOR_ICON, CROSSHAIR, WEAPON});

    private GuiHudElementIds() {
    }

    public final List<String> getEditableIds() {
        return editableIds;
    }
}
