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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBShaderImageLoadStore {
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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBindImageTexture = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMemoryBarrier = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBindImageTexture;
        public final MemorySegment PFN_glMemoryBarrier;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBindImageTexture = func.invoke("glBindImageTexture");
            PFN_glMemoryBarrier = func.invoke("glMemoryBarrier");
        }
    }

    public GLARBShaderImageLoadStore(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBindImageTexture((unsigned int) GLuint unit, (unsigned int) GLuint texture, (int) GLint level, GLboolean layered, (int) GLint layer, (unsigned int) GLenum access, (unsigned int) GLenum format);
    /// ```
    public void BindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindImageTexture)) throw new GLSymbolNotFoundError("Symbol not found: glBindImageTexture");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindImageTexture", unit, texture, level, layered, layer, access, format); }
        Handles.MH_glBindImageTexture.invokeExact(handles.PFN_glBindImageTexture, unit, texture, level, ((layered) ? (byte)1 : (byte)0), layer, access, format); }
        catch (Throwable e) { throw new RuntimeException("error in BindImageTexture", e); }
    }

    /// ```
    /// void glMemoryBarrier((unsigned int) GLbitfield barriers);
    /// ```
    public void MemoryBarrier(int barriers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMemoryBarrier)) throw new GLSymbolNotFoundError("Symbol not found: glMemoryBarrier");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMemoryBarrier", barriers); }
        Handles.MH_glMemoryBarrier.invokeExact(handles.PFN_glMemoryBarrier, barriers); }
        catch (Throwable e) { throw new RuntimeException("error in MemoryBarrier", e); }
    }

}
