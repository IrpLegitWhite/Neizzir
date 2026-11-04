package com.blackhub.bronline.neizzir.gui.editor;

import com.helpshift.HelpshiftEvent;
import com.helpshift.proactive.InAppViewConstants;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: GuiEditorModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m4416d2 = {"com/blackhub/bronline/neizzir/gui/editor/GuiHudElementPatch.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudElementPatch;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class GuiHudElementPatch$$serializer implements GeneratedSerializer<GuiHudElementPatch> {
    public static final GuiHudElementPatch$$serializer INSTANCE = new GuiHudElementPatch$$serializer();
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.blackhub.bronline.neizzir.gui.editor.GuiHudElementPatch", INSTANCE, 8);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("x", false);
        pluginGeneratedSerialDescriptor.addElement("y", false);
        pluginGeneratedSerialDescriptor.addElement(InAppViewConstants.WIDTH, false);
        pluginGeneratedSerialDescriptor.addElement(InAppViewConstants.HEIGHT, false);
        pluginGeneratedSerialDescriptor.addElement("scale", true);
        pluginGeneratedSerialDescriptor.addElement(HelpshiftEvent.DATA_SDK_VISIBLE, true);
        pluginGeneratedSerialDescriptor.addElement("colorOverrides", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GuiHudElementPatch$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, FloatSerializer.INSTANCE, FloatSerializer.INSTANCE, FloatSerializer.INSTANCE, FloatSerializer.INSTANCE, FloatSerializer.INSTANCE, BooleanSerializer.INSTANCE, GuiHudElementPatch.$childSerializers[7]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public GuiHudElementPatch deserialize(Decoder decoder) {
        float f;
        float f2;
        boolean z;
        Map map;
        int i;
        String str;
        float f3;
        float f4;
        float f5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = GuiHudElementPatch.$childSerializers;
        int i2 = 6;
        int i3 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
            float fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 1);
            float fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 2);
            float fDecodeFloatElement3 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 3);
            float fDecodeFloatElement4 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 4);
            float fDecodeFloatElement5 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 5);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 6);
            map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], null);
            str = strDecodeStringElement;
            z = zDecodeBooleanElement;
            f = fDecodeFloatElement5;
            f3 = fDecodeFloatElement3;
            f5 = fDecodeFloatElement4;
            f4 = fDecodeFloatElement2;
            f2 = fDecodeFloatElement;
            i = 255;
        } else {
            float fDecodeFloatElement6 = 0.0f;
            float fDecodeFloatElement7 = 0.0f;
            float fDecodeFloatElement8 = 0.0f;
            float fDecodeFloatElement9 = 0.0f;
            boolean z2 = true;
            Map map2 = null;
            String strDecodeStringElement2 = null;
            float fDecodeFloatElement10 = 0.0f;
            boolean zDecodeBooleanElement2 = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 6;
                        break;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
                        i3 |= 1;
                        i2 = 6;
                        break;
                    case 1:
                        fDecodeFloatElement9 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 1);
                        i3 |= 2;
                        i2 = 6;
                        break;
                    case 2:
                        fDecodeFloatElement8 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        fDecodeFloatElement6 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        fDecodeFloatElement7 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 4);
                        i3 |= 16;
                        break;
                    case 5:
                        fDecodeFloatElement10 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 5);
                        i3 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, i2);
                        i3 |= 64;
                        break;
                    case 7:
                        map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], map2);
                        i3 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            f = fDecodeFloatElement10;
            f2 = fDecodeFloatElement9;
            z = zDecodeBooleanElement2;
            String str2 = strDecodeStringElement2;
            map = map2;
            i = i3;
            str = str2;
            float f6 = fDecodeFloatElement7;
            f3 = fDecodeFloatElement6;
            f4 = fDecodeFloatElement8;
            f5 = f6;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new GuiHudElementPatch(i, str, f2, f4, f3, f5, f, z, map, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, GuiHudElementPatch value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        GuiHudElementPatch.write$Self$app_debug(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
