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

public final class GLARBShaderSubroutine {
    public static final int GL_ACTIVE_SUBROUTINES = 0x8DE5;
    public static final int GL_ACTIVE_SUBROUTINE_UNIFORMS = 0x8DE6;
    public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS = 0x8E47;
    public static final int GL_ACTIVE_SUBROUTINE_MAX_LENGTH = 0x8E48;
    public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 0x8E49;
    public static final int GL_MAX_SUBROUTINES = 0x8DE7;
    public static final int GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS = 0x8DE8;
    public static final int GL_NUM_COMPATIBLE_SUBROUTINES = 0x8E4A;
    public static final int GL_COMPATIBLE_SUBROUTINES = 0x8E4B;
    public static final int GL_UNIFORM_SIZE = 0x8A38;
    public static final int GL_UNIFORM_NAME_LENGTH = 0x8A39;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetSubroutineUniformLocation = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetSubroutineIndex = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveSubroutineUniformiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveSubroutineUniformName = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveSubroutineName = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformSubroutinesuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUniformSubroutineuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramStageiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glGetSubroutineUniformLocation;
        public final MemorySegment PFN_glGetSubroutineIndex;
        public final MemorySegment PFN_glGetActiveSubroutineUniformiv;
        public final MemorySegment PFN_glGetActiveSubroutineUniformName;
        public final MemorySegment PFN_glGetActiveSubroutineName;
        public final MemorySegment PFN_glUniformSubroutinesuiv;
        public final MemorySegment PFN_glGetUniformSubroutineuiv;
        public final MemorySegment PFN_glGetProgramStageiv;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGetSubroutineUniformLocation = func.invoke("glGetSubroutineUniformLocation");
            PFN_glGetSubroutineIndex = func.invoke("glGetSubroutineIndex");
            PFN_glGetActiveSubroutineUniformiv = func.invoke("glGetActiveSubroutineUniformiv");
            PFN_glGetActiveSubroutineUniformName = func.invoke("glGetActiveSubroutineUniformName");
            PFN_glGetActiveSubroutineName = func.invoke("glGetActiveSubroutineName");
            PFN_glUniformSubroutinesuiv = func.invoke("glUniformSubroutinesuiv");
            PFN_glGetUniformSubroutineuiv = func.invoke("glGetUniformSubroutineuiv");
            PFN_glGetProgramStageiv = func.invoke("glGetProgramStageiv");
        }
    }

    public GLARBShaderSubroutine(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// int glGetSubroutineUniformLocation(unsigned int program, unsigned int shadertype, const GLchar* name);
    /// ```
    public int GetSubroutineUniformLocation(int program, int shadertype, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSubroutineUniformLocation)) throw new SymbolNotFoundError("Symbol not found: glGetSubroutineUniformLocation");
        try { return (int) Handles.MH_glGetSubroutineUniformLocation.invokeExact(handles.PFN_glGetSubroutineUniformLocation, program, shadertype, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetSubroutineUniformLocation", e); }
    }

    /// ```
    /// unsigned int glGetSubroutineIndex(unsigned int program, unsigned int shadertype, const GLchar* name);
    /// ```
    public int GetSubroutineIndex(int program, int shadertype, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSubroutineIndex)) throw new SymbolNotFoundError("Symbol not found: glGetSubroutineIndex");
        try { return (int) Handles.MH_glGetSubroutineIndex.invokeExact(handles.PFN_glGetSubroutineIndex, program, shadertype, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetSubroutineIndex", e); }
    }

    /// ```
    /// void glGetActiveSubroutineUniformiv(unsigned int program, unsigned int shadertype, unsigned int index, unsigned int pname, GLint* values);
    /// ```
    public void GetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetActiveSubroutineUniformiv)) throw new SymbolNotFoundError("Symbol not found: glGetActiveSubroutineUniformiv");
        try { Handles.MH_glGetActiveSubroutineUniformiv.invokeExact(handles.PFN_glGetActiveSubroutineUniformiv, program, shadertype, index, pname, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetActiveSubroutineUniformiv", e); }
    }

    /// ```
    /// void glGetActiveSubroutineUniformName(unsigned int program, unsigned int shadertype, unsigned int index, int bufSize, GLsizei* length, GLchar* name);
    /// ```
    public void GetActiveSubroutineUniformName(int program, int shadertype, int index, int bufSize, MemorySegment length, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetActiveSubroutineUniformName)) throw new SymbolNotFoundError("Symbol not found: glGetActiveSubroutineUniformName");
        try { Handles.MH_glGetActiveSubroutineUniformName.invokeExact(handles.PFN_glGetActiveSubroutineUniformName, program, shadertype, index, bufSize, length, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetActiveSubroutineUniformName", e); }
    }

    /// ```
    /// void glGetActiveSubroutineName(unsigned int program, unsigned int shadertype, unsigned int index, int bufSize, GLsizei* length, GLchar* name);
    /// ```
    public void GetActiveSubroutineName(int program, int shadertype, int index, int bufSize, MemorySegment length, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetActiveSubroutineName)) throw new SymbolNotFoundError("Symbol not found: glGetActiveSubroutineName");
        try { Handles.MH_glGetActiveSubroutineName.invokeExact(handles.PFN_glGetActiveSubroutineName, program, shadertype, index, bufSize, length, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetActiveSubroutineName", e); }
    }

    /// ```
    /// void glUniformSubroutinesuiv(unsigned int shadertype, int count, const GLuint* indices);
    /// ```
    public void UniformSubroutinesuiv(int shadertype, int count, MemorySegment indices) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformSubroutinesuiv)) throw new SymbolNotFoundError("Symbol not found: glUniformSubroutinesuiv");
        try { Handles.MH_glUniformSubroutinesuiv.invokeExact(handles.PFN_glUniformSubroutinesuiv, shadertype, count, indices); }
        catch (Throwable e) { throw new RuntimeException("error in UniformSubroutinesuiv", e); }
    }

    /// ```
    /// void glGetUniformSubroutineuiv(unsigned int shadertype, int location, GLuint* params);
    /// ```
    public void GetUniformSubroutineuiv(int shadertype, int location, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformSubroutineuiv)) throw new SymbolNotFoundError("Symbol not found: glGetUniformSubroutineuiv");
        try { Handles.MH_glGetUniformSubroutineuiv.invokeExact(handles.PFN_glGetUniformSubroutineuiv, shadertype, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformSubroutineuiv", e); }
    }

    /// ```
    /// void glGetProgramStageiv(unsigned int program, unsigned int shadertype, unsigned int pname, GLint* values);
    /// ```
    public void GetProgramStageiv(int program, int shadertype, int pname, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramStageiv)) throw new SymbolNotFoundError("Symbol not found: glGetProgramStageiv");
        try { Handles.MH_glGetProgramStageiv.invokeExact(handles.PFN_glGetProgramStageiv, program, shadertype, pname, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramStageiv", e); }
    }

}
