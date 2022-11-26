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

package org.overrun.glib.gl.ext.apple;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.foreign.Addressable;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;

/**
 * {@code GL_APPLE_element_array}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAPPLEElementArray {
    @Nullable
    public static MethodHandle glDrawElementArrayAPPLE, glDrawRangeElementArrayAPPLE, glElementPointerAPPLE,
        glMultiDrawElementArrayAPPLE, glMultiDrawRangeElementArrayAPPLE;

    public static void load(GLLoadFunc load) {
        if (GLExtCaps.Flags.GL_APPLE_element_array.no()) return;
        glDrawElementArrayAPPLE = load.invoke("glDrawElementArrayAPPLE", IIIV);
        glDrawRangeElementArrayAPPLE = load.invoke("glDrawRangeElementArrayAPPLE", IIIIIV);
        glElementPointerAPPLE = load.invoke("glElementPointerAPPLE", IPV);
        glMultiDrawElementArrayAPPLE = load.invoke("glMultiDrawElementArrayAPPLE", IPPIV);
        glMultiDrawRangeElementArrayAPPLE = load.invoke("glMultiDrawRangeElementArrayAPPLE", IIIPPIV);
    }

    public static void glDrawElementArrayAPPLE(int mode, int first, int count) {
        try {
            check(glDrawElementArrayAPPLE).invokeExact(mode, first, count);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDrawRangeElementArrayAPPLE(int mode, int start, int end, int first, int count) {
        try {
            check(glDrawRangeElementArrayAPPLE).invokeExact(mode, start, end, first, count);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glElementPointerAPPLE(int type, Addressable pointer) {
        try {
            check(glElementPointerAPPLE).invokeExact(type, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiDrawElementArrayAPPLE(int mode, Addressable first, Addressable count, int primCount) {
        try {
            check(glMultiDrawElementArrayAPPLE).invokeExact(mode, first, count, primCount);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiDrawElementArrayAPPLE(SegmentAllocator allocator, int mode, int[] first, int[] count, int primCount) {
        glMultiDrawElementArrayAPPLE(mode, allocator.allocateArray(JAVA_INT, first), allocator.allocateArray(JAVA_INT, count), primCount);
    }

    public static void glMultiDrawRangeElementArrayAPPLE(int mode, int start, int end, Addressable first, Addressable count, int primCount) {
        try {
            check(glMultiDrawRangeElementArrayAPPLE).invokeExact(mode, start, end, first, count, primCount);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiDrawRangeElementArrayAPPLE(SegmentAllocator allocator, int mode, int start, int end, int[] first, int[] count, int primCount) {
        glMultiDrawRangeElementArrayAPPLE(mode, start, end, allocator.allocateArray(JAVA_INT, first), allocator.allocateArray(JAVA_INT, count), primCount);
    }
}
