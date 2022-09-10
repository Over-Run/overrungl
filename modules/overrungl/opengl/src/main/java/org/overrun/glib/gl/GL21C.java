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
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static org.overrun.glib.gl.GLCaps.*;

/**
 * The OpenGL 2.1 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL21C extends GL20C permits GL30C {
    @Nullable
    public static MethodHandle
        glUniformMatrix2x3fv, glUniformMatrix2x4fv, glUniformMatrix3x2fv, glUniformMatrix3x4fv, glUniformMatrix4x2fv,
        glUniformMatrix4x3fv;

    static boolean isSupported() {
        return checkAll(glUniformMatrix2x3fv, glUniformMatrix2x4fv, glUniformMatrix3x2fv, glUniformMatrix3x4fv,
            glUniformMatrix4x2fv, glUniformMatrix4x3fv);
    }

    static void load(GLLoadFunc load) {
        glUniformMatrix2x3fv = downcallSafe(load.invoke("glUniformMatrix2x3fv"), dIIZPV);
        glUniformMatrix2x4fv = downcallSafe(load.invoke("glUniformMatrix2x4fv"), dIIZPV);
        glUniformMatrix3x2fv = downcallSafe(load.invoke("glUniformMatrix3x2fv"), dIIZPV);
        glUniformMatrix3x4fv = downcallSafe(load.invoke("glUniformMatrix3x4fv"), dIIZPV);
        glUniformMatrix4x2fv = downcallSafe(load.invoke("glUniformMatrix4x2fv"), dIIZPV);
        glUniformMatrix4x3fv = downcallSafe(load.invoke("glUniformMatrix4x3fv"), dIIZPV);
    }

    public static void uniformMatrix2x3fv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix2x3fv).invoke(location, count, transpose, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniformMatrix2x3fv(int location, int count, boolean transpose, float[] value) {
        try (var session = MemorySession.openShared()) {
            uniformMatrix2x3fv(location, count, transpose, session.allocateArray(ValueLayout.JAVA_FLOAT, value));
        }
    }

    public static void uniformMatrix2x3fv(int location, boolean transpose, float[] value) {
        uniformMatrix2x3fv(location, value.length / 6, transpose, value);
    }

    public static void uniformMatrix2x4fv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix2x4fv).invoke(location, count, transpose, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniformMatrix2x4fv(int location, int count, boolean transpose, float[] value) {
        try (var session = MemorySession.openShared()) {
            uniformMatrix2x4fv(location, count, transpose, session.allocateArray(ValueLayout.JAVA_FLOAT, value));
        }
    }

    public static void uniformMatrix2x4fv(int location, boolean transpose, float[] value) {
        uniformMatrix2x4fv(location, value.length >> 3, transpose, value);
    }

    public static void uniformMatrix3x2fv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix3x2fv).invoke(location, count, transpose, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniformMatrix3x2fv(int location, int count, boolean transpose, float[] value) {
        try (var session = MemorySession.openShared()) {
            uniformMatrix3x2fv(location, count, transpose, session.allocateArray(ValueLayout.JAVA_FLOAT, value));
        }
    }

    public static void uniformMatrix3x2fv(int location, boolean transpose, float[] value) {
        uniformMatrix3x2fv(location, value.length / 6, transpose, value);
    }

    public static void uniformMatrix3x4fv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix3x4fv).invoke(location, count, transpose, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniformMatrix3x4fv(int location, int count, boolean transpose, float[] value) {
        try (var session = MemorySession.openShared()) {
            uniformMatrix3x4fv(location, count, transpose, session.allocateArray(ValueLayout.JAVA_FLOAT, value));
        }
    }

    public static void uniformMatrix3x4fv(int location, boolean transpose, float[] value) {
        uniformMatrix3x4fv(location, value.length / 12, transpose, value);
    }

    public static void uniformMatrix4x2fv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix4x2fv).invoke(location, count, transpose, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniformMatrix4x2fv(int location, int count, boolean transpose, float[] value) {
        try (var session = MemorySession.openShared()) {
            uniformMatrix4x2fv(location, count, transpose, session.allocateArray(ValueLayout.JAVA_FLOAT, value));
        }
    }

    public static void uniformMatrix4x2fv(int location, boolean transpose, float[] value) {
        uniformMatrix4x2fv(location, value.length >> 3, transpose, value);
    }

    public static void uniformMatrix4x3fv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix4x3fv).invoke(location, count, transpose, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniformMatrix4x3fv(int location, int count, boolean transpose, float[] value) {
        try (var session = MemorySession.openShared()) {
            uniformMatrix4x3fv(location, count, transpose, session.allocateArray(ValueLayout.JAVA_FLOAT, value));
        }
    }

    public static void uniformMatrix4x3fv(int location, boolean transpose, float[] value) {
        uniformMatrix4x3fv(location, value.length / 12, transpose, value);
    }
}
