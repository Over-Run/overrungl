package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static org.overrun.glib.gl.GLCaps.*;

/**
 * The OpenGL 1.1 functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL11 extends GL11C {
    @Nullable
    public static MethodHandle
        glAreTexturesResident, glArrayElement,
        glColorPointer,
        glDisableClientState,
        glEdgeFlagPointer, glEnableClientState,
        glIndexPointer, glIndexub, glIndexubv,
        glInterleavedArrays,
        glNormalPointer,
        glPopClientAttrib, glPrioritizeTextures, glPushClientAttrib,
        glTexCoordPointer,
        glVertexPointer;

    static void load(GLLoadFunc load) {
        if (!Ver11) return;
        glAreTexturesResident = downcallSafe(load.invoke("glAreTexturesResident"), dIPPZ);
        glArrayElement = downcallSafe(load.invoke("glArrayElement"), dIV);
        glColorPointer = downcallSafe(load.invoke("glColorPointer"), dIIIPV);
        glDisableClientState = downcallSafe(load.invoke("glDisableClientState"), dIV);
        glEdgeFlagPointer = downcallSafe(load.invoke("glEdgeFlagPointer"), dIPV);
        glEnableClientState = downcallSafe(load.invoke("glEnableClientState"), dIV);
        glIndexPointer = downcallSafe(load.invoke("glIndexPointer"), dIIPV);
        glIndexub = downcallSafe(load.invoke("glIndexub"), dBV);
        glIndexubv = downcallSafe(load.invoke("glIndexubv"), dPV);
        glInterleavedArrays = downcallSafe(load.invoke("glInterleavedArrays"), dIIPV);
        glNormalPointer = downcallSafe(load.invoke("glNormalPointer"), dIIPV);
        glPopClientAttrib = downcallSafe(load.invoke("glPopClientAttrib"), dV);
        glPrioritizeTextures = downcallSafe(load.invoke("glPrioritizeTextures"), dIPPV);
        glPushClientAttrib = downcallSafe(load.invoke("glPushClientAttrib"), dIV);
        glTexCoordPointer = downcallSafe(load.invoke("glTexCoordPointer"), dIIIPV);
        glVertexPointer = downcallSafe(load.invoke("glVertexPointer"), dIIIPV);
    }

    public static boolean areTexturesResident(int n, Addressable textures, Addressable residences) {
        try {
            return (boolean) check(glAreTexturesResident).invoke(n, textures, residences);
        } catch (Throwable e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean areTexturesResident(int n, int[] textures, boolean[] residences) {
        try (var session = MemorySession.openShared()) {
            var pTex = session.allocateArray(ValueLayout.JAVA_INT, n);
            var pRes = session.allocateArray(ValueLayout.JAVA_BOOLEAN, n);
            boolean b = areTexturesResident(n, pTex, pRes);
            for (int i = 0; i < n; i++) {
                textures[i] = pTex.getAtIndex(ValueLayout.JAVA_INT, i);
                residences[i] = pTex.get(ValueLayout.JAVA_BOOLEAN, i);
            }
            return b;
        }
    }

    public static boolean areTexturesResident(int[] textures, boolean[] residences) {
        return areTexturesResident(textures.length, textures, residences);
    }

    public static void arrayElement(int i) {
        try {
            check(glArrayElement).invoke(i);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void colorPointer(int size, int type, int stride, Addressable pointer) {
        try {
            check(glColorPointer).invoke(size, type, stride, pointer);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void colorPointer(int size, int type, int stride, byte[] pointer) {
        try (var session = MemorySession.openShared()) {
            colorPointer(size, type, stride, session.allocateArray(ValueLayout.JAVA_BYTE, pointer));
        }
    }

    public static void colorPointer(int size, int type, int stride, short[] pointer) {
        try (var session = MemorySession.openShared()) {
            colorPointer(size, type, stride, session.allocateArray(ValueLayout.JAVA_SHORT, pointer));
        }
    }

    public static void colorPointer(int size, int type, int stride, int[] pointer) {
        try (var session = MemorySession.openShared()) {
            colorPointer(size, type, stride, session.allocateArray(ValueLayout.JAVA_INT, pointer));
        }
    }

    public static void colorPointer(int size, int type, int stride, float[] pointer) {
        try (var session = MemorySession.openShared()) {
            colorPointer(size, type, stride, session.allocateArray(ValueLayout.JAVA_FLOAT, pointer));
        }
    }

    public static void colorPointer(int size, int type, int stride, double[] pointer) {
        try (var session = MemorySession.openShared()) {
            colorPointer(size, type, stride, session.allocateArray(ValueLayout.JAVA_DOUBLE, pointer));
        }
    }

    public static void disableClientState(int array) {
        try {
            check(glDisableClientState).invoke(array);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void edgeFlagPointer(int stride, Addressable pointer) {
        try {
            check(glEdgeFlagPointer).invoke(stride, pointer);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void enableClientState(int array) {
        try {
            check(glEnableClientState).invoke(array);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void indexPointer(int type, int stride, Addressable pointer) {
        try {
            check(glIndexPointer).invoke(type, stride, pointer);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void indexPointer(int type, int stride, byte[] pointer) {
        try (var session = MemorySession.openShared()) {
            indexPointer(type, stride, session.allocateArray(ValueLayout.JAVA_BYTE, pointer));
        }
    }

    public static void indexPointer(int type, int stride, short[] pointer) {
        try (var session = MemorySession.openShared()) {
            indexPointer(type, stride, session.allocateArray(ValueLayout.JAVA_SHORT, pointer));
        }
    }

    public static void indexPointer(int type, int stride, int[] pointer) {
        try (var session = MemorySession.openShared()) {
            indexPointer(type, stride, session.allocateArray(ValueLayout.JAVA_INT, pointer));
        }
    }

    public static void indexPointer(int type, int stride, float[] pointer) {
        try (var session = MemorySession.openShared()) {
            indexPointer(type, stride, session.allocateArray(ValueLayout.JAVA_FLOAT, pointer));
        }
    }

    public static void indexPointer(int type, int stride, double[] pointer) {
        try (var session = MemorySession.openShared()) {
            indexPointer(type, stride, session.allocateArray(ValueLayout.JAVA_DOUBLE, pointer));
        }
    }

    public static void indexub(byte c) {
        try {
            check(glIndexub).invoke(c);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void indexubv(Addressable c) {
        try {
            check(glIndexubv).invoke(c);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void indexubv(byte[] c) {
        try (var session = MemorySession.openShared()) {
            var pc = session.allocateArray(ValueLayout.JAVA_BYTE, c);
            indexubv(pc);
        }
    }

    public static void interleavedArrays(int format, int stride, Addressable pointer) {
        try {
            check(glInterleavedArrays).invoke(format, stride, pointer);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void interleavedArrays(int format, int stride, float[] pointer) {
        try (var session = MemorySession.openShared()) {
            var pp = session.allocateArray(ValueLayout.JAVA_FLOAT, pointer);
            interleavedArrays(format, stride, pp);
        }
    }

    public static void normalPointer(int type, int stride, Addressable pointer) {
        try {
            check(glNormalPointer).invoke(type, stride, pointer);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void normalPointer(int type, int stride, byte[] pointer) {
        try (var session = MemorySession.openShared()) {
            normalPointer(type, stride, session.allocateArray(ValueLayout.JAVA_BYTE, pointer));
        }
    }

    public static void normalPointer(int type, int stride, short[] pointer) {
        try (var session = MemorySession.openShared()) {
            normalPointer(type, stride, session.allocateArray(ValueLayout.JAVA_SHORT, pointer));
        }
    }

    public static void normalPointer(int type, int stride, int[] pointer) {
        try (var session = MemorySession.openShared()) {
            normalPointer(type, stride, session.allocateArray(ValueLayout.JAVA_INT, pointer));
        }
    }

    public static void normalPointer(int type, int stride, float[] pointer) {
        try (var session = MemorySession.openShared()) {
            normalPointer(type, stride, session.allocateArray(ValueLayout.JAVA_FLOAT, pointer));
        }
    }

    public static void normalPointer(int type, int stride, double[] pointer) {
        try (var session = MemorySession.openShared()) {
            normalPointer(type, stride, session.allocateArray(ValueLayout.JAVA_DOUBLE, pointer));
        }
    }

    public static void popClientAttrib() {
        try {
            check(glPopClientAttrib).invoke();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void prioritizeTextures(int n, Addressable textures, Addressable priorities) {
        try {
            check(glPrioritizeTextures).invoke(n, textures, priorities);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void prioritizeTextures(int n, int[] textures, float[] priorities) {
        try (var session = MemorySession.openShared()) {
            var pTex = session.allocateArray(ValueLayout.JAVA_INT, n);
            var pPri = session.allocateArray(ValueLayout.JAVA_FLOAT, n);
            for (int i = 0; i < n; i++) {
                pTex.setAtIndex(ValueLayout.JAVA_INT, i, textures[i]);
                pPri.setAtIndex(ValueLayout.JAVA_FLOAT, i, priorities[i]);
            }
            prioritizeTextures(n, pTex, pPri);
        }
    }

    public static void prioritizeTextures(int[] textures, float[] priorities) {
        prioritizeTextures(textures.length, textures, priorities);
    }

    public static void pushClientAttrib(int mask) {
        try {
            check(glPushClientAttrib).invoke(mask);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void texCoordPointer(int size, int type, int stride, Addressable pointer) {
        try {
            check(glTexCoordPointer).invoke(size, type, stride, pointer);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void texCoordPointer(int size, int type, int stride, short[] pointer) {
        try (var session = MemorySession.openShared()) {
            texCoordPointer(size, type, stride, session.allocateArray(ValueLayout.JAVA_SHORT, pointer));
        }
    }

    public static void texCoordPointer(int size, int type, int stride, int[] pointer) {
        try (var session = MemorySession.openShared()) {
            texCoordPointer(size, type, stride, session.allocateArray(ValueLayout.JAVA_INT, pointer));
        }
    }

    public static void texCoordPointer(int size, int type, int stride, float[] pointer) {
        try (var session = MemorySession.openShared()) {
            texCoordPointer(size, type, stride, session.allocateArray(ValueLayout.JAVA_FLOAT, pointer));
        }
    }

    public static void texCoordPointer(int size, int type, int stride, double[] pointer) {
        try (var session = MemorySession.openShared()) {
            texCoordPointer(size, type, stride, session.allocateArray(ValueLayout.JAVA_DOUBLE, pointer));
        }
    }

    public static void vertexPointer(int size, int type, int stride, Addressable pointer) {
        try {
            check(glVertexPointer).invoke(size, type, stride, pointer);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexPointer(int size, int type, int stride, short[] pointer) {
        try (var session = MemorySession.openShared()) {
            vertexPointer(size, type, stride, session.allocateArray(ValueLayout.JAVA_SHORT, pointer));
        }
    }

    public static void vertexPointer(int size, int type, int stride, int[] pointer) {
        try (var session = MemorySession.openShared()) {
            vertexPointer(size, type, stride, session.allocateArray(ValueLayout.JAVA_INT, pointer));
        }
    }

    public static void vertexPointer(int size, int type, int stride, float[] pointer) {
        try (var session = MemorySession.openShared()) {
            vertexPointer(size, type, stride, session.allocateArray(ValueLayout.JAVA_FLOAT, pointer));
        }
    }

    public static void vertexPointer(int size, int type, int stride, double[] pointer) {
        try (var session = MemorySession.openShared()) {
            vertexPointer(size, type, stride, session.allocateArray(ValueLayout.JAVA_DOUBLE, pointer));
        }
    }
}
