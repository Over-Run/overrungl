/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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
package overrungl.opengl.ext.arb;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_ARB_debug_output}
 */
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
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_debug_output) return;
        ext.glDebugMessageControlARB = load.invoke("glDebugMessageControlARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_BYTE));
        ext.glDebugMessageInsertARB = load.invoke("glDebugMessageInsertARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glDebugMessageCallbackARB = load.invoke("glDebugMessageCallbackARB", ofVoid(ADDRESS, ADDRESS));
        ext.glGetDebugMessageLogARB = load.invoke("glGetDebugMessageLogARB", of(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
    }

    public static void glDebugMessageControlARB(int source, int type, int severity, int count, @NativeType("const GLuint *") MemorySegment ids, boolean enabled) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDebugMessageControlARB).invokeExact(source, type, severity, count, ids, enabled);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDebugMessageInsertARB(int source, int type, int id, int severity, int length, @NativeType("const GLchar *") MemorySegment buf) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDebugMessageInsertARB).invokeExact(source, type, id, severity, length, buf);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDebugMessageCallbackARB(@NativeType("GLDEBUGPROCARB") MemorySegment callback, @NativeType("const void *") MemorySegment userParam) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDebugMessageCallbackARB).invokeExact(callback, userParam);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDebugMessageCallbackARB(Arena arena, GLDebugProc callback, @NativeType("const void *") MemorySegment userParam) {
        glDebugMessageCallbackARB(callback.stub(arena), userParam);
    }

    public static int glGetDebugMessageLogARB(int count, int bufSize, @NativeType("GLenum *") MemorySegment sources, @NativeType("GLenum *") MemorySegment types, @NativeType("GLuint *") MemorySegment ids, @NativeType("GLenum *") MemorySegment severities, @NativeType("GLsizei *") MemorySegment lengths, @NativeType("GLchar *") MemorySegment messageLog) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glGetDebugMessageLogARB).invokeExact(count, bufSize, sources, types, ids, severities, lengths, messageLog);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
