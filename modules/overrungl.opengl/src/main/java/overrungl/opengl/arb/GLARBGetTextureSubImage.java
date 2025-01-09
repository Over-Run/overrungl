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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBGetTextureSubImage {
    public static final MethodHandle MH_glGetTextureSubImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetCompressedTextureSubImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTextureSubImage;
    public final MemorySegment PFN_glGetCompressedTextureSubImage;

    public GLARBGetTextureSubImage(overrungl.opengl.GLLoadFunc func) {
        PFN_glGetTextureSubImage = func.invoke("glGetTextureSubImage");
        PFN_glGetCompressedTextureSubImage = func.invoke("glGetCompressedTextureSubImage");
    }

    public void GetTextureSubImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(PFN_glGetTextureSubImage)) throw new SymbolNotFoundError("Symbol not found: glGetTextureSubImage");
        try { MH_glGetTextureSubImage.invokeExact(PFN_glGetTextureSubImage, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureSubImage", e); }
    }

    public void GetCompressedTextureSubImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(PFN_glGetCompressedTextureSubImage)) throw new SymbolNotFoundError("Symbol not found: glGetCompressedTextureSubImage");
        try { MH_glGetCompressedTextureSubImage.invokeExact(PFN_glGetCompressedTextureSubImage, texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glGetCompressedTextureSubImage", e); }
    }

}
