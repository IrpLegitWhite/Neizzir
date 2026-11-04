package com.blackhub.bronline.neizzir.fragments.custom.sounds;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomFile;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.helpshift.HelpshiftEvent;
import com.helpshift.proactive.InAppViewConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: SoundCatalogAdapter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u000e\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCatalogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCatalogAdapter$Holder;", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomItem;", "localFolderFor", "Lkotlin/Function1;", "Ljava/io/File;", "preview", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundPreviewPlayer;", "titlePrefix", "", "onItemSelected", "Lkotlin/Function2;", "", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundPreviewPlayer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "listenVisible", "", "getItemCount", "", "onBindViewHolder", "holder", InAppViewConstants.POSITION, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "setListenButtonVisibility", HelpshiftEvent.DATA_SDK_VISIBLE, "Holder", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public class SoundCatalogAdapter extends RecyclerView.Adapter<Holder> {
    private final Context context;
    private final List<RemoteCustomItem> items;
    private boolean listenVisible;
    private final Function1<RemoteCustomItem, File> localFolderFor;
    private final Function2<RemoteCustomItem, File, Unit> onItemSelected;
    private final SoundPreviewPlayer preview;
    private final String titlePrefix;

    /* JADX WARN: Multi-variable type inference failed */
    public SoundCatalogAdapter(Context context, List<RemoteCustomItem> items, Function1<? super RemoteCustomItem, ? extends File> localFolderFor, SoundPreviewPlayer preview, String titlePrefix, Function2<? super RemoteCustomItem, ? super File, Unit> onItemSelected) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(localFolderFor, "localFolderFor");
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(titlePrefix, "titlePrefix");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        this.context = context;
        this.items = items;
        this.localFolderFor = localFolderFor;
        this.preview = preview;
        this.titlePrefix = titlePrefix;
        this.onItemSelected = onItemSelected;
        this.listenVisible = true;
    }

    public final void setListenButtonVisibility(boolean visible) {
        this.preview.stop();
        this.listenVisible = visible;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(C3715R.layout.neizzir_item_sound_compact, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new Holder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder.getKey() != null && Intrinsics.areEqual(this.preview.getActiveKey(), holder.getKey())) {
            this.preview.stop();
        }
        final RemoteCustomItem item = this.items.get(position);
        final String key = "remote:" + item.getRemotePath() + AbstractJsonLexerKt.COLON + item.getId();
        holder.setKey(key);
        ((TextView) holder.itemView.findViewById(C3715R.id.neizzir20_item_id)).setText(item.getId());
        ((TextView) holder.itemView.findViewById(C3715R.id.neizzir20_item_title)).setText(this.titlePrefix + " #" + item.getId());
        holder.getListen().setVisibility(this.listenVisible ? 0 : 8);
        holder.update(false);
        holder.getListen().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCatalogAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SoundCatalogAdapter.onBindViewHolder$lambda$1(this.f$0, key, item, holder, view);
            }
        });
        ImageView $this$onBindViewHolder_u24lambda_u243 = (ImageView) holder.itemView.findViewById(C3715R.id.neizzir20_item_install);
        $this$onBindViewHolder_u24lambda_u243.setContentDescription("Установить звуки");
        $this$onBindViewHolder_u24lambda_u243.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCatalogAdapter$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SoundCatalogAdapter.onBindViewHolder$lambda$3$lambda$2(this.f$0, item, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(SoundCatalogAdapter this$0, String key, RemoteCustomItem item, Holder holder, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        SoundPreviewPlayer soundPreviewPlayer = this$0.preview;
        Iterable $this$map$iv = item.getInstallPaths();
        Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            RemoteCustomFile it2 = (RemoteCustomFile) item$iv$iv;
            destination$iv$iv.add(it2.getPath());
        }
        soundPreviewPlayer.toggle(key, (List) destination$iv$iv, new SoundCatalogAdapter$onBindViewHolder$1$2(holder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$3$lambda$2(SoundCatalogAdapter this$0, RemoteCustomItem item, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.preview.stop();
        this$0.onItemSelected.invoke(item, this$0.localFolderFor.invoke(item));
    }

    /* JADX INFO: compiled from: SoundCatalogAdapter.kt */
    @Metadata(m4415d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCatalogAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "key", "", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "listen", "Landroid/widget/ImageView;", "getListen", "()Landroid/widget/ImageView;", "update", "", "playing", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final class Holder extends RecyclerView.ViewHolder {
        private String key;
        private final ImageView listen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View viewFindViewById = view.findViewById(C3715R.id.neizzir20_item_listen);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.listen = (ImageView) viewFindViewById;
        }

        public final String getKey() {
            return this.key;
        }

        public final void setKey(String str) {
            this.key = str;
        }

        public final ImageView getListen() {
            return this.listen;
        }

        public final void update(boolean playing) {
            this.listen.setImageResource(playing ? C3715R.drawable.neizzir20_ic_stop : C3715R.drawable.neizzir_ic_play);
            this.listen.setColorFilter(Color.parseColor(playing ? "#EF4444" : "#00E5CC"));
            this.listen.setContentDescription(playing ? "Остановить звук" : "Прослушать звук");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(Holder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder.getKey() != null && Intrinsics.areEqual(this.preview.getActiveKey(), holder.getKey())) {
            this.preview.stop();
        }
        holder.setKey(null);
    }
}
