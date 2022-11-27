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

package org.overrun.glib.gl.ext.apple;

import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;
import org.overrun.glib.gl.GLLoader;

import java.lang.foreign.Addressable;

import static org.overrun.glib.FunctionDescriptors.IIPV;

/**
 * {@code GL_APPLE_texture_range}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAPPLETextureRange {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_APPLE_texture_range) return;
        ext.glGetTexParameterPointervAPPLE = load.invoke("glGetTexParameterPointervAPPLE", IIPV);
        ext.glTextureRangeAPPLE = load.invoke("glTextureRangeAPPLE", IIPV);
    }

    public static void glGetTexParameterPointervAPPLE(int target, int pname, Addressable params) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetTexParameterPointervAPPLE).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTextureRangeAPPLE(int target, int length, Addressable pointer) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glTextureRangeAPPLE).invokeExact(target, length, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
