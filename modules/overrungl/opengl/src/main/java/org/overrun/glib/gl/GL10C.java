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
import java.lang.foreign.MemorySession;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLCaps.*;

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
            check(glBlendFunc).invoke(sfactor, dfactor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void clear(int mask) {
        try {
            check(glClear).invoke(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void clearColor(float red, float green, float blue, float alpha) {
        try {
            check(glClearColor).invoke(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void clearDepth(double depth) {
        try {
            check(glClearDepth).invoke(depth);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void clearStencil(int s) {
        try {
            check(glClearStencil).invoke(s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void colorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        try {
            check(glColorMask).invoke(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void cullFace(int mode) {
        try {
            check(glCullFace).invoke(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void depthFunc(int func) {
        try {
            check(glDepthFunc).invoke(func);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void depthMask(boolean flag) {
        try {
            check(glDepthMask).invoke(flag);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void depthRange(double n, double f) {
        try {
            check(glDepthRange).invoke(n, f);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void disable(int cap) {
        try {
            check(glDisable).invoke(cap);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void drawBuffer(int buf) {
        try {
            check(glDrawBuffer).invoke(buf);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void enable(int cap) {
        try {
            check(glEnable).invoke(cap);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
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
            check(glFrontFace).invoke(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getBooleanv(int pname, Addressable data) {
        try {
            check(glGetBooleanv).invoke(pname, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getBooleanv(int pname, boolean[] data) {
        try (var session = MemorySession.openShared()) {
            var pData = session.allocateArray(JAVA_BOOLEAN, data.length);
            getBooleanv(pname, pData);
            RuntimeHelper.toArray(pData, data);
        }
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
            check(glGetDoublev).invoke(pname, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getDoublev(int pname, double[] data) {
        try (var session = MemorySession.openShared()) {
            var pData = session.allocateArray(JAVA_DOUBLE, data.length);
            getDoublev(pname, pData);
            RuntimeHelper.toArray(pData, data);
        }
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
            return (int) check(glGetError).invoke();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getFloatv(int pname, Addressable data) {
        try {
            check(glGetFloatv).invoke(pname, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getFloatv(int pname, float[] data) {
        try (var session = MemorySession.openShared()) {
            var pData = session.allocateArray(JAVA_FLOAT, data.length);
            getFloatv(pname, pData);
            RuntimeHelper.toArray(pData, data);
        }
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
            check(glGetIntegerv).invoke(pname, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getIntegerv(int pname, int[] data) {
        try (var session = MemorySession.openShared()) {
            var pData = session.allocateArray(JAVA_INT, data.length);
            getIntegerv(pname, pData);
            RuntimeHelper.toArray(pData, data);
        }
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
            return (MemoryAddress) check(glGetString).invoke(name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    @Nullable
    public static String getString(int name) {
        var pStr = ngetString(name);
        return pStr != MemoryAddress.NULL ? pStr.getUtf8String(0) : null;
    }

    public static void getTexImage(int target, int level, int format, int type, Addressable pixels) {
        try {
            check(glGetTexImage).invoke(target, level, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTexLevelParameterfv(int target, int level, int pname, Addressable params) {
        try {
            check(glGetTexLevelParameterfv).invoke(target, level, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTexLevelParameterfv(int target, int level, int pname, float[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_FLOAT, params.length);
            getTexLevelParameterfv(target, level, pname, pParams);
            RuntimeHelper.toArray(pParams, params);
        }
    }

    public static float getTexLevelParameterf(int target, int level, int pname) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_FLOAT);
            getTexLevelParameterfv(target, level, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        }
    }

    public static void getTexLevelParameteriv(int target, int level, int pname, Addressable params) {
        try {
            check(glGetTexLevelParameteriv).invoke(target, level, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTexLevelParameteriv(int target, int level, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_INT, params.length);
            getTexLevelParameteriv(target, level, pname, pParams);
            RuntimeHelper.toArray(pParams, params);
        }
    }

    public static int getTexLevelParameteri(int target, int level, int pname) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_INT);
            getTexLevelParameteriv(target, level, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        }
    }

    public static void getTexParameterfv(int target, int pname, Addressable params) {
        try {
            check(glGetTexParameterfv).invoke(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTexParameterfv(int target, int pname, float[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_FLOAT, params.length);
            getTexParameterfv(target, pname, pParams);
            RuntimeHelper.toArray(pParams, params);
        }
    }

    public static float getTexParameterf(int target, int pname) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_FLOAT);
            getTexParameterfv(target, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        }
    }

    public static void getTexParameteriv(int target, int pname, Addressable params) {
        try {
            check(glGetTexParameteriv).invoke(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTexParameteriv(int target, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_INT, params.length);
            getTexParameteriv(target, pname, pParams);
            RuntimeHelper.toArray(pParams, params);
        }
    }

    public static int getTexParameteri(int target, int pname) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_INT);
            getTexParameteriv(target, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        }
    }

    public static void hint(int target, int mode) {
        try {
            check(glHint).invoke(target, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean isEnabled(int cap) {
        try {
            return (boolean) check(glIsEnabled).invoke(cap);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void lineWidth(float width) {
        try {
            check(glLineWidth).invoke(width);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void logicOp(int opcode) {
        try {
            check(glLogicOp).invoke(opcode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void pixelStoref(int pname, float param) {
        try {
            check(glPixelStoref).invoke(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void pixelStorei(int pname, int param) {
        try {
            check(glPixelStorei).invoke(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void pointSize(float size) {
        try {
            check(glPointSize).invoke(size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void polygonMode(int face, int mode) {
        try {
            check(glPolygonMode).invoke(face, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void readBuffer(int src) {
        try {
            check(glReadBuffer).invoke(src);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void readPixels(int x, int y, int width, int height, int format, int type, Addressable pixels) {
        try {
            check(glReadPixels).invoke(x, y, width, height, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void readPixels(int x, int y, int width, int height, int format, int type, byte[] pixels) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_BYTE, pixels.length);
            readPixels(x, y, width, height, format, type, seg);
            RuntimeHelper.toArray(seg, pixels);
        }
    }

    public static void readPixels(int x, int y, int width, int height, int format, int type, short[] pixels) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, pixels.length);
            readPixels(x, y, width, height, format, type, seg);
            RuntimeHelper.toArray(seg, pixels);
        }
    }

    public static void readPixels(int x, int y, int width, int height, int format, int type, int[] pixels) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, pixels.length);
            readPixels(x, y, width, height, format, type, seg);
            RuntimeHelper.toArray(seg, pixels);
        }
    }

    public static void readPixels(int x, int y, int width, int height, int format, int type, float[] pixels) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, pixels.length);
            readPixels(x, y, width, height, format, type, seg);
            RuntimeHelper.toArray(seg, pixels);
        }
    }

    public static void scissor(int x, int y, int width, int height) {
        try {
            check(glScissor).invoke(x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void stencilFunc(int func, int ref, int mask) {
        try {
            check(glStencilFunc).invoke(func, ref, mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void stencilMask(int mask) {
        try {
            check(glStencilMask).invoke(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void stencilOp(int fail, int zfail, int zpass) {
        try {
            check(glStencilOp).invoke(fail, zfail, zpass);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texImage1D(int target, int level, int internalFormat, int width, int border, int format, int type, Addressable pixels) {
        try {
            check(glTexImage1D).invoke(target, level, internalFormat, width, border, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texImage1D(int target, int level, int internalFormat, int width, int border, int format, int type, byte[] pixels) {
        try (var session = MemorySession.openShared()) {
            texImage1D(target, level, internalFormat, width, border, format, type, session.allocateArray(JAVA_BYTE, pixels));
        }
    }

    public static void texImage1D(int target, int level, int internalFormat, int width, int border, int format, int type, short[] pixels) {
        try (var session = MemorySession.openShared()) {
            texImage1D(target, level, internalFormat, width, border, format, type, session.allocateArray(JAVA_SHORT, pixels));
        }
    }

    public static void texImage1D(int target, int level, int internalFormat, int width, int border, int format, int type, int[] pixels) {
        try (var session = MemorySession.openShared()) {
            texImage1D(target, level, internalFormat, width, border, format, type, session.allocateArray(JAVA_INT, pixels));
        }
    }

    public static void texImage1D(int target, int level, int internalFormat, int width, int border, int format, int type, float[] pixels) {
        try (var session = MemorySession.openShared()) {
            texImage1D(target, level, internalFormat, width, border, format, type, session.allocateArray(JAVA_FLOAT, pixels));
        }
    }

    public static void texImage2D(int target, int level, int internalFormat, int width, int height, int border, int format, int type, Addressable pixels) {
        try {
            check(glTexImage2D).invoke(target, level, internalFormat, width, height, border, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texImage2D(int target, int level, int internalFormat, int width, int height, int border, int format, int type, byte[] pixels) {
        try (var session = MemorySession.openShared()) {
            texImage2D(target, level, internalFormat, width, height, border, format, type, session.allocateArray(JAVA_BYTE, pixels));
        }
    }

    public static void texImage2D(int target, int level, int internalFormat, int width, int height, int border, int format, int type, short[] pixels) {
        try (var session = MemorySession.openShared()) {
            texImage2D(target, level, internalFormat, width, height, border, format, type, session.allocateArray(JAVA_SHORT, pixels));
        }
    }

    public static void texImage2D(int target, int level, int internalFormat, int width, int height, int border, int format, int type, int[] pixels) {
        try (var session = MemorySession.openShared()) {
            texImage2D(target, level, internalFormat, width, height, border, format, type, session.allocateArray(JAVA_INT, pixels));
        }
    }

    public static void texImage2D(int target, int level, int internalFormat, int width, int height, int border, int format, int type, float[] pixels) {
        try (var session = MemorySession.openShared()) {
            texImage2D(target, level, internalFormat, width, height, border, format, type, session.allocateArray(JAVA_FLOAT, pixels));
        }
    }

    public static void texParameterf(int target, int pname, float param) {
        try {
            check(glTexParameterf).invoke(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texParameterfv(int target, int pname, Addressable params) {
        try {
            check(glTexParameterfv).invoke(target, pname, params);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void texParameterfv(int target, int pname, float[] params) {
        try (var session = MemorySession.openShared()) {
            texParameterfv(target, pname, session.allocateArray(JAVA_FLOAT, params));
        }
    }

    public static void texParameteri(int target, int pname, int param) {
        try {
            check(glTexParameteri).invoke(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texParameteriv(int target, int pname, Addressable params) {
        try {
            check(glTexParameteriv).invoke(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void texParameteriv(int target, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            texParameteriv(target, pname, session.allocateArray(JAVA_INT, params));
        }
    }

    public static void viewport(int x, int y, int width, int height) {
        try {
            check(glViewport).invoke(x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }
}
