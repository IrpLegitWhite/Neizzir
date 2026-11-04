package com.blackhub.bronline.neizzir.fragments.custom.adapters;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import com.google.android.material.card.MaterialCardView;
import com.helpshift.proactive.InAppViewConstants;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.FilesKt__FileReadWriteKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: MapColorsAdapter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u000fH\u0016J\u0014\u0010\u001e\u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/MapColorsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "folders", "", "Ljava/io/File;", "onSelect", "Lkotlin/Function1;", "", "onAddColor", "Lkotlin/Function0;", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "TYPE_ADD", "", "TYPE_ITEM", "createAddButton", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "dpToPx", CalendarKeys.DAYS_GAME_KEY, "getItemCount", "getItemViewType", InAppViewConstants.POSITION, "onBindViewHolder", "holder", "onCreateViewHolder", "viewType", "replaceData", "newFolders", "AddVH", "ItemVH", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class MapColorsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final int TYPE_ADD;
    private final int TYPE_ITEM;
    private final Context context;
    private List<? extends File> folders;
    private final Function0<Unit> onAddColor;
    private final Function1<File, Unit> onSelect;

    /* JADX WARN: Multi-variable type inference failed */
    public MapColorsAdapter(Context context, List<? extends File> folders, Function1<? super File, Unit> onSelect, Function0<Unit> onAddColor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(folders, "folders");
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        Intrinsics.checkNotNullParameter(onAddColor, "onAddColor");
        this.context = context;
        this.folders = folders;
        this.onSelect = onSelect;
        this.onAddColor = onAddColor;
        this.TYPE_ITEM = 1;
        this.TYPE_ADD = 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.folders.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position == this.folders.size() ? this.TYPE_ADD : this.TYPE_ITEM;
    }

    public final void replaceData(List<? extends File> newFolders) {
        Intrinsics.checkNotNullParameter(newFolders, "newFolders");
        this.folders = newFolders;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == this.TYPE_ADD) {
            return new AddVH(this, createAddButton(parent));
        }
        View v = LayoutInflater.from(this.context).inflate(C3715R.layout.neizzir20_item_custom_compact, parent, false);
        Intrinsics.checkNotNull(v);
        return new ItemVH(this, v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (!(holder instanceof AddVH)) {
            if (!(holder instanceof ItemVH) || position >= this.folders.size()) {
                return;
            }
            ((ItemVH) holder).bind(this.folders.get(position));
            return;
        }
        ((AddVH) holder).bind();
    }

    /* JADX INFO: compiled from: MapColorsAdapter.kt */
    @Metadata(m4415d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/MapColorsAdapter$ItemVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "item", "Landroid/view/View;", "(Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/MapColorsAdapter;Landroid/view/View;)V", "idText", "Landroid/widget/TextView;", "installBtn", "Landroid/widget/ImageView;", "preview", "previewCard", "Lcom/google/android/material/card/MaterialCardView;", "title", "bind", "", "folder", "Ljava/io/File;", "readColor", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public final class ItemVH extends RecyclerView.ViewHolder {
        private final TextView idText;
        private final ImageView installBtn;
        private final ImageView preview;
        private final MaterialCardView previewCard;
        final /* synthetic */ MapColorsAdapter this$0;
        private final TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemVH(MapColorsAdapter this$0, View item) {
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

        public final void bind(final File folder) {
            Object objM15551constructorimpl;
            Intrinsics.checkNotNullParameter(folder, "folder");
            this.idText.setText(folder.getName());
            this.title.setText("Карта #" + folder.getName());
            String hex = readColor(folder);
            try {
                Result.Companion companion = Result.INSTANCE;
                ItemVH itemVH = this;
                objM15551constructorimpl = Result.m15551constructorimpl(Integer.valueOf(Color.parseColor(hex)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m15557isFailureimpl(objM15551constructorimpl)) {
                objM15551constructorimpl = -1;
            }
            int parsed = ((Number) objM15551constructorimpl).intValue();
            int opaque = (-16777216) | parsed;
            this.previewCard.setVisibility(0);
            ImageView imageView = this.preview;
            GradientDrawable $this$bind_u24lambda_u241 = new GradientDrawable();
            $this$bind_u24lambda_u241.setShape(0);
            $this$bind_u24lambda_u241.setColor(opaque);
            $this$bind_u24lambda_u241.setCornerRadius(8.0f);
            imageView.setImageDrawable($this$bind_u24lambda_u241);
            ImageView imageView2 = this.installBtn;
            final MapColorsAdapter mapColorsAdapter = this.this$0;
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.MapColorsAdapter$ItemVH$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MapColorsAdapter.ItemVH.bind$lambda$3(folder, mapColorsAdapter, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:11:0x0022  */
        public static final void bind$lambda$3(File folder, MapColorsAdapter this$0, View it) {
            boolean z;
            Intrinsics.checkNotNullParameter(folder, "$folder");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            File[] fileArrListFiles = folder.listFiles(new FilenameFilter() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.MapColorsAdapter$ItemVH$$ExternalSyntheticLambda1
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return MapColorsAdapter.ItemVH.bind$lambda$3$lambda$2(file, str);
                }
            });
            if (fileArrListFiles != null) {
                z = (fileArrListFiles.length == 0) ^ true;
            }
            boolean hasBtx = z;
            if (!hasBtx) {
                Toast.makeText(this$0.context, "Нет .btx файлов", 0).show();
            } else {
                this$0.onSelect.invoke(folder);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean bind$lambda$3$lambda$2(File file, String n) {
            Intrinsics.checkNotNull(n);
            return StringsKt__StringsJVMKt.endsWith(n, ".btx", true);
        }

        private final String readColor(File folder) {
            File f = new File(folder, "color.txt");
            if (f.exists()) {
                String txt = StringsKt__StringsKt.trim((CharSequence) FilesKt__FileReadWriteKt.readText$default(f, null, 1, null)).toString();
                if (txt.length() > 0) {
                    return StringsKt__StringsJVMKt.startsWith$default(txt, "#", false, 2, null) ? txt : '#' + txt;
                }
                return "#FFFFFF";
            }
            return "#FFFFFF";
        }
    }

    /* JADX INFO: compiled from: MapColorsAdapter.kt */
    @Metadata(m4415d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/MapColorsAdapter$AddVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "item", "Landroid/view/View;", "(Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/MapColorsAdapter;Landroid/view/View;)V", "bind", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public final class AddVH extends RecyclerView.ViewHolder {
        final /* synthetic */ MapColorsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddVH(MapColorsAdapter this$0, View item) {
            super(item);
            Intrinsics.checkNotNullParameter(item, "item");
            this.this$0 = this$0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(MapColorsAdapter this$0, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.onAddColor.invoke();
        }

        public final void bind() {
            View view = this.itemView;
            final MapColorsAdapter mapColorsAdapter = this.this$0;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.adapters.MapColorsAdapter$AddVH$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MapColorsAdapter.AddVH.bind$lambda$0(mapColorsAdapter, view2);
                }
            });
        }
    }

    private final View createAddButton(ViewGroup parent) {
        MaterialCardView $this$createAddButton_u24lambda_u242 = new MaterialCardView(this.context);
        $this$createAddButton_u24lambda_u242.setLayoutParams(new ViewGroup.LayoutParams(-1, dpToPx(56)));
        $this$createAddButton_u24lambda_u242.setRadius(dpToPx(14));
        $this$createAddButton_u24lambda_u242.setCardElevation(0.0f);
        $this$createAddButton_u24lambda_u242.setCardBackgroundColor(Color.parseColor("#12FFFFFF"));
        $this$createAddButton_u24lambda_u242.setStrokeWidth(dpToPx(1));
        $this$createAddButton_u24lambda_u242.setStrokeColor(Color.parseColor("#00E5CC"));
        FrameLayout content = new FrameLayout($this$createAddButton_u24lambda_u242.getContext());
        content.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        TextView $this$createAddButton_u24lambda_u242_u24lambda_u241 = new TextView($this$createAddButton_u24lambda_u242.getContext());
        $this$createAddButton_u24lambda_u242_u24lambda_u241.setText("＋ Добавить цвет");
        $this$createAddButton_u24lambda_u242_u24lambda_u241.setTextColor(Color.parseColor("#00E5CC"));
        $this$createAddButton_u24lambda_u242_u24lambda_u241.setTextSize(14.0f);
        $this$createAddButton_u24lambda_u242_u24lambda_u241.setGravity(17);
        content.addView($this$createAddButton_u24lambda_u242_u24lambda_u241, new FrameLayout.LayoutParams(-2, -2, 17));
        $this$createAddButton_u24lambda_u242.addView(content);
        return $this$createAddButton_u24lambda_u242;
    }

    private final int dpToPx(int dp) {
        return (int) (dp * this.context.getResources().getDisplayMetrics().density);
    }
}
