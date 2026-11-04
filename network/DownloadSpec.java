package com.blackhub.bronline.neizzir.network;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NetworkModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003JF\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/DownloadSpec;", "", FirebaseAnalytics.Param.DESTINATION, "Ljava/io/File;", "expectedSize", "", "expectedSha1", "", "resume", "", "expectedSha256", "(Ljava/io/File;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/String;)V", "getDestination", "()Ljava/io/File;", "getExpectedSha1", "()Ljava/lang/String;", "getExpectedSha256", "getExpectedSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getResume", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/io/File;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/String;)Lcom/blackhub/bronline/neizzir/network/DownloadSpec;", "equals", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class DownloadSpec {
    private final File destination;
    private final String expectedSha1;
    private final String expectedSha256;
    private final Long expectedSize;
    private final boolean resume;

    public static /* synthetic */ DownloadSpec copy$default(DownloadSpec downloadSpec, File file, Long l, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            file = downloadSpec.destination;
        }
        if ((i & 2) != 0) {
            l = downloadSpec.expectedSize;
        }
        Long l2 = l;
        if ((i & 4) != 0) {
            str = downloadSpec.expectedSha1;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            z = downloadSpec.resume;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str2 = downloadSpec.expectedSha256;
        }
        return downloadSpec.copy(file, l2, str3, z2, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final File getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getExpectedSize() {
        return this.expectedSize;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExpectedSha1() {
        return this.expectedSha1;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getResume() {
        return this.resume;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExpectedSha256() {
        return this.expectedSha256;
    }

    public final DownloadSpec copy(File destination, Long expectedSize, String expectedSha1, boolean resume, String expectedSha256) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return new DownloadSpec(destination, expectedSize, expectedSha1, resume, expectedSha256);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadSpec)) {
            return false;
        }
        DownloadSpec downloadSpec = (DownloadSpec) other;
        return Intrinsics.areEqual(this.destination, downloadSpec.destination) && Intrinsics.areEqual(this.expectedSize, downloadSpec.expectedSize) && Intrinsics.areEqual(this.expectedSha1, downloadSpec.expectedSha1) && this.resume == downloadSpec.resume && Intrinsics.areEqual(this.expectedSha256, downloadSpec.expectedSha256);
    }

    public int hashCode() {
        return (((((((this.destination.hashCode() * 31) + (this.expectedSize == null ? 0 : this.expectedSize.hashCode())) * 31) + (this.expectedSha1 == null ? 0 : this.expectedSha1.hashCode())) * 31) + Boolean.hashCode(this.resume)) * 31) + (this.expectedSha256 != null ? this.expectedSha256.hashCode() : 0);
    }

    public String toString() {
        return "DownloadSpec(destination=" + this.destination + ", expectedSize=" + this.expectedSize + ", expectedSha1=" + this.expectedSha1 + ", resume=" + this.resume + ", expectedSha256=" + this.expectedSha256 + ')';
    }

    public DownloadSpec(File destination, Long expectedSize, String expectedSha1, boolean resume, String expectedSha256) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.destination = destination;
        this.expectedSize = expectedSize;
        this.expectedSha1 = expectedSha1;
        this.resume = resume;
        this.expectedSha256 = expectedSha256;
    }

    public /* synthetic */ DownloadSpec(File file, Long l, String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : str2);
    }

    public final File getDestination() {
        return this.destination;
    }

    public final Long getExpectedSize() {
        return this.expectedSize;
    }

    public final String getExpectedSha1() {
        return this.expectedSha1;
    }

    public final boolean getResume() {
        return this.resume;
    }

    public final String getExpectedSha256() {
        return this.expectedSha256;
    }
}
