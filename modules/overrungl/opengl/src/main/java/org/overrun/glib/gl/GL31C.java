package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
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
        glCopyBufferSubData,
        glDrawArraysInstanced, glDrawElementsInstanced,
        glGetActiveUniformBlockName, glGetActiveUniformBlockiv,
        glGetActiveUniformName, glGetActiveUniformsiv,
        glGetUniformBlockIndex, glGetUniformIndices,
        glPrimitiveRestartIndex,
        glTexBuffer,
        glUniformBlockBinding;

    static boolean isSupported() {
        return checkAll(glBindBufferBase, glBindBufferRange, glCopyBufferSubData,
            glDrawArraysInstanced, glDrawElementsInstanced, glGetActiveUniformBlockName,
            glGetActiveUniformBlockiv, glGetActiveUniformName, glGetActiveUniformsiv,
            glGetIntegeri_v, glGetUniformBlockIndex, glGetUniformIndices, glPrimitiveRestartIndex,
            glTexBuffer, glUniformBlockBinding);
    }

    static void load(GLLoadFunc load) {
        glBindBufferBase = downcallSafe(load.invoke("glBindBufferBase"), dIIIV);
        glBindBufferRange = downcallSafe(load.invoke("glBindBufferRange"), dIIIJJV);
        glCopyBufferSubData = downcallSafe(load.invoke("glCopyBufferSubData"), dIIJJJV);
        glDrawArraysInstanced = downcallSafe(load.invoke("glDrawArraysInstanced"), dIIIIV);
        glDrawElementsInstanced = downcallSafe(load.invoke("glDrawElementsInstanced"), dIIIPIV);
        glGetActiveUniformBlockName = downcallSafe(load.invoke("glGetActiveUniformBlockName"), dIIIPPV);
        glGetActiveUniformBlockiv = downcallSafe(load.invoke("glGetActiveUniformBlockiv"), dIIIPV);
        glGetActiveUniformName = downcallSafe(load.invoke("glGetActiveUniformName"), dIIIPPV);
        glGetActiveUniformsiv = downcallSafe(load.invoke("glGetActiveUniformsiv"), dIIPIPV);
        glGetIntegeri_v = downcallSafe(load.invoke("glGetIntegeri_v"), dIIPV);
        glGetUniformBlockIndex = downcallSafe(load.invoke("glGetUniformBlockIndex"), dIPI);
        glGetUniformIndices = downcallSafe(load.invoke("glGetUniformIndices"), dIIPPV);
        glPrimitiveRestartIndex = downcallSafe(load.invoke("glPrimitiveRestartIndex"), dIV);
        glTexBuffer = downcallSafe(load.invoke("glTexBuffer"), dIIIV);
        glUniformBlockBinding = downcallSafe(load.invoke("glUniformBlockBinding"), dIIIV);
    }

    public static void copyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
        try {
            check(glCopyBufferSubData).invoke(readTarget, writeTarget, readOffset, writeOffset, size);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void drawArraysInstanced(int mode, int first, int count, int instanceCount) {
        try {
            check(glDrawArraysInstanced).invoke(mode, first, count, instanceCount);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void drawElementsInstanced(int mode, int count, int type, Addressable indices, int instanceCount) {
        try {
            check(glDrawElementsInstanced).invoke(mode, count, type, indices, instanceCount);
        } catch (Throwable e) {
            e.printStackTrace();
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
            e.printStackTrace();
        }
    }

    public static void getActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, int @Nullable [] length, String[] uniformBlockName) {
        try (var session = MemorySession.openShared()) {
            var pLen = length != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
            var pName = session.allocateArray(JAVA_BYTE, bufSize);
            getActiveUniformBlockName(program, uniformBlockIndex, bufSize, pLen, pName);
            if (length != null && length.length > 0) {
                length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0L);
            }
            uniformBlockName[0] = pName.getUtf8String(0L);
        }
    }

    public static String getActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize) {
        try (var session = MemorySession.openShared()) {
            var pName = session.allocateArray(JAVA_BYTE, bufSize);
            getActiveUniformBlockName(program, uniformBlockIndex, bufSize, MemoryAddress.NULL, pName);
            return pName.getUtf8String(0L);
        }
    }

    public static void getActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, Addressable params) {
        try {
            check(glGetActiveUniformBlockiv).invoke(program, uniformBlockIndex, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params.length);
            getActiveUniformBlockiv(program, uniformBlockIndex, pname, seg);
            for (int i = 0; i < params.length; i++) {
                params[i] = seg.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static void getActiveUniformName(int program, int uniformIndex, int bufSize, Addressable length, Addressable uniformName) {
        try {
            check(glGetActiveUniformName).invoke(program, uniformIndex, bufSize, length, uniformName);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getActiveUniformName(int program, int uniformIndex, int bufSize, int @Nullable [] length, String[] uniformName) {
        try (var session = MemorySession.openShared()) {
            var pLen = length != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
            var pName = session.allocateArray(JAVA_BYTE, bufSize);
            getActiveUniformName(program, uniformIndex, bufSize, pLen, pName);
            if (length != null && length.length > 0) {
                length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0L);
            }
            uniformName[0] = pName.getUtf8String(0L);
        }
    }

    public static String getActiveUniformName(int program, int uniformIndex, int bufSize) {
        try (var session = MemorySession.openShared()) {
            var pName = session.allocateArray(JAVA_BYTE, bufSize);
            getActiveUniformName(program, uniformIndex, bufSize, MemoryAddress.NULL, pName);
            return pName.getUtf8String(0L);
        }
    }

    public static void getActiveUniformsiv(int program, int uniformCount, Addressable uniformIndices, int pname, Addressable params) {
        try {
            check(glGetActiveUniformsiv).invoke(program, uniformCount, uniformIndices, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getActiveUniformsiv(int program, int[] uniformIndices, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            final int count = Math.min(uniformIndices.length, params.length);
            var seg = session.allocateArray(JAVA_INT, count);
            getActiveUniformsiv(program, count, session.allocateArray(JAVA_INT, uniformIndices), pname, seg);
            for (int i = 0; i < count; i++) {
                params[i] = seg.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int getActiveUniformi(int program, int uniformIndex, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getActiveUniformsiv(program, 1, session.allocate(JAVA_INT, uniformIndex), pname, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static int getUniformBlockIndex(int program, Addressable uniformBlockName) {
        try {
            return (int) check(glGetUniformBlockIndex).invoke(program, uniformBlockName);
        } catch (Throwable e) {
            e.printStackTrace();
            return GLConstC.GL_INVALID_INDEX;
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
            e.printStackTrace();
        }
    }

    public static void getUniformIndices(int program, String[] uniformNames, int[] uniformIndices) {
        try (var session = MemorySession.openShared()) {
            final int count = Math.min(uniformNames.length, uniformIndices.length);
            var pNames = session.allocateArray(ADDRESS, count);
            for (int i = 0; i < count; i++) {
                pNames.setAtIndex(ADDRESS, i, session.allocateUtf8String(uniformNames[i]));
            }
            var pIndices = session.allocateArray(JAVA_INT, count);
            getUniformIndices(program, count, pNames, pIndices);
            for (int i = 0; i < count; i++) {
                uniformIndices[i] = pIndices.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int getUniformIndex(int program, String uniformName) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getUniformIndices(program, 1, session.allocateUtf8String(uniformName), seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static void primitiveRestartIndex(int index) {
        try {
            check(glPrimitiveRestartIndex).invoke(index);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void texBuffer(int target, int internalFormat, int buffer) {
        try {
            check(glTexBuffer).invoke(target, internalFormat, buffer);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
        try {
            check(glUniformBlockBinding).invoke(program, uniformBlockIndex, uniformBlockBinding);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
