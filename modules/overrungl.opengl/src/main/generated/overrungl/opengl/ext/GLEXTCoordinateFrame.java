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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

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
    public static final class Handles {
        public static final MethodHandle MH_glTangent3bEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTangent3bvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTangent3dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glTangent3dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTangent3fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glTangent3fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTangent3iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTangent3ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTangent3sEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glTangent3svEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBinormal3bEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glBinormal3bvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBinormal3dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glBinormal3dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBinormal3fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glBinormal3fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBinormal3iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBinormal3ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBinormal3sEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glBinormal3svEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTangentPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBinormalPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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

    /// ```
    /// void glTangent3bEXT(((signed char) khronos_int8_t) GLbyte tx, ((signed char) khronos_int8_t) GLbyte ty, ((signed char) khronos_int8_t) GLbyte tz);
    /// ```
    public void Tangent3bEXT(byte tx, byte ty, byte tz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTangent3bEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTangent3bEXT");
        try { Handles.MH_glTangent3bEXT.invokeExact(handles.PFN_glTangent3bEXT, tx, ty, tz); }
        catch (Throwable e) { throw new RuntimeException("error in Tangent3bEXT", e); }
    }

    /// ```
    /// void glTangent3bvEXT(const GLbyte* v);
    /// ```
    public void Tangent3bvEXT(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTangent3bvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTangent3bvEXT");
        try { Handles.MH_glTangent3bvEXT.invokeExact(handles.PFN_glTangent3bvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in Tangent3bvEXT", e); }
    }

    /// ```
    /// void glTangent3dEXT((double) GLdouble tx, (double) GLdouble ty, (double) GLdouble tz);
    /// ```
    public void Tangent3dEXT(double tx, double ty, double tz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTangent3dEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTangent3dEXT");
        try { Handles.MH_glTangent3dEXT.invokeExact(handles.PFN_glTangent3dEXT, tx, ty, tz); }
        catch (Throwable e) { throw new RuntimeException("error in Tangent3dEXT", e); }
    }

    /// ```
    /// void glTangent3dvEXT(const GLdouble* v);
    /// ```
    public void Tangent3dvEXT(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTangent3dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTangent3dvEXT");
        try { Handles.MH_glTangent3dvEXT.invokeExact(handles.PFN_glTangent3dvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in Tangent3dvEXT", e); }
    }

    /// ```
    /// void glTangent3fEXT(((float) khronos_float_t) GLfloat tx, ((float) khronos_float_t) GLfloat ty, ((float) khronos_float_t) GLfloat tz);
    /// ```
    public void Tangent3fEXT(float tx, float ty, float tz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTangent3fEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTangent3fEXT");
        try { Handles.MH_glTangent3fEXT.invokeExact(handles.PFN_glTangent3fEXT, tx, ty, tz); }
        catch (Throwable e) { throw new RuntimeException("error in Tangent3fEXT", e); }
    }

    /// ```
    /// void glTangent3fvEXT(const GLfloat* v);
    /// ```
    public void Tangent3fvEXT(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTangent3fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTangent3fvEXT");
        try { Handles.MH_glTangent3fvEXT.invokeExact(handles.PFN_glTangent3fvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in Tangent3fvEXT", e); }
    }

    /// ```
    /// void glTangent3iEXT((int) GLint tx, (int) GLint ty, (int) GLint tz);
    /// ```
    public void Tangent3iEXT(int tx, int ty, int tz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTangent3iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTangent3iEXT");
        try { Handles.MH_glTangent3iEXT.invokeExact(handles.PFN_glTangent3iEXT, tx, ty, tz); }
        catch (Throwable e) { throw new RuntimeException("error in Tangent3iEXT", e); }
    }

    /// ```
    /// void glTangent3ivEXT(const GLint* v);
    /// ```
    public void Tangent3ivEXT(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTangent3ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTangent3ivEXT");
        try { Handles.MH_glTangent3ivEXT.invokeExact(handles.PFN_glTangent3ivEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in Tangent3ivEXT", e); }
    }

    /// ```
    /// void glTangent3sEXT(((signed short) khronos_int16_t) GLshort tx, ((signed short) khronos_int16_t) GLshort ty, ((signed short) khronos_int16_t) GLshort tz);
    /// ```
    public void Tangent3sEXT(short tx, short ty, short tz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTangent3sEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTangent3sEXT");
        try { Handles.MH_glTangent3sEXT.invokeExact(handles.PFN_glTangent3sEXT, tx, ty, tz); }
        catch (Throwable e) { throw new RuntimeException("error in Tangent3sEXT", e); }
    }

    /// ```
    /// void glTangent3svEXT(const GLshort* v);
    /// ```
    public void Tangent3svEXT(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTangent3svEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTangent3svEXT");
        try { Handles.MH_glTangent3svEXT.invokeExact(handles.PFN_glTangent3svEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in Tangent3svEXT", e); }
    }

    /// ```
    /// void glBinormal3bEXT(((signed char) khronos_int8_t) GLbyte bx, ((signed char) khronos_int8_t) GLbyte by, ((signed char) khronos_int8_t) GLbyte bz);
    /// ```
    public void Binormal3bEXT(byte bx, byte by, byte bz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBinormal3bEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBinormal3bEXT");
        try { Handles.MH_glBinormal3bEXT.invokeExact(handles.PFN_glBinormal3bEXT, bx, by, bz); }
        catch (Throwable e) { throw new RuntimeException("error in Binormal3bEXT", e); }
    }

    /// ```
    /// void glBinormal3bvEXT(const GLbyte* v);
    /// ```
    public void Binormal3bvEXT(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBinormal3bvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBinormal3bvEXT");
        try { Handles.MH_glBinormal3bvEXT.invokeExact(handles.PFN_glBinormal3bvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in Binormal3bvEXT", e); }
    }

    /// ```
    /// void glBinormal3dEXT((double) GLdouble bx, (double) GLdouble by, (double) GLdouble bz);
    /// ```
    public void Binormal3dEXT(double bx, double by, double bz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBinormal3dEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBinormal3dEXT");
        try { Handles.MH_glBinormal3dEXT.invokeExact(handles.PFN_glBinormal3dEXT, bx, by, bz); }
        catch (Throwable e) { throw new RuntimeException("error in Binormal3dEXT", e); }
    }

    /// ```
    /// void glBinormal3dvEXT(const GLdouble* v);
    /// ```
    public void Binormal3dvEXT(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBinormal3dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBinormal3dvEXT");
        try { Handles.MH_glBinormal3dvEXT.invokeExact(handles.PFN_glBinormal3dvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in Binormal3dvEXT", e); }
    }

    /// ```
    /// void glBinormal3fEXT(((float) khronos_float_t) GLfloat bx, ((float) khronos_float_t) GLfloat by, ((float) khronos_float_t) GLfloat bz);
    /// ```
    public void Binormal3fEXT(float bx, float by, float bz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBinormal3fEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBinormal3fEXT");
        try { Handles.MH_glBinormal3fEXT.invokeExact(handles.PFN_glBinormal3fEXT, bx, by, bz); }
        catch (Throwable e) { throw new RuntimeException("error in Binormal3fEXT", e); }
    }

    /// ```
    /// void glBinormal3fvEXT(const GLfloat* v);
    /// ```
    public void Binormal3fvEXT(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBinormal3fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBinormal3fvEXT");
        try { Handles.MH_glBinormal3fvEXT.invokeExact(handles.PFN_glBinormal3fvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in Binormal3fvEXT", e); }
    }

    /// ```
    /// void glBinormal3iEXT((int) GLint bx, (int) GLint by, (int) GLint bz);
    /// ```
    public void Binormal3iEXT(int bx, int by, int bz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBinormal3iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBinormal3iEXT");
        try { Handles.MH_glBinormal3iEXT.invokeExact(handles.PFN_glBinormal3iEXT, bx, by, bz); }
        catch (Throwable e) { throw new RuntimeException("error in Binormal3iEXT", e); }
    }

    /// ```
    /// void glBinormal3ivEXT(const GLint* v);
    /// ```
    public void Binormal3ivEXT(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBinormal3ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBinormal3ivEXT");
        try { Handles.MH_glBinormal3ivEXT.invokeExact(handles.PFN_glBinormal3ivEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in Binormal3ivEXT", e); }
    }

    /// ```
    /// void glBinormal3sEXT(((signed short) khronos_int16_t) GLshort bx, ((signed short) khronos_int16_t) GLshort by, ((signed short) khronos_int16_t) GLshort bz);
    /// ```
    public void Binormal3sEXT(short bx, short by, short bz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBinormal3sEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBinormal3sEXT");
        try { Handles.MH_glBinormal3sEXT.invokeExact(handles.PFN_glBinormal3sEXT, bx, by, bz); }
        catch (Throwable e) { throw new RuntimeException("error in Binormal3sEXT", e); }
    }

    /// ```
    /// void glBinormal3svEXT(const GLshort* v);
    /// ```
    public void Binormal3svEXT(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBinormal3svEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBinormal3svEXT");
        try { Handles.MH_glBinormal3svEXT.invokeExact(handles.PFN_glBinormal3svEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in Binormal3svEXT", e); }
    }

    /// ```
    /// void glTangentPointerEXT((unsigned int) GLenum type, (int) GLsizei stride, const void* pointer);
    /// ```
    public void TangentPointerEXT(int type, int stride, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTangentPointerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTangentPointerEXT");
        try { Handles.MH_glTangentPointerEXT.invokeExact(handles.PFN_glTangentPointerEXT, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in TangentPointerEXT", e); }
    }

    /// ```
    /// void glBinormalPointerEXT((unsigned int) GLenum type, (int) GLsizei stride, const void* pointer);
    /// ```
    public void BinormalPointerEXT(int type, int stride, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBinormalPointerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBinormalPointerEXT");
        try { Handles.MH_glBinormalPointerEXT.invokeExact(handles.PFN_glBinormalPointerEXT, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in BinormalPointerEXT", e); }
    }

}
