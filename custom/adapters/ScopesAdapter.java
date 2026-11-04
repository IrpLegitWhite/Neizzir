package com.blackhub.bronline.neizzir.fragments.custom.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomItem;
import com.blackhub.bronline.neizzir.network.NetworkImages;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.helpshift.proactive.InAppViewConstants;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScopesAdapter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cBI\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u001c\u0010\u0015\u001a\u00020\r2\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\u0014\u0010\u001b\u001a\u00020\r2\n\u0010\u0016\u001a\u00060\u0002R\u00020\u0000H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/ScopesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/ScopesAdapter$VH;", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomItem;", "localFolderFor", "Lkotlin/Function1;", "Ljava/io/File;", "onItemSelected", "Lkotlin/Function2;", "", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "previewSizePx", "", "getItemCount", "getItemId", "", InAppViewConstants.POSITION, "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "VH", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class ScopesAdapter extends RecyclerView.Adapter<C5312VH> {
    private final Context context;
    private final List<RemoteCustomItem> items;
    private final Function1<RemoteCustomItem, File> localFolderFor;
    private final Function2<RemoteCustomItem, File, Unit> onItemSelected;
    private final int previewSizePx;

    /* JADX WARN: Multi-variable type inference failed */
    public ScopesAdapter(Context context, List<RemoteCustomItem> items, Function1<? super RemoteCustomItem, ? extends File> localFolderFor, Function2<? super RemoteCustomItem, ? super File, Unit> onItemSelected) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(localFolderFor, "localFolderFor");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        this.context = context;
        this.items = items;
        this.localFolderFor = localFolderFor;
        this.onItemSelected = onItemSelected;
        this.previewSizePx = (int) ((52 * this.context.getResources().getDisplayMetrics().density) + 0.5f);
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public C5312VH onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View v = LayoutInflater.from(this.context).inflate(C3715R.layout.neizzir20_item_custom_compact, parent, false);
        Intrinsics.checkNotNull(v);
        return new C5312VH(this, v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(C5312VH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(C5312VH holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        holder.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return this.items.get(position).getId().hashCode();
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.adapters.ScopesAdapter$VH */
    /* JADX INFO: compiled from: ScopesAdapter.kt */
    @Metadata(m4415d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/ScopesAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "item", "Landroid/view/View;", "(Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/ScopesAdapter;Landroid/view/View;)V", "idText", "Landroid/widget/TextView;", "installBtn", "Landroid/widget/ImageView;", "preview", "previewCard", "Lcom/google/android/material/card/MaterialCardView;", "title", "bind", "", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomItem;", "clear", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public final class C5312VH extends RecyclerView.ViewHolder {
        private final TextView idText;
        private final ImageView installBtn;
        private final ImageView preview;
        private final MaterialCardView previewCard;
        final /* synthetic */ ScopesAdapter this$0;
        private final TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5312VH(ScopesAdapter this$0, View item) {
            super(item);
            Intrinsics.checkNotNullParameter(item, "item");
            this.this$0 = this$0;
            View viewFindViewById = item.findViewById(C3715R.id.neizzir20_item_id);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.idText = (TextView) viewFindViewById;
            View viewFindViewById2 = item.findViewById(C3715R.id.neizzir20_item_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.title = (TextView) viewFindViewById2;
            View viewFindViewById3 = item.findViewById(C3715R.id.neizzir20_preview_card);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.previewCard = (MaterialCardView) viewFindViewById3;
            View viewFindViewById4 = item.findViewById(C3715R.id.neizzir20_item_preview);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.preview = (ImageView) viewFindViewById4;
            View viewFindViewById5 = item.findViewById(C3715R.id.neizzir20_item_install);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.installBtn = (ImageView) viewFindViewById5;
        }

        public final void bind(final RemoteCustomItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.idText.setText(item.getId());
            this.title.setText("Прицел #" + item.getId());
            this.previewCard.setVisibility(0);
            String previewPath = item.getPreviewPath();
            if (previewPath != null) {
                NetworkImages.INSTANCE.loadCdn(this.preview, previewPath, (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 4) != 0 ? null : Integer.valueOf(this.this$0.previewSizePx), (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 8) != 0 ? null : Integer.valueOf(this.this$0.previewSizePx), (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 16) != 0 ? false : true, (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 32) != 0 ? 17301579 : 0, (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 64) != 0 ? 17301579 : 0, (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 128) != 0 ? null : null, (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 256) != 0 ? null : null);
            } else {
                clear();
            }
            final File folder = (File) this.this$0.localFolderFor.invoke(item);
            ImageView imageView = this.installBtn;
            final ScopesAdapter scopesAdapter = this.this$0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ScopesAdapter$VH$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ScopesAdapter.C5312VH.bind$lambda$0(scopesAdapter, item, folder, view);
                }
            });
            View view = this.itemView;
            final ScopesAdapter scopesAdapter2 = this.this$0;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.ScopesAdapter$VH$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ScopesAdapter.C5312VH.bind$lambda$1(scopesAdapter2, item, folder, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(ScopesAdapter this$0, RemoteCustomItem item, File folder, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(folder, "$folder");
            this$0.onItemSelected.invoke(item, folder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1(ScopesAdapter this$0, RemoteCustomItem item, File folder, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(folder, "$folder");
            this$0.onItemSelected.invoke(item, folder);
        }

        public final void clear() {
            NetworkImages.INSTANCE.clear(this.preview);
        }
    }
}
