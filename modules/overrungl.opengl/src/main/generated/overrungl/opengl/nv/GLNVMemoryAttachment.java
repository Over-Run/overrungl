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
/// `GL_NV_memory_attachment`
public final class GLNVMemoryAttachment {
    public static final int GL_ATTACHED_MEMORY_OBJECT_NV = 0x95A4;
    public static final int GL_ATTACHED_MEMORY_OFFSET_NV = 0x95A5;
    public static final int GL_MEMORY_ATTACHABLE_ALIGNMENT_NV = 0x95A6;
    public static final int GL_MEMORY_ATTACHABLE_SIZE_NV = 0x95A7;
    public static final int GL_MEMORY_ATTACHABLE_NV = 0x95A8;
    public static final int GL_DETACHED_MEMORY_INCARNATION_NV = 0x95A9;
    public static final int GL_DETACHED_TEXTURES_NV = 0x95AA;
    public static final int GL_DETACHED_BUFFERS_NV = 0x95AB;
    public static final int GL_MAX_DETACHED_TEXTURES_NV = 0x95AC;
    public static final int GL_MAX_DETACHED_BUFFERS_NV = 0x95AD;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetMemoryObjectDetachedResourcesuivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glResetMemoryObjectParameterNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexAttachMemoryNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glBufferAttachMemoryNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTextureAttachMemoryNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glNamedBufferAttachMemoryNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public final MemorySegment PFN_glGetMemoryObjectDetachedResourcesuivNV;
        public final MemorySegment PFN_glResetMemoryObjectParameterNV;
        public final MemorySegment PFN_glTexAttachMemoryNV;
        public final MemorySegment PFN_glBufferAttachMemoryNV;
        public final MemorySegment PFN_glTextureAttachMemoryNV;
        public final MemorySegment PFN_glNamedBufferAttachMemoryNV;
        private Handles(GLLoadFunc func) {
            PFN_glGetMemoryObjectDetachedResourcesuivNV = func.invoke("glGetMemoryObjectDetachedResourcesuivNV");
            PFN_glResetMemoryObjectParameterNV = func.invoke("glResetMemoryObjectParameterNV");
            PFN_glTexAttachMemoryNV = func.invoke("glTexAttachMemoryNV");
            PFN_glBufferAttachMemoryNV = func.invoke("glBufferAttachMemoryNV");PFN_glTextureAttachMemoryNV = func.invoke("glTextureAttachMemoryNV");
            PFN_glNamedBufferAttachMemoryNV = func.invoke("glNamedBufferAttachMemoryNV");
        }
    }

    public GLNVMemoryAttachment(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGetMemoryObjectDetachedResourcesuivNV`.
    /// ```
    /// void glGetMemoryObjectDetachedResourcesuivNV((unsigned int) GLuint memory, (unsigned int) GLenum pname, (int) GLint first, (int) GLsizei count, GLuint* params);
    /// ```
    public void GetMemoryObjectDetachedResourcesuivNV(int memory, int pname, int first, int count, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMemoryObjectDetachedResourcesuivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetMemoryObjectDetachedResourcesuivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetMemoryObjectDetachedResourcesuivNV", memory, pname, first, count, params); }
        Handles.MH_glGetMemoryObjectDetachedResourcesuivNV.invokeExact(handles.PFN_glGetMemoryObjectDetachedResourcesuivNV, memory, pname, first, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMemoryObjectDetachedResourcesuivNV", e); }
    }

    /// Invokes `glResetMemoryObjectParameterNV`.
    /// ```
    /// void glResetMemoryObjectParameterNV((unsigned int) GLuint memory, (unsigned int) GLenum pname);
    /// ```
    public void ResetMemoryObjectParameterNV(int memory, int pname) {
        if (MemoryUtil.isNullPointer(handles.PFN_glResetMemoryObjectParameterNV)) throw new GLSymbolNotFoundError("Symbol not found: glResetMemoryObjectParameterNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glResetMemoryObjectParameterNV", memory, pname); }
        Handles.MH_glResetMemoryObjectParameterNV.invokeExact(handles.PFN_glResetMemoryObjectParameterNV, memory, pname); }
        catch (Throwable e) { throw new RuntimeException("error in ResetMemoryObjectParameterNV", e); }
    }

    /// Invokes `glTexAttachMemoryNV`.
    /// ```
    /// void glTexAttachMemoryNV((unsigned int) GLenum target, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset);
    /// ```
    public void TexAttachMemoryNV(int target, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexAttachMemoryNV)) throw new GLSymbolNotFoundError("Symbol not found: glTexAttachMemoryNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexAttachMemoryNV", target, memory, offset); }
        Handles.MH_glTexAttachMemoryNV.invokeExact(handles.PFN_glTexAttachMemoryNV, target, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TexAttachMemoryNV", e); }
    }

    /// Invokes `glBufferAttachMemoryNV`.
    /// ```
    /// void glBufferAttachMemoryNV((unsigned int) GLenum target, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset);
    /// ```
    public void BufferAttachMemoryNV(int target, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBufferAttachMemoryNV)) throw new GLSymbolNotFoundError("Symbol not found: glBufferAttachMemoryNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBufferAttachMemoryNV", target, memory, offset); }
        Handles.MH_glBufferAttachMemoryNV.invokeExact(handles.PFN_glBufferAttachMemoryNV, target, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in BufferAttachMemoryNV", e); }
    }

    /// Invokes `glTextureAttachMemoryNV`.
    /// ```
    /// void glTextureAttachMemoryNV((unsigned int) GLuint texture, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset);
    /// ```
    public void TextureAttachMemoryNV(int texture, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureAttachMemoryNV)) throw new GLSymbolNotFoundError("Symbol not found: glTextureAttachMemoryNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureAttachMemoryNV", texture, memory, offset); }
        Handles.MH_glTextureAttachMemoryNV.invokeExact(handles.PFN_glTextureAttachMemoryNV, texture, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in TextureAttachMemoryNV", e); }
    }

    /// Invokes `glNamedBufferAttachMemoryNV`.
    /// ```
    /// void glNamedBufferAttachMemoryNV((unsigned int) GLuint buffer, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset);
    /// ```
    public void NamedBufferAttachMemoryNV(int buffer, int memory, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferAttachMemoryNV)) throw new GLSymbolNotFoundError("Symbol not found: glNamedBufferAttachMemoryNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedBufferAttachMemoryNV", buffer, memory, offset); }
        Handles.MH_glNamedBufferAttachMemoryNV.invokeExact(handles.PFN_glNamedBufferAttachMemoryNV, buffer, memory, offset); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferAttachMemoryNV", e); }
    }

}
