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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBFragmentProgram {
    public static final int GL_FRAGMENT_PROGRAM_ARB = 0x8804;
    public static final int GL_PROGRAM_FORMAT_ASCII_ARB = 0x8875;
    public static final int GL_PROGRAM_LENGTH_ARB = 0x8627;
    public static final int GL_PROGRAM_FORMAT_ARB = 0x8876;
    public static final int GL_PROGRAM_BINDING_ARB = 0x8677;
    public static final int GL_PROGRAM_INSTRUCTIONS_ARB = 0x88A0;
    public static final int GL_MAX_PROGRAM_INSTRUCTIONS_ARB = 0x88A1;
    public static final int GL_PROGRAM_NATIVE_INSTRUCTIONS_ARB = 0x88A2;
    public static final int GL_MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB = 0x88A3;
    public static final int GL_PROGRAM_TEMPORARIES_ARB = 0x88A4;
    public static final int GL_MAX_PROGRAM_TEMPORARIES_ARB = 0x88A5;
    public static final int GL_PROGRAM_NATIVE_TEMPORARIES_ARB = 0x88A6;
    public static final int GL_MAX_PROGRAM_NATIVE_TEMPORARIES_ARB = 0x88A7;
    public static final int GL_PROGRAM_PARAMETERS_ARB = 0x88A8;
    public static final int GL_MAX_PROGRAM_PARAMETERS_ARB = 0x88A9;
    public static final int GL_PROGRAM_NATIVE_PARAMETERS_ARB = 0x88AA;
    public static final int GL_MAX_PROGRAM_NATIVE_PARAMETERS_ARB = 0x88AB;
    public static final int GL_PROGRAM_ATTRIBS_ARB = 0x88AC;
    public static final int GL_MAX_PROGRAM_ATTRIBS_ARB = 0x88AD;
    public static final int GL_PROGRAM_NATIVE_ATTRIBS_ARB = 0x88AE;
    public static final int GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB = 0x88AF;
    public static final int GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB = 0x88B4;
    public static final int GL_MAX_PROGRAM_ENV_PARAMETERS_ARB = 0x88B5;
    public static final int GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB = 0x88B6;
    public static final int GL_PROGRAM_ALU_INSTRUCTIONS_ARB = 0x8805;
    public static final int GL_PROGRAM_TEX_INSTRUCTIONS_ARB = 0x8806;
    public static final int GL_PROGRAM_TEX_INDIRECTIONS_ARB = 0x8807;
    public static final int GL_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB = 0x8808;
    public static final int GL_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB = 0x8809;
    public static final int GL_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB = 0x880A;
    public static final int GL_MAX_PROGRAM_ALU_INSTRUCTIONS_ARB = 0x880B;
    public static final int GL_MAX_PROGRAM_TEX_INSTRUCTIONS_ARB = 0x880C;
    public static final int GL_MAX_PROGRAM_TEX_INDIRECTIONS_ARB = 0x880D;
    public static final int GL_MAX_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB = 0x880E;
    public static final int GL_MAX_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB = 0x880F;
    public static final int GL_MAX_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB = 0x8810;
    public static final int GL_PROGRAM_STRING_ARB = 0x8628;
    public static final int GL_PROGRAM_ERROR_POSITION_ARB = 0x864B;
    public static final int GL_CURRENT_MATRIX_ARB = 0x8641;
    public static final int GL_TRANSPOSE_CURRENT_MATRIX_ARB = 0x88B7;
    public static final int GL_CURRENT_MATRIX_STACK_DEPTH_ARB = 0x8640;
    public static final int GL_MAX_PROGRAM_MATRICES_ARB = 0x862F;
    public static final int GL_MAX_PROGRAM_MATRIX_STACK_DEPTH_ARB = 0x862E;
    public static final int GL_MAX_TEXTURE_COORDS_ARB = 0x8871;
    public static final int GL_MAX_TEXTURE_IMAGE_UNITS_ARB = 0x8872;
    public static final int GL_PROGRAM_ERROR_STRING_ARB = 0x8874;
    public static final int GL_MATRIX0_ARB = 0x88C0;
    public static final int GL_MATRIX1_ARB = 0x88C1;
    public static final int GL_MATRIX2_ARB = 0x88C2;
    public static final int GL_MATRIX3_ARB = 0x88C3;
    public static final int GL_MATRIX4_ARB = 0x88C4;
    public static final int GL_MATRIX5_ARB = 0x88C5;
    public static final int GL_MATRIX6_ARB = 0x88C6;
    public static final int GL_MATRIX7_ARB = 0x88C7;
    public static final int GL_MATRIX8_ARB = 0x88C8;
    public static final int GL_MATRIX9_ARB = 0x88C9;
    public static final int GL_MATRIX10_ARB = 0x88CA;
    public static final int GL_MATRIX11_ARB = 0x88CB;
    public static final int GL_MATRIX12_ARB = 0x88CC;
    public static final int GL_MATRIX13_ARB = 0x88CD;
    public static final int GL_MATRIX14_ARB = 0x88CE;
    public static final int GL_MATRIX15_ARB = 0x88CF;
    public static final int GL_MATRIX16_ARB = 0x88D0;
    public static final int GL_MATRIX17_ARB = 0x88D1;
    public static final int GL_MATRIX18_ARB = 0x88D2;
    public static final int GL_MATRIX19_ARB = 0x88D3;
    public static final int GL_MATRIX20_ARB = 0x88D4;
    public static final int GL_MATRIX21_ARB = 0x88D5;
    public static final int GL_MATRIX22_ARB = 0x88D6;
    public static final int GL_MATRIX23_ARB = 0x88D7;
    public static final int GL_MATRIX24_ARB = 0x88D8;
    public static final int GL_MATRIX25_ARB = 0x88D9;
    public static final int GL_MATRIX26_ARB = 0x88DA;
    public static final int GL_MATRIX27_ARB = 0x88DB;
    public static final int GL_MATRIX28_ARB = 0x88DC;
    public static final int GL_MATRIX29_ARB = 0x88DD;
    public static final int GL_MATRIX30_ARB = 0x88DE;
    public static final int GL_MATRIX31_ARB = 0x88DF;
    public static final MethodHandle MH_glProgramStringARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glBindProgramARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glDeleteProgramsARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGenProgramsARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glProgramEnvParameter4dARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public static final MethodHandle MH_glProgramEnvParameter4dvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glProgramEnvParameter4fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glProgramEnvParameter4fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glProgramLocalParameter4dARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public static final MethodHandle MH_glProgramLocalParameter4dvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glProgramLocalParameter4fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glProgramLocalParameter4fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetProgramEnvParameterdvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetProgramEnvParameterfvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetProgramLocalParameterdvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetProgramLocalParameterfvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetProgramivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetProgramStringARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glIsProgramARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramStringARB;
    public final MemorySegment PFN_glBindProgramARB;
    public final MemorySegment PFN_glDeleteProgramsARB;
    public final MemorySegment PFN_glGenProgramsARB;
    public final MemorySegment PFN_glProgramEnvParameter4dARB;
    public final MemorySegment PFN_glProgramEnvParameter4dvARB;
    public final MemorySegment PFN_glProgramEnvParameter4fARB;
    public final MemorySegment PFN_glProgramEnvParameter4fvARB;
    public final MemorySegment PFN_glProgramLocalParameter4dARB;
    public final MemorySegment PFN_glProgramLocalParameter4dvARB;
    public final MemorySegment PFN_glProgramLocalParameter4fARB;
    public final MemorySegment PFN_glProgramLocalParameter4fvARB;
    public final MemorySegment PFN_glGetProgramEnvParameterdvARB;
    public final MemorySegment PFN_glGetProgramEnvParameterfvARB;
    public final MemorySegment PFN_glGetProgramLocalParameterdvARB;
    public final MemorySegment PFN_glGetProgramLocalParameterfvARB;
    public final MemorySegment PFN_glGetProgramivARB;
    public final MemorySegment PFN_glGetProgramStringARB;
    public final MemorySegment PFN_glIsProgramARB;

    public GLARBFragmentProgram(overrungl.opengl.GLLoadFunc func) {
        PFN_glProgramStringARB = func.invoke("glProgramStringARB");
        PFN_glBindProgramARB = func.invoke("glBindProgramARB");
        PFN_glDeleteProgramsARB = func.invoke("glDeleteProgramsARB");
        PFN_glGenProgramsARB = func.invoke("glGenProgramsARB");
        PFN_glProgramEnvParameter4dARB = func.invoke("glProgramEnvParameter4dARB");
        PFN_glProgramEnvParameter4dvARB = func.invoke("glProgramEnvParameter4dvARB");
        PFN_glProgramEnvParameter4fARB = func.invoke("glProgramEnvParameter4fARB");
        PFN_glProgramEnvParameter4fvARB = func.invoke("glProgramEnvParameter4fvARB");
        PFN_glProgramLocalParameter4dARB = func.invoke("glProgramLocalParameter4dARB");
        PFN_glProgramLocalParameter4dvARB = func.invoke("glProgramLocalParameter4dvARB");
        PFN_glProgramLocalParameter4fARB = func.invoke("glProgramLocalParameter4fARB");
        PFN_glProgramLocalParameter4fvARB = func.invoke("glProgramLocalParameter4fvARB");
        PFN_glGetProgramEnvParameterdvARB = func.invoke("glGetProgramEnvParameterdvARB");
        PFN_glGetProgramEnvParameterfvARB = func.invoke("glGetProgramEnvParameterfvARB");
        PFN_glGetProgramLocalParameterdvARB = func.invoke("glGetProgramLocalParameterdvARB");
        PFN_glGetProgramLocalParameterfvARB = func.invoke("glGetProgramLocalParameterfvARB");
        PFN_glGetProgramivARB = func.invoke("glGetProgramivARB");
        PFN_glGetProgramStringARB = func.invoke("glGetProgramStringARB");
        PFN_glIsProgramARB = func.invoke("glIsProgramARB");
    }

    public void ProgramStringARB(@CType("GLenum") int target, @CType("GLenum") int format, @CType("GLsizei") int len, @CType("const void *") java.lang.foreign.MemorySegment string) {
        if (Unmarshal.isNullPointer(PFN_glProgramStringARB)) throw new SymbolNotFoundError("Symbol not found: glProgramStringARB");
        try { MH_glProgramStringARB.invokeExact(PFN_glProgramStringARB, target, format, len, string); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramStringARB", e); }
    }

    public void BindProgramARB(@CType("GLenum") int target, @CType("GLuint") int program) {
        if (Unmarshal.isNullPointer(PFN_glBindProgramARB)) throw new SymbolNotFoundError("Symbol not found: glBindProgramARB");
        try { MH_glBindProgramARB.invokeExact(PFN_glBindProgramARB, target, program); }
        catch (Throwable e) { throw new RuntimeException("error in glBindProgramARB", e); }
    }

    public void DeleteProgramsARB(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment programs) {
        if (Unmarshal.isNullPointer(PFN_glDeleteProgramsARB)) throw new SymbolNotFoundError("Symbol not found: glDeleteProgramsARB");
        try { MH_glDeleteProgramsARB.invokeExact(PFN_glDeleteProgramsARB, n, programs); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteProgramsARB", e); }
    }

    public void GenProgramsARB(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment programs) {
        if (Unmarshal.isNullPointer(PFN_glGenProgramsARB)) throw new SymbolNotFoundError("Symbol not found: glGenProgramsARB");
        try { MH_glGenProgramsARB.invokeExact(PFN_glGenProgramsARB, n, programs); }
        catch (Throwable e) { throw new RuntimeException("error in glGenProgramsARB", e); }
    }

    public void ProgramEnvParameter4dARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        if (Unmarshal.isNullPointer(PFN_glProgramEnvParameter4dARB)) throw new SymbolNotFoundError("Symbol not found: glProgramEnvParameter4dARB");
        try { MH_glProgramEnvParameter4dARB.invokeExact(PFN_glProgramEnvParameter4dARB, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramEnvParameter4dARB", e); }
    }

    public void ProgramEnvParameter4dvARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glProgramEnvParameter4dvARB)) throw new SymbolNotFoundError("Symbol not found: glProgramEnvParameter4dvARB");
        try { MH_glProgramEnvParameter4dvARB.invokeExact(PFN_glProgramEnvParameter4dvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramEnvParameter4dvARB", e); }
    }

    public void ProgramEnvParameter4fARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        if (Unmarshal.isNullPointer(PFN_glProgramEnvParameter4fARB)) throw new SymbolNotFoundError("Symbol not found: glProgramEnvParameter4fARB");
        try { MH_glProgramEnvParameter4fARB.invokeExact(PFN_glProgramEnvParameter4fARB, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramEnvParameter4fARB", e); }
    }

    public void ProgramEnvParameter4fvARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glProgramEnvParameter4fvARB)) throw new SymbolNotFoundError("Symbol not found: glProgramEnvParameter4fvARB");
        try { MH_glProgramEnvParameter4fvARB.invokeExact(PFN_glProgramEnvParameter4fvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramEnvParameter4fvARB", e); }
    }

    public void ProgramLocalParameter4dARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        if (Unmarshal.isNullPointer(PFN_glProgramLocalParameter4dARB)) throw new SymbolNotFoundError("Symbol not found: glProgramLocalParameter4dARB");
        try { MH_glProgramLocalParameter4dARB.invokeExact(PFN_glProgramLocalParameter4dARB, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramLocalParameter4dARB", e); }
    }

    public void ProgramLocalParameter4dvARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glProgramLocalParameter4dvARB)) throw new SymbolNotFoundError("Symbol not found: glProgramLocalParameter4dvARB");
        try { MH_glProgramLocalParameter4dvARB.invokeExact(PFN_glProgramLocalParameter4dvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramLocalParameter4dvARB", e); }
    }

    public void ProgramLocalParameter4fARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        if (Unmarshal.isNullPointer(PFN_glProgramLocalParameter4fARB)) throw new SymbolNotFoundError("Symbol not found: glProgramLocalParameter4fARB");
        try { MH_glProgramLocalParameter4fARB.invokeExact(PFN_glProgramLocalParameter4fARB, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramLocalParameter4fARB", e); }
    }

    public void ProgramLocalParameter4fvARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glProgramLocalParameter4fvARB)) throw new SymbolNotFoundError("Symbol not found: glProgramLocalParameter4fvARB");
        try { MH_glProgramLocalParameter4fvARB.invokeExact(PFN_glProgramLocalParameter4fvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramLocalParameter4fvARB", e); }
    }

    public void GetProgramEnvParameterdvARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetProgramEnvParameterdvARB)) throw new SymbolNotFoundError("Symbol not found: glGetProgramEnvParameterdvARB");
        try { MH_glGetProgramEnvParameterdvARB.invokeExact(PFN_glGetProgramEnvParameterdvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramEnvParameterdvARB", e); }
    }

    public void GetProgramEnvParameterfvARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetProgramEnvParameterfvARB)) throw new SymbolNotFoundError("Symbol not found: glGetProgramEnvParameterfvARB");
        try { MH_glGetProgramEnvParameterfvARB.invokeExact(PFN_glGetProgramEnvParameterfvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramEnvParameterfvARB", e); }
    }

    public void GetProgramLocalParameterdvARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetProgramLocalParameterdvARB)) throw new SymbolNotFoundError("Symbol not found: glGetProgramLocalParameterdvARB");
        try { MH_glGetProgramLocalParameterdvARB.invokeExact(PFN_glGetProgramLocalParameterdvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramLocalParameterdvARB", e); }
    }

    public void GetProgramLocalParameterfvARB(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetProgramLocalParameterfvARB)) throw new SymbolNotFoundError("Symbol not found: glGetProgramLocalParameterfvARB");
        try { MH_glGetProgramLocalParameterfvARB.invokeExact(PFN_glGetProgramLocalParameterfvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramLocalParameterfvARB", e); }
    }

    public void GetProgramivARB(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetProgramivARB)) throw new SymbolNotFoundError("Symbol not found: glGetProgramivARB");
        try { MH_glGetProgramivARB.invokeExact(PFN_glGetProgramivARB, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramivARB", e); }
    }

    public void GetProgramStringARB(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("void*") java.lang.foreign.MemorySegment string) {
        if (Unmarshal.isNullPointer(PFN_glGetProgramStringARB)) throw new SymbolNotFoundError("Symbol not found: glGetProgramStringARB");
        try { MH_glGetProgramStringARB.invokeExact(PFN_glGetProgramStringARB, target, pname, string); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramStringARB", e); }
    }

    public @CType("GLboolean") boolean IsProgramARB(@CType("GLuint") int program) {
        if (Unmarshal.isNullPointer(PFN_glIsProgramARB)) throw new SymbolNotFoundError("Symbol not found: glIsProgramARB");
        try { return (boolean) MH_glIsProgramARB.invokeExact(PFN_glIsProgramARB, program); }
        catch (Throwable e) { throw new RuntimeException("error in glIsProgramARB", e); }
    }

}
