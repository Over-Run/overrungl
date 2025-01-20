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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glTexParameterIivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexParameterIuivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTexParameterIivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTexParameterIuivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glClearColorIiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glClearColorIuiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glTexParameterIivEXT,
            FD_glTexParameterIuivEXT,
            FD_glGetTexParameterIivEXT,
            FD_glGetTexParameterIuivEXT,
            FD_glClearColorIiEXT,
            FD_glClearColorIuiEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glTexParameterIivEXT = RuntimeHelper.downcall(Descriptors.FD_glTexParameterIivEXT);
        public static final MethodHandle MH_glTexParameterIuivEXT = RuntimeHelper.downcall(Descriptors.FD_glTexParameterIuivEXT);
        public static final MethodHandle MH_glGetTexParameterIivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetTexParameterIivEXT);
        public static final MethodHandle MH_glGetTexParameterIuivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetTexParameterIuivEXT);
        public static final MethodHandle MH_glClearColorIiEXT = RuntimeHelper.downcall(Descriptors.FD_glClearColorIiEXT);
        public static final MethodHandle MH_glClearColorIuiEXT = RuntimeHelper.downcall(Descriptors.FD_glClearColorIuiEXT);
        public final MemorySegment PFN_glTexParameterIivEXT;
        public final MemorySegment PFN_glTexParameterIuivEXT;
        public final MemorySegment PFN_glGetTexParameterIivEXT;
        public final MemorySegment PFN_glGetTexParameterIuivEXT;
        public final MemorySegment PFN_glClearColorIiEXT;
        public final MemorySegment PFN_glClearColorIuiEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTexParameterIivEXT = func.invoke("glTexParameterIivEXT", "glTexParameterIiv");
            PFN_glTexParameterIuivEXT = func.invoke("glTexParameterIuivEXT", "glTexParameterIuiv");
            PFN_glGetTexParameterIivEXT = func.invoke("glGetTexParameterIivEXT", "glGetTexParameterIiv");
            PFN_glGetTexParameterIuivEXT = func.invoke("glGetTexParameterIuivEXT", "glGetTexParameterIuiv");
            PFN_glClearColorIiEXT = func.invoke("glClearColorIiEXT");
            PFN_glClearColorIuiEXT = func.invoke("glClearColorIuiEXT");
        }
    }

    public GLEXTTextureInteger(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void TexParameterIivEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexParameterIivEXT)) throw new SymbolNotFoundError("Symbol not found: glTexParameterIivEXT");
        try { Handles.MH_glTexParameterIivEXT.invokeExact(handles.PFN_glTexParameterIivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glTexParameterIivEXT", e); }
    }

    public void TexParameterIuivEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexParameterIuivEXT)) throw new SymbolNotFoundError("Symbol not found: glTexParameterIuivEXT");
        try { Handles.MH_glTexParameterIuivEXT.invokeExact(handles.PFN_glTexParameterIuivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glTexParameterIuivEXT", e); }
    }

    public void GetTexParameterIivEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTexParameterIivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetTexParameterIivEXT");
        try { Handles.MH_glGetTexParameterIivEXT.invokeExact(handles.PFN_glGetTexParameterIivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexParameterIivEXT", e); }
    }

    public void GetTexParameterIuivEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTexParameterIuivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetTexParameterIuivEXT");
        try { Handles.MH_glGetTexParameterIuivEXT.invokeExact(handles.PFN_glGetTexParameterIuivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexParameterIuivEXT", e); }
    }

    public void ClearColorIiEXT(@CType("GLint") int red, @CType("GLint") int green, @CType("GLint") int blue, @CType("GLint") int alpha) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearColorIiEXT)) throw new SymbolNotFoundError("Symbol not found: glClearColorIiEXT");
        try { Handles.MH_glClearColorIiEXT.invokeExact(handles.PFN_glClearColorIiEXT, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in glClearColorIiEXT", e); }
    }

    public void ClearColorIuiEXT(@CType("GLuint") int red, @CType("GLuint") int green, @CType("GLuint") int blue, @CType("GLuint") int alpha) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearColorIuiEXT)) throw new SymbolNotFoundError("Symbol not found: glClearColorIuiEXT");
        try { Handles.MH_glClearColorIuiEXT.invokeExact(handles.PFN_glClearColorIuiEXT, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in glClearColorIuiEXT", e); }
    }

}
