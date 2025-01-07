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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBTransformFeedback2 {
    public static final int GL_TRANSFORM_FEEDBACK = 0x8E22;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 0x8E23;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 0x8E24;
    public static final int GL_TRANSFORM_FEEDBACK_BINDING = 0x8E25;
    public static final MethodHandle MH_glBindTransformFeedback = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindTransformFeedback;
    public static final MethodHandle MH_glDeleteTransformFeedbacks = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteTransformFeedbacks;
    public static final MethodHandle MH_glGenTransformFeedbacks = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenTransformFeedbacks;
    public static final MethodHandle MH_glIsTransformFeedback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsTransformFeedback;
    public static final MethodHandle MH_glPauseTransformFeedback = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glPauseTransformFeedback;
    public static final MethodHandle MH_glResumeTransformFeedback = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glResumeTransformFeedback;
    public static final MethodHandle MH_glDrawTransformFeedback = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawTransformFeedback;

    public GLARBTransformFeedback2(overrungl.opengl.GLLoadFunc func) {
        PFN_glBindTransformFeedback = func.invoke("glBindTransformFeedback");
        PFN_glDeleteTransformFeedbacks = func.invoke("glDeleteTransformFeedbacks");
        PFN_glGenTransformFeedbacks = func.invoke("glGenTransformFeedbacks");
        PFN_glIsTransformFeedback = func.invoke("glIsTransformFeedback");
        PFN_glPauseTransformFeedback = func.invoke("glPauseTransformFeedback");
        PFN_glResumeTransformFeedback = func.invoke("glResumeTransformFeedback");
        PFN_glDrawTransformFeedback = func.invoke("glDrawTransformFeedback");
    }

    public void BindTransformFeedback(@CType("GLenum") int target, @CType("GLuint") int id) {
        if (!Unmarshal.isNullPointer(PFN_glBindTransformFeedback)) { try {
            MH_glBindTransformFeedback.invokeExact(PFN_glBindTransformFeedback, target, id);
        } catch (Throwable e) { throw new RuntimeException("error in glBindTransformFeedback", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBindTransformFeedback"); }
    }

    public void DeleteTransformFeedbacks(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment ids) {
        if (!Unmarshal.isNullPointer(PFN_glDeleteTransformFeedbacks)) { try {
            MH_glDeleteTransformFeedbacks.invokeExact(PFN_glDeleteTransformFeedbacks, n, ids);
        } catch (Throwable e) { throw new RuntimeException("error in glDeleteTransformFeedbacks", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDeleteTransformFeedbacks"); }
    }

    public void GenTransformFeedbacks(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment ids) {
        if (!Unmarshal.isNullPointer(PFN_glGenTransformFeedbacks)) { try {
            MH_glGenTransformFeedbacks.invokeExact(PFN_glGenTransformFeedbacks, n, ids);
        } catch (Throwable e) { throw new RuntimeException("error in glGenTransformFeedbacks", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGenTransformFeedbacks"); }
    }

    public @CType("GLboolean") boolean IsTransformFeedback(@CType("GLuint") int id) {
        if (!Unmarshal.isNullPointer(PFN_glIsTransformFeedback)) { try {
            return (boolean) MH_glIsTransformFeedback.invokeExact(PFN_glIsTransformFeedback, id);
        } catch (Throwable e) { throw new RuntimeException("error in glIsTransformFeedback", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glIsTransformFeedback"); }
    }

    public void PauseTransformFeedback() {
        if (!Unmarshal.isNullPointer(PFN_glPauseTransformFeedback)) { try {
            MH_glPauseTransformFeedback.invokeExact(PFN_glPauseTransformFeedback);
        } catch (Throwable e) { throw new RuntimeException("error in glPauseTransformFeedback", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPauseTransformFeedback"); }
    }

    public void ResumeTransformFeedback() {
        if (!Unmarshal.isNullPointer(PFN_glResumeTransformFeedback)) { try {
            MH_glResumeTransformFeedback.invokeExact(PFN_glResumeTransformFeedback);
        } catch (Throwable e) { throw new RuntimeException("error in glResumeTransformFeedback", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glResumeTransformFeedback"); }
    }

    public void DrawTransformFeedback(@CType("GLenum") int mode, @CType("GLuint") int id) {
        if (!Unmarshal.isNullPointer(PFN_glDrawTransformFeedback)) { try {
            MH_glDrawTransformFeedback.invokeExact(PFN_glDrawTransformFeedback, mode, id);
        } catch (Throwable e) { throw new RuntimeException("error in glDrawTransformFeedback", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDrawTransformFeedback"); }
    }

}
