package com.blackhub.bronline.neizzir.service.time;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FloatingFpsService.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0003J\b\u0010 \u001a\u00020\u0018H\u0002J\b\u0010!\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020\u0018H\u0002J\b\u0010#\u001a\u00020\u0018H\u0002J\b\u0010$\u001a\u00020\u0018H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000¨\u0006%"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/service/time/FloatingFpsService;", "Landroid/app/Service;", "()V", "floatingView", "Landroid/view/View;", "handler", "Landroid/os/Handler;", "initialTouchX", "", "initialTouchY", "initialX", "", "initialY", "layoutParams", "Landroid/view/WindowManager$LayoutParams;", "lifecycleObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "preferences", "Landroid/content/SharedPreferences;", "updateRunnable", "Ljava/lang/Runnable;", "windowManager", "Landroid/view/WindowManager;", "hideTimer", "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "setupDraggable", "setupFloatingView", "showTimer", "startUpdates", "stopUpdates", "updateDisplay", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class FloatingFpsService extends Service {
    private View floatingView;
    private float initialTouchX;
    private float initialTouchY;
    private int initialX;
    private int initialY;
    private WindowManager.LayoutParams layoutParams;
    private SharedPreferences preferences;
    private Runnable updateRunnable;
    private WindowManager windowManager;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final LifecycleEventObserver lifecycleObserver = new LifecycleEventObserver() { // from class: com.blackhub.bronline.neizzir.service.time.FloatingFpsService$$ExternalSyntheticLambda0
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            FloatingFpsService.lifecycleObserver$lambda$0(this.f$0, lifecycleOwner, event);
        }
    };

    /* JADX INFO: compiled from: FloatingFpsService.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$0(FloatingFpsService this$0, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        switch (WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
                this$0.showTimer();
                break;
            case 2:
                this$0.hideTimer();
                break;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (!Settings.canDrawOverlays(this)) {
            stopSelf();
            return;
        }
        SharedPreferences sharedPreferences = getSharedPreferences("FloatingFpsPrefs", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.preferences = sharedPreferences;
        Object systemService = getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        setupFloatingView();
        View view = this.floatingView;
        if (view != null) {
            view.setVisibility(8);
        }
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(this.lifecycleObserver);
    }

    private final void showTimer() {
        View view = this.floatingView;
        if (view != null) {
            view.setVisibility(0);
        }
        startUpdates();
    }

    private final void hideTimer() {
        View view = this.floatingView;
        if (view != null) {
            view.setVisibility(8);
        }
        stopUpdates();
    }

    private final void startUpdates() {
        stopUpdates();
        this.updateRunnable = new Runnable() { // from class: com.blackhub.bronline.neizzir.service.time.FloatingFpsService.startUpdates.1
            @Override // java.lang.Runnable
            public void run() {
                FloatingFpsService.this.updateDisplay();
                FloatingFpsService.this.handler.postDelayed(this, 1000L);
            }
        };
        Handler handler = this.handler;
        Runnable runnable = this.updateRunnable;
        Intrinsics.checkNotNull(runnable);
        handler.post(runnable);
    }

    private final void stopUpdates() {
        Runnable it = this.updateRunnable;
        if (it != null) {
            this.handler.removeCallbacks(it);
        }
        this.updateRunnable = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDisplay() {
        View view = this.floatingView;
        boolean z = false;
        if (view != null && view.getVisibility() == 0) {
            z = true;
        }
        if (z) {
            SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
            View view2 = this.floatingView;
            TextView textView = view2 instanceof TextView ? (TextView) view2 : null;
            if (textView == null) {
                return;
            }
            textView.setText(fmt.format(Long.valueOf(System.currentTimeMillis())));
        }
    }

    private final void setupFloatingView() {
        int layoutFlag;
        if (this.floatingView != null) {
            return;
        }
        SharedPreferences sharedPreferences = this.preferences;
        WindowManager windowManager = null;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferences");
            sharedPreferences = null;
        }
        int savedX = sharedPreferences.getInt("position_x", 50);
        SharedPreferences sharedPreferences2 = this.preferences;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferences");
            sharedPreferences2 = null;
        }
        int savedY = sharedPreferences2.getInt("position_y", 100);
        if (Build.VERSION.SDK_INT >= 26) {
            layoutFlag = 2038;
        } else {
            layoutFlag = 2002;
        }
        WindowManager.LayoutParams $this$setupFloatingView_u24lambda_u242 = new WindowManager.LayoutParams(-2, -2, layoutFlag, 8, -3);
        $this$setupFloatingView_u24lambda_u242.x = savedX;
        $this$setupFloatingView_u24lambda_u242.y = savedY;
        this.layoutParams = $this$setupFloatingView_u24lambda_u242;
        TextView $this$setupFloatingView_u24lambda_u243 = new TextView(this);
        $this$setupFloatingView_u24lambda_u243.setTextColor(-1);
        $this$setupFloatingView_u24lambda_u243.setTextSize(14.0f);
        $this$setupFloatingView_u24lambda_u243.setText("00:00:00");
        $this$setupFloatingView_u24lambda_u243.setBackgroundColor(Integer.MIN_VALUE);
        $this$setupFloatingView_u24lambda_u243.setPadding(8, 8, 8, 8);
        this.floatingView = $this$setupFloatingView_u24lambda_u243;
        try {
            WindowManager windowManager2 = this.windowManager;
            if (windowManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            } else {
                windowManager = windowManager2;
            }
            windowManager.addView(this.floatingView, this.layoutParams);
            setupDraggable();
        } catch (Exception e) {
            e.printStackTrace();
            stopSelf();
        }
    }

    private final void setupDraggable() {
        View view;
        final WindowManager.LayoutParams params = this.layoutParams;
        if (params != null && (view = this.floatingView) != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.neizzir.service.time.FloatingFpsService$$ExternalSyntheticLambda1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return FloatingFpsService.setupDraggable$lambda$5(this.f$0, params, view2, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupDraggable$lambda$5(FloatingFpsService this$0, WindowManager.LayoutParams params, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(params, "$params");
        SharedPreferences sharedPreferences = null;
        WindowManager windowManager = null;
        switch (motionEvent.getAction()) {
            case 0:
                this$0.initialX = params.x;
                this$0.initialY = params.y;
                this$0.initialTouchX = motionEvent.getRawX();
                this$0.initialTouchY = motionEvent.getRawY();
                return true;
            case 1:
                SharedPreferences sharedPreferences2 = this$0.preferences;
                if (sharedPreferences2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preferences");
                } else {
                    sharedPreferences = sharedPreferences2;
                }
                sharedPreferences.edit().putInt("position_x", params.x).putInt("position_y", params.y).apply();
                return true;
            case 2:
                params.x = this$0.initialX + ((int) (motionEvent.getRawX() - this$0.initialTouchX));
                params.y = this$0.initialY + ((int) (motionEvent.getRawY() - this$0.initialTouchY));
                View view2 = this$0.floatingView;
                if (view2 == null) {
                    return true;
                }
                WindowManager windowManager2 = this$0.windowManager;
                if (windowManager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("windowManager");
                } else {
                    windowManager = windowManager2;
                }
                windowManager.updateViewLayout(view2, params);
                return true;
            default:
                return false;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        stopUpdates();
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().removeObserver(this.lifecycleObserver);
        View it = this.floatingView;
        if (it != null) {
            try {
                WindowManager windowManager = this.windowManager;
                if (windowManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("windowManager");
                    windowManager = null;
                }
                windowManager.removeView(it);
            } catch (Exception e) {
            }
            this.floatingView = null;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }
}
