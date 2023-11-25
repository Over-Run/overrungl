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
package overrungl.opengl.ext.nv;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NV_pixel_data_range}
 */
public final class GLNVPixelDataRange {
    public static final int GL_WRITE_PIXEL_DATA_RANGE_NV = 0x8878;
    public static final int GL_READ_PIXEL_DATA_RANGE_NV = 0x8879;
    public static final int GL_WRITE_PIXEL_DATA_RANGE_LENGTH_NV = 0x887A;
    public static final int GL_READ_PIXEL_DATA_RANGE_LENGTH_NV = 0x887B;
    public static final int GL_WRITE_PIXEL_DATA_RANGE_POINTER_NV = 0x887C;
    public static final int GL_READ_PIXEL_DATA_RANGE_POINTER_NV = 0x887D;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_pixel_data_range) return;
        ext.glPixelDataRangeNV = load.invoke("glPixelDataRangeNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glFlushPixelDataRangeNV = load.invoke("glFlushPixelDataRangeNV", ofVoid(JAVA_INT));
    }

    public static void glPixelDataRangeNV(int target, int length, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPixelDataRangeNV).invokeExact(target, length, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFlushPixelDataRangeNV(int target) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFlushPixelDataRangeNV).invokeExact(target);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
