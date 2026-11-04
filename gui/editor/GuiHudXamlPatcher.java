package com.blackhub.bronline.neizzir.gui.editor;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.adjust.sdk.Constants;
import com.blackhub.bronline.game.core.constants.Other;
import com.google.common.net.HttpHeaders;
import com.helpshift.proactive.InAppViewConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: GuiHudXamlPatcher.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b'\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\u0081\u0001\u0082\u0001\u0083\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J,\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J0\u0010\"\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0002J\u0018\u0010&\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J \u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u0004H\u0002J\u0010\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0002J\u0010\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u0011H\u0002J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010-\u001a\u00020\u0011H\u0002J\u0018\u0010/\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0004H\u0002J\u0010\u00101\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001e\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\bH\u0002J\u001c\u00104\u001a\u0004\u0018\u00010\u00112\b\u00105\u001a\u0004\u0018\u00010\u00112\u0006\u00103\u001a\u00020\bH\u0002J(\u00106\u001a\u0004\u0018\u00010\u00112\b\u00105\u001a\u0004\u0018\u00010\u00112\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020908H\u0002J\u0010\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u00020\u0004H\u0002J\u0010\u0010<\u001a\u0002092\u0006\u0010\u001d\u001a\u00020\u0011H\u0002J\u0010\u0010=\u001a\u0002092\u0006\u0010-\u001a\u00020\u0011H\u0002J\u0010\u0010>\u001a\u0002092\u0006\u0010;\u001a\u00020\bH\u0002J\u0018\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020CH\u0002J\u0018\u0010D\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u00112\u0006\u0010E\u001a\u00020\u0011H\u0002J\u0010\u0010F\u001a\u00020\b2\u0006\u0010;\u001a\u00020\bH\u0002J\u0010\u0010G\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\bH\u0002J\u0012\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010;\u001a\u00020\bH\u0002J\u0018\u0010J\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\bH\u0002J\u0017\u0010K\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¢\u0006\u0002\u0010LJ\u0018\u0010M\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\bH\u0002J$\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u0010\u0010P\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001f\u0010Q\u001a\u0004\u0018\u00010\u00042\u0006\u0010-\u001a\u00020\u00112\u0006\u0010R\u001a\u00020\bH\u0002¢\u0006\u0002\u0010SJ\u0010\u0010T\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010U\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\bJ4\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040W2\u0006\u0010-\u001a\u00020\u00112\u0006\u0010X\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u001bH\u0002J \u0010[\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bH\u0002J\u0010\u0010\\\u001a\u00020]2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010^\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bH\u0002J\u0010\u0010_\u001a\u00020C2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0017\u0010`\u001a\u0004\u0018\u00010\u00042\u0006\u0010-\u001a\u00020\u0011H\u0002¢\u0006\u0002\u0010LJ\u0010\u0010a\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0011H\u0002J\u0010\u0010b\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0011H\u0002J\u0017\u0010c\u001a\u0004\u0018\u00010\u00042\u0006\u0010-\u001a\u00020\u0011H\u0002¢\u0006\u0002\u0010LJ\u0017\u0010d\u001a\u0004\u0018\u00010\u00042\u0006\u0010-\u001a\u00020\u0011H\u0002¢\u0006\u0002\u0010LJ\u0018\u0010e\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u00112\u0006\u0010f\u001a\u00020\bH\u0002J \u0010g\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010h\u001a\u00020\u00112\u0006\u0010f\u001a\u00020\bH\u0002Jn\u0010i\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\b2\u0006\u0010f\u001a\u00020\b2\u0006\u0010j\u001a\u00020\b2\u0006\u0010k\u001a\u00020\b2\u0006\u0010l\u001a\u00020\b2\b\u0010m\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010n\u001a\u00020\u00042\b\u0010o\u001a\u0004\u0018\u00010\b2\u0006\u0010p\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u001b2\u0006\u0010q\u001a\u000209H\u0002J\u0018\u0010r\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J(\u0010s\u001a\u00020\b2\u0006\u0010t\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020\u001b2\u0006\u0010u\u001a\u00020\b2\u0006\u0010v\u001a\u00020\bH\u0002J\u0010\u0010w\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010x\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\b2\u0006\u0010;\u001a\u00020\bH\u0002J \u0010y\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u001b2\u0006\u0010u\u001a\u00020\b2\u0006\u0010v\u001a\u00020\bH\u0002J \u0010z\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u001b2\u0006\u0010u\u001a\u00020\b2\u0006\u0010v\u001a\u00020\u0004H\u0002J(\u0010{\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u001b2\u0006\u0010l\u001a\u00020\bH\u0002J \u0010|\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020C2\u0006\u0010}\u001a\u00020@H\u0002J \u0010~\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u00112\u0006\u0010\u007f\u001a\u00020\u0004H\u0002J\u0015\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00112\b\u0010(\u001a\u0004\u0018\u00010\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0084\u0001"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudXamlPatcher;", "", "()V", "ARMOR_PERCENT_FULL_WIDTH_FACTOR", "", "HP_PERCENT_FULL_WIDTH_FACTOR", "specById", "", "", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudXamlPatcher$ElementSpec;", "specs", "", "appendWidthBinding", "", "doc", "Lorg/w3c/dom/Document;", TypedValues.AttributesType.S_TARGET, "Lorg/w3c/dom/Element;", "path", InAppViewConstants.MAX_WIDTH, "applyColorOverrides", "id", "colors", "applyDailyCase", "patch", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudPatch;", "applyElementPatch", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudElementPatch;", "applyMoneyBackground", "money", "applyMoneyBlock", "applyPatch", "xaml", "applyRadarBarsShape", "applyRadarIcon", "elementId", "xName", "visibleBinding", "applyRadarShape", "applyWeaponBackground", "weapon", "size", "barFrameName", "progressName", "clearChildren", "element", "directChildren", "editorWidthFromBoundWidth", "boundWidth", "ensureNoesisNamespace", "findByXName", "name", "findDescendantByXName", "root", "findFirstDescendant", "predicate", "Lkotlin/Function1;", "", "fmt", "value", "isMoneyBackgroundTransparent", "isRootOverlay", "isTransparentColor", "mapMetrics", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudXamlPatcher$MapMetrics;", "radar", "shape", "Lcom/blackhub/bronline/neizzir/gui/editor/RadarShape;", "moveElement", "newParent", "normalizeColor", "parse", "parseThickness", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudXamlPatcher$Thickness;", "radarBarColorAttr", "readBoundWidth", "(Lorg/w3c/dom/Element;)Ljava/lang/Float;", "readBrushColor", "propertyTag", "readColors", "readDailyCaseElement", "readFloat", "attr", "(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/Float;", "readMoneyBlockElement", "readPatch", "readPosition", "Lkotlin/Pair;", InAppViewConstants.WIDTH, InAppViewConstants.HEIGHT, "default", "readRadarBarElement", "readRadarBarsShape", "Lcom/blackhub/bronline/neizzir/gui/editor/RadarBarsShape;", "readRadarIconElement", "readRadarShape", "readScale", "readWeaponBackground", "readWeaponBorder", "readWeaponBorderWidth", "readWeaponRadius", "removePropertyChild", "tagName", "replaceElement", "current", "replaceRadarProgress", "colorAttr", "color", "visibility", "widthBindingPath", "widthScaleSourceFull", "trimEnd", InAppViewConstants.MARGIN, "rootOverlay", "resizeWeaponContent", "resolveBarColor", "bar", "key", Other.FALLBACK, "serialize", "setHudImageVisibility", "styleColor", "styleFloat", "upsertBarFrame", "upsertMapBorder", "metrics", "upsertScaleTransform", "scale", "weaponBackgroundElement", "ElementSpec", "MapMetrics", "Thickness", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class GuiHudXamlPatcher {
    private static final float ARMOR_PERCENT_FULL_WIDTH_FACTOR = 0.13f;
    private static final float HP_PERCENT_FULL_WIDTH_FACTOR = 0.14f;
    public static final GuiHudXamlPatcher INSTANCE = new GuiHudXamlPatcher();
    private static final Map<String, ElementSpec> specById;
    private static final List<ElementSpec> specs;

    /* JADX INFO: compiled from: GuiHudXamlPatcher.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RadarShape.values().length];
            try {
                iArr[RadarShape.ROUND.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[RadarShape.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[RadarShape.ROUNDED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RadarBarsShape.values().length];
            try {
                iArr2[RadarBarsShape.CURVED.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr2[RadarBarsShape.STRAIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private GuiHudXamlPatcher() {
    }

    /* JADX INFO: compiled from: GuiHudXamlPatcher.kt */
    @Metadata(m4415d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudXamlPatcher$ElementSpec;", "", "id", "", "xamlName", "forceFullSpan", "", "canMove", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getCanMove", "()Z", "getForceFullSpan", "getId", "()Ljava/lang/String;", "getXamlName", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final /* data */ class ElementSpec {
        private final boolean canMove;
        private final boolean forceFullSpan;
        private final String id;
        private final String xamlName;

        public static /* synthetic */ ElementSpec copy$default(ElementSpec elementSpec, String str, String str2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = elementSpec.id;
            }
            if ((i & 2) != 0) {
                str2 = elementSpec.xamlName;
            }
            if ((i & 4) != 0) {
                z = elementSpec.forceFullSpan;
            }
            if ((i & 8) != 0) {
                z2 = elementSpec.canMove;
            }
            return elementSpec.copy(str, str2, z, z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getXamlName() {
            return this.xamlName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getForceFullSpan() {
            return this.forceFullSpan;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getCanMove() {
            return this.canMove;
        }

        public final ElementSpec copy(String id, String xamlName, boolean forceFullSpan, boolean canMove) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(xamlName, "xamlName");
            return new ElementSpec(id, xamlName, forceFullSpan, canMove);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ElementSpec)) {
                return false;
            }
            ElementSpec elementSpec = (ElementSpec) other;
            return Intrinsics.areEqual(this.id, elementSpec.id) && Intrinsics.areEqual(this.xamlName, elementSpec.xamlName) && this.forceFullSpan == elementSpec.forceFullSpan && this.canMove == elementSpec.canMove;
        }

        public int hashCode() {
            return (((((this.id.hashCode() * 31) + this.xamlName.hashCode()) * 31) + Boolean.hashCode(this.forceFullSpan)) * 31) + Boolean.hashCode(this.canMove);
        }

        public String toString() {
            return "ElementSpec(id=" + this.id + ", xamlName=" + this.xamlName + ", forceFullSpan=" + this.forceFullSpan + ", canMove=" + this.canMove + ')';
        }

        public ElementSpec(String id, String xamlName, boolean forceFullSpan, boolean canMove) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(xamlName, "xamlName");
            this.id = id;
            this.xamlName = xamlName;
            this.forceFullSpan = forceFullSpan;
            this.canMove = canMove;
        }

        public /* synthetic */ ElementSpec(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z, (i & 8) != 0 ? true : z2);
        }

        public final String getId() {
            return this.id;
        }

        public final String getXamlName() {
            return this.xamlName;
        }

        public final boolean getForceFullSpan() {
            return this.forceFullSpan;
        }

        public final boolean getCanMove() {
            return this.canMove;
        }
    }

    /* JADX INFO: compiled from: GuiHudXamlPatcher.kt */
    @Metadata(m4415d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudXamlPatcher$Thickness;", "", TtmlNode.LEFT, "", InAppViewConstants.POSITION_TOP, TtmlNode.RIGHT, InAppViewConstants.POSITION_BOTTOM, "(FFFF)V", "getBottom", "()F", "getLeft", "getRight", "getTop", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final /* data */ class Thickness {
        private final float bottom;
        private final float left;
        private final float right;
        private final float top;

        public static /* synthetic */ Thickness copy$default(Thickness thickness, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = thickness.left;
            }
            if ((i & 2) != 0) {
                f2 = thickness.top;
            }
            if ((i & 4) != 0) {
                f3 = thickness.right;
            }
            if ((i & 8) != 0) {
                f4 = thickness.bottom;
            }
            return thickness.copy(f, f2, f3, f4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getLeft() {
            return this.left;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getTop() {
            return this.top;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getRight() {
            return this.right;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getBottom() {
            return this.bottom;
        }

        public final Thickness copy(float left, float top, float right, float bottom) {
            return new Thickness(left, top, right, bottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Thickness)) {
                return false;
            }
            Thickness thickness = (Thickness) other;
            return Float.compare(this.left, thickness.left) == 0 && Float.compare(this.top, thickness.top) == 0 && Float.compare(this.right, thickness.right) == 0 && Float.compare(this.bottom, thickness.bottom) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
        }

        public String toString() {
            return "Thickness(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ')';
        }

        public Thickness(float left, float top, float right, float bottom) {
            this.left = left;
            this.top = top;
            this.right = right;
            this.bottom = bottom;
        }

        public final float getLeft() {
            return this.left;
        }

        public final float getTop() {
            return this.top;
        }

        public final float getRight() {
            return this.right;
        }

        public final float getBottom() {
            return this.bottom;
        }
    }

    static {
        int i = 8;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z = true;
        boolean z2 = false;
        specs = CollectionsKt__CollectionsKt.listOf((Object[]) new ElementSpec[]{new ElementSpec(GuiHudElementIds.RADAR, GuiHudElementIds.RADAR, true, false, 8, null), new ElementSpec(GuiHudElementIds.CHAT, GuiHudElementIds.CHAT, true, false, 8, null), new ElementSpec(GuiHudElementIds.SPEEDOMETER, GuiHudElementIds.SPEEDOMETER, z, z2, i, defaultConstructorMarker), new ElementSpec(GuiHudElementIds.CROSSHAIR, GuiHudElementIds.CROSSHAIR, z, z2, i, defaultConstructorMarker), new ElementSpec(GuiHudElementIds.WEAPON, GuiHudElementIds.WEAPON, false, z2, i, defaultConstructorMarker)});
        Iterable $this$associateBy$iv = specs;
        int capacity$iv = RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$associateBy$iv, 10)), 16);
        Map destination$iv$iv = new LinkedHashMap(capacity$iv);
        for (Object element$iv$iv : $this$associateBy$iv) {
            ElementSpec it = (ElementSpec) element$iv$iv;
            destination$iv$iv.put(it.getId(), element$iv$iv);
        }
        specById = destination$iv$iv;
    }

    public final GuiHudPatch readPatch(String xaml) throws ParserConfigurationException, SAXException, IOException {
        Intrinsics.checkNotNullParameter(xaml, "xaml");
        Document doc = parse(xaml);
        Iterable $this$map$iv = specs;
        int $i$f$map = 0;
        Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            ElementSpec spec = (ElementSpec) item$iv$iv;
            GuiHudElementPatch guiHudElementPatchElement = GuiHudDefaults.INSTANCE.element(spec.getId());
            Element element = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) INSTANCE.findByXName(doc, spec.getXamlName()));
            if (element != null) {
                Float f = INSTANCE.readFloat(element, HttpHeaders.WIDTH);
                float width = f != null ? f.floatValue() : guiHudElementPatchElement.getWidth();
                Float f2 = INSTANCE.readFloat(element, "Height");
                float height = f2 != null ? f2.floatValue() : guiHudElementPatchElement.getHeight();
                Float scale = INSTANCE.readScale(element);
                float scale2 = scale != null ? scale.floatValue() : guiHudElementPatchElement.getScale();
                Pair<Float, Float> position = INSTANCE.readPosition(element, width, height, guiHudElementPatchElement);
                guiHudElementPatchElement = guiHudElementPatchElement.copy((71 & 1) != 0 ? guiHudElementPatchElement.id : null, (71 & 2) != 0 ? guiHudElementPatchElement.x : position.getFirst().floatValue(), (71 & 4) != 0 ? guiHudElementPatchElement.y : position.getSecond().floatValue(), (71 & 8) != 0 ? guiHudElementPatchElement.width : width, (71 & 16) != 0 ? guiHudElementPatchElement.height : height, (71 & 32) != 0 ? guiHudElementPatchElement.scale : scale2, (71 & 64) != 0 ? guiHudElementPatchElement.visible : !Intrinsics.areEqual(element.getAttribute("Visibility"), "Collapsed"), (71 & 128) != 0 ? guiHudElementPatchElement.colorOverrides : MapsKt__MapsKt.plus(guiHudElementPatchElement.getColorOverrides(), INSTANCE.readColors(doc, spec.getId())));
            }
            destination$iv$iv.add(guiHudElementPatchElement);
            $this$map$iv = $this$map$iv;
            $i$f$map = $i$f$map;
        }
        List current = CollectionsKt___CollectionsKt.plus((Collection<? extends GuiHudElementPatch>) ((Collection<? extends Object>) CollectionsKt___CollectionsKt.plus((Collection<? extends GuiHudElementPatch>) ((Collection<? extends Object>) CollectionsKt___CollectionsKt.plus((Collection<? extends GuiHudElementPatch>) ((Collection<? extends Object>) CollectionsKt___CollectionsKt.plus((Collection<? extends GuiHudElementPatch>) ((Collection<? extends Object>) CollectionsKt___CollectionsKt.plus((Collection<? extends GuiHudElementPatch>) ((Collection<? extends Object>) CollectionsKt___CollectionsKt.plus((Collection<? extends GuiHudElementPatch>) ((Collection<? extends Object>) ((List) destination$iv$iv)), readRadarBarElement(doc, GuiHudElementIds.HP_BAR, GuiHudElementIds.HP_BAR))), readRadarBarElement(doc, GuiHudElementIds.ARMOR_BAR, GuiHudElementIds.ARMOR_BAR))), readRadarIconElement(doc, GuiHudElementIds.HP_ICON, GuiHudElementIds.HP_ICON))), readRadarIconElement(doc, GuiHudElementIds.ARMOR_ICON, GuiHudElementIds.ARMOR_ICON))), readMoneyBlockElement(doc))), readDailyCaseElement(doc));
        return GuiHudDefaults.INSTANCE.normalize(new GuiHudPatch(readRadarShape(doc), readRadarBarsShape(doc), current));
    }

    public final String applyPatch(String xaml, GuiHudPatch patch) throws ParserConfigurationException, SAXException, IOException {
        Intrinsics.checkNotNullParameter(xaml, "xaml");
        Intrinsics.checkNotNullParameter(patch, "patch");
        Document doc = parse(xaml);
        GuiHudPatch normalized = GuiHudDefaults.INSTANCE.normalize(patch);
        Iterable $this$forEach$iv = normalized.getElements();
        for (Object element$iv : $this$forEach$iv) {
            GuiHudElementPatch elementPatch = (GuiHudElementPatch) element$iv;
            if (!Intrinsics.areEqual(elementPatch.getId(), GuiHudElementIds.HP_BAR) && !Intrinsics.areEqual(elementPatch.getId(), GuiHudElementIds.ARMOR_BAR) && !Intrinsics.areEqual(elementPatch.getId(), GuiHudElementIds.HP_ICON) && !Intrinsics.areEqual(elementPatch.getId(), GuiHudElementIds.ARMOR_ICON) && !Intrinsics.areEqual(elementPatch.getId(), GuiHudElementIds.MONEY_VALUE) && !Intrinsics.areEqual(elementPatch.getId(), GuiHudElementIds.DAILY_CASE)) {
                INSTANCE.applyElementPatch(doc, elementPatch);
            }
        }
        applyRadarShape(doc, normalized);
        applyRadarBarsShape(doc, normalized);
        applyRadarIcon(doc, normalized, GuiHudElementIds.HP_ICON, GuiHudElementIds.HP_ICON, "{Binding HealthVisible, Converter={StaticResource VisibilityConverter}}");
        applyRadarIcon(doc, normalized, GuiHudElementIds.ARMOR_ICON, GuiHudElementIds.ARMOR_ICON, "{Binding ArmorVisible, Converter={StaticResource VisibilityConverter}}");
        applyMoneyBlock(doc, normalized);
        applyDailyCase(doc, normalized);
        return serialize(doc);
    }

    private final void applyElementPatch(Document doc, GuiHudElementPatch patch) {
        ElementSpec spec = specById.get(patch.getId());
        if (spec == null) {
            return;
        }
        List<Element> listFindByXName = findByXName(doc, spec.getXamlName());
        if (listFindByXName.isEmpty()) {
            return;
        }
        Element element = (Element) CollectionsKt___CollectionsKt.last((List) listFindByXName);
        if (Intrinsics.areEqual(patch.getId(), GuiHudElementIds.WEAPON)) {
            Element documentElement = (Element) CollectionsKt___CollectionsKt.firstOrNull((List) findByXName(doc, "Content"));
            if (documentElement == null) {
                documentElement = doc.getDocumentElement();
            }
            Intrinsics.checkNotNull(documentElement);
            moveElement(element, documentElement);
            element.setAttribute("DataContext", "{Binding Radar}");
        }
        if (patch.getVisible()) {
            if (Intrinsics.areEqual(element.getAttribute("Visibility"), "Collapsed")) {
                element.removeAttribute("Visibility");
            }
        } else {
            element.setAttribute("Visibility", "Collapsed");
        }
        if (spec.getCanMove()) {
            element.setAttribute("HorizontalAlignment", "Left");
            element.setAttribute("VerticalAlignment", "Top");
            element.setAttribute("Margin", fmt(patch.getX()) + AbstractJsonLexerKt.COMMA + fmt(patch.getY()) + ",0,0");
            element.setAttribute(HttpHeaders.WIDTH, fmt(patch.getWidth()));
            element.setAttribute("Height", fmt(patch.getHeight()));
            if (spec.getForceFullSpan()) {
                element.setAttribute("Grid.Column", CommonUrlParts.Values.FALSE_INTEGER);
                element.setAttribute("Grid.Row", CommonUrlParts.Values.FALSE_INTEGER);
                element.setAttribute("Grid.ColumnSpan", "3");
                element.setAttribute("Grid.RowSpan", "3");
            }
        }
        if (Intrinsics.areEqual(patch.getId(), GuiHudElementIds.WEAPON)) {
            resizeWeaponContent(element, patch);
        }
        if (!(patch.getScale() == 1.0f) || Intrinsics.areEqual(patch.getId(), GuiHudElementIds.SPEEDOMETER)) {
            upsertScaleTransform(doc, element, patch.getScale());
        }
        applyColorOverrides(doc, patch.getId(), patch.getColorOverrides());
    }

    private final Pair<Float, Float> readPosition(Element element, float width, float height, GuiHudElementPatch guiHudElementPatch) {
        float colStart;
        float left;
        float top;
        String attribute = element.getAttribute("Margin");
        Intrinsics.checkNotNullExpressionValue(attribute, "getAttribute(...)");
        Thickness margin = parseThickness(attribute);
        if (margin == null) {
            return TuplesKt.m4423to(Float.valueOf(guiHudElementPatch.getX()), Float.valueOf(guiHudElementPatch.getY()));
        }
        String attribute2 = element.getAttribute("Grid.Column");
        Intrinsics.checkNotNullExpressionValue(attribute2, "getAttribute(...)");
        Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(attribute2);
        float f = 0.0f;
        switch (intOrNull != null ? intOrNull.intValue() : 0) {
            case 1:
                colStart = 340.0f;
                break;
            case 2:
                colStart = 1440.0f;
                break;
            default:
                colStart = 0.0f;
                break;
        }
        String attribute3 = element.getAttribute("Grid.Row");
        Intrinsics.checkNotNullExpressionValue(attribute3, "getAttribute(...)");
        Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(attribute3);
        switch (intOrNull2 != null ? intOrNull2.intValue() : 0) {
            case 1:
                f = 320.0f;
                break;
            case 2:
                f = 760.0f;
                break;
        }
        float rowStart = f;
        String attribute4 = element.getAttribute("HorizontalAlignment");
        if (Intrinsics.areEqual(attribute4, "Right")) {
            left = (1920.0f - margin.getRight()) - width;
        } else {
            left = Intrinsics.areEqual(attribute4, "Center") ? (((1920.0f - width) / 2.0f) + margin.getLeft()) - margin.getRight() : colStart + margin.getLeft();
        }
        float x = left;
        String attribute5 = element.getAttribute("VerticalAlignment");
        if (Intrinsics.areEqual(attribute5, "Bottom")) {
            top = (1080.0f - margin.getBottom()) - height;
        } else {
            top = Intrinsics.areEqual(attribute5, "Center") ? (((1080.0f - height) / 2.0f) + margin.getTop()) - margin.getBottom() : rowStart + margin.getTop();
        }
        float y = top;
        return TuplesKt.m4423to(Float.valueOf(x), Float.valueOf(y));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Map<String, String> readColors(Document doc, String id) {
        String str;
        String it;
        String it2;
        Element element;
        String it3;
        Element elementFindDescendantByXName;
        String it4;
        LinkedHashMap result = new LinkedHashMap();
        switch (id.hashCode()) {
            case -1707954628:
                if (id.equals(GuiHudElementIds.WEAPON)) {
                    Element weapon = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, GuiHudElementIds.WEAPON));
                    Element background = weaponBackgroundElement(weapon);
                    if (background != null) {
                        String backgroundColor = readWeaponBackground(background);
                        LinkedHashMap linkedHashMap = result;
                        String tagName = background.getTagName();
                        if (Intrinsics.areEqual(tagName, "Rectangle") ? true : Intrinsics.areEqual(tagName, "Border")) {
                            Float weaponRadius = readWeaponRadius(background);
                            str = (weaponRadius != null ? weaponRadius.floatValue() : 0.0f) > 0.0f ? "rounded" : "square";
                        } else {
                            str = "round";
                        }
                        linkedHashMap.put("shape", str);
                        if (!StringsKt__StringsKt.isBlank(backgroundColor)) {
                            result.put("backgroundVisible", isTransparentColor(backgroundColor) ? CommonUrlParts.Values.FALSE_INTEGER : "1");
                            result.put("background", backgroundColor);
                        }
                        String it5 = readWeaponBorder(background);
                        it = StringsKt__StringsKt.isBlank(it5) ? null : it5;
                        if (it != null) {
                            result.put("border", it);
                        }
                        Float weaponBorderWidth = readWeaponBorderWidth(background);
                        if (weaponBorderWidth != null) {
                            result.put("borderWidth", INSTANCE.fmt(weaponBorderWidth.floatValue()));
                        }
                        Float weaponRadius2 = readWeaponRadius(background);
                        if (weaponRadius2 != null) {
                            result.put(InAppViewConstants.RADIUS, INSTANCE.fmt(weaponRadius2.floatValue()));
                        }
                    }
                }
                break;
            case 78717670:
                if (id.equals(GuiHudElementIds.RADAR)) {
                    Element target = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, GuiHudElementIds.HP_BAR));
                    if (target != null) {
                        String it6 = target.getAttribute("Stroke");
                        Intrinsics.checkNotNull(it6);
                        if (StringsKt__StringsKt.isBlank(it6)) {
                            it6 = null;
                        }
                        if (it6 == null) {
                            it6 = target.getAttribute("Fill");
                            Intrinsics.checkNotNull(it6);
                            if (StringsKt__StringsKt.isBlank(it6)) {
                                it6 = null;
                            }
                        }
                        if (it6 != null) {
                            result.put("hp", it6);
                        }
                    }
                    Element target2 = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, GuiHudElementIds.ARMOR_BAR));
                    if (target2 != null) {
                        String it7 = target2.getAttribute("Stroke");
                        Intrinsics.checkNotNull(it7);
                        if (StringsKt__StringsKt.isBlank(it7)) {
                            it7 = null;
                        }
                        if (it7 == null) {
                            it7 = target2.getAttribute("Fill");
                            Intrinsics.checkNotNull(it7);
                            if (StringsKt__StringsKt.isBlank(it7)) {
                                it7 = null;
                            }
                        }
                        if (it7 != null) {
                            result.put("armor", it7);
                        }
                    }
                    Element element2 = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, "MapBorder"));
                    if (element2 != null && (it2 = element2.getAttribute("Stroke")) != null) {
                        it = StringsKt__StringsKt.isBlank(it2) ? null : it2;
                        if (it != null) {
                            result.put("border", it);
                        }
                    }
                }
                break;
            case 396953549:
                if (id.equals(GuiHudElementIds.MONEY_VALUE) && (element = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, "MoneyValue"))) != null && (it3 = element.getAttribute("Foreground")) != null) {
                    it = StringsKt__StringsKt.isBlank(it3) ? null : it3;
                    if (it != null) {
                        result.put("money", it);
                    }
                }
                break;
            case 1656962810:
                if (id.equals(GuiHudElementIds.SPEEDOMETER) && (elementFindDescendantByXName = findDescendantByXName((Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, GuiHudElementIds.SPEEDOMETER)), "SpeedProgressFill")) != null && (it4 = elementFindDescendantByXName.getAttribute("Stroke")) != null) {
                    it = StringsKt__StringsKt.isBlank(it4) ? null : it4;
                    if (it != null) {
                        result.put("speed", it);
                    }
                }
                break;
        }
        return result;
    }

    private final Element weaponBackgroundElement(Element weapon) {
        Object obj = null;
        if (weapon == null) {
            return null;
        }
        Element it = findDescendantByXName(weapon, "WeaponBackground");
        if (it != null) {
            return it;
        }
        Element it2 = findDescendantByXName(weapon, "WeaponBg");
        if (it2 != null) {
            return it2;
        }
        Element it3 = findDescendantByXName(weapon, "WeaponBorder");
        if (it3 != null) {
            return it3;
        }
        Iterable $this$firstOrNull$iv = directChildren(weapon);
        for (Object element$iv : $this$firstOrNull$iv) {
            Element element = (Element) element$iv;
            if (Intrinsics.areEqual(element.getTagName(), "Border") || Intrinsics.areEqual(element.getTagName(), "Ellipse") || Intrinsics.areEqual(element.getTagName(), "Rectangle")) {
                obj = element$iv;
                break;
            }
        }
        return (Element) obj;
    }

    private final boolean isTransparentColor(String value) {
        String color = StringsKt__StringsKt.trim((CharSequence) value).toString();
        if (StringsKt__StringsKt.isBlank(color) || StringsKt__StringsJVMKt.equals(color, "Transparent", true)) {
            return true;
        }
        String hex = StringsKt__StringsKt.removePrefix(color, (CharSequence) "#");
        if (hex.length() != 8) {
            return false;
        }
        String strSubstring = hex.substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return StringsKt__StringsJVMKt.equals(strSubstring, "00", true);
    }

    private final String readWeaponBackground(Element element) {
        String attr = Intrinsics.areEqual(element.getTagName(), "Border") ? element.getAttribute("Background") : element.getAttribute("Fill");
        Intrinsics.checkNotNull(attr);
        if (StringsKt__StringsKt.isBlank(attr)) {
            return Intrinsics.areEqual(element.getTagName(), "Border") ? readBrushColor(element, "Border.Background") : readBrushColor(element, element.getTagName() + ".Fill");
        }
        return attr;
    }

    private final String readWeaponBorder(Element element) {
        String attr = Intrinsics.areEqual(element.getTagName(), "Border") ? element.getAttribute("BorderBrush") : element.getAttribute("Stroke");
        Intrinsics.checkNotNull(attr);
        if (StringsKt__StringsKt.isBlank(attr)) {
            return Intrinsics.areEqual(element.getTagName(), "Border") ? readBrushColor(element, "Border.BorderBrush") : readBrushColor(element, element.getTagName() + ".Stroke");
        }
        return attr;
    }

    private final Float readWeaponBorderWidth(Element element) {
        if (Intrinsics.areEqual(element.getTagName(), "Border")) {
            String attribute = element.getAttribute("BorderThickness");
            Intrinsics.checkNotNullExpressionValue(attribute, "getAttribute(...)");
            Thickness thickness = parseThickness(attribute);
            if (thickness != null) {
                return Float.valueOf(ComparisonsKt___ComparisonsJvmKt.maxOf(thickness.getLeft(), thickness.getTop(), thickness.getRight(), thickness.getBottom()));
            }
            return null;
        }
        return readFloat(element, "StrokeThickness");
    }

    private final Float readWeaponRadius(Element element) {
        String string;
        String tagName = element.getTagName();
        if (tagName == null) {
            return null;
        }
        switch (tagName) {
            case "Rectangle":
                Float f = readFloat(element, "RadiusX");
                return f == null ? readFloat(element, "RadiusY") : f;
            case "Ellipse":
                if (!tagName.equals("Ellipse")) {
                }
                return null;
            case "Border":
                String value = element.getAttribute("CornerRadius");
                Intrinsics.checkNotNull(value);
                Float floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(value);
                if (floatOrNull != null) {
                    return floatOrNull;
                }
                String str = (String) CollectionsKt___CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default((CharSequence) value, new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, (Object) null));
                if (str == null || (string = StringsKt__StringsKt.trim((CharSequence) str).toString()) == null) {
                    return null;
                }
                return StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string);
            default:
                return null;
        }
    }

    private final String readBrushColor(Element element, String propertyTag) {
        Object element$iv;
        Element brush;
        Iterable $this$firstOrNull$iv = directChildren(element);
        Iterator it = $this$firstOrNull$iv.iterator();
        do {
            if (!it.hasNext()) {
                element$iv = null;
                break;
            }
            element$iv = it.next();
        } while (!Intrinsics.areEqual(((Element) element$iv).getTagName(), propertyTag));
        Element property = (Element) element$iv;
        if (property == null || (brush = (Element) CollectionsKt___CollectionsKt.firstOrNull((List) directChildren(property))) == null) {
            return "";
        }
        String it2 = brush.getAttribute("Color");
        Intrinsics.checkNotNull(it2);
        if (StringsKt__StringsKt.isBlank(it2)) {
            it2 = null;
        }
        if (it2 != null) {
            return it2;
        }
        String it3 = brush.getAttribute("Color1");
        Intrinsics.checkNotNull(it3);
        String str = StringsKt__StringsKt.isBlank(it3) ? null : it3;
        return str == null ? "" : str;
    }

    private static final void applyColorOverrides$set(Document $doc, String xName, String attr, String value) {
        Element target;
        String str = value;
        if ((str == null || StringsKt__StringsKt.isBlank(str)) || (target = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) INSTANCE.findByXName($doc, xName))) == null) {
            return;
        }
        target.setAttribute(attr, INSTANCE.normalizeColor(value));
        INSTANCE.removePropertyChild(target, target.getTagName() + '.' + attr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void applyColorOverrides(Document doc, String id, Map<String, String> colors) {
        switch (id.hashCode()) {
            case 78717670:
                if (id.equals(GuiHudElementIds.RADAR)) {
                    applyColorOverrides$set(doc, GuiHudElementIds.HP_BAR, radarBarColorAttr(doc, GuiHudElementIds.HP_BAR), colors.get("hp"));
                    applyColorOverrides$set(doc, GuiHudElementIds.ARMOR_BAR, radarBarColorAttr(doc, GuiHudElementIds.ARMOR_BAR), colors.get("armor"));
                    applyColorOverrides$set(doc, "MapBorder", "Stroke", colors.get("border"));
                    break;
                }
                break;
            case 396953549:
                if (id.equals(GuiHudElementIds.MONEY_VALUE)) {
                    applyColorOverrides$set(doc, "MoneyValue", "Foreground", colors.get("money"));
                    break;
                }
                break;
            case 1656962810:
                if (id.equals(GuiHudElementIds.SPEEDOMETER)) {
                    Element speedometer = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, GuiHudElementIds.SPEEDOMETER));
                    Element target = findDescendantByXName(speedometer, "SpeedProgressFill");
                    String color = colors.get("speed");
                    if (target != null) {
                        String str = color;
                        if (!(str == null || StringsKt__StringsKt.isBlank(str))) {
                            target.setAttribute("Stroke", normalizeColor(color));
                            removePropertyChild(target, target.getTagName() + ".Stroke");
                        }
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0114  */
    private final GuiHudElementPatch readRadarBarElement(Document doc, String id, String xName) {
        String strFmt;
        GuiHudElementPatch guiHudElementPatchElement = GuiHudDefaults.INSTANCE.element(id);
        Element target = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, xName));
        if (target == null) {
            return guiHudElementPatchElement;
        }
        Element frame = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, barFrameName(xName)));
        Float boundWidth = readBoundWidth(target);
        Map mapEmptyMap = null;
        Float boundWidth2 = boundWidth != null ? Float.valueOf(INSTANCE.editorWidthFromBoundWidth(id, boundWidth.floatValue())) : null;
        Float f = readFloat(frame == null ? target : frame, HttpHeaders.WIDTH);
        float width = (f == null && (f = readFloat(target, HttpHeaders.WIDTH)) == null) ? boundWidth2 != null ? boundWidth2.floatValue() : guiHudElementPatchElement.getWidth() : f.floatValue();
        Float f2 = readFloat(frame == null ? target : frame, "Height");
        float height = (f2 == null && (f2 = readFloat(target, "Height")) == null) ? guiHudElementPatchElement.getHeight() : f2.floatValue();
        Pair<Float, Float> position = readPosition(frame == null ? target : frame, width, height, guiHudElementPatchElement);
        String it = target.getAttribute("Fill");
        Intrinsics.checkNotNull(it);
        if (StringsKt__StringsKt.isBlank(it)) {
            it = null;
        }
        if (it == null) {
            it = target.getAttribute("Stroke");
            Intrinsics.checkNotNull(it);
            if (StringsKt__StringsKt.isBlank(it)) {
                it = null;
            }
        }
        String color = it;
        String key = Intrinsics.areEqual(id, GuiHudElementIds.HP_BAR) ? "hp" : "armor";
        if (frame != null) {
            Pair[] pairArr = new Pair[4];
            pairArr[0] = TuplesKt.m4423to("background", frame.getAttribute("Fill"));
            pairArr[1] = TuplesKt.m4423to("border", frame.getAttribute("Stroke"));
            Float f3 = INSTANCE.readFloat(frame, "StrokeThickness");
            String str = "";
            if (f3 != null) {
                GuiHudXamlPatcher guiHudXamlPatcher = INSTANCE;
                float p0 = f3.floatValue();
                strFmt = guiHudXamlPatcher.fmt(p0);
                if (strFmt == null) {
                    strFmt = "";
                }
            } else {
                strFmt = "";
            }
            pairArr[2] = TuplesKt.m4423to("borderWidth", strFmt);
            Float f4 = INSTANCE.readFloat(frame, "RadiusX");
            if (f4 != null) {
                GuiHudXamlPatcher guiHudXamlPatcher2 = INSTANCE;
                float p1 = f4.floatValue();
                String strFmt2 = guiHudXamlPatcher2.fmt(p1);
                if (strFmt2 != null) {
                    str = strFmt2;
                }
            }
            pairArr[3] = TuplesKt.m4423to(InAppViewConstants.RADIUS, str);
            Map $this$filterValues$iv = MapsKt__MapsKt.mapOf(pairArr);
            LinkedHashMap result$iv = new LinkedHashMap();
            for (Map.Entry entry$iv : $this$filterValues$iv.entrySet()) {
                String value = (String) entry$iv.getValue();
                Intrinsics.checkNotNull(value);
                if (!StringsKt__StringsKt.isBlank(value)) {
                    result$iv.put(entry$iv.getKey(), entry$iv.getValue());
                }
            }
            mapEmptyMap = result$iv;
        }
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt__MapsKt.emptyMap();
        }
        Map style = mapEmptyMap;
        String str2 = color;
        return guiHudElementPatchElement.copy((71 & 1) != 0 ? guiHudElementPatchElement.id : null, (71 & 2) != 0 ? guiHudElementPatchElement.x : position.getFirst().floatValue(), (71 & 4) != 0 ? guiHudElementPatchElement.y : position.getSecond().floatValue(), (71 & 8) != 0 ? guiHudElementPatchElement.width : width, (71 & 16) != 0 ? guiHudElementPatchElement.height : height, (71 & 32) != 0 ? guiHudElementPatchElement.scale : 0.0f, (71 & 64) != 0 ? guiHudElementPatchElement.visible : !Intrinsics.areEqual(target.getAttribute("Visibility"), "Collapsed"), (71 & 128) != 0 ? guiHudElementPatchElement.colorOverrides : MapsKt__MapsKt.plus(MapsKt__MapsKt.plus(guiHudElementPatchElement.getColorOverrides(), style), str2 == null || StringsKt__StringsKt.isBlank(str2) ? MapsKt__MapsKt.emptyMap() : MapsKt__MapsJVMKt.mapOf(TuplesKt.m4423to(key, color))));
    }

    private final GuiHudElementPatch readRadarIconElement(Document doc, String id, String xName) {
        GuiHudElementPatch guiHudElementPatchElement = GuiHudDefaults.INSTANCE.element(id);
        Element target = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, xName));
        if (target == null) {
            return guiHudElementPatchElement;
        }
        if (!isRootOverlay(target)) {
            return guiHudElementPatchElement.copy((71 & 1) != 0 ? guiHudElementPatchElement.id : null, (71 & 2) != 0 ? guiHudElementPatchElement.x : 0.0f, (71 & 4) != 0 ? guiHudElementPatchElement.y : 0.0f, (71 & 8) != 0 ? guiHudElementPatchElement.width : 0.0f, (71 & 16) != 0 ? guiHudElementPatchElement.height : 0.0f, (71 & 32) != 0 ? guiHudElementPatchElement.scale : 0.0f, (71 & 64) != 0 ? guiHudElementPatchElement.visible : !Intrinsics.areEqual(target.getAttribute("Visibility"), "Collapsed"), (71 & 128) != 0 ? guiHudElementPatchElement.colorOverrides : null);
        }
        Float f = readFloat(target, HttpHeaders.WIDTH);
        float width = f != null ? f.floatValue() : guiHudElementPatchElement.getWidth();
        Float f2 = readFloat(target, "Height");
        float height = f2 != null ? f2.floatValue() : guiHudElementPatchElement.getHeight();
        Pair<Float, Float> position = readPosition(target, width, height, guiHudElementPatchElement);
        return guiHudElementPatchElement.copy((71 & 1) != 0 ? guiHudElementPatchElement.id : null, (71 & 2) != 0 ? guiHudElementPatchElement.x : position.getFirst().floatValue(), (71 & 4) != 0 ? guiHudElementPatchElement.y : position.getSecond().floatValue(), (71 & 8) != 0 ? guiHudElementPatchElement.width : width, (71 & 16) != 0 ? guiHudElementPatchElement.height : height, (71 & 32) != 0 ? guiHudElementPatchElement.scale : 0.0f, (71 & 64) != 0 ? guiHudElementPatchElement.visible : !Intrinsics.areEqual(target.getAttribute("Visibility"), "Collapsed"), (71 & 128) != 0 ? guiHudElementPatchElement.colorOverrides : null);
    }

    private final GuiHudElementPatch readMoneyBlockElement(Document doc) {
        GuiHudElementPatch guiHudElementPatchElement = GuiHudDefaults.INSTANCE.element(GuiHudElementIds.MONEY_VALUE);
        Element target = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, GuiHudElementIds.MONEY_VALUE));
        if (target == null) {
            return guiHudElementPatchElement;
        }
        Float f = readFloat(target, HttpHeaders.WIDTH);
        float width = f != null ? f.floatValue() : guiHudElementPatchElement.getWidth();
        Float f2 = readFloat(target, "Height");
        float height = f2 != null ? f2.floatValue() : guiHudElementPatchElement.getHeight();
        Pair<Float, Float> position = isRootOverlay(target) ? readPosition(target, width, height, guiHudElementPatchElement) : TuplesKt.m4423to(Float.valueOf(guiHudElementPatchElement.getX()), Float.valueOf(guiHudElementPatchElement.getY()));
        String backgroundVisible = isMoneyBackgroundTransparent(target) ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        return guiHudElementPatchElement.copy((71 & 1) != 0 ? guiHudElementPatchElement.id : null, (71 & 2) != 0 ? guiHudElementPatchElement.x : position.getFirst().floatValue(), (71 & 4) != 0 ? guiHudElementPatchElement.y : position.getSecond().floatValue(), (71 & 8) != 0 ? guiHudElementPatchElement.width : width, (71 & 16) != 0 ? guiHudElementPatchElement.height : height, (71 & 32) != 0 ? guiHudElementPatchElement.scale : 0.0f, (71 & 64) != 0 ? guiHudElementPatchElement.visible : !Intrinsics.areEqual(target.getAttribute("Visibility"), "Collapsed"), (71 & 128) != 0 ? guiHudElementPatchElement.colorOverrides : MapsKt__MapsKt.plus(MapsKt__MapsKt.plus(guiHudElementPatchElement.getColorOverrides(), MapsKt__MapsJVMKt.mapOf(TuplesKt.m4423to("backgroundVisible", backgroundVisible))), readColors(doc, GuiHudElementIds.MONEY_VALUE)));
    }

    private final boolean isMoneyBackgroundTransparent(Element money) {
        String background = money.getAttribute("Background");
        Intrinsics.checkNotNull(background);
        if (!StringsKt__StringsKt.isBlank(background)) {
            return isTransparentColor(background);
        }
        Iterable $this$none$iv = directChildren(money);
        if (($this$none$iv instanceof Collection) && ((Collection) $this$none$iv).isEmpty()) {
            return true;
        }
        for (Object element$iv : $this$none$iv) {
            Element it = (Element) element$iv;
            if (Intrinsics.areEqual(it.getTagName(), "Border.Background")) {
                return false;
            }
        }
        return true;
    }

    private final GuiHudElementPatch readDailyCaseElement(Document doc) {
        GuiHudElementPatch guiHudElementPatchElement = GuiHudDefaults.INSTANCE.element(GuiHudElementIds.DAILY_CASE);
        Element target = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, GuiHudElementIds.DAILY_CASE));
        if (target == null) {
            return guiHudElementPatchElement;
        }
        Float f = readFloat(target, HttpHeaders.WIDTH);
        float width = f != null ? f.floatValue() : guiHudElementPatchElement.getWidth();
        Float f2 = readFloat(target, "Height");
        float height = f2 != null ? f2.floatValue() : guiHudElementPatchElement.getHeight();
        Pair<Float, Float> position = isRootOverlay(target) ? readPosition(target, width, height, guiHudElementPatchElement) : TuplesKt.m4423to(Float.valueOf(guiHudElementPatchElement.getX()), Float.valueOf(guiHudElementPatchElement.getY()));
        return guiHudElementPatchElement.copy((71 & 1) != 0 ? guiHudElementPatchElement.id : null, (71 & 2) != 0 ? guiHudElementPatchElement.x : position.getFirst().floatValue(), (71 & 4) != 0 ? guiHudElementPatchElement.y : position.getSecond().floatValue(), (71 & 8) != 0 ? guiHudElementPatchElement.width : width, (71 & 16) != 0 ? guiHudElementPatchElement.height : height, (71 & 32) != 0 ? guiHudElementPatchElement.scale : 0.0f, (71 & 64) != 0 ? guiHudElementPatchElement.visible : !Intrinsics.areEqual(target.getAttribute("Visibility"), "Collapsed"), (71 & 128) != 0 ? guiHudElementPatchElement.colorOverrides : null);
    }

    private final boolean isRootOverlay(Element element) {
        Node parentNode = element.getParentNode();
        Element parent = parentNode instanceof Element ? (Element) parentNode : null;
        if (parent == null) {
            return false;
        }
        return Intrinsics.areEqual(parent.getAttribute("x:Name"), "Content") || Intrinsics.areEqual(parent.getAttribute("Name"), "Content");
    }

    private final Float readBoundWidth(Element target) {
        Object element$iv;
        List<String> groupValues;
        String str;
        String tagName;
        Iterable $this$firstOrNull$iv = directChildren(target);
        Iterator it = $this$firstOrNull$iv.iterator();
        do {
            if (it.hasNext()) {
                element$iv = it.next();
                Element it2 = (Element) element$iv;
                tagName = it2.getTagName();
                Intrinsics.checkNotNullExpressionValue(tagName, "getTagName(...)");
            } else {
                element$iv = null;
                break;
            }
        } while (!StringsKt__StringsJVMKt.endsWith$default(tagName, ".Width", false, 2, null));
        Element widthProperty = (Element) element$iv;
        if (widthProperty == null) {
            return null;
        }
        Node nodeItem = widthProperty.getElementsByTagName("noesis:MathConverter").item(0);
        Element converter = nodeItem instanceof Element ? (Element) nodeItem : null;
        if (converter == null) {
            return null;
        }
        String expression = converter.getAttribute("Expression");
        Regex regex = new Regex("\\*\\s*([0-9.]+)");
        Intrinsics.checkNotNull(expression);
        MatchResult matchResultFind$default = Regex.find$default(regex, expression, 0, 2, null);
        if (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null || (str = (String) CollectionsKt___CollectionsKt.getOrNull(groupValues, 1)) == null) {
            return null;
        }
        return StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(str);
    }

    private final float editorWidthFromBoundWidth(String id, float boundWidth) {
        if (Intrinsics.areEqual(id, GuiHudElementIds.HP_BAR)) {
            return HP_PERCENT_FULL_WIDTH_FACTOR * boundWidth;
        }
        return Intrinsics.areEqual(id, GuiHudElementIds.ARMOR_BAR) ? ARMOR_PERCENT_FULL_WIDTH_FACTOR * boundWidth : boundWidth;
    }

    private final RadarShape readRadarShape(Document doc) {
        Object obj;
        Element geometry;
        Element map = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, "Map"));
        if (map == null) {
            return RadarShape.ROUND;
        }
        Iterable $this$firstOrNull$iv = directChildren(map);
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object element$iv = it.next();
            Element it2 = (Element) element$iv;
            String tagName = it2.getTagName();
            Intrinsics.checkNotNullExpressionValue(tagName, "getTagName(...)");
            if (StringsKt__StringsJVMKt.endsWith$default(tagName, ".Clip", false, 2, null)) {
                obj = element$iv;
                break;
            }
        }
        Element clip = (Element) obj;
        if (clip != null && (geometry = (Element) CollectionsKt___CollectionsKt.firstOrNull((List) directChildren(clip))) != null) {
            if (Intrinsics.areEqual(geometry.getTagName(), "RectangleGeometry")) {
                Float f = readFloat(geometry, "RadiusX");
                float radiusX = f != null ? f.floatValue() : 0.0f;
                Float f2 = readFloat(geometry, "RadiusY");
                float radiusY = f2 != null ? f2.floatValue() : 0.0f;
                return (radiusX > 0.0f || radiusY > 0.0f) ? RadarShape.ROUNDED : RadarShape.SQUARE;
            }
            return RadarShape.ROUND;
        }
        return RadarShape.ROUND;
    }

    /* JADX INFO: compiled from: GuiHudXamlPatcher.kt */
    @Metadata(m4415d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiHudXamlPatcher$MapMetrics;", "", TtmlNode.LEFT, "", InAppViewConstants.POSITION_TOP, "size", InAppViewConstants.RADIUS, "(FFFF)V", "getLeft", "()F", "getRadius", "getSize", "getTop", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final /* data */ class MapMetrics {
        private final float left;
        private final float radius;
        private final float size;
        private final float top;

        public static /* synthetic */ MapMetrics copy$default(MapMetrics mapMetrics, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = mapMetrics.left;
            }
            if ((i & 2) != 0) {
                f2 = mapMetrics.top;
            }
            if ((i & 4) != 0) {
                f3 = mapMetrics.size;
            }
            if ((i & 8) != 0) {
                f4 = mapMetrics.radius;
            }
            return mapMetrics.copy(f, f2, f3, f4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getLeft() {
            return this.left;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getTop() {
            return this.top;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getRadius() {
            return this.radius;
        }

        public final MapMetrics copy(float left, float top, float size, float radius) {
            return new MapMetrics(left, top, size, radius);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MapMetrics)) {
                return false;
            }
            MapMetrics mapMetrics = (MapMetrics) other;
            return Float.compare(this.left, mapMetrics.left) == 0 && Float.compare(this.top, mapMetrics.top) == 0 && Float.compare(this.size, mapMetrics.size) == 0 && Float.compare(this.radius, mapMetrics.radius) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.size)) * 31) + Float.hashCode(this.radius);
        }

        public String toString() {
            return "MapMetrics(left=" + this.left + ", top=" + this.top + ", size=" + this.size + ", radius=" + this.radius + ')';
        }

        public MapMetrics(float left, float top, float size, float radius) {
            this.left = left;
            this.top = top;
            this.size = size;
            this.radius = radius;
        }

        public final float getLeft() {
            return this.left;
        }

        public final float getTop() {
            return this.top;
        }

        public final float getSize() {
            return this.size;
        }

        public final float getRadius() {
            return this.radius;
        }
    }

    private final void applyRadarShape(Document doc, GuiHudPatch patch) {
        Object obj;
        Object element$iv;
        GuiHudElementPatch it;
        Iterable $this$firstOrNull$iv = patch.getElements();
        Iterator it2 = $this$firstOrNull$iv.iterator();
        do {
            obj = null;
            if (!it2.hasNext()) {
                element$iv = null;
                break;
            } else {
                element$iv = it2.next();
                it = (GuiHudElementPatch) element$iv;
            }
        } while (!Intrinsics.areEqual(it.getId(), GuiHudElementIds.RADAR));
        GuiHudElementPatch guiHudElementPatchElement = (GuiHudElementPatch) element$iv;
        if (guiHudElementPatchElement == null) {
            guiHudElementPatchElement = GuiHudDefaults.INSTANCE.element(GuiHudElementIds.RADAR);
        }
        GuiHudElementPatch radar = guiHudElementPatchElement;
        RadarShape shape = patch.getRadarShape();
        MapMetrics metrics = mapMetrics(radar, shape);
        Element map = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, "Map"));
        if (map == null) {
            return;
        }
        Iterable $this$firstOrNull$iv2 = directChildren(map);
        for (Object element$iv2 : $this$firstOrNull$iv2) {
            Element it3 = (Element) element$iv2;
            String tagName = it3.getTagName();
            Intrinsics.checkNotNullExpressionValue(tagName, "getTagName(...)");
            GuiHudElementPatch radar2 = radar;
            if (StringsKt__StringsJVMKt.endsWith$default(tagName, ".Clip", false, 2, null)) {
                obj = element$iv2;
                break;
            }
            radar = radar2;
        }
        Element clip = (Element) obj;
        if (clip == null) {
            return;
        }
        while (clip.getFirstChild() != null) {
            clip.removeChild(clip.getFirstChild());
        }
        switch (WhenMappings.$EnumSwitchMapping$0[shape.ordinal()]) {
            case 1:
                Element ellipse = doc.createElement("EllipseGeometry");
                ellipse.setAttribute("Center", fmt(metrics.getLeft() + (metrics.getSize() / 2.0f)) + AbstractJsonLexerKt.COMMA + fmt(metrics.getTop() + (metrics.getSize() / 2.0f)));
                ellipse.setAttribute("RadiusY", fmt(metrics.getSize() / 2.0f));
                ellipse.setAttribute("RadiusX", fmt(metrics.getSize() / 2.0f));
                clip.appendChild(ellipse);
                upsertMapBorder(doc, RadarShape.ROUND, metrics);
                break;
            case 2:
            case 3:
                Element rect = doc.createElement("RectangleGeometry");
                rect.setAttribute("Rect", fmt(metrics.getLeft()) + AbstractJsonLexerKt.COMMA + fmt(metrics.getTop()) + AbstractJsonLexerKt.COMMA + fmt(metrics.getSize()) + AbstractJsonLexerKt.COMMA + fmt(metrics.getSize()));
                rect.setAttribute("RadiusX", fmt(metrics.getRadius()));
                rect.setAttribute("RadiusY", fmt(metrics.getRadius()));
                clip.appendChild(rect);
                upsertMapBorder(doc, shape, metrics);
                break;
        }
        Element mapContent = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, "MapContentControl"));
        if (mapContent != null) {
            mapContent.setAttribute(HttpHeaders.WIDTH, INSTANCE.fmt(metrics.getSize()));
            mapContent.setAttribute("Height", INSTANCE.fmt(metrics.getSize()));
            mapContent.setAttribute("HorizontalAlignment", "Center");
            mapContent.setAttribute("VerticalAlignment", "Center");
        }
    }

    private final MapMetrics mapMetrics(GuiHudElementPatch radar, RadarShape shape) {
        float size = RangesKt___RangesKt.coerceAtLeast(Math.min(radar.getWidth(), radar.getHeight()) * 0.7714286f, 40.0f);
        float left = (radar.getWidth() - size) / 2.0f;
        float top = (radar.getHeight() - size) / 2.0f;
        float radius = shape == RadarShape.ROUNDED ? ARMOR_PERCENT_FULL_WIDTH_FACTOR * size : 0.0f;
        return new MapMetrics(left, top, size, radius);
    }

    private final RadarBarsShape readRadarBarsShape(Document doc) {
        Element hp = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, GuiHudElementIds.HP_BAR));
        if (hp != null && Intrinsics.areEqual(hp.getTagName(), "Rectangle")) {
            return RadarBarsShape.STRAIGHT;
        }
        return RadarBarsShape.CURVED;
    }

    private final void applyRadarBarsShape(Document doc, GuiHudPatch patch) {
        Object obj;
        Object element$iv;
        Object element$iv2;
        GuiHudElementPatch it;
        GuiHudElementPatch it2;
        Iterable $this$firstOrNull$iv = patch.getElements();
        Iterator it3 = $this$firstOrNull$iv.iterator();
        do {
            obj = null;
            if (!it3.hasNext()) {
                element$iv = null;
                break;
            } else {
                element$iv = it3.next();
                it2 = (GuiHudElementPatch) element$iv;
            }
        } while (!Intrinsics.areEqual(it2.getId(), GuiHudElementIds.RADAR));
        GuiHudElementPatch guiHudElementPatchElement = (GuiHudElementPatch) element$iv;
        if (guiHudElementPatchElement == null) {
            guiHudElementPatchElement = GuiHudDefaults.INSTANCE.element(GuiHudElementIds.RADAR);
        }
        GuiHudElementPatch radar = guiHudElementPatchElement;
        Iterable $this$firstOrNull$iv2 = patch.getElements();
        Iterator it4 = $this$firstOrNull$iv2.iterator();
        do {
            if (!it4.hasNext()) {
                element$iv2 = null;
                break;
            } else {
                element$iv2 = it4.next();
                it = (GuiHudElementPatch) element$iv2;
            }
        } while (!Intrinsics.areEqual(it.getId(), GuiHudElementIds.HP_BAR));
        GuiHudElementPatch guiHudElementPatchElement2 = (GuiHudElementPatch) element$iv2;
        if (guiHudElementPatchElement2 == null) {
            guiHudElementPatchElement2 = GuiHudDefaults.INSTANCE.element(GuiHudElementIds.HP_BAR);
        }
        GuiHudElementPatch hp = guiHudElementPatchElement2;
        Iterable $this$firstOrNull$iv3 = patch.getElements();
        for (Object element$iv3 : $this$firstOrNull$iv3) {
            GuiHudElementPatch it5 = (GuiHudElementPatch) element$iv3;
            if (Intrinsics.areEqual(it5.getId(), GuiHudElementIds.ARMOR_BAR)) {
                obj = element$iv3;
                break;
            }
        }
        GuiHudElementPatch guiHudElementPatchElement3 = (GuiHudElementPatch) obj;
        if (guiHudElementPatchElement3 == null) {
            guiHudElementPatchElement3 = GuiHudDefaults.INSTANCE.element(GuiHudElementIds.ARMOR_BAR);
        }
        GuiHudElementPatch armor = guiHudElementPatchElement3;
        String hpColor = normalizeColor(resolveBarColor(hp, radar, "hp", "#FFFE4141"));
        String armorColor = normalizeColor(resolveBarColor(armor, radar, "armor", "#FF544BBF"));
        switch (WhenMappings.$EnumSwitchMapping$1[patch.getRadarBarsShape().ordinal()]) {
            case 1:
                setHudImageVisibility(doc, barFrameName(GuiHudElementIds.HP_BAR), "Collapsed");
                setHudImageVisibility(doc, barFrameName(GuiHudElementIds.ARMOR_BAR), "Collapsed");
                setHudImageVisibility(doc, "HpBar", "{Binding HealthVisible, Converter={StaticResource VisibilityConverter}}");
                setHudImageVisibility(doc, "ArmorBar", "{Binding ArmorVisible, Converter={StaticResource VisibilityConverter}}");
                replaceRadarProgress$default(this, doc, GuiHudElementIds.HP_BAR, "Ellipse", "Stroke", hpColor, "{Binding HealthVisible, Converter={StaticResource VisibilityConverter}}", null, 0.0f, "{Binding HpPercent}", "0,8,0,0", hp, false, 128, null);
                replaceRadarProgress$default(this, doc, GuiHudElementIds.ARMOR_BAR, "Ellipse", "Stroke", armorColor, "{Binding ArmorVisible, Converter={StaticResource VisibilityConverter}}", null, 0.0f, "{Binding ArmorPercent}", "10,0,0,8.6", armor, false, 128, null);
                break;
            case 2:
                ensureNoesisNamespace(doc);
                setHudImageVisibility(doc, "HpBar", "Collapsed");
                setHudImageVisibility(doc, "ArmorBar", "Collapsed");
                upsertBarFrame(doc, barFrameName(GuiHudElementIds.HP_BAR), hp, "{Binding HealthVisible, Converter={StaticResource VisibilityConverter}}");
                replaceRadarProgress(doc, GuiHudElementIds.HP_BAR, "Rectangle", "Fill", hpColor, "{Binding HealthVisible, Converter={StaticResource VisibilityConverter}}", "HpPercent", HP_PERCENT_FULL_WIDTH_FACTOR, null, fmt(hp.getX()) + AbstractJsonLexerKt.COMMA + fmt(hp.getY()) + ",0,0", hp, true);
                upsertBarFrame(doc, barFrameName(GuiHudElementIds.ARMOR_BAR), armor, "{Binding ArmorVisible, Converter={StaticResource VisibilityConverter}}");
                replaceRadarProgress(doc, GuiHudElementIds.ARMOR_BAR, "Rectangle", "Fill", armorColor, "{Binding ArmorVisible, Converter={StaticResource VisibilityConverter}}", "ArmorPercent", ARMOR_PERCENT_FULL_WIDTH_FACTOR, null, fmt(armor.getX()) + AbstractJsonLexerKt.COMMA + fmt(armor.getY()) + ",0,0", armor, true);
                break;
            default:
                break;
        }
    }

    private final String resolveBarColor(GuiHudElementPatch bar, GuiHudElementPatch radar, String key, String fallback) {
        String str = GuiHudDefaults.INSTANCE.element(bar.getId()).getColorOverrides().get(key);
        String own = bar.getColorOverrides().get(key);
        String radarColor = radar.getColorOverrides().get(key);
        String str2 = own;
        if ((str2 == null || StringsKt__StringsKt.isBlank(str2)) || Intrinsics.areEqual(own, str)) {
            String str3 = radarColor;
            if (!(str3 == null || StringsKt__StringsKt.isBlank(str3))) {
                return radarColor;
            }
            String str4 = own;
            if (str4 == null || StringsKt__StringsKt.isBlank(str4)) {
                return fallback;
            }
        }
        return own;
    }

    private final void upsertMapBorder(Document doc, RadarShape shape, MapMetrics metrics) {
        Element current = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, "MapBorder"));
        if (current == null) {
            return;
        }
        String targetTag = shape == RadarShape.ROUND ? "Ellipse" : "Rectangle";
        Element target = Intrinsics.areEqual(current.getTagName(), targetTag) ? current : replaceElement(doc, current, targetTag);
        clearChildren(target);
        target.setAttribute("x:Name", "MapBorder");
        String attribute = target.getAttribute("StrokeThickness");
        if (StringsKt__StringsKt.isBlank(attribute)) {
            attribute = "2";
        }
        target.setAttribute("StrokeThickness", attribute);
        String attribute2 = target.getAttribute("Stroke");
        if (StringsKt__StringsKt.isBlank(attribute2)) {
            attribute2 = Other.COLOR_DEFAULT_STRING;
        }
        target.setAttribute("Stroke", attribute2);
        target.setAttribute(HttpHeaders.WIDTH, fmt(metrics.getSize()));
        target.setAttribute("Height", fmt(metrics.getSize()));
        target.setAttribute("HorizontalAlignment", "Center");
        target.setAttribute("VerticalAlignment", "Center");
        target.removeAttribute("Visibility");
        target.removeAttribute("TrimEnd");
        target.removeAttribute("TrimStart");
        target.removeAttribute("TrimOffset");
        target.removeAttribute("Fill");
        if (shape == RadarShape.ROUND) {
            target.removeAttribute("RadiusX");
            target.removeAttribute("RadiusY");
        } else {
            target.setAttribute("RadiusX", fmt(metrics.getRadius()));
            target.setAttribute("RadiusY", fmt(metrics.getRadius()));
        }
    }

    private final void upsertBarFrame(Document doc, String xName, GuiHudElementPatch patch, String visibility) {
        Element content = (Element) CollectionsKt___CollectionsKt.firstOrNull((List) findByXName(doc, "Content"));
        if (content == null) {
            content = doc.getDocumentElement();
        }
        Element it = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, xName));
        if (it == null) {
            it = doc.createElement("Rectangle");
            it.setAttribute("x:Name", xName);
            content.appendChild(it);
        }
        Intrinsics.checkNotNull(it);
        Intrinsics.checkNotNull(content);
        moveElement(it, content);
        clearChildren(it);
        it.setAttribute("x:Name", xName);
        it.setAttribute("DataContext", "{Binding Radar}");
        it.setAttribute("HorizontalAlignment", "Left");
        it.setAttribute("VerticalAlignment", "Top");
        it.setAttribute("Margin", fmt(patch.getX()) + AbstractJsonLexerKt.COMMA + fmt(patch.getY()) + ",0,0");
        it.setAttribute(HttpHeaders.WIDTH, fmt(patch.getWidth()));
        it.setAttribute("Height", fmt(patch.getHeight()));
        it.setAttribute("RadiusX", fmt(styleFloat(patch, InAppViewConstants.RADIUS, 4.0f)));
        it.setAttribute("RadiusY", fmt(styleFloat(patch, InAppViewConstants.RADIUS, 4.0f)));
        String str = patch.getColorOverrides().get("background");
        if (str == null) {
            str = "#70000000";
        }
        it.setAttribute("Fill", normalizeColor(str));
        String str2 = patch.getColorOverrides().get("border");
        if (str2 == null) {
            str2 = "#00FFFFFF";
        }
        it.setAttribute("Stroke", normalizeColor(str2));
        it.setAttribute("StrokeThickness", fmt(styleFloat(patch, "borderWidth", 0.0f)));
        it.setAttribute("Visibility", patch.getVisible() ? visibility : "Collapsed");
    }

    static /* synthetic */ void replaceRadarProgress$default(GuiHudXamlPatcher guiHudXamlPatcher, Document document, String str, String str2, String str3, String str4, String str5, String str6, float f, String str7, String str8, GuiHudElementPatch guiHudElementPatch, boolean z, int i, Object obj) {
        float f2;
        if ((i & 128) == 0) {
            f2 = f;
        } else {
            f2 = 1.0f;
        }
        guiHudXamlPatcher.replaceRadarProgress(document, str, str2, str3, str4, str5, str6, f2, str7, str8, guiHudElementPatch, z);
    }

    private final void replaceRadarProgress(Document doc, String xName, String tagName, String colorAttr, String color, String visibility, String widthBindingPath, float widthScaleSourceFull, String trimEnd, String margin, GuiHudElementPatch patch, boolean rootOverlay) {
        String str;
        Element current = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, xName));
        if (current == null) {
            return;
        }
        Element target = Intrinsics.areEqual(current.getTagName(), tagName) ? current : replaceElement(doc, current, tagName);
        if (rootOverlay) {
            Element documentElement = (Element) CollectionsKt___CollectionsKt.firstOrNull((List) findByXName(doc, "Content"));
            if (documentElement == null) {
                documentElement = doc.getDocumentElement();
            }
            Intrinsics.checkNotNull(documentElement);
            moveElement(target, documentElement);
            target.setAttribute("DataContext", "{Binding Radar}");
        } else {
            Element parent = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, "HpAndArmor"));
            if (parent != null) {
                INSTANCE.moveElement(target, parent);
            }
            target.removeAttribute("DataContext");
        }
        clearChildren(target);
        target.setAttribute("x:Name", xName);
        target.setAttribute("Visibility", patch.getVisible() ? visibility : "Collapsed");
        target.setAttribute(colorAttr, color);
        float borderWidth = (Intrinsics.areEqual(tagName, "Rectangle") && rootOverlay) ? styleFloat(patch, "borderWidth", 0.0f) : 0.0f;
        float fillWidth = RangesKt___RangesKt.coerceAtLeast(patch.getWidth() - (borderWidth * 2.0f), 1.0f);
        float fillHeight = RangesKt___RangesKt.coerceAtLeast(patch.getHeight() - (2.0f * borderWidth), 1.0f);
        target.setAttribute("Height", Intrinsics.areEqual(tagName, "Rectangle") ? fmt(fillHeight) : "258");
        if (Intrinsics.areEqual(tagName, "Rectangle")) {
            target.removeAttribute(HttpHeaders.WIDTH);
        } else {
            target.setAttribute(HttpHeaders.WIDTH, "258");
        }
        target.setAttribute("HorizontalAlignment", "Left");
        target.setAttribute("VerticalAlignment", rootOverlay ? "Top" : "Bottom");
        if (Intrinsics.areEqual(tagName, "Rectangle") && rootOverlay) {
            str = fmt(patch.getX() + borderWidth) + AbstractJsonLexerKt.COMMA + fmt(patch.getY() + borderWidth) + ",0,0";
        } else {
            str = margin;
        }
        target.setAttribute("Margin", str);
        target.removeAttribute("Stroke");
        target.removeAttribute("Fill");
        target.setAttribute(colorAttr, color);
        target.removeAttribute("TrimEnd");
        target.removeAttribute("TrimOffset");
        target.removeAttribute("RadiusX");
        target.removeAttribute("RadiusY");
        if (!Intrinsics.areEqual(tagName, "Ellipse")) {
            float fillRadius = RangesKt___RangesKt.coerceAtLeast(styleFloat(patch, InAppViewConstants.RADIUS, 4.0f) - borderWidth, 0.0f);
            target.setAttribute("RadiusX", fmt(fillRadius));
            target.setAttribute("RadiusY", fmt(fillRadius));
            target.removeAttribute("StrokeThickness");
            if (widthBindingPath != null) {
                INSTANCE.appendWidthBinding(doc, target, widthBindingPath, fillWidth / widthScaleSourceFull);
                return;
            }
            return;
        }
        target.setAttribute("StrokeThickness", "6");
        target.setAttribute("TrimEnd", trimEnd == null ? "" : trimEnd);
        target.setAttribute("StrokeEndLineCap", "Round");
        target.setAttribute("StrokeStartLineCap", "Round");
    }

    private final void appendWidthBinding(Document doc, Element target, String path, float maxWidth) {
        Element width = doc.createElement(target.getTagName() + ".Width");
        Element binding = doc.createElement("Binding");
        binding.setAttribute("Path", path);
        Element converter = doc.createElement("Binding.Converter");
        Element math = doc.createElement("noesis:MathConverter");
        math.setAttribute("Expression", "{}{0} * " + fmt(maxWidth));
        converter.appendChild(math);
        binding.appendChild(converter);
        width.appendChild(binding);
        target.appendChild(width);
    }

    private final void applyRadarIcon(Document doc, GuiHudPatch patch, String elementId, String xName, String visibleBinding) {
        Object element$iv;
        GuiHudElementPatch it;
        Iterable $this$firstOrNull$iv = patch.getElements();
        Iterator it2 = $this$firstOrNull$iv.iterator();
        do {
            if (!it2.hasNext()) {
                element$iv = null;
                break;
            } else {
                element$iv = it2.next();
                it = (GuiHudElementPatch) element$iv;
            }
        } while (!Intrinsics.areEqual(it.getId(), elementId));
        GuiHudElementPatch guiHudElementPatchElement = (GuiHudElementPatch) element$iv;
        if (guiHudElementPatchElement == null) {
            guiHudElementPatchElement = GuiHudDefaults.INSTANCE.element(elementId);
        }
        GuiHudElementPatch iconPatch = guiHudElementPatchElement;
        Element icon = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, xName));
        if (icon == null) {
            return;
        }
        Element documentElement = (Element) CollectionsKt___CollectionsKt.firstOrNull((List) findByXName(doc, "Content"));
        if (documentElement == null) {
            documentElement = doc.getDocumentElement();
        }
        Intrinsics.checkNotNull(documentElement);
        moveElement(icon, documentElement);
        icon.setAttribute("DataContext", "{Binding Radar}");
        icon.setAttribute("HorizontalAlignment", "Left");
        icon.setAttribute("VerticalAlignment", "Top");
        icon.setAttribute("Margin", fmt(iconPatch.getX()) + AbstractJsonLexerKt.COMMA + fmt(iconPatch.getY()) + ",0,0");
        icon.setAttribute(HttpHeaders.WIDTH, fmt(iconPatch.getWidth()));
        icon.setAttribute("Height", fmt(iconPatch.getHeight()));
        icon.setAttribute("Visibility", iconPatch.getVisible() ? visibleBinding : "Collapsed");
    }

    private final void applyMoneyBlock(Document doc, GuiHudPatch patch) {
        Object element$iv;
        GuiHudElementPatch it;
        Iterable $this$firstOrNull$iv = patch.getElements();
        Iterator it2 = $this$firstOrNull$iv.iterator();
        do {
            if (!it2.hasNext()) {
                element$iv = null;
                break;
            } else {
                element$iv = it2.next();
                it = (GuiHudElementPatch) element$iv;
            }
        } while (!Intrinsics.areEqual(it.getId(), GuiHudElementIds.MONEY_VALUE));
        GuiHudElementPatch guiHudElementPatchElement = (GuiHudElementPatch) element$iv;
        if (guiHudElementPatchElement == null) {
            guiHudElementPatchElement = GuiHudDefaults.INSTANCE.element(GuiHudElementIds.MONEY_VALUE);
        }
        GuiHudElementPatch moneyPatch = guiHudElementPatchElement;
        Element money = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, GuiHudElementIds.MONEY_VALUE));
        if (money == null) {
            return;
        }
        Element documentElement = (Element) CollectionsKt___CollectionsKt.firstOrNull((List) findByXName(doc, "Content"));
        if (documentElement == null) {
            documentElement = doc.getDocumentElement();
        }
        Intrinsics.checkNotNull(documentElement);
        moveElement(money, documentElement);
        money.removeAttribute("Grid.Column");
        money.removeAttribute("Grid.Row");
        money.setAttribute("HorizontalAlignment", "Left");
        money.setAttribute("VerticalAlignment", "Top");
        money.setAttribute("Margin", fmt(moneyPatch.getX()) + AbstractJsonLexerKt.COMMA + fmt(moneyPatch.getY()) + ",0,0");
        money.setAttribute(HttpHeaders.WIDTH, fmt(moneyPatch.getWidth()));
        money.setAttribute("Height", fmt(moneyPatch.getHeight()));
        money.setAttribute("Visibility", moneyPatch.getVisible() ? "{Binding Radar.MoneyVisible, Converter={StaticResource VisibilityConverter}}" : "Collapsed");
        applyMoneyBackground(money, moneyPatch);
        applyColorOverrides(doc, GuiHudElementIds.MONEY_VALUE, moneyPatch.getColorOverrides());
    }

    private final void applyMoneyBackground(Element money, GuiHudElementPatch patch) {
        if (Intrinsics.areEqual(patch.getColorOverrides().get("backgroundVisible"), CommonUrlParts.Values.FALSE_INTEGER)) {
            removePropertyChild(money, "Border.Background");
            money.setAttribute("Background", "#00000000");
            return;
        }
        if (Intrinsics.areEqual(money.getAttribute("Background"), "#00000000")) {
            money.removeAttribute("Background");
        }
        Iterable $this$none$iv = directChildren(money);
        boolean z = true;
        if (!($this$none$iv instanceof Collection) || !((Collection) $this$none$iv).isEmpty()) {
            for (Object element$iv : $this$none$iv) {
                Element it = (Element) element$iv;
                if (Intrinsics.areEqual(it.getTagName(), "Border.Background")) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            String attribute = money.getAttribute("Background");
            Intrinsics.checkNotNullExpressionValue(attribute, "getAttribute(...)");
            if (StringsKt__StringsKt.isBlank(attribute)) {
                money.setAttribute("Background", "#80262837");
            }
        }
    }

    private final void applyDailyCase(Document doc, GuiHudPatch patch) {
        Object element$iv;
        GuiHudElementPatch it;
        Iterable $this$firstOrNull$iv = patch.getElements();
        Iterator it2 = $this$firstOrNull$iv.iterator();
        do {
            if (!it2.hasNext()) {
                element$iv = null;
                break;
            } else {
                element$iv = it2.next();
                it = (GuiHudElementPatch) element$iv;
            }
        } while (!Intrinsics.areEqual(it.getId(), GuiHudElementIds.DAILY_CASE));
        GuiHudElementPatch guiHudElementPatchElement = (GuiHudElementPatch) element$iv;
        if (guiHudElementPatchElement == null) {
            guiHudElementPatchElement = GuiHudDefaults.INSTANCE.element(GuiHudElementIds.DAILY_CASE);
        }
        GuiHudElementPatch dailyPatch = guiHudElementPatchElement;
        Element daily = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, GuiHudElementIds.DAILY_CASE));
        if (daily == null) {
            return;
        }
        Element documentElement = (Element) CollectionsKt___CollectionsKt.firstOrNull((List) findByXName(doc, "Content"));
        if (documentElement == null) {
            documentElement = doc.getDocumentElement();
        }
        Intrinsics.checkNotNull(documentElement);
        moveElement(daily, documentElement);
        daily.removeAttribute("Grid.Column");
        daily.removeAttribute("Grid.Row");
        daily.setAttribute("DataContext", "{Binding DailyCase}");
        daily.setAttribute("HorizontalAlignment", "Left");
        daily.setAttribute("VerticalAlignment", "Top");
        daily.setAttribute("Margin", fmt(dailyPatch.getX()) + AbstractJsonLexerKt.COMMA + fmt(dailyPatch.getY()) + ",0,0");
        daily.setAttribute(HttpHeaders.WIDTH, fmt(dailyPatch.getWidth()));
        daily.setAttribute("Height", fmt(dailyPatch.getHeight()));
        daily.setAttribute("Visibility", dailyPatch.getVisible() ? "{Binding IsVisible, Converter={StaticResource VisibilityConverter}}" : "Collapsed");
    }

    private final void resizeWeaponContent(Element weapon, GuiHudElementPatch patch) {
        float size = Math.min(patch.getWidth(), patch.getHeight());
        applyWeaponBackground(weapon, patch, size);
        Element icon = findDescendantByXName(weapon, "WeaponIcon");
        if (icon != null) {
            icon.setAttribute(HttpHeaders.WIDTH, INSTANCE.fmt(size * 0.8f));
            icon.setAttribute("Height", INSTANCE.fmt(0.8f * size));
            icon.setAttribute("HorizontalAlignment", "Center");
            icon.setAttribute("VerticalAlignment", "Center");
            icon.setAttribute("Margin", CommonUrlParts.Values.FALSE_INTEGER);
        }
        Element button = findFirstDescendant(weapon, new Function1<Element, Boolean>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiHudXamlPatcher.resizeWeaponContent.2
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Element it) {
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z = false;
                if (Intrinsics.areEqual(it.getTagName(), "Button")) {
                    String attribute = it.getAttribute("Command");
                    Intrinsics.checkNotNullExpressionValue(attribute, "getAttribute(...)");
                    if (StringsKt__StringsKt.contains$default((CharSequence) attribute, (CharSequence) "SwitchWeaponCommand", false, 2, (Object) null)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
        if (button != null) {
            button.setAttribute(HttpHeaders.WIDTH, INSTANCE.fmt(size));
            button.setAttribute("Height", INSTANCE.fmt(size));
            button.setAttribute("HorizontalAlignment", "Center");
            button.setAttribute("VerticalAlignment", "Center");
            button.setAttribute("Margin", CommonUrlParts.Values.FALSE_INTEGER);
        }
    }

    private final void applyWeaponBackground(Element weapon, GuiHudElementPatch patch, float size) {
        Element target;
        String background;
        Element current = weaponBackgroundElement(weapon);
        if (current == null) {
            return;
        }
        String shape = patch.getColorOverrides().get("shape");
        if (shape == null) {
            shape = "round";
        }
        String targetTag = Intrinsics.areEqual(shape, "round") ? "Ellipse" : "Rectangle";
        if (Intrinsics.areEqual(current.getTagName(), targetTag)) {
            target = current;
        } else {
            Document ownerDocument = weapon.getOwnerDocument();
            Intrinsics.checkNotNullExpressionValue(ownerDocument, "getOwnerDocument(...)");
            target = replaceElement(ownerDocument, current, targetTag);
        }
        clearChildren(target);
        target.setAttribute("x:Name", "WeaponBackground");
        target.setAttribute(HttpHeaders.WIDTH, fmt(size * 0.73f));
        target.setAttribute("Height", fmt(0.73f * size));
        target.setAttribute("HorizontalAlignment", "Center");
        target.setAttribute("VerticalAlignment", "Center");
        target.setAttribute("Margin", CommonUrlParts.Values.FALSE_INTEGER);
        target.removeAttribute("DataContext");
        target.removeAttribute("Background");
        target.removeAttribute("BorderBrush");
        target.removeAttribute("BorderThickness");
        target.removeAttribute("CornerRadius");
        target.removeAttribute("RenderTransformOrigin");
        removePropertyChild(target, target.getTagName() + ".Fill");
        removePropertyChild(target, target.getTagName() + ".Stroke");
        if (Intrinsics.areEqual(patch.getColorOverrides().get("backgroundVisible"), CommonUrlParts.Values.FALSE_INTEGER)) {
            background = "#00000000";
        } else {
            background = styleColor(patch, "background", "#99262837");
        }
        target.setAttribute("Fill", background);
        target.setAttribute("Stroke", styleColor(patch, "border", Other.COLOR_DEFAULT_STRING));
        target.setAttribute("StrokeThickness", fmt(styleFloat(patch, "borderWidth", 2.0f)));
        if (Intrinsics.areEqual(target.getTagName(), "Rectangle")) {
            float radius = Intrinsics.areEqual(shape, "rounded") ? styleFloat(patch, InAppViewConstants.RADIUS, 16.0f) : 0.0f;
            target.setAttribute("RadiusX", fmt(radius));
            target.setAttribute("RadiusY", fmt(radius));
        } else {
            target.removeAttribute("RadiusX");
            target.removeAttribute("RadiusY");
        }
    }

    private final void setHudImageVisibility(Document doc, String xName, String value) {
        Element element = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, xName));
        if (element != null) {
            element.setAttribute("Visibility", value);
        }
    }

    private final String barFrameName(String progressName) {
        return progressName + "Frame";
    }

    private final float styleFloat(GuiHudElementPatch patch, String key, float fallback) {
        Float floatOrNull;
        String str = patch.getColorOverrides().get(key);
        return (str == null || (floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(str)) == null) ? fallback : floatOrNull.floatValue();
    }

    private final String styleColor(GuiHudElementPatch patch, String key, String fallback) {
        String str = patch.getColorOverrides().get(key);
        String value = str != null ? StringsKt__StringsKt.trim((CharSequence) str).toString() : null;
        if (value == null) {
            value = "";
        }
        return (StringsKt__StringsKt.isBlank(value) || StringsKt__StringsJVMKt.startsWith$default(value, "{", false, 2, null)) ? fallback : normalizeColor(value);
    }

    private final String radarBarColorAttr(Document doc, String xName) {
        Element element = (Element) CollectionsKt___CollectionsKt.lastOrNull((List) findByXName(doc, xName));
        return Intrinsics.areEqual(element != null ? element.getTagName() : null, "Rectangle") ? "Fill" : "Stroke";
    }

    private final Element replaceElement(Document doc, Element current, String tagName) {
        Element replacement = doc.createElement(tagName);
        NamedNodeMap attrs = current.getAttributes();
        int length = attrs.getLength();
        for (int i = 0; i < length; i++) {
            Node attr = attrs.item(i);
            replacement.setAttribute(attr.getNodeName(), attr.getNodeValue());
        }
        current.getParentNode().replaceChild(replacement, current);
        Intrinsics.checkNotNull(replacement);
        return replacement;
    }

    private final void moveElement(Element element, Element newParent) {
        if (Intrinsics.areEqual(element.getParentNode(), newParent)) {
            return;
        }
        Node parentNode = element.getParentNode();
        if (parentNode != null) {
            parentNode.removeChild(element);
        }
        newParent.appendChild(element);
    }

    private final void clearChildren(Element element) {
        while (element.getFirstChild() != null) {
            element.removeChild(element.getFirstChild());
        }
    }

    private final void ensureNoesisNamespace(Document doc) {
        Element root = doc.getDocumentElement();
        if (root != null && !root.hasAttribute("xmlns:noesis")) {
            root.setAttribute("xmlns:noesis", "clr-namespace:NoesisGUIExtensions");
        }
    }

    private final void upsertScaleTransform(Document doc, Element element, float scale) {
        Object element$iv;
        String propertyTag = element.getTagName() + ".LayoutTransform";
        Iterable $this$firstOrNull$iv = directChildren(element);
        Iterator it = $this$firstOrNull$iv.iterator();
        do {
            if (!it.hasNext()) {
                element$iv = null;
                break;
            }
            element$iv = it.next();
        } while (!Intrinsics.areEqual(((Element) element$iv).getTagName(), propertyTag));
        Element it2 = (Element) element$iv;
        if (it2 == null) {
            it2 = doc.createElement(propertyTag);
            element.insertBefore(it2, element.getFirstChild());
        }
        Element it3 = it2;
        while (it3.getFirstChild() != null) {
            it3.removeChild(it3.getFirstChild());
        }
        Element group = doc.createElement("TransformGroup");
        Element scaleNode = doc.createElement("ScaleTransform");
        scaleNode.setAttribute("ScaleX", fmt(scale));
        scaleNode.setAttribute("ScaleY", fmt(scale));
        group.appendChild(scaleNode);
        it3.appendChild(group);
    }

    private final void removePropertyChild(Element element, String tagName) {
        Iterable $this$filter$iv = directChildren(element);
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            Element it = (Element) element$iv$iv;
            if (Intrinsics.areEqual(it.getTagName(), tagName)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        Iterable $this$forEach$iv = (List) destination$iv$iv;
        for (Object element$iv : $this$forEach$iv) {
            Element it2 = (Element) element$iv;
            element.removeChild(it2);
        }
    }

    private final List<Element> findByXName(Document doc, String name) {
        ArrayList result = new ArrayList();
        NodeList nodes = doc.getElementsByTagName("*");
        int length = nodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = nodes.item(i);
            Element element = nodeItem instanceof Element ? (Element) nodeItem : null;
            if (element != null && (Intrinsics.areEqual(element.getAttribute("x:Name"), name) || Intrinsics.areEqual(element.getAttribute("Name"), name))) {
                result.add(element);
            }
        }
        return result;
    }

    private final Element findDescendantByXName(Element root, String name) {
        if (root == null) {
            return null;
        }
        ArrayDeque stack = new ArrayDeque();
        stack.add(root);
        Element found = null;
        while (!stack.isEmpty()) {
            Node node = (Node) stack.removeFirst();
            if ((node instanceof Element) && (Intrinsics.areEqual(((Element) node).getAttribute("x:Name"), name) || Intrinsics.areEqual(((Element) node).getAttribute("Name"), name))) {
                found = (Element) node;
            }
            NodeList children = node.getChildNodes();
            int length = children.getLength();
            for (int i = 0; i < length; i++) {
                Node nodeItem = children.item(i);
                Intrinsics.checkNotNullExpressionValue(nodeItem, "item(...)");
                stack.add(nodeItem);
            }
        }
        return found;
    }

    private final Element findFirstDescendant(Element root, Function1<? super Element, Boolean> predicate) {
        if (root == null) {
            return null;
        }
        ArrayDeque stack = new ArrayDeque();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = (Node) stack.removeFirst();
            if ((node instanceof Element) && !Intrinsics.areEqual(node, root) && predicate.invoke(node).booleanValue()) {
                return (Element) node;
            }
            NodeList children = node.getChildNodes();
            int length = children.getLength();
            for (int i = 0; i < length; i++) {
                Node nodeItem = children.item(i);
                Intrinsics.checkNotNullExpressionValue(nodeItem, "item(...)");
                stack.add(nodeItem);
            }
        }
        return null;
    }

    private final List<Element> directChildren(Element element) {
        ArrayList result = new ArrayList();
        NodeList children = element.getChildNodes();
        int length = children.getLength();
        for (int i = 0; i < length; i++) {
            Node child = children.item(i);
            if (child instanceof Element) {
                result.add(child);
            }
        }
        return result;
    }

    private final Float readScale(Element element) {
        Object element$iv;
        String tagName;
        Iterable $this$firstOrNull$iv = directChildren(element);
        Iterator it = $this$firstOrNull$iv.iterator();
        do {
            if (it.hasNext()) {
                element$iv = it.next();
                Element it2 = (Element) element$iv;
                tagName = it2.getTagName();
                Intrinsics.checkNotNullExpressionValue(tagName, "getTagName(...)");
            } else {
                element$iv = null;
                break;
            }
        } while (!StringsKt__StringsJVMKt.endsWith$default(tagName, ".LayoutTransform", false, 2, null));
        Element transform = (Element) element$iv;
        if (transform == null) {
            return null;
        }
        ArrayDeque stack = new ArrayDeque();
        stack.add(transform);
        while (!stack.isEmpty()) {
            Node node = (Node) stack.removeFirst();
            if ((node instanceof Element) && Intrinsics.areEqual(((Element) node).getTagName(), "ScaleTransform")) {
                Float f = readFloat((Element) node, "ScaleX");
                return f == null ? readFloat((Element) node, "ScaleY") : f;
            }
            NodeList children = node.getChildNodes();
            int length = children.getLength();
            for (int i = 0; i < length; i++) {
                Node nodeItem = children.item(i);
                Intrinsics.checkNotNullExpressionValue(nodeItem, "item(...)");
                stack.add(nodeItem);
            }
        }
        return null;
    }

    private final Float readFloat(Element element, String attr) {
        String it = element.getAttribute(attr);
        Intrinsics.checkNotNull(it);
        if (StringsKt__StringsKt.isBlank(it)) {
            it = null;
        }
        if (it != null) {
            return StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(it);
        }
        return null;
    }

    private final Thickness parseThickness(String value) {
        if (StringsKt__StringsKt.isBlank(value) || StringsKt__StringsJVMKt.startsWith$default(value, "{", false, 2, null)) {
            return null;
        }
        Iterable $this$mapNotNull$iv = StringsKt__StringsKt.split$default((CharSequence) value, new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, (Object) null);
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            String it = (String) element$iv$iv$iv;
            Float floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(StringsKt__StringsKt.trim((CharSequence) it).toString());
            if (floatOrNull != null) {
                destination$iv$iv.add(floatOrNull);
            }
        }
        List parts = (List) destination$iv$iv;
        switch (parts.size()) {
            case 1:
                return new Thickness(((Number) parts.get(0)).floatValue(), ((Number) parts.get(0)).floatValue(), ((Number) parts.get(0)).floatValue(), ((Number) parts.get(0)).floatValue());
            case 2:
                return new Thickness(((Number) parts.get(0)).floatValue(), ((Number) parts.get(1)).floatValue(), ((Number) parts.get(0)).floatValue(), ((Number) parts.get(1)).floatValue());
            case 3:
            default:
                return null;
            case 4:
                return new Thickness(((Number) parts.get(0)).floatValue(), ((Number) parts.get(1)).floatValue(), ((Number) parts.get(2)).floatValue(), ((Number) parts.get(3)).floatValue());
        }
    }

    private final Document parse(String xaml) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(false);
        factory.setIgnoringComments(false);
        factory.setCoalescing(false);
        DocumentBuilder documentBuilderNewDocumentBuilder = factory.newDocumentBuilder();
        byte[] bytes = xaml.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        Document document = documentBuilderNewDocumentBuilder.parse(new ByteArrayInputStream(bytes));
        Intrinsics.checkNotNullExpressionValue(document, "parse(...)");
        return document;
    }

    private final String serialize(Document doc) throws TransformerException {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty("omit-xml-declaration", "yes");
        transformer.setOutputProperty("encoding", Constants.ENCODING);
        transformer.setOutputProperty("indent", "yes");
        StringWriter writer = new StringWriter();
        transformer.transform(new DOMSource(doc), new StreamResult(writer));
        String string = writer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final String normalizeColor(String value) {
        String trimmed = StringsKt__StringsKt.trim((CharSequence) value).toString();
        if (!StringsKt__StringsJVMKt.startsWith$default(trimmed, "#", false, 2, null)) {
            return trimmed;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String hex = trimmed.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(hex, "toUpperCase(...)");
        switch (hex.length()) {
            case 7:
                StringBuilder sbAppend = new StringBuilder().append("#FF");
                String strSubstring = hex.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return sbAppend.append(strSubstring).toString();
            case 8:
            default:
                return trimmed;
            case 9:
                return hex;
        }
    }

    private final String fmt(float value) {
        float rounded = ((float) Math.rint(value * 100.0f)) / 100.0f;
        if (rounded % 1.0f == 0.0f) {
            return String.valueOf((int) rounded);
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(rounded)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return StringsKt.trimEnd(StringsKt.trimEnd(str, '0'), '.');
    }
}
