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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBSamplerObjects {
    public static final int GL_SAMPLER_BINDING = 0x8919;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGenSamplers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteSamplers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsSampler = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
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
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGenSamplers = func.invoke("glGenSamplers");
            PFN_glDeleteSamplers = func.invoke("glDeleteSamplers");
            PFN_glIsSampler = func.invoke("glIsSampler");
            PFN_glBindSampler = func.invoke("glBindSampler");
            PFN_glSamplerParameteri = func.invoke("glSamplerParameteri");
            PFN_glSamplerParameteriv = func.invoke("glSamplerParameteriv");
            PFN_glSamplerParameterf = func.invoke("glSamplerParameterf");
            PFN_glSamplerParameterfv = func.invoke("glSamplerParameterfv");
            PFN_glSamplerParameterIiv = func.invoke("glSamplerParameterIiv");
            PFN_glSamplerParameterIuiv = func.invoke("glSamplerParameterIuiv");
            PFN_glGetSamplerParameteriv = func.invoke("glGetSamplerParameteriv");
            PFN_glGetSamplerParameterIiv = func.invoke("glGetSamplerParameterIiv");
            PFN_glGetSamplerParameterfv = func.invoke("glGetSamplerParameterfv");
            PFN_glGetSamplerParameterIuiv = func.invoke("glGetSamplerParameterIuiv");
        }
    }

    public GLARBSamplerObjects(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glGenSamplers((int) GLsizei count, GLuint* samplers);
    /// ```
    public void GenSamplers(int count, MemorySegment samplers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenSamplers)) throw new GLSymbolNotFoundError("Symbol not found: glGenSamplers");
        try { Handles.MH_glGenSamplers.invokeExact(handles.PFN_glGenSamplers, count, samplers); }
        catch (Throwable e) { throw new RuntimeException("error in GenSamplers", e); }
    }

    /// ```
    /// void glDeleteSamplers((int) GLsizei count, const GLuint* samplers);
    /// ```
    public void DeleteSamplers(int count, MemorySegment samplers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteSamplers)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteSamplers");
        try { Handles.MH_glDeleteSamplers.invokeExact(handles.PFN_glDeleteSamplers, count, samplers); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteSamplers", e); }
    }

    /// ```
    /// GLboolean glIsSampler((unsigned int) GLuint sampler);
    /// ```
    public boolean IsSampler(int sampler) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsSampler)) throw new GLSymbolNotFoundError("Symbol not found: glIsSampler");
        try { return (((byte) Handles.MH_glIsSampler.invokeExact(handles.PFN_glIsSampler, sampler)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsSampler", e); }
    }

    /// ```
    /// void glBindSampler((unsigned int) GLuint unit, (unsigned int) GLuint sampler);
    /// ```
    public void BindSampler(int unit, int sampler) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindSampler)) throw new GLSymbolNotFoundError("Symbol not found: glBindSampler");
        try { Handles.MH_glBindSampler.invokeExact(handles.PFN_glBindSampler, unit, sampler); }
        catch (Throwable e) { throw new RuntimeException("error in BindSampler", e); }
    }

    /// ```
    /// void glSamplerParameteri((unsigned int) GLuint sampler, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void SamplerParameteri(int sampler, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplerParameteri)) throw new GLSymbolNotFoundError("Symbol not found: glSamplerParameteri");
        try { Handles.MH_glSamplerParameteri.invokeExact(handles.PFN_glSamplerParameteri, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SamplerParameteri", e); }
    }

    /// ```
    /// void glSamplerParameteriv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, const GLint* param);
    /// ```
    public void SamplerParameteriv(int sampler, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplerParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glSamplerParameteriv");
        try { Handles.MH_glSamplerParameteriv.invokeExact(handles.PFN_glSamplerParameteriv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SamplerParameteriv", e); }
    }

    /// ```
    /// void glSamplerParameterf((unsigned int) GLuint sampler, (unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void SamplerParameterf(int sampler, int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplerParameterf)) throw new GLSymbolNotFoundError("Symbol not found: glSamplerParameterf");
        try { Handles.MH_glSamplerParameterf.invokeExact(handles.PFN_glSamplerParameterf, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SamplerParameterf", e); }
    }

    /// ```
    /// void glSamplerParameterfv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, const GLfloat* param);
    /// ```
    public void SamplerParameterfv(int sampler, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplerParameterfv)) throw new GLSymbolNotFoundError("Symbol not found: glSamplerParameterfv");
        try { Handles.MH_glSamplerParameterfv.invokeExact(handles.PFN_glSamplerParameterfv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SamplerParameterfv", e); }
    }

    /// ```
    /// void glSamplerParameterIiv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, const GLint* param);
    /// ```
    public void SamplerParameterIiv(int sampler, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplerParameterIiv)) throw new GLSymbolNotFoundError("Symbol not found: glSamplerParameterIiv");
        try { Handles.MH_glSamplerParameterIiv.invokeExact(handles.PFN_glSamplerParameterIiv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SamplerParameterIiv", e); }
    }

    /// ```
    /// void glSamplerParameterIuiv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, const GLuint* param);
    /// ```
    public void SamplerParameterIuiv(int sampler, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplerParameterIuiv)) throw new GLSymbolNotFoundError("Symbol not found: glSamplerParameterIuiv");
        try { Handles.MH_glSamplerParameterIuiv.invokeExact(handles.PFN_glSamplerParameterIuiv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SamplerParameterIuiv", e); }
    }

    /// ```
    /// void glGetSamplerParameteriv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetSamplerParameteriv(int sampler, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSamplerParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetSamplerParameteriv");
        try { Handles.MH_glGetSamplerParameteriv.invokeExact(handles.PFN_glGetSamplerParameteriv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetSamplerParameteriv", e); }
    }

    /// ```
    /// void glGetSamplerParameterIiv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetSamplerParameterIiv(int sampler, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSamplerParameterIiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetSamplerParameterIiv");
        try { Handles.MH_glGetSamplerParameterIiv.invokeExact(handles.PFN_glGetSamplerParameterIiv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetSamplerParameterIiv", e); }
    }

    /// ```
    /// void glGetSamplerParameterfv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetSamplerParameterfv(int sampler, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSamplerParameterfv)) throw new GLSymbolNotFoundError("Symbol not found: glGetSamplerParameterfv");
        try { Handles.MH_glGetSamplerParameterfv.invokeExact(handles.PFN_glGetSamplerParameterfv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetSamplerParameterfv", e); }
    }

    /// ```
    /// void glGetSamplerParameterIuiv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, GLuint* params);
    /// ```
    public void GetSamplerParameterIuiv(int sampler, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSamplerParameterIuiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetSamplerParameterIuiv");
        try { Handles.MH_glGetSamplerParameterIuiv.invokeExact(handles.PFN_glGetSamplerParameterIuiv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetSamplerParameterIuiv", e); }
    }

}
