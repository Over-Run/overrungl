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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBDebugOutput {
    public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS_ARB = 0x8242;
    public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_ARB = 0x8243;
    public static final int GL_DEBUG_CALLBACK_FUNCTION_ARB = 0x8244;
    public static final int GL_DEBUG_CALLBACK_USER_PARAM_ARB = 0x8245;
    public static final int GL_DEBUG_SOURCE_API_ARB = 0x8246;
    public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM_ARB = 0x8247;
    public static final int GL_DEBUG_SOURCE_SHADER_COMPILER_ARB = 0x8248;
    public static final int GL_DEBUG_SOURCE_THIRD_PARTY_ARB = 0x8249;
    public static final int GL_DEBUG_SOURCE_APPLICATION_ARB = 0x824A;
    public static final int GL_DEBUG_SOURCE_OTHER_ARB = 0x824B;
    public static final int GL_DEBUG_TYPE_ERROR_ARB = 0x824C;
    public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB = 0x824D;
    public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB = 0x824E;
    public static final int GL_DEBUG_TYPE_PORTABILITY_ARB = 0x824F;
    public static final int GL_DEBUG_TYPE_PERFORMANCE_ARB = 0x8250;
    public static final int GL_DEBUG_TYPE_OTHER_ARB = 0x8251;
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH_ARB = 0x9143;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES_ARB = 0x9144;
    public static final int GL_DEBUG_LOGGED_MESSAGES_ARB = 0x9145;
    public static final int GL_DEBUG_SEVERITY_HIGH_ARB = 0x9146;
    public static final int GL_DEBUG_SEVERITY_MEDIUM_ARB = 0x9147;
    public static final int GL_DEBUG_SEVERITY_LOW_ARB = 0x9148;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glDebugMessageControlARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glDebugMessageInsertARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDebugMessageCallbackARB = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetDebugMessageLogARB = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glDebugMessageControlARB = RuntimeHelper.downcall(Descriptors.FD_glDebugMessageControlARB);
        public static final MethodHandle MH_glDebugMessageInsertARB = RuntimeHelper.downcall(Descriptors.FD_glDebugMessageInsertARB);
        public static final MethodHandle MH_glDebugMessageCallbackARB = RuntimeHelper.downcall(Descriptors.FD_glDebugMessageCallbackARB);
        public static final MethodHandle MH_glGetDebugMessageLogARB = RuntimeHelper.downcall(Descriptors.FD_glGetDebugMessageLogARB);
        public final MemorySegment PFN_glDebugMessageControlARB;
        public final MemorySegment PFN_glDebugMessageInsertARB;
        public final MemorySegment PFN_glDebugMessageCallbackARB;
        public final MemorySegment PFN_glGetDebugMessageLogARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDebugMessageControlARB = func.invoke("glDebugMessageControlARB", "glDebugMessageControl");
            PFN_glDebugMessageInsertARB = func.invoke("glDebugMessageInsertARB", "glDebugMessageInsert");
            PFN_glDebugMessageCallbackARB = func.invoke("glDebugMessageCallbackARB", "glDebugMessageCallback");
            PFN_glGetDebugMessageLogARB = func.invoke("glGetDebugMessageLogARB", "glGetDebugMessageLog");
        }
    }

    public GLARBDebugOutput(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void DebugMessageControlARB(@CType("GLenum") int source, @CType("GLenum") int type, @CType("GLenum") int severity, @CType("GLsizei") int count, @CType("const GLuint *") MemorySegment ids, @CType("GLboolean") boolean enabled) {
        if (Unmarshal.isNullPointer(handles.PFN_glDebugMessageControlARB)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageControlARB");
        try { Handles.MH_glDebugMessageControlARB.invokeExact(handles.PFN_glDebugMessageControlARB, source, type, severity, count, ids, enabled); }
        catch (Throwable e) { throw new RuntimeException("error in glDebugMessageControlARB", e); }
    }

    public void DebugMessageInsertARB(@CType("GLenum") int source, @CType("GLenum") int type, @CType("GLuint") int id, @CType("GLenum") int severity, @CType("GLsizei") int length, @CType("const GLchar *") MemorySegment buf) {
        if (Unmarshal.isNullPointer(handles.PFN_glDebugMessageInsertARB)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageInsertARB");
        try { Handles.MH_glDebugMessageInsertARB.invokeExact(handles.PFN_glDebugMessageInsertARB, source, type, id, severity, length, buf); }
        catch (Throwable e) { throw new RuntimeException("error in glDebugMessageInsertARB", e); }
    }

    public void DebugMessageCallbackARB(@CType("GLDEBUGPROCARB") MemorySegment callback, @CType("const void *") MemorySegment userParam) {
        if (Unmarshal.isNullPointer(handles.PFN_glDebugMessageCallbackARB)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageCallbackARB");
        try { Handles.MH_glDebugMessageCallbackARB.invokeExact(handles.PFN_glDebugMessageCallbackARB, callback, userParam); }
        catch (Throwable e) { throw new RuntimeException("error in glDebugMessageCallbackARB", e); }
    }

    public @CType("GLuint") int GetDebugMessageLogARB(@CType("GLuint") int count, @CType("GLsizei") int bufSize, @CType("GLenum *") MemorySegment sources, @CType("GLenum *") MemorySegment types, @CType("GLuint *") MemorySegment ids, @CType("GLenum *") MemorySegment severities, @CType("GLsizei *") MemorySegment lengths, @CType("GLchar *") MemorySegment messageLog) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetDebugMessageLogARB)) throw new SymbolNotFoundError("Symbol not found: glGetDebugMessageLogARB");
        try { return (int) Handles.MH_glGetDebugMessageLogARB.invokeExact(handles.PFN_glGetDebugMessageLogARB, count, bufSize, sources, types, ids, severities, lengths, messageLog); }
        catch (Throwable e) { throw new RuntimeException("error in glGetDebugMessageLogARB", e); }
    }

}
