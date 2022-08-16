package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static org.overrun.glib.gl.GL.*;

/**
 * The OpenGL 1.0 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public class GL10C {
    @Nullable
    public static MethodHandle
        glBlendFunc,
        glClear, glClearColor, glClearDepth, glClearStencil,
        glColorMask,
        glCullFace,
        glDepthFunc, glDepthMask, glDepthRange,
        glDisable, glDrawBuffer,
        glEnable,
        glFinish, glFlush, glFrontFace,
        glGetBooleanv, glGetDoublev,
        glGetError, glGetFloatv,
        glGetIntegerv, glGetString,
        glGetTexImage,
        glGetTexLevelParameterfv, glGetTexLevelParameteriv,
        glGetTexParameterfv, glGetTexParameteriv,
        glHint,
        glIsEnabled,
        glLineWidth, glLogicOp,
        glPixelStoref, glPixelStorei,
        glPointSize, glPolygonMode,
        glReadBuffer, glReadPixels,
        glScissor,
        glStencilFunc, glStencilMask, glStencilOp,
        glTexImage1D, glTexImage2D,
        glTexParameterf, glTexParameterfv,
        glTexParameteri, glTexParameteriv,
        glViewport;

    protected GL10C() {
        throw new IllegalStateException("Do not construct instance");
    }

    static void load(GLLoadFunc load) throws Throwable {
        if (!Ver10) return;
        glBlendFunc = downcallSafe(load.invoke("glBlendFunc"), dIIV);
        glClear = downcallSafe(load.invoke("glClear"), dIV);
        glClearColor = downcallSafe(load.invoke("glClearColor"), dFFFFV);
        glClearDepth = downcallSafe(load.invoke("glClearDepth"), dDV);
        glClearStencil = downcallSafe(load.invoke("glClearStencil"), dIV);
        glColorMask = downcallSafe(load.invoke("glColorMask"), dZZZZV);
        glCullFace = downcallSafe(load.invoke("glCullFace"), dIV);
        glDepthFunc = downcallSafe(load.invoke("glDepthFunc"), dIV);
        glDepthMask = downcallSafe(load.invoke("glDepthMask"), dZV);
        glDepthRange = downcallSafe(load.invoke("glDepthRange"), dDDV);
        glDisable = downcallSafe(load.invoke("glDisable"), dIV);
        glDrawBuffer = downcallSafe(load.invoke("glDrawBuffer"), dIV);
        glEnable = downcallSafe(load.invoke("glEnable"), dIV);
        glFinish = downcallSafe(load.invoke("glFinish"), dV);
        glFlush = downcallSafe(load.invoke("glFlush"), dV);
        glFrontFace = downcallSafe(load.invoke("glFrontFace"), dIV);
        glGetBooleanv = downcallSafe(load.invoke("glGetBooleanv"), dIPV);
        glGetDoublev = downcallSafe(load.invoke("glGetDoublev"), dIPV);
        glGetError = downcallSafe(load.invoke("glGetError"), dI);
        glGetFloatv = downcallSafe(load.invoke("glGetFloatv"), dIPV);
        glGetIntegerv = downcallSafe(load.invoke("glGetIntegerv"), dIPV);
        glGetString = downcallSafe(load.invoke("glGetString"), dIP);
        glGetTexImage = downcallSafe(load.invoke("glGetTexImage"), dIIIIPV);
        glGetTexLevelParameterfv = downcallSafe(load.invoke("glGetTexLevelParameterfv"), dIIIPV);
        glGetTexLevelParameteriv = downcallSafe(load.invoke("glGetTexLevelParameteriv"), dIIIPV);
        glGetTexParameterfv = downcallSafe(load.invoke("glGetTexParameterfv"), dIIPV);
        glGetTexParameteriv = downcallSafe(load.invoke("glGetTexParameteriv"), dIIPV);
        glHint = downcallSafe(load.invoke("glHint"), dIIV);
        glIsEnabled = downcallSafe(load.invoke("glIsEnabled"), dIZ);
        glLineWidth = downcallSafe(load.invoke("glLineWidth"), dFV);
        glLogicOp = downcallSafe(load.invoke("glLogicOp"), dIV);
        glPixelStoref = downcallSafe(load.invoke("glPixelStoref"), dIFV);
        glPixelStorei = downcallSafe(load.invoke("glPixelStorei"), dIIV);
        glPointSize = downcallSafe(load.invoke("glPointSize"), dFV);
        glPolygonMode = downcallSafe(load.invoke("glPolygonMode"), dIIV);
        glReadBuffer = downcallSafe(load.invoke("glReadBuffer"), dIV);
        glReadPixels = downcallSafe(load.invoke("glReadPixels"), dIIIIIIPV);
        glScissor = downcallSafe(load.invoke("glScissor"), dIIIIV);
        glStencilFunc = downcallSafe(load.invoke("glStencilFunc"), dIIIV);
        glStencilMask = downcallSafe(load.invoke("glStencilMask"), dIV);
        glStencilOp = downcallSafe(load.invoke("glStencilOp"), dIIIV);
        glTexImage1D = downcallSafe(load.invoke("glTexImage1D"), dIIIIIIIPV);
        glTexImage2D = downcallSafe(load.invoke("glTexImage2D"), dIIIIIIIIPV);
        glTexParameterf = downcallSafe(load.invoke("glTexParameterf"), dIIFV);
        glTexParameterfv = downcallSafe(load.invoke("glTexParameterfv"), dIIPV);
        glTexParameteri = downcallSafe(load.invoke("glTexParameteri"), dIIIV);
        glTexParameteriv = downcallSafe(load.invoke("glTexParameteriv"), dIIPV);
        glViewport = downcallSafe(load.invoke("glViewport"), dIIIIV);
    }

    public static void blendFunc(int sfactor, int dfactor) throws Throwable {
        check(glBlendFunc).invoke(sfactor, dfactor);
    }

    public static void clear(int mask) throws Throwable {
        check(glClear).invoke(mask);
    }

    public static void clearColor(float red, float green, float blue, float alpha) throws Throwable {
        check(glClearColor).invoke(red, green, blue, alpha);
    }

    public static void clearDepth(double depth) throws Throwable {
        check(glClearDepth).invoke(depth);
    }

    public static void clearStencil(int s) throws Throwable {
        check(glClearStencil).invoke(s);
    }

    public static void colorMask(boolean red, boolean green, boolean blue, boolean alpha) throws Throwable {
        check(glColorMask).invoke(red, green, blue, alpha);
    }

    public static void cullFace(int mode) throws Throwable {
        check(glCullFace).invoke(mode);
    }

    public static void depthFunc(int func) throws Throwable {
        check(glDepthFunc).invoke(func);
    }

    public static void depthMask(boolean flag) throws Throwable {
        check(glDepthMask).invoke(flag);
    }

    public static void depthRange(double n, double f) throws Throwable {
        check(glDepthRange).invoke(n, f);
    }

    public static void disable(int cap) throws Throwable {
        check(glDisable).invoke(cap);
    }

    public static void drawBuffer(int buf) throws Throwable {
        check(glDrawBuffer).invoke(buf);
    }

    public static void enable(int cap) throws Throwable {
        check(glEnable).invoke(cap);
    }

    public static void finish() throws Throwable {
        check(glFinish);
    }

    public static void flush() throws Throwable {
        check(glFlush);
    }

    public static void frontFace(int mode) throws Throwable {
        check(glFrontFace).invoke(mode);
    }

    public static void getBooleanv(int pname, MemoryAddress data) throws Throwable {
        check(glGetBooleanv).invoke(pname, data);
    }

    public static void getBooleanv(int pname, boolean[] data) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pData = session.allocateArray(ValueLayout.JAVA_BOOLEAN, data.length);
            getBooleanv(pname, pData.address());
            for (int i = 0; i < data.length; i++) {
                data[i] = pData.get(ValueLayout.JAVA_BOOLEAN, i);
            }
        }
    }

    public static boolean getBoolean(int pname) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pData = session.allocate(ValueLayout.JAVA_BOOLEAN);
            getBooleanv(pname, pData.address());
            return pData.get(ValueLayout.JAVA_BOOLEAN, 0L);
        }
    }

    public static void getDoublev(int pname, MemoryAddress data) throws Throwable {
        check(glGetDoublev).invoke(pname, data);
    }

    public static void getDoublev(int pname, double[] data) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pData = session.allocateArray(ValueLayout.JAVA_DOUBLE, data.length);
            getDoublev(pname, pData.address());
            for (int i = 0; i < data.length; i++) {
                data[i] = pData.getAtIndex(ValueLayout.JAVA_DOUBLE, i);
            }
        }
    }

    public static double getDouble(int pname) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pData = session.allocate(ValueLayout.JAVA_DOUBLE);
            getDoublev(pname, pData.address());
            return pData.get(ValueLayout.JAVA_DOUBLE, 0L);
        }
    }

    public static int getError() throws Throwable {
        return (int) check(glGetError).invoke();
    }

    public static void getFloatv(int pname, MemoryAddress data) throws Throwable {
        check(glGetFloatv).invoke(pname, data);
    }

    public static void getFloatv(int pname, float[] data) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pData = session.allocateArray(ValueLayout.JAVA_FLOAT, data.length);
            getFloatv(pname, pData.address());
            for (int i = 0; i < data.length; i++) {
                data[i] = pData.getAtIndex(ValueLayout.JAVA_FLOAT, i);
            }
        }
    }

    public static float getFloat(int pname) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pData = session.allocate(ValueLayout.JAVA_FLOAT);
            getFloatv(pname, pData.address());
            return pData.get(ValueLayout.JAVA_FLOAT, 0L);
        }
    }

    public static void getIntegerv(int pname, MemoryAddress data) throws Throwable {
        check(glGetIntegerv).invoke(pname, data);
    }

    public static void getIntegerv(int pname, int[] data) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pData = session.allocateArray(ValueLayout.JAVA_INT, data.length);
            getIntegerv(pname, pData.address());
            for (int i = 0; i < data.length; i++) {
                data[i] = pData.getAtIndex(ValueLayout.JAVA_INT, i);
            }
        }
    }

    public static int getInteger(int pname) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pData = session.allocate(ValueLayout.JAVA_INT);
            getIntegerv(pname, pData.address());
            return pData.get(ValueLayout.JAVA_INT, 0L);
        }
    }

    public static MemoryAddress ngetString(int name) throws Throwable {
        return (MemoryAddress) check(glGetString).invoke(name);
    }

    @Nullable
    public static String getString(int name) throws Throwable {
        var pStr = ngetString(name);
        return pStr != MemoryAddress.NULL ? pStr.getUtf8String(0L) : null;
    }

    public static void getTexImage(int target, int level, int format, int type, MemoryAddress pixels) throws Throwable {
        check(glGetTexImage).invoke(target, level, format, type, pixels);
    }

    public static void getTexLevelParameterfv(int target, int level, int pname, MemoryAddress params) throws Throwable {
        check(glGetTexLevelParameterfv).invoke(target, level, pname, params);
    }

    public static void getTexLevelParameterfv(int target, int level, int pname, float[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(ValueLayout.JAVA_FLOAT, params.length);
            getTexLevelParameterfv(target, level, pname, pParams.address());
            for (int i = 0; i < params.length; i++) {
                params[i] = pParams.getAtIndex(ValueLayout.JAVA_FLOAT, i);
            }
        }
    }

    public static float getTexLevelParameterf(int target, int level, int pname) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(ValueLayout.JAVA_FLOAT);
            getTexLevelParameterfv(target, level, pname, pParams.address());
            return pParams.get(ValueLayout.JAVA_FLOAT, 0L);
        }
    }

    public static void getTexLevelParameteriv(int target, int level, int pname, MemoryAddress params) throws Throwable {
        check(glGetTexLevelParameteriv).invoke(target, level, pname, params);
    }

    public static void getTexLevelParameteriv(int target, int level, int pname, int[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(ValueLayout.JAVA_INT, params.length);
            getTexLevelParameteriv(target, level, pname, pParams.address());
            for (int i = 0; i < params.length; i++) {
                params[i] = pParams.getAtIndex(ValueLayout.JAVA_INT, i);
            }
        }
    }

    public static int getTexLevelParameteri(int target, int level, int pname) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(ValueLayout.JAVA_INT);
            getTexLevelParameteriv(target, level, pname, pParams.address());
            return pParams.get(ValueLayout.JAVA_INT, 0L);
        }
    }

    public static void getTexParameterfv(int target, int pname, MemoryAddress params) throws Throwable {
        check(glGetTexParameterfv).invoke(target, pname, params);
    }

    public static void getTexParameterfv(int target, int pname, float[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(ValueLayout.JAVA_FLOAT, params.length);
            getTexParameterfv(target, pname, pParams.address());
            for (int i = 0; i < params.length; i++) {
                params[i] = pParams.getAtIndex(ValueLayout.JAVA_FLOAT, i);
            }
        }
    }

    public static float getTexParameterf(int target, int pname) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(ValueLayout.JAVA_FLOAT);
            getTexParameterfv(target, pname, pParams.address());
            return pParams.get(ValueLayout.JAVA_FLOAT, 0L);
        }
    }

    public static void getTexParameteriv(int target, int pname, MemoryAddress params) throws Throwable {
        check(glGetTexParameteriv).invoke(target, pname, params);
    }

    public static void getTexParameteriv(int target, int pname, int[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(ValueLayout.JAVA_INT, params.length);
            getTexParameteriv(target, pname, pParams.address());
            for (int i = 0; i < params.length; i++) {
                params[i] = pParams.getAtIndex(ValueLayout.JAVA_INT, i);
            }
        }
    }

    public static int getTexParameteri(int target, int pname) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(ValueLayout.JAVA_INT);
            getTexParameteriv(target, pname, pParams.address());
            return pParams.get(ValueLayout.JAVA_INT, 0L);
        }
    }

    public static void hint(int target, int mode) throws Throwable {
        check(glHint).invoke(target, mode);
    }

    public static boolean isEnabled(int cap) throws Throwable {
        return (boolean) check(glIsEnabled).invoke(cap);
    }

    public static void lineWidth(float width) throws Throwable {
        check(glLineWidth).invoke(width);
    }

    public static void logicOp(int opcode) throws Throwable {
        check(glLogicOp).invoke(opcode);
    }

    public static void pixelStoref(int pname, float param) throws Throwable {
        check(glPixelStoref).invoke(pname, param);
    }

    public static void pixelStorei(int pname, int param) throws Throwable {
        check(glPixelStorei).invoke(pname, param);
    }

    public static void pointSize(float size) throws Throwable {
        check(glPointSize).invoke(size);
    }

    public static void polygonMode(int face, int mode) throws Throwable {
        check(glPolygonMode).invoke(face, mode);
    }

    public static void readBuffer(int src) throws Throwable {
        check(glReadBuffer).invoke(src);
    }

    public static void readPixels(int x, int y, int width, int height, int format, int type, MemoryAddress pixels) throws Throwable {
        check(glReadPixels).invoke(x, y, width, height, format, type, pixels);
    }

    public static void scissor(int x, int y, int width, int height) throws Throwable {
        check(glScissor).invoke(x, y, width, height);
    }

    public static void stencilFunc(int func, int ref, int mask) throws Throwable {
        check(glStencilFunc).invoke(func, ref, mask);
    }

    public static void stencilMask(int mask) throws Throwable {
        check(glStencilMask).invoke(mask);
    }

    public static void stencilOp(int fail, int zfail, int zpass) throws Throwable {
        check(glStencilOp).invoke(fail, zfail, zpass);
    }

    public static void texImage1D(int target, int level, int internalFormat, int width, int border, int format, int type, MemoryAddress pixels) throws Throwable {
        check(glTexImage1D).invoke(target, level, internalFormat, width, border, format, type, pixels);
    }

    public static void texImage2D(int target, int level, int internalFormat, int width, int height, int border, int format, int type, MemoryAddress pixels) throws Throwable {
        check(glTexImage2D).invoke(target, level, internalFormat, width, height, border, format, type, pixels);
    }

    public static void texParameterf(int target, int pname, float param) throws Throwable {
        check(glTexParameterf).invoke(target, pname, param);
    }

    public static void texParameterfv(int target, int pname, MemoryAddress params) throws Throwable {
        check(glTexParameterfv).invoke(target, pname, params);
    }

    public static void texParameterfv(int target, int pname, float[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(ValueLayout.JAVA_FLOAT, params);
            texParameterfv(target, pname, pParams.address());
        }
    }

    public static void texParameteri(int target, int pname, int param) throws Throwable {
        check(glTexParameteri).invoke(target, pname, param);
    }

    public static void texParameteriv(int target, int pname, MemoryAddress params) throws Throwable {
        check(glTexParameteriv).invoke(target, pname, params);
    }

    public static void texParameteriv(int target, int pname, int[] params) throws Throwable {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(ValueLayout.JAVA_INT, params);
            texParameteriv(target, pname, pParams.address());
        }
    }

    public static void viewport(int x, int y, int width, int height) throws Throwable {
        check(glViewport).invoke(x, y, width, height);
    }
}
