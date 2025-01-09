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

public final class GLNVFragmentProgram {
    public static final int GL_MAX_FRAGMENT_PROGRAM_LOCAL_PARAMETERS_NV = 0x8868;
    public static final int GL_FRAGMENT_PROGRAM_NV = 0x8870;
    public static final int GL_MAX_TEXTURE_COORDS_NV = 0x8871;
    public static final int GL_MAX_TEXTURE_IMAGE_UNITS_NV = 0x8872;
    public static final int GL_FRAGMENT_PROGRAM_BINDING_NV = 0x8873;
    public static final int GL_PROGRAM_ERROR_STRING_NV = 0x8874;
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

    public GLNVFragmentProgram(overrungl.opengl.GLLoadFunc func) {
        PFN_glProgramNamedParameter4fNV = func.invoke("glProgramNamedParameter4fNV");
        PFN_glProgramNamedParameter4fvNV = func.invoke("glProgramNamedParameter4fvNV");
        PFN_glProgramNamedParameter4dNV = func.invoke("glProgramNamedParameter4dNV");
        PFN_glProgramNamedParameter4dvNV = func.invoke("glProgramNamedParameter4dvNV");
        PFN_glGetProgramNamedParameterfvNV = func.invoke("glGetProgramNamedParameterfvNV");
        PFN_glGetProgramNamedParameterdvNV = func.invoke("glGetProgramNamedParameterdvNV");
    }

    public void ProgramNamedParameter4fNV(@CType("GLuint") int id, @CType("GLsizei") int len, @CType("const GLubyte *") java.lang.foreign.MemorySegment name, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        if (Unmarshal.isNullPointer(PFN_glProgramNamedParameter4fNV)) throw new SymbolNotFoundError("Symbol not found: glProgramNamedParameter4fNV");
        try { MH_glProgramNamedParameter4fNV.invokeExact(PFN_glProgramNamedParameter4fNV, id, len, name, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramNamedParameter4fNV", e); }
    }

    public void ProgramNamedParameter4fvNV(@CType("GLuint") int id, @CType("GLsizei") int len, @CType("const GLubyte *") java.lang.foreign.MemorySegment name, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glProgramNamedParameter4fvNV)) throw new SymbolNotFoundError("Symbol not found: glProgramNamedParameter4fvNV");
        try { MH_glProgramNamedParameter4fvNV.invokeExact(PFN_glProgramNamedParameter4fvNV, id, len, name, v); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramNamedParameter4fvNV", e); }
    }

    public void ProgramNamedParameter4dNV(@CType("GLuint") int id, @CType("GLsizei") int len, @CType("const GLubyte *") java.lang.foreign.MemorySegment name, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        if (Unmarshal.isNullPointer(PFN_glProgramNamedParameter4dNV)) throw new SymbolNotFoundError("Symbol not found: glProgramNamedParameter4dNV");
        try { MH_glProgramNamedParameter4dNV.invokeExact(PFN_glProgramNamedParameter4dNV, id, len, name, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramNamedParameter4dNV", e); }
    }

    public void ProgramNamedParameter4dvNV(@CType("GLuint") int id, @CType("GLsizei") int len, @CType("const GLubyte *") java.lang.foreign.MemorySegment name, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glProgramNamedParameter4dvNV)) throw new SymbolNotFoundError("Symbol not found: glProgramNamedParameter4dvNV");
        try { MH_glProgramNamedParameter4dvNV.invokeExact(PFN_glProgramNamedParameter4dvNV, id, len, name, v); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramNamedParameter4dvNV", e); }
    }

    public void GetProgramNamedParameterfvNV(@CType("GLuint") int id, @CType("GLsizei") int len, @CType("const GLubyte *") java.lang.foreign.MemorySegment name, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetProgramNamedParameterfvNV)) throw new SymbolNotFoundError("Symbol not found: glGetProgramNamedParameterfvNV");
        try { MH_glGetProgramNamedParameterfvNV.invokeExact(PFN_glGetProgramNamedParameterfvNV, id, len, name, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramNamedParameterfvNV", e); }
    }

    public void GetProgramNamedParameterdvNV(@CType("GLuint") int id, @CType("GLsizei") int len, @CType("const GLubyte *") java.lang.foreign.MemorySegment name, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetProgramNamedParameterdvNV)) throw new SymbolNotFoundError("Symbol not found: glGetProgramNamedParameterdvNV");
        try { MH_glGetProgramNamedParameterdvNV.invokeExact(PFN_glGetProgramNamedParameterdvNV, id, len, name, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramNamedParameterdvNV", e); }
    }

}
