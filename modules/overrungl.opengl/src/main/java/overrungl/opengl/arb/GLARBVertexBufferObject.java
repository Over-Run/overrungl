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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBVertexBufferObject {
    public static final int GL_BUFFER_SIZE_ARB = 0x8764;
    public static final int GL_BUFFER_USAGE_ARB = 0x8765;
    public static final int GL_ARRAY_BUFFER_ARB = 0x8892;
    public static final int GL_ELEMENT_ARRAY_BUFFER_ARB = 0x8893;
    public static final int GL_ARRAY_BUFFER_BINDING_ARB = 0x8894;
    public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING_ARB = 0x8895;
    public static final int GL_VERTEX_ARRAY_BUFFER_BINDING_ARB = 0x8896;
    public static final int GL_NORMAL_ARRAY_BUFFER_BINDING_ARB = 0x8897;
    public static final int GL_COLOR_ARRAY_BUFFER_BINDING_ARB = 0x8898;
    public static final int GL_INDEX_ARRAY_BUFFER_BINDING_ARB = 0x8899;
    public static final int GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING_ARB = 0x889A;
    public static final int GL_EDGE_FLAG_ARRAY_BUFFER_BINDING_ARB = 0x889B;
    public static final int GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING_ARB = 0x889C;
    public static final int GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING_ARB = 0x889D;
    public static final int GL_WEIGHT_ARRAY_BUFFER_BINDING_ARB = 0x889E;
    public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING_ARB = 0x889F;
    public static final int GL_READ_ONLY_ARB = 0x88B8;
    public static final int GL_WRITE_ONLY_ARB = 0x88B9;
    public static final int GL_READ_WRITE_ARB = 0x88BA;
    public static final int GL_BUFFER_ACCESS_ARB = 0x88BB;
    public static final int GL_BUFFER_MAPPED_ARB = 0x88BC;
    public static final int GL_BUFFER_MAP_POINTER_ARB = 0x88BD;
    public static final int GL_STREAM_DRAW_ARB = 0x88E0;
    public static final int GL_STREAM_READ_ARB = 0x88E1;
    public static final int GL_STREAM_COPY_ARB = 0x88E2;
    public static final int GL_STATIC_DRAW_ARB = 0x88E4;
    public static final int GL_STATIC_READ_ARB = 0x88E5;
    public static final int GL_STATIC_COPY_ARB = 0x88E6;
    public static final int GL_DYNAMIC_DRAW_ARB = 0x88E8;
    public static final int GL_DYNAMIC_READ_ARB = 0x88E9;
    public static final int GL_DYNAMIC_COPY_ARB = 0x88EA;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBindBufferARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteBuffersARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenBuffersARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsBufferARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBufferDataARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBufferSubDataARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetBufferSubDataARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMapBufferARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUnmapBufferARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetBufferParameterivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetBufferPointervARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glBindBufferARB;
        public final MemorySegment PFN_glDeleteBuffersARB;
        public final MemorySegment PFN_glGenBuffersARB;
        public final MemorySegment PFN_glIsBufferARB;
        public final MemorySegment PFN_glBufferDataARB;
        public final MemorySegment PFN_glBufferSubDataARB;
        public final MemorySegment PFN_glGetBufferSubDataARB;
        public final MemorySegment PFN_glMapBufferARB;
        public final MemorySegment PFN_glUnmapBufferARB;
        public final MemorySegment PFN_glGetBufferParameterivARB;
        public final MemorySegment PFN_glGetBufferPointervARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBindBufferARB = func.invoke("glBindBufferARB", "glBindBuffer");
            PFN_glDeleteBuffersARB = func.invoke("glDeleteBuffersARB", "glDeleteBuffers");
            PFN_glGenBuffersARB = func.invoke("glGenBuffersARB", "glGenBuffers");
            PFN_glIsBufferARB = func.invoke("glIsBufferARB", "glIsBuffer");
            PFN_glBufferDataARB = func.invoke("glBufferDataARB", "glBufferData");
            PFN_glBufferSubDataARB = func.invoke("glBufferSubDataARB", "glBufferSubData");
            PFN_glGetBufferSubDataARB = func.invoke("glGetBufferSubDataARB", "glGetBufferSubData");
            PFN_glMapBufferARB = func.invoke("glMapBufferARB", "glMapBuffer");
            PFN_glUnmapBufferARB = func.invoke("glUnmapBufferARB", "glUnmapBuffer");
            PFN_glGetBufferParameterivARB = func.invoke("glGetBufferParameterivARB", "glGetBufferParameteriv");
            PFN_glGetBufferPointervARB = func.invoke("glGetBufferPointervARB", "glGetBufferPointerv");
        }
    }

    public GLARBVertexBufferObject(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBindBufferARB(GLenum target, GLuint buffer);
    /// ```
    public void BindBufferARB(int target, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBufferARB)) throw new SymbolNotFoundError("Symbol not found: glBindBufferARB");
        try { Handles.MH_glBindBufferARB.invokeExact(handles.PFN_glBindBufferARB, target, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in BindBufferARB", e); }
    }

    /// ```
    /// void glDeleteBuffersARB(GLsizei n, const GLuint* buffers);
    /// ```
    public void DeleteBuffersARB(int n, MemorySegment buffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteBuffersARB)) throw new SymbolNotFoundError("Symbol not found: glDeleteBuffersARB");
        try { Handles.MH_glDeleteBuffersARB.invokeExact(handles.PFN_glDeleteBuffersARB, n, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteBuffersARB", e); }
    }

    /// ```
    /// void glGenBuffersARB(GLsizei n, GLuint* buffers);
    /// ```
    public void GenBuffersARB(int n, MemorySegment buffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenBuffersARB)) throw new SymbolNotFoundError("Symbol not found: glGenBuffersARB");
        try { Handles.MH_glGenBuffersARB.invokeExact(handles.PFN_glGenBuffersARB, n, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in GenBuffersARB", e); }
    }

    /// ```
    /// GLboolean glIsBufferARB(GLuint buffer);
    /// ```
    public boolean IsBufferARB(int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsBufferARB)) throw new SymbolNotFoundError("Symbol not found: glIsBufferARB");
        try { return (((byte) Handles.MH_glIsBufferARB.invokeExact(handles.PFN_glIsBufferARB, buffer)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsBufferARB", e); }
    }

    /// ```
    /// void glBufferDataARB(GLenum target, GLsizeiptrARB size, const void* data, GLenum usage);
    /// ```
    public void BufferDataARB(int target, long size, MemorySegment data, int usage) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBufferDataARB)) throw new SymbolNotFoundError("Symbol not found: glBufferDataARB");
        try { Handles.MH_glBufferDataARB.invokeExact(handles.PFN_glBufferDataARB, target, size, data, usage); }
        catch (Throwable e) { throw new RuntimeException("error in BufferDataARB", e); }
    }

    /// ```
    /// void glBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, const void* data);
    /// ```
    public void BufferSubDataARB(int target, long offset, long size, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBufferSubDataARB)) throw new SymbolNotFoundError("Symbol not found: glBufferSubDataARB");
        try { Handles.MH_glBufferSubDataARB.invokeExact(handles.PFN_glBufferSubDataARB, target, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in BufferSubDataARB", e); }
    }

    /// ```
    /// void glGetBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void* data);
    /// ```
    public void GetBufferSubDataARB(int target, long offset, long size, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetBufferSubDataARB)) throw new SymbolNotFoundError("Symbol not found: glGetBufferSubDataARB");
        try { Handles.MH_glGetBufferSubDataARB.invokeExact(handles.PFN_glGetBufferSubDataARB, target, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetBufferSubDataARB", e); }
    }

    /// ```
    /// void* glMapBufferARB(GLenum target, GLenum access);
    /// ```
    public MemorySegment MapBufferARB(int target, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapBufferARB)) throw new SymbolNotFoundError("Symbol not found: glMapBufferARB");
        try { return (MemorySegment) Handles.MH_glMapBufferARB.invokeExact(handles.PFN_glMapBufferARB, target, access); }
        catch (Throwable e) { throw new RuntimeException("error in MapBufferARB", e); }
    }

    /// ```
    /// GLboolean glUnmapBufferARB(GLenum target);
    /// ```
    public boolean UnmapBufferARB(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUnmapBufferARB)) throw new SymbolNotFoundError("Symbol not found: glUnmapBufferARB");
        try { return (((byte) Handles.MH_glUnmapBufferARB.invokeExact(handles.PFN_glUnmapBufferARB, target)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in UnmapBufferARB", e); }
    }

    /// ```
    /// void glGetBufferParameterivARB(GLenum target, GLenum pname, GLint* params);
    /// ```
    public void GetBufferParameterivARB(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetBufferParameterivARB)) throw new SymbolNotFoundError("Symbol not found: glGetBufferParameterivARB");
        try { Handles.MH_glGetBufferParameterivARB.invokeExact(handles.PFN_glGetBufferParameterivARB, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetBufferParameterivARB", e); }
    }

    /// ```
    /// void glGetBufferPointervARB(GLenum target, GLenum pname, void** params);
    /// ```
    public void GetBufferPointervARB(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetBufferPointervARB)) throw new SymbolNotFoundError("Symbol not found: glGetBufferPointervARB");
        try { Handles.MH_glGetBufferPointervARB.invokeExact(handles.PFN_glGetBufferPointervARB, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetBufferPointervARB", e); }
    }

}
