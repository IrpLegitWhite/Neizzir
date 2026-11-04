package com.blackhub.bronline.neizzir.fragments.custom.sounds;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import com.blackhub.bronline.neizzir.activities.main.game.GameStarter;
import com.blackhub.bronline.neizzir.activities.main.settings.SettingsRepository;
import com.blackhub.bronline.neizzir.activities.main.util.CustomResources;
import com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.helpshift.proactive.InAppViewConstants;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.slf4j.Marker;

/* JADX INFO: compiled from: SoundCustomizationController.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0003fghB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u00108\u001a\u0002022\u0006\u00109\u001a\u00020\u0013J\u0010\u0010:\u001a\u0002022\u0006\u0010;\u001a\u00020\u0006H\u0002J\u0006\u0010<\u001a\u000202J\b\u0010=\u001a\u000202H\u0002J\u0010\u0010>\u001a\u0002022\u0006\u0010?\u001a\u00020@H\u0002J\u0006\u0010A\u001a\u000202J\u0010\u0010B\u001a\u00020C2\u0006\u0010;\u001a\u00020CH\u0002J\u001e\u0010D\u001a\u0002022\u0006\u0010?\u001a\u00020@2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\n0FH\u0002J*\u0010G\u001a\u0002022\u0006\u0010;\u001a\u00020\u00062\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020J0IH\u0082@¢\u0006\u0002\u0010KJ\u0016\u0010L\u001a\u0002022\u0006\u0010;\u001a\u00020\u00062\u0006\u0010M\u001a\u00020JJ\u0010\u0010N\u001a\u0002022\u0006\u0010;\u001a\u00020\u0006H\u0002J\u0006\u0010O\u001a\u00020'J\u0010\u0010P\u001a\u0002022\u0006\u0010Q\u001a\u00020\nH\u0002J\u0006\u0010R\u001a\u000202J\b\u0010S\u001a\u000202H\u0002J\b\u0010T\u001a\u000202H\u0002J\u0010\u0010U\u001a\u0002022\b\u0010V\u001a\u0004\u0018\u00010WJ3\u0010X\u001a\u0002022\u0006\u0010Y\u001a\u00020\n2\u001c\u0010Z\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\\\u0012\u0006\u0012\u0004\u0018\u00010\u00010[H\u0002¢\u0006\u0002\u0010]J\u000e\u0010^\u001a\u0002022\u0006\u0010V\u001a\u00020WJ\u0010\u0010_\u001a\u0002022\u0006\u0010`\u001a\u00020'H\u0002J\u001a\u0010a\u001a\u0002022\u0006\u0010;\u001a\u00020\u00062\n\u0010b\u001a\u0006\u0012\u0002\b\u00030%J\u001c\u0010c\u001a\u0002022\u0006\u0010;\u001a\u00020\u00062\f\u0010d\u001a\b\u0012\u0004\u0012\u00020201J\u0010\u0010e\u001a\u0002022\u0006\u0010?\u001a\u00020@H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000b*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0018\u00010\u0017R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-R\u0016\u00100\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0018\u000107R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006i"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCustomizationController;", "", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "category", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCategory;", "chooser", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "host", "Landroidx/recyclerview/widget/RecyclerView;", "listJob", "Lkotlinx/coroutines/Job;", "localAdapter", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCustomizationController$LocalAdapter;", "localTab", "Landroid/widget/TextView;", "operation", "pendingCategory", "pendingUri", "Landroid/net/Uri;", "preview", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundPreviewPlayer;", "getPreview", "()Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundPreviewPlayer;", "progress", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/LauncherDialogHelper$ProgressHandle;", "remoteAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "remoteLoading", "", "remoteStatus", "remoteTab", "repository", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/LocalSoundRepository;", "getRepository", "()Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/LocalSoundRepository;", "repository$delegate", "Lkotlin/Lazy;", "retryRemote", "Lkotlin/Function0;", "", "showingLocal", "sourceSelector", "Landroid/view/View;", "statusAdapter", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCustomizationController$RemoteStatusAdapter;", "attach", "recycler", "chooseFile", "value", "clear", "consumeImport", "delete", "item", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/LocalSound;", "destroyView", CalendarKeys.DAYS_GAME_KEY, "", "install", "slots", "", "installFiles", "files", "", "Ljava/io/File;", "(Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCategory;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installRemote", "folder", "installedMessage", "isVisible", "message", "text", "onPause", "refresh", "renderSource", "restore", "state", "Landroid/os/Bundle;", "runOperation", "title", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "save", "selectSource", ImagesContract.LOCAL, "setRemote", "adapter", "show", "onRetryRemote", "showAssignments", "LocalAdapter", "LocalHolder", "RemoteStatusAdapter", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class SoundCustomizationController {
    private SoundCategory category;
    private final ActivityResultLauncher<String[]> chooser;
    private AlertDialog dialog;
    private final Fragment fragment;
    private RecyclerView host;
    private Job listJob;
    private LocalAdapter localAdapter;
    private TextView localTab;
    private Job operation;
    private SoundCategory pendingCategory;
    private Uri pendingUri;
    private final SoundPreviewPlayer preview;
    private LauncherDialogHelper.ProgressHandle progress;
    private RecyclerView.Adapter<?> remoteAdapter;
    private boolean remoteLoading;
    private String remoteStatus;
    private TextView remoteTab;

    /* JADX INFO: renamed from: repository$delegate, reason: from kotlin metadata */
    private final Lazy repository;
    private Function0<Unit> retryRemote;
    private boolean showingLocal;
    private View sourceSelector;
    private RemoteStatusAdapter statusAdapter;

    public SoundCustomizationController(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
        this.repository = LazyKt__LazyJVMKt.lazy(new Function0<LocalSoundRepository>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$repository$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LocalSoundRepository invoke() {
                return new LocalSoundRepository(this.this$0.getContext());
            }
        });
        this.preview = new SoundPreviewPlayer(new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$preview$1
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
                this.this$0.message("Не удалось прослушать звук");
            }
        });
        this.showingLocal = true;
        this.remoteStatus = "Загружаем каталог…";
        this.remoteLoading = true;
        ActivityResultLauncher<String[]> activityResultLauncherRegisterForActivityResult = this.fragment.registerForActivityResult(new ActivityResultContracts.OpenDocument(), new ActivityResultCallback() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                SoundCustomizationController.chooser$lambda$0(this.f$0, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.chooser = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() {
        Context contextRequireContext = this.fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return contextRequireContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocalSoundRepository getRepository() {
        return (LocalSoundRepository) this.repository.getValue();
    }

    public final SoundPreviewPlayer getPreview() {
        return this.preview;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void chooser$lambda$0(SoundCustomizationController this$0, Uri uri) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.pendingUri = uri;
        if (uri == null) {
            this$0.pendingCategory = null;
        }
        this$0.consumeImport();
    }

    public final void restore(Bundle state) {
        SoundCategory soundCategory;
        String p0;
        String value;
        this.showingLocal = state != null ? state.getBoolean("sound.source.local", true) : true;
        Uri uri = null;
        if (state != null && (value = state.getString("sound.import.category")) != null) {
            SoundCategory[] soundCategoryArrValues = SoundCategory.values();
            int length = soundCategoryArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    soundCategory = null;
                    break;
                }
                soundCategory = soundCategoryArrValues[i];
                if (Intrinsics.areEqual(soundCategory.name(), value)) {
                    break;
                } else {
                    i++;
                }
            }
        } else {
            soundCategory = null;
        }
        this.pendingCategory = soundCategory;
        if (state != null && (p0 = state.getString("sound.import.uri")) != null) {
            uri = Uri.parse(p0);
        }
        this.pendingUri = uri;
    }

    public final void save(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        state.putBoolean("sound.source.local", this.showingLocal);
        SoundCategory soundCategory = this.pendingCategory;
        state.putString("sound.import.category", soundCategory != null ? soundCategory.name() : null);
        Uri uri = this.pendingUri;
        state.putString("sound.import.uri", uri != null ? uri.toString() : null);
    }

    public final void attach(RecyclerView recycler) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        this.host = recycler;
        View view = this.fragment.getView();
        this.sourceSelector = view != null ? view.findViewById(C3715R.id.neizzir_sound_sources) : null;
        View view2 = this.fragment.getView();
        this.localTab = view2 != null ? (TextView) view2.findViewById(C3715R.id.neizzir_sound_source_local) : null;
        View view3 = this.fragment.getView();
        this.remoteTab = view3 != null ? (TextView) view3.findViewById(C3715R.id.neizzir_sound_source_remote) : null;
        TextView textView = this.localTab;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    SoundCustomizationController.attach$lambda$3(this.f$0, view4);
                }
            });
        }
        TextView textView2 = this.remoteTab;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    SoundCustomizationController.attach$lambda$4(this.f$0, view4);
                }
            });
        }
        consumeImport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attach$lambda$3(SoundCustomizationController this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectSource(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attach$lambda$4(SoundCustomizationController this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectSource(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectSource(boolean local) {
        if (this.category == null) {
            return;
        }
        if (this.showingLocal != local) {
            this.preview.stop();
        }
        this.showingLocal = local;
        renderSource();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:
    
        if (r0 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void renderSource() {
        /*
            r14 = this;
            com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCategory r0 = r14.category
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r14.showingLocal
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L11
            com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$LocalAdapter r0 = r14.localAdapter
        Le:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = (androidx.recyclerview.widget.RecyclerView.Adapter) r0
            goto L29
        L11:
            androidx.recyclerview.widget.RecyclerView$Adapter<?> r0 = r14.remoteAdapter
            if (r0 == 0) goto L26
            r4 = r0
            r5 = 0
            int r6 = r4.getSizeInv()
            if (r6 <= 0) goto L1f
            r4 = r3
            goto L20
        L1f:
            r4 = r2
        L20:
            if (r4 == 0) goto L23
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 != 0) goto L29
        L26:
            com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$RemoteStatusAdapter r0 = r14.statusAdapter
            goto Le
        L29:
            androidx.recyclerview.widget.RecyclerView r4 = r14.host
            if (r4 == 0) goto L31
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r4.getAdapter()
        L31:
            if (r1 == r0) goto L3b
            androidx.recyclerview.widget.RecyclerView r1 = r14.host
            if (r1 != 0) goto L38
            goto L3b
        L38:
            r1.setAdapter(r0)
        L3b:
            r1 = 2
            kotlin.Pair[] r1 = new kotlin.Pair[r1]
            android.widget.TextView r4 = r14.localTab
            boolean r5 = r14.showingLocal
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            kotlin.Pair r4 = kotlin.TuplesKt.m4423to(r4, r5)
            r1[r2] = r4
            android.widget.TextView r2 = r14.remoteTab
            boolean r4 = r14.showingLocal
            r4 = r4 ^ r3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            kotlin.Pair r2 = kotlin.TuplesKt.m4423to(r2, r4)
            r1[r3] = r2
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            java.util.Iterator r3 = r1.iterator()
        L66:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lc3
            java.lang.Object r4 = r3.next()
            r5 = r4
            kotlin.Pair r5 = (kotlin.Pair) r5
            r6 = 0
            java.lang.Object r7 = r5.component1()
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.Object r5 = r5.component2()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r7 == 0) goto Lc0
            r8 = r7
            r9 = 0
            r8.setSelected(r5)
            if (r5 == 0) goto L90
            java.lang.String r10 = "#00E5CC"
            goto L92
        L90:
            java.lang.String r10 = "#81818D"
        L92:
            int r10 = android.graphics.Color.parseColor(r10)
            r8.setTextColor(r10)
            android.graphics.drawable.GradientDrawable r10 = new android.graphics.drawable.GradientDrawable
            r10.<init>()
            r11 = r10
            r12 = 0
            r13 = 9
            int r13 = r14.m1427dp(r13)
            float r13 = (float) r13
            r11.setCornerRadius(r13)
            if (r5 == 0) goto Laf
            java.lang.String r13 = "#263330"
            goto Lb1
        Laf:
            java.lang.String r13 = "#0015151B"
        Lb1:
            int r13 = android.graphics.Color.parseColor(r13)
            r11.setColor(r13)
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            r8.setBackground(r10)
        Lc0:
            goto L66
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController.renderSource():void");
    }

    public final void show(SoundCategory value, Function0<Unit> onRetryRemote) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onRetryRemote, "onRetryRemote");
        clear();
        this.category = value;
        this.retryRemote = onRetryRemote;
        LocalAdapter adapter = new LocalAdapter(this, value);
        this.localAdapter = adapter;
        this.remoteStatus = "Загружаем каталог…";
        this.remoteLoading = true;
        this.statusAdapter = new RemoteStatusAdapter();
        View view = this.sourceSelector;
        if (view != null) {
            view.setVisibility(0);
        }
        renderSource();
        refresh();
    }

    public final void setRemote(SoundCategory value, RecyclerView.Adapter<?> adapter) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (this.category != value) {
            return;
        }
        this.remoteAdapter = adapter;
        this.remoteLoading = false;
        this.remoteStatus = "Каталог недоступен\nНажмите, чтобы повторить";
        RemoteStatusAdapter remoteStatusAdapter = this.statusAdapter;
        if (remoteStatusAdapter != null) {
            remoteStatusAdapter.notifyItemChanged(0);
        }
        renderSource();
    }

    public final boolean isVisible() {
        return this.category != null;
    }

    public final void onPause() {
        this.preview.stop();
        if (this.remoteAdapter == null) {
            this.remoteLoading = false;
            this.remoteStatus = "Нажмите, чтобы загрузить каталог";
            RemoteStatusAdapter remoteStatusAdapter = this.statusAdapter;
            if (remoteStatusAdapter != null) {
                remoteStatusAdapter.notifyItemChanged(0);
            }
        }
    }

    public final void clear() {
        this.preview.stop();
        Job job = this.listJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        AlertDialog alertDialog = this.dialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.dialog = null;
        this.category = null;
        this.localAdapter = null;
        this.statusAdapter = null;
        View view = this.sourceSelector;
        if (view != null) {
            view.setVisibility(8);
        }
        this.remoteAdapter = null;
        this.retryRemote = null;
    }

    public final void destroyView() {
        clear();
        Job job = this.operation;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        LauncherDialogHelper.ProgressHandle progressHandle = this.progress;
        if (progressHandle != null) {
            progressHandle.dismiss();
        }
        this.progress = null;
        this.host = null;
        this.sourceSelector = null;
        this.localTab = null;
        this.remoteTab = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refresh() {
        LocalAdapter adapter;
        SoundCategory selected = this.category;
        if (selected == null || (adapter = this.localAdapter) == null) {
            return;
        }
        Job job = this.listJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        LifecycleOwner viewLifecycleOwner = this.fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.listJob = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C54031(selected, adapter, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$refresh$1 */
    /* JADX INFO: compiled from: SoundCustomizationController.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$refresh$1", m4426f = "SoundCustomizationController.kt", m4427i = {}, m4428l = {173}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LocalAdapter $adapter;
        final /* synthetic */ SoundCategory $selected;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54031(SoundCategory soundCategory, LocalAdapter localAdapter, Continuation<? super C54031> continuation) {
            super(2, continuation);
            this.$selected = soundCategory;
            this.$adapter = localAdapter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SoundCustomizationController.this.new C54031(this.$selected, this.$adapter, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0045 A[Catch: Exception -> 0x0059, CancellationException -> 0x005d, TRY_LEAVE, TryCatch #5 {CancellationException -> 0x005d, Exception -> 0x0059, blocks: (B:18:0x0039, B:20:0x0045), top: B:36:0x0039 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C54031 c54031;
            C54031 c54032;
            List<LocalSound> list;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c54031 = this;
                    try {
                        c54031.label = 1;
                        Object list2 = SoundCustomizationController.this.getRepository().list(c54031.$selected, c54031);
                        if (list2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        $result = list2;
                        try {
                            list = (List) $result;
                            if (SoundCustomizationController.this.localAdapter == c54031.$adapter) {
                                SoundCustomizationController.this.getPreview().stop();
                                c54031.$adapter.setItems(list);
                                c54031.$adapter.notifyDataSetChanged();
                            }
                            break;
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Exception e2) {
                            $result = $result;
                            c54032 = c54031;
                            SoundCustomizationController.this.message("Не удалось прочитать библиотеку звуков");
                        }
                        return Unit.INSTANCE;
                    } catch (CancellationException e3) {
                        throw e3;
                    } catch (Exception e4) {
                        c54032 = c54031;
                        SoundCustomizationController.this.message("Не удалось прочитать библиотеку звуков");
                        return Unit.INSTANCE;
                    }
                case 1:
                    c54032 = this;
                    try {
                        ResultKt.throwOnFailure($result);
                        c54031 = c54032;
                        list = (List) $result;
                        if (SoundCustomizationController.this.localAdapter == c54031.$adapter) {
                            SoundCustomizationController.this.getPreview().stop();
                            c54031.$adapter.setItems(list);
                            c54031.$adapter.notifyDataSetChanged();
                        }
                        break;
                    } catch (CancellationException e5) {
                        throw e5;
                    } catch (Exception e6) {
                        SoundCustomizationController.this.message("Не удалось прочитать библиотеку звуков");
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void chooseFile(SoundCategory value) {
        Job job = this.operation;
        if (job != null && job.isActive()) {
            message("Дождитесь завершения обработки");
            return;
        }
        this.preview.stop();
        this.pendingCategory = value;
        try {
            this.chooser.launch(value == SoundCategory.HIT ? new String[]{MimeTypes.AUDIO_MPEG, "audio/mp3"} : new String[]{MimeTypes.AUDIO_MPEG, "audio/mp3", MimeTypes.AUDIO_WAV, "audio/x-wav", "audio/wave", "audio/vnd.wave"});
        } catch (Exception e) {
            this.pendingCategory = null;
            message("На устройстве нет приложения для выбора файлов");
        }
    }

    private final void consumeImport() {
        Uri uri;
        SoundCategory target;
        if (this.host == null || this.fragment.getView() == null || (uri = this.pendingUri) == null || (target = this.pendingCategory) == null) {
            return;
        }
        this.pendingUri = null;
        this.pendingCategory = null;
        runOperation("Проверка звука", new C53961(uri, target, null));
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$consumeImport$1 */
    /* JADX INFO: compiled from: SoundCustomizationController.kt */
    @Metadata(m4415d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m4416d2 = {"<anonymous>", ""}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$consumeImport$1", m4426f = "SoundCustomizationController.kt", m4427i = {}, m4428l = {196}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C53961 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ SoundCategory $target;
        final /* synthetic */ Uri $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53961(Uri uri, SoundCategory soundCategory, Continuation<? super C53961> continuation) {
            super(1, continuation);
            this.$uri = uri;
            this.$target = soundCategory;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return SoundCustomizationController.this.new C53961(this.$uri, this.$target, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C53961) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C53961 c53961;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c53961 = this;
                    c53961.label = 1;
                    Object objM14876import = SoundCustomizationController.this.getRepository().m14876import(c53961.$uri, c53961.$target, c53961);
                    if (objM14876import == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objM14876import;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c53961 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LocalSound item = (LocalSound) $result;
            SoundCustomizationController.this.refresh();
            if (SoundCustomizationController.this.category == c53961.$target) {
                SoundCustomizationController.this.selectSource(true);
                SoundCustomizationController.this.showAssignments(item);
            } else {
                SoundCustomizationController.this.message("Звук добавлен в «Мои звуки»");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAssignments(LocalSound item) {
        final LocalSound localSound = item;
        this.preview.stop();
        List actions = CollectionsKt__CollectionsKt.mutableListOf(new LauncherDialogHelper.ActionItem("На все звуки", "Заменить все звуки этой категории", true, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$showAssignments$actions$1
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
                this.this$0.install(localSound, localSound.getCategory().getSlots());
            }
        }));
        Iterable $this$forEachIndexed$iv = item.getCategory().getSlots();
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int index$iv2 = index$iv + 1;
            if (index$iv < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            final String slot = (String) item$iv;
            actions.add(new LauncherDialogHelper.ActionItem("Слот " + (index$iv + 1), "Заменить только этот звук", false, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$showAssignments$1$1
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
                    this.this$0.install(localSound, CollectionsKt__CollectionsJVMKt.listOf(slot));
                }
            }, 4, null));
            localSound = item;
            index$iv = index$iv2;
        }
        AlertDialog alertDialog = this.dialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.dialog = LauncherDialogHelper.INSTANCE.showActionDialog(getContext(), "Установить звук", (48 & 4) != 0 ? null : item.getName() + "\nИзменения применятся при следующем запуске игры", actions, (48 & 16) != 0 ? "Закрыть" : null, (48 & 32) != 0);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$install$1 */
    /* JADX INFO: compiled from: SoundCustomizationController.kt */
    @Metadata(m4415d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m4416d2 = {"<anonymous>", ""}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$install$1", m4426f = "SoundCustomizationController.kt", m4427i = {0}, m4428l = {222, 223}, m4429m = "invokeSuspend", m4430n = {"source"}, m4431s = {"L$0"})
    static final class C53981 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ LocalSound $item;
        final /* synthetic */ List<String> $slots;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53981(LocalSound localSound, List<String> list, Continuation<? super C53981> continuation) {
            super(1, continuation);
            this.$item = localSound;
            this.$slots = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return SoundCustomizationController.this.new C53981(this.$item, this.$slots, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C53981) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0085 A[LOOP:0: B:14:0x007f->B:16:0x0085, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:19:0x00a7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x00a8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C53981 c53981;
            File source;
            SoundCustomizationController soundCustomizationController;
            SoundCategory category;
            LinkedHashMap result$iv;
            C53981 c53982;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    c53981 = this;
                    if (GameStarter.INSTANCE.isStarting()) {
                        throw new IllegalStateException("Дождитесь завершения запуска игры".toString());
                    }
                    source = SoundCustomizationController.this.getRepository().file(c53981.$item);
                    c53981.L$0 = source;
                    c53981.label = 1;
                    if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(source, c53981.$item, null), c53981) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    soundCustomizationController = SoundCustomizationController.this;
                    category = c53981.$item.getCategory();
                    Iterable $this$associateWith$iv = c53981.$slots;
                    result$iv = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$associateWith$iv, 10)), 16));
                    for (Object element$iv$iv : $this$associateWith$iv) {
                        result$iv.put(element$iv$iv, source);
                    }
                    c53981.L$0 = null;
                    c53981.label = 2;
                    if (soundCustomizationController.installFiles(category, result$iv, c53981) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c53982 = c53981;
                    SoundCustomizationController.this.installedMessage(c53982.$item.getCategory());
                    return Unit.INSTANCE;
                case 1:
                    c53981 = this;
                    source = (File) c53981.L$0;
                    ResultKt.throwOnFailure($result);
                    soundCustomizationController = SoundCustomizationController.this;
                    category = c53981.$item.getCategory();
                    Iterable $this$associateWith$iv2 = c53981.$slots;
                    result$iv = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$associateWith$iv2, 10)), 16));
                    while (r10.hasNext()) {
                        result$iv.put(element$iv$iv, source);
                    }
                    c53981.L$0 = null;
                    c53981.label = 2;
                    if (soundCustomizationController.installFiles(category, result$iv, c53981) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c53982 = c53981;
                    SoundCustomizationController.this.installedMessage(c53982.$item.getCategory());
                    return Unit.INSTANCE;
                case 2:
                    c53982 = this;
                    ResultKt.throwOnFailure($result);
                    SoundCustomizationController.this.installedMessage(c53982.$item.getCategory());
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$install$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: SoundCustomizationController.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$install$1$2", m4426f = "SoundCustomizationController.kt", m4427i = {}, m4428l = {222}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SoundInfo>, Object> {
            final /* synthetic */ LocalSound $item;
            final /* synthetic */ File $source;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(File file, LocalSound localSound, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$source = file;
                this.$item = localSound;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$source, this.$item, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SoundInfo> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        Object objValidate = AndroidSoundValidator.INSTANCE.validate(this.$source, this.$item.getInfo().getExtension(), this.$item.getCategory(), this);
                        return objValidate == coroutine_suspended ? coroutine_suspended : objValidate;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        return $result;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void install(LocalSound item, List<String> slots) {
        runOperation("Установка звука", new C53981(item, slots, null));
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$installRemote$1 */
    /* JADX INFO: compiled from: SoundCustomizationController.kt */
    @Metadata(m4415d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m4416d2 = {"<anonymous>", ""}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$installRemote$1", m4426f = "SoundCustomizationController.kt", m4427i = {}, m4428l = {231, 239}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54001 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ File $folder;
        final /* synthetic */ SoundCategory $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C54001(SoundCategory soundCategory, File file, Continuation<? super C54001> continuation) {
            super(1, continuation);
            this.$value = soundCategory;
            this.$folder = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return SoundCustomizationController.this.new C54001(this.$value, this.$folder, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C54001) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0054  */
        /* JADX WARN: Code duplicated, block: B:18:0x0064 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0065  */
        /* JADX WARN: Code duplicated, block: B:22:0x0071  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C54001 c54001;
            Map files;
            C54001 c54002;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (GameStarter.INSTANCE.isStarting()) {
                        throw new IllegalStateException("Дождитесь завершения запуска игры".toString());
                    }
                    this.label = 1;
                    Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new SoundCustomizationController$installRemote$1$files$1(this.$value, this.$folder, null), this);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objWithContext;
                    c54001 = this;
                    files = (Map) $result;
                    if (!files.isEmpty()) {
                        throw new IllegalArgumentException("Файлы звуков не найдены".toString());
                    }
                    c54001.label = 2;
                    if (SoundCustomizationController.this.installFiles(c54001.$value, files, c54001) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c54002 = c54001;
                    SoundCustomizationController.this.installedMessage(c54002.$value);
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure($result);
                    c54001 = this;
                    files = (Map) $result;
                    if (!files.isEmpty()) {
                        throw new IllegalArgumentException("Файлы звуков не найдены".toString());
                    }
                    c54001.label = 2;
                    if (SoundCustomizationController.this.installFiles(c54001.$value, files, c54001) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c54002 = c54001;
                    SoundCustomizationController.this.installedMessage(c54002.$value);
                    return Unit.INSTANCE;
                case 2:
                    c54002 = this;
                    ResultKt.throwOnFailure($result);
                    SoundCustomizationController.this.installedMessage(c54002.$value);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void installRemote(SoundCategory value, File folder) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(folder, "folder");
        runOperation("Установка звуков", new C54001(value, folder, null));
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$installFiles$2 */
    /* JADX INFO: compiled from: SoundCustomizationController.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$installFiles$2", m4426f = "SoundCustomizationController.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C53992 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<String, File> $files;
        final /* synthetic */ SoundCategory $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C53992(SoundCategory soundCategory, Map<String, ? extends File> map, Continuation<? super C53992> continuation) {
            super(2, continuation);
            this.$value = soundCategory;
            this.$files = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SoundCustomizationController.this.new C53992(this.$value, this.$files, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C53992) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    if (GameStarter.INSTANCE.isStarting()) {
                        throw new IllegalStateException("Дождитесь завершения запуска игры".toString());
                    }
                    CustomResources customResources = CustomResources.INSTANCE;
                    Context context = SoundCustomizationController.this.getContext();
                    final SoundCategory soundCategory = this.$value;
                    final Map<String, File> map = this.$files;
                    customResources.edit(context, new Function1<File, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController.installFiles.2.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(File file) {
                            invoke2(file);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(File stage) {
                            Intrinsics.checkNotNullParameter(stage, "stage");
                            new SoundInstaller(stage, null, 2, null).install(soundCategory, map);
                        }
                    });
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object installFiles(SoundCategory value, Map<String, ? extends File> map, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO().plus(NonCancellable.INSTANCE), new C53992(value, map, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    public final void installedMessage(SoundCategory value) {
        boolean z;
        if (value == SoundCategory.HIT) {
            z = new SettingsRepository(getContext()).readKeyValue(new File(getContext().getFilesDir(), "settings.ini"), "iKolokol") != 1;
        }
        boolean disabled = z;
        message(disabled ? "Звук установлен. Включите «Звуки попадания» в настройках. Изменения — после запуска игры" : "Звуки установлены. Изменения — при следующем запуске игры");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void delete(final LocalSound item) {
        this.dialog = LauncherDialogHelper.INSTANCE.showConfirmDialog(getContext(), "Удалить из моих звуков?", item.getName() + "\nУстановленный в игре звук сохранится.", (128 & 8) != 0 ? "Подтвердить" : "Удалить", (128 & 16) != 0 ? "Отмена" : null, (128 & 32) != 0, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController.delete.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$delete$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: SoundCustomizationController.kt */
            @Metadata(m4415d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m4416d2 = {"<anonymous>", ""}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
            @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$delete$1$1", m4426f = "SoundCustomizationController.kt", m4427i = {}, m4428l = {260}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
                final /* synthetic */ LocalSound $item;
                int label;
                final /* synthetic */ SoundCustomizationController this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SoundCustomizationController soundCustomizationController, LocalSound localSound, Continuation<? super AnonymousClass1> continuation) {
                    super(1, continuation);
                    this.this$0 = soundCustomizationController;
                    this.$item = localSound;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$item, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object $result) {
                    AnonymousClass1 anonymousClass1;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (this.label) {
                        case 0:
                            ResultKt.throwOnFailure($result);
                            this.label = 1;
                            if (this.this$0.getRepository().delete(this.$item, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            anonymousClass1 = this;
                            break;
                        case 1:
                            anonymousClass1 = this;
                            ResultKt.throwOnFailure($result);
                            break;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    anonymousClass1.this$0.refresh();
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SoundCustomizationController.this.runOperation("Удаление звука", new AnonymousClass1(SoundCustomizationController.this, item, null));
            }
        }, (128 & 128) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runOperation(String title, Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Job job = this.operation;
        boolean z = false;
        if (job != null && job.isActive()) {
            z = true;
        }
        if (z) {
            message("Дождитесь завершения обработки");
            return;
        }
        this.preview.stop();
        LauncherDialogHelper.ProgressHandle handle = LauncherDialogHelper.createBusyDialog$default(LauncherDialogHelper.INSTANCE, getContext(), title, "Пожалуйста, подождите...", null, null, 24, null);
        this.progress = handle;
        handle.show();
        LifecycleOwner viewLifecycleOwner = this.fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.operation = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C54041(block, this, handle, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$runOperation$1 */
    /* JADX INFO: compiled from: SoundCustomizationController.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$runOperation$1", m4426f = "SoundCustomizationController.kt", m4427i = {}, m4428l = {271}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C54041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> $block;
        final /* synthetic */ LauncherDialogHelper.ProgressHandle $handle;
        int label;
        final /* synthetic */ SoundCustomizationController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C54041(Function1<? super Continuation<? super Unit>, ? extends Object> function1, SoundCustomizationController soundCustomizationController, LauncherDialogHelper.ProgressHandle progressHandle, Continuation<? super C54041> continuation) {
            super(2, continuation);
            this.$block = function1;
            this.this$0 = soundCustomizationController;
            this.$handle = progressHandle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54041(this.$block, this.this$0, this.$handle, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C54041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0040 A[PHI: r0
  0x0040: PHI (r0v13 com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$runOperation$1) = 
  (r0v11 com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$runOperation$1)
  (r0v12 com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$runOperation$1)
  (r0v14 com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$runOperation$1)
 binds: [B:34:0x006a, B:43:0x0089, B:23:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:31:0x0057  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws Throwable {
            Exception e;
            C54041 c54041;
            String message;
            C54041 coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        try {
                            Function1<Continuation<? super Unit>, Object> function1 = this.$block;
                            this.label = 1;
                            if (function1.invoke(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c54041 = this;
                            c54041.$handle.dismiss();
                            if (c54041.this$0.progress == c54041.$handle) {
                                c54041.this$0.progress = null;
                            }
                            return Unit.INSTANCE;
                        } catch (TimeoutCancellationException e2) {
                            c54041 = this;
                            c54041.this$0.message("Проверка заняла слишком долго. Выберите другой файл");
                            c54041.$handle.dismiss();
                            if (c54041.this$0.progress == c54041.$handle) {
                            }
                            return Unit.INSTANCE;
                        } catch (CancellationException e3) {
                            throw e3;
                        } catch (Exception e4) {
                            e = e4;
                            c54041 = this;
                            SoundCustomizationController soundCustomizationController = c54041.this$0;
                            message = e.getMessage();
                            if (message == null) {
                                message = "Не удалось обработать звук";
                            }
                            soundCustomizationController.message(message);
                            c54041.$handle.dismiss();
                            if (c54041.this$0.progress == c54041.$handle) {
                            }
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            th = th;
                            coroutine_suspended = this;
                            coroutine_suspended.$handle.dismiss();
                            if (coroutine_suspended.this$0.progress == coroutine_suspended.$handle) {
                                coroutine_suspended.this$0.progress = null;
                            }
                            throw th;
                        }
                    case 1:
                        c54041 = this;
                        try {
                            ResultKt.throwOnFailure($result);
                            c54041.$handle.dismiss();
                            if (c54041.this$0.progress == c54041.$handle) {
                                c54041.this$0.progress = null;
                            }
                        } catch (TimeoutCancellationException e5) {
                            c54041.this$0.message("Проверка заняла слишком долго. Выберите другой файл");
                            c54041.$handle.dismiss();
                            if (c54041.this$0.progress == c54041.$handle) {
                            }
                            return Unit.INSTANCE;
                        } catch (CancellationException e6) {
                            throw e6;
                        } catch (Exception e7) {
                            e = e7;
                            SoundCustomizationController soundCustomizationController2 = c54041.this$0;
                            message = e.getMessage();
                            if (message == null) {
                                message = "Не удалось обработать звук";
                            }
                            soundCustomizationController2.message(message);
                            c54041.$handle.dismiss();
                            if (c54041.this$0.progress == c54041.$handle) {
                            }
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void message(String text) {
        Context it = this.fragment.getContext();
        if (it != null) {
            Toast.makeText(it, text, 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dp */
    public final int m1427dp(int value) {
        return (int) (value * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: SoundCustomizationController.kt */
    @Metadata(m4415d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCustomizationController$RemoteStatusAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCustomizationController$RemoteStatusAdapter$Holder;", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCustomizationController;", "(Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCustomizationController;)V", "getItemCount", "", "onBindViewHolder", "", "holder", InAppViewConstants.POSITION, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Holder", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    final class RemoteStatusAdapter extends RecyclerView.Adapter<Holder> {
        public RemoteStatusAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getSizeInv() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            TextView $this$onCreateViewHolder_u24lambda_u240 = new TextView(parent.getContext());
            SoundCustomizationController soundCustomizationController = SoundCustomizationController.this;
            $this$onCreateViewHolder_u24lambda_u240.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            $this$onCreateViewHolder_u24lambda_u240.setGravity(17);
            $this$onCreateViewHolder_u24lambda_u240.setTextSize(12.0f);
            $this$onCreateViewHolder_u24lambda_u240.setPadding(soundCustomizationController.m1427dp(16), soundCustomizationController.m1427dp(20), soundCustomizationController.m1427dp(16), soundCustomizationController.m1427dp(20));
            $this$onCreateViewHolder_u24lambda_u240.setTextColor(Color.parseColor("#81818D"));
            return new Holder(this, $this$onCreateViewHolder_u24lambda_u240);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(Holder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.getText().setText(SoundCustomizationController.this.remoteStatus);
            holder.getText().setEnabled(!SoundCustomizationController.this.remoteLoading);
            TextView text = holder.getText();
            final SoundCustomizationController soundCustomizationController = SoundCustomizationController.this;
            text.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$RemoteStatusAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SoundCustomizationController.RemoteStatusAdapter.onBindViewHolder$lambda$1(soundCustomizationController, this, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onBindViewHolder$lambda$1(SoundCustomizationController this$0, RemoteStatusAdapter this$1, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (!this$0.remoteLoading) {
                this$0.remoteLoading = true;
                this$0.remoteStatus = "Загружаем каталог…";
                this$1.notifyItemChanged(0);
                Function0 function0 = this$0.retryRemote;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }

        /* JADX INFO: compiled from: SoundCustomizationController.kt */
        @Metadata(m4415d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCustomizationController$RemoteStatusAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "text", "Landroid/widget/TextView;", "(Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCustomizationController$RemoteStatusAdapter;Landroid/widget/TextView;)V", "getText", "()Landroid/widget/TextView;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
        public final class Holder extends RecyclerView.ViewHolder {
            private final TextView text;
            final /* synthetic */ RemoteStatusAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Holder(RemoteStatusAdapter this$0, TextView text) {
                super(text);
                Intrinsics.checkNotNullParameter(text, "text");
                this.this$0 = this$0;
                this.text = text;
            }

            public final TextView getText() {
                return this.text;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: SoundCustomizationController.kt */
    @Metadata(m4415d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000eH\u0016J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\"\u001a\u00020#H\u0002R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCustomizationController$LocalAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCustomizationController$LocalHolder;", "value", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCategory;", "(Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCustomizationController;Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCategory;)V", FirebaseAnalytics.Param.ITEMS, "", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/LocalSound;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "", "icon", "Landroid/widget/ImageView;", "resource", "description", "", Constants.ScionAnalytics.PARAM_LABEL, "Landroid/widget/TextView;", "text", TtmlNode.BOLD, "", "onBindViewHolder", "", "holder", InAppViewConstants.POSITION, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "textColumn", "Landroid/widget/LinearLayout;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    final class LocalAdapter extends RecyclerView.Adapter<LocalHolder> {
        private List<LocalSound> items;
        final /* synthetic */ SoundCustomizationController this$0;
        private final SoundCategory value;

        public LocalAdapter(SoundCustomizationController this$0, SoundCategory value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.this$0 = this$0;
            this.value = value;
            this.items = CollectionsKt__CollectionsKt.emptyList();
        }

        public final List<LocalSound> getItems() {
            return this.items;
        }

        public final void setItems(List<LocalSound> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.items = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getSizeInv() {
            return this.items.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public LocalHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            MaterialCardView card = new MaterialCardView(parent.getContext());
            SoundCustomizationController soundCustomizationController = this.this$0;
            RecyclerView.LayoutParams $this$onCreateViewHolder_u24lambda_u241_u24lambda_u240 = new RecyclerView.LayoutParams(-1, -2);
            $this$onCreateViewHolder_u24lambda_u241_u24lambda_u240.bottomMargin = soundCustomizationController.m1427dp(6);
            card.setLayoutParams($this$onCreateViewHolder_u24lambda_u241_u24lambda_u240);
            card.setRadius(soundCustomizationController.m1427dp(12));
            card.setCardElevation(0.0f);
            card.setCardBackgroundColor(Color.parseColor("#19191F"));
            LinearLayout $this$onCreateViewHolder_u24lambda_u242 = new LinearLayout(parent.getContext());
            SoundCustomizationController soundCustomizationController2 = this.this$0;
            $this$onCreateViewHolder_u24lambda_u242.setOrientation(1);
            $this$onCreateViewHolder_u24lambda_u242.setMinimumHeight(soundCustomizationController2.m1427dp(56));
            $this$onCreateViewHolder_u24lambda_u242.setGravity(16);
            $this$onCreateViewHolder_u24lambda_u242.setPadding(soundCustomizationController2.m1427dp(10), soundCustomizationController2.m1427dp(6), soundCustomizationController2.m1427dp(6), soundCustomizationController2.m1427dp(6));
            card.addView($this$onCreateViewHolder_u24lambda_u242);
            return new LocalHolder(card, $this$onCreateViewHolder_u24lambda_u242);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(LocalHolder holder, int position) {
            int iM1427dp;
            Intrinsics.checkNotNullParameter(holder, "holder");
            if (holder.getKey() != null && Intrinsics.areEqual(this.this$0.getPreview().getActiveKey(), holder.getKey())) {
                this.this$0.getPreview().stop();
            }
            holder.setKey(null);
            holder.getBody().removeAllViews();
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.google.android.material.card.MaterialCardView");
            MaterialCardView card = (MaterialCardView) view;
            card.setOnClickListener(null);
            card.setClickable(false);
            if (position == 0) {
                iM1427dp = this.this$0.m1427dp(1);
            } else {
                iM1427dp = 0;
            }
            card.setStrokeWidth(iM1427dp);
            card.setStrokeColor(Color.parseColor("#25413D"));
            LinearLayout row = new LinearLayout(this.this$0.getContext());
            row.setOrientation(0);
            row.setGravity(16);
            if (position == 0) {
                TextView $this$onBindViewHolder_u24lambda_u245 = new TextView(this.this$0.getContext());
                SoundCustomizationController soundCustomizationController = this.this$0;
                $this$onBindViewHolder_u24lambda_u245.setLayoutParams(new LinearLayout.LayoutParams(soundCustomizationController.m1427dp(34), soundCustomizationController.m1427dp(34)));
                $this$onBindViewHolder_u24lambda_u245.setText(Marker.ANY_NON_NULL_MARKER);
                $this$onBindViewHolder_u24lambda_u245.setTextSize(24.0f);
                $this$onBindViewHolder_u24lambda_u245.setGravity(17);
                $this$onBindViewHolder_u24lambda_u245.setTextColor(Color.parseColor("#00E5CC"));
                GradientDrawable $this$onBindViewHolder_u24lambda_u245_u24lambda_u244 = new GradientDrawable();
                $this$onBindViewHolder_u24lambda_u245_u24lambda_u244.setCornerRadius(soundCustomizationController.m1427dp(10));
                $this$onBindViewHolder_u24lambda_u245_u24lambda_u244.setColor(Color.parseColor("#193A35"));
                $this$onBindViewHolder_u24lambda_u245.setBackground($this$onBindViewHolder_u24lambda_u245_u24lambda_u244);
                $this$onBindViewHolder_u24lambda_u245.setImportantForAccessibility(2);
                row.addView($this$onBindViewHolder_u24lambda_u245);
                LinearLayout $this$onBindViewHolder_u24lambda_u247 = textColumn();
                TextView $this$onBindViewHolder_u24lambda_u247_u24lambda_u246 = label("Добавить свой звук", true);
                $this$onBindViewHolder_u24lambda_u247_u24lambda_u246.setTextColor(Color.parseColor("#00E5CC"));
                $this$onBindViewHolder_u24lambda_u247.addView($this$onBindViewHolder_u24lambda_u247_u24lambda_u246);
                $this$onBindViewHolder_u24lambda_u247.addView(label(this.value.getHint(), false));
                row.addView($this$onBindViewHolder_u24lambda_u247);
                card.setClickable(true);
                card.setFocusable(true);
                final SoundCustomizationController soundCustomizationController2 = this.this$0;
                card.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$LocalAdapter$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SoundCustomizationController.LocalAdapter.onBindViewHolder$lambda$8(soundCustomizationController2, this, view2);
                    }
                });
                holder.getBody().addView(row);
                if (this.value == SoundCategory.HIT && new SettingsRepository(this.this$0.getContext()).readKeyValue(new File(this.this$0.getContext().getFilesDir(), "settings.ini"), "iKolokol") != 1) {
                    LinearLayout body = holder.getBody();
                    TextView $this$onBindViewHolder_u24lambda_u249 = label("Включите «Звуки попадания» в настройках", false);
                    SoundCustomizationController soundCustomizationController3 = this.this$0;
                    $this$onBindViewHolder_u24lambda_u249.setMaxLines(2);
                    $this$onBindViewHolder_u24lambda_u249.setPadding(soundCustomizationController3.m1427dp(42), soundCustomizationController3.m1427dp(5), soundCustomizationController3.m1427dp(4), 0);
                    body.addView($this$onBindViewHolder_u24lambda_u249);
                    return;
                }
                return;
            }
            card.setFocusable(false);
            final LocalSound item = this.items.get(position - 1);
            final String key = "local:" + this.value.name() + AbstractJsonLexerKt.COLON + item.getId();
            holder.setKey(key);
            final ImageView play = icon(C3715R.drawable.neizzir_ic_play, "Прослушать звук");
            final SoundCustomizationController soundCustomizationController4 = this.this$0;
            play.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$LocalAdapter$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SoundCustomizationController.LocalAdapter.onBindViewHolder$lambda$10(soundCustomizationController4, key, item, play, view2);
                }
            });
            row.addView(play);
            LinearLayout $this$onBindViewHolder_u24lambda_u2411 = textColumn();
            $this$onBindViewHolder_u24lambda_u2411.addView(label(item.getName(), true));
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.getDefault();
            Double dValueOf = Double.valueOf(item.getInfo().getDurationMs() / 1000.0d);
            String upperCase = item.getInfo().getExtension().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            String str = String.format(locale, "%.1f с · %s · %.0f КБ", Arrays.copyOf(new Object[]{dValueOf, upperCase, Double.valueOf(item.getBytes() / 1024.0d)}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            $this$onBindViewHolder_u24lambda_u2411.addView(label(str, false));
            row.addView($this$onBindViewHolder_u24lambda_u2411);
            ImageView $this$onBindViewHolder_u24lambda_u2413 = icon(C3715R.drawable.neizzir20_ic_download, "Установить звук");
            final SoundCustomizationController soundCustomizationController5 = this.this$0;
            $this$onBindViewHolder_u24lambda_u2413.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$LocalAdapter$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SoundCustomizationController.LocalAdapter.onBindViewHolder$lambda$13$lambda$12(soundCustomizationController5, item, view2);
                }
            });
            row.addView($this$onBindViewHolder_u24lambda_u2413);
            ImageView $this$onBindViewHolder_u24lambda_u2415 = icon(R.drawable.ic_menu_delete, "Удалить из моих звуков");
            final SoundCustomizationController soundCustomizationController6 = this.this$0;
            $this$onBindViewHolder_u24lambda_u2415.setColorFilter(Color.parseColor("#73737F"));
            $this$onBindViewHolder_u24lambda_u2415.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$LocalAdapter$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SoundCustomizationController.LocalAdapter.onBindViewHolder$lambda$15$lambda$14(soundCustomizationController6, item, view2);
                }
            });
            row.addView($this$onBindViewHolder_u24lambda_u2415);
            holder.getBody().addView(row);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onBindViewHolder$lambda$8(SoundCustomizationController this$0, LocalAdapter this$1, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.chooseFile(this$1.value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onBindViewHolder$lambda$10(SoundCustomizationController this$0, String key, LocalSound item, final ImageView play, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(key, "$key");
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(play, "$play");
            this$0.getPreview().toggle(key, CollectionsKt__CollectionsJVMKt.listOf(this$0.getRepository().file(item).getAbsolutePath()), new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCustomizationController$LocalAdapter$onBindViewHolder$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean playing) {
                    play.setImageResource(playing ? C3715R.drawable.neizzir20_ic_stop : C3715R.drawable.neizzir_ic_play);
                    play.setColorFilter(Color.parseColor(playing ? "#EF4444" : "#00E5CC"));
                    play.setContentDescription(playing ? "Остановить звук" : "Прослушать звук");
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onBindViewHolder$lambda$13$lambda$12(SoundCustomizationController this$0, LocalSound item, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            this$0.showAssignments(item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onBindViewHolder$lambda$15$lambda$14(SoundCustomizationController this$0, LocalSound item, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            this$0.delete(item);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(LocalHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            if (holder.getKey() != null && Intrinsics.areEqual(this.this$0.getPreview().getActiveKey(), holder.getKey())) {
                this.this$0.getPreview().stop();
            }
            holder.setKey(null);
        }

        private final LinearLayout textColumn() {
            LinearLayout $this$textColumn_u24lambda_u2417 = new LinearLayout(this.this$0.getContext());
            SoundCustomizationController soundCustomizationController = this.this$0;
            LinearLayout.LayoutParams $this$textColumn_u24lambda_u2417_u24lambda_u2416 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            $this$textColumn_u24lambda_u2417_u24lambda_u2416.setMarginStart(soundCustomizationController.m1427dp(8));
            $this$textColumn_u24lambda_u2417_u24lambda_u2416.setMarginEnd(soundCustomizationController.m1427dp(4));
            $this$textColumn_u24lambda_u2417.setLayoutParams($this$textColumn_u24lambda_u2417_u24lambda_u2416);
            $this$textColumn_u24lambda_u2417.setOrientation(1);
            return $this$textColumn_u24lambda_u2417;
        }

        private final TextView label(String text, boolean bold) {
            TextView $this$label_u24lambda_u2418 = new TextView(this.this$0.getContext());
            SoundCustomizationController soundCustomizationController = this.this$0;
            $this$label_u24lambda_u2418.setText(text);
            $this$label_u24lambda_u2418.setTextSize(bold ? 13.0f : 11.0f);
            $this$label_u24lambda_u2418.setMaxLines(1);
            $this$label_u24lambda_u2418.setEllipsize(TextUtils.TruncateAt.END);
            $this$label_u24lambda_u2418.setTextColor(Color.parseColor(bold ? "#F2F2F5" : "#81818D"));
            if (bold) {
                $this$label_u24lambda_u2418.setTypeface(ResourcesCompat.getFont($this$label_u24lambda_u2418.getContext(), C3715R.font.montserrat_extra_bold));
            }
            $this$label_u24lambda_u2418.setPadding(0, soundCustomizationController.m1427dp(2), 0, soundCustomizationController.m1427dp(2));
            return $this$label_u24lambda_u2418;
        }

        private final ImageView icon(int resource, String description) {
            ImageView $this$icon_u24lambda_u2419 = new ImageView(this.this$0.getContext());
            SoundCustomizationController soundCustomizationController = this.this$0;
            $this$icon_u24lambda_u2419.setLayoutParams(new LinearLayout.LayoutParams(soundCustomizationController.m1427dp(40), soundCustomizationController.m1427dp(44)));
            $this$icon_u24lambda_u2419.setPadding(soundCustomizationController.m1427dp(10), soundCustomizationController.m1427dp(12), soundCustomizationController.m1427dp(10), soundCustomizationController.m1427dp(12));
            $this$icon_u24lambda_u2419.setImageResource(resource);
            $this$icon_u24lambda_u2419.setColorFilter(Color.parseColor("#00E5CC"));
            $this$icon_u24lambda_u2419.setBackgroundResource(C3715R.drawable.neizzir20_ripple_circle);
            $this$icon_u24lambda_u2419.setContentDescription(description);
            return $this$icon_u24lambda_u2419;
        }
    }

    /* JADX INFO: compiled from: SoundCustomizationController.kt */
    @Metadata(m4415d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCustomizationController$LocalHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "body", "Landroid/widget/LinearLayout;", "(Landroid/view/View;Landroid/widget/LinearLayout;)V", "getBody", "()Landroid/widget/LinearLayout;", "key", "", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final class LocalHolder extends RecyclerView.ViewHolder {
        private final LinearLayout body;
        private String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalHolder(View view, LinearLayout body) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(body, "body");
            this.body = body;
        }

        public final LinearLayout getBody() {
            return this.body;
        }

        public final String getKey() {
            return this.key;
        }

        public final void setKey(String str) {
            this.key = str;
        }
    }
}
