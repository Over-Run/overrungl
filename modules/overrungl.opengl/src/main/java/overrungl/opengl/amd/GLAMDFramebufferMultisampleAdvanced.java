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
package overrungl.opengl.amd;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAMDFramebufferMultisampleAdvanced {
    public static final int GL_RENDERBUFFER_STORAGE_SAMPLES_AMD = 0x91B2;
    public static final int GL_MAX_COLOR_FRAMEBUFFER_SAMPLES_AMD = 0x91B3;
    public static final int GL_MAX_COLOR_FRAMEBUFFER_STORAGE_SAMPLES_AMD = 0x91B4;
    public static final int GL_MAX_DEPTH_STENCIL_FRAMEBUFFER_SAMPLES_AMD = 0x91B5;
    public static final int GL_NUM_SUPPORTED_MULTISAMPLE_MODES_AMD = 0x91B6;
    public static final int GL_SUPPORTED_MULTISAMPLE_MODES_AMD = 0x91B7;
    public static final MethodHandle MH_glRenderbufferStorageMultisampleAdvancedAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glRenderbufferStorageMultisampleAdvancedAMD;
    public static final MethodHandle MH_glNamedRenderbufferStorageMultisampleAdvancedAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedRenderbufferStorageMultisampleAdvancedAMD;

    public GLAMDFramebufferMultisampleAdvanced(overrungl.opengl.GLLoadFunc func) {
        PFN_glRenderbufferStorageMultisampleAdvancedAMD = func.invoke("glRenderbufferStorageMultisampleAdvancedAMD");
        PFN_glNamedRenderbufferStorageMultisampleAdvancedAMD = func.invoke("glNamedRenderbufferStorageMultisampleAdvancedAMD");
    }

    public void RenderbufferStorageMultisampleAdvancedAMD(@CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLsizei") int storageSamples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (!Unmarshal.isNullPointer(PFN_glRenderbufferStorageMultisampleAdvancedAMD)) { try {
            MH_glRenderbufferStorageMultisampleAdvancedAMD.invokeExact(PFN_glRenderbufferStorageMultisampleAdvancedAMD, target, samples, storageSamples, internalformat, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glRenderbufferStorageMultisampleAdvancedAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glRenderbufferStorageMultisampleAdvancedAMD"); }
    }

    public void NamedRenderbufferStorageMultisampleAdvancedAMD(@CType("GLuint") int renderbuffer, @CType("GLsizei") int samples, @CType("GLsizei") int storageSamples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (!Unmarshal.isNullPointer(PFN_glNamedRenderbufferStorageMultisampleAdvancedAMD)) { try {
            MH_glNamedRenderbufferStorageMultisampleAdvancedAMD.invokeExact(PFN_glNamedRenderbufferStorageMultisampleAdvancedAMD, renderbuffer, samples, storageSamples, internalformat, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glNamedRenderbufferStorageMultisampleAdvancedAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNamedRenderbufferStorageMultisampleAdvancedAMD"); }
    }

}
