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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_bindable_uniform`
public final class GLEXTBindableUniform {
    public static final int GL_MAX_VERTEX_BINDABLE_UNIFORMS_EXT = 0x8DE2;
    public static final int GL_MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT = 0x8DE3;
    public static final int GL_MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT = 0x8DE4;
    public static final int GL_MAX_BINDABLE_UNIFORM_SIZE_EXT = 0x8DED;
    public static final int GL_UNIFORM_BUFFER_EXT = 0x8DEE;
    public static final int GL_UNIFORM_BUFFER_BINDING_EXT = 0x8DEF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glUniformBufferEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetUniformBufferSizeEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetUniformOffsetEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glUniformBufferEXT;
        public final MemorySegment PFN_glGetUniformBufferSizeEXT;
        public final MemorySegment PFN_glGetUniformOffsetEXT;
        private Handles(GLLoadFunc func) {
            PFN_glUniformBufferEXT = func.invoke("glUniformBufferEXT");
            PFN_glGetUniformBufferSizeEXT = func.invoke("glGetUniformBufferSizeEXT");
            PFN_glGetUniformOffsetEXT = func.invoke("glGetUniformOffsetEXT");
        }
    }

    public GLEXTBindableUniform(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glUniformBufferEXT`.
    /// ```
    /// void glUniformBufferEXT((unsigned int) GLuint program, (int) GLint location, (unsigned int) GLuint buffer);
    /// ```
    public void UniformBufferEXT(int program, int location, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformBufferEXT)) throw new GLSymbolNotFoundError("Symbol not found: glUniformBufferEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformBufferEXT", program, location, buffer); }
        Handles.MH_glUniformBufferEXT.invokeExact(handles.PFN_glUniformBufferEXT, program, location, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in UniformBufferEXT", e); }
    }

    /// Invokes `glGetUniformBufferSizeEXT`.
    /// ```
    /// (int) GLint glGetUniformBufferSizeEXT((unsigned int) GLuint program, (int) GLint location);
    /// ```
    public int GetUniformBufferSizeEXT(int program, int location) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformBufferSizeEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetUniformBufferSizeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUniformBufferSizeEXT", program, location); }
        return (int) Handles.MH_glGetUniformBufferSizeEXT.invokeExact(handles.PFN_glGetUniformBufferSizeEXT, program, location); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformBufferSizeEXT", e); }
    }

    /// Invokes `glGetUniformOffsetEXT`.
    /// ```
    /// ((signed long long) khronos_intptr_t) GLintptr glGetUniformOffsetEXT((unsigned int) GLuint program, (int) GLint location);
    /// ```
    public long GetUniformOffsetEXT(int program, int location) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformOffsetEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetUniformOffsetEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUniformOffsetEXT", program, location); }
        return (long) Handles.MH_glGetUniformOffsetEXT.invokeExact(handles.PFN_glGetUniformOffsetEXT, program, location); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformOffsetEXT", e); }
    }

}
