package com.blackhub.bronline.neizzir.fragments.custom.manager;

import android.content.Context;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import kotlin.Metadata;

/* JADX INFO: compiled from: AccessoriesManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0002¨\u0006\u0004"}, m4416d2 = {CalendarKeys.DAYS_GAME_KEY, "", "Landroid/content/Context;", "value", "app_debug"}, m4417k = 2, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class AccessoriesManagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dp */
    public static final int m1424dp(Context $this$dp, int value) {
        return (int) (value * $this$dp.getResources().getDisplayMetrics().density);
    }
}
