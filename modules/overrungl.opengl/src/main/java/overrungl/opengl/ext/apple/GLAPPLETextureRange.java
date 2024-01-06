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
package overrungl.opengl.ext.apple;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_APPLE_texture_range}
 */
public final class GLAPPLETextureRange {
    public static final int GL_TEXTURE_RANGE_LENGTH_APPLE = 0x85B7;
    public static final int GL_TEXTURE_RANGE_POINTER_APPLE = 0x85B8;
    public static final int GL_TEXTURE_STORAGE_HINT_APPLE = 0x85BC;
    public static final int GL_STORAGE_PRIVATE_APPLE = 0x85BD;
    public static final int GL_STORAGE_CACHED_APPLE = 0x85BE;
    public static final int GL_STORAGE_SHARED_APPLE = 0x85BF;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_APPLE_texture_range) return;
        ext.glTextureRangeAPPLE = load.invoke("glTextureRangeAPPLE", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetTexParameterPointervAPPLE = load.invoke("glGetTexParameterPointervAPPLE", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glTextureRangeAPPLE(int target, int length, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureRangeAPPLE).invokeExact(target, length, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTexParameterPointervAPPLE(int target, int pname, @NativeType("void **") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTexParameterPointervAPPLE).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
