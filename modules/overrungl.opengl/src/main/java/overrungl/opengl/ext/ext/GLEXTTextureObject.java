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
 * {@code GL_EXT_texture_object}
 */
public interface GLEXTTextureObject extends overrun.marshal.DirectAccess {
    int GL_TEXTURE_PRIORITY_EXT = 0x8066;
    int GL_TEXTURE_RESIDENT_EXT = 0x8067;
    int GL_TEXTURE_1D_BINDING_EXT = 0x8068;
    int GL_TEXTURE_2D_BINDING_EXT = 0x8069;
    int GL_TEXTURE_3D_BINDING_EXT = 0x806A;

    default boolean glAreTexturesResidentEXT(int n, @NativeType("const GLuint *") MemorySegment textures, @NativeType("GLboolean *") MemorySegment residences) {
        throw new ContextException();
    }

    default void glBindTextureEXT(int target, int texture) {
        throw new ContextException();
    }

    default void glDeleteTexturesEXT(int n, @NativeType("const GLuint *") MemorySegment textures) {
        throw new ContextException();
    }

    default void glGenTexturesEXT(int n, @NativeType("GLuint *") MemorySegment textures) {
        throw new ContextException();
    }

    default boolean glIsTextureEXT(int texture) {
        throw new ContextException();
    }

    default void glPrioritizeTexturesEXT(int n, @NativeType("const GLuint *") MemorySegment textures, @NativeType("const GLclampf *") MemorySegment priorities) {
        throw new ContextException();
    }

}
