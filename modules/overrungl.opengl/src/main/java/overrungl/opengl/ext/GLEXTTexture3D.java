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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glTexImage3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexSubImage3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glTexImage3DEXT,
            FD_glTexSubImage3DEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glTexImage3DEXT = RuntimeHelper.downcall(Descriptors.FD_glTexImage3DEXT);
        public static final MethodHandle MH_glTexSubImage3DEXT = RuntimeHelper.downcall(Descriptors.FD_glTexSubImage3DEXT);
        public final MemorySegment PFN_glTexImage3DEXT;
        public final MemorySegment PFN_glTexSubImage3DEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTexImage3DEXT = func.invoke("glTexImage3DEXT", "glTexImage3D");
            PFN_glTexSubImage3DEXT = func.invoke("glTexSubImage3DEXT", "glTexSubImage3D");
        }
    }

    public GLEXTTexture3D(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void TexImage3DEXT(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLint") int border, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexImage3DEXT)) throw new SymbolNotFoundError("Symbol not found: glTexImage3DEXT");
        try { Handles.MH_glTexImage3DEXT.invokeExact(handles.PFN_glTexImage3DEXT, target, level, internalformat, width, height, depth, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTexImage3DEXT", e); }
    }

    public void TexSubImage3DEXT(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexSubImage3DEXT)) throw new SymbolNotFoundError("Symbol not found: glTexSubImage3DEXT");
        try { Handles.MH_glTexSubImage3DEXT.invokeExact(handles.PFN_glTexSubImage3DEXT, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTexSubImage3DEXT", e); }
    }

}
