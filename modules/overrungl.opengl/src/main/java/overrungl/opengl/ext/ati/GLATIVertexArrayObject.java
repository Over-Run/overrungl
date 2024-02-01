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
package overrungl.opengl.ext.ati;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ATI_vertex_array_object}
 */
public interface GLATIVertexArrayObject {
    int GL_STATIC_ATI = 0x8760;
    int GL_DYNAMIC_ATI = 0x8761;
    int GL_PRESERVE_ATI = 0x8762;
    int GL_DISCARD_ATI = 0x8763;
    int GL_OBJECT_BUFFER_SIZE_ATI = 0x8764;
    int GL_OBJECT_BUFFER_USAGE_ATI = 0x8765;
    int GL_ARRAY_OBJECT_BUFFER_ATI = 0x8766;
    int GL_ARRAY_OBJECT_OFFSET_ATI = 0x8767;

    default int glNewObjectBufferATI(int size, @NativeType("const void *") MemorySegment pointer, int usage) {
        throw new ContextException();
    }

    default boolean glIsObjectBufferATI(int buffer) {
        throw new ContextException();
    }

    default void glUpdateObjectBufferATI(int buffer, int offset, int size, @NativeType("const void *") MemorySegment pointer, int preserve) {
        throw new ContextException();
    }

    default void glGetObjectBufferfvATI(int buffer, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetObjectBufferivATI(int buffer, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glFreeObjectBufferATI(int buffer) {
        throw new ContextException();
    }

    default void glArrayObjectATI(int array, int size, int type, int stride, int buffer, int offset) {
        throw new ContextException();
    }

    default void glGetArrayObjectfvATI(int array, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetArrayObjectivATI(int array, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glVariantArrayObjectATI(int id, int type, int stride, int buffer, int offset) {
        throw new ContextException();
    }

    default void glGetVariantArrayObjectfvATI(int id, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetVariantArrayObjectivATI(int id, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

}
