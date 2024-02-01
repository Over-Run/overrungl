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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_SGIX_sprite}
 */
public interface GLSGIXSprite {
    int GL_SPRITE_SGIX = 0x8148;
    int GL_SPRITE_MODE_SGIX = 0x8149;
    int GL_SPRITE_AXIS_SGIX = 0x814A;
    int GL_SPRITE_TRANSLATION_SGIX = 0x814B;
    int GL_SPRITE_AXIAL_SGIX = 0x814C;
    int GL_SPRITE_OBJECT_ALIGNED_SGIX = 0x814D;
    int GL_SPRITE_EYE_ALIGNED_SGIX = 0x814E;

    void glSpriteParameterfSGIX(int pname, float param);
    void glSpriteParameterfvSGIX(int pname, @NativeType("const GLfloat *") MemorySegment params);
    void glSpriteParameteriSGIX(int pname, int param);
    void glSpriteParameterivSGIX(int pname, @NativeType("const GLint *") MemorySegment params);
}
