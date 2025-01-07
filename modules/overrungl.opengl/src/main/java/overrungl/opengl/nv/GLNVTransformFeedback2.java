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
    public static final MethodHandle MH_glBindTransformFeedbackNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindTransformFeedbackNV;
    public static final MethodHandle MH_glDeleteTransformFeedbacksNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteTransformFeedbacksNV;
    public static final MethodHandle MH_glGenTransformFeedbacksNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenTransformFeedbacksNV;
    public static final MethodHandle MH_glIsTransformFeedbackNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsTransformFeedbackNV;
    public static final MethodHandle MH_glPauseTransformFeedbackNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glPauseTransformFeedbackNV;
    public static final MethodHandle MH_glResumeTransformFeedbackNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glResumeTransformFeedbackNV;
    public static final MethodHandle MH_glDrawTransformFeedbackNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawTransformFeedbackNV;

    public GLNVTransformFeedback2(overrungl.opengl.GLLoadFunc func) {
        PFN_glBindTransformFeedbackNV = func.invoke("glBindTransformFeedbackNV");
        PFN_glDeleteTransformFeedbacksNV = func.invoke("glDeleteTransformFeedbacksNV", "glDeleteTransformFeedbacks");
        PFN_glGenTransformFeedbacksNV = func.invoke("glGenTransformFeedbacksNV", "glGenTransformFeedbacks");
        PFN_glIsTransformFeedbackNV = func.invoke("glIsTransformFeedbackNV", "glIsTransformFeedback");
        PFN_glPauseTransformFeedbackNV = func.invoke("glPauseTransformFeedbackNV", "glPauseTransformFeedback");
        PFN_glResumeTransformFeedbackNV = func.invoke("glResumeTransformFeedbackNV", "glResumeTransformFeedback");
        PFN_glDrawTransformFeedbackNV = func.invoke("glDrawTransformFeedbackNV", "glDrawTransformFeedback");
    }

    public void BindTransformFeedbackNV(@CType("GLenum") int target, @CType("GLuint") int id) {
        if (!Unmarshal.isNullPointer(PFN_glBindTransformFeedbackNV)) { try {
            MH_glBindTransformFeedbackNV.invokeExact(PFN_glBindTransformFeedbackNV, target, id);
        } catch (Throwable e) { throw new RuntimeException("error in glBindTransformFeedbackNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBindTransformFeedbackNV"); }
    }

    public void DeleteTransformFeedbacksNV(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment ids) {
        if (!Unmarshal.isNullPointer(PFN_glDeleteTransformFeedbacksNV)) { try {
            MH_glDeleteTransformFeedbacksNV.invokeExact(PFN_glDeleteTransformFeedbacksNV, n, ids);
        } catch (Throwable e) { throw new RuntimeException("error in glDeleteTransformFeedbacksNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDeleteTransformFeedbacksNV"); }
    }

    public void GenTransformFeedbacksNV(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment ids) {
        if (!Unmarshal.isNullPointer(PFN_glGenTransformFeedbacksNV)) { try {
            MH_glGenTransformFeedbacksNV.invokeExact(PFN_glGenTransformFeedbacksNV, n, ids);
        } catch (Throwable e) { throw new RuntimeException("error in glGenTransformFeedbacksNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGenTransformFeedbacksNV"); }
    }

    public @CType("GLboolean") boolean IsTransformFeedbackNV(@CType("GLuint") int id) {
        if (!Unmarshal.isNullPointer(PFN_glIsTransformFeedbackNV)) { try {
            return (boolean) MH_glIsTransformFeedbackNV.invokeExact(PFN_glIsTransformFeedbackNV, id);
        } catch (Throwable e) { throw new RuntimeException("error in glIsTransformFeedbackNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glIsTransformFeedbackNV"); }
    }

    public void PauseTransformFeedbackNV() {
        if (!Unmarshal.isNullPointer(PFN_glPauseTransformFeedbackNV)) { try {
            MH_glPauseTransformFeedbackNV.invokeExact(PFN_glPauseTransformFeedbackNV);
        } catch (Throwable e) { throw new RuntimeException("error in glPauseTransformFeedbackNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPauseTransformFeedbackNV"); }
    }

    public void ResumeTransformFeedbackNV() {
        if (!Unmarshal.isNullPointer(PFN_glResumeTransformFeedbackNV)) { try {
            MH_glResumeTransformFeedbackNV.invokeExact(PFN_glResumeTransformFeedbackNV);
        } catch (Throwable e) { throw new RuntimeException("error in glResumeTransformFeedbackNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glResumeTransformFeedbackNV"); }
    }

    public void DrawTransformFeedbackNV(@CType("GLenum") int mode, @CType("GLuint") int id) {
        if (!Unmarshal.isNullPointer(PFN_glDrawTransformFeedbackNV)) { try {
            MH_glDrawTransformFeedbackNV.invokeExact(PFN_glDrawTransformFeedbackNV, mode, id);
        } catch (Throwable e) { throw new RuntimeException("error in glDrawTransformFeedbackNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDrawTransformFeedbackNV"); }
    }

}
