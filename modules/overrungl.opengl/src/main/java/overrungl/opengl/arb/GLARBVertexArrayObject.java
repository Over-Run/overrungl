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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBVertexArrayObject {
    public static final int GL_VERTEX_ARRAY_BINDING = 0x85B5;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glBindVertexArray = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDeleteVertexArrays = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGenVertexArrays = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIsVertexArray = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glBindVertexArray,
            FD_glDeleteVertexArrays,
            FD_glGenVertexArrays,
            FD_glIsVertexArray
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glBindVertexArray = RuntimeHelper.downcall(Descriptors.FD_glBindVertexArray);
        public static final MethodHandle MH_glDeleteVertexArrays = RuntimeHelper.downcall(Descriptors.FD_glDeleteVertexArrays);
        public static final MethodHandle MH_glGenVertexArrays = RuntimeHelper.downcall(Descriptors.FD_glGenVertexArrays);
        public static final MethodHandle MH_glIsVertexArray = RuntimeHelper.downcall(Descriptors.FD_glIsVertexArray);
        public final MemorySegment PFN_glBindVertexArray;
        public final MemorySegment PFN_glDeleteVertexArrays;
        public final MemorySegment PFN_glGenVertexArrays;
        public final MemorySegment PFN_glIsVertexArray;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBindVertexArray = func.invoke("glBindVertexArray");
            PFN_glDeleteVertexArrays = func.invoke("glDeleteVertexArrays");
            PFN_glGenVertexArrays = func.invoke("glGenVertexArrays");
            PFN_glIsVertexArray = func.invoke("glIsVertexArray");
        }
    }

    public GLARBVertexArrayObject(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void BindVertexArray(@CType("GLuint") int array) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindVertexArray)) throw new SymbolNotFoundError("Symbol not found: glBindVertexArray");
        try { Handles.MH_glBindVertexArray.invokeExact(handles.PFN_glBindVertexArray, array); }
        catch (Throwable e) { throw new RuntimeException("error in glBindVertexArray", e); }
    }

    public void DeleteVertexArrays(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment arrays) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteVertexArrays)) throw new SymbolNotFoundError("Symbol not found: glDeleteVertexArrays");
        try { Handles.MH_glDeleteVertexArrays.invokeExact(handles.PFN_glDeleteVertexArrays, n, arrays); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteVertexArrays", e); }
    }

    public void GenVertexArrays(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment arrays) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenVertexArrays)) throw new SymbolNotFoundError("Symbol not found: glGenVertexArrays");
        try { Handles.MH_glGenVertexArrays.invokeExact(handles.PFN_glGenVertexArrays, n, arrays); }
        catch (Throwable e) { throw new RuntimeException("error in glGenVertexArrays", e); }
    }

    public @CType("GLboolean") boolean IsVertexArray(@CType("GLuint") int array) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsVertexArray)) throw new SymbolNotFoundError("Symbol not found: glIsVertexArray");
        try { return (boolean) Handles.MH_glIsVertexArray.invokeExact(handles.PFN_glIsVertexArray, array); }
        catch (Throwable e) { throw new RuntimeException("error in glIsVertexArray", e); }
    }

}
