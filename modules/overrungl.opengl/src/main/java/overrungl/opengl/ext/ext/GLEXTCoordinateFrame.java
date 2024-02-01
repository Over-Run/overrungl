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
 * {@code GL_EXT_coordinate_frame}
 */
public interface GLEXTCoordinateFrame {
    int GL_TANGENT_ARRAY_EXT = 0x8439;
    int GL_BINORMAL_ARRAY_EXT = 0x843A;
    int GL_CURRENT_TANGENT_EXT = 0x843B;
    int GL_CURRENT_BINORMAL_EXT = 0x843C;
    int GL_TANGENT_ARRAY_TYPE_EXT = 0x843E;
    int GL_TANGENT_ARRAY_STRIDE_EXT = 0x843F;
    int GL_BINORMAL_ARRAY_TYPE_EXT = 0x8440;
    int GL_BINORMAL_ARRAY_STRIDE_EXT = 0x8441;
    int GL_TANGENT_ARRAY_POINTER_EXT = 0x8442;
    int GL_BINORMAL_ARRAY_POINTER_EXT = 0x8443;
    int GL_MAP1_TANGENT_EXT = 0x8444;
    int GL_MAP2_TANGENT_EXT = 0x8445;
    int GL_MAP1_BINORMAL_EXT = 0x8446;
    int GL_MAP2_BINORMAL_EXT = 0x8447;

    void glTangent3bEXT(byte tx, byte ty, byte tz);
    void glTangent3bvEXT(@NativeType("const GLbyte *") MemorySegment v);
    void glTangent3dEXT(double tx, double ty, double tz);
    void glTangent3dvEXT(@NativeType("const GLdouble *") MemorySegment v);
    void glTangent3fEXT(float tx, float ty, float tz);
    void glTangent3fvEXT(@NativeType("const GLfloat *") MemorySegment v);
    void glTangent3iEXT(int tx, int ty, int tz);
    void glTangent3ivEXT(@NativeType("const GLint *") MemorySegment v);
    void glTangent3sEXT(short tx, short ty, short tz);
    void glTangent3svEXT(@NativeType("const GLshort *") MemorySegment v);
    void glBinormal3bEXT(byte bx, byte by, byte bz);
    void glBinormal3bvEXT(@NativeType("const GLbyte *") MemorySegment v);
    void glBinormal3dEXT(double bx, double by, double bz);
    void glBinormal3dvEXT(@NativeType("const GLdouble *") MemorySegment v);
    void glBinormal3fEXT(float bx, float by, float bz);
    void glBinormal3fvEXT(@NativeType("const GLfloat *") MemorySegment v);
    void glBinormal3iEXT(int bx, int by, int bz);
    void glBinormal3ivEXT(@NativeType("const GLint *") MemorySegment v);
    void glBinormal3sEXT(short bx, short by, short bz);
    void glBinormal3svEXT(@NativeType("const GLshort *") MemorySegment v);
    void glTangentPointerEXT(int type, int stride, @NativeType("const void *") MemorySegment pointer);
    void glBinormalPointerEXT(int type, int stride, @NativeType("const void *") MemorySegment pointer);
}
