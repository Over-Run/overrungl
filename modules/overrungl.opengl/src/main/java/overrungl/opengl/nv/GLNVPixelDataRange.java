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
import java.util.*;
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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glPixelDataRangeNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glFlushPixelDataRangeNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glPixelDataRangeNV,
            FD_glFlushPixelDataRangeNV
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glPixelDataRangeNV = RuntimeHelper.downcall(Descriptors.FD_glPixelDataRangeNV);
        public static final MethodHandle MH_glFlushPixelDataRangeNV = RuntimeHelper.downcall(Descriptors.FD_glFlushPixelDataRangeNV);
        public final MemorySegment PFN_glPixelDataRangeNV;
        public final MemorySegment PFN_glFlushPixelDataRangeNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glPixelDataRangeNV = func.invoke("glPixelDataRangeNV");
            PFN_glFlushPixelDataRangeNV = func.invoke("glFlushPixelDataRangeNV");
        }
    }

    public GLNVPixelDataRange(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void PixelDataRangeNV(@CType("GLenum") int target, @CType("GLsizei") int length, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glPixelDataRangeNV)) throw new SymbolNotFoundError("Symbol not found: glPixelDataRangeNV");
        try { Handles.MH_glPixelDataRangeNV.invokeExact(handles.PFN_glPixelDataRangeNV, target, length, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelDataRangeNV", e); }
    }

    public void FlushPixelDataRangeNV(@CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(handles.PFN_glFlushPixelDataRangeNV)) throw new SymbolNotFoundError("Symbol not found: glFlushPixelDataRangeNV");
        try { Handles.MH_glFlushPixelDataRangeNV.invokeExact(handles.PFN_glFlushPixelDataRangeNV, target); }
        catch (Throwable e) { throw new RuntimeException("error in glFlushPixelDataRangeNV", e); }
    }

}
