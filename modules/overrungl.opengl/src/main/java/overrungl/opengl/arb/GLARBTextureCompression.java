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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glCompressedTexImage3DARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTexImage2DARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTexImage1DARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTexSubImage3DARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTexSubImage2DARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTexSubImage1DARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetCompressedTexImageARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glCompressedTexImage3DARB,
            FD_glCompressedTexImage2DARB,
            FD_glCompressedTexImage1DARB,
            FD_glCompressedTexSubImage3DARB,
            FD_glCompressedTexSubImage2DARB,
            FD_glCompressedTexSubImage1DARB,
            FD_glGetCompressedTexImageARB
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glCompressedTexImage3DARB = RuntimeHelper.downcall(Descriptors.FD_glCompressedTexImage3DARB);
        public static final MethodHandle MH_glCompressedTexImage2DARB = RuntimeHelper.downcall(Descriptors.FD_glCompressedTexImage2DARB);
        public static final MethodHandle MH_glCompressedTexImage1DARB = RuntimeHelper.downcall(Descriptors.FD_glCompressedTexImage1DARB);
        public static final MethodHandle MH_glCompressedTexSubImage3DARB = RuntimeHelper.downcall(Descriptors.FD_glCompressedTexSubImage3DARB);
        public static final MethodHandle MH_glCompressedTexSubImage2DARB = RuntimeHelper.downcall(Descriptors.FD_glCompressedTexSubImage2DARB);
        public static final MethodHandle MH_glCompressedTexSubImage1DARB = RuntimeHelper.downcall(Descriptors.FD_glCompressedTexSubImage1DARB);
        public static final MethodHandle MH_glGetCompressedTexImageARB = RuntimeHelper.downcall(Descriptors.FD_glGetCompressedTexImageARB);
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

    public void CompressedTexImage3DARB(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLint") int border, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTexImage3DARB)) throw new SymbolNotFoundError("Symbol not found: glCompressedTexImage3DARB");
        try { Handles.MH_glCompressedTexImage3DARB.invokeExact(handles.PFN_glCompressedTexImage3DARB, target, level, internalformat, width, height, depth, border, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTexImage3DARB", e); }
    }

    public void CompressedTexImage2DARB(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLint") int border, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTexImage2DARB)) throw new SymbolNotFoundError("Symbol not found: glCompressedTexImage2DARB");
        try { Handles.MH_glCompressedTexImage2DARB.invokeExact(handles.PFN_glCompressedTexImage2DARB, target, level, internalformat, width, height, border, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTexImage2DARB", e); }
    }

    public void CompressedTexImage1DARB(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLint") int border, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTexImage1DARB)) throw new SymbolNotFoundError("Symbol not found: glCompressedTexImage1DARB");
        try { Handles.MH_glCompressedTexImage1DARB.invokeExact(handles.PFN_glCompressedTexImage1DARB, target, level, internalformat, width, border, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTexImage1DARB", e); }
    }

    public void CompressedTexSubImage3DARB(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTexSubImage3DARB)) throw new SymbolNotFoundError("Symbol not found: glCompressedTexSubImage3DARB");
        try { Handles.MH_glCompressedTexSubImage3DARB.invokeExact(handles.PFN_glCompressedTexSubImage3DARB, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTexSubImage3DARB", e); }
    }

    public void CompressedTexSubImage2DARB(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTexSubImage2DARB)) throw new SymbolNotFoundError("Symbol not found: glCompressedTexSubImage2DARB");
        try { Handles.MH_glCompressedTexSubImage2DARB.invokeExact(handles.PFN_glCompressedTexSubImage2DARB, target, level, xoffset, yoffset, width, height, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTexSubImage2DARB", e); }
    }

    public void CompressedTexSubImage1DARB(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTexSubImage1DARB)) throw new SymbolNotFoundError("Symbol not found: glCompressedTexSubImage1DARB");
        try { Handles.MH_glCompressedTexSubImage1DARB.invokeExact(handles.PFN_glCompressedTexSubImage1DARB, target, level, xoffset, width, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTexSubImage1DARB", e); }
    }

    public void GetCompressedTexImageARB(@CType("GLenum") int target, @CType("GLint") int level, @CType("void*") java.lang.foreign.MemorySegment img) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetCompressedTexImageARB)) throw new SymbolNotFoundError("Symbol not found: glGetCompressedTexImageARB");
        try { Handles.MH_glGetCompressedTexImageARB.invokeExact(handles.PFN_glGetCompressedTexImageARB, target, level, img); }
        catch (Throwable e) { throw new RuntimeException("error in glGetCompressedTexImageARB", e); }
    }

}
