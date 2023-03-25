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
 */

package org.overrun.glib.gl.ext.arb;

import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.foreign.MemorySegment;

import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;
import static org.overrun.glib.gl.GLLoader.getExtCapabilities;

/**
 * {@code GL_ARB_multitexture}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLARBMultitexture {
    public static final int GL_TEXTURE0_ARB = 0x84C0;
    public static final int GL_TEXTURE1_ARB = 0x84C1;
    public static final int GL_TEXTURE2_ARB = 0x84C2;
    public static final int GL_TEXTURE3_ARB = 0x84C3;
    public static final int GL_TEXTURE4_ARB = 0x84C4;
    public static final int GL_TEXTURE5_ARB = 0x84C5;
    public static final int GL_TEXTURE6_ARB = 0x84C6;
    public static final int GL_TEXTURE7_ARB = 0x84C7;
    public static final int GL_TEXTURE8_ARB = 0x84C8;
    public static final int GL_TEXTURE9_ARB = 0x84C9;
    public static final int GL_TEXTURE10_ARB = 0x84CA;
    public static final int GL_TEXTURE11_ARB = 0x84CB;
    public static final int GL_TEXTURE12_ARB = 0x84CC;
    public static final int GL_TEXTURE13_ARB = 0x84CD;
    public static final int GL_TEXTURE14_ARB = 0x84CE;
    public static final int GL_TEXTURE15_ARB = 0x84CF;
    public static final int GL_TEXTURE16_ARB = 0x84D0;
    public static final int GL_TEXTURE17_ARB = 0x84D1;
    public static final int GL_TEXTURE18_ARB = 0x84D2;
    public static final int GL_TEXTURE19_ARB = 0x84D3;
    public static final int GL_TEXTURE20_ARB = 0x84D4;
    public static final int GL_TEXTURE21_ARB = 0x84D5;
    public static final int GL_TEXTURE22_ARB = 0x84D6;
    public static final int GL_TEXTURE23_ARB = 0x84D7;
    public static final int GL_TEXTURE24_ARB = 0x84D8;
    public static final int GL_TEXTURE25_ARB = 0x84D9;
    public static final int GL_TEXTURE26_ARB = 0x84DA;
    public static final int GL_TEXTURE27_ARB = 0x84DB;
    public static final int GL_TEXTURE28_ARB = 0x84DC;
    public static final int GL_TEXTURE29_ARB = 0x84DD;
    public static final int GL_TEXTURE30_ARB = 0x84DE;
    public static final int GL_TEXTURE31_ARB = 0x84DF;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_multitexture) return;
        ext.glActiveTextureARB = load.invoke("glActiveTextureARB", IV);
        ext.glClientActiveTextureARB = load.invoke("glClientActiveTextureARB", IV);
        ext.glMultiTexCoord1dARB = load.invoke("glMultiTexCoord1dARB", IDV);
        ext.glMultiTexCoord1dvARB = load.invoke("glMultiTexCoord1dvARB", IPV);
        ext.glMultiTexCoord1fARB = load.invoke("glMultiTexCoord1fARB", IFV);
        ext.glMultiTexCoord1fvARB = load.invoke("glMultiTexCoord1fvARB", IPV);
        ext.glMultiTexCoord1iARB = load.invoke("glMultiTexCoord1iARB", IIV);
        ext.glMultiTexCoord1ivARB = load.invoke("glMultiTexCoord1ivARB", IPV);
        ext.glMultiTexCoord1sARB = load.invoke("glMultiTexCoord1sARB", ISV);
        ext.glMultiTexCoord1svARB = load.invoke("glMultiTexCoord1svARB", IPV);
        ext.glMultiTexCoord2dARB = load.invoke("glMultiTexCoord2dARB", IDDV);
        ext.glMultiTexCoord2dvARB = load.invoke("glMultiTexCoord2dvARB", IPV);
        ext.glMultiTexCoord2fARB = load.invoke("glMultiTexCoord2fARB", IFFV);
        ext.glMultiTexCoord2fvARB = load.invoke("glMultiTexCoord2fvARB", IPV);
        ext.glMultiTexCoord2iARB = load.invoke("glMultiTexCoord2iARB", IIIV);
        ext.glMultiTexCoord2ivARB = load.invoke("glMultiTexCoord2ivARB", IPV);
        ext.glMultiTexCoord2sARB = load.invoke("glMultiTexCoord2sARB", ISSV);
        ext.glMultiTexCoord2svARB = load.invoke("glMultiTexCoord2svARB", IPV);
        ext.glMultiTexCoord3dARB = load.invoke("glMultiTexCoord3dARB", IDDDV);
        ext.glMultiTexCoord3dvARB = load.invoke("glMultiTexCoord3dvARB", IPV);
        ext.glMultiTexCoord3fARB = load.invoke("glMultiTexCoord3fARB", IFFFV);
        ext.glMultiTexCoord3fvARB = load.invoke("glMultiTexCoord3fvARB", IPV);
        ext.glMultiTexCoord3iARB = load.invoke("glMultiTexCoord3iARB", IIIIV);
        ext.glMultiTexCoord3ivARB = load.invoke("glMultiTexCoord3ivARB", IPV);
        ext.glMultiTexCoord3sARB = load.invoke("glMultiTexCoord3sARB", ISSSV);
        ext.glMultiTexCoord3svARB = load.invoke("glMultiTexCoord3svARB", IPV);
        ext.glMultiTexCoord4dARB = load.invoke("glMultiTexCoord4dARB", IDDDDV);
        ext.glMultiTexCoord4dvARB = load.invoke("glMultiTexCoord4dvARB", IPV);
        ext.glMultiTexCoord4fARB = load.invoke("glMultiTexCoord4fARB", IFFFFV);
        ext.glMultiTexCoord4fvARB = load.invoke("glMultiTexCoord4fvARB", IPV);
        ext.glMultiTexCoord4iARB = load.invoke("glMultiTexCoord4iARB", IIIIIV);
        ext.glMultiTexCoord4ivARB = load.invoke("glMultiTexCoord4ivARB", IPV);
        ext.glMultiTexCoord4sARB = load.invoke("glMultiTexCoord4sARB", ISSSSV);
        ext.glMultiTexCoord4svARB = load.invoke("glMultiTexCoord4svARB", IPV);
    }

    public static void glActiveTextureARB(int texture) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glActiveTextureARB).invokeExact(texture);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glClientActiveTextureARB(int texture) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glClientActiveTextureARB).invokeExact(texture);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord1dARB(int target, double s) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord1dARB).invokeExact(target, s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord1dvARB(int target, MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord1dvARB).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord1fARB(int target, float s) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord1fARB).invokeExact(target, s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord1fvARB(int target, MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord1fvARB).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord1iARB(int target, int s) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord1iARB).invokeExact(target, s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord1ivARB(int target, MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord1ivARB).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord1sARB(int target, short s) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord1sARB).invokeExact(target, s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord1svARB(int target, MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord1svARB).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord2dARB(int target, double s, double t) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord2dARB).invokeExact(target, s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord2dvARB(int target, MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord2dvARB).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord2fARB(int target, float s, float t) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord2fARB).invokeExact(target, s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord2fvARB(int target, MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord2fvARB).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord2iARB(int target, int s, int t) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord2iARB).invokeExact(target, s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord2ivARB(int target, MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord2ivARB).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord2sARB(int target, short s, short t) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord2sARB).invokeExact(target, s, t);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord2svARB(int target, MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord2svARB).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord3dARB(int target, double s, double t, double r) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord3dARB).invokeExact(target, s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord3dvARB(int target, MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord3dvARB).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord3fARB(int target, float s, float t, float r) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord3fARB).invokeExact(target, s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord3fvARB(int target, MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord3fvARB).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord3iARB(int target, int s, int t, int r) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord3iARB).invokeExact(target, s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord3ivARB(int target, MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord3ivARB).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord3sARB(int target, short s, short t, short r) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord3sARB).invokeExact(target, s, t, r);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord3svARB(int target, MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord3svARB).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord4dARB(int target, double s, double t, double r, double q) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord4dARB).invokeExact(target, s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord4dvARB(int target, MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord4dvARB).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord4fARB(int target, float s, float t, float r, float q) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord4fARB).invokeExact(target, s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord4fvARB(int target, MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord4fvARB).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord4iARB(int target, int s, int t, int r, int q) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord4iARB).invokeExact(target, s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord4ivARB(int target, MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord4ivARB).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord4sARB(int target, short s, short t, short r, short q) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord4sARB).invokeExact(target, s, t, r, q);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMultiTexCoord4svARB(int target, MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord4svARB).invokeExact(target, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
