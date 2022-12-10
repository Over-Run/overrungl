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

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.*;

/**
 * The OpenGL 1.0 forward compatible functions.
 *
 * @sealedGraph
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL10C permits GL10, GL11C {
    protected GL10C() {
        throw new IllegalStateException("Do not construct instance");
    }

    static boolean isSupported(GLCapabilities caps) {
        return checkAll(caps.glBlendFunc, caps.glClear, caps.glClearColor, caps.glClearDepth, caps.glClearStencil, caps.glColorMask,
            caps.glCullFace, caps.glDepthFunc, caps.glDepthMask, caps.glDepthRange, caps.glDisable, caps.glDrawBuffer,
            caps.glEnable, caps.glFinish, caps.glFlush, caps.glFrontFace, caps.glGetBooleanv, caps.glGetDoublev,
            caps.glGetError, caps.glGetFloatv, caps.glGetIntegerv, caps.glGetString, caps.glGetTexImage, caps.glGetTexLevelParameterfv,
            caps.glGetTexLevelParameteriv, caps.glGetTexParameterfv, caps.glGetTexParameteriv, caps.glHint, caps.glIsEnabled, caps.glLineWidth,
            caps.glLogicOp, caps.glPixelStoref, caps.glPixelStorei, caps.glPointSize, caps.glPolygonMode, caps.glReadBuffer,
            caps.glReadPixels, caps.glScissor, caps.glStencilFunc, caps.glStencilMask, caps.glStencilOp, caps.glTexImage1D,
            caps.glTexImage2D, caps.glTexParameterf, caps.glTexParameterfv, caps.glTexParameteri, caps.glTexParameteriv, caps.glViewport);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glBlendFunc = load.invoke("glBlendFunc", IIV);
        caps.glClear = load.invoke("glClear", IV);
        caps.glClearColor = load.invoke("glClearColor", FFFFV);
        caps.glClearDepth = load.invoke("glClearDepth", DV);
        caps.glClearStencil = load.invoke("glClearStencil", IV);
        caps.glColorMask = load.invoke("glColorMask", ZZZZV);
        caps.glCullFace = load.invoke("glCullFace", IV);
        caps.glDepthFunc = load.invoke("glDepthFunc", IV);
        caps.glDepthMask = load.invoke("glDepthMask", ZV);
        caps.glDepthRange = load.invoke("glDepthRange", DDV);
        caps.glDisable = load.invoke("glDisable", IV);
        caps.glDrawBuffer = load.invoke("glDrawBuffer", IV);
        caps.glEnable = load.invoke("glEnable", IV);
        caps.glFinish = load.invoke("glFinish", V);
        caps.glFlush = load.invoke("glFlush", V);
        caps.glFrontFace = load.invoke("glFrontFace", IV);
        caps.glGetBooleanv = load.invoke("glGetBooleanv", IPV);
        caps.glGetDoublev = load.invoke("glGetDoublev", IPV);
        caps.glGetError = load.invoke("glGetError", I);
        caps.glGetFloatv = load.invoke("glGetFloatv", IPV);
        caps.glGetIntegerv = load.invoke("glGetIntegerv", IPV);
        caps.glGetString = load.invoke("glGetString", Ip);
        caps.glGetTexImage = load.invoke("glGetTexImage", IIIIPV);
        caps.glGetTexLevelParameterfv = load.invoke("glGetTexLevelParameterfv", IIIPV);
        caps.glGetTexLevelParameteriv = load.invoke("glGetTexLevelParameteriv", IIIPV);
        caps.glGetTexParameterfv = load.invoke("glGetTexParameterfv", IIPV);
        caps.glGetTexParameteriv = load.invoke("glGetTexParameteriv", IIPV);
        caps.glHint = load.invoke("glHint", IIV);
        caps.glIsEnabled = load.invoke("glIsEnabled", IZ);
        caps.glLineWidth = load.invoke("glLineWidth", FV);
        caps.glLogicOp = load.invoke("glLogicOp", IV);
        caps.glPixelStoref = load.invoke("glPixelStoref", IFV);
        caps.glPixelStorei = load.invoke("glPixelStorei", IIV);
        caps.glPointSize = load.invoke("glPointSize", FV);
        caps.glPolygonMode = load.invoke("glPolygonMode", IIV);
        caps.glReadBuffer = load.invoke("glReadBuffer", IV);
        caps.glReadPixels = load.invoke("glReadPixels", IIIIIIPV);
        caps.glScissor = load.invoke("glScissor", IIIIV);
        caps.glStencilFunc = load.invoke("glStencilFunc", IIIV);
        caps.glStencilMask = load.invoke("glStencilMask", IV);
        caps.glStencilOp = load.invoke("glStencilOp", IIIV);
        caps.glTexImage1D = load.invoke("glTexImage1D", IIIIIIIPV);
        caps.glTexImage2D = load.invoke("glTexImage2D", IIIIIIIIPV);
        caps.glTexParameterf = load.invoke("glTexParameterf", IIFV);
        caps.glTexParameterfv = load.invoke("glTexParameterfv", IIPV);
        caps.glTexParameteri = load.invoke("glTexParameteri", IIIV);
        caps.glTexParameteriv = load.invoke("glTexParameteriv", IIPV);
        caps.glViewport = load.invoke("glViewport", IIIIV);
    }

    public static void blendFunc(int sfactor, int dfactor) {
        var caps = getCapabilities();
        try {
            check(caps.glBlendFunc).invokeExact(sfactor, dfactor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clear(int mask) {
        var caps = getCapabilities();
        try {
            check(caps.glClear).invokeExact(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearColor(float red, float green, float blue, float alpha) {
        var caps = getCapabilities();
        try {
            check(caps.glClearColor).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearDepth(double depth) {
        var caps = getCapabilities();
        try {
            check(caps.glClearDepth).invokeExact(depth);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearStencil(int s) {
        var caps = getCapabilities();
        try {
            check(caps.glClearStencil).invokeExact(s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void colorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        var caps = getCapabilities();
        try {
            check(caps.glColorMask).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void cullFace(int mode) {
        var caps = getCapabilities();
        try {
            check(caps.glCullFace).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void depthFunc(int func) {
        var caps = getCapabilities();
        try {
            check(caps.glDepthFunc).invokeExact(func);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void depthMask(boolean flag) {
        var caps = getCapabilities();
        try {
            check(caps.glDepthMask).invokeExact(flag);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void depthRange(double n, double f) {
        var caps = getCapabilities();
        try {
            check(caps.glDepthRange).invokeExact(n, f);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void disable(int cap) {
        var caps = getCapabilities();
        try {
            check(caps.glDisable).invokeExact(cap);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawBuffer(int buf) {
        var caps = getCapabilities();
        try {
            check(caps.glDrawBuffer).invokeExact(buf);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void enable(int cap) {
        var caps = getCapabilities();
        try {
            check(caps.glEnable).invokeExact(cap);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void finish() {
        var caps = getCapabilities();
        try {
            check(caps.glFinish).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void flush() {
        var caps = getCapabilities();
        try {
            check(caps.glFlush).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void frontFace(int mode) {
        var caps = getCapabilities();
        try {
            check(caps.glFrontFace).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getBooleanv(int pname, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glGetBooleanv).invokeExact(pname, data);
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

    public static void getDoublev(int pname, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glGetDoublev).invokeExact(pname, data);
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
        var caps = getCapabilities();
        try {
            return (int) check(caps.glGetError).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getFloatv(int pname, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glGetFloatv).invokeExact(pname, data);
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

    public static void getIntegerv(int pname, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glGetIntegerv).invokeExact(pname, data);
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

    public static MemorySegment ngetString(int name) {
        var caps = getCapabilities();
        try {
            return (MemorySegment) check(caps.glGetString).invokeExact(name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    @Nullable
    public static String getString(int name) {
        var pStr = ngetString(name);
        return pStr != MemorySegment.NULL ? pStr.getUtf8String(0) : null;
    }

    public static void getTexImage(int target, int level, int format, int type, MemorySegment pixels) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexImage).invokeExact(target, level, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexLevelParameterfv(int target, int level, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexLevelParameterfv).invokeExact(target, level, pname, params);
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

    public static void getTexLevelParameteriv(int target, int level, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexLevelParameteriv).invokeExact(target, level, pname, params);
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

    public static void getTexParameterfv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexParameterfv).invokeExact(target, pname, params);
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

    public static void getTexParameteriv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexParameteriv).invokeExact(target, pname, params);
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
        var caps = getCapabilities();
        try {
            check(caps.glHint).invokeExact(target, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isEnabled(int cap) {
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glIsEnabled).invokeExact(cap);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lineWidth(float width) {
        var caps = getCapabilities();
        try {
            check(caps.glLineWidth).invokeExact(width);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void logicOp(int opcode) {
        var caps = getCapabilities();
        try {
            check(caps.glLogicOp).invokeExact(opcode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pixelStoref(int pname, float param) {
        var caps = getCapabilities();
        try {
            check(caps.glPixelStoref).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pixelStorei(int pname, int param) {
        var caps = getCapabilities();
        try {
            check(caps.glPixelStorei).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pointSize(float size) {
        var caps = getCapabilities();
        try {
            check(caps.glPointSize).invokeExact(size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void polygonMode(int face, int mode) {
        var caps = getCapabilities();
        try {
            check(caps.glPolygonMode).invokeExact(face, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void readBuffer(int src) {
        var caps = getCapabilities();
        try {
            check(caps.glReadBuffer).invokeExact(src);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void readPixels(int x, int y, int width, int height, int format, int type, MemorySegment pixels) {
        var caps = getCapabilities();
        try {
            check(caps.glReadPixels).invokeExact(x, y, width, height, format, type, pixels);
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
        var caps = getCapabilities();
        try {
            check(caps.glScissor).invokeExact(x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void stencilFunc(int func, int ref, int mask) {
        var caps = getCapabilities();
        try {
            check(caps.glStencilFunc).invokeExact(func, ref, mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void stencilMask(int mask) {
        var caps = getCapabilities();
        try {
            check(caps.glStencilMask).invokeExact(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void stencilOp(int fail, int zfail, int zpass) {
        var caps = getCapabilities();
        try {
            check(caps.glStencilOp).invokeExact(fail, zfail, zpass);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texImage1D(int target, int level, int internalFormat, int width, int border, int format, int type, MemorySegment pixels) {
        var caps = getCapabilities();
        try {
            check(caps.glTexImage1D).invokeExact(target, level, internalFormat, width, border, format, type, pixels);
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

    public static void texImage2D(int target, int level, int internalFormat, int width, int height, int border, int format, int type, MemorySegment pixels) {
        var caps = getCapabilities();
        try {
            check(caps.glTexImage2D).invokeExact(target, level, internalFormat, width, height, border, format, type, pixels);
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
        var caps = getCapabilities();
        try {
            check(caps.glTexParameterf).invokeExact(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texParameterfv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glTexParameterfv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void texParameterfv(SegmentAllocator allocator, int target, int pname, float[] params) {
        texParameterfv(target, pname, allocator.allocateArray(JAVA_FLOAT, params));
    }

    public static void texParameteri(int target, int pname, int param) {
        var caps = getCapabilities();
        try {
            check(caps.glTexParameteri).invokeExact(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texParameteriv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glTexParameteriv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texParameteriv(SegmentAllocator allocator, int target, int pname, int[] params) {
        texParameteriv(target, pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void viewport(int x, int y, int width, int height) {
        var caps = getCapabilities();
        try {
            check(caps.glViewport).invokeExact(x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
