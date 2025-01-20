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
import java.util.*;
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
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER_EXT = 0x88FD;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glGetUniformuivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glBindFragDataLocationEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetFragDataLocationEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform1uiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUniform2uiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUniform3uiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUniform4uiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUniform1uivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform2uivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform3uivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform4uivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI1iEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribI2iEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribI3iEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribI4iEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribI1uiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribI2uiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribI3uiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribI4uiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribI1ivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI2ivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI3ivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI4ivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI1uivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI2uivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI3uivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI4uivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI4bvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI4svEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI4ubvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI4usvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribIPointerEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVertexAttribIivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVertexAttribIuivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glGetUniformuivEXT,
            FD_glBindFragDataLocationEXT,
            FD_glGetFragDataLocationEXT,
            FD_glUniform1uiEXT,
            FD_glUniform2uiEXT,
            FD_glUniform3uiEXT,
            FD_glUniform4uiEXT,
            FD_glUniform1uivEXT,
            FD_glUniform2uivEXT,
            FD_glUniform3uivEXT,
            FD_glUniform4uivEXT,
            FD_glVertexAttribI1iEXT,
            FD_glVertexAttribI2iEXT,
            FD_glVertexAttribI3iEXT,
            FD_glVertexAttribI4iEXT,
            FD_glVertexAttribI1uiEXT,
            FD_glVertexAttribI2uiEXT,
            FD_glVertexAttribI3uiEXT,
            FD_glVertexAttribI4uiEXT,
            FD_glVertexAttribI1ivEXT,
            FD_glVertexAttribI2ivEXT,
            FD_glVertexAttribI3ivEXT,
            FD_glVertexAttribI4ivEXT,
            FD_glVertexAttribI1uivEXT,
            FD_glVertexAttribI2uivEXT,
            FD_glVertexAttribI3uivEXT,
            FD_glVertexAttribI4uivEXT,
            FD_glVertexAttribI4bvEXT,
            FD_glVertexAttribI4svEXT,
            FD_glVertexAttribI4ubvEXT,
            FD_glVertexAttribI4usvEXT,
            FD_glVertexAttribIPointerEXT,
            FD_glGetVertexAttribIivEXT,
            FD_glGetVertexAttribIuivEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glGetUniformuivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetUniformuivEXT);
        public static final MethodHandle MH_glBindFragDataLocationEXT = RuntimeHelper.downcall(Descriptors.FD_glBindFragDataLocationEXT);
        public static final MethodHandle MH_glGetFragDataLocationEXT = RuntimeHelper.downcall(Descriptors.FD_glGetFragDataLocationEXT);
        public static final MethodHandle MH_glUniform1uiEXT = RuntimeHelper.downcall(Descriptors.FD_glUniform1uiEXT);
        public static final MethodHandle MH_glUniform2uiEXT = RuntimeHelper.downcall(Descriptors.FD_glUniform2uiEXT);
        public static final MethodHandle MH_glUniform3uiEXT = RuntimeHelper.downcall(Descriptors.FD_glUniform3uiEXT);
        public static final MethodHandle MH_glUniform4uiEXT = RuntimeHelper.downcall(Descriptors.FD_glUniform4uiEXT);
        public static final MethodHandle MH_glUniform1uivEXT = RuntimeHelper.downcall(Descriptors.FD_glUniform1uivEXT);
        public static final MethodHandle MH_glUniform2uivEXT = RuntimeHelper.downcall(Descriptors.FD_glUniform2uivEXT);
        public static final MethodHandle MH_glUniform3uivEXT = RuntimeHelper.downcall(Descriptors.FD_glUniform3uivEXT);
        public static final MethodHandle MH_glUniform4uivEXT = RuntimeHelper.downcall(Descriptors.FD_glUniform4uivEXT);
        public static final MethodHandle MH_glVertexAttribI1iEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI1iEXT);
        public static final MethodHandle MH_glVertexAttribI2iEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI2iEXT);
        public static final MethodHandle MH_glVertexAttribI3iEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI3iEXT);
        public static final MethodHandle MH_glVertexAttribI4iEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI4iEXT);
        public static final MethodHandle MH_glVertexAttribI1uiEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI1uiEXT);
        public static final MethodHandle MH_glVertexAttribI2uiEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI2uiEXT);
        public static final MethodHandle MH_glVertexAttribI3uiEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI3uiEXT);
        public static final MethodHandle MH_glVertexAttribI4uiEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI4uiEXT);
        public static final MethodHandle MH_glVertexAttribI1ivEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI1ivEXT);
        public static final MethodHandle MH_glVertexAttribI2ivEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI2ivEXT);
        public static final MethodHandle MH_glVertexAttribI3ivEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI3ivEXT);
        public static final MethodHandle MH_glVertexAttribI4ivEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI4ivEXT);
        public static final MethodHandle MH_glVertexAttribI1uivEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI1uivEXT);
        public static final MethodHandle MH_glVertexAttribI2uivEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI2uivEXT);
        public static final MethodHandle MH_glVertexAttribI3uivEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI3uivEXT);
        public static final MethodHandle MH_glVertexAttribI4uivEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI4uivEXT);
        public static final MethodHandle MH_glVertexAttribI4bvEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI4bvEXT);
        public static final MethodHandle MH_glVertexAttribI4svEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI4svEXT);
        public static final MethodHandle MH_glVertexAttribI4ubvEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI4ubvEXT);
        public static final MethodHandle MH_glVertexAttribI4usvEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI4usvEXT);
        public static final MethodHandle MH_glVertexAttribIPointerEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribIPointerEXT);
        public static final MethodHandle MH_glGetVertexAttribIivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetVertexAttribIivEXT);
        public static final MethodHandle MH_glGetVertexAttribIuivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetVertexAttribIuivEXT);
        public final MemorySegment PFN_glGetUniformuivEXT;
        public final MemorySegment PFN_glBindFragDataLocationEXT;
        public final MemorySegment PFN_glGetFragDataLocationEXT;
        public final MemorySegment PFN_glUniform1uiEXT;
        public final MemorySegment PFN_glUniform2uiEXT;
        public final MemorySegment PFN_glUniform3uiEXT;
        public final MemorySegment PFN_glUniform4uiEXT;
        public final MemorySegment PFN_glUniform1uivEXT;
        public final MemorySegment PFN_glUniform2uivEXT;
        public final MemorySegment PFN_glUniform3uivEXT;
        public final MemorySegment PFN_glUniform4uivEXT;
        public final MemorySegment PFN_glVertexAttribI1iEXT;
        public final MemorySegment PFN_glVertexAttribI2iEXT;
        public final MemorySegment PFN_glVertexAttribI3iEXT;
        public final MemorySegment PFN_glVertexAttribI4iEXT;
        public final MemorySegment PFN_glVertexAttribI1uiEXT;
        public final MemorySegment PFN_glVertexAttribI2uiEXT;
        public final MemorySegment PFN_glVertexAttribI3uiEXT;
        public final MemorySegment PFN_glVertexAttribI4uiEXT;
        public final MemorySegment PFN_glVertexAttribI1ivEXT;
        public final MemorySegment PFN_glVertexAttribI2ivEXT;
        public final MemorySegment PFN_glVertexAttribI3ivEXT;
        public final MemorySegment PFN_glVertexAttribI4ivEXT;
        public final MemorySegment PFN_glVertexAttribI1uivEXT;
        public final MemorySegment PFN_glVertexAttribI2uivEXT;
        public final MemorySegment PFN_glVertexAttribI3uivEXT;
        public final MemorySegment PFN_glVertexAttribI4uivEXT;
        public final MemorySegment PFN_glVertexAttribI4bvEXT;
        public final MemorySegment PFN_glVertexAttribI4svEXT;
        public final MemorySegment PFN_glVertexAttribI4ubvEXT;
        public final MemorySegment PFN_glVertexAttribI4usvEXT;
        public final MemorySegment PFN_glVertexAttribIPointerEXT;
        public final MemorySegment PFN_glGetVertexAttribIivEXT;
        public final MemorySegment PFN_glGetVertexAttribIuivEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
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
    }

    public GLEXTGpuShader4(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void GetUniformuivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetUniformuivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetUniformuivEXT");
        try { Handles.MH_glGetUniformuivEXT.invokeExact(handles.PFN_glGetUniformuivEXT, program, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformuivEXT", e); }
    }

    public void BindFragDataLocationEXT(@CType("GLuint") int program, @CType("GLuint") int color, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindFragDataLocationEXT)) throw new SymbolNotFoundError("Symbol not found: glBindFragDataLocationEXT");
        try { Handles.MH_glBindFragDataLocationEXT.invokeExact(handles.PFN_glBindFragDataLocationEXT, program, color, name); }
        catch (Throwable e) { throw new RuntimeException("error in glBindFragDataLocationEXT", e); }
    }

    public @CType("GLint") int GetFragDataLocationEXT(@CType("GLuint") int program, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetFragDataLocationEXT)) throw new SymbolNotFoundError("Symbol not found: glGetFragDataLocationEXT");
        try { return (int) Handles.MH_glGetFragDataLocationEXT.invokeExact(handles.PFN_glGetFragDataLocationEXT, program, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFragDataLocationEXT", e); }
    }

    public void Uniform1uiEXT(@CType("GLint") int location, @CType("GLuint") int v0) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform1uiEXT)) throw new SymbolNotFoundError("Symbol not found: glUniform1uiEXT");
        try { Handles.MH_glUniform1uiEXT.invokeExact(handles.PFN_glUniform1uiEXT, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1uiEXT", e); }
    }

    public void Uniform2uiEXT(@CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform2uiEXT)) throw new SymbolNotFoundError("Symbol not found: glUniform2uiEXT");
        try { Handles.MH_glUniform2uiEXT.invokeExact(handles.PFN_glUniform2uiEXT, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2uiEXT", e); }
    }

    public void Uniform3uiEXT(@CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1, @CType("GLuint") int v2) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform3uiEXT)) throw new SymbolNotFoundError("Symbol not found: glUniform3uiEXT");
        try { Handles.MH_glUniform3uiEXT.invokeExact(handles.PFN_glUniform3uiEXT, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3uiEXT", e); }
    }

    public void Uniform4uiEXT(@CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1, @CType("GLuint") int v2, @CType("GLuint") int v3) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform4uiEXT)) throw new SymbolNotFoundError("Symbol not found: glUniform4uiEXT");
        try { Handles.MH_glUniform4uiEXT.invokeExact(handles.PFN_glUniform4uiEXT, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4uiEXT", e); }
    }

    public void Uniform1uivEXT(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform1uivEXT)) throw new SymbolNotFoundError("Symbol not found: glUniform1uivEXT");
        try { Handles.MH_glUniform1uivEXT.invokeExact(handles.PFN_glUniform1uivEXT, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1uivEXT", e); }
    }

    public void Uniform2uivEXT(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform2uivEXT)) throw new SymbolNotFoundError("Symbol not found: glUniform2uivEXT");
        try { Handles.MH_glUniform2uivEXT.invokeExact(handles.PFN_glUniform2uivEXT, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2uivEXT", e); }
    }

    public void Uniform3uivEXT(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform3uivEXT)) throw new SymbolNotFoundError("Symbol not found: glUniform3uivEXT");
        try { Handles.MH_glUniform3uivEXT.invokeExact(handles.PFN_glUniform3uivEXT, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3uivEXT", e); }
    }

    public void Uniform4uivEXT(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform4uivEXT)) throw new SymbolNotFoundError("Symbol not found: glUniform4uivEXT");
        try { Handles.MH_glUniform4uivEXT.invokeExact(handles.PFN_glUniform4uivEXT, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4uivEXT", e); }
    }

    public void VertexAttribI1iEXT(@CType("GLuint") int index, @CType("GLint") int x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI1iEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI1iEXT");
        try { Handles.MH_glVertexAttribI1iEXT.invokeExact(handles.PFN_glVertexAttribI1iEXT, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI1iEXT", e); }
    }

    public void VertexAttribI2iEXT(@CType("GLuint") int index, @CType("GLint") int x, @CType("GLint") int y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI2iEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI2iEXT");
        try { Handles.MH_glVertexAttribI2iEXT.invokeExact(handles.PFN_glVertexAttribI2iEXT, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI2iEXT", e); }
    }

    public void VertexAttribI3iEXT(@CType("GLuint") int index, @CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI3iEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI3iEXT");
        try { Handles.MH_glVertexAttribI3iEXT.invokeExact(handles.PFN_glVertexAttribI3iEXT, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI3iEXT", e); }
    }

    public void VertexAttribI4iEXT(@CType("GLuint") int index, @CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z, @CType("GLint") int w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI4iEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4iEXT");
        try { Handles.MH_glVertexAttribI4iEXT.invokeExact(handles.PFN_glVertexAttribI4iEXT, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4iEXT", e); }
    }

    public void VertexAttribI1uiEXT(@CType("GLuint") int index, @CType("GLuint") int x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI1uiEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI1uiEXT");
        try { Handles.MH_glVertexAttribI1uiEXT.invokeExact(handles.PFN_glVertexAttribI1uiEXT, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI1uiEXT", e); }
    }

    public void VertexAttribI2uiEXT(@CType("GLuint") int index, @CType("GLuint") int x, @CType("GLuint") int y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI2uiEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI2uiEXT");
        try { Handles.MH_glVertexAttribI2uiEXT.invokeExact(handles.PFN_glVertexAttribI2uiEXT, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI2uiEXT", e); }
    }

    public void VertexAttribI3uiEXT(@CType("GLuint") int index, @CType("GLuint") int x, @CType("GLuint") int y, @CType("GLuint") int z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI3uiEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI3uiEXT");
        try { Handles.MH_glVertexAttribI3uiEXT.invokeExact(handles.PFN_glVertexAttribI3uiEXT, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI3uiEXT", e); }
    }

    public void VertexAttribI4uiEXT(@CType("GLuint") int index, @CType("GLuint") int x, @CType("GLuint") int y, @CType("GLuint") int z, @CType("GLuint") int w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI4uiEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4uiEXT");
        try { Handles.MH_glVertexAttribI4uiEXT.invokeExact(handles.PFN_glVertexAttribI4uiEXT, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4uiEXT", e); }
    }

    public void VertexAttribI1ivEXT(@CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI1ivEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI1ivEXT");
        try { Handles.MH_glVertexAttribI1ivEXT.invokeExact(handles.PFN_glVertexAttribI1ivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI1ivEXT", e); }
    }

    public void VertexAttribI2ivEXT(@CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI2ivEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI2ivEXT");
        try { Handles.MH_glVertexAttribI2ivEXT.invokeExact(handles.PFN_glVertexAttribI2ivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI2ivEXT", e); }
    }

    public void VertexAttribI3ivEXT(@CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI3ivEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI3ivEXT");
        try { Handles.MH_glVertexAttribI3ivEXT.invokeExact(handles.PFN_glVertexAttribI3ivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI3ivEXT", e); }
    }

    public void VertexAttribI4ivEXT(@CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI4ivEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4ivEXT");
        try { Handles.MH_glVertexAttribI4ivEXT.invokeExact(handles.PFN_glVertexAttribI4ivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4ivEXT", e); }
    }

    public void VertexAttribI1uivEXT(@CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI1uivEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI1uivEXT");
        try { Handles.MH_glVertexAttribI1uivEXT.invokeExact(handles.PFN_glVertexAttribI1uivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI1uivEXT", e); }
    }

    public void VertexAttribI2uivEXT(@CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI2uivEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI2uivEXT");
        try { Handles.MH_glVertexAttribI2uivEXT.invokeExact(handles.PFN_glVertexAttribI2uivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI2uivEXT", e); }
    }

    public void VertexAttribI3uivEXT(@CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI3uivEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI3uivEXT");
        try { Handles.MH_glVertexAttribI3uivEXT.invokeExact(handles.PFN_glVertexAttribI3uivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI3uivEXT", e); }
    }

    public void VertexAttribI4uivEXT(@CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI4uivEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4uivEXT");
        try { Handles.MH_glVertexAttribI4uivEXT.invokeExact(handles.PFN_glVertexAttribI4uivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4uivEXT", e); }
    }

    public void VertexAttribI4bvEXT(@CType("GLuint") int index, @CType("const GLbyte *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI4bvEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4bvEXT");
        try { Handles.MH_glVertexAttribI4bvEXT.invokeExact(handles.PFN_glVertexAttribI4bvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4bvEXT", e); }
    }

    public void VertexAttribI4svEXT(@CType("GLuint") int index, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI4svEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4svEXT");
        try { Handles.MH_glVertexAttribI4svEXT.invokeExact(handles.PFN_glVertexAttribI4svEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4svEXT", e); }
    }

    public void VertexAttribI4ubvEXT(@CType("GLuint") int index, @CType("const GLubyte *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI4ubvEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4ubvEXT");
        try { Handles.MH_glVertexAttribI4ubvEXT.invokeExact(handles.PFN_glVertexAttribI4ubvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4ubvEXT", e); }
    }

    public void VertexAttribI4usvEXT(@CType("GLuint") int index, @CType("const GLushort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI4usvEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4usvEXT");
        try { Handles.MH_glVertexAttribI4usvEXT.invokeExact(handles.PFN_glVertexAttribI4usvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4usvEXT", e); }
    }

    public void VertexAttribIPointerEXT(@CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribIPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribIPointerEXT");
        try { Handles.MH_glVertexAttribIPointerEXT.invokeExact(handles.PFN_glVertexAttribIPointerEXT, index, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribIPointerEXT", e); }
    }

    public void GetVertexAttribIivEXT(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexAttribIivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribIivEXT");
        try { Handles.MH_glGetVertexAttribIivEXT.invokeExact(handles.PFN_glGetVertexAttribIivEXT, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribIivEXT", e); }
    }

    public void GetVertexAttribIuivEXT(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexAttribIuivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribIuivEXT");
        try { Handles.MH_glGetVertexAttribIuivEXT.invokeExact(handles.PFN_glGetVertexAttribIuivEXT, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribIuivEXT", e); }
    }

}
