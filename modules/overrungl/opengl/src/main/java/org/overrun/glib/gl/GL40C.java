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
import java.lang.foreign.MemorySession;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLCaps.*;

/**
 * The OpenGL 4.0 core profile functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL40C extends GL33C permits GL41C {
    @Nullable
    public static MethodHandle
        glBeginQueryIndexed, glBindTransformFeedback, glBlendEquationSeparatei, glBlendEquationi, glBlendFuncSeparatei,
        glBlendFunci, glDeleteTransformFeedbacks, glDrawArraysIndirect, glDrawElementsIndirect, glDrawTransformFeedback,
        glDrawTransformFeedbackStream, glEndQueryIndexed, glGenTransformFeedbacks, glGetActiveSubroutineName,
        glGetActiveSubroutineUniformName, glGetActiveSubroutineUniformiv, glGetProgramStageiv, glGetQueryIndexediv,
        glGetSubroutineIndex, glGetSubroutineUniformLocation, glGetUniformSubroutineuiv, glGetUniformdv,
        glIsTransformFeedback, glMinSampleShading, glPatchParameterfv, glPatchParameteri, glPauseTransformFeedback,
        glResumeTransformFeedback, glUniform1d, glUniform1dv, glUniform2d, glUniform2dv, glUniform3d, glUniform3dv,
        glUniform4d, glUniform4dv, glUniformMatrix2dv, glUniformMatrix2x3dv, glUniformMatrix2x4dv, glUniformMatrix3dv,
        glUniformMatrix3x2dv, glUniformMatrix3x4dv, glUniformMatrix4dv, glUniformMatrix4x2dv, glUniformMatrix4x3dv,
        glUniformSubroutinesuiv;

    static boolean isSupported() {
        return checkAll(glBeginQueryIndexed, glBindTransformFeedback, glBlendEquationSeparatei, glBlendEquationi,
            glBlendFuncSeparatei, glBlendFunci, glDeleteTransformFeedbacks, glDrawArraysIndirect,
            glDrawElementsIndirect, glDrawTransformFeedback, glDrawTransformFeedbackStream, glEndQueryIndexed,
            glGenTransformFeedbacks, glGetActiveSubroutineName, glGetActiveSubroutineUniformName,
            glGetActiveSubroutineUniformiv, glGetProgramStageiv, glGetQueryIndexediv, glGetSubroutineIndex,
            glGetSubroutineUniformLocation, glGetUniformSubroutineuiv, glGetUniformdv, glIsTransformFeedback,
            glMinSampleShading, glPatchParameterfv, glPatchParameteri, glPauseTransformFeedback,
            glResumeTransformFeedback, glUniform1d, glUniform1dv, glUniform2d, glUniform2dv, glUniform3d, glUniform3dv,
            glUniform4d, glUniform4dv, glUniformMatrix2dv, glUniformMatrix2x3dv, glUniformMatrix2x4dv,
            glUniformMatrix3dv, glUniformMatrix3x2dv, glUniformMatrix3x4dv, glUniformMatrix4dv, glUniformMatrix4x2dv,
            glUniformMatrix4x3dv, glUniformSubroutinesuiv);
    }

    static void load(GLLoadFunc load) {
        glBeginQueryIndexed = load.invoke("glBeginQueryIndexed", IIIV);
        glBindTransformFeedback = load.invoke("glBindTransformFeedback", IIV);
        glBlendEquationSeparatei = load.invoke("glBlendEquationSeparatei", IIIV);
        glBlendEquationi = load.invoke("glBlendEquationi", IIV);
        glBlendFuncSeparatei = load.invoke("glBlendFuncSeparatei", IIIIIV);
        glBlendFunci = load.invoke("glBlendFunci", IIIV);
        glDeleteTransformFeedbacks = load.invoke("glDeleteTransformFeedbacks", IPV);
        glDrawArraysIndirect = load.invoke("glDrawArraysIndirect", IPV);
        glDrawElementsIndirect = load.invoke("glDrawElementsIndirect", IIPV);
        glDrawTransformFeedback = load.invoke("glDrawTransformFeedback", IIV);
        glDrawTransformFeedbackStream = load.invoke("glDrawTransformFeedbackStream", IIIV);
        glEndQueryIndexed = load.invoke("glEndQueryIndexed", IIV);
        glGenTransformFeedbacks = load.invoke("glGenTransformFeedbacks", IPV);
        glGetActiveSubroutineName = load.invoke("glGetActiveSubroutineName", IIIIPPV);
        glGetActiveSubroutineUniformName = load.invoke("glGetActiveSubroutineUniformName", IIIIPPV);
        glGetActiveSubroutineUniformiv = load.invoke("glGetActiveSubroutineUniformiv", IIIIPV);
        glGetProgramStageiv = load.invoke("glGetProgramStageiv", IIIPV);
        glGetQueryIndexediv = load.invoke("glGetQueryIndexediv", IIIPV);
        glGetSubroutineIndex = load.invoke("glGetSubroutineIndex", IIPI);
        glGetSubroutineUniformLocation = load.invoke("glGetSubroutineUniformLocation", IIPI);
        glGetUniformSubroutineuiv = load.invoke("glGetUniformSubroutineuiv", IIPV);
        glGetUniformdv = load.invoke("glGetUniformdv", IIPV);
        glIsTransformFeedback = load.invoke("glIsTransformFeedback", IZ);
        glMinSampleShading = load.invoke("glMinSampleShading", FV);
        glPatchParameterfv = load.invoke("glPatchParameterfv", IPV);
        glPatchParameteri = load.invoke("glPatchParameteri", IIV);
        glPauseTransformFeedback = load.invoke("glPauseTransformFeedback", V);
        glResumeTransformFeedback = load.invoke("glResumeTransformFeedback", V);
        glUniform1d = load.invoke("glUniform1d", IDV);
        glUniform1dv = load.invoke("glUniform1dv", IIPV);
        glUniform2d = load.invoke("glUniform2d", IDDV);
        glUniform2dv = load.invoke("glUniform2dv", IIPV);
        glUniform3d = load.invoke("glUniform3d", IDDDV);
        glUniform3dv = load.invoke("glUniform3dv", IIPV);
        glUniform4d = load.invoke("glUniform4d", IDDDDV);
        glUniform4dv = load.invoke("glUniform4dv", IIPV);
        glUniformMatrix2dv = load.invoke("glUniformMatrix2dv", IIZPV);
        glUniformMatrix2x3dv = load.invoke("glUniformMatrix2x3dv", IIZPV);
        glUniformMatrix2x4dv = load.invoke("glUniformMatrix2x4dv", IIZPV);
        glUniformMatrix3dv = load.invoke("glUniformMatrix3dv", IIZPV);
        glUniformMatrix3x2dv = load.invoke("glUniformMatrix3x2dv", IIZPV);
        glUniformMatrix3x4dv = load.invoke("glUniformMatrix3x4dv", IIZPV);
        glUniformMatrix4dv = load.invoke("glUniformMatrix4dv", IIZPV);
        glUniformMatrix4x2dv = load.invoke("glUniformMatrix4x2dv", IIZPV);
        glUniformMatrix4x3dv = load.invoke("glUniformMatrix4x3dv", IIZPV);
        glUniformSubroutinesuiv = load.invoke("glUniformSubroutinesuiv", IIPV);
    }

    public static void beginQueryIndexed(int target, int index, int id) {
        try {
            check(glBeginQueryIndexed).invoke(target, index, id);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void bindTransformFeedback(int target, int id) {
        try {
            check(glBindTransformFeedback).invoke(target, id);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void blendEquationSeparatei(int buf, int modeRGB, int modeAlpha) {
        try {
            check(glBlendEquationSeparatei).invoke(buf, modeRGB, modeAlpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void blendEquationi(int buf, int mode) {
        try {
            check(glBlendEquationi).invoke(buf, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void blendEquationSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        try {
            check(glBlendEquationSeparatei).invoke(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void blendFunci(int buf, int src, int dst) {
        try {
            check(glBlendFunci).invoke(buf, src, dst);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void deleteTransformFeedbacks(int n, Addressable ids) {
        try {
            check(glDeleteTransformFeedbacks).invoke(n, ids);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void deleteTransformFeedbacks(int[] ids) {
        try (var session = MemorySession.openShared()) {
            deleteTransformFeedbacks(ids.length, session.allocateArray(JAVA_INT, ids));
        }
    }

    public static void deleteTransformFeedback(int id) {
        try (var session = MemorySession.openShared()) {
            deleteTransformFeedbacks(1, session.allocate(JAVA_INT, id));
        }
    }

    public static void drawArraysIndirect(int mode, Addressable indirect) {
        try {
            check(glDrawArraysIndirect).invoke(mode, indirect);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawArraysIndirect(int mode, DrawArraysIndirectCommand indirect) {
        drawArraysIndirect(mode, indirect.rawAddress());
    }

    public static void drawArraysIndirect(int mode, int[] indirect) {
        try (var session = MemorySession.openShared()) {
            drawArraysIndirect(mode, session.allocateArray(JAVA_INT, indirect));
        }
    }

    public static void drawElementsIndirect(int mode, int type, Addressable indirect) {
        try {
            check(glDrawElementsIndirect).invoke(mode, type, indirect);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawElementsIndirect(int mode, int type, DrawElementsIndirectCommand indirect) {
        drawElementsIndirect(mode, type, indirect.rawAddress());
    }

    public static void drawElementsIndirect(int mode, int type, int[] indirect) {
        try (var session = MemorySession.openShared()) {
            drawElementsIndirect(mode, type, session.allocateArray(JAVA_INT, indirect));
        }
    }

    public static void drawTransformFeedback(int mode, int id) {
        try {
            check(glDrawTransformFeedback).invoke(mode, id);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawTransformFeedbackStream(int mode, int id, int stream) {
        try {
            check(glDrawTransformFeedbackStream).invoke(mode, id, stream);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void endQueryIndexed(int target, int index) {
        try {
            check(glEndQueryIndexed).invoke(target, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void genTransformFeedbacks(int n, Addressable ids) {
        try {
            check(glGenTransformFeedbacks).invoke(n, ids);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void genTransformFeedbacks(int[] ids) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, ids.length);
            genTransformFeedbacks(ids.length, seg);
            RuntimeHelper.toArray(seg, ids);
        }
    }

    public static int genTransformFeedback() {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            genTransformFeedbacks(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void getActiveSubroutineName(int program, int shaderType, int index, int bufSize, Addressable length, Addressable name) {
        try {
            check(glGetActiveSubroutineName).invoke(program, shaderType, index, bufSize, length, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static String getActiveSubroutineName(int program, int shaderType, int index, int bufSize) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_BYTE, bufSize);
            getActiveSubroutineName(program, shaderType, index, bufSize, MemoryAddress.NULL, seg);
            return seg.getUtf8String(0);
        }
    }

    public static void getActiveSubroutineUniformName(int program, int shaderType, int index, int bufSize, Addressable length, Addressable name) {
        try {
            check(glGetActiveSubroutineUniformName).invoke(program, shaderType, index, bufSize, length, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static String getActiveSubroutineUniformName(int program, int shaderType, int index, int bufSize) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_BYTE, bufSize);
            getActiveSubroutineUniformName(program, shaderType, index, bufSize, MemoryAddress.NULL, seg);
            return seg.getUtf8String(0);
        }
    }

    public static void getActiveSubroutineUniformiv(int program, int shaderType, int index, int pname, Addressable values) {
        try {
            check(glGetActiveSubroutineUniformiv).invoke(program, shaderType, index, pname, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getActiveSubroutineUniformiv(int program, int shaderType, int index, int pname, int[] values) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, values.length);
            getActiveSubroutineUniformiv(program, shaderType, index, pname, seg);
            RuntimeHelper.toArray(seg, values);
        }
    }

    public static int getActiveSubroutineUniformi(int program, int shaderType, int index, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getActiveSubroutineUniformiv(program, shaderType, index, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void getProgramStageiv(int program, int shaderType, int pname, Addressable values) {
        try {
            check(glGetProgramStageiv).invoke(program, shaderType, pname, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static int getProgramStagei(int program, int shaderType, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getProgramStageiv(program, shaderType, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void getQueryIndexediv(int target, int index, int pname, Addressable params) {
        try {
            check(glGetQueryIndexediv).invoke(target, index, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static int getQueryIndexedi(int target, int index, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getQueryIndexediv(target, index, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static int getSubroutineIndex(int program, int shaderType, Addressable name) {
        try {
            return (int) check(glGetSubroutineIndex).invoke(program, shaderType, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static int getSubroutineIndex(int program, int shaderType, String name) {
        try (var session = MemorySession.openShared()) {
            return getSubroutineIndex(program, shaderType, session.allocateUtf8String(name));
        }
    }

    public static int getSubroutineUniformLocation(int program, int shaderType, Addressable name) {
        try {
            return (int) check(glGetSubroutineUniformLocation).invoke(program, shaderType, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static int getSubroutineUniformLocation(int program, int shaderType, String name) {
        try (var session = MemorySession.openShared()) {
            return getSubroutineUniformLocation(program, shaderType, session.allocateUtf8String(name));
        }
    }

    public static void getUniformSubroutineuiv(int shaderType, int location, Addressable params) {
        try {
            check(glGetUniformSubroutineuiv).invoke(shaderType, location, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getUniformSubroutineuiv(int shaderType, int location, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params.length);
            getUniformSubroutineuiv(shaderType, location, seg);
            RuntimeHelper.toArray(seg, params);
        }
    }

    public static void getUniformdv(int program, int location, Addressable params) {
        try {
            check(glGetUniformdv).invoke(program, location, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getUniformdv(int program, int location, double[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, params.length);
            getUniformdv(program, location, seg);
            RuntimeHelper.toArray(seg, params);
        }
    }

    public static double getUniformd(int program, int location) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_DOUBLE);
            getUniformdv(program, location, seg);
            return seg.get(JAVA_DOUBLE, 0);
        }
    }

    public static boolean isTransformFeedback(int id) {
        try {
            return (boolean) check(glIsTransformFeedback).invoke(id);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void minSampleShading(float value) {
        try {
            check(glMinSampleShading).invoke(value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void patchParameterfv(int pname, Addressable values) {
        try {
            check(glPatchParameterfv).invoke(pname, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void patchParameterfv(int pname, float[] values) {
        try (var session = MemorySession.openShared()) {
            patchParameterfv(pname, session.allocateArray(JAVA_FLOAT, values));
        }
    }

    public static void patchParameteri(int pname, int value) {
        try {
            check(glPatchParameteri).invoke(pname, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void pauseTransformFeedback() {
        try {
            check(glPauseTransformFeedback).invoke();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void resumeTransformFeedback() {
        try {
            check(glResumeTransformFeedback).invoke();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniform1d(int location, double x) {
        try {
            check(glUniform1d).invoke(location, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniform1dv(int location, int count, Addressable value) {
        try {
            check(glUniform1dv).invoke(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniform1dv(int location, double[] value) {
        try (var session = MemorySession.openShared()) {
            uniform1dv(location, value.length, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void uniform2d(int location, double x, double y) {
        try {
            check(glUniform2d).invoke(location, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniform2dv(int location, int count, Addressable value) {
        try {
            check(glUniform2dv).invoke(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniform2dv(int location, double[] value) {
        try (var session = MemorySession.openShared()) {
            uniform2dv(location, value.length, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void uniform3d(int location, double x, double y, double z) {
        try {
            check(glUniform3d).invoke(location, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniform3dv(int location, int count, Addressable value) {
        try {
            check(glUniform3dv).invoke(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniform3dv(int location, double[] value) {
        try (var session = MemorySession.openShared()) {
            uniform3dv(location, value.length, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void uniform4d(int location, double x, double y, double z, double w) {
        try {
            check(glUniform4d).invoke(location, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniform4dv(int location, int count, Addressable value) {
        try {
            check(glUniform4dv).invoke(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniform4dv(int location, double[] value) {
        try (var session = MemorySession.openShared()) {
            uniform4dv(location, value.length, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void uniformMatrix2dv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix2dv).invoke(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniformMatrix2dv(int location, int count, boolean transpose, double[] value) {
        try (var session = MemorySession.openShared()) {
            uniformMatrix2dv(location, count, transpose, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void uniformMatrix2dv(int location, boolean transpose, double[] value) {
        uniformMatrix2dv(location, value.length >> 2, transpose, value);
    }

    public static void uniformMatrix2x3dv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix2x3dv).invoke(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniformMatrix2x3dv(int location, int count, boolean transpose, double[] value) {
        try (var session = MemorySession.openShared()) {
            uniformMatrix2x3dv(location, count, transpose, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void uniformMatrix2x3dv(int location, boolean transpose, double[] value) {
        uniformMatrix2x3dv(location, value.length / 6, transpose, value);
    }

    public static void uniformMatrix2x4dv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix2x4dv).invoke(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniformMatrix2x4dv(int location, int count, boolean transpose, double[] value) {
        try (var session = MemorySession.openShared()) {
            uniformMatrix2x4dv(location, count, transpose, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void uniformMatrix2x4dv(int location, boolean transpose, double[] value) {
        uniformMatrix2x4dv(location, value.length >> 3, transpose, value);
    }

    public static void uniformMatrix3dv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix3dv).invoke(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniformMatrix3dv(int location, int count, boolean transpose, double[] value) {
        try (var session = MemorySession.openShared()) {
            uniformMatrix3dv(location, count, transpose, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void uniformMatrix3dv(int location, boolean transpose, double[] value) {
        uniformMatrix3dv(location, value.length / 9, transpose, value);
    }

    public static void uniformMatrix3x2dv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix3x2dv).invoke(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniformMatrix3x2dv(int location, int count, boolean transpose, double[] value) {
        try (var session = MemorySession.openShared()) {
            uniformMatrix3x2dv(location, count, transpose, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void uniformMatrix3x2dv(int location, boolean transpose, double[] value) {
        uniformMatrix3x2dv(location, value.length / 6, transpose, value);
    }

    public static void uniformMatrix3x4dv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix3x4dv).invoke(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniformMatrix3x4dv(int location, int count, boolean transpose, double[] value) {
        try (var session = MemorySession.openShared()) {
            uniformMatrix3x4dv(location, count, transpose, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void uniformMatrix3x4dv(int location, boolean transpose, double[] value) {
        uniformMatrix3x4dv(location, value.length / 12, transpose, value);
    }

    public static void uniformMatrix4dv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix4dv).invoke(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniformMatrix4dv(int location, int count, boolean transpose, double[] value) {
        try (var session = MemorySession.openShared()) {
            uniformMatrix4dv(location, count, transpose, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void uniformMatrix4dv(int location, boolean transpose, double[] value) {
        uniformMatrix4dv(location, value.length >> 4, transpose, value);
    }

    public static void uniformMatrix4x2dv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix4x2dv).invoke(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniformMatrix4x2dv(int location, int count, boolean transpose, double[] value) {
        try (var session = MemorySession.openShared()) {
            uniformMatrix4x2dv(location, count, transpose, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void uniformMatrix4x2dv(int location, boolean transpose, double[] value) {
        uniformMatrix4x2dv(location, value.length >> 3, transpose, value);
    }

    public static void uniformMatrix4x3dv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix4x3dv).invoke(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniformMatrix4x3dv(int location, int count, boolean transpose, double[] value) {
        try (var session = MemorySession.openShared()) {
            uniformMatrix4x3dv(location, count, transpose, session.allocateArray(JAVA_DOUBLE, value));
        }
    }

    public static void uniformMatrix4x3dv(int location, boolean transpose, double[] value) {
        uniformMatrix4x3dv(location, value.length / 12, transpose, value);
    }

    public static void uniformSubroutinesuiv(int shaderType, int count, Addressable indices) {
        try {
            check(glUniformSubroutinesuiv).invoke(shaderType, count, indices);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void uniformSubroutinesuiv(int shaderType, int[] indices) {
        try (var session = MemorySession.openShared()) {
            uniformSubroutinesuiv(shaderType, indices.length, session.allocateArray(JAVA_INT, indices));
        }
    }
}
