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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLNVTransformFeedback2 {
    public static final int GL_TRANSFORM_FEEDBACK_NV = 0x8E22;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED_NV = 0x8E23;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE_NV = 0x8E24;
    public static final int GL_TRANSFORM_FEEDBACK_BINDING_NV = 0x8E25;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBindTransformFeedbackNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteTransformFeedbacksNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenTransformFeedbacksNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsTransformFeedbackNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPauseTransformFeedbackNV = downcallHandle(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glResumeTransformFeedbackNV = downcallHandle(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glDrawTransformFeedbackNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBindTransformFeedbackNV;
        public final MemorySegment PFN_glDeleteTransformFeedbacksNV;
        public final MemorySegment PFN_glGenTransformFeedbacksNV;
        public final MemorySegment PFN_glIsTransformFeedbackNV;
        public final MemorySegment PFN_glPauseTransformFeedbackNV;
        public final MemorySegment PFN_glResumeTransformFeedbackNV;
        public final MemorySegment PFN_glDrawTransformFeedbackNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBindTransformFeedbackNV = func.invoke("glBindTransformFeedbackNV");
            PFN_glDeleteTransformFeedbacksNV = func.invoke("glDeleteTransformFeedbacksNV", "glDeleteTransformFeedbacks");
            PFN_glGenTransformFeedbacksNV = func.invoke("glGenTransformFeedbacksNV", "glGenTransformFeedbacks");
            PFN_glIsTransformFeedbackNV = func.invoke("glIsTransformFeedbackNV", "glIsTransformFeedback");
            PFN_glPauseTransformFeedbackNV = func.invoke("glPauseTransformFeedbackNV", "glPauseTransformFeedback");
            PFN_glResumeTransformFeedbackNV = func.invoke("glResumeTransformFeedbackNV", "glResumeTransformFeedback");
            PFN_glDrawTransformFeedbackNV = func.invoke("glDrawTransformFeedbackNV", "glDrawTransformFeedback");
        }
    }

    public GLNVTransformFeedback2(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBindTransformFeedbackNV((unsigned int) GLenum target, (unsigned int) GLuint id);
    /// ```
    public void BindTransformFeedbackNV(int target, int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindTransformFeedbackNV)) throw new GLSymbolNotFoundError("Symbol not found: glBindTransformFeedbackNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindTransformFeedbackNV", target, id); }
        Handles.MH_glBindTransformFeedbackNV.invokeExact(handles.PFN_glBindTransformFeedbackNV, target, id); }
        catch (Throwable e) { throw new RuntimeException("error in BindTransformFeedbackNV", e); }
    }

    /// ```
    /// void glDeleteTransformFeedbacksNV((int) GLsizei n, const GLuint* ids);
    /// ```
    public void DeleteTransformFeedbacksNV(int n, MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteTransformFeedbacksNV)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteTransformFeedbacksNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteTransformFeedbacksNV", n, ids); }
        Handles.MH_glDeleteTransformFeedbacksNV.invokeExact(handles.PFN_glDeleteTransformFeedbacksNV, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteTransformFeedbacksNV", e); }
    }

    /// ```
    /// void glGenTransformFeedbacksNV((int) GLsizei n, GLuint* ids);
    /// ```
    public void GenTransformFeedbacksNV(int n, MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenTransformFeedbacksNV)) throw new GLSymbolNotFoundError("Symbol not found: glGenTransformFeedbacksNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenTransformFeedbacksNV", n, ids); }
        Handles.MH_glGenTransformFeedbacksNV.invokeExact(handles.PFN_glGenTransformFeedbacksNV, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in GenTransformFeedbacksNV", e); }
    }

    /// ```
    /// GLboolean glIsTransformFeedbackNV((unsigned int) GLuint id);
    /// ```
    public boolean IsTransformFeedbackNV(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsTransformFeedbackNV)) throw new GLSymbolNotFoundError("Symbol not found: glIsTransformFeedbackNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsTransformFeedbackNV", id); }
        return (((byte) Handles.MH_glIsTransformFeedbackNV.invokeExact(handles.PFN_glIsTransformFeedbackNV, id)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsTransformFeedbackNV", e); }
    }

    /// ```
    /// void glPauseTransformFeedbackNV();
    /// ```
    public void PauseTransformFeedbackNV() {
        if (MemoryUtil.isNullPointer(handles.PFN_glPauseTransformFeedbackNV)) throw new GLSymbolNotFoundError("Symbol not found: glPauseTransformFeedbackNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPauseTransformFeedbackNV"); }
        Handles.MH_glPauseTransformFeedbackNV.invokeExact(handles.PFN_glPauseTransformFeedbackNV); }
        catch (Throwable e) { throw new RuntimeException("error in PauseTransformFeedbackNV", e); }
    }

    /// ```
    /// void glResumeTransformFeedbackNV();
    /// ```
    public void ResumeTransformFeedbackNV() {
        if (MemoryUtil.isNullPointer(handles.PFN_glResumeTransformFeedbackNV)) throw new GLSymbolNotFoundError("Symbol not found: glResumeTransformFeedbackNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glResumeTransformFeedbackNV"); }
        Handles.MH_glResumeTransformFeedbackNV.invokeExact(handles.PFN_glResumeTransformFeedbackNV); }
        catch (Throwable e) { throw new RuntimeException("error in ResumeTransformFeedbackNV", e); }
    }

    /// ```
    /// void glDrawTransformFeedbackNV((unsigned int) GLenum mode, (unsigned int) GLuint id);
    /// ```
    public void DrawTransformFeedbackNV(int mode, int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawTransformFeedbackNV)) throw new GLSymbolNotFoundError("Symbol not found: glDrawTransformFeedbackNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawTransformFeedbackNV", mode, id); }
        Handles.MH_glDrawTransformFeedbackNV.invokeExact(handles.PFN_glDrawTransformFeedbackNV, mode, id); }
        catch (Throwable e) { throw new RuntimeException("error in DrawTransformFeedbackNV", e); }
    }

}
