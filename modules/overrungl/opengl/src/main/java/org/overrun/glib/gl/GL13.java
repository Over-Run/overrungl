/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.gl.GLCaps.*;

/**
 * The OpenGL 1.3 functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL13 extends GL13C {
    @Nullable
    public static MethodHandle
        glClientActiveTexture, glLoadTransposeMatrixd, glLoadTransposeMatrixf, glMultTransposeMatrixd,
        glMultTransposeMatrixf, glMultiTexCoord1d, glMultiTexCoord1dv, glMultiTexCoord1f, glMultiTexCoord1fv,
        glMultiTexCoord1i, glMultiTexCoord1iv, glMultiTexCoord1s, glMultiTexCoord1sv, glMultiTexCoord2d,
        glMultiTexCoord2dv, glMultiTexCoord2f, glMultiTexCoord2fv, glMultiTexCoord2i, glMultiTexCoord2iv,
        glMultiTexCoord2s, glMultiTexCoord2sv, glMultiTexCoord3d, glMultiTexCoord3dv, glMultiTexCoord3f,
        glMultiTexCoord3fv, glMultiTexCoord3i, glMultiTexCoord3iv, glMultiTexCoord3s, glMultiTexCoord3sv,
        glMultiTexCoord4d, glMultiTexCoord4dv, glMultiTexCoord4f, glMultiTexCoord4fv, glMultiTexCoord4i,
        glMultiTexCoord4iv, glMultiTexCoord4s, glMultiTexCoord4sv;

    static void load(GLLoadFunc load) {
        if (!Ver13) return;
        glClientActiveTexture = downcallSafe(load.invoke("glClientActiveTexture"), dIV);
        glLoadTransposeMatrixd = downcallSafe(load.invoke("glLoadTransposeMatrixd"), dPV);
        glLoadTransposeMatrixf = downcallSafe(load.invoke("glLoadTransposeMatrixf"), dPV);
        glMultTransposeMatrixd = downcallSafe(load.invoke("glMultTransposeMatrixd"), dPV);
        glMultTransposeMatrixf = downcallSafe(load.invoke("glMultTransposeMatrixf"), dPV);
        glMultiTexCoord1d = downcallSafe(load.invoke("glMultiTexCoord1d"), dIDV);
        glMultiTexCoord1dv = downcallSafe(load.invoke("glMultiTexCoord1dv"), dIPV);
        glMultiTexCoord1f = downcallSafe(load.invoke("glMultiTexCoord1f"), dIFV);
        glMultiTexCoord1fv = downcallSafe(load.invoke("glMultiTexCoord1fv"), dIPV);
        glMultiTexCoord1i = downcallSafe(load.invoke("glMultiTexCoord1i"), dIIV);
        glMultiTexCoord1iv = downcallSafe(load.invoke("glMultiTexCoord1iv"), dIPV);
        glMultiTexCoord1s = downcallSafe(load.invoke("glMultiTexCoord1s"), dISV);
        glMultiTexCoord1sv = downcallSafe(load.invoke("glMultiTexCoord1sv"), dIPV);
        glMultiTexCoord2d = downcallSafe(load.invoke("glMultiTexCoord2d"), dIDDV);
        glMultiTexCoord2dv = downcallSafe(load.invoke("glMultiTexCoord2dv"), dIPV);
        glMultiTexCoord2f = downcallSafe(load.invoke("glMultiTexCoord2f"), dIFFV);
        glMultiTexCoord2fv = downcallSafe(load.invoke("glMultiTexCoord2fv"), dIPV);
        glMultiTexCoord2i = downcallSafe(load.invoke("glMultiTexCoord2i"), dIIIV);
        glMultiTexCoord2iv = downcallSafe(load.invoke("glMultiTexCoord2iv"), dIPV);
        glMultiTexCoord2s = downcallSafe(load.invoke("glMultiTexCoord2s"), dISSV);
        glMultiTexCoord2sv = downcallSafe(load.invoke("glMultiTexCoord2sv"), dIPV);
        glMultiTexCoord3d = downcallSafe(load.invoke("glMultiTexCoord3d"), dIDDDV);
        glMultiTexCoord3dv = downcallSafe(load.invoke("glMultiTexCoord3dv"), dIPV);
        glMultiTexCoord3f = downcallSafe(load.invoke("glMultiTexCoord3f"), dIFFFV);
        glMultiTexCoord3fv = downcallSafe(load.invoke("glMultiTexCoord3fv"), dIPV);
        glMultiTexCoord3i = downcallSafe(load.invoke("glMultiTexCoord3i"), dIIIIV);
        glMultiTexCoord3iv = downcallSafe(load.invoke("glMultiTexCoord3iv"), dIPV);
        glMultiTexCoord3s = downcallSafe(load.invoke("glMultiTexCoord3s"), dISSSV);
        glMultiTexCoord3sv = downcallSafe(load.invoke("glMultiTexCoord3sv"), dIPV);
        glMultiTexCoord4d = downcallSafe(load.invoke("glMultiTexCoord4d"), dIDDDDV);
        glMultiTexCoord4dv = downcallSafe(load.invoke("glMultiTexCoord4dv"), dIPV);
        glMultiTexCoord4f = downcallSafe(load.invoke("glMultiTexCoord4f"), dIFFFFV);
        glMultiTexCoord4fv = downcallSafe(load.invoke("glMultiTexCoord4fv"), dIPV);
        glMultiTexCoord4i = downcallSafe(load.invoke("glMultiTexCoord4i"), dIIIIIV);
        glMultiTexCoord4iv = downcallSafe(load.invoke("glMultiTexCoord4iv"), dIPV);
        glMultiTexCoord4s = downcallSafe(load.invoke("glMultiTexCoord4s"), dISSSSV);
        glMultiTexCoord4sv = downcallSafe(load.invoke("glMultiTexCoord4sv"), dIPV);
    }

    public static void clientActiveTexture(int texture) {
        try {
            check(glClientActiveTexture).invoke(texture);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void loadTransposeMatrixd(Addressable m) {
        try {
            check(glLoadTransposeMatrixd).invoke(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void loadTransposeMatrixd(double[] m) {
        try (var session = MemorySession.openShared()) {
            loadTransposeMatrixd(session.allocateArray(ValueLayout.JAVA_DOUBLE, m));
        }
    }

    public static void loadTransposeMatrixf(Addressable m) {
        try {
            check(glLoadTransposeMatrixf).invoke(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void loadTransposeMatrixf(float[] m) {
        try (var session = MemorySession.openShared()) {
            loadTransposeMatrixf(session.allocateArray(JAVA_FLOAT, m));
        }
    }

    public static void multTransposeMatrixd(Addressable m) {
        try {
            check(glMultTransposeMatrixd).invoke(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multTransposeMatrixd(double[] m) {
        try (var session = MemorySession.openShared()) {
            multTransposeMatrixd(session.allocateArray(ValueLayout.JAVA_DOUBLE, m));
        }
    }

    public static void multTransposeMatrixf(Addressable m) {
        try {
            check(glMultTransposeMatrixf).invoke(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multTransposeMatrixf(float[] m) {
        try (var session = MemorySession.openShared()) {
            multTransposeMatrixf(session.allocateArray(JAVA_FLOAT, m));
        }
    }

    public static void multiTexCoord1d(int target, double s) {
        try {
            check(glMultiTexCoord1d).invoke(target, s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord1dv(int target, Addressable v) {
        try {
            check(glMultiTexCoord1dv).invoke(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord1dv(int target, double[] v) {
        try (var session = MemorySession.openShared()) {
            multiTexCoord1dv(target, session.allocateArray(JAVA_DOUBLE, v));
        }
    }

    public static void multiTexCoord1f(int target, float s) {
        try {
            check(glMultiTexCoord1f).invoke(target, s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord1fv(int target, Addressable v) {
        try {
            check(glMultiTexCoord1fv).invoke(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord1fv(int target, float[] v) {
        try (var session = MemorySession.openShared()) {
            multiTexCoord1fv(target, session.allocateArray(JAVA_FLOAT, v));
        }
    }

    public static void multiTexCoord1i(int target, int s) {
        try {
            check(glMultiTexCoord1i).invoke(target, s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord1iv(int target, Addressable v) {
        try {
            check(glMultiTexCoord1iv).invoke(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord1iv(int target, int[] v) {
        try (var session = MemorySession.openShared()) {
            multiTexCoord1iv(target, session.allocateArray(JAVA_INT, v));
        }
    }

    public static void multiTexCoord1s(int target, short s) {
        try {
            check(glMultiTexCoord1s).invoke(target, s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord1sv(int target, Addressable v) {
        try {
            check(glMultiTexCoord1sv).invoke(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord1sv(int target, short[] v) {
        try (var session = MemorySession.openShared()) {
            multiTexCoord1sv(target, session.allocateArray(JAVA_SHORT, v));
        }
    }

    public static void multiTexCoord2d(int target, double s, double t) {
        try {
            check(glMultiTexCoord2d).invoke(target, s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord2dv(int target, Addressable v) {
        try {
            check(glMultiTexCoord2dv).invoke(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord2dv(int target, double[] v) {
        try (var session = MemorySession.openShared()) {
            multiTexCoord2dv(target, session.allocateArray(JAVA_DOUBLE, v));
        }
    }

    public static void multiTexCoord2f(int target, float s, float t) {
        try {
            check(glMultiTexCoord2f).invoke(target, s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord2fv(int target, Addressable v) {
        try {
            check(glMultiTexCoord2fv).invoke(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord2fv(int target, float[] v) {
        try (var session = MemorySession.openShared()) {
            multiTexCoord2fv(target, session.allocateArray(JAVA_FLOAT, v));
        }
    }

    public static void multiTexCoord2i(int target, int s, int t) {
        try {
            check(glMultiTexCoord2i).invoke(target, s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord2iv(int target, Addressable v) {
        try {
            check(glMultiTexCoord2iv).invoke(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord2iv(int target, int[] v) {
        try (var session = MemorySession.openShared()) {
            multiTexCoord2iv(target, session.allocateArray(JAVA_INT, v));
        }
    }

    public static void multiTexCoord2s(int target, short s, short t) {
        try {
            check(glMultiTexCoord2s).invoke(target, s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord2sv(int target, Addressable v) {
        try {
            check(glMultiTexCoord2sv).invoke(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord2sv(int target, short[] v) {
        try (var session = MemorySession.openShared()) {
            multiTexCoord2sv(target, session.allocateArray(JAVA_SHORT, v));
        }
    }

    public static void multiTexCoord3d(int target, double s, double t, double r) {
        try {
            check(glMultiTexCoord3d).invoke(target, s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord3dv(int target, Addressable v) {
        try {
            check(glMultiTexCoord3dv).invoke(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord3dv(int target, double[] v) {
        try (var session = MemorySession.openShared()) {
            multiTexCoord3dv(target, session.allocateArray(JAVA_DOUBLE, v));
        }
    }

    public static void multiTexCoord3f(int target, float s, float t, float r) {
        try {
            check(glMultiTexCoord3f).invoke(target, s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord3fv(int target, Addressable v) {
        try {
            check(glMultiTexCoord3fv).invoke(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord3fv(int target, float[] v) {
        try (var session = MemorySession.openShared()) {
            multiTexCoord3fv(target, session.allocateArray(JAVA_FLOAT, v));
        }
    }

    public static void multiTexCoord3i(int target, int s, int t, int r) {
        try {
            check(glMultiTexCoord3i).invoke(target, s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord3iv(int target, Addressable v) {
        try {
            check(glMultiTexCoord3iv).invoke(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord3iv(int target, int[] v) {
        try (var session = MemorySession.openShared()) {
            multiTexCoord3iv(target, session.allocateArray(JAVA_INT, v));
        }
    }

    public static void multiTexCoord3s(int target, short s, short t, short r) {
        try {
            check(glMultiTexCoord3s).invoke(target, s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord3sv(int target, Addressable v) {
        try {
            check(glMultiTexCoord3sv).invoke(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord3sv(int target, short[] v) {
        try (var session = MemorySession.openShared()) {
            multiTexCoord3sv(target, session.allocateArray(JAVA_SHORT, v));
        }
    }

    public static void multiTexCoord4d(int target, double s, double t, double r, double q) {
        try {
            check(glMultiTexCoord4d).invoke(target, s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord4dv(int target, Addressable v) {
        try {
            check(glMultiTexCoord4dv).invoke(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord4dv(int target, double[] v) {
        try (var session = MemorySession.openShared()) {
            multiTexCoord4dv(target, session.allocateArray(JAVA_DOUBLE, v));
        }
    }

    public static void multiTexCoord4f(int target, float s, float t, float r, float q) {
        try {
            check(glMultiTexCoord4f).invoke(target, s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord4fv(int target, Addressable v) {
        try {
            check(glMultiTexCoord4fv).invoke(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord4fv(int target, float[] v) {
        try (var session = MemorySession.openShared()) {
            multiTexCoord4fv(target, session.allocateArray(JAVA_FLOAT, v));
        }
    }

    public static void multiTexCoord4i(int target, int s, int t, int r, int q) {
        try {
            check(glMultiTexCoord4i).invoke(target, s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord4iv(int target, Addressable v) {
        try {
            check(glMultiTexCoord4iv).invoke(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord4iv(int target, int[] v) {
        try (var session = MemorySession.openShared()) {
            multiTexCoord4iv(target, session.allocateArray(JAVA_INT, v));
        }
    }

    public static void multiTexCoord4s(int target, short s, short t, short r, short q) {
        try {
            check(glMultiTexCoord4s).invoke(target, s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord4sv(int target, Addressable v) {
        try {
            check(glMultiTexCoord4sv).invoke(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiTexCoord4sv(int target, short[] v) {
        try (var session = MemorySession.openShared()) {
            multiTexCoord4sv(target, session.allocateArray(JAVA_SHORT, v));
        }
    }
}
