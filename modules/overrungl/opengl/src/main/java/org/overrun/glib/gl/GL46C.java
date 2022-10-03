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

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLCaps.check;
import static org.overrun.glib.gl.GLCaps.checkAll;

/**
 * The OpenGL 4.6 core profile functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL46C extends GL45C permits GL {
    @Nullable
    public static MethodHandle
        glMultiDrawArraysIndirectCount, glMultiDrawElementsIndirectCount, glPolygonOffsetClamp, glSpecializeShader;

    static boolean isSupported() {
        return checkAll(glMultiDrawArraysIndirectCount, glMultiDrawElementsIndirectCount, glPolygonOffsetClamp,
            glSpecializeShader);
    }

    static void load(GLLoadFunc load) {
        glMultiDrawArraysIndirectCount = load.invoke("glMultiDrawArraysIndirectCount", IPJIIV);
        glMultiDrawElementsIndirectCount = load.invoke("glMultiDrawElementsIndirectCount", IIPJIIV);
        glPolygonOffsetClamp = load.invoke("glPolygonOffsetClamp", FFFV);
        glSpecializeShader = load.invoke("glSpecializeShader", IPIPPV);
    }

    public static void multiDrawArraysIndirectCount(int mode, Addressable indirect, long drawCount, int maxDrawCount, int stride) {
        try {
            check(glMultiDrawArraysIndirectCount).invoke(mode, indirect, drawCount, maxDrawCount, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void multiDrawElementsIndirectCount(int mode, int type, Addressable indirect, long drawCount, int maxDrawCount, int stride) {
        try {
            check(glMultiDrawElementsIndirectCount).invoke(mode, type, indirect, drawCount, maxDrawCount, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void polygonOffsetClamp(float factor, float units, float clamp) {
        try {
            check(glPolygonOffsetClamp).invoke(factor, units, clamp);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void specializeShader(int shader, Addressable pEntryPoint, int numSpecializationConstants, Addressable pConstantIndex, Addressable pConstantValue) {
        try {
            check(glSpecializeShader).invoke(shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void specializeShader(int shader, @Nullable String pEntryPoint, int @Nullable [] pConstantIndex, int @Nullable [] pConstantValue) {
        try (var session = MemorySession.openShared()) {
            specializeShader(shader,
                pEntryPoint != null ? session.allocateUtf8String(pEntryPoint) : MemoryAddress.NULL,
                pConstantIndex != null ? pConstantIndex.length : (pConstantValue != null ? pConstantValue.length : 0),
                pConstantIndex != null ? session.allocateArray(ValueLayout.JAVA_INT, pConstantIndex) : MemoryAddress.NULL,
                pConstantValue != null ? session.allocateArray(ValueLayout.JAVA_INT, pConstantValue) : MemoryAddress.NULL);
        }
    }

    public static void specializeShader(int shader, @Nullable String pEntryPoint) {
        try (var session = MemorySession.openShared()) {
            specializeShader(shader,
                pEntryPoint != null ? session.allocateUtf8String(pEntryPoint) : MemoryAddress.NULL,
                0,
                MemoryAddress.NULL,
                MemoryAddress.NULL);
        }
    }
}
