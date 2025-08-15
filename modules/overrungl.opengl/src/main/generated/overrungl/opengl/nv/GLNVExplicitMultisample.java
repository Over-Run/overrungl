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
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_explicit_multisample`
public final class GLNVExplicitMultisample {
    public static final int GL_SAMPLE_POSITION_NV = 0x8E50;
    public static final int GL_SAMPLE_MASK_NV = 0x8E51;
    public static final int GL_SAMPLE_MASK_VALUE_NV = 0x8E52;
    public static final int GL_TEXTURE_BINDING_RENDERBUFFER_NV = 0x8E53;
    public static final int GL_TEXTURE_RENDERBUFFER_DATA_STORE_BINDING_NV = 0x8E54;
    public static final int GL_TEXTURE_RENDERBUFFER_NV = 0x8E55;
    public static final int GL_SAMPLER_RENDERBUFFER_NV = 0x8E56;
    public static final int GL_INT_SAMPLER_RENDERBUFFER_NV = 0x8E57;
    public static final int GL_UNSIGNED_INT_SAMPLER_RENDERBUFFER_NV = 0x8E58;
    public static final int GL_MAX_SAMPLE_MASK_WORDS_NV = 0x8E59;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetMultisamplefvNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSampleMaskIndexedNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexRenderbufferNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glGetMultisamplefvNV;
        public final MemorySegment PFN_glSampleMaskIndexedNV;
        public final MemorySegment PFN_glTexRenderbufferNV;
        private Handles(GLLoadFunc func) {
            PFN_glGetMultisamplefvNV = func.invoke("glGetMultisamplefvNV", "glGetMultisamplefv");
            PFN_glSampleMaskIndexedNV = func.invoke("glSampleMaskIndexedNV");
            PFN_glTexRenderbufferNV = func.invoke("glTexRenderbufferNV");
        }
    }

    public GLNVExplicitMultisample(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGetMultisamplefvNV`.
    /// ```
    /// void glGetMultisamplefvNV((unsigned int) GLenum pname, (unsigned int) GLuint index, GLfloat* val);
    /// ```
    public void GetMultisamplefvNV(int pname, int index, @NonNull MemorySegment val) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMultisamplefvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetMultisamplefvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetMultisamplefvNV", pname, index, val); }
        Handles.MH_glGetMultisamplefvNV.invokeExact(handles.PFN_glGetMultisamplefvNV, pname, index, val); }
        catch (Throwable e) { throw new RuntimeException("error in GetMultisamplefvNV", e); }
    }

    /// Invokes `glSampleMaskIndexedNV`.
    /// ```
    /// void glSampleMaskIndexedNV((unsigned int) GLuint index, (unsigned int) GLbitfield mask);
    /// ```
    public void SampleMaskIndexedNV(int index, int mask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSampleMaskIndexedNV)) throw new GLSymbolNotFoundError("Symbol not found: glSampleMaskIndexedNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSampleMaskIndexedNV", index, mask); }
        Handles.MH_glSampleMaskIndexedNV.invokeExact(handles.PFN_glSampleMaskIndexedNV, index, mask); }
        catch (Throwable e) { throw new RuntimeException("error in SampleMaskIndexedNV", e); }
    }

    /// Invokes `glTexRenderbufferNV`.
    /// ```
    /// void glTexRenderbufferNV((unsigned int) GLenum target, (unsigned int) GLuint renderbuffer);
    /// ```
    public void TexRenderbufferNV(int target, int renderbuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexRenderbufferNV)) throw new GLSymbolNotFoundError("Symbol not found: glTexRenderbufferNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexRenderbufferNV", target, renderbuffer); }
        Handles.MH_glTexRenderbufferNV.invokeExact(handles.PFN_glTexRenderbufferNV, target, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in TexRenderbufferNV", e); }
    }

}
