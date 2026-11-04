package com.blackhub.bronline.neizzir.fragments.custom.btx;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BpcArchiveModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcTextureEntry;", "", "archivePath", "", "displayName", "sizeBytes", "", "previewState", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/PreviewState;", "isSelected", "", "(Ljava/lang/String;Ljava/lang/String;JLcom/blackhub/bronline/neizzir/fragments/custom/btx/PreviewState;Z)V", "getArchivePath", "()Ljava/lang/String;", "getDisplayName", "()Z", "getPreviewState", "()Lcom/blackhub/bronline/neizzir/fragments/custom/btx/PreviewState;", "getSizeBytes", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class BpcTextureEntry {
    private final String archivePath;
    private final String displayName;
    private final boolean isSelected;
    private final PreviewState previewState;
    private final long sizeBytes;

    public static /* synthetic */ BpcTextureEntry copy$default(BpcTextureEntry bpcTextureEntry, String str, String str2, long j, PreviewState previewState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bpcTextureEntry.archivePath;
        }
        if ((i & 2) != 0) {
            str2 = bpcTextureEntry.displayName;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            j = bpcTextureEntry.sizeBytes;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            previewState = bpcTextureEntry.previewState;
        }
        PreviewState previewState2 = previewState;
        if ((i & 16) != 0) {
            z = bpcTextureEntry.isSelected;
        }
        return bpcTextureEntry.copy(str, str3, j2, previewState2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getArchivePath() {
        return this.archivePath;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PreviewState getPreviewState() {
        return this.previewState;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final BpcTextureEntry copy(String archivePath, String displayName, long sizeBytes, PreviewState previewState, boolean isSelected) {
        Intrinsics.checkNotNullParameter(archivePath, "archivePath");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(previewState, "previewState");
        return new BpcTextureEntry(archivePath, displayName, sizeBytes, previewState, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BpcTextureEntry)) {
            return false;
        }
        BpcTextureEntry bpcTextureEntry = (BpcTextureEntry) other;
        return Intrinsics.areEqual(this.archivePath, bpcTextureEntry.archivePath) && Intrinsics.areEqual(this.displayName, bpcTextureEntry.displayName) && this.sizeBytes == bpcTextureEntry.sizeBytes && Intrinsics.areEqual(this.previewState, bpcTextureEntry.previewState) && this.isSelected == bpcTextureEntry.isSelected;
    }

    public int hashCode() {
        return (((((((this.archivePath.hashCode() * 31) + this.displayName.hashCode()) * 31) + Long.hashCode(this.sizeBytes)) * 31) + this.previewState.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    public String toString() {
        return "BpcTextureEntry(archivePath=" + this.archivePath + ", displayName=" + this.displayName + ", sizeBytes=" + this.sizeBytes + ", previewState=" + this.previewState + ", isSelected=" + this.isSelected + ')';
    }

    public BpcTextureEntry(String archivePath, String displayName, long sizeBytes, PreviewState previewState, boolean isSelected) {
        Intrinsics.checkNotNullParameter(archivePath, "archivePath");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(previewState, "previewState");
        this.archivePath = archivePath;
        this.displayName = displayName;
        this.sizeBytes = sizeBytes;
        this.previewState = previewState;
        this.isSelected = isSelected;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BpcTextureEntry(String str, String str2, long j, PreviewState previewState, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        PreviewState previewState2;
        boolean z2;
        if ((i & 8) == 0) {
            previewState2 = previewState;
        } else {
            previewState2 = PreviewState.Loading.INSTANCE;
        }
        if ((i & 16) == 0) {
            z2 = z;
        } else {
            z2 = false;
        }
        this(str, str2, j, previewState2, z2);
    }

    public final String getArchivePath() {
        return this.archivePath;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    public final PreviewState getPreviewState() {
        return this.previewState;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }
}
