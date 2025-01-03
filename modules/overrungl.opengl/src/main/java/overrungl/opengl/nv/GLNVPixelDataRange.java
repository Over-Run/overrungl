/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVPixelDataRange {
    public static final int GL_WRITE_PIXEL_DATA_RANGE_NV = 0x8878;
    public static final int GL_READ_PIXEL_DATA_RANGE_NV = 0x8879;
    public static final int GL_WRITE_PIXEL_DATA_RANGE_LENGTH_NV = 0x887A;
    public static final int GL_READ_PIXEL_DATA_RANGE_LENGTH_NV = 0x887B;
    public static final int GL_WRITE_PIXEL_DATA_RANGE_POINTER_NV = 0x887C;
    public static final int GL_READ_PIXEL_DATA_RANGE_POINTER_NV = 0x887D;
    public static final MethodHandle MH_glPixelDataRangeNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glPixelDataRangeNV;
    public static final MethodHandle MH_glFlushPixelDataRangeNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFlushPixelDataRangeNV;

    public GLNVPixelDataRange(overrungl.opengl.GLLoadFunc func) {
        PFN_glPixelDataRangeNV = func.invoke("glPixelDataRangeNV");
        PFN_glFlushPixelDataRangeNV = func.invoke("glFlushPixelDataRangeNV");
    }

    public void PixelDataRangeNV(@CType("GLenum") int target, @CType("GLsizei") int length, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        try { if (!Unmarshal.isNullPointer(PFN_glPixelDataRangeNV))
            MH_glPixelDataRangeNV.invokeExact(PFN_glPixelDataRangeNV, target, length, pointer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glPixelDataRangeNV", e); }
    }

    public void FlushPixelDataRangeNV(@CType("GLenum") int target) {
        try { if (!Unmarshal.isNullPointer(PFN_glFlushPixelDataRangeNV))
            MH_glFlushPixelDataRangeNV.invokeExact(PFN_glFlushPixelDataRangeNV, target);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFlushPixelDataRangeNV", e); }
    }

}
