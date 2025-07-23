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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBTextureCompression {
    public static final int GL_COMPRESSED_ALPHA_ARB = 0x84E9;
    public static final int GL_COMPRESSED_LUMINANCE_ARB = 0x84EA;
    public static final int GL_COMPRESSED_LUMINANCE_ALPHA_ARB = 0x84EB;
    public static final int GL_COMPRESSED_INTENSITY_ARB = 0x84EC;
    public static final int GL_COMPRESSED_RGB_ARB = 0x84ED;
    public static final int GL_COMPRESSED_RGBA_ARB = 0x84EE;
    public static final int GL_TEXTURE_COMPRESSION_HINT_ARB = 0x84EF;
    public static final int GL_TEXTURE_COMPRESSED_IMAGE_SIZE_ARB = 0x86A0;
    public static final int GL_TEXTURE_COMPRESSED_ARB = 0x86A1;
    public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS_ARB = 0x86A2;
    public static final int GL_COMPRESSED_TEXTURE_FORMATS_ARB = 0x86A3;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glCompressedTexImage3DARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTexImage2DARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTexImage1DARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTexSubImage3DARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTexSubImage2DARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTexSubImage1DARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetCompressedTexImageARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glCompressedTexImage3DARB;
        public final MemorySegment PFN_glCompressedTexImage2DARB;
        public final MemorySegment PFN_glCompressedTexImage1DARB;
        public final MemorySegment PFN_glCompressedTexSubImage3DARB;
        public final MemorySegment PFN_glCompressedTexSubImage2DARB;
        public final MemorySegment PFN_glCompressedTexSubImage1DARB;
        public final MemorySegment PFN_glGetCompressedTexImageARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glCompressedTexImage3DARB = func.invoke("glCompressedTexImage3DARB", "glCompressedTexImage3D");
            PFN_glCompressedTexImage2DARB = func.invoke("glCompressedTexImage2DARB", "glCompressedTexImage2D");
            PFN_glCompressedTexImage1DARB = func.invoke("glCompressedTexImage1DARB", "glCompressedTexImage1D");
            PFN_glCompressedTexSubImage3DARB = func.invoke("glCompressedTexSubImage3DARB", "glCompressedTexSubImage3D");
            PFN_glCompressedTexSubImage2DARB = func.invoke("glCompressedTexSubImage2DARB", "glCompressedTexSubImage2D");
            PFN_glCompressedTexSubImage1DARB = func.invoke("glCompressedTexSubImage1DARB", "glCompressedTexSubImage1D");
            PFN_glGetCompressedTexImageARB = func.invoke("glGetCompressedTexImageARB", "glGetCompressedTexImage");
        }
    }

    public GLARBTextureCompression(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glCompressedTexImage3DARB((unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (int) GLint border, (int) GLsizei imageSize, const void* data);
    /// ```
    public void CompressedTexImage3DARB(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTexImage3DARB)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTexImage3DARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompressedTexImage3DARB", target, level, internalformat, width, height, depth, border, imageSize, data); }
        Handles.MH_glCompressedTexImage3DARB.invokeExact(handles.PFN_glCompressedTexImage3DARB, target, level, internalformat, width, height, depth, border, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTexImage3DARB", e); }
    }

    /// ```
    /// void glCompressedTexImage2DARB((unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLint border, (int) GLsizei imageSize, const void* data);
    /// ```
    public void CompressedTexImage2DARB(int target, int level, int internalformat, int width, int height, int border, int imageSize, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTexImage2DARB)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTexImage2DARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompressedTexImage2DARB", target, level, internalformat, width, height, border, imageSize, data); }
        Handles.MH_glCompressedTexImage2DARB.invokeExact(handles.PFN_glCompressedTexImage2DARB, target, level, internalformat, width, height, border, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTexImage2DARB", e); }
    }

    /// ```
    /// void glCompressedTexImage1DARB((unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLint border, (int) GLsizei imageSize, const void* data);
    /// ```
    public void CompressedTexImage1DARB(int target, int level, int internalformat, int width, int border, int imageSize, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTexImage1DARB)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTexImage1DARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompressedTexImage1DARB", target, level, internalformat, width, border, imageSize, data); }
        Handles.MH_glCompressedTexImage1DARB.invokeExact(handles.PFN_glCompressedTexImage1DARB, target, level, internalformat, width, border, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTexImage1DARB", e); }
    }

    /// ```
    /// void glCompressedTexSubImage3DARB((unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (unsigned int) GLenum format, (int) GLsizei imageSize, const void* data);
    /// ```
    public void CompressedTexSubImage3DARB(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTexSubImage3DARB)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTexSubImage3DARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompressedTexSubImage3DARB", target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data); }
        Handles.MH_glCompressedTexSubImage3DARB.invokeExact(handles.PFN_glCompressedTexSubImage3DARB, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTexSubImage3DARB", e); }
    }

    /// ```
    /// void glCompressedTexSubImage2DARB((unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLsizei width, (int) GLsizei height, (unsigned int) GLenum format, (int) GLsizei imageSize, const void* data);
    /// ```
    public void CompressedTexSubImage2DARB(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTexSubImage2DARB)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTexSubImage2DARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompressedTexSubImage2DARB", target, level, xoffset, yoffset, width, height, format, imageSize, data); }
        Handles.MH_glCompressedTexSubImage2DARB.invokeExact(handles.PFN_glCompressedTexSubImage2DARB, target, level, xoffset, yoffset, width, height, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTexSubImage2DARB", e); }
    }

    /// ```
    /// void glCompressedTexSubImage1DARB((unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLsizei width, (unsigned int) GLenum format, (int) GLsizei imageSize, const void* data);
    /// ```
    public void CompressedTexSubImage1DARB(int target, int level, int xoffset, int width, int format, int imageSize, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTexSubImage1DARB)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTexSubImage1DARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompressedTexSubImage1DARB", target, level, xoffset, width, format, imageSize, data); }
        Handles.MH_glCompressedTexSubImage1DARB.invokeExact(handles.PFN_glCompressedTexSubImage1DARB, target, level, xoffset, width, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTexSubImage1DARB", e); }
    }

    /// ```
    /// void glGetCompressedTexImageARB((unsigned int) GLenum target, (int) GLint level, void* img);
    /// ```
    public void GetCompressedTexImageARB(int target, int level, MemorySegment img) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetCompressedTexImageARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetCompressedTexImageARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetCompressedTexImageARB", target, level, img); }
        Handles.MH_glGetCompressedTexImageARB.invokeExact(handles.PFN_glGetCompressedTexImageARB, target, level, img); }
        catch (Throwable e) { throw new RuntimeException("error in GetCompressedTexImageARB", e); }
    }

}
