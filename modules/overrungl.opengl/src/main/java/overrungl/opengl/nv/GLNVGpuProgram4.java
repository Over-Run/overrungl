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

public final class GLNVGpuProgram4 {
    public static final int GL_MIN_PROGRAM_TEXEL_OFFSET_NV = 0x8904;
    public static final int GL_MAX_PROGRAM_TEXEL_OFFSET_NV = 0x8905;
    public static final int GL_PROGRAM_ATTRIB_COMPONENTS_NV = 0x8906;
    public static final int GL_PROGRAM_RESULT_COMPONENTS_NV = 0x8907;
    public static final int GL_MAX_PROGRAM_ATTRIB_COMPONENTS_NV = 0x8908;
    public static final int GL_MAX_PROGRAM_RESULT_COMPONENTS_NV = 0x8909;
    public static final int GL_MAX_PROGRAM_GENERIC_ATTRIBS_NV = 0x8DA5;
    public static final int GL_MAX_PROGRAM_GENERIC_RESULTS_NV = 0x8DA6;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glProgramLocalParameterI4iNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramLocalParameterI4ivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramLocalParametersI4ivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramLocalParameterI4uiNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramLocalParameterI4uivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramLocalParametersI4uivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramEnvParameterI4iNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramEnvParameterI4ivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramEnvParametersI4ivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramEnvParameterI4uiNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramEnvParameterI4uivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramEnvParametersI4uivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramLocalParameterIivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramLocalParameterIuivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramEnvParameterIivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramEnvParameterIuivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glProgramLocalParameterI4iNV;
        public final MemorySegment PFN_glProgramLocalParameterI4ivNV;
        public final MemorySegment PFN_glProgramLocalParametersI4ivNV;
        public final MemorySegment PFN_glProgramLocalParameterI4uiNV;
        public final MemorySegment PFN_glProgramLocalParameterI4uivNV;
        public final MemorySegment PFN_glProgramLocalParametersI4uivNV;
        public final MemorySegment PFN_glProgramEnvParameterI4iNV;
        public final MemorySegment PFN_glProgramEnvParameterI4ivNV;
        public final MemorySegment PFN_glProgramEnvParametersI4ivNV;
        public final MemorySegment PFN_glProgramEnvParameterI4uiNV;
        public final MemorySegment PFN_glProgramEnvParameterI4uivNV;
        public final MemorySegment PFN_glProgramEnvParametersI4uivNV;
        public final MemorySegment PFN_glGetProgramLocalParameterIivNV;
        public final MemorySegment PFN_glGetProgramLocalParameterIuivNV;
        public final MemorySegment PFN_glGetProgramEnvParameterIivNV;
        public final MemorySegment PFN_glGetProgramEnvParameterIuivNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glProgramLocalParameterI4iNV = func.invoke("glProgramLocalParameterI4iNV");
            PFN_glProgramLocalParameterI4ivNV = func.invoke("glProgramLocalParameterI4ivNV");
            PFN_glProgramLocalParametersI4ivNV = func.invoke("glProgramLocalParametersI4ivNV");
            PFN_glProgramLocalParameterI4uiNV = func.invoke("glProgramLocalParameterI4uiNV");
            PFN_glProgramLocalParameterI4uivNV = func.invoke("glProgramLocalParameterI4uivNV");
            PFN_glProgramLocalParametersI4uivNV = func.invoke("glProgramLocalParametersI4uivNV");
            PFN_glProgramEnvParameterI4iNV = func.invoke("glProgramEnvParameterI4iNV");
            PFN_glProgramEnvParameterI4ivNV = func.invoke("glProgramEnvParameterI4ivNV");
            PFN_glProgramEnvParametersI4ivNV = func.invoke("glProgramEnvParametersI4ivNV");
            PFN_glProgramEnvParameterI4uiNV = func.invoke("glProgramEnvParameterI4uiNV");
            PFN_glProgramEnvParameterI4uivNV = func.invoke("glProgramEnvParameterI4uivNV");
            PFN_glProgramEnvParametersI4uivNV = func.invoke("glProgramEnvParametersI4uivNV");
            PFN_glGetProgramLocalParameterIivNV = func.invoke("glGetProgramLocalParameterIivNV");
            PFN_glGetProgramLocalParameterIuivNV = func.invoke("glGetProgramLocalParameterIuivNV");
            PFN_glGetProgramEnvParameterIivNV = func.invoke("glGetProgramEnvParameterIivNV");
            PFN_glGetProgramEnvParameterIuivNV = func.invoke("glGetProgramEnvParameterIuivNV");
        }
    }

    public GLNVGpuProgram4(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glProgramLocalParameterI4iNV(GLenum target, GLuint index, GLint x, GLint y, GLint z, GLint w);
    /// ```
    public void ProgramLocalParameterI4iNV(int target, int index, int x, int y, int z, int w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramLocalParameterI4iNV)) throw new SymbolNotFoundError("Symbol not found: glProgramLocalParameterI4iNV");
        try { Handles.MH_glProgramLocalParameterI4iNV.invokeExact(handles.PFN_glProgramLocalParameterI4iNV, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramLocalParameterI4iNV", e); }
    }

    /// ```
    /// void glProgramLocalParameterI4ivNV(GLenum target, GLuint index, const GLint* params);
    /// ```
    public void ProgramLocalParameterI4ivNV(int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramLocalParameterI4ivNV)) throw new SymbolNotFoundError("Symbol not found: glProgramLocalParameterI4ivNV");
        try { Handles.MH_glProgramLocalParameterI4ivNV.invokeExact(handles.PFN_glProgramLocalParameterI4ivNV, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramLocalParameterI4ivNV", e); }
    }

    /// ```
    /// void glProgramLocalParametersI4ivNV(GLenum target, GLuint index, GLsizei count, const GLint* params);
    /// ```
    public void ProgramLocalParametersI4ivNV(int target, int index, int count, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramLocalParametersI4ivNV)) throw new SymbolNotFoundError("Symbol not found: glProgramLocalParametersI4ivNV");
        try { Handles.MH_glProgramLocalParametersI4ivNV.invokeExact(handles.PFN_glProgramLocalParametersI4ivNV, target, index, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramLocalParametersI4ivNV", e); }
    }

    /// ```
    /// void glProgramLocalParameterI4uiNV(GLenum target, GLuint index, GLuint x, GLuint y, GLuint z, GLuint w);
    /// ```
    public void ProgramLocalParameterI4uiNV(int target, int index, int x, int y, int z, int w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramLocalParameterI4uiNV)) throw new SymbolNotFoundError("Symbol not found: glProgramLocalParameterI4uiNV");
        try { Handles.MH_glProgramLocalParameterI4uiNV.invokeExact(handles.PFN_glProgramLocalParameterI4uiNV, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramLocalParameterI4uiNV", e); }
    }

    /// ```
    /// void glProgramLocalParameterI4uivNV(GLenum target, GLuint index, const GLuint* params);
    /// ```
    public void ProgramLocalParameterI4uivNV(int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramLocalParameterI4uivNV)) throw new SymbolNotFoundError("Symbol not found: glProgramLocalParameterI4uivNV");
        try { Handles.MH_glProgramLocalParameterI4uivNV.invokeExact(handles.PFN_glProgramLocalParameterI4uivNV, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramLocalParameterI4uivNV", e); }
    }

    /// ```
    /// void glProgramLocalParametersI4uivNV(GLenum target, GLuint index, GLsizei count, const GLuint* params);
    /// ```
    public void ProgramLocalParametersI4uivNV(int target, int index, int count, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramLocalParametersI4uivNV)) throw new SymbolNotFoundError("Symbol not found: glProgramLocalParametersI4uivNV");
        try { Handles.MH_glProgramLocalParametersI4uivNV.invokeExact(handles.PFN_glProgramLocalParametersI4uivNV, target, index, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramLocalParametersI4uivNV", e); }
    }

    /// ```
    /// void glProgramEnvParameterI4iNV(GLenum target, GLuint index, GLint x, GLint y, GLint z, GLint w);
    /// ```
    public void ProgramEnvParameterI4iNV(int target, int index, int x, int y, int z, int w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramEnvParameterI4iNV)) throw new SymbolNotFoundError("Symbol not found: glProgramEnvParameterI4iNV");
        try { Handles.MH_glProgramEnvParameterI4iNV.invokeExact(handles.PFN_glProgramEnvParameterI4iNV, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramEnvParameterI4iNV", e); }
    }

    /// ```
    /// void glProgramEnvParameterI4ivNV(GLenum target, GLuint index, const GLint* params);
    /// ```
    public void ProgramEnvParameterI4ivNV(int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramEnvParameterI4ivNV)) throw new SymbolNotFoundError("Symbol not found: glProgramEnvParameterI4ivNV");
        try { Handles.MH_glProgramEnvParameterI4ivNV.invokeExact(handles.PFN_glProgramEnvParameterI4ivNV, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramEnvParameterI4ivNV", e); }
    }

    /// ```
    /// void glProgramEnvParametersI4ivNV(GLenum target, GLuint index, GLsizei count, const GLint* params);
    /// ```
    public void ProgramEnvParametersI4ivNV(int target, int index, int count, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramEnvParametersI4ivNV)) throw new SymbolNotFoundError("Symbol not found: glProgramEnvParametersI4ivNV");
        try { Handles.MH_glProgramEnvParametersI4ivNV.invokeExact(handles.PFN_glProgramEnvParametersI4ivNV, target, index, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramEnvParametersI4ivNV", e); }
    }

    /// ```
    /// void glProgramEnvParameterI4uiNV(GLenum target, GLuint index, GLuint x, GLuint y, GLuint z, GLuint w);
    /// ```
    public void ProgramEnvParameterI4uiNV(int target, int index, int x, int y, int z, int w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramEnvParameterI4uiNV)) throw new SymbolNotFoundError("Symbol not found: glProgramEnvParameterI4uiNV");
        try { Handles.MH_glProgramEnvParameterI4uiNV.invokeExact(handles.PFN_glProgramEnvParameterI4uiNV, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramEnvParameterI4uiNV", e); }
    }

    /// ```
    /// void glProgramEnvParameterI4uivNV(GLenum target, GLuint index, const GLuint* params);
    /// ```
    public void ProgramEnvParameterI4uivNV(int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramEnvParameterI4uivNV)) throw new SymbolNotFoundError("Symbol not found: glProgramEnvParameterI4uivNV");
        try { Handles.MH_glProgramEnvParameterI4uivNV.invokeExact(handles.PFN_glProgramEnvParameterI4uivNV, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramEnvParameterI4uivNV", e); }
    }

    /// ```
    /// void glProgramEnvParametersI4uivNV(GLenum target, GLuint index, GLsizei count, const GLuint* params);
    /// ```
    public void ProgramEnvParametersI4uivNV(int target, int index, int count, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramEnvParametersI4uivNV)) throw new SymbolNotFoundError("Symbol not found: glProgramEnvParametersI4uivNV");
        try { Handles.MH_glProgramEnvParametersI4uivNV.invokeExact(handles.PFN_glProgramEnvParametersI4uivNV, target, index, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramEnvParametersI4uivNV", e); }
    }

    /// ```
    /// void glGetProgramLocalParameterIivNV(GLenum target, GLuint index, GLint* params);
    /// ```
    public void GetProgramLocalParameterIivNV(int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramLocalParameterIivNV)) throw new SymbolNotFoundError("Symbol not found: glGetProgramLocalParameterIivNV");
        try { Handles.MH_glGetProgramLocalParameterIivNV.invokeExact(handles.PFN_glGetProgramLocalParameterIivNV, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramLocalParameterIivNV", e); }
    }

    /// ```
    /// void glGetProgramLocalParameterIuivNV(GLenum target, GLuint index, GLuint* params);
    /// ```
    public void GetProgramLocalParameterIuivNV(int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramLocalParameterIuivNV)) throw new SymbolNotFoundError("Symbol not found: glGetProgramLocalParameterIuivNV");
        try { Handles.MH_glGetProgramLocalParameterIuivNV.invokeExact(handles.PFN_glGetProgramLocalParameterIuivNV, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramLocalParameterIuivNV", e); }
    }

    /// ```
    /// void glGetProgramEnvParameterIivNV(GLenum target, GLuint index, GLint* params);
    /// ```
    public void GetProgramEnvParameterIivNV(int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramEnvParameterIivNV)) throw new SymbolNotFoundError("Symbol not found: glGetProgramEnvParameterIivNV");
        try { Handles.MH_glGetProgramEnvParameterIivNV.invokeExact(handles.PFN_glGetProgramEnvParameterIivNV, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramEnvParameterIivNV", e); }
    }

    /// ```
    /// void glGetProgramEnvParameterIuivNV(GLenum target, GLuint index, GLuint* params);
    /// ```
    public void GetProgramEnvParameterIuivNV(int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramEnvParameterIuivNV)) throw new SymbolNotFoundError("Symbol not found: glGetProgramEnvParameterIuivNV");
        try { Handles.MH_glGetProgramEnvParameterIuivNV.invokeExact(handles.PFN_glGetProgramEnvParameterIuivNV, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramEnvParameterIuivNV", e); }
    }

}
