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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_debug_output}
 */
public interface GLARBDebugOutput {
    int GL_DEBUG_OUTPUT_SYNCHRONOUS_ARB = 0x8242;
    int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_ARB = 0x8243;
    int GL_DEBUG_CALLBACK_FUNCTION_ARB = 0x8244;
    int GL_DEBUG_CALLBACK_USER_PARAM_ARB = 0x8245;
    int GL_DEBUG_SOURCE_API_ARB = 0x8246;
    int GL_DEBUG_SOURCE_WINDOW_SYSTEM_ARB = 0x8247;
    int GL_DEBUG_SOURCE_SHADER_COMPILER_ARB = 0x8248;
    int GL_DEBUG_SOURCE_THIRD_PARTY_ARB = 0x8249;
    int GL_DEBUG_SOURCE_APPLICATION_ARB = 0x824A;
    int GL_DEBUG_SOURCE_OTHER_ARB = 0x824B;
    int GL_DEBUG_TYPE_ERROR_ARB = 0x824C;
    int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB = 0x824D;
    int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB = 0x824E;
    int GL_DEBUG_TYPE_PORTABILITY_ARB = 0x824F;
    int GL_DEBUG_TYPE_PERFORMANCE_ARB = 0x8250;
    int GL_DEBUG_TYPE_OTHER_ARB = 0x8251;
    int GL_MAX_DEBUG_MESSAGE_LENGTH_ARB = 0x9143;
    int GL_MAX_DEBUG_LOGGED_MESSAGES_ARB = 0x9144;
    int GL_DEBUG_LOGGED_MESSAGES_ARB = 0x9145;
    int GL_DEBUG_SEVERITY_HIGH_ARB = 0x9146;
    int GL_DEBUG_SEVERITY_MEDIUM_ARB = 0x9147;
    int GL_DEBUG_SEVERITY_LOW_ARB = 0x9148;

    default void glDebugMessageControlARB(int source, int type, int severity, int count, @NativeType("const GLuint *") MemorySegment ids, boolean enabled) {
        throw new ContextException();
    }

    default void glDebugMessageInsertARB(int source, int type, int id, int severity, int length, @NativeType("const GLchar *") MemorySegment buf) {
        throw new ContextException();
    }

    default void glDebugMessageCallbackARB(@NativeType("GLDEBUGPROCARB") MemorySegment callback, @NativeType("const void *") MemorySegment userParam) {
        throw new ContextException();
    }

    @overrun.marshal.gen.Skip
    default void glDebugMessageCallbackARB(Arena arena, overrungl.opengl.GLDebugProc callback, @NativeType("const void *") MemorySegment userParam) {
        glDebugMessageCallbackARB(callback.stub(arena), userParam);
    }

    default int glGetDebugMessageLogARB(int count, int bufSize, @NativeType("GLenum *") MemorySegment sources, @NativeType("GLenum *") MemorySegment types, @NativeType("GLuint *") MemorySegment ids, @NativeType("GLenum *") MemorySegment severities, @NativeType("GLsizei *") MemorySegment lengths, @NativeType("GLchar *") MemorySegment messageLog) {
        throw new ContextException();
    }

}
