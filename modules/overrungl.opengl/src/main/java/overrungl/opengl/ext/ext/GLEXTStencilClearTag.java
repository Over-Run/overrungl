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
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_EXT_stencil_clear_tag}
 */
public final class GLEXTStencilClearTag {
    public static final int GL_STENCIL_TAG_BITS_EXT = 0x88F2;
    public static final int GL_STENCIL_CLEAR_TAG_VALUE_EXT = 0x88F3;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_stencil_clear_tag) return;
        ext.glStencilClearTagEXT = load.invoke("glStencilClearTagEXT", ofVoid(JAVA_INT, JAVA_INT));
    }

    public static void glStencilClearTagEXT(int stencilTagBits, int stencilClearTag) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glStencilClearTagEXT).invokeExact(stencilTagBits, stencilClearTag);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
