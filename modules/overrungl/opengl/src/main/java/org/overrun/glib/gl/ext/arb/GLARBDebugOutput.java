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

package org.overrun.glib.gl.ext.arb;

import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.gl.GLDebugProc;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;
import static org.overrun.glib.gl.GLLoader.getExtCapabilities;

/**
 * {@code GL_ARB_debug_output}
 *
 * @author squid233
 * @since 0.1.0
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
        ext.glDebugMessageCallbackARB = load.invoke("glDebugMessageCallbackARB", PPV);
        ext.glDebugMessageControlARB = load.invoke("glDebugMessageControlARB", IIIIPZV);
        ext.glDebugMessageInsertARB = load.invoke("glDebugMessageInsertARB", IIIIIPV);
        ext.glGetDebugMessageLogARB = load.invoke("glGetDebugMessageLogARB", IIPPPPPPI);
    }

    public static void glDebugMessageCallbackARB(MemorySegment callback, MemorySegment userParam) {
        var ext = getExtCapabilities();
        try {
            check(ext.glDebugMessageCallbackARB).invokeExact(callback, userParam);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDebugMessageCallbackARB(Arena arena, GLDebugProc callback, MemorySegment userParam) {
        glDebugMessageCallbackARB(callback.address(arena), userParam);
    }

    public static void glDebugMessageControlARB(int source, int type, int severity, int count, MemorySegment ids, boolean enabled) {
        var ext = getExtCapabilities();
        try {
            check(ext.glDebugMessageControlARB).invokeExact(source, type, severity, count, ids, enabled);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDebugMessageControlARB(SegmentAllocator allocator, int source, int type, int severity, int count, int[] ids, boolean enabled) {
        glDebugMessageControlARB(source, type, severity, count, allocator.allocateArray(JAVA_INT, ids), enabled);
    }

    public static void glDebugMessageInsertARB(int source, int type, int id, int severity, int length, MemorySegment buf) {
        var ext = getExtCapabilities();
        try {
            check(ext.glDebugMessageInsertARB).invokeExact(source, type, id, severity, length, buf);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDebugMessageInsertARB(SegmentAllocator allocator, int source, int type, int id, int severity, String buf) {
        glDebugMessageInsertARB(source, type, id, severity, -1, allocator.allocateUtf8String(buf));
    }

    public static int glGetDebugMessageLogARB(int count, int bufSize, MemorySegment sources, MemorySegment types, MemorySegment ids, MemorySegment severities, MemorySegment lengths, MemorySegment messageLog) {
        var ext = getExtCapabilities();
        try {
            return (int) check(ext.glGetDebugMessageLogARB).invokeExact(count, bufSize, sources, types, ids, severities, lengths, messageLog);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int glGetDebugMessageLogARB(int count, MemorySegment sources, MemorySegment types, MemorySegment ids, MemorySegment severities, MemorySegment lengths, MemorySegment messageLog) {
        return glGetDebugMessageLogARB(count, (int) messageLog.byteSize(), sources, types, ids, severities, lengths, messageLog);
    }

    public static int glGetDebugMessageLogARB(SegmentAllocator allocator, int count, int bufSize, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, String[] messageLog) {
        var pSrc = allocator.allocateArray(JAVA_INT, sources.length);
        var pTypes = allocator.allocateArray(JAVA_INT, types.length);
        var pIds = allocator.allocateArray(JAVA_INT, ids.length);
        var pSvr = allocator.allocateArray(JAVA_INT, severities.length);
        var pLen = allocator.allocateArray(JAVA_INT, lengths.length);
        var pLog = allocator.allocateArray(JAVA_BYTE, bufSize);
        int num = glGetDebugMessageLogARB(count, bufSize, pSrc, pTypes, pIds, pSvr, pLen, pLog);
        RuntimeHelper.toArray(pSrc, sources);
        RuntimeHelper.toArray(pTypes, types);
        RuntimeHelper.toArray(pIds, ids);
        RuntimeHelper.toArray(pSvr, severities);
        RuntimeHelper.toArray(pLen, lengths);
        messageLog[0] = pLog.getUtf8String(0);
        return num;
    }
}
