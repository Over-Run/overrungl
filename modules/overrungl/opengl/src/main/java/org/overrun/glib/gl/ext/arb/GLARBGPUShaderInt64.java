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

import java.lang.foreign.MemorySegment;

import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;
import static org.overrun.glib.gl.GLLoader.getExtCapabilities;

/**
 * {@code GL_ARB_gpu_shader_int64}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLARBGPUShaderInt64 {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_gpu_shader_int64) return;
        ext.glGetUniformi64vARB = load.invoke("glGetUniformi64vARB", IIPV);
        ext.glGetUniformui64vARB = load.invoke("glGetUniformui64vARB", IIPV);
        ext.glGetnUniformi64vARB = load.invoke("glGetnUniformi64vARB", IIIPV);
        ext.glGetnUniformui64vARB = load.invoke("glGetnUniformui64vARB", IIIPV);
        ext.glProgramUniform1i64ARB = load.invoke("glProgramUniform1i64ARB", IIJV);
        ext.glProgramUniform1i64vARB = load.invoke("glProgramUniform1i64vARB", IIIPV);
        ext.glProgramUniform1ui64ARB = load.invoke("glProgramUniform1ui64ARB", IIJV);
        ext.glProgramUniform1ui64vARB = load.invoke("glProgramUniform1ui64vARB", IIIPV);
        ext.glProgramUniform2i64ARB = load.invoke("glProgramUniform2i64ARB", IIJJV);
        ext.glProgramUniform2i64vARB = load.invoke("glProgramUniform2i64vARB", IIIPV);
        ext.glProgramUniform2ui64ARB = load.invoke("glProgramUniform2ui64ARB", IIJJV);
        ext.glProgramUniform2ui64vARB = load.invoke("glProgramUniform2ui64vARB", IIIPV);
        ext.glProgramUniform3i64ARB = load.invoke("glProgramUniform3i64ARB", IIJJJV);
        ext.glProgramUniform3i64vARB = load.invoke("glProgramUniform3i64vARB", IIIPV);
        ext.glProgramUniform3ui64ARB = load.invoke("glProgramUniform3ui64ARB", IIJJJV);
        ext.glProgramUniform3ui64vARB = load.invoke("glProgramUniform3ui64vARB", IIIPV);
        ext.glProgramUniform4i64ARB = load.invoke("glProgramUniform4i64ARB", IIJJJJV);
        ext.glProgramUniform4i64vARB = load.invoke("glProgramUniform4i64vARB", IIIPV);
        ext.glProgramUniform4ui64ARB = load.invoke("glProgramUniform4ui64ARB", IIJJJJV);
        ext.glProgramUniform4ui64vARB = load.invoke("glProgramUniform4ui64vARB", IIIPV);
        ext.glUniform1i64ARB = load.invoke("glUniform1i64ARB", IJV);
        ext.glUniform1i64vARB = load.invoke("glUniform1i64vARB", IIPV);
        ext.glUniform1ui64ARB = load.invoke("glUniform1ui64ARB", IJV);
        ext.glUniform1ui64vARB = load.invoke("glUniform1ui64vARB", IIPV);
        ext.glUniform2i64ARB = load.invoke("glUniform2i64ARB", IJJV);
        ext.glUniform2i64vARB = load.invoke("glUniform2i64vARB", IIPV);
        ext.glUniform2ui64ARB = load.invoke("glUniform2ui64ARB", IJJV);
        ext.glUniform2ui64vARB = load.invoke("glUniform2ui64vARB", IIPV);
        ext.glUniform3i64ARB = load.invoke("glUniform3i64ARB", IJJJV);
        ext.glUniform3i64vARB = load.invoke("glUniform3i64vARB", IIPV);
        ext.glUniform3ui64ARB = load.invoke("glUniform3ui64ARB", IJJJV);
        ext.glUniform3ui64vARB = load.invoke("glUniform3ui64vARB", IIPV);
        ext.glUniform4i64ARB = load.invoke("glUniform4i64ARB", IJJJJV);
        ext.glUniform4i64vARB = load.invoke("glUniform4i64vARB", IIPV);
        ext.glUniform4ui64ARB = load.invoke("glUniform4ui64ARB", IJJJJV);
        ext.glUniform4ui64vARB = load.invoke("glUniform4ui64vARB", IIPV);
    }

    public static void glGetUniformi64vARB(int program, int location, MemorySegment params) {
        var ext = getExtCapabilities();
        try {
            check(ext.glGetUniformi64vARB).invokeExact(program, location, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetUniformui64vARB(int program, int location, MemorySegment params) {
        var ext = getExtCapabilities();
        try {
            check(ext.glGetUniformui64vARB).invokeExact(program, location, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetnUniformi64vARB(int program, int location, int bufSize, MemorySegment params) {
        var ext = getExtCapabilities();
        try {
            check(ext.glGetnUniformi64vARB).invokeExact(program, location, bufSize, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetnUniformui64vARB(int program, int location, int bufSize, MemorySegment params) {
        var ext = getExtCapabilities();
        try {
            check(ext.glGetnUniformui64vARB).invokeExact(program, location, bufSize, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniform1i64ARB(int program, int location, long x) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1i64ARB).invokeExact(program, location, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniform1i64vARB(int program, int location, int count, MemorySegment value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1i64vARB).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniform1ui64ARB(int program, int location, long x) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1ui64ARB).invokeExact(program, location, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniform1ui64vARB(int program, int location, int count, MemorySegment value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1ui64vARB).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniform2i64ARB(int program, int location, long x, long y) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2i64ARB).invokeExact(program, location, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniform2i64vARB(int program, int location, int count, MemorySegment value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2i64vARB).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniform2ui64ARB(int program, int location, long x, long y) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2ui64ARB).invokeExact(program, location, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniform2ui64vARB(int program, int location, int count, MemorySegment value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2ui64vARB).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniform3i64ARB(int program, int location, long x, long y, long z) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3i64ARB).invokeExact(program, location, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniform3i64vARB(int program, int location, int count, MemorySegment value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3i64vARB).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniform3ui64ARB(int program, int location, long x, long y, long z) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3ui64ARB).invokeExact(program, location, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniform3ui64vARB(int program, int location, int count, MemorySegment value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3ui64vARB).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniform4i64ARB(int program, int location, long x, long y, long z, long w) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4i64ARB).invokeExact(program, location, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniform4i64vARB(int program, int location, int count, MemorySegment value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4i64vARB).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniform4ui64ARB(int program, int location, long x, long y, long z, long w) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4ui64ARB).invokeExact(program, location, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniform4ui64vARB(int program, int location, int count, MemorySegment value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4ui64vARB).invokeExact(program, location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUniform1i64ARB(int location, long x) {
        var ext = getExtCapabilities();
        try {
            check(ext.glUniform1i64ARB).invokeExact(location, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUniform1i64vARB(int location, int count, MemorySegment value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glUniform1i64vARB).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUniform1ui64ARB(int location, long x) {
        var ext = getExtCapabilities();
        try {
            check(ext.glUniform1ui64ARB).invokeExact(location, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUniform1ui64vARB(int location, int count, MemorySegment value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glUniform1ui64vARB).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUniform2i64ARB(int location, long x, long y) {
        var ext = getExtCapabilities();
        try {
            check(ext.glUniform2i64ARB).invokeExact(location, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUniform2i64vARB(int location, int count, MemorySegment value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glUniform2i64vARB).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUniform2ui64ARB(int location, long x, long y) {
        var ext = getExtCapabilities();
        try {
            check(ext.glUniform2ui64ARB).invokeExact(location, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUniform2ui64vARB(int location, int count, MemorySegment value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glUniform2ui64vARB).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUniform3i64ARB(int location, long x, long y, long z) {
        var ext = getExtCapabilities();
        try {
            check(ext.glUniform3i64ARB).invokeExact(location, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUniform3i64vARB(int location, int count, MemorySegment value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glUniform3i64vARB).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUniform3ui64ARB(int location, long x, long y, long z) {
        var ext = getExtCapabilities();
        try {
            check(ext.glUniform3ui64ARB).invokeExact(location, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUniform3ui64vARB(int location, int count, MemorySegment value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glUniform3ui64vARB).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUniform4i64ARB(int location, long x, long y, long z, long w) {
        var ext = getExtCapabilities();
        try {
            check(ext.glUniform4i64ARB).invokeExact(location, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUniform4i64vARB(int location, int count, MemorySegment value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glUniform4i64vARB).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUniform4ui64ARB(int location, long x, long y, long z, long w) {
        var ext = getExtCapabilities();
        try {
            check(ext.glUniform4ui64ARB).invokeExact(location, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUniform4ui64vARB(int location, int count, MemorySegment value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glUniform4ui64vARB).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
