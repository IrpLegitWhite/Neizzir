package com.blackhub.bronline.neizzir.network;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: NetworkImages.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.NetworkImages$loadRouted$job$1", m4426f = "NetworkImages.kt", m4427i = {}, m4428l = {149, 150}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class NetworkImages$loadRouted$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $centerCrop;
    final /* synthetic */ int $error;
    final /* synthetic */ EndpointGroup $group;
    final /* synthetic */ Integer $height;
    final /* synthetic */ Function0<Unit> $onError;
    final /* synthetic */ Function1<Drawable, Unit> $onSuccess;
    final /* synthetic */ String $path;
    final /* synthetic */ int $placeholder;
    final /* synthetic */ long $token;
    final /* synthetic */ ImageView $view;
    final /* synthetic */ Integer $width;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NetworkImages$loadRouted$job$1(EndpointGroup endpointGroup, String str, ImageView imageView, long j, Integer num, Integer num2, boolean z, int i, int i2, Function1<? super Drawable, Unit> function1, Function0<Unit> function0, Continuation<? super NetworkImages$loadRouted$job$1> continuation) {
        super(2, continuation);
        this.$group = endpointGroup;
        this.$path = str;
        this.$view = imageView;
        this.$token = j;
        this.$width = num;
        this.$height = num2;
        this.$centerCrop = z;
        this.$placeholder = i;
        this.$error = i2;
        this.$onSuccess = function1;
        this.$onError = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NetworkImages$loadRouted$job$1(this.$group, this.$path, this.$view, this.$token, this.$width, this.$height, this.$centerCrop, this.$placeholder, this.$error, this.$onSuccess, this.$onError, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NetworkImages$loadRouted$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0090  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) throws Throwable {
        NetworkImages$loadRouted$job$1 networkImages$loadRouted$job$1;
        Object $result2;
        Object objResolveEndpointForDownload;
        Endpoint endpoint;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                networkImages$loadRouted$job$1 = this;
                $result2 = $result;
                networkImages$loadRouted$job$1.label = 1;
                objResolveEndpointForDownload = NetworkRuntime.INSTANCE.getRouter().resolveEndpointForDownload(networkImages$loadRouted$job$1.$group, networkImages$loadRouted$job$1.$path, networkImages$loadRouted$job$1);
                if (objResolveEndpointForDownload == coroutine_suspended) {
                    return coroutine_suspended;
                }
                endpoint = (Endpoint) objResolveEndpointForDownload;
                networkImages$loadRouted$job$1.label = 2;
                if (BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new C56701(networkImages$loadRouted$job$1.$view, networkImages$loadRouted$job$1.$token, networkImages$loadRouted$job$1.$group, networkImages$loadRouted$job$1.$path, endpoint, networkImages$loadRouted$job$1.$width, networkImages$loadRouted$job$1.$height, networkImages$loadRouted$job$1.$centerCrop, networkImages$loadRouted$job$1.$placeholder, networkImages$loadRouted$job$1.$error, networkImages$loadRouted$job$1.$onSuccess, networkImages$loadRouted$job$1.$onError, null), networkImages$loadRouted$job$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                networkImages$loadRouted$job$1 = this;
                $result2 = $result;
                ResultKt.throwOnFailure($result2);
                objResolveEndpointForDownload = $result2;
                endpoint = (Endpoint) objResolveEndpointForDownload;
                networkImages$loadRouted$job$1.label = 2;
                if (BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new C56701(networkImages$loadRouted$job$1.$view, networkImages$loadRouted$job$1.$token, networkImages$loadRouted$job$1.$group, networkImages$loadRouted$job$1.$path, endpoint, networkImages$loadRouted$job$1.$width, networkImages$loadRouted$job$1.$height, networkImages$loadRouted$job$1.$centerCrop, networkImages$loadRouted$job$1.$placeholder, networkImages$loadRouted$job$1.$error, networkImages$loadRouted$job$1.$onSuccess, networkImages$loadRouted$job$1.$onError, null), networkImages$loadRouted$job$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.network.NetworkImages$loadRouted$job$1$1 */
    /* JADX INFO: compiled from: NetworkImages.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.NetworkImages$loadRouted$job$1$1", m4426f = "NetworkImages.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $centerCrop;
        final /* synthetic */ Endpoint $endpoint;
        final /* synthetic */ int $error;
        final /* synthetic */ EndpointGroup $group;
        final /* synthetic */ Integer $height;
        final /* synthetic */ Function0<Unit> $onError;
        final /* synthetic */ Function1<Drawable, Unit> $onSuccess;
        final /* synthetic */ String $path;
        final /* synthetic */ int $placeholder;
        final /* synthetic */ long $token;
        final /* synthetic */ ImageView $view;
        final /* synthetic */ Integer $width;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C56701(ImageView imageView, long j, EndpointGroup endpointGroup, String str, Endpoint endpoint, Integer num, Integer num2, boolean z, int i, int i2, Function1<? super Drawable, Unit> function1, Function0<Unit> function0, Continuation<? super C56701> continuation) {
            super(2, continuation);
            this.$view = imageView;
            this.$token = j;
            this.$group = endpointGroup;
            this.$path = str;
            this.$endpoint = endpoint;
            this.$width = num;
            this.$height = num2;
            this.$centerCrop = z;
            this.$placeholder = i;
            this.$error = i2;
            this.$onSuccess = function1;
            this.$onError = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C56701(this.$view, this.$token, this.$group, this.$path, this.$endpoint, this.$width, this.$height, this.$centerCrop, this.$placeholder, this.$error, this.$onSuccess, this.$onError, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    if (!NetworkImages.INSTANCE.isCurrent(this.$view, this.$token)) {
                        return Unit.INSTANCE;
                    }
                    NetworkImages.INSTANCE.enqueueRouted(this.$view, this.$group, this.$path, this.$endpoint, this.$token, false, this.$width, this.$height, this.$centerCrop, this.$placeholder, this.$error, this.$onSuccess, this.$onError);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
