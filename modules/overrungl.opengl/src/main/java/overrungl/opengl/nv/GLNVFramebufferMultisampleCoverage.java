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

public final class GLNVFramebufferMultisampleCoverage {
    public static final int GL_RENDERBUFFER_COVERAGE_SAMPLES_NV = 0x8CAB;
    public static final int GL_RENDERBUFFER_COLOR_SAMPLES_NV = 0x8E10;
    public static final int GL_MAX_MULTISAMPLE_COVERAGE_MODES_NV = 0x8E11;
    public static final int GL_MULTISAMPLE_COVERAGE_MODES_NV = 0x8E12;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glRenderbufferStorageMultisampleCoverageNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glRenderbufferStorageMultisampleCoverageNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glRenderbufferStorageMultisampleCoverageNV = func.invoke("glRenderbufferStorageMultisampleCoverageNV");
        }
    }

    public GLNVFramebufferMultisampleCoverage(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void RenderbufferStorageMultisampleCoverageNV(@CType("GLenum") int target, @CType("GLsizei") int coverageSamples, @CType("GLsizei") int colorSamples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glRenderbufferStorageMultisampleCoverageNV)) throw new SymbolNotFoundError("Symbol not found: glRenderbufferStorageMultisampleCoverageNV");
        try { Handles.MH_glRenderbufferStorageMultisampleCoverageNV.invokeExact(handles.PFN_glRenderbufferStorageMultisampleCoverageNV, target, coverageSamples, colorSamples, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glRenderbufferStorageMultisampleCoverageNV", e); }
    }

}
