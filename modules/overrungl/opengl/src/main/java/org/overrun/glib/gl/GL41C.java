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
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.*;

/**
 * The OpenGL 4.1 core profile functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL41C extends GL40C permits GL42C {
    static boolean isSupported(GLCapabilities caps) {
        return checkAll(caps.glActiveShaderProgram, caps.glBindProgramPipeline, caps.glClearDepthf, caps.glCreateShaderProgramv, caps.glDeleteProgramPipelines, caps.glDepthRangeArrayv,
            caps.glDepthRangeIndexed, caps.glDepthRangef, caps.glGenProgramPipelines, caps.glGetDoublei_v, caps.glGetFloati_v, caps.glGetProgramBinary,
            caps.glGetProgramPipelineInfoLog, caps.glGetProgramPipelineiv, caps.glGetShaderPrecisionFormat, caps.glGetVertexAttribLdv, caps.glIsProgramPipeline, caps.glProgramBinary,
            caps.glProgramParameteri, caps.glProgramUniform1d, caps.glProgramUniform1dv, caps.glProgramUniform1f, caps.glProgramUniform1fv, caps.glProgramUniform1i,
            caps.glProgramUniform1iv, caps.glProgramUniform1ui, caps.glProgramUniform1uiv, caps.glProgramUniform2d, caps.glProgramUniform2dv, caps.glProgramUniform2f,
            caps.glProgramUniform2fv, caps.glProgramUniform2i, caps.glProgramUniform2iv, caps.glProgramUniform2ui, caps.glProgramUniform2uiv, caps.glProgramUniform3d,
            caps.glProgramUniform3dv, caps.glProgramUniform3f, caps.glProgramUniform3fv, caps.glProgramUniform3i, caps.glProgramUniform3iv, caps.glProgramUniform3ui,
            caps.glProgramUniform3uiv, caps.glProgramUniform4d, caps.glProgramUniform4dv, caps.glProgramUniform4f, caps.glProgramUniform4fv, caps.glProgramUniform4i,
            caps.glProgramUniform4iv, caps.glProgramUniform4ui, caps.glProgramUniform4uiv, caps.glProgramUniformMatrix2dv, caps.glProgramUniformMatrix2fv, caps.glProgramUniformMatrix2x3dv,
            caps.glProgramUniformMatrix2x3fv, caps.glProgramUniformMatrix2x4dv, caps.glProgramUniformMatrix2x4fv, caps.glProgramUniformMatrix3dv, caps.glProgramUniformMatrix3fv, caps.glProgramUniformMatrix3x2dv,
            caps.glProgramUniformMatrix3x2fv, caps.glProgramUniformMatrix3x4dv, caps.glProgramUniformMatrix3x4fv, caps.glProgramUniformMatrix4dv, caps.glProgramUniformMatrix4fv, caps.glProgramUniformMatrix4x2dv,
            caps.glProgramUniformMatrix4x2fv, caps.glProgramUniformMatrix4x3dv, caps.glProgramUniformMatrix4x3fv, caps.glReleaseShaderCompiler, caps.glScissorArrayv, caps.glScissorIndexed,
            caps.glScissorIndexedv, caps.glShaderBinary, caps.glUseProgramStages, caps.glValidateProgramPipeline, caps.glVertexAttribL1d, caps.glVertexAttribL1dv,
            caps.glVertexAttribL2d, caps.glVertexAttribL2dv, caps.glVertexAttribL3d, caps.glVertexAttribL3dv, caps.glVertexAttribL4d, caps.glVertexAttribL4dv,
            caps.glVertexAttribLPointer, caps.glViewportArrayv, caps.glViewportIndexedf, caps.glViewportIndexedfv);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glActiveShaderProgram = load.invoke("glActiveShaderProgram", IIV);
        caps.glBindProgramPipeline = load.invoke("glBindProgramPipeline", IV);
        caps.glClearDepthf = load.invoke("glClearDepthf", FV);
        caps.glCreateShaderProgramv = load.invoke("glCreateShaderProgramv", IIPI);
        caps.glDeleteProgramPipelines = load.invoke("glDeleteProgramPipelines", IPV);
        caps.glDepthRangeArrayv = load.invoke("glDepthRangeArrayv", IIPV);
        caps.glDepthRangeIndexed = load.invoke("glDepthRangeIndexed", IDDV);
        caps.glDepthRangef = load.invoke("glDepthRangef", FFV);
        caps.glGenProgramPipelines = load.invoke("glGenProgramPipelines", IPV);
        caps.glGetDoublei_v = load.invoke("glGetDoublei_v", IIPV);
        caps.glGetFloati_v = load.invoke("glGetFloati_v", IIPV);
        caps.glGetProgramBinary = load.invoke("glGetProgramBinary", IIPPPV);
        caps.glGetProgramPipelineInfoLog = load.invoke("glGetProgramPipelineInfoLog", IIPPV);
        caps.glGetProgramPipelineiv = load.invoke("glGetProgramPipelineiv", IIPV);
        caps.glGetShaderPrecisionFormat = load.invoke("glGetShaderPrecisionFormat", IIPPV);
        caps.glGetVertexAttribLdv = load.invoke("glGetVertexAttribLdv", IIPV);
        caps.glIsProgramPipeline = load.invoke("glIsProgramPipeline", IZ);
        caps.glProgramBinary = load.invoke("glProgramBinary", IIPIV);
        caps.glProgramParameteri = load.invoke("glProgramParameteri", IIIV);
        caps.glProgramUniform1d = load.invoke("glProgramUniform1d", IIDV);
        caps.glProgramUniform1dv = load.invoke("glProgramUniform1dv", IIIPV);
        caps.glProgramUniform1f = load.invoke("glProgramUniform1f", IIFV);
        caps.glProgramUniform1fv = load.invoke("glProgramUniform1fv", IIIPV);
        caps.glProgramUniform1i = load.invoke("glProgramUniform1i", IIIV);
        caps.glProgramUniform1iv = load.invoke("glProgramUniform1iv", IIIPV);
        caps.glProgramUniform1ui = load.invoke("glProgramUniform1ui", IIIV);
        caps.glProgramUniform1uiv = load.invoke("glProgramUniform1uiv", IIIPV);
        caps.glProgramUniform2d = load.invoke("glProgramUniform2d", IIDDV);
        caps.glProgramUniform2dv = load.invoke("glProgramUniform2dv", IIIPV);
        caps.glProgramUniform2f = load.invoke("glProgramUniform2f", IIFFV);
        caps.glProgramUniform2fv = load.invoke("glProgramUniform2fv", IIIPV);
        caps.glProgramUniform2i = load.invoke("glProgramUniform2i", IIIIV);
        caps.glProgramUniform2iv = load.invoke("glProgramUniform2iv", IIIPV);
        caps.glProgramUniform2ui = load.invoke("glProgramUniform2ui", IIIIV);
        caps.glProgramUniform2uiv = load.invoke("glProgramUniform2uiv", IIIPV);
        caps.glProgramUniform3d = load.invoke("glProgramUniform3d", IIDDDV);
        caps.glProgramUniform3dv = load.invoke("glProgramUniform3dv", IIIPV);
        caps.glProgramUniform3f = load.invoke("glProgramUniform3f", IIFFFV);
        caps.glProgramUniform3fv = load.invoke("glProgramUniform3fv", IIIPV);
        caps.glProgramUniform3i = load.invoke("glProgramUniform3i", IIIIIV);
        caps.glProgramUniform3iv = load.invoke("glProgramUniform3iv", IIIPV);
        caps.glProgramUniform3ui = load.invoke("glProgramUniform3ui", IIIIIV);
        caps.glProgramUniform3uiv = load.invoke("glProgramUniform3uiv", IIIPV);
        caps.glProgramUniform4d = load.invoke("glProgramUniform4d", IIDDDDV);
        caps.glProgramUniform4dv = load.invoke("glProgramUniform4dv", IIIPV);
        caps.glProgramUniform4f = load.invoke("glProgramUniform4f", IIFFFFV);
        caps.glProgramUniform4fv = load.invoke("glProgramUniform4fv", IIIPV);
        caps.glProgramUniform4i = load.invoke("glProgramUniform4i", IIIIIIV);
        caps.glProgramUniform4iv = load.invoke("glProgramUniform4iv", IIIPV);
        caps.glProgramUniform4ui = load.invoke("glProgramUniform4ui", IIIIIIV);
        caps.glProgramUniform4uiv = load.invoke("glProgramUniform4uiv", IIIPV);
        caps.glProgramUniformMatrix2dv = load.invoke("glProgramUniformMatrix2dv", IIIZPV);
        caps.glProgramUniformMatrix2fv = load.invoke("glProgramUniformMatrix2fv", IIIZPV);
        caps.glProgramUniformMatrix2x3dv = load.invoke("glProgramUniformMatrix2x3dv", IIIZPV);
        caps.glProgramUniformMatrix2x3fv = load.invoke("glProgramUniformMatrix2x3fv", IIIZPV);
        caps.glProgramUniformMatrix2x4dv = load.invoke("glProgramUniformMatrix2x4dv", IIIZPV);
        caps.glProgramUniformMatrix2x4fv = load.invoke("glProgramUniformMatrix2x4fv", IIIZPV);
        caps.glProgramUniformMatrix3dv = load.invoke("glProgramUniformMatrix3dv", IIIZPV);
        caps.glProgramUniformMatrix3fv = load.invoke("glProgramUniformMatrix3fv", IIIZPV);
        caps.glProgramUniformMatrix3x2dv = load.invoke("glProgramUniformMatrix3x2dv", IIIZPV);
        caps.glProgramUniformMatrix3x2fv = load.invoke("glProgramUniformMatrix3x2fv", IIIZPV);
        caps.glProgramUniformMatrix3x4dv = load.invoke("glProgramUniformMatrix3x4dv", IIIZPV);
        caps.glProgramUniformMatrix3x4fv = load.invoke("glProgramUniformMatrix3x4fv", IIIZPV);
        caps.glProgramUniformMatrix4dv = load.invoke("glProgramUniformMatrix4dv", IIIZPV);
        caps.glProgramUniformMatrix4fv = load.invoke("glProgramUniformMatrix4fv", IIIZPV);
        caps.glProgramUniformMatrix4x2dv = load.invoke("glProgramUniformMatrix4x2dv", IIIZPV);
        caps.glProgramUniformMatrix4x2fv = load.invoke("glProgramUniformMatrix4x2fv", IIIZPV);
        caps.glProgramUniformMatrix4x3dv = load.invoke("glProgramUniformMatrix4x3dv", IIIZPV);
        caps.glProgramUniformMatrix4x3fv = load.invoke("glProgramUniformMatrix4x3fv", IIIZPV);
        caps.glReleaseShaderCompiler = load.invoke("glReleaseShaderCompiler", V);
        caps.glScissorArrayv = load.invoke("glScissorArrayv", IIPV);
        caps.glScissorIndexed = load.invoke("glScissorIndexed", IIIIIV);
        caps.glScissorIndexedv = load.invoke("glScissorIndexedv", IPV);
        caps.glShaderBinary = load.invoke("glShaderBinary", IPIPIV);
        caps.glUseProgramStages = load.invoke("glUseProgramStages", IIIV);
        caps.glValidateProgramPipeline = load.invoke("glValidateProgramPipeline", IV);
        caps.glVertexAttribL1d = load.invoke("glVertexAttribL1d", IDV);
        caps.glVertexAttribL1dv = load.invoke("glVertexAttribL1dv", IPV);
        caps.glVertexAttribL2d = load.invoke("glVertexAttribL2d", IDDV);
        caps.glVertexAttribL2dv = load.invoke("glVertexAttribL2dv", IPV);
        caps.glVertexAttribL3d = load.invoke("glVertexAttribL3d", IDDDV);
        caps.glVertexAttribL3dv = load.invoke("glVertexAttribL3dv", IPV);
        caps.glVertexAttribL4d = load.invoke("glVertexAttribL4d", IDDDDV);
        caps.glVertexAttribL4dv = load.invoke("glVertexAttribL4dv", IPV);
        caps.glVertexAttribLPointer = load.invoke("glVertexAttribLPointer", IIIIPV);
        caps.glViewportArrayv = load.invoke("glViewportArrayv", IIPV);
        caps.glViewportIndexedf = load.invoke("glViewportIndexedf", IFFFFV);
        caps.glViewportIndexedfv = load.invoke("glViewportIndexedfv", IPV);
    }

    public static void activeShaderProgram(int pipeline, int program) {
        var caps = getCapabilities();
        try {
            check(caps.glActiveShaderProgram).invokeExact(pipeline, program);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindProgramPipeline(int pipeline) {
        var caps = getCapabilities();
        try {
            check(caps.glBindProgramPipeline).invokeExact(pipeline);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearDepthf(float d) {
        var caps = getCapabilities();
        try {
            check(caps.glClearDepthf).invokeExact(d);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int createShaderProgramv(int type, int count, Addressable strings) {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glCreateShaderProgramv).invokeExact(type, count, strings);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int createShaderProgramv(SegmentAllocator allocator, int type, String[] strings) {
        var seg = allocator.allocateArray(ADDRESS, strings.length);
        for (int i = 0; i < strings.length; i++) {
            seg.setAtIndex(ADDRESS, i, allocator.allocateUtf8String(strings[i]));
        }
        return createShaderProgramv(type, strings.length, seg);
    }

    public static int createShaderProgram(SegmentAllocator allocator, int type, String string) {
        return createShaderProgramv(type, 1, allocator.allocate(ADDRESS, allocator.allocateUtf8String(string)));
    }

    public static void deleteProgramPipelines(int n, Addressable pipelines) {
        var caps = getCapabilities();
        try {
            check(caps.glDeleteProgramPipelines).invokeExact(n, pipelines);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteProgramPipelines(SegmentAllocator allocator, int[] pipelines) {
        deleteProgramPipelines(pipelines.length, allocator.allocateArray(JAVA_INT, pipelines));
    }

    public static void deleteProgramPipeline(int pipeline) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var mem = stack.malloc(JAVA_INT);
            mem.set(JAVA_INT, 0, pipeline);
            deleteProgramPipelines(1, mem);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void depthRangeArrayv(int first, int count, Addressable v) {
        var caps = getCapabilities();
        try {
            check(caps.glDepthRangeArrayv).invokeExact(first, count, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void depthRangeArrayv(SegmentAllocator allocator, int first, double[] v) {
        depthRangeArrayv(first, v.length, allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void depthRangeIndexed(int index, double n, double f) {
        var caps = getCapabilities();
        try {
            check(caps.glDepthRangeIndexed).invokeExact(index, n, f);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void depthRangef(float n, float f) {
        var caps = getCapabilities();
        try {
            check(caps.glDepthRangef).invokeExact(n, f);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genProgramPipelines(int n, Addressable pipelines) {
        var caps = getCapabilities();
        try {
            check(caps.glGenProgramPipelines).invokeExact(n, pipelines);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genProgramPipelines(SegmentAllocator allocator, int[] pipelines) {
        var seg = allocator.allocateArray(JAVA_INT, pipelines.length);
        genProgramPipelines(pipelines.length, seg);
        RuntimeHelper.toArray(seg, pipelines);
    }

    public static int genProgramPipeline() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            genProgramPipelines(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getDoublei_v(int target, int index, Addressable data) {
        var caps = getCapabilities();
        try {
            check(caps.glGetDoublei_v).invokeExact(target, index, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getDoublei_v(SegmentAllocator allocator, int target, int index, double[] data) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, data.length);
        getDoublei_v(target, index, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static double getDoublei(int target, int index) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_DOUBLE);
            getDoublei_v(target, index, seg);
            return seg.get(JAVA_DOUBLE, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getFloati_v(int target, int index, Addressable data) {
        var caps = getCapabilities();
        try {
            check(caps.glGetFloati_v).invokeExact(target, index, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getFloati_v(SegmentAllocator allocator, int target, int index, float[] data) {
        var seg = allocator.allocateArray(JAVA_FLOAT, data.length);
        getFloati_v(target, index, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static float getFloati(int target, int index) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_FLOAT);
            getFloati_v(target, index, seg);
            return seg.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getProgramBinary(int program, int bufSize, Addressable length, Addressable binaryFormat, Addressable binary) {
        var caps = getCapabilities();
        try {
            check(caps.glGetProgramBinary).invokeExact(program, bufSize, length, binaryFormat, binary);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getProgramBinary(int program, int bufSize, int @Nullable [] length, int[] binaryFormat, Addressable binary) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pl = length != null ? stack.calloc(JAVA_INT) : MemoryAddress.NULL;
            var pf = stack.calloc(JAVA_INT);
            getProgramBinary(program, bufSize, pl, pf, binary);
            if (length != null && length.length > 0) {
                length[0] = pl.get(JAVA_INT, 0);
            }
            binaryFormat[0] = pf.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getProgramBinary(int program, int @Nullable [] length, int[] binaryFormat, MemorySegment binary) {
        getProgramBinary(program, (int) binary.byteSize(), length, binaryFormat, binary);
    }

    public static void getProgramPipelineInfoLog(int pipeline, int bufSize, Addressable length, Addressable infoLog) {
        var caps = getCapabilities();
        try {
            check(caps.glGetProgramPipelineInfoLog).invokeExact(pipeline, bufSize, length, infoLog);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getProgramPipelineInfoLog(SegmentAllocator allocator, int pipeline, int bufSize, int @Nullable [] length, String[] infoLog) {
        var pl = length != null ? allocator.allocate(JAVA_INT) : MemoryAddress.NULL;
        var pi = allocator.allocateArray(JAVA_BYTE, bufSize);
        getProgramPipelineInfoLog(pipeline, bufSize, pl, pi);
        if (length != null && length.length > 0) {
            length[0] = ((MemorySegment) pl).get(JAVA_INT, 0);
        }
        infoLog[0] = pi.getUtf8String(0);
    }

    public static String getProgramPipelineInfoLog(SegmentAllocator allocator, int pipeline) {
        final int sz = getProgramPipelinei(pipeline, GLConstC.GL_INFO_LOG_LENGTH);
        var pi = allocator.allocateArray(JAVA_BYTE, sz);
        getProgramPipelineInfoLog(pipeline, sz, MemoryAddress.NULL, pi);
        return pi.getUtf8String(0);
    }

    public static void getProgramPipelineiv(int pipeline, int pname, Addressable params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetProgramPipelineiv).invokeExact(pipeline, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getProgramPipelinei(int pipeline, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getProgramPipelineiv(pipeline, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getShaderPrecisionFormat(int shaderType, int precisionType, Addressable range, Addressable precision) {
        var caps = getCapabilities();
        try {
            check(caps.glGetShaderPrecisionFormat).invokeExact(shaderType, precisionType, range, precision);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getShaderPrecisionFormat(SegmentAllocator allocator, int shaderType, int precisionType, int[] range, int[] precision) {
        var pr = allocator.allocateArray(JAVA_INT, range.length);
        var pp = allocator.allocate(JAVA_INT);
        getShaderPrecisionFormat(shaderType, precisionType, pr, pp);
        RuntimeHelper.toArray(pr, range);
        precision[0] = pp.get(JAVA_INT, 0);
    }

    public static void getVertexAttribLdv(int index, int pname, Addressable params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetVertexAttribLdv).invokeExact(index, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getVertexAttribLdv(SegmentAllocator allocator, int index, int pname, double[] params) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, params.length);
        getVertexAttribLdv(index, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static boolean isProgramPipeline(int pipeline) {
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glIsProgramPipeline).invokeExact(pipeline);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programBinary(int program, int binaryFormat, Addressable binary, int length) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramBinary).invokeExact(program, binaryFormat, binary, length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programBinary(int program, int binaryFormat, MemorySegment binary) {
        programBinary(program, binaryFormat, binary, (int) binary.byteSize());
    }

    public static void programParameteri(int program, int pname, int value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramParameteri).invokeExact(program, pname, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform1d(int program, int location, double v0) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform1d).invokeExact(program, location, v0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform1dv(int program, int location, int count, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform1dv).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform1dv(SegmentAllocator allocator, int program, int location, double[] value) {
        programUniform1dv(program, location, value.length, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void programUniform1f(int program, int location, float v0) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform1f).invokeExact(program, location, v0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform1fv(int program, int location, int count, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform1fv).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform1fv(SegmentAllocator allocator, int program, int location, float[] value) {
        programUniform1fv(program, location, value.length, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void programUniform1i(int program, int location, int v0) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform1i).invokeExact(program, location, v0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform1iv(int program, int location, int count, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform1iv).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform1iv(SegmentAllocator allocator, int program, int location, int[] value) {
        programUniform1iv(program, location, value.length, allocator.allocateArray(JAVA_INT, value));
    }

    public static void programUniform1ui(int program, int location, int v0) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform1ui).invokeExact(program, location, v0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform1uiv(int program, int location, int count, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform1uiv).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform1uiv(SegmentAllocator allocator, int program, int location, int[] value) {
        programUniform1uiv(program, location, value.length, allocator.allocateArray(JAVA_INT, value));
    }

    public static void programUniform2d(int program, int location, double v0, double v1) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform2d).invokeExact(program, location, v0, v1);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform2dv(int program, int location, int count, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform2dv).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform2dv(SegmentAllocator allocator, int program, int location, double[] value) {
        programUniform2dv(program, location, value.length, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void programUniform2f(int program, int location, float v0, float v1) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform2f).invokeExact(program, location, v0, v1);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform2fv(int program, int location, int count, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform2fv).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform2fv(SegmentAllocator allocator, int program, int location, float[] value) {
        programUniform2fv(program, location, value.length, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void programUniform2i(int program, int location, int v0, int v1) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform2i).invokeExact(program, location, v0, v1);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform2iv(int program, int location, int count, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform2iv).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform2iv(SegmentAllocator allocator, int program, int location, int[] value) {
        programUniform2iv(program, location, value.length, allocator.allocateArray(JAVA_INT, value));
    }

    public static void programUniform2ui(int program, int location, int v0, int v1) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform2ui).invokeExact(program, location, v0, v1);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform2uiv(int program, int location, int count, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform2uiv).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform2uiv(SegmentAllocator allocator, int program, int location, int[] value) {
        programUniform2uiv(program, location, value.length, allocator.allocateArray(JAVA_INT, value));
    }

    public static void programUniform3d(int program, int location, double v0, double v1, double v2) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform3d).invokeExact(program, location, v0, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform3dv(int program, int location, int count, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform3dv).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform3dv(SegmentAllocator allocator, int program, int location, double[] value) {
        programUniform3dv(program, location, value.length, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void programUniform3f(int program, int location, float v0, float v1, float v2) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform3f).invokeExact(program, location, v0, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform3fv(int program, int location, int count, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform3fv).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform3fv(SegmentAllocator allocator, int program, int location, float[] value) {
        programUniform3fv(program, location, value.length, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void programUniform3i(int program, int location, int v0, int v1, int v2) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform3i).invokeExact(program, location, v0, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform3iv(int program, int location, int count, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform3iv).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform3iv(SegmentAllocator allocator, int program, int location, int[] value) {
        programUniform3iv(program, location, value.length, allocator.allocateArray(JAVA_INT, value));
    }

    public static void programUniform3ui(int program, int location, int v0, int v1, int v2) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform3ui).invokeExact(program, location, v0, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform3uiv(int program, int location, int count, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform3uiv).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform3uiv(SegmentAllocator allocator, int program, int location, int[] value) {
        programUniform3uiv(program, location, value.length, allocator.allocateArray(JAVA_INT, value));
    }

    public static void programUniform4d(int program, int location, double v0, double v1, double v2, double v3) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform4d).invokeExact(program, location, v0, v1, v2, v3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform4dv(int program, int location, int count, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform4dv).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform4dv(SegmentAllocator allocator, int program, int location, double[] value) {
        programUniform4dv(program, location, value.length, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void programUniform4f(int program, int location, float v0, float v1, float v2, float v3) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform4f).invokeExact(program, location, v0, v1, v2, v3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform4fv(int program, int location, int count, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform4fv).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform4fv(SegmentAllocator allocator, int program, int location, float[] value) {
        programUniform4fv(program, location, value.length, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void programUniform4i(int program, int location, int v0, int v1, int v2, int v3) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform4i).invokeExact(program, location, v0, v1, v2, v3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform4iv(int program, int location, int count, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform4iv).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform4iv(SegmentAllocator allocator, int program, int location, int[] value) {
        programUniform4iv(program, location, value.length, allocator.allocateArray(JAVA_INT, value));
    }

    public static void programUniform4ui(int program, int location, int v0, int v1, int v2, int v3) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform4ui).invokeExact(program, location, v0, v1, v2, v3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform4uiv(int program, int location, int count, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniform4uiv).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniform4uiv(SegmentAllocator allocator, int program, int location, int[] value) {
        programUniform4uiv(program, location, value.length, allocator.allocateArray(JAVA_INT, value));
    }

    public static void programUniformMatrix2dv(int program, int location, int count, boolean transpose, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniformMatrix2dv).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniformMatrix2dv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, double[] value) {
        programUniformMatrix2dv(program, location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void programUniformMatrix2dv(SegmentAllocator allocator, int program, int location, boolean transpose, double[] value) {
        programUniformMatrix2dv(allocator, program, location, value.length >> 2, transpose, value);
    }

    public static void programUniformMatrix2fv(int program, int location, int count, boolean transpose, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniformMatrix2fv).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniformMatrix2fv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, float[] value) {
        programUniformMatrix2fv(program, location, count, transpose, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void programUniformMatrix2fv(SegmentAllocator allocator, int program, int location, boolean transpose, float[] value) {
        programUniformMatrix2fv(allocator, program, location, value.length >> 2, transpose, value);
    }

    public static void programUniformMatrix2x3dv(int program, int location, int count, boolean transpose, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniformMatrix2x3dv).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniformMatrix2x3dv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, double[] value) {
        programUniformMatrix2x3dv(program, location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void programUniformMatrix2x3dv(SegmentAllocator allocator, int program, int location, boolean transpose, double[] value) {
        programUniformMatrix2x3dv(allocator, program, location, value.length / 6, transpose, value);
    }

    public static void programUniformMatrix2x3fv(int program, int location, int count, boolean transpose, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniformMatrix2x3fv).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniformMatrix2x3fv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, float[] value) {
        programUniformMatrix2x3fv(program, location, count, transpose, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void programUniformMatrix2x3fv(SegmentAllocator allocator, int program, int location, boolean transpose, float[] value) {
        programUniformMatrix2x3fv(allocator, program, location, value.length / 6, transpose, value);
    }

    public static void programUniformMatrix2x4dv(int program, int location, int count, boolean transpose, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniformMatrix2x4dv).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniformMatrix2x4dv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, double[] value) {
        programUniformMatrix2x4dv(program, location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void programUniformMatrix2x4dv(SegmentAllocator allocator, int program, int location, boolean transpose, double[] value) {
        programUniformMatrix2x4dv(allocator, program, location, value.length >> 3, transpose, value);
    }

    public static void programUniformMatrix2x4fv(int program, int location, int count, boolean transpose, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniformMatrix2x4fv).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniformMatrix2x4fv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, float[] value) {
        programUniformMatrix2x4fv(program, location, count, transpose, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void programUniformMatrix2x4fv(SegmentAllocator allocator, int program, int location, boolean transpose, float[] value) {
        programUniformMatrix2x4fv(allocator, program, location, value.length >> 3, transpose, value);
    }

    public static void programUniformMatrix3dv(int program, int location, int count, boolean transpose, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniformMatrix3dv).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniformMatrix3dv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, double[] value) {
        programUniformMatrix3dv(program, location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void programUniformMatrix3dv(SegmentAllocator allocator, int program, int location, boolean transpose, double[] value) {
        programUniformMatrix3dv(allocator, program, location, value.length / 9, transpose, value);
    }

    public static void programUniformMatrix3fv(int program, int location, int count, boolean transpose, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniformMatrix3fv).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniformMatrix3fv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, float[] value) {
        programUniformMatrix3fv(program, location, count, transpose, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void programUniformMatrix3fv(SegmentAllocator allocator, int program, int location, boolean transpose, float[] value) {
        programUniformMatrix3fv(allocator, program, location, value.length / 9, transpose, value);
    }

    public static void programUniformMatrix3x2dv(int program, int location, int count, boolean transpose, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniformMatrix3x2dv).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniformMatrix3x2dv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, double[] value) {
        programUniformMatrix3x2dv(program, location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void programUniformMatrix3x2dv(SegmentAllocator allocator, int program, int location, boolean transpose, double[] value) {
        programUniformMatrix3x2dv(allocator, program, location, value.length / 6, transpose, value);
    }

    public static void programUniformMatrix3x2fv(int program, int location, int count, boolean transpose, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniformMatrix3x2fv).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniformMatrix3x2fv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, float[] value) {
        programUniformMatrix3x2fv(program, location, count, transpose, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void programUniformMatrix3x2fv(SegmentAllocator allocator, int program, int location, boolean transpose, float[] value) {
        programUniformMatrix3x2fv(allocator, program, location, value.length / 6, transpose, value);
    }

    public static void programUniformMatrix3x4dv(int program, int location, int count, boolean transpose, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniformMatrix3x4dv).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniformMatrix3x4dv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, double[] value) {
        programUniformMatrix3x4dv(program, location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void programUniformMatrix3x4dv(SegmentAllocator allocator, int program, int location, boolean transpose, double[] value) {
        programUniformMatrix3x4dv(allocator, program, location, value.length / 12, transpose, value);
    }

    public static void programUniformMatrix3x4fv(int program, int location, int count, boolean transpose, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniformMatrix3x4fv).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniformMatrix3x4fv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, float[] value) {
        programUniformMatrix3x4fv(program, location, count, transpose, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void programUniformMatrix3x4fv(SegmentAllocator allocator, int program, int location, boolean transpose, float[] value) {
        programUniformMatrix3x4fv(allocator, program, location, value.length / 12, transpose, value);
    }

    public static void programUniformMatrix4dv(int program, int location, int count, boolean transpose, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniformMatrix4dv).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniformMatrix4dv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, double[] value) {
        programUniformMatrix4dv(program, location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void programUniformMatrix4dv(SegmentAllocator allocator, int program, int location, boolean transpose, double[] value) {
        programUniformMatrix4dv(allocator, program, location, value.length >> 4, transpose, value);
    }

    public static void programUniformMatrix4fv(int program, int location, int count, boolean transpose, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniformMatrix4fv).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniformMatrix4fv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, float[] value) {
        programUniformMatrix4fv(program, location, count, transpose, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void programUniformMatrix4fv(SegmentAllocator allocator, int program, int location, boolean transpose, float[] value) {
        programUniformMatrix4fv(allocator, program, location, value.length >> 4, transpose, value);
    }

    public static void programUniformMatrix4x2dv(int program, int location, int count, boolean transpose, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniformMatrix4x2dv).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniformMatrix4x2dv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, double[] value) {
        programUniformMatrix4x2dv(program, location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void programUniformMatrix4x2dv(SegmentAllocator allocator, int program, int location, boolean transpose, double[] value) {
        programUniformMatrix4x2dv(allocator, program, location, value.length >> 3, transpose, value);
    }

    public static void programUniformMatrix4x2fv(int program, int location, int count, boolean transpose, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniformMatrix4x2fv).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniformMatrix4x2fv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, float[] value) {
        programUniformMatrix4x2fv(program, location, count, transpose, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void programUniformMatrix4x2fv(SegmentAllocator allocator, int program, int location, boolean transpose, float[] value) {
        programUniformMatrix4x2fv(allocator, program, location, value.length >> 3, transpose, value);
    }

    public static void programUniformMatrix4x3dv(int program, int location, int count, boolean transpose, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniformMatrix4x3dv).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniformMatrix4x3dv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, double[] value) {
        programUniformMatrix4x3dv(program, location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void programUniformMatrix4x3dv(SegmentAllocator allocator, int program, int location, boolean transpose, double[] value) {
        programUniformMatrix4x3dv(allocator, program, location, value.length / 12, transpose, value);
    }

    public static void programUniformMatrix4x3fv(int program, int location, int count, boolean transpose, Addressable value) {
        var caps = getCapabilities();
        try {
            check(caps.glProgramUniformMatrix4x3fv).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void programUniformMatrix4x3fv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, float[] value) {
        programUniformMatrix4x3fv(program, location, count, transpose, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void programUniformMatrix4x3fv(SegmentAllocator allocator, int program, int location, boolean transpose, float[] value) {
        programUniformMatrix4x3fv(allocator, program, location, value.length / 12, transpose, value);
    }

    public static void releaseShaderCompiler() {
        var caps = getCapabilities();
        try {
            check(caps.glReleaseShaderCompiler).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void scissorArrayv(int first, int count, Addressable v) {
        var caps = getCapabilities();
        try {
            check(caps.glScissorArrayv).invokeExact(first, count, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void scissorArrayv(SegmentAllocator allocator, int first, int count, int[] v) {
        scissorArrayv(first, count, allocator.allocateArray(JAVA_INT, v));
    }

    public static void scissorIndexed(int index, int left, int bottom, int width, int height) {
        var caps = getCapabilities();
        try {
            check(caps.glScissorIndexed).invokeExact(index, left, bottom, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void scissorIndexedv(int index, Addressable v) {
        var caps = getCapabilities();
        try {
            check(caps.glScissorIndexedv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void scissorIndexedv(SegmentAllocator allocator, int index, int[] v) {
        scissorIndexedv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void shaderBinary(int count, Addressable shaders, int binaryFormat, Addressable binary, int length) {
        var caps = getCapabilities();
        try {
            check(caps.glShaderBinary).invokeExact(count, shaders, binaryFormat, binary, length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void shaderBinary(SegmentAllocator allocator, int[] shaders, int binaryFormat, Addressable binary, int length) {
        shaderBinary(shaders.length, allocator.allocateArray(JAVA_INT, shaders), binaryFormat, binary, length);
    }

    public static void shaderBinary(SegmentAllocator allocator, int[] shaders, int binaryFormat, MemorySegment binary) {
        shaderBinary(allocator, shaders, binaryFormat, binary, (int) binary.byteSize());
    }

    public static void useProgramStages(int pipeline, int stages, int program) {
        var caps = getCapabilities();
        try {
            check(caps.glUseProgramStages).invokeExact(pipeline, stages, program);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void validateProgramPipeline(int pipeline) {
        var caps = getCapabilities();
        try {
            check(caps.glValidateProgramPipeline).invokeExact(pipeline);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribL1d(int index, double x) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribL1d).invokeExact(index, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribL1dv(int index, Addressable v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribL1dv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribL1dv(SegmentAllocator allocator, int index, double[] v) {
        vertexAttribL1dv(index, allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void vertexAttribL2d(int index, double x, double y) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribL2d).invokeExact(index, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribL2dv(int index, Addressable v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribL2dv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribL2dv(SegmentAllocator allocator, int index, double[] v) {
        vertexAttribL2dv(index, allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void vertexAttribL3d(int index, double x, double y, double z) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribL3d).invokeExact(index, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribL3dv(int index, Addressable v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribL3dv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribL3dv(SegmentAllocator allocator, int index, double[] v) {
        vertexAttribL3dv(index, allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void vertexAttribL4d(int index, double x, double y, double z, double w) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribL4d).invokeExact(index, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribL4dv(int index, Addressable v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribL4dv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribL4dv(SegmentAllocator allocator, int index, double[] v) {
        vertexAttribL4dv(index, allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void vertexAttribLPointer(int index, int size, int type, int stride, Addressable pointer) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribLPointer).invokeExact(index, size, type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribLPointer(SegmentAllocator allocator, int index, int size, int type, int stride, double[] pointer) {
        vertexAttribLPointer(index, size, type, stride, allocator.allocateArray(JAVA_DOUBLE, pointer));
    }

    public static void viewportArrayv(int first, int count, Addressable v) {
        var caps = getCapabilities();
        try {
            check(caps.glViewportArrayv).invokeExact(first, count, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void viewportArrayv(SegmentAllocator allocator, int first, int count, float[] v) {
        viewportArrayv(first, count, allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void viewportIndexedf(int index, float x, float y, float w, float h) {
        var caps = getCapabilities();
        try {
            check(caps.glViewportIndexedf).invokeExact(index, x, y, w, h);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void viewportIndexedfv(int index, Addressable v) {
        var caps = getCapabilities();
        try {
            check(caps.glViewportIndexedfv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void viewportIndexedfv(SegmentAllocator allocator, int index, float[] v) {
        viewportIndexedfv(index, allocator.allocateArray(JAVA_FLOAT, v));
    }
}
