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
package overrungl.opengl.ati;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLATIPnTriangles {
    public static final int GL_PN_TRIANGLES_ATI = 0x87F0;
    public static final int GL_MAX_PN_TRIANGLES_TESSELATION_LEVEL_ATI = 0x87F1;
    public static final int GL_PN_TRIANGLES_POINT_MODE_ATI = 0x87F2;
    public static final int GL_PN_TRIANGLES_NORMAL_MODE_ATI = 0x87F3;
    public static final int GL_PN_TRIANGLES_TESSELATION_LEVEL_ATI = 0x87F4;
    public static final int GL_PN_TRIANGLES_POINT_MODE_LINEAR_ATI = 0x87F5;
    public static final int GL_PN_TRIANGLES_POINT_MODE_CUBIC_ATI = 0x87F6;
    public static final int GL_PN_TRIANGLES_NORMAL_MODE_LINEAR_ATI = 0x87F7;
    public static final int GL_PN_TRIANGLES_NORMAL_MODE_QUADRATIC_ATI = 0x87F8;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glPNTrianglesiATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPNTrianglesfATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glPNTrianglesiATI;
        public final MemorySegment PFN_glPNTrianglesfATI;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glPNTrianglesiATI = func.invoke("glPNTrianglesiATI");
            PFN_glPNTrianglesfATI = func.invoke("glPNTrianglesfATI");
        }
    }

    public GLATIPnTriangles(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void PNTrianglesiATI(@CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glPNTrianglesiATI)) throw new SymbolNotFoundError("Symbol not found: glPNTrianglesiATI");
        try { Handles.MH_glPNTrianglesiATI.invokeExact(handles.PFN_glPNTrianglesiATI, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPNTrianglesiATI", e); }
    }

    public void PNTrianglesfATI(@CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(handles.PFN_glPNTrianglesfATI)) throw new SymbolNotFoundError("Symbol not found: glPNTrianglesfATI");
        try { Handles.MH_glPNTrianglesfATI.invokeExact(handles.PFN_glPNTrianglesfATI, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPNTrianglesfATI", e); }
    }

}
