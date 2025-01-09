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

public sealed class GL11 extends GL10 permits GL12 {
    public static final int GL_COLOR_LOGIC_OP = 0x0BF2;
    public static final int GL_POLYGON_OFFSET_UNITS = 0x2A00;
    public static final int GL_POLYGON_OFFSET_POINT = 0x2A01;
    public static final int GL_POLYGON_OFFSET_LINE = 0x2A02;
    public static final int GL_POLYGON_OFFSET_FILL = 0x8037;
    public static final int GL_POLYGON_OFFSET_FACTOR = 0x8038;
    public static final int GL_TEXTURE_BINDING_1D = 0x8068;
    public static final int GL_TEXTURE_BINDING_2D = 0x8069;
    public static final int GL_TEXTURE_INTERNAL_FORMAT = 0x1003;
    public static final int GL_TEXTURE_RED_SIZE = 0x805C;
    public static final int GL_TEXTURE_GREEN_SIZE = 0x805D;
    public static final int GL_TEXTURE_BLUE_SIZE = 0x805E;
    public static final int GL_TEXTURE_ALPHA_SIZE = 0x805F;
    public static final int GL_DOUBLE = 0x140A;
    public static final int GL_PROXY_TEXTURE_1D = 0x8063;
    public static final int GL_PROXY_TEXTURE_2D = 0x8064;
    public static final int GL_R3_G3_B2 = 0x2A10;
    public static final int GL_RGB4 = 0x804F;
    public static final int GL_RGB5 = 0x8050;
    public static final int GL_RGB8 = 0x8051;
    public static final int GL_RGB10 = 0x8052;
    public static final int GL_RGB12 = 0x8053;
    public static final int GL_RGB16 = 0x8054;
    public static final int GL_RGBA2 = 0x8055;
    public static final int GL_RGBA4 = 0x8056;
    public static final int GL_RGB5_A1 = 0x8057;
    public static final int GL_RGBA8 = 0x8058;
    public static final int GL_RGB10_A2 = 0x8059;
    public static final int GL_RGBA12 = 0x805A;
    public static final int GL_RGBA16 = 0x805B;
    public static final MethodHandle MH_glDrawArrays = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glDrawElements = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glPolygonOffset = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glCopyTexImage1D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glCopyTexImage2D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glCopyTexSubImage1D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glCopyTexSubImage2D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glTexSubImage1D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glTexSubImage2D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glBindTexture = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glDeleteTextures = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGenTextures = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glIsTexture = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawArrays;
    public final MemorySegment PFN_glDrawElements;
    public final MemorySegment PFN_glPolygonOffset;
    public final MemorySegment PFN_glCopyTexImage1D;
    public final MemorySegment PFN_glCopyTexImage2D;
    public final MemorySegment PFN_glCopyTexSubImage1D;
    public final MemorySegment PFN_glCopyTexSubImage2D;
    public final MemorySegment PFN_glTexSubImage1D;
    public final MemorySegment PFN_glTexSubImage2D;
    public final MemorySegment PFN_glBindTexture;
    public final MemorySegment PFN_glDeleteTextures;
    public final MemorySegment PFN_glGenTextures;
    public final MemorySegment PFN_glIsTexture;

    public GL11(GLLoadFunc func) {
        super(func);
        PFN_glDrawArrays = func.invoke("glDrawArrays", "glDrawArraysEXT");
        PFN_glDrawElements = func.invoke("glDrawElements");
        PFN_glPolygonOffset = func.invoke("glPolygonOffset");
        PFN_glCopyTexImage1D = func.invoke("glCopyTexImage1D", "glCopyTexImage1DEXT");
        PFN_glCopyTexImage2D = func.invoke("glCopyTexImage2D", "glCopyTexImage2DEXT");
        PFN_glCopyTexSubImage1D = func.invoke("glCopyTexSubImage1D", "glCopyTexSubImage1DEXT");
        PFN_glCopyTexSubImage2D = func.invoke("glCopyTexSubImage2D", "glCopyTexSubImage2DEXT");
        PFN_glTexSubImage1D = func.invoke("glTexSubImage1D", "glTexSubImage1DEXT");
        PFN_glTexSubImage2D = func.invoke("glTexSubImage2D", "glTexSubImage2DEXT");
        PFN_glBindTexture = func.invoke("glBindTexture", "glBindTextureEXT");
        PFN_glDeleteTextures = func.invoke("glDeleteTextures");
        PFN_glGenTextures = func.invoke("glGenTextures");
        PFN_glIsTexture = func.invoke("glIsTexture");
    }

