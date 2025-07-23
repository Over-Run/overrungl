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

public final class GLEXTGpuProgramParameters {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glProgramEnvParameters4fvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramLocalParameters4fvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glProgramEnvParameters4fvEXT;
        public final MemorySegment PFN_glProgramLocalParameters4fvEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glProgramEnvParameters4fvEXT = func.invoke("glProgramEnvParameters4fvEXT");
            PFN_glProgramLocalParameters4fvEXT = func.invoke("glProgramLocalParameters4fvEXT");
        }
    }

    public GLEXTGpuProgramParameters(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glProgramEnvParameters4fvEXT((unsigned int) GLenum target, (unsigned int) GLuint index, (int) GLsizei count, const GLfloat* params);
    /// ```
    public void ProgramEnvParameters4fvEXT(int target, int index, int count, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramEnvParameters4fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramEnvParameters4fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramEnvParameters4fvEXT", target, index, count, params); }
        Handles.MH_glProgramEnvParameters4fvEXT.invokeExact(handles.PFN_glProgramEnvParameters4fvEXT, target, index, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramEnvParameters4fvEXT", e); }
    }

    /// ```
    /// void glProgramLocalParameters4fvEXT((unsigned int) GLenum target, (unsigned int) GLuint index, (int) GLsizei count, const GLfloat* params);
    /// ```
    public void ProgramLocalParameters4fvEXT(int target, int index, int count, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramLocalParameters4fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramLocalParameters4fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramLocalParameters4fvEXT", target, index, count, params); }
        Handles.MH_glProgramLocalParameters4fvEXT.invokeExact(handles.PFN_glProgramLocalParameters4fvEXT, target, index, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramLocalParameters4fvEXT", e); }
    }

}
