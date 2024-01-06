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
 * {@code GL_SGIS_detail_texture}
 */
public final class GLSGISDetailTexture {
    public static final int GL_DETAIL_TEXTURE_2D_SGIS = 0x8095;
    public static final int GL_DETAIL_TEXTURE_2D_BINDING_SGIS = 0x8096;
    public static final int GL_LINEAR_DETAIL_SGIS = 0x8097;
    public static final int GL_LINEAR_DETAIL_ALPHA_SGIS = 0x8098;
    public static final int GL_LINEAR_DETAIL_COLOR_SGIS = 0x8099;
    public static final int GL_DETAIL_TEXTURE_LEVEL_SGIS = 0x809A;
    public static final int GL_DETAIL_TEXTURE_MODE_SGIS = 0x809B;
    public static final int GL_DETAIL_TEXTURE_FUNC_POINTS_SGIS = 0x809C;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SGIS_detail_texture) return;
        ext.glDetailTexFuncSGIS = load.invoke("glDetailTexFuncSGIS", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetDetailTexFuncSGIS = load.invoke("glGetDetailTexFuncSGIS", ofVoid(JAVA_INT, ADDRESS));
    }

    public static void glDetailTexFuncSGIS(int target, int n, @NativeType("const GLfloat *") MemorySegment points) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDetailTexFuncSGIS).invokeExact(target, n, points);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetDetailTexFuncSGIS(int target, @NativeType("GLfloat *") MemorySegment points) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetDetailTexFuncSGIS).invokeExact(target, points);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
