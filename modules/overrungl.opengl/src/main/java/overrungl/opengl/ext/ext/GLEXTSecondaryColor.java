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
 * {@code GL_EXT_secondary_color}
 */
public interface GLEXTSecondaryColor {
    int GL_COLOR_SUM_EXT = 0x8458;
    int GL_CURRENT_SECONDARY_COLOR_EXT = 0x8459;
    int GL_SECONDARY_COLOR_ARRAY_SIZE_EXT = 0x845A;
    int GL_SECONDARY_COLOR_ARRAY_TYPE_EXT = 0x845B;
    int GL_SECONDARY_COLOR_ARRAY_STRIDE_EXT = 0x845C;
    int GL_SECONDARY_COLOR_ARRAY_POINTER_EXT = 0x845D;
    int GL_SECONDARY_COLOR_ARRAY_EXT = 0x845E;

    void glSecondaryColor3bEXT(byte red, byte green, byte blue);
    void glSecondaryColor3bvEXT(@NativeType("const GLbyte *") MemorySegment v);
    void glSecondaryColor3dEXT(double red, double green, double blue);
    void glSecondaryColor3dvEXT(@NativeType("const GLdouble *") MemorySegment v);
    void glSecondaryColor3fEXT(float red, float green, float blue);
    void glSecondaryColor3fvEXT(@NativeType("const GLfloat *") MemorySegment v);
    void glSecondaryColor3iEXT(int red, int green, int blue);
    void glSecondaryColor3ivEXT(@NativeType("const GLint *") MemorySegment v);
    void glSecondaryColor3sEXT(short red, short green, short blue);
    void glSecondaryColor3svEXT(@NativeType("const GLshort *") MemorySegment v);
    void glSecondaryColor3ubEXT(byte red, byte green, byte blue);
    void glSecondaryColor3ubvEXT(@NativeType("const GLubyte *") MemorySegment v);
    void glSecondaryColor3uiEXT(int red, int green, int blue);
    void glSecondaryColor3uivEXT(@NativeType("const GLuint *") MemorySegment v);
    void glSecondaryColor3usEXT(short red, short green, short blue);
    void glSecondaryColor3usvEXT(@NativeType("const GLushort *") MemorySegment v);
    void glSecondaryColorPointerEXT(int size, int type, int stride, @NativeType("const void *") MemorySegment pointer);
}
