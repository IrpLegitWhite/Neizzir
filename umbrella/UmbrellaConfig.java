package com.blackhub.bronline.neizzir.umbrella;

import io.ktor.sse.ServerSentEventKt;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.CloseableKt;
import kotlin.p040io.FilesKt__FileReadWriteKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: UmbrellaConfig.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J2\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaConfig;", "", "()V", "DEFAULT_COMMAND", "", "commandPattern", "Lkotlin/text/Regex;", "read", "file", "Ljava/io/File;", "replaceFirstLine", "", "old", "command", "validate", "", "kolsonCommand", "write", "replace", "Lkotlin/Function2;", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class UmbrellaConfig {
    public static final String DEFAULT_COMMAND = "/umbrella";
    public static final UmbrellaConfig INSTANCE = new UmbrellaConfig();
    private static final Regex commandPattern = new Regex("/[A-Za-z0-9_]{1,14}");

    private UmbrellaConfig() {
    }

    public final void validate(String command, String kolsonCommand) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(kolsonCommand, "kolsonCommand");
        if (!commandPattern.matches(command)) {
            throw new IllegalArgumentException("Команда: / и от 1 до 14 латинских букв, цифр или _".toString());
        }
        if (StringsKt__StringsJVMKt.equals(command, kolsonCommand, true)) {
            throw new IllegalArgumentException("Команда уже используется меню Kolson".toString());
        }
    }

    public final String read(File file) {
        Object objM15551constructorimpl;
        String strTrimEnd;
        Object obj = DEFAULT_COMMAND;
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            Result.Companion companion = Result.INSTANCE;
            UmbrellaConfig umbrellaConfig = this;
            InputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = fileInputStream instanceof BufferedInputStream ? (BufferedInputStream) fileInputStream : new BufferedInputStream(fileInputStream, 8192);
            try {
                BufferedInputStream stream = bufferedInputStream;
                StringBuilder line = new StringBuilder();
                int i = 0;
                while (true) {
                    if (i < 128) {
                        int value = stream.read();
                        switch (value) {
                            case -1:
                            case 10:
                                String string = line.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                strTrimEnd = StringsKt.trimEnd(string, '\r');
                                break;
                            default:
                                line.append((char) value);
                                i++;
                                break;
                        }
                    } else {
                        strTrimEnd = "";
                    }
                }
                CloseableKt.closeFinally(bufferedInputStream, null);
                String it = StringsKt__StringsKt.removePrefix(strTrimEnd, (CharSequence) "menu_command=");
                String str = commandPattern.matches(it) ? it : null;
                if (str == null) {
                    str = DEFAULT_COMMAND;
                }
                objM15551constructorimpl = Result.m15551constructorimpl(str);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(bufferedInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th3));
        }
        if (!Result.m15557isFailureimpl(objM15551constructorimpl)) {
            obj = objM15551constructorimpl;
        }
        return (String) obj;
    }

    public final byte[] replaceFirstLine(byte[] old, String command) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(command, "command");
        if (!commandPattern.matches(command)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int end = ArraysKt___ArraysKt.indexOf(old, (byte) 10);
        String newline = (end <= 0 || old[end + (-1)] != 13) ? "\n" : ServerSentEventKt.END_OF_LINE;
        byte[] tail = end >= 0 ? ArraysKt___ArraysJvmKt.copyOfRange(old, end + 1, old.length) : new byte[0];
        byte[] bytes = ("menu_command=" + command + newline).getBytes(Charsets.US_ASCII);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return ArraysKt___ArraysJvmKt.plus(bytes, tail);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void write$default(UmbrellaConfig umbrellaConfig, File file, String str, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function2<File, File, Boolean>() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaConfig.write.1
                @Override // kotlin.jvm.functions.Function2
                public final Boolean invoke(File source, File target) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(target, "target");
                    return Boolean.valueOf(source.renameTo(target));
                }
            };
        }
        umbrellaConfig.write(file, str, function2);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d5 A[Catch: all -> 0x0102, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0018, B:11:0x0029, B:13:0x002f, B:14:0x0032, B:16:0x0038, B:18:0x003f, B:20:0x0086, B:22:0x009d, B:27:0x00a4, B:28:0x00a7, B:34:0x00d5, B:46:0x00f0, B:47:0x00f3, B:17:0x003d, B:48:0x00f4, B:49:0x0101, B:21:0x008d, B:25:0x00a2, B:30:0x00a9, B:32:0x00c6, B:38:0x00db, B:39:0x00e7, B:43:0x00eb, B:44:0x00ee), top: B:55:0x0001, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    public final synchronized void write(File file, String command, Function2<? super File, ? super File, Boolean> replace) {
        FileOutputStream fileOutputStream;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(replace, "replace");
        if (!(!file.exists() || file.length() <= 16777216)) {
            throw new IllegalArgumentException("Файл config.umbr слишком большой".toString());
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        byte[] original = file.exists() ? FilesKt__FileReadWriteKt.readBytes(file) : new byte[0];
        File temporary = new File(file.getParentFile(), file.getName() + ".neizzir.tmp");
        File backup = new File(file.getParentFile(), file.getName() + ".neizzir.bak");
        if (file.exists()) {
            FileOutputStream fileOutputStream2 = new FileOutputStream(backup);
            try {
                FileOutputStream it = fileOutputStream2;
                it.write(original);
                it.getFD().sync();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream2, null);
                try {
                    fileOutputStream = new FileOutputStream(temporary);
                    try {
                        FileOutputStream it2 = fileOutputStream;
                        it2.write(INSTANCE.replaceFirstLine(original, command));
                        it2.getFD().sync();
                        Unit unit2 = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileOutputStream, null);
                        if (replace.invoke(temporary, file).booleanValue()) {
                            throw new IllegalStateException("Не удалось заменить config.umbr; исходный файл сохранён".toString());
                        }
                        temporary.delete();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    temporary.delete();
                    throw th3;
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    CloseableKt.closeFinally(fileOutputStream2, th4);
                    throw th5;
                }
            }
        } else {
            fileOutputStream = new FileOutputStream(temporary);
            FileOutputStream it3 = fileOutputStream;
            it3.write(INSTANCE.replaceFirstLine(original, command));
            it3.getFD().sync();
            Unit unit3 = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            if (replace.invoke(temporary, file).booleanValue()) {
                throw new IllegalStateException("Не удалось заменить config.umbr; исходный файл сохранён".toString());
            }
            temporary.delete();
        }
        throw th;
    }
}
