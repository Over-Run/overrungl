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
package overrungl.opengl.ext.arb;

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_vertex_blend}
 */
public interface GLARBVertexBlend {
    int GL_MAX_VERTEX_UNITS_ARB = 0x86A4;
    int GL_ACTIVE_VERTEX_UNITS_ARB = 0x86A5;
    int GL_WEIGHT_SUM_UNITY_ARB = 0x86A6;
    int GL_VERTEX_BLEND_ARB = 0x86A7;
    int GL_CURRENT_WEIGHT_ARB = 0x86A8;
    int GL_WEIGHT_ARRAY_TYPE_ARB = 0x86A9;
    int GL_WEIGHT_ARRAY_STRIDE_ARB = 0x86AA;
    int GL_WEIGHT_ARRAY_SIZE_ARB = 0x86AB;
    int GL_WEIGHT_ARRAY_POINTER_ARB = 0x86AC;
    int GL_WEIGHT_ARRAY_ARB = 0x86AD;
    int GL_MODELVIEW0_ARB = 0x1700;
    int GL_MODELVIEW1_ARB = 0x850A;
    int GL_MODELVIEW2_ARB = 0x8722;
    int GL_MODELVIEW3_ARB = 0x8723;
    int GL_MODELVIEW4_ARB = 0x8724;
    int GL_MODELVIEW5_ARB = 0x8725;
    int GL_MODELVIEW6_ARB = 0x8726;
    int GL_MODELVIEW7_ARB = 0x8727;
    int GL_MODELVIEW8_ARB = 0x8728;
    int GL_MODELVIEW9_ARB = 0x8729;
    int GL_MODELVIEW10_ARB = 0x872A;
    int GL_MODELVIEW11_ARB = 0x872B;
    int GL_MODELVIEW12_ARB = 0x872C;
    int GL_MODELVIEW13_ARB = 0x872D;
    int GL_MODELVIEW14_ARB = 0x872E;
    int GL_MODELVIEW15_ARB = 0x872F;
    int GL_MODELVIEW16_ARB = 0x8730;
    int GL_MODELVIEW17_ARB = 0x8731;
    int GL_MODELVIEW18_ARB = 0x8732;
    int GL_MODELVIEW19_ARB = 0x8733;
    int GL_MODELVIEW20_ARB = 0x8734;
    int GL_MODELVIEW21_ARB = 0x8735;
    int GL_MODELVIEW22_ARB = 0x8736;
    int GL_MODELVIEW23_ARB = 0x8737;
    int GL_MODELVIEW24_ARB = 0x8738;
    int GL_MODELVIEW25_ARB = 0x8739;
    int GL_MODELVIEW26_ARB = 0x873A;
    int GL_MODELVIEW27_ARB = 0x873B;
    int GL_MODELVIEW28_ARB = 0x873C;
    int GL_MODELVIEW29_ARB = 0x873D;
    int GL_MODELVIEW30_ARB = 0x873E;
    int GL_MODELVIEW31_ARB = 0x873F;

    void glWeightbvARB(int size, @NativeType("const GLbyte*") MemorySegment weights);
    void glWeightsvARB(int size, @NativeType("const GLshort*") MemorySegment weights);
    void glWeightivARB(int size, @NativeType("const GLint*") MemorySegment weights);
    void glWeightfvARB(int size, @NativeType("const GLfloat*") MemorySegment weights);
    void glWeightdvARB(int size, @NativeType("const GLdouble*") MemorySegment weights);
    void glWeightubvARB(int size, @NativeType("const GLubyte*") MemorySegment weights);
    void glWeightusvARB(int size, @NativeType("const GLushort*") MemorySegment weights);
    void glWeightuivARB(int size, @NativeType("const GLuint*") MemorySegment weights);
    void glWeightPointerARB(int size, int type, int stride, @NativeType("const void*") MemorySegment pointer);
    void glVertexBlendARB(int count);
}
