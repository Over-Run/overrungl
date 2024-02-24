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
 * {@code GL_NV_occlusion_query}
 */
public interface GLNVOcculusionQuery extends overrun.marshal.DirectAccess {
    int GL_PIXEL_COUNTER_BITS_NV = 0x8864;
    int GL_CURRENT_OCCLUSION_QUERY_ID_NV = 0x8865;
    int GL_PIXEL_COUNT_NV = 0x8866;
    int GL_PIXEL_COUNT_AVAILABLE_NV = 0x8867;

    default void glGenOcclusionQueriesNV(int n, @NativeType("GLuint *") MemorySegment ids) {
        throw new ContextException();
    }

    default void glDeleteOcclusionQueriesNV(int n, @NativeType("const GLuint *") MemorySegment ids) {
        throw new ContextException();
    }

    default boolean glIsOcclusionQueryNV(int id) {
        throw new ContextException();
    }

    default void glBeginOcclusionQueryNV(int id) {
        throw new ContextException();
    }

    default void glEndOcclusionQueryNV() {
        throw new ContextException();
    }

    default void glGetOcclusionQueryivNV(int id, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetOcclusionQueryuivNV(int id, int pname, @NativeType("GLuint *") MemorySegment params) {
        throw new ContextException();
    }

}
