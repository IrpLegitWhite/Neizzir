package com.blackhub.bronline.neizzir.fragments.weapon;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.ktor.sse.ServerSentEventKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;

/* JADX INFO: compiled from: WeaponDatRepository.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponRow;", "", "()V", "GunLine", "PlainLine", "Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponRow$GunLine;", "Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponRow$PlainLine;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public abstract class WeaponRow {
    public /* synthetic */ WeaponRow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WeaponRow() {
    }

    /* JADX INFO: compiled from: WeaponDatRepository.kt */
    @Metadata(m4415d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 82\u00020\u0001:\u00018B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010,\u001a\u00020\u0004J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010.\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\rH\u0002J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\rHÖ\u0001J\t\u00107\u001a\u00020\u0004HÖ\u0001R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR$\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\n\"\u0004\b \u0010\fR$\u0010!\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR$\u0010$\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\n\"\u0004\b&\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R$\u0010)\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\n\"\u0004\b+\u0010\f¨\u00069"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponRow$GunLine;", "Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponRow;", "tokens", "", "", "(Ljava/util/List;)V", "value", "", "accuracy", "getAccuracy", "()F", "setAccuracy", "(F)V", "", "ammoClip", "getAmmoClip", "()I", "setAmmoClip", "(I)V", "damage", "getDamage", "setDamage", "fireType", "getFireType", "()Ljava/lang/String;", "setFireType", "(Ljava/lang/String;)V", "flagsHex", "getFlagsHex", "setFlagsHex", "moveSpeed", "getMoveSpeed", "setMoveSpeed", "name", "getName", "setName", "targetRange", "getTargetRange", "setTargetRange", "getTokens", "()Ljava/util/List;", "weaponRange", "getWeaponRange", "setWeaponRange", "asLine", "component1", "copy", "ensureSize", "", FirebaseAnalytics.Param.INDEX, "equals", "", "other", "", "hashCode", "toString", "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final /* data */ class GunLine extends WeaponRow {
        public static final int IDX_ACCURACY = 16;
        public static final int IDX_AMMO_CLIP = 9;
        public static final int IDX_ASSOC_GROUP = 8;
        public static final int IDX_BREAKOUT_TIME = 24;
        public static final int IDX_DAMAGE = 10;
        public static final int IDX_FIRE_OFFSET_X = 11;
        public static final int IDX_FIRE_OFFSET_Y = 12;
        public static final int IDX_FIRE_OFFSET_Z = 13;
        public static final int IDX_FIRE_TYPE = 2;
        public static final int IDX_FLAGS = 25;
        public static final int IDX_LIFESPAN = 28;
        public static final int IDX_LOOP1_END = 19;
        public static final int IDX_LOOP1_FIRE = 20;
        public static final int IDX_LOOP1_START = 18;
        public static final int IDX_LOOP2_END = 22;
        public static final int IDX_LOOP2_FIRE = 23;
        public static final int IDX_LOOP2_START = 21;
        public static final int IDX_MARKER = 0;
        public static final int IDX_MODEL1 = 5;
        public static final int IDX_MODEL2 = 6;
        public static final int IDX_MOVE_SPEED = 17;
        public static final int IDX_NAME = 1;
        public static final int IDX_RADIUS = 27;
        public static final int IDX_SKILL_LEVEL = 14;
        public static final int IDX_SKILL_STAT = 15;
        public static final int IDX_SLOT = 7;
        public static final int IDX_SPEED = 26;
        public static final int IDX_SPREAD = 29;
        public static final int IDX_TARGET_RANGE = 3;
        public static final int IDX_WEAPON_RANGE = 4;
        private final List<String> tokens;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GunLine copy$default(GunLine gunLine, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = gunLine.tokens;
            }
            return gunLine.copy(list);
        }

        public final List<String> component1() {
            return this.tokens;
        }

        public final GunLine copy(List<String> tokens) {
            Intrinsics.checkNotNullParameter(tokens, "tokens");
            return new GunLine(tokens);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GunLine) && Intrinsics.areEqual(this.tokens, ((GunLine) other).tokens);
        }

        public int hashCode() {
            return this.tokens.hashCode();
        }

        public String toString() {
            return "GunLine(tokens=" + this.tokens + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GunLine(List<String> tokens) {
            super(null);
            Intrinsics.checkNotNullParameter(tokens, "tokens");
            this.tokens = tokens;
        }

        public final List<String> getTokens() {
            return this.tokens;
        }

        public final String getName() {
            String str = (String) CollectionsKt___CollectionsKt.getOrNull(this.tokens, 1);
            return str == null ? "" : str;
        }

        public final void setName(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (this.tokens.size() > 1) {
                this.tokens.set(1, value);
            }
        }

        public final String getFireType() {
            String str = (String) CollectionsKt___CollectionsKt.getOrNull(this.tokens, 2);
            return str == null ? "" : str;
        }

        public final void setFireType(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (this.tokens.size() > 2) {
                this.tokens.set(2, value);
            }
        }

        public final float getTargetRange() {
            Float floatOrNull;
            String str = (String) CollectionsKt___CollectionsKt.getOrNull(this.tokens, 3);
            if (str == null || (floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(str)) == null) {
                return 0.0f;
            }
            return floatOrNull.floatValue();
        }

        public final void setTargetRange(float value) {
            ensureSize(3);
            this.tokens.set(3, String.valueOf(value));
        }

        public final float getWeaponRange() {
            Float floatOrNull;
            String str = (String) CollectionsKt___CollectionsKt.getOrNull(this.tokens, 4);
            if (str == null || (floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(str)) == null) {
                return 0.0f;
            }
            return floatOrNull.floatValue();
        }

        public final void setWeaponRange(float value) {
            ensureSize(4);
            this.tokens.set(4, String.valueOf(value));
        }

        public final int getAmmoClip() {
            Integer intOrNull;
            String str = (String) CollectionsKt___CollectionsKt.getOrNull(this.tokens, 9);
            if (str == null || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str)) == null) {
                return 0;
            }
            return intOrNull.intValue();
        }

        public final void setAmmoClip(int value) {
            ensureSize(9);
            this.tokens.set(9, String.valueOf(value));
        }

        public final int getDamage() {
            Integer intOrNull;
            String str = (String) CollectionsKt___CollectionsKt.getOrNull(this.tokens, 10);
            if (str == null || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str)) == null) {
                return 0;
            }
            return intOrNull.intValue();
        }

        public final void setDamage(int value) {
            ensureSize(10);
            this.tokens.set(10, String.valueOf(value));
        }

        public final float getAccuracy() {
            Float floatOrNull;
            String str = (String) CollectionsKt___CollectionsKt.getOrNull(this.tokens, 16);
            if (str == null || (floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(str)) == null) {
                return 0.0f;
            }
            return floatOrNull.floatValue();
        }

        public final void setAccuracy(float value) {
            ensureSize(16);
            this.tokens.set(16, String.valueOf(value));
        }

        public final float getMoveSpeed() {
            Float floatOrNull;
            String str = (String) CollectionsKt___CollectionsKt.getOrNull(this.tokens, 17);
            if (str == null || (floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(str)) == null) {
                return 0.0f;
            }
            return floatOrNull.floatValue();
        }

        public final void setMoveSpeed(float value) {
            ensureSize(17);
            this.tokens.set(17, String.valueOf(value));
        }

        public final String getFlagsHex() {
            String str = (String) CollectionsKt___CollectionsKt.getOrNull(this.tokens, 25);
            return str == null ? CommonUrlParts.Values.FALSE_INTEGER : str;
        }

        public final void setFlagsHex(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            ensureSize(25);
            this.tokens.set(25, value);
        }

        private final void ensureSize(int index) {
            if (this.tokens.size() <= index) {
                while (this.tokens.size() <= index) {
                    this.tokens.add(CommonUrlParts.Values.FALSE_INTEGER);
                }
            }
        }

        public final String asLine() {
            return CollectionsKt___CollectionsKt.joinToString$default(this.tokens, ServerSentEventKt.SPACE, null, null, 0, null, null, 62, null);
        }
    }

    /* JADX INFO: compiled from: WeaponDatRepository.kt */
    @Metadata(m4415d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponRow$PlainLine;", "Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponRow;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final /* data */ class PlainLine extends WeaponRow {
        private final String text;

        public static /* synthetic */ PlainLine copy$default(PlainLine plainLine, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = plainLine.text;
            }
            return plainLine.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final PlainLine copy(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new PlainLine(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PlainLine) && Intrinsics.areEqual(this.text, ((PlainLine) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "PlainLine(text=" + this.text + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlainLine(String text) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public final String getText() {
            return this.text;
        }
    }
}
