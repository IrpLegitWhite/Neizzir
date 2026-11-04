package com.blackhub.bronline.neizzir.fragments.custom.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PngTintUtil.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/util/PngTintUtil;", "", "()V", "forceOpaqueAlpha", "", "pngBytes", "tintPng", "color", "", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class PngTintUtil {
    public static final PngTintUtil INSTANCE = new PngTintUtil();

    private PngTintUtil() {
    }

    public final byte[] tintPng(byte[] pngBytes, int color) throws Throwable {
        Bitmap bitmapCopy;
        int nr;
        int ng;
        int nb;
        Intrinsics.checkNotNullParameter(pngBytes, "pngBytes");
        Bitmap src = BitmapFactory.decodeByteArray(pngBytes, 0, pngBytes.length);
        if (src == null) {
            throw new IllegalArgumentException("Не удалось декодировать PNG для перекраски.");
        }
        if (src.getConfig() != Bitmap.Config.ARGB_8888) {
            bitmapCopy = src.copy(Bitmap.Config.ARGB_8888, true);
            if (bitmapCopy == null) {
                throw new IllegalArgumentException("Не удалось привести PNG к ARGB_8888.");
            }
        } else {
            bitmapCopy = src.copy(Bitmap.Config.ARGB_8888, true);
            if (bitmapCopy == null) {
                throw new IllegalArgumentException("Не удалось скопировать bitmap.");
            }
        }
        Bitmap bmp = bitmapCopy;
        int tintR = (color >> 16) & 255;
        int tintG = (color >> 8) & 255;
        int tintB = color & 255;
        try {
            int w = bmp.getWidth();
            int h = bmp.getHeight();
            int[] pixels = new int[w * h];
            try {
                bmp.getPixels(pixels, 0, w, 0, 0, w, h);
                int visibleSrc = 0;
                int visibleRgbNonZero = 0;
                for (int p : pixels) {
                    if (((p >>> 24) & 255) != 0) {
                        visibleSrc++;
                        int r = (p >>> 16) & 255;
                        int g = (p >>> 8) & 255;
                        int b = p & 255;
                        if ((r | g | b) != 0) {
                            visibleRgbNonZero++;
                        }
                    }
                }
                if (visibleSrc == 0) {
                    throw new IllegalArgumentException("PNG полностью прозрачный.");
                }
                boolean alphaMaskMode = visibleRgbNonZero * 100 < visibleSrc * 5;
                int length = pixels.length;
                for (int i = 0; i < length; i++) {
                    int p2 = pixels[i];
                    int srcA = (p2 >>> 24) & 255;
                    if (srcA != 0) {
                        int r2 = (p2 >>> 16) & 255;
                        int g2 = (p2 >>> 8) & 255;
                        int b2 = p2 & 255;
                        if (alphaMaskMode) {
                            nr = tintR;
                            ng = tintG;
                            nb = tintB;
                        } else {
                            nr = ((r2 * tintR) + 127) / 255;
                            ng = ((g2 * tintG) + 127) / 255;
                            nb = ((b2 * tintB) + 127) / 255;
                        }
                        pixels[i] = (srcA << 24) | (nr << 16) | (ng << 8) | nb;
                    }
                }
                bmp.setPixels(pixels, 0, w, 0, 0, w, h);
                ByteArrayOutputStream out = new ByteArrayOutputStream(Math.max(4096, pngBytes.length));
                bmp.compress(Bitmap.CompressFormat.PNG, 100, out);
                byte[] byteArray = out.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                bmp.recycle();
                src.recycle();
                return byteArray;
            } catch (Throwable th) {
                th = th;
                bmp.recycle();
                src.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final byte[] forceOpaqueAlpha(byte[] pngBytes) {
        Intrinsics.checkNotNullParameter(pngBytes, "pngBytes");
        Bitmap src = BitmapFactory.decodeByteArray(pngBytes, 0, pngBytes.length);
        if (src == null) {
            throw new IllegalArgumentException("Не удалось декодировать PNG для нормализации alpha.");
        }
        Bitmap bmp = src.copy(Bitmap.Config.ARGB_8888, true);
        if (bmp == null) {
            throw new IllegalArgumentException("Не удалось скопировать bitmap для нормализации alpha.");
        }
        try {
            int w = bmp.getWidth();
            int h = bmp.getHeight();
            int[] pixels = new int[w * h];
            bmp.getPixels(pixels, 0, w, 0, 0, w, h);
            int length = pixels.length;
            for (int i = 0; i < length; i++) {
                int p = pixels[i];
                int r = (p >>> 16) & 255;
                int g = (p >>> 8) & 255;
                int b = p & 255;
                pixels[i] = (-16777216) | (r << 16) | (g << 8) | b;
            }
            bmp.setPixels(pixels, 0, w, 0, 0, w, h);
            ByteArrayOutputStream out = new ByteArrayOutputStream(Math.max(4096, pngBytes.length));
            bmp.compress(Bitmap.CompressFormat.PNG, 100, out);
            byte[] byteArray = out.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            return byteArray;
        } finally {
            bmp.recycle();
            src.recycle();
        }
    }
}
