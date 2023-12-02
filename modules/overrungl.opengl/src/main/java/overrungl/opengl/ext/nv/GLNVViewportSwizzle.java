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
 * {@code GL_NV_viewport_swizzle}
 */
public final class GLNVViewportSwizzle {
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_X_NV = 0x9350;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_X_NV = 0x9351;
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_Y_NV = 0x9352;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_Y_NV = 0x9353;
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_Z_NV = 0x9354;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_Z_NV = 0x9355;
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_W_NV = 0x9356;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_W_NV = 0x9357;
    public static final int GL_VIEWPORT_SWIZZLE_X_NV = 0x9358;
    public static final int GL_VIEWPORT_SWIZZLE_Y_NV = 0x9359;
    public static final int GL_VIEWPORT_SWIZZLE_Z_NV = 0x935A;
    public static final int GL_VIEWPORT_SWIZZLE_W_NV = 0x935B;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_viewport_swizzle) return;
        ext.glViewportSwizzleNV = load.invoke("glViewportSwizzleNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glViewportSwizzleNV(int index, int swizzlex, int swizzley, int swizzlez, int swizzlew) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glViewportSwizzleNV).invokeExact(index, swizzlex, swizzley, swizzlez, swizzlew);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
