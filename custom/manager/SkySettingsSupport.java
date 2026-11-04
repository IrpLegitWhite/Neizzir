package com.blackhub.bronline.neizzir.fragments.custom.manager;

import com.google.firebase.messaging.Constants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: SkySettingsSupport.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\bÀ\u0002\u0018\u00002\u00020\u0001:\u0004KLMNB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00060\u001aJ0\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00060\u001aJ\u0016\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0004H\u0002J\u001e\u0010#\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%J\u001e\u0010'\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0018H\u0002J(\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0002J\u0012\u00100\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u00010!H\u0002J\u0012\u00102\u001a\u00020\u00062\b\u00103\u001a\u0004\u0018\u00010\u0001H\u0002J \u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020%2\u0006\u00107\u001a\u000208H\u0002J\u0012\u00109\u001a\u0004\u0018\u00010!2\u0006\u0010:\u001a\u00020\u0006H\u0002J\u0016\u0010;\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0006J&\u0010=\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010<\u001a\u00020\u0007J1\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020%0\u0004¢\u0006\u0002\u0010@J&\u0010A\u001a\u00020\u00162\u0006\u0010B\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%J&\u0010D\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\u0006\u0010<\u001a\u00020\u0007J\u000e\u0010E\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010G\u001a\u00020%J\u000e\u0010H\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001dJ\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010G\u001a\u00020%2\u0006\u0010J\u001a\u000208R)\u0010\u0003\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\t¨\u0006O"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsSupport;", "", "()V", "advancedSections", "", "Lkotlin/Pair;", "", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsSupport$FieldSpec;", "getAdvancedSections", "()Ljava/util/List;", "allFields", "getAllFields", "basicFields", "getBasicFields", "basicTimeScopes", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsSupport$TimeScope;", "getBasicTimeScopes", "effectFields", "lightingFields", "timeSlotLabels", "getTimeSlotLabels", "applyEntryOverrides", "", "entry", "Lorg/json/JSONObject;", "overrides", "", "applyOverrides", "json", "Lorg/json/JSONArray;", "targets", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsSupport$Target;", "averageNumber", "", "values", "copySlotToAllTimes", "weatherIndex", "", "timeIndex", "copySlotToAllWeathers", "deepCopy", "source", "field", "key", "title", "description", "kind", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsSupport$FieldKind;", "formatNumber", "number", "formatValue", "value", "parseArray", "text", "expectedSize", "requireIntegers", "", "parseNumberish", "token", "parseValue", "spec", "readValue", "resolveTargets", "timeIndices", "(Lorg/json/JSONArray;Ljava/lang/Integer;Ljava/util/List;)Ljava/util/List;", "restoreSlotFromStock", "workingJson", "stockJson", "sampleValue", "timeCount", "timeLabels", "count", "weatherCount", "weatherLabels", "includeAll", "FieldKind", "FieldSpec", "Target", "TimeScope", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class SkySettingsSupport {
    private static final List<FieldSpec> allFields;
    public static final SkySettingsSupport INSTANCE = new SkySettingsSupport();
    private static final List<String> timeSlotLabels = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"00:00", "03:00", "06:00", "09:00", "12:00", "15:00", "18:00", "21:00"});
    private static final List<TimeScope> basicTimeScopes = CollectionsKt__CollectionsKt.listOf((Object[]) new TimeScope[]{new TimeScope("Все часы", CollectionsKt___CollectionsKt.toList(CollectionsKt__CollectionsKt.getIndices(timeSlotLabels))), new TimeScope("Ночь 00:00-06:00", CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 1})), new TimeScope("Утро 06:00-12:00", CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{2, 3})), new TimeScope("День 12:00-18:00", CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{4, 5})), new TimeScope("Вечер 18:00-00:00", CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{6, 7}))});
    private static final List<FieldSpec> basicFields = CollectionsKt__CollectionsKt.listOf((Object[]) new FieldSpec[]{INSTANCE.field("SkyTopRGB", "Верх неба", "Верхний слой градиента неба", FieldKind.RGB), INSTANCE.field("SkyBottomRGB", "Низ неба", "Нижний слой градиента неба", FieldKind.RGB), INSTANCE.field("CloudRGB", "Облака", "Основной цвет облаков", FieldKind.RGB), INSTANCE.field("FluffyBottomRGB", "Низ облаков", "Цвет нижней части облаков", FieldKind.RGB), INSTANCE.field("SunCoreRGB", "Ядро солнца", "Центральный яркий цвет солнца", FieldKind.RGB), INSTANCE.field("SunCoronaRGB", "Ореол солнца", "Цвет внешнего свечения солнца", FieldKind.RGB), INSTANCE.field("SunSize", "Размер солнца", "Насколько крупным выглядит солнце", FieldKind.NUMBER)});
    private static final List<FieldSpec> lightingFields = CollectionsKt__CollectionsKt.listOf((Object[]) new FieldSpec[]{INSTANCE.field("AmbientRGB", "Общий свет", "Базовый свет в тени", FieldKind.RGB), INSTANCE.field("AmbientPhysicalRGB", "Физический свет", "Свет от неба и окружения", FieldKind.RGB), INSTANCE.field("DirectionalRGB", "Направленный свет", "Свет от солнца или луны", FieldKind.RGB), INSTANCE.field("LightGnd", "LightGnd", "Сила освещения поверхности", FieldKind.NUMBER), INSTANCE.field("LightShad", "LightShad", "Глубина теней", FieldKind.NUMBER), INSTANCE.field("PoleShad", "PoleShad", "Затемнение объектов", FieldKind.NUMBER), INSTANCE.field("Shad", "Shad", "Сила общей тени", FieldKind.NUMBER), INSTANCE.field("SpriteBrght", "Яркость спрайтов", "Яркость бликов и спрайтов", FieldKind.NUMBER), INSTANCE.field("SpriteSize", "Размер спрайтов", "Размер бликов и корон", FieldKind.NUMBER)});
    private static final List<FieldSpec> effectFields = CollectionsKt__CollectionsKt.listOf((Object[]) new FieldSpec[]{INSTANCE.field("FogStart", "Начало тумана", "С какой дистанции начинается туман", FieldKind.NUMBER), INSTANCE.field("FarClip", "Дальность прорисовки", "Максимальная видимость сцены", FieldKind.NUMBER), INSTANCE.field("PostFX1ARGB", "PostFX 1", "Первый слой постобработки", FieldKind.ARRAY4), INSTANCE.field("PostFX2ARGB", "PostFX 2", "Второй слой постобработки", FieldKind.ARRAY4), INSTANCE.field("WaterRGBA", "Цвет воды", "RGBA воды, где A отвечает за прозрачность", FieldKind.ARRAY4)});
    private static final List<Pair<String, List<FieldSpec>>> advancedSections = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m4423to("Небо и солнце", basicFields), TuplesKt.m4423to("Освещение", lightingFields), TuplesKt.m4423to("Эффекты и вода", effectFields)});

    /* JADX INFO: compiled from: SkySettingsSupport.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FieldKind.values().length];
            try {
                iArr[FieldKind.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[FieldKind.RGB.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[FieldKind.ARRAY4.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SkySettingsSupport() {
    }

    /* JADX INFO: compiled from: SkySettingsSupport.kt */
    @Metadata(m4415d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsSupport$FieldKind;", "", "arrayLength", "", "(Ljava/lang/String;ILjava/lang/Integer;)V", "getArrayLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "RGB", "NUMBER", "ARRAY4", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public enum FieldKind {
        RGB(3),
        NUMBER(null, 1, null),
        ARRAY4(4);

        private final Integer arrayLength;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        public static EnumEntries<FieldKind> getEntries() {
            return $ENTRIES;
        }

        FieldKind(Integer arrayLength) {
            this.arrayLength = arrayLength;
        }

        /* synthetic */ FieldKind(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num);
        }

        public final Integer getArrayLength() {
            return this.arrayLength;
        }
    }

    /* JADX INFO: compiled from: SkySettingsSupport.kt */
    @Metadata(m4415d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsSupport$FieldSpec;", "", "key", "", "title", "description", "kind", "Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsSupport$FieldKind;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsSupport$FieldKind;)V", "getDescription", "()Ljava/lang/String;", "getKey", "getKind", "()Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsSupport$FieldKind;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final /* data */ class FieldSpec {
        private final String description;
        private final String key;
        private final FieldKind kind;
        private final String title;

        public static /* synthetic */ FieldSpec copy$default(FieldSpec fieldSpec, String str, String str2, String str3, FieldKind fieldKind, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fieldSpec.key;
            }
            if ((i & 2) != 0) {
                str2 = fieldSpec.title;
            }
            if ((i & 4) != 0) {
                str3 = fieldSpec.description;
            }
            if ((i & 8) != 0) {
                fieldKind = fieldSpec.kind;
            }
            return fieldSpec.copy(str, str2, str3, fieldKind);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final FieldKind getKind() {
            return this.kind;
        }

        public final FieldSpec copy(String key, String title, String description, FieldKind kind) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(kind, "kind");
            return new FieldSpec(key, title, description, kind);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldSpec)) {
                return false;
            }
            FieldSpec fieldSpec = (FieldSpec) other;
            return Intrinsics.areEqual(this.key, fieldSpec.key) && Intrinsics.areEqual(this.title, fieldSpec.title) && Intrinsics.areEqual(this.description, fieldSpec.description) && this.kind == fieldSpec.kind;
        }

        public int hashCode() {
            return (((((this.key.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.kind.hashCode();
        }

        public String toString() {
            return "FieldSpec(key=" + this.key + ", title=" + this.title + ", description=" + this.description + ", kind=" + this.kind + ')';
        }

        public FieldSpec(String key, String title, String description, FieldKind kind) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(kind, "kind");
            this.key = key;
            this.title = title;
            this.description = description;
            this.kind = kind;
        }

        public final String getKey() {
            return this.key;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final FieldKind getKind() {
            return this.kind;
        }
    }

    /* JADX INFO: compiled from: SkySettingsSupport.kt */
    @Metadata(m4415d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsSupport$TimeScope;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "indices", "", "", "(Ljava/lang/String;Ljava/util/List;)V", "getIndices", "()Ljava/util/List;", "getLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final /* data */ class TimeScope {
        private final List<Integer> indices;
        private final String label;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TimeScope copy$default(TimeScope timeScope, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = timeScope.label;
            }
            if ((i & 2) != 0) {
                list = timeScope.indices;
            }
            return timeScope.copy(str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final List<Integer> component2() {
            return this.indices;
        }

        public final TimeScope copy(String label, List<Integer> indices) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(indices, "indices");
            return new TimeScope(label, indices);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeScope)) {
                return false;
            }
            TimeScope timeScope = (TimeScope) other;
            return Intrinsics.areEqual(this.label, timeScope.label) && Intrinsics.areEqual(this.indices, timeScope.indices);
        }

        public int hashCode() {
            return (this.label.hashCode() * 31) + this.indices.hashCode();
        }

        public String toString() {
            return "TimeScope(label=" + this.label + ", indices=" + this.indices + ')';
        }

        public TimeScope(String label, List<Integer> indices) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(indices, "indices");
            this.label = label;
            this.indices = indices;
        }

        public final String getLabel() {
            return this.label;
        }

        public final List<Integer> getIndices() {
            return this.indices;
        }
    }

    /* JADX INFO: compiled from: SkySettingsSupport.kt */
    @Metadata(m4415d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/manager/SkySettingsSupport$Target;", "", "weatherIndex", "", "timeIndex", "(II)V", "getTimeIndex", "()I", "getWeatherIndex", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final /* data */ class Target {
        private final int timeIndex;
        private final int weatherIndex;

        public static /* synthetic */ Target copy$default(Target target, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = target.weatherIndex;
            }
            if ((i3 & 2) != 0) {
                i2 = target.timeIndex;
            }
            return target.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getWeatherIndex() {
            return this.weatherIndex;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTimeIndex() {
            return this.timeIndex;
        }

        public final Target copy(int weatherIndex, int timeIndex) {
            return new Target(weatherIndex, timeIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Target)) {
                return false;
            }
            Target target = (Target) other;
            return this.weatherIndex == target.weatherIndex && this.timeIndex == target.timeIndex;
        }

        public int hashCode() {
            return (Integer.hashCode(this.weatherIndex) * 31) + Integer.hashCode(this.timeIndex);
        }

        public String toString() {
            return "Target(weatherIndex=" + this.weatherIndex + ", timeIndex=" + this.timeIndex + ')';
        }

        public Target(int weatherIndex, int timeIndex) {
            this.weatherIndex = weatherIndex;
            this.timeIndex = timeIndex;
        }

        public final int getWeatherIndex() {
            return this.weatherIndex;
        }

        public final int getTimeIndex() {
            return this.timeIndex;
        }
    }

    private final FieldSpec field(String key, String title, String description, FieldKind kind) {
        return new FieldSpec(key, title, description, kind);
    }

    static {
        Iterable $this$flatMap$iv = advancedSections;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$flatMap$iv) {
            Pair it = (Pair) element$iv$iv;
            Iterable list$iv$iv = (List) it.getSecond();
            CollectionsKt__MutableCollectionsKt.addAll(destination$iv$iv, list$iv$iv);
        }
        Iterable $this$distinctBy$iv = (List) destination$iv$iv;
        HashSet set$iv = new HashSet();
        ArrayList list$iv = new ArrayList();
        for (Object e$iv : $this$distinctBy$iv) {
            FieldSpec it2 = (FieldSpec) e$iv;
            if (set$iv.add(it2.getKey())) {
                list$iv.add(e$iv);
            }
        }
        allFields = list$iv;
    }

    public final List<String> getTimeSlotLabels() {
        return timeSlotLabels;
    }

    public final List<TimeScope> getBasicTimeScopes() {
        return basicTimeScopes;
    }

    public final List<FieldSpec> getBasicFields() {
        return basicFields;
    }

    public final List<Pair<String, List<FieldSpec>>> getAdvancedSections() {
        return advancedSections;
    }

    public final List<FieldSpec> getAllFields() {
        return allFields;
    }

    public final int weatherCount(JSONArray json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return json.length();
    }

    public final int timeCount(JSONArray json) {
        Intrinsics.checkNotNullParameter(json, "json");
        if (json.length() == 0) {
            return 0;
        }
        return json.getJSONArray(0).length();
    }

    public final List<String> weatherLabels(int count, boolean includeAll) {
        Iterable $this$map$iv = RangesKt___RangesKt.until(0, count);
        Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator<Integer> it = $this$map$iv.iterator();
        while (it.hasNext()) {
            int item$iv$iv = ((IntIterator) it).nextInt();
            destination$iv$iv.add("Погода " + item$iv$iv);
        }
        List base = (List) destination$iv$iv;
        return includeAll ? CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt__CollectionsJVMKt.listOf("Все погоды"), (Iterable) base) : base;
    }

    public final List<String> timeLabels(int count) {
        Iterable $this$map$iv = RangesKt___RangesKt.until(0, count);
        Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator<Integer> it = $this$map$iv.iterator();
        while (it.hasNext()) {
            int item$iv$iv = ((IntIterator) it).nextInt();
            List<String> list = timeSlotLabels;
            destination$iv$iv.add((item$iv$iv < 0 || item$iv$iv > CollectionsKt__CollectionsKt.getLastIndex(list)) ? "Слот " + (item$iv$iv + 1) : list.get(item$iv$iv));
        }
        return (List) destination$iv$iv;
    }

    public final List<Target> resolveTargets(JSONArray json, Integer weatherIndex, List<Integer> timeIndices) throws JSONException {
        IntRange weatherRange;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(timeIndices, "timeIndices");
        if (weatherIndex == null) {
            weatherRange = RangesKt___RangesKt.until(0, weatherCount(json));
        } else {
            weatherRange = new IntRange(weatherIndex.intValue(), weatherIndex.intValue());
        }
        Set validTimes = CollectionsKt___CollectionsKt.toSet(timeIndices);
        List $this$resolveTargets_u24lambda_u245 = CollectionsKt__CollectionsJVMKt.createListBuilder();
        int weather = weatherRange.getFirst();
        int last = weatherRange.getLast();
        if (weather <= last) {
            while (true) {
                JSONArray day = json.getJSONArray(weather);
                int length = day.length();
                for (int time = 0; time < length; time++) {
                    if (validTimes.contains(Integer.valueOf(time))) {
                        $this$resolveTargets_u24lambda_u245.add(new Target(weather, time));
                    }
                }
                if (weather == last) {
                    break;
                }
                weather++;
            }
        }
        return CollectionsKt__CollectionsJVMKt.build($this$resolveTargets_u24lambda_u245);
    }

    public final String readValue(JSONArray json, int weatherIndex, int timeIndex, FieldSpec spec) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(spec, "spec");
        JSONArray day = json.getJSONArray(weatherIndex);
        JSONObject entry = day.getJSONObject(timeIndex);
        return formatValue(entry.opt(spec.getKey()));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0070  */
    public final String sampleValue(JSONArray json, List<Target> targets, FieldSpec spec) {
        Object obj;
        JSONArray json2 = json;
        Intrinsics.checkNotNullParameter(json2, "json");
        Intrinsics.checkNotNullParameter(targets, "targets");
        Intrinsics.checkNotNullParameter(spec, "spec");
        if (targets.isEmpty()) {
            return null;
        }
        List<Target> $this$mapNotNull$iv = targets;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            Target target = (Target) element$iv$iv$iv;
            Object it = json2.getJSONArray(target.getWeatherIndex()).getJSONObject(target.getTimeIndex()).opt(spec.getKey());
            if (it != null) {
                obj = it;
                if (Intrinsics.areEqual(it, JSONObject.NULL)) {
                    obj = null;
                }
            } else {
                obj = null;
            }
            if (obj != null) {
                Object it$iv$iv = obj;
                destination$iv$iv.add(it$iv$iv);
            }
            json2 = json;
        }
        List values = (List) destination$iv$iv;
        if (values.isEmpty()) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[spec.getKind().ordinal()]) {
            case 1:
                List $this$filterIsInstance$iv = values;
                Collection destination$iv$iv2 = new ArrayList();
                for (Object element$iv$iv : $this$filterIsInstance$iv) {
                    if (element$iv$iv instanceof Number) {
                        destination$iv$iv2.add(element$iv$iv);
                    }
                }
                List<? extends Number> numbers = (List) destination$iv$iv2;
                if (numbers.isEmpty()) {
                    return null;
                }
                return formatNumber(averageNumber(numbers));
            case 2:
            case 3:
                List $this$filterIsInstance$iv2 = values;
                Collection destination$iv$iv3 = new ArrayList();
                for (Object element$iv$iv2 : $this$filterIsInstance$iv2) {
                    if (element$iv$iv2 instanceof JSONArray) {
                        destination$iv$iv3.add(element$iv$iv2);
                    }
                }
                List arrays = (List) destination$iv$iv3;
                if (arrays.isEmpty()) {
                    return null;
                }
                Integer arrayLength = spec.getKind().getArrayLength();
                int componentCount = arrayLength != null ? arrayLength.intValue() : ((JSONArray) CollectionsKt___CollectionsKt.first(arrays)).length();
                JSONArray averaged = new JSONArray();
                int index = 0;
                while (index < componentCount) {
                    Iterable $this$mapNotNull$iv2 = arrays;
                    Collection destination$iv$iv4 = new ArrayList();
                    for (Object element$iv$iv$iv2 : $this$mapNotNull$iv2) {
                        JSONArray array = (JSONArray) element$iv$iv$iv2;
                        List arrays2 = arrays;
                        Object objOpt = array.opt(index);
                        Number number = objOpt instanceof Number ? (Number) objOpt : null;
                        if (number != null) {
                            destination$iv$iv4.add(number);
                        }
                        arrays = arrays2;
                    }
                    List arrays3 = arrays;
                    List<? extends Number> numbers2 = (List) destination$iv$iv4;
                    if (numbers2.isEmpty()) {
                        return null;
                    }
                    averaged.put(averageNumber(numbers2));
                    index++;
                    arrays = arrays3;
                }
                return formatValue(averaged);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void applyOverrides(JSONArray json, List<Target> targets, Map<FieldSpec, String> overrides) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(targets, "targets");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        for (Target target : targets) {
            JSONObject entry = json.getJSONArray(target.getWeatherIndex()).getJSONObject(target.getTimeIndex());
            Intrinsics.checkNotNull(entry);
            applyEntryOverrides(entry, overrides);
        }
    }

    public final void applyEntryOverrides(JSONObject entry, Map<FieldSpec, String> overrides) throws JSONException {
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        for (Map.Entry<FieldSpec, String> entry2 : overrides.entrySet()) {
            FieldSpec spec = entry2.getKey();
            String text = entry2.getValue();
            entry.put(spec.getKey(), parseValue(spec, text));
        }
    }

    public final void copySlotToAllTimes(JSONArray json, int weatherIndex, int timeIndex) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        JSONArray day = json.getJSONArray(weatherIndex);
        JSONObject jSONObject = day.getJSONObject(timeIndex);
        Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
        JSONObject snapshot = deepCopy(jSONObject);
        int length = day.length();
        for (int index = 0; index < length; index++) {
            day.put(index, deepCopy(snapshot));
        }
    }

    public final void copySlotToAllWeathers(JSONArray json, int weatherIndex, int timeIndex) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject jSONObject = json.getJSONArray(weatherIndex).getJSONObject(timeIndex);
        Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
        JSONObject snapshot = deepCopy(jSONObject);
        int length = json.length();
        for (int index = 0; index < length; index++) {
            json.getJSONArray(index).put(timeIndex, deepCopy(snapshot));
        }
    }

    public final void restoreSlotFromStock(JSONArray workingJson, JSONArray stockJson, int weatherIndex, int timeIndex) {
        Intrinsics.checkNotNullParameter(workingJson, "workingJson");
        Intrinsics.checkNotNullParameter(stockJson, "stockJson");
        JSONObject jSONObject = stockJson.getJSONArray(weatherIndex).getJSONObject(timeIndex);
        Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
        JSONObject snapshot = deepCopy(jSONObject);
        workingJson.getJSONArray(weatherIndex).put(timeIndex, snapshot);
    }

    public final Object parseValue(FieldSpec spec, String text) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(text, "text");
        String trimmed = StringsKt__StringsKt.trim((CharSequence) text).toString();
        if (!(trimmed.length() > 0)) {
            throw new IllegalArgumentException(("Пустое значение для " + spec.getTitle()).toString());
        }
        switch (WhenMappings.$EnumSwitchMapping$0[spec.getKind().ordinal()]) {
            case 1:
                Number numberish = parseNumberish(trimmed);
                if (numberish != null) {
                    return numberish;
                }
                throw new IllegalArgumentException("Неверное число для " + spec.getTitle());
            case 2:
                return parseArray(trimmed, 3, true);
            case 3:
                return parseArray(trimmed, 4, false);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final JSONArray parseArray(String text, int expectedSize, boolean requireIntegers) {
        Iterable $this$map$iv = StringsKt__StringsKt.split$default((CharSequence) text, new String[]{StringUtils.COMMA}, false, 0, 6, (Object) null);
        Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String it = (String) item$iv$iv;
            destination$iv$iv.add(StringsKt__StringsKt.trim((CharSequence) it).toString());
        }
        Iterable $this$filter$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            String it2 = (String) element$iv$iv;
            if (it2.length() > 0) {
                destination$iv$iv2.add(element$iv$iv);
            }
        }
        List<String> parts = (List) destination$iv$iv2;
        if (!(parts.size() == expectedSize)) {
            throw new IllegalArgumentException(("Нужно указать " + expectedSize + " значения через запятую").toString());
        }
        JSONArray array = new JSONArray();
        for (String part : parts) {
            Number number = parseNumberish(part);
            if (number == null) {
                throw new IllegalArgumentException("Неверное значение: " + part);
            }
            if (requireIntegers) {
                int intValue = number.intValue();
                if (!(number.doubleValue() == ((double) intValue))) {
                    throw new IllegalArgumentException("Для цвета нужны целые числа".toString());
                }
                if (!(intValue >= 0 && intValue < 256)) {
                    throw new IllegalArgumentException("Цветовые каналы должны быть в диапазоне 0..255".toString());
                }
                array.put(intValue);
            } else {
                array.put(number);
            }
        }
        return array;
    }

    private final Number parseNumberish(String token) {
        if (!StringsKt__StringsKt.contains$default((CharSequence) token, '.', false, 2, (Object) null) && !StringsKt.contains((CharSequence) token, 'e', true)) {
            return StringsKt__StringNumberConversionsKt.toIntOrNull(token);
        }
        return StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(token);
    }

    private final String formatValue(Object value) {
        if (value == null ? true : Intrinsics.areEqual(value, JSONObject.NULL)) {
            return "";
        }
        if (!(value instanceof JSONArray)) {
            return value instanceof Number ? formatNumber((Number) value) : value.toString();
        }
        StringBuilder $this$formatValue_u24lambda_u2415 = new StringBuilder();
        int length = ((JSONArray) value).length();
        for (int index = 0; index < length; index++) {
            if (index > 0) {
                $this$formatValue_u24lambda_u2415.append(AbstractJsonLexerKt.COMMA);
            }
            SkySettingsSupport skySettingsSupport = INSTANCE;
            Object objOpt = ((JSONArray) value).opt(index);
            $this$formatValue_u24lambda_u2415.append(skySettingsSupport.formatNumber(objOpt instanceof Number ? (Number) objOpt : null));
        }
        String string = $this$formatValue_u24lambda_u2415.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final String formatNumber(Number number) {
        if (number == null) {
            return "";
        }
        double value = number.doubleValue();
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            return "";
        }
        if (value == ((double) MathKt__MathJVMKt.roundToInt(value))) {
            return String.valueOf(MathKt__MathJVMKt.roundToInt(value));
        }
        return String.valueOf(value);
    }

    private final Number averageNumber(List<? extends Number> values) {
        List<? extends Number> $this$map$iv = values;
        Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            destination$iv$iv.add(Double.valueOf(((Number) item$iv$iv).doubleValue()));
        }
        double average = CollectionsKt.averageOfDouble((List) destination$iv$iv);
        List<? extends Number> $this$all$iv = values;
        boolean z = true;
        if (!($this$all$iv instanceof Collection) || !$this$all$iv.isEmpty()) {
            for (Object element$iv : $this$all$iv) {
                Number it = (Number) element$iv;
                if (!(it.doubleValue() == ((double) MathKt__MathJVMKt.roundToInt(it.doubleValue())))) {
                    z = false;
                    break;
                }
            }
        }
        return z ? Integer.valueOf(MathKt__MathJVMKt.roundToInt(average)) : Double.valueOf(((double) MathKt__MathJVMKt.roundToInt(average * 10.0d)) / 10.0d);
    }

    private final JSONObject deepCopy(JSONObject source) {
        return new JSONObject(source.toString());
    }
}
