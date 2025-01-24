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

public final class GLARBTextureBufferRange {
    public static final int GL_TEXTURE_BUFFER_OFFSET = 0x919D;
    public static final int GL_TEXTURE_BUFFER_SIZE = 0x919E;
    public static final int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT = 0x919F;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTexBufferRange = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public final MemorySegment PFN_glTexBufferRange;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTexBufferRange = func.invoke("glTexBufferRange");
        }
    }

    public GLARBTextureBufferRange(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glTexBufferRange(unsigned int target, unsigned int internalformat, unsigned int buffer, signed long long offset, signed long long size);
    /// ```
    public void TexBufferRange(int target, int internalformat, int buffer, long offset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexBufferRange)) throw new SymbolNotFoundError("Symbol not found: glTexBufferRange");
        try { Handles.MH_glTexBufferRange.invokeExact(handles.PFN_glTexBufferRange, target, internalformat, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in TexBufferRange", e); }
    }

}
