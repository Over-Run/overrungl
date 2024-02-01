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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_transform_feedback}
 */
public interface GLEXTTransformFeedback {
    int GL_TRANSFORM_FEEDBACK_BUFFER_EXT = 0x8C8E;
    int GL_TRANSFORM_FEEDBACK_BUFFER_START_EXT = 0x8C84;
    int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_EXT = 0x8C85;
    int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_EXT = 0x8C8F;
    int GL_INTERLEAVED_ATTRIBS_EXT = 0x8C8C;
    int GL_SEPARATE_ATTRIBS_EXT = 0x8C8D;
    int GL_PRIMITIVES_GENERATED_EXT = 0x8C87;
    int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_EXT = 0x8C88;
    int GL_RASTERIZER_DISCARD_EXT = 0x8C89;
    int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_EXT = 0x8C8A;
    int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_EXT = 0x8C8B;
    int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_EXT = 0x8C80;
    int GL_TRANSFORM_FEEDBACK_VARYINGS_EXT = 0x8C83;
    int GL_TRANSFORM_FEEDBACK_BUFFER_MODE_EXT = 0x8C7F;
    int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT = 0x8C76;

    default void glBeginTransformFeedbackEXT(int primitiveMode) {
        throw new ContextException();
    }

    default void glEndTransformFeedbackEXT() {
        throw new ContextException();
    }

    default void glBindBufferRangeEXT(int target, int index, int buffer, long offset, long size) {
        throw new ContextException();
    }

    default void glBindBufferOffsetEXT(int target, int index, int buffer, long offset) {
        throw new ContextException();
    }

    default void glBindBufferBaseEXT(int target, int index, int buffer) {
        throw new ContextException();
    }

    default void glTransformFeedbackVaryingsEXT(int program, int count, @NativeType("const GLchar *const*") MemorySegment varyings, int bufferMode) {
        throw new ContextException();
    }

    default void glGetTransformFeedbackVaryingEXT(int program, int index, int bufSize, @NativeType("GLsizei *") MemorySegment length, @NativeType("GLsizei *") MemorySegment size, @NativeType("GLenum *") MemorySegment type, @NativeType("GLchar *") MemorySegment name) {
        throw new ContextException();
    }

}
