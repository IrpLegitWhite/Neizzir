package com.blackhub.bronline.neizzir;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
final class NativeRenderDispatcher {
    private int height;
    private final State kolson;
    private final State modules;
    private final FailureReporter reporter;
    private long screenRevision;
    private int width;

    interface FailureReporter {
        void report(String str, UnsatisfiedLinkError unsatisfiedLinkError);
    }

    interface Renderer {
        void step();

        void updateScreen(int i, int i2);
    }

    private static final class State {
        boolean disabled;
        final String name;
        long observedGeneration;
        final Renderer renderer;
        final AtomicLong loadGeneration = new AtomicLong();
        long screenRevision = -1;

        State(String name, Renderer renderer) {
            this.name = name;
            this.renderer = renderer;
        }
    }

    NativeRenderDispatcher(Renderer kolson, Renderer modules, FailureReporter reporter) {
        this.kolson = new State("Kolson", kolson);
        this.modules = new State("Modules (step1/updateScreen1)", modules);
        this.reporter = reporter;
    }

    void onKolsonLoaded() {
        this.kolson.loadGeneration.incrementAndGet();
    }

    void onModuleLoaded() {
        this.modules.loadGeneration.incrementAndGet();
    }

    void updateScreen(int width, int height) {
        this.width = width;
        this.height = height;
        this.screenRevision++;
        dispatch(this.kolson, false);
        dispatch(this.modules, false);
    }

    void renderFrame() {
        dispatch(this.kolson, true);
        dispatch(this.modules, true);
    }

    private void dispatch(State state, boolean drawFrame) {
        if (this.width <= 0 || this.height <= 0) {
            return;
        }
        long generation = state.loadGeneration.get();
        if (generation == 0) {
            return;
        }
        if (generation != state.observedGeneration) {
            state.observedGeneration = generation;
            state.disabled = false;
            state.screenRevision = -1L;
        }
        if (state.disabled) {
            return;
        }
        try {
            if (state.screenRevision != this.screenRevision) {
                state.renderer.updateScreen(this.width, this.height);
                state.screenRevision = this.screenRevision;
            }
            if (drawFrame) {
                state.renderer.step();
            }
        } catch (UnsatisfiedLinkError error) {
            state.disabled = true;
            this.reporter.report(state.name, error);
        }
    }
}
