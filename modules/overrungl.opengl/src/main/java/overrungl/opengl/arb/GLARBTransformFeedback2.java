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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBTransformFeedback2 {
    public static final int GL_TRANSFORM_FEEDBACK = 0x8E22;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 0x8E23;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 0x8E24;
    public static final int GL_TRANSFORM_FEEDBACK_BINDING = 0x8E25;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glBindTransformFeedback = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDeleteTransformFeedbacks = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGenTransformFeedbacks = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIsTransformFeedback = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glPauseTransformFeedback = FunctionDescriptor.ofVoid();
        public static final FunctionDescriptor FD_glResumeTransformFeedback = FunctionDescriptor.ofVoid();
        public static final FunctionDescriptor FD_glDrawTransformFeedback = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glBindTransformFeedback,
            FD_glDeleteTransformFeedbacks,
            FD_glGenTransformFeedbacks,
            FD_glIsTransformFeedback,
            FD_glPauseTransformFeedback,
            FD_glResumeTransformFeedback,
            FD_glDrawTransformFeedback
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glBindTransformFeedback = RuntimeHelper.downcall(Descriptors.FD_glBindTransformFeedback);
        public static final MethodHandle MH_glDeleteTransformFeedbacks = RuntimeHelper.downcall(Descriptors.FD_glDeleteTransformFeedbacks);
        public static final MethodHandle MH_glGenTransformFeedbacks = RuntimeHelper.downcall(Descriptors.FD_glGenTransformFeedbacks);
        public static final MethodHandle MH_glIsTransformFeedback = RuntimeHelper.downcall(Descriptors.FD_glIsTransformFeedback);
        public static final MethodHandle MH_glPauseTransformFeedback = RuntimeHelper.downcall(Descriptors.FD_glPauseTransformFeedback);
        public static final MethodHandle MH_glResumeTransformFeedback = RuntimeHelper.downcall(Descriptors.FD_glResumeTransformFeedback);
        public static final MethodHandle MH_glDrawTransformFeedback = RuntimeHelper.downcall(Descriptors.FD_glDrawTransformFeedback);
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

    public void BindTransformFeedback(@CType("GLenum") int target, @CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindTransformFeedback)) throw new SymbolNotFoundError("Symbol not found: glBindTransformFeedback");
        try { Handles.MH_glBindTransformFeedback.invokeExact(handles.PFN_glBindTransformFeedback, target, id); }
        catch (Throwable e) { throw new RuntimeException("error in glBindTransformFeedback", e); }
    }

    public void DeleteTransformFeedbacks(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment ids) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteTransformFeedbacks)) throw new SymbolNotFoundError("Symbol not found: glDeleteTransformFeedbacks");
        try { Handles.MH_glDeleteTransformFeedbacks.invokeExact(handles.PFN_glDeleteTransformFeedbacks, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteTransformFeedbacks", e); }
    }

    public void GenTransformFeedbacks(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment ids) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenTransformFeedbacks)) throw new SymbolNotFoundError("Symbol not found: glGenTransformFeedbacks");
        try { Handles.MH_glGenTransformFeedbacks.invokeExact(handles.PFN_glGenTransformFeedbacks, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in glGenTransformFeedbacks", e); }
    }

    public @CType("GLboolean") boolean IsTransformFeedback(@CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsTransformFeedback)) throw new SymbolNotFoundError("Symbol not found: glIsTransformFeedback");
        try { return (boolean) Handles.MH_glIsTransformFeedback.invokeExact(handles.PFN_glIsTransformFeedback, id); }
        catch (Throwable e) { throw new RuntimeException("error in glIsTransformFeedback", e); }
    }

    public void PauseTransformFeedback() {
        if (Unmarshal.isNullPointer(handles.PFN_glPauseTransformFeedback)) throw new SymbolNotFoundError("Symbol not found: glPauseTransformFeedback");
        try { Handles.MH_glPauseTransformFeedback.invokeExact(handles.PFN_glPauseTransformFeedback); }
        catch (Throwable e) { throw new RuntimeException("error in glPauseTransformFeedback", e); }
    }

    public void ResumeTransformFeedback() {
        if (Unmarshal.isNullPointer(handles.PFN_glResumeTransformFeedback)) throw new SymbolNotFoundError("Symbol not found: glResumeTransformFeedback");
        try { Handles.MH_glResumeTransformFeedback.invokeExact(handles.PFN_glResumeTransformFeedback); }
        catch (Throwable e) { throw new RuntimeException("error in glResumeTransformFeedback", e); }
    }

    public void DrawTransformFeedback(@CType("GLenum") int mode, @CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawTransformFeedback)) throw new SymbolNotFoundError("Symbol not found: glDrawTransformFeedback");
        try { Handles.MH_glDrawTransformFeedback.invokeExact(handles.PFN_glDrawTransformFeedback, mode, id); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawTransformFeedback", e); }
    }

}
