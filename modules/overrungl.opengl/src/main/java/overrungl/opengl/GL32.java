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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public class GL32 extends GL31 {
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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glDrawElementsBaseVertex = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDrawRangeElementsBaseVertex = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDrawElementsInstancedBaseVertex = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiDrawElementsBaseVertex = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProvokingVertex = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFenceSync = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glIsSync = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDeleteSync = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glClientWaitSync = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glWaitSync = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glGetInteger64v = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetSynciv = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetInteger64i_v = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetBufferParameteri64v = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glFramebufferTexture = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTexImage2DMultisample = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glTexImage3DMultisample = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glGetMultisamplefv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glSampleMaski = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glDrawElementsBaseVertex,
            FD_glDrawRangeElementsBaseVertex,
            FD_glDrawElementsInstancedBaseVertex,
            FD_glMultiDrawElementsBaseVertex,
            FD_glProvokingVertex,
            FD_glFenceSync,
            FD_glIsSync,
            FD_glDeleteSync,
            FD_glClientWaitSync,
            FD_glWaitSync,
            FD_glGetInteger64v,
            FD_glGetSynciv,
            FD_glGetInteger64i_v,
            FD_glGetBufferParameteri64v,
            FD_glFramebufferTexture,
            FD_glTexImage2DMultisample,
            FD_glTexImage3DMultisample,
            FD_glGetMultisamplefv,
            FD_glSampleMaski
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glDrawElementsBaseVertex = RuntimeHelper.downcall(Descriptors.FD_glDrawElementsBaseVertex);
        public static final MethodHandle MH_glDrawRangeElementsBaseVertex = RuntimeHelper.downcall(Descriptors.FD_glDrawRangeElementsBaseVertex);
        public static final MethodHandle MH_glDrawElementsInstancedBaseVertex = RuntimeHelper.downcall(Descriptors.FD_glDrawElementsInstancedBaseVertex);
        public static final MethodHandle MH_glMultiDrawElementsBaseVertex = RuntimeHelper.downcall(Descriptors.FD_glMultiDrawElementsBaseVertex);
        public static final MethodHandle MH_glProvokingVertex = RuntimeHelper.downcall(Descriptors.FD_glProvokingVertex);
        public static final MethodHandle MH_glFenceSync = RuntimeHelper.downcall(Descriptors.FD_glFenceSync);
        public static final MethodHandle MH_glIsSync = RuntimeHelper.downcall(Descriptors.FD_glIsSync);
        public static final MethodHandle MH_glDeleteSync = RuntimeHelper.downcall(Descriptors.FD_glDeleteSync);
        public static final MethodHandle MH_glClientWaitSync = RuntimeHelper.downcall(Descriptors.FD_glClientWaitSync);
        public static final MethodHandle MH_glWaitSync = RuntimeHelper.downcall(Descriptors.FD_glWaitSync);
        public static final MethodHandle MH_glGetInteger64v = RuntimeHelper.downcall(Descriptors.FD_glGetInteger64v);
        public static final MethodHandle MH_glGetSynciv = RuntimeHelper.downcall(Descriptors.FD_glGetSynciv);
        public static final MethodHandle MH_glGetInteger64i_v = RuntimeHelper.downcall(Descriptors.FD_glGetInteger64i_v);
        public static final MethodHandle MH_glGetBufferParameteri64v = RuntimeHelper.downcall(Descriptors.FD_glGetBufferParameteri64v);
        public static final MethodHandle MH_glFramebufferTexture = RuntimeHelper.downcall(Descriptors.FD_glFramebufferTexture);
        public static final MethodHandle MH_glTexImage2DMultisample = RuntimeHelper.downcall(Descriptors.FD_glTexImage2DMultisample);
        public static final MethodHandle MH_glTexImage3DMultisample = RuntimeHelper.downcall(Descriptors.FD_glTexImage3DMultisample);
        public static final MethodHandle MH_glGetMultisamplefv = RuntimeHelper.downcall(Descriptors.FD_glGetMultisamplefv);
        public static final MethodHandle MH_glSampleMaski = RuntimeHelper.downcall(Descriptors.FD_glSampleMaski);
        public final MemorySegment PFN_glDrawElementsBaseVertex;
        public final MemorySegment PFN_glDrawRangeElementsBaseVertex;
        public final MemorySegment PFN_glDrawElementsInstancedBaseVertex;
        public final MemorySegment PFN_glMultiDrawElementsBaseVertex;
        public final MemorySegment PFN_glProvokingVertex;
        public final MemorySegment PFN_glFenceSync;
        public final MemorySegment PFN_glIsSync;
        public final MemorySegment PFN_glDeleteSync;
        public final MemorySegment PFN_glClientWaitSync;
        public final MemorySegment PFN_glWaitSync;
        public final MemorySegment PFN_glGetInteger64v;
        public final MemorySegment PFN_glGetSynciv;
        public final MemorySegment PFN_glGetInteger64i_v;
        public final MemorySegment PFN_glGetBufferParameteri64v;
        public final MemorySegment PFN_glFramebufferTexture;
        public final MemorySegment PFN_glTexImage2DMultisample;
        public final MemorySegment PFN_glTexImage3DMultisample;
        public final MemorySegment PFN_glGetMultisamplefv;
        public final MemorySegment PFN_glSampleMaski;
        private Handles(GLLoadFunc func) {
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
    }

    public GL32(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    public void DrawElementsBaseVertex(@CType("GLenum") int mode, @CType("GLsizei") int count, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indices, @CType("GLint") int basevertex) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawElementsBaseVertex)) throw new SymbolNotFoundError("Symbol not found: glDrawElementsBaseVertex");
        try { Handles.MH_glDrawElementsBaseVertex.invokeExact(handles.PFN_glDrawElementsBaseVertex, mode, count, type, indices, basevertex); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawElementsBaseVertex", e); }
    }

    public void DrawRangeElementsBaseVertex(@CType("GLenum") int mode, @CType("GLuint") int start, @CType("GLuint") int end, @CType("GLsizei") int count, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indices, @CType("GLint") int basevertex) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawRangeElementsBaseVertex)) throw new SymbolNotFoundError("Symbol not found: glDrawRangeElementsBaseVertex");
        try { Handles.MH_glDrawRangeElementsBaseVertex.invokeExact(handles.PFN_glDrawRangeElementsBaseVertex, mode, start, end, count, type, indices, basevertex); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawRangeElementsBaseVertex", e); }
    }

    public void DrawElementsInstancedBaseVertex(@CType("GLenum") int mode, @CType("GLsizei") int count, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indices, @CType("GLsizei") int instancecount, @CType("GLint") int basevertex) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawElementsInstancedBaseVertex)) throw new SymbolNotFoundError("Symbol not found: glDrawElementsInstancedBaseVertex");
        try { Handles.MH_glDrawElementsInstancedBaseVertex.invokeExact(handles.PFN_glDrawElementsInstancedBaseVertex, mode, count, type, indices, instancecount, basevertex); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawElementsInstancedBaseVertex", e); }
    }

    public void MultiDrawElementsBaseVertex(@CType("GLenum") int mode, @CType("const GLsizei *") java.lang.foreign.MemorySegment count, @CType("GLenum") int type, @CType("const void *const*") java.lang.foreign.MemorySegment indices, @CType("GLsizei") int drawcount, @CType("const GLint *") java.lang.foreign.MemorySegment basevertex) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiDrawElementsBaseVertex)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawElementsBaseVertex");
        try { Handles.MH_glMultiDrawElementsBaseVertex.invokeExact(handles.PFN_glMultiDrawElementsBaseVertex, mode, count, type, indices, drawcount, basevertex); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawElementsBaseVertex", e); }
    }

    public void ProvokingVertex(@CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(handles.PFN_glProvokingVertex)) throw new SymbolNotFoundError("Symbol not found: glProvokingVertex");
        try { Handles.MH_glProvokingVertex.invokeExact(handles.PFN_glProvokingVertex, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glProvokingVertex", e); }
    }

    public @CType("GLsync") java.lang.foreign.MemorySegment FenceSync(@CType("GLenum") int condition, @CType("GLbitfield") int flags) {
        if (Unmarshal.isNullPointer(handles.PFN_glFenceSync)) throw new SymbolNotFoundError("Symbol not found: glFenceSync");
        try { return (java.lang.foreign.MemorySegment) Handles.MH_glFenceSync.invokeExact(handles.PFN_glFenceSync, condition, flags); }
        catch (Throwable e) { throw new RuntimeException("error in glFenceSync", e); }
    }

    public @CType("GLboolean") boolean IsSync(@CType("GLsync") java.lang.foreign.MemorySegment sync) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsSync)) throw new SymbolNotFoundError("Symbol not found: glIsSync");
        try { return (boolean) Handles.MH_glIsSync.invokeExact(handles.PFN_glIsSync, sync); }
        catch (Throwable e) { throw new RuntimeException("error in glIsSync", e); }
    }

    public void DeleteSync(@CType("GLsync") java.lang.foreign.MemorySegment sync) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteSync)) throw new SymbolNotFoundError("Symbol not found: glDeleteSync");
        try { Handles.MH_glDeleteSync.invokeExact(handles.PFN_glDeleteSync, sync); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteSync", e); }
    }

    public @CType("GLenum") int ClientWaitSync(@CType("GLsync") java.lang.foreign.MemorySegment sync, @CType("GLbitfield") int flags, @CType("GLuint64") long timeout) {
        if (Unmarshal.isNullPointer(handles.PFN_glClientWaitSync)) throw new SymbolNotFoundError("Symbol not found: glClientWaitSync");
        try { return (int) Handles.MH_glClientWaitSync.invokeExact(handles.PFN_glClientWaitSync, sync, flags, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in glClientWaitSync", e); }
    }

    public void WaitSync(@CType("GLsync") java.lang.foreign.MemorySegment sync, @CType("GLbitfield") int flags, @CType("GLuint64") long timeout) {
        if (Unmarshal.isNullPointer(handles.PFN_glWaitSync)) throw new SymbolNotFoundError("Symbol not found: glWaitSync");
        try { Handles.MH_glWaitSync.invokeExact(handles.PFN_glWaitSync, sync, flags, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in glWaitSync", e); }
    }

    public void GetInteger64v(@CType("GLenum") int pname, @CType("GLint64 *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetInteger64v)) throw new SymbolNotFoundError("Symbol not found: glGetInteger64v");
        try { Handles.MH_glGetInteger64v.invokeExact(handles.PFN_glGetInteger64v, pname, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetInteger64v", e); }
    }

    public void GetSynciv(@CType("GLsync") java.lang.foreign.MemorySegment sync, @CType("GLenum") int pname, @CType("GLsizei") int count, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLint *") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetSynciv)) throw new SymbolNotFoundError("Symbol not found: glGetSynciv");
        try { Handles.MH_glGetSynciv.invokeExact(handles.PFN_glGetSynciv, sync, pname, count, length, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetSynciv", e); }
    }

    public void GetInteger64i_v(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLint64 *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetInteger64i_v)) throw new SymbolNotFoundError("Symbol not found: glGetInteger64i_v");
        try { Handles.MH_glGetInteger64i_v.invokeExact(handles.PFN_glGetInteger64i_v, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetInteger64i_v", e); }
    }

    public void GetBufferParameteri64v(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint64 *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetBufferParameteri64v)) throw new SymbolNotFoundError("Symbol not found: glGetBufferParameteri64v");
        try { Handles.MH_glGetBufferParameteri64v.invokeExact(handles.PFN_glGetBufferParameteri64v, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetBufferParameteri64v", e); }
    }

    public void FramebufferTexture(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level) {
        if (Unmarshal.isNullPointer(handles.PFN_glFramebufferTexture)) throw new SymbolNotFoundError("Symbol not found: glFramebufferTexture");
        try { Handles.MH_glFramebufferTexture.invokeExact(handles.PFN_glFramebufferTexture, target, attachment, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferTexture", e); }
    }

    public void TexImage2DMultisample(@CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLboolean") boolean fixedsamplelocations) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexImage2DMultisample)) throw new SymbolNotFoundError("Symbol not found: glTexImage2DMultisample");
        try { Handles.MH_glTexImage2DMultisample.invokeExact(handles.PFN_glTexImage2DMultisample, target, samples, internalformat, width, height, fixedsamplelocations); }
        catch (Throwable e) { throw new RuntimeException("error in glTexImage2DMultisample", e); }
    }

    public void TexImage3DMultisample(@CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean fixedsamplelocations) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexImage3DMultisample)) throw new SymbolNotFoundError("Symbol not found: glTexImage3DMultisample");
        try { Handles.MH_glTexImage3DMultisample.invokeExact(handles.PFN_glTexImage3DMultisample, target, samples, internalformat, width, height, depth, fixedsamplelocations); }
        catch (Throwable e) { throw new RuntimeException("error in glTexImage3DMultisample", e); }
    }

    public void GetMultisamplefv(@CType("GLenum") int pname, @CType("GLuint") int index, @CType("GLfloat *") java.lang.foreign.MemorySegment val) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMultisamplefv)) throw new SymbolNotFoundError("Symbol not found: glGetMultisamplefv");
        try { Handles.MH_glGetMultisamplefv.invokeExact(handles.PFN_glGetMultisamplefv, pname, index, val); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultisamplefv", e); }
    }

    public void SampleMaski(@CType("GLuint") int maskNumber, @CType("GLbitfield") int mask) {
        if (Unmarshal.isNullPointer(handles.PFN_glSampleMaski)) throw new SymbolNotFoundError("Symbol not found: glSampleMaski");
        try { Handles.MH_glSampleMaski.invokeExact(handles.PFN_glSampleMaski, maskNumber, mask); }
        catch (Throwable e) { throw new RuntimeException("error in glSampleMaski", e); }
    }

    // --- OverrunGL custom code ---
    public long GetInteger64i_v(@CType("GLenum") int target, @CType("GLuint") int index) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.longs(0); GetInteger64i_v(target, index, p); return p.get(ValueLayout.JAVA_LONG, 0); } }
    public long GetBufferParameteri64v(@CType("GLenum") int target, @CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.longs(0); GetBufferParameteri64v(target, pname, p); return p.get(ValueLayout.JAVA_LONG, 0); } }
}
