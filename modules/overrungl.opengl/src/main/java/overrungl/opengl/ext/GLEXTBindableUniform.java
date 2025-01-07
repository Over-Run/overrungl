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

public final class GLEXTBindableUniform {
    public static final int GL_MAX_VERTEX_BINDABLE_UNIFORMS_EXT = 0x8DE2;
    public static final int GL_MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT = 0x8DE3;
    public static final int GL_MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT = 0x8DE4;
    public static final int GL_MAX_BINDABLE_UNIFORM_SIZE_EXT = 0x8DED;
    public static final int GL_UNIFORM_BUFFER_EXT = 0x8DEE;
    public static final int GL_UNIFORM_BUFFER_BINDING_EXT = 0x8DEF;
    public static final MethodHandle MH_glUniformBufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUniformBufferEXT;
    public static final MethodHandle MH_glGetUniformBufferSizeEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGetUniformBufferSizeEXT;
    public static final MethodHandle MH_glGetUniformOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGetUniformOffsetEXT;

    public GLEXTBindableUniform(overrungl.opengl.GLLoadFunc func) {
        PFN_glUniformBufferEXT = func.invoke("glUniformBufferEXT");
        PFN_glGetUniformBufferSizeEXT = func.invoke("glGetUniformBufferSizeEXT");
        PFN_glGetUniformOffsetEXT = func.invoke("glGetUniformOffsetEXT");
    }

    public void UniformBufferEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int buffer) {
        if (!Unmarshal.isNullPointer(PFN_glUniformBufferEXT)) { try {
            MH_glUniformBufferEXT.invokeExact(PFN_glUniformBufferEXT, program, location, buffer);
        } catch (Throwable e) { throw new RuntimeException("error in glUniformBufferEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniformBufferEXT"); }
    }

    public @CType("GLint") int GetUniformBufferSizeEXT(@CType("GLuint") int program, @CType("GLint") int location) {
        if (!Unmarshal.isNullPointer(PFN_glGetUniformBufferSizeEXT)) { try {
            return (int) MH_glGetUniformBufferSizeEXT.invokeExact(PFN_glGetUniformBufferSizeEXT, program, location);
        } catch (Throwable e) { throw new RuntimeException("error in glGetUniformBufferSizeEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetUniformBufferSizeEXT"); }
    }

    public @CType("GLintptr") long GetUniformOffsetEXT(@CType("GLuint") int program, @CType("GLint") int location) {
        if (!Unmarshal.isNullPointer(PFN_glGetUniformOffsetEXT)) { try {
            return (long) MH_glGetUniformOffsetEXT.invokeExact(PFN_glGetUniformOffsetEXT, program, location);
        } catch (Throwable e) { throw new RuntimeException("error in glGetUniformOffsetEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetUniformOffsetEXT"); }
    }

}
