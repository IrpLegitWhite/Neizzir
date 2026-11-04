package com.blackhub.bronline.neizzir.fragments.sborks.network;

import com.blackhub.bronline.game.core.constants.Other;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* JADX INFO: compiled from: SborksApi.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m4416d2 = {"<anonymous>", "", "r", "Lokhttp3/Response;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.network.SborksApi$isNewFolder$2$exists$2", m4426f = "SborksApi.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class SborksApi$isNewFolder$2$exists$2 extends SuspendLambda implements Function2<Response, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    SborksApi$isNewFolder$2$exists$2(Continuation<? super SborksApi$isNewFolder$2$exists$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SborksApi$isNewFolder$2$exists$2 sborksApi$isNewFolder$2$exists$2 = new SborksApi$isNewFolder$2$exists$2(continuation);
        sborksApi$isNewFolder$2$exists$2.L$0 = obj;
        return sborksApi$isNewFolder$2$exists$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Response response, Continuation<? super Boolean> continuation) {
        return ((SborksApi$isNewFolder$2$exists$2) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                Response r = (Response) this.L$0;
                String ct = Response.header$default(r, HttpHeaders.CONTENT_TYPE, null, 2, null);
                if (ct == null) {
                    ct = "";
                }
                ResponseBody responseBodyBody = r.body();
                String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                String body = strString != null ? strString : "";
                if (!StringsKt__StringsKt.contains((CharSequence) ct, (CharSequence) Other.APPLICATION_JSON, true)) {
                    throw new IOException("Bad CT: " + ct);
                }
                return Boxing.boxBoolean(new JSONObject(body).optBoolean("exists", false));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
