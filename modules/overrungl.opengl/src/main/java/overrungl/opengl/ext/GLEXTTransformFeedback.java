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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTTransformFeedback {
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_EXT = 0x8C8E;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START_EXT = 0x8C84;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_EXT = 0x8C85;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_EXT = 0x8C8F;
    public static final int GL_INTERLEAVED_ATTRIBS_EXT = 0x8C8C;
    public static final int GL_SEPARATE_ATTRIBS_EXT = 0x8C8D;
    public static final int GL_PRIMITIVES_GENERATED_EXT = 0x8C87;
    public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_EXT = 0x8C88;
    public static final int GL_RASTERIZER_DISCARD_EXT = 0x8C89;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_EXT = 0x8C8A;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_EXT = 0x8C8B;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_EXT = 0x8C80;
    public static final int GL_TRANSFORM_FEEDBACK_VARYINGS_EXT = 0x8C83;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE_EXT = 0x8C7F;
    public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT = 0x8C76;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glBeginTransformFeedbackEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glEndTransformFeedbackEXT = FunctionDescriptor.ofVoid();
        public static final FunctionDescriptor FD_glBindBufferRangeEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glBindBufferOffsetEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glBindBufferBaseEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTransformFeedbackVaryingsEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetTransformFeedbackVaryingEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glBeginTransformFeedbackEXT,
            FD_glEndTransformFeedbackEXT,
            FD_glBindBufferRangeEXT,
            FD_glBindBufferOffsetEXT,
            FD_glBindBufferBaseEXT,
            FD_glTransformFeedbackVaryingsEXT,
            FD_glGetTransformFeedbackVaryingEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glBeginTransformFeedbackEXT = RuntimeHelper.downcall(Descriptors.FD_glBeginTransformFeedbackEXT);
        public static final MethodHandle MH_glEndTransformFeedbackEXT = RuntimeHelper.downcall(Descriptors.FD_glEndTransformFeedbackEXT);
        public static final MethodHandle MH_glBindBufferRangeEXT = RuntimeHelper.downcall(Descriptors.FD_glBindBufferRangeEXT);
        public static final MethodHandle MH_glBindBufferOffsetEXT = RuntimeHelper.downcall(Descriptors.FD_glBindBufferOffsetEXT);
        public static final MethodHandle MH_glBindBufferBaseEXT = RuntimeHelper.downcall(Descriptors.FD_glBindBufferBaseEXT);
        public static final MethodHandle MH_glTransformFeedbackVaryingsEXT = RuntimeHelper.downcall(Descriptors.FD_glTransformFeedbackVaryingsEXT);
        public static final MethodHandle MH_glGetTransformFeedbackVaryingEXT = RuntimeHelper.downcall(Descriptors.FD_glGetTransformFeedbackVaryingEXT);
        public final MemorySegment PFN_glBeginTransformFeedbackEXT;
        public final MemorySegment PFN_glEndTransformFeedbackEXT;
        public final MemorySegment PFN_glBindBufferRangeEXT;
        public final MemorySegment PFN_glBindBufferOffsetEXT;
        public final MemorySegment PFN_glBindBufferBaseEXT;
        public final MemorySegment PFN_glTransformFeedbackVaryingsEXT;
        public final MemorySegment PFN_glGetTransformFeedbackVaryingEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBeginTransformFeedbackEXT = func.invoke("glBeginTransformFeedbackEXT", "glBeginTransformFeedback");
            PFN_glEndTransformFeedbackEXT = func.invoke("glEndTransformFeedbackEXT", "glEndTransformFeedback");
            PFN_glBindBufferRangeEXT = func.invoke("glBindBufferRangeEXT", "glBindBufferRange");
            PFN_glBindBufferOffsetEXT = func.invoke("glBindBufferOffsetEXT");
            PFN_glBindBufferBaseEXT = func.invoke("glBindBufferBaseEXT", "glBindBufferBase");
            PFN_glTransformFeedbackVaryingsEXT = func.invoke("glTransformFeedbackVaryingsEXT", "glTransformFeedbackVaryings");
            PFN_glGetTransformFeedbackVaryingEXT = func.invoke("glGetTransformFeedbackVaryingEXT", "glGetTransformFeedbackVarying");
        }
    }

    public GLEXTTransformFeedback(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void BeginTransformFeedbackEXT(@CType("GLenum") int primitiveMode) {
        if (Unmarshal.isNullPointer(handles.PFN_glBeginTransformFeedbackEXT)) throw new SymbolNotFoundError("Symbol not found: glBeginTransformFeedbackEXT");
        try { Handles.MH_glBeginTransformFeedbackEXT.invokeExact(handles.PFN_glBeginTransformFeedbackEXT, primitiveMode); }
        catch (Throwable e) { throw new RuntimeException("error in glBeginTransformFeedbackEXT", e); }
    }

    public void EndTransformFeedbackEXT() {
        if (Unmarshal.isNullPointer(handles.PFN_glEndTransformFeedbackEXT)) throw new SymbolNotFoundError("Symbol not found: glEndTransformFeedbackEXT");
        try { Handles.MH_glEndTransformFeedbackEXT.invokeExact(handles.PFN_glEndTransformFeedbackEXT); }
        catch (Throwable e) { throw new RuntimeException("error in glEndTransformFeedbackEXT", e); }
    }

    public void BindBufferRangeEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindBufferRangeEXT)) throw new SymbolNotFoundError("Symbol not found: glBindBufferRangeEXT");
        try { Handles.MH_glBindBufferRangeEXT.invokeExact(handles.PFN_glBindBufferRangeEXT, target, index, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in glBindBufferRangeEXT", e); }
    }

    public void BindBufferOffsetEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int buffer, @CType("GLintptr") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindBufferOffsetEXT)) throw new SymbolNotFoundError("Symbol not found: glBindBufferOffsetEXT");
        try { Handles.MH_glBindBufferOffsetEXT.invokeExact(handles.PFN_glBindBufferOffsetEXT, target, index, buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glBindBufferOffsetEXT", e); }
    }

    public void BindBufferBaseEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int buffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindBufferBaseEXT)) throw new SymbolNotFoundError("Symbol not found: glBindBufferBaseEXT");
        try { Handles.MH_glBindBufferBaseEXT.invokeExact(handles.PFN_glBindBufferBaseEXT, target, index, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glBindBufferBaseEXT", e); }
    }

    public void TransformFeedbackVaryingsEXT(@CType("GLuint") int program, @CType("GLsizei") int count, @CType("const GLchar *const*") java.lang.foreign.MemorySegment varyings, @CType("GLenum") int bufferMode) {
        if (Unmarshal.isNullPointer(handles.PFN_glTransformFeedbackVaryingsEXT)) throw new SymbolNotFoundError("Symbol not found: glTransformFeedbackVaryingsEXT");
        try { Handles.MH_glTransformFeedbackVaryingsEXT.invokeExact(handles.PFN_glTransformFeedbackVaryingsEXT, program, count, varyings, bufferMode); }
        catch (Throwable e) { throw new RuntimeException("error in glTransformFeedbackVaryingsEXT", e); }
    }

    public void GetTransformFeedbackVaryingEXT(@CType("GLuint") int program, @CType("GLuint") int index, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLsizei *") java.lang.foreign.MemorySegment size, @CType("GLenum *") java.lang.foreign.MemorySegment type, @CType("GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTransformFeedbackVaryingEXT)) throw new SymbolNotFoundError("Symbol not found: glGetTransformFeedbackVaryingEXT");
        try { Handles.MH_glGetTransformFeedbackVaryingEXT.invokeExact(handles.PFN_glGetTransformFeedbackVaryingEXT, program, index, bufSize, length, size, type, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTransformFeedbackVaryingEXT", e); }
    }

}
