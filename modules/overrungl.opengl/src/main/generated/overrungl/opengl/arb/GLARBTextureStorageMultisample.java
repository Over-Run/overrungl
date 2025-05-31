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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBTextureStorageMultisample {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTexStorage2DMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTexStorage3DMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
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

    /// ```
    /// void glTexStorage2DMultisample((unsigned int) GLenum target, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, GLboolean fixedsamplelocations);
    /// ```
    public void TexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorage2DMultisample)) throw new SymbolNotFoundError("Symbol not found: glTexStorage2DMultisample");
        try { Handles.MH_glTexStorage2DMultisample.invokeExact(handles.PFN_glTexStorage2DMultisample, target, samples, internalformat, width, height, ((fixedsamplelocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorage2DMultisample", e); }
    }

    /// ```
    /// void glTexStorage3DMultisample((unsigned int) GLenum target, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, GLboolean fixedsamplelocations);
    /// ```
    public void TexStorage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorage3DMultisample)) throw new SymbolNotFoundError("Symbol not found: glTexStorage3DMultisample");
        try { Handles.MH_glTexStorage3DMultisample.invokeExact(handles.PFN_glTexStorage3DMultisample, target, samples, internalformat, width, height, depth, ((fixedsamplelocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorage3DMultisample", e); }
    }

}
