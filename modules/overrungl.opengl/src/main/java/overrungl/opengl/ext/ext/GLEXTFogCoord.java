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
 * {@code GL_EXT_fog_coord}
 */
public interface GLEXTFogCoord extends overrun.marshal.DirectAccess {
    int GL_FOG_COORDINATE_SOURCE_EXT = 0x8450;
    int GL_FOG_COORDINATE_EXT = 0x8451;
    int GL_FRAGMENT_DEPTH_EXT = 0x8452;
    int GL_CURRENT_FOG_COORDINATE_EXT = 0x8453;
    int GL_FOG_COORDINATE_ARRAY_TYPE_EXT = 0x8454;
    int GL_FOG_COORDINATE_ARRAY_STRIDE_EXT = 0x8455;
    int GL_FOG_COORDINATE_ARRAY_POINTER_EXT = 0x8456;
    int GL_FOG_COORDINATE_ARRAY_EXT = 0x8457;

    default void glFogCoordfEXT(float coord) {
        throw new ContextException();
    }

    default void glFogCoordfvEXT(@NativeType("const GLfloat *") MemorySegment coord) {
        throw new ContextException();
    }

    default void glFogCoorddEXT(double coord) {
        throw new ContextException();
    }

    default void glFogCoorddvEXT(@NativeType("const GLdouble *") MemorySegment coord) {
        throw new ContextException();
    }

    default void glFogCoordPointerEXT(int type, int stride, @NativeType("const void *") MemorySegment pointer) {
        throw new ContextException();
    }

}
