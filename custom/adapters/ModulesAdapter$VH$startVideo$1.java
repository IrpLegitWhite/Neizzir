package com.blackhub.bronline.neizzir.fragments.custom.adapters;

import com.blackhub.bronline.neizzir.network.Endpoint;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ModulesAdapter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.adapters.ModulesAdapter$VH$startVideo$1", m4426f = "ModulesAdapter.kt", m4427i = {}, m4428l = {223}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class ModulesAdapter$VH$startVideo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $moduleId;
    final /* synthetic */ String $path;
    int label;
    final /* synthetic */ ModulesAdapter.C5309VH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModulesAdapter$VH$startVideo$1(String str, ModulesAdapter.C5309VH c5309vh, String str2, Continuation<? super ModulesAdapter$VH$startVideo$1> continuation) {
        super(2, continuation);
        this.$path = str;
        this.this$0 = c5309vh;
        this.$moduleId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModulesAdapter$VH$startVideo$1(this.$path, this.this$0, this.$moduleId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModulesAdapter$VH$startVideo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) throws Throwable {
        ModulesAdapter$VH$startVideo$1 modulesAdapter$VH$startVideo$1;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                modulesAdapter$VH$startVideo$1 = this;
                modulesAdapter$VH$startVideo$1.label = 1;
                Object objResolveEndpointForDownload = NetworkRuntime.INSTANCE.getRouter().resolveEndpointForDownload(EndpointGroup.KOLSON, modulesAdapter$VH$startVideo$1.$path, modulesAdapter$VH$startVideo$1);
                if (objResolveEndpointForDownload == coroutine_suspended) {
                    return coroutine_suspended;
                }
                $result = objResolveEndpointForDownload;
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                modulesAdapter$VH$startVideo$1 = this;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        final Endpoint endpoint = (Endpoint) $result;
        ModulesAdapter.C5309VH c5309vh = modulesAdapter$VH$startVideo$1.this$0;
        final ModulesAdapter.C5309VH c5309vh2 = modulesAdapter$VH$startVideo$1.this$0;
        final String str = modulesAdapter$VH$startVideo$1.$moduleId;
        final String str2 = modulesAdapter$VH$startVideo$1.$path;
        c5309vh.postToMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ModulesAdapter$VH$startVideo$1.1
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
                if (c5309vh2.isCurrent(str) && c5309vh2.player == null) {
                    c5309vh2.createPlayer(str2, endpoint);
                }
            }
        });
        return Unit.INSTANCE;
    }
}
