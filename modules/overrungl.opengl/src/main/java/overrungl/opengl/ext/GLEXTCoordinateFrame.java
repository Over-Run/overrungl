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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glTangent3bEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE);
        public static final FunctionDescriptor FD_glTangent3bvEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTangent3dEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glTangent3dvEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTangent3fEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glTangent3fvEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTangent3iEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTangent3ivEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTangent3sEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glTangent3svEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glBinormal3bEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE);
        public static final FunctionDescriptor FD_glBinormal3bvEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glBinormal3dEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glBinormal3dvEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glBinormal3fEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glBinormal3fvEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glBinormal3iEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBinormal3ivEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glBinormal3sEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glBinormal3svEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTangentPointerEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glBinormalPointerEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glTangent3bEXT = RuntimeHelper.downcall(Descriptors.FD_glTangent3bEXT);
        public static final MethodHandle MH_glTangent3bvEXT = RuntimeHelper.downcall(Descriptors.FD_glTangent3bvEXT);
        public static final MethodHandle MH_glTangent3dEXT = RuntimeHelper.downcall(Descriptors.FD_glTangent3dEXT);
        public static final MethodHandle MH_glTangent3dvEXT = RuntimeHelper.downcall(Descriptors.FD_glTangent3dvEXT);
        public static final MethodHandle MH_glTangent3fEXT = RuntimeHelper.downcall(Descriptors.FD_glTangent3fEXT);
        public static final MethodHandle MH_glTangent3fvEXT = RuntimeHelper.downcall(Descriptors.FD_glTangent3fvEXT);
        public static final MethodHandle MH_glTangent3iEXT = RuntimeHelper.downcall(Descriptors.FD_glTangent3iEXT);
        public static final MethodHandle MH_glTangent3ivEXT = RuntimeHelper.downcall(Descriptors.FD_glTangent3ivEXT);
        public static final MethodHandle MH_glTangent3sEXT = RuntimeHelper.downcall(Descriptors.FD_glTangent3sEXT);
        public static final MethodHandle MH_glTangent3svEXT = RuntimeHelper.downcall(Descriptors.FD_glTangent3svEXT);
        public static final MethodHandle MH_glBinormal3bEXT = RuntimeHelper.downcall(Descriptors.FD_glBinormal3bEXT);
        public static final MethodHandle MH_glBinormal3bvEXT = RuntimeHelper.downcall(Descriptors.FD_glBinormal3bvEXT);
        public static final MethodHandle MH_glBinormal3dEXT = RuntimeHelper.downcall(Descriptors.FD_glBinormal3dEXT);
        public static final MethodHandle MH_glBinormal3dvEXT = RuntimeHelper.downcall(Descriptors.FD_glBinormal3dvEXT);
        public static final MethodHandle MH_glBinormal3fEXT = RuntimeHelper.downcall(Descriptors.FD_glBinormal3fEXT);
        public static final MethodHandle MH_glBinormal3fvEXT = RuntimeHelper.downcall(Descriptors.FD_glBinormal3fvEXT);
        public static final MethodHandle MH_glBinormal3iEXT = RuntimeHelper.downcall(Descriptors.FD_glBinormal3iEXT);
        public static final MethodHandle MH_glBinormal3ivEXT = RuntimeHelper.downcall(Descriptors.FD_glBinormal3ivEXT);
        public static final MethodHandle MH_glBinormal3sEXT = RuntimeHelper.downcall(Descriptors.FD_glBinormal3sEXT);
        public static final MethodHandle MH_glBinormal3svEXT = RuntimeHelper.downcall(Descriptors.FD_glBinormal3svEXT);
        public static final MethodHandle MH_glTangentPointerEXT = RuntimeHelper.downcall(Descriptors.FD_glTangentPointerEXT);
        public static final MethodHandle MH_glBinormalPointerEXT = RuntimeHelper.downcall(Descriptors.FD_glBinormalPointerEXT);
        public final MemorySegment PFN_glTangent3bEXT;
        public final MemorySegment PFN_glTangent3bvEXT;
        public final MemorySegment PFN_glTangent3dEXT;
        public final MemorySegment PFN_glTangent3dvEXT;
        public final MemorySegment PFN_glTangent3fEXT;
        public final MemorySegment PFN_glTangent3fvEXT;
        public final MemorySegment PFN_glTangent3iEXT;
        public final MemorySegment PFN_glTangent3ivEXT;
        public final MemorySegment PFN_glTangent3sEXT;
        public final MemorySegment PFN_glTangent3svEXT;
        public final MemorySegment PFN_glBinormal3bEXT;
        public final MemorySegment PFN_glBinormal3bvEXT;
        public final MemorySegment PFN_glBinormal3dEXT;
        public final MemorySegment PFN_glBinormal3dvEXT;
        public final MemorySegment PFN_glBinormal3fEXT;
        public final MemorySegment PFN_glBinormal3fvEXT;
        public final MemorySegment PFN_glBinormal3iEXT;
        public final MemorySegment PFN_glBinormal3ivEXT;
        public final MemorySegment PFN_glBinormal3sEXT;
        public final MemorySegment PFN_glBinormal3svEXT;
        public final MemorySegment PFN_glTangentPointerEXT;
        public final MemorySegment PFN_glBinormalPointerEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
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
    }

    public GLEXTCoordinateFrame(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void Tangent3bEXT(@CType("GLbyte") byte tx, @CType("GLbyte") byte ty, @CType("GLbyte") byte tz) {
        if (Unmarshal.isNullPointer(handles.PFN_glTangent3bEXT)) throw new SymbolNotFoundError("Symbol not found: glTangent3bEXT");
        try { Handles.MH_glTangent3bEXT.invokeExact(handles.PFN_glTangent3bEXT, tx, ty, tz); }
        catch (Throwable e) { throw new RuntimeException("error in glTangent3bEXT", e); }
    }

    public void Tangent3bvEXT(@CType("const GLbyte *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glTangent3bvEXT)) throw new SymbolNotFoundError("Symbol not found: glTangent3bvEXT");
        try { Handles.MH_glTangent3bvEXT.invokeExact(handles.PFN_glTangent3bvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in glTangent3bvEXT", e); }
    }

    public void Tangent3dEXT(@CType("GLdouble") double tx, @CType("GLdouble") double ty, @CType("GLdouble") double tz) {
        if (Unmarshal.isNullPointer(handles.PFN_glTangent3dEXT)) throw new SymbolNotFoundError("Symbol not found: glTangent3dEXT");
        try { Handles.MH_glTangent3dEXT.invokeExact(handles.PFN_glTangent3dEXT, tx, ty, tz); }
        catch (Throwable e) { throw new RuntimeException("error in glTangent3dEXT", e); }
    }

    public void Tangent3dvEXT(@CType("const GLdouble *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glTangent3dvEXT)) throw new SymbolNotFoundError("Symbol not found: glTangent3dvEXT");
        try { Handles.MH_glTangent3dvEXT.invokeExact(handles.PFN_glTangent3dvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in glTangent3dvEXT", e); }
    }

    public void Tangent3fEXT(@CType("GLfloat") float tx, @CType("GLfloat") float ty, @CType("GLfloat") float tz) {
        if (Unmarshal.isNullPointer(handles.PFN_glTangent3fEXT)) throw new SymbolNotFoundError("Symbol not found: glTangent3fEXT");
        try { Handles.MH_glTangent3fEXT.invokeExact(handles.PFN_glTangent3fEXT, tx, ty, tz); }
        catch (Throwable e) { throw new RuntimeException("error in glTangent3fEXT", e); }
    }

    public void Tangent3fvEXT(@CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glTangent3fvEXT)) throw new SymbolNotFoundError("Symbol not found: glTangent3fvEXT");
        try { Handles.MH_glTangent3fvEXT.invokeExact(handles.PFN_glTangent3fvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in glTangent3fvEXT", e); }
    }

    public void Tangent3iEXT(@CType("GLint") int tx, @CType("GLint") int ty, @CType("GLint") int tz) {
        if (Unmarshal.isNullPointer(handles.PFN_glTangent3iEXT)) throw new SymbolNotFoundError("Symbol not found: glTangent3iEXT");
        try { Handles.MH_glTangent3iEXT.invokeExact(handles.PFN_glTangent3iEXT, tx, ty, tz); }
        catch (Throwable e) { throw new RuntimeException("error in glTangent3iEXT", e); }
    }

    public void Tangent3ivEXT(@CType("const GLint *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glTangent3ivEXT)) throw new SymbolNotFoundError("Symbol not found: glTangent3ivEXT");
        try { Handles.MH_glTangent3ivEXT.invokeExact(handles.PFN_glTangent3ivEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in glTangent3ivEXT", e); }
    }

    public void Tangent3sEXT(@CType("GLshort") short tx, @CType("GLshort") short ty, @CType("GLshort") short tz) {
        if (Unmarshal.isNullPointer(handles.PFN_glTangent3sEXT)) throw new SymbolNotFoundError("Symbol not found: glTangent3sEXT");
        try { Handles.MH_glTangent3sEXT.invokeExact(handles.PFN_glTangent3sEXT, tx, ty, tz); }
        catch (Throwable e) { throw new RuntimeException("error in glTangent3sEXT", e); }
    }

    public void Tangent3svEXT(@CType("const GLshort *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glTangent3svEXT)) throw new SymbolNotFoundError("Symbol not found: glTangent3svEXT");
        try { Handles.MH_glTangent3svEXT.invokeExact(handles.PFN_glTangent3svEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in glTangent3svEXT", e); }
    }

    public void Binormal3bEXT(@CType("GLbyte") byte bx, @CType("GLbyte") byte by, @CType("GLbyte") byte bz) {
        if (Unmarshal.isNullPointer(handles.PFN_glBinormal3bEXT)) throw new SymbolNotFoundError("Symbol not found: glBinormal3bEXT");
        try { Handles.MH_glBinormal3bEXT.invokeExact(handles.PFN_glBinormal3bEXT, bx, by, bz); }
        catch (Throwable e) { throw new RuntimeException("error in glBinormal3bEXT", e); }
    }

    public void Binormal3bvEXT(@CType("const GLbyte *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glBinormal3bvEXT)) throw new SymbolNotFoundError("Symbol not found: glBinormal3bvEXT");
        try { Handles.MH_glBinormal3bvEXT.invokeExact(handles.PFN_glBinormal3bvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in glBinormal3bvEXT", e); }
    }

    public void Binormal3dEXT(@CType("GLdouble") double bx, @CType("GLdouble") double by, @CType("GLdouble") double bz) {
        if (Unmarshal.isNullPointer(handles.PFN_glBinormal3dEXT)) throw new SymbolNotFoundError("Symbol not found: glBinormal3dEXT");
        try { Handles.MH_glBinormal3dEXT.invokeExact(handles.PFN_glBinormal3dEXT, bx, by, bz); }
        catch (Throwable e) { throw new RuntimeException("error in glBinormal3dEXT", e); }
    }

    public void Binormal3dvEXT(@CType("const GLdouble *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glBinormal3dvEXT)) throw new SymbolNotFoundError("Symbol not found: glBinormal3dvEXT");
        try { Handles.MH_glBinormal3dvEXT.invokeExact(handles.PFN_glBinormal3dvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in glBinormal3dvEXT", e); }
    }

    public void Binormal3fEXT(@CType("GLfloat") float bx, @CType("GLfloat") float by, @CType("GLfloat") float bz) {
        if (Unmarshal.isNullPointer(handles.PFN_glBinormal3fEXT)) throw new SymbolNotFoundError("Symbol not found: glBinormal3fEXT");
        try { Handles.MH_glBinormal3fEXT.invokeExact(handles.PFN_glBinormal3fEXT, bx, by, bz); }
        catch (Throwable e) { throw new RuntimeException("error in glBinormal3fEXT", e); }
    }

    public void Binormal3fvEXT(@CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glBinormal3fvEXT)) throw new SymbolNotFoundError("Symbol not found: glBinormal3fvEXT");
        try { Handles.MH_glBinormal3fvEXT.invokeExact(handles.PFN_glBinormal3fvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in glBinormal3fvEXT", e); }
    }

    public void Binormal3iEXT(@CType("GLint") int bx, @CType("GLint") int by, @CType("GLint") int bz) {
        if (Unmarshal.isNullPointer(handles.PFN_glBinormal3iEXT)) throw new SymbolNotFoundError("Symbol not found: glBinormal3iEXT");
        try { Handles.MH_glBinormal3iEXT.invokeExact(handles.PFN_glBinormal3iEXT, bx, by, bz); }
        catch (Throwable e) { throw new RuntimeException("error in glBinormal3iEXT", e); }
    }

    public void Binormal3ivEXT(@CType("const GLint *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glBinormal3ivEXT)) throw new SymbolNotFoundError("Symbol not found: glBinormal3ivEXT");
        try { Handles.MH_glBinormal3ivEXT.invokeExact(handles.PFN_glBinormal3ivEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in glBinormal3ivEXT", e); }
    }

    public void Binormal3sEXT(@CType("GLshort") short bx, @CType("GLshort") short by, @CType("GLshort") short bz) {
        if (Unmarshal.isNullPointer(handles.PFN_glBinormal3sEXT)) throw new SymbolNotFoundError("Symbol not found: glBinormal3sEXT");
        try { Handles.MH_glBinormal3sEXT.invokeExact(handles.PFN_glBinormal3sEXT, bx, by, bz); }
        catch (Throwable e) { throw new RuntimeException("error in glBinormal3sEXT", e); }
    }

    public void Binormal3svEXT(@CType("const GLshort *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glBinormal3svEXT)) throw new SymbolNotFoundError("Symbol not found: glBinormal3svEXT");
        try { Handles.MH_glBinormal3svEXT.invokeExact(handles.PFN_glBinormal3svEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in glBinormal3svEXT", e); }
    }

    public void TangentPointerEXT(@CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glTangentPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glTangentPointerEXT");
        try { Handles.MH_glTangentPointerEXT.invokeExact(handles.PFN_glTangentPointerEXT, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glTangentPointerEXT", e); }
    }

    public void BinormalPointerEXT(@CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glBinormalPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glBinormalPointerEXT");
        try { Handles.MH_glBinormalPointerEXT.invokeExact(handles.PFN_glBinormalPointerEXT, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glBinormalPointerEXT", e); }
    }

}
