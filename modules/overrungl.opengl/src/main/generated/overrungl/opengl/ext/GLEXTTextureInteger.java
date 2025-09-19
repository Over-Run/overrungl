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
/// `GL_EXT_texture_integer`
public final class GLEXTTextureInteger {
    public static final int GL_RGBA32UI_EXT = 0x8D70;
    public static final int GL_RGB32UI_EXT = 0x8D71;
    public static final int GL_ALPHA32UI_EXT = 0x8D72;
    public static final int GL_INTENSITY32UI_EXT = 0x8D73;
    public static final int GL_LUMINANCE32UI_EXT = 0x8D74;
    public static final int GL_LUMINANCE_ALPHA32UI_EXT = 0x8D75;
    public static final int GL_RGBA16UI_EXT = 0x8D76;
    public static final int GL_RGB16UI_EXT = 0x8D77;
    public static final int GL_ALPHA16UI_EXT = 0x8D78;
    public static final int GL_INTENSITY16UI_EXT = 0x8D79;
    public static final int GL_LUMINANCE16UI_EXT = 0x8D7A;
    public static final int GL_LUMINANCE_ALPHA16UI_EXT = 0x8D7B;
    public static final int GL_RGBA8UI_EXT = 0x8D7C;
    public static final int GL_RGB8UI_EXT = 0x8D7D;
    public static final int GL_ALPHA8UI_EXT = 0x8D7E;
    public static final int GL_INTENSITY8UI_EXT = 0x8D7F;
    public static final int GL_LUMINANCE8UI_EXT = 0x8D80;
    public static final int GL_LUMINANCE_ALPHA8UI_EXT = 0x8D81;
    public static final int GL_RGBA32I_EXT = 0x8D82;
    public static final int GL_RGB32I_EXT = 0x8D83;
    public static final int GL_ALPHA32I_EXT = 0x8D84;
    public static final int GL_INTENSITY32I_EXT = 0x8D85;
    public static final int GL_LUMINANCE32I_EXT = 0x8D86;
    public static final int GL_LUMINANCE_ALPHA32I_EXT = 0x8D87;
    public static final int GL_RGBA16I_EXT = 0x8D88;
    public static final int GL_RGB16I_EXT = 0x8D89;
    public static final int GL_ALPHA16I_EXT = 0x8D8A;
    public static final int GL_INTENSITY16I_EXT = 0x8D8B;
    public static final int GL_LUMINANCE16I_EXT = 0x8D8C;
    public static final int GL_LUMINANCE_ALPHA16I_EXT = 0x8D8D;
    public static final int GL_RGBA8I_EXT = 0x8D8E;
    public static final int GL_RGB8I_EXT = 0x8D8F;
    public static final int GL_ALPHA8I_EXT = 0x8D90;
    public static final int GL_INTENSITY8I_EXT = 0x8D91;
    public static final int GL_LUMINANCE8I_EXT = 0x8D92;
    public static final int GL_LUMINANCE_ALPHA8I_EXT = 0x8D93;
    public static final int GL_RED_INTEGER_EXT = 0x8D94;
    public static final int GL_GREEN_INTEGER_EXT = 0x8D95;
    public static final int GL_BLUE_INTEGER_EXT = 0x8D96;
    public static final int GL_ALPHA_INTEGER_EXT = 0x8D97;
    public static final int GL_RGB_INTEGER_EXT = 0x8D98;
    public static final int GL_RGBA_INTEGER_EXT = 0x8D99;
    public static final int GL_BGR_INTEGER_EXT = 0x8D9A;
    public static final int GL_BGRA_INTEGER_EXT = 0x8D9B;
    public static final int GL_LUMINANCE_INTEGER_EXT = 0x8D9C;
    public static final int GL_LUMINANCE_ALPHA_INTEGER_EXT = 0x8D9D;
    public static final int GL_RGBA_INTEGER_MODE_EXT = 0x8D9E;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTexParameterIivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexParameterIuivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTexParameterIivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTexParameterIuivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClearColorIiEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glClearColorIuiEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glTexParameterIivEXT;
        public final MemorySegment PFN_glTexParameterIuivEXT;
        public final MemorySegment PFN_glGetTexParameterIivEXT;
        public final MemorySegment PFN_glGetTexParameterIuivEXT;
        public final MemorySegment PFN_glClearColorIiEXT;
        public final MemorySegment PFN_glClearColorIuiEXT;
        private Handles(GLLoadFunc func) {
            PFN_glTexParameterIivEXT = func.invoke("glTexParameterIivEXT", "glTexParameterIiv");
            PFN_glTexParameterIuivEXT = func.invoke("glTexParameterIuivEXT", "glTexParameterIuiv");
            PFN_glGetTexParameterIivEXT = func.invoke("glGetTexParameterIivEXT", "glGetTexParameterIiv");
            PFN_glGetTexParameterIuivEXT = func.invoke("glGetTexParameterIuivEXT", "glGetTexParameterIuiv");
            PFN_glClearColorIiEXT = func.invoke("glClearColorIiEXT");
            PFN_glClearColorIuiEXT = func.invoke("glClearColorIuiEXT");
        }
    }

    public GLEXTTextureInteger(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTexParameterIivEXT`.
    /// ```
    /// void glTexParameterIivEXT((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void TexParameterIivEXT(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexParameterIivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTexParameterIivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexParameterIivEXT", target, pname, params); }
        Handles.MH_glTexParameterIivEXT.invokeExact(handles.PFN_glTexParameterIivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in TexParameterIivEXT", e); }
    }

    /// Invokes `glTexParameterIuivEXT`.
    /// ```
    /// void glTexParameterIuivEXT((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLuint* params);
    /// ```
    public void TexParameterIuivEXT(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexParameterIuivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTexParameterIuivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexParameterIuivEXT", target, pname, params); }
        Handles.MH_glTexParameterIuivEXT.invokeExact(handles.PFN_glTexParameterIuivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in TexParameterIuivEXT", e); }
    }

    /// Invokes `glGetTexParameterIivEXT`.
    /// ```
    /// void glGetTexParameterIivEXT((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetTexParameterIivEXT(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTexParameterIivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetTexParameterIivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTexParameterIivEXT", target, pname, params); }
        Handles.MH_glGetTexParameterIivEXT.invokeExact(handles.PFN_glGetTexParameterIivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTexParameterIivEXT", e); }
    }

    /// Invokes `glGetTexParameterIuivEXT`.
    /// ```
    /// void glGetTexParameterIuivEXT((unsigned int) GLenum target, (unsigned int) GLenum pname, GLuint* params);
    /// ```
    public void GetTexParameterIuivEXT(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTexParameterIuivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetTexParameterIuivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTexParameterIuivEXT", target, pname, params); }
        Handles.MH_glGetTexParameterIuivEXT.invokeExact(handles.PFN_glGetTexParameterIuivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTexParameterIuivEXT", e); }
    }

    /// Invokes `glClearColorIiEXT`.
    /// ```
    /// void glClearColorIiEXT((int) GLint red, (int) GLint green, (int) GLint blue, (int) GLint alpha);
    /// ```
    public void ClearColorIiEXT(int red, int green, int blue, int alpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearColorIiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glClearColorIiEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearColorIiEXT", red, green, blue, alpha); }
        Handles.MH_glClearColorIiEXT.invokeExact(handles.PFN_glClearColorIiEXT, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in ClearColorIiEXT", e); }
    }

    /// Invokes `glClearColorIuiEXT`.
    /// ```
    /// void glClearColorIuiEXT((unsigned int) GLuint red, (unsigned int) GLuint green, (unsigned int) GLuint blue, (unsigned int) GLuint alpha);
    /// ```
    public void ClearColorIuiEXT(int red, int green, int blue, int alpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearColorIuiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glClearColorIuiEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearColorIuiEXT", red, green, blue, alpha); }
        Handles.MH_glClearColorIuiEXT.invokeExact(handles.PFN_glClearColorIuiEXT, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in ClearColorIuiEXT", e); }
    }

}
