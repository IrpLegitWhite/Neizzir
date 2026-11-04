package com.blackhub.bronline.neizzir.umbrella;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.blackhub.bronline.neizzir.activities.main.p022ui.NEIZZIR;
import com.blackhub.bronline.neizzir.activities.main.util.NeizzirAutostart;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UmbrellaRestartActivity.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\b"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaRestartActivity;", "Landroid/app/Activity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class UmbrellaRestartActivity extends Activity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final boolean isRestartProcess(Context context) {
        return INSTANCE.isRestartProcess(context);
    }

    /* JADX INFO: compiled from: UmbrellaRestartActivity.kt */
    @Metadata(m4415d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/umbrella/UmbrellaRestartActivity$Companion;", "", "()V", "isRestartProcess", "", "context", "Landroid/content/Context;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0050  */
        @JvmStatic
        public final boolean isRestartProcess(Context context) {
            String name;
            Object element$iv;
            ActivityManager.RunningAppProcessInfo it;
            Intrinsics.checkNotNullParameter(context, "context");
            if (Build.VERSION.SDK_INT >= 28) {
                name = Application.getProcessName();
            } else {
                Object systemService = context.getSystemService("activity");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                ActivityManager manager = (ActivityManager) systemService;
                Iterable runningAppProcesses = manager.getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterable $this$firstOrNull$iv = runningAppProcesses;
                    Iterator it2 = $this$firstOrNull$iv.iterator();
                    do {
                        if (!it2.hasNext()) {
                            element$iv = null;
                            break;
                        }
                        element$iv = it2.next();
                        it = (ActivityManager.RunningAppProcessInfo) element$iv;
                    } while (!(it.pid == Process.myPid()));
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) element$iv;
                    if (runningAppProcessInfo != null) {
                        name = runningAppProcessInfo.processName;
                    } else {
                        name = null;
                    }
                } else {
                    name = null;
                }
            }
            return Intrinsics.areEqual(name, context.getPackageName() + ":umbrella_restart");
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int previous = getIntent().getIntExtra("previousPid", -1);
        if (previous <= 0 || previous == Process.myPid()) {
            finish();
            return;
        }
        NeizzirAutostart.setAutostartEnabled(this, false);
        Process.killProcess(previous);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.blackhub.bronline.neizzir.umbrella.UmbrellaRestartActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                UmbrellaRestartActivity.onCreate$lambda$0(this.f$0);
            }
        }, 600L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(UmbrellaRestartActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) NEIZZIR.class).addFlags(268468224));
        this$0.finish();
        Process.killProcess(Process.myPid());
    }
}
