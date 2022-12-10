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

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;
import static org.overrun.glib.gl.GLLoader.getCapabilities;

/**
 * The OpenGL 1.4 functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL14 extends GL14C {
    static void load(GLCapabilities caps, GLLoadFunc load) {
        if (!caps.Ver14) return;
        caps.glFogCoordPointer = load.invoke("glFogCoordPointer", IIPV);
        caps.glFogCoordd = load.invoke("glFogCoordd", DV);
        caps.glFogCoorddv = load.invoke("glFogCoorddv", PV);
        caps.glFogCoordf = load.invoke("glFogCoordf", FV);
        caps.glFogCoordfv = load.invoke("glFogCoordfv", PV);
        caps.glSecondaryColor3b = load.invoke("glSecondaryColor3b", BBBV);
        caps.glSecondaryColor3bv = load.invoke("glSecondaryColor3bv", PV);
        caps.glSecondaryColor3d = load.invoke("glSecondaryColor3d", DDDV);
        caps.glSecondaryColor3dv = load.invoke("glSecondaryColor3dv", PV);
        caps.glSecondaryColor3f = load.invoke("glSecondaryColor3f", FFFV);
        caps.glSecondaryColor3fv = load.invoke("glSecondaryColor3fv", PV);
        caps.glSecondaryColor3i = load.invoke("glSecondaryColor3i", IIIV);
        caps.glSecondaryColor3iv = load.invoke("glSecondaryColor3iv", PV);
        caps.glSecondaryColor3s = load.invoke("glSecondaryColor3s", SSSV);
        caps.glSecondaryColor3sv = load.invoke("glSecondaryColor3sv", PV);
        caps.glSecondaryColor3ub = load.invoke("glSecondaryColor3ub", BBBV);
        caps.glSecondaryColor3ubv = load.invoke("glSecondaryColor3ubv", PV);
        caps.glSecondaryColor3ui = load.invoke("glSecondaryColor3ui", IIIV);
        caps.glSecondaryColor3uiv = load.invoke("glSecondaryColor3uiv", PV);
        caps.glSecondaryColor3us = load.invoke("glSecondaryColor3us", SSSV);
        caps.glSecondaryColor3usv = load.invoke("glSecondaryColor3usv", PV);
        caps.glSecondaryColorPointer = load.invoke("glSecondaryColorPointer", IIIPV);
        caps.glWindowPos2d = load.invoke("glWindowPos2d", DDV);
        caps.glWindowPos2dv = load.invoke("glWindowPos2dv", PV);
        caps.glWindowPos2f = load.invoke("glWindowPos2f", FFV);
        caps.glWindowPos2fv = load.invoke("glWindowPos2fv", PV);
        caps.glWindowPos2i = load.invoke("glWindowPos2i", IIV);
        caps.glWindowPos2iv = load.invoke("glWindowPos2iv", PV);
        caps.glWindowPos2s = load.invoke("glWindowPos2s", SSV);
        caps.glWindowPos2sv = load.invoke("glWindowPos2sv", PV);
        caps.glWindowPos3d = load.invoke("glWindowPos3d", DDDV);
        caps.glWindowPos3dv = load.invoke("glWindowPos3dv", PV);
        caps.glWindowPos3f = load.invoke("glWindowPos3f", FFFV);
        caps.glWindowPos3fv = load.invoke("glWindowPos3fv", PV);
        caps.glWindowPos3i = load.invoke("glWindowPos3i", IIIV);
        caps.glWindowPos3iv = load.invoke("glWindowPos3iv", PV);
        caps.glWindowPos3s = load.invoke("glWindowPos3s", SSSV);
        caps.glWindowPos3sv = load.invoke("glWindowPos3sv", PV);
    }

    public static void fogCoordPointer(int type, int stride, MemorySegment pointer) {
        var caps = getCapabilities();
        try {
            check(caps.glFogCoordPointer).invokeExact(type, stride, pointer);
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
        var caps = getCapabilities();
        try {
            check(caps.glFogCoordd).invokeExact(coord);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void fogCoorddv(MemorySegment coord) {
        var caps = getCapabilities();
        try {
            check(caps.glFogCoorddv).invokeExact(coord);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void fogCoorddv(SegmentAllocator allocator, double[] coord) {
        fogCoorddv(allocator.allocateArray(JAVA_DOUBLE, coord));
    }

    public static void fogCoordf(float coord) {
        var caps = getCapabilities();
        try {
            check(caps.glFogCoordf).invokeExact(coord);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void fogCoordfv(MemorySegment coord) {
        var caps = getCapabilities();
        try {
            check(caps.glFogCoordfv).invokeExact(coord);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void fogCoordfv(SegmentAllocator allocator, float[] coord) {
        fogCoordfv(allocator.allocateArray(JAVA_FLOAT, coord));
    }

    public static void secondaryColor3b(byte red, byte green, byte blue) {
        var caps = getCapabilities();
        try {
            check(caps.glSecondaryColor3b).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3bv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glSecondaryColor3bv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3bv(SegmentAllocator allocator, byte[] v) {
        secondaryColor3bv(allocator.allocateArray(JAVA_BYTE, v));
    }

    public static void secondaryColor3d(double red, double green, double blue) {
        var caps = getCapabilities();
        try {
            check(caps.glSecondaryColor3d).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3dv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glSecondaryColor3dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3dv(SegmentAllocator allocator, double[] v) {
        secondaryColor3dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void secondaryColor3f(float red, float green, float blue) {
        var caps = getCapabilities();
        try {
            check(caps.glSecondaryColor3f).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3fv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glSecondaryColor3fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3fv(SegmentAllocator allocator, float[] v) {
        secondaryColor3fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void secondaryColor3i(int red, int green, int blue) {
        var caps = getCapabilities();
        try {
            check(caps.glSecondaryColor3i).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3iv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glSecondaryColor3iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3iv(SegmentAllocator allocator, int[] v) {
        secondaryColor3iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void secondaryColor3s(short red, short green, short blue) {
        var caps = getCapabilities();
        try {
            check(caps.glSecondaryColor3s).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3sv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glSecondaryColor3sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3sv(SegmentAllocator allocator, short[] v) {
        secondaryColor3sv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void secondaryColor3ub(byte red, byte green, byte blue) {
        var caps = getCapabilities();
        try {
            check(caps.glSecondaryColor3ub).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3ubv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glSecondaryColor3ubv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3ubv(SegmentAllocator allocator, byte[] v) {
        secondaryColor3ubv(allocator.allocateArray(JAVA_BYTE, v));
    }

    public static void secondaryColor3ui(int red, int green, int blue) {
        var caps = getCapabilities();
        try {
            check(caps.glSecondaryColor3ui).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3uiv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glSecondaryColor3uiv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3uiv(SegmentAllocator allocator, int[] v) {
        secondaryColor3uiv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void secondaryColor3us(short red, short green, short blue) {
        var caps = getCapabilities();
        try {
            check(caps.glSecondaryColor3us).invokeExact(red, green, blue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3usv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glSecondaryColor3usv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void secondaryColor3usv(SegmentAllocator allocator, short[] v) {
        secondaryColor3usv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void secondaryColorPointer(int size, int type, int stride, MemorySegment pointer) {
        var caps = getCapabilities();
        try {
            check(caps.glSecondaryColorPointer).invokeExact(size, type, stride, pointer);
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
        var caps = getCapabilities();
        try {
            check(caps.glWindowPos2d).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos2dv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glWindowPos2dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos2dv(SegmentAllocator allocator, double[] v) {
        windowPos2dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void windowPos2f(float x, float y) {
        var caps = getCapabilities();
        try {
            check(caps.glWindowPos2f).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos2fv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glWindowPos2fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos2fv(SegmentAllocator allocator, float[] v) {
        windowPos2fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void windowPos2i(int x, int y) {
        var caps = getCapabilities();
        try {
            check(caps.glWindowPos2i).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos2iv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glWindowPos2iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos2iv(SegmentAllocator allocator, int[] v) {
        windowPos2iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void windowPos2s(short x, short y) {
        var caps = getCapabilities();
        try {
            check(caps.glWindowPos2s).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos2sv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glWindowPos2sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos2sv(SegmentAllocator allocator, short[] v) {
        windowPos2sv(allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void windowPos3d(double x, double y, double z) {
        var caps = getCapabilities();
        try {
            check(caps.glWindowPos3d).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos3dv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glWindowPos3dv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos3dv(SegmentAllocator allocator, double[] v) {
        windowPos3dv(allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void windowPos3f(float x, float y, float z) {
        var caps = getCapabilities();
        try {
            check(caps.glWindowPos3f).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos3fv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glWindowPos3fv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos3fv(SegmentAllocator allocator, float[] v) {
        windowPos3fv(allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void windowPos3i(int x, int y, int z) {
        var caps = getCapabilities();
        try {
            check(caps.glWindowPos3i).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos3iv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glWindowPos3iv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos3iv(SegmentAllocator allocator, int[] v) {
        windowPos3iv(allocator.allocateArray(JAVA_INT, v));
    }

    public static void windowPos3s(short x, short y, short z) {
        var caps = getCapabilities();
        try {
            check(caps.glWindowPos3s).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos3sv(MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glWindowPos3sv).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void windowPos3sv(SegmentAllocator allocator, short[] v) {
        windowPos3sv(allocator.allocateArray(JAVA_SHORT, v));
    }
}
