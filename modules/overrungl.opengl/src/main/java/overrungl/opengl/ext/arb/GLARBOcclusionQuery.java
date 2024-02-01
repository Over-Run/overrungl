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
 * {@code GL_ARB_occlusion_query}
 */
public interface GLARBOcclusionQuery {
    int GL_QUERY_COUNTER_BITS_ARB = 0x8864;
    int GL_CURRENT_QUERY_ARB = 0x8865;
    int GL_QUERY_RESULT_ARB = 0x8866;
    int GL_QUERY_RESULT_AVAILABLE_ARB = 0x8867;
    int GL_SAMPLES_PASSED_ARB = 0x8914;

    default void glGenQueriesARB(int n, @NativeType("GLuint *") MemorySegment ids) {
        throw new ContextException();
    }

    default void glDeleteQueriesARB(int n, @NativeType("const GLuint *") MemorySegment ids) {
        throw new ContextException();
    }

    default boolean glIsQueryARB(int id) {
        throw new ContextException();
    }

    default void glBeginQueryARB(int target, int id) {
        throw new ContextException();
    }

    default void glEndQueryARB(int target) {
        throw new ContextException();
    }

    default void glGetQueryivARB(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetQueryObjectivARB(int id, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetQueryObjectuivARB(int id, int pname, @NativeType("GLuint *") MemorySegment params) {
        throw new ContextException();
    }

}
