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
 * {@code GL_EXT_EGL_image_storage}
 */
public interface GLEXTEGLImageStorage extends overrun.marshal.DirectAccess {

    default void glEGLImageTargetTexStorageEXT(int target, @NativeType("GLeglImageOES") MemorySegment image, @NativeType("const GLint*") MemorySegment attrib_list) {
        throw new ContextException();
    }

    default void glEGLImageTargetTextureStorageEXT(int texture, @NativeType("GLeglImageOES") MemorySegment image, @NativeType("const GLint*") MemorySegment attrib_list) {
        throw new ContextException();
    }

}
