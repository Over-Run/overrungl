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
 * {@code GL_ARB_occlusion_query}
 */
public final class GLARBOcclusionQuery {
    public static final int GL_QUERY_COUNTER_BITS_ARB = 0x8864;
    public static final int GL_CURRENT_QUERY_ARB = 0x8865;
    public static final int GL_QUERY_RESULT_ARB = 0x8866;
    public static final int GL_QUERY_RESULT_AVAILABLE_ARB = 0x8867;
    public static final int GL_SAMPLES_PASSED_ARB = 0x8914;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_occlusion_query) return;
        ext.glGenQueriesARB = load.invoke("glGenQueriesARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glDeleteQueriesARB = load.invoke("glDeleteQueriesARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glIsQueryARB = load.invoke("glIsQueryARB", of(JAVA_BYTE, JAVA_INT));
        ext.glBeginQueryARB = load.invoke("glBeginQueryARB", ofVoid(JAVA_INT, JAVA_INT));
        ext.glEndQueryARB = load.invoke("glEndQueryARB", ofVoid(JAVA_INT));
        ext.glGetQueryivARB = load.invoke("glGetQueryivARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetQueryObjectivARB = load.invoke("glGetQueryObjectivARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetQueryObjectuivARB = load.invoke("glGetQueryObjectuivARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glGenQueriesARB(int n, @NativeType("GLuint *") MemorySegment ids) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenQueriesARB).invokeExact(n, ids);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteQueriesARB(int n, @NativeType("const GLuint *") MemorySegment ids) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteQueriesARB).invokeExact(n, ids);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsQueryARB(int id) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsQueryARB).invokeExact(id);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBeginQueryARB(int target, int id) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBeginQueryARB).invokeExact(target, id);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEndQueryARB(int target) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEndQueryARB).invokeExact(target);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetQueryivARB(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetQueryivARB).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetQueryObjectivARB(int id, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetQueryObjectivARB).invokeExact(id, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetQueryObjectuivARB(int id, int pname, @NativeType("GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetQueryObjectuivARB).invokeExact(id, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
