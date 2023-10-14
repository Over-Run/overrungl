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
  * {@code GL_SGIS_fog_function}
  */
public final class GLSGISFogFunction {
    public static final int GL_FOG_FUNC_SGIS = 0x812A;
    public static final int GL_FOG_FUNC_POINTS_SGIS = 0x812B;
    public static final int GL_MAX_FOG_FUNC_POINTS_SGIS = 0x812C;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SGIS_fog_function) return;
        ext.glFogFuncSGIS = load.invoke("glFogFuncSGIS", ofVoid(JAVA_INT, ADDRESS));
        ext.glGetFogFuncSGIS = load.invoke("glGetFogFuncSGIS", ofVoid(ADDRESS));
    }

    public static void glFogFuncSGIS(int n, @NativeType("const GLfloat *") MemorySegment points) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFogFuncSGIS).invokeExact(n, points);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetFogFuncSGIS(@NativeType("GLfloat *") MemorySegment points) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetFogFuncSGIS).invokeExact(points);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
