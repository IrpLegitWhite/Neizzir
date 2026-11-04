package com.blackhub.bronline.neizzir.network;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NetworkModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/CachePolicy;", "", "()V", "LastKnownGood", "NetworkOnly", "Lcom/blackhub/bronline/neizzir/network/CachePolicy$LastKnownGood;", "Lcom/blackhub/bronline/neizzir/network/CachePolicy$NetworkOnly;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public abstract class CachePolicy {
    public /* synthetic */ CachePolicy(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: NetworkModels.kt */
    @Metadata(m4415d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/CachePolicy$NetworkOnly;", "Lcom/blackhub/bronline/neizzir/network/CachePolicy;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final /* data */ class NetworkOnly extends CachePolicy {
        public static final NetworkOnly INSTANCE = new NetworkOnly();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NetworkOnly)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -445475251;
        }

        public String toString() {
            return "NetworkOnly";
        }

        private NetworkOnly() {
            super(null);
        }
    }

    private CachePolicy() {
    }

    /* JADX INFO: compiled from: NetworkModels.kt */
    @Metadata(m4415d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/CachePolicy$LastKnownGood;", "Lcom/blackhub/bronline/neizzir/network/CachePolicy;", "key", "", "freshForMs", "", "(Ljava/lang/String;J)V", "getFreshForMs", "()J", "getKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final /* data */ class LastKnownGood extends CachePolicy {
        private final long freshForMs;
        private final String key;

        public static /* synthetic */ LastKnownGood copy$default(LastKnownGood lastKnownGood, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = lastKnownGood.key;
            }
            if ((i & 2) != 0) {
                j = lastKnownGood.freshForMs;
            }
            return lastKnownGood.copy(str, j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getFreshForMs() {
            return this.freshForMs;
        }

        public final LastKnownGood copy(String key, long freshForMs) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new LastKnownGood(key, freshForMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LastKnownGood)) {
                return false;
            }
            LastKnownGood lastKnownGood = (LastKnownGood) other;
            return Intrinsics.areEqual(this.key, lastKnownGood.key) && this.freshForMs == lastKnownGood.freshForMs;
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + Long.hashCode(this.freshForMs);
        }

        public String toString() {
            return "LastKnownGood(key=" + this.key + ", freshForMs=" + this.freshForMs + ')';
        }

        public /* synthetic */ LastKnownGood(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? 60000L : j);
        }

        public final String getKey() {
            return this.key;
        }

        public final long getFreshForMs() {
            return this.freshForMs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LastKnownGood(String key, long freshForMs) {
            super(null);
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.freshForMs = freshForMs;
        }
    }
}
