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
import overrungl.annotation.*;
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
    public static final MethodHandle MH_glBindBufferARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindBufferARB;
    public static final MethodHandle MH_glDeleteBuffersARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteBuffersARB;
    public static final MethodHandle MH_glGenBuffersARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenBuffersARB;
    public static final MethodHandle MH_glIsBufferARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsBufferARB;
    public static final MethodHandle MH_glBufferDataARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBufferDataARB;
    public static final MethodHandle MH_glBufferSubDataARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBufferSubDataARB;
    public static final MethodHandle MH_glGetBufferSubDataARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetBufferSubDataARB;
    public static final MethodHandle MH_glMapBufferARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMapBufferARB;
    public static final MethodHandle MH_glUnmapBufferARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUnmapBufferARB;
    public static final MethodHandle MH_glGetBufferParameterivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetBufferParameterivARB;
    public static final MethodHandle MH_glGetBufferPointervARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetBufferPointervARB;

    public GLARBVertexBufferObject(overrungl.opengl.GLLoadFunc func) {
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

    public void BindBufferARB(@CType("GLenum") int target, @CType("GLuint") int buffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindBufferARB))
            MH_glBindBufferARB.invokeExact(PFN_glBindBufferARB, target, buffer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindBufferARB", e); }
    }

    public void DeleteBuffersARB(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment buffers) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeleteBuffersARB))
            MH_glDeleteBuffersARB.invokeExact(PFN_glDeleteBuffersARB, n, buffers);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteBuffersARB", e); }
    }

    public void GenBuffersARB(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment buffers) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenBuffersARB))
            MH_glGenBuffersARB.invokeExact(PFN_glGenBuffersARB, n, buffers);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenBuffersARB", e); }
    }

    public @CType("GLboolean") boolean IsBufferARB(@CType("GLuint") int buffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsBufferARB))
            return (boolean) MH_glIsBufferARB.invokeExact(PFN_glIsBufferARB, buffer);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsBufferARB", e); }
    }

    public void BufferDataARB(@CType("GLenum") int target, @CType("GLsizeiptrARB") long size, @CType("const void *") java.lang.foreign.MemorySegment data, @CType("GLenum") int usage) {
        try { if (!Unmarshal.isNullPointer(PFN_glBufferDataARB))
            MH_glBufferDataARB.invokeExact(PFN_glBufferDataARB, target, size, data, usage);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBufferDataARB", e); }
    }

    public void BufferSubDataARB(@CType("GLenum") int target, @CType("GLintptrARB") long offset, @CType("GLsizeiptrARB") long size, @CType("const void *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glBufferSubDataARB))
            MH_glBufferSubDataARB.invokeExact(PFN_glBufferSubDataARB, target, offset, size, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBufferSubDataARB", e); }
    }

    public void GetBufferSubDataARB(@CType("GLenum") int target, @CType("GLintptrARB") long offset, @CType("GLsizeiptrARB") long size, @CType("void*") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetBufferSubDataARB))
            MH_glGetBufferSubDataARB.invokeExact(PFN_glGetBufferSubDataARB, target, offset, size, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetBufferSubDataARB", e); }
    }

    public @CType("void*") java.lang.foreign.MemorySegment MapBufferARB(@CType("GLenum") int target, @CType("GLenum") int access) {
        try { if (!Unmarshal.isNullPointer(PFN_glMapBufferARB))
            return (java.lang.foreign.MemorySegment) MH_glMapBufferARB.invokeExact(PFN_glMapBufferARB, target, access);
            else return MemorySegment.NULL;
        }
        catch (Throwable e) { throw new RuntimeException("error in glMapBufferARB", e); }
    }

    public @CType("GLboolean") boolean UnmapBufferARB(@CType("GLenum") int target) {
        try { if (!Unmarshal.isNullPointer(PFN_glUnmapBufferARB))
            return (boolean) MH_glUnmapBufferARB.invokeExact(PFN_glUnmapBufferARB, target);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glUnmapBufferARB", e); }
    }

    public void GetBufferParameterivARB(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetBufferParameterivARB))
            MH_glGetBufferParameterivARB.invokeExact(PFN_glGetBufferParameterivARB, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetBufferParameterivARB", e); }
    }

    public void GetBufferPointervARB(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("void **") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetBufferPointervARB))
            MH_glGetBufferPointervARB.invokeExact(PFN_glGetBufferPointervARB, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetBufferPointervARB", e); }
    }

}
