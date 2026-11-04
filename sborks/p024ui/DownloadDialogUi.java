package com.blackhub.bronline.neizzir.fragments.sborks.p024ui;

import android.app.Dialog;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Dialogs.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/DownloadDialogUi;", "", "dialog", "Landroid/app/Dialog;", "progressBar", "Landroid/widget/ProgressBar;", "textView", "Landroid/widget/TextView;", "cancelButton", "Lcom/google/android/material/button/MaterialButton;", "(Landroid/app/Dialog;Landroid/widget/ProgressBar;Landroid/widget/TextView;Lcom/google/android/material/button/MaterialButton;)V", "getCancelButton", "()Lcom/google/android/material/button/MaterialButton;", "getDialog", "()Landroid/app/Dialog;", "getProgressBar", "()Landroid/widget/ProgressBar;", "getTextView", "()Landroid/widget/TextView;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class DownloadDialogUi {
    private final MaterialButton cancelButton;
    private final Dialog dialog;
    private final ProgressBar progressBar;
    private final TextView textView;

    public static /* synthetic */ DownloadDialogUi copy$default(DownloadDialogUi downloadDialogUi, Dialog dialog, ProgressBar progressBar, TextView textView, MaterialButton materialButton, int i, Object obj) {
        if ((i & 1) != 0) {
            dialog = downloadDialogUi.dialog;
        }
        if ((i & 2) != 0) {
            progressBar = downloadDialogUi.progressBar;
        }
        if ((i & 4) != 0) {
            textView = downloadDialogUi.textView;
        }
        if ((i & 8) != 0) {
            materialButton = downloadDialogUi.cancelButton;
        }
        return downloadDialogUi.copy(dialog, progressBar, textView, materialButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Dialog getDialog() {
        return this.dialog;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ProgressBar getProgressBar() {
        return this.progressBar;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextView getTextView() {
        return this.textView;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MaterialButton getCancelButton() {
        return this.cancelButton;
    }

    public final DownloadDialogUi copy(Dialog dialog, ProgressBar progressBar, TextView textView, MaterialButton cancelButton) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        return new DownloadDialogUi(dialog, progressBar, textView, cancelButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadDialogUi)) {
            return false;
        }
        DownloadDialogUi downloadDialogUi = (DownloadDialogUi) other;
        return Intrinsics.areEqual(this.dialog, downloadDialogUi.dialog) && Intrinsics.areEqual(this.progressBar, downloadDialogUi.progressBar) && Intrinsics.areEqual(this.textView, downloadDialogUi.textView) && Intrinsics.areEqual(this.cancelButton, downloadDialogUi.cancelButton);
    }

    public int hashCode() {
        return (((((this.dialog.hashCode() * 31) + this.progressBar.hashCode()) * 31) + this.textView.hashCode()) * 31) + this.cancelButton.hashCode();
    }

    public String toString() {
        return "DownloadDialogUi(dialog=" + this.dialog + ", progressBar=" + this.progressBar + ", textView=" + this.textView + ", cancelButton=" + this.cancelButton + ')';
    }

    public DownloadDialogUi(Dialog dialog, ProgressBar progressBar, TextView textView, MaterialButton cancelButton) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        this.dialog = dialog;
        this.progressBar = progressBar;
        this.textView = textView;
        this.cancelButton = cancelButton;
    }

    public final Dialog getDialog() {
        return this.dialog;
    }

    public final ProgressBar getProgressBar() {
        return this.progressBar;
    }

    public final TextView getTextView() {
        return this.textView;
    }

    public final MaterialButton getCancelButton() {
        return this.cancelButton;
    }
}
