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

public final class GLAMDSamplePositions {
    public static final int GL_SUBSAMPLE_DISTANCE_AMD = 0x883F;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glSetMultisamplefvAMD = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glSetMultisamplefvAMD
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glSetMultisamplefvAMD = RuntimeHelper.downcall(Descriptors.FD_glSetMultisamplefvAMD);
        public final MemorySegment PFN_glSetMultisamplefvAMD;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glSetMultisamplefvAMD = func.invoke("glSetMultisamplefvAMD");
        }
    }

    public GLAMDSamplePositions(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void SetMultisamplefvAMD(@CType("GLenum") int pname, @CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment val) {
        if (Unmarshal.isNullPointer(handles.PFN_glSetMultisamplefvAMD)) throw new SymbolNotFoundError("Symbol not found: glSetMultisamplefvAMD");
        try { Handles.MH_glSetMultisamplefvAMD.invokeExact(handles.PFN_glSetMultisamplefvAMD, pname, index, val); }
        catch (Throwable e) { throw new RuntimeException("error in glSetMultisamplefvAMD", e); }
    }

}
