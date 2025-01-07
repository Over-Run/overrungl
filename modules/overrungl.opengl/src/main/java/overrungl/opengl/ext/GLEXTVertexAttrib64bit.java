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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTVertexAttrib64bit {
    public static final int GL_DOUBLE = 0x140A;
    public static final int GL_DOUBLE_VEC2_EXT = 0x8FFC;
    public static final int GL_DOUBLE_VEC3_EXT = 0x8FFD;
    public static final int GL_DOUBLE_VEC4_EXT = 0x8FFE;
    public static final int GL_DOUBLE_MAT2_EXT = 0x8F46;
    public static final int GL_DOUBLE_MAT3_EXT = 0x8F47;
    public static final int GL_DOUBLE_MAT4_EXT = 0x8F48;
    public static final int GL_DOUBLE_MAT2x3_EXT = 0x8F49;
    public static final int GL_DOUBLE_MAT2x4_EXT = 0x8F4A;
    public static final int GL_DOUBLE_MAT3x2_EXT = 0x8F4B;
    public static final int GL_DOUBLE_MAT3x4_EXT = 0x8F4C;
    public static final int GL_DOUBLE_MAT4x2_EXT = 0x8F4D;
    public static final int GL_DOUBLE_MAT4x3_EXT = 0x8F4E;
    public static final MethodHandle MH_glVertexAttribL1dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glVertexAttribL1dEXT;
    public static final MethodHandle MH_glVertexAttribL2dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glVertexAttribL2dEXT;
    public static final MethodHandle MH_glVertexAttribL3dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glVertexAttribL3dEXT;
    public static final MethodHandle MH_glVertexAttribL4dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glVertexAttribL4dEXT;
    public static final MethodHandle MH_glVertexAttribL1dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribL1dvEXT;
    public static final MethodHandle MH_glVertexAttribL2dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribL2dvEXT;
    public static final MethodHandle MH_glVertexAttribL3dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribL3dvEXT;
    public static final MethodHandle MH_glVertexAttribL4dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribL4dvEXT;
    public static final MethodHandle MH_glVertexAttribLPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribLPointerEXT;
    public static final MethodHandle MH_glGetVertexAttribLdvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexAttribLdvEXT;

    public GLEXTVertexAttrib64bit(overrungl.opengl.GLLoadFunc func) {
        PFN_glVertexAttribL1dEXT = func.invoke("glVertexAttribL1dEXT", "glVertexAttribL1d");
        PFN_glVertexAttribL2dEXT = func.invoke("glVertexAttribL2dEXT", "glVertexAttribL2d");
        PFN_glVertexAttribL3dEXT = func.invoke("glVertexAttribL3dEXT", "glVertexAttribL3d");
        PFN_glVertexAttribL4dEXT = func.invoke("glVertexAttribL4dEXT", "glVertexAttribL4d");
        PFN_glVertexAttribL1dvEXT = func.invoke("glVertexAttribL1dvEXT", "glVertexAttribL1dv");
        PFN_glVertexAttribL2dvEXT = func.invoke("glVertexAttribL2dvEXT", "glVertexAttribL2dv");
        PFN_glVertexAttribL3dvEXT = func.invoke("glVertexAttribL3dvEXT", "glVertexAttribL3dv");
        PFN_glVertexAttribL4dvEXT = func.invoke("glVertexAttribL4dvEXT", "glVertexAttribL4dv");
        PFN_glVertexAttribLPointerEXT = func.invoke("glVertexAttribLPointerEXT", "glVertexAttribLPointer");
        PFN_glGetVertexAttribLdvEXT = func.invoke("glGetVertexAttribLdvEXT", "glGetVertexAttribLdv");
    }

    public void VertexAttribL1dEXT(@CType("GLuint") int index, @CType("GLdouble") double x) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL1dEXT)) { try {
            MH_glVertexAttribL1dEXT.invokeExact(PFN_glVertexAttribL1dEXT, index, x);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1dEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1dEXT"); }
    }

    public void VertexAttribL2dEXT(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL2dEXT)) { try {
            MH_glVertexAttribL2dEXT.invokeExact(PFN_glVertexAttribL2dEXT, index, x, y);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL2dEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL2dEXT"); }
    }

    public void VertexAttribL3dEXT(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL3dEXT)) { try {
            MH_glVertexAttribL3dEXT.invokeExact(PFN_glVertexAttribL3dEXT, index, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL3dEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL3dEXT"); }
    }

    public void VertexAttribL4dEXT(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL4dEXT)) { try {
            MH_glVertexAttribL4dEXT.invokeExact(PFN_glVertexAttribL4dEXT, index, x, y, z, w);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL4dEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL4dEXT"); }
    }

    public void VertexAttribL1dvEXT(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL1dvEXT)) { try {
            MH_glVertexAttribL1dvEXT.invokeExact(PFN_glVertexAttribL1dvEXT, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1dvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1dvEXT"); }
    }

    public void VertexAttribL2dvEXT(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL2dvEXT)) { try {
            MH_glVertexAttribL2dvEXT.invokeExact(PFN_glVertexAttribL2dvEXT, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL2dvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL2dvEXT"); }
    }

    public void VertexAttribL3dvEXT(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL3dvEXT)) { try {
            MH_glVertexAttribL3dvEXT.invokeExact(PFN_glVertexAttribL3dvEXT, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL3dvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL3dvEXT"); }
    }

    public void VertexAttribL4dvEXT(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribL4dvEXT)) { try {
            MH_glVertexAttribL4dvEXT.invokeExact(PFN_glVertexAttribL4dvEXT, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL4dvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribL4dvEXT"); }
    }

    public void VertexAttribLPointerEXT(@CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribLPointerEXT)) { try {
            MH_glVertexAttribLPointerEXT.invokeExact(PFN_glVertexAttribLPointerEXT, index, size, type, stride, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribLPointerEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribLPointerEXT"); }
    }

    public void GetVertexAttribLdvEXT(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetVertexAttribLdvEXT)) { try {
            MH_glGetVertexAttribLdvEXT.invokeExact(PFN_glGetVertexAttribLdvEXT, index, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribLdvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribLdvEXT"); }
    }

}
