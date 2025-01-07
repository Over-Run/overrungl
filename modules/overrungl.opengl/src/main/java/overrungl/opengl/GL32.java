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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public sealed class GL32 extends GL31 permits GL33 {
    public static final int GL_CONTEXT_CORE_PROFILE_BIT = 0x00000001;
    public static final int GL_CONTEXT_COMPATIBILITY_PROFILE_BIT = 0x00000002;
    public static final int GL_LINES_ADJACENCY = 0x000A;
    public static final int GL_LINE_STRIP_ADJACENCY = 0x000B;
    public static final int GL_TRIANGLES_ADJACENCY = 0x000C;
    public static final int GL_TRIANGLE_STRIP_ADJACENCY = 0x000D;
    public static final int GL_PROGRAM_POINT_SIZE = 0x8642;
    public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS = 0x8C29;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED = 0x8DA7;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = 0x8DA8;
    public static final int GL_GEOMETRY_SHADER = 0x8DD9;
    public static final int GL_GEOMETRY_VERTICES_OUT = 0x8916;
    public static final int GL_GEOMETRY_INPUT_TYPE = 0x8917;
    public static final int GL_GEOMETRY_OUTPUT_TYPE = 0x8918;
    public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS = 0x8DDF;
    public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES = 0x8DE0;
    public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS = 0x8DE1;
    public static final int GL_MAX_VERTEX_OUTPUT_COMPONENTS = 0x9122;
    public static final int GL_MAX_GEOMETRY_INPUT_COMPONENTS = 0x9123;
    public static final int GL_MAX_GEOMETRY_OUTPUT_COMPONENTS = 0x9124;
    public static final int GL_MAX_FRAGMENT_INPUT_COMPONENTS = 0x9125;
    public static final int GL_CONTEXT_PROFILE_MASK = 0x9126;
    public static final int GL_DEPTH_CLAMP = 0x864F;
    public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 0x8E4C;
    public static final int GL_FIRST_VERTEX_CONVENTION = 0x8E4D;
    public static final int GL_LAST_VERTEX_CONVENTION = 0x8E4E;
    public static final int GL_PROVOKING_VERTEX = 0x8E4F;
    public static final int GL_TEXTURE_CUBE_MAP_SEAMLESS = 0x884F;
    public static final int GL_MAX_SERVER_WAIT_TIMEOUT = 0x9111;
    public static final int GL_OBJECT_TYPE = 0x9112;
    public static final int GL_SYNC_CONDITION = 0x9113;
    public static final int GL_SYNC_STATUS = 0x9114;
    public static final int GL_SYNC_FLAGS = 0x9115;
    public static final int GL_SYNC_FENCE = 0x9116;
    public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = 0x9117;
    public static final int GL_UNSIGNALED = 0x9118;
    public static final int GL_SIGNALED = 0x9119;
    public static final int GL_ALREADY_SIGNALED = 0x911A;
    public static final int GL_TIMEOUT_EXPIRED = 0x911B;
    public static final int GL_CONDITION_SATISFIED = 0x911C;
    public static final int GL_WAIT_FAILED = 0x911D;
    public static final long GL_TIMEOUT_IGNORED = 0xFFFFFFFFFFFFFFFFL;
    public static final int GL_SYNC_FLUSH_COMMANDS_BIT = 0x00000001;
    public static final int GL_SAMPLE_POSITION = 0x8E50;
    public static final int GL_SAMPLE_MASK = 0x8E51;
    public static final int GL_SAMPLE_MASK_VALUE = 0x8E52;
    public static final int GL_MAX_SAMPLE_MASK_WORDS = 0x8E59;
    public static final int GL_TEXTURE_2D_MULTISAMPLE = 0x9100;
    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE = 0x9101;
    public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;
    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9103;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE = 0x9104;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 0x9105;
    public static final int GL_TEXTURE_SAMPLES = 0x9106;
    public static final int GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = 0x9107;
    public static final int GL_SAMPLER_2D_MULTISAMPLE = 0x9108;
    public static final int GL_INT_SAMPLER_2D_MULTISAMPLE = 0x9109;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE = 0x910A;
    public static final int GL_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910B;
    public static final int GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910C;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910D;
    public static final int GL_MAX_COLOR_TEXTURE_SAMPLES = 0x910E;
    public static final int GL_MAX_DEPTH_TEXTURE_SAMPLES = 0x910F;
    public static final int GL_MAX_INTEGER_SAMPLES = 0x9110;
    public static final MethodHandle MH_glDrawElementsBaseVertex = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawElementsBaseVertex;
    public static final MethodHandle MH_glDrawRangeElementsBaseVertex = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawRangeElementsBaseVertex;
    public static final MethodHandle MH_glDrawElementsInstancedBaseVertex = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawElementsInstancedBaseVertex;
    public static final MethodHandle MH_glMultiDrawElementsBaseVertex = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiDrawElementsBaseVertex;
    public static final MethodHandle MH_glProvokingVertex = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProvokingVertex;
    public static final MethodHandle MH_glFenceSync = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFenceSync;
    public static final MethodHandle MH_glIsSync = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glIsSync;
    public static final MethodHandle MH_glDeleteSync = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteSync;
    public static final MethodHandle MH_glClientWaitSync = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glClientWaitSync;
    public static final MethodHandle MH_glWaitSync = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glWaitSync;
    public static final MethodHandle MH_glGetInteger64v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetInteger64v;
    public static final MethodHandle MH_glGetSynciv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetSynciv;
    public static final MethodHandle MH_glGetInteger64i_v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetInteger64i_v;
    public static final MethodHandle MH_glGetBufferParameteri64v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetBufferParameteri64v;
    public static final MethodHandle MH_glFramebufferTexture = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFramebufferTexture;
    public static final MethodHandle MH_glTexImage2DMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glTexImage2DMultisample;
    public static final MethodHandle MH_glTexImage3DMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glTexImage3DMultisample;
    public static final MethodHandle MH_glGetMultisamplefv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMultisamplefv;
    public static final MethodHandle MH_glSampleMaski = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glSampleMaski;

    public GL32(GLLoadFunc func) {
        super(func);
        PFN_glDrawElementsBaseVertex = func.invoke("glDrawElementsBaseVertex", "glDrawElementsBaseVertexEXT", "glDrawElementsBaseVertexOES");
        PFN_glDrawRangeElementsBaseVertex = func.invoke("glDrawRangeElementsBaseVertex", "glDrawRangeElementsBaseVertexEXT", "glDrawRangeElementsBaseVertexOES");
        PFN_glDrawElementsInstancedBaseVertex = func.invoke("glDrawElementsInstancedBaseVertex", "glDrawElementsInstancedBaseVertexEXT", "glDrawElementsInstancedBaseVertexOES");
        PFN_glMultiDrawElementsBaseVertex = func.invoke("glMultiDrawElementsBaseVertex", "glMultiDrawElementsBaseVertexEXT");
        PFN_glProvokingVertex = func.invoke("glProvokingVertex", "glProvokingVertexEXT");
        PFN_glFenceSync = func.invoke("glFenceSync", "glFenceSyncAPPLE");
        PFN_glIsSync = func.invoke("glIsSync", "glIsSyncAPPLE");
        PFN_glDeleteSync = func.invoke("glDeleteSync", "glDeleteSyncAPPLE");
        PFN_glClientWaitSync = func.invoke("glClientWaitSync", "glClientWaitSyncAPPLE");
        PFN_glWaitSync = func.invoke("glWaitSync", "glWaitSyncAPPLE");
        PFN_glGetInteger64v = func.invoke("glGetInteger64v", "glGetInteger64vAPPLE", "glGetInteger64vEXT");
        PFN_glGetSynciv = func.invoke("glGetSynciv", "glGetSyncivAPPLE");
        PFN_glGetInteger64i_v = func.invoke("glGetInteger64i_v");
        PFN_glGetBufferParameteri64v = func.invoke("glGetBufferParameteri64v");
        PFN_glFramebufferTexture = func.invoke("glFramebufferTexture", "glFramebufferTextureARB", "glFramebufferTextureEXT", "glFramebufferTextureOES");
        PFN_glTexImage2DMultisample = func.invoke("glTexImage2DMultisample");
        PFN_glTexImage3DMultisample = func.invoke("glTexImage3DMultisample");
        PFN_glGetMultisamplefv = func.invoke("glGetMultisamplefv", "glGetMultisamplefvNV");
        PFN_glSampleMaski = func.invoke("glSampleMaski");
    }

    public void DrawElementsBaseVertex(@CType("GLenum") int mode, @CType("GLsizei") int count, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indices, @CType("GLint") int basevertex) {
        if (!Unmarshal.isNullPointer(PFN_glDrawElementsBaseVertex)) { try {
            MH_glDrawElementsBaseVertex.invokeExact(PFN_glDrawElementsBaseVertex, mode, count, type, indices, basevertex);
        } catch (Throwable e) { throw new RuntimeException("error in glDrawElementsBaseVertex", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDrawElementsBaseVertex"); }
    }

    public void DrawRangeElementsBaseVertex(@CType("GLenum") int mode, @CType("GLuint") int start, @CType("GLuint") int end, @CType("GLsizei") int count, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indices, @CType("GLint") int basevertex) {
        if (!Unmarshal.isNullPointer(PFN_glDrawRangeElementsBaseVertex)) { try {
            MH_glDrawRangeElementsBaseVertex.invokeExact(PFN_glDrawRangeElementsBaseVertex, mode, start, end, count, type, indices, basevertex);
        } catch (Throwable e) { throw new RuntimeException("error in glDrawRangeElementsBaseVertex", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDrawRangeElementsBaseVertex"); }
    }

    public void DrawElementsInstancedBaseVertex(@CType("GLenum") int mode, @CType("GLsizei") int count, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indices, @CType("GLsizei") int instancecount, @CType("GLint") int basevertex) {
        if (!Unmarshal.isNullPointer(PFN_glDrawElementsInstancedBaseVertex)) { try {
            MH_glDrawElementsInstancedBaseVertex.invokeExact(PFN_glDrawElementsInstancedBaseVertex, mode, count, type, indices, instancecount, basevertex);
        } catch (Throwable e) { throw new RuntimeException("error in glDrawElementsInstancedBaseVertex", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDrawElementsInstancedBaseVertex"); }
    }

    public void MultiDrawElementsBaseVertex(@CType("GLenum") int mode, @CType("const GLsizei *") java.lang.foreign.MemorySegment count, @CType("GLenum") int type, @CType("const void *const*") java.lang.foreign.MemorySegment indices, @CType("GLsizei") int drawcount, @CType("const GLint *") java.lang.foreign.MemorySegment basevertex) {
        if (!Unmarshal.isNullPointer(PFN_glMultiDrawElementsBaseVertex)) { try {
            MH_glMultiDrawElementsBaseVertex.invokeExact(PFN_glMultiDrawElementsBaseVertex, mode, count, type, indices, drawcount, basevertex);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiDrawElementsBaseVertex", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiDrawElementsBaseVertex"); }
    }

    public void ProvokingVertex(@CType("GLenum") int mode) {
        if (!Unmarshal.isNullPointer(PFN_glProvokingVertex)) { try {
            MH_glProvokingVertex.invokeExact(PFN_glProvokingVertex, mode);
        } catch (Throwable e) { throw new RuntimeException("error in glProvokingVertex", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProvokingVertex"); }
    }

    public @CType("GLsync") java.lang.foreign.MemorySegment FenceSync(@CType("GLenum") int condition, @CType("GLbitfield") int flags) {
        if (!Unmarshal.isNullPointer(PFN_glFenceSync)) { try {
            return (java.lang.foreign.MemorySegment) MH_glFenceSync.invokeExact(PFN_glFenceSync, condition, flags);
        } catch (Throwable e) { throw new RuntimeException("error in glFenceSync", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFenceSync"); }
    }

    public @CType("GLboolean") boolean IsSync(@CType("GLsync") java.lang.foreign.MemorySegment sync) {
        if (!Unmarshal.isNullPointer(PFN_glIsSync)) { try {
            return (boolean) MH_glIsSync.invokeExact(PFN_glIsSync, sync);
        } catch (Throwable e) { throw new RuntimeException("error in glIsSync", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glIsSync"); }
    }

    public void DeleteSync(@CType("GLsync") java.lang.foreign.MemorySegment sync) {
        if (!Unmarshal.isNullPointer(PFN_glDeleteSync)) { try {
            MH_glDeleteSync.invokeExact(PFN_glDeleteSync, sync);
        } catch (Throwable e) { throw new RuntimeException("error in glDeleteSync", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDeleteSync"); }
    }

    public @CType("GLenum") int ClientWaitSync(@CType("GLsync") java.lang.foreign.MemorySegment sync, @CType("GLbitfield") int flags, @CType("GLuint64") long timeout) {
        if (!Unmarshal.isNullPointer(PFN_glClientWaitSync)) { try {
            return (int) MH_glClientWaitSync.invokeExact(PFN_glClientWaitSync, sync, flags, timeout);
        } catch (Throwable e) { throw new RuntimeException("error in glClientWaitSync", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glClientWaitSync"); }
    }

    public void WaitSync(@CType("GLsync") java.lang.foreign.MemorySegment sync, @CType("GLbitfield") int flags, @CType("GLuint64") long timeout) {
        if (!Unmarshal.isNullPointer(PFN_glWaitSync)) { try {
            MH_glWaitSync.invokeExact(PFN_glWaitSync, sync, flags, timeout);
        } catch (Throwable e) { throw new RuntimeException("error in glWaitSync", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glWaitSync"); }
    }

    public void GetInteger64v(@CType("GLenum") int pname, @CType("GLint64 *") java.lang.foreign.MemorySegment data) {
        if (!Unmarshal.isNullPointer(PFN_glGetInteger64v)) { try {
            MH_glGetInteger64v.invokeExact(PFN_glGetInteger64v, pname, data);
        } catch (Throwable e) { throw new RuntimeException("error in glGetInteger64v", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetInteger64v"); }
    }

    public void GetSynciv(@CType("GLsync") java.lang.foreign.MemorySegment sync, @CType("GLenum") int pname, @CType("GLsizei") int count, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLint *") java.lang.foreign.MemorySegment values) {
        if (!Unmarshal.isNullPointer(PFN_glGetSynciv)) { try {
            MH_glGetSynciv.invokeExact(PFN_glGetSynciv, sync, pname, count, length, values);
        } catch (Throwable e) { throw new RuntimeException("error in glGetSynciv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetSynciv"); }
    }

    public void GetInteger64i_v(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLint64 *") java.lang.foreign.MemorySegment data) {
        if (!Unmarshal.isNullPointer(PFN_glGetInteger64i_v)) { try {
            MH_glGetInteger64i_v.invokeExact(PFN_glGetInteger64i_v, target, index, data);
        } catch (Throwable e) { throw new RuntimeException("error in glGetInteger64i_v", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetInteger64i_v"); }
    }

    public void GetBufferParameteri64v(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint64 *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetBufferParameteri64v)) { try {
            MH_glGetBufferParameteri64v.invokeExact(PFN_glGetBufferParameteri64v, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetBufferParameteri64v", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetBufferParameteri64v"); }
    }

    public void FramebufferTexture(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level) {
        if (!Unmarshal.isNullPointer(PFN_glFramebufferTexture)) { try {
            MH_glFramebufferTexture.invokeExact(PFN_glFramebufferTexture, target, attachment, texture, level);
        } catch (Throwable e) { throw new RuntimeException("error in glFramebufferTexture", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFramebufferTexture"); }
    }

    public void TexImage2DMultisample(@CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLboolean") boolean fixedsamplelocations) {
        if (!Unmarshal.isNullPointer(PFN_glTexImage2DMultisample)) { try {
            MH_glTexImage2DMultisample.invokeExact(PFN_glTexImage2DMultisample, target, samples, internalformat, width, height, fixedsamplelocations);
        } catch (Throwable e) { throw new RuntimeException("error in glTexImage2DMultisample", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexImage2DMultisample"); }
    }

    public void TexImage3DMultisample(@CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean fixedsamplelocations) {
        if (!Unmarshal.isNullPointer(PFN_glTexImage3DMultisample)) { try {
            MH_glTexImage3DMultisample.invokeExact(PFN_glTexImage3DMultisample, target, samples, internalformat, width, height, depth, fixedsamplelocations);
        } catch (Throwable e) { throw new RuntimeException("error in glTexImage3DMultisample", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexImage3DMultisample"); }
    }

    public void GetMultisamplefv(@CType("GLenum") int pname, @CType("GLuint") int index, @CType("GLfloat *") java.lang.foreign.MemorySegment val) {
        if (!Unmarshal.isNullPointer(PFN_glGetMultisamplefv)) { try {
            MH_glGetMultisamplefv.invokeExact(PFN_glGetMultisamplefv, pname, index, val);
        } catch (Throwable e) { throw new RuntimeException("error in glGetMultisamplefv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetMultisamplefv"); }
    }

    public void SampleMaski(@CType("GLuint") int maskNumber, @CType("GLbitfield") int mask) {
        if (!Unmarshal.isNullPointer(PFN_glSampleMaski)) { try {
            MH_glSampleMaski.invokeExact(PFN_glSampleMaski, maskNumber, mask);
        } catch (Throwable e) { throw new RuntimeException("error in glSampleMaski", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSampleMaski"); }
    }

    // --- OverrunGL custom code ---
    public long GetInteger64i_v(@CType("GLenum") int target, @CType("GLuint") int index) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.longs(0); GetInteger64i_v(target, index, p); return p.get(ValueLayout.JAVA_LONG, 0); } }
    public long GetBufferParameteri64v(@CType("GLenum") int target, @CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.longs(0); GetBufferParameteri64v(target, pname, p); return p.get(ValueLayout.JAVA_LONG, 0); } }
}
