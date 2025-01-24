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

public final class GLNVBindlessTexture {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetTextureHandleNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetTextureSamplerHandleNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMakeTextureHandleResidentNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glMakeTextureHandleNonResidentNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glGetImageHandleNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMakeImageHandleResidentNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMakeImageHandleNonResidentNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniformHandleui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniformHandleui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformHandleui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniformHandleui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsTextureHandleResidentNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glIsImageHandleResidentNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_LONG));
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

    /// ```
    /// uint64_t glGetTextureHandleNV(unsigned int texture);
    /// ```
    public long GetTextureHandleNV(int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureHandleNV)) throw new SymbolNotFoundError("Symbol not found: glGetTextureHandleNV");
        try { return (long) Handles.MH_glGetTextureHandleNV.invokeExact(handles.PFN_glGetTextureHandleNV, texture); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureHandleNV", e); }
    }

    /// ```
    /// uint64_t glGetTextureSamplerHandleNV(unsigned int texture, unsigned int sampler);
    /// ```
    public long GetTextureSamplerHandleNV(int texture, int sampler) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureSamplerHandleNV)) throw new SymbolNotFoundError("Symbol not found: glGetTextureSamplerHandleNV");
        try { return (long) Handles.MH_glGetTextureSamplerHandleNV.invokeExact(handles.PFN_glGetTextureSamplerHandleNV, texture, sampler); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureSamplerHandleNV", e); }
    }

    /// ```
    /// void glMakeTextureHandleResidentNV(uint64_t handle);
    /// ```
    public void MakeTextureHandleResidentNV(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeTextureHandleResidentNV)) throw new SymbolNotFoundError("Symbol not found: glMakeTextureHandleResidentNV");
        try { Handles.MH_glMakeTextureHandleResidentNV.invokeExact(handles.PFN_glMakeTextureHandleResidentNV, handle); }
        catch (Throwable e) { throw new RuntimeException("error in MakeTextureHandleResidentNV", e); }
    }

    /// ```
    /// void glMakeTextureHandleNonResidentNV(uint64_t handle);
    /// ```
    public void MakeTextureHandleNonResidentNV(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeTextureHandleNonResidentNV)) throw new SymbolNotFoundError("Symbol not found: glMakeTextureHandleNonResidentNV");
        try { Handles.MH_glMakeTextureHandleNonResidentNV.invokeExact(handles.PFN_glMakeTextureHandleNonResidentNV, handle); }
        catch (Throwable e) { throw new RuntimeException("error in MakeTextureHandleNonResidentNV", e); }
    }

    /// ```
    /// uint64_t glGetImageHandleNV(unsigned int texture, int level, GLboolean layered, int layer, unsigned int format);
    /// ```
    public long GetImageHandleNV(int texture, int level, boolean layered, int layer, int format) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetImageHandleNV)) throw new SymbolNotFoundError("Symbol not found: glGetImageHandleNV");
        try { return (long) Handles.MH_glGetImageHandleNV.invokeExact(handles.PFN_glGetImageHandleNV, texture, level, ((layered) ? (byte)1 : (byte)0), layer, format); }
        catch (Throwable e) { throw new RuntimeException("error in GetImageHandleNV", e); }
    }

    /// ```
    /// void glMakeImageHandleResidentNV(uint64_t handle, unsigned int access);
    /// ```
    public void MakeImageHandleResidentNV(long handle, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeImageHandleResidentNV)) throw new SymbolNotFoundError("Symbol not found: glMakeImageHandleResidentNV");
        try { Handles.MH_glMakeImageHandleResidentNV.invokeExact(handles.PFN_glMakeImageHandleResidentNV, handle, access); }
        catch (Throwable e) { throw new RuntimeException("error in MakeImageHandleResidentNV", e); }
    }

    /// ```
    /// void glMakeImageHandleNonResidentNV(uint64_t handle);
    /// ```
    public void MakeImageHandleNonResidentNV(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeImageHandleNonResidentNV)) throw new SymbolNotFoundError("Symbol not found: glMakeImageHandleNonResidentNV");
        try { Handles.MH_glMakeImageHandleNonResidentNV.invokeExact(handles.PFN_glMakeImageHandleNonResidentNV, handle); }
        catch (Throwable e) { throw new RuntimeException("error in MakeImageHandleNonResidentNV", e); }
    }

    /// ```
    /// void glUniformHandleui64NV(int location, uint64_t value);
    /// ```
    public void UniformHandleui64NV(int location, long value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformHandleui64NV)) throw new SymbolNotFoundError("Symbol not found: glUniformHandleui64NV");
        try { Handles.MH_glUniformHandleui64NV.invokeExact(handles.PFN_glUniformHandleui64NV, location, value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformHandleui64NV", e); }
    }

    /// ```
    /// void glUniformHandleui64vNV(int location, int count, const GLuint64* value);
    /// ```
    public void UniformHandleui64vNV(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformHandleui64vNV)) throw new SymbolNotFoundError("Symbol not found: glUniformHandleui64vNV");
        try { Handles.MH_glUniformHandleui64vNV.invokeExact(handles.PFN_glUniformHandleui64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformHandleui64vNV", e); }
    }

    /// ```
    /// void glProgramUniformHandleui64NV(unsigned int program, int location, uint64_t value);
    /// ```
    public void ProgramUniformHandleui64NV(int program, int location, long value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformHandleui64NV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformHandleui64NV");
        try { Handles.MH_glProgramUniformHandleui64NV.invokeExact(handles.PFN_glProgramUniformHandleui64NV, program, location, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformHandleui64NV", e); }
    }

    /// ```
    /// void glProgramUniformHandleui64vNV(unsigned int program, int location, int count, const GLuint64* values);
    /// ```
    public void ProgramUniformHandleui64vNV(int program, int location, int count, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformHandleui64vNV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformHandleui64vNV");
        try { Handles.MH_glProgramUniformHandleui64vNV.invokeExact(handles.PFN_glProgramUniformHandleui64vNV, program, location, count, values); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformHandleui64vNV", e); }
    }

    /// ```
    /// GLboolean glIsTextureHandleResidentNV(uint64_t handle);
    /// ```
    public boolean IsTextureHandleResidentNV(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsTextureHandleResidentNV)) throw new SymbolNotFoundError("Symbol not found: glIsTextureHandleResidentNV");
        try { return (((byte) Handles.MH_glIsTextureHandleResidentNV.invokeExact(handles.PFN_glIsTextureHandleResidentNV, handle)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsTextureHandleResidentNV", e); }
    }

    /// ```
    /// GLboolean glIsImageHandleResidentNV(uint64_t handle);
    /// ```
    public boolean IsImageHandleResidentNV(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsImageHandleResidentNV)) throw new SymbolNotFoundError("Symbol not found: glIsImageHandleResidentNV");
        try { return (((byte) Handles.MH_glIsImageHandleResidentNV.invokeExact(handles.PFN_glIsImageHandleResidentNV, handle)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsImageHandleResidentNV", e); }
    }

}
