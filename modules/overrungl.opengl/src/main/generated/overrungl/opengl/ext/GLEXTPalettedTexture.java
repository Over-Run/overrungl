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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_paletted_texture`
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
        public static final MethodHandle MH_glColorTableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetColorTableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetColorTableParameterivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetColorTableParameterfvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glColorTableEXT;
        public final MemorySegment PFN_glGetColorTableEXT;
        public final MemorySegment PFN_glGetColorTableParameterivEXT;
        public final MemorySegment PFN_glGetColorTableParameterfvEXT;
        private Handles(GLLoadFunc func) {
            PFN_glColorTableEXT = func.invoke("glColorTableEXT", "glColorTable");
            PFN_glGetColorTableEXT = func.invoke("glGetColorTableEXT", "glGetColorTable");
            PFN_glGetColorTableParameterivEXT = func.invoke("glGetColorTableParameterivEXT", "glGetColorTableParameteriv");
            PFN_glGetColorTableParameterfvEXT = func.invoke("glGetColorTableParameterfvEXT", "glGetColorTableParameterfv");
        }
    }

    public GLEXTPalettedTexture(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glColorTableEXT`.
    /// ```
    /// void glColorTableEXT((unsigned int) GLenum target, (unsigned int) GLenum internalFormat, (int) GLsizei width, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* table);
    /// ```
    public void ColorTableEXT(int target, int internalFormat, int width, int format, int type, @NonNull MemorySegment table) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorTableEXT)) throw new GLSymbolNotFoundError("Symbol not found: glColorTableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorTableEXT", target, internalFormat, width, format, type, table); }
        Handles.MH_glColorTableEXT.invokeExact(handles.PFN_glColorTableEXT, target, internalFormat, width, format, type, table); }
        catch (Throwable e) { throw new RuntimeException("error in ColorTableEXT", e); }
    }

    /// Invokes `glGetColorTableEXT`.
    /// ```
    /// void glGetColorTableEXT((unsigned int) GLenum target, (unsigned int) GLenum format, (unsigned int) GLenum type, void* data);
    /// ```
    public void GetColorTableEXT(int target, int format, int type, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetColorTableEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetColorTableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetColorTableEXT", target, format, type, data); }
        Handles.MH_glGetColorTableEXT.invokeExact(handles.PFN_glGetColorTableEXT, target, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetColorTableEXT", e); }
    }

    /// Invokes `glGetColorTableParameterivEXT`.
    /// ```
    /// void glGetColorTableParameterivEXT((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetColorTableParameterivEXT(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetColorTableParameterivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetColorTableParameterivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetColorTableParameterivEXT", target, pname, params); }
        Handles.MH_glGetColorTableParameterivEXT.invokeExact(handles.PFN_glGetColorTableParameterivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetColorTableParameterivEXT", e); }
    }

    /// Invokes `glGetColorTableParameterfvEXT`.
    /// ```
    /// void glGetColorTableParameterfvEXT((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetColorTableParameterfvEXT(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetColorTableParameterfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetColorTableParameterfvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetColorTableParameterfvEXT", target, pname, params); }
        Handles.MH_glGetColorTableParameterfvEXT.invokeExact(handles.PFN_glGetColorTableParameterfvEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetColorTableParameterfvEXT", e); }
    }

}
