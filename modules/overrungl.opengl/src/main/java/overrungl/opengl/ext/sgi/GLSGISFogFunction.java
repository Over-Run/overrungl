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
 * {@code GL_SGIS_fog_function}
 */
public interface GLSGISFogFunction {
    int GL_FOG_FUNC_SGIS = 0x812A;
    int GL_FOG_FUNC_POINTS_SGIS = 0x812B;
    int GL_MAX_FOG_FUNC_POINTS_SGIS = 0x812C;

    void glFogFuncSGIS(int n, @NativeType("const GLfloat *") MemorySegment points);
    void glGetFogFuncSGIS(@NativeType("GLfloat *") MemorySegment points);
}
