/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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
package overrungl.opengl.ext.amd;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_AMD_name_gen_delete}
  */
public final class GLAMDNameGenDelete {
    public static final int GL_DATA_BUFFER_AMD = 0x9151;
    public static final int GL_PERFORMANCE_MONITOR_AMD = 0x9152;
    public static final int GL_QUERY_OBJECT_AMD = 0x9153;
    public static final int GL_VERTEX_ARRAY_OBJECT_AMD = 0x9154;
    public static final int GL_SAMPLER_OBJECT_AMD = 0x9155;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_name_gen_delete) return;
        ext.glGenNamesAMD = load.invoke("glGenNamesAMD", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glDeleteNamesAMD = load.invoke("glDeleteNamesAMD", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glIsNameAMD = load.invoke("glIsNameAMD", of(JAVA_BYTE, JAVA_INT, JAVA_INT));
    }

    public static void glGenNamesAMD(int identifier, int num, @NativeType("GLuint *") MemorySegment names) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenNamesAMD).invokeExact(identifier, num, names);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteNamesAMD(int identifier, int num, @NativeType("const GLuint *") MemorySegment names) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteNamesAMD).invokeExact(identifier, num, names);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsNameAMD(int identifier, int name) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsNameAMD).invokeExact(identifier, name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
