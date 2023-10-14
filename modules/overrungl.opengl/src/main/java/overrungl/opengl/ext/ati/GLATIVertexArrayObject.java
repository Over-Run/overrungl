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
  * {@code GL_ATI_vertex_array_object}
  */
public final class GLATIVertexArrayObject {
    public static final int GL_STATIC_ATI = 0x8760;
    public static final int GL_DYNAMIC_ATI = 0x8761;
    public static final int GL_PRESERVE_ATI = 0x8762;
    public static final int GL_DISCARD_ATI = 0x8763;
    public static final int GL_OBJECT_BUFFER_SIZE_ATI = 0x8764;
    public static final int GL_OBJECT_BUFFER_USAGE_ATI = 0x8765;
    public static final int GL_ARRAY_OBJECT_BUFFER_ATI = 0x8766;
    public static final int GL_ARRAY_OBJECT_OFFSET_ATI = 0x8767;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ATI_vertex_array_object) return;
        ext.glNewObjectBufferATI = load.invoke("glNewObjectBufferATI", of(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT));
        ext.glIsObjectBufferATI = load.invoke("glIsObjectBufferATI", of(JAVA_BYTE, JAVA_INT));
        ext.glUpdateObjectBufferATI = load.invoke("glUpdateObjectBufferATI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT));
        ext.glGetObjectBufferfvATI = load.invoke("glGetObjectBufferfvATI", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetObjectBufferivATI = load.invoke("glGetObjectBufferivATI", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glFreeObjectBufferATI = load.invoke("glFreeObjectBufferATI", ofVoid(JAVA_INT));
        ext.glArrayObjectATI = load.invoke("glArrayObjectATI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetArrayObjectfvATI = load.invoke("glGetArrayObjectfvATI", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetArrayObjectivATI = load.invoke("glGetArrayObjectivATI", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVariantArrayObjectATI = load.invoke("glVariantArrayObjectATI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetVariantArrayObjectfvATI = load.invoke("glGetVariantArrayObjectfvATI", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVariantArrayObjectivATI = load.invoke("glGetVariantArrayObjectivATI", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static int glNewObjectBufferATI(int size, @NativeType("const void *") MemorySegment pointer, int usage) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glNewObjectBufferATI).invokeExact(size, pointer, usage);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsObjectBufferATI(int buffer) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsObjectBufferATI).invokeExact(buffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUpdateObjectBufferATI(int buffer, int offset, int size, @NativeType("const void *") MemorySegment pointer, int preserve) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUpdateObjectBufferATI).invokeExact(buffer, offset, size, pointer, preserve);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetObjectBufferfvATI(int buffer, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetObjectBufferfvATI).invokeExact(buffer, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetObjectBufferivATI(int buffer, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetObjectBufferivATI).invokeExact(buffer, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFreeObjectBufferATI(int buffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFreeObjectBufferATI).invokeExact(buffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glArrayObjectATI(int array, int size, int type, int stride, int buffer, int offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glArrayObjectATI).invokeExact(array, size, type, stride, buffer, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetArrayObjectfvATI(int array, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetArrayObjectfvATI).invokeExact(array, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetArrayObjectivATI(int array, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetArrayObjectivATI).invokeExact(array, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVariantArrayObjectATI(int id, int type, int stride, int buffer, int offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVariantArrayObjectATI).invokeExact(id, type, stride, buffer, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVariantArrayObjectfvATI(int id, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVariantArrayObjectfvATI).invokeExact(id, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVariantArrayObjectivATI(int id, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVariantArrayObjectivATI).invokeExact(id, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
