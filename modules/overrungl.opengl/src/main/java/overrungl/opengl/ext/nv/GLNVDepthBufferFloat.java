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
 * {@code GL_NV_depth_buffer_float}
 */
public final class GLNVDepthBufferFloat {
    public static final int GL_DEPTH_COMPONENT32F_NV = 0x8DAB;
    public static final int GL_DEPTH32F_STENCIL8_NV = 0x8DAC;
    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV_NV = 0x8DAD;
    public static final int GL_DEPTH_BUFFER_FLOAT_MODE_NV = 0x8DAF;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_depth_buffer_float) return;
        ext.glDepthRangedNV = load.invoke("glDepthRangedNV", ofVoid(JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glClearDepthdNV = load.invoke("glClearDepthdNV", ofVoid(JAVA_DOUBLE));
        ext.glDepthBoundsdNV = load.invoke("glDepthBoundsdNV", ofVoid(JAVA_DOUBLE, JAVA_DOUBLE));
    }

    public static void glDepthRangedNV(double zNear, double zFar) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDepthRangedNV).invokeExact(zNear, zFar);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glClearDepthdNV(double depth) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glClearDepthdNV).invokeExact(depth);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDepthBoundsdNV(double zmin, double zmax) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDepthBoundsdNV).invokeExact(zmin, zmax);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
