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
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLCaps.*;

/**
 * The OpenGL 1.4 functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL14 extends GL14C {
    @Nullable
    public static MethodHandle
        glFogCoordPointer, glFogCoordd, glFogCoorddv, glFogCoordf, glFogCoordfv, glSecondaryColor3b,
        glSecondaryColor3bv, glSecondaryColor3d, glSecondaryColor3dv, glSecondaryColor3f, glSecondaryColor3fv,
        glSecondaryColor3i, glSecondaryColor3iv, glSecondaryColor3s, glSecondaryColor3sv, glSecondaryColor3ub,
        glSecondaryColor3ubv, glSecondaryColor3ui, glSecondaryColor3uiv, glSecondaryColor3us, glSecondaryColor3usv,
        glSecondaryColorPointer, glWindowPos2d, glWindowPos2dv, glWindowPos2f, glWindowPos2fv, glWindowPos2i,
        glWindowPos2iv, glWindowPos2s, glWindowPos2sv, glWindowPos3d, glWindowPos3dv, glWindowPos3f, glWindowPos3fv,
        glWindowPos3i, glWindowPos3iv, glWindowPos3s, glWindowPos3sv;

    static void load(GLLoadFunc load) {
        if (!Ver14) return;
        glFogCoordPointer = load.invoke("glFogCoordPointer", IIPV);
        glFogCoordd = load.invoke("glFogCoordd", DV);
        glFogCoorddv = load.invoke("glFogCoorddv", PV);
        glFogCoordf = load.invoke("glFogCoordf", FV);
        glFogCoordfv = load.invoke("glFogCoordfv", PV);
        glSecondaryColor3b = load.invoke("glSecondaryColor3b", BBBV);
        glSecondaryColor3bv = load.invoke("glSecondaryColor3bv", PV);
        glSecondaryColor3d = load.invoke("glSecondaryColor3d", DDDV);
        glSecondaryColor3dv = load.invoke("glSecondaryColor3dv", PV);
        glSecondaryColor3f = load.invoke("glSecondaryColor3f", FFFV);
        glSecondaryColor3fv = load.invoke("glSecondaryColor3fv", PV);
        glSecondaryColor3i = load.invoke("glSecondaryColor3i", IIIV);
        glSecondaryColor3iv = load.invoke("glSecondaryColor3iv", PV);
        glSecondaryColor3s = load.invoke("glSecondaryColor3s", SSSV);
        glSecondaryColor3sv = load.invoke("glSecondaryColor3sv", PV);
        glSecondaryColor3ub = load.invoke("glSecondaryColor3ub", BBBV);
        glSecondaryColor3ubv = load.invoke("glSecondaryColor3ubv", PV);
        glSecondaryColor3ui = load.invoke("glSecondaryColor3ui", IIIV);
        glSecondaryColor3uiv = load.invoke("glSecondaryColor3uiv", PV);
        glSecondaryColor3us = load.invoke("glSecondaryColor3us", SSSV);
        glSecondaryColor3usv = load.invoke("glSecondaryColor3usv", PV);
        glSecondaryColorPointer = load.invoke("glSecondaryColorPointer", IIIPV);
        glWindowPos2d = load.invoke("glWindowPos2d", DDV);
        glWindowPos2dv = load.invoke("glWindowPos2dv", PV);
        glWindowPos2f = load.invoke("glWindowPos2f", FFV);
        glWindowPos2fv = load.invoke("glWindowPos2fv", PV);
        glWindowPos2i = load.invoke("glWindowPos2i", IIV);
        glWindowPos2iv = load.invoke("glWindowPos2iv", PV);
        glWindowPos2s = load.invoke("glWindowPos2s", SSV);
        glWindowPos2sv = load.invoke("glWindowPos2sv", PV);
        glWindowPos3d = load.invoke("glWindowPos3d", DDDV);
        glWindowPos3dv = load.invoke("glWindowPos3dv", PV);
        glWindowPos3f = load.invoke("glWindowPos3f", FFFV);
        glWindowPos3fv = load.invoke("glWindowPos3fv", PV);
        glWindowPos3i = load.invoke("glWindowPos3i", IIIV);
        glWindowPos3iv = load.invoke("glWindowPos3iv", PV);
        glWindowPos3s = load.invoke("glWindowPos3s", SSSV);
        glWindowPos3sv = load.invoke("glWindowPos3sv", PV);
    }

    public static void fogCoordPointer(int type, int stride, Addressable pointer) {
        try {
            check(glFogCoordPointer).invoke(type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void fogCoordPointer(int type, int stride, float[] pointer) {
        try (var session = MemorySession.openShared()) {
            fogCoordPointer(type, stride, session.allocateArray(JAVA_FLOAT, pointer));
        }
    }

    public static void fogCoordPointer(int type, int stride, double[] pointer) {
        try (var session = MemorySession.openShared()) {
            fogCoordPointer(type, stride, session.allocateArray(JAVA_DOUBLE, pointer));
        }
    }

    public static void fogCoordd(double coord) {
        try {
            check(glFogCoordd).invoke(coord);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void fogCoorddv(Addressable coord) {
        try {
            check(glFogCoorddv).invoke(coord);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void fogCoorddv(double[] coord) {
        try (var session = MemorySession.openShared()) {
            fogCoorddv(session.allocateArray(JAVA_DOUBLE, coord));
        }
    }

    public static void fogCoordf(float coord) {
        try {
            check(glFogCoordf).invoke(coord);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void fogCoordfv(Addressable coord) {
        try {
            check(glFogCoordfv).invoke(coord);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void fogCoordfv(float[] coord) {
        try (var session = MemorySession.openShared()) {
            fogCoordfv(session.allocateArray(JAVA_FLOAT, coord));
        }
    }

    public static void secondaryColor3b(byte red, byte green, byte blue) {
        try {
            check(glSecondaryColor3b).invoke(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void secondaryColor3bv(Addressable v) {
        try {
            check(glSecondaryColor3bv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void secondaryColor3bv(byte[] v) {
        try (var session = MemorySession.openShared()) {
            secondaryColor3bv(session.allocateArray(JAVA_BYTE, v));
        }
    }

    public static void secondaryColor3d(double red, double green, double blue) {
        try {
            check(glSecondaryColor3d).invoke(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void secondaryColor3dv(Addressable v) {
        try {
            check(glSecondaryColor3dv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void secondaryColor3dv(double[] v) {
        try (var session = MemorySession.openShared()) {
            secondaryColor3dv(session.allocateArray(JAVA_DOUBLE, v));
        }
    }

    public static void secondaryColor3f(float red, float green, float blue) {
        try {
            check(glSecondaryColor3f).invoke(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void secondaryColor3fv(Addressable v) {
        try {
            check(glSecondaryColor3fv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void secondaryColor3fv(float[] v) {
        try (var session = MemorySession.openShared()) {
            secondaryColor3fv(session.allocateArray(JAVA_FLOAT, v));
        }
    }

    public static void secondaryColor3i(int red, int green, int blue) {
        try {
            check(glSecondaryColor3i).invoke(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void secondaryColor3iv(Addressable v) {
        try {
            check(glSecondaryColor3iv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void secondaryColor3iv(int[] v) {
        try (var session = MemorySession.openShared()) {
            secondaryColor3iv(session.allocateArray(JAVA_INT, v));
        }
    }

    public static void secondaryColor3s(short red, short green, short blue) {
        try {
            check(glSecondaryColor3s).invoke(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void secondaryColor3sv(Addressable v) {
        try {
            check(glSecondaryColor3sv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void secondaryColor3sv(short[] v) {
        try (var session = MemorySession.openShared()) {
            secondaryColor3sv(session.allocateArray(JAVA_SHORT, v));
        }
    }

    public static void secondaryColor3ub(byte red, byte green, byte blue) {
        try {
            check(glSecondaryColor3ub).invoke(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void secondaryColor3ubv(Addressable v) {
        try {
            check(glSecondaryColor3ubv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void secondaryColor3ubv(byte[] v) {
        try (var session = MemorySession.openShared()) {
            secondaryColor3ubv(session.allocateArray(JAVA_BYTE, v));
        }
    }

    public static void secondaryColor3ui(int red, int green, int blue) {
        try {
            check(glSecondaryColor3ui).invoke(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void secondaryColor3uiv(Addressable v) {
        try {
            check(glSecondaryColor3uiv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void secondaryColor3uiv(int[] v) {
        try (var session = MemorySession.openShared()) {
            secondaryColor3uiv(session.allocateArray(JAVA_INT, v));
        }
    }

    public static void secondaryColor3us(short red, short green, short blue) {
        try {
            check(glSecondaryColor3us).invoke(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void secondaryColor3usv(Addressable v) {
        try {
            check(glSecondaryColor3usv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void secondaryColor3usv(short[] v) {
        try (var session = MemorySession.openShared()) {
            secondaryColor3usv(session.allocateArray(JAVA_SHORT, v));
        }
    }

    public static void secondaryColorPointer(int size, int type, int stride, Addressable pointer) {
        try {
            check(glSecondaryColorPointer).invoke(size, type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void secondaryColorPointer(int size, int type, int stride, byte[] pointer) {
        try (var session = MemorySession.openShared()) {
            secondaryColorPointer(size, type, stride, session.allocateArray(JAVA_BYTE, pointer));
        }
    }

    public static void secondaryColorPointer(int size, int type, int stride, short[] pointer) {
        try (var session = MemorySession.openShared()) {
            secondaryColorPointer(size, type, stride, session.allocateArray(JAVA_SHORT, pointer));
        }
    }

    public static void secondaryColorPointer(int size, int type, int stride, int[] pointer) {
        try (var session = MemorySession.openShared()) {
            secondaryColorPointer(size, type, stride, session.allocateArray(JAVA_INT, pointer));
        }
    }

    public static void secondaryColorPointer(int size, int type, int stride, float[] pointer) {
        try (var session = MemorySession.openShared()) {
            secondaryColorPointer(size, type, stride, session.allocateArray(JAVA_FLOAT, pointer));
        }
    }

    public static void secondaryColorPointer(int size, int type, int stride, double[] pointer) {
        try (var session = MemorySession.openShared()) {
            secondaryColorPointer(size, type, stride, session.allocateArray(JAVA_DOUBLE, pointer));
        }
    }

    public static void windowPos2d(double x, double y) {
        try {
            check(glWindowPos2d).invoke(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void windowPos2dv(Addressable v) {
        try {
            check(glWindowPos2dv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void windowPos2dv(double[] v) {
        try (var session = MemorySession.openShared()) {
            windowPos2dv(session.allocateArray(JAVA_DOUBLE, v));
        }
    }

    public static void windowPos2f(float x, float y) {
        try {
            check(glWindowPos2f).invoke(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void windowPos2fv(Addressable v) {
        try {
            check(glWindowPos2fv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void windowPos2fv(float[] v) {
        try (var session = MemorySession.openShared()) {
            windowPos2fv(session.allocateArray(JAVA_FLOAT, v));
        }
    }

    public static void windowPos2i(int x, int y) {
        try {
            check(glWindowPos2i).invoke(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void windowPos2iv(Addressable v) {
        try {
            check(glWindowPos2iv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void windowPos2iv(int[] v) {
        try (var session = MemorySession.openShared()) {
            windowPos2iv(session.allocateArray(JAVA_INT, v));
        }
    }

    public static void windowPos2s(short x, short y) {
        try {
            check(glWindowPos2s).invoke(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void windowPos2sv(Addressable v) {
        try {
            check(glWindowPos2sv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void windowPos2sv(short[] v) {
        try (var session = MemorySession.openShared()) {
            windowPos2sv(session.allocateArray(JAVA_SHORT, v));
        }
    }

    public static void windowPos3d(double x, double y, double z) {
        try {
            check(glWindowPos3d).invoke(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void windowPos3dv(Addressable v) {
        try {
            check(glWindowPos3dv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void windowPos3dv(double[] v) {
        try (var session = MemorySession.openShared()) {
            windowPos3dv(session.allocateArray(JAVA_DOUBLE, v));
        }
    }

    public static void windowPos3f(float x, float y, float z) {
        try {
            check(glWindowPos3f).invoke(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void windowPos3fv(Addressable v) {
        try {
            check(glWindowPos3fv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void windowPos3fv(float[] v) {
        try (var session = MemorySession.openShared()) {
            windowPos3fv(session.allocateArray(JAVA_FLOAT, v));
        }
    }

    public static void windowPos3i(int x, int y, int z) {
        try {
            check(glWindowPos3i).invoke(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void windowPos3iv(Addressable v) {
        try {
            check(glWindowPos3iv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void windowPos3iv(int[] v) {
        try (var session = MemorySession.openShared()) {
            windowPos3iv(session.allocateArray(JAVA_INT, v));
        }
    }

    public static void windowPos3s(short x, short y, short z) {
        try {
            check(glWindowPos3s).invoke(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void windowPos3sv(Addressable v) {
        try {
            check(glWindowPos3sv).invoke(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void windowPos3sv(short[] v) {
        try (var session = MemorySession.openShared()) {
            windowPos3sv(session.allocateArray(JAVA_SHORT, v));
        }
    }
}
