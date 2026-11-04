package com.blackhub.bronline.neizzir.fragments.sborks.p024ui.adapter;

import kotlin.Metadata;

/* JADX INFO: compiled from: SborksAdapter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/adapter/FolderStats;", "", "downloads", "", "likes", "hasVideo", "", "(IIZ)V", "getDownloads", "()I", "getHasVideo", "()Z", "getLikes", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class FolderStats {
    private final int downloads;
    private final boolean hasVideo;
    private final int likes;

    public static /* synthetic */ FolderStats copy$default(FolderStats folderStats, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = folderStats.downloads;
        }
        if ((i3 & 2) != 0) {
            i2 = folderStats.likes;
        }
        if ((i3 & 4) != 0) {
            z = folderStats.hasVideo;
        }
        return folderStats.copy(i, i2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDownloads() {
        return this.downloads;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLikes() {
        return this.likes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasVideo() {
        return this.hasVideo;
    }

    public final FolderStats copy(int downloads, int likes, boolean hasVideo) {
        return new FolderStats(downloads, likes, hasVideo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FolderStats)) {
            return false;
        }
        FolderStats folderStats = (FolderStats) other;
        return this.downloads == folderStats.downloads && this.likes == folderStats.likes && this.hasVideo == folderStats.hasVideo;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.downloads) * 31) + Integer.hashCode(this.likes)) * 31) + Boolean.hashCode(this.hasVideo);
    }

    public String toString() {
        return "FolderStats(downloads=" + this.downloads + ", likes=" + this.likes + ", hasVideo=" + this.hasVideo + ')';
    }

    public FolderStats(int downloads, int likes, boolean hasVideo) {
        this.downloads = downloads;
        this.likes = likes;
        this.hasVideo = hasVideo;
    }

    public final int getDownloads() {
        return this.downloads;
    }

    public final boolean getHasVideo() {
        return this.hasVideo;
    }

    public final int getLikes() {
        return this.likes;
    }
}
