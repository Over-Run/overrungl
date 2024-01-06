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
 * {@code GL_EXT_texture3D}
 */
public final class GLEXTTexture3D {
    public static final int GL_PACK_SKIP_IMAGES_EXT = 0x806B;
    public static final int GL_PACK_IMAGE_HEIGHT_EXT = 0x806C;
    public static final int GL_UNPACK_SKIP_IMAGES_EXT = 0x806D;
    public static final int GL_UNPACK_IMAGE_HEIGHT_EXT = 0x806E;
    public static final int GL_TEXTURE_3D_EXT = 0x806F;
    public static final int GL_PROXY_TEXTURE_3D_EXT = 0x8070;
    public static final int GL_TEXTURE_DEPTH_EXT = 0x8071;
    public static final int GL_TEXTURE_WRAP_R_EXT = 0x8072;
    public static final int GL_MAX_3D_TEXTURE_SIZE_EXT = 0x8073;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_texture3D) return;
        ext.glTexImage3DEXT = load.invoke("glTexImage3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTexSubImage3DEXT = load.invoke("glTexSubImage3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glTexImage3DEXT(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexImage3DEXT).invokeExact(target, level, internalformat, width, height, depth, border, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexSubImage3DEXT(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexSubImage3DEXT).invokeExact(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
