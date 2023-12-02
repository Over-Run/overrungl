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
package overrungl.opengl.ext.nv;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NV_transform_feedback2}
 */
public final class GLNVTransformFeedback2 {
    public static final int GL_TRANSFORM_FEEDBACK_NV = 0x8E22;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED_NV = 0x8E23;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE_NV = 0x8E24;
    public static final int GL_TRANSFORM_FEEDBACK_BINDING_NV = 0x8E25;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_transform_feedback2) return;
        ext.glBindTransformFeedbackNV = load.invoke("glBindTransformFeedbackNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glDeleteTransformFeedbacksNV = load.invoke("glDeleteTransformFeedbacksNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glGenTransformFeedbacksNV = load.invoke("glGenTransformFeedbacksNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glIsTransformFeedbackNV = load.invoke("glIsTransformFeedbackNV", of(JAVA_BYTE, JAVA_INT));
        ext.glPauseTransformFeedbackNV = load.invoke("glPauseTransformFeedbackNV", ofVoid());
        ext.glResumeTransformFeedbackNV = load.invoke("glResumeTransformFeedbackNV", ofVoid());
        ext.glDrawTransformFeedbackNV = load.invoke("glDrawTransformFeedbackNV", ofVoid(JAVA_INT, JAVA_INT));
    }

    public static void glBindTransformFeedbackNV(int target, int id) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindTransformFeedbackNV).invokeExact(target, id);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteTransformFeedbacksNV(int n, @NativeType("const GLuint *") MemorySegment ids) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteTransformFeedbacksNV).invokeExact(n, ids);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGenTransformFeedbacksNV(int n, @NativeType("GLuint *") MemorySegment ids) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenTransformFeedbacksNV).invokeExact(n, ids);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsTransformFeedbackNV(int id) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsTransformFeedbackNV).invokeExact(id);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPauseTransformFeedbackNV() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPauseTransformFeedbackNV).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glResumeTransformFeedbackNV() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glResumeTransformFeedbackNV).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDrawTransformFeedbackNV(int mode, int id) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDrawTransformFeedbackNV).invokeExact(mode, id);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
