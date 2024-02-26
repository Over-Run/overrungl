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
package overrungl.opengl.ext.sgi;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_SGIS_texture4D}
 */
public interface GLSGISTexture4D extends overrun.marshal.DirectAccess {
    int GL_PACK_SKIP_VOLUMES_SGIS = 0x8130;
    int GL_PACK_IMAGE_DEPTH_SGIS = 0x8131;
    int GL_UNPACK_SKIP_VOLUMES_SGIS = 0x8132;
    int GL_UNPACK_IMAGE_DEPTH_SGIS = 0x8133;
    int GL_TEXTURE_4D_SGIS = 0x8134;
    int GL_PROXY_TEXTURE_4D_SGIS = 0x8135;
    int GL_TEXTURE_4DSIZE_SGIS = 0x8136;
    int GL_TEXTURE_WRAP_Q_SGIS = 0x8137;
    int GL_MAX_4D_TEXTURE_SIZE_SGIS = 0x8138;
    int GL_TEXTURE_4D_BINDING_SGIS = 0x814F;

    default void glTexImage4DSGIS(int target, int level, int internalformat, int width, int height, int depth, int size4d, int border, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        throw new ContextException();
    }

    default void glTexSubImage4DSGIS(int target, int level, int xoffset, int yoffset, int zoffset, int woffset, int width, int height, int depth, int size4d, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        throw new ContextException();
    }

}
