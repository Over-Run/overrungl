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
    public static final MethodHandle MH_glGenSamplers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenSamplers;
    public static final MethodHandle MH_glDeleteSamplers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteSamplers;
    public static final MethodHandle MH_glIsSampler = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsSampler;
    public static final MethodHandle MH_glBindSampler = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindSampler;
    public static final MethodHandle MH_glSamplerParameteri = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glSamplerParameteri;
    public static final MethodHandle MH_glSamplerParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSamplerParameteriv;
    public static final MethodHandle MH_glSamplerParameterf = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glSamplerParameterf;
    public static final MethodHandle MH_glSamplerParameterfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSamplerParameterfv;
    public static final MethodHandle MH_glSamplerParameterIiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSamplerParameterIiv;
    public static final MethodHandle MH_glSamplerParameterIuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSamplerParameterIuiv;
    public static final MethodHandle MH_glGetSamplerParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetSamplerParameteriv;
    public static final MethodHandle MH_glGetSamplerParameterIiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetSamplerParameterIiv;
    public static final MethodHandle MH_glGetSamplerParameterfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetSamplerParameterfv;
    public static final MethodHandle MH_glGetSamplerParameterIuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetSamplerParameterIuiv;

    public GLARBSamplerObjects(overrungl.opengl.GLLoadFunc func) {
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

    public void GenSamplers(@CType("GLsizei") int count, @CType("GLuint *") java.lang.foreign.MemorySegment samplers) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenSamplers))
            MH_glGenSamplers.invokeExact(PFN_glGenSamplers, count, samplers);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenSamplers", e); }
    }

    public void DeleteSamplers(@CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment samplers) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeleteSamplers))
            MH_glDeleteSamplers.invokeExact(PFN_glDeleteSamplers, count, samplers);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteSamplers", e); }
    }

    public @CType("GLboolean") boolean IsSampler(@CType("GLuint") int sampler) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsSampler))
            return (boolean) MH_glIsSampler.invokeExact(PFN_glIsSampler, sampler);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsSampler", e); }
    }

    public void BindSampler(@CType("GLuint") int unit, @CType("GLuint") int sampler) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindSampler))
            MH_glBindSampler.invokeExact(PFN_glBindSampler, unit, sampler);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindSampler", e); }
    }

    public void SamplerParameteri(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("GLint") int param) {
        try { if (!Unmarshal.isNullPointer(PFN_glSamplerParameteri))
            MH_glSamplerParameteri.invokeExact(PFN_glSamplerParameteri, sampler, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glSamplerParameteri", e); }
    }

    public void SamplerParameteriv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment param) {
        try { if (!Unmarshal.isNullPointer(PFN_glSamplerParameteriv))
            MH_glSamplerParameteriv.invokeExact(PFN_glSamplerParameteriv, sampler, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glSamplerParameteriv", e); }
    }

    public void SamplerParameterf(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        try { if (!Unmarshal.isNullPointer(PFN_glSamplerParameterf))
            MH_glSamplerParameterf.invokeExact(PFN_glSamplerParameterf, sampler, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glSamplerParameterf", e); }
    }

    public void SamplerParameterfv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment param) {
        try { if (!Unmarshal.isNullPointer(PFN_glSamplerParameterfv))
            MH_glSamplerParameterfv.invokeExact(PFN_glSamplerParameterfv, sampler, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glSamplerParameterfv", e); }
    }

    public void SamplerParameterIiv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment param) {
        try { if (!Unmarshal.isNullPointer(PFN_glSamplerParameterIiv))
            MH_glSamplerParameterIiv.invokeExact(PFN_glSamplerParameterIiv, sampler, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glSamplerParameterIiv", e); }
    }

    public void SamplerParameterIuiv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("const GLuint *") java.lang.foreign.MemorySegment param) {
        try { if (!Unmarshal.isNullPointer(PFN_glSamplerParameterIuiv))
            MH_glSamplerParameterIuiv.invokeExact(PFN_glSamplerParameterIuiv, sampler, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glSamplerParameterIuiv", e); }
    }

    public void GetSamplerParameteriv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetSamplerParameteriv))
            MH_glGetSamplerParameteriv.invokeExact(PFN_glGetSamplerParameteriv, sampler, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetSamplerParameteriv", e); }
    }

    public void GetSamplerParameterIiv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetSamplerParameterIiv))
            MH_glGetSamplerParameterIiv.invokeExact(PFN_glGetSamplerParameterIiv, sampler, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetSamplerParameterIiv", e); }
    }

    public void GetSamplerParameterfv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetSamplerParameterfv))
            MH_glGetSamplerParameterfv.invokeExact(PFN_glGetSamplerParameterfv, sampler, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetSamplerParameterfv", e); }
    }

    public void GetSamplerParameterIuiv(@CType("GLuint") int sampler, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetSamplerParameterIuiv))
            MH_glGetSamplerParameterIuiv.invokeExact(PFN_glGetSamplerParameterIuiv, sampler, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetSamplerParameterIuiv", e); }
    }

}
