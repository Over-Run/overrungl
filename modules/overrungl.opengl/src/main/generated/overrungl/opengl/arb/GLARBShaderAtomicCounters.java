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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBShaderAtomicCounters {
    public static final int GL_ATOMIC_COUNTER_BUFFER = 0x92C0;
    public static final int GL_ATOMIC_COUNTER_BUFFER_BINDING = 0x92C1;
    public static final int GL_ATOMIC_COUNTER_BUFFER_START = 0x92C2;
    public static final int GL_ATOMIC_COUNTER_BUFFER_SIZE = 0x92C3;
    public static final int GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE = 0x92C4;
    public static final int GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS = 0x92C5;
    public static final int GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES = 0x92C6;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER = 0x92C7;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER = 0x92C8;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x92C9;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER = 0x92CA;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER = 0x92CB;
    public static final int GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS = 0x92CC;
    public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS = 0x92CD;
    public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = 0x92CE;
    public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS = 0x92CF;
    public static final int GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS = 0x92D0;
    public static final int GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS = 0x92D1;
    public static final int GL_MAX_VERTEX_ATOMIC_COUNTERS = 0x92D2;
    public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS = 0x92D3;
    public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS = 0x92D4;
    public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTERS = 0x92D5;
    public static final int GL_MAX_FRAGMENT_ATOMIC_COUNTERS = 0x92D6;
    public static final int GL_MAX_COMBINED_ATOMIC_COUNTERS = 0x92D7;
    public static final int GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE = 0x92D8;
    public static final int GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS = 0x92DC;
    public static final int GL_ACTIVE_ATOMIC_COUNTER_BUFFERS = 0x92D9;
    public static final int GL_UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX = 0x92DA;
    public static final int GL_UNSIGNED_INT_ATOMIC_COUNTER = 0x92DB;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetActiveAtomicCounterBufferiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glGetActiveAtomicCounterBufferiv;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGetActiveAtomicCounterBufferiv = func.invoke("glGetActiveAtomicCounterBufferiv");
        }
    }

    public GLARBShaderAtomicCounters(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glGetActiveAtomicCounterBufferiv((unsigned int) GLuint program, (unsigned int) GLuint bufferIndex, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetActiveAtomicCounterBufferiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetActiveAtomicCounterBufferiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetActiveAtomicCounterBufferiv", program, bufferIndex, pname, params); }
        Handles.MH_glGetActiveAtomicCounterBufferiv.invokeExact(handles.PFN_glGetActiveAtomicCounterBufferiv, program, bufferIndex, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetActiveAtomicCounterBufferiv", e); }
    }

}
