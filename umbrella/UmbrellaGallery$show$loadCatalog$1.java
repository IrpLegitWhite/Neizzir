package com.blackhub.bronline.neizzir.umbrella;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.blackhub.bronline.game.core.constants.ScreenId;
import com.blackhub.bronline.neizzir.activities.main.updates.LauncherVersioningKt;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: UmbrellaGallery.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.umbrella.UmbrellaGallery$show$loadCatalog$1", m4426f = "UmbrellaGallery.kt", m4427i = {0}, m4428l = {ScreenId.SCREEN_LOADER}, m4429m = "invokeSuspend", m4430n = {"$this$launch"}, m4431s = {"L$0"})
final class UmbrellaGallery$show$loadCatalog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ TextView $counter;
    final /* synthetic */ Dialog $dialog;
    final /* synthetic */ TextView $error;
    final /* synthetic */ Ref.IntRef $generation;
    final /* synthetic */ UmbrellaGallery.ZoomImage $image;
    final /* synthetic */ Ref.ObjectRef<List<String>> $images;
    final /* synthetic */ Ref.IntRef $index;
    final /* synthetic */ View $next;
    final /* synthetic */ View $previous;
    final /* synthetic */ ProgressBar $progress;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UmbrellaGallery$show$loadCatalog$1(FragmentActivity fragmentActivity, Ref.ObjectRef<List<String>> objectRef, Ref.IntRef intRef, Dialog dialog, Ref.IntRef intRef2, UmbrellaGallery.ZoomImage zoomImage, TextView textView, View view, View view2, ProgressBar progressBar, TextView textView2, Continuation<? super UmbrellaGallery$show$loadCatalog$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$images = objectRef;
        this.$index = intRef;
        this.$dialog = dialog;
        this.$generation = intRef2;
        this.$image = zoomImage;
        this.$counter = textView;
        this.$previous = view;
        this.$next = view2;
        this.$progress = progressBar;
        this.$error = textView2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UmbrellaGallery$show$loadCatalog$1 umbrellaGallery$show$loadCatalog$1 = new UmbrellaGallery$show$loadCatalog$1(this.$activity, this.$images, this.$index, this.$dialog, this.$generation, this.$image, this.$counter, this.$previous, this.$next, this.$progress, this.$error, continuation);
        umbrellaGallery$show$loadCatalog$1.L$0 = obj;
        return umbrellaGallery$show$loadCatalog$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UmbrellaGallery$show$loadCatalog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090 A[Catch: Exception -> 0x00ec, CancellationException -> 0x00f2, TryCatch #5 {CancellationException -> 0x00f2, Exception -> 0x00ec, blocks: (B:18:0x004a, B:26:0x0081, B:29:0x0089, B:31:0x0090, B:33:0x0098, B:35:0x009e, B:36:0x00a2, B:38:0x00b0, B:39:0x00de, B:40:0x00eb, B:25:0x0077), top: B:62:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0098 A[Catch: Exception -> 0x00ec, CancellationException -> 0x00f2, TryCatch #5 {CancellationException -> 0x00f2, Exception -> 0x00ec, blocks: (B:18:0x004a, B:26:0x0081, B:29:0x0089, B:31:0x0090, B:33:0x0098, B:35:0x009e, B:36:0x00a2, B:38:0x00b0, B:39:0x00de, B:40:0x00eb, B:25:0x0077), top: B:62:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:35:0x009e A[Catch: Exception -> 0x00ec, CancellationException -> 0x00f2, TryCatch #5 {CancellationException -> 0x00f2, Exception -> 0x00ec, blocks: (B:18:0x004a, B:26:0x0081, B:29:0x0089, B:31:0x0090, B:33:0x0098, B:35:0x009e, B:36:0x00a2, B:38:0x00b0, B:39:0x00de, B:40:0x00eb, B:25:0x0077), top: B:62:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0 A[Catch: Exception -> 0x00ec, CancellationException -> 0x00f2, TryCatch #5 {CancellationException -> 0x00f2, Exception -> 0x00ec, blocks: (B:18:0x004a, B:26:0x0081, B:29:0x0089, B:31:0x0090, B:33:0x0098, B:35:0x009e, B:36:0x00a2, B:38:0x00b0, B:39:0x00de, B:40:0x00eb, B:25:0x0077), top: B:62:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00de A[Catch: Exception -> 0x00ec, CancellationException -> 0x00f2, TryCatch #5 {CancellationException -> 0x00f2, Exception -> 0x00ec, blocks: (B:18:0x004a, B:26:0x0081, B:29:0x0089, B:31:0x0090, B:33:0x0098, B:35:0x009e, B:36:0x00a2, B:38:0x00b0, B:39:0x00de, B:40:0x00eb, B:25:0x0077), top: B:62:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [T] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        UmbrellaGallery$show$loadCatalog$1 umbrellaGallery$show$loadCatalog$1;
        Exception error;
        UmbrellaGallery$show$loadCatalog$1 umbrellaGallery$show$loadCatalog$2;
        String message;
        List<UmbrellaBuild> list;
        Object objM15551constructorimpl;
        UmbrellaBuild selected;
        ?? images;
        String str;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                umbrellaGallery$show$loadCatalog$1 = this;
                CoroutineScope $this$launch = (CoroutineScope) umbrellaGallery$show$loadCatalog$1.L$0;
                try {
                    UmbrellaManager umbrellaManager = UmbrellaManager.INSTANCE;
                    Context applicationContext = umbrellaGallery$show$loadCatalog$1.$activity.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    umbrellaGallery$show$loadCatalog$1.L$0 = $this$launch;
                    umbrellaGallery$show$loadCatalog$1.label = 1;
                    Object objCatalog = umbrellaManager.catalog(applicationContext, umbrellaGallery$show$loadCatalog$1);
                    if (objCatalog == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objCatalog;
                    try {
                        list = (List) $result;
                        FragmentActivity fragmentActivity = umbrellaGallery$show$loadCatalog$1.$activity;
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            UmbrellaPolicy umbrellaPolicy = UmbrellaPolicy.INSTANCE;
                            String localLauncherVersionText = LauncherVersioningKt.readLocalLauncherVersionText(fragmentActivity);
                            str = fragmentActivity.getPackageManager().getPackageInfo(fragmentActivity.getPackageName(), 0).versionName;
                            if (str == null) {
                                str = "";
                            }
                            objM15551constructorimpl = Result.m15551constructorimpl(umbrellaPolicy.choose(list, localLauncherVersionText, str));
                            break;
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                        }
                        if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
                            objM15551constructorimpl = null;
                        }
                        selected = (UmbrellaBuild) objM15551constructorimpl;
                        Ref.ObjectRef<List<String>> objectRef = umbrellaGallery$show$loadCatalog$1.$images;
                        if (selected == null) {
                            selected = (UmbrellaBuild) CollectionsKt___CollectionsKt.lastOrNull((List) list);
                        }
                        images = selected != null ? selected.getImages() : 0;
                        if (images == 0) {
                            images = CollectionsKt__CollectionsKt.emptyList();
                        }
                        objectRef.element = images;
                        if (!umbrellaGallery$show$loadCatalog$1.$images.element.isEmpty()) {
                            throw new IllegalStateException("В каталоге пока нет изображений".toString());
                        }
                        umbrellaGallery$show$loadCatalog$1.$index.element = RangesKt___RangesKt.coerceAtMost(umbrellaGallery$show$loadCatalog$1.$index.element, CollectionsKt__CollectionsKt.getLastIndex(umbrellaGallery$show$loadCatalog$1.$images.element));
                        UmbrellaGallery.show$display(umbrellaGallery$show$loadCatalog$1.$dialog, umbrellaGallery$show$loadCatalog$1.$images, umbrellaGallery$show$loadCatalog$1.$generation, umbrellaGallery$show$loadCatalog$1.$image, umbrellaGallery$show$loadCatalog$1.$counter, umbrellaGallery$show$loadCatalog$1.$index, umbrellaGallery$show$loadCatalog$1.$previous, umbrellaGallery$show$loadCatalog$1.$next, umbrellaGallery$show$loadCatalog$1.$progress, umbrellaGallery$show$loadCatalog$1.$error);
                        return Unit.INSTANCE;
                    } catch (CancellationException cancelled) {
                        throw cancelled;
                    } catch (Exception e) {
                        UmbrellaGallery$show$loadCatalog$1 umbrellaGallery$show$loadCatalog$3 = umbrellaGallery$show$loadCatalog$1;
                        error = e;
                        $result = $result;
                        umbrellaGallery$show$loadCatalog$2 = umbrellaGallery$show$loadCatalog$3;
                        ProgressBar progressBar = umbrellaGallery$show$loadCatalog$2.$progress;
                        TextView textView = umbrellaGallery$show$loadCatalog$2.$error;
                        message = error.getMessage();
                        if (message == null) {
                            message = "Не удалось открыть галерею";
                        }
                        UmbrellaGallery.show$failed(progressBar, textView, message);
                    }
                } catch (CancellationException cancelled2) {
                    throw cancelled2;
                } catch (Exception e2) {
                    error = e2;
                    umbrellaGallery$show$loadCatalog$2 = umbrellaGallery$show$loadCatalog$1;
                    ProgressBar progressBar2 = umbrellaGallery$show$loadCatalog$2.$progress;
                    TextView textView2 = umbrellaGallery$show$loadCatalog$2.$error;
                    message = error.getMessage();
                    if (message == null) {
                        message = "Не удалось открыть галерею";
                    }
                    UmbrellaGallery.show$failed(progressBar2, textView2, message);
                    return Unit.INSTANCE;
                }
                break;
            case 1:
                umbrellaGallery$show$loadCatalog$2 = this;
                try {
                    ResultKt.throwOnFailure($result);
                    umbrellaGallery$show$loadCatalog$1 = umbrellaGallery$show$loadCatalog$2;
                    list = (List) $result;
                    FragmentActivity fragmentActivity2 = umbrellaGallery$show$loadCatalog$1.$activity;
                    Result.Companion companion3 = Result.INSTANCE;
                    UmbrellaPolicy umbrellaPolicy2 = UmbrellaPolicy.INSTANCE;
                    String localLauncherVersionText2 = LauncherVersioningKt.readLocalLauncherVersionText(fragmentActivity2);
                    str = fragmentActivity2.getPackageManager().getPackageInfo(fragmentActivity2.getPackageName(), 0).versionName;
                    if (str == null) {
                        str = "";
                    }
                    objM15551constructorimpl = Result.m15551constructorimpl(umbrellaPolicy2.choose(list, localLauncherVersionText2, str));
                    if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
                        objM15551constructorimpl = null;
                    }
                    selected = (UmbrellaBuild) objM15551constructorimpl;
                    Ref.ObjectRef<List<String>> objectRef2 = umbrellaGallery$show$loadCatalog$1.$images;
                    if (selected == null) {
                        selected = (UmbrellaBuild) CollectionsKt___CollectionsKt.lastOrNull((List) list);
                    }
                    if (selected != null) {
                    }
                    if (images == 0) {
                        images = CollectionsKt__CollectionsKt.emptyList();
                    }
                    objectRef2.element = images;
                    if (!umbrellaGallery$show$loadCatalog$1.$images.element.isEmpty()) {
                        throw new IllegalStateException("В каталоге пока нет изображений".toString());
                    }
                    umbrellaGallery$show$loadCatalog$1.$index.element = RangesKt___RangesKt.coerceAtMost(umbrellaGallery$show$loadCatalog$1.$index.element, CollectionsKt__CollectionsKt.getLastIndex(umbrellaGallery$show$loadCatalog$1.$images.element));
                    UmbrellaGallery.show$display(umbrellaGallery$show$loadCatalog$1.$dialog, umbrellaGallery$show$loadCatalog$1.$images, umbrellaGallery$show$loadCatalog$1.$generation, umbrellaGallery$show$loadCatalog$1.$image, umbrellaGallery$show$loadCatalog$1.$counter, umbrellaGallery$show$loadCatalog$1.$index, umbrellaGallery$show$loadCatalog$1.$previous, umbrellaGallery$show$loadCatalog$1.$next, umbrellaGallery$show$loadCatalog$1.$progress, umbrellaGallery$show$loadCatalog$1.$error);
                    return Unit.INSTANCE;
                } catch (CancellationException cancelled3) {
                    throw cancelled3;
                } catch (Exception e3) {
                    error = e3;
                    ProgressBar progressBar3 = umbrellaGallery$show$loadCatalog$2.$progress;
                    TextView textView3 = umbrellaGallery$show$loadCatalog$2.$error;
                    message = error.getMessage();
                    if (message == null) {
                        message = "Не удалось открыть галерею";
                    }
                    UmbrellaGallery.show$failed(progressBar3, textView3, message);
                    return Unit.INSTANCE;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
