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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVHalfFloat {
    public static final int GL_HALF_FLOAT_NV = 0x140B;
    public static final MethodHandle MH_glVertex2hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glVertex2hNV;
    public static final MethodHandle MH_glVertex2hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertex2hvNV;
    public static final MethodHandle MH_glVertex3hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glVertex3hNV;
    public static final MethodHandle MH_glVertex3hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertex3hvNV;
    public static final MethodHandle MH_glVertex4hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glVertex4hNV;
    public static final MethodHandle MH_glVertex4hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertex4hvNV;
    public static final MethodHandle MH_glNormal3hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glNormal3hNV;
    public static final MethodHandle MH_glNormal3hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glNormal3hvNV;
    public static final MethodHandle MH_glColor3hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glColor3hNV;
    public static final MethodHandle MH_glColor3hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glColor3hvNV;
    public static final MethodHandle MH_glColor4hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glColor4hNV;
    public static final MethodHandle MH_glColor4hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glColor4hvNV;
    public static final MethodHandle MH_glTexCoord1hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glTexCoord1hNV;
    public static final MethodHandle MH_glTexCoord1hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord1hvNV;
    public static final MethodHandle MH_glTexCoord2hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glTexCoord2hNV;
    public static final MethodHandle MH_glTexCoord2hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord2hvNV;
    public static final MethodHandle MH_glTexCoord3hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glTexCoord3hNV;
    public static final MethodHandle MH_glTexCoord3hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord3hvNV;
    public static final MethodHandle MH_glTexCoord4hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glTexCoord4hNV;
    public static final MethodHandle MH_glTexCoord4hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord4hvNV;
    public static final MethodHandle MH_glMultiTexCoord1hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glMultiTexCoord1hNV;
    public static final MethodHandle MH_glMultiTexCoord1hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexCoord1hvNV;
    public static final MethodHandle MH_glMultiTexCoord2hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glMultiTexCoord2hNV;
    public static final MethodHandle MH_glMultiTexCoord2hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexCoord2hvNV;
    public static final MethodHandle MH_glMultiTexCoord3hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glMultiTexCoord3hNV;
    public static final MethodHandle MH_glMultiTexCoord3hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexCoord3hvNV;
    public static final MethodHandle MH_glMultiTexCoord4hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glMultiTexCoord4hNV;
    public static final MethodHandle MH_glMultiTexCoord4hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexCoord4hvNV;
    public static final MethodHandle MH_glVertexAttrib1hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glVertexAttrib1hNV;
    public static final MethodHandle MH_glVertexAttrib1hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttrib1hvNV;
    public static final MethodHandle MH_glVertexAttrib2hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glVertexAttrib2hNV;
    public static final MethodHandle MH_glVertexAttrib2hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttrib2hvNV;
    public static final MethodHandle MH_glVertexAttrib3hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glVertexAttrib3hNV;
    public static final MethodHandle MH_glVertexAttrib3hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttrib3hvNV;
    public static final MethodHandle MH_glVertexAttrib4hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glVertexAttrib4hNV;
    public static final MethodHandle MH_glVertexAttrib4hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttrib4hvNV;
    public static final MethodHandle MH_glVertexAttribs1hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribs1hvNV;
    public static final MethodHandle MH_glVertexAttribs2hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribs2hvNV;
    public static final MethodHandle MH_glVertexAttribs3hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribs3hvNV;
    public static final MethodHandle MH_glVertexAttribs4hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribs4hvNV;
    public static final MethodHandle MH_glFogCoordhNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glFogCoordhNV;
    public static final MethodHandle MH_glFogCoordhvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glFogCoordhvNV;
    public static final MethodHandle MH_glSecondaryColor3hNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glSecondaryColor3hNV;
    public static final MethodHandle MH_glSecondaryColor3hvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSecondaryColor3hvNV;
    public static final MethodHandle MH_glVertexWeighthNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glVertexWeighthNV;
    public static final MethodHandle MH_glVertexWeighthvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexWeighthvNV;

    public GLNVHalfFloat(overrungl.opengl.GLLoadFunc func) {
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

    public void Vertex2hNV(@CType("GLhalfNV") short x, @CType("GLhalfNV") short y) {
        if (!Unmarshal.isNullPointer(PFN_glVertex2hNV)) { try {
            MH_glVertex2hNV.invokeExact(PFN_glVertex2hNV, x, y);
        } catch (Throwable e) { throw new RuntimeException("error in glVertex2hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertex2hNV"); }
    }

    public void Vertex2hvNV(@CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertex2hvNV)) { try {
            MH_glVertex2hvNV.invokeExact(PFN_glVertex2hvNV, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertex2hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertex2hvNV"); }
    }

    public void Vertex3hNV(@CType("GLhalfNV") short x, @CType("GLhalfNV") short y, @CType("GLhalfNV") short z) {
        if (!Unmarshal.isNullPointer(PFN_glVertex3hNV)) { try {
            MH_glVertex3hNV.invokeExact(PFN_glVertex3hNV, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glVertex3hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertex3hNV"); }
    }

    public void Vertex3hvNV(@CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertex3hvNV)) { try {
            MH_glVertex3hvNV.invokeExact(PFN_glVertex3hvNV, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertex3hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertex3hvNV"); }
    }

    public void Vertex4hNV(@CType("GLhalfNV") short x, @CType("GLhalfNV") short y, @CType("GLhalfNV") short z, @CType("GLhalfNV") short w) {
        if (!Unmarshal.isNullPointer(PFN_glVertex4hNV)) { try {
            MH_glVertex4hNV.invokeExact(PFN_glVertex4hNV, x, y, z, w);
        } catch (Throwable e) { throw new RuntimeException("error in glVertex4hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertex4hNV"); }
    }

    public void Vertex4hvNV(@CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertex4hvNV)) { try {
            MH_glVertex4hvNV.invokeExact(PFN_glVertex4hvNV, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertex4hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertex4hvNV"); }
    }

    public void Normal3hNV(@CType("GLhalfNV") short nx, @CType("GLhalfNV") short ny, @CType("GLhalfNV") short nz) {
        if (!Unmarshal.isNullPointer(PFN_glNormal3hNV)) { try {
            MH_glNormal3hNV.invokeExact(PFN_glNormal3hNV, nx, ny, nz);
        } catch (Throwable e) { throw new RuntimeException("error in glNormal3hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNormal3hNV"); }
    }

    public void Normal3hvNV(@CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glNormal3hvNV)) { try {
            MH_glNormal3hvNV.invokeExact(PFN_glNormal3hvNV, v);
        } catch (Throwable e) { throw new RuntimeException("error in glNormal3hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNormal3hvNV"); }
    }

    public void Color3hNV(@CType("GLhalfNV") short red, @CType("GLhalfNV") short green, @CType("GLhalfNV") short blue) {
        if (!Unmarshal.isNullPointer(PFN_glColor3hNV)) { try {
            MH_glColor3hNV.invokeExact(PFN_glColor3hNV, red, green, blue);
        } catch (Throwable e) { throw new RuntimeException("error in glColor3hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColor3hNV"); }
    }

    public void Color3hvNV(@CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glColor3hvNV)) { try {
            MH_glColor3hvNV.invokeExact(PFN_glColor3hvNV, v);
        } catch (Throwable e) { throw new RuntimeException("error in glColor3hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColor3hvNV"); }
    }

    public void Color4hNV(@CType("GLhalfNV") short red, @CType("GLhalfNV") short green, @CType("GLhalfNV") short blue, @CType("GLhalfNV") short alpha) {
        if (!Unmarshal.isNullPointer(PFN_glColor4hNV)) { try {
            MH_glColor4hNV.invokeExact(PFN_glColor4hNV, red, green, blue, alpha);
        } catch (Throwable e) { throw new RuntimeException("error in glColor4hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColor4hNV"); }
    }

    public void Color4hvNV(@CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glColor4hvNV)) { try {
            MH_glColor4hvNV.invokeExact(PFN_glColor4hvNV, v);
        } catch (Throwable e) { throw new RuntimeException("error in glColor4hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColor4hvNV"); }
    }

    public void TexCoord1hNV(@CType("GLhalfNV") short s) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord1hNV)) { try {
            MH_glTexCoord1hNV.invokeExact(PFN_glTexCoord1hNV, s);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord1hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord1hNV"); }
    }

    public void TexCoord1hvNV(@CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord1hvNV)) { try {
            MH_glTexCoord1hvNV.invokeExact(PFN_glTexCoord1hvNV, v);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord1hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord1hvNV"); }
    }

    public void TexCoord2hNV(@CType("GLhalfNV") short s, @CType("GLhalfNV") short t) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord2hNV)) { try {
            MH_glTexCoord2hNV.invokeExact(PFN_glTexCoord2hNV, s, t);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord2hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord2hNV"); }
    }

    public void TexCoord2hvNV(@CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord2hvNV)) { try {
            MH_glTexCoord2hvNV.invokeExact(PFN_glTexCoord2hvNV, v);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord2hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord2hvNV"); }
    }

    public void TexCoord3hNV(@CType("GLhalfNV") short s, @CType("GLhalfNV") short t, @CType("GLhalfNV") short r) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord3hNV)) { try {
            MH_glTexCoord3hNV.invokeExact(PFN_glTexCoord3hNV, s, t, r);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord3hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord3hNV"); }
    }

    public void TexCoord3hvNV(@CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord3hvNV)) { try {
            MH_glTexCoord3hvNV.invokeExact(PFN_glTexCoord3hvNV, v);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord3hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord3hvNV"); }
    }

    public void TexCoord4hNV(@CType("GLhalfNV") short s, @CType("GLhalfNV") short t, @CType("GLhalfNV") short r, @CType("GLhalfNV") short q) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord4hNV)) { try {
            MH_glTexCoord4hNV.invokeExact(PFN_glTexCoord4hNV, s, t, r, q);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord4hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord4hNV"); }
    }

    public void TexCoord4hvNV(@CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord4hvNV)) { try {
            MH_glTexCoord4hvNV.invokeExact(PFN_glTexCoord4hvNV, v);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord4hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord4hvNV"); }
    }

    public void MultiTexCoord1hNV(@CType("GLenum") int target, @CType("GLhalfNV") short s) {
        if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord1hNV)) { try {
            MH_glMultiTexCoord1hNV.invokeExact(PFN_glMultiTexCoord1hNV, target, s);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord1hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1hNV"); }
    }

    public void MultiTexCoord1hvNV(@CType("GLenum") int target, @CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord1hvNV)) { try {
            MH_glMultiTexCoord1hvNV.invokeExact(PFN_glMultiTexCoord1hvNV, target, v);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord1hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1hvNV"); }
    }

    public void MultiTexCoord2hNV(@CType("GLenum") int target, @CType("GLhalfNV") short s, @CType("GLhalfNV") short t) {
        if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord2hNV)) { try {
            MH_glMultiTexCoord2hNV.invokeExact(PFN_glMultiTexCoord2hNV, target, s, t);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord2hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2hNV"); }
    }

    public void MultiTexCoord2hvNV(@CType("GLenum") int target, @CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord2hvNV)) { try {
            MH_glMultiTexCoord2hvNV.invokeExact(PFN_glMultiTexCoord2hvNV, target, v);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord2hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2hvNV"); }
    }

    public void MultiTexCoord3hNV(@CType("GLenum") int target, @CType("GLhalfNV") short s, @CType("GLhalfNV") short t, @CType("GLhalfNV") short r) {
        if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord3hNV)) { try {
            MH_glMultiTexCoord3hNV.invokeExact(PFN_glMultiTexCoord3hNV, target, s, t, r);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord3hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3hNV"); }
    }

    public void MultiTexCoord3hvNV(@CType("GLenum") int target, @CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord3hvNV)) { try {
            MH_glMultiTexCoord3hvNV.invokeExact(PFN_glMultiTexCoord3hvNV, target, v);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord3hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3hvNV"); }
    }

    public void MultiTexCoord4hNV(@CType("GLenum") int target, @CType("GLhalfNV") short s, @CType("GLhalfNV") short t, @CType("GLhalfNV") short r, @CType("GLhalfNV") short q) {
        if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord4hNV)) { try {
            MH_glMultiTexCoord4hNV.invokeExact(PFN_glMultiTexCoord4hNV, target, s, t, r, q);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord4hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4hNV"); }
    }

    public void MultiTexCoord4hvNV(@CType("GLenum") int target, @CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord4hvNV)) { try {
            MH_glMultiTexCoord4hvNV.invokeExact(PFN_glMultiTexCoord4hvNV, target, v);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord4hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4hvNV"); }
    }

    public void VertexAttrib1hNV(@CType("GLuint") int index, @CType("GLhalfNV") short x) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttrib1hNV)) { try {
            MH_glVertexAttrib1hNV.invokeExact(PFN_glVertexAttrib1hNV, index, x);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1hNV"); }
    }

    public void VertexAttrib1hvNV(@CType("GLuint") int index, @CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttrib1hvNV)) { try {
            MH_glVertexAttrib1hvNV.invokeExact(PFN_glVertexAttrib1hvNV, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1hvNV"); }
    }

    public void VertexAttrib2hNV(@CType("GLuint") int index, @CType("GLhalfNV") short x, @CType("GLhalfNV") short y) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttrib2hNV)) { try {
            MH_glVertexAttrib2hNV.invokeExact(PFN_glVertexAttrib2hNV, index, x, y);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2hNV"); }
    }

    public void VertexAttrib2hvNV(@CType("GLuint") int index, @CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttrib2hvNV)) { try {
            MH_glVertexAttrib2hvNV.invokeExact(PFN_glVertexAttrib2hvNV, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2hvNV"); }
    }

    public void VertexAttrib3hNV(@CType("GLuint") int index, @CType("GLhalfNV") short x, @CType("GLhalfNV") short y, @CType("GLhalfNV") short z) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttrib3hNV)) { try {
            MH_glVertexAttrib3hNV.invokeExact(PFN_glVertexAttrib3hNV, index, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3hNV"); }
    }

    public void VertexAttrib3hvNV(@CType("GLuint") int index, @CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttrib3hvNV)) { try {
            MH_glVertexAttrib3hvNV.invokeExact(PFN_glVertexAttrib3hvNV, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3hvNV"); }
    }

    public void VertexAttrib4hNV(@CType("GLuint") int index, @CType("GLhalfNV") short x, @CType("GLhalfNV") short y, @CType("GLhalfNV") short z, @CType("GLhalfNV") short w) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttrib4hNV)) { try {
            MH_glVertexAttrib4hNV.invokeExact(PFN_glVertexAttrib4hNV, index, x, y, z, w);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4hNV"); }
    }

    public void VertexAttrib4hvNV(@CType("GLuint") int index, @CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttrib4hvNV)) { try {
            MH_glVertexAttrib4hvNV.invokeExact(PFN_glVertexAttrib4hvNV, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4hvNV"); }
    }

    public void VertexAttribs1hvNV(@CType("GLuint") int index, @CType("GLsizei") int n, @CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribs1hvNV)) { try {
            MH_glVertexAttribs1hvNV.invokeExact(PFN_glVertexAttribs1hvNV, index, n, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribs1hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribs1hvNV"); }
    }

    public void VertexAttribs2hvNV(@CType("GLuint") int index, @CType("GLsizei") int n, @CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribs2hvNV)) { try {
            MH_glVertexAttribs2hvNV.invokeExact(PFN_glVertexAttribs2hvNV, index, n, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribs2hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribs2hvNV"); }
    }

    public void VertexAttribs3hvNV(@CType("GLuint") int index, @CType("GLsizei") int n, @CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribs3hvNV)) { try {
            MH_glVertexAttribs3hvNV.invokeExact(PFN_glVertexAttribs3hvNV, index, n, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribs3hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribs3hvNV"); }
    }

    public void VertexAttribs4hvNV(@CType("GLuint") int index, @CType("GLsizei") int n, @CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribs4hvNV)) { try {
            MH_glVertexAttribs4hvNV.invokeExact(PFN_glVertexAttribs4hvNV, index, n, v);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribs4hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribs4hvNV"); }
    }

    public void FogCoordhNV(@CType("GLhalfNV") short fog) {
        if (!Unmarshal.isNullPointer(PFN_glFogCoordhNV)) { try {
            MH_glFogCoordhNV.invokeExact(PFN_glFogCoordhNV, fog);
        } catch (Throwable e) { throw new RuntimeException("error in glFogCoordhNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFogCoordhNV"); }
    }

    public void FogCoordhvNV(@CType("const GLhalfNV *") java.lang.foreign.MemorySegment fog) {
        if (!Unmarshal.isNullPointer(PFN_glFogCoordhvNV)) { try {
            MH_glFogCoordhvNV.invokeExact(PFN_glFogCoordhvNV, fog);
        } catch (Throwable e) { throw new RuntimeException("error in glFogCoordhvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFogCoordhvNV"); }
    }

    public void SecondaryColor3hNV(@CType("GLhalfNV") short red, @CType("GLhalfNV") short green, @CType("GLhalfNV") short blue) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColor3hNV)) { try {
            MH_glSecondaryColor3hNV.invokeExact(PFN_glSecondaryColor3hNV, red, green, blue);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3hNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3hNV"); }
    }

    public void SecondaryColor3hvNV(@CType("const GLhalfNV *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColor3hvNV)) { try {
            MH_glSecondaryColor3hvNV.invokeExact(PFN_glSecondaryColor3hvNV, v);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3hvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3hvNV"); }
    }

    public void VertexWeighthNV(@CType("GLhalfNV") short weight) {
        if (!Unmarshal.isNullPointer(PFN_glVertexWeighthNV)) { try {
            MH_glVertexWeighthNV.invokeExact(PFN_glVertexWeighthNV, weight);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexWeighthNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexWeighthNV"); }
    }

    public void VertexWeighthvNV(@CType("const GLhalfNV *") java.lang.foreign.MemorySegment weight) {
        if (!Unmarshal.isNullPointer(PFN_glVertexWeighthvNV)) { try {
            MH_glVertexWeighthvNV.invokeExact(PFN_glVertexWeighthvNV, weight);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexWeighthvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexWeighthvNV"); }
    }

}
