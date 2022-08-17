package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static org.overrun.glib.gl.GL.*;

/**
 * The OpenGL 1.1 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL11C extends GL10C permits GL11, GL12C {
    @Nullable
    public static MethodHandle
        glBindTexture,
        glCopyTexImage1D, glCopyTexImage2D,
        glCopyTexSubImage1D, glCopyTexSubImage2D,
        glDeleteTextures,
        glDrawArrays, glDrawElements,
        glGenTextures, glGetPointerv,
        glIsTexture,
        glPolygonOffset,
        glTexSubImage1D, glTexSubImage2D;

    static void load(GLLoadFunc load) {
        if (!Ver11) return;
        glBindTexture = downcallSafe(load.invoke("glBindTexture"), dIIV);
        glCopyTexImage1D = downcallSafe(load.invoke("glCopyTexImage1D"), dIIIIIIIV);
        glCopyTexImage2D = downcallSafe(load.invoke("glCopyTexImage2D"), dIIIIIIIIV);
        glCopyTexSubImage1D = downcallSafe(load.invoke("glCopyTexSubImage1D"), dIIIIIIV);
        glCopyTexSubImage2D = downcallSafe(load.invoke("glCopyTexSubImage2D"), dIIIIIIIIV);
        glDeleteTextures = downcallSafe(load.invoke("glDeleteTextures"), dIPV);
        glDrawArrays = downcallSafe(load.invoke("glDrawArrays"), dIIIV);
        glDrawElements = downcallSafe(load.invoke("glDrawElements"), dIIIPV);
        glGenTextures = downcallSafe(load.invoke("glGenTextures"), dIPV);
        glGetPointerv = downcallSafe(load.invoke("glGetPointerv"), dIPV);
        glIsTexture = downcallSafe(load.invoke("glIsTexture"), dIZ);
        glPolygonOffset = downcallSafe(load.invoke("glPolygonOffset"), dFFV);
        glTexSubImage1D = downcallSafe(load.invoke("glTexSubImage1D"), dIIIIIIPV);
        glTexSubImage2D = downcallSafe(load.invoke("glTexSubImage2D"), dIIIIIIIIPV);
    }

    public static void bindTexture(int target, int texture) {
        try {
            check(glBindTexture).invoke(target, texture);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void copyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border) {
        try {
            check(glCopyTexImage1D).invoke(target, level, internalFormat, x, y, width, border);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void copyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border) {
        try {
            check(glCopyTexImage2D).invoke(target, level, internalFormat, x, y, width, height, border);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void copyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width) {
        try {
            check(glCopyTexSubImage1D).invoke(target, level, xoffset, x, y, width);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void copyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        try {
            check(glCopyTexSubImage2D).invoke(target, level, xoffset, yoffset, x, y, width, height);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void deleteTextures(int n, Addressable textures) {
        try {
            check(glDeleteTextures).invoke(n, textures);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void deleteTextures(int n, int[] textures) {
        try (var session = MemorySession.openShared()) {
            var pTex = session.allocateArray(ValueLayout.JAVA_INT, textures);
            deleteTextures(n, pTex);
        }
    }

    public static void deleteTexture(int n, int texture) {
        try (var session = MemorySession.openShared()) {
            deleteTextures(n, session.allocate(ValueLayout.JAVA_INT, texture));
        }
    }

    public static void drawArrays(int mode, int first, int count) {
        try {
            check(glDrawArrays).invoke(mode, first, count);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void drawElements(int mode, int count, int type, Addressable indices) {
        try {
            check(glDrawElements).invoke(mode, count, type, indices);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void drawElements(int mode, int count, int type, byte[] indices) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(ValueLayout.JAVA_BYTE, indices);
            drawElements(mode, count, type, seg);
        }
    }

    public static void drawElements(int mode, int count, int type, short[] indices) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(ValueLayout.JAVA_SHORT, indices);
            drawElements(mode, count, type, seg);
        }
    }

    public static void drawElements(int mode, int count, int type, int[] indices) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(ValueLayout.JAVA_INT, indices);
            drawElements(mode, count, type, seg);
        }
    }

    public static void genTextures(int n, Addressable textures) {
        try {
            check(glGenTextures).invoke(n, textures);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void genTextures(int n, int[] textures) {
        try (var session = MemorySession.openShared()) {
            var pTex = session.allocateArray(ValueLayout.JAVA_INT, n);
            genTextures(n, pTex);
            for (int i = 0; i < n; i++) {
                textures[n] = pTex.getAtIndex(ValueLayout.JAVA_INT, i);
            }
        }
    }

    public static void genTextures(int[] textures) {
        genTextures(textures.length, textures);
    }

    public static int genTexture() {
        try (var session = MemorySession.openShared()) {
            var pTex = session.allocate(ValueLayout.JAVA_INT);
            genTextures(1, pTex);
            return pTex.get(ValueLayout.JAVA_INT, 0L);
        }
    }

    public static void getPointerv(int pname, Addressable params) {
        try {
            check(glGetPointerv).invoke(pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getPointerv(int pname, MemoryAddress[] params) {
        params[0] = getPointer(pname);
    }

    public static MemoryAddress getPointer(int pname) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(ValueLayout.ADDRESS);
            getPointerv(pname, pParams);
            return pParams.get(ValueLayout.ADDRESS, 0L);
        }
    }

    public static boolean isTexture(int texture) {
        try {
            return (boolean) check(glIsTexture).invoke(texture);
        } catch (Throwable e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void polygonOffset(float factor, float units) {
        try {
            check(glPolygonOffset).invoke(factor, units);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void texSubImage1D(int target, int level, int xoffset, int width, int format, int type, Addressable pixels) {
        try {
            check(glTexSubImage1D).invoke(target, level, xoffset, width, format, type, pixels);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void texSubImage1D(int target, int level, int xoffset, int width, int format, int type, byte[] pixels) {
        try (var session = MemorySession.openShared()) {
            texSubImage1D(target, level, xoffset, width, format, type, session.allocateArray(ValueLayout.JAVA_BYTE, pixels));
        }
    }

    public static void texSubImage1D(int target, int level, int xoffset, int width, int format, int type, short[] pixels) {
        try (var session = MemorySession.openShared()) {
            texSubImage1D(target, level, xoffset, width, format, type, session.allocateArray(ValueLayout.JAVA_SHORT, pixels));
        }
    }

    public static void texSubImage1D(int target, int level, int xoffset, int width, int format, int type, int[] pixels) {
        try (var session = MemorySession.openShared()) {
            texSubImage1D(target, level, xoffset, width, format, type, session.allocateArray(ValueLayout.JAVA_INT, pixels));
        }
    }

    public static void texSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, Addressable pixels) {
        try {
            check(glTexSubImage2D).invoke(target, level, xoffset, yoffset, width, height, format, type, pixels);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void texSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, byte[] pixels) {
        try (var session = MemorySession.openShared()) {
            texSubImage2D(target, level, xoffset, yoffset, width, height, format, type, session.allocateArray(ValueLayout.JAVA_BYTE, pixels));
        }
    }

    public static void texSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        try (var session = MemorySession.openShared()) {
            texSubImage2D(target, level, xoffset, yoffset, width, height, format, type, session.allocateArray(ValueLayout.JAVA_SHORT, pixels));
        }
    }

    public static void texSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        try (var session = MemorySession.openShared()) {
            texSubImage2D(target, level, xoffset, yoffset, width, height, format, type, session.allocateArray(ValueLayout.JAVA_INT, pixels));
        }
    }
}
