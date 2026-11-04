package com.blackhub.bronline.neizzir.fragments.custom.sounds;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import coil.disk.DiskLruCache;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.ByteStreamsKt;
import kotlin.p040io.CloseableKt;
import kotlin.p040io.FilesKt;
import kotlin.p040io.FilesKt__UtilsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.p043io.files.FileSystemKt;

/* JADX INFO: compiled from: SoundInstaller.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016J\u0006\u0010\u0018\u001a\u00020\u0007J\b\u0010\u0019\u001a\u00020\u0007H\u0002J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0017H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u001d"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundInstaller;", "", "root", "Ljava/io/File;", "afterWrite", "Lkotlin/Function1;", "", "", "(Ljava/io/File;Lkotlin/jvm/functions/Function1;)V", "garbage", "getGarbage", "()Ljava/io/File;", "transaction", "getTransaction", "copySynced", "source", TypedValues.AttributesType.S_TARGET, "install", "", "category", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCategory;", "sources", "", "", "recover", "recoverLocked", "safeTarget", "relative", "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class SoundInstaller {
    private static final Object lock = new Object();
    private final Function1<Integer, Unit> afterWrite;
    private final File root;

    /* JADX WARN: Multi-variable type inference failed */
    public SoundInstaller(File root, Function1<? super Integer, Unit> afterWrite) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(afterWrite, "afterWrite");
        this.root = root;
        this.afterWrite = afterWrite;
    }

    public /* synthetic */ SoundInstaller(File file, C54051 c54051, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundInstaller.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int it) {
            }
        } : c54051);
    }

    private final File getTransaction() {
        return new File(this.root, ".sound-install");
    }

    private final File getGarbage() {
        return new File(this.root, ".sound-install-finished");
    }

    public final void recover() {
        synchronized (lock) {
            recoverLocked();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x019c A[Catch: Exception -> 0x0493, all -> 0x04cb, TryCatch #3 {, blocks: (B:5:0x0015, B:7:0x001e, B:9:0x0029, B:23:0x005a, B:24:0x0065, B:26:0x006b, B:28:0x0079, B:30:0x0083, B:36:0x00a4, B:37:0x00b1, B:38:0x00b2, B:40:0x00be, B:41:0x00ce, B:43:0x00d4, B:45:0x0133, B:47:0x0144, B:49:0x0156, B:51:0x015c, B:57:0x019c, B:59:0x01a4, B:125:0x049a, B:131:0x04aa, B:129:0x04a0, B:60:0x01ad, B:61:0x01c3, B:63:0x01c9, B:67:0x0217, B:68:0x0236, B:70:0x023c, B:72:0x0244, B:73:0x0247, B:75:0x028a, B:78:0x02ba, B:79:0x02c9, B:81:0x02cf, B:82:0x0321, B:84:0x0349, B:86:0x0368, B:87:0x0370, B:89:0x0376, B:91:0x0389, B:94:0x0390, B:95:0x039d, B:97:0x03a0, B:98:0x03ad, B:100:0x03b3, B:102:0x03bb, B:103:0x03be, B:104:0x044d, B:106:0x0461, B:110:0x046d, B:111:0x0479, B:112:0x047a, B:113:0x0487, B:119:0x048f, B:120:0x0492, B:132:0x04ab, B:133:0x04ba, B:134:0x04bb, B:135:0x04ca, B:12:0x0034, B:13:0x0038, B:15:0x003e), top: B:146:0x0015, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01a2  */
    public final boolean install(SoundCategory category, Map<String, ? extends File> sources) {
        boolean z;
        Exception e;
        boolean zDeleteRecursively;
        int i;
        Map<String, ? extends File> map;
        Map<String, ? extends File> map2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(sources, "sources");
        synchronized (lock) {
            int i2 = 0;
            recoverLocked();
            if (sources.isEmpty()) {
                z = false;
            } else {
                Iterable $this$all$iv = sources.keySet();
                if (!($this$all$iv instanceof Collection) || !((Collection) $this$all$iv).isEmpty()) {
                    Iterator it = $this$all$iv.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z5 = true;
                            break;
                        }
                        Object element$iv = it.next();
                        if (!category.getSlots().contains((String) element$iv)) {
                            z5 = false;
                            break;
                        }
                    }
                } else {
                    z5 = true;
                }
                if (z5) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                throw new IllegalArgumentException("Неизвестный слот звука".toString());
            }
            Iterable $this$forEach$iv = sources.values();
            for (Object element$iv2 : $this$forEach$iv) {
                File it2 = (File) element$iv2;
                if (!it2.isFile() || it2.length() <= 0) {
                    z4 = false;
                } else {
                    Set<String> formats = category.getFormats();
                    String lowerCase = FilesKt__UtilsKt.getExtension(it2).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (formats.contains(lowerCase)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                if (!z4) {
                    throw new IllegalArgumentException("Файл звука недоступен".toString());
                }
            }
            if (!getTransaction().mkdirs()) {
                throw new IllegalStateException("Не удалось подготовить установку".toString());
            }
            try {
                LinkedHashSet targets = new LinkedHashSet();
                Map<String, ? extends File> map3 = sources;
                for (Map.Entry<String, ? extends File> entry : map3.entrySet()) {
                    String slot = entry.getKey();
                    File source = entry.getValue();
                    StringBuilder sbAppend = new StringBuilder().append(category.getRelativeDir()).append(FileSystemKt.UnixPathSeparator).append(slot).append('.');
                    String lowerCase2 = FilesKt__UtilsKt.getExtension(source).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    targets.add(sbAppend.append(lowerCase2).toString());
                    File[] fileArrListFiles = new File(this.root, category.getRelativeDir()).listFiles();
                    if (fileArrListFiles != null) {
                        Collection destination$iv$iv = new ArrayList();
                        int length = fileArrListFiles.length;
                        int i3 = 0;
                        while (i3 < length) {
                            File it3 = fileArrListFiles[i3];
                            Intrinsics.checkNotNull(it3);
                            int i4 = length;
                            int i5 = i2;
                            try {
                                if (StringsKt__StringsJVMKt.equals(FilesKt.getNameWithoutExtension(it3), slot, true)) {
                                    z2 = false;
                                    Set of = SetsKt__SetsKt.setOf((Object[]) new String[]{"mp3", "wav", "ogg"});
                                    map2 = map3;
                                    String lowerCase3 = FilesKt__UtilsKt.getExtension(it3).toLowerCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                                    if (of.contains(lowerCase3)) {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        destination$iv$iv.add(it3);
                                    }
                                    i3++;
                                    length = i4;
                                    i2 = i5;
                                    map3 = map2;
                                } else {
                                    map2 = map3;
                                    z2 = false;
                                }
                                z3 = z2;
                                if (z3) {
                                    destination$iv$iv.add(it3);
                                }
                                i3++;
                                length = i4;
                                i2 = i5;
                                map3 = map2;
                            } catch (Exception e2) {
                                e = e2;
                                try {
                                    recoverLocked();
                                    throw e;
                                } catch (Exception recovery) {
                                    ExceptionsKt__ExceptionsKt.addSuppressed(e, recovery);
                                    throw e;
                                }
                            }
                        }
                        i = i2;
                        map = map3;
                        Iterable $this$forEach$iv2 = (List) destination$iv$iv;
                        int $i$f$forEach = 0;
                        for (Object element$iv3 : $this$forEach$iv2) {
                            targets.add(category.getRelativeDir() + FileSystemKt.UnixPathSeparator + ((File) element$iv3).getName());
                            $this$forEach$iv2 = $this$forEach$iv2;
                            $i$f$forEach = $i$f$forEach;
                        }
                    } else {
                        i = i2;
                        map = map3;
                    }
                    i2 = i;
                    map3 = map;
                }
                Properties journal = new Properties();
                journal.setProperty("count", String.valueOf(targets.size()));
                LinkedHashSet $this$forEachIndexed$iv = targets;
                int $i$f$forEachIndexed = 0;
                int index = 0;
                for (Object item$iv : $this$forEachIndexed$iv) {
                    int index$iv = index + 1;
                    if (index < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    String path = (String) item$iv;
                    File target = safeTarget(path);
                    journal.setProperty("path." + index, path);
                    journal.setProperty("existed." + index, String.valueOf(target.exists()));
                    if (target.exists()) {
                        copySynced(target, new File(getTransaction(), "backup/" + index));
                    }
                    index = index$iv;
                    $this$forEachIndexed$iv = $this$forEachIndexed$iv;
                    $i$f$forEachIndexed = $i$f$forEachIndexed;
                }
                Map<String, ? extends File> map4 = sources;
                for (Map.Entry<String, ? extends File> entry2 : map4.entrySet()) {
                    String slot2 = entry2.getKey();
                    File source2 = entry2.getValue();
                    File transaction = getTransaction();
                    StringBuilder sbAppend2 = new StringBuilder().append("stage/").append(slot2).append('.');
                    Map<String, ? extends File> map5 = map4;
                    String lowerCase4 = FilesKt__UtilsKt.getExtension(source2).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                    copySynced(source2, new File(transaction, sbAppend2.append(lowerCase4).toString()));
                    map4 = map5;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(new File(getTransaction(), DiskLruCache.JOURNAL_FILE_TMP));
                try {
                    FileOutputStream it4 = fileOutputStream;
                    journal.store(it4, (String) null);
                    it4.getFD().sync();
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                    if (!new File(getTransaction(), DiskLruCache.JOURNAL_FILE_TMP).renameTo(new File(getTransaction(), DiskLruCache.JOURNAL_FILE))) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    LinkedHashSet $this$forEach$iv3 = targets;
                    for (Object element$iv4 : $this$forEach$iv3) {
                        File it5 = safeTarget((String) element$iv4);
                        if (it5.exists() && !it5.delete()) {
                            throw new IllegalStateException("Не удалось заменить звук".toString());
                        }
                    }
                    Iterable $this$forEach$iv4 = sources.entrySet();
                    Iterable $this$forEachIndexed$iv2 = $this$forEach$iv4;
                    int $i$f$forEachIndexed2 = 0;
                    int index2 = 0;
                    for (Object item$iv2 : $this$forEachIndexed$iv2) {
                        int index$iv2 = index2 + 1;
                        if (index2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        Map.Entry entry3 = (Map.Entry) item$iv2;
                        String slot3 = (String) entry3.getKey();
                        File source3 = (File) entry3.getValue();
                        StringBuilder sbAppend3 = new StringBuilder().append(slot3).append('.');
                        Properties journal2 = journal;
                        String lowerCase5 = FilesKt__UtilsKt.getExtension(source3).toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
                        String name = sbAppend3.append(lowerCase5).toString();
                        copySynced(new File(getTransaction(), "stage/" + name), safeTarget(category.getRelativeDir() + FileSystemKt.UnixPathSeparator + name));
                        this.afterWrite.invoke(Integer.valueOf(index2));
                        index2 = index$iv2;
                        journal = journal2;
                        $this$forEachIndexed$iv2 = $this$forEachIndexed$iv2;
                        $i$f$forEachIndexed2 = $i$f$forEachIndexed2;
                    }
                    if (!getTransaction().renameTo(getGarbage())) {
                        throw new IllegalStateException("Не удалось завершить установку".toString());
                    }
                    zDeleteRecursively = FilesKt.deleteRecursively(getGarbage());
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        return zDeleteRecursively;
    }

    private final void recoverLocked() throws IOException {
        if (getGarbage().exists() && !FilesKt.deleteRecursively(getGarbage())) {
            throw new IllegalStateException("Не удалось очистить завершённую установку".toString());
        }
        if (getTransaction().exists()) {
            File journalFile = new File(getTransaction(), DiskLruCache.JOURNAL_FILE);
            if (journalFile.exists()) {
                Properties journal = new Properties();
                FileInputStream fileInputStream = new FileInputStream(journalFile);
                try {
                    FileInputStream it = fileInputStream;
                    journal.load(it);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    String property = journal.getProperty("count");
                    if (property == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    int count = Integer.parseInt(property);
                    if (!(1 <= count && count < 33)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    for (int i = 0; i < count; i++) {
                        int index = i;
                        String property2 = journal.getProperty("path." + index);
                        if (property2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        File target = safeTarget(property2);
                        if (Intrinsics.areEqual(journal.getProperty("existed." + index), "true")) {
                            copySynced(new File(getTransaction(), "backup/" + index), target);
                        } else if (target.exists() && !target.delete()) {
                            throw new IllegalStateException("Не удалось восстановить звуки".toString());
                        }
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
            if (!getTransaction().renameTo(getGarbage())) {
                throw new IllegalStateException("Не удалось завершить восстановление звуков".toString());
            }
            FilesKt.deleteRecursively(getGarbage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:50:0x0133 A[LOOP:0: B:24:0x0094->B:50:0x0133, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0142 A[EDGE_INSN: B:62:0x0142->B:52:0x0142 BREAK  A[LOOP:0: B:24:0x0094->B:50:0x0133], SYNTHETIC] */
    private final File safeTarget(String relative) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        char c;
        boolean z4;
        boolean z5;
        boolean z6;
        SoundInstaller soundInstaller = this;
        boolean z7 = false;
        if (new File(relative).isAbsolute()) {
            z = false;
        } else {
            Iterable $this$none$iv = StringsKt__StringsKt.split$default((CharSequence) relative, new char[]{FileSystemKt.UnixPathSeparator, '\\'}, false, 0, 6, (Object) null);
            if (!($this$none$iv instanceof Collection) || !((Collection) $this$none$iv).isEmpty()) {
                Iterator it = $this$none$iv.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z6 = true;
                        break;
                    }
                    Object element$iv = it.next();
                    String it2 = (String) element$iv;
                    if (Intrinsics.areEqual(it2, "..")) {
                        z6 = false;
                        break;
                    }
                }
            } else {
                z6 = true;
            }
            if (z6) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        File file = new File(soundInstaller.root, relative).getCanonicalFile();
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        if (!StringsKt__StringsJVMKt.startsWith$default(path, soundInstaller.root.getCanonicalPath() + File.separator, false, 2, null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        SoundCategory[] soundCategoryArrValues = SoundCategory.values();
        int length = soundCategoryArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z2 = z7;
                break;
            }
            SoundCategory soundCategory = soundCategoryArrValues[i];
            if (Intrinsics.areEqual(file.getParentFile(), new File(soundInstaller.root, soundCategory.getRelativeDir()).getCanonicalFile())) {
                Iterable $this$any$iv = soundCategory.getSlots();
                if (!($this$any$iv instanceof Collection) || !((Collection) $this$any$iv).isEmpty()) {
                    Iterator it3 = $this$any$iv.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z5 = false;
                            break;
                        }
                        Object element$iv2 = it3.next();
                        String it4 = (String) element$iv2;
                        Intrinsics.checkNotNull(file);
                        if (StringsKt__StringsJVMKt.equals(it4, FilesKt.getNameWithoutExtension(file), true)) {
                            z5 = true;
                            break;
                        }
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    z3 = false;
                    z2 = true;
                    c = 2;
                    Set of = SetsKt__SetsKt.setOf((Object[]) new String[]{"mp3", "wav", "ogg"});
                    Intrinsics.checkNotNull(file);
                    String lowerCase = FilesKt__UtilsKt.getExtension(file).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (of.contains(lowerCase)) {
                        z4 = true;
                    }
                    if (z4) {
                        break;
                    }
                    i++;
                    soundInstaller = this;
                    z7 = z3;
                } else {
                    z3 = false;
                    z2 = true;
                    c = 2;
                }
            } else {
                z3 = false;
                z2 = true;
                c = 2;
            }
            z4 = z3;
            if (z4) {
                break;
                break;
            }
            i++;
            soundInstaller = this;
            z7 = z3;
        }
        if (!z2) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Intrinsics.checkNotNull(file);
        return file;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    private final void copySynced(File source, File target) {
        boolean z;
        File parentFile = target.getParentFile();
        Intrinsics.checkNotNull(parentFile);
        if (parentFile.isDirectory()) {
            z = true;
        } else {
            File parentFile2 = target.getParentFile();
            Intrinsics.checkNotNull(parentFile2);
            if (parentFile2.mkdirs()) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            throw new IllegalStateException("Хранилище недоступно".toString());
        }
        FileInputStream fileInputStream = new FileInputStream(source);
        try {
            FileInputStream input = fileInputStream;
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                FileOutputStream output = fileOutputStream;
                ByteStreamsKt.copyTo$default(input, output, 0, 2, null);
                output.getFD().sync();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
                Unit unit2 = Unit.INSTANCE;
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
}
