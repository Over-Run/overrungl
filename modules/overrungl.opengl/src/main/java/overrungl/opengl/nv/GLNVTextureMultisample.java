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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVTextureMultisample {
    public static final int GL_TEXTURE_COVERAGE_SAMPLES_NV = 0x9045;
    public static final int GL_TEXTURE_COLOR_SAMPLES_NV = 0x9046;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glTexImage2DMultisampleCoverageNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glTexImage3DMultisampleCoverageNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glTextureImage2DMultisampleNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glTextureImage3DMultisampleNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glTextureImage2DMultisampleCoverageNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glTextureImage3DMultisampleCoverageNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
    }
    public static final class Handles {
        public static final MethodHandle MH_glTexImage2DMultisampleCoverageNV = RuntimeHelper.downcall(Descriptors.FD_glTexImage2DMultisampleCoverageNV);
        public static final MethodHandle MH_glTexImage3DMultisampleCoverageNV = RuntimeHelper.downcall(Descriptors.FD_glTexImage3DMultisampleCoverageNV);
        public static final MethodHandle MH_glTextureImage2DMultisampleNV = RuntimeHelper.downcall(Descriptors.FD_glTextureImage2DMultisampleNV);
        public static final MethodHandle MH_glTextureImage3DMultisampleNV = RuntimeHelper.downcall(Descriptors.FD_glTextureImage3DMultisampleNV);
        public static final MethodHandle MH_glTextureImage2DMultisampleCoverageNV = RuntimeHelper.downcall(Descriptors.FD_glTextureImage2DMultisampleCoverageNV);
        public static final MethodHandle MH_glTextureImage3DMultisampleCoverageNV = RuntimeHelper.downcall(Descriptors.FD_glTextureImage3DMultisampleCoverageNV);
        public final MemorySegment PFN_glTexImage2DMultisampleCoverageNV;
        public final MemorySegment PFN_glTexImage3DMultisampleCoverageNV;
        public final MemorySegment PFN_glTextureImage2DMultisampleNV;
        public final MemorySegment PFN_glTextureImage3DMultisampleNV;
        public final MemorySegment PFN_glTextureImage2DMultisampleCoverageNV;
        public final MemorySegment PFN_glTextureImage3DMultisampleCoverageNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTexImage2DMultisampleCoverageNV = func.invoke("glTexImage2DMultisampleCoverageNV");
            PFN_glTexImage3DMultisampleCoverageNV = func.invoke("glTexImage3DMultisampleCoverageNV");PFN_glTextureImage2DMultisampleNV = func.invoke("glTextureImage2DMultisampleNV");
            PFN_glTextureImage3DMultisampleNV = func.invoke("glTextureImage3DMultisampleNV");
            PFN_glTextureImage2DMultisampleCoverageNV = func.invoke("glTextureImage2DMultisampleCoverageNV");
            PFN_glTextureImage3DMultisampleCoverageNV = func.invoke("glTextureImage3DMultisampleCoverageNV");
        }
    }

    public GLNVTextureMultisample(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void TexImage2DMultisampleCoverageNV(@CType("GLenum") int target, @CType("GLsizei") int coverageSamples, @CType("GLsizei") int colorSamples, @CType("GLint") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLboolean") boolean fixedSampleLocations) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexImage2DMultisampleCoverageNV)) throw new SymbolNotFoundError("Symbol not found: glTexImage2DMultisampleCoverageNV");
        try { Handles.MH_glTexImage2DMultisampleCoverageNV.invokeExact(handles.PFN_glTexImage2DMultisampleCoverageNV, target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations); }
        catch (Throwable e) { throw new RuntimeException("error in glTexImage2DMultisampleCoverageNV", e); }
    }

    public void TexImage3DMultisampleCoverageNV(@CType("GLenum") int target, @CType("GLsizei") int coverageSamples, @CType("GLsizei") int colorSamples, @CType("GLint") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean fixedSampleLocations) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexImage3DMultisampleCoverageNV)) throw new SymbolNotFoundError("Symbol not found: glTexImage3DMultisampleCoverageNV");
        try { Handles.MH_glTexImage3DMultisampleCoverageNV.invokeExact(handles.PFN_glTexImage3DMultisampleCoverageNV, target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations); }
        catch (Throwable e) { throw new RuntimeException("error in glTexImage3DMultisampleCoverageNV", e); }
    }

    public void TextureImage2DMultisampleNV(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLint") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLboolean") boolean fixedSampleLocations) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureImage2DMultisampleNV)) throw new SymbolNotFoundError("Symbol not found: glTextureImage2DMultisampleNV");
        try { Handles.MH_glTextureImage2DMultisampleNV.invokeExact(handles.PFN_glTextureImage2DMultisampleNV, texture, target, samples, internalFormat, width, height, fixedSampleLocations); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureImage2DMultisampleNV", e); }
    }

    public void TextureImage3DMultisampleNV(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLint") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean fixedSampleLocations) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureImage3DMultisampleNV)) throw new SymbolNotFoundError("Symbol not found: glTextureImage3DMultisampleNV");
        try { Handles.MH_glTextureImage3DMultisampleNV.invokeExact(handles.PFN_glTextureImage3DMultisampleNV, texture, target, samples, internalFormat, width, height, depth, fixedSampleLocations); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureImage3DMultisampleNV", e); }
    }

    public void TextureImage2DMultisampleCoverageNV(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int coverageSamples, @CType("GLsizei") int colorSamples, @CType("GLint") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLboolean") boolean fixedSampleLocations) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureImage2DMultisampleCoverageNV)) throw new SymbolNotFoundError("Symbol not found: glTextureImage2DMultisampleCoverageNV");
        try { Handles.MH_glTextureImage2DMultisampleCoverageNV.invokeExact(handles.PFN_glTextureImage2DMultisampleCoverageNV, texture, target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureImage2DMultisampleCoverageNV", e); }
    }

    public void TextureImage3DMultisampleCoverageNV(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int coverageSamples, @CType("GLsizei") int colorSamples, @CType("GLint") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean fixedSampleLocations) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureImage3DMultisampleCoverageNV)) throw new SymbolNotFoundError("Symbol not found: glTextureImage3DMultisampleCoverageNV");
        try { Handles.MH_glTextureImage3DMultisampleCoverageNV.invokeExact(handles.PFN_glTextureImage3DMultisampleCoverageNV, texture, target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureImage3DMultisampleCoverageNV", e); }
    }

}
