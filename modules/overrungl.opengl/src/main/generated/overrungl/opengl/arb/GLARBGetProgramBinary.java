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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBGetProgramBinary {
    public static final int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 0x8257;
    public static final int GL_PROGRAM_BINARY_LENGTH = 0x8741;
    public static final int GL_NUM_PROGRAM_BINARY_FORMATS = 0x87FE;
    public static final int GL_PROGRAM_BINARY_FORMATS = 0x87FF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetProgramBinary = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramBinary = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramParameteri = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glGetProgramBinary;
        public final MemorySegment PFN_glProgramBinary;
        public final MemorySegment PFN_glProgramParameteri;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGetProgramBinary = func.invoke("glGetProgramBinary");
            PFN_glProgramBinary = func.invoke("glProgramBinary");
            PFN_glProgramParameteri = func.invoke("glProgramParameteri");
        }
    }

    public GLARBGetProgramBinary(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glGetProgramBinary((unsigned int) GLuint program, (int) GLsizei bufSize, GLsizei* length, GLenum* binaryFormat, void* binary);
    /// ```
    public void GetProgramBinary(int program, int bufSize, MemorySegment length, MemorySegment binaryFormat, MemorySegment binary) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramBinary)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramBinary");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramBinary", program, bufSize, length, binaryFormat, binary); }
        Handles.MH_glGetProgramBinary.invokeExact(handles.PFN_glGetProgramBinary, program, bufSize, length, binaryFormat, binary); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramBinary", e); }
    }

    /// ```
    /// void glProgramBinary((unsigned int) GLuint program, (unsigned int) GLenum binaryFormat, const void* binary, (int) GLsizei length);
    /// ```
    public void ProgramBinary(int program, int binaryFormat, MemorySegment binary, int length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramBinary)) throw new GLSymbolNotFoundError("Symbol not found: glProgramBinary");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramBinary", program, binaryFormat, binary, length); }
        Handles.MH_glProgramBinary.invokeExact(handles.PFN_glProgramBinary, program, binaryFormat, binary, length); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramBinary", e); }
    }

    /// ```
    /// void glProgramParameteri((unsigned int) GLuint program, (unsigned int) GLenum pname, (int) GLint value);
    /// ```
    public void ProgramParameteri(int program, int pname, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameteri)) throw new GLSymbolNotFoundError("Symbol not found: glProgramParameteri");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramParameteri", program, pname, value); }
        Handles.MH_glProgramParameteri.invokeExact(handles.PFN_glProgramParameteri, program, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameteri", e); }
    }

}
