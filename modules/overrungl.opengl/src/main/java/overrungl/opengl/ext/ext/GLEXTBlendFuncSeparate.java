/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_blend_func_separate}
 */
public interface GLEXTBlendFuncSeparate extends overrun.marshal.DirectAccess {
    int GL_BLEND_DST_RGB_EXT = 0x80C8;
    int GL_BLEND_SRC_RGB_EXT = 0x80C9;
    int GL_BLEND_DST_ALPHA_EXT = 0x80CA;
    int GL_BLEND_SRC_ALPHA_EXT = 0x80CB;

    default void glBlendFuncSeparateEXT(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
        throw new ContextException();
    }

}
