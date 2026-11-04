package com.blackhub.bronline.neizzir.fragments.custom.adapters;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.neizzir.fragments.custom.btx.BpcTextureEntry;
import com.blackhub.bronline.neizzir.fragments.custom.btx.PreviewState;
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
import org.slf4j.Marker;

/* JADX INFO: compiled from: BpcTextureEntryAdapter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bBq\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\b2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0014\u0010\u0019\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/BpcTextureEntryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/BpcTextureEntryAdapter$VH;", "context", "Landroid/content/Context;", "onOpen", "Lkotlin/Function1;", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcTextureEntry;", "", "onExport", "onReplace", "onToggleSelection", "onNeedPreview", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", FirebaseAnalytics.Param.ITEMS, "", "getItemCount", "", "onBindViewHolder", "holder", InAppViewConstants.POSITION, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "replaceData", "newItems", "VH", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class BpcTextureEntryAdapter extends RecyclerView.Adapter<C5301VH> {
    private final Context context;
    private List<BpcTextureEntry> items;
    private final Function1<BpcTextureEntry, Unit> onExport;
    private final Function1<BpcTextureEntry, Unit> onNeedPreview;
    private final Function1<BpcTextureEntry, Unit> onOpen;
    private final Function1<BpcTextureEntry, Unit> onReplace;
    private final Function1<BpcTextureEntry, Unit> onToggleSelection;

    /* JADX WARN: Multi-variable type inference failed */
    public BpcTextureEntryAdapter(Context context, Function1<? super BpcTextureEntry, Unit> onOpen, Function1<? super BpcTextureEntry, Unit> onExport, Function1<? super BpcTextureEntry, Unit> onReplace, Function1<? super BpcTextureEntry, Unit> onToggleSelection, Function1<? super BpcTextureEntry, Unit> onNeedPreview) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onOpen, "onOpen");
        Intrinsics.checkNotNullParameter(onExport, "onExport");
        Intrinsics.checkNotNullParameter(onReplace, "onReplace");
        Intrinsics.checkNotNullParameter(onToggleSelection, "onToggleSelection");
        Intrinsics.checkNotNullParameter(onNeedPreview, "onNeedPreview");
        this.context = context;
        this.onOpen = onOpen;
        this.onExport = onExport;
        this.onReplace = onReplace;
        this.onToggleSelection = onToggleSelection;
        this.onNeedPreview = onNeedPreview;
        this.items = CollectionsKt__CollectionsKt.emptyList();
    }

    public final void replaceData(List<BpcTextureEntry> newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        this.items = newItems;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public C5301VH onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.context).inflate(C3715R.layout.neizzir20_item_btx_browser, parent, false);
        Intrinsics.checkNotNull(view);
        return new C5301VH(this, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(C5301VH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position), position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.adapters.BpcTextureEntryAdapter$VH */
    /* JADX INFO: compiled from: BpcTextureEntryAdapter.kt */
    @Metadata(m4415d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/BpcTextureEntryAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/BpcTextureEntryAdapter;Landroid/view/View;)V", "card", "Lcom/google/android/material/card/MaterialCardView;", "eyeButton", "Landroid/widget/ImageView;", "idText", "Landroid/widget/TextView;", "installButton", "listenButton", "previewCard", "previewImage", "subtitle", "title", "bind", "", "item", "Lcom/blackhub/bronline/neizzir/fragments/custom/btx/BpcTextureEntry;", InAppViewConstants.POSITION, "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public final class C5301VH extends RecyclerView.ViewHolder {
        private final MaterialCardView card;
        private final ImageView eyeButton;
        private final TextView idText;
        private final ImageView installButton;
        private final ImageView listenButton;
        private final MaterialCardView previewCard;
        private final ImageView previewImage;
        private final TextView subtitle;
        final /* synthetic */ BpcTextureEntryAdapter this$0;
        private final TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5301VH(BpcTextureEntryAdapter this$0, View itemView) {
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

        public final void bind(final BpcTextureEntry item, int position) {
            Unit unit;
            Intrinsics.checkNotNullParameter(item, "item");
            this.idText.setText(item.isSelected() ? Marker.ANY_NON_NULL_MARKER : String.valueOf(position + 1));
            this.title.setText(item.getDisplayName());
            this.subtitle.setVisibility(0);
            String strSubstringBeforeLast = StringsKt__StringsKt.substringBeforeLast(item.getArchivePath(), FileSystemKt.UnixPathSeparator, "");
            if (strSubstringBeforeLast.length() == 0) {
                strSubstringBeforeLast = "archive root";
            }
            String parentPath = strSubstringBeforeLast;
            long sizeKb = item.getSizeBytes() / ((long) 1024);
            TextView textView = this.subtitle;
            StringBuilder $this$bind_u24lambda_u241 = new StringBuilder();
            $this$bind_u24lambda_u241.append(parentPath);
            $this$bind_u24lambda_u241.append(" | ");
            $this$bind_u24lambda_u241.append(sizeKb);
            $this$bind_u24lambda_u241.append(" KB");
            PreviewState previewState = item.getPreviewState();
            if (Intrinsics.areEqual(previewState, PreviewState.Loading.INSTANCE)) {
                $this$bind_u24lambda_u241.append(" | preview building");
            } else if (previewState instanceof PreviewState.Ready) {
                $this$bind_u24lambda_u241.append(" | preview ready");
            } else if (previewState instanceof PreviewState.Failed) {
                $this$bind_u24lambda_u241.append(" | preview unavailable");
            }
            String string = $this$bind_u24lambda_u241.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            textView.setText(string);
            this.previewCard.setVisibility(0);
            this.listenButton.setVisibility(0);
            this.eyeButton.setVisibility(8);
            this.installButton.setVisibility(0);
            this.listenButton.setImageResource(C3715R.drawable.neizzir20_ic_download);
            this.installButton.setImageResource(C3715R.drawable.neizzir19_ic_edit);
            this.listenButton.setColorFilter(Color.parseColor("#00E5CC"));
            this.installButton.setColorFilter(Color.parseColor("#00E5CC"));
            this.card.setCardBackgroundColor(Color.parseColor(item.isSelected() ? "#153841" : "#111821"));
            this.card.setStrokeColor(Color.parseColor(item.isSelected() ? "#00E5CC" : "#1C3340"));
            this.card.setStrokeWidth(item.isSelected() ? 2 : 1);
            PreviewState state = item.getPreviewState();
            if (Intrinsics.areEqual(state, PreviewState.Loading.INSTANCE)) {
                this.previewImage.setImageResource(R.color.transparent);
                this.previewCard.setAlpha(0.45f);
                this.this$0.onNeedPreview.invoke(item);
            } else if (state instanceof PreviewState.Ready) {
                Bitmap p0 = BitmapFactory.decodeFile(((PreviewState.Ready) state).getPngFile().getAbsolutePath());
                if (p0 != null) {
                    this.previewImage.setImageBitmap(p0);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    this.previewImage.setImageResource(R.color.transparent);
                }
                this.previewCard.setAlpha(1.0f);
            } else if (state instanceof PreviewState.Failed) {
                this.previewImage.setImageResource(R.color.transparent);
                this.previewCard.setAlpha(0.25f);
            }
            View view = this.itemView;
            final BpcTextureEntryAdapter bpcTextureEntryAdapter = this.this$0;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.BpcTextureEntryAdapter$VH$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BpcTextureEntryAdapter.C5301VH.bind$lambda$2(bpcTextureEntryAdapter, item, view2);
                }
            });
            View view2 = this.itemView;
            final BpcTextureEntryAdapter bpcTextureEntryAdapter2 = this.this$0;
            view2.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.BpcTextureEntryAdapter$VH$$ExternalSyntheticLambda1
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view3) {
                    return BpcTextureEntryAdapter.C5301VH.bind$lambda$3(bpcTextureEntryAdapter2, item, view3);
                }
            });
            MaterialCardView materialCardView = this.previewCard;
            final BpcTextureEntryAdapter bpcTextureEntryAdapter3 = this.this$0;
            materialCardView.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.BpcTextureEntryAdapter$VH$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    BpcTextureEntryAdapter.C5301VH.bind$lambda$4(bpcTextureEntryAdapter3, item, view3);
                }
            });
            ImageView imageView = this.listenButton;
            final BpcTextureEntryAdapter bpcTextureEntryAdapter4 = this.this$0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.BpcTextureEntryAdapter$VH$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    BpcTextureEntryAdapter.C5301VH.bind$lambda$5(bpcTextureEntryAdapter4, item, view3);
                }
            });
            ImageView imageView2 = this.installButton;
            final BpcTextureEntryAdapter bpcTextureEntryAdapter5 = this.this$0;
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.BpcTextureEntryAdapter$VH$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    BpcTextureEntryAdapter.C5301VH.bind$lambda$6(bpcTextureEntryAdapter5, item, view3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$2(BpcTextureEntryAdapter this$0, BpcTextureEntry item, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            this$0.onOpen.invoke(item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean bind$lambda$3(BpcTextureEntryAdapter this$0, BpcTextureEntry item, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            this$0.onToggleSelection.invoke(item);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$4(BpcTextureEntryAdapter this$0, BpcTextureEntry item, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            this$0.onOpen.invoke(item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$5(BpcTextureEntryAdapter this$0, BpcTextureEntry item, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            this$0.onExport.invoke(item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$6(BpcTextureEntryAdapter this$0, BpcTextureEntry item, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            this$0.onReplace.invoke(item);
        }
    }
}
