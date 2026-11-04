package com.blackhub.bronline.neizzir.fragments.custom.manager;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.p043io.files.FileSystemKt;

/* JADX INFO: compiled from: FoliageManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0006"}, m4416d2 = {"foliageBaseName", "", "path", "normalizeBaseName", "value", "normalizeZipEntryName", "app_debug"}, m4417k = 2, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class FoliageManagerKt {
    public static final String normalizeZipEntryName(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return StringsKt__StringsKt.trimStart(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsKt.trim((CharSequence) path).toString(), '\\', FileSystemKt.UnixPathSeparator, false, 4, (Object) null), FileSystemKt.UnixPathSeparator);
    }

    public static final String foliageBaseName(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        String normalized = normalizeZipEntryName(path);
        return normalizeBaseName(StringsKt__StringsKt.substringBeforeLast(StringsKt__StringsKt.substringAfterLast$default(normalized, FileSystemKt.UnixPathSeparator, (String) null, 2, (Object) null), '.', normalized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String normalizeBaseName(String value) {
        String string = StringsKt__StringsKt.trim((CharSequence) value).toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = string.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
