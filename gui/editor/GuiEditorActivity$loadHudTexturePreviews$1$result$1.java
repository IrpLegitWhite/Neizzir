package com.blackhub.bronline.neizzir.gui.editor;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: GuiEditorActivity.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u0005H\u008a@"}, m4416d2 = {"<anonymous>", "Lkotlin/Result;", "", "", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.gui.editor.GuiEditorActivity$loadHudTexturePreviews$1$result$1", m4426f = "GuiEditorActivity.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
final class GuiEditorActivity$loadHudTexturePreviews$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Map<String, ? extends Bitmap>>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GuiEditorActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GuiEditorActivity$loadHudTexturePreviews$1$result$1(GuiEditorActivity guiEditorActivity, Continuation<? super GuiEditorActivity$loadHudTexturePreviews$1$result$1> continuation) {
        super(2, continuation);
        this.this$0 = guiEditorActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GuiEditorActivity$loadHudTexturePreviews$1$result$1 guiEditorActivity$loadHudTexturePreviews$1$result$1 = new GuiEditorActivity$loadHudTexturePreviews$1$result$1(this.this$0, continuation);
        guiEditorActivity$loadHudTexturePreviews$1$result$1.L$0 = obj;
        return guiEditorActivity$loadHudTexturePreviews$1$result$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Map<String, ? extends Bitmap>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends Map<String, Bitmap>>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends Map<String, Bitmap>>> continuation) {
        return ((GuiEditorActivity$loadHudTexturePreviews$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM15551constructorimpl;
        GuiTextureRepository guiTextureRepository;
        int i;
        Pair pairM4423to;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                GuiEditorActivity guiEditorActivity = this.this$0;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    int i2 = 0;
                    GuiTextureRepository guiTextureRepository2 = guiEditorActivity.textureRepository;
                    if (guiTextureRepository2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("textureRepository");
                        guiTextureRepository2 = null;
                    }
                    Iterable $this$associateBy$iv = guiTextureRepository2.listHudTextures();
                    int capacity$iv = RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$associateBy$iv, 10)), 16);
                    Map destination$iv$iv = new LinkedHashMap(capacity$iv);
                    for (Object element$iv$iv : $this$associateBy$iv) {
                        GuiTextureEntry it = (GuiTextureEntry) element$iv$iv;
                        destination$iv$iv.put(it.getArchivePath(), element$iv$iv);
                    }
                    Iterable<String> $this$forEach$iv$iv$iv = GuiEditorActivity.Companion.getPreviewTexturePaths();
                    Collection destination$iv$iv2 = new ArrayList();
                    for (String path : $this$forEach$iv$iv$iv) {
                        GuiTextureEntry entry = (GuiTextureEntry) destination$iv$iv.get(path);
                        if (entry == null) {
                            i = i2;
                            pairM4423to = null;
                        } else {
                            GuiTextureRepository guiTextureRepository3 = guiEditorActivity.textureRepository;
                            if (guiTextureRepository3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("textureRepository");
                                guiTextureRepository = null;
                            } else {
                                guiTextureRepository = guiTextureRepository3;
                            }
                            i = i2;
                            File png = guiTextureRepository.previewFile(entry);
                            Bitmap bitmap = BitmapFactory.decodeFile(png.getAbsolutePath());
                            if (bitmap != null) {
                                Intrinsics.checkNotNull(bitmap);
                                pairM4423to = TuplesKt.m4423to(path, bitmap);
                            } else {
                                pairM4423to = null;
                            }
                        }
                        if (pairM4423to != null) {
                            destination$iv$iv2.add(pairM4423to);
                        }
                        i2 = i;
                    }
                    objM15551constructorimpl = Result.m15551constructorimpl(MapsKt__MapsKt.toMap((List) destination$iv$iv2));
                    break;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                }
                return Result.m15550boximpl(objM15551constructorimpl);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
