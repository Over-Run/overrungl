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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLEXTShaderImageLoadStore {
    public static final int GL_MAX_IMAGE_UNITS_EXT = 0x8F38;
    public static final int GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS_EXT = 0x8F39;
    public static final int GL_IMAGE_BINDING_NAME_EXT = 0x8F3A;
    public static final int GL_IMAGE_BINDING_LEVEL_EXT = 0x8F3B;
    public static final int GL_IMAGE_BINDING_LAYERED_EXT = 0x8F3C;
    public static final int GL_IMAGE_BINDING_LAYER_EXT = 0x8F3D;
    public static final int GL_IMAGE_BINDING_ACCESS_EXT = 0x8F3E;
    public static final int GL_IMAGE_1D_EXT = 0x904C;
    public static final int GL_IMAGE_2D_EXT = 0x904D;
    public static final int GL_IMAGE_3D_EXT = 0x904E;
    public static final int GL_IMAGE_2D_RECT_EXT = 0x904F;
    public static final int GL_IMAGE_CUBE_EXT = 0x9050;
    public static final int GL_IMAGE_BUFFER_EXT = 0x9051;
    public static final int GL_IMAGE_1D_ARRAY_EXT = 0x9052;
    public static final int GL_IMAGE_2D_ARRAY_EXT = 0x9053;
    public static final int GL_IMAGE_CUBE_MAP_ARRAY_EXT = 0x9054;
    public static final int GL_IMAGE_2D_MULTISAMPLE_EXT = 0x9055;
    public static final int GL_IMAGE_2D_MULTISAMPLE_ARRAY_EXT = 0x9056;
    public static final int GL_INT_IMAGE_1D_EXT = 0x9057;
    public static final int GL_INT_IMAGE_2D_EXT = 0x9058;
    public static final int GL_INT_IMAGE_3D_EXT = 0x9059;
    public static final int GL_INT_IMAGE_2D_RECT_EXT = 0x905A;
    public static final int GL_INT_IMAGE_CUBE_EXT = 0x905B;
    public static final int GL_INT_IMAGE_BUFFER_EXT = 0x905C;
    public static final int GL_INT_IMAGE_1D_ARRAY_EXT = 0x905D;
    public static final int GL_INT_IMAGE_2D_ARRAY_EXT = 0x905E;
    public static final int GL_INT_IMAGE_CUBE_MAP_ARRAY_EXT = 0x905F;
    public static final int GL_INT_IMAGE_2D_MULTISAMPLE_EXT = 0x9060;
    public static final int GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY_EXT = 0x9061;
    public static final int GL_UNSIGNED_INT_IMAGE_1D_EXT = 0x9062;
    public static final int GL_UNSIGNED_INT_IMAGE_2D_EXT = 0x9063;
    public static final int GL_UNSIGNED_INT_IMAGE_3D_EXT = 0x9064;
    public static final int GL_UNSIGNED_INT_IMAGE_2D_RECT_EXT = 0x9065;
    public static final int GL_UNSIGNED_INT_IMAGE_CUBE_EXT = 0x9066;
    public static final int GL_UNSIGNED_INT_IMAGE_BUFFER_EXT = 0x9067;
    public static final int GL_UNSIGNED_INT_IMAGE_1D_ARRAY_EXT = 0x9068;
    public static final int GL_UNSIGNED_INT_IMAGE_2D_ARRAY_EXT = 0x9069;
    public static final int GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY_EXT = 0x906A;
    public static final int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_EXT = 0x906B;
    public static final int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY_EXT = 0x906C;
    public static final int GL_MAX_IMAGE_SAMPLES_EXT = 0x906D;
    public static final int GL_IMAGE_BINDING_FORMAT_EXT = 0x906E;
    public static final int GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT_EXT = 0x00000001;
    public static final int GL_ELEMENT_ARRAY_BARRIER_BIT_EXT = 0x00000002;
    public static final int GL_UNIFORM_BARRIER_BIT_EXT = 0x00000004;
    public static final int GL_TEXTURE_FETCH_BARRIER_BIT_EXT = 0x00000008;
    public static final int GL_SHADER_IMAGE_ACCESS_BARRIER_BIT_EXT = 0x00000020;
    public static final int GL_COMMAND_BARRIER_BIT_EXT = 0x00000040;
    public static final int GL_PIXEL_BUFFER_BARRIER_BIT_EXT = 0x00000080;
    public static final int GL_TEXTURE_UPDATE_BARRIER_BIT_EXT = 0x00000100;
    public static final int GL_BUFFER_UPDATE_BARRIER_BIT_EXT = 0x00000200;
    public static final int GL_FRAMEBUFFER_BARRIER_BIT_EXT = 0x00000400;
    public static final int GL_TRANSFORM_FEEDBACK_BARRIER_BIT_EXT = 0x00000800;
    public static final int GL_ATOMIC_COUNTER_BARRIER_BIT_EXT = 0x00001000;
    public static final int GL_ALL_BARRIER_BITS_EXT = 0xFFFFFFFF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBindImageTextureEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMemoryBarrierEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBindImageTextureEXT;
        public final MemorySegment PFN_glMemoryBarrierEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBindImageTextureEXT = func.invoke("glBindImageTextureEXT");
            PFN_glMemoryBarrierEXT = func.invoke("glMemoryBarrierEXT", "glMemoryBarrier");
        }
    }

    public GLEXTShaderImageLoadStore(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBindImageTextureEXT((unsigned int) GLuint index, (unsigned int) GLuint texture, (int) GLint level, GLboolean layered, (int) GLint layer, (unsigned int) GLenum access, (int) GLint format);
    /// ```
    public void BindImageTextureEXT(int index, int texture, int level, boolean layered, int layer, int access, int format) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindImageTextureEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBindImageTextureEXT");
        try { Handles.MH_glBindImageTextureEXT.invokeExact(handles.PFN_glBindImageTextureEXT, index, texture, level, ((layered) ? (byte)1 : (byte)0), layer, access, format); }
        catch (Throwable e) { throw new RuntimeException("error in BindImageTextureEXT", e); }
    }

    /// ```
    /// void glMemoryBarrierEXT((unsigned int) GLbitfield barriers);
    /// ```
    public void MemoryBarrierEXT(int barriers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMemoryBarrierEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMemoryBarrierEXT");
        try { Handles.MH_glMemoryBarrierEXT.invokeExact(handles.PFN_glMemoryBarrierEXT, barriers); }
        catch (Throwable e) { throw new RuntimeException("error in MemoryBarrierEXT", e); }
    }

}
