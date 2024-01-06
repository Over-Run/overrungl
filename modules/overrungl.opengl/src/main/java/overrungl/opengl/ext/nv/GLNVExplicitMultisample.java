/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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
package overrungl.opengl.ext.nv;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NV_explicit_multisample}
 */
public final class GLNVExplicitMultisample {
    public static final int GL_SAMPLE_POSITION_NV = 0x8E50;
    public static final int GL_SAMPLE_MASK_NV = 0x8E51;
    public static final int GL_SAMPLE_MASK_VALUE_NV = 0x8E52;
    public static final int GL_TEXTURE_BINDING_RENDERBUFFER_NV = 0x8E53;
    public static final int GL_TEXTURE_RENDERBUFFER_DATA_STORE_BINDING_NV = 0x8E54;
    public static final int GL_TEXTURE_RENDERBUFFER_NV = 0x8E55;
    public static final int GL_SAMPLER_RENDERBUFFER_NV = 0x8E56;
    public static final int GL_INT_SAMPLER_RENDERBUFFER_NV = 0x8E57;
    public static final int GL_UNSIGNED_INT_SAMPLER_RENDERBUFFER_NV = 0x8E58;
    public static final int GL_MAX_SAMPLE_MASK_WORDS_NV = 0x8E59;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_explicit_multisample) return;
        ext.glGetMultisamplefvNV = load.invoke("glGetMultisamplefvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glSampleMaskIndexedNV = load.invoke("glSampleMaskIndexedNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glTexRenderbufferNV = load.invoke("glTexRenderbufferNV", ofVoid(JAVA_INT, JAVA_INT));
    }

    public static void glGetMultisamplefvNV(int pname, int index, @NativeType("GLfloat *") MemorySegment val) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMultisamplefvNV).invokeExact(pname, index, val);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSampleMaskIndexedNV(int index, int mask) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSampleMaskIndexedNV).invokeExact(index, mask);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexRenderbufferNV(int target, int renderbuffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexRenderbufferNV).invokeExact(target, renderbuffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
