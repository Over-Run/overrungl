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

public final class GLARBGetTextureSubImage {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetTextureSubImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetCompressedTextureSubImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glGetTextureSubImage;
        public final MemorySegment PFN_glGetCompressedTextureSubImage;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGetTextureSubImage = func.invoke("glGetTextureSubImage");
            PFN_glGetCompressedTextureSubImage = func.invoke("glGetCompressedTextureSubImage");
        }
    }

    public GLARBGetTextureSubImage(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glGetTextureSubImage((unsigned int) GLuint texture, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (unsigned int) GLenum format, (unsigned int) GLenum type, (int) GLsizei bufSize, void* pixels);
    /// ```
    public void GetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureSubImage)) throw new SymbolNotFoundError("Symbol not found: glGetTextureSubImage");
        try { Handles.MH_glGetTextureSubImage.invokeExact(handles.PFN_glGetTextureSubImage, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureSubImage", e); }
    }

    /// ```
    /// void glGetCompressedTextureSubImage((unsigned int) GLuint texture, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (int) GLsizei bufSize, void* pixels);
    /// ```
    public void GetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetCompressedTextureSubImage)) throw new SymbolNotFoundError("Symbol not found: glGetCompressedTextureSubImage");
        try { Handles.MH_glGetCompressedTextureSubImage.invokeExact(handles.PFN_glGetCompressedTextureSubImage, texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in GetCompressedTextureSubImage", e); }
    }

}
