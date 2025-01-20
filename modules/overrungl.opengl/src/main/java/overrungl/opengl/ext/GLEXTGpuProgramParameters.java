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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTGpuProgramParameters {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glProgramEnvParameters4fvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramLocalParameters4fvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glProgramEnvParameters4fvEXT,
            FD_glProgramLocalParameters4fvEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glProgramEnvParameters4fvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramEnvParameters4fvEXT);
        public static final MethodHandle MH_glProgramLocalParameters4fvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramLocalParameters4fvEXT);
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

    public void ProgramEnvParameters4fvEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramEnvParameters4fvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramEnvParameters4fvEXT");
        try { Handles.MH_glProgramEnvParameters4fvEXT.invokeExact(handles.PFN_glProgramEnvParameters4fvEXT, target, index, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramEnvParameters4fvEXT", e); }
    }

    public void ProgramLocalParameters4fvEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramLocalParameters4fvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramLocalParameters4fvEXT");
        try { Handles.MH_glProgramLocalParameters4fvEXT.invokeExact(handles.PFN_glProgramLocalParameters4fvEXT, target, index, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramLocalParameters4fvEXT", e); }
    }

}
