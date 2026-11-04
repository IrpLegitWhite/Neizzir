package com.blackhub.bronline.neizzir.fragments.custom.manager;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.Constants;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.gui.donate.utils.DonateConstants;
import com.blackhub.bronline.neizzir.activities.main.util.CustomResources;
import com.blackhub.bronline.neizzir.fragments.custom.util.AccessoriesInventory;
import com.blackhub.bronline.neizzir.fragments.custom.util.AccessoryInfo;
import com.blackhub.bronline.neizzir.fragments.custom.util.AccessoryInventoryItem;
import com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomFile;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomIndex;
import com.blackhub.bronline.neizzir.network.CachePolicy;
import com.blackhub.bronline.neizzir.network.DownloadSpec;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.EndpointRouter;
import com.blackhub.bronline.neizzir.network.NetworkResult;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.helpshift.HelpshiftEvent;
import com.helpshift.proactive.InAppViewConstants;
import io.ktor.sse.ServerSentEventKt;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.p040io.FilesKt__UtilsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.p043io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.ZipParameters;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONObject;

/* JADX INFO: compiled from: AccessoriesManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u00018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0007H\u0002J\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u001fJ4\u0010 \u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010!\u001a\u00020\"2\u0018\u0010#\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%\u0012\u0004\u0012\u00020\u00100$H\u0002J(\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00142\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0006\u0012\u0004\u0012\u00020\u00100$J*\u0010*\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0006\u0012\u0004\u0012\u00020\u00100$H\u0002J\u0016\u0010+\u001a\u00020\u00102\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100-H\u0002J\n\u0010.\u001a\u0004\u0018\u00010\u0016H\u0002J\u001e\u0010/\u001a\u00020\u00102\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010\u001a\u001a\u00020\u0007H\u0002J\u0016\u00101\u001a\u00020\u00102\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100-H\u0002J\u001a\u00103\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00162\b\u00104\u001a\u0004\u0018\u00010\u0016H\u0002J\u000e\u00105\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0016J\u0010\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u00069"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/AccessoriesManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "inventory", "", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/AccessoryInventoryItem;", "jsonMediaType", "Lokhttp3/MediaType;", "<set-?>", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomFile;", "latestFileList", "getLatestFileList", "()Ljava/util/List;", "addFileReplacing", "", "zip", "Lnet/lingala/zip4j/ZipFile;", "file", "Ljava/io/File;", "entryName", "", "checkSubscriptionAndMaybeShowPicker", "packId", "downloadAndPack", TypedValues.AttributesType.S_TARGET, "downloadSingleFile", "", "remote", FirebaseAnalytics.Param.DESTINATION, "(Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomFile;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAccessoryInfo", FirebaseAnalytics.Param.INDEX, "", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/AccessoryInfo;", "fetchAccessoryList", "logosDir", "onResult", "fetchIndex", "fetchInventory", "onComplete", "Lkotlin/Function0;", "getLauncherKeyFromPrefs", "packFiles", "files", "runOnMain", "block", "showSubscribeDialog", HelpshiftEvent.DATA_ACTION_TYPE_LINK, "showTargetPickerAndDownload", "toast", "message", "InventorySearchAdapter", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class AccessoriesManager {
    private final Context context;
    private List<AccessoryInventoryItem> inventory;
    private final MediaType jsonMediaType;
    private List<RemoteCustomFile> latestFileList;

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$downloadSingleFile$1 */
    /* JADX INFO: compiled from: AccessoriesManager.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager", m4426f = "AccessoriesManager.kt", m4427i = {}, m4428l = {435}, m4429m = "downloadSingleFile", m4430n = {}, m4431s = {})
    static final class C53251 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C53251(Continuation<? super C53251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccessoriesManager.this.downloadSingleFile(null, null, this);
        }
    }

    public AccessoriesManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.latestFileList = CollectionsKt__CollectionsKt.emptyList();
        this.inventory = CollectionsKt__CollectionsKt.emptyList();
        this.jsonMediaType = MediaType.INSTANCE.get("application/json; charset=utf-8");
    }

    public final List<RemoteCustomFile> getLatestFileList() {
        return this.latestFileList;
    }

    public final void fetchAccessoryList(File logosDir, Function1<? super List<String>, Unit> onResult) {
        Intrinsics.checkNotNullParameter(logosDir, "logosDir");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        logosDir.mkdirs();
        fetchIndex(0, onResult);
    }

    public final void checkSubscriptionAndMaybeShowPicker(final String packId) {
        boolean hasInfo;
        Intrinsics.checkNotNullParameter(packId, "packId");
        String infoPath = "accessories/" + packId + "/info.json";
        Iterable $this$any$iv = this.latestFileList;
        boolean z = true;
        if (!($this$any$iv instanceof Collection) || !((Collection) $this$any$iv).isEmpty()) {
            Iterator it = $this$any$iv.iterator();
            while (true) {
                if (it.hasNext()) {
                    Object element$iv = it.next();
                    RemoteCustomFile it2 = (RemoteCustomFile) element$iv;
                    if (StringsKt__StringsJVMKt.equals(it2.getPath(), infoPath, true)) {
                        hasInfo = true;
                        break;
                    }
                } else {
                    hasInfo = false;
                    break;
                }
            }
        } else {
            hasInfo = false;
        }
        if (!hasInfo) {
            showTargetPickerAndDownload(packId);
            return;
        }
        final String keyValue = getLauncherKeyFromPrefs();
        String str = keyValue;
        if (str != null && !StringsKt__StringsKt.isBlank(str)) {
            z = false;
        }
        if (z) {
            toast("Не найден ключ игры. Запустите игру, активируйте ключ и попробуйте снова.");
        } else {
            fetchAccessoryInfo$default(this, packId, 0, new Function1<Result<? extends AccessoryInfo>, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager.checkSubscriptionAndMaybeShowPicker.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Result<? extends AccessoryInfo> result) {
                    m14859invoke(result.getValue());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m14859invoke(Object result) {
                    AccessoriesManager accessoriesManager = this;
                    Throwable error = Result.m15554exceptionOrNullimpl(result);
                    if (error != null) {
                        StringBuilder sbAppend = new StringBuilder().append("Ошибка info.json: ");
                        String message = error.getMessage();
                        if (message == null) {
                            message = "не удалось прочитать файл";
                        }
                        accessoriesManager.toast(sbAppend.append(message).toString());
                        return;
                    }
                    AccessoryInfo info = (AccessoryInfo) result;
                    String payload = new JSONObject().put("key_value", keyValue).put("channel_id", info.getChannelId()).toString();
                    Intrinsics.checkNotNullExpressionValue(payload, "toString(...)");
                    BuildersKt__Builders_commonKt.launch$default(NetworkRuntime.INSTANCE.getApplicationScope(), null, null, new AnonymousClass1(this, payload, packId, info, null), 3, null);
                }

                /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$checkSubscriptionAndMaybeShowPicker$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: AccessoriesManager.kt */
                @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
                @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$checkSubscriptionAndMaybeShowPicker$1$1", m4426f = "AccessoriesManager.kt", m4427i = {0}, m4428l = {97}, m4429m = "invokeSuspend", m4430n = {"$this$launch"}, m4431s = {"L$0"})
                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ AccessoryInfo $info;
                    final /* synthetic */ String $packId;
                    final /* synthetic */ String $payload;
                    private /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ AccessoriesManager this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(AccessoriesManager accessoriesManager, String str, String str2, AccessoryInfo accessoryInfo, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = accessoriesManager;
                        this.$payload = str;
                        this.$packId = str2;
                        this.$info = accessoryInfo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$payload, this.$packId, this.$info, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object $result) {
                        AnonymousClass1 anonymousClass1;
                        Object objPostBytes;
                        JSONObject parsed;
                        byte[] it;
                        Object objM15551constructorimpl;
                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        switch (this.label) {
                            case 0:
                                ResultKt.throwOnFailure($result);
                                anonymousClass1 = this;
                                final CoroutineScope $this$launch = (CoroutineScope) anonymousClass1.L$0;
                                EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                                EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                                final String str = anonymousClass1.$payload;
                                final AccessoriesManager accessoriesManager = anonymousClass1.this$0;
                                Function0<RequestBody> function0 = new Function0<RequestBody>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$checkSubscriptionAndMaybeShowPicker$1$1$response$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final RequestBody invoke() {
                                        return RequestBody.INSTANCE.create(str, accessoriesManager.jsonMediaType);
                                    }
                                };
                                Function1<byte[], Boolean> function1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$checkSubscriptionAndMaybeShowPicker$1$1$response$2
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
                                            new JSONObject(new String(it2, Charsets.UTF_8));
                                            objM15551constructorimpl2 = Result.m15551constructorimpl(true);
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
                                anonymousClass1.L$0 = $this$launch;
                                anonymousClass1.label = 1;
                                objPostBytes = router.postBytes(endpointGroup, "/api/subscription/check", function0, (232 & 8) != 0 ? MapsKt__MapsKt.emptyMap() : null, true, (232 & 32) != 0 ? SetsKt__SetsKt.emptySet() : null, (232 & 64) != 0 ? 2097152L : 0L, (232 & 128) != 0 ? EndpointRouter.C56622.INSTANCE : function1, anonymousClass1);
                                if (objPostBytes == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                break;
                            case 1:
                                ResultKt.throwOnFailure($result);
                                objPostBytes = $result;
                                anonymousClass1 = this;
                                break;
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        NetworkResult response = (NetworkResult) objPostBytes;
                        String str2 = null;
                        NetworkResult.Success success = response instanceof NetworkResult.Success ? (NetworkResult.Success) response : null;
                        if (success == null || (it = (byte[]) success.getValue()) == null) {
                            parsed = null;
                        } else {
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                objM15551constructorimpl = Result.m15551constructorimpl(new JSONObject(new String(it, Charsets.UTF_8)));
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                            }
                            if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
                                objM15551constructorimpl = null;
                            }
                            parsed = (JSONObject) objM15551constructorimpl;
                        }
                        if (parsed == null) {
                            anonymousClass1.this$0.toast("Проверка подписки не удалась");
                            return Unit.INSTANCE;
                        }
                        boolean ok = parsed.optBoolean("ok", false);
                        boolean isSubscribed = parsed.optBoolean("is_subscribed", false);
                        String strOptString = parsed.optString("message", "");
                        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                        String string = StringsKt__StringsKt.trim((CharSequence) strOptString).toString();
                        if (!(string.length() == 0)) {
                            str2 = string;
                        }
                        final String str3 = str2;
                        AccessoriesManager accessoriesManager2 = anonymousClass1.this$0;
                        final boolean z = ok;
                        final AccessoriesManager accessoriesManager3 = anonymousClass1.this$0;
                        final boolean z2 = isSubscribed;
                        final String str4 = anonymousClass1.$packId;
                        final AccessoryInfo accessoryInfo = anonymousClass1.$info;
                        accessoriesManager2.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager.checkSubscriptionAndMaybeShowPicker.1.1.1
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
                                if (!z) {
                                    AccessoriesManager accessoriesManager4 = accessoriesManager3;
                                    StringBuilder sbAppend = new StringBuilder().append("Сервер: ");
                                    String str5 = str3;
                                    if (str5 == null) {
                                        str5 = "ошибка проверки подписки";
                                    }
                                    accessoriesManager4.toast(sbAppend.append(str5).toString());
                                    return;
                                }
                                if (!z2) {
                                    accessoriesManager3.showSubscribeDialog(str4, accessoryInfo.getTelegramLink());
                                } else {
                                    accessoriesManager3.showTargetPickerAndDownload(str4);
                                }
                            }
                        });
                        return Unit.INSTANCE;
                    }
                }
            }, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, androidx.appcompat.app.AlertDialog, java.lang.Object] */
    public final void showTargetPickerAndDownload(final String packId) {
        AlertDialog alertDialog;
        AlertDialog alertDialog2;
        Intrinsics.checkNotNullParameter(packId, "packId");
        if (this.inventory.isEmpty()) {
            toast("Список аксессуаров не загружен");
            return;
        }
        final Ref.ObjectRef dialog = new Ref.ObjectRef();
        final InventorySearchAdapter adapter = new InventorySearchAdapter(new Function1<AccessoryInventoryItem, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$showTargetPickerAndDownload$adapter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AccessoryInventoryItem accessoryInventoryItem) {
                invoke2(accessoryInventoryItem);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AccessoryInventoryItem target) {
                AlertDialog alertDialog3;
                Intrinsics.checkNotNullParameter(target, "target");
                if (dialog.element == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    alertDialog3 = null;
                } else {
                    alertDialog3 = dialog.element;
                }
                alertDialog3.dismiss();
                this.downloadAndPack(packId, target);
            }
        });
        EditText searchInput = new EditText(this.context);
        searchInput.setHint("Поиск по названию, ID, model или цене");
        searchInput.setHintTextColor(Color.parseColor("#668B9AA5"));
        searchInput.setTextColor(-1);
        searchInput.setTextSize(14.0f);
        searchInput.setSingleLine(true);
        searchInput.setInputType(1);
        searchInput.setBackground(searchInput.getContext().getDrawable(C3715R.drawable.neizzir20_search_field_bg));
        Context context = searchInput.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM1424dp = AccessoriesManagerKt.m1424dp(context, 14);
        Context context2 = searchInput.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iM1424dp2 = AccessoriesManagerKt.m1424dp(context2, 12);
        Context context3 = searchInput.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iM1424dp3 = AccessoriesManagerKt.m1424dp(context3, 14);
        Context context4 = searchInput.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        searchInput.setPadding(iM1424dp, iM1424dp2, iM1424dp3, AccessoriesManagerKt.m1424dp(context4, 12));
        final TextView counter = new TextView(this.context);
        counter.setTextColor(Color.parseColor("#8B9AA5"));
        counter.setTextSize(12.0f);
        RecyclerView $this$showTargetPickerAndDownload_u24lambda_u244 = new RecyclerView(this.context);
        $this$showTargetPickerAndDownload_u24lambda_u244.setLayoutManager(new LinearLayoutManager($this$showTargetPickerAndDownload_u24lambda_u244.getContext()));
        $this$showTargetPickerAndDownload_u24lambda_u244.setItemAnimator(null);
        $this$showTargetPickerAndDownload_u24lambda_u244.setOverScrollMode(2);
        $this$showTargetPickerAndDownload_u24lambda_u244.setAdapter(adapter);
        Context context5 = $this$showTargetPickerAndDownload_u24lambda_u244.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        LinearLayout.LayoutParams $this$showTargetPickerAndDownload_u24lambda_u244_u24lambda_u243 = new LinearLayout.LayoutParams(-1, AccessoriesManagerKt.m1424dp(context5, 360));
        Context context6 = $this$showTargetPickerAndDownload_u24lambda_u244.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        $this$showTargetPickerAndDownload_u24lambda_u244_u24lambda_u243.topMargin = AccessoriesManagerKt.m1424dp(context6, 10);
        $this$showTargetPickerAndDownload_u24lambda_u244.setLayoutParams($this$showTargetPickerAndDownload_u24lambda_u244_u24lambda_u243);
        searchInput.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager.showTargetPickerAndDownload.1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                AccessoriesManager accessoriesManager = AccessoriesManager.this;
                InventorySearchAdapter inventorySearchAdapter = adapter;
                TextView textView = counter;
                String string = s != null ? s.toString() : null;
                if (string == null) {
                    string = "";
                }
                AccessoriesManager.showTargetPickerAndDownload$applySearch(accessoriesManager, inventorySearchAdapter, textView, string);
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }
        });
        MaterialButton cancelButton = new MaterialButton(this.context);
        cancelButton.setText("Отмена");
        cancelButton.setAllCaps(false);
        Context context7 = cancelButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        cancelButton.setCornerRadius(AccessoriesManagerKt.m1424dp(context7, 14));
        cancelButton.setTypeface(Typeface.DEFAULT_BOLD);
        cancelButton.setTextColor(-1);
        cancelButton.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#1B2630")));
        cancelButton.setStrokeColor(ColorStateList.valueOf(Color.parseColor("#24323F")));
        Context context8 = cancelButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        cancelButton.setStrokeWidth(AccessoriesManagerKt.m1424dp(context8, 1));
        Context context9 = cancelButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        LinearLayout.LayoutParams $this$showTargetPickerAndDownload_u24lambda_u246_u24lambda_u245 = new LinearLayout.LayoutParams(-1, AccessoriesManagerKt.m1424dp(context9, 46));
        Context context10 = cancelButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
        $this$showTargetPickerAndDownload_u24lambda_u246_u24lambda_u245.topMargin = AccessoriesManagerKt.m1424dp(context10, 14);
        cancelButton.setLayoutParams($this$showTargetPickerAndDownload_u24lambda_u246_u24lambda_u245);
        FrameLayout $this$showTargetPickerAndDownload_u24lambda_u2415 = new FrameLayout(this.context);
        MaterialCardView $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414 = new MaterialCardView($this$showTargetPickerAndDownload_u24lambda_u2415.getContext());
        Context context11 = $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414.getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414.setRadius(AccessoriesManagerKt.m1424dp(context11, 22));
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414.setCardElevation(0.0f);
        Context context12 = $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414.getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414.setStrokeWidth(AccessoriesManagerKt.m1424dp(context12, 1));
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414.setStrokeColor(Color.parseColor("#22303D"));
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414.setCardBackgroundColor(Color.parseColor("#10161D"));
        FrameLayout.LayoutParams $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u247 = new FrameLayout.LayoutParams(-1, -2, 17);
        Context context13 = $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414.getContext();
        Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u247.setMarginStart(AccessoriesManagerKt.m1424dp(context13, 20));
        Context context14 = $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414.getContext();
        Intrinsics.checkNotNullExpressionValue(context14, "getContext(...)");
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u247.setMarginEnd(AccessoriesManagerKt.m1424dp(context14, 20));
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414.setLayoutParams($this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u247);
        LinearLayout $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413 = new LinearLayout($this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414.getContext());
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413.setOrientation(1);
        Context context15 = $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413.getContext();
        Intrinsics.checkNotNullExpressionValue(context15, "getContext(...)");
        int iM1424dp4 = AccessoriesManagerKt.m1424dp(context15, 22);
        Context context16 = $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413.getContext();
        Intrinsics.checkNotNullExpressionValue(context16, "getContext(...)");
        int iM1424dp5 = AccessoriesManagerKt.m1424dp(context16, 22);
        Context context17 = $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413.getContext();
        Intrinsics.checkNotNullExpressionValue(context17, "getContext(...)");
        int iM1424dp6 = AccessoriesManagerKt.m1424dp(context17, 22);
        Context context18 = $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413.getContext();
        Intrinsics.checkNotNullExpressionValue(context18, "getContext(...)");
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413.setPadding(iM1424dp4, iM1424dp5, iM1424dp6, AccessoriesManagerKt.m1424dp(context18, 20));
        TextView $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u248 = new TextView($this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413.getContext());
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u248.setText("Выбор модели");
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u248.setTextColor(-1);
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u248.setTextSize(19.0f);
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u248.setTypeface(Typeface.DEFAULT_BOLD);
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413.addView($this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u248);
        TextView $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u2410 = new TextView($this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413.getContext());
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u2410.setText("Пак #" + packId + " будет установлен вместо выбранного аксессуара");
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u2410.setTextColor(Color.parseColor("#8B9AA5"));
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u2410.setTextSize(13.0f);
        LinearLayout.LayoutParams $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u2410_u24lambda_u249 = new LinearLayout.LayoutParams(-1, -2);
        Context context19 = $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u2410.getContext();
        Intrinsics.checkNotNullExpressionValue(context19, "getContext(...)");
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u2410_u24lambda_u249.topMargin = AccessoriesManagerKt.m1424dp(context19, 8);
        Context context20 = $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u2410.getContext();
        Intrinsics.checkNotNullExpressionValue(context20, "getContext(...)");
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u2410_u24lambda_u249.bottomMargin = AccessoriesManagerKt.m1424dp(context20, 16);
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u2410.setLayoutParams($this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u2410_u24lambda_u249);
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413.addView($this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u2410);
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413.addView(searchInput);
        LinearLayout.LayoutParams $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411 = new LinearLayout.LayoutParams(-1, -2);
        Context context21 = counter.getContext();
        Intrinsics.checkNotNullExpressionValue(context21, "getContext(...)");
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411.topMargin = AccessoriesManagerKt.m1424dp(context21, 8);
        counter.setLayoutParams($this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411);
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413.addView(counter);
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413.addView($this$showTargetPickerAndDownload_u24lambda_u244);
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413.addView(cancelButton);
        $this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414.addView($this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413);
        $this$showTargetPickerAndDownload_u24lambda_u2415.addView($this$showTargetPickerAndDownload_u24lambda_u2415_u24lambda_u2414);
        ?? Create = new AlertDialog.Builder(this.context).create();
        Intrinsics.checkNotNullExpressionValue(Create, "create(...)");
        Create.setView($this$showTargetPickerAndDownload_u24lambda_u2415);
        Create.setCancelable(true);
        Create.setCanceledOnTouchOutside(true);
        dialog.element = Create;
        cancelButton.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccessoriesManager.showTargetPickerAndDownload$lambda$17(dialog, view);
            }
        });
        if (dialog.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) dialog.element;
        }
        alertDialog.show();
        if (dialog.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog2 = null;
        } else {
            alertDialog2 = (AlertDialog) dialog.element;
        }
        Window window = alertDialog2.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        showTargetPickerAndDownload$applySearch(this, adapter, counter, "");
        searchInput.requestFocus();
        Object systemService = this.context.getSystemService("input_method");
        InputMethodManager inputManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputManager != null) {
            inputManager.showSoftInput(searchInput, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTargetPickerAndDownload$applySearch(AccessoriesManager this$0, InventorySearchAdapter adapter, TextView counter, String query) {
        List<AccessoryInventoryItem> listSearch = AccessoriesInventory.INSTANCE.search(this$0.inventory, query);
        adapter.submitList(listSearch);
        counter.setText(listSearch.size() + " вариантов");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showTargetPickerAndDownload$lambda$17(Ref.ObjectRef dialog, View it) {
        AlertDialog alertDialog;
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        if (dialog.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) dialog.element;
        }
        alertDialog.dismiss();
    }

    private final String getLauncherKeyFromPrefs() {
        String string;
        try {
            String string2 = this.context.getSharedPreferences("MyPreferences", 0).getString("key", null);
            if (string2 == null || (string = StringsKt__StringsKt.trim((CharSequence) string2).toString()) == null) {
                return null;
            }
            String str = string;
            if (str.length() == 0) {
                str = null;
            }
            return str;
        } catch (Exception e) {
            return null;
        }
    }

    static /* synthetic */ void fetchAccessoryInfo$default(AccessoriesManager accessoriesManager, String str, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        accessoriesManager.fetchAccessoryInfo(str, i, function1);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$fetchAccessoryInfo$1 */
    /* JADX INFO: compiled from: AccessoriesManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$fetchAccessoryInfo$1", m4426f = "AccessoriesManager.kt", m4427i = {0}, m4428l = {280}, m4429m = "invokeSuspend", m4430n = {"$this$launch"}, m4431s = {"L$0"})
    static final class C53261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Result<AccessoryInfo>, Unit> $callback;
        final /* synthetic */ String $packId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C53261(String str, Function1<? super Result<AccessoryInfo>, Unit> function1, Continuation<? super C53261> continuation) {
            super(2, continuation);
            this.$packId = str;
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C53261 c53261 = new C53261(this.$packId, this.$callback, continuation);
            c53261.L$0 = obj;
            return c53261;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C53261 c53261;
            Object objM15551constructorimpl;
            byte[] it;
            Object objM15551constructorimpl2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c53261 = this;
                    final CoroutineScope $this$launch = (CoroutineScope) c53261.L$0;
                    EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                    String str = "/api/fetch_file/accessories/" + c53261.$packId + "/info.json";
                    CachePolicy.LastKnownGood lastKnownGood = new CachePolicy.LastKnownGood("accessories-info:" + c53261.$packId, 0L, 2, null);
                    Function1<byte[], Boolean> function1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$fetchAccessoryInfo$1$result$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(byte[] it2) {
                            Object objM15551constructorimpl3;
                            Intrinsics.checkNotNullParameter(it2, "it");
                            CoroutineScope coroutineScope = $this$launch;
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                AccessoryInfo.INSTANCE.parseRequired(new String(it2, Charsets.UTF_8));
                                objM15551constructorimpl3 = Result.m15551constructorimpl(true);
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM15551constructorimpl3 = Result.m15551constructorimpl(ResultKt.createFailure(th));
                            }
                            if (Result.m15557isFailureimpl(objM15551constructorimpl3)) {
                                objM15551constructorimpl3 = false;
                            }
                            return (Boolean) objM15551constructorimpl3;
                        }
                    };
                    c53261.L$0 = $this$launch;
                    c53261.label = 1;
                    Object bytes = router.getBytes(endpointGroup, str, (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : lastKnownGood, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? EndpointRouter.C56582.INSTANCE : function1, c53261);
                    if (bytes == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = bytes;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c53261 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            NetworkResult result = (NetworkResult) $result;
            Object obj = null;
            NetworkResult.Success success = result instanceof NetworkResult.Success ? (NetworkResult.Success) result : null;
            if (success != null && (it = (byte[]) success.getValue()) != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM15551constructorimpl2 = Result.m15551constructorimpl(AccessoryInfo.INSTANCE.parseRequired(new String(it, Charsets.UTF_8)));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM15551constructorimpl2 = Result.m15551constructorimpl(ResultKt.createFailure(th));
                }
                obj = (AccessoryInfo) (Result.m15557isFailureimpl(objM15551constructorimpl2) ? null : objM15551constructorimpl2);
            }
            Object obj2 = obj;
            Function1<Result<AccessoryInfo>, Unit> function2 = c53261.$callback;
            if (obj2 != null) {
                Result.Companion companion3 = Result.INSTANCE;
                objM15551constructorimpl = Result.m15551constructorimpl(obj2);
            } else {
                Result.Companion companion4 = Result.INSTANCE;
                objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(new IOException("info.json не найден")));
            }
            function2.invoke(Result.m15550boximpl(objM15551constructorimpl));
            return Unit.INSTANCE;
        }
    }

    private final void fetchAccessoryInfo(String packId, int index, Function1<? super Result<AccessoryInfo>, Unit> callback) {
        BuildersKt__Builders_commonKt.launch$default(NetworkRuntime.INSTANCE.getApplicationScope(), null, null, new C53261(packId, callback, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSubscribeDialog(final String packId, String link) {
        String str = (String) CollectionsKt___CollectionsKt.lastOrNull(StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.trim((CharSequence) (link == null ? "" : link)).toString(), new String[]{ServerSentEventKt.SPACE}, false, 0, 6, (Object) null));
        final String cleanLink = str != null ? str : "";
        if (!StringsKt__StringsJVMKt.startsWith$default(cleanLink, "https://t.me/", false, 2, null)) {
            toast("Некорректная ссылка на канал");
        } else {
            runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager.showSubscribeDialog.1
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
                    LauncherDialogHelper launcherDialogHelper = LauncherDialogHelper.INSTANCE;
                    Context context = AccessoriesManager.this.context;
                    String str2 = "Для скачивания аксессуара #" + packId + " подпишитесь на канал автора с аккаунта, привязанного к ключу. После подписки вернитесь и снова нажмите «Скачать».";
                    final String str3 = cleanLink;
                    final AccessoriesManager accessoriesManager = AccessoriesManager.this;
                    launcherDialogHelper.showConfirmDialog(context, "Нужна подписка", str2, (128 & 8) != 0 ? "Подтвердить" : "Подписаться", (128 & 16) != 0 ? "Отмена" : "Отмена", (128 & 32) != 0, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager.showSubscribeDialog.1.1
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
                            try {
                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str3)).addFlags(268435456);
                                Intrinsics.checkNotNullExpressionValue(intent, "addFlags(...)");
                                accessoriesManager.context.startActivity(intent);
                            } catch (Exception e) {
                                accessoriesManager.toast("Не удалось открыть ссылку");
                            }
                        }
                    }, (128 & 128) != 0 ? null : null);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$fetchIndex$1 */
    /* JADX INFO: compiled from: AccessoriesManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$fetchIndex$1", m4426f = "AccessoriesManager.kt", m4427i = {0}, m4428l = {328}, m4429m = "invokeSuspend", m4430n = {"$this$launch"}, m4431s = {"L$0"})
    static final class C53271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<String>, Unit> $onResult;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C53271(Function1<? super List<String>, Unit> function1, Continuation<? super C53271> continuation) {
            super(2, continuation);
            this.$onResult = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C53271 c53271 = AccessoriesManager.this.new C53271(this.$onResult, continuation);
            c53271.L$0 = obj;
            return c53271;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C53271 c53271;
            Object bytes;
            List files;
            String str;
            byte[] it;
            Object objM15551constructorimpl;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = 1;
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c53271 = this;
                    final CoroutineScope $this$launch = (CoroutineScope) c53271.L$0;
                    EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                    CachePolicy.LastKnownGood lastKnownGood = new CachePolicy.LastKnownGood("custom-index:accessories", 0L, 2, null);
                    Function1<byte[], Boolean> function1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$fetchIndex$1$result$1
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
                    c53271.L$0 = $this$launch;
                    c53271.label = 1;
                    bytes = router.getBytes(endpointGroup, "/api/accessories", (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : lastKnownGood, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? EndpointRouter.C56582.INSTANCE : function1, c53271);
                    if (bytes == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    bytes = $result;
                    c53271 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            NetworkResult result = (NetworkResult) bytes;
            NetworkResult.Success success = result instanceof NetworkResult.Success ? (NetworkResult.Success) result : null;
            if (success == null || (it = (byte[]) success.getValue()) == null) {
                files = null;
            } else {
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
                files = (List) objM15551constructorimpl;
            }
            if (files == null) {
                files = CollectionsKt__CollectionsKt.emptyList();
            }
            AccessoriesManager.this.latestFileList = files;
            List $this$forEach$iv$iv$iv = files;
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv : $this$forEach$iv$iv$iv) {
                RemoteCustomFile file = (RemoteCustomFile) element$iv$iv;
                String path = file.getPath();
                char[] cArr = new char[i];
                boolean z = false;
                cArr[0] = FileSystemKt.UnixPathSeparator;
                List it2 = StringsKt__StringsKt.split$default((CharSequence) path, cArr, false, 0, 6, (Object) null);
                if (it2.size() >= 3 && Intrinsics.areEqual(it2.get(0), "accessories")) {
                    z = true;
                }
                if (!z) {
                    it2 = null;
                }
                if (it2 != null) {
                    i = 1;
                    str = (String) it2.get(1);
                } else {
                    i = 1;
                    str = null;
                }
                if (str != null) {
                    destination$iv$iv.add(str);
                }
            }
            final List ids = CollectionsKt___CollectionsKt.distinct((List) destination$iv$iv);
            AccessoriesManager accessoriesManager = AccessoriesManager.this;
            final AccessoriesManager accessoriesManager2 = AccessoriesManager.this;
            final Function1<List<String>, Unit> function2 = c53271.$onResult;
            accessoriesManager.fetchInventory(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager.fetchIndex.1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    AccessoriesManager accessoriesManager3 = accessoriesManager2;
                    final Function1<List<String>, Unit> function3 = function2;
                    final List<String> list = ids;
                    accessoriesManager3.runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager.fetchIndex.1.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                            function3.invoke(list);
                        }
                    });
                }
            });
            return Unit.INSTANCE;
        }
    }

    private final void fetchIndex(int index, Function1<? super List<String>, Unit> onResult) {
        BuildersKt__Builders_commonKt.launch$default(NetworkRuntime.INSTANCE.getApplicationScope(), null, null, new C53271(onResult, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$fetchInventory$1 */
    /* JADX INFO: compiled from: AccessoriesManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$fetchInventory$1", m4426f = "AccessoriesManager.kt", m4427i = {0}, m4428l = {347}, m4429m = "invokeSuspend", m4430n = {"$this$launch"}, m4431s = {"L$0"})
    static final class C53281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onComplete;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53281(Function0<Unit> function0, Continuation<? super C53281> continuation) {
            super(2, continuation);
            this.$onComplete = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C53281 c53281 = AccessoriesManager.this.new C53281(this.$onComplete, continuation);
            c53281.L$0 = obj;
            return c53281;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C53281 c53281;
            byte[] bArr;
            Object objM15551constructorimpl;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    c53281 = this;
                    final CoroutineScope coroutineScope = (CoroutineScope) c53281.L$0;
                    EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                    EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                    CachePolicy.LastKnownGood lastKnownGood = new CachePolicy.LastKnownGood("accessories-inventory", 0L, 2, null);
                    Function1<byte[], Boolean> function1 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$fetchInventory$1$result$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(byte[] it) {
                            Object objM15551constructorimpl2;
                            Intrinsics.checkNotNullParameter(it, "it");
                            CoroutineScope coroutineScope2 = coroutineScope;
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                objM15551constructorimpl2 = Result.m15551constructorimpl(Boolean.valueOf(!AccessoriesInventory.INSTANCE.parse(new String(it, Charsets.UTF_8)).isEmpty()));
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
                    c53281.L$0 = coroutineScope;
                    c53281.label = 1;
                    Object bytes = router.getBytes(endpointGroup, "/api/fetch_file/accessories/inventory.json", (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : lastKnownGood, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? EndpointRouter.C56582.INSTANCE : function1, c53281);
                    if (bytes == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = bytes;
                    break;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    c53281 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            NetworkResult networkResult = (NetworkResult) obj;
            AccessoriesManager accessoriesManager = AccessoriesManager.this;
            List listEmptyList = null;
            listEmptyList = null;
            NetworkResult.Success success = networkResult instanceof NetworkResult.Success ? (NetworkResult.Success) networkResult : null;
            if (success != null && (bArr = (byte[]) success.getValue()) != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM15551constructorimpl = Result.m15551constructorimpl(AccessoriesInventory.INSTANCE.parse(new String(bArr, Charsets.UTF_8)));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                }
                listEmptyList = (List) (Result.m15557isFailureimpl(objM15551constructorimpl) ? null : objM15551constructorimpl);
            }
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            accessoriesManager.inventory = listEmptyList;
            c53281.$onComplete.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchInventory(Function0<Unit> onComplete) {
        BuildersKt__Builders_commonKt.launch$default(NetworkRuntime.INSTANCE.getApplicationScope(), null, null, new C53281(onComplete, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x006b  */
    public final void downloadAndPack(String packId, AccessoryInventoryItem target) {
        boolean z;
        Iterable $this$filter$iv = this.latestFileList;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            RemoteCustomFile file = (RemoteCustomFile) element$iv$iv;
            if (StringsKt__StringsJVMKt.startsWith$default(file.getPath(), "accessories/" + packId + FileSystemKt.UnixPathSeparator, false, 2, null)) {
                z = true;
                if (!StringsKt__StringsJVMKt.endsWith(file.getPath(), ".btx", true) && !StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.substringAfterLast$default(file.getPath(), FileSystemKt.UnixPathSeparator, (String) null, 2, (Object) null), "skin.mod", true)) {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        List toDownload = (List) destination$iv$iv;
        if (toDownload.isEmpty()) {
            toast("Нет файлов для аксессуара #" + packId);
            return;
        }
        LauncherDialogHelper.ProgressHandle progress = LauncherDialogHelper.createDeterminateProgressDialog$default(LauncherDialogHelper.INSTANCE, this.context, "Установка аксессуара", toDownload.size(), null, null, 24, null);
        progress.show();
        progress.setMessage(target.getName() + " -> " + target.getModel() + ".mod");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C53241(packId, toDownload, target, progress, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$downloadAndPack$1 */
    /* JADX INFO: compiled from: AccessoriesManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$downloadAndPack$1", m4426f = "AccessoriesManager.kt", m4427i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 3, 3, 4, 5}, m4428l = {395, 398, DonateConstants.ACTION_SEND_ERROR, 412, TypedValues.CycleType.TYPE_PATH_ROTATE, 421}, m4429m = "invokeSuspend", m4430n = {"tempDir", "success", "downloaded", ImagesContract.LOCAL, "index$iv", FirebaseAnalytics.Param.INDEX, "tempDir", "success", "downloaded", "index$iv", "tempDir", "downloaded", "tempDir", "tempDir"}, m4431s = {"L$0", "L$1", "L$2", "L$8", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$0", "L$0"})
    static final class C53241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $packId;
        final /* synthetic */ LauncherDialogHelper.ProgressHandle $progress;
        final /* synthetic */ AccessoryInventoryItem $target;
        final /* synthetic */ List<RemoteCustomFile> $toDownload;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53241(String str, List<RemoteCustomFile> list, AccessoryInventoryItem accessoryInventoryItem, LauncherDialogHelper.ProgressHandle progressHandle, Continuation<? super C53241> continuation) {
            super(2, continuation);
            this.$packId = str;
            this.$toDownload = list;
            this.$target = accessoryInventoryItem;
            this.$progress = progressHandle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccessoriesManager.this.new C53241(this.$packId, this.$toDownload, this.$target, this.$progress, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0153  */
        /* JADX WARN: Code duplicated, block: B:32:0x015b  */
        /* JADX WARN: Code duplicated, block: B:35:0x0192  */
        /* JADX WARN: Code duplicated, block: B:38:0x01ba A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x01bb  */
        /* JADX WARN: Code duplicated, block: B:42:0x01d3  */
        /* JADX WARN: Code duplicated, block: B:43:0x01da  */
        /* JADX WARN: Code duplicated, block: B:46:0x020a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:47:0x020b  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x004d: MOVE (r3 I:??[OBJECT, ARRAY] A[D('this' com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$downloadAndPack$1)]) = (r4 I:??[OBJECT, ARRAY] A[D('$result' java.lang.Object)]), block:B:18:0x004c */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0052: MOVE (r20 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY] A[D('$result' java.lang.Object)]), block:B:20:0x0052 */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x004e: MOVE (r4 I:??[OBJECT, ARRAY] A[D('$result' java.lang.Object)]) = (r6 I:??[OBJECT, ARRAY] A[D('tempDir' java.io.File)]), block:B:18:0x004c */
        /* JADX WARN: Type inference failed for: r0v10, types: [com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$downloadAndPack$1, kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v35 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14, types: [com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$downloadAndPack$1, kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v20, types: [com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$downloadAndPack$1] */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v24 */
        /* JADX WARN: Type inference failed for: r1v25 */
        /* JADX WARN: Type inference failed for: r1v26 */
        /* JADX WARN: Type inference failed for: r1v3, types: [com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$downloadAndPack$1] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v24 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r5v14 */
        /* JADX WARN: Type inference failed for: r5v28 */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x020b -> B:48:0x0218). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 798
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager.C53241.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$downloadAndPack$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: AccessoriesManager.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$downloadAndPack$1$2", m4426f = "AccessoriesManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LauncherDialogHelper.ProgressHandle $progress;
            int label;
            final /* synthetic */ AccessoriesManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(LauncherDialogHelper.ProgressHandle progressHandle, AccessoriesManager accessoriesManager, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$progress = progressHandle;
                this.this$0 = accessoriesManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$progress, this.this$0, continuation);
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
                        this.$progress.dismiss();
                        this.this$0.toast("Не удалось загрузить все файлы");
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$downloadAndPack$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: AccessoriesManager.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$downloadAndPack$1$3", m4426f = "AccessoriesManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LauncherDialogHelper.ProgressHandle $progress;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(LauncherDialogHelper.ProgressHandle progressHandle, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$progress = progressHandle;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$progress, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        this.$progress.setMessage("Упаковка файлов...");
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$downloadAndPack$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: AccessoriesManager.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$downloadAndPack$1$4", m4426f = "AccessoriesManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LauncherDialogHelper.ProgressHandle $progress;
            final /* synthetic */ AccessoryInventoryItem $target;
            int label;
            final /* synthetic */ AccessoriesManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(LauncherDialogHelper.ProgressHandle progressHandle, AccessoriesManager accessoriesManager, AccessoryInventoryItem accessoryInventoryItem, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$progress = progressHandle;
                this.this$0 = accessoriesManager;
                this.$target = accessoryInventoryItem;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$progress, this.this$0, this.$target, continuation);
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
                        this.$progress.dismiss();
                        this.this$0.toast("✓ Аксессуар установлен: " + this.$target.getName());
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$downloadAndPack$1$5, reason: invalid class name */
        /* JADX INFO: compiled from: AccessoriesManager.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$downloadAndPack$1$5", m4426f = "AccessoriesManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: $e */
            final /* synthetic */ Exception f805$e;
            final /* synthetic */ LauncherDialogHelper.ProgressHandle $progress;
            int label;
            final /* synthetic */ AccessoriesManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(LauncherDialogHelper.ProgressHandle progressHandle, AccessoriesManager accessoriesManager, Exception exc, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.$progress = progressHandle;
                this.this$0 = accessoriesManager;
                this.f805$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.$progress, this.this$0, this.f805$e, continuation);
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
                        this.$progress.dismiss();
                        this.this$0.toast("Ошибка установки: " + this.f805$e.getMessage());
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object downloadSingleFile(RemoteCustomFile remote, File file, Continuation<? super Boolean> continuation) {
        C53251 c53251;
        Object objDownload$default;
        if (continuation instanceof C53251) {
            C53251 c53252 = (C53251) continuation;
            if ((c53252.label & Integer.MIN_VALUE) != 0) {
                c53252.label -= Integer.MIN_VALUE;
                c53251 = c53252;
            } else {
                c53251 = new C53251(continuation);
            }
        } else {
            c53251 = new C53251(continuation);
        }
        Object $result = c53251.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c53251.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                String str = "/api/fetch_file/" + remote.getPath();
                Long lBoxLong = Boxing.boxLong(remote.getSize());
                if (!(lBoxLong.longValue() >= 0)) {
                    lBoxLong = null;
                }
                String it = remote.getSha1();
                if (!(StringsKt__StringsKt.isBlank(it) ? false : true)) {
                    it = null;
                }
                DownloadSpec downloadSpec = new DownloadSpec(file, lBoxLong, it, false, null, 24, null);
                c53251.label = 1;
                objDownload$default = EndpointRouter.download$default(router, endpointGroup, str, downloadSpec, null, c53251, 8, null);
                if (objDownload$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                objDownload$default = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Boxing.boxBoolean(objDownload$default instanceof NetworkResult.Success);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void packFiles(final List<? extends File> files, final AccessoryInventoryItem target) throws IOException {
        Object element$iv;
        File it;
        List<? extends File> $this$firstOrNull$iv = files;
        Iterator it2 = $this$firstOrNull$iv.iterator();
        do {
            if (!it2.hasNext()) {
                element$iv = null;
                break;
            } else {
                element$iv = it2.next();
                it = (File) element$iv;
            }
        } while (!StringsKt__StringsJVMKt.equals(it.getName(), "skin.mod", true));
        final File model = (File) element$iv;
        if (model == null) {
            throw new IOException("skin.mod не найден");
        }
        CustomResources.INSTANCE.edit(this.context, new Function1<File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager.packFiles.1
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
                Iterable $this$filter$iv = files;
                Collection destination$iv$iv = new ArrayList();
                for (Object element$iv$iv : $this$filter$iv) {
                    if (StringsKt__StringsJVMKt.equals(FilesKt__UtilsKt.getExtension((File) element$iv$iv), "btx", true)) {
                        destination$iv$iv.add(element$iv$iv);
                    }
                }
                Iterable $this$forEach$iv = (List) destination$iv$iv;
                for (Object element$iv2 : $this$forEach$iv) {
                    File it3 = (File) element$iv2;
                    CustomResources customResources = CustomResources.INSTANCE;
                    String name = it3.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    customResources.putTexture(stage, it3, name);
                }
                CustomResources.INSTANCE.putModel(stage, model, target.getModel() + ".mod");
            }
        });
    }

    private final void addFileReplacing(ZipFile zip, File file, String entryName) throws ZipException {
        Iterable fileHeaders = zip.getFileHeaders();
        Intrinsics.checkNotNullExpressionValue(fileHeaders, "getFileHeaders(...)");
        Iterable $this$filter$iv = fileHeaders;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            FileHeader it = (FileHeader) element$iv$iv;
            if (StringsKt__StringsJVMKt.equals(it.getFileName(), entryName, true)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        Iterable $this$forEach$iv = (List) destination$iv$iv;
        for (Object element$iv : $this$forEach$iv) {
            FileHeader it2 = (FileHeader) element$iv;
            zip.removeFile(it2);
        }
        ZipParameters params = new ZipParameters();
        params.setOverrideExistingFilesInZip(true);
        params.setFileNameInZip(entryName);
        zip.addFile(file, params);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runOnMain(final Function0<Unit> block) {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            block.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AccessoriesManager.runOnMain$lambda$26(block);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runOnMain$lambda$26(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toast(final String message) {
        runOnMain(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager.toast.1
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
                Toast.makeText(AccessoriesManager.this.context, message, 0).show();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AccessoriesManager.kt */
    @Metadata(m4415d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00062\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0014\u0010\u0017\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/AccessoriesManager$InventorySearchAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/AccessoriesManager$InventorySearchAdapter$VH;", "onClick", "Lkotlin/Function1;", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/AccessoryInventoryItem;", "", "(Lkotlin/jvm/functions/Function1;)V", FirebaseAnalytics.Param.ITEMS, "", "formatPrice", "", "price", "", "getItemCount", "", "onBindViewHolder", "holder", InAppViewConstants.POSITION, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "newItems", "", "VH", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    static final class InventorySearchAdapter extends RecyclerView.Adapter<C5319VH> {
        private final List<AccessoryInventoryItem> items;
        private final Function1<AccessoryInventoryItem, Unit> onClick;

        /* JADX WARN: Multi-variable type inference failed */
        public InventorySearchAdapter(Function1<? super AccessoryInventoryItem, Unit> onClick) {
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.onClick = onClick;
            this.items = new ArrayList();
        }

        public final void submitList(List<AccessoryInventoryItem> newItems) {
            Intrinsics.checkNotNullParameter(newItems, "newItems");
            this.items.clear();
            CollectionsKt__MutableCollectionsKt.addAll(this.items, newItems);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public C5319VH onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Context context = parent.getContext();
            MaterialCardView card = new MaterialCardView(context);
            Intrinsics.checkNotNull(context);
            card.setRadius(AccessoriesManagerKt.m1424dp(context, 14));
            card.setCardElevation(0.0f);
            card.setStrokeWidth(AccessoriesManagerKt.m1424dp(context, 1));
            card.setStrokeColor(Color.parseColor("#24323F"));
            card.setCardBackgroundColor(Color.parseColor("#16212A"));
            RecyclerView.LayoutParams $this$onCreateViewHolder_u24lambda_u241_u24lambda_u240 = new RecyclerView.LayoutParams(-1, -2);
            $this$onCreateViewHolder_u24lambda_u241_u24lambda_u240.bottomMargin = AccessoriesManagerKt.m1424dp(context, 8);
            card.setLayoutParams($this$onCreateViewHolder_u24lambda_u241_u24lambda_u240);
            LinearLayout root = new LinearLayout(context);
            root.setOrientation(1);
            root.setPadding(AccessoriesManagerKt.m1424dp(context, 14), AccessoriesManagerKt.m1424dp(context, 12), AccessoriesManagerKt.m1424dp(context, 14), AccessoriesManagerKt.m1424dp(context, 12));
            TextView $this$onCreateViewHolder_u24lambda_u243 = new TextView(context);
            $this$onCreateViewHolder_u24lambda_u243.setId(View.generateViewId());
            $this$onCreateViewHolder_u24lambda_u243.setTextColor(-1);
            $this$onCreateViewHolder_u24lambda_u243.setTextSize(14.0f);
            $this$onCreateViewHolder_u24lambda_u243.setTypeface(Typeface.DEFAULT_BOLD);
            TextView $this$onCreateViewHolder_u24lambda_u245 = new TextView(context);
            $this$onCreateViewHolder_u24lambda_u245.setId(View.generateViewId());
            $this$onCreateViewHolder_u24lambda_u245.setTextColor(Color.parseColor("#8B9AA5"));
            $this$onCreateViewHolder_u24lambda_u245.setTextSize(12.0f);
            LinearLayout.LayoutParams $this$onCreateViewHolder_u24lambda_u245_u24lambda_u244 = new LinearLayout.LayoutParams(-1, -2);
            $this$onCreateViewHolder_u24lambda_u245_u24lambda_u244.topMargin = AccessoriesManagerKt.m1424dp(context, 4);
            $this$onCreateViewHolder_u24lambda_u245.setLayoutParams($this$onCreateViewHolder_u24lambda_u245_u24lambda_u244);
            root.addView($this$onCreateViewHolder_u24lambda_u243);
            root.addView($this$onCreateViewHolder_u24lambda_u245);
            card.addView(root);
            return new C5319VH(this, card, $this$onCreateViewHolder_u24lambda_u243, $this$onCreateViewHolder_u24lambda_u245);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(C5319VH holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.bind(this.items.get(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getSizeInv() {
            return this.items.size();
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$InventorySearchAdapter$VH */
        /* JADX INFO: compiled from: AccessoriesManager.kt */
        @Metadata(m4415d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/AccessoriesManager$InventorySearchAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "title", "Landroid/widget/TextView;", Constants.REFERRER_API_META, "(Lcom/blackhub/bronline/neizzir/fragments/custom/manager/AccessoriesManager$InventorySearchAdapter;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;)V", "bind", "", "item", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/AccessoryInventoryItem;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
        public final class C5319VH extends RecyclerView.ViewHolder {
            private final TextView meta;
            final /* synthetic */ InventorySearchAdapter this$0;
            private final TextView title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5319VH(InventorySearchAdapter this$0, View itemView, TextView title, TextView meta) {
                super(itemView);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(meta, "meta");
                this.this$0 = this$0;
                this.title = title;
                this.meta = meta;
            }

            public final void bind(final AccessoryInventoryItem item) {
                Intrinsics.checkNotNullParameter(item, "item");
                this.title.setText(item.getName());
                this.meta.setText("ID " + item.getId() + " · ModelID " + item.getModelId() + " · " + item.getModel() + " · " + this.this$0.formatPrice(item.getAccessoryPrice()));
                View view = this.itemView;
                final InventorySearchAdapter inventorySearchAdapter = this.this$0;
                view.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.manager.AccessoriesManager$InventorySearchAdapter$VH$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AccessoriesManager.InventorySearchAdapter.C5319VH.bind$lambda$0(inventorySearchAdapter, item, view2);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void bind$lambda$0(InventorySearchAdapter this$0, AccessoryInventoryItem item, View it) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                this$0.onClick.invoke(item);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String formatPrice(long price) {
            if (price <= 0) {
                return "цена не указана";
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, "%,d", Arrays.copyOf(new Object[]{Long.valueOf(price)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return StringsKt__StringsJVMKt.replace$default(str, AbstractJsonLexerKt.COMMA, ' ', false, 4, (Object) null);
        }
    }
}
