package com.blackhub.bronline.neizzir.fragments.sborks.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FolderData.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001f"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/model/FolderData;", "", "folderName", "", "updateDate", "downloadCount", "", "isNew", "", "likeCount", "hasVideo", "(Ljava/lang/String;Ljava/lang/String;IZIZ)V", "getDownloadCount", "()I", "getFolderName", "()Ljava/lang/String;", "getHasVideo", "()Z", "getLikeCount", "getUpdateDate", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class FolderData {
    private final int downloadCount;
    private final String folderName;
    private final boolean hasVideo;
    private final boolean isNew;
    private final int likeCount;
    private final String updateDate;

    public static /* synthetic */ FolderData copy$default(FolderData folderData, String str, String str2, int i, boolean z, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = folderData.folderName;
        }
        if ((i3 & 2) != 0) {
            str2 = folderData.updateDate;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            i = folderData.downloadCount;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            z = folderData.isNew;
        }
        boolean z3 = z;
        if ((i3 & 16) != 0) {
            i2 = folderData.likeCount;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            z2 = folderData.hasVideo;
        }
        return folderData.copy(str, str3, i4, z3, i5, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFolderName() {
        return this.folderName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUpdateDate() {
        return this.updateDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDownloadCount() {
        return this.downloadCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLikeCount() {
        return this.likeCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getHasVideo() {
        return this.hasVideo;
    }

    public final FolderData copy(String folderName, String updateDate, int downloadCount, boolean isNew, int likeCount, boolean hasVideo) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        Intrinsics.checkNotNullParameter(updateDate, "updateDate");
        return new FolderData(folderName, updateDate, downloadCount, isNew, likeCount, hasVideo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FolderData)) {
            return false;
        }
        FolderData folderData = (FolderData) other;
        return Intrinsics.areEqual(this.folderName, folderData.folderName) && Intrinsics.areEqual(this.updateDate, folderData.updateDate) && this.downloadCount == folderData.downloadCount && this.isNew == folderData.isNew && this.likeCount == folderData.likeCount && this.hasVideo == folderData.hasVideo;
    }

    public int hashCode() {
        return (((((((((this.folderName.hashCode() * 31) + this.updateDate.hashCode()) * 31) + Integer.hashCode(this.downloadCount)) * 31) + Boolean.hashCode(this.isNew)) * 31) + Integer.hashCode(this.likeCount)) * 31) + Boolean.hashCode(this.hasVideo);
    }

    public String toString() {
        return "FolderData(folderName=" + this.folderName + ", updateDate=" + this.updateDate + ", downloadCount=" + this.downloadCount + ", isNew=" + this.isNew + ", likeCount=" + this.likeCount + ", hasVideo=" + this.hasVideo + ')';
    }

    public FolderData(String folderName, String updateDate, int downloadCount, boolean isNew, int likeCount, boolean hasVideo) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        Intrinsics.checkNotNullParameter(updateDate, "updateDate");
        this.folderName = folderName;
        this.updateDate = updateDate;
        this.downloadCount = downloadCount;
        this.isNew = isNew;
        this.likeCount = likeCount;
        this.hasVideo = hasVideo;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FolderData(String str, String str2, int i, boolean z, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        if ((i3 & 32) == 0) {
            z3 = z2;
        } else {
            z3 = false;
        }
        this(str, str2, i, z, i2, z3);
    }

    public final String getFolderName() {
        return this.folderName;
    }

    public final String getUpdateDate() {
        return this.updateDate;
    }

    public final int getDownloadCount() {
        return this.downloadCount;
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public final int getLikeCount() {
        return this.likeCount;
    }

    public final boolean getHasVideo() {
        return this.hasVideo;
    }
}
