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
package overrungl.opengl.ext.ati;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ATI_pn_triangles}
 */
public interface GLATIPnTriangles extends overrun.marshal.DirectAccess {
    int GL_PN_TRIANGLES_ATI = 0x87F0;
    int GL_MAX_PN_TRIANGLES_TESSELATION_LEVEL_ATI = 0x87F1;
    int GL_PN_TRIANGLES_POINT_MODE_ATI = 0x87F2;
    int GL_PN_TRIANGLES_NORMAL_MODE_ATI = 0x87F3;
    int GL_PN_TRIANGLES_TESSELATION_LEVEL_ATI = 0x87F4;
    int GL_PN_TRIANGLES_POINT_MODE_LINEAR_ATI = 0x87F5;
    int GL_PN_TRIANGLES_POINT_MODE_CUBIC_ATI = 0x87F6;
    int GL_PN_TRIANGLES_NORMAL_MODE_LINEAR_ATI = 0x87F7;
    int GL_PN_TRIANGLES_NORMAL_MODE_QUADRATIC_ATI = 0x87F8;

    default void glPNTrianglesiATI(int pname, int param) {
        throw new ContextException();
    }

    default void glPNTrianglesfATI(int pname, float param) {
        throw new ContextException();
    }

}
