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
package overrungl.opengl.sgis;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLSGISTextureFilter4 {
    public static final int GL_FILTER4_SGIS = 0x8146;
    public static final int GL_TEXTURE_FILTER4_SIZE_SGIS = 0x8147;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetTexFilterFuncSGIS = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexFilterFuncSGIS = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glGetTexFilterFuncSGIS;
        public final MemorySegment PFN_glTexFilterFuncSGIS;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGetTexFilterFuncSGIS = func.invoke("glGetTexFilterFuncSGIS");
            PFN_glTexFilterFuncSGIS = func.invoke("glTexFilterFuncSGIS");
        }
    }

    public GLSGISTextureFilter4(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glGetTexFilterFuncSGIS((unsigned int) GLenum target, (unsigned int) GLenum filter, GLfloat* weights);
    /// ```
    public void GetTexFilterFuncSGIS(int target, int filter, MemorySegment weights) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTexFilterFuncSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glGetTexFilterFuncSGIS");
        try { Handles.MH_glGetTexFilterFuncSGIS.invokeExact(handles.PFN_glGetTexFilterFuncSGIS, target, filter, weights); }
        catch (Throwable e) { throw new RuntimeException("error in GetTexFilterFuncSGIS", e); }
    }

    /// ```
    /// void glTexFilterFuncSGIS((unsigned int) GLenum target, (unsigned int) GLenum filter, (int) GLsizei n, const GLfloat* weights);
    /// ```
    public void TexFilterFuncSGIS(int target, int filter, int n, MemorySegment weights) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexFilterFuncSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glTexFilterFuncSGIS");
        try { Handles.MH_glTexFilterFuncSGIS.invokeExact(handles.PFN_glTexFilterFuncSGIS, target, filter, n, weights); }
        catch (Throwable e) { throw new RuntimeException("error in TexFilterFuncSGIS", e); }
    }

}
