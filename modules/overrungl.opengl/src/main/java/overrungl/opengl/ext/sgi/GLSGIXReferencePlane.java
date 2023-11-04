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
  * {@code GL_SGIX_reference_plane}
  */
public final class GLSGIXReferencePlane {
    public static final int GL_REFERENCE_PLANE_SGIX = 0x817D;
    public static final int GL_REFERENCE_PLANE_EQUATION_SGIX = 0x817E;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SGIX_reference_plane) return;
        ext.glReferencePlaneSGIX = load.invoke("glReferencePlaneSGIX", ofVoid(ADDRESS));
    }

    public static void glReferencePlaneSGIX(@NativeType("const GLdouble *") MemorySegment equation) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReferencePlaneSGIX).invokeExact(equation);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
