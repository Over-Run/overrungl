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

package org.overrun.gl.opengl.ext;

import org.overrun.gl.opengl.GLExtCaps;
import org.overrun.gl.opengl.GLLoadFunc;
import org.overrun.gl.opengl.GLLoader;
import org.overrun.gl.FunctionDescriptors;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;

/**
 * {@code GL_IBM_multimode_draw_arrays}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLIBMMultimodeDrawArrays {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_IBM_multimode_draw_arrays) return;
        ext.glMultiModeDrawArraysIBM = load.invoke("glMultiModeDrawArraysIBM", FunctionDescriptors.PPPIIV);
        ext.glMultiModeDrawElementsIBM = load.invoke("glMultiModeDrawElementsIBM", FunctionDescriptors.PPIPIIV);
    }

    public static void glMultiModeDrawArraysIBM(MemorySegment mode, MemorySegment first, MemorySegment count, int primCount, int modeStride) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glMultiModeDrawArraysIBM).invokeExact(mode, first, count, primCount, modeStride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiModeDrawArraysIBM(SegmentAllocator allocator, int[] mode, int[] first, int[] count, int primCount, int modeStride) {
        glMultiModeDrawArraysIBM(allocator.allocateArray(JAVA_INT, mode), allocator.allocateArray(JAVA_INT, first), allocator.allocateArray(JAVA_INT, count), primCount, modeStride);
    }

    public static void glMultiModeDrawElementsIBM(MemorySegment mode, MemorySegment count, int type, MemorySegment indices, int primCount, int modeStride) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glMultiModeDrawElementsIBM).invokeExact(mode, count, type, indices, primCount, modeStride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiModeDrawElementsIBM(SegmentAllocator allocator, int[] mode, int[] count, int type, byte[] indices, int primCount, int modeStride) {
        glMultiModeDrawElementsIBM(allocator.allocateArray(JAVA_INT, mode), allocator.allocateArray(JAVA_INT, count), type, allocator.allocateArray(JAVA_BYTE, indices), primCount, modeStride);
    }

    public static void glMultiModeDrawElementsIBM(SegmentAllocator allocator, int[] mode, int[] count, int type, short[] indices, int primCount, int modeStride) {
        glMultiModeDrawElementsIBM(allocator.allocateArray(JAVA_INT, mode), allocator.allocateArray(JAVA_INT, count), type, allocator.allocateArray(JAVA_SHORT, indices), primCount, modeStride);
    }

    public static void glMultiModeDrawElementsIBM(SegmentAllocator allocator, int[] mode, int[] count, int type, int[] indices, int primCount, int modeStride) {
        glMultiModeDrawElementsIBM(allocator.allocateArray(JAVA_INT, mode), allocator.allocateArray(JAVA_INT, count), type, allocator.allocateArray(JAVA_INT, indices), primCount, modeStride);
    }
}
