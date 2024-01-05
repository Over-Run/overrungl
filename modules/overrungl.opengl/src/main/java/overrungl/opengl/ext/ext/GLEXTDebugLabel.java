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
package overrungl.opengl.ext.ext;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_EXT_debug_label}
 */
public final class GLEXTDebugLabel {
    public static final int GL_PROGRAM_PIPELINE_OBJECT_EXT = 0x8A4F;
    public static final int GL_PROGRAM_OBJECT_EXT = 0x8B40;
    public static final int GL_SHADER_OBJECT_EXT = 0x8B48;
    public static final int GL_BUFFER_OBJECT_EXT = 0x9151;
    public static final int GL_QUERY_OBJECT_EXT = 0x9153;
    public static final int GL_VERTEX_ARRAY_OBJECT_EXT = 0x9154;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_debug_label) return;
        ext.glLabelObjectEXT = load.invoke("glLabelObjectEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetObjectLabelEXT = load.invoke("glGetObjectLabelEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
    }

    public static void glLabelObjectEXT(int type, int object, int length, @NativeType("const GLchar *") MemorySegment label) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glLabelObjectEXT).invokeExact(type, object, length, label);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetObjectLabelEXT(int type, int object, int bufSize, @NativeType("GLsizei *") MemorySegment length, @NativeType("GLchar *") MemorySegment label) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetObjectLabelEXT).invokeExact(type, object, bufSize, length, label);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
