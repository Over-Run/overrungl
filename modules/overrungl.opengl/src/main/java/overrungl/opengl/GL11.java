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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public class GL11 extends GL10 {
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
    private final Handles handles;
    public static final class Handles {
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
        public static final MethodHandle MH_glIsTexture = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
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
        private Handles(GLLoadFunc func) {
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
    }

    public GL11(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    /// ```
    /// void glDrawArrays((unsigned int) GLenum mode, (int) GLint first, (int) GLsizei count);
    /// ```
    public void DrawArrays(int mode, int first, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawArrays)) throw new SymbolNotFoundError("Symbol not found: glDrawArrays");
        try { Handles.MH_glDrawArrays.invokeExact(handles.PFN_glDrawArrays, mode, first, count); }
        catch (Throwable e) { throw new RuntimeException("error in DrawArrays", e); }
    }

    /// ```
    /// void glDrawElements((unsigned int) GLenum mode, (int) GLsizei count, (unsigned int) GLenum type, const void* indices);
    /// ```
    public void DrawElements(int mode, int count, int type, MemorySegment indices) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElements)) throw new SymbolNotFoundError("Symbol not found: glDrawElements");
        try { Handles.MH_glDrawElements.invokeExact(handles.PFN_glDrawElements, mode, count, type, indices); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElements", e); }
    }

    /// ```
    /// void glPolygonOffset(((float) khronos_float_t) GLfloat factor, ((float) khronos_float_t) GLfloat units);
    /// ```
    public void PolygonOffset(float factor, float units) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPolygonOffset)) throw new SymbolNotFoundError("Symbol not found: glPolygonOffset");
        try { Handles.MH_glPolygonOffset.invokeExact(handles.PFN_glPolygonOffset, factor, units); }
        catch (Throwable e) { throw new RuntimeException("error in PolygonOffset", e); }
    }

    /// ```
    /// void glCopyTexImage1D((unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLint border);
    /// ```
    public void CopyTexImage1D(int target, int level, int internalformat, int x, int y, int width, int border) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyTexImage1D)) throw new SymbolNotFoundError("Symbol not found: glCopyTexImage1D");
        try { Handles.MH_glCopyTexImage1D.invokeExact(handles.PFN_glCopyTexImage1D, target, level, internalformat, x, y, width, border); }
        catch (Throwable e) { throw new RuntimeException("error in CopyTexImage1D", e); }
    }

    /// ```
    /// void glCopyTexImage2D((unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLsizei height, (int) GLint border);
    /// ```
    public void CopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyTexImage2D)) throw new SymbolNotFoundError("Symbol not found: glCopyTexImage2D");
        try { Handles.MH_glCopyTexImage2D.invokeExact(handles.PFN_glCopyTexImage2D, target, level, internalformat, x, y, width, height, border); }
        catch (Throwable e) { throw new RuntimeException("error in CopyTexImage2D", e); }
    }

    /// ```
    /// void glCopyTexSubImage1D((unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint x, (int) GLint y, (int) GLsizei width);
    /// ```
    public void CopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyTexSubImage1D)) throw new SymbolNotFoundError("Symbol not found: glCopyTexSubImage1D");
        try { Handles.MH_glCopyTexSubImage1D.invokeExact(handles.PFN_glCopyTexSubImage1D, target, level, xoffset, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in CopyTexSubImage1D", e); }
    }

    /// ```
    /// void glCopyTexSubImage2D((unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void CopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyTexSubImage2D)) throw new SymbolNotFoundError("Symbol not found: glCopyTexSubImage2D");
        try { Handles.MH_glCopyTexSubImage2D.invokeExact(handles.PFN_glCopyTexSubImage2D, target, level, xoffset, yoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in CopyTexSubImage2D", e); }
    }

    /// ```
    /// void glTexSubImage1D((unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLsizei width, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void TexSubImage1D(int target, int level, int xoffset, int width, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexSubImage1D)) throw new SymbolNotFoundError("Symbol not found: glTexSubImage1D");
        try { Handles.MH_glTexSubImage1D.invokeExact(handles.PFN_glTexSubImage1D, target, level, xoffset, width, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TexSubImage1D", e); }
    }

    /// ```
    /// void glTexSubImage2D((unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLsizei width, (int) GLsizei height, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void TexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexSubImage2D)) throw new SymbolNotFoundError("Symbol not found: glTexSubImage2D");
        try { Handles.MH_glTexSubImage2D.invokeExact(handles.PFN_glTexSubImage2D, target, level, xoffset, yoffset, width, height, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TexSubImage2D", e); }
    }

    /// ```
    /// void glBindTexture((unsigned int) GLenum target, (unsigned int) GLuint texture);
    /// ```
    public void BindTexture(int target, int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindTexture)) throw new SymbolNotFoundError("Symbol not found: glBindTexture");
        try { Handles.MH_glBindTexture.invokeExact(handles.PFN_glBindTexture, target, texture); }
        catch (Throwable e) { throw new RuntimeException("error in BindTexture", e); }
    }

    /// ```
    /// void glDeleteTextures((int) GLsizei n, const GLuint* textures);
    /// ```
    public void DeleteTextures(int n, MemorySegment textures) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteTextures)) throw new SymbolNotFoundError("Symbol not found: glDeleteTextures");
        try { Handles.MH_glDeleteTextures.invokeExact(handles.PFN_glDeleteTextures, n, textures); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteTextures", e); }
    }

    /// ```
    /// void glGenTextures((int) GLsizei n, GLuint* textures);
    /// ```
    public void GenTextures(int n, MemorySegment textures) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenTextures)) throw new SymbolNotFoundError("Symbol not found: glGenTextures");
        try { Handles.MH_glGenTextures.invokeExact(handles.PFN_glGenTextures, n, textures); }
        catch (Throwable e) { throw new RuntimeException("error in GenTextures", e); }
    }

    /// ```
    /// GLboolean glIsTexture((unsigned int) GLuint texture);
    /// ```
    public boolean IsTexture(int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsTexture)) throw new SymbolNotFoundError("Symbol not found: glIsTexture");
        try { return (((byte) Handles.MH_glIsTexture.invokeExact(handles.PFN_glIsTexture, texture)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsTexture", e); }
    }

}
