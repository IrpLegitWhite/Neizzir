package com.blackhub.bronline.neizzir.fragments.custom.util;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import androidx.core.widget.TextViewCompat;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: LauncherDialogHelper.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002ABB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J<\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017J<\u0010\u0019\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017J\"\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0002J8\u0010\"\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00180&H\u0002J.\u0010(\u001a\u00020)2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020!2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J<\u0010-\u001a\u00020'2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002JF\u00102\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00042\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0010042\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010 \u001a\u00020!J^\u00106\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010 \u001a\u00020!2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017Jl\u00109\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040&2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180&J\f\u0010=\u001a\u00020>*\u00020\u000eH\u0002J\u0014\u0010?\u001a\u00020\u001b*\u00020\u000e2\u0006\u0010@\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006C"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/util/LauncherDialogHelper;", "", "()V", "COLOR_ACCENT", "", "COLOR_ACCENT_SOFT", "COLOR_MUTED", "COLOR_PANEL", "COLOR_SUBTITLE", "COLOR_SURFACE", "COLOR_TEXT", "createActionButton", "Lcom/google/android/material/card/MaterialCardView;", "context", "Landroid/content/Context;", "action", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/LauncherDialogHelper$ActionItem;", "createBusyDialog", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/LauncherDialogHelper$ProgressHandle;", "title", "message", "cancelText", "onCancel", "Lkotlin/Function0;", "", "createDeterminateProgressDialog", "total", "", "createDialog", "Landroidx/appcompat/app/AlertDialog;", FirebaseAnalytics.Param.CONTENT, "Landroid/view/View;", "cancelable", "", "createDialogContent", "Landroid/widget/FrameLayout;", "subtitle", "bodyBuilder", "Lkotlin/Function1;", "Landroid/widget/LinearLayout;", "createFooterButton", "Lcom/google/android/material/button/MaterialButton;", "text", "accent", "onClick", "createFooterButtons", "primaryText", "secondaryText", "onPrimary", "onSecondary", "showActionDialog", "actions", "", "closeText", "showConfirmDialog", "confirmText", "onConfirm", "showInputDialog", "initialValue", "hint", "validator", "boldFont", "Landroid/graphics/Typeface;", CalendarKeys.DAYS_GAME_KEY, "value", "ActionItem", "ProgressHandle", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class LauncherDialogHelper {
    private static final String COLOR_ACCENT = "#00E5CC";
    private static final String COLOR_ACCENT_SOFT = "#8CF8EB";
    private static final String COLOR_MUTED = "#668B9AA5";
    private static final String COLOR_PANEL = "#1B2630";
    private static final String COLOR_SUBTITLE = "#8B9AA5";
    private static final String COLOR_SURFACE = "#10161D";
    private static final String COLOR_TEXT = "#FFFFFF";
    public static final LauncherDialogHelper INSTANCE = new LauncherDialogHelper();

    private LauncherDialogHelper() {
    }

    /* JADX INFO: compiled from: LauncherDialogHelper.kt */
    @Metadata(m4415d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001c"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/util/LauncherDialogHelper$ActionItem;", "", "title", "", "description", "accent", "", "onClick", "Lkotlin/Function0;", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "getAccent", "()Z", "getDescription", "()Ljava/lang/String;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final /* data */ class ActionItem {
        private final boolean accent;
        private final String description;
        private final Function0<Unit> onClick;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionItem copy$default(ActionItem actionItem, String str, String str2, boolean z, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionItem.title;
            }
            if ((i & 2) != 0) {
                str2 = actionItem.description;
            }
            if ((i & 4) != 0) {
                z = actionItem.accent;
            }
            if ((i & 8) != 0) {
                function0 = actionItem.onClick;
            }
            return actionItem.copy(str, str2, z, function0);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getAccent() {
            return this.accent;
        }

        public final Function0<Unit> component4() {
            return this.onClick;
        }

        public final ActionItem copy(String title, String description, boolean accent, Function0<Unit> onClick) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            return new ActionItem(title, description, accent, onClick);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionItem)) {
                return false;
            }
            ActionItem actionItem = (ActionItem) other;
            return Intrinsics.areEqual(this.title, actionItem.title) && Intrinsics.areEqual(this.description, actionItem.description) && this.accent == actionItem.accent && Intrinsics.areEqual(this.onClick, actionItem.onClick);
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + (this.description == null ? 0 : this.description.hashCode())) * 31) + Boolean.hashCode(this.accent)) * 31) + this.onClick.hashCode();
        }

        public String toString() {
            return "ActionItem(title=" + this.title + ", description=" + this.description + ", accent=" + this.accent + ", onClick=" + this.onClick + ')';
        }

        public ActionItem(String title, String description, boolean accent, Function0<Unit> onClick) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.title = title;
            this.description = description;
            this.accent = accent;
            this.onClick = onClick;
        }

        public /* synthetic */ ActionItem(String str, String str2, boolean z, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, function0);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final boolean getAccent() {
            return this.accent;
        }

        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }
    }

    /* JADX INFO: compiled from: LauncherDialogHelper.kt */
    @Metadata(m4415d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\r2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0016J\"\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0013J\u0006\u0010\u001e\u001a\u00020\rR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/util/LauncherDialogHelper$ProgressHandle;", "", "dialog", "Landroidx/appcompat/app/AlertDialog;", "statusView", "Landroid/widget/TextView;", "messageView", "progressBar", "Landroid/widget/ProgressBar;", "cancelButton", "Lcom/google/android/material/button/MaterialButton;", "(Landroidx/appcompat/app/AlertDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Lcom/google/android/material/button/MaterialButton;)V", "dismiss", "", "setCancelEnabled", "enabled", "", "setMessage", "message", "", "setOnCancel", "onCancel", "Lkotlin/Function0;", "setProgress", "done", "", "total", Constants.ScionAnalytics.PARAM_LABEL, "setStatus", "status", "show", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final class ProgressHandle {
        private final MaterialButton cancelButton;
        private final AlertDialog dialog;
        private final TextView messageView;
        private final ProgressBar progressBar;
        private final TextView statusView;

        public ProgressHandle(AlertDialog dialog, TextView statusView, TextView messageView, ProgressBar progressBar, MaterialButton cancelButton) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            Intrinsics.checkNotNullParameter(statusView, "statusView");
            Intrinsics.checkNotNullParameter(messageView, "messageView");
            this.dialog = dialog;
            this.statusView = statusView;
            this.messageView = messageView;
            this.progressBar = progressBar;
            this.cancelButton = cancelButton;
        }

        public final void show() {
            this.dialog.show();
        }

        public final void dismiss() {
            this.dialog.dismiss();
        }

        public final void setMessage(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.messageView.setText(message);
        }

        public final void setStatus(String status) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.statusView.setText(status);
        }

        public static /* synthetic */ void setProgress$default(ProgressHandle progressHandle, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                str = null;
            }
            progressHandle.setProgress(i, i2, str);
        }

        public final void setProgress(int done, int total, String label) {
            ProgressBar progressBar = this.progressBar;
            if (progressBar != null) {
                progressBar.setMax(total);
            }
            ProgressBar progressBar2 = this.progressBar;
            if (progressBar2 != null) {
                progressBar2.setProgress(done);
            }
            this.statusView.setText("Обработка " + done + " / " + total);
            if (label != null) {
                this.messageView.setText(label);
            }
        }

        public final void setOnCancel(final Function0<Unit> onCancel) {
            MaterialButton materialButton = this.cancelButton;
            if (materialButton != null) {
                materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper$ProgressHandle$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LauncherDialogHelper.ProgressHandle.setOnCancel$lambda$0(onCancel, view);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setOnCancel$lambda$0(Function0 $onCancel, View it) {
            if ($onCancel != null) {
                $onCancel.invoke();
            }
        }

        public final void setCancelEnabled(boolean enabled) {
            MaterialButton materialButton = this.cancelButton;
            if (materialButton != null) {
                materialButton.setEnabled(enabled);
            }
            MaterialButton materialButton2 = this.cancelButton;
            if (materialButton2 == null) {
                return;
            }
            materialButton2.setAlpha(enabled ? 1.0f : 0.55f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, androidx.appcompat.app.AlertDialog] */
    public final AlertDialog showActionDialog(Context context, String title, String subtitle, List<ActionItem> actions, String closeText, boolean cancelable) {
        AlertDialog alertDialog;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Ref.ObjectRef dialog = new Ref.ObjectRef();
        FrameLayout content = createDialogContent(context, title, subtitle, new LauncherDialogHelper$showActionDialog$content$1(context, actions, closeText, dialog));
        dialog.element = createDialog(context, content, cancelable);
        if (dialog.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) dialog.element;
        }
        alertDialog.show();
        if (dialog.element != 0) {
            return (AlertDialog) dialog.element;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialog");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, androidx.appcompat.app.AlertDialog] */
    public final AlertDialog showConfirmDialog(final Context context, String title, String message, final String confirmText, final String cancelText, boolean cancelable, final Function0<Unit> onConfirm, final Function0<Unit> onCancel) {
        AlertDialog alertDialog;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(confirmText, "confirmText");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        final Ref.ObjectRef dialog = new Ref.ObjectRef();
        FrameLayout content = createDialogContent(context, title, message, new Function1<LinearLayout, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper$showConfirmDialog$content$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LinearLayout linearLayout) {
                invoke2(linearLayout);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LinearLayout body) {
                Intrinsics.checkNotNullParameter(body, "body");
                String str = cancelText;
                if (str == null || StringsKt__StringsKt.isBlank(str)) {
                    LauncherDialogHelper launcherDialogHelper = LauncherDialogHelper.INSTANCE;
                    Context context2 = context;
                    String str2 = confirmText;
                    final Ref.ObjectRef<AlertDialog> objectRef = dialog;
                    final Function0<Unit> function0 = onConfirm;
                    body.addView(launcherDialogHelper.createFooterButton(context2, str2, true, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper$showConfirmDialog$content$1.1
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
                            AlertDialog alertDialog2;
                            if (objectRef.element == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                                alertDialog2 = null;
                            } else {
                                alertDialog2 = objectRef.element;
                            }
                            alertDialog2.dismiss();
                            function0.invoke();
                        }
                    }));
                    return;
                }
                LauncherDialogHelper launcherDialogHelper2 = LauncherDialogHelper.INSTANCE;
                Context context3 = context;
                String str3 = confirmText;
                String str4 = cancelText;
                final Ref.ObjectRef<AlertDialog> objectRef2 = dialog;
                final Function0<Unit> function1 = onConfirm;
                Function0<Unit> function2 = new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper$showConfirmDialog$content$1.2
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
                        AlertDialog alertDialog2;
                        if (objectRef2.element == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dialog");
                            alertDialog2 = null;
                        } else {
                            alertDialog2 = objectRef2.element;
                        }
                        alertDialog2.dismiss();
                        function1.invoke();
                    }
                };
                final Ref.ObjectRef<AlertDialog> objectRef3 = dialog;
                final Function0<Unit> function3 = onCancel;
                body.addView(launcherDialogHelper2.createFooterButtons(context3, str3, str4, function2, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper$showConfirmDialog$content$1.3
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
                        AlertDialog alertDialog2;
                        if (objectRef3.element == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dialog");
                            alertDialog2 = null;
                        } else {
                            alertDialog2 = objectRef3.element;
                        }
                        alertDialog2.dismiss();
                        Function0<Unit> function4 = function3;
                        if (function4 != null) {
                            function4.invoke();
                        }
                    }
                }));
            }
        });
        dialog.element = createDialog(context, content, cancelable);
        if (dialog.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) dialog.element;
        }
        alertDialog.show();
        if (dialog.element != 0) {
            return (AlertDialog) dialog.element;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialog");
        return null;
    }

    public static /* synthetic */ AlertDialog showInputDialog$default(LauncherDialogHelper launcherDialogHelper, Context context, String str, String str2, String str3, String str4, String str5, String str6, Function1 function1, Function1 function2, int i, Object obj) {
        String str7;
        String str8;
        if ((i & 32) == 0) {
            str7 = str5;
        } else {
            str7 = "Сохранить";
        }
        if ((i & 64) == 0) {
            str8 = str6;
        } else {
            str8 = "Отмена";
        }
        return launcherDialogHelper.showInputDialog(context, str, str2, str3, str4, str7, str8, function1, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [T, androidx.appcompat.app.AlertDialog] */
    public final AlertDialog showInputDialog(final Context context, String title, String subtitle, String initialValue, String hint, final String confirmText, final String cancelText, final Function1<? super String, String> validator, final Function1<? super String, Unit> onConfirm) {
        AlertDialog alertDialog;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(confirmText, "confirmText");
        Intrinsics.checkNotNullParameter(cancelText, "cancelText");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        final Ref.ObjectRef dialog = new Ref.ObjectRef();
        final EditText $this$showInputDialog_u24lambda_u240 = new EditText(context);
        $this$showInputDialog_u24lambda_u240.setText(initialValue);
        Editable text = $this$showInputDialog_u24lambda_u240.getText();
        $this$showInputDialog_u24lambda_u240.setSelection(text != null ? text.length() : 0);
        $this$showInputDialog_u24lambda_u240.setHint(hint);
        $this$showInputDialog_u24lambda_u240.setInputType(1);
        $this$showInputDialog_u24lambda_u240.setMaxLines(1);
        $this$showInputDialog_u24lambda_u240.setTextColor(-1);
        $this$showInputDialog_u24lambda_u240.setHintTextColor(Color.parseColor(COLOR_MUTED));
        $this$showInputDialog_u24lambda_u240.setBackgroundColor(0);
        $this$showInputDialog_u24lambda_u240.setPadding(INSTANCE.m1428dp(context, 14), INSTANCE.m1428dp(context, 12), INSTANCE.m1428dp(context, 14), INSTANCE.m1428dp(context, 12));
        $this$showInputDialog_u24lambda_u240.setBackground(context.getDrawable(C3715R.drawable.neizzir20_search_field_bg));
        final TextView $this$showInputDialog_u24lambda_u241 = new TextView(context);
        $this$showInputDialog_u24lambda_u241.setVisibility(8);
        $this$showInputDialog_u24lambda_u241.setTextColor(Color.parseColor(COLOR_ACCENT_SOFT));
        $this$showInputDialog_u24lambda_u241.setTextSize(12.0f);
        FrameLayout content = createDialogContent(context, title, subtitle, new Function1<LinearLayout, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper$showInputDialog$content$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LinearLayout linearLayout) {
                invoke2(linearLayout);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LinearLayout body) {
                Intrinsics.checkNotNullParameter(body, "body");
                body.addView($this$showInputDialog_u24lambda_u240);
                TextView $this$invoke_u24lambda_u241 = $this$showInputDialog_u24lambda_u241;
                Context context2 = context;
                LinearLayout.LayoutParams $this$invoke_u24lambda_u241_u24lambda_u240 = new LinearLayout.LayoutParams(-1, -2);
                $this$invoke_u24lambda_u241_u24lambda_u240.topMargin = LauncherDialogHelper.INSTANCE.m1428dp(context2, 8);
                $this$invoke_u24lambda_u241.setLayoutParams($this$invoke_u24lambda_u241_u24lambda_u240);
                body.addView($this$invoke_u24lambda_u241);
                LauncherDialogHelper launcherDialogHelper = LauncherDialogHelper.INSTANCE;
                Context context3 = context;
                String str = confirmText;
                String str2 = cancelText;
                final EditText editText = $this$showInputDialog_u24lambda_u240;
                final Function1<String, String> function1 = validator;
                final TextView textView = $this$showInputDialog_u24lambda_u241;
                final Ref.ObjectRef<AlertDialog> objectRef = dialog;
                final Function1<String, Unit> function2 = onConfirm;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper$showInputDialog$content$1.2
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
                        Editable text2 = editText.getText();
                        AlertDialog alertDialog2 = null;
                        String string = text2 != null ? text2.toString() : null;
                        if (string == null) {
                            string = "";
                        }
                        String value = StringsKt__StringsKt.trim((CharSequence) string).toString();
                        String error = function1.invoke(value);
                        if (error != null) {
                            textView.setText(error);
                            textView.setVisibility(0);
                            editText.requestFocus();
                        } else {
                            if (objectRef.element == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                            } else {
                                alertDialog2 = objectRef.element;
                            }
                            alertDialog2.dismiss();
                            function2.invoke(value);
                        }
                    }
                };
                final Ref.ObjectRef<AlertDialog> objectRef2 = dialog;
                body.addView(launcherDialogHelper.createFooterButtons(context3, str, str2, function0, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper$showInputDialog$content$1.3
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
                        AlertDialog alertDialog2;
                        if (objectRef2.element == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dialog");
                            alertDialog2 = null;
                        } else {
                            alertDialog2 = objectRef2.element;
                        }
                        alertDialog2.dismiss();
                    }
                }));
            }
        });
        dialog.element = createDialog$default(this, context, content, false, 4, null);
        if (dialog.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) dialog.element;
        }
        alertDialog.show();
        if (dialog.element != 0) {
            return (AlertDialog) dialog.element;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialog");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProgressHandle createBusyDialog$default(LauncherDialogHelper launcherDialogHelper, Context context, String str, String str2, String str3, Function0 function0, int i, Object obj) {
        String str4;
        Function0 function1;
        if ((i & 8) == 0) {
            str4 = str3;
        } else {
            str4 = null;
        }
        if ((i & 16) == 0) {
            function1 = function0;
        } else {
            function1 = null;
        }
        return launcherDialogHelper.createBusyDialog(context, str, str2, str4, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ProgressHandle createBusyDialog(final Context context, String title, String message, final String cancelText, final Function0<Unit> onCancel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        final TextView $this$createBusyDialog_u24lambda_u242 = new TextView(context);
        $this$createBusyDialog_u24lambda_u242.setText(title);
        $this$createBusyDialog_u24lambda_u242.setTextSize(18.0f);
        $this$createBusyDialog_u24lambda_u242.setTextColor(-1);
        $this$createBusyDialog_u24lambda_u242.setTypeface(INSTANCE.boldFont(context));
        $this$createBusyDialog_u24lambda_u242.setGravity(17);
        final TextView $this$createBusyDialog_u24lambda_u243 = new TextView(context);
        $this$createBusyDialog_u24lambda_u243.setText(message);
        $this$createBusyDialog_u24lambda_u243.setTextSize(13.0f);
        $this$createBusyDialog_u24lambda_u243.setTextColor(Color.parseColor(COLOR_SUBTITLE));
        $this$createBusyDialog_u24lambda_u243.setGravity(17);
        final ProgressBar $this$createBusyDialog_u24lambda_u244 = new ProgressBar(context);
        $this$createBusyDialog_u24lambda_u244.setIndeterminate(true);
        $this$createBusyDialog_u24lambda_u244.setIndeterminateTintList(ColorStateList.valueOf(Color.parseColor("#00E5CC")));
        final Ref.ObjectRef cancelButton = new Ref.ObjectRef();
        FrameLayout content = createDialogContent(context, null, null, new Function1<LinearLayout, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper$createBusyDialog$content$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LinearLayout linearLayout) {
                invoke2(linearLayout);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v9, types: [T, com.google.android.material.button.MaterialButton] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LinearLayout body) {
                Intrinsics.checkNotNullParameter(body, "body");
                boolean z = true;
                body.setGravity(1);
                body.addView($this$createBusyDialog_u24lambda_u244, new LinearLayout.LayoutParams(LauncherDialogHelper.INSTANCE.m1428dp(context, 40), LauncherDialogHelper.INSTANCE.m1428dp(context, 40)));
                TextView $this$invoke_u24lambda_u241 = $this$createBusyDialog_u24lambda_u242;
                Context context2 = context;
                LinearLayout.LayoutParams $this$invoke_u24lambda_u241_u24lambda_u240 = new LinearLayout.LayoutParams(-1, -2);
                $this$invoke_u24lambda_u241_u24lambda_u240.topMargin = LauncherDialogHelper.INSTANCE.m1428dp(context2, 18);
                $this$invoke_u24lambda_u241.setLayoutParams($this$invoke_u24lambda_u241_u24lambda_u240);
                body.addView($this$invoke_u24lambda_u241);
                TextView $this$invoke_u24lambda_u243 = $this$createBusyDialog_u24lambda_u243;
                Context context3 = context;
                LinearLayout.LayoutParams $this$invoke_u24lambda_u243_u24lambda_u242 = new LinearLayout.LayoutParams(-1, -2);
                $this$invoke_u24lambda_u243_u24lambda_u242.topMargin = LauncherDialogHelper.INSTANCE.m1428dp(context3, 8);
                $this$invoke_u24lambda_u243.setLayoutParams($this$invoke_u24lambda_u243_u24lambda_u242);
                body.addView($this$invoke_u24lambda_u243);
                String str = cancelText;
                if (str != null && !StringsKt__StringsKt.isBlank(str)) {
                    z = false;
                }
                if (!z) {
                    Ref.ObjectRef<MaterialButton> objectRef = cancelButton;
                    LauncherDialogHelper launcherDialogHelper = LauncherDialogHelper.INSTANCE;
                    Context context4 = context;
                    String str2 = cancelText;
                    final Function0<Unit> function0 = onCancel;
                    objectRef.element = launcherDialogHelper.createFooterButton(context4, str2, false, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper$createBusyDialog$content$1.3
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
                            Function0<Unit> function1 = function0;
                            if (function1 != null) {
                                function1.invoke();
                            }
                        }
                    });
                    body.addView(cancelButton.element);
                }
            }
        });
        AlertDialog dialog = createDialog(context, content, false);
        ProgressHandle it = new ProgressHandle(dialog, $this$createBusyDialog_u24lambda_u242, $this$createBusyDialog_u24lambda_u243, null, (MaterialButton) cancelButton.element);
        it.setOnCancel(onCancel);
        return it;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProgressHandle createDeterminateProgressDialog$default(LauncherDialogHelper launcherDialogHelper, Context context, String str, int i, String str2, Function0 function0, int i2, Object obj) {
        String str3;
        Function0 function1;
        if ((i2 & 8) == 0) {
            str3 = str2;
        } else {
            str3 = null;
        }
        if ((i2 & 16) == 0) {
            function1 = function0;
        } else {
            function1 = null;
        }
        return launcherDialogHelper.createDeterminateProgressDialog(context, str, i, str3, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ProgressHandle createDeterminateProgressDialog(final Context context, String title, int total, final String cancelText, final Function0<Unit> onCancel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        final TextView $this$createDeterminateProgressDialog_u24lambda_u246 = new TextView(context);
        $this$createDeterminateProgressDialog_u24lambda_u246.setText("Обработка 0 / " + total);
        $this$createDeterminateProgressDialog_u24lambda_u246.setTextSize(14.0f);
        $this$createDeterminateProgressDialog_u24lambda_u246.setTextColor(-1);
        $this$createDeterminateProgressDialog_u24lambda_u246.setTypeface(INSTANCE.boldFont(context));
        $this$createDeterminateProgressDialog_u24lambda_u246.setGravity(GravityCompat.START);
        final TextView $this$createDeterminateProgressDialog_u24lambda_u247 = new TextView(context);
        $this$createDeterminateProgressDialog_u24lambda_u247.setText("Подготовка...");
        $this$createDeterminateProgressDialog_u24lambda_u247.setTextSize(13.0f);
        $this$createDeterminateProgressDialog_u24lambda_u247.setTextColor(Color.parseColor(COLOR_SUBTITLE));
        $this$createDeterminateProgressDialog_u24lambda_u247.setMaxLines(2);
        final ProgressBar $this$createDeterminateProgressDialog_u24lambda_u248 = new ProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        $this$createDeterminateProgressDialog_u24lambda_u248.setIndeterminate(false);
        $this$createDeterminateProgressDialog_u24lambda_u248.setMax(total);
        $this$createDeterminateProgressDialog_u24lambda_u248.setProgress(0);
        $this$createDeterminateProgressDialog_u24lambda_u248.setProgressDrawable(context.getDrawable(C3715R.drawable.neizzir20_progress_drawable));
        $this$createDeterminateProgressDialog_u24lambda_u248.setMinimumHeight(INSTANCE.m1428dp(context, 8));
        final Ref.ObjectRef cancelButton = new Ref.ObjectRef();
        FrameLayout content = createDialogContent(context, title, null, new Function1<LinearLayout, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper$createDeterminateProgressDialog$content$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LinearLayout linearLayout) {
                invoke2(linearLayout);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v5, types: [T, com.google.android.material.button.MaterialButton] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LinearLayout body) {
                Intrinsics.checkNotNullParameter(body, "body");
                body.addView($this$createDeterminateProgressDialog_u24lambda_u246);
                ProgressBar progressBar = $this$createDeterminateProgressDialog_u24lambda_u248;
                LinearLayout.LayoutParams $this$invoke_u24lambda_u240 = new LinearLayout.LayoutParams(-1, -2);
                $this$invoke_u24lambda_u240.topMargin = LauncherDialogHelper.INSTANCE.m1428dp(context, 14);
                Unit unit = Unit.INSTANCE;
                body.addView(progressBar, $this$invoke_u24lambda_u240);
                TextView $this$invoke_u24lambda_u242 = $this$createDeterminateProgressDialog_u24lambda_u247;
                Context context2 = context;
                LinearLayout.LayoutParams $this$invoke_u24lambda_u242_u24lambda_u241 = new LinearLayout.LayoutParams(-1, -2);
                $this$invoke_u24lambda_u242_u24lambda_u241.topMargin = LauncherDialogHelper.INSTANCE.m1428dp(context2, 12);
                $this$invoke_u24lambda_u242.setLayoutParams($this$invoke_u24lambda_u242_u24lambda_u241);
                body.addView($this$invoke_u24lambda_u242);
                String str = cancelText;
                if (!(str == null || StringsKt__StringsKt.isBlank(str))) {
                    Ref.ObjectRef<MaterialButton> objectRef = cancelButton;
                    LauncherDialogHelper launcherDialogHelper = LauncherDialogHelper.INSTANCE;
                    Context context3 = context;
                    String str2 = cancelText;
                    final Function0<Unit> function0 = onCancel;
                    objectRef.element = launcherDialogHelper.createFooterButton(context3, str2, false, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper$createDeterminateProgressDialog$content$1.3
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
                            Function0<Unit> function1 = function0;
                            if (function1 != null) {
                                function1.invoke();
                            }
                        }
                    });
                    body.addView(cancelButton.element);
                }
            }
        });
        AlertDialog dialog = createDialog(context, content, false);
        ProgressHandle it = new ProgressHandle(dialog, $this$createDeterminateProgressDialog_u24lambda_u246, $this$createDeterminateProgressDialog_u24lambda_u247, $this$createDeterminateProgressDialog_u24lambda_u248, (MaterialButton) cancelButton.element);
        it.setOnCancel(onCancel);
        return it;
    }

    static /* synthetic */ AlertDialog createDialog$default(LauncherDialogHelper launcherDialogHelper, Context context, View view, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return launcherDialogHelper.createDialog(context, view, z);
    }

    private final AlertDialog createDialog(Context context, View content, boolean cancelable) {
        AlertDialog $this$createDialog_u24lambda_u2410 = new AlertDialog.Builder(context).create();
        Intrinsics.checkNotNullExpressionValue($this$createDialog_u24lambda_u2410, "create(...)");
        $this$createDialog_u24lambda_u2410.setCancelable(cancelable);
        $this$createDialog_u24lambda_u2410.setCanceledOnTouchOutside(cancelable);
        $this$createDialog_u24lambda_u2410.setView(content);
        Window window = $this$createDialog_u24lambda_u2410.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return $this$createDialog_u24lambda_u2410;
    }

    private final FrameLayout createDialogContent(Context context, String title, String subtitle, Function1<? super LinearLayout, Unit> bodyBuilder) {
        MaterialCardView card = new MaterialCardView(context);
        card.setRadius(INSTANCE.m1428dp(context, 22));
        card.setCardElevation(0.0f);
        card.setStrokeWidth(INSTANCE.m1428dp(context, 1));
        card.setStrokeColor(Color.parseColor("#22303D"));
        card.setCardBackgroundColor(Color.parseColor(COLOR_SURFACE));
        FrameLayout.LayoutParams $this$createDialogContent_u24lambda_u2412_u24lambda_u2411 = new FrameLayout.LayoutParams(-1, -2, 17);
        $this$createDialogContent_u24lambda_u2412_u24lambda_u2411.setMarginStart(INSTANCE.m1428dp(context, 20));
        $this$createDialogContent_u24lambda_u2412_u24lambda_u2411.setMarginEnd(INSTANCE.m1428dp(context, 20));
        card.setLayoutParams($this$createDialogContent_u24lambda_u2412_u24lambda_u2411);
        LinearLayout root = new LinearLayout(context);
        root.setOrientation(1);
        root.setPadding(INSTANCE.m1428dp(context, 22), INSTANCE.m1428dp(context, 22), INSTANCE.m1428dp(context, 22), INSTANCE.m1428dp(context, 20));
        String str = title;
        if (!(str == null || str.length() == 0)) {
            TextView $this$createDialogContent_u24lambda_u2414 = new TextView(context);
            $this$createDialogContent_u24lambda_u2414.setText(title);
            $this$createDialogContent_u24lambda_u2414.setTextColor(-1);
            $this$createDialogContent_u24lambda_u2414.setTextSize(19.0f);
            $this$createDialogContent_u24lambda_u2414.setTypeface(INSTANCE.boldFont(context));
            root.addView($this$createDialogContent_u24lambda_u2414);
        }
        String str2 = subtitle;
        if (!(str2 == null || str2.length() == 0)) {
            TextView $this$createDialogContent_u24lambda_u2416 = new TextView(context);
            $this$createDialogContent_u24lambda_u2416.setText(subtitle);
            $this$createDialogContent_u24lambda_u2416.setTextColor(Color.parseColor(COLOR_SUBTITLE));
            $this$createDialogContent_u24lambda_u2416.setTextSize(13.0f);
            LinearLayout.LayoutParams $this$createDialogContent_u24lambda_u2416_u24lambda_u2415 = new LinearLayout.LayoutParams(-1, -2);
            String str3 = title;
            $this$createDialogContent_u24lambda_u2416_u24lambda_u2415.topMargin = INSTANCE.m1428dp(context, str3 == null || str3.length() == 0 ? 0 : 8);
            $this$createDialogContent_u24lambda_u2416_u24lambda_u2415.bottomMargin = INSTANCE.m1428dp(context, 16);
            $this$createDialogContent_u24lambda_u2416.setLayoutParams($this$createDialogContent_u24lambda_u2416_u24lambda_u2415);
            root.addView($this$createDialogContent_u24lambda_u2416);
        }
        LinearLayout body = new LinearLayout(context);
        body.setOrientation(1);
        root.addView(body);
        bodyBuilder.invoke(body);
        card.addView(root);
        FrameLayout $this$createDialogContent_u24lambda_u2418 = new FrameLayout(context);
        $this$createDialogContent_u24lambda_u2418.addView(card);
        return $this$createDialogContent_u24lambda_u2418;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MaterialCardView createActionButton(Context context, ActionItem action) {
        String titleColor = action.getAccent() ? "#081015" : "#FFFFFF";
        String subtitleColor = action.getAccent() ? "#0E3135" : COLOR_SUBTITLE;
        MaterialCardView $this$createActionButton_u24lambda_u2423 = new MaterialCardView(context);
        $this$createActionButton_u24lambda_u2423.setRadius(INSTANCE.m1428dp(context, 16));
        $this$createActionButton_u24lambda_u2423.setCardElevation(0.0f);
        $this$createActionButton_u24lambda_u2423.setStrokeWidth(INSTANCE.m1428dp(context, 1));
        $this$createActionButton_u24lambda_u2423.setStrokeColor(Color.parseColor(action.getAccent() ? "#1FF4DD" : "#24323F"));
        $this$createActionButton_u24lambda_u2423.setCardBackgroundColor(Color.parseColor(action.getAccent() ? "#00E5CC" : COLOR_PANEL));
        $this$createActionButton_u24lambda_u2423.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout $this$createActionButton_u24lambda_u2423_u24lambda_u2422 = new LinearLayout(context);
        $this$createActionButton_u24lambda_u2423_u24lambda_u2422.setOrientation(1);
        $this$createActionButton_u24lambda_u2423_u24lambda_u2422.setPadding(INSTANCE.m1428dp(context, 16), INSTANCE.m1428dp(context, 14), INSTANCE.m1428dp(context, 16), INSTANCE.m1428dp(context, 14));
        TextView $this$createActionButton_u24lambda_u2423_u24lambda_u2422_u24lambda_u2419 = new TextView(context);
        $this$createActionButton_u24lambda_u2423_u24lambda_u2422_u24lambda_u2419.setText(action.getTitle());
        $this$createActionButton_u24lambda_u2423_u24lambda_u2422_u24lambda_u2419.setTextSize(15.0f);
        $this$createActionButton_u24lambda_u2423_u24lambda_u2422_u24lambda_u2419.setTextColor(Color.parseColor(titleColor));
        $this$createActionButton_u24lambda_u2423_u24lambda_u2422_u24lambda_u2419.setTypeface(INSTANCE.boldFont(context));
        $this$createActionButton_u24lambda_u2423_u24lambda_u2422.addView($this$createActionButton_u24lambda_u2423_u24lambda_u2422_u24lambda_u2419);
        String description = action.getDescription();
        if (!(description == null || description.length() == 0)) {
            TextView $this$createActionButton_u24lambda_u2423_u24lambda_u2422_u24lambda_u2421 = new TextView(context);
            $this$createActionButton_u24lambda_u2423_u24lambda_u2422_u24lambda_u2421.setText(action.getDescription());
            $this$createActionButton_u24lambda_u2423_u24lambda_u2422_u24lambda_u2421.setTextSize(12.0f);
            $this$createActionButton_u24lambda_u2423_u24lambda_u2422_u24lambda_u2421.setTextColor(Color.parseColor(subtitleColor));
            LinearLayout.LayoutParams $this$createActionButton_u24lambda_u2423_u24lambda_u2422_u24lambda_u2421_u24lambda_u2420 = new LinearLayout.LayoutParams(-1, -2);
            $this$createActionButton_u24lambda_u2423_u24lambda_u2422_u24lambda_u2421_u24lambda_u2420.topMargin = INSTANCE.m1428dp(context, 4);
            $this$createActionButton_u24lambda_u2423_u24lambda_u2422_u24lambda_u2421.setLayoutParams($this$createActionButton_u24lambda_u2423_u24lambda_u2422_u24lambda_u2421_u24lambda_u2420);
            $this$createActionButton_u24lambda_u2423_u24lambda_u2422.addView($this$createActionButton_u24lambda_u2423_u24lambda_u2422_u24lambda_u2421);
        }
        $this$createActionButton_u24lambda_u2423.addView($this$createActionButton_u24lambda_u2423_u24lambda_u2422);
        return $this$createActionButton_u24lambda_u2423;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearLayout createFooterButtons(Context context, String primaryText, String secondaryText, Function0<Unit> onPrimary, Function0<Unit> onSecondary) {
        LinearLayout $this$createFooterButtons_u24lambda_u2428 = new LinearLayout(context);
        $this$createFooterButtons_u24lambda_u2428.setOrientation(0);
        $this$createFooterButtons_u24lambda_u2428.setGravity(GravityCompat.END);
        LinearLayout.LayoutParams $this$createFooterButtons_u24lambda_u2428_u24lambda_u2424 = new LinearLayout.LayoutParams(-1, -2);
        $this$createFooterButtons_u24lambda_u2428_u24lambda_u2424.topMargin = INSTANCE.m1428dp(context, 18);
        $this$createFooterButtons_u24lambda_u2428.setLayoutParams($this$createFooterButtons_u24lambda_u2428_u24lambda_u2424);
        MaterialButton $this$createFooterButtons_u24lambda_u2428_u24lambda_u2426 = INSTANCE.createFooterButton(context, secondaryText, false, onSecondary);
        LinearLayout.LayoutParams $this$createFooterButtons_u24lambda_u2428_u24lambda_u2426_u24lambda_u2425 = new LinearLayout.LayoutParams(0, INSTANCE.m1428dp(context, 48), 1.0f);
        $this$createFooterButtons_u24lambda_u2428_u24lambda_u2426_u24lambda_u2425.setMarginEnd(INSTANCE.m1428dp(context, 8));
        $this$createFooterButtons_u24lambda_u2428_u24lambda_u2426.setLayoutParams($this$createFooterButtons_u24lambda_u2428_u24lambda_u2426_u24lambda_u2425);
        $this$createFooterButtons_u24lambda_u2428.addView($this$createFooterButtons_u24lambda_u2428_u24lambda_u2426);
        MaterialButton $this$createFooterButtons_u24lambda_u2428_u24lambda_u2427 = INSTANCE.createFooterButton(context, primaryText, true, onPrimary);
        $this$createFooterButtons_u24lambda_u2428_u24lambda_u2427.setLayoutParams(new LinearLayout.LayoutParams(0, INSTANCE.m1428dp(context, 48), 1.0f));
        $this$createFooterButtons_u24lambda_u2428.addView($this$createFooterButtons_u24lambda_u2428_u24lambda_u2427);
        return $this$createFooterButtons_u24lambda_u2428;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MaterialButton createFooterButton(Context context, String text, boolean accent, final Function0<Unit> onClick) {
        MaterialButton $this$createFooterButton_u24lambda_u2431 = new MaterialButton(context);
        $this$createFooterButton_u24lambda_u2431.setText(text);
        $this$createFooterButton_u24lambda_u2431.setAllCaps(false);
        $this$createFooterButton_u24lambda_u2431.setGravity(17);
        $this$createFooterButton_u24lambda_u2431.setMaxLines(1);
        $this$createFooterButton_u24lambda_u2431.setSingleLine(true);
        $this$createFooterButton_u24lambda_u2431.setEllipsize(TextUtils.TruncateAt.END);
        $this$createFooterButton_u24lambda_u2431.setIncludeFontPadding(false);
        $this$createFooterButton_u24lambda_u2431.setTextSize(14.0f);
        $this$createFooterButton_u24lambda_u2431.setMinWidth(0);
        $this$createFooterButton_u24lambda_u2431.setMinimumWidth(0);
        $this$createFooterButton_u24lambda_u2431.setMinHeight(0);
        $this$createFooterButton_u24lambda_u2431.setMinimumHeight(0);
        $this$createFooterButton_u24lambda_u2431.setInsetTop(0);
        $this$createFooterButton_u24lambda_u2431.setInsetBottom(0);
        $this$createFooterButton_u24lambda_u2431.setPadding(INSTANCE.m1428dp(context, 8), 0, INSTANCE.m1428dp(context, 8), 0);
        $this$createFooterButton_u24lambda_u2431.setCornerRadius(INSTANCE.m1428dp(context, 14));
        $this$createFooterButton_u24lambda_u2431.setTypeface(INSTANCE.boldFont(context));
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration($this$createFooterButton_u24lambda_u2431, 10, 14, 1, 2);
        $this$createFooterButton_u24lambda_u2431.setTextColor(Color.parseColor(accent ? "#081015" : "#FFFFFF"));
        $this$createFooterButton_u24lambda_u2431.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(accent ? "#00E5CC" : COLOR_PANEL)));
        $this$createFooterButton_u24lambda_u2431.setStrokeColor(ColorStateList.valueOf(Color.parseColor(accent ? "#1FF4DD" : "#24323F")));
        $this$createFooterButton_u24lambda_u2431.setStrokeWidth(INSTANCE.m1428dp(context, 1));
        LinearLayout.LayoutParams $this$createFooterButton_u24lambda_u2431_u24lambda_u2429 = new LinearLayout.LayoutParams(-1, INSTANCE.m1428dp(context, 46));
        $this$createFooterButton_u24lambda_u2431_u24lambda_u2429.topMargin = INSTANCE.m1428dp(context, 18);
        $this$createFooterButton_u24lambda_u2431.setLayoutParams($this$createFooterButton_u24lambda_u2431_u24lambda_u2429);
        $this$createFooterButton_u24lambda_u2431.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LauncherDialogHelper.createFooterButton$lambda$31$lambda$30(onClick, view);
            }
        });
        return $this$createFooterButton_u24lambda_u2431;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createFooterButton$lambda$31$lambda$30(Function0 onClick, View it) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        onClick.invoke();
    }

    private final Typeface boldFont(Context $this$boldFont) {
        Typeface font = ResourcesCompat.getFont($this$boldFont, C3715R.font.montserrat_extra_bold);
        if (font != null) {
            return font;
        }
        Typeface DEFAULT_BOLD = Typeface.DEFAULT_BOLD;
        Intrinsics.checkNotNullExpressionValue(DEFAULT_BOLD, "DEFAULT_BOLD");
        return DEFAULT_BOLD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dp */
    public final int m1428dp(Context $this$dp, int value) {
        return (int) (value * $this$dp.getResources().getDisplayMetrics().density);
    }
}
