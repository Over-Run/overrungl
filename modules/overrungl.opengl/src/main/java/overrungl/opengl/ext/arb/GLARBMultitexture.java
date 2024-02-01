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
 * {@code GL_ARB_multitexture}
 */
public interface GLARBMultitexture {
    int GL_TEXTURE0_ARB = 0x84C0;
    int GL_TEXTURE1_ARB = 0x84C1;
    int GL_TEXTURE2_ARB = 0x84C2;
    int GL_TEXTURE3_ARB = 0x84C3;
    int GL_TEXTURE4_ARB = 0x84C4;
    int GL_TEXTURE5_ARB = 0x84C5;
    int GL_TEXTURE6_ARB = 0x84C6;
    int GL_TEXTURE7_ARB = 0x84C7;
    int GL_TEXTURE8_ARB = 0x84C8;
    int GL_TEXTURE9_ARB = 0x84C9;
    int GL_TEXTURE10_ARB = 0x84CA;
    int GL_TEXTURE11_ARB = 0x84CB;
    int GL_TEXTURE12_ARB = 0x84CC;
    int GL_TEXTURE13_ARB = 0x84CD;
    int GL_TEXTURE14_ARB = 0x84CE;
    int GL_TEXTURE15_ARB = 0x84CF;
    int GL_TEXTURE16_ARB = 0x84D0;
    int GL_TEXTURE17_ARB = 0x84D1;
    int GL_TEXTURE18_ARB = 0x84D2;
    int GL_TEXTURE19_ARB = 0x84D3;
    int GL_TEXTURE20_ARB = 0x84D4;
    int GL_TEXTURE21_ARB = 0x84D5;
    int GL_TEXTURE22_ARB = 0x84D6;
    int GL_TEXTURE23_ARB = 0x84D7;
    int GL_TEXTURE24_ARB = 0x84D8;
    int GL_TEXTURE25_ARB = 0x84D9;
    int GL_TEXTURE26_ARB = 0x84DA;
    int GL_TEXTURE27_ARB = 0x84DB;
    int GL_TEXTURE28_ARB = 0x84DC;
    int GL_TEXTURE29_ARB = 0x84DD;
    int GL_TEXTURE30_ARB = 0x84DE;
    int GL_TEXTURE31_ARB = 0x84DF;
    int GL_ACTIVE_TEXTURE_ARB = 0x84E0;
    int GL_CLIENT_ACTIVE_TEXTURE_ARB = 0x84E1;
    int GL_MAX_TEXTURE_UNITS_ARB = 0x84E2;

    void glActiveTextureARB(int texture);
    void glClientActiveTextureARB(int texture);
    void glMultiTexCoord1dARB(int target, double s);
    void glMultiTexCoord1dvARB(int target, @NativeType("const GLdouble *") MemorySegment v);
    void glMultiTexCoord1fARB(int target, float s);
    void glMultiTexCoord1fvARB(int target, @NativeType("const GLfloat *") MemorySegment v);
    void glMultiTexCoord1iARB(int target, int s);
    void glMultiTexCoord1ivARB(int target, @NativeType("const GLint *") MemorySegment v);
    void glMultiTexCoord1sARB(int target, short s);
    void glMultiTexCoord1svARB(int target, @NativeType("const GLshort *") MemorySegment v);
    void glMultiTexCoord2dARB(int target, double s, double t);
    void glMultiTexCoord2dvARB(int target, @NativeType("const GLdouble *") MemorySegment v);
    void glMultiTexCoord2fARB(int target, float s, float t);
    void glMultiTexCoord2fvARB(int target, @NativeType("const GLfloat *") MemorySegment v);
    void glMultiTexCoord2iARB(int target, int s, int t);
    void glMultiTexCoord2ivARB(int target, @NativeType("const GLint *") MemorySegment v);
    void glMultiTexCoord2sARB(int target, short s, short t);
    void glMultiTexCoord2svARB(int target, @NativeType("const GLshort *") MemorySegment v);
    void glMultiTexCoord3dARB(int target, double s, double t, double r);
    void glMultiTexCoord3dvARB(int target, @NativeType("const GLdouble *") MemorySegment v);
    void glMultiTexCoord3fARB(int target, float s, float t, float r);
    void glMultiTexCoord3fvARB(int target, @NativeType("const GLfloat *") MemorySegment v);
    void glMultiTexCoord3iARB(int target, int s, int t, int r);
    void glMultiTexCoord3ivARB(int target, @NativeType("const GLint *") MemorySegment v);
    void glMultiTexCoord3sARB(int target, short s, short t, short r);
    void glMultiTexCoord3svARB(int target, @NativeType("const GLshort *") MemorySegment v);
    void glMultiTexCoord4dARB(int target, double s, double t, double r, double q);
    void glMultiTexCoord4dvARB(int target, @NativeType("const GLdouble *") MemorySegment v);
    void glMultiTexCoord4fARB(int target, float s, float t, float r, float q);
    void glMultiTexCoord4fvARB(int target, @NativeType("const GLfloat *") MemorySegment v);
    void glMultiTexCoord4iARB(int target, int s, int t, int r, int q);
    void glMultiTexCoord4ivARB(int target, @NativeType("const GLint *") MemorySegment v);
    void glMultiTexCoord4sARB(int target, short s, short t, short r, short q);
    void glMultiTexCoord4svARB(int target, @NativeType("const GLshort *") MemorySegment v);
}
