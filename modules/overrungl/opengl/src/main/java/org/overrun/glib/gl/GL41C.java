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
import java.lang.foreign.MemorySession;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLCaps.check;
import static org.overrun.glib.gl.GLCaps.checkAll;

/**
 * The OpenGL 4.1 core profile functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL41C extends GL40C permits GL42C {
    @Nullable
    public static MethodHandle
        glActiveShaderProgram, glBindProgramPipeline, glClearDepthf, glCreateShaderProgramv, glDeleteProgramPipelines,
        glDepthRangeArrayv, glDepthRangeIndexed, glDepthRangef, glGenProgramPipelines, glGetDoublei_v, glGetFloati_v,
        glGetProgramBinary, glGetProgramPipelineInfoLog, glGetProgramPipelineiv, glGetShaderPrecisionFormat,
        glGetVertexAttribLdv, glIsProgramPipeline, glProgramBinary, glProgramParameteri, glProgramUniform1d,
        glProgramUniform1dv, glProgramUniform1f, glProgramUniform1fv, glProgramUniform1i, glProgramUniform1iv,
        glProgramUniform1ui, glProgramUniform1uiv, glProgramUniform2d, glProgramUniform2dv, glProgramUniform2f,
        glProgramUniform2fv, glProgramUniform2i, glProgramUniform2iv, glProgramUniform2ui, glProgramUniform2uiv,
        glProgramUniform3d, glProgramUniform3dv, glProgramUniform3f, glProgramUniform3fv, glProgramUniform3i,
        glProgramUniform3iv, glProgramUniform3ui, glProgramUniform3uiv, glProgramUniform4d, glProgramUniform4dv,
        glProgramUniform4f, glProgramUniform4fv, glProgramUniform4i, glProgramUniform4iv, glProgramUniform4ui,
        glProgramUniform4uiv, glProgramUniformMatrix2dv, glProgramUniformMatrix2fv, glProgramUniformMatrix2x3dv,
        glProgramUniformMatrix2x3fv, glProgramUniformMatrix2x4dv, glProgramUniformMatrix2x4fv,
        glProgramUniformMatrix3dv, glProgramUniformMatrix3fv, glProgramUniformMatrix3x2dv, glProgramUniformMatrix3x2fv,
        glProgramUniformMatrix3x4dv, glProgramUniformMatrix3x4fv, glProgramUniformMatrix4dv, glProgramUniformMatrix4fv,
        glProgramUniformMatrix4x2dv, glProgramUniformMatrix4x2fv, glProgramUniformMatrix4x3dv,
        glProgramUniformMatrix4x3fv, glReleaseShaderCompiler, glScissorArrayv, glScissorIndexed, glScissorIndexedv,
        glShaderBinary, glUseProgramStages, glValidateProgramPipeline, glVertexAttribL1d, glVertexAttribL1dv,
        glVertexAttribL2d, glVertexAttribL2dv, glVertexAttribL3d, glVertexAttribL3dv, glVertexAttribL4d,
        glVertexAttribL4dv, glVertexAttribLPointer, glViewportArrayv, glViewportIndexedf, glViewportIndexedfv;

    static boolean isSupported() {
        return checkAll(glActiveShaderProgram, glBindProgramPipeline, glClearDepthf, glCreateShaderProgramv,
            glDeleteProgramPipelines, glDepthRangeArrayv, glDepthRangeIndexed, glDepthRangef, glGenProgramPipelines,
            glGetDoublei_v, glGetFloati_v, glGetProgramBinary, glGetProgramPipelineInfoLog, glGetProgramPipelineiv,
            glGetShaderPrecisionFormat, glGetVertexAttribLdv, glIsProgramPipeline, glProgramBinary, glProgramParameteri,
            glProgramUniform1d, glProgramUniform1dv, glProgramUniform1f, glProgramUniform1fv, glProgramUniform1i,
            glProgramUniform1iv, glProgramUniform1ui, glProgramUniform1uiv, glProgramUniform2d, glProgramUniform2dv,
            glProgramUniform2f, glProgramUniform2fv, glProgramUniform2i, glProgramUniform2iv, glProgramUniform2ui,
            glProgramUniform2uiv, glProgramUniform3d, glProgramUniform3dv, glProgramUniform3f, glProgramUniform3fv,
            glProgramUniform3i, glProgramUniform3iv, glProgramUniform3ui, glProgramUniform3uiv, glProgramUniform4d,
            glProgramUniform4dv, glProgramUniform4f, glProgramUniform4fv, glProgramUniform4i, glProgramUniform4iv,
            glProgramUniform4ui, glProgramUniform4uiv, glProgramUniformMatrix2dv, glProgramUniformMatrix2fv,
            glProgramUniformMatrix2x3dv, glProgramUniformMatrix2x3fv, glProgramUniformMatrix2x4dv,
            glProgramUniformMatrix2x4fv, glProgramUniformMatrix3dv, glProgramUniformMatrix3fv,
            glProgramUniformMatrix3x2dv, glProgramUniformMatrix3x2fv, glProgramUniformMatrix3x4dv,
            glProgramUniformMatrix3x4fv, glProgramUniformMatrix4dv, glProgramUniformMatrix4fv,
            glProgramUniformMatrix4x2dv, glProgramUniformMatrix4x2fv, glProgramUniformMatrix4x3dv,
            glProgramUniformMatrix4x3fv, glReleaseShaderCompiler, glScissorArrayv, glScissorIndexed, glScissorIndexedv,
            glShaderBinary, glUseProgramStages, glValidateProgramPipeline, glVertexAttribL1d, glVertexAttribL1dv,
            glVertexAttribL2d, glVertexAttribL2dv, glVertexAttribL3d, glVertexAttribL3dv, glVertexAttribL4d,
            glVertexAttribL4dv, glVertexAttribLPointer, glViewportArrayv, glViewportIndexedf, glViewportIndexedfv);
    }

    static void load(GLLoadFunc load) {
        glActiveShaderProgram = load.invoke("glActiveShaderProgram", IIV);
        glBindProgramPipeline = load.invoke("glBindProgramPipeline", IV);
        glClearDepthf = load.invoke("glClearDepthf", FV);
        glCreateShaderProgramv = load.invoke("glCreateShaderProgramv", IIPI);
        glDeleteProgramPipelines = load.invoke("glDeleteProgramPipelines", IPV);
        glDepthRangeArrayv = load.invoke("glDepthRangeArrayv", IIPV);
        glDepthRangeIndexed = load.invoke("glDepthRangeIndexed", IDDV);
        glDepthRangef = load.invoke("glDepthRangef", FFV);
        glGenProgramPipelines = load.invoke("glGenProgramPipelines", IPV);
        glGetDoublei_v = load.invoke("glGetDoublei_v", IIPV);
        glGetFloati_v = load.invoke("glGetFloati_v", IIPV);
        glGetProgramBinary = load.invoke("glGetProgramBinary", IIPPPV);
        glGetProgramPipelineInfoLog = load.invoke("glGetProgramPipelineInfoLog", IIPPV);
        glGetProgramPipelineiv = load.invoke("glGetProgramPipelineiv", IIPV);
        glGetShaderPrecisionFormat = load.invoke("glGetShaderPrecisionFormat", IIPPV);
        glGetVertexAttribLdv = load.invoke("glGetVertexAttribLdv", IIPV);
        glIsProgramPipeline = load.invoke("glIsProgramPipeline", IZ);
        glProgramBinary = load.invoke("glProgramBinary", IIPIV);
        glProgramParameteri = load.invoke("glProgramParameteri", IIIV);
        glProgramUniform1d = load.invoke("glProgramUniform1d", IIDV);
        glProgramUniform1dv = load.invoke("glProgramUniform1dv", IIIPV);
        glProgramUniform1f = load.invoke("glProgramUniform1f", IIFV);
        glProgramUniform1fv = load.invoke("glProgramUniform1fv", IIIPV);
        glProgramUniform1i = load.invoke("glProgramUniform1i", IIIV);
        glProgramUniform1iv = load.invoke("glProgramUniform1iv", IIIPV);
        glProgramUniform1ui = load.invoke("glProgramUniform1ui", IIIV);
        glProgramUniform1uiv = load.invoke("glProgramUniform1uiv", IIIPV);
        glProgramUniform2d = load.invoke("glProgramUniform2d", IIDDV);
        glProgramUniform2dv = load.invoke("glProgramUniform2dv", IIIPV);
        glProgramUniform2f = load.invoke("glProgramUniform2f", IIFFV);
        glProgramUniform2fv = load.invoke("glProgramUniform2fv", IIIPV);
        glProgramUniform2i = load.invoke("glProgramUniform2i", IIIIV);
        glProgramUniform2iv = load.invoke("glProgramUniform2iv", IIIPV);
        glProgramUniform2ui = load.invoke("glProgramUniform2ui", IIIIV);
        glProgramUniform2uiv = load.invoke("glProgramUniform2uiv", IIIPV);
        glProgramUniform3d = load.invoke("glProgramUniform3d", IIDDDV);
        glProgramUniform3dv = load.invoke("glProgramUniform3dv", IIIPV);
        glProgramUniform3f = load.invoke("glProgramUniform3f", IIFFFV);
        glProgramUniform3fv = load.invoke("glProgramUniform3fv", IIIPV);
        glProgramUniform3i = load.invoke("glProgramUniform3i", IIIIIV);
        glProgramUniform3iv = load.invoke("glProgramUniform3iv", IIIPV);
        glProgramUniform3ui = load.invoke("glProgramUniform3ui", IIIIIV);
        glProgramUniform3uiv = load.invoke("glProgramUniform3uiv", IIIPV);
        glProgramUniform4d = load.invoke("glProgramUniform4d", IIDDDDV);
        glProgramUniform4dv = load.invoke("glProgramUniform4dv", IIIPV);
        glProgramUniform4f = load.invoke("glProgramUniform4f", IIFFFFV);
        glProgramUniform4fv = load.invoke("glProgramUniform4fv", IIIPV);
        glProgramUniform4i = load.invoke("glProgramUniform4i", IIIIIIV);
        glProgramUniform4iv = load.invoke("glProgramUniform4iv", IIIPV);
        glProgramUniform4ui = load.invoke("glProgramUniform4ui", IIIIIIV);
        glProgramUniform4uiv = load.invoke("glProgramUniform4uiv", IIIPV);
        glProgramUniformMatrix2dv = load.invoke("glProgramUniformMatrix2dv", IIIZPV);
        glProgramUniformMatrix2fv = load.invoke("glProgramUniformMatrix2fv", IIIZPV);
        glProgramUniformMatrix2x3dv = load.invoke("glProgramUniformMatrix2x3dv", IIIZPV);
        glProgramUniformMatrix2x3fv = load.invoke("glProgramUniformMatrix2x3fv", IIIZPV);
        glProgramUniformMatrix2x4dv = load.invoke("glProgramUniformMatrix2x4dv", IIIZPV);
        glProgramUniformMatrix2x4fv = load.invoke("glProgramUniformMatrix2x4fv", IIIZPV);
        glProgramUniformMatrix3dv = load.invoke("glProgramUniformMatrix3dv", IIIZPV);
        glProgramUniformMatrix3fv = load.invoke("glProgramUniformMatrix3fv", IIIZPV);
        glProgramUniformMatrix3x2dv = load.invoke("glProgramUniformMatrix3x2dv", IIIZPV);
        glProgramUniformMatrix3x2fv = load.invoke("glProgramUniformMatrix3x2fv", IIIZPV);
        glProgramUniformMatrix3x4dv = load.invoke("glProgramUniformMatrix3x4dv", IIIZPV);
        glProgramUniformMatrix3x4fv = load.invoke("glProgramUniformMatrix3x4fv", IIIZPV);
        glProgramUniformMatrix4dv = load.invoke("glProgramUniformMatrix4dv", IIIZPV);
        glProgramUniformMatrix4fv = load.invoke("glProgramUniformMatrix4fv", IIIZPV);
        glProgramUniformMatrix4x2dv = load.invoke("glProgramUniformMatrix4x2dv", IIIZPV);
        glProgramUniformMatrix4x2fv = load.invoke("glProgramUniformMatrix4x2fv", IIIZPV);
        glProgramUniformMatrix4x3dv = load.invoke("glProgramUniformMatrix4x3dv", IIIZPV);
        glProgramUniformMatrix4x3fv = load.invoke("glProgramUniformMatrix4x3fv", IIIZPV);
        glReleaseShaderCompiler = load.invoke("glReleaseShaderCompiler", V);
        glScissorArrayv = load.invoke("glScissorArrayv", IIPV);
        glScissorIndexed = load.invoke("glScissorIndexed", IIIIIV);
        glScissorIndexedv = load.invoke("glScissorIndexedv", IPV);
        glShaderBinary = load.invoke("glShaderBinary", IPIPIV);
        glUseProgramStages = load.invoke("glUseProgramStages", IIIV);
        glValidateProgramPipeline = load.invoke("glValidateProgramPipeline", IV);
        glVertexAttribL1d = load.invoke("glVertexAttribL1d", IDV);
        glVertexAttribL1dv = load.invoke("glVertexAttribL1dv", IPV);
        glVertexAttribL2d = load.invoke("glVertexAttribL2d", IDDV);
        glVertexAttribL2dv = load.invoke("glVertexAttribL2dv", IPV);
        glVertexAttribL3d = load.invoke("glVertexAttribL3d", IDDDV);
        glVertexAttribL3dv = load.invoke("glVertexAttribL3dv", IPV);
        glVertexAttribL4d = load.invoke("glVertexAttribL4d", IDDDDV);
        glVertexAttribL4dv = load.invoke("glVertexAttribL4dv", IPV);
        glVertexAttribLPointer = load.invoke("glVertexAttribLPointer", IIIIPV);
        glViewportArrayv = load.invoke("glViewportArrayv", IIPV);
        glViewportIndexedf = load.invoke("glViewportIndexedf", IFFFFV);
        glViewportIndexedfv = load.invoke("glViewportIndexedfv", IPV);
    }

    public static void activeShaderProgram(int pipeline, int program) {
        try {
            check(glActiveShaderProgram).invoke(pipeline, program);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void bindProgramPipeline(int pipeline) {
        try {
            check(glBindProgramPipeline).invoke(pipeline);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void clearDepthf(float d) {
        try {
            check(glClearDepthf).invoke(d);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static int createShaderProgramv(int type, int count, Addressable strings) {
        try {
            return (int) check(glCreateShaderProgramv).invoke(type, count, strings);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static int createShaderProgramv(int type, String[] strings) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(ADDRESS, strings.length);
            for (int i = 0; i < strings.length; i++) {
                seg.setAtIndex(ADDRESS, i, session.allocateUtf8String(strings[i]));
            }
            return createShaderProgramv(type, strings.length, seg);
        }
    }

    public static int createShaderProgram(int type, String string) {
        try (var session = MemorySession.openShared()) {
            return createShaderProgramv(type, 1, session.allocate(ADDRESS, session.allocateUtf8String(string)));
        }
    }

    public static void deleteProgramPipelines(int n, Addressable pipelines) {
        try {
            check(glDeleteProgramPipelines).invoke(n, pipelines);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void deleteProgramPipelines(int[] pipelines) {
        try (var session = MemorySession.openShared()) {
            deleteProgramPipelines(pipelines.length, session.allocateArray(JAVA_INT, pipelines));
        }
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
        try {
            check(glDepthRangeArrayv).invoke(first, count, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void depthRangeArrayv(int first, double[] v) {
        try (var session = MemorySession.openShared()) {
            depthRangeArrayv(first, v.length, session.allocateArray(JAVA_DOUBLE, v));
        }
    }

    public static void depthRangeIndexed(int index, double n, double f) {
        try {
            check(glDepthRangeIndexed).invoke(index, n, f);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void depthRangef(float n, float f) {
        try {
            check(glDepthRangef).invoke(n, f);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void genProgramPipelines(int n, Addressable pipelines) {
        try {
            check(glGenProgramPipelines).invoke(n, pipelines);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void genProgramPipelines(int[] pipelines) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, pipelines.length);
            genProgramPipelines(pipelines.length, seg);
            RuntimeHelper.toArray(seg, pipelines);
        }
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
        try {
            check(glGetDoublei_v).invoke(target, index, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getDoublei_v(int target, int index, double[] data) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, data.length);
            getDoublei_v(target, index, seg);
            RuntimeHelper.toArray(seg, data);
        }
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
        try {
            check(glGetFloati_v).invoke(target, index, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getFloati_v(int target, int index, float[] data) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, data.length);
            getFloati_v(target, index, seg);
            RuntimeHelper.toArray(seg, data);
        }
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
        try {
            check(glGetProgramBinary).invoke(program, bufSize, length, binaryFormat, binary);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
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
        try {
            check(glGetProgramPipelineInfoLog).invoke(pipeline, bufSize, length, infoLog);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getProgramPipelineInfoLog(int pipeline, int bufSize, int @Nullable [] length, String[] infoLog) {
        try (var session = MemorySession.openShared()) {
            var pl = length != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
            var pi = session.allocateArray(JAVA_BYTE, bufSize);
            getProgramPipelineInfoLog(pipeline, bufSize, pl, pi);
            if (length != null && length.length > 0) {
                length[0] = ((MemorySegment) pl).get(JAVA_INT, 0);
            }
            infoLog[0] = pi.getUtf8String(0);
        }
    }

    public static String getProgramPipelineInfoLog(int pipeline) {
        try (var session = MemorySession.openShared()) {
            final int sz = getProgramPipelinei(pipeline, GLConstC.GL_INFO_LOG_LENGTH);
            var pi = session.allocateArray(JAVA_BYTE, sz);
            getProgramPipelineInfoLog(pipeline, sz, MemoryAddress.NULL, pi);
            return pi.getUtf8String(0);
        }
    }

    public static void getProgramPipelineiv(int pipeline, int pname, Addressable params) {
        try {
            check(glGetProgramPipelineiv).invoke(pipeline, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
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
        try {
            check(glGetShaderPrecisionFormat).invoke(shaderType, precisionType, range, precision);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getShaderPrecisionFormat(int shaderType, int precisionType, int[] range, int[] precision) {
        try (var session = MemorySession.openShared()) {
            var pr = session.allocateArray(JAVA_INT, range.length);
            var pp = session.allocate(JAVA_INT);
            getShaderPrecisionFormat(shaderType, precisionType, pr, pp);
            RuntimeHelper.toArray(pr, range);
            precision[0] = pp.get(JAVA_INT, 0);
        }
    }

    public static void getVertexAttribLdv(int index, int pname, Addressable params) {
        try {
            check(glGetVertexAttribLdv).invoke(index, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getVertexAttribLdv(int index, int pname, double[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, params.length);
            getVertexAttribLdv(index, pname, seg);
            RuntimeHelper.toArray(seg, params);
        }
    }

    public static boolean isProgramPipeline(int pipeline) {
        try {
            return (boolean) check(glIsProgramPipeline).invoke(pipeline);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programBinary(int program, int binaryFormat, Addressable binary, int length) {
        try {
            check(glProgramBinary).invoke(program, binaryFormat, binary, length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programBinary(int program, int binaryFormat, MemorySegment binary) {
        programBinary(program, binaryFormat, binary, (int) binary.byteSize());
    }

    public static void programParameteri(int program, int pname, int value) {
        try {
            check(glProgramParameteri).invoke(program, pname, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform1d(int program, int location, double v0) {
        try {
            check(glProgramUniform1d).invoke(program, location, v0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform1dv(int program, int location, int count, Addressable value) {
        try {
            check(glProgramUniform1dv).invoke(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform1dv(int program, int location, double[] value) {
        try (var session = MemorySession.openShared()) {
            programUniform1dv(program, location, value.length, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void programUniform1f(int program, int location, float v0) {
        try {
            check(glProgramUniform1f).invoke(program, location, v0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform1fv(int program, int location, int count, Addressable value) {
        try {
            check(glProgramUniform1fv).invoke(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform1fv(int program, int location, float[] value) {
        try (var session = MemorySession.openShared()) {
            programUniform1fv(program, location, value.length, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void programUniform1i(int program, int location, int v0) {
        try {
            check(glProgramUniform1i).invoke(program, location, v0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform1iv(int program, int location, int count, Addressable value) {
        try {
            check(glProgramUniform1iv).invoke(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform1iv(int program, int location, int[] value) {
        try (var session = MemorySession.openShared()) {
            programUniform1iv(program, location, value.length, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void programUniform1ui(int program, int location, int v0) {
        try {
            check(glProgramUniform1ui).invoke(program, location, v0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform1uiv(int program, int location, int count, Addressable value) {
        try {
            check(glProgramUniform1uiv).invoke(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform1uiv(int program, int location, int[] value) {
        try (var session = MemorySession.openShared()) {
            programUniform1uiv(program, location, value.length, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void programUniform2d(int program, int location, double v0, double v1) {
        try {
            check(glProgramUniform2d).invoke(program, location, v0, v1);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform2dv(int program, int location, int count, Addressable value) {
        try {
            check(glProgramUniform2dv).invoke(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform2dv(int program, int location, double[] value) {
        try (var session = MemorySession.openShared()) {
            programUniform2dv(program, location, value.length, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void programUniform2f(int program, int location, float v0, float v1) {
        try {
            check(glProgramUniform2f).invoke(program, location, v0, v1);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform2fv(int program, int location, int count, Addressable value) {
        try {
            check(glProgramUniform2fv).invoke(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform2fv(int program, int location, float[] value) {
        try (var session = MemorySession.openShared()) {
            programUniform2fv(program, location, value.length, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void programUniform2i(int program, int location, int v0, int v1) {
        try {
            check(glProgramUniform2i).invoke(program, location, v0, v1);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform2iv(int program, int location, int count, Addressable value) {
        try {
            check(glProgramUniform2iv).invoke(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform2iv(int program, int location, int[] value) {
        try (var session = MemorySession.openShared()) {
            programUniform2iv(program, location, value.length, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void programUniform2ui(int program, int location, int v0, int v1) {
        try {
            check(glProgramUniform2ui).invoke(program, location, v0, v1);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform2uiv(int program, int location, int count, Addressable value) {
        try {
            check(glProgramUniform2uiv).invoke(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform2uiv(int program, int location, int[] value) {
        try (var session = MemorySession.openShared()) {
            programUniform2uiv(program, location, value.length, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void programUniform3d(int program, int location, double v0, double v1, double v2) {
        try {
            check(glProgramUniform3d).invoke(program, location, v0, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform3dv(int program, int location, int count, Addressable value) {
        try {
            check(glProgramUniform3dv).invoke(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform3dv(int program, int location, double[] value) {
        try (var session = MemorySession.openShared()) {
            programUniform3dv(program, location, value.length, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void programUniform3f(int program, int location, float v0, float v1, float v2) {
        try {
            check(glProgramUniform3f).invoke(program, location, v0, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform3fv(int program, int location, int count, Addressable value) {
        try {
            check(glProgramUniform3fv).invoke(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform3fv(int program, int location, float[] value) {
        try (var session = MemorySession.openShared()) {
            programUniform3fv(program, location, value.length, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void programUniform3i(int program, int location, int v0, int v1, int v2) {
        try {
            check(glProgramUniform3i).invoke(program, location, v0, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform3iv(int program, int location, int count, Addressable value) {
        try {
            check(glProgramUniform3iv).invoke(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform3iv(int program, int location, int[] value) {
        try (var session = MemorySession.openShared()) {
            programUniform3iv(program, location, value.length, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void programUniform3ui(int program, int location, int v0, int v1, int v2) {
        try {
            check(glProgramUniform3ui).invoke(program, location, v0, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform3uiv(int program, int location, int count, Addressable value) {
        try {
            check(glProgramUniform3uiv).invoke(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform3uiv(int program, int location, int[] value) {
        try (var session = MemorySession.openShared()) {
            programUniform3uiv(program, location, value.length, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void programUniform4d(int program, int location, double v0, double v1, double v2, double v3) {
        try {
            check(glProgramUniform4d).invoke(program, location, v0, v1, v2, v3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform4dv(int program, int location, int count, Addressable value) {
        try {
            check(glProgramUniform4dv).invoke(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform4dv(int program, int location, double[] value) {
        try (var session = MemorySession.openShared()) {
            programUniform4dv(program, location, value.length, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void programUniform4f(int program, int location, float v0, float v1, float v2, float v3) {
        try {
            check(glProgramUniform4f).invoke(program, location, v0, v1, v2, v3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform4fv(int program, int location, int count, Addressable value) {
        try {
            check(glProgramUniform4fv).invoke(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform4fv(int program, int location, float[] value) {
        try (var session = MemorySession.openShared()) {
            programUniform4fv(program, location, value.length, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void programUniform4i(int program, int location, int v0, int v1, int v2, int v3) {
        try {
            check(glProgramUniform4i).invoke(program, location, v0, v1, v2, v3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform4iv(int program, int location, int count, Addressable value) {
        try {
            check(glProgramUniform4iv).invoke(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform4iv(int program, int location, int[] value) {
        try (var session = MemorySession.openShared()) {
            programUniform4iv(program, location, value.length, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void programUniform4ui(int program, int location, int v0, int v1, int v2, int v3) {
        try {
            check(glProgramUniform4ui).invoke(program, location, v0, v1, v2, v3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform4uiv(int program, int location, int count, Addressable value) {
        try {
            check(glProgramUniform4uiv).invoke(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniform4uiv(int program, int location, int[] value) {
        try (var session = MemorySession.openShared()) {
            programUniform4uiv(program, location, value.length, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void programUniformMatrix2dv(int program, int location, int count, boolean transpose, Addressable value) {
        try {
            check(glProgramUniformMatrix2dv).invoke(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniformMatrix2dv(int program, int location, int count, boolean transpose, double[] value) {
        try (var session = MemorySession.openShared()) {
            programUniformMatrix2dv(program, location, count, transpose, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void programUniformMatrix2dv(int program, int location, boolean transpose, double[] value) {
        programUniformMatrix2dv(program, location, value.length >> 2, transpose, value);
    }

    public static void programUniformMatrix2fv(int program, int location, int count, boolean transpose, Addressable value) {
        try {
            check(glProgramUniformMatrix2fv).invoke(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniformMatrix2fv(int program, int location, int count, boolean transpose, float[] value) {
        try (var session = MemorySession.openShared()) {
            programUniformMatrix2fv(program, location, count, transpose, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void programUniformMatrix2fv(int program, int location, boolean transpose, float[] value) {
        programUniformMatrix2fv(program, location, value.length >> 2, transpose, value);
    }

    public static void programUniformMatrix2x3dv(int program, int location, int count, boolean transpose, Addressable value) {
        try {
            check(glProgramUniformMatrix2x3dv).invoke(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniformMatrix2x3dv(int program, int location, int count, boolean transpose, double[] value) {
        try (var session = MemorySession.openShared()) {
            programUniformMatrix2x3dv(program, location, count, transpose, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void programUniformMatrix2x3dv(int program, int location, boolean transpose, double[] value) {
        programUniformMatrix2x3dv(program, location, value.length / 6, transpose, value);
    }

    public static void programUniformMatrix2x3fv(int program, int location, int count, boolean transpose, Addressable value) {
        try {
            check(glProgramUniformMatrix2x3fv).invoke(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniformMatrix2x3fv(int program, int location, int count, boolean transpose, float[] value) {
        try (var session = MemorySession.openShared()) {
            programUniformMatrix2x3fv(program, location, count, transpose, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void programUniformMatrix2x3fv(int program, int location, boolean transpose, float[] value) {
        programUniformMatrix2x3fv(program, location, value.length / 6, transpose, value);
    }

    public static void programUniformMatrix2x4dv(int program, int location, int count, boolean transpose, Addressable value) {
        try {
            check(glProgramUniformMatrix2x4dv).invoke(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniformMatrix2x4dv(int program, int location, int count, boolean transpose, double[] value) {
        try (var session = MemorySession.openShared()) {
            programUniformMatrix2x4dv(program, location, count, transpose, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void programUniformMatrix2x4dv(int program, int location, boolean transpose, double[] value) {
        programUniformMatrix2x4dv(program, location, value.length >> 3, transpose, value);
    }

    public static void programUniformMatrix2x4fv(int program, int location, int count, boolean transpose, Addressable value) {
        try {
            check(glProgramUniformMatrix2x4fv).invoke(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniformMatrix2x4fv(int program, int location, int count, boolean transpose, float[] value) {
        try (var session = MemorySession.openShared()) {
            programUniformMatrix2x4fv(program, location, count, transpose, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void programUniformMatrix2x4fv(int program, int location, boolean transpose, float[] value) {
        programUniformMatrix2x4fv(program, location, value.length >> 3, transpose, value);
    }

    public static void programUniformMatrix3dv(int program, int location, int count, boolean transpose, Addressable value) {
        try {
            check(glProgramUniformMatrix3dv).invoke(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniformMatrix3dv(int program, int location, int count, boolean transpose, double[] value) {
        try (var session = MemorySession.openShared()) {
            programUniformMatrix3dv(program, location, count, transpose, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void programUniformMatrix3dv(int program, int location, boolean transpose, double[] value) {
        programUniformMatrix3dv(program, location, value.length / 9, transpose, value);
    }

    public static void programUniformMatrix3fv(int program, int location, int count, boolean transpose, Addressable value) {
        try {
            check(glProgramUniformMatrix3fv).invoke(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniformMatrix3fv(int program, int location, int count, boolean transpose, float[] value) {
        try (var session = MemorySession.openShared()) {
            programUniformMatrix3fv(program, location, count, transpose, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void programUniformMatrix3fv(int program, int location, boolean transpose, float[] value) {
        programUniformMatrix3fv(program, location, value.length / 9, transpose, value);
    }

    public static void programUniformMatrix3x2dv(int program, int location, int count, boolean transpose, Addressable value) {
        try {
            check(glProgramUniformMatrix3x2dv).invoke(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniformMatrix3x2dv(int program, int location, int count, boolean transpose, double[] value) {
        try (var session = MemorySession.openShared()) {
            programUniformMatrix3x2dv(program, location, count, transpose, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void programUniformMatrix3x2dv(int program, int location, boolean transpose, double[] value) {
        programUniformMatrix3x2dv(program, location, value.length / 6, transpose, value);
    }

    public static void programUniformMatrix3x2fv(int program, int location, int count, boolean transpose, Addressable value) {
        try {
            check(glProgramUniformMatrix3x2fv).invoke(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniformMatrix3x2fv(int program, int location, int count, boolean transpose, float[] value) {
        try (var session = MemorySession.openShared()) {
            programUniformMatrix3x2fv(program, location, count, transpose, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void programUniformMatrix3x2fv(int program, int location, boolean transpose, float[] value) {
        programUniformMatrix3x2fv(program, location, value.length / 6, transpose, value);
    }

    public static void programUniformMatrix3x4dv(int program, int location, int count, boolean transpose, Addressable value) {
        try {
            check(glProgramUniformMatrix3x4dv).invoke(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniformMatrix3x4dv(int program, int location, int count, boolean transpose, double[] value) {
        try (var session = MemorySession.openShared()) {
            programUniformMatrix3x4dv(program, location, count, transpose, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void programUniformMatrix3x4dv(int program, int location, boolean transpose, double[] value) {
        programUniformMatrix3x4dv(program, location, value.length / 12, transpose, value);
    }

    public static void programUniformMatrix3x4fv(int program, int location, int count, boolean transpose, Addressable value) {
        try {
            check(glProgramUniformMatrix3x4fv).invoke(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniformMatrix3x4fv(int program, int location, int count, boolean transpose, float[] value) {
        try (var session = MemorySession.openShared()) {
            programUniformMatrix3x4fv(program, location, count, transpose, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void programUniformMatrix3x4fv(int program, int location, boolean transpose, float[] value) {
        programUniformMatrix3x4fv(program, location, value.length / 12, transpose, value);
    }

    public static void programUniformMatrix4dv(int program, int location, int count, boolean transpose, Addressable value) {
        try {
            check(glProgramUniformMatrix4dv).invoke(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniformMatrix4dv(int program, int location, int count, boolean transpose, double[] value) {
        try (var session = MemorySession.openShared()) {
            programUniformMatrix4dv(program, location, count, transpose, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void programUniformMatrix4dv(int program, int location, boolean transpose, double[] value) {
        programUniformMatrix4dv(program, location, value.length >> 4, transpose, value);
    }

    public static void programUniformMatrix4fv(int program, int location, int count, boolean transpose, Addressable value) {
        try {
            check(glProgramUniformMatrix4fv).invoke(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniformMatrix4fv(int program, int location, int count, boolean transpose, float[] value) {
        try (var session = MemorySession.openShared()) {
            programUniformMatrix4fv(program, location, count, transpose, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void programUniformMatrix4fv(int program, int location, boolean transpose, float[] value) {
        programUniformMatrix4fv(program, location, value.length >> 4, transpose, value);
    }

    public static void programUniformMatrix4x2dv(int program, int location, int count, boolean transpose, Addressable value) {
        try {
            check(glProgramUniformMatrix4x2dv).invoke(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniformMatrix4x2dv(int program, int location, int count, boolean transpose, double[] value) {
        try (var session = MemorySession.openShared()) {
            programUniformMatrix4x2dv(program, location, count, transpose, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void programUniformMatrix4x2dv(int program, int location, boolean transpose, double[] value) {
        programUniformMatrix4x2dv(program, location, value.length >> 3, transpose, value);
    }

    public static void programUniformMatrix4x2fv(int program, int location, int count, boolean transpose, Addressable value) {
        try {
            check(glProgramUniformMatrix4x2fv).invoke(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniformMatrix4x2fv(int program, int location, int count, boolean transpose, float[] value) {
        try (var session = MemorySession.openShared()) {
            programUniformMatrix4x2fv(program, location, count, transpose, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void programUniformMatrix4x2fv(int program, int location, boolean transpose, float[] value) {
        programUniformMatrix4x2fv(program, location, value.length >> 3, transpose, value);
    }

    public static void programUniformMatrix4x3dv(int program, int location, int count, boolean transpose, Addressable value) {
        try {
            check(glProgramUniformMatrix4x3dv).invoke(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniformMatrix4x3dv(int program, int location, int count, boolean transpose, double[] value) {
        try (var session = MemorySession.openShared()) {
            programUniformMatrix4x3dv(program, location, count, transpose, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void programUniformMatrix4x3dv(int program, int location, boolean transpose, double[] value) {
        programUniformMatrix4x3dv(program, location, value.length / 12, transpose, value);
    }

    public static void programUniformMatrix4x3fv(int program, int location, int count, boolean transpose, Addressable value) {
        try {
            check(glProgramUniformMatrix4x3fv).invoke(program, location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void programUniformMatrix4x3fv(int program, int location, int count, boolean transpose, float[] value) {
        try (var session = MemorySession.openShared()) {
            programUniformMatrix4x3fv(program, location, count, transpose, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void programUniformMatrix4x3fv(int program, int location, boolean transpose, float[] value) {
        programUniformMatrix4x3fv(program, location, value.length / 12, transpose, value);
    }

    public static void releaseShaderCompiler() {
        try {
            check(glReleaseShaderCompiler).invoke();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void scissorArrayv(int first, int count, Addressable v) {
        try {
            check(glScissorArrayv).invoke(first, count, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void scissorArrayv(int first, int count, int[] v) {
        try (var session = MemorySession.openShared()) {
            scissorArrayv(first, count, session.allocateArray(JAVA_INT, v));
        }
    }

    public static void scissorIndexed(int index, int left, int bottom, int width, int height) {
        try {
            check(glScissorIndexed).invoke(index, left, bottom, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void scissorIndexedv(int index, Addressable v) {
        try {
            check(glScissorIndexedv).invoke(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void scissorIndexedv(int index, int[] v) {
        try (var session = MemorySession.openShared()) {
            scissorIndexedv(index, session.allocateArray(JAVA_INT, v));
        }
    }

    public static void shaderBinary(int count, Addressable shaders, int binaryFormat, Addressable binary, int length) {
        try {
            check(glShaderBinary).invoke(count, shaders, binaryFormat, binary, length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void shaderBinary(int[] shaders, int binaryFormat, Addressable binary, int length) {
        try (var session = MemorySession.openShared()) {
            shaderBinary(shaders.length, session.allocateArray(JAVA_INT, shaders), binaryFormat, binary, length);
        }
    }

    public static void shaderBinary(int[] shaders, int binaryFormat, MemorySegment binary) {
        shaderBinary(shaders, binaryFormat, binary, (int) binary.byteSize());
    }

    public static void useProgramStages(int pipeline, int stages, int program) {
        try {
            check(glUseProgramStages).invoke(pipeline, stages, program);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void validateProgramPipeline(int pipeline) {
        try {
            check(glValidateProgramPipeline).invoke(pipeline);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexAttribL1d(int index, double x) {
        try {
            check(glVertexAttribL1d).invoke(index, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexAttribL1dv(int index, Addressable v) {
        try {
            check(glVertexAttribL1dv).invoke(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexAttribL1dv(int index, double[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttribL1dv(index, session.allocateArray(JAVA_DOUBLE, v));
        }
    }

    public static void vertexAttribL2d(int index, double x, double y) {
        try {
            check(glVertexAttribL2d).invoke(index, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexAttribL2dv(int index, Addressable v) {
        try {
            check(glVertexAttribL2dv).invoke(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexAttribL2dv(int index, double[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttribL2dv(index, session.allocateArray(JAVA_DOUBLE, v));
        }
    }

    public static void vertexAttribL3d(int index, double x, double y, double z) {
        try {
            check(glVertexAttribL3d).invoke(index, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexAttribL3dv(int index, Addressable v) {
        try {
            check(glVertexAttribL3dv).invoke(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexAttribL3dv(int index, double[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttribL3dv(index, session.allocateArray(JAVA_DOUBLE, v));
        }
    }

    public static void vertexAttribL4d(int index, double x, double y, double z, double w) {
        try {
            check(glVertexAttribL4d).invoke(index, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexAttribL4dv(int index, Addressable v) {
        try {
            check(glVertexAttribL4dv).invoke(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexAttribL4dv(int index, double[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttribL4dv(index, session.allocateArray(JAVA_DOUBLE, v));
        }
    }

    public static void vertexAttribLPointer(int index, int size, int type, int stride, Addressable pointer) {
        try {
            check(glVertexAttribLPointer).invoke(index, size, type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexAttribLPointer(int index, int size, int type, int stride, double[] pointer) {
        try (var session = MemorySession.openShared()) {
            vertexAttribLPointer(index, size, type, stride, session.allocateArray(JAVA_DOUBLE, pointer));
        }
    }

    public static void viewportArrayv(int first, int count, Addressable v) {
        try {
            check(glViewportArrayv).invoke(first, count, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void viewportArrayv(int first, int count, float[] v) {
        try (var session = MemorySession.openShared()) {
            viewportArrayv(first, count, session.allocateArray(JAVA_FLOAT, v));
        }
    }

    public static void viewportIndexedf(int index, float x, float y, float w, float h) {
        try {
            check(glViewportIndexedf).invoke(index, x, y, w, h);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void viewportIndexedfv(int index, Addressable v) {
        try {
            check(glViewportIndexedfv).invoke(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void viewportIndexedfv(int index, float[] v) {
        try (var session = MemorySession.openShared()) {
            viewportIndexedfv(index, session.allocateArray(JAVA_FLOAT, v));
        }
    }
}
