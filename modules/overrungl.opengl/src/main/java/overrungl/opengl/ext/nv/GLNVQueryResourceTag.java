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
 * {@code GL_NV_query_resource_tag}
 */
public final class GLNVQueryResourceTag {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_query_resource_tag) return;
        ext.glGenQueryResourceTagNV = load.invoke("glGenQueryResourceTagNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glDeleteQueryResourceTagNV = load.invoke("glDeleteQueryResourceTagNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glQueryResourceTagNV = load.invoke("glQueryResourceTagNV", ofVoid(JAVA_INT, ADDRESS));
    }

    public static void glGenQueryResourceTagNV(int n, @NativeType("GLint *") MemorySegment tagIds) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenQueryResourceTagNV).invokeExact(n, tagIds);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteQueryResourceTagNV(int n, @NativeType("const GLint *") MemorySegment tagIds) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteQueryResourceTagNV).invokeExact(n, tagIds);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glQueryResourceTagNV(int tagId, @NativeType("const GLchar *") MemorySegment tagString) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glQueryResourceTagNV).invokeExact(tagId, tagString);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
