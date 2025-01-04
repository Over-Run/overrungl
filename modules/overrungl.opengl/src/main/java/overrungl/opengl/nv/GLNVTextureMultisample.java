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
    public static final MethodHandle MH_glTexImage2DMultisampleCoverageNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glTexImage2DMultisampleCoverageNV;
    public static final MethodHandle MH_glTexImage3DMultisampleCoverageNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glTexImage3DMultisampleCoverageNV;
    public static final MethodHandle MH_glTextureImage2DMultisampleNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glTextureImage2DMultisampleNV;
    public static final MethodHandle MH_glTextureImage3DMultisampleNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glTextureImage3DMultisampleNV;
    public static final MethodHandle MH_glTextureImage2DMultisampleCoverageNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glTextureImage2DMultisampleCoverageNV;
    public static final MethodHandle MH_glTextureImage3DMultisampleCoverageNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glTextureImage3DMultisampleCoverageNV;

    public GLNVTextureMultisample(overrungl.opengl.GLLoadFunc func) {
        PFN_glTexImage2DMultisampleCoverageNV = func.invoke("glTexImage2DMultisampleCoverageNV");
        PFN_glTexImage3DMultisampleCoverageNV = func.invoke("glTexImage3DMultisampleCoverageNV");PFN_glTextureImage2DMultisampleNV = func.invoke("glTextureImage2DMultisampleNV");
        PFN_glTextureImage3DMultisampleNV = func.invoke("glTextureImage3DMultisampleNV");
        PFN_glTextureImage2DMultisampleCoverageNV = func.invoke("glTextureImage2DMultisampleCoverageNV");
        PFN_glTextureImage3DMultisampleCoverageNV = func.invoke("glTextureImage3DMultisampleCoverageNV");
    }

    public void TexImage2DMultisampleCoverageNV(@CType("GLenum") int target, @CType("GLsizei") int coverageSamples, @CType("GLsizei") int colorSamples, @CType("GLint") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLboolean") boolean fixedSampleLocations) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexImage2DMultisampleCoverageNV))
            MH_glTexImage2DMultisampleCoverageNV.invokeExact(PFN_glTexImage2DMultisampleCoverageNV, target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexImage2DMultisampleCoverageNV", e); }
    }

    public void TexImage3DMultisampleCoverageNV(@CType("GLenum") int target, @CType("GLsizei") int coverageSamples, @CType("GLsizei") int colorSamples, @CType("GLint") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean fixedSampleLocations) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexImage3DMultisampleCoverageNV))
            MH_glTexImage3DMultisampleCoverageNV.invokeExact(PFN_glTexImage3DMultisampleCoverageNV, target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexImage3DMultisampleCoverageNV", e); }
    }

    public void TextureImage2DMultisampleNV(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLint") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLboolean") boolean fixedSampleLocations) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureImage2DMultisampleNV))
            MH_glTextureImage2DMultisampleNV.invokeExact(PFN_glTextureImage2DMultisampleNV, texture, target, samples, internalFormat, width, height, fixedSampleLocations);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureImage2DMultisampleNV", e); }
    }

    public void TextureImage3DMultisampleNV(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLint") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean fixedSampleLocations) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureImage3DMultisampleNV))
            MH_glTextureImage3DMultisampleNV.invokeExact(PFN_glTextureImage3DMultisampleNV, texture, target, samples, internalFormat, width, height, depth, fixedSampleLocations);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureImage3DMultisampleNV", e); }
    }

    public void TextureImage2DMultisampleCoverageNV(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int coverageSamples, @CType("GLsizei") int colorSamples, @CType("GLint") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLboolean") boolean fixedSampleLocations) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureImage2DMultisampleCoverageNV))
            MH_glTextureImage2DMultisampleCoverageNV.invokeExact(PFN_glTextureImage2DMultisampleCoverageNV, texture, target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureImage2DMultisampleCoverageNV", e); }
    }

    public void TextureImage3DMultisampleCoverageNV(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int coverageSamples, @CType("GLsizei") int colorSamples, @CType("GLint") int internalFormat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean fixedSampleLocations) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureImage3DMultisampleCoverageNV))
            MH_glTextureImage3DMultisampleCoverageNV.invokeExact(PFN_glTextureImage3DMultisampleCoverageNV, texture, target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureImage3DMultisampleCoverageNV", e); }
    }

}
