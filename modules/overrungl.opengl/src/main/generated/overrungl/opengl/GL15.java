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
import static overrungl.internal.RuntimeHelper.*;
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
        public static final MethodHandle MH_glGenQueries = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteQueries = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsQuery = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBeginQuery = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEndQuery = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetQueryiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetQueryObjectiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetQueryObjectuiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBindBuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteBuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenBuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsBuffer = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBufferData = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBufferSubData = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetBufferSubData = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMapBuffer = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUnmapBuffer = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetBufferParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetBufferPointerv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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
    /// void glGenQueries((int) GLsizei n, GLuint* ids);
    /// ```
    public void GenQueries(int n, MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenQueries)) throw new GLSymbolNotFoundError("Symbol not found: glGenQueries");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenQueries", n, ids); }
        Handles.MH_glGenQueries.invokeExact(handles.PFN_glGenQueries, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in GenQueries", e); }
    }

    /// ```
    /// void glDeleteQueries((int) GLsizei n, const GLuint* ids);
    /// ```
    public void DeleteQueries(int n, MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteQueries)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteQueries");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteQueries", n, ids); }
        Handles.MH_glDeleteQueries.invokeExact(handles.PFN_glDeleteQueries, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteQueries", e); }
    }

    /// ```
    /// GLboolean glIsQuery((unsigned int) GLuint id);
    /// ```
    public boolean IsQuery(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsQuery)) throw new GLSymbolNotFoundError("Symbol not found: glIsQuery");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsQuery", id); }
        return (((byte) Handles.MH_glIsQuery.invokeExact(handles.PFN_glIsQuery, id)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsQuery", e); }
    }

    /// ```
    /// void glBeginQuery((unsigned int) GLenum target, (unsigned int) GLuint id);
    /// ```
    public void BeginQuery(int target, int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginQuery)) throw new GLSymbolNotFoundError("Symbol not found: glBeginQuery");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBeginQuery", target, id); }
        Handles.MH_glBeginQuery.invokeExact(handles.PFN_glBeginQuery, target, id); }
        catch (Throwable e) { throw new RuntimeException("error in BeginQuery", e); }
    }

    /// ```
    /// void glEndQuery((unsigned int) GLenum target);
    /// ```
    public void EndQuery(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndQuery)) throw new GLSymbolNotFoundError("Symbol not found: glEndQuery");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEndQuery", target); }
        Handles.MH_glEndQuery.invokeExact(handles.PFN_glEndQuery, target); }
        catch (Throwable e) { throw new RuntimeException("error in EndQuery", e); }
    }

    /// ```
    /// void glGetQueryiv((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetQueryiv(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryiv", target, pname, params); }
        Handles.MH_glGetQueryiv.invokeExact(handles.PFN_glGetQueryiv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryiv", e); }
    }

    /// ```
    /// void glGetQueryObjectiv((unsigned int) GLuint id, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetQueryObjectiv(int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryObjectiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryObjectiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryObjectiv", id, pname, params); }
        Handles.MH_glGetQueryObjectiv.invokeExact(handles.PFN_glGetQueryObjectiv, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryObjectiv", e); }
    }

    /// ```
    /// void glGetQueryObjectuiv((unsigned int) GLuint id, (unsigned int) GLenum pname, GLuint* params);
    /// ```
    public void GetQueryObjectuiv(int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryObjectuiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryObjectuiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryObjectuiv", id, pname, params); }
        Handles.MH_glGetQueryObjectuiv.invokeExact(handles.PFN_glGetQueryObjectuiv, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryObjectuiv", e); }
    }

    /// ```
    /// void glBindBuffer((unsigned int) GLenum target, (unsigned int) GLuint buffer);
    /// ```
    public void BindBuffer(int target, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBuffer)) throw new GLSymbolNotFoundError("Symbol not found: glBindBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindBuffer", target, buffer); }
        Handles.MH_glBindBuffer.invokeExact(handles.PFN_glBindBuffer, target, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in BindBuffer", e); }
    }

    /// ```
    /// void glDeleteBuffers((int) GLsizei n, const GLuint* buffers);
    /// ```
    public void DeleteBuffers(int n, MemorySegment buffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteBuffers)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteBuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteBuffers", n, buffers); }
        Handles.MH_glDeleteBuffers.invokeExact(handles.PFN_glDeleteBuffers, n, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteBuffers", e); }
    }

    /// ```
    /// void glGenBuffers((int) GLsizei n, GLuint* buffers);
    /// ```
    public void GenBuffers(int n, MemorySegment buffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenBuffers)) throw new GLSymbolNotFoundError("Symbol not found: glGenBuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenBuffers", n, buffers); }
        Handles.MH_glGenBuffers.invokeExact(handles.PFN_glGenBuffers, n, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in GenBuffers", e); }
    }

    /// ```
    /// GLboolean glIsBuffer((unsigned int) GLuint buffer);
    /// ```
    public boolean IsBuffer(int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsBuffer)) throw new GLSymbolNotFoundError("Symbol not found: glIsBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsBuffer", buffer); }
        return (((byte) Handles.MH_glIsBuffer.invokeExact(handles.PFN_glIsBuffer, buffer)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsBuffer", e); }
    }

    /// ```
    /// void glBufferData((unsigned int) GLenum target, ((signed long long) khronos_ssize_t) GLsizeiptr size, const void* data, (unsigned int) GLenum usage);
    /// ```
    public void BufferData(int target, long size, MemorySegment data, int usage) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBufferData)) throw new GLSymbolNotFoundError("Symbol not found: glBufferData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBufferData", target, size, data, usage); }
        Handles.MH_glBufferData.invokeExact(handles.PFN_glBufferData, target, size, data, usage); }
        catch (Throwable e) { throw new RuntimeException("error in BufferData", e); }
    }

    /// ```
    /// void glBufferSubData((unsigned int) GLenum target, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, const void* data);
    /// ```
    public void BufferSubData(int target, long offset, long size, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBufferSubData)) throw new GLSymbolNotFoundError("Symbol not found: glBufferSubData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBufferSubData", target, offset, size, data); }
        Handles.MH_glBufferSubData.invokeExact(handles.PFN_glBufferSubData, target, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in BufferSubData", e); }
    }

    /// ```
    /// void glGetBufferSubData((unsigned int) GLenum target, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, void* data);
    /// ```
    public void GetBufferSubData(int target, long offset, long size, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetBufferSubData)) throw new GLSymbolNotFoundError("Symbol not found: glGetBufferSubData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetBufferSubData", target, offset, size, data); }
        Handles.MH_glGetBufferSubData.invokeExact(handles.PFN_glGetBufferSubData, target, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetBufferSubData", e); }
    }

    /// ```
    /// void* glMapBuffer((unsigned int) GLenum target, (unsigned int) GLenum access);
    /// ```
    public MemorySegment MapBuffer(int target, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapBuffer)) throw new GLSymbolNotFoundError("Symbol not found: glMapBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapBuffer", target, access); }
        return (MemorySegment) Handles.MH_glMapBuffer.invokeExact(handles.PFN_glMapBuffer, target, access); }
        catch (Throwable e) { throw new RuntimeException("error in MapBuffer", e); }
    }

    /// ```
    /// GLboolean glUnmapBuffer((unsigned int) GLenum target);
    /// ```
    public boolean UnmapBuffer(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUnmapBuffer)) throw new GLSymbolNotFoundError("Symbol not found: glUnmapBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUnmapBuffer", target); }
        return (((byte) Handles.MH_glUnmapBuffer.invokeExact(handles.PFN_glUnmapBuffer, target)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in UnmapBuffer", e); }
    }

    /// ```
    /// void glGetBufferParameteriv((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetBufferParameteriv(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetBufferParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetBufferParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetBufferParameteriv", target, pname, params); }
        Handles.MH_glGetBufferParameteriv.invokeExact(handles.PFN_glGetBufferParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetBufferParameteriv", e); }
    }

    /// ```
    /// void glGetBufferPointerv((unsigned int) GLenum target, (unsigned int) GLenum pname, void** params);
    /// ```
    public void GetBufferPointerv(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetBufferPointerv)) throw new GLSymbolNotFoundError("Symbol not found: glGetBufferPointerv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetBufferPointerv", target, pname, params); }
        Handles.MH_glGetBufferPointerv.invokeExact(handles.PFN_glGetBufferPointerv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetBufferPointerv", e); }
    }

}
