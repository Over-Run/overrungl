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
 * {@code GL_ARB_window_pos}
 */
public interface GLARBWindowPos {

    void glWindowPos2dARB(double x, double y);
    void glWindowPos2dvARB(@NativeType("const GLdouble *") MemorySegment v);
    void glWindowPos2fARB(float x, float y);
    void glWindowPos2fvARB(@NativeType("const GLfloat *") MemorySegment v);
    void glWindowPos2iARB(int x, int y);
    void glWindowPos2ivARB(@NativeType("const GLint *") MemorySegment v);
    void glWindowPos2sARB(short x, short y);
    void glWindowPos2svARB(@NativeType("const GLshort *") MemorySegment v);
    void glWindowPos3dARB(double x, double y, double z);
    void glWindowPos3dvARB(@NativeType("const GLdouble *") MemorySegment v);
    void glWindowPos3fARB(float x, float y, float z);
    void glWindowPos3fvARB(@NativeType("const GLfloat *") MemorySegment v);
    void glWindowPos3iARB(int x, int y, int z);
    void glWindowPos3ivARB(@NativeType("const GLint *") MemorySegment v);
    void glWindowPos3sARB(short x, short y, short z);
    void glWindowPos3svARB(@NativeType("const GLshort *") MemorySegment v);
}
