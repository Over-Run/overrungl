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
package overrungl.opengl.ext.nv;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NVX_conditional_render}
 */
public final class GLNVXConditionalRender {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NVX_conditional_render) return;
        ext.glBeginConditionalRenderNVX = load.invoke("glBeginConditionalRenderNVX", ofVoid(JAVA_INT));
        ext.glEndConditionalRenderNVX = load.invoke("glEndConditionalRenderNVX", ofVoid());
    }

    public static void glBeginConditionalRenderNVX(int id) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBeginConditionalRenderNVX).invokeExact(id);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEndConditionalRenderNVX() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEndConditionalRenderNVX).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
