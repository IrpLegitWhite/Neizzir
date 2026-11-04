package com.blackhub.bronline.neizzir.fragments.custom.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.neizzir.network.NetworkImages;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.helpshift.proactive.InAppViewConstants;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GunPuckAdapter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B/\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\n2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0014\u0010\u0015\u001a\u00020\n2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u0000H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/GunPuckAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/GunPuckAdapter$VH;", FirebaseAnalytics.Param.ITEMS, "", "", "logosDir", "Ljava/io/File;", "onDownload", "Lkotlin/Function1;", "", "(Ljava/util/List;Ljava/io/File;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", InAppViewConstants.POSITION, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "VH", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class GunPuckAdapter extends RecyclerView.Adapter<C5305VH> {
    private final List<String> items;
    private final File logosDir;
    private final Function1<String, Unit> onDownload;

    /* JADX WARN: Multi-variable type inference failed */
    public GunPuckAdapter(List<String> items, File logosDir, Function1<? super String, Unit> onDownload) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(logosDir, "logosDir");
        Intrinsics.checkNotNullParameter(onDownload, "onDownload");
        this.items = items;
        this.logosDir = logosDir;
        this.onDownload = onDownload;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public C5305VH onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View v = LayoutInflater.from(parent.getContext()).inflate(C3715R.layout.neizzir20_item_custom_media, parent, false);
        Intrinsics.checkNotNull(v);
        return new C5305VH(this, v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(C5305VH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(C5305VH holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        holder.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.adapters.GunPuckAdapter$VH */
    /* JADX INFO: compiled from: GunPuckAdapter.kt */
    @Metadata(m4415d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/GunPuckAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "item", "Landroid/view/View;", "(Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/GunPuckAdapter;Landroid/view/View;)V", "btn", "Lcom/google/android/material/button/MaterialButton;", "image", "Landroid/widget/ImageView;", "title", "Landroid/widget/TextView;", "bind", "", "packId", "", "clear", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public final class C5305VH extends RecyclerView.ViewHolder {
        private final MaterialButton btn;
        private final ImageView image;
        final /* synthetic */ GunPuckAdapter this$0;
        private final TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5305VH(GunPuckAdapter this$0, View item) {
            super(item);
            Intrinsics.checkNotNullParameter(item, "item");
            this.this$0 = this$0;
            View viewFindViewById = item.findViewById(C3715R.id.neizzir20_media_image);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.image = (ImageView) viewFindViewById;
            View viewFindViewById2 = item.findViewById(C3715R.id.neizzir20_media_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.title = (TextView) viewFindViewById2;
            View viewFindViewById3 = item.findViewById(C3715R.id.neizzir20_media_btn);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.btn = (MaterialButton) viewFindViewById3;
        }

        public final void bind(final String packId) {
            Intrinsics.checkNotNullParameter(packId, "packId");
            this.title.setText("GunPack #" + packId);
            File logoFile = new File(this.this$0.logosDir, packId + ".jpgg");
            if (!logoFile.exists()) {
                NetworkImages.INSTANCE.loadCdn(this.image, "gunpuck/" + packId + "/logo.jpgg", (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 4) != 0 ? null : null, (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 8) != 0 ? null : null, (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 16) != 0 ? false : false, (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 32) != 0 ? 17301579 : 0, (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 64) != 0 ? 17301579 : 0, (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 128) != 0 ? null : null, (WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND & 256) != 0 ? null : null);
            } else {
                NetworkImages.INSTANCE.loadFile(this.image, logoFile, (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : null, (124 & 16) != 0 ? false : false, (124 & 32) != 0 ? null : null, (124 & 64) != 0 ? null : null);
            }
            this.btn.setText("Скачать");
            MaterialButton materialButton = this.btn;
            final GunPuckAdapter gunPuckAdapter = this.this$0;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.GunPuckAdapter$VH$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GunPuckAdapter.C5305VH.bind$lambda$0(gunPuckAdapter, packId, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(GunPuckAdapter this$0, String packId, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(packId, "$packId");
            this$0.onDownload.invoke(packId);
        }

        public final void clear() {
            NetworkImages.INSTANCE.clear(this.image);
        }
    }
}
