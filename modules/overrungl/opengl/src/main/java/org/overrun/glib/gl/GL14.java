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
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLCaps.Ver14;
import static org.overrun.glib.gl.GLCaps.check;

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
            check(glFogCoordPointer).invokeExact(type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void fogCoordPointer(SegmentAllocator allocator, int type, int stride, float[] pointer) {
        fogCoordPointer(type, stride, allocator.allocateArray(JAVA_FLOAT, pointer));
    }

    public static void fogCoordPointer(SegmentAllocator allocator, int type, int stride, double[] pointer) {
        fogCoordPointer(type, stride, allocator.allocateArray(JAVA_DOUBLE, pointer));
    }

    public static void fogCoordd(double coord) {
        try {
            check(glFogCoordd).invokeExact(coord);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void fogCoorddv(Addressable coord) {
        try {
            check(glFogCoorddv).invokeExact(coord);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void fogCoorddv(SegmentAllocator allocator, double[] coord) {
        fogCoorddv(allocator.allocateArray(JAVA_DOUBLE, coord));
    }

    public static void fogCoordf(float coord) {
        try {
            check(glFogCoordf).invokeExact(coord);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void fogCoordfv(Addressable coord) {
        try {
            check(glFogCoordfv).invokeExact(coord);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void fogCoordfv(SegmentAllocator allocator, float[] coord) {
        fogCoordfv(allocator.allocateArray(JAVA_FLOAT, coord));
    }

    public static void secondaryColor3b(byte red, byte green, byte blue) {
        try {
            check(glSecondaryColor3b).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3bv(Addressable v) {
        try {
            check(glSecondaryColor3bv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3bv(SegmentAllocator allocator, byte[] v) {
        secondaryColor3bv(allocator.allocateArray(JAVA_BYTE, v));
    }

    public static void secondaryColor3d(double red, double green, double blue) {
        try {
            check(glSecondaryColor3d).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3dv(Addressable v) {
        try {
            check(glSecondaryColor3dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3dv(SegmentAllocator allocator, double[] v) {
        secondaryColor3dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void secondaryColor3f(float red, float green, float blue) {
        try {
            check(glSecondaryColor3f).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3fv(Addressable v) {
        try {
            check(glSecondaryColor3fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3fv(SegmentAllocator allocator, float[] v) {
        secondaryColor3fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void secondaryColor3i(int red, int green, int blue) {
        try {
            check(glSecondaryColor3i).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3iv(Addressable v) {
        try {
            check(glSecondaryColor3iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3iv(SegmentAllocator allocator, int[] v) {
        secondaryColor3iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void secondaryColor3s(short red, short green, short blue) {
        try {
            check(glSecondaryColor3s).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3sv(Addressable v) {
        try {
            check(glSecondaryColor3sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3sv(SegmentAllocator allocator, short[] v) {
        secondaryColor3sv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void secondaryColor3ub(byte red, byte green, byte blue) {
        try {
            check(glSecondaryColor3ub).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3ubv(Addressable v) {
        try {
            check(glSecondaryColor3ubv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3ubv(SegmentAllocator allocator, byte[] v) {
        secondaryColor3ubv(allocator.allocateArray(JAVA_BYTE, v));
    }

    public static void secondaryColor3ui(int red, int green, int blue) {
        try {
            check(glSecondaryColor3ui).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3uiv(Addressable v) {
        try {
            check(glSecondaryColor3uiv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3uiv(SegmentAllocator allocator, int[] v) {
        secondaryColor3uiv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void secondaryColor3us(short red, short green, short blue) {
        try {
            check(glSecondaryColor3us).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3usv(Addressable v) {
        try {
            check(glSecondaryColor3usv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3usv(SegmentAllocator allocator, short[] v) {
        secondaryColor3usv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void secondaryColorPointer(int size, int type, int stride, Addressable pointer) {
        try {
            check(glSecondaryColorPointer).invokeExact(size, type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColorPointer(SegmentAllocator allocator, int size, int type, int stride, byte[] pointer) {
        secondaryColorPointer(size, type, stride, allocator.allocateArray(JAVA_BYTE, pointer));
    }

    public static void secondaryColorPointer(SegmentAllocator allocator, int size, int type, int stride, short[] pointer) {
        secondaryColorPointer(size, type, stride, allocator.allocateArray(JAVA_SHORT, pointer));
    }

    public static void secondaryColorPointer(SegmentAllocator allocator, int size, int type, int stride, int[] pointer) {
        secondaryColorPointer(size, type, stride, allocator.allocateArray(JAVA_INT, pointer));
    }

    public static void secondaryColorPointer(SegmentAllocator allocator, int size, int type, int stride, float[] pointer) {
        secondaryColorPointer(size, type, stride, allocator.allocateArray(JAVA_FLOAT, pointer));
    }

    public static void secondaryColorPointer(SegmentAllocator allocator, int size, int type, int stride, double[] pointer) {
        secondaryColorPointer(size, type, stride, allocator.allocateArray(JAVA_DOUBLE, pointer));
    }

    public static void windowPos2d(double x, double y) {
        try {
            check(glWindowPos2d).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos2dv(Addressable v) {
        try {
            check(glWindowPos2dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos2dv(SegmentAllocator allocator, double[] v) {
        windowPos2dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void windowPos2f(float x, float y) {
        try {
            check(glWindowPos2f).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos2fv(Addressable v) {
        try {
            check(glWindowPos2fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos2fv(SegmentAllocator allocator, float[] v) {
        windowPos2fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void windowPos2i(int x, int y) {
        try {
            check(glWindowPos2i).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos2iv(Addressable v) {
        try {
            check(glWindowPos2iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos2iv(SegmentAllocator allocator, int[] v) {
        windowPos2iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void windowPos2s(short x, short y) {
        try {
            check(glWindowPos2s).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos2sv(Addressable v) {
        try {
            check(glWindowPos2sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos2sv(SegmentAllocator allocator, short[] v) {
        windowPos2sv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void windowPos3d(double x, double y, double z) {
        try {
            check(glWindowPos3d).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos3dv(Addressable v) {
        try {
            check(glWindowPos3dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos3dv(SegmentAllocator allocator, double[] v) {
        windowPos3dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void windowPos3f(float x, float y, float z) {
        try {
            check(glWindowPos3f).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos3fv(Addressable v) {
        try {
            check(glWindowPos3fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos3fv(SegmentAllocator allocator, float[] v) {
        windowPos3fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void windowPos3i(int x, int y, int z) {
        try {
            check(glWindowPos3i).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos3iv(Addressable v) {
        try {
            check(glWindowPos3iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos3iv(SegmentAllocator allocator, int[] v) {
        windowPos3iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void windowPos3s(short x, short y, short z) {
        try {
            check(glWindowPos3s).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos3sv(Addressable v) {
        try {
            check(glWindowPos3sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos3sv(SegmentAllocator allocator, short[] v) {
        windowPos3sv(allocator.allocateArray(JAVA_SHORT, v));
    }
}
