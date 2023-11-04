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
  * {@code GL_SGIS_point_parameters}
  */
public final class GLSGISPointParameters {
    public static final int GL_POINT_SIZE_MIN_SGIS = 0x8126;
    public static final int GL_POINT_SIZE_MAX_SGIS = 0x8127;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE_SGIS = 0x8128;
    public static final int GL_DISTANCE_ATTENUATION_SGIS = 0x8129;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SGIS_point_parameters) return;
        ext.glPointParameterfSGIS = load.invoke("glPointParameterfSGIS", ofVoid(JAVA_INT, JAVA_FLOAT));
        ext.glPointParameterfvSGIS = load.invoke("glPointParameterfvSGIS", ofVoid(JAVA_INT, ADDRESS));
    }

    public static void glPointParameterfSGIS(int pname, float param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPointParameterfSGIS).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPointParameterfvSGIS(int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPointParameterfvSGIS).invokeExact(pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
