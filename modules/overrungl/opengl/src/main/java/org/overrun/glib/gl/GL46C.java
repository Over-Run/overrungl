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

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.*;

/**
 * The OpenGL 4.6 core profile functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL46C extends GL45C permits GL {
    static boolean isSupported(GLCapabilities caps) {
        return checkAll(caps.glMultiDrawArraysIndirectCount, caps.glMultiDrawElementsIndirectCount, caps.glPolygonOffsetClamp, caps.glSpecializeShader);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glMultiDrawArraysIndirectCount = load.invoke("glMultiDrawArraysIndirectCount", IPJIIV);
        caps.glMultiDrawElementsIndirectCount = load.invoke("glMultiDrawElementsIndirectCount", IIPJIIV);
        caps.glPolygonOffsetClamp = load.invoke("glPolygonOffsetClamp", FFFV);
        caps.glSpecializeShader = load.invoke("glSpecializeShader", IPIPPV);
    }

    public static void multiDrawArraysIndirectCount(int mode, MemorySegment indirect, long drawCount, int maxDrawCount, int stride) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiDrawArraysIndirectCount).invokeExact(mode, indirect, drawCount, maxDrawCount, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawElementsIndirectCount(int mode, int type, MemorySegment indirect, long drawCount, int maxDrawCount, int stride) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiDrawElementsIndirectCount).invokeExact(mode, type, indirect, drawCount, maxDrawCount, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void polygonOffsetClamp(float factor, float units, float clamp) {
        var caps = getCapabilities();
        try {
            check(caps.glPolygonOffsetClamp).invokeExact(factor, units, clamp);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void specializeShader(int shader, MemorySegment pEntryPoint, int numSpecializationConstants, MemorySegment pConstantIndex, MemorySegment pConstantValue) {
        var caps = getCapabilities();
        try {
            check(caps.glSpecializeShader).invokeExact(shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void specializeShader(SegmentAllocator allocator, int shader, @Nullable String pEntryPoint, int @Nullable [] pConstantIndex, int @Nullable [] pConstantValue) {
        specializeShader(shader,
            pEntryPoint != null ? allocator.allocateUtf8String(pEntryPoint) : MemorySegment.NULL,
            pConstantIndex != null ? pConstantIndex.length : (pConstantValue != null ? pConstantValue.length : 0),
            pConstantIndex != null ? allocator.allocateArray(ValueLayout.JAVA_INT, pConstantIndex) : MemorySegment.NULL,
            pConstantValue != null ? allocator.allocateArray(ValueLayout.JAVA_INT, pConstantValue) : MemorySegment.NULL);
    }

    public static void specializeShader(SegmentAllocator allocator, int shader, @Nullable String pEntryPoint) {
        specializeShader(shader,
            pEntryPoint != null ? allocator.allocateUtf8String(pEntryPoint) : MemorySegment.NULL,
            0,
            MemorySegment.NULL,
            MemorySegment.NULL);
    }
}
