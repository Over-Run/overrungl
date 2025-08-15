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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ATI_pn_triangles`
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
        public static final MethodHandle MH_glPNTrianglesiATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPNTrianglesfATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glPNTrianglesiATI;
        public final MemorySegment PFN_glPNTrianglesfATI;
        private Handles(GLLoadFunc func) {
            PFN_glPNTrianglesiATI = func.invoke("glPNTrianglesiATI");
            PFN_glPNTrianglesfATI = func.invoke("glPNTrianglesfATI");
        }
    }

    public GLATIPnTriangles(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glPNTrianglesiATI`.
    /// ```
    /// void glPNTrianglesiATI((unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void PNTrianglesiATI(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPNTrianglesiATI)) throw new GLSymbolNotFoundError("Symbol not found: glPNTrianglesiATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPNTrianglesiATI", pname, param); }
        Handles.MH_glPNTrianglesiATI.invokeExact(handles.PFN_glPNTrianglesiATI, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PNTrianglesiATI", e); }
    }

    /// Invokes `glPNTrianglesfATI`.
    /// ```
    /// void glPNTrianglesfATI((unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void PNTrianglesfATI(int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPNTrianglesfATI)) throw new GLSymbolNotFoundError("Symbol not found: glPNTrianglesfATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPNTrianglesfATI", pname, param); }
        Handles.MH_glPNTrianglesfATI.invokeExact(handles.PFN_glPNTrianglesfATI, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PNTrianglesfATI", e); }
    }

}
