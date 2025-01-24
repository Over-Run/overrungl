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

public final class GLARBTransformFeedback2 {
    public static final int GL_TRANSFORM_FEEDBACK = 0x8E22;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 0x8E23;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 0x8E24;
    public static final int GL_TRANSFORM_FEEDBACK_BINDING = 0x8E25;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBindTransformFeedback = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteTransformFeedbacks = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenTransformFeedbacks = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsTransformFeedback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPauseTransformFeedback = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glResumeTransformFeedback = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glDrawTransformFeedback = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBindTransformFeedback;
        public final MemorySegment PFN_glDeleteTransformFeedbacks;
        public final MemorySegment PFN_glGenTransformFeedbacks;
        public final MemorySegment PFN_glIsTransformFeedback;
        public final MemorySegment PFN_glPauseTransformFeedback;
        public final MemorySegment PFN_glResumeTransformFeedback;
        public final MemorySegment PFN_glDrawTransformFeedback;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBindTransformFeedback = func.invoke("glBindTransformFeedback");
            PFN_glDeleteTransformFeedbacks = func.invoke("glDeleteTransformFeedbacks");
            PFN_glGenTransformFeedbacks = func.invoke("glGenTransformFeedbacks");
            PFN_glIsTransformFeedback = func.invoke("glIsTransformFeedback");
            PFN_glPauseTransformFeedback = func.invoke("glPauseTransformFeedback");
            PFN_glResumeTransformFeedback = func.invoke("glResumeTransformFeedback");
            PFN_glDrawTransformFeedback = func.invoke("glDrawTransformFeedback");
        }
    }

    public GLARBTransformFeedback2(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBindTransformFeedback(unsigned int target, unsigned int id);
    /// ```
    public void BindTransformFeedback(int target, int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindTransformFeedback)) throw new SymbolNotFoundError("Symbol not found: glBindTransformFeedback");
        try { Handles.MH_glBindTransformFeedback.invokeExact(handles.PFN_glBindTransformFeedback, target, id); }
        catch (Throwable e) { throw new RuntimeException("error in BindTransformFeedback", e); }
    }

    /// ```
    /// void glDeleteTransformFeedbacks(int n, const GLuint* ids);
    /// ```
    public void DeleteTransformFeedbacks(int n, MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteTransformFeedbacks)) throw new SymbolNotFoundError("Symbol not found: glDeleteTransformFeedbacks");
        try { Handles.MH_glDeleteTransformFeedbacks.invokeExact(handles.PFN_glDeleteTransformFeedbacks, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteTransformFeedbacks", e); }
    }

    /// ```
    /// void glGenTransformFeedbacks(int n, GLuint* ids);
    /// ```
    public void GenTransformFeedbacks(int n, MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenTransformFeedbacks)) throw new SymbolNotFoundError("Symbol not found: glGenTransformFeedbacks");
        try { Handles.MH_glGenTransformFeedbacks.invokeExact(handles.PFN_glGenTransformFeedbacks, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in GenTransformFeedbacks", e); }
    }

    /// ```
    /// GLboolean glIsTransformFeedback(unsigned int id);
    /// ```
    public boolean IsTransformFeedback(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsTransformFeedback)) throw new SymbolNotFoundError("Symbol not found: glIsTransformFeedback");
        try { return (((byte) Handles.MH_glIsTransformFeedback.invokeExact(handles.PFN_glIsTransformFeedback, id)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsTransformFeedback", e); }
    }

    /// ```
    /// void glPauseTransformFeedback();
    /// ```
    public void PauseTransformFeedback() {
        if (MemoryUtil.isNullPointer(handles.PFN_glPauseTransformFeedback)) throw new SymbolNotFoundError("Symbol not found: glPauseTransformFeedback");
        try { Handles.MH_glPauseTransformFeedback.invokeExact(handles.PFN_glPauseTransformFeedback); }
        catch (Throwable e) { throw new RuntimeException("error in PauseTransformFeedback", e); }
    }

    /// ```
    /// void glResumeTransformFeedback();
    /// ```
    public void ResumeTransformFeedback() {
        if (MemoryUtil.isNullPointer(handles.PFN_glResumeTransformFeedback)) throw new SymbolNotFoundError("Symbol not found: glResumeTransformFeedback");
        try { Handles.MH_glResumeTransformFeedback.invokeExact(handles.PFN_glResumeTransformFeedback); }
        catch (Throwable e) { throw new RuntimeException("error in ResumeTransformFeedback", e); }
    }

    /// ```
    /// void glDrawTransformFeedback(unsigned int mode, unsigned int id);
    /// ```
    public void DrawTransformFeedback(int mode, int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawTransformFeedback)) throw new SymbolNotFoundError("Symbol not found: glDrawTransformFeedback");
        try { Handles.MH_glDrawTransformFeedback.invokeExact(handles.PFN_glDrawTransformFeedback, mode, id); }
        catch (Throwable e) { throw new RuntimeException("error in DrawTransformFeedback", e); }
    }

}
