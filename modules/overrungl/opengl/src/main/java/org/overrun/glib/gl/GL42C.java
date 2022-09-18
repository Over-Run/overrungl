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

package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.RuntimeHelper;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemorySession;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.gl.GLCaps.*;

/**
 * The OpenGL 4.2 core profile functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL42C extends GL41C permits GL {
    @Nullable
    public static MethodHandle
        glBindImageTexture, glDrawArraysInstancedBaseInstance, glDrawElementsInstancedBaseInstance,
        glDrawElementsInstancedBaseVertexBaseInstance, glDrawTransformFeedbackInstanced,
        glDrawTransformFeedbackStreamInstanced, glGetActiveAtomicCounterBufferiv, glGetInternalformativ,
        glMemoryBarrier, glTexStorage1D, glTexStorage2D, glTexStorage3D;

    static boolean isSupported() {
        return checkAll(glBindImageTexture, glDrawArraysInstancedBaseInstance, glDrawElementsInstancedBaseInstance,
            glDrawElementsInstancedBaseVertexBaseInstance, glDrawTransformFeedbackInstanced,
            glDrawTransformFeedbackStreamInstanced, glGetActiveAtomicCounterBufferiv, glGetInternalformativ,
            glMemoryBarrier, glTexStorage1D, glTexStorage2D, glTexStorage3D);
    }

    static void load(GLLoadFunc load) {
        glBindImageTexture = downcallSafe(load.invoke("glBindImageTexture"), dIIIZIIIV);
        glDrawArraysInstancedBaseInstance = downcallSafe(load.invoke("glDrawArraysInstancedBaseInstance"), dIIIIIV);
        glDrawElementsInstancedBaseInstance = downcallSafe(load.invoke("glDrawElementsInstancedBaseInstance"), dIIIPIIV);
        glDrawElementsInstancedBaseVertexBaseInstance = downcallSafe(load.invoke("glDrawElementsInstancedBaseVertexBaseInstance"), dIIIPIIIV);
        glDrawTransformFeedbackInstanced = downcallSafe(load.invoke("glDrawTransformFeedbackInstanced"), dIIIV);
        glDrawTransformFeedbackStreamInstanced = downcallSafe(load.invoke("glDrawTransformFeedbackStreamInstanced"), dIIIIV);
        glGetActiveAtomicCounterBufferiv = downcallSafe(load.invoke("glGetActiveAtomicCounterBufferiv"), dIIIPV);
        glGetInternalformativ = downcallSafe(load.invoke("glGetInternalformativ"), dIIIIPV);
        glMemoryBarrier = downcallSafe(load.invoke("glMemoryBarrier"), dIV);
        glTexStorage1D = downcallSafe(load.invoke("glTexStorage1D"), dIIIIV);
        glTexStorage2D = downcallSafe(load.invoke("glTexStorage2D"), dIIIIIV);
        glTexStorage3D = downcallSafe(load.invoke("glTexStorage3D"), dIIIIIIV);
    }

    public static void bindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
        try {
            check(glBindImageTexture).invoke(unit, texture, level, layered, layer, access, format);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawArraysInstancedBaseInstance(int mode, int first, int count, int instanceCount, int baseInstance) {
        try {
            check(glDrawArraysInstancedBaseInstance).invoke(mode, first, count, instanceCount, baseInstance);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawElementsInstancedBaseInstance(int mode, int count, int type, Addressable indices, int instanceCount, int baseInstance) {
        try {
            check(glDrawElementsInstancedBaseInstance).invoke(mode, count, type, indices, instanceCount, baseInstance);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawElementsInstancedBaseInstance(int mode, int count, int type, byte[] indices, int instanceCount, int baseInstance) {
        try (var session = MemorySession.openShared()) {
            drawElementsInstancedBaseInstance(mode, count, type, session.allocateArray(JAVA_BYTE, indices), instanceCount, baseInstance);
        }
    }

    public static void drawElementsInstancedBaseInstance(int mode, int count, int type, short[] indices, int instanceCount, int baseInstance) {
        try (var session = MemorySession.openShared()) {
            drawElementsInstancedBaseInstance(mode, count, type, session.allocateArray(JAVA_SHORT, indices), instanceCount, baseInstance);
        }
    }

    public static void drawElementsInstancedBaseInstance(int mode, int count, int type, int[] indices, int instanceCount, int baseInstance) {
        try (var session = MemorySession.openShared()) {
            drawElementsInstancedBaseInstance(mode, count, type, session.allocateArray(JAVA_INT, indices), instanceCount, baseInstance);
        }
    }

    public static void drawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, Addressable indices, int instanceCount, int baseVertex, int baseInstance) {
        try {
            check(glDrawElementsInstancedBaseVertexBaseInstance).invoke(mode, count, type, indices, instanceCount, baseVertex, baseInstance);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, byte[] indices, int instanceCount, int baseVertex, int baseInstance) {
        try (var session = MemorySession.openShared()) {
            drawElementsInstancedBaseVertexBaseInstance(mode, count, type, session.allocateArray(JAVA_BYTE, indices), instanceCount, baseVertex, baseInstance);
        }
    }

    public static void drawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, short[] indices, int instanceCount, int baseVertex, int baseInstance) {
        try (var session = MemorySession.openShared()) {
            drawElementsInstancedBaseVertexBaseInstance(mode, count, type, session.allocateArray(JAVA_SHORT, indices), instanceCount, baseVertex, baseInstance);
        }
    }

    public static void drawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, int[] indices, int instanceCount, int baseVertex, int baseInstance) {
        try (var session = MemorySession.openShared()) {
            drawElementsInstancedBaseVertexBaseInstance(mode, count, type, session.allocateArray(JAVA_INT, indices), instanceCount, baseVertex, baseInstance);
        }
    }

    public static void drawTransformFeedbackInstanced(int mode, int id, int instanceCount) {
        try {
            check(glDrawTransformFeedbackInstanced).invoke(mode, id, instanceCount);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawTransformFeedbackStreamInstanced(int mode, int id, int stream, int instanceCount) {
        try {
            check(glDrawTransformFeedbackStreamInstanced).invoke(mode, id, stream, instanceCount);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, Addressable params) {
        try {
            check(glGetActiveAtomicCounterBufferiv).invoke(program, bufferIndex, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params.length);
            getActiveAtomicCounterBufferiv(program, bufferIndex, pname, seg);
            RuntimeHelper.toArray(seg, params);
        }
    }

    public static int getActiveAtomicCounterBufferi(int program, int bufferIndex, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, 1);
            getActiveAtomicCounterBufferiv(program, bufferIndex, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void getInternalformativ(int target, int internalFormat, int pname, int count, Addressable params) {
        try {
            check(glGetInternalformativ).invoke(target, internalFormat, pname, count, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getInternalformativ(int target, int internalFormat, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params.length);
            getInternalformativ(target, internalFormat, pname, params.length, seg);
            RuntimeHelper.toArray(seg, params);
        }
    }

    public static int getInternalformati(int target, int internalFormat, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, 1);
            getInternalformativ(target, internalFormat, pname, 1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void memoryBarrier(int barriers) {
        try {
            check(glMemoryBarrier).invoke(barriers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texStorage1D(int target, int levels, int internalFormat, int width) {
        try {
            check(glTexStorage1D).invoke(target, levels, internalFormat, width);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texStorage2D(int target, int levels, int internalFormat, int width, int height) {
        try {
            check(glTexStorage2D).invoke(target, levels, internalFormat, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texStorage3D(int target, int levels, int internalFormat, int width, int height, int depth) {
        try {
            check(glTexStorage3D).invoke(target, levels, internalFormat, width, height, depth);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }
}
