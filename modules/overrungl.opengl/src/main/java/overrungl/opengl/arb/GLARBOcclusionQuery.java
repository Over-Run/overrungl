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

public final class GLARBOcclusionQuery {
    public static final int GL_QUERY_COUNTER_BITS_ARB = 0x8864;
    public static final int GL_CURRENT_QUERY_ARB = 0x8865;
    public static final int GL_QUERY_RESULT_ARB = 0x8866;
    public static final int GL_QUERY_RESULT_AVAILABLE_ARB = 0x8867;
    public static final int GL_SAMPLES_PASSED_ARB = 0x8914;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glGenQueriesARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDeleteQueriesARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIsQueryARB = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBeginQueryARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glEndQueryARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetQueryivARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetQueryObjectivARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetQueryObjectuivARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glGenQueriesARB = RuntimeHelper.downcall(Descriptors.FD_glGenQueriesARB);
        public static final MethodHandle MH_glDeleteQueriesARB = RuntimeHelper.downcall(Descriptors.FD_glDeleteQueriesARB);
        public static final MethodHandle MH_glIsQueryARB = RuntimeHelper.downcall(Descriptors.FD_glIsQueryARB);
        public static final MethodHandle MH_glBeginQueryARB = RuntimeHelper.downcall(Descriptors.FD_glBeginQueryARB);
        public static final MethodHandle MH_glEndQueryARB = RuntimeHelper.downcall(Descriptors.FD_glEndQueryARB);
        public static final MethodHandle MH_glGetQueryivARB = RuntimeHelper.downcall(Descriptors.FD_glGetQueryivARB);
        public static final MethodHandle MH_glGetQueryObjectivARB = RuntimeHelper.downcall(Descriptors.FD_glGetQueryObjectivARB);
        public static final MethodHandle MH_glGetQueryObjectuivARB = RuntimeHelper.downcall(Descriptors.FD_glGetQueryObjectuivARB);
        public final MemorySegment PFN_glGenQueriesARB;
        public final MemorySegment PFN_glDeleteQueriesARB;
        public final MemorySegment PFN_glIsQueryARB;
        public final MemorySegment PFN_glBeginQueryARB;
        public final MemorySegment PFN_glEndQueryARB;
        public final MemorySegment PFN_glGetQueryivARB;
        public final MemorySegment PFN_glGetQueryObjectivARB;
        public final MemorySegment PFN_glGetQueryObjectuivARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGenQueriesARB = func.invoke("glGenQueriesARB", "glGenQueries");
            PFN_glDeleteQueriesARB = func.invoke("glDeleteQueriesARB", "glDeleteQueries");
            PFN_glIsQueryARB = func.invoke("glIsQueryARB", "glIsQuery");
            PFN_glBeginQueryARB = func.invoke("glBeginQueryARB", "glBeginQuery");
            PFN_glEndQueryARB = func.invoke("glEndQueryARB", "glEndQuery");
            PFN_glGetQueryivARB = func.invoke("glGetQueryivARB", "glGetQueryiv");
            PFN_glGetQueryObjectivARB = func.invoke("glGetQueryObjectivARB", "glGetQueryObjectiv");
            PFN_glGetQueryObjectuivARB = func.invoke("glGetQueryObjectuivARB", "glGetQueryObjectuiv");
        }
    }

    public GLARBOcclusionQuery(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void GenQueriesARB(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment ids) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenQueriesARB)) throw new SymbolNotFoundError("Symbol not found: glGenQueriesARB");
        try { Handles.MH_glGenQueriesARB.invokeExact(handles.PFN_glGenQueriesARB, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in glGenQueriesARB", e); }
    }

    public void DeleteQueriesARB(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment ids) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteQueriesARB)) throw new SymbolNotFoundError("Symbol not found: glDeleteQueriesARB");
        try { Handles.MH_glDeleteQueriesARB.invokeExact(handles.PFN_glDeleteQueriesARB, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteQueriesARB", e); }
    }

    public @CType("GLboolean") boolean IsQueryARB(@CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsQueryARB)) throw new SymbolNotFoundError("Symbol not found: glIsQueryARB");
        try { return (boolean) Handles.MH_glIsQueryARB.invokeExact(handles.PFN_glIsQueryARB, id); }
        catch (Throwable e) { throw new RuntimeException("error in glIsQueryARB", e); }
    }

    public void BeginQueryARB(@CType("GLenum") int target, @CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(handles.PFN_glBeginQueryARB)) throw new SymbolNotFoundError("Symbol not found: glBeginQueryARB");
        try { Handles.MH_glBeginQueryARB.invokeExact(handles.PFN_glBeginQueryARB, target, id); }
        catch (Throwable e) { throw new RuntimeException("error in glBeginQueryARB", e); }
    }

    public void EndQueryARB(@CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(handles.PFN_glEndQueryARB)) throw new SymbolNotFoundError("Symbol not found: glEndQueryARB");
        try { Handles.MH_glEndQueryARB.invokeExact(handles.PFN_glEndQueryARB, target); }
        catch (Throwable e) { throw new RuntimeException("error in glEndQueryARB", e); }
    }

    public void GetQueryivARB(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetQueryivARB)) throw new SymbolNotFoundError("Symbol not found: glGetQueryivARB");
        try { Handles.MH_glGetQueryivARB.invokeExact(handles.PFN_glGetQueryivARB, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryivARB", e); }
    }

    public void GetQueryObjectivARB(@CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetQueryObjectivARB)) throw new SymbolNotFoundError("Symbol not found: glGetQueryObjectivARB");
        try { Handles.MH_glGetQueryObjectivARB.invokeExact(handles.PFN_glGetQueryObjectivARB, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryObjectivARB", e); }
    }

    public void GetQueryObjectuivARB(@CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetQueryObjectuivARB)) throw new SymbolNotFoundError("Symbol not found: glGetQueryObjectuivARB");
        try { Handles.MH_glGetQueryObjectuivARB.invokeExact(handles.PFN_glGetQueryObjectuivARB, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryObjectuivARB", e); }
    }

}
