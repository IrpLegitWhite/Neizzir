package com.blackhub.bronline.neizzir.fragments.custom.adapters;

import android.graphics.Color;
import android.view.View;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.neizzir.activities.main.p022ui.MenuFragment;
import com.blackhub.bronline.neizzir.fragments.custom.manager.ModulesManager;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ModulesAdapter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m4416d2 = {"<anonymous>", "", "s", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/ModulesManager$ModuleStatus;", "invoke"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
final class ModulesAdapter$VH$setupButton$1 extends Lambda implements Function1<ModulesManager.ModuleStatus, Unit> {
    final /* synthetic */ String $moduleId;
    final /* synthetic */ ModulesAdapter.C5309VH this$0;
    final /* synthetic */ ModulesAdapter this$1;

    /* JADX INFO: compiled from: ModulesAdapter.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModulesManager.ModuleStatus.values().length];
            try {
                iArr[ModulesManager.ModuleStatus.NOT_INSTALLED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[ModulesManager.ModuleStatus.INSTALLED_SAME.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[ModulesManager.ModuleStatus.INSTALLED_OUTDATED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[ModulesManager.ModuleStatus.INCOMPATIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModulesAdapter$VH$setupButton$1(ModulesAdapter.C5309VH c5309vh, String str, ModulesAdapter modulesAdapter) {
        super(1);
        this.this$0 = c5309vh;
        this.$moduleId = str;
        this.this$1 = modulesAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ModulesManager.ModuleStatus moduleStatus) {
        invoke2(moduleStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ModulesManager.ModuleStatus s) {
        Intrinsics.checkNotNullParameter(s, "s");
        if (this.this$0.isCurrent(this.$moduleId)) {
            switch (WhenMappings.$EnumSwitchMapping$0[s.ordinal()]) {
                case 1:
                    this.this$0.btn.setText("Скачать");
                    this.this$0.btn.setEnabled(true);
                    this.this$0.btn.setBackgroundColor(Color.parseColor("#00E5CC"));
                    this.this$0.btn.setTextColor(Color.parseColor("#0A0A0F"));
                    View $this$isVisible$iv = this.this$0.status;
                    $this$isVisible$iv.setVisibility(8);
                    MaterialButton materialButton = this.this$0.btn;
                    final ModulesAdapter.C5309VH c5309vh = this.this$0;
                    final ModulesAdapter modulesAdapter = this.this$1;
                    final String str = this.$moduleId;
                    materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ModulesAdapter$VH$setupButton$1$$ExternalSyntheticLambda0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ModulesAdapter$VH$setupButton$1.invoke$lambda$0(c5309vh, modulesAdapter, str, view);
                        }
                    });
                    break;
                case 2:
                    this.this$0.btn.setText("Удалить");
                    this.this$0.btn.setEnabled(true);
                    this.this$0.btn.setBackgroundColor(Color.parseColor("#EF4444"));
                    this.this$0.btn.setTextColor(-1);
                    View $this$isVisible$iv2 = this.this$0.status;
                    $this$isVisible$iv2.setVisibility(0);
                    this.this$0.status.setText("Установлен");
                    this.this$0.status.setTextColor(Color.parseColor(MenuFragment.COLOR_GREEN));
                    this.this$0.status.setBackgroundResource(C3715R.drawable.neizzir20_status_badge_bg);
                    MaterialButton materialButton2 = this.this$0.btn;
                    final ModulesAdapter.C5309VH c5309vh2 = this.this$0;
                    final ModulesAdapter modulesAdapter2 = this.this$1;
                    final String str2 = this.$moduleId;
                    materialButton2.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ModulesAdapter$VH$setupButton$1$$ExternalSyntheticLambda1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ModulesAdapter$VH$setupButton$1.invoke$lambda$1(c5309vh2, modulesAdapter2, str2, view);
                        }
                    });
                    break;
                case 3:
                    this.this$0.btn.setText("Обновить");
                    this.this$0.btn.setEnabled(true);
                    this.this$0.btn.setBackgroundColor(Color.parseColor(MenuFragment.COLOR_AMBER));
                    this.this$0.btn.setTextColor(Color.parseColor("#0A0A0F"));
                    View $this$isVisible$iv3 = this.this$0.status;
                    $this$isVisible$iv3.setVisibility(0);
                    this.this$0.status.setText("Устарел");
                    this.this$0.status.setTextColor(Color.parseColor(MenuFragment.COLOR_AMBER));
                    this.this$0.status.setBackgroundResource(C3715R.drawable.neizzir20_status_badge_orange_bg);
                    MaterialButton materialButton3 = this.this$0.btn;
                    final ModulesAdapter.C5309VH c5309vh3 = this.this$0;
                    final ModulesAdapter modulesAdapter3 = this.this$1;
                    final String str3 = this.$moduleId;
                    materialButton3.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ModulesAdapter$VH$setupButton$1$$ExternalSyntheticLambda2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ModulesAdapter$VH$setupButton$1.invoke$lambda$2(c5309vh3, modulesAdapter3, str3, view);
                        }
                    });
                    break;
                case 4:
                    this.this$0.btn.setText("Недоступно");
                    this.this$0.btn.setEnabled(false);
                    this.this$0.btn.setBackgroundColor(Color.parseColor("#333333"));
                    this.this$0.btn.setTextColor(Color.parseColor("#666666"));
                    View $this$isVisible$iv4 = this.this$0.status;
                    $this$isVisible$iv4.setVisibility(0);
                    this.this$0.status.setText("Несовместимо");
                    this.this$0.status.setTextColor(Color.parseColor("#EF4444"));
                    this.this$0.status.setBackgroundResource(C3715R.drawable.neizzir20_status_badge_red_bg);
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(ModulesAdapter.C5309VH this$0, final ModulesAdapter this$1, String moduleId, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this$1, "this$1");
        Intrinsics.checkNotNullParameter(moduleId, "$moduleId");
        final int pos = this$0.getBindingAdapterPosition();
        if (pos == -1) {
            return;
        }
        this$1.modulesManager.downloadModule(moduleId, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ModulesAdapter$VH$setupButton$1$1$1
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
                this$1.notifyItemChanged(pos);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(ModulesAdapter.C5309VH this$0, final ModulesAdapter this$1, String moduleId, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this$1, "this$1");
        Intrinsics.checkNotNullParameter(moduleId, "$moduleId");
        final int pos = this$0.getBindingAdapterPosition();
        if (pos == -1) {
            return;
        }
        this$1.modulesManager.deleteModule(moduleId, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ModulesAdapter$VH$setupButton$1$2$1
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
                this$1.notifyItemChanged(pos);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(ModulesAdapter.C5309VH this$0, final ModulesAdapter this$1, String moduleId, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this$1, "this$1");
        Intrinsics.checkNotNullParameter(moduleId, "$moduleId");
        final int pos = this$0.getBindingAdapterPosition();
        if (pos == -1) {
            return;
        }
        this$1.modulesManager.downloadModule(moduleId, new Function0<Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ModulesAdapter$VH$setupButton$1$3$1
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
                this$1.notifyItemChanged(pos);
            }
        });
    }
}
