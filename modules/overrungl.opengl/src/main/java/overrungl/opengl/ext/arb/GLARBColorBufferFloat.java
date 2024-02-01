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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_color_buffer_float}
 */
public interface GLARBColorBufferFloat {
    int GL_RGBA_FLOAT_MODE_ARB = 0x8820;
    int GL_CLAMP_VERTEX_COLOR_ARB = 0x891A;
    int GL_CLAMP_FRAGMENT_COLOR_ARB = 0x891B;
    int GL_CLAMP_READ_COLOR_ARB = 0x891C;
    int GL_FIXED_ONLY_ARB = 0x891D;

    default void glClampColorARB(int target, int clamp) {
        throw new ContextException();
    }

}
