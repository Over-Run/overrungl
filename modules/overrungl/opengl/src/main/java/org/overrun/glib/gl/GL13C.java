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
import java.lang.invoke.MethodHandle;

import static org.overrun.glib.gl.GLCaps.*;

/**
 * The OpenGL 1.3 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL13C extends GL12C permits GL13, GL14C {
    @Nullable
    public static MethodHandle
        glActiveTexture, glCompressedTexImage1D, glCompressedTexImage2D, glCompressedTexImage3D,
        glCompressedTexSubImage1D, glCompressedTexSubImage2D, glCompressedTexSubImage3D, glGetCompressedTexImage,
        glSampleCoverage;

    static boolean isSupported() {
        return checkAll(glActiveTexture, glCompressedTexImage1D, glCompressedTexImage2D, glCompressedTexImage3D,
            glCompressedTexSubImage1D, glCompressedTexSubImage2D, glCompressedTexSubImage3D, glGetCompressedTexImage,
            glSampleCoverage);
    }

    static void load(GLLoadFunc load) {
        glActiveTexture = downcallSafe(load.invoke("glActiveTexture"), dIV);
        glCompressedTexImage1D = downcallSafe(load.invoke("glCompressedTexImage1D"), dIIIIIIPV);
        glCompressedTexImage2D = downcallSafe(load.invoke("glCompressedTexImage2D"), dIIIIIIIPV);
        glCompressedTexImage3D = downcallSafe(load.invoke("glCompressedTexImage3D"), dIIIIIIIIPV);
        glCompressedTexSubImage1D = downcallSafe(load.invoke("glCompressedTexSubImage1D"), dIIIIIIPV);
        glCompressedTexSubImage2D = downcallSafe(load.invoke("glCompressedTexSubImage2D"), dIIIIIIIIPV);
        glCompressedTexSubImage3D = downcallSafe(load.invoke("glCompressedTexSubImage3D"), dIIIIIIIIIIPV);
        glGetCompressedTexImage = downcallSafe(load.invoke("glGetCompressedTexImage"), dIIPV);
        glSampleCoverage = downcallSafe(load.invoke("glSampleCoverage"), dFZV);
    }

    public static void activeTexture(int texture) {
        try {
            check(glActiveTexture).invoke(texture);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void compressedTexImage1D(int target, int level, int internalFormat, int width, int border, int imageSize, Addressable data) {
        try {
            check(glCompressedTexImage1D).invoke(target, level, internalFormat, width, border, imageSize, data);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void compressedTexImage2D(int target, int level, int internalFormat, int width, int height, int border, int imageSize, Addressable data) {
        try {
            check(glCompressedTexImage2D).invoke(target, level, internalFormat, width, height, border, imageSize, data);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void compressedTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int imageSize, Addressable data) {
        try {
            check(glCompressedTexImage3D).invoke(target, level, internalFormat, width, height, depth, border, imageSize, data);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void compressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, Addressable data) {
        try {
            check(glCompressedTexSubImage1D).invoke(target, level, xoffset, width, format, imageSize, data);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, Addressable data) {
        try {
            check(glCompressedTexSubImage2D).invoke(target, level, xoffset, yoffset, width, height, format, imageSize, data);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, Addressable data) {
        try {
            check(glCompressedTexSubImage2D).invoke(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getCompressedTexImage(int target, int level, Addressable img) {
        try {
            check(glGetCompressedTexImage).invoke(target, level, img);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void sampleCoverage(float value, boolean invert) {
        try {
            check(glSampleCoverage).invoke(value, invert);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
