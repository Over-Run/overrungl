package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static org.overrun.glib.gl.GLCaps.*;

/**
 * The OpenGL 1.4 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL14C extends GL13C permits GL14, GL15C {
    @Nullable
    public static MethodHandle
        glBlendColor, glBlendEquation, glBlendFuncSeparate,
        glMultiDrawArrays, glMultiDrawElements,
        glPointParameterf, glPointParameterfv,
        glPointParameteri, glPointParameteriv;

    static boolean isSupported() {
        return checkAll(glBlendColor, glBlendEquation, glBlendFuncSeparate, glMultiDrawArrays,
            glMultiDrawElements, glPointParameterf, glPointParameterfv, glPointParameteri,
            glPointParameteriv);
    }

    static void load(GLLoadFunc load) {
        glBlendColor = downcallSafe(load.invoke("glBlendColor"), dFFFFV);
        glBlendEquation = downcallSafe(load.invoke("glBlendEquation"), dIV);
        glBlendFuncSeparate = downcallSafe(load.invoke("glBlendFuncSeparate"), dIIIIV);
        glMultiDrawArrays = downcallSafe(load.invoke("glMultiDrawArrays"), dIPPIV);
        glMultiDrawElements = downcallSafe(load.invoke("glMultiDrawElements"), dIPIPIV);
        glPointParameterf = downcallSafe(load.invoke("glPointParameterf"), dIFV);
        glPointParameterfv = downcallSafe(load.invoke("glPointParameterfv"), dIPV);
        glPointParameteri = downcallSafe(load.invoke("glPointParameteri"), dIIV);
        glPointParameteriv = downcallSafe(load.invoke("glPointParameteriv"), dIPV);
    }

    public static void blendColor(float red, float green, float blue, float alpha) {
        try {
            check(glBlendColor).invoke(red, green, blue, alpha);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void blendEquation(int mode) {
        try {
            check(glBlendEquation).invoke(mode);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void blendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
        try {
            check(glBlendFuncSeparate).invoke(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void multiDrawArrays(int mode, Addressable first, Addressable count, int drawCount) {
        try {
            check(glMultiDrawArrays).invoke(mode, first, count, drawCount);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void multiDrawArrays(int mode, int[] first, int[] count, int drawCount) {
        try (var session = MemorySession.openShared()) {
            multiDrawArrays(mode, session.allocateArray(ValueLayout.JAVA_INT, first), session.allocateArray(ValueLayout.JAVA_INT, count), drawCount);
        }
    }

    public static void multiDrawArrays(int mode, int[] first, int[] count) {
        multiDrawArrays(mode, first, count, Math.min(first.length, count.length));
    }

    public static void multiDrawElements(int mode, Addressable count, int type, Addressable indices, int drawCount) {
        try {
            check(glMultiDrawElements).invoke(mode, count, type, indices, drawCount);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void multiDrawElements(int mode, int[] count, int type, byte[] indices, int drawCount) {
        try (var session = MemorySession.openShared()) {
            multiDrawElements(mode, session.allocateArray(ValueLayout.JAVA_INT, count), type, session.allocateArray(ValueLayout.JAVA_BYTE, indices), drawCount);
        }
    }

    public static void multiDrawElements(int mode, int[] count, int type, byte[] indices) {
        multiDrawElements(mode, count, type, indices, Math.min(count.length, indices.length));
    }

    public static void multiDrawElements(int mode, int[] count, int type, short[] indices, int drawCount) {
        try (var session = MemorySession.openShared()) {
            multiDrawElements(mode, session.allocateArray(ValueLayout.JAVA_INT, count), type, session.allocateArray(ValueLayout.JAVA_SHORT, indices), drawCount);
        }
    }

    public static void multiDrawElements(int mode, int[] count, int type, short[] indices) {
        multiDrawElements(mode, count, type, indices, Math.min(count.length, indices.length));
    }

    public static void multiDrawElements(int mode, int[] count, int type, int[] indices, int drawCount) {
        try (var session = MemorySession.openShared()) {
            multiDrawElements(mode, session.allocateArray(ValueLayout.JAVA_INT, count), type, session.allocateArray(ValueLayout.JAVA_INT, indices), drawCount);
        }
    }

    public static void multiDrawElements(int mode, int[] count, int type, int[] indices) {
        multiDrawElements(mode, count, type, indices, Math.min(count.length, indices.length));
    }

    public static void pointParameterf(int pname, float param) {
        try {
            check(glPointParameterf).invoke(pname, param);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void pointParameterfv(int pname, Addressable params) {
        try {
            check(glPointParameterfv).invoke(pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void pointParameterfv(int pname, float[] params) {
        try (var session = MemorySession.openShared()) {
            pointParameterfv(pname, session.allocateArray(ValueLayout.JAVA_FLOAT, params));
        }
    }

    public static void pointParameteri(int pname, int param) {
        try {
            check(glPointParameteri).invoke(pname, param);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void pointParameteriv(int pname, Addressable params) {
        try {
            check(glPointParameteriv).invoke(pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void pointParameteriv(int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            pointParameteriv(pname, session.allocateArray(ValueLayout.JAVA_INT, params));
        }
    }
}
