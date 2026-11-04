package com.blackhub.bronline.neizzir.gui.editor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GuiEditorModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiTextureEntry;", "", "archivePath", "", "displayName", "sizeBytes", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getArchivePath", "()Ljava/lang/String;", "getDisplayName", "getSizeBytes", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class GuiTextureEntry {
    private final String archivePath;
    private final String displayName;
    private final long sizeBytes;

    public static /* synthetic */ GuiTextureEntry copy$default(GuiTextureEntry guiTextureEntry, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = guiTextureEntry.archivePath;
        }
        if ((i & 2) != 0) {
            str2 = guiTextureEntry.displayName;
        }
        if ((i & 4) != 0) {
            j = guiTextureEntry.sizeBytes;
        }
        return guiTextureEntry.copy(str, str2, j);
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

    public final GuiTextureEntry copy(String archivePath, String displayName, long sizeBytes) {
        Intrinsics.checkNotNullParameter(archivePath, "archivePath");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return new GuiTextureEntry(archivePath, displayName, sizeBytes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuiTextureEntry)) {
            return false;
        }
        GuiTextureEntry guiTextureEntry = (GuiTextureEntry) other;
        return Intrinsics.areEqual(this.archivePath, guiTextureEntry.archivePath) && Intrinsics.areEqual(this.displayName, guiTextureEntry.displayName) && this.sizeBytes == guiTextureEntry.sizeBytes;
    }

    public int hashCode() {
        return (((this.archivePath.hashCode() * 31) + this.displayName.hashCode()) * 31) + Long.hashCode(this.sizeBytes);
    }

    public String toString() {
        return "GuiTextureEntry(archivePath=" + this.archivePath + ", displayName=" + this.displayName + ", sizeBytes=" + this.sizeBytes + ')';
    }

    public GuiTextureEntry(String archivePath, String displayName, long sizeBytes) {
        Intrinsics.checkNotNullParameter(archivePath, "archivePath");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.archivePath = archivePath;
        this.displayName = displayName;
        this.sizeBytes = sizeBytes;
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
}
