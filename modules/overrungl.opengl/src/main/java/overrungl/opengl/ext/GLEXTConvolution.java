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

public final class GLEXTConvolution {
    public static final int GL_CONVOLUTION_1D_EXT = 0x8010;
    public static final int GL_CONVOLUTION_2D_EXT = 0x8011;
    public static final int GL_SEPARABLE_2D_EXT = 0x8012;
    public static final int GL_CONVOLUTION_BORDER_MODE_EXT = 0x8013;
    public static final int GL_CONVOLUTION_FILTER_SCALE_EXT = 0x8014;
    public static final int GL_CONVOLUTION_FILTER_BIAS_EXT = 0x8015;
    public static final int GL_REDUCE_EXT = 0x8016;
    public static final int GL_CONVOLUTION_FORMAT_EXT = 0x8017;
    public static final int GL_CONVOLUTION_WIDTH_EXT = 0x8018;
    public static final int GL_CONVOLUTION_HEIGHT_EXT = 0x8019;
    public static final int GL_MAX_CONVOLUTION_WIDTH_EXT = 0x801A;
    public static final int GL_MAX_CONVOLUTION_HEIGHT_EXT = 0x801B;
    public static final int GL_POST_CONVOLUTION_RED_SCALE_EXT = 0x801C;
    public static final int GL_POST_CONVOLUTION_GREEN_SCALE_EXT = 0x801D;
    public static final int GL_POST_CONVOLUTION_BLUE_SCALE_EXT = 0x801E;
    public static final int GL_POST_CONVOLUTION_ALPHA_SCALE_EXT = 0x801F;
    public static final int GL_POST_CONVOLUTION_RED_BIAS_EXT = 0x8020;
    public static final int GL_POST_CONVOLUTION_GREEN_BIAS_EXT = 0x8021;
    public static final int GL_POST_CONVOLUTION_BLUE_BIAS_EXT = 0x8022;
    public static final int GL_POST_CONVOLUTION_ALPHA_BIAS_EXT = 0x8023;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glConvolutionFilter1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glConvolutionFilter2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glConvolutionParameterfEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glConvolutionParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glConvolutionParameteriEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glConvolutionParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCopyConvolutionFilter1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCopyConvolutionFilter2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetConvolutionFilterEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetConvolutionParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetConvolutionParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetSeparableFilterEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSeparableFilter2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glConvolutionFilter1DEXT;
        public final MemorySegment PFN_glConvolutionFilter2DEXT;
        public final MemorySegment PFN_glConvolutionParameterfEXT;
        public final MemorySegment PFN_glConvolutionParameterfvEXT;
        public final MemorySegment PFN_glConvolutionParameteriEXT;
        public final MemorySegment PFN_glConvolutionParameterivEXT;
        public final MemorySegment PFN_glCopyConvolutionFilter1DEXT;
        public final MemorySegment PFN_glCopyConvolutionFilter2DEXT;
        public final MemorySegment PFN_glGetConvolutionFilterEXT;
        public final MemorySegment PFN_glGetConvolutionParameterfvEXT;
        public final MemorySegment PFN_glGetConvolutionParameterivEXT;
        public final MemorySegment PFN_glGetSeparableFilterEXT;
        public final MemorySegment PFN_glSeparableFilter2DEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glConvolutionFilter1DEXT = func.invoke("glConvolutionFilter1DEXT", "glConvolutionFilter1D");
            PFN_glConvolutionFilter2DEXT = func.invoke("glConvolutionFilter2DEXT", "glConvolutionFilter2D");
            PFN_glConvolutionParameterfEXT = func.invoke("glConvolutionParameterfEXT", "glConvolutionParameterf");
            PFN_glConvolutionParameterfvEXT = func.invoke("glConvolutionParameterfvEXT", "glConvolutionParameterfv");
            PFN_glConvolutionParameteriEXT = func.invoke("glConvolutionParameteriEXT", "glConvolutionParameteri");
            PFN_glConvolutionParameterivEXT = func.invoke("glConvolutionParameterivEXT", "glConvolutionParameteriv");
            PFN_glCopyConvolutionFilter1DEXT = func.invoke("glCopyConvolutionFilter1DEXT", "glCopyConvolutionFilter1D");
            PFN_glCopyConvolutionFilter2DEXT = func.invoke("glCopyConvolutionFilter2DEXT", "glCopyConvolutionFilter2D");
            PFN_glGetConvolutionFilterEXT = func.invoke("glGetConvolutionFilterEXT");
            PFN_glGetConvolutionParameterfvEXT = func.invoke("glGetConvolutionParameterfvEXT");
            PFN_glGetConvolutionParameterivEXT = func.invoke("glGetConvolutionParameterivEXT");
            PFN_glGetSeparableFilterEXT = func.invoke("glGetSeparableFilterEXT");
            PFN_glSeparableFilter2DEXT = func.invoke("glSeparableFilter2DEXT", "glSeparableFilter2D");
        }
    }

    public GLEXTConvolution(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void ConvolutionFilter1DEXT(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") MemorySegment image) {
        if (Unmarshal.isNullPointer(handles.PFN_glConvolutionFilter1DEXT)) throw new SymbolNotFoundError("Symbol not found: glConvolutionFilter1DEXT");
        try { Handles.MH_glConvolutionFilter1DEXT.invokeExact(handles.PFN_glConvolutionFilter1DEXT, target, internalformat, width, format, type, image); }
        catch (Throwable e) { throw new RuntimeException("error in glConvolutionFilter1DEXT", e); }
    }

    public void ConvolutionFilter2DEXT(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") MemorySegment image) {
        if (Unmarshal.isNullPointer(handles.PFN_glConvolutionFilter2DEXT)) throw new SymbolNotFoundError("Symbol not found: glConvolutionFilter2DEXT");
        try { Handles.MH_glConvolutionFilter2DEXT.invokeExact(handles.PFN_glConvolutionFilter2DEXT, target, internalformat, width, height, format, type, image); }
        catch (Throwable e) { throw new RuntimeException("error in glConvolutionFilter2DEXT", e); }
    }

    public void ConvolutionParameterfEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat") float params) {
        if (Unmarshal.isNullPointer(handles.PFN_glConvolutionParameterfEXT)) throw new SymbolNotFoundError("Symbol not found: glConvolutionParameterfEXT");
        try { Handles.MH_glConvolutionParameterfEXT.invokeExact(handles.PFN_glConvolutionParameterfEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glConvolutionParameterfEXT", e); }
    }

    public void ConvolutionParameterfvEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfloat *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glConvolutionParameterfvEXT)) throw new SymbolNotFoundError("Symbol not found: glConvolutionParameterfvEXT");
        try { Handles.MH_glConvolutionParameterfvEXT.invokeExact(handles.PFN_glConvolutionParameterfvEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glConvolutionParameterfvEXT", e); }
    }

    public void ConvolutionParameteriEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint") int params) {
        if (Unmarshal.isNullPointer(handles.PFN_glConvolutionParameteriEXT)) throw new SymbolNotFoundError("Symbol not found: glConvolutionParameteriEXT");
        try { Handles.MH_glConvolutionParameteriEXT.invokeExact(handles.PFN_glConvolutionParameteriEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glConvolutionParameteriEXT", e); }
    }

    public void ConvolutionParameterivEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glConvolutionParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glConvolutionParameterivEXT");
        try { Handles.MH_glConvolutionParameterivEXT.invokeExact(handles.PFN_glConvolutionParameterivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glConvolutionParameterivEXT", e); }
    }

    public void CopyConvolutionFilter1DEXT(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyConvolutionFilter1DEXT)) throw new SymbolNotFoundError("Symbol not found: glCopyConvolutionFilter1DEXT");
        try { Handles.MH_glCopyConvolutionFilter1DEXT.invokeExact(handles.PFN_glCopyConvolutionFilter1DEXT, target, internalformat, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyConvolutionFilter1DEXT", e); }
    }

    public void CopyConvolutionFilter2DEXT(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyConvolutionFilter2DEXT)) throw new SymbolNotFoundError("Symbol not found: glCopyConvolutionFilter2DEXT");
        try { Handles.MH_glCopyConvolutionFilter2DEXT.invokeExact(handles.PFN_glCopyConvolutionFilter2DEXT, target, internalformat, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyConvolutionFilter2DEXT", e); }
    }

    public void GetConvolutionFilterEXT(@CType("GLenum") int target, @CType("GLenum") int format, @CType("GLenum") int type, @CType("void*") MemorySegment image) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetConvolutionFilterEXT)) throw new SymbolNotFoundError("Symbol not found: glGetConvolutionFilterEXT");
        try { Handles.MH_glGetConvolutionFilterEXT.invokeExact(handles.PFN_glGetConvolutionFilterEXT, target, format, type, image); }
        catch (Throwable e) { throw new RuntimeException("error in glGetConvolutionFilterEXT", e); }
    }

    public void GetConvolutionParameterfvEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetConvolutionParameterfvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetConvolutionParameterfvEXT");
        try { Handles.MH_glGetConvolutionParameterfvEXT.invokeExact(handles.PFN_glGetConvolutionParameterfvEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetConvolutionParameterfvEXT", e); }
    }

    public void GetConvolutionParameterivEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetConvolutionParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetConvolutionParameterivEXT");
        try { Handles.MH_glGetConvolutionParameterivEXT.invokeExact(handles.PFN_glGetConvolutionParameterivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetConvolutionParameterivEXT", e); }
    }

    public void GetSeparableFilterEXT(@CType("GLenum") int target, @CType("GLenum") int format, @CType("GLenum") int type, @CType("void*") MemorySegment row, @CType("void*") MemorySegment column, @CType("void*") MemorySegment span) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetSeparableFilterEXT)) throw new SymbolNotFoundError("Symbol not found: glGetSeparableFilterEXT");
        try { Handles.MH_glGetSeparableFilterEXT.invokeExact(handles.PFN_glGetSeparableFilterEXT, target, format, type, row, column, span); }
        catch (Throwable e) { throw new RuntimeException("error in glGetSeparableFilterEXT", e); }
    }

    public void SeparableFilter2DEXT(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") MemorySegment row, @CType("const void *") MemorySegment column) {
        if (Unmarshal.isNullPointer(handles.PFN_glSeparableFilter2DEXT)) throw new SymbolNotFoundError("Symbol not found: glSeparableFilter2DEXT");
        try { Handles.MH_glSeparableFilter2DEXT.invokeExact(handles.PFN_glSeparableFilter2DEXT, target, internalformat, width, height, format, type, row, column); }
        catch (Throwable e) { throw new RuntimeException("error in glSeparableFilter2DEXT", e); }
    }

}
