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
 * {@code GL_NV_pixel_data_range}
 */
public interface GLNVPixelDataRange extends overrun.marshal.DirectAccess {
    int GL_WRITE_PIXEL_DATA_RANGE_NV = 0x8878;
    int GL_READ_PIXEL_DATA_RANGE_NV = 0x8879;
    int GL_WRITE_PIXEL_DATA_RANGE_LENGTH_NV = 0x887A;
    int GL_READ_PIXEL_DATA_RANGE_LENGTH_NV = 0x887B;
    int GL_WRITE_PIXEL_DATA_RANGE_POINTER_NV = 0x887C;
    int GL_READ_PIXEL_DATA_RANGE_POINTER_NV = 0x887D;

    default void glPixelDataRangeNV(int target, int length, @NativeType("const void *") MemorySegment pointer) {
        throw new ContextException();
    }

    default void glFlushPixelDataRangeNV(int target) {
        throw new ContextException();
    }

}
