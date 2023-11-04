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
  * {@code GL_SGIS_texture4D}
  */
public final class GLSGISTexture4D {
    public static final int GL_PACK_SKIP_VOLUMES_SGIS = 0x8130;
    public static final int GL_PACK_IMAGE_DEPTH_SGIS = 0x8131;
    public static final int GL_UNPACK_SKIP_VOLUMES_SGIS = 0x8132;
    public static final int GL_UNPACK_IMAGE_DEPTH_SGIS = 0x8133;
    public static final int GL_TEXTURE_4D_SGIS = 0x8134;
    public static final int GL_PROXY_TEXTURE_4D_SGIS = 0x8135;
    public static final int GL_TEXTURE_4DSIZE_SGIS = 0x8136;
    public static final int GL_TEXTURE_WRAP_Q_SGIS = 0x8137;
    public static final int GL_MAX_4D_TEXTURE_SIZE_SGIS = 0x8138;
    public static final int GL_TEXTURE_4D_BINDING_SGIS = 0x814F;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SGIS_texture4D) return;
        ext.glTexImage4DSGIS = load.invoke("glTexImage4DSGIS", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTexSubImage4DSGIS = load.invoke("glTexSubImage4DSGIS", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glTexImage4DSGIS(int target, int level, int internalformat, int width, int height, int depth, int size4d, int border, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexImage4DSGIS).invokeExact(target, level, internalformat, width, height, depth, size4d, border, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexSubImage4DSGIS(int target, int level, int xoffset, int yoffset, int zoffset, int woffset, int width, int height, int depth, int size4d, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexSubImage4DSGIS).invokeExact(target, level, xoffset, yoffset, zoffset, woffset, width, height, depth, size4d, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
