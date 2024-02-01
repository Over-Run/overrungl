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
package overrungl.opengl.ext.amd;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_AMD_framebuffer_multisample_advanced}
 */
public interface GLAMDFramebufferMultisampleAdvanced {
    int GL_RENDERBUFFER_STORAGE_SAMPLES_AMD = 0x91B2;
    int GL_MAX_COLOR_FRAMEBUFFER_SAMPLES_AMD = 0x91B3;
    int GL_MAX_COLOR_FRAMEBUFFER_STORAGE_SAMPLES_AMD = 0x91B4;
    int GL_MAX_DEPTH_STENCIL_FRAMEBUFFER_SAMPLES_AMD = 0x91B5;
    int GL_NUM_SUPPORTED_MULTISAMPLE_MODES_AMD = 0x91B6;
    int GL_SUPPORTED_MULTISAMPLE_MODES_AMD = 0x91B7;

    default void glRenderbufferStorageMultisampleAdvancedAMD(int target, int samples, int storageSamples, int internalformat, int width, int height) {
        throw new ContextException();
    }

    default void glNamedRenderbufferStorageMultisampleAdvancedAMD(int renderbuffer, int samples, int storageSamples, int internalformat, int width, int height) {
        throw new ContextException();
    }

}
