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
/// `GL_NV_vertex_buffer_unified_memory`
public final class GLNVVertexBufferUnifiedMemory {
    public static final int GL_VERTEX_ATTRIB_ARRAY_UNIFIED_NV = 0x8F1E;
    public static final int GL_ELEMENT_ARRAY_UNIFIED_NV = 0x8F1F;
    public static final int GL_VERTEX_ATTRIB_ARRAY_ADDRESS_NV = 0x8F20;
    public static final int GL_VERTEX_ARRAY_ADDRESS_NV = 0x8F21;
    public static final int GL_NORMAL_ARRAY_ADDRESS_NV = 0x8F22;
    public static final int GL_COLOR_ARRAY_ADDRESS_NV = 0x8F23;
    public static final int GL_INDEX_ARRAY_ADDRESS_NV = 0x8F24;
    public static final int GL_TEXTURE_COORD_ARRAY_ADDRESS_NV = 0x8F25;
    public static final int GL_EDGE_FLAG_ARRAY_ADDRESS_NV = 0x8F26;
    public static final int GL_SECONDARY_COLOR_ARRAY_ADDRESS_NV = 0x8F27;
    public static final int GL_FOG_COORD_ARRAY_ADDRESS_NV = 0x8F28;
    public static final int GL_ELEMENT_ARRAY_ADDRESS_NV = 0x8F29;
    public static final int GL_VERTEX_ATTRIB_ARRAY_LENGTH_NV = 0x8F2A;
    public static final int GL_VERTEX_ARRAY_LENGTH_NV = 0x8F2B;
    public static final int GL_NORMAL_ARRAY_LENGTH_NV = 0x8F2C;
    public static final int GL_COLOR_ARRAY_LENGTH_NV = 0x8F2D;
    public static final int GL_INDEX_ARRAY_LENGTH_NV = 0x8F2E;
    public static final int GL_TEXTURE_COORD_ARRAY_LENGTH_NV = 0x8F2F;
    public static final int GL_EDGE_FLAG_ARRAY_LENGTH_NV = 0x8F30;
    public static final int GL_SECONDARY_COLOR_ARRAY_LENGTH_NV = 0x8F31;
    public static final int GL_FOG_COORD_ARRAY_LENGTH_NV = 0x8F32;
    public static final int GL_ELEMENT_ARRAY_LENGTH_NV = 0x8F33;
    public static final int GL_DRAW_INDIRECT_UNIFIED_NV = 0x8F40;
    public static final int GL_DRAW_INDIRECT_ADDRESS_NV = 0x8F41;
    public static final int GL_DRAW_INDIRECT_LENGTH_NV = 0x8F42;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBufferAddressRangeNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexFormatNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNormalFormatNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glColorFormatNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIndexFormatNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexCoordFormatNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEdgeFlagFormatNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glSecondaryColorFormatNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFogCoordFormatNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribFormatNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribIFormatNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetIntegerui64i_vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glBufferAddressRangeNV;
        public final MemorySegment PFN_glVertexFormatNV;
        public final MemorySegment PFN_glNormalFormatNV;
        public final MemorySegment PFN_glColorFormatNV;
        public final MemorySegment PFN_glIndexFormatNV;
        public final MemorySegment PFN_glTexCoordFormatNV;
        public final MemorySegment PFN_glEdgeFlagFormatNV;
        public final MemorySegment PFN_glSecondaryColorFormatNV;
        public final MemorySegment PFN_glFogCoordFormatNV;
        public final MemorySegment PFN_glVertexAttribFormatNV;
        public final MemorySegment PFN_glVertexAttribIFormatNV;
        public final MemorySegment PFN_glGetIntegerui64i_vNV;
        private Handles(GLLoadFunc func) {
            PFN_glBufferAddressRangeNV = func.invoke("glBufferAddressRangeNV");
            PFN_glVertexFormatNV = func.invoke("glVertexFormatNV");
            PFN_glNormalFormatNV = func.invoke("glNormalFormatNV");
            PFN_glColorFormatNV = func.invoke("glColorFormatNV");
            PFN_glIndexFormatNV = func.invoke("glIndexFormatNV");
            PFN_glTexCoordFormatNV = func.invoke("glTexCoordFormatNV");
            PFN_glEdgeFlagFormatNV = func.invoke("glEdgeFlagFormatNV");
            PFN_glSecondaryColorFormatNV = func.invoke("glSecondaryColorFormatNV");
            PFN_glFogCoordFormatNV = func.invoke("glFogCoordFormatNV");
            PFN_glVertexAttribFormatNV = func.invoke("glVertexAttribFormatNV");
            PFN_glVertexAttribIFormatNV = func.invoke("glVertexAttribIFormatNV");
            PFN_glGetIntegerui64i_vNV = func.invoke("glGetIntegerui64i_vNV");
        }
    }

    public GLNVVertexBufferUnifiedMemory(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBufferAddressRangeNV`.
    /// ```
    /// void glBufferAddressRangeNV((unsigned int) GLenum pname, (unsigned int) GLuint index, ((uint64_t) khronos_uint64_t) GLuint64EXT address, ((signed long long) khronos_ssize_t) GLsizeiptr length);
    /// ```
    public void BufferAddressRangeNV(int pname, int index, long address, long length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBufferAddressRangeNV)) throw new GLSymbolNotFoundError("Symbol not found: glBufferAddressRangeNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBufferAddressRangeNV", pname, index, address, length); }
        Handles.MH_glBufferAddressRangeNV.invokeExact(handles.PFN_glBufferAddressRangeNV, pname, index, address, length); }
        catch (Throwable e) { throw new RuntimeException("error in BufferAddressRangeNV", e); }
    }

    /// Invokes `glVertexFormatNV`.
    /// ```
    /// void glVertexFormatNV((int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride);
    /// ```
    public void VertexFormatNV(int size, int type, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexFormatNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexFormatNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexFormatNV", size, type, stride); }
        Handles.MH_glVertexFormatNV.invokeExact(handles.PFN_glVertexFormatNV, size, type, stride); }
        catch (Throwable e) { throw new RuntimeException("error in VertexFormatNV", e); }
    }

    /// Invokes `glNormalFormatNV`.
    /// ```
    /// void glNormalFormatNV((unsigned int) GLenum type, (int) GLsizei stride);
    /// ```
    public void NormalFormatNV(int type, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalFormatNV)) throw new GLSymbolNotFoundError("Symbol not found: glNormalFormatNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormalFormatNV", type, stride); }
        Handles.MH_glNormalFormatNV.invokeExact(handles.PFN_glNormalFormatNV, type, stride); }
        catch (Throwable e) { throw new RuntimeException("error in NormalFormatNV", e); }
    }

    /// Invokes `glColorFormatNV`.
    /// ```
    /// void glColorFormatNV((int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride);
    /// ```
    public void ColorFormatNV(int size, int type, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorFormatNV)) throw new GLSymbolNotFoundError("Symbol not found: glColorFormatNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorFormatNV", size, type, stride); }
        Handles.MH_glColorFormatNV.invokeExact(handles.PFN_glColorFormatNV, size, type, stride); }
        catch (Throwable e) { throw new RuntimeException("error in ColorFormatNV", e); }
    }

    /// Invokes `glIndexFormatNV`.
    /// ```
    /// void glIndexFormatNV((unsigned int) GLenum type, (int) GLsizei stride);
    /// ```
    public void IndexFormatNV(int type, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIndexFormatNV)) throw new GLSymbolNotFoundError("Symbol not found: glIndexFormatNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIndexFormatNV", type, stride); }
        Handles.MH_glIndexFormatNV.invokeExact(handles.PFN_glIndexFormatNV, type, stride); }
        catch (Throwable e) { throw new RuntimeException("error in IndexFormatNV", e); }
    }

    /// Invokes `glTexCoordFormatNV`.
    /// ```
    /// void glTexCoordFormatNV((int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride);
    /// ```
    public void TexCoordFormatNV(int size, int type, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoordFormatNV)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoordFormatNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoordFormatNV", size, type, stride); }
        Handles.MH_glTexCoordFormatNV.invokeExact(handles.PFN_glTexCoordFormatNV, size, type, stride); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoordFormatNV", e); }
    }

    /// Invokes `glEdgeFlagFormatNV`.
    /// ```
    /// void glEdgeFlagFormatNV((int) GLsizei stride);
    /// ```
    public void EdgeFlagFormatNV(int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEdgeFlagFormatNV)) throw new GLSymbolNotFoundError("Symbol not found: glEdgeFlagFormatNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEdgeFlagFormatNV", stride); }
        Handles.MH_glEdgeFlagFormatNV.invokeExact(handles.PFN_glEdgeFlagFormatNV, stride); }
        catch (Throwable e) { throw new RuntimeException("error in EdgeFlagFormatNV", e); }
    }

    /// Invokes `glSecondaryColorFormatNV`.
    /// ```
    /// void glSecondaryColorFormatNV((int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride);
    /// ```
    public void SecondaryColorFormatNV(int size, int type, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColorFormatNV)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColorFormatNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColorFormatNV", size, type, stride); }
        Handles.MH_glSecondaryColorFormatNV.invokeExact(handles.PFN_glSecondaryColorFormatNV, size, type, stride); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColorFormatNV", e); }
    }

    /// Invokes `glFogCoordFormatNV`.
    /// ```
    /// void glFogCoordFormatNV((unsigned int) GLenum type, (int) GLsizei stride);
    /// ```
    public void FogCoordFormatNV(int type, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFogCoordFormatNV)) throw new GLSymbolNotFoundError("Symbol not found: glFogCoordFormatNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFogCoordFormatNV", type, stride); }
        Handles.MH_glFogCoordFormatNV.invokeExact(handles.PFN_glFogCoordFormatNV, type, stride); }
        catch (Throwable e) { throw new RuntimeException("error in FogCoordFormatNV", e); }
    }

    /// Invokes `glVertexAttribFormatNV`.
    /// ```
    /// void glVertexAttribFormatNV((unsigned int) GLuint index, (int) GLint size, (unsigned int) GLenum type, GLboolean normalized, (int) GLsizei stride);
    /// ```
    public void VertexAttribFormatNV(int index, int size, int type, boolean normalized, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribFormatNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribFormatNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribFormatNV", index, size, type, normalized, stride); }
        Handles.MH_glVertexAttribFormatNV.invokeExact(handles.PFN_glVertexAttribFormatNV, index, size, type, ((normalized) ? (byte)1 : (byte)0), stride); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribFormatNV", e); }
    }

    /// Invokes `glVertexAttribIFormatNV`.
    /// ```
    /// void glVertexAttribIFormatNV((unsigned int) GLuint index, (int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride);
    /// ```
    public void VertexAttribIFormatNV(int index, int size, int type, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribIFormatNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribIFormatNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribIFormatNV", index, size, type, stride); }
        Handles.MH_glVertexAttribIFormatNV.invokeExact(handles.PFN_glVertexAttribIFormatNV, index, size, type, stride); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribIFormatNV", e); }
    }

    /// Invokes `glGetIntegerui64i_vNV`.
    /// ```
    /// void glGetIntegerui64i_vNV((unsigned int) GLenum value, (unsigned int) GLuint index, GLuint64EXT* result);
    /// ```
    public void GetIntegerui64i_vNV(int value, int index, @NonNull MemorySegment result) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetIntegerui64i_vNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetIntegerui64i_vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetIntegerui64i_vNV", value, index, result); }
        Handles.MH_glGetIntegerui64i_vNV.invokeExact(handles.PFN_glGetIntegerui64i_vNV, value, index, result); }
        catch (Throwable e) { throw new RuntimeException("error in GetIntegerui64i_vNV", e); }
    }

}
