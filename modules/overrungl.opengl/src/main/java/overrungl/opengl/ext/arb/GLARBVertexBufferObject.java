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
package overrungl.opengl.ext.arb;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_vertex_buffer_object}
 */
public interface GLARBVertexBufferObject {
    int GL_BUFFER_SIZE_ARB = 0x8764;
    int GL_BUFFER_USAGE_ARB = 0x8765;
    int GL_ARRAY_BUFFER_ARB = 0x8892;
    int GL_ELEMENT_ARRAY_BUFFER_ARB = 0x8893;
    int GL_ARRAY_BUFFER_BINDING_ARB = 0x8894;
    int GL_ELEMENT_ARRAY_BUFFER_BINDING_ARB = 0x8895;
    int GL_VERTEX_ARRAY_BUFFER_BINDING_ARB = 0x8896;
    int GL_NORMAL_ARRAY_BUFFER_BINDING_ARB = 0x8897;
    int GL_COLOR_ARRAY_BUFFER_BINDING_ARB = 0x8898;
    int GL_INDEX_ARRAY_BUFFER_BINDING_ARB = 0x8899;
    int GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING_ARB = 0x889A;
    int GL_EDGE_FLAG_ARRAY_BUFFER_BINDING_ARB = 0x889B;
    int GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING_ARB = 0x889C;
    int GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING_ARB = 0x889D;
    int GL_WEIGHT_ARRAY_BUFFER_BINDING_ARB = 0x889E;
    int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING_ARB = 0x889F;
    int GL_READ_ONLY_ARB = 0x88B8;
    int GL_WRITE_ONLY_ARB = 0x88B9;
    int GL_READ_WRITE_ARB = 0x88BA;
    int GL_BUFFER_ACCESS_ARB = 0x88BB;
    int GL_BUFFER_MAPPED_ARB = 0x88BC;
    int GL_BUFFER_MAP_POINTER_ARB = 0x88BD;
    int GL_STREAM_DRAW_ARB = 0x88E0;
    int GL_STREAM_READ_ARB = 0x88E1;
    int GL_STREAM_COPY_ARB = 0x88E2;
    int GL_STATIC_DRAW_ARB = 0x88E4;
    int GL_STATIC_READ_ARB = 0x88E5;
    int GL_STATIC_COPY_ARB = 0x88E6;
    int GL_DYNAMIC_DRAW_ARB = 0x88E8;
    int GL_DYNAMIC_READ_ARB = 0x88E9;
    int GL_DYNAMIC_COPY_ARB = 0x88EA;

    default void glBindBufferARB(int target, int buffer) {
        throw new ContextException();
    }

    default void glDeleteBuffersARB(int n, @NativeType("const GLuint*") MemorySegment buffers) {
        throw new ContextException();
    }

    default void glGenBuffersARB(int n, @NativeType("GLuint*") MemorySegment buffers) {
        throw new ContextException();
    }

    default boolean glIsBufferARB(int buffer) {
        throw new ContextException();
    }

    default void glBufferDataARB(int target, long size, @NativeType("const void*") MemorySegment data, int usage) {
        throw new ContextException();
    }

    default void glBufferSubDataARB(int target, long offset, long size, @NativeType("const void*") MemorySegment data) {
        throw new ContextException();
    }

    default void glGetBufferSubDataARB(int target, long offset, long size, @NativeType("void*") MemorySegment data) {
        throw new ContextException();
    }

    @NativeType("void*") default MemorySegment glMapBufferARB(int target, int access) {
        throw new ContextException();
    }

    default boolean glUnmapBufferARB(int target) {
        throw new ContextException();
    }

    default void glGetBufferParameterivARB(int target, int pname, @NativeType("GLint*") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetBufferPointervARB(int target, int pname, @NativeType("void**") MemorySegment params) {
        throw new ContextException();
    }

}
