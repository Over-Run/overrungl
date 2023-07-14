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

package overrungl.opengl.ext.amd;

import overrungl.opengl.GLExtCaps;
import overrungl.opengl.GLLoadFunc;
import overrungl.opengl.GLLoader;
import overrungl.RuntimeHelper;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static overrungl.FunctionDescriptors.IIIIIPV;
import static overrungl.FunctionDescriptors.IIIPV;

/**
 * {@code GL_AMD_framebuffer_sample_positions}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAMDFramebufferSamplePositions {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_framebuffer_sample_positions) return;
        ext.glFramebufferSamplePositionsfvAMD = load.invoke("glFramebufferSamplePositionsfvAMD", IIIPV);
        ext.glGetFramebufferParameterfvAMD = load.invoke("glGetFramebufferParameterfvAMD", IIIIIPV);
        ext.glGetNamedFramebufferParameterfvAMD = load.invoke("glGetNamedFramebufferParameterfvAMD", IIIIIPV);
        ext.glNamedFramebufferSamplePositionsfvAMD = load.invoke("glNamedFramebufferSamplePositionsfvAMD", IIIPV);
    }

    public static void glFramebufferSamplePositionsfvAMD(int target, int numSamples, int pixelIndex, MemorySegment values) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glFramebufferSamplePositionsfvAMD).invokeExact(target, numSamples, pixelIndex, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glFramebufferSamplePositionsfvAMD(SegmentAllocator allocator, int target, int numSamples, int pixelIndex, float[] values) {
        glFramebufferSamplePositionsfvAMD(target, numSamples, pixelIndex, allocator.allocateArray(JAVA_FLOAT, values));
    }

    public static void glGetFramebufferParameterfvAMD(int target, int pname, int numSamples, int pixelIndex, int size, MemorySegment values) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetFramebufferParameterfvAMD).invokeExact(target, pname, numSamples, pixelIndex, size, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetFramebufferParameterfvAMD(SegmentAllocator allocator, int target, int pname, int numSamples, int pixelIndex, int size, float[] values) {
        var seg = allocator.allocateArray(JAVA_FLOAT, values.length);
        glGetFramebufferParameterfvAMD(target, pname, numSamples, pixelIndex, size, seg);
        RuntimeHelper.toArray(seg, values);
    }

    public static void glGetNamedFramebufferParameterfvAMD(int framebuffer, int pname, int numSamples, int pixelIndex, int size, MemorySegment values) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetNamedFramebufferParameterfvAMD).invokeExact(framebuffer, pname, numSamples, pixelIndex, size, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetNamedFramebufferParameterfvAMD(SegmentAllocator allocator, int framebuffer, int pname, int numSamples, int pixelIndex, int size, float[] values) {
        var seg = allocator.allocateArray(JAVA_FLOAT, values.length);
        glGetNamedFramebufferParameterfvAMD(framebuffer, pname, numSamples, pixelIndex, size, seg);
        RuntimeHelper.toArray(seg, values);
    }

    public static void glNamedFramebufferSamplePositionsfvAMD(int target, int numSamples, int pixelIndex, MemorySegment values) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glNamedFramebufferSamplePositionsfvAMD).invokeExact(target, numSamples, pixelIndex, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glNamedFramebufferSamplePositionsfvAMD(SegmentAllocator allocator, int target, int numSamples, int pixelIndex, float[] values) {
        glNamedFramebufferSamplePositionsfvAMD(target, numSamples, pixelIndex, allocator.allocateArray(JAVA_FLOAT, values));
    }
}
