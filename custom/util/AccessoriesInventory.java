package com.blackhub.bronline.neizzir.fragments.custom.util;

import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: AccessoriesInventory.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0004J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\u0004¨\u0006\r"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/util/AccessoriesInventory;", "", "()V", "normalize", "", "value", "parse", "", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/AccessoryInventoryItem;", "json", FirebaseAnalytics.Event.SEARCH, FirebaseAnalytics.Param.ITEMS, SearchIntents.EXTRA_QUERY, "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class AccessoriesInventory {
    public static final AccessoriesInventory INSTANCE = new AccessoriesInventory();

    private AccessoriesInventory() {
    }

    public final List<AccessoryInventoryItem> parse(String json) throws JSONException {
        JSONArray array;
        Object root;
        JSONArray array2;
        Iterable $this$mapNotNull$iv;
        int $i$f$mapNotNull;
        Iterable $this$mapNotNullTo$iv$iv;
        int $i$f$mapNotNullTo;
        Iterable $this$forEach$iv$iv$iv;
        Intrinsics.checkNotNullParameter(json, "json");
        if (StringsKt__StringsKt.isBlank(json)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Object root2 = new JSONTokener(json).nextValue();
        if (root2 instanceof JSONArray) {
            Intrinsics.checkNotNull(root2);
            array = (JSONArray) root2;
        } else if (root2 instanceof JSONObject) {
            array = ((JSONObject) root2).optJSONArray(FirebaseAnalytics.Param.ITEMS);
            if (array == null && (array = ((JSONObject) root2).optJSONArray("accessories")) == null) {
                array = ((JSONObject) root2).optJSONArray("inventory");
            }
            if (array == null) {
                array = new JSONArray();
            }
        } else {
            array = new JSONArray();
        }
        int length = array.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            int index = i;
            arrayList.add(array.optJSONObject(index));
        }
        Iterable $this$mapNotNull$iv2 = arrayList;
        int $i$f$mapNotNull2 = 0;
        Collection destination$iv$iv = new ArrayList();
        Iterable $this$mapNotNullTo$iv$iv2 = $this$mapNotNull$iv2;
        int $i$f$mapNotNullTo2 = 0;
        Iterable $this$forEach$iv$iv$iv2 = $this$mapNotNullTo$iv$iv2;
        for (Object element$iv$iv$iv : $this$forEach$iv$iv$iv2) {
            JSONObject obj = (JSONObject) element$iv$iv$iv;
            AccessoryInventoryItem accessoryInventoryItem = null;
            if (obj == null) {
                root = root2;
                array2 = array;
                $this$mapNotNull$iv = $this$mapNotNull$iv2;
                $i$f$mapNotNull = $i$f$mapNotNull2;
                $this$mapNotNullTo$iv$iv = $this$mapNotNullTo$iv$iv2;
                $i$f$mapNotNullTo = $i$f$mapNotNullTo2;
                $this$forEach$iv$iv$iv = $this$forEach$iv$iv$iv2;
            } else {
                root = root2;
                int id = obj.optInt("id", -1);
                array2 = array;
                String strOptString = obj.optString("name", "");
                $this$mapNotNull$iv = $this$mapNotNull$iv2;
                Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                String name = StringsKt__StringsKt.trim((CharSequence) strOptString).toString();
                $i$f$mapNotNull = $i$f$mapNotNull2;
                $this$mapNotNullTo$iv$iv = $this$mapNotNullTo$iv$iv2;
                int modelId = obj.optInt("modelid", obj.optInt("modelId", -1));
                String strOptString2 = obj.optString(CommonUrlParts.MODEL, "");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                String model = StringsKt__StringsKt.trim((CharSequence) strOptString2).toString();
                $i$f$mapNotNullTo = $i$f$mapNotNullTo2;
                String strOptString3 = obj.optString("desc", "");
                Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
                String desc = StringsKt__StringsKt.trim((CharSequence) strOptString3).toString();
                $this$forEach$iv$iv$iv = $this$forEach$iv$iv$iv2;
                long price = obj.optLong("accessoryPrice", obj.optLong("price", 0L));
                if (id >= 0 && !StringsKt__StringsKt.isBlank(name) && !StringsKt__StringsKt.isBlank(model)) {
                    accessoryInventoryItem = new AccessoryInventoryItem(id, name, modelId, model, desc, price);
                }
            }
            if (accessoryInventoryItem != null) {
                destination$iv$iv.add(accessoryInventoryItem);
            }
            root2 = root;
            array = array2;
            $this$mapNotNull$iv2 = $this$mapNotNull$iv;
            $i$f$mapNotNull2 = $i$f$mapNotNull;
            $this$mapNotNullTo$iv$iv2 = $this$mapNotNullTo$iv$iv;
            $i$f$mapNotNullTo2 = $i$f$mapNotNullTo;
            $this$forEach$iv$iv$iv2 = $this$forEach$iv$iv$iv;
        }
        Iterable $this$sortedBy$iv = (List) destination$iv$iv;
        return CollectionsKt___CollectionsKt.sortedWith($this$sortedBy$iv, new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.AccessoriesInventory$parse$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                AccessoryInventoryItem it = (AccessoryInventoryItem) t;
                AccessoryInventoryItem it2 = (AccessoryInventoryItem) t2;
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(it.getId()), Integer.valueOf(it2.getId()));
            }
        });
    }

    public final List<AccessoryInventoryItem> search(List<AccessoryInventoryItem> items, String query) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(query, "query");
        List<AccessoryInventoryItem> $this$sortedBy$iv = items;
        List<AccessoryInventoryItem> listSortedWith = CollectionsKt___CollectionsKt.sortedWith($this$sortedBy$iv, new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.AccessoriesInventory$search$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                AccessoryInventoryItem it = (AccessoryInventoryItem) t;
                AccessoryInventoryItem it2 = (AccessoryInventoryItem) t2;
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(it.getId()), Integer.valueOf(it2.getId()));
            }
        });
        String normalizedQuery = normalize(query);
        if (StringsKt__StringsKt.isBlank(normalizedQuery)) {
            return listSortedWith;
        }
        List<AccessoryInventoryItem> $this$filter$iv = listSortedWith;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            AccessoryInventoryItem item = (AccessoryInventoryItem) element$iv$iv;
            List<AccessoryInventoryItem> list = listSortedWith;
            if (StringsKt__StringsKt.contains$default((CharSequence) INSTANCE.normalize(item.getName()), (CharSequence) normalizedQuery, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) String.valueOf(item.getId()), (CharSequence) normalizedQuery, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) String.valueOf(item.getModelId()), (CharSequence) normalizedQuery, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) INSTANCE.normalize(item.getModel()), (CharSequence) normalizedQuery, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) String.valueOf(item.getAccessoryPrice()), (CharSequence) normalizedQuery, false, 2, (Object) null)) {
                destination$iv$iv.add(element$iv$iv);
            }
            listSortedWith = list;
        }
        return (List) destination$iv$iv;
    }

    private final String normalize(String value) {
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = value.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt__StringsKt.trim((CharSequence) new Regex("\\s+").replace(lowerCase, ServerSentEventKt.SPACE)).toString();
    }
}
