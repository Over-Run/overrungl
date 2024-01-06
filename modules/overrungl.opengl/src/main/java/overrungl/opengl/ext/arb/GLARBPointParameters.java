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
package overrungl.opengl.ext.arb;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_ARB_point_parameters}
 */
public final class GLARBPointParameters {
    public static final int GL_POINT_SIZE_MIN_ARB = 0x8126;
    public static final int GL_POINT_SIZE_MAX_ARB = 0x8127;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE_ARB = 0x8128;
    public static final int GL_POINT_DISTANCE_ATTENUATION_ARB = 0x8129;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_point_parameters) return;
        ext.glPointParameterfARB = load.invoke("glPointParameterfARB", ofVoid(JAVA_INT, JAVA_FLOAT));
        ext.glPointParameterfvARB = load.invoke("glPointParameterfvARB", ofVoid(JAVA_INT, ADDRESS));
    }

    public static void glPointParameterfARB(int pname, float param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPointParameterfARB).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPointParameterfvARB(int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPointParameterfvARB).invokeExact(pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
