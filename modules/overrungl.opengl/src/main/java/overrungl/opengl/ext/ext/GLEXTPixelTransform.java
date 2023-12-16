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
 * {@code GL_EXT_pixel_transform}
 */
public final class GLEXTPixelTransform {
    public static final int GL_PIXEL_TRANSFORM_2D_EXT = 0x8330;
    public static final int GL_PIXEL_MAG_FILTER_EXT = 0x8331;
    public static final int GL_PIXEL_MIN_FILTER_EXT = 0x8332;
    public static final int GL_PIXEL_CUBIC_WEIGHT_EXT = 0x8333;
    public static final int GL_CUBIC_EXT = 0x8334;
    public static final int GL_AVERAGE_EXT = 0x8335;
    public static final int GL_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT = 0x8336;
    public static final int GL_MAX_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT = 0x8337;
    public static final int GL_PIXEL_TRANSFORM_2D_MATRIX_EXT = 0x8338;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_pixel_transform) return;
        ext.glPixelTransformParameteriEXT = load.invoke("glPixelTransformParameteriEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glPixelTransformParameterfEXT = load.invoke("glPixelTransformParameterfEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_FLOAT));
        ext.glPixelTransformParameterivEXT = load.invoke("glPixelTransformParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glPixelTransformParameterfvEXT = load.invoke("glPixelTransformParameterfvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetPixelTransformParameterivEXT = load.invoke("glGetPixelTransformParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetPixelTransformParameterfvEXT = load.invoke("glGetPixelTransformParameterfvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glPixelTransformParameteriEXT(int target, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPixelTransformParameteriEXT).invokeExact(target, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPixelTransformParameterfEXT(int target, int pname, float param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPixelTransformParameterfEXT).invokeExact(target, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPixelTransformParameterivEXT(int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPixelTransformParameterivEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPixelTransformParameterfvEXT(int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPixelTransformParameterfvEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPixelTransformParameterivEXT(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPixelTransformParameterivEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPixelTransformParameterfvEXT(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPixelTransformParameterfvEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
