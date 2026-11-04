package com.blackhub.bronline.neizzir.fragments.sborks.util;

import com.blackhub.bronline.neizzir.fragments.sborks.model.FolderData;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SborksNewestSupport.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\rJz\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042$\u0010\u0014\u001a \b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015H\u0086@¢\u0006\u0002\u0010\u0017JF\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r¨\u0006\u001a"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/util/SborksNewestSupport;", "", "()V", "compareNewest", "", "a", "Lcom/blackhub/bronline/neizzir/fragments/sborks/model/FolderData;", "b", "createdDatesCache", "", "", "Ljava/util/Date;", "parseDate", "Lkotlin/Function1;", "loadMissingCreatedDates", "folders", "", "existingDates", "chunkSize", "parallelism", "fetchDate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Ljava/util/List;Ljava/util/Map;IILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sortByNewest", "list", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class SborksNewestSupport {
    public static final SborksNewestSupport INSTANCE = new SborksNewestSupport();

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.util.SborksNewestSupport$loadMissingCreatedDates$1 */
    /* JADX INFO: compiled from: SborksNewestSupport.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.util.SborksNewestSupport", m4426f = "SborksNewestSupport.kt", m4427i = {0, 0, 0}, m4428l = {64}, m4429m = "loadMissingCreatedDates", m4430n = {"fetchDate", "semaphore", "loadedDates"}, m4431s = {"L$0", "L$1", "L$2"})
    static final class C55861 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C55861(Continuation<? super C55861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SborksNewestSupport.this.loadMissingCreatedDates(null, null, 0, 0, null, this);
        }
    }

    private SborksNewestSupport() {
    }

    public final List<FolderData> sortByNewest(List<FolderData> list, final Map<String, ? extends Date> createdDatesCache, final Function1<? super String, ? extends Date> parseDate) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(createdDatesCache, "createdDatesCache");
        Intrinsics.checkNotNullParameter(parseDate, "parseDate");
        return CollectionsKt___CollectionsKt.sortedWith(list, new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.util.SborksNewestSupport$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SborksNewestSupport.sortByNewest$lambda$0(createdDatesCache, parseDate, (FolderData) obj, (FolderData) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByNewest$lambda$0(Map createdDatesCache, Function1 parseDate, FolderData a2, FolderData b) {
        Intrinsics.checkNotNullParameter(createdDatesCache, "$createdDatesCache");
        Intrinsics.checkNotNullParameter(parseDate, "$parseDate");
        SborksNewestSupport sborksNewestSupport = INSTANCE;
        Intrinsics.checkNotNull(a2);
        Intrinsics.checkNotNull(b);
        return sborksNewestSupport.compareNewest(a2, b, createdDatesCache, parseDate);
    }

    public final int compareNewest(FolderData a2, FolderData b, Map<String, ? extends Date> createdDatesCache, Function1<? super String, ? extends Date> parseDate) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(createdDatesCache, "createdDatesCache");
        Intrinsics.checkNotNullParameter(parseDate, "parseDate");
        Date dateA = createdDatesCache.get(a2.getFolderName());
        Date dateB = createdDatesCache.get(b.getFolderName());
        if (dateA != null && dateB != null) {
            return dateB.compareTo(dateA);
        }
        if (dateA != null) {
            return -1;
        }
        if (dateB != null) {
            return 1;
        }
        Date updateDateA = parseDate.invoke(a2.getUpdateDate());
        Date updateDateB = parseDate.invoke(b.getUpdateDate());
        if (updateDateA != null && updateDateB != null) {
            return updateDateB.compareTo(updateDateA);
        }
        if (updateDateA != null) {
            return -1;
        }
        if (updateDateB != null) {
            return 1;
        }
        return 0;
    }

    public static /* synthetic */ Object loadMissingCreatedDates$default(SborksNewestSupport sborksNewestSupport, List list, Map map, int i, int i2, Function2 function2, Continuation continuation, int i3, Object obj) {
        int i4;
        int i5;
        if ((i3 & 4) == 0) {
            i4 = i;
        } else {
            i4 = 10;
        }
        if ((i3 & 8) == 0) {
            i5 = i2;
        } else {
            i5 = 5;
        }
        return sborksNewestSupport.loadMissingCreatedDates(list, map, i4, i5, function2, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa A[LOOP:0: B:33:0x00f4->B:35:0x00fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00e4 -> B:32:0x00eb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object loadMissingCreatedDates(java.util.List<com.blackhub.bronline.neizzir.fragments.sborks.model.FolderData> r20, java.util.Map<java.lang.String, ? extends java.util.Date> r21, int r22, int r23, kotlin.jvm.functions.Function2<? super com.blackhub.bronline.neizzir.fragments.sborks.model.FolderData, ? super kotlin.coroutines.Continuation<? super java.util.Date>, ? extends java.lang.Object> r24, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.util.Date>> r25) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.sborks.util.SborksNewestSupport.loadMissingCreatedDates(java.util.List, java.util.Map, int, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
