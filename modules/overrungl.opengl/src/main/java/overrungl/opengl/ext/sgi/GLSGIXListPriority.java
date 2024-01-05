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
 * {@code GL_SGIX_list_priority}
 */
public final class GLSGIXListPriority {
    public static final int GL_LIST_PRIORITY_SGIX = 0x8182;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SGIX_list_priority) return;
        ext.glGetListParameterfvSGIX = load.invoke("glGetListParameterfvSGIX", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetListParameterivSGIX = load.invoke("glGetListParameterivSGIX", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glListParameterfSGIX = load.invoke("glListParameterfSGIX", ofVoid(JAVA_INT, JAVA_INT, JAVA_FLOAT));
        ext.glListParameterfvSGIX = load.invoke("glListParameterfvSGIX", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glListParameteriSGIX = load.invoke("glListParameteriSGIX", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glListParameterivSGIX = load.invoke("glListParameterivSGIX", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glGetListParameterfvSGIX(int list, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetListParameterfvSGIX).invokeExact(list, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetListParameterivSGIX(int list, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetListParameterivSGIX).invokeExact(list, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glListParameterfSGIX(int list, int pname, float param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glListParameterfSGIX).invokeExact(list, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glListParameterfvSGIX(int list, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glListParameterfvSGIX).invokeExact(list, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glListParameteriSGIX(int list, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glListParameteriSGIX).invokeExact(list, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glListParameterivSGIX(int list, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glListParameterivSGIX).invokeExact(list, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
