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
 * {@code GL_ARB_vertex_program}
 */
public interface GLARBVertexProgram {
    int GL_COLOR_SUM_ARB = 0x8458;
    int GL_VERTEX_PROGRAM_ARB = 0x8620;
    int GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB = 0x8622;
    int GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB = 0x8623;
    int GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB = 0x8624;
    int GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB = 0x8625;
    int GL_CURRENT_VERTEX_ATTRIB_ARB = 0x8626;
    int GL_VERTEX_PROGRAM_POINT_SIZE_ARB = 0x8642;
    int GL_VERTEX_PROGRAM_TWO_SIDE_ARB = 0x8643;
    int GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB = 0x8645;
    int GL_MAX_VERTEX_ATTRIBS_ARB = 0x8869;
    int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB = 0x886A;
    int GL_PROGRAM_ADDRESS_REGISTERS_ARB = 0x88B0;
    int GL_MAX_PROGRAM_ADDRESS_REGISTERS_ARB = 0x88B1;
    int GL_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB = 0x88B2;
    int GL_MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB = 0x88B3;

    void glVertexAttrib1dARB(int index, double x);
    void glVertexAttrib1dvARB(int index, @NativeType("const GLdouble *") MemorySegment v);
    void glVertexAttrib1fARB(int index, float x);
    void glVertexAttrib1fvARB(int index, @NativeType("const GLfloat *") MemorySegment v);
    void glVertexAttrib1sARB(int index, short x);
    void glVertexAttrib1svARB(int index, @NativeType("const GLshort *") MemorySegment v);
    void glVertexAttrib2dARB(int index, double x, double y);
    void glVertexAttrib2dvARB(int index, @NativeType("const GLdouble *") MemorySegment v);
    void glVertexAttrib2fARB(int index, float x, float y);
    void glVertexAttrib2fvARB(int index, @NativeType("const GLfloat *") MemorySegment v);
    void glVertexAttrib2sARB(int index, short x, short y);
    void glVertexAttrib2svARB(int index, @NativeType("const GLshort *") MemorySegment v);
    void glVertexAttrib3dARB(int index, double x, double y, double z);
    void glVertexAttrib3dvARB(int index, @NativeType("const GLdouble *") MemorySegment v);
    void glVertexAttrib3fARB(int index, float x, float y, float z);
    void glVertexAttrib3fvARB(int index, @NativeType("const GLfloat *") MemorySegment v);
    void glVertexAttrib3sARB(int index, short x, short y, short z);
    void glVertexAttrib3svARB(int index, @NativeType("const GLshort *") MemorySegment v);
    void glVertexAttrib4NbvARB(int index, @NativeType("const GLbyte *") MemorySegment v);
    void glVertexAttrib4NivARB(int index, @NativeType("const GLint *") MemorySegment v);
    void glVertexAttrib4NsvARB(int index, @NativeType("const GLshort *") MemorySegment v);
    void glVertexAttrib4NubARB(int index, byte x, byte y, byte z, byte w);
    void glVertexAttrib4NubvARB(int index, @NativeType("const GLubyte *") MemorySegment v);
    void glVertexAttrib4NuivARB(int index, @NativeType("const GLuint *") MemorySegment v);
    void glVertexAttrib4NusvARB(int index, @NativeType("const GLushort *") MemorySegment v);
    void glVertexAttrib4bvARB(int index, @NativeType("const GLbyte *") MemorySegment v);
    void glVertexAttrib4dARB(int index, double x, double y, double z, double w);
    void glVertexAttrib4dvARB(int index, @NativeType("const GLdouble *") MemorySegment v);
    void glVertexAttrib4fARB(int index, float x, float y, float z, float w);
    void glVertexAttrib4fvARB(int index, @NativeType("const GLfloat *") MemorySegment v);
    void glVertexAttrib4ivARB(int index, @NativeType("const GLint *") MemorySegment v);
    void glVertexAttrib4sARB(int index, short x, short y, short z, short w);
    void glVertexAttrib4svARB(int index, @NativeType("const GLshort *") MemorySegment v);
    void glVertexAttrib4ubvARB(int index, @NativeType("const GLubyte *") MemorySegment v);
    void glVertexAttrib4uivARB(int index, @NativeType("const GLuint *") MemorySegment v);
    void glVertexAttrib4usvARB(int index, @NativeType("const GLushort *") MemorySegment v);
    void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, @NativeType("const void *") MemorySegment pointer);
    void glEnableVertexAttribArrayARB(int index);
    void glDisableVertexAttribArrayARB(int index);
    void glGetVertexAttribdvARB(int index, int pname, @NativeType("GLdouble *") MemorySegment params);
    void glGetVertexAttribfvARB(int index, int pname, @NativeType("GLfloat *") MemorySegment params);
    void glGetVertexAttribivARB(int index, int pname, @NativeType("GLint *") MemorySegment params);
    void glGetVertexAttribPointervARB(int index, int pname, @NativeType("void **") MemorySegment pointer);
}
