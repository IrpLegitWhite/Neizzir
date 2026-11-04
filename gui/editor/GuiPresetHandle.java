package com.blackhub.bronline.neizzir.gui.editor;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GuiEditorModels.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/gui/editor/GuiPresetHandle;", "", "directory", "Ljava/io/File;", "preset", "Lcom/blackhub/bronline/neizzir/gui/editor/GuiEditorPreset;", "(Ljava/io/File;Lcom/blackhub/bronline/neizzir/gui/editor/GuiEditorPreset;)V", "getDirectory", "()Ljava/io/File;", "getPreset", "()Lcom/blackhub/bronline/neizzir/gui/editor/GuiEditorPreset;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final /* data */ class GuiPresetHandle {
    private final File directory;
    private final GuiEditorPreset preset;

    public static /* synthetic */ GuiPresetHandle copy$default(GuiPresetHandle guiPresetHandle, File file, GuiEditorPreset guiEditorPreset, int i, Object obj) {
        if ((i & 1) != 0) {
            file = guiPresetHandle.directory;
        }
        if ((i & 2) != 0) {
            guiEditorPreset = guiPresetHandle.preset;
        }
        return guiPresetHandle.copy(file, guiEditorPreset);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final File getDirectory() {
        return this.directory;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GuiEditorPreset getPreset() {
        return this.preset;
    }

    public final GuiPresetHandle copy(File directory, GuiEditorPreset preset) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(preset, "preset");
        return new GuiPresetHandle(directory, preset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuiPresetHandle)) {
            return false;
        }
        GuiPresetHandle guiPresetHandle = (GuiPresetHandle) other;
        return Intrinsics.areEqual(this.directory, guiPresetHandle.directory) && Intrinsics.areEqual(this.preset, guiPresetHandle.preset);
    }

    public int hashCode() {
        return (this.directory.hashCode() * 31) + this.preset.hashCode();
    }

    public String toString() {
        return "GuiPresetHandle(directory=" + this.directory + ", preset=" + this.preset + ')';
    }

    public GuiPresetHandle(File directory, GuiEditorPreset preset) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(preset, "preset");
        this.directory = directory;
        this.preset = preset;
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final GuiEditorPreset getPreset() {
        return this.preset;
    }
}
