/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext.amd;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_AMD_framebuffer_sample_positions}
 */
public final class GLAMDFramebufferSamplePositions {
    public static final int GL_SUBSAMPLE_DISTANCE_AMD = 0x883F;
    public static final int GL_PIXELS_PER_SAMPLE_PATTERN_X_AMD = 0x91AE;
    public static final int GL_PIXELS_PER_SAMPLE_PATTERN_Y_AMD = 0x91AF;
    public static final int GL_ALL_PIXELS_AMD = 0xFFFFFFFF;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_framebuffer_sample_positions) return;
        ext.glFramebufferSamplePositionsfvAMD = load.invoke("glFramebufferSamplePositionsfvAMD", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glNamedFramebufferSamplePositionsfvAMD = load.invoke("glNamedFramebufferSamplePositionsfvAMD", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetFramebufferParameterfvAMD = load.invoke("glGetFramebufferParameterfvAMD", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetNamedFramebufferParameterfvAMD = load.invoke("glGetNamedFramebufferParameterfvAMD", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glFramebufferSamplePositionsfvAMD(int target, int numsamples, int pixelindex, @NativeType("const GLfloat *") MemorySegment values) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFramebufferSamplePositionsfvAMD).invokeExact(target, numsamples, pixelindex, values);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedFramebufferSamplePositionsfvAMD(int framebuffer, int numsamples, int pixelindex, @NativeType("const GLfloat *") MemorySegment values) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedFramebufferSamplePositionsfvAMD).invokeExact(framebuffer, numsamples, pixelindex, values);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetFramebufferParameterfvAMD(int target, int pname, int numsamples, int pixelindex, int size, @NativeType("GLfloat *") MemorySegment values) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetFramebufferParameterfvAMD).invokeExact(target, pname, numsamples, pixelindex, size, values);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetNamedFramebufferParameterfvAMD(int framebuffer, int pname, int numsamples, int pixelindex, int size, @NativeType("GLfloat *") MemorySegment values) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetNamedFramebufferParameterfvAMD).invokeExact(framebuffer, pname, numsamples, pixelindex, size, values);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
