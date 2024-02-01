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
package overrungl.opengl.ext.ibm;

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_IBM_vertex_array_lists}
 */
public interface GLIBMVertexArrayLists {
    int GL_VERTEX_ARRAY_LIST_IBM = 103070;
    int GL_NORMAL_ARRAY_LIST_IBM = 103071;
    int GL_COLOR_ARRAY_LIST_IBM = 103072;
    int GL_INDEX_ARRAY_LIST_IBM = 103073;
    int GL_TEXTURE_COORD_ARRAY_LIST_IBM = 103074;
    int GL_EDGE_FLAG_ARRAY_LIST_IBM = 103075;
    int GL_FOG_COORDINATE_ARRAY_LIST_IBM = 103076;
    int GL_SECONDARY_COLOR_ARRAY_LIST_IBM = 103077;
    int GL_VERTEX_ARRAY_LIST_STRIDE_IBM = 103080;
    int GL_NORMAL_ARRAY_LIST_STRIDE_IBM = 103081;
    int GL_COLOR_ARRAY_LIST_STRIDE_IBM = 103082;
    int GL_INDEX_ARRAY_LIST_STRIDE_IBM = 103083;
    int GL_TEXTURE_COORD_ARRAY_LIST_STRIDE_IBM = 103084;
    int GL_EDGE_FLAG_ARRAY_LIST_STRIDE_IBM = 103085;
    int GL_FOG_COORDINATE_ARRAY_LIST_STRIDE_IBM = 103086;
    int GL_SECONDARY_COLOR_ARRAY_LIST_STRIDE_IBM = 103087;

    void glColorPointerListIBM(int size, int type, int stride, @NativeType("const void **") MemorySegment pointer, int ptrstride);
    void glSecondaryColorPointerListIBM(int size, int type, int stride, @NativeType("const void **") MemorySegment pointer, int ptrstride);
    void glEdgeFlagPointerListIBM(int stride, @NativeType("const GLboolean **") MemorySegment pointer, int ptrstride);
    void glFogCoordPointerListIBM(int type, int stride, @NativeType("const void **") MemorySegment pointer, int ptrstride);
    void glIndexPointerListIBM(int type, int stride, @NativeType("const void **") MemorySegment pointer, int ptrstride);
    void glNormalPointerListIBM(int type, int stride, @NativeType("const void **") MemorySegment pointer, int ptrstride);
    void glTexCoordPointerListIBM(int size, int type, int stride, @NativeType("const void **") MemorySegment pointer, int ptrstride);
    void glVertexPointerListIBM(int size, int type, int stride, @NativeType("const void **") MemorySegment pointer, int ptrstride);
}
