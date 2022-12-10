/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.gl.ext.amd;

import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SegmentScope;

import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;
import static org.overrun.glib.gl.GLLoader.getExtCapabilities;

/**
 * {@code GL_AMD_debug_output}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAMDDebugOutput {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_debug_output) return;
        ext.glDebugMessageCallbackAMD = load.invoke("glDebugMessageCallbackAMD", PPV);
        ext.glDebugMessageEnableAMD = load.invoke("glDebugMessageEnableAMD", IIIPZV);
        ext.glDebugMessageInsertAMD = load.invoke("glDebugMessageInsertAMD", IIIIPV);
        ext.glGetDebugMessageLogAMD = load.invoke("glGetDebugMessageLogAMD", IIPPPPPI);
    }

    public static void glDebugMessageCallbackAMD(MemorySegment callback, MemorySegment userParam) {
        var ext = getExtCapabilities();
        try {
            check(ext.glDebugMessageCallbackAMD).invokeExact(callback, userParam);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDebugMessageCallbackAMD(SegmentScope scope, GLDebugProcAMD callback, MemorySegment userParam) {
        glDebugMessageCallbackAMD(callback.address(scope), userParam);
    }

    public static void glDebugMessageEnableAMD(int category, int severity, int count, MemorySegment ids, boolean enabled) {
        var ext = getExtCapabilities();
        try {
            check(ext.glDebugMessageEnableAMD).invokeExact(category, severity, count, ids, enabled);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDebugMessageEnableAMD(SegmentAllocator allocator, int category, int severity, int[] ids, boolean enabled) {
        glDebugMessageEnableAMD(category, severity, ids.length, allocator.allocateArray(JAVA_INT, ids), enabled);
    }

    public static void glDebugMessageInsertAMD(int category, int severity, int id, int length, MemorySegment buf) {
        var ext = getExtCapabilities();
        try {
            check(ext.glDebugMessageInsertAMD).invokeExact(category, severity, id, length, buf);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDebugMessageInsertAMD(SegmentAllocator allocator, int category, int severity, int id, String buf) {
        glDebugMessageInsertAMD(category, severity, id, 0, allocator.allocateUtf8String(buf));
    }

    public static int glGetDebugMessageLogAMD(int count, int bufSize, MemorySegment categories, MemorySegment severities, MemorySegment ids, MemorySegment lengths, MemorySegment message) {
        var ext = getExtCapabilities();
        try {
            return (int) check(ext.glGetDebugMessageLogAMD).invokeExact(count, bufSize, categories, severities, ids, lengths, message);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int glGetDebugMessageLogAMD(int count, MemorySegment categories, MemorySegment severities, MemorySegment ids, MemorySegment lengths, MemorySegment messageLog) {
        return glGetDebugMessageLogAMD(count, (int) messageLog.byteSize(), categories, severities, ids, lengths, messageLog);
    }

    public static int glGetDebugMessageLogAMD(SegmentAllocator allocator, int count, int bufSize, int[] categories, int[] severities, int[] ids, int[] lengths, String[] messageLog) {
        var pCgr = allocator.allocateArray(JAVA_INT, categories.length);
        var pSvr = allocator.allocateArray(JAVA_INT, severities.length);
        var pIds = allocator.allocateArray(JAVA_INT, ids.length);
        var pLen = allocator.allocateArray(JAVA_INT, lengths.length);
        var pLog = allocator.allocateArray(JAVA_BYTE, bufSize);
        int num = glGetDebugMessageLogAMD(count, bufSize, pCgr, pSvr, pIds, pLen, pLog);
        RuntimeHelper.toArray(pCgr, categories);
        RuntimeHelper.toArray(pSvr, severities);
        RuntimeHelper.toArray(pIds, ids);
        RuntimeHelper.toArray(pLen, lengths);
        messageLog[0] = pLog.getUtf8String(0);
        return num;
    }
}
