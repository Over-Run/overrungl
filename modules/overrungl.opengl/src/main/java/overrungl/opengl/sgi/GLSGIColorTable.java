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
package overrungl.opengl.sgi;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSGIColorTable {
    public static final int GL_COLOR_TABLE_SGI = 0x80D0;
    public static final int GL_POST_CONVOLUTION_COLOR_TABLE_SGI = 0x80D1;
    public static final int GL_POST_COLOR_MATRIX_COLOR_TABLE_SGI = 0x80D2;
    public static final int GL_PROXY_COLOR_TABLE_SGI = 0x80D3;
    public static final int GL_PROXY_POST_CONVOLUTION_COLOR_TABLE_SGI = 0x80D4;
    public static final int GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE_SGI = 0x80D5;
    public static final int GL_COLOR_TABLE_SCALE_SGI = 0x80D6;
    public static final int GL_COLOR_TABLE_BIAS_SGI = 0x80D7;
    public static final int GL_COLOR_TABLE_FORMAT_SGI = 0x80D8;
    public static final int GL_COLOR_TABLE_WIDTH_SGI = 0x80D9;
    public static final int GL_COLOR_TABLE_RED_SIZE_SGI = 0x80DA;
    public static final int GL_COLOR_TABLE_GREEN_SIZE_SGI = 0x80DB;
    public static final int GL_COLOR_TABLE_BLUE_SIZE_SGI = 0x80DC;
    public static final int GL_COLOR_TABLE_ALPHA_SIZE_SGI = 0x80DD;
    public static final int GL_COLOR_TABLE_LUMINANCE_SIZE_SGI = 0x80DE;
    public static final int GL_COLOR_TABLE_INTENSITY_SIZE_SGI = 0x80DF;
    public static final MethodHandle MH_glColorTableSGI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glColorTableSGI;
    public static final MethodHandle MH_glColorTableParameterfvSGI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glColorTableParameterfvSGI;
    public static final MethodHandle MH_glColorTableParameterivSGI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glColorTableParameterivSGI;
    public static final MethodHandle MH_glCopyColorTableSGI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCopyColorTableSGI;
    public static final MethodHandle MH_glGetColorTableSGI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetColorTableSGI;
    public static final MethodHandle MH_glGetColorTableParameterfvSGI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetColorTableParameterfvSGI;
    public static final MethodHandle MH_glGetColorTableParameterivSGI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetColorTableParameterivSGI;

    public GLSGIColorTable(overrungl.opengl.GLLoadFunc func) {
        PFN_glColorTableSGI = func.invoke("glColorTableSGI", "glColorTable");
        PFN_glColorTableParameterfvSGI = func.invoke("glColorTableParameterfvSGI", "glColorTableParameterfv");
        PFN_glColorTableParameterivSGI = func.invoke("glColorTableParameterivSGI", "glColorTableParameteriv");
        PFN_glCopyColorTableSGI = func.invoke("glCopyColorTableSGI", "glCopyColorTable");
        PFN_glGetColorTableSGI = func.invoke("glGetColorTableSGI");
        PFN_glGetColorTableParameterfvSGI = func.invoke("glGetColorTableParameterfvSGI");
        PFN_glGetColorTableParameterivSGI = func.invoke("glGetColorTableParameterivSGI");
    }

    public void ColorTableSGI(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment table) {
        if (!Unmarshal.isNullPointer(PFN_glColorTableSGI)) { try {
            MH_glColorTableSGI.invokeExact(PFN_glColorTableSGI, target, internalformat, width, format, type, table);
        } catch (Throwable e) { throw new RuntimeException("error in glColorTableSGI", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColorTableSGI"); }
    }

    public void ColorTableParameterfvSGI(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glColorTableParameterfvSGI)) { try {
            MH_glColorTableParameterfvSGI.invokeExact(PFN_glColorTableParameterfvSGI, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glColorTableParameterfvSGI", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColorTableParameterfvSGI"); }
    }

    public void ColorTableParameterivSGI(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glColorTableParameterivSGI)) { try {
            MH_glColorTableParameterivSGI.invokeExact(PFN_glColorTableParameterivSGI, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glColorTableParameterivSGI", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColorTableParameterivSGI"); }
    }

    public void CopyColorTableSGI(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width) {
        if (!Unmarshal.isNullPointer(PFN_glCopyColorTableSGI)) { try {
            MH_glCopyColorTableSGI.invokeExact(PFN_glCopyColorTableSGI, target, internalformat, x, y, width);
        } catch (Throwable e) { throw new RuntimeException("error in glCopyColorTableSGI", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCopyColorTableSGI"); }
    }

    public void GetColorTableSGI(@CType("GLenum") int target, @CType("GLenum") int format, @CType("GLenum") int type, @CType("void*") java.lang.foreign.MemorySegment table) {
        if (!Unmarshal.isNullPointer(PFN_glGetColorTableSGI)) { try {
            MH_glGetColorTableSGI.invokeExact(PFN_glGetColorTableSGI, target, format, type, table);
        } catch (Throwable e) { throw new RuntimeException("error in glGetColorTableSGI", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetColorTableSGI"); }
    }

    public void GetColorTableParameterfvSGI(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetColorTableParameterfvSGI)) { try {
            MH_glGetColorTableParameterfvSGI.invokeExact(PFN_glGetColorTableParameterfvSGI, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetColorTableParameterfvSGI", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetColorTableParameterfvSGI"); }
    }

    public void GetColorTableParameterivSGI(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetColorTableParameterivSGI)) { try {
            MH_glGetColorTableParameterivSGI.invokeExact(PFN_glGetColorTableParameterivSGI, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetColorTableParameterivSGI", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetColorTableParameterivSGI"); }
    }

}
