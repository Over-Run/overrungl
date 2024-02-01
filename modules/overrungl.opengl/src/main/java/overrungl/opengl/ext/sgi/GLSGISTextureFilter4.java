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
package overrungl.opengl.ext.sgi;

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_SGIS_texture_filter4}
 */
public interface GLSGISTextureFilter4 {
    int GL_FILTER4_SGIS = 0x8146;
    int GL_TEXTURE_FILTER4_SIZE_SGIS = 0x8147;

    void glGetTexFilterFuncSGIS(int target, int filter, @NativeType("GLfloat *") MemorySegment weights);
    void glTexFilterFuncSGIS(int target, int filter, int n, @NativeType("const GLfloat *") MemorySegment weights);
}
