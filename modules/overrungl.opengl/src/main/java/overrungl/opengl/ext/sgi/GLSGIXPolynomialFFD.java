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
  * {@code GL_SGIX_polynomial_ffd}
  */
public final class GLSGIXPolynomialFFD {
    public static final int GL_TEXTURE_DEFORMATION_BIT_SGIX = 0x00000001;
    public static final int GL_GEOMETRY_DEFORMATION_BIT_SGIX = 0x00000002;
    public static final int GL_GEOMETRY_DEFORMATION_SGIX = 0x8194;
    public static final int GL_TEXTURE_DEFORMATION_SGIX = 0x8195;
    public static final int GL_DEFORMATIONS_MASK_SGIX = 0x8196;
    public static final int GL_MAX_DEFORMATION_ORDER_SGIX = 0x8197;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SGIX_polynomial_ffd) return;
        ext.glDeformationMap3dSGIX = load.invoke("glDeformationMap3dSGIX", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glDeformationMap3fSGIX = load.invoke("glDeformationMap3fSGIX", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glDeformSGIX = load.invoke("glDeformSGIX", ofVoid(JAVA_INT));
        ext.glLoadIdentityDeformationMapSGIX = load.invoke("glLoadIdentityDeformationMapSGIX", ofVoid(JAVA_INT));
    }

    public static void glDeformationMap3dSGIX(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, double w1, double w2, int wstride, int worder, @NativeType("const GLdouble *") MemorySegment points) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeformationMap3dSGIX).invokeExact(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, w1, w2, wstride, worder, points);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeformationMap3fSGIX(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, float w1, float w2, int wstride, int worder, @NativeType("const GLfloat *") MemorySegment points) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeformationMap3fSGIX).invokeExact(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, w1, w2, wstride, worder, points);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeformSGIX(int mask) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeformSGIX).invokeExact(mask);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glLoadIdentityDeformationMapSGIX(int mask) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glLoadIdentityDeformationMapSGIX).invokeExact(mask);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
