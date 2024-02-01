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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_half_float}
 */
public interface GLNVHalfFloat {
    int GL_HALF_FLOAT_NV = 0x140B;

    default void glVertex2hNV(short x, short y) {
        throw new ContextException();
    }

    default void glVertex2hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertex3hNV(short x, short y, short z) {
        throw new ContextException();
    }

    default void glVertex3hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertex4hNV(short x, short y, short z, short w) {
        throw new ContextException();
    }

    default void glVertex4hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glNormal3hNV(short nx, short ny, short nz) {
        throw new ContextException();
    }

    default void glNormal3hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glColor3hNV(short red, short green, short blue) {
        throw new ContextException();
    }

    default void glColor3hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glColor4hNV(short red, short green, short blue, short alpha) {
        throw new ContextException();
    }

    default void glColor4hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glTexCoord1hNV(short s) {
        throw new ContextException();
    }

    default void glTexCoord1hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glTexCoord2hNV(short s, short t) {
        throw new ContextException();
    }

    default void glTexCoord2hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glTexCoord3hNV(short s, short t, short r) {
        throw new ContextException();
    }

    default void glTexCoord3hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glTexCoord4hNV(short s, short t, short r, short q) {
        throw new ContextException();
    }

    default void glTexCoord4hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glMultiTexCoord1hNV(int target, short s) {
        throw new ContextException();
    }

    default void glMultiTexCoord1hvNV(int target, @NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glMultiTexCoord2hNV(int target, short s, short t) {
        throw new ContextException();
    }

    default void glMultiTexCoord2hvNV(int target, @NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glMultiTexCoord3hNV(int target, short s, short t, short r) {
        throw new ContextException();
    }

    default void glMultiTexCoord3hvNV(int target, @NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glMultiTexCoord4hNV(int target, short s, short t, short r, short q) {
        throw new ContextException();
    }

    default void glMultiTexCoord4hvNV(int target, @NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttrib1hNV(int index, short x) {
        throw new ContextException();
    }

    default void glVertexAttrib1hvNV(int index, @NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttrib2hNV(int index, short x, short y) {
        throw new ContextException();
    }

    default void glVertexAttrib2hvNV(int index, @NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttrib3hNV(int index, short x, short y, short z) {
        throw new ContextException();
    }

    default void glVertexAttrib3hvNV(int index, @NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttrib4hNV(int index, short x, short y, short z, short w) {
        throw new ContextException();
    }

    default void glVertexAttrib4hvNV(int index, @NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribs1hvNV(int index, int n, @NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribs2hvNV(int index, int n, @NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribs3hvNV(int index, int n, @NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribs4hvNV(int index, int n, @NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glFogCoordhNV(short fog) {
        throw new ContextException();
    }

    default void glFogCoordhvNV(@NativeType("const GLhalfNV *") MemorySegment fog) {
        throw new ContextException();
    }

    default void glSecondaryColor3hNV(short red, short green, short blue) {
        throw new ContextException();
    }

    default void glSecondaryColor3hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexWeighthNV(short weight) {
        throw new ContextException();
    }

    default void glVertexWeighthvNV(@NativeType("const GLhalfNV *") MemorySegment weight) {
        throw new ContextException();
    }

}
