package com.blackhub.bronline.neizzir.fragments.weapon;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.helpshift.proactive.InAppViewConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: WeaponJsonCompatibility.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u001a\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u001c\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0002J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005J$\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005J\u001e\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u0002J\u001e\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/weapon/WeaponJsonCompatibility;", "", "()V", "editableIntKeys", "", "", "editableKeys", "editableNumberKeys", "copyEditableValues", "", TypedValues.AttributesType.S_TARGET, "Lorg/json/JSONObject;", "source", "extractOverrides", "weaponJson", "stockJson", "isCompatible", "", "candidateJson", "jsonEquals", "first", "second", "firstJson", "secondJson", "migrate", "overridesJson", "parseOverrides", "", "json", "parseWeaponArray", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class WeaponJsonCompatibility {
    public static final WeaponJsonCompatibility INSTANCE = new WeaponJsonCompatibility();
    private static final Set<String> editableNumberKeys = SetsKt__SetsKt.setOf((Object[]) new String[]{"accuracy", "moveSpeed", "range", "firingRate", InAppViewConstants.RADIUS, "projectileSpeed", "speed", "lifespan", "spread"});
    private static final Set<String> editableIntKeys = SetsKt__SetsKt.setOf((Object[]) new String[]{"animBreakout", "flags"});
    private static final Set<String> editableKeys = SetsKt___SetsKt.plus((Set) editableNumberKeys, (Iterable) editableIntKeys);

    private WeaponJsonCompatibility() {
    }

    public static /* synthetic */ String migrate$default(WeaponJsonCompatibility weaponJsonCompatibility, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return weaponJsonCompatibility.migrate(str, str2, str3);
    }

    public final String migrate(String stockJson, String candidateJson, String overridesJson) throws JSONException {
        Intrinsics.checkNotNullParameter(stockJson, "stockJson");
        JSONObject stockRoot = new JSONObject(stockJson);
        JSONArray stockWeapons = stockRoot.getJSONArray("weapons");
        Map<String, JSONObject> weaponArray = parseWeaponArray(candidateJson);
        Map<String, JSONObject> overrides = parseOverrides(overridesJson);
        JSONArray migratedWeapons = new JSONArray();
        int length = stockWeapons.length();
        for (int index = 0; index < length; index++) {
            JSONObject stockWeapon = stockWeapons.getJSONObject(index);
            String uniqueName = stockWeapon.getString("uniqueName");
            JSONObject migratedWeapon = new JSONObject(stockWeapon.toString());
            copyEditableValues(migratedWeapon, weaponArray.get(uniqueName));
            copyEditableValues(migratedWeapon, overrides.get(uniqueName));
            migratedWeapons.put(migratedWeapon);
        }
        String string = new JSONObject(stockRoot.toString()).put("weapons", migratedWeapons).toString(2);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String extractOverrides$default(WeaponJsonCompatibility weaponJsonCompatibility, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return weaponJsonCompatibility.extractOverrides(str, str2);
    }

    public final String extractOverrides(String weaponJson, String stockJson) throws JSONException {
        String str = stockJson;
        Intrinsics.checkNotNullParameter(weaponJson, "weaponJson");
        JSONObject root = new JSONObject(weaponJson);
        JSONArray weapons = root.getJSONArray("weapons");
        Map<String, JSONObject> weaponArray = parseWeaponArray(str);
        JSONObject jSONObject = new JSONObject();
        JSONObject resultWeapons = new JSONObject();
        int index = 0;
        int length = weapons.length();
        while (index < length) {
            JSONObject weapon = weapons.getJSONObject(index);
            String uniqueName = weapon.optString("uniqueName");
            Intrinsics.checkNotNull(uniqueName);
            if (!(uniqueName.length() == 0)) {
                JSONObject values = new JSONObject();
                Iterable $this$forEach$iv = editableKeys;
                for (Object element$iv : $this$forEach$iv) {
                    String key = (String) element$iv;
                    Object value = weapon.opt(key);
                    JSONObject jSONObject2 = weaponArray.get(uniqueName);
                    Object stockValue = jSONObject2 != null ? jSONObject2.opt(key) : null;
                    boolean differsFromStock = str == null || !INSTANCE.jsonEquals(value, stockValue);
                    if (value instanceof Number) {
                        double dDoubleValue = ((Number) value).doubleValue();
                        if (((Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) ? false : true) && differsFromStock) {
                            values.put(key, value);
                        }
                    }
                    str = stockJson;
                }
                if (values.length() > 0) {
                    resultWeapons.put(uniqueName, values);
                }
            }
            index++;
            str = stockJson;
        }
        jSONObject.put("weapons", resultWeapons);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final boolean isCompatible(String stockJson, String candidateJson) {
        Intrinsics.checkNotNullParameter(stockJson, "stockJson");
        Intrinsics.checkNotNullParameter(candidateJson, "candidateJson");
        try {
            return jsonEquals(new JSONObject(candidateJson), new JSONObject(migrate$default(this, stockJson, candidateJson, null, 4, null)));
        } catch (Exception e) {
            return false;
        }
    }

    public final boolean jsonEquals(String firstJson, String secondJson) {
        Intrinsics.checkNotNullParameter(firstJson, "firstJson");
        Intrinsics.checkNotNullParameter(secondJson, "secondJson");
        try {
            return jsonEquals(new JSONObject(firstJson), new JSONObject(secondJson));
        } catch (Exception e) {
            return false;
        }
    }

    private final Map<String, JSONObject> parseWeaponArray(String json) {
        String str = json;
        if (str == null || StringsKt__StringsKt.isBlank(str)) {
            return MapsKt__MapsKt.emptyMap();
        }
        try {
            JSONArray weapons = new JSONObject(json).getJSONArray("weapons");
            Map $this$parseWeaponArray_u24lambda_u241 = MapsKt__MapsJVMKt.createMapBuilder();
            int length = weapons.length();
            for (int index = 0; index < length; index++) {
                JSONObject weapon = weapons.optJSONObject(index);
                if (weapon != null) {
                    Intrinsics.checkNotNull(weapon);
                    String uniqueName = weapon.optString("uniqueName");
                    Intrinsics.checkNotNull(uniqueName);
                    if (uniqueName.length() > 0) {
                        $this$parseWeaponArray_u24lambda_u241.put(uniqueName, weapon);
                    }
                }
            }
            return MapsKt__MapsJVMKt.build($this$parseWeaponArray_u24lambda_u241);
        } catch (Exception e) {
            return MapsKt__MapsKt.emptyMap();
        }
    }

    private final Map<String, JSONObject> parseOverrides(String json) {
        String str = json;
        if (str == null || StringsKt__StringsKt.isBlank(str)) {
            return MapsKt__MapsKt.emptyMap();
        }
        try {
            JSONObject weapons = new JSONObject(json).getJSONObject("weapons");
            Map $this$parseOverrides_u24lambda_u243 = MapsKt__MapsJVMKt.createMapBuilder();
            Iterator<String> itKeys = weapons.keys();
            while (itKeys.hasNext()) {
                String uniqueName = itKeys.next();
                JSONObject it = weapons.optJSONObject(uniqueName);
                if (it != null) {
                    Intrinsics.checkNotNull(it);
                    Intrinsics.checkNotNull(uniqueName);
                }
            }
            return MapsKt__MapsJVMKt.build($this$parseOverrides_u24lambda_u243);
        } catch (Exception e) {
            return MapsKt__MapsKt.emptyMap();
        }
    }

    private final void copyEditableValues(JSONObject target, JSONObject source) throws JSONException {
        if (source == null) {
            return;
        }
        Iterable $this$forEach$iv = editableNumberKeys;
        Iterator it = $this$forEach$iv.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object element$iv = it.next();
            String targetKey = (String) element$iv;
            if (target.has(targetKey)) {
                Object value = source.opt(targetKey);
                if (value instanceof Number) {
                    double dDoubleValue = ((Number) value).doubleValue();
                    if ((Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) ? false : true) {
                        target.put(targetKey, ((Number) value).doubleValue());
                    }
                }
            }
        }
        Iterable $this$forEach$iv2 = editableIntKeys;
        for (Object element$iv2 : $this$forEach$iv2) {
            String key = (String) element$iv2;
            if (target.has(key)) {
                Object value2 = source.opt(key);
                if (value2 instanceof Number) {
                    double dDoubleValue2 = ((Number) value2).doubleValue();
                    if ((Double.isInfinite(dDoubleValue2) || Double.isNaN(dDoubleValue2)) ? false : true) {
                        target.put(key, ((Number) value2).intValue());
                    }
                }
            }
        }
    }

    private final boolean jsonEquals(Object first, Object second) {
        boolean z;
        boolean z2;
        if (first == JSONObject.NULL || second == JSONObject.NULL) {
            return first == JSONObject.NULL && second == JSONObject.NULL;
        }
        if ((first instanceof JSONObject) && (second instanceof JSONObject)) {
            Iterator<String> itKeys = ((JSONObject) first).keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
            Iterable firstKeys = SequencesKt___SequencesKt.toSet(SequencesKt__SequencesKt.asSequence(itKeys));
            Iterator<String> itKeys2 = ((JSONObject) second).keys();
            Intrinsics.checkNotNullExpressionValue(itKeys2, "keys(...)");
            Set secondKeys = SequencesKt___SequencesKt.toSet(SequencesKt__SequencesKt.asSequence(itKeys2));
            if (!Intrinsics.areEqual(firstKeys, secondKeys)) {
                return false;
            }
            Iterable<String> $this$all$iv = firstKeys;
            if (($this$all$iv instanceof Collection) && ((Collection) $this$all$iv).isEmpty()) {
                z2 = true;
            } else {
                for (String key : $this$all$iv) {
                    if (!INSTANCE.jsonEquals(((JSONObject) first).opt(key), ((JSONObject) second).opt(key))) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            return z2;
        }
        if ((first instanceof JSONArray) && (second instanceof JSONArray)) {
            if (((JSONArray) first).length() != ((JSONArray) second).length()) {
                return false;
            }
            Iterable $this$all$iv2 = RangesKt___RangesKt.until(0, ((JSONArray) first).length());
            if (($this$all$iv2 instanceof Collection) && ((Collection) $this$all$iv2).isEmpty()) {
                z = true;
            } else {
                Iterator it = $this$all$iv2.iterator();
                while (it.hasNext()) {
                    int element$iv = ((IntIterator) it).nextInt();
                    if (!INSTANCE.jsonEquals(((JSONArray) first).opt(element$iv), ((JSONArray) second).opt(element$iv))) {
                        z = false;
                    }
                }
                z = true;
            }
            return z;
        }
        if ((first instanceof Number) && (second instanceof Number)) {
            return ((Number) first).doubleValue() == ((Number) second).doubleValue();
        }
        return Intrinsics.areEqual(first, second);
    }
}
