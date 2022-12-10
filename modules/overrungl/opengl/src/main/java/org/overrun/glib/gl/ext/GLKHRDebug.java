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

package org.overrun.glib.gl.ext;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.gl.GLDebugProc;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SegmentScope;

import static org.overrun.glib.gl.GL43C.*;

/**
 * {@code GL_KHR_debug}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLKHRDebug {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
    }

    public static void glDebugMessageCallback(MemorySegment callback, MemorySegment userParam) {
        debugMessageCallback(callback, userParam);
    }

    public static void glDebugMessageCallback(SegmentScope scope, GLDebugProc callback, MemorySegment userParam) {
        debugMessageCallback(scope, callback, userParam);
    }

    public static void glDebugMessageControl(int source, int type, int severity, int count, MemorySegment ids, boolean enabled) {
        debugMessageControl(source, type, severity, count, ids, enabled);
    }

    public static void glDebugMessageControl(SegmentAllocator allocator, int source, int type, int severity, int count, int[] ids, boolean enabled) {
        debugMessageControl(allocator, source, type, severity, count, ids, enabled);
    }

    public static void glDebugMessageInsert(int source, int type, int id, int severity, int length, MemorySegment buf) {
        debugMessageInsert(source, type, id, severity, length, buf);
    }

    public static void glDebugMessageInsert(SegmentAllocator allocator, int source, int type, int id, int severity, String buf) {
        debugMessageInsert(allocator, source, type, id, severity, buf);
    }

    public static int glGetDebugMessageLog(int count, int bufSize, MemorySegment sources, MemorySegment types, MemorySegment ids, MemorySegment severities, MemorySegment lengths, MemorySegment messageLog) {
        return getDebugMessageLog(count, bufSize, sources, types, ids, severities, lengths, messageLog);
    }

    public static int glGetDebugMessageLog(int count, MemorySegment sources, MemorySegment types, MemorySegment ids, MemorySegment severities, MemorySegment lengths, MemorySegment messageLog) {
        return getDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
    }

    public static int glGetDebugMessageLog(SegmentAllocator allocator, int count, int bufSize, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, String[] messageLog) {
        return getDebugMessageLog(allocator, count, bufSize, sources, types, ids, severities, lengths, messageLog);
    }

    public static void glGetObjectLabel(int identifier, int name, int bufSize, MemorySegment length, MemorySegment label) {
        getObjectLabel(identifier, name, bufSize, length, label);
    }

    public static void glGetObjectLabel(int identifier, int name, MemorySegment length, MemorySegment label) {
        getObjectLabel(identifier, name, length, label);
    }

    public static String glGetObjectLabel(SegmentAllocator allocator, int identifier, int name, int bufSize, int @Nullable [] length) {
        return getObjectLabel(allocator, identifier, name, bufSize, length);
    }

    public static String glGetObjectLabel(SegmentAllocator allocator, int identifier, int name, int @Nullable [] length) {
        return getObjectLabel(allocator, identifier, name, length);
    }

    public static void glGetObjectPtrLabel(MemorySegment ptr, int bufSize, MemorySegment length, MemorySegment label) {
        getObjectPtrLabel(ptr, bufSize, length, label);
    }

    public static void glGetObjectPtrLabel(MemorySegment ptr, MemorySegment length, MemorySegment label) {
        getObjectPtrLabel(ptr, length, label);
    }

    public static String glGetObjectPtrLabel(SegmentAllocator allocator, MemorySegment ptr, int bufSize, int @Nullable [] length) {
        return getObjectPtrLabel(allocator, ptr, bufSize, length);
    }

    public static String glGetObjectPtrLabel(SegmentAllocator allocator, MemorySegment ptr, int @Nullable [] length) {
        return getObjectPtrLabel(allocator, ptr, length);
    }

    public static void glGetPointerv(int pname, MemorySegment params) {
        getPointerv(pname, params);
    }

    public static MemorySegment glGetPointer(int pname) {
        return getPointer(pname);
    }

    public static void glObjectLabel(int identifier, int name, int length, MemorySegment label) {
        objectLabel(identifier, name, length, label);
    }

    public static void glObjectLabel(SegmentAllocator allocator, int identifier, int name, String label) {
        objectLabel(allocator, identifier, name, label);
    }

    public static void glObjectPtrLabel(MemorySegment ptr, int length, MemorySegment label) {
        objectPtrLabel(ptr, length, label);
    }

    public static void glObjectPtrLabel(SegmentAllocator allocator, MemorySegment ptr, String label) {
        objectPtrLabel(allocator, ptr, label);
    }

    public static void glPopDebugGroup() {
        popDebugGroup();
    }

    public static void glPushDebugGroup(int source, int id, int length, MemorySegment message) {
        pushDebugGroup(source, id, length, message);
    }

    public static void glPushDebugGroup(SegmentAllocator allocator, int source, int id, String message) {
        pushDebugGroup(allocator, source, id, message);
    }
}
