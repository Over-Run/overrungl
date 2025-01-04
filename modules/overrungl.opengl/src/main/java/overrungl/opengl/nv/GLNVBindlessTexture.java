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

public final class GLNVBindlessTexture {
    public static final MethodHandle MH_glGetTextureHandleNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGetTextureHandleNV;
    public static final MethodHandle MH_glGetTextureSamplerHandleNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGetTextureSamplerHandleNV;
    public static final MethodHandle MH_glMakeTextureHandleResidentNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glMakeTextureHandleResidentNV;
    public static final MethodHandle MH_glMakeTextureHandleNonResidentNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glMakeTextureHandleNonResidentNV;
    public static final MethodHandle MH_glGetImageHandleNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGetImageHandleNV;
    public static final MethodHandle MH_glMakeImageHandleResidentNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMakeImageHandleResidentNV;
    public static final MethodHandle MH_glMakeImageHandleNonResidentNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glMakeImageHandleNonResidentNV;
    public static final MethodHandle MH_glUniformHandleui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glUniformHandleui64NV;
    public static final MethodHandle MH_glUniformHandleui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformHandleui64vNV;
    public static final MethodHandle MH_glProgramUniformHandleui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glProgramUniformHandleui64NV;
    public static final MethodHandle MH_glProgramUniformHandleui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformHandleui64vNV;
    public static final MethodHandle MH_glIsTextureHandleResidentNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glIsTextureHandleResidentNV;
    public static final MethodHandle MH_glIsImageHandleResidentNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glIsImageHandleResidentNV;

    public GLNVBindlessTexture(overrungl.opengl.GLLoadFunc func) {
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

    public @CType("GLuint64") long GetTextureHandleNV(@CType("GLuint") int texture) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTextureHandleNV))
            return (long) MH_glGetTextureHandleNV.invokeExact(PFN_glGetTextureHandleNV, texture);
            else return 0L;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureHandleNV", e); }
    }

    public @CType("GLuint64") long GetTextureSamplerHandleNV(@CType("GLuint") int texture, @CType("GLuint") int sampler) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTextureSamplerHandleNV))
            return (long) MH_glGetTextureSamplerHandleNV.invokeExact(PFN_glGetTextureSamplerHandleNV, texture, sampler);
            else return 0L;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureSamplerHandleNV", e); }
    }

    public void MakeTextureHandleResidentNV(@CType("GLuint64") long handle) {
        try { if (!Unmarshal.isNullPointer(PFN_glMakeTextureHandleResidentNV))
            MH_glMakeTextureHandleResidentNV.invokeExact(PFN_glMakeTextureHandleResidentNV, handle);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMakeTextureHandleResidentNV", e); }
    }

    public void MakeTextureHandleNonResidentNV(@CType("GLuint64") long handle) {
        try { if (!Unmarshal.isNullPointer(PFN_glMakeTextureHandleNonResidentNV))
            MH_glMakeTextureHandleNonResidentNV.invokeExact(PFN_glMakeTextureHandleNonResidentNV, handle);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMakeTextureHandleNonResidentNV", e); }
    }

    public @CType("GLuint64") long GetImageHandleNV(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLboolean") boolean layered, @CType("GLint") int layer, @CType("GLenum") int format) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetImageHandleNV))
            return (long) MH_glGetImageHandleNV.invokeExact(PFN_glGetImageHandleNV, texture, level, layered, layer, format);
            else return 0L;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetImageHandleNV", e); }
    }

    public void MakeImageHandleResidentNV(@CType("GLuint64") long handle, @CType("GLenum") int access) {
        try { if (!Unmarshal.isNullPointer(PFN_glMakeImageHandleResidentNV))
            MH_glMakeImageHandleResidentNV.invokeExact(PFN_glMakeImageHandleResidentNV, handle, access);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMakeImageHandleResidentNV", e); }
    }

    public void MakeImageHandleNonResidentNV(@CType("GLuint64") long handle) {
        try { if (!Unmarshal.isNullPointer(PFN_glMakeImageHandleNonResidentNV))
            MH_glMakeImageHandleNonResidentNV.invokeExact(PFN_glMakeImageHandleNonResidentNV, handle);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMakeImageHandleNonResidentNV", e); }
    }

    public void UniformHandleui64NV(@CType("GLint") int location, @CType("GLuint64") long value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformHandleui64NV))
            MH_glUniformHandleui64NV.invokeExact(PFN_glUniformHandleui64NV, location, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformHandleui64NV", e); }
    }

    public void UniformHandleui64vNV(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64 *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformHandleui64vNV))
            MH_glUniformHandleui64vNV.invokeExact(PFN_glUniformHandleui64vNV, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformHandleui64vNV", e); }
    }

    public void ProgramUniformHandleui64NV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint64") long value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformHandleui64NV))
            MH_glProgramUniformHandleui64NV.invokeExact(PFN_glProgramUniformHandleui64NV, program, location, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformHandleui64NV", e); }
    }

    public void ProgramUniformHandleui64vNV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64 *") java.lang.foreign.MemorySegment values) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformHandleui64vNV))
            MH_glProgramUniformHandleui64vNV.invokeExact(PFN_glProgramUniformHandleui64vNV, program, location, count, values);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformHandleui64vNV", e); }
    }

    public @CType("GLboolean") boolean IsTextureHandleResidentNV(@CType("GLuint64") long handle) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsTextureHandleResidentNV))
            return (boolean) MH_glIsTextureHandleResidentNV.invokeExact(PFN_glIsTextureHandleResidentNV, handle);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsTextureHandleResidentNV", e); }
    }

    public @CType("GLboolean") boolean IsImageHandleResidentNV(@CType("GLuint64") long handle) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsImageHandleResidentNV))
            return (boolean) MH_glIsImageHandleResidentNV.invokeExact(PFN_glIsImageHandleResidentNV, handle);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsImageHandleResidentNV", e); }
    }

}
