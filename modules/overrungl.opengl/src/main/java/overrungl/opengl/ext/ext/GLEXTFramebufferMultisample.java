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
 * {@code GL_EXT_framebuffer_multisample}
 */
public interface GLEXTFramebufferMultisample {
    int GL_RENDERBUFFER_SAMPLES_EXT = 0x8CAB;
    int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_EXT = 0x8D56;
    int GL_MAX_SAMPLES_EXT = 0x8D57;

    default void glRenderbufferStorageMultisampleEXT(int target, int samples, int internalformat, int width, int height) {
        throw new ContextException();
    }

}
