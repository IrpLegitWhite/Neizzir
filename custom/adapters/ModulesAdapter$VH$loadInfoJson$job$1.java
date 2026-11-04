package com.blackhub.bronline.neizzir.fragments.custom.adapters;

import android.view.View;
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

/* JADX INFO: compiled from: ModulesAdapter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.adapters.ModulesAdapter$VH$loadInfoJson$job$1", m4426f = "ModulesAdapter.kt", m4427i = {}, m4428l = {181}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class ModulesAdapter$VH$loadInfoJson$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $moduleId;
    int label;
    final /* synthetic */ ModulesAdapter this$0;
    final /* synthetic */ ModulesAdapter.C5309VH this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModulesAdapter$VH$loadInfoJson$job$1(String str, ModulesAdapter modulesAdapter, ModulesAdapter.C5309VH c5309vh, Continuation<? super ModulesAdapter$VH$loadInfoJson$job$1> continuation) {
        super(2, continuation);
        this.$moduleId = str;
        this.this$0 = modulesAdapter;
        this.this$1 = c5309vh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModulesAdapter$VH$loadInfoJson$job$1(this.$moduleId, this.this$0, this.this$1, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModulesAdapter$VH$loadInfoJson$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0088 A[Catch: all -> 0x00e3, TryCatch #0 {all -> 0x00e3, blocks: (B:16:0x0081, B:18:0x0088, B:21:0x008f, B:23:0x0098, B:27:0x00ad, B:29:0x00b7, B:30:0x00c4), top: B:39:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b7 A[Catch: all -> 0x00e3, TryCatch #0 {all -> 0x00e3, blocks: (B:16:0x0081, B:18:0x0088, B:21:0x008f, B:23:0x0098, B:27:0x00ad, B:29:0x00b7, B:30:0x00c4), top: B:39:0x0081 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) throws Throwable {
        ModulesAdapter$VH$loadInfoJson$job$1 modulesAdapter$VH$loadInfoJson$job$1;
        Throwable th;
        ModulesAdapter$VH$loadInfoJson$job$1 modulesAdapter$VH$loadInfoJson$job$2;
        NetworkResult result;
        String description;
        NetworkResult.Success success;
        final String parsed;
        byte[] it;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                modulesAdapter$VH$loadInfoJson$job$1 = this;
                try {
                    EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                    String str = "/api/fetch_file/modules/" + modulesAdapter$VH$loadInfoJson$job$1.$moduleId + "/info.json";
                    CachePolicy.LastKnownGood lastKnownGood = new CachePolicy.LastKnownGood("modules-info:" + modulesAdapter$VH$loadInfoJson$job$1.$moduleId, 60000L);
                    final ModulesAdapter.C5309VH c5309vh = modulesAdapter$VH$loadInfoJson$job$1.this$1;
                    Function1<byte[], Boolean> function1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ModulesAdapter$VH$loadInfoJson$job$1$result$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(byte[] it2) {
                            Intrinsics.checkNotNullParameter(it2, "it");
                            return Boolean.valueOf(!StringsKt__StringsKt.isBlank(c5309vh.parseDescription(new String(it2, Charsets.UTF_8))));
                        }
                    };
                    modulesAdapter$VH$loadInfoJson$job$1.label = 1;
                    Object bytes = router.getBytes(endpointGroup, str, (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : lastKnownGood, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? EndpointRouter.C56582.INSTANCE : function1, modulesAdapter$VH$loadInfoJson$job$1);
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
                            description = modulesAdapter$VH$loadInfoJson$job$1.this$1.parseDescription(new String(it, Charsets.UTF_8));
                        }
                        if (description == null) {
                            description = "";
                        }
                        parsed = description;
                        if (!StringsKt__StringsKt.isBlank(parsed)) {
                            modulesAdapter$VH$loadInfoJson$job$1.this$0.descCache.put(modulesAdapter$VH$loadInfoJson$job$1.$moduleId, parsed);
                        }
                        ModulesAdapter.C5309VH c5309vh2 = modulesAdapter$VH$loadInfoJson$job$1.this$1;
                        final ModulesAdapter.C5309VH c5309vh3 = modulesAdapter$VH$loadInfoJson$job$1.this$1;
                        final String str2 = modulesAdapter$VH$loadInfoJson$job$1.$moduleId;
                        c5309vh2.postToMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ModulesAdapter$VH$loadInfoJson$job$1.1
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
                                if (c5309vh3.isCurrent(str2)) {
                                    c5309vh3.desc.setText(parsed);
                                    View $this$isVisible$iv = c5309vh3.desc;
                                    boolean value$iv = !StringsKt__StringsKt.isBlank(parsed);
                                    $this$isVisible$iv.setVisibility(value$iv ? 0 : 8);
                                }
                            }
                        });
                        modulesAdapter$VH$loadInfoJson$job$1.this$0.descLoads.remove(modulesAdapter$VH$loadInfoJson$job$1.$moduleId);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        ModulesAdapter$VH$loadInfoJson$job$1 modulesAdapter$VH$loadInfoJson$job$3 = modulesAdapter$VH$loadInfoJson$job$1;
                        th = th2;
                        modulesAdapter$VH$loadInfoJson$job$2 = modulesAdapter$VH$loadInfoJson$job$3;
                        modulesAdapter$VH$loadInfoJson$job$2.this$0.descLoads.remove(modulesAdapter$VH$loadInfoJson$job$2.$moduleId);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    modulesAdapter$VH$loadInfoJson$job$2 = modulesAdapter$VH$loadInfoJson$job$1;
                    modulesAdapter$VH$loadInfoJson$job$2.this$0.descLoads.remove(modulesAdapter$VH$loadInfoJson$job$2.$moduleId);
                    throw th;
                }
            case 1:
                modulesAdapter$VH$loadInfoJson$job$2 = this;
                try {
                    ResultKt.throwOnFailure($result);
                    modulesAdapter$VH$loadInfoJson$job$1 = modulesAdapter$VH$loadInfoJson$job$2;
                    result = (NetworkResult) $result;
                    description = null;
                    if (result instanceof NetworkResult.Success) {
                        success = (NetworkResult.Success) result;
                    } else {
                        success = null;
                    }
                    if (success != null) {
                        description = modulesAdapter$VH$loadInfoJson$job$1.this$1.parseDescription(new String(it, Charsets.UTF_8));
                    }
                    if (description == null) {
                        description = "";
                    }
                    parsed = description;
                    if (!StringsKt__StringsKt.isBlank(parsed)) {
                        modulesAdapter$VH$loadInfoJson$job$1.this$0.descCache.put(modulesAdapter$VH$loadInfoJson$job$1.$moduleId, parsed);
                    }
                    ModulesAdapter.C5309VH c5309vh4 = modulesAdapter$VH$loadInfoJson$job$1.this$1;
                    final ModulesAdapter.C5309VH c5309vh5 = modulesAdapter$VH$loadInfoJson$job$1.this$1;
                    final String str3 = modulesAdapter$VH$loadInfoJson$job$1.$moduleId;
                    c5309vh4.postToMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ModulesAdapter$VH$loadInfoJson$job$1.1
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
                            if (c5309vh5.isCurrent(str3)) {
                                c5309vh5.desc.setText(parsed);
                                View $this$isVisible$iv = c5309vh5.desc;
                                boolean value$iv = !StringsKt__StringsKt.isBlank(parsed);
                                $this$isVisible$iv.setVisibility(value$iv ? 0 : 8);
                            }
                        }
                    });
                    modulesAdapter$VH$loadInfoJson$job$1.this$0.descLoads.remove(modulesAdapter$VH$loadInfoJson$job$1.$moduleId);
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    th = th4;
                    modulesAdapter$VH$loadInfoJson$job$2.this$0.descLoads.remove(modulesAdapter$VH$loadInfoJson$job$2.$moduleId);
                    throw th;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
