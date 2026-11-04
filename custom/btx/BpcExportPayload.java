package com.blackhub.bronline.neizzir.fragments.custom.btx;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BpcArchiveModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcExportPayload;", "", "relativePath", "", "bytes", "", "mimeType", "(Ljava/lang/String;[BLjava/lang/String;)V", "getBytes", "()[B", "getMimeType", "()Ljava/lang/String;", "getRelativePath", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class BpcExportPayload {
    private final byte[] bytes;
    private final String mimeType;
    private final String relativePath;

    public static /* synthetic */ BpcExportPayload copy$default(BpcExportPayload bpcExportPayload, String str, byte[] bArr, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bpcExportPayload.relativePath;
        }
        if ((i & 2) != 0) {
            bArr = bpcExportPayload.bytes;
        }
        if ((i & 4) != 0) {
            str2 = bpcExportPayload.mimeType;
        }
        return bpcExportPayload.copy(str, bArr, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRelativePath() {
        return this.relativePath;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getBytes() {
        return this.bytes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    public final BpcExportPayload copy(String relativePath, byte[] bytes, String mimeType) {
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        return new BpcExportPayload(relativePath, bytes, mimeType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BpcExportPayload)) {
            return false;
        }
        BpcExportPayload bpcExportPayload = (BpcExportPayload) other;
        return Intrinsics.areEqual(this.relativePath, bpcExportPayload.relativePath) && Intrinsics.areEqual(this.bytes, bpcExportPayload.bytes) && Intrinsics.areEqual(this.mimeType, bpcExportPayload.mimeType);
    }

    public int hashCode() {
        return (((this.relativePath.hashCode() * 31) + Arrays.hashCode(this.bytes)) * 31) + this.mimeType.hashCode();
    }

    public String toString() {
        return "BpcExportPayload(relativePath=" + this.relativePath + ", bytes=" + Arrays.toString(this.bytes) + ", mimeType=" + this.mimeType + ')';
    }

    public BpcExportPayload(String relativePath, byte[] bytes, String mimeType) {
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.relativePath = relativePath;
        this.bytes = bytes;
        this.mimeType = mimeType;
    }

    public final String getRelativePath() {
        return this.relativePath;
    }

    public final byte[] getBytes() {
        return this.bytes;
    }

    public final String getMimeType() {
        return this.mimeType;
    }
}
