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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final MethodHandle MH_glTexImage2DMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glTexImage2DMultisample;
    public static final MethodHandle MH_glTexImage3DMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glTexImage3DMultisample;
    public static final MethodHandle MH_glGetMultisamplefv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMultisamplefv;
    public static final MethodHandle MH_glSampleMaski = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glSampleMaski;

    public GLARBTextureMultisample(overrungl.opengl.GLLoadFunc func) {
        PFN_glTexImage2DMultisample = func.invoke("glTexImage2DMultisample");
        PFN_glTexImage3DMultisample = func.invoke("glTexImage3DMultisample");
        PFN_glGetMultisamplefv = func.invoke("glGetMultisamplefv");
        PFN_glSampleMaski = func.invoke("glSampleMaski");
    }

    public void TexImage2DMultisample(@CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLboolean") boolean fixedsamplelocations) {
        if (!Unmarshal.isNullPointer(PFN_glTexImage2DMultisample)) { try {
            MH_glTexImage2DMultisample.invokeExact(PFN_glTexImage2DMultisample, target, samples, internalformat, width, height, fixedsamplelocations);
        } catch (Throwable e) { throw new RuntimeException("error in glTexImage2DMultisample", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexImage2DMultisample"); }
    }

    public void TexImage3DMultisample(@CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean fixedsamplelocations) {
        if (!Unmarshal.isNullPointer(PFN_glTexImage3DMultisample)) { try {
            MH_glTexImage3DMultisample.invokeExact(PFN_glTexImage3DMultisample, target, samples, internalformat, width, height, depth, fixedsamplelocations);
        } catch (Throwable e) { throw new RuntimeException("error in glTexImage3DMultisample", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexImage3DMultisample"); }
    }

    public void GetMultisamplefv(@CType("GLenum") int pname, @CType("GLuint") int index, @CType("GLfloat *") java.lang.foreign.MemorySegment val) {
        if (!Unmarshal.isNullPointer(PFN_glGetMultisamplefv)) { try {
            MH_glGetMultisamplefv.invokeExact(PFN_glGetMultisamplefv, pname, index, val);
        } catch (Throwable e) { throw new RuntimeException("error in glGetMultisamplefv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetMultisamplefv"); }
    }

    public void SampleMaski(@CType("GLuint") int maskNumber, @CType("GLbitfield") int mask) {
        if (!Unmarshal.isNullPointer(PFN_glSampleMaski)) { try {
            MH_glSampleMaski.invokeExact(PFN_glSampleMaski, maskNumber, mask);
        } catch (Throwable e) { throw new RuntimeException("error in glSampleMaski", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSampleMaski"); }
    }

}
