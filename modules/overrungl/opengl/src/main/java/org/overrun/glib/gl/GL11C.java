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

import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.*;

/**
 * The OpenGL 1.1 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL11C extends GL10C permits GL11, GL12C {
    static boolean isSupported(GLCapabilities caps) {
        return checkAll(caps.glBindTexture, caps.glCopyTexImage1D, caps.glCopyTexImage2D, caps.glCopyTexSubImage1D, caps.glCopyTexSubImage2D, caps.glDeleteTextures,
            caps.glDrawArrays, caps.glDrawElements, caps.glGenTextures, caps.glGetPointerv, caps.glIsTexture, caps.glPolygonOffset,
            caps.glTexSubImage1D, caps.glTexSubImage2D);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glBindTexture = load.invoke("glBindTexture", IIV);
        caps.glCopyTexImage1D = load.invoke("glCopyTexImage1D", IIIIIIIV);
        caps.glCopyTexImage2D = load.invoke("glCopyTexImage2D", IIIIIIIIV);
        caps.glCopyTexSubImage1D = load.invoke("glCopyTexSubImage1D", IIIIIIV);
        caps.glCopyTexSubImage2D = load.invoke("glCopyTexSubImage2D", IIIIIIIIV);
        caps.glDeleteTextures = load.invoke("glDeleteTextures", IPV);
        caps.glDrawArrays = load.invoke("glDrawArrays", IIIV);
        caps.glDrawElements = load.invoke("glDrawElements", IIIPV);
        caps.glGenTextures = load.invoke("glGenTextures", IPV);
        caps.glGetPointerv = load.invoke("glGetPointerv", IPV);
        caps.glIsTexture = load.invoke("glIsTexture", IZ);
        caps.glPolygonOffset = load.invoke("glPolygonOffset", FFV);
        caps.glTexSubImage1D = load.invoke("glTexSubImage1D", IIIIIIPV);
        caps.glTexSubImage2D = load.invoke("glTexSubImage2D", IIIIIIIIPV);
    }

    public static void bindTexture(int target, int texture) {
        var caps = getCapabilities();
        try {
            check(caps.glBindTexture).invokeExact(target, texture);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border) {
        var caps = getCapabilities();
        try {
            check(caps.glCopyTexImage1D).invokeExact(target, level, internalFormat, x, y, width, border);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border) {
        var caps = getCapabilities();
        try {
            check(caps.glCopyTexImage2D).invokeExact(target, level, internalFormat, x, y, width, height, border);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width) {
        var caps = getCapabilities();
        try {
            check(caps.glCopyTexSubImage1D).invokeExact(target, level, xoffset, x, y, width);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        var caps = getCapabilities();
        try {
            check(caps.glCopyTexSubImage2D).invokeExact(target, level, xoffset, yoffset, x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteTextures(int n, Addressable textures) {
        var caps = getCapabilities();
        try {
            check(caps.glDeleteTextures).invokeExact(n, textures);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteTextures(SegmentAllocator allocator, int n, int[] textures) {
        var pTex = allocator.allocateArray(JAVA_INT, textures);
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
        var caps = getCapabilities();
        try {
            check(caps.glDrawArrays).invokeExact(mode, first, count);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawElements(int mode, int count, int type, Addressable indices) {
        var caps = getCapabilities();
        try {
            check(caps.glDrawElements).invokeExact(mode, count, type, indices);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawElements(SegmentAllocator allocator, int mode, int count, int type, byte[] indices) {
        var seg = allocator.allocateArray(JAVA_BYTE, indices);
        drawElements(mode, count, type, seg);
    }

    public static void drawElements(SegmentAllocator allocator, int mode, int count, int type, short[] indices) {
        var seg = allocator.allocateArray(JAVA_SHORT, indices);
        drawElements(mode, count, type, seg);
    }

    public static void drawElements(SegmentAllocator allocator, int mode, int count, int type, int[] indices) {
        var seg = allocator.allocateArray(JAVA_INT, indices);
        drawElements(mode, count, type, seg);
    }

    public static void genTextures(int n, Addressable textures) {
        var caps = getCapabilities();
        try {
            check(caps.glGenTextures).invokeExact(n, textures);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genTextures(SegmentAllocator allocator, int[] textures) {
        final int n = textures.length;
        var pTex = allocator.allocateArray(JAVA_INT, n);
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
        var caps = getCapabilities();
        try {
            check(caps.glGetPointerv).invokeExact(pname, params);
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
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glIsTexture).invokeExact(texture);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void polygonOffset(float factor, float units) {
        var caps = getCapabilities();
        try {
            check(caps.glPolygonOffset).invokeExact(factor, units);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texSubImage1D(int target, int level, int xoffset, int width, int format, int type, Addressable pixels) {
        var caps = getCapabilities();
        try {
            check(caps.glTexSubImage1D).invokeExact(target, level, xoffset, width, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texSubImage1D(SegmentAllocator allocator, int target, int level, int xoffset, int width, int format, int type, byte[] pixels) {
        texSubImage1D(target, level, xoffset, width, format, type, allocator.allocateArray(JAVA_BYTE, pixels));
    }

    public static void texSubImage1D(SegmentAllocator allocator, int target, int level, int xoffset, int width, int format, int type, short[] pixels) {
        texSubImage1D(target, level, xoffset, width, format, type, allocator.allocateArray(JAVA_SHORT, pixels));
    }

    public static void texSubImage1D(SegmentAllocator allocator, int target, int level, int xoffset, int width, int format, int type, int[] pixels) {
        texSubImage1D(target, level, xoffset, width, format, type, allocator.allocateArray(JAVA_INT, pixels));
    }

    public static void texSubImage1D(SegmentAllocator allocator, int target, int level, int xoffset, int width, int format, int type, float[] pixels) {
        texSubImage1D(target, level, xoffset, width, format, type, allocator.allocateArray(JAVA_FLOAT, pixels));
    }

    public static void texSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, Addressable pixels) {
        var caps = getCapabilities();
        try {
            check(caps.glTexSubImage2D).invokeExact(target, level, xoffset, yoffset, width, height, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texSubImage2D(SegmentAllocator allocator, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, byte[] pixels) {
        texSubImage2D(target, level, xoffset, yoffset, width, height, format, type, allocator.allocateArray(JAVA_BYTE, pixels));
    }

    public static void texSubImage2D(SegmentAllocator allocator, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        texSubImage2D(target, level, xoffset, yoffset, width, height, format, type, allocator.allocateArray(JAVA_SHORT, pixels));
    }

    public static void texSubImage2D(SegmentAllocator allocator, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        texSubImage2D(target, level, xoffset, yoffset, width, height, format, type, allocator.allocateArray(JAVA_INT, pixels));
    }

    public static void texSubImage2D(SegmentAllocator allocator, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
        texSubImage2D(target, level, xoffset, yoffset, width, height, format, type, allocator.allocateArray(JAVA_FLOAT, pixels));
    }
}
