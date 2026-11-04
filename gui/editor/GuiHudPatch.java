package com.blackhub.bronline.neizzir.gui.editor;

import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: compiled from: GuiEditorModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(B=\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB)\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J&\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%HÁ\u0001¢\u0006\u0002\b&R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudPatch;", "", "seen1", "", "radarShape", "Lcom/blackhub/bronline/neizzir/gui/editor/RadarShape;", "radarBarsShape", "Lcom/blackhub/bronline/neizzir/gui/editor/RadarBarsShape;", "elements", "", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudElementPatch;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/blackhub/bronline/neizzir/gui/editor/RadarShape;Lcom/blackhub/bronline/neizzir/gui/editor/RadarBarsShape;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/blackhub/bronline/neizzir/gui/editor/RadarShape;Lcom/blackhub/bronline/neizzir/gui/editor/RadarBarsShape;Ljava/util/List;)V", "getElements", "()Ljava/util/List;", "getRadarBarsShape", "()Lcom/blackhub/bronline/neizzir/gui/editor/RadarBarsShape;", "getRadarShape", "()Lcom/blackhub/bronline/neizzir/gui/editor/RadarShape;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_debug", "$serializer", "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
@Serializable
public final /* data */ class GuiHudPatch {
    private final List<GuiHudElementPatch> elements;
    private final RadarBarsShape radarBarsShape;
    private final RadarShape radarShape;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {RadarShape.INSTANCE.serializer(), RadarBarsShape.INSTANCE.serializer(), new ArrayListSerializer(GuiHudElementPatch$$serializer.INSTANCE)};

    public GuiHudPatch() {
        this((RadarShape) null, (RadarBarsShape) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GuiHudPatch copy$default(GuiHudPatch guiHudPatch, RadarShape radarShape, RadarBarsShape radarBarsShape, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            radarShape = guiHudPatch.radarShape;
        }
        if ((i & 2) != 0) {
            radarBarsShape = guiHudPatch.radarBarsShape;
        }
        if ((i & 4) != 0) {
            list = guiHudPatch.elements;
        }
        return guiHudPatch.copy(radarShape, radarBarsShape, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RadarShape getRadarShape() {
        return this.radarShape;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RadarBarsShape getRadarBarsShape() {
        return this.radarBarsShape;
    }

    public final List<GuiHudElementPatch> component3() {
        return this.elements;
    }

    public final GuiHudPatch copy(RadarShape radarShape, RadarBarsShape radarBarsShape, List<GuiHudElementPatch> elements) {
        Intrinsics.checkNotNullParameter(radarShape, "radarShape");
        Intrinsics.checkNotNullParameter(radarBarsShape, "radarBarsShape");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new GuiHudPatch(radarShape, radarBarsShape, elements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuiHudPatch)) {
            return false;
        }
        GuiHudPatch guiHudPatch = (GuiHudPatch) other;
        return this.radarShape == guiHudPatch.radarShape && this.radarBarsShape == guiHudPatch.radarBarsShape && Intrinsics.areEqual(this.elements, guiHudPatch.elements);
    }

    public int hashCode() {
        return (((this.radarShape.hashCode() * 31) + this.radarBarsShape.hashCode()) * 31) + this.elements.hashCode();
    }

    public String toString() {
        return "GuiHudPatch(radarShape=" + this.radarShape + ", radarBarsShape=" + this.radarBarsShape + ", elements=" + this.elements + ')';
    }

    /* JADX INFO: compiled from: GuiEditorModels.kt */
    @Metadata(m4415d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudPatch$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudPatch;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GuiHudPatch> serializer() {
            return GuiHudPatch$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ GuiHudPatch(int seen1, RadarShape radarShape, RadarBarsShape radarBarsShape, List elements, SerializationConstructorMarker serializationConstructorMarker) {
        if ((seen1 & 1) == 0) {
            this.radarShape = RadarShape.ROUND;
        } else {
            this.radarShape = radarShape;
        }
        if ((seen1 & 2) == 0) {
            this.radarBarsShape = RadarBarsShape.CURVED;
        } else {
            this.radarBarsShape = radarBarsShape;
        }
        if ((seen1 & 4) == 0) {
            this.elements = GuiHudDefaults.INSTANCE.getElements();
        } else {
            this.elements = elements;
        }
    }

    public GuiHudPatch(RadarShape radarShape, RadarBarsShape radarBarsShape, List<GuiHudElementPatch> elements) {
        Intrinsics.checkNotNullParameter(radarShape, "radarShape");
        Intrinsics.checkNotNullParameter(radarBarsShape, "radarBarsShape");
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.radarShape = radarShape;
        this.radarBarsShape = radarBarsShape;
        this.elements = elements;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_debug(GuiHudPatch self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        boolean z = false;
        boolean z2 = output.shouldEncodeElementDefault(serialDesc, 0) || self.radarShape != RadarShape.ROUND;
        if (z2) {
            output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.radarShape);
        }
        boolean z3 = output.shouldEncodeElementDefault(serialDesc, 1) || self.radarBarsShape != RadarBarsShape.CURVED;
        if (z3) {
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.radarBarsShape);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.elements, GuiHudDefaults.INSTANCE.getElements())) {
            z = true;
        }
        if (z) {
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.elements);
        }
    }

    public /* synthetic */ GuiHudPatch(RadarShape radarShape, RadarBarsShape radarBarsShape, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RadarShape.ROUND : radarShape, (i & 2) != 0 ? RadarBarsShape.CURVED : radarBarsShape, (i & 4) != 0 ? GuiHudDefaults.INSTANCE.getElements() : list);
    }

    public final RadarShape getRadarShape() {
        return this.radarShape;
    }

    public final RadarBarsShape getRadarBarsShape() {
        return this.radarBarsShape;
    }

    public final List<GuiHudElementPatch> getElements() {
        return this.elements;
    }
}
