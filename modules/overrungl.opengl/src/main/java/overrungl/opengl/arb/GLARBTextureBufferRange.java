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

public final class GLARBTextureBufferRange {
    public static final int GL_TEXTURE_BUFFER_OFFSET = 0x919D;
    public static final int GL_TEXTURE_BUFFER_SIZE = 0x919E;
    public static final int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT = 0x919F;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glTexBufferRange = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glTexBufferRange
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glTexBufferRange = RuntimeHelper.downcall(Descriptors.FD_glTexBufferRange);
        public final MemorySegment PFN_glTexBufferRange;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTexBufferRange = func.invoke("glTexBufferRange");
        }
    }

    public GLARBTextureBufferRange(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void TexBufferRange(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexBufferRange)) throw new SymbolNotFoundError("Symbol not found: glTexBufferRange");
        try { Handles.MH_glTexBufferRange.invokeExact(handles.PFN_glTexBufferRange, target, internalformat, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in glTexBufferRange", e); }
    }

}
