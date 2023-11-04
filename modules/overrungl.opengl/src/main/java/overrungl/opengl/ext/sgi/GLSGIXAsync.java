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
package overrungl.opengl.ext.sgi;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_SGIX_async}
 */
public final class GLSGIXAsync {
    public static final int GL_ASYNC_MARKER_SGIX = 0x8329;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SGIX_async) return;
        ext.glAsyncMarkerSGIX = load.invoke("glAsyncMarkerSGIX", ofVoid(JAVA_INT));
        ext.glFinishAsyncSGIX = load.invoke("glFinishAsyncSGIX", of(JAVA_INT, ADDRESS));
        ext.glPollAsyncSGIX = load.invoke("glPollAsyncSGIX", of(JAVA_INT, ADDRESS));
        ext.glGenAsyncMarkersSGIX = load.invoke("glGenAsyncMarkersSGIX", of(JAVA_INT, JAVA_INT));
        ext.glDeleteAsyncMarkersSGIX = load.invoke("glDeleteAsyncMarkersSGIX", ofVoid(JAVA_INT, JAVA_INT));
        ext.glIsAsyncMarkerSGIX = load.invoke("glIsAsyncMarkerSGIX", of(JAVA_BYTE, JAVA_INT));
    }

    public static void glAsyncMarkerSGIX(int marker) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glAsyncMarkerSGIX).invokeExact(marker);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glFinishAsyncSGIX(@NativeType("GLuint *") MemorySegment markerp) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glFinishAsyncSGIX).invokeExact(markerp);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glPollAsyncSGIX(@NativeType("GLuint *") MemorySegment markerp) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glPollAsyncSGIX).invokeExact(markerp);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glGenAsyncMarkersSGIX(int range) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glGenAsyncMarkersSGIX).invokeExact(range);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteAsyncMarkersSGIX(int marker, int range) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteAsyncMarkersSGIX).invokeExact(marker, range);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsAsyncMarkerSGIX(int marker) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsAsyncMarkerSGIX).invokeExact(marker);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
