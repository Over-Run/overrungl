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
package overrungl.opengl;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public class GL12 extends GL11 {
    public static final int GL_UNSIGNED_BYTE_3_3_2 = 0x8032;
    public static final int GL_UNSIGNED_SHORT_4_4_4_4 = 0x8033;
    public static final int GL_UNSIGNED_SHORT_5_5_5_1 = 0x8034;
    public static final int GL_UNSIGNED_INT_8_8_8_8 = 0x8035;
    public static final int GL_UNSIGNED_INT_10_10_10_2 = 0x8036;
    public static final int GL_TEXTURE_BINDING_3D = 0x806A;
    public static final int GL_PACK_SKIP_IMAGES = 0x806B;
    public static final int GL_PACK_IMAGE_HEIGHT = 0x806C;
    public static final int GL_UNPACK_SKIP_IMAGES = 0x806D;
    public static final int GL_UNPACK_IMAGE_HEIGHT = 0x806E;
    public static final int GL_TEXTURE_3D = 0x806F;
    public static final int GL_PROXY_TEXTURE_3D = 0x8070;
    public static final int GL_TEXTURE_DEPTH = 0x8071;
    public static final int GL_TEXTURE_WRAP_R = 0x8072;
    public static final int GL_MAX_3D_TEXTURE_SIZE = 0x8073;
    public static final int GL_UNSIGNED_BYTE_2_3_3_REV = 0x8362;
    public static final int GL_UNSIGNED_SHORT_5_6_5 = 0x8363;
    public static final int GL_UNSIGNED_SHORT_5_6_5_REV = 0x8364;
    public static final int GL_UNSIGNED_SHORT_4_4_4_4_REV = 0x8365;
    public static final int GL_UNSIGNED_SHORT_1_5_5_5_REV = 0x8366;
    public static final int GL_UNSIGNED_INT_8_8_8_8_REV = 0x8367;
    public static final int GL_UNSIGNED_INT_2_10_10_10_REV = 0x8368;
    public static final int GL_BGR = 0x80E0;
    public static final int GL_BGRA = 0x80E1;
    public static final int GL_MAX_ELEMENTS_VERTICES = 0x80E8;
    public static final int GL_MAX_ELEMENTS_INDICES = 0x80E9;
    public static final int GL_CLAMP_TO_EDGE = 0x812F;
    public static final int GL_TEXTURE_MIN_LOD = 0x813A;
    public static final int GL_TEXTURE_MAX_LOD = 0x813B;
    public static final int GL_TEXTURE_BASE_LEVEL = 0x813C;
    public static final int GL_TEXTURE_MAX_LEVEL = 0x813D;
    public static final int GL_SMOOTH_POINT_SIZE_RANGE = 0x0B12;
    public static final int GL_SMOOTH_POINT_SIZE_GRANULARITY = 0x0B13;
    public static final int GL_SMOOTH_LINE_WIDTH_RANGE = 0x0B22;
    public static final int GL_SMOOTH_LINE_WIDTH_GRANULARITY = 0x0B23;
    public static final int GL_ALIASED_LINE_WIDTH_RANGE = 0x846E;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawRangeElements = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexImage3D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexSubImage3D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCopyTexSubImage3D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glDrawRangeElements;
        public final MemorySegment PFN_glTexImage3D;
        public final MemorySegment PFN_glTexSubImage3D;
        public final MemorySegment PFN_glCopyTexSubImage3D;
        private Handles(GLLoadFunc func) {
            PFN_glDrawRangeElements = func.invoke("glDrawRangeElements", "glDrawRangeElementsEXT");
            PFN_glTexImage3D = func.invoke("glTexImage3D", "glTexImage3DEXT");
            PFN_glTexSubImage3D = func.invoke("glTexSubImage3D", "glTexSubImage3DEXT");
            PFN_glCopyTexSubImage3D = func.invoke("glCopyTexSubImage3D", "glCopyTexSubImage3DEXT");
        }
    }

    public GL12(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    public void DrawRangeElements(@CType("GLenum") int mode, @CType("GLuint") int start, @CType("GLuint") int end, @CType("GLsizei") int count, @CType("GLenum") int type, @CType("const void *") MemorySegment indices) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawRangeElements)) throw new SymbolNotFoundError("Symbol not found: glDrawRangeElements");
        try { Handles.MH_glDrawRangeElements.invokeExact(handles.PFN_glDrawRangeElements, mode, start, end, count, type, indices); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawRangeElements", e); }
    }

    public void TexImage3D(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLint") int border, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexImage3D)) throw new SymbolNotFoundError("Symbol not found: glTexImage3D");
        try { Handles.MH_glTexImage3D.invokeExact(handles.PFN_glTexImage3D, target, level, internalformat, width, height, depth, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTexImage3D", e); }
    }

    public void TexSubImage3D(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexSubImage3D)) throw new SymbolNotFoundError("Symbol not found: glTexSubImage3D");
        try { Handles.MH_glTexSubImage3D.invokeExact(handles.PFN_glTexSubImage3D, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTexSubImage3D", e); }
    }

    public void CopyTexSubImage3D(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyTexSubImage3D)) throw new SymbolNotFoundError("Symbol not found: glCopyTexSubImage3D");
        try { Handles.MH_glCopyTexSubImage3D.invokeExact(handles.PFN_glCopyTexSubImage3D, target, level, xoffset, yoffset, zoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTexSubImage3D", e); }
    }

}
