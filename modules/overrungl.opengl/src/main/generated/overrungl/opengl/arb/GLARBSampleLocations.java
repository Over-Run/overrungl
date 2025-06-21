/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBSampleLocations {
    public static final int GL_SAMPLE_LOCATION_SUBPIXEL_BITS_ARB = 0x933D;
    public static final int GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_ARB = 0x933E;
    public static final int GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_ARB = 0x933F;
    public static final int GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_ARB = 0x9340;
    public static final int GL_SAMPLE_LOCATION_ARB = 0x8E50;
    public static final int GL_PROGRAMMABLE_SAMPLE_LOCATION_ARB = 0x9341;
    public static final int GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_ARB = 0x9342;
    public static final int GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_ARB = 0x9343;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glFramebufferSampleLocationsfvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedFramebufferSampleLocationsfvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glEvaluateDepthValuesARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public final MemorySegment PFN_glFramebufferSampleLocationsfvARB;
        public final MemorySegment PFN_glNamedFramebufferSampleLocationsfvARB;
        public final MemorySegment PFN_glEvaluateDepthValuesARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glFramebufferSampleLocationsfvARB = func.invoke("glFramebufferSampleLocationsfvARB");
            PFN_glNamedFramebufferSampleLocationsfvARB = func.invoke("glNamedFramebufferSampleLocationsfvARB");
            PFN_glEvaluateDepthValuesARB = func.invoke("glEvaluateDepthValuesARB");
        }
    }

    public GLARBSampleLocations(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glFramebufferSampleLocationsfvARB((unsigned int) GLenum target, (unsigned int) GLuint start, (int) GLsizei count, const GLfloat* v);
    /// ```
    public void FramebufferSampleLocationsfvARB(int target, int start, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferSampleLocationsfvARB)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferSampleLocationsfvARB");
        try { Handles.MH_glFramebufferSampleLocationsfvARB.invokeExact(handles.PFN_glFramebufferSampleLocationsfvARB, target, start, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferSampleLocationsfvARB", e); }
    }

    /// ```
    /// void glNamedFramebufferSampleLocationsfvARB((unsigned int) GLuint framebuffer, (unsigned int) GLuint start, (int) GLsizei count, const GLfloat* v);
    /// ```
    public void NamedFramebufferSampleLocationsfvARB(int framebuffer, int start, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferSampleLocationsfvARB)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferSampleLocationsfvARB");
        try { Handles.MH_glNamedFramebufferSampleLocationsfvARB.invokeExact(handles.PFN_glNamedFramebufferSampleLocationsfvARB, framebuffer, start, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferSampleLocationsfvARB", e); }
    }

    /// ```
    /// void glEvaluateDepthValuesARB();
    /// ```
    public void EvaluateDepthValuesARB() {
        if (MemoryUtil.isNullPointer(handles.PFN_glEvaluateDepthValuesARB)) throw new GLSymbolNotFoundError("Symbol not found: glEvaluateDepthValuesARB");
        try { Handles.MH_glEvaluateDepthValuesARB.invokeExact(handles.PFN_glEvaluateDepthValuesARB); }
        catch (Throwable e) { throw new RuntimeException("error in EvaluateDepthValuesARB", e); }
    }

}
