/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

package org.overrun.glib.gl.ext.arb;

import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;
import static org.overrun.glib.gl.GLLoader.getExtCapabilities;

/**
 * {@code GL_ARB_geometry_shader4}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLARBGeometryShader4 {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_geometry_shader4) return;
        ext.glFramebufferTextureARB = load.invoke("glFramebufferTextureARB", IIIIV);
        ext.glFramebufferTextureFaceARB = load.invoke("glFramebufferTextureFaceARB", IIIIIV);
        ext.glFramebufferTextureLayerARB = load.invoke("glFramebufferTextureLayerARB", IIIIIV);
        ext.glProgramParameteriARB = load.invoke("glProgramParameteriARB", IIIV);
    }

    public static void glFramebufferTextureARB(int target, int attachment, int texture, int level) {
        var ext = getExtCapabilities();
        try {
            check(ext.glFramebufferTextureARB).invokeExact(target, attachment, texture, level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glFramebufferTextureFaceARB(int target, int attachment, int texture, int level, int face) {
        var ext = getExtCapabilities();
        try {
            check(ext.glFramebufferTextureFaceARB).invokeExact(target, attachment, texture, level, face);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glFramebufferTextureLayerARB(int target, int attachment, int texture, int level, int layer) {
        var ext = getExtCapabilities();
        try {
            check(ext.glFramebufferTextureLayerARB).invokeExact(target, attachment, texture, level, layer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramParameteriARB(int program, int pname, int value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramParameteriARB).invokeExact(program, pname, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
