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
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glArrayElementEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glColorPointerEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDrawArraysEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glEdgeFlagPointerEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetPointervEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIndexPointerEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNormalPointerEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexCoordPointerEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexPointerEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glArrayElementEXT,
            FD_glColorPointerEXT,
            FD_glDrawArraysEXT,
            FD_glEdgeFlagPointerEXT,
            FD_glGetPointervEXT,
            FD_glIndexPointerEXT,
            FD_glNormalPointerEXT,
            FD_glTexCoordPointerEXT,
            FD_glVertexPointerEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glArrayElementEXT = RuntimeHelper.downcall(Descriptors.FD_glArrayElementEXT);
        public static final MethodHandle MH_glColorPointerEXT = RuntimeHelper.downcall(Descriptors.FD_glColorPointerEXT);
        public static final MethodHandle MH_glDrawArraysEXT = RuntimeHelper.downcall(Descriptors.FD_glDrawArraysEXT);
        public static final MethodHandle MH_glEdgeFlagPointerEXT = RuntimeHelper.downcall(Descriptors.FD_glEdgeFlagPointerEXT);
        public static final MethodHandle MH_glGetPointervEXT = RuntimeHelper.downcall(Descriptors.FD_glGetPointervEXT);
        public static final MethodHandle MH_glIndexPointerEXT = RuntimeHelper.downcall(Descriptors.FD_glIndexPointerEXT);
        public static final MethodHandle MH_glNormalPointerEXT = RuntimeHelper.downcall(Descriptors.FD_glNormalPointerEXT);
        public static final MethodHandle MH_glTexCoordPointerEXT = RuntimeHelper.downcall(Descriptors.FD_glTexCoordPointerEXT);
        public static final MethodHandle MH_glVertexPointerEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexPointerEXT);
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

    public void ArrayElementEXT(@CType("GLint") int i) {
        if (Unmarshal.isNullPointer(handles.PFN_glArrayElementEXT)) throw new SymbolNotFoundError("Symbol not found: glArrayElementEXT");
        try { Handles.MH_glArrayElementEXT.invokeExact(handles.PFN_glArrayElementEXT, i); }
        catch (Throwable e) { throw new RuntimeException("error in glArrayElementEXT", e); }
    }

    public void ColorPointerEXT(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLsizei") int count, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glColorPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glColorPointerEXT");
        try { Handles.MH_glColorPointerEXT.invokeExact(handles.PFN_glColorPointerEXT, size, type, stride, count, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glColorPointerEXT", e); }
    }

    public void DrawArraysEXT(@CType("GLenum") int mode, @CType("GLint") int first, @CType("GLsizei") int count) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawArraysEXT)) throw new SymbolNotFoundError("Symbol not found: glDrawArraysEXT");
        try { Handles.MH_glDrawArraysEXT.invokeExact(handles.PFN_glDrawArraysEXT, mode, first, count); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawArraysEXT", e); }
    }

    public void EdgeFlagPointerEXT(@CType("GLsizei") int stride, @CType("GLsizei") int count, @CType("const GLboolean *") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glEdgeFlagPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glEdgeFlagPointerEXT");
        try { Handles.MH_glEdgeFlagPointerEXT.invokeExact(handles.PFN_glEdgeFlagPointerEXT, stride, count, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glEdgeFlagPointerEXT", e); }
    }

    public void GetPointervEXT(@CType("GLenum") int pname, @CType("void **") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetPointervEXT)) throw new SymbolNotFoundError("Symbol not found: glGetPointervEXT");
        try { Handles.MH_glGetPointervEXT.invokeExact(handles.PFN_glGetPointervEXT, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPointervEXT", e); }
    }

    public void IndexPointerEXT(@CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLsizei") int count, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glIndexPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glIndexPointerEXT");
        try { Handles.MH_glIndexPointerEXT.invokeExact(handles.PFN_glIndexPointerEXT, type, stride, count, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glIndexPointerEXT", e); }
    }

    public void NormalPointerEXT(@CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLsizei") int count, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormalPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glNormalPointerEXT");
        try { Handles.MH_glNormalPointerEXT.invokeExact(handles.PFN_glNormalPointerEXT, type, stride, count, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glNormalPointerEXT", e); }
    }

    public void TexCoordPointerEXT(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLsizei") int count, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoordPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glTexCoordPointerEXT");
        try { Handles.MH_glTexCoordPointerEXT.invokeExact(handles.PFN_glTexCoordPointerEXT, size, type, stride, count, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoordPointerEXT", e); }
    }

    public void VertexPointerEXT(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLsizei") int count, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexPointerEXT");
        try { Handles.MH_glVertexPointerEXT.invokeExact(handles.PFN_glVertexPointerEXT, size, type, stride, count, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexPointerEXT", e); }
    }

}
