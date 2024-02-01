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
 * {@code GL_NV_viewport_swizzle}
 */
public interface GLNVViewportSwizzle {
    int GL_VIEWPORT_SWIZZLE_POSITIVE_X_NV = 0x9350;
    int GL_VIEWPORT_SWIZZLE_NEGATIVE_X_NV = 0x9351;
    int GL_VIEWPORT_SWIZZLE_POSITIVE_Y_NV = 0x9352;
    int GL_VIEWPORT_SWIZZLE_NEGATIVE_Y_NV = 0x9353;
    int GL_VIEWPORT_SWIZZLE_POSITIVE_Z_NV = 0x9354;
    int GL_VIEWPORT_SWIZZLE_NEGATIVE_Z_NV = 0x9355;
    int GL_VIEWPORT_SWIZZLE_POSITIVE_W_NV = 0x9356;
    int GL_VIEWPORT_SWIZZLE_NEGATIVE_W_NV = 0x9357;
    int GL_VIEWPORT_SWIZZLE_X_NV = 0x9358;
    int GL_VIEWPORT_SWIZZLE_Y_NV = 0x9359;
    int GL_VIEWPORT_SWIZZLE_Z_NV = 0x935A;
    int GL_VIEWPORT_SWIZZLE_W_NV = 0x935B;

    void glViewportSwizzleNV(int index, int swizzlex, int swizzley, int swizzlez, int swizzlew);
}
