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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;

public class GL33 extends GL32 {
    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 0x88FE;
    public static final int GL_SRC1_COLOR = 0x88F9;
    public static final int GL_ONE_MINUS_SRC1_COLOR = 0x88FA;
    public static final int GL_ONE_MINUS_SRC1_ALPHA = 0x88FB;
    public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 0x88FC;
    public static final int GL_ANY_SAMPLES_PASSED = 0x8C2F;
    public static final int GL_SAMPLER_BINDING = 0x8919;
    public static final int GL_RGB10_A2UI = 0x906F;
    public static final int GL_TEXTURE_SWIZZLE_R = 0x8E42;
    public static final int GL_TEXTURE_SWIZZLE_G = 0x8E43;
    public static final int GL_TEXTURE_SWIZZLE_B = 0x8E44;
    public static final int GL_TEXTURE_SWIZZLE_A = 0x8E45;
    public static final int GL_TEXTURE_SWIZZLE_RGBA = 0x8E46;
    public static final int GL_TIME_ELAPSED = 0x88BF;
    public static final int GL_TIMESTAMP = 0x8E28;
    public static final int GL_INT_2_10_10_10_REV = 0x8D9F;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBindFragDataLocationIndexed = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetFragDataIndex = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenSamplers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteSamplers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsSampler = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindSampler = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glSamplerParameteri = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glSamplerParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSamplerParameterf = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glSamplerParameterfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSamplerParameterIiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSamplerParameterIuiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetSamplerParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetSamplerParameterIiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetSamplerParameterfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetSamplerParameterIuiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glQueryCounter = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetQueryObjecti64v = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetQueryObjectui64v = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribDivisor = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribP1ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribP1uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribP2ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribP2uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribP3ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribP3uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribP4ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribP4uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glBindFragDataLocationIndexed;
        public final MemorySegment PFN_glGetFragDataIndex;
        public final MemorySegment PFN_glGenSamplers;
        public final MemorySegment PFN_glDeleteSamplers;
        public final MemorySegment PFN_glIsSampler;
        public final MemorySegment PFN_glBindSampler;
        public final MemorySegment PFN_glSamplerParameteri;
        public final MemorySegment PFN_glSamplerParameteriv;
        public final MemorySegment PFN_glSamplerParameterf;
        public final MemorySegment PFN_glSamplerParameterfv;
        public final MemorySegment PFN_glSamplerParameterIiv;
        public final MemorySegment PFN_glSamplerParameterIuiv;
        public final MemorySegment PFN_glGetSamplerParameteriv;
        public final MemorySegment PFN_glGetSamplerParameterIiv;
        public final MemorySegment PFN_glGetSamplerParameterfv;
        public final MemorySegment PFN_glGetSamplerParameterIuiv;
        public final MemorySegment PFN_glQueryCounter;
        public final MemorySegment PFN_glGetQueryObjecti64v;
        public final MemorySegment PFN_glGetQueryObjectui64v;
        public final MemorySegment PFN_glVertexAttribDivisor;
        public final MemorySegment PFN_glVertexAttribP1ui;
        public final MemorySegment PFN_glVertexAttribP1uiv;
        public final MemorySegment PFN_glVertexAttribP2ui;
        public final MemorySegment PFN_glVertexAttribP2uiv;
        public final MemorySegment PFN_glVertexAttribP3ui;
        public final MemorySegment PFN_glVertexAttribP3uiv;
        public final MemorySegment PFN_glVertexAttribP4ui;
        public final MemorySegment PFN_glVertexAttribP4uiv;
        private Handles(GLLoadFunc func) {
            PFN_glBindFragDataLocationIndexed = func.invoke("glBindFragDataLocationIndexed", "glBindFragDataLocationIndexedEXT");
            PFN_glGetFragDataIndex = func.invoke("glGetFragDataIndex", "glGetFragDataIndexEXT");
            PFN_glGenSamplers = func.invoke("glGenSamplers");
            PFN_glDeleteSamplers = func.invoke("glDeleteSamplers");
            PFN_glIsSampler = func.invoke("glIsSampler");
            PFN_glBindSampler = func.invoke("glBindSampler");
            PFN_glSamplerParameteri = func.invoke("glSamplerParameteri");
            PFN_glSamplerParameteriv = func.invoke("glSamplerParameteriv");
            PFN_glSamplerParameterf = func.invoke("glSamplerParameterf");
            PFN_glSamplerParameterfv = func.invoke("glSamplerParameterfv");
            PFN_glSamplerParameterIiv = func.invoke("glSamplerParameterIiv", "glSamplerParameterIivEXT", "glSamplerParameterIivOES");
            PFN_glSamplerParameterIuiv = func.invoke("glSamplerParameterIuiv", "glSamplerParameterIuivEXT", "glSamplerParameterIuivOES");
            PFN_glGetSamplerParameteriv = func.invoke("glGetSamplerParameteriv");
            PFN_glGetSamplerParameterIiv = func.invoke("glGetSamplerParameterIiv", "glGetSamplerParameterIivEXT", "glGetSamplerParameterIivOES");
            PFN_glGetSamplerParameterfv = func.invoke("glGetSamplerParameterfv");
            PFN_glGetSamplerParameterIuiv = func.invoke("glGetSamplerParameterIuiv", "glGetSamplerParameterIuivEXT", "glGetSamplerParameterIuivOES");
            PFN_glQueryCounter = func.invoke("glQueryCounter", "glQueryCounterEXT");
            PFN_glGetQueryObjecti64v = func.invoke("glGetQueryObjecti64v", "glGetQueryObjecti64vEXT");
            PFN_glGetQueryObjectui64v = func.invoke("glGetQueryObjectui64v", "glGetQueryObjectui64vEXT");
            PFN_glVertexAttribDivisor = func.invoke("glVertexAttribDivisor", "glVertexAttribDivisorANGLE", "glVertexAttribDivisorARB", "glVertexAttribDivisorEXT", "glVertexAttribDivisorNV");
            PFN_glVertexAttribP1ui = func.invoke("glVertexAttribP1ui");
            PFN_glVertexAttribP1uiv = func.invoke("glVertexAttribP1uiv");
            PFN_glVertexAttribP2ui = func.invoke("glVertexAttribP2ui");
            PFN_glVertexAttribP2uiv = func.invoke("glVertexAttribP2uiv");
            PFN_glVertexAttribP3ui = func.invoke("glVertexAttribP3ui");
            PFN_glVertexAttribP3uiv = func.invoke("glVertexAttribP3uiv");
            PFN_glVertexAttribP4ui = func.invoke("glVertexAttribP4ui");
            PFN_glVertexAttribP4uiv = func.invoke("glVertexAttribP4uiv");
        }
    }

    public GL33(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBindFragDataLocationIndexed((unsigned int) GLuint program, (unsigned int) GLuint colorNumber, (unsigned int) GLuint index, const GLchar* name);
    /// ```
    public void BindFragDataLocationIndexed(int program, int colorNumber, int index, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindFragDataLocationIndexed)) throw new GLSymbolNotFoundError("Symbol not found: glBindFragDataLocationIndexed");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindFragDataLocationIndexed", program, colorNumber, index, name); }
        Handles.MH_glBindFragDataLocationIndexed.invokeExact(handles.PFN_glBindFragDataLocationIndexed, program, colorNumber, index, name); }
        catch (Throwable e) { throw new RuntimeException("error in BindFragDataLocationIndexed", e); }
    }

    /// ```
    /// (int) GLint glGetFragDataIndex((unsigned int) GLuint program, const GLchar* name);
    /// ```
    public int GetFragDataIndex(int program, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFragDataIndex)) throw new GLSymbolNotFoundError("Symbol not found: glGetFragDataIndex");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetFragDataIndex", program, name); }
        return (int) Handles.MH_glGetFragDataIndex.invokeExact(handles.PFN_glGetFragDataIndex, program, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetFragDataIndex", e); }
    }

    /// ```
    /// void glGenSamplers((int) GLsizei count, GLuint* samplers);
    /// ```
    public void GenSamplers(int count, MemorySegment samplers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenSamplers)) throw new GLSymbolNotFoundError("Symbol not found: glGenSamplers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenSamplers", count, samplers); }
        Handles.MH_glGenSamplers.invokeExact(handles.PFN_glGenSamplers, count, samplers); }
        catch (Throwable e) { throw new RuntimeException("error in GenSamplers", e); }
    }

    /// ```
    /// void glDeleteSamplers((int) GLsizei count, const GLuint* samplers);
    /// ```
    public void DeleteSamplers(int count, MemorySegment samplers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteSamplers)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteSamplers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteSamplers", count, samplers); }
        Handles.MH_glDeleteSamplers.invokeExact(handles.PFN_glDeleteSamplers, count, samplers); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteSamplers", e); }
    }

    /// ```
    /// GLboolean glIsSampler((unsigned int) GLuint sampler);
    /// ```
    public boolean IsSampler(int sampler) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsSampler)) throw new GLSymbolNotFoundError("Symbol not found: glIsSampler");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsSampler", sampler); }
        return (((byte) Handles.MH_glIsSampler.invokeExact(handles.PFN_glIsSampler, sampler)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsSampler", e); }
    }

    /// ```
    /// void glBindSampler((unsigned int) GLuint unit, (unsigned int) GLuint sampler);
    /// ```
    public void BindSampler(int unit, int sampler) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindSampler)) throw new GLSymbolNotFoundError("Symbol not found: glBindSampler");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindSampler", unit, sampler); }
        Handles.MH_glBindSampler.invokeExact(handles.PFN_glBindSampler, unit, sampler); }
        catch (Throwable e) { throw new RuntimeException("error in BindSampler", e); }
    }

    /// ```
    /// void glSamplerParameteri((unsigned int) GLuint sampler, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void SamplerParameteri(int sampler, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplerParameteri)) throw new GLSymbolNotFoundError("Symbol not found: glSamplerParameteri");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSamplerParameteri", sampler, pname, param); }
        Handles.MH_glSamplerParameteri.invokeExact(handles.PFN_glSamplerParameteri, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SamplerParameteri", e); }
    }

    /// ```
    /// void glSamplerParameteriv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, const GLint* param);
    /// ```
    public void SamplerParameteriv(int sampler, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplerParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glSamplerParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSamplerParameteriv", sampler, pname, param); }
        Handles.MH_glSamplerParameteriv.invokeExact(handles.PFN_glSamplerParameteriv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SamplerParameteriv", e); }
    }

    /// ```
    /// void glSamplerParameterf((unsigned int) GLuint sampler, (unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void SamplerParameterf(int sampler, int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplerParameterf)) throw new GLSymbolNotFoundError("Symbol not found: glSamplerParameterf");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSamplerParameterf", sampler, pname, param); }
        Handles.MH_glSamplerParameterf.invokeExact(handles.PFN_glSamplerParameterf, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SamplerParameterf", e); }
    }

    /// ```
    /// void glSamplerParameterfv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, const GLfloat* param);
    /// ```
    public void SamplerParameterfv(int sampler, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplerParameterfv)) throw new GLSymbolNotFoundError("Symbol not found: glSamplerParameterfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSamplerParameterfv", sampler, pname, param); }
        Handles.MH_glSamplerParameterfv.invokeExact(handles.PFN_glSamplerParameterfv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SamplerParameterfv", e); }
    }

    /// ```
    /// void glSamplerParameterIiv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, const GLint* param);
    /// ```
    public void SamplerParameterIiv(int sampler, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplerParameterIiv)) throw new GLSymbolNotFoundError("Symbol not found: glSamplerParameterIiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSamplerParameterIiv", sampler, pname, param); }
        Handles.MH_glSamplerParameterIiv.invokeExact(handles.PFN_glSamplerParameterIiv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SamplerParameterIiv", e); }
    }

    /// ```
    /// void glSamplerParameterIuiv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, const GLuint* param);
    /// ```
    public void SamplerParameterIuiv(int sampler, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplerParameterIuiv)) throw new GLSymbolNotFoundError("Symbol not found: glSamplerParameterIuiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSamplerParameterIuiv", sampler, pname, param); }
        Handles.MH_glSamplerParameterIuiv.invokeExact(handles.PFN_glSamplerParameterIuiv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SamplerParameterIuiv", e); }
    }

    /// ```
    /// void glGetSamplerParameteriv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetSamplerParameteriv(int sampler, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSamplerParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetSamplerParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetSamplerParameteriv", sampler, pname, params); }
        Handles.MH_glGetSamplerParameteriv.invokeExact(handles.PFN_glGetSamplerParameteriv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetSamplerParameteriv", e); }
    }

    /// ```
    /// void glGetSamplerParameterIiv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetSamplerParameterIiv(int sampler, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSamplerParameterIiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetSamplerParameterIiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetSamplerParameterIiv", sampler, pname, params); }
        Handles.MH_glGetSamplerParameterIiv.invokeExact(handles.PFN_glGetSamplerParameterIiv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetSamplerParameterIiv", e); }
    }

    /// ```
    /// void glGetSamplerParameterfv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetSamplerParameterfv(int sampler, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSamplerParameterfv)) throw new GLSymbolNotFoundError("Symbol not found: glGetSamplerParameterfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetSamplerParameterfv", sampler, pname, params); }
        Handles.MH_glGetSamplerParameterfv.invokeExact(handles.PFN_glGetSamplerParameterfv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetSamplerParameterfv", e); }
    }

    /// ```
    /// void glGetSamplerParameterIuiv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, GLuint* params);
    /// ```
    public void GetSamplerParameterIuiv(int sampler, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSamplerParameterIuiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetSamplerParameterIuiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetSamplerParameterIuiv", sampler, pname, params); }
        Handles.MH_glGetSamplerParameterIuiv.invokeExact(handles.PFN_glGetSamplerParameterIuiv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetSamplerParameterIuiv", e); }
    }

    /// ```
    /// void glQueryCounter((unsigned int) GLuint id, (unsigned int) GLenum target);
    /// ```
    public void QueryCounter(int id, int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glQueryCounter)) throw new GLSymbolNotFoundError("Symbol not found: glQueryCounter");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glQueryCounter", id, target); }
        Handles.MH_glQueryCounter.invokeExact(handles.PFN_glQueryCounter, id, target); }
        catch (Throwable e) { throw new RuntimeException("error in QueryCounter", e); }
    }

    /// ```
    /// void glGetQueryObjecti64v((unsigned int) GLuint id, (unsigned int) GLenum pname, GLint64* params);
    /// ```
    public void GetQueryObjecti64v(int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryObjecti64v)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryObjecti64v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryObjecti64v", id, pname, params); }
        Handles.MH_glGetQueryObjecti64v.invokeExact(handles.PFN_glGetQueryObjecti64v, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryObjecti64v", e); }
    }

    /// ```
    /// void glGetQueryObjectui64v((unsigned int) GLuint id, (unsigned int) GLenum pname, GLuint64* params);
    /// ```
    public void GetQueryObjectui64v(int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryObjectui64v)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryObjectui64v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryObjectui64v", id, pname, params); }
        Handles.MH_glGetQueryObjectui64v.invokeExact(handles.PFN_glGetQueryObjectui64v, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryObjectui64v", e); }
    }

    /// ```
    /// void glVertexAttribDivisor((unsigned int) GLuint index, (unsigned int) GLuint divisor);
    /// ```
    public void VertexAttribDivisor(int index, int divisor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribDivisor)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribDivisor");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribDivisor", index, divisor); }
        Handles.MH_glVertexAttribDivisor.invokeExact(handles.PFN_glVertexAttribDivisor, index, divisor); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribDivisor", e); }
    }

    /// ```
    /// void glVertexAttribP1ui((unsigned int) GLuint index, (unsigned int) GLenum type, GLboolean normalized, (unsigned int) GLuint value);
    /// ```
    public void VertexAttribP1ui(int index, int type, boolean normalized, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribP1ui)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribP1ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribP1ui", index, type, normalized, value); }
        Handles.MH_glVertexAttribP1ui.invokeExact(handles.PFN_glVertexAttribP1ui, index, type, ((normalized) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribP1ui", e); }
    }

    /// ```
    /// void glVertexAttribP1uiv((unsigned int) GLuint index, (unsigned int) GLenum type, GLboolean normalized, const GLuint* value);
    /// ```
    public void VertexAttribP1uiv(int index, int type, boolean normalized, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribP1uiv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribP1uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribP1uiv", index, type, normalized, value); }
        Handles.MH_glVertexAttribP1uiv.invokeExact(handles.PFN_glVertexAttribP1uiv, index, type, ((normalized) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribP1uiv", e); }
    }

    /// ```
    /// void glVertexAttribP2ui((unsigned int) GLuint index, (unsigned int) GLenum type, GLboolean normalized, (unsigned int) GLuint value);
    /// ```
    public void VertexAttribP2ui(int index, int type, boolean normalized, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribP2ui)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribP2ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribP2ui", index, type, normalized, value); }
        Handles.MH_glVertexAttribP2ui.invokeExact(handles.PFN_glVertexAttribP2ui, index, type, ((normalized) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribP2ui", e); }
    }

    /// ```
    /// void glVertexAttribP2uiv((unsigned int) GLuint index, (unsigned int) GLenum type, GLboolean normalized, const GLuint* value);
    /// ```
    public void VertexAttribP2uiv(int index, int type, boolean normalized, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribP2uiv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribP2uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribP2uiv", index, type, normalized, value); }
        Handles.MH_glVertexAttribP2uiv.invokeExact(handles.PFN_glVertexAttribP2uiv, index, type, ((normalized) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribP2uiv", e); }
    }

    /// ```
    /// void glVertexAttribP3ui((unsigned int) GLuint index, (unsigned int) GLenum type, GLboolean normalized, (unsigned int) GLuint value);
    /// ```
    public void VertexAttribP3ui(int index, int type, boolean normalized, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribP3ui)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribP3ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribP3ui", index, type, normalized, value); }
        Handles.MH_glVertexAttribP3ui.invokeExact(handles.PFN_glVertexAttribP3ui, index, type, ((normalized) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribP3ui", e); }
    }

    /// ```
    /// void glVertexAttribP3uiv((unsigned int) GLuint index, (unsigned int) GLenum type, GLboolean normalized, const GLuint* value);
    /// ```
    public void VertexAttribP3uiv(int index, int type, boolean normalized, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribP3uiv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribP3uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribP3uiv", index, type, normalized, value); }
        Handles.MH_glVertexAttribP3uiv.invokeExact(handles.PFN_glVertexAttribP3uiv, index, type, ((normalized) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribP3uiv", e); }
    }

    /// ```
    /// void glVertexAttribP4ui((unsigned int) GLuint index, (unsigned int) GLenum type, GLboolean normalized, (unsigned int) GLuint value);
    /// ```
    public void VertexAttribP4ui(int index, int type, boolean normalized, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribP4ui)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribP4ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribP4ui", index, type, normalized, value); }
        Handles.MH_glVertexAttribP4ui.invokeExact(handles.PFN_glVertexAttribP4ui, index, type, ((normalized) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribP4ui", e); }
    }

    /// ```
    /// void glVertexAttribP4uiv((unsigned int) GLuint index, (unsigned int) GLenum type, GLboolean normalized, const GLuint* value);
    /// ```
    public void VertexAttribP4uiv(int index, int type, boolean normalized, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribP4uiv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribP4uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribP4uiv", index, type, normalized, value); }
        Handles.MH_glVertexAttribP4uiv.invokeExact(handles.PFN_glVertexAttribP4uiv, index, type, ((normalized) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribP4uiv", e); }
    }

}
