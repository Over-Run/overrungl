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

package org.overrun.glib.gl.ext.arb;

import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.gl.GLDebugProc;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
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
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_debug_output) return;
        ext.glDebugMessageCallbackARB = load.invoke("glDebugMessageCallbackARB", PPV);
        ext.glDebugMessageControlARB = load.invoke("glDebugMessageControlARB", IIIIPZV);
        ext.glDebugMessageInsertARB = load.invoke("glDebugMessageInsertARB", IIIIIPV);
        ext.glGetDebugMessageLogARB = load.invoke("glGetDebugMessageLogARB", IIPPPPPPI);
    }

    public static void glDebugMessageCallbackARB(Addressable callback, Addressable userParam) {
        var ext = getExtCapabilities();
        try {
            check(ext.glDebugMessageCallbackARB).invokeExact(callback, userParam);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDebugMessageCallbackARB(MemorySession scope, GLDebugProc callback, Addressable userParam) {
        glDebugMessageCallbackARB(callback.address(scope), userParam);
    }

    public static void glDebugMessageControlARB(int source, int type, int severity, int count, Addressable ids, boolean enabled) {
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

    public static void glDebugMessageInsertARB(int source, int type, int id, int severity, int length, Addressable buf) {
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

    public static int glGetDebugMessageLogARB(int count, int bufSize, Addressable sources, Addressable types, Addressable ids, Addressable severities, Addressable lengths, Addressable messageLog) {
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
