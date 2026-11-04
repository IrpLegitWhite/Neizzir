package com.blackhub.bronline.neizzir.network;

import kotlin.Metadata;
import kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: compiled from: NetworkModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007¨\u0006\u0016"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/DownloadProgress;", "", "downloadedBytes", "", "totalBytes", "(JJ)V", "getDownloadedBytes", "()J", "percent", "", "getPercent", "()I", "getTotalBytes", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class DownloadProgress {
    private final long downloadedBytes;
    private final long totalBytes;

    public static /* synthetic */ DownloadProgress copy$default(DownloadProgress downloadProgress, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = downloadProgress.downloadedBytes;
        }
        if ((i & 2) != 0) {
            j2 = downloadProgress.totalBytes;
        }
        return downloadProgress.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDownloadedBytes() {
        return this.downloadedBytes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTotalBytes() {
        return this.totalBytes;
    }

    public final DownloadProgress copy(long downloadedBytes, long totalBytes) {
        return new DownloadProgress(downloadedBytes, totalBytes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadProgress)) {
            return false;
        }
        DownloadProgress downloadProgress = (DownloadProgress) other;
        return this.downloadedBytes == downloadProgress.downloadedBytes && this.totalBytes == downloadProgress.totalBytes;
    }

    public int hashCode() {
        return (Long.hashCode(this.downloadedBytes) * 31) + Long.hashCode(this.totalBytes);
    }

    public String toString() {
        return "DownloadProgress(downloadedBytes=" + this.downloadedBytes + ", totalBytes=" + this.totalBytes + ')';
    }

    public DownloadProgress(long downloadedBytes, long totalBytes) {
        this.downloadedBytes = downloadedBytes;
        this.totalBytes = totalBytes;
    }

    public final long getDownloadedBytes() {
        return this.downloadedBytes;
    }

    public final long getTotalBytes() {
        return this.totalBytes;
    }

    public final int getPercent() {
        if (this.totalBytes > 0) {
            return RangesKt___RangesKt.coerceIn((int) ((this.downloadedBytes * 100) / this.totalBytes), 0, 100);
        }
        return -1;
    }
}
