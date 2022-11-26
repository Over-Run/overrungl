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

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.*;

/**
 * The OpenGL 2.0 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL20C extends GL15C permits GL21C {
    @Nullable
    public static MethodHandle
        glAttachShader, glBindAttribLocation, glBlendEquationSeparate, glCompileShader, glCreateProgram, glCreateShader,
        glDeleteProgram, glDeleteShader, glDetachShader, glDisableVertexAttribArray, glDrawBuffers,
        glEnableVertexAttribArray, glGetActiveAttrib, glGetActiveUniform, glGetAttachedShaders, glGetAttribLocation,
        glGetProgramInfoLog, glGetProgramiv, glGetShaderInfoLog, glGetShaderSource, glGetShaderiv, glGetUniformLocation,
        glGetUniformfv, glGetUniformiv, glGetVertexAttribPointerv, glGetVertexAttribdv, glGetVertexAttribfv,
        glGetVertexAttribiv, glIsProgram, glIsShader, glLinkProgram, glShaderSource, glStencilFuncSeparate,
        glStencilMaskSeparate, glStencilOpSeparate, glUniform1f, glUniform1fv, glUniform1i, glUniform1iv, glUniform2f,
        glUniform2fv, glUniform2i, glUniform2iv, glUniform3f, glUniform3fv, glUniform3i, glUniform3iv, glUniform4f,
        glUniform4fv, glUniform4i, glUniform4iv, glUniformMatrix2fv, glUniformMatrix3fv, glUniformMatrix4fv,
        glUseProgram, glValidateProgram, glVertexAttrib1d, glVertexAttrib1dv, glVertexAttrib1f, glVertexAttrib1fv,
        glVertexAttrib1s, glVertexAttrib1sv, glVertexAttrib2d, glVertexAttrib2dv, glVertexAttrib2f, glVertexAttrib2fv,
        glVertexAttrib2s, glVertexAttrib2sv, glVertexAttrib3d, glVertexAttrib3dv, glVertexAttrib3f, glVertexAttrib3fv,
        glVertexAttrib3s, glVertexAttrib3sv, glVertexAttrib4Nbv, glVertexAttrib4Niv, glVertexAttrib4Nsv,
        glVertexAttrib4Nub, glVertexAttrib4Nubv, glVertexAttrib4Nuiv, glVertexAttrib4Nusv, glVertexAttrib4bv,
        glVertexAttrib4d, glVertexAttrib4dv, glVertexAttrib4f, glVertexAttrib4fv, glVertexAttrib4iv, glVertexAttrib4s,
        glVertexAttrib4sv, glVertexAttrib4ubv, glVertexAttrib4uiv, glVertexAttrib4usv, glVertexAttribPointer;

    static boolean isSupported() {
        return checkAll(glAttachShader, glBindAttribLocation, glBlendEquationSeparate, glCompileShader, glCreateProgram,
            glCreateShader, glDeleteProgram, glDeleteShader, glDetachShader, glDisableVertexAttribArray, glDrawBuffers,
            glEnableVertexAttribArray, glGetActiveAttrib, glGetActiveUniform, glGetAttachedShaders, glGetAttribLocation,
            glGetProgramInfoLog, glGetProgramiv, glGetShaderInfoLog, glGetShaderSource, glGetShaderiv,
            glGetUniformLocation, glGetUniformfv, glGetUniformiv, glGetVertexAttribPointerv, glGetVertexAttribdv,
            glGetVertexAttribfv, glGetVertexAttribiv, glIsProgram, glIsShader, glLinkProgram, glShaderSource,
            glStencilFuncSeparate, glStencilMaskSeparate, glStencilOpSeparate, glUniform1f, glUniform1fv, glUniform1i,
            glUniform1iv, glUniform2f, glUniform2fv, glUniform2i, glUniform2iv, glUniform3f, glUniform3fv, glUniform3i,
            glUniform3iv, glUniform4f, glUniform4fv, glUniform4i, glUniform4iv, glUniformMatrix2fv, glUniformMatrix3fv,
            glUniformMatrix4fv, glUseProgram, glValidateProgram, glVertexAttrib1d, glVertexAttrib1dv, glVertexAttrib1f,
            glVertexAttrib1fv, glVertexAttrib1s, glVertexAttrib1sv, glVertexAttrib2d, glVertexAttrib2dv,
            glVertexAttrib2f, glVertexAttrib2fv, glVertexAttrib2s, glVertexAttrib2sv, glVertexAttrib3d,
            glVertexAttrib3dv, glVertexAttrib3f, glVertexAttrib3fv, glVertexAttrib3s, glVertexAttrib3sv,
            glVertexAttrib4Nbv, glVertexAttrib4Niv, glVertexAttrib4Nsv, glVertexAttrib4Nub, glVertexAttrib4Nubv,
            glVertexAttrib4Nuiv, glVertexAttrib4Nusv, glVertexAttrib4bv, glVertexAttrib4d, glVertexAttrib4dv,
            glVertexAttrib4f, glVertexAttrib4fv, glVertexAttrib4iv, glVertexAttrib4s, glVertexAttrib4sv,
            glVertexAttrib4ubv, glVertexAttrib4uiv, glVertexAttrib4usv, glVertexAttribPointer);
    }

    static void load(GLLoadFunc load) {
        glAttachShader = load.invoke("glAttachShader", IIV);
        glBindAttribLocation = load.invoke("glBindAttribLocation", IIPV);
        glBlendEquationSeparate = load.invoke("glBlendEquationSeparate", IIV);
        glCompileShader = load.invoke("glCompileShader", IV);
        glCreateProgram = load.invoke("glCreateProgram", I);
        glCreateShader = load.invoke("glCreateShader", II);
        glDeleteProgram = load.invoke("glDeleteProgram", IV);
        glDeleteShader = load.invoke("glDeleteShader", IV);
        glDetachShader = load.invoke("glDetachShader", IIV);
        glDisableVertexAttribArray = load.invoke("glDisableVertexAttribArray", IV);
        glDrawBuffers = load.invoke("glDrawBuffers", IPV);
        glEnableVertexAttribArray = load.invoke("glEnableVertexAttribArray", IV);
        glGetActiveAttrib = load.invoke("glGetActiveAttrib", IIIPPPPV);
        glGetActiveUniform = load.invoke("glGetActiveUniform", IIIPPPPV);
        glGetAttachedShaders = load.invoke("glGetAttachedShaders", IIPPV);
        glGetAttribLocation = load.invoke("glGetAttribLocation", IPI);
        glGetProgramInfoLog = load.invoke("glGetProgramInfoLog", IIPPV);
        glGetProgramiv = load.invoke("glGetProgramiv", IIPV);
        glGetShaderInfoLog = load.invoke("glGetShaderInfoLog", IIPPV);
        glGetShaderSource = load.invoke("glGetShaderSource", IIPV);
        glGetShaderiv = load.invoke("glGetShaderiv", IIPV);
        glGetUniformLocation = load.invoke("glGetUniformLocation", IPI);
        glGetUniformfv = load.invoke("glGetUniformfv", IIPV);
        glGetUniformiv = load.invoke("glGetUniformiv", IIPV);
        glGetVertexAttribPointerv = load.invoke("glGetVertexAttribPointerv", IIPV);
        glGetVertexAttribdv = load.invoke("glGetVertexAttribdv", IIPV);
        glGetVertexAttribfv = load.invoke("glGetVertexAttribfv", IIPV);
        glGetVertexAttribiv = load.invoke("glGetVertexAttribiv", IIPV);
        glIsProgram = load.invoke("glIsProgram", IZ);
        glIsShader = load.invoke("glIsShader", IZ);
        glLinkProgram = load.invoke("glLinkProgram", IV);
        glShaderSource = load.invoke("glShaderSource", IIPPV);
        glStencilFuncSeparate = load.invoke("glStencilFuncSeparate", IIIIV);
        glStencilMaskSeparate = load.invoke("glStencilMaskSeparate", IIV);
        glStencilOpSeparate = load.invoke("glStencilOpSeparate", IIIIV);
        glUniform1f = load.invoke("glUniform1f", IFV);
        glUniform1fv = load.invoke("glUniform1fv", IIPV);
        glUniform1i = load.invoke("glUniform1i", IIV);
        glUniform1iv = load.invoke("glUniform1iv", IIPV);
        glUniform2f = load.invoke("glUniform2f", IFFV);
        glUniform2fv = load.invoke("glUniform2fv", IIPV);
        glUniform2i = load.invoke("glUniform2i", IIIV);
        glUniform2iv = load.invoke("glUniform2iv", IIPV);
        glUniform3f = load.invoke("glUniform3f", IFFFV);
        glUniform3fv = load.invoke("glUniform3fv", IIPV);
        glUniform3i = load.invoke("glUniform3i", IIIIV);
        glUniform3iv = load.invoke("glUniform3iv", IIPV);
        glUniform4f = load.invoke("glUniform4f", IFFFFV);
        glUniform4fv = load.invoke("glUniform4fv", IIPV);
        glUniform4i = load.invoke("glUniform4i", IIIIIV);
        glUniform4iv = load.invoke("glUniform4iv", IIPV);
        glUniformMatrix2fv = load.invoke("glUniformMatrix2fv", IIZPV);
        glUniformMatrix3fv = load.invoke("glUniformMatrix3fv", IIZPV);
        glUniformMatrix4fv = load.invoke("glUniformMatrix4fv", IIZPV);
        glUseProgram = load.invoke("glUseProgram", IV);
        glValidateProgram = load.invoke("glValidateProgram", IV);
        glVertexAttrib1d = load.invoke("glVertexAttrib1d", IDV);
        glVertexAttrib1dv = load.invoke("glVertexAttrib1dv", IPV);
        glVertexAttrib1f = load.invoke("glVertexAttrib1f", IFV);
        glVertexAttrib1fv = load.invoke("glVertexAttrib1fv", IPV);
        glVertexAttrib1s = load.invoke("glVertexAttrib1s", ISV);
        glVertexAttrib1sv = load.invoke("glVertexAttrib1sv", IPV);
        glVertexAttrib2d = load.invoke("glVertexAttrib2d", IDDV);
        glVertexAttrib2dv = load.invoke("glVertexAttrib2dv", IPV);
        glVertexAttrib2f = load.invoke("glVertexAttrib2f", IFFV);
        glVertexAttrib2fv = load.invoke("glVertexAttrib2fv", IPV);
        glVertexAttrib2s = load.invoke("glVertexAttrib2s", ISSV);
        glVertexAttrib2sv = load.invoke("glVertexAttrib2sv", IPV);
        glVertexAttrib3d = load.invoke("glVertexAttrib3d", IDDDV);
        glVertexAttrib3dv = load.invoke("glVertexAttrib3dv", IPV);
        glVertexAttrib3f = load.invoke("glVertexAttrib3f", IFFFV);
        glVertexAttrib3fv = load.invoke("glVertexAttrib3fv", IPV);
        glVertexAttrib3s = load.invoke("glVertexAttrib3s", ISSSV);
        glVertexAttrib3sv = load.invoke("glVertexAttrib3sv", IPV);
        glVertexAttrib4Nbv = load.invoke("glVertexAttrib4Nbv", IPV);
        glVertexAttrib4Niv = load.invoke("glVertexAttrib4Niv", IPV);
        glVertexAttrib4Nsv = load.invoke("glVertexAttrib4Nsv", IPV);
        glVertexAttrib4Nub = load.invoke("glVertexAttrib4Nub", IBBBBV);
        glVertexAttrib4Nubv = load.invoke("glVertexAttrib4Nubv", IPV);
        glVertexAttrib4Nuiv = load.invoke("glVertexAttrib4Nuiv", IPV);
        glVertexAttrib4Nusv = load.invoke("glVertexAttrib4Nusv", IPV);
        glVertexAttrib4bv = load.invoke("glVertexAttrib4bv", IPV);
        glVertexAttrib4d = load.invoke("glVertexAttrib4d", IDDDV);
        glVertexAttrib4dv = load.invoke("glVertexAttrib4dv", IPV);
        glVertexAttrib4f = load.invoke("glVertexAttrib4f", IFFFV);
        glVertexAttrib4fv = load.invoke("glVertexAttrib4fv", IPV);
        glVertexAttrib4iv = load.invoke("glVertexAttrib4iv", IPV);
        glVertexAttrib4s = load.invoke("glVertexAttrib4s", ISSSV);
        glVertexAttrib4sv = load.invoke("glVertexAttrib4sv", IPV);
        glVertexAttrib4ubv = load.invoke("glVertexAttrib4ubv", IPV);
        glVertexAttrib4uiv = load.invoke("glVertexAttrib4uiv", IPV);
        glVertexAttrib4usv = load.invoke("glVertexAttrib4usv", IPV);
        glVertexAttribPointer = load.invoke("glVertexAttribPointer", IIIZIPV);
    }

    public static void attachShader(int program, int shader) {
        try {
            check(glAttachShader).invokeExact(program, shader);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindAttribLocation(int program, int index, Addressable name) {
        try {
            check(glBindAttribLocation).invokeExact(program, index, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindAttribLocation(SegmentAllocator allocator, int program, int index, String name) {
        bindAttribLocation(program, index, allocator.allocateUtf8String(name));
    }

    public static void blendEquationSeparate(int modeRGB, int modeAlpha) {
        try {
            check(glBlendEquationSeparate).invokeExact(modeRGB, modeAlpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void compileShader(int shader) {
        try {
            check(glCompileShader).invokeExact(shader);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int createProgram() {
        try {
            return (int) check(glCreateProgram).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int createShader(int type) {
        try {
            return (int) check(glCreateShader).invokeExact(type);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteProgram(int program) {
        try {
            check(glDeleteProgram).invokeExact(program);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteShader(int shader) {
        try {
            check(glDeleteShader).invokeExact(shader);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void detachShader(int program, int shader) {
        try {
            check(glDetachShader).invokeExact(program, shader);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void disableVertexAttribArray(int index) {
        try {
            check(glDisableVertexAttribArray).invokeExact(index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawBuffers(int n, Addressable bufs) {
        try {
            check(glDrawBuffers).invokeExact(n, bufs);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawBuffers(SegmentAllocator allocator, int[] bufs) {
        drawBuffers(bufs.length, allocator.allocateArray(JAVA_INT, bufs));
    }

    public static void enableVertexAttribArray(int index) {
        try {
            check(glEnableVertexAttribArray).invokeExact(index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getActiveAttrib(int program, int index, int bufSize, Addressable length, Addressable size, Addressable type, Addressable name) {
        try {
            check(glGetActiveAttrib).invokeExact(program, index, bufSize, length, size, type, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getActiveAttrib(SegmentAllocator allocator, int program, int index, int bufSize, int @Nullable [] length, int[] size, int[] type, String[] name) {
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemoryAddress.NULL;
        var pSz = allocator.allocate(JAVA_INT);
        var pType = allocator.allocate(JAVA_INT);
        var pName = allocator.allocateArray(JAVA_BYTE, bufSize);
        getActiveAttrib(program, index, bufSize, pLen, pSz, pType, pName);
        if (length != null && length.length > 0) {
            length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0);
        }
        size[0] = pSz.get(JAVA_INT, 0);
        type[0] = pType.get(JAVA_INT, 0);
        name[0] = pName.getUtf8String(0);
    }

    public static void getActiveUniform(int program, int index, int bufSize, Addressable length, Addressable size, Addressable type, Addressable name) {
        try {
            check(glGetActiveUniform).invokeExact(program, index, bufSize, length, size, type, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getActiveUniform(SegmentAllocator allocator, int program, int index, int bufSize, int @Nullable [] length, int[] size, int[] type, String[] name) {
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemoryAddress.NULL;
        var pSz = allocator.allocate(JAVA_INT);
        var pType = allocator.allocate(JAVA_INT);
        var pName = allocator.allocateArray(JAVA_BYTE, bufSize);
        getActiveUniform(program, index, bufSize, pLen, pSz, pType, pName);
        if (length != null && length.length > 0) {
            length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0);
        }
        size[0] = pSz.get(JAVA_INT, 0);
        type[0] = pType.get(JAVA_INT, 0);
        name[0] = pName.getUtf8String(0);
    }

    public static void getAttachedShaders(int program, int maxCount, Addressable count, Addressable shaders) {
        try {
            check(glGetAttachedShaders).invokeExact(program, maxCount, count, shaders);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getAttachedShaders(SegmentAllocator allocator, int program, int @Nullable [] count, int[] shaders) {
        var pCount = count != null ? allocator.allocate(JAVA_INT) : MemoryAddress.NULL;
        var pShaders = allocator.allocateArray(JAVA_INT, shaders.length);
        getAttachedShaders(program, shaders.length, pCount, pShaders);
        if (count != null && count.length > 0) {
            count[0] = ((MemorySegment) pCount).get(JAVA_INT, 0);
        }
        RuntimeHelper.toArray(pShaders, shaders);
    }

    public static int getAttribLocation(int program, Addressable name) {
        try {
            return (int) check(glGetAttribLocation).invokeExact(program, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getAttribLocation(SegmentAllocator allocator, int program, String name) {
        return getAttribLocation(program, allocator.allocateUtf8String(name));
    }

    public static void getProgramInfoLog(int program, int bufSize, Addressable length, Addressable infoLog) {
        try {
            check(glGetProgramInfoLog).invokeExact(program, bufSize, length, infoLog);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static String getProgramInfoLog(SegmentAllocator allocator, int program, int bufSize, int @Nullable [] length) {
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemoryAddress.NULL;
        var pLog = allocator.allocateArray(JAVA_BYTE, bufSize);
        getProgramInfoLog(program, bufSize, pLen, pLog);
        if (length != null && length.length > 0) {
            length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0);
        }
        return pLog.getUtf8String(0);
    }

    public static String getProgramInfoLog(SegmentAllocator allocator, int program) {
        return getProgramInfoLog(allocator, program, getProgrami(program, GLConstC.GL_INFO_LOG_LENGTH), null);
    }

    public static void getProgramiv(int program, int pname, Addressable params) {
        try {
            check(glGetProgramiv).invokeExact(program, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getProgramiv(SegmentAllocator allocator, int program, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getProgramiv(program, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getProgrami(int program, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getProgramiv(program, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getShaderInfoLog(int shader, int bufSize, Addressable length, Addressable infoLog) {
        try {
            check(glGetShaderInfoLog).invokeExact(shader, bufSize, length, infoLog);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static String getShaderInfoLog(SegmentAllocator allocator, int shader, int bufSize, int @Nullable [] length) {
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemoryAddress.NULL;
        var pLog = allocator.allocateArray(JAVA_BYTE, bufSize);
        getShaderInfoLog(shader, bufSize, pLen, pLog);
        if (length != null && length.length > 0) {
            length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0);
        }
        return pLog.getUtf8String(0);
    }

    public static String getShaderInfoLog(SegmentAllocator allocator, int shader) {
        return getShaderInfoLog(allocator, shader, getShaderi(shader, GLConstC.GL_INFO_LOG_LENGTH), null);
    }

    public static void getShaderSource(int shader, int bufSize, Addressable length, Addressable source) {
        try {
            check(glGetShaderSource).invokeExact(shader, bufSize, length, source);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static String getShaderSource(SegmentAllocator allocator, int shader, int bufSize, int @Nullable [] length) {
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemoryAddress.NULL;
        var pSrc = allocator.allocateArray(JAVA_BYTE, bufSize);
        getShaderSource(shader, bufSize, pLen, pSrc);
        if (length != null && length.length > 0) {
            length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0);
        }
        return pSrc.getUtf8String(0);
    }

    public static String getShaderSource(SegmentAllocator allocator, int shader) {
        return getShaderSource(allocator, shader, getShaderi(shader, GLConstC.GL_SHADER_SOURCE_LENGTH), null);
    }

    public static void getShaderiv(int shader, int pname, Addressable params) {
        try {
            check(glGetShaderiv).invokeExact(shader, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getShaderiv(SegmentAllocator allocator, int shader, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getShaderiv(shader, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getShaderi(int shader, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getShaderiv(shader, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int getUniformLocation(int program, Addressable name) {
        try {
            return (int) check(glGetUniformLocation).invokeExact(program, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getUniformLocation(SegmentAllocator allocator, int program, String name) {
        return getUniformLocation(program, allocator.allocateUtf8String(name));
    }

    public static void getUniformfv(int program, int location, Addressable params) {
        try {
            check(glGetUniformfv).invokeExact(program, location, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getUniformfv(SegmentAllocator allocator, int program, int location, float[] params) {
        var seg = allocator.allocateArray(JAVA_FLOAT, params.length);
        getUniformfv(program, location, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static float getUniformf(int program, int location) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_FLOAT);
            getUniformfv(program, location, seg);
            return seg.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getUniformiv(int program, int location, Addressable params) {
        try {
            check(glGetUniformiv).invokeExact(program, location, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getUniformiv(SegmentAllocator allocator, int program, int location, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getUniformiv(program, location, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getUniformi(int program, int location) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getUniformiv(program, location, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getVertexAttribPointerv(int index, int pname, Addressable pointer) {
        try {
            check(glGetVertexAttribPointerv).invokeExact(index, pname, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getVertexAttribPointerv(SegmentAllocator allocator, int index, int pname, byte[] pointer) {
        var seg = allocator.allocateArray(JAVA_BYTE, pointer.length);
        getVertexAttribPointerv(index, pname, seg);
        RuntimeHelper.toArray(seg, pointer);
    }

    public static void getVertexAttribPointerv(SegmentAllocator allocator, int index, int pname, short[] pointer) {
        var seg = allocator.allocateArray(JAVA_SHORT, pointer.length);
        getVertexAttribPointerv(index, pname, seg);
        RuntimeHelper.toArray(seg, pointer);
    }

    public static void getVertexAttribPointerv(SegmentAllocator allocator, int index, int pname, int[] pointer) {
        var seg = allocator.allocateArray(JAVA_INT, pointer.length);
        getVertexAttribPointerv(index, pname, seg);
        RuntimeHelper.toArray(seg, pointer);
    }

    public static void getVertexAttribPointerv(SegmentAllocator allocator, int index, int pname, float[] pointer) {
        var seg = allocator.allocateArray(JAVA_FLOAT, pointer.length);
        getVertexAttribPointerv(index, pname, seg);
        RuntimeHelper.toArray(seg, pointer);
    }

    public static void getVertexAttribPointerv(SegmentAllocator allocator, int index, int pname, double[] pointer) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, pointer.length);
        getVertexAttribPointerv(index, pname, seg);
        RuntimeHelper.toArray(seg, pointer);
    }

    public static void getVertexAttribdv(int index, int pname, Addressable params) {
        try {
            check(glGetVertexAttribdv).invokeExact(index, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getVertexAttribdv(SegmentAllocator allocator, int index, int pname, double[] params) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, params.length);
        getVertexAttribdv(index, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static double getVertexAttribd(int index, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_DOUBLE);
            getVertexAttribdv(index, pname, seg);
            return seg.get(JAVA_DOUBLE, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getVertexAttribfv(int index, int pname, Addressable params) {
        try {
            check(glGetVertexAttribfv).invokeExact(index, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getVertexAttribfv(SegmentAllocator allocator, int index, int pname, float[] params) {
        var seg = allocator.allocateArray(JAVA_FLOAT, params.length);
        getVertexAttribfv(index, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static float getVertexAttribf(int index, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_FLOAT);
            getVertexAttribfv(index, pname, seg);
            return seg.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getVertexAttribiv(int index, int pname, Addressable params) {
        try {
            check(glGetVertexAttribiv).invokeExact(index, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getVertexAttribiv(SegmentAllocator allocator, int index, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getVertexAttribiv(index, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getVertexAttribi(int index, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getVertexAttribiv(index, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean isProgram(int program) {
        try {
            return (boolean) check(glIsProgram).invokeExact(program);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isShader(int shader) {
        try {
            return (boolean) check(glIsShader).invokeExact(shader);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void linkProgram(int program) {
        try {
            check(glLinkProgram).invokeExact(program);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void shaderSource(int shader, int count, Addressable string, Addressable length) {
        try {
            check(glShaderSource).invokeExact(shader, count, string, length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void shaderSource(SegmentAllocator allocator, int shader, String[] string) {
        var pStr = allocator.allocateArray(ADDRESS, string.length);
        var pLen = allocator.allocateArray(JAVA_INT, string.length);
        for (int i = 0; i < string.length; i++) {
            pStr.setAtIndex(ADDRESS, i, allocator.allocateUtf8String(string[i]));
            pLen.setAtIndex(JAVA_INT, i, string[i].length());
        }
        shaderSource(shader, string.length, pStr, pLen);
    }

    public static void shaderSource(SegmentAllocator allocator, int shader, String string) {
        shaderSource(shader, 1, allocator.allocate(ADDRESS, allocator.allocateUtf8String(string)), allocator.allocate(JAVA_INT, string.length()));
    }

    public static void stencilFuncSeparate(int face, int func, int ref, int mask) {
        try {
            check(glStencilFuncSeparate).invokeExact(face, func, ref, mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void stencilMaskSeparate(int face, int mask) {
        try {
            check(glStencilMaskSeparate).invokeExact(face, mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void stencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
        try {
            check(glStencilOpSeparate).invokeExact(face, sfail, dpfail, dppass);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform1f(int location, float v0) {
        try {
            check(glUniform1f).invokeExact(location, v0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform1fv(int location, int count, Addressable value) {
        try {
            check(glUniform1fv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform1fv(SegmentAllocator allocator, int location, float[] value) {
        uniform1fv(location, value.length, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void uniform1i(int location, int v0) {
        try {
            check(glUniform1i).invokeExact(location, v0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform1iv(int location, int count, Addressable value) {
        try {
            check(glUniform1iv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform1iv(SegmentAllocator allocator, int location, int[] value) {
        uniform1iv(location, value.length, allocator.allocateArray(JAVA_INT, value));
    }

    public static void uniform2f(int location, float v0, float v1) {
        try {
            check(glUniform2f).invokeExact(location, v0, v1);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform2fv(int location, int count, Addressable value) {
        try {
            check(glUniform2fv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform2fv(SegmentAllocator allocator, int location, float[] value) {
        uniform2fv(location, value.length, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void uniform2i(int location, int v0, int v1) {
        try {
            check(glUniform2i).invokeExact(location, v0, v1);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform2iv(int location, int count, Addressable value) {
        try {
            check(glUniform2iv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform2iv(SegmentAllocator allocator, int location, int[] value) {
        uniform2iv(location, value.length, allocator.allocateArray(JAVA_INT, value));
    }

    public static void uniform3f(int location, float v0, float v1, float v2) {
        try {
            check(glUniform3f).invokeExact(location, v0, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform3fv(int location, int count, Addressable value) {
        try {
            check(glUniform3fv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform3fv(SegmentAllocator allocator, int location, float[] value) {
        uniform3fv(location, value.length, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void uniform3i(int location, int v0, int v1, int v2) {
        try {
            check(glUniform3i).invokeExact(location, v0, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform3iv(int location, int count, Addressable value) {
        try {
            check(glUniform3iv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform3iv(SegmentAllocator allocator, int location, int[] value) {
        uniform3iv(location, value.length, allocator.allocateArray(JAVA_INT, value));
    }

    public static void uniform4f(int location, float v0, float v1, float v2, float v3) {
        try {
            check(glUniform4f).invokeExact(location, v0, v1, v2, v3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform4fv(int location, int count, Addressable value) {
        try {
            check(glUniform4fv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform4fv(SegmentAllocator allocator, int location, float[] value) {
        uniform4fv(location, value.length, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void uniform4i(int location, int v0, int v1, int v2, int v3) {
        try {
            check(glUniform4i).invokeExact(location, v0, v1, v2, v3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform4iv(int location, int count, Addressable value) {
        try {
            check(glUniform4iv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform4iv(SegmentAllocator allocator, int location, int[] value) {
        uniform4iv(location, value.length, allocator.allocateArray(JAVA_INT, value));
    }

    public static void uniformMatrix2fv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix2fv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix2fv(SegmentAllocator allocator, int location, int count, boolean transpose, float[] value) {
        uniformMatrix2fv(location, count, transpose, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void uniformMatrix2fv(SegmentAllocator allocator, int location, boolean transpose, float[] value) {
        uniformMatrix2fv(allocator, location, value.length >> 2, transpose, value);
    }

    public static void uniformMatrix3fv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix3fv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix3fv(SegmentAllocator allocator, int location, int count, boolean transpose, float[] value) {
        uniformMatrix3fv(location, count, transpose, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void uniformMatrix3fv(SegmentAllocator allocator, int location, boolean transpose, float[] value) {
        uniformMatrix3fv(allocator, location, value.length / 9, transpose, value);
    }

    public static void uniformMatrix4fv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix4fv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix4fv(SegmentAllocator allocator, int location, int count, boolean transpose, float[] value) {
        uniformMatrix4fv(location, count, transpose, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void uniformMatrix4fv(SegmentAllocator allocator, int location, boolean transpose, float[] value) {
        uniformMatrix4fv(allocator, location, value.length >> 4, transpose, value);
    }

    public static void useProgram(int program) {
        try {
            check(glUseProgram).invokeExact(program);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void validateProgram(int program) {
        try {
            check(glValidateProgram).invokeExact(program);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib1d(int index, double x) {
        try {
            check(glVertexAttrib1d).invokeExact(index, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib1dv(int index, Addressable v) {
        try {
            check(glVertexAttrib1dv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib1dv(SegmentAllocator allocator, int index, double[] v) {
        vertexAttrib1dv(index, allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void vertexAttrib1f(int index, float x) {
        try {
            check(glVertexAttrib1f).invokeExact(index, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib1fv(int index, Addressable v) {
        try {
            check(glVertexAttrib1fv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib1fv(SegmentAllocator allocator, int index, float[] v) {
        vertexAttrib1fv(index, allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void vertexAttrib1s(int index, short x) {
        try {
            check(glVertexAttrib1s).invokeExact(index, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib1sv(int index, Addressable v) {
        try {
            check(glVertexAttrib1sv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib1sv(SegmentAllocator allocator, int index, short[] v) {
        vertexAttrib1sv(index, allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void vertexAttrib2d(int index, double x, double y) {
        try {
            check(glVertexAttrib2d).invokeExact(index, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib2dv(int index, Addressable v) {
        try {
            check(glVertexAttrib2dv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib2dv(SegmentAllocator allocator, int index, double[] v) {
        vertexAttrib2dv(index, allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void vertexAttrib2f(int index, float x, float y) {
        try {
            check(glVertexAttrib2f).invokeExact(index, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib2fv(int index, Addressable v) {
        try {
            check(glVertexAttrib2fv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib2fv(SegmentAllocator allocator, int index, float[] v) {
        vertexAttrib2fv(index, allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void vertexAttrib2s(int index, short x, short y) {
        try {
            check(glVertexAttrib2s).invokeExact(index, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib2sv(int index, Addressable v) {
        try {
            check(glVertexAttrib2sv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib2sv(SegmentAllocator allocator, int index, short[] v) {
        vertexAttrib2sv(index, allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void vertexAttrib3d(int index, double x, double y, double z) {
        try {
            check(glVertexAttrib3d).invokeExact(index, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib3dv(int index, Addressable v) {
        try {
            check(glVertexAttrib3dv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib3dv(SegmentAllocator allocator, int index, double[] v) {
        vertexAttrib3dv(index, allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void vertexAttrib3f(int index, float x, float y, float z) {
        try {
            check(glVertexAttrib3f).invokeExact(index, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib3fv(int index, Addressable v) {
        try {
            check(glVertexAttrib3fv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib3fv(SegmentAllocator allocator, int index, float[] v) {
        vertexAttrib3fv(index, allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void vertexAttrib3s(int index, short x, short y, short z) {
        try {
            check(glVertexAttrib3s).invokeExact(index, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib3sv(int index, Addressable v) {
        try {
            check(glVertexAttrib3sv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib3sv(SegmentAllocator allocator, int index, short[] v) {
        vertexAttrib3sv(index, allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void vertexAttrib4Nbv(int index, Addressable v) {
        try {
            check(glVertexAttrib4Nbv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib4Nbv(SegmentAllocator allocator, int index, byte[] v) {
        vertexAttrib4Nbv(index, allocator.allocateArray(JAVA_BYTE, v));
    }

    public static void vertexAttrib4Niv(int index, Addressable v) {
        try {
            check(glVertexAttrib4Niv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib4Niv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttrib4Niv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttrib4Nsv(int index, Addressable v) {
        try {
            check(glVertexAttrib4Nsv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib4Nsv(SegmentAllocator allocator, int index, short[] v) {
        vertexAttrib4Nsv(index, allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void vertexAttrib4Nub(int index, byte x, byte y, byte z, byte w) {
        try {
            check(glVertexAttrib4Nub).invokeExact(index, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib4Nubv(int index, Addressable v) {
        try {
            check(glVertexAttrib4Nubv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib4Nubv(SegmentAllocator allocator, int index, byte[] v) {
        vertexAttrib4Nubv(index, allocator.allocateArray(JAVA_BYTE, v));
    }

    public static void vertexAttrib4Nuiv(int index, Addressable v) {
        try {
            check(glVertexAttrib4Nuiv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib4Nuiv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttrib4Nuiv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttrib4Nusv(int index, Addressable v) {
        try {
            check(glVertexAttrib4Nusv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib4Nusv(SegmentAllocator allocator, int index, short[] v) {
        vertexAttrib4Nusv(index, allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void vertexAttrib4bv(int index, Addressable v) {
        try {
            check(glVertexAttrib4bv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib4bv(SegmentAllocator allocator, int index, byte[] v) {
        vertexAttrib4bv(index, allocator.allocateArray(JAVA_BYTE, v));
    }

    public static void vertexAttrib4d(int index, double x, double y, double z, double w) {
        try {
            check(glVertexAttrib4d).invokeExact(index, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib4dv(int index, Addressable v) {
        try {
            check(glVertexAttrib4dv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib4dv(SegmentAllocator allocator, int index, double[] v) {
        vertexAttrib4dv(index, allocator.allocateArray(JAVA_DOUBLE, v));
    }

    public static void vertexAttrib4f(int index, float x, float y, float z, float w) {
        try {
            check(glVertexAttrib4f).invokeExact(index, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib4fv(int index, Addressable v) {
        try {
            check(glVertexAttrib4fv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib4fv(SegmentAllocator allocator, int index, float[] v) {
        vertexAttrib4fv(index, allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void vertexAttrib4iv(int index, Addressable v) {
        try {
            check(glVertexAttrib4iv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib4iv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttrib4iv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttrib4s(int index, short x, short y, short z, short w) {
        try {
            check(glVertexAttrib4s).invokeExact(index, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib4sv(int index, Addressable v) {
        try {
            check(glVertexAttrib4sv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib4sv(SegmentAllocator allocator, int index, short[] v) {
        vertexAttrib4sv(index, allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void vertexAttrib4ubv(int index, Addressable v) {
        try {
            check(glVertexAttrib4ubv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib4ubv(SegmentAllocator allocator, int index, byte[] v) {
        vertexAttrib4ubv(index, allocator.allocateArray(JAVA_BYTE, v));
    }

    public static void vertexAttrib4uiv(int index, Addressable v) {
        try {
            check(glVertexAttrib4uiv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib4uiv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttrib4uiv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttrib4usv(int index, Addressable v) {
        try {
            check(glVertexAttrib4usv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttrib4usv(SegmentAllocator allocator, int index, short[] v) {
        vertexAttrib4usv(index, allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void vertexAttribPointer(int index, int size, int type, boolean normalized, int stride, Addressable pointer) {
        try {
            check(glVertexAttribPointer).invokeExact(index, size, type, normalized, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribPointer(SegmentAllocator allocator, int index, int size, int type, boolean normalized, int stride, byte[] pointer) {
        vertexAttribPointer(index, size, type, normalized, stride, allocator.allocateArray(JAVA_BYTE, pointer));
    }

    public static void vertexAttribPointer(SegmentAllocator allocator, int index, int size, int type, boolean normalized, int stride, short[] pointer) {
        vertexAttribPointer(index, size, type, normalized, stride, allocator.allocateArray(JAVA_SHORT, pointer));
    }

    public static void vertexAttribPointer(SegmentAllocator allocator, int index, int size, int type, boolean normalized, int stride, int[] pointer) {
        vertexAttribPointer(index, size, type, normalized, stride, allocator.allocateArray(JAVA_INT, pointer));
    }

    public static void vertexAttribPointer(SegmentAllocator allocator, int index, int size, int type, boolean normalized, int stride, float[] pointer) {
        vertexAttribPointer(index, size, type, normalized, stride, allocator.allocateArray(JAVA_FLOAT, pointer));
    }

    public static void vertexAttribPointer(SegmentAllocator allocator, int index, int size, int type, boolean normalized, int stride, double[] pointer) {
        vertexAttribPointer(index, size, type, normalized, stride, allocator.allocateArray(JAVA_DOUBLE, pointer));
    }
}
