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
 * {@code GL_SGIS_pixel_texture}
 */
public interface GLSGISPixelTexture {
    int GL_PIXEL_TEXTURE_SGIS = 0x8353;
    int GL_PIXEL_FRAGMENT_RGB_SOURCE_SGIS = 0x8354;
    int GL_PIXEL_FRAGMENT_ALPHA_SOURCE_SGIS = 0x8355;
    int GL_PIXEL_GROUP_COLOR_SGIS = 0x8356;

    default void glPixelTexGenParameteriSGIS(int pname, int param) {
        throw new ContextException();
    }

    default void glPixelTexGenParameterivSGIS(int pname, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glPixelTexGenParameterfSGIS(int pname, float param) {
        throw new ContextException();
    }

    default void glPixelTexGenParameterfvSGIS(int pname, @NativeType("const GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetPixelTexGenParameterivSGIS(int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetPixelTexGenParameterfvSGIS(int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

}
