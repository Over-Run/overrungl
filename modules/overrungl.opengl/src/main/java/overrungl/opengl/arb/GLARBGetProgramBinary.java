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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glGetProgramBinary = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramBinary = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramParameteri = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glGetProgramBinary = RuntimeHelper.downcall(Descriptors.FD_glGetProgramBinary);
        public static final MethodHandle MH_glProgramBinary = RuntimeHelper.downcall(Descriptors.FD_glProgramBinary);
        public static final MethodHandle MH_glProgramParameteri = RuntimeHelper.downcall(Descriptors.FD_glProgramParameteri);
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

    public void GetProgramBinary(@CType("GLuint") int program, @CType("GLsizei") int bufSize, @CType("GLsizei *") MemorySegment length, @CType("GLenum *") MemorySegment binaryFormat, @CType("void*") MemorySegment binary) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetProgramBinary)) throw new SymbolNotFoundError("Symbol not found: glGetProgramBinary");
        try { Handles.MH_glGetProgramBinary.invokeExact(handles.PFN_glGetProgramBinary, program, bufSize, length, binaryFormat, binary); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramBinary", e); }
    }

    public void ProgramBinary(@CType("GLuint") int program, @CType("GLenum") int binaryFormat, @CType("const void *") MemorySegment binary, @CType("GLsizei") int length) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramBinary)) throw new SymbolNotFoundError("Symbol not found: glProgramBinary");
        try { Handles.MH_glProgramBinary.invokeExact(handles.PFN_glProgramBinary, program, binaryFormat, binary, length); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramBinary", e); }
    }

    public void ProgramParameteri(@CType("GLuint") int program, @CType("GLenum") int pname, @CType("GLint") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramParameteri)) throw new SymbolNotFoundError("Symbol not found: glProgramParameteri");
        try { Handles.MH_glProgramParameteri.invokeExact(handles.PFN_glProgramParameteri, program, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramParameteri", e); }
    }

}
