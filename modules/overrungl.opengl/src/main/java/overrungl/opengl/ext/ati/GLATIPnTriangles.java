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
package overrungl.opengl.ext.ati;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_ATI_pn_triangles}
  */
public final class GLATIPnTriangles {
    public static final int GL_PN_TRIANGLES_ATI = 0x87F0;
    public static final int GL_MAX_PN_TRIANGLES_TESSELATION_LEVEL_ATI = 0x87F1;
    public static final int GL_PN_TRIANGLES_POINT_MODE_ATI = 0x87F2;
    public static final int GL_PN_TRIANGLES_NORMAL_MODE_ATI = 0x87F3;
    public static final int GL_PN_TRIANGLES_TESSELATION_LEVEL_ATI = 0x87F4;
    public static final int GL_PN_TRIANGLES_POINT_MODE_LINEAR_ATI = 0x87F5;
    public static final int GL_PN_TRIANGLES_POINT_MODE_CUBIC_ATI = 0x87F6;
    public static final int GL_PN_TRIANGLES_NORMAL_MODE_LINEAR_ATI = 0x87F7;
    public static final int GL_PN_TRIANGLES_NORMAL_MODE_QUADRATIC_ATI = 0x87F8;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ATI_pn_triangles) return;
        ext.glPNTrianglesiATI = load.invoke("glPNTrianglesiATI", ofVoid(JAVA_INT, JAVA_INT));
        ext.glPNTrianglesfATI = load.invoke("glPNTrianglesfATI", ofVoid(JAVA_INT, JAVA_FLOAT));
    }

    public static void glPNTrianglesiATI(int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPNTrianglesiATI).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPNTrianglesfATI(int pname, float param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPNTrianglesfATI).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
