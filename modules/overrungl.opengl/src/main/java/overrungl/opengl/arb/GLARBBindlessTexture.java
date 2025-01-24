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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBBindlessTexture {
    public static final int GL_UNSIGNED_INT64_ARB = 0x140F;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetTextureHandleARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetTextureSamplerHandleARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMakeTextureHandleResidentARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glMakeTextureHandleNonResidentARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glGetImageHandleARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMakeImageHandleResidentARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMakeImageHandleNonResidentARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniformHandleui64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniformHandleui64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformHandleui64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniformHandleui64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsTextureHandleResidentARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glIsImageHandleResidentARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexAttribL1ui64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexAttribL1ui64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribLui64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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

    /// ```
    /// uint64_t glGetTextureHandleARB(unsigned int texture);
    /// ```
    public long GetTextureHandleARB(int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureHandleARB)) throw new SymbolNotFoundError("Symbol not found: glGetTextureHandleARB");
        try { return (long) Handles.MH_glGetTextureHandleARB.invokeExact(handles.PFN_glGetTextureHandleARB, texture); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureHandleARB", e); }
    }

    /// ```
    /// uint64_t glGetTextureSamplerHandleARB(unsigned int texture, unsigned int sampler);
    /// ```
    public long GetTextureSamplerHandleARB(int texture, int sampler) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureSamplerHandleARB)) throw new SymbolNotFoundError("Symbol not found: glGetTextureSamplerHandleARB");
        try { return (long) Handles.MH_glGetTextureSamplerHandleARB.invokeExact(handles.PFN_glGetTextureSamplerHandleARB, texture, sampler); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureSamplerHandleARB", e); }
    }

    /// ```
    /// void glMakeTextureHandleResidentARB(uint64_t handle);
    /// ```
    public void MakeTextureHandleResidentARB(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeTextureHandleResidentARB)) throw new SymbolNotFoundError("Symbol not found: glMakeTextureHandleResidentARB");
        try { Handles.MH_glMakeTextureHandleResidentARB.invokeExact(handles.PFN_glMakeTextureHandleResidentARB, handle); }
        catch (Throwable e) { throw new RuntimeException("error in MakeTextureHandleResidentARB", e); }
    }

    /// ```
    /// void glMakeTextureHandleNonResidentARB(uint64_t handle);
    /// ```
    public void MakeTextureHandleNonResidentARB(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeTextureHandleNonResidentARB)) throw new SymbolNotFoundError("Symbol not found: glMakeTextureHandleNonResidentARB");
        try { Handles.MH_glMakeTextureHandleNonResidentARB.invokeExact(handles.PFN_glMakeTextureHandleNonResidentARB, handle); }
        catch (Throwable e) { throw new RuntimeException("error in MakeTextureHandleNonResidentARB", e); }
    }

    /// ```
    /// uint64_t glGetImageHandleARB(unsigned int texture, int level, GLboolean layered, int layer, unsigned int format);
    /// ```
    public long GetImageHandleARB(int texture, int level, boolean layered, int layer, int format) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetImageHandleARB)) throw new SymbolNotFoundError("Symbol not found: glGetImageHandleARB");
        try { return (long) Handles.MH_glGetImageHandleARB.invokeExact(handles.PFN_glGetImageHandleARB, texture, level, ((layered) ? (byte)1 : (byte)0), layer, format); }
        catch (Throwable e) { throw new RuntimeException("error in GetImageHandleARB", e); }
    }

    /// ```
    /// void glMakeImageHandleResidentARB(uint64_t handle, unsigned int access);
    /// ```
    public void MakeImageHandleResidentARB(long handle, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeImageHandleResidentARB)) throw new SymbolNotFoundError("Symbol not found: glMakeImageHandleResidentARB");
        try { Handles.MH_glMakeImageHandleResidentARB.invokeExact(handles.PFN_glMakeImageHandleResidentARB, handle, access); }
        catch (Throwable e) { throw new RuntimeException("error in MakeImageHandleResidentARB", e); }
    }

    /// ```
    /// void glMakeImageHandleNonResidentARB(uint64_t handle);
    /// ```
    public void MakeImageHandleNonResidentARB(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeImageHandleNonResidentARB)) throw new SymbolNotFoundError("Symbol not found: glMakeImageHandleNonResidentARB");
        try { Handles.MH_glMakeImageHandleNonResidentARB.invokeExact(handles.PFN_glMakeImageHandleNonResidentARB, handle); }
        catch (Throwable e) { throw new RuntimeException("error in MakeImageHandleNonResidentARB", e); }
    }

    /// ```
    /// void glUniformHandleui64ARB(int location, uint64_t value);
    /// ```
    public void UniformHandleui64ARB(int location, long value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformHandleui64ARB)) throw new SymbolNotFoundError("Symbol not found: glUniformHandleui64ARB");
        try { Handles.MH_glUniformHandleui64ARB.invokeExact(handles.PFN_glUniformHandleui64ARB, location, value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformHandleui64ARB", e); }
    }

    /// ```
    /// void glUniformHandleui64vARB(int location, int count, const GLuint64* value);
    /// ```
    public void UniformHandleui64vARB(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformHandleui64vARB)) throw new SymbolNotFoundError("Symbol not found: glUniformHandleui64vARB");
        try { Handles.MH_glUniformHandleui64vARB.invokeExact(handles.PFN_glUniformHandleui64vARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformHandleui64vARB", e); }
    }

    /// ```
    /// void glProgramUniformHandleui64ARB(unsigned int program, int location, uint64_t value);
    /// ```
    public void ProgramUniformHandleui64ARB(int program, int location, long value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformHandleui64ARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformHandleui64ARB");
        try { Handles.MH_glProgramUniformHandleui64ARB.invokeExact(handles.PFN_glProgramUniformHandleui64ARB, program, location, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformHandleui64ARB", e); }
    }

    /// ```
    /// void glProgramUniformHandleui64vARB(unsigned int program, int location, int count, const GLuint64* values);
    /// ```
    public void ProgramUniformHandleui64vARB(int program, int location, int count, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformHandleui64vARB)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformHandleui64vARB");
        try { Handles.MH_glProgramUniformHandleui64vARB.invokeExact(handles.PFN_glProgramUniformHandleui64vARB, program, location, count, values); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformHandleui64vARB", e); }
    }

    /// ```
    /// GLboolean glIsTextureHandleResidentARB(uint64_t handle);
    /// ```
    public boolean IsTextureHandleResidentARB(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsTextureHandleResidentARB)) throw new SymbolNotFoundError("Symbol not found: glIsTextureHandleResidentARB");
        try { return (((byte) Handles.MH_glIsTextureHandleResidentARB.invokeExact(handles.PFN_glIsTextureHandleResidentARB, handle)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsTextureHandleResidentARB", e); }
    }

    /// ```
    /// GLboolean glIsImageHandleResidentARB(uint64_t handle);
    /// ```
    public boolean IsImageHandleResidentARB(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsImageHandleResidentARB)) throw new SymbolNotFoundError("Symbol not found: glIsImageHandleResidentARB");
        try { return (((byte) Handles.MH_glIsImageHandleResidentARB.invokeExact(handles.PFN_glIsImageHandleResidentARB, handle)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsImageHandleResidentARB", e); }
    }

    /// ```
    /// void glVertexAttribL1ui64ARB(unsigned int index, uint64_t x);
    /// ```
    public void VertexAttribL1ui64ARB(int index, long x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL1ui64ARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1ui64ARB");
        try { Handles.MH_glVertexAttribL1ui64ARB.invokeExact(handles.PFN_glVertexAttribL1ui64ARB, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL1ui64ARB", e); }
    }

    /// ```
    /// void glVertexAttribL1ui64vARB(unsigned int index, const GLuint64EXT* v);
    /// ```
    public void VertexAttribL1ui64vARB(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL1ui64vARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1ui64vARB");
        try { Handles.MH_glVertexAttribL1ui64vARB.invokeExact(handles.PFN_glVertexAttribL1ui64vARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL1ui64vARB", e); }
    }

    /// ```
    /// void glGetVertexAttribLui64vARB(unsigned int index, unsigned int pname, GLuint64EXT* params);
    /// ```
    public void GetVertexAttribLui64vARB(int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribLui64vARB)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribLui64vARB");
        try { Handles.MH_glGetVertexAttribLui64vARB.invokeExact(handles.PFN_glGetVertexAttribLui64vARB, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribLui64vARB", e); }
    }

}
