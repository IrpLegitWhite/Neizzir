package com.blackhub.bronline.neizzir.fragments.weapon;

import androidx.media3.common.C2493C;
import com.blackhub.bronline.game.gui.inventory.Constants;
import com.helpshift.proactive.InAppViewConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Weapon.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010 \n\u0002\bb\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u0086\u00012\u00020\u0001:\u0002\u0086\u0001B\u0087\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\"J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\rHÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\rHÆ\u0003J\t\u0010b\u001a\u00020\rHÆ\u0003J\t\u0010c\u001a\u00020\rHÆ\u0003J\t\u0010d\u001a\u00020\rHÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\rHÆ\u0003J\t\u0010g\u001a\u00020\rHÆ\u0003J\t\u0010h\u001a\u00020\rHÆ\u0003J\t\u0010i\u001a\u00020\u0005HÆ\u0003J\t\u0010j\u001a\u00020\u0005HÆ\u0003J\u000f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aHÆ\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aHÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\u000f\u0010n\u001a\b\u0012\u0004\u0012\u00020\r0\u001aHÆ\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\t\u0010t\u001a\u00020\u0005HÆ\u0003J\t\u0010u\u001a\u00020\u0005HÆ\u0003J\t\u0010v\u001a\u00020\u0003HÆ\u0003J\t\u0010w\u001a\u00020\u0005HÆ\u0003J\t\u0010x\u001a\u00020\u0005HÆ\u0003J\t\u0010y\u001a\u00020\rHÆ\u0003JÀ\u0002\u0010z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00052\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010{J\u0013\u0010|\u001a\u00020}2\b\u0010~\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u007f\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001J\n\u0010\u0082\u0001\u001a\u00020\u0005HÖ\u0001J \u0010\u0083\u0001\u001a\u00030\u0084\u0001*\u00030\u0081\u00012\u0006\u0010\u0007\u001a\u00020\u00052\u0007\u0010\u0085\u0001\u001a\u00020\u0001H\u0002R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010(\"\u0004\b1\u0010*R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00103\"\u0004\b;\u00105R\u0013\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u00107R\u001a\u0010\u0010\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00103\"\u0004\b@\u00105R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u00107R\u001a\u0010\u0011\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010$\"\u0004\bC\u0010&R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010(\"\u0004\bE\u0010*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010(R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bG\u00107R\u001a\u0010\u0016\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010$\"\u0004\bI\u0010&R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010(R\u001a\u0010\u0013\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010$\"\u0004\bL\u0010&R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u00107\"\u0004\bN\u00109R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010$\"\u0004\bP\u0010&R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010$\"\u0004\bR\u0010&R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u00107\"\u0004\bT\u00109R\u0010\u0010!\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010$\"\u0004\bV\u0010&R\u001a\u0010\u0017\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010$\"\u0004\bX\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bY\u00107R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010(\"\u0004\b[\u0010*R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u00107\"\u0004\b]\u00109¨\u0006\u0087\u0001"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/Weapon;", "", "id", "", "uniqueName", "", "modelId", "name", "image", "weaponCategory", "weaponSlot", "fireType", "range", "", InAppViewConstants.RADIUS, "ammo", "damage", "firingRate", "accuracy", "moveSpeed", "flags", "speed", "lifespan", "spread", "animGrpName", "animStand", "", "animCrouch", "animBreakout", "fireOffset", "ammoType", "sight", "baseComboName", "sourceJson", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;FFIFFFFIFFFLjava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccuracy", "()F", "setAccuracy", "(F)V", "getAmmo", "()I", "setAmmo", "(I)V", "getAmmoType", "()Ljava/lang/Integer;", "setAmmoType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getAnimBreakout", "setAnimBreakout", "getAnimCrouch", "()Ljava/util/List;", "setAnimCrouch", "(Ljava/util/List;)V", "getAnimGrpName", "()Ljava/lang/String;", "setAnimGrpName", "(Ljava/lang/String;)V", "getAnimStand", "setAnimStand", "getBaseComboName", "getDamage", "setDamage", "getFireOffset", "setFireOffset", "getFireType", "getFiringRate", "setFiringRate", "getFlags", "setFlags", "getId", "getImage", "getLifespan", "setLifespan", "getModelId", "getMoveSpeed", "setMoveSpeed", "getName", "setName", "getRadius", "setRadius", "getRange", "setRange", "getSight", "setSight", "getSpeed", "setSpeed", "getSpread", "setSpread", "getUniqueName", "getWeaponCategory", "setWeaponCategory", "getWeaponSlot", "setWeaponSlot", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;FFIFFFFIFFFLjava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/blackhub/bronline/neizzir/fragments/weapon/Weapon;", "equals", "", "other", "hashCode", "toJson", "Lorg/json/JSONObject;", "toString", "putIfPresent", "", "value", "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class Weapon {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private float accuracy;
    private int ammo;
    private Integer ammoType;
    private int animBreakout;
    private List<Integer> animCrouch;
    private String animGrpName;
    private List<Integer> animStand;
    private final String baseComboName;
    private float damage;
    private List<Float> fireOffset;
    private final String fireType;
    private float firingRate;
    private int flags;
    private final int id;
    private final String image;
    private float lifespan;
    private final int modelId;
    private float moveSpeed;
    private String name;
    private float radius;
    private float range;
    private String sight;
    private final String sourceJson;
    private float speed;
    private float spread;
    private final String uniqueName;
    private int weaponCategory;
    private String weaponSlot;

    /* JADX INFO: renamed from: component28, reason: from getter */
    private final String getSourceJson() {
        return this.sourceJson;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getAmmo() {
        return this.ammo;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final float getDamage() {
        return this.damage;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final float getFiringRate() {
        return this.firingRate;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final float getAccuracy() {
        return this.accuracy;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final float getMoveSpeed() {
        return this.moveSpeed;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final float getSpeed() {
        return this.speed;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final float getLifespan() {
        return this.lifespan;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final float getSpread() {
        return this.spread;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUniqueName() {
        return this.uniqueName;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getAnimGrpName() {
        return this.animGrpName;
    }

    public final List<Integer> component21() {
        return this.animStand;
    }

    public final List<Integer> component22() {
        return this.animCrouch;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getAnimBreakout() {
        return this.animBreakout;
    }

    public final List<Float> component24() {
        return this.fireOffset;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Integer getAmmoType() {
        return this.ammoType;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getSight() {
        return this.sight;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getBaseComboName() {
        return this.baseComboName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getModelId() {
        return this.modelId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getWeaponCategory() {
        return this.weaponCategory;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getWeaponSlot() {
        return this.weaponSlot;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFireType() {
        return this.fireType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getRange() {
        return this.range;
    }

    public final Weapon copy(int id, String uniqueName, int modelId, String name, String image, int weaponCategory, String weaponSlot, String fireType, float range, float radius, int ammo, float damage, float firingRate, float accuracy, float moveSpeed, int flags, float speed, float lifespan, float spread, String animGrpName, List<Integer> animStand, List<Integer> animCrouch, int animBreakout, List<Float> fireOffset, Integer ammoType, String sight, String baseComboName, String sourceJson) {
        Intrinsics.checkNotNullParameter(uniqueName, "uniqueName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(weaponSlot, "weaponSlot");
        Intrinsics.checkNotNullParameter(fireType, "fireType");
        Intrinsics.checkNotNullParameter(animGrpName, "animGrpName");
        Intrinsics.checkNotNullParameter(animStand, "animStand");
        Intrinsics.checkNotNullParameter(animCrouch, "animCrouch");
        Intrinsics.checkNotNullParameter(fireOffset, "fireOffset");
        return new Weapon(id, uniqueName, modelId, name, image, weaponCategory, weaponSlot, fireType, range, radius, ammo, damage, firingRate, accuracy, moveSpeed, flags, speed, lifespan, spread, animGrpName, animStand, animCrouch, animBreakout, fireOffset, ammoType, sight, baseComboName, sourceJson);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Weapon)) {
            return false;
        }
        Weapon weapon = (Weapon) other;
        return this.id == weapon.id && Intrinsics.areEqual(this.uniqueName, weapon.uniqueName) && this.modelId == weapon.modelId && Intrinsics.areEqual(this.name, weapon.name) && Intrinsics.areEqual(this.image, weapon.image) && this.weaponCategory == weapon.weaponCategory && Intrinsics.areEqual(this.weaponSlot, weapon.weaponSlot) && Intrinsics.areEqual(this.fireType, weapon.fireType) && Float.compare(this.range, weapon.range) == 0 && Float.compare(this.radius, weapon.radius) == 0 && this.ammo == weapon.ammo && Float.compare(this.damage, weapon.damage) == 0 && Float.compare(this.firingRate, weapon.firingRate) == 0 && Float.compare(this.accuracy, weapon.accuracy) == 0 && Float.compare(this.moveSpeed, weapon.moveSpeed) == 0 && this.flags == weapon.flags && Float.compare(this.speed, weapon.speed) == 0 && Float.compare(this.lifespan, weapon.lifespan) == 0 && Float.compare(this.spread, weapon.spread) == 0 && Intrinsics.areEqual(this.animGrpName, weapon.animGrpName) && Intrinsics.areEqual(this.animStand, weapon.animStand) && Intrinsics.areEqual(this.animCrouch, weapon.animCrouch) && this.animBreakout == weapon.animBreakout && Intrinsics.areEqual(this.fireOffset, weapon.fireOffset) && Intrinsics.areEqual(this.ammoType, weapon.ammoType) && Intrinsics.areEqual(this.sight, weapon.sight) && Intrinsics.areEqual(this.baseComboName, weapon.baseComboName) && Intrinsics.areEqual(this.sourceJson, weapon.sourceJson);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.id) * 31) + this.uniqueName.hashCode()) * 31) + Integer.hashCode(this.modelId)) * 31) + this.name.hashCode()) * 31) + this.image.hashCode()) * 31) + Integer.hashCode(this.weaponCategory)) * 31) + this.weaponSlot.hashCode()) * 31) + this.fireType.hashCode()) * 31) + Float.hashCode(this.range)) * 31) + Float.hashCode(this.radius)) * 31) + Integer.hashCode(this.ammo)) * 31) + Float.hashCode(this.damage)) * 31) + Float.hashCode(this.firingRate)) * 31) + Float.hashCode(this.accuracy)) * 31) + Float.hashCode(this.moveSpeed)) * 31) + Integer.hashCode(this.flags)) * 31) + Float.hashCode(this.speed)) * 31) + Float.hashCode(this.lifespan)) * 31) + Float.hashCode(this.spread)) * 31) + this.animGrpName.hashCode()) * 31) + this.animStand.hashCode()) * 31) + this.animCrouch.hashCode()) * 31) + Integer.hashCode(this.animBreakout)) * 31) + this.fireOffset.hashCode()) * 31) + (this.ammoType == null ? 0 : this.ammoType.hashCode())) * 31) + (this.sight == null ? 0 : this.sight.hashCode())) * 31) + (this.baseComboName == null ? 0 : this.baseComboName.hashCode())) * 31) + (this.sourceJson != null ? this.sourceJson.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Weapon(id=").append(this.id).append(", uniqueName=").append(this.uniqueName).append(", modelId=").append(this.modelId).append(", name=").append(this.name).append(", image=").append(this.image).append(", weaponCategory=").append(this.weaponCategory).append(", weaponSlot=").append(this.weaponSlot).append(", fireType=").append(this.fireType).append(", range=").append(this.range).append(", radius=").append(this.radius).append(", ammo=").append(this.ammo).append(", damage=");
        sb.append(this.damage).append(", firingRate=").append(this.firingRate).append(", accuracy=").append(this.accuracy).append(", moveSpeed=").append(this.moveSpeed).append(", flags=").append(this.flags).append(", speed=").append(this.speed).append(", lifespan=").append(this.lifespan).append(", spread=").append(this.spread).append(", animGrpName=").append(this.animGrpName).append(", animStand=").append(this.animStand).append(", animCrouch=").append(this.animCrouch).append(", animBreakout=").append(this.animBreakout);
        sb.append(", fireOffset=").append(this.fireOffset).append(", ammoType=").append(this.ammoType).append(", sight=").append(this.sight).append(", baseComboName=").append(this.baseComboName).append(", sourceJson=").append(this.sourceJson).append(')');
        return sb.toString();
    }

    public Weapon(int id, String uniqueName, int modelId, String name, String image, int weaponCategory, String weaponSlot, String fireType, float range, float radius, int ammo, float damage, float firingRate, float accuracy, float moveSpeed, int flags, float speed, float lifespan, float spread, String animGrpName, List<Integer> animStand, List<Integer> animCrouch, int animBreakout, List<Float> fireOffset, Integer ammoType, String sight, String baseComboName, String sourceJson) {
        Intrinsics.checkNotNullParameter(uniqueName, "uniqueName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(weaponSlot, "weaponSlot");
        Intrinsics.checkNotNullParameter(fireType, "fireType");
        Intrinsics.checkNotNullParameter(animGrpName, "animGrpName");
        Intrinsics.checkNotNullParameter(animStand, "animStand");
        Intrinsics.checkNotNullParameter(animCrouch, "animCrouch");
        Intrinsics.checkNotNullParameter(fireOffset, "fireOffset");
        this.id = id;
        this.uniqueName = uniqueName;
        this.modelId = modelId;
        this.name = name;
        this.image = image;
        this.weaponCategory = weaponCategory;
        this.weaponSlot = weaponSlot;
        this.fireType = fireType;
        this.range = range;
        this.radius = radius;
        this.ammo = ammo;
        this.damage = damage;
        this.firingRate = firingRate;
        this.accuracy = accuracy;
        this.moveSpeed = moveSpeed;
        this.flags = flags;
        this.speed = speed;
        this.lifespan = lifespan;
        this.spread = spread;
        this.animGrpName = animGrpName;
        this.animStand = animStand;
        this.animCrouch = animCrouch;
        this.animBreakout = animBreakout;
        this.fireOffset = fireOffset;
        this.ammoType = ammoType;
        this.sight = sight;
        this.baseComboName = baseComboName;
        this.sourceJson = sourceJson;
    }

    public /* synthetic */ Weapon(int i, String str, int i2, String str2, String str3, int i3, String str4, String str5, float f, float f2, int i4, float f3, float f4, float f5, float f6, int i5, float f7, float f8, float f9, String str6, List list, List list2, int i6, List list3, Integer num, String str7, String str8, String str9, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, str2, str3, i3, str4, str5, f, f2, i4, f3, f4, f5, f6, i5, f7, f8, f9, str6, list, list2, i6, list3, (i7 & 16777216) != 0 ? null : num, (i7 & 33554432) != 0 ? null : str7, (i7 & 67108864) != 0 ? null : str8, (i7 & C2493C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str9);
    }

    public final int getId() {
        return this.id;
    }

    public final String getUniqueName() {
        return this.uniqueName;
    }

    public final int getModelId() {
        return this.modelId;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getImage() {
        return this.image;
    }

    public final int getWeaponCategory() {
        return this.weaponCategory;
    }

    public final void setWeaponCategory(int i) {
        this.weaponCategory = i;
    }

    public final String getWeaponSlot() {
        return this.weaponSlot;
    }

    public final void setWeaponSlot(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.weaponSlot = str;
    }

    public final String getFireType() {
        return this.fireType;
    }

    public final float getRange() {
        return this.range;
    }

    public final void setRange(float f) {
        this.range = f;
    }

    public final float getRadius() {
        return this.radius;
    }

    public final void setRadius(float f) {
        this.radius = f;
    }

    public final int getAmmo() {
        return this.ammo;
    }

    public final void setAmmo(int i) {
        this.ammo = i;
    }

    public final float getDamage() {
        return this.damage;
    }

    public final void setDamage(float f) {
        this.damage = f;
    }

    public final float getFiringRate() {
        return this.firingRate;
    }

    public final void setFiringRate(float f) {
        this.firingRate = f;
    }

    public final float getAccuracy() {
        return this.accuracy;
    }

    public final void setAccuracy(float f) {
        this.accuracy = f;
    }

    public final float getMoveSpeed() {
        return this.moveSpeed;
    }

    public final void setMoveSpeed(float f) {
        this.moveSpeed = f;
    }

    public final int getFlags() {
        return this.flags;
    }

    public final void setFlags(int i) {
        this.flags = i;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final float getLifespan() {
        return this.lifespan;
    }

    public final void setLifespan(float f) {
        this.lifespan = f;
    }

    public final float getSpread() {
        return this.spread;
    }

    public final void setSpread(float f) {
        this.spread = f;
    }

    public final String getAnimGrpName() {
        return this.animGrpName;
    }

    public final void setAnimGrpName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.animGrpName = str;
    }

    public final List<Integer> getAnimStand() {
        return this.animStand;
    }

    public final void setAnimStand(List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.animStand = list;
    }

    public final List<Integer> getAnimCrouch() {
        return this.animCrouch;
    }

    public final void setAnimCrouch(List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.animCrouch = list;
    }

    public final int getAnimBreakout() {
        return this.animBreakout;
    }

    public final void setAnimBreakout(int i) {
        this.animBreakout = i;
    }

    public final List<Float> getFireOffset() {
        return this.fireOffset;
    }

    public final void setFireOffset(List<Float> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.fireOffset = list;
    }

    public final Integer getAmmoType() {
        return this.ammoType;
    }

    public final void setAmmoType(Integer num) {
        this.ammoType = num;
    }

    public final String getSight() {
        return this.sight;
    }

    public final void setSight(String str) {
        this.sight = str;
    }

    public final String getBaseComboName() {
        return this.baseComboName;
    }

    /* JADX INFO: compiled from: Weapon.kt */
    @Metadata(m4415d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\u000e"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/Weapon$Companion;", "", "()V", "fromJson", "Lcom/blackhub/bronline/neizzir/fragments/weapon/Weapon;", "json", "Lorg/json/JSONObject;", "parseFloatArray", "", "", "array", "Lorg/json/JSONArray;", "parseIntArray", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Weapon fromJson(JSONObject json) throws JSONException {
            double d;
            float fOptDouble;
            Intrinsics.checkNotNullParameter(json, "json");
            int i = json.getInt("id");
            String string = json.getString("uniqueName");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            int i2 = json.getInt("modelId");
            String strOptString = json.optString("name", "");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            String string2 = json.getString("image");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            int i3 = json.getInt("weaponCategory");
            String string3 = json.getString("weaponSlot");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = json.getString("fireType");
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            float fOptDouble2 = (float) json.optDouble("range", Constants.DEFAULT_DOUBLE_VALUE);
            float fOptDouble3 = (float) json.optDouble(InAppViewConstants.RADIUS, Constants.DEFAULT_DOUBLE_VALUE);
            int iOptInt = json.optInt("ammo", 0);
            float fOptDouble4 = (float) json.optDouble("damage", Constants.DEFAULT_DOUBLE_VALUE);
            float fOptDouble5 = (float) json.optDouble("firingRate", Constants.DEFAULT_DOUBLE_VALUE);
            float fOptDouble6 = (float) json.optDouble("accuracy", Constants.DEFAULT_DOUBLE_VALUE);
            float fOptDouble7 = (float) json.optDouble("moveSpeed", 1.0d);
            int iOptInt2 = json.optInt("flags", 0);
            if (json.has("projectileSpeed")) {
                d = Constants.DEFAULT_DOUBLE_VALUE;
                fOptDouble = (float) json.optDouble("projectileSpeed", Constants.DEFAULT_DOUBLE_VALUE);
            } else {
                d = Constants.DEFAULT_DOUBLE_VALUE;
                fOptDouble = (float) json.optDouble("speed", Constants.DEFAULT_DOUBLE_VALUE);
            }
            float fOptDouble8 = (float) json.optDouble("lifespan", d);
            float fOptDouble9 = (float) json.optDouble("spread", d);
            String strOptString2 = json.optString("animGrpName", "");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
            List<Integer> intArray = parseIntArray(json.optJSONArray("animStand"));
            List<Integer> intArray2 = parseIntArray(json.optJSONArray("animCrouch"));
            int iOptInt3 = json.optInt("animBreakout", 0);
            List<Float> floatArray = parseFloatArray(json.optJSONArray("fireOffset"));
            Integer numValueOf = Integer.valueOf(json.optInt("ammoType"));
            int it = numValueOf.intValue();
            int it2 = it != 0 ? 1 : 0;
            Integer num = it2 != 0 ? numValueOf : null;
            String it3 = json.optString("sight");
            Intrinsics.checkNotNull(it3);
            String str = it3.length() > 0 ? it3 : null;
            String it4 = json.optString("baseComboName");
            Intrinsics.checkNotNull(it4);
            return new Weapon(i, string, i2, strOptString, string2, i3, string3, string4, fOptDouble2, fOptDouble3, iOptInt, fOptDouble4, fOptDouble5, fOptDouble6, fOptDouble7, iOptInt2, fOptDouble, fOptDouble8, fOptDouble9, strOptString2, intArray, intArray2, iOptInt3, floatArray, num, str, it4.length() > 0 ? it4 : null, json.toString());
        }

        private final List<Integer> parseIntArray(JSONArray array) {
            if (array == null) {
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 0, 0});
            }
            List list = new ArrayList();
            int length = array.length();
            for (int i = 0; i < length; i++) {
                list.add(Integer.valueOf(array.getInt(i)));
            }
            return list;
        }

        private final List<Float> parseFloatArray(JSONArray array) {
            if (array == null) {
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f)});
            }
            List list = new ArrayList();
            int length = array.length();
            for (int i = 0; i < length; i++) {
                list.add(Float.valueOf((float) array.getDouble(i)));
            }
            return list;
        }
    }

    public final JSONObject toJson() throws JSONException {
        String source = this.sourceJson;
        if (source != null) {
            JSONObject $this$toJson_u24lambda_u240 = new JSONObject(source);
            putIfPresent($this$toJson_u24lambda_u240, "accuracy", Float.valueOf(this.accuracy));
            putIfPresent($this$toJson_u24lambda_u240, "moveSpeed", Float.valueOf(this.moveSpeed));
            putIfPresent($this$toJson_u24lambda_u240, "range", Float.valueOf(this.range));
            putIfPresent($this$toJson_u24lambda_u240, "firingRate", Float.valueOf(this.firingRate));
            putIfPresent($this$toJson_u24lambda_u240, InAppViewConstants.RADIUS, Float.valueOf(this.radius));
            putIfPresent($this$toJson_u24lambda_u240, "projectileSpeed", Float.valueOf(this.speed));
            putIfPresent($this$toJson_u24lambda_u240, "speed", Float.valueOf(this.speed));
            putIfPresent($this$toJson_u24lambda_u240, "lifespan", Float.valueOf(this.lifespan));
            putIfPresent($this$toJson_u24lambda_u240, "spread", Float.valueOf(this.spread));
            putIfPresent($this$toJson_u24lambda_u240, "animBreakout", Integer.valueOf(this.animBreakout));
            putIfPresent($this$toJson_u24lambda_u240, "flags", Integer.valueOf(this.flags));
            return $this$toJson_u24lambda_u240;
        }
        JSONObject $this$toJson_u24lambda_u245 = new JSONObject();
        $this$toJson_u24lambda_u245.put("id", this.id);
        $this$toJson_u24lambda_u245.put("uniqueName", this.uniqueName);
        $this$toJson_u24lambda_u245.put("modelId", this.modelId);
        if (this.name.length() > 0) {
            $this$toJson_u24lambda_u245.put("name", this.name);
        }
        $this$toJson_u24lambda_u245.put("image", this.image);
        $this$toJson_u24lambda_u245.put("weaponCategory", this.weaponCategory);
        $this$toJson_u24lambda_u245.put("weaponSlot", this.weaponSlot);
        $this$toJson_u24lambda_u245.put("fireType", this.fireType);
        $this$toJson_u24lambda_u245.put("range", Float.valueOf(this.range));
        $this$toJson_u24lambda_u245.put(InAppViewConstants.RADIUS, Float.valueOf(this.radius));
        $this$toJson_u24lambda_u245.put("ammo", this.ammo);
        $this$toJson_u24lambda_u245.put("damage", Float.valueOf(this.damage));
        $this$toJson_u24lambda_u245.put("firingRate", Float.valueOf(this.firingRate));
        $this$toJson_u24lambda_u245.put("accuracy", Float.valueOf(this.accuracy));
        $this$toJson_u24lambda_u245.put("moveSpeed", Float.valueOf(this.moveSpeed));
        $this$toJson_u24lambda_u245.put("flags", this.flags);
        $this$toJson_u24lambda_u245.put("projectileSpeed", Float.valueOf(this.speed));
        $this$toJson_u24lambda_u245.put("lifespan", Float.valueOf(this.lifespan));
        $this$toJson_u24lambda_u245.put("spread", Float.valueOf(this.spread));
        $this$toJson_u24lambda_u245.put("animGrpName", this.animGrpName);
        $this$toJson_u24lambda_u245.put("animStand", new JSONArray((Collection) this.animStand));
        $this$toJson_u24lambda_u245.put("animCrouch", new JSONArray((Collection) this.animCrouch));
        $this$toJson_u24lambda_u245.put("animBreakout", this.animBreakout);
        Iterable $this$map$iv = this.fireOffset;
        Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            destination$iv$iv.add(Double.valueOf(((Number) item$iv$iv).floatValue()));
        }
        $this$toJson_u24lambda_u245.put("fireOffset", new JSONArray(destination$iv$iv));
        Integer num = this.ammoType;
        if (num != null) {
            $this$toJson_u24lambda_u245.put("ammoType", num.intValue());
        }
        String it = this.sight;
        if (it != null) {
            $this$toJson_u24lambda_u245.put("sight", it);
        }
        String it2 = this.baseComboName;
        if (it2 != null) {
            $this$toJson_u24lambda_u245.put("baseComboName", it2);
        }
        return $this$toJson_u24lambda_u245;
    }

    private final void putIfPresent(JSONObject $this$putIfPresent, String name, Object value) throws JSONException {
        if ($this$putIfPresent.has(name)) {
            $this$putIfPresent.put(name, value);
        }
    }
}
