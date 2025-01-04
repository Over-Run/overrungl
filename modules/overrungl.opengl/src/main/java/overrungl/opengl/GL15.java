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

public sealed class GL15 extends GL14 permits GL20 {
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
    public static final MethodHandle MH_glGenQueries = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenQueries;
    public static final MethodHandle MH_glDeleteQueries = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteQueries;
    public static final MethodHandle MH_glIsQuery = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsQuery;
    public static final MethodHandle MH_glBeginQuery = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBeginQuery;
    public static final MethodHandle MH_glEndQuery = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glEndQuery;
    public static final MethodHandle MH_glGetQueryiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetQueryiv;
    public static final MethodHandle MH_glGetQueryObjectiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetQueryObjectiv;
    public static final MethodHandle MH_glGetQueryObjectuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetQueryObjectuiv;
    public static final MethodHandle MH_glBindBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindBuffer;
    public static final MethodHandle MH_glDeleteBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteBuffers;
    public static final MethodHandle MH_glGenBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenBuffers;
    public static final MethodHandle MH_glIsBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsBuffer;
    public static final MethodHandle MH_glBufferData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBufferData;
    public static final MethodHandle MH_glBufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBufferSubData;
    public static final MethodHandle MH_glGetBufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetBufferSubData;
    public static final MethodHandle MH_glMapBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMapBuffer;
    public static final MethodHandle MH_glUnmapBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUnmapBuffer;
    public static final MethodHandle MH_glGetBufferParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetBufferParameteriv;
    public static final MethodHandle MH_glGetBufferPointerv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetBufferPointerv;

    public GL15(GLLoadFunc func) {
        super(func);
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

    public void GenQueries(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment ids) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenQueries))
            MH_glGenQueries.invokeExact(PFN_glGenQueries, n, ids);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenQueries", e); }
    }

    public void DeleteQueries(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment ids) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeleteQueries))
            MH_glDeleteQueries.invokeExact(PFN_glDeleteQueries, n, ids);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteQueries", e); }
    }

    public @CType("GLboolean") boolean IsQuery(@CType("GLuint") int id) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsQuery))
            return (boolean) MH_glIsQuery.invokeExact(PFN_glIsQuery, id);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsQuery", e); }
    }

    public void BeginQuery(@CType("GLenum") int target, @CType("GLuint") int id) {
        try { if (!Unmarshal.isNullPointer(PFN_glBeginQuery))
            MH_glBeginQuery.invokeExact(PFN_glBeginQuery, target, id);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBeginQuery", e); }
    }

    public void EndQuery(@CType("GLenum") int target) {
        try { if (!Unmarshal.isNullPointer(PFN_glEndQuery))
            MH_glEndQuery.invokeExact(PFN_glEndQuery, target);
        }
        catch (Throwable e) { throw new RuntimeException("error in glEndQuery", e); }
    }

    public void GetQueryiv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetQueryiv))
            MH_glGetQueryiv.invokeExact(PFN_glGetQueryiv, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryiv", e); }
    }

    public void GetQueryObjectiv(@CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetQueryObjectiv))
            MH_glGetQueryObjectiv.invokeExact(PFN_glGetQueryObjectiv, id, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryObjectiv", e); }
    }

    public void GetQueryObjectuiv(@CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetQueryObjectuiv))
            MH_glGetQueryObjectuiv.invokeExact(PFN_glGetQueryObjectuiv, id, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryObjectuiv", e); }
    }

    public void BindBuffer(@CType("GLenum") int target, @CType("GLuint") int buffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindBuffer))
            MH_glBindBuffer.invokeExact(PFN_glBindBuffer, target, buffer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindBuffer", e); }
    }

    public void DeleteBuffers(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment buffers) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeleteBuffers))
            MH_glDeleteBuffers.invokeExact(PFN_glDeleteBuffers, n, buffers);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteBuffers", e); }
    }

    public void GenBuffers(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment buffers) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenBuffers))
            MH_glGenBuffers.invokeExact(PFN_glGenBuffers, n, buffers);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenBuffers", e); }
    }

    public @CType("GLboolean") boolean IsBuffer(@CType("GLuint") int buffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsBuffer))
            return (boolean) MH_glIsBuffer.invokeExact(PFN_glIsBuffer, buffer);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsBuffer", e); }
    }

    public void BufferData(@CType("GLenum") int target, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data, @CType("GLenum") int usage) {
        try { if (!Unmarshal.isNullPointer(PFN_glBufferData))
            MH_glBufferData.invokeExact(PFN_glBufferData, target, size, data, usage);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBufferData", e); }
    }

    public void BufferSubData(@CType("GLenum") int target, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glBufferSubData))
            MH_glBufferSubData.invokeExact(PFN_glBufferSubData, target, offset, size, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBufferSubData", e); }
    }

    public void GetBufferSubData(@CType("GLenum") int target, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("void*") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetBufferSubData))
            MH_glGetBufferSubData.invokeExact(PFN_glGetBufferSubData, target, offset, size, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetBufferSubData", e); }
    }

    public @CType("void*") java.lang.foreign.MemorySegment MapBuffer(@CType("GLenum") int target, @CType("GLenum") int access) {
        try { if (!Unmarshal.isNullPointer(PFN_glMapBuffer))
            return (java.lang.foreign.MemorySegment) MH_glMapBuffer.invokeExact(PFN_glMapBuffer, target, access);
            else return MemorySegment.NULL;
        }
        catch (Throwable e) { throw new RuntimeException("error in glMapBuffer", e); }
    }

    public @CType("GLboolean") boolean UnmapBuffer(@CType("GLenum") int target) {
        try { if (!Unmarshal.isNullPointer(PFN_glUnmapBuffer))
            return (boolean) MH_glUnmapBuffer.invokeExact(PFN_glUnmapBuffer, target);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glUnmapBuffer", e); }
    }

    public void GetBufferParameteriv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetBufferParameteriv))
            MH_glGetBufferParameteriv.invokeExact(PFN_glGetBufferParameteriv, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetBufferParameteriv", e); }
    }

    public void GetBufferPointerv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("void **") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetBufferPointerv))
            MH_glGetBufferPointerv.invokeExact(PFN_glGetBufferPointerv, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetBufferPointerv", e); }
    }

    // --- OverrunGL custom code ---
    public int GenQueries() { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GenQueries(1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public void DeleteQueries(int id) { try (var __stack = MemoryStack.pushLocal()) { DeleteQueries(1, __stack.ints(id)); } }
    public int GetQueryiv(@CType("GLenum") int target, @CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GetQueryiv(target, pname, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public int GetQueryObjectiv(@CType("GLuint") int id, @CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GetQueryObjectiv(id, pname, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public int GetQueryObjectuiv(@CType("GLuint") int id, @CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GetQueryObjectuiv(id, pname, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public void DeleteBuffers(int buffer) { try (var __stack = MemoryStack.pushLocal()) { DeleteBuffers(1, __stack.ints(buffer)); } }
    public int GenBuffers() { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GenBuffers(1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public void BufferData(@CType("GLenum") int target, @CType("const void *") MemorySegment data, @CType("GLenum") int usage) { BufferData(target, data.byteSize(), data, usage); }
    public int GetBufferParameteriv(@CType("GLenum") int target, @CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GetBufferParameteriv(target, pname, p); return p.get(ValueLayout.JAVA_INT, 0); } }
}
