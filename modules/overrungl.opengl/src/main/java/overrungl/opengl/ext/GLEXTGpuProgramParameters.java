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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTGpuProgramParameters {
    public static final MethodHandle MH_glProgramEnvParameters4fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramEnvParameters4fvEXT;
    public static final MethodHandle MH_glProgramLocalParameters4fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramLocalParameters4fvEXT;

    public GLEXTGpuProgramParameters(overrungl.opengl.GLLoadFunc func) {
        PFN_glProgramEnvParameters4fvEXT = func.invoke("glProgramEnvParameters4fvEXT");
        PFN_glProgramLocalParameters4fvEXT = func.invoke("glProgramLocalParameters4fvEXT");
    }

    public void ProgramEnvParameters4fvEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramEnvParameters4fvEXT))
            MH_glProgramEnvParameters4fvEXT.invokeExact(PFN_glProgramEnvParameters4fvEXT, target, index, count, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramEnvParameters4fvEXT", e); }
    }

    public void ProgramLocalParameters4fvEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramLocalParameters4fvEXT))
            MH_glProgramLocalParameters4fvEXT.invokeExact(PFN_glProgramLocalParameters4fvEXT, target, index, count, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramLocalParameters4fvEXT", e); }
    }

}
