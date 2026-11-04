package com.blackhub.bronline.neizzir.fragments.custom.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.helpshift.proactive.InAppViewConstants;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.FilesKt;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

/* JADX INFO: compiled from: AnimationsAdapter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB]\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\t\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\f2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/AnimationsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/AnimationsAdapter$VH;", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomItem;", "localFolderFor", "Lkotlin/Function1;", "Ljava/io/File;", "onPreview", "", "onInstall", "Lkotlin/Function2;", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "getItemCount", "", "onBindViewHolder", "holder", InAppViewConstants.POSITION, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "resetIStanFlagIfNeeded", "VH", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class AnimationsAdapter extends RecyclerView.Adapter<C5298VH> {
    private final Context context;
    private final List<RemoteCustomItem> items;
    private final Function1<RemoteCustomItem, File> localFolderFor;
    private final Function2<RemoteCustomItem, File, Unit> onInstall;
    private final Function1<RemoteCustomItem, Unit> onPreview;

    /* JADX WARN: Multi-variable type inference failed */
    public AnimationsAdapter(Context context, List<RemoteCustomItem> items, Function1<? super RemoteCustomItem, ? extends File> localFolderFor, Function1<? super RemoteCustomItem, Unit> onPreview, Function2<? super RemoteCustomItem, ? super File, Unit> onInstall) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(localFolderFor, "localFolderFor");
        Intrinsics.checkNotNullParameter(onPreview, "onPreview");
        Intrinsics.checkNotNullParameter(onInstall, "onInstall");
        this.context = context;
        this.items = items;
        this.localFolderFor = localFolderFor;
        this.onPreview = onPreview;
        this.onInstall = onInstall;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public C5298VH onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View v = LayoutInflater.from(this.context).inflate(C3715R.layout.neizzir20_item_custom_compact, parent, false);
        Intrinsics.checkNotNull(v);
        return new C5298VH(this, v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(C5298VH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.custom.adapters.AnimationsAdapter$VH */
    /* JADX INFO: compiled from: AnimationsAdapter.kt */
    @Metadata(m4415d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/AnimationsAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/AnimationsAdapter;Landroid/view/View;)V", "eyeBtn", "Landroid/widget/ImageView;", "idText", "Landroid/widget/TextView;", "installBtn", "title", "bind", "", "item", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomItem;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public final class C5298VH extends RecyclerView.ViewHolder {
        private final ImageView eyeBtn;
        private final TextView idText;
        private final ImageView installBtn;
        final /* synthetic */ AnimationsAdapter this$0;
        private final TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5298VH(AnimationsAdapter this$0, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = this$0;
            View viewFindViewById = itemView.findViewById(C3715R.id.neizzir20_item_id);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.idText = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(C3715R.id.neizzir20_item_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.title = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(C3715R.id.neizzir20_item_eye);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.eyeBtn = (ImageView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(C3715R.id.neizzir20_item_install);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.installBtn = (ImageView) viewFindViewById4;
        }

        public final void bind(final RemoteCustomItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.idText.setText(item.getId());
            this.title.setText("Анимация #" + item.getId());
            this.eyeBtn.setVisibility(0);
            ImageView imageView = this.eyeBtn;
            final AnimationsAdapter animationsAdapter = this.this$0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.AnimationsAdapter$VH$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnimationsAdapter.C5298VH.bind$lambda$0(animationsAdapter, item, view);
                }
            });
            final File folder = (File) this.this$0.localFolderFor.invoke(item);
            ImageView imageView2 = this.installBtn;
            final AnimationsAdapter animationsAdapter2 = this.this$0;
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.AnimationsAdapter$VH$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnimationsAdapter.C5298VH.bind$lambda$1(animationsAdapter2, item, folder, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(AnimationsAdapter this$0, RemoteCustomItem item, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            this$0.onPreview.invoke(item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1(AnimationsAdapter this$0, RemoteCustomItem item, File folder, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(folder, "$folder");
            this$0.onInstall.invoke(item, folder);
            this$0.resetIStanFlagIfNeeded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetIStanFlagIfNeeded() {
        try {
            File settingsFile = new File(this.context.getFilesDir(), "settings.ini");
            if (settingsFile.exists()) {
                String text = FilesKt.readText(settingsFile, Charsets.UTF_8);
                Regex regex = new Regex("^\\s*iStan\\s*=\\s*1\\b.*$", RegexOption.MULTILINE);
                if (regex.containsMatchIn(text)) {
                    String newText = regex.replace(text, new Function1<MatchResult, CharSequence>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.AnimationsAdapter$resetIStanFlagIfNeeded$newText$1
                        @Override // kotlin.jvm.functions.Function1
                        public final CharSequence invoke(MatchResult match) {
                            Intrinsics.checkNotNullParameter(match, "match");
                            return new Regex("=\\s*1\\b").replaceFirst(match.getValue(), "=0");
                        }
                    });
                    FilesKt.writeText(settingsFile, newText, Charsets.UTF_8);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
