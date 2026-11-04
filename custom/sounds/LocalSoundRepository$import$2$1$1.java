package com.blackhub.bronline.neizzir.fragments.custom.sounds;

import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.SystemClock;
import com.blackhub.bronline.game.core.constants.ScreenId;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.CloseableKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.p043io.files.FileSystemKt;

/* JADX INFO: compiled from: LocalSoundRepository.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/LocalSound;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.sounds.LocalSoundRepository$import$2$1$1", m4426f = "LocalSoundRepository.kt", m4427i = {0, 0, 0, 0}, m4428l = {ScreenId.SCREEN_CLICKER}, m4429m = "invokeSuspend", m4430n = {"check", "timeout", "name", "temporary"}, m4431s = {"L$0", "L$1", "L$2", "L$3"})
final class LocalSoundRepository$import$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LocalSound>, Object> {
    final /* synthetic */ SoundCategory $category;
    final /* synthetic */ Uri $uri;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ LocalSoundRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalSoundRepository$import$2$1$1(LocalSoundRepository localSoundRepository, Uri uri, SoundCategory soundCategory, Continuation<? super LocalSoundRepository$import$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = localSoundRepository;
        this.$uri = uri;
        this.$category = soundCategory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LocalSoundRepository$import$2$1$1 localSoundRepository$import$2$1$1 = new LocalSoundRepository$import$2$1$1(this.this$0, this.$uri, this.$category, continuation);
        localSoundRepository$import$2$1$1.L$0 = obj;
        return localSoundRepository$import$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LocalSound> continuation) {
        return ((LocalSoundRepository$import$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0258 A[Catch: all -> 0x0366, TRY_ENTER, TryCatch #1 {all -> 0x0366, blocks: (B:64:0x01a1, B:76:0x01d8, B:77:0x0210, B:90:0x023a, B:100:0x0258, B:101:0x0268, B:108:0x0284, B:113:0x02a3, B:120:0x02d5, B:122:0x02db, B:123:0x02f0, B:125:0x02f6), top: B:217:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x026e A[Catch: all -> 0x0235, TRY_ENTER, TryCatch #8 {all -> 0x0235, blocks: (B:79:0x0216, B:81:0x0228, B:93:0x023f, B:103:0x026e, B:105:0x027b, B:115:0x02c2, B:118:0x02c9, B:119:0x02d4), top: B:230:0x0216 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x027b A[Catch: all -> 0x0235, TRY_LEAVE, TryCatch #8 {all -> 0x0235, blocks: (B:79:0x0216, B:81:0x0228, B:93:0x023f, B:103:0x026e, B:105:0x027b, B:115:0x02c2, B:118:0x02c9, B:119:0x02d4), top: B:230:0x0216 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x029e  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2 A[Catch: all -> 0x0235, TRY_ENTER, TryCatch #8 {all -> 0x0235, blocks: (B:79:0x0216, B:81:0x0228, B:93:0x023f, B:103:0x026e, B:105:0x027b, B:115:0x02c2, B:118:0x02c9, B:119:0x02d4), top: B:230:0x0216 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x02f6 A[Catch: Exception -> 0x033e, all -> 0x0366, TRY_LEAVE, TryCatch #1 {all -> 0x0366, blocks: (B:64:0x01a1, B:76:0x01d8, B:77:0x0210, B:90:0x023a, B:100:0x0258, B:101:0x0268, B:108:0x0284, B:113:0x02a3, B:120:0x02d5, B:122:0x02db, B:123:0x02f0, B:125:0x02f6), top: B:217:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x030a A[Catch: Exception -> 0x033c, all -> 0x0360, TryCatch #0 {all -> 0x0360, blocks: (B:156:0x035c, B:157:0x035f, B:127:0x0300, B:129:0x030a, B:134:0x0315, B:147:0x0341, B:148:0x0344, B:136:0x031b, B:149:0x0345, B:150:0x0354, B:153:0x0359), top: B:217:0x01a1, inners: #29 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0312  */
    /* JADX WARN: Code duplicated, block: B:134:0x0315 A[Catch: Exception -> 0x033c, all -> 0x0360, TryCatch #0 {all -> 0x0360, blocks: (B:156:0x035c, B:157:0x035f, B:127:0x0300, B:129:0x030a, B:134:0x0315, B:147:0x0341, B:148:0x0344, B:136:0x031b, B:149:0x0345, B:150:0x0354, B:153:0x0359), top: B:217:0x01a1, inners: #29 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0345 A[Catch: all -> 0x0360, TryCatch #0 {all -> 0x0360, blocks: (B:156:0x035c, B:157:0x035f, B:127:0x0300, B:129:0x030a, B:134:0x0315, B:147:0x0341, B:148:0x0344, B:136:0x031b, B:149:0x0345, B:150:0x0354, B:153:0x0359), top: B:217:0x01a1, inners: #29 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x039f A[Catch: all -> 0x03af, TryCatch #4 {all -> 0x03af, blocks: (B:60:0x0180, B:194:0x039b, B:195:0x039e, B:196:0x039f, B:197:0x03ae, B:191:0x0398), top: B:223:0x012e, inners: #28 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:230:0x0216 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x02db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:? A[LOOP:1: B:77:0x0210->B:272:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00db A[Catch: all -> 0x0406, TRY_ENTER, TryCatch #16 {all -> 0x0406, blocks: (B:20:0x0095, B:44:0x00eb, B:46:0x010c, B:40:0x00db, B:43:0x00e4), top: B:242:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x010c A[Catch: all -> 0x0406, TRY_LEAVE, TryCatch #16 {all -> 0x0406, blocks: (B:20:0x0095, B:44:0x00eb, B:46:0x010c, B:40:0x00db, B:43:0x00e4), top: B:242:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0130 A[Catch: all -> 0x03b5, TRY_LEAVE, TryCatch #6 {all -> 0x03b5, blocks: (B:47:0x011b, B:49:0x0130), top: B:226:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:62:0x019b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x019c  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:81:0x0228 A[Catch: all -> 0x0235, TRY_LEAVE, TryCatch #8 {all -> 0x0235, blocks: (B:79:0x0216, B:81:0x0228, B:93:0x023f, B:103:0x026e, B:105:0x027b, B:115:0x02c2, B:118:0x02c9, B:119:0x02d4), top: B:230:0x0216 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0230  */
    /* JADX WARN: Code duplicated, block: B:93:0x023f A[Catch: all -> 0x0235, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x0235, blocks: (B:79:0x0216, B:81:0x0228, B:93:0x023f, B:103:0x026e, B:105:0x027b, B:115:0x02c2, B:118:0x02c9, B:119:0x02d4), top: B:230:0x0216 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) throws Throwable {
        LocalSoundRepository$import$2$1$1 localSoundRepository$import$2$1$1;
        Function0<Unit> function0;
        String string;
        String name;
        String extension;
        boolean zContains;
        SoundCategory soundCategory;
        File temporary;
        ScheduledFuture<?> scheduledFuture;
        File temporary2;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        AssetFileDescriptor assetFileDescriptor;
        Throwable th;
        FileInputStream fileInputStreamCreateInputStream;
        Throwable th2;
        FileOutputStream fileOutputStream;
        Throwable th3;
        boolean z;
        Object objValidate;
        Object $result2;
        String name2;
        String lastPathSegment;
        SoundInfo info;
        MessageDigest digest;
        FileInputStream fileInputStream;
        Throwable th4;
        FileInputStream input;
        byte[] bytes;
        int n;
        String id;
        Iterable entries;
        Iterator it;
        Object obj;
        LocalSound existing;
        String $this$filterNotTo$iv$iv;
        Appendable destination$iv$iv;
        int i;
        String strTake;
        LocalSound item;
        File destination;
        Collection destination$iv$iv2;
        LocalSound it2;
        boolean z2;
        char element$iv$iv;
        Object element$iv;
        LocalSound it3;
        boolean z3;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                localSoundRepository$import$2$1$1 = this;
                final CoroutineScope $this$withTimeout = (CoroutineScope) localSoundRepository$import$2$1$1.L$0;
                if (!(localSoundRepository$import$2$1$1.this$0.directory.isDirectory() || localSoundRepository$import$2$1$1.this$0.directory.mkdirs())) {
                    throw new IllegalStateException("Хранилище недоступно".toString());
                }
                localSoundRepository$import$2$1$1.this$0.clearTemporaryFiles();
                final CoroutineContext coroutine = localSoundRepository$import$2$1$1.get$context();
                final long deadline = SystemClock.elapsedRealtime() + 10000;
                function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.LocalSoundRepository$import$2$1$1$check$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        JobKt.ensureActive(coroutine);
                        if (!(SystemClock.elapsedRealtime() < deadline)) {
                            throw new IllegalStateException("Проверка заняла слишком долго".toString());
                        }
                    }
                };
                final CancellationSignal cancellation = new CancellationSignal();
                final AtomicReference activeInput = new AtomicReference();
                ScheduledFuture<?> scheduledFutureSchedule = LocalSoundRepository.watchdog.schedule(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.LocalSoundRepository$import$2$1$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocalSoundRepository$import$2$1$1.invokeSuspend$lambda$3($this$withTimeout, cancellation, activeInput);
                    }
                }, 10000L, TimeUnit.MILLISECONDS);
                try {
                    Cursor cursorQuery = localSoundRepository$import$2$1$1.this$0.context.getContentResolver().query(localSoundRepository$import$2$1$1.$uri, new String[]{"_display_name"}, null, null, null, cancellation);
                    if (cursorQuery == null) {
                        lastPathSegment = localSoundRepository$import$2$1$1.$uri.getLastPathSegment();
                        if (lastPathSegment == null) {
                            lastPathSegment = "";
                        }
                        string = StringsKt__StringsKt.substringAfterLast$default(lastPathSegment, FileSystemKt.UnixPathSeparator, (String) null, 2, (Object) null);
                        name = string;
                        extension = StringsKt__StringsKt.substringAfterLast(name, '.', "").toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(extension, "toLowerCase(...)");
                        zContains = localSoundRepository$import$2$1$1.$category.getFormats().contains(extension);
                        soundCategory = localSoundRepository$import$2$1$1.$category;
                        if (!zContains) {
                            throw new IllegalArgumentException(("Поддерживаемые форматы: " + CollectionsKt___CollectionsKt.joinToString$default(soundCategory.getFormats(), null, null, null, 0, null, new Function1<String, CharSequence>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.LocalSoundRepository$import$2$1$1$2$1
                                @Override // kotlin.jvm.functions.Function1
                                public final CharSequence invoke(String it4) {
                                    Intrinsics.checkNotNullParameter(it4, "it");
                                    String upperCase = it4.toUpperCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                    return upperCase;
                                }
                            }, 31, null)).toString());
                        }
                        temporary = File.createTempFile("import_", ".tmp", localSoundRepository$import$2$1$1.this$0.directory);
                        assetFileDescriptorOpenAssetFileDescriptor = localSoundRepository$import$2$1$1.this$0.context.getContentResolver().openAssetFileDescriptor(localSoundRepository$import$2$1$1.$uri, "r", cancellation);
                        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                            throw new IllegalArgumentException("Не удалось открыть файл".toString());
                        }
                        assetFileDescriptor = assetFileDescriptorOpenAssetFileDescriptor;
                        AssetFileDescriptor descriptor = assetFileDescriptor;
                        fileInputStreamCreateInputStream = descriptor.createInputStream();
                        FileInputStream input2 = fileInputStreamCreateInputStream;
                        localSoundRepository$import$2$1$1 = null;
                        activeInput.set(input2);
                        Intrinsics.checkNotNull(temporary);
                        fileOutputStream = new FileOutputStream(temporary);
                        FileOutputStream output = fileOutputStream;
                        SoundRules soundRules = SoundRules.INSTANCE;
                        Intrinsics.checkNotNull(input2);
                        soundRules.copyBounded(input2, output, function0);
                        output.getFD().sync();
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileOutputStream, null);
                        activeInput.set(null);
                        Unit unit2 = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileInputStreamCreateInputStream, null);
                        Unit unit3 = Unit.INSTANCE;
                        CloseableKt.closeFinally(assetFileDescriptor, null);
                        localSoundRepository$import$2$1$1.L$0 = function0;
                        localSoundRepository$import$2$1$1.L$1 = scheduledFutureSchedule;
                        localSoundRepository$import$2$1$1.L$2 = name;
                        localSoundRepository$import$2$1$1.L$3 = temporary;
                        z = true;
                        localSoundRepository$import$2$1$1.label = 1;
                        objValidate = AndroidSoundValidator.INSTANCE.validate(temporary, extension, localSoundRepository$import$2$1$1.$category, localSoundRepository$import$2$1$1);
                        if (objValidate == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        $result2 = $result;
                        scheduledFuture = scheduledFutureSchedule;
                        name2 = name;
                        temporary2 = temporary;
                        info = (SoundInfo) objValidate;
                        function0.invoke();
                        digest = MessageDigest.getInstance("SHA-256");
                        Intrinsics.checkNotNull(temporary2);
                        fileInputStream = new FileInputStream(temporary2);
                        input = fileInputStream;
                        bytes = new byte[8192];
                        while (true) {
                            function0.invoke();
                            n = input.read(bytes);
                            if (n >= 0) {
                                Unit unit4 = Unit.INSTANCE;
                                CloseableKt.closeFinally(fileInputStream, null);
                                byte[] bArrDigest = digest.digest();
                                Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                                id = ArraysKt___ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.LocalSoundRepository$import$2$1$1$id$1
                                    public final CharSequence invoke(byte it4) {
                                        String str = String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(it4 & 255)}, 1));
                                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                                        return str;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                                        return invoke(b.byteValue());
                                    }
                                }, 30, (Object) null);
                                entries = localSoundRepository$import$2$1$1.this$0.read();
                                Iterable $this$firstOrNull$iv = entries;
                                SoundCategory soundCategory2 = localSoundRepository$import$2$1$1.$category;
                                it = $this$firstOrNull$iv.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        element$iv = it.next();
                                        it3 = (LocalSound) element$iv;
                                        if (Intrinsics.areEqual(it3.getId(), id)) {
                                            z3 = false;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            obj = element$iv;
                                        }
                                    } else {
                                        obj = null;
                                    }
                                }
                                existing = (LocalSound) obj;
                                if (existing == null) {
                                    SoundCategory soundCategory3 = localSoundRepository$import$2$1$1.$category;
                                    $this$filterNotTo$iv$iv = name2;
                                    destination$iv$iv = new StringBuilder();
                                    for (i = 0; i < $this$filterNotTo$iv$iv.length(); i++) {
                                        element$iv$iv = $this$filterNotTo$iv$iv.charAt(i);
                                        if (!Character.isISOControl(element$iv$iv)) {
                                            destination$iv$iv.append(element$iv$iv);
                                        }
                                    }
                                    String string2 = ((StringBuilder) destination$iv$iv).toString();
                                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                    strTake = StringsKt___StringsKt.take(string2, 160);
                                    if (StringsKt__StringsKt.isBlank(strTake)) {
                                        strTake = "Мой звук";
                                    }
                                    item = new LocalSound(id, soundCategory3, strTake, info, temporary2.length());
                                    destination = localSoundRepository$import$2$1$1.this$0.file(item);
                                    if (destination.exists()) {
                                        throw new IllegalStateException("Check failed.".toString());
                                    }
                                    if (!temporary2.renameTo(destination)) {
                                        throw new IllegalStateException("Не удалось сохранить звук".toString());
                                    }
                                    LocalSoundRepository localSoundRepository = localSoundRepository$import$2$1$1.this$0;
                                    SoundCategory soundCategory4 = localSoundRepository$import$2$1$1.$category;
                                    destination$iv$iv2 = new ArrayList();
                                    for (Object element$iv$iv2 : entries) {
                                        it2 = (LocalSound) element$iv$iv2;
                                        LocalSoundRepository$import$2$1$1 localSoundRepository$import$2$1$2 = localSoundRepository$import$2$1$1;
                                        if (Intrinsics.areEqual(it2.getId(), id)) {
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                        }
                                        if (!z2) {
                                            destination$iv$iv2.add(element$iv$iv2);
                                        }
                                        localSoundRepository$import$2$1$1 = localSoundRepository$import$2$1$2;
                                    }
                                    localSoundRepository.write(CollectionsKt___CollectionsKt.plus((Collection<? extends LocalSound>) ((Collection<? extends Object>) ((List) destination$iv$iv2)), item));
                                    temporary2.delete();
                                    scheduledFuture.cancel(false);
                                    return item;
                                }
                                SoundCategory soundCategory5 = localSoundRepository$import$2$1$1.$category;
                                $this$filterNotTo$iv$iv = name2;
                                destination$iv$iv = new StringBuilder();
                                while (i < $this$filterNotTo$iv$iv.length()) {
                                    element$iv$iv = $this$filterNotTo$iv$iv.charAt(i);
                                    if (!Character.isISOControl(element$iv$iv)) {
                                        destination$iv$iv.append(element$iv$iv);
                                    }
                                }
                                String string3 = ((StringBuilder) destination$iv$iv).toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                strTake = StringsKt___StringsKt.take(string3, 160);
                                if (StringsKt__StringsKt.isBlank(strTake)) {
                                    strTake = "Мой звук";
                                }
                                item = new LocalSound(id, soundCategory5, strTake, info, temporary2.length());
                                destination = localSoundRepository$import$2$1$1.this$0.file(item);
                                if (destination.exists()) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                if (!temporary2.renameTo(destination)) {
                                    throw new IllegalStateException("Не удалось сохранить звук".toString());
                                }
                                LocalSoundRepository localSoundRepository2 = localSoundRepository$import$2$1$1.this$0;
                                SoundCategory soundCategory6 = localSoundRepository$import$2$1$1.$category;
                                destination$iv$iv2 = new ArrayList();
                                while (r13.hasNext()) {
                                    it2 = (LocalSound) element$iv$iv2;
                                    LocalSoundRepository$import$2$1$1 localSoundRepository$import$2$1$3 = localSoundRepository$import$2$1$1;
                                    if (Intrinsics.areEqual(it2.getId(), id)) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        destination$iv$iv2.add(element$iv$iv2);
                                    }
                                    localSoundRepository$import$2$1$1 = localSoundRepository$import$2$1$3;
                                }
                                localSoundRepository2.write(CollectionsKt___CollectionsKt.plus((Collection<? extends LocalSound>) ((Collection<? extends Object>) ((List) destination$iv$iv2)), item));
                                temporary2.delete();
                                scheduledFuture.cancel(false);
                                return item;
                            }
                            digest.update(bytes, 0, n);
                            throw th4;
                        }
                        temporary2.delete();
                        throw th;
                    }
                    try {
                        Cursor cursor = cursorQuery;
                        try {
                            Cursor it4 = cursor;
                            string = it4.moveToFirst() ? it4.getString(0) : null;
                            CloseableKt.closeFinally(cursor, null);
                            if (string == null) {
                                lastPathSegment = localSoundRepository$import$2$1$1.$uri.getLastPathSegment();
                                if (lastPathSegment == null) {
                                    lastPathSegment = "";
                                }
                                string = StringsKt__StringsKt.substringAfterLast$default(lastPathSegment, FileSystemKt.UnixPathSeparator, (String) null, 2, (Object) null);
                            }
                            name = string;
                            extension = StringsKt__StringsKt.substringAfterLast(name, '.', "").toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(extension, "toLowerCase(...)");
                            zContains = localSoundRepository$import$2$1$1.$category.getFormats().contains(extension);
                            soundCategory = localSoundRepository$import$2$1$1.$category;
                            if (!zContains) {
                                temporary = File.createTempFile("import_", ".tmp", localSoundRepository$import$2$1$1.this$0.directory);
                                try {
                                    assetFileDescriptorOpenAssetFileDescriptor = localSoundRepository$import$2$1$1.this$0.context.getContentResolver().openAssetFileDescriptor(localSoundRepository$import$2$1$1.$uri, "r", cancellation);
                                    try {
                                        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                            throw new IllegalArgumentException("Не удалось открыть файл".toString());
                                        }
                                        assetFileDescriptor = assetFileDescriptorOpenAssetFileDescriptor;
                                        try {
                                            try {
                                                AssetFileDescriptor descriptor2 = assetFileDescriptor;
                                                fileInputStreamCreateInputStream = descriptor2.createInputStream();
                                                try {
                                                    try {
                                                        FileInputStream input3 = fileInputStreamCreateInputStream;
                                                        localSoundRepository$import$2$1$1 = null;
                                                        activeInput.set(input3);
                                                        try {
                                                            try {
                                                                Intrinsics.checkNotNull(temporary);
                                                                fileOutputStream = new FileOutputStream(temporary);
                                                                try {
                                                                    FileOutputStream output2 = fileOutputStream;
                                                                    SoundRules soundRules2 = SoundRules.INSTANCE;
                                                                    Intrinsics.checkNotNull(input3);
                                                                    try {
                                                                        soundRules2.copyBounded(input3, output2, function0);
                                                                        output2.getFD().sync();
                                                                        Unit unit5 = Unit.INSTANCE;
                                                                        CloseableKt.closeFinally(fileOutputStream, null);
                                                                        activeInput.set(null);
                                                                        Unit unit6 = Unit.INSTANCE;
                                                                        CloseableKt.closeFinally(fileInputStreamCreateInputStream, null);
                                                                        Unit unit7 = Unit.INSTANCE;
                                                                        CloseableKt.closeFinally(assetFileDescriptor, null);
                                                                        localSoundRepository$import$2$1$1.L$0 = function0;
                                                                        localSoundRepository$import$2$1$1.L$1 = scheduledFutureSchedule;
                                                                        localSoundRepository$import$2$1$1.L$2 = name;
                                                                        localSoundRepository$import$2$1$1.L$3 = temporary;
                                                                        z = true;
                                                                        localSoundRepository$import$2$1$1.label = 1;
                                                                        objValidate = AndroidSoundValidator.INSTANCE.validate(temporary, extension, localSoundRepository$import$2$1$1.$category, localSoundRepository$import$2$1$1);
                                                                        if (objValidate == coroutine_suspended) {
                                                                            return coroutine_suspended;
                                                                        }
                                                                        $result2 = $result;
                                                                        scheduledFuture = scheduledFutureSchedule;
                                                                        name2 = name;
                                                                        temporary2 = temporary;
                                                                        try {
                                                                            try {
                                                                                info = (SoundInfo) objValidate;
                                                                                function0.invoke();
                                                                                digest = MessageDigest.getInstance("SHA-256");
                                                                                Intrinsics.checkNotNull(temporary2);
                                                                                fileInputStream = new FileInputStream(temporary2);
                                                                                try {
                                                                                    input = fileInputStream;
                                                                                    bytes = new byte[8192];
                                                                                    while (true) {
                                                                                        function0.invoke();
                                                                                        n = input.read(bytes);
                                                                                        if (n >= 0) {
                                                                                            try {
                                                                                                digest.update(bytes, 0, n);
                                                                                            } catch (Throwable th5) {
                                                                                                th4 = th5;
                                                                                            }
                                                                                        } else {
                                                                                            Unit unit8 = Unit.INSTANCE;
                                                                                            CloseableKt.closeFinally(fileInputStream, null);
                                                                                            byte[] bArrDigest2 = digest.digest();
                                                                                            Intrinsics.checkNotNullExpressionValue(bArrDigest2, "digest(...)");
                                                                                            id = ArraysKt___ArraysKt.joinToString$default(bArrDigest2, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.LocalSoundRepository$import$2$1$1$id$1
                                                                                                public final CharSequence invoke(byte it5) {
                                                                                                    String str = String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(it5 & 255)}, 1));
                                                                                                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                                                                                                    return str;
                                                                                                }

                                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                                public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                                                                                                    return invoke(b.byteValue());
                                                                                                }
                                                                                            }, 30, (Object) null);
                                                                                            entries = localSoundRepository$import$2$1$1.this$0.read();
                                                                                            Iterable $this$firstOrNull$iv2 = entries;
                                                                                            SoundCategory soundCategory7 = localSoundRepository$import$2$1$1.$category;
                                                                                            it = $this$firstOrNull$iv2.iterator();
                                                                                            while (true) {
                                                                                                if (it.hasNext()) {
                                                                                                    try {
                                                                                                        element$iv = it.next();
                                                                                                        it3 = (LocalSound) element$iv;
                                                                                                        if (Intrinsics.areEqual(it3.getId(), id) || it3.getCategory() != soundCategory7) {
                                                                                                            z3 = false;
                                                                                                        } else {
                                                                                                            z3 = z;
                                                                                                        }
                                                                                                        if (z3) {
                                                                                                            obj = element$iv;
                                                                                                        }
                                                                                                    } catch (Throwable th6) {
                                                                                                        th = th6;
                                                                                                        temporary2.delete();
                                                                                                        throw th;
                                                                                                    }
                                                                                                } else {
                                                                                                    obj = null;
                                                                                                }
                                                                                            }
                                                                                            existing = (LocalSound) obj;
                                                                                            if (existing == null && localSoundRepository$import$2$1$1.this$0.file(existing).isFile()) {
                                                                                                try {
                                                                                                    temporary2.delete();
                                                                                                    scheduledFuture.cancel(false);
                                                                                                    return existing;
                                                                                                } catch (Throwable th7) {
                                                                                                    th = th7;
                                                                                                    scheduledFutureSchedule = scheduledFuture;
                                                                                                }
                                                                                            } else {
                                                                                                SoundCategory soundCategory8 = localSoundRepository$import$2$1$1.$category;
                                                                                                $this$filterNotTo$iv$iv = name2;
                                                                                                destination$iv$iv = new StringBuilder();
                                                                                                while (i < $this$filterNotTo$iv$iv.length()) {
                                                                                                    element$iv$iv = $this$filterNotTo$iv$iv.charAt(i);
                                                                                                    if (!Character.isISOControl(element$iv$iv)) {
                                                                                                        destination$iv$iv.append(element$iv$iv);
                                                                                                    }
                                                                                                }
                                                                                                String string4 = ((StringBuilder) destination$iv$iv).toString();
                                                                                                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                                                                                strTake = StringsKt___StringsKt.take(string4, 160);
                                                                                                if (StringsKt__StringsKt.isBlank(strTake)) {
                                                                                                    strTake = "Мой звук";
                                                                                                }
                                                                                                item = new LocalSound(id, soundCategory8, strTake, info, temporary2.length());
                                                                                                destination = localSoundRepository$import$2$1$1.this$0.file(item);
                                                                                                if (destination.exists() && !destination.delete()) {
                                                                                                    throw new IllegalStateException("Check failed.".toString());
                                                                                                }
                                                                                                if (!temporary2.renameTo(destination)) {
                                                                                                    throw new IllegalStateException("Не удалось сохранить звук".toString());
                                                                                                }
                                                                                                try {
                                                                                                    LocalSoundRepository localSoundRepository3 = localSoundRepository$import$2$1$1.this$0;
                                                                                                    SoundCategory soundCategory9 = localSoundRepository$import$2$1$1.$category;
                                                                                                    destination$iv$iv2 = new ArrayList();
                                                                                                    while (r13.hasNext()) {
                                                                                                        it2 = (LocalSound) element$iv$iv2;
                                                                                                        LocalSoundRepository$import$2$1$1 localSoundRepository$import$2$1$4 = localSoundRepository$import$2$1$1;
                                                                                                        try {
                                                                                                            if (Intrinsics.areEqual(it2.getId(), id) || it2.getCategory() != soundCategory9) {
                                                                                                                z2 = false;
                                                                                                            } else {
                                                                                                                z2 = true;
                                                                                                            }
                                                                                                            if (!z2) {
                                                                                                                destination$iv$iv2.add(element$iv$iv2);
                                                                                                            }
                                                                                                            localSoundRepository$import$2$1$1 = localSoundRepository$import$2$1$4;
                                                                                                        } catch (Exception e) {
                                                                                                            e = e;
                                                                                                            destination.delete();
                                                                                                            throw e;
                                                                                                        }
                                                                                                    }
                                                                                                    localSoundRepository3.write(CollectionsKt___CollectionsKt.plus((Collection<? extends LocalSound>) ((Collection<? extends Object>) ((List) destination$iv$iv2)), item));
                                                                                                    try {
                                                                                                        temporary2.delete();
                                                                                                        scheduledFuture.cancel(false);
                                                                                                        return item;
                                                                                                    } catch (Throwable th8) {
                                                                                                        th = th8;
                                                                                                        scheduledFutureSchedule = scheduledFuture;
                                                                                                    }
                                                                                                } catch (Exception e2) {
                                                                                                    e = e2;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            throw th4;
                                                                                        } catch (Throwable th9) {
                                                                                            CloseableKt.closeFinally(fileInputStream, th4);
                                                                                            throw th9;
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th10) {
                                                                                    th4 = th10;
                                                                                }
                                                                            } catch (Throwable th11) {
                                                                                th = th11;
                                                                            }
                                                                        } catch (Throwable th12) {
                                                                            th = th12;
                                                                        }
                                                                    } catch (Throwable th13) {
                                                                        th3 = th13;
                                                                        try {
                                                                            throw th3;
                                                                        } catch (Throwable th14) {
                                                                            CloseableKt.closeFinally(fileOutputStream, th3);
                                                                            throw th14;
                                                                        }
                                                                    }
                                                                } catch (Throwable th15) {
                                                                    th3 = th15;
                                                                }
                                                            } catch (Throwable th16) {
                                                                th = th16;
                                                                activeInput.set(null);
                                                                throw th;
                                                            }
                                                        } catch (Throwable th17) {
                                                            th = th17;
                                                            activeInput.set(null);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th18) {
                                                        $result = $result;
                                                        th2 = th18;
                                                        try {
                                                            throw th2;
                                                        } catch (Throwable th19) {
                                                            CloseableKt.closeFinally(fileInputStreamCreateInputStream, th2);
                                                            throw th19;
                                                        }
                                                    }
                                                } catch (Throwable th20) {
                                                    th2 = th20;
                                                    throw th2;
                                                }
                                            } catch (Throwable th21) {
                                                $result = $result;
                                                th = th21;
                                                try {
                                                    throw th;
                                                } catch (Throwable th22) {
                                                    CloseableKt.closeFinally(assetFileDescriptor, th);
                                                    throw th22;
                                                }
                                            }
                                        } catch (Throwable th23) {
                                            th = th23;
                                            throw th;
                                        }
                                    } catch (Throwable th24) {
                                        th = th24;
                                        scheduledFuture = scheduledFutureSchedule;
                                        temporary2 = temporary;
                                    }
                                } catch (Throwable th25) {
                                    th = th25;
                                    scheduledFuture = scheduledFutureSchedule;
                                    temporary2 = temporary;
                                }
                                try {
                                    temporary2.delete();
                                    throw th;
                                } catch (Throwable th26) {
                                    th = th26;
                                    scheduledFutureSchedule = scheduledFuture;
                                }
                            } else {
                                try {
                                    throw new IllegalArgumentException(("Поддерживаемые форматы: " + CollectionsKt___CollectionsKt.joinToString$default(soundCategory.getFormats(), null, null, null, 0, null, new Function1<String, CharSequence>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.LocalSoundRepository$import$2$1$1$2$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final CharSequence invoke(String it5) {
                                            Intrinsics.checkNotNullParameter(it5, "it");
                                            String upperCase = it5.toUpperCase(Locale.ROOT);
                                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                            return upperCase;
                                        }
                                    }, 31, null)).toString());
                                } catch (Throwable th27) {
                                    th = th27;
                                }
                            }
                            break;
                        } catch (Throwable th28) {
                            try {
                                throw th28;
                            } catch (Throwable th29) {
                                CloseableKt.closeFinally(cursor, th28);
                                throw th29;
                            }
                        }
                    } catch (Throwable th30) {
                        th = th30;
                    }
                } catch (Throwable th31) {
                    th = th31;
                }
                scheduledFutureSchedule.cancel(false);
                throw th;
            case 1:
                localSoundRepository$import$2$1$1 = this;
                temporary2 = (File) localSoundRepository$import$2$1$1.L$3;
                name2 = (String) localSoundRepository$import$2$1$1.L$2;
                scheduledFuture = (ScheduledFuture) localSoundRepository$import$2$1$1.L$1;
                function0 = (Function0) localSoundRepository$import$2$1$1.L$0;
                try {
                    ResultKt.throwOnFailure($result);
                    objValidate = $result;
                    z = true;
                    $result2 = objValidate;
                    info = (SoundInfo) objValidate;
                    function0.invoke();
                    digest = MessageDigest.getInstance("SHA-256");
                    Intrinsics.checkNotNull(temporary2);
                    fileInputStream = new FileInputStream(temporary2);
                    input = fileInputStream;
                    bytes = new byte[8192];
                    while (true) {
                        function0.invoke();
                        n = input.read(bytes);
                        if (n >= 0) {
                            Unit unit9 = Unit.INSTANCE;
                            CloseableKt.closeFinally(fileInputStream, null);
                            byte[] bArrDigest3 = digest.digest();
                            Intrinsics.checkNotNullExpressionValue(bArrDigest3, "digest(...)");
                            id = ArraysKt___ArraysKt.joinToString$default(bArrDigest3, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.LocalSoundRepository$import$2$1$1$id$1
                                public final CharSequence invoke(byte it5) {
                                    String str = String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(it5 & 255)}, 1));
                                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                                    return str;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                                    return invoke(b.byteValue());
                                }
                            }, 30, (Object) null);
                            entries = localSoundRepository$import$2$1$1.this$0.read();
                            Iterable $this$firstOrNull$iv3 = entries;
                            SoundCategory soundCategory10 = localSoundRepository$import$2$1$1.$category;
                            it = $this$firstOrNull$iv3.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    element$iv = it.next();
                                    it3 = (LocalSound) element$iv;
                                    if (Intrinsics.areEqual(it3.getId(), id)) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        obj = element$iv;
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            existing = (LocalSound) obj;
                            if (existing == null) {
                                SoundCategory soundCategory11 = localSoundRepository$import$2$1$1.$category;
                                $this$filterNotTo$iv$iv = name2;
                                destination$iv$iv = new StringBuilder();
                                while (i < $this$filterNotTo$iv$iv.length()) {
                                    element$iv$iv = $this$filterNotTo$iv$iv.charAt(i);
                                    if (!Character.isISOControl(element$iv$iv)) {
                                        destination$iv$iv.append(element$iv$iv);
                                    }
                                }
                                String string5 = ((StringBuilder) destination$iv$iv).toString();
                                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                strTake = StringsKt___StringsKt.take(string5, 160);
                                if (StringsKt__StringsKt.isBlank(strTake)) {
                                    strTake = "Мой звук";
                                }
                                item = new LocalSound(id, soundCategory11, strTake, info, temporary2.length());
                                destination = localSoundRepository$import$2$1$1.this$0.file(item);
                                if (destination.exists()) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                if (!temporary2.renameTo(destination)) {
                                    throw new IllegalStateException("Не удалось сохранить звук".toString());
                                }
                                LocalSoundRepository localSoundRepository4 = localSoundRepository$import$2$1$1.this$0;
                                SoundCategory soundCategory12 = localSoundRepository$import$2$1$1.$category;
                                destination$iv$iv2 = new ArrayList();
                                while (r13.hasNext()) {
                                    it2 = (LocalSound) element$iv$iv2;
                                    LocalSoundRepository$import$2$1$1 localSoundRepository$import$2$1$5 = localSoundRepository$import$2$1$1;
                                    if (Intrinsics.areEqual(it2.getId(), id)) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        destination$iv$iv2.add(element$iv$iv2);
                                    }
                                    localSoundRepository$import$2$1$1 = localSoundRepository$import$2$1$5;
                                }
                                localSoundRepository4.write(CollectionsKt___CollectionsKt.plus((Collection<? extends LocalSound>) ((Collection<? extends Object>) ((List) destination$iv$iv2)), item));
                                temporary2.delete();
                                scheduledFuture.cancel(false);
                                return item;
                                temporary2.delete();
                                throw th;
                            }
                            SoundCategory soundCategory13 = localSoundRepository$import$2$1$1.$category;
                            $this$filterNotTo$iv$iv = name2;
                            destination$iv$iv = new StringBuilder();
                            while (i < $this$filterNotTo$iv$iv.length()) {
                                element$iv$iv = $this$filterNotTo$iv$iv.charAt(i);
                                if (!Character.isISOControl(element$iv$iv)) {
                                    destination$iv$iv.append(element$iv$iv);
                                }
                            }
                            String string6 = ((StringBuilder) destination$iv$iv).toString();
                            Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                            strTake = StringsKt___StringsKt.take(string6, 160);
                            if (StringsKt__StringsKt.isBlank(strTake)) {
                                strTake = "Мой звук";
                            }
                            item = new LocalSound(id, soundCategory13, strTake, info, temporary2.length());
                            destination = localSoundRepository$import$2$1$1.this$0.file(item);
                            if (destination.exists()) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                            if (!temporary2.renameTo(destination)) {
                                throw new IllegalStateException("Не удалось сохранить звук".toString());
                            }
                            LocalSoundRepository localSoundRepository5 = localSoundRepository$import$2$1$1.this$0;
                            SoundCategory soundCategory14 = localSoundRepository$import$2$1$1.$category;
                            destination$iv$iv2 = new ArrayList();
                            while (r13.hasNext()) {
                                it2 = (LocalSound) element$iv$iv2;
                                LocalSoundRepository$import$2$1$1 localSoundRepository$import$2$1$6 = localSoundRepository$import$2$1$1;
                                if (Intrinsics.areEqual(it2.getId(), id)) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                if (!z2) {
                                    destination$iv$iv2.add(element$iv$iv2);
                                }
                                localSoundRepository$import$2$1$1 = localSoundRepository$import$2$1$6;
                            }
                            localSoundRepository5.write(CollectionsKt___CollectionsKt.plus((Collection<? extends LocalSound>) ((Collection<? extends Object>) ((List) destination$iv$iv2)), item));
                            temporary2.delete();
                            scheduledFuture.cancel(false);
                            return item;
                            temporary2.delete();
                            throw th;
                            scheduledFutureSchedule.cancel(false);
                            throw th;
                        }
                        digest.update(bytes, 0, n);
                        throw th4;
                    }
                } catch (Throwable th32) {
                    th = th32;
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3(CoroutineScope $$this$withTimeout, CancellationSignal $cancellation, AtomicReference $activeInput) {
        try {
            Result.Companion companion = Result.INSTANCE;
            $cancellation.cancel();
            Result.m15551constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m15551constructorimpl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            Unit unit = null;
            InputStream inputStream = (InputStream) $activeInput.getAndSet(null);
            if (inputStream != null) {
                inputStream.close();
                unit = Unit.INSTANCE;
            }
            Result.m15551constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m15551constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
