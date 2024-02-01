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
 * {@code GL_NV_evaluators}
 */
public interface GLNVEvaluators {
    int GL_EVAL_2D_NV = 0x86C0;
    int GL_EVAL_TRIANGULAR_2D_NV = 0x86C1;
    int GL_MAP_TESSELLATION_NV = 0x86C2;
    int GL_MAP_ATTRIB_U_ORDER_NV = 0x86C3;
    int GL_MAP_ATTRIB_V_ORDER_NV = 0x86C4;
    int GL_EVAL_FRACTIONAL_TESSELLATION_NV = 0x86C5;
    int GL_EVAL_VERTEX_ATTRIB0_NV = 0x86C6;
    int GL_EVAL_VERTEX_ATTRIB1_NV = 0x86C7;
    int GL_EVAL_VERTEX_ATTRIB2_NV = 0x86C8;
    int GL_EVAL_VERTEX_ATTRIB3_NV = 0x86C9;
    int GL_EVAL_VERTEX_ATTRIB4_NV = 0x86CA;
    int GL_EVAL_VERTEX_ATTRIB5_NV = 0x86CB;
    int GL_EVAL_VERTEX_ATTRIB6_NV = 0x86CC;
    int GL_EVAL_VERTEX_ATTRIB7_NV = 0x86CD;
    int GL_EVAL_VERTEX_ATTRIB8_NV = 0x86CE;
    int GL_EVAL_VERTEX_ATTRIB9_NV = 0x86CF;
    int GL_EVAL_VERTEX_ATTRIB10_NV = 0x86D0;
    int GL_EVAL_VERTEX_ATTRIB11_NV = 0x86D1;
    int GL_EVAL_VERTEX_ATTRIB12_NV = 0x86D2;
    int GL_EVAL_VERTEX_ATTRIB13_NV = 0x86D3;
    int GL_EVAL_VERTEX_ATTRIB14_NV = 0x86D4;
    int GL_EVAL_VERTEX_ATTRIB15_NV = 0x86D5;
    int GL_MAX_MAP_TESSELLATION_NV = 0x86D6;
    int GL_MAX_RATIONAL_EVAL_ORDER_NV = 0x86D7;

    default void glMapControlPointsNV(int target, int index, int type, int ustride, int vstride, int uorder, int vorder, boolean packed, @NativeType("const void *") MemorySegment points) {
        throw new ContextException();
    }

    default void glMapParameterivNV(int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glMapParameterfvNV(int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMapControlPointsNV(int target, int index, int type, int ustride, int vstride, boolean packed, @NativeType("void *") MemorySegment points) {
        throw new ContextException();
    }

    default void glGetMapParameterivNV(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMapParameterfvNV(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMapAttribParameterivNV(int target, int index, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMapAttribParameterfvNV(int target, int index, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glEvalMapsNV(int target, int mode) {
        throw new ContextException();
    }

}
