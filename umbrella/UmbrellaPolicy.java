package com.blackhub.bronline.neizzir.umbrella;

import com.blackhub.bronline.neizzir.activities.main.updates.LauncherVersion;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.CloseableKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.p043io.files.FileSystemKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: UmbrellaPolicy.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaPolicy;", "", "()V", "DAY_MS", "", "choose", "Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaBuild;", "builds", "", "launcher", "", "game", "fresh", "", "saved", "now", "parseCatalog", "bytes", "", "sha256", "file", "Ljava/io/File;", "validElf", "verified", "build", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class UmbrellaPolicy {
    public static final long DAY_MS = 86400000;
    public static final UmbrellaPolicy INSTANCE = new UmbrellaPolicy();

    private UmbrellaPolicy() {
    }

    public final boolean fresh(long saved, long now) {
        return saved > 0 && now >= saved && now - saved < 86400000;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0143  */
    /* JADX WARN: Code duplicated, block: B:45:0x0152  */
    /* JADX WARN: Code duplicated, block: B:47:0x0155  */
    /* JADX WARN: Code duplicated, block: B:49:0x0163  */
    /* JADX WARN: Code duplicated, block: B:50:0x0165  */
    /* JADX WARN: Code duplicated, block: B:52:0x0168  */
    /* JADX WARN: Code duplicated, block: B:55:0x0193 A[LOOP:1: B:53:0x018d->B:55:0x0193, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:68:0x020d  */
    /* JADX WARN: Code duplicated, block: B:69:0x020f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0216 A[LOOP:2: B:62:0x01ce->B:73:0x0216, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x022c A[LOOP:0: B:14:0x0056->B:76:0x022c, LOOP_END] */
    public final List<UmbrellaBuild> parseCatalog(byte[] bytes) {
        Iterable $this$mapTo$iv$iv;
        boolean z;
        boolean z2;
        JSONArray photos;
        boolean z3;
        Iterable $this$map$iv;
        int $i$f$mapTo;
        Collection destination$iv$iv;
        Iterator<Integer> it;
        List images;
        List $this$all$iv;
        int $i$f$all;
        Iterator it2;
        int $i$f$all2;
        JSONArray photos2;
        String it3;
        Iterable $this$all$iv2;
        int $i$f$all3;
        Iterator it4;
        String prefix;
        boolean z4;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        JSONObject json = new JSONObject(new String(bytes, Charsets.UTF_8));
        if (!(json.getInt("schema") == 1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        JSONArray entries = json.getJSONArray("entries");
        if (!(entries.length() <= 1000)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Iterable $this$map$iv2 = RangesKt___RangesKt.until(0, entries.length());
        int $i$f$map = 0;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv2, 10));
        Iterable $this$mapTo$iv$iv2 = $this$map$iv2;
        int $i$f$mapTo2 = 0;
        Iterator<Integer> it5 = $this$mapTo$iv$iv2.iterator();
        while (it5.hasNext()) {
            int item$iv$iv = ((IntIterator) it5).nextInt();
            JSONObject entry = entries.getJSONObject(item$iv$iv);
            String launcher = entry.getString("launcherVersion");
            String game = entry.getString("gameVersion");
            Intrinsics.checkNotNull(launcher);
            JSONObject json2 = json;
            JSONArray entries2 = entries;
            if (!(new Regex("[0-9]+(\\.[0-9]+)*").matches(launcher) && LauncherVersion.INSTANCE.parse(launcher) != null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            Intrinsics.checkNotNull(game);
            if (!(new Regex("[0-9]+(\\.[0-9]+)*").matches(game) && LauncherVersion.INSTANCE.parse(game) != null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!Intrinsics.areEqual(entry.getString("abi"), "arm64-v8a")) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String prefix2 = "/umbrella/" + launcher + ' ' + game + FileSystemKt.UnixPathSeparator;
            String library = entry.getString("library");
            String string = entry.getString("sha256");
            Iterable $this$map$iv3 = $this$map$iv2;
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String hash = string.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(hash, "toLowerCase(...)");
            long size = entry.getLong("size");
            int $i$f$map2 = $i$f$map;
            if (Intrinsics.areEqual(library, prefix2 + "libumbrella.so")) {
                $this$mapTo$iv$iv = $this$mapTo$iv$iv2;
                z = new Regex("[0-9a-f]{64}").matches(hash);
                if (z) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (64 <= size || size >= 100000001) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                photos = entry.getJSONArray("images");
                if (photos.length() <= 500) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                $this$map$iv = RangesKt___RangesKt.until(0, photos.length());
                $i$f$mapTo = $i$f$mapTo2;
                int $i$f$mapTo3 = CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10);
                destination$iv$iv = new ArrayList($i$f$mapTo3);
                it = $this$map$iv.iterator();
                while (it.hasNext()) {
                    int item$iv$iv2 = ((IntIterator) it).nextInt();
                    destination$iv$iv.add(photos.getString(item$iv$iv2));
                    $this$map$iv = $this$map$iv;
                }
                images = (List) destination$iv$iv;
                $this$all$iv = images;
                $i$f$all = 0;
                if (($this$all$iv instanceof Collection) && $this$all$iv.isEmpty()) {
                    $i$f$all2 = 1;
                } else {
                    it2 = $this$all$iv.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            $i$f$all2 = 1;
                            break;
                        }
                        Object element$iv = it2.next();
                        photos2 = photos;
                        it3 = (String) element$iv;
                        Intrinsics.checkNotNull(it3);
                        $this$all$iv2 = $this$all$iv;
                        $i$f$all3 = $i$f$all;
                        it4 = it2;
                        if (StringsKt__StringsJVMKt.startsWith$default(it3, prefix2, false, 2, null)) {
                            prefix = prefix2;
                            z4 = new Regex("photo_[0-9]+\\.(jpg|jpeg|png|webp)", RegexOption.IGNORE_CASE).matches(StringsKt__StringsKt.removePrefix(it3, (CharSequence) prefix2));
                            if (!z4) {
                                $i$f$all2 = 0;
                                break;
                            }
                            $this$all$iv = $this$all$iv2;
                            $i$f$all = $i$f$all3;
                            it2 = it4;
                            photos = photos2;
                            prefix2 = prefix;
                        } else {
                            prefix = prefix2;
                        }
                        if (!z4) {
                            $i$f$all2 = 0;
                            break;
                        }
                        $this$all$iv = $this$all$iv2;
                        $i$f$all = $i$f$all3;
                        it2 = it4;
                        photos = photos2;
                        prefix2 = prefix;
                    }
                }
                if ($i$f$all2 != 0) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                Intrinsics.checkNotNull(library);
                destination$iv$iv2.add(new UmbrellaBuild(launcher, game, library, size, hash, images));
                json = json2;
                entries = entries2;
                $this$map$iv2 = $this$map$iv3;
                $i$f$map = $i$f$map2;
                $this$mapTo$iv$iv2 = $this$mapTo$iv$iv;
                $i$f$mapTo2 = $i$f$mapTo;
            } else {
                $this$mapTo$iv$iv = $this$mapTo$iv$iv2;
            }
            if (z) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (64 <= size) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            photos = entry.getJSONArray("images");
            if (photos.length() <= 500) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            $this$map$iv = RangesKt___RangesKt.until(0, photos.length());
            $i$f$mapTo = $i$f$mapTo2;
            int $i$f$mapTo4 = CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10);
            destination$iv$iv = new ArrayList($i$f$mapTo4);
            it = $this$map$iv.iterator();
            while (it.hasNext()) {
                int item$iv$iv3 = ((IntIterator) it).nextInt();
                destination$iv$iv.add(photos.getString(item$iv$iv3));
                $this$map$iv = $this$map$iv;
            }
            images = (List) destination$iv$iv;
            $this$all$iv = images;
            $i$f$all = 0;
            if ($this$all$iv instanceof Collection) {
                it2 = $this$all$iv.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        $i$f$all2 = 1;
                        break;
                    }
                    Object element$iv2 = it2.next();
                    photos2 = photos;
                    it3 = (String) element$iv2;
                    Intrinsics.checkNotNull(it3);
                    $this$all$iv2 = $this$all$iv;
                    $i$f$all3 = $i$f$all;
                    it4 = it2;
                    if (StringsKt__StringsJVMKt.startsWith$default(it3, prefix2, false, 2, null)) {
                        prefix = prefix2;
                        if (new Regex("photo_[0-9]+\\.(jpg|jpeg|png|webp)", RegexOption.IGNORE_CASE).matches(StringsKt__StringsKt.removePrefix(it3, (CharSequence) prefix2))) {
                        }
                        if (!z4) {
                            $i$f$all2 = 0;
                            break;
                        }
                        $this$all$iv = $this$all$iv2;
                        $i$f$all = $i$f$all3;
                        it2 = it4;
                        photos = photos2;
                        prefix2 = prefix;
                    } else {
                        prefix = prefix2;
                    }
                    if (!z4) {
                        $i$f$all2 = 0;
                        break;
                    }
                    $this$all$iv = $this$all$iv2;
                    $i$f$all = $i$f$all3;
                    it2 = it4;
                    photos = photos2;
                    prefix2 = prefix;
                }
            } else {
                it2 = $this$all$iv.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        $i$f$all2 = 1;
                        break;
                    }
                    Object element$iv3 = it2.next();
                    photos2 = photos;
                    it3 = (String) element$iv3;
                    Intrinsics.checkNotNull(it3);
                    $this$all$iv2 = $this$all$iv;
                    $i$f$all3 = $i$f$all;
                    it4 = it2;
                    if (StringsKt__StringsJVMKt.startsWith$default(it3, prefix2, false, 2, null)) {
                        prefix = prefix2;
                        if (new Regex("photo_[0-9]+\\.(jpg|jpeg|png|webp)", RegexOption.IGNORE_CASE).matches(StringsKt__StringsKt.removePrefix(it3, (CharSequence) prefix2))) {
                        }
                        if (!z4) {
                            $i$f$all2 = 0;
                            break;
                        }
                        $this$all$iv = $this$all$iv2;
                        $i$f$all = $i$f$all3;
                        it2 = it4;
                        photos = photos2;
                        prefix2 = prefix;
                    } else {
                        prefix = prefix2;
                    }
                    if (!z4) {
                        $i$f$all2 = 0;
                        break;
                    }
                    $this$all$iv = $this$all$iv2;
                    $i$f$all = $i$f$all3;
                    it2 = it4;
                    photos = photos2;
                    prefix2 = prefix;
                }
            }
            if ($i$f$all2 != 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            Intrinsics.checkNotNull(library);
            destination$iv$iv2.add(new UmbrellaBuild(launcher, game, library, size, hash, images));
            json = json2;
            entries = entries2;
            $this$map$iv2 = $this$map$iv3;
            $i$f$map = $i$f$map2;
            $this$mapTo$iv$iv2 = $this$mapTo$iv$iv;
            $i$f$mapTo2 = $i$f$mapTo;
        }
        List builds = (List) destination$iv$iv2;
        List $this$map$iv4 = builds;
        Collection destination$iv$iv3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv4, 10));
        for (Object item$iv$iv4 : $this$map$iv4) {
            UmbrellaBuild it6 = (UmbrellaBuild) item$iv$iv4;
            destination$iv$iv3.add(TuplesKt.m4423to(it6.getLauncherVersion(), it6.getGameVersion()));
        }
        if (CollectionsKt___CollectionsKt.distinct((List) destination$iv$iv3).size() == builds.size()) {
            return builds;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final UmbrellaBuild choose(List<UmbrellaBuild> builds, String launcher, String game) {
        Object element$iv;
        boolean z;
        String message;
        boolean z2;
        boolean z3;
        UmbrellaBuild it;
        Intrinsics.checkNotNullParameter(builds, "builds");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        Intrinsics.checkNotNullParameter(game, "game");
        LauncherVersion local = LauncherVersion.INSTANCE.parse(launcher);
        if (local == null) {
            throw new IllegalStateException("Не удалось проверить совместимость".toString());
        }
        LauncherVersion installed = LauncherVersion.INSTANCE.parse(game);
        if (installed == null) {
            throw new IllegalStateException("Не удалось проверить совместимость".toString());
        }
        List<UmbrellaBuild> $this$firstOrNull$iv = builds;
        Iterator it2 = $this$firstOrNull$iv.iterator();
        do {
            if (!it2.hasNext()) {
                element$iv = null;
                break;
            }
            element$iv = it2.next();
            it = (UmbrellaBuild) element$iv;
        } while (!(choose$lv(it).compareTo(local) == 0 && choose$gv(it).compareTo(installed) == 0));
        UmbrellaBuild it3 = (UmbrellaBuild) element$iv;
        if (it3 != null) {
            return it3;
        }
        List<UmbrellaBuild> $this$filter$iv = builds;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            if (choose$gv((UmbrellaBuild) element$iv$iv).compareTo(installed) == 0) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        Iterable sameGame = (List) destination$iv$iv;
        List<UmbrellaBuild> $this$filter$iv2 = builds;
        Collection destination$iv$iv2 = new ArrayList();
        for (Object element$iv$iv2 : $this$filter$iv2) {
            if (choose$lv((UmbrellaBuild) element$iv$iv2).compareTo(local) == 0) {
                destination$iv$iv2.add(element$iv$iv2);
            }
        }
        Iterable sameLauncher = (List) destination$iv$iv2;
        Iterable $this$any$iv = sameGame;
        if (!($this$any$iv instanceof Collection) || !((Collection) $this$any$iv).isEmpty()) {
            Iterator it4 = $this$any$iv.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z = false;
                    break;
                }
                Object element$iv2 = it4.next();
                if (choose$lv((UmbrellaBuild) element$iv2).compareTo(local) > 0) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
        }
        if (z) {
            message = "Обновите лаунчер на последнюю версию";
        } else {
            Iterable $this$any$iv2 = sameLauncher;
            if (!($this$any$iv2 instanceof Collection) || !((Collection) $this$any$iv2).isEmpty()) {
                Iterator it5 = $this$any$iv2.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        z2 = false;
                        break;
                    }
                    Object element$iv3 = it5.next();
                    if (choose$gv((UmbrellaBuild) element$iv3).compareTo(installed) > 0) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
            }
            if (z2) {
                message = "Обновите игру";
            } else {
                List<UmbrellaBuild> $this$any$iv3 = builds;
                if (!($this$any$iv3 instanceof Collection) || !$this$any$iv3.isEmpty()) {
                    Iterator it6 = $this$any$iv3.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            z3 = false;
                            break;
                        }
                        Object element$iv4 = it6.next();
                        UmbrellaBuild it7 = (UmbrellaBuild) element$iv4;
                        if (choose$lv(it7).compareTo(local) > 0 && choose$gv(it7).compareTo(installed) > 0) {
                            z3 = true;
                            break;
                        }
                    }
                } else {
                    z3 = false;
                }
                message = z3 ? "Обновите лаунчер и игру" : "Подождите обновления Umbrella для вашей версии";
            }
        }
        throw new IllegalStateException(message.toString());
    }

    private static final LauncherVersion choose$lv(UmbrellaBuild b) {
        LauncherVersion launcherVersion = LauncherVersion.INSTANCE.parse(b.getLauncherVersion());
        Intrinsics.checkNotNull(launcherVersion);
        return launcherVersion;
    }

    private static final LauncherVersion choose$gv(UmbrellaBuild b) {
        LauncherVersion launcherVersion = LauncherVersion.INSTANCE.parse(b.getGameVersion());
        Intrinsics.checkNotNull(launcherVersion);
        return launcherVersion;
    }

    public final String sha256(File file) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(file, "file");
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileInputStream input = fileInputStream;
            byte[] buffer = new byte[65536];
            while (true) {
                int read = input.read(buffer);
                if (read < 0) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    byte[] bArrDigest = digest.digest();
                    Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                    return ArraysKt___ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaPolicy.sha256.2
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
                digest.update(buffer, 0, read);
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

    public final boolean validElf(File file) {
        Object objM15551constructorimpl;
        boolean executable;
        char c;
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            Result.Companion companion = Result.INSTANCE;
            UmbrellaPolicy umbrellaPolicy = this;
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                RandomAccessFile stream = randomAccessFile;
                byte[] header = new byte[64];
                stream.readFully(header);
                ByteBuffer h = ByteBuffer.wrap(header).order(ByteOrder.LITTLE_ENDIAN);
                if (!Arrays.equals(ArraysKt___ArraysJvmKt.copyOfRange(header, 0, 7), new byte[]{127, 69, 76, 70, 2, 1, 1}) || h.getShort(16) != 3 || h.getShort(18) != 183) {
                    executable = false;
                } else {
                    long phoff = h.getLong(32);
                    int i = 56;
                    int count = h.getShort(56) & UShort.MAX_VALUE;
                    if (h.getShort(52) == 64 && h.getShort(54) == 56) {
                        if (!(1 <= count && count < 1025) || phoff < 64 || phoff > file.length() - (((long) count) * 56)) {
                            executable = false;
                        } else {
                            stream.seek(phoff);
                            executable = false;
                            int i2 = 0;
                            while (i2 < count) {
                                byte[] bytes = new byte[i];
                                stream.readFully(bytes);
                                ByteBuffer ph = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
                                RandomAccessFile stream2 = stream;
                                if (ph.getInt(0) == 1) {
                                    long offset = ph.getLong(8);
                                    c = ' ';
                                    long size = ph.getLong(32);
                                    long memory = ph.getLong(40);
                                    if (offset >= 0 && size >= 0 && memory >= size && offset <= file.length() && size <= file.length() - offset) {
                                        if ((ph.getInt(4) & 1) != 0 && size > 0) {
                                            executable = true;
                                        }
                                    }
                                    executable = false;
                                    break;
                                }
                                c = ' ';
                                i2++;
                                stream = stream2;
                                i = 56;
                            }
                        }
                    } else {
                        executable = false;
                    }
                }
                CloseableKt.closeFinally(randomAccessFile, null);
                objM15551constructorimpl = Result.m15551constructorimpl(Boolean.valueOf(executable));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(randomAccessFile, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th3));
        }
        if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
            objM15551constructorimpl = false;
        }
        return ((Boolean) objM15551constructorimpl).booleanValue();
    }

    public final boolean verified(File file, UmbrellaBuild build) {
        Object objM15551constructorimpl;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(build, "build");
        try {
            Result.Companion companion = Result.INSTANCE;
            UmbrellaPolicy $this$verified_u24lambda_u2416 = this;
            objM15551constructorimpl = Result.m15551constructorimpl(Boolean.valueOf(file.isFile() && file.length() == build.getSize() && $this$verified_u24lambda_u2416.validElf(file) && Intrinsics.areEqual($this$verified_u24lambda_u2416.sha256(file), build.getSha256())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
            objM15551constructorimpl = false;
        }
        return ((Boolean) objM15551constructorimpl).booleanValue();
    }
}
