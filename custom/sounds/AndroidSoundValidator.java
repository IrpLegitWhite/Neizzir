package com.blackhub.bronline.neizzir.fragments.custom.sounds;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.common.MimeTypes;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: AndroidSoundValidator.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/AndroidSoundValidator;", "", "()V", "validate", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundInfo;", "file", "Ljava/io/File;", "extension", "", "category", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCategory;", "(Ljava/io/File;Ljava/lang/String;Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class AndroidSoundValidator {
    public static final AndroidSoundValidator INSTANCE = new AndroidSoundValidator();

    private AndroidSoundValidator() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2 */
    public final Object validate(File file, String extension, SoundCategory category, Continuation<? super SoundInfo> continuation) throws Throwable {
        Throwable th;
        int i;
        final CoroutineContext coroutine = continuation.get$context();
        final long deadline = SystemClock.elapsedRealtime() + 10000;
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.AndroidSoundValidator$validate$check$1
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
                    throw new IllegalStateException("Проверка заняла слишком долго. Выберите другой файл".toString());
                }
            }
        };
        SoundInfo info = SoundRules.INSTANCE.inspect(file, extension, category, function0);
        if (Intrinsics.areEqual(extension, "wav")) {
            return info;
        }
        MediaExtractor extractor = new MediaExtractor();
        MediaCodec decoder = null;
        try {
            extractor.setDataSource(file.getAbsolutePath());
            CoroutineContext coroutine2 = null;
            try {
                if (!(extractor.getTrackCount() == 1)) {
                    throw new IllegalArgumentException("Файл должен содержать только один аудиотрек".toString());
                }
                MediaFormat format = extractor.getTrackFormat(0);
                Intrinsics.checkNotNullExpressionValue(format, "getTrackFormat(...)");
                if (!Intrinsics.areEqual(format.getString("mime"), MimeTypes.AUDIO_MPEG)) {
                    throw new IllegalArgumentException("Файл не является MP3".toString());
                }
                extractor.selectTrack(0);
                MediaCodec codec = MediaCodec.createDecoderByType(MimeTypes.AUDIO_MPEG);
                Intrinsics.checkNotNullExpressionValue(codec, "createDecoderByType(...)");
                decoder = codec;
                codec.configure(format, (Surface) null, (MediaCrypto) null, 0);
                codec.start();
                boolean inputEnded = false;
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                boolean outputEnded = false;
                long totalBytes = 0;
                int pcmBytes = 2;
                while (!outputEnded) {
                    function0.invoke();
                    if (inputEnded) {
                        format = format;
                    } else {
                        format = format;
                        try {
                            int index = codec.dequeueInputBuffer(10000L);
                            if (index >= 0) {
                                ByteBuffer input = codec.getInputBuffer(index);
                                if (input == null) {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                                Intrinsics.checkNotNullExpressionValue(input, "requireNotNull(...)");
                                input.clear();
                                int size = extractor.readSampleData(input, 0);
                                if (size < 0) {
                                    codec.queueInputBuffer(index, 0, 0, 0L, 4);
                                    inputEnded = true;
                                } else {
                                    codec.queueInputBuffer(index, 0, size, extractor.getSampleTime(), 0);
                                    extractor.advance();
                                }
                                if (decoder != null) {
                                    MediaCodec it = decoder;
                                    AndroidSoundValidator androidSoundValidator = INSTANCE;
                                    try {
                                        Result.Companion companion = Result.INSTANCE;
                                        it.stop();
                                        Result.m15551constructorimpl(Unit.INSTANCE);
                                    } catch (Throwable th2) {
                                        Result.Companion companion2 = Result.INSTANCE;
                                        Result.m15551constructorimpl(ResultKt.createFailure(th2));
                                    }
                                    it.release();
                                }
                                extractor.release();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    bufferInfo = bufferInfo;
                    int index2 = codec.dequeueOutputBuffer(bufferInfo, 10000L);
                    if (index2 == -2) {
                        MediaFormat output = codec.getOutputFormat();
                        CoroutineContext coroutine3 = coroutine;
                        try {
                            Intrinsics.checkNotNullExpressionValue(output, "getOutputFormat(...)");
                            long deadline2 = deadline;
                            if (!(output.getInteger("sample-rate") == info.getSampleRate() && output.getInteger("channel-count") == info.getChannels())) {
                                throw new IllegalArgumentException("Некорректные параметры декодированного звука".toString());
                            }
                            int encoding = output.containsKey("pcm-encoding") ? output.getInteger("pcm-encoding") : 2;
                            switch (encoding) {
                                case 2:
                                    i = 2;
                                    break;
                                case 3:
                                default:
                                    throw new IllegalStateException("Неподдерживаемые параметры декодирования".toString());
                                case 4:
                                    i = 4;
                                    break;
                            }
                            pcmBytes = i;
                            coroutine = coroutine3;
                            deadline = deadline2;
                            coroutine2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } else {
                        CoroutineContext coroutine4 = coroutine;
                        long deadline3 = deadline;
                        if (index2 >= 0) {
                            try {
                                totalBytes += (long) bufferInfo.size;
                                long j = 1000;
                                if (!(totalBytes <= (((((long) info.getSampleRate()) * ((long) info.getChannels())) * ((long) pcmBytes)) * category.getLimitMs()) / j)) {
                                    throw new IllegalArgumentException(("Звук слишком длинный. Максимум — " + (category.getLimitMs() / j) + " сек").toString());
                                }
                                outputEnded = (bufferInfo.flags & 4) != 0;
                                codec.releaseOutputBuffer(index2, false);
                                coroutine = coroutine4;
                                deadline = deadline3;
                                coroutine2 = null;
                            } catch (Throwable th5) {
                                codec.releaseOutputBuffer(index2, false);
                                throw th5;
                            }
                        } else {
                            coroutine2 = null;
                            coroutine = coroutine4;
                            deadline = deadline3;
                        }
                    }
                }
                if ((totalBytes > 0 ? 1 : coroutine2) == 0) {
                    throw new IllegalArgumentException("Не удалось декодировать звук".toString());
                }
                function0.invoke();
                AndroidSoundValidator androidSoundValidator2 = INSTANCE;
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    decoder.stop();
                    Result.m15551constructorimpl(Unit.INSTANCE);
                } catch (Throwable th6) {
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m15551constructorimpl(ResultKt.createFailure(th6));
                }
                decoder.release();
                extractor.release();
                return info;
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }
}
