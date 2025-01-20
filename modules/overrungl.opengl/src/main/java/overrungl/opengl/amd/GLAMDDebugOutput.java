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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAMDDebugOutput {
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH_AMD = 0x9143;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES_AMD = 0x9144;
    public static final int GL_DEBUG_LOGGED_MESSAGES_AMD = 0x9145;
    public static final int GL_DEBUG_SEVERITY_HIGH_AMD = 0x9146;
    public static final int GL_DEBUG_SEVERITY_MEDIUM_AMD = 0x9147;
    public static final int GL_DEBUG_SEVERITY_LOW_AMD = 0x9148;
    public static final int GL_DEBUG_CATEGORY_API_ERROR_AMD = 0x9149;
    public static final int GL_DEBUG_CATEGORY_WINDOW_SYSTEM_AMD = 0x914A;
    public static final int GL_DEBUG_CATEGORY_DEPRECATION_AMD = 0x914B;
    public static final int GL_DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD = 0x914C;
    public static final int GL_DEBUG_CATEGORY_PERFORMANCE_AMD = 0x914D;
    public static final int GL_DEBUG_CATEGORY_SHADER_COMPILER_AMD = 0x914E;
    public static final int GL_DEBUG_CATEGORY_APPLICATION_AMD = 0x914F;
    public static final int GL_DEBUG_CATEGORY_OTHER_AMD = 0x9150;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDebugMessageEnableAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
        public static final MethodHandle MH_glDebugMessageInsertAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDebugMessageCallbackAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetDebugMessageLogAMD = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glDebugMessageEnableAMD;
        public final MemorySegment PFN_glDebugMessageInsertAMD;
        public final MemorySegment PFN_glDebugMessageCallbackAMD;
        public final MemorySegment PFN_glGetDebugMessageLogAMD;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDebugMessageEnableAMD = func.invoke("glDebugMessageEnableAMD");
            PFN_glDebugMessageInsertAMD = func.invoke("glDebugMessageInsertAMD");
            PFN_glDebugMessageCallbackAMD = func.invoke("glDebugMessageCallbackAMD");
            PFN_glGetDebugMessageLogAMD = func.invoke("glGetDebugMessageLogAMD");
        }
    }

    public GLAMDDebugOutput(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void DebugMessageEnableAMD(@CType("GLenum") int category, @CType("GLenum") int severity, @CType("GLsizei") int count, @CType("const GLuint *") MemorySegment ids, @CType("GLboolean") boolean enabled) {
        if (Unmarshal.isNullPointer(handles.PFN_glDebugMessageEnableAMD)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageEnableAMD");
        try { Handles.MH_glDebugMessageEnableAMD.invokeExact(handles.PFN_glDebugMessageEnableAMD, category, severity, count, ids, enabled); }
        catch (Throwable e) { throw new RuntimeException("error in glDebugMessageEnableAMD", e); }
    }

    public void DebugMessageInsertAMD(@CType("GLenum") int category, @CType("GLenum") int severity, @CType("GLuint") int id, @CType("GLsizei") int length, @CType("const GLchar *") MemorySegment buf) {
        if (Unmarshal.isNullPointer(handles.PFN_glDebugMessageInsertAMD)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageInsertAMD");
        try { Handles.MH_glDebugMessageInsertAMD.invokeExact(handles.PFN_glDebugMessageInsertAMD, category, severity, id, length, buf); }
        catch (Throwable e) { throw new RuntimeException("error in glDebugMessageInsertAMD", e); }
    }

    public void DebugMessageCallbackAMD(@CType("GLDEBUGPROCAMD") MemorySegment callback, @CType("void*") MemorySegment userParam) {
        if (Unmarshal.isNullPointer(handles.PFN_glDebugMessageCallbackAMD)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageCallbackAMD");
        try { Handles.MH_glDebugMessageCallbackAMD.invokeExact(handles.PFN_glDebugMessageCallbackAMD, callback, userParam); }
        catch (Throwable e) { throw new RuntimeException("error in glDebugMessageCallbackAMD", e); }
    }

    public @CType("GLuint") int GetDebugMessageLogAMD(@CType("GLuint") int count, @CType("GLsizei") int bufSize, @CType("GLenum *") MemorySegment categories, @CType("GLenum *") MemorySegment severities, @CType("GLuint *") MemorySegment ids, @CType("GLsizei *") MemorySegment lengths, @CType("GLchar *") MemorySegment message) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetDebugMessageLogAMD)) throw new SymbolNotFoundError("Symbol not found: glGetDebugMessageLogAMD");
        try { return (int) Handles.MH_glGetDebugMessageLogAMD.invokeExact(handles.PFN_glGetDebugMessageLogAMD, count, bufSize, categories, severities, ids, lengths, message); }
        catch (Throwable e) { throw new RuntimeException("error in glGetDebugMessageLogAMD", e); }
    }

}
