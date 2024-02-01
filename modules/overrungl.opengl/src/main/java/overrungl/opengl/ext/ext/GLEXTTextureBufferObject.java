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
 * {@code GL_EXT_texture_buffer_object}
 */
public interface GLEXTTextureBufferObject {
    int GL_TEXTURE_BUFFER_EXT = 0x8C2A;
    int GL_MAX_TEXTURE_BUFFER_SIZE_EXT = 0x8C2B;
    int GL_TEXTURE_BINDING_BUFFER_EXT = 0x8C2C;
    int GL_TEXTURE_BUFFER_DATA_STORE_BINDING_EXT = 0x8C2D;
    int GL_TEXTURE_BUFFER_FORMAT_EXT = 0x8C2E;

    void glTexBufferEXT(int target, int internalformat, int buffer);
}
