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

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_ARB_texture_buffer_object}
  */
public final class GLARBTextureBufferObject {
    public static final int GL_TEXTURE_BUFFER_ARB = 0x8C2A;
    public static final int GL_MAX_TEXTURE_BUFFER_SIZE_ARB = 0x8C2B;
    public static final int GL_TEXTURE_BINDING_BUFFER_ARB = 0x8C2C;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING_ARB = 0x8C2D;
    public static final int GL_TEXTURE_BUFFER_FORMAT_ARB = 0x8C2E;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_texture_buffer_object) return;
        ext.glTexBufferARB = load.invoke("glTexBufferARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glTexBufferARB(int target, int internalFormat, int buffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexBufferARB).invokeExact(target, internalFormat, buffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
