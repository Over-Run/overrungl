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

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLCaps.check;
import static org.overrun.glib.gl.GLCaps.checkAll;

/**
 * The OpenGL 4.4 core profile functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL44C extends GL43C permits GL45C {
    @Nullable
    public static MethodHandle
        glBindBuffersBase, glBindBuffersRange, glBindImageTextures, glBindSamplers, glBindTextures, glBindVertexBuffers,
        glBufferStorage, glClearTexImage, glClearTexSubImage;

    static boolean isSupported() {
        return checkAll(glBindBuffersBase, glBindBuffersRange, glBindImageTextures, glBindSamplers, glBindTextures,
            glBindVertexBuffers, glBufferStorage, glClearTexImage, glClearTexSubImage);
    }

    static void load(GLLoadFunc load) {
        glBindBuffersBase = load.invoke("glBindBuffersBase", IIIPV);
        glBindBuffersRange = load.invoke("glBindBuffersRange", IIIPPPV);
        glBindImageTextures = load.invoke("glBindImageTextures", IIPV);
        glBindSamplers = load.invoke("glBindSamplers", IIPV);
        glBindTextures = load.invoke("glBindTextures", IIPV);
        glBindVertexBuffers = load.invoke("glBindVertexBuffers", IIPPPV);
        glBufferStorage = load.invoke("glBufferStorage", IJPIV);
        glClearTexImage = load.invoke("glClearTexImage", IIIIPV);
        glClearTexSubImage = load.invoke("glClearTexSubImage", IIIIIIIIIIPV);
    }

    public static void bindBuffersBase(int target, int first, int count, Addressable buffers) {
        try {
            check(glBindBuffersBase).invoke(target, first, count, buffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void bindBuffersBase(int target, int first, int count, int[] buffers) {
        try (var session = MemorySession.openShared()) {
            bindBuffersBase(target, first, count, session.allocateArray(JAVA_INT, buffers));
        }
    }

    public static void bindBuffersRange(int target, int first, int count, Addressable buffers, Addressable offsets, Addressable sizes) {
        try {
            check(glBindBuffersRange).invoke(target, first, count, buffers, offsets, sizes);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void bindBuffersRange(int target, int first, int count, int[] buffers, long[] offsets, long[] sizes) {
        try (var session = MemorySession.openShared()) {
            bindBuffersRange(target, first, count, session.allocateArray(JAVA_INT, buffers), session.allocateArray(JAVA_LONG, offsets), session.allocateArray(JAVA_LONG, sizes));
        }
    }

    public static void bindImageTextures(int first, int count, Addressable textures) {
        try {
            check(glBindImageTextures).invoke(first, count, textures);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void bindImageTextures(int first, int count, int[] textures) {
        try (var session = MemorySession.openShared()) {
            bindImageTextures(first, count, session.allocateArray(JAVA_INT, textures));
        }
    }

    public static void bindSamplers(int first, int count, Addressable samplers) {
        try {
            check(glBindSamplers).invoke(first, count, samplers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void bindSamplers(int first, int count, int[] samplers) {
        try (var session = MemorySession.openShared()) {
            bindSamplers(first, count, session.allocateArray(JAVA_INT, samplers));
        }
    }

    public static void bindTextures(int first, int count, Addressable textures) {
        try {
            check(glBindTextures).invoke(first, count, textures);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void bindTextures(int first, int count, int[] textures) {
        try (var session = MemorySession.openShared()) {
            bindTextures(first, count, session.allocateArray(JAVA_INT, textures));
        }
    }

    public static void bindVertexBuffers(int first, int count, Addressable buffers, Addressable offsets, Addressable strides) {
        try {
            check(glBindVertexBuffers).invoke(first, count, buffers, offsets, strides);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void bindVertexBuffers(int first, int count, int[] buffers, long[] offsets, long[] strides) {
        try (var session = MemorySession.openShared()) {
            bindVertexBuffers(first, count, session.allocateArray(JAVA_INT, buffers), session.allocateArray(JAVA_LONG, offsets), session.allocateArray(JAVA_LONG, strides));
        }
    }

    public static void bufferStorage(int target, long size, Addressable data, int flags) {
        try {
            check(glBufferStorage).invoke(target, size, data, flags);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void clearTexImage(int texture, int level, int format, int type, Addressable data) {
        try {
            check(glClearTexImage).invoke(texture, level, format, type, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void clearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, Addressable data) {
        try {
            check(glClearTexSubImage).invoke(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }
}
