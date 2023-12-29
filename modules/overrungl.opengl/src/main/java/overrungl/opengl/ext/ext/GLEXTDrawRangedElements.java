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
 * {@code GL_EXT_draw_range_elements}
 */
public final class GLEXTDrawRangedElements {
    public static final int GL_MAX_ELEMENTS_VERTICES_EXT = 0x80E8;
    public static final int GL_MAX_ELEMENTS_INDICES_EXT = 0x80E9;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_draw_range_elements) return;
        ext.glDrawRangeElementsEXT = load.invoke("glDrawRangeElementsEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glDrawRangeElementsEXT(int mode, int start, int end, int count, int type, @NativeType("const void *") MemorySegment indices) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDrawRangeElementsEXT).invokeExact(mode, start, end, count, type, indices);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
