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
import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLCaps.check;

/**
 * {@code GL_AMD_debug_output}
 *
 * @author squid233
 * @since 0.1.0
 */
public class GLAMDDebugOutput {
    @Nullable
    public static MethodHandle
        glDebugMessageCallbackAMD, glDebugMessageEnableAMD, glDebugMessageInsertAMD, glGetDebugMessageLogAMD;

    public static void load(GLLoadFunc load) {
        if (!GLExtCaps.GL_AMD_debug_output) return;
        glDebugMessageCallbackAMD = load.invoke("glDebugMessageCallbackAMD", PPV);
        glDebugMessageEnableAMD = load.invoke("glDebugMessageEnableAMD", IIIPZV);
        glDebugMessageInsertAMD = load.invoke("glDebugMessageInsertAMD", IIIIPV);
        glGetDebugMessageLogAMD = load.invoke("glGetDebugMessageLogAMD", IIPPPPPI);
    }

    public static void glDebugMessageCallbackAMD(Addressable callback, Addressable userParam) {
        try {
            check(glDebugMessageCallbackAMD).invoke(callback, userParam);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void glDebugMessageCallbackAMD(MemorySession session, GLDebugProcAMD callback, Addressable userParam) {
        glDebugMessageCallbackAMD(callback.address(session), userParam);
    }

    public static void glDebugMessageEnableAMD(int category, int severity, int count, Addressable ids, boolean enabled) {
        try {
            check(glDebugMessageEnableAMD).invoke(category, severity, count, ids, enabled);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void glDebugMessageEnableAMD(int category, int severity, int[] ids, boolean enabled) {
        try (var session = MemorySession.openShared()) {
            glDebugMessageEnableAMD(category, severity, ids.length, session.allocateArray(JAVA_INT, ids), enabled);
        }
    }

    public static void glDebugMessageInsertAMD(int category, int severity, int id, int length, Addressable buf) {
        try {
            check(glDebugMessageInsertAMD).invoke(category, severity, id, length, buf);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void glDebugMessageInsertAMD(int category, int severity, int id, String buf) {
        try (var session = MemorySession.openShared()) {
            glDebugMessageInsertAMD(category, severity, id, 0, session.allocateUtf8String(buf));
        }
    }

    public static int glGetDebugMessageLogAMD(int count, int bufSize, Addressable categories, Addressable severities, Addressable ids, Addressable lengths, Addressable message) {
        try {
            return (int) check(glGetDebugMessageLogAMD).invoke(count, bufSize, categories, severities, ids, lengths, message);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static int glGetDebugMessageLogAMD(int count, MemorySegment categories, MemorySegment severities, MemorySegment ids, MemorySegment lengths, MemorySegment messageLog) {
        return glGetDebugMessageLogAMD(count, (int) messageLog.byteSize(), categories, severities, ids, lengths, messageLog);
    }

    public static int glGetDebugMessageLogAMD(int count, int bufSize, int[] categories, int[] severities, int[] ids, int[] lengths, String[] messageLog) {
        try (var session = MemorySession.openShared()) {
            var pCgr = session.allocateArray(JAVA_INT, categories.length);
            var pSvr = session.allocateArray(JAVA_INT, severities.length);
            var pIds = session.allocateArray(JAVA_INT, ids.length);
            var pLen = session.allocateArray(JAVA_INT, lengths.length);
            var pLog = session.allocateArray(JAVA_BYTE, bufSize);
            int num = glGetDebugMessageLogAMD(count, bufSize, pCgr, pSvr, pIds, pLen, pLog);
            RuntimeHelper.toArray(pCgr, categories);
            RuntimeHelper.toArray(pSvr, severities);
            RuntimeHelper.toArray(pIds, ids);
            RuntimeHelper.toArray(pLen, lengths);
            messageLog[0] = pLog.getUtf8String(0);
            return num;
        }
    }
}
