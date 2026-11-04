package com.blackhub.bronline.neizzir.fragments.hitbox;

import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: HitboxConfigManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$buildDialog$reset$1$1$1", m4426f = "HitboxConfigManager.kt", m4427i = {}, m4428l = {463}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class HitboxConfigManager$buildDialog$reset$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ List<Triple<EditText, EditText, EditText>> $editTriples;
    final /* synthetic */ File $file;
    final /* synthetic */ JSONObject $json;
    final /* synthetic */ JSONArray $nodes;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HitboxConfigManager$buildDialog$reset$1$1$1(List<Triple<EditText, EditText, EditText>> list, JSONArray jSONArray, Context context, File file, JSONObject jSONObject, Continuation<? super HitboxConfigManager$buildDialog$reset$1$1$1> continuation) {
        super(2, continuation);
        this.$editTriples = list;
        this.$nodes = jSONArray;
        this.$context = context;
        this.$file = file;
        this.$json = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HitboxConfigManager$buildDialog$reset$1$1$1 hitboxConfigManager$buildDialog$reset$1$1$1 = new HitboxConfigManager$buildDialog$reset$1$1$1(this.$editTriples, this.$nodes, this.$context, this.$file, this.$json, continuation);
        hitboxConfigManager$buildDialog$reset$1$1$1.L$0 = obj;
        return hitboxConfigManager$buildDialog$reset$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HitboxConfigManager$buildDialog$reset$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) throws JSONException {
        HitboxConfigManager$buildDialog$reset$1$1$1 hitboxConfigManager$buildDialog$reset$1$1$1;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                hitboxConfigManager$buildDialog$reset$1$1$1 = this;
                Object $result2 = $result;
                CoroutineScope $this$launch = (CoroutineScope) hitboxConfigManager$buildDialog$reset$1$1$1.L$0;
                JSONArray defaultNodes = HitboxConfigManager.INSTANCE.getStockNodes();
                int i = 0;
                for (int iMin = Math.min(defaultNodes.length(), Math.min(hitboxConfigManager$buildDialog$reset$1$1$1.$editTriples.size(), hitboxConfigManager$buildDialog$reset$1$1$1.$nodes.length())); i < iMin; iMin = iMin) {
                    JSONObject stockNode = defaultNodes.getJSONObject(i);
                    Triple<EditText, EditText, EditText> triple = hitboxConfigManager$buildDialog$reset$1$1$1.$editTriples.get(i);
                    EditText x = triple.component1();
                    EditText z = triple.component2();
                    EditText radius = triple.component3();
                    double n3 = stockNode.getDouble("n3");
                    Object $result3 = $result2;
                    double n4 = stockNode.getDouble("n4");
                    JSONArray defaultNodes2 = defaultNodes;
                    int i2 = i;
                    double n5 = stockNode.getDouble("n5");
                    x.setText(String.valueOf(n3));
                    z.setText(String.valueOf(n4));
                    radius.setText(String.valueOf(n5));
                    hitboxConfigManager$buildDialog$reset$1$1$1.$nodes.getJSONObject(i2).put("n1", stockNode.getInt("n1")).put("n2", stockNode.getInt("n2")).put("n3", n3).put("n4", n4).put("n5", n5);
                    i = i2 + 1;
                    $result2 = $result3;
                    $this$launch = $this$launch;
                    defaultNodes = defaultNodes2;
                }
                Context context = hitboxConfigManager$buildDialog$reset$1$1$1.$context;
                File file = hitboxConfigManager$buildDialog$reset$1$1$1.$file;
                JSONObject jSONObject = hitboxConfigManager$buildDialog$reset$1$1$1.$json;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    HitboxConfigManager hitboxConfigManager = HitboxConfigManager.INSTANCE;
                    hitboxConfigManager$buildDialog$reset$1$1$1.label = 1;
                    if (hitboxConfigManager.saveJsonIO(context, file, jSONObject, hitboxConfigManager$buildDialog$reset$1$1$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Result.m15551constructorimpl(Unit.INSTANCE);
                    Toast.makeText(hitboxConfigManager$buildDialog$reset$1$1$1.$context, "Сброшено", 0).show();
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m15551constructorimpl(ResultKt.createFailure(th));
                }
                break;
            case 1:
                hitboxConfigManager$buildDialog$reset$1$1$1 = this;
                try {
                    ResultKt.throwOnFailure($result);
                    Result.m15551constructorimpl(Unit.INSTANCE);
                    break;
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion3 = Result.INSTANCE;
                    Result.m15551constructorimpl(ResultKt.createFailure(th));
                }
                Toast.makeText(hitboxConfigManager$buildDialog$reset$1$1$1.$context, "Сброшено", 0).show();
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
