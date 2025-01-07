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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTGpuShader4 {
    public static final int GL_SAMPLER_1D_ARRAY_EXT = 0x8DC0;
    public static final int GL_SAMPLER_2D_ARRAY_EXT = 0x8DC1;
    public static final int GL_SAMPLER_BUFFER_EXT = 0x8DC2;
    public static final int GL_SAMPLER_1D_ARRAY_SHADOW_EXT = 0x8DC3;
    public static final int GL_SAMPLER_2D_ARRAY_SHADOW_EXT = 0x8DC4;
    public static final int GL_SAMPLER_CUBE_SHADOW_EXT = 0x8DC5;
    public static final int GL_UNSIGNED_INT_VEC2_EXT = 0x8DC6;
    public static final int GL_UNSIGNED_INT_VEC3_EXT = 0x8DC7;
    public static final int GL_UNSIGNED_INT_VEC4_EXT = 0x8DC8;
    public static final int GL_INT_SAMPLER_1D_EXT = 0x8DC9;
    public static final int GL_INT_SAMPLER_2D_EXT = 0x8DCA;
    public static final int GL_INT_SAMPLER_3D_EXT = 0x8DCB;
    public static final int GL_INT_SAMPLER_CUBE_EXT = 0x8DCC;
    public static final int GL_INT_SAMPLER_2D_RECT_EXT = 0x8DCD;
    public static final int GL_INT_SAMPLER_1D_ARRAY_EXT = 0x8DCE;
    public static final int GL_INT_SAMPLER_2D_ARRAY_EXT = 0x8DCF;
    public static final int GL_INT_SAMPLER_BUFFER_EXT = 0x8DD0;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D_EXT = 0x8DD1;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_EXT = 0x8DD2;
    public static final int GL_UNSIGNED_INT_SAMPLER_3D_EXT = 0x8DD3;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_EXT = 0x8DD4;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT_EXT = 0x8DD5;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT = 0x8DD6;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT = 0x8DD7;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT = 0x8DD8;
    public static final int GL_MIN_PROGRAM_TEXEL_OFFSET_EXT = 0x8904;
    public static final int GL_MAX_PROGRAM_TEXEL_OFFSET_EXT = 0x8905;
    public static final MethodHandle MH_glGetUniformuivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetUniformuivEXT;
    public static final MethodHandle MH_glBindFragDataLocationEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBindFragDataLocationEXT;
    public static final MethodHandle MH_glGetFragDataLocationEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetFragDataLocationEXT;
    public static final MethodHandle MH_glUniform1uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUniform1uiEXT;
    public static final MethodHandle MH_glUniform2uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUniform2uiEXT;
    public static final MethodHandle MH_glUniform3uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUniform3uiEXT;
    public static final MethodHandle MH_glUniform4uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUniform4uiEXT;
    public static final MethodHandle MH_glUniform1uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform1uivEXT;
    public static final MethodHandle MH_glUniform2uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform2uivEXT;
    public static final MethodHandle MH_glUniform3uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform3uivEXT;
    public static final MethodHandle MH_glUniform4uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform4uivEXT;
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER_EXT = 0x88FD;
    public static final MethodHandle MH_glVertexAttribI1iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribI1iEXT;
    public static final MethodHandle MH_glVertexAttribI2iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribI2iEXT;
    public static final MethodHandle MH_glVertexAttribI3iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribI3iEXT;
    public static final MethodHandle MH_glVertexAttribI4iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribI4iEXT;
    public static final MethodHandle MH_glVertexAttribI1uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribI1uiEXT;
    public static final MethodHandle MH_glVertexAttribI2uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribI2uiEXT;
    public static final MethodHandle MH_glVertexAttribI3uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribI3uiEXT;
    public static final MethodHandle MH_glVertexAttribI4uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribI4uiEXT;
    public static final MethodHandle MH_glVertexAttribI1ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI1ivEXT;
    public static final MethodHandle MH_glVertexAttribI2ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI2ivEXT;
    public static final MethodHandle MH_glVertexAttribI3ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI3ivEXT;
    public static final MethodHandle MH_glVertexAttribI4ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI4ivEXT;
    public static final MethodHandle MH_glVertexAttribI1uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI1uivEXT;
    public static final MethodHandle MH_glVertexAttribI2uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI2uivEXT;
    public static final MethodHandle MH_glVertexAttribI3uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI3uivEXT;
    public static final MethodHandle MH_glVertexAttribI4uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI4uivEXT;
    public static final MethodHandle MH_glVertexAttribI4bvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI4bvEXT;
    public static final MethodHandle MH_glVertexAttribI4svEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI4svEXT;
    public static final MethodHandle MH_glVertexAttribI4ubvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI4ubvEXT;
    public static final MethodHandle MH_glVertexAttribI4usvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI4usvEXT;
    public static final MethodHandle MH_glVertexAttribIPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribIPointerEXT;
    public static final MethodHandle MH_glGetVertexAttribIivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexAttribIivEXT;
    public static final MethodHandle MH_glGetVertexAttribIuivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexAttribIuivEXT;

    public GLEXTGpuShader4(overrungl.opengl.GLLoadFunc func) {
        PFN_glGetUniformuivEXT = func.invoke("glGetUniformuivEXT", "glGetUniformuiv");
        PFN_glBindFragDataLocationEXT = func.invoke("glBindFragDataLocationEXT", "glBindFragDataLocation");
        PFN_glGetFragDataLocationEXT = func.invoke("glGetFragDataLocationEXT", "glGetFragDataLocation");
        PFN_glUniform1uiEXT = func.invoke("glUniform1uiEXT", "glUniform1ui");
        PFN_glUniform2uiEXT = func.invoke("glUniform2uiEXT", "glUniform2ui");
        PFN_glUniform3uiEXT = func.invoke("glUniform3uiEXT", "glUniform3ui");
        PFN_glUniform4uiEXT = func.invoke("glUniform4uiEXT", "glUniform4ui");
        PFN_glUniform1uivEXT = func.invoke("glUniform1uivEXT", "glUniform1uiv");
        PFN_glUniform2uivEXT = func.invoke("glUniform2uivEXT", "glUniform2uiv");
        PFN_glUniform3uivEXT = func.invoke("glUniform3uivEXT", "glUniform3uiv");
        PFN_glUniform4uivEXT = func.invoke("glUniform4uivEXT", "glUniform4uiv");PFN_glVertexAttribI1iEXT = func.invoke("glVertexAttribI1iEXT", "glVertexAttribI1i");
        PFN_glVertexAttribI2iEXT = func.invoke("glVertexAttribI2iEXT", "glVertexAttribI2i");
        PFN_glVertexAttribI3iEXT = func.invoke("glVertexAttribI3iEXT", "glVertexAttribI3i");
        PFN_glVertexAttribI4iEXT = func.invoke("glVertexAttribI4iEXT", "glVertexAttribI4i");
        PFN_glVertexAttribI1uiEXT = func.invoke("glVertexAttribI1uiEXT", "glVertexAttribI1ui");
        PFN_glVertexAttribI2uiEXT = func.invoke("glVertexAttribI2uiEXT", "glVertexAttribI2ui");
        PFN_glVertexAttribI3uiEXT = func.invoke("glVertexAttribI3uiEXT", "glVertexAttribI3ui");
        PFN_glVertexAttribI4uiEXT = func.invoke("glVertexAttribI4uiEXT", "glVertexAttribI4ui");
        PFN_glVertexAttribI1ivEXT = func.invoke("glVertexAttribI1ivEXT", "glVertexAttribI1iv");
        PFN_glVertexAttribI2ivEXT = func.invoke("glVertexAttribI2ivEXT", "glVertexAttribI2iv");
        PFN_glVertexAttribI3ivEXT = func.invoke("glVertexAttribI3ivEXT", "glVertexAttribI3iv");
        PFN_glVertexAttribI4ivEXT = func.invoke("glVertexAttribI4ivEXT", "glVertexAttribI4iv");
        PFN_glVertexAttribI1uivEXT = func.invoke("glVertexAttribI1uivEXT", "glVertexAttribI1uiv");
        PFN_glVertexAttribI2uivEXT = func.invoke("glVertexAttribI2uivEXT", "glVertexAttribI2uiv");
        PFN_glVertexAttribI3uivEXT = func.invoke("glVertexAttribI3uivEXT", "glVertexAttribI3uiv");
        PFN_glVertexAttribI4uivEXT = func.invoke("glVertexAttribI4uivEXT", "glVertexAttribI4uiv");
        PFN_glVertexAttribI4bvEXT = func.invoke("glVertexAttribI4bvEXT", "glVertexAttribI4bv");
        PFN_glVertexAttribI4svEXT = func.invoke("glVertexAttribI4svEXT", "glVertexAttribI4sv");
        PFN_glVertexAttribI4ubvEXT = func.invoke("glVertexAttribI4ubvEXT", "glVertexAttribI4ubv");
        PFN_glVertexAttribI4usvEXT = func.invoke("glVertexAttribI4usvEXT", "glVertexAttribI4usv");
        PFN_glVertexAttribIPointerEXT = func.invoke("glVertexAttribIPointerEXT", "glVertexAttribIPointer");
        PFN_glGetVertexAttribIivEXT = func.invoke("glGetVertexAttribIivEXT", "glGetVertexAttribIiv");
        PFN_glGetVertexAttribIuivEXT = func.invoke("glGetVertexAttribIuivEXT", "glGetVertexAttribIuiv");
    }

    public void GetUniformuivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetUniformuivEXT)) { try {
            MH_glGetUniformuivEXT.invokeExact(PFN_glGetUniformuivEXT, program, location, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetUniformuivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetUniformuivEXT"); }
    }

    public void BindFragDataLocationEXT(@CType("GLuint") int program, @CType("GLuint") int color, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        if (!Unmarshal.isNullPointer(PFN_glBindFragDataLocationEXT)) { try {
            MH_glBindFragDataLocationEXT.invokeExact(PFN_glBindFragDataLocationEXT, program, color, name);
        } catch (Throwable e) { throw new RuntimeException("error in glBindFragDataLocationEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBindFragDataLocationEXT"); }
    }

    public @CType("GLint") int GetFragDataLocationEXT(@CType("GLuint") int program, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        if (!Unmarshal.isNullPointer(PFN_glGetFragDataLocationEXT)) { try {
            return (int) MH_glGetFragDataLocationEXT.invokeExact(PFN_glGetFragDataLocationEXT, program, name);
        } catch (Throwable e) { throw new RuntimeException("error in glGetFragDataLocationEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetFragDataLocationEXT"); }
    }

    public void Uniform1uiEXT(@CType("GLint") int location, @CType("GLuint") int v0) {
        if (!Unmarshal.isNullPointer(PFN_glUniform1uiEXT)) { try {
            MH_glUniform1uiEXT.invokeExact(PFN_glUniform1uiEXT, location, v0);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform1uiEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform1uiEXT"); }
    }

    public void Uniform2uiEXT(@CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1) {
        if (!Unmarshal.isNullPointer(PFN_glUniform2uiEXT)) { try {
            MH_glUniform2uiEXT.invokeExact(PFN_glUniform2uiEXT, location, v0, v1);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform2uiEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform2uiEXT"); }
    }

    public void Uniform3uiEXT(@CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1, @CType("GLuint") int v2) {
        if (!Unmarshal.isNullPointer(PFN_glUniform3uiEXT)) { try {
            MH_glUniform3uiEXT.invokeExact(PFN_glUniform3uiEXT, location, v0, v1, v2);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform3uiEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform3uiEXT"); }
    }

    public void Uniform4uiEXT(@CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1, @CType("GLuint") int v2, @CType("GLuint") int v3) {
        if (!Unmarshal.isNullPointer(PFN_glUniform4uiEXT)) { try {
            MH_glUniform4uiEXT.invokeExact(PFN_glUniform4uiEXT, location, v0, v1, v2, v3);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform4uiEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform4uiEXT"); }
    }

    public void Uniform1uivEXT(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glUniform1uivEXT)) { try {
            MH_glUniform1uivEXT.invokeExact(PFN_glUniform1uivEXT, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform1uivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform1uivEXT"); }
    }

    public void Uniform2uivEXT(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glUniform2uivEXT)) { try {
            MH_glUniform2uivEXT.invokeExact(PFN_glUniform2uivEXT, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform2uivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform2uivEXT"); }
    }

    public void Uniform3uivEXT(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glUniform3uivEXT)) { try {
            MH_glUniform3uivEXT.invokeExact(PFN_glUniform3uivEXT, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform3uivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform3uivEXT"); }
    }

    public void Uniform4uivEXT(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glUniform4uivEXT)) { try {
            MH_glUniform4uivEXT.invokeExact(PFN_glUniform4uivEXT, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform4uivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform4uivEXT"); }
    }

    public void VertexAttribI1iEXT(@CType("GLuint") int index, @CType("GLint") int x) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI1iEXT)) { try {
            MH_glVertexAttribI1iEXT.invokeExact(PFN_glVertexAttribI1iEXT, index, x);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI1iEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI1iEXT"); }
    }

    public void VertexAttribI2iEXT(@CType("GLuint") int index, @CType("GLint") int x, @CType("GLint") int y) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI2iEXT)) { try {
            MH_glVertexAttribI2iEXT.invokeExact(PFN_glVertexAttribI2iEXT, index, x, y);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI2iEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI2iEXT"); }
    }

    public void VertexAttribI3iEXT(@CType("GLuint") int index, @CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI3iEXT)) { try {
            MH_glVertexAttribI3iEXT.invokeExact(PFN_glVertexAttribI3iEXT, index, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI3iEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI3iEXT"); }
    }

    public void VertexAttribI4iEXT(@CType("GLuint") int index, @CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z, @CType("GLint") int w) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI4iEXT)) { try {
            MH_glVertexAttribI4iEXT.invokeExact(PFN_glVertexAttribI4iEXT, index, x, y, z, w);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4iEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4iEXT"); }
    }

    public void VertexAttribI1uiEXT(@CType("GLuint") int index, @CType("GLuint") int x) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI1uiEXT)) { try {
            MH_glVertexAttribI1uiEXT.invokeExact(PFN_glVertexAttribI1uiEXT, index, x);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI1uiEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI1uiEXT"); }
    }

    public void VertexAttribI2uiEXT(@CType("GLuint") int index, @CType("GLuint") int x, @CType("GLuint") int y) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI2uiEXT)) { try {
            MH_glVertexAttribI2uiEXT.invokeExact(PFN_glVertexAttribI2uiEXT, index, x, y);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI2uiEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI2uiEXT"); }
    }

    public void VertexAttribI3uiEXT(@CType("GLuint") int index, @CType("GLuint") int x, @CType("GLuint") int y, @CType("GLuint") int z) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI3uiEXT)) { try {
            MH_glVertexAttribI3uiEXT.invokeExact(PFN_glVertexAttribI3uiEXT, index, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI3uiEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI3uiEXT"); }
    }

    public void VertexAttribI4uiEXT(@CType("GLuint") int index, @CType("GLuint") int x, @CType("GLuint") int y, @CType("GLuint") int z, @CType("GLuint") int w) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI4uiEXT)) { try {
            MH_glVertexAttribI4uiEXT.invokeExact(PFN_glVertexAttribI4uiEXT, index, x, y, z, w);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4uiEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4uiEXT"); }
    }

    public void VertexAttribI1ivEXT(@CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI1ivEXT)) { try {
            MH_glVertexAttribI1ivEXT.invokeExact(PFN_glVertexAttribI1ivEXT, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI1ivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI1ivEXT"); }
    }

    public void VertexAttribI2ivEXT(@CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI2ivEXT)) { try {
            MH_glVertexAttribI2ivEXT.invokeExact(PFN_glVertexAttribI2ivEXT, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI2ivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI2ivEXT"); }
    }

    public void VertexAttribI3ivEXT(@CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI3ivEXT)) { try {
            MH_glVertexAttribI3ivEXT.invokeExact(PFN_glVertexAttribI3ivEXT, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI3ivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI3ivEXT"); }
    }

    public void VertexAttribI4ivEXT(@CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI4ivEXT)) { try {
            MH_glVertexAttribI4ivEXT.invokeExact(PFN_glVertexAttribI4ivEXT, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4ivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4ivEXT"); }
    }

    public void VertexAttribI1uivEXT(@CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI1uivEXT)) { try {
            MH_glVertexAttribI1uivEXT.invokeExact(PFN_glVertexAttribI1uivEXT, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI1uivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI1uivEXT"); }
    }

    public void VertexAttribI2uivEXT(@CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI2uivEXT)) { try {
            MH_glVertexAttribI2uivEXT.invokeExact(PFN_glVertexAttribI2uivEXT, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI2uivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI2uivEXT"); }
    }

    public void VertexAttribI3uivEXT(@CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI3uivEXT)) { try {
            MH_glVertexAttribI3uivEXT.invokeExact(PFN_glVertexAttribI3uivEXT, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI3uivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI3uivEXT"); }
    }

    public void VertexAttribI4uivEXT(@CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI4uivEXT)) { try {
            MH_glVertexAttribI4uivEXT.invokeExact(PFN_glVertexAttribI4uivEXT, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4uivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4uivEXT"); }
    }

    public void VertexAttribI4bvEXT(@CType("GLuint") int index, @CType("const GLbyte *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI4bvEXT)) { try {
            MH_glVertexAttribI4bvEXT.invokeExact(PFN_glVertexAttribI4bvEXT, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4bvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4bvEXT"); }
    }

    public void VertexAttribI4svEXT(@CType("GLuint") int index, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI4svEXT)) { try {
            MH_glVertexAttribI4svEXT.invokeExact(PFN_glVertexAttribI4svEXT, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4svEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4svEXT"); }
    }

    public void VertexAttribI4ubvEXT(@CType("GLuint") int index, @CType("const GLubyte *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI4ubvEXT)) { try {
            MH_glVertexAttribI4ubvEXT.invokeExact(PFN_glVertexAttribI4ubvEXT, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4ubvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4ubvEXT"); }
    }

    public void VertexAttribI4usvEXT(@CType("GLuint") int index, @CType("const GLushort *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribI4usvEXT)) { try {
            MH_glVertexAttribI4usvEXT.invokeExact(PFN_glVertexAttribI4usvEXT, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4usvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4usvEXT"); }
    }

    public void VertexAttribIPointerEXT(@CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribIPointerEXT)) { try {
            MH_glVertexAttribIPointerEXT.invokeExact(PFN_glVertexAttribIPointerEXT, index, size, type, stride, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribIPointerEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribIPointerEXT"); }
    }

    public void GetVertexAttribIivEXT(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetVertexAttribIivEXT)) { try {
            MH_glGetVertexAttribIivEXT.invokeExact(PFN_glGetVertexAttribIivEXT, index, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribIivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribIivEXT"); }
    }

    public void GetVertexAttribIuivEXT(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetVertexAttribIuivEXT)) { try {
            MH_glGetVertexAttribIuivEXT.invokeExact(PFN_glGetVertexAttribIuivEXT, index, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribIuivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribIuivEXT"); }
    }

}
