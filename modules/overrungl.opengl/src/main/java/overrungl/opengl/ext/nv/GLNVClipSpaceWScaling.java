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
 * {@code GL_NV_clip_space_w_scaling}
 */
public final class GLNVClipSpaceWScaling {
    public static final int GL_VIEWPORT_POSITION_W_SCALE_NV = 0x937C;
    public static final int GL_VIEWPORT_POSITION_W_SCALE_X_COEFF_NV = 0x937D;
    public static final int GL_VIEWPORT_POSITION_W_SCALE_Y_COEFF_NV = 0x937E;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_clip_space_w_scaling) return;
        ext.glViewportPositionWScaleNV = load.invoke("glViewportPositionWScaleNV", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT));
    }

    public static void glViewportPositionWScaleNV(int index, float xcoeff, float ycoeff) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glViewportPositionWScaleNV).invokeExact(index, xcoeff, ycoeff);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
