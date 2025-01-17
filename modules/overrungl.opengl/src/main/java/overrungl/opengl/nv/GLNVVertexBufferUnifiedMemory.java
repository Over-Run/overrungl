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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glBufferAddressRangeNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexFormatNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNormalFormatNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glColorFormatNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glIndexFormatNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTexCoordFormatNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glEdgeFlagFormatNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glSecondaryColorFormatNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFogCoordFormatNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribFormatNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribIFormatNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetIntegerui64i_vNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glBufferAddressRangeNV,
            FD_glVertexFormatNV,
            FD_glNormalFormatNV,
            FD_glColorFormatNV,
            FD_glIndexFormatNV,
            FD_glTexCoordFormatNV,
            FD_glEdgeFlagFormatNV,
            FD_glSecondaryColorFormatNV,
            FD_glFogCoordFormatNV,
            FD_glVertexAttribFormatNV,
            FD_glVertexAttribIFormatNV,
            FD_glGetIntegerui64i_vNV
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glBufferAddressRangeNV = RuntimeHelper.downcall(Descriptors.FD_glBufferAddressRangeNV);
        public static final MethodHandle MH_glVertexFormatNV = RuntimeHelper.downcall(Descriptors.FD_glVertexFormatNV);
        public static final MethodHandle MH_glNormalFormatNV = RuntimeHelper.downcall(Descriptors.FD_glNormalFormatNV);
        public static final MethodHandle MH_glColorFormatNV = RuntimeHelper.downcall(Descriptors.FD_glColorFormatNV);
        public static final MethodHandle MH_glIndexFormatNV = RuntimeHelper.downcall(Descriptors.FD_glIndexFormatNV);
        public static final MethodHandle MH_glTexCoordFormatNV = RuntimeHelper.downcall(Descriptors.FD_glTexCoordFormatNV);
        public static final MethodHandle MH_glEdgeFlagFormatNV = RuntimeHelper.downcall(Descriptors.FD_glEdgeFlagFormatNV);
        public static final MethodHandle MH_glSecondaryColorFormatNV = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColorFormatNV);
        public static final MethodHandle MH_glFogCoordFormatNV = RuntimeHelper.downcall(Descriptors.FD_glFogCoordFormatNV);
        public static final MethodHandle MH_glVertexAttribFormatNV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribFormatNV);
        public static final MethodHandle MH_glVertexAttribIFormatNV = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribIFormatNV);
        public static final MethodHandle MH_glGetIntegerui64i_vNV = RuntimeHelper.downcall(Descriptors.FD_glGetIntegerui64i_vNV);
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
        private Handles(overrungl.opengl.GLLoadFunc func) {
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

    public GLNVVertexBufferUnifiedMemory(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void BufferAddressRangeNV(@CType("GLenum") int pname, @CType("GLuint") int index, @CType("GLuint64EXT") long address, @CType("GLsizeiptr") long length) {
        if (Unmarshal.isNullPointer(handles.PFN_glBufferAddressRangeNV)) throw new SymbolNotFoundError("Symbol not found: glBufferAddressRangeNV");
        try { Handles.MH_glBufferAddressRangeNV.invokeExact(handles.PFN_glBufferAddressRangeNV, pname, index, address, length); }
        catch (Throwable e) { throw new RuntimeException("error in glBufferAddressRangeNV", e); }
    }

    public void VertexFormatNV(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexFormatNV)) throw new SymbolNotFoundError("Symbol not found: glVertexFormatNV");
        try { Handles.MH_glVertexFormatNV.invokeExact(handles.PFN_glVertexFormatNV, size, type, stride); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexFormatNV", e); }
    }

    public void NormalFormatNV(@CType("GLenum") int type, @CType("GLsizei") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormalFormatNV)) throw new SymbolNotFoundError("Symbol not found: glNormalFormatNV");
        try { Handles.MH_glNormalFormatNV.invokeExact(handles.PFN_glNormalFormatNV, type, stride); }
        catch (Throwable e) { throw new RuntimeException("error in glNormalFormatNV", e); }
    }

    public void ColorFormatNV(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_glColorFormatNV)) throw new SymbolNotFoundError("Symbol not found: glColorFormatNV");
        try { Handles.MH_glColorFormatNV.invokeExact(handles.PFN_glColorFormatNV, size, type, stride); }
        catch (Throwable e) { throw new RuntimeException("error in glColorFormatNV", e); }
    }

    public void IndexFormatNV(@CType("GLenum") int type, @CType("GLsizei") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_glIndexFormatNV)) throw new SymbolNotFoundError("Symbol not found: glIndexFormatNV");
        try { Handles.MH_glIndexFormatNV.invokeExact(handles.PFN_glIndexFormatNV, type, stride); }
        catch (Throwable e) { throw new RuntimeException("error in glIndexFormatNV", e); }
    }

    public void TexCoordFormatNV(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoordFormatNV)) throw new SymbolNotFoundError("Symbol not found: glTexCoordFormatNV");
        try { Handles.MH_glTexCoordFormatNV.invokeExact(handles.PFN_glTexCoordFormatNV, size, type, stride); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoordFormatNV", e); }
    }

    public void EdgeFlagFormatNV(@CType("GLsizei") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_glEdgeFlagFormatNV)) throw new SymbolNotFoundError("Symbol not found: glEdgeFlagFormatNV");
        try { Handles.MH_glEdgeFlagFormatNV.invokeExact(handles.PFN_glEdgeFlagFormatNV, stride); }
        catch (Throwable e) { throw new RuntimeException("error in glEdgeFlagFormatNV", e); }
    }

    public void SecondaryColorFormatNV(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColorFormatNV)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColorFormatNV");
        try { Handles.MH_glSecondaryColorFormatNV.invokeExact(handles.PFN_glSecondaryColorFormatNV, size, type, stride); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColorFormatNV", e); }
    }

    public void FogCoordFormatNV(@CType("GLenum") int type, @CType("GLsizei") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_glFogCoordFormatNV)) throw new SymbolNotFoundError("Symbol not found: glFogCoordFormatNV");
        try { Handles.MH_glFogCoordFormatNV.invokeExact(handles.PFN_glFogCoordFormatNV, type, stride); }
        catch (Throwable e) { throw new RuntimeException("error in glFogCoordFormatNV", e); }
    }

    public void VertexAttribFormatNV(@CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLsizei") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribFormatNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribFormatNV");
        try { Handles.MH_glVertexAttribFormatNV.invokeExact(handles.PFN_glVertexAttribFormatNV, index, size, type, normalized, stride); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribFormatNV", e); }
    }

    public void VertexAttribIFormatNV(@CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribIFormatNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribIFormatNV");
        try { Handles.MH_glVertexAttribIFormatNV.invokeExact(handles.PFN_glVertexAttribIFormatNV, index, size, type, stride); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribIFormatNV", e); }
    }

    public void GetIntegerui64i_vNV(@CType("GLenum") int value, @CType("GLuint") int index, @CType("GLuint64EXT *") java.lang.foreign.MemorySegment result) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetIntegerui64i_vNV)) throw new SymbolNotFoundError("Symbol not found: glGetIntegerui64i_vNV");
        try { Handles.MH_glGetIntegerui64i_vNV.invokeExact(handles.PFN_glGetIntegerui64i_vNV, value, index, result); }
        catch (Throwable e) { throw new RuntimeException("error in glGetIntegerui64i_vNV", e); }
    }

}
