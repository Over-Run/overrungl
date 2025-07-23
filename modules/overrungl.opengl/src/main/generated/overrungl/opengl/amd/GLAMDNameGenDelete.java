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

public final class GLAMDNameGenDelete {
    public static final int GL_DATA_BUFFER_AMD = 0x9151;
    public static final int GL_PERFORMANCE_MONITOR_AMD = 0x9152;
    public static final int GL_QUERY_OBJECT_AMD = 0x9153;
    public static final int GL_VERTEX_ARRAY_OBJECT_AMD = 0x9154;
    public static final int GL_SAMPLER_OBJECT_AMD = 0x9155;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGenNamesAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteNamesAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsNameAMD = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glGenNamesAMD;
        public final MemorySegment PFN_glDeleteNamesAMD;
        public final MemorySegment PFN_glIsNameAMD;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGenNamesAMD = func.invoke("glGenNamesAMD");
            PFN_glDeleteNamesAMD = func.invoke("glDeleteNamesAMD");
            PFN_glIsNameAMD = func.invoke("glIsNameAMD");
        }
    }

    public GLAMDNameGenDelete(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glGenNamesAMD((unsigned int) GLenum identifier, (unsigned int) GLuint num, GLuint* names);
    /// ```
    public void GenNamesAMD(int identifier, int num, MemorySegment names) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenNamesAMD)) throw new GLSymbolNotFoundError("Symbol not found: glGenNamesAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenNamesAMD", identifier, num, names); }
        Handles.MH_glGenNamesAMD.invokeExact(handles.PFN_glGenNamesAMD, identifier, num, names); }
        catch (Throwable e) { throw new RuntimeException("error in GenNamesAMD", e); }
    }

    /// ```
    /// void glDeleteNamesAMD((unsigned int) GLenum identifier, (unsigned int) GLuint num, const GLuint* names);
    /// ```
    public void DeleteNamesAMD(int identifier, int num, MemorySegment names) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteNamesAMD)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteNamesAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteNamesAMD", identifier, num, names); }
        Handles.MH_glDeleteNamesAMD.invokeExact(handles.PFN_glDeleteNamesAMD, identifier, num, names); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteNamesAMD", e); }
    }

    /// ```
    /// GLboolean glIsNameAMD((unsigned int) GLenum identifier, (unsigned int) GLuint name);
    /// ```
    public boolean IsNameAMD(int identifier, int name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsNameAMD)) throw new GLSymbolNotFoundError("Symbol not found: glIsNameAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsNameAMD", identifier, name); }
        return (((byte) Handles.MH_glIsNameAMD.invokeExact(handles.PFN_glIsNameAMD, identifier, name)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsNameAMD", e); }
    }

}
