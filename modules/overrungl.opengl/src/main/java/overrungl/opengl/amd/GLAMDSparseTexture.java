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
package overrungl.opengl.amd;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAMDSparseTexture {
    public static final int GL_VIRTUAL_PAGE_SIZE_X_AMD = 0x9195;
    public static final int GL_VIRTUAL_PAGE_SIZE_Y_AMD = 0x9196;
    public static final int GL_VIRTUAL_PAGE_SIZE_Z_AMD = 0x9197;
    public static final int GL_MAX_SPARSE_TEXTURE_SIZE_AMD = 0x9198;
    public static final int GL_MAX_SPARSE_3D_TEXTURE_SIZE_AMD = 0x9199;
    public static final int GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS = 0x919A;
    public static final int GL_MIN_SPARSE_LEVEL_AMD = 0x919B;
    public static final int GL_MIN_LOD_WARNING_AMD = 0x919C;
    public static final int GL_TEXTURE_STORAGE_SPARSE_BIT_AMD = 0x00000001;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTexStorageSparseAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureStorageSparseAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glTexStorageSparseAMD;
        public final MemorySegment PFN_glTextureStorageSparseAMD;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTexStorageSparseAMD = func.invoke("glTexStorageSparseAMD");
            PFN_glTextureStorageSparseAMD = func.invoke("glTextureStorageSparseAMD");
        }
    }

    public GLAMDSparseTexture(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glTexStorageSparseAMD(GLenum target, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLsizei layers, GLbitfield flags);
    /// ```
    public void TexStorageSparseAMD(int target, int internalFormat, int width, int height, int depth, int layers, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorageSparseAMD)) throw new SymbolNotFoundError("Symbol not found: glTexStorageSparseAMD");
        try { Handles.MH_glTexStorageSparseAMD.invokeExact(handles.PFN_glTexStorageSparseAMD, target, internalFormat, width, height, depth, layers, flags); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorageSparseAMD", e); }
    }

    /// ```
    /// void glTextureStorageSparseAMD(GLuint texture, GLenum target, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLsizei layers, GLbitfield flags);
    /// ```
    public void TextureStorageSparseAMD(int texture, int target, int internalFormat, int width, int height, int depth, int layers, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorageSparseAMD)) throw new SymbolNotFoundError("Symbol not found: glTextureStorageSparseAMD");
        try { Handles.MH_glTextureStorageSparseAMD.invokeExact(handles.PFN_glTextureStorageSparseAMD, texture, target, internalFormat, width, height, depth, layers, flags); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorageSparseAMD", e); }
    }

}
