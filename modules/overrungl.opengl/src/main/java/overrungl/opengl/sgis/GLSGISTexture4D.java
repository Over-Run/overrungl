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
package overrungl.opengl.sgis;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSGISTexture4D {
    public static final int GL_PACK_SKIP_VOLUMES_SGIS = 0x8130;
    public static final int GL_PACK_IMAGE_DEPTH_SGIS = 0x8131;
    public static final int GL_UNPACK_SKIP_VOLUMES_SGIS = 0x8132;
    public static final int GL_UNPACK_IMAGE_DEPTH_SGIS = 0x8133;
    public static final int GL_TEXTURE_4D_SGIS = 0x8134;
    public static final int GL_PROXY_TEXTURE_4D_SGIS = 0x8135;
    public static final int GL_TEXTURE_4DSIZE_SGIS = 0x8136;
    public static final int GL_TEXTURE_WRAP_Q_SGIS = 0x8137;
    public static final int GL_MAX_4D_TEXTURE_SIZE_SGIS = 0x8138;
    public static final int GL_TEXTURE_4D_BINDING_SGIS = 0x814F;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glTexImage4DSGIS = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexSubImage4DSGIS = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glTexImage4DSGIS = RuntimeHelper.downcall(Descriptors.FD_glTexImage4DSGIS);
        public static final MethodHandle MH_glTexSubImage4DSGIS = RuntimeHelper.downcall(Descriptors.FD_glTexSubImage4DSGIS);
        public final MemorySegment PFN_glTexImage4DSGIS;
        public final MemorySegment PFN_glTexSubImage4DSGIS;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTexImage4DSGIS = func.invoke("glTexImage4DSGIS");
            PFN_glTexSubImage4DSGIS = func.invoke("glTexSubImage4DSGIS");
        }
    }

    public GLSGISTexture4D(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void TexImage4DSGIS(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLsizei") int size4d, @CType("GLint") int border, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexImage4DSGIS)) throw new SymbolNotFoundError("Symbol not found: glTexImage4DSGIS");
        try { Handles.MH_glTexImage4DSGIS.invokeExact(handles.PFN_glTexImage4DSGIS, target, level, internalformat, width, height, depth, size4d, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTexImage4DSGIS", e); }
    }

    public void TexSubImage4DSGIS(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLint") int woffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLsizei") int size4d, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexSubImage4DSGIS)) throw new SymbolNotFoundError("Symbol not found: glTexSubImage4DSGIS");
        try { Handles.MH_glTexSubImage4DSGIS.invokeExact(handles.PFN_glTexSubImage4DSGIS, target, level, xoffset, yoffset, zoffset, woffset, width, height, depth, size4d, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTexSubImage4DSGIS", e); }
    }

}
