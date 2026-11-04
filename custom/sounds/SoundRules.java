package com.blackhub.bronline.neizzir.fragments.custom.sounds;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.extractor.OpusUtil;
import androidx.media3.extractor.p007ts.PsExtractor;
import androidx.work.WorkInfo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.CloseableKt;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import net.lingala.zip4j.util.InternalZipConstants;

/* JADX INFO: compiled from: SoundRules.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J&\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0015J.\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0015J&\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0002J&\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006 "}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundRules;", "", "()V", "CHECK_TIMEOUT_MS", "", "MAX_BYTES", "", "checkDuration", "samples", "rate", "category", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCategory;", "checkParameters", "", "channels", "copyBounded", "input", "Ljava/io/InputStream;", "output", "Ljava/io/OutputStream;", "check", "Lkotlin/Function0;", "inspect", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundInfo;", "file", "Ljava/io/File;", "extension", "", "inspectMp3", "data", "", "inspectWav", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class SoundRules {
    public static final long CHECK_TIMEOUT_MS = 10000;
    public static final SoundRules INSTANCE = new SoundRules();
    public static final int MAX_BYTES = 1048576;

    private SoundRules() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ long copyBounded$default(SoundRules soundRules, InputStream inputStream, OutputStream outputStream, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundRules.copyBounded.1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        return soundRules.copyBounded(inputStream, outputStream, function0);
    }

    public final long copyBounded(InputStream input, OutputStream output, Function0<Unit> check) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(check, "check");
        byte[] buffer = new byte[8192];
        long total = 0;
        while (true) {
            check.invoke();
            int count = input.read(buffer);
            if (count >= 0) {
                total += (long) count;
                if (!(total <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                    throw new IllegalArgumentException("Файл слишком большой. Максимум — 1 МиБ".toString());
                }
                output.write(buffer, 0, count);
            } else {
                if (total > 0) {
                    return total;
                }
                throw new IllegalArgumentException("Файл пуст".toString());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001b  */
    public final void checkParameters(int rate, int channels) {
        boolean z;
        if (8000 <= rate && rate < 48001) {
            z = 1 <= channels && channels < 3;
        }
        if (!z) {
            throw new IllegalArgumentException("Поддерживаются моно/стерео и частота 8–48 кГц".toString());
        }
    }

    public final long checkDuration(long samples, int rate, SoundCategory category) {
        Intrinsics.checkNotNullParameter(category, "category");
        if (!(samples > 0 && rate > 0)) {
            throw new IllegalArgumentException("В файле нет звука".toString());
        }
        long j = 1000;
        if (!(samples * j <= category.getLimitMs() * ((long) rate))) {
            throw new IllegalArgumentException(("Звук слишком длинный. Максимум — " + (category.getLimitMs() / j) + " сек").toString());
        }
        return (((j * samples) + ((long) rate)) - 1) / ((long) rate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SoundInfo inspect$default(SoundRules soundRules, File file, String str, SoundCategory soundCategory, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundRules.inspect.1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        return soundRules.inspect(file, str, soundCategory, function0);
    }

    public final SoundInfo inspect(File file, String extension, SoundCategory category, Function0<Unit> check) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(check, "check");
        if (!category.getFormats().contains(extension)) {
            throw new IllegalArgumentException(("Поддерживаемые форматы: " + CollectionsKt___CollectionsKt.joinToString$default(category.getFormats(), null, null, null, 0, null, new Function1<String, CharSequence>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundRules$inspect$2$1
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    String upperCase = it.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    return upperCase;
                }
            }, 31, null)).toString());
        }
        long length = file.length();
        boolean z = false;
        if (1 <= length && length < 1048577) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Файл пуст или превышает 1 МиБ".toString());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileInputStream input = fileInputStream;
            ByteArrayOutputStream it = new ByteArrayOutputStream();
            INSTANCE.copyBounded(input, it, check);
            byte[] bytes = it.toByteArray();
            CloseableKt.closeFinally(fileInputStream, null);
            boolean zAreEqual = Intrinsics.areEqual(extension, "wav");
            Intrinsics.checkNotNull(bytes);
            return zAreEqual ? inspectWav(bytes, category, check) : inspectMp3(bytes, category, check);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileInputStream, th);
                throw th2;
            }
        }
    }

    private static final String inspectWav$tag(byte[] $data, int at) {
        return new String($data, at, 4, Charsets.US_ASCII);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00e0 A[SYNTHETIC] */
    private final SoundInfo inspectWav(byte[] data, SoundCategory category, Function0<Unit> check) {
        boolean z;
        int channels;
        int rate;
        int rate2;
        boolean z2;
        ByteBuffer b = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        int i = 8;
        boolean z3 = false;
        if (!(data.length >= 44 && Intrinsics.areEqual(inspectWav$tag(data, 0), "RIFF") && Intrinsics.areEqual(inspectWav$tag(data, 8), "WAVE") && inspectWav$u32(b, 4) + ((long) 8) == ((long) data.length))) {
            throw new IllegalArgumentException("Повреждённый WAV-файл".toString());
        }
        int cursor = 12;
        int rate3 = 0;
        int channels2 = 0;
        long pcmBytes = -1;
        while (cursor < rate) {
            check.invoke();
            if (!(cursor + 8 <= data.length ? true : z3)) {
                throw new IllegalArgumentException("Повреждённый WAV-файл".toString());
            }
            long size = inspectWav$u32(b, cursor + 4);
            long end = ((long) cursor) + ((long) i) + size;
            if (!(end <= ((long) data.length) && (size & 1) + end <= ((long) data.length))) {
                throw new IllegalArgumentException("Неполный WAV-файл".toString());
            }
            String strInspectWav$tag = inspectWav$tag(data, cursor);
            if (Intrinsics.areEqual(strInspectWav$tag, "fmt ")) {
                if (rate3 == 0 && size >= 16) {
                    if (inspectWav$u16(b, cursor + 8) == 1 && inspectWav$u16(b, cursor + 22) == 16) {
                        z = true;
                    }
                    if (z) {
                        throw new IllegalArgumentException("Нужен WAV PCM 16-bit".toString());
                    }
                    channels = inspectWav$u16(b, cursor + 10);
                    rate = b.getInt(cursor + 12);
                    checkParameters(rate, channels);
                    if (inspectWav$u16(b, cursor + 20) == channels * 2) {
                        rate2 = rate;
                        z2 = inspectWav$u32(b, cursor + 16) == (((long) rate) * ((long) channels)) * ((long) 2);
                        if (z2) {
                            throw new IllegalArgumentException("Некорректные параметры WAV".toString());
                        }
                        channels2 = channels;
                        rate3 = rate2;
                    } else {
                        rate2 = rate;
                    }
                    if (z2) {
                        throw new IllegalArgumentException("Некорректные параметры WAV".toString());
                    }
                    channels2 = channels;
                    rate3 = rate2;
                }
                z = false;
                if (z) {
                    throw new IllegalArgumentException("Нужен WAV PCM 16-bit".toString());
                }
                channels = inspectWav$u16(b, cursor + 10);
                rate = b.getInt(cursor + 12);
                checkParameters(rate, channels);
                if (inspectWav$u16(b, cursor + 20) == channels * 2) {
                    rate2 = rate;
                    if (inspectWav$u32(b, cursor + 16) == (((long) rate) * ((long) channels)) * ((long) 2)) {
                    }
                    if (z2) {
                        throw new IllegalArgumentException("Некорректные параметры WAV".toString());
                    }
                    channels2 = channels;
                    rate3 = rate2;
                } else {
                    rate2 = rate;
                }
                if (z2) {
                    throw new IllegalArgumentException("Некорректные параметры WAV".toString());
                }
                channels2 = channels;
                rate3 = rate2;
            } else if (Intrinsics.areEqual(strInspectWav$tag, "data")) {
                if (!(pcmBytes == -1)) {
                    throw new IllegalArgumentException("WAV содержит несколько блоков звука".toString());
                }
                pcmBytes = size;
            } else {
                continue;
            }
            cursor = (int) ((size & 1) + end);
            i = 8;
            z3 = false;
        }
        checkParameters(rate3, channels2);
        if (pcmBytes > 0 && pcmBytes % ((long) (channels2 * 2)) == 0) {
            return new SoundInfo("wav", checkDuration(pcmBytes / ((long) (channels2 * 2)), rate3, category), rate3, channels2);
        }
        throw new IllegalArgumentException("Повреждённые данные WAV".toString());
    }

    private static final long inspectWav$u32(ByteBuffer b, int at) {
        return ((long) b.getInt(at)) & InternalZipConstants.ZIP_64_SIZE_LIMIT;
    }

    private static final int inspectWav$u16(ByteBuffer b, int at) {
        return b.getShort(at) & UShort.MAX_VALUE;
    }

    private static final int inspectMp3$byte(byte[] $data, int at) {
        return $data[at] & 255;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0279  */
    /* JADX WARN: Code duplicated, block: B:105:0x027c  */
    /* JADX WARN: Code duplicated, block: B:106:0x027f  */
    /* JADX WARN: Code duplicated, block: B:131:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0137  */
    private final SoundInfo inspectMp3(byte[] data, SoundCategory category, Function0<Unit> check) {
        boolean z;
        int i;
        int[] bitrates;
        boolean z2;
        char c;
        int i2;
        int i3;
        char c2;
        int i4;
        int i5;
        int rate;
        int channels;
        boolean z3;
        int i6;
        boolean z4;
        boolean z5;
        int pos = 0;
        int i7 = 3;
        if (data.length >= 10 && Intrinsics.areEqual(new String(data, 0, 3, Charsets.US_ASCII), "ID3")) {
            int iInspectMp3$byte = inspectMp3$byte(data, 3);
            if (2 <= iInspectMp3$byte && iInspectMp3$byte < 5) {
                Iterable $this$all$iv = new IntRange(6, 9);
                if (!($this$all$iv instanceof Collection) || !((Collection) $this$all$iv).isEmpty()) {
                    Iterator it = $this$all$iv.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z5 = true;
                            break;
                        }
                        int element$iv = ((IntIterator) it).nextInt();
                        if (!(inspectMp3$byte(data, element$iv) < 128)) {
                            z5 = false;
                            break;
                        }
                    }
                } else {
                    z5 = true;
                }
                if (z5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            if (!z4) {
                throw new IllegalArgumentException("Некорректный заголовок MP3".toString());
            }
            int size = (inspectMp3$byte(data, 6) << 21) | (inspectMp3$byte(data, 7) << 14) | (inspectMp3$byte(data, 8) << 7) | inspectMp3$byte(data, 9);
            pos = size + 10 + ((inspectMp3$byte(data, 3) != 4 || (inspectMp3$byte(data, 5) & 16) == 0) ? 0 : 10);
        }
        int end = data.length;
        if (end >= 128 && Intrinsics.areEqual(new String(data, end + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT, 3, Charsets.US_ASCII), "TAG")) {
            end += WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
        }
        int frameBytes = 0;
        int channels2 = 0;
        long samples = 0;
        while (pos < end) {
            check.invoke();
            if (!(pos + 4 <= end && inspectMp3$byte(data, pos) == 255 && (inspectMp3$byte(data, pos + 1) & 224) == 224)) {
                throw new IllegalArgumentException("Повреждённый MP3-файл".toString());
            }
            int version = (inspectMp3$byte(data, pos + 1) >> i7) & i7;
            int layer = (inspectMp3$byte(data, pos + 1) >> 1) & i7;
            int bitrateIndex = inspectMp3$byte(data, pos + 2) >> 4;
            int rateIndex = (inspectMp3$byte(data, pos + 2) >> 2) & i7;
            if (version == 1 || layer != 1) {
                z = false;
            } else {
                if (!(1 <= bitrateIndex && bitrateIndex < 15) || rateIndex >= i7) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (!z) {
                throw new IllegalArgumentException("Нужен стандартный MP3 (MPEG Layer III)".toString());
            }
            int i8 = new int[]{44100, OpusUtil.SAMPLE_RATE, 32000}[rateIndex];
            switch (version) {
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 1;
                    break;
                default:
                    i = 4;
                    break;
            }
            int rate2 = i8 / i;
            int channelCount = (inspectMp3$byte(data, pos + 3) >> 6) == 3 ? 1 : 2;
            if (version == 3) {
                bitrates = new int[]{0, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 320};
                z2 = false;
                c = '\b';
                i5 = 14;
                c2 = '\t';
                i4 = 128;
                i2 = 6;
                i3 = 7;
            } else {
                z2 = false;
                c = '\b';
                i2 = 6;
                i3 = 7;
                c2 = '\t';
                i4 = 128;
                i5 = 14;
                bitrates = new int[]{0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};
            }
            int bitrate = bitrates[bitrateIndex];
            checkParameters(rate2, channelCount);
            if (!((frameBytes == 0 || (frameBytes == rate2 && channels2 == channelCount)) ? true : z2)) {
                throw new IllegalArgumentException("Параметры MP3 меняются внутри файла".toString());
            }
            int channels3 = channelCount;
            int frameBytes2 = (((version == 3 ? 144000 : 72000) * bitrate) / rate2) + ((inspectMp3$byte(data, pos + 2) >> 1) & 1);
            if (frameBytes2 >= 4) {
                rate = rate2;
                channels = channels3;
                if (((long) pos) + ((long) frameBytes2) <= end) {
                    z3 = true;
                }
                if (z3) {
                    throw new IllegalArgumentException("Неполный MP3-файл".toString());
                }
                if (version == 3) {
                    i6 = 1152;
                } else {
                    i6 = 576;
                }
                samples += (long) i6;
                checkDuration(samples, rate, category);
                pos += frameBytes2;
                i7 = 3;
                frameBytes = rate2;
                channels2 = channels;
            } else {
                rate = rate2;
                channels = channels3;
            }
            z3 = z2;
            if (z3) {
                throw new IllegalArgumentException("Неполный MP3-файл".toString());
            }
            if (version == 3) {
                i6 = 1152;
            } else {
                i6 = 576;
            }
            samples += (long) i6;
            checkDuration(samples, rate, category);
            pos += frameBytes2;
            i7 = 3;
            frameBytes = rate2;
            channels2 = channels;
        }
        if (pos == end) {
            return new SoundInfo("mp3", checkDuration(samples, frameBytes, category), frameBytes, channels2);
        }
        throw new IllegalArgumentException("Повреждённый MP3-файл".toString());
    }
}
