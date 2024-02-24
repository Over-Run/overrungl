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
 * {@code GL_EXT_texture_array}
 */
public interface GLEXTTextureArray extends overrun.marshal.DirectAccess {
    int GL_TEXTURE_1D_ARRAY_EXT = 0x8C18;
    int GL_PROXY_TEXTURE_1D_ARRAY_EXT = 0x8C19;
    int GL_TEXTURE_2D_ARRAY_EXT = 0x8C1A;
    int GL_PROXY_TEXTURE_2D_ARRAY_EXT = 0x8C1B;
    int GL_TEXTURE_BINDING_1D_ARRAY_EXT = 0x8C1C;
    int GL_TEXTURE_BINDING_2D_ARRAY_EXT = 0x8C1D;
    int GL_MAX_ARRAY_TEXTURE_LAYERS_EXT = 0x88FF;
    int GL_COMPARE_REF_DEPTH_TO_TEXTURE_EXT = 0x884E;

    default void glFramebufferTextureLayerEXT(int target, int attachment, int texture, int level, int layer) {
        throw new ContextException();
    }

}
