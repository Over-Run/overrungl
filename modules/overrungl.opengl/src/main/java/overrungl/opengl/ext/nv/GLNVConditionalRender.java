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
 * {@code GL_NV_conditional_render}
 */
public final class GLNVConditionalRender {
    public static final int GL_QUERY_WAIT_NV = 0x8E13;
    public static final int GL_QUERY_NO_WAIT_NV = 0x8E14;
    public static final int GL_QUERY_BY_REGION_WAIT_NV = 0x8E15;
    public static final int GL_QUERY_BY_REGION_NO_WAIT_NV = 0x8E16;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_conditional_render) return;
        ext.glBeginConditionalRenderNV = load.invoke("glBeginConditionalRenderNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glEndConditionalRenderNV = load.invoke("glEndConditionalRenderNV", ofVoid());
    }

    public static void glBeginConditionalRenderNV(int id, int mode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBeginConditionalRenderNV).invokeExact(id, mode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEndConditionalRenderNV() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEndConditionalRenderNV).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
