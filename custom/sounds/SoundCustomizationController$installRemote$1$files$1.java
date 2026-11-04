package com.blackhub.bronline.neizzir.fragments.custom.sounds;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.FilesKt;
import kotlin.p040io.FilesKt__UtilsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: SoundCustomizationController.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, m4416d2 = {"<anonymous>", "", "", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$installRemote$1$files$1", m4426f = "SoundCustomizationController.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class SoundCustomizationController$installRemote$1$files$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends File>>, Object> {
    final /* synthetic */ File $folder;
    final /* synthetic */ SoundCategory $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SoundCustomizationController$installRemote$1$files$1(SoundCategory soundCategory, File file, Continuation<? super SoundCustomizationController$installRemote$1$files$1> continuation) {
        super(2, continuation);
        this.$value = soundCategory;
        this.$folder = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SoundCustomizationController$installRemote$1$files$1(this.$value, this.$folder, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends File>> continuation) {
        return ((SoundCustomizationController$installRemote$1$files$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SoundCustomizationController$installRemote$1$files$1 soundCustomizationController$installRemote$1$files$1;
        Object $result;
        File file;
        SoundCategory soundCategory;
        Pair pairM4423to;
        File it;
        Object $result2;
        File file2;
        SoundCategory soundCategory2;
        boolean z;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                SoundCustomizationController$installRemote$1$files$1 soundCustomizationController$installRemote$1$files$2 = this;
                Object $result3 = obj;
                Iterable $this$forEach$iv$iv$iv = soundCustomizationController$installRemote$1$files$2.$value.getSlots();
                File file3 = soundCustomizationController$installRemote$1$files$2.$folder;
                SoundCategory soundCategory3 = soundCustomizationController$installRemote$1$files$2.$value;
                Collection destination$iv$iv = new ArrayList();
                for (Object element$iv$iv : $this$forEach$iv$iv$iv) {
                    String slot = (String) element$iv$iv;
                    File[] fileArrListFiles = file3.listFiles();
                    if (fileArrListFiles != null) {
                        Collection destination$iv$iv2 = new ArrayList();
                        int length = fileArrListFiles.length;
                        soundCustomizationController$installRemote$1$files$1 = soundCustomizationController$installRemote$1$files$2;
                        int i = 0;
                        while (i < length) {
                            int i2 = length;
                            File file4 = fileArrListFiles[i];
                            if (file4.isFile()) {
                                Intrinsics.checkNotNull(file4);
                                $result2 = $result3;
                                file2 = file3;
                                if (StringsKt__StringsJVMKt.equals(FilesKt.getNameWithoutExtension(file4), slot, true)) {
                                    Set<String> formats = soundCategory3.getFormats();
                                    soundCategory2 = soundCategory3;
                                    String lowerCase = FilesKt__UtilsKt.getExtension(file4).toLowerCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                    z = formats.contains(lowerCase);
                                    if (z) {
                                        destination$iv$iv2.add(file4);
                                    }
                                    i++;
                                    length = i2;
                                    $result3 = $result2;
                                    file3 = file2;
                                    soundCategory3 = soundCategory2;
                                } else {
                                    soundCategory2 = soundCategory3;
                                }
                            } else {
                                $result2 = $result3;
                                file2 = file3;
                                soundCategory2 = soundCategory3;
                            }
                            if (z) {
                                destination$iv$iv2.add(file4);
                            }
                            i++;
                            length = i2;
                            $result3 = $result2;
                            file3 = file2;
                            soundCategory3 = soundCategory2;
                        }
                        $result = $result3;
                        file = file3;
                        soundCategory = soundCategory3;
                        final Comparator comparator = new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$installRemote$1$files$1$invokeSuspend$lambda$4$$inlined$compareBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                File it2 = (File) t;
                                Integer num = StringsKt__StringsJVMKt.equals(FilesKt__UtilsKt.getExtension(it2), "mp3", true) ? (Comparable) 0 : (Comparable) 1;
                                File it3 = (File) t2;
                                return ComparisonsKt__ComparisonsKt.compareValues(num, StringsKt__StringsJVMKt.equals(FilesKt__UtilsKt.getExtension(it3), "mp3", true) ? (Comparable) 0 : (Comparable) 1);
                            }
                        };
                        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith((List) destination$iv$iv2, new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$installRemote$1$files$1$invokeSuspend$lambda$4$$inlined$thenBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                int previousCompare = comparator.compare(t, t2);
                                if (previousCompare != 0) {
                                    return previousCompare;
                                }
                                File it2 = (File) t;
                                String name = it2.getName();
                                File it3 = (File) t2;
                                return ComparisonsKt__ComparisonsKt.compareValues(name, it3.getName());
                            }
                        });
                        if (listSortedWith != null && (it = (File) CollectionsKt___CollectionsKt.firstOrNull(listSortedWith)) != null) {
                            pairM4423to = TuplesKt.m4423to(slot, it);
                        }
                        if (pairM4423to != null) {
                            destination$iv$iv.add(pairM4423to);
                        }
                        soundCustomizationController$installRemote$1$files$2 = soundCustomizationController$installRemote$1$files$1;
                        $result3 = $result;
                        file3 = file;
                        soundCategory3 = soundCategory;
                    } else {
                        soundCustomizationController$installRemote$1$files$1 = soundCustomizationController$installRemote$1$files$2;
                        $result = $result3;
                        file = file3;
                        soundCategory = soundCategory3;
                    }
                    pairM4423to = null;
                    if (pairM4423to != null) {
                        destination$iv$iv.add(pairM4423to);
                    }
                    soundCustomizationController$installRemote$1$files$2 = soundCustomizationController$installRemote$1$files$1;
                    $result3 = $result;
                    file3 = file;
                    soundCategory3 = soundCategory;
                }
                return MapsKt__MapsKt.toMap((List) destination$iv$iv);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
