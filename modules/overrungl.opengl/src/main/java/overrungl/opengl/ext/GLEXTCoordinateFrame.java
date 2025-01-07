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

public final class GLEXTCoordinateFrame {
    public static final int GL_TANGENT_ARRAY_EXT = 0x8439;
    public static final int GL_BINORMAL_ARRAY_EXT = 0x843A;
    public static final int GL_CURRENT_TANGENT_EXT = 0x843B;
    public static final int GL_CURRENT_BINORMAL_EXT = 0x843C;
    public static final int GL_TANGENT_ARRAY_TYPE_EXT = 0x843E;
    public static final int GL_TANGENT_ARRAY_STRIDE_EXT = 0x843F;
    public static final int GL_BINORMAL_ARRAY_TYPE_EXT = 0x8440;
    public static final int GL_BINORMAL_ARRAY_STRIDE_EXT = 0x8441;
    public static final int GL_TANGENT_ARRAY_POINTER_EXT = 0x8442;
    public static final int GL_BINORMAL_ARRAY_POINTER_EXT = 0x8443;
    public static final int GL_MAP1_TANGENT_EXT = 0x8444;
    public static final int GL_MAP2_TANGENT_EXT = 0x8445;
    public static final int GL_MAP1_BINORMAL_EXT = 0x8446;
    public static final int GL_MAP2_BINORMAL_EXT = 0x8447;
    public static final MethodHandle MH_glTangent3bEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
    public final MemorySegment PFN_glTangent3bEXT;
    public static final MethodHandle MH_glTangent3bvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTangent3bvEXT;
    public static final MethodHandle MH_glTangent3dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glTangent3dEXT;
    public static final MethodHandle MH_glTangent3dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTangent3dvEXT;
    public static final MethodHandle MH_glTangent3fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glTangent3fEXT;
    public static final MethodHandle MH_glTangent3fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTangent3fvEXT;
    public static final MethodHandle MH_glTangent3iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTangent3iEXT;
    public static final MethodHandle MH_glTangent3ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTangent3ivEXT;
    public static final MethodHandle MH_glTangent3sEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glTangent3sEXT;
    public static final MethodHandle MH_glTangent3svEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTangent3svEXT;
    public static final MethodHandle MH_glBinormal3bEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
    public final MemorySegment PFN_glBinormal3bEXT;
    public static final MethodHandle MH_glBinormal3bvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBinormal3bvEXT;
    public static final MethodHandle MH_glBinormal3dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glBinormal3dEXT;
    public static final MethodHandle MH_glBinormal3dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBinormal3dvEXT;
    public static final MethodHandle MH_glBinormal3fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glBinormal3fEXT;
    public static final MethodHandle MH_glBinormal3fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBinormal3fvEXT;
    public static final MethodHandle MH_glBinormal3iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBinormal3iEXT;
    public static final MethodHandle MH_glBinormal3ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBinormal3ivEXT;
    public static final MethodHandle MH_glBinormal3sEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glBinormal3sEXT;
    public static final MethodHandle MH_glBinormal3svEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBinormal3svEXT;
    public static final MethodHandle MH_glTangentPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTangentPointerEXT;
    public static final MethodHandle MH_glBinormalPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBinormalPointerEXT;

    public GLEXTCoordinateFrame(overrungl.opengl.GLLoadFunc func) {
        PFN_glTangent3bEXT = func.invoke("glTangent3bEXT");
        PFN_glTangent3bvEXT = func.invoke("glTangent3bvEXT");
        PFN_glTangent3dEXT = func.invoke("glTangent3dEXT");
        PFN_glTangent3dvEXT = func.invoke("glTangent3dvEXT");
        PFN_glTangent3fEXT = func.invoke("glTangent3fEXT");
        PFN_glTangent3fvEXT = func.invoke("glTangent3fvEXT");
        PFN_glTangent3iEXT = func.invoke("glTangent3iEXT");
        PFN_glTangent3ivEXT = func.invoke("glTangent3ivEXT");
        PFN_glTangent3sEXT = func.invoke("glTangent3sEXT");
        PFN_glTangent3svEXT = func.invoke("glTangent3svEXT");
        PFN_glBinormal3bEXT = func.invoke("glBinormal3bEXT");
        PFN_glBinormal3bvEXT = func.invoke("glBinormal3bvEXT");
        PFN_glBinormal3dEXT = func.invoke("glBinormal3dEXT");
        PFN_glBinormal3dvEXT = func.invoke("glBinormal3dvEXT");
        PFN_glBinormal3fEXT = func.invoke("glBinormal3fEXT");
        PFN_glBinormal3fvEXT = func.invoke("glBinormal3fvEXT");
        PFN_glBinormal3iEXT = func.invoke("glBinormal3iEXT");
        PFN_glBinormal3ivEXT = func.invoke("glBinormal3ivEXT");
        PFN_glBinormal3sEXT = func.invoke("glBinormal3sEXT");
        PFN_glBinormal3svEXT = func.invoke("glBinormal3svEXT");
        PFN_glTangentPointerEXT = func.invoke("glTangentPointerEXT");
        PFN_glBinormalPointerEXT = func.invoke("glBinormalPointerEXT");
    }

