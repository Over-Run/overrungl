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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBGpuShaderFp64 {
    public static final int GL_DOUBLE = 0x140A;
    public static final int GL_DOUBLE_VEC2 = 0x8FFC;
    public static final int GL_DOUBLE_VEC3 = 0x8FFD;
    public static final int GL_DOUBLE_VEC4 = 0x8FFE;
    public static final int GL_DOUBLE_MAT2 = 0x8F46;
    public static final int GL_DOUBLE_MAT3 = 0x8F47;
    public static final int GL_DOUBLE_MAT4 = 0x8F48;
    public static final int GL_DOUBLE_MAT2x3 = 0x8F49;
    public static final int GL_DOUBLE_MAT2x4 = 0x8F4A;
    public static final int GL_DOUBLE_MAT3x2 = 0x8F4B;
    public static final int GL_DOUBLE_MAT3x4 = 0x8F4C;
    public static final int GL_DOUBLE_MAT4x2 = 0x8F4D;
    public static final int GL_DOUBLE_MAT4x3 = 0x8F4E;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glUniform1d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glUniform2d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glUniform3d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glUniform4d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glUniform1dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform2dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform3dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform4dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix2dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix3dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix4dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix2x3dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix2x4dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix3x2dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix3x4dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix4x2dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix4x3dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetUniformdv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glUniform1d,
            FD_glUniform2d,
            FD_glUniform3d,
            FD_glUniform4d,
            FD_glUniform1dv,
            FD_glUniform2dv,
            FD_glUniform3dv,
            FD_glUniform4dv,
            FD_glUniformMatrix2dv,
            FD_glUniformMatrix3dv,
            FD_glUniformMatrix4dv,
            FD_glUniformMatrix2x3dv,
            FD_glUniformMatrix2x4dv,
            FD_glUniformMatrix3x2dv,
            FD_glUniformMatrix3x4dv,
            FD_glUniformMatrix4x2dv,
            FD_glUniformMatrix4x3dv,
            FD_glGetUniformdv
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glUniform1d = RuntimeHelper.downcall(Descriptors.FD_glUniform1d);
        public static final MethodHandle MH_glUniform2d = RuntimeHelper.downcall(Descriptors.FD_glUniform2d);
        public static final MethodHandle MH_glUniform3d = RuntimeHelper.downcall(Descriptors.FD_glUniform3d);
        public static final MethodHandle MH_glUniform4d = RuntimeHelper.downcall(Descriptors.FD_glUniform4d);
        public static final MethodHandle MH_glUniform1dv = RuntimeHelper.downcall(Descriptors.FD_glUniform1dv);
        public static final MethodHandle MH_glUniform2dv = RuntimeHelper.downcall(Descriptors.FD_glUniform2dv);
        public static final MethodHandle MH_glUniform3dv = RuntimeHelper.downcall(Descriptors.FD_glUniform3dv);
        public static final MethodHandle MH_glUniform4dv = RuntimeHelper.downcall(Descriptors.FD_glUniform4dv);
        public static final MethodHandle MH_glUniformMatrix2dv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix2dv);
        public static final MethodHandle MH_glUniformMatrix3dv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix3dv);
        public static final MethodHandle MH_glUniformMatrix4dv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix4dv);
        public static final MethodHandle MH_glUniformMatrix2x3dv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix2x3dv);
        public static final MethodHandle MH_glUniformMatrix2x4dv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix2x4dv);
        public static final MethodHandle MH_glUniformMatrix3x2dv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix3x2dv);
        public static final MethodHandle MH_glUniformMatrix3x4dv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix3x4dv);
        public static final MethodHandle MH_glUniformMatrix4x2dv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix4x2dv);
        public static final MethodHandle MH_glUniformMatrix4x3dv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix4x3dv);
        public static final MethodHandle MH_glGetUniformdv = RuntimeHelper.downcall(Descriptors.FD_glGetUniformdv);
        public final MemorySegment PFN_glUniform1d;
        public final MemorySegment PFN_glUniform2d;
        public final MemorySegment PFN_glUniform3d;
        public final MemorySegment PFN_glUniform4d;
        public final MemorySegment PFN_glUniform1dv;
        public final MemorySegment PFN_glUniform2dv;
        public final MemorySegment PFN_glUniform3dv;
        public final MemorySegment PFN_glUniform4dv;
        public final MemorySegment PFN_glUniformMatrix2dv;
        public final MemorySegment PFN_glUniformMatrix3dv;
        public final MemorySegment PFN_glUniformMatrix4dv;
        public final MemorySegment PFN_glUniformMatrix2x3dv;
        public final MemorySegment PFN_glUniformMatrix2x4dv;
        public final MemorySegment PFN_glUniformMatrix3x2dv;
        public final MemorySegment PFN_glUniformMatrix3x4dv;
        public final MemorySegment PFN_glUniformMatrix4x2dv;
        public final MemorySegment PFN_glUniformMatrix4x3dv;
        public final MemorySegment PFN_glGetUniformdv;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glUniform1d = func.invoke("glUniform1d");
            PFN_glUniform2d = func.invoke("glUniform2d");
            PFN_glUniform3d = func.invoke("glUniform3d");
            PFN_glUniform4d = func.invoke("glUniform4d");
            PFN_glUniform1dv = func.invoke("glUniform1dv");
            PFN_glUniform2dv = func.invoke("glUniform2dv");
            PFN_glUniform3dv = func.invoke("glUniform3dv");
            PFN_glUniform4dv = func.invoke("glUniform4dv");
            PFN_glUniformMatrix2dv = func.invoke("glUniformMatrix2dv");
            PFN_glUniformMatrix3dv = func.invoke("glUniformMatrix3dv");
            PFN_glUniformMatrix4dv = func.invoke("glUniformMatrix4dv");
            PFN_glUniformMatrix2x3dv = func.invoke("glUniformMatrix2x3dv");
            PFN_glUniformMatrix2x4dv = func.invoke("glUniformMatrix2x4dv");
            PFN_glUniformMatrix3x2dv = func.invoke("glUniformMatrix3x2dv");
            PFN_glUniformMatrix3x4dv = func.invoke("glUniformMatrix3x4dv");
            PFN_glUniformMatrix4x2dv = func.invoke("glUniformMatrix4x2dv");
            PFN_glUniformMatrix4x3dv = func.invoke("glUniformMatrix4x3dv");
            PFN_glGetUniformdv = func.invoke("glGetUniformdv");
        }
    }

    public GLARBGpuShaderFp64(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void Uniform1d(@CType("GLint") int location, @CType("GLdouble") double x) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform1d)) throw new SymbolNotFoundError("Symbol not found: glUniform1d");
        try { Handles.MH_glUniform1d.invokeExact(handles.PFN_glUniform1d, location, x); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1d", e); }
    }

    public void Uniform2d(@CType("GLint") int location, @CType("GLdouble") double x, @CType("GLdouble") double y) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform2d)) throw new SymbolNotFoundError("Symbol not found: glUniform2d");
        try { Handles.MH_glUniform2d.invokeExact(handles.PFN_glUniform2d, location, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2d", e); }
    }

    public void Uniform3d(@CType("GLint") int location, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform3d)) throw new SymbolNotFoundError("Symbol not found: glUniform3d");
        try { Handles.MH_glUniform3d.invokeExact(handles.PFN_glUniform3d, location, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3d", e); }
    }

    public void Uniform4d(@CType("GLint") int location, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform4d)) throw new SymbolNotFoundError("Symbol not found: glUniform4d");
        try { Handles.MH_glUniform4d.invokeExact(handles.PFN_glUniform4d, location, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4d", e); }
    }

    public void Uniform1dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform1dv)) throw new SymbolNotFoundError("Symbol not found: glUniform1dv");
        try { Handles.MH_glUniform1dv.invokeExact(handles.PFN_glUniform1dv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1dv", e); }
    }

    public void Uniform2dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform2dv)) throw new SymbolNotFoundError("Symbol not found: glUniform2dv");
        try { Handles.MH_glUniform2dv.invokeExact(handles.PFN_glUniform2dv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2dv", e); }
    }

    public void Uniform3dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform3dv)) throw new SymbolNotFoundError("Symbol not found: glUniform3dv");
        try { Handles.MH_glUniform3dv.invokeExact(handles.PFN_glUniform3dv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3dv", e); }
    }

    public void Uniform4dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform4dv)) throw new SymbolNotFoundError("Symbol not found: glUniform4dv");
        try { Handles.MH_glUniform4dv.invokeExact(handles.PFN_glUniform4dv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4dv", e); }
    }

    public void UniformMatrix2dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix2dv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix2dv");
        try { Handles.MH_glUniformMatrix2dv.invokeExact(handles.PFN_glUniformMatrix2dv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix2dv", e); }
    }

    public void UniformMatrix3dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix3dv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix3dv");
        try { Handles.MH_glUniformMatrix3dv.invokeExact(handles.PFN_glUniformMatrix3dv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix3dv", e); }
    }

    public void UniformMatrix4dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix4dv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix4dv");
        try { Handles.MH_glUniformMatrix4dv.invokeExact(handles.PFN_glUniformMatrix4dv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix4dv", e); }
    }

    public void UniformMatrix2x3dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix2x3dv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix2x3dv");
        try { Handles.MH_glUniformMatrix2x3dv.invokeExact(handles.PFN_glUniformMatrix2x3dv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix2x3dv", e); }
    }

    public void UniformMatrix2x4dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix2x4dv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix2x4dv");
        try { Handles.MH_glUniformMatrix2x4dv.invokeExact(handles.PFN_glUniformMatrix2x4dv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix2x4dv", e); }
    }

    public void UniformMatrix3x2dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix3x2dv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix3x2dv");
        try { Handles.MH_glUniformMatrix3x2dv.invokeExact(handles.PFN_glUniformMatrix3x2dv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix3x2dv", e); }
    }

    public void UniformMatrix3x4dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix3x4dv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix3x4dv");
        try { Handles.MH_glUniformMatrix3x4dv.invokeExact(handles.PFN_glUniformMatrix3x4dv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix3x4dv", e); }
    }

    public void UniformMatrix4x2dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix4x2dv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix4x2dv");
        try { Handles.MH_glUniformMatrix4x2dv.invokeExact(handles.PFN_glUniformMatrix4x2dv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix4x2dv", e); }
    }

    public void UniformMatrix4x3dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix4x3dv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix4x3dv");
        try { Handles.MH_glUniformMatrix4x3dv.invokeExact(handles.PFN_glUniformMatrix4x3dv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix4x3dv", e); }
    }

    public void GetUniformdv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetUniformdv)) throw new SymbolNotFoundError("Symbol not found: glGetUniformdv");
        try { Handles.MH_glGetUniformdv.invokeExact(handles.PFN_glGetUniformdv, program, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformdv", e); }
    }

}
