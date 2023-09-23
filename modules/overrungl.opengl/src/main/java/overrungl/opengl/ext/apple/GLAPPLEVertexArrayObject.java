/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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
package overrungl.opengl.ext.apple;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_APPLE_vertex_array_object}
  */
public final class GLAPPLEVertexArrayObject {
    public static final int GL_VERTEX_ARRAY_BINDING_APPLE = 0x85B5;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_APPLE_vertex_array_object) return;
        ext.glBindVertexArrayAPPLE = load.invoke("glBindVertexArrayAPPLE", ofVoid(JAVA_INT));
        ext.glDeleteVertexArraysAPPLE = load.invoke("glDeleteVertexArraysAPPLE", ofVoid(JAVA_INT, ADDRESS));
        ext.glGenVertexArraysAPPLE = load.invoke("glGenVertexArraysAPPLE", ofVoid(JAVA_INT, ADDRESS));
        ext.glIsVertexArrayAPPLE = load.invoke("glIsVertexArrayAPPLE", of(JAVA_BYTE, JAVA_INT));
    }

    public static void glBindVertexArrayAPPLE(int array) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindVertexArrayAPPLE).invokeExact(array);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteVertexArraysAPPLE(int n, @NativeType("const GLuint *") MemorySegment arrays) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteVertexArraysAPPLE).invokeExact(n, arrays);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGenVertexArraysAPPLE(int n, @NativeType("GLuint *") MemorySegment arrays) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenVertexArraysAPPLE).invokeExact(n, arrays);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsVertexArrayAPPLE(int array) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsVertexArrayAPPLE).invokeExact(array);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
