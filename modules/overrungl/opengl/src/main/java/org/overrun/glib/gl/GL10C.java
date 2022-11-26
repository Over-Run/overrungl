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
import static org.overrun.glib.gl.GLLoader.check;
import static org.overrun.glib.gl.GLLoader.checkAll;

/**
 * The OpenGL 1.0 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL10C permits GL10, GL11C {
    @Nullable
    public static MethodHandle
        glBlendFunc, glClear, glClearColor, glClearDepth, glClearStencil, glColorMask, glCullFace, glDepthFunc,
        glDepthMask, glDepthRange, glDisable, glDrawBuffer, glEnable, glFinish, glFlush, glFrontFace, glGetBooleanv,
        glGetDoublev, glGetError, glGetFloatv, glGetIntegerv, glGetString, glGetTexImage, glGetTexLevelParameterfv,
        glGetTexLevelParameteriv, glGetTexParameterfv, glGetTexParameteriv, glHint, glIsEnabled, glLineWidth, glLogicOp,
        glPixelStoref, glPixelStorei, glPointSize, glPolygonMode, glReadBuffer, glReadPixels, glScissor, glStencilFunc,
        glStencilMask, glStencilOp, glTexImage1D, glTexImage2D, glTexParameterf, glTexParameterfv, glTexParameteri,
        glTexParameteriv, glViewport;

    protected GL10C() {
        throw new IllegalStateException("Do not construct instance");
    }

    static boolean isSupported() {
        return checkAll(glBlendFunc, glClear, glClearColor, glClearDepth, glClearStencil, glColorMask, glCullFace,
            glDepthFunc, glDepthMask, glDepthRange, glDisable, glDrawBuffer, glEnable, glFinish, glFlush, glFrontFace,
            glGetBooleanv, glGetDoublev, glGetError, glGetFloatv, glGetIntegerv, glGetString, glGetTexImage,
            glGetTexLevelParameterfv, glGetTexLevelParameteriv, glGetTexParameterfv, glGetTexParameteriv, glHint,
            glIsEnabled, glLineWidth, glLogicOp, glPixelStoref, glPixelStorei, glPointSize, glPolygonMode, glReadBuffer,
            glReadPixels, glScissor, glStencilFunc, glStencilMask, glStencilOp, glTexImage1D, glTexImage2D,
            glTexParameterf, glTexParameterfv, glTexParameteri, glTexParameteriv, glViewport);
    }

    static void load(GLLoadFunc load) {
        glBlendFunc = load.invoke("glBlendFunc", IIV);
        glClear = load.invoke("glClear", IV);
        glClearColor = load.invoke("glClearColor", FFFFV);
        glClearDepth = load.invoke("glClearDepth", DV);
        glClearStencil = load.invoke("glClearStencil", IV);
        glColorMask = load.invoke("glColorMask", ZZZZV);
        glCullFace = load.invoke("glCullFace", IV);
        glDepthFunc = load.invoke("glDepthFunc", IV);
        glDepthMask = load.invoke("glDepthMask", ZV);
        glDepthRange = load.invoke("glDepthRange", DDV);
        glDisable = load.invoke("glDisable", IV);
        glDrawBuffer = load.invoke("glDrawBuffer", IV);
        glEnable = load.invoke("glEnable", IV);
        glFinish = load.invoke("glFinish", V);
        glFlush = load.invoke("glFlush", V);
        glFrontFace = load.invoke("glFrontFace", IV);
        glGetBooleanv = load.invoke("glGetBooleanv", IPV);
        glGetDoublev = load.invoke("glGetDoublev", IPV);
        glGetError = load.invoke("glGetError", I);
        glGetFloatv = load.invoke("glGetFloatv", IPV);
        glGetIntegerv = load.invoke("glGetIntegerv", IPV);
        glGetString = load.invoke("glGetString", IP);
        glGetTexImage = load.invoke("glGetTexImage", IIIIPV);
        glGetTexLevelParameterfv = load.invoke("glGetTexLevelParameterfv", IIIPV);
        glGetTexLevelParameteriv = load.invoke("glGetTexLevelParameteriv", IIIPV);
        glGetTexParameterfv = load.invoke("glGetTexParameterfv", IIPV);
        glGetTexParameteriv = load.invoke("glGetTexParameteriv", IIPV);
        glHint = load.invoke("glHint", IIV);
        glIsEnabled = load.invoke("glIsEnabled", IZ);
        glLineWidth = load.invoke("glLineWidth", FV);
        glLogicOp = load.invoke("glLogicOp", IV);
        glPixelStoref = load.invoke("glPixelStoref", IFV);
        glPixelStorei = load.invoke("glPixelStorei", IIV);
        glPointSize = load.invoke("glPointSize", FV);
        glPolygonMode = load.invoke("glPolygonMode", IIV);
        glReadBuffer = load.invoke("glReadBuffer", IV);
        glReadPixels = load.invoke("glReadPixels", IIIIIIPV);
        glScissor = load.invoke("glScissor", IIIIV);
        glStencilFunc = load.invoke("glStencilFunc", IIIV);
        glStencilMask = load.invoke("glStencilMask", IV);
        glStencilOp = load.invoke("glStencilOp", IIIV);
        glTexImage1D = load.invoke("glTexImage1D", IIIIIIIPV);
        glTexImage2D = load.invoke("glTexImage2D", IIIIIIIIPV);
        glTexParameterf = load.invoke("glTexParameterf", IIFV);
        glTexParameterfv = load.invoke("glTexParameterfv", IIPV);
        glTexParameteri = load.invoke("glTexParameteri", IIIV);
        glTexParameteriv = load.invoke("glTexParameteriv", IIPV);
        glViewport = load.invoke("glViewport", IIIIV);
    }

    public static void blendFunc(int sfactor, int dfactor) {
        try {
            check(glBlendFunc).invokeExact(sfactor, dfactor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clear(int mask) {
        try {
            check(glClear).invokeExact(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearColor(float red, float green, float blue, float alpha) {
        try {
            check(glClearColor).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearDepth(double depth) {
        try {
            check(glClearDepth).invokeExact(depth);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearStencil(int s) {
        try {
            check(glClearStencil).invokeExact(s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void colorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        try {
            check(glColorMask).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void cullFace(int mode) {
        try {
            check(glCullFace).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void depthFunc(int func) {
        try {
            check(glDepthFunc).invokeExact(func);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void depthMask(boolean flag) {
        try {
            check(glDepthMask).invokeExact(flag);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void depthRange(double n, double f) {
        try {
            check(glDepthRange).invokeExact(n, f);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void disable(int cap) {
        try {
            check(glDisable).invokeExact(cap);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawBuffer(int buf) {
        try {
            check(glDrawBuffer).invokeExact(buf);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void enable(int cap) {
        try {
            check(glEnable).invokeExact(cap);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void finish() {
        check(glFinish);
    }

    public static void flush() {
        check(glFlush);
    }

    public static void frontFace(int mode) {
        try {
            check(glFrontFace).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getBooleanv(int pname, Addressable data) {
        try {
            check(glGetBooleanv).invokeExact(pname, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getBooleanv(SegmentAllocator allocator, int pname, boolean[] data) {
        var pData = allocator.allocateArray(JAVA_BOOLEAN, data.length);
        getBooleanv(pname, pData);
        RuntimeHelper.toArray(pData, data);
    }

    public static boolean getBoolean(int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pData = stack.calloc(JAVA_BOOLEAN);
            getBooleanv(pname, pData);
            return pData.get(JAVA_BOOLEAN, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getDoublev(int pname, Addressable data) {
        try {
            check(glGetDoublev).invokeExact(pname, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getDoublev(SegmentAllocator allocator, int pname, double[] data) {
        var pData = allocator.allocateArray(JAVA_DOUBLE, data.length);
        getDoublev(pname, pData);
        RuntimeHelper.toArray(pData, data);
    }

    public static double getDouble(int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pData = stack.calloc(JAVA_DOUBLE);
            getDoublev(pname, pData);
            return pData.get(JAVA_DOUBLE, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int getError() {
        try {
            return (int) check(glGetError).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getFloatv(int pname, Addressable data) {
        try {
            check(glGetFloatv).invokeExact(pname, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getFloatv(SegmentAllocator allocator, int pname, float[] data) {
        var pData = allocator.allocateArray(JAVA_FLOAT, data.length);
        getFloatv(pname, pData);
        RuntimeHelper.toArray(pData, data);
    }

    public static float getFloat(int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pData = stack.calloc(JAVA_FLOAT);
            getFloatv(pname, pData);
            return pData.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getIntegerv(int pname, Addressable data) {
        try {
            check(glGetIntegerv).invokeExact(pname, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getIntegerv(SegmentAllocator allocator, int pname, int[] data) {
        var pData = allocator.allocateArray(JAVA_INT, data.length);
        getIntegerv(pname, pData);
        RuntimeHelper.toArray(pData, data);
    }

    public static int getInteger(int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pData = stack.calloc(JAVA_INT);
            getIntegerv(pname, pData);
            return pData.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemoryAddress ngetString(int name) {
        try {
            return (MemoryAddress) check(glGetString).invokeExact(name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    @Nullable
    public static String getString(int name) {
        var pStr = ngetString(name);
        return pStr != MemoryAddress.NULL ? pStr.getUtf8String(0) : null;
    }

    public static void getTexImage(int target, int level, int format, int type, Addressable pixels) {
        try {
            check(glGetTexImage).invokeExact(target, level, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexLevelParameterfv(int target, int level, int pname, Addressable params) {
        try {
            check(glGetTexLevelParameterfv).invokeExact(target, level, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexLevelParameterfv(SegmentAllocator allocator, int target, int level, int pname, float[] params) {
        var pParams = allocator.allocateArray(JAVA_FLOAT, params.length);
        getTexLevelParameterfv(target, level, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static float getTexLevelParameterf(int target, int level, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.calloc(JAVA_FLOAT);
            getTexLevelParameterfv(target, level, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTexLevelParameteriv(int target, int level, int pname, Addressable params) {
        try {
            check(glGetTexLevelParameteriv).invokeExact(target, level, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexLevelParameteriv(SegmentAllocator allocator, int target, int level, int pname, int[] params) {
        var pParams = allocator.allocateArray(JAVA_INT, params.length);
        getTexLevelParameteriv(target, level, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static int getTexLevelParameteri(int target, int level, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.calloc(JAVA_INT);
            getTexLevelParameteriv(target, level, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTexParameterfv(int target, int pname, Addressable params) {
        try {
            check(glGetTexParameterfv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexParameterfv(SegmentAllocator allocator, int target, int pname, float[] params) {
        var pParams = allocator.allocateArray(JAVA_FLOAT, params.length);
        getTexParameterfv(target, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static float getTexParameterf(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.calloc(JAVA_FLOAT);
            getTexParameterfv(target, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTexParameteriv(int target, int pname, Addressable params) {
        try {
            check(glGetTexParameteriv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexParameteriv(SegmentAllocator allocator, int target, int pname, int[] params) {
        var pParams = allocator.allocateArray(JAVA_INT, params.length);
        getTexParameteriv(target, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static int getTexParameteri(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.calloc(JAVA_INT);
            getTexParameteriv(target, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void hint(int target, int mode) {
        try {
            check(glHint).invokeExact(target, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isEnabled(int cap) {
        try {
            return (boolean) check(glIsEnabled).invokeExact(cap);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lineWidth(float width) {
        try {
            check(glLineWidth).invokeExact(width);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void logicOp(int opcode) {
        try {
            check(glLogicOp).invokeExact(opcode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pixelStoref(int pname, float param) {
        try {
            check(glPixelStoref).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pixelStorei(int pname, int param) {
        try {
            check(glPixelStorei).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pointSize(float size) {
        try {
            check(glPointSize).invokeExact(size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void polygonMode(int face, int mode) {
        try {
            check(glPolygonMode).invokeExact(face, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void readBuffer(int src) {
        try {
            check(glReadBuffer).invokeExact(src);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void readPixels(int x, int y, int width, int height, int format, int type, Addressable pixels) {
        try {
            check(glReadPixels).invokeExact(x, y, width, height, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void readPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, byte[] pixels) {
        var seg = allocator.allocateArray(JAVA_BYTE, pixels.length);
        readPixels(x, y, width, height, format, type, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void readPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, short[] pixels) {
        var seg = allocator.allocateArray(JAVA_SHORT, pixels.length);
        readPixels(x, y, width, height, format, type, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void readPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, int[] pixels) {
        var seg = allocator.allocateArray(JAVA_INT, pixels.length);
        readPixels(x, y, width, height, format, type, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void readPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, float[] pixels) {
        var seg = allocator.allocateArray(JAVA_FLOAT, pixels.length);
        readPixels(x, y, width, height, format, type, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void scissor(int x, int y, int width, int height) {
        try {
            check(glScissor).invokeExact(x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void stencilFunc(int func, int ref, int mask) {
        try {
            check(glStencilFunc).invokeExact(func, ref, mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void stencilMask(int mask) {
        try {
            check(glStencilMask).invokeExact(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void stencilOp(int fail, int zfail, int zpass) {
        try {
            check(glStencilOp).invokeExact(fail, zfail, zpass);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texImage1D(int target, int level, int internalFormat, int width, int border, int format, int type, Addressable pixels) {
        try {
            check(glTexImage1D).invokeExact(target, level, internalFormat, width, border, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texImage1D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int border, int format, int type, byte[] pixels) {
        texImage1D(target, level, internalFormat, width, border, format, type, allocator.allocateArray(JAVA_BYTE, pixels));
    }

    public static void texImage1D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int border, int format, int type, short[] pixels) {
        texImage1D(target, level, internalFormat, width, border, format, type, allocator.allocateArray(JAVA_SHORT, pixels));
    }

    public static void texImage1D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int border, int format, int type, int[] pixels) {
        texImage1D(target, level, internalFormat, width, border, format, type, allocator.allocateArray(JAVA_INT, pixels));
    }

    public static void texImage1D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int border, int format, int type, float[] pixels) {
        texImage1D(target, level, internalFormat, width, border, format, type, allocator.allocateArray(JAVA_FLOAT, pixels));
    }

    public static void texImage2D(int target, int level, int internalFormat, int width, int height, int border, int format, int type, Addressable pixels) {
        try {
            check(glTexImage2D).invokeExact(target, level, internalFormat, width, height, border, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texImage2D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int border, int format, int type, byte[] pixels) {
        texImage2D(target, level, internalFormat, width, height, border, format, type, allocator.allocateArray(JAVA_BYTE, pixels));
    }

    public static void texImage2D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int border, int format, int type, short[] pixels) {
        texImage2D(target, level, internalFormat, width, height, border, format, type, allocator.allocateArray(JAVA_SHORT, pixels));
    }

    public static void texImage2D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int border, int format, int type, int[] pixels) {
        texImage2D(target, level, internalFormat, width, height, border, format, type, allocator.allocateArray(JAVA_INT, pixels));
    }

    public static void texImage2D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int border, int format, int type, float[] pixels) {
        texImage2D(target, level, internalFormat, width, height, border, format, type, allocator.allocateArray(JAVA_FLOAT, pixels));
    }

    public static void texParameterf(int target, int pname, float param) {
        try {
            check(glTexParameterf).invokeExact(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texParameterfv(int target, int pname, Addressable params) {
        try {
            check(glTexParameterfv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void texParameterfv(SegmentAllocator allocator, int target, int pname, float[] params) {
        texParameterfv(target, pname, allocator.allocateArray(JAVA_FLOAT, params));
    }

    public static void texParameteri(int target, int pname, int param) {
        try {
            check(glTexParameteri).invokeExact(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texParameteriv(int target, int pname, Addressable params) {
        try {
            check(glTexParameteriv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texParameteriv(SegmentAllocator allocator, int target, int pname, int[] params) {
        texParameteriv(target, pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void viewport(int x, int y, int width, int height) {
        try {
            check(glViewport).invokeExact(x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
