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
package overrungl.opengl.ext.mesa;

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_MESA_window_pos}
 */
public interface GLMESAWindowPos {

    void glWindowPos2dMESA(double x, double y);
    void glWindowPos2dvMESA(@NativeType("const GLdouble *") MemorySegment v);
    void glWindowPos2fMESA(float x, float y);
    void glWindowPos2fvMESA(@NativeType("const GLfloat *") MemorySegment v);
    void glWindowPos2iMESA(int x, int y);
    void glWindowPos2ivMESA(@NativeType("const GLint *") MemorySegment v);
    void glWindowPos2sMESA(short x, short y);
    void glWindowPos2svMESA(@NativeType("const GLshort *") MemorySegment v);
    void glWindowPos3dMESA(double x, double y, double z);
    void glWindowPos3dvMESA(@NativeType("const GLdouble *") MemorySegment v);
    void glWindowPos3fMESA(float x, float y, float z);
    void glWindowPos3fvMESA(@NativeType("const GLfloat *") MemorySegment v);
    void glWindowPos3iMESA(int x, int y, int z);
    void glWindowPos3ivMESA(@NativeType("const GLint *") MemorySegment v);
    void glWindowPos3sMESA(short x, short y, short z);
    void glWindowPos3svMESA(@NativeType("const GLshort *") MemorySegment v);
    void glWindowPos4dMESA(double x, double y, double z, double w);
    void glWindowPos4dvMESA(@NativeType("const GLdouble *") MemorySegment v);
    void glWindowPos4fMESA(float x, float y, float z, float w);
    void glWindowPos4fvMESA(@NativeType("const GLfloat *") MemorySegment v);
    void glWindowPos4iMESA(int x, int y, int z, int w);
    void glWindowPos4ivMESA(@NativeType("const GLint *") MemorySegment v);
    void glWindowPos4sMESA(short x, short y, short z, short w);
    void glWindowPos4svMESA(@NativeType("const GLshort *") MemorySegment v);
}
