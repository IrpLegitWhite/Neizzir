package com.blackhub.bronline.neizzir.fragments.custom.util;

import com.blackhub.bronline.game.core.constants.MediaPlayerThemeConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RemoteCustomModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003Jm\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006'"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomItem;", "", "id", "", "remotePath", "files", "", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomFile;", "previewPath", "logoPath", MediaPlayerThemeConstants.MEDIA_ELEMENT_VIDEO_PATH_NAME, "infoPath", "installPaths", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getFiles", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getInfoPath", "getInstallPaths", "getLogoPath", "getPreviewPath", "getRemotePath", "getVideoPath", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class RemoteCustomItem {
    private final List<RemoteCustomFile> files;
    private final String id;
    private final String infoPath;
    private final List<RemoteCustomFile> installPaths;
    private final String logoPath;
    private final String previewPath;
    private final String remotePath;
    private final String videoPath;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRemotePath() {
        return this.remotePath;
    }

    public final List<RemoteCustomFile> component3() {
        return this.files;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPreviewPath() {
        return this.previewPath;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLogoPath() {
        return this.logoPath;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVideoPath() {
        return this.videoPath;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getInfoPath() {
        return this.infoPath;
    }

    public final List<RemoteCustomFile> component8() {
        return this.installPaths;
    }

    public final RemoteCustomItem copy(String id, String remotePath, List<RemoteCustomFile> files, String previewPath, String logoPath, String videoPath, String infoPath, List<RemoteCustomFile> installPaths) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(installPaths, "installPaths");
        return new RemoteCustomItem(id, remotePath, files, previewPath, logoPath, videoPath, infoPath, installPaths);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteCustomItem)) {
            return false;
        }
        RemoteCustomItem remoteCustomItem = (RemoteCustomItem) other;
        return Intrinsics.areEqual(this.id, remoteCustomItem.id) && Intrinsics.areEqual(this.remotePath, remoteCustomItem.remotePath) && Intrinsics.areEqual(this.files, remoteCustomItem.files) && Intrinsics.areEqual(this.previewPath, remoteCustomItem.previewPath) && Intrinsics.areEqual(this.logoPath, remoteCustomItem.logoPath) && Intrinsics.areEqual(this.videoPath, remoteCustomItem.videoPath) && Intrinsics.areEqual(this.infoPath, remoteCustomItem.infoPath) && Intrinsics.areEqual(this.installPaths, remoteCustomItem.installPaths);
    }

    public int hashCode() {
        return (((((((((((((this.id.hashCode() * 31) + this.remotePath.hashCode()) * 31) + this.files.hashCode()) * 31) + (this.previewPath == null ? 0 : this.previewPath.hashCode())) * 31) + (this.logoPath == null ? 0 : this.logoPath.hashCode())) * 31) + (this.videoPath == null ? 0 : this.videoPath.hashCode())) * 31) + (this.infoPath != null ? this.infoPath.hashCode() : 0)) * 31) + this.installPaths.hashCode();
    }

    public String toString() {
        return "RemoteCustomItem(id=" + this.id + ", remotePath=" + this.remotePath + ", files=" + this.files + ", previewPath=" + this.previewPath + ", logoPath=" + this.logoPath + ", videoPath=" + this.videoPath + ", infoPath=" + this.infoPath + ", installPaths=" + this.installPaths + ')';
    }

    public RemoteCustomItem(String id, String remotePath, List<RemoteCustomFile> files, String previewPath, String logoPath, String videoPath, String infoPath, List<RemoteCustomFile> installPaths) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(installPaths, "installPaths");
        this.id = id;
        this.remotePath = remotePath;
        this.files = files;
        this.previewPath = previewPath;
        this.logoPath = logoPath;
        this.videoPath = videoPath;
        this.infoPath = infoPath;
        this.installPaths = installPaths;
    }

    public /* synthetic */ RemoteCustomItem(String str, String str2, List list, String str3, String str4, String str5, String str6, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }

    public final String getId() {
        return this.id;
    }

    public final String getRemotePath() {
        return this.remotePath;
    }

    public final List<RemoteCustomFile> getFiles() {
        return this.files;
    }

    public final String getPreviewPath() {
        return this.previewPath;
    }

    public final String getLogoPath() {
        return this.logoPath;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final String getInfoPath() {
        return this.infoPath;
    }

    public final List<RemoteCustomFile> getInstallPaths() {
        return this.installPaths;
    }
}
