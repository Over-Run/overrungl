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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_AMD_framebuffer_sample_positions}
 */
public interface GLAMDFramebufferSamplePositions {
    int GL_SUBSAMPLE_DISTANCE_AMD = 0x883F;
    int GL_PIXELS_PER_SAMPLE_PATTERN_X_AMD = 0x91AE;
    int GL_PIXELS_PER_SAMPLE_PATTERN_Y_AMD = 0x91AF;
    int GL_ALL_PIXELS_AMD = 0xFFFFFFFF;

    default void glFramebufferSamplePositionsfvAMD(int target, int numsamples, int pixelindex, @NativeType("const GLfloat *") MemorySegment values) {
        throw new ContextException();
    }

    default void glNamedFramebufferSamplePositionsfvAMD(int framebuffer, int numsamples, int pixelindex, @NativeType("const GLfloat *") MemorySegment values) {
        throw new ContextException();
    }

    default void glGetFramebufferParameterfvAMD(int target, int pname, int numsamples, int pixelindex, int size, @NativeType("GLfloat *") MemorySegment values) {
        throw new ContextException();
    }

    default void glGetNamedFramebufferParameterfvAMD(int framebuffer, int pname, int numsamples, int pixelindex, int size, @NativeType("GLfloat *") MemorySegment values) {
        throw new ContextException();
    }

}
