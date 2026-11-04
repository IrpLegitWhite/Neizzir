package com.blackhub.bronline.neizzir.fragments.custom.btx;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BtxConverter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.btx.BtxConverter$convertInputs$1$result$1", m4426f = "BtxConverter.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class BtxConverter$convertInputs$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ HashMap<BtxConverter.InputRef, byte[]> $inputBytesCache;
    final /* synthetic */ BtxConverter.InputRef $ref;
    final /* synthetic */ HashMap<String, byte[]> $templatesByBase;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BtxConverter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BtxConverter$convertInputs$1$result$1(BtxConverter btxConverter, BtxConverter.InputRef inputRef, HashMap<BtxConverter.InputRef, byte[]> map, HashMap<String, byte[]> map2, Continuation<? super BtxConverter$convertInputs$1$result$1> continuation) {
        super(2, continuation);
        this.this$0 = btxConverter;
        this.$ref = inputRef;
        this.$inputBytesCache = map;
        this.$templatesByBase = map2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BtxConverter$convertInputs$1$result$1 btxConverter$convertInputs$1$result$1 = new BtxConverter$convertInputs$1$result$1(this.this$0, this.$ref, this.$inputBytesCache, this.$templatesByBase, continuation);
        btxConverter$convertInputs$1$result$1.L$0 = obj;
        return btxConverter$convertInputs$1$result$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((BtxConverter$convertInputs$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM15551constructorimpl;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                BtxConverter btxConverter = this.this$0;
                BtxConverter.InputRef inputRef = this.$ref;
                HashMap<BtxConverter.InputRef, byte[]> map = this.$inputBytesCache;
                HashMap<String, byte[]> map2 = this.$templatesByBase;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    btxConverter.convertSingle(inputRef, map, map2);
                    objM15551constructorimpl = Result.m15551constructorimpl(Unit.INSTANCE);
                    break;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                }
                return Result.m15550boximpl(objM15551constructorimpl);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
