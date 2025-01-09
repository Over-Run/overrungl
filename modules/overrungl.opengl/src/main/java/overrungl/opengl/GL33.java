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
    public static final MethodHandle MH_glBindFragDataLocationIndexed = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetFragDataIndex = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGenSamplers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glDeleteSamplers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glIsSampler = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glBindSampler = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glSamplerParameteri = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glSamplerParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glSamplerParameterf = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glSamplerParameterfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glSamplerParameterIiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glSamplerParameterIuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetSamplerParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetSamplerParameterIiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetSamplerParameterfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetSamplerParameterIuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glQueryCounter = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glGetQueryObjecti64v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetQueryObjectui64v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttribDivisor = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glVertexAttribP1ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glVertexAttribP1uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttribP2ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glVertexAttribP2uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttribP3ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glVertexAttribP3uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttribP4ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glVertexAttribP4uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
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

    public GL33(GLLoadFunc func) {
        super(func);
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

    public void BindFragDataLocationIndexed(@CType("GLuint") int program, @CType("GLuint") int colorNumber, @CType("GLuint") int index, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(PFN_glBindFragDataLocationIndexed)) throw new SymbolNotFoundError("Symbol not found: glBindFragDataLocationIndexed");
        try { MH_glBindFragDataLocationIndexed.invokeExact(PFN_glBindFragDataLocationIndexed, program, colorNumber, index, name); }
        catch (Throwable e) { throw new RuntimeException("error in glBindFragDataLocationIndexed", e); }
    }

    public @CType("GLint") int GetFragDataIndex(@CType("GLuint") int program, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(PFN_glGetFragDataIndex)) throw new SymbolNotFoundError("Symbol not found: glGetFragDataIndex");
        try { return (int) MH_glGetFragDataIndex.invokeExact(PFN_glGetFragDataIndex, program, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFragDataIndex", e); }
    }

    public void GenSamplers(@CType("GLsizei") int count, @CType("GLuint *") java.lang.foreign.MemorySegment samplers) {
        if (Unmarshal.isNullPointer(PFN_glGenSamplers)) throw new SymbolNotFoundError("Symbol not found: glGenSamplers");
        try { MH_glGenSamplers.invokeExact(PFN_glGenSamplers, count, samplers); }
        catch (Throwable e) { throw new RuntimeException("error in glGenSamplers", e); }
    }

    public void DeleteSamplers(@CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment samplers) {
        if (Unmarshal.isNullPointer(PFN_glDeleteSamplers)) throw new SymbolNotFoundError("Symbol not found: glDeleteSamplers");
        try { MH_glDeleteSamplers.invokeExact(PFN_glDeleteSamplers, count, samplers); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteSamplers", e); }
    }

    public @CType("GLboolean") boolean IsSampler(@CType("GLuint") int sampler) {
        if (Unmarshal.isNullPointer(PFN_glIsSampler)) throw new SymbolNotFoundError("Symbol not found: glIsSampler");
        try { return (boolean) MH_glIsSampler.invokeExact(PFN_glIsSampler, sampler); }
        catch (Throwable e) { throw new RuntimeException("error in glIsSampler", e); }
    }

    public void BindSampler(@CType("GLuint") int unit, @CType("GLuint") int sampler) {
        if (Unmarshal.isNullPointer(PFN_glBindSampler)) throw new SymbolNotFoundError("Symbol not found: glBindSampler");
        try { MH_glBindSampler.invokeExact(PFN_glBindSampler, unit, sampler); }
        catch (Throwable e) { throw new RuntimeException("error in glBindSampler", e); }
    }

    public void SamplerParameteri(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(PFN_glSamplerParameteri)) throw new SymbolNotFoundError("Symbol not found: glSamplerParameteri");
        try { MH_glSamplerParameteri.invokeExact(PFN_glSamplerParameteri, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glSamplerParameteri", e); }
    }

    public void SamplerParameteriv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(PFN_glSamplerParameteriv)) throw new SymbolNotFoundError("Symbol not found: glSamplerParameteriv");
        try { MH_glSamplerParameteriv.invokeExact(PFN_glSamplerParameteriv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glSamplerParameteriv", e); }
    }

    public void SamplerParameterf(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(PFN_glSamplerParameterf)) throw new SymbolNotFoundError("Symbol not found: glSamplerParameterf");
        try { MH_glSamplerParameterf.invokeExact(PFN_glSamplerParameterf, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glSamplerParameterf", e); }
    }

    public void SamplerParameterfv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(PFN_glSamplerParameterfv)) throw new SymbolNotFoundError("Symbol not found: glSamplerParameterfv");
        try { MH_glSamplerParameterfv.invokeExact(PFN_glSamplerParameterfv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glSamplerParameterfv", e); }
    }

    public void SamplerParameterIiv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(PFN_glSamplerParameterIiv)) throw new SymbolNotFoundError("Symbol not found: glSamplerParameterIiv");
        try { MH_glSamplerParameterIiv.invokeExact(PFN_glSamplerParameterIiv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glSamplerParameterIiv", e); }
    }

    public void SamplerParameterIuiv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("const GLuint *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(PFN_glSamplerParameterIuiv)) throw new SymbolNotFoundError("Symbol not found: glSamplerParameterIuiv");
        try { MH_glSamplerParameterIuiv.invokeExact(PFN_glSamplerParameterIuiv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glSamplerParameterIuiv", e); }
    }

    public void GetSamplerParameteriv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetSamplerParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetSamplerParameteriv");
        try { MH_glGetSamplerParameteriv.invokeExact(PFN_glGetSamplerParameteriv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetSamplerParameteriv", e); }
    }

    public void GetSamplerParameterIiv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetSamplerParameterIiv)) throw new SymbolNotFoundError("Symbol not found: glGetSamplerParameterIiv");
        try { MH_glGetSamplerParameterIiv.invokeExact(PFN_glGetSamplerParameterIiv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetSamplerParameterIiv", e); }
    }

    public void GetSamplerParameterfv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetSamplerParameterfv)) throw new SymbolNotFoundError("Symbol not found: glGetSamplerParameterfv");
        try { MH_glGetSamplerParameterfv.invokeExact(PFN_glGetSamplerParameterfv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetSamplerParameterfv", e); }
    }

    public void GetSamplerParameterIuiv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetSamplerParameterIuiv)) throw new SymbolNotFoundError("Symbol not found: glGetSamplerParameterIuiv");
        try { MH_glGetSamplerParameterIuiv.invokeExact(PFN_glGetSamplerParameterIuiv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetSamplerParameterIuiv", e); }
    }

    public void QueryCounter(@CType("GLuint") int id, @CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(PFN_glQueryCounter)) throw new SymbolNotFoundError("Symbol not found: glQueryCounter");
        try { MH_glQueryCounter.invokeExact(PFN_glQueryCounter, id, target); }
        catch (Throwable e) { throw new RuntimeException("error in glQueryCounter", e); }
    }

    public void GetQueryObjecti64v(@CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLint64 *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetQueryObjecti64v)) throw new SymbolNotFoundError("Symbol not found: glGetQueryObjecti64v");
        try { MH_glGetQueryObjecti64v.invokeExact(PFN_glGetQueryObjecti64v, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryObjecti64v", e); }
    }

    public void GetQueryObjectui64v(@CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLuint64 *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetQueryObjectui64v)) throw new SymbolNotFoundError("Symbol not found: glGetQueryObjectui64v");
        try { MH_glGetQueryObjectui64v.invokeExact(PFN_glGetQueryObjectui64v, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryObjectui64v", e); }
    }

    public void VertexAttribDivisor(@CType("GLuint") int index, @CType("GLuint") int divisor) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttribDivisor)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribDivisor");
        try { MH_glVertexAttribDivisor.invokeExact(PFN_glVertexAttribDivisor, index, divisor); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribDivisor", e); }
    }

    public void VertexAttribP1ui(@CType("GLuint") int index, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLuint") int value) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttribP1ui)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribP1ui");
        try { MH_glVertexAttribP1ui.invokeExact(PFN_glVertexAttribP1ui, index, type, normalized, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribP1ui", e); }
    }

    public void VertexAttribP1uiv(@CType("GLuint") int index, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttribP1uiv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribP1uiv");
        try { MH_glVertexAttribP1uiv.invokeExact(PFN_glVertexAttribP1uiv, index, type, normalized, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribP1uiv", e); }
    }

    public void VertexAttribP2ui(@CType("GLuint") int index, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLuint") int value) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttribP2ui)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribP2ui");
        try { MH_glVertexAttribP2ui.invokeExact(PFN_glVertexAttribP2ui, index, type, normalized, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribP2ui", e); }
    }

    public void VertexAttribP2uiv(@CType("GLuint") int index, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttribP2uiv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribP2uiv");
        try { MH_glVertexAttribP2uiv.invokeExact(PFN_glVertexAttribP2uiv, index, type, normalized, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribP2uiv", e); }
    }

    public void VertexAttribP3ui(@CType("GLuint") int index, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLuint") int value) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttribP3ui)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribP3ui");
        try { MH_glVertexAttribP3ui.invokeExact(PFN_glVertexAttribP3ui, index, type, normalized, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribP3ui", e); }
    }

    public void VertexAttribP3uiv(@CType("GLuint") int index, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttribP3uiv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribP3uiv");
        try { MH_glVertexAttribP3uiv.invokeExact(PFN_glVertexAttribP3uiv, index, type, normalized, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribP3uiv", e); }
    }

    public void VertexAttribP4ui(@CType("GLuint") int index, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLuint") int value) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttribP4ui)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribP4ui");
        try { MH_glVertexAttribP4ui.invokeExact(PFN_glVertexAttribP4ui, index, type, normalized, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribP4ui", e); }
    }

    public void VertexAttribP4uiv(@CType("GLuint") int index, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttribP4uiv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribP4uiv");
        try { MH_glVertexAttribP4uiv.invokeExact(PFN_glVertexAttribP4uiv, index, type, normalized, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribP4uiv", e); }
    }

    // --- OverrunGL custom code ---
    public int GetFragDataIndex(@CType("GLuint") int program, @CType("const GLchar *") String name) { try (var __stack = MemoryStack.pushLocal()) { return GetFragDataIndex(program, Marshal.marshal(__stack, name)); } }
    public int GenSamplers() { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GenSamplers(1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public void DeleteSamplers(int sampler) { try (var __stack = MemoryStack.pushLocal()) { DeleteSamplers(1, __stack.ints(sampler)); } }
}
