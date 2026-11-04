package com.blackhub.bronline.neizzir.fragments.custom.util;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccessoriesInventory.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006!"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/util/AccessoryInventoryItem;", "", "id", "", "name", "", "modelId", CommonUrlParts.MODEL, "desc", "accessoryPrice", "", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;J)V", "getAccessoryPrice", "()J", "getDesc", "()Ljava/lang/String;", "getId", "()I", "getModel", "getModelId", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class AccessoryInventoryItem {
    private final long accessoryPrice;
    private final String desc;
    private final int id;
    private final String model;
    private final int modelId;
    private final String name;

    public static /* synthetic */ AccessoryInventoryItem copy$default(AccessoryInventoryItem accessoryInventoryItem, int i, String str, int i2, String str2, String str3, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = accessoryInventoryItem.id;
        }
        if ((i3 & 2) != 0) {
            str = accessoryInventoryItem.name;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            i2 = accessoryInventoryItem.modelId;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            str2 = accessoryInventoryItem.model;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = accessoryInventoryItem.desc;
        }
        String str6 = str3;
        if ((i3 & 32) != 0) {
            j = accessoryInventoryItem.accessoryPrice;
        }
        return accessoryInventoryItem.copy(i, str4, i4, str5, str6, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getModelId() {
        return this.modelId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getAccessoryPrice() {
        return this.accessoryPrice;
    }

    public final AccessoryInventoryItem copy(int id, String name, int modelId, String model, String desc, long accessoryPrice) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(desc, "desc");
        return new AccessoryInventoryItem(id, name, modelId, model, desc, accessoryPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessoryInventoryItem)) {
            return false;
        }
        AccessoryInventoryItem accessoryInventoryItem = (AccessoryInventoryItem) other;
        return this.id == accessoryInventoryItem.id && Intrinsics.areEqual(this.name, accessoryInventoryItem.name) && this.modelId == accessoryInventoryItem.modelId && Intrinsics.areEqual(this.model, accessoryInventoryItem.model) && Intrinsics.areEqual(this.desc, accessoryInventoryItem.desc) && this.accessoryPrice == accessoryInventoryItem.accessoryPrice;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.modelId)) * 31) + this.model.hashCode()) * 31) + this.desc.hashCode()) * 31) + Long.hashCode(this.accessoryPrice);
    }

    public String toString() {
        return "AccessoryInventoryItem(id=" + this.id + ", name=" + this.name + ", modelId=" + this.modelId + ", model=" + this.model + ", desc=" + this.desc + ", accessoryPrice=" + this.accessoryPrice + ')';
    }

    public AccessoryInventoryItem(int id, String name, int modelId, String model, String desc, long accessoryPrice) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.id = id;
        this.name = name;
        this.modelId = modelId;
        this.model = model;
        this.desc = desc;
        this.accessoryPrice = accessoryPrice;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getModelId() {
        return this.modelId;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final long getAccessoryPrice() {
        return this.accessoryPrice;
    }
}
