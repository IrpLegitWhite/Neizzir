package com.blackhub.bronline.neizzir.fragments.custom.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcArchiveItem;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.helpshift.proactive.InAppViewConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.p043io.files.FileSystemKt;

/* JADX INFO: compiled from: BpcArchiveAdapter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0014\u0010\u0015\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/BpcArchiveAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/BpcArchiveAdapter$VH;", "context", "Landroid/content/Context;", "onOpen", "Lkotlin/Function1;", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcArchiveItem;", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", FirebaseAnalytics.Param.ITEMS, "", "getItemCount", "", "onBindViewHolder", "holder", InAppViewConstants.POSITION, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "replaceData", "newItems", "VH", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class BpcArchiveAdapter extends RecyclerView.Adapter<C5300VH> {
    private final Context context;
    private List<BpcArchiveItem> items;
    private final Function1<BpcArchiveItem, Unit> onOpen;

    /* JADX WARN: Multi-variable type inference failed */
    public BpcArchiveAdapter(Context context, Function1<? super BpcArchiveItem, Unit> onOpen) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onOpen, "onOpen");
        this.context = context;
        this.onOpen = onOpen;
        this.items = CollectionsKt__CollectionsKt.emptyList();
    }

    public final void replaceData(List<BpcArchiveItem> newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        this.items = newItems;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public C5300VH onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.context).inflate(C3715R.layout.neizzir20_item_btx_browser, parent, false);
        Intrinsics.checkNotNull(view);
        return new C5300VH(this, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(C5300VH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position), position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.adapters.BpcArchiveAdapter$VH */
    /* JADX INFO: compiled from: BpcArchiveAdapter.kt */
    @Metadata(m4415d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/BpcArchiveAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/BpcArchiveAdapter;Landroid/view/View;)V", "card", "Lcom/google/android/material/card/MaterialCardView;", "eyeButton", "Landroid/widget/ImageView;", "idText", "Landroid/widget/TextView;", "installButton", "listenButton", "previewCard", "previewImage", "subtitle", "title", "bind", "", "item", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcArchiveItem;", InAppViewConstants.POSITION, "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public final class C5300VH extends RecyclerView.ViewHolder {
        private final MaterialCardView card;
        private final ImageView eyeButton;
        private final TextView idText;
        private final ImageView installButton;
        private final ImageView listenButton;
        private final MaterialCardView previewCard;
        private final ImageView previewImage;
        private final TextView subtitle;
        final /* synthetic */ BpcArchiveAdapter this$0;
        private final TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5300VH(BpcArchiveAdapter this$0, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = this$0;
            View viewFindViewById = itemView.findViewById(C3715R.id.neizzir20_btx_item_card);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.card = (MaterialCardView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(C3715R.id.neizzir20_item_id);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.idText = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(C3715R.id.neizzir20_item_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.title = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(C3715R.id.neizzir20_item_subtitle);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.subtitle = (TextView) viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(C3715R.id.neizzir20_preview_card);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.previewCard = (MaterialCardView) viewFindViewById5;
            View viewFindViewById6 = itemView.findViewById(C3715R.id.neizzir20_item_preview);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.previewImage = (ImageView) viewFindViewById6;
            View viewFindViewById7 = itemView.findViewById(C3715R.id.neizzir20_item_listen);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.listenButton = (ImageView) viewFindViewById7;
            View viewFindViewById8 = itemView.findViewById(C3715R.id.neizzir20_item_eye);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
            this.eyeButton = (ImageView) viewFindViewById8;
            View viewFindViewById9 = itemView.findViewById(C3715R.id.neizzir20_item_install);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
            this.installButton = (ImageView) viewFindViewById9;
        }

        public final void bind(final BpcArchiveItem item, int position) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.idText.setText(String.valueOf(position + 1));
            this.title.setText(item.getFile().getName());
            this.subtitle.setVisibility(0);
            String strSubstringBeforeLast = StringsKt__StringsKt.substringBeforeLast(item.getRelativePath(), FileSystemKt.UnixPathSeparator, "");
            if (strSubstringBeforeLast.length() == 0) {
                strSubstringBeforeLast = "textures";
            }
            String parentPath = strSubstringBeforeLast;
            long sizeKb = item.getSizeBytes() / ((long) 1024);
            String status = item.getSupported() ? "BTX: " + item.getTextureCount() : "unsupported";
            this.subtitle.setText(parentPath + " | " + sizeKb + " KB | " + status);
            this.previewCard.setVisibility(0);
            this.previewCard.setAlpha(item.getSupported() ? 1.0f : 0.45f);
            this.previewImage.setImageResource(C3715R.drawable.neizzir20_ic_empty_folder);
            this.listenButton.setVisibility(8);
            this.eyeButton.setVisibility(8);
            this.installButton.setVisibility(8);
            this.card.setCardBackgroundColor(Color.parseColor(item.getSupported() ? "#111821" : "#171717"));
            this.card.setStrokeColor(Color.parseColor(item.getSupported() ? "#1C3340" : "#333333"));
            this.card.setStrokeWidth(1);
            MaterialCardView materialCardView = this.previewCard;
            final BpcArchiveAdapter bpcArchiveAdapter = this.this$0;
            materialCardView.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.BpcArchiveAdapter$VH$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BpcArchiveAdapter.C5300VH.bind$lambda$1(item, bpcArchiveAdapter, view);
                }
            });
            View view = this.itemView;
            final BpcArchiveAdapter bpcArchiveAdapter2 = this.this$0;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.BpcArchiveAdapter$VH$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BpcArchiveAdapter.C5300VH.bind$lambda$2(item, bpcArchiveAdapter2, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1(BpcArchiveItem item, BpcArchiveAdapter this$0, View it) {
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (item.getSupported()) {
                this$0.onOpen.invoke(item);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$2(BpcArchiveItem item, BpcArchiveAdapter this$0, View it) {
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (item.getSupported()) {
                this$0.onOpen.invoke(item);
            }
        }
    }
}
