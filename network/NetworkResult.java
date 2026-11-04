package com.blackhub.bronline.neizzir.network;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NetworkModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/NetworkResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "Failure", "Success", "Lcom/blackhub/bronline/neizzir/network/NetworkResult$Failure;", "Lcom/blackhub/bronline/neizzir/network/NetworkResult$Success;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public abstract class NetworkResult<T> {
    public /* synthetic */ NetworkResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: NetworkModels.kt */
    @Metadata(m4415d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B)\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0014\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J>\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/NetworkResult$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/blackhub/bronline/neizzir/network/NetworkResult;", "value", "endpoint", "Lcom/blackhub/bronline/neizzir/network/Endpoint;", "source", "Lcom/blackhub/bronline/neizzir/network/NetworkSource;", "stale", "", "(Ljava/lang/Object;Lcom/blackhub/bronline/neizzir/network/Endpoint;Lcom/blackhub/bronline/neizzir/network/NetworkSource;Z)V", "getEndpoint", "()Lcom/blackhub/bronline/neizzir/network/Endpoint;", "getSource", "()Lcom/blackhub/bronline/neizzir/network/NetworkSource;", "getStale", "()Z", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Lcom/blackhub/bronline/neizzir/network/Endpoint;Lcom/blackhub/bronline/neizzir/network/NetworkSource;Z)Lcom/blackhub/bronline/neizzir/network/NetworkResult$Success;", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final /* data */ class Success<T> extends NetworkResult<T> {
        private final Endpoint endpoint;
        private final NetworkSource source;
        private final boolean stale;
        private final T value;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, Endpoint endpoint, NetworkSource networkSource, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = success.value;
            }
            if ((i & 2) != 0) {
                endpoint = success.endpoint;
            }
            if ((i & 4) != 0) {
                networkSource = success.source;
            }
            if ((i & 8) != 0) {
                z = success.stale;
            }
            return success.copy(obj, endpoint, networkSource, z);
        }

        public final T component1() {
            return this.value;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Endpoint getEndpoint() {
            return this.endpoint;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final NetworkSource getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getStale() {
            return this.stale;
        }

        public final Success<T> copy(T value, Endpoint endpoint, NetworkSource source, boolean stale) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Success<>(value, endpoint, source, stale);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.value, success.value) && Intrinsics.areEqual(this.endpoint, success.endpoint) && this.source == success.source && this.stale == success.stale;
        }

        public int hashCode() {
            return ((((((this.value == null ? 0 : this.value.hashCode()) * 31) + (this.endpoint != null ? this.endpoint.hashCode() : 0)) * 31) + this.source.hashCode()) * 31) + Boolean.hashCode(this.stale);
        }

        public String toString() {
            return "Success(value=" + this.value + ", endpoint=" + this.endpoint + ", source=" + this.source + ", stale=" + this.stale + ')';
        }

        public /* synthetic */ Success(Object obj, Endpoint endpoint, NetworkSource networkSource, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, endpoint, networkSource, (i & 8) != 0 ? false : z);
        }

        public final T getValue() {
            return this.value;
        }

        public final Endpoint getEndpoint() {
            return this.endpoint;
        }

        public final NetworkSource getSource() {
            return this.source;
        }

        public final boolean getStale() {
            return this.stale;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(T t, Endpoint endpoint, NetworkSource source, boolean stale) {
            super(null);
            Intrinsics.checkNotNullParameter(source, "source");
            this.value = t;
            this.endpoint = endpoint;
            this.source = source;
            this.stale = stale;
        }
    }

    private NetworkResult() {
    }

    /* JADX INFO: compiled from: NetworkModels.kt */
    @Metadata(m4415d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/network/NetworkResult$Failure;", "Lcom/blackhub/bronline/neizzir/network/NetworkResult;", "", "errors", "", "", "cause", "", "(Ljava/util/List;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getErrors", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final /* data */ class Failure extends NetworkResult {
        private final Throwable cause;
        private final List<String> errors;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Failure copy$default(Failure failure, List list, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                list = failure.errors;
            }
            if ((i & 2) != 0) {
                th = failure.cause;
            }
            return failure.copy(list, th);
        }

        public final List<String> component1() {
            return this.errors;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final Failure copy(List<String> errors, Throwable cause) {
            Intrinsics.checkNotNullParameter(errors, "errors");
            return new Failure(errors, cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return Intrinsics.areEqual(this.errors, failure.errors) && Intrinsics.areEqual(this.cause, failure.cause);
        }

        public int hashCode() {
            return (this.errors.hashCode() * 31) + (this.cause == null ? 0 : this.cause.hashCode());
        }

        public String toString() {
            return "Failure(errors=" + this.errors + ", cause=" + this.cause + ')';
        }

        public /* synthetic */ Failure(List list, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : th);
        }

        public final List<String> getErrors() {
            return this.errors;
        }

        public final Throwable getCause() {
            return this.cause;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(List<String> errors, Throwable cause) {
            super(null);
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.errors = errors;
            this.cause = cause;
        }
    }
}
