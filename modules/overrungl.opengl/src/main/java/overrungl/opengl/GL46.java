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

public sealed class GL46 extends GL45 permits GL {
    public static final int GL_SHADER_BINARY_FORMAT_SPIR_V = 0x9551;
    public static final int GL_SPIR_V_BINARY = 0x9552;
    public static final int GL_PARAMETER_BUFFER = 0x80EE;
    public static final int GL_PARAMETER_BUFFER_BINDING = 0x80EF;
    public static final int GL_CONTEXT_FLAG_NO_ERROR_BIT = 0x00000008;
    public static final int GL_VERTICES_SUBMITTED = 0x82EE;
    public static final int GL_PRIMITIVES_SUBMITTED = 0x82EF;
    public static final int GL_VERTEX_SHADER_INVOCATIONS = 0x82F0;
    public static final int GL_TESS_CONTROL_SHADER_PATCHES = 0x82F1;
    public static final int GL_TESS_EVALUATION_SHADER_INVOCATIONS = 0x82F2;
    public static final int GL_GEOMETRY_SHADER_PRIMITIVES_EMITTED = 0x82F3;
    public static final int GL_FRAGMENT_SHADER_INVOCATIONS = 0x82F4;
    public static final int GL_COMPUTE_SHADER_INVOCATIONS = 0x82F5;
    public static final int GL_CLIPPING_INPUT_PRIMITIVES = 0x82F6;
    public static final int GL_CLIPPING_OUTPUT_PRIMITIVES = 0x82F7;
    public static final int GL_POLYGON_OFFSET_CLAMP = 0x8E1B;
    public static final int GL_SPIR_V_EXTENSIONS = 0x9553;
    public static final int GL_NUM_SPIR_V_EXTENSIONS = 0x9554;
    public static final int GL_TEXTURE_MAX_ANISOTROPY = 0x84FE;
    public static final int GL_MAX_TEXTURE_MAX_ANISOTROPY = 0x84FF;
    public static final int GL_TRANSFORM_FEEDBACK_OVERFLOW = 0x82EC;
    public static final int GL_TRANSFORM_FEEDBACK_STREAM_OVERFLOW = 0x82ED;
    public static final MethodHandle MH_glSpecializeShader = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSpecializeShader;
    public static final MethodHandle MH_glMultiDrawArraysIndirectCount = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiDrawArraysIndirectCount;
    public static final MethodHandle MH_glMultiDrawElementsIndirectCount = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiDrawElementsIndirectCount;
    public static final MethodHandle MH_glPolygonOffsetClamp = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glPolygonOffsetClamp;

    public GL46(GLLoadFunc func) {
        super(func);
        PFN_glSpecializeShader = func.invoke("glSpecializeShader", "glSpecializeShaderARB");
        PFN_glMultiDrawArraysIndirectCount = func.invoke("glMultiDrawArraysIndirectCount", "glMultiDrawArraysIndirectCountARB");
        PFN_glMultiDrawElementsIndirectCount = func.invoke("glMultiDrawElementsIndirectCount", "glMultiDrawElementsIndirectCountARB");
        PFN_glPolygonOffsetClamp = func.invoke("glPolygonOffsetClamp", "glPolygonOffsetClampEXT");
    }

    public void SpecializeShader(@CType("GLuint") int shader, @CType("const GLchar *") java.lang.foreign.MemorySegment pEntryPoint, @CType("GLuint") int numSpecializationConstants, @CType("const GLuint *") java.lang.foreign.MemorySegment pConstantIndex, @CType("const GLuint *") java.lang.foreign.MemorySegment pConstantValue) {
        try { if (!Unmarshal.isNullPointer(PFN_glSpecializeShader))
            MH_glSpecializeShader.invokeExact(PFN_glSpecializeShader, shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue);
        }
        catch (Throwable e) { throw new RuntimeException("error in glSpecializeShader", e); }
    }

    public void MultiDrawArraysIndirectCount(@CType("GLenum") int mode, @CType("const void *") java.lang.foreign.MemorySegment indirect, @CType("GLintptr") long drawcount, @CType("GLsizei") int maxdrawcount, @CType("GLsizei") int stride) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiDrawArraysIndirectCount))
            MH_glMultiDrawArraysIndirectCount.invokeExact(PFN_glMultiDrawArraysIndirectCount, mode, indirect, drawcount, maxdrawcount, stride);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawArraysIndirectCount", e); }
    }

    public void MultiDrawElementsIndirectCount(@CType("GLenum") int mode, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indirect, @CType("GLintptr") long drawcount, @CType("GLsizei") int maxdrawcount, @CType("GLsizei") int stride) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiDrawElementsIndirectCount))
            MH_glMultiDrawElementsIndirectCount.invokeExact(PFN_glMultiDrawElementsIndirectCount, mode, type, indirect, drawcount, maxdrawcount, stride);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawElementsIndirectCount", e); }
    }

    public void PolygonOffsetClamp(@CType("GLfloat") float factor, @CType("GLfloat") float units, @CType("GLfloat") float clamp) {
        try { if (!Unmarshal.isNullPointer(PFN_glPolygonOffsetClamp))
            MH_glPolygonOffsetClamp.invokeExact(PFN_glPolygonOffsetClamp, factor, units, clamp);
        }
        catch (Throwable e) { throw new RuntimeException("error in glPolygonOffsetClamp", e); }
    }

}
