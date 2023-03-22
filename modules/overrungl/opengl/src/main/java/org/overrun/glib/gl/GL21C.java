/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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
 */

package org.overrun.glib.gl;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static org.overrun.glib.FunctionDescriptors.IIZPV;
import static org.overrun.glib.gl.GLLoader.*;

/**
 * The OpenGL 2.1 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL21C extends GL20C permits GL30C {
    public static final int PIXEL_PACK_BUFFER = 0x88EB;
    public static final int PIXEL_UNPACK_BUFFER = 0x88EC;
    public static final int PIXEL_PACK_BUFFER_BINDING = 0x88ED;
    public static final int PIXEL_UNPACK_BUFFER_BINDING = 0x88EF;
    public static final int FLOAT_MAT2x3 = 0x8B65;
    public static final int FLOAT_MAT2x4 = 0x8B66;
    public static final int FLOAT_MAT3x2 = 0x8B67;
    public static final int FLOAT_MAT3x4 = 0x8B68;
    public static final int FLOAT_MAT4x2 = 0x8B69;
    public static final int FLOAT_MAT4x3 = 0x8B6A;
    public static final int SRGB = 0x8C40;
    public static final int SRGB8 = 0x8C41;
    public static final int SRGB_ALPHA = 0x8C42;
    public static final int SRGB8_ALPHA8 = 0x8C43;
    public static final int COMPRESSED_SRGB = 0x8C48;
    public static final int COMPRESSED_SRGB_ALPHA = 0x8C49;

    static boolean isSupported(GLCapabilities caps) {
        return checkAll(caps.glUniformMatrix2x3fv, caps.glUniformMatrix2x4fv, caps.glUniformMatrix3x2fv, caps.glUniformMatrix3x4fv, caps.glUniformMatrix4x2fv, caps.glUniformMatrix4x3fv);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glUniformMatrix2x3fv = load.invoke("glUniformMatrix2x3fv", IIZPV);
        caps.glUniformMatrix2x4fv = load.invoke("glUniformMatrix2x4fv", IIZPV);
        caps.glUniformMatrix3x2fv = load.invoke("glUniformMatrix3x2fv", IIZPV);
        caps.glUniformMatrix3x4fv = load.invoke("glUniformMatrix3x4fv", IIZPV);
        caps.glUniformMatrix4x2fv = load.invoke("glUniformMatrix4x2fv", IIZPV);
        caps.glUniformMatrix4x3fv = load.invoke("glUniformMatrix4x3fv", IIZPV);
    }

    public static void uniformMatrix2x3fv(int location, int count, boolean transpose, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniformMatrix2x3fv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix2x3fv(SegmentAllocator allocator, int location, int count, boolean transpose, float[] value) {
        uniformMatrix2x3fv(location, count, transpose, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void uniformMatrix2x3fv(SegmentAllocator allocator, int location, boolean transpose, float[] value) {
        uniformMatrix2x3fv(allocator, location, value.length / 6, transpose, value);
    }

    public static void uniformMatrix2x4fv(int location, int count, boolean transpose, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniformMatrix2x4fv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix2x4fv(SegmentAllocator allocator, int location, int count, boolean transpose, float[] value) {
        uniformMatrix2x4fv(location, count, transpose, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void uniformMatrix2x4fv(SegmentAllocator allocator, int location, boolean transpose, float[] value) {
        uniformMatrix2x4fv(allocator, location, value.length >> 3, transpose, value);
    }

    public static void uniformMatrix3x2fv(int location, int count, boolean transpose, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniformMatrix3x2fv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix3x2fv(SegmentAllocator allocator, int location, int count, boolean transpose, float[] value) {
        uniformMatrix3x2fv(location, count, transpose, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void uniformMatrix3x2fv(SegmentAllocator allocator, int location, boolean transpose, float[] value) {
        uniformMatrix3x2fv(allocator, location, value.length / 6, transpose, value);
    }

    public static void uniformMatrix3x4fv(int location, int count, boolean transpose, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniformMatrix3x4fv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix3x4fv(SegmentAllocator allocator, int location, int count, boolean transpose, float[] value) {
        uniformMatrix3x4fv(location, count, transpose, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void uniformMatrix3x4fv(SegmentAllocator allocator, int location, boolean transpose, float[] value) {
        uniformMatrix3x4fv(allocator, location, value.length / 12, transpose, value);
    }

    public static void uniformMatrix4x2fv(int location, int count, boolean transpose, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniformMatrix4x2fv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix4x2fv(SegmentAllocator allocator, int location, int count, boolean transpose, float[] value) {
        uniformMatrix4x2fv(location, count, transpose, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void uniformMatrix4x2fv(SegmentAllocator allocator, int location, boolean transpose, float[] value) {
        uniformMatrix4x2fv(allocator, location, value.length >> 3, transpose, value);
    }

    public static void uniformMatrix4x3fv(int location, int count, boolean transpose, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniformMatrix4x3fv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix4x3fv(SegmentAllocator allocator, int location, int count, boolean transpose, float[] value) {
        uniformMatrix4x3fv(location, count, transpose, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void uniformMatrix4x3fv(SegmentAllocator allocator, int location, boolean transpose, float[] value) {
        uniformMatrix4x3fv(allocator, location, value.length / 12, transpose, value);
    }
}
