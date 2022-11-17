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

package org.overrun.glib.gl.ext.amd;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.invoke.MethodHandle;

import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLCaps.check;

/**
 * {@code GL_AMD_draw_buffers_blend}
 *
 * @author squid233
 * @since 0.1.0
 */
public class GLAMDDrawBuffersBlend {
    @Nullable
    public static MethodHandle
        glBlendEquationIndexedAMD, glBlendEquationSeparateIndexedAMD, glBlendFuncIndexedAMD, glBlendFuncSeparateIndexedAMD;

    public static void load(GLLoadFunc load) {
        if (GLExtCaps.Flags.GL_AMD_draw_buffers_blend.no()) return;
        glBlendEquationIndexedAMD = load.invoke("glBlendEquationIndexedAMD", IIV);
        glBlendEquationSeparateIndexedAMD = load.invoke("glBlendEquationSeparateIndexedAMD", IIIV);
        glBlendFuncIndexedAMD = load.invoke("glBlendFuncIndexedAMD", IIIV);
        glBlendFuncSeparateIndexedAMD = load.invoke("glBlendFuncSeparateIndexedAMD", IIIIIV);
    }

    public static void glBlendEquationIndexedAMD(int buf, int mode) {
        try {
            check(glBlendEquationIndexedAMD).invokeExact(buf, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glBlendEquationSeparateIndexedAMD(int buf, int modeRGB, int modeAlpha) {
        try {
            check(glBlendEquationSeparateIndexedAMD).invokeExact(buf, modeRGB, modeAlpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glBlendFuncIndexedAMD(int buf, int src, int dst) {
        try {
            check(glBlendFuncIndexedAMD).invokeExact(buf, src, dst);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glBlendFuncSeparateIndexedAMD(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        try {
            check(glBlendFuncSeparateIndexedAMD).invokeExact(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
