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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLEXTDebugLabel {
    public static final int GL_PROGRAM_PIPELINE_OBJECT_EXT = 0x8A4F;
    public static final int GL_PROGRAM_OBJECT_EXT = 0x8B40;
    public static final int GL_SHADER_OBJECT_EXT = 0x8B48;
    public static final int GL_BUFFER_OBJECT_EXT = 0x9151;
    public static final int GL_QUERY_OBJECT_EXT = 0x9153;
    public static final int GL_VERTEX_ARRAY_OBJECT_EXT = 0x9154;
    public static final int GL_SAMPLER = 0x82E6;
    public static final int GL_TRANSFORM_FEEDBACK = 0x8E22;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glLabelObjectEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetObjectLabelEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glLabelObjectEXT;
        public final MemorySegment PFN_glGetObjectLabelEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glLabelObjectEXT = func.invoke("glLabelObjectEXT");
            PFN_glGetObjectLabelEXT = func.invoke("glGetObjectLabelEXT");
        }
    }

    public GLEXTDebugLabel(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glLabelObjectEXT((unsigned int) GLenum type, (unsigned int) GLuint object, (int) GLsizei length, const GLchar* label);
    /// ```
    public void LabelObjectEXT(int type, int object, int length, MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLabelObjectEXT)) throw new GLSymbolNotFoundError("Symbol not found: glLabelObjectEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glLabelObjectEXT", type, object, length, label); }
        Handles.MH_glLabelObjectEXT.invokeExact(handles.PFN_glLabelObjectEXT, type, object, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in LabelObjectEXT", e); }
    }

    /// ```
    /// void glGetObjectLabelEXT((unsigned int) GLenum type, (unsigned int) GLuint object, (int) GLsizei bufSize, GLsizei* length, GLchar* label);
    /// ```
    public void GetObjectLabelEXT(int type, int object, int bufSize, MemorySegment length, MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectLabelEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetObjectLabelEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetObjectLabelEXT", type, object, bufSize, length, label); }
        Handles.MH_glGetObjectLabelEXT.invokeExact(handles.PFN_glGetObjectLabelEXT, type, object, bufSize, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectLabelEXT", e); }
    }

}
