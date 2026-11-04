package com.blackhub.bronline.neizzir.fragments.weapon;

import android.content.Context;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.common.C2493C;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.neizzir.fragments.sborks.util.FileUtils;
import com.blackhub.bronline.neizzir.network.CachePolicy;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.EndpointRouter;
import com.blackhub.bronline.neizzir.network.NetworkResult;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import com.helpshift.proactive.InAppViewConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
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
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
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
import kotlin.p040io.FilesKt__UtilsKt;
import kotlin.p040io.TextStreamsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: WeaponJsonRepository.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003789B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\u000e\u0010\u0011\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0082@¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001f\u001a\u00020\u0004H\u0002J\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010!\u001a\u00020\u0004J\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u001dJ\u001e\u0010%\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J$\u0010'\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@¢\u0006\u0002\u0010(J\u0014\u0010)\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u000eH\u0002J\u0010\u0010,\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0004H\u0002J\u001b\u0010/\u001a\u0004\u0018\u000100*\u0002012\u0006\u00102\u001a\u00020\u0004H\u0002¢\u0006\u0002\u00103J\u001b\u00104\u001a\u0004\u0018\u000105*\u0002012\u0006\u00102\u001a\u00020\u0004H\u0002¢\u0006\u0002\u00106R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006:"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponJsonRepository;", "", "()V", "TAG", "", "WEAPON_PATH_IN_CHECKSUMS", "applyOverrides", "", "Lcom/blackhub/bronline/neizzir/fragments/weapon/Weapon;", "weapons", "overrides", "", "Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponJsonRepository$OverrideValues;", "backupOnce", "Ljava/io/File;", "source", "backupName", "downloadStockWeaponJson", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchWeaponChecksum", "Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponJsonRepository$WeaponChecksum;", "getExternalWeaponFile", "context", "Landroid/content/Context;", "getLocalWeaponFile", "getOverridesFile", "getWeaponDir", "loadOverrides", "loadWeapons", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseChecksums", "text", "parseWeaponJson", "jsonText", "repairForLaunch", "Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponJsonRepository$RepairResult;", "resetToStock", "saveOverrides", "", "saveWeapons", "(Landroid/content/Context;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serializeWeapons", "sha1OfFile", "file", "syncWeaponToExternalData", "writeAtomically", TypedValues.AttributesType.S_TARGET, "optFiniteFloat", "", "Lorg/json/JSONObject;", "key", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Float;", "optFiniteInt", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "OverrideValues", "RepairResult", "WeaponChecksum", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class WeaponJsonRepository {
    public static final WeaponJsonRepository INSTANCE = new WeaponJsonRepository();
    private static final String TAG = "WeaponJsonRepository";
    private static final String WEAPON_PATH_IN_CHECKSUMS = "weapon/weapon.json";

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository$downloadStockWeaponJson$1 */
    /* JADX INFO: compiled from: WeaponJsonRepository.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository", m4426f = "WeaponJsonRepository.kt", m4427i = {}, m4428l = {236}, m4429m = "downloadStockWeaponJson", m4430n = {}, m4431s = {})
    static final class C55951 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C55951(Continuation<? super C55951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WeaponJsonRepository.this.downloadStockWeaponJson(this);
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository$fetchWeaponChecksum$1 */
    /* JADX INFO: compiled from: WeaponJsonRepository.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository", m4426f = "WeaponJsonRepository.kt", m4427i = {0}, m4428l = {246}, m4429m = "fetchWeaponChecksum", m4430n = {"this"}, m4431s = {"L$0"})
    static final class C55961 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C55961(Continuation<? super C55961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WeaponJsonRepository.this.fetchWeaponChecksum(this);
        }
    }

    private WeaponJsonRepository() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: WeaponJsonRepository.kt */
    @Metadata(m4415d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponJsonRepository$WeaponChecksum;", "", "sha1", "", "size", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "getSha1", "()Ljava/lang/String;", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponJsonRepository$WeaponChecksum;", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
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

    /* JADX INFO: compiled from: WeaponJsonRepository.kt */
    @Metadata(m4415d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0086\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\fHÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0017\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0018\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0019\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001a\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001b\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001c\u0010\u0010¨\u0006/"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponJsonRepository$OverrideValues;", "", "accuracy", "", "moveSpeed", "range", "firingRate", InAppViewConstants.RADIUS, "projectileSpeed", "lifespan", "spread", "flags", "", "animBreakout", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAccuracy", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getAnimBreakout", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFiringRate", "getFlags", "getLifespan", "getMoveSpeed", "getProjectileSpeed", "getRadius", "getRange", "getSpread", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponJsonRepository$OverrideValues;", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final /* data */ class OverrideValues {
        private final Float accuracy;
        private final Integer animBreakout;
        private final Float firingRate;
        private final Integer flags;
        private final Float lifespan;
        private final Float moveSpeed;
        private final Float projectileSpeed;
        private final Float radius;
        private final Float range;
        private final Float spread;

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Float getAccuracy() {
            return this.accuracy;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final Integer getAnimBreakout() {
            return this.animBreakout;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Float getMoveSpeed() {
            return this.moveSpeed;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Float getRange() {
            return this.range;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Float getFiringRate() {
            return this.firingRate;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Float getRadius() {
            return this.radius;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Float getProjectileSpeed() {
            return this.projectileSpeed;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Float getLifespan() {
            return this.lifespan;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Float getSpread() {
            return this.spread;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Integer getFlags() {
            return this.flags;
        }

        public final OverrideValues copy(Float accuracy, Float moveSpeed, Float range, Float firingRate, Float radius, Float projectileSpeed, Float lifespan, Float spread, Integer flags, Integer animBreakout) {
            return new OverrideValues(accuracy, moveSpeed, range, firingRate, radius, projectileSpeed, lifespan, spread, flags, animBreakout);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OverrideValues)) {
                return false;
            }
            OverrideValues overrideValues = (OverrideValues) other;
            return Intrinsics.areEqual((Object) this.accuracy, (Object) overrideValues.accuracy) && Intrinsics.areEqual((Object) this.moveSpeed, (Object) overrideValues.moveSpeed) && Intrinsics.areEqual((Object) this.range, (Object) overrideValues.range) && Intrinsics.areEqual((Object) this.firingRate, (Object) overrideValues.firingRate) && Intrinsics.areEqual((Object) this.radius, (Object) overrideValues.radius) && Intrinsics.areEqual((Object) this.projectileSpeed, (Object) overrideValues.projectileSpeed) && Intrinsics.areEqual((Object) this.lifespan, (Object) overrideValues.lifespan) && Intrinsics.areEqual((Object) this.spread, (Object) overrideValues.spread) && Intrinsics.areEqual(this.flags, overrideValues.flags) && Intrinsics.areEqual(this.animBreakout, overrideValues.animBreakout);
        }

        public int hashCode() {
            return ((((((((((((((((((this.accuracy == null ? 0 : this.accuracy.hashCode()) * 31) + (this.moveSpeed == null ? 0 : this.moveSpeed.hashCode())) * 31) + (this.range == null ? 0 : this.range.hashCode())) * 31) + (this.firingRate == null ? 0 : this.firingRate.hashCode())) * 31) + (this.radius == null ? 0 : this.radius.hashCode())) * 31) + (this.projectileSpeed == null ? 0 : this.projectileSpeed.hashCode())) * 31) + (this.lifespan == null ? 0 : this.lifespan.hashCode())) * 31) + (this.spread == null ? 0 : this.spread.hashCode())) * 31) + (this.flags == null ? 0 : this.flags.hashCode())) * 31) + (this.animBreakout != null ? this.animBreakout.hashCode() : 0);
        }

        public String toString() {
            return "OverrideValues(accuracy=" + this.accuracy + ", moveSpeed=" + this.moveSpeed + ", range=" + this.range + ", firingRate=" + this.firingRate + ", radius=" + this.radius + ", projectileSpeed=" + this.projectileSpeed + ", lifespan=" + this.lifespan + ", spread=" + this.spread + ", flags=" + this.flags + ", animBreakout=" + this.animBreakout + ')';
        }

        public OverrideValues(Float accuracy, Float moveSpeed, Float range, Float firingRate, Float radius, Float projectileSpeed, Float lifespan, Float spread, Integer flags, Integer animBreakout) {
            this.accuracy = accuracy;
            this.moveSpeed = moveSpeed;
            this.range = range;
            this.firingRate = firingRate;
            this.radius = radius;
            this.projectileSpeed = projectileSpeed;
            this.lifespan = lifespan;
            this.spread = spread;
            this.flags = flags;
            this.animBreakout = animBreakout;
        }

        public final Float getAccuracy() {
            return this.accuracy;
        }

        public final Float getMoveSpeed() {
            return this.moveSpeed;
        }

        public final Float getRange() {
            return this.range;
        }

        public final Float getFiringRate() {
            return this.firingRate;
        }

        public final Float getRadius() {
            return this.radius;
        }

        public final Float getProjectileSpeed() {
            return this.projectileSpeed;
        }

        public final Float getLifespan() {
            return this.lifespan;
        }

        public final Float getSpread() {
            return this.spread;
        }

        public final Integer getFlags() {
            return this.flags;
        }

        public final Integer getAnimBreakout() {
            return this.animBreakout;
        }
    }

    /* JADX INFO: compiled from: WeaponJsonRepository.kt */
    @Metadata(m4415d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponJsonRepository$RepairResult;", "", "repaired", "", "localBackup", "Ljava/io/File;", "overridesBackup", "(ZLjava/io/File;Ljava/io/File;)V", "getLocalBackup", "()Ljava/io/File;", "getOverridesBackup", "getRepaired", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final /* data */ class RepairResult {
        private final File localBackup;
        private final File overridesBackup;
        private final boolean repaired;

        public static /* synthetic */ RepairResult copy$default(RepairResult repairResult, boolean z, File file, File file2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = repairResult.repaired;
            }
            if ((i & 2) != 0) {
                file = repairResult.localBackup;
            }
            if ((i & 4) != 0) {
                file2 = repairResult.overridesBackup;
            }
            return repairResult.copy(z, file, file2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getRepaired() {
            return this.repaired;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final File getLocalBackup() {
            return this.localBackup;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final File getOverridesBackup() {
            return this.overridesBackup;
        }

        public final RepairResult copy(boolean repaired, File localBackup, File overridesBackup) {
            return new RepairResult(repaired, localBackup, overridesBackup);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RepairResult)) {
                return false;
            }
            RepairResult repairResult = (RepairResult) other;
            return this.repaired == repairResult.repaired && Intrinsics.areEqual(this.localBackup, repairResult.localBackup) && Intrinsics.areEqual(this.overridesBackup, repairResult.overridesBackup);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.repaired) * 31) + (this.localBackup == null ? 0 : this.localBackup.hashCode())) * 31) + (this.overridesBackup != null ? this.overridesBackup.hashCode() : 0);
        }

        public String toString() {
            return "RepairResult(repaired=" + this.repaired + ", localBackup=" + this.localBackup + ", overridesBackup=" + this.overridesBackup + ')';
        }

        public RepairResult(boolean repaired, File localBackup, File overridesBackup) {
            this.repaired = repaired;
            this.localBackup = localBackup;
            this.overridesBackup = overridesBackup;
        }

        public final boolean getRepaired() {
            return this.repaired;
        }

        public final File getLocalBackup() {
            return this.localBackup;
        }

        public final File getOverridesBackup() {
            return this.overridesBackup;
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
        return new File(getWeaponDir(context), "weapon.json");
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
        return new File(dir, "weapon.json");
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

    public final RepairResult repairForLaunch(Context context) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(C3715R.raw.weapon);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
        Reader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            BufferedReader it = bufferedReader;
            String stockJson = TextStreamsKt.readText(it);
            File localBackup = null;
            CloseableKt.closeFinally(bufferedReader, null);
            File localFile = getLocalWeaponFile(context);
            File overridesFile = getOverridesFile(context);
            File file = localFile.exists() ? localFile : null;
            boolean needsRepair = true;
            String candidateJson = file != null ? FilesKt__FileReadWriteKt.readText$default(file, null, 1, null) : null;
            File file2 = overridesFile.exists() ? overridesFile : null;
            String overridesJson = file2 != null ? FilesKt__FileReadWriteKt.readText$default(file2, null, 1, null) : null;
            String migratedJson = WeaponJsonCompatibility.INSTANCE.migrate(stockJson, candidateJson, overridesJson);
            if (candidateJson != null && WeaponJsonCompatibility.INSTANCE.jsonEquals(candidateJson, migratedJson)) {
                needsRepair = false;
            }
            if (candidateJson != null && needsRepair) {
                localBackup = backupOnce(localFile, "weapon.json.pre-repair.bak");
            }
            if (needsRepair) {
                writeAtomically(localFile, migratedJson);
            }
            File overridesBackup = null;
            if (candidateJson != null || overridesJson != null) {
                String safeOverrides = WeaponJsonCompatibility.INSTANCE.extractOverrides(migratedJson, stockJson);
                if (overridesJson == null || !WeaponJsonCompatibility.INSTANCE.jsonEquals(overridesJson, safeOverrides)) {
                    if (overridesJson != null) {
                        overridesBackup = backupOnce(overridesFile, "weapon_overrides.json.pre-repair.bak");
                    }
                    writeAtomically(overridesFile, safeOverrides);
                }
            }
            if (needsRepair) {
                Log.i(TAG, "weapon.json migrated to the bundled schema");
            }
            return new RepairResult(needsRepair, localBackup, overridesBackup);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(bufferedReader, th);
                throw th2;
            }
        }
    }

    public final Object loadWeapons(Context context, Continuation<? super List<Weapon>> continuation) {
        File file = getLocalWeaponFile(context);
        return BuildersKt.withContext(Dispatchers.getIO(), new C55972(context, file, null), continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository$loadWeapons$2 */
    /* JADX INFO: compiled from: WeaponJsonRepository.kt */
    @Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lcom/blackhub/bronline/neizzir/fragments/weapon/Weapon;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository$loadWeapons$2", m4426f = "WeaponJsonRepository.kt", m4427i = {}, m4428l = {141, 149, 159, 179}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55972 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Weapon>>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ File $file;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55972(Context context, File file, Continuation<? super C55972> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$file = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55972(this.$context, this.$file, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Weapon>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<Weapon>>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<Weapon>> continuation) {
            return ((C55972) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x005e  */
        /* JADX WARN: Code duplicated, block: B:32:0x0066  */
        /* JADX WARN: Code duplicated, block: B:34:0x0073 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x0074  */
        /* JADX WARN: Code duplicated, block: B:38:0x007f  */
        /* JADX WARN: Code duplicated, block: B:40:0x0094  */
        /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:45:0x00b8 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:68:0x0129 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:69:0x012a  */
        /* JADX WARN: Code duplicated, block: B:79:0x0154  */
        /* JADX WARN: Code duplicated, block: B:82:0x0168  */
        /* JADX WARN: Code duplicated, block: B:88:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v10, types: [com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository$loadWeapons$2] */
        /* JADX WARN: Type inference failed for: r0v11, types: [com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository$loadWeapons$2] */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9, types: [com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository$loadWeapons$2] */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v4, types: [com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository$WeaponChecksum] */
        /* JADX WARN: Type inference failed for: r10v52 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v13, types: [com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository$loadWeapons$2] */
        /* JADX WARN: Type inference failed for: r5v14, types: [com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository$loadWeapons$2] */
        /* JADX WARN: Type inference failed for: r5v15 */
        /* JADX WARN: Type inference failed for: r5v2, types: [com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository$loadWeapons$2] */
        /* JADX WARN: Type inference failed for: r5v22 */
        /* JADX WARN: Type inference failed for: r5v23 */
        /* JADX WARN: Type inference failed for: r5v24 */
        /* JADX WARN: Type inference failed for: r5v25 */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v9 */
        /* JADX WARN: Type inference failed for: r6v5 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException, IOException {
            ?? r5;
            Object obj2;
            ?? r10;
            String strSha1OfFile;
            ?? r0;
            Object objDownloadStockWeaponJson;
            List<Weapon> weaponJson;
            Object objDownloadStockWeaponJson2;
            ?? r1;
            Object objDownloadStockWeaponJson3;
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
            C55972 c55972;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            obj = this.label;
            try {
                switch (obj) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        WeaponJsonRepository.INSTANCE.repairForLaunch(this.$context);
                        this.label = 1;
                        Object objFetchWeaponChecksum = WeaponJsonRepository.INSTANCE.fetchWeaponChecksum(this);
                        if (objFetchWeaponChecksum == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj7 = objFetchWeaponChecksum;
                        c55972 = this;
                        try {
                            obj = (WeaponChecksum) obj7;
                            obj2 = obj;
                            r5 = c55972;
                            r10 = obj;
                            break;
                        } catch (Exception e) {
                            obj = obj;
                            obj = c55972;
                            r5 = obj;
                            obj2 = obj;
                            r10 = 0;
                        }
                        if (r10 == 0) {
                            if (r5.$file.exists()) {
                                try {
                                    strSha1OfFile = WeaponJsonRepository.INSTANCE.sha1OfFile(r5.$file);
                                } catch (Exception e2) {
                                    strSha1OfFile = null;
                                }
                                if (strSha1OfFile == null && StringsKt__StringsJVMKt.equals(strSha1OfFile, r10.getSha1(), true)) {
                                    weaponJson = WeaponJsonRepository.INSTANCE.parseWeaponJson(FilesKt__FileReadWriteKt.readText$default(r5.$file, null, 1, null));
                                    r6 = r5;
                                } else {
                                    try {
                                        r5.label = 4;
                                        objDownloadStockWeaponJson = WeaponJsonRepository.INSTANCE.downloadStockWeaponJson((Continuation) r5);
                                        if (objDownloadStockWeaponJson == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        r0 = r5;
                                        obj6 = obj2;
                                        obj5 = objDownloadStockWeaponJson;
                                        try {
                                            text$default = (String) obj5;
                                            r7 = r0;
                                        } catch (Exception e3) {
                                            obj = obj6;
                                            r7 = r0;
                                            text$default = FilesKt__FileReadWriteKt.readText$default(r0.$file, null, 1, null);
                                        }
                                        weaponJson = WeaponJsonRepository.INSTANCE.parseWeaponJson(text$default);
                                        mapLoadOverrides2 = WeaponJsonRepository.INSTANCE.loadOverrides(r7.$context);
                                        if (!mapLoadOverrides2.isEmpty()) {
                                            weaponJson = WeaponJsonRepository.INSTANCE.applyOverrides(weaponJson, mapLoadOverrides2);
                                        }
                                        String strSerializeWeapons = WeaponJsonRepository.INSTANCE.serializeWeapons(weaponJson);
                                        parentFile3 = r7.$file.getParentFile();
                                        if (parentFile3 != null) {
                                            Boxing.boxBoolean(parentFile3.mkdirs());
                                        }
                                        FilesKt__FileReadWriteKt.writeText$default(r7.$file, strSerializeWeapons, null, 2, null);
                                        r6 = r7;
                                    } catch (Exception e4) {
                                        obj = obj2;
                                        r0 = r5;
                                        r7 = r0;
                                        text$default = FilesKt__FileReadWriteKt.readText$default(r0.$file, null, 1, null);
                                        weaponJson = WeaponJsonRepository.INSTANCE.parseWeaponJson(text$default);
                                        mapLoadOverrides2 = WeaponJsonRepository.INSTANCE.loadOverrides(r7.$context);
                                        if (!mapLoadOverrides2.isEmpty()) {
                                            weaponJson = WeaponJsonRepository.INSTANCE.applyOverrides(weaponJson, mapLoadOverrides2);
                                        }
                                        String strSerializeWeapons2 = WeaponJsonRepository.INSTANCE.serializeWeapons(weaponJson);
                                        parentFile3 = r7.$file.getParentFile();
                                        if (parentFile3 != null) {
                                            Boxing.boxBoolean(parentFile3.mkdirs());
                                        }
                                        FilesKt__FileReadWriteKt.writeText$default(r7.$file, strSerializeWeapons2, null, 2, null);
                                        r6 = r7;
                                        WeaponJsonRepository.INSTANCE.syncWeaponToExternalData(r6.$context);
                                        return weaponJson;
                                    }
                                }
                            } else {
                                r5.label = 3;
                                objDownloadStockWeaponJson2 = WeaponJsonRepository.INSTANCE.downloadStockWeaponJson((Continuation) r5);
                                if (objDownloadStockWeaponJson2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                r1 = r5;
                                obj4 = objDownloadStockWeaponJson2;
                                weaponJson = WeaponJsonRepository.INSTANCE.parseWeaponJson((String) obj4);
                                mapLoadOverrides = WeaponJsonRepository.INSTANCE.loadOverrides(r1.$context);
                                if (!mapLoadOverrides.isEmpty()) {
                                    weaponJson = WeaponJsonRepository.INSTANCE.applyOverrides(weaponJson, mapLoadOverrides);
                                }
                                String strSerializeWeapons3 = WeaponJsonRepository.INSTANCE.serializeWeapons(weaponJson);
                                parentFile2 = r1.$file.getParentFile();
                                if (parentFile2 != null) {
                                    Boxing.boxBoolean(parentFile2.mkdirs());
                                }
                                FilesKt__FileReadWriteKt.writeText$default(r1.$file, strSerializeWeapons3, null, 2, null);
                                r6 = r1;
                            }
                            break;
                        } else if (r5.$file.exists()) {
                            weaponJson = WeaponJsonRepository.INSTANCE.parseWeaponJson(FilesKt__FileReadWriteKt.readText$default(r5.$file, null, 1, null));
                            r6 = r5;
                        } else {
                            r5.label = 2;
                            objDownloadStockWeaponJson3 = WeaponJsonRepository.INSTANCE.downloadStockWeaponJson((Continuation) r5);
                            if (objDownloadStockWeaponJson3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r2 = r5;
                            obj3 = objDownloadStockWeaponJson3;
                            String str = (String) obj3;
                            parentFile = r2.$file.getParentFile();
                            if (parentFile != null) {
                                Boxing.boxBoolean(parentFile.mkdirs());
                            }
                            FilesKt__FileReadWriteKt.writeText$default(r2.$file, str, null, 2, null);
                            weaponJson = WeaponJsonRepository.INSTANCE.parseWeaponJson(str);
                            r6 = r2;
                        }
                        WeaponJsonRepository.INSTANCE.syncWeaponToExternalData(r6.$context);
                        return weaponJson;
                    case 1:
                        ResultKt.throwOnFailure(obj);
                        c55972 = this;
                        obj7 = obj;
                        obj = (WeaponChecksum) obj7;
                        obj2 = obj;
                        r5 = c55972;
                        r10 = obj;
                        if (r10 == 0) {
                            if (r5.$file.exists()) {
                                r5.label = 3;
                                objDownloadStockWeaponJson2 = WeaponJsonRepository.INSTANCE.downloadStockWeaponJson((Continuation) r5);
                                if (objDownloadStockWeaponJson2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                r1 = r5;
                                obj4 = objDownloadStockWeaponJson2;
                                weaponJson = WeaponJsonRepository.INSTANCE.parseWeaponJson((String) obj4);
                                mapLoadOverrides = WeaponJsonRepository.INSTANCE.loadOverrides(r1.$context);
                                if (!mapLoadOverrides.isEmpty()) {
                                    weaponJson = WeaponJsonRepository.INSTANCE.applyOverrides(weaponJson, mapLoadOverrides);
                                }
                                String strSerializeWeapons4 = WeaponJsonRepository.INSTANCE.serializeWeapons(weaponJson);
                                parentFile2 = r1.$file.getParentFile();
                                if (parentFile2 != null) {
                                    Boxing.boxBoolean(parentFile2.mkdirs());
                                }
                                FilesKt__FileReadWriteKt.writeText$default(r1.$file, strSerializeWeapons4, null, 2, null);
                                r6 = r1;
                            } else {
                                strSha1OfFile = WeaponJsonRepository.INSTANCE.sha1OfFile(r5.$file);
                                if (strSha1OfFile == null) {
                                }
                                r5.label = 4;
                                objDownloadStockWeaponJson = WeaponJsonRepository.INSTANCE.downloadStockWeaponJson((Continuation) r5);
                                if (objDownloadStockWeaponJson == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                r0 = r5;
                                obj6 = obj2;
                                obj5 = objDownloadStockWeaponJson;
                                text$default = (String) obj5;
                                r7 = r0;
                                weaponJson = WeaponJsonRepository.INSTANCE.parseWeaponJson(text$default);
                                mapLoadOverrides2 = WeaponJsonRepository.INSTANCE.loadOverrides(r7.$context);
                                if (!mapLoadOverrides2.isEmpty()) {
                                    weaponJson = WeaponJsonRepository.INSTANCE.applyOverrides(weaponJson, mapLoadOverrides2);
                                }
                                String strSerializeWeapons5 = WeaponJsonRepository.INSTANCE.serializeWeapons(weaponJson);
                                parentFile3 = r7.$file.getParentFile();
                                if (parentFile3 != null) {
                                    Boxing.boxBoolean(parentFile3.mkdirs());
                                }
                                FilesKt__FileReadWriteKt.writeText$default(r7.$file, strSerializeWeapons5, null, 2, null);
                                r6 = r7;
                            }
                            break;
                        } else if (r5.$file.exists()) {
                            r5.label = 2;
                            objDownloadStockWeaponJson3 = WeaponJsonRepository.INSTANCE.downloadStockWeaponJson((Continuation) r5);
                            if (objDownloadStockWeaponJson3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r2 = r5;
                            obj3 = objDownloadStockWeaponJson3;
                            String str2 = (String) obj3;
                            parentFile = r2.$file.getParentFile();
                            if (parentFile != null) {
                                Boxing.boxBoolean(parentFile.mkdirs());
                            }
                            FilesKt__FileReadWriteKt.writeText$default(r2.$file, str2, null, 2, null);
                            weaponJson = WeaponJsonRepository.INSTANCE.parseWeaponJson(str2);
                            r6 = r2;
                        } else {
                            weaponJson = WeaponJsonRepository.INSTANCE.parseWeaponJson(FilesKt__FileReadWriteKt.readText$default(r5.$file, null, 1, null));
                            r6 = r5;
                        }
                        WeaponJsonRepository.INSTANCE.syncWeaponToExternalData(r6.$context);
                        return weaponJson;
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
                        weaponJson = WeaponJsonRepository.INSTANCE.parseWeaponJson(str3);
                        r6 = r2;
                        WeaponJsonRepository.INSTANCE.syncWeaponToExternalData(r6.$context);
                        return weaponJson;
                    case 3:
                        r1 = this;
                        ResultKt.throwOnFailure(obj);
                        obj4 = obj;
                        weaponJson = WeaponJsonRepository.INSTANCE.parseWeaponJson((String) obj4);
                        mapLoadOverrides = WeaponJsonRepository.INSTANCE.loadOverrides(r1.$context);
                        if (!mapLoadOverrides.isEmpty()) {
                            weaponJson = WeaponJsonRepository.INSTANCE.applyOverrides(weaponJson, mapLoadOverrides);
                        }
                        String strSerializeWeapons6 = WeaponJsonRepository.INSTANCE.serializeWeapons(weaponJson);
                        parentFile2 = r1.$file.getParentFile();
                        if (parentFile2 != null) {
                            Boxing.boxBoolean(parentFile2.mkdirs());
                        }
                        FilesKt__FileReadWriteKt.writeText$default(r1.$file, strSerializeWeapons6, null, 2, null);
                        r6 = r1;
                        WeaponJsonRepository.INSTANCE.syncWeaponToExternalData(r6.$context);
                        return weaponJson;
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
                            weaponJson = WeaponJsonRepository.INSTANCE.parseWeaponJson(text$default);
                            mapLoadOverrides2 = WeaponJsonRepository.INSTANCE.loadOverrides(r7.$context);
                            if (!mapLoadOverrides2.isEmpty()) {
                                weaponJson = WeaponJsonRepository.INSTANCE.applyOverrides(weaponJson, mapLoadOverrides2);
                            }
                            String strSerializeWeapons7 = WeaponJsonRepository.INSTANCE.serializeWeapons(weaponJson);
                            parentFile3 = r7.$file.getParentFile();
                            if (parentFile3 != null) {
                                Boxing.boxBoolean(parentFile3.mkdirs());
                            }
                            FilesKt__FileReadWriteKt.writeText$default(r7.$file, strSerializeWeapons7, null, 2, null);
                            r6 = r7;
                            WeaponJsonRepository.INSTANCE.syncWeaponToExternalData(r6.$context);
                            return weaponJson;
                        }
                        weaponJson = WeaponJsonRepository.INSTANCE.parseWeaponJson(text$default);
                        mapLoadOverrides2 = WeaponJsonRepository.INSTANCE.loadOverrides(r7.$context);
                        if (!mapLoadOverrides2.isEmpty()) {
                            weaponJson = WeaponJsonRepository.INSTANCE.applyOverrides(weaponJson, mapLoadOverrides2);
                        }
                        String strSerializeWeapons8 = WeaponJsonRepository.INSTANCE.serializeWeapons(weaponJson);
                        parentFile3 = r7.$file.getParentFile();
                        if (parentFile3 != null) {
                            Boxing.boxBoolean(parentFile3.mkdirs());
                        }
                        FilesKt__FileReadWriteKt.writeText$default(r7.$file, strSerializeWeapons8, null, 2, null);
                        r6 = r7;
                        WeaponJsonRepository.INSTANCE.syncWeaponToExternalData(r6.$context);
                        return weaponJson;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e6) {
            }
        }
    }

    public final Object resetToStock(Context context, Continuation<? super List<Weapon>> continuation) {
        File file = getLocalWeaponFile(context);
        File overridesFile = getOverridesFile(context);
        return BuildersKt.withContext(Dispatchers.getIO(), new C55982(file, overridesFile, context, null), continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository$resetToStock$2 */
    /* JADX INFO: compiled from: WeaponJsonRepository.kt */
    @Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lcom/blackhub/bronline/neizzir/fragments/weapon/Weapon;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository$resetToStock$2", m4426f = "WeaponJsonRepository.kt", m4427i = {}, m4428l = {210}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55982 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Weapon>>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ File $file;
        final /* synthetic */ File $overridesFile;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55982(File file, File file2, Context context, Continuation<? super C55982> continuation) {
            super(2, continuation);
            this.$file = file;
            this.$overridesFile = file2;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55982(this.$file, this.$overridesFile, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Weapon>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<Weapon>>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<Weapon>> continuation) {
            return ((C55982) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws IOException {
            C55982 c55982;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c55982 = this;
                    c55982.label = 1;
                    Object objDownloadStockWeaponJson = WeaponJsonRepository.INSTANCE.downloadStockWeaponJson(c55982);
                    if (objDownloadStockWeaponJson == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objDownloadStockWeaponJson;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c55982 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String stockJson = (String) $result;
            File parentFile = c55982.$file.getParentFile();
            if (parentFile != null) {
                Boxing.boxBoolean(parentFile.mkdirs());
            }
            FilesKt__FileReadWriteKt.writeText$default(c55982.$file, stockJson, null, 2, null);
            if (c55982.$overridesFile.exists()) {
                c55982.$overridesFile.delete();
            }
            WeaponJsonRepository.INSTANCE.syncWeaponToExternalData(c55982.$context);
            return WeaponJsonRepository.INSTANCE.parseWeaponJson(stockJson);
        }
    }

    public final Object saveWeapons(Context context, List<Weapon> list, Continuation<? super Unit> continuation) throws JSONException {
        File file = getLocalWeaponFile(context);
        String jsonText = serializeWeapons(list);
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C55992(file, jsonText, context, list, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository$saveWeapons$2 */
    /* JADX INFO: compiled from: WeaponJsonRepository.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository$saveWeapons$2", m4426f = "WeaponJsonRepository.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55992 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ File $file;
        final /* synthetic */ String $jsonText;
        final /* synthetic */ List<Weapon> $weapons;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55992(File file, String str, Context context, List<Weapon> list, Continuation<? super C55992> continuation) {
            super(2, continuation);
            this.$file = file;
            this.$jsonText = str;
            this.$context = context;
            this.$weapons = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55992(this.$file, this.$jsonText, this.$context, this.$weapons, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55992) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    FilesKt__FileReadWriteKt.writeText$default(this.$file, this.$jsonText, null, 2, null);
                    WeaponJsonRepository.INSTANCE.saveOverrides(this.$context, this.$weapons);
                    WeaponJsonRepository.INSTANCE.syncWeaponToExternalData(this.$context);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object downloadStockWeaponJson(Continuation<? super String> continuation) throws IOException {
        C55951 c55951;
        Object bytes;
        byte[] it;
        if (continuation instanceof C55951) {
            c55951 = (C55951) continuation;
            if ((c55951.label & Integer.MIN_VALUE) != 0) {
                c55951.label -= Integer.MIN_VALUE;
            } else {
                c55951 = new C55951(continuation);
            }
        } else {
            c55951 = new C55951(continuation);
        }
        C55951 c55952 = c55951;
        Object $result = c55952.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c55952.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                WeaponJsonRepository$downloadStockWeaponJson$result$1 weaponJsonRepository$downloadStockWeaponJson$result$1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository$downloadStockWeaponJson$result$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(byte[] it2) {
                        Object objM15551constructorimpl;
                        Intrinsics.checkNotNullParameter(it2, "it");
                        WeaponJsonRepository $this$invoke_u24lambda_u240 = WeaponJsonRepository.INSTANCE;
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            objM15551constructorimpl = Result.m15551constructorimpl($this$invoke_u24lambda_u240.parseWeaponJson(new String(it2, Charsets.UTF_8)));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                        }
                        return Boolean.valueOf(Result.m15558isSuccessimpl(objM15551constructorimpl));
                    }
                };
                c55952.label = 1;
                bytes = router.getBytes(endpointGroup, "/Custom/weapon/weapon.json", (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : null, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? EndpointRouter.C56582.INSTANCE : weaponJsonRepository$downloadStockWeaponJson$result$1, c55952);
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
        throw new IOException("Не удалось скачать weapon.json с обоих адресов");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object fetchWeaponChecksum(Continuation<? super WeaponChecksum> continuation) {
        C55961 c55961;
        WeaponJsonRepository weaponJsonRepository;
        Object bytes;
        if (continuation instanceof C55961) {
            c55961 = (C55961) continuation;
            if ((c55961.label & Integer.MIN_VALUE) != 0) {
                c55961.label -= Integer.MIN_VALUE;
            } else {
                c55961 = new C55961(continuation);
            }
        } else {
            c55961 = new C55961(continuation);
        }
        C55961 c55962 = c55961;
        Object $result = c55962.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c55962.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                weaponJsonRepository = this;
                EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                WeaponJsonRepository$fetchWeaponChecksum$result$1 weaponJsonRepository$fetchWeaponChecksum$result$1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository$fetchWeaponChecksum$result$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(byte[] it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(WeaponJsonRepository.INSTANCE.parseChecksums(new String(it, Charsets.UTF_8)) != null);
                    }
                };
                c55962.L$0 = weaponJsonRepository;
                c55962.label = 1;
                bytes = router.getBytes(endpointGroup, "/Custom/checksums.json", (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : null, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? EndpointRouter.C56582.INSTANCE : weaponJsonRepository$fetchWeaponChecksum$result$1, c55962);
                if (bytes == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                WeaponJsonRepository weaponJsonRepository2 = (WeaponJsonRepository) c55962.L$0;
                ResultKt.throwOnFailure($result);
                weaponJsonRepository = weaponJsonRepository2;
                bytes = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        NetworkResult.Success result = bytes instanceof NetworkResult.Success ? (NetworkResult.Success) bytes : null;
        if (result == null) {
            return null;
        }
        return weaponJsonRepository.parseChecksums(new String((byte[]) result.getValue(), Charsets.UTF_8));
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
        } catch (Exception e) {
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
            } catch (Exception e2) {
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
                    return ArraysKt___ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.blackhub.bronline.neizzir.fragments.weapon.WeaponJsonRepository.sha1OfFile.2
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

    private final File backupOnce(File source, String backupName) {
        File backup = new File(source.getParentFile(), backupName);
        if (!backup.exists()) {
            FilesKt__UtilsKt.copyTo$default(source, backup, false, 0, 6, null);
        }
        if (backup.exists()) {
            return backup;
        }
        return null;
    }

    private final void writeAtomically(File target, String text) {
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        File temporary = new File(target.getParentFile(), '.' + target.getName() + ".tmp");
        try {
            FilesKt__FileReadWriteKt.writeText$default(temporary, text, null, 2, null);
            FilesKt__UtilsKt.copyTo$default(temporary, target, true, 0, 4, null);
        } finally {
            temporary.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveOverrides(Context context, List<Weapon> weapons) throws JSONException {
        String currentJson = serializeWeapons(weapons);
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(C3715R.raw.weapon);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
        Reader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            BufferedReader it = bufferedReader;
            String stockJson = TextStreamsKt.readText(it);
            CloseableKt.closeFinally(bufferedReader, null);
            String overridesJson = WeaponJsonCompatibility.INSTANCE.extractOverrides(currentJson, stockJson);
            File file = getOverridesFile(context);
            writeAtomically(file, overridesJson);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(bufferedReader, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, OverrideValues> loadOverrides(Context context) {
        JSONObject root;
        JSONObject weaponsObj;
        Float fOptFiniteFloat;
        File file = getOverridesFile(context);
        if (!file.exists()) {
            return MapsKt__MapsKt.emptyMap();
        }
        boolean z = true;
        try {
            String text = FilesKt__FileReadWriteKt.readText$default(file, null, 1, null);
            if (StringsKt__StringsKt.trim((CharSequence) text).toString().length() != 0) {
                z = false;
            }
            if (!z && (weaponsObj = (root = new JSONObject(text)).optJSONObject("weapons")) != null) {
                Map result = new LinkedHashMap();
                Iterator<String> itKeys = weaponsObj.keys();
                while (itKeys.hasNext()) {
                    String name = itKeys.next();
                    JSONObject obj = weaponsObj.optJSONObject(name);
                    if (obj != null) {
                        Intrinsics.checkNotNull(name);
                        Float fOptFiniteFloat2 = optFiniteFloat(obj, "accuracy");
                        Float fOptFiniteFloat3 = optFiniteFloat(obj, "moveSpeed");
                        Float fOptFiniteFloat4 = optFiniteFloat(obj, "range");
                        Float fOptFiniteFloat5 = optFiniteFloat(obj, "firingRate");
                        Float fOptFiniteFloat6 = optFiniteFloat(obj, InAppViewConstants.RADIUS);
                        Float fOptFiniteFloat7 = optFiniteFloat(obj, "projectileSpeed");
                        if (fOptFiniteFloat7 == null) {
                            fOptFiniteFloat = optFiniteFloat(obj, "speed");
                        } else {
                            fOptFiniteFloat = fOptFiniteFloat7;
                        }
                        JSONObject root2 = root;
                        result.put(name, new OverrideValues(fOptFiniteFloat2, fOptFiniteFloat3, fOptFiniteFloat4, fOptFiniteFloat5, fOptFiniteFloat6, fOptFiniteFloat, optFiniteFloat(obj, "lifespan"), optFiniteFloat(obj, "spread"), optFiniteInt(obj, "flags"), optFiniteInt(obj, "animBreakout")));
                        root = root2;
                    }
                }
                return result;
            }
            return MapsKt__MapsKt.emptyMap();
        } catch (Exception e) {
            e.printStackTrace();
            return MapsKt__MapsKt.emptyMap();
        }
    }

    private final Float optFiniteFloat(JSONObject $this$optFiniteFloat, String key) {
        Object objOpt = $this$optFiniteFloat.opt(key);
        Number value = objOpt instanceof Number ? (Number) objOpt : null;
        if (value == null) {
            return null;
        }
        Double dValueOf = Double.valueOf(value.doubleValue());
        double it = dValueOf.doubleValue();
        if (!((Double.isInfinite(it) || Double.isNaN(it)) ? false : true)) {
            dValueOf = null;
        }
        if (dValueOf != null) {
            return Float.valueOf((float) dValueOf.doubleValue());
        }
        return null;
    }

    private final Integer optFiniteInt(JSONObject $this$optFiniteInt, String key) {
        Object objOpt = $this$optFiniteInt.opt(key);
        Number value = objOpt instanceof Number ? (Number) objOpt : null;
        if (value == null) {
            return null;
        }
        Double dValueOf = Double.valueOf(value.doubleValue());
        double it = dValueOf.doubleValue();
        if (!((Double.isInfinite(it) || Double.isNaN(it)) ? false : true)) {
            dValueOf = null;
        }
        if (dValueOf != null) {
            return Integer.valueOf((int) dValueOf.doubleValue());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Weapon> applyOverrides(List<Weapon> weapons, Map<String, OverrideValues> overrides) {
        Weapon weaponCopy;
        if (overrides.isEmpty()) {
            return weapons;
        }
        List<Weapon> $this$map$iv = weapons;
        Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            Weapon weapon = (Weapon) item$iv$iv;
            OverrideValues ov = overrides.get(weapon.getUniqueName());
            if (ov == null) {
                weaponCopy = weapon;
            } else {
                Float accuracy = ov.getAccuracy();
                float fFloatValue = accuracy != null ? accuracy.floatValue() : weapon.getAccuracy();
                Float moveSpeed = ov.getMoveSpeed();
                float fFloatValue2 = moveSpeed != null ? moveSpeed.floatValue() : weapon.getMoveSpeed();
                Float range = ov.getRange();
                float fFloatValue3 = range != null ? range.floatValue() : weapon.getRange();
                Float firingRate = ov.getFiringRate();
                float fFloatValue4 = firingRate != null ? firingRate.floatValue() : weapon.getFiringRate();
                Float radius = ov.getRadius();
                float fFloatValue5 = radius != null ? radius.floatValue() : weapon.getRadius();
                Float projectileSpeed = ov.getProjectileSpeed();
                float fFloatValue6 = projectileSpeed != null ? projectileSpeed.floatValue() : weapon.getSpeed();
                Float lifespan = ov.getLifespan();
                float fFloatValue7 = lifespan != null ? lifespan.floatValue() : weapon.getLifespan();
                Float spread = ov.getSpread();
                float fFloatValue8 = spread != null ? spread.floatValue() : weapon.getSpread();
                Integer flags = ov.getFlags();
                int iIntValue = flags != null ? flags.intValue() : weapon.getFlags();
                Integer animBreakout = ov.getAnimBreakout();
                weaponCopy = weapon.copy((263720191 & 1) != 0 ? weapon.id : 0, (263720191 & 2) != 0 ? weapon.uniqueName : null, (263720191 & 4) != 0 ? weapon.modelId : 0, (263720191 & 8) != 0 ? weapon.name : null, (263720191 & 16) != 0 ? weapon.image : null, (263720191 & 32) != 0 ? weapon.weaponCategory : 0, (263720191 & 64) != 0 ? weapon.weaponSlot : null, (263720191 & 128) != 0 ? weapon.fireType : null, (263720191 & 256) != 0 ? weapon.range : fFloatValue3, (263720191 & 512) != 0 ? weapon.radius : fFloatValue5, (263720191 & 1024) != 0 ? weapon.ammo : 0, (263720191 & 2048) != 0 ? weapon.damage : 0.0f, (263720191 & 4096) != 0 ? weapon.firingRate : fFloatValue4, (263720191 & 8192) != 0 ? weapon.accuracy : fFloatValue, (263720191 & 16384) != 0 ? weapon.moveSpeed : fFloatValue2, (263720191 & 32768) != 0 ? weapon.flags : iIntValue, (263720191 & 65536) != 0 ? weapon.speed : fFloatValue6, (263720191 & 131072) != 0 ? weapon.lifespan : fFloatValue7, (263720191 & 262144) != 0 ? weapon.spread : fFloatValue8, (263720191 & 524288) != 0 ? weapon.animGrpName : null, (263720191 & 1048576) != 0 ? weapon.animStand : null, (263720191 & 2097152) != 0 ? weapon.animCrouch : null, (263720191 & 4194304) != 0 ? weapon.animBreakout : animBreakout != null ? animBreakout.intValue() : weapon.getAnimBreakout(), (263720191 & 8388608) != 0 ? weapon.fireOffset : null, (263720191 & 16777216) != 0 ? weapon.ammoType : null, (263720191 & 33554432) != 0 ? weapon.sight : null, (263720191 & 67108864) != 0 ? weapon.baseComboName : null, (263720191 & C2493C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? weapon.sourceJson : null);
            }
            destination$iv$iv.add(weaponCopy);
        }
        return (List) destination$iv$iv;
    }

    public final List<Weapon> parseWeaponJson(String jsonText) {
        Intrinsics.checkNotNullParameter(jsonText, "jsonText");
        try {
            JSONObject json = new JSONObject(jsonText);
            JSONArray weaponsArray = json.getJSONArray("weapons");
            List result = new ArrayList();
            int length = weaponsArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject weaponObj = weaponsArray.getJSONObject(i);
                Weapon.Companion companion = Weapon.INSTANCE;
                Intrinsics.checkNotNull(weaponObj);
                result.add(companion.fromJson(weaponObj));
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    public final String serializeWeapons(List<Weapon> weapons) throws JSONException {
        Intrinsics.checkNotNullParameter(weapons, "weapons");
        JSONArray weaponsArray = new JSONArray();
        List<Weapon> $this$forEach$iv = weapons;
        for (Object element$iv : $this$forEach$iv) {
            Weapon weapon = (Weapon) element$iv;
            weaponsArray.put(weapon.toJson());
        }
        JSONObject root = new JSONObject();
        root.put("weapons", weaponsArray);
        String string = root.toString(2);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
