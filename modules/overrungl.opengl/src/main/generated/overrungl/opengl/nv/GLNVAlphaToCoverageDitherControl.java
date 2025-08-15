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
/// `GL_NV_alpha_to_coverage_dither_control`
public final class GLNVAlphaToCoverageDitherControl {
    public static final int GL_ALPHA_TO_COVERAGE_DITHER_DEFAULT_NV = 0x934D;
    public static final int GL_ALPHA_TO_COVERAGE_DITHER_ENABLE_NV = 0x934E;
    public static final int GL_ALPHA_TO_COVERAGE_DITHER_DISABLE_NV = 0x934F;
    public static final int GL_ALPHA_TO_COVERAGE_DITHER_MODE_NV = 0x92BF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glAlphaToCoverageDitherControlNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glAlphaToCoverageDitherControlNV;
        private Handles(GLLoadFunc func) {
            PFN_glAlphaToCoverageDitherControlNV = func.invoke("glAlphaToCoverageDitherControlNV");
        }
    }

    public GLNVAlphaToCoverageDitherControl(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glAlphaToCoverageDitherControlNV`.
    /// ```
    /// void glAlphaToCoverageDitherControlNV((unsigned int) GLenum mode);
    /// ```
    public void AlphaToCoverageDitherControlNV(int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAlphaToCoverageDitherControlNV)) throw new GLSymbolNotFoundError("Symbol not found: glAlphaToCoverageDitherControlNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glAlphaToCoverageDitherControlNV", mode); }
        Handles.MH_glAlphaToCoverageDitherControlNV.invokeExact(handles.PFN_glAlphaToCoverageDitherControlNV, mode); }
        catch (Throwable e) { throw new RuntimeException("error in AlphaToCoverageDitherControlNV", e); }
    }

}
