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
import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLCaps.check;
import static org.overrun.glib.gl.GLCaps.checkAll;

/**
 * The OpenGL 1.1 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL11C extends GL10C permits GL11, GL12C {
    @Nullable
    public static MethodHandle
        glBindTexture, glCopyTexImage1D, glCopyTexImage2D, glCopyTexSubImage1D, glCopyTexSubImage2D, glDeleteTextures,
        glDrawArrays, glDrawElements, glGenTextures, glGetPointerv, glIsTexture, glPolygonOffset, glTexSubImage1D,
        glTexSubImage2D;

    static boolean isSupported() {
        return checkAll(glBindTexture, glCopyTexImage1D, glCopyTexImage2D, glCopyTexSubImage1D, glCopyTexSubImage2D,
            glDeleteTextures, glDrawArrays, glDrawElements, glGenTextures, glGetPointerv, glIsTexture, glPolygonOffset,
            glTexSubImage1D, glTexSubImage2D);
    }

    static void load(GLLoadFunc load) {
        glBindTexture = load.invoke("glBindTexture", IIV);
        glCopyTexImage1D = load.invoke("glCopyTexImage1D", IIIIIIIV);
        glCopyTexImage2D = load.invoke("glCopyTexImage2D", IIIIIIIIV);
        glCopyTexSubImage1D = load.invoke("glCopyTexSubImage1D", IIIIIIV);
        glCopyTexSubImage2D = load.invoke("glCopyTexSubImage2D", IIIIIIIIV);
        glDeleteTextures = load.invoke("glDeleteTextures", IPV);
        glDrawArrays = load.invoke("glDrawArrays", IIIV);
        glDrawElements = load.invoke("glDrawElements", IIIPV);
        glGenTextures = load.invoke("glGenTextures", IPV);
        glGetPointerv = load.invoke("glGetPointerv", IPV);
        glIsTexture = load.invoke("glIsTexture", IZ);
        glPolygonOffset = load.invoke("glPolygonOffset", FFV);
        glTexSubImage1D = load.invoke("glTexSubImage1D", IIIIIIPV);
        glTexSubImage2D = load.invoke("glTexSubImage2D", IIIIIIIIPV);
    }

    public static void bindTexture(int target, int texture) {
        try {
            check(glBindTexture).invokeExact(target, texture);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border) {
        try {
            check(glCopyTexImage1D).invokeExact(target, level, internalFormat, x, y, width, border);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border) {
        try {
            check(glCopyTexImage2D).invokeExact(target, level, internalFormat, x, y, width, height, border);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width) {
        try {
            check(glCopyTexSubImage1D).invokeExact(target, level, xoffset, x, y, width);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        try {
            check(glCopyTexSubImage2D).invokeExact(target, level, xoffset, yoffset, x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteTextures(int n, Addressable textures) {
        try {
            check(glDeleteTextures).invokeExact(n, textures);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteTextures(SegmentAllocator session, int n, int[] textures) {
        var pTex = session.allocateArray(JAVA_INT, textures);
        deleteTextures(n, pTex);
    }

    public static void deleteTexture(int texture) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var mem = stack.malloc(JAVA_INT);
            mem.set(JAVA_INT, 0, texture);
            deleteTextures(1, mem);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void drawArrays(int mode, int first, int count) {
        try {
            check(glDrawArrays).invokeExact(mode, first, count);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawElements(int mode, int count, int type, Addressable indices) {
        try {
            check(glDrawElements).invokeExact(mode, count, type, indices);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawElements(SegmentAllocator session, int mode, int count, int type, byte[] indices) {
        var seg = session.allocateArray(JAVA_BYTE, indices);
        drawElements(mode, count, type, seg);
    }

    public static void drawElements(SegmentAllocator session, int mode, int count, int type, short[] indices) {
        var seg = session.allocateArray(JAVA_SHORT, indices);
        drawElements(mode, count, type, seg);
    }

    public static void drawElements(SegmentAllocator session, int mode, int count, int type, int[] indices) {
        var seg = session.allocateArray(JAVA_INT, indices);
        drawElements(mode, count, type, seg);
    }

    public static void genTextures(int n, Addressable textures) {
        try {
            check(glGenTextures).invokeExact(n, textures);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genTextures(SegmentAllocator session, int[] textures) {
        final int n = textures.length;
        var pTex = session.allocateArray(JAVA_INT, n);
        genTextures(n, pTex);
        RuntimeHelper.toArray(pTex, textures);
    }

    public static int genTexture() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pTex = stack.calloc(JAVA_INT);
            genTextures(1, pTex);
            return pTex.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getPointerv(int pname, Addressable params) {
        try {
            check(glGetPointerv).invokeExact(pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress getPointer(int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.calloc(ADDRESS);
            getPointerv(pname, pParams);
            return pParams.get(ADDRESS, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean isTexture(int texture) {
        try {
            return (boolean) check(glIsTexture).invokeExact(texture);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void polygonOffset(float factor, float units) {
        try {
            check(glPolygonOffset).invokeExact(factor, units);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texSubImage1D(int target, int level, int xoffset, int width, int format, int type, Addressable pixels) {
        try {
            check(glTexSubImage1D).invokeExact(target, level, xoffset, width, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texSubImage1D(SegmentAllocator session, int target, int level, int xoffset, int width, int format, int type, byte[] pixels) {
        texSubImage1D(target, level, xoffset, width, format, type, session.allocateArray(JAVA_BYTE, pixels));
    }

    public static void texSubImage1D(SegmentAllocator session, int target, int level, int xoffset, int width, int format, int type, short[] pixels) {
        texSubImage1D(target, level, xoffset, width, format, type, session.allocateArray(JAVA_SHORT, pixels));
    }

    public static void texSubImage1D(SegmentAllocator session, int target, int level, int xoffset, int width, int format, int type, int[] pixels) {
        texSubImage1D(target, level, xoffset, width, format, type, session.allocateArray(JAVA_INT, pixels));
    }

    public static void texSubImage1D(SegmentAllocator session, int target, int level, int xoffset, int width, int format, int type, float[] pixels) {
        texSubImage1D(target, level, xoffset, width, format, type, session.allocateArray(JAVA_FLOAT, pixels));
    }

    public static void texSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, Addressable pixels) {
        try {
            check(glTexSubImage2D).invokeExact(target, level, xoffset, yoffset, width, height, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texSubImage2D(SegmentAllocator session, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, byte[] pixels) {
        texSubImage2D(target, level, xoffset, yoffset, width, height, format, type, session.allocateArray(JAVA_BYTE, pixels));
    }

    public static void texSubImage2D(SegmentAllocator session, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        texSubImage2D(target, level, xoffset, yoffset, width, height, format, type, session.allocateArray(JAVA_SHORT, pixels));
    }

    public static void texSubImage2D(SegmentAllocator session, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        texSubImage2D(target, level, xoffset, yoffset, width, height, format, type, session.allocateArray(JAVA_INT, pixels));
    }

    public static void texSubImage2D(SegmentAllocator session, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
        texSubImage2D(target, level, xoffset, yoffset, width, height, format, type, session.allocateArray(JAVA_FLOAT, pixels));
    }
}
