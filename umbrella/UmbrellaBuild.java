package com.blackhub.bronline.neizzir.umbrella;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UmbrellaPolicy.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaBuild;", "", "launcherVersion", "", "gameVersion", "library", "size", "", "sha256", "images", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V", "getGameVersion", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getLauncherVersion", "getLibrary", "getSha256", "getSize", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class UmbrellaBuild {
    private final String gameVersion;
    private final List<String> images;
    private final String launcherVersion;
    private final String library;
    private final String sha256;
    private final long size;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UmbrellaBuild copy$default(UmbrellaBuild umbrellaBuild, String str, String str2, String str3, long j, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = umbrellaBuild.launcherVersion;
        }
        if ((i & 2) != 0) {
            str2 = umbrellaBuild.gameVersion;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = umbrellaBuild.library;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            j = umbrellaBuild.size;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            str4 = umbrellaBuild.sha256;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            list = umbrellaBuild.images;
        }
        return umbrellaBuild.copy(str, str5, str6, j2, str7, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLauncherVersion() {
        return this.launcherVersion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGameVersion() {
        return this.gameVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLibrary() {
        return this.library;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSha256() {
        return this.sha256;
    }

    public final List<String> component6() {
        return this.images;
    }

    public final UmbrellaBuild copy(String launcherVersion, String gameVersion, String library, long size, String sha256, List<String> images) {
        Intrinsics.checkNotNullParameter(launcherVersion, "launcherVersion");
        Intrinsics.checkNotNullParameter(gameVersion, "gameVersion");
        Intrinsics.checkNotNullParameter(library, "library");
        Intrinsics.checkNotNullParameter(sha256, "sha256");
        Intrinsics.checkNotNullParameter(images, "images");
        return new UmbrellaBuild(launcherVersion, gameVersion, library, size, sha256, images);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UmbrellaBuild)) {
            return false;
        }
        UmbrellaBuild umbrellaBuild = (UmbrellaBuild) other;
        return Intrinsics.areEqual(this.launcherVersion, umbrellaBuild.launcherVersion) && Intrinsics.areEqual(this.gameVersion, umbrellaBuild.gameVersion) && Intrinsics.areEqual(this.library, umbrellaBuild.library) && this.size == umbrellaBuild.size && Intrinsics.areEqual(this.sha256, umbrellaBuild.sha256) && Intrinsics.areEqual(this.images, umbrellaBuild.images);
    }

    public int hashCode() {
        return (((((((((this.launcherVersion.hashCode() * 31) + this.gameVersion.hashCode()) * 31) + this.library.hashCode()) * 31) + Long.hashCode(this.size)) * 31) + this.sha256.hashCode()) * 31) + this.images.hashCode();
    }

    public String toString() {
        return "UmbrellaBuild(launcherVersion=" + this.launcherVersion + ", gameVersion=" + this.gameVersion + ", library=" + this.library + ", size=" + this.size + ", sha256=" + this.sha256 + ", images=" + this.images + ')';
    }

    public UmbrellaBuild(String launcherVersion, String gameVersion, String library, long size, String sha256, List<String> images) {
        Intrinsics.checkNotNullParameter(launcherVersion, "launcherVersion");
        Intrinsics.checkNotNullParameter(gameVersion, "gameVersion");
        Intrinsics.checkNotNullParameter(library, "library");
        Intrinsics.checkNotNullParameter(sha256, "sha256");
        Intrinsics.checkNotNullParameter(images, "images");
        this.launcherVersion = launcherVersion;
        this.gameVersion = gameVersion;
        this.library = library;
        this.size = size;
        this.sha256 = sha256;
        this.images = images;
    }

    public final String getGameVersion() {
        return this.gameVersion;
    }

    public final String getLauncherVersion() {
        return this.launcherVersion;
    }

    public final List<String> getImages() {
        return this.images;
    }

    public final String getLibrary() {
        return this.library;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public final long getSize() {
        return this.size;
    }
}
