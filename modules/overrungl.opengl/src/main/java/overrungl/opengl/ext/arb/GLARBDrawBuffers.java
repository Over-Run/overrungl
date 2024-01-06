/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext.arb;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_ARB_draw_buffers}
 */
public final class GLARBDrawBuffers {
    public static final int GL_MAX_DRAW_BUFFERS_ARB = 0x8824;
    public static final int GL_DRAW_BUFFER0_ARB = 0x8825;
    public static final int GL_DRAW_BUFFER1_ARB = 0x8826;
    public static final int GL_DRAW_BUFFER2_ARB = 0x8827;
    public static final int GL_DRAW_BUFFER3_ARB = 0x8828;
    public static final int GL_DRAW_BUFFER4_ARB = 0x8829;
    public static final int GL_DRAW_BUFFER5_ARB = 0x882A;
    public static final int GL_DRAW_BUFFER6_ARB = 0x882B;
    public static final int GL_DRAW_BUFFER7_ARB = 0x882C;
    public static final int GL_DRAW_BUFFER8_ARB = 0x882D;
    public static final int GL_DRAW_BUFFER9_ARB = 0x882E;
    public static final int GL_DRAW_BUFFER10_ARB = 0x882F;
    public static final int GL_DRAW_BUFFER11_ARB = 0x8830;
    public static final int GL_DRAW_BUFFER12_ARB = 0x8831;
    public static final int GL_DRAW_BUFFER13_ARB = 0x8832;
    public static final int GL_DRAW_BUFFER14_ARB = 0x8833;
    public static final int GL_DRAW_BUFFER15_ARB = 0x8834;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_draw_buffers) return;
        ext.glDrawBuffersARB = load.invoke("glDrawBuffersARB", ofVoid(JAVA_INT, ADDRESS));
    }

    public static void glDrawBuffersARB(int n, @NativeType("const GLenum *") MemorySegment bufs) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDrawBuffersARB).invokeExact(n, bufs);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
