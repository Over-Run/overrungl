/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final MethodHandle MH_glBeginTransformFeedbackEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBeginTransformFeedbackEXT;
    public static final MethodHandle MH_glEndTransformFeedbackEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glEndTransformFeedbackEXT;
    public static final MethodHandle MH_glBindBufferRangeEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glBindBufferRangeEXT;
    public static final MethodHandle MH_glBindBufferOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glBindBufferOffsetEXT;
    public static final MethodHandle MH_glBindBufferBaseEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindBufferBaseEXT;
    public static final MethodHandle MH_glTransformFeedbackVaryingsEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTransformFeedbackVaryingsEXT;
    public static final MethodHandle MH_glGetTransformFeedbackVaryingEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTransformFeedbackVaryingEXT;

    public GLEXTTransformFeedback(overrungl.opengl.GLLoadFunc func) {
        PFN_glBeginTransformFeedbackEXT = func.invoke("glBeginTransformFeedbackEXT", "glBeginTransformFeedback");
        PFN_glEndTransformFeedbackEXT = func.invoke("glEndTransformFeedbackEXT", "glEndTransformFeedback");
        PFN_glBindBufferRangeEXT = func.invoke("glBindBufferRangeEXT", "glBindBufferRange");
        PFN_glBindBufferOffsetEXT = func.invoke("glBindBufferOffsetEXT");
        PFN_glBindBufferBaseEXT = func.invoke("glBindBufferBaseEXT", "glBindBufferBase");
        PFN_glTransformFeedbackVaryingsEXT = func.invoke("glTransformFeedbackVaryingsEXT", "glTransformFeedbackVaryings");
        PFN_glGetTransformFeedbackVaryingEXT = func.invoke("glGetTransformFeedbackVaryingEXT", "glGetTransformFeedbackVarying");
    }

    public void BeginTransformFeedbackEXT(@CType("GLenum") int primitiveMode) {
        try { if (!Unmarshal.isNullPointer(PFN_glBeginTransformFeedbackEXT))
            MH_glBeginTransformFeedbackEXT.invokeExact(PFN_glBeginTransformFeedbackEXT, primitiveMode);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBeginTransformFeedbackEXT", e); }
    }

    public void EndTransformFeedbackEXT() {
        try { if (!Unmarshal.isNullPointer(PFN_glEndTransformFeedbackEXT))
            MH_glEndTransformFeedbackEXT.invokeExact(PFN_glEndTransformFeedbackEXT);
        }
        catch (Throwable e) { throw new RuntimeException("error in glEndTransformFeedbackEXT", e); }
    }

    public void BindBufferRangeEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindBufferRangeEXT))
            MH_glBindBufferRangeEXT.invokeExact(PFN_glBindBufferRangeEXT, target, index, buffer, offset, size);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindBufferRangeEXT", e); }
    }

    public void BindBufferOffsetEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int buffer, @CType("GLintptr") long offset) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindBufferOffsetEXT))
            MH_glBindBufferOffsetEXT.invokeExact(PFN_glBindBufferOffsetEXT, target, index, buffer, offset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindBufferOffsetEXT", e); }
    }

    public void BindBufferBaseEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int buffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindBufferBaseEXT))
            MH_glBindBufferBaseEXT.invokeExact(PFN_glBindBufferBaseEXT, target, index, buffer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindBufferBaseEXT", e); }
    }

    public void TransformFeedbackVaryingsEXT(@CType("GLuint") int program, @CType("GLsizei") int count, @CType("const GLchar *const*") java.lang.foreign.MemorySegment varyings, @CType("GLenum") int bufferMode) {
        try { if (!Unmarshal.isNullPointer(PFN_glTransformFeedbackVaryingsEXT))
            MH_glTransformFeedbackVaryingsEXT.invokeExact(PFN_glTransformFeedbackVaryingsEXT, program, count, varyings, bufferMode);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTransformFeedbackVaryingsEXT", e); }
    }

    public void GetTransformFeedbackVaryingEXT(@CType("GLuint") int program, @CType("GLuint") int index, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLsizei *") java.lang.foreign.MemorySegment size, @CType("GLenum *") java.lang.foreign.MemorySegment type, @CType("GLchar *") java.lang.foreign.MemorySegment name) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTransformFeedbackVaryingEXT))
            MH_glGetTransformFeedbackVaryingEXT.invokeExact(PFN_glGetTransformFeedbackVaryingEXT, program, index, bufSize, length, size, type, name);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTransformFeedbackVaryingEXT", e); }
    }

}
