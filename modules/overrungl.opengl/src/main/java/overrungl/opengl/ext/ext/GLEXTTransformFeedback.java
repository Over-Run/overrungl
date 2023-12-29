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
 * {@code GL_EXT_transform_feedback}
 */
public final class GLEXTTransformFeedback {
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_EXT = 0x8C8E;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START_EXT = 0x8C84;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_EXT = 0x8C85;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_EXT = 0x8C8F;
    public static final int GL_INTERLEAVED_ATTRIBS_EXT = 0x8C8C;
    public static final int GL_SEPARATE_ATTRIBS_EXT = 0x8C8D;
    public static final int GL_PRIMITIVES_GENERATED_EXT = 0x8C87;
    public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_EXT = 0x8C88;
    public static final int GL_RASTERIZER_DISCARD_EXT = 0x8C89;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_EXT = 0x8C8A;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_EXT = 0x8C8B;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_EXT = 0x8C80;
    public static final int GL_TRANSFORM_FEEDBACK_VARYINGS_EXT = 0x8C83;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE_EXT = 0x8C7F;
    public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT = 0x8C76;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_transform_feedback) return;
        ext.glBeginTransformFeedbackEXT = load.invoke("glBeginTransformFeedbackEXT", ofVoid(JAVA_INT));
        ext.glEndTransformFeedbackEXT = load.invoke("glEndTransformFeedbackEXT", ofVoid());
        ext.glBindBufferRangeEXT = load.invoke("glBindBufferRangeEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG));
        ext.glBindBufferOffsetEXT = load.invoke("glBindBufferOffsetEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glBindBufferBaseEXT = load.invoke("glBindBufferBaseEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glTransformFeedbackVaryingsEXT = load.invoke("glTransformFeedbackVaryingsEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT));
        ext.glGetTransformFeedbackVaryingEXT = load.invoke("glGetTransformFeedbackVaryingEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
    }

    public static void glBeginTransformFeedbackEXT(int primitiveMode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBeginTransformFeedbackEXT).invokeExact(primitiveMode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEndTransformFeedbackEXT() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEndTransformFeedbackEXT).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBindBufferRangeEXT(int target, int index, int buffer, long offset, long size) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindBufferRangeEXT).invokeExact(target, index, buffer, offset, size);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBindBufferOffsetEXT(int target, int index, int buffer, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindBufferOffsetEXT).invokeExact(target, index, buffer, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBindBufferBaseEXT(int target, int index, int buffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindBufferBaseEXT).invokeExact(target, index, buffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTransformFeedbackVaryingsEXT(int program, int count, @NativeType("const GLchar *const*") MemorySegment varyings, int bufferMode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTransformFeedbackVaryingsEXT).invokeExact(program, count, varyings, bufferMode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTransformFeedbackVaryingEXT(int program, int index, int bufSize, @NativeType("GLsizei *") MemorySegment length, @NativeType("GLsizei *") MemorySegment size, @NativeType("GLenum *") MemorySegment type, @NativeType("GLchar *") MemorySegment name) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTransformFeedbackVaryingEXT).invokeExact(program, index, bufSize, length, size, type, name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
