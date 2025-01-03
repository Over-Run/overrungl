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

public final class GLARBGetProgramBinary {
    public static final int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 0x8257;
    public static final int GL_PROGRAM_BINARY_LENGTH = 0x8741;
    public static final int GL_NUM_PROGRAM_BINARY_FORMATS = 0x87FE;
    public static final int GL_PROGRAM_BINARY_FORMATS = 0x87FF;
    public static final MethodHandle MH_glGetProgramBinary = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramBinary;
    public static final MethodHandle MH_glProgramBinary = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramBinary;
    public static final MethodHandle MH_glProgramParameteri = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramParameteri;

    public GLARBGetProgramBinary(overrungl.opengl.GLLoadFunc func) {
        PFN_glGetProgramBinary = func.invoke("glGetProgramBinary");
        PFN_glProgramBinary = func.invoke("glProgramBinary");
        PFN_glProgramParameteri = func.invoke("glProgramParameteri");
    }

    public void GetProgramBinary(@CType("GLuint") int program, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLenum *") java.lang.foreign.MemorySegment binaryFormat, @CType("void*") java.lang.foreign.MemorySegment binary) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetProgramBinary))
            MH_glGetProgramBinary.invokeExact(PFN_glGetProgramBinary, program, bufSize, length, binaryFormat, binary);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramBinary", e); }
    }

    public void ProgramBinary(@CType("GLuint") int program, @CType("GLenum") int binaryFormat, @CType("const void *") java.lang.foreign.MemorySegment binary, @CType("GLsizei") int length) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramBinary))
            MH_glProgramBinary.invokeExact(PFN_glProgramBinary, program, binaryFormat, binary, length);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramBinary", e); }
    }

    public void ProgramParameteri(@CType("GLuint") int program, @CType("GLenum") int pname, @CType("GLint") int value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramParameteri))
            MH_glProgramParameteri.invokeExact(PFN_glProgramParameteri, program, pname, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramParameteri", e); }
    }

}
