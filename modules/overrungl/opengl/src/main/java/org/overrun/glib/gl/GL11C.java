package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;

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
public class GL11C extends GL10C {
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

    static void load(GLLoadFunc load) throws Throwable {
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

    public static void bindTexture(int target, int texture) throws Throwable {
        check(glBindTexture).invoke(target, texture);
    }

    public static void copyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border) throws Throwable {
        check(glCopyTexImage1D).invoke(target, level, internalFormat, x, y, width, border);
    }

    public static void copyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border) throws Throwable {
        check(glCopyTexImage2D).invoke(target, level, internalFormat, x, y, width, height, border);
    }

    public static void copyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width) throws Throwable {
        check(glCopyTexSubImage1D).invoke(target, level, xoffset, x, y, width);
    }

    public static void copyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) throws Throwable {
        check(glCopyTexSubImage2D).invoke(target, level, xoffset, yoffset, x, y, width, height);
    }

    public static void deleteTextures(int n, MemoryAddress textures) throws Throwable {
        check(glDeleteTextures).invoke(n, textures);
    }

    public static void deleteTextures(int n, int[] textures) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pTex = session.allocateArray(ValueLayout.JAVA_INT, textures);
            deleteTextures(n, pTex.address());
        }
    }

    public static void deleteTexture(int n, int texture) throws Throwable {
        try (var session = MemorySession.openShared()) {
            deleteTextures(n, session.allocate(ValueLayout.JAVA_INT, texture).address());
        }
    }

    public static void drawArrays(int mode, int first, int count) throws Throwable {
        check(glDrawArrays).invoke(mode, first, count);
    }

    public static void drawElements(int mode, int count, int type, MemoryAddress indices) throws Throwable {
        check(glDrawElements).invoke(mode, count, type, indices);
    }

    public static void genTextures(int n, MemoryAddress textures) throws Throwable {
        check(glGenTextures).invoke(n, textures);
    }

    public static void genTextures(int n, int[] textures) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pTex = session.allocateArray(ValueLayout.JAVA_INT, n);
            genTextures(n, pTex.address());
            for (int i = 0; i < n; i++) {
                textures[n] = pTex.getAtIndex(ValueLayout.JAVA_INT, i);
            }
        }
    }

    public static void genTextures(int[] textures) throws Throwable {
        genTextures(textures.length, textures);
    }

    public static int genTexture() throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pTex = session.allocate(ValueLayout.JAVA_INT);
            genTextures(1, pTex.address());
            return pTex.get(ValueLayout.JAVA_INT, 0L);
        }
    }

    public static void getPointerv(int pname, MemoryAddress params) throws Throwable {
        check(glGetPointerv).invoke(pname, params);
    }

    public static void getPointerv(int pname, MemoryAddress[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(ValueLayout.ADDRESS);
            getPointerv(pname, pParams.address());
            params[0] = pParams.get(ValueLayout.ADDRESS, 0L);
        }
    }

    public static boolean isTexture(int texture) throws Throwable {
        return (boolean) check(glIsTexture).invoke(texture);
    }

    public static void polygonOffset(float factor, float units) throws Throwable {
        check(glPolygonOffset).invoke(factor, units);
    }

    public static void texSubImage1D(int target, int level, int xoffset, int width, int format, int type, MemoryAddress pixels) throws Throwable {
        check(glTexSubImage1D).invoke(target, level, xoffset, width, format, type, pixels);
    }

    public static void texSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, MemoryAddress pixels) throws Throwable {
        check(glTexSubImage2D).invoke(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }
}
