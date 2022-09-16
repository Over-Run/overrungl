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
import static org.overrun.glib.gl.GLCaps.*;

/**
 * The OpenGL 4.1 core profile functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL41C extends GL40C permits GL {
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
        glActiveShaderProgram = downcallSafe(load.invoke("glActiveShaderProgram"), dIIV);
        glBindProgramPipeline = downcallSafe(load.invoke("glBindProgramPipeline"), dIV);
        glClearDepthf = downcallSafe(load.invoke("glClearDepthf"), dFV);
        glCreateShaderProgramv = downcallSafe(load.invoke("glCreateShaderProgramv"), dIIPI);
        glDeleteProgramPipelines = downcallSafe(load.invoke("glDeleteProgramPipelines"), dIPV);
        glDepthRangeArrayv = downcallSafe(load.invoke("glDepthRangeArrayv"), dIIPV);
        glDepthRangeIndexed = downcallSafe(load.invoke("glDepthRangeIndexed"), dIDDV);
        glDepthRangef = downcallSafe(load.invoke("glDepthRangef"), dFFV);
        glGenProgramPipelines = downcallSafe(load.invoke("glGenProgramPipelines"), dIPV);
        glGetDoublei_v = downcallSafe(load.invoke("glGetDoublei_v"), dIIPV);
        glGetFloati_v = downcallSafe(load.invoke("glGetFloati_v"), dIIPV);
        glGetProgramBinary = downcallSafe(load.invoke("glGetProgramBinary"), dIIPPPV);
        glGetProgramPipelineInfoLog = downcallSafe(load.invoke("glGetProgramPipelineInfoLog"), dIIPPV);
        glGetProgramPipelineiv = downcallSafe(load.invoke("glGetProgramPipelineiv"), dIIPV);
        glGetShaderPrecisionFormat = downcallSafe(load.invoke("glGetShaderPrecisionFormat"), dIIPPV);
        glGetVertexAttribLdv = downcallSafe(load.invoke("glGetVertexAttribLdv"), );
        glIsProgramPipeline = downcallSafe(load.invoke("glIsProgramPipeline"), );
        glProgramBinary = downcallSafe(load.invoke("glProgramBinary"), );
        glProgramParameteri = downcallSafe(load.invoke("glProgramParameteri"), );
        glProgramUniform1d = downcallSafe(load.invoke("glProgramUniform1d"), );
        glProgramUniform1dv = downcallSafe(load.invoke("glProgramUniform1dv"), );
        glProgramUniform1f = downcallSafe(load.invoke("glProgramUniform1f"), );
        glProgramUniform1fv = downcallSafe(load.invoke("glProgramUniform1fv"), );
        glProgramUniform1i = downcallSafe(load.invoke("glProgramUniform1i"), );
        glProgramUniform1iv = downcallSafe(load.invoke("glProgramUniform1iv"), );
        glProgramUniform1ui = downcallSafe(load.invoke("glProgramUniform1ui"), );
        glProgramUniform1uiv = downcallSafe(load.invoke("glProgramUniform1uiv"), );
        glProgramUniform2d = downcallSafe(load.invoke("glProgramUniform2d"), );
        glProgramUniform2dv = downcallSafe(load.invoke("glProgramUniform2dv"), );
        glProgramUniform2f = downcallSafe(load.invoke("glProgramUniform2f"), );
        glProgramUniform2fv = downcallSafe(load.invoke("glProgramUniform2fv"), );
        glProgramUniform2i = downcallSafe(load.invoke("glProgramUniform2i"), );
        glProgramUniform2iv = downcallSafe(load.invoke("glProgramUniform2iv"), );
        glProgramUniform2ui = downcallSafe(load.invoke("glProgramUniform2ui"), );
        glProgramUniform2uiv = downcallSafe(load.invoke("glProgramUniform2uiv"), );
        glProgramUniform3d = downcallSafe(load.invoke("glProgramUniform3d"), );
        glProgramUniform3dv = downcallSafe(load.invoke("glProgramUniform3dv"), );
        glProgramUniform3f = downcallSafe(load.invoke("glProgramUniform3f"), );
        glProgramUniform3fv = downcallSafe(load.invoke("glProgramUniform3fv"), );
        glProgramUniform3i = downcallSafe(load.invoke("glProgramUniform3i"), );
        glProgramUniform3iv = downcallSafe(load.invoke("glProgramUniform3iv"), );
        glProgramUniform3ui = downcallSafe(load.invoke("glProgramUniform3ui"), );
        glProgramUniform3uiv = downcallSafe(load.invoke("glProgramUniform3uiv"), );
        glProgramUniform4d = downcallSafe(load.invoke("glProgramUniform4d"), );
        glProgramUniform4dv = downcallSafe(load.invoke("glProgramUniform4dv"), );
        glProgramUniform4f = downcallSafe(load.invoke("glProgramUniform4f"), );
        glProgramUniform4fv = downcallSafe(load.invoke("glProgramUniform4fv"), );
        glProgramUniform4i = downcallSafe(load.invoke("glProgramUniform4i"), );
        glProgramUniform4iv = downcallSafe(load.invoke("glProgramUniform4iv"), );
        glProgramUniform4ui = downcallSafe(load.invoke("glProgramUniform4ui"), );
        glProgramUniform4uiv = downcallSafe(load.invoke("glProgramUniform4uiv"), );
        glProgramUniformMatrix2dv = downcallSafe(load.invoke("glProgramUniformMatrix2dv"), );
        glProgramUniformMatrix2fv = downcallSafe(load.invoke("glProgramUniformMatrix2fv"), );
        glProgramUniformMatrix2x3dv = downcallSafe(load.invoke("glProgramUniformMatrix2x3dv"), );
        glProgramUniformMatrix2x3fv = downcallSafe(load.invoke("glProgramUniformMatrix2x3fv"), );
        glProgramUniformMatrix2x4dv = downcallSafe(load.invoke("glProgramUniformMatrix2x4dv"), );
        glProgramUniformMatrix2x4fv = downcallSafe(load.invoke("glProgramUniformMatrix2x4fv"), );
        glProgramUniformMatrix3dv = downcallSafe(load.invoke("glProgramUniformMatrix3dv"), );
        glProgramUniformMatrix3fv = downcallSafe(load.invoke("glProgramUniformMatrix3fv"), );
        glProgramUniformMatrix3x2dv = downcallSafe(load.invoke("glProgramUniformMatrix3x2dv"), );
        glProgramUniformMatrix3x2fv = downcallSafe(load.invoke("glProgramUniformMatrix3x2fv"), );
        glProgramUniformMatrix3x4dv = downcallSafe(load.invoke("glProgramUniformMatrix3x4dv"), );
        glProgramUniformMatrix3x4fv = downcallSafe(load.invoke("glProgramUniformMatrix3x4fv"), );
        glProgramUniformMatrix4dv = downcallSafe(load.invoke("glProgramUniformMatrix4dv"), );
        glProgramUniformMatrix4fv = downcallSafe(load.invoke("glProgramUniformMatrix4fv"), );
        glProgramUniformMatrix4x2dv = downcallSafe(load.invoke("glProgramUniformMatrix4x2dv"), );
        glProgramUniformMatrix4x2fv = downcallSafe(load.invoke("glProgramUniformMatrix4x2fv"), );
        glProgramUniformMatrix4x3dv = downcallSafe(load.invoke("glProgramUniformMatrix4x3dv"), );
        glProgramUniformMatrix4x3fv = downcallSafe(load.invoke("glProgramUniformMatrix4x3fv"), );
        glReleaseShaderCompiler = downcallSafe(load.invoke("glReleaseShaderCompiler"), );
        glScissorArrayv = downcallSafe(load.invoke("glScissorArrayv"), );
        glScissorIndexed = downcallSafe(load.invoke("glScissorIndexed"), );
        glScissorIndexedv = downcallSafe(load.invoke("glScissorIndexedv"), );
        glShaderBinary = downcallSafe(load.invoke("glShaderBinary"), );
        glUseProgramStages = downcallSafe(load.invoke("glUseProgramStages"), );
        glValidateProgramPipeline = downcallSafe(load.invoke("glValidateProgramPipeline"), );
        glVertexAttribL1d = downcallSafe(load.invoke("glVertexAttribL1d"), );
        glVertexAttribL1dv = downcallSafe(load.invoke("glVertexAttribL1dv"), );
        glVertexAttribL2d = downcallSafe(load.invoke("glVertexAttribL2d"), );
        glVertexAttribL2dv = downcallSafe(load.invoke("glVertexAttribL2dv"), );
        glVertexAttribL3d = downcallSafe(load.invoke("glVertexAttribL3d"), );
        glVertexAttribL3dv = downcallSafe(load.invoke("glVertexAttribL3dv"), );
        glVertexAttribL4d = downcallSafe(load.invoke("glVertexAttribL4d"), );
        glVertexAttribL4dv = downcallSafe(load.invoke("glVertexAttribL4dv"), );
        glVertexAttribLPointer = downcallSafe(load.invoke("glVertexAttribLPointer"), );
        glViewportArrayv = downcallSafe(load.invoke("glViewportArrayv"), );
        glViewportIndexedf = downcallSafe(load.invoke("glViewportIndexedf"), );
        glViewportIndexedfv = downcallSafe(load.invoke("glViewportIndexedfv"), );
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
        try (var session = MemorySession.openShared()) {
            deleteProgramPipelines(1, session.allocate(JAVA_INT, pipeline));
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
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            genProgramPipelines(1, seg);
            return seg.get(JAVA_INT, 0);
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
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_DOUBLE);
            getDoublei_v(target, index, seg);
            return seg.get(JAVA_DOUBLE, 0);
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
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_FLOAT);
            getFloati_v(target, index, seg);
            return seg.get(JAVA_FLOAT, 0);
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
        try (var session = MemorySession.openShared()) {
            var pl = length != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
            var pf = session.allocate(JAVA_INT);
            getProgramBinary(program, bufSize, pl, pf, binary);
            if (length != null && length.length > 0) {
                length[0] = ((MemorySegment) pl).get(JAVA_INT, 0);
            }
            binaryFormat[0] = pf.get(JAVA_INT, 0);
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

    public static void getProgramPipelineiv(int pipeline, int pname, int[] params) {
        params[0] = getProgramPipelinei(pipeline, pname);
    }

    public static int getProgramPipelinei(int pipeline, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getProgramPipelineiv(pipeline, pname, seg);
            return seg.get(JAVA_INT, 0);
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
    }
}
