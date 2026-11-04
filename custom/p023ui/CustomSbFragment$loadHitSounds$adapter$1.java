package com.blackhub.bronline.neizzir.fragments.custom.p023ui;

import com.blackhub.bronline.neizzir.fragments.custom.util.RemoteCustomItem;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CustomSbFragment.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
/* synthetic */ class CustomSbFragment$loadHitSounds$adapter$1 extends FunctionReferenceImpl implements Function1<RemoteCustomItem, File> {
    CustomSbFragment$loadHitSounds$adapter$1(Object obj) {
        super(1, obj, CustomSbFragment.class, "localFolderFor", "localFolderFor(Lcom/blackhub/bronline/neizzir/fragments/custom/util/RemoteCustomItem;)Ljava/io/File;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final File invoke(RemoteCustomItem p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((CustomSbFragment) this.receiver).localFolderFor(p0);
    }
}
