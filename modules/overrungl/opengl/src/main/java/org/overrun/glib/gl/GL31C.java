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
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLCaps.*;

/**
 * The OpenGL 3.1 core profile functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL31C extends GL30C permits GL32C {
    @Nullable
    public static MethodHandle
        glCopyBufferSubData, glDrawArraysInstanced, glDrawElementsInstanced, glGetActiveUniformBlockName,
        glGetActiveUniformBlockiv, glGetActiveUniformName, glGetActiveUniformsiv, glGetUniformBlockIndex,
        glGetUniformIndices, glPrimitiveRestartIndex, glTexBuffer, glUniformBlockBinding;

    static boolean isSupported() {
        return checkAll(glBindBufferBase, glBindBufferRange, glCopyBufferSubData, glDrawArraysInstanced,
            glDrawElementsInstanced, glGetActiveUniformBlockName, glGetActiveUniformBlockiv, glGetActiveUniformName,
            glGetActiveUniformsiv, glGetIntegeri_v, glGetUniformBlockIndex, glGetUniformIndices,
            glPrimitiveRestartIndex, glTexBuffer, glUniformBlockBinding);
    }

    static void load(GLLoadFunc load) {
        glBindBufferBase = load.invoke("glBindBufferBase", IIIV);
        glBindBufferRange = load.invoke("glBindBufferRange", IIIJJV);
        glCopyBufferSubData = load.invoke("glCopyBufferSubData", IIJJJV);
        glDrawArraysInstanced = load.invoke("glDrawArraysInstanced", IIIIV);
        glDrawElementsInstanced = load.invoke("glDrawElementsInstanced", IIIPIV);
        glGetActiveUniformBlockName = load.invoke("glGetActiveUniformBlockName", IIIPPV);
        glGetActiveUniformBlockiv = load.invoke("glGetActiveUniformBlockiv", IIIPV);
        glGetActiveUniformName = load.invoke("glGetActiveUniformName", IIIPPV);
        glGetActiveUniformsiv = load.invoke("glGetActiveUniformsiv", IIPIPV);
        glGetIntegeri_v = load.invoke("glGetIntegeri_v", IIPV);
        glGetUniformBlockIndex = load.invoke("glGetUniformBlockIndex", IPI);
        glGetUniformIndices = load.invoke("glGetUniformIndices", IIPPV);
        glPrimitiveRestartIndex = load.invoke("glPrimitiveRestartIndex", IV);
        glTexBuffer = load.invoke("glTexBuffer", IIIV);
        glUniformBlockBinding = load.invoke("glUniformBlockBinding", IIIV);
    }

    public static void copyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
        try {
            check(glCopyBufferSubData).invoke(readTarget, writeTarget, readOffset, writeOffset, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawArraysInstanced(int mode, int first, int count, int instanceCount) {
        try {
            check(glDrawArraysInstanced).invoke(mode, first, count, instanceCount);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawElementsInstanced(int mode, int count, int type, Addressable indices, int instanceCount) {
        try {
            check(glDrawElementsInstanced).invoke(mode, count, type, indices, instanceCount);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawElementsInstanced(int mode, int count, int type, byte[] indices, int instanceCount) {
        try (var session = MemorySession.openShared()) {
            drawElementsInstanced(mode, count, type, session.allocateArray(JAVA_BYTE, indices), instanceCount);
        }
    }

    public static void drawElementsInstanced(int mode, int count, int type, short[] indices, int instanceCount) {
        try (var session = MemorySession.openShared()) {
            drawElementsInstanced(mode, count, type, session.allocateArray(JAVA_SHORT, indices), instanceCount);
        }
    }

    public static void drawElementsInstanced(int mode, int count, int type, int[] indices, int instanceCount) {
        try (var session = MemorySession.openShared()) {
            drawElementsInstanced(mode, count, type, session.allocateArray(JAVA_INT, indices), instanceCount);
        }
    }

    public static void getActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, Addressable length, Addressable uniformBlockName) {
        try {
            check(glGetActiveUniformBlockName).invoke(program, uniformBlockIndex, bufSize, length, uniformBlockName);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, int @Nullable [] length, String[] uniformBlockName) {
        try (var session = MemorySession.openShared()) {
            var pLen = length != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
            var pName = session.allocateArray(JAVA_BYTE, bufSize);
            getActiveUniformBlockName(program, uniformBlockIndex, bufSize, pLen, pName);
            if (length != null && length.length > 0) {
                length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0);
            }
            uniformBlockName[0] = pName.getUtf8String(0);
        }
    }

    public static String getActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize) {
        try (var session = MemorySession.openShared()) {
            var pName = session.allocateArray(JAVA_BYTE, bufSize);
            getActiveUniformBlockName(program, uniformBlockIndex, bufSize, MemoryAddress.NULL, pName);
            return pName.getUtf8String(0);
        }
    }

    public static void getActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, Addressable params) {
        try {
            check(glGetActiveUniformBlockiv).invoke(program, uniformBlockIndex, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params.length);
            getActiveUniformBlockiv(program, uniformBlockIndex, pname, seg);
            RuntimeHelper.toArray(seg, params);
        }
    }

    public static void getActiveUniformName(int program, int uniformIndex, int bufSize, Addressable length, Addressable uniformName) {
        try {
            check(glGetActiveUniformName).invoke(program, uniformIndex, bufSize, length, uniformName);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getActiveUniformName(int program, int uniformIndex, int bufSize, int @Nullable [] length, String[] uniformName) {
        try (var session = MemorySession.openShared()) {
            var pLen = length != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
            var pName = session.allocateArray(JAVA_BYTE, bufSize);
            getActiveUniformName(program, uniformIndex, bufSize, pLen, pName);
            if (length != null && length.length > 0) {
                length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0);
            }
            uniformName[0] = pName.getUtf8String(0);
        }
    }

    public static String getActiveUniformName(int program, int uniformIndex, int bufSize) {
        try (var session = MemorySession.openShared()) {
            var pName = session.allocateArray(JAVA_BYTE, bufSize);
            getActiveUniformName(program, uniformIndex, bufSize, MemoryAddress.NULL, pName);
            return pName.getUtf8String(0);
        }
    }

    public static void getActiveUniformsiv(int program, int uniformCount, Addressable uniformIndices, int pname, Addressable params) {
        try {
            check(glGetActiveUniformsiv).invoke(program, uniformCount, uniformIndices, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getActiveUniformsiv(int program, int[] uniformIndices, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            final int count = uniformIndices.length;
            var seg = session.allocateArray(JAVA_INT, count);
            getActiveUniformsiv(program, count, session.allocateArray(JAVA_INT, uniformIndices), pname, seg);
            RuntimeHelper.toArray(seg, params);
        }
    }

    public static int getActiveUniformi(int program, int uniformIndex, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getActiveUniformsiv(program, 1, session.allocate(JAVA_INT, uniformIndex), pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static int getUniformBlockIndex(int program, Addressable uniformBlockName) {
        try {
            return (int) check(glGetUniformBlockIndex).invoke(program, uniformBlockName);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static int getUniformBlockIndex(int program, String uniformBlockName) {
        try (var session = MemorySession.openShared()) {
            return getUniformBlockIndex(program, session.allocateUtf8String(uniformBlockName));
        }
    }

    public static void getUniformIndices(int program, int uniformCount, Addressable uniformNames, Addressable uniformIndices) {
        try {
            check(glGetUniformIndices).invoke(program, uniformCount, uniformNames, uniformIndices);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getUniformIndices(int program, String[] uniformNames, int[] uniformIndices) {
        try (var session = MemorySession.openShared()) {
            final int count = uniformNames.length;
            var pNames = session.allocateArray(ADDRESS, count);
            for (int i = 0; i < count; i++) {
                pNames.setAtIndex(ADDRESS, i, session.allocateUtf8String(uniformNames[i]));
            }
            var pIndices = session.allocateArray(JAVA_INT, count);
            getUniformIndices(program, count, pNames, pIndices);
            RuntimeHelper.toArray(pIndices, uniformIndices);
        }
    }

    public static int getUniformIndex(int program, String uniformName) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getUniformIndices(program, 1, session.allocateUtf8String(uniformName), seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void primitiveRestartIndex(int index) {
        try {
            check(glPrimitiveRestartIndex).invoke(index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texBuffer(int target, int internalFormat, int buffer) {
        try {
            check(glTexBuffer).invoke(target, internalFormat, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
        try {
            check(glUniformBlockBinding).invoke(program, uniformBlockIndex, uniformBlockBinding);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }
}
