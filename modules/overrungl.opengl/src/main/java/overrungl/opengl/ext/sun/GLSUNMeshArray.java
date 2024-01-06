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
package overrungl.opengl.ext.sun;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_SUN_mesh_array}
 */
public final class GLSUNMeshArray {
    public static final int GL_QUAD_MESH_SUN = 0x8614;
    public static final int GL_TRIANGLE_MESH_SUN = 0x8615;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SUN_mesh_array) return;
        ext.glDrawMeshArraysSUN = load.invoke("glDrawMeshArraysSUN", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glDrawMeshArraysSUN(int mode, int first, int count, int width) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDrawMeshArraysSUN).invokeExact(mode, first, count, width);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
