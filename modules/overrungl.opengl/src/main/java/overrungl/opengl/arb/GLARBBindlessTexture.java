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
        try { if (!Unmarshal.isNullPointer(PFN_glGetTextureHandleARB))
            return (long) MH_glGetTextureHandleARB.invokeExact(PFN_glGetTextureHandleARB, texture);
            else return 0L;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureHandleARB", e); }
    }

    public @CType("GLuint64") long GetTextureSamplerHandleARB(@CType("GLuint") int texture, @CType("GLuint") int sampler) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTextureSamplerHandleARB))
            return (long) MH_glGetTextureSamplerHandleARB.invokeExact(PFN_glGetTextureSamplerHandleARB, texture, sampler);
            else return 0L;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureSamplerHandleARB", e); }
    }

    public void MakeTextureHandleResidentARB(@CType("GLuint64") long handle) {
        try { if (!Unmarshal.isNullPointer(PFN_glMakeTextureHandleResidentARB))
            MH_glMakeTextureHandleResidentARB.invokeExact(PFN_glMakeTextureHandleResidentARB, handle);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMakeTextureHandleResidentARB", e); }
    }

    public void MakeTextureHandleNonResidentARB(@CType("GLuint64") long handle) {
        try { if (!Unmarshal.isNullPointer(PFN_glMakeTextureHandleNonResidentARB))
            MH_glMakeTextureHandleNonResidentARB.invokeExact(PFN_glMakeTextureHandleNonResidentARB, handle);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMakeTextureHandleNonResidentARB", e); }
    }

    public @CType("GLuint64") long GetImageHandleARB(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLboolean") boolean layered, @CType("GLint") int layer, @CType("GLenum") int format) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetImageHandleARB))
            return (long) MH_glGetImageHandleARB.invokeExact(PFN_glGetImageHandleARB, texture, level, layered, layer, format);
            else return 0L;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetImageHandleARB", e); }
    }

    public void MakeImageHandleResidentARB(@CType("GLuint64") long handle, @CType("GLenum") int access) {
        try { if (!Unmarshal.isNullPointer(PFN_glMakeImageHandleResidentARB))
            MH_glMakeImageHandleResidentARB.invokeExact(PFN_glMakeImageHandleResidentARB, handle, access);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMakeImageHandleResidentARB", e); }
    }

    public void MakeImageHandleNonResidentARB(@CType("GLuint64") long handle) {
        try { if (!Unmarshal.isNullPointer(PFN_glMakeImageHandleNonResidentARB))
            MH_glMakeImageHandleNonResidentARB.invokeExact(PFN_glMakeImageHandleNonResidentARB, handle);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMakeImageHandleNonResidentARB", e); }
    }

    public void UniformHandleui64ARB(@CType("GLint") int location, @CType("GLuint64") long value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformHandleui64ARB))
            MH_glUniformHandleui64ARB.invokeExact(PFN_glUniformHandleui64ARB, location, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformHandleui64ARB", e); }
    }

    public void UniformHandleui64vARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64 *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformHandleui64vARB))
            MH_glUniformHandleui64vARB.invokeExact(PFN_glUniformHandleui64vARB, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformHandleui64vARB", e); }
    }

    public void ProgramUniformHandleui64ARB(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint64") long value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformHandleui64ARB))
            MH_glProgramUniformHandleui64ARB.invokeExact(PFN_glProgramUniformHandleui64ARB, program, location, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformHandleui64ARB", e); }
    }

    public void ProgramUniformHandleui64vARB(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64 *") java.lang.foreign.MemorySegment values) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformHandleui64vARB))
            MH_glProgramUniformHandleui64vARB.invokeExact(PFN_glProgramUniformHandleui64vARB, program, location, count, values);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformHandleui64vARB", e); }
    }

    public @CType("GLboolean") boolean IsTextureHandleResidentARB(@CType("GLuint64") long handle) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsTextureHandleResidentARB))
            return (boolean) MH_glIsTextureHandleResidentARB.invokeExact(PFN_glIsTextureHandleResidentARB, handle);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsTextureHandleResidentARB", e); }
    }

    public @CType("GLboolean") boolean IsImageHandleResidentARB(@CType("GLuint64") long handle) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsImageHandleResidentARB))
            return (boolean) MH_glIsImageHandleResidentARB.invokeExact(PFN_glIsImageHandleResidentARB, handle);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsImageHandleResidentARB", e); }
    }

    public void VertexAttribL1ui64ARB(@CType("GLuint") int index, @CType("GLuint64EXT") long x) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribL1ui64ARB))
            MH_glVertexAttribL1ui64ARB.invokeExact(PFN_glVertexAttribL1ui64ARB, index, x);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1ui64ARB", e); }
    }

    public void VertexAttribL1ui64vARB(@CType("GLuint") int index, @CType("const GLuint64EXT *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribL1ui64vARB))
            MH_glVertexAttribL1ui64vARB.invokeExact(PFN_glVertexAttribL1ui64vARB, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1ui64vARB", e); }
    }

    public void GetVertexAttribLui64vARB(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLuint64EXT *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetVertexAttribLui64vARB))
            MH_glGetVertexAttribLui64vARB.invokeExact(PFN_glGetVertexAttribLui64vARB, index, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribLui64vARB", e); }
    }

}
