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
package overrungl.opengl.apple;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAPPLETextureRange {
    public static final int GL_TEXTURE_RANGE_LENGTH_APPLE = 0x85B7;
    public static final int GL_TEXTURE_RANGE_POINTER_APPLE = 0x85B8;
    public static final int GL_TEXTURE_STORAGE_HINT_APPLE = 0x85BC;
    public static final int GL_STORAGE_PRIVATE_APPLE = 0x85BD;
    public static final int GL_STORAGE_CACHED_APPLE = 0x85BE;
    public static final int GL_STORAGE_SHARED_APPLE = 0x85BF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTextureRangeAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTexParameterPointervAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glTextureRangeAPPLE;
        public final MemorySegment PFN_glGetTexParameterPointervAPPLE;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTextureRangeAPPLE = func.invoke("glTextureRangeAPPLE");
            PFN_glGetTexParameterPointervAPPLE = func.invoke("glGetTexParameterPointervAPPLE");
        }
    }

    public GLAPPLETextureRange(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glTextureRangeAPPLE((unsigned int) GLenum target, (int) GLsizei length, const void* pointer);
    /// ```
    public void TextureRangeAPPLE(int target, int length, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureRangeAPPLE)) throw new SymbolNotFoundError("Symbol not found: glTextureRangeAPPLE");
        try { Handles.MH_glTextureRangeAPPLE.invokeExact(handles.PFN_glTextureRangeAPPLE, target, length, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in TextureRangeAPPLE", e); }
    }

    /// ```
    /// void glGetTexParameterPointervAPPLE((unsigned int) GLenum target, (unsigned int) GLenum pname, void** params);
    /// ```
    public void GetTexParameterPointervAPPLE(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTexParameterPointervAPPLE)) throw new SymbolNotFoundError("Symbol not found: glGetTexParameterPointervAPPLE");
        try { Handles.MH_glGetTexParameterPointervAPPLE.invokeExact(handles.PFN_glGetTexParameterPointervAPPLE, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTexParameterPointervAPPLE", e); }
    }

}
