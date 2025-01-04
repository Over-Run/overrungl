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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVGeometryProgram4 {
    public static final int GL_LINES_ADJACENCY_EXT = 0x000A;
    public static final int GL_LINE_STRIP_ADJACENCY_EXT = 0x000B;
    public static final int GL_TRIANGLES_ADJACENCY_EXT = 0x000C;
    public static final int GL_TRIANGLE_STRIP_ADJACENCY_EXT = 0x000D;
    public static final int GL_GEOMETRY_PROGRAM_NV = 0x8C26;
    public static final int GL_MAX_PROGRAM_OUTPUT_VERTICES_NV = 0x8C27;
    public static final int GL_MAX_PROGRAM_TOTAL_OUTPUT_COMPONENTS_NV = 0x8C28;
    public static final int GL_GEOMETRY_VERTICES_OUT_EXT = 0x8DDA;
    public static final int GL_GEOMETRY_INPUT_TYPE_EXT = 0x8DDB;
    public static final int GL_GEOMETRY_OUTPUT_TYPE_EXT = 0x8DDC;
    public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT = 0x8C29;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_EXT = 0x8DA7;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT = 0x8DA8;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_EXT = 0x8DA9;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT = 0x8CD4;
    public static final int GL_PROGRAM_POINT_SIZE_EXT = 0x8642;
    public static final MethodHandle MH_glProgramVertexLimitNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramVertexLimitNV;
    public static final MethodHandle MH_glFramebufferTextureEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFramebufferTextureEXT;
    public static final MethodHandle MH_glFramebufferTextureLayerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFramebufferTextureLayerEXT;
    public static final MethodHandle MH_glFramebufferTextureFaceEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFramebufferTextureFaceEXT;

    public GLNVGeometryProgram4(overrungl.opengl.GLLoadFunc func) {
        PFN_glProgramVertexLimitNV = func.invoke("glProgramVertexLimitNV");
        PFN_glFramebufferTextureEXT = func.invoke("glFramebufferTextureEXT", "glFramebufferTexture");
        PFN_glFramebufferTextureLayerEXT = func.invoke("glFramebufferTextureLayerEXT", "glFramebufferTextureLayer");
        PFN_glFramebufferTextureFaceEXT = func.invoke("glFramebufferTextureFaceEXT", "glFramebufferTextureFaceARB");
    }

    public void ProgramVertexLimitNV(@CType("GLenum") int target, @CType("GLint") int limit) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramVertexLimitNV))
            MH_glProgramVertexLimitNV.invokeExact(PFN_glProgramVertexLimitNV, target, limit);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramVertexLimitNV", e); }
    }

    public void FramebufferTextureEXT(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level) {
        try { if (!Unmarshal.isNullPointer(PFN_glFramebufferTextureEXT))
            MH_glFramebufferTextureEXT.invokeExact(PFN_glFramebufferTextureEXT, target, attachment, texture, level);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferTextureEXT", e); }
    }

    public void FramebufferTextureLayerEXT(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int layer) {
        try { if (!Unmarshal.isNullPointer(PFN_glFramebufferTextureLayerEXT))
            MH_glFramebufferTextureLayerEXT.invokeExact(PFN_glFramebufferTextureLayerEXT, target, attachment, texture, level, layer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferTextureLayerEXT", e); }
    }

    public void FramebufferTextureFaceEXT(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level, @CType("GLenum") int face) {
        try { if (!Unmarshal.isNullPointer(PFN_glFramebufferTextureFaceEXT))
            MH_glFramebufferTextureFaceEXT.invokeExact(PFN_glFramebufferTextureFaceEXT, target, attachment, texture, level, face);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferTextureFaceEXT", e); }
    }

}
