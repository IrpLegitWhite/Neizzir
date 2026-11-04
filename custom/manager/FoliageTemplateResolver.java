package com.blackhub.bronline.neizzir.fragments.custom.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FoliageManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¨\u0006\f"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageTemplateResolver;", "", "()V", "resolve", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageTemplateResolution;", "requiredBaseNames", "", "", "candidates", "", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageTemplateCandidate;", "fallbackCandidate", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class FoliageTemplateResolver {
    public static final FoliageTemplateResolver INSTANCE = new FoliageTemplateResolver();

    private FoliageTemplateResolver() {
    }

    public static /* synthetic */ FoliageTemplateResolution resolve$default(FoliageTemplateResolver foliageTemplateResolver, Set set, Iterable iterable, FoliageTemplateCandidate foliageTemplateCandidate, int i, Object obj) {
        if ((i & 4) != 0) {
            foliageTemplateCandidate = null;
        }
        return foliageTemplateResolver.resolve(set, iterable, foliageTemplateCandidate);
    }

    public final FoliageTemplateResolution resolve(Set<String> requiredBaseNames, Iterable<FoliageTemplateCandidate> candidates, FoliageTemplateCandidate fallbackCandidate) {
        Object answer$iv$iv$iv;
        Intrinsics.checkNotNullParameter(requiredBaseNames, "requiredBaseNames");
        Intrinsics.checkNotNullParameter(candidates, "candidates");
        Set<String> $this$map$iv = requiredBaseNames;
        Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String p0 = (String) item$iv$iv;
            destination$iv$iv.add(FoliageManagerKt.normalizeBaseName(p0));
        }
        Iterable $this$filter$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            String it = (String) element$iv$iv;
            if (it.length() > 0) {
                destination$iv$iv2.add(element$iv$iv);
            }
        }
        SortedSet<String> normalizedRequired = CollectionsKt.toSortedSet((List) destination$iv$iv2);
        final Comparator comparator = new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageTemplateResolver$resolve$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                FoliageTemplateCandidate it2 = (FoliageTemplateCandidate) t;
                String archivePath = it2.getArchivePath();
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = archivePath.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                FoliageTemplateCandidate it3 = (FoliageTemplateCandidate) t2;
                String archivePath2 = it3.getArchivePath();
                Locale US2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase2 = archivePath2.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                return ComparisonsKt__ComparisonsKt.compareValues(lowerCase, lowerCase2);
            }
        };
        Iterable $this$mapNotNull$iv = CollectionsKt___CollectionsKt.sortedWith(candidates, new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.FoliageTemplateResolver$resolve$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int previousCompare = comparator.compare(t, t2);
                if (previousCompare != 0) {
                    return previousCompare;
                }
                FoliageTemplateCandidate it2 = (FoliageTemplateCandidate) t;
                String entryPath = it2.getEntryPath();
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = entryPath.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                FoliageTemplateCandidate it3 = (FoliageTemplateCandidate) t2;
                String entryPath2 = it3.getEntryPath();
                Locale US2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase2 = entryPath2.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                return ComparisonsKt__ComparisonsKt.compareValues(lowerCase, lowerCase2);
            }
        });
        Collection destination$iv$iv3 = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            FoliageTemplateCandidate candidate = (FoliageTemplateCandidate) element$iv$iv$iv;
            String baseName = FoliageManagerKt.foliageBaseName(candidate.getEntryPath());
            Pair pairM4423to = normalizedRequired.contains(baseName) ? TuplesKt.m4423to(baseName, candidate) : null;
            if (pairM4423to != null) {
                destination$iv$iv3.add(pairM4423to);
            }
        }
        Iterable $this$groupBy$iv = (List) destination$iv$iv3;
        Map destination$iv$iv4 = new LinkedHashMap();
        for (Object element$iv$iv2 : $this$groupBy$iv) {
            Pair it2 = (Pair) element$iv$iv2;
            String str = (String) it2.getFirst();
            Object value$iv$iv$iv = destination$iv$iv4.get(str);
            if (value$iv$iv$iv == null) {
                answer$iv$iv$iv = new ArrayList();
                destination$iv$iv4.put(str, answer$iv$iv$iv);
            } else {
                answer$iv$iv$iv = value$iv$iv$iv;
            }
            List list$iv$iv = (List) answer$iv$iv$iv;
            Pair it3 = (Pair) element$iv$iv2;
            list$iv$iv.add((FoliageTemplateCandidate) it3.getSecond());
        }
        LinkedHashMap exactResolved = new LinkedHashMap(destination$iv$iv4.size());
        LinkedHashMap duplicates = new LinkedHashMap();
        for (String baseName2 : normalizedRequired) {
            List matches = (List) destination$iv$iv4.get(baseName2);
            if (matches == null) {
                matches = CollectionsKt__CollectionsKt.emptyList();
            }
            if (!matches.isEmpty()) {
                Intrinsics.checkNotNull(baseName2);
                exactResolved.put(baseName2, CollectionsKt___CollectionsKt.first(matches));
            }
            if (matches.size() > 1) {
                Intrinsics.checkNotNull(baseName2);
                duplicates.put(baseName2, matches);
            }
        }
        LinkedHashMap resolved = new LinkedHashMap(normalizedRequired.size());
        LinkedHashMap fallbackAssignments = new LinkedHashMap();
        ArrayList missing = new ArrayList();
        for (String baseName3 : normalizedRequired) {
            FoliageTemplateCandidate exact = (FoliageTemplateCandidate) exactResolved.get(baseName3);
            if (exact != null) {
                Intrinsics.checkNotNull(baseName3);
                resolved.put(baseName3, exact);
            } else if (fallbackCandidate != null) {
                Intrinsics.checkNotNull(baseName3);
                resolved.put(baseName3, fallbackCandidate);
                fallbackAssignments.put(baseName3, fallbackCandidate);
            } else {
                missing.add(baseName3);
            }
        }
        return new FoliageTemplateResolution(resolved, duplicates, fallbackAssignments, missing);
    }
}
