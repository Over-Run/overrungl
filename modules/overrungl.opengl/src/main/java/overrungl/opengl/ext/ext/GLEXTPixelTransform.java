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
 * {@code GL_EXT_pixel_transform}
 */
public interface GLEXTPixelTransform {
    int GL_PIXEL_TRANSFORM_2D_EXT = 0x8330;
    int GL_PIXEL_MAG_FILTER_EXT = 0x8331;
    int GL_PIXEL_MIN_FILTER_EXT = 0x8332;
    int GL_PIXEL_CUBIC_WEIGHT_EXT = 0x8333;
    int GL_CUBIC_EXT = 0x8334;
    int GL_AVERAGE_EXT = 0x8335;
    int GL_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT = 0x8336;
    int GL_MAX_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT = 0x8337;
    int GL_PIXEL_TRANSFORM_2D_MATRIX_EXT = 0x8338;

    void glPixelTransformParameteriEXT(int target, int pname, int param);
    void glPixelTransformParameterfEXT(int target, int pname, float param);
    void glPixelTransformParameterivEXT(int target, int pname, @NativeType("const GLint *") MemorySegment params);
    void glPixelTransformParameterfvEXT(int target, int pname, @NativeType("const GLfloat *") MemorySegment params);
    void glGetPixelTransformParameterivEXT(int target, int pname, @NativeType("GLint *") MemorySegment params);
    void glGetPixelTransformParameterfvEXT(int target, int pname, @NativeType("GLfloat *") MemorySegment params);
}
