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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_explicit_multisample}
 */
public interface GLNVExplicitMultisample {
    int GL_SAMPLE_POSITION_NV = 0x8E50;
    int GL_SAMPLE_MASK_NV = 0x8E51;
    int GL_SAMPLE_MASK_VALUE_NV = 0x8E52;
    int GL_TEXTURE_BINDING_RENDERBUFFER_NV = 0x8E53;
    int GL_TEXTURE_RENDERBUFFER_DATA_STORE_BINDING_NV = 0x8E54;
    int GL_TEXTURE_RENDERBUFFER_NV = 0x8E55;
    int GL_SAMPLER_RENDERBUFFER_NV = 0x8E56;
    int GL_INT_SAMPLER_RENDERBUFFER_NV = 0x8E57;
    int GL_UNSIGNED_INT_SAMPLER_RENDERBUFFER_NV = 0x8E58;
    int GL_MAX_SAMPLE_MASK_WORDS_NV = 0x8E59;

    void glGetMultisamplefvNV(int pname, int index, @NativeType("GLfloat *") MemorySegment val);
    void glSampleMaskIndexedNV(int index, int mask);
    void glTexRenderbufferNV(int target, int renderbuffer);
}
