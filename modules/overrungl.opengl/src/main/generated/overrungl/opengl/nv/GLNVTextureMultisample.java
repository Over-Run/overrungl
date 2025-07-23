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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLNVTextureMultisample {
    public static final int GL_TEXTURE_COVERAGE_SAMPLES_NV = 0x9045;
    public static final int GL_TEXTURE_COLOR_SAMPLES_NV = 0x9046;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTexImage2DMultisampleCoverageNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTexImage3DMultisampleCoverageNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTextureImage2DMultisampleNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTextureImage3DMultisampleNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTextureImage2DMultisampleCoverageNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTextureImage3DMultisampleCoverageNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
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

    /// ```
    /// void glTexImage2DMultisampleCoverageNV((unsigned int) GLenum target, (int) GLsizei coverageSamples, (int) GLsizei colorSamples, (int) GLint internalFormat, (int) GLsizei width, (int) GLsizei height, GLboolean fixedSampleLocations);
    /// ```
    public void TexImage2DMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexImage2DMultisampleCoverageNV)) throw new GLSymbolNotFoundError("Symbol not found: glTexImage2DMultisampleCoverageNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexImage2DMultisampleCoverageNV", target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations); }
        Handles.MH_glTexImage2DMultisampleCoverageNV.invokeExact(handles.PFN_glTexImage2DMultisampleCoverageNV, target, coverageSamples, colorSamples, internalFormat, width, height, ((fixedSampleLocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TexImage2DMultisampleCoverageNV", e); }
    }

    /// ```
    /// void glTexImage3DMultisampleCoverageNV((unsigned int) GLenum target, (int) GLsizei coverageSamples, (int) GLsizei colorSamples, (int) GLint internalFormat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, GLboolean fixedSampleLocations);
    /// ```
    public void TexImage3DMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexImage3DMultisampleCoverageNV)) throw new GLSymbolNotFoundError("Symbol not found: glTexImage3DMultisampleCoverageNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexImage3DMultisampleCoverageNV", target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations); }
        Handles.MH_glTexImage3DMultisampleCoverageNV.invokeExact(handles.PFN_glTexImage3DMultisampleCoverageNV, target, coverageSamples, colorSamples, internalFormat, width, height, depth, ((fixedSampleLocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TexImage3DMultisampleCoverageNV", e); }
    }

    /// ```
    /// void glTextureImage2DMultisampleNV((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLsizei samples, (int) GLint internalFormat, (int) GLsizei width, (int) GLsizei height, GLboolean fixedSampleLocations);
    /// ```
    public void TextureImage2DMultisampleNV(int texture, int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureImage2DMultisampleNV)) throw new GLSymbolNotFoundError("Symbol not found: glTextureImage2DMultisampleNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureImage2DMultisampleNV", texture, target, samples, internalFormat, width, height, fixedSampleLocations); }
        Handles.MH_glTextureImage2DMultisampleNV.invokeExact(handles.PFN_glTextureImage2DMultisampleNV, texture, target, samples, internalFormat, width, height, ((fixedSampleLocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TextureImage2DMultisampleNV", e); }
    }

    /// ```
    /// void glTextureImage3DMultisampleNV((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLsizei samples, (int) GLint internalFormat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, GLboolean fixedSampleLocations);
    /// ```
    public void TextureImage3DMultisampleNV(int texture, int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureImage3DMultisampleNV)) throw new GLSymbolNotFoundError("Symbol not found: glTextureImage3DMultisampleNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureImage3DMultisampleNV", texture, target, samples, internalFormat, width, height, depth, fixedSampleLocations); }
        Handles.MH_glTextureImage3DMultisampleNV.invokeExact(handles.PFN_glTextureImage3DMultisampleNV, texture, target, samples, internalFormat, width, height, depth, ((fixedSampleLocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TextureImage3DMultisampleNV", e); }
    }

    /// ```
    /// void glTextureImage2DMultisampleCoverageNV((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLsizei coverageSamples, (int) GLsizei colorSamples, (int) GLint internalFormat, (int) GLsizei width, (int) GLsizei height, GLboolean fixedSampleLocations);
    /// ```
    public void TextureImage2DMultisampleCoverageNV(int texture, int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureImage2DMultisampleCoverageNV)) throw new GLSymbolNotFoundError("Symbol not found: glTextureImage2DMultisampleCoverageNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureImage2DMultisampleCoverageNV", texture, target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations); }
        Handles.MH_glTextureImage2DMultisampleCoverageNV.invokeExact(handles.PFN_glTextureImage2DMultisampleCoverageNV, texture, target, coverageSamples, colorSamples, internalFormat, width, height, ((fixedSampleLocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TextureImage2DMultisampleCoverageNV", e); }
    }

    /// ```
    /// void glTextureImage3DMultisampleCoverageNV((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLsizei coverageSamples, (int) GLsizei colorSamples, (int) GLint internalFormat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, GLboolean fixedSampleLocations);
    /// ```
    public void TextureImage3DMultisampleCoverageNV(int texture, int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureImage3DMultisampleCoverageNV)) throw new GLSymbolNotFoundError("Symbol not found: glTextureImage3DMultisampleCoverageNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureImage3DMultisampleCoverageNV", texture, target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations); }
        Handles.MH_glTextureImage3DMultisampleCoverageNV.invokeExact(handles.PFN_glTextureImage3DMultisampleCoverageNV, texture, target, coverageSamples, colorSamples, internalFormat, width, height, depth, ((fixedSampleLocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TextureImage3DMultisampleCoverageNV", e); }
    }

}
