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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAPPLEVertexArrayObject {
    public static final int GL_VERTEX_ARRAY_BINDING_APPLE = 0x85B5;
    public static final MethodHandle MH_glBindVertexArrayAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindVertexArrayAPPLE;
    public static final MethodHandle MH_glDeleteVertexArraysAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteVertexArraysAPPLE;
    public static final MethodHandle MH_glGenVertexArraysAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenVertexArraysAPPLE;
    public static final MethodHandle MH_glIsVertexArrayAPPLE = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsVertexArrayAPPLE;

    public GLAPPLEVertexArrayObject(overrungl.opengl.GLLoadFunc func) {
        PFN_glBindVertexArrayAPPLE = func.invoke("glBindVertexArrayAPPLE");
        PFN_glDeleteVertexArraysAPPLE = func.invoke("glDeleteVertexArraysAPPLE", "glDeleteVertexArrays");
        PFN_glGenVertexArraysAPPLE = func.invoke("glGenVertexArraysAPPLE", "glGenVertexArrays");
        PFN_glIsVertexArrayAPPLE = func.invoke("glIsVertexArrayAPPLE", "glIsVertexArray");
    }

    public void BindVertexArrayAPPLE(@CType("GLuint") int array) {
        if (!Unmarshal.isNullPointer(PFN_glBindVertexArrayAPPLE)) { try {
            MH_glBindVertexArrayAPPLE.invokeExact(PFN_glBindVertexArrayAPPLE, array);
        } catch (Throwable e) { throw new RuntimeException("error in glBindVertexArrayAPPLE", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBindVertexArrayAPPLE"); }
    }

    public void DeleteVertexArraysAPPLE(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment arrays) {
        if (!Unmarshal.isNullPointer(PFN_glDeleteVertexArraysAPPLE)) { try {
            MH_glDeleteVertexArraysAPPLE.invokeExact(PFN_glDeleteVertexArraysAPPLE, n, arrays);
        } catch (Throwable e) { throw new RuntimeException("error in glDeleteVertexArraysAPPLE", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDeleteVertexArraysAPPLE"); }
    }

    public void GenVertexArraysAPPLE(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment arrays) {
        if (!Unmarshal.isNullPointer(PFN_glGenVertexArraysAPPLE)) { try {
            MH_glGenVertexArraysAPPLE.invokeExact(PFN_glGenVertexArraysAPPLE, n, arrays);
        } catch (Throwable e) { throw new RuntimeException("error in glGenVertexArraysAPPLE", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGenVertexArraysAPPLE"); }
    }

    public @CType("GLboolean") boolean IsVertexArrayAPPLE(@CType("GLuint") int array) {
        if (!Unmarshal.isNullPointer(PFN_glIsVertexArrayAPPLE)) { try {
            return (boolean) MH_glIsVertexArrayAPPLE.invokeExact(PFN_glIsVertexArrayAPPLE, array);
        } catch (Throwable e) { throw new RuntimeException("error in glIsVertexArrayAPPLE", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glIsVertexArrayAPPLE"); }
    }

}
