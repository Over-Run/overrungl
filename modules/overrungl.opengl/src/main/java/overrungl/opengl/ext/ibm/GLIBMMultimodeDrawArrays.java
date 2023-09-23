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
package overrungl.opengl.ext.ibm;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_IBM_multimode_draw_arrays}
  */
public final class GLIBMMultimodeDrawArrays {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_IBM_multimode_draw_arrays) return;
        ext.glMultiModeDrawArraysIBM = load.invoke("glMultiModeDrawArraysIBM", ofVoid(ADDRESS, ADDRESS, ADDRESS, JAVA_INT, JAVA_INT));
        ext.glMultiModeDrawElementsIBM = load.invoke("glMultiModeDrawElementsIBM", ofVoid(ADDRESS, ADDRESS, JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT));
    }

    public static void glMultiModeDrawArraysIBM(@NativeType("const GLenum *") MemorySegment mode, @NativeType("const GLint *") MemorySegment first, @NativeType("const GLsizei *") MemorySegment count, int primcount, int modestride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiModeDrawArraysIBM).invokeExact(mode, first, count, primcount, modestride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiModeDrawElementsIBM(@NativeType("const GLenum *") MemorySegment mode, @NativeType("const GLsizei *") MemorySegment count, int type, @NativeType("const void *const*") MemorySegment indices, int primcount, int modestride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiModeDrawElementsIBM).invokeExact(mode, count, type, indices, primcount, modestride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
