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
package overrungl.opengl.ext;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_HP_image_transform}
 */
public final class GLHPImageTransform {
    public static final int GL_IMAGE_SCALE_X_HP = 0x8155;
    public static final int GL_IMAGE_SCALE_Y_HP = 0x8156;
    public static final int GL_IMAGE_TRANSLATE_X_HP = 0x8157;
    public static final int GL_IMAGE_TRANSLATE_Y_HP = 0x8158;
    public static final int GL_IMAGE_ROTATE_ANGLE_HP = 0x8159;
    public static final int GL_IMAGE_ROTATE_ORIGIN_X_HP = 0x815A;
    public static final int GL_IMAGE_ROTATE_ORIGIN_Y_HP = 0x815B;
    public static final int GL_IMAGE_MAG_FILTER_HP = 0x815C;
    public static final int GL_IMAGE_MIN_FILTER_HP = 0x815D;
    public static final int GL_IMAGE_CUBIC_WEIGHT_HP = 0x815E;
    public static final int GL_CUBIC_HP = 0x815F;
    public static final int GL_AVERAGE_HP = 0x8160;
    public static final int GL_IMAGE_TRANSFORM_2D_HP = 0x8161;
    public static final int GL_POST_IMAGE_TRANSFORM_COLOR_TABLE_HP = 0x8162;
    public static final int GL_PROXY_POST_IMAGE_TRANSFORM_COLOR_TABLE_HP = 0x8163;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_HP_image_transform) return;
        ext.glImageTransformParameteriHP = load.invoke("glImageTransformParameteriHP", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glImageTransformParameterfHP = load.invoke("glImageTransformParameterfHP", ofVoid(JAVA_INT, JAVA_INT, JAVA_FLOAT));
        ext.glImageTransformParameterivHP = load.invoke("glImageTransformParameterivHP", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glImageTransformParameterfvHP = load.invoke("glImageTransformParameterfvHP", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetImageTransformParameterivHP = load.invoke("glGetImageTransformParameterivHP", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetImageTransformParameterfvHP = load.invoke("glGetImageTransformParameterfvHP", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glImageTransformParameteriHP(int target, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glImageTransformParameteriHP).invokeExact(target, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glImageTransformParameterfHP(int target, int pname, float param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glImageTransformParameterfHP).invokeExact(target, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glImageTransformParameterivHP(int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glImageTransformParameterivHP).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glImageTransformParameterfvHP(int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glImageTransformParameterfvHP).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetImageTransformParameterivHP(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetImageTransformParameterivHP).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetImageTransformParameterfvHP(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetImageTransformParameterfvHP).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
