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

public final class GLNVGpuProgram4 {
    public static final int GL_MIN_PROGRAM_TEXEL_OFFSET_NV = 0x8904;
    public static final int GL_MAX_PROGRAM_TEXEL_OFFSET_NV = 0x8905;
    public static final int GL_PROGRAM_ATTRIB_COMPONENTS_NV = 0x8906;
    public static final int GL_PROGRAM_RESULT_COMPONENTS_NV = 0x8907;
    public static final int GL_MAX_PROGRAM_ATTRIB_COMPONENTS_NV = 0x8908;
    public static final int GL_MAX_PROGRAM_RESULT_COMPONENTS_NV = 0x8909;
    public static final int GL_MAX_PROGRAM_GENERIC_ATTRIBS_NV = 0x8DA5;
    public static final int GL_MAX_PROGRAM_GENERIC_RESULTS_NV = 0x8DA6;
    public static final MethodHandle MH_glProgramLocalParameterI4iNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramLocalParameterI4iNV;
    public static final MethodHandle MH_glProgramLocalParameterI4ivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramLocalParameterI4ivNV;
    public static final MethodHandle MH_glProgramLocalParametersI4ivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramLocalParametersI4ivNV;
    public static final MethodHandle MH_glProgramLocalParameterI4uiNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramLocalParameterI4uiNV;
    public static final MethodHandle MH_glProgramLocalParameterI4uivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramLocalParameterI4uivNV;
    public static final MethodHandle MH_glProgramLocalParametersI4uivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramLocalParametersI4uivNV;
    public static final MethodHandle MH_glProgramEnvParameterI4iNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramEnvParameterI4iNV;
    public static final MethodHandle MH_glProgramEnvParameterI4ivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramEnvParameterI4ivNV;
    public static final MethodHandle MH_glProgramEnvParametersI4ivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramEnvParametersI4ivNV;
    public static final MethodHandle MH_glProgramEnvParameterI4uiNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramEnvParameterI4uiNV;
    public static final MethodHandle MH_glProgramEnvParameterI4uivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramEnvParameterI4uivNV;
    public static final MethodHandle MH_glProgramEnvParametersI4uivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramEnvParametersI4uivNV;
    public static final MethodHandle MH_glGetProgramLocalParameterIivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramLocalParameterIivNV;
    public static final MethodHandle MH_glGetProgramLocalParameterIuivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramLocalParameterIuivNV;
    public static final MethodHandle MH_glGetProgramEnvParameterIivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramEnvParameterIivNV;
    public static final MethodHandle MH_glGetProgramEnvParameterIuivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramEnvParameterIuivNV;

    public GLNVGpuProgram4(overrungl.opengl.GLLoadFunc func) {
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

    public void ProgramLocalParameterI4iNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z, @CType("GLint") int w) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramLocalParameterI4iNV))
            MH_glProgramLocalParameterI4iNV.invokeExact(PFN_glProgramLocalParameterI4iNV, target, index, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramLocalParameterI4iNV", e); }
    }

    public void ProgramLocalParameterI4ivNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramLocalParameterI4ivNV))
            MH_glProgramLocalParameterI4ivNV.invokeExact(PFN_glProgramLocalParameterI4ivNV, target, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramLocalParameterI4ivNV", e); }
    }

    public void ProgramLocalParametersI4ivNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramLocalParametersI4ivNV))
            MH_glProgramLocalParametersI4ivNV.invokeExact(PFN_glProgramLocalParametersI4ivNV, target, index, count, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramLocalParametersI4ivNV", e); }
    }

    public void ProgramLocalParameterI4uiNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int x, @CType("GLuint") int y, @CType("GLuint") int z, @CType("GLuint") int w) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramLocalParameterI4uiNV))
            MH_glProgramLocalParameterI4uiNV.invokeExact(PFN_glProgramLocalParameterI4uiNV, target, index, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramLocalParameterI4uiNV", e); }
    }

    public void ProgramLocalParameterI4uivNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramLocalParameterI4uivNV))
            MH_glProgramLocalParameterI4uivNV.invokeExact(PFN_glProgramLocalParameterI4uivNV, target, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramLocalParameterI4uivNV", e); }
    }

    public void ProgramLocalParametersI4uivNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramLocalParametersI4uivNV))
            MH_glProgramLocalParametersI4uivNV.invokeExact(PFN_glProgramLocalParametersI4uivNV, target, index, count, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramLocalParametersI4uivNV", e); }
    }

    public void ProgramEnvParameterI4iNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z, @CType("GLint") int w) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramEnvParameterI4iNV))
            MH_glProgramEnvParameterI4iNV.invokeExact(PFN_glProgramEnvParameterI4iNV, target, index, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramEnvParameterI4iNV", e); }
    }

    public void ProgramEnvParameterI4ivNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramEnvParameterI4ivNV))
            MH_glProgramEnvParameterI4ivNV.invokeExact(PFN_glProgramEnvParameterI4ivNV, target, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramEnvParameterI4ivNV", e); }
    }

    public void ProgramEnvParametersI4ivNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramEnvParametersI4ivNV))
            MH_glProgramEnvParametersI4ivNV.invokeExact(PFN_glProgramEnvParametersI4ivNV, target, index, count, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramEnvParametersI4ivNV", e); }
    }

    public void ProgramEnvParameterI4uiNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int x, @CType("GLuint") int y, @CType("GLuint") int z, @CType("GLuint") int w) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramEnvParameterI4uiNV))
            MH_glProgramEnvParameterI4uiNV.invokeExact(PFN_glProgramEnvParameterI4uiNV, target, index, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramEnvParameterI4uiNV", e); }
    }

    public void ProgramEnvParameterI4uivNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramEnvParameterI4uivNV))
            MH_glProgramEnvParameterI4uivNV.invokeExact(PFN_glProgramEnvParameterI4uivNV, target, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramEnvParameterI4uivNV", e); }
    }

    public void ProgramEnvParametersI4uivNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramEnvParametersI4uivNV))
            MH_glProgramEnvParametersI4uivNV.invokeExact(PFN_glProgramEnvParametersI4uivNV, target, index, count, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramEnvParametersI4uivNV", e); }
    }

    public void GetProgramLocalParameterIivNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetProgramLocalParameterIivNV))
            MH_glGetProgramLocalParameterIivNV.invokeExact(PFN_glGetProgramLocalParameterIivNV, target, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramLocalParameterIivNV", e); }
    }

    public void GetProgramLocalParameterIuivNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetProgramLocalParameterIuivNV))
            MH_glGetProgramLocalParameterIuivNV.invokeExact(PFN_glGetProgramLocalParameterIuivNV, target, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramLocalParameterIuivNV", e); }
    }

    public void GetProgramEnvParameterIivNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetProgramEnvParameterIivNV))
            MH_glGetProgramEnvParameterIivNV.invokeExact(PFN_glGetProgramEnvParameterIivNV, target, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramEnvParameterIivNV", e); }
    }

    public void GetProgramEnvParameterIuivNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetProgramEnvParameterIuivNV))
            MH_glGetProgramEnvParameterIuivNV.invokeExact(PFN_glGetProgramEnvParameterIuivNV, target, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramEnvParameterIuivNV", e); }
    }

}
