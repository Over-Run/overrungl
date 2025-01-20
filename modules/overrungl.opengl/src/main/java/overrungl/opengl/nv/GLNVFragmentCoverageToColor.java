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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVFragmentCoverageToColor {
    public static final int GL_FRAGMENT_COVERAGE_TO_COLOR_NV = 0x92DD;
    public static final int GL_FRAGMENT_COVERAGE_COLOR_NV = 0x92DE;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glFragmentCoverageColorNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glFragmentCoverageColorNV
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glFragmentCoverageColorNV = RuntimeHelper.downcall(Descriptors.FD_glFragmentCoverageColorNV);
        public final MemorySegment PFN_glFragmentCoverageColorNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glFragmentCoverageColorNV = func.invoke("glFragmentCoverageColorNV");
        }
    }

    public GLNVFragmentCoverageToColor(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void FragmentCoverageColorNV(@CType("GLuint") int color) {
        if (Unmarshal.isNullPointer(handles.PFN_glFragmentCoverageColorNV)) throw new SymbolNotFoundError("Symbol not found: glFragmentCoverageColorNV");
        try { Handles.MH_glFragmentCoverageColorNV.invokeExact(handles.PFN_glFragmentCoverageColorNV, color); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentCoverageColorNV", e); }
    }

}
