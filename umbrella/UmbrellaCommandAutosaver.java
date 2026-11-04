package com.blackhub.bronline.neizzir.umbrella;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: UmbrellaCommandAutosaver.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\nJ\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\"\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaCommandAutosaver;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "save", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "onResult", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "pending", "Lkotlinx/coroutines/Job;", "revision", "", "Lkotlin/jvm/functions/Function2;", "submit", "value", "immediately", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class UmbrellaCommandAutosaver {
    private final Function2<String, String, Unit> onResult;
    private Job pending;
    private int revision;
    private final Function2<String, Continuation<? super Unit>, Object> save;
    private final CoroutineScope scope;

    /* JADX WARN: Multi-variable type inference failed */
    public UmbrellaCommandAutosaver(CoroutineScope scope, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> save, Function2<? super String, ? super String, Unit> onResult) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(save, "save");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        this.scope = scope;
        this.save = save;
        this.onResult = onResult;
    }

    public static /* synthetic */ void submit$default(UmbrellaCommandAutosaver umbrellaCommandAutosaver, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        umbrellaCommandAutosaver.submit(str, z);
    }

    public final void submit(String value, boolean immediately) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.revision++;
        int token = this.revision;
        Job job = this.pending;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.pending = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C56891(immediately, this, value, token, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.umbrella.UmbrellaCommandAutosaver$submit$1 */
    /* JADX INFO: compiled from: UmbrellaCommandAutosaver.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.umbrella.UmbrellaCommandAutosaver$submit$1", m4426f = "UmbrellaCommandAutosaver.kt", m4427i = {}, m4428l = {22, 24}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C56891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $immediately;
        final /* synthetic */ int $token;
        final /* synthetic */ String $value;
        int label;
        final /* synthetic */ UmbrellaCommandAutosaver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C56891(boolean z, UmbrellaCommandAutosaver umbrellaCommandAutosaver, String str, int i, Continuation<? super C56891> continuation) {
            super(2, continuation);
            this.$immediately = z;
            this.this$0 = umbrellaCommandAutosaver;
            this.$value = str;
            this.$token = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C56891(this.$immediately, this.this$0, this.$value, this.$token, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0048 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x0049  */
        /* JADX WARN: Code duplicated, block: B:29:0x0056  */
        /* JADX WARN: Code duplicated, block: B:32:0x0064  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C56891 c56891;
            Exception error;
            C56891 c56892;
            Function2 function2;
            String str;
            String error2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c56891 = this;
                    if (!c56891.$immediately) {
                        c56891.label = 1;
                        if (DelayKt.delay(500L, c56891) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    try {
                        function2 = c56891.this$0.save;
                        str = c56891.$value;
                        c56891.label = 2;
                        if (function2.invoke(str, c56891) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c56892 = c56891;
                        error2 = null;
                        if (c56892.$token == c56892.this$0.revision) {
                            c56892.this$0.onResult.invoke(c56892.$value, error2);
                        }
                        return Unit.INSTANCE;
                    } catch (CancellationException cancelled) {
                        throw cancelled;
                    } catch (Exception e) {
                        C56891 c56893 = c56891;
                        error = e;
                        c56892 = c56893;
                        error2 = error.getMessage();
                        if (error2 == null) {
                            error2 = "Не удалось сохранить команду";
                        }
                    }
                    break;
                case 1:
                    c56891 = this;
                    ResultKt.throwOnFailure($result);
                    function2 = c56891.this$0.save;
                    str = c56891.$value;
                    c56891.label = 2;
                    if (function2.invoke(str, c56891) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c56892 = c56891;
                    error2 = null;
                    if (c56892.$token == c56892.this$0.revision) {
                        c56892.this$0.onResult.invoke(c56892.$value, error2);
                    }
                    return Unit.INSTANCE;
                case 2:
                    c56892 = this;
                    try {
                        ResultKt.throwOnFailure($result);
                        error2 = null;
                    } catch (CancellationException cancelled2) {
                        throw cancelled2;
                    } catch (Exception e2) {
                        error = e2;
                        error2 = error.getMessage();
                        if (error2 == null) {
                            error2 = "Не удалось сохранить команду";
                        }
                    }
                    if (c56892.$token == c56892.this$0.revision) {
                        c56892.this$0.onResult.invoke(c56892.$value, error2);
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
