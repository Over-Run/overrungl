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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_texture3D`
public final class GLEXTTexture3D {
    public static final int GL_PACK_SKIP_IMAGES_EXT = 0x806B;
    public static final int GL_PACK_IMAGE_HEIGHT_EXT = 0x806C;
    public static final int GL_UNPACK_SKIP_IMAGES_EXT = 0x806D;
    public static final int GL_UNPACK_IMAGE_HEIGHT_EXT = 0x806E;
    public static final int GL_TEXTURE_3D_EXT = 0x806F;
    public static final int GL_PROXY_TEXTURE_3D_EXT = 0x8070;
    public static final int GL_TEXTURE_DEPTH_EXT = 0x8071;
    public static final int GL_TEXTURE_WRAP_R_EXT = 0x8072;
    public static final int GL_MAX_3D_TEXTURE_SIZE_EXT = 0x8073;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTexImage3DEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexSubImage3DEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glTexImage3DEXT;
        public final MemorySegment PFN_glTexSubImage3DEXT;
        private Handles(GLLoadFunc func) {
            PFN_glTexImage3DEXT = func.invoke("glTexImage3DEXT", "glTexImage3D");
            PFN_glTexSubImage3DEXT = func.invoke("glTexSubImage3DEXT", "glTexSubImage3D");
        }
    }

    public GLEXTTexture3D(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTexImage3DEXT`.
    /// ```
    /// void glTexImage3DEXT((unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (int) GLint border, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void TexImage3DEXT(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @NonNull MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexImage3DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTexImage3DEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexImage3DEXT", target, level, internalformat, width, height, depth, border, format, type, pixels); }
        Handles.MH_glTexImage3DEXT.invokeExact(handles.PFN_glTexImage3DEXT, target, level, internalformat, width, height, depth, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TexImage3DEXT", e); }
    }

    /// Invokes `glTexSubImage3DEXT`.
    /// ```
    /// void glTexSubImage3DEXT((unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void TexSubImage3DEXT(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @NonNull MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexSubImage3DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTexSubImage3DEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexSubImage3DEXT", target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels); }
        Handles.MH_glTexSubImage3DEXT.invokeExact(handles.PFN_glTexSubImage3DEXT, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TexSubImage3DEXT", e); }
    }

}
