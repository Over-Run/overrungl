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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTTextureBufferObject {
    public static final int GL_TEXTURE_BUFFER_EXT = 0x8C2A;
    public static final int GL_MAX_TEXTURE_BUFFER_SIZE_EXT = 0x8C2B;
    public static final int GL_TEXTURE_BINDING_BUFFER_EXT = 0x8C2C;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING_EXT = 0x8C2D;
    public static final int GL_TEXTURE_BUFFER_FORMAT_EXT = 0x8C2E;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTexBufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glTexBufferEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTexBufferEXT = func.invoke("glTexBufferEXT", "glTexBuffer");
        }
    }

    public GLEXTTextureBufferObject(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glTexBufferEXT(unsigned int target, unsigned int internalformat, unsigned int buffer);
    /// ```
    public void TexBufferEXT(int target, int internalformat, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexBufferEXT)) throw new SymbolNotFoundError("Symbol not found: glTexBufferEXT");
        try { Handles.MH_glTexBufferEXT.invokeExact(handles.PFN_glTexBufferEXT, target, internalformat, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in TexBufferEXT", e); }
    }

}
