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
package overrungl.opengl.ext.ext;

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_vertex_array}
 */
public interface GLEXTVertexArray {
    int GL_VERTEX_ARRAY_EXT = 0x8074;
    int GL_NORMAL_ARRAY_EXT = 0x8075;
    int GL_COLOR_ARRAY_EXT = 0x8076;
    int GL_INDEX_ARRAY_EXT = 0x8077;
    int GL_TEXTURE_COORD_ARRAY_EXT = 0x8078;
    int GL_EDGE_FLAG_ARRAY_EXT = 0x8079;
    int GL_VERTEX_ARRAY_SIZE_EXT = 0x807A;
    int GL_VERTEX_ARRAY_TYPE_EXT = 0x807B;
    int GL_VERTEX_ARRAY_STRIDE_EXT = 0x807C;
    int GL_VERTEX_ARRAY_COUNT_EXT = 0x807D;
    int GL_NORMAL_ARRAY_TYPE_EXT = 0x807E;
    int GL_NORMAL_ARRAY_STRIDE_EXT = 0x807F;
    int GL_NORMAL_ARRAY_COUNT_EXT = 0x8080;
    int GL_COLOR_ARRAY_SIZE_EXT = 0x8081;
    int GL_COLOR_ARRAY_TYPE_EXT = 0x8082;
    int GL_COLOR_ARRAY_STRIDE_EXT = 0x8083;
    int GL_COLOR_ARRAY_COUNT_EXT = 0x8084;
    int GL_INDEX_ARRAY_TYPE_EXT = 0x8085;
    int GL_INDEX_ARRAY_STRIDE_EXT = 0x8086;
    int GL_INDEX_ARRAY_COUNT_EXT = 0x8087;
    int GL_TEXTURE_COORD_ARRAY_SIZE_EXT = 0x8088;
    int GL_TEXTURE_COORD_ARRAY_TYPE_EXT = 0x8089;
    int GL_TEXTURE_COORD_ARRAY_STRIDE_EXT = 0x808A;
    int GL_TEXTURE_COORD_ARRAY_COUNT_EXT = 0x808B;
    int GL_EDGE_FLAG_ARRAY_STRIDE_EXT = 0x808C;
    int GL_EDGE_FLAG_ARRAY_COUNT_EXT = 0x808D;
    int GL_VERTEX_ARRAY_POINTER_EXT = 0x808E;
    int GL_NORMAL_ARRAY_POINTER_EXT = 0x808F;
    int GL_COLOR_ARRAY_POINTER_EXT = 0x8090;
    int GL_INDEX_ARRAY_POINTER_EXT = 0x8091;
    int GL_TEXTURE_COORD_ARRAY_POINTER_EXT = 0x8092;
    int GL_EDGE_FLAG_ARRAY_POINTER_EXT = 0x8093;

    void glArrayElementEXT(int i);
    void glColorPointerEXT(int size, int type, int stride, int count, @NativeType("const void *") MemorySegment pointer);
    void glDrawArraysEXT(int mode, int first, int count);
    void glEdgeFlagPointerEXT(int stride, int count, @NativeType("const GLboolean *") MemorySegment pointer);
    void glGetPointervEXT(int pname, @NativeType("void **") MemorySegment params);
    void glIndexPointerEXT(int type, int stride, int count, @NativeType("const void *") MemorySegment pointer);
    void glNormalPointerEXT(int type, int stride, int count, @NativeType("const void *") MemorySegment pointer);
    void glTexCoordPointerEXT(int size, int type, int stride, int count, @NativeType("const void *") MemorySegment pointer);
    void glVertexPointerEXT(int size, int type, int stride, int count, @NativeType("const void *") MemorySegment pointer);
}
