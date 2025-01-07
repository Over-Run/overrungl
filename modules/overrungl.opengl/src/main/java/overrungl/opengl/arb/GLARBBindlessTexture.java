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

public final class GLARBBindlessTexture {
    public static final int GL_UNSIGNED_INT64_ARB = 0x140F;
    public static final MethodHandle MH_glGetTextureHandleARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGetTextureHandleARB;
    public static final MethodHandle MH_glGetTextureSamplerHandleARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGetTextureSamplerHandleARB;
    public static final MethodHandle MH_glMakeTextureHandleResidentARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glMakeTextureHandleResidentARB;
    public static final MethodHandle MH_glMakeTextureHandleNonResidentARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glMakeTextureHandleNonResidentARB;
    public static final MethodHandle MH_glGetImageHandleARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGetImageHandleARB;
    public static final MethodHandle MH_glMakeImageHandleResidentARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMakeImageHandleResidentARB;
    public static final MethodHandle MH_glMakeImageHandleNonResidentARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glMakeImageHandleNonResidentARB;
    public static final MethodHandle MH_glUniformHandleui64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glUniformHandleui64ARB;
    public static final MethodHandle MH_glUniformHandleui64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformHandleui64vARB;
    public static final MethodHandle MH_glProgramUniformHandleui64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glProgramUniformHandleui64ARB;
    public static final MethodHandle MH_glProgramUniformHandleui64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformHandleui64vARB;
    public static final MethodHandle MH_glIsTextureHandleResidentARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glIsTextureHandleResidentARB;
    public static final MethodHandle MH_glIsImageHandleResidentARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glIsImageHandleResidentARB;
    public static final MethodHandle MH_glVertexAttribL1ui64ARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexAttribL1ui64ARB;
    public static final MethodHandle MH_glVertexAttribL1ui64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribL1ui64vARB;
    public static final MethodHandle MH_glGetVertexAttribLui64vARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexAttribLui64vARB;

