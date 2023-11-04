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
 * {@code GL_ARB_draw_buffers_blend}
 */
public final class GLARBDrawBuffersBlend {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_draw_buffers_blend) return;
        ext.glBlendEquationiARB = load.invoke("glBlendEquationiARB", ofVoid(JAVA_INT, JAVA_INT));
        ext.glBlendEquationSeparateiARB = load.invoke("glBlendEquationSeparateiARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glBlendFunciARB = load.invoke("glBlendFunciARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glBlendFuncSeparateiARB = load.invoke("glBlendFuncSeparateiARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glBlendEquationiARB(int buf, int mode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBlendEquationiARB).invokeExact(buf, mode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBlendEquationSeparateiARB(int buf, int modeRGB, int modeAlpha) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBlendEquationSeparateiARB).invokeExact(buf, modeRGB, modeAlpha);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBlendFunciARB(int buf, int src, int dst) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBlendFunciARB).invokeExact(buf, src, dst);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBlendFuncSeparateiARB(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBlendFuncSeparateiARB).invokeExact(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
