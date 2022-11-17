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
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
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
            check(glBindBuffersBase).invokeExact(target, first, count, buffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindBuffersBase(SegmentAllocator allocator, int target, int first, int count, int[] buffers) {
        bindBuffersBase(target, first, count, allocator.allocateArray(JAVA_INT, buffers));
    }

    public static void bindBuffersRange(int target, int first, int count, Addressable buffers, Addressable offsets, Addressable sizes) {
        try {
            check(glBindBuffersRange).invokeExact(target, first, count, buffers, offsets, sizes);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindBuffersRange(SegmentAllocator allocator, int target, int first, int count, int[] buffers, long[] offsets, long[] sizes) {
        bindBuffersRange(target, first, count, allocator.allocateArray(JAVA_INT, buffers), allocator.allocateArray(JAVA_LONG, offsets), allocator.allocateArray(JAVA_LONG, sizes));
    }

    public static void bindImageTextures(int first, int count, Addressable textures) {
        try {
            check(glBindImageTextures).invokeExact(first, count, textures);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindImageTextures(SegmentAllocator allocator, int first, int count, int[] textures) {
        bindImageTextures(first, count, allocator.allocateArray(JAVA_INT, textures));
    }

    public static void bindSamplers(int first, int count, Addressable samplers) {
        try {
            check(glBindSamplers).invokeExact(first, count, samplers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindSamplers(SegmentAllocator allocator, int first, int count, int[] samplers) {
        bindSamplers(first, count, allocator.allocateArray(JAVA_INT, samplers));
    }

    public static void bindTextures(int first, int count, Addressable textures) {
        try {
            check(glBindTextures).invokeExact(first, count, textures);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindTextures(SegmentAllocator allocator, int first, int count, int[] textures) {
        bindTextures(first, count, allocator.allocateArray(JAVA_INT, textures));
    }

    public static void bindVertexBuffers(int first, int count, Addressable buffers, Addressable offsets, Addressable strides) {
        try {
            check(glBindVertexBuffers).invokeExact(first, count, buffers, offsets, strides);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindVertexBuffers(SegmentAllocator allocator, int first, int count, int[] buffers, long[] offsets, long[] strides) {
        bindVertexBuffers(first, count, allocator.allocateArray(JAVA_INT, buffers), allocator.allocateArray(JAVA_LONG, offsets), allocator.allocateArray(JAVA_LONG, strides));
    }

    public static void bufferStorage(int target, long size, Addressable data, int flags) {
        try {
            check(glBufferStorage).invokeExact(target, size, data, flags);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bufferStorage(int target, long size, int flags) {
        bufferStorage(target, size, MemoryAddress.NULL, flags);
    }

    public static void bufferStorage(SegmentAllocator allocator, int target, byte[] data, int flags) {
        bufferStorage(target, Integer.toUnsignedLong(data.length), allocator.allocateArray(JAVA_BYTE, data), flags);
    }

    public static void bufferStorage(SegmentAllocator allocator, int target, short[] data, int flags) {
        bufferStorage(target, Integer.toUnsignedLong(data.length) << 1, allocator.allocateArray(JAVA_SHORT, data), flags);
    }

    public static void bufferStorage(SegmentAllocator allocator, int target, int[] data, int flags) {
        bufferStorage(target, Integer.toUnsignedLong(data.length) << 2, allocator.allocateArray(JAVA_INT, data), flags);
    }

    public static void bufferStorage(SegmentAllocator allocator, int target, long[] data, int flags) {
        bufferStorage(target, Integer.toUnsignedLong(data.length) << 3, allocator.allocateArray(JAVA_LONG, data), flags);
    }

    public static void bufferStorage(SegmentAllocator allocator, int target, float[] data, int flags) {
        bufferStorage(target, Integer.toUnsignedLong(data.length) << 2, allocator.allocateArray(JAVA_FLOAT, data), flags);
    }

    public static void bufferStorage(SegmentAllocator allocator, int target, double[] data, int flags) {
        bufferStorage(target, Integer.toUnsignedLong(data.length) << 3, allocator.allocateArray(JAVA_DOUBLE, data), flags);
    }

    public static void clearTexImage(int texture, int level, int format, int type, Addressable data) {
        try {
            check(glClearTexImage).invokeExact(texture, level, format, type, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, Addressable data) {
        try {
            check(glClearTexSubImage).invokeExact(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
