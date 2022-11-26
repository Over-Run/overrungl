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

import java.lang.foreign.Addressable;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static org.overrun.glib.FunctionDescriptors.IIZPV;
import static org.overrun.glib.gl.GLLoader.check;
import static org.overrun.glib.gl.GLLoader.checkAll;

/**
 * The OpenGL 2.1 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL21C extends GL20C permits GL30C {
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

    public static void uniformMatrix2x3fv(int location, int count, boolean transpose, Addressable value) {
        var caps = GLLoader.getCapabilities();
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

    public static void uniformMatrix2x4fv(int location, int count, boolean transpose, Addressable value) {
        var caps = GLLoader.getCapabilities();
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

    public static void uniformMatrix3x2fv(int location, int count, boolean transpose, Addressable value) {
        var caps = GLLoader.getCapabilities();
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

    public static void uniformMatrix3x4fv(int location, int count, boolean transpose, Addressable value) {
        var caps = GLLoader.getCapabilities();
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

    public static void uniformMatrix4x2fv(int location, int count, boolean transpose, Addressable value) {
        var caps = GLLoader.getCapabilities();
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

    public static void uniformMatrix4x3fv(int location, int count, boolean transpose, Addressable value) {
        var caps = GLLoader.getCapabilities();
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
