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
import java.util.*;
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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glRenderbufferStorageMultisampleAdvancedAMD = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedRenderbufferStorageMultisampleAdvancedAMD = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glRenderbufferStorageMultisampleAdvancedAMD,
            FD_glNamedRenderbufferStorageMultisampleAdvancedAMD
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glRenderbufferStorageMultisampleAdvancedAMD = RuntimeHelper.downcall(Descriptors.FD_glRenderbufferStorageMultisampleAdvancedAMD);
        public static final MethodHandle MH_glNamedRenderbufferStorageMultisampleAdvancedAMD = RuntimeHelper.downcall(Descriptors.FD_glNamedRenderbufferStorageMultisampleAdvancedAMD);
        public final MemorySegment PFN_glRenderbufferStorageMultisampleAdvancedAMD;
        public final MemorySegment PFN_glNamedRenderbufferStorageMultisampleAdvancedAMD;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glRenderbufferStorageMultisampleAdvancedAMD = func.invoke("glRenderbufferStorageMultisampleAdvancedAMD");
            PFN_glNamedRenderbufferStorageMultisampleAdvancedAMD = func.invoke("glNamedRenderbufferStorageMultisampleAdvancedAMD");
        }
    }

    public GLAMDFramebufferMultisampleAdvanced(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void RenderbufferStorageMultisampleAdvancedAMD(@CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLsizei") int storageSamples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glRenderbufferStorageMultisampleAdvancedAMD)) throw new SymbolNotFoundError("Symbol not found: glRenderbufferStorageMultisampleAdvancedAMD");
        try { Handles.MH_glRenderbufferStorageMultisampleAdvancedAMD.invokeExact(handles.PFN_glRenderbufferStorageMultisampleAdvancedAMD, target, samples, storageSamples, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glRenderbufferStorageMultisampleAdvancedAMD", e); }
    }

    public void NamedRenderbufferStorageMultisampleAdvancedAMD(@CType("GLuint") int renderbuffer, @CType("GLsizei") int samples, @CType("GLsizei") int storageSamples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedRenderbufferStorageMultisampleAdvancedAMD)) throw new SymbolNotFoundError("Symbol not found: glNamedRenderbufferStorageMultisampleAdvancedAMD");
        try { Handles.MH_glNamedRenderbufferStorageMultisampleAdvancedAMD.invokeExact(handles.PFN_glNamedRenderbufferStorageMultisampleAdvancedAMD, renderbuffer, samples, storageSamples, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedRenderbufferStorageMultisampleAdvancedAMD", e); }
    }

}
