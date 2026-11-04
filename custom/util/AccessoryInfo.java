package com.blackhub.bronline.neizzir.fragments.custom.util;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: AccessoryInfo.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/util/AccessoryInfo;", "", "channelId", "", "telegramLink", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getDescription", "getTelegramLink", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class AccessoryInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String channelId;
    private final String description;
    private final String telegramLink;

    public static /* synthetic */ AccessoryInfo copy$default(AccessoryInfo accessoryInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accessoryInfo.channelId;
        }
        if ((i & 2) != 0) {
            str2 = accessoryInfo.telegramLink;
        }
        if ((i & 4) != 0) {
            str3 = accessoryInfo.description;
        }
        return accessoryInfo.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTelegramLink() {
        return this.telegramLink;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final AccessoryInfo copy(String channelId, String telegramLink, String description) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        return new AccessoryInfo(channelId, telegramLink, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessoryInfo)) {
            return false;
        }
        AccessoryInfo accessoryInfo = (AccessoryInfo) other;
        return Intrinsics.areEqual(this.channelId, accessoryInfo.channelId) && Intrinsics.areEqual(this.telegramLink, accessoryInfo.telegramLink) && Intrinsics.areEqual(this.description, accessoryInfo.description);
    }

    public int hashCode() {
        return (((this.channelId.hashCode() * 31) + (this.telegramLink == null ? 0 : this.telegramLink.hashCode())) * 31) + (this.description != null ? this.description.hashCode() : 0);
    }

    public String toString() {
        return "AccessoryInfo(channelId=" + this.channelId + ", telegramLink=" + this.telegramLink + ", description=" + this.description + ')';
    }

    public AccessoryInfo(String channelId, String telegramLink, String description) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        this.channelId = channelId;
        this.telegramLink = telegramLink;
        this.description = description;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getTelegramLink() {
        return this.telegramLink;
    }

    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: compiled from: AccessoryInfo.kt */
    @Metadata(m4415d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/util/AccessoryInfo$Companion;", "", "()V", "parseRequired", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/AccessoryInfo;", "json", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AccessoryInfo parseRequired(String json) {
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject obj = new JSONObject(json);
            String strOptString = obj.optString("channel_id", "");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            String channelId = StringsKt__StringsKt.trim((CharSequence) strOptString).toString();
            if (!(channelId.length() > 0)) {
                throw new IllegalArgumentException("channel_id is required".toString());
            }
            String strOptString2 = obj.optString("telegram_link", "");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
            String string = StringsKt__StringsKt.trim((CharSequence) strOptString2).toString();
            String str = null;
            if (string.length() == 0) {
                string = null;
            }
            String str2 = string;
            String strOptString3 = obj.optString("description", "");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
            String string2 = StringsKt__StringsKt.trim((CharSequence) strOptString3).toString();
            if (!(string2.length() == 0)) {
                str = string2;
            }
            return new AccessoryInfo(channelId, str2, str);
        }
    }
}
