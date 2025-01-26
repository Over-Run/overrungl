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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public class GL15 extends GL14 {
    public static final int GL_BUFFER_SIZE = 0x8764;
    public static final int GL_BUFFER_USAGE = 0x8765;
    public static final int GL_QUERY_COUNTER_BITS = 0x8864;
    public static final int GL_CURRENT_QUERY = 0x8865;
    public static final int GL_QUERY_RESULT = 0x8866;
    public static final int GL_QUERY_RESULT_AVAILABLE = 0x8867;
    public static final int GL_ARRAY_BUFFER = 0x8892;
    public static final int GL_ELEMENT_ARRAY_BUFFER = 0x8893;
    public static final int GL_ARRAY_BUFFER_BINDING = 0x8894;
    public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING = 0x8895;
    public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;
    public static final int GL_READ_ONLY = 0x88B8;
    public static final int GL_WRITE_ONLY = 0x88B9;
    public static final int GL_READ_WRITE = 0x88BA;
    public static final int GL_BUFFER_ACCESS = 0x88BB;
    public static final int GL_BUFFER_MAPPED = 0x88BC;
    public static final int GL_BUFFER_MAP_POINTER = 0x88BD;
    public static final int GL_STREAM_DRAW = 0x88E0;
    public static final int GL_STREAM_READ = 0x88E1;
    public static final int GL_STREAM_COPY = 0x88E2;
    public static final int GL_STATIC_DRAW = 0x88E4;
    public static final int GL_STATIC_READ = 0x88E5;
    public static final int GL_STATIC_COPY = 0x88E6;
    public static final int GL_DYNAMIC_DRAW = 0x88E8;
    public static final int GL_DYNAMIC_READ = 0x88E9;
    public static final int GL_DYNAMIC_COPY = 0x88EA;
    public static final int GL_SAMPLES_PASSED = 0x8914;
    public static final int GL_SRC1_ALPHA = 0x8589;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGenQueries = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteQueries = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsQuery = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBeginQuery = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEndQuery = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetQueryiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetQueryObjectiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetQueryObjectuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBindBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBufferData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetBufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMapBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUnmapBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetBufferParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetBufferPointerv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glGenQueries;
        public final MemorySegment PFN_glDeleteQueries;
        public final MemorySegment PFN_glIsQuery;
        public final MemorySegment PFN_glBeginQuery;
        public final MemorySegment PFN_glEndQuery;
        public final MemorySegment PFN_glGetQueryiv;
        public final MemorySegment PFN_glGetQueryObjectiv;
        public final MemorySegment PFN_glGetQueryObjectuiv;
        public final MemorySegment PFN_glBindBuffer;
        public final MemorySegment PFN_glDeleteBuffers;
        public final MemorySegment PFN_glGenBuffers;
        public final MemorySegment PFN_glIsBuffer;
        public final MemorySegment PFN_glBufferData;
        public final MemorySegment PFN_glBufferSubData;
        public final MemorySegment PFN_glGetBufferSubData;
        public final MemorySegment PFN_glMapBuffer;
        public final MemorySegment PFN_glUnmapBuffer;
        public final MemorySegment PFN_glGetBufferParameteriv;
        public final MemorySegment PFN_glGetBufferPointerv;
        private Handles(GLLoadFunc func) {
            PFN_glGenQueries = func.invoke("glGenQueries", "glGenQueriesARB");
            PFN_glDeleteQueries = func.invoke("glDeleteQueries", "glDeleteQueriesARB");
            PFN_glIsQuery = func.invoke("glIsQuery", "glIsQueryARB");
            PFN_glBeginQuery = func.invoke("glBeginQuery", "glBeginQueryARB");
            PFN_glEndQuery = func.invoke("glEndQuery", "glEndQueryARB");
            PFN_glGetQueryiv = func.invoke("glGetQueryiv", "glGetQueryivARB");
            PFN_glGetQueryObjectiv = func.invoke("glGetQueryObjectiv", "glGetQueryObjectivARB", "glGetQueryObjectivEXT");
            PFN_glGetQueryObjectuiv = func.invoke("glGetQueryObjectuiv", "glGetQueryObjectuivARB");
            PFN_glBindBuffer = func.invoke("glBindBuffer", "glBindBufferARB");
            PFN_glDeleteBuffers = func.invoke("glDeleteBuffers", "glDeleteBuffersARB");
            PFN_glGenBuffers = func.invoke("glGenBuffers", "glGenBuffersARB");
            PFN_glIsBuffer = func.invoke("glIsBuffer", "glIsBufferARB");
            PFN_glBufferData = func.invoke("glBufferData", "glBufferDataARB");
            PFN_glBufferSubData = func.invoke("glBufferSubData", "glBufferSubDataARB");
            PFN_glGetBufferSubData = func.invoke("glGetBufferSubData", "glGetBufferSubDataARB");
            PFN_glMapBuffer = func.invoke("glMapBuffer", "glMapBufferARB", "glMapBufferOES");
            PFN_glUnmapBuffer = func.invoke("glUnmapBuffer", "glUnmapBufferARB", "glUnmapBufferOES");
            PFN_glGetBufferParameteriv = func.invoke("glGetBufferParameteriv", "glGetBufferParameterivARB");
            PFN_glGetBufferPointerv = func.invoke("glGetBufferPointerv", "glGetBufferPointervARB", "glGetBufferPointervOES");
        }
    }

    public GL15(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    /// ```
    /// void glGenQueries(GLsizei n, GLuint* ids);
    /// ```
    public void GenQueries(int n, MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenQueries)) throw new SymbolNotFoundError("Symbol not found: glGenQueries");
        try { Handles.MH_glGenQueries.invokeExact(handles.PFN_glGenQueries, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in GenQueries", e); }
    }

    /// ```
    /// void glDeleteQueries(GLsizei n, const GLuint* ids);
    /// ```
    public void DeleteQueries(int n, MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteQueries)) throw new SymbolNotFoundError("Symbol not found: glDeleteQueries");
        try { Handles.MH_glDeleteQueries.invokeExact(handles.PFN_glDeleteQueries, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteQueries", e); }
    }

    /// ```
    /// GLboolean glIsQuery(GLuint id);
    /// ```
    public boolean IsQuery(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsQuery)) throw new SymbolNotFoundError("Symbol not found: glIsQuery");
        try { return (((byte) Handles.MH_glIsQuery.invokeExact(handles.PFN_glIsQuery, id)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsQuery", e); }
    }

    /// ```
    /// void glBeginQuery(GLenum target, GLuint id);
    /// ```
    public void BeginQuery(int target, int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginQuery)) throw new SymbolNotFoundError("Symbol not found: glBeginQuery");
        try { Handles.MH_glBeginQuery.invokeExact(handles.PFN_glBeginQuery, target, id); }
        catch (Throwable e) { throw new RuntimeException("error in BeginQuery", e); }
    }

    /// ```
    /// void glEndQuery(GLenum target);
    /// ```
    public void EndQuery(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndQuery)) throw new SymbolNotFoundError("Symbol not found: glEndQuery");
        try { Handles.MH_glEndQuery.invokeExact(handles.PFN_glEndQuery, target); }
        catch (Throwable e) { throw new RuntimeException("error in EndQuery", e); }
    }

    /// ```
    /// void glGetQueryiv(GLenum target, GLenum pname, GLint* params);
    /// ```
    public void GetQueryiv(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryiv)) throw new SymbolNotFoundError("Symbol not found: glGetQueryiv");
        try { Handles.MH_glGetQueryiv.invokeExact(handles.PFN_glGetQueryiv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryiv", e); }
    }

    /// ```
    /// void glGetQueryObjectiv(GLuint id, GLenum pname, GLint* params);
    /// ```
    public void GetQueryObjectiv(int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryObjectiv)) throw new SymbolNotFoundError("Symbol not found: glGetQueryObjectiv");
        try { Handles.MH_glGetQueryObjectiv.invokeExact(handles.PFN_glGetQueryObjectiv, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryObjectiv", e); }
    }

    /// ```
    /// void glGetQueryObjectuiv(GLuint id, GLenum pname, GLuint* params);
    /// ```
    public void GetQueryObjectuiv(int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryObjectuiv)) throw new SymbolNotFoundError("Symbol not found: glGetQueryObjectuiv");
        try { Handles.MH_glGetQueryObjectuiv.invokeExact(handles.PFN_glGetQueryObjectuiv, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryObjectuiv", e); }
    }

    /// ```
    /// void glBindBuffer(GLenum target, GLuint buffer);
    /// ```
    public void BindBuffer(int target, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBuffer)) throw new SymbolNotFoundError("Symbol not found: glBindBuffer");
        try { Handles.MH_glBindBuffer.invokeExact(handles.PFN_glBindBuffer, target, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in BindBuffer", e); }
    }

    /// ```
    /// void glDeleteBuffers(GLsizei n, const GLuint* buffers);
    /// ```
    public void DeleteBuffers(int n, MemorySegment buffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteBuffers)) throw new SymbolNotFoundError("Symbol not found: glDeleteBuffers");
        try { Handles.MH_glDeleteBuffers.invokeExact(handles.PFN_glDeleteBuffers, n, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteBuffers", e); }
    }

    /// ```
    /// void glGenBuffers(GLsizei n, GLuint* buffers);
    /// ```
    public void GenBuffers(int n, MemorySegment buffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenBuffers)) throw new SymbolNotFoundError("Symbol not found: glGenBuffers");
        try { Handles.MH_glGenBuffers.invokeExact(handles.PFN_glGenBuffers, n, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in GenBuffers", e); }
    }

    /// ```
    /// GLboolean glIsBuffer(GLuint buffer);
    /// ```
    public boolean IsBuffer(int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsBuffer)) throw new SymbolNotFoundError("Symbol not found: glIsBuffer");
        try { return (((byte) Handles.MH_glIsBuffer.invokeExact(handles.PFN_glIsBuffer, buffer)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsBuffer", e); }
    }

    /// ```
    /// void glBufferData(GLenum target, GLsizeiptr size, const void* data, GLenum usage);
    /// ```
    public void BufferData(int target, long size, MemorySegment data, int usage) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBufferData)) throw new SymbolNotFoundError("Symbol not found: glBufferData");
        try { Handles.MH_glBufferData.invokeExact(handles.PFN_glBufferData, target, size, data, usage); }
        catch (Throwable e) { throw new RuntimeException("error in BufferData", e); }
    }

    /// ```
    /// void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, const void* data);
    /// ```
    public void BufferSubData(int target, long offset, long size, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glBufferSubData");
        try { Handles.MH_glBufferSubData.invokeExact(handles.PFN_glBufferSubData, target, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in BufferSubData", e); }
    }

    /// ```
    /// void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void* data);
    /// ```
    public void GetBufferSubData(int target, long offset, long size, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glGetBufferSubData");
        try { Handles.MH_glGetBufferSubData.invokeExact(handles.PFN_glGetBufferSubData, target, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetBufferSubData", e); }
    }

    /// ```
    /// void* glMapBuffer(GLenum target, GLenum access);
    /// ```
    public MemorySegment MapBuffer(int target, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapBuffer)) throw new SymbolNotFoundError("Symbol not found: glMapBuffer");
        try { return (MemorySegment) Handles.MH_glMapBuffer.invokeExact(handles.PFN_glMapBuffer, target, access); }
        catch (Throwable e) { throw new RuntimeException("error in MapBuffer", e); }
    }

    /// ```
    /// GLboolean glUnmapBuffer(GLenum target);
    /// ```
    public boolean UnmapBuffer(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUnmapBuffer)) throw new SymbolNotFoundError("Symbol not found: glUnmapBuffer");
        try { return (((byte) Handles.MH_glUnmapBuffer.invokeExact(handles.PFN_glUnmapBuffer, target)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in UnmapBuffer", e); }
    }

    /// ```
    /// void glGetBufferParameteriv(GLenum target, GLenum pname, GLint* params);
    /// ```
    public void GetBufferParameteriv(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetBufferParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetBufferParameteriv");
        try { Handles.MH_glGetBufferParameteriv.invokeExact(handles.PFN_glGetBufferParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetBufferParameteriv", e); }
    }

    /// ```
    /// void glGetBufferPointerv(GLenum target, GLenum pname, void** params);
    /// ```
    public void GetBufferPointerv(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetBufferPointerv)) throw new SymbolNotFoundError("Symbol not found: glGetBufferPointerv");
        try { Handles.MH_glGetBufferPointerv.invokeExact(handles.PFN_glGetBufferPointerv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetBufferPointerv", e); }
    }

}
