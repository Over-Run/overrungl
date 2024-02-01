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
 * {@code GL_EXT_vertex_weighting}
 */
public interface GLEXTVertexWeighting {
    int GL_MODELVIEW0_STACK_DEPTH_EXT = 0x0BA3;
    int GL_MODELVIEW1_STACK_DEPTH_EXT = 0x8502;
    int GL_MODELVIEW0_MATRIX_EXT = 0x0BA6;
    int GL_MODELVIEW1_MATRIX_EXT = 0x8506;
    int GL_VERTEX_WEIGHTING_EXT = 0x8509;
    int GL_MODELVIEW0_EXT = 0x1700;
    int GL_MODELVIEW1_EXT = 0x850A;
    int GL_CURRENT_VERTEX_WEIGHT_EXT = 0x850B;
    int GL_VERTEX_WEIGHT_ARRAY_EXT = 0x850C;
    int GL_VERTEX_WEIGHT_ARRAY_SIZE_EXT = 0x850D;
    int GL_VERTEX_WEIGHT_ARRAY_TYPE_EXT = 0x850E;
    int GL_VERTEX_WEIGHT_ARRAY_STRIDE_EXT = 0x850F;
    int GL_VERTEX_WEIGHT_ARRAY_POINTER_EXT = 0x8510;

    void glVertexWeightfEXT(float weight);
    void glVertexWeightfvEXT(@NativeType("const GLfloat *") MemorySegment weight);
    void glVertexWeightPointerEXT(int size, int type, int stride, @NativeType("const void *") MemorySegment pointer);
}
