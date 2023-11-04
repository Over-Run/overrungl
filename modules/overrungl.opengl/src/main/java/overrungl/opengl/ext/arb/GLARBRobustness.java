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
 * {@code GL_ARB_robustness}
 */
public final class GLARBRobustness {
    public static final int GL_NO_RESET_NOTIFICATION_ARB = 0x8261;
    public static final int GL_RESET_NOTIFICATION_STRATEGY_ARB = 0x8256;
    public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB = 0x00000004;
    public static final int GL_UNKNOWN_CONTEXT_RESET_ARB = 0x8255;
    public static final int GL_LOSE_CONTEXT_ON_RESET_ARB = 0x8252;
    public static final int GL_INNOCENT_CONTEXT_RESET_ARB = 0x8254;
    public static final int GL_GUILTY_CONTEXT_RESET_ARB = 0x8253;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_robustness) return;
        ext.glGetGraphicsResetStatusARB = load.invoke("glGetGraphicsResetStatusARB", of(JAVA_INT));
        ext.glGetnCompressedTexImageARB = load.invoke("glGetnCompressedTexImageARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetnTexImageARB = load.invoke("glGetnTexImageARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetnUniformdvARB = load.invoke("glGetnUniformdvARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetnUniformfvARB = load.invoke("glGetnUniformfvARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetnUniformivARB = load.invoke("glGetnUniformivARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetnUniformuivARB = load.invoke("glGetnUniformuivARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glReadnPixelsARB = load.invoke("glReadnPixelsARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static int glGetGraphicsResetStatusARB() {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glGetGraphicsResetStatusARB).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetnCompressedTexImageARB(int target, int lod, int bufSize, @NativeType("void*") MemorySegment img) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetnCompressedTexImageARB).invokeExact(target, lod, bufSize, img);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetnTexImageARB(int target, int level, int format, int type, int bufSize, @NativeType("void*") MemorySegment img) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetnTexImageARB).invokeExact(target, level, format, type, bufSize, img);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetnUniformdvARB(int program, int location, int bufSize, @NativeType("GLdouble*") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetnUniformdvARB).invokeExact(program, location, bufSize, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetnUniformfvARB(int program, int location, int bufSize, @NativeType("GLfloat*") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetnUniformfvARB).invokeExact(program, location, bufSize, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetnUniformivARB(int program, int location, int bufSize, @NativeType("GLint*") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetnUniformivARB).invokeExact(program, location, bufSize, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetnUniformuivARB(int program, int location, int bufSize, @NativeType("GLuint*") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetnUniformuivARB).invokeExact(program, location, bufSize, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReadnPixelsARB(int x, int y, int width, int height, int format, int type, int bufSize, @NativeType("void*") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReadnPixelsARB).invokeExact(x, y, width, height, format, type, bufSize, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
