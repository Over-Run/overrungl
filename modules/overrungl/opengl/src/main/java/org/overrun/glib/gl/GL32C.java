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
 * The OpenGL 3.2 core profile functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL32C extends GL31C permits GL33C {
    @Nullable
    public static MethodHandle
        glClientWaitSync, glDeleteSync, glDrawElementsBaseVertex, glDrawElementsInstancedBaseVertex,
        glDrawRangeElementsBaseVertex, glFenceSync, glFramebufferTexture, glGetBufferParameteri64v, glGetInteger64i_v,
        glGetInteger64v, glGetMultisamplefv, glGetSynciv, glIsSync, glMultiDrawElementsBaseVertex, glProvokingVertex,
        glSampleMaski, glTexImage2DMultisample, glTexImage3DMultisample, glWaitSync;

    static boolean isSupported() {
        return checkAll(glClientWaitSync, glDeleteSync, glDrawElementsBaseVertex, glDrawElementsInstancedBaseVertex,
            glDrawRangeElementsBaseVertex, glFenceSync, glFramebufferTexture, glGetBufferParameteri64v,
            glGetInteger64i_v, glGetInteger64v, glGetMultisamplefv, glGetSynciv, glIsSync,
            glMultiDrawElementsBaseVertex, glProvokingVertex, glSampleMaski, glTexImage2DMultisample,
            glTexImage3DMultisample, glWaitSync);
    }

    static void load(GLLoadFunc load) {
        glClientWaitSync = load.invoke("glClientWaitSync", PIJI);
        glDeleteSync = load.invoke("glDeleteSync", PV);
        glDrawElementsBaseVertex = load.invoke("glDrawElementsBaseVertex", IIIPIV);
        glDrawElementsInstancedBaseVertex = load.invoke("glDrawElementsInstancedBaseVertex", IIIPIIV);
        glDrawRangeElementsBaseVertex = load.invoke("glDrawRangeElementsBaseVertex", IIIIIPIV);
        glFenceSync = load.invoke("glFenceSync", IIP);
        glFramebufferTexture = load.invoke("glFramebufferTexture", IIIIV);
        glGetBufferParameteri64v = load.invoke("glGetBufferParameteri64v", IIPV);
        glGetInteger64i_v = load.invoke("glGetInteger64i_v", IIPV);
        glGetInteger64v = load.invoke("glGetInteger64v", IPV);
        glGetMultisamplefv = load.invoke("glGetMultisamplefv", IIPV);
        glGetSynciv = load.invoke("glGetSynciv", PIIPPV);
        glIsSync = load.invoke("glIsSync", PZ);
        glMultiDrawElementsBaseVertex = load.invoke("glMultiDrawElementsBaseVertex", IPIPIPV);
        glProvokingVertex = load.invoke("glProvokingVertex", IV);
        glSampleMaski = load.invoke("glSampleMaski", IIV);
        glTexImage2DMultisample = load.invoke("glTexImage2DMultisample", IIIIIZV);
        glTexImage3DMultisample = load.invoke("glTexImage3DMultisample", IIIIIIZV);
        glWaitSync = load.invoke("glWaitSync", PIJV);
    }

    public static int clientWaitSync(MemoryAddress sync, int flags, long timeout) {
        try {
            return (int) check(glClientWaitSync).invoke(sync, flags, timeout);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void deleteSync(MemoryAddress sync) {
        try {
            check(glDeleteSync).invoke(sync);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawElementsBaseVertex(int mode, int count, int type, Addressable indices, int baseVertex) {
        try {
            check(glDrawElementsBaseVertex).invoke(mode, count, type, indices, baseVertex);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawElementsBaseVertex(int mode, int count, int type, byte[] indices, int baseVertex) {
        try (var session = MemorySession.openShared()) {
            drawElementsBaseVertex(mode, count, type, session.allocateArray(JAVA_BYTE, indices), baseVertex);
        }
    }

    public static void drawElementsBaseVertex(int mode, int count, int type, short[] indices, int baseVertex) {
        try (var session = MemorySession.openShared()) {
            drawElementsBaseVertex(mode, count, type, session.allocateArray(JAVA_SHORT, indices), baseVertex);
        }
    }

    public static void drawElementsBaseVertex(int mode, int count, int type, int[] indices, int baseVertex) {
        try (var session = MemorySession.openShared()) {
            drawElementsBaseVertex(mode, count, type, session.allocateArray(JAVA_INT, indices), baseVertex);
        }
    }

    public static void drawElementsInstancedBaseVertex(int mode, int count, int type, Addressable indices, int instanceCount, int baseVertex) {
        try {
            check(glDrawElementsInstancedBaseVertex).invoke(mode, count, type, indices, instanceCount, baseVertex);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawElementsInstancedBaseVertex(int mode, int count, int type, byte[] indices, int instanceCount, int baseVertex) {
        try (var session = MemorySession.openShared()) {
            drawElementsInstancedBaseVertex(mode, count, type, session.allocateArray(JAVA_BYTE, indices), instanceCount, baseVertex);
        }
    }

    public static void drawElementsInstancedBaseVertex(int mode, int count, int type, short[] indices, int instanceCount, int baseVertex) {
        try (var session = MemorySession.openShared()) {
            drawElementsInstancedBaseVertex(mode, count, type, session.allocateArray(JAVA_SHORT, indices), instanceCount, baseVertex);
        }
    }

    public static void drawElementsInstancedBaseVertex(int mode, int count, int type, int[] indices, int instanceCount, int baseVertex) {
        try (var session = MemorySession.openShared()) {
            drawElementsInstancedBaseVertex(mode, count, type, session.allocateArray(JAVA_INT, indices), instanceCount, baseVertex);
        }
    }

    public static void drawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, Addressable indices, int baseVertex) {
        try {
            check(glDrawRangeElementsBaseVertex).invoke(mode, start, end, count, type, indices, baseVertex);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, byte[] indices, int baseVertex) {
        try (var session = MemorySession.openShared()) {
            drawRangeElementsBaseVertex(mode, start, end, count, type, session.allocateArray(JAVA_BYTE, indices), baseVertex);
        }
    }

    public static void drawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, short[] indices, int baseVertex) {
        try (var session = MemorySession.openShared()) {
            drawRangeElementsBaseVertex(mode, start, end, count, type, session.allocateArray(JAVA_SHORT, indices), baseVertex);
        }
    }

    public static void drawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, int[] indices, int baseVertex) {
        try (var session = MemorySession.openShared()) {
            drawRangeElementsBaseVertex(mode, start, end, count, type, session.allocateArray(JAVA_INT, indices), baseVertex);
        }
    }

    public static MemoryAddress fenceSync(int condition, int flags) {
        try {
            return (MemoryAddress) check(glFenceSync).invoke(condition, flags);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void framebufferTexture(int target, int attachment, int texture, int level) {
        try {
            check(glFramebufferTexture).invoke(target, attachment, texture, level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getBufferParameteri64v(int target, int pname, Addressable params) {
        try {
            check(glGetBufferParameteri64v).invoke(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getBufferParameteri64v(int target, int pname, long[] params) {
        params[0] = getBufferParameteri64(target, pname);
    }

    public static long getBufferParameteri64(int target, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_LONG);
            getBufferParameteri64v(target, pname, seg);
            return seg.get(JAVA_LONG, 0);
        }
    }

    public static void getInteger64i_v(int target, int index, Addressable data) {
        try {
            check(glGetInteger64i_v).invoke(target, index, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getInteger64i_v(int target, int index, long[] data) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_LONG, data.length);
            getInteger64i_v(target, index, seg);
            RuntimeHelper.toArray(seg, data);
        }
    }

    public static long getInteger64i(int target, int index) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_LONG);
            getInteger64i_v(target, index, seg);
            return seg.get(JAVA_LONG, 0);
        }
    }

    public static void getInteger64v(int pname, Addressable data) {
        try {
            check(glGetInteger64v).invoke(pname, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getInteger64v(int pname, long[] data) {
        try (var session = MemorySession.openShared()) {
            var pData = session.allocateArray(JAVA_LONG, data.length);
            getInteger64v(pname, pData);
            RuntimeHelper.toArray(pData, data);
        }
    }

    public static long getInteger64(int pname) {
        try (var session = MemorySession.openShared()) {
            var pData = session.allocate(JAVA_LONG);
            getInteger64v(pname, pData);
            return pData.get(JAVA_LONG, 0);
        }
    }

    public static void getMultisamplefv(int pname, int index, Addressable val) {
        try {
            check(glGetMultisamplefv).invoke(pname, index, val);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getMultisamplefv(int pname, int index, float[] val) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, val.length);
            getMultisamplefv(pname, index, seg);
            RuntimeHelper.toArray(seg, val);
        }
    }

    public static float[] getMultisamplefv(int pname, int index) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, 2);
            getMultisamplefv(pname, index, seg);
            return new float[]{seg.get(JAVA_FLOAT, 0), seg.getAtIndex(JAVA_FLOAT, 1)};
        }
    }

    public static void getSynciv(MemoryAddress sync, int pname, int count, Addressable length, Addressable values) {
        try {
            check(glGetSynciv).invoke(sync, pname, count, length, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getSynciv(MemoryAddress sync, int pname, int @Nullable [] length, int[] values) {
        try (var session = MemorySession.openShared()) {
            var pLen = length != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
            var pVal = session.allocateArray(JAVA_INT, values.length);
            getSynciv(sync, pname, values.length, pLen, pVal);
            if (length != null && length.length > 0) {
                length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0);
            }
            RuntimeHelper.toArray(pVal, values);
        }
    }

    public static int getSynci(MemoryAddress sync, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getSynciv(sync, pname, 1, MemoryAddress.NULL, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static boolean isSync(MemoryAddress sync) {
        try {
            return (boolean) check(glIsSync).invoke(sync);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiDrawElementsBaseVertex(int mode, Addressable count, int type, Addressable indices, int drawCount, Addressable baseVertex) {
        try {
            check(glMultiDrawElementsBaseVertex).invoke(mode, count, type, indices, drawCount, baseVertex);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiDrawElementsBaseVertex(int mode, int[] count, int type, Addressable[] indices, int drawCount, int[] baseVertex) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(ADDRESS, indices.length);
            for (int i = 0; i < indices.length; i++) {
                seg.setAtIndex(ADDRESS, i, indices[i]);
            }
            multiDrawElementsBaseVertex(mode, session.allocateArray(JAVA_INT, count), type, seg, drawCount, session.allocateArray(JAVA_INT, baseVertex));
        }
    }

    public static void multiDrawElementsBaseVertex(int mode, int[] count, int type, byte[][] indices, int drawCount, int[] baseVertex) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(ADDRESS, indices.length);
            for (int i = 0; i < indices.length; i++) {
                seg.setAtIndex(ADDRESS, i, session.allocateArray(JAVA_BYTE, indices[i]));
            }
            multiDrawElementsBaseVertex(mode, session.allocateArray(JAVA_INT, count), type, seg, drawCount, session.allocateArray(JAVA_INT, baseVertex));
        }
    }

    public static void multiDrawElementsBaseVertex(int mode, int[] count, int type, short[][] indices, int drawCount, int[] baseVertex) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(ADDRESS, indices.length);
            for (int i = 0; i < indices.length; i++) {
                seg.setAtIndex(ADDRESS, i, session.allocateArray(JAVA_SHORT, indices[i]));
            }
            multiDrawElementsBaseVertex(mode, session.allocateArray(JAVA_INT, count), type, seg, drawCount, session.allocateArray(JAVA_INT, baseVertex));
        }
    }

    public static void multiDrawElementsBaseVertex(int mode, int[] count, int type, int[][] indices, int drawCount, int[] baseVertex) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(ADDRESS, indices.length);
            for (int i = 0; i < indices.length; i++) {
                seg.setAtIndex(ADDRESS, i, session.allocateArray(JAVA_INT, indices[i]));
            }
            multiDrawElementsBaseVertex(mode, session.allocateArray(JAVA_INT, count), type, seg, drawCount, session.allocateArray(JAVA_INT, baseVertex));
        }
    }

    public static void provokingVertex(int mode) {
        try {
            check(glProvokingVertex).invoke(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void sampleMaski(int maskNumber, int mask) {
        try {
            check(glSampleMaski).invoke(maskNumber, mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texImage2DMultisample(int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        try {
            check(glTexImage2DMultisample).invoke(target, samples, internalFormat, width, height, fixedSampleLocations);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texImage3DMultisample(int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        try {
            check(glTexImage3DMultisample).invoke(target, samples, internalFormat, width, height, depth, fixedSampleLocations);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void waitSync(MemoryAddress sync, int flags, long timeout) {
        try {
            check(glWaitSync).invoke(sync, flags, timeout);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }
}
