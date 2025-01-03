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
    public static final MethodHandle MH_glTexStorage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTexStorage1DEXT;
    public static final MethodHandle MH_glTexStorage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTexStorage2DEXT;
    public static final MethodHandle MH_glTexStorage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTexStorage3DEXT;
    public static final MethodHandle MH_glTextureStorage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTextureStorage1DEXT;
    public static final MethodHandle MH_glTextureStorage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTextureStorage2DEXT;
    public static final MethodHandle MH_glTextureStorage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTextureStorage3DEXT;

    public GLEXTTextureStorage(overrungl.opengl.GLLoadFunc func) {
        PFN_glTexStorage1DEXT = func.invoke("glTexStorage1DEXT", "glTexStorage1D");
        PFN_glTexStorage2DEXT = func.invoke("glTexStorage2DEXT", "glTexStorage2D");
        PFN_glTexStorage3DEXT = func.invoke("glTexStorage3DEXT", "glTexStorage3D");PFN_glTextureStorage1DEXT = func.invoke("glTextureStorage1DEXT");
        PFN_glTextureStorage2DEXT = func.invoke("glTextureStorage2DEXT");
        PFN_glTextureStorage3DEXT = func.invoke("glTextureStorage3DEXT");
    }

    public void TexStorage1DEXT(@CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexStorage1DEXT))
            MH_glTexStorage1DEXT.invokeExact(PFN_glTexStorage1DEXT, target, levels, internalformat, width);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexStorage1DEXT", e); }
    }

    public void TexStorage2DEXT(@CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexStorage2DEXT))
            MH_glTexStorage2DEXT.invokeExact(PFN_glTexStorage2DEXT, target, levels, internalformat, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexStorage2DEXT", e); }
    }

    public void TexStorage3DEXT(@CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexStorage3DEXT))
            MH_glTexStorage3DEXT.invokeExact(PFN_glTexStorage3DEXT, target, levels, internalformat, width, height, depth);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexStorage3DEXT", e); }
    }

    public void TextureStorage1DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureStorage1DEXT))
            MH_glTextureStorage1DEXT.invokeExact(PFN_glTextureStorage1DEXT, texture, target, levels, internalformat, width);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage1DEXT", e); }
    }

    public void TextureStorage2DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureStorage2DEXT))
            MH_glTextureStorage2DEXT.invokeExact(PFN_glTextureStorage2DEXT, texture, target, levels, internalformat, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage2DEXT", e); }
    }

    public void TextureStorage3DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureStorage3DEXT))
            MH_glTextureStorage3DEXT.invokeExact(PFN_glTextureStorage3DEXT, texture, target, levels, internalformat, width, height, depth);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage3DEXT", e); }
    }

}
