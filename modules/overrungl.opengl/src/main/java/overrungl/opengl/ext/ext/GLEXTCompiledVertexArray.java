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
 * {@code GL_EXT_compiled_vertex_array}
 */
public final class GLEXTCompiledVertexArray {
    public static final int GL_ARRAY_ELEMENT_LOCK_FIRST_EXT = 0x81A8;
    public static final int GL_ARRAY_ELEMENT_LOCK_COUNT_EXT = 0x81A9;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_compiled_vertex_array) return;
        ext.glLockArraysEXT = load.invoke("glLockArraysEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glUnlockArraysEXT = load.invoke("glUnlockArraysEXT", ofVoid());
    }

    public static void glLockArraysEXT(int first, int count) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glLockArraysEXT).invokeExact(first, count);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUnlockArraysEXT() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUnlockArraysEXT).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
