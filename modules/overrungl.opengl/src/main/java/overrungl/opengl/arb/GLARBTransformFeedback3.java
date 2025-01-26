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

public final class GLARBTransformFeedback3 {
    public static final int GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 0x8E70;
    public static final int GL_MAX_VERTEX_STREAMS = 0x8E71;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawTransformFeedbackStream = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBeginQueryIndexed = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEndQueryIndexed = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetQueryIndexediv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glDrawTransformFeedbackStream;
        public final MemorySegment PFN_glBeginQueryIndexed;
        public final MemorySegment PFN_glEndQueryIndexed;
        public final MemorySegment PFN_glGetQueryIndexediv;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDrawTransformFeedbackStream = func.invoke("glDrawTransformFeedbackStream");
            PFN_glBeginQueryIndexed = func.invoke("glBeginQueryIndexed");
            PFN_glEndQueryIndexed = func.invoke("glEndQueryIndexed");
            PFN_glGetQueryIndexediv = func.invoke("glGetQueryIndexediv");
        }
    }

    public GLARBTransformFeedback3(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glDrawTransformFeedbackStream(GLenum mode, GLuint id, GLuint stream);
    /// ```
    public void DrawTransformFeedbackStream(int mode, int id, int stream) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawTransformFeedbackStream)) throw new SymbolNotFoundError("Symbol not found: glDrawTransformFeedbackStream");
        try { Handles.MH_glDrawTransformFeedbackStream.invokeExact(handles.PFN_glDrawTransformFeedbackStream, mode, id, stream); }
        catch (Throwable e) { throw new RuntimeException("error in DrawTransformFeedbackStream", e); }
    }

    /// ```
    /// void glBeginQueryIndexed(GLenum target, GLuint index, GLuint id);
    /// ```
    public void BeginQueryIndexed(int target, int index, int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginQueryIndexed)) throw new SymbolNotFoundError("Symbol not found: glBeginQueryIndexed");
        try { Handles.MH_glBeginQueryIndexed.invokeExact(handles.PFN_glBeginQueryIndexed, target, index, id); }
        catch (Throwable e) { throw new RuntimeException("error in BeginQueryIndexed", e); }
    }

    /// ```
    /// void glEndQueryIndexed(GLenum target, GLuint index);
    /// ```
    public void EndQueryIndexed(int target, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndQueryIndexed)) throw new SymbolNotFoundError("Symbol not found: glEndQueryIndexed");
        try { Handles.MH_glEndQueryIndexed.invokeExact(handles.PFN_glEndQueryIndexed, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in EndQueryIndexed", e); }
    }

    /// ```
    /// void glGetQueryIndexediv(GLenum target, GLuint index, GLenum pname, GLint* params);
    /// ```
    public void GetQueryIndexediv(int target, int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryIndexediv)) throw new SymbolNotFoundError("Symbol not found: glGetQueryIndexediv");
        try { Handles.MH_glGetQueryIndexediv.invokeExact(handles.PFN_glGetQueryIndexediv, target, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryIndexediv", e); }
    }

}
