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
package overrungl.opengl.ext.apple;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_APPLE_vertex_program_evaluators}
 */
public interface GLAPPLEVertexProgramEvaluators {
    int GL_VERTEX_ATTRIB_MAP1_APPLE = 0x8A00;
    int GL_VERTEX_ATTRIB_MAP2_APPLE = 0x8A01;
    int GL_VERTEX_ATTRIB_MAP1_SIZE_APPLE = 0x8A02;
    int GL_VERTEX_ATTRIB_MAP1_COEFF_APPLE = 0x8A03;
    int GL_VERTEX_ATTRIB_MAP1_ORDER_APPLE = 0x8A04;
    int GL_VERTEX_ATTRIB_MAP1_DOMAIN_APPLE = 0x8A05;
    int GL_VERTEX_ATTRIB_MAP2_SIZE_APPLE = 0x8A06;
    int GL_VERTEX_ATTRIB_MAP2_COEFF_APPLE = 0x8A07;
    int GL_VERTEX_ATTRIB_MAP2_ORDER_APPLE = 0x8A08;
    int GL_VERTEX_ATTRIB_MAP2_DOMAIN_APPLE = 0x8A09;

    default void glEnableVertexAttribAPPLE(int index, int pname) {
        throw new ContextException();
    }

    default void glDisableVertexAttribAPPLE(int index, int pname) {
        throw new ContextException();
    }

    default boolean glIsVertexAttribEnabledAPPLE(int index, int pname) {
        throw new ContextException();
    }

    default void glMapVertexAttrib1dAPPLE(int index, int size, double u1, double u2, int stride, int order, @NativeType("const GLdouble *") MemorySegment points) {
        throw new ContextException();
    }

    default void glMapVertexAttrib1fAPPLE(int index, int size, float u1, float u2, int stride, int order, @NativeType("const GLfloat *") MemorySegment points) {
        throw new ContextException();
    }

    default void glMapVertexAttrib2dAPPLE(int index, int size, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, @NativeType("const GLdouble *") MemorySegment points) {
        throw new ContextException();
    }

    default void glMapVertexAttrib2fAPPLE(int index, int size, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, @NativeType("const GLfloat *") MemorySegment points) {
        throw new ContextException();
    }

}
