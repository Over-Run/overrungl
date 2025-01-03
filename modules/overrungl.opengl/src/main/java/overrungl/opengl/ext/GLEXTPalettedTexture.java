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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTPalettedTexture {
    public static final int GL_COLOR_INDEX1_EXT = 0x80E2;
    public static final int GL_COLOR_INDEX2_EXT = 0x80E3;
    public static final int GL_COLOR_INDEX4_EXT = 0x80E4;
    public static final int GL_COLOR_INDEX8_EXT = 0x80E5;
    public static final int GL_COLOR_INDEX12_EXT = 0x80E6;
    public static final int GL_COLOR_INDEX16_EXT = 0x80E7;
    public static final int GL_TEXTURE_INDEX_SIZE_EXT = 0x80ED;
    public static final MethodHandle MH_glColorTableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glColorTableEXT;
    public static final MethodHandle MH_glGetColorTableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetColorTableEXT;
    public static final MethodHandle MH_glGetColorTableParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetColorTableParameterivEXT;
    public static final MethodHandle MH_glGetColorTableParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetColorTableParameterfvEXT;

    public GLEXTPalettedTexture(overrungl.opengl.GLLoadFunc func) {
        PFN_glColorTableEXT = func.invoke("glColorTableEXT", "glColorTable");
        PFN_glGetColorTableEXT = func.invoke("glGetColorTableEXT", "glGetColorTable");
        PFN_glGetColorTableParameterivEXT = func.invoke("glGetColorTableParameterivEXT", "glGetColorTableParameteriv");
        PFN_glGetColorTableParameterfvEXT = func.invoke("glGetColorTableParameterfvEXT", "glGetColorTableParameterfv");
    }

    public void ColorTableEXT(@CType("GLenum") int target, @CType("GLenum") int internalFormat, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment table) {
        try { if (!Unmarshal.isNullPointer(PFN_glColorTableEXT))
            MH_glColorTableEXT.invokeExact(PFN_glColorTableEXT, target, internalFormat, width, format, type, table);
        }
        catch (Throwable e) { throw new RuntimeException("error in glColorTableEXT", e); }
    }

    public void GetColorTableEXT(@CType("GLenum") int target, @CType("GLenum") int format, @CType("GLenum") int type, @CType("void*") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetColorTableEXT))
            MH_glGetColorTableEXT.invokeExact(PFN_glGetColorTableEXT, target, format, type, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetColorTableEXT", e); }
    }

    public void GetColorTableParameterivEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetColorTableParameterivEXT))
            MH_glGetColorTableParameterivEXT.invokeExact(PFN_glGetColorTableParameterivEXT, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetColorTableParameterivEXT", e); }
    }

    public void GetColorTableParameterfvEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetColorTableParameterfvEXT))
            MH_glGetColorTableParameterfvEXT.invokeExact(PFN_glGetColorTableParameterfvEXT, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetColorTableParameterfvEXT", e); }
    }

}
