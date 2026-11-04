package com.blackhub.bronline.neizzir.fragments.sborks.network;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: compiled from: OkHttpAwait.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086@¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m4416d2 = {"await", "Lokhttp3/Response;", "Lokhttp3/Call;", "(Lokhttp3/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m4417k = 2, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class OkHttpAwaitKt {
    public static final Object await(final Call $this$await, Continuation<? super Response> continuation) {
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellable$iv.initCancellability();
        final CancellableContinuationImpl cont = cancellable$iv;
        $this$await.enqueue(new Callback() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.network.OkHttpAwaitKt$await$2$1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e, "e");
                if (!cont.isCancelled()) {
                    CancellableContinuation<Response> cancellableContinuation = cont;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m15551constructorimpl(ResultKt.createFailure(e)));
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                CancellableContinuation<Response> cancellableContinuation = cont;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m15551constructorimpl(response));
            }
        });
        cont.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.network.OkHttpAwaitKt$await$2$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                try {
                    $this$await.cancel();
                } catch (Throwable th) {
                }
            }
        });
        Object result = cancellable$iv.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
