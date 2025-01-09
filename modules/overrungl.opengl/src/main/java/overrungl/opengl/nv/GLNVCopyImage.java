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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVCopyImage {
    public static final MethodHandle MH_glCopyImageSubDataNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCopyImageSubDataNV;

    public GLNVCopyImage(overrungl.opengl.GLLoadFunc func) {
        PFN_glCopyImageSubDataNV = func.invoke("glCopyImageSubDataNV");
    }

    public void CopyImageSubDataNV(@CType("GLuint") int srcName, @CType("GLenum") int srcTarget, @CType("GLint") int srcLevel, @CType("GLint") int srcX, @CType("GLint") int srcY, @CType("GLint") int srcZ, @CType("GLuint") int dstName, @CType("GLenum") int dstTarget, @CType("GLint") int dstLevel, @CType("GLint") int dstX, @CType("GLint") int dstY, @CType("GLint") int dstZ, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth) {
        if (Unmarshal.isNullPointer(PFN_glCopyImageSubDataNV)) throw new SymbolNotFoundError("Symbol not found: glCopyImageSubDataNV");
        try { MH_glCopyImageSubDataNV.invokeExact(PFN_glCopyImageSubDataNV, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyImageSubDataNV", e); }
    }

}
