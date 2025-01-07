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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSUNVertex {
    public static final MethodHandle MH_glColor4ubVertex2fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glColor4ubVertex2fSUN;
    public static final MethodHandle MH_glColor4ubVertex2fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glColor4ubVertex2fvSUN;
    public static final MethodHandle MH_glColor4ubVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glColor4ubVertex3fSUN;
    public static final MethodHandle MH_glColor4ubVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glColor4ubVertex3fvSUN;
    public static final MethodHandle MH_glColor3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glColor3fVertex3fSUN;
    public static final MethodHandle MH_glColor3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glColor3fVertex3fvSUN;
    public static final MethodHandle MH_glNormal3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glNormal3fVertex3fSUN;
    public static final MethodHandle MH_glNormal3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glNormal3fVertex3fvSUN;
    public static final MethodHandle MH_glColor4fNormal3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glColor4fNormal3fVertex3fSUN;
    public static final MethodHandle MH_glColor4fNormal3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glColor4fNormal3fVertex3fvSUN;
    public static final MethodHandle MH_glTexCoord2fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glTexCoord2fVertex3fSUN;
    public static final MethodHandle MH_glTexCoord2fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord2fVertex3fvSUN;
    public static final MethodHandle MH_glTexCoord4fVertex4fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glTexCoord4fVertex4fSUN;
    public static final MethodHandle MH_glTexCoord4fVertex4fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord4fVertex4fvSUN;
    public static final MethodHandle MH_glTexCoord2fColor4ubVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glTexCoord2fColor4ubVertex3fSUN;
    public static final MethodHandle MH_glTexCoord2fColor4ubVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord2fColor4ubVertex3fvSUN;
    public static final MethodHandle MH_glTexCoord2fColor3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glTexCoord2fColor3fVertex3fSUN;
    public static final MethodHandle MH_glTexCoord2fColor3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord2fColor3fVertex3fvSUN;
    public static final MethodHandle MH_glTexCoord2fNormal3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glTexCoord2fNormal3fVertex3fSUN;
    public static final MethodHandle MH_glTexCoord2fNormal3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord2fNormal3fVertex3fvSUN;
    public static final MethodHandle MH_glTexCoord2fColor4fNormal3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glTexCoord2fColor4fNormal3fVertex3fSUN;
    public static final MethodHandle MH_glTexCoord2fColor4fNormal3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord2fColor4fNormal3fVertex3fvSUN;
    public static final MethodHandle MH_glTexCoord4fColor4fNormal3fVertex4fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glTexCoord4fColor4fNormal3fVertex4fSUN;
    public static final MethodHandle MH_glTexCoord4fColor4fNormal3fVertex4fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord4fColor4fNormal3fVertex4fvSUN;
    public static final MethodHandle MH_glReplacementCodeuiVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glReplacementCodeuiVertex3fSUN;
    public static final MethodHandle MH_glReplacementCodeuiVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glReplacementCodeuiVertex3fvSUN;
    public static final MethodHandle MH_glReplacementCodeuiColor4ubVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glReplacementCodeuiColor4ubVertex3fSUN;
    public static final MethodHandle MH_glReplacementCodeuiColor4ubVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glReplacementCodeuiColor4ubVertex3fvSUN;
    public static final MethodHandle MH_glReplacementCodeuiColor3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glReplacementCodeuiColor3fVertex3fSUN;
    public static final MethodHandle MH_glReplacementCodeuiColor3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glReplacementCodeuiColor3fVertex3fvSUN;
    public static final MethodHandle MH_glReplacementCodeuiNormal3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glReplacementCodeuiNormal3fVertex3fSUN;
    public static final MethodHandle MH_glReplacementCodeuiNormal3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glReplacementCodeuiNormal3fVertex3fvSUN;
    public static final MethodHandle MH_glReplacementCodeuiColor4fNormal3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glReplacementCodeuiColor4fNormal3fVertex3fSUN;
    public static final MethodHandle MH_glReplacementCodeuiColor4fNormal3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glReplacementCodeuiColor4fNormal3fVertex3fvSUN;
    public static final MethodHandle MH_glReplacementCodeuiTexCoord2fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glReplacementCodeuiTexCoord2fVertex3fSUN;
    public static final MethodHandle MH_glReplacementCodeuiTexCoord2fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glReplacementCodeuiTexCoord2fVertex3fvSUN;
    public static final MethodHandle MH_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN;
    public static final MethodHandle MH_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN;
    public static final MethodHandle MH_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN;
    public static final MethodHandle MH_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN;

    public GLSUNVertex(overrungl.opengl.GLLoadFunc func) {
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

    public void Color4ubVertex2fSUN(@CType("GLubyte") byte r, @CType("GLubyte") byte g, @CType("GLubyte") byte b, @CType("GLubyte") byte a, @CType("GLfloat") float x, @CType("GLfloat") float y) {
        if (!Unmarshal.isNullPointer(PFN_glColor4ubVertex2fSUN)) { try {
            MH_glColor4ubVertex2fSUN.invokeExact(PFN_glColor4ubVertex2fSUN, r, g, b, a, x, y);
        } catch (Throwable e) { throw new RuntimeException("error in glColor4ubVertex2fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColor4ubVertex2fSUN"); }
    }

    public void Color4ubVertex2fvSUN(@CType("const GLubyte *") java.lang.foreign.MemorySegment c, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glColor4ubVertex2fvSUN)) { try {
            MH_glColor4ubVertex2fvSUN.invokeExact(PFN_glColor4ubVertex2fvSUN, c, v);
        } catch (Throwable e) { throw new RuntimeException("error in glColor4ubVertex2fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColor4ubVertex2fvSUN"); }
    }

    public void Color4ubVertex3fSUN(@CType("GLubyte") byte r, @CType("GLubyte") byte g, @CType("GLubyte") byte b, @CType("GLubyte") byte a, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (!Unmarshal.isNullPointer(PFN_glColor4ubVertex3fSUN)) { try {
            MH_glColor4ubVertex3fSUN.invokeExact(PFN_glColor4ubVertex3fSUN, r, g, b, a, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glColor4ubVertex3fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColor4ubVertex3fSUN"); }
    }

    public void Color4ubVertex3fvSUN(@CType("const GLubyte *") java.lang.foreign.MemorySegment c, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glColor4ubVertex3fvSUN)) { try {
            MH_glColor4ubVertex3fvSUN.invokeExact(PFN_glColor4ubVertex3fvSUN, c, v);
        } catch (Throwable e) { throw new RuntimeException("error in glColor4ubVertex3fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColor4ubVertex3fvSUN"); }
    }

    public void Color3fVertex3fSUN(@CType("GLfloat") float r, @CType("GLfloat") float g, @CType("GLfloat") float b, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (!Unmarshal.isNullPointer(PFN_glColor3fVertex3fSUN)) { try {
            MH_glColor3fVertex3fSUN.invokeExact(PFN_glColor3fVertex3fSUN, r, g, b, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glColor3fVertex3fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColor3fVertex3fSUN"); }
    }

    public void Color3fVertex3fvSUN(@CType("const GLfloat *") java.lang.foreign.MemorySegment c, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glColor3fVertex3fvSUN)) { try {
            MH_glColor3fVertex3fvSUN.invokeExact(PFN_glColor3fVertex3fvSUN, c, v);
        } catch (Throwable e) { throw new RuntimeException("error in glColor3fVertex3fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColor3fVertex3fvSUN"); }
    }

    public void Normal3fVertex3fSUN(@CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (!Unmarshal.isNullPointer(PFN_glNormal3fVertex3fSUN)) { try {
            MH_glNormal3fVertex3fSUN.invokeExact(PFN_glNormal3fVertex3fSUN, nx, ny, nz, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glNormal3fVertex3fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNormal3fVertex3fSUN"); }
    }

    public void Normal3fVertex3fvSUN(@CType("const GLfloat *") java.lang.foreign.MemorySegment n, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glNormal3fVertex3fvSUN)) { try {
            MH_glNormal3fVertex3fvSUN.invokeExact(PFN_glNormal3fVertex3fvSUN, n, v);
        } catch (Throwable e) { throw new RuntimeException("error in glNormal3fVertex3fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNormal3fVertex3fvSUN"); }
    }

    public void Color4fNormal3fVertex3fSUN(@CType("GLfloat") float r, @CType("GLfloat") float g, @CType("GLfloat") float b, @CType("GLfloat") float a, @CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (!Unmarshal.isNullPointer(PFN_glColor4fNormal3fVertex3fSUN)) { try {
            MH_glColor4fNormal3fVertex3fSUN.invokeExact(PFN_glColor4fNormal3fVertex3fSUN, r, g, b, a, nx, ny, nz, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glColor4fNormal3fVertex3fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColor4fNormal3fVertex3fSUN"); }
    }

    public void Color4fNormal3fVertex3fvSUN(@CType("const GLfloat *") java.lang.foreign.MemorySegment c, @CType("const GLfloat *") java.lang.foreign.MemorySegment n, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glColor4fNormal3fVertex3fvSUN)) { try {
            MH_glColor4fNormal3fVertex3fvSUN.invokeExact(PFN_glColor4fNormal3fVertex3fvSUN, c, n, v);
        } catch (Throwable e) { throw new RuntimeException("error in glColor4fNormal3fVertex3fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColor4fNormal3fVertex3fvSUN"); }
    }

    public void TexCoord2fVertex3fSUN(@CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord2fVertex3fSUN)) { try {
            MH_glTexCoord2fVertex3fSUN.invokeExact(PFN_glTexCoord2fVertex3fSUN, s, t, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fVertex3fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord2fVertex3fSUN"); }
    }

    public void TexCoord2fVertex3fvSUN(@CType("const GLfloat *") java.lang.foreign.MemorySegment tc, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord2fVertex3fvSUN)) { try {
            MH_glTexCoord2fVertex3fvSUN.invokeExact(PFN_glTexCoord2fVertex3fvSUN, tc, v);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fVertex3fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord2fVertex3fvSUN"); }
    }

    public void TexCoord4fVertex4fSUN(@CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float p, @CType("GLfloat") float q, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord4fVertex4fSUN)) { try {
            MH_glTexCoord4fVertex4fSUN.invokeExact(PFN_glTexCoord4fVertex4fSUN, s, t, p, q, x, y, z, w);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord4fVertex4fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord4fVertex4fSUN"); }
    }

    public void TexCoord4fVertex4fvSUN(@CType("const GLfloat *") java.lang.foreign.MemorySegment tc, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord4fVertex4fvSUN)) { try {
            MH_glTexCoord4fVertex4fvSUN.invokeExact(PFN_glTexCoord4fVertex4fvSUN, tc, v);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord4fVertex4fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord4fVertex4fvSUN"); }
    }

    public void TexCoord2fColor4ubVertex3fSUN(@CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLubyte") byte r, @CType("GLubyte") byte g, @CType("GLubyte") byte b, @CType("GLubyte") byte a, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord2fColor4ubVertex3fSUN)) { try {
            MH_glTexCoord2fColor4ubVertex3fSUN.invokeExact(PFN_glTexCoord2fColor4ubVertex3fSUN, s, t, r, g, b, a, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fColor4ubVertex3fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord2fColor4ubVertex3fSUN"); }
    }

    public void TexCoord2fColor4ubVertex3fvSUN(@CType("const GLfloat *") java.lang.foreign.MemorySegment tc, @CType("const GLubyte *") java.lang.foreign.MemorySegment c, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord2fColor4ubVertex3fvSUN)) { try {
            MH_glTexCoord2fColor4ubVertex3fvSUN.invokeExact(PFN_glTexCoord2fColor4ubVertex3fvSUN, tc, c, v);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fColor4ubVertex3fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord2fColor4ubVertex3fvSUN"); }
    }

    public void TexCoord2fColor3fVertex3fSUN(@CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float r, @CType("GLfloat") float g, @CType("GLfloat") float b, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord2fColor3fVertex3fSUN)) { try {
            MH_glTexCoord2fColor3fVertex3fSUN.invokeExact(PFN_glTexCoord2fColor3fVertex3fSUN, s, t, r, g, b, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fColor3fVertex3fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord2fColor3fVertex3fSUN"); }
    }

    public void TexCoord2fColor3fVertex3fvSUN(@CType("const GLfloat *") java.lang.foreign.MemorySegment tc, @CType("const GLfloat *") java.lang.foreign.MemorySegment c, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord2fColor3fVertex3fvSUN)) { try {
            MH_glTexCoord2fColor3fVertex3fvSUN.invokeExact(PFN_glTexCoord2fColor3fVertex3fvSUN, tc, c, v);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fColor3fVertex3fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord2fColor3fVertex3fvSUN"); }
    }

    public void TexCoord2fNormal3fVertex3fSUN(@CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord2fNormal3fVertex3fSUN)) { try {
            MH_glTexCoord2fNormal3fVertex3fSUN.invokeExact(PFN_glTexCoord2fNormal3fVertex3fSUN, s, t, nx, ny, nz, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fNormal3fVertex3fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord2fNormal3fVertex3fSUN"); }
    }

    public void TexCoord2fNormal3fVertex3fvSUN(@CType("const GLfloat *") java.lang.foreign.MemorySegment tc, @CType("const GLfloat *") java.lang.foreign.MemorySegment n, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord2fNormal3fVertex3fvSUN)) { try {
            MH_glTexCoord2fNormal3fVertex3fvSUN.invokeExact(PFN_glTexCoord2fNormal3fVertex3fvSUN, tc, n, v);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fNormal3fVertex3fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord2fNormal3fVertex3fvSUN"); }
    }

    public void TexCoord2fColor4fNormal3fVertex3fSUN(@CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float r, @CType("GLfloat") float g, @CType("GLfloat") float b, @CType("GLfloat") float a, @CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord2fColor4fNormal3fVertex3fSUN)) { try {
            MH_glTexCoord2fColor4fNormal3fVertex3fSUN.invokeExact(PFN_glTexCoord2fColor4fNormal3fVertex3fSUN, s, t, r, g, b, a, nx, ny, nz, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fColor4fNormal3fVertex3fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord2fColor4fNormal3fVertex3fSUN"); }
    }

    public void TexCoord2fColor4fNormal3fVertex3fvSUN(@CType("const GLfloat *") java.lang.foreign.MemorySegment tc, @CType("const GLfloat *") java.lang.foreign.MemorySegment c, @CType("const GLfloat *") java.lang.foreign.MemorySegment n, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord2fColor4fNormal3fVertex3fvSUN)) { try {
            MH_glTexCoord2fColor4fNormal3fVertex3fvSUN.invokeExact(PFN_glTexCoord2fColor4fNormal3fVertex3fvSUN, tc, c, n, v);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fColor4fNormal3fVertex3fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord2fColor4fNormal3fVertex3fvSUN"); }
    }

    public void TexCoord4fColor4fNormal3fVertex4fSUN(@CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float p, @CType("GLfloat") float q, @CType("GLfloat") float r, @CType("GLfloat") float g, @CType("GLfloat") float b, @CType("GLfloat") float a, @CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord4fColor4fNormal3fVertex4fSUN)) { try {
            MH_glTexCoord4fColor4fNormal3fVertex4fSUN.invokeExact(PFN_glTexCoord4fColor4fNormal3fVertex4fSUN, s, t, p, q, r, g, b, a, nx, ny, nz, x, y, z, w);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord4fColor4fNormal3fVertex4fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord4fColor4fNormal3fVertex4fSUN"); }
    }

    public void TexCoord4fColor4fNormal3fVertex4fvSUN(@CType("const GLfloat *") java.lang.foreign.MemorySegment tc, @CType("const GLfloat *") java.lang.foreign.MemorySegment c, @CType("const GLfloat *") java.lang.foreign.MemorySegment n, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoord4fColor4fNormal3fVertex4fvSUN)) { try {
            MH_glTexCoord4fColor4fNormal3fVertex4fvSUN.invokeExact(PFN_glTexCoord4fColor4fNormal3fVertex4fvSUN, tc, c, n, v);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoord4fColor4fNormal3fVertex4fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoord4fColor4fNormal3fVertex4fvSUN"); }
    }

    public void ReplacementCodeuiVertex3fSUN(@CType("GLuint") int rc, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (!Unmarshal.isNullPointer(PFN_glReplacementCodeuiVertex3fSUN)) { try {
            MH_glReplacementCodeuiVertex3fSUN.invokeExact(PFN_glReplacementCodeuiVertex3fSUN, rc, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiVertex3fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiVertex3fSUN"); }
    }

    public void ReplacementCodeuiVertex3fvSUN(@CType("const GLuint *") java.lang.foreign.MemorySegment rc, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glReplacementCodeuiVertex3fvSUN)) { try {
            MH_glReplacementCodeuiVertex3fvSUN.invokeExact(PFN_glReplacementCodeuiVertex3fvSUN, rc, v);
        } catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiVertex3fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiVertex3fvSUN"); }
    }

    public void ReplacementCodeuiColor4ubVertex3fSUN(@CType("GLuint") int rc, @CType("GLubyte") byte r, @CType("GLubyte") byte g, @CType("GLubyte") byte b, @CType("GLubyte") byte a, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (!Unmarshal.isNullPointer(PFN_glReplacementCodeuiColor4ubVertex3fSUN)) { try {
            MH_glReplacementCodeuiColor4ubVertex3fSUN.invokeExact(PFN_glReplacementCodeuiColor4ubVertex3fSUN, rc, r, g, b, a, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiColor4ubVertex3fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiColor4ubVertex3fSUN"); }
    }

    public void ReplacementCodeuiColor4ubVertex3fvSUN(@CType("const GLuint *") java.lang.foreign.MemorySegment rc, @CType("const GLubyte *") java.lang.foreign.MemorySegment c, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glReplacementCodeuiColor4ubVertex3fvSUN)) { try {
            MH_glReplacementCodeuiColor4ubVertex3fvSUN.invokeExact(PFN_glReplacementCodeuiColor4ubVertex3fvSUN, rc, c, v);
        } catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiColor4ubVertex3fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiColor4ubVertex3fvSUN"); }
    }

    public void ReplacementCodeuiColor3fVertex3fSUN(@CType("GLuint") int rc, @CType("GLfloat") float r, @CType("GLfloat") float g, @CType("GLfloat") float b, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (!Unmarshal.isNullPointer(PFN_glReplacementCodeuiColor3fVertex3fSUN)) { try {
            MH_glReplacementCodeuiColor3fVertex3fSUN.invokeExact(PFN_glReplacementCodeuiColor3fVertex3fSUN, rc, r, g, b, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiColor3fVertex3fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiColor3fVertex3fSUN"); }
    }

    public void ReplacementCodeuiColor3fVertex3fvSUN(@CType("const GLuint *") java.lang.foreign.MemorySegment rc, @CType("const GLfloat *") java.lang.foreign.MemorySegment c, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glReplacementCodeuiColor3fVertex3fvSUN)) { try {
            MH_glReplacementCodeuiColor3fVertex3fvSUN.invokeExact(PFN_glReplacementCodeuiColor3fVertex3fvSUN, rc, c, v);
        } catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiColor3fVertex3fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiColor3fVertex3fvSUN"); }
    }

    public void ReplacementCodeuiNormal3fVertex3fSUN(@CType("GLuint") int rc, @CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (!Unmarshal.isNullPointer(PFN_glReplacementCodeuiNormal3fVertex3fSUN)) { try {
            MH_glReplacementCodeuiNormal3fVertex3fSUN.invokeExact(PFN_glReplacementCodeuiNormal3fVertex3fSUN, rc, nx, ny, nz, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiNormal3fVertex3fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiNormal3fVertex3fSUN"); }
    }

    public void ReplacementCodeuiNormal3fVertex3fvSUN(@CType("const GLuint *") java.lang.foreign.MemorySegment rc, @CType("const GLfloat *") java.lang.foreign.MemorySegment n, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glReplacementCodeuiNormal3fVertex3fvSUN)) { try {
            MH_glReplacementCodeuiNormal3fVertex3fvSUN.invokeExact(PFN_glReplacementCodeuiNormal3fVertex3fvSUN, rc, n, v);
        } catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiNormal3fVertex3fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiNormal3fVertex3fvSUN"); }
    }

    public void ReplacementCodeuiColor4fNormal3fVertex3fSUN(@CType("GLuint") int rc, @CType("GLfloat") float r, @CType("GLfloat") float g, @CType("GLfloat") float b, @CType("GLfloat") float a, @CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (!Unmarshal.isNullPointer(PFN_glReplacementCodeuiColor4fNormal3fVertex3fSUN)) { try {
            MH_glReplacementCodeuiColor4fNormal3fVertex3fSUN.invokeExact(PFN_glReplacementCodeuiColor4fNormal3fVertex3fSUN, rc, r, g, b, a, nx, ny, nz, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiColor4fNormal3fVertex3fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiColor4fNormal3fVertex3fSUN"); }
    }

    public void ReplacementCodeuiColor4fNormal3fVertex3fvSUN(@CType("const GLuint *") java.lang.foreign.MemorySegment rc, @CType("const GLfloat *") java.lang.foreign.MemorySegment c, @CType("const GLfloat *") java.lang.foreign.MemorySegment n, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glReplacementCodeuiColor4fNormal3fVertex3fvSUN)) { try {
            MH_glReplacementCodeuiColor4fNormal3fVertex3fvSUN.invokeExact(PFN_glReplacementCodeuiColor4fNormal3fVertex3fvSUN, rc, c, n, v);
        } catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiColor4fNormal3fVertex3fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiColor4fNormal3fVertex3fvSUN"); }
    }

    public void ReplacementCodeuiTexCoord2fVertex3fSUN(@CType("GLuint") int rc, @CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (!Unmarshal.isNullPointer(PFN_glReplacementCodeuiTexCoord2fVertex3fSUN)) { try {
            MH_glReplacementCodeuiTexCoord2fVertex3fSUN.invokeExact(PFN_glReplacementCodeuiTexCoord2fVertex3fSUN, rc, s, t, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiTexCoord2fVertex3fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fVertex3fSUN"); }
    }

    public void ReplacementCodeuiTexCoord2fVertex3fvSUN(@CType("const GLuint *") java.lang.foreign.MemorySegment rc, @CType("const GLfloat *") java.lang.foreign.MemorySegment tc, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glReplacementCodeuiTexCoord2fVertex3fvSUN)) { try {
            MH_glReplacementCodeuiTexCoord2fVertex3fvSUN.invokeExact(PFN_glReplacementCodeuiTexCoord2fVertex3fvSUN, rc, tc, v);
        } catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiTexCoord2fVertex3fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fVertex3fvSUN"); }
    }

    public void ReplacementCodeuiTexCoord2fNormal3fVertex3fSUN(@CType("GLuint") int rc, @CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (!Unmarshal.isNullPointer(PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN)) { try {
            MH_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN.invokeExact(PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN, rc, s, t, nx, ny, nz, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN"); }
    }

    public void ReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN(@CType("const GLuint *") java.lang.foreign.MemorySegment rc, @CType("const GLfloat *") java.lang.foreign.MemorySegment tc, @CType("const GLfloat *") java.lang.foreign.MemorySegment n, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN)) { try {
            MH_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN.invokeExact(PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN, rc, tc, n, v);
        } catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN"); }
    }

    public void ReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN(@CType("GLuint") int rc, @CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float r, @CType("GLfloat") float g, @CType("GLfloat") float b, @CType("GLfloat") float a, @CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (!Unmarshal.isNullPointer(PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN)) { try {
            MH_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN.invokeExact(PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN, rc, s, t, r, g, b, a, nx, ny, nz, x, y, z);
        } catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN"); }
    }

    public void ReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN(@CType("const GLuint *") java.lang.foreign.MemorySegment rc, @CType("const GLfloat *") java.lang.foreign.MemorySegment tc, @CType("const GLfloat *") java.lang.foreign.MemorySegment c, @CType("const GLfloat *") java.lang.foreign.MemorySegment n, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN)) { try {
            MH_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN.invokeExact(PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN, rc, tc, c, n, v);
        } catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN"); }
    }

}
