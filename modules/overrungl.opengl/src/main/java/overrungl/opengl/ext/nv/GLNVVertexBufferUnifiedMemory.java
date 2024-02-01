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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_vertex_buffer_unified_memory}
 */
public interface GLNVVertexBufferUnifiedMemory {
    int GL_VERTEX_ATTRIB_ARRAY_UNIFIED_NV = 0x8F1E;
    int GL_ELEMENT_ARRAY_UNIFIED_NV = 0x8F1F;
    int GL_VERTEX_ATTRIB_ARRAY_ADDRESS_NV = 0x8F20;
    int GL_VERTEX_ARRAY_ADDRESS_NV = 0x8F21;
    int GL_NORMAL_ARRAY_ADDRESS_NV = 0x8F22;
    int GL_COLOR_ARRAY_ADDRESS_NV = 0x8F23;
    int GL_INDEX_ARRAY_ADDRESS_NV = 0x8F24;
    int GL_TEXTURE_COORD_ARRAY_ADDRESS_NV = 0x8F25;
    int GL_EDGE_FLAG_ARRAY_ADDRESS_NV = 0x8F26;
    int GL_SECONDARY_COLOR_ARRAY_ADDRESS_NV = 0x8F27;
    int GL_FOG_COORD_ARRAY_ADDRESS_NV = 0x8F28;
    int GL_ELEMENT_ARRAY_ADDRESS_NV = 0x8F29;
    int GL_VERTEX_ATTRIB_ARRAY_LENGTH_NV = 0x8F2A;
    int GL_VERTEX_ARRAY_LENGTH_NV = 0x8F2B;
    int GL_NORMAL_ARRAY_LENGTH_NV = 0x8F2C;
    int GL_COLOR_ARRAY_LENGTH_NV = 0x8F2D;
    int GL_INDEX_ARRAY_LENGTH_NV = 0x8F2E;
    int GL_TEXTURE_COORD_ARRAY_LENGTH_NV = 0x8F2F;
    int GL_EDGE_FLAG_ARRAY_LENGTH_NV = 0x8F30;
    int GL_SECONDARY_COLOR_ARRAY_LENGTH_NV = 0x8F31;
    int GL_FOG_COORD_ARRAY_LENGTH_NV = 0x8F32;
    int GL_ELEMENT_ARRAY_LENGTH_NV = 0x8F33;
    int GL_DRAW_INDIRECT_UNIFIED_NV = 0x8F40;
    int GL_DRAW_INDIRECT_ADDRESS_NV = 0x8F41;
    int GL_DRAW_INDIRECT_LENGTH_NV = 0x8F42;

    void glBufferAddressRangeNV(int pname, int index, long address, long length);
    void glVertexFormatNV(int size, int type, int stride);
    void glNormalFormatNV(int type, int stride);
    void glColorFormatNV(int size, int type, int stride);
    void glIndexFormatNV(int type, int stride);
    void glTexCoordFormatNV(int size, int type, int stride);
    void glEdgeFlagFormatNV(int stride);
    void glSecondaryColorFormatNV(int size, int type, int stride);
    void glFogCoordFormatNV(int type, int stride);
    void glVertexAttribFormatNV(int index, int size, int type, boolean normalized, int stride);
    void glVertexAttribIFormatNV(int index, int size, int type, int stride);
    void glGetIntegerui64i_vNV(int value, int index, @NativeType("GLuint64EXT *") MemorySegment result);
}
