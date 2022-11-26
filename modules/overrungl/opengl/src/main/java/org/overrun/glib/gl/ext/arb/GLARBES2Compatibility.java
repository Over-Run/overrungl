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

import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GL41C.*;

/**
 * {@code GL_ARB_ES2_compatibility}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLARBES2Compatibility {
    public static void load(GLLoadFunc load) {
        if (GLExtCaps.Flags.GL_ARB_ES2_compatibility.no()) return;
        glClearDepthf = load.invoke("glClearDepthf", FV);
        glDepthRangef = load.invoke("glDepthRangef", FFV);
        glGetShaderPrecisionFormat = load.invoke("glGetShaderPrecisionFormat", IIPPV);
        glReleaseShaderCompiler = load.invoke("glReleaseShaderCompiler", V);
        glShaderBinary = load.invoke("glShaderBinary", IPIPIV);
    }

    public static void glClearDepthf(float d) {
        clearDepthf(d);
    }

    public static void glDepthRangef(float n, float f) {
        depthRangef(n, f);
    }

    public static void glGetShaderPrecisionFormat(int shaderType, int precisionType, Addressable range, Addressable precision) {
        getShaderPrecisionFormat(shaderType, precisionType, range, precision);
    }

    public static void glGetShaderPrecisionFormat(SegmentAllocator allocator, int shaderType, int precisionType, int[] range, int[] precision) {
        getShaderPrecisionFormat(allocator, shaderType, precisionType, range, precision);
    }

    public static void glReleaseShaderCompiler() {
        releaseShaderCompiler();
    }

    public static void glShaderBinary(int count, Addressable shaders, int binaryFormat, Addressable binary, int length) {
        shaderBinary(count, shaders, binaryFormat, binary, length);
    }

    public static void glShaderBinary(SegmentAllocator allocator, int[] shaders, int binaryFormat, Addressable binary, int length) {
        shaderBinary(allocator, shaders, binaryFormat, binary, length);
    }

    public static void glShaderBinary(SegmentAllocator allocator, int[] shaders, int binaryFormat, MemorySegment binary) {
        shaderBinary(allocator, shaders, binaryFormat, binary);
    }
}
