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
 * {@code GL_SGIS_sharpen_texture}
 */
public interface GLSGISSharpenTexture extends overrun.marshal.DirectAccess {
    int GL_LINEAR_SHARPEN_SGIS = 0x80AD;
    int GL_LINEAR_SHARPEN_ALPHA_SGIS = 0x80AE;
    int GL_LINEAR_SHARPEN_COLOR_SGIS = 0x80AF;
    int GL_SHARPEN_TEXTURE_FUNC_POINTS_SGIS = 0x80B0;

    default void glSharpenTexFuncSGIS(int target, int n, @NativeType("const GLfloat *") MemorySegment points) {
        throw new ContextException();
    }

    default void glGetSharpenTexFuncSGIS(int target, @NativeType("GLfloat *") MemorySegment points) {
        throw new ContextException();
    }

}
