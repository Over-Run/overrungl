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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBTextureStorageMultisample {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glTexStorage2DMultisample = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glTexStorage3DMultisample = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glTexStorage2DMultisample,
            FD_glTexStorage3DMultisample
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glTexStorage2DMultisample = RuntimeHelper.downcall(Descriptors.FD_glTexStorage2DMultisample);
        public static final MethodHandle MH_glTexStorage3DMultisample = RuntimeHelper.downcall(Descriptors.FD_glTexStorage3DMultisample);
        public final MemorySegment PFN_glTexStorage2DMultisample;
        public final MemorySegment PFN_glTexStorage3DMultisample;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTexStorage2DMultisample = func.invoke("glTexStorage2DMultisample");
            PFN_glTexStorage3DMultisample = func.invoke("glTexStorage3DMultisample");
        }
    }

    public GLARBTextureStorageMultisample(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void TexStorage2DMultisample(@CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLboolean") boolean fixedsamplelocations) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexStorage2DMultisample)) throw new SymbolNotFoundError("Symbol not found: glTexStorage2DMultisample");
        try { Handles.MH_glTexStorage2DMultisample.invokeExact(handles.PFN_glTexStorage2DMultisample, target, samples, internalformat, width, height, fixedsamplelocations); }
        catch (Throwable e) { throw new RuntimeException("error in glTexStorage2DMultisample", e); }
    }

    public void TexStorage3DMultisample(@CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean fixedsamplelocations) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexStorage3DMultisample)) throw new SymbolNotFoundError("Symbol not found: glTexStorage3DMultisample");
        try { Handles.MH_glTexStorage3DMultisample.invokeExact(handles.PFN_glTexStorage3DMultisample, target, samples, internalformat, width, height, depth, fixedsamplelocations); }
        catch (Throwable e) { throw new RuntimeException("error in glTexStorage3DMultisample", e); }
    }

}
