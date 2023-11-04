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
  * {@code GL_SGIS_sharpen_texture}
  */
public final class GLSGISSharpenTexture {
    public static final int GL_LINEAR_SHARPEN_SGIS = 0x80AD;
    public static final int GL_LINEAR_SHARPEN_ALPHA_SGIS = 0x80AE;
    public static final int GL_LINEAR_SHARPEN_COLOR_SGIS = 0x80AF;
    public static final int GL_SHARPEN_TEXTURE_FUNC_POINTS_SGIS = 0x80B0;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SGIS_sharpen_texture) return;
        ext.glSharpenTexFuncSGIS = load.invoke("glSharpenTexFuncSGIS", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetSharpenTexFuncSGIS = load.invoke("glGetSharpenTexFuncSGIS", ofVoid(JAVA_INT, ADDRESS));
    }

    public static void glSharpenTexFuncSGIS(int target, int n, @NativeType("const GLfloat *") MemorySegment points) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSharpenTexFuncSGIS).invokeExact(target, n, points);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetSharpenTexFuncSGIS(int target, @NativeType("GLfloat *") MemorySegment points) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetSharpenTexFuncSGIS).invokeExact(target, points);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
