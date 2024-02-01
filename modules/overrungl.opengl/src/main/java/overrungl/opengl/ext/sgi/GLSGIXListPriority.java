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
 * {@code GL_SGIX_list_priority}
 */
public interface GLSGIXListPriority {
    int GL_LIST_PRIORITY_SGIX = 0x8182;

    default void glGetListParameterfvSGIX(int list, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetListParameterivSGIX(int list, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glListParameterfSGIX(int list, int pname, float param) {
        throw new ContextException();
    }

    default void glListParameterfvSGIX(int list, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glListParameteriSGIX(int list, int pname, int param) {
        throw new ContextException();
    }

    default void glListParameterivSGIX(int list, int pname, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

}
