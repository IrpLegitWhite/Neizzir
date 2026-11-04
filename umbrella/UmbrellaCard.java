package com.blackhub.bronline.neizzir.umbrella;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.gui.donate.utils.DonateConstants;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: UmbrellaCard.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaCard;", "", "()V", "bind", "", "fragment", "Landroidx/fragment/app/Fragment;", "root", "Landroid/view/View;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class UmbrellaCard {
    public static final UmbrellaCard INSTANCE = new UmbrellaCard();

    private UmbrellaCard() {
    }

    public final void bind(final Fragment fragment, View root) {
        Object objM15551constructorimpl;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(root, "root");
        final Context context = fragment.requireContext().getApplicationContext();
        final View toggle = root.findViewById(C3715R.id.umbrella_enable);
        View track = root.findViewById(C3715R.id.umbrella_toggle_track);
        View thumb = root.findViewById(C3715R.id.umbrella_toggle_thumb);
        TextView status = (TextView) root.findViewById(C3715R.id.umbrella_status);
        ProgressBar progress = (ProgressBar) root.findViewById(C3715R.id.umbrella_progress);
        final EditText command = (EditText) root.findViewById(C3715R.id.umbrella_command);
        View restart = root.findViewById(C3715R.id.umbrella_restart);
        final Ref.BooleanRef checked = new Ref.BooleanRef();
        UmbrellaManager umbrellaManager = UmbrellaManager.INSTANCE;
        Intrinsics.checkNotNull(context);
        checked.element = umbrellaManager.enabled(context);
        ViewCompat.setAccessibilityDelegate(toggle, new AccessibilityDelegateCompat() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaCard.bind.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.setClassName("android.widget.Switch");
                info.setCheckable(true);
                info.setChecked(checked.element);
            }
        });
        try {
            Result.Companion companion = Result.INSTANCE;
            UmbrellaCard umbrellaCard = this;
            objM15551constructorimpl = Result.m15551constructorimpl(UmbrellaManager.INSTANCE.command(context));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
            objM15551constructorimpl = UmbrellaConfig.DEFAULT_COMMAND;
        }
        command.setText((CharSequence) objM15551constructorimpl);
        bind$showToggle(checked, track, thumb, context, toggle, checked.element, false);
        toggle.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UmbrellaCard.bind$lambda$1(checked, toggle, context, view);
            }
        });
        final Lifecycle lifecycle = fragment.getViewLifecycleOwner().getLifecycle();
        final UmbrellaCommandAutosaver autosaver = new UmbrellaCommandAutosaver(CoroutineScopeKt.CoroutineScope(NetworkRuntime.INSTANCE.getApplicationScope().getCoroutineContext().plus(Dispatchers.getMain().getImmediate())), new UmbrellaCard$bind$autosaver$1(context, null), new Function2<String, String, Unit>() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$bind$autosaver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
                invoke2(str, str2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String value, String error) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (lifecycle.getState() != Lifecycle.State.DESTROYED && Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) command.getText().toString()).toString(), value)) {
                    command.setError(error);
                }
            }
        });
        Intrinsics.checkNotNull(command);
        EditText $this$doAfterTextChanged$iv = command;
        $this$doAfterTextChanged$iv.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$bind$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                command.setError(null);
                UmbrellaCard.bind$saveCommand(autosaver, command, false);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        command.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$$ExternalSyntheticLambda1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                UmbrellaCard.bind$lambda$3(autosaver, command, view, z);
            }
        });
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaCard.bind.6
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                UmbrellaCard.bind$saveCommand$default(autosaver, command, false, 4, null);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                owner.getLifecycle().removeObserver(this);
            }
        });
        command.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$$ExternalSyntheticLambda2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return UmbrellaCard.bind$lambda$4(command, autosaver, textView, i, keyEvent);
            }
        });
        root.findViewById(C3715R.id.umbrella_gallery).setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UmbrellaCard.bind$lambda$5(fragment, view);
            }
        });
        restart.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UmbrellaCard.bind$lambda$6(fragment, view);
            }
        });
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C568610(fragment, context, toggle, track, status, progress, restart, checked, thumb, null), 3, null);
    }

    static /* synthetic */ void bind$showToggle$default(Ref.BooleanRef booleanRef, View view, View view2, Context context, View view3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 64) != 0) {
            z2 = true;
        }
        bind$showToggle(booleanRef, view, view2, context, view3, z, z2);
    }

    private static final void bind$showToggle(Ref.BooleanRef checked, View track, View thumb, Context context, View toggle, boolean value, boolean animate) {
        checked.element = value;
        track.setBackgroundResource(value ? C3715R.drawable.neizzir20_toggle_track_on_new : C3715R.drawable.neizzir20_toggle_track_off_new);
        thumb.setBackgroundResource(value ? C3715R.drawable.neizzir20_toggle_thumb_on : C3715R.drawable.neizzir20_toggle_thumb_new);
        float position = value ? context.getResources().getDisplayMetrics().density * 22.0f : 0.0f;
        thumb.animate().cancel();
        if (animate) {
            thumb.animate().translationX(position).setDuration(150L).start();
        } else {
            thumb.setTranslationX(position);
        }
        ViewCompat.setStateDescription(toggle, value ? "Включено" : "Выключено");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(Ref.BooleanRef checked, View $toggle, Context $context, View it) {
        Intrinsics.checkNotNullParameter(checked, "$checked");
        boolean requested = !checked.element;
        $toggle.setEnabled(false);
        BuildersKt__Builders_commonKt.launch$default(NetworkRuntime.INSTANCE.getApplicationScope(), null, null, new UmbrellaCard$bind$3$1($context, requested, $toggle, null), 3, null);
    }

    static /* synthetic */ void bind$saveCommand$default(UmbrellaCommandAutosaver umbrellaCommandAutosaver, EditText editText, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        bind$saveCommand(umbrellaCommandAutosaver, editText, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$saveCommand(UmbrellaCommandAutosaver autosaver, EditText command, boolean immediately) {
        autosaver.submit(StringsKt__StringsKt.trim((CharSequence) command.getText().toString()).toString(), immediately);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3(UmbrellaCommandAutosaver autosaver, EditText $command, View view, boolean hasFocus) {
        Intrinsics.checkNotNullParameter(autosaver, "$autosaver");
        if (hasFocus) {
            return;
        }
        bind$saveCommand$default(autosaver, $command, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bind$lambda$4(EditText $command, UmbrellaCommandAutosaver autosaver, TextView textView, int action, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(autosaver, "$autosaver");
        if (action == 6) {
            bind$saveCommand$default(autosaver, $command, false, 4, null);
            $command.clearFocus();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$5(Fragment fragment, View it) {
        Intrinsics.checkNotNullParameter(fragment, "$fragment");
        UmbrellaGallery.INSTANCE.show(fragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$6(Fragment fragment, View it) {
        Intrinsics.checkNotNullParameter(fragment, "$fragment");
        fragment.startActivity(new Intent(fragment.requireContext(), (Class<?>) UmbrellaRestartActivity.class).putExtra("previousPid", Process.myPid()));
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$bind$10 */
    /* JADX INFO: compiled from: UmbrellaCard.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$bind$10", m4426f = "UmbrellaCard.kt", m4427i = {}, m4428l = {91}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C568610 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.BooleanRef $checked;
        final /* synthetic */ Context $context;
        final /* synthetic */ Fragment $fragment;
        final /* synthetic */ ProgressBar $progress;
        final /* synthetic */ View $restart;
        final /* synthetic */ TextView $status;
        final /* synthetic */ View $thumb;
        final /* synthetic */ View $toggle;
        final /* synthetic */ View $track;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C568610(Fragment fragment, Context context, View view, View view2, TextView textView, ProgressBar progressBar, View view3, Ref.BooleanRef booleanRef, View view4, Continuation<? super C568610> continuation) {
            super(2, continuation);
            this.$fragment = fragment;
            this.$context = context;
            this.$toggle = view;
            this.$track = view2;
            this.$status = textView;
            this.$progress = progressBar;
            this.$restart = view3;
            this.$checked = booleanRef;
            this.$thumb = view4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C568610(this.$fragment, this.$context, this.$toggle, this.$track, this.$status, this.$progress, this.$restart, this.$checked, this.$thumb, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C568610) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$bind$10$1, reason: invalid class name */
        /* JADX INFO: compiled from: UmbrellaCard.kt */
        @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
        @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$bind$10$1", m4426f = "UmbrellaCard.kt", m4427i = {}, m4428l = {DonateConstants.ID_PACKS_OPEN_FOM_SERVER}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.BooleanRef $checked;
            final /* synthetic */ Context $context;
            final /* synthetic */ ProgressBar $progress;
            final /* synthetic */ View $restart;
            final /* synthetic */ TextView $status;
            final /* synthetic */ View $thumb;
            final /* synthetic */ View $toggle;
            final /* synthetic */ View $track;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Context context, View view, View view2, TextView textView, ProgressBar progressBar, View view3, Ref.BooleanRef booleanRef, View view4, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$context = context;
                this.$toggle = view;
                this.$track = view2;
                this.$status = textView;
                this.$progress = progressBar;
                this.$restart = view3;
                this.$checked = booleanRef;
                this.$thumb = view4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$context, this.$toggle, this.$track, this.$status, this.$progress, this.$restart, this.$checked, this.$thumb, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$bind$10$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: UmbrellaCard.kt */
            @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
            @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.umbrella.UmbrellaCard$bind$10$1$1", m4426f = "UmbrellaCard.kt", m4427i = {}, m4428l = {DonateConstants.ID_PREMIUM_PLATINUM}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
            static final class C104071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Context $context;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C104071(Context context, Continuation<? super C104071> continuation) {
                    super(2, continuation);
                    this.$context = context;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C104071(this.$context, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C104071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object $result) {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (this.label) {
                        case 0:
                            ResultKt.throwOnFailure($result);
                            UmbrellaManager umbrellaManager = UmbrellaManager.INSTANCE;
                            Context context = this.$context;
                            Intrinsics.checkNotNullExpressionValue(context, "$context");
                            this.label = 1;
                            if (umbrellaManager.refresh(context, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            break;
                        case 1:
                            ResultKt.throwOnFailure($result);
                            break;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        BuildersKt__Builders_commonKt.launch$default(NetworkRuntime.INSTANCE.getApplicationScope(), null, null, new C104071(this.$context, null), 3, null);
                        StateFlow<UmbrellaState> state = UmbrellaManager.INSTANCE.getState();
                        final View view = this.$toggle;
                        final View view2 = this.$track;
                        final TextView textView = this.$status;
                        final ProgressBar progressBar = this.$progress;
                        final View view3 = this.$restart;
                        final Ref.BooleanRef booleanRef = this.$checked;
                        final View view4 = this.$thumb;
                        final Context context = this.$context;
                        this.label = 1;
                        if (state.collect(new FlowCollector() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaCard.bind.10.1.2
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                                return emit((UmbrellaState) value, (Continuation<? super Unit>) $completion);
                            }

                            public final Object emit(UmbrellaState state2, Continuation<? super Unit> continuation) {
                                UmbrellaCard.bind$showToggle$default(booleanRef, view2, view4, context, view, state2.getEnabled(), false, 64, null);
                                view.setEnabled(!state2.getBusy());
                                view2.setAlpha(state2.getBusy() ? 0.5f : 1.0f);
                                textView.setText(state2.getMessage());
                                textView.setVisibility(StringsKt__StringsKt.isBlank(state2.getMessage()) ? 8 : 0);
                                progressBar.setVisibility(state2.getBusy() ? 0 : 8);
                                progressBar.setIndeterminate(state2.getProgress() < 0);
                                if (state2.getProgress() >= 0) {
                                    progressBar.setProgress(state2.getProgress());
                                }
                                view3.setVisibility(state2.getRestartRequired() ? 0 : 8);
                                return Unit.INSTANCE;
                            }
                        }, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw new KotlinNothingValueException();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    LifecycleOwner viewLifecycleOwner = this.$fragment.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    this.label = 1;
                    if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, Lifecycle.State.STARTED, new AnonymousClass1(this.$context, this.$toggle, this.$track, this.$status, this.$progress, this.$restart, this.$checked, this.$thumb, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }
}
