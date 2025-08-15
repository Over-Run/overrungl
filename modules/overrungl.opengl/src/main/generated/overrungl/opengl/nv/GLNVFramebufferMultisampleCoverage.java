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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_framebuffer_multisample_coverage`
public final class GLNVFramebufferMultisampleCoverage {
    public static final int GL_RENDERBUFFER_COVERAGE_SAMPLES_NV = 0x8CAB;
    public static final int GL_RENDERBUFFER_COLOR_SAMPLES_NV = 0x8E10;
    public static final int GL_MAX_MULTISAMPLE_COVERAGE_MODES_NV = 0x8E11;
    public static final int GL_MULTISAMPLE_COVERAGE_MODES_NV = 0x8E12;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glRenderbufferStorageMultisampleCoverageNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glRenderbufferStorageMultisampleCoverageNV;
        private Handles(GLLoadFunc func) {
            PFN_glRenderbufferStorageMultisampleCoverageNV = func.invoke("glRenderbufferStorageMultisampleCoverageNV");
        }
    }

    public GLNVFramebufferMultisampleCoverage(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glRenderbufferStorageMultisampleCoverageNV`.
    /// ```
    /// void glRenderbufferStorageMultisampleCoverageNV((unsigned int) GLenum target, (int) GLsizei coverageSamples, (int) GLsizei colorSamples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void RenderbufferStorageMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRenderbufferStorageMultisampleCoverageNV)) throw new GLSymbolNotFoundError("Symbol not found: glRenderbufferStorageMultisampleCoverageNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRenderbufferStorageMultisampleCoverageNV", target, coverageSamples, colorSamples, internalformat, width, height); }
        Handles.MH_glRenderbufferStorageMultisampleCoverageNV.invokeExact(handles.PFN_glRenderbufferStorageMultisampleCoverageNV, target, coverageSamples, colorSamples, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in RenderbufferStorageMultisampleCoverageNV", e); }
    }

}
