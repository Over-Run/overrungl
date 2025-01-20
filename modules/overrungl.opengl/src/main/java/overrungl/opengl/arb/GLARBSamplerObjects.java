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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBSamplerObjects {
    public static final int GL_SAMPLER_BINDING = 0x8919;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glGenSamplers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDeleteSamplers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIsSampler = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBindSampler = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glSamplerParameteri = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glSamplerParameteriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glSamplerParameterf = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glSamplerParameterfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glSamplerParameterIiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glSamplerParameterIuiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetSamplerParameteriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetSamplerParameterIiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetSamplerParameterfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetSamplerParameterIuiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glGenSamplers = RuntimeHelper.downcall(Descriptors.FD_glGenSamplers);
        public static final MethodHandle MH_glDeleteSamplers = RuntimeHelper.downcall(Descriptors.FD_glDeleteSamplers);
        public static final MethodHandle MH_glIsSampler = RuntimeHelper.downcall(Descriptors.FD_glIsSampler);
        public static final MethodHandle MH_glBindSampler = RuntimeHelper.downcall(Descriptors.FD_glBindSampler);
        public static final MethodHandle MH_glSamplerParameteri = RuntimeHelper.downcall(Descriptors.FD_glSamplerParameteri);
        public static final MethodHandle MH_glSamplerParameteriv = RuntimeHelper.downcall(Descriptors.FD_glSamplerParameteriv);
        public static final MethodHandle MH_glSamplerParameterf = RuntimeHelper.downcall(Descriptors.FD_glSamplerParameterf);
        public static final MethodHandle MH_glSamplerParameterfv = RuntimeHelper.downcall(Descriptors.FD_glSamplerParameterfv);
        public static final MethodHandle MH_glSamplerParameterIiv = RuntimeHelper.downcall(Descriptors.FD_glSamplerParameterIiv);
        public static final MethodHandle MH_glSamplerParameterIuiv = RuntimeHelper.downcall(Descriptors.FD_glSamplerParameterIuiv);
        public static final MethodHandle MH_glGetSamplerParameteriv = RuntimeHelper.downcall(Descriptors.FD_glGetSamplerParameteriv);
        public static final MethodHandle MH_glGetSamplerParameterIiv = RuntimeHelper.downcall(Descriptors.FD_glGetSamplerParameterIiv);
        public static final MethodHandle MH_glGetSamplerParameterfv = RuntimeHelper.downcall(Descriptors.FD_glGetSamplerParameterfv);
        public static final MethodHandle MH_glGetSamplerParameterIuiv = RuntimeHelper.downcall(Descriptors.FD_glGetSamplerParameterIuiv);
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

    public void GenSamplers(@CType("GLsizei") int count, @CType("GLuint *") java.lang.foreign.MemorySegment samplers) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenSamplers)) throw new SymbolNotFoundError("Symbol not found: glGenSamplers");
        try { Handles.MH_glGenSamplers.invokeExact(handles.PFN_glGenSamplers, count, samplers); }
        catch (Throwable e) { throw new RuntimeException("error in glGenSamplers", e); }
    }

    public void DeleteSamplers(@CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment samplers) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteSamplers)) throw new SymbolNotFoundError("Symbol not found: glDeleteSamplers");
        try { Handles.MH_glDeleteSamplers.invokeExact(handles.PFN_glDeleteSamplers, count, samplers); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteSamplers", e); }
    }

    public @CType("GLboolean") boolean IsSampler(@CType("GLuint") int sampler) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsSampler)) throw new SymbolNotFoundError("Symbol not found: glIsSampler");
        try { return (boolean) Handles.MH_glIsSampler.invokeExact(handles.PFN_glIsSampler, sampler); }
        catch (Throwable e) { throw new RuntimeException("error in glIsSampler", e); }
    }

    public void BindSampler(@CType("GLuint") int unit, @CType("GLuint") int sampler) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindSampler)) throw new SymbolNotFoundError("Symbol not found: glBindSampler");
        try { Handles.MH_glBindSampler.invokeExact(handles.PFN_glBindSampler, unit, sampler); }
        catch (Throwable e) { throw new RuntimeException("error in glBindSampler", e); }
    }

    public void SamplerParameteri(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glSamplerParameteri)) throw new SymbolNotFoundError("Symbol not found: glSamplerParameteri");
        try { Handles.MH_glSamplerParameteri.invokeExact(handles.PFN_glSamplerParameteri, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glSamplerParameteri", e); }
    }

    public void SamplerParameteriv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glSamplerParameteriv)) throw new SymbolNotFoundError("Symbol not found: glSamplerParameteriv");
        try { Handles.MH_glSamplerParameteriv.invokeExact(handles.PFN_glSamplerParameteriv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glSamplerParameteriv", e); }
    }

    public void SamplerParameterf(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(handles.PFN_glSamplerParameterf)) throw new SymbolNotFoundError("Symbol not found: glSamplerParameterf");
        try { Handles.MH_glSamplerParameterf.invokeExact(handles.PFN_glSamplerParameterf, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glSamplerParameterf", e); }
    }

    public void SamplerParameterfv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glSamplerParameterfv)) throw new SymbolNotFoundError("Symbol not found: glSamplerParameterfv");
        try { Handles.MH_glSamplerParameterfv.invokeExact(handles.PFN_glSamplerParameterfv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glSamplerParameterfv", e); }
    }

    public void SamplerParameterIiv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glSamplerParameterIiv)) throw new SymbolNotFoundError("Symbol not found: glSamplerParameterIiv");
        try { Handles.MH_glSamplerParameterIiv.invokeExact(handles.PFN_glSamplerParameterIiv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glSamplerParameterIiv", e); }
    }

    public void SamplerParameterIuiv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("const GLuint *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glSamplerParameterIuiv)) throw new SymbolNotFoundError("Symbol not found: glSamplerParameterIuiv");
        try { Handles.MH_glSamplerParameterIuiv.invokeExact(handles.PFN_glSamplerParameterIuiv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glSamplerParameterIuiv", e); }
    }

    public void GetSamplerParameteriv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetSamplerParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetSamplerParameteriv");
        try { Handles.MH_glGetSamplerParameteriv.invokeExact(handles.PFN_glGetSamplerParameteriv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetSamplerParameteriv", e); }
    }

    public void GetSamplerParameterIiv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetSamplerParameterIiv)) throw new SymbolNotFoundError("Symbol not found: glGetSamplerParameterIiv");
        try { Handles.MH_glGetSamplerParameterIiv.invokeExact(handles.PFN_glGetSamplerParameterIiv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetSamplerParameterIiv", e); }
    }

    public void GetSamplerParameterfv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetSamplerParameterfv)) throw new SymbolNotFoundError("Symbol not found: glGetSamplerParameterfv");
        try { Handles.MH_glGetSamplerParameterfv.invokeExact(handles.PFN_glGetSamplerParameterfv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetSamplerParameterfv", e); }
    }

    public void GetSamplerParameterIuiv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetSamplerParameterIuiv)) throw new SymbolNotFoundError("Symbol not found: glGetSamplerParameterIuiv");
        try { Handles.MH_glGetSamplerParameterIuiv.invokeExact(handles.PFN_glGetSamplerParameterIuiv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetSamplerParameterIuiv", e); }
    }

}
