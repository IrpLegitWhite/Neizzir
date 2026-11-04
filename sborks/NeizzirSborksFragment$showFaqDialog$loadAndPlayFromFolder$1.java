package com.blackhub.bronline.neizzir.fragments.sborks;

import android.widget.Toast;
import com.blackhub.bronline.neizzir.fragments.sborks.media.SoundPlayer;
import com.blackhub.bronline.neizzir.network.CachePolicy;
import com.blackhub.bronline.neizzir.network.Endpoint;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.EndpointRouter;
import com.blackhub.bronline.neizzir.network.NetworkResult;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.p043io.files.FileSystemKt;

/* JADX INFO: compiled from: NeizzirSborksFragment.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
@DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1", m4426f = "NeizzirSborksFragment.kt", m4427i = {0}, m4428l = {555, 567}, m4429m = "invokeSuspend", m4430n = {"$this$launch"}, m4431s = {"L$0"})
final class NeizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $relativeFolder;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NeizzirSborksFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NeizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1(String str, NeizzirSborksFragment neizzirSborksFragment, Continuation<? super NeizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1> continuation) {
        super(2, continuation);
        this.$relativeFolder = str;
        this.this$0 = neizzirSborksFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NeizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1 neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1 = new NeizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1(this.$relativeFolder, this.this$0, continuation);
        neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1.L$0 = obj;
        return neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NeizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0081  */
    /* JADX WARN: Code duplicated, block: B:14:0x0085  */
    /* JADX WARN: Code duplicated, block: B:16:0x0088  */
    /* JADX WARN: Code duplicated, block: B:18:0x009f  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00e2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        NeizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1 neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1;
        Object $result2;
        Object bytes;
        NetworkResult result;
        NetworkResult.Success success;
        String text;
        Endpoint endpoint;
        Endpoint endpoint2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1 = this;
                $result2 = $result;
                CoroutineScope $this$launch = (CoroutineScope) neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1.L$0;
                EndpointRouter router = NetworkRuntime.INSTANCE.getRouter();
                EndpointGroup endpointGroup = EndpointGroup.KOLSON;
                String str = neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1.$relativeFolder;
                CachePolicy.LastKnownGood lastKnownGood = new CachePolicy.LastKnownGood("sborks-sounds:" + neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1.$relativeFolder, 0L, 2, null);
                C5558x75a3bcc6 c5558x75a3bcc6 = new Function1<byte[], Boolean>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1$result$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(byte[] it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(!(it.length == 0));
                    }
                };
                neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1.L$0 = $this$launch;
                neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1.label = 1;
                bytes = router.getBytes(endpointGroup, str, (4 & 4) != 0 ? CachePolicy.NetworkOnly.INSTANCE : lastKnownGood, (4 & 8) != 0 ? 2097152L : 0L, (4 & 16) != 0 ? EndpointRouter.C56582.INSTANCE : c5558x75a3bcc6, neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1);
                if (bytes == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result = (NetworkResult) bytes;
                if (result instanceof NetworkResult.Success) {
                    success = (NetworkResult.Success) result;
                } else {
                    success = null;
                }
                if (success == null) {
                    Toast.makeText(neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1.this$0.requireContext(), "Звуки не найдены", 0).show();
                    return Unit.INSTANCE;
                }
                NetworkResult.Success success2 = success;
                text = new String((byte[]) success2.getValue(), Charsets.UTF_8);
                endpoint = success2.getEndpoint();
                if (endpoint == null) {
                    endpoint = NetworkRuntime.INSTANCE.getRouter().preferredEndpoint(EndpointGroup.KOLSON);
                }
                endpoint2 = endpoint;
                neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1.L$0 = null;
                neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1.label = 2;
                if (BuildersKt.withContext(Dispatchers.getMain(), new C55551(text, neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1.this$0, neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1.$relativeFolder, endpoint2, null), neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1 = this;
                $result2 = $result;
                ResultKt.throwOnFailure($result2);
                bytes = $result2;
                result = (NetworkResult) bytes;
                if (result instanceof NetworkResult.Success) {
                    success = (NetworkResult.Success) result;
                } else {
                    success = null;
                }
                if (success == null) {
                    Toast.makeText(neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1.this$0.requireContext(), "Звуки не найдены", 0).show();
                    return Unit.INSTANCE;
                }
                NetworkResult.Success success3 = success;
                text = new String((byte[]) success3.getValue(), Charsets.UTF_8);
                endpoint = success3.getEndpoint();
                if (endpoint == null) {
                    endpoint = NetworkRuntime.INSTANCE.getRouter().preferredEndpoint(EndpointGroup.KOLSON);
                }
                endpoint2 = endpoint;
                neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1.L$0 = null;
                neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1.label = 2;
                if (BuildersKt.withContext(Dispatchers.getMain(), new C55551(text, neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1.this$0, neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1.$relativeFolder, endpoint2, null), neizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1$1 */
    /* JADX INFO: compiled from: NeizzirSborksFragment.kt */
    @Metadata(m4415d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m4416d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    @DebugMetadata(m4425c = "com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1$1", m4426f = "NeizzirSborksFragment.kt", m4427i = {}, m4428l = {}, m4429m = "invokeSuspend", m4430n = {}, m4431s = {})
    static final class C55551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Endpoint $endpoint;
        final /* synthetic */ String $relativeFolder;
        final /* synthetic */ String $text;
        int label;
        final /* synthetic */ NeizzirSborksFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C55551(String str, NeizzirSborksFragment neizzirSborksFragment, String str2, Endpoint endpoint, Continuation<? super C55551> continuation) {
            super(2, continuation);
            this.$text = str;
            this.this$0 = neizzirSborksFragment;
            this.$relativeFolder = str2;
            this.$endpoint = endpoint;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55551(this.$text, this.this$0, this.$relativeFolder, this.$endpoint, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C55551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    Regex regex = new Regex("\\b(sound[_-]?\\d+)\\.(mp3|wav)\\b", RegexOption.IGNORE_CASE);
                    List found = CollectionsKt___CollectionsKt.toMutableList((Collection) SequencesKt___SequencesKt.toSet(SequencesKt___SequencesKt.map(Regex.findAll$default(regex, this.$text, 0, 2, null), new Function1<MatchResult, String>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1$1$found$1
                        @Override // kotlin.jvm.functions.Function1
                        public final String invoke(MatchResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return it.getGroupValues().get(1) + '.' + it.getGroupValues().get(2);
                        }
                    })));
                    if (found.isEmpty()) {
                        Regex regex2 = new Regex("\\b(sound[\\w\\-_]*\\.\\w{2,4})\\b", RegexOption.IGNORE_CASE);
                        found.addAll(SequencesKt___SequencesKt.toSet(SequencesKt___SequencesKt.map(Regex.findAll$default(regex2, this.$text, 0, 2, null), new Function1<MatchResult, String>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment.showFaqDialog.loadAndPlayFromFolder.1.1.1
                            @Override // kotlin.jvm.functions.Function1
                            public final String invoke(MatchResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return it.getGroupValues().get(1);
                            }
                        })));
                    }
                    if (found.isEmpty()) {
                        Toast.makeText(this.this$0.requireContext(), "Звуки не найдены", 0).show();
                        return Unit.INSTANCE;
                    }
                    final AnonymousClass2 anonymousClass2 = new Function2<String, String, Integer>() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment.showFaqDialog.loadAndPlayFromFolder.1.1.2
                        private static final Integer invoke$numPart(String s) {
                            String value;
                            MatchResult m = Regex.find$default(new Regex("\\d+"), s, 0, 2, null);
                            if (m == null || (value = m.getValue()) == null) {
                                return null;
                            }
                            return StringsKt__StringNumberConversionsKt.toIntOrNull(value);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Integer invoke(String a2, String b) {
                            int iCompareTo;
                            Intrinsics.checkNotNull(a2);
                            Integer na = invoke$numPart(a2);
                            Intrinsics.checkNotNull(b);
                            Integer nb = invoke$numPart(b);
                            if (na != null && nb != null) {
                                iCompareTo = Intrinsics.compare(na.intValue(), nb.intValue());
                            } else if (na != null) {
                                iCompareTo = -1;
                            } else {
                                iCompareTo = nb != null ? 1 : a2.compareTo(b);
                            }
                            return Integer.valueOf(iCompareTo);
                        }
                    };
                    CollectionsKt__MutableCollectionsJVMKt.sortWith(found, new Comparator() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.NeizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1$1$$ExternalSyntheticLambda0
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            return NeizzirSborksFragment$showFaqDialog$loadAndPlayFromFolder$1.C55551.invokeSuspend$lambda$0(anonymousClass2, obj2, obj3);
                        }
                    });
                    List $this$map$iv = found;
                    String str = this.$relativeFolder;
                    Endpoint endpoint = this.$endpoint;
                    Collection destination$iv$iv = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$map$iv, 10));
                    for (Object item$iv$iv : $this$map$iv) {
                        String fileName = (String) item$iv$iv;
                        destination$iv$iv.add(NetworkRuntime.INSTANCE.getRouter().urlFor(EndpointGroup.KOLSON, StringsKt.trimEnd(str, FileSystemKt.UnixPathSeparator) + FileSystemKt.UnixPathSeparator + fileName, endpoint).getUrl());
                    }
                    List urls = (List) destination$iv$iv;
                    SoundPlayer.INSTANCE.playSequential(urls);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$0(Function2 $tmp0, Object p0, Object p1) {
            return ((Number) $tmp0.invoke(p0, p1)).intValue();
        }
    }
}
