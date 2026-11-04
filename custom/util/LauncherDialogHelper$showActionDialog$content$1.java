package com.blackhub.bronline.neizzir.fragments.custom.util;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.card.MaterialCardView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: LauncherDialogHelper.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m4416d2 = {"<anonymous>", "", "body", "Landroid/widget/LinearLayout;", "invoke"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
final class LauncherDialogHelper$showActionDialog$content$1 extends Lambda implements Function1<LinearLayout, Unit> {
    final /* synthetic */ List<LauncherDialogHelper.ActionItem> $actions;
    final /* synthetic */ String $closeText;
    final /* synthetic */ Context $context;
    final /* synthetic */ Ref.ObjectRef<AlertDialog> $dialog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LauncherDialogHelper$showActionDialog$content$1(Context context, List<LauncherDialogHelper.ActionItem> list, String str, Ref.ObjectRef<AlertDialog> objectRef) {
        super(1);
        this.$context = context;
        this.$actions = list;
        this.$closeText = str;
        this.$dialog = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LinearLayout linearLayout) {
        invoke2(linearLayout);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LinearLayout body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ScrollView scroll = new ScrollView(this.$context);
        scroll.setFillViewport(true);
        scroll.setOverScrollMode(2);
        LinearLayout stack = new LinearLayout(this.$context);
        stack.setOrientation(1);
        Iterable $this$forEachIndexed$iv = this.$actions;
        Context context = this.$context;
        final Ref.ObjectRef<AlertDialog> objectRef = this.$dialog;
        int $i$f$forEachIndexed = 0;
        int index = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int index$iv = index + 1;
            if (index < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            final LauncherDialogHelper.ActionItem action = (LauncherDialogHelper.ActionItem) item$iv;
            MaterialCardView $this$invoke_u24lambda_u244_u24lambda_u243 = LauncherDialogHelper.INSTANCE.createActionButton(context, action);
            if (index > 0) {
                ViewGroup.LayoutParams layoutParams = $this$invoke_u24lambda_u244_u24lambda_u243.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ((LinearLayout.LayoutParams) layoutParams).topMargin = LauncherDialogHelper.INSTANCE.m1428dp(context, 10);
            }
            $this$invoke_u24lambda_u244_u24lambda_u243.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper$showActionDialog$content$1$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LauncherDialogHelper$showActionDialog$content$1.invoke$lambda$4$lambda$3$lambda$2(objectRef, action, view);
                }
            });
            stack.addView($this$invoke_u24lambda_u244_u24lambda_u243);
            index = index$iv;
            $this$forEachIndexed$iv = $this$forEachIndexed$iv;
            $i$f$forEachIndexed = $i$f$forEachIndexed;
        }
        scroll.addView(stack);
        body.addView(scroll);
        String str = this.$closeText;
        if (!(str == null || StringsKt__StringsKt.isBlank(str))) {
            LauncherDialogHelper launcherDialogHelper = LauncherDialogHelper.INSTANCE;
            Context context2 = this.$context;
            String str2 = this.$closeText;
            final Ref.ObjectRef<AlertDialog> objectRef2 = this.$dialog;
            body.addView(launcherDialogHelper.createFooterButton(context2, str2, false, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.LauncherDialogHelper$showActionDialog$content$1.2
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
                    AlertDialog alertDialog;
                    if (objectRef2.element == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        alertDialog = null;
                    } else {
                        alertDialog = objectRef2.element;
                    }
                    alertDialog.dismiss();
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invoke$lambda$4$lambda$3$lambda$2(Ref.ObjectRef dialog, LauncherDialogHelper.ActionItem action, View it) {
        AlertDialog alertDialog;
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(action, "$action");
        if (dialog.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) dialog.element;
        }
        alertDialog.dismiss();
        action.getOnClick().invoke();
    }
}
