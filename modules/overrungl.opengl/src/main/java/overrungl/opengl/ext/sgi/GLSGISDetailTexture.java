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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_SGIS_detail_texture}
 */
public interface GLSGISDetailTexture {
    int GL_DETAIL_TEXTURE_2D_SGIS = 0x8095;
    int GL_DETAIL_TEXTURE_2D_BINDING_SGIS = 0x8096;
    int GL_LINEAR_DETAIL_SGIS = 0x8097;
    int GL_LINEAR_DETAIL_ALPHA_SGIS = 0x8098;
    int GL_LINEAR_DETAIL_COLOR_SGIS = 0x8099;
    int GL_DETAIL_TEXTURE_LEVEL_SGIS = 0x809A;
    int GL_DETAIL_TEXTURE_MODE_SGIS = 0x809B;
    int GL_DETAIL_TEXTURE_FUNC_POINTS_SGIS = 0x809C;

    default void glDetailTexFuncSGIS(int target, int n, @NativeType("const GLfloat *") MemorySegment points) {
        throw new ContextException();
    }

    default void glGetDetailTexFuncSGIS(int target, @NativeType("GLfloat *") MemorySegment points) {
        throw new ContextException();
    }

}
