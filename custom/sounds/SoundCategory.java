package com.blackhub.bronline.neizzir.fragments.custom.sounds;

import androidx.media3.common.C2493C;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: SoundRules.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCategory;", "", "limitMs", "", "slots", "", "", "formats", "", "(Ljava/lang/String;IJLjava/util/List;Ljava/util/Set;)V", "getFormats", "()Ljava/util/Set;", "hint", "getHint", "()Ljava/lang/String;", "getLimitMs", "()J", "relativeDir", "getRelativeDir", "getSlots", "()Ljava/util/List;", "HIT", "GUN", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public enum SoundCategory {
    HIT(2000, CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"sound_1", "sound_2", "sound_3"}), SetsKt__SetsJVMKt.setOf("mp3")),
    GUN(C2493C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"sound_021", "sound_022"}), SetsKt__SetsKt.setOf((Object[]) new String[]{"mp3", "wav"}));

    private final Set<String> formats;
    private final long limitMs;
    private final List<String> slots;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<SoundCategory> getEntries() {
        return $ENTRIES;
    }

    SoundCategory(long limitMs, List slots, Set formats) {
        this.limitMs = limitMs;
        this.slots = slots;
        this.formats = formats;
    }

    public final Set<String> getFormats() {
        return this.formats;
    }

    public final long getLimitMs() {
        return this.limitMs;
    }

    public final List<String> getSlots() {
        return this.slots;
    }

    public final String getHint() {
        return this == HIT ? "MP3 · до 2 сек · до 1 МиБ" : "MP3 / WAV · до 3 сек · до 1 МиБ";
    }

    public final String getRelativeDir() {
        return this == HIT ? "NEIZZIR" : "NEIZZIR/GENRL/Bank_006";
    }
}
