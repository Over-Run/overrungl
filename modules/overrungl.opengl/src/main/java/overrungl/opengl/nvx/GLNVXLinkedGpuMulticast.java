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
package overrungl.opengl.nvx;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVXLinkedGpuMulticast {
    public static final int GL_LGPU_SEPARATE_STORAGE_BIT_NVX = 0x0800;
    public static final int GL_MAX_LGPU_GPUS_NVX = 0x92BA;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glLGPUNamedBufferSubDataNVX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glLGPUCopyImageSubDataNVX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glLGPUInterlockNVX = FunctionDescriptor.ofVoid();
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glLGPUNamedBufferSubDataNVX,
            FD_glLGPUCopyImageSubDataNVX,
            FD_glLGPUInterlockNVX
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glLGPUNamedBufferSubDataNVX = RuntimeHelper.downcall(Descriptors.FD_glLGPUNamedBufferSubDataNVX);
        public static final MethodHandle MH_glLGPUCopyImageSubDataNVX = RuntimeHelper.downcall(Descriptors.FD_glLGPUCopyImageSubDataNVX);
        public static final MethodHandle MH_glLGPUInterlockNVX = RuntimeHelper.downcall(Descriptors.FD_glLGPUInterlockNVX);
        public final MemorySegment PFN_glLGPUNamedBufferSubDataNVX;
        public final MemorySegment PFN_glLGPUCopyImageSubDataNVX;
        public final MemorySegment PFN_glLGPUInterlockNVX;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glLGPUNamedBufferSubDataNVX = func.invoke("glLGPUNamedBufferSubDataNVX");
            PFN_glLGPUCopyImageSubDataNVX = func.invoke("glLGPUCopyImageSubDataNVX");
            PFN_glLGPUInterlockNVX = func.invoke("glLGPUInterlockNVX");
        }
    }

    public GLNVXLinkedGpuMulticast(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void LGPUNamedBufferSubDataNVX(@CType("GLbitfield") int gpuMask, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glLGPUNamedBufferSubDataNVX)) throw new SymbolNotFoundError("Symbol not found: glLGPUNamedBufferSubDataNVX");
        try { Handles.MH_glLGPUNamedBufferSubDataNVX.invokeExact(handles.PFN_glLGPUNamedBufferSubDataNVX, gpuMask, buffer, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in glLGPUNamedBufferSubDataNVX", e); }
    }

    public void LGPUCopyImageSubDataNVX(@CType("GLuint") int sourceGpu, @CType("GLbitfield") int destinationGpuMask, @CType("GLuint") int srcName, @CType("GLenum") int srcTarget, @CType("GLint") int srcLevel, @CType("GLint") int srcX, @CType("GLint") int srxY, @CType("GLint") int srcZ, @CType("GLuint") int dstName, @CType("GLenum") int dstTarget, @CType("GLint") int dstLevel, @CType("GLint") int dstX, @CType("GLint") int dstY, @CType("GLint") int dstZ, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth) {
        if (Unmarshal.isNullPointer(handles.PFN_glLGPUCopyImageSubDataNVX)) throw new SymbolNotFoundError("Symbol not found: glLGPUCopyImageSubDataNVX");
        try { Handles.MH_glLGPUCopyImageSubDataNVX.invokeExact(handles.PFN_glLGPUCopyImageSubDataNVX, sourceGpu, destinationGpuMask, srcName, srcTarget, srcLevel, srcX, srxY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in glLGPUCopyImageSubDataNVX", e); }
    }

    public void LGPUInterlockNVX() {
        if (Unmarshal.isNullPointer(handles.PFN_glLGPUInterlockNVX)) throw new SymbolNotFoundError("Symbol not found: glLGPUInterlockNVX");
        try { Handles.MH_glLGPUInterlockNVX.invokeExact(handles.PFN_glLGPUInterlockNVX); }
        catch (Throwable e) { throw new RuntimeException("error in glLGPUInterlockNVX", e); }
    }

}
