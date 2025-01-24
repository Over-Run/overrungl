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

public final class GLARBGeometryShader4 {
    public static final int GL_LINES_ADJACENCY_ARB = 0x000A;
    public static final int GL_LINE_STRIP_ADJACENCY_ARB = 0x000B;
    public static final int GL_TRIANGLES_ADJACENCY_ARB = 0x000C;
    public static final int GL_TRIANGLE_STRIP_ADJACENCY_ARB = 0x000D;
    public static final int GL_PROGRAM_POINT_SIZE_ARB = 0x8642;
    public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_ARB = 0x8C29;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_ARB = 0x8DA7;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_ARB = 0x8DA8;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_ARB = 0x8DA9;
    public static final int GL_GEOMETRY_SHADER_ARB = 0x8DD9;
    public static final int GL_GEOMETRY_VERTICES_OUT_ARB = 0x8DDA;
    public static final int GL_GEOMETRY_INPUT_TYPE_ARB = 0x8DDB;
    public static final int GL_GEOMETRY_OUTPUT_TYPE_ARB = 0x8DDC;
    public static final int GL_MAX_GEOMETRY_VARYING_COMPONENTS_ARB = 0x8DDD;
    public static final int GL_MAX_VERTEX_VARYING_COMPONENTS_ARB = 0x8DDE;
    public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_ARB = 0x8DDF;
    public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES_ARB = 0x8DE0;
    public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_ARB = 0x8DE1;
    public static final int GL_MAX_VARYING_COMPONENTS = 0x8B4B;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glProgramParameteriARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferTextureARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferTextureLayerARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferTextureFaceARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glProgramParameteriARB;
        public final MemorySegment PFN_glFramebufferTextureARB;
        public final MemorySegment PFN_glFramebufferTextureLayerARB;
        public final MemorySegment PFN_glFramebufferTextureFaceARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glProgramParameteriARB = func.invoke("glProgramParameteriARB", "glProgramParameteri");
            PFN_glFramebufferTextureARB = func.invoke("glFramebufferTextureARB", "glFramebufferTexture");
            PFN_glFramebufferTextureLayerARB = func.invoke("glFramebufferTextureLayerARB", "glFramebufferTextureLayer");
            PFN_glFramebufferTextureFaceARB = func.invoke("glFramebufferTextureFaceARB");
        }
    }

    public GLARBGeometryShader4(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glProgramParameteriARB(unsigned int program, unsigned int pname, int value);
    /// ```
    public void ProgramParameteriARB(int program, int pname, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameteriARB)) throw new SymbolNotFoundError("Symbol not found: glProgramParameteriARB");
        try { Handles.MH_glProgramParameteriARB.invokeExact(handles.PFN_glProgramParameteriARB, program, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameteriARB", e); }
    }

    /// ```
    /// void glFramebufferTextureARB(unsigned int target, unsigned int attachment, unsigned int texture, int level);
    /// ```
    public void FramebufferTextureARB(int target, int attachment, int texture, int level) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTextureARB)) throw new SymbolNotFoundError("Symbol not found: glFramebufferTextureARB");
        try { Handles.MH_glFramebufferTextureARB.invokeExact(handles.PFN_glFramebufferTextureARB, target, attachment, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTextureARB", e); }
    }

    /// ```
    /// void glFramebufferTextureLayerARB(unsigned int target, unsigned int attachment, unsigned int texture, int level, int layer);
    /// ```
    public void FramebufferTextureLayerARB(int target, int attachment, int texture, int level, int layer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTextureLayerARB)) throw new SymbolNotFoundError("Symbol not found: glFramebufferTextureLayerARB");
        try { Handles.MH_glFramebufferTextureLayerARB.invokeExact(handles.PFN_glFramebufferTextureLayerARB, target, attachment, texture, level, layer); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTextureLayerARB", e); }
    }

    /// ```
    /// void glFramebufferTextureFaceARB(unsigned int target, unsigned int attachment, unsigned int texture, int level, unsigned int face);
    /// ```
    public void FramebufferTextureFaceARB(int target, int attachment, int texture, int level, int face) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTextureFaceARB)) throw new SymbolNotFoundError("Symbol not found: glFramebufferTextureFaceARB");
        try { Handles.MH_glFramebufferTextureFaceARB.invokeExact(handles.PFN_glFramebufferTextureFaceARB, target, attachment, texture, level, face); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTextureFaceARB", e); }
    }

}
