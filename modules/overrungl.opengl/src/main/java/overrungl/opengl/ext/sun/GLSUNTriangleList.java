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
package overrungl.opengl.ext.sun;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_SUN_triangle_list}
  */
public final class GLSUNTriangleList {
    public static final int GL_RESTART_SUN = 0x0001;
    public static final int GL_REPLACE_MIDDLE_SUN = 0x0002;
    public static final int GL_REPLACE_OLDEST_SUN = 0x0003;
    public static final int GL_TRIANGLE_LIST_SUN = 0x81D7;
    public static final int GL_REPLACEMENT_CODE_SUN = 0x81D8;
    public static final int GL_REPLACEMENT_CODE_ARRAY_SUN = 0x85C0;
    public static final int GL_REPLACEMENT_CODE_ARRAY_TYPE_SUN = 0x85C1;
    public static final int GL_REPLACEMENT_CODE_ARRAY_STRIDE_SUN = 0x85C2;
    public static final int GL_REPLACEMENT_CODE_ARRAY_POINTER_SUN = 0x85C3;
    public static final int GL_R1UI_V3F_SUN = 0x85C4;
    public static final int GL_R1UI_C4UB_V3F_SUN = 0x85C5;
    public static final int GL_R1UI_C3F_V3F_SUN = 0x85C6;
    public static final int GL_R1UI_N3F_V3F_SUN = 0x85C7;
    public static final int GL_R1UI_C4F_N3F_V3F_SUN = 0x85C8;
    public static final int GL_R1UI_T2F_V3F_SUN = 0x85C9;
    public static final int GL_R1UI_T2F_N3F_V3F_SUN = 0x85CA;
    public static final int GL_R1UI_T2F_C4F_N3F_V3F_SUN = 0x85CB;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SUN_triangle_list) return;
        ext.glReplacementCodeuiSUN = load.invoke("glReplacementCodeuiSUN", ofVoid(JAVA_INT));
        ext.glReplacementCodeusSUN = load.invoke("glReplacementCodeusSUN", ofVoid(JAVA_SHORT));
        ext.glReplacementCodeubSUN = load.invoke("glReplacementCodeubSUN", ofVoid(JAVA_BYTE));
        ext.glReplacementCodeuivSUN = load.invoke("glReplacementCodeuivSUN", ofVoid(ADDRESS));
        ext.glReplacementCodeusvSUN = load.invoke("glReplacementCodeusvSUN", ofVoid(ADDRESS));
        ext.glReplacementCodeubvSUN = load.invoke("glReplacementCodeubvSUN", ofVoid(ADDRESS));
        ext.glReplacementCodePointerSUN = load.invoke("glReplacementCodePointerSUN", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glReplacementCodeuiSUN(int code) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeuiSUN).invokeExact(code);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeusSUN(short code) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeusSUN).invokeExact(code);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeubSUN(byte code) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeubSUN).invokeExact(code);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeuivSUN(@NativeType("const GLuint *") MemorySegment code) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeuivSUN).invokeExact(code);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeusvSUN(@NativeType("const GLushort *") MemorySegment code) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeusvSUN).invokeExact(code);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeubvSUN(@NativeType("const GLubyte *") MemorySegment code) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeubvSUN).invokeExact(code);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodePointerSUN(int type, int stride, @NativeType("const void **") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodePointerSUN).invokeExact(type, stride, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
