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
 * {@code GL_EXT_color_subtable}
 */
public final class GLEXTColorSubtable {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_color_subtable) return;
        ext.glColorSubTableEXT = load.invoke("glColorSubTableEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCopyColorSubTableEXT = load.invoke("glCopyColorSubTableEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glColorSubTableEXT(int target, int start, int count, int format, int type, @NativeType("const void *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColorSubTableEXT).invokeExact(target, start, count, format, type, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyColorSubTableEXT(int target, int start, int x, int y, int width) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyColorSubTableEXT).invokeExact(target, start, x, y, width);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
