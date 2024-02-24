/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_SGIX_polynomial_ffd}
 */
public interface GLSGIXPolynomialFFD extends overrun.marshal.DirectAccess {
    int GL_TEXTURE_DEFORMATION_BIT_SGIX = 0x00000001;
    int GL_GEOMETRY_DEFORMATION_BIT_SGIX = 0x00000002;
    int GL_GEOMETRY_DEFORMATION_SGIX = 0x8194;
    int GL_TEXTURE_DEFORMATION_SGIX = 0x8195;
    int GL_DEFORMATIONS_MASK_SGIX = 0x8196;
    int GL_MAX_DEFORMATION_ORDER_SGIX = 0x8197;

    default void glDeformationMap3dSGIX(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, double w1, double w2, int wstride, int worder, @NativeType("const GLdouble *") MemorySegment points) {
        throw new ContextException();
    }

    default void glDeformationMap3fSGIX(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, float w1, float w2, int wstride, int worder, @NativeType("const GLfloat *") MemorySegment points) {
        throw new ContextException();
    }

    default void glDeformSGIX(int mask) {
        throw new ContextException();
    }

    default void glLoadIdentityDeformationMapSGIX(int mask) {
        throw new ContextException();
    }

}
