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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glBeginTransformFeedbackNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glEndTransformFeedbackNV = FunctionDescriptor.ofVoid();
        public static final FunctionDescriptor FD_glTransformFeedbackAttribsNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBindBufferRangeNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glBindBufferOffsetNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glBindBufferBaseNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTransformFeedbackVaryingsNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glActiveVaryingNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVaryingLocationNV = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetActiveVaryingNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTransformFeedbackVaryingNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTransformFeedbackStreamAttribsNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glBeginTransformFeedbackNV,
            FD_glEndTransformFeedbackNV,
            FD_glTransformFeedbackAttribsNV,
            FD_glBindBufferRangeNV,
            FD_glBindBufferOffsetNV,
            FD_glBindBufferBaseNV,
            FD_glTransformFeedbackVaryingsNV,
            FD_glActiveVaryingNV,
            FD_glGetVaryingLocationNV,
            FD_glGetActiveVaryingNV,
            FD_glGetTransformFeedbackVaryingNV,
            FD_glTransformFeedbackStreamAttribsNV
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glBeginTransformFeedbackNV = RuntimeHelper.downcall(Descriptors.FD_glBeginTransformFeedbackNV);
        public static final MethodHandle MH_glEndTransformFeedbackNV = RuntimeHelper.downcall(Descriptors.FD_glEndTransformFeedbackNV);
        public static final MethodHandle MH_glTransformFeedbackAttribsNV = RuntimeHelper.downcall(Descriptors.FD_glTransformFeedbackAttribsNV);
        public static final MethodHandle MH_glBindBufferRangeNV = RuntimeHelper.downcall(Descriptors.FD_glBindBufferRangeNV);
        public static final MethodHandle MH_glBindBufferOffsetNV = RuntimeHelper.downcall(Descriptors.FD_glBindBufferOffsetNV);
        public static final MethodHandle MH_glBindBufferBaseNV = RuntimeHelper.downcall(Descriptors.FD_glBindBufferBaseNV);
        public static final MethodHandle MH_glTransformFeedbackVaryingsNV = RuntimeHelper.downcall(Descriptors.FD_glTransformFeedbackVaryingsNV);
        public static final MethodHandle MH_glActiveVaryingNV = RuntimeHelper.downcall(Descriptors.FD_glActiveVaryingNV);
        public static final MethodHandle MH_glGetVaryingLocationNV = RuntimeHelper.downcall(Descriptors.FD_glGetVaryingLocationNV);
        public static final MethodHandle MH_glGetActiveVaryingNV = RuntimeHelper.downcall(Descriptors.FD_glGetActiveVaryingNV);
        public static final MethodHandle MH_glGetTransformFeedbackVaryingNV = RuntimeHelper.downcall(Descriptors.FD_glGetTransformFeedbackVaryingNV);
        public static final MethodHandle MH_glTransformFeedbackStreamAttribsNV = RuntimeHelper.downcall(Descriptors.FD_glTransformFeedbackStreamAttribsNV);
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
        private Handles(overrungl.opengl.GLLoadFunc func) {
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

    public GLNVTransformFeedback(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void BeginTransformFeedbackNV(@CType("GLenum") int primitiveMode) {
        if (Unmarshal.isNullPointer(handles.PFN_glBeginTransformFeedbackNV)) throw new SymbolNotFoundError("Symbol not found: glBeginTransformFeedbackNV");
        try { Handles.MH_glBeginTransformFeedbackNV.invokeExact(handles.PFN_glBeginTransformFeedbackNV, primitiveMode); }
        catch (Throwable e) { throw new RuntimeException("error in glBeginTransformFeedbackNV", e); }
    }

    public void EndTransformFeedbackNV() {
        if (Unmarshal.isNullPointer(handles.PFN_glEndTransformFeedbackNV)) throw new SymbolNotFoundError("Symbol not found: glEndTransformFeedbackNV");
        try { Handles.MH_glEndTransformFeedbackNV.invokeExact(handles.PFN_glEndTransformFeedbackNV); }
        catch (Throwable e) { throw new RuntimeException("error in glEndTransformFeedbackNV", e); }
    }

    public void TransformFeedbackAttribsNV(@CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment attribs, @CType("GLenum") int bufferMode) {
        if (Unmarshal.isNullPointer(handles.PFN_glTransformFeedbackAttribsNV)) throw new SymbolNotFoundError("Symbol not found: glTransformFeedbackAttribsNV");
        try { Handles.MH_glTransformFeedbackAttribsNV.invokeExact(handles.PFN_glTransformFeedbackAttribsNV, count, attribs, bufferMode); }
        catch (Throwable e) { throw new RuntimeException("error in glTransformFeedbackAttribsNV", e); }
    }

    public void BindBufferRangeNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindBufferRangeNV)) throw new SymbolNotFoundError("Symbol not found: glBindBufferRangeNV");
        try { Handles.MH_glBindBufferRangeNV.invokeExact(handles.PFN_glBindBufferRangeNV, target, index, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in glBindBufferRangeNV", e); }
    }

    public void BindBufferOffsetNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int buffer, @CType("GLintptr") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindBufferOffsetNV)) throw new SymbolNotFoundError("Symbol not found: glBindBufferOffsetNV");
        try { Handles.MH_glBindBufferOffsetNV.invokeExact(handles.PFN_glBindBufferOffsetNV, target, index, buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glBindBufferOffsetNV", e); }
    }

    public void BindBufferBaseNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int buffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindBufferBaseNV)) throw new SymbolNotFoundError("Symbol not found: glBindBufferBaseNV");
        try { Handles.MH_glBindBufferBaseNV.invokeExact(handles.PFN_glBindBufferBaseNV, target, index, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glBindBufferBaseNV", e); }
    }

    public void TransformFeedbackVaryingsNV(@CType("GLuint") int program, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment locations, @CType("GLenum") int bufferMode) {
        if (Unmarshal.isNullPointer(handles.PFN_glTransformFeedbackVaryingsNV)) throw new SymbolNotFoundError("Symbol not found: glTransformFeedbackVaryingsNV");
        try { Handles.MH_glTransformFeedbackVaryingsNV.invokeExact(handles.PFN_glTransformFeedbackVaryingsNV, program, count, locations, bufferMode); }
        catch (Throwable e) { throw new RuntimeException("error in glTransformFeedbackVaryingsNV", e); }
    }

    public void ActiveVaryingNV(@CType("GLuint") int program, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glActiveVaryingNV)) throw new SymbolNotFoundError("Symbol not found: glActiveVaryingNV");
        try { Handles.MH_glActiveVaryingNV.invokeExact(handles.PFN_glActiveVaryingNV, program, name); }
        catch (Throwable e) { throw new RuntimeException("error in glActiveVaryingNV", e); }
    }

    public @CType("GLint") int GetVaryingLocationNV(@CType("GLuint") int program, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVaryingLocationNV)) throw new SymbolNotFoundError("Symbol not found: glGetVaryingLocationNV");
        try { return (int) Handles.MH_glGetVaryingLocationNV.invokeExact(handles.PFN_glGetVaryingLocationNV, program, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVaryingLocationNV", e); }
    }

    public void GetActiveVaryingNV(@CType("GLuint") int program, @CType("GLuint") int index, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLsizei *") java.lang.foreign.MemorySegment size, @CType("GLenum *") java.lang.foreign.MemorySegment type, @CType("GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetActiveVaryingNV)) throw new SymbolNotFoundError("Symbol not found: glGetActiveVaryingNV");
        try { Handles.MH_glGetActiveVaryingNV.invokeExact(handles.PFN_glGetActiveVaryingNV, program, index, bufSize, length, size, type, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveVaryingNV", e); }
    }

    public void GetTransformFeedbackVaryingNV(@CType("GLuint") int program, @CType("GLuint") int index, @CType("GLint *") java.lang.foreign.MemorySegment location) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTransformFeedbackVaryingNV)) throw new SymbolNotFoundError("Symbol not found: glGetTransformFeedbackVaryingNV");
        try { Handles.MH_glGetTransformFeedbackVaryingNV.invokeExact(handles.PFN_glGetTransformFeedbackVaryingNV, program, index, location); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTransformFeedbackVaryingNV", e); }
    }

    public void TransformFeedbackStreamAttribsNV(@CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment attribs, @CType("GLsizei") int nbuffers, @CType("const GLint *") java.lang.foreign.MemorySegment bufstreams, @CType("GLenum") int bufferMode) {
        if (Unmarshal.isNullPointer(handles.PFN_glTransformFeedbackStreamAttribsNV)) throw new SymbolNotFoundError("Symbol not found: glTransformFeedbackStreamAttribsNV");
        try { Handles.MH_glTransformFeedbackStreamAttribsNV.invokeExact(handles.PFN_glTransformFeedbackStreamAttribsNV, count, attribs, nbuffers, bufstreams, bufferMode); }
        catch (Throwable e) { throw new RuntimeException("error in glTransformFeedbackStreamAttribsNV", e); }
    }

}
