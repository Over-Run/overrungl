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
package overrungl.opengl.ext.nv;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NV_geometry_program4}
 */
public final class GLNVGeometryProgram4 {
    public static final int GL_GEOMETRY_PROGRAM_NV = 0x8C26;
    public static final int GL_MAX_PROGRAM_OUTPUT_VERTICES_NV = 0x8C27;
    public static final int GL_MAX_PROGRAM_TOTAL_OUTPUT_COMPONENTS_NV = 0x8C28;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_geometry_program4) return;
        ext.glProgramVertexLimitNV = load.invoke("glProgramVertexLimitNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glFramebufferTextureEXT = load.invoke("glFramebufferTextureEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glFramebufferTextureFaceEXT = load.invoke("glFramebufferTextureFaceEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glProgramVertexLimitNV(int target, int limit) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramVertexLimitNV).invokeExact(target, limit);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFramebufferTextureEXT(int target, int attachment, int texture, int level) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFramebufferTextureEXT).invokeExact(target, attachment, texture, level);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFramebufferTextureFaceEXT(int target, int attachment, int texture, int level, int face) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFramebufferTextureFaceEXT).invokeExact(target, attachment, texture, level, face);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
