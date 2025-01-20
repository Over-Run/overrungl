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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVBindlessTexture {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glGetTextureHandleNV = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetTextureSamplerHandleNV = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMakeTextureHandleResidentNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glMakeTextureHandleNonResidentNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glGetImageHandleNV = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMakeImageHandleResidentNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMakeImageHandleNonResidentNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glUniformHandleui64NV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glUniformHandleui64vNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformHandleui64NV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glProgramUniformHandleui64vNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIsTextureHandleResidentNV = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glIsImageHandleResidentNV = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glGetTextureHandleNV,
            FD_glGetTextureSamplerHandleNV,
            FD_glMakeTextureHandleResidentNV,
            FD_glMakeTextureHandleNonResidentNV,
            FD_glGetImageHandleNV,
            FD_glMakeImageHandleResidentNV,
            FD_glMakeImageHandleNonResidentNV,
            FD_glUniformHandleui64NV,
            FD_glUniformHandleui64vNV,
            FD_glProgramUniformHandleui64NV,
            FD_glProgramUniformHandleui64vNV,
            FD_glIsTextureHandleResidentNV,
            FD_glIsImageHandleResidentNV
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glGetTextureHandleNV = RuntimeHelper.downcall(Descriptors.FD_glGetTextureHandleNV);
        public static final MethodHandle MH_glGetTextureSamplerHandleNV = RuntimeHelper.downcall(Descriptors.FD_glGetTextureSamplerHandleNV);
        public static final MethodHandle MH_glMakeTextureHandleResidentNV = RuntimeHelper.downcall(Descriptors.FD_glMakeTextureHandleResidentNV);
        public static final MethodHandle MH_glMakeTextureHandleNonResidentNV = RuntimeHelper.downcall(Descriptors.FD_glMakeTextureHandleNonResidentNV);
        public static final MethodHandle MH_glGetImageHandleNV = RuntimeHelper.downcall(Descriptors.FD_glGetImageHandleNV);
        public static final MethodHandle MH_glMakeImageHandleResidentNV = RuntimeHelper.downcall(Descriptors.FD_glMakeImageHandleResidentNV);
        public static final MethodHandle MH_glMakeImageHandleNonResidentNV = RuntimeHelper.downcall(Descriptors.FD_glMakeImageHandleNonResidentNV);
        public static final MethodHandle MH_glUniformHandleui64NV = RuntimeHelper.downcall(Descriptors.FD_glUniformHandleui64NV);
        public static final MethodHandle MH_glUniformHandleui64vNV = RuntimeHelper.downcall(Descriptors.FD_glUniformHandleui64vNV);
        public static final MethodHandle MH_glProgramUniformHandleui64NV = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformHandleui64NV);
        public static final MethodHandle MH_glProgramUniformHandleui64vNV = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformHandleui64vNV);
        public static final MethodHandle MH_glIsTextureHandleResidentNV = RuntimeHelper.downcall(Descriptors.FD_glIsTextureHandleResidentNV);
        public static final MethodHandle MH_glIsImageHandleResidentNV = RuntimeHelper.downcall(Descriptors.FD_glIsImageHandleResidentNV);
        public final MemorySegment PFN_glGetTextureHandleNV;
        public final MemorySegment PFN_glGetTextureSamplerHandleNV;
        public final MemorySegment PFN_glMakeTextureHandleResidentNV;
        public final MemorySegment PFN_glMakeTextureHandleNonResidentNV;
        public final MemorySegment PFN_glGetImageHandleNV;
        public final MemorySegment PFN_glMakeImageHandleResidentNV;
        public final MemorySegment PFN_glMakeImageHandleNonResidentNV;
        public final MemorySegment PFN_glUniformHandleui64NV;
        public final MemorySegment PFN_glUniformHandleui64vNV;
        public final MemorySegment PFN_glProgramUniformHandleui64NV;
        public final MemorySegment PFN_glProgramUniformHandleui64vNV;
        public final MemorySegment PFN_glIsTextureHandleResidentNV;
        public final MemorySegment PFN_glIsImageHandleResidentNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGetTextureHandleNV = func.invoke("glGetTextureHandleNV");
            PFN_glGetTextureSamplerHandleNV = func.invoke("glGetTextureSamplerHandleNV");
            PFN_glMakeTextureHandleResidentNV = func.invoke("glMakeTextureHandleResidentNV");
            PFN_glMakeTextureHandleNonResidentNV = func.invoke("glMakeTextureHandleNonResidentNV");
            PFN_glGetImageHandleNV = func.invoke("glGetImageHandleNV");
            PFN_glMakeImageHandleResidentNV = func.invoke("glMakeImageHandleResidentNV");
            PFN_glMakeImageHandleNonResidentNV = func.invoke("glMakeImageHandleNonResidentNV");
            PFN_glUniformHandleui64NV = func.invoke("glUniformHandleui64NV");
            PFN_glUniformHandleui64vNV = func.invoke("glUniformHandleui64vNV");
            PFN_glProgramUniformHandleui64NV = func.invoke("glProgramUniformHandleui64NV");
            PFN_glProgramUniformHandleui64vNV = func.invoke("glProgramUniformHandleui64vNV");
            PFN_glIsTextureHandleResidentNV = func.invoke("glIsTextureHandleResidentNV");
            PFN_glIsImageHandleResidentNV = func.invoke("glIsImageHandleResidentNV");
        }
    }

    public GLNVBindlessTexture(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public @CType("GLuint64") long GetTextureHandleNV(@CType("GLuint") int texture) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureHandleNV)) throw new SymbolNotFoundError("Symbol not found: glGetTextureHandleNV");
        try { return (long) Handles.MH_glGetTextureHandleNV.invokeExact(handles.PFN_glGetTextureHandleNV, texture); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureHandleNV", e); }
    }

    public @CType("GLuint64") long GetTextureSamplerHandleNV(@CType("GLuint") int texture, @CType("GLuint") int sampler) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureSamplerHandleNV)) throw new SymbolNotFoundError("Symbol not found: glGetTextureSamplerHandleNV");
        try { return (long) Handles.MH_glGetTextureSamplerHandleNV.invokeExact(handles.PFN_glGetTextureSamplerHandleNV, texture, sampler); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureSamplerHandleNV", e); }
    }

    public void MakeTextureHandleResidentNV(@CType("GLuint64") long handle) {
        if (Unmarshal.isNullPointer(handles.PFN_glMakeTextureHandleResidentNV)) throw new SymbolNotFoundError("Symbol not found: glMakeTextureHandleResidentNV");
        try { Handles.MH_glMakeTextureHandleResidentNV.invokeExact(handles.PFN_glMakeTextureHandleResidentNV, handle); }
        catch (Throwable e) { throw new RuntimeException("error in glMakeTextureHandleResidentNV", e); }
    }

    public void MakeTextureHandleNonResidentNV(@CType("GLuint64") long handle) {
        if (Unmarshal.isNullPointer(handles.PFN_glMakeTextureHandleNonResidentNV)) throw new SymbolNotFoundError("Symbol not found: glMakeTextureHandleNonResidentNV");
        try { Handles.MH_glMakeTextureHandleNonResidentNV.invokeExact(handles.PFN_glMakeTextureHandleNonResidentNV, handle); }
        catch (Throwable e) { throw new RuntimeException("error in glMakeTextureHandleNonResidentNV", e); }
    }

    public @CType("GLuint64") long GetImageHandleNV(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLboolean") boolean layered, @CType("GLint") int layer, @CType("GLenum") int format) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetImageHandleNV)) throw new SymbolNotFoundError("Symbol not found: glGetImageHandleNV");
        try { return (long) Handles.MH_glGetImageHandleNV.invokeExact(handles.PFN_glGetImageHandleNV, texture, level, layered, layer, format); }
        catch (Throwable e) { throw new RuntimeException("error in glGetImageHandleNV", e); }
    }

    public void MakeImageHandleResidentNV(@CType("GLuint64") long handle, @CType("GLenum") int access) {
        if (Unmarshal.isNullPointer(handles.PFN_glMakeImageHandleResidentNV)) throw new SymbolNotFoundError("Symbol not found: glMakeImageHandleResidentNV");
        try { Handles.MH_glMakeImageHandleResidentNV.invokeExact(handles.PFN_glMakeImageHandleResidentNV, handle, access); }
        catch (Throwable e) { throw new RuntimeException("error in glMakeImageHandleResidentNV", e); }
    }

    public void MakeImageHandleNonResidentNV(@CType("GLuint64") long handle) {
        if (Unmarshal.isNullPointer(handles.PFN_glMakeImageHandleNonResidentNV)) throw new SymbolNotFoundError("Symbol not found: glMakeImageHandleNonResidentNV");
        try { Handles.MH_glMakeImageHandleNonResidentNV.invokeExact(handles.PFN_glMakeImageHandleNonResidentNV, handle); }
        catch (Throwable e) { throw new RuntimeException("error in glMakeImageHandleNonResidentNV", e); }
    }

    public void UniformHandleui64NV(@CType("GLint") int location, @CType("GLuint64") long value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformHandleui64NV)) throw new SymbolNotFoundError("Symbol not found: glUniformHandleui64NV");
        try { Handles.MH_glUniformHandleui64NV.invokeExact(handles.PFN_glUniformHandleui64NV, location, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformHandleui64NV", e); }
    }

    public void UniformHandleui64vNV(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64 *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformHandleui64vNV)) throw new SymbolNotFoundError("Symbol not found: glUniformHandleui64vNV");
        try { Handles.MH_glUniformHandleui64vNV.invokeExact(handles.PFN_glUniformHandleui64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformHandleui64vNV", e); }
    }

    public void ProgramUniformHandleui64NV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint64") long value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformHandleui64NV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformHandleui64NV");
        try { Handles.MH_glProgramUniformHandleui64NV.invokeExact(handles.PFN_glProgramUniformHandleui64NV, program, location, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformHandleui64NV", e); }
    }

    public void ProgramUniformHandleui64vNV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64 *") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformHandleui64vNV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformHandleui64vNV");
        try { Handles.MH_glProgramUniformHandleui64vNV.invokeExact(handles.PFN_glProgramUniformHandleui64vNV, program, location, count, values); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformHandleui64vNV", e); }
    }

    public @CType("GLboolean") boolean IsTextureHandleResidentNV(@CType("GLuint64") long handle) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsTextureHandleResidentNV)) throw new SymbolNotFoundError("Symbol not found: glIsTextureHandleResidentNV");
        try { return (boolean) Handles.MH_glIsTextureHandleResidentNV.invokeExact(handles.PFN_glIsTextureHandleResidentNV, handle); }
        catch (Throwable e) { throw new RuntimeException("error in glIsTextureHandleResidentNV", e); }
    }

    public @CType("GLboolean") boolean IsImageHandleResidentNV(@CType("GLuint64") long handle) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsImageHandleResidentNV)) throw new SymbolNotFoundError("Symbol not found: glIsImageHandleResidentNV");
        try { return (boolean) Handles.MH_glIsImageHandleResidentNV.invokeExact(handles.PFN_glIsImageHandleResidentNV, handle); }
        catch (Throwable e) { throw new RuntimeException("error in glIsImageHandleResidentNV", e); }
    }

}
