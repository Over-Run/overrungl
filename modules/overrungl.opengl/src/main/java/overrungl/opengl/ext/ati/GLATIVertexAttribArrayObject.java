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
 * {@code GL_ATI_vertex_attrib_array_object}
 */
public final class GLATIVertexAttribArrayObject {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ATI_vertex_attrib_array_object) return;
        ext.glVertexAttribArrayObjectATI = load.invoke("glVertexAttribArrayObjectATI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetVertexAttribArrayObjectfvATI = load.invoke("glGetVertexAttribArrayObjectfvATI", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVertexAttribArrayObjectivATI = load.invoke("glGetVertexAttribArrayObjectivATI", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glVertexAttribArrayObjectATI(int index, int size, int type, boolean normalized, int stride, int buffer, int offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribArrayObjectATI).invokeExact(index, size, type, normalized, stride, buffer, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexAttribArrayObjectfvATI(int index, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexAttribArrayObjectfvATI).invokeExact(index, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexAttribArrayObjectivATI(int index, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexAttribArrayObjectivATI).invokeExact(index, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
