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

public final class GLEXTTextureStorage {
    public static final int GL_TEXTURE_IMMUTABLE_FORMAT_EXT = 0x912F;
    public static final int GL_ALPHA8_EXT = 0x803C;
    public static final int GL_LUMINANCE8_EXT = 0x8040;
    public static final int GL_LUMINANCE8_ALPHA8_EXT = 0x8045;
    public static final int GL_RGBA32F_EXT = 0x8814;
    public static final int GL_RGB32F_EXT = 0x8815;
    public static final int GL_ALPHA32F_EXT = 0x8816;
    public static final int GL_LUMINANCE32F_EXT = 0x8818;
    public static final int GL_LUMINANCE_ALPHA32F_EXT = 0x8819;
    public static final int GL_RGBA16F_EXT = 0x881A;
    public static final int GL_RGB16F_EXT = 0x881B;
    public static final int GL_ALPHA16F_EXT = 0x881C;
    public static final int GL_LUMINANCE16F_EXT = 0x881E;
    public static final int GL_LUMINANCE_ALPHA16F_EXT = 0x881F;
    public static final int GL_RGB10_A2_EXT = 0x8059;
    public static final int GL_RGB10_EXT = 0x8052;
    public static final int GL_BGRA8_EXT = 0x93A1;
    public static final int GL_R8_EXT = 0x8229;
    public static final int GL_RG8_EXT = 0x822B;
    public static final int GL_R32F_EXT = 0x822E;
    public static final int GL_RG32F_EXT = 0x8230;
    public static final int GL_R16F_EXT = 0x822D;
    public static final int GL_RG16F_EXT = 0x822F;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glTexStorage1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTexStorage2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTexStorage3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTextureStorage1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTextureStorage2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTextureStorage3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glTexStorage1DEXT = RuntimeHelper.downcall(Descriptors.FD_glTexStorage1DEXT);
        public static final MethodHandle MH_glTexStorage2DEXT = RuntimeHelper.downcall(Descriptors.FD_glTexStorage2DEXT);
        public static final MethodHandle MH_glTexStorage3DEXT = RuntimeHelper.downcall(Descriptors.FD_glTexStorage3DEXT);
        public static final MethodHandle MH_glTextureStorage1DEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureStorage1DEXT);
        public static final MethodHandle MH_glTextureStorage2DEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureStorage2DEXT);
        public static final MethodHandle MH_glTextureStorage3DEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureStorage3DEXT);
        public final MemorySegment PFN_glTexStorage1DEXT;
        public final MemorySegment PFN_glTexStorage2DEXT;
        public final MemorySegment PFN_glTexStorage3DEXT;
        public final MemorySegment PFN_glTextureStorage1DEXT;
        public final MemorySegment PFN_glTextureStorage2DEXT;
        public final MemorySegment PFN_glTextureStorage3DEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTexStorage1DEXT = func.invoke("glTexStorage1DEXT", "glTexStorage1D");
            PFN_glTexStorage2DEXT = func.invoke("glTexStorage2DEXT", "glTexStorage2D");
            PFN_glTexStorage3DEXT = func.invoke("glTexStorage3DEXT", "glTexStorage3D");PFN_glTextureStorage1DEXT = func.invoke("glTextureStorage1DEXT");
            PFN_glTextureStorage2DEXT = func.invoke("glTextureStorage2DEXT");
            PFN_glTextureStorage3DEXT = func.invoke("glTextureStorage3DEXT");
        }
    }

    public GLEXTTextureStorage(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void TexStorage1DEXT(@CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexStorage1DEXT)) throw new SymbolNotFoundError("Symbol not found: glTexStorage1DEXT");
        try { Handles.MH_glTexStorage1DEXT.invokeExact(handles.PFN_glTexStorage1DEXT, target, levels, internalformat, width); }
        catch (Throwable e) { throw new RuntimeException("error in glTexStorage1DEXT", e); }
    }

    public void TexStorage2DEXT(@CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexStorage2DEXT)) throw new SymbolNotFoundError("Symbol not found: glTexStorage2DEXT");
        try { Handles.MH_glTexStorage2DEXT.invokeExact(handles.PFN_glTexStorage2DEXT, target, levels, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glTexStorage2DEXT", e); }
    }

    public void TexStorage3DEXT(@CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexStorage3DEXT)) throw new SymbolNotFoundError("Symbol not found: glTexStorage3DEXT");
        try { Handles.MH_glTexStorage3DEXT.invokeExact(handles.PFN_glTexStorage3DEXT, target, levels, internalformat, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in glTexStorage3DEXT", e); }
    }

    public void TextureStorage1DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureStorage1DEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureStorage1DEXT");
        try { Handles.MH_glTextureStorage1DEXT.invokeExact(handles.PFN_glTextureStorage1DEXT, texture, target, levels, internalformat, width); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage1DEXT", e); }
    }

    public void TextureStorage2DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureStorage2DEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureStorage2DEXT");
        try { Handles.MH_glTextureStorage2DEXT.invokeExact(handles.PFN_glTextureStorage2DEXT, texture, target, levels, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage2DEXT", e); }
    }

    public void TextureStorage3DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureStorage3DEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureStorage3DEXT");
        try { Handles.MH_glTextureStorage3DEXT.invokeExact(handles.PFN_glTextureStorage3DEXT, texture, target, levels, internalformat, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage3DEXT", e); }
    }

}
