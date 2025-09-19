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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_AMD_debug_output`
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
        public static final MethodHandle MH_glDebugMessageEnableAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glDebugMessageInsertAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDebugMessageCallbackAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetDebugMessageLogAMD = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glDebugMessageEnableAMD;
        public final MemorySegment PFN_glDebugMessageInsertAMD;
        public final MemorySegment PFN_glDebugMessageCallbackAMD;
        public final MemorySegment PFN_glGetDebugMessageLogAMD;
        private Handles(GLLoadFunc func) {
            PFN_glDebugMessageEnableAMD = func.invoke("glDebugMessageEnableAMD");
            PFN_glDebugMessageInsertAMD = func.invoke("glDebugMessageInsertAMD");
            PFN_glDebugMessageCallbackAMD = func.invoke("glDebugMessageCallbackAMD");
            PFN_glGetDebugMessageLogAMD = func.invoke("glGetDebugMessageLogAMD");
        }
    }

    public GLAMDDebugOutput(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glDebugMessageEnableAMD`.
    /// ```
    /// void glDebugMessageEnableAMD((unsigned int) GLenum category, (unsigned int) GLenum severity, (int) GLsizei count, const GLuint* ids, GLboolean enabled);
    /// ```
    public void DebugMessageEnableAMD(int category, int severity, int count, @NonNull MemorySegment ids, boolean enabled) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDebugMessageEnableAMD)) throw new GLSymbolNotFoundError("Symbol not found: glDebugMessageEnableAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDebugMessageEnableAMD", category, severity, count, ids, enabled); }
        Handles.MH_glDebugMessageEnableAMD.invokeExact(handles.PFN_glDebugMessageEnableAMD, category, severity, count, ids, ((enabled) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in DebugMessageEnableAMD", e); }
    }

    /// Invokes `glDebugMessageInsertAMD`.
    /// ```
    /// void glDebugMessageInsertAMD((unsigned int) GLenum category, (unsigned int) GLenum severity, (unsigned int) GLuint id, (int) GLsizei length, const GLchar* buf);
    /// ```
    public void DebugMessageInsertAMD(int category, int severity, int id, int length, @NonNull MemorySegment buf) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDebugMessageInsertAMD)) throw new GLSymbolNotFoundError("Symbol not found: glDebugMessageInsertAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDebugMessageInsertAMD", category, severity, id, length, buf); }
        Handles.MH_glDebugMessageInsertAMD.invokeExact(handles.PFN_glDebugMessageInsertAMD, category, severity, id, length, buf); }
        catch (Throwable e) { throw new RuntimeException("error in DebugMessageInsertAMD", e); }
    }

    /// Invokes `glDebugMessageCallbackAMD`.
    /// ```
    /// void glDebugMessageCallbackAMD((void (*GLDebugProcAMD)((unsigned int) GLuint id, (unsigned int) GLenum category, (unsigned int) GLenum severity, (int) GLsizei length, const GLchar* message, void* userParam)) GLDEBUGPROCAMD callback, void* userParam);
    /// ```
    public void DebugMessageCallbackAMD(@NonNull MemorySegment callback, @NonNull MemorySegment userParam) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDebugMessageCallbackAMD)) throw new GLSymbolNotFoundError("Symbol not found: glDebugMessageCallbackAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDebugMessageCallbackAMD", callback, userParam); }
        Handles.MH_glDebugMessageCallbackAMD.invokeExact(handles.PFN_glDebugMessageCallbackAMD, callback, userParam); }
        catch (Throwable e) { throw new RuntimeException("error in DebugMessageCallbackAMD", e); }
    }

    /// Invokes `glGetDebugMessageLogAMD`.
    /// ```
    /// (unsigned int) GLuint glGetDebugMessageLogAMD((unsigned int) GLuint count, (int) GLsizei bufSize, GLenum* categories, GLenum* severities, GLuint* ids, GLsizei* lengths, GLchar* message);
    /// ```
    public int GetDebugMessageLogAMD(int count, int bufSize, @NonNull MemorySegment categories, @NonNull MemorySegment severities, @NonNull MemorySegment ids, @NonNull MemorySegment lengths, @NonNull MemorySegment message) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetDebugMessageLogAMD)) throw new GLSymbolNotFoundError("Symbol not found: glGetDebugMessageLogAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetDebugMessageLogAMD", count, bufSize, categories, severities, ids, lengths, message); }
        return (int) Handles.MH_glGetDebugMessageLogAMD.invokeExact(handles.PFN_glGetDebugMessageLogAMD, count, bufSize, categories, severities, ids, lengths, message); }
        catch (Throwable e) { throw new RuntimeException("error in GetDebugMessageLogAMD", e); }
    }

}
