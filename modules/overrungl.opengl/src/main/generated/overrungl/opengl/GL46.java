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

public class GL46 extends GL45 {
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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glSpecializeShader = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiDrawArraysIndirectCount = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiDrawElementsIndirectCount = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPolygonOffsetClamp = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glSpecializeShader;
        public final MemorySegment PFN_glMultiDrawArraysIndirectCount;
        public final MemorySegment PFN_glMultiDrawElementsIndirectCount;
        public final MemorySegment PFN_glPolygonOffsetClamp;
        private Handles(GLLoadFunc func) {
            PFN_glSpecializeShader = func.invoke("glSpecializeShader", "glSpecializeShaderARB");
            PFN_glMultiDrawArraysIndirectCount = func.invoke("glMultiDrawArraysIndirectCount", "glMultiDrawArraysIndirectCountARB");
            PFN_glMultiDrawElementsIndirectCount = func.invoke("glMultiDrawElementsIndirectCount", "glMultiDrawElementsIndirectCountARB");
            PFN_glPolygonOffsetClamp = func.invoke("glPolygonOffsetClamp", "glPolygonOffsetClampEXT");
        }
    }

    public GL46(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    /// ```
    /// void glSpecializeShader((unsigned int) GLuint shader, const GLchar* pEntryPoint, (unsigned int) GLuint numSpecializationConstants, const GLuint* pConstantIndex, const GLuint* pConstantValue);
    /// ```
    public void SpecializeShader(int shader, MemorySegment pEntryPoint, int numSpecializationConstants, MemorySegment pConstantIndex, MemorySegment pConstantValue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSpecializeShader)) throw new GLSymbolNotFoundError("Symbol not found: glSpecializeShader");
        try { Handles.MH_glSpecializeShader.invokeExact(handles.PFN_glSpecializeShader, shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue); }
        catch (Throwable e) { throw new RuntimeException("error in SpecializeShader", e); }
    }

    /// ```
    /// void glMultiDrawArraysIndirectCount((unsigned int) GLenum mode, const void* indirect, ((signed long long) khronos_intptr_t) GLintptr drawcount, (int) GLsizei maxdrawcount, (int) GLsizei stride);
    /// ```
    public void MultiDrawArraysIndirectCount(int mode, MemorySegment indirect, long drawcount, int maxdrawcount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawArraysIndirectCount)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawArraysIndirectCount");
        try { Handles.MH_glMultiDrawArraysIndirectCount.invokeExact(handles.PFN_glMultiDrawArraysIndirectCount, mode, indirect, drawcount, maxdrawcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawArraysIndirectCount", e); }
    }

    /// ```
    /// void glMultiDrawElementsIndirectCount((unsigned int) GLenum mode, (unsigned int) GLenum type, const void* indirect, ((signed long long) khronos_intptr_t) GLintptr drawcount, (int) GLsizei maxdrawcount, (int) GLsizei stride);
    /// ```
    public void MultiDrawElementsIndirectCount(int mode, int type, MemorySegment indirect, long drawcount, int maxdrawcount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawElementsIndirectCount)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawElementsIndirectCount");
        try { Handles.MH_glMultiDrawElementsIndirectCount.invokeExact(handles.PFN_glMultiDrawElementsIndirectCount, mode, type, indirect, drawcount, maxdrawcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawElementsIndirectCount", e); }
    }

    /// ```
    /// void glPolygonOffsetClamp(((float) khronos_float_t) GLfloat factor, ((float) khronos_float_t) GLfloat units, ((float) khronos_float_t) GLfloat clamp);
    /// ```
    public void PolygonOffsetClamp(float factor, float units, float clamp) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPolygonOffsetClamp)) throw new GLSymbolNotFoundError("Symbol not found: glPolygonOffsetClamp");
        try { Handles.MH_glPolygonOffsetClamp.invokeExact(handles.PFN_glPolygonOffsetClamp, factor, units, clamp); }
        catch (Throwable e) { throw new RuntimeException("error in PolygonOffsetClamp", e); }
    }

}
