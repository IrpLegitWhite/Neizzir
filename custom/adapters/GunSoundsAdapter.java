package com.blackhub.bronline.neizzir.fragments.custom.adapters;

import android.content.Context;
import com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundCatalogAdapter;
import com.blackhub.bronline.neizzir.fragments.custom.sounds.SoundPreviewPlayer;
import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GunSoundsAdapter.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/adapters/GunSoundsAdapter;", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundCatalogAdapter;", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomItem;", "localFolderFor", "Lkotlin/Function1;", "Ljava/io/File;", "preview", "Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundPreviewPlayer;", "onItemSelected", "Lkotlin/Function2;", "", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/blackhub/bronline/neizzir/fragments/custom/sounds/SoundPreviewPlayer;Lkotlin/jvm/functions/Function2;)V", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class GunSoundsAdapter extends SoundCatalogAdapter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GunSoundsAdapter(Context context, List<RemoteCustomItem> items, Function1<? super RemoteCustomItem, ? extends File> localFolderFor, SoundPreviewPlayer preview, Function2<? super RemoteCustomItem, ? super File, Unit> onItemSelected) {
        super(context, items, localFolderFor, preview, "Стрельба", onItemSelected);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(localFolderFor, "localFolderFor");
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
    }
}