    public GLARBBindlessTexture(overrungl.opengl.GLLoadFunc func) {
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

    public @CType("GLuint64") long GetTextureHandleARB(@CType("GLuint") int texture) {
        if (!Unmarshal.isNullPointer(PFN_glGetTextureHandleARB)) { try {
            return (long) MH_glGetTextureHandleARB.invokeExact(PFN_glGetTextureHandleARB, texture);
        } catch (Throwable e) { throw new RuntimeException("error in glGetTextureHandleARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetTextureHandleARB"); }
    }

    public @CType("GLuint64") long GetTextureSamplerHandleARB(@CType("GLuint") int texture, @CType("GLuint") int sampler) {
        if (!Unmarshal.isNullPointer(PFN_glGetTextureSamplerHandleARB)) { try {
            return (long) MH_glGetTextureSamplerHandleARB.invokeExact(PFN_glGetTextureSamplerHandleARB, texture, sampler);
        } catch (Throwable e) { throw new RuntimeException("error in glGetTextureSamplerHandleARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetTextureSamplerHandleARB"); }
    }

    public void MakeTextureHandleResidentARB(@CType("GLuint64") long handle) {
        if (!Unmarshal.isNullPointer(PFN_glMakeTextureHandleResidentARB)) { try {
            MH_glMakeTextureHandleResidentARB.invokeExact(PFN_glMakeTextureHandleResidentARB, handle);
        } catch (Throwable e) { throw new RuntimeException("error in glMakeTextureHandleResidentARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMakeTextureHandleResidentARB"); }
    }

    public void MakeTextureHandleNonResidentARB(@CType("GLuint64") long handle) {
        if (!Unmarshal.isNullPointer(PFN_glMakeTextureHandleNonResidentARB)) { try {
            MH_glMakeTextureHandleNonResidentARB.invokeExact(PFN_glMakeTextureHandleNonResidentARB, handle);
        } catch (Throwable e) { throw new RuntimeException("error in glMakeTextureHandleNonResidentARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMakeTextureHandleNonResidentARB"); }
    }

    public @CType("GLuint64") long GetImageHandleARB(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLboolean") boolean layered, @CType("GLint") int layer, @CType("GLenum") int format) {
        if (!Unmarshal.isNullPointer(PFN_glGetImageHandleARB)) { try {
            return (long) MH_glGetImageHandleARB.invokeExact(PFN_glGetImageHandleARB, texture, level, layered, layer, format);
        } catch (Throwable e) { throw new RuntimeException("error in glGetImageHandleARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetImageHandleARB"); }
    }

    public void MakeImageHandleResidentARB(@CType("GLuint64") long handle, @CType("GLenum") int access) {
        if (!Unmarshal.isNullPointer(PFN_glMakeImageHandleResidentARB)) { try {
            MH_glMakeImageHandleResidentARB.invokeExact(PFN_glMakeImageHandleResidentARB, handle, access);
        } catch (Throwable e) { throw new RuntimeException("error in glMakeImageHandleResidentARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMakeImageHandleResidentARB"); }
    }

    public void MakeImageHandleNonResidentARB(@CType("GLuint64") long handle) {
        if (!Unmarshal.isNullPointer(PFN_glMakeImageHandleNonResidentARB)) { try {
            MH_glMakeImageHandleNonResidentARB.invokeExact(PFN_glMakeImageHandleNonResidentARB, handle);
        } catch (Throwable e) { throw new RuntimeException("error in glMakeImageHandleNonResidentARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMakeImageHandleNonResidentARB"); }
    }

    public void UniformHandleui64ARB(@CType("GLint") int location, @CType("GLuint64") long value) {
        if (!Unmarshal.isNullPointer(PFN_glUniformHandleui64ARB)) { try {
            MH_glUniformHandleui64ARB.invokeExact(PFN_glUniformHandleui64ARB, location, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniformHandleui64ARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniformHandleui64ARB"); }
    }

    public void UniformHandleui64vARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64 *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glUniformHandleui64vARB)) { try {
            MH_glUniformHandleui64vARB.invokeExact(PFN_glUniformHandleui64vARB, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniformHandleui64vARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniformHandleui64vARB"); }
    }

    public void ProgramUniformHandleui64ARB(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint64") long value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformHandleui64ARB)) { try {
            MH_glProgramUniformHandleui64ARB.invokeExact(PFN_glProgramUniformHandleui64ARB, program, location, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformHandleui64ARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformHandleui64ARB"); }
    }

    public void ProgramUniformHandleui64vARB(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64 *") java.lang.foreign.MemorySegment values) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformHandleui64vARB)) { try {
            MH_glProgramUniformHandleui64vARB.invokeExact(PFN_glProgramUniformHandleui64vARB, program, location, count, values);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformHandleui64vARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformHandleui64vARB"); }
    }

    public @CType("GLboolean") boolean IsTextureHandleResidentARB(@CType("GLuint64") long handle) {
        if (!Unmarshal.isNullPointer(PFN_glIsTextureHandleResidentARB)) { try {
            return (boolean) MH_glIsTextureHandleResidentARB.invokeExact(PFN_glIsTextureHandleResidentARB, handle);
        } catch (Throwable e) { throw new RuntimeException("error in glIsTextureHandleResidentARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glIsTextureHandleResidentARB"); }
    }

    public @CType("GLboolean") boolean IsImageHandleResidentARB(@CType("GLuint64") long handle) {
        if (!Unmarshal.isNullPointer(PFN_glIsImageHandleResidentARB)) { try {
            return (boolean) MH_glIsImageHandleResidentARB.invokeExact(PFN_glIsImageHandleResidentARB, handle);
        } catch (Throwable e) { throw new RuntimeException("error in glIsImageHandleResidentARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glIsImageHandleResidentARB"); }
    }

    public void VertexAttribL1ui64ARB(@CType("GLuint") int index, @CType("GLuint64EXT") long x) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL1ui64ARB)) { try {
            MH_glVertexAttribL1ui64ARB.invokeExact(PFN_glVertexAttribL1ui64ARB, index, x);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1ui64ARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1ui64ARB"); }
    }

    public void VertexAttribL1ui64vARB(@CType("GLuint") int index, @CType("const GLuint64EXT *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL1ui64vARB)) { try {
            MH_glVertexAttribL1ui64vARB.invokeExact(PFN_glVertexAttribL1ui64vARB, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1ui64vARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1ui64vARB"); }
    }

    public void GetVertexAttribLui64vARB(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLuint64EXT *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetVertexAttribLui64vARB)) { try {
            MH_glGetVertexAttribLui64vARB.invokeExact(PFN_glGetVertexAttribLui64vARB, index, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribLui64vARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribLui64vARB"); }
    }

}
