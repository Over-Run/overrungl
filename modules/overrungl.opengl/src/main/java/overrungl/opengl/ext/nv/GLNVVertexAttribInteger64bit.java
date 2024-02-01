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
 * {@code GL_NV_vertex_attrib_integer_64bit}
 */
public interface GLNVVertexAttribInteger64bit {

    default void glVertexAttribL1i64NV(int index, long x) {
        throw new ContextException();
    }

    default void glVertexAttribL2i64NV(int index, long x, long y) {
        throw new ContextException();
    }

    default void glVertexAttribL3i64NV(int index, long x, long y, long z) {
        throw new ContextException();
    }

    default void glVertexAttribL4i64NV(int index, long x, long y, long z, long w) {
        throw new ContextException();
    }

    default void glVertexAttribL1i64vNV(int index, @NativeType("const GLint64EXT *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribL2i64vNV(int index, @NativeType("const GLint64EXT *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribL3i64vNV(int index, @NativeType("const GLint64EXT *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribL4i64vNV(int index, @NativeType("const GLint64EXT *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribL1ui64NV(int index, long x) {
        throw new ContextException();
    }

    default void glVertexAttribL2ui64NV(int index, long x, long y) {
        throw new ContextException();
    }

    default void glVertexAttribL3ui64NV(int index, long x, long y, long z) {
        throw new ContextException();
    }

    default void glVertexAttribL4ui64NV(int index, long x, long y, long z, long w) {
        throw new ContextException();
    }

    default void glVertexAttribL1ui64vNV(int index, @NativeType("const GLuint64EXT *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribL2ui64vNV(int index, @NativeType("const GLuint64EXT *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribL3ui64vNV(int index, @NativeType("const GLuint64EXT *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribL4ui64vNV(int index, @NativeType("const GLuint64EXT *") MemorySegment v) {
        throw new ContextException();
    }

    default void glGetVertexAttribLi64vNV(int index, int pname, @NativeType("GLint64EXT *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetVertexAttribLui64vNV(int index, int pname, @NativeType("GLuint64EXT *") MemorySegment params) {
        throw new ContextException();
    }

    default void glVertexAttribLFormatNV(int index, int size, int type, int stride) {
        throw new ContextException();
    }

}
