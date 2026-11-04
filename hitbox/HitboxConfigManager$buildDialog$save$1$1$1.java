package com.blackhub.bronline.neizzir.fragments.hitbox;

import android.content.Context;
import android.widget.Toast;
import java.io.File;
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
import org.json.JSONObject;

/* JADX INFO: compiled from: HitboxConfigManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$buildDialog$save$1$1$1", m4426f = "HitboxConfigManager.kt", m4427i = {}, m4428l = {418}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class HitboxConfigManager$buildDialog$save$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ File $file;
    final /* synthetic */ JSONObject $json;
    final /* synthetic */ boolean $repairedBeforeSave;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HitboxConfigManager$buildDialog$save$1$1$1(Context context, boolean z, File file, JSONObject jSONObject, Continuation<? super HitboxConfigManager$buildDialog$save$1$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$repairedBeforeSave = z;
        this.$file = file;
        this.$json = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HitboxConfigManager$buildDialog$save$1$1$1 hitboxConfigManager$buildDialog$save$1$1$1 = new HitboxConfigManager$buildDialog$save$1$1$1(this.$context, this.$repairedBeforeSave, this.$file, this.$json, continuation);
        hitboxConfigManager$buildDialog$save$1$1$1.L$0 = obj;
        return hitboxConfigManager$buildDialog$save$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HitboxConfigManager$buildDialog$save$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Throwable th;
        HitboxConfigManager$buildDialog$save$1$1$1 hitboxConfigManager$buildDialog$save$1$1$1;
        Object objM15551constructorimpl;
        Context context;
        Throwable it;
        String str;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Context context2 = this.$context;
                File file = this.$file;
                JSONObject jSONObject = this.$json;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    HitboxConfigManager hitboxConfigManager = HitboxConfigManager.INSTANCE;
                    this.label = 1;
                    if (hitboxConfigManager.saveJsonIO(context2, file, jSONObject, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    hitboxConfigManager$buildDialog$save$1$1$1 = this;
                    objM15551constructorimpl = Result.m15551constructorimpl(Unit.INSTANCE);
                    context = hitboxConfigManager$buildDialog$save$1$1$1.$context;
                    it = Result.m15554exceptionOrNullimpl(objM15551constructorimpl);
                    if (it != null) {
                        Toast.makeText(context, "Ошибка сохранения: " + it.getMessage(), 0).show();
                        return Unit.INSTANCE;
                    }
                    Context context3 = hitboxConfigManager$buildDialog$save$1$1$1.$context;
                    if (hitboxConfigManager$buildDialog$save$1$1$1.$repairedBeforeSave) {
                        str = "Сохранено, некорректные значения исправлены автоматически";
                    } else {
                        str = "Сохранено";
                    }
                    Toast.makeText(context3, str, 0).show();
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    hitboxConfigManager$buildDialog$save$1$1$1 = this;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                }
                break;
            case 1:
                hitboxConfigManager$buildDialog$save$1$1$1 = this;
                try {
                    ResultKt.throwOnFailure($result);
                    objM15551constructorimpl = Result.m15551constructorimpl(Unit.INSTANCE);
                    break;
                } catch (Throwable th3) {
                    th = th3;
                    Result.Companion companion3 = Result.INSTANCE;
                    objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                }
                context = hitboxConfigManager$buildDialog$save$1$1$1.$context;
                it = Result.m15554exceptionOrNullimpl(objM15551constructorimpl);
                if (it != null) {
                    Toast.makeText(context, "Ошибка сохранения: " + it.getMessage(), 0).show();
                    return Unit.INSTANCE;
                }
                Context context4 = hitboxConfigManager$buildDialog$save$1$1$1.$context;
                if (hitboxConfigManager$buildDialog$save$1$1$1.$repairedBeforeSave) {
                    str = "Сохранено, некорректные значения исправлены автоматически";
                } else {
                    str = "Сохранено";
                }
                Toast.makeText(context4, str, 0).show();
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
