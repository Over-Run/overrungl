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
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.Addressable;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;
import static org.overrun.glib.gl.GLLoader.checkAll;

/**
 * The OpenGL 3.3 core profile functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL33C extends GL32C permits GL40C {
    @Nullable
    public static MethodHandle
        glBindFragDataLocationIndexed, glBindSampler, glDeleteSamplers, glGenSamplers, glGetFragDataIndex,
        glGetQueryObjecti64v, glGetQueryObjectui64v, glGetSamplerParameterIiv, glGetSamplerParameterIuiv,
        glGetSamplerParameterfv, glGetSamplerParameteriv, glIsSampler, glQueryCounter, glSamplerParameterIiv,
        glSamplerParameterIuiv, glSamplerParameterf, glSamplerParameterfv, glSamplerParameteri, glSamplerParameteriv,
        glVertexAttribDivisor, glVertexAttribP1ui, glVertexAttribP1uiv, glVertexAttribP2ui, glVertexAttribP2uiv,
        glVertexAttribP3ui, glVertexAttribP3uiv, glVertexAttribP4ui, glVertexAttribP4uiv;

    static boolean isSupported() {
        return checkAll(glBindFragDataLocationIndexed, glBindSampler, glDeleteSamplers, glGenSamplers,
            glGetFragDataIndex, glGetQueryObjecti64v, glGetQueryObjectui64v, glGetSamplerParameterIiv,
            glGetSamplerParameterIuiv, glGetSamplerParameterfv, glGetSamplerParameteriv, glIsSampler, glQueryCounter,
            glSamplerParameterIiv, glSamplerParameterIuiv, glSamplerParameterf, glSamplerParameterfv,
            glSamplerParameteri, glSamplerParameteriv, glVertexAttribDivisor, glVertexAttribP1ui, glVertexAttribP1uiv,
            glVertexAttribP2ui, glVertexAttribP2uiv, glVertexAttribP3ui, glVertexAttribP3uiv, glVertexAttribP4ui,
            glVertexAttribP4uiv);
    }

    static void load(GLLoadFunc load) {
        glBindFragDataLocationIndexed = load.invoke("glBindFragDataLocationIndexed", IIIPV);
        glBindSampler = load.invoke("glBindSampler", IIV);
        glDeleteSamplers = load.invoke("glDeleteSamplers", IPV);
        glGenSamplers = load.invoke("glGenSamplers", IIP);
        glGetFragDataIndex = load.invoke("glGetFragDataIndex", IPI);
        glGetQueryObjecti64v = load.invoke("glGetQueryObjecti64v", IIPV);
        glGetQueryObjectui64v = load.invoke("glGetQueryObjectui64v", IIPV);
        glGetSamplerParameterIiv = load.invoke("glGetSamplerParameterIiv", IIPV);
        glGetSamplerParameterIuiv = load.invoke("glGetSamplerParameterIuiv", IIPV);
        glGetSamplerParameterfv = load.invoke("glGetSamplerParameterfv", IIPV);
        glGetSamplerParameteriv = load.invoke("glGetSamplerParameteriv", IIPV);
        glIsSampler = load.invoke("glIsSampler", IZ);
        glQueryCounter = load.invoke("glQueryCounter", IIV);
        glSamplerParameterIiv = load.invoke("glSamplerParameterIiv", IIPV);
        glSamplerParameterIuiv = load.invoke("glSamplerParameterIuiv", IIPV);
        glSamplerParameterf = load.invoke("glSamplerParameterf", IIFV);
        glSamplerParameterfv = load.invoke("glSamplerParameterfv", IIPV);
        glSamplerParameteri = load.invoke("glSamplerParameteri", IIIV);
        glSamplerParameteriv = load.invoke("glSamplerParameteriv", IIPV);
        glVertexAttribDivisor = load.invoke("glVertexAttribDivisor", IIV);
        glVertexAttribP1ui = load.invoke("glVertexAttribP1ui", IIZIV);
        glVertexAttribP1uiv = load.invoke("glVertexAttribP1uiv", IIZPV);
        glVertexAttribP2ui = load.invoke("glVertexAttribP2ui", IIZIV);
        glVertexAttribP2uiv = load.invoke("glVertexAttribP2uiv", IIZPV);
        glVertexAttribP3ui = load.invoke("glVertexAttribP3ui", IIZIV);
        glVertexAttribP3uiv = load.invoke("glVertexAttribP3uiv", IIZPV);
        glVertexAttribP4ui = load.invoke("glVertexAttribP4ui", IIZIV);
        glVertexAttribP4uiv = load.invoke("glVertexAttribP4uiv", IIZPV);
    }

    public static void bindFragDataLocationIndexed(int program, int colorNumber, int index, Addressable name) {
        try {
            check(glBindFragDataLocationIndexed).invokeExact(program, colorNumber, index, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindFragDataLocationIndexed(SegmentAllocator allocator, int program, int colorNumber, int index, String name) {
        bindFragDataLocationIndexed(program, colorNumber, index, allocator.allocateUtf8String(name));
    }

    public static void bindSampler(int unit, int sampler) {
        try {
            check(glBindSampler).invokeExact(unit, sampler);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteSamplers(int count, Addressable samplers) {
        try {
            check(glDeleteSamplers).invokeExact(count, samplers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteSamplers(SegmentAllocator allocator, int[] samplers) {
        deleteSamplers(samplers.length, allocator.allocateArray(JAVA_INT, samplers));
    }

    public static void deleteSampler(int sampler) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var mem = stack.malloc(JAVA_INT);
            mem.set(JAVA_INT, 0, sampler);
            deleteSamplers(1, mem);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void genSamplers(int count, Addressable samplers) {
        try {
            check(glGenSamplers).invokeExact(count, samplers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genSamplers(SegmentAllocator allocator, int[] samplers) {
        var seg = allocator.allocateArray(JAVA_INT, samplers.length);
        genSamplers(samplers.length, seg);
        RuntimeHelper.toArray(seg, samplers);
    }

    public static int genSampler() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            genSamplers(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int getFragDataIndex(int program, Addressable name) {
        try {
            return (int) check(glGetFragDataIndex).invokeExact(program, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getFragDataIndex(SegmentAllocator allocator, int program, String name) {
        return getFragDataIndex(program, allocator.allocateUtf8String(name));
    }

    public static void getQueryObjecti64v(int id, int pname, Addressable params) {
        try {
            check(glGetQueryObjecti64v).invokeExact(id, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static long getQueryObjecti64(int id, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_LONG);
            getQueryObjecti64v(id, pname, seg);
            return seg.get(JAVA_LONG, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getQueryObjectui64v(int id, int pname, Addressable params) {
        try {
            check(glGetQueryObjectui64v).invokeExact(id, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static long getQueryObjectui64(int id, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_LONG);
            getQueryObjectui64v(id, pname, seg);
            return seg.get(JAVA_LONG, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getSamplerParameterIiv(int sampler, int pname, Addressable params) {
        try {
            check(glGetSamplerParameterIiv).invokeExact(sampler, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getSamplerParameterIiv(SegmentAllocator allocator, int sampler, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getSamplerParameterIiv(sampler, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getSamplerParameterIi(int sampler, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getSamplerParameterIiv(sampler, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getSamplerParameterIuiv(int sampler, int pname, Addressable params) {
        try {
            check(glGetSamplerParameterIuiv).invokeExact(sampler, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getSamplerParameterIuiv(SegmentAllocator allocator, int sampler, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getSamplerParameterIuiv(sampler, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getSamplerParameterIui(int sampler, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getSamplerParameterIuiv(sampler, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getSamplerParameterfv(int sampler, int pname, Addressable params) {
        try {
            check(glGetSamplerParameterfv).invokeExact(sampler, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getSamplerParameterfv(SegmentAllocator allocator, int sampler, int pname, float[] params) {
        var seg = allocator.allocateArray(JAVA_FLOAT, params.length);
        getSamplerParameterfv(sampler, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static float getSamplerParameterf(int sampler, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_FLOAT);
            getSamplerParameterfv(sampler, pname, seg);
            return seg.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getSamplerParameteriv(int sampler, int pname, Addressable params) {
        try {
            check(glGetSamplerParameteriv).invokeExact(sampler, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getSamplerParameteriv(SegmentAllocator allocator, int sampler, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getSamplerParameteriv(sampler, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getSamplerParameteri(int sampler, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getSamplerParameteriv(sampler, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean isSampler(int sampler) {
        try {
            return (boolean) check(glIsSampler).invokeExact(sampler);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void queryCounter(int id, int target) {
        try {
            check(glQueryCounter).invokeExact(id, target);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void samplerParameterIiv(int sampler, int pname, Addressable param) {
        try {
            check(glSamplerParameterIiv).invokeExact(sampler, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void samplerParameterIiv(SegmentAllocator allocator, int sampler, int pname, int[] param) {
        samplerParameterIiv(sampler, pname, allocator.allocateArray(JAVA_INT, param));
    }

    public static void samplerParameterIuiv(int sampler, int pname, Addressable param) {
        try {
            check(glSamplerParameterIuiv).invokeExact(sampler, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void samplerParameterIuiv(SegmentAllocator allocator, int sampler, int pname, int[] param) {
        samplerParameterIuiv(sampler, pname, allocator.allocateArray(JAVA_INT, param));
    }

    public static void samplerParameterf(int sampler, int pname, int param) {
        try {
            check(glSamplerParameterf).invokeExact(sampler, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void samplerParameterfv(int sampler, int pname, Addressable param) {
        try {
            check(glSamplerParameterfv).invokeExact(sampler, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void samplerParameterfv(SegmentAllocator allocator, int sampler, int pname, int[] param) {
        samplerParameterfv(sampler, pname, allocator.allocateArray(JAVA_INT, param));
    }

    public static void samplerParameteri(int sampler, int pname, int param) {
        try {
            check(glSamplerParameteri).invokeExact(sampler, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void samplerParameteriv(int sampler, int pname, Addressable param) {
        try {
            check(glSamplerParameteriv).invokeExact(sampler, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void samplerParameteriv(SegmentAllocator allocator, int sampler, int pname, int[] param) {
        samplerParameteriv(sampler, pname, allocator.allocateArray(JAVA_INT, param));
    }

    public static void vertexAttribDivisor(int index, int divisor) {
        try {
            check(glVertexAttribDivisor).invokeExact(index, divisor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribP1ui(int index, int type, boolean normalized, int value) {
        try {
            check(glVertexAttribP1ui).invokeExact(index, type, normalized, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribP1uiv(int index, int type, boolean normalized, Addressable value) {
        try {
            check(glVertexAttribP1uiv).invokeExact(index, type, normalized, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribP1uiv(SegmentAllocator allocator, int index, int type, boolean normalized, int[] value) {
        vertexAttribP1uiv(index, type, normalized, allocator.allocateArray(JAVA_INT, value));
    }

    public static void vertexAttribP2ui(int index, int type, boolean normalized, int value) {
        try {
            check(glVertexAttribP2ui).invokeExact(index, type, normalized, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribP2uiv(int index, int type, boolean normalized, Addressable value) {
        try {
            check(glVertexAttribP2uiv).invokeExact(index, type, normalized, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribP2uiv(SegmentAllocator allocator, int index, int type, boolean normalized, int[] value) {
        vertexAttribP2uiv(index, type, normalized, allocator.allocateArray(JAVA_INT, value));
    }

    public static void vertexAttribP3ui(int index, int type, boolean normalized, int value) {
        try {
            check(glVertexAttribP3ui).invokeExact(index, type, normalized, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribP3uiv(int index, int type, boolean normalized, Addressable value) {
        try {
            check(glVertexAttribP3uiv).invokeExact(index, type, normalized, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribP3uiv(SegmentAllocator allocator, int index, int type, boolean normalized, int[] value) {
        vertexAttribP3uiv(index, type, normalized, allocator.allocateArray(JAVA_INT, value));
    }

    public static void vertexAttribP4ui(int index, int type, boolean normalized, int value) {
        try {
            check(glVertexAttribP4ui).invokeExact(index, type, normalized, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribP4uiv(int index, int type, boolean normalized, Addressable value) {
        try {
            check(glVertexAttribP4uiv).invokeExact(index, type, normalized, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribP4uiv(SegmentAllocator allocator, int index, int type, boolean normalized, int[] value) {
        vertexAttribP4uiv(index, type, normalized, allocator.allocateArray(JAVA_INT, value));
    }
}
