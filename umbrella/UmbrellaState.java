package com.blackhub.bronline.neizzir.umbrella;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UmbrellaManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001d"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaState;", "", "enabled", "", "busy", "message", "", "progress", "", "restartRequired", "(ZZLjava/lang/String;IZ)V", "getBusy", "()Z", "getEnabled", "getMessage", "()Ljava/lang/String;", "getProgress", "()I", "getRestartRequired", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class UmbrellaState {
    private final boolean busy;
    private final boolean enabled;
    private final String message;
    private final int progress;
    private final boolean restartRequired;

    public UmbrellaState() {
        this(false, false, null, 0, false, 31, null);
    }

    public static /* synthetic */ UmbrellaState copy$default(UmbrellaState umbrellaState, boolean z, boolean z2, String str, int i, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = umbrellaState.enabled;
        }
        if ((i2 & 2) != 0) {
            z2 = umbrellaState.busy;
        }
        boolean z4 = z2;
        if ((i2 & 4) != 0) {
            str = umbrellaState.message;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            i = umbrellaState.progress;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z3 = umbrellaState.restartRequired;
        }
        return umbrellaState.copy(z, z4, str2, i3, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getBusy() {
        return this.busy;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getRestartRequired() {
        return this.restartRequired;
    }

    public final UmbrellaState copy(boolean enabled, boolean busy, String message, int progress, boolean restartRequired) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new UmbrellaState(enabled, busy, message, progress, restartRequired);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UmbrellaState)) {
            return false;
        }
        UmbrellaState umbrellaState = (UmbrellaState) other;
        return this.enabled == umbrellaState.enabled && this.busy == umbrellaState.busy && Intrinsics.areEqual(this.message, umbrellaState.message) && this.progress == umbrellaState.progress && this.restartRequired == umbrellaState.restartRequired;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.enabled) * 31) + Boolean.hashCode(this.busy)) * 31) + this.message.hashCode()) * 31) + Integer.hashCode(this.progress)) * 31) + Boolean.hashCode(this.restartRequired);
    }

    public String toString() {
        return "UmbrellaState(enabled=" + this.enabled + ", busy=" + this.busy + ", message=" + this.message + ", progress=" + this.progress + ", restartRequired=" + this.restartRequired + ')';
    }

    public UmbrellaState(boolean enabled, boolean busy, String message, int progress, boolean restartRequired) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.enabled = enabled;
        this.busy = busy;
        this.message = message;
        this.progress = progress;
        this.restartRequired = restartRequired;
    }

    public /* synthetic */ UmbrellaState(boolean z, boolean z2, String str, int i, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? false : z3);
    }

    public final boolean getBusy() {
        return this.busy;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final boolean getRestartRequired() {
        return this.restartRequired;
    }
}
