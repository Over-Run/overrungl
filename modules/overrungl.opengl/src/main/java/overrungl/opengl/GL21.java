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
package overrungl.opengl;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public sealed class GL21 extends GL20 permits GL30 {
    public static final int GL_PIXEL_PACK_BUFFER = 0x88EB;
    public static final int GL_PIXEL_UNPACK_BUFFER = 0x88EC;
    public static final int GL_PIXEL_PACK_BUFFER_BINDING = 0x88ED;
    public static final int GL_PIXEL_UNPACK_BUFFER_BINDING = 0x88EF;
    public static final int GL_FLOAT_MAT2x3 = 0x8B65;
    public static final int GL_FLOAT_MAT2x4 = 0x8B66;
    public static final int GL_FLOAT_MAT3x2 = 0x8B67;
    public static final int GL_FLOAT_MAT3x4 = 0x8B68;
    public static final int GL_FLOAT_MAT4x2 = 0x8B69;
    public static final int GL_FLOAT_MAT4x3 = 0x8B6A;
    public static final int GL_SRGB = 0x8C40;
    public static final int GL_SRGB8 = 0x8C41;
    public static final int GL_SRGB_ALPHA = 0x8C42;
    public static final int GL_SRGB8_ALPHA8 = 0x8C43;
    public static final int GL_COMPRESSED_SRGB = 0x8C48;
    public static final int GL_COMPRESSED_SRGB_ALPHA = 0x8C49;
    public static final MethodHandle MH_glUniformMatrix2x3fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformMatrix2x3fv;
    public static final MethodHandle MH_glUniformMatrix3x2fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformMatrix3x2fv;
    public static final MethodHandle MH_glUniformMatrix2x4fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformMatrix2x4fv;
    public static final MethodHandle MH_glUniformMatrix4x2fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformMatrix4x2fv;
    public static final MethodHandle MH_glUniformMatrix3x4fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformMatrix3x4fv;
    public static final MethodHandle MH_glUniformMatrix4x3fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformMatrix4x3fv;

    public GL21(GLLoadFunc func) {
        super(func);
        PFN_glUniformMatrix2x3fv = func.invoke("glUniformMatrix2x3fv", "glUniformMatrix2x3fvNV");
        PFN_glUniformMatrix3x2fv = func.invoke("glUniformMatrix3x2fv", "glUniformMatrix3x2fvNV");
        PFN_glUniformMatrix2x4fv = func.invoke("glUniformMatrix2x4fv", "glUniformMatrix2x4fvNV");
        PFN_glUniformMatrix4x2fv = func.invoke("glUniformMatrix4x2fv", "glUniformMatrix4x2fvNV");
        PFN_glUniformMatrix3x4fv = func.invoke("glUniformMatrix3x4fv", "glUniformMatrix3x4fvNV");
        PFN_glUniformMatrix4x3fv = func.invoke("glUniformMatrix4x3fv", "glUniformMatrix4x3fvNV");
    }

    public void UniformMatrix2x3fv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformMatrix2x3fv))
            MH_glUniformMatrix2x3fv.invokeExact(PFN_glUniformMatrix2x3fv, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix2x3fv", e); }
    }

    public void UniformMatrix3x2fv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformMatrix3x2fv))
            MH_glUniformMatrix3x2fv.invokeExact(PFN_glUniformMatrix3x2fv, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix3x2fv", e); }
    }

    public void UniformMatrix2x4fv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformMatrix2x4fv))
            MH_glUniformMatrix2x4fv.invokeExact(PFN_glUniformMatrix2x4fv, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix2x4fv", e); }
    }

    public void UniformMatrix4x2fv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformMatrix4x2fv))
            MH_glUniformMatrix4x2fv.invokeExact(PFN_glUniformMatrix4x2fv, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix4x2fv", e); }
    }

    public void UniformMatrix3x4fv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformMatrix3x4fv))
            MH_glUniformMatrix3x4fv.invokeExact(PFN_glUniformMatrix3x4fv, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix3x4fv", e); }
    }

    public void UniformMatrix4x3fv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformMatrix4x3fv))
            MH_glUniformMatrix4x3fv.invokeExact(PFN_glUniformMatrix4x3fv, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix4x3fv", e); }
    }

}