    public void Tangent3bEXT(@CType("GLbyte") byte tx, @CType("GLbyte") byte ty, @CType("GLbyte") byte tz) {
        if (!Unmarshal.isNullPointer(PFN_glTangent3bEXT)) { try {
            MH_glTangent3bEXT.invokeExact(PFN_glTangent3bEXT, tx, ty, tz);
        } catch (Throwable e) { throw new RuntimeException("error in glTangent3bEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTangent3bEXT"); }
    }

    public void Tangent3bvEXT(@CType("const GLbyte *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glTangent3bvEXT)) { try {
            MH_glTangent3bvEXT.invokeExact(PFN_glTangent3bvEXT, v);
        } catch (Throwable e) { throw new RuntimeException("error in glTangent3bvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTangent3bvEXT"); }
    }

    public void Tangent3dEXT(@CType("GLdouble") double tx, @CType("GLdouble") double ty, @CType("GLdouble") double tz) {
        if (!Unmarshal.isNullPointer(PFN_glTangent3dEXT)) { try {
            MH_glTangent3dEXT.invokeExact(PFN_glTangent3dEXT, tx, ty, tz);
        } catch (Throwable e) { throw new RuntimeException("error in glTangent3dEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTangent3dEXT"); }
    }

    public void Tangent3dvEXT(@CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glTangent3dvEXT)) { try {
            MH_glTangent3dvEXT.invokeExact(PFN_glTangent3dvEXT, v);
        } catch (Throwable e) { throw new RuntimeException("error in glTangent3dvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTangent3dvEXT"); }
    }

    public void Tangent3fEXT(@CType("GLfloat") float tx, @CType("GLfloat") float ty, @CType("GLfloat") float tz) {
        if (!Unmarshal.isNullPointer(PFN_glTangent3fEXT)) { try {
            MH_glTangent3fEXT.invokeExact(PFN_glTangent3fEXT, tx, ty, tz);
        } catch (Throwable e) { throw new RuntimeException("error in glTangent3fEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTangent3fEXT"); }
    }

    public void Tangent3fvEXT(@CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glTangent3fvEXT)) { try {
            MH_glTangent3fvEXT.invokeExact(PFN_glTangent3fvEXT, v);
        } catch (Throwable e) { throw new RuntimeException("error in glTangent3fvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTangent3fvEXT"); }
    }

    public void Tangent3iEXT(@CType("GLint") int tx, @CType("GLint") int ty, @CType("GLint") int tz) {
        if (!Unmarshal.isNullPointer(PFN_glTangent3iEXT)) { try {
            MH_glTangent3iEXT.invokeExact(PFN_glTangent3iEXT, tx, ty, tz);
        } catch (Throwable e) { throw new RuntimeException("error in glTangent3iEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTangent3iEXT"); }
    }

    public void Tangent3ivEXT(@CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glTangent3ivEXT)) { try {
            MH_glTangent3ivEXT.invokeExact(PFN_glTangent3ivEXT, v);
        } catch (Throwable e) { throw new RuntimeException("error in glTangent3ivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTangent3ivEXT"); }
    }

    public void Tangent3sEXT(@CType("GLshort") short tx, @CType("GLshort") short ty, @CType("GLshort") short tz) {
        if (!Unmarshal.isNullPointer(PFN_glTangent3sEXT)) { try {
            MH_glTangent3sEXT.invokeExact(PFN_glTangent3sEXT, tx, ty, tz);
        } catch (Throwable e) { throw new RuntimeException("error in glTangent3sEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTangent3sEXT"); }
    }

    public void Tangent3svEXT(@CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glTangent3svEXT)) { try {
            MH_glTangent3svEXT.invokeExact(PFN_glTangent3svEXT, v);
        } catch (Throwable e) { throw new RuntimeException("error in glTangent3svEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTangent3svEXT"); }
    }

    public void Binormal3bEXT(@CType("GLbyte") byte bx, @CType("GLbyte") byte by, @CType("GLbyte") byte bz) {
        if (!Unmarshal.isNullPointer(PFN_glBinormal3bEXT)) { try {
            MH_glBinormal3bEXT.invokeExact(PFN_glBinormal3bEXT, bx, by, bz);
        } catch (Throwable e) { throw new RuntimeException("error in glBinormal3bEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBinormal3bEXT"); }
    }

    public void Binormal3bvEXT(@CType("const GLbyte *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glBinormal3bvEXT)) { try {
            MH_glBinormal3bvEXT.invokeExact(PFN_glBinormal3bvEXT, v);
        } catch (Throwable e) { throw new RuntimeException("error in glBinormal3bvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBinormal3bvEXT"); }
    }

    public void Binormal3dEXT(@CType("GLdouble") double bx, @CType("GLdouble") double by, @CType("GLdouble") double bz) {
        if (!Unmarshal.isNullPointer(PFN_glBinormal3dEXT)) { try {
            MH_glBinormal3dEXT.invokeExact(PFN_glBinormal3dEXT, bx, by, bz);
        } catch (Throwable e) { throw new RuntimeException("error in glBinormal3dEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBinormal3dEXT"); }
    }

    public void Binormal3dvEXT(@CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glBinormal3dvEXT)) { try {
            MH_glBinormal3dvEXT.invokeExact(PFN_glBinormal3dvEXT, v);
        } catch (Throwable e) { throw new RuntimeException("error in glBinormal3dvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBinormal3dvEXT"); }
    }

    public void Binormal3fEXT(@CType("GLfloat") float bx, @CType("GLfloat") float by, @CType("GLfloat") float bz) {
        if (!Unmarshal.isNullPointer(PFN_glBinormal3fEXT)) { try {
            MH_glBinormal3fEXT.invokeExact(PFN_glBinormal3fEXT, bx, by, bz);
        } catch (Throwable e) { throw new RuntimeException("error in glBinormal3fEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBinormal3fEXT"); }
    }

    public void Binormal3fvEXT(@CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glBinormal3fvEXT)) { try {
            MH_glBinormal3fvEXT.invokeExact(PFN_glBinormal3fvEXT, v);
        } catch (Throwable e) { throw new RuntimeException("error in glBinormal3fvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBinormal3fvEXT"); }
    }

    public void Binormal3iEXT(@CType("GLint") int bx, @CType("GLint") int by, @CType("GLint") int bz) {
        if (!Unmarshal.isNullPointer(PFN_glBinormal3iEXT)) { try {
            MH_glBinormal3iEXT.invokeExact(PFN_glBinormal3iEXT, bx, by, bz);
        } catch (Throwable e) { throw new RuntimeException("error in glBinormal3iEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBinormal3iEXT"); }
    }

    public void Binormal3ivEXT(@CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glBinormal3ivEXT)) { try {
            MH_glBinormal3ivEXT.invokeExact(PFN_glBinormal3ivEXT, v);
        } catch (Throwable e) { throw new RuntimeException("error in glBinormal3ivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBinormal3ivEXT"); }
    }

    public void Binormal3sEXT(@CType("GLshort") short bx, @CType("GLshort") short by, @CType("GLshort") short bz) {
        if (!Unmarshal.isNullPointer(PFN_glBinormal3sEXT)) { try {
            MH_glBinormal3sEXT.invokeExact(PFN_glBinormal3sEXT, bx, by, bz);
        } catch (Throwable e) { throw new RuntimeException("error in glBinormal3sEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBinormal3sEXT"); }
    }

    public void Binormal3svEXT(@CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glBinormal3svEXT)) { try {
            MH_glBinormal3svEXT.invokeExact(PFN_glBinormal3svEXT, v);
        } catch (Throwable e) { throw new RuntimeException("error in glBinormal3svEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBinormal3svEXT"); }
    }

    public void TangentPointerEXT(@CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (!Unmarshal.isNullPointer(PFN_glTangentPointerEXT)) { try {
            MH_glTangentPointerEXT.invokeExact(PFN_glTangentPointerEXT, type, stride, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glTangentPointerEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTangentPointerEXT"); }
    }

    public void BinormalPointerEXT(@CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (!Unmarshal.isNullPointer(PFN_glBinormalPointerEXT)) { try {
            MH_glBinormalPointerEXT.invokeExact(PFN_glBinormalPointerEXT, type, stride, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glBinormalPointerEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBinormalPointerEXT"); }
    }

}
