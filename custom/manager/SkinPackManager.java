package com.blackhub.bronline.neizzir.fragments.custom.manager;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.neizzir.activities.main.util.CustomResources;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomFile;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomIndex;
import com.blackhub.bronline.neizzir.network.CachePolicy;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.EndpointRouter;
import com.blackhub.bronline.neizzir.network.NetworkResult;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.CloseableKt;
import kotlin.p040io.FilesKt__UtilsKt;
import kotlin.p040io.TextStreamsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.p043io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: SkinPackManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tJ(\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u000e0\u0014J\u001e\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u0017\u001a\u00020\tH\u0002J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0002J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001bH\u0002J\u0016\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\tH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006!"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkinPackManager;", "", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "ctx", "Landroid/content/Context;", "<set-?>", "", "", "latestSkinFiles", "getLatestSkinFiles", "()Ljava/util/List;", "downloadSkin", "", "skinId", "fetchSkinList", "logosDir", "Ljava/io/File;", "onResult", "Lkotlin/Function1;", "packSkinFiles", "files", "newName", "performSkinDownload", "renameId", "readSkinsMapping", "", "runOnMain", "block", "Lkotlin/Function0;", "toast", NotificationCompat.CATEGORY_MESSAGE, "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class SkinPackManager {
    private final Context ctx;
    private final Fragment fragment;
    private List<String> latestSkinFiles;

    public SkinPackManager(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
        Context contextRequireContext = this.fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.ctx = contextRequireContext;
        this.latestSkinFiles = CollectionsKt__CollectionsKt.emptyList();
    }

    public final List<String> getLatestSkinFiles() {
        return this.latestSkinFiles;
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$fetchSkinList$1 */
    /* JADX INFO: compiled from: SkinPackManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$fetchSkinList$1", m4426f = "SkinPackManager.kt", m4427i = {0}, m4428l = {52, 63}, m4429m = "invokeSuspend", m4430n = {"$this$launch"}, m4431s = {"L$0"})
    static final class C53681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<String>, Unit> $onResult;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C53681(Function1<? super List<String>, Unit> function1, Continuation<? super C53681> continuation) {
            super(2, continuation);
            this.$onResult = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C53681 c53681 = SkinPackManager.this.new C53681(this.$onResult, continuation);
            c53681.L$0 = obj;
            return c53681;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0078  */
        /* JADX WARN: Code duplicated, block: B:15:0x007c  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:40:0x010c  */
        /* JADX WARN: Code duplicated, block: B:46:0x016a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:47:0x016b  */
        /* JADX WARN: Code duplicated, block: B:54:0x0135 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:56:0x0106 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object bytes;
            C53681 c53681;
            Object $result2;
            NetworkResult result;
            NetworkResult.Success success;
            List files;
            Collection destination$iv$iv;
            List ids;
            List list;
            String str;
            byte[] it;
            Object objM15551constructorimpl;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    final CoroutineScope $this$launch = (CoroutineScope) this.L$0;
                    EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                    CachePolicy.LastKnownGood lastKnownGood = new CachePolicy.LastKnownGood("custom-index:skins", 0L, 2, null);
                    Function1<byte[], Boolean> function1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$fetchSkinList$1$result$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(byte[] it2) {
                            Object objM15551constructorimpl2;
                            Intrinsics.checkNotNullParameter(it2, "it");
                            CoroutineScope coroutineScope = $this$launch;
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                objM15551constructorimpl2 = Result.m15551constructorimpl(Boolean.valueOf(!RemoteCustomIndex.INSTANCE.parseFiles(new String(it2, Charsets.UTF_8)).isEmpty()));
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM15551constructorimpl2 = Result.m15551constructorimpl(ResultKt.createFailure(th));
                            }
                            if (Result.m15557isFailureimpl(objM15551constructorimpl2)) {
                                objM15551constructorimpl2 = false;
                            }
                            return (Boolean) objM15551constructorimpl2;
                        }
                    };
                    this.L$0 = $this$launch;
                    this.label = 1;
                    bytes = router.getBytes(endpointGroup, "/api/skins", (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : lastKnownGood, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? EndpointRouter.C56582.INSTANCE : function1, this);
                    if (bytes == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c53681 = this;
                    $result2 = $result;
                    result = (NetworkResult) bytes;
                    if (result instanceof NetworkResult.Success) {
                        success = (NetworkResult.Success) result;
                    } else {
                        success = null;
                    }
                    if (success == null && (it = (byte[]) success.getValue()) != null) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            objM15551constructorimpl = Result.m15551constructorimpl(RemoteCustomIndex.INSTANCE.parseFiles(new String(it, Charsets.UTF_8)));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                        }
                        if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
                            objM15551constructorimpl = null;
                        }
                        Iterable iterable = (List) objM15551constructorimpl;
                        if (iterable != null) {
                            Iterable $this$map$iv = iterable;
                            Collection destination$iv$iv2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
                            for (Object item$iv$iv : $this$map$iv) {
                                destination$iv$iv2.add(((RemoteCustomFile) item$iv$iv).getPath());
                            }
                            files = (List) destination$iv$iv2;
                        } else {
                            files = null;
                        }
                        break;
                    } else {
                        files = null;
                    }
                    if (files == null) {
                        files = CollectionsKt__CollectionsKt.emptyList();
                    }
                    SkinPackManager.this.latestSkinFiles = files;
                    Iterable $this$forEach$iv$iv$iv = files;
                    destination$iv$iv = new ArrayList();
                    for (Object element$iv$iv : $this$forEach$iv$iv$iv) {
                        str = (String) CollectionsKt___CollectionsKt.getOrNull(StringsKt__StringsKt.split$default((CharSequence) element$iv$iv, new char[]{FileSystemKt.UnixPathSeparator}, false, 0, 6, (Object) null), 1);
                        if (str != null) {
                            destination$iv$iv.add(str);
                        }
                    }
                    ids = CollectionsKt___CollectionsKt.distinct((List) destination$iv$iv);
                    list = files;
                    c53681.L$0 = null;
                    c53681.label = 2;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(list, SkinPackManager.this, c53681.$onResult, ids, null), c53681) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure($result);
                    bytes = $result;
                    c53681 = this;
                    $result2 = bytes;
                    result = (NetworkResult) bytes;
                    if (result instanceof NetworkResult.Success) {
                        success = (NetworkResult.Success) result;
                    } else {
                        success = null;
                    }
                    if (success == null) {
                        files = null;
                    } else {
                        files = null;
                    }
                    if (files == null) {
                        files = CollectionsKt__CollectionsKt.emptyList();
                    }
                    SkinPackManager.this.latestSkinFiles = files;
                    Iterable $this$forEach$iv$iv$iv2 = files;
                    destination$iv$iv = new ArrayList();
                    while (r12.hasNext()) {
                        str = (String) CollectionsKt___CollectionsKt.getOrNull(StringsKt__StringsKt.split$default((CharSequence) element$iv$iv, new char[]{FileSystemKt.UnixPathSeparator}, false, 0, 6, (Object) null), 1);
                        if (str != null) {
                            destination$iv$iv.add(str);
                        }
                    }
                    ids = CollectionsKt___CollectionsKt.distinct((List) destination$iv$iv);
                    list = files;
                    c53681.L$0 = null;
                    c53681.label = 2;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(list, SkinPackManager.this, c53681.$onResult, ids, null), c53681) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$fetchSkinList$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: SkinPackManager.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$fetchSkinList$1$1", m4426f = "SkinPackManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<String> $files;
            final /* synthetic */ List<String> $ids;
            final /* synthetic */ Function1<List<String>, Unit> $onResult;
            int label;
            final /* synthetic */ SkinPackManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(List<String> list, SkinPackManager skinPackManager, Function1<? super List<String>, Unit> function1, List<String> list2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$files = list;
                this.this$0 = skinPackManager;
                this.$onResult = function1;
                this.$ids = list2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$files, this.this$0, this.$onResult, this.$ids, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        if (this.$files.isEmpty()) {
                            this.this$0.toast("Не удалось получить список скинов");
                        }
                        this.$onResult.invoke(this.$ids);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void fetchSkinList(File logosDir, Function1<? super List<String>, Unit> onResult) {
        Intrinsics.checkNotNullParameter(logosDir, "logosDir");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        BuildersKt__Builders_commonKt.launch$default(NetworkRuntime.INSTANCE.getApplicationScope(), null, null, new C53681(onResult, null), 3, null);
    }

    public final void downloadSkin(final String skinId) {
        Intrinsics.checkNotNullParameter(skinId, "skinId");
        final float density = this.ctx.getResources().getDisplayMetrics().density;
        Function1<Integer, Integer> function1 = new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$downloadSkin$dp$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Integer invoke(int value) {
                return Integer.valueOf((int) (value * density));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        };
        final AlertDialog dialog = new AlertDialog.Builder(this.ctx).create();
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        MaterialCardView $this$downloadSkin_u24lambda_u241 = new MaterialCardView(this.ctx);
        FrameLayout.LayoutParams $this$downloadSkin_u24lambda_u241_u24lambda_u240 = new FrameLayout.LayoutParams(-1, -2);
        $this$downloadSkin_u24lambda_u241_u24lambda_u240.setMargins(function1.invoke(24).intValue(), function1.invoke(48).intValue(), function1.invoke(24).intValue(), function1.invoke(48).intValue());
        $this$downloadSkin_u24lambda_u241.setLayoutParams($this$downloadSkin_u24lambda_u241_u24lambda_u240);
        $this$downloadSkin_u24lambda_u241.setRadius(24.0f * density);
        $this$downloadSkin_u24lambda_u241.setCardElevation(density * 12.0f);
        $this$downloadSkin_u24lambda_u241.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        $this$downloadSkin_u24lambda_u241.setStrokeWidth(function1.invoke(1).intValue());
        $this$downloadSkin_u24lambda_u241.setStrokeColor(Color.parseColor("#2D2D35"));
        LinearLayout rootLayout = new LinearLayout(this.ctx);
        rootLayout.setOrientation(1);
        rootLayout.setPadding(function1.invoke(24).intValue(), function1.invoke(24).intValue(), function1.invoke(24).intValue(), function1.invoke(24).intValue());
        LinearLayout headerLayout = new LinearLayout(this.ctx);
        headerLayout.setOrientation(0);
        headerLayout.setGravity(16);
        LinearLayout.LayoutParams $this$downloadSkin_u24lambda_u244_u24lambda_u243 = new LinearLayout.LayoutParams(-1, -2);
        $this$downloadSkin_u24lambda_u244_u24lambda_u243.bottomMargin = function1.invoke(20).intValue();
        headerLayout.setLayoutParams($this$downloadSkin_u24lambda_u244_u24lambda_u243);
        FrameLayout $this$downloadSkin_u24lambda_u246 = new FrameLayout(this.ctx);
        GradientDrawable $this$downloadSkin_u24lambda_u246_u24lambda_u245 = new GradientDrawable();
        $this$downloadSkin_u24lambda_u246_u24lambda_u245.setShape(0);
        $this$downloadSkin_u24lambda_u246_u24lambda_u245.setCornerRadius(density * 12.0f);
        $this$downloadSkin_u24lambda_u246_u24lambda_u245.setColor(Color.parseColor("#1A00E5CC"));
        $this$downloadSkin_u24lambda_u246.setBackground($this$downloadSkin_u24lambda_u246_u24lambda_u245);
        $this$downloadSkin_u24lambda_u246.setLayoutParams(new LinearLayout.LayoutParams(function1.invoke(48).intValue(), function1.invoke(48).intValue()));
        ImageView $this$downloadSkin_u24lambda_u247 = new ImageView(this.ctx);
        $this$downloadSkin_u24lambda_u247.setImageResource(C3715R.drawable.neizzir19_ic_body);
        $this$downloadSkin_u24lambda_u247.setColorFilter(Color.parseColor("#00E5CC"));
        $this$downloadSkin_u24lambda_u247.setLayoutParams(new FrameLayout.LayoutParams(function1.invoke(28).intValue(), function1.invoke(28).intValue(), 17));
        $this$downloadSkin_u24lambda_u246.addView($this$downloadSkin_u24lambda_u247);
        TextView $this$downloadSkin_u24lambda_u249 = new TextView(this.ctx);
        $this$downloadSkin_u24lambda_u249.setText("Установка скина");
        $this$downloadSkin_u24lambda_u249.setTextSize(18.0f);
        $this$downloadSkin_u24lambda_u249.setTextColor(-1);
        $this$downloadSkin_u24lambda_u249.setTypeface(null, 1);
        LinearLayout.LayoutParams $this$downloadSkin_u24lambda_u249_u24lambda_u248 = new LinearLayout.LayoutParams(-2, -2);
        $this$downloadSkin_u24lambda_u249_u24lambda_u248.setMarginStart(function1.invoke(14).intValue());
        $this$downloadSkin_u24lambda_u249.setLayoutParams($this$downloadSkin_u24lambda_u249_u24lambda_u248);
        headerLayout.addView($this$downloadSkin_u24lambda_u246);
        headerLayout.addView($this$downloadSkin_u24lambda_u249);
        rootLayout.addView(headerLayout);
        TextView $this$downloadSkin_u24lambda_u2411 = new TextView(this.ctx);
        $this$downloadSkin_u24lambda_u2411.setText("Введите ID скина из игры\nID можно узнать в инвентаре или командой /setskin");
        $this$downloadSkin_u24lambda_u2411.setTextSize(14.0f);
        $this$downloadSkin_u24lambda_u2411.setTextColor(Color.parseColor(TCPSettingsManager.COLOR_HINT));
        LinearLayout.LayoutParams $this$downloadSkin_u24lambda_u2411_u24lambda_u2410 = new LinearLayout.LayoutParams(-1, -2);
        $this$downloadSkin_u24lambda_u2411_u24lambda_u2410.bottomMargin = function1.invoke(20).intValue();
        $this$downloadSkin_u24lambda_u2411.setLayoutParams($this$downloadSkin_u24lambda_u2411_u24lambda_u2410);
        rootLayout.addView($this$downloadSkin_u24lambda_u2411);
        TextView $this$downloadSkin_u24lambda_u2413 = new TextView(this.ctx);
        $this$downloadSkin_u24lambda_u2413.setText("ID скина");
        $this$downloadSkin_u24lambda_u2413.setTextSize(13.0f);
        $this$downloadSkin_u24lambda_u2413.setTextColor(Color.parseColor("#B0FFFFFF"));
        $this$downloadSkin_u24lambda_u2413.setTypeface(null, 1);
        LinearLayout.LayoutParams $this$downloadSkin_u24lambda_u2413_u24lambda_u2412 = new LinearLayout.LayoutParams(-2, -2);
        $this$downloadSkin_u24lambda_u2413_u24lambda_u2412.bottomMargin = function1.invoke(8).intValue();
        $this$downloadSkin_u24lambda_u2413.setLayoutParams($this$downloadSkin_u24lambda_u2413_u24lambda_u2412);
        rootLayout.addView($this$downloadSkin_u24lambda_u2413);
        final EditText $this$downloadSkin_u24lambda_u2416 = new EditText(this.ctx);
        $this$downloadSkin_u24lambda_u2416.setHint("Например: 1");
        $this$downloadSkin_u24lambda_u2416.setHintTextColor(Color.parseColor("#404040"));
        $this$downloadSkin_u24lambda_u2416.setTextColor(-1);
        $this$downloadSkin_u24lambda_u2416.setTextSize(16.0f);
        $this$downloadSkin_u24lambda_u2416.setInputType(2);
        GradientDrawable $this$downloadSkin_u24lambda_u2416_u24lambda_u2414 = new GradientDrawable();
        $this$downloadSkin_u24lambda_u2416_u24lambda_u2414.setShape(0);
        $this$downloadSkin_u24lambda_u2416_u24lambda_u2414.setCornerRadius(12.0f * density);
        $this$downloadSkin_u24lambda_u2416_u24lambda_u2414.setColor(Color.parseColor("#2D2D35"));
        $this$downloadSkin_u24lambda_u2416.setBackground($this$downloadSkin_u24lambda_u2416_u24lambda_u2414);
        $this$downloadSkin_u24lambda_u2416.setPadding(function1.invoke(16).intValue(), function1.invoke(14).intValue(), function1.invoke(16).intValue(), function1.invoke(14).intValue());
        LinearLayout.LayoutParams $this$downloadSkin_u24lambda_u2416_u24lambda_u2415 = new LinearLayout.LayoutParams(-1, -2);
        $this$downloadSkin_u24lambda_u2416_u24lambda_u2415.bottomMargin = function1.invoke(20).intValue();
        $this$downloadSkin_u24lambda_u2416.setLayoutParams($this$downloadSkin_u24lambda_u2416_u24lambda_u2415);
        rootLayout.addView($this$downloadSkin_u24lambda_u2416);
        LinearLayout buttonsLayout = new LinearLayout(this.ctx);
        buttonsLayout.setOrientation(0);
        buttonsLayout.setGravity(GravityCompat.END);
        buttonsLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        MaterialButton $this$downloadSkin_u24lambda_u2420 = new MaterialButton(this.ctx);
        $this$downloadSkin_u24lambda_u2420.setText("Отмена");
        $this$downloadSkin_u24lambda_u2420.setTransformationMethod(null);
        $this$downloadSkin_u24lambda_u2420.setCornerRadius(function1.invoke(12).intValue());
        $this$downloadSkin_u24lambda_u2420.setTextColor(Color.parseColor(TCPSettingsManager.COLOR_HINT));
        $this$downloadSkin_u24lambda_u2420.setBackgroundColor(0);
        $this$downloadSkin_u24lambda_u2420.setStrokeColor(ColorStateList.valueOf(Color.parseColor("#2D2D35")));
        $this$downloadSkin_u24lambda_u2420.setStrokeWidth(function1.invoke(1).intValue());
        LinearLayout.LayoutParams $this$downloadSkin_u24lambda_u2420_u24lambda_u2418 = new LinearLayout.LayoutParams(-2, -2);
        $this$downloadSkin_u24lambda_u2420_u24lambda_u2418.setMarginEnd(function1.invoke(8).intValue());
        $this$downloadSkin_u24lambda_u2420.setLayoutParams($this$downloadSkin_u24lambda_u2420_u24lambda_u2418);
        $this$downloadSkin_u24lambda_u2420.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialog.dismiss();
            }
        });
        MaterialButton $this$downloadSkin_u24lambda_u2422 = new MaterialButton(this.ctx);
        $this$downloadSkin_u24lambda_u2422.setText("Скачать");
        $this$downloadSkin_u24lambda_u2422.setTransformationMethod(null);
        $this$downloadSkin_u24lambda_u2422.setCornerRadius(function1.invoke(12).intValue());
        $this$downloadSkin_u24lambda_u2422.setBackgroundColor(Color.parseColor("#00E5CC"));
        $this$downloadSkin_u24lambda_u2422.setTextColor(Color.parseColor("#0A0A0F"));
        $this$downloadSkin_u24lambda_u2422.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        $this$downloadSkin_u24lambda_u2422.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkinPackManager.downloadSkin$lambda$22$lambda$21($this$downloadSkin_u24lambda_u2416, this, dialog, skinId, view);
            }
        });
        buttonsLayout.addView($this$downloadSkin_u24lambda_u2420);
        buttonsLayout.addView($this$downloadSkin_u24lambda_u2422);
        rootLayout.addView(buttonsLayout);
        $this$downloadSkin_u24lambda_u241.addView(rootLayout);
        dialog.setView($this$downloadSkin_u24lambda_u241);
        dialog.show();
        $this$downloadSkin_u24lambda_u2416.requestFocus();
        Object systemService = this.ctx.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager imm = (InputMethodManager) systemService;
        imm.showSoftInput($this$downloadSkin_u24lambda_u2416, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadSkin$lambda$22$lambda$21(EditText input, SkinPackManager this$0, AlertDialog $dialog, String skinId, View it) {
        Intrinsics.checkNotNullParameter(input, "$input");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(skinId, "$skinId");
        String renameId = StringsKt__StringsKt.trim((CharSequence) input.getText().toString()).toString();
        if (renameId.length() == 0) {
            this$0.toast("⚠️ ID не может быть пустым");
        } else {
            $dialog.dismiss();
            this$0.performSkinDownload(skinId, renameId);
        }
    }

    private final void performSkinDownload(String skinId, String renameId) {
        String newName = readSkinsMapping().get(renameId);
        if (newName == null) {
            SkinPackManager $this$performSkinDownload_u24lambda_u2423 = this;
            $this$performSkinDownload_u24lambda_u2423.toast("ID " + renameId + " не найден");
            return;
        }
        Iterable $this$filter$iv = this.latestSkinFiles;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            String it = (String) element$iv$iv;
            Iterable $this$filter$iv2 = $this$filter$iv;
            if (StringsKt__StringsJVMKt.startsWith$default(it, new StringBuilder().append("skins/").append(skinId).append(FileSystemKt.UnixPathSeparator).toString(), false, 2, null) && !StringsKt__StringsJVMKt.endsWith$default(it, "logo.jpgg", false, 2, null)) {
                destination$iv$iv.add(element$iv$iv);
            }
            $this$filter$iv = $this$filter$iv2;
        }
        List toDownload = (List) destination$iv$iv;
        if (toDownload.isEmpty()) {
            toast("Нет файлов для скина " + skinId);
            return;
        }
        final float density = this.ctx.getResources().getDisplayMetrics().density;
        Function1<Integer, Integer> function1 = new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$performSkinDownload$dp$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Integer invoke(int value) {
                return Integer.valueOf((int) (value * density));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        };
        AlertDialog dialog = new AlertDialog.Builder(this.ctx).create();
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        MaterialCardView $this$performSkinDownload_u24lambda_u2426 = new MaterialCardView(this.ctx);
        FrameLayout.LayoutParams $this$performSkinDownload_u24lambda_u2426_u24lambda_u2425 = new FrameLayout.LayoutParams(-1, -2);
        $this$performSkinDownload_u24lambda_u2426_u24lambda_u2425.setMargins(function1.invoke(24).intValue(), function1.invoke(48).intValue(), function1.invoke(24).intValue(), function1.invoke(48).intValue());
        $this$performSkinDownload_u24lambda_u2426.setLayoutParams($this$performSkinDownload_u24lambda_u2426_u24lambda_u2425);
        $this$performSkinDownload_u24lambda_u2426.setRadius(24.0f * density);
        $this$performSkinDownload_u24lambda_u2426.setCardElevation(density * 12.0f);
        $this$performSkinDownload_u24lambda_u2426.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        $this$performSkinDownload_u24lambda_u2426.setStrokeWidth(function1.invoke(1).intValue());
        $this$performSkinDownload_u24lambda_u2426.setStrokeColor(Color.parseColor("#2D2D35"));
        LinearLayout $this$performSkinDownload_u24lambda_u2427 = new LinearLayout(this.ctx);
        $this$performSkinDownload_u24lambda_u2427.setOrientation(1);
        $this$performSkinDownload_u24lambda_u2427.setPadding(function1.invoke(24).intValue(), function1.invoke(24).intValue(), function1.invoke(24).intValue(), function1.invoke(24).intValue());
        LinearLayout $this$performSkinDownload_u24lambda_u2429 = new LinearLayout(this.ctx);
        $this$performSkinDownload_u24lambda_u2429.setOrientation(0);
        $this$performSkinDownload_u24lambda_u2429.setGravity(16);
        LinearLayout.LayoutParams $this$performSkinDownload_u24lambda_u2429_u24lambda_u2428 = new LinearLayout.LayoutParams(-1, -2);
        $this$performSkinDownload_u24lambda_u2429_u24lambda_u2428.bottomMargin = function1.invoke(20).intValue();
        $this$performSkinDownload_u24lambda_u2429.setLayoutParams($this$performSkinDownload_u24lambda_u2429_u24lambda_u2428);
        FrameLayout $this$performSkinDownload_u24lambda_u2431 = new FrameLayout(this.ctx);
        GradientDrawable $this$performSkinDownload_u24lambda_u2431_u24lambda_u2430 = new GradientDrawable();
        $this$performSkinDownload_u24lambda_u2431_u24lambda_u2430.setShape(0);
        $this$performSkinDownload_u24lambda_u2431_u24lambda_u2430.setCornerRadius(12.0f * density);
        $this$performSkinDownload_u24lambda_u2431_u24lambda_u2430.setColor(Color.parseColor("#1A00E5CC"));
        $this$performSkinDownload_u24lambda_u2431.setBackground($this$performSkinDownload_u24lambda_u2431_u24lambda_u2430);
        $this$performSkinDownload_u24lambda_u2431.setLayoutParams(new LinearLayout.LayoutParams(function1.invoke(48).intValue(), function1.invoke(48).intValue()));
        ImageView $this$performSkinDownload_u24lambda_u2432 = new ImageView(this.ctx);
        $this$performSkinDownload_u24lambda_u2432.setImageResource(C3715R.drawable.neizzir19_ic_body);
        $this$performSkinDownload_u24lambda_u2432.setColorFilter(Color.parseColor("#00E5CC"));
        $this$performSkinDownload_u24lambda_u2432.setLayoutParams(new FrameLayout.LayoutParams(function1.invoke(28).intValue(), function1.invoke(28).intValue(), 17));
        $this$performSkinDownload_u24lambda_u2431.addView($this$performSkinDownload_u24lambda_u2432);
        TextView $this$performSkinDownload_u24lambda_u2434 = new TextView(this.ctx);
        $this$performSkinDownload_u24lambda_u2434.setText("Скачивание скина");
        $this$performSkinDownload_u24lambda_u2434.setTextSize(18.0f);
        $this$performSkinDownload_u24lambda_u2434.setTextColor(-1);
        $this$performSkinDownload_u24lambda_u2434.setTypeface(null, 1);
        LinearLayout.LayoutParams $this$performSkinDownload_u24lambda_u2434_u24lambda_u2433 = new LinearLayout.LayoutParams(-2, -2);
        $this$performSkinDownload_u24lambda_u2434_u24lambda_u2433.setMarginStart(function1.invoke(14).intValue());
        $this$performSkinDownload_u24lambda_u2434.setLayoutParams($this$performSkinDownload_u24lambda_u2434_u24lambda_u2433);
        $this$performSkinDownload_u24lambda_u2429.addView($this$performSkinDownload_u24lambda_u2431);
        $this$performSkinDownload_u24lambda_u2429.addView($this$performSkinDownload_u24lambda_u2434);
        $this$performSkinDownload_u24lambda_u2427.addView($this$performSkinDownload_u24lambda_u2429);
        TextView $this$performSkinDownload_u24lambda_u2436 = new TextView(this.ctx);
        $this$performSkinDownload_u24lambda_u2436.setText("Скин #" + skinId + " → ID " + renameId);
        $this$performSkinDownload_u24lambda_u2436.setTextSize(14.0f);
        $this$performSkinDownload_u24lambda_u2436.setTextColor(Color.parseColor(TCPSettingsManager.COLOR_HINT));
        LinearLayout.LayoutParams $this$performSkinDownload_u24lambda_u2436_u24lambda_u2435 = new LinearLayout.LayoutParams(-1, -2);
        $this$performSkinDownload_u24lambda_u2436_u24lambda_u2435.bottomMargin = function1.invoke(20).intValue();
        $this$performSkinDownload_u24lambda_u2436.setLayoutParams($this$performSkinDownload_u24lambda_u2436_u24lambda_u2435);
        $this$performSkinDownload_u24lambda_u2427.addView($this$performSkinDownload_u24lambda_u2436);
        ProgressBar $this$performSkinDownload_u24lambda_u2438 = new ProgressBar(this.ctx, null, R.attr.progressBarStyleHorizontal);
        $this$performSkinDownload_u24lambda_u2438.setMax(toDownload.size());
        $this$performSkinDownload_u24lambda_u2438.setProgress(0);
        $this$performSkinDownload_u24lambda_u2438.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#00E5CC")));
        $this$performSkinDownload_u24lambda_u2438.setProgressBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#2D2D35")));
        LinearLayout.LayoutParams $this$performSkinDownload_u24lambda_u2438_u24lambda_u2437 = new LinearLayout.LayoutParams(-1, function1.invoke(8).intValue());
        $this$performSkinDownload_u24lambda_u2438_u24lambda_u2437.bottomMargin = function1.invoke(12).intValue();
        $this$performSkinDownload_u24lambda_u2438.setLayoutParams($this$performSkinDownload_u24lambda_u2438_u24lambda_u2437);
        $this$performSkinDownload_u24lambda_u2427.addView($this$performSkinDownload_u24lambda_u2438);
        TextView $this$performSkinDownload_u24lambda_u2439 = new TextView(this.ctx);
        $this$performSkinDownload_u24lambda_u2439.setText("0 / " + toDownload.size() + " файлов");
        $this$performSkinDownload_u24lambda_u2439.setTextSize(14.0f);
        $this$performSkinDownload_u24lambda_u2439.setTextColor(Color.parseColor("#B0FFFFFF"));
        $this$performSkinDownload_u24lambda_u2439.setGravity(17);
        $this$performSkinDownload_u24lambda_u2427.addView($this$performSkinDownload_u24lambda_u2439);
        $this$performSkinDownload_u24lambda_u2426.addView($this$performSkinDownload_u24lambda_u2427);
        dialog.setView($this$performSkinDownload_u24lambda_u2426);
        dialog.show();
        AtomicInteger doneCnt = new AtomicInteger(0);
        List tempFiles = Collections.synchronizedList(new ArrayList());
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C53701(toDownload, tempFiles, this, newName, doneCnt, dialog, $this$performSkinDownload_u24lambda_u2438, $this$performSkinDownload_u24lambda_u2439, $this$performSkinDownload_u24lambda_u2434, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$performSkinDownload$1 */
    /* JADX INFO: compiled from: SkinPackManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$performSkinDownload$1", m4426f = "SkinPackManager.kt", m4427i = {}, m4428l = {373, 377, 392, 397}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C53701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProgressBar $bar;
        final /* synthetic */ AlertDialog $dialog;
        final /* synthetic */ AtomicInteger $doneCnt;
        final /* synthetic */ String $newName;
        final /* synthetic */ List<File> $tempFiles;
        final /* synthetic */ TextView $titleView;
        final /* synthetic */ List<String> $toDownload;
        final /* synthetic */ TextView $txt;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SkinPackManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53701(List<String> list, List<File> list2, SkinPackManager skinPackManager, String str, AtomicInteger atomicInteger, AlertDialog alertDialog, ProgressBar progressBar, TextView textView, TextView textView2, Continuation<? super C53701> continuation) {
            super(2, continuation);
            this.$toDownload = list;
            this.$tempFiles = list2;
            this.this$0 = skinPackManager;
            this.$newName = str;
            this.$doneCnt = atomicInteger;
            this.$dialog = alertDialog;
            this.$bar = progressBar;
            this.$txt = textView;
            this.$titleView = textView2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C53701 c53701 = new C53701(this.$toDownload, this.$tempFiles, this.this$0, this.$newName, this.$doneCnt, this.$dialog, this.$bar, this.$txt, this.$titleView, continuation);
            c53701.L$0 = obj;
            return c53701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:30:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:32:0x0104  */
        /* JADX WARN: Code duplicated, block: B:33:0x0106  */
        /* JADX WARN: Code duplicated, block: B:39:0x0112  */
        /* JADX WARN: Code duplicated, block: B:42:0x0124 A[LOOP:0: B:40:0x011e->B:42:0x0124, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:45:0x014f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x0150  */
        /* JADX WARN: Code duplicated, block: B:49:0x0155  */
        /* JADX WARN: Code duplicated, block: B:52:0x0192 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:53:0x0193  */
        /* JADX WARN: Code duplicated, block: B:59:0x01ba A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:60:0x01bb  */
        /* JADX WARN: Code duplicated, block: B:69:0x0109 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:73:? A[LOOP:1: B:28:0x00ef->B:73:?, LOOP_END, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object $result2;
            Object $result3;
            C53701 c53701;
            Iterable $this$all$iv;
            boolean it;
            boolean it2;
            boolean successful;
            Exception e;
            C53701 c53702;
            Object $result4;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            boolean z = true;
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CoroutineScope $this$launch = (CoroutineScope) this.L$0;
                    Iterable $this$map$iv = this.$toDownload;
                    SkinPackManager skinPackManager = this.this$0;
                    List<File> list = this.$tempFiles;
                    AtomicInteger atomicInteger = this.$doneCnt;
                    AlertDialog alertDialog = this.$dialog;
                    ProgressBar progressBar = this.$bar;
                    TextView textView = this.$txt;
                    List<String> list2 = this.$toDownload;
                    Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
                    for (Object item$iv$iv : $this$map$iv) {
                        String path = (String) item$iv$iv;
                        List<String> list3 = list2;
                        TextView textView2 = textView;
                        ProgressBar progressBar2 = progressBar;
                        AlertDialog alertDialog2 = alertDialog;
                        destination$iv$iv.add(BuildersKt__Builders_commonKt.async$default($this$launch, null, null, new SkinPackManager$performSkinDownload$1$successful$1$1(skinPackManager, path, list, atomicInteger, alertDialog2, progressBar2, textView2, list3, null), 3, null));
                        list2 = list3;
                        textView = textView2;
                        progressBar = progressBar2;
                        alertDialog = alertDialog2;
                        atomicInteger = atomicInteger;
                        list = list;
                        skinPackManager = skinPackManager;
                    }
                    this.label = 1;
                    Object objAwaitAll = AwaitKt.awaitAll((List) destination$iv$iv, this);
                    if (objAwaitAll == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result2 = $result;
                    $result3 = objAwaitAll;
                    c53701 = this;
                    $this$all$iv = (Iterable) $result3;
                    if (($this$all$iv instanceof Collection) || !((Collection) $this$all$iv).isEmpty()) {
                        for (Object element$iv : $this$all$iv) {
                            it = ((Boolean) element$iv).booleanValue();
                            if (it) {
                                it2 = true;
                            } else {
                                it2 = false;
                            }
                            if (!it2) {
                                z = false;
                            }
                        }
                    }
                    successful = z;
                    if (!successful) {
                        Iterable tempFiles = c53701.$tempFiles;
                        Intrinsics.checkNotNullExpressionValue(tempFiles, "$tempFiles");
                        Iterable $this$forEach$iv = tempFiles;
                        for (Object element$iv2 : $this$forEach$iv) {
                            File p0 = (File) element$iv2;
                            p0.delete();
                        }
                        c53701.label = 2;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(c53701.$dialog, c53701.this$0, null), c53701) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    SkinPackManager skinPackManager2 = c53701.this$0;
                    final AlertDialog alertDialog3 = c53701.$dialog;
                    final TextView textView3 = c53701.$titleView;
                    final TextView textView4 = c53701.$txt;
                    skinPackManager2.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager.performSkinDownload.1.3
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
                            if (alertDialog3.isShowing()) {
                                textView3.setText("Упаковка файлов...");
                                textView4.setText("Подготовка архива...");
                            }
                        }
                    });
                    try {
                        SkinPackManager skinPackManager3 = c53701.this$0;
                        List<File> tempFiles2 = c53701.$tempFiles;
                        Intrinsics.checkNotNullExpressionValue(tempFiles2, "$tempFiles");
                        skinPackManager3.packSkinFiles(tempFiles2, c53701.$newName);
                        c53701.label = 3;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass4(c53701.$dialog, c53701.this$0, null), c53701) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    } catch (Exception e2) {
                        C53701 c53703 = c53701;
                        e = e2;
                        c53702 = c53703;
                        c53702.label = 4;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass5(c53702.$dialog, c53702.this$0, e, null), c53702) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        $result4 = $result2;
                    }
                    break;
                case 1:
                    $result3 = $result;
                    ResultKt.throwOnFailure($result3);
                    c53701 = this;
                    $result2 = $result3;
                    $this$all$iv = (Iterable) $result3;
                    if ($this$all$iv instanceof Collection) {
                        while (r7.hasNext()) {
                            it = ((Boolean) element$iv).booleanValue();
                            if (it) {
                                it2 = true;
                            } else {
                                it2 = false;
                            }
                            if (!it2) {
                                z = false;
                            }
                        }
                    } else {
                        while (r7.hasNext()) {
                            it = ((Boolean) element$iv).booleanValue();
                            if (it) {
                                it2 = true;
                            } else {
                                it2 = false;
                            }
                            if (!it2) {
                                z = false;
                            }
                        }
                    }
                    successful = z;
                    if (!successful) {
                        Iterable tempFiles3 = c53701.$tempFiles;
                        Intrinsics.checkNotNullExpressionValue(tempFiles3, "$tempFiles");
                        Iterable $this$forEach$iv2 = tempFiles3;
                        while (r5.hasNext()) {
                            File p1 = (File) element$iv2;
                            p1.delete();
                        }
                        c53701.label = 2;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(c53701.$dialog, c53701.this$0, null), c53701) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    SkinPackManager skinPackManager4 = c53701.this$0;
                    final AlertDialog alertDialog4 = c53701.$dialog;
                    final TextView textView5 = c53701.$titleView;
                    final TextView textView6 = c53701.$txt;
                    skinPackManager4.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager.performSkinDownload.1.3
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
                            if (alertDialog4.isShowing()) {
                                textView5.setText("Упаковка файлов...");
                                textView6.setText("Подготовка архива...");
                            }
                        }
                    });
                    SkinPackManager skinPackManager5 = c53701.this$0;
                    List<File> tempFiles4 = c53701.$tempFiles;
                    Intrinsics.checkNotNullExpressionValue(tempFiles4, "$tempFiles");
                    skinPackManager5.packSkinFiles(tempFiles4, c53701.$newName);
                    c53701.label = 3;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass4(c53701.$dialog, c53701.this$0, null), c53701) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 2:
                    ResultKt.throwOnFailure($result);
                    return Unit.INSTANCE;
                case 3:
                    try {
                        ResultKt.throwOnFailure($result);
                        break;
                    } catch (Exception e3) {
                        e = e3;
                        c53702 = this;
                        $result2 = $result;
                        c53702.label = 4;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass5(c53702.$dialog, c53702.this$0, e, null), c53702) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        $result4 = $result2;
                    }
                    return Unit.INSTANCE;
                case 4:
                    c53702 = this;
                    $result4 = $result;
                    ResultKt.throwOnFailure($result4);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$performSkinDownload$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: SkinPackManager.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$performSkinDownload$1$2", m4426f = "SkinPackManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ AlertDialog $dialog;
            int label;
            final /* synthetic */ SkinPackManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AlertDialog alertDialog, SkinPackManager skinPackManager, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$dialog = alertDialog;
                this.this$0 = skinPackManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$dialog, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        if (this.$dialog.isShowing()) {
                            this.$dialog.dismiss();
                        }
                        this.this$0.toast("⚠️ Не удалось скачать все файлы скина");
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$performSkinDownload$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: SkinPackManager.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$performSkinDownload$1$4", m4426f = "SkinPackManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ AlertDialog $dialog;
            int label;
            final /* synthetic */ SkinPackManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(AlertDialog alertDialog, SkinPackManager skinPackManager, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$dialog = alertDialog;
                this.this$0 = skinPackManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$dialog, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        if (this.$dialog.isShowing()) {
                            this.$dialog.dismiss();
                        }
                        this.this$0.toast("✓ Скин установлен");
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$performSkinDownload$1$5, reason: invalid class name */
        /* JADX INFO: compiled from: SkinPackManager.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$performSkinDownload$1$5", m4426f = "SkinPackManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ AlertDialog $dialog;

            /* JADX INFO: renamed from: $e */
            final /* synthetic */ Exception f808$e;
            int label;
            final /* synthetic */ SkinPackManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(AlertDialog alertDialog, SkinPackManager skinPackManager, Exception exc, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.$dialog = alertDialog;
                this.this$0 = skinPackManager;
                this.f808$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.$dialog, this.this$0, this.f808$e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        if (this.$dialog.isShowing()) {
                            this.$dialog.dismiss();
                        }
                        this.this$0.toast("⚠️ Ошибка упаковки: " + this.f808$e.getMessage());
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void packSkinFiles(final List<? extends File> files, final String newName) {
        CustomResources.INSTANCE.edit(this.ctx, new Function1<File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager.packSkinFiles.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(File file) throws IOException {
                invoke2(file);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(File stage) throws IOException {
                Intrinsics.checkNotNullParameter(stage, "stage");
                Iterable $this$forEach$iv = files;
                String str = newName;
                for (Object element$iv : $this$forEach$iv) {
                    File f = (File) element$iv;
                    String lowerCase = FilesKt__UtilsKt.getExtension(f).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.areEqual(lowerCase, "btx")) {
                        CustomResources customResources = CustomResources.INSTANCE;
                        String name = f.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        customResources.putTexture(stage, f, name);
                    } else if (Intrinsics.areEqual(lowerCase, "mod")) {
                        CustomResources customResources2 = CustomResources.INSTANCE;
                        String name2 = StringsKt__StringsJVMKt.equals(f.getName(), "skin.mod", true) ? str + ".mod" : f.getName();
                        Intrinsics.checkNotNull(name2);
                        customResources2.putModel(stage, f, name2);
                    }
                }
            }
        });
        List<? extends File> $this$forEach$iv = files;
        for (Object element$iv : $this$forEach$iv) {
            File it = (File) element$iv;
            it.delete();
        }
    }

    private final Map<String, String> readSkinsMapping() {
        Throwable th;
        Throwable th2;
        Map map = new LinkedHashMap();
        InputStream inputStreamOpenRawResource = this.ctx.getResources().openRawResource(C3715R.raw.skins);
        try {
            InputStream input = inputStreamOpenRawResource;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input));
            try {
                BufferedReader br = bufferedReader;
                for (Object element$iv : TextStreamsKt.lineSequence(br)) {
                    String line = (String) element$iv;
                    BufferedReader br2 = br;
                    try {
                        List parts = StringsKt__StringsKt.split$default((CharSequence) line, new char[]{AbstractJsonLexerKt.COMMA}, false, 2, 2, (Object) null);
                        if (parts.size() == 2) {
                            String id = StringsKt__StringsKt.trim((CharSequence) parts.get(0)).toString();
                            try {
                                String name = StringsKt__StringsKt.substringBefore$default(StringsKt__StringsKt.trim((CharSequence) parts.get(1)).toString(), ' ', (String) null, 2, (Object) null);
                                map.put(id, name);
                            } catch (Throwable th3) {
                                th2 = th3;
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    CloseableKt.closeFinally(bufferedReader, th);
                                    throw th4;
                                }
                            }
                        }
                        input = input;
                        br = br2;
                    } catch (Throwable th5) {
                        th2 = th5;
                        th = th2;
                        throw th;
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedReader, null);
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(inputStreamOpenRawResource, null);
                return map;
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                CloseableKt.closeFinally(inputStreamOpenRawResource, th7);
                throw th8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runOnMain(final Function0<Unit> block) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                SkinPackManager.runOnMain$lambda$44(block);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runOnMain$lambda$44(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toast(final String msg) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.SkinPackManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SkinPackManager.toast$lambda$45(this.f$0, msg);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toast$lambda$45(SkinPackManager this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "$msg");
        Toast.makeText(this$0.ctx, msg, 0).show();
    }
}
