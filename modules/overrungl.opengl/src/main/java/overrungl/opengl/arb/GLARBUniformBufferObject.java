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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBUniformBufferObject {
    public static final int GL_UNIFORM_BUFFER = 0x8A11;
    public static final int GL_UNIFORM_BUFFER_BINDING = 0x8A28;
    public static final int GL_UNIFORM_BUFFER_START = 0x8A29;
    public static final int GL_UNIFORM_BUFFER_SIZE = 0x8A2A;
    public static final int GL_MAX_VERTEX_UNIFORM_BLOCKS = 0x8A2B;
    public static final int GL_MAX_GEOMETRY_UNIFORM_BLOCKS = 0x8A2C;
    public static final int GL_MAX_FRAGMENT_UNIFORM_BLOCKS = 0x8A2D;
    public static final int GL_MAX_COMBINED_UNIFORM_BLOCKS = 0x8A2E;
    public static final int GL_MAX_UNIFORM_BUFFER_BINDINGS = 0x8A2F;
    public static final int GL_MAX_UNIFORM_BLOCK_SIZE = 0x8A30;
    public static final int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 0x8A31;
    public static final int GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 0x8A32;
    public static final int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8A33;
    public static final int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 0x8A34;
    public static final int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 0x8A35;
    public static final int GL_ACTIVE_UNIFORM_BLOCKS = 0x8A36;
    public static final int GL_UNIFORM_TYPE = 0x8A37;
    public static final int GL_UNIFORM_SIZE = 0x8A38;
    public static final int GL_UNIFORM_NAME_LENGTH = 0x8A39;
    public static final int GL_UNIFORM_BLOCK_INDEX = 0x8A3A;
    public static final int GL_UNIFORM_OFFSET = 0x8A3B;
    public static final int GL_UNIFORM_ARRAY_STRIDE = 0x8A3C;
    public static final int GL_UNIFORM_MATRIX_STRIDE = 0x8A3D;
    public static final int GL_UNIFORM_IS_ROW_MAJOR = 0x8A3E;
    public static final int GL_UNIFORM_BLOCK_BINDING = 0x8A3F;
    public static final int GL_UNIFORM_BLOCK_DATA_SIZE = 0x8A40;
    public static final int GL_UNIFORM_BLOCK_NAME_LENGTH = 0x8A41;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = 0x8A42;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 0x8A43;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 0x8A44;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 0x8A45;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8A46;
    public static final int GL_INVALID_INDEX = 0xFFFFFFFF;
    public static final MethodHandle MH_glGetUniformIndices = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetUniformIndices;
    public static final MethodHandle MH_glGetActiveUniformsiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetActiveUniformsiv;
    public static final MethodHandle MH_glGetActiveUniformName = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetActiveUniformName;
    public static final MethodHandle MH_glGetUniformBlockIndex = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetUniformBlockIndex;
    public static final MethodHandle MH_glGetActiveUniformBlockiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetActiveUniformBlockiv;
    public static final MethodHandle MH_glGetActiveUniformBlockName = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetActiveUniformBlockName;
    public static final MethodHandle MH_glUniformBlockBinding = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUniformBlockBinding;
    public static final MethodHandle MH_glBindBufferRange = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glBindBufferRange;
    public static final MethodHandle MH_glBindBufferBase = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindBufferBase;
    public static final MethodHandle MH_glGetIntegeri_v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetIntegeri_v;

    public GLARBUniformBufferObject(overrungl.opengl.GLLoadFunc func) {
        PFN_glGetUniformIndices = func.invoke("glGetUniformIndices");
        PFN_glGetActiveUniformsiv = func.invoke("glGetActiveUniformsiv");
        PFN_glGetActiveUniformName = func.invoke("glGetActiveUniformName");
        PFN_glGetUniformBlockIndex = func.invoke("glGetUniformBlockIndex");
        PFN_glGetActiveUniformBlockiv = func.invoke("glGetActiveUniformBlockiv");
        PFN_glGetActiveUniformBlockName = func.invoke("glGetActiveUniformBlockName");
        PFN_glUniformBlockBinding = func.invoke("glUniformBlockBinding");
        PFN_glBindBufferRange = func.invoke("glBindBufferRange");
        PFN_glBindBufferBase = func.invoke("glBindBufferBase");
        PFN_glGetIntegeri_v = func.invoke("glGetIntegeri_v");
    }

    public void GetUniformIndices(@CType("GLuint") int program, @CType("GLsizei") int uniformCount, @CType("const GLchar *const*") java.lang.foreign.MemorySegment uniformNames, @CType("GLuint *") java.lang.foreign.MemorySegment uniformIndices) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetUniformIndices))
            MH_glGetUniformIndices.invokeExact(PFN_glGetUniformIndices, program, uniformCount, uniformNames, uniformIndices);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformIndices", e); }
    }

    public void GetActiveUniformsiv(@CType("GLuint") int program, @CType("GLsizei") int uniformCount, @CType("const GLuint *") java.lang.foreign.MemorySegment uniformIndices, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetActiveUniformsiv))
            MH_glGetActiveUniformsiv.invokeExact(PFN_glGetActiveUniformsiv, program, uniformCount, uniformIndices, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveUniformsiv", e); }
    }

    public void GetActiveUniformName(@CType("GLuint") int program, @CType("GLuint") int uniformIndex, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment uniformName) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetActiveUniformName))
            MH_glGetActiveUniformName.invokeExact(PFN_glGetActiveUniformName, program, uniformIndex, bufSize, length, uniformName);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveUniformName", e); }
    }

    public @CType("GLuint") int GetUniformBlockIndex(@CType("GLuint") int program, @CType("const GLchar *") java.lang.foreign.MemorySegment uniformBlockName) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetUniformBlockIndex))
            return (int) MH_glGetUniformBlockIndex.invokeExact(PFN_glGetUniformBlockIndex, program, uniformBlockName);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformBlockIndex", e); }
    }

    public void GetActiveUniformBlockiv(@CType("GLuint") int program, @CType("GLuint") int uniformBlockIndex, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetActiveUniformBlockiv))
            MH_glGetActiveUniformBlockiv.invokeExact(PFN_glGetActiveUniformBlockiv, program, uniformBlockIndex, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveUniformBlockiv", e); }
    }

    public void GetActiveUniformBlockName(@CType("GLuint") int program, @CType("GLuint") int uniformBlockIndex, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment uniformBlockName) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetActiveUniformBlockName))
            MH_glGetActiveUniformBlockName.invokeExact(PFN_glGetActiveUniformBlockName, program, uniformBlockIndex, bufSize, length, uniformBlockName);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveUniformBlockName", e); }
    }

    public void UniformBlockBinding(@CType("GLuint") int program, @CType("GLuint") int uniformBlockIndex, @CType("GLuint") int uniformBlockBinding) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformBlockBinding))
            MH_glUniformBlockBinding.invokeExact(PFN_glUniformBlockBinding, program, uniformBlockIndex, uniformBlockBinding);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformBlockBinding", e); }
    }

    public void BindBufferRange(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindBufferRange))
            MH_glBindBufferRange.invokeExact(PFN_glBindBufferRange, target, index, buffer, offset, size);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindBufferRange", e); }
    }

    public void BindBufferBase(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int buffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindBufferBase))
            MH_glBindBufferBase.invokeExact(PFN_glBindBufferBase, target, index, buffer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindBufferBase", e); }
    }

    public void GetIntegeri_v(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLint *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetIntegeri_v))
            MH_glGetIntegeri_v.invokeExact(PFN_glGetIntegeri_v, target, index, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetIntegeri_v", e); }
    }

}
