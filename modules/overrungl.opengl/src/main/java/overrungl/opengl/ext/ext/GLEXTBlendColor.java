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
 * {@code GL_EXT_blend_color}
 */
public interface GLEXTBlendColor {
    int GL_CONSTANT_COLOR_EXT = 0x8001;
    int GL_ONE_MINUS_CONSTANT_COLOR_EXT = 0x8002;
    int GL_CONSTANT_ALPHA_EXT = 0x8003;
    int GL_ONE_MINUS_CONSTANT_ALPHA_EXT = 0x8004;
    int GL_BLEND_COLOR_EXT = 0x8005;

    void glBlendColorEXT(float red, float green, float blue, float alpha);
}
