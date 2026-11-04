package com.blackhub.bronline.neizzir.network;

import com.blackhub.bronline.game.gui.donate.utils.DonateConstants;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.CloseableKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: compiled from: EndpointRouter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/network/EndpointRouter$Attempt;", "endpoint", "Lcom/blackhub/bronline/neizzir/network/Endpoint;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.network.EndpointRouter$fetchNetworkBytes$result$1", m4426f = "EndpointRouter.kt", m4427i = {0, 0}, m4428l = {281}, m4429m = "invokeSuspend", m4430n = {"endpoint", "cancellationHandle"}, m4431s = {"L$0", "L$1"})
final class EndpointRouter$fetchNetworkBytes$result$1 extends SuspendLambda implements Function2<Endpoint, Continuation<? super EndpointRouter.Attempt>, Object> {
    final /* synthetic */ EndpointGroup $group;
    final /* synthetic */ long $maxBytes;
    final /* synthetic */ String $path;
    final /* synthetic */ Function1<byte[], Boolean> $validator;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ EndpointRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EndpointRouter$fetchNetworkBytes$result$1(EndpointRouter endpointRouter, EndpointGroup endpointGroup, String str, long j, Function1<? super byte[], Boolean> function1, Continuation<? super EndpointRouter$fetchNetworkBytes$result$1> continuation) {
        super(2, continuation);
        this.this$0 = endpointRouter;
        this.$group = endpointGroup;
        this.$path = str;
        this.$maxBytes = j;
        this.$validator = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EndpointRouter$fetchNetworkBytes$result$1 endpointRouter$fetchNetworkBytes$result$1 = new EndpointRouter$fetchNetworkBytes$result$1(this.this$0, this.$group, this.$path, this.$maxBytes, this.$validator, continuation);
        endpointRouter$fetchNetworkBytes$result$1.L$0 = obj;
        return endpointRouter$fetchNetworkBytes$result$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Endpoint endpoint, Continuation<? super EndpointRouter.Attempt> continuation) {
        return ((EndpointRouter$fetchNetworkBytes$result$1) create(endpoint, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ac A[Catch: all -> 0x0150, TryCatch #0 {all -> 0x0150, blocks: (B:23:0x00a1, B:25:0x00ac, B:27:0x00ff, B:32:0x010b, B:33:0x0119, B:35:0x0129, B:36:0x0132), top: B:72:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x010a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0119 A[Catch: all -> 0x0150, TryCatch #0 {all -> 0x0150, blocks: (B:23:0x00a1, B:25:0x00ac, B:27:0x00ff, B:32:0x010b, B:33:0x0119, B:35:0x0129, B:36:0x0132), top: B:72:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0129 A[Catch: all -> 0x0150, TryCatch #0 {all -> 0x0150, blocks: (B:23:0x00a1, B:25:0x00ac, B:27:0x00ff, B:32:0x010b, B:33:0x0119, B:35:0x0129, B:36:0x0132), top: B:72:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0132 A[Catch: all -> 0x0150, TRY_LEAVE, TryCatch #0 {all -> 0x0150, blocks: (B:23:0x00a1, B:25:0x00ac, B:27:0x00ff, B:32:0x010b, B:33:0x0119, B:35:0x0129, B:36:0x0132), top: B:72:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x014b  */
    /* JADX WARN: Code duplicated, block: B:58:0x016f A[Catch: all -> 0x0192, TryCatch #3 {all -> 0x0192, blocks: (B:56:0x0167, B:58:0x016f, B:59:0x0177, B:67:0x0191), top: B:73:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0188  */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0193: IF  (r6 I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('cancellationHandle' kotlinx.coroutines.DisposableHandle)]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:71:0x0199, block:B:69:0x0193 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DisposableHandle cancellationHandle;
        EndpointRouter$fetchNetworkBytes$result$1 endpointRouter$fetchNetworkBytes$result$1;
        Object $result;
        Endpoint endpoint;
        DisposableHandle cancellationHandle2;
        Throwable error;
        DisposableHandle cancellationHandle3;
        Endpoint endpoint2;
        Object $result2;
        String message;
        EndpointRouter.Attempt.Failure failure;
        Closeable closeable;
        EndpointRouter endpointRouter;
        long j;
        Function1<byte[], Boolean> function1;
        Response response;
        byte[] bytes;
        boolean z;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    endpointRouter$fetchNetworkBytes$result$1 = this;
                    $result = obj;
                    endpoint = (Endpoint) endpointRouter$fetchNetworkBytes$result$1.L$0;
                    Request request = new Request.Builder().url(endpointRouter$fetchNetworkBytes$result$1.this$0.urlFor(endpointRouter$fetchNetworkBytes$result$1.$group, endpointRouter$fetchNetworkBytes$result$1.$path, endpoint)).get().build();
                    final Call call = endpointRouter$fetchNetworkBytes$result$1.this$0.apiClient.newCall(request);
                    Job job = (Job) endpointRouter$fetchNetworkBytes$result$1.get$context().get(Job.INSTANCE);
                    cancellationHandle2 = job != null ? job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: com.blackhub.bronline.neizzir.network.EndpointRouter$fetchNetworkBytes$result$1$cancellationHandle$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                            invoke2(th);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Throwable cause) {
                            if (cause instanceof CancellationException) {
                                call.cancel();
                            }
                        }
                    }) : null;
                    try {
                        endpointRouter$fetchNetworkBytes$result$1.L$0 = endpoint;
                        endpointRouter$fetchNetworkBytes$result$1.L$1 = cancellationHandle2;
                        endpointRouter$fetchNetworkBytes$result$1.label = 1;
                        Object objAwaitResponse = endpointRouter$fetchNetworkBytes$result$1.this$0.awaitResponse(call, endpointRouter$fetchNetworkBytes$result$1);
                        if (objAwaitResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        $result2 = $result;
                        $result = objAwaitResponse;
                        try {
                            closeable = (Closeable) $result;
                            endpointRouter = endpointRouter$fetchNetworkBytes$result$1.this$0;
                            j = endpointRouter$fetchNetworkBytes$result$1.$maxBytes;
                            function1 = endpointRouter$fetchNetworkBytes$result$1.$validator;
                            try {
                                response = (Response) closeable;
                                if (response.getIsSuccessful()) {
                                    bytes = endpointRouter.readBoundedBytes(response, j);
                                    if (function1.invoke(bytes).booleanValue()) {
                                        failure = new EndpointRouter.Attempt.Success(endpoint, bytes);
                                    } else {
                                        failure = new EndpointRouter.Attempt.Failure(endpoint, "invalid response", null, null, false, 28, null);
                                    }
                                } else {
                                    String str = "HTTP " + response.code();
                                    if (!CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(403), Boxing.boxInt(DonateConstants.ACTION_SEND_ERROR), Boxing.boxInt(408), Boxing.boxInt(429)}).contains(Boxing.boxInt(response.code())) || response.code() >= 500) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    failure = new EndpointRouter.Attempt.Failure(endpoint, str, null, null, z, 12, null);
                                }
                                CloseableKt.closeFinally(closeable, null);
                                if (cancellationHandle2 != null) {
                                    cancellationHandle2.dispose();
                                }
                                return failure;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    CloseableKt.closeFinally(closeable, th);
                                    throw th2;
                                }
                            }
                        } catch (CancellationException cancelled) {
                            throw cancelled;
                        } catch (Throwable th3) {
                            error = th3;
                            $result = $result2;
                            cancellationHandle3 = cancellationHandle2;
                            endpoint2 = endpoint;
                            message = error.getMessage();
                            if (message == null) {
                                message = error.getClass().getSimpleName();
                            }
                            String str2 = message;
                            Intrinsics.checkNotNull(str2);
                            failure = new EndpointRouter.Attempt.Failure(endpoint2, str2, error, null, false, 24, null);
                            if (cancellationHandle3 != null) {
                                cancellationHandle3.dispose();
                            }
                        }
                    } catch (CancellationException cancelled2) {
                        throw cancelled2;
                    } catch (Throwable th4) {
                        error = th4;
                        cancellationHandle3 = cancellationHandle2;
                        endpoint2 = endpoint;
                        message = error.getMessage();
                        if (message == null) {
                            message = error.getClass().getSimpleName();
                        }
                        String str3 = message;
                        Intrinsics.checkNotNull(str3);
                        failure = new EndpointRouter.Attempt.Failure(endpoint2, str3, error, null, false, 24, null);
                        if (cancellationHandle3 != null) {
                            cancellationHandle3.dispose();
                        }
                        return failure;
                    }
                    break;
                case 1:
                    endpointRouter$fetchNetworkBytes$result$1 = this;
                    $result = obj;
                    cancellationHandle3 = (DisposableHandle) endpointRouter$fetchNetworkBytes$result$1.L$1;
                    endpoint = (Endpoint) endpointRouter$fetchNetworkBytes$result$1.L$0;
                    try {
                        ResultKt.throwOnFailure($result);
                        cancellationHandle2 = cancellationHandle3;
                        $result2 = $result;
                        closeable = (Closeable) $result;
                        endpointRouter = endpointRouter$fetchNetworkBytes$result$1.this$0;
                        j = endpointRouter$fetchNetworkBytes$result$1.$maxBytes;
                        function1 = endpointRouter$fetchNetworkBytes$result$1.$validator;
                        response = (Response) closeable;
                        if (response.getIsSuccessful()) {
                            String str4 = "HTTP " + response.code();
                            if (CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(403), Boxing.boxInt(DonateConstants.ACTION_SEND_ERROR), Boxing.boxInt(408), Boxing.boxInt(429)}).contains(Boxing.boxInt(response.code()))) {
                                z = true;
                            } else {
                                z = true;
                            }
                            failure = new EndpointRouter.Attempt.Failure(endpoint, str4, null, null, z, 12, null);
                        } else {
                            bytes = endpointRouter.readBoundedBytes(response, j);
                            if (function1.invoke(bytes).booleanValue()) {
                                failure = new EndpointRouter.Attempt.Success(endpoint, bytes);
                            } else {
                                failure = new EndpointRouter.Attempt.Failure(endpoint, "invalid response", null, null, false, 28, null);
                            }
                        }
                        CloseableKt.closeFinally(closeable, null);
                        if (cancellationHandle2 != null) {
                            cancellationHandle2.dispose();
                        }
                    } catch (CancellationException cancelled3) {
                        throw cancelled3;
                    } catch (Throwable th5) {
                        error = th5;
                        endpoint2 = endpoint;
                        message = error.getMessage();
                        if (message == null) {
                            message = error.getClass().getSimpleName();
                        }
                        String str5 = message;
                        Intrinsics.checkNotNull(str5);
                        failure = new EndpointRouter.Attempt.Failure(endpoint2, str5, error, null, false, 24, null);
                        if (cancellationHandle3 != null) {
                            cancellationHandle3.dispose();
                        }
                        return failure;
                    }
                    return failure;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable cancelled4) {
            if (cancellationHandle != null) {
                cancellationHandle.dispose();
            }
            throw cancelled4;
        }
    }
}
