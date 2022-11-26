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

import java.lang.foreign.Addressable;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;

/**
 * The OpenGL 1.1 functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL11 extends GL11C {
    static void load(GLCapabilities caps, GLLoadFunc load) {
        if (!caps.Ver11) return;
        caps.glAreTexturesResident = load.invoke("glAreTexturesResident", IPPZ);
        caps.glArrayElement = load.invoke("glArrayElement", IV);
        caps.glColorPointer = load.invoke("glColorPointer", IIIPV);
        caps.glDisableClientState = load.invoke("glDisableClientState", IV);
        caps.glEdgeFlagPointer = load.invoke("glEdgeFlagPointer", IPV);
        caps.glEnableClientState = load.invoke("glEnableClientState", IV);
        caps.glIndexPointer = load.invoke("glIndexPointer", IIPV);
        caps.glIndexub = load.invoke("glIndexub", BV);
        caps.glIndexubv = load.invoke("glIndexubv", PV);
        caps.glInterleavedArrays = load.invoke("glInterleavedArrays", IIPV);
        caps.glNormalPointer = load.invoke("glNormalPointer", IIPV);
        caps.glPopClientAttrib = load.invoke("glPopClientAttrib", V);
        caps.glPrioritizeTextures = load.invoke("glPrioritizeTextures", IPPV);
        caps.glPushClientAttrib = load.invoke("glPushClientAttrib", IV);
        caps.glTexCoordPointer = load.invoke("glTexCoordPointer", IIIPV);
        caps.glVertexPointer = load.invoke("glVertexPointer", IIIPV);
    }

    public static boolean areTexturesResident(int n, Addressable textures, Addressable residences) {
        var caps = GLLoader.getCapabilities();
        try {
            return (boolean) check(caps.glAreTexturesResident).invokeExact(n, textures, residences);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean areTexturesResident(SegmentAllocator allocator, int[] textures, boolean[] residences) {
        final int n = textures.length;
        var pTex = allocator.allocateArray(JAVA_INT, n);
        var pRes = allocator.allocateArray(JAVA_BOOLEAN, n);
        boolean b = areTexturesResident(n, pTex, pRes);
        for (int i = 0; i < n; i++) {
            textures[i] = pTex.getAtIndex(JAVA_INT, i);
            residences[i] = pTex.get(JAVA_BOOLEAN, i);
        }
        return b;
    }

    public static void arrayElement(int i) {
        var caps = GLLoader.getCapabilities();
        try {
            check(caps.glArrayElement).invokeExact(i);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void colorPointer(int size, int type, int stride, Addressable pointer) {
        var caps = GLLoader.getCapabilities();
        try {
            check(caps.glColorPointer).invokeExact(size, type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void colorPointer(SegmentAllocator allocator, int size, int type, int stride, byte[] pointer) {
        colorPointer(size, type, stride, allocator.allocateArray(JAVA_BYTE, pointer));
    }

    public static void colorPointer(SegmentAllocator allocator, int size, int type, int stride, short[] pointer) {
        colorPointer(size, type, stride, allocator.allocateArray(JAVA_SHORT, pointer));
    }

    public static void colorPointer(SegmentAllocator allocator, int size, int type, int stride, int[] pointer) {
        colorPointer(size, type, stride, allocator.allocateArray(JAVA_INT, pointer));
    }

    public static void colorPointer(SegmentAllocator allocator, int size, int type, int stride, float[] pointer) {
        colorPointer(size, type, stride, allocator.allocateArray(JAVA_FLOAT, pointer));
    }

    public static void colorPointer(SegmentAllocator allocator, int size, int type, int stride, double[] pointer) {
        colorPointer(size, type, stride, allocator.allocateArray(JAVA_DOUBLE, pointer));
    }

    public static void disableClientState(int array) {
        var caps = GLLoader.getCapabilities();
        try {
            check(caps.glDisableClientState).invokeExact(array);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void edgeFlagPointer(int stride, Addressable pointer) {
        var caps = GLLoader.getCapabilities();
        try {
            check(caps.glEdgeFlagPointer).invokeExact(stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void enableClientState(int array) {
        var caps = GLLoader.getCapabilities();
        try {
            check(caps.glEnableClientState).invokeExact(array);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexPointer(int type, int stride, Addressable pointer) {
        var caps = GLLoader.getCapabilities();
        try {
            check(caps.glIndexPointer).invokeExact(type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexPointer(SegmentAllocator allocator, int type, int stride, byte[] pointer) {
        indexPointer(type, stride, allocator.allocateArray(JAVA_BYTE, pointer));
    }

    public static void indexPointer(SegmentAllocator allocator, int type, int stride, short[] pointer) {
        indexPointer(type, stride, allocator.allocateArray(JAVA_SHORT, pointer));
    }

    public static void indexPointer(SegmentAllocator allocator, int type, int stride, int[] pointer) {
        indexPointer(type, stride, allocator.allocateArray(JAVA_INT, pointer));
    }

    public static void indexPointer(SegmentAllocator allocator, int type, int stride, float[] pointer) {
        indexPointer(type, stride, allocator.allocateArray(JAVA_FLOAT, pointer));
    }

    public static void indexPointer(SegmentAllocator allocator, int type, int stride, double[] pointer) {
        indexPointer(type, stride, allocator.allocateArray(JAVA_DOUBLE, pointer));
    }

    public static void indexub(byte c) {
        var caps = GLLoader.getCapabilities();
        try {
            check(caps.glIndexub).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexubv(Addressable c) {
        var caps = GLLoader.getCapabilities();
        try {
            check(caps.glIndexubv).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexubv(SegmentAllocator allocator, byte[] c) {
        var pc = allocator.allocateArray(JAVA_BYTE, c);
        indexubv(pc);
    }

    public static void interleavedArrays(int format, int stride, Addressable pointer) {
        var caps = GLLoader.getCapabilities();
        try {
            check(caps.glInterleavedArrays).invokeExact(format, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void interleavedArrays(SegmentAllocator allocator, int format, int stride, float[] pointer) {
        var pp = allocator.allocateArray(JAVA_FLOAT, pointer);
        interleavedArrays(format, stride, pp);
    }

    public static void normalPointer(int type, int stride, Addressable pointer) {
        var caps = GLLoader.getCapabilities();
        try {
            check(caps.glNormalPointer).invokeExact(type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normalPointer(SegmentAllocator allocator, int type, int stride, byte[] pointer) {
        normalPointer(type, stride, allocator.allocateArray(JAVA_BYTE, pointer));
    }

    public static void normalPointer(SegmentAllocator allocator, int type, int stride, short[] pointer) {
        normalPointer(type, stride, allocator.allocateArray(JAVA_SHORT, pointer));
    }

    public static void normalPointer(SegmentAllocator allocator, int type, int stride, int[] pointer) {
        normalPointer(type, stride, allocator.allocateArray(JAVA_INT, pointer));
    }

    public static void normalPointer(SegmentAllocator allocator, int type, int stride, float[] pointer) {
        normalPointer(type, stride, allocator.allocateArray(JAVA_FLOAT, pointer));
    }

    public static void normalPointer(SegmentAllocator allocator, int type, int stride, double[] pointer) {
        normalPointer(type, stride, allocator.allocateArray(JAVA_DOUBLE, pointer));
    }

    public static void popClientAttrib() {
        var caps = GLLoader.getCapabilities();
        try {
            check(caps.glPopClientAttrib).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void prioritizeTextures(int n, Addressable textures, Addressable priorities) {
        var caps = GLLoader.getCapabilities();
        try {
            check(caps.glPrioritizeTextures).invokeExact(n, textures, priorities);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void prioritizeTextures(SegmentAllocator allocator, int[] textures, float[] priorities) {
        final int n = textures.length;
        var pTex = allocator.allocateArray(JAVA_INT, n);
        var pPri = allocator.allocateArray(JAVA_FLOAT, n);
        for (int i = 0; i < n; i++) {
            pTex.setAtIndex(JAVA_INT, i, textures[i]);
            pPri.setAtIndex(JAVA_FLOAT, i, priorities[i]);
        }
        prioritizeTextures(n, pTex, pPri);
    }

    public static void pushClientAttrib(int mask) {
        var caps = GLLoader.getCapabilities();
        try {
            check(caps.glPushClientAttrib).invokeExact(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoordPointer(int size, int type, int stride, Addressable pointer) {
        var caps = GLLoader.getCapabilities();
        try {
            check(caps.glTexCoordPointer).invokeExact(size, type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoordPointer(SegmentAllocator allocator, int size, int type, int stride, short[] pointer) {
        texCoordPointer(size, type, stride, allocator.allocateArray(JAVA_SHORT, pointer));
    }

    public static void texCoordPointer(SegmentAllocator allocator, int size, int type, int stride, int[] pointer) {
        texCoordPointer(size, type, stride, allocator.allocateArray(JAVA_INT, pointer));
    }

    public static void texCoordPointer(SegmentAllocator allocator, int size, int type, int stride, float[] pointer) {
        texCoordPointer(size, type, stride, allocator.allocateArray(JAVA_FLOAT, pointer));
    }

    public static void texCoordPointer(SegmentAllocator allocator, int size, int type, int stride, double[] pointer) {
        texCoordPointer(size, type, stride, allocator.allocateArray(JAVA_DOUBLE, pointer));
    }

    public static void vertexPointer(int size, int type, int stride, Addressable pointer) {
        var caps = GLLoader.getCapabilities();
        try {
            check(caps.glVertexPointer).invokeExact(size, type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexPointer(SegmentAllocator allocator, int size, int type, int stride, short[] pointer) {
        vertexPointer(size, type, stride, allocator.allocateArray(JAVA_SHORT, pointer));
    }

    public static void vertexPointer(SegmentAllocator allocator, int size, int type, int stride, int[] pointer) {
        vertexPointer(size, type, stride, allocator.allocateArray(JAVA_INT, pointer));
    }

    public static void vertexPointer(SegmentAllocator allocator, int size, int type, int stride, float[] pointer) {
        vertexPointer(size, type, stride, allocator.allocateArray(JAVA_FLOAT, pointer));
    }

    public static void vertexPointer(SegmentAllocator allocator, int size, int type, int stride, double[] pointer) {
        vertexPointer(size, type, stride, allocator.allocateArray(JAVA_DOUBLE, pointer));
    }
}
