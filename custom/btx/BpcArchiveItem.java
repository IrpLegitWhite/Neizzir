package com.blackhub.bronline.neizzir.fragments.custom.btx;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BpcArchiveModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\nHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcArchiveItem;", "", "file", "Ljava/io/File;", "relativePath", "", "sizeBytes", "", "lastModified", "textureCount", "", "supported", "", "(Ljava/io/File;Ljava/lang/String;JJIZ)V", "getFile", "()Ljava/io/File;", "getLastModified", "()J", "getRelativePath", "()Ljava/lang/String;", "getSizeBytes", "getSupported", "()Z", "getTextureCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class BpcArchiveItem {
    private final File file;
    private final long lastModified;
    private final String relativePath;
    private final long sizeBytes;
    private final boolean supported;
    private final int textureCount;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRelativePath() {
        return this.relativePath;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLastModified() {
        return this.lastModified;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTextureCount() {
        return this.textureCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getSupported() {
        return this.supported;
    }

    public final BpcArchiveItem copy(File file, String relativePath, long sizeBytes, long lastModified, int textureCount, boolean supported) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        return new BpcArchiveItem(file, relativePath, sizeBytes, lastModified, textureCount, supported);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BpcArchiveItem)) {
            return false;
        }
        BpcArchiveItem bpcArchiveItem = (BpcArchiveItem) other;
        return Intrinsics.areEqual(this.file, bpcArchiveItem.file) && Intrinsics.areEqual(this.relativePath, bpcArchiveItem.relativePath) && this.sizeBytes == bpcArchiveItem.sizeBytes && this.lastModified == bpcArchiveItem.lastModified && this.textureCount == bpcArchiveItem.textureCount && this.supported == bpcArchiveItem.supported;
    }

    public int hashCode() {
        return (((((((((this.file.hashCode() * 31) + this.relativePath.hashCode()) * 31) + Long.hashCode(this.sizeBytes)) * 31) + Long.hashCode(this.lastModified)) * 31) + Integer.hashCode(this.textureCount)) * 31) + Boolean.hashCode(this.supported);
    }

    public String toString() {
        return "BpcArchiveItem(file=" + this.file + ", relativePath=" + this.relativePath + ", sizeBytes=" + this.sizeBytes + ", lastModified=" + this.lastModified + ", textureCount=" + this.textureCount + ", supported=" + this.supported + ')';
    }

    public BpcArchiveItem(File file, String relativePath, long sizeBytes, long lastModified, int textureCount, boolean supported) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        this.file = file;
        this.relativePath = relativePath;
        this.sizeBytes = sizeBytes;
        this.lastModified = lastModified;
        this.textureCount = textureCount;
        this.supported = supported;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getRelativePath() {
        return this.relativePath;
    }

    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    public final long getLastModified() {
        return this.lastModified;
    }

    public final int getTextureCount() {
        return this.textureCount;
    }

    public final boolean getSupported() {
        return this.supported;
    }
}
