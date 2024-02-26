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
package overrungl.opengl.ext.ibm;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_IBM_multimode_draw_arrays}
 */
public interface GLIBMMultimodeDrawArrays extends overrun.marshal.DirectAccess {

    default void glMultiModeDrawArraysIBM(@NativeType("const GLenum *") MemorySegment mode, @NativeType("const GLint *") MemorySegment first, @NativeType("const GLsizei *") MemorySegment count, int primcount, int modestride) {
        throw new ContextException();
    }

    default void glMultiModeDrawElementsIBM(@NativeType("const GLenum *") MemorySegment mode, @NativeType("const GLsizei *") MemorySegment count, int type, @NativeType("const void *const*") MemorySegment indices, int primcount, int modestride) {
        throw new ContextException();
    }

}
