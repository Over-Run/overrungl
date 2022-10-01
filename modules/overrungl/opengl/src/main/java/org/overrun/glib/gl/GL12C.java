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
import static org.overrun.glib.gl.GLCaps.*;

/**
 * The OpenGL 1.2 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL12C extends GL11C permits GL13C {
    @Nullable
    public static MethodHandle
        glCopyTexSubImage3D, glDrawRangeElements, glTexImage3D, glTexSubImage3D;

    static boolean isSupported() {
        return checkAll(glCopyTexSubImage3D, glDrawRangeElements, glTexImage3D, glTexSubImage3D);
    }

    static void load(GLLoadFunc load) {
        glCopyTexSubImage3D = load.invoke("glCopyTexSubImage3D", IIIIIIIIIV);
        glDrawRangeElements = load.invoke("glDrawRangeElements", IIIIIPV);
        glTexImage3D = load.invoke("glTexImage3D", IIIIIIIIIV);
        glTexSubImage3D = load.invoke("glTexSubImage3D", IIIIIIIIIIV);
    }

    public static void copyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        try {
            check(glCopyTexSubImage3D).invoke(target, level, xoffset, yoffset, zoffset, x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawRangeElements(int mode, int start, int end, int count, int type, Addressable indices) {
        try {
            check(glDrawRangeElements).invoke(mode, start, end, count, type, indices);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawRangeElements(int mode, int start, int end, int count, int type, byte[] indices) {
        try (var session = MemorySession.openShared()) {
            drawRangeElements(mode, start, end, count, type, session.allocateArray(JAVA_BYTE, indices));
        }
    }

    public static void drawRangeElements(int mode, int start, int end, int count, int type, short[] indices) {
        try (var session = MemorySession.openShared()) {
            drawRangeElements(mode, start, end, count, type, session.allocateArray(JAVA_SHORT, indices));
        }
    }

    public static void drawRangeElements(int mode, int start, int end, int count, int type, int[] indices) {
        try (var session = MemorySession.openShared()) {
            drawRangeElements(mode, start, end, count, type, session.allocateArray(JAVA_INT, indices));
        }
    }

    public static void texImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, Addressable pixels) {
        try {
            check(glTexImage3D).invoke(target, level, internalFormat, width, height, depth, border, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, byte[] pixels) {
        try (var session = MemorySession.openShared()) {
            texImage3D(target, level, internalFormat, width, height, depth, border, format, type, session.allocateArray(JAVA_BYTE, pixels));
        }
    }

    public static void texImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, short[] pixels) {
        try (var session = MemorySession.openShared()) {
            texImage3D(target, level, internalFormat, width, height, depth, border, format, type, session.allocateArray(JAVA_SHORT, pixels));
        }
    }

    public static void texImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, int[] pixels) {
        try (var session = MemorySession.openShared()) {
            texImage3D(target, level, internalFormat, width, height, depth, border, format, type, session.allocateArray(JAVA_INT, pixels));
        }
    }

    public static void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, Addressable pixels) {
        try {
            check(glTexSubImage3D).invoke(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, byte[] pixels) {
        try (var session = MemorySession.openShared()) {
            texSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, session.allocateArray(JAVA_BYTE, pixels));
        }
    }

    public static void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        try (var session = MemorySession.openShared()) {
            texSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, session.allocateArray(JAVA_SHORT, pixels));
        }
    }

    public static void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        try (var session = MemorySession.openShared()) {
            texSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, session.allocateArray(JAVA_INT, pixels));
        }
    }
}
