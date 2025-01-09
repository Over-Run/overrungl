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

public final class GLNVAlphaToCoverageDitherControl {
    public static final int GL_ALPHA_TO_COVERAGE_DITHER_DEFAULT_NV = 0x934D;
    public static final int GL_ALPHA_TO_COVERAGE_DITHER_ENABLE_NV = 0x934E;
    public static final int GL_ALPHA_TO_COVERAGE_DITHER_DISABLE_NV = 0x934F;
    public static final int GL_ALPHA_TO_COVERAGE_DITHER_MODE_NV = 0x92BF;
    public static final MethodHandle MH_glAlphaToCoverageDitherControlNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glAlphaToCoverageDitherControlNV;

    public GLNVAlphaToCoverageDitherControl(overrungl.opengl.GLLoadFunc func) {
        PFN_glAlphaToCoverageDitherControlNV = func.invoke("glAlphaToCoverageDitherControlNV");
    }

    public void AlphaToCoverageDitherControlNV(@CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(PFN_glAlphaToCoverageDitherControlNV)) throw new SymbolNotFoundError("Symbol not found: glAlphaToCoverageDitherControlNV");
        try { MH_glAlphaToCoverageDitherControlNV.invokeExact(PFN_glAlphaToCoverageDitherControlNV, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glAlphaToCoverageDitherControlNV", e); }
    }

}
