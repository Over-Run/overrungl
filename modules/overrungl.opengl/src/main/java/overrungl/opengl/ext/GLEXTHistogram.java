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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTHistogram {
    public static final int GL_HISTOGRAM_EXT = 0x8024;
    public static final int GL_PROXY_HISTOGRAM_EXT = 0x8025;
    public static final int GL_HISTOGRAM_WIDTH_EXT = 0x8026;
    public static final int GL_HISTOGRAM_FORMAT_EXT = 0x8027;
    public static final int GL_HISTOGRAM_RED_SIZE_EXT = 0x8028;
    public static final int GL_HISTOGRAM_GREEN_SIZE_EXT = 0x8029;
    public static final int GL_HISTOGRAM_BLUE_SIZE_EXT = 0x802A;
    public static final int GL_HISTOGRAM_ALPHA_SIZE_EXT = 0x802B;
    public static final int GL_HISTOGRAM_LUMINANCE_SIZE_EXT = 0x802C;
    public static final int GL_HISTOGRAM_SINK_EXT = 0x802D;
    public static final int GL_MINMAX_EXT = 0x802E;
    public static final int GL_MINMAX_FORMAT_EXT = 0x802F;
    public static final int GL_MINMAX_SINK_EXT = 0x8030;
    public static final int GL_TABLE_TOO_LARGE_EXT = 0x8031;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glGetHistogramEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetHistogramParameterfvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetHistogramParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMinmaxEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMinmaxParameterfvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMinmaxParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glHistogramEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glMinmaxEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glResetHistogramEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glResetMinmaxEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glGetHistogramEXT,
            FD_glGetHistogramParameterfvEXT,
            FD_glGetHistogramParameterivEXT,
            FD_glGetMinmaxEXT,
            FD_glGetMinmaxParameterfvEXT,
            FD_glGetMinmaxParameterivEXT,
            FD_glHistogramEXT,
            FD_glMinmaxEXT,
            FD_glResetHistogramEXT,
            FD_glResetMinmaxEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glGetHistogramEXT = RuntimeHelper.downcall(Descriptors.FD_glGetHistogramEXT);
        public static final MethodHandle MH_glGetHistogramParameterfvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetHistogramParameterfvEXT);
        public static final MethodHandle MH_glGetHistogramParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetHistogramParameterivEXT);
        public static final MethodHandle MH_glGetMinmaxEXT = RuntimeHelper.downcall(Descriptors.FD_glGetMinmaxEXT);
        public static final MethodHandle MH_glGetMinmaxParameterfvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetMinmaxParameterfvEXT);
        public static final MethodHandle MH_glGetMinmaxParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetMinmaxParameterivEXT);
        public static final MethodHandle MH_glHistogramEXT = RuntimeHelper.downcall(Descriptors.FD_glHistogramEXT);
        public static final MethodHandle MH_glMinmaxEXT = RuntimeHelper.downcall(Descriptors.FD_glMinmaxEXT);
        public static final MethodHandle MH_glResetHistogramEXT = RuntimeHelper.downcall(Descriptors.FD_glResetHistogramEXT);
        public static final MethodHandle MH_glResetMinmaxEXT = RuntimeHelper.downcall(Descriptors.FD_glResetMinmaxEXT);
        public final MemorySegment PFN_glGetHistogramEXT;
        public final MemorySegment PFN_glGetHistogramParameterfvEXT;
        public final MemorySegment PFN_glGetHistogramParameterivEXT;
        public final MemorySegment PFN_glGetMinmaxEXT;
        public final MemorySegment PFN_glGetMinmaxParameterfvEXT;
        public final MemorySegment PFN_glGetMinmaxParameterivEXT;
        public final MemorySegment PFN_glHistogramEXT;
        public final MemorySegment PFN_glMinmaxEXT;
        public final MemorySegment PFN_glResetHistogramEXT;
        public final MemorySegment PFN_glResetMinmaxEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGetHistogramEXT = func.invoke("glGetHistogramEXT");
            PFN_glGetHistogramParameterfvEXT = func.invoke("glGetHistogramParameterfvEXT");
            PFN_glGetHistogramParameterivEXT = func.invoke("glGetHistogramParameterivEXT");
            PFN_glGetMinmaxEXT = func.invoke("glGetMinmaxEXT");
            PFN_glGetMinmaxParameterfvEXT = func.invoke("glGetMinmaxParameterfvEXT");
            PFN_glGetMinmaxParameterivEXT = func.invoke("glGetMinmaxParameterivEXT");
            PFN_glHistogramEXT = func.invoke("glHistogramEXT", "glHistogram");
            PFN_glMinmaxEXT = func.invoke("glMinmaxEXT", "glMinmax");
            PFN_glResetHistogramEXT = func.invoke("glResetHistogramEXT", "glResetHistogram");
            PFN_glResetMinmaxEXT = func.invoke("glResetMinmaxEXT", "glResetMinmax");
        }
    }

    public GLEXTHistogram(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void GetHistogramEXT(@CType("GLenum") int target, @CType("GLboolean") boolean reset, @CType("GLenum") int format, @CType("GLenum") int type, @CType("void*") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetHistogramEXT)) throw new SymbolNotFoundError("Symbol not found: glGetHistogramEXT");
        try { Handles.MH_glGetHistogramEXT.invokeExact(handles.PFN_glGetHistogramEXT, target, reset, format, type, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetHistogramEXT", e); }
    }

    public void GetHistogramParameterfvEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetHistogramParameterfvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetHistogramParameterfvEXT");
        try { Handles.MH_glGetHistogramParameterfvEXT.invokeExact(handles.PFN_glGetHistogramParameterfvEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetHistogramParameterfvEXT", e); }
    }

    public void GetHistogramParameterivEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetHistogramParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetHistogramParameterivEXT");
        try { Handles.MH_glGetHistogramParameterivEXT.invokeExact(handles.PFN_glGetHistogramParameterivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetHistogramParameterivEXT", e); }
    }

    public void GetMinmaxEXT(@CType("GLenum") int target, @CType("GLboolean") boolean reset, @CType("GLenum") int format, @CType("GLenum") int type, @CType("void*") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMinmaxEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMinmaxEXT");
        try { Handles.MH_glGetMinmaxEXT.invokeExact(handles.PFN_glGetMinmaxEXT, target, reset, format, type, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMinmaxEXT", e); }
    }

    public void GetMinmaxParameterfvEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMinmaxParameterfvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMinmaxParameterfvEXT");
        try { Handles.MH_glGetMinmaxParameterfvEXT.invokeExact(handles.PFN_glGetMinmaxParameterfvEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMinmaxParameterfvEXT", e); }
    }

    public void GetMinmaxParameterivEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMinmaxParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMinmaxParameterivEXT");
        try { Handles.MH_glGetMinmaxParameterivEXT.invokeExact(handles.PFN_glGetMinmaxParameterivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMinmaxParameterivEXT", e); }
    }

    public void HistogramEXT(@CType("GLenum") int target, @CType("GLsizei") int width, @CType("GLenum") int internalformat, @CType("GLboolean") boolean sink) {
        if (Unmarshal.isNullPointer(handles.PFN_glHistogramEXT)) throw new SymbolNotFoundError("Symbol not found: glHistogramEXT");
        try { Handles.MH_glHistogramEXT.invokeExact(handles.PFN_glHistogramEXT, target, width, internalformat, sink); }
        catch (Throwable e) { throw new RuntimeException("error in glHistogramEXT", e); }
    }

    public void MinmaxEXT(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLboolean") boolean sink) {
        if (Unmarshal.isNullPointer(handles.PFN_glMinmaxEXT)) throw new SymbolNotFoundError("Symbol not found: glMinmaxEXT");
        try { Handles.MH_glMinmaxEXT.invokeExact(handles.PFN_glMinmaxEXT, target, internalformat, sink); }
        catch (Throwable e) { throw new RuntimeException("error in glMinmaxEXT", e); }
    }

    public void ResetHistogramEXT(@CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(handles.PFN_glResetHistogramEXT)) throw new SymbolNotFoundError("Symbol not found: glResetHistogramEXT");
        try { Handles.MH_glResetHistogramEXT.invokeExact(handles.PFN_glResetHistogramEXT, target); }
        catch (Throwable e) { throw new RuntimeException("error in glResetHistogramEXT", e); }
    }

    public void ResetMinmaxEXT(@CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(handles.PFN_glResetMinmaxEXT)) throw new SymbolNotFoundError("Symbol not found: glResetMinmaxEXT");
        try { Handles.MH_glResetMinmaxEXT.invokeExact(handles.PFN_glResetMinmaxEXT, target); }
        catch (Throwable e) { throw new RuntimeException("error in glResetMinmaxEXT", e); }
    }

}
