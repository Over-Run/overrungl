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
 * {@code GL_NV_transform_feedback}
 */
public final class GLNVTransformFeedback {
    public static final int GL_BACK_PRIMARY_COLOR_NV = 0x8C77;
    public static final int GL_BACK_SECONDARY_COLOR_NV = 0x8C78;
    public static final int GL_TEXTURE_COORD_NV = 0x8C79;
    public static final int GL_CLIP_DISTANCE_NV = 0x8C7A;
    public static final int GL_VERTEX_ID_NV = 0x8C7B;
    public static final int GL_PRIMITIVE_ID_NV = 0x8C7C;
    public static final int GL_GENERIC_ATTRIB_NV = 0x8C7D;
    public static final int GL_TRANSFORM_FEEDBACK_ATTRIBS_NV = 0x8C7E;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE_NV = 0x8C7F;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_NV = 0x8C80;
    public static final int GL_ACTIVE_VARYINGS_NV = 0x8C81;
    public static final int GL_ACTIVE_VARYING_MAX_LENGTH_NV = 0x8C82;
    public static final int GL_TRANSFORM_FEEDBACK_VARYINGS_NV = 0x8C83;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START_NV = 0x8C84;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_NV = 0x8C85;
    public static final int GL_TRANSFORM_FEEDBACK_RECORD_NV = 0x8C86;
    public static final int GL_PRIMITIVES_GENERATED_NV = 0x8C87;
    public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_NV = 0x8C88;
    public static final int GL_RASTERIZER_DISCARD_NV = 0x8C89;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_NV = 0x8C8A;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_NV = 0x8C8B;
    public static final int GL_INTERLEAVED_ATTRIBS_NV = 0x8C8C;
    public static final int GL_SEPARATE_ATTRIBS_NV = 0x8C8D;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_NV = 0x8C8E;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_NV = 0x8C8F;
    public static final int GL_LAYER_NV = 0x8DAA;
    public static final int GL_NEXT_BUFFER_NV = -2;
    public static final int GL_SKIP_COMPONENTS4_NV = -3;
    public static final int GL_SKIP_COMPONENTS3_NV = -4;
    public static final int GL_SKIP_COMPONENTS2_NV = -5;
    public static final int GL_SKIP_COMPONENTS1_NV = -6;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_transform_feedback) return;
        ext.glBeginTransformFeedbackNV = load.invoke("glBeginTransformFeedbackNV", ofVoid(JAVA_INT));
        ext.glEndTransformFeedbackNV = load.invoke("glEndTransformFeedbackNV", ofVoid());
        ext.glTransformFeedbackAttribsNV = load.invoke("glTransformFeedbackAttribsNV", ofVoid(JAVA_INT, ADDRESS, JAVA_INT));
        ext.glBindBufferRangeNV = load.invoke("glBindBufferRangeNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG));
        ext.glBindBufferOffsetNV = load.invoke("glBindBufferOffsetNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glBindBufferBaseNV = load.invoke("glBindBufferBaseNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glTransformFeedbackVaryingsNV = load.invoke("glTransformFeedbackVaryingsNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT));
        ext.glActiveVaryingNV = load.invoke("glActiveVaryingNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glGetVaryingLocationNV = load.invoke("glGetVaryingLocationNV", of(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetActiveVaryingNV = load.invoke("glGetActiveVaryingNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
        ext.glGetTransformFeedbackVaryingNV = load.invoke("glGetTransformFeedbackVaryingNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTransformFeedbackStreamAttribsNV = load.invoke("glTransformFeedbackStreamAttribsNV", ofVoid(JAVA_INT, ADDRESS, JAVA_INT, ADDRESS, JAVA_INT));
    }

    public static void glBeginTransformFeedbackNV(int primitiveMode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBeginTransformFeedbackNV).invokeExact(primitiveMode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEndTransformFeedbackNV() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEndTransformFeedbackNV).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTransformFeedbackAttribsNV(int count, @NativeType("const GLint *") MemorySegment attribs, int bufferMode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTransformFeedbackAttribsNV).invokeExact(count, attribs, bufferMode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBindBufferRangeNV(int target, int index, int buffer, long offset, long size) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindBufferRangeNV).invokeExact(target, index, buffer, offset, size);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBindBufferOffsetNV(int target, int index, int buffer, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindBufferOffsetNV).invokeExact(target, index, buffer, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBindBufferBaseNV(int target, int index, int buffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindBufferBaseNV).invokeExact(target, index, buffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTransformFeedbackVaryingsNV(int program, int count, @NativeType("const GLint *") MemorySegment locations, int bufferMode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTransformFeedbackVaryingsNV).invokeExact(program, count, locations, bufferMode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glActiveVaryingNV(int program, @NativeType("const GLchar *") MemorySegment name) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glActiveVaryingNV).invokeExact(program, name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glGetVaryingLocationNV(int program, @NativeType("const GLchar *") MemorySegment name) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glGetVaryingLocationNV).invokeExact(program, name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetActiveVaryingNV(int program, int index, int bufSize, @NativeType("GLsizei *") MemorySegment length, @NativeType("GLsizei *") MemorySegment size, @NativeType("GLenum *") MemorySegment type, @NativeType("GLchar *") MemorySegment name) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetActiveVaryingNV).invokeExact(program, index, bufSize, length, size, type, name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTransformFeedbackVaryingNV(int program, int index, @NativeType("GLint *") MemorySegment location) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTransformFeedbackVaryingNV).invokeExact(program, index, location);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTransformFeedbackStreamAttribsNV(int count, @NativeType("const GLint *") MemorySegment attribs, int nbuffers, @NativeType("const GLint *") MemorySegment bufstreams, int bufferMode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTransformFeedbackStreamAttribsNV).invokeExact(count, attribs, nbuffers, bufstreams, bufferMode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
