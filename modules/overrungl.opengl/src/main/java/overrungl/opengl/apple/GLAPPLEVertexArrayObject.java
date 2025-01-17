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
package overrungl.opengl.apple;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAPPLEVertexArrayObject {
    public static final int GL_VERTEX_ARRAY_BINDING_APPLE = 0x85B5;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glBindVertexArrayAPPLE = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDeleteVertexArraysAPPLE = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGenVertexArraysAPPLE = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIsVertexArrayAPPLE = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glBindVertexArrayAPPLE,
            FD_glDeleteVertexArraysAPPLE,
            FD_glGenVertexArraysAPPLE,
            FD_glIsVertexArrayAPPLE
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glBindVertexArrayAPPLE = RuntimeHelper.downcall(Descriptors.FD_glBindVertexArrayAPPLE);
        public static final MethodHandle MH_glDeleteVertexArraysAPPLE = RuntimeHelper.downcall(Descriptors.FD_glDeleteVertexArraysAPPLE);
        public static final MethodHandle MH_glGenVertexArraysAPPLE = RuntimeHelper.downcall(Descriptors.FD_glGenVertexArraysAPPLE);
        public static final MethodHandle MH_glIsVertexArrayAPPLE = RuntimeHelper.downcall(Descriptors.FD_glIsVertexArrayAPPLE);
        public final MemorySegment PFN_glBindVertexArrayAPPLE;
        public final MemorySegment PFN_glDeleteVertexArraysAPPLE;
        public final MemorySegment PFN_glGenVertexArraysAPPLE;
        public final MemorySegment PFN_glIsVertexArrayAPPLE;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBindVertexArrayAPPLE = func.invoke("glBindVertexArrayAPPLE");
            PFN_glDeleteVertexArraysAPPLE = func.invoke("glDeleteVertexArraysAPPLE", "glDeleteVertexArrays");
            PFN_glGenVertexArraysAPPLE = func.invoke("glGenVertexArraysAPPLE", "glGenVertexArrays");
            PFN_glIsVertexArrayAPPLE = func.invoke("glIsVertexArrayAPPLE", "glIsVertexArray");
        }
    }

    public GLAPPLEVertexArrayObject(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void BindVertexArrayAPPLE(@CType("GLuint") int array) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindVertexArrayAPPLE)) throw new SymbolNotFoundError("Symbol not found: glBindVertexArrayAPPLE");
        try { Handles.MH_glBindVertexArrayAPPLE.invokeExact(handles.PFN_glBindVertexArrayAPPLE, array); }
        catch (Throwable e) { throw new RuntimeException("error in glBindVertexArrayAPPLE", e); }
    }

    public void DeleteVertexArraysAPPLE(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment arrays) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteVertexArraysAPPLE)) throw new SymbolNotFoundError("Symbol not found: glDeleteVertexArraysAPPLE");
        try { Handles.MH_glDeleteVertexArraysAPPLE.invokeExact(handles.PFN_glDeleteVertexArraysAPPLE, n, arrays); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteVertexArraysAPPLE", e); }
    }

    public void GenVertexArraysAPPLE(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment arrays) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenVertexArraysAPPLE)) throw new SymbolNotFoundError("Symbol not found: glGenVertexArraysAPPLE");
        try { Handles.MH_glGenVertexArraysAPPLE.invokeExact(handles.PFN_glGenVertexArraysAPPLE, n, arrays); }
        catch (Throwable e) { throw new RuntimeException("error in glGenVertexArraysAPPLE", e); }
    }

    public @CType("GLboolean") boolean IsVertexArrayAPPLE(@CType("GLuint") int array) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsVertexArrayAPPLE)) throw new SymbolNotFoundError("Symbol not found: glIsVertexArrayAPPLE");
        try { return (boolean) Handles.MH_glIsVertexArrayAPPLE.invokeExact(handles.PFN_glIsVertexArrayAPPLE, array); }
        catch (Throwable e) { throw new RuntimeException("error in glIsVertexArrayAPPLE", e); }
    }

}
