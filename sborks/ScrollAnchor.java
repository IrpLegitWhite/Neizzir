package com.blackhub.bronline.neizzir.fragments.sborks;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NeizzirSborksFragment.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/ScrollAnchor;", "", "folderName", "", "topOffset", "", "(Ljava/lang/String;I)V", "getFolderName", "()Ljava/lang/String;", "getTopOffset", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
final /* data */ class ScrollAnchor {
    private final String folderName;
    private final int topOffset;

    public static /* synthetic */ ScrollAnchor copy$default(ScrollAnchor scrollAnchor, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = scrollAnchor.folderName;
        }
        if ((i2 & 2) != 0) {
            i = scrollAnchor.topOffset;
        }
        return scrollAnchor.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFolderName() {
        return this.folderName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTopOffset() {
        return this.topOffset;
    }

    public final ScrollAnchor copy(String folderName, int topOffset) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        return new ScrollAnchor(folderName, topOffset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollAnchor)) {
            return false;
        }
        ScrollAnchor scrollAnchor = (ScrollAnchor) other;
        return Intrinsics.areEqual(this.folderName, scrollAnchor.folderName) && this.topOffset == scrollAnchor.topOffset;
    }

    public int hashCode() {
        return (this.folderName.hashCode() * 31) + Integer.hashCode(this.topOffset);
    }

    public String toString() {
        return "ScrollAnchor(folderName=" + this.folderName + ", topOffset=" + this.topOffset + ')';
    }

    public ScrollAnchor(String folderName, int topOffset) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        this.folderName = folderName;
        this.topOffset = topOffset;
    }

    public final String getFolderName() {
        return this.folderName;
    }

    public final int getTopOffset() {
        return this.topOffset;
    }
}
