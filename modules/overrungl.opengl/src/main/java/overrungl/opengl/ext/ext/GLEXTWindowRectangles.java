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
package overrungl.opengl.ext.ext;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_EXT_window_rectangles}
 */
public final class GLEXTWindowRectangles {
    public static final int GL_INCLUSIVE_EXT = 0x8F10;
    public static final int GL_EXCLUSIVE_EXT = 0x8F11;
    public static final int GL_WINDOW_RECTANGLE_EXT = 0x8F12;
    public static final int GL_WINDOW_RECTANGLE_MODE_EXT = 0x8F13;
    public static final int GL_MAX_WINDOW_RECTANGLES_EXT = 0x8F14;
    public static final int GL_NUM_WINDOW_RECTANGLES_EXT = 0x8F15;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_window_rectangles) return;
        ext.glWindowRectanglesEXT = load.invoke("glWindowRectanglesEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glWindowRectanglesEXT(int mode, int count, @NativeType("const GLint *") MemorySegment box) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowRectanglesEXT).invokeExact(mode, count, box);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
