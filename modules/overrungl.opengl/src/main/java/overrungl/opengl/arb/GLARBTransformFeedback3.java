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

public final class GLARBTransformFeedback3 {
    public static final int GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 0x8E70;
    public static final int GL_MAX_VERTEX_STREAMS = 0x8E71;
    public static final MethodHandle MH_glDrawTransformFeedbackStream = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawTransformFeedbackStream;
    public static final MethodHandle MH_glBeginQueryIndexed = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBeginQueryIndexed;
    public static final MethodHandle MH_glEndQueryIndexed = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glEndQueryIndexed;
    public static final MethodHandle MH_glGetQueryIndexediv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetQueryIndexediv;

    public GLARBTransformFeedback3(overrungl.opengl.GLLoadFunc func) {
        PFN_glDrawTransformFeedbackStream = func.invoke("glDrawTransformFeedbackStream");
        PFN_glBeginQueryIndexed = func.invoke("glBeginQueryIndexed");
        PFN_glEndQueryIndexed = func.invoke("glEndQueryIndexed");
        PFN_glGetQueryIndexediv = func.invoke("glGetQueryIndexediv");
    }

    public void DrawTransformFeedbackStream(@CType("GLenum") int mode, @CType("GLuint") int id, @CType("GLuint") int stream) {
        try { if (!Unmarshal.isNullPointer(PFN_glDrawTransformFeedbackStream))
            MH_glDrawTransformFeedbackStream.invokeExact(PFN_glDrawTransformFeedbackStream, mode, id, stream);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDrawTransformFeedbackStream", e); }
    }

    public void BeginQueryIndexed(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int id) {
        try { if (!Unmarshal.isNullPointer(PFN_glBeginQueryIndexed))
            MH_glBeginQueryIndexed.invokeExact(PFN_glBeginQueryIndexed, target, index, id);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBeginQueryIndexed", e); }
    }

    public void EndQueryIndexed(@CType("GLenum") int target, @CType("GLuint") int index) {
        try { if (!Unmarshal.isNullPointer(PFN_glEndQueryIndexed))
            MH_glEndQueryIndexed.invokeExact(PFN_glEndQueryIndexed, target, index);
        }
        catch (Throwable e) { throw new RuntimeException("error in glEndQueryIndexed", e); }
    }

    public void GetQueryIndexediv(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetQueryIndexediv))
            MH_glGetQueryIndexediv.invokeExact(PFN_glGetQueryIndexediv, target, index, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryIndexediv", e); }
    }

}
