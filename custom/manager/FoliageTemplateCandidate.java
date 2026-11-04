package com.blackhub.bronline.neizzir.fragments.custom.manager;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FoliageManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageTemplateCandidate;", "", "archivePath", "", "entryPath", "sourcePath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArchivePath", "()Ljava/lang/String;", "getEntryPath", "getSourcePath", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class FoliageTemplateCandidate {
    private final String archivePath;
    private final String entryPath;
    private final String sourcePath;

    public static /* synthetic */ FoliageTemplateCandidate copy$default(FoliageTemplateCandidate foliageTemplateCandidate, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = foliageTemplateCandidate.archivePath;
        }
        if ((i & 2) != 0) {
            str2 = foliageTemplateCandidate.entryPath;
        }
        if ((i & 4) != 0) {
            str3 = foliageTemplateCandidate.sourcePath;
        }
        return foliageTemplateCandidate.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getArchivePath() {
        return this.archivePath;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEntryPath() {
        return this.entryPath;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSourcePath() {
        return this.sourcePath;
    }

    public final FoliageTemplateCandidate copy(String archivePath, String entryPath, String sourcePath) {
        Intrinsics.checkNotNullParameter(archivePath, "archivePath");
        Intrinsics.checkNotNullParameter(entryPath, "entryPath");
        Intrinsics.checkNotNullParameter(sourcePath, "sourcePath");
        return new FoliageTemplateCandidate(archivePath, entryPath, sourcePath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FoliageTemplateCandidate)) {
            return false;
        }
        FoliageTemplateCandidate foliageTemplateCandidate = (FoliageTemplateCandidate) other;
        return Intrinsics.areEqual(this.archivePath, foliageTemplateCandidate.archivePath) && Intrinsics.areEqual(this.entryPath, foliageTemplateCandidate.entryPath) && Intrinsics.areEqual(this.sourcePath, foliageTemplateCandidate.sourcePath);
    }

    public int hashCode() {
        return (((this.archivePath.hashCode() * 31) + this.entryPath.hashCode()) * 31) + this.sourcePath.hashCode();
    }

    public String toString() {
        return "FoliageTemplateCandidate(archivePath=" + this.archivePath + ", entryPath=" + this.entryPath + ", sourcePath=" + this.sourcePath + ')';
    }

    public FoliageTemplateCandidate(String archivePath, String entryPath, String sourcePath) {
        Intrinsics.checkNotNullParameter(archivePath, "archivePath");
        Intrinsics.checkNotNullParameter(entryPath, "entryPath");
        Intrinsics.checkNotNullParameter(sourcePath, "sourcePath");
        this.archivePath = archivePath;
        this.entryPath = entryPath;
        this.sourcePath = sourcePath;
    }

    public /* synthetic */ FoliageTemplateCandidate(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? str : str3);
    }

    public final String getArchivePath() {
        return this.archivePath;
    }

    public final String getEntryPath() {
        return this.entryPath;
    }

    public final String getSourcePath() {
        return this.sourcePath;
    }
}
