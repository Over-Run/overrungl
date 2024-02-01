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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_transform_feedback}
 */
public interface GLNVTransformFeedback {
    int GL_BACK_PRIMARY_COLOR_NV = 0x8C77;
    int GL_BACK_SECONDARY_COLOR_NV = 0x8C78;
    int GL_TEXTURE_COORD_NV = 0x8C79;
    int GL_CLIP_DISTANCE_NV = 0x8C7A;
    int GL_VERTEX_ID_NV = 0x8C7B;
    int GL_PRIMITIVE_ID_NV = 0x8C7C;
    int GL_GENERIC_ATTRIB_NV = 0x8C7D;
    int GL_TRANSFORM_FEEDBACK_ATTRIBS_NV = 0x8C7E;
    int GL_TRANSFORM_FEEDBACK_BUFFER_MODE_NV = 0x8C7F;
    int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_NV = 0x8C80;
    int GL_ACTIVE_VARYINGS_NV = 0x8C81;
    int GL_ACTIVE_VARYING_MAX_LENGTH_NV = 0x8C82;
    int GL_TRANSFORM_FEEDBACK_VARYINGS_NV = 0x8C83;
    int GL_TRANSFORM_FEEDBACK_BUFFER_START_NV = 0x8C84;
    int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_NV = 0x8C85;
    int GL_TRANSFORM_FEEDBACK_RECORD_NV = 0x8C86;
    int GL_PRIMITIVES_GENERATED_NV = 0x8C87;
    int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_NV = 0x8C88;
    int GL_RASTERIZER_DISCARD_NV = 0x8C89;
    int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_NV = 0x8C8A;
    int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_NV = 0x8C8B;
    int GL_INTERLEAVED_ATTRIBS_NV = 0x8C8C;
    int GL_SEPARATE_ATTRIBS_NV = 0x8C8D;
    int GL_TRANSFORM_FEEDBACK_BUFFER_NV = 0x8C8E;
    int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_NV = 0x8C8F;
    int GL_LAYER_NV = 0x8DAA;
    int GL_NEXT_BUFFER_NV = -2;
    int GL_SKIP_COMPONENTS4_NV = -3;
    int GL_SKIP_COMPONENTS3_NV = -4;
    int GL_SKIP_COMPONENTS2_NV = -5;
    int GL_SKIP_COMPONENTS1_NV = -6;

    void glBeginTransformFeedbackNV(int primitiveMode);
    void glEndTransformFeedbackNV();
    void glTransformFeedbackAttribsNV(int count, @NativeType("const GLint *") MemorySegment attribs, int bufferMode);
    void glBindBufferRangeNV(int target, int index, int buffer, long offset, long size);
    void glBindBufferOffsetNV(int target, int index, int buffer, long offset);
    void glBindBufferBaseNV(int target, int index, int buffer);
    void glTransformFeedbackVaryingsNV(int program, int count, @NativeType("const GLint *") MemorySegment locations, int bufferMode);
    void glActiveVaryingNV(int program, @NativeType("const GLchar *") MemorySegment name);
    int glGetVaryingLocationNV(int program, @NativeType("const GLchar *") MemorySegment name);
    void glGetActiveVaryingNV(int program, int index, int bufSize, @NativeType("GLsizei *") MemorySegment length, @NativeType("GLsizei *") MemorySegment size, @NativeType("GLenum *") MemorySegment type, @NativeType("GLchar *") MemorySegment name);
    void glGetTransformFeedbackVaryingNV(int program, int index, @NativeType("GLint *") MemorySegment location);
    void glTransformFeedbackStreamAttribsNV(int count, @NativeType("const GLint *") MemorySegment attribs, int nbuffers, @NativeType("const GLint *") MemorySegment bufstreams, int bufferMode);
}
