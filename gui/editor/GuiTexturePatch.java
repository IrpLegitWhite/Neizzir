package com.blackhub.bronline.neizzir.gui.editor;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: GuiEditorModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BK\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J&\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÁ\u0001¢\u0006\u0002\b(R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006+"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiTexturePatch;", "", "seen1", "", "archivePath", "", "mode", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiTexturePatchMode;", "colorHex", "payloadFile", "sourceName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/blackhub/bronline/neizzir/gui/editor/GuiTexturePatchMode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/blackhub/bronline/neizzir/gui/editor/GuiTexturePatchMode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArchivePath", "()Ljava/lang/String;", "getColorHex", "getMode", "()Lcom/blackhub/bronline/neizzir/gui/editor/GuiTexturePatchMode;", "getPayloadFile", "getSourceName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_debug", "$serializer", "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
@Serializable
public final /* data */ class GuiTexturePatch {
    private final String archivePath;
    private final String colorHex;
    private final GuiTexturePatchMode mode;
    private final String payloadFile;
    private final String sourceName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, GuiTexturePatchMode.INSTANCE.serializer(), null, null, null};

    public static /* synthetic */ GuiTexturePatch copy$default(GuiTexturePatch guiTexturePatch, String str, GuiTexturePatchMode guiTexturePatchMode, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = guiTexturePatch.archivePath;
        }
        if ((i & 2) != 0) {
            guiTexturePatchMode = guiTexturePatch.mode;
        }
        GuiTexturePatchMode guiTexturePatchMode2 = guiTexturePatchMode;
        if ((i & 4) != 0) {
            str2 = guiTexturePatch.colorHex;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = guiTexturePatch.payloadFile;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = guiTexturePatch.sourceName;
        }
        return guiTexturePatch.copy(str, guiTexturePatchMode2, str5, str6, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getArchivePath() {
        return this.archivePath;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GuiTexturePatchMode getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getColorHex() {
        return this.colorHex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPayloadFile() {
        return this.payloadFile;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSourceName() {
        return this.sourceName;
    }

    public final GuiTexturePatch copy(String archivePath, GuiTexturePatchMode mode, String colorHex, String payloadFile, String sourceName) {
        Intrinsics.checkNotNullParameter(archivePath, "archivePath");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new GuiTexturePatch(archivePath, mode, colorHex, payloadFile, sourceName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuiTexturePatch)) {
            return false;
        }
        GuiTexturePatch guiTexturePatch = (GuiTexturePatch) other;
        return Intrinsics.areEqual(this.archivePath, guiTexturePatch.archivePath) && this.mode == guiTexturePatch.mode && Intrinsics.areEqual(this.colorHex, guiTexturePatch.colorHex) && Intrinsics.areEqual(this.payloadFile, guiTexturePatch.payloadFile) && Intrinsics.areEqual(this.sourceName, guiTexturePatch.sourceName);
    }

    public int hashCode() {
        return (((((((this.archivePath.hashCode() * 31) + this.mode.hashCode()) * 31) + (this.colorHex == null ? 0 : this.colorHex.hashCode())) * 31) + (this.payloadFile == null ? 0 : this.payloadFile.hashCode())) * 31) + (this.sourceName != null ? this.sourceName.hashCode() : 0);
    }

    public String toString() {
        return "GuiTexturePatch(archivePath=" + this.archivePath + ", mode=" + this.mode + ", colorHex=" + this.colorHex + ", payloadFile=" + this.payloadFile + ", sourceName=" + this.sourceName + ')';
    }

    /* JADX INFO: compiled from: GuiEditorModels.kt */
    @Metadata(m4415d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiTexturePatch$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiTexturePatch;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GuiTexturePatch> serializer() {
            return GuiTexturePatch$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ GuiTexturePatch(int seen1, String archivePath, GuiTexturePatchMode mode, String colorHex, String payloadFile, String sourceName, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (seen1 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 3, GuiTexturePatch$$serializer.INSTANCE.getDescriptor());
        }
        this.archivePath = archivePath;
        this.mode = mode;
        if ((seen1 & 4) == 0) {
            this.colorHex = null;
        } else {
            this.colorHex = colorHex;
        }
        if ((seen1 & 8) == 0) {
            this.payloadFile = null;
        } else {
            this.payloadFile = payloadFile;
        }
        if ((seen1 & 16) == 0) {
            this.sourceName = null;
        } else {
            this.sourceName = sourceName;
        }
    }

    public GuiTexturePatch(String archivePath, GuiTexturePatchMode mode, String colorHex, String payloadFile, String sourceName) {
        Intrinsics.checkNotNullParameter(archivePath, "archivePath");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.archivePath = archivePath;
        this.mode = mode;
        this.colorHex = colorHex;
        this.payloadFile = payloadFile;
        this.sourceName = sourceName;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_debug(GuiTexturePatch self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.archivePath);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.mode);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.colorHex != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.colorHex);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.payloadFile != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.payloadFile);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.sourceName != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.sourceName);
        }
    }

    public /* synthetic */ GuiTexturePatch(String str, GuiTexturePatchMode guiTexturePatchMode, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, guiTexturePatchMode, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public final String getArchivePath() {
        return this.archivePath;
    }

    public final GuiTexturePatchMode getMode() {
        return this.mode;
    }

    public final String getColorHex() {
        return this.colorHex;
    }

    public final String getPayloadFile() {
        return this.payloadFile;
    }

    public final String getSourceName() {
        return this.sourceName;
    }
}
