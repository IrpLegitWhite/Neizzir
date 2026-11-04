package com.blackhub.bronline.neizzir.fragments.custom.adapters;

import com.blackhub.bronline.neizzir.network.CachePolicy;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.EndpointRouter;
import com.blackhub.bronline.neizzir.network.NetworkResult;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ModelsAdapter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.adapters.ModelsAdapter$VH$loadInfoJson$job$1", m4426f = "ModelsAdapter.kt", m4427i = {}, m4428l = {113}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class ModelsAdapter$VH$loadInfoJson$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $modelId;
    int label;
    final /* synthetic */ ModelsAdapter this$0;
    final /* synthetic */ ModelsAdapter.C5306VH this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModelsAdapter$VH$loadInfoJson$job$1(String str, ModelsAdapter modelsAdapter, ModelsAdapter.C5306VH c5306vh, Continuation<? super ModelsAdapter$VH$loadInfoJson$job$1> continuation) {
        super(2, continuation);
        this.$modelId = str;
        this.this$0 = modelsAdapter;
        this.this$1 = c5306vh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModelsAdapter$VH$loadInfoJson$job$1(this.$modelId, this.this$0, this.this$1, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModelsAdapter$VH$loadInfoJson$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0088 A[Catch: all -> 0x00e3, TryCatch #0 {all -> 0x00e3, blocks: (B:16:0x0081, B:18:0x0088, B:21:0x008f, B:23:0x0098, B:27:0x00ad, B:29:0x00b7, B:30:0x00c4), top: B:39:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b7 A[Catch: all -> 0x00e3, TryCatch #0 {all -> 0x00e3, blocks: (B:16:0x0081, B:18:0x0088, B:21:0x008f, B:23:0x0098, B:27:0x00ad, B:29:0x00b7, B:30:0x00c4), top: B:39:0x0081 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) throws Throwable {
        ModelsAdapter$VH$loadInfoJson$job$1 modelsAdapter$VH$loadInfoJson$job$1;
        Throwable th;
        ModelsAdapter$VH$loadInfoJson$job$1 modelsAdapter$VH$loadInfoJson$job$2;
        NetworkResult result;
        String description;
        NetworkResult.Success success;
        final String parsed;
        byte[] it;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                modelsAdapter$VH$loadInfoJson$job$1 = this;
                try {
                    EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                    String str = "/api/fetch_file/models/" + modelsAdapter$VH$loadInfoJson$job$1.$modelId + "/info.json";
                    CachePolicy.LastKnownGood lastKnownGood = new CachePolicy.LastKnownGood("models-info:" + modelsAdapter$VH$loadInfoJson$job$1.$modelId, 60000L);
                    final ModelsAdapter.C5306VH c5306vh = modelsAdapter$VH$loadInfoJson$job$1.this$1;
                    Function1<byte[], Boolean> function1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ModelsAdapter$VH$loadInfoJson$job$1$result$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(byte[] it2) {
                            Intrinsics.checkNotNullParameter(it2, "it");
                            return Boolean.valueOf(!StringsKt__StringsKt.isBlank(c5306vh.parseDescription(new String(it2, Charsets.UTF_8))));
                        }
                    };
                    modelsAdapter$VH$loadInfoJson$job$1.label = 1;
                    Object bytes = router.getBytes(endpointGroup, str, (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : lastKnownGood, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? EndpointRouter.C56582.INSTANCE : function1, modelsAdapter$VH$loadInfoJson$job$1);
                    if (bytes == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = bytes;
                    try {
                        result = (NetworkResult) $result;
                        description = null;
                        if (result instanceof NetworkResult.Success) {
                            success = (NetworkResult.Success) result;
                        } else {
                            success = null;
                        }
                        if (success != null && (it = (byte[]) success.getValue()) != null) {
                            description = modelsAdapter$VH$loadInfoJson$job$1.this$1.parseDescription(new String(it, Charsets.UTF_8));
                        }
                        if (description == null) {
                            description = "";
                        }
                        parsed = description;
                        if (!StringsKt__StringsKt.isBlank(parsed)) {
                            modelsAdapter$VH$loadInfoJson$job$1.this$0.descCache.put(modelsAdapter$VH$loadInfoJson$job$1.$modelId, parsed);
                        }
                        ModelsAdapter.C5306VH c5306vh2 = modelsAdapter$VH$loadInfoJson$job$1.this$1;
                        final ModelsAdapter.C5306VH c5306vh3 = modelsAdapter$VH$loadInfoJson$job$1.this$1;
                        final String str2 = modelsAdapter$VH$loadInfoJson$job$1.$modelId;
                        c5306vh2.postToMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ModelsAdapter$VH$loadInfoJson$job$1.1
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
                                if (c5306vh3.isCurrent(str2)) {
                                    c5306vh3.desc.setText(parsed);
                                }
                            }
                        });
                        modelsAdapter$VH$loadInfoJson$job$1.this$0.descLoads.remove(modelsAdapter$VH$loadInfoJson$job$1.$modelId);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        ModelsAdapter$VH$loadInfoJson$job$1 modelsAdapter$VH$loadInfoJson$job$3 = modelsAdapter$VH$loadInfoJson$job$1;
                        th = th2;
                        modelsAdapter$VH$loadInfoJson$job$2 = modelsAdapter$VH$loadInfoJson$job$3;
                        modelsAdapter$VH$loadInfoJson$job$2.this$0.descLoads.remove(modelsAdapter$VH$loadInfoJson$job$2.$modelId);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    modelsAdapter$VH$loadInfoJson$job$2 = modelsAdapter$VH$loadInfoJson$job$1;
                    modelsAdapter$VH$loadInfoJson$job$2.this$0.descLoads.remove(modelsAdapter$VH$loadInfoJson$job$2.$modelId);
                    throw th;
                }
            case 1:
                modelsAdapter$VH$loadInfoJson$job$2 = this;
                try {
                    ResultKt.throwOnFailure($result);
                    modelsAdapter$VH$loadInfoJson$job$1 = modelsAdapter$VH$loadInfoJson$job$2;
                    result = (NetworkResult) $result;
                    description = null;
                    if (result instanceof NetworkResult.Success) {
                        success = (NetworkResult.Success) result;
                    } else {
                        success = null;
                    }
                    if (success != null) {
                        description = modelsAdapter$VH$loadInfoJson$job$1.this$1.parseDescription(new String(it, Charsets.UTF_8));
                    }
                    if (description == null) {
                        description = "";
                    }
                    parsed = description;
                    if (!StringsKt__StringsKt.isBlank(parsed)) {
                        modelsAdapter$VH$loadInfoJson$job$1.this$0.descCache.put(modelsAdapter$VH$loadInfoJson$job$1.$modelId, parsed);
                    }
                    ModelsAdapter.C5306VH c5306vh4 = modelsAdapter$VH$loadInfoJson$job$1.this$1;
                    final ModelsAdapter.C5306VH c5306vh5 = modelsAdapter$VH$loadInfoJson$job$1.this$1;
                    final String str3 = modelsAdapter$VH$loadInfoJson$job$1.$modelId;
                    c5306vh4.postToMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ModelsAdapter$VH$loadInfoJson$job$1.1
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
                            if (c5306vh5.isCurrent(str3)) {
                                c5306vh5.desc.setText(parsed);
                            }
                        }
                    });
                    modelsAdapter$VH$loadInfoJson$job$1.this$0.descLoads.remove(modelsAdapter$VH$loadInfoJson$job$1.$modelId);
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    th = th4;
                    modelsAdapter$VH$loadInfoJson$job$2.this$0.descLoads.remove(modelsAdapter$VH$loadInfoJson$job$2.$modelId);
                    throw th;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
