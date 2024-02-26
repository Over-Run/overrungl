/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_vertex_attrib_64bit}
 */
public interface GLEXTVertexAttrib64bit extends overrun.marshal.DirectAccess {
    int GL_DOUBLE_VEC2_EXT = 0x8FFC;
    int GL_DOUBLE_VEC3_EXT = 0x8FFD;
    int GL_DOUBLE_VEC4_EXT = 0x8FFE;
    int GL_DOUBLE_MAT2_EXT = 0x8F46;
    int GL_DOUBLE_MAT3_EXT = 0x8F47;
    int GL_DOUBLE_MAT4_EXT = 0x8F48;
    int GL_DOUBLE_MAT2x3_EXT = 0x8F49;
    int GL_DOUBLE_MAT2x4_EXT = 0x8F4A;
    int GL_DOUBLE_MAT3x2_EXT = 0x8F4B;
    int GL_DOUBLE_MAT3x4_EXT = 0x8F4C;
    int GL_DOUBLE_MAT4x2_EXT = 0x8F4D;
    int GL_DOUBLE_MAT4x3_EXT = 0x8F4E;

    default void glVertexAttribL1dEXT(int index, double x) {
        throw new ContextException();
    }

    default void glVertexAttribL2dEXT(int index, double x, double y) {
        throw new ContextException();
    }

    default void glVertexAttribL3dEXT(int index, double x, double y, double z) {
        throw new ContextException();
    }

    default void glVertexAttribL4dEXT(int index, double x, double y, double z, double w) {
        throw new ContextException();
    }

    default void glVertexAttribL1dvEXT(int index, @NativeType("const GLdouble *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribL2dvEXT(int index, @NativeType("const GLdouble *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribL3dvEXT(int index, @NativeType("const GLdouble *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribL4dvEXT(int index, @NativeType("const GLdouble *") MemorySegment v) {
        throw new ContextException();
    }

    default void glVertexAttribLPointerEXT(int index, int size, int type, int stride, @NativeType("const void *") MemorySegment pointer) {
        throw new ContextException();
    }

    default void glGetVertexAttribLdvEXT(int index, int pname, @NativeType("GLdouble *") MemorySegment params) {
        throw new ContextException();
    }

}
