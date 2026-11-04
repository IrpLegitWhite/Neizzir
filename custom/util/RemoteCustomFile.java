package com.blackhub.bronline.neizzir.fragments.custom.util;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RemoteCustomModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomFile;", "", "path", "", "sha1", "size", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getPath", "()Ljava/lang/String;", "getSha1", "getSize", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class RemoteCustomFile {
    private final String path;
    private final String sha1;
    private final long size;

    public static /* synthetic */ RemoteCustomFile copy$default(RemoteCustomFile remoteCustomFile, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remoteCustomFile.path;
        }
        if ((i & 2) != 0) {
            str2 = remoteCustomFile.sha1;
        }
        if ((i & 4) != 0) {
            j = remoteCustomFile.size;
        }
        return remoteCustomFile.copy(str, str2, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSha1() {
        return this.sha1;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final RemoteCustomFile copy(String path, String sha1, long size) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(sha1, "sha1");
        return new RemoteCustomFile(path, sha1, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteCustomFile)) {
            return false;
        }
        RemoteCustomFile remoteCustomFile = (RemoteCustomFile) other;
        return Intrinsics.areEqual(this.path, remoteCustomFile.path) && Intrinsics.areEqual(this.sha1, remoteCustomFile.sha1) && this.size == remoteCustomFile.size;
    }

    public int hashCode() {
        return (((this.path.hashCode() * 31) + this.sha1.hashCode()) * 31) + Long.hashCode(this.size);
    }

    public String toString() {
        return "RemoteCustomFile(path=" + this.path + ", sha1=" + this.sha1 + ", size=" + this.size + ')';
    }

    public RemoteCustomFile(String path, String sha1, long size) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(sha1, "sha1");
        this.path = path;
        this.sha1 = sha1;
        this.size = size;
    }

    public /* synthetic */ RemoteCustomFile(String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? -1L : j);
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSha1() {
        return this.sha1;
    }

    public final long getSize() {
        return this.size;
    }
}
