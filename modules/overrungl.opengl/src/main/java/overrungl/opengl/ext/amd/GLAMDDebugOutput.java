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
package overrungl.opengl.ext.amd;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_AMD_debug_output}
 */
public interface GLAMDDebugOutput {
    int GL_MAX_DEBUG_MESSAGE_LENGTH_AMD = 0x9143;
    int GL_MAX_DEBUG_LOGGED_MESSAGES_AMD = 0x9144;
    int GL_DEBUG_LOGGED_MESSAGES_AMD = 0x9145;
    int GL_DEBUG_SEVERITY_HIGH_AMD = 0x9146;
    int GL_DEBUG_SEVERITY_MEDIUM_AMD = 0x9147;
    int GL_DEBUG_SEVERITY_LOW_AMD = 0x9148;
    int GL_DEBUG_CATEGORY_API_ERROR_AMD = 0x9149;
    int GL_DEBUG_CATEGORY_WINDOW_SYSTEM_AMD = 0x914A;
    int GL_DEBUG_CATEGORY_DEPRECATION_AMD = 0x914B;
    int GL_DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD = 0x914C;
    int GL_DEBUG_CATEGORY_PERFORMANCE_AMD = 0x914D;
    int GL_DEBUG_CATEGORY_SHADER_COMPILER_AMD = 0x914E;
    int GL_DEBUG_CATEGORY_APPLICATION_AMD = 0x914F;
    int GL_DEBUG_CATEGORY_OTHER_AMD = 0x9150;

    default void glDebugMessageEnableAMD(int category, int severity, int count, @NativeType("const GLuint *") MemorySegment ids, boolean enabled) {
        throw new ContextException();
    }

    default void glDebugMessageInsertAMD(int category, int severity, int id, int length, @NativeType("const GLchar *") MemorySegment buf) {
        throw new ContextException();
    }

    default void glDebugMessageCallbackAMD(@NativeType("GLDEBUGPROCAMD") MemorySegment callback, @NativeType("void *") MemorySegment userParam) {
        throw new ContextException();
    }

    @overrun.marshal.gen.Skip
    default void glDebugMessageCallbackAMD(Arena arena, GLDebugProcAMD callback, @NativeType("void *") MemorySegment userParam) {
        glDebugMessageCallbackAMD(callback.stub(arena), userParam);
    }

    default int glGetDebugMessageLogAMD(int count, int bufSize, @NativeType("GLenum *") MemorySegment categories, @NativeType("GLenum *") MemorySegment severities, @NativeType("GLuint *") MemorySegment ids, @NativeType("GLsizei *") MemorySegment lengths, @NativeType("GLchar *") MemorySegment message) {
        throw new ContextException();
    }

}
