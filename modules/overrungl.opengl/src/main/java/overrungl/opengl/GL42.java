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
package overrungl.opengl;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public class GL42 extends GL41 {
    public static final int GL_COPY_READ_BUFFER_BINDING = 0x8F36;
    public static final int GL_COPY_WRITE_BUFFER_BINDING = 0x8F37;
    public static final int GL_TRANSFORM_FEEDBACK_ACTIVE = 0x8E24;
    public static final int GL_TRANSFORM_FEEDBACK_PAUSED = 0x8E23;
    public static final int GL_UNPACK_COMPRESSED_BLOCK_WIDTH = 0x9127;
    public static final int GL_UNPACK_COMPRESSED_BLOCK_HEIGHT = 0x9128;
    public static final int GL_UNPACK_COMPRESSED_BLOCK_DEPTH = 0x9129;
    public static final int GL_UNPACK_COMPRESSED_BLOCK_SIZE = 0x912A;
    public static final int GL_PACK_COMPRESSED_BLOCK_WIDTH = 0x912B;
    public static final int GL_PACK_COMPRESSED_BLOCK_HEIGHT = 0x912C;
    public static final int GL_PACK_COMPRESSED_BLOCK_DEPTH = 0x912D;
    public static final int GL_PACK_COMPRESSED_BLOCK_SIZE = 0x912E;
    public static final int GL_NUM_SAMPLE_COUNTS = 0x9380;
    public static final int GL_MIN_MAP_BUFFER_ALIGNMENT = 0x90BC;
    public static final int GL_ATOMIC_COUNTER_BUFFER = 0x92C0;
    public static final int GL_ATOMIC_COUNTER_BUFFER_BINDING = 0x92C1;
    public static final int GL_ATOMIC_COUNTER_BUFFER_START = 0x92C2;
    public static final int GL_ATOMIC_COUNTER_BUFFER_SIZE = 0x92C3;
    public static final int GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE = 0x92C4;
    public static final int GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS = 0x92C5;
    public static final int GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES = 0x92C6;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER = 0x92C7;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER = 0x92C8;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x92C9;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER = 0x92CA;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER = 0x92CB;
    public static final int GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS = 0x92CC;
    public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS = 0x92CD;
    public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = 0x92CE;
    public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS = 0x92CF;
    public static final int GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS = 0x92D0;
    public static final int GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS = 0x92D1;
    public static final int GL_MAX_VERTEX_ATOMIC_COUNTERS = 0x92D2;
    public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS = 0x92D3;
    public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS = 0x92D4;
    public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTERS = 0x92D5;
    public static final int GL_MAX_FRAGMENT_ATOMIC_COUNTERS = 0x92D6;
    public static final int GL_MAX_COMBINED_ATOMIC_COUNTERS = 0x92D7;
    public static final int GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE = 0x92D8;
    public static final int GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS = 0x92DC;
    public static final int GL_ACTIVE_ATOMIC_COUNTER_BUFFERS = 0x92D9;
    public static final int GL_UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX = 0x92DA;
    public static final int GL_UNSIGNED_INT_ATOMIC_COUNTER = 0x92DB;
    public static final int GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT = 0x00000001;
    public static final int GL_ELEMENT_ARRAY_BARRIER_BIT = 0x00000002;
    public static final int GL_UNIFORM_BARRIER_BIT = 0x00000004;
    public static final int GL_TEXTURE_FETCH_BARRIER_BIT = 0x00000008;
    public static final int GL_SHADER_IMAGE_ACCESS_BARRIER_BIT = 0x00000020;
    public static final int GL_COMMAND_BARRIER_BIT = 0x00000040;
    public static final int GL_PIXEL_BUFFER_BARRIER_BIT = 0x00000080;
    public static final int GL_TEXTURE_UPDATE_BARRIER_BIT = 0x00000100;
    public static final int GL_BUFFER_UPDATE_BARRIER_BIT = 0x00000200;
    public static final int GL_FRAMEBUFFER_BARRIER_BIT = 0x00000400;
    public static final int GL_TRANSFORM_FEEDBACK_BARRIER_BIT = 0x00000800;
    public static final int GL_ATOMIC_COUNTER_BARRIER_BIT = 0x00001000;
    public static final int GL_ALL_BARRIER_BITS = 0xFFFFFFFF;
    public static final int GL_MAX_IMAGE_UNITS = 0x8F38;
    public static final int GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS = 0x8F39;
    public static final int GL_IMAGE_BINDING_NAME = 0x8F3A;
    public static final int GL_IMAGE_BINDING_LEVEL = 0x8F3B;
    public static final int GL_IMAGE_BINDING_LAYERED = 0x8F3C;
    public static final int GL_IMAGE_BINDING_LAYER = 0x8F3D;
    public static final int GL_IMAGE_BINDING_ACCESS = 0x8F3E;
    public static final int GL_IMAGE_1D = 0x904C;
    public static final int GL_IMAGE_2D = 0x904D;
    public static final int GL_IMAGE_3D = 0x904E;
    public static final int GL_IMAGE_2D_RECT = 0x904F;
    public static final int GL_IMAGE_CUBE = 0x9050;
    public static final int GL_IMAGE_BUFFER = 0x9051;
    public static final int GL_IMAGE_1D_ARRAY = 0x9052;
    public static final int GL_IMAGE_2D_ARRAY = 0x9053;
    public static final int GL_IMAGE_CUBE_MAP_ARRAY = 0x9054;
    public static final int GL_IMAGE_2D_MULTISAMPLE = 0x9055;
    public static final int GL_IMAGE_2D_MULTISAMPLE_ARRAY = 0x9056;
    public static final int GL_INT_IMAGE_1D = 0x9057;
    public static final int GL_INT_IMAGE_2D = 0x9058;
    public static final int GL_INT_IMAGE_3D = 0x9059;
    public static final int GL_INT_IMAGE_2D_RECT = 0x905A;
    public static final int GL_INT_IMAGE_CUBE = 0x905B;
    public static final int GL_INT_IMAGE_BUFFER = 0x905C;
    public static final int GL_INT_IMAGE_1D_ARRAY = 0x905D;
    public static final int GL_INT_IMAGE_2D_ARRAY = 0x905E;
    public static final int GL_INT_IMAGE_CUBE_MAP_ARRAY = 0x905F;
    public static final int GL_INT_IMAGE_2D_MULTISAMPLE = 0x9060;
    public static final int GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 0x9061;
    public static final int GL_UNSIGNED_INT_IMAGE_1D = 0x9062;
    public static final int GL_UNSIGNED_INT_IMAGE_2D = 0x9063;
    public static final int GL_UNSIGNED_INT_IMAGE_3D = 0x9064;
    public static final int GL_UNSIGNED_INT_IMAGE_2D_RECT = 0x9065;
    public static final int GL_UNSIGNED_INT_IMAGE_CUBE = 0x9066;
    public static final int GL_UNSIGNED_INT_IMAGE_BUFFER = 0x9067;
    public static final int GL_UNSIGNED_INT_IMAGE_1D_ARRAY = 0x9068;
    public static final int GL_UNSIGNED_INT_IMAGE_2D_ARRAY = 0x9069;
    public static final int GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY = 0x906A;
    public static final int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE = 0x906B;
    public static final int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 0x906C;
    public static final int GL_MAX_IMAGE_SAMPLES = 0x906D;
    public static final int GL_IMAGE_BINDING_FORMAT = 0x906E;
    public static final int GL_IMAGE_FORMAT_COMPATIBILITY_TYPE = 0x90C7;
    public static final int GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE = 0x90C8;
    public static final int GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS = 0x90C9;
    public static final int GL_MAX_VERTEX_IMAGE_UNIFORMS = 0x90CA;
    public static final int GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS = 0x90CB;
    public static final int GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS = 0x90CC;
    public static final int GL_MAX_GEOMETRY_IMAGE_UNIFORMS = 0x90CD;
    public static final int GL_MAX_FRAGMENT_IMAGE_UNIFORMS = 0x90CE;
    public static final int GL_MAX_COMBINED_IMAGE_UNIFORMS = 0x90CF;
    public static final int GL_COMPRESSED_RGBA_BPTC_UNORM = 0x8E8C;
    public static final int GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM = 0x8E8D;
    public static final int GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT = 0x8E8E;
    public static final int GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT = 0x8E8F;
    public static final int GL_TEXTURE_IMMUTABLE_FORMAT = 0x912F;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawArraysInstancedBaseInstance = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawElementsInstancedBaseInstance = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawElementsInstancedBaseVertexBaseInstance = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetInternalformativ = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveAtomicCounterBufferiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBindImageTexture = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMemoryBarrier = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexStorage1D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexStorage2D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexStorage3D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawTransformFeedbackInstanced = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawTransformFeedbackStreamInstanced = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glDrawArraysInstancedBaseInstance;
        public final MemorySegment PFN_glDrawElementsInstancedBaseInstance;
        public final MemorySegment PFN_glDrawElementsInstancedBaseVertexBaseInstance;
        public final MemorySegment PFN_glGetInternalformativ;
        public final MemorySegment PFN_glGetActiveAtomicCounterBufferiv;
        public final MemorySegment PFN_glBindImageTexture;
        public final MemorySegment PFN_glMemoryBarrier;
        public final MemorySegment PFN_glTexStorage1D;
        public final MemorySegment PFN_glTexStorage2D;
        public final MemorySegment PFN_glTexStorage3D;
        public final MemorySegment PFN_glDrawTransformFeedbackInstanced;
        public final MemorySegment PFN_glDrawTransformFeedbackStreamInstanced;
        private Handles(GLLoadFunc func) {
            PFN_glDrawArraysInstancedBaseInstance = func.invoke("glDrawArraysInstancedBaseInstance", "glDrawArraysInstancedBaseInstanceEXT");
            PFN_glDrawElementsInstancedBaseInstance = func.invoke("glDrawElementsInstancedBaseInstance", "glDrawElementsInstancedBaseInstanceEXT");
            PFN_glDrawElementsInstancedBaseVertexBaseInstance = func.invoke("glDrawElementsInstancedBaseVertexBaseInstance", "glDrawElementsInstancedBaseVertexBaseInstanceEXT");
            PFN_glGetInternalformativ = func.invoke("glGetInternalformativ");
            PFN_glGetActiveAtomicCounterBufferiv = func.invoke("glGetActiveAtomicCounterBufferiv");
            PFN_glBindImageTexture = func.invoke("glBindImageTexture");
            PFN_glMemoryBarrier = func.invoke("glMemoryBarrier", "glMemoryBarrierEXT");
            PFN_glTexStorage1D = func.invoke("glTexStorage1D", "glTexStorage1DEXT");
            PFN_glTexStorage2D = func.invoke("glTexStorage2D", "glTexStorage2DEXT");
            PFN_glTexStorage3D = func.invoke("glTexStorage3D", "glTexStorage3DEXT");
            PFN_glDrawTransformFeedbackInstanced = func.invoke("glDrawTransformFeedbackInstanced", "glDrawTransformFeedbackInstancedEXT");
            PFN_glDrawTransformFeedbackStreamInstanced = func.invoke("glDrawTransformFeedbackStreamInstanced");
        }
    }

    public GL42(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    /// ```
    /// void glDrawArraysInstancedBaseInstance(GLenum mode, GLint first, GLsizei count, GLsizei instancecount, GLuint baseinstance);
    /// ```
    public void DrawArraysInstancedBaseInstance(int mode, int first, int count, int instancecount, int baseinstance) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawArraysInstancedBaseInstance)) throw new SymbolNotFoundError("Symbol not found: glDrawArraysInstancedBaseInstance");
        try { Handles.MH_glDrawArraysInstancedBaseInstance.invokeExact(handles.PFN_glDrawArraysInstancedBaseInstance, mode, first, count, instancecount, baseinstance); }
        catch (Throwable e) { throw new RuntimeException("error in DrawArraysInstancedBaseInstance", e); }
    }

    /// ```
    /// void glDrawElementsInstancedBaseInstance(GLenum mode, GLsizei count, GLenum type, const void* indices, GLsizei instancecount, GLuint baseinstance);
    /// ```
    public void DrawElementsInstancedBaseInstance(int mode, int count, int type, MemorySegment indices, int instancecount, int baseinstance) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElementsInstancedBaseInstance)) throw new SymbolNotFoundError("Symbol not found: glDrawElementsInstancedBaseInstance");
        try { Handles.MH_glDrawElementsInstancedBaseInstance.invokeExact(handles.PFN_glDrawElementsInstancedBaseInstance, mode, count, type, indices, instancecount, baseinstance); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElementsInstancedBaseInstance", e); }
    }

    /// ```
    /// void glDrawElementsInstancedBaseVertexBaseInstance(GLenum mode, GLsizei count, GLenum type, const void* indices, GLsizei instancecount, GLint basevertex, GLuint baseinstance);
    /// ```
    public void DrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, MemorySegment indices, int instancecount, int basevertex, int baseinstance) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElementsInstancedBaseVertexBaseInstance)) throw new SymbolNotFoundError("Symbol not found: glDrawElementsInstancedBaseVertexBaseInstance");
        try { Handles.MH_glDrawElementsInstancedBaseVertexBaseInstance.invokeExact(handles.PFN_glDrawElementsInstancedBaseVertexBaseInstance, mode, count, type, indices, instancecount, basevertex, baseinstance); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElementsInstancedBaseVertexBaseInstance", e); }
    }

    /// ```
    /// void glGetInternalformativ(GLenum target, GLenum internalformat, GLenum pname, GLsizei count, GLint* params);
    /// ```
    public void GetInternalformativ(int target, int internalformat, int pname, int count, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetInternalformativ)) throw new SymbolNotFoundError("Symbol not found: glGetInternalformativ");
        try { Handles.MH_glGetInternalformativ.invokeExact(handles.PFN_glGetInternalformativ, target, internalformat, pname, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetInternalformativ", e); }
    }

    /// ```
    /// void glGetActiveAtomicCounterBufferiv(GLuint program, GLuint bufferIndex, GLenum pname, GLint* params);
    /// ```
    public void GetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetActiveAtomicCounterBufferiv)) throw new SymbolNotFoundError("Symbol not found: glGetActiveAtomicCounterBufferiv");
        try { Handles.MH_glGetActiveAtomicCounterBufferiv.invokeExact(handles.PFN_glGetActiveAtomicCounterBufferiv, program, bufferIndex, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetActiveAtomicCounterBufferiv", e); }
    }

    /// ```
    /// void glBindImageTexture(GLuint unit, GLuint texture, GLint level, GLboolean layered, GLint layer, GLenum access, GLenum format);
    /// ```
    public void BindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindImageTexture)) throw new SymbolNotFoundError("Symbol not found: glBindImageTexture");
        try { Handles.MH_glBindImageTexture.invokeExact(handles.PFN_glBindImageTexture, unit, texture, level, ((layered) ? (byte)1 : (byte)0), layer, access, format); }
        catch (Throwable e) { throw new RuntimeException("error in BindImageTexture", e); }
    }

    /// ```
    /// void glMemoryBarrier(GLbitfield barriers);
    /// ```
    public void MemoryBarrier(int barriers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMemoryBarrier)) throw new SymbolNotFoundError("Symbol not found: glMemoryBarrier");
        try { Handles.MH_glMemoryBarrier.invokeExact(handles.PFN_glMemoryBarrier, barriers); }
        catch (Throwable e) { throw new RuntimeException("error in MemoryBarrier", e); }
    }

    /// ```
    /// void glTexStorage1D(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width);
    /// ```
    public void TexStorage1D(int target, int levels, int internalformat, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorage1D)) throw new SymbolNotFoundError("Symbol not found: glTexStorage1D");
        try { Handles.MH_glTexStorage1D.invokeExact(handles.PFN_glTexStorage1D, target, levels, internalformat, width); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorage1D", e); }
    }

    /// ```
    /// void glTexStorage2D(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height);
    /// ```
    public void TexStorage2D(int target, int levels, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorage2D)) throw new SymbolNotFoundError("Symbol not found: glTexStorage2D");
        try { Handles.MH_glTexStorage2D.invokeExact(handles.PFN_glTexStorage2D, target, levels, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorage2D", e); }
    }

    /// ```
    /// void glTexStorage3D(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth);
    /// ```
    public void TexStorage3D(int target, int levels, int internalformat, int width, int height, int depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorage3D)) throw new SymbolNotFoundError("Symbol not found: glTexStorage3D");
        try { Handles.MH_glTexStorage3D.invokeExact(handles.PFN_glTexStorage3D, target, levels, internalformat, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorage3D", e); }
    }

    /// ```
    /// void glDrawTransformFeedbackInstanced(GLenum mode, GLuint id, GLsizei instancecount);
    /// ```
    public void DrawTransformFeedbackInstanced(int mode, int id, int instancecount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawTransformFeedbackInstanced)) throw new SymbolNotFoundError("Symbol not found: glDrawTransformFeedbackInstanced");
        try { Handles.MH_glDrawTransformFeedbackInstanced.invokeExact(handles.PFN_glDrawTransformFeedbackInstanced, mode, id, instancecount); }
        catch (Throwable e) { throw new RuntimeException("error in DrawTransformFeedbackInstanced", e); }
    }

    /// ```
    /// void glDrawTransformFeedbackStreamInstanced(GLenum mode, GLuint id, GLuint stream, GLsizei instancecount);
    /// ```
    public void DrawTransformFeedbackStreamInstanced(int mode, int id, int stream, int instancecount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawTransformFeedbackStreamInstanced)) throw new SymbolNotFoundError("Symbol not found: glDrawTransformFeedbackStreamInstanced");
        try { Handles.MH_glDrawTransformFeedbackStreamInstanced.invokeExact(handles.PFN_glDrawTransformFeedbackStreamInstanced, mode, id, stream, instancecount); }
        catch (Throwable e) { throw new RuntimeException("error in DrawTransformFeedbackStreamInstanced", e); }
    }

}
