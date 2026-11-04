package com.blackhub.bronline.neizzir.fragments.weapon;

import android.content.Context;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.blackhub.bronline.neizzir.fragments.sborks.util.FileUtils;
import com.blackhub.bronline.neizzir.network.CachePolicy;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.EndpointRouter;
import com.blackhub.bronline.neizzir.network.NetworkResult;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.ByteStreamsKt;
import kotlin.p040io.CloseableKt;
import kotlin.p040io.FilesKt__FileReadWriteKt;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: WeaponDatRepository.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002)*B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u000e\u0010\f\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\rJ\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0002\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u001e\u001a\u00020\u0004J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u001cJ\u001e\u0010!\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0002J$\u0010#\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0086@¢\u0006\u0002\u0010$J\u0014\u0010%\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fJ\u0010\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0014H\u0002J\u0010\u0010(\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006+"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponDatRepository;", "", "()V", "WEAPON_PATH_IN_CHECKSUMS", "", "applyOverrides", "", "Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponRow;", "rows", "overrides", "", "Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponDatRepository$OverrideValues;", "downloadStockWeaponDat", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extractGunLines", "", "Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponRow$GunLine;", "fetchWeaponChecksum", "Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponDatRepository$WeaponChecksum;", "getExternalWeaponFile", "Ljava/io/File;", "context", "Landroid/content/Context;", "getLocalWeaponFile", "getOverridesFile", "getWeaponDir", "loadOverrides", "loadWeaponRows", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseChecksums", "text", "parseWeaponDat", "resetToStock", "saveOverrides", "", "saveWeaponRows", "(Landroid/content/Context;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serializeWeaponDat", "sha1OfFile", "file", "syncWeaponToExternalData", "OverrideValues", "WeaponChecksum", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class WeaponDatRepository {
    public static final WeaponDatRepository INSTANCE = new WeaponDatRepository();
    private static final String WEAPON_PATH_IN_CHECKSUMS = "weapon/weapon.dat";

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository$downloadStockWeaponDat$1 */
    /* JADX INFO: compiled from: WeaponDatRepository.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository", m4426f = "WeaponDatRepository.kt", m4427i = {}, m4428l = {323}, m4429m = "downloadStockWeaponDat", m4430n = {}, m4431s = {})
    static final class C55891 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C55891(Continuation<? super C55891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WeaponDatRepository.this.downloadStockWeaponDat(this);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository$fetchWeaponChecksum$1 */
    /* JADX INFO: compiled from: WeaponDatRepository.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository", m4426f = "WeaponDatRepository.kt", m4427i = {0}, m4428l = {334}, m4429m = "fetchWeaponChecksum", m4430n = {"this"}, m4431s = {"L$0"})
    static final class C55901 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C55901(Continuation<? super C55901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WeaponDatRepository.this.fetchWeaponChecksum(this);
        }
    }

    private WeaponDatRepository() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: WeaponDatRepository.kt */
    @Metadata(m4415d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponDatRepository$WeaponChecksum;", "", "sha1", "", "size", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "getSha1", "()Ljava/lang/String;", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponDatRepository$WeaponChecksum;", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    static final /* data */ class WeaponChecksum {
        private final String sha1;
        private final Long size;

        public static /* synthetic */ WeaponChecksum copy$default(WeaponChecksum weaponChecksum, String str, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                str = weaponChecksum.sha1;
            }
            if ((i & 2) != 0) {
                l = weaponChecksum.size;
            }
            return weaponChecksum.copy(str, l);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSha1() {
            return this.sha1;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getSize() {
            return this.size;
        }

        public final WeaponChecksum copy(String sha1, Long size) {
            Intrinsics.checkNotNullParameter(sha1, "sha1");
            return new WeaponChecksum(sha1, size);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WeaponChecksum)) {
                return false;
            }
            WeaponChecksum weaponChecksum = (WeaponChecksum) other;
            return Intrinsics.areEqual(this.sha1, weaponChecksum.sha1) && Intrinsics.areEqual(this.size, weaponChecksum.size);
        }

        public int hashCode() {
            return (this.sha1.hashCode() * 31) + (this.size == null ? 0 : this.size.hashCode());
        }

        public String toString() {
            return "WeaponChecksum(sha1=" + this.sha1 + ", size=" + this.size + ')';
        }

        public WeaponChecksum(String sha1, Long size) {
            Intrinsics.checkNotNullParameter(sha1, "sha1");
            this.sha1 = sha1;
            this.size = size;
        }

        public final String getSha1() {
            return this.sha1;
        }

        public final Long getSize() {
            return this.size;
        }
    }

    /* JADX INFO: compiled from: WeaponDatRepository.kt */
    @Metadata(m4415d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponDatRepository$OverrideValues;", "", "ammoClip", "", "targetRange", "", "weaponRange", "accuracy", "moveSpeed", "(IFFFF)V", "getAccuracy", "()F", "getAmmoClip", "()I", "getMoveSpeed", "getTargetRange", "getWeaponRange", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final /* data */ class OverrideValues {
        private final float accuracy;
        private final int ammoClip;
        private final float moveSpeed;
        private final float targetRange;
        private final float weaponRange;

        public static /* synthetic */ OverrideValues copy$default(OverrideValues overrideValues, int i, float f, float f2, float f3, float f4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = overrideValues.ammoClip;
            }
            if ((i2 & 2) != 0) {
                f = overrideValues.targetRange;
            }
            float f5 = f;
            if ((i2 & 4) != 0) {
                f2 = overrideValues.weaponRange;
            }
            float f6 = f2;
            if ((i2 & 8) != 0) {
                f3 = overrideValues.accuracy;
            }
            float f7 = f3;
            if ((i2 & 16) != 0) {
                f4 = overrideValues.moveSpeed;
            }
            return overrideValues.copy(i, f5, f6, f7, f4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getAmmoClip() {
            return this.ammoClip;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getTargetRange() {
            return this.targetRange;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getWeaponRange() {
            return this.weaponRange;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getAccuracy() {
            return this.accuracy;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final float getMoveSpeed() {
            return this.moveSpeed;
        }

        public final OverrideValues copy(int ammoClip, float targetRange, float weaponRange, float accuracy, float moveSpeed) {
            return new OverrideValues(ammoClip, targetRange, weaponRange, accuracy, moveSpeed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OverrideValues)) {
                return false;
            }
            OverrideValues overrideValues = (OverrideValues) other;
            return this.ammoClip == overrideValues.ammoClip && Float.compare(this.targetRange, overrideValues.targetRange) == 0 && Float.compare(this.weaponRange, overrideValues.weaponRange) == 0 && Float.compare(this.accuracy, overrideValues.accuracy) == 0 && Float.compare(this.moveSpeed, overrideValues.moveSpeed) == 0;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.ammoClip) * 31) + Float.hashCode(this.targetRange)) * 31) + Float.hashCode(this.weaponRange)) * 31) + Float.hashCode(this.accuracy)) * 31) + Float.hashCode(this.moveSpeed);
        }

        public String toString() {
            return "OverrideValues(ammoClip=" + this.ammoClip + ", targetRange=" + this.targetRange + ", weaponRange=" + this.weaponRange + ", accuracy=" + this.accuracy + ", moveSpeed=" + this.moveSpeed + ')';
        }

        public OverrideValues(int ammoClip, float targetRange, float weaponRange, float accuracy, float moveSpeed) {
            this.ammoClip = ammoClip;
            this.targetRange = targetRange;
            this.weaponRange = weaponRange;
            this.accuracy = accuracy;
            this.moveSpeed = moveSpeed;
        }

        public final int getAmmoClip() {
            return this.ammoClip;
        }

        public final float getTargetRange() {
            return this.targetRange;
        }

        public final float getWeaponRange() {
            return this.weaponRange;
        }

        public final float getAccuracy() {
            return this.accuracy;
        }

        public final float getMoveSpeed() {
            return this.moveSpeed;
        }
    }

    private final File getWeaponDir(Context context) {
        File parent = FileUtils.INSTANCE.externalFilesParent(context);
        File custom = new File(parent, TypedValues.Custom.NAME);
        File weaponDir = new File(custom, "weapon");
        if (!weaponDir.exists()) {
            weaponDir.mkdirs();
        }
        return weaponDir;
    }

    private final File getLocalWeaponFile(Context context) {
        return new File(getWeaponDir(context), "weapon.dat");
    }

    private final File getOverridesFile(Context context) {
        return new File(getWeaponDir(context), "weapon_overrides.json");
    }

    private final File getExternalWeaponFile(Context context) {
        File dir = context.getExternalFilesDir("data");
        if (dir == null) {
            return null;
        }
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return new File(dir, "weapon.dat");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncWeaponToExternalData(Context context) {
        File dst;
        try {
            File src = getLocalWeaponFile(context);
            if (src.exists() && (dst = getExternalWeaponFile(context)) != null) {
                FileInputStream fileInputStream = new FileInputStream(src);
                try {
                    FileInputStream input = fileInputStream;
                    FileOutputStream fileOutputStream = new FileOutputStream(dst);
                    try {
                        FileOutputStream output = fileOutputStream;
                        ByteStreamsKt.copyTo$default(input, output, 0, 2, null);
                        CloseableKt.closeFinally(fileOutputStream, null);
                        CloseableKt.closeFinally(fileInputStream, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(fileInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    public final Object loadWeaponRows(Context context, Continuation<? super List<WeaponRow>> continuation) {
        File file = getLocalWeaponFile(context);
        return BuildersKt.withContext(Dispatchers.getIO(), new C55912(file, context, null), continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository$loadWeaponRows$2 */
    /* JADX INFO: compiled from: WeaponDatRepository.kt */
    @Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponRow;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository$loadWeaponRows$2", m4426f = "WeaponDatRepository.kt", m4427i = {}, m4428l = {ComposerKt.reuseKey, 216, 226, 248}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55912 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<WeaponRow>>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ File $file;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55912(File file, Context context, Continuation<? super C55912> continuation) {
            super(2, continuation);
            this.$file = file;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55912(this.$file, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<WeaponRow>> continuation) {
            return ((C55912) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0057  */
        /* JADX WARN: Code duplicated, block: B:32:0x005f  */
        /* JADX WARN: Code duplicated, block: B:34:0x006c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x006d  */
        /* JADX WARN: Code duplicated, block: B:38:0x0078  */
        /* JADX WARN: Code duplicated, block: B:40:0x008d  */
        /* JADX WARN: Code duplicated, block: B:41:0x009b  */
        /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:45:0x00b1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:52:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:68:0x0122 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:69:0x0123  */
        /* JADX WARN: Code duplicated, block: B:79:0x014d  */
        /* JADX WARN: Code duplicated, block: B:82:0x0161  */
        /* JADX WARN: Code duplicated, block: B:94:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v10, types: [com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository$loadWeaponRows$2] */
        /* JADX WARN: Type inference failed for: r0v11, types: [com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository$loadWeaponRows$2] */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9, types: [com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository$loadWeaponRows$2] */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v4, types: [com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository$WeaponChecksum] */
        /* JADX WARN: Type inference failed for: r10v52 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v13, types: [com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository$loadWeaponRows$2] */
        /* JADX WARN: Type inference failed for: r5v14, types: [com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository$loadWeaponRows$2] */
        /* JADX WARN: Type inference failed for: r5v15 */
        /* JADX WARN: Type inference failed for: r5v2, types: [com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository$loadWeaponRows$2] */
        /* JADX WARN: Type inference failed for: r5v21 */
        /* JADX WARN: Type inference failed for: r5v22 */
        /* JADX WARN: Type inference failed for: r5v23 */
        /* JADX WARN: Type inference failed for: r5v24 */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v9 */
        /* JADX WARN: Type inference failed for: r6v5 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            ?? r5;
            Object obj2;
            ?? r10;
            String strSha1OfFile;
            ?? r0;
            Object objDownloadStockWeaponDat;
            List<WeaponRow> weaponDat;
            Object objDownloadStockWeaponDat2;
            ?? r1;
            Object objDownloadStockWeaponDat3;
            ?? r2;
            Object obj3;
            File parentFile;
            ?? r6;
            Object obj4;
            Map mapLoadOverrides;
            File parentFile2;
            ?? r7;
            String text$default;
            Map mapLoadOverrides2;
            File parentFile3;
            Object obj5;
            Object obj6;
            Object obj7;
            C55912 c55912;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            obj = this.label;
            try {
                switch (obj) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        Object objFetchWeaponChecksum = WeaponDatRepository.INSTANCE.fetchWeaponChecksum(this);
                        if (objFetchWeaponChecksum == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj7 = objFetchWeaponChecksum;
                        c55912 = this;
                        try {
                            obj = (WeaponChecksum) obj7;
                            obj2 = obj;
                            r5 = c55912;
                            r10 = obj;
                            break;
                        } catch (Exception e) {
                            obj = obj;
                            obj = c55912;
                            r5 = obj;
                            obj2 = obj;
                            r10 = 0;
                        }
                        if (r10 == 0) {
                            if (r5.$file.exists()) {
                                try {
                                    strSha1OfFile = WeaponDatRepository.INSTANCE.sha1OfFile(r5.$file);
                                } catch (Exception e2) {
                                    strSha1OfFile = null;
                                }
                                if (strSha1OfFile == null && StringsKt__StringsJVMKt.equals(strSha1OfFile, r10.getSha1(), true)) {
                                    weaponDat = WeaponDatRepository.INSTANCE.parseWeaponDat(FilesKt__FileReadWriteKt.readText$default(r5.$file, null, 1, null));
                                    r6 = r5;
                                } else {
                                    try {
                                        r5.label = 4;
                                        objDownloadStockWeaponDat = WeaponDatRepository.INSTANCE.downloadStockWeaponDat((Continuation) r5);
                                        if (objDownloadStockWeaponDat == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        r0 = r5;
                                        obj6 = obj2;
                                        obj5 = objDownloadStockWeaponDat;
                                        try {
                                            text$default = (String) obj5;
                                            r7 = r0;
                                        } catch (Exception e3) {
                                            obj = obj6;
                                            r7 = r0;
                                            text$default = FilesKt__FileReadWriteKt.readText$default(r0.$file, null, 1, null);
                                        }
                                        weaponDat = WeaponDatRepository.INSTANCE.parseWeaponDat(text$default);
                                        mapLoadOverrides2 = WeaponDatRepository.INSTANCE.loadOverrides(r7.$context);
                                        if (!mapLoadOverrides2.isEmpty()) {
                                            weaponDat = WeaponDatRepository.INSTANCE.applyOverrides(weaponDat, mapLoadOverrides2);
                                        }
                                        String strSerializeWeaponDat = WeaponDatRepository.INSTANCE.serializeWeaponDat(weaponDat);
                                        parentFile3 = r7.$file.getParentFile();
                                        if (parentFile3 != null) {
                                            Boxing.boxBoolean(parentFile3.mkdirs());
                                        }
                                        FilesKt__FileReadWriteKt.writeText$default(r7.$file, strSerializeWeaponDat, null, 2, null);
                                        r6 = r7;
                                    } catch (Exception e4) {
                                        obj = obj2;
                                        r0 = r5;
                                        r7 = r0;
                                        text$default = FilesKt__FileReadWriteKt.readText$default(r0.$file, null, 1, null);
                                        weaponDat = WeaponDatRepository.INSTANCE.parseWeaponDat(text$default);
                                        mapLoadOverrides2 = WeaponDatRepository.INSTANCE.loadOverrides(r7.$context);
                                        if (!mapLoadOverrides2.isEmpty()) {
                                            weaponDat = WeaponDatRepository.INSTANCE.applyOverrides(weaponDat, mapLoadOverrides2);
                                        }
                                        String strSerializeWeaponDat2 = WeaponDatRepository.INSTANCE.serializeWeaponDat(weaponDat);
                                        parentFile3 = r7.$file.getParentFile();
                                        if (parentFile3 != null) {
                                            Boxing.boxBoolean(parentFile3.mkdirs());
                                        }
                                        FilesKt__FileReadWriteKt.writeText$default(r7.$file, strSerializeWeaponDat2, null, 2, null);
                                        r6 = r7;
                                        WeaponDatRepository.INSTANCE.syncWeaponToExternalData(r6.$context);
                                        return weaponDat;
                                    }
                                }
                            } else {
                                r5.label = 3;
                                objDownloadStockWeaponDat2 = WeaponDatRepository.INSTANCE.downloadStockWeaponDat((Continuation) r5);
                                if (objDownloadStockWeaponDat2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                r1 = r5;
                                obj4 = objDownloadStockWeaponDat2;
                                weaponDat = WeaponDatRepository.INSTANCE.parseWeaponDat((String) obj4);
                                mapLoadOverrides = WeaponDatRepository.INSTANCE.loadOverrides(r1.$context);
                                if (!mapLoadOverrides.isEmpty()) {
                                    weaponDat = WeaponDatRepository.INSTANCE.applyOverrides(weaponDat, mapLoadOverrides);
                                }
                                String strSerializeWeaponDat3 = WeaponDatRepository.INSTANCE.serializeWeaponDat(weaponDat);
                                parentFile2 = r1.$file.getParentFile();
                                if (parentFile2 != null) {
                                    Boxing.boxBoolean(parentFile2.mkdirs());
                                }
                                FilesKt__FileReadWriteKt.writeText$default(r1.$file, strSerializeWeaponDat3, null, 2, null);
                                r6 = r1;
                            }
                            break;
                        } else if (r5.$file.exists()) {
                            weaponDat = WeaponDatRepository.INSTANCE.parseWeaponDat(FilesKt__FileReadWriteKt.readText$default(r5.$file, null, 1, null));
                            r6 = r5;
                        } else {
                            r5.label = 2;
                            objDownloadStockWeaponDat3 = WeaponDatRepository.INSTANCE.downloadStockWeaponDat((Continuation) r5);
                            if (objDownloadStockWeaponDat3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r2 = r5;
                            obj3 = objDownloadStockWeaponDat3;
                            String str = (String) obj3;
                            parentFile = r2.$file.getParentFile();
                            if (parentFile != null) {
                                Boxing.boxBoolean(parentFile.mkdirs());
                            }
                            FilesKt__FileReadWriteKt.writeText$default(r2.$file, str, null, 2, null);
                            weaponDat = WeaponDatRepository.INSTANCE.parseWeaponDat(str);
                            r6 = r2;
                        }
                        WeaponDatRepository.INSTANCE.syncWeaponToExternalData(r6.$context);
                        return weaponDat;
                    case 1:
                        ResultKt.throwOnFailure(obj);
                        c55912 = this;
                        obj7 = obj;
                        obj = (WeaponChecksum) obj7;
                        obj2 = obj;
                        r5 = c55912;
                        r10 = obj;
                        if (r10 == 0) {
                            if (r5.$file.exists()) {
                                r5.label = 3;
                                objDownloadStockWeaponDat2 = WeaponDatRepository.INSTANCE.downloadStockWeaponDat((Continuation) r5);
                                if (objDownloadStockWeaponDat2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                r1 = r5;
                                obj4 = objDownloadStockWeaponDat2;
                                weaponDat = WeaponDatRepository.INSTANCE.parseWeaponDat((String) obj4);
                                mapLoadOverrides = WeaponDatRepository.INSTANCE.loadOverrides(r1.$context);
                                if (!mapLoadOverrides.isEmpty()) {
                                    weaponDat = WeaponDatRepository.INSTANCE.applyOverrides(weaponDat, mapLoadOverrides);
                                }
                                String strSerializeWeaponDat4 = WeaponDatRepository.INSTANCE.serializeWeaponDat(weaponDat);
                                parentFile2 = r1.$file.getParentFile();
                                if (parentFile2 != null) {
                                    Boxing.boxBoolean(parentFile2.mkdirs());
                                }
                                FilesKt__FileReadWriteKt.writeText$default(r1.$file, strSerializeWeaponDat4, null, 2, null);
                                r6 = r1;
                            } else {
                                strSha1OfFile = WeaponDatRepository.INSTANCE.sha1OfFile(r5.$file);
                                if (strSha1OfFile == null) {
                                }
                                r5.label = 4;
                                objDownloadStockWeaponDat = WeaponDatRepository.INSTANCE.downloadStockWeaponDat((Continuation) r5);
                                if (objDownloadStockWeaponDat == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                r0 = r5;
                                obj6 = obj2;
                                obj5 = objDownloadStockWeaponDat;
                                text$default = (String) obj5;
                                r7 = r0;
                                weaponDat = WeaponDatRepository.INSTANCE.parseWeaponDat(text$default);
                                mapLoadOverrides2 = WeaponDatRepository.INSTANCE.loadOverrides(r7.$context);
                                if (!mapLoadOverrides2.isEmpty()) {
                                    weaponDat = WeaponDatRepository.INSTANCE.applyOverrides(weaponDat, mapLoadOverrides2);
                                }
                                String strSerializeWeaponDat5 = WeaponDatRepository.INSTANCE.serializeWeaponDat(weaponDat);
                                parentFile3 = r7.$file.getParentFile();
                                if (parentFile3 != null) {
                                    Boxing.boxBoolean(parentFile3.mkdirs());
                                }
                                FilesKt__FileReadWriteKt.writeText$default(r7.$file, strSerializeWeaponDat5, null, 2, null);
                                r6 = r7;
                            }
                            break;
                        } else if (r5.$file.exists()) {
                            r5.label = 2;
                            objDownloadStockWeaponDat3 = WeaponDatRepository.INSTANCE.downloadStockWeaponDat((Continuation) r5);
                            if (objDownloadStockWeaponDat3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r2 = r5;
                            obj3 = objDownloadStockWeaponDat3;
                            String str2 = (String) obj3;
                            parentFile = r2.$file.getParentFile();
                            if (parentFile != null) {
                                Boxing.boxBoolean(parentFile.mkdirs());
                            }
                            FilesKt__FileReadWriteKt.writeText$default(r2.$file, str2, null, 2, null);
                            weaponDat = WeaponDatRepository.INSTANCE.parseWeaponDat(str2);
                            r6 = r2;
                        } else {
                            weaponDat = WeaponDatRepository.INSTANCE.parseWeaponDat(FilesKt__FileReadWriteKt.readText$default(r5.$file, null, 1, null));
                            r6 = r5;
                        }
                        WeaponDatRepository.INSTANCE.syncWeaponToExternalData(r6.$context);
                        return weaponDat;
                    case 2:
                        r2 = this;
                        ResultKt.throwOnFailure(obj);
                        obj3 = obj;
                        String str3 = (String) obj3;
                        parentFile = r2.$file.getParentFile();
                        if (parentFile != null) {
                            Boxing.boxBoolean(parentFile.mkdirs());
                        }
                        FilesKt__FileReadWriteKt.writeText$default(r2.$file, str3, null, 2, null);
                        weaponDat = WeaponDatRepository.INSTANCE.parseWeaponDat(str3);
                        r6 = r2;
                        WeaponDatRepository.INSTANCE.syncWeaponToExternalData(r6.$context);
                        return weaponDat;
                    case 3:
                        r1 = this;
                        ResultKt.throwOnFailure(obj);
                        obj4 = obj;
                        weaponDat = WeaponDatRepository.INSTANCE.parseWeaponDat((String) obj4);
                        mapLoadOverrides = WeaponDatRepository.INSTANCE.loadOverrides(r1.$context);
                        if (!mapLoadOverrides.isEmpty()) {
                            weaponDat = WeaponDatRepository.INSTANCE.applyOverrides(weaponDat, mapLoadOverrides);
                        }
                        String strSerializeWeaponDat6 = WeaponDatRepository.INSTANCE.serializeWeaponDat(weaponDat);
                        parentFile2 = r1.$file.getParentFile();
                        if (parentFile2 != null) {
                            Boxing.boxBoolean(parentFile2.mkdirs());
                        }
                        FilesKt__FileReadWriteKt.writeText$default(r1.$file, strSerializeWeaponDat6, null, 2, null);
                        r6 = r1;
                        WeaponDatRepository.INSTANCE.syncWeaponToExternalData(r6.$context);
                        return weaponDat;
                    case 4:
                        r0 = this;
                        try {
                            ResultKt.throwOnFailure(obj);
                            obj6 = obj;
                            r0 = r0;
                            obj5 = obj;
                            text$default = (String) obj5;
                            r7 = r0;
                        } catch (Exception e5) {
                            r7 = r0;
                            text$default = FilesKt__FileReadWriteKt.readText$default(r0.$file, null, 1, null);
                            weaponDat = WeaponDatRepository.INSTANCE.parseWeaponDat(text$default);
                            mapLoadOverrides2 = WeaponDatRepository.INSTANCE.loadOverrides(r7.$context);
                            if (!mapLoadOverrides2.isEmpty()) {
                                weaponDat = WeaponDatRepository.INSTANCE.applyOverrides(weaponDat, mapLoadOverrides2);
                            }
                            String strSerializeWeaponDat7 = WeaponDatRepository.INSTANCE.serializeWeaponDat(weaponDat);
                            parentFile3 = r7.$file.getParentFile();
                            if (parentFile3 != null) {
                                Boxing.boxBoolean(parentFile3.mkdirs());
                            }
                            FilesKt__FileReadWriteKt.writeText$default(r7.$file, strSerializeWeaponDat7, null, 2, null);
                            r6 = r7;
                            WeaponDatRepository.INSTANCE.syncWeaponToExternalData(r6.$context);
                            return weaponDat;
                        }
                        weaponDat = WeaponDatRepository.INSTANCE.parseWeaponDat(text$default);
                        mapLoadOverrides2 = WeaponDatRepository.INSTANCE.loadOverrides(r7.$context);
                        if (!mapLoadOverrides2.isEmpty()) {
                            weaponDat = WeaponDatRepository.INSTANCE.applyOverrides(weaponDat, mapLoadOverrides2);
                        }
                        String strSerializeWeaponDat8 = WeaponDatRepository.INSTANCE.serializeWeaponDat(weaponDat);
                        parentFile3 = r7.$file.getParentFile();
                        if (parentFile3 != null) {
                            Boxing.boxBoolean(parentFile3.mkdirs());
                        }
                        FilesKt__FileReadWriteKt.writeText$default(r7.$file, strSerializeWeaponDat8, null, 2, null);
                        r6 = r7;
                        WeaponDatRepository.INSTANCE.syncWeaponToExternalData(r6.$context);
                        return weaponDat;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e6) {
            }
        }
    }

    public final Object resetToStock(Context context, Continuation<? super List<WeaponRow>> continuation) {
        File file = getLocalWeaponFile(context);
        File overridesFile = getOverridesFile(context);
        return BuildersKt.withContext(Dispatchers.getIO(), new C55922(file, overridesFile, context, null), continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository$resetToStock$2 */
    /* JADX INFO: compiled from: WeaponDatRepository.kt */
    @Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponRow;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository$resetToStock$2", m4426f = "WeaponDatRepository.kt", m4427i = {}, m4428l = {286}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55922 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<WeaponRow>>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ File $file;
        final /* synthetic */ File $overridesFile;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55922(File file, File file2, Context context, Continuation<? super C55922> continuation) {
            super(2, continuation);
            this.$file = file;
            this.$overridesFile = file2;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55922(this.$file, this.$overridesFile, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<WeaponRow>> continuation) {
            return ((C55922) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws IOException {
            C55922 c55922;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c55922 = this;
                    c55922.label = 1;
                    Object objDownloadStockWeaponDat = WeaponDatRepository.INSTANCE.downloadStockWeaponDat(c55922);
                    if (objDownloadStockWeaponDat == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objDownloadStockWeaponDat;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c55922 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String stockText = (String) $result;
            File parentFile = c55922.$file.getParentFile();
            if (parentFile != null) {
                Boxing.boxBoolean(parentFile.mkdirs());
            }
            FilesKt__FileReadWriteKt.writeText$default(c55922.$file, stockText, null, 2, null);
            if (c55922.$overridesFile.exists()) {
                c55922.$overridesFile.delete();
            }
            WeaponDatRepository.INSTANCE.syncWeaponToExternalData(c55922.$context);
            return WeaponDatRepository.INSTANCE.parseWeaponDat(stockText);
        }
    }

    public final Object saveWeaponRows(Context context, List<? extends WeaponRow> list, Continuation<? super Unit> continuation) {
        File file = getLocalWeaponFile(context);
        String text = serializeWeaponDat(list);
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C55932(file, text, context, list, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository$saveWeaponRows$2 */
    /* JADX INFO: compiled from: WeaponDatRepository.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository$saveWeaponRows$2", m4426f = "WeaponDatRepository.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55932 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ File $file;
        final /* synthetic */ List<WeaponRow> $rows;
        final /* synthetic */ String $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C55932(File file, String str, Context context, List<? extends WeaponRow> list, Continuation<? super C55932> continuation) {
            super(2, continuation);
            this.$file = file;
            this.$text = str;
            this.$context = context;
            this.$rows = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55932(this.$file, this.$text, this.$context, this.$rows, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55932) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    File parentFile = this.$file.getParentFile();
                    if (parentFile != null) {
                        Boxing.boxBoolean(parentFile.mkdirs());
                    }
                    FilesKt__FileReadWriteKt.writeText$default(this.$file, this.$text, null, 2, null);
                    WeaponDatRepository.INSTANCE.saveOverrides(this.$context, this.$rows);
                    WeaponDatRepository.INSTANCE.syncWeaponToExternalData(this.$context);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object downloadStockWeaponDat(Continuation<? super String> continuation) throws IOException {
        C55891 c55891;
        Object bytes;
        byte[] it;
        if (continuation instanceof C55891) {
            c55891 = (C55891) continuation;
            if ((c55891.label & Integer.MIN_VALUE) != 0) {
                c55891.label -= Integer.MIN_VALUE;
            } else {
                c55891 = new C55891(continuation);
            }
        } else {
            c55891 = new C55891(continuation);
        }
        C55891 c55892 = c55891;
        Object $result = c55892.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c55892.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                WeaponDatRepository$downloadStockWeaponDat$result$1 weaponDatRepository$downloadStockWeaponDat$result$1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository$downloadStockWeaponDat$result$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(byte[] it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return Boolean.valueOf(!(it2.length == 0));
                    }
                };
                c55892.label = 1;
                bytes = router.getBytes(endpointGroup, "/Custom/weapon/weapon.dat", (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : null, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? EndpointRouter.C56582.INSTANCE : weaponDatRepository$downloadStockWeaponDat$result$1, c55892);
                if (bytes == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                bytes = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        NetworkResult result = (NetworkResult) bytes;
        NetworkResult.Success success = result instanceof NetworkResult.Success ? (NetworkResult.Success) result : null;
        if (success != null && (it = (byte[]) success.getValue()) != null) {
            return new String(it, Charsets.UTF_8);
        }
        throw new IOException("Не удалось скачать weapon.dat с обоих адресов");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object fetchWeaponChecksum(Continuation<? super WeaponChecksum> continuation) {
        C55901 c55901;
        WeaponDatRepository weaponDatRepository;
        Object bytes;
        if (continuation instanceof C55901) {
            c55901 = (C55901) continuation;
            if ((c55901.label & Integer.MIN_VALUE) != 0) {
                c55901.label -= Integer.MIN_VALUE;
            } else {
                c55901 = new C55901(continuation);
            }
        } else {
            c55901 = new C55901(continuation);
        }
        C55901 c55902 = c55901;
        Object $result = c55902.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c55902.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                weaponDatRepository = this;
                EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                WeaponDatRepository$fetchWeaponChecksum$result$1 weaponDatRepository$fetchWeaponChecksum$result$1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository$fetchWeaponChecksum$result$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(byte[] it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(WeaponDatRepository.INSTANCE.parseChecksums(new String(it, Charsets.UTF_8)) != null);
                    }
                };
                c55902.L$0 = weaponDatRepository;
                c55902.label = 1;
                bytes = router.getBytes(endpointGroup, "/Custom/checksums.json", (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : null, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? EndpointRouter.C56582.INSTANCE : weaponDatRepository$fetchWeaponChecksum$result$1, c55902);
                if (bytes == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                WeaponDatRepository weaponDatRepository2 = (WeaponDatRepository) c55902.L$0;
                ResultKt.throwOnFailure($result);
                weaponDatRepository = weaponDatRepository2;
                bytes = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        NetworkResult.Success result = bytes instanceof NetworkResult.Success ? (NetworkResult.Success) bytes : null;
        if (result == null) {
            return null;
        }
        return weaponDatRepository.parseChecksums(new String((byte[]) result.getValue(), Charsets.UTF_8));
    }

    private static final WeaponChecksum parseChecksums$fromArray(JSONArray array) {
        int i = 0;
        int length = array.length();
        while (true) {
            if (i >= length) {
                return null;
            }
            JSONObject obj = array.optJSONObject(i);
            if (obj != null) {
                String path = obj.optString("path", "");
                if (Intrinsics.areEqual(path, WEAPON_PATH_IN_CHECKSUMS)) {
                    String sha1 = obj.optString("sha1", "");
                    Long lValueOf = Long.valueOf(obj.optLong("size", -1L));
                    long it = lValueOf.longValue();
                    Long size = (it > 0L ? 1 : (it == 0L ? 0 : -1)) >= 0 ? lValueOf : null;
                    Intrinsics.checkNotNull(sha1);
                    if (sha1.length() > 0) {
                        return new WeaponChecksum(sha1, size);
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WeaponChecksum parseChecksums(String text) {
        try {
            JSONArray arr = new JSONArray(text);
            return parseChecksums$fromArray(arr);
        } catch (JSONException e) {
            WeaponChecksum weaponChecksum = null;
            try {
                JSONObject obj = new JSONObject(text);
                if (obj.has("files")) {
                    JSONArray filesArr = obj.optJSONArray("files");
                    if (filesArr == null) {
                        return null;
                    }
                    weaponChecksum = parseChecksums$fromArray(filesArr);
                } else if (obj.has("path")) {
                    String path = obj.optString("path", "");
                    if (Intrinsics.areEqual(path, WEAPON_PATH_IN_CHECKSUMS)) {
                        String sha1 = obj.optString("sha1", "");
                        Long size = Long.valueOf(obj.optLong("size", -1L));
                        long it = size.longValue();
                        boolean z = true;
                        if (!(it >= 0)) {
                            size = null;
                        }
                        Intrinsics.checkNotNull(sha1);
                        if (sha1.length() <= 0) {
                            z = false;
                        }
                        if (z) {
                            weaponChecksum = new WeaponChecksum(sha1, size);
                        }
                    }
                }
            } catch (JSONException e2) {
            }
            return weaponChecksum;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String sha1OfFile(File file) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileInputStream fis = fileInputStream;
            byte[] buf = new byte[8192];
            while (true) {
                int read = fis.read(buf);
                if (read <= 0) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    byte[] bArrDigest = md.digest();
                    Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                    return ArraysKt___ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.WeaponDatRepository.sha1OfFile.2
                        public final CharSequence invoke(byte it) {
                            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(it)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                            return str;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                            return invoke(b.byteValue());
                        }
                    }, 30, (Object) null);
                }
                md.update(buf, 0, read);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveOverrides(Context context, List<? extends WeaponRow> rows) throws JSONException {
        LinkedHashMap map = new LinkedHashMap();
        for (WeaponRow row : rows) {
            if (row instanceof WeaponRow.GunLine) {
                String name = ((WeaponRow.GunLine) row).getName();
                if (!(name.length() == 0) && !map.containsKey(name)) {
                    map.put(name, new OverrideValues(((WeaponRow.GunLine) row).getAmmoClip(), ((WeaponRow.GunLine) row).getTargetRange(), ((WeaponRow.GunLine) row).getWeaponRange(), ((WeaponRow.GunLine) row).getAccuracy(), ((WeaponRow.GunLine) row).getMoveSpeed()));
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject weaponsObj = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String name2 = (String) entry.getKey();
            OverrideValues o = (OverrideValues) entry.getValue();
            JSONObject obj = new JSONObject();
            obj.put("ammoClip", o.getAmmoClip());
            obj.put("targetRange", o.getTargetRange());
            obj.put("weaponRange", o.getWeaponRange());
            obj.put("accuracy", o.getAccuracy());
            obj.put("moveSpeed", o.getMoveSpeed());
            weaponsObj.put(name2, obj);
        }
        jSONObject.put("weapons", weaponsObj);
        File file = getOverridesFile(context);
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        FilesKt__FileReadWriteKt.writeText$default(file, string, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, OverrideValues> loadOverrides(Context context) {
        File file = getOverridesFile(context);
        if (!file.exists()) {
            return MapsKt__MapsKt.emptyMap();
        }
        try {
            String text = FilesKt__FileReadWriteKt.readText$default(file, null, 1, null);
            JSONObject root = new JSONObject(text);
            JSONObject weaponsObj = root.optJSONObject("weapons");
            if (weaponsObj != null) {
                Map result = new LinkedHashMap();
                Iterator<String> itKeys = weaponsObj.keys();
                while (itKeys.hasNext()) {
                    String name = itKeys.next();
                    JSONObject obj = weaponsObj.optJSONObject(name);
                    if (obj != null) {
                        int ammo = obj.optInt("ammoClip", Integer.MIN_VALUE);
                        double target = obj.optDouble("targetRange", Double.NaN);
                        double weapon = obj.optDouble("weaponRange", Double.NaN);
                        double acc = obj.optDouble("accuracy", Double.NaN);
                        double speed = obj.optDouble("moveSpeed", Double.NaN);
                        if (ammo != Integer.MIN_VALUE) {
                            if (!Double.isNaN(target) && !Double.isNaN(weapon)) {
                                if (!Double.isNaN(acc) && !Double.isNaN(speed)) {
                                    Intrinsics.checkNotNull(name);
                                    String text2 = text;
                                    File file2 = file;
                                    JSONObject root2 = root;
                                    try {
                                        result.put(name, new OverrideValues(ammo, (float) target, (float) weapon, (float) acc, (float) speed));
                                        file = file2;
                                        text = text2;
                                        root = root2;
                                    } catch (Exception e) {
                                    }
                                }
                            }
                        }
                    }
                }
                return result;
            }
            try {
                return MapsKt__MapsKt.emptyMap();
            } catch (Exception e2) {
            }
        } catch (Exception e3) {
        }
        return MapsKt__MapsKt.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<WeaponRow> applyOverrides(List<WeaponRow> rows, Map<String, OverrideValues> overrides) {
        OverrideValues ov;
        if (overrides.isEmpty()) {
            return rows;
        }
        for (WeaponRow row : rows) {
            if ((row instanceof WeaponRow.GunLine) && (ov = overrides.get(((WeaponRow.GunLine) row).getName())) != null) {
                ((WeaponRow.GunLine) row).setAmmoClip(ov.getAmmoClip());
                ((WeaponRow.GunLine) row).setTargetRange(ov.getTargetRange());
                ((WeaponRow.GunLine) row).setWeaponRange(ov.getWeaponRange());
                ((WeaponRow.GunLine) row).setAccuracy(ov.getAccuracy());
                ((WeaponRow.GunLine) row).setMoveSpeed(ov.getMoveSpeed());
            }
        }
        return rows;
    }

    public final List<WeaponRow> parseWeaponDat(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        List result = new ArrayList();
        Sequence $this$forEach$iv = StringsKt__StringsKt.lineSequence(text);
        for (Object element$iv : $this$forEach$iv) {
            String rawLine = (String) element$iv;
            String line = StringsKt__StringsKt.trim((CharSequence) rawLine).toString();
            if (line.length() == 0) {
                result.add(new WeaponRow.PlainLine(rawLine));
            } else if (StringsKt__StringsJVMKt.startsWith$default(line, "$", false, 2, null)) {
                List tokens = CollectionsKt___CollectionsKt.toMutableList((Collection) new Regex("\\s+").split(line, 0));
                if (!tokens.isEmpty() && Intrinsics.areEqual(tokens.get(0), "$")) {
                    result.add(new WeaponRow.GunLine(tokens));
                } else {
                    result.add(new WeaponRow.PlainLine(rawLine));
                }
            } else {
                result.add(new WeaponRow.PlainLine(rawLine));
            }
        }
        return result;
    }

    public final String serializeWeaponDat(List<? extends WeaponRow> rows) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        StringBuilder $this$serializeWeaponDat_u24lambda_u248 = new StringBuilder();
        List<? extends WeaponRow> $this$forEachIndexed$iv = rows;
        int index = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int index$iv = index + 1;
            if (index < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            WeaponRow row = (WeaponRow) item$iv;
            if (row instanceof WeaponRow.GunLine) {
                $this$serializeWeaponDat_u24lambda_u248.append(((WeaponRow.GunLine) row).asLine());
            } else if (row instanceof WeaponRow.PlainLine) {
                $this$serializeWeaponDat_u24lambda_u248.append(((WeaponRow.PlainLine) row).getText());
            }
            if (index != CollectionsKt__CollectionsKt.getLastIndex(rows)) {
                $this$serializeWeaponDat_u24lambda_u248.append('\n');
            }
            index = index$iv;
        }
        String string = $this$serializeWeaponDat_u24lambda_u248.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final List<WeaponRow.GunLine> extractGunLines(List<? extends WeaponRow> rows) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        List<? extends WeaponRow> $this$filterIsInstance$iv = rows;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filterIsInstance$iv) {
            if (element$iv$iv instanceof WeaponRow.GunLine) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        return (List) destination$iv$iv;
    }
}
