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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_window_rectangles}
 */
public interface GLEXTWindowRectangles {
    int GL_INCLUSIVE_EXT = 0x8F10;
    int GL_EXCLUSIVE_EXT = 0x8F11;
    int GL_WINDOW_RECTANGLE_EXT = 0x8F12;
    int GL_WINDOW_RECTANGLE_MODE_EXT = 0x8F13;
    int GL_MAX_WINDOW_RECTANGLES_EXT = 0x8F14;
    int GL_NUM_WINDOW_RECTANGLES_EXT = 0x8F15;

    default void glWindowRectanglesEXT(int mode, int count, @NativeType("const GLint *") MemorySegment box) {
        throw new ContextException();
    }

}
