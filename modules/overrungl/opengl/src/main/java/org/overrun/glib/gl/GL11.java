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
import static org.overrun.glib.gl.GLCaps.Ver11;
import static org.overrun.glib.gl.GLCaps.check;

/**
 * The OpenGL 1.1 functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL11 extends GL11C {
    @Nullable
    public static MethodHandle
        glAreTexturesResident, glArrayElement, glColorPointer, glDisableClientState, glEdgeFlagPointer,
        glEnableClientState, glIndexPointer, glIndexub, glIndexubv, glInterleavedArrays, glNormalPointer,
        glPopClientAttrib, glPrioritizeTextures, glPushClientAttrib, glTexCoordPointer, glVertexPointer;

    static void load(GLLoadFunc load) {
        if (!Ver11) return;
        glAreTexturesResident = load.invoke("glAreTexturesResident", IPPZ);
        glArrayElement = load.invoke("glArrayElement", IV);
        glColorPointer = load.invoke("glColorPointer", IIIPV);
        glDisableClientState = load.invoke("glDisableClientState", IV);
        glEdgeFlagPointer = load.invoke("glEdgeFlagPointer", IPV);
        glEnableClientState = load.invoke("glEnableClientState", IV);
        glIndexPointer = load.invoke("glIndexPointer", IIPV);
        glIndexub = load.invoke("glIndexub", BV);
        glIndexubv = load.invoke("glIndexubv", PV);
        glInterleavedArrays = load.invoke("glInterleavedArrays", IIPV);
        glNormalPointer = load.invoke("glNormalPointer", IIPV);
        glPopClientAttrib = load.invoke("glPopClientAttrib", V);
        glPrioritizeTextures = load.invoke("glPrioritizeTextures", IPPV);
        glPushClientAttrib = load.invoke("glPushClientAttrib", IV);
        glTexCoordPointer = load.invoke("glTexCoordPointer", IIIPV);
        glVertexPointer = load.invoke("glVertexPointer", IIIPV);
    }

    public static boolean areTexturesResident(int n, Addressable textures, Addressable residences) {
        try {
            return (boolean) check(glAreTexturesResident).invoke(n, textures, residences);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean areTexturesResident(int[] textures, boolean[] residences) {
        try (var session = MemorySession.openShared()) {
            final int n = textures.length;
            var pTex = session.allocateArray(JAVA_INT, n);
            var pRes = session.allocateArray(JAVA_BOOLEAN, n);
            boolean b = areTexturesResident(n, pTex, pRes);
            for (int i = 0; i < n; i++) {
                textures[i] = pTex.getAtIndex(JAVA_INT, i);
                residences[i] = pTex.get(JAVA_BOOLEAN, i);
            }
            return b;
        }
    }

    public static void arrayElement(int i) {
        try {
            check(glArrayElement).invoke(i);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void colorPointer(int size, int type, int stride, Addressable pointer) {
        try {
            check(glColorPointer).invoke(size, type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void colorPointer(int size, int type, int stride, byte[] pointer) {
        try (var session = MemorySession.openShared()) {
            colorPointer(size, type, stride, session.allocateArray(JAVA_BYTE, pointer));
        }
    }

    public static void colorPointer(int size, int type, int stride, short[] pointer) {
        try (var session = MemorySession.openShared()) {
            colorPointer(size, type, stride, session.allocateArray(JAVA_SHORT, pointer));
        }
    }

    public static void colorPointer(int size, int type, int stride, int[] pointer) {
        try (var session = MemorySession.openShared()) {
            colorPointer(size, type, stride, session.allocateArray(JAVA_INT, pointer));
        }
    }

    public static void colorPointer(int size, int type, int stride, float[] pointer) {
        try (var session = MemorySession.openShared()) {
            colorPointer(size, type, stride, session.allocateArray(JAVA_FLOAT, pointer));
        }
    }

    public static void colorPointer(int size, int type, int stride, double[] pointer) {
        try (var session = MemorySession.openShared()) {
            colorPointer(size, type, stride, session.allocateArray(JAVA_DOUBLE, pointer));
        }
    }

    public static void disableClientState(int array) {
        try {
            check(glDisableClientState).invoke(array);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void edgeFlagPointer(int stride, Addressable pointer) {
        try {
            check(glEdgeFlagPointer).invoke(stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void enableClientState(int array) {
        try {
            check(glEnableClientState).invoke(array);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void indexPointer(int type, int stride, Addressable pointer) {
        try {
            check(glIndexPointer).invoke(type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void indexPointer(int type, int stride, byte[] pointer) {
        try (var session = MemorySession.openShared()) {
            indexPointer(type, stride, session.allocateArray(JAVA_BYTE, pointer));
        }
    }

    public static void indexPointer(int type, int stride, short[] pointer) {
        try (var session = MemorySession.openShared()) {
            indexPointer(type, stride, session.allocateArray(JAVA_SHORT, pointer));
        }
    }

    public static void indexPointer(int type, int stride, int[] pointer) {
        try (var session = MemorySession.openShared()) {
            indexPointer(type, stride, session.allocateArray(JAVA_INT, pointer));
        }
    }

    public static void indexPointer(int type, int stride, float[] pointer) {
        try (var session = MemorySession.openShared()) {
            indexPointer(type, stride, session.allocateArray(JAVA_FLOAT, pointer));
        }
    }

    public static void indexPointer(int type, int stride, double[] pointer) {
        try (var session = MemorySession.openShared()) {
            indexPointer(type, stride, session.allocateArray(JAVA_DOUBLE, pointer));
        }
    }

    public static void indexub(byte c) {
        try {
            check(glIndexub).invoke(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void indexubv(Addressable c) {
        try {
            check(glIndexubv).invoke(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void indexubv(byte[] c) {
        try (var session = MemorySession.openShared()) {
            var pc = session.allocateArray(JAVA_BYTE, c);
            indexubv(pc);
        }
    }

    public static void interleavedArrays(int format, int stride, Addressable pointer) {
        try {
            check(glInterleavedArrays).invoke(format, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void interleavedArrays(int format, int stride, float[] pointer) {
        try (var session = MemorySession.openShared()) {
            var pp = session.allocateArray(JAVA_FLOAT, pointer);
            interleavedArrays(format, stride, pp);
        }
    }

    public static void normalPointer(int type, int stride, Addressable pointer) {
        try {
            check(glNormalPointer).invoke(type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void normalPointer(int type, int stride, byte[] pointer) {
        try (var session = MemorySession.openShared()) {
            normalPointer(type, stride, session.allocateArray(JAVA_BYTE, pointer));
        }
    }

    public static void normalPointer(int type, int stride, short[] pointer) {
        try (var session = MemorySession.openShared()) {
            normalPointer(type, stride, session.allocateArray(JAVA_SHORT, pointer));
        }
    }

    public static void normalPointer(int type, int stride, int[] pointer) {
        try (var session = MemorySession.openShared()) {
            normalPointer(type, stride, session.allocateArray(JAVA_INT, pointer));
        }
    }

    public static void normalPointer(int type, int stride, float[] pointer) {
        try (var session = MemorySession.openShared()) {
            normalPointer(type, stride, session.allocateArray(JAVA_FLOAT, pointer));
        }
    }

    public static void normalPointer(int type, int stride, double[] pointer) {
        try (var session = MemorySession.openShared()) {
            normalPointer(type, stride, session.allocateArray(JAVA_DOUBLE, pointer));
        }
    }

    public static void popClientAttrib() {
        try {
            check(glPopClientAttrib).invoke();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void prioritizeTextures(int n, Addressable textures, Addressable priorities) {
        try {
            check(glPrioritizeTextures).invoke(n, textures, priorities);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void prioritizeTextures(int[] textures, float[] priorities) {
        try (var session = MemorySession.openShared()) {
            final int n = textures.length;
            var pTex = session.allocateArray(JAVA_INT, n);
            var pPri = session.allocateArray(JAVA_FLOAT, n);
            for (int i = 0; i < n; i++) {
                pTex.setAtIndex(JAVA_INT, i, textures[i]);
                pPri.setAtIndex(JAVA_FLOAT, i, priorities[i]);
            }
            prioritizeTextures(n, pTex, pPri);
        }
    }

    public static void pushClientAttrib(int mask) {
        try {
            check(glPushClientAttrib).invoke(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoordPointer(int size, int type, int stride, Addressable pointer) {
        try {
            check(glTexCoordPointer).invoke(size, type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texCoordPointer(int size, int type, int stride, short[] pointer) {
        try (var session = MemorySession.openShared()) {
            texCoordPointer(size, type, stride, session.allocateArray(JAVA_SHORT, pointer));
        }
    }

    public static void texCoordPointer(int size, int type, int stride, int[] pointer) {
        try (var session = MemorySession.openShared()) {
            texCoordPointer(size, type, stride, session.allocateArray(JAVA_INT, pointer));
        }
    }

    public static void texCoordPointer(int size, int type, int stride, float[] pointer) {
        try (var session = MemorySession.openShared()) {
            texCoordPointer(size, type, stride, session.allocateArray(JAVA_FLOAT, pointer));
        }
    }

    public static void texCoordPointer(int size, int type, int stride, double[] pointer) {
        try (var session = MemorySession.openShared()) {
            texCoordPointer(size, type, stride, session.allocateArray(JAVA_DOUBLE, pointer));
        }
    }

    public static void vertexPointer(int size, int type, int stride, Addressable pointer) {
        try {
            check(glVertexPointer).invoke(size, type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexPointer(int size, int type, int stride, short[] pointer) {
        try (var session = MemorySession.openShared()) {
            vertexPointer(size, type, stride, session.allocateArray(JAVA_SHORT, pointer));
        }
    }

    public static void vertexPointer(int size, int type, int stride, int[] pointer) {
        try (var session = MemorySession.openShared()) {
            vertexPointer(size, type, stride, session.allocateArray(JAVA_INT, pointer));
        }
    }

    public static void vertexPointer(int size, int type, int stride, float[] pointer) {
        try (var session = MemorySession.openShared()) {
            vertexPointer(size, type, stride, session.allocateArray(JAVA_FLOAT, pointer));
        }
    }

    public static void vertexPointer(int size, int type, int stride, double[] pointer) {
        try (var session = MemorySession.openShared()) {
            vertexPointer(size, type, stride, session.allocateArray(JAVA_DOUBLE, pointer));
        }
    }
}
