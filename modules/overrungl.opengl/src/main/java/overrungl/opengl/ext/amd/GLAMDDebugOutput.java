/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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
package overrungl.opengl.ext.amd;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_AMD_debug_output}
  */
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
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_debug_output) return;
        ext.glDebugMessageEnableAMD = load.invoke("glDebugMessageEnableAMD", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_BYTE));
        ext.glDebugMessageInsertAMD = load.invoke("glDebugMessageInsertAMD", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glDebugMessageCallbackAMD = load.invoke("glDebugMessageCallbackAMD", ofVoid(ADDRESS, ADDRESS));
        ext.glGetDebugMessageLogAMD = load.invoke("glGetDebugMessageLogAMD", of(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
    }

    public static void glDebugMessageEnableAMD(int category, int severity, int count, @NativeType("const GLuint *") MemorySegment ids, boolean enabled) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDebugMessageEnableAMD).invokeExact(category, severity, count, ids, enabled);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDebugMessageInsertAMD(int category, int severity, int id, int length, @NativeType("const GLchar *") MemorySegment buf) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDebugMessageInsertAMD).invokeExact(category, severity, id, length, buf);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDebugMessageCallbackAMD(@NativeType("GLDEBUGPROCAMD") MemorySegment callback, @NativeType("void *") MemorySegment userParam) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDebugMessageCallbackAMD).invokeExact(callback, userParam);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDebugMessageCallbackAMD(Arena arena, GLDebugProcAMD callback, @NativeType("void *") MemorySegment userParam) {
        glDebugMessageCallbackAMD(callback.address(arena), userParam);
    }

    public static int glGetDebugMessageLogAMD(int count, int bufSize, @NativeType("GLenum *") MemorySegment categories, @NativeType("GLenum *") MemorySegment severities, @NativeType("GLuint *") MemorySegment ids, @NativeType("GLsizei *") MemorySegment lengths, @NativeType("GLchar *") MemorySegment message) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glGetDebugMessageLogAMD).invokeExact(count, bufSize, categories, severities, ids, lengths, message);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
