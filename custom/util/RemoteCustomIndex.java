package com.blackhub.bronline.neizzir.fragments.custom.util;

import com.helpshift.HelpshiftEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.p043io.files.FileSystemKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: RemoteCustomModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0010\u001a\u00020\u0005J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0012\u001a\u00020\u0007J\u0016\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002J \u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002J \u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002¨\u0006\u0018"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomIndex;", "", "()V", "buildItems", "", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomItem;", "remotePath", "", "files", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomFile;", "extension", "path", HelpshiftEvent.DATA_FILE_NAME, "fileNameWithoutExtension", "fileUrl", "imagePaths", "item", "parseFiles", "json", "relativePath", "remotePrefix", "selectInstallFiles", "selectLogoPath", "selectPreviewPath", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class RemoteCustomIndex {
    public static final RemoteCustomIndex INSTANCE = new RemoteCustomIndex();

    private RemoteCustomIndex() {
    }

    public final List<RemoteCustomFile> parseFiles(String json) throws JSONException {
        RemoteCustomFile remoteCustomFile;
        Intrinsics.checkNotNullParameter(json, "json");
        JSONArray arr = new JSONObject(json).getJSONArray("files");
        int length = arr.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            int i2 = i;
            Object item = arr.get(i2);
            if (item instanceof String) {
                remoteCustomFile = new RemoteCustomFile((String) item, null, 0L, 6, null);
            } else if (item instanceof JSONObject) {
                String string = ((JSONObject) item).getString("path");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String strOptString = ((JSONObject) item).optString("sha1", "");
                Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                remoteCustomFile = new RemoteCustomFile(string, strOptString, ((JSONObject) item).optLong("size", -1L));
            } else {
                remoteCustomFile = new RemoteCustomFile(item.toString(), null, 0L, 6, null);
            }
            arrayList.add(remoteCustomFile);
        }
        return arrayList;
    }

    public final List<RemoteCustomItem> buildItems(String remotePath, List<RemoteCustomFile> files) {
        Map $this$map$iv;
        Object element$iv;
        Object element$iv2;
        Object answer$iv$iv$iv;
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        Intrinsics.checkNotNullParameter(files, "files");
        String normalized = StringsKt__StringsKt.trim(remotePath, FileSystemKt.UnixPathSeparator);
        String prefix = normalized + FileSystemKt.UnixPathSeparator;
        List<RemoteCustomFile> $this$filter$iv = files;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            RemoteCustomFile it = (RemoteCustomFile) element$iv$iv;
            if (StringsKt__StringsJVMKt.startsWith$default(it.getPath(), prefix, false, 2, null)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        Iterable $this$groupBy$iv = (List) destination$iv$iv;
        Map destination$iv$iv2 = new LinkedHashMap();
        for (Object element$iv$iv2 : $this$groupBy$iv) {
            RemoteCustomFile file = (RemoteCustomFile) element$iv$iv2;
            String strSubstringBefore = StringsKt.substringBefore(StringsKt__StringsKt.removePrefix(file.getPath(), (CharSequence) prefix), FileSystemKt.UnixPathSeparator, "");
            Object value$iv$iv$iv = destination$iv$iv2.get(strSubstringBefore);
            if (value$iv$iv$iv == null) {
                answer$iv$iv$iv = new ArrayList();
                destination$iv$iv2.put(strSubstringBefore, answer$iv$iv$iv);
            } else {
                answer$iv$iv$iv = value$iv$iv$iv;
            }
            List list$iv$iv = (List) answer$iv$iv$iv;
            list$iv$iv.add(element$iv$iv2);
        }
        LinkedHashMap result$iv = new LinkedHashMap();
        for (Map.Entry entry$iv : destination$iv$iv2.entrySet()) {
            String it2 = (String) entry$iv.getKey();
            if (!StringsKt__StringsKt.isBlank(it2)) {
                result$iv.put(entry$iv.getKey(), entry$iv.getValue());
            }
        }
        LinkedHashMap $this$map$iv2 = result$iv;
        Collection destination$iv$iv3 = new ArrayList($this$map$iv2.size());
        for (Map.Entry item$iv$iv : $this$map$iv2.entrySet()) {
            String id = (String) item$iv$iv.getKey();
            Iterable itemFiles = (List) item$iv$iv.getValue();
            Iterable $this$sortedBy$iv = itemFiles;
            List<RemoteCustomFile> $this$firstOrNull$iv = CollectionsKt___CollectionsKt.sortedWith($this$sortedBy$iv, new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomIndex$buildItems$lambda$7$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    RemoteCustomFile it3 = (RemoteCustomFile) t;
                    RemoteCustomFile it4 = (RemoteCustomFile) t2;
                    return ComparisonsKt__ComparisonsKt.compareValues(it3.getPath(), it4.getPath());
                }
            });
            String strSelectPreviewPath = INSTANCE.selectPreviewPath(normalized, $this$firstOrNull$iv);
            String strSelectLogoPath = INSTANCE.selectLogoPath(normalized, $this$firstOrNull$iv);
            Iterator it3 = $this$firstOrNull$iv.iterator();
            while (true) {
                if (it3.hasNext()) {
                    element$iv = it3.next();
                    RemoteCustomFile it4 = (RemoteCustomFile) element$iv;
                    $this$map$iv = $this$map$iv2;
                    if (StringsKt__StringsJVMKt.equals(INSTANCE.fileName(it4.getPath()), "video.mp44", true)) {
                        break;
                    }
                    $this$map$iv2 = $this$map$iv;
                } else {
                    $this$map$iv = $this$map$iv2;
                    element$iv = null;
                    break;
                }
            }
            RemoteCustomFile remoteCustomFile = (RemoteCustomFile) element$iv;
            String path = remoteCustomFile != null ? remoteCustomFile.getPath() : null;
            List<RemoteCustomFile> $this$firstOrNull$iv2 = $this$firstOrNull$iv;
            Iterator it5 = $this$firstOrNull$iv2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    element$iv2 = null;
                    break;
                }
                element$iv2 = it5.next();
                RemoteCustomFile it6 = (RemoteCustomFile) element$iv2;
                Iterable $this$firstOrNull$iv3 = $this$firstOrNull$iv2;
                if (StringsKt__StringsJVMKt.equals(INSTANCE.fileName(it6.getPath()), "info.json", true)) {
                    break;
                }
                $this$firstOrNull$iv2 = $this$firstOrNull$iv3;
            }
            RemoteCustomFile remoteCustomFile2 = (RemoteCustomFile) element$iv2;
            destination$iv$iv3.add(new RemoteCustomItem(id, normalized, $this$firstOrNull$iv, strSelectPreviewPath, strSelectLogoPath, path, remoteCustomFile2 != null ? remoteCustomFile2.getPath() : null, INSTANCE.selectInstallFiles(normalized, $this$firstOrNull$iv)));
            $this$map$iv2 = $this$map$iv;
        }
        final Comparator comparator = new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomIndex$buildItems$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                RemoteCustomItem it7 = (RemoteCustomItem) t2;
                Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(it7.getId());
                Integer num = intOrNull != null ? intOrNull : (Comparable) Integer.MIN_VALUE;
                RemoteCustomItem it8 = (RemoteCustomItem) t;
                Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(it8.getId());
                return ComparisonsKt__ComparisonsKt.compareValues(num, intOrNull2 != null ? intOrNull2 : (Comparable) Integer.MIN_VALUE);
            }
        };
        return CollectionsKt___CollectionsKt.sortedWith((List) destination$iv$iv3, new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomIndex$buildItems$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int previousCompare = comparator.compare(t, t2);
                if (previousCompare != 0) {
                    return previousCompare;
                }
                RemoteCustomItem it7 = (RemoteCustomItem) t;
                String id2 = it7.getId();
                RemoteCustomItem it8 = (RemoteCustomItem) t2;
                return ComparisonsKt__ComparisonsKt.compareValues(id2, it8.getId());
            }
        });
    }

    public final String fileUrl(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return "https://cdn.kolson.online/api/fetch_file/" + StringsKt__StringsKt.trimStart(path, FileSystemKt.UnixPathSeparator);
    }

    public final String relativePath(String remotePrefix, String path) {
        Intrinsics.checkNotNullParameter(remotePrefix, "remotePrefix");
        Intrinsics.checkNotNullParameter(path, "path");
        String it = StringsKt__StringsKt.trim(remotePrefix, FileSystemKt.UnixPathSeparator);
        String it2 = StringsKt__StringsKt.isBlank(it) ? "" : it + FileSystemKt.UnixPathSeparator;
        if ((it2.length() > 0) && StringsKt__StringsJVMKt.startsWith$default(path, it2, false, 2, null)) {
            return StringsKt__StringsKt.removePrefix(path, (CharSequence) it2);
        }
        return StringsKt__StringsKt.substringAfterLast$default(path, FileSystemKt.UnixPathSeparator, (String) null, 2, (Object) null);
    }

    public final List<String> imagePaths(RemoteCustomItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Iterable $this$filter$iv = item.getFiles();
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            RemoteCustomFile it = (RemoteCustomFile) element$iv$iv;
            if (SetsKt__SetsKt.setOf((Object[]) new String[]{"png", "pngg", "jpg", "jpgg", "jpeg"}).contains(INSTANCE.extension(it.getPath()))) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        Iterable $this$map$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            RemoteCustomFile it2 = (RemoteCustomFile) item$iv$iv;
            destination$iv$iv2.add(it2.getPath());
        }
        return (List) destination$iv$iv2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    private final String selectLogoPath(String remotePath, List<RemoteCustomFile> files) {
        String expected;
        Object element$iv;
        RemoteCustomFile remoteCustomFile;
        RemoteCustomFile it;
        switch (remotePath) {
            case "models":
            case "accessories":
                expected = "logo.pngg";
                break;
            case "skins":
            case "gunpuck":
                expected = "logo.jpgg";
                break;
            case "modules":
                expected = "logo.pngg";
                break;
            default:
                expected = null;
                break;
        }
        if (expected == null) {
            return null;
        }
        String name = expected;
        List<RemoteCustomFile> $this$firstOrNull$iv = files;
        Iterator it2 = $this$firstOrNull$iv.iterator();
        do {
            if (it2.hasNext()) {
                element$iv = it2.next();
                it = (RemoteCustomFile) element$iv;
            } else {
                element$iv = null;
            }
            remoteCustomFile = (RemoteCustomFile) element$iv;
            if (remoteCustomFile != null) {
                return remoteCustomFile.getPath();
            }
            return null;
        } while (!StringsKt__StringsJVMKt.equals(INSTANCE.fileName(it.getPath()), name, true));
        remoteCustomFile = (RemoteCustomFile) element$iv;
        if (remoteCustomFile != null) {
            return remoteCustomFile.getPath();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v9 'element$iv'  java.lang.Object, still in use, count: 2, list:
          (r6v9 'element$iv' java.lang.Object) from 0x0090: PHI (r6 I:??) = (r6v6 'element$iv' java.lang.Object), (r6v9 'element$iv' java.lang.Object) binds: [B:43:0x008f, B:65:0x0090] A[DONT_GENERATE, DONT_INLINE]
          (r6v9 'element$iv' java.lang.Object A[D('element$iv' java.lang.Object)]) from 0x007b: CHECK_CAST (com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomFile) (r6v9 'element$iv' java.lang.Object A[D('element$iv' java.lang.Object)])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private final java.lang.String selectPreviewPath(java.lang.String r13, java.util.List<com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomFile> r14) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomIndex.selectPreviewPath(java.lang.String, java.util.List):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r19.equals("gunpuck") == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c7, code lost:
    
        if (r19.equals("skins") == false) goto L138;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomFile> selectInstallFiles(java.lang.String r19, java.util.List<com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomFile> r20) {
        /*
            Method dump skipped, instruction units count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomIndex.selectInstallFiles(java.lang.String, java.util.List):java.util.List");
    }

    private final String fileName(String path) {
        return StringsKt__StringsKt.substringAfterLast$default(path, FileSystemKt.UnixPathSeparator, (String) null, 2, (Object) null);
    }

    private final String fileNameWithoutExtension(String path) {
        return StringsKt__StringsKt.substringBeforeLast$default(fileName(path), '.', (String) null, 2, (Object) null);
    }

    private final String extension(String path) {
        String lowerCase = StringsKt__StringsKt.substringAfterLast(fileName(path), '.', "").toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
