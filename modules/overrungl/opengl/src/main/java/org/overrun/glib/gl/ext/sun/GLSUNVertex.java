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

import java.lang.foreign.Addressable;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;

/**
 * {@code GL_SUN_vertex}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLSUNVertex {
    @Nullable
    public static MethodHandle glColor3fVertex3fSUN, glColor3fVertex3fvSUN, glColor4fNormal3fVertex3fSUN,
        glColor4fNormal3fVertex3fvSUN, glColor4ubVertex2fSUN, glColor4ubVertex2fvSUN, glColor4ubVertex3fSUN,
        glColor4ubVertex3fvSUN, glNormal3fVertex3fSUN, glNormal3fVertex3fvSUN, glReplacementCodeuiColor3fVertex3fSUN,
        glReplacementCodeuiColor3fVertex3fvSUN, glReplacementCodeuiColor4fNormal3fVertex3fSUN,
        glReplacementCodeuiColor4fNormal3fVertex3fvSUN, glReplacementCodeuiColor4ubVertex3fSUN,
        glReplacementCodeuiColor4ubVertex3fvSUN, glReplacementCodeuiNormal3fVertex3fSUN, glReplacementCodeuiNormal3fVertex3fvSUN,
        glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN, glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN,
        glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN, glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN,
        glReplacementCodeuiTexCoord2fVertex3fSUN, glReplacementCodeuiTexCoord2fVertex3fvSUN, glReplacementCodeuiVertex3fSUN,
        glReplacementCodeuiVertex3fvSUN, glTexCoord2fColor3fVertex3fSUN, glTexCoord2fColor3fVertex3fvSUN,
        glTexCoord2fColor4fNormal3fVertex3fSUN, glTexCoord2fColor4fNormal3fVertex3fvSUN, glTexCoord2fColor4ubVertex3fSUN,
        glTexCoord2fColor4ubVertex3fvSUN, glTexCoord2fNormal3fVertex3fSUN, glTexCoord2fNormal3fVertex3fvSUN,
        glTexCoord2fVertex3fSUN, glTexCoord2fVertex3fvSUN, glTexCoord4fColor4fNormal3fVertex4fSUN,
        glTexCoord4fColor4fNormal3fVertex4fvSUN, glTexCoord4fVertex4fSUN, glTexCoord4fVertex4fvSUN;

    public static void load(GLLoadFunc load) {
        if (GLExtCaps.Flags.GL_SUN_vertex.no()) return;
        glColor3fVertex3fSUN = load.invoke("glColor3fVertex3fSUN", FFFFFFV);
        glColor3fVertex3fvSUN = load.invoke("glColor3fVertex3fvSUN", PPV);
        glColor4fNormal3fVertex3fSUN = load.invoke("glColor4fNormal3fVertex3fSUN", FFFFFFFFFFV);
        glColor4fNormal3fVertex3fvSUN = load.invoke("glColor4fNormal3fVertex3fvSUN", PPPV);
        glColor4ubVertex2fSUN = load.invoke("glColor4ubVertex2fSUN", BBBBFFV);
        glColor4ubVertex2fvSUN = load.invoke("glColor4ubVertex2fvSUN", PPV);
        glColor4ubVertex3fSUN = load.invoke("glColor4ubVertex3fSUN", BBBBFFFV);
        glColor4ubVertex3fvSUN = load.invoke("glColor4ubVertex3fvSUN", PPV);
        glNormal3fVertex3fSUN = load.invoke("glNormal3fVertex3fSUN", FFFFFFV);
        glNormal3fVertex3fvSUN = load.invoke("glNormal3fVertex3fvSUN", PPV);
        glReplacementCodeuiColor3fVertex3fSUN = load.invoke("glReplacementCodeuiColor3fVertex3fSUN", IFFFFFFV);
        glReplacementCodeuiColor3fVertex3fvSUN = load.invoke("glReplacementCodeuiColor3fVertex3fvSUN", PPPV);
        glReplacementCodeuiColor4fNormal3fVertex3fSUN = load.invoke("glReplacementCodeuiColor4fNormal3fVertex3fSUN", IFFFFFFFFFFV);
        glReplacementCodeuiColor4fNormal3fVertex3fvSUN = load.invoke("glReplacementCodeuiColor4fNormal3fVertex3fvSUN", PPPPV);
        glReplacementCodeuiColor4ubVertex3fSUN = load.invoke("glReplacementCodeuiColor4ubVertex3fSUN", IBBBBFFFV);
        glReplacementCodeuiColor4ubVertex3fvSUN = load.invoke("glReplacementCodeuiColor4ubVertex3fvSUN", PPPV);
        glReplacementCodeuiNormal3fVertex3fSUN = load.invoke("glReplacementCodeuiNormal3fVertex3fSUN", IFFFFFFV);
        glReplacementCodeuiNormal3fVertex3fvSUN = load.invoke("glReplacementCodeuiNormal3fVertex3fvSUN", PPPV);
        glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN = load.invoke("glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN", IFFFFFFFFFFFFV);
        glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN = load.invoke("glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN", PPPPPV);
        glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN = load.invoke("glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN", IFFFFFFFFV);
        glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN = load.invoke("glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN", PPPPV);
        glReplacementCodeuiTexCoord2fVertex3fSUN = load.invoke("glReplacementCodeuiTexCoord2fVertex3fSUN", IFFFFFV);
        glReplacementCodeuiTexCoord2fVertex3fvSUN = load.invoke("glReplacementCodeuiTexCoord2fVertex3fvSUN", PPPV);
        glReplacementCodeuiVertex3fSUN = load.invoke("glReplacementCodeuiVertex3fSUN", IFFFV);
        glReplacementCodeuiVertex3fvSUN = load.invoke("glReplacementCodeuiVertex3fvSUN", PPV);
        glTexCoord2fColor3fVertex3fSUN = load.invoke("glTexCoord2fColor3fVertex3fSUN", FFFFFFFFV);
        glTexCoord2fColor3fVertex3fvSUN = load.invoke("glTexCoord2fColor3fVertex3fvSUN", PPPV);
        glTexCoord2fColor4fNormal3fVertex3fSUN = load.invoke("glTexCoord2fColor4fNormal3fVertex3fSUN", FFFFFFFFFFFFV);
        glTexCoord2fColor4fNormal3fVertex3fvSUN = load.invoke("glTexCoord2fColor4fNormal3fVertex3fvSUN", PPPPV);
        glTexCoord2fColor4ubVertex3fSUN = load.invoke("glTexCoord2fColor4ubVertex3fSUN", FFBBBBFFFV);
        glTexCoord2fColor4ubVertex3fvSUN = load.invoke("glTexCoord2fColor4ubVertex3fvSUN", PPPV);
        glTexCoord2fNormal3fVertex3fSUN = load.invoke("glTexCoord2fNormal3fVertex3fSUN", FFFFFFFFV);
        glTexCoord2fNormal3fVertex3fvSUN = load.invoke("glTexCoord2fNormal3fVertex3fvSUN", PPPV);
        glTexCoord2fVertex3fSUN = load.invoke("glTexCoord2fVertex3fSUN", FFFFFV);
        glTexCoord2fVertex3fvSUN = load.invoke("glTexCoord2fVertex3fvSUN", PPV);
        glTexCoord4fColor4fNormal3fVertex4fSUN = load.invoke("glTexCoord4fColor4fNormal3fVertex4fSUN", FFFFFFFFFFFFFFFV);
        glTexCoord4fColor4fNormal3fVertex4fvSUN = load.invoke("glTexCoord4fColor4fNormal3fVertex4fvSUN", PPPPV);
        glTexCoord4fVertex4fSUN = load.invoke("glTexCoord4fVertex4fSUN", FFFFFFFFV);
        glTexCoord4fVertex4fvSUN = load.invoke("glTexCoord4fVertex4fvSUN", PPV);
    }

    public static void glColor3fVertex3fSUN(float r, float g, float b, float x, float y, float z) {
        try {
            check(glColor3fVertex3fSUN).invokeExact(r, g, b, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glColor3fVertex3fvSUN(Addressable c, Addressable v) {
        try {
            check(glColor3fVertex3fvSUN).invokeExact(c, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glColor3fVertex3fvSUN(SegmentAllocator allocator, float[] c, float[] v) {
        glColor3fVertex3fvSUN(allocator.allocateArray(JAVA_FLOAT, c), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glColor4fNormal3fVertex3fSUN(float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        try {
            check(glColor4fNormal3fVertex3fSUN).invokeExact(r, g, b, a, nx, ny, nz, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glColor4fNormal3fVertex3fvSUN(Addressable c, Addressable n, Addressable v) {
        try {
            check(glColor4fNormal3fVertex3fvSUN).invokeExact(c, n, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glColor4fNormal3fVertex3fvSUN(SegmentAllocator allocator, float[] c, float[] n, float[] v) {
        glColor4fNormal3fVertex3fvSUN(allocator.allocateArray(JAVA_FLOAT, c), allocator.allocateArray(JAVA_FLOAT, n), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glColor4ubVertex2fSUN(byte r, byte g, byte b, byte a, float x, float y) {
        try {
            check(glColor4ubVertex2fSUN).invokeExact(r, g, b, a, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glColor4ubVertex2fvSUN(Addressable c, Addressable v) {
        try {
            check(glColor4ubVertex2fvSUN).invokeExact(c, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glColor4ubVertex2fvSUN(SegmentAllocator allocator, byte[] c, float[] v) {
        glColor4ubVertex2fvSUN(allocator.allocateArray(JAVA_BYTE, c), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glColor4ubVertex3fSUN(byte r, byte g, byte b, byte a, float x, float y, float z) {
        try {
            check(glColor4ubVertex3fSUN).invokeExact(r, g, b, a, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glColor4ubVertex3fvSUN(Addressable c, Addressable v) {
        try {
            check(glColor4ubVertex3fvSUN).invokeExact(c, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glColor4ubVertex3fvSUN(SegmentAllocator allocator, byte[] c, float[] v) {
        glColor4ubVertex3fvSUN(allocator.allocateArray(JAVA_BYTE, c), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glNormal3fVertex3fSUN(float nx, float ny, float nz, float x, float y, float z) {
        try {
            check(glNormal3fVertex3fSUN).invokeExact(nx, ny, nz, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glNormal3fVertex3fvSUN(Addressable n, Addressable v) {
        try {
            check(glNormal3fVertex3fvSUN).invokeExact(n, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glNormal3fVertex3fvSUN(SegmentAllocator allocator, float[] n, float[] v) {
        glNormal3fVertex3fvSUN(allocator.allocateArray(JAVA_FLOAT, n), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glReplacementCodeuiColor3fVertex3fSUN(int rc, float r, float g, float b, float x, float y, float z) {
        try {
            check(glReplacementCodeuiColor3fVertex3fSUN).invokeExact(rc, r, g, b, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuiColor3fVertex3fvSUN(Addressable rc, Addressable c, Addressable v) {
        try {
            check(glReplacementCodeuiColor3fVertex3fvSUN).invokeExact(rc, c, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuiColor3fVertex3fvSUN(SegmentAllocator allocator, int[] rc, float[] c, float[] v) {
        glReplacementCodeuiColor3fVertex3fvSUN(allocator.allocateArray(JAVA_INT, rc), allocator.allocateArray(JAVA_FLOAT, c), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glReplacementCodeuiColor4fNormal3fVertex3fSUN(int rc, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        try {
            check(glReplacementCodeuiColor4fNormal3fVertex3fSUN).invokeExact(rc, r, g, b, a, nx, ny, nz, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuiColor4fNormal3fVertex3fvSUN(Addressable rc, Addressable c, Addressable n, Addressable v) {
        try {
            check(glReplacementCodeuiColor4fNormal3fVertex3fvSUN).invokeExact(rc, c, n, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuiColor4fNormal3fVertex3fvSUN(SegmentAllocator allocator, int[] rc, float[] c, float[] n, float[] v) {
        glReplacementCodeuiColor4fNormal3fVertex3fvSUN(allocator.allocateArray(JAVA_INT, rc), allocator.allocateArray(JAVA_FLOAT, c), allocator.allocateArray(JAVA_FLOAT, n), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glReplacementCodeuiColor4ubVertex3fSUN(int rc, byte r, byte g, byte b, byte a, float x, float y, float z) {
        try {
            check(glReplacementCodeuiColor4ubVertex3fSUN).invokeExact(rc, r, g, b, a, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuiColor4ubVertex3fvSUN(Addressable rc, Addressable c, Addressable v) {
        try {
            check(glReplacementCodeuiColor4ubVertex3fvSUN).invokeExact(rc, c, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuiColor4ubVertex3fvSUN(SegmentAllocator allocator, int[] rc, byte[] c, float[] v) {
        glReplacementCodeuiColor4ubVertex3fvSUN(allocator.allocateArray(JAVA_INT, rc), allocator.allocateArray(JAVA_BYTE, c), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glReplacementCodeuiNormal3fVertex3fSUN(int rc, float nx, float ny, float nz, float x, float y, float z) {
        try {
            check(glReplacementCodeuiNormal3fVertex3fSUN).invokeExact(rc, nx, ny, nz, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuiNormal3fVertex3fvSUN(Addressable rc, Addressable n, Addressable v) {
        try {
            check(glReplacementCodeuiNormal3fVertex3fvSUN).invokeExact(rc, n, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuiNormal3fVertex3fvSUN(SegmentAllocator allocator, int[] rc, float[] n, float[] v) {
        glReplacementCodeuiNormal3fVertex3fvSUN(allocator.allocateArray(JAVA_INT, rc), allocator.allocateArray(JAVA_FLOAT, n), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN(int rc, float s, float t, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        try {
            check(glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN).invokeExact(rc, s, t, r, g, b, a, nx, ny, nz, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN(Addressable rc, Addressable tc, Addressable c, Addressable n, Addressable v) {
        try {
            check(glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN).invokeExact(rc, tc, c, n, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN(SegmentAllocator allocator, int[] rc, float[] tc, float[] c, float[] n, float[] v) {
        glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN(allocator.allocateArray(JAVA_INT, rc), allocator.allocateArray(JAVA_FLOAT, tc), allocator.allocateArray(JAVA_FLOAT, c), allocator.allocateArray(JAVA_FLOAT, n), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN(int rc, float s, float t, float nx, float ny, float nz, float x, float y, float z) {
        try {
            check(glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN).invokeExact(rc, s, t, nx, ny, nz, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN(Addressable rc, Addressable tc, Addressable n, Addressable v) {
        try {
            check(glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN).invokeExact(rc, tc, n, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN(SegmentAllocator allocator, int[] rc, float[] tc, float[] n, float[] v) {
        glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN(allocator.allocateArray(JAVA_INT, rc), allocator.allocateArray(JAVA_FLOAT, tc), allocator.allocateArray(JAVA_FLOAT, n), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glReplacementCodeuiTexCoord2fVertex3fSUN(int rc, float s, float t, float x, float y, float z) {
        try {
            check(glReplacementCodeuiTexCoord2fVertex3fSUN).invokeExact(rc, s, t, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuiTexCoord2fVertex3fvSUN(Addressable rc, Addressable tc, Addressable v) {
        try {
            check(glReplacementCodeuiTexCoord2fVertex3fvSUN).invokeExact(rc, tc, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuiTexCoord2fVertex3fvSUN(SegmentAllocator allocator, int[] rc, float[] tc, float[] v) {
        glReplacementCodeuiTexCoord2fVertex3fvSUN(allocator.allocateArray(JAVA_INT, rc), allocator.allocateArray(JAVA_FLOAT, tc), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glReplacementCodeuiVertex3fSUN(int rc, float x, float y, float z) {
        try {
            check(glReplacementCodeuiVertex3fSUN).invokeExact(rc, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuiVertex3fvSUN(Addressable rc, Addressable v) {
        try {
            check(glReplacementCodeuiVertex3fvSUN).invokeExact(rc, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuiVertex3fvSUN(SegmentAllocator allocator, int[] rc, float[] v) {
        glReplacementCodeuiVertex3fvSUN(allocator.allocateArray(JAVA_INT, rc), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glTexCoord2fColor3fVertex3fSUN(float s, float t, float r, float g, float b, float x, float y, float z) {
        try {
            check(glTexCoord2fColor3fVertex3fSUN).invokeExact(s, t, r, g, b, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTexCoord2fColor3fVertex3fvSUN(Addressable tc, Addressable c, Addressable v) {
        try {
            check(glTexCoord2fColor3fVertex3fvSUN).invokeExact(tc, c, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTexCoord2fColor3fVertex3fvSUN(SegmentAllocator allocator, float[] tc, float[] c, float[] v) {
        glTexCoord2fColor3fVertex3fvSUN(allocator.allocateArray(JAVA_FLOAT, tc), allocator.allocateArray(JAVA_FLOAT, c), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glTexCoord2fColor4fNormal3fVertex3fSUN(float s, float t, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        try {
            check(glTexCoord2fColor4fNormal3fVertex3fSUN).invokeExact(s, t, r, g, b, a, nx, ny, nz, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTexCoord2fColor4fNormal3fVertex3fvSUN(Addressable tc, Addressable c, Addressable n, Addressable v) {
        try {
            check(glTexCoord2fColor4fNormal3fVertex3fvSUN).invokeExact(tc, c, n, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTexCoord2fColor4fNormal3fVertex3fvSUN(SegmentAllocator allocator, float[] tc, float[] c, float[] n, float[] v) {
        glTexCoord2fColor4fNormal3fVertex3fvSUN(allocator.allocateArray(JAVA_FLOAT, tc), allocator.allocateArray(JAVA_FLOAT, c), allocator.allocateArray(JAVA_FLOAT, n), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glTexCoord2fColor4ubVertex3fSUN(float s, float t, byte r, byte g, byte b, byte a, float x, float y, float z) {
        try {
            check(glTexCoord2fColor4ubVertex3fSUN).invokeExact(s, t, r, g, b, a, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTexCoord2fColor4ubVertex3fvSUN(Addressable tc, Addressable c, Addressable v) {
        try {
            check(glTexCoord2fColor4ubVertex3fvSUN).invokeExact(tc, c, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTexCoord2fColor4ubVertex3fvSUN(SegmentAllocator allocator, float[] tc, byte[] c, float[] v) {
        glTexCoord2fColor4ubVertex3fvSUN(allocator.allocateArray(JAVA_FLOAT, tc), allocator.allocateArray(JAVA_BYTE, c), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glTexCoord2fNormal3fVertex3fSUN(float s, float t, float nx, float ny, float nz, float x, float y, float z) {
        try {
            check(glTexCoord2fNormal3fVertex3fSUN).invokeExact(s, t, nx, ny, nz, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTexCoord2fNormal3fVertex3fvSUN(Addressable tc, Addressable n, Addressable v) {
        try {
            check(glTexCoord2fNormal3fVertex3fvSUN).invokeExact(tc, n, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTexCoord2fNormal3fVertex3fvSUN(SegmentAllocator allocator, float[] tc, float[] n, float[] v) {
        glTexCoord2fNormal3fVertex3fvSUN(allocator.allocateArray(JAVA_FLOAT, tc), allocator.allocateArray(JAVA_FLOAT, n), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glTexCoord2fVertex3fSUN(float s, float t, float x, float y, float z) {
        try {
            check(glTexCoord2fVertex3fSUN).invokeExact(s, t, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTexCoord2fVertex3fvSUN(Addressable tc, Addressable v) {
        try {
            check(glTexCoord2fVertex3fvSUN).invokeExact(tc, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTexCoord2fVertex3fvSUN(SegmentAllocator allocator, float[] tc, float[] v) {
        glTexCoord2fVertex3fvSUN(allocator.allocateArray(JAVA_FLOAT, tc), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glTexCoord4fColor4fNormal3fVertex4fSUN(float s, float t, float p, float q, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z, float w) {
        try {
            check(glTexCoord4fColor4fNormal3fVertex4fSUN).invokeExact(s, t, p, q, r, g, b, a, nx, ny, nz, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTexCoord4fColor4fNormal3fVertex4fvSUN(Addressable tc, Addressable c, Addressable n, Addressable v) {
        try {
            check(glTexCoord4fColor4fNormal3fVertex4fvSUN).invokeExact(tc, c, n, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTexCoord4fColor4fNormal3fVertex4fvSUN(SegmentAllocator allocator, float[] tc, float[] c, float[] n, float[] v) {
        glTexCoord4fColor4fNormal3fVertex4fvSUN(allocator.allocateArray(JAVA_FLOAT, tc), allocator.allocateArray(JAVA_FLOAT, c), allocator.allocateArray(JAVA_FLOAT, n), allocator.allocateArray(JAVA_FLOAT, v));
    }

    public static void glTexCoord4fVertex4fSUN(float s, float t, float p, float q, float x, float y, float z, float w) {
        try {
            check(glTexCoord4fVertex4fSUN).invokeExact(s, t, p, q, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTexCoord4fVertex4fvSUN(Addressable tc, Addressable v) {
        try {
            check(glTexCoord4fVertex4fvSUN).invokeExact(tc, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTexCoord4fVertex4fvSUN(SegmentAllocator allocator, float[] tc, float[] v) {
        glTexCoord4fVertex4fvSUN(allocator.allocateArray(JAVA_FLOAT, tc), allocator.allocateArray(JAVA_FLOAT, v));
    }
}
