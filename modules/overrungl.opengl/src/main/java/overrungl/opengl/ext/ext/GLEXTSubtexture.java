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
 * {@code GL_EXT_subtexture}
 */
public final class GLEXTSubtexture {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_subtexture) return;
        ext.glTexSubImage1DEXT = load.invoke("glTexSubImage1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTexSubImage2DEXT = load.invoke("glTexSubImage2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glTexSubImage1DEXT(int target, int level, int xoffset, int width, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexSubImage1DEXT).invokeExact(target, level, xoffset, width, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexSubImage2DEXT(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexSubImage2DEXT).invokeExact(target, level, xoffset, yoffset, width, height, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
