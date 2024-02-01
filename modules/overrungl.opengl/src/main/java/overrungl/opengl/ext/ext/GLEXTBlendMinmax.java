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
 * {@code GL_EXT_blend_minmax}
 */
public interface GLEXTBlendMinmax {
    int GL_MIN_EXT = 0x8007;
    int GL_MAX_EXT = 0x8008;
    int GL_FUNC_ADD_EXT = 0x8006;
    int GL_BLEND_EQUATION_EXT = 0x8009;

    void glBlendEquationEXT(int mode);
}
