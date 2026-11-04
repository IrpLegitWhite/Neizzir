package com.blackhub.bronline.neizzir.fragments.custom.adapters;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.helpshift.proactive.InAppViewConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FoliageAdapter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003\u001c\u001d\u001eB1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u001c\u0010\u0013\u001a\u00020\t2\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006H\u0016J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/FoliageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/FoliageAdapter$VH;", "context", "Landroid/content/Context;", "currentColor", "", "onInstallTransparent", "Lkotlin/Function0;", "", "onInstallColored", "(Landroid/content/Context;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", FirebaseAnalytics.Param.ITEMS, "", "Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/FoliageAdapter$Item;", "selectedColor", "dpToPx", CalendarKeys.DAYS_GAME_KEY, "getItemCount", "onBindViewHolder", "holder", InAppViewConstants.POSITION, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateColor", "color", "Companion", "Item", "VH", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class FoliageAdapter extends RecyclerView.Adapter<C5303VH> {
    private static final int COLORED_POSITION = 1;
    private static final Companion Companion = new Companion(null);
    private static final int TRANSPARENT_POSITION = 0;
    private final Context context;
    private final List<Item> items;
    private final Function0<Unit> onInstallColored;
    private final Function0<Unit> onInstallTransparent;
    private int selectedColor;

    public FoliageAdapter(Context context, int currentColor, Function0<Unit> onInstallTransparent, Function0<Unit> onInstallColored) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onInstallTransparent, "onInstallTransparent");
        Intrinsics.checkNotNullParameter(onInstallColored, "onInstallColored");
        this.context = context;
        this.onInstallTransparent = onInstallTransparent;
        this.onInstallColored = onInstallColored;
        this.items = CollectionsKt__CollectionsKt.listOf((Object[]) new Item[]{new Item("1", "Прозрачная листва", false), new Item("2", "Цветная листва", true)});
        this.selectedColor = (-16777216) | currentColor;
    }

    /* JADX INFO: compiled from: FoliageAdapter.kt */
    @Metadata(m4415d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/FoliageAdapter$Item;", "", "id", "", "title", "showsColor", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getShowsColor", "()Z", "getTitle", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final /* data */ class Item {
        private final String id;
        private final boolean showsColor;
        private final String title;

        public static /* synthetic */ Item copy$default(Item item, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item.id;
            }
            if ((i & 2) != 0) {
                str2 = item.title;
            }
            if ((i & 4) != 0) {
                z = item.showsColor;
            }
            return item.copy(str, str2, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getShowsColor() {
            return this.showsColor;
        }

        public final Item copy(String id, String title, boolean showsColor) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            return new Item(id, title, showsColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.id, item.id) && Intrinsics.areEqual(this.title, item.title) && this.showsColor == item.showsColor;
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.showsColor);
        }

        public String toString() {
            return "Item(id=" + this.id + ", title=" + this.title + ", showsColor=" + this.showsColor + ')';
        }

        public Item(String id, String title, boolean showsColor) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = id;
            this.title = title;
            this.showsColor = showsColor;
        }

        public final String getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final boolean getShowsColor() {
            return this.showsColor;
        }
    }

    public final void updateColor(int color) {
        this.selectedColor = (-16777216) | color;
        notifyItemChanged(1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public C5303VH onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.context).inflate(C3715R.layout.neizzir20_item_custom_compact, parent, false);
        Intrinsics.checkNotNull(view);
        return new C5303VH(this, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(C5303VH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position), position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.adapters.FoliageAdapter$VH */
    /* JADX INFO: compiled from: FoliageAdapter.kt */
    @Metadata(m4415d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/FoliageAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/FoliageAdapter;Landroid/view/View;)V", "eyeBtn", "Landroid/widget/ImageView;", "idText", "Landroid/widget/TextView;", "installBtn", "preview", "previewCard", "Lcom/google/android/material/card/MaterialCardView;", "title", "bind", "", "item", "Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/FoliageAdapter$Item;", InAppViewConstants.POSITION, "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public final class C5303VH extends RecyclerView.ViewHolder {
        private final ImageView eyeBtn;
        private final TextView idText;
        private final ImageView installBtn;
        private final ImageView preview;
        private final MaterialCardView previewCard;
        final /* synthetic */ FoliageAdapter this$0;
        private final TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5303VH(FoliageAdapter this$0, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = this$0;
            View viewFindViewById = itemView.findViewById(C3715R.id.neizzir20_item_id);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.idText = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(C3715R.id.neizzir20_item_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.title = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(C3715R.id.neizzir20_preview_card);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.previewCard = (MaterialCardView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(C3715R.id.neizzir20_item_preview);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.preview = (ImageView) viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(C3715R.id.neizzir20_item_eye);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.eyeBtn = (ImageView) viewFindViewById5;
            View viewFindViewById6 = itemView.findViewById(C3715R.id.neizzir20_item_install);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.installBtn = (ImageView) viewFindViewById6;
        }

        public final void bind(Item item, int position) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.idText.setText(item.getId());
            this.title.setText(item.getTitle());
            this.eyeBtn.setVisibility(8);
            Function0 function0 = null;
            if (item.getShowsColor()) {
                this.previewCard.setVisibility(0);
                ImageView imageView = this.preview;
                GradientDrawable $this$bind_u24lambda_u240 = new GradientDrawable();
                FoliageAdapter foliageAdapter = this.this$0;
                $this$bind_u24lambda_u240.setShape(0);
                $this$bind_u24lambda_u240.setCornerRadius(8.0f);
                $this$bind_u24lambda_u240.setColor(foliageAdapter.selectedColor);
                $this$bind_u24lambda_u240.setStroke(foliageAdapter.dpToPx(1), Color.parseColor("#2D2D35"));
                imageView.setImageDrawable($this$bind_u24lambda_u240);
            } else {
                this.previewCard.setVisibility(8);
                this.preview.setImageDrawable(null);
            }
            switch (position) {
                case 0:
                    function0 = this.this$0.onInstallTransparent;
                    break;
                case 1:
                    function0 = this.this$0.onInstallColored;
                    break;
            }
            final Function0 action = function0;
            this.installBtn.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.FoliageAdapter$VH$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FoliageAdapter.C5303VH.bind$lambda$1(action, view);
                }
            });
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.FoliageAdapter$VH$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FoliageAdapter.C5303VH.bind$lambda$2(action, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1(Function0 $action, View it) {
            if ($action != null) {
                $action.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$2(Function0 $action, View it) {
            if ($action != null) {
                $action.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dpToPx(int dp) {
        return (int) (dp * this.context.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: compiled from: FoliageAdapter.kt */
    @Metadata(m4415d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/FoliageAdapter$Companion;", "", "()V", "COLORED_POSITION", "", "TRANSPARENT_POSITION", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
