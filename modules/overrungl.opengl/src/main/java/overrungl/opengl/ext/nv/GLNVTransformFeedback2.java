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
 * {@code GL_NV_transform_feedback2}
 */
public interface GLNVTransformFeedback2 {
    int GL_TRANSFORM_FEEDBACK_NV = 0x8E22;
    int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED_NV = 0x8E23;
    int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE_NV = 0x8E24;
    int GL_TRANSFORM_FEEDBACK_BINDING_NV = 0x8E25;

    void glBindTransformFeedbackNV(int target, int id);
    void glDeleteTransformFeedbacksNV(int n, @NativeType("const GLuint *") MemorySegment ids);
    void glGenTransformFeedbacksNV(int n, @NativeType("GLuint *") MemorySegment ids);
    boolean glIsTransformFeedbackNV(int id);
    void glPauseTransformFeedbackNV();
    void glResumeTransformFeedbackNV();
    void glDrawTransformFeedbackNV(int mode, int id);
}
