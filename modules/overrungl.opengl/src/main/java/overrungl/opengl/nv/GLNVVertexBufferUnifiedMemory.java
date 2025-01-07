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
    public static final MethodHandle MH_glBufferAddressRangeNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glBufferAddressRangeNV;
    public static final MethodHandle MH_glVertexFormatNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexFormatNV;
    public static final MethodHandle MH_glNormalFormatNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNormalFormatNV;
    public static final MethodHandle MH_glColorFormatNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glColorFormatNV;
    public static final MethodHandle MH_glIndexFormatNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIndexFormatNV;
    public static final MethodHandle MH_glTexCoordFormatNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTexCoordFormatNV;
    public static final MethodHandle MH_glEdgeFlagFormatNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glEdgeFlagFormatNV;
    public static final MethodHandle MH_glSecondaryColorFormatNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glSecondaryColorFormatNV;
    public static final MethodHandle MH_glFogCoordFormatNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFogCoordFormatNV;
    public static final MethodHandle MH_glVertexAttribFormatNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribFormatNV;
    public static final MethodHandle MH_glVertexAttribIFormatNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribIFormatNV;
    public static final MethodHandle MH_glGetIntegerui64i_vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetIntegerui64i_vNV;

    public GLNVVertexBufferUnifiedMemory(overrungl.opengl.GLLoadFunc func) {
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

    public void BufferAddressRangeNV(@CType("GLenum") int pname, @CType("GLuint") int index, @CType("GLuint64EXT") long address, @CType("GLsizeiptr") long length) {
        if (!Unmarshal.isNullPointer(PFN_glBufferAddressRangeNV)) { try {
            MH_glBufferAddressRangeNV.invokeExact(PFN_glBufferAddressRangeNV, pname, index, address, length);
        } catch (Throwable e) { throw new RuntimeException("error in glBufferAddressRangeNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBufferAddressRangeNV"); }
    }

    public void VertexFormatNV(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride) {
        if (!Unmarshal.isNullPointer(PFN_glVertexFormatNV)) { try {
            MH_glVertexFormatNV.invokeExact(PFN_glVertexFormatNV, size, type, stride);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexFormatNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexFormatNV"); }
    }

    public void NormalFormatNV(@CType("GLenum") int type, @CType("GLsizei") int stride) {
        if (!Unmarshal.isNullPointer(PFN_glNormalFormatNV)) { try {
            MH_glNormalFormatNV.invokeExact(PFN_glNormalFormatNV, type, stride);
        } catch (Throwable e) { throw new RuntimeException("error in glNormalFormatNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNormalFormatNV"); }
    }

    public void ColorFormatNV(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride) {
        if (!Unmarshal.isNullPointer(PFN_glColorFormatNV)) { try {
            MH_glColorFormatNV.invokeExact(PFN_glColorFormatNV, size, type, stride);
        } catch (Throwable e) { throw new RuntimeException("error in glColorFormatNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColorFormatNV"); }
    }

    public void IndexFormatNV(@CType("GLenum") int type, @CType("GLsizei") int stride) {
        if (!Unmarshal.isNullPointer(PFN_glIndexFormatNV)) { try {
            MH_glIndexFormatNV.invokeExact(PFN_glIndexFormatNV, type, stride);
        } catch (Throwable e) { throw new RuntimeException("error in glIndexFormatNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glIndexFormatNV"); }
    }

    public void TexCoordFormatNV(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoordFormatNV)) { try {
            MH_glTexCoordFormatNV.invokeExact(PFN_glTexCoordFormatNV, size, type, stride);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoordFormatNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoordFormatNV"); }
    }

    public void EdgeFlagFormatNV(@CType("GLsizei") int stride) {
        if (!Unmarshal.isNullPointer(PFN_glEdgeFlagFormatNV)) { try {
            MH_glEdgeFlagFormatNV.invokeExact(PFN_glEdgeFlagFormatNV, stride);
        } catch (Throwable e) { throw new RuntimeException("error in glEdgeFlagFormatNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glEdgeFlagFormatNV"); }
    }

    public void SecondaryColorFormatNV(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColorFormatNV)) { try {
            MH_glSecondaryColorFormatNV.invokeExact(PFN_glSecondaryColorFormatNV, size, type, stride);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColorFormatNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColorFormatNV"); }
    }

    public void FogCoordFormatNV(@CType("GLenum") int type, @CType("GLsizei") int stride) {
        if (!Unmarshal.isNullPointer(PFN_glFogCoordFormatNV)) { try {
            MH_glFogCoordFormatNV.invokeExact(PFN_glFogCoordFormatNV, type, stride);
        } catch (Throwable e) { throw new RuntimeException("error in glFogCoordFormatNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFogCoordFormatNV"); }
    }

    public void VertexAttribFormatNV(@CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLsizei") int stride) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribFormatNV)) { try {
            MH_glVertexAttribFormatNV.invokeExact(PFN_glVertexAttribFormatNV, index, size, type, normalized, stride);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribFormatNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribFormatNV"); }
    }

    public void VertexAttribIFormatNV(@CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribIFormatNV)) { try {
            MH_glVertexAttribIFormatNV.invokeExact(PFN_glVertexAttribIFormatNV, index, size, type, stride);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribIFormatNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribIFormatNV"); }
    }

    public void GetIntegerui64i_vNV(@CType("GLenum") int value, @CType("GLuint") int index, @CType("GLuint64EXT *") java.lang.foreign.MemorySegment result) {
        if (!Unmarshal.isNullPointer(PFN_glGetIntegerui64i_vNV)) { try {
            MH_glGetIntegerui64i_vNV.invokeExact(PFN_glGetIntegerui64i_vNV, value, index, result);
        } catch (Throwable e) { throw new RuntimeException("error in glGetIntegerui64i_vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetIntegerui64i_vNV"); }
    }

}
