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

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_AMD_framebuffer_multisample_advanced}
  */
public final class GLAMDFramebufferMultisampleAdvanced {
    public static final int GL_RENDERBUFFER_STORAGE_SAMPLES_AMD = 0x91B2;
    public static final int GL_MAX_COLOR_FRAMEBUFFER_SAMPLES_AMD = 0x91B3;
    public static final int GL_MAX_COLOR_FRAMEBUFFER_STORAGE_SAMPLES_AMD = 0x91B4;
    public static final int GL_MAX_DEPTH_STENCIL_FRAMEBUFFER_SAMPLES_AMD = 0x91B5;
    public static final int GL_NUM_SUPPORTED_MULTISAMPLE_MODES_AMD = 0x91B6;
    public static final int GL_SUPPORTED_MULTISAMPLE_MODES_AMD = 0x91B7;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_framebuffer_multisample_advanced) return;
        ext.glRenderbufferStorageMultisampleAdvancedAMD = load.invoke("glRenderbufferStorageMultisampleAdvancedAMD", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glNamedRenderbufferStorageMultisampleAdvancedAMD = load.invoke("glNamedRenderbufferStorageMultisampleAdvancedAMD", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glRenderbufferStorageMultisampleAdvancedAMD(int target, int samples, int storageSamples, int internalformat, int width, int height) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glRenderbufferStorageMultisampleAdvancedAMD).invokeExact(target, samples, storageSamples, internalformat, width, height);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedRenderbufferStorageMultisampleAdvancedAMD(int renderbuffer, int samples, int storageSamples, int internalformat, int width, int height) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedRenderbufferStorageMultisampleAdvancedAMD).invokeExact(renderbuffer, samples, storageSamples, internalformat, width, height);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
