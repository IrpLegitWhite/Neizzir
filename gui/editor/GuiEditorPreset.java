package com.blackhub.bronline.neizzir.gui.editor;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: compiled from: GuiEditorModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000256Ba\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012BG\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\u0010\u0013J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003JU\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0006HÖ\u0001J&\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203HÁ\u0001¢\u0006\u0002\b4R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00067"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiEditorPreset;", "", "seen1", "", "version", "name", "", "createdAt", "", "baseGuiSha256", "baseTexturesSha256", "hudPatch", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudPatch;", "texturePatches", "", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiTexturePatch;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudPatch;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudPatch;Ljava/util/List;)V", "getBaseGuiSha256", "()Ljava/lang/String;", "getBaseTexturesSha256", "getCreatedAt", "()J", "getHudPatch", "()Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudPatch;", "getName", "getTexturePatches", "()Ljava/util/List;", "getVersion", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_debug", "$serializer", "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
@Serializable
public final /* data */ class GuiEditorPreset {
    public static final int VERSION = 1;
    private final String baseGuiSha256;
    private final String baseTexturesSha256;
    private final long createdAt;
    private final GuiHudPatch hudPatch;
    private final String name;
    private final List<GuiTexturePatch> texturePatches;
    private final int version;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(GuiTexturePatch$$serializer.INSTANCE)};

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBaseGuiSha256() {
        return this.baseGuiSha256;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBaseTexturesSha256() {
        return this.baseTexturesSha256;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GuiHudPatch getHudPatch() {
        return this.hudPatch;
    }

    public final List<GuiTexturePatch> component7() {
        return this.texturePatches;
    }

    public final GuiEditorPreset copy(int version, String name, long createdAt, String baseGuiSha256, String baseTexturesSha256, GuiHudPatch hudPatch, List<GuiTexturePatch> texturePatches) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(baseGuiSha256, "baseGuiSha256");
        Intrinsics.checkNotNullParameter(baseTexturesSha256, "baseTexturesSha256");
        Intrinsics.checkNotNullParameter(hudPatch, "hudPatch");
        Intrinsics.checkNotNullParameter(texturePatches, "texturePatches");
        return new GuiEditorPreset(version, name, createdAt, baseGuiSha256, baseTexturesSha256, hudPatch, texturePatches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuiEditorPreset)) {
            return false;
        }
        GuiEditorPreset guiEditorPreset = (GuiEditorPreset) other;
        return this.version == guiEditorPreset.version && Intrinsics.areEqual(this.name, guiEditorPreset.name) && this.createdAt == guiEditorPreset.createdAt && Intrinsics.areEqual(this.baseGuiSha256, guiEditorPreset.baseGuiSha256) && Intrinsics.areEqual(this.baseTexturesSha256, guiEditorPreset.baseTexturesSha256) && Intrinsics.areEqual(this.hudPatch, guiEditorPreset.hudPatch) && Intrinsics.areEqual(this.texturePatches, guiEditorPreset.texturePatches);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.version) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.createdAt)) * 31) + this.baseGuiSha256.hashCode()) * 31) + this.baseTexturesSha256.hashCode()) * 31) + this.hudPatch.hashCode()) * 31) + this.texturePatches.hashCode();
    }

    public String toString() {
        return "GuiEditorPreset(version=" + this.version + ", name=" + this.name + ", createdAt=" + this.createdAt + ", baseGuiSha256=" + this.baseGuiSha256 + ", baseTexturesSha256=" + this.baseTexturesSha256 + ", hudPatch=" + this.hudPatch + ", texturePatches=" + this.texturePatches + ')';
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ GuiEditorPreset(int seen1, int version, String name, long createdAt, String baseGuiSha256, String baseTexturesSha256, GuiHudPatch hudPatch, List texturePatches, SerializationConstructorMarker serializationConstructorMarker) {
        if (62 != (seen1 & 62)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 62, GuiEditorPreset$$serializer.INSTANCE.getDescriptor());
        }
        if ((seen1 & 1) == 0) {
            this.version = 1;
        } else {
            this.version = version;
        }
        this.name = name;
        this.createdAt = createdAt;
        this.baseGuiSha256 = baseGuiSha256;
        this.baseTexturesSha256 = baseTexturesSha256;
        this.hudPatch = hudPatch;
        if ((seen1 & 64) == 0) {
            this.texturePatches = CollectionsKt__CollectionsKt.emptyList();
        } else {
            this.texturePatches = texturePatches;
        }
    }

    public GuiEditorPreset(int version, String name, long createdAt, String baseGuiSha256, String baseTexturesSha256, GuiHudPatch hudPatch, List<GuiTexturePatch> texturePatches) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(baseGuiSha256, "baseGuiSha256");
        Intrinsics.checkNotNullParameter(baseTexturesSha256, "baseTexturesSha256");
        Intrinsics.checkNotNullParameter(hudPatch, "hudPatch");
        Intrinsics.checkNotNullParameter(texturePatches, "texturePatches");
        this.version = version;
        this.name = name;
        this.createdAt = createdAt;
        this.baseGuiSha256 = baseGuiSha256;
        this.baseTexturesSha256 = baseTexturesSha256;
        this.hudPatch = hudPatch;
        this.texturePatches = texturePatches;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_debug(GuiEditorPreset self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        boolean z = false;
        boolean z2 = output.shouldEncodeElementDefault(serialDesc, 0) || self.version != 1;
        if (z2) {
            output.encodeIntElement(serialDesc, 0, self.version);
        }
        output.encodeStringElement(serialDesc, 1, self.name);
        output.encodeLongElement(serialDesc, 2, self.createdAt);
        output.encodeStringElement(serialDesc, 3, self.baseGuiSha256);
        output.encodeStringElement(serialDesc, 4, self.baseTexturesSha256);
        output.encodeSerializableElement(serialDesc, 5, GuiHudPatch$$serializer.INSTANCE, self.hudPatch);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !Intrinsics.areEqual(self.texturePatches, CollectionsKt__CollectionsKt.emptyList())) {
            z = true;
        }
        if (z) {
            output.encodeSerializableElement(serialDesc, 6, kSerializerArr[6], self.texturePatches);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GuiEditorPreset(int i, String str, long j, String str2, String str3, GuiHudPatch guiHudPatch, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3;
        List listEmptyList;
        if ((i2 & 1) == 0) {
            i3 = i;
        } else {
            i3 = 1;
        }
        if ((i2 & 64) == 0) {
            listEmptyList = list;
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        this(i3, str, j, str2, str3, guiHudPatch, listEmptyList);
    }

    public final int getVersion() {
        return this.version;
    }

    public final String getName() {
        return this.name;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getBaseGuiSha256() {
        return this.baseGuiSha256;
    }

    public final String getBaseTexturesSha256() {
        return this.baseTexturesSha256;
    }

    public final GuiHudPatch getHudPatch() {
        return this.hudPatch;
    }

    public final List<GuiTexturePatch> getTexturePatches() {
        return this.texturePatches;
    }

    /* JADX INFO: compiled from: GuiEditorModels.kt */
    @Metadata(m4415d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiEditorPreset$Companion;", "", "()V", "VERSION", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiEditorPreset;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GuiEditorPreset> serializer() {
            return GuiEditorPreset$$serializer.INSTANCE;
        }
    }
}
