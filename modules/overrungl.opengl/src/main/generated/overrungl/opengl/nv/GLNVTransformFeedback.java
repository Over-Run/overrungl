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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_transform_feedback`
public final class GLNVTransformFeedback {
    public static final int GL_BACK_PRIMARY_COLOR_NV = 0x8C77;
    public static final int GL_BACK_SECONDARY_COLOR_NV = 0x8C78;
    public static final int GL_TEXTURE_COORD_NV = 0x8C79;
    public static final int GL_CLIP_DISTANCE_NV = 0x8C7A;
    public static final int GL_VERTEX_ID_NV = 0x8C7B;
    public static final int GL_PRIMITIVE_ID_NV = 0x8C7C;
    public static final int GL_GENERIC_ATTRIB_NV = 0x8C7D;
    public static final int GL_TRANSFORM_FEEDBACK_ATTRIBS_NV = 0x8C7E;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE_NV = 0x8C7F;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_NV = 0x8C80;
    public static final int GL_ACTIVE_VARYINGS_NV = 0x8C81;
    public static final int GL_ACTIVE_VARYING_MAX_LENGTH_NV = 0x8C82;
    public static final int GL_TRANSFORM_FEEDBACK_VARYINGS_NV = 0x8C83;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START_NV = 0x8C84;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_NV = 0x8C85;
    public static final int GL_TRANSFORM_FEEDBACK_RECORD_NV = 0x8C86;
    public static final int GL_PRIMITIVES_GENERATED_NV = 0x8C87;
    public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_NV = 0x8C88;
    public static final int GL_RASTERIZER_DISCARD_NV = 0x8C89;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_NV = 0x8C8A;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_NV = 0x8C8B;
    public static final int GL_INTERLEAVED_ATTRIBS_NV = 0x8C8C;
    public static final int GL_SEPARATE_ATTRIBS_NV = 0x8C8D;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_NV = 0x8C8E;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_NV = 0x8C8F;
    public static final int GL_LAYER_NV = 0x8DAA;
    public static final int GL_NEXT_BUFFER_NV = -2;
    public static final int GL_SKIP_COMPONENTS4_NV = -3;
    public static final int GL_SKIP_COMPONENTS3_NV = -4;
    public static final int GL_SKIP_COMPONENTS2_NV = -5;
    public static final int GL_SKIP_COMPONENTS1_NV = -6;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBeginTransformFeedbackNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEndTransformFeedbackNV = downcallHandle(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glTransformFeedbackAttribsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindBufferRangeNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glBindBufferOffsetNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glBindBufferBaseNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTransformFeedbackVaryingsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glActiveVaryingNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVaryingLocationNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveVaryingNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTransformFeedbackVaryingNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTransformFeedbackStreamAttribsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBeginTransformFeedbackNV;
        public final MemorySegment PFN_glEndTransformFeedbackNV;
        public final MemorySegment PFN_glTransformFeedbackAttribsNV;
        public final MemorySegment PFN_glBindBufferRangeNV;
        public final MemorySegment PFN_glBindBufferOffsetNV;
        public final MemorySegment PFN_glBindBufferBaseNV;
        public final MemorySegment PFN_glTransformFeedbackVaryingsNV;
        public final MemorySegment PFN_glActiveVaryingNV;
        public final MemorySegment PFN_glGetVaryingLocationNV;
        public final MemorySegment PFN_glGetActiveVaryingNV;
        public final MemorySegment PFN_glGetTransformFeedbackVaryingNV;
        public final MemorySegment PFN_glTransformFeedbackStreamAttribsNV;
        private Handles(GLLoadFunc func) {
            PFN_glBeginTransformFeedbackNV = func.invoke("glBeginTransformFeedbackNV", "glBeginTransformFeedback");
            PFN_glEndTransformFeedbackNV = func.invoke("glEndTransformFeedbackNV", "glEndTransformFeedback");
            PFN_glTransformFeedbackAttribsNV = func.invoke("glTransformFeedbackAttribsNV");
            PFN_glBindBufferRangeNV = func.invoke("glBindBufferRangeNV", "glBindBufferRange");
            PFN_glBindBufferOffsetNV = func.invoke("glBindBufferOffsetNV", "glBindBufferOffsetEXT");
            PFN_glBindBufferBaseNV = func.invoke("glBindBufferBaseNV", "glBindBufferBase");
            PFN_glTransformFeedbackVaryingsNV = func.invoke("glTransformFeedbackVaryingsNV");
            PFN_glActiveVaryingNV = func.invoke("glActiveVaryingNV");
            PFN_glGetVaryingLocationNV = func.invoke("glGetVaryingLocationNV");
            PFN_glGetActiveVaryingNV = func.invoke("glGetActiveVaryingNV");
            PFN_glGetTransformFeedbackVaryingNV = func.invoke("glGetTransformFeedbackVaryingNV");PFN_glTransformFeedbackStreamAttribsNV = func.invoke("glTransformFeedbackStreamAttribsNV");
        }
    }

    public GLNVTransformFeedback(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBeginTransformFeedbackNV`.
    /// ```
    /// void glBeginTransformFeedbackNV((unsigned int) GLenum primitiveMode);
    /// ```
    public void BeginTransformFeedbackNV(int primitiveMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginTransformFeedbackNV)) throw new GLSymbolNotFoundError("Symbol not found: glBeginTransformFeedbackNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBeginTransformFeedbackNV", primitiveMode); }
        Handles.MH_glBeginTransformFeedbackNV.invokeExact(handles.PFN_glBeginTransformFeedbackNV, primitiveMode); }
        catch (Throwable e) { throw new RuntimeException("error in BeginTransformFeedbackNV", e); }
    }

    /// Invokes `glEndTransformFeedbackNV`.
    /// ```
    /// void glEndTransformFeedbackNV();
    /// ```
    public void EndTransformFeedbackNV() {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndTransformFeedbackNV)) throw new GLSymbolNotFoundError("Symbol not found: glEndTransformFeedbackNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEndTransformFeedbackNV"); }
        Handles.MH_glEndTransformFeedbackNV.invokeExact(handles.PFN_glEndTransformFeedbackNV); }
        catch (Throwable e) { throw new RuntimeException("error in EndTransformFeedbackNV", e); }
    }

    /// Invokes `glTransformFeedbackAttribsNV`.
    /// ```
    /// void glTransformFeedbackAttribsNV((int) GLsizei count, const GLint* attribs, (unsigned int) GLenum bufferMode);
    /// ```
    public void TransformFeedbackAttribsNV(int count, @NonNull MemorySegment attribs, int bufferMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTransformFeedbackAttribsNV)) throw new GLSymbolNotFoundError("Symbol not found: glTransformFeedbackAttribsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTransformFeedbackAttribsNV", count, attribs, bufferMode); }
        Handles.MH_glTransformFeedbackAttribsNV.invokeExact(handles.PFN_glTransformFeedbackAttribsNV, count, attribs, bufferMode); }
        catch (Throwable e) { throw new RuntimeException("error in TransformFeedbackAttribsNV", e); }
    }

    /// Invokes `glBindBufferRangeNV`.
    /// ```
    /// void glBindBufferRangeNV((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size);
    /// ```
    public void BindBufferRangeNV(int target, int index, int buffer, long offset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBufferRangeNV)) throw new GLSymbolNotFoundError("Symbol not found: glBindBufferRangeNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindBufferRangeNV", target, index, buffer, offset, size); }
        Handles.MH_glBindBufferRangeNV.invokeExact(handles.PFN_glBindBufferRangeNV, target, index, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in BindBufferRangeNV", e); }
    }

    /// Invokes `glBindBufferOffsetNV`.
    /// ```
    /// void glBindBufferOffsetNV((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void BindBufferOffsetNV(int target, int index, int buffer, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBufferOffsetNV)) throw new GLSymbolNotFoundError("Symbol not found: glBindBufferOffsetNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindBufferOffsetNV", target, index, buffer, offset); }
        Handles.MH_glBindBufferOffsetNV.invokeExact(handles.PFN_glBindBufferOffsetNV, target, index, buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in BindBufferOffsetNV", e); }
    }

    /// Invokes `glBindBufferBaseNV`.
    /// ```
    /// void glBindBufferBaseNV((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLuint buffer);
    /// ```
    public void BindBufferBaseNV(int target, int index, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBufferBaseNV)) throw new GLSymbolNotFoundError("Symbol not found: glBindBufferBaseNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindBufferBaseNV", target, index, buffer); }
        Handles.MH_glBindBufferBaseNV.invokeExact(handles.PFN_glBindBufferBaseNV, target, index, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in BindBufferBaseNV", e); }
    }

    /// Invokes `glTransformFeedbackVaryingsNV`.
    /// ```
    /// void glTransformFeedbackVaryingsNV((unsigned int) GLuint program, (int) GLsizei count, const GLint* locations, (unsigned int) GLenum bufferMode);
    /// ```
    public void TransformFeedbackVaryingsNV(int program, int count, @NonNull MemorySegment locations, int bufferMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTransformFeedbackVaryingsNV)) throw new GLSymbolNotFoundError("Symbol not found: glTransformFeedbackVaryingsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTransformFeedbackVaryingsNV", program, count, locations, bufferMode); }
        Handles.MH_glTransformFeedbackVaryingsNV.invokeExact(handles.PFN_glTransformFeedbackVaryingsNV, program, count, locations, bufferMode); }
        catch (Throwable e) { throw new RuntimeException("error in TransformFeedbackVaryingsNV", e); }
    }

    /// Invokes `glActiveVaryingNV`.
    /// ```
    /// void glActiveVaryingNV((unsigned int) GLuint program, const GLchar* name);
    /// ```
    public void ActiveVaryingNV(int program, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glActiveVaryingNV)) throw new GLSymbolNotFoundError("Symbol not found: glActiveVaryingNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glActiveVaryingNV", program, name); }
        Handles.MH_glActiveVaryingNV.invokeExact(handles.PFN_glActiveVaryingNV, program, name); }
        catch (Throwable e) { throw new RuntimeException("error in ActiveVaryingNV", e); }
    }

    /// Invokes `glGetVaryingLocationNV`.
    /// ```
    /// (int) GLint glGetVaryingLocationNV((unsigned int) GLuint program, const GLchar* name);
    /// ```
    public int GetVaryingLocationNV(int program, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVaryingLocationNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetVaryingLocationNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVaryingLocationNV", program, name); }
        return (int) Handles.MH_glGetVaryingLocationNV.invokeExact(handles.PFN_glGetVaryingLocationNV, program, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetVaryingLocationNV", e); }
    }

    /// Invokes `glGetActiveVaryingNV`.
    /// ```
    /// void glGetActiveVaryingNV((unsigned int) GLuint program, (unsigned int) GLuint index, (int) GLsizei bufSize, GLsizei* length, GLsizei* size, GLenum* type, GLchar* name);
    /// ```
    public void GetActiveVaryingNV(int program, int index, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment size, @NonNull MemorySegment type, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetActiveVaryingNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetActiveVaryingNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetActiveVaryingNV", program, index, bufSize, length, size, type, name); }
        Handles.MH_glGetActiveVaryingNV.invokeExact(handles.PFN_glGetActiveVaryingNV, program, index, bufSize, length, size, type, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetActiveVaryingNV", e); }
    }

    /// Invokes `glGetTransformFeedbackVaryingNV`.
    /// ```
    /// void glGetTransformFeedbackVaryingNV((unsigned int) GLuint program, (unsigned int) GLuint index, GLint* location);
    /// ```
    public void GetTransformFeedbackVaryingNV(int program, int index, @NonNull MemorySegment location) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTransformFeedbackVaryingNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetTransformFeedbackVaryingNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTransformFeedbackVaryingNV", program, index, location); }
        Handles.MH_glGetTransformFeedbackVaryingNV.invokeExact(handles.PFN_glGetTransformFeedbackVaryingNV, program, index, location); }
        catch (Throwable e) { throw new RuntimeException("error in GetTransformFeedbackVaryingNV", e); }
    }

    /// Invokes `glTransformFeedbackStreamAttribsNV`.
    /// ```
    /// void glTransformFeedbackStreamAttribsNV((int) GLsizei count, const GLint* attribs, (int) GLsizei nbuffers, const GLint* bufstreams, (unsigned int) GLenum bufferMode);
    /// ```
    public void TransformFeedbackStreamAttribsNV(int count, @NonNull MemorySegment attribs, int nbuffers, @NonNull MemorySegment bufstreams, int bufferMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTransformFeedbackStreamAttribsNV)) throw new GLSymbolNotFoundError("Symbol not found: glTransformFeedbackStreamAttribsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTransformFeedbackStreamAttribsNV", count, attribs, nbuffers, bufstreams, bufferMode); }
        Handles.MH_glTransformFeedbackStreamAttribsNV.invokeExact(handles.PFN_glTransformFeedbackStreamAttribsNV, count, attribs, nbuffers, bufstreams, bufferMode); }
        catch (Throwable e) { throw new RuntimeException("error in TransformFeedbackStreamAttribsNV", e); }
    }

}
