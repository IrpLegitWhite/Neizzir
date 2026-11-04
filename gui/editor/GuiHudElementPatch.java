package com.blackhub.bronline.neizzir.gui.editor;

import com.helpshift.HelpshiftEvent;
import com.helpshift.proactive.InAppViewConstants;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: GuiEditorModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000256Bi\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012BW\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0002\u0010\u0013J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\u0015\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000fHÆ\u0003Je\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001J&\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203HÁ\u0001¢\u0006\u0002\b4R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017¨\u00067"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudElementPatch;", "", "seen1", "", "id", "", "x", "", "y", InAppViewConstants.WIDTH, InAppViewConstants.HEIGHT, "scale", HelpshiftEvent.DATA_SDK_VISIBLE, "", "colorOverrides", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;FFFFFZLjava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;FFFFFZLjava/util/Map;)V", "getColorOverrides", "()Ljava/util/Map;", "getHeight", "()F", "getId", "()Ljava/lang/String;", "getScale", "getVisible", "()Z", "getWidth", "getX", "getY", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_debug", "$serializer", "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
@Serializable
public final /* data */ class GuiHudElementPatch {
    private final Map<String, String> colorOverrides;
    private final float height;
    private final String id;
    private final float scale;
    private final boolean visible;
    private final float width;
    private final float x;
    private final float y;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, StringSerializer.INSTANCE)};

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    public final Map<String, String> component8() {
        return this.colorOverrides;
    }

    public final GuiHudElementPatch copy(String id, float x, float y, float width, float height, float scale, boolean visible, Map<String, String> colorOverrides) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(colorOverrides, "colorOverrides");
        return new GuiHudElementPatch(id, x, y, width, height, scale, visible, colorOverrides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuiHudElementPatch)) {
            return false;
        }
        GuiHudElementPatch guiHudElementPatch = (GuiHudElementPatch) other;
        return Intrinsics.areEqual(this.id, guiHudElementPatch.id) && Float.compare(this.x, guiHudElementPatch.x) == 0 && Float.compare(this.y, guiHudElementPatch.y) == 0 && Float.compare(this.width, guiHudElementPatch.width) == 0 && Float.compare(this.height, guiHudElementPatch.height) == 0 && Float.compare(this.scale, guiHudElementPatch.scale) == 0 && this.visible == guiHudElementPatch.visible && Intrinsics.areEqual(this.colorOverrides, guiHudElementPatch.colorOverrides);
    }

    public int hashCode() {
        return (((((((((((((this.id.hashCode() * 31) + Float.hashCode(this.x)) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.width)) * 31) + Float.hashCode(this.height)) * 31) + Float.hashCode(this.scale)) * 31) + Boolean.hashCode(this.visible)) * 31) + this.colorOverrides.hashCode();
    }

    public String toString() {
        return "GuiHudElementPatch(id=" + this.id + ", x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ", scale=" + this.scale + ", visible=" + this.visible + ", colorOverrides=" + this.colorOverrides + ')';
    }

    /* JADX INFO: compiled from: GuiEditorModels.kt */
    @Metadata(m4415d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudElementPatch$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudElementPatch;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GuiHudElementPatch> serializer() {
            return GuiHudElementPatch$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ GuiHudElementPatch(int seen1, String id, float x, float y, float width, float height, float scale, boolean visible, Map colorOverrides, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (seen1 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 31, GuiHudElementPatch$$serializer.INSTANCE.getDescriptor());
        }
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        if ((seen1 & 32) == 0) {
            this.scale = 1.0f;
        } else {
            this.scale = scale;
        }
        if ((seen1 & 64) == 0) {
            this.visible = true;
        } else {
            this.visible = visible;
        }
        if ((seen1 & 128) == 0) {
            this.colorOverrides = MapsKt__MapsKt.emptyMap();
        } else {
            this.colorOverrides = colorOverrides;
        }
    }

    public GuiHudElementPatch(String id, float x, float y, float width, float height, float scale, boolean visible, Map<String, String> colorOverrides) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(colorOverrides, "colorOverrides");
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.scale = scale;
        this.visible = visible;
        this.colorOverrides = colorOverrides;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_debug(GuiHudElementPatch self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        boolean z = false;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeFloatElement(serialDesc, 1, self.x);
        output.encodeFloatElement(serialDesc, 2, self.y);
        output.encodeFloatElement(serialDesc, 3, self.width);
        output.encodeFloatElement(serialDesc, 4, self.height);
        boolean z2 = output.shouldEncodeElementDefault(serialDesc, 5) || Float.compare(self.scale, 1.0f) != 0;
        if (z2) {
            output.encodeFloatElement(serialDesc, 5, self.scale);
        }
        boolean z3 = output.shouldEncodeElementDefault(serialDesc, 6) || !self.visible;
        if (z3) {
            output.encodeBooleanElement(serialDesc, 6, self.visible);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !Intrinsics.areEqual(self.colorOverrides, MapsKt__MapsKt.emptyMap())) {
            z = true;
        }
        if (z) {
            output.encodeSerializableElement(serialDesc, 7, kSerializerArr[7], self.colorOverrides);
        }
    }

    public /* synthetic */ GuiHudElementPatch(String str, float f, float f2, float f3, float f4, float f5, boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, f2, f3, f4, (i & 32) != 0 ? 1.0f : f5, (i & 64) != 0 ? true : z, (i & 128) != 0 ? MapsKt__MapsKt.emptyMap() : map);
    }

    public final String getId() {
        return this.id;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getScale() {
        return this.scale;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final Map<String, String> getColorOverrides() {
        return this.colorOverrides;
    }
}
