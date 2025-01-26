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
package overrungl.opengl.sun;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSUNVertex {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glColor4ubVertex2fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glColor4ubVertex2fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glColor4ubVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glColor4ubVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glColor3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glColor3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNormal3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glNormal3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glColor4fNormal3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glColor4fNormal3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord2fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glTexCoord2fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord4fVertex4fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glTexCoord4fVertex4fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord2fColor4ubVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glTexCoord2fColor4ubVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord2fColor3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glTexCoord2fColor3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord2fNormal3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glTexCoord2fNormal3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord2fColor4fNormal3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glTexCoord2fColor4fNormal3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord4fColor4fNormal3fVertex4fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glTexCoord4fColor4fNormal3fVertex4fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glReplacementCodeuiVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glReplacementCodeuiVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glReplacementCodeuiColor4ubVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glReplacementCodeuiColor4ubVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glReplacementCodeuiColor3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glReplacementCodeuiColor3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glReplacementCodeuiNormal3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glReplacementCodeuiNormal3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glReplacementCodeuiColor4fNormal3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glReplacementCodeuiColor4fNormal3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glReplacementCodeuiTexCoord2fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glReplacementCodeuiTexCoord2fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glColor4ubVertex2fSUN;
        public final MemorySegment PFN_glColor4ubVertex2fvSUN;
        public final MemorySegment PFN_glColor4ubVertex3fSUN;
        public final MemorySegment PFN_glColor4ubVertex3fvSUN;
        public final MemorySegment PFN_glColor3fVertex3fSUN;
        public final MemorySegment PFN_glColor3fVertex3fvSUN;
        public final MemorySegment PFN_glNormal3fVertex3fSUN;
        public final MemorySegment PFN_glNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glColor4fNormal3fVertex3fSUN;
        public final MemorySegment PFN_glColor4fNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glTexCoord2fVertex3fSUN;
        public final MemorySegment PFN_glTexCoord2fVertex3fvSUN;
        public final MemorySegment PFN_glTexCoord4fVertex4fSUN;
        public final MemorySegment PFN_glTexCoord4fVertex4fvSUN;
        public final MemorySegment PFN_glTexCoord2fColor4ubVertex3fSUN;
        public final MemorySegment PFN_glTexCoord2fColor4ubVertex3fvSUN;
        public final MemorySegment PFN_glTexCoord2fColor3fVertex3fSUN;
        public final MemorySegment PFN_glTexCoord2fColor3fVertex3fvSUN;
        public final MemorySegment PFN_glTexCoord2fNormal3fVertex3fSUN;
        public final MemorySegment PFN_glTexCoord2fNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glTexCoord2fColor4fNormal3fVertex3fSUN;
        public final MemorySegment PFN_glTexCoord2fColor4fNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glTexCoord4fColor4fNormal3fVertex4fSUN;
        public final MemorySegment PFN_glTexCoord4fColor4fNormal3fVertex4fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiColor4ubVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiColor4ubVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiColor3fVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiColor3fVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiNormal3fVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiColor4fNormal3fVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiColor4fNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiTexCoord2fVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiTexCoord2fVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glColor4ubVertex2fSUN = func.invoke("glColor4ubVertex2fSUN");
            PFN_glColor4ubVertex2fvSUN = func.invoke("glColor4ubVertex2fvSUN");
            PFN_glColor4ubVertex3fSUN = func.invoke("glColor4ubVertex3fSUN");
            PFN_glColor4ubVertex3fvSUN = func.invoke("glColor4ubVertex3fvSUN");
            PFN_glColor3fVertex3fSUN = func.invoke("glColor3fVertex3fSUN");
            PFN_glColor3fVertex3fvSUN = func.invoke("glColor3fVertex3fvSUN");
            PFN_glNormal3fVertex3fSUN = func.invoke("glNormal3fVertex3fSUN");
            PFN_glNormal3fVertex3fvSUN = func.invoke("glNormal3fVertex3fvSUN");
            PFN_glColor4fNormal3fVertex3fSUN = func.invoke("glColor4fNormal3fVertex3fSUN");
            PFN_glColor4fNormal3fVertex3fvSUN = func.invoke("glColor4fNormal3fVertex3fvSUN");
            PFN_glTexCoord2fVertex3fSUN = func.invoke("glTexCoord2fVertex3fSUN");
            PFN_glTexCoord2fVertex3fvSUN = func.invoke("glTexCoord2fVertex3fvSUN");
            PFN_glTexCoord4fVertex4fSUN = func.invoke("glTexCoord4fVertex4fSUN");
            PFN_glTexCoord4fVertex4fvSUN = func.invoke("glTexCoord4fVertex4fvSUN");
            PFN_glTexCoord2fColor4ubVertex3fSUN = func.invoke("glTexCoord2fColor4ubVertex3fSUN");
            PFN_glTexCoord2fColor4ubVertex3fvSUN = func.invoke("glTexCoord2fColor4ubVertex3fvSUN");
            PFN_glTexCoord2fColor3fVertex3fSUN = func.invoke("glTexCoord2fColor3fVertex3fSUN");
            PFN_glTexCoord2fColor3fVertex3fvSUN = func.invoke("glTexCoord2fColor3fVertex3fvSUN");
            PFN_glTexCoord2fNormal3fVertex3fSUN = func.invoke("glTexCoord2fNormal3fVertex3fSUN");
            PFN_glTexCoord2fNormal3fVertex3fvSUN = func.invoke("glTexCoord2fNormal3fVertex3fvSUN");
            PFN_glTexCoord2fColor4fNormal3fVertex3fSUN = func.invoke("glTexCoord2fColor4fNormal3fVertex3fSUN");
            PFN_glTexCoord2fColor4fNormal3fVertex3fvSUN = func.invoke("glTexCoord2fColor4fNormal3fVertex3fvSUN");
            PFN_glTexCoord4fColor4fNormal3fVertex4fSUN = func.invoke("glTexCoord4fColor4fNormal3fVertex4fSUN");
            PFN_glTexCoord4fColor4fNormal3fVertex4fvSUN = func.invoke("glTexCoord4fColor4fNormal3fVertex4fvSUN");
            PFN_glReplacementCodeuiVertex3fSUN = func.invoke("glReplacementCodeuiVertex3fSUN");
            PFN_glReplacementCodeuiVertex3fvSUN = func.invoke("glReplacementCodeuiVertex3fvSUN");
            PFN_glReplacementCodeuiColor4ubVertex3fSUN = func.invoke("glReplacementCodeuiColor4ubVertex3fSUN");
            PFN_glReplacementCodeuiColor4ubVertex3fvSUN = func.invoke("glReplacementCodeuiColor4ubVertex3fvSUN");
            PFN_glReplacementCodeuiColor3fVertex3fSUN = func.invoke("glReplacementCodeuiColor3fVertex3fSUN");
            PFN_glReplacementCodeuiColor3fVertex3fvSUN = func.invoke("glReplacementCodeuiColor3fVertex3fvSUN");
            PFN_glReplacementCodeuiNormal3fVertex3fSUN = func.invoke("glReplacementCodeuiNormal3fVertex3fSUN");
            PFN_glReplacementCodeuiNormal3fVertex3fvSUN = func.invoke("glReplacementCodeuiNormal3fVertex3fvSUN");
            PFN_glReplacementCodeuiColor4fNormal3fVertex3fSUN = func.invoke("glReplacementCodeuiColor4fNormal3fVertex3fSUN");
            PFN_glReplacementCodeuiColor4fNormal3fVertex3fvSUN = func.invoke("glReplacementCodeuiColor4fNormal3fVertex3fvSUN");
            PFN_glReplacementCodeuiTexCoord2fVertex3fSUN = func.invoke("glReplacementCodeuiTexCoord2fVertex3fSUN");
            PFN_glReplacementCodeuiTexCoord2fVertex3fvSUN = func.invoke("glReplacementCodeuiTexCoord2fVertex3fvSUN");
            PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN = func.invoke("glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN");
            PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN = func.invoke("glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN");
            PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN = func.invoke("glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN");
            PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN = func.invoke("glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN");
        }
    }

    public GLSUNVertex(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glColor4ubVertex2fSUN(GLubyte r, GLubyte g, GLubyte b, GLubyte a, GLfloat x, GLfloat y);
    /// ```
    public void Color4ubVertex2fSUN(byte r, byte g, byte b, byte a, float x, float y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4ubVertex2fSUN)) throw new SymbolNotFoundError("Symbol not found: glColor4ubVertex2fSUN");
        try { Handles.MH_glColor4ubVertex2fSUN.invokeExact(handles.PFN_glColor4ubVertex2fSUN, r, g, b, a, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in Color4ubVertex2fSUN", e); }
    }

    /// ```
    /// void glColor4ubVertex2fvSUN(const GLubyte* c, const GLfloat* v);
    /// ```
    public void Color4ubVertex2fvSUN(MemorySegment c, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4ubVertex2fvSUN)) throw new SymbolNotFoundError("Symbol not found: glColor4ubVertex2fvSUN");
        try { Handles.MH_glColor4ubVertex2fvSUN.invokeExact(handles.PFN_glColor4ubVertex2fvSUN, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in Color4ubVertex2fvSUN", e); }
    }

    /// ```
    /// void glColor4ubVertex3fSUN(GLubyte r, GLubyte g, GLubyte b, GLubyte a, GLfloat x, GLfloat y, GLfloat z);
    /// ```
    public void Color4ubVertex3fSUN(byte r, byte g, byte b, byte a, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4ubVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glColor4ubVertex3fSUN");
        try { Handles.MH_glColor4ubVertex3fSUN.invokeExact(handles.PFN_glColor4ubVertex3fSUN, r, g, b, a, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Color4ubVertex3fSUN", e); }
    }

    /// ```
    /// void glColor4ubVertex3fvSUN(const GLubyte* c, const GLfloat* v);
    /// ```
    public void Color4ubVertex3fvSUN(MemorySegment c, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4ubVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glColor4ubVertex3fvSUN");
        try { Handles.MH_glColor4ubVertex3fvSUN.invokeExact(handles.PFN_glColor4ubVertex3fvSUN, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in Color4ubVertex3fvSUN", e); }
    }

    /// ```
    /// void glColor3fVertex3fSUN(GLfloat r, GLfloat g, GLfloat b, GLfloat x, GLfloat y, GLfloat z);
    /// ```
    public void Color3fVertex3fSUN(float r, float g, float b, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glColor3fVertex3fSUN");
        try { Handles.MH_glColor3fVertex3fSUN.invokeExact(handles.PFN_glColor3fVertex3fSUN, r, g, b, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Color3fVertex3fSUN", e); }
    }

    /// ```
    /// void glColor3fVertex3fvSUN(const GLfloat* c, const GLfloat* v);
    /// ```
    public void Color3fVertex3fvSUN(MemorySegment c, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glColor3fVertex3fvSUN");
        try { Handles.MH_glColor3fVertex3fvSUN.invokeExact(handles.PFN_glColor3fVertex3fvSUN, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in Color3fVertex3fvSUN", e); }
    }

    /// ```
    /// void glNormal3fVertex3fSUN(GLfloat nx, GLfloat ny, GLfloat nz, GLfloat x, GLfloat y, GLfloat z);
    /// ```
    public void Normal3fVertex3fSUN(float nx, float ny, float nz, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormal3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glNormal3fVertex3fSUN");
        try { Handles.MH_glNormal3fVertex3fSUN.invokeExact(handles.PFN_glNormal3fVertex3fSUN, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Normal3fVertex3fSUN", e); }
    }

    /// ```
    /// void glNormal3fVertex3fvSUN(const GLfloat* n, const GLfloat* v);
    /// ```
    public void Normal3fVertex3fvSUN(MemorySegment n, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormal3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glNormal3fVertex3fvSUN");
        try { Handles.MH_glNormal3fVertex3fvSUN.invokeExact(handles.PFN_glNormal3fVertex3fvSUN, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in Normal3fVertex3fvSUN", e); }
    }

    /// ```
    /// void glColor4fNormal3fVertex3fSUN(GLfloat r, GLfloat g, GLfloat b, GLfloat a, GLfloat nx, GLfloat ny, GLfloat nz, GLfloat x, GLfloat y, GLfloat z);
    /// ```
    public void Color4fNormal3fVertex3fSUN(float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4fNormal3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glColor4fNormal3fVertex3fSUN");
        try { Handles.MH_glColor4fNormal3fVertex3fSUN.invokeExact(handles.PFN_glColor4fNormal3fVertex3fSUN, r, g, b, a, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Color4fNormal3fVertex3fSUN", e); }
    }

    /// ```
    /// void glColor4fNormal3fVertex3fvSUN(const GLfloat* c, const GLfloat* n, const GLfloat* v);
    /// ```
    public void Color4fNormal3fVertex3fvSUN(MemorySegment c, MemorySegment n, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4fNormal3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glColor4fNormal3fVertex3fvSUN");
        try { Handles.MH_glColor4fNormal3fVertex3fvSUN.invokeExact(handles.PFN_glColor4fNormal3fVertex3fvSUN, c, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in Color4fNormal3fVertex3fvSUN", e); }
    }

    /// ```
    /// void glTexCoord2fVertex3fSUN(GLfloat s, GLfloat t, GLfloat x, GLfloat y, GLfloat z);
    /// ```
    public void TexCoord2fVertex3fSUN(float s, float t, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fVertex3fSUN");
        try { Handles.MH_glTexCoord2fVertex3fSUN.invokeExact(handles.PFN_glTexCoord2fVertex3fSUN, s, t, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fVertex3fSUN", e); }
    }

    /// ```
    /// void glTexCoord2fVertex3fvSUN(const GLfloat* tc, const GLfloat* v);
    /// ```
    public void TexCoord2fVertex3fvSUN(MemorySegment tc, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fVertex3fvSUN");
        try { Handles.MH_glTexCoord2fVertex3fvSUN.invokeExact(handles.PFN_glTexCoord2fVertex3fvSUN, tc, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fVertex3fvSUN", e); }
    }

    /// ```
    /// void glTexCoord4fVertex4fSUN(GLfloat s, GLfloat t, GLfloat p, GLfloat q, GLfloat x, GLfloat y, GLfloat z, GLfloat w);
    /// ```
    public void TexCoord4fVertex4fSUN(float s, float t, float p, float q, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord4fVertex4fSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord4fVertex4fSUN");
        try { Handles.MH_glTexCoord4fVertex4fSUN.invokeExact(handles.PFN_glTexCoord4fVertex4fSUN, s, t, p, q, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord4fVertex4fSUN", e); }
    }

    /// ```
    /// void glTexCoord4fVertex4fvSUN(const GLfloat* tc, const GLfloat* v);
    /// ```
    public void TexCoord4fVertex4fvSUN(MemorySegment tc, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord4fVertex4fvSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord4fVertex4fvSUN");
        try { Handles.MH_glTexCoord4fVertex4fvSUN.invokeExact(handles.PFN_glTexCoord4fVertex4fvSUN, tc, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord4fVertex4fvSUN", e); }
    }

    /// ```
    /// void glTexCoord2fColor4ubVertex3fSUN(GLfloat s, GLfloat t, GLubyte r, GLubyte g, GLubyte b, GLubyte a, GLfloat x, GLfloat y, GLfloat z);
    /// ```
    public void TexCoord2fColor4ubVertex3fSUN(float s, float t, byte r, byte g, byte b, byte a, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fColor4ubVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fColor4ubVertex3fSUN");
        try { Handles.MH_glTexCoord2fColor4ubVertex3fSUN.invokeExact(handles.PFN_glTexCoord2fColor4ubVertex3fSUN, s, t, r, g, b, a, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fColor4ubVertex3fSUN", e); }
    }

    /// ```
    /// void glTexCoord2fColor4ubVertex3fvSUN(const GLfloat* tc, const GLubyte* c, const GLfloat* v);
    /// ```
    public void TexCoord2fColor4ubVertex3fvSUN(MemorySegment tc, MemorySegment c, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fColor4ubVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fColor4ubVertex3fvSUN");
        try { Handles.MH_glTexCoord2fColor4ubVertex3fvSUN.invokeExact(handles.PFN_glTexCoord2fColor4ubVertex3fvSUN, tc, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fColor4ubVertex3fvSUN", e); }
    }

    /// ```
    /// void glTexCoord2fColor3fVertex3fSUN(GLfloat s, GLfloat t, GLfloat r, GLfloat g, GLfloat b, GLfloat x, GLfloat y, GLfloat z);
    /// ```
    public void TexCoord2fColor3fVertex3fSUN(float s, float t, float r, float g, float b, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fColor3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fColor3fVertex3fSUN");
        try { Handles.MH_glTexCoord2fColor3fVertex3fSUN.invokeExact(handles.PFN_glTexCoord2fColor3fVertex3fSUN, s, t, r, g, b, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fColor3fVertex3fSUN", e); }
    }

    /// ```
    /// void glTexCoord2fColor3fVertex3fvSUN(const GLfloat* tc, const GLfloat* c, const GLfloat* v);
    /// ```
    public void TexCoord2fColor3fVertex3fvSUN(MemorySegment tc, MemorySegment c, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fColor3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fColor3fVertex3fvSUN");
        try { Handles.MH_glTexCoord2fColor3fVertex3fvSUN.invokeExact(handles.PFN_glTexCoord2fColor3fVertex3fvSUN, tc, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fColor3fVertex3fvSUN", e); }
    }

    /// ```
    /// void glTexCoord2fNormal3fVertex3fSUN(GLfloat s, GLfloat t, GLfloat nx, GLfloat ny, GLfloat nz, GLfloat x, GLfloat y, GLfloat z);
    /// ```
    public void TexCoord2fNormal3fVertex3fSUN(float s, float t, float nx, float ny, float nz, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fNormal3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fNormal3fVertex3fSUN");
        try { Handles.MH_glTexCoord2fNormal3fVertex3fSUN.invokeExact(handles.PFN_glTexCoord2fNormal3fVertex3fSUN, s, t, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fNormal3fVertex3fSUN", e); }
    }

    /// ```
    /// void glTexCoord2fNormal3fVertex3fvSUN(const GLfloat* tc, const GLfloat* n, const GLfloat* v);
    /// ```
    public void TexCoord2fNormal3fVertex3fvSUN(MemorySegment tc, MemorySegment n, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fNormal3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fNormal3fVertex3fvSUN");
        try { Handles.MH_glTexCoord2fNormal3fVertex3fvSUN.invokeExact(handles.PFN_glTexCoord2fNormal3fVertex3fvSUN, tc, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fNormal3fVertex3fvSUN", e); }
    }

    /// ```
    /// void glTexCoord2fColor4fNormal3fVertex3fSUN(GLfloat s, GLfloat t, GLfloat r, GLfloat g, GLfloat b, GLfloat a, GLfloat nx, GLfloat ny, GLfloat nz, GLfloat x, GLfloat y, GLfloat z);
    /// ```
    public void TexCoord2fColor4fNormal3fVertex3fSUN(float s, float t, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fColor4fNormal3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fColor4fNormal3fVertex3fSUN");
        try { Handles.MH_glTexCoord2fColor4fNormal3fVertex3fSUN.invokeExact(handles.PFN_glTexCoord2fColor4fNormal3fVertex3fSUN, s, t, r, g, b, a, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fColor4fNormal3fVertex3fSUN", e); }
    }

    /// ```
    /// void glTexCoord2fColor4fNormal3fVertex3fvSUN(const GLfloat* tc, const GLfloat* c, const GLfloat* n, const GLfloat* v);
    /// ```
    public void TexCoord2fColor4fNormal3fVertex3fvSUN(MemorySegment tc, MemorySegment c, MemorySegment n, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fColor4fNormal3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fColor4fNormal3fVertex3fvSUN");
        try { Handles.MH_glTexCoord2fColor4fNormal3fVertex3fvSUN.invokeExact(handles.PFN_glTexCoord2fColor4fNormal3fVertex3fvSUN, tc, c, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fColor4fNormal3fVertex3fvSUN", e); }
    }

    /// ```
    /// void glTexCoord4fColor4fNormal3fVertex4fSUN(GLfloat s, GLfloat t, GLfloat p, GLfloat q, GLfloat r, GLfloat g, GLfloat b, GLfloat a, GLfloat nx, GLfloat ny, GLfloat nz, GLfloat x, GLfloat y, GLfloat z, GLfloat w);
    /// ```
    public void TexCoord4fColor4fNormal3fVertex4fSUN(float s, float t, float p, float q, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord4fColor4fNormal3fVertex4fSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord4fColor4fNormal3fVertex4fSUN");
        try { Handles.MH_glTexCoord4fColor4fNormal3fVertex4fSUN.invokeExact(handles.PFN_glTexCoord4fColor4fNormal3fVertex4fSUN, s, t, p, q, r, g, b, a, nx, ny, nz, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord4fColor4fNormal3fVertex4fSUN", e); }
    }

    /// ```
    /// void glTexCoord4fColor4fNormal3fVertex4fvSUN(const GLfloat* tc, const GLfloat* c, const GLfloat* n, const GLfloat* v);
    /// ```
    public void TexCoord4fColor4fNormal3fVertex4fvSUN(MemorySegment tc, MemorySegment c, MemorySegment n, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord4fColor4fNormal3fVertex4fvSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord4fColor4fNormal3fVertex4fvSUN");
        try { Handles.MH_glTexCoord4fColor4fNormal3fVertex4fvSUN.invokeExact(handles.PFN_glTexCoord4fColor4fNormal3fVertex4fvSUN, tc, c, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord4fColor4fNormal3fVertex4fvSUN", e); }
    }

    /// ```
    /// void glReplacementCodeuiVertex3fSUN(GLuint rc, GLfloat x, GLfloat y, GLfloat z);
    /// ```
    public void ReplacementCodeuiVertex3fSUN(int rc, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiVertex3fSUN");
        try { Handles.MH_glReplacementCodeuiVertex3fSUN.invokeExact(handles.PFN_glReplacementCodeuiVertex3fSUN, rc, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiVertex3fSUN", e); }
    }

    /// ```
    /// void glReplacementCodeuiVertex3fvSUN(const GLuint* rc, const GLfloat* v);
    /// ```
    public void ReplacementCodeuiVertex3fvSUN(MemorySegment rc, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiVertex3fvSUN");
        try { Handles.MH_glReplacementCodeuiVertex3fvSUN.invokeExact(handles.PFN_glReplacementCodeuiVertex3fvSUN, rc, v); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiVertex3fvSUN", e); }
    }

    /// ```
    /// void glReplacementCodeuiColor4ubVertex3fSUN(GLuint rc, GLubyte r, GLubyte g, GLubyte b, GLubyte a, GLfloat x, GLfloat y, GLfloat z);
    /// ```
    public void ReplacementCodeuiColor4ubVertex3fSUN(int rc, byte r, byte g, byte b, byte a, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiColor4ubVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiColor4ubVertex3fSUN");
        try { Handles.MH_glReplacementCodeuiColor4ubVertex3fSUN.invokeExact(handles.PFN_glReplacementCodeuiColor4ubVertex3fSUN, rc, r, g, b, a, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiColor4ubVertex3fSUN", e); }
    }

    /// ```
    /// void glReplacementCodeuiColor4ubVertex3fvSUN(const GLuint* rc, const GLubyte* c, const GLfloat* v);
    /// ```
    public void ReplacementCodeuiColor4ubVertex3fvSUN(MemorySegment rc, MemorySegment c, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiColor4ubVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiColor4ubVertex3fvSUN");
        try { Handles.MH_glReplacementCodeuiColor4ubVertex3fvSUN.invokeExact(handles.PFN_glReplacementCodeuiColor4ubVertex3fvSUN, rc, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiColor4ubVertex3fvSUN", e); }
    }

    /// ```
    /// void glReplacementCodeuiColor3fVertex3fSUN(GLuint rc, GLfloat r, GLfloat g, GLfloat b, GLfloat x, GLfloat y, GLfloat z);
    /// ```
    public void ReplacementCodeuiColor3fVertex3fSUN(int rc, float r, float g, float b, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiColor3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiColor3fVertex3fSUN");
        try { Handles.MH_glReplacementCodeuiColor3fVertex3fSUN.invokeExact(handles.PFN_glReplacementCodeuiColor3fVertex3fSUN, rc, r, g, b, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiColor3fVertex3fSUN", e); }
    }

    /// ```
    /// void glReplacementCodeuiColor3fVertex3fvSUN(const GLuint* rc, const GLfloat* c, const GLfloat* v);
    /// ```
    public void ReplacementCodeuiColor3fVertex3fvSUN(MemorySegment rc, MemorySegment c, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiColor3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiColor3fVertex3fvSUN");
        try { Handles.MH_glReplacementCodeuiColor3fVertex3fvSUN.invokeExact(handles.PFN_glReplacementCodeuiColor3fVertex3fvSUN, rc, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiColor3fVertex3fvSUN", e); }
    }

    /// ```
    /// void glReplacementCodeuiNormal3fVertex3fSUN(GLuint rc, GLfloat nx, GLfloat ny, GLfloat nz, GLfloat x, GLfloat y, GLfloat z);
    /// ```
    public void ReplacementCodeuiNormal3fVertex3fSUN(int rc, float nx, float ny, float nz, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiNormal3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiNormal3fVertex3fSUN");
        try { Handles.MH_glReplacementCodeuiNormal3fVertex3fSUN.invokeExact(handles.PFN_glReplacementCodeuiNormal3fVertex3fSUN, rc, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiNormal3fVertex3fSUN", e); }
    }

    /// ```
    /// void glReplacementCodeuiNormal3fVertex3fvSUN(const GLuint* rc, const GLfloat* n, const GLfloat* v);
    /// ```
    public void ReplacementCodeuiNormal3fVertex3fvSUN(MemorySegment rc, MemorySegment n, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiNormal3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiNormal3fVertex3fvSUN");
        try { Handles.MH_glReplacementCodeuiNormal3fVertex3fvSUN.invokeExact(handles.PFN_glReplacementCodeuiNormal3fVertex3fvSUN, rc, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiNormal3fVertex3fvSUN", e); }
    }

    /// ```
    /// void glReplacementCodeuiColor4fNormal3fVertex3fSUN(GLuint rc, GLfloat r, GLfloat g, GLfloat b, GLfloat a, GLfloat nx, GLfloat ny, GLfloat nz, GLfloat x, GLfloat y, GLfloat z);
    /// ```
    public void ReplacementCodeuiColor4fNormal3fVertex3fSUN(int rc, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiColor4fNormal3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiColor4fNormal3fVertex3fSUN");
        try { Handles.MH_glReplacementCodeuiColor4fNormal3fVertex3fSUN.invokeExact(handles.PFN_glReplacementCodeuiColor4fNormal3fVertex3fSUN, rc, r, g, b, a, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiColor4fNormal3fVertex3fSUN", e); }
    }

    /// ```
    /// void glReplacementCodeuiColor4fNormal3fVertex3fvSUN(const GLuint* rc, const GLfloat* c, const GLfloat* n, const GLfloat* v);
    /// ```
    public void ReplacementCodeuiColor4fNormal3fVertex3fvSUN(MemorySegment rc, MemorySegment c, MemorySegment n, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiColor4fNormal3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiColor4fNormal3fVertex3fvSUN");
        try { Handles.MH_glReplacementCodeuiColor4fNormal3fVertex3fvSUN.invokeExact(handles.PFN_glReplacementCodeuiColor4fNormal3fVertex3fvSUN, rc, c, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiColor4fNormal3fVertex3fvSUN", e); }
    }

    /// ```
    /// void glReplacementCodeuiTexCoord2fVertex3fSUN(GLuint rc, GLfloat s, GLfloat t, GLfloat x, GLfloat y, GLfloat z);
    /// ```
    public void ReplacementCodeuiTexCoord2fVertex3fSUN(int rc, float s, float t, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiTexCoord2fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fVertex3fSUN");
        try { Handles.MH_glReplacementCodeuiTexCoord2fVertex3fSUN.invokeExact(handles.PFN_glReplacementCodeuiTexCoord2fVertex3fSUN, rc, s, t, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiTexCoord2fVertex3fSUN", e); }
    }

    /// ```
    /// void glReplacementCodeuiTexCoord2fVertex3fvSUN(const GLuint* rc, const GLfloat* tc, const GLfloat* v);
    /// ```
    public void ReplacementCodeuiTexCoord2fVertex3fvSUN(MemorySegment rc, MemorySegment tc, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiTexCoord2fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fVertex3fvSUN");
        try { Handles.MH_glReplacementCodeuiTexCoord2fVertex3fvSUN.invokeExact(handles.PFN_glReplacementCodeuiTexCoord2fVertex3fvSUN, rc, tc, v); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiTexCoord2fVertex3fvSUN", e); }
    }

    /// ```
    /// void glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN(GLuint rc, GLfloat s, GLfloat t, GLfloat nx, GLfloat ny, GLfloat nz, GLfloat x, GLfloat y, GLfloat z);
    /// ```
    public void ReplacementCodeuiTexCoord2fNormal3fVertex3fSUN(int rc, float s, float t, float nx, float ny, float nz, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN");
        try { Handles.MH_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN.invokeExact(handles.PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN, rc, s, t, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiTexCoord2fNormal3fVertex3fSUN", e); }
    }

    /// ```
    /// void glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN(const GLuint* rc, const GLfloat* tc, const GLfloat* n, const GLfloat* v);
    /// ```
    public void ReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN(MemorySegment rc, MemorySegment tc, MemorySegment n, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN");
        try { Handles.MH_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN.invokeExact(handles.PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN, rc, tc, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN", e); }
    }

    /// ```
    /// void glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN(GLuint rc, GLfloat s, GLfloat t, GLfloat r, GLfloat g, GLfloat b, GLfloat a, GLfloat nx, GLfloat ny, GLfloat nz, GLfloat x, GLfloat y, GLfloat z);
    /// ```
    public void ReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN(int rc, float s, float t, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN");
        try { Handles.MH_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN.invokeExact(handles.PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN, rc, s, t, r, g, b, a, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN", e); }
    }

    /// ```
    /// void glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN(const GLuint* rc, const GLfloat* tc, const GLfloat* c, const GLfloat* n, const GLfloat* v);
    /// ```
    public void ReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN(MemorySegment rc, MemorySegment tc, MemorySegment c, MemorySegment n, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN");
        try { Handles.MH_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN.invokeExact(handles.PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN, rc, tc, c, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN", e); }
    }

}
