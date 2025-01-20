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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTSubtexture {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glTexSubImage1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexSubImage2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glTexSubImage1DEXT = RuntimeHelper.downcall(Descriptors.FD_glTexSubImage1DEXT);
        public static final MethodHandle MH_glTexSubImage2DEXT = RuntimeHelper.downcall(Descriptors.FD_glTexSubImage2DEXT);
        public final MemorySegment PFN_glTexSubImage1DEXT;
        public final MemorySegment PFN_glTexSubImage2DEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTexSubImage1DEXT = func.invoke("glTexSubImage1DEXT", "glTexSubImage1D");
            PFN_glTexSubImage2DEXT = func.invoke("glTexSubImage2DEXT", "glTexSubImage2D");
        }
    }

    public GLEXTSubtexture(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void TexSubImage1DEXT(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexSubImage1DEXT)) throw new SymbolNotFoundError("Symbol not found: glTexSubImage1DEXT");
        try { Handles.MH_glTexSubImage1DEXT.invokeExact(handles.PFN_glTexSubImage1DEXT, target, level, xoffset, width, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTexSubImage1DEXT", e); }
    }

    public void TexSubImage2DEXT(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexSubImage2DEXT)) throw new SymbolNotFoundError("Symbol not found: glTexSubImage2DEXT");
        try { Handles.MH_glTexSubImage2DEXT.invokeExact(handles.PFN_glTexSubImage2DEXT, target, level, xoffset, yoffset, width, height, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTexSubImage2DEXT", e); }
    }

}
