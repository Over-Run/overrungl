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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glProgramVertexLimitNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferTextureEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferTextureLayerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferTextureFaceEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glProgramVertexLimitNV;
        public final MemorySegment PFN_glFramebufferTextureEXT;
        public final MemorySegment PFN_glFramebufferTextureLayerEXT;
        public final MemorySegment PFN_glFramebufferTextureFaceEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glProgramVertexLimitNV = func.invoke("glProgramVertexLimitNV");
            PFN_glFramebufferTextureEXT = func.invoke("glFramebufferTextureEXT", "glFramebufferTexture");
            PFN_glFramebufferTextureLayerEXT = func.invoke("glFramebufferTextureLayerEXT", "glFramebufferTextureLayer");
            PFN_glFramebufferTextureFaceEXT = func.invoke("glFramebufferTextureFaceEXT", "glFramebufferTextureFaceARB");
        }
    }

    public GLNVGeometryProgram4(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glProgramVertexLimitNV((unsigned int) GLenum target, (int) GLint limit);
    /// ```
    public void ProgramVertexLimitNV(int target, int limit) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramVertexLimitNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramVertexLimitNV");
        try { Handles.MH_glProgramVertexLimitNV.invokeExact(handles.PFN_glProgramVertexLimitNV, target, limit); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramVertexLimitNV", e); }
    }

    /// ```
    /// void glFramebufferTextureEXT((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLuint texture, (int) GLint level);
    /// ```
    public void FramebufferTextureEXT(int target, int attachment, int texture, int level) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTextureEXT)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferTextureEXT");
        try { Handles.MH_glFramebufferTextureEXT.invokeExact(handles.PFN_glFramebufferTextureEXT, target, attachment, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTextureEXT", e); }
    }

    /// ```
    /// void glFramebufferTextureLayerEXT((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLuint texture, (int) GLint level, (int) GLint layer);
    /// ```
    public void FramebufferTextureLayerEXT(int target, int attachment, int texture, int level, int layer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTextureLayerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferTextureLayerEXT");
        try { Handles.MH_glFramebufferTextureLayerEXT.invokeExact(handles.PFN_glFramebufferTextureLayerEXT, target, attachment, texture, level, layer); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTextureLayerEXT", e); }
    }

    /// ```
    /// void glFramebufferTextureFaceEXT((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLuint texture, (int) GLint level, (unsigned int) GLenum face);
    /// ```
    public void FramebufferTextureFaceEXT(int target, int attachment, int texture, int level, int face) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTextureFaceEXT)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferTextureFaceEXT");
        try { Handles.MH_glFramebufferTextureFaceEXT.invokeExact(handles.PFN_glFramebufferTextureFaceEXT, target, attachment, texture, level, face); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTextureFaceEXT", e); }
    }

}
