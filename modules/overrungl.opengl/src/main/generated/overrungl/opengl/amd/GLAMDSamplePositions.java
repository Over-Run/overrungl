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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLAMDSamplePositions {
    public static final int GL_SUBSAMPLE_DISTANCE_AMD = 0x883F;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glSetMultisamplefvAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glSetMultisamplefvAMD;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glSetMultisamplefvAMD = func.invoke("glSetMultisamplefvAMD");
        }
    }

    public GLAMDSamplePositions(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glSetMultisamplefvAMD((unsigned int) GLenum pname, (unsigned int) GLuint index, const GLfloat* val);
    /// ```
    public void SetMultisamplefvAMD(int pname, int index, MemorySegment val) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSetMultisamplefvAMD)) throw new GLSymbolNotFoundError("Symbol not found: glSetMultisamplefvAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSetMultisamplefvAMD", pname, index, val); }
        Handles.MH_glSetMultisamplefvAMD.invokeExact(handles.PFN_glSetMultisamplefvAMD, pname, index, val); }
        catch (Throwable e) { throw new RuntimeException("error in SetMultisamplefvAMD", e); }
    }

}
