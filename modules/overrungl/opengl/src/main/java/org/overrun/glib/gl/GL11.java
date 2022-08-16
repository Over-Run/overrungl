package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static org.overrun.glib.gl.GL.*;

/**
 * The OpenGL 1.1 functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public class GL11 extends GL11C {
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

    static void load(GLLoadFunc load) throws Throwable {
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

    public static boolean areTexturesResident(int n, MemoryAddress textures, MemoryAddress residences) throws Throwable {
        return (boolean) check(glAreTexturesResident).invoke(n, textures, residences);
    }

    public static boolean areTexturesResident(int n, int[] textures, boolean[] residences) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pTex = session.allocateArray(ValueLayout.JAVA_INT, n);
            var pRes = session.allocateArray(ValueLayout.JAVA_BOOLEAN, n);
            boolean b = areTexturesResident(n, pTex.address(), pRes.address());
            for (int i = 0; i < n; i++) {
                textures[i] = pTex.getAtIndex(ValueLayout.JAVA_INT, i);
                residences[i] = pTex.get(ValueLayout.JAVA_BOOLEAN, i);
            }
            return b;
        }
    }

    public static boolean areTexturesResident(int[] textures, boolean[] residences) throws Throwable {
        return areTexturesResident(textures.length, textures, residences);
    }

    public static void arrayElement(int i) throws Throwable {
        check(glArrayElement).invoke(i);
    }

    public static void colorPointer(int size, int type, int stride, MemoryAddress pointer) throws Throwable {
        check(glColorPointer).invoke(size, type, stride, pointer);
    }

    public static void disableClientState(int array) throws Throwable {
        check(glDisableClientState).invoke(array);
    }

    public static void edgeFlagPointer(int stride, MemoryAddress pointer) throws Throwable {
        check(glEdgeFlagPointer).invoke(stride, pointer);
    }

    public static void enableClientState(int array) throws Throwable {
        check(glEnableClientState).invoke(array);
    }

    public static void indexPointer(int type, int stride, MemoryAddress pointer) throws Throwable {
        check(glIndexPointer).invoke(type, stride, pointer);
    }

    public static void indexub(byte c) throws Throwable {
        check(glIndexub).invoke(c);
    }

    public static void indexubv(MemoryAddress c) throws Throwable {
        check(glIndexubv).invoke(c);
    }

    public static void indexubv(byte[] c) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pc = session.allocateArray(ValueLayout.JAVA_BYTE, c);
            indexubv(pc.address());
        }
    }

    public static void interleavedArrays(int format, int stride, MemoryAddress pointer) throws Throwable {
        check(glInterleavedArrays).invoke(format, stride, pointer);
    }

    public static void interleavedArrays(int format, int stride, float[] pointer) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pp = session.allocateArray(ValueLayout.JAVA_FLOAT, pointer);
            interleavedArrays(format, stride, pp.address());
        }
    }

    public static void normalPointer(int type, int stride, MemoryAddress pointer) throws Throwable {
        check(glNormalPointer).invoke(type, stride, pointer);
    }

    public static void popClientAttrib() throws Throwable {
        check(glPopClientAttrib).invoke();
    }

    public static void prioritizeTextures(int n, MemoryAddress textures, MemoryAddress priorities) throws Throwable {
        check(glPrioritizeTextures).invoke(n, textures, priorities);
    }

    public static void prioritizeTextures(int n, int[] textures, float[] priorities) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pTex = session.allocateArray(ValueLayout.JAVA_INT, n);
            var pPri = session.allocateArray(ValueLayout.JAVA_FLOAT, n);
            for (int i = 0; i < n; i++) {
                pTex.setAtIndex(ValueLayout.JAVA_INT, i, textures[i]);
                pPri.setAtIndex(ValueLayout.JAVA_FLOAT, i, priorities[i]);
            }
            prioritizeTextures(n, pTex.address(), pPri.address());
        }
    }

    public static void prioritizeTextures(int[] textures, float[] priorities) throws Throwable {
        prioritizeTextures(textures.length, textures, priorities);
    }

    public static void pushClientAttrib(int mask) throws Throwable {
        check(glPushClientAttrib).invoke(mask);
    }

    public static void texCoordPointer(int size, int type, int stride, MemoryAddress pointer) throws Throwable {
        check(glTexCoordPointer).invoke(size, type, stride, pointer);
    }

    public static void vertexPointer(int size, int type, int stride, MemoryAddress pointer) throws Throwable {
        check(glVertexPointer).invoke(size, type, stride, pointer);
    }
}
