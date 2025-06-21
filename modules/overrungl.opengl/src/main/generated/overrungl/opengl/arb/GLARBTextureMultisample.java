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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBTextureMultisample {
    public static final int GL_SAMPLE_POSITION = 0x8E50;
    public static final int GL_SAMPLE_MASK = 0x8E51;
    public static final int GL_SAMPLE_MASK_VALUE = 0x8E52;
    public static final int GL_MAX_SAMPLE_MASK_WORDS = 0x8E59;
    public static final int GL_TEXTURE_2D_MULTISAMPLE = 0x9100;
    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE = 0x9101;
    public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;
    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9103;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE = 0x9104;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 0x9105;
    public static final int GL_TEXTURE_SAMPLES = 0x9106;
    public static final int GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = 0x9107;
    public static final int GL_SAMPLER_2D_MULTISAMPLE = 0x9108;
    public static final int GL_INT_SAMPLER_2D_MULTISAMPLE = 0x9109;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE = 0x910A;
    public static final int GL_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910B;
    public static final int GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910C;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910D;
    public static final int GL_MAX_COLOR_TEXTURE_SAMPLES = 0x910E;
    public static final int GL_MAX_DEPTH_TEXTURE_SAMPLES = 0x910F;
    public static final int GL_MAX_INTEGER_SAMPLES = 0x9110;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTexImage2DMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTexImage3DMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glGetMultisamplefv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSampleMaski = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glTexImage2DMultisample;
        public final MemorySegment PFN_glTexImage3DMultisample;
        public final MemorySegment PFN_glGetMultisamplefv;
        public final MemorySegment PFN_glSampleMaski;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTexImage2DMultisample = func.invoke("glTexImage2DMultisample");
            PFN_glTexImage3DMultisample = func.invoke("glTexImage3DMultisample");
            PFN_glGetMultisamplefv = func.invoke("glGetMultisamplefv");
            PFN_glSampleMaski = func.invoke("glSampleMaski");
        }
    }

    public GLARBTextureMultisample(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glTexImage2DMultisample((unsigned int) GLenum target, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, GLboolean fixedsamplelocations);
    /// ```
    public void TexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexImage2DMultisample)) throw new GLSymbolNotFoundError("Symbol not found: glTexImage2DMultisample");
        try { Handles.MH_glTexImage2DMultisample.invokeExact(handles.PFN_glTexImage2DMultisample, target, samples, internalformat, width, height, ((fixedsamplelocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TexImage2DMultisample", e); }
    }

    /// ```
    /// void glTexImage3DMultisample((unsigned int) GLenum target, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, GLboolean fixedsamplelocations);
    /// ```
    public void TexImage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexImage3DMultisample)) throw new GLSymbolNotFoundError("Symbol not found: glTexImage3DMultisample");
        try { Handles.MH_glTexImage3DMultisample.invokeExact(handles.PFN_glTexImage3DMultisample, target, samples, internalformat, width, height, depth, ((fixedsamplelocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TexImage3DMultisample", e); }
    }

    /// ```
    /// void glGetMultisamplefv((unsigned int) GLenum pname, (unsigned int) GLuint index, GLfloat* val);
    /// ```
    public void GetMultisamplefv(int pname, int index, MemorySegment val) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMultisamplefv)) throw new GLSymbolNotFoundError("Symbol not found: glGetMultisamplefv");
        try { Handles.MH_glGetMultisamplefv.invokeExact(handles.PFN_glGetMultisamplefv, pname, index, val); }
        catch (Throwable e) { throw new RuntimeException("error in GetMultisamplefv", e); }
    }

    /// ```
    /// void glSampleMaski((unsigned int) GLuint maskNumber, (unsigned int) GLbitfield mask);
    /// ```
    public void SampleMaski(int maskNumber, int mask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSampleMaski)) throw new GLSymbolNotFoundError("Symbol not found: glSampleMaski");
        try { Handles.MH_glSampleMaski.invokeExact(handles.PFN_glSampleMaski, maskNumber, mask); }
        catch (Throwable e) { throw new RuntimeException("error in SampleMaski", e); }
    }

}
