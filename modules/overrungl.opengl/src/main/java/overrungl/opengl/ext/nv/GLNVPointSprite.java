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
package overrungl.opengl.ext.nv;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_point_sprite}
 */
public interface GLNVPointSprite extends overrun.marshal.DirectAccess {
    int GL_POINT_SPRITE_NV = 0x8861;
    int GL_COORD_REPLACE_NV = 0x8862;
    int GL_POINT_SPRITE_R_MODE_NV = 0x8863;

    default void glPointParameteriNV(int pname, int param) {
        throw new ContextException();
    }

    default void glPointParameterivNV(int pname, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

}
