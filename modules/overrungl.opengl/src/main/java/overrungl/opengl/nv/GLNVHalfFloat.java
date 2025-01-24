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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVHalfFloat {
    public static final int GL_HALF_FLOAT_NV = 0x140B;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glVertex2hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertex2hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertex3hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertex3hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertex4hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertex4hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNormal3hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glNormal3hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glColor3hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glColor3hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glColor4hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glColor4hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord1hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glTexCoord1hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord2hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glTexCoord2hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord3hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glTexCoord3hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord4hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glTexCoord4hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord1hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glMultiTexCoord1hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord2hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glMultiTexCoord2hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord3hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glMultiTexCoord3hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord4hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glMultiTexCoord4hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib1hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib1hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib2hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib2hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib3hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib3hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib4hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribs1hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribs2hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribs3hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribs4hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glFogCoordhNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glFogCoordhvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSecondaryColor3hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glSecondaryColor3hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexWeighthNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexWeighthvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public final MemorySegment PFN_glVertex2hNV;
        public final MemorySegment PFN_glVertex2hvNV;
        public final MemorySegment PFN_glVertex3hNV;
        public final MemorySegment PFN_glVertex3hvNV;
        public final MemorySegment PFN_glVertex4hNV;
        public final MemorySegment PFN_glVertex4hvNV;
        public final MemorySegment PFN_glNormal3hNV;
        public final MemorySegment PFN_glNormal3hvNV;
        public final MemorySegment PFN_glColor3hNV;
        public final MemorySegment PFN_glColor3hvNV;
        public final MemorySegment PFN_glColor4hNV;
        public final MemorySegment PFN_glColor4hvNV;
        public final MemorySegment PFN_glTexCoord1hNV;
        public final MemorySegment PFN_glTexCoord1hvNV;
        public final MemorySegment PFN_glTexCoord2hNV;
        public final MemorySegment PFN_glTexCoord2hvNV;
        public final MemorySegment PFN_glTexCoord3hNV;
        public final MemorySegment PFN_glTexCoord3hvNV;
        public final MemorySegment PFN_glTexCoord4hNV;
        public final MemorySegment PFN_glTexCoord4hvNV;
        public final MemorySegment PFN_glMultiTexCoord1hNV;
        public final MemorySegment PFN_glMultiTexCoord1hvNV;
        public final MemorySegment PFN_glMultiTexCoord2hNV;
        public final MemorySegment PFN_glMultiTexCoord2hvNV;
        public final MemorySegment PFN_glMultiTexCoord3hNV;
        public final MemorySegment PFN_glMultiTexCoord3hvNV;
        public final MemorySegment PFN_glMultiTexCoord4hNV;
        public final MemorySegment PFN_glMultiTexCoord4hvNV;
        public final MemorySegment PFN_glVertexAttrib1hNV;
        public final MemorySegment PFN_glVertexAttrib1hvNV;
        public final MemorySegment PFN_glVertexAttrib2hNV;
        public final MemorySegment PFN_glVertexAttrib2hvNV;
        public final MemorySegment PFN_glVertexAttrib3hNV;
        public final MemorySegment PFN_glVertexAttrib3hvNV;
        public final MemorySegment PFN_glVertexAttrib4hNV;
        public final MemorySegment PFN_glVertexAttrib4hvNV;
        public final MemorySegment PFN_glVertexAttribs1hvNV;
        public final MemorySegment PFN_glVertexAttribs2hvNV;
        public final MemorySegment PFN_glVertexAttribs3hvNV;
        public final MemorySegment PFN_glVertexAttribs4hvNV;
        public final MemorySegment PFN_glFogCoordhNV;
        public final MemorySegment PFN_glFogCoordhvNV;
        public final MemorySegment PFN_glSecondaryColor3hNV;
        public final MemorySegment PFN_glSecondaryColor3hvNV;
        public final MemorySegment PFN_glVertexWeighthNV;
        public final MemorySegment PFN_glVertexWeighthvNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glVertex2hNV = func.invoke("glVertex2hNV");
            PFN_glVertex2hvNV = func.invoke("glVertex2hvNV");
            PFN_glVertex3hNV = func.invoke("glVertex3hNV");
            PFN_glVertex3hvNV = func.invoke("glVertex3hvNV");
            PFN_glVertex4hNV = func.invoke("glVertex4hNV");
            PFN_glVertex4hvNV = func.invoke("glVertex4hvNV");
            PFN_glNormal3hNV = func.invoke("glNormal3hNV");
            PFN_glNormal3hvNV = func.invoke("glNormal3hvNV");
            PFN_glColor3hNV = func.invoke("glColor3hNV");
            PFN_glColor3hvNV = func.invoke("glColor3hvNV");
            PFN_glColor4hNV = func.invoke("glColor4hNV");
            PFN_glColor4hvNV = func.invoke("glColor4hvNV");
            PFN_glTexCoord1hNV = func.invoke("glTexCoord1hNV");
            PFN_glTexCoord1hvNV = func.invoke("glTexCoord1hvNV");
            PFN_glTexCoord2hNV = func.invoke("glTexCoord2hNV");
            PFN_glTexCoord2hvNV = func.invoke("glTexCoord2hvNV");
            PFN_glTexCoord3hNV = func.invoke("glTexCoord3hNV");
            PFN_glTexCoord3hvNV = func.invoke("glTexCoord3hvNV");
            PFN_glTexCoord4hNV = func.invoke("glTexCoord4hNV");
            PFN_glTexCoord4hvNV = func.invoke("glTexCoord4hvNV");
            PFN_glMultiTexCoord1hNV = func.invoke("glMultiTexCoord1hNV");
            PFN_glMultiTexCoord1hvNV = func.invoke("glMultiTexCoord1hvNV");
            PFN_glMultiTexCoord2hNV = func.invoke("glMultiTexCoord2hNV");
            PFN_glMultiTexCoord2hvNV = func.invoke("glMultiTexCoord2hvNV");
            PFN_glMultiTexCoord3hNV = func.invoke("glMultiTexCoord3hNV");
            PFN_glMultiTexCoord3hvNV = func.invoke("glMultiTexCoord3hvNV");
            PFN_glMultiTexCoord4hNV = func.invoke("glMultiTexCoord4hNV");
            PFN_glMultiTexCoord4hvNV = func.invoke("glMultiTexCoord4hvNV");
            PFN_glVertexAttrib1hNV = func.invoke("glVertexAttrib1hNV");
            PFN_glVertexAttrib1hvNV = func.invoke("glVertexAttrib1hvNV");
            PFN_glVertexAttrib2hNV = func.invoke("glVertexAttrib2hNV");
            PFN_glVertexAttrib2hvNV = func.invoke("glVertexAttrib2hvNV");
            PFN_glVertexAttrib3hNV = func.invoke("glVertexAttrib3hNV");
            PFN_glVertexAttrib3hvNV = func.invoke("glVertexAttrib3hvNV");
            PFN_glVertexAttrib4hNV = func.invoke("glVertexAttrib4hNV");
            PFN_glVertexAttrib4hvNV = func.invoke("glVertexAttrib4hvNV");
            PFN_glVertexAttribs1hvNV = func.invoke("glVertexAttribs1hvNV");
            PFN_glVertexAttribs2hvNV = func.invoke("glVertexAttribs2hvNV");
            PFN_glVertexAttribs3hvNV = func.invoke("glVertexAttribs3hvNV");
            PFN_glVertexAttribs4hvNV = func.invoke("glVertexAttribs4hvNV");PFN_glFogCoordhNV = func.invoke("glFogCoordhNV");
            PFN_glFogCoordhvNV = func.invoke("glFogCoordhvNV");PFN_glSecondaryColor3hNV = func.invoke("glSecondaryColor3hNV");
            PFN_glSecondaryColor3hvNV = func.invoke("glSecondaryColor3hvNV");PFN_glVertexWeighthNV = func.invoke("glVertexWeighthNV");
            PFN_glVertexWeighthvNV = func.invoke("glVertexWeighthvNV");
        }
    }

    public GLNVHalfFloat(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glVertex2hNV(unsigned short x, unsigned short y);
    /// ```
    public void Vertex2hNV(short x, short y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex2hNV)) throw new SymbolNotFoundError("Symbol not found: glVertex2hNV");
        try { Handles.MH_glVertex2hNV.invokeExact(handles.PFN_glVertex2hNV, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex2hNV", e); }
    }

    /// ```
    /// void glVertex2hvNV(const GLhalfNV* v);
    /// ```
    public void Vertex2hvNV(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex2hvNV)) throw new SymbolNotFoundError("Symbol not found: glVertex2hvNV");
        try { Handles.MH_glVertex2hvNV.invokeExact(handles.PFN_glVertex2hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex2hvNV", e); }
    }

    /// ```
    /// void glVertex3hNV(unsigned short x, unsigned short y, unsigned short z);
    /// ```
    public void Vertex3hNV(short x, short y, short z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex3hNV)) throw new SymbolNotFoundError("Symbol not found: glVertex3hNV");
        try { Handles.MH_glVertex3hNV.invokeExact(handles.PFN_glVertex3hNV, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex3hNV", e); }
    }

    /// ```
    /// void glVertex3hvNV(const GLhalfNV* v);
    /// ```
    public void Vertex3hvNV(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex3hvNV)) throw new SymbolNotFoundError("Symbol not found: glVertex3hvNV");
        try { Handles.MH_glVertex3hvNV.invokeExact(handles.PFN_glVertex3hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex3hvNV", e); }
    }

    /// ```
    /// void glVertex4hNV(unsigned short x, unsigned short y, unsigned short z, unsigned short w);
    /// ```
    public void Vertex4hNV(short x, short y, short z, short w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex4hNV)) throw new SymbolNotFoundError("Symbol not found: glVertex4hNV");
        try { Handles.MH_glVertex4hNV.invokeExact(handles.PFN_glVertex4hNV, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex4hNV", e); }
    }

    /// ```
    /// void glVertex4hvNV(const GLhalfNV* v);
    /// ```
    public void Vertex4hvNV(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex4hvNV)) throw new SymbolNotFoundError("Symbol not found: glVertex4hvNV");
        try { Handles.MH_glVertex4hvNV.invokeExact(handles.PFN_glVertex4hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex4hvNV", e); }
    }

    /// ```
    /// void glNormal3hNV(unsigned short nx, unsigned short ny, unsigned short nz);
    /// ```
    public void Normal3hNV(short nx, short ny, short nz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormal3hNV)) throw new SymbolNotFoundError("Symbol not found: glNormal3hNV");
        try { Handles.MH_glNormal3hNV.invokeExact(handles.PFN_glNormal3hNV, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in Normal3hNV", e); }
    }

    /// ```
    /// void glNormal3hvNV(const GLhalfNV* v);
    /// ```
    public void Normal3hvNV(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormal3hvNV)) throw new SymbolNotFoundError("Symbol not found: glNormal3hvNV");
        try { Handles.MH_glNormal3hvNV.invokeExact(handles.PFN_glNormal3hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in Normal3hvNV", e); }
    }

    /// ```
    /// void glColor3hNV(unsigned short red, unsigned short green, unsigned short blue);
    /// ```
    public void Color3hNV(short red, short green, short blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor3hNV)) throw new SymbolNotFoundError("Symbol not found: glColor3hNV");
        try { Handles.MH_glColor3hNV.invokeExact(handles.PFN_glColor3hNV, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in Color3hNV", e); }
    }

    /// ```
    /// void glColor3hvNV(const GLhalfNV* v);
    /// ```
    public void Color3hvNV(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor3hvNV)) throw new SymbolNotFoundError("Symbol not found: glColor3hvNV");
        try { Handles.MH_glColor3hvNV.invokeExact(handles.PFN_glColor3hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in Color3hvNV", e); }
    }

    /// ```
    /// void glColor4hNV(unsigned short red, unsigned short green, unsigned short blue, unsigned short alpha);
    /// ```
    public void Color4hNV(short red, short green, short blue, short alpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4hNV)) throw new SymbolNotFoundError("Symbol not found: glColor4hNV");
        try { Handles.MH_glColor4hNV.invokeExact(handles.PFN_glColor4hNV, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in Color4hNV", e); }
    }

    /// ```
    /// void glColor4hvNV(const GLhalfNV* v);
    /// ```
    public void Color4hvNV(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4hvNV)) throw new SymbolNotFoundError("Symbol not found: glColor4hvNV");
        try { Handles.MH_glColor4hvNV.invokeExact(handles.PFN_glColor4hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in Color4hvNV", e); }
    }

    /// ```
    /// void glTexCoord1hNV(unsigned short s);
    /// ```
    public void TexCoord1hNV(short s) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord1hNV)) throw new SymbolNotFoundError("Symbol not found: glTexCoord1hNV");
        try { Handles.MH_glTexCoord1hNV.invokeExact(handles.PFN_glTexCoord1hNV, s); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord1hNV", e); }
    }

    /// ```
    /// void glTexCoord1hvNV(const GLhalfNV* v);
    /// ```
    public void TexCoord1hvNV(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord1hvNV)) throw new SymbolNotFoundError("Symbol not found: glTexCoord1hvNV");
        try { Handles.MH_glTexCoord1hvNV.invokeExact(handles.PFN_glTexCoord1hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord1hvNV", e); }
    }

    /// ```
    /// void glTexCoord2hNV(unsigned short s, unsigned short t);
    /// ```
    public void TexCoord2hNV(short s, short t) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2hNV)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2hNV");
        try { Handles.MH_glTexCoord2hNV.invokeExact(handles.PFN_glTexCoord2hNV, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2hNV", e); }
    }

    /// ```
    /// void glTexCoord2hvNV(const GLhalfNV* v);
    /// ```
    public void TexCoord2hvNV(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2hvNV)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2hvNV");
        try { Handles.MH_glTexCoord2hvNV.invokeExact(handles.PFN_glTexCoord2hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2hvNV", e); }
    }

    /// ```
    /// void glTexCoord3hNV(unsigned short s, unsigned short t, unsigned short r);
    /// ```
    public void TexCoord3hNV(short s, short t, short r) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord3hNV)) throw new SymbolNotFoundError("Symbol not found: glTexCoord3hNV");
        try { Handles.MH_glTexCoord3hNV.invokeExact(handles.PFN_glTexCoord3hNV, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord3hNV", e); }
    }

    /// ```
    /// void glTexCoord3hvNV(const GLhalfNV* v);
    /// ```
    public void TexCoord3hvNV(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord3hvNV)) throw new SymbolNotFoundError("Symbol not found: glTexCoord3hvNV");
        try { Handles.MH_glTexCoord3hvNV.invokeExact(handles.PFN_glTexCoord3hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord3hvNV", e); }
    }

    /// ```
    /// void glTexCoord4hNV(unsigned short s, unsigned short t, unsigned short r, unsigned short q);
    /// ```
    public void TexCoord4hNV(short s, short t, short r, short q) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord4hNV)) throw new SymbolNotFoundError("Symbol not found: glTexCoord4hNV");
        try { Handles.MH_glTexCoord4hNV.invokeExact(handles.PFN_glTexCoord4hNV, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord4hNV", e); }
    }

    /// ```
    /// void glTexCoord4hvNV(const GLhalfNV* v);
    /// ```
    public void TexCoord4hvNV(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord4hvNV)) throw new SymbolNotFoundError("Symbol not found: glTexCoord4hvNV");
        try { Handles.MH_glTexCoord4hvNV.invokeExact(handles.PFN_glTexCoord4hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord4hvNV", e); }
    }

    /// ```
    /// void glMultiTexCoord1hNV(unsigned int target, unsigned short s);
    /// ```
    public void MultiTexCoord1hNV(int target, short s) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1hNV)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1hNV");
        try { Handles.MH_glMultiTexCoord1hNV.invokeExact(handles.PFN_glMultiTexCoord1hNV, target, s); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1hNV", e); }
    }

    /// ```
    /// void glMultiTexCoord1hvNV(unsigned int target, const GLhalfNV* v);
    /// ```
    public void MultiTexCoord1hvNV(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1hvNV)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1hvNV");
        try { Handles.MH_glMultiTexCoord1hvNV.invokeExact(handles.PFN_glMultiTexCoord1hvNV, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1hvNV", e); }
    }

    /// ```
    /// void glMultiTexCoord2hNV(unsigned int target, unsigned short s, unsigned short t);
    /// ```
    public void MultiTexCoord2hNV(int target, short s, short t) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2hNV)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2hNV");
        try { Handles.MH_glMultiTexCoord2hNV.invokeExact(handles.PFN_glMultiTexCoord2hNV, target, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2hNV", e); }
    }

    /// ```
    /// void glMultiTexCoord2hvNV(unsigned int target, const GLhalfNV* v);
    /// ```
    public void MultiTexCoord2hvNV(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2hvNV)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2hvNV");
        try { Handles.MH_glMultiTexCoord2hvNV.invokeExact(handles.PFN_glMultiTexCoord2hvNV, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2hvNV", e); }
    }

    /// ```
    /// void glMultiTexCoord3hNV(unsigned int target, unsigned short s, unsigned short t, unsigned short r);
    /// ```
    public void MultiTexCoord3hNV(int target, short s, short t, short r) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3hNV)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3hNV");
        try { Handles.MH_glMultiTexCoord3hNV.invokeExact(handles.PFN_glMultiTexCoord3hNV, target, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3hNV", e); }
    }

    /// ```
    /// void glMultiTexCoord3hvNV(unsigned int target, const GLhalfNV* v);
    /// ```
    public void MultiTexCoord3hvNV(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3hvNV)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3hvNV");
        try { Handles.MH_glMultiTexCoord3hvNV.invokeExact(handles.PFN_glMultiTexCoord3hvNV, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3hvNV", e); }
    }

    /// ```
    /// void glMultiTexCoord4hNV(unsigned int target, unsigned short s, unsigned short t, unsigned short r, unsigned short q);
    /// ```
    public void MultiTexCoord4hNV(int target, short s, short t, short r, short q) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4hNV)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4hNV");
        try { Handles.MH_glMultiTexCoord4hNV.invokeExact(handles.PFN_glMultiTexCoord4hNV, target, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4hNV", e); }
    }

    /// ```
    /// void glMultiTexCoord4hvNV(unsigned int target, const GLhalfNV* v);
    /// ```
    public void MultiTexCoord4hvNV(int target, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4hvNV)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4hvNV");
        try { Handles.MH_glMultiTexCoord4hvNV.invokeExact(handles.PFN_glMultiTexCoord4hvNV, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4hvNV", e); }
    }

    /// ```
    /// void glVertexAttrib1hNV(unsigned int index, unsigned short x);
    /// ```
    public void VertexAttrib1hNV(int index, short x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1hNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1hNV");
        try { Handles.MH_glVertexAttrib1hNV.invokeExact(handles.PFN_glVertexAttrib1hNV, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1hNV", e); }
    }

    /// ```
    /// void glVertexAttrib1hvNV(unsigned int index, const GLhalfNV* v);
    /// ```
    public void VertexAttrib1hvNV(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1hvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1hvNV");
        try { Handles.MH_glVertexAttrib1hvNV.invokeExact(handles.PFN_glVertexAttrib1hvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1hvNV", e); }
    }

    /// ```
    /// void glVertexAttrib2hNV(unsigned int index, unsigned short x, unsigned short y);
    /// ```
    public void VertexAttrib2hNV(int index, short x, short y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2hNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2hNV");
        try { Handles.MH_glVertexAttrib2hNV.invokeExact(handles.PFN_glVertexAttrib2hNV, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2hNV", e); }
    }

    /// ```
    /// void glVertexAttrib2hvNV(unsigned int index, const GLhalfNV* v);
    /// ```
    public void VertexAttrib2hvNV(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2hvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2hvNV");
        try { Handles.MH_glVertexAttrib2hvNV.invokeExact(handles.PFN_glVertexAttrib2hvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2hvNV", e); }
    }

    /// ```
    /// void glVertexAttrib3hNV(unsigned int index, unsigned short x, unsigned short y, unsigned short z);
    /// ```
    public void VertexAttrib3hNV(int index, short x, short y, short z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3hNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3hNV");
        try { Handles.MH_glVertexAttrib3hNV.invokeExact(handles.PFN_glVertexAttrib3hNV, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3hNV", e); }
    }

    /// ```
    /// void glVertexAttrib3hvNV(unsigned int index, const GLhalfNV* v);
    /// ```
    public void VertexAttrib3hvNV(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3hvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3hvNV");
        try { Handles.MH_glVertexAttrib3hvNV.invokeExact(handles.PFN_glVertexAttrib3hvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3hvNV", e); }
    }

    /// ```
    /// void glVertexAttrib4hNV(unsigned int index, unsigned short x, unsigned short y, unsigned short z, unsigned short w);
    /// ```
    public void VertexAttrib4hNV(int index, short x, short y, short z, short w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4hNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4hNV");
        try { Handles.MH_glVertexAttrib4hNV.invokeExact(handles.PFN_glVertexAttrib4hNV, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4hNV", e); }
    }

    /// ```
    /// void glVertexAttrib4hvNV(unsigned int index, const GLhalfNV* v);
    /// ```
    public void VertexAttrib4hvNV(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4hvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4hvNV");
        try { Handles.MH_glVertexAttrib4hvNV.invokeExact(handles.PFN_glVertexAttrib4hvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4hvNV", e); }
    }

    /// ```
    /// void glVertexAttribs1hvNV(unsigned int index, int n, const GLhalfNV* v);
    /// ```
    public void VertexAttribs1hvNV(int index, int n, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs1hvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribs1hvNV");
        try { Handles.MH_glVertexAttribs1hvNV.invokeExact(handles.PFN_glVertexAttribs1hvNV, index, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs1hvNV", e); }
    }

    /// ```
    /// void glVertexAttribs2hvNV(unsigned int index, int n, const GLhalfNV* v);
    /// ```
    public void VertexAttribs2hvNV(int index, int n, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs2hvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribs2hvNV");
        try { Handles.MH_glVertexAttribs2hvNV.invokeExact(handles.PFN_glVertexAttribs2hvNV, index, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs2hvNV", e); }
    }

    /// ```
    /// void glVertexAttribs3hvNV(unsigned int index, int n, const GLhalfNV* v);
    /// ```
    public void VertexAttribs3hvNV(int index, int n, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs3hvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribs3hvNV");
        try { Handles.MH_glVertexAttribs3hvNV.invokeExact(handles.PFN_glVertexAttribs3hvNV, index, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs3hvNV", e); }
    }

    /// ```
    /// void glVertexAttribs4hvNV(unsigned int index, int n, const GLhalfNV* v);
    /// ```
    public void VertexAttribs4hvNV(int index, int n, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs4hvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribs4hvNV");
        try { Handles.MH_glVertexAttribs4hvNV.invokeExact(handles.PFN_glVertexAttribs4hvNV, index, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs4hvNV", e); }
    }

    /// ```
    /// void glFogCoordhNV(unsigned short fog);
    /// ```
    public void FogCoordhNV(short fog) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFogCoordhNV)) throw new SymbolNotFoundError("Symbol not found: glFogCoordhNV");
        try { Handles.MH_glFogCoordhNV.invokeExact(handles.PFN_glFogCoordhNV, fog); }
        catch (Throwable e) { throw new RuntimeException("error in FogCoordhNV", e); }
    }

    /// ```
    /// void glFogCoordhvNV(const GLhalfNV* fog);
    /// ```
    public void FogCoordhvNV(MemorySegment fog) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFogCoordhvNV)) throw new SymbolNotFoundError("Symbol not found: glFogCoordhvNV");
        try { Handles.MH_glFogCoordhvNV.invokeExact(handles.PFN_glFogCoordhvNV, fog); }
        catch (Throwable e) { throw new RuntimeException("error in FogCoordhvNV", e); }
    }

    /// ```
    /// void glSecondaryColor3hNV(unsigned short red, unsigned short green, unsigned short blue);
    /// ```
    public void SecondaryColor3hNV(short red, short green, short blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3hNV)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3hNV");
        try { Handles.MH_glSecondaryColor3hNV.invokeExact(handles.PFN_glSecondaryColor3hNV, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3hNV", e); }
    }

    /// ```
    /// void glSecondaryColor3hvNV(const GLhalfNV* v);
    /// ```
    public void SecondaryColor3hvNV(MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3hvNV)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3hvNV");
        try { Handles.MH_glSecondaryColor3hvNV.invokeExact(handles.PFN_glSecondaryColor3hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3hvNV", e); }
    }

    /// ```
    /// void glVertexWeighthNV(unsigned short weight);
    /// ```
    public void VertexWeighthNV(short weight) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexWeighthNV)) throw new SymbolNotFoundError("Symbol not found: glVertexWeighthNV");
        try { Handles.MH_glVertexWeighthNV.invokeExact(handles.PFN_glVertexWeighthNV, weight); }
        catch (Throwable e) { throw new RuntimeException("error in VertexWeighthNV", e); }
    }

    /// ```
    /// void glVertexWeighthvNV(const GLhalfNV* weight);
    /// ```
    public void VertexWeighthvNV(MemorySegment weight) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexWeighthvNV)) throw new SymbolNotFoundError("Symbol not found: glVertexWeighthvNV");
        try { Handles.MH_glVertexWeighthvNV.invokeExact(handles.PFN_glVertexWeighthvNV, weight); }
        catch (Throwable e) { throw new RuntimeException("error in VertexWeighthvNV", e); }
    }

}
