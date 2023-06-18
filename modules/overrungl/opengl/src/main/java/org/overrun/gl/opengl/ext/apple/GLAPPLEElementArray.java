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

package org.overrun.gl.opengl.ext.apple;

import org.overrun.gl.opengl.GLExtCaps;
import org.overrun.gl.opengl.GLLoadFunc;
import org.overrun.gl.opengl.GLLoader;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static org.overrun.gl.FunctionDescriptors.*;

/**
 * {@code GL_APPLE_element_array}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAPPLEElementArray {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_APPLE_element_array) return;
        ext.glDrawElementArrayAPPLE = load.invoke("glDrawElementArrayAPPLE", IIIV);
        ext.glDrawRangeElementArrayAPPLE = load.invoke("glDrawRangeElementArrayAPPLE", IIIIIV);
        ext.glElementPointerAPPLE = load.invoke("glElementPointerAPPLE", IPV);
        ext.glMultiDrawElementArrayAPPLE = load.invoke("glMultiDrawElementArrayAPPLE", IPPIV);
        ext.glMultiDrawRangeElementArrayAPPLE = load.invoke("glMultiDrawRangeElementArrayAPPLE", IIIPPIV);
    }

    public static void glDrawElementArrayAPPLE(int mode, int first, int count) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glDrawElementArrayAPPLE).invokeExact(mode, first, count);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDrawRangeElementArrayAPPLE(int mode, int start, int end, int first, int count) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glDrawRangeElementArrayAPPLE).invokeExact(mode, start, end, first, count);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glElementPointerAPPLE(int type, MemorySegment pointer) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glElementPointerAPPLE).invokeExact(type, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiDrawElementArrayAPPLE(int mode, MemorySegment first, MemorySegment count, int primCount) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glMultiDrawElementArrayAPPLE).invokeExact(mode, first, count, primCount);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiDrawElementArrayAPPLE(SegmentAllocator allocator, int mode, int[] first, int[] count, int primCount) {
        glMultiDrawElementArrayAPPLE(mode, allocator.allocateArray(JAVA_INT, first), allocator.allocateArray(JAVA_INT, count), primCount);
    }

    public static void glMultiDrawRangeElementArrayAPPLE(int mode, int start, int end, MemorySegment first, MemorySegment count, int primCount) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glMultiDrawRangeElementArrayAPPLE).invokeExact(mode, start, end, first, count, primCount);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiDrawRangeElementArrayAPPLE(SegmentAllocator allocator, int mode, int start, int end, int[] first, int[] count, int primCount) {
        glMultiDrawRangeElementArrayAPPLE(mode, start, end, allocator.allocateArray(JAVA_INT, first), allocator.allocateArray(JAVA_INT, count), primCount);
    }
}
