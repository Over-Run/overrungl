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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_framebuffer_blit}
 */
public interface GLEXTFramebufferBlit {
    int GL_READ_FRAMEBUFFER_EXT = 0x8CA8;
    int GL_DRAW_FRAMEBUFFER_EXT = 0x8CA9;
    int GL_DRAW_FRAMEBUFFER_BINDING_EXT = 0x8CA6;
    int GL_READ_FRAMEBUFFER_BINDING_EXT = 0x8CAA;

    default void glBlitFramebufferEXT(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        throw new ContextException();
    }

}
