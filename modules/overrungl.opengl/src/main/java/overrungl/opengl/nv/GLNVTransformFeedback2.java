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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVTransformFeedback2 {
    public static final int GL_TRANSFORM_FEEDBACK_NV = 0x8E22;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED_NV = 0x8E23;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE_NV = 0x8E24;
    public static final int GL_TRANSFORM_FEEDBACK_BINDING_NV = 0x8E25;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBindTransformFeedbackNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteTransformFeedbacksNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenTransformFeedbacksNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsTransformFeedbackNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPauseTransformFeedbackNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glResumeTransformFeedbackNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glDrawTransformFeedbackNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
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

    public void BindTransformFeedbackNV(@CType("GLenum") int target, @CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindTransformFeedbackNV)) throw new SymbolNotFoundError("Symbol not found: glBindTransformFeedbackNV");
        try { Handles.MH_glBindTransformFeedbackNV.invokeExact(handles.PFN_glBindTransformFeedbackNV, target, id); }
        catch (Throwable e) { throw new RuntimeException("error in glBindTransformFeedbackNV", e); }
    }

    public void DeleteTransformFeedbacksNV(@CType("GLsizei") int n, @CType("const GLuint *") MemorySegment ids) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteTransformFeedbacksNV)) throw new SymbolNotFoundError("Symbol not found: glDeleteTransformFeedbacksNV");
        try { Handles.MH_glDeleteTransformFeedbacksNV.invokeExact(handles.PFN_glDeleteTransformFeedbacksNV, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteTransformFeedbacksNV", e); }
    }

    public void GenTransformFeedbacksNV(@CType("GLsizei") int n, @CType("GLuint *") MemorySegment ids) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenTransformFeedbacksNV)) throw new SymbolNotFoundError("Symbol not found: glGenTransformFeedbacksNV");
        try { Handles.MH_glGenTransformFeedbacksNV.invokeExact(handles.PFN_glGenTransformFeedbacksNV, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in glGenTransformFeedbacksNV", e); }
    }

    public @CType("GLboolean") boolean IsTransformFeedbackNV(@CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsTransformFeedbackNV)) throw new SymbolNotFoundError("Symbol not found: glIsTransformFeedbackNV");
        try { return (boolean) Handles.MH_glIsTransformFeedbackNV.invokeExact(handles.PFN_glIsTransformFeedbackNV, id); }
        catch (Throwable e) { throw new RuntimeException("error in glIsTransformFeedbackNV", e); }
    }

    public void PauseTransformFeedbackNV() {
        if (Unmarshal.isNullPointer(handles.PFN_glPauseTransformFeedbackNV)) throw new SymbolNotFoundError("Symbol not found: glPauseTransformFeedbackNV");
        try { Handles.MH_glPauseTransformFeedbackNV.invokeExact(handles.PFN_glPauseTransformFeedbackNV); }
        catch (Throwable e) { throw new RuntimeException("error in glPauseTransformFeedbackNV", e); }
    }

    public void ResumeTransformFeedbackNV() {
        if (Unmarshal.isNullPointer(handles.PFN_glResumeTransformFeedbackNV)) throw new SymbolNotFoundError("Symbol not found: glResumeTransformFeedbackNV");
        try { Handles.MH_glResumeTransformFeedbackNV.invokeExact(handles.PFN_glResumeTransformFeedbackNV); }
        catch (Throwable e) { throw new RuntimeException("error in glResumeTransformFeedbackNV", e); }
    }

    public void DrawTransformFeedbackNV(@CType("GLenum") int mode, @CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawTransformFeedbackNV)) throw new SymbolNotFoundError("Symbol not found: glDrawTransformFeedbackNV");
        try { Handles.MH_glDrawTransformFeedbackNV.invokeExact(handles.PFN_glDrawTransformFeedbackNV, mode, id); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawTransformFeedbackNV", e); }
    }

}
