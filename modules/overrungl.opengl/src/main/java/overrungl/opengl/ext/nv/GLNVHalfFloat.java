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
 * {@code GL_NV_half_float}
 */
public interface GLNVHalfFloat {
    int GL_HALF_FLOAT_NV = 0x140B;

    void glVertex2hNV(short x, short y);
    void glVertex2hvNV(@NativeType("const GLhalfNV *") MemorySegment v);
    void glVertex3hNV(short x, short y, short z);
    void glVertex3hvNV(@NativeType("const GLhalfNV *") MemorySegment v);
    void glVertex4hNV(short x, short y, short z, short w);
    void glVertex4hvNV(@NativeType("const GLhalfNV *") MemorySegment v);
    void glNormal3hNV(short nx, short ny, short nz);
    void glNormal3hvNV(@NativeType("const GLhalfNV *") MemorySegment v);
    void glColor3hNV(short red, short green, short blue);
    void glColor3hvNV(@NativeType("const GLhalfNV *") MemorySegment v);
    void glColor4hNV(short red, short green, short blue, short alpha);
    void glColor4hvNV(@NativeType("const GLhalfNV *") MemorySegment v);
    void glTexCoord1hNV(short s);
    void glTexCoord1hvNV(@NativeType("const GLhalfNV *") MemorySegment v);
    void glTexCoord2hNV(short s, short t);
    void glTexCoord2hvNV(@NativeType("const GLhalfNV *") MemorySegment v);
    void glTexCoord3hNV(short s, short t, short r);
    void glTexCoord3hvNV(@NativeType("const GLhalfNV *") MemorySegment v);
    void glTexCoord4hNV(short s, short t, short r, short q);
    void glTexCoord4hvNV(@NativeType("const GLhalfNV *") MemorySegment v);
    void glMultiTexCoord1hNV(int target, short s);
    void glMultiTexCoord1hvNV(int target, @NativeType("const GLhalfNV *") MemorySegment v);
    void glMultiTexCoord2hNV(int target, short s, short t);
    void glMultiTexCoord2hvNV(int target, @NativeType("const GLhalfNV *") MemorySegment v);
    void glMultiTexCoord3hNV(int target, short s, short t, short r);
    void glMultiTexCoord3hvNV(int target, @NativeType("const GLhalfNV *") MemorySegment v);
    void glMultiTexCoord4hNV(int target, short s, short t, short r, short q);
    void glMultiTexCoord4hvNV(int target, @NativeType("const GLhalfNV *") MemorySegment v);
    void glVertexAttrib1hNV(int index, short x);
    void glVertexAttrib1hvNV(int index, @NativeType("const GLhalfNV *") MemorySegment v);
    void glVertexAttrib2hNV(int index, short x, short y);
    void glVertexAttrib2hvNV(int index, @NativeType("const GLhalfNV *") MemorySegment v);
    void glVertexAttrib3hNV(int index, short x, short y, short z);
    void glVertexAttrib3hvNV(int index, @NativeType("const GLhalfNV *") MemorySegment v);
    void glVertexAttrib4hNV(int index, short x, short y, short z, short w);
    void glVertexAttrib4hvNV(int index, @NativeType("const GLhalfNV *") MemorySegment v);
    void glVertexAttribs1hvNV(int index, int n, @NativeType("const GLhalfNV *") MemorySegment v);
    void glVertexAttribs2hvNV(int index, int n, @NativeType("const GLhalfNV *") MemorySegment v);
    void glVertexAttribs3hvNV(int index, int n, @NativeType("const GLhalfNV *") MemorySegment v);
    void glVertexAttribs4hvNV(int index, int n, @NativeType("const GLhalfNV *") MemorySegment v);
    void glFogCoordhNV(short fog);
    void glFogCoordhvNV(@NativeType("const GLhalfNV *") MemorySegment fog);
    void glSecondaryColor3hNV(short red, short green, short blue);
    void glSecondaryColor3hvNV(@NativeType("const GLhalfNV *") MemorySegment v);
    void glVertexWeighthNV(short weight);
    void glVertexWeighthvNV(@NativeType("const GLhalfNV *") MemorySegment weight);
}
