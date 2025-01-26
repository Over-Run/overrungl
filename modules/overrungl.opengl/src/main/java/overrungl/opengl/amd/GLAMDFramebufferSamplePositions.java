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
package overrungl.opengl.amd;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAMDFramebufferSamplePositions {
    public static final int GL_SUBSAMPLE_DISTANCE_AMD = 0x883F;
    public static final int GL_PIXELS_PER_SAMPLE_PATTERN_X_AMD = 0x91AE;
    public static final int GL_PIXELS_PER_SAMPLE_PATTERN_Y_AMD = 0x91AF;
    public static final int GL_ALL_PIXELS_AMD = 0xFFFFFFFF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glFramebufferSamplePositionsfvAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedFramebufferSamplePositionsfvAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetFramebufferParameterfvAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedFramebufferParameterfvAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glFramebufferSamplePositionsfvAMD;
        public final MemorySegment PFN_glNamedFramebufferSamplePositionsfvAMD;
        public final MemorySegment PFN_glGetFramebufferParameterfvAMD;
        public final MemorySegment PFN_glGetNamedFramebufferParameterfvAMD;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glFramebufferSamplePositionsfvAMD = func.invoke("glFramebufferSamplePositionsfvAMD");
            PFN_glNamedFramebufferSamplePositionsfvAMD = func.invoke("glNamedFramebufferSamplePositionsfvAMD");
            PFN_glGetFramebufferParameterfvAMD = func.invoke("glGetFramebufferParameterfvAMD");
            PFN_glGetNamedFramebufferParameterfvAMD = func.invoke("glGetNamedFramebufferParameterfvAMD");
        }
    }

    public GLAMDFramebufferSamplePositions(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glFramebufferSamplePositionsfvAMD(GLenum target, GLuint numsamples, GLuint pixelindex, const GLfloat* values);
    /// ```
    public void FramebufferSamplePositionsfvAMD(int target, int numsamples, int pixelindex, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferSamplePositionsfvAMD)) throw new SymbolNotFoundError("Symbol not found: glFramebufferSamplePositionsfvAMD");
        try { Handles.MH_glFramebufferSamplePositionsfvAMD.invokeExact(handles.PFN_glFramebufferSamplePositionsfvAMD, target, numsamples, pixelindex, values); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferSamplePositionsfvAMD", e); }
    }

    /// ```
    /// void glNamedFramebufferSamplePositionsfvAMD(GLuint framebuffer, GLuint numsamples, GLuint pixelindex, const GLfloat* values);
    /// ```
    public void NamedFramebufferSamplePositionsfvAMD(int framebuffer, int numsamples, int pixelindex, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferSamplePositionsfvAMD)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferSamplePositionsfvAMD");
        try { Handles.MH_glNamedFramebufferSamplePositionsfvAMD.invokeExact(handles.PFN_glNamedFramebufferSamplePositionsfvAMD, framebuffer, numsamples, pixelindex, values); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferSamplePositionsfvAMD", e); }
    }

    /// ```
    /// void glGetFramebufferParameterfvAMD(GLenum target, GLenum pname, GLuint numsamples, GLuint pixelindex, GLsizei size, GLfloat* values);
    /// ```
    public void GetFramebufferParameterfvAMD(int target, int pname, int numsamples, int pixelindex, int size, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFramebufferParameterfvAMD)) throw new SymbolNotFoundError("Symbol not found: glGetFramebufferParameterfvAMD");
        try { Handles.MH_glGetFramebufferParameterfvAMD.invokeExact(handles.PFN_glGetFramebufferParameterfvAMD, target, pname, numsamples, pixelindex, size, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetFramebufferParameterfvAMD", e); }
    }

    /// ```
    /// void glGetNamedFramebufferParameterfvAMD(GLuint framebuffer, GLenum pname, GLuint numsamples, GLuint pixelindex, GLsizei size, GLfloat* values);
    /// ```
    public void GetNamedFramebufferParameterfvAMD(int framebuffer, int pname, int numsamples, int pixelindex, int size, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedFramebufferParameterfvAMD)) throw new SymbolNotFoundError("Symbol not found: glGetNamedFramebufferParameterfvAMD");
        try { Handles.MH_glGetNamedFramebufferParameterfvAMD.invokeExact(handles.PFN_glGetNamedFramebufferParameterfvAMD, framebuffer, pname, numsamples, pixelindex, size, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedFramebufferParameterfvAMD", e); }
    }

}
