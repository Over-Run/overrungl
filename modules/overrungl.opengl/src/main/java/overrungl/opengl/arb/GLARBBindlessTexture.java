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

public final class GLARBBindlessTexture {
    public static final int GL_UNSIGNED_INT64_ARB = 0x140F;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glGetTextureHandleARB = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetTextureSamplerHandleARB = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMakeTextureHandleResidentARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glMakeTextureHandleNonResidentARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glGetImageHandleARB = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMakeImageHandleResidentARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMakeImageHandleNonResidentARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glUniformHandleui64ARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glUniformHandleui64vARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformHandleui64ARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glProgramUniformHandleui64vARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIsTextureHandleResidentARB = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glIsImageHandleResidentARB = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexAttribL1ui64ARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexAttribL1ui64vARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVertexAttribLui64vARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glGetTextureHandleARB,
            FD_glGetTextureSamplerHandleARB,
            FD_glMakeTextureHandleResidentARB,
            FD_glMakeTextureHandleNonResidentARB,
            FD_glGetImageHandleARB,
            FD_glMakeImageHandleResidentARB,
            FD_glMakeImageHandleNonResidentARB,
            FD_glUniformHandleui64ARB,
            FD_glUniformHandleui64vARB,
            FD_glProgramUniformHandleui64ARB,
            FD_glProgramUniformHandleui64vARB,
            FD_glIsTextureHandleResidentARB,
            FD_glIsImageHandleResidentARB,
            FD_glVertexAttribL1ui64ARB,
            FD_glVertexAttribL1ui64vARB,
            FD_glGetVertexAttribLui64vARB
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glGetTextureHandleARB = RuntimeHelper.downcall(Descriptors.FD_glGetTextureHandleARB);
        public static final MethodHandle MH_glGetTextureSamplerHandleARB = RuntimeHelper.downcall(Descriptors.FD_glGetTextureSamplerHandleARB);
        public static final MethodHandle MH_glMakeTextureHandleResidentARB = RuntimeHelper.downcall(Descriptors.FD_glMakeTextureHandleResidentARB);
        public static final MethodHandle MH_glMakeTextureHandleNonResidentARB = RuntimeHelper.downcall(Descriptors.FD_glMakeTextureHandleNonResidentARB);
        public static final MethodHandle MH_glGetImageHandleARB = RuntimeHelper.downcall(Descriptors.FD_glGetImageHandleARB);
        public static final MethodHandle MH_glMakeImageHandleResidentARB = RuntimeHelper.downcall(Descriptors.FD_glMakeImageHandleResidentARB);
        public static final MethodHandle MH_glMakeImageHandleNonResidentARB = RuntimeHelper.downcall(Descriptors.FD_glMakeImageHandleNonResidentARB);
        public static final MethodHandle MH_glUniformHandleui64ARB = RuntimeHelper.downcall(Descriptors.FD_glUniformHandleui64ARB);
        public static final MethodHandle MH_glUniformHandleui64vARB = RuntimeHelper.downcall(Descriptors.FD_glUniformHandleui64vARB);
        public static final MethodHandle MH_glProgramUniformHandleui64ARB = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformHandleui64ARB);
        public static final MethodHandle MH_glProgramUniformHandleui64vARB = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformHandleui64vARB);
        public static final MethodHandle MH_glIsTextureHandleResidentARB = RuntimeHelper.downcall(Descriptors.FD_glIsTextureHandleResidentARB);
        public static final MethodHandle MH_glIsImageHandleResidentARB = RuntimeHelper.downcall(Descriptors.FD_glIsImageHandleResidentARB);
        public static final MethodHandle MH_glVertexAttribL1ui64ARB = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL1ui64ARB);
        public static final MethodHandle MH_glVertexAttribL1ui64vARB = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL1ui64vARB);
        public static final MethodHandle MH_glGetVertexAttribLui64vARB = RuntimeHelper.downcall(Descriptors.FD_glGetVertexAttribLui64vARB);
        public final MemorySegment PFN_glGetTextureHandleARB;
        public final MemorySegment PFN_glGetTextureSamplerHandleARB;
        public final MemorySegment PFN_glMakeTextureHandleResidentARB;
        public final MemorySegment PFN_glMakeTextureHandleNonResidentARB;
        public final MemorySegment PFN_glGetImageHandleARB;
        public final MemorySegment PFN_glMakeImageHandleResidentARB;
        public final MemorySegment PFN_glMakeImageHandleNonResidentARB;
        public final MemorySegment PFN_glUniformHandleui64ARB;
        public final MemorySegment PFN_glUniformHandleui64vARB;
        public final MemorySegment PFN_glProgramUniformHandleui64ARB;
        public final MemorySegment PFN_glProgramUniformHandleui64vARB;
        public final MemorySegment PFN_glIsTextureHandleResidentARB;
        public final MemorySegment PFN_glIsImageHandleResidentARB;
        public final MemorySegment PFN_glVertexAttribL1ui64ARB;
        public final MemorySegment PFN_glVertexAttribL1ui64vARB;
        public final MemorySegment PFN_glGetVertexAttribLui64vARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGetTextureHandleARB = func.invoke("glGetTextureHandleARB");
            PFN_glGetTextureSamplerHandleARB = func.invoke("glGetTextureSamplerHandleARB");
            PFN_glMakeTextureHandleResidentARB = func.invoke("glMakeTextureHandleResidentARB");
            PFN_glMakeTextureHandleNonResidentARB = func.invoke("glMakeTextureHandleNonResidentARB");
            PFN_glGetImageHandleARB = func.invoke("glGetImageHandleARB");
            PFN_glMakeImageHandleResidentARB = func.invoke("glMakeImageHandleResidentARB");
            PFN_glMakeImageHandleNonResidentARB = func.invoke("glMakeImageHandleNonResidentARB");
            PFN_glUniformHandleui64ARB = func.invoke("glUniformHandleui64ARB");
            PFN_glUniformHandleui64vARB = func.invoke("glUniformHandleui64vARB");
            PFN_glProgramUniformHandleui64ARB = func.invoke("glProgramUniformHandleui64ARB");
            PFN_glProgramUniformHandleui64vARB = func.invoke("glProgramUniformHandleui64vARB");
            PFN_glIsTextureHandleResidentARB = func.invoke("glIsTextureHandleResidentARB");
            PFN_glIsImageHandleResidentARB = func.invoke("glIsImageHandleResidentARB");
            PFN_glVertexAttribL1ui64ARB = func.invoke("glVertexAttribL1ui64ARB");
            PFN_glVertexAttribL1ui64vARB = func.invoke("glVertexAttribL1ui64vARB");
            PFN_glGetVertexAttribLui64vARB = func.invoke("glGetVertexAttribLui64vARB");
        }
    }

    public GLARBBindlessTexture(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public @CType("GLuint64") long GetTextureHandleARB(@CType("GLuint") int texture) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureHandleARB)) throw new SymbolNotFoundError("Symbol not found: glGetTextureHandleARB");
        try { return (long) Handles.MH_glGetTextureHandleARB.invokeExact(handles.PFN_glGetTextureHandleARB, texture); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureHandleARB", e); }
    }

    public @CType("GLuint64") long GetTextureSamplerHandleARB(@CType("GLuint") int texture, @CType("GLuint") int sampler) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureSamplerHandleARB)) throw new SymbolNotFoundError("Symbol not found: glGetTextureSamplerHandleARB");
        try { return (long) Handles.MH_glGetTextureSamplerHandleARB.invokeExact(handles.PFN_glGetTextureSamplerHandleARB, texture, sampler); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureSamplerHandleARB", e); }
    }

    public void MakeTextureHandleResidentARB(@CType("GLuint64") long handle) {
        if (Unmarshal.isNullPointer(handles.PFN_glMakeTextureHandleResidentARB)) throw new SymbolNotFoundError("Symbol not found: glMakeTextureHandleResidentARB");
        try { Handles.MH_glMakeTextureHandleResidentARB.invokeExact(handles.PFN_glMakeTextureHandleResidentARB, handle); }
        catch (Throwable e) { throw new RuntimeException("error in glMakeTextureHandleResidentARB", e); }
    }

    public void MakeTextureHandleNonResidentARB(@CType("GLuint64") long handle) {
        if (Unmarshal.isNullPointer(handles.PFN_glMakeTextureHandleNonResidentARB)) throw new SymbolNotFoundError("Symbol not found: glMakeTextureHandleNonResidentARB");
        try { Handles.MH_glMakeTextureHandleNonResidentARB.invokeExact(handles.PFN_glMakeTextureHandleNonResidentARB, handle); }
        catch (Throwable e) { throw new RuntimeException("error in glMakeTextureHandleNonResidentARB", e); }
    }

    public @CType("GLuint64") long GetImageHandleARB(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLboolean") boolean layered, @CType("GLint") int layer, @CType("GLenum") int format) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetImageHandleARB)) throw new SymbolNotFoundError("Symbol not found: glGetImageHandleARB");
        try { return (long) Handles.MH_glGetImageHandleARB.invokeExact(handles.PFN_glGetImageHandleARB, texture, level, layered, layer, format); }
        catch (Throwable e) { throw new RuntimeException("error in glGetImageHandleARB", e); }
    }

    public void MakeImageHandleResidentARB(@CType("GLuint64") long handle, @CType("GLenum") int access) {
        if (Unmarshal.isNullPointer(handles.PFN_glMakeImageHandleResidentARB)) throw new SymbolNotFoundError("Symbol not found: glMakeImageHandleResidentARB");
        try { Handles.MH_glMakeImageHandleResidentARB.invokeExact(handles.PFN_glMakeImageHandleResidentARB, handle, access); }
        catch (Throwable e) { throw new RuntimeException("error in glMakeImageHandleResidentARB", e); }
    }

    public void MakeImageHandleNonResidentARB(@CType("GLuint64") long handle) {
        if (Unmarshal.isNullPointer(handles.PFN_glMakeImageHandleNonResidentARB)) throw new SymbolNotFoundError("Symbol not found: glMakeImageHandleNonResidentARB");
        try { Handles.MH_glMakeImageHandleNonResidentARB.invokeExact(handles.PFN_glMakeImageHandleNonResidentARB, handle); }
        catch (Throwable e) { throw new RuntimeException("error in glMakeImageHandleNonResidentARB", e); }
    }

    public void UniformHandleui64ARB(@CType("GLint") int location, @CType("GLuint64") long value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformHandleui64ARB)) throw new SymbolNotFoundError("Symbol not found: glUniformHandleui64ARB");
        try { Handles.MH_glUniformHandleui64ARB.invokeExact(handles.PFN_glUniformHandleui64ARB, location, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformHandleui64ARB", e); }
    }

    public void UniformHandleui64vARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64 *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformHandleui64vARB)) throw new SymbolNotFoundError("Symbol not found: glUniformHandleui64vARB");
        try { Handles.MH_glUniformHandleui64vARB.invokeExact(handles.PFN_glUniformHandleui64vARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformHandleui64vARB", e); }
    }

    public void ProgramUniformHandleui64ARB(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint64") long value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformHandleui64ARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformHandleui64ARB");
        try { Handles.MH_glProgramUniformHandleui64ARB.invokeExact(handles.PFN_glProgramUniformHandleui64ARB, program, location, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformHandleui64ARB", e); }
    }

    public void ProgramUniformHandleui64vARB(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64 *") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformHandleui64vARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformHandleui64vARB");
        try { Handles.MH_glProgramUniformHandleui64vARB.invokeExact(handles.PFN_glProgramUniformHandleui64vARB, program, location, count, values); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformHandleui64vARB", e); }
    }

    public @CType("GLboolean") boolean IsTextureHandleResidentARB(@CType("GLuint64") long handle) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsTextureHandleResidentARB)) throw new SymbolNotFoundError("Symbol not found: glIsTextureHandleResidentARB");
        try { return (boolean) Handles.MH_glIsTextureHandleResidentARB.invokeExact(handles.PFN_glIsTextureHandleResidentARB, handle); }
        catch (Throwable e) { throw new RuntimeException("error in glIsTextureHandleResidentARB", e); }
    }

    public @CType("GLboolean") boolean IsImageHandleResidentARB(@CType("GLuint64") long handle) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsImageHandleResidentARB)) throw new SymbolNotFoundError("Symbol not found: glIsImageHandleResidentARB");
        try { return (boolean) Handles.MH_glIsImageHandleResidentARB.invokeExact(handles.PFN_glIsImageHandleResidentARB, handle); }
        catch (Throwable e) { throw new RuntimeException("error in glIsImageHandleResidentARB", e); }
    }

    public void VertexAttribL1ui64ARB(@CType("GLuint") int index, @CType("GLuint64EXT") long x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL1ui64ARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1ui64ARB");
        try { Handles.MH_glVertexAttribL1ui64ARB.invokeExact(handles.PFN_glVertexAttribL1ui64ARB, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1ui64ARB", e); }
    }

    public void VertexAttribL1ui64vARB(@CType("GLuint") int index, @CType("const GLuint64EXT *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL1ui64vARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1ui64vARB");
        try { Handles.MH_glVertexAttribL1ui64vARB.invokeExact(handles.PFN_glVertexAttribL1ui64vARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1ui64vARB", e); }
    }

    public void GetVertexAttribLui64vARB(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLuint64EXT *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexAttribLui64vARB)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribLui64vARB");
        try { Handles.MH_glGetVertexAttribLui64vARB.invokeExact(handles.PFN_glGetVertexAttribLui64vARB, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribLui64vARB", e); }
    }

}
