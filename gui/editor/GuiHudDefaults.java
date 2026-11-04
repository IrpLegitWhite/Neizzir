package com.blackhub.bronline.neizzir.gui.editor;

import com.blackhub.bronline.game.core.constants.Other;
import com.helpshift.proactive.InAppViewConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: compiled from: GuiEditorModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudDefaults;", "", "()V", "DESIGN_HEIGHT", "", "DESIGN_WIDTH", "elements", "", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudElementPatch;", "getElements", "()Ljava/util/List;", "element", "id", "", "normalize", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudPatch;", "patch", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class GuiHudDefaults {
    public static final float DESIGN_HEIGHT = 1080.0f;
    public static final float DESIGN_WIDTH = 1920.0f;
    public static final GuiHudDefaults INSTANCE = new GuiHudDefaults();
    private static final List<GuiHudElementPatch> elements = CollectionsKt__CollectionsKt.listOf((Object[]) new GuiHudElementPatch[]{new GuiHudElementPatch(GuiHudElementIds.RADAR, 20.0f, 20.0f, 280.0f, 280.0f, 0.0f, false, MapsKt__MapsKt.mapOf(TuplesKt.m4423to("hp", "#FFFE4141"), TuplesKt.m4423to("armor", "#FF544BBF"), TuplesKt.m4423to("border", Other.COLOR_DEFAULT_STRING)), 96, (DefaultConstructorMarker) null), new GuiHudElementPatch(GuiHudElementIds.CHAT, 320.0f, 20.0f, 900.0f, 244.0f, 0.0f, false, (Map) null, 224, (DefaultConstructorMarker) null), new GuiHudElementPatch(GuiHudElementIds.MONEY_VALUE, 1620.0f, 132.0f, 300.0f, 52.0f, 0.0f, false, MapsKt__MapsKt.mapOf(TuplesKt.m4423to("money", Other.COLOR_DEFAULT_STRING), TuplesKt.m4423to("backgroundVisible", "1")), 96, (DefaultConstructorMarker) null), new GuiHudElementPatch(GuiHudElementIds.DAILY_CASE, 1800.0f, 200.0f, 100.0f, 100.0f, 0.0f, false, (Map) null, 224, (DefaultConstructorMarker) null), new GuiHudElementPatch(GuiHudElementIds.SPEEDOMETER, 640.0f, 880.0f, 640.0f, 180.0f, 1.1f, false, MapsKt__MapsJVMKt.mapOf(TuplesKt.m4423to("speed", "#FFF75514")), 64, (DefaultConstructorMarker) null), new GuiHudElementPatch(GuiHudElementIds.HP_BAR, 64.0f, 266.0f, 180.0f, 10.0f, 0.0f, false, MapsKt__MapsKt.mapOf(TuplesKt.m4423to("hp", "#FFFE4141"), TuplesKt.m4423to("background", "#70000000"), TuplesKt.m4423to("border", "#00FFFFFF"), TuplesKt.m4423to("borderWidth", CommonUrlParts.Values.FALSE_INTEGER), TuplesKt.m4423to(InAppViewConstants.RADIUS, "4")), 96, (DefaultConstructorMarker) null), new GuiHudElementPatch(GuiHudElementIds.ARMOR_BAR, 64.0f, 282.0f, 180.0f, 10.0f, 0.0f, false, MapsKt__MapsKt.mapOf(TuplesKt.m4423to("armor", "#FF544BBF"), TuplesKt.m4423to("background", "#70000000"), TuplesKt.m4423to("border", "#00FFFFFF"), TuplesKt.m4423to("borderWidth", CommonUrlParts.Values.FALSE_INTEGER), TuplesKt.m4423to(InAppViewConstants.RADIUS, "4")), 96, (DefaultConstructorMarker) null), new GuiHudElementPatch(GuiHudElementIds.HP_ICON, 192.0f, 242.0f, 46.0f, 46.0f, 0.0f, false, (Map) null, 224, (DefaultConstructorMarker) null), new GuiHudElementPatch(GuiHudElementIds.ARMOR_ICON, 238.0f, 34.0f, 46.0f, 46.0f, 0.0f, false, (Map) null, 224, (DefaultConstructorMarker) null), new GuiHudElementPatch(GuiHudElementIds.CROSSHAIR, 900.0f, 480.0f, 120.0f, 120.0f, 0.0f, false, (Map) null, 224, (DefaultConstructorMarker) null), new GuiHudElementPatch(GuiHudElementIds.WEAPON, 210.0f, 175.0f, 110.0f, 110.0f, 0.0f, false, MapsKt__MapsKt.mapOf(TuplesKt.m4423to("shape", "round"), TuplesKt.m4423to("backgroundVisible", "1"), TuplesKt.m4423to("background", "#99262837"), TuplesKt.m4423to("border", Other.COLOR_DEFAULT_STRING), TuplesKt.m4423to("borderWidth", "2"), TuplesKt.m4423to(InAppViewConstants.RADIUS, "16")), 96, (DefaultConstructorMarker) null)});

    private GuiHudDefaults() {
    }

    public final List<GuiHudElementPatch> getElements() {
        return elements;
    }

    public final GuiHudElementPatch element(String id) {
        Object element$iv;
        GuiHudElementPatch it;
        Intrinsics.checkNotNullParameter(id, "id");
        Iterable $this$firstOrNull$iv = elements;
        Iterator it2 = $this$firstOrNull$iv.iterator();
        do {
            if (!it2.hasNext()) {
                element$iv = null;
                break;
            }
            element$iv = it2.next();
            it = (GuiHudElementPatch) element$iv;
        } while (!Intrinsics.areEqual(it.getId(), id));
        GuiHudElementPatch guiHudElementPatch = (GuiHudElementPatch) element$iv;
        return guiHudElementPatch == null ? new GuiHudElementPatch(id, 0.0f, 0.0f, 160.0f, 80.0f, 0.0f, false, (Map) null, 224, (DefaultConstructorMarker) null) : guiHudElementPatch;
    }

    public final GuiHudPatch normalize(GuiHudPatch patch) {
        GuiHudElementPatch guiHudElementPatchCopy;
        Intrinsics.checkNotNullParameter(patch, "patch");
        Iterable $this$associateBy$iv = patch.getElements();
        int capacity$iv = RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$associateBy$iv, 10)), 16);
        Map destination$iv$iv = new LinkedHashMap(capacity$iv);
        for (Object element$iv$iv : $this$associateBy$iv) {
            GuiHudElementPatch it = (GuiHudElementPatch) element$iv$iv;
            destination$iv$iv.put(it.getId(), element$iv$iv);
        }
        Iterable $this$map$iv = elements;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            GuiHudElementPatch guiHudElementPatch = (GuiHudElementPatch) item$iv$iv;
            GuiHudElementPatch current = (GuiHudElementPatch) destination$iv$iv.get(guiHudElementPatch.getId());
            if (current == null || (guiHudElementPatchCopy = current.copy((71 & 1) != 0 ? current.id : null, (71 & 2) != 0 ? current.x : 0.0f, (71 & 4) != 0 ? current.y : 0.0f, (71 & 8) != 0 ? current.width : RangesKt___RangesKt.coerceAtLeast(current.getWidth(), 20.0f), (71 & 16) != 0 ? current.height : RangesKt___RangesKt.coerceAtLeast(current.getHeight(), 20.0f), (71 & 32) != 0 ? current.scale : RangesKt___RangesKt.coerceIn(current.getScale(), 0.2f, 3.5f), (71 & 64) != 0 ? current.visible : false, (71 & 128) != 0 ? current.colorOverrides : MapsKt__MapsKt.plus(guiHudElementPatch.getColorOverrides(), current.getColorOverrides()))) == null) {
                guiHudElementPatchCopy = guiHudElementPatch;
            }
            destination$iv$iv2.add(guiHudElementPatchCopy);
        }
        List normalized = (List) destination$iv$iv2;
        return GuiHudPatch.copy$default(patch, null, null, normalized, 3, null);
    }
}
