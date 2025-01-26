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

public final class GLNVFragmentProgram {
    public static final int GL_MAX_FRAGMENT_PROGRAM_LOCAL_PARAMETERS_NV = 0x8868;
    public static final int GL_FRAGMENT_PROGRAM_NV = 0x8870;
    public static final int GL_MAX_TEXTURE_COORDS_NV = 0x8871;
    public static final int GL_MAX_TEXTURE_IMAGE_UNITS_NV = 0x8872;
    public static final int GL_FRAGMENT_PROGRAM_BINDING_NV = 0x8873;
    public static final int GL_PROGRAM_ERROR_STRING_NV = 0x8874;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glProgramNamedParameter4fNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramNamedParameter4fvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramNamedParameter4dNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glProgramNamedParameter4dvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramNamedParameterfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramNamedParameterdvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glProgramNamedParameter4fNV;
        public final MemorySegment PFN_glProgramNamedParameter4fvNV;
        public final MemorySegment PFN_glProgramNamedParameter4dNV;
        public final MemorySegment PFN_glProgramNamedParameter4dvNV;
        public final MemorySegment PFN_glGetProgramNamedParameterfvNV;
        public final MemorySegment PFN_glGetProgramNamedParameterdvNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glProgramNamedParameter4fNV = func.invoke("glProgramNamedParameter4fNV");
            PFN_glProgramNamedParameter4fvNV = func.invoke("glProgramNamedParameter4fvNV");
            PFN_glProgramNamedParameter4dNV = func.invoke("glProgramNamedParameter4dNV");
            PFN_glProgramNamedParameter4dvNV = func.invoke("glProgramNamedParameter4dvNV");
            PFN_glGetProgramNamedParameterfvNV = func.invoke("glGetProgramNamedParameterfvNV");
            PFN_glGetProgramNamedParameterdvNV = func.invoke("glGetProgramNamedParameterdvNV");
        }
    }

    public GLNVFragmentProgram(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glProgramNamedParameter4fNV(GLuint id, GLsizei len, const GLubyte* name, GLfloat x, GLfloat y, GLfloat z, GLfloat w);
    /// ```
    public void ProgramNamedParameter4fNV(int id, int len, MemorySegment name, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramNamedParameter4fNV)) throw new SymbolNotFoundError("Symbol not found: glProgramNamedParameter4fNV");
        try { Handles.MH_glProgramNamedParameter4fNV.invokeExact(handles.PFN_glProgramNamedParameter4fNV, id, len, name, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramNamedParameter4fNV", e); }
    }

    /// ```
    /// void glProgramNamedParameter4fvNV(GLuint id, GLsizei len, const GLubyte* name, const GLfloat* v);
    /// ```
    public void ProgramNamedParameter4fvNV(int id, int len, MemorySegment name, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramNamedParameter4fvNV)) throw new SymbolNotFoundError("Symbol not found: glProgramNamedParameter4fvNV");
        try { Handles.MH_glProgramNamedParameter4fvNV.invokeExact(handles.PFN_glProgramNamedParameter4fvNV, id, len, name, v); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramNamedParameter4fvNV", e); }
    }

    /// ```
    /// void glProgramNamedParameter4dNV(GLuint id, GLsizei len, const GLubyte* name, GLdouble x, GLdouble y, GLdouble z, GLdouble w);
    /// ```
    public void ProgramNamedParameter4dNV(int id, int len, MemorySegment name, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramNamedParameter4dNV)) throw new SymbolNotFoundError("Symbol not found: glProgramNamedParameter4dNV");
        try { Handles.MH_glProgramNamedParameter4dNV.invokeExact(handles.PFN_glProgramNamedParameter4dNV, id, len, name, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramNamedParameter4dNV", e); }
    }

    /// ```
    /// void glProgramNamedParameter4dvNV(GLuint id, GLsizei len, const GLubyte* name, const GLdouble* v);
    /// ```
    public void ProgramNamedParameter4dvNV(int id, int len, MemorySegment name, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramNamedParameter4dvNV)) throw new SymbolNotFoundError("Symbol not found: glProgramNamedParameter4dvNV");
        try { Handles.MH_glProgramNamedParameter4dvNV.invokeExact(handles.PFN_glProgramNamedParameter4dvNV, id, len, name, v); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramNamedParameter4dvNV", e); }
    }

    /// ```
    /// void glGetProgramNamedParameterfvNV(GLuint id, GLsizei len, const GLubyte* name, GLfloat* params);
    /// ```
    public void GetProgramNamedParameterfvNV(int id, int len, MemorySegment name, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramNamedParameterfvNV)) throw new SymbolNotFoundError("Symbol not found: glGetProgramNamedParameterfvNV");
        try { Handles.MH_glGetProgramNamedParameterfvNV.invokeExact(handles.PFN_glGetProgramNamedParameterfvNV, id, len, name, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramNamedParameterfvNV", e); }
    }

    /// ```
    /// void glGetProgramNamedParameterdvNV(GLuint id, GLsizei len, const GLubyte* name, GLdouble* params);
    /// ```
    public void GetProgramNamedParameterdvNV(int id, int len, MemorySegment name, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramNamedParameterdvNV)) throw new SymbolNotFoundError("Symbol not found: glGetProgramNamedParameterdvNV");
        try { Handles.MH_glGetProgramNamedParameterdvNV.invokeExact(handles.PFN_glGetProgramNamedParameterdvNV, id, len, name, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramNamedParameterdvNV", e); }
    }

}
