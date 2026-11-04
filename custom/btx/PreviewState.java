package com.blackhub.bronline.neizzir.fragments.custom.btx;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BpcArchiveModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/btx/PreviewState;", "", "()V", "Failed", "Loading", "Ready", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/PreviewState$Failed;", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/PreviewState$Loading;", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/PreviewState$Ready;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public abstract class PreviewState {
    public /* synthetic */ PreviewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: BpcArchiveModels.kt */
    @Metadata(m4415d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/btx/PreviewState$Loading;", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/PreviewState;", "()V", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final class Loading extends PreviewState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private PreviewState() {
    }

    /* JADX INFO: compiled from: BpcArchiveModels.kt */
    @Metadata(m4415d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/btx/PreviewState$Ready;", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/PreviewState;", "pngFile", "Ljava/io/File;", "(Ljava/io/File;)V", "getPngFile", "()Ljava/io/File;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final /* data */ class Ready extends PreviewState {
        private final File pngFile;

        public static /* synthetic */ Ready copy$default(Ready ready, File file, int i, Object obj) {
            if ((i & 1) != 0) {
                file = ready.pngFile;
            }
            return ready.copy(file);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final File getPngFile() {
            return this.pngFile;
        }

        public final Ready copy(File pngFile) {
            Intrinsics.checkNotNullParameter(pngFile, "pngFile");
            return new Ready(pngFile);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ready) && Intrinsics.areEqual(this.pngFile, ((Ready) other).pngFile);
        }

        public int hashCode() {
            return this.pngFile.hashCode();
        }

        public String toString() {
            return "Ready(pngFile=" + this.pngFile + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(File pngFile) {
            super(null);
            Intrinsics.checkNotNullParameter(pngFile, "pngFile");
            this.pngFile = pngFile;
        }

        public final File getPngFile() {
            return this.pngFile;
        }
    }

    /* JADX INFO: compiled from: BpcArchiveModels.kt */
    @Metadata(m4415d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/btx/PreviewState$Failed;", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/PreviewState;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final /* data */ class Failed extends PreviewState {
        private final String reason;

        public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.reason;
            }
            return failed.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final Failed copy(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Failed(reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && Intrinsics.areEqual(this.reason, ((Failed) other).reason);
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return "Failed(reason=" + this.reason + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(String reason) {
            super(null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        public final String getReason() {
            return this.reason;
        }
    }
}
