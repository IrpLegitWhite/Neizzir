package com.blackhub.bronline.neizzir.fragments.sborks.config;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.helpshift.util.ConfigValues;
import kotlin.Metadata;

/* JADX INFO: compiled from: ApiConfig.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000f"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/config/MirrorState;", "", "()V", "apiIndex", "", "getApiIndex", "()I", "setApiIndex", "(I)V", "contentIndex", "getContentIndex", "setContentIndex", ConfigValues.SOURCE_API, "", FirebaseAnalytics.Param.CONTENT, "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class MirrorState {
    public static final MirrorState INSTANCE = new MirrorState();
    private static volatile int apiIndex;
    private static volatile int contentIndex;

    private MirrorState() {
    }

    public final int getContentIndex() {
        return contentIndex;
    }

    public final void setContentIndex(int i) {
        contentIndex = i;
    }

    public final int getApiIndex() {
        return apiIndex;
    }

    public final void setApiIndex(int i) {
        apiIndex = i;
    }

    public final String content() {
        return ApiConfig.INSTANCE.getCONTENT_BASES().get(contentIndex);
    }

    public final String api() {
        return ApiConfig.INSTANCE.getAPI_BASES().get(apiIndex);
    }
}
