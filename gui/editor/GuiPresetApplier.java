package com.blackhub.bronline.neizzir.gui.editor;

import android.content.Context;
import com.blackhub.bronline.game.core.constants.FirestoreDatabaseConstants;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p040io.FilesKt;
import kotlin.p040io.FilesKt__FileReadWriteKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.p043io.files.FileSystemKt;

/* JADX INFO: compiled from: GuiPresetApplier.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u001e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J \u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiPresetApplier;", "", "context", "Landroid/content/Context;", "bpcRepository", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiBpcRepository;", "textureRepository", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiTextureRepository;", "presetRepository", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiPresetRepository;", "(Landroid/content/Context;Lcom/blackhub/bronline/neizzir/gui/editor/GuiBpcRepository;Lcom/blackhub/bronline/neizzir/gui/editor/GuiTextureRepository;Lcom/blackhub/bronline/neizzir/gui/editor/GuiPresetRepository;)V", "backupRoot", "Ljava/io/File;", "applyPreset", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiPresetApplier$Result;", "handle", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiPresetHandle;", "backupFileName", "", "archivePath", "buildBackupManifest", "texturePaths", "", "ensureGuiBpcWhitelisted", "", FirestoreDatabaseConstants.TIMESTAMP, "writeEntryBackup", "directory", "bytes", "", "Result", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class GuiPresetApplier {
    private final File backupRoot;
    private final GuiBpcRepository bpcRepository;
    private final Context context;
    private final GuiPresetRepository presetRepository;
    private final GuiTextureRepository textureRepository;

    /* JADX INFO: compiled from: GuiPresetApplier.kt */
    @Metadata(m4417k = 3, m4418mv = {1, 9, 0}, m4420xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GuiTexturePatchMode.values().length];
            try {
                iArr[GuiTexturePatchMode.RECOLOR.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[GuiTexturePatchMode.PNG_IMPORT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[GuiTexturePatchMode.BTX_IMPORT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GuiPresetApplier(Context context, GuiBpcRepository bpcRepository, GuiTextureRepository textureRepository, GuiPresetRepository presetRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bpcRepository, "bpcRepository");
        Intrinsics.checkNotNullParameter(textureRepository, "textureRepository");
        Intrinsics.checkNotNullParameter(presetRepository, "presetRepository");
        this.context = context;
        this.bpcRepository = bpcRepository;
        this.textureRepository = textureRepository;
        this.presetRepository = presetRepository;
        this.backupRoot = new File(this.context.getExternalFilesDir("NEIZZIR"), "GUI_BACKUPS");
    }

    public /* synthetic */ GuiPresetApplier(Context context, GuiBpcRepository guiBpcRepository, GuiTextureRepository guiTextureRepository, GuiPresetRepository guiPresetRepository, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new GuiBpcRepository(context) : guiBpcRepository, (i & 4) != 0 ? new GuiTextureRepository(context) : guiTextureRepository, (i & 8) != 0 ? new GuiPresetRepository(context) : guiPresetRepository);
    }

    /* JADX INFO: compiled from: GuiPresetApplier.kt */
    @Metadata(m4415d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiPresetApplier$Result;", "", "backupDir", "Ljava/io/File;", "textureCount", "", "(Ljava/io/File;I)V", "getBackupDir", "()Ljava/io/File;", "getTextureCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    public static final /* data */ class Result {
        private final File backupDir;
        private final int textureCount;

        public static /* synthetic */ Result copy$default(Result result, File file, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                file = result.backupDir;
            }
            if ((i2 & 2) != 0) {
                i = result.textureCount;
            }
            return result.copy(file, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final File getBackupDir() {
            return this.backupDir;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTextureCount() {
            return this.textureCount;
        }

        public final Result copy(File backupDir, int textureCount) {
            Intrinsics.checkNotNullParameter(backupDir, "backupDir");
            return new Result(backupDir, textureCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return Intrinsics.areEqual(this.backupDir, result.backupDir) && this.textureCount == result.textureCount;
        }

        public int hashCode() {
            return (this.backupDir.hashCode() * 31) + Integer.hashCode(this.textureCount);
        }

        public String toString() {
            return "Result(backupDir=" + this.backupDir + ", textureCount=" + this.textureCount + ')';
        }

        public Result(File backupDir, int textureCount) {
            Intrinsics.checkNotNullParameter(backupDir, "backupDir");
            this.backupDir = backupDir;
            this.textureCount = textureCount;
        }

        public final File getBackupDir() {
            return this.backupDir;
        }

        public final int getTextureCount() {
            return this.textureCount;
        }
    }

    public final Result applyPreset(GuiPresetHandle handle) throws IOException {
        byte[] output;
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.bpcRepository.validate();
        this.textureRepository.validate();
        File $this$applyPreset_u24lambda_u240 = new File(this.backupRoot, timestamp());
        $this$applyPreset_u24lambda_u240.mkdirs();
        String originalXaml = this.bpcRepository.readHudXaml();
        Iterable $this$distinctBy$iv = handle.getPreset().getTexturePatches();
        HashSet set$iv = new HashSet();
        ArrayList list$iv = new ArrayList();
        for (Object e$iv : $this$distinctBy$iv) {
            GuiTexturePatch it = (GuiTexturePatch) e$iv;
            if (set$iv.add(it.getArchivePath())) {
                list$iv.add(e$iv);
            }
        }
        ArrayList $this$distinctBy$iv2 = list$iv;
        ArrayList $this$associate$iv = $this$distinctBy$iv2;
        int capacity$iv = RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault($this$associate$iv, 10)), 16);
        Map destination$iv$iv = new LinkedHashMap(capacity$iv);
        for (Object element$iv$iv : $this$associate$iv) {
            GuiTexturePatch patch = (GuiTexturePatch) element$iv$iv;
            Iterable $this$associate$iv2 = $this$associate$iv;
            Pair pairM4423to = TuplesKt.m4423to(patch.getArchivePath(), this.textureRepository.readEntryBytes(patch.getArchivePath()));
            destination$iv$iv.put(pairM4423to.getFirst(), pairM4423to.getSecond());
            $this$associate$iv = $this$associate$iv2;
        }
        byte[] bytes = originalXaml.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        writeEntryBackup($this$applyPreset_u24lambda_u240, GuiBpcRepository.HUD_XAML_ENTRY, bytes);
        for (Map.Entry element$iv : destination$iv$iv.entrySet()) {
            String path = (String) element$iv.getKey();
            byte[] bytes2 = (byte[]) element$iv.getValue();
            writeEntryBackup($this$applyPreset_u24lambda_u240, path, bytes2);
        }
        try {
            String patchedXaml = GuiHudXamlPatcher.INSTANCE.applyPatch(originalXaml, handle.getPreset().getHudPatch());
            this.bpcRepository.replaceHudXaml(patchedXaml);
            Iterable<GuiTexturePatch> $this$forEach$iv = handle.getPreset().getTexturePatches();
            int $i$f$forEach = 0;
            for (GuiTexturePatch patch2 : $this$forEach$iv) {
                switch (WhenMappings.$EnumSwitchMapping$0[patch2.getMode().ordinal()]) {
                    case 1:
                        String color = patch2.getColorHex();
                        if (color == null) {
                            throw new IllegalStateException("У RECOLOR нет colorHex: " + patch2.getArchivePath());
                        }
                        output = this.textureRepository.buildRecoloredBytes(patch2.getArchivePath(), color);
                        break;
                        break;
                    case 2:
                    case 3:
                        String payload = patch2.getPayloadFile();
                        if (payload == null) {
                            throw new IllegalStateException("У импортированной текстуры нет payloadFile: " + patch2.getArchivePath());
                        }
                        File sourceFile = this.presetRepository.payloadFile(handle, payload);
                        GuiTextureRepository guiTextureRepository = this.textureRepository;
                        String patchedXaml2 = patch2.getArchivePath();
                        String sourceName = patch2.getSourceName();
                        if (sourceName == null) {
                            sourceName = sourceFile.getName();
                        }
                        String str = sourceName;
                        Intrinsics.checkNotNull(str);
                        output = guiTextureRepository.buildReplacementBytes(patchedXaml2, str, FilesKt__FileReadWriteKt.readBytes(sourceFile));
                        break;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                this.textureRepository.replaceEntryBytes(patch2.getArchivePath(), output);
                patchedXaml = patchedXaml;
                $this$forEach$iv = $this$forEach$iv;
                $i$f$forEach = $i$f$forEach;
            }
            byte[] bytes3 = buildBackupManifest(handle, destination$iv$iv.keySet()).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes3, "getBytes(...)");
            writeEntryBackup($this$applyPreset_u24lambda_u240, "backup_manifest.txt", bytes3);
            ensureGuiBpcWhitelisted();
            return new Result($this$applyPreset_u24lambda_u240, handle.getPreset().getTexturePatches().size());
        } catch (Throwable t) {
            this.bpcRepository.replaceHudXaml(originalXaml);
            for (Map.Entry element$iv2 : destination$iv$iv.entrySet()) {
                String path2 = (String) element$iv2.getKey();
                byte[] bytes4 = (byte[]) element$iv2.getValue();
                this.textureRepository.replaceEntryBytes(path2, bytes4);
            }
            throw t;
        }
    }

    private final void ensureGuiBpcWhitelisted() {
        boolean exists;
        File neizzirDir = this.context.getExternalFilesDir("NEIZZIR");
        if (neizzirDir == null) {
            throw new IllegalStateException("NEIZZIR external files dir недоступен");
        }
        File whitelistFile = new File(neizzirDir, "whitelist.txt");
        File parentFile = whitelistFile.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        if (!whitelistFile.exists()) {
            FilesKt__FileReadWriteKt.writeText$default(whitelistFile, GuiBpcRepository.GUI_BPC_NAME + '\n', null, 2, null);
            return;
        }
        String text = FilesKt__FileReadWriteKt.readText$default(whitelistFile, null, 1, null);
        Sequence $this$any$iv = SequencesKt___SequencesKt.map(StringsKt__StringsKt.lineSequence(text), new Function1<String, String>() { // from class: com.blackhub.bronline.neizzir.gui.editor.GuiPresetApplier$ensureGuiBpcWhitelisted$exists$1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return StringsKt__StringsKt.trim((CharSequence) it).toString();
            }
        });
        Iterator it = $this$any$iv.iterator();
        while (true) {
            if (it.hasNext()) {
                Object element$iv = it.next();
                String it2 = (String) element$iv;
                if (Intrinsics.areEqual(it2, GuiBpcRepository.GUI_BPC_NAME)) {
                    exists = true;
                    break;
                }
            } else {
                exists = false;
                break;
            }
        }
        if (exists) {
            return;
        }
        String prefix = ((text.length() == 0) || StringsKt__StringsKt.endsWith$default((CharSequence) text, '\n', false, 2, (Object) null) || StringsKt__StringsKt.endsWith$default((CharSequence) text, '\r', false, 2, (Object) null)) ? "" : "\n";
        FilesKt.appendText$default(whitelistFile, prefix + GuiBpcRepository.GUI_BPC_NAME + '\n', null, 2, null);
    }

    private final void writeEntryBackup(File directory, String archivePath, byte[] bytes) {
        File output = new File(directory, backupFileName(archivePath));
        File parentFile = output.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FilesKt.writeBytes(output, bytes);
    }

    private final String backupFileName(String archivePath) {
        return new Regex("[^A-Za-z0-9._-]").replace(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(archivePath, '\\', FileSystemKt.UnixPathSeparator, false, 4, (Object) null), "/", "__", false, 4, (Object) null), "_");
    }

    private final String buildBackupManifest(GuiPresetHandle handle, Set<String> texturePaths) {
        StringBuilder $this$buildBackupManifest_u24lambda_u248 = new StringBuilder();
        StringBuilder sbAppend = $this$buildBackupManifest_u24lambda_u248.append("preset=" + handle.getPreset().getName());
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        Intrinsics.checkNotNullExpressionValue(sbAppend.append('\n'), "append(...)");
        StringBuilder sbAppend2 = $this$buildBackupManifest_u24lambda_u248.append("createdAt=" + handle.getPreset().getCreatedAt());
        Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        Intrinsics.checkNotNullExpressionValue(sbAppend2.append('\n'), "append(...)");
        StringBuilder sbAppend3 = $this$buildBackupManifest_u24lambda_u248.append("entries=Hud/NewHud.xaml");
        Intrinsics.checkNotNullExpressionValue(sbAppend3, "append(...)");
        Intrinsics.checkNotNullExpressionValue(sbAppend3.append('\n'), "append(...)");
        Set<String> $this$forEach$iv = texturePaths;
        for (Object element$iv : $this$forEach$iv) {
            String it = (String) element$iv;
            StringBuilder sbAppend4 = $this$buildBackupManifest_u24lambda_u248.append("entries=" + it);
            Intrinsics.checkNotNullExpressionValue(sbAppend4, "append(...)");
            Intrinsics.checkNotNullExpressionValue(sbAppend4.append('\n'), "append(...)");
        }
        String string = $this$buildBackupManifest_u24lambda_u248.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final String timestamp() {
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
