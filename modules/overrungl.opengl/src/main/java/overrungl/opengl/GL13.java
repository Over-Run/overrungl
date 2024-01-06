/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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
 */

package overrungl.opengl;

import overrungl.opengl.ext.arb.GLARBTransposeMatrix;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.FunctionDescriptors.*;
import static overrungl.opengl.GLLoader.check;
import static overrungl.opengl.GLLoader.getCapabilities;

/**
 * The OpenGL 1.3 functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>{@linkplain GLARBTransposeMatrix GL_ARB_transpose_matrix}</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL13 extends GL13C {
    public static final int CLIENT_ACTIVE_TEXTURE = 0x84E1;
    public static final int MAX_TEXTURE_UNITS = 0x84E2;
    public static final int TRANSPOSE_MODELVIEW_MATRIX = 0x84E3;
    public static final int TRANSPOSE_PROJECTION_MATRIX = 0x84E4;
    public static final int TRANSPOSE_TEXTURE_MATRIX = 0x84E5;
    public static final int TRANSPOSE_COLOR_MATRIX = 0x84E6;
    public static final int MULTISAMPLE_BIT = 0x20000000;
    public static final int NORMAL_MAP = 0x8511;
    public static final int REFLECTION_MAP = 0x8512;
    public static final int COMPRESSED_ALPHA = 0x84E9;
    public static final int COMPRESSED_LUMINANCE = 0x84EA;
    public static final int COMPRESSED_LUMINANCE_ALPHA = 0x84EB;
    public static final int COMPRESSED_INTENSITY = 0x84EC;
    public static final int COMBINE = 0x8570;
    public static final int COMBINE_RGB = 0x8571;
    public static final int COMBINE_ALPHA = 0x8572;
    public static final int SOURCE0_RGB = 0x8580;
    public static final int SOURCE1_RGB = 0x8581;
    public static final int SOURCE2_RGB = 0x8582;
    public static final int SOURCE0_ALPHA = 0x8588;
    public static final int SOURCE1_ALPHA = 0x8589;
    public static final int SOURCE2_ALPHA = 0x858A;
    public static final int OPERAND0_RGB = 0x8590;
    public static final int OPERAND1_RGB = 0x8591;
    public static final int OPERAND2_RGB = 0x8592;
    public static final int OPERAND0_ALPHA = 0x8598;
    public static final int OPERAND1_ALPHA = 0x8599;
    public static final int OPERAND2_ALPHA = 0x859A;
    public static final int RGB_SCALE = 0x8573;
    public static final int ADD_SIGNED = 0x8574;
    public static final int INTERPOLATE = 0x8575;
    public static final int SUBTRACT = 0x84E7;
    public static final int CONSTANT = 0x8576;
    public static final int PRIMARY_COLOR = 0x8577;
    public static final int PREVIOUS = 0x8578;
    public static final int DOT3_RGB = 0x86AE;
    public static final int DOT3_RGBA = 0x86AF;

    static void load(GLCapabilities caps, GLLoadFunc load) {
        if (!caps.Ver13) return;
        caps.glClientActiveTexture = load.invoke("glClientActiveTexture", IV);
        caps.glLoadTransposeMatrixd = load.invoke("glLoadTransposeMatrixd", PV);
        caps.glLoadTransposeMatrixf = load.invoke("glLoadTransposeMatrixf", PV);
        caps.glMultTransposeMatrixd = load.invoke("glMultTransposeMatrixd", PV);
        caps.glMultTransposeMatrixf = load.invoke("glMultTransposeMatrixf", PV);
        caps.glMultiTexCoord1d = load.invoke("glMultiTexCoord1d", IDV);
        caps.glMultiTexCoord1dv = load.invoke("glMultiTexCoord1dv", IPV);
        caps.glMultiTexCoord1f = load.invoke("glMultiTexCoord1f", IFV);
        caps.glMultiTexCoord1fv = load.invoke("glMultiTexCoord1fv", IPV);
        caps.glMultiTexCoord1i = load.invoke("glMultiTexCoord1i", IIV);
        caps.glMultiTexCoord1iv = load.invoke("glMultiTexCoord1iv", IPV);
        caps.glMultiTexCoord1s = load.invoke("glMultiTexCoord1s", ISV);
        caps.glMultiTexCoord1sv = load.invoke("glMultiTexCoord1sv", IPV);
        caps.glMultiTexCoord2d = load.invoke("glMultiTexCoord2d", IDDV);
        caps.glMultiTexCoord2dv = load.invoke("glMultiTexCoord2dv", IPV);
        caps.glMultiTexCoord2f = load.invoke("glMultiTexCoord2f", IFFV);
        caps.glMultiTexCoord2fv = load.invoke("glMultiTexCoord2fv", IPV);
        caps.glMultiTexCoord2i = load.invoke("glMultiTexCoord2i", IIIV);
        caps.glMultiTexCoord2iv = load.invoke("glMultiTexCoord2iv", IPV);
        caps.glMultiTexCoord2s = load.invoke("glMultiTexCoord2s", ISSV);
        caps.glMultiTexCoord2sv = load.invoke("glMultiTexCoord2sv", IPV);
        caps.glMultiTexCoord3d = load.invoke("glMultiTexCoord3d", IDDDV);
        caps.glMultiTexCoord3dv = load.invoke("glMultiTexCoord3dv", IPV);
        caps.glMultiTexCoord3f = load.invoke("glMultiTexCoord3f", IFFFV);
        caps.glMultiTexCoord3fv = load.invoke("glMultiTexCoord3fv", IPV);
        caps.glMultiTexCoord3i = load.invoke("glMultiTexCoord3i", IIIIV);
        caps.glMultiTexCoord3iv = load.invoke("glMultiTexCoord3iv", IPV);
        caps.glMultiTexCoord3s = load.invoke("glMultiTexCoord3s", ISSSV);
        caps.glMultiTexCoord3sv = load.invoke("glMultiTexCoord3sv", IPV);
        caps.glMultiTexCoord4d = load.invoke("glMultiTexCoord4d", IDDDDV);
        caps.glMultiTexCoord4dv = load.invoke("glMultiTexCoord4dv", IPV);
        caps.glMultiTexCoord4f = load.invoke("glMultiTexCoord4f", IFFFFV);
        caps.glMultiTexCoord4fv = load.invoke("glMultiTexCoord4fv", IPV);
        caps.glMultiTexCoord4i = load.invoke("glMultiTexCoord4i", IIIIIV);
        caps.glMultiTexCoord4iv = load.invoke("glMultiTexCoord4iv", IPV);
        caps.glMultiTexCoord4s = load.invoke("glMultiTexCoord4s", ISSSSV);
        caps.glMultiTexCoord4sv = load.invoke("glMultiTexCoord4sv", IPV);
    }

    public static void clientActiveTexture(int texture) {
        var caps = getCapabilities();
        try {
            check(caps.glClientActiveTexture).invokeExact(texture);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void loadTransposeMatrixd(MemorySegment m) {
        var caps = getCapabilities();
        try {
            check(caps.glLoadTransposeMatrixd).invokeExact(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void loadTransposeMatrixd(SegmentAllocator allocator, double[] m) {
        loadTransposeMatrixd(allocator.allocateFrom(JAVA_DOUBLE, m));
    }

    public static void loadTransposeMatrixf(MemorySegment m) {
        var caps = getCapabilities();
        try {
            check(caps.glLoadTransposeMatrixf).invokeExact(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void loadTransposeMatrixf(SegmentAllocator allocator, float[] m) {
        loadTransposeMatrixf(allocator.allocateFrom(JAVA_FLOAT, m));
    }

    public static void multTransposeMatrixd(MemorySegment m) {
        var caps = getCapabilities();
        try {
            check(caps.glMultTransposeMatrixd).invokeExact(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multTransposeMatrixd(SegmentAllocator allocator, double[] m) {
        multTransposeMatrixd(allocator.allocateFrom(JAVA_DOUBLE, m));
    }

    public static void multTransposeMatrixf(MemorySegment m) {
        var caps = getCapabilities();
        try {
            check(caps.glMultTransposeMatrixf).invokeExact(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multTransposeMatrixf(SegmentAllocator allocator, float[] m) {
        multTransposeMatrixf(allocator.allocateFrom(JAVA_FLOAT, m));
    }

    public static void multiTexCoord1d(int target, double s) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord1d).invokeExact(target, s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord1dv(int target, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord1dv).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord1dv(SegmentAllocator allocator, int target, double[] v) {
        multiTexCoord1dv(target, allocator.allocateFrom(JAVA_DOUBLE, v));
    }

    public static void multiTexCoord1f(int target, float s) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord1f).invokeExact(target, s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord1fv(int target, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord1fv).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord1fv(SegmentAllocator allocator, int target, float[] v) {
        multiTexCoord1fv(target, allocator.allocateFrom(JAVA_FLOAT, v));
    }

    public static void multiTexCoord1i(int target, int s) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord1i).invokeExact(target, s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord1iv(int target, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord1iv).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord1iv(SegmentAllocator allocator, int target, int[] v) {
        multiTexCoord1iv(target, allocator.allocateFrom(JAVA_INT, v));
    }

    public static void multiTexCoord1s(int target, short s) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord1s).invokeExact(target, s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord1sv(int target, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord1sv).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord1sv(SegmentAllocator allocator, int target, short[] v) {
        multiTexCoord1sv(target, allocator.allocateFrom(JAVA_SHORT, v));
    }

    public static void multiTexCoord2d(int target, double s, double t) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord2d).invokeExact(target, s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord2dv(int target, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord2dv).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord2dv(SegmentAllocator allocator, int target, double[] v) {
        multiTexCoord2dv(target, allocator.allocateFrom(JAVA_DOUBLE, v));
    }

    public static void multiTexCoord2f(int target, float s, float t) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord2f).invokeExact(target, s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord2fv(int target, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord2fv).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord2fv(SegmentAllocator allocator, int target, float[] v) {
        multiTexCoord2fv(target, allocator.allocateFrom(JAVA_FLOAT, v));
    }

    public static void multiTexCoord2i(int target, int s, int t) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord2i).invokeExact(target, s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord2iv(int target, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord2iv).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord2iv(SegmentAllocator allocator, int target, int[] v) {
        multiTexCoord2iv(target, allocator.allocateFrom(JAVA_INT, v));
    }

    public static void multiTexCoord2s(int target, short s, short t) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord2s).invokeExact(target, s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord2sv(int target, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord2sv).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord2sv(SegmentAllocator allocator, int target, short[] v) {
        multiTexCoord2sv(target, allocator.allocateFrom(JAVA_SHORT, v));
    }

    public static void multiTexCoord3d(int target, double s, double t, double r) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord3d).invokeExact(target, s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord3dv(int target, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord3dv).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord3dv(SegmentAllocator allocator, int target, double[] v) {
        multiTexCoord3dv(target, allocator.allocateFrom(JAVA_DOUBLE, v));
    }

    public static void multiTexCoord3f(int target, float s, float t, float r) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord3f).invokeExact(target, s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord3fv(int target, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord3fv).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord3fv(SegmentAllocator allocator, int target, float[] v) {
        multiTexCoord3fv(target, allocator.allocateFrom(JAVA_FLOAT, v));
    }

    public static void multiTexCoord3i(int target, int s, int t, int r) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord3i).invokeExact(target, s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord3iv(int target, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord3iv).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord3iv(SegmentAllocator allocator, int target, int[] v) {
        multiTexCoord3iv(target, allocator.allocateFrom(JAVA_INT, v));
    }

    public static void multiTexCoord3s(int target, short s, short t, short r) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord3s).invokeExact(target, s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord3sv(int target, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord3sv).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord3sv(SegmentAllocator allocator, int target, short[] v) {
        multiTexCoord3sv(target, allocator.allocateFrom(JAVA_SHORT, v));
    }

    public static void multiTexCoord4d(int target, double s, double t, double r, double q) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord4d).invokeExact(target, s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord4dv(int target, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord4dv).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord4dv(SegmentAllocator allocator, int target, double[] v) {
        multiTexCoord4dv(target, allocator.allocateFrom(JAVA_DOUBLE, v));
    }

    public static void multiTexCoord4f(int target, float s, float t, float r, float q) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord4f).invokeExact(target, s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord4fv(int target, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord4fv).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord4fv(SegmentAllocator allocator, int target, float[] v) {
        multiTexCoord4fv(target, allocator.allocateFrom(JAVA_FLOAT, v));
    }

    public static void multiTexCoord4i(int target, int s, int t, int r, int q) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord4i).invokeExact(target, s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord4iv(int target, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord4iv).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord4iv(SegmentAllocator allocator, int target, int[] v) {
        multiTexCoord4iv(target, allocator.allocateFrom(JAVA_INT, v));
    }

    public static void multiTexCoord4s(int target, short s, short t, short r, short q) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord4s).invokeExact(target, s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord4sv(int target, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiTexCoord4sv).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiTexCoord4sv(SegmentAllocator allocator, int target, short[] v) {
        multiTexCoord4sv(target, allocator.allocateFrom(JAVA_SHORT, v));
    }
}
