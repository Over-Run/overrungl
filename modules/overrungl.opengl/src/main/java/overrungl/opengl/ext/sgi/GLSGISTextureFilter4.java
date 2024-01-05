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
package overrungl.opengl.ext.sgi;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_SGIS_texture_filter4}
 */
public final class GLSGISTextureFilter4 {
    public static final int GL_FILTER4_SGIS = 0x8146;
    public static final int GL_TEXTURE_FILTER4_SIZE_SGIS = 0x8147;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SGIS_texture_filter4) return;
        ext.glGetTexFilterFuncSGIS = load.invoke("glGetTexFilterFuncSGIS", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTexFilterFuncSGIS = load.invoke("glTexFilterFuncSGIS", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glGetTexFilterFuncSGIS(int target, int filter, @NativeType("GLfloat *") MemorySegment weights) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTexFilterFuncSGIS).invokeExact(target, filter, weights);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexFilterFuncSGIS(int target, int filter, int n, @NativeType("const GLfloat *") MemorySegment weights) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexFilterFuncSGIS).invokeExact(target, filter, n, weights);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
