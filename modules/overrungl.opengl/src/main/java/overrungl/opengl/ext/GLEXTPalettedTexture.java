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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glColorTableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetColorTableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetColorTableParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetColorTableParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glColorTableEXT;
        public final MemorySegment PFN_glGetColorTableEXT;
        public final MemorySegment PFN_glGetColorTableParameterivEXT;
        public final MemorySegment PFN_glGetColorTableParameterfvEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glColorTableEXT = func.invoke("glColorTableEXT", "glColorTable");
            PFN_glGetColorTableEXT = func.invoke("glGetColorTableEXT", "glGetColorTable");
            PFN_glGetColorTableParameterivEXT = func.invoke("glGetColorTableParameterivEXT", "glGetColorTableParameteriv");
            PFN_glGetColorTableParameterfvEXT = func.invoke("glGetColorTableParameterfvEXT", "glGetColorTableParameterfv");
        }
    }

    public GLEXTPalettedTexture(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glColorTableEXT(GLenum target, GLenum internalFormat, GLsizei width, GLenum format, GLenum type, const void* table);
    /// ```
    public void ColorTableEXT(int target, int internalFormat, int width, int format, int type, MemorySegment table) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorTableEXT)) throw new SymbolNotFoundError("Symbol not found: glColorTableEXT");
        try { Handles.MH_glColorTableEXT.invokeExact(handles.PFN_glColorTableEXT, target, internalFormat, width, format, type, table); }
        catch (Throwable e) { throw new RuntimeException("error in ColorTableEXT", e); }
    }

    /// ```
    /// void glGetColorTableEXT(GLenum target, GLenum format, GLenum type, void* data);
    /// ```
    public void GetColorTableEXT(int target, int format, int type, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetColorTableEXT)) throw new SymbolNotFoundError("Symbol not found: glGetColorTableEXT");
        try { Handles.MH_glGetColorTableEXT.invokeExact(handles.PFN_glGetColorTableEXT, target, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetColorTableEXT", e); }
    }

    /// ```
    /// void glGetColorTableParameterivEXT(GLenum target, GLenum pname, GLint* params);
    /// ```
    public void GetColorTableParameterivEXT(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetColorTableParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetColorTableParameterivEXT");
        try { Handles.MH_glGetColorTableParameterivEXT.invokeExact(handles.PFN_glGetColorTableParameterivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetColorTableParameterivEXT", e); }
    }

    /// ```
    /// void glGetColorTableParameterfvEXT(GLenum target, GLenum pname, GLfloat* params);
    /// ```
    public void GetColorTableParameterfvEXT(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetColorTableParameterfvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetColorTableParameterfvEXT");
        try { Handles.MH_glGetColorTableParameterfvEXT.invokeExact(handles.PFN_glGetColorTableParameterfvEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetColorTableParameterfvEXT", e); }
    }

}
