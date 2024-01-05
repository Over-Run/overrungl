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
 * {@code GL_ARB_color_buffer_float}
 */
public final class GLARBColorBufferFloat {
    public static final int GL_RGBA_FLOAT_MODE_ARB = 0x8820;
    public static final int GL_CLAMP_VERTEX_COLOR_ARB = 0x891A;
    public static final int GL_CLAMP_FRAGMENT_COLOR_ARB = 0x891B;
    public static final int GL_CLAMP_READ_COLOR_ARB = 0x891C;
    public static final int GL_FIXED_ONLY_ARB = 0x891D;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_color_buffer_float) return;
        ext.glClampColorARB = load.invoke("glClampColorARB", ofVoid(JAVA_INT, JAVA_INT));
    }

    public static void glClampColorARB(int target, int clamp) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glClampColorARB).invokeExact(target, clamp);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
