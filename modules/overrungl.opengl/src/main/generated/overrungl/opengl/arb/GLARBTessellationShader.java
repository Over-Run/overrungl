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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_tessellation_shader`
public final class GLARBTessellationShader {
    public static final int GL_PATCHES = 0x000E;
    public static final int GL_PATCH_VERTICES = 0x8E72;
    public static final int GL_PATCH_DEFAULT_INNER_LEVEL = 0x8E73;
    public static final int GL_PATCH_DEFAULT_OUTER_LEVEL = 0x8E74;
    public static final int GL_TESS_CONTROL_OUTPUT_VERTICES = 0x8E75;
    public static final int GL_TESS_GEN_MODE = 0x8E76;
    public static final int GL_TESS_GEN_SPACING = 0x8E77;
    public static final int GL_TESS_GEN_VERTEX_ORDER = 0x8E78;
    public static final int GL_TESS_GEN_POINT_MODE = 0x8E79;
    public static final int GL_TRIANGLES = 0x0004;
    public static final int GL_ISOLINES = 0x8E7A;
    public static final int GL_QUADS = 0x0007;
    public static final int GL_EQUAL = 0x0202;
    public static final int GL_FRACTIONAL_ODD = 0x8E7B;
    public static final int GL_FRACTIONAL_EVEN = 0x8E7C;
    public static final int GL_CCW = 0x0901;
    public static final int GL_CW = 0x0900;
    public static final int GL_MAX_PATCH_VERTICES = 0x8E7D;
    public static final int GL_MAX_TESS_GEN_LEVEL = 0x8E7E;
    public static final int GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS = 0x8E7F;
    public static final int GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E80;
    public static final int GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS = 0x8E81;
    public static final int GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS = 0x8E82;
    public static final int GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS = 0x8E83;
    public static final int GL_MAX_TESS_PATCH_COMPONENTS = 0x8E84;
    public static final int GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS = 0x8E85;
    public static final int GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS = 0x8E86;
    public static final int GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS = 0x8E89;
    public static final int GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS = 0x8E8A;
    public static final int GL_MAX_TESS_CONTROL_INPUT_COMPONENTS = 0x886C;
    public static final int GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS = 0x886D;
    public static final int GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS = 0x8E1E;
    public static final int GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E1F;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER = 0x84F0;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x84F1;
    public static final int GL_TESS_EVALUATION_SHADER = 0x8E87;
    public static final int GL_TESS_CONTROL_SHADER = 0x8E88;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glPatchParameteri = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPatchParameterfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glPatchParameteri;
        public final MemorySegment PFN_glPatchParameterfv;
        private Handles(GLLoadFunc func) {
            PFN_glPatchParameteri = func.invoke("glPatchParameteri");
            PFN_glPatchParameterfv = func.invoke("glPatchParameterfv");
        }
    }

    public GLARBTessellationShader(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glPatchParameteri`.
    /// ```
    /// void glPatchParameteri((unsigned int) GLenum pname, (int) GLint value);
    /// ```
    public void PatchParameteri(int pname, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPatchParameteri)) throw new GLSymbolNotFoundError("Symbol not found: glPatchParameteri");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPatchParameteri", pname, value); }
        Handles.MH_glPatchParameteri.invokeExact(handles.PFN_glPatchParameteri, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in PatchParameteri", e); }
    }

    /// Invokes `glPatchParameterfv`.
    /// ```
    /// void glPatchParameterfv((unsigned int) GLenum pname, const GLfloat* values);
    /// ```
    public void PatchParameterfv(int pname, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPatchParameterfv)) throw new GLSymbolNotFoundError("Symbol not found: glPatchParameterfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPatchParameterfv", pname, values); }
        Handles.MH_glPatchParameterfv.invokeExact(handles.PFN_glPatchParameterfv, pname, values); }
        catch (Throwable e) { throw new RuntimeException("error in PatchParameterfv", e); }
    }

}
