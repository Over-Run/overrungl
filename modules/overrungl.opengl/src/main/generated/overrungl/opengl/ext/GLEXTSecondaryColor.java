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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLEXTSecondaryColor {
    public static final int GL_COLOR_SUM_EXT = 0x8458;
    public static final int GL_CURRENT_SECONDARY_COLOR_EXT = 0x8459;
    public static final int GL_SECONDARY_COLOR_ARRAY_SIZE_EXT = 0x845A;
    public static final int GL_SECONDARY_COLOR_ARRAY_TYPE_EXT = 0x845B;
    public static final int GL_SECONDARY_COLOR_ARRAY_STRIDE_EXT = 0x845C;
    public static final int GL_SECONDARY_COLOR_ARRAY_POINTER_EXT = 0x845D;
    public static final int GL_SECONDARY_COLOR_ARRAY_EXT = 0x845E;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glSecondaryColor3bEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glSecondaryColor3bvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSecondaryColor3dEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glSecondaryColor3dvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSecondaryColor3fEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glSecondaryColor3fvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSecondaryColor3iEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glSecondaryColor3ivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSecondaryColor3sEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glSecondaryColor3svEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSecondaryColor3ubEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glSecondaryColor3ubvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSecondaryColor3uiEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glSecondaryColor3uivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSecondaryColor3usEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glSecondaryColor3usvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSecondaryColorPointerEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glSecondaryColor3bEXT;
        public final MemorySegment PFN_glSecondaryColor3bvEXT;
        public final MemorySegment PFN_glSecondaryColor3dEXT;
        public final MemorySegment PFN_glSecondaryColor3dvEXT;
        public final MemorySegment PFN_glSecondaryColor3fEXT;
        public final MemorySegment PFN_glSecondaryColor3fvEXT;
        public final MemorySegment PFN_glSecondaryColor3iEXT;
        public final MemorySegment PFN_glSecondaryColor3ivEXT;
        public final MemorySegment PFN_glSecondaryColor3sEXT;
        public final MemorySegment PFN_glSecondaryColor3svEXT;
        public final MemorySegment PFN_glSecondaryColor3ubEXT;
        public final MemorySegment PFN_glSecondaryColor3ubvEXT;
        public final MemorySegment PFN_glSecondaryColor3uiEXT;
        public final MemorySegment PFN_glSecondaryColor3uivEXT;
        public final MemorySegment PFN_glSecondaryColor3usEXT;
        public final MemorySegment PFN_glSecondaryColor3usvEXT;
        public final MemorySegment PFN_glSecondaryColorPointerEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glSecondaryColor3bEXT = func.invoke("glSecondaryColor3bEXT", "glSecondaryColor3b");
            PFN_glSecondaryColor3bvEXT = func.invoke("glSecondaryColor3bvEXT", "glSecondaryColor3bv");
            PFN_glSecondaryColor3dEXT = func.invoke("glSecondaryColor3dEXT", "glSecondaryColor3d");
            PFN_glSecondaryColor3dvEXT = func.invoke("glSecondaryColor3dvEXT", "glSecondaryColor3dv");
            PFN_glSecondaryColor3fEXT = func.invoke("glSecondaryColor3fEXT", "glSecondaryColor3f");
            PFN_glSecondaryColor3fvEXT = func.invoke("glSecondaryColor3fvEXT", "glSecondaryColor3fv");
            PFN_glSecondaryColor3iEXT = func.invoke("glSecondaryColor3iEXT", "glSecondaryColor3i");
            PFN_glSecondaryColor3ivEXT = func.invoke("glSecondaryColor3ivEXT", "glSecondaryColor3iv");
            PFN_glSecondaryColor3sEXT = func.invoke("glSecondaryColor3sEXT", "glSecondaryColor3s");
            PFN_glSecondaryColor3svEXT = func.invoke("glSecondaryColor3svEXT", "glSecondaryColor3sv");
            PFN_glSecondaryColor3ubEXT = func.invoke("glSecondaryColor3ubEXT", "glSecondaryColor3ub");
            PFN_glSecondaryColor3ubvEXT = func.invoke("glSecondaryColor3ubvEXT", "glSecondaryColor3ubv");
            PFN_glSecondaryColor3uiEXT = func.invoke("glSecondaryColor3uiEXT", "glSecondaryColor3ui");
            PFN_glSecondaryColor3uivEXT = func.invoke("glSecondaryColor3uivEXT", "glSecondaryColor3uiv");
            PFN_glSecondaryColor3usEXT = func.invoke("glSecondaryColor3usEXT", "glSecondaryColor3us");
            PFN_glSecondaryColor3usvEXT = func.invoke("glSecondaryColor3usvEXT", "glSecondaryColor3usv");
            PFN_glSecondaryColorPointerEXT = func.invoke("glSecondaryColorPointerEXT", "glSecondaryColorPointer");
        }
    }

    public GLEXTSecondaryColor(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glSecondaryColor3bEXT(((signed char) khronos_int8_t) GLbyte red, ((signed char) khronos_int8_t) GLbyte green, ((signed char) khronos_int8_t) GLbyte blue);
    /// ```
    public void SecondaryColor3bEXT(byte red, byte green, byte blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3bEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3bEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3bEXT", red, green, blue); }
        Handles.MH_glSecondaryColor3bEXT.invokeExact(handles.PFN_glSecondaryColor3bEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3bEXT", e); }
    }

    /// ```
    /// void glSecondaryColor3bvEXT(const GLbyte* v);
    /// ```
    public void SecondaryColor3bvEXT(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3bvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3bvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3bvEXT", v); }
        Handles.MH_glSecondaryColor3bvEXT.invokeExact(handles.PFN_glSecondaryColor3bvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3bvEXT", e); }
    }

    /// ```
    /// void glSecondaryColor3dEXT((double) GLdouble red, (double) GLdouble green, (double) GLdouble blue);
    /// ```
    public void SecondaryColor3dEXT(double red, double green, double blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3dEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3dEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3dEXT", red, green, blue); }
        Handles.MH_glSecondaryColor3dEXT.invokeExact(handles.PFN_glSecondaryColor3dEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3dEXT", e); }
    }

    /// ```
    /// void glSecondaryColor3dvEXT(const GLdouble* v);
    /// ```
    public void SecondaryColor3dvEXT(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3dvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3dvEXT", v); }
        Handles.MH_glSecondaryColor3dvEXT.invokeExact(handles.PFN_glSecondaryColor3dvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3dvEXT", e); }
    }

    /// ```
    /// void glSecondaryColor3fEXT(((float) khronos_float_t) GLfloat red, ((float) khronos_float_t) GLfloat green, ((float) khronos_float_t) GLfloat blue);
    /// ```
    public void SecondaryColor3fEXT(float red, float green, float blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3fEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3fEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3fEXT", red, green, blue); }
        Handles.MH_glSecondaryColor3fEXT.invokeExact(handles.PFN_glSecondaryColor3fEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3fEXT", e); }
    }

    /// ```
    /// void glSecondaryColor3fvEXT(const GLfloat* v);
    /// ```
    public void SecondaryColor3fvEXT(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3fvEXT", v); }
        Handles.MH_glSecondaryColor3fvEXT.invokeExact(handles.PFN_glSecondaryColor3fvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3fvEXT", e); }
    }

    /// ```
    /// void glSecondaryColor3iEXT((int) GLint red, (int) GLint green, (int) GLint blue);
    /// ```
    public void SecondaryColor3iEXT(int red, int green, int blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3iEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3iEXT", red, green, blue); }
        Handles.MH_glSecondaryColor3iEXT.invokeExact(handles.PFN_glSecondaryColor3iEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3iEXT", e); }
    }

    /// ```
    /// void glSecondaryColor3ivEXT(const GLint* v);
    /// ```
    public void SecondaryColor3ivEXT(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3ivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3ivEXT", v); }
        Handles.MH_glSecondaryColor3ivEXT.invokeExact(handles.PFN_glSecondaryColor3ivEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3ivEXT", e); }
    }

    /// ```
    /// void glSecondaryColor3sEXT(((signed short) khronos_int16_t) GLshort red, ((signed short) khronos_int16_t) GLshort green, ((signed short) khronos_int16_t) GLshort blue);
    /// ```
    public void SecondaryColor3sEXT(short red, short green, short blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3sEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3sEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3sEXT", red, green, blue); }
        Handles.MH_glSecondaryColor3sEXT.invokeExact(handles.PFN_glSecondaryColor3sEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3sEXT", e); }
    }

    /// ```
    /// void glSecondaryColor3svEXT(const GLshort* v);
    /// ```
    public void SecondaryColor3svEXT(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3svEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3svEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3svEXT", v); }
        Handles.MH_glSecondaryColor3svEXT.invokeExact(handles.PFN_glSecondaryColor3svEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3svEXT", e); }
    }

    /// ```
    /// void glSecondaryColor3ubEXT(((unsigned char) khronos_uint8_t) GLubyte red, ((unsigned char) khronos_uint8_t) GLubyte green, ((unsigned char) khronos_uint8_t) GLubyte blue);
    /// ```
    public void SecondaryColor3ubEXT(byte red, byte green, byte blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3ubEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3ubEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3ubEXT", red, green, blue); }
        Handles.MH_glSecondaryColor3ubEXT.invokeExact(handles.PFN_glSecondaryColor3ubEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3ubEXT", e); }
    }

    /// ```
    /// void glSecondaryColor3ubvEXT(const GLubyte* v);
    /// ```
    public void SecondaryColor3ubvEXT(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3ubvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3ubvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3ubvEXT", v); }
        Handles.MH_glSecondaryColor3ubvEXT.invokeExact(handles.PFN_glSecondaryColor3ubvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3ubvEXT", e); }
    }

    /// ```
    /// void glSecondaryColor3uiEXT((unsigned int) GLuint red, (unsigned int) GLuint green, (unsigned int) GLuint blue);
    /// ```
    public void SecondaryColor3uiEXT(int red, int green, int blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3uiEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3uiEXT", red, green, blue); }
        Handles.MH_glSecondaryColor3uiEXT.invokeExact(handles.PFN_glSecondaryColor3uiEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3uiEXT", e); }
    }

    /// ```
    /// void glSecondaryColor3uivEXT(const GLuint* v);
    /// ```
    public void SecondaryColor3uivEXT(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3uivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3uivEXT", v); }
        Handles.MH_glSecondaryColor3uivEXT.invokeExact(handles.PFN_glSecondaryColor3uivEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3uivEXT", e); }
    }

    /// ```
    /// void glSecondaryColor3usEXT(((unsigned short) khronos_uint16_t) GLushort red, ((unsigned short) khronos_uint16_t) GLushort green, ((unsigned short) khronos_uint16_t) GLushort blue);
    /// ```
    public void SecondaryColor3usEXT(short red, short green, short blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3usEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3usEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3usEXT", red, green, blue); }
        Handles.MH_glSecondaryColor3usEXT.invokeExact(handles.PFN_glSecondaryColor3usEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3usEXT", e); }
    }

    /// ```
    /// void glSecondaryColor3usvEXT(const GLushort* v);
    /// ```
    public void SecondaryColor3usvEXT(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3usvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3usvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3usvEXT", v); }
        Handles.MH_glSecondaryColor3usvEXT.invokeExact(handles.PFN_glSecondaryColor3usvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3usvEXT", e); }
    }

    /// ```
    /// void glSecondaryColorPointerEXT((int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, const void* pointer);
    /// ```
    public void SecondaryColorPointerEXT(int size, int type, int stride, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColorPointerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColorPointerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColorPointerEXT", size, type, stride, pointer); }
        Handles.MH_glSecondaryColorPointerEXT.invokeExact(handles.PFN_glSecondaryColorPointerEXT, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColorPointerEXT", e); }
    }

}
