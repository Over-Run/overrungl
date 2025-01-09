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

public final class GLAPPLEFence {
    public static final int GL_DRAW_PIXELS_APPLE = 0x8A0A;
    public static final int GL_FENCE_APPLE = 0x8A0B;
    public static final MethodHandle MH_glGenFencesAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glDeleteFencesAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glSetFenceAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glIsFenceAPPLE = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glTestFenceAPPLE = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glFinishFenceAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glTestObjectAPPLE = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glFinishObjectAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGenFencesAPPLE;
    public final MemorySegment PFN_glDeleteFencesAPPLE;
    public final MemorySegment PFN_glSetFenceAPPLE;
    public final MemorySegment PFN_glIsFenceAPPLE;
    public final MemorySegment PFN_glTestFenceAPPLE;
    public final MemorySegment PFN_glFinishFenceAPPLE;
    public final MemorySegment PFN_glTestObjectAPPLE;
    public final MemorySegment PFN_glFinishObjectAPPLE;

    public GLAPPLEFence(overrungl.opengl.GLLoadFunc func) {
        PFN_glGenFencesAPPLE = func.invoke("glGenFencesAPPLE");
        PFN_glDeleteFencesAPPLE = func.invoke("glDeleteFencesAPPLE");
        PFN_glSetFenceAPPLE = func.invoke("glSetFenceAPPLE");
        PFN_glIsFenceAPPLE = func.invoke("glIsFenceAPPLE");
        PFN_glTestFenceAPPLE = func.invoke("glTestFenceAPPLE");
        PFN_glFinishFenceAPPLE = func.invoke("glFinishFenceAPPLE");
        PFN_glTestObjectAPPLE = func.invoke("glTestObjectAPPLE");
        PFN_glFinishObjectAPPLE = func.invoke("glFinishObjectAPPLE");
    }

    public void GenFencesAPPLE(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment fences) {
        if (Unmarshal.isNullPointer(PFN_glGenFencesAPPLE)) throw new SymbolNotFoundError("Symbol not found: glGenFencesAPPLE");
        try { MH_glGenFencesAPPLE.invokeExact(PFN_glGenFencesAPPLE, n, fences); }
        catch (Throwable e) { throw new RuntimeException("error in glGenFencesAPPLE", e); }
    }

    public void DeleteFencesAPPLE(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment fences) {
        if (Unmarshal.isNullPointer(PFN_glDeleteFencesAPPLE)) throw new SymbolNotFoundError("Symbol not found: glDeleteFencesAPPLE");
        try { MH_glDeleteFencesAPPLE.invokeExact(PFN_glDeleteFencesAPPLE, n, fences); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteFencesAPPLE", e); }
    }

    public void SetFenceAPPLE(@CType("GLuint") int fence) {
        if (Unmarshal.isNullPointer(PFN_glSetFenceAPPLE)) throw new SymbolNotFoundError("Symbol not found: glSetFenceAPPLE");
        try { MH_glSetFenceAPPLE.invokeExact(PFN_glSetFenceAPPLE, fence); }
        catch (Throwable e) { throw new RuntimeException("error in glSetFenceAPPLE", e); }
    }

    public @CType("GLboolean") boolean IsFenceAPPLE(@CType("GLuint") int fence) {
        if (Unmarshal.isNullPointer(PFN_glIsFenceAPPLE)) throw new SymbolNotFoundError("Symbol not found: glIsFenceAPPLE");
        try { return (boolean) MH_glIsFenceAPPLE.invokeExact(PFN_glIsFenceAPPLE, fence); }
        catch (Throwable e) { throw new RuntimeException("error in glIsFenceAPPLE", e); }
    }

    public @CType("GLboolean") boolean TestFenceAPPLE(@CType("GLuint") int fence) {
        if (Unmarshal.isNullPointer(PFN_glTestFenceAPPLE)) throw new SymbolNotFoundError("Symbol not found: glTestFenceAPPLE");
        try { return (boolean) MH_glTestFenceAPPLE.invokeExact(PFN_glTestFenceAPPLE, fence); }
        catch (Throwable e) { throw new RuntimeException("error in glTestFenceAPPLE", e); }
    }

    public void FinishFenceAPPLE(@CType("GLuint") int fence) {
        if (Unmarshal.isNullPointer(PFN_glFinishFenceAPPLE)) throw new SymbolNotFoundError("Symbol not found: glFinishFenceAPPLE");
        try { MH_glFinishFenceAPPLE.invokeExact(PFN_glFinishFenceAPPLE, fence); }
        catch (Throwable e) { throw new RuntimeException("error in glFinishFenceAPPLE", e); }
    }

    public @CType("GLboolean") boolean TestObjectAPPLE(@CType("GLenum") int object, @CType("GLuint") int name) {
        if (Unmarshal.isNullPointer(PFN_glTestObjectAPPLE)) throw new SymbolNotFoundError("Symbol not found: glTestObjectAPPLE");
        try { return (boolean) MH_glTestObjectAPPLE.invokeExact(PFN_glTestObjectAPPLE, object, name); }
        catch (Throwable e) { throw new RuntimeException("error in glTestObjectAPPLE", e); }
    }

    public void FinishObjectAPPLE(@CType("GLenum") int object, @CType("GLint") int name) {
        if (Unmarshal.isNullPointer(PFN_glFinishObjectAPPLE)) throw new SymbolNotFoundError("Symbol not found: glFinishObjectAPPLE");
        try { MH_glFinishObjectAPPLE.invokeExact(PFN_glFinishObjectAPPLE, object, name); }
        catch (Throwable e) { throw new RuntimeException("error in glFinishObjectAPPLE", e); }
    }

}
