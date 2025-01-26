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

public final class GLEXTVertexArray {
    public static final int GL_VERTEX_ARRAY_EXT = 0x8074;
    public static final int GL_NORMAL_ARRAY_EXT = 0x8075;
    public static final int GL_COLOR_ARRAY_EXT = 0x8076;
    public static final int GL_INDEX_ARRAY_EXT = 0x8077;
    public static final int GL_TEXTURE_COORD_ARRAY_EXT = 0x8078;
    public static final int GL_EDGE_FLAG_ARRAY_EXT = 0x8079;
    public static final int GL_VERTEX_ARRAY_SIZE_EXT = 0x807A;
    public static final int GL_VERTEX_ARRAY_TYPE_EXT = 0x807B;
    public static final int GL_VERTEX_ARRAY_STRIDE_EXT = 0x807C;
    public static final int GL_VERTEX_ARRAY_COUNT_EXT = 0x807D;
    public static final int GL_NORMAL_ARRAY_TYPE_EXT = 0x807E;
    public static final int GL_NORMAL_ARRAY_STRIDE_EXT = 0x807F;
    public static final int GL_NORMAL_ARRAY_COUNT_EXT = 0x8080;
    public static final int GL_COLOR_ARRAY_SIZE_EXT = 0x8081;
    public static final int GL_COLOR_ARRAY_TYPE_EXT = 0x8082;
    public static final int GL_COLOR_ARRAY_STRIDE_EXT = 0x8083;
    public static final int GL_COLOR_ARRAY_COUNT_EXT = 0x8084;
    public static final int GL_INDEX_ARRAY_TYPE_EXT = 0x8085;
    public static final int GL_INDEX_ARRAY_STRIDE_EXT = 0x8086;
    public static final int GL_INDEX_ARRAY_COUNT_EXT = 0x8087;
    public static final int GL_TEXTURE_COORD_ARRAY_SIZE_EXT = 0x8088;
    public static final int GL_TEXTURE_COORD_ARRAY_TYPE_EXT = 0x8089;
    public static final int GL_TEXTURE_COORD_ARRAY_STRIDE_EXT = 0x808A;
    public static final int GL_TEXTURE_COORD_ARRAY_COUNT_EXT = 0x808B;
    public static final int GL_EDGE_FLAG_ARRAY_STRIDE_EXT = 0x808C;
    public static final int GL_EDGE_FLAG_ARRAY_COUNT_EXT = 0x808D;
    public static final int GL_VERTEX_ARRAY_POINTER_EXT = 0x808E;
    public static final int GL_NORMAL_ARRAY_POINTER_EXT = 0x808F;
    public static final int GL_COLOR_ARRAY_POINTER_EXT = 0x8090;
    public static final int GL_INDEX_ARRAY_POINTER_EXT = 0x8091;
    public static final int GL_TEXTURE_COORD_ARRAY_POINTER_EXT = 0x8092;
    public static final int GL_EDGE_FLAG_ARRAY_POINTER_EXT = 0x8093;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glArrayElementEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glColorPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDrawArraysEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEdgeFlagPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPointervEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIndexPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNormalPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoordPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glArrayElementEXT;
        public final MemorySegment PFN_glColorPointerEXT;
        public final MemorySegment PFN_glDrawArraysEXT;
        public final MemorySegment PFN_glEdgeFlagPointerEXT;
        public final MemorySegment PFN_glGetPointervEXT;
        public final MemorySegment PFN_glIndexPointerEXT;
        public final MemorySegment PFN_glNormalPointerEXT;
        public final MemorySegment PFN_glTexCoordPointerEXT;
        public final MemorySegment PFN_glVertexPointerEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glArrayElementEXT = func.invoke("glArrayElementEXT", "glArrayElement");
            PFN_glColorPointerEXT = func.invoke("glColorPointerEXT");
            PFN_glDrawArraysEXT = func.invoke("glDrawArraysEXT", "glDrawArrays");
            PFN_glEdgeFlagPointerEXT = func.invoke("glEdgeFlagPointerEXT");
            PFN_glGetPointervEXT = func.invoke("glGetPointervEXT", "glGetPointerv");
            PFN_glIndexPointerEXT = func.invoke("glIndexPointerEXT");
            PFN_glNormalPointerEXT = func.invoke("glNormalPointerEXT");
            PFN_glTexCoordPointerEXT = func.invoke("glTexCoordPointerEXT");
            PFN_glVertexPointerEXT = func.invoke("glVertexPointerEXT");
        }
    }

    public GLEXTVertexArray(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glArrayElementEXT((int) GLint i);
    /// ```
    public void ArrayElementEXT(int i) {
        if (MemoryUtil.isNullPointer(handles.PFN_glArrayElementEXT)) throw new SymbolNotFoundError("Symbol not found: glArrayElementEXT");
        try { Handles.MH_glArrayElementEXT.invokeExact(handles.PFN_glArrayElementEXT, i); }
        catch (Throwable e) { throw new RuntimeException("error in ArrayElementEXT", e); }
    }

    /// ```
    /// void glColorPointerEXT((int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, (int) GLsizei count, const void* pointer);
    /// ```
    public void ColorPointerEXT(int size, int type, int stride, int count, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glColorPointerEXT");
        try { Handles.MH_glColorPointerEXT.invokeExact(handles.PFN_glColorPointerEXT, size, type, stride, count, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in ColorPointerEXT", e); }
    }

    /// ```
    /// void glDrawArraysEXT((unsigned int) GLenum mode, (int) GLint first, (int) GLsizei count);
    /// ```
    public void DrawArraysEXT(int mode, int first, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawArraysEXT)) throw new SymbolNotFoundError("Symbol not found: glDrawArraysEXT");
        try { Handles.MH_glDrawArraysEXT.invokeExact(handles.PFN_glDrawArraysEXT, mode, first, count); }
        catch (Throwable e) { throw new RuntimeException("error in DrawArraysEXT", e); }
    }

    /// ```
    /// void glEdgeFlagPointerEXT((int) GLsizei stride, (int) GLsizei count, const GLboolean* pointer);
    /// ```
    public void EdgeFlagPointerEXT(int stride, int count, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEdgeFlagPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glEdgeFlagPointerEXT");
        try { Handles.MH_glEdgeFlagPointerEXT.invokeExact(handles.PFN_glEdgeFlagPointerEXT, stride, count, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in EdgeFlagPointerEXT", e); }
    }

    /// ```
    /// void glGetPointervEXT((unsigned int) GLenum pname, void** params);
    /// ```
    public void GetPointervEXT(int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPointervEXT)) throw new SymbolNotFoundError("Symbol not found: glGetPointervEXT");
        try { Handles.MH_glGetPointervEXT.invokeExact(handles.PFN_glGetPointervEXT, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetPointervEXT", e); }
    }

    /// ```
    /// void glIndexPointerEXT((unsigned int) GLenum type, (int) GLsizei stride, (int) GLsizei count, const void* pointer);
    /// ```
    public void IndexPointerEXT(int type, int stride, int count, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIndexPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glIndexPointerEXT");
        try { Handles.MH_glIndexPointerEXT.invokeExact(handles.PFN_glIndexPointerEXT, type, stride, count, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in IndexPointerEXT", e); }
    }

    /// ```
    /// void glNormalPointerEXT((unsigned int) GLenum type, (int) GLsizei stride, (int) GLsizei count, const void* pointer);
    /// ```
    public void NormalPointerEXT(int type, int stride, int count, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glNormalPointerEXT");
        try { Handles.MH_glNormalPointerEXT.invokeExact(handles.PFN_glNormalPointerEXT, type, stride, count, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in NormalPointerEXT", e); }
    }

    /// ```
    /// void glTexCoordPointerEXT((int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, (int) GLsizei count, const void* pointer);
    /// ```
    public void TexCoordPointerEXT(int size, int type, int stride, int count, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoordPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glTexCoordPointerEXT");
        try { Handles.MH_glTexCoordPointerEXT.invokeExact(handles.PFN_glTexCoordPointerEXT, size, type, stride, count, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoordPointerEXT", e); }
    }

    /// ```
    /// void glVertexPointerEXT((int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, (int) GLsizei count, const void* pointer);
    /// ```
    public void VertexPointerEXT(int size, int type, int stride, int count, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexPointerEXT");
        try { Handles.MH_glVertexPointerEXT.invokeExact(handles.PFN_glVertexPointerEXT, size, type, stride, count, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexPointerEXT", e); }
    }

}
