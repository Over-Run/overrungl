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
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLCaps.check;
import static org.overrun.glib.gl.GLCaps.checkAll;

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
            check(glBeginQueryIndexed).invokeExact(target, index, id);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindTransformFeedback(int target, int id) {
        try {
            check(glBindTransformFeedback).invokeExact(target, id);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void blendEquationSeparatei(int buf, int modeRGB, int modeAlpha) {
        try {
            check(glBlendEquationSeparatei).invokeExact(buf, modeRGB, modeAlpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void blendEquationi(int buf, int mode) {
        try {
            check(glBlendEquationi).invokeExact(buf, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void blendEquationSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        try {
            check(glBlendEquationSeparatei).invokeExact(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void blendFunci(int buf, int src, int dst) {
        try {
            check(glBlendFunci).invokeExact(buf, src, dst);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteTransformFeedbacks(int n, Addressable ids) {
        try {
            check(glDeleteTransformFeedbacks).invokeExact(n, ids);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteTransformFeedbacks(SegmentAllocator allocator, int[] ids) {
        deleteTransformFeedbacks(ids.length, allocator.allocateArray(JAVA_INT, ids));
    }

    public static void deleteTransformFeedback(int id) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var mem = stack.calloc(JAVA_INT);
            mem.set(JAVA_INT, 0, id);
            deleteTransformFeedbacks(1, mem);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void drawArraysIndirect(int mode, Addressable indirect) {
        try {
            check(glDrawArraysIndirect).invokeExact(mode, indirect);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawArraysIndirect(int mode, DrawArraysIndirectCommand indirect) {
        drawArraysIndirect(mode, indirect.rawAddress());
    }

    public static void drawArraysIndirect(SegmentAllocator allocator, int mode, int[] indirect) {
        drawArraysIndirect(mode, allocator.allocateArray(JAVA_INT, indirect));
    }

    public static void drawElementsIndirect(int mode, int type, Addressable indirect) {
        try {
            check(glDrawElementsIndirect).invokeExact(mode, type, indirect);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawElementsIndirect(int mode, int type, DrawElementsIndirectCommand indirect) {
        drawElementsIndirect(mode, type, indirect.rawAddress());
    }

    public static void drawElementsIndirect(SegmentAllocator allocator, int mode, int type, int[] indirect) {
        drawElementsIndirect(mode, type, allocator.allocateArray(JAVA_INT, indirect));
    }

    public static void drawTransformFeedback(int mode, int id) {
        try {
            check(glDrawTransformFeedback).invokeExact(mode, id);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawTransformFeedbackStream(int mode, int id, int stream) {
        try {
            check(glDrawTransformFeedbackStream).invokeExact(mode, id, stream);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void endQueryIndexed(int target, int index) {
        try {
            check(glEndQueryIndexed).invokeExact(target, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genTransformFeedbacks(int n, Addressable ids) {
        try {
            check(glGenTransformFeedbacks).invokeExact(n, ids);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genTransformFeedbacks(SegmentAllocator allocator, int[] ids) {
        var seg = allocator.allocateArray(JAVA_INT, ids.length);
        genTransformFeedbacks(ids.length, seg);
        RuntimeHelper.toArray(seg, ids);
    }

    public static int genTransformFeedback() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            genTransformFeedbacks(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getActiveSubroutineName(int program, int shaderType, int index, int bufSize, Addressable length, Addressable name) {
        try {
            check(glGetActiveSubroutineName).invokeExact(program, shaderType, index, bufSize, length, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static String getActiveSubroutineName(SegmentAllocator allocator, int program, int shaderType, int index, int bufSize) {
        var seg = allocator.allocateArray(JAVA_BYTE, bufSize);
        getActiveSubroutineName(program, shaderType, index, bufSize, MemoryAddress.NULL, seg);
        return seg.getUtf8String(0);
    }

    public static void getActiveSubroutineUniformName(int program, int shaderType, int index, int bufSize, Addressable length, Addressable name) {
        try {
            check(glGetActiveSubroutineUniformName).invokeExact(program, shaderType, index, bufSize, length, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static String getActiveSubroutineUniformName(SegmentAllocator allocator, int program, int shaderType, int index, int bufSize) {
        var seg = allocator.allocateArray(JAVA_BYTE, bufSize);
        getActiveSubroutineUniformName(program, shaderType, index, bufSize, MemoryAddress.NULL, seg);
        return seg.getUtf8String(0);
    }

    public static void getActiveSubroutineUniformiv(int program, int shaderType, int index, int pname, Addressable values) {
        try {
            check(glGetActiveSubroutineUniformiv).invokeExact(program, shaderType, index, pname, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getActiveSubroutineUniformiv(SegmentAllocator allocator, int program, int shaderType, int index, int pname, int[] values) {
        var seg = allocator.allocateArray(JAVA_INT, values.length);
        getActiveSubroutineUniformiv(program, shaderType, index, pname, seg);
        RuntimeHelper.toArray(seg, values);
    }

    public static int getActiveSubroutineUniformi(int program, int shaderType, int index, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getActiveSubroutineUniformiv(program, shaderType, index, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getProgramStageiv(int program, int shaderType, int pname, Addressable values) {
        try {
            check(glGetProgramStageiv).invokeExact(program, shaderType, pname, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getProgramStagei(int program, int shaderType, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getProgramStageiv(program, shaderType, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getQueryIndexediv(int target, int index, int pname, Addressable params) {
        try {
            check(glGetQueryIndexediv).invokeExact(target, index, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getQueryIndexedi(int target, int index, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getQueryIndexediv(target, index, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int getSubroutineIndex(int program, int shaderType, Addressable name) {
        try {
            return (int) check(glGetSubroutineIndex).invokeExact(program, shaderType, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getSubroutineIndex(SegmentAllocator allocator, int program, int shaderType, String name) {
        return getSubroutineIndex(program, shaderType, allocator.allocateUtf8String(name));
    }

    public static int getSubroutineUniformLocation(int program, int shaderType, Addressable name) {
        try {
            return (int) check(glGetSubroutineUniformLocation).invokeExact(program, shaderType, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getSubroutineUniformLocation(SegmentAllocator allocator, int program, int shaderType, String name) {
        return getSubroutineUniformLocation(program, shaderType, allocator.allocateUtf8String(name));
    }

    public static void getUniformSubroutineuiv(int shaderType, int location, Addressable params) {
        try {
            check(glGetUniformSubroutineuiv).invokeExact(shaderType, location, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getUniformSubroutineuiv(SegmentAllocator allocator, int shaderType, int location, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getUniformSubroutineuiv(shaderType, location, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static void getUniformdv(int program, int location, Addressable params) {
        try {
            check(glGetUniformdv).invokeExact(program, location, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getUniformdv(SegmentAllocator allocator, int program, int location, double[] params) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, params.length);
        getUniformdv(program, location, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static double getUniformd(int program, int location) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_DOUBLE);
            getUniformdv(program, location, seg);
            return seg.get(JAVA_DOUBLE, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean isTransformFeedback(int id) {
        try {
            return (boolean) check(glIsTransformFeedback).invokeExact(id);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void minSampleShading(float value) {
        try {
            check(glMinSampleShading).invokeExact(value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void patchParameterfv(int pname, Addressable values) {
        try {
            check(glPatchParameterfv).invokeExact(pname, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void patchParameterfv(SegmentAllocator allocator, int pname, float[] values) {
        patchParameterfv(pname, allocator.allocateArray(JAVA_FLOAT, values));
    }

    public static void patchParameteri(int pname, int value) {
        try {
            check(glPatchParameteri).invokeExact(pname, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pauseTransformFeedback() {
        try {
            check(glPauseTransformFeedback).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void resumeTransformFeedback() {
        try {
            check(glResumeTransformFeedback).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform1d(int location, double x) {
        try {
            check(glUniform1d).invokeExact(location, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform1dv(int location, int count, Addressable value) {
        try {
            check(glUniform1dv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform1dv(SegmentAllocator allocator, int location, double[] value) {
        uniform1dv(location, value.length, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniform2d(int location, double x, double y) {
        try {
            check(glUniform2d).invokeExact(location, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform2dv(int location, int count, Addressable value) {
        try {
            check(glUniform2dv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform2dv(SegmentAllocator allocator, int location, double[] value) {
        uniform2dv(location, value.length, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniform3d(int location, double x, double y, double z) {
        try {
            check(glUniform3d).invokeExact(location, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform3dv(int location, int count, Addressable value) {
        try {
            check(glUniform3dv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform3dv(SegmentAllocator allocator, int location, double[] value) {
        uniform3dv(location, value.length, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniform4d(int location, double x, double y, double z, double w) {
        try {
            check(glUniform4d).invokeExact(location, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform4dv(int location, int count, Addressable value) {
        try {
            check(glUniform4dv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform4dv(SegmentAllocator allocator, int location, double[] value) {
        uniform4dv(location, value.length, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix2dv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix2dv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix2dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        uniformMatrix2dv(location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix2dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix2dv(allocator, location, value.length >> 2, transpose, value);
    }

    public static void uniformMatrix2x3dv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix2x3dv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix2x3dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        uniformMatrix2x3dv(location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix2x3dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix2x3dv(allocator, location, value.length / 6, transpose, value);
    }

    public static void uniformMatrix2x4dv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix2x4dv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix2x4dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        uniformMatrix2x4dv(location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix2x4dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix2x4dv(allocator, location, value.length >> 3, transpose, value);
    }

    public static void uniformMatrix3dv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix3dv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix3dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        uniformMatrix3dv(location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix3dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix3dv(allocator, location, value.length / 9, transpose, value);
    }

    public static void uniformMatrix3x2dv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix3x2dv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix3x2dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        uniformMatrix3x2dv(location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix3x2dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix3x2dv(allocator, location, value.length / 6, transpose, value);
    }

    public static void uniformMatrix3x4dv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix3x4dv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix3x4dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        uniformMatrix3x4dv(location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix3x4dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix3x4dv(allocator, location, value.length / 12, transpose, value);
    }

    public static void uniformMatrix4dv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix4dv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix4dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        uniformMatrix4dv(location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix4dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix4dv(allocator, location, value.length >> 4, transpose, value);
    }

    public static void uniformMatrix4x2dv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix4x2dv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix4x2dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        uniformMatrix4x2dv(location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix4x2dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix4x2dv(allocator, location, value.length >> 3, transpose, value);
    }

    public static void uniformMatrix4x3dv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix4x3dv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix4x3dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        uniformMatrix4x3dv(location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix4x3dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix4x3dv(allocator, location, value.length / 12, transpose, value);
    }

    public static void uniformSubroutinesuiv(int shaderType, int count, Addressable indices) {
        try {
            check(glUniformSubroutinesuiv).invokeExact(shaderType, count, indices);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformSubroutinesuiv(SegmentAllocator allocator, int shaderType, int[] indices) {
        uniformSubroutinesuiv(shaderType, indices.length, allocator.allocateArray(JAVA_INT, indices));
    }
}
