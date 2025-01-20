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

public class GL13 extends GL12 {
    public static final int GL_TEXTURE0 = 0x84C0;
    public static final int GL_TEXTURE1 = 0x84C1;
    public static final int GL_TEXTURE2 = 0x84C2;
    public static final int GL_TEXTURE3 = 0x84C3;
    public static final int GL_TEXTURE4 = 0x84C4;
    public static final int GL_TEXTURE5 = 0x84C5;
    public static final int GL_TEXTURE6 = 0x84C6;
    public static final int GL_TEXTURE7 = 0x84C7;
    public static final int GL_TEXTURE8 = 0x84C8;
    public static final int GL_TEXTURE9 = 0x84C9;
    public static final int GL_TEXTURE10 = 0x84CA;
    public static final int GL_TEXTURE11 = 0x84CB;
    public static final int GL_TEXTURE12 = 0x84CC;
    public static final int GL_TEXTURE13 = 0x84CD;
    public static final int GL_TEXTURE14 = 0x84CE;
    public static final int GL_TEXTURE15 = 0x84CF;
    public static final int GL_TEXTURE16 = 0x84D0;
    public static final int GL_TEXTURE17 = 0x84D1;
    public static final int GL_TEXTURE18 = 0x84D2;
    public static final int GL_TEXTURE19 = 0x84D3;
    public static final int GL_TEXTURE20 = 0x84D4;
    public static final int GL_TEXTURE21 = 0x84D5;
    public static final int GL_TEXTURE22 = 0x84D6;
    public static final int GL_TEXTURE23 = 0x84D7;
    public static final int GL_TEXTURE24 = 0x84D8;
    public static final int GL_TEXTURE25 = 0x84D9;
    public static final int GL_TEXTURE26 = 0x84DA;
    public static final int GL_TEXTURE27 = 0x84DB;
    public static final int GL_TEXTURE28 = 0x84DC;
    public static final int GL_TEXTURE29 = 0x84DD;
    public static final int GL_TEXTURE30 = 0x84DE;
    public static final int GL_TEXTURE31 = 0x84DF;
    public static final int GL_ACTIVE_TEXTURE = 0x84E0;
    public static final int GL_MULTISAMPLE = 0x809D;
    public static final int GL_SAMPLE_ALPHA_TO_COVERAGE = 0x809E;
    public static final int GL_SAMPLE_ALPHA_TO_ONE = 0x809F;
    public static final int GL_SAMPLE_COVERAGE = 0x80A0;
    public static final int GL_SAMPLE_BUFFERS = 0x80A8;
    public static final int GL_SAMPLES = 0x80A9;
    public static final int GL_SAMPLE_COVERAGE_VALUE = 0x80AA;
    public static final int GL_SAMPLE_COVERAGE_INVERT = 0x80AB;
    public static final int GL_TEXTURE_CUBE_MAP = 0x8513;
    public static final int GL_TEXTURE_BINDING_CUBE_MAP = 0x8514;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A;
    public static final int GL_PROXY_TEXTURE_CUBE_MAP = 0x851B;
    public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;
    public static final int GL_COMPRESSED_RGB = 0x84ED;
    public static final int GL_COMPRESSED_RGBA = 0x84EE;
    public static final int GL_TEXTURE_COMPRESSION_HINT = 0x84EF;
    public static final int GL_TEXTURE_COMPRESSED_IMAGE_SIZE = 0x86A0;
    public static final int GL_TEXTURE_COMPRESSED = 0x86A1;
    public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = 0x86A2;
    public static final int GL_COMPRESSED_TEXTURE_FORMATS = 0x86A3;
    public static final int GL_CLAMP_TO_BORDER = 0x812D;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glActiveTexture = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glSampleCoverage = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glCompressedTexImage3D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTexImage2D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTexImage1D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTexSubImage3D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTexSubImage2D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTexSubImage1D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetCompressedTexImage = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glActiveTexture = RuntimeHelper.downcall(Descriptors.FD_glActiveTexture);
        public static final MethodHandle MH_glSampleCoverage = RuntimeHelper.downcall(Descriptors.FD_glSampleCoverage);
        public static final MethodHandle MH_glCompressedTexImage3D = RuntimeHelper.downcall(Descriptors.FD_glCompressedTexImage3D);
        public static final MethodHandle MH_glCompressedTexImage2D = RuntimeHelper.downcall(Descriptors.FD_glCompressedTexImage2D);
        public static final MethodHandle MH_glCompressedTexImage1D = RuntimeHelper.downcall(Descriptors.FD_glCompressedTexImage1D);
        public static final MethodHandle MH_glCompressedTexSubImage3D = RuntimeHelper.downcall(Descriptors.FD_glCompressedTexSubImage3D);
        public static final MethodHandle MH_glCompressedTexSubImage2D = RuntimeHelper.downcall(Descriptors.FD_glCompressedTexSubImage2D);
        public static final MethodHandle MH_glCompressedTexSubImage1D = RuntimeHelper.downcall(Descriptors.FD_glCompressedTexSubImage1D);
        public static final MethodHandle MH_glGetCompressedTexImage = RuntimeHelper.downcall(Descriptors.FD_glGetCompressedTexImage);
        public final MemorySegment PFN_glActiveTexture;
        public final MemorySegment PFN_glSampleCoverage;
        public final MemorySegment PFN_glCompressedTexImage3D;
        public final MemorySegment PFN_glCompressedTexImage2D;
        public final MemorySegment PFN_glCompressedTexImage1D;
        public final MemorySegment PFN_glCompressedTexSubImage3D;
        public final MemorySegment PFN_glCompressedTexSubImage2D;
        public final MemorySegment PFN_glCompressedTexSubImage1D;
        public final MemorySegment PFN_glGetCompressedTexImage;
        private Handles(GLLoadFunc func) {
            PFN_glActiveTexture = func.invoke("glActiveTexture", "glActiveTextureARB");
            PFN_glSampleCoverage = func.invoke("glSampleCoverage", "glSampleCoverageARB");
            PFN_glCompressedTexImage3D = func.invoke("glCompressedTexImage3D", "glCompressedTexImage3DARB");
            PFN_glCompressedTexImage2D = func.invoke("glCompressedTexImage2D", "glCompressedTexImage2DARB");
            PFN_glCompressedTexImage1D = func.invoke("glCompressedTexImage1D", "glCompressedTexImage1DARB");
            PFN_glCompressedTexSubImage3D = func.invoke("glCompressedTexSubImage3D", "glCompressedTexSubImage3DARB");
            PFN_glCompressedTexSubImage2D = func.invoke("glCompressedTexSubImage2D", "glCompressedTexSubImage2DARB");
            PFN_glCompressedTexSubImage1D = func.invoke("glCompressedTexSubImage1D", "glCompressedTexSubImage1DARB");
            PFN_glGetCompressedTexImage = func.invoke("glGetCompressedTexImage", "glGetCompressedTexImageARB");
        }
    }

    public GL13(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    public void ActiveTexture(@CType("GLenum") int texture) {
        if (Unmarshal.isNullPointer(handles.PFN_glActiveTexture)) throw new SymbolNotFoundError("Symbol not found: glActiveTexture");
        try { Handles.MH_glActiveTexture.invokeExact(handles.PFN_glActiveTexture, texture); }
        catch (Throwable e) { throw new RuntimeException("error in glActiveTexture", e); }
    }

    public void SampleCoverage(@CType("GLfloat") float value, @CType("GLboolean") boolean invert) {
        if (Unmarshal.isNullPointer(handles.PFN_glSampleCoverage)) throw new SymbolNotFoundError("Symbol not found: glSampleCoverage");
        try { Handles.MH_glSampleCoverage.invokeExact(handles.PFN_glSampleCoverage, value, invert); }
        catch (Throwable e) { throw new RuntimeException("error in glSampleCoverage", e); }
    }

    public void CompressedTexImage3D(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLint") int border, @CType("GLsizei") int imageSize, @CType("const void *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTexImage3D)) throw new SymbolNotFoundError("Symbol not found: glCompressedTexImage3D");
        try { Handles.MH_glCompressedTexImage3D.invokeExact(handles.PFN_glCompressedTexImage3D, target, level, internalformat, width, height, depth, border, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTexImage3D", e); }
    }

    public void CompressedTexImage2D(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLint") int border, @CType("GLsizei") int imageSize, @CType("const void *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTexImage2D)) throw new SymbolNotFoundError("Symbol not found: glCompressedTexImage2D");
        try { Handles.MH_glCompressedTexImage2D.invokeExact(handles.PFN_glCompressedTexImage2D, target, level, internalformat, width, height, border, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTexImage2D", e); }
    }

    public void CompressedTexImage1D(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLint") int border, @CType("GLsizei") int imageSize, @CType("const void *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTexImage1D)) throw new SymbolNotFoundError("Symbol not found: glCompressedTexImage1D");
        try { Handles.MH_glCompressedTexImage1D.invokeExact(handles.PFN_glCompressedTexImage1D, target, level, internalformat, width, border, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTexImage1D", e); }
    }

    public void CompressedTexSubImage3D(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTexSubImage3D)) throw new SymbolNotFoundError("Symbol not found: glCompressedTexSubImage3D");
        try { Handles.MH_glCompressedTexSubImage3D.invokeExact(handles.PFN_glCompressedTexSubImage3D, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTexSubImage3D", e); }
    }

    public void CompressedTexSubImage2D(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTexSubImage2D)) throw new SymbolNotFoundError("Symbol not found: glCompressedTexSubImage2D");
        try { Handles.MH_glCompressedTexSubImage2D.invokeExact(handles.PFN_glCompressedTexSubImage2D, target, level, xoffset, yoffset, width, height, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTexSubImage2D", e); }
    }

    public void CompressedTexSubImage1D(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTexSubImage1D)) throw new SymbolNotFoundError("Symbol not found: glCompressedTexSubImage1D");
        try { Handles.MH_glCompressedTexSubImage1D.invokeExact(handles.PFN_glCompressedTexSubImage1D, target, level, xoffset, width, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTexSubImage1D", e); }
    }

    public void GetCompressedTexImage(@CType("GLenum") int target, @CType("GLint") int level, @CType("void*") MemorySegment img) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetCompressedTexImage)) throw new SymbolNotFoundError("Symbol not found: glGetCompressedTexImage");
        try { Handles.MH_glGetCompressedTexImage.invokeExact(handles.PFN_glGetCompressedTexImage, target, level, img); }
        catch (Throwable e) { throw new RuntimeException("error in glGetCompressedTexImage", e); }
    }

}
