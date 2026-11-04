package com.blackhub.bronline.neizzir.fragments.sborks.util;

import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.CloseableKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: TextLoader.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\t¨\u0006\n"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/util/TextLoader;", "", "()V", "loadTextFromServer", "", "url", "", "prefix", "callback", "Lkotlin/Function1;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class TextLoader {
    public static final TextLoader INSTANCE = new TextLoader();

    private TextLoader() {
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.util.TextLoader$loadTextFromServer$1 */
    /* JADX INFO: compiled from: TextLoader.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.util.TextLoader$loadTextFromServer$1", m4426f = "TextLoader.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $callback;
        final /* synthetic */ String $prefix;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C55881(String str, Function1<? super String, Unit> function1, String str2, Continuation<? super C55881> continuation) {
            super(2, continuation);
            this.$url = str;
            this.$callback = function1;
            this.$prefix = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55881(this.$url, this.$callback, this.$prefix, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    try {
                        Response responseExecute = NetworkRuntime.INSTANCE.getApiClient().newCall(new Request.Builder().url(this.$url).build()).execute();
                        try {
                            Response response = responseExecute;
                            if (!response.getIsSuccessful()) {
                                throw new IllegalStateException(("HTTP " + response.code()).toString());
                            }
                            ResponseBody responseBodyBody = response.body();
                            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                            if (strString == null) {
                                strString = "";
                            }
                            CloseableKt.closeFinally(responseExecute, null);
                            String resp = strString;
                            this.$callback.invoke(this.$prefix + '\n' + resp);
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(responseExecute, th);
                                throw th2;
                            }
                        }
                    } catch (Exception e) {
                        this.$callback.invoke("Описание не добавлено.");
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void loadTextFromServer(String url, String prefix, Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(NetworkRuntime.INSTANCE.getApplicationScope(), null, null, new C55881(url, callback, prefix, null), 3, null);
    }
}
