package com.blackhub.bronline.neizzir;

import android.app.Activity;
import android.app.Application;
import android.graphics.Insets;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
public final class KolsonSystemKeyboard {
    private static final Handler MAIN = new Handler(Looper.getMainLooper());
    private static WeakReference<Activity> activity = new WeakReference<>(null);
    private static boolean bound;
    private static Editor editor;
    private static long lastSession;
    private static boolean lifecycleRegistered;
    private static boolean resumed;

    private static native void nativeActivity(boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeCancel(long j);

    private static native void nativeGameFocus(boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeReady(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSubmit(long j, byte[] bArr);

    private KolsonSystemKeyboard() {
    }

    private static void onUi(Runnable action) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            MAIN.post(action);
        } else {
            action.run();
        }
    }

    public static void initialize(final Activity host) {
        if (host == null) {
            return;
        }
        onUi(new Runnable() { // from class: com.blackhub.bronline.neizzir.KolsonSystemKeyboard$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                KolsonSystemKeyboard.lambda$initialize$1(host);
            }
        });
    }

    static /* synthetic */ void lambda$initialize$1(final Activity host) {
        if (activity.get() != host) {
            cancelEditor();
            activity = new WeakReference<>(host);
            resumed = false;
            host.getWindow().getDecorView().getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.blackhub.bronline.neizzir.KolsonSystemKeyboard$$ExternalSyntheticLambda4
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean z) {
                    KolsonSystemKeyboard.lambda$initialize$0(host, z);
                }
            });
        }
        if (!lifecycleRegistered) {
            host.getApplication().registerActivityLifecycleCallbacks(new Lifecycle());
            lifecycleRegistered = true;
        }
        reportActivity();
    }

    static /* synthetic */ void lambda$initialize$0(Activity host, boolean focused) {
        if (!bound || activity.get() != host) {
            return;
        }
        nativeGameFocus(focused);
    }

    public static void bindNative() {
        onUi(new Runnable() { // from class: com.blackhub.bronline.neizzir.KolsonSystemKeyboard$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                KolsonSystemKeyboard.lambda$bindNative$2();
            }
        });
    }

    static /* synthetic */ void lambda$bindNative$2() {
        bound = true;
        reportActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean usable() {
        Activity host = activity.get();
        return (!resumed || host == null || host.isFinishing() || host.isDestroyed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reportActivity() {
        if (bound) {
            nativeActivity(usable());
            Activity host = activity.get();
            nativeGameFocus(host != null && host.hasWindowFocus());
        }
    }

    public static void open(final long session) {
        MAIN.post(new Runnable() { // from class: com.blackhub.bronline.neizzir.KolsonSystemKeyboard$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                KolsonSystemKeyboard.lambda$open$3(session);
            }
        });
    }

    static /* synthetic */ void lambda$open$3(long session) {
        if (bound) {
            if ((editor == null || editor.f785id != session) && session > lastSession) {
                lastSession = session;
                cancelEditor();
                if (!usable()) {
                    nativeReady(session, false);
                    return;
                }
                Editor next = new Editor(activity.get(), session);
                editor = next;
                try {
                    next.show();
                } catch (RuntimeException e) {
                    next.fail();
                }
            }
        }
    }

    public static void close(final long session) {
        MAIN.post(new Runnable() { // from class: com.blackhub.bronline.neizzir.KolsonSystemKeyboard$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                KolsonSystemKeyboard.lambda$close$4(session);
            }
        });
    }

    static /* synthetic */ void lambda$close$4(long session) {
        lastSession = Math.max(lastSession, session);
        if (editor == null || editor.f785id != session) {
            return;
        }
        editor.finish(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cancelEditor() {
        if (editor != null) {
            editor.finish(false, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class Lifecycle implements Application.ActivityLifecycleCallbacks {
        private Lifecycle() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity host) {
            if (KolsonSystemKeyboard.activity.get() == host) {
                boolean unused = KolsonSystemKeyboard.resumed = true;
                KolsonSystemKeyboard.reportActivity();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity host) {
            if (KolsonSystemKeyboard.activity.get() == host) {
                boolean unused = KolsonSystemKeyboard.resumed = false;
                KolsonSystemKeyboard.reportActivity();
                KolsonSystemKeyboard.cancelEditor();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity host) {
            if (KolsonSystemKeyboard.activity.get() == host) {
                boolean unused = KolsonSystemKeyboard.resumed = false;
                KolsonSystemKeyboard.reportActivity();
                KolsonSystemKeyboard.cancelEditor();
                KolsonSystemKeyboard.activity.clear();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity host, Bundle state) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity host) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity host) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity host, Bundle state) {
        }
    }

    static final class ChatFilter implements InputFilter {
        ChatFilter() {
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
            int remaining = (191 - Character.codePointCount(dest, 0, dstart)) - Character.codePointCount(dest, dend, dest.length());
            SpannableStringBuilder accepted = new SpannableStringBuilder();
            boolean changed = false;
            int at = start;
            while (at < end) {
                int cp = Character.codePointAt(source, at);
                int next = Character.charCount(cp) + at;
                if (next > end || (cp >= 55296 && cp <= 57343)) {
                    changed = true;
                    at++;
                } else {
                    if (cp >= 32 && cp != 127 && cp != 8232 && cp != 8233 && remaining > 0) {
                        accepted.append(source, at, next);
                        remaining--;
                    } else {
                        changed = true;
                    }
                    at = next;
                }
            }
            if (changed) {
                return accepted;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class Editor {
        boolean changedWindow;
        boolean done;
        final WeakReference<Activity> host;

        /* JADX INFO: renamed from: id */
        final long f785id;
        ChatEditText input;
        PopupWindow popup;
        int previousSoftInputMode;
        boolean ready;
        FrameLayout root;
        Runnable unregisterBack;

        Editor(Activity activity, long session) {
            this.host = new WeakReference<>(activity);
            this.f785id = session;
        }

        /* JADX INFO: renamed from: dp */
        int m1413dp(int value) {
            return Math.round(value * this.input.getResources().getDisplayMetrics().density);
        }

        void show() {
            Activity activity = this.host.get();
            if (activity == null) {
                fail();
                return;
            }
            this.input = new ChatEditText(activity, this);
            this.input.setSingleLine(true);
            this.input.setInputType(16385);
            this.input.setImeOptions(301989892);
            this.input.setFilters(new InputFilter[]{new ChatFilter()});
            this.input.setHint("Сообщение или команда");
            this.input.setTextColor(-1);
            this.input.setHintTextColor(-4473925);
            this.input.setTextSize(18.0f);
            this.input.setSelectAllOnFocus(false);
            this.input.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.blackhub.bronline.neizzir.KolsonSystemKeyboard$Editor$$ExternalSyntheticLambda0
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    return this.f$0.m1416xe20b74e2(textView, i, keyEvent);
                }
            });
            this.root = new FrameLayout(activity);
            LinearLayout row = new LinearLayout(activity);
            int i = 16;
            row.setGravity(16);
            row.setPadding(m1413dp(8), m1413dp(4), m1413dp(8), m1413dp(4));
            row.setBackgroundColor(-182310605);
            row.addView(this.input, new LinearLayout.LayoutParams(0, m1413dp(52), 1.0f));
            Button send = new Button(activity);
            send.setText("Отправить");
            send.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.KolsonSystemKeyboard$Editor$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m1417xf2c141a3(view);
                }
            });
            row.addView(send, new LinearLayout.LayoutParams(-2, m1413dp(52)));
            Button cancel = new Button(activity);
            cancel.setText("×");
            cancel.setContentDescription("Закрыть чат");
            cancel.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.KolsonSystemKeyboard$Editor$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m1418x3770e64(view);
                }
            });
            row.addView(cancel, new LinearLayout.LayoutParams(m1413dp(56), m1413dp(52)));
            this.root.addView(row, new FrameLayout.LayoutParams(-1, -2, 80));
            this.previousSoftInputMode = activity.getWindow().getAttributes().softInputMode;
            activity.getWindow().setSoftInputMode((this.previousSoftInputMode & (-241)) | 48);
            this.changedWindow = true;
            this.popup = new PopupWindow((View) this.root, -1, -1, true);
            this.popup.setBackgroundDrawable(new ColorDrawable(0));
            this.popup.setInputMethodMode(1);
            PopupWindow popupWindow = this.popup;
            if (Build.VERSION.SDK_INT >= 30) {
                i = 48;
            }
            popupWindow.setSoftInputMode(i);
            this.popup.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.blackhub.bronline.neizzir.KolsonSystemKeyboard$Editor$$ExternalSyntheticLambda3
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    this.f$0.m1419x142cdb25();
                }
            });
            if (Build.VERSION.SDK_INT >= 30) {
                this.root.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.blackhub.bronline.neizzir.KolsonSystemKeyboard$Editor$$ExternalSyntheticLambda4
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        return KolsonSystemKeyboard.Editor.lambda$show$4(view, windowInsets);
                    }
                });
            } else {
                this.root.setFitsSystemWindows(true);
            }
            this.popup.showAtLocation(activity.getWindow().getDecorView(), 119, 0, 0);
            this.root.requestApplyInsets();
            if (this.input.requestFocus()) {
                this.input.post(new Runnable() { // from class: com.blackhub.bronline.neizzir.KolsonSystemKeyboard$Editor$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1420x359874a7();
                    }
                });
            } else {
                fail();
            }
        }

        /* JADX INFO: renamed from: lambda$show$0$com-blackhub-bronline-neizzir-KolsonSystemKeyboard$Editor */
        /* synthetic */ boolean m1416xe20b74e2(TextView view, int action, KeyEvent event) {
            if (event != null && event.getKeyCode() == 66) {
                if (event.getAction() == 1 && event.getRepeatCount() == 0) {
                    finish(true, true);
                }
                return true;
            }
            if (action == 4 || action == 6) {
                finish(true, true);
                return true;
            }
            return false;
        }

        /* JADX INFO: renamed from: lambda$show$1$com-blackhub-bronline-neizzir-KolsonSystemKeyboard$Editor */
        /* synthetic */ void m1417xf2c141a3(View view) {
            finish(true, true);
        }

        /* JADX INFO: renamed from: lambda$show$2$com-blackhub-bronline-neizzir-KolsonSystemKeyboard$Editor */
        /* synthetic */ void m1418x3770e64(View view) {
            finish(false, true);
        }

        /* JADX INFO: renamed from: lambda$show$3$com-blackhub-bronline-neizzir-KolsonSystemKeyboard$Editor */
        /* synthetic */ void m1419x142cdb25() {
            finish(false, true);
        }

        static /* synthetic */ WindowInsets lambda$show$4(View view, WindowInsets insets) {
            Insets bars = insets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
            Insets ime = insets.getInsets(WindowInsets.Type.ime());
            view.setPadding(bars.left, bars.top, bars.right, Math.max(bars.bottom, ime.bottom));
            return insets;
        }

        /* JADX INFO: renamed from: lambda$show$5$com-blackhub-bronline-neizzir-KolsonSystemKeyboard$Editor */
        /* synthetic */ void m1420x359874a7() {
            acknowledgeSafely(0);
        }

        void acknowledgeSafely(int attempt) {
            try {
                acknowledge(attempt);
            } catch (RuntimeException e) {
                fail();
            }
        }

        void acknowledge(final int attempt) {
            if (this.done) {
                return;
            }
            if (!KolsonSystemKeyboard.usable() || !this.input.isAttachedToWindow() || !this.popup.isShowing()) {
                fail();
                return;
            }
            if (!this.input.hasWindowFocus()) {
                if (attempt < 15) {
                    this.input.postDelayed(new Runnable() { // from class: com.blackhub.bronline.neizzir.KolsonSystemKeyboard$Editor$$ExternalSyntheticLambda6
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m1414x3aaa0f6d(attempt);
                        }
                    }, 50L);
                    return;
                } else {
                    fail();
                    return;
                }
            }
            this.ready = true;
            if (Build.VERSION.SDK_INT >= 33) {
                this.unregisterBack = BackApi33.register(this.root, new Runnable() { // from class: com.blackhub.bronline.neizzir.KolsonSystemKeyboard$Editor$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1415x4b5fdc2e();
                    }
                });
            }
            KolsonSystemKeyboard.nativeReady(this.f785id, true);
            InputMethodManager ime = (InputMethodManager) this.input.getContext().getSystemService("input_method");
            if (ime != null) {
                ime.showSoftInput(this.input, 1);
            }
        }

        /* JADX INFO: renamed from: lambda$acknowledge$6$com-blackhub-bronline-neizzir-KolsonSystemKeyboard$Editor */
        /* synthetic */ void m1414x3aaa0f6d(int attempt) {
            acknowledgeSafely(attempt + 1);
        }

        /* JADX INFO: renamed from: lambda$acknowledge$7$com-blackhub-bronline-neizzir-KolsonSystemKeyboard$Editor */
        /* synthetic */ void m1415x4b5fdc2e() {
            finish(false, true);
        }

        void fail() {
            if (this.done) {
                return;
            }
            finish(false, false);
            KolsonSystemKeyboard.nativeReady(this.f785id, false);
        }

        void finish(boolean submit, boolean notify) {
            InputMethodManager ime;
            if (this.done) {
                return;
            }
            if (!submit || this.ready) {
                this.done = true;
                byte[] text = submit ? this.input.getText().toString().getBytes(StandardCharsets.UTF_8) : null;
                if (KolsonSystemKeyboard.editor == this) {
                    Editor unused = KolsonSystemKeyboard.editor = null;
                }
                try {
                    if (this.unregisterBack != null) {
                        this.unregisterBack.run();
                    }
                } catch (RuntimeException e) {
                }
                this.unregisterBack = null;
                try {
                    if (this.input != null && (ime = (InputMethodManager) this.input.getContext().getSystemService("input_method")) != null) {
                        ime.hideSoftInputFromWindow(this.input.getWindowToken(), 0);
                    }
                } catch (RuntimeException e2) {
                }
                try {
                    if (this.popup != null) {
                        this.popup.setOnDismissListener(null);
                        this.popup.dismiss();
                    }
                } catch (RuntimeException e3) {
                }
                Activity activity = this.host.get();
                try {
                    if (this.changedWindow && activity != null) {
                        activity.getWindow().setSoftInputMode(this.previousSoftInputMode);
                    }
                } catch (RuntimeException e4) {
                }
                if (notify && KolsonSystemKeyboard.bound) {
                    if (submit) {
                        KolsonSystemKeyboard.nativeSubmit(this.f785id, text);
                    } else {
                        KolsonSystemKeyboard.nativeCancel(this.f785id);
                    }
                }
                this.popup = null;
                this.input = null;
                this.root = null;
            }
        }
    }

    private static final class ChatEditText extends EditText {
        final Editor editor;

        ChatEditText(Activity context, Editor editor) {
            super(context);
            this.editor = editor;
        }

        @Override // android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int keyCode, KeyEvent event) {
            if (keyCode == 4 || keyCode == 111) {
                if (event.getAction() == 1) {
                    this.editor.finish(false, true);
                }
                return true;
            }
            return super.onKeyPreIme(keyCode, event);
        }

        @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int keyCode, KeyEvent event) {
            if (keyCode == 66 || keyCode == 111 || keyCode == 4) {
                return true;
            }
            return super.onKeyDown(keyCode, event);
        }

        @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyUp(int keyCode, KeyEvent event) {
            if (keyCode == 66 || keyCode == 111 || keyCode == 4) {
                this.editor.finish(keyCode == 66, true);
                return true;
            }
            return super.onKeyUp(keyCode, event);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class BackApi33 {
        private BackApi33() {
        }

        static Runnable register(View view, final Runnable cancel) {
            final OnBackInvokedDispatcher dispatcher = view.findOnBackInvokedDispatcher();
            if (dispatcher == null) {
                return null;
            }
            Objects.requireNonNull(cancel);
            final OnBackInvokedCallback callback = new OnBackInvokedCallback() { // from class: com.blackhub.bronline.neizzir.KolsonSystemKeyboard$BackApi33$$ExternalSyntheticLambda0
                public final void onBackInvoked() {
                    cancel.run();
                }
            };
            dispatcher.registerOnBackInvokedCallback(1000000, callback);
            return new Runnable() { // from class: com.blackhub.bronline.neizzir.KolsonSystemKeyboard$BackApi33$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    dispatcher.unregisterOnBackInvokedCallback(callback);
                }
            };
        }
    }
}
