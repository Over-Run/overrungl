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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

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
    public static final class Handles {
        public static final MethodHandle MH_glBeginTransformFeedbackEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEndTransformFeedbackEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glBindBufferRangeEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glBindBufferOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glBindBufferBaseEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTransformFeedbackVaryingsEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetTransformFeedbackVaryingEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
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

    /// ```
    /// void glBeginTransformFeedbackEXT((unsigned int) GLenum primitiveMode);
    /// ```
    public void BeginTransformFeedbackEXT(int primitiveMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginTransformFeedbackEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBeginTransformFeedbackEXT");
        try { Handles.MH_glBeginTransformFeedbackEXT.invokeExact(handles.PFN_glBeginTransformFeedbackEXT, primitiveMode); }
        catch (Throwable e) { throw new RuntimeException("error in BeginTransformFeedbackEXT", e); }
    }

    /// ```
    /// void glEndTransformFeedbackEXT();
    /// ```
    public void EndTransformFeedbackEXT() {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndTransformFeedbackEXT)) throw new GLSymbolNotFoundError("Symbol not found: glEndTransformFeedbackEXT");
        try { Handles.MH_glEndTransformFeedbackEXT.invokeExact(handles.PFN_glEndTransformFeedbackEXT); }
        catch (Throwable e) { throw new RuntimeException("error in EndTransformFeedbackEXT", e); }
    }

    /// ```
    /// void glBindBufferRangeEXT((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size);
    /// ```
    public void BindBufferRangeEXT(int target, int index, int buffer, long offset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBufferRangeEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBindBufferRangeEXT");
        try { Handles.MH_glBindBufferRangeEXT.invokeExact(handles.PFN_glBindBufferRangeEXT, target, index, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in BindBufferRangeEXT", e); }
    }

    /// ```
    /// void glBindBufferOffsetEXT((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void BindBufferOffsetEXT(int target, int index, int buffer, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBufferOffsetEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBindBufferOffsetEXT");
        try { Handles.MH_glBindBufferOffsetEXT.invokeExact(handles.PFN_glBindBufferOffsetEXT, target, index, buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in BindBufferOffsetEXT", e); }
    }

    /// ```
    /// void glBindBufferBaseEXT((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLuint buffer);
    /// ```
    public void BindBufferBaseEXT(int target, int index, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBufferBaseEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBindBufferBaseEXT");
        try { Handles.MH_glBindBufferBaseEXT.invokeExact(handles.PFN_glBindBufferBaseEXT, target, index, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in BindBufferBaseEXT", e); }
    }

    /// ```
    /// void glTransformFeedbackVaryingsEXT((unsigned int) GLuint program, (int) GLsizei count, const GLchar* const * varyings, (unsigned int) GLenum bufferMode);
    /// ```
    public void TransformFeedbackVaryingsEXT(int program, int count, MemorySegment varyings, int bufferMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTransformFeedbackVaryingsEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTransformFeedbackVaryingsEXT");
        try { Handles.MH_glTransformFeedbackVaryingsEXT.invokeExact(handles.PFN_glTransformFeedbackVaryingsEXT, program, count, varyings, bufferMode); }
        catch (Throwable e) { throw new RuntimeException("error in TransformFeedbackVaryingsEXT", e); }
    }

    /// ```
    /// void glGetTransformFeedbackVaryingEXT((unsigned int) GLuint program, (unsigned int) GLuint index, (int) GLsizei bufSize, GLsizei* length, GLsizei* size, GLenum* type, GLchar* name);
    /// ```
    public void GetTransformFeedbackVaryingEXT(int program, int index, int bufSize, MemorySegment length, MemorySegment size, MemorySegment type, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTransformFeedbackVaryingEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetTransformFeedbackVaryingEXT");
        try { Handles.MH_glGetTransformFeedbackVaryingEXT.invokeExact(handles.PFN_glGetTransformFeedbackVaryingEXT, program, index, bufSize, length, size, type, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetTransformFeedbackVaryingEXT", e); }
    }

}
