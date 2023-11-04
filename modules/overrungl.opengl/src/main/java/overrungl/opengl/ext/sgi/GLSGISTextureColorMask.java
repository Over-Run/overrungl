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
package overrungl.opengl.ext.sgi;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_SGIS_texture_color_mask}
 */
public final class GLSGISTextureColorMask {
    public static final int GL_TEXTURE_COLOR_WRITEMASK_SGIS = 0x81EF;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SGIS_texture_color_mask) return;
        ext.glTextureColorMaskSGIS = load.invoke("glTextureColorMaskSGIS", ofVoid(JAVA_BYTE, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE));
    }

    public static void glTextureColorMaskSGIS(boolean red, boolean green, boolean blue, boolean alpha) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureColorMaskSGIS).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
