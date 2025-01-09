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

public final class GLEXTEGLImageStorage {
    public static final MethodHandle MH_glEGLImageTargetTexStorageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glEGLImageTargetTextureStorageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glEGLImageTargetTexStorageEXT;
    public final MemorySegment PFN_glEGLImageTargetTextureStorageEXT;

    public GLEXTEGLImageStorage(overrungl.opengl.GLLoadFunc func) {
        PFN_glEGLImageTargetTexStorageEXT = func.invoke("glEGLImageTargetTexStorageEXT");PFN_glEGLImageTargetTextureStorageEXT = func.invoke("glEGLImageTargetTextureStorageEXT");
    }

    public void EGLImageTargetTexStorageEXT(@CType("GLenum") int target, @CType("GLeglImageOES") java.lang.foreign.MemorySegment image, @CType("const GLint *") java.lang.foreign.MemorySegment attrib_list) {
        if (Unmarshal.isNullPointer(PFN_glEGLImageTargetTexStorageEXT)) throw new SymbolNotFoundError("Symbol not found: glEGLImageTargetTexStorageEXT");
        try { MH_glEGLImageTargetTexStorageEXT.invokeExact(PFN_glEGLImageTargetTexStorageEXT, target, image, attrib_list); }
        catch (Throwable e) { throw new RuntimeException("error in glEGLImageTargetTexStorageEXT", e); }
    }

    public void EGLImageTargetTextureStorageEXT(@CType("GLuint") int texture, @CType("GLeglImageOES") java.lang.foreign.MemorySegment image, @CType("const GLint *") java.lang.foreign.MemorySegment attrib_list) {
        if (Unmarshal.isNullPointer(PFN_glEGLImageTargetTextureStorageEXT)) throw new SymbolNotFoundError("Symbol not found: glEGLImageTargetTextureStorageEXT");
        try { MH_glEGLImageTargetTextureStorageEXT.invokeExact(PFN_glEGLImageTargetTextureStorageEXT, texture, image, attrib_list); }
        catch (Throwable e) { throw new RuntimeException("error in glEGLImageTargetTextureStorageEXT", e); }
    }

}
