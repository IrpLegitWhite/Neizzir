package com.blackhub.bronline.neizzir.fragments.custom.map;

import android.content.Context;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.blackhub.bronline.game.core.constants.ScreenId;
import com.blackhub.bronline.neizzir.converter.BtxPngConverter;
import com.google.common.base.Ascii;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.helpshift.HelpshiftEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.p043io.files.FileSystemKt;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.util.InternalZipConstants;

/* JADX INFO: compiled from: MapRecolorer.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 32\u00020\u0001:\u0003345B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J<\u0010\u0005\u001a\u00020\u00062\"\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\tH\u0002J<\u0010\r\u001a\u00020\u00062\"\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J,\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\f\u001a\u00020\tH\u0002J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\tH\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00182\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0002J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\tH\u0002J\u001a\u0010\u001c\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u0016H\u0002J\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001f\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0016H\u0002J%\u0010#\u001a\u00020$2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&Jp\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00162$\b\u0002\u0010,\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060.\u0012\u0006\u0012\u0004\u0018\u00010\u00010-2*\b\u0002\u0010/\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060.\u0012\u0006\u0012\u0004\u0018\u00010\u000100H\u0086@¢\u0006\u0002\u00101J\u0010\u00102\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00066"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/map/MapRecolorer;", "", "mapBaseName", "", "(Ljava/lang/String;)V", "addCandidate", "", "out", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", Constants.ScionAnalytics.PARAM_LABEL, "bytes", "addEmbeddedCandidates", "source", "prefix", "buildDecodeCandidates", "decodeRadarBtxToPng", "name", "extractKtx1ExactSlice", "data", TypedValues.CycleType.S_WAVE_OFFSET, "", "findAllSignatures", "", "sig", "hasSignatureAt", "", "hexHead", "limit", "parseRadarIndex", HelpshiftEvent.DATA_FILE_NAME, "(Ljava/lang/String;)Ljava/lang/Integer;", "radarName", FirebaseAnalytics.Param.INDEX, "readUInt32LE", "Lkotlin/UInt;", "readUInt32LE-xfHcF5w", "([BI)I", "recolor", "Lcom/blackhub/bronline/neizzir/fragments/custom/map/MapRecolorer$Result;", "context", "Landroid/content/Context;", "color", "onTitle", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "onStep", "Lkotlin/Function3;", "(Landroid/content/Context;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toHexRRGGBB", "Companion", "RadarEntry", "Result", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class MapRecolorer {
    private static final byte[] KTX1_SIG = {-85, 75, 84, 88, 32, 49, 49, -69, Ascii.f1066CR, 10, Ascii.SUB, 10};
    private static final byte[] KTX2_SIG = {-85, 75, 84, 88, 32, 50, 48, -69, Ascii.f1066CR, 10, Ascii.SUB, 10};
    private static final byte[] PNG_SIG = {-119, 80, 78, 71, Ascii.f1066CR, 10, Ascii.SUB, 10};
    private static final String TAG = "MapRecolorer";
    private final String mapBaseName;

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.map.MapRecolorer$recolor$1 */
    /* JADX INFO: compiled from: MapRecolorer.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.map.MapRecolorer", m4426f = "MapRecolorer.kt", m4427i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4}, m4428l = {32, 37, ScreenId.SCREEN_CATCH_STREAMER, 70, ScreenId.SCREEN_AUTH}, m4429m = "recolor", m4430n = {"this", "context", "onTitle", "onStep", "sourceBpc", "color", "this", "context", "onTitle", "onStep", "sourceBpc", "staged", "color", "this", "context", "onTitle", "onStep", "staged", "sourceZip", "done", "failed", "entry", "color", "total", "this", "context", "onTitle", "onStep", "staged", "sourceZip", "done", "failed", "sourceBytes", "outName", "color", "total", "staged", "done"}, m4431s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "L$8", "L$10", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "L$8", "L$10", "L$11", "I$0", "I$1", "L$0", "L$2"})
    static final class C53851 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        C53851(Continuation<? super C53851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MapRecolorer.this.recolor(null, 0, null, null, this);
        }
    }

    public MapRecolorer() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public MapRecolorer(String mapBaseName) {
        Intrinsics.checkNotNullParameter(mapBaseName, "mapBaseName");
        this.mapBaseName = mapBaseName;
    }

    public /* synthetic */ MapRecolorer(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "radarmap" : str);
    }

    /* JADX INFO: compiled from: MapRecolorer.kt */
    @Metadata(m4415d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/map/MapRecolorer$Result;", "", "processedCount", "", "(I)V", "getProcessedCount", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final /* data */ class Result {
        private final int processedCount;

        public static /* synthetic */ Result copy$default(Result result, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = result.processedCount;
            }
            return result.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getProcessedCount() {
            return this.processedCount;
        }

        public final Result copy(int processedCount) {
            return new Result(processedCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && this.processedCount == ((Result) other).processedCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.processedCount);
        }

        public String toString() {
            return "Result(processedCount=" + this.processedCount + ')';
        }

        public Result(int processedCount) {
            this.processedCount = processedCount;
        }

        public final int getProcessedCount() {
            return this.processedCount;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object recolor$default(MapRecolorer mapRecolorer, Context context, int i, Function2 function2, Function3 function3, Continuation continuation, int i2, Object obj) {
        Function2 c53862;
        Function3 c53873;
        if ((i2 & 4) == 0) {
            c53862 = function2;
        } else {
            c53862 = new C53862(null);
        }
        if ((i2 & 8) == 0) {
            c53873 = function3;
        } else {
            c53873 = new C53873(null);
        }
        return mapRecolorer.recolor(context, i, c53862, c53873, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x03c6 A[Catch: all -> 0x0548, TRY_LEAVE, TryCatch #5 {all -> 0x0548, blocks: (B:87:0x0355, B:90:0x0375, B:101:0x03c0, B:103:0x03c6, B:100:0x03b6, B:132:0x0544, B:133:0x0547, B:129:0x0541, B:88:0x0362), top: B:205:0x0355, inners: #1, #18 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0418 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:107:0x0419  */
    /* JADX WARN: Code duplicated, block: B:109:0x044e  */
    /* JADX WARN: Code duplicated, block: B:113:0x047d A[Catch: all -> 0x0530, TRY_LEAVE, TryCatch #8 {all -> 0x0530, blocks: (B:111:0x0477, B:113:0x047d), top: B:211:0x0477 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x050a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x02df A[Catch: all -> 0x063f, TRY_LEAVE, TryCatch #19 {all -> 0x063f, blocks: (B:78:0x02d9, B:80:0x02df), top: B:231:0x02d9 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x033b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x033c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0419 -> B:108:0x0435). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x044e -> B:211:0x0477). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object recolor(android.content.Context r28, int r29, kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r30, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r31, kotlin.coroutines.Continuation<? super com.blackhub.bronline.neizzir.fragments.custom.map.MapRecolorer.Result> r32) {
        /*
            Method dump skipped, instruction units count: 1714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.custom.map.MapRecolorer.recolor(android.content.Context, int, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.map.MapRecolorer$recolor$2 */
    /* JADX INFO: compiled from: MapRecolorer.kt */
    @Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "it", ""}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.map.MapRecolorer$recolor$2", m4426f = "MapRecolorer.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C53862 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        int label;

        C53862(Continuation<? super C53862> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C53862(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C53862) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.map.MapRecolorer$recolor$3 */
    /* JADX INFO: compiled from: MapRecolorer.kt */
    @Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.map.MapRecolorer$recolor$3", m4426f = "MapRecolorer.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C53873 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super Unit>, Object> {
        int label;

        C53873(Continuation<? super C53873> continuation) {
            super(3, continuation);
        }

        public final Object invoke(int i, int i2, Continuation<? super Unit> continuation) {
            return new C53873(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Integer num2, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), num2.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: MapRecolorer.kt */
    @Metadata(m4415d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/map/MapRecolorer$RadarEntry;", "", "header", "Lnet/lingala/zip4j/model/FileHeader;", FirebaseAnalytics.Param.INDEX, "", "(Lnet/lingala/zip4j/model/FileHeader;I)V", "getHeader", "()Lnet/lingala/zip4j/model/FileHeader;", "getIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    static final /* data */ class RadarEntry {
        private final FileHeader header;
        private final int index;

        public static /* synthetic */ RadarEntry copy$default(RadarEntry radarEntry, FileHeader fileHeader, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                fileHeader = radarEntry.header;
            }
            if ((i2 & 2) != 0) {
                i = radarEntry.index;
            }
            return radarEntry.copy(fileHeader, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FileHeader getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final RadarEntry copy(FileHeader header, int index) {
            Intrinsics.checkNotNullParameter(header, "header");
            return new RadarEntry(header, index);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RadarEntry)) {
                return false;
            }
            RadarEntry radarEntry = (RadarEntry) other;
            return Intrinsics.areEqual(this.header, radarEntry.header) && this.index == radarEntry.index;
        }

        public int hashCode() {
            return (this.header.hashCode() * 31) + Integer.hashCode(this.index);
        }

        public String toString() {
            return "RadarEntry(header=" + this.header + ", index=" + this.index + ')';
        }

        public RadarEntry(FileHeader header, int index) {
            Intrinsics.checkNotNullParameter(header, "header");
            this.header = header;
            this.index = index;
        }

        public final FileHeader getHeader() {
            return this.header;
        }

        public final int getIndex() {
            return this.index;
        }
    }

    private final Integer parseRadarIndex(String fileName) {
        String base = StringsKt__StringsKt.substringAfterLast$default(fileName, FileSystemKt.UnixPathSeparator, (String) null, 2, (Object) null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(base, "toLowerCase(...)");
        MatchResult m = Regex.find$default(new Regex("^radar(\\d{2,3})\\.btx$"), base, 0, 2, null);
        if (m == null) {
            return null;
        }
        return StringsKt__StringNumberConversionsKt.toIntOrNull(m.getGroupValues().get(1));
    }

    private final byte[] decodeRadarBtxToPng(String name, byte[] bytes) {
        Throwable lastError = null;
        Iterator<Map.Entry<String, byte[]>> it = buildDecodeCandidates(bytes).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, byte[]> next = it.next();
            String label = next.getKey();
            byte[] candidate = next.getValue();
            try {
                return BtxPngConverter.INSTANCE.btxToPng(candidate);
            } catch (Throwable e) {
                lastError = e;
                Log.w(TAG, "Decode attempt failed for " + name + " via " + label + ": " + e.getMessage());
            }
        }
        throw new IllegalStateException("decode failed for " + name, lastError);
    }

    private final LinkedHashMap<String, byte[]> buildDecodeCandidates(byte[] bytes) {
        LinkedHashMap<String, byte[]> linkedHashMap = new LinkedHashMap<>();
        addEmbeddedCandidates(linkedHashMap, bytes, "raw");
        if (bytes.length > 4) {
            addEmbeddedCandidates(linkedHashMap, ArraysKt___ArraysJvmKt.copyOfRange(bytes, 4, bytes.length), "skip4");
        }
        addCandidate(linkedHashMap, "raw", bytes);
        if (bytes.length > 4) {
            addCandidate(linkedHashMap, "skip4", ArraysKt___ArraysJvmKt.copyOfRange(bytes, 4, bytes.length));
        }
        return linkedHashMap;
    }

    private final void addEmbeddedCandidates(LinkedHashMap<String, byte[]> out, byte[] source, String prefix) {
        Iterator<Integer> it = findAllSignatures(source, KTX1_SIG).iterator();
        while (it.hasNext()) {
            int off = it.next().intValue();
            byte[] exact = extractKtx1ExactSlice(source, off);
            if (exact != null) {
                addCandidate(out, prefix + ":ktx1Exact@" + off, exact);
            }
            if (off > 0 && off < source.length) {
                addCandidate(out, prefix + ":ktx1@" + off, ArraysKt___ArraysJvmKt.copyOfRange(source, off, source.length));
            }
        }
        Iterator<Integer> it2 = findAllSignatures(source, KTX2_SIG).iterator();
        while (it2.hasNext()) {
            int off2 = it2.next().intValue();
            if (off2 > 0 && off2 < source.length) {
                addCandidate(out, prefix + ":ktx2@" + off2, ArraysKt___ArraysJvmKt.copyOfRange(source, off2, source.length));
            }
        }
        Iterator<Integer> it3 = findAllSignatures(source, PNG_SIG).iterator();
        while (it3.hasNext()) {
            int off3 = it3.next().intValue();
            if (off3 > 0 && off3 < source.length) {
                addCandidate(out, prefix + ":png@" + off3, ArraysKt___ArraysJvmKt.copyOfRange(source, off3, source.length));
            }
        }
    }

    private final void addCandidate(LinkedHashMap<String, byte[]> out, String label, byte[] bytes) {
        byte[] existing;
        boolean z = true;
        if (bytes.length == 0) {
            return;
        }
        Iterable iterableValues = out.values();
        Intrinsics.checkNotNullExpressionValue(iterableValues, "<get-values>(...)");
        Iterable $this$any$iv = iterableValues;
        if (!((Collection) $this$any$iv).isEmpty()) {
            Iterator it = $this$any$iv.iterator();
            do {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else {
                    Object element$iv = it.next();
                    existing = (byte[]) element$iv;
                }
            } while (!Arrays.equals(existing, bytes));
        } else {
            z = false;
        }
        boolean alreadyExists = z;
        if (!alreadyExists) {
            out.put(label, bytes);
        }
    }

    private final List<Integer> findAllSignatures(byte[] data, byte[] sig) {
        if (data.length < sig.length) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList result = new ArrayList();
        int max = data.length - sig.length;
        int i = 0;
        while (i <= max) {
            boolean ok = true;
            int length = sig.length;
            for (int j = 0; j < length; j++) {
                if (data[i + j] != sig[j]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                result.add(Integer.valueOf(i));
                i += sig.length;
            } else {
                i++;
            }
        }
        return result;
    }

    private final boolean hasSignatureAt(byte[] data, int offset, byte[] sig) {
        if (offset < 0 || sig.length + offset > data.length) {
            return false;
        }
        int length = sig.length;
        for (int i = 0; i < length; i++) {
            if (data[offset + i] != sig[i]) {
                return false;
            }
        }
        return true;
    }

    private final byte[] extractKtx1ExactSlice(byte[] data, int offset) {
        int faces;
        MapRecolorer mapRecolorer = this;
        if (!mapRecolorer.hasSignatureAt(data, offset, KTX1_SIG) || offset + 64 > data.length) {
            return null;
        }
        int levelsRaw = mapRecolorer.m14874readUInt32LExfHcF5w(data, offset + 56);
        int levels = levelsRaw <= 0 ? 1 : levelsRaw;
        int facesRaw = mapRecolorer.m14874readUInt32LExfHcF5w(data, offset + 52);
        int faces2 = facesRaw > 0 ? facesRaw : 1;
        long keyValueBytes = ((long) mapRecolorer.m14874readUInt32LExfHcF5w(data, offset + 60)) & InternalZipConstants.ZIP_64_SIZE_LIMIT;
        long cursor = ((long) offset) + 64 + keyValueBytes;
        if (cursor > data.length) {
            return null;
        }
        int i = 0;
        while (i < levels) {
            long j = 4;
            int faces3 = faces2;
            if (cursor + j > data.length) {
                return null;
            }
            long imageSize = ((long) mapRecolorer.m14874readUInt32LExfHcF5w(data, (int) cursor)) & InternalZipConstants.ZIP_64_SIZE_LIMIT;
            cursor += j;
            int i2 = 0;
            while (true) {
                faces = faces3;
                if (i2 < faces) {
                    int levels2 = levels;
                    int facesRaw2 = facesRaw;
                    if (cursor + imageSize > data.length) {
                        return null;
                    }
                    long cursor2 = cursor + imageSize;
                    long facePadding = (4 - (imageSize % 4)) % 4;
                    int levelsRaw2 = levelsRaw;
                    long imageSize2 = imageSize;
                    if (cursor2 + facePadding > data.length) {
                        return null;
                    }
                    cursor = cursor2 + facePadding;
                    i2++;
                    faces3 = faces;
                    levels = levels2;
                    facesRaw = facesRaw2;
                    levelsRaw = levelsRaw2;
                    imageSize = imageSize2;
                }
            }
            i++;
            mapRecolorer = this;
            faces2 = faces;
        }
        int end = (int) cursor;
        if (end <= offset || end > data.length) {
            return null;
        }
        return ArraysKt___ArraysJvmKt.copyOfRange(data, offset, end);
    }

    /* JADX INFO: renamed from: readUInt32LE-xfHcF5w, reason: not valid java name */
    private final int m14874readUInt32LExfHcF5w(byte[] data, int offset) {
        int b0 = UInt.m15646constructorimpl(UInt.m15646constructorimpl(data[offset]) & 255);
        int b1 = UInt.m15646constructorimpl(UInt.m15646constructorimpl(data[offset + 1]) & 255);
        int b2 = UInt.m15646constructorimpl(UInt.m15646constructorimpl(data[offset + 2]) & 255);
        int b3 = UInt.m15646constructorimpl(UInt.m15646constructorimpl(data[offset + 3]) & 255);
        return UInt.m15646constructorimpl(UInt.m15646constructorimpl(UInt.m15646constructorimpl(UInt.m15646constructorimpl(b1 << 8) | b0) | UInt.m15646constructorimpl(b2 << 16)) | UInt.m15646constructorimpl(b3 << 24));
    }

    static /* synthetic */ String hexHead$default(MapRecolorer mapRecolorer, byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 16;
        }
        return mapRecolorer.hexHead(bArr, i);
    }

    private final String hexHead(byte[] bytes, int limit) {
        if (bytes.length == 0) {
            return "<empty>";
        }
        int n = Math.min(limit, bytes.length);
        StringBuilder $this$hexHead_u24lambda_u2414 = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%02X", Arrays.copyOf(new Object[]{Integer.valueOf(bytes[i] & 255)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            $this$hexHead_u24lambda_u2414.append(str);
            if (i + 1 < n) {
                $this$hexHead_u24lambda_u2414.append(' ');
            }
        }
        String string = $this$hexHead_u24lambda_u2414.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final String radarName(int index) {
        if (index < 100) {
            return "radar" + StringsKt__StringsKt.padStart(String.valueOf(index), 2, '0') + ".btx";
        }
        return "radar" + index + ".btx";
    }

    private final String toHexRRGGBB(int color) {
        int rgb = 16777215 & color;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(rgb)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
