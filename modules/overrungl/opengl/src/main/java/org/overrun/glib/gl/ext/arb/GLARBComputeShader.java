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

package org.overrun.glib.gl.ext.arb;

import org.overrun.glib.FunctionDescriptors;
import org.overrun.glib.gl.GL43C;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

/**
 * {@code GL_ARB_compute_shader}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLARBComputeShader {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_compute_shader) return;
        ext.caps.glDispatchCompute = load.invoke("glDispatchCompute", FunctionDescriptors.IIIV);
        ext.caps.glDispatchComputeIndirect = load.invoke("glDispatchComputeIndirect", FunctionDescriptors.JV);
    }

    public static void glDispatchCompute(int numGroupsX, int numGroupsY, int numGroupsZ) {
        GL43C.dispatchCompute(numGroupsX, numGroupsY, numGroupsZ);
    }

    public static void glDispatchComputeIndirect(long indirect) {
        GL43C.dispatchComputeIndirect(indirect);
    }
}