    public void DrawArrays(@CType("GLenum") int mode, @CType("GLint") int first, @CType("GLsizei") int count) {
        if (Unmarshal.isNullPointer(PFN_glDrawArrays)) throw new SymbolNotFoundError("Symbol not found: glDrawArrays");
        try { MH_glDrawArrays.invokeExact(PFN_glDrawArrays, mode, first, count); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawArrays", e); }
    }

    public void DrawElements(@CType("GLenum") int mode, @CType("GLsizei") int count, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indices) {
        if (Unmarshal.isNullPointer(PFN_glDrawElements)) throw new SymbolNotFoundError("Symbol not found: glDrawElements");
        try { MH_glDrawElements.invokeExact(PFN_glDrawElements, mode, count, type, indices); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawElements", e); }
    }

    public void PolygonOffset(@CType("GLfloat") float factor, @CType("GLfloat") float units) {
        if (Unmarshal.isNullPointer(PFN_glPolygonOffset)) throw new SymbolNotFoundError("Symbol not found: glPolygonOffset");
        try { MH_glPolygonOffset.invokeExact(PFN_glPolygonOffset, factor, units); }
        catch (Throwable e) { throw new RuntimeException("error in glPolygonOffset", e); }
    }

    public void CopyTexImage1D(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLint") int border) {
        if (Unmarshal.isNullPointer(PFN_glCopyTexImage1D)) throw new SymbolNotFoundError("Symbol not found: glCopyTexImage1D");
        try { MH_glCopyTexImage1D.invokeExact(PFN_glCopyTexImage1D, target, level, internalformat, x, y, width, border); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTexImage1D", e); }
    }

    public void CopyTexImage2D(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLint") int border) {
        if (Unmarshal.isNullPointer(PFN_glCopyTexImage2D)) throw new SymbolNotFoundError("Symbol not found: glCopyTexImage2D");
        try { MH_glCopyTexImage2D.invokeExact(PFN_glCopyTexImage2D, target, level, internalformat, x, y, width, height, border); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTexImage2D", e); }
    }

    public void CopyTexSubImage1D(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width) {
        if (Unmarshal.isNullPointer(PFN_glCopyTexSubImage1D)) throw new SymbolNotFoundError("Symbol not found: glCopyTexSubImage1D");
        try { MH_glCopyTexSubImage1D.invokeExact(PFN_glCopyTexSubImage1D, target, level, xoffset, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTexSubImage1D", e); }
    }

    public void CopyTexSubImage2D(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(PFN_glCopyTexSubImage2D)) throw new SymbolNotFoundError("Symbol not found: glCopyTexSubImage2D");
        try { MH_glCopyTexSubImage2D.invokeExact(PFN_glCopyTexSubImage2D, target, level, xoffset, yoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTexSubImage2D", e); }
    }

    public void TexSubImage1D(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(PFN_glTexSubImage1D)) throw new SymbolNotFoundError("Symbol not found: glTexSubImage1D");
        try { MH_glTexSubImage1D.invokeExact(PFN_glTexSubImage1D, target, level, xoffset, width, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTexSubImage1D", e); }
    }

    public void TexSubImage2D(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(PFN_glTexSubImage2D)) throw new SymbolNotFoundError("Symbol not found: glTexSubImage2D");
        try { MH_glTexSubImage2D.invokeExact(PFN_glTexSubImage2D, target, level, xoffset, yoffset, width, height, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTexSubImage2D", e); }
    }

    public void BindTexture(@CType("GLenum") int target, @CType("GLuint") int texture) {
        if (Unmarshal.isNullPointer(PFN_glBindTexture)) throw new SymbolNotFoundError("Symbol not found: glBindTexture");
        try { MH_glBindTexture.invokeExact(PFN_glBindTexture, target, texture); }
        catch (Throwable e) { throw new RuntimeException("error in glBindTexture", e); }
    }

    public void DeleteTextures(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment textures) {
        if (Unmarshal.isNullPointer(PFN_glDeleteTextures)) throw new SymbolNotFoundError("Symbol not found: glDeleteTextures");
        try { MH_glDeleteTextures.invokeExact(PFN_glDeleteTextures, n, textures); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteTextures", e); }
    }

    public void GenTextures(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment textures) {
        if (Unmarshal.isNullPointer(PFN_glGenTextures)) throw new SymbolNotFoundError("Symbol not found: glGenTextures");
        try { MH_glGenTextures.invokeExact(PFN_glGenTextures, n, textures); }
        catch (Throwable e) { throw new RuntimeException("error in glGenTextures", e); }
    }

    public @CType("GLboolean") boolean IsTexture(@CType("GLuint") int texture) {
        if (Unmarshal.isNullPointer(PFN_glIsTexture)) throw new SymbolNotFoundError("Symbol not found: glIsTexture");
        try { return (boolean) MH_glIsTexture.invokeExact(PFN_glIsTexture, texture); }
        catch (Throwable e) { throw new RuntimeException("error in glIsTexture", e); }
    }

    // --- OverrunGL custom code ---
    public void DeleteTextures(int texture) { try (var __stack = MemoryStack.pushLocal()) { DeleteTextures(1, __stack.ints(texture)); } }
    public int GenTextures() { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GenTextures(1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
}
