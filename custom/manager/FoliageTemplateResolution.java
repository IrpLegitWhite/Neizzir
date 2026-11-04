package com.blackhub.bronline.neizzir.fragments.custom.manager;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FoliageManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BU\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\u0010\nJ\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001b\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0003HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003Ja\u0010\u0015\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageTemplateResolution;", "", "resolved", "", "", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/FoliageTemplateCandidate;", "duplicates", "", "fallbackAssignments", "missing", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "getDuplicates", "()Ljava/util/Map;", "getFallbackAssignments", "getMissing", "()Ljava/util/List;", "getResolved", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class FoliageTemplateResolution {
    private final Map<String, List<FoliageTemplateCandidate>> duplicates;
    private final Map<String, FoliageTemplateCandidate> fallbackAssignments;
    private final List<String> missing;
    private final Map<String, FoliageTemplateCandidate> resolved;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FoliageTemplateResolution copy$default(FoliageTemplateResolution foliageTemplateResolution, Map map, Map map2, Map map3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            map = foliageTemplateResolution.resolved;
        }
        if ((i & 2) != 0) {
            map2 = foliageTemplateResolution.duplicates;
        }
        if ((i & 4) != 0) {
            map3 = foliageTemplateResolution.fallbackAssignments;
        }
        if ((i & 8) != 0) {
            list = foliageTemplateResolution.missing;
        }
        return foliageTemplateResolution.copy(map, map2, map3, list);
    }

    public final Map<String, FoliageTemplateCandidate> component1() {
        return this.resolved;
    }

    public final Map<String, List<FoliageTemplateCandidate>> component2() {
        return this.duplicates;
    }

    public final Map<String, FoliageTemplateCandidate> component3() {
        return this.fallbackAssignments;
    }

    public final List<String> component4() {
        return this.missing;
    }

    public final FoliageTemplateResolution copy(Map<String, FoliageTemplateCandidate> resolved, Map<String, ? extends List<FoliageTemplateCandidate>> duplicates, Map<String, FoliageTemplateCandidate> fallbackAssignments, List<String> missing) {
        Intrinsics.checkNotNullParameter(resolved, "resolved");
        Intrinsics.checkNotNullParameter(duplicates, "duplicates");
        Intrinsics.checkNotNullParameter(fallbackAssignments, "fallbackAssignments");
        Intrinsics.checkNotNullParameter(missing, "missing");
        return new FoliageTemplateResolution(resolved, duplicates, fallbackAssignments, missing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FoliageTemplateResolution)) {
            return false;
        }
        FoliageTemplateResolution foliageTemplateResolution = (FoliageTemplateResolution) other;
        return Intrinsics.areEqual(this.resolved, foliageTemplateResolution.resolved) && Intrinsics.areEqual(this.duplicates, foliageTemplateResolution.duplicates) && Intrinsics.areEqual(this.fallbackAssignments, foliageTemplateResolution.fallbackAssignments) && Intrinsics.areEqual(this.missing, foliageTemplateResolution.missing);
    }

    public int hashCode() {
        return (((((this.resolved.hashCode() * 31) + this.duplicates.hashCode()) * 31) + this.fallbackAssignments.hashCode()) * 31) + this.missing.hashCode();
    }

    public String toString() {
        return "FoliageTemplateResolution(resolved=" + this.resolved + ", duplicates=" + this.duplicates + ", fallbackAssignments=" + this.fallbackAssignments + ", missing=" + this.missing + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FoliageTemplateResolution(Map<String, FoliageTemplateCandidate> resolved, Map<String, ? extends List<FoliageTemplateCandidate>> duplicates, Map<String, FoliageTemplateCandidate> fallbackAssignments, List<String> missing) {
        Intrinsics.checkNotNullParameter(resolved, "resolved");
        Intrinsics.checkNotNullParameter(duplicates, "duplicates");
        Intrinsics.checkNotNullParameter(fallbackAssignments, "fallbackAssignments");
        Intrinsics.checkNotNullParameter(missing, "missing");
        this.resolved = resolved;
        this.duplicates = duplicates;
        this.fallbackAssignments = fallbackAssignments;
        this.missing = missing;
    }

    public final Map<String, FoliageTemplateCandidate> getResolved() {
        return this.resolved;
    }

    public final Map<String, List<FoliageTemplateCandidate>> getDuplicates() {
        return this.duplicates;
    }

    public final Map<String, FoliageTemplateCandidate> getFallbackAssignments() {
        return this.fallbackAssignments;
    }

    public final List<String> getMissing() {
        return this.missing;
    }
}
