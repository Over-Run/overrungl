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

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_depth_buffer_float}
 */
public interface GLNVDepthBufferFloat {
    int GL_DEPTH_COMPONENT32F_NV = 0x8DAB;
    int GL_DEPTH32F_STENCIL8_NV = 0x8DAC;
    int GL_FLOAT_32_UNSIGNED_INT_24_8_REV_NV = 0x8DAD;
    int GL_DEPTH_BUFFER_FLOAT_MODE_NV = 0x8DAF;

    void glDepthRangedNV(double zNear, double zFar);
    void glClearDepthdNV(double depth);
    void glDepthBoundsdNV(double zmin, double zmax);
}
