package com.blackhub.bronline.neizzir.fragments.hitbox;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.GravityCompat;
import com.blackhub.bronline.game.gui.inventory.Constants;
import com.helpshift.proactive.InAppViewConstants;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.p040io.CloseableKt;
import kotlin.p040io.FilesKt__FileReadWriteKt;
import kotlin.p040io.FilesKt__UtilsKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: HitboxConfigManager.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001<B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u0004H\u0002J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\bJ\u0012\u0010\u001f\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020\u0004H\u0002J\u0018\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\"J \u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010$\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020\u0006J\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020(H\u0002J\u001f\u0010-\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010/J\u001f\u00100\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0002\u00101J\"\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0017032\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\"J \u00104\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010$\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010%J\u000e\u00105\u001a\u00020+2\u0006\u0010,\u001a\u00020(J&\u00106\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u00107J\u000e\u00108\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u00109\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010;R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/hitbox/HitboxConfigManager;", "", "()V", "EPS", "", "FILE_NAME", "", "INITIAL_PERCENT", "", "legacyBrokenNodes", "", "Lcom/blackhub/bronline/neizzir/fragments/hitbox/HitboxConfigManager$HitboxNode;", "stockNodes", "validPedNodes", "", "validPieceTypes", "buildDialog", "", "context", "Landroid/content/Context;", "file", "Ljava/io/File;", "json", "Lorg/json/JSONObject;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "buildNodeJson", "node", InAppViewConstants.RADIUS, "buildScaledJson", "percent", "buildStockRoot", "scaleFactor", "copyToExternalIO", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureExistsIO", "initialPercent", "(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStockJsonString", "getStockNodes", "Lorg/json/JSONArray;", "initOnAppStart", "isLegacyBrokenPattern", "", "nodes", "readFiniteDouble", "key", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Double;", "readFiniteInt", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "readJsonIO", "Lkotlin/Pair;", "repairConfigIfNeededIO", "sanitizeNodes", "saveJsonIO", "(Landroid/content/Context;Ljava/io/File;Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showEditor", "writeJsonIO", "jsonText", "(Ljava/io/File;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HitboxNode", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class HitboxConfigManager {
    private static final double EPS = 0.005d;
    public static final String FILE_NAME = "hitbox.json";
    private static final int INITIAL_PERCENT = 20;
    private static final Set<Integer> validPedNodes;
    private static final Set<Integer> validPieceTypes;
    public static final HitboxConfigManager INSTANCE = new HitboxConfigManager();
    private static final List<HitboxNode> stockNodes = CollectionsKt__CollectionsKt.listOf((Object[]) new HitboxNode[]{new HitboxNode(2, 6, Constants.DEFAULT_DOUBLE_VALUE, 0.05d, 0.15d), new HitboxNode(1, 0, Constants.DEFAULT_DOUBLE_VALUE, 0.15d, 0.2d), new HitboxNode(1, 0, Constants.DEFAULT_DOUBLE_VALUE, -0.05d, 0.25d), new HitboxNode(1, 1, Constants.DEFAULT_DOUBLE_VALUE, -0.25d, 0.25d), new HitboxNode(3, 2, 0.03d, -0.05d, 0.16d), new HitboxNode(4, 3, -0.03d, -0.05d, 0.16d), new HitboxNode(12, 4, Constants.DEFAULT_DOUBLE_VALUE, 0.15d, 0.2d), new HitboxNode(11, 5, Constants.DEFAULT_DOUBLE_VALUE, 0.15d, 0.2d), new HitboxNode(9, 4, Constants.DEFAULT_DOUBLE_VALUE, 0.15d, 0.15d), new HitboxNode(10, 5, Constants.DEFAULT_DOUBLE_VALUE, 0.15d, 0.15d)});
    private static final List<HitboxNode> legacyBrokenNodes = CollectionsKt__CollectionsKt.listOf((Object[]) new HitboxNode[]{new HitboxNode(2, 0, 0.03d, 0.05d, 0.15d), new HitboxNode(1, 1, 0.03d, 0.15d, 0.2d), new HitboxNode(1, 1, 0.03d, -0.05d, 0.25d), new HitboxNode(1, 2, 0.03d, -0.25d, 0.25d), new HitboxNode(3, 3, 0.03d, -0.05d, 0.16d), new HitboxNode(4, 4, -0.03d, -0.05d, 0.16d), new HitboxNode(5, 5, 0.03d, 0.15d, 0.2d), new HitboxNode(6, 6, 0.03d, 0.15d, 0.2d), new HitboxNode(7, 5, 0.03d, 0.15d, 0.15d), new HitboxNode(8, 6, 0.03d, 0.15d, 0.15d)});

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$saveJsonIO$1 */
    /* JADX INFO: compiled from: HitboxConfigManager.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager", m4426f = "HitboxConfigManager.kt", m4427i = {0, 0}, m4428l = {148, 149}, m4429m = "saveJsonIO", m4430n = {"this", "context"}, m4431s = {"L$0", "L$1"})
    static final class C55171 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C55171(Continuation<? super C55171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HitboxConfigManager.this.saveJsonIO(null, null, null, this);
        }
    }

    private HitboxConfigManager() {
    }

    /* JADX INFO: compiled from: HitboxConfigManager.kt */
    @Metadata(m4415d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/hitbox/HitboxConfigManager$HitboxNode;", "", "n1", "", "n2", "n3", "", "n4", "n5", "(IIDDD)V", "getN1", "()I", "getN2", "getN3", "()D", "getN4", "getN5", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final /* data */ class HitboxNode {
        private final int n1;
        private final int n2;
        private final double n3;
        private final double n4;
        private final double n5;

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getN1() {
            return this.n1;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getN2() {
            return this.n2;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final double getN3() {
            return this.n3;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final double getN4() {
            return this.n4;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final double getN5() {
            return this.n5;
        }

        public final HitboxNode copy(int n1, int n2, double n3, double n4, double n5) {
            return new HitboxNode(n1, n2, n3, n4, n5);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HitboxNode)) {
                return false;
            }
            HitboxNode hitboxNode = (HitboxNode) other;
            return this.n1 == hitboxNode.n1 && this.n2 == hitboxNode.n2 && Double.compare(this.n3, hitboxNode.n3) == 0 && Double.compare(this.n4, hitboxNode.n4) == 0 && Double.compare(this.n5, hitboxNode.n5) == 0;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.n1) * 31) + Integer.hashCode(this.n2)) * 31) + Double.hashCode(this.n3)) * 31) + Double.hashCode(this.n4)) * 31) + Double.hashCode(this.n5);
        }

        public String toString() {
            return "HitboxNode(n1=" + this.n1 + ", n2=" + this.n2 + ", n3=" + this.n3 + ", n4=" + this.n4 + ", n5=" + this.n5 + ')';
        }

        public HitboxNode(int n1, int n2, double n3, double n4, double n5) {
            this.n1 = n1;
            this.n2 = n2;
            this.n3 = n3;
            this.n4 = n4;
            this.n5 = n5;
        }

        public final int getN1() {
            return this.n1;
        }

        public final int getN2() {
            return this.n2;
        }

        public final double getN3() {
            return this.n3;
        }

        public final double getN4() {
            return this.n4;
        }

        public final double getN5() {
            return this.n5;
        }
    }

    static {
        Iterable $this$map$iv = stockNodes;
        Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            HitboxNode it = (HitboxNode) item$iv$iv;
            destination$iv$iv.add(Integer.valueOf(it.getN1()));
        }
        validPedNodes = CollectionsKt___CollectionsKt.toSet((List) destination$iv$iv);
        Iterable $this$map$iv2 = stockNodes;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv2, 10));
        for (Object item$iv$iv2 : $this$map$iv2) {
            HitboxNode it2 = (HitboxNode) item$iv$iv2;
            destination$iv$iv2.add(Integer.valueOf(it2.getN2()));
        }
        validPieceTypes = CollectionsKt___CollectionsKt.toSet((List) destination$iv$iv2);
    }

    static /* synthetic */ JSONObject buildNodeJson$default(HitboxConfigManager hitboxConfigManager, HitboxNode hitboxNode, double d, int i, Object obj) {
        if ((i & 2) != 0) {
            d = hitboxNode.getN5();
        }
        return hitboxConfigManager.buildNodeJson(hitboxNode, d);
    }

    private final JSONObject buildNodeJson(HitboxNode node, double radius) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("n1", node.getN1()).put("n2", node.getN2()).put("n3", node.getN3()).put("n4", node.getN4()).put("n5", radius);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    static /* synthetic */ JSONObject buildStockRoot$default(HitboxConfigManager hitboxConfigManager, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = 1.0d;
        }
        return hitboxConfigManager.buildStockRoot(d);
    }

    private final JSONObject buildStockRoot(double scaleFactor) throws JSONException {
        JSONArray newNodes = new JSONArray();
        Iterable $this$forEach$iv = stockNodes;
        for (Object element$iv : $this$forEach$iv) {
            HitboxNode node = (HitboxNode) element$iv;
            newNodes.put(INSTANCE.buildNodeJson(node, node.getN5() * scaleFactor));
        }
        JSONObject jSONObjectPut = new JSONObject().put("nodes", newNodes);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    private final Double readFiniteDouble(JSONObject node, String key) {
        Object objOpt = node.opt(key);
        Number raw = objOpt instanceof Number ? (Number) objOpt : null;
        if (raw == null) {
            return null;
        }
        double value = raw.doubleValue();
        Double dValueOf = Double.valueOf(value);
        double it = dValueOf.doubleValue();
        if ((Double.isInfinite(it) || Double.isNaN(it)) ? false : true) {
            return dValueOf;
        }
        return null;
    }

    private final Integer readFiniteInt(JSONObject node, String key) {
        Object objOpt = node.opt(key);
        Number raw = objOpt instanceof Number ? (Number) objOpt : null;
        if (raw == null) {
            return null;
        }
        double value = raw.doubleValue();
        if (!((Double.isInfinite(value) || Double.isNaN(value)) ? false : true)) {
            return null;
        }
        int intValue = (int) value;
        Integer numValueOf = Integer.valueOf(intValue);
        numValueOf.intValue();
        if (((double) intValue) == value) {
            return numValueOf;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    private final boolean isLegacyBrokenPattern(JSONArray nodes) {
        boolean z;
        boolean z2;
        if (nodes.length() < legacyBrokenNodes.size()) {
            return false;
        }
        int i = 0;
        int size = legacyBrokenNodes.size();
        while (true) {
            if (i >= size) {
                return true;
            }
            JSONObject node = nodes.optJSONObject(i);
            if (node == null) {
                return false;
            }
            HitboxNode legacy = legacyBrokenNodes.get(i);
            Integer finiteInt = readFiniteInt(node, "n1");
            int n1 = legacy.getN1();
            if (finiteInt == null || finiteInt.intValue() != n1) {
                return false;
            }
            Integer finiteInt2 = readFiniteInt(node, "n2");
            int n2 = legacy.getN2();
            if (finiteInt2 == null || finiteInt2.intValue() != n2) {
                return false;
            }
            Double finiteDouble = readFiniteDouble(node, "n3");
            if (finiteDouble != null) {
                double it = finiteDouble.doubleValue();
                if ((Math.abs(it - legacy.getN3()) <= EPS ? 1 : 0) == 1) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            Double finiteDouble2 = readFiniteDouble(node, "n4");
            if (finiteDouble2 != null) {
                double it2 = finiteDouble2.doubleValue();
                z2 = ((Math.abs(it2 - legacy.getN4()) > EPS ? 1 : (Math.abs(it2 - legacy.getN4()) == EPS ? 0 : -1)) <= 0 ? 1 : 0) == 1;
            }
            if (!z2) {
                return false;
            }
            i++;
        }
    }

    public final String getStockJsonString() throws JSONException {
        String string = buildStockRoot$default(this, Constants.DEFAULT_DOUBLE_VALUE, 1, null).toString(4);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final JSONArray getStockNodes() {
        JSONArray jSONArray = buildStockRoot$default(this, Constants.DEFAULT_DOUBLE_VALUE, 1, null).getJSONArray("nodes");
        Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
        return jSONArray;
    }

    public final String buildScaledJson(int percent) throws JSONException {
        int p = RangesKt___RangesKt.coerceIn(percent, 0, 100);
        double factor = (((double) p) / 10.0d) + 1.0d;
        String string = buildStockRoot(factor).toString(4);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$ensureExistsIO$2 */
    /* JADX INFO: compiled from: HitboxConfigManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$ensureExistsIO$2", m4426f = "HitboxConfigManager.kt", m4427i = {}, m4428l = {131}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55132 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ int $initialPercent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55132(Context context, int i, Continuation<? super C55132> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$initialPercent = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55132(this.$context, this.$initialPercent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55132) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            C55132 c55132;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    File file = new File(this.$context.getFilesDir(), HitboxConfigManager.FILE_NAME);
                    if (!file.exists()) {
                        FileWriter fileWriter = new FileWriter(file);
                        try {
                            FileWriter it = fileWriter;
                            it.write(HitboxConfigManager.INSTANCE.buildScaledJson(this.$initialPercent));
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(fileWriter, null);
                            this.label = 1;
                            if (HitboxConfigManager.INSTANCE.copyToExternalIO(this.$context, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c55132 = this;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(fileWriter, th);
                                throw th2;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 1:
                    c55132 = this;
                    ResultKt.throwOnFailure($result);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static /* synthetic */ Object ensureExistsIO$default(HitboxConfigManager hitboxConfigManager, Context context, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 20;
        }
        return hitboxConfigManager.ensureExistsIO(context, i, continuation);
    }

    public final Object ensureExistsIO(Context context, int initialPercent, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C55132(context, initialPercent, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$readJsonIO$2 */
    /* JADX INFO: compiled from: HitboxConfigManager.kt */
    @Metadata(m4415d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, m4416d2 = {"<anonymous>", "Lkotlin/Pair;", "Ljava/io/File;", "Lorg/json/JSONObject;", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$readJsonIO$2", m4426f = "HitboxConfigManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55152 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends File, ? extends JSONObject>>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55152(Context context, Continuation<? super C55152> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55152(this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends File, ? extends JSONObject>> continuation) {
            return ((C55152) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    File file = new File(this.$context.getFilesDir(), HitboxConfigManager.FILE_NAME);
                    if (!file.exists()) {
                        FileWriter fileWriter = new FileWriter(file);
                        try {
                            FileWriter it = fileWriter;
                            it.write(HitboxConfigManager.INSTANCE.buildScaledJson(20));
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(fileWriter, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(fileWriter, th);
                                throw th2;
                            }
                        }
                    }
                    return TuplesKt.m4423to(file, new JSONObject(FilesKt__FileReadWriteKt.readText$default(file, null, 1, null)));
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Object readJsonIO(Context context, Continuation<? super Pair<? extends File, ? extends JSONObject>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C55152(context, null), continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$writeJsonIO$2 */
    /* JADX INFO: compiled from: HitboxConfigManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$writeJsonIO$2", m4426f = "HitboxConfigManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55192 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ File $file;
        final /* synthetic */ String $jsonText;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55192(File file, String str, Continuation<? super C55192> continuation) {
            super(2, continuation);
            this.$file = file;
            this.$jsonText = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55192(this.$file, this.$jsonText, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55192) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    FileWriter fileWriter = new FileWriter(this.$file);
                    try {
                        FileWriter it = fileWriter;
                        it.write(this.$jsonText);
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileWriter, null);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(fileWriter, th);
                            throw th2;
                        }
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Object writeJsonIO(File file, String jsonText, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C55192(file, jsonText, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object saveJsonIO(Context context, File file, JSONObject json, Continuation<? super Unit> continuation) throws JSONException {
        C55171 c55171;
        HitboxConfigManager hitboxConfigManager;
        if (continuation instanceof C55171) {
            c55171 = (C55171) continuation;
            if ((c55171.label & Integer.MIN_VALUE) != 0) {
                c55171.label -= Integer.MIN_VALUE;
            } else {
                c55171 = new C55171(continuation);
            }
        } else {
            c55171 = new C55171(continuation);
        }
        C55171 c55172 = c55171;
        Object $result = c55172.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c55172.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                String string = json.toString(4);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                c55172.L$0 = this;
                c55172.L$1 = context;
                c55172.label = 1;
                if (writeJsonIO(file, string, c55172) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hitboxConfigManager = this;
                c55172.L$0 = null;
                c55172.L$1 = null;
                c55172.label = 2;
                if (hitboxConfigManager.copyToExternalIO(context, c55172) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                context = (Context) c55172.L$1;
                hitboxConfigManager = (HitboxConfigManager) c55172.L$0;
                ResultKt.throwOnFailure($result);
                c55172.L$0 = null;
                c55172.L$1 = null;
                c55172.label = 2;
                if (hitboxConfigManager.copyToExternalIO(context, c55172) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$copyToExternalIO$2 */
    /* JADX INFO: compiled from: HitboxConfigManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$copyToExternalIO$2", m4426f = "HitboxConfigManager.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55122 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55122(Context context, Continuation<? super C55122> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55122(this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55122) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    File internal = new File(this.$context.getFilesDir(), HitboxConfigManager.FILE_NAME);
                    File fileResolve = null;
                    File externalRoot = this.$context.getExternalFilesDir(null);
                    File externalRootFile = externalRoot != null ? new File(externalRoot, HitboxConfigManager.FILE_NAME) : null;
                    if (externalRoot != null) {
                        File $this$invokeSuspend_u24lambda_u242_u24lambda_u241 = new File(externalRoot, "NEIZZIR");
                        $this$invokeSuspend_u24lambda_u242_u24lambda_u241.mkdirs();
                        fileResolve = FilesKt__UtilsKt.resolve($this$invokeSuspend_u24lambda_u242_u24lambda_u241, HitboxConfigManager.FILE_NAME);
                    }
                    File externalNeizzirFile = fileResolve;
                    if (!internal.exists()) {
                        return Unit.INSTANCE;
                    }
                    if (externalRootFile != null) {
                        FilesKt__UtilsKt.copyTo$default(internal, externalRootFile, true, 0, 4, null);
                    }
                    if (externalNeizzirFile != null) {
                        FilesKt__UtilsKt.copyTo$default(internal, externalNeizzirFile, true, 0, 4, null);
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Object copyToExternalIO(Context context, Continuation<Object> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C55122(context, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    public final boolean sanitizeNodes(JSONArray nodes) throws JSONException {
        double n5;
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        int count = Math.min(nodes.length(), stockNodes.size());
        boolean migrateLegacy = isLegacyBrokenPattern(nodes);
        boolean changed = false;
        for (int i = 0; i < count; i++) {
            HitboxNode canonical = stockNodes.get(i);
            JSONObject node = nodes.optJSONObject(i);
            if (node == null) {
                nodes.put(i, buildNodeJson$default(this, canonical, Constants.DEFAULT_DOUBLE_VALUE, 2, null));
                changed = true;
            } else if (migrateLegacy) {
                Double preservedRadius = readFiniteDouble(node, "n5");
                JSONObject jSONObjectPut = node.put("n1", canonical.getN1()).put("n2", canonical.getN2()).put("n3", canonical.getN3()).put("n4", canonical.getN4());
                if (preservedRadius != null) {
                    double it = preservedRadius.doubleValue();
                    Double d = (it > Constants.DEFAULT_DOUBLE_VALUE ? 1 : (it == Constants.DEFAULT_DOUBLE_VALUE ? 0 : -1)) > 0 ? preservedRadius : null;
                    if (d != null) {
                        n5 = d.doubleValue();
                    } else {
                        n5 = canonical.getN5();
                    }
                } else {
                    n5 = canonical.getN5();
                }
                jSONObjectPut.put("n5", n5);
                changed = true;
            } else {
                Integer n1 = readFiniteInt(node, "n1");
                if (n1 == null || !validPedNodes.contains(n1)) {
                    node.put("n1", canonical.getN1());
                    changed = true;
                }
                Integer n2 = readFiniteInt(node, "n2");
                if (n2 == null || !validPieceTypes.contains(n2)) {
                    node.put("n2", canonical.getN2());
                    changed = true;
                }
                Double n3 = readFiniteDouble(node, "n3");
                if (n3 == null) {
                    node.put("n3", canonical.getN3());
                    changed = true;
                }
                Double n4 = readFiniteDouble(node, "n4");
                if (n4 == null) {
                    node.put("n4", canonical.getN4());
                    changed = true;
                }
                Double n6 = readFiniteDouble(node, "n5");
                if (n6 == null || n6.doubleValue() <= Constants.DEFAULT_DOUBLE_VALUE) {
                    node.put("n5", canonical.getN5());
                    changed = true;
                }
            }
        }
        return changed;
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$repairConfigIfNeededIO$2 */
    /* JADX INFO: compiled from: HitboxConfigManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$repairConfigIfNeededIO$2", m4426f = "HitboxConfigManager.kt", m4427i = {0, 1, 2, 2}, m4428l = {234, 243, 251, 259}, m4429m = "invokeSuspend", m4430n = {"file", "file", "file", "changed"}, m4431s = {"L$0", "L$0", "L$0", "Z$0"})
    static final class C55162 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ int $initialPercent;
        Object L$0;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55162(Context context, int i, Continuation<? super C55162> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$initialPercent = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55162(this.$context, this.$initialPercent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C55162) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:69:0x0178 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:70:0x0179  */
        /* JADX WARN: Code duplicated, block: B:74:0x017f  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$repairConfigIfNeededIO$2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            FileWriter fileWriter;
            Object obj;
            boolean changed;
            boolean changed2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C55162 c55162 = this.label;
            try {
                switch (c55162) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        c55162 = this;
                        File file = new File(c55162.$context.getFilesDir(), HitboxConfigManager.FILE_NAME);
                        try {
                            if (!file.exists()) {
                                FileWriter fileWriter2 = new FileWriter(file);
                                try {
                                    FileWriter it = fileWriter2;
                                    it.write(HitboxConfigManager.INSTANCE.buildScaledJson(c55162.$initialPercent));
                                    Unit unit = Unit.INSTANCE;
                                    CloseableKt.closeFinally(fileWriter2, null);
                                    c55162.L$0 = file;
                                    c55162.label = 1;
                                    if (HitboxConfigManager.INSTANCE.copyToExternalIO(c55162.$context, (Continuation) c55162) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    return Boxing.boxBoolean(true);
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        CloseableKt.closeFinally(fileWriter2, th);
                                        throw th2;
                                    }
                                }
                            }
                            JSONObject json = new JSONObject(FilesKt__FileReadWriteKt.readText$default(file, null, 1, null));
                            JSONArray nodes = json.optJSONArray("nodes");
                            if (nodes == null || nodes.length() < HitboxConfigManager.stockNodes.size()) {
                                FileWriter fileWriter3 = new FileWriter(file);
                                try {
                                    FileWriter it2 = fileWriter3;
                                    it2.write(HitboxConfigManager.INSTANCE.buildScaledJson(c55162.$initialPercent));
                                    Unit unit2 = Unit.INSTANCE;
                                    CloseableKt.closeFinally(fileWriter3, null);
                                    c55162.L$0 = file;
                                    c55162.label = 2;
                                    if (HitboxConfigManager.INSTANCE.copyToExternalIO(c55162.$context, (Continuation) c55162) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    return Boxing.boxBoolean(true);
                                } catch (Throwable th3) {
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        CloseableKt.closeFinally(fileWriter3, th3);
                                        throw th4;
                                    }
                                }
                            }
                            changed = HitboxConfigManager.INSTANCE.sanitizeNodes(nodes);
                            if (changed) {
                                FileWriter fileWriter4 = new FileWriter(file);
                                try {
                                    FileWriter it3 = fileWriter4;
                                    it3.write(json.toString(4));
                                    Unit unit3 = Unit.INSTANCE;
                                    CloseableKt.closeFinally(fileWriter4, null);
                                    c55162.L$0 = file;
                                    c55162.Z$0 = changed;
                                    c55162.label = 3;
                                    if (HitboxConfigManager.INSTANCE.copyToExternalIO(c55162.$context, (Continuation) c55162) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    changed2 = changed;
                                    Log.d("HitboxConfig", "Config repaired automatically");
                                    changed = changed2;
                                } catch (Throwable th5) {
                                    try {
                                        throw th5;
                                    } catch (Throwable th6) {
                                        CloseableKt.closeFinally(fileWriter4, th5);
                                        throw th6;
                                    }
                                }
                            }
                            return Boxing.boxBoolean(changed);
                            FileWriter it4 = fileWriter;
                            it4.write(HitboxConfigManager.INSTANCE.buildScaledJson(c55162.$initialPercent));
                            Unit unit4 = Unit.INSTANCE;
                            CloseableKt.closeFinally(fileWriter, null);
                            c55162.L$0 = null;
                            c55162.label = 4;
                            if (HitboxConfigManager.INSTANCE.copyToExternalIO(c55162.$context, c55162) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj = c55162;
                            changed = true;
                            return Boxing.boxBoolean(changed);
                        } catch (Throwable th7) {
                            try {
                                throw th7;
                            } catch (Throwable th8) {
                                CloseableKt.closeFinally(fileWriter, th7);
                                throw th8;
                            }
                        }
                        Log.e("HitboxConfig", "repairConfigIfNeededIO failed: " + e.getMessage());
                        fileWriter = new FileWriter(file);
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        return Boxing.boxBoolean(true);
                    case 2:
                        ResultKt.throwOnFailure($result);
                        return Boxing.boxBoolean(true);
                    case 3:
                        changed2 = this.Z$0;
                        ResultKt.throwOnFailure($result);
                        Log.d("HitboxConfig", "Config repaired automatically");
                        changed = changed2;
                        return Boxing.boxBoolean(changed);
                    case 4:
                        obj = this;
                        ResultKt.throwOnFailure($result);
                        changed = true;
                        return Boxing.boxBoolean(changed);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e) {
                Log.e("HitboxConfig", "repairConfigIfNeededIO failed: " + e.getMessage());
                fileWriter = new FileWriter(file);
                FileWriter it5 = fileWriter;
                it5.write(HitboxConfigManager.INSTANCE.buildScaledJson(c55162.$initialPercent));
                Unit unit5 = Unit.INSTANCE;
                CloseableKt.closeFinally(fileWriter, null);
                c55162.L$0 = null;
                c55162.label = 4;
                if (HitboxConfigManager.INSTANCE.copyToExternalIO(c55162.$context, c55162) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = c55162;
            }
        }
    }

    public static /* synthetic */ Object repairConfigIfNeededIO$default(HitboxConfigManager hitboxConfigManager, Context context, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 20;
        }
        return hitboxConfigManager.repairConfigIfNeededIO(context, i, continuation);
    }

    public final Object repairConfigIfNeededIO(Context context, int initialPercent, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C55162(context, initialPercent, null), continuation);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$initOnAppStart$1 */
    /* JADX INFO: compiled from: HitboxConfigManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$initOnAppStart$1", m4426f = "HitboxConfigManager.kt", m4427i = {}, m4428l = {267, 268}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55141(Context context, Continuation<? super C55141> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C55141 c55141 = new C55141(this.$context, continuation);
            c55141.L$0 = obj;
            return c55141;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x005e  */
        /* JADX WARN: Code duplicated, block: B:34:0x008e  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r10v0 */
        /* JADX WARN: Type inference failed for: r12v14 */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v7 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            ?? r0;
            Object objM15551constructorimpl;
            Throwable thM15554exceptionOrNullimpl;
            int i;
            C55141 c55141;
            Context context;
            ?? r12;
            ?? r7;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? RepairConfigIfNeededIO$default = this.label;
            try {
                switch (RepairConfigIfNeededIO$default) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        Context context2 = this.$context;
                        Result.Companion companion = Result.INSTANCE;
                        i = 0;
                        HitboxConfigManager hitboxConfigManager = HitboxConfigManager.INSTANCE;
                        this.L$0 = context2;
                        this.label = 1;
                        if (HitboxConfigManager.ensureExistsIO$default(hitboxConfigManager, context2, 0, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c55141 = this;
                        context = context2;
                        try {
                            HitboxConfigManager hitboxConfigManager2 = HitboxConfigManager.INSTANCE;
                            c55141.L$0 = null;
                            c55141.label = 2;
                            RepairConfigIfNeededIO$default = HitboxConfigManager.repairConfigIfNeededIO$default(hitboxConfigManager2, context, 0, c55141, 2, null);
                            if (RepairConfigIfNeededIO$default == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r12 = RepairConfigIfNeededIO$default;
                            r7 = c55141;
                            try {
                                objM15551constructorimpl = Result.m15551constructorimpl(Boxing.boxBoolean(((Boolean) r12).booleanValue()));
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                                obj = obj;
                                r0 = r7;
                                Result.Companion companion2 = Result.INSTANCE;
                                objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                            }
                            thM15554exceptionOrNullimpl = Result.m15554exceptionOrNullimpl(objM15551constructorimpl);
                            if (thM15554exceptionOrNullimpl != null) {
                                Log.e("HitboxConfig", "initOnAppStart: " + thM15554exceptionOrNullimpl.getMessage());
                            }
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th = th3;
                            r0 = c55141;
                            Result.Companion companion3 = Result.INSTANCE;
                            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                            thM15554exceptionOrNullimpl = Result.m15554exceptionOrNullimpl(objM15551constructorimpl);
                            if (thM15554exceptionOrNullimpl != null) {
                                Log.e("HitboxConfig", "initOnAppStart: " + thM15554exceptionOrNullimpl.getMessage());
                            }
                            return Unit.INSTANCE;
                        }
                    case 1:
                        Context context3 = (Context) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        c55141 = this;
                        i = 0;
                        context = context3;
                        HitboxConfigManager hitboxConfigManager3 = HitboxConfigManager.INSTANCE;
                        c55141.L$0 = null;
                        c55141.label = 2;
                        RepairConfigIfNeededIO$default = HitboxConfigManager.repairConfigIfNeededIO$default(hitboxConfigManager3, context, 0, c55141, 2, null);
                        if (RepairConfigIfNeededIO$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r12 = RepairConfigIfNeededIO$default;
                        r7 = c55141;
                        objM15551constructorimpl = Result.m15551constructorimpl(Boxing.boxBoolean(((Boolean) r12).booleanValue()));
                        thM15554exceptionOrNullimpl = Result.m15554exceptionOrNullimpl(objM15551constructorimpl);
                        if (thM15554exceptionOrNullimpl != null) {
                            Log.e("HitboxConfig", "initOnAppStart: " + thM15554exceptionOrNullimpl.getMessage());
                        }
                        return Unit.INSTANCE;
                    case 2:
                        r0 = this;
                        try {
                            ResultKt.throwOnFailure(obj);
                            r7 = r0;
                            r12 = obj;
                            objM15551constructorimpl = Result.m15551constructorimpl(Boxing.boxBoolean(((Boolean) r12).booleanValue()));
                            break;
                        } catch (Throwable th4) {
                            th = th4;
                            Result.Companion companion4 = Result.INSTANCE;
                            objM15551constructorimpl = Result.m15551constructorimpl(ResultKt.createFailure(th));
                            thM15554exceptionOrNullimpl = Result.m15554exceptionOrNullimpl(objM15551constructorimpl);
                            if (thM15554exceptionOrNullimpl != null) {
                                Log.e("HitboxConfig", "initOnAppStart: " + thM15554exceptionOrNullimpl.getMessage());
                            }
                            return Unit.INSTANCE;
                        }
                        thM15554exceptionOrNullimpl = Result.m15554exceptionOrNullimpl(objM15551constructorimpl);
                        if (thM15554exceptionOrNullimpl != null) {
                            Log.e("HitboxConfig", "initOnAppStart: " + thM15554exceptionOrNullimpl.getMessage());
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th5) {
                ?? r10 = RepairConfigIfNeededIO$default;
                th = th5;
                r0 = r10;
            }
        }
    }

    public final void initOnAppStart(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C55141(context, null), 3, null);
    }

    public final void showEditor(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AlertDialog preloader = new AlertDialog.Builder(context).setView(new ProgressBar(context)).setCancelable(false).create();
        Intrinsics.checkNotNullExpressionValue(preloader, "create(...)");
        preloader.show();
        CoroutineScope uiScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        BuildersKt__Builders_commonKt.launch$default(uiScope, null, null, new C55181(context, preloader, uiScope, null), 3, null);
    }

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$showEditor$1 */
    /* JADX INFO: compiled from: HitboxConfigManager.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$showEditor$1", m4426f = "HitboxConfigManager.kt", m4427i = {2}, m4428l = {286, 287, 288}, m4429m = "invokeSuspend", m4430n = {"repaired"}, m4431s = {"Z$0"})
    static final class C55181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ AlertDialog $preloader;
        final /* synthetic */ CoroutineScope $uiScope;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55181(Context context, AlertDialog alertDialog, CoroutineScope coroutineScope, Continuation<? super C55181> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$preloader = alertDialog;
            this.$uiScope = coroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55181(this.$context, this.$preloader, this.$uiScope, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0066 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x0067  */
        /* JADX WARN: Code duplicated, block: B:31:0x0083 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x0084  */
        /* JADX WARN: Code duplicated, block: B:35:0x009c A[Catch: Exception -> 0x00b6, JSONException -> 0x00bb, TryCatch #5 {JSONException -> 0x00bb, Exception -> 0x00b6, blocks: (B:33:0x0087, B:35:0x009c, B:36:0x00ab), top: B:55:0x0087 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Exception e;
            C55181 c55181;
            JSONException e2;
            C55181 c55182;
            Object objRepairConfigIfNeededIO$default;
            C55181 c55183;
            boolean zBooleanValue;
            Object jsonIO;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                switch (r1) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        c55182 = this;
                        c55182.label = 1;
                        if (HitboxConfigManager.ensureExistsIO$default(HitboxConfigManager.INSTANCE, c55182.$context, 0, c55182, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c55182.label = 2;
                        objRepairConfigIfNeededIO$default = HitboxConfigManager.repairConfigIfNeededIO$default(HitboxConfigManager.INSTANCE, c55182.$context, 0, c55182, 2, null);
                        if (objRepairConfigIfNeededIO$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = objRepairConfigIfNeededIO$default;
                        c55183 = c55182;
                        try {
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            c55183.Z$0 = zBooleanValue;
                            c55183.label = 3;
                            jsonIO = HitboxConfigManager.INSTANCE.readJsonIO(c55183.$context, c55183);
                            if (jsonIO == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c55181 = c55183;
                            z = zBooleanValue;
                            obj = jsonIO;
                            try {
                                Pair pair = (Pair) obj;
                                File file = (File) pair.component1();
                                JSONObject jSONObject = (JSONObject) pair.component2();
                                c55181.$preloader.dismiss();
                                if (z) {
                                    Toast.makeText(c55181.$context, "Обнаружены некорректные значения хитбокса, они исправлены автоматически", 1).show();
                                }
                                HitboxConfigManager.INSTANCE.buildDialog(c55181.$context, file, jSONObject, c55181.$uiScope);
                                break;
                            } catch (JSONException e3) {
                                Object obj2 = obj;
                                e2 = e3;
                                obj = obj2;
                                c55181.$preloader.dismiss();
                                Log.e("HitboxConfig", "JSON error: " + e2.getMessage());
                                Toast.makeText(c55181.$context, "Ошибка JSON", 0).show();
                            } catch (Exception e4) {
                                Object obj3 = obj;
                                e = e4;
                                obj = obj3;
                                c55181.$preloader.dismiss();
                                Toast.makeText(c55181.$context, "Ошибка: " + e.getMessage(), 0).show();
                            }
                            return Unit.INSTANCE;
                        } catch (JSONException e5) {
                            c55181 = c55183;
                            e2 = e5;
                            obj = obj;
                            c55181.$preloader.dismiss();
                            Log.e("HitboxConfig", "JSON error: " + e2.getMessage());
                            Toast.makeText(c55181.$context, "Ошибка JSON", 0).show();
                            return Unit.INSTANCE;
                        } catch (Exception e6) {
                            c55181 = c55183;
                            e = e6;
                            obj = obj;
                            c55181.$preloader.dismiss();
                            Toast.makeText(c55181.$context, "Ошибка: " + e.getMessage(), 0).show();
                            return Unit.INSTANCE;
                        }
                    case 1:
                        c55182 = this;
                        ResultKt.throwOnFailure(obj);
                        c55182.label = 2;
                        objRepairConfigIfNeededIO$default = HitboxConfigManager.repairConfigIfNeededIO$default(HitboxConfigManager.INSTANCE, c55182.$context, 0, c55182, 2, null);
                        if (objRepairConfigIfNeededIO$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = objRepairConfigIfNeededIO$default;
                        c55183 = c55182;
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        c55183.Z$0 = zBooleanValue;
                        c55183.label = 3;
                        jsonIO = HitboxConfigManager.INSTANCE.readJsonIO(c55183.$context, c55183);
                        if (jsonIO == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c55181 = c55183;
                        z = zBooleanValue;
                        obj = jsonIO;
                        Pair pair2 = (Pair) obj;
                        File file2 = (File) pair2.component1();
                        JSONObject jSONObject2 = (JSONObject) pair2.component2();
                        c55181.$preloader.dismiss();
                        if (z) {
                            Toast.makeText(c55181.$context, "Обнаружены некорректные значения хитбокса, они исправлены автоматически", 1).show();
                        }
                        HitboxConfigManager.INSTANCE.buildDialog(c55181.$context, file2, jSONObject2, c55181.$uiScope);
                        return Unit.INSTANCE;
                    case 2:
                        ResultKt.throwOnFailure(obj);
                        c55183 = this;
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        c55183.Z$0 = zBooleanValue;
                        c55183.label = 3;
                        jsonIO = HitboxConfigManager.INSTANCE.readJsonIO(c55183.$context, c55183);
                        if (jsonIO == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c55181 = c55183;
                        z = zBooleanValue;
                        obj = jsonIO;
                        Pair pair3 = (Pair) obj;
                        File file3 = (File) pair3.component1();
                        JSONObject jSONObject3 = (JSONObject) pair3.component2();
                        c55181.$preloader.dismiss();
                        if (z) {
                            Toast.makeText(c55181.$context, "Обнаружены некорректные значения хитбокса, они исправлены автоматически", 1).show();
                        }
                        HitboxConfigManager.INSTANCE.buildDialog(c55181.$context, file3, jSONObject3, c55181.$uiScope);
                        return Unit.INSTANCE;
                    case 3:
                        c55181 = this;
                        boolean z2 = c55181.Z$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            z = z2;
                            obj = obj;
                            c55181 = c55181;
                            Pair pair4 = (Pair) obj;
                            File file4 = (File) pair4.component1();
                            JSONObject jSONObject4 = (JSONObject) pair4.component2();
                            c55181.$preloader.dismiss();
                            if (z) {
                                Toast.makeText(c55181.$context, "Обнаружены некорректные значения хитбокса, они исправлены автоматически", 1).show();
                            }
                            HitboxConfigManager.INSTANCE.buildDialog(c55181.$context, file4, jSONObject4, c55181.$uiScope);
                            break;
                        } catch (JSONException e7) {
                            e2 = e7;
                            c55181.$preloader.dismiss();
                            Log.e("HitboxConfig", "JSON error: " + e2.getMessage());
                            Toast.makeText(c55181.$context, "Ошибка JSON", 0).show();
                            return Unit.INSTANCE;
                        } catch (Exception e8) {
                            e = e8;
                            c55181.$preloader.dismiss();
                            Toast.makeText(c55181.$context, "Ошибка: " + e.getMessage(), 0).show();
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (JSONException e9) {
                e2 = e9;
                c55181 = r1;
            } catch (Exception e10) {
                e = e10;
                c55181 = r1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [T, androidx.appcompat.app.AlertDialog, java.lang.Object] */
    public final void buildDialog(final Context context, final File file, final JSONObject json, final CoroutineScope scope) throws JSONException {
        AlertDialog alertDialog;
        final JSONArray nodes = json.getJSONArray("nodes");
        List bodyParts = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Голова", "Тело верхняя", "Тело нижняя", "Тело середина", "Верхн. лев. предплечье", "Верхн. прав. предплечье", "Нижняя лев. нога", "Нижняя прав. нога", "Нога левая", "Нога правая"});
        LinearLayout $this$buildDialog_u24lambda_u248 = new LinearLayout(context);
        $this$buildDialog_u24lambda_u248.setOrientation(1);
        $this$buildDialog_u24lambda_u248.setPadding(16, 16, 16, 16);
        final List editTriples = new ArrayList();
        int i = 0;
        for (int length = nodes.length(); i < length; length = length) {
            JSONObject node = nodes.getJSONObject(i);
            double n3 = node.optDouble("n3", Constants.DEFAULT_DOUBLE_VALUE);
            double n4 = node.optDouble("n4", Constants.DEFAULT_DOUBLE_VALUE);
            double n5 = node.optDouble("n5", Constants.DEFAULT_DOUBLE_VALUE);
            TextView $this$buildDialog_u24lambda_u249 = new TextView(context);
            String str = (String) CollectionsKt___CollectionsKt.getOrNull(bodyParts, i);
            $this$buildDialog_u24lambda_u249.setText(str != null ? str : "Часть " + i);
            $this$buildDialog_u24lambda_u249.setTextColor(-1);
            EditText $this$buildDialog_u24lambda_u2410 = new EditText(context);
            $this$buildDialog_u24lambda_u2410.setText(String.valueOf(n3));
            $this$buildDialog_u24lambda_u2410.setInputType(12290);
            $this$buildDialog_u24lambda_u2410.setHint("x=");
            EditText $this$buildDialog_u24lambda_u2411 = new EditText(context);
            $this$buildDialog_u24lambda_u2411.setText(String.valueOf(n4));
            $this$buildDialog_u24lambda_u2411.setInputType($this$buildDialog_u24lambda_u2410.getInputType());
            $this$buildDialog_u24lambda_u2411.setHint("z=");
            EditText $this$buildDialog_u24lambda_u2412 = new EditText(context);
            $this$buildDialog_u24lambda_u2412.setText(String.valueOf(n5));
            $this$buildDialog_u24lambda_u2412.setInputType($this$buildDialog_u24lambda_u2410.getInputType());
            $this$buildDialog_u24lambda_u2412.setHint("radius=");
            LinearLayout $this$buildDialog_u24lambda_u2413 = new LinearLayout(context);
            $this$buildDialog_u24lambda_u2413.setOrientation(0);
            $this$buildDialog_u24lambda_u2413.setGravity(16);
            $this$buildDialog_u24lambda_u2413.addView($this$buildDialog_u24lambda_u2410, new LinearLayout.LayoutParams(0, -2, 1.0f));
            $this$buildDialog_u24lambda_u2413.addView($this$buildDialog_u24lambda_u2411, new LinearLayout.LayoutParams(0, -2, 1.0f));
            $this$buildDialog_u24lambda_u2413.addView($this$buildDialog_u24lambda_u2412, new LinearLayout.LayoutParams(0, -2, 1.0f));
            $this$buildDialog_u24lambda_u248.addView($this$buildDialog_u24lambda_u249);
            $this$buildDialog_u24lambda_u248.addView($this$buildDialog_u24lambda_u2413);
            editTriples.add(new Triple($this$buildDialog_u24lambda_u2410, $this$buildDialog_u24lambda_u2411, $this$buildDialog_u24lambda_u2412));
            i++;
            bodyParts = bodyParts;
        }
        ScrollView $this$buildDialog_u24lambda_u2414 = new ScrollView(context);
        $this$buildDialog_u24lambda_u2414.addView($this$buildDialog_u24lambda_u248);
        LinearLayout $this$buildDialog_u24lambda_u2415 = new LinearLayout(context);
        $this$buildDialog_u24lambda_u2415.setOrientation(1);
        $this$buildDialog_u24lambda_u2415.addView($this$buildDialog_u24lambda_u2414, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        final Ref.ObjectRef dialog = new Ref.ObjectRef();
        Button $this$buildDialog_u24lambda_u2417 = new Button(context);
        $this$buildDialog_u24lambda_u2417.setText("Сохранить");
        $this$buildDialog_u24lambda_u2417.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                HitboxConfigManager.buildDialog$lambda$17$lambda$16(editTriples, context, nodes, scope, file, json, view);
            }
        });
        Button $this$buildDialog_u24lambda_u2419 = new Button(context);
        $this$buildDialog_u24lambda_u2419.setText("Сбросить");
        $this$buildDialog_u24lambda_u2419.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HitboxConfigManager.buildDialog$lambda$19$lambda$18(scope, editTriples, nodes, context, file, json, view);
            }
        });
        Button $this$buildDialog_u24lambda_u2421 = new Button(context);
        $this$buildDialog_u24lambda_u2421.setText("Закрыть");
        $this$buildDialog_u24lambda_u2421.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.hitbox.HitboxConfigManager$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HitboxConfigManager.buildDialog$lambda$21$lambda$20(dialog, view);
            }
        });
        LinearLayout $this$buildDialog_u24lambda_u2422 = new LinearLayout(context);
        $this$buildDialog_u24lambda_u2422.setGravity(GravityCompat.END);
        $this$buildDialog_u24lambda_u2422.addView($this$buildDialog_u24lambda_u2421);
        $this$buildDialog_u24lambda_u2422.addView($this$buildDialog_u24lambda_u2419);
        $this$buildDialog_u24lambda_u2422.addView($this$buildDialog_u24lambda_u2417);
        $this$buildDialog_u24lambda_u2415.addView($this$buildDialog_u24lambda_u2422);
        ?? Create = new AlertDialog.Builder(context).setTitle("Редактор хитбокса").setView($this$buildDialog_u24lambda_u2415).create();
        Intrinsics.checkNotNullExpressionValue(Create, "create(...)");
        dialog.element = Create;
        if (dialog.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) dialog.element;
        }
        alertDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildDialog$lambda$17$lambda$16(List editTriples, Context context, JSONArray $nodes, CoroutineScope scope, File file, JSONObject json, View it) throws JSONException {
        Intrinsics.checkNotNullParameter(editTriples, "$editTriples");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(file, "$file");
        Intrinsics.checkNotNullParameter(json, "$json");
        int i = 0;
        for (int size = editTriples.size(); i < size; size = size) {
            Triple triple = (Triple) editTriples.get(i);
            EditText x = (EditText) triple.component1();
            EditText z = (EditText) triple.component2();
            EditText radius = (EditText) triple.component3();
            Double dx = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(x.getText().toString());
            Double dz = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(z.getText().toString());
            Double dr = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(radius.getText().toString());
            if (dx != null && dz != null) {
                if (dr != null) {
                    $nodes.getJSONObject(i).put("n3", dx.doubleValue()).put("n4", dz.doubleValue()).put("n5", dr.doubleValue());
                    i++;
                }
            }
            Toast.makeText(context, "Ошибка в данных строки " + i, 0).show();
            return;
        }
        HitboxConfigManager hitboxConfigManager = INSTANCE;
        Intrinsics.checkNotNull($nodes);
        boolean repairedBeforeSave = hitboxConfigManager.sanitizeNodes($nodes);
        if (repairedBeforeSave) {
            int size2 = editTriples.size();
            for (int i2 = 0; i2 < size2; i2++) {
                JSONObject node = $nodes.getJSONObject(i2);
                Triple triple2 = (Triple) editTriples.get(i2);
                EditText x2 = (EditText) triple2.component1();
                EditText z2 = (EditText) triple2.component2();
                EditText radius2 = (EditText) triple2.component3();
                x2.setText(String.valueOf(node.getDouble("n3")));
                z2.setText(String.valueOf(node.getDouble("n4")));
                radius2.setText(String.valueOf(node.getDouble("n5")));
            }
        }
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new HitboxConfigManager$buildDialog$save$1$1$1(context, repairedBeforeSave, file, json, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildDialog$lambda$19$lambda$18(CoroutineScope scope, List editTriples, JSONArray $nodes, Context context, File file, JSONObject json, View it) {
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(editTriples, "$editTriples");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(file, "$file");
        Intrinsics.checkNotNullParameter(json, "$json");
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new HitboxConfigManager$buildDialog$reset$1$1$1(editTriples, $nodes, context, file, json, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void buildDialog$lambda$21$lambda$20(Ref.ObjectRef dialog, View it) {
        AlertDialog alertDialog;
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        if (dialog.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) dialog.element;
        }
        alertDialog.dismiss();
    }
}
