package com.blackhub.bronline.neizzir.fragments.custom.sounds;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SoundRules.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001b"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundInfo;", "", "extension", "", "durationMs", "", "sampleRate", "", "channels", "(Ljava/lang/String;JII)V", "getChannels", "()I", "getDurationMs", "()J", "getExtension", "()Ljava/lang/String;", "getSampleRate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class SoundInfo {
    private final int channels;
    private final long durationMs;
    private final String extension;
    private final int sampleRate;

    public static /* synthetic */ SoundInfo copy$default(SoundInfo soundInfo, String str, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = soundInfo.extension;
        }
        if ((i3 & 2) != 0) {
            j = soundInfo.durationMs;
        }
        long j2 = j;
        if ((i3 & 4) != 0) {
            i = soundInfo.sampleRate;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = soundInfo.channels;
        }
        return soundInfo.copy(str, j2, i4, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExtension() {
        return this.extension;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDurationMs() {
        return this.durationMs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSampleRate() {
        return this.sampleRate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getChannels() {
        return this.channels;
    }

    public final SoundInfo copy(String extension, long durationMs, int sampleRate, int channels) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        return new SoundInfo(extension, durationMs, sampleRate, channels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SoundInfo)) {
            return false;
        }
        SoundInfo soundInfo = (SoundInfo) other;
        return Intrinsics.areEqual(this.extension, soundInfo.extension) && this.durationMs == soundInfo.durationMs && this.sampleRate == soundInfo.sampleRate && this.channels == soundInfo.channels;
    }

    public int hashCode() {
        return (((((this.extension.hashCode() * 31) + Long.hashCode(this.durationMs)) * 31) + Integer.hashCode(this.sampleRate)) * 31) + Integer.hashCode(this.channels);
    }

    public String toString() {
        return "SoundInfo(extension=" + this.extension + ", durationMs=" + this.durationMs + ", sampleRate=" + this.sampleRate + ", channels=" + this.channels + ')';
    }

    public SoundInfo(String extension, long durationMs, int sampleRate, int channels) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.extension = extension;
        this.durationMs = durationMs;
        this.sampleRate = sampleRate;
        this.channels = channels;
    }

    public final int getChannels() {
        return this.channels;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }
}
