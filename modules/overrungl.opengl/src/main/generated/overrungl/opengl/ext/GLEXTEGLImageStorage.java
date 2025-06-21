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
import overrungl.opengl.*;

public final class GLEXTEGLImageStorage {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glEGLImageTargetTexStorageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glEGLImageTargetTextureStorageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glEGLImageTargetTexStorageEXT;
        public final MemorySegment PFN_glEGLImageTargetTextureStorageEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glEGLImageTargetTexStorageEXT = func.invoke("glEGLImageTargetTexStorageEXT");PFN_glEGLImageTargetTextureStorageEXT = func.invoke("glEGLImageTargetTextureStorageEXT");
        }
    }

    public GLEXTEGLImageStorage(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glEGLImageTargetTexStorageEXT((unsigned int) GLenum target, (void*) GLeglImageOES image, const GLint* attrib_list);
    /// ```
    public void EGLImageTargetTexStorageEXT(int target, MemorySegment image, MemorySegment attrib_list) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEGLImageTargetTexStorageEXT)) throw new GLSymbolNotFoundError("Symbol not found: glEGLImageTargetTexStorageEXT");
        try { Handles.MH_glEGLImageTargetTexStorageEXT.invokeExact(handles.PFN_glEGLImageTargetTexStorageEXT, target, image, attrib_list); }
        catch (Throwable e) { throw new RuntimeException("error in EGLImageTargetTexStorageEXT", e); }
    }

    /// ```
    /// void glEGLImageTargetTextureStorageEXT((unsigned int) GLuint texture, (void*) GLeglImageOES image, const GLint* attrib_list);
    /// ```
    public void EGLImageTargetTextureStorageEXT(int texture, MemorySegment image, MemorySegment attrib_list) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEGLImageTargetTextureStorageEXT)) throw new GLSymbolNotFoundError("Symbol not found: glEGLImageTargetTextureStorageEXT");
        try { Handles.MH_glEGLImageTargetTextureStorageEXT.invokeExact(handles.PFN_glEGLImageTargetTextureStorageEXT, texture, image, attrib_list); }
        catch (Throwable e) { throw new RuntimeException("error in EGLImageTargetTextureStorageEXT", e); }
    }

}
