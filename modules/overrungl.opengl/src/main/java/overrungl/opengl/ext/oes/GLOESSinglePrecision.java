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
package overrungl.opengl.ext.oes;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_OES_single_precision}
  */
public final class GLOESSinglePrecision {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_OES_single_precision) return;
        ext.glClearDepthfOES = load.invoke("glClearDepthfOES", ofVoid(JAVA_FLOAT));
        ext.glClipPlanefOES = load.invoke("glClipPlanefOES", ofVoid(JAVA_INT, ADDRESS));
        ext.glDepthRangefOES = load.invoke("glDepthRangefOES", ofVoid(JAVA_FLOAT, JAVA_FLOAT));
        ext.glFrustumfOES = load.invoke("glFrustumfOES", ofVoid(JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glGetClipPlanefOES = load.invoke("glGetClipPlanefOES", ofVoid(JAVA_INT, ADDRESS));
        ext.glOrthofOES = load.invoke("glOrthofOES", ofVoid(JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
    }

    public static void glClearDepthfOES(float depth) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glClearDepthfOES).invokeExact(depth);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glClipPlanefOES(int plane, @NativeType("const GLfloat *") MemorySegment equation) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glClipPlanefOES).invokeExact(plane, equation);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDepthRangefOES(float n, float f) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDepthRangefOES).invokeExact(n, f);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFrustumfOES(float l, float r, float b, float t, float n, float f) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFrustumfOES).invokeExact(l, r, b, t, n, f);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetClipPlanefOES(int plane, @NativeType("GLfloat *") MemorySegment equation) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetClipPlanefOES).invokeExact(plane, equation);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glOrthofOES(float l, float r, float b, float t, float n, float f) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glOrthofOES).invokeExact(l, r, b, t, n, f);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
