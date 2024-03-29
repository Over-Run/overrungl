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
package overrungl.opengl.ext.intel;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_INTEL_parallel_arrays}
 */
public interface GLINTELParallelArrays extends overrun.marshal.DirectAccess {
    int GL_PARALLEL_ARRAYS_INTEL = 0x83F4;
    int GL_VERTEX_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F5;
    int GL_NORMAL_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F6;
    int GL_COLOR_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F7;
    int GL_TEXTURE_COORD_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F8;

    default void glVertexPointervINTEL(int size, int type, @NativeType("const void **") MemorySegment pointer) {
        throw new ContextException();
    }

    default void glNormalPointervINTEL(int type, @NativeType("const void **") MemorySegment pointer) {
        throw new ContextException();
    }

    default void glColorPointervINTEL(int size, int type, @NativeType("const void **") MemorySegment pointer) {
        throw new ContextException();
    }

    default void glTexCoordPointervINTEL(int size, int type, @NativeType("const void **") MemorySegment pointer) {
        throw new ContextException();
    }

}
