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
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NV_vertex_buffer_unified_memory}
 */
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
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_vertex_buffer_unified_memory) return;
        ext.glBufferAddressRangeNV = load.invoke("glBufferAddressRangeNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG));
        ext.glVertexFormatNV = load.invoke("glVertexFormatNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glNormalFormatNV = load.invoke("glNormalFormatNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glColorFormatNV = load.invoke("glColorFormatNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glIndexFormatNV = load.invoke("glIndexFormatNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glTexCoordFormatNV = load.invoke("glTexCoordFormatNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glEdgeFlagFormatNV = load.invoke("glEdgeFlagFormatNV", ofVoid(JAVA_INT));
        ext.glSecondaryColorFormatNV = load.invoke("glSecondaryColorFormatNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glFogCoordFormatNV = load.invoke("glFogCoordFormatNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glVertexAttribFormatNV = load.invoke("glVertexAttribFormatNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT));
        ext.glVertexAttribIFormatNV = load.invoke("glVertexAttribIFormatNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetIntegerui64i_vNV = load.invoke("glGetIntegerui64i_vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glBufferAddressRangeNV(int pname, int index, long address, long length) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBufferAddressRangeNV).invokeExact(pname, index, address, length);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexFormatNV(int size, int type, int stride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexFormatNV).invokeExact(size, type, stride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormalFormatNV(int type, int stride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormalFormatNV).invokeExact(type, stride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColorFormatNV(int size, int type, int stride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColorFormatNV).invokeExact(size, type, stride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glIndexFormatNV(int type, int stride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glIndexFormatNV).invokeExact(type, stride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoordFormatNV(int size, int type, int stride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoordFormatNV).invokeExact(size, type, stride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEdgeFlagFormatNV(int stride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEdgeFlagFormatNV).invokeExact(stride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColorFormatNV(int size, int type, int stride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColorFormatNV).invokeExact(size, type, stride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFogCoordFormatNV(int type, int stride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFogCoordFormatNV).invokeExact(type, stride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribFormatNV(int index, int size, int type, boolean normalized, int stride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribFormatNV).invokeExact(index, size, type, normalized, stride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribIFormatNV(int index, int size, int type, int stride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribIFormatNV).invokeExact(index, size, type, stride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetIntegerui64i_vNV(int value, int index, @NativeType("GLuint64EXT *") MemorySegment result) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetIntegerui64i_vNV).invokeExact(value, index, result);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
