package com.blackhub.bronline.neizzir.fragments.custom.sounds;

import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LocalSoundRepository.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/LocalSound;", "", "id", "", "category", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCategory;", "name", Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundInfo;", "bytes", "", "(Ljava/lang/String;Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCategory;Ljava/lang/String;Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundInfo;J)V", "getBytes", "()J", "getCategory", "()Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCategory;", "getId", "()Ljava/lang/String;", "getInfo", "()Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundInfo;", "getName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class LocalSound {
    private final long bytes;
    private final SoundCategory category;
    private final String id;
    private final SoundInfo info;
    private final String name;

    public static /* synthetic */ LocalSound copy$default(LocalSound localSound, String str, SoundCategory soundCategory, String str2, SoundInfo soundInfo, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localSound.id;
        }
        if ((i & 2) != 0) {
            soundCategory = localSound.category;
        }
        SoundCategory soundCategory2 = soundCategory;
        if ((i & 4) != 0) {
            str2 = localSound.name;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            soundInfo = localSound.info;
        }
        SoundInfo soundInfo2 = soundInfo;
        if ((i & 16) != 0) {
            j = localSound.bytes;
        }
        return localSound.copy(str, soundCategory2, str3, soundInfo2, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SoundCategory getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SoundInfo getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getBytes() {
        return this.bytes;
    }

    public final LocalSound copy(String id, SoundCategory category, String name, SoundInfo info, long bytes) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(info, "info");
        return new LocalSound(id, category, name, info, bytes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalSound)) {
            return false;
        }
        LocalSound localSound = (LocalSound) other;
        return Intrinsics.areEqual(this.id, localSound.id) && this.category == localSound.category && Intrinsics.areEqual(this.name, localSound.name) && Intrinsics.areEqual(this.info, localSound.info) && this.bytes == localSound.bytes;
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.category.hashCode()) * 31) + this.name.hashCode()) * 31) + this.info.hashCode()) * 31) + Long.hashCode(this.bytes);
    }

    public String toString() {
        return "LocalSound(id=" + this.id + ", category=" + this.category + ", name=" + this.name + ", info=" + this.info + ", bytes=" + this.bytes + ')';
    }

    public LocalSound(String id, SoundCategory category, String name, SoundInfo info, long bytes) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(info, "info");
        this.id = id;
        this.category = category;
        this.name = name;
        this.info = info;
        this.bytes = bytes;
    }

    public final long getBytes() {
        return this.bytes;
    }

    public final SoundCategory getCategory() {
        return this.category;
    }

    public final String getId() {
        return this.id;
    }

    public final SoundInfo getInfo() {
        return this.info;
    }

    public final String getName() {
        return this.name;
    }
}
