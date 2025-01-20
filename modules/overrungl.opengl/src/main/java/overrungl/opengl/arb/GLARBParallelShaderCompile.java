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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBParallelShaderCompile {
    public static final int GL_MAX_SHADER_COMPILER_THREADS_ARB = 0x91B0;
    public static final int GL_COMPLETION_STATUS_ARB = 0x91B1;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glMaxShaderCompilerThreadsARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glMaxShaderCompilerThreadsARB
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glMaxShaderCompilerThreadsARB = RuntimeHelper.downcall(Descriptors.FD_glMaxShaderCompilerThreadsARB);
        public final MemorySegment PFN_glMaxShaderCompilerThreadsARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glMaxShaderCompilerThreadsARB = func.invoke("glMaxShaderCompilerThreadsARB", "glMaxShaderCompilerThreadsKHR");
        }
    }

    public GLARBParallelShaderCompile(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void MaxShaderCompilerThreadsARB(@CType("GLuint") int count) {
        if (Unmarshal.isNullPointer(handles.PFN_glMaxShaderCompilerThreadsARB)) throw new SymbolNotFoundError("Symbol not found: glMaxShaderCompilerThreadsARB");
        try { Handles.MH_glMaxShaderCompilerThreadsARB.invokeExact(handles.PFN_glMaxShaderCompilerThreadsARB, count); }
        catch (Throwable e) { throw new RuntimeException("error in glMaxShaderCompilerThreadsARB", e); }
    }

}
