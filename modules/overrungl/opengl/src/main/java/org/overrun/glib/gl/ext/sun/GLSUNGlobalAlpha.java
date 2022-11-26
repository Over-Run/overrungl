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

package org.overrun.glib.gl.ext.sun;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.invoke.MethodHandle;

import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;

/**
 * {@code GL_SUN_global_alpha}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLSUNGlobalAlpha {
    @Nullable
    public static MethodHandle glGlobalAlphaFactorbSUN, glGlobalAlphaFactordSUN, glGlobalAlphaFactorfSUN,
        glGlobalAlphaFactoriSUN, glGlobalAlphaFactorsSUN, glGlobalAlphaFactorubSUN, glGlobalAlphaFactoruiSUN,
        glGlobalAlphaFactorusSUN;

    public static void load(GLLoadFunc load) {
        if (GLExtCaps.Flags.GL_SUN_global_alpha.no()) return;
        glGlobalAlphaFactorbSUN = load.invoke("glGlobalAlphaFactorbSUN", BV);
        glGlobalAlphaFactordSUN = load.invoke("glGlobalAlphaFactordSUN", DV);
        glGlobalAlphaFactorfSUN = load.invoke("glGlobalAlphaFactorfSUN", FV);
        glGlobalAlphaFactoriSUN = load.invoke("glGlobalAlphaFactoriSUN", IV);
        glGlobalAlphaFactorsSUN = load.invoke("glGlobalAlphaFactorsSUN", SV);
        glGlobalAlphaFactorubSUN = load.invoke("glGlobalAlphaFactorubSUN", BV);
        glGlobalAlphaFactoruiSUN = load.invoke("glGlobalAlphaFactoruiSUN", IV);
        glGlobalAlphaFactorusSUN = load.invoke("glGlobalAlphaFactorusSUN", SV);
    }

    public static void glGlobalAlphaFactorbSUN(byte factor) {
        try {
            check(glGlobalAlphaFactorbSUN).invokeExact(factor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGlobalAlphaFactordSUN(double factor) {
        try {
            check(glGlobalAlphaFactordSUN).invokeExact(factor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGlobalAlphaFactorfSUN(float factor) {
        try {
            check(glGlobalAlphaFactorfSUN).invokeExact(factor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGlobalAlphaFactoriSUN(int factor) {
        try {
            check(glGlobalAlphaFactoriSUN).invokeExact(factor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGlobalAlphaFactorsSUN(short factor) {
        try {
            check(glGlobalAlphaFactorsSUN).invokeExact(factor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGlobalAlphaFactorubSUN(byte factor) {
        try {
            check(glGlobalAlphaFactorubSUN).invokeExact(factor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGlobalAlphaFactoruiSUN(int factor) {
        try {
            check(glGlobalAlphaFactoruiSUN).invokeExact(factor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGlobalAlphaFactorusSUN(short factor) {
        try {
            check(glGlobalAlphaFactorusSUN).invokeExact(factor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
