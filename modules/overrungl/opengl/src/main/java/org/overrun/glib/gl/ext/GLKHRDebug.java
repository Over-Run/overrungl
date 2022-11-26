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
import org.overrun.glib.gl.GLCapabilities;
import org.overrun.glib.gl.GLDebugProc;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.foreign.*;

import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GL43C.*;

/**
 * {@code GL_KHR_debug}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLKHRDebug {
    public static void load(GLCapabilities caps, GLLoadFunc load) {
        if (GLExtCaps.Flags.GL_KHR_debug.no()) return;
        caps.glDebugMessageCallback = load.invoke("glDebugMessageCallback", PPV);
        caps.glDebugMessageControl = load.invoke("glDebugMessageControl", IIIIPZV);
        caps.glDebugMessageInsert = load.invoke("glDebugMessageInsert", IIIIIPV);
        caps.glGetDebugMessageLog = load.invoke("glGetDebugMessageLog", IIPPPPPPI);
        caps.glGetObjectLabel = load.invoke("glGetObjectLabel", IIIPPV);
        caps.glGetObjectPtrLabel = load.invoke("glGetObjectPtrLabel", PIPPV);
        caps.glGetPointerv = load.invoke("glGetPointerv", IPV);
        caps.glObjectLabel = load.invoke("glObjectLabel", IIIPV);
        caps.glObjectPtrLabel = load.invoke("glObjectPtrLabel", PIPV);
        caps.glPopDebugGroup = load.invoke("glPopDebugGroup", V);
        caps.glPushDebugGroup = load.invoke("glPushDebugGroup", IIIPV);
    }

    public static void glDebugMessageCallback(Addressable callback, Addressable userParam) {
        debugMessageCallback(callback, userParam);
    }

    public static void glDebugMessageCallback(MemorySession scope, GLDebugProc callback, Addressable userParam) {
        debugMessageCallback(scope, callback, userParam);
    }

    public static void glDebugMessageControl(int source, int type, int severity, int count, Addressable ids, boolean enabled) {
        debugMessageControl(source, type, severity, count, ids, enabled);
    }

    public static void glDebugMessageControl(SegmentAllocator allocator, int source, int type, int severity, int count, int[] ids, boolean enabled) {
        debugMessageControl(allocator, source, type, severity, count, ids, enabled);
    }

    public static void glDebugMessageInsert(int source, int type, int id, int severity, int length, Addressable buf) {
        debugMessageInsert(source, type, id, severity, length, buf);
    }

    public static void glDebugMessageInsert(SegmentAllocator allocator, int source, int type, int id, int severity, String buf) {
        debugMessageInsert(allocator, source, type, id, severity, buf);
    }

    public static int glGetDebugMessageLog(int count, int bufSize, Addressable sources, Addressable types, Addressable ids, Addressable severities, Addressable lengths, Addressable messageLog) {
        return getDebugMessageLog(count, bufSize, sources, types, ids, severities, lengths, messageLog);
    }

    public static int glGetDebugMessageLog(int count, MemorySegment sources, MemorySegment types, MemorySegment ids, MemorySegment severities, MemorySegment lengths, MemorySegment messageLog) {
        return getDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
    }

    public static int glGetDebugMessageLog(SegmentAllocator allocator, int count, int bufSize, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, String[] messageLog) {
        return getDebugMessageLog(allocator, count, bufSize, sources, types, ids, severities, lengths, messageLog);
    }

    public static void glGetObjectLabel(int identifier, int name, int bufSize, Addressable length, Addressable label) {
        getObjectLabel(identifier, name, bufSize, length, label);
    }

    public static void glGetObjectLabel(int identifier, int name, Addressable length, MemorySegment label) {
        getObjectLabel(identifier, name, length, label);
    }

    public static String glGetObjectLabel(SegmentAllocator allocator, int identifier, int name, int bufSize, int @Nullable [] length) {
        return getObjectLabel(allocator, identifier, name, bufSize, length);
    }

    public static String glGetObjectLabel(SegmentAllocator allocator, int identifier, int name, int @Nullable [] length) {
        return getObjectLabel(allocator, identifier, name, length);
    }

    public static void glGetObjectPtrLabel(MemoryAddress ptr, int bufSize, Addressable length, Addressable label) {
        getObjectPtrLabel(ptr, bufSize, length, label);
    }

    public static void glGetObjectPtrLabel(MemoryAddress ptr, Addressable length, MemorySegment label) {
        getObjectPtrLabel(ptr, length, label);
    }

    public static String glGetObjectPtrLabel(SegmentAllocator allocator, MemoryAddress ptr, int bufSize, int @Nullable [] length) {
        return getObjectPtrLabel(allocator, ptr, bufSize, length);
    }

    public static String glGetObjectPtrLabel(SegmentAllocator allocator, MemoryAddress ptr, int @Nullable [] length) {
        return getObjectPtrLabel(allocator, ptr, length);
    }

    public static void glGetPointerv(int pname, Addressable params) {
        getPointerv(pname, params);
    }

    public static MemoryAddress glGetPointer(int pname) {
        return getPointer(pname);
    }

    public static void glObjectLabel(int identifier, int name, int length, Addressable label) {
        objectLabel(identifier, name, length, label);
    }

    public static void glObjectLabel(SegmentAllocator allocator, int identifier, int name, String label) {
        objectLabel(allocator, identifier, name, label);
    }

    public static void glObjectPtrLabel(MemoryAddress ptr, int length, Addressable label) {
        objectPtrLabel(ptr, length, label);
    }

    public static void glObjectPtrLabel(SegmentAllocator allocator, MemoryAddress ptr, String label) {
        objectPtrLabel(allocator, ptr, label);
    }

    public static void glPopDebugGroup() {
        popDebugGroup();
    }

    public static void glPushDebugGroup(int source, int id, int length, Addressable message) {
        pushDebugGroup(source, id, length, message);
    }

    public static void glPushDebugGroup(SegmentAllocator allocator, int source, int id, String message) {
        pushDebugGroup(allocator, source, id, message);
    }
}
