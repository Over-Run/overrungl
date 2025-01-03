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

public final class GLARBTextureStorage {
    public static final int GL_TEXTURE_IMMUTABLE_FORMAT = 0x912F;
    public static final MethodHandle MH_glTexStorage1D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTexStorage1D;
    public static final MethodHandle MH_glTexStorage2D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTexStorage2D;
    public static final MethodHandle MH_glTexStorage3D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTexStorage3D;

    public GLARBTextureStorage(overrungl.opengl.GLLoadFunc func) {
        PFN_glTexStorage1D = func.invoke("glTexStorage1D");
        PFN_glTexStorage2D = func.invoke("glTexStorage2D");
        PFN_glTexStorage3D = func.invoke("glTexStorage3D");
    }

    public void TexStorage1D(@CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexStorage1D))
            MH_glTexStorage1D.invokeExact(PFN_glTexStorage1D, target, levels, internalformat, width);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexStorage1D", e); }
    }

    public void TexStorage2D(@CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexStorage2D))
            MH_glTexStorage2D.invokeExact(PFN_glTexStorage2D, target, levels, internalformat, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexStorage2D", e); }
    }

    public void TexStorage3D(@CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexStorage3D))
            MH_glTexStorage3D.invokeExact(PFN_glTexStorage3D, target, levels, internalformat, width, height, depth);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexStorage3D", e); }
    }

}
