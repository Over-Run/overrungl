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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVVertexProgram4 {
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER_NV = 0x88FD;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glVertexAttribI1iEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribI2iEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribI3iEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribI4iEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribI1uiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribI2uiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribI3uiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribI4uiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribI1ivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI2ivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI3ivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI4ivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI1uivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI2uivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI3uivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI4uivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI4bvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI4svEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI4ubvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribI4usvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribIPointerEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVertexAttribIivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVertexAttribIuivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glVertexAttribI1iEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI1iEXT);
        public static final MethodHandle MH_glVertexAttribI2iEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI2iEXT);
        public static final MethodHandle MH_glVertexAttribI3iEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI3iEXT);
        public static final MethodHandle MH_glVertexAttribI4iEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI4iEXT);
        public static final MethodHandle MH_glVertexAttribI1uiEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI1uiEXT);
        public static final MethodHandle MH_glVertexAttribI2uiEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI2uiEXT);
        public static final MethodHandle MH_glVertexAttribI3uiEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI3uiEXT);
        public static final MethodHandle MH_glVertexAttribI4uiEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI4uiEXT);
        public static final MethodHandle MH_glVertexAttribI1ivEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI1ivEXT);
        public static final MethodHandle MH_glVertexAttribI2ivEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI2ivEXT);
        public static final MethodHandle MH_glVertexAttribI3ivEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI3ivEXT);
        public static final MethodHandle MH_glVertexAttribI4ivEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI4ivEXT);
        public static final MethodHandle MH_glVertexAttribI1uivEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI1uivEXT);
        public static final MethodHandle MH_glVertexAttribI2uivEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI2uivEXT);
        public static final MethodHandle MH_glVertexAttribI3uivEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI3uivEXT);
        public static final MethodHandle MH_glVertexAttribI4uivEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI4uivEXT);
        public static final MethodHandle MH_glVertexAttribI4bvEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI4bvEXT);
        public static final MethodHandle MH_glVertexAttribI4svEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI4svEXT);
        public static final MethodHandle MH_glVertexAttribI4ubvEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI4ubvEXT);
        public static final MethodHandle MH_glVertexAttribI4usvEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribI4usvEXT);
        public static final MethodHandle MH_glVertexAttribIPointerEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribIPointerEXT);
        public static final MethodHandle MH_glGetVertexAttribIivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetVertexAttribIivEXT);
        public static final MethodHandle MH_glGetVertexAttribIuivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetVertexAttribIuivEXT);
        public final MemorySegment PFN_glVertexAttribI1iEXT;
        public final MemorySegment PFN_glVertexAttribI2iEXT;
        public final MemorySegment PFN_glVertexAttribI3iEXT;
        public final MemorySegment PFN_glVertexAttribI4iEXT;
        public final MemorySegment PFN_glVertexAttribI1uiEXT;
        public final MemorySegment PFN_glVertexAttribI2uiEXT;
        public final MemorySegment PFN_glVertexAttribI3uiEXT;
        public final MemorySegment PFN_glVertexAttribI4uiEXT;
        public final MemorySegment PFN_glVertexAttribI1ivEXT;
        public final MemorySegment PFN_glVertexAttribI2ivEXT;
        public final MemorySegment PFN_glVertexAttribI3ivEXT;
        public final MemorySegment PFN_glVertexAttribI4ivEXT;
        public final MemorySegment PFN_glVertexAttribI1uivEXT;
        public final MemorySegment PFN_glVertexAttribI2uivEXT;
        public final MemorySegment PFN_glVertexAttribI3uivEXT;
        public final MemorySegment PFN_glVertexAttribI4uivEXT;
        public final MemorySegment PFN_glVertexAttribI4bvEXT;
        public final MemorySegment PFN_glVertexAttribI4svEXT;
        public final MemorySegment PFN_glVertexAttribI4ubvEXT;
        public final MemorySegment PFN_glVertexAttribI4usvEXT;
        public final MemorySegment PFN_glVertexAttribIPointerEXT;
        public final MemorySegment PFN_glGetVertexAttribIivEXT;
        public final MemorySegment PFN_glGetVertexAttribIuivEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glVertexAttribI1iEXT = func.invoke("glVertexAttribI1iEXT", "glVertexAttribI1i");
            PFN_glVertexAttribI2iEXT = func.invoke("glVertexAttribI2iEXT", "glVertexAttribI2i");
            PFN_glVertexAttribI3iEXT = func.invoke("glVertexAttribI3iEXT", "glVertexAttribI3i");
            PFN_glVertexAttribI4iEXT = func.invoke("glVertexAttribI4iEXT", "glVertexAttribI4i");
            PFN_glVertexAttribI1uiEXT = func.invoke("glVertexAttribI1uiEXT", "glVertexAttribI1ui");
            PFN_glVertexAttribI2uiEXT = func.invoke("glVertexAttribI2uiEXT", "glVertexAttribI2ui");
            PFN_glVertexAttribI3uiEXT = func.invoke("glVertexAttribI3uiEXT", "glVertexAttribI3ui");
            PFN_glVertexAttribI4uiEXT = func.invoke("glVertexAttribI4uiEXT", "glVertexAttribI4ui");
            PFN_glVertexAttribI1ivEXT = func.invoke("glVertexAttribI1ivEXT", "glVertexAttribI1iv");
            PFN_glVertexAttribI2ivEXT = func.invoke("glVertexAttribI2ivEXT", "glVertexAttribI2iv");
            PFN_glVertexAttribI3ivEXT = func.invoke("glVertexAttribI3ivEXT", "glVertexAttribI3iv");
            PFN_glVertexAttribI4ivEXT = func.invoke("glVertexAttribI4ivEXT", "glVertexAttribI4iv");
            PFN_glVertexAttribI1uivEXT = func.invoke("glVertexAttribI1uivEXT", "glVertexAttribI1uiv");
            PFN_glVertexAttribI2uivEXT = func.invoke("glVertexAttribI2uivEXT", "glVertexAttribI2uiv");
            PFN_glVertexAttribI3uivEXT = func.invoke("glVertexAttribI3uivEXT", "glVertexAttribI3uiv");
            PFN_glVertexAttribI4uivEXT = func.invoke("glVertexAttribI4uivEXT", "glVertexAttribI4uiv");
            PFN_glVertexAttribI4bvEXT = func.invoke("glVertexAttribI4bvEXT", "glVertexAttribI4bv");
            PFN_glVertexAttribI4svEXT = func.invoke("glVertexAttribI4svEXT", "glVertexAttribI4sv");
            PFN_glVertexAttribI4ubvEXT = func.invoke("glVertexAttribI4ubvEXT", "glVertexAttribI4ubv");
            PFN_glVertexAttribI4usvEXT = func.invoke("glVertexAttribI4usvEXT", "glVertexAttribI4usv");
            PFN_glVertexAttribIPointerEXT = func.invoke("glVertexAttribIPointerEXT", "glVertexAttribIPointer");
            PFN_glGetVertexAttribIivEXT = func.invoke("glGetVertexAttribIivEXT", "glGetVertexAttribIiv");
            PFN_glGetVertexAttribIuivEXT = func.invoke("glGetVertexAttribIuivEXT", "glGetVertexAttribIuiv");
        }
    }

    public GLNVVertexProgram4(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void VertexAttribI1iEXT(@CType("GLuint") int index, @CType("GLint") int x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI1iEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI1iEXT");
        try { Handles.MH_glVertexAttribI1iEXT.invokeExact(handles.PFN_glVertexAttribI1iEXT, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI1iEXT", e); }
    }

    public void VertexAttribI2iEXT(@CType("GLuint") int index, @CType("GLint") int x, @CType("GLint") int y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI2iEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI2iEXT");
        try { Handles.MH_glVertexAttribI2iEXT.invokeExact(handles.PFN_glVertexAttribI2iEXT, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI2iEXT", e); }
    }

    public void VertexAttribI3iEXT(@CType("GLuint") int index, @CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI3iEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI3iEXT");
        try { Handles.MH_glVertexAttribI3iEXT.invokeExact(handles.PFN_glVertexAttribI3iEXT, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI3iEXT", e); }
    }

    public void VertexAttribI4iEXT(@CType("GLuint") int index, @CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z, @CType("GLint") int w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI4iEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4iEXT");
        try { Handles.MH_glVertexAttribI4iEXT.invokeExact(handles.PFN_glVertexAttribI4iEXT, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4iEXT", e); }
    }

    public void VertexAttribI1uiEXT(@CType("GLuint") int index, @CType("GLuint") int x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI1uiEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI1uiEXT");
        try { Handles.MH_glVertexAttribI1uiEXT.invokeExact(handles.PFN_glVertexAttribI1uiEXT, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI1uiEXT", e); }
    }

    public void VertexAttribI2uiEXT(@CType("GLuint") int index, @CType("GLuint") int x, @CType("GLuint") int y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI2uiEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI2uiEXT");
        try { Handles.MH_glVertexAttribI2uiEXT.invokeExact(handles.PFN_glVertexAttribI2uiEXT, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI2uiEXT", e); }
    }

    public void VertexAttribI3uiEXT(@CType("GLuint") int index, @CType("GLuint") int x, @CType("GLuint") int y, @CType("GLuint") int z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI3uiEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI3uiEXT");
        try { Handles.MH_glVertexAttribI3uiEXT.invokeExact(handles.PFN_glVertexAttribI3uiEXT, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI3uiEXT", e); }
    }

    public void VertexAttribI4uiEXT(@CType("GLuint") int index, @CType("GLuint") int x, @CType("GLuint") int y, @CType("GLuint") int z, @CType("GLuint") int w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI4uiEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4uiEXT");
        try { Handles.MH_glVertexAttribI4uiEXT.invokeExact(handles.PFN_glVertexAttribI4uiEXT, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4uiEXT", e); }
    }

    public void VertexAttribI1ivEXT(@CType("GLuint") int index, @CType("const GLint *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI1ivEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI1ivEXT");
        try { Handles.MH_glVertexAttribI1ivEXT.invokeExact(handles.PFN_glVertexAttribI1ivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI1ivEXT", e); }
    }

    public void VertexAttribI2ivEXT(@CType("GLuint") int index, @CType("const GLint *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI2ivEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI2ivEXT");
        try { Handles.MH_glVertexAttribI2ivEXT.invokeExact(handles.PFN_glVertexAttribI2ivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI2ivEXT", e); }
    }

    public void VertexAttribI3ivEXT(@CType("GLuint") int index, @CType("const GLint *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI3ivEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI3ivEXT");
        try { Handles.MH_glVertexAttribI3ivEXT.invokeExact(handles.PFN_glVertexAttribI3ivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI3ivEXT", e); }
    }

    public void VertexAttribI4ivEXT(@CType("GLuint") int index, @CType("const GLint *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI4ivEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4ivEXT");
        try { Handles.MH_glVertexAttribI4ivEXT.invokeExact(handles.PFN_glVertexAttribI4ivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4ivEXT", e); }
    }

    public void VertexAttribI1uivEXT(@CType("GLuint") int index, @CType("const GLuint *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI1uivEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI1uivEXT");
        try { Handles.MH_glVertexAttribI1uivEXT.invokeExact(handles.PFN_glVertexAttribI1uivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI1uivEXT", e); }
    }

    public void VertexAttribI2uivEXT(@CType("GLuint") int index, @CType("const GLuint *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI2uivEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI2uivEXT");
        try { Handles.MH_glVertexAttribI2uivEXT.invokeExact(handles.PFN_glVertexAttribI2uivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI2uivEXT", e); }
    }

    public void VertexAttribI3uivEXT(@CType("GLuint") int index, @CType("const GLuint *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI3uivEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI3uivEXT");
        try { Handles.MH_glVertexAttribI3uivEXT.invokeExact(handles.PFN_glVertexAttribI3uivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI3uivEXT", e); }
    }

    public void VertexAttribI4uivEXT(@CType("GLuint") int index, @CType("const GLuint *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI4uivEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4uivEXT");
        try { Handles.MH_glVertexAttribI4uivEXT.invokeExact(handles.PFN_glVertexAttribI4uivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4uivEXT", e); }
    }

    public void VertexAttribI4bvEXT(@CType("GLuint") int index, @CType("const GLbyte *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI4bvEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4bvEXT");
        try { Handles.MH_glVertexAttribI4bvEXT.invokeExact(handles.PFN_glVertexAttribI4bvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4bvEXT", e); }
    }

    public void VertexAttribI4svEXT(@CType("GLuint") int index, @CType("const GLshort *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI4svEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4svEXT");
        try { Handles.MH_glVertexAttribI4svEXT.invokeExact(handles.PFN_glVertexAttribI4svEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4svEXT", e); }
    }

    public void VertexAttribI4ubvEXT(@CType("GLuint") int index, @CType("const GLubyte *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI4ubvEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4ubvEXT");
        try { Handles.MH_glVertexAttribI4ubvEXT.invokeExact(handles.PFN_glVertexAttribI4ubvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4ubvEXT", e); }
    }

    public void VertexAttribI4usvEXT(@CType("GLuint") int index, @CType("const GLushort *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribI4usvEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribI4usvEXT");
        try { Handles.MH_glVertexAttribI4usvEXT.invokeExact(handles.PFN_glVertexAttribI4usvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4usvEXT", e); }
    }

    public void VertexAttribIPointerEXT(@CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribIPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribIPointerEXT");
        try { Handles.MH_glVertexAttribIPointerEXT.invokeExact(handles.PFN_glVertexAttribIPointerEXT, index, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribIPointerEXT", e); }
    }

    public void GetVertexAttribIivEXT(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexAttribIivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribIivEXT");
        try { Handles.MH_glGetVertexAttribIivEXT.invokeExact(handles.PFN_glGetVertexAttribIivEXT, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribIivEXT", e); }
    }

    public void GetVertexAttribIuivEXT(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLuint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexAttribIuivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribIuivEXT");
        try { Handles.MH_glGetVertexAttribIuivEXT.invokeExact(handles.PFN_glGetVertexAttribIuivEXT, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribIuivEXT", e); }
    }

}
