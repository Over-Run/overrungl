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
package overrungl.opengl.ext.mesa;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_MESA_resize_buffers}
  */
public final class GLMESAResizeBuffers {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_MESA_resize_buffers) return;
        ext.glResizeBuffersMESA = load.invoke("glResizeBuffersMESA", ofVoid());
    }

    public static void glResizeBuffersMESA() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glResizeBuffersMESA).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
