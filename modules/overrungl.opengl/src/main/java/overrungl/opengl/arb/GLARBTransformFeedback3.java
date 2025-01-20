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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glDrawTransformFeedbackStream = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBeginQueryIndexed = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glEndQueryIndexed = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetQueryIndexediv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glDrawTransformFeedbackStream = RuntimeHelper.downcall(Descriptors.FD_glDrawTransformFeedbackStream);
        public static final MethodHandle MH_glBeginQueryIndexed = RuntimeHelper.downcall(Descriptors.FD_glBeginQueryIndexed);
        public static final MethodHandle MH_glEndQueryIndexed = RuntimeHelper.downcall(Descriptors.FD_glEndQueryIndexed);
        public static final MethodHandle MH_glGetQueryIndexediv = RuntimeHelper.downcall(Descriptors.FD_glGetQueryIndexediv);
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

    public void DrawTransformFeedbackStream(@CType("GLenum") int mode, @CType("GLuint") int id, @CType("GLuint") int stream) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawTransformFeedbackStream)) throw new SymbolNotFoundError("Symbol not found: glDrawTransformFeedbackStream");
        try { Handles.MH_glDrawTransformFeedbackStream.invokeExact(handles.PFN_glDrawTransformFeedbackStream, mode, id, stream); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawTransformFeedbackStream", e); }
    }

    public void BeginQueryIndexed(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(handles.PFN_glBeginQueryIndexed)) throw new SymbolNotFoundError("Symbol not found: glBeginQueryIndexed");
        try { Handles.MH_glBeginQueryIndexed.invokeExact(handles.PFN_glBeginQueryIndexed, target, index, id); }
        catch (Throwable e) { throw new RuntimeException("error in glBeginQueryIndexed", e); }
    }

    public void EndQueryIndexed(@CType("GLenum") int target, @CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glEndQueryIndexed)) throw new SymbolNotFoundError("Symbol not found: glEndQueryIndexed");
        try { Handles.MH_glEndQueryIndexed.invokeExact(handles.PFN_glEndQueryIndexed, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in glEndQueryIndexed", e); }
    }

    public void GetQueryIndexediv(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetQueryIndexediv)) throw new SymbolNotFoundError("Symbol not found: glGetQueryIndexediv");
        try { Handles.MH_glGetQueryIndexediv.invokeExact(handles.PFN_glGetQueryIndexediv, target, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryIndexediv", e); }
    }

}
